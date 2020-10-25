[serialization](../../index.md) / [com.twopointsexposure.common.serialization.model](../index.md) / [SemVer](index.md) / [parse](./parse.md)

# parse

`fun parse(version: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`SemVer`](index.md)

Parse the version string to [SemVer](index.md) data object.

### Parameters

`version` - version string.

### Exceptions

`IllegalArgumentException` - if the version is not valid.