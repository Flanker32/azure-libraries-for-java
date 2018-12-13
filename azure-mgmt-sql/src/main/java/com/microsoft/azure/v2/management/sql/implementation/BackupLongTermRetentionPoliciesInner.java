/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.v2.management.sql.implementation;

import com.microsoft.azure.v2.AzureProxy;
import com.microsoft.azure.v2.CloudException;
import com.microsoft.azure.v2.OperationStatus;
import com.microsoft.azure.v2.util.ServiceFutureUtil;
import com.microsoft.rest.v2.BodyResponse;
import com.microsoft.rest.v2.OperationDescription;
import com.microsoft.rest.v2.ServiceCallback;
import com.microsoft.rest.v2.ServiceFuture;
import com.microsoft.rest.v2.Validator;
import com.microsoft.rest.v2.annotations.BodyParam;
import com.microsoft.rest.v2.annotations.ExpectedResponses;
import com.microsoft.rest.v2.annotations.GET;
import com.microsoft.rest.v2.annotations.HeaderParam;
import com.microsoft.rest.v2.annotations.Host;
import com.microsoft.rest.v2.annotations.PathParam;
import com.microsoft.rest.v2.annotations.PUT;
import com.microsoft.rest.v2.annotations.QueryParam;
import com.microsoft.rest.v2.annotations.ResumeOperation;
import com.microsoft.rest.v2.annotations.UnexpectedResponseExceptionType;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.annotations.NonNull;
import java.util.List;

/**
 * An instance of this class provides access to all the operations defined in
 * BackupLongTermRetentionPolicies.
 */
public final class BackupLongTermRetentionPoliciesInner {
    /**
     * The proxy service used to perform REST calls.
     */
    private BackupLongTermRetentionPoliciesService service;

    /**
     * The service client containing this operation class.
     */
    private SqlManagementClientImpl client;

