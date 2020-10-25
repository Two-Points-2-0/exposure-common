[serialization](../../index.md) / [com.twopointsexposure.common.serialization.model](../index.md) / [SemVer](index.md) / [compareTo](./compare-to.md)

# compareTo

`fun compareTo(other: `[`SemVer`](index.md)`): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)

Compare two SemVer objects using major, minor, patch and pre-release version as specified in SemVer specification.

For comparing the whole SemVer object including build metadata, use [equals](#) instead.

**Return**
a negative integer, zero, or a positive integer as this object is less than, equal to, or greater than the specified object.

