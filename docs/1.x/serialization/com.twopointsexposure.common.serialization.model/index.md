[serialization](../index.md) / [com.twopointsexposure.common.serialization.model](./index.md)

## Package com.twopointsexposure.common.serialization.model

### Types

| Name | Summary |
|---|---|
| [AppVersion](-app-version/index.md) | `data class AppVersion` |
| [ContactEvent](-contact-event/index.md) | `data class ContactEvent` |
| [ContactHealthData](-contact-health-data/index.md) | `data class ContactHealthData` |
| [ContactHealthStatusReport](-contact-health-status-report/index.md) | `data class ContactHealthStatusReport : `[`HealthStatusReport`](-health-status-report/index.md)`<`[`ContactHealthData`](-contact-health-data/index.md)`, <ERROR CLASS>>` |
| [ContactHealthStatusReportSyncState](-contact-health-status-report-sync-state/index.md) | `data class ContactHealthStatusReportSyncState : `[`HealthStatusReportSyncState`](-health-status-report-sync-state/index.md)`<`[`ContactHealthData`](-contact-health-data/index.md)`, <ERROR CLASS>, `[`ContactHealthStatusReport`](-contact-health-status-report/index.md)`>` |
| [ContactNonce](-contact-nonce/index.md) | `data class ContactNonce : `[`Nonce`](-nonce/index.md) |
| [CouponInfo](-coupon-info/index.md) | `data class CouponInfo` |
| [HealthStatusReport](-health-status-report/index.md) | `interface HealthStatusReport<T, V>` |
| [HealthStatusReportSyncState](-health-status-report-sync-state/index.md) | `interface HealthStatusReportSyncState<T, V, U : `[`HealthStatusReport`](-health-status-report/index.md)`<`[`T`](-health-status-report-sync-state/index.md#T)`, `[`V`](-health-status-report-sync-state/index.md#V)`>>` |
| [HealthStatusSummary](-health-status-summary/index.md) | `data class HealthStatusSummary` |
| [HealthSurvey](-health-survey/index.md) | `data class HealthSurvey` |
| [HealthSurveyReport](-health-survey-report/index.md) | `data class HealthSurveyReport : `[`HealthStatusReport`](-health-status-report/index.md)`<`[`HealthSurvey`](-health-survey/index.md)`, <ERROR CLASS>>` |
| [HealthSurveyReportNoncesHolder](-health-survey-report-nonces-holder/index.md) | `data class HealthSurveyReportNoncesHolder` |
| [InvoiceInfo](-invoice-info/index.md) | `data class InvoiceInfo` |
| [InvoiceLineInfo](-invoice-line-info/index.md) | `data class InvoiceLineInfo` |
| [MyNonce](-my-nonce/index.md) | `data class MyNonce : `[`Nonce`](-nonce/index.md) |
| [NetworkBoundResource](-network-bound-resource/index.md) | `abstract class NetworkBoundResource<ResultType, RequestType>`<br>A generic class that can provide a resource backed by both the sqlite database and the network. |
| [Nonce](-nonce/index.md) | `interface Nonce` |
| [Resource](-resource/index.md) | `data class Resource<out T>`<br>A generic class that holds a value with its loading status. |
| [SemVer](-sem-ver/index.md) | `data class SemVer : `[`Comparable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/index.html)`<`[`SemVer`](-sem-ver/index.md)`>` |
| [ServerHealthStatusReport](-server-health-status-report/index.md) | `data class ServerHealthStatusReport : `[`HealthStatusReport`](-health-status-report/index.md)`<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`, <ERROR CLASS>>` |
| [ServerHealthStatusReportSyncState](-server-health-status-report-sync-state/index.md) | `data class ServerHealthStatusReportSyncState : `[`HealthStatusReportSyncState`](-health-status-report-sync-state/index.md)`<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`, <ERROR CLASS>, `[`ServerHealthStatusReport`](-server-health-status-report/index.md)`>` |
| [ServiceAccessState](-service-access-state/index.md) | `enum class ServiceAccessState` |
| [ServiceAccessStrategy](-service-access-strategy/index.md) | `interface ServiceAccessStrategy` |
| [SharedNonce](-shared-nonce/index.md) | `data class SharedNonce : `[`Nonce`](-nonce/index.md) |
| [Status](-status/index.md) | `enum class Status`<br>Status of a resource that is provided to the UI. |
| [SubscriptionInvoicesInfo](-subscription-invoices-info/index.md) | `data class SubscriptionInvoicesInfo` |
| [UpcomingInvoiceInfo](-upcoming-invoice-info/index.md) | `data class UpcomingInvoiceInfo` |
| [UserType](-user-type/index.md) | `enum class UserType` |

### Extensions for External Classes

| Name | Summary |
|---|---|
| [kotlin.ByteArray](kotlin.-byte-array/index.md) |  |
| [kotlin.String](kotlin.-string/index.md) |  |
