package com.twopointsexposure.common.serialization.model

import com.benasher44.uuid.Uuid
import io.islandtime.ranges.InstantInterval

data class MyNonce(
    override val nonce: Uuid,
    override val userType: UserType,
    override val activeRange: InstantInterval
) : Nonce