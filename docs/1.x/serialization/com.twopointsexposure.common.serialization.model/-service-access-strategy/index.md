[serialization](../../index.md) / [com.twopointsexposure.common.serialization.model](../index.md) / [ServiceAccessStrategy](./index.md)

# ServiceAccessStrategy

`interface ServiceAccessStrategy`

### Functions

| Name | Summary |
|---|---|
| [onAccessGranted](on-access-granted.md) | `abstract fun onAccessGranted(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [onErrored](on-errored.md) | `abstract fun onErrored(state: `[`ServiceAccessState`](../-service-access-state/index.md)`, message: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [onLoading](on-loading.md) | `abstract fun onLoading(state: `[`ServiceAccessState`](../-service-access-state/index.md)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [onRequireAppUpgrade](on-require-app-upgrade.md) | `abstract fun onRequireAppUpgrade(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [onRequireAuthentication](on-require-authentication.md) | `abstract fun onRequireAuthentication(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [onRequireSubscription](on-require-subscription.md) | `abstract fun onRequireSubscription(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |

### Companion Object Functions

| Name | Summary |
|---|---|
| [handle](handle.md) | `fun handle(statusResource: `[`Resource`](../-resource/index.md)`<`[`ServiceAccessState`](../-service-access-state/index.md)`>, strategy: `[`ServiceAccessStrategy`](./index.md)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
