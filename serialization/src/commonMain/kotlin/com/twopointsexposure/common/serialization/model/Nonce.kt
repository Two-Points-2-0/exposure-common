package com.twopointsexposure.common.serialization.model

import com.benasher44.uuid.Uuid
import io.islandtime.ranges.InstantInterval

interface Nonce {
    val nonce: Uuid
    val userType: UserType
    val activeRange: InstantInterval
}