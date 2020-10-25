package com.twopointsexposure.common.serialization.model

import com.twopointsexposure.common.serialization.serializer.InstantSerializer
import io.islandtime.Instant
import kotlinx.serialization.Serializable

@Serializable
data class InvoiceInfo(
    val invoiceId: String,
    val invoiceLineInfos: List<InvoiceLineInfo>,
    @Serializable(with = InstantSerializer::class) val periodStart: Instant,
    @Serializable(with = InstantSerializer::class) val periodEnd: Instant,
    val coupon: CouponInfo?,
    val amountDue: Long,
    val amountPaid: Long,
    val amountRemaining: Long,
    val currency: String
)

@Serializable
data class UpcomingInvoiceInfo(
    val invoiceLineInfos: List<InvoiceLineInfo>,
    @Serializable(with = InstantSerializer::class) val periodStart: Instant,
    @Serializable(with = InstantSerializer::class) val periodEnd: Instant,
    val coupon: CouponInfo?,
    val amountDue: Long,
    val amountPaid: Long,
    val amountRemaining: Long,
    val currency: String
)

@Serializable
data class CouponInfo(val name: String, val percentOff: Long)

@Serializable
data class InvoiceLineInfo(
    val description: String,
    @Serializable(with = InstantSerializer::class) val periodStart: Instant,
    @Serializable(with = InstantSerializer::class) val periodEnd: Instant
)

@Serializable
data class SubscriptionInvoicesInfo(
    val subscriptionId: String,
    val latestInvoiceInfo: InvoiceInfo,
    val upcomingInvoiceInfo: UpcomingInvoiceInfo
)