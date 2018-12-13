/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */
package com.microsoft.azure.v2.management.sql.implementation;

import com.microsoft.azure.management.apigeneration.LangDefinition;
import com.microsoft.azure.v2.management.resources.fluentcore.arm.models.implementation.ExternalChildResourceImpl;
import com.microsoft.azure.v2.management.sql.SqlServer;
import com.microsoft.azure.v2.management.sql.SqlServerKey;
import com.microsoft.azure.v2.management.sql.SqlServerKeyOperations;
import io.reactivex.Completable;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * Implementation for SQL Server Key operations.
 */
@LangDefinition
public class SqlServerKeyOperationsImpl
    extends
        SqlChildrenOperationsImpl<SqlServerKey>
    implements
        SqlServerKeyOperations,
        SqlServerKeyOperations.SqlServerKeyActionsDefinition {

    SqlServerKeyOperationsImpl(SqlServer parent, SqlServerManager sqlServerManager) {
        super(parent, sqlServerManager);
        Objects.requireNonNull(parent);
    }

    SqlServerKeyOperationsImpl(SqlServerManager sqlServerManager) {
        super(null, sqlServerManager);
    }

    @Override
    public SqlServerKey getBySqlServer(String resourceGroupName, String sqlServerName, String name) {
        ServerKeyInner serverKeyInner = this.sqlServerManager.inner().serverKeys()
            .get(resourceGroupName, sqlServerName, name);
        return serverKeyInner != null ? new SqlServerKeyImpl(resourceGroupName, sqlServerName, name, serverKeyInner, this.sqlServerManager) : null;
    }

    @Override
    public Observable<SqlServerKey> getBySqlServerAsync(final String resourceGroupName, final String sqlServerName, final String name) {
        final SqlServerKeyOperationsImpl self = this;
        return this.sqlServerManager.inner().serverKeys()
                .getAsync(resourceGroupName, sqlServerName, name)
                .map(serverKeyInner -> (SqlServerKey) new SqlServerKeyImpl(resourceGroupName, sqlServerName, name, serverKeyInner, self.sqlServerManager))
                .toObservable();
    }

    @Override
    public SqlServerKey getBySqlServer(final SqlServer sqlServer, final String name) {
        Objects.requireNonNull(sqlServer);
        ServerKeyInner serverKeyInner = sqlServer.manager().inner().serverKeys()
            .get(sqlServer.resourceGroupName(), sqlServer.name(), name);
        return serverKeyInner != null ? new SqlServerKeyImpl(name, (SqlServerImpl) sqlServer, serverKeyInner, sqlServer.manager()) : null;
    }

    @Override
    public Observable<SqlServerKey> getBySqlServerAsync(final SqlServer sqlServer, final String name) {
        Objects.requireNonNull(sqlServer);
        return sqlServer.manager().inner().serverKeys()
                .getAsync(sqlServer.resourceGroupName(), sqlServer.name(), name)
                .map(serverKeyInner -> (SqlServerKey) new SqlServerKeyImpl(name, (SqlServerImpl) sqlServer, serverKeyInner, sqlServer.manager()))
                .toObservable();
    }

    @Override
    public void deleteBySqlServer(String resourceGroupName, String sqlServerName, String name) {
        this.sqlServerManager.inner().serverKeys().delete(resourceGroupName, sqlServerName, name);
    }

    @Override
    public Completable deleteBySqlServerAsync(String resourceGroupName, String sqlServerName, String name) {
        return this.sqlServerManager.inner().serverKeys().deleteAsync(resourceGroupName, sqlServerName, name);
    }

    @Override
    public List<SqlServerKey> listBySqlServer(String resourceGroupName, String sqlServerName) {
        List<SqlServerKey> serverKeys = new ArrayList<>();
        List<ServerKeyInner> serverKeyInners = this.sqlServerManager.inner().serverKeys()
            .listByServer(resourceGroupName, sqlServerName);
        if (serverKeyInners != null) {
            for (ServerKeyInner inner : serverKeyInners) {
                serverKeys.add(new SqlServerKeyImpl(resourceGroupName, sqlServerName, inner.name(), inner, this.sqlServerManager));
            }
        }
        return Collections.unmodifiableList(serverKeys);
    }

    @Override
    public Observable<SqlServerKey> listBySqlServerAsync(final String resourceGroupName, final String sqlServerName) {
        final SqlServerKeyOperationsImpl self = this;
        return this.sqlServerManager.inner().serverKeys()
            .listByServerAsync(resourceGroupName, sqlServerName)
            .flatMap(serverKeyInnerPage -> Observable.fromIterable(serverKeyInnerPage.items()))
            .map(serverKeyInner -> new SqlServerKeyImpl(resourceGroupName, sqlServerName, serverKeyInner.name(), serverKeyInner, self.sqlServerManager));
    }

    @Override
    public List<SqlServerKey> listBySqlServer(final SqlServer sqlServer) {
        Objects.requireNonNull(sqlServer);
        List<SqlServerKey> serverKeys = new ArrayList<>();
        List<ServerKeyInner> serverKeyInners = sqlServer.manager().inner().serverKeys()
            .listByServer(sqlServer.resourceGroupName(), sqlServer.name());
        if (serverKeyInners != null) {
            for (ServerKeyInner inner : serverKeyInners) {
                serverKeys.add(new SqlServerKeyImpl(inner.name(), (SqlServerImpl) sqlServer, inner, sqlServer.manager()));
            }
        }
        return Collections.unmodifiableList(serverKeys);
    }

    @Override
    public Observable<SqlServerKey> listBySqlServerAsync(final SqlServer sqlServer) {
        Objects.requireNonNull(sqlServer);
        return sqlServer.manager().inner().serverKeys()
            .listByServerAsync(sqlServer.resourceGroupName(), sqlServer.name())
            .flatMap(serverKeyInnerPage -> Observable.fromIterable(serverKeyInnerPage.items()))
            .map(serverKeyInner -> new SqlServerKeyImpl(serverKeyInner.name(), (SqlServerImpl) sqlServer, serverKeyInner, sqlServer.manager()));
    }

    @Override
    public SqlServerKeyImpl define() {
        SqlServerKeyImpl result = new SqlServerKeyImpl("", new ServerKeyInner(), this.sqlServerManager);
        result.setPendingOperation(ExternalChildResourceImpl.PendingOperation.ToBeCreated);
        return (this.sqlServer != null) ? result.withExistingSqlServer(this.sqlServer) : result;
    }
}
