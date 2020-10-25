package com.twopointsexposure.common.serialization.model

import com.benasher44.uuid.Uuid
import io.islandtime.ZonedDateTime

data class ContactEvent(
    val contactUserType: UserType,
    val sharedNonce: Uuid,
    val myNonce: Uuid,
    val contactNonce: Uuid,
    val contactDisplayName: String,
    val contactTime: ZonedDateTime
) {

}