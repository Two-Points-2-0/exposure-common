package com.twopointsexposure.common.serialization.model

import com.benasher44.uuid.Uuid
import io.islandtime.ranges.InstantInterval

data class ContactNonce(
    override val nonce: Uuid,
    override val userType: UserType,
    override val activeRange: InstantInterval,
    val displayName: String
) : Nonce