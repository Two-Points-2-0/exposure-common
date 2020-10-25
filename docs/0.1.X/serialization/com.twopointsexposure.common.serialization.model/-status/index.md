[serialization](../../index.md) / [com.twopointsexposure.common.serialization.model](../index.md) / [Status](./index.md)

# Status

`enum class Status`

Status of a resource that is provided to the UI.

These are usually created by the Repository classes where they return
`LiveData<Resource<T>>` to pass back the latest data to the UI with its fetch status.

### Enum Values

| Name | Summary |
|---|---|
| [SUCCESS](-s-u-c-c-e-s-s.md) |  |
| [ERROR](-e-r-r-o-r.md) |  |
| [LOADING](-l-o-a-d-i-n-g.md) |  |
