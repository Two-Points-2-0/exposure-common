[serialization](../../index.md) / [com.twopointsexposure.common.serialization.model](../index.md) / [HealthStatusReport](./index.md)

# HealthStatusReport

`interface HealthStatusReport<T, V>`

### Properties

| Name | Summary |
|---|---|
| [combinedNonceHash](combined-nonce-hash.md) | `abstract val combinedNonceHash: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [status](status.md) | `abstract val status: `[`T`](index.md#T) |
| [timestamp](timestamp.md) | `abstract val timestamp: `[`V`](index.md#V) |

### Inheritors

| Name | Summary |
|---|---|
| [ContactHealthStatusReport](../-contact-health-status-report/index.md) | `data class ContactHealthStatusReport : `[`HealthStatusReport`](./index.md)`<`[`ContactHealthData`](../-contact-health-data/index.md)`, <ERROR CLASS>>` |
| [HealthSurveyReport](../-health-survey-report/index.md) | `data class HealthSurveyReport : `[`HealthStatusReport`](./index.md)`<`[`HealthSurvey`](../-health-survey/index.md)`, <ERROR CLASS>>` |
| [ServerHealthStatusReport](../-server-health-status-report/index.md) | `data class ServerHealthStatusReport : `[`HealthStatusReport`](./index.md)`<`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`, <ERROR CLASS>>` |
