[serialization](../../index.md) / [com.twopointsexposure.common.serialization.model](../index.md) / [AppVersion](./index.md)

# AppVersion

`data class AppVersion`

### Types

| Name | Summary |
|---|---|
| [BuildVariant](-build-variant/index.md) | `enum class BuildVariant` |
| [PhoneOS](-phone-o-s/index.md) | `enum class PhoneOS` |
| [Version](-version/index.md) | `data class Version` |

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `AppVersion(phoneOS: `[`AppVersion.PhoneOS`](-phone-o-s/index.md)` = PhoneOS.Unknown, version: `[`SemVer`](../-sem-ver/index.md)` = SemVer(), versionCode: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)` = 0, buildVariant: `[`AppVersion.BuildVariant`](-build-variant/index.md)` = BuildVariant.Unknown)` |

### Properties

| Name | Summary |
|---|---|
| [buildVariant](build-variant.md) | `val buildVariant: `[`AppVersion.BuildVariant`](-build-variant/index.md) |
| [phoneOS](phone-o-s.md) | `val phoneOS: `[`AppVersion.PhoneOS`](-phone-o-s/index.md) |
| [version](version.md) | `val version: `[`SemVer`](../-sem-ver/index.md) |
| [versionCode](version-code.md) | `val versionCode: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