    /**
     * Initializes an instance of BackupLongTermRetentionPoliciesInner.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public BackupLongTermRetentionPoliciesInner(SqlManagementClientImpl client) {
        this.service = AzureProxy.create(BackupLongTermRetentionPoliciesService.class, client);
        this.client = client;
    }

    /**
     * The interface defining all the services for
     * BackupLongTermRetentionPolicies to be used by the proxy service to
     * perform REST calls.
     */
    @Host("https://management.azure.com")
    private interface BackupLongTermRetentionPoliciesService {
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/databases/{databaseName}/backupLongTermRetentionPolicies/{backupLongTermRetentionPolicyName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Single<BodyResponse<BackupLongTermRetentionPolicyInner>> get(@PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serverName") String serverName, @PathParam("databaseName") String databaseName, @PathParam("backupLongTermRetentionPolicyName") String backupLongTermRetentionPolicyName, @QueryParam("api-version") String apiVersion, @HeaderParam("accept-language") String acceptLanguage);

        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/databases/{databaseName}/backupLongTermRetentionPolicies/{backupLongTermRetentionPolicyName}")
        @ExpectedResponses({200, 201, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        Observable<OperationStatus<BackupLongTermRetentionPolicyInner>> beginCreateOrUpdate(@PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serverName") String serverName, @PathParam("databaseName") String databaseName, @PathParam("backupLongTermRetentionPolicyName") String backupLongTermRetentionPolicyName, @QueryParam("api-version") String apiVersion, @BodyParam("application/json; charset=utf-8") BackupLongTermRetentionPolicyInner parameters, @HeaderParam("accept-language") String acceptLanguage);

        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/databases/{databaseName}/backupLongTermRetentionPolicies/{backupLongTermRetentionPolicyName}")
        @ExpectedResponses({200, 201, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        Single<BodyResponse<BackupLongTermRetentionPolicyInner>> createOrUpdate(@PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serverName") String serverName, @PathParam("databaseName") String databaseName, @PathParam("backupLongTermRetentionPolicyName") String backupLongTermRetentionPolicyName, @QueryParam("api-version") String apiVersion, @BodyParam("application/json; charset=utf-8") BackupLongTermRetentionPolicyInner parameters, @HeaderParam("accept-language") String acceptLanguage);

        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/databases/{databaseName}/backupLongTermRetentionPolicies/{backupLongTermRetentionPolicyName}")
        @ExpectedResponses({200, 201, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        @ResumeOperation
        Observable<OperationStatus<BackupLongTermRetentionPolicyInner>> resumeCreateOrUpdate(OperationDescription operationDescription);

        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/databases/{databaseName}/backupLongTermRetentionPolicies")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Single<BodyResponse<List<BackupLongTermRetentionPolicyInner>>> listByDatabase(@PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serverName") String serverName, @PathParam("databaseName") String databaseName, @QueryParam("api-version") String apiVersion, @HeaderParam("accept-language") String acceptLanguage);
    }

    /**
     * Returns a database backup long term retention policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the BackupLongTermRetentionPolicyInner object if successful.
     */
    public BackupLongTermRetentionPolicyInner get(@NonNull String resourceGroupName, @NonNull String serverName, @NonNull String databaseName) {
        return getAsync(resourceGroupName, serverName, databaseName).blockingGet();
    }

    /**
     * Returns a database backup long term retention policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<BackupLongTermRetentionPolicyInner> getAsync(@NonNull String resourceGroupName, @NonNull String serverName, @NonNull String databaseName, ServiceCallback<BackupLongTermRetentionPolicyInner> serviceCallback) {
        return ServiceFuture.fromBody(getAsync(resourceGroupName, serverName, databaseName), serviceCallback);
    }

    /**
     * Returns a database backup long term retention policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Single<BodyResponse<BackupLongTermRetentionPolicyInner>> getWithRestResponseAsync(@NonNull String resourceGroupName, @NonNull String serverName, @NonNull String databaseName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serverName == null) {
            throw new IllegalArgumentException("Parameter serverName is required and cannot be null.");
        }
        if (databaseName == null) {
            throw new IllegalArgumentException("Parameter databaseName is required and cannot be null.");
        }
        final String backupLongTermRetentionPolicyName = "Default";
        final String apiVersion = "2014-04-01";
        return service.get(this.client.subscriptionId(), resourceGroupName, serverName, databaseName, backupLongTermRetentionPolicyName, apiVersion, this.client.acceptLanguage());
    }

    /**
     * Returns a database backup long term retention policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Maybe<BackupLongTermRetentionPolicyInner> getAsync(@NonNull String resourceGroupName, @NonNull String serverName, @NonNull String databaseName) {
        return getWithRestResponseAsync(resourceGroupName, serverName, databaseName)
            .flatMapMaybe((BodyResponse<BackupLongTermRetentionPolicyInner> res) -> res.body() == null ? Maybe.empty() : Maybe.just(res.body()));
    }

    /**
     * Creates or updates a database backup long term retention policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param parameters The required parameters to update a backup long term retention policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the BackupLongTermRetentionPolicyInner object if successful.
     */
    public BackupLongTermRetentionPolicyInner beginCreateOrUpdate(@NonNull String resourceGroupName, @NonNull String serverName, @NonNull String databaseName, @NonNull BackupLongTermRetentionPolicyInner parameters) {
        return beginCreateOrUpdateAsync(resourceGroupName, serverName, databaseName, parameters).blockingLast().result();
    }

    /**
     * Creates or updates a database backup long term retention policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param parameters The required parameters to update a backup long term retention policy.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the ServiceFuture&lt;BackupLongTermRetentionPolicyInner&gt; object.
     */
    public ServiceFuture<BackupLongTermRetentionPolicyInner> beginCreateOrUpdateAsync(@NonNull String resourceGroupName, @NonNull String serverName, @NonNull String databaseName, @NonNull BackupLongTermRetentionPolicyInner parameters, ServiceCallback<BackupLongTermRetentionPolicyInner> serviceCallback) {
        return ServiceFutureUtil.fromLRO(beginCreateOrUpdateAsync(resourceGroupName, serverName, databaseName, parameters), serviceCallback);
    }

    /**
     * Creates or updates a database backup long term retention policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param parameters The required parameters to update a backup long term retention policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the observable for the request.
     */
    public Observable<OperationStatus<BackupLongTermRetentionPolicyInner>> beginCreateOrUpdateAsync(@NonNull String resourceGroupName, @NonNull String serverName, @NonNull String databaseName, @NonNull BackupLongTermRetentionPolicyInner parameters) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serverName == null) {
            throw new IllegalArgumentException("Parameter serverName is required and cannot be null.");
        }
        if (databaseName == null) {
            throw new IllegalArgumentException("Parameter databaseName is required and cannot be null.");
        }
        if (parameters == null) {
            throw new IllegalArgumentException("Parameter parameters is required and cannot be null.");
        }
        Validator.validate(parameters);
        final String backupLongTermRetentionPolicyName = "Default";
        final String apiVersion = "2014-04-01";
        return service.beginCreateOrUpdate(this.client.subscriptionId(), resourceGroupName, serverName, databaseName, backupLongTermRetentionPolicyName, apiVersion, parameters, this.client.acceptLanguage());
    }

    /**
     * Creates or updates a database backup long term retention policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param parameters The required parameters to update a backup long term retention policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the BackupLongTermRetentionPolicyInner object if successful.
     */
    public BackupLongTermRetentionPolicyInner createOrUpdate(@NonNull String resourceGroupName, @NonNull String serverName, @NonNull String databaseName, @NonNull BackupLongTermRetentionPolicyInner parameters) {
        return createOrUpdateAsync(resourceGroupName, serverName, databaseName, parameters).blockingGet();
    }

    /**
     * Creates or updates a database backup long term retention policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param parameters The required parameters to update a backup long term retention policy.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<BackupLongTermRetentionPolicyInner> createOrUpdateAsync(@NonNull String resourceGroupName, @NonNull String serverName, @NonNull String databaseName, @NonNull BackupLongTermRetentionPolicyInner parameters, ServiceCallback<BackupLongTermRetentionPolicyInner> serviceCallback) {
        return ServiceFuture.fromBody(createOrUpdateAsync(resourceGroupName, serverName, databaseName, parameters), serviceCallback);
    }

    /**
     * Creates or updates a database backup long term retention policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param parameters The required parameters to update a backup long term retention policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Single<BodyResponse<BackupLongTermRetentionPolicyInner>> createOrUpdateWithRestResponseAsync(@NonNull String resourceGroupName, @NonNull String serverName, @NonNull String databaseName, @NonNull BackupLongTermRetentionPolicyInner parameters) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serverName == null) {
            throw new IllegalArgumentException("Parameter serverName is required and cannot be null.");
        }
        if (databaseName == null) {
            throw new IllegalArgumentException("Parameter databaseName is required and cannot be null.");
        }
        if (parameters == null) {
            throw new IllegalArgumentException("Parameter parameters is required and cannot be null.");
        }
        Validator.validate(parameters);
        final String backupLongTermRetentionPolicyName = "Default";
        final String apiVersion = "2014-04-01";
        return service.createOrUpdate(this.client.subscriptionId(), resourceGroupName, serverName, databaseName, backupLongTermRetentionPolicyName, apiVersion, parameters, this.client.acceptLanguage());
    }

    /**
     * Creates or updates a database backup long term retention policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param parameters The required parameters to update a backup long term retention policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Maybe<BackupLongTermRetentionPolicyInner> createOrUpdateAsync(@NonNull String resourceGroupName, @NonNull String serverName, @NonNull String databaseName, @NonNull BackupLongTermRetentionPolicyInner parameters) {
        return createOrUpdateWithRestResponseAsync(resourceGroupName, serverName, databaseName, parameters)
            .flatMapMaybe((BodyResponse<BackupLongTermRetentionPolicyInner> res) -> res.body() == null ? Maybe.empty() : Maybe.just(res.body()));
    }

    /**
     * Creates or updates a database backup long term retention policy (resume watch).
     *
     * @param operationDescription The OperationDescription object.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the observable for the request.
     */
    public Observable<OperationStatus<BackupLongTermRetentionPolicyInner>> resumeCreateOrUpdate(OperationDescription operationDescription) {
        if (operationDescription == null) {
            throw new IllegalArgumentException("Parameter operationDescription is required and cannot be null.");
        }
        return service.resumeCreateOrUpdate(operationDescription);
    }

    /**
     * Returns a database backup long term retention policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List&lt;BackupLongTermRetentionPolicyInner&gt; object if successful.
     */
    public List<BackupLongTermRetentionPolicyInner> listByDatabase(@NonNull String resourceGroupName, @NonNull String serverName, @NonNull String databaseName) {
        return listByDatabaseAsync(resourceGroupName, serverName, databaseName).blockingGet();
    }

    /**
     * Returns a database backup long term retention policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<List<BackupLongTermRetentionPolicyInner>> listByDatabaseAsync(@NonNull String resourceGroupName, @NonNull String serverName, @NonNull String databaseName, ServiceCallback<List<BackupLongTermRetentionPolicyInner>> serviceCallback) {
        return ServiceFuture.fromBody(listByDatabaseAsync(resourceGroupName, serverName, databaseName), serviceCallback);
    }

    /**
     * Returns a database backup long term retention policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Single<BodyResponse<List<BackupLongTermRetentionPolicyInner>>> listByDatabaseWithRestResponseAsync(@NonNull String resourceGroupName, @NonNull String serverName, @NonNull String databaseName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serverName == null) {
            throw new IllegalArgumentException("Parameter serverName is required and cannot be null.");
        }
        if (databaseName == null) {
            throw new IllegalArgumentException("Parameter databaseName is required and cannot be null.");
        }
        final String apiVersion = "2014-04-01";
        return service.listByDatabase(this.client.subscriptionId(), resourceGroupName, serverName, databaseName, apiVersion, this.client.acceptLanguage());
    }

    /**
     * Returns a database backup long term retention policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Maybe<List<BackupLongTermRetentionPolicyInner>> listByDatabaseAsync(@NonNull String resourceGroupName, @NonNull String serverName, @NonNull String databaseName) {
        return listByDatabaseWithRestResponseAsync(resourceGroupName, serverName, databaseName)
            .flatMapMaybe((BodyResponse<List<BackupLongTermRetentionPolicyInner>> res) -> res.body() == null ? Maybe.empty() : Maybe.just(res.body()));
    }
}
