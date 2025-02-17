// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ThreatIntelligenceSortingCriteriaEnum. */
public final class ThreatIntelligenceSortingCriteriaEnum
    extends ExpandableStringEnum<ThreatIntelligenceSortingCriteriaEnum> {
    /** Static value unsorted for ThreatIntelligenceSortingCriteriaEnum. */
    public static final ThreatIntelligenceSortingCriteriaEnum UNSORTED = fromString("unsorted");

    /** Static value ascending for ThreatIntelligenceSortingCriteriaEnum. */
    public static final ThreatIntelligenceSortingCriteriaEnum ASCENDING = fromString("ascending");

    /** Static value descending for ThreatIntelligenceSortingCriteriaEnum. */
    public static final ThreatIntelligenceSortingCriteriaEnum DESCENDING = fromString("descending");

    /**
     * Creates or finds a ThreatIntelligenceSortingCriteriaEnum from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ThreatIntelligenceSortingCriteriaEnum.
     */
    @JsonCreator
    public static ThreatIntelligenceSortingCriteriaEnum fromString(String name) {
        return fromString(name, ThreatIntelligenceSortingCriteriaEnum.class);
    }

    /** @return known ThreatIntelligenceSortingCriteriaEnum values. */
    public static Collection<ThreatIntelligenceSortingCriteriaEnum> values() {
        return values(ThreatIntelligenceSortingCriteriaEnum.class);
    }
}
