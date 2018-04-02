/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.keyvault.implementation;

import com.microsoft.azure.Page;
import com.microsoft.azure.management.resources.fluentcore.model.implementation.WrapperImpl;
import com.microsoft.azure.management.keyvault.DeletedVaults;
import com.microsoft.azure.management.keyvault.DeletedVault;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;

class DeletedVaultsImpl extends WrapperImpl<VaultsInner> implements DeletedVaults {
    private final KeyVaultManager manager;

    DeletedVaultsImpl(KeyVaultManager manager) {
        super(manager.inner().vaults());
        this.manager = manager;
    }

    public KeyVaultManager manager() {
        return this.manager;
    }

    private Observable<Page<DeletedVaultInner>> listDeletedNextInnerPageAsync(String nextLink) {
        if (nextLink == null) {
            Observable.empty();
        }
        VaultsInner client = this.inner();
        return client.listDeletedNextAsync(nextLink)
                .flatMap(new Func1<Page<DeletedVaultInner>, Observable<Page<DeletedVaultInner>>>() {
                    @Override
                    public Observable<Page<DeletedVaultInner>> call(Page<DeletedVaultInner> page) {
                        return Observable.just(page).concatWith(listDeletedNextInnerPageAsync(page.nextPageLink()));
                    }
                });
    }
    @Override
    public Observable<DeletedVault> listDeletedAsync() {
        VaultsInner client = this.inner();
        return client.listDeletedAsync()
                .flatMap(new Func1<Page<DeletedVaultInner>, Observable<Page<DeletedVaultInner>>>() {
                    @Override
                    public Observable<Page<DeletedVaultInner>> call(Page<DeletedVaultInner> page) {
                        return listDeletedNextInnerPageAsync(page.nextPageLink());
                    }
                })
                .flatMapIterable(new Func1<Page<DeletedVaultInner>, Iterable<DeletedVaultInner>>() {
                    @Override
                    public Iterable<DeletedVaultInner> call(Page<DeletedVaultInner> page) {
                        return page.items();
                    }
                })
                .map(new Func1<DeletedVaultInner, DeletedVault>() {
                    @Override
                    public DeletedVault call(DeletedVaultInner inner) {
                        return new DeletedVaultImpl(inner);
                    }
                });
    }

    @Override
    public Observable<DeletedVault> getDeletedAsync(String vaultName, String location) {
        VaultsInner client = this.inner();
        return client.getDeletedAsync(vaultName, location)
        .map(new Func1<DeletedVaultInner, DeletedVault>() {
            @Override
            public DeletedVault call(DeletedVaultInner inner) {
                return new DeletedVaultImpl(inner);
            }
        });
    }
    @Override
    public Completable purgeDeletedAsync(String vaultName, String location) {
        VaultsInner client = this.inner();
        return client.purgeDeletedAsync(vaultName, location).toCompletable();
    }

}