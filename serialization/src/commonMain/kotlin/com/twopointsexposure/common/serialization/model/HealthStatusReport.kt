package com.twopointsexposure.common.serialization.model

import com.benasher44.uuid.Uuid
import io.islandtime.Date
import io.islandtime.Instant
import io.islandtime.ZonedDateTime
import io.islandtime.base.TimePoint

interface HealthStatusReport<T, V : TimePoint<V>> {
    val combinedNonceHash: String
    val timestamp: V
    val status: T
}

interface HealthStatusReportSyncState<T, V : TimePoint<V>, U : HealthStatusReport<T, V>> {
    val reporterNonce: Uuid
    val reporteeNonce: Uuid
    val synced: Boolean
    val healthStatusReport: U?
}

data class HealthSurveyReport(
    override val combinedNonceHash: String,
    override val timestamp: ZonedDateTime,
    override val status: HealthSurvey
) : HealthStatusReport<HealthSurvey, ZonedDateTime>

data class HealthSurvey(
    val isDiagnosedCovid19: Boolean,
    val diagnosedCovid19Date: Date? = null,
    val isFeverishToday: Boolean,
    val isAnyHouseholdMemberShowingCovid19Symptoms: Boolean
)

data class HealthSurveyReportNoncesHolder(
    val sharedNonce: SharedNonce,
    val myNonce: MyNonce,
    val healthSurveyReport: HealthSurveyReport
)

data class ServerHealthStatusReport(
    override val combinedNonceHash: String,
    override val timestamp: Instant,
    override val status: Boolean
) : HealthStatusReport<Boolean, Instant>

data class ServerHealthStatusReportSyncState(
    override val reporterNonce: Uuid,
    override val reporteeNonce: Uuid,
    override val synced: Boolean,
    override val healthStatusReport: ServerHealthStatusReport?
) : HealthStatusReportSyncState<Boolean, Instant, ServerHealthStatusReport>  {
    val sharedNonce
        get() = reporterNonce
    val contactNonce
        get() = reporteeNonce
}

data class ContactHealthStatusReport(
    override val combinedNonceHash: String,
    override val timestamp: ZonedDateTime,
    override val status: ContactHealthData
) : HealthStatusReport<ContactHealthData, ZonedDateTime>

data class ContactHealthStatusReportSyncState(
    override val reporterNonce: Uuid,
    override val reporteeNonce: Uuid,
    override val synced: Boolean,
    override val healthStatusReport: ContactHealthStatusReport?
) : HealthStatusReportSyncState<ContactHealthData, ZonedDateTime, ContactHealthStatusReport>

data class ContactHealthData(val healthy: Boolean)