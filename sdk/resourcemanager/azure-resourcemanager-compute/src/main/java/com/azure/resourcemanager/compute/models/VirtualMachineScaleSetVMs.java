// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.resourcemanager.resources.fluentcore.collection.SupportsListing;
import java.util.Collection;
import reactor.core.publisher.Mono;

/** Entry point to virtual machine scale set instance management API. */
@Fluent
public interface VirtualMachineScaleSetVMs extends SupportsListing<VirtualMachineScaleSetVM> {
    /**
     * Deletes the specified virtual machine instances from the scale set.
     *
     * @param instanceIds instance IDs of the virtual machine scale set instances to be deleted
     * @return a representation of the deferred computation of this call.
     */
    Mono<Void> deleteInstancesAsync(Collection<String> instanceIds);

    /**
     * Deletes the specified virtual machine instances from the scale set.
     *
     * @param instanceIds instance IDs of the virtual machine scale set instances to be deleted
     * @return a representation of the deferred computation of this call.
     */
    Mono<Void> deleteInstancesAsync(String... instanceIds);

    /**
     * Deletes the specified virtual machine instances from the scale set.
     *
     * @param instanceIds instance IDs of the virtual machine scale set instances to be deleted
     */
    void deleteInstances(String... instanceIds);

    /**
     * Deletes the specified virtual machine instances from the scale set.
     *
     * @param instanceIds instance IDs of the virtual machine scale set instances to be deleted
     * @param forceDeletion force delete without graceful shutdown
     * @return a representation of the deferred computation of this call.
     */
    Mono<Void> deleteInstancesAsync(Collection<String> instanceIds, boolean forceDeletion);

    /**
     * Deletes the specified virtual machine instances from the scale set.
     *
     * @param instanceIds instance IDs of the virtual machine scale set instances to be deleted
     * @param forceDeletion force delete without graceful shutdown
     */
    void deleteInstances(Collection<String> instanceIds, boolean forceDeletion);

    /**
     * Get the specified virtual machine instance from the scale set.
     *
     * @param instanceId instance ID of the virtual machine scale set instance to be fetched
     * @return the virtual machine scale set instance.
     */
    VirtualMachineScaleSetVM getInstance(String instanceId);

    /**
     * Get the specified virtual machine instance from the scale set.
     *
     * @param instanceId instance ID of the virtual machine scale set instance to be fetched.
     * @return the virtual machine scale set instance.
     */
    Mono<VirtualMachineScaleSetVM> getInstanceAsync(String instanceId);

    /**
     * Updates the specified virtual machine instances from the scale set.
     *
     * @param instanceIds instance IDs of the virtual machine scale set instances to be updated
     * @return a representation of the deferred computation of this call.
     */
    Mono<Void> updateInstancesAsync(Collection<String> instanceIds);

    /**
     * Updates the specified virtual machine instances from the scale set.
     *
     * @param instanceIds instance IDs of the virtual machine scale set instances to be updated
     * @return a representation of the deferred computation of this call.
     */
    Mono<Void> updateInstancesAsync(String... instanceIds);

    /**
     * Updates the specified virtual machine instances from the scale set.
     *
     * @param instanceIds instance IDs of the virtual machine scale set instances to be updated
     */
    void updateInstances(String... instanceIds);

    /**
     * Simulates the eviction of the specified spot virtual machine in the scale set asynchronously. The eviction will
     * occur with 30 minutes after calling this API.
     *
     * @param instanceId The instance ID of the virtual machine.
     * @return a representation of the deferred computation of this call
     */
    Mono<Void> simulateEvictionAsync(String instanceId);

    /**
     * Simulates the eviction of the specified spot virtual machine in the scale set. The eviction will occur with 30
     * minutes after calling this API.
     *
     * @param instanceId The instance ID of the virtual machine.
     */
    void simulateEviction(String instanceId);

    /**
     * Lists all the resources of the specified type in the currently selected subscription.
     *
     * @param filter The filter to apply to the operation. Allowed values are 'startswith(instanceView/statuses/code,
     *     'PowerState') eq true', 'properties/latestModelApplied eq true', 'properties/latestModelApplied eq false'.
     * @param expand The expand expression to apply to the operation. Allowed values are 'instanceView'.
     * @return A {@link PagedIterable} of resources
     */
    PagedIterable<VirtualMachineScaleSetVM> list(String filter, VirtualMachineScaleSetVMExpandType expand);

    /**
     * Lists all the resources of the specified type in the currently selected subscription.
     *
     * @param filter The filter to apply to the operation. Allowed values are 'startswith(instanceView/statuses/code,
     *     'PowerState') eq true', 'properties/latestModelApplied eq true', 'properties/latestModelApplied eq false'.
     * @param expand The expand expression to apply to the operation. Allowed values are 'instanceView'.
     * @return A {@link PagedFlux} of resources
     */
    PagedFlux<VirtualMachineScaleSetVM> listAsync(String filter, VirtualMachineScaleSetVMExpandType expand);
}
