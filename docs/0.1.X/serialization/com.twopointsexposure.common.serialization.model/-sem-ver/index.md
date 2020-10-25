[serialization](../../index.md) / [com.twopointsexposure.common.serialization.model](../index.md) / [SemVer](./index.md)

# SemVer

`data class SemVer : `[`Comparable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/index.html)`<`[`SemVer`](./index.md)`>`

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `SemVer(major: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)` = 0, minor: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)` = 0, patch: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)` = 0, preRelease: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, buildMetadata: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null)` |

### Properties

| Name | Summary |
|---|---|
| [buildMetadata](build-metadata.md) | `val buildMetadata: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [major](major.md) | `val major: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [minor](minor.md) | `val minor: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [patch](patch.md) | `val patch: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [preRelease](pre-release.md) | `val preRelease: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |

### Functions

| Name | Summary |
|---|---|
| [compareTo](compare-to.md) | `fun compareTo(other: `[`SemVer`](./index.md)`): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>Compare two SemVer objects using major, minor, patch and pre-release version as specified in SemVer specification. |
| [isInitialDevelopmentPhase](is-initial-development-phase.md) | `fun isInitialDevelopmentPhase(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Check the version number is in initial development. |
| [toString](to-string.md) | `fun toString(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Build the version name string. |

### Companion Object Functions

| Name | Summary |
|---|---|
| [parse](parse.md) | `fun parse(version: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`SemVer`](./index.md)<br>Parse the version string to [SemVer](./index.md) data object. |
