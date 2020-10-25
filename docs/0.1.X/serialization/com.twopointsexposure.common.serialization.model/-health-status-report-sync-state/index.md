[serialization](../../index.md) / [com.twopointsexposure.common.serialization.model](../index.md) / [HealthStatusReportSyncState](./index.md)

# HealthStatusReportSyncState

`interface HealthStatusReportSyncState<T, V, U : `[`HealthStatusReport`](../-health-status-report/index.md)`<`[`T`](index.md#T)`, `[`V`](index.md#V)`>>`

### Properties

| Name | Summary |
|---|---|
| [healthStatusReport](health-status-report.md) | `abstract val healthStatusReport: `[`U`](index.md#U)`?` |
| [reporteeNonce](reportee-nonce.md) | `abstract val reporteeNonce: <ERROR CLASS>` |
| [reporterNonce](reporter-nonce.md) | `abstract val reporterNonce: <ERROR CLASS>` |
| [synced](synced.md) | `abstract val synced: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |

### Inheritors

| Name | Summary |
|---|---|
| [ContactHealthStatusReportSyncState](../-contact-health-status-report-sync-state/index.md) | `data class ContactHealthStatusReportSyncState : `[`HealthStatusReportSyncState`](./index.md)`<`[`ContactHealthData`](../-contact-health-data/index.md)`, <ERROR CLASS>, `[`ContactHealthStatusReport`](../-contact-health-status-report/index.md)`>` |
| [ServerHealthStatusReportSyncState](../-server-health-status-report-sync-state/index.md) | `data class ServerHealthStatusReportSyncState : `[`HealthStatusReportSyncState`](./index.md)`<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`, <ERROR CLASS>, `[`ServerHealthStatusReport`](../-server-health-status-report/index.md)`>` |
