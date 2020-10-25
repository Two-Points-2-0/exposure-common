package com.twopointsexposure.common.serialization.model

import com.benasher44.uuid.Uuid
import io.islandtime.ranges.InstantInterval

data class SharedNonce(
    override val nonce: Uuid,
    override val activeRange: InstantInterval
) : Nonce {
    override val userType: UserType = UserType.SERVER
}