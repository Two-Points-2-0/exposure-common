package com.twopointsexposure.common.serialization.model

import io.islandtime.Instant

data class HealthStatusSummary(val status: Boolean, val timestamp: Instant)