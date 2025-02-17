// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deviceprovisioningservices.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.deviceprovisioningservices.models.ProvisioningServiceDescription;
import java.util.HashMap;
import java.util.Map;

/** Samples for IotDpsResource Update. */
public final class IotDpsResourceUpdateSamples {
    /*
     * x-ms-original-file: specification/deviceprovisioningservices/resource-manager/Microsoft.Devices/stable/2021-10-15/examples/DPSPatch.json
     */
    /**
     * Sample code: DPSPatch.
     *
     * @param manager Entry point to IotDpsManager.
     */
    public static void dPSPatch(com.azure.resourcemanager.deviceprovisioningservices.IotDpsManager manager) {
        ProvisioningServiceDescription resource =
            manager
                .iotDpsResources()
                .getByResourceGroupWithResponse("myResourceGroup", "myFirstProvisioningService", Context.NONE)
                .getValue();
        resource.update().withTags(mapOf("foo", "bar")).apply();
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
