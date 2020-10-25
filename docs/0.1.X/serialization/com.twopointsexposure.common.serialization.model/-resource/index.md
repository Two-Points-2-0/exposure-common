[serialization](../../index.md) / [com.twopointsexposure.common.serialization.model](../index.md) / [Resource](./index.md)

# Resource

`data class Resource<out T>`

A generic class that holds a value with its loading status.

**Parameters**

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `Resource(status: `[`Status`](../-status/index.md)`, data: `[`T`](index.md#T)`?, message: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?)`<br>A generic class that holds a value with its loading status. |

### Properties

| Name | Summary |
|---|---|
| [data](data.md) | `val data: `[`T`](index.md#T)`?` |
| [message](message.md) | `val message: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [status](status.md) | `val status: `[`Status`](../-status/index.md) |

### Companion Object Functions

| Name | Summary |
|---|---|
| [error](error.md) | `fun <T> error(msg: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, data: `[`T`](error.md#T)`?): `[`Resource`](./index.md)`<`[`T`](error.md#T)`>` |
| [loading](loading.md) | `fun <T> loading(data: `[`T`](loading.md#T)`?): `[`Resource`](./index.md)`<`[`T`](loading.md#T)`>` |
| [success](success.md) | `fun <T> success(data: `[`T`](success.md#T)`?): `[`Resource`](./index.md)`<`[`T`](success.md#T)`>` |
