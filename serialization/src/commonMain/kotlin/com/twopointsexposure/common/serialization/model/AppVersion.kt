package com.twopointsexposure.common.serialization.model

import com.twopointsexposure.common.serialization.serializer.SemVerSerializer
import kotlinx.serialization.Serializable

@Serializable
data class AppVersion(
    val phoneOS: PhoneOS = PhoneOS.Unknown,
    @Serializable(with = SemVerSerializer::class) val version: SemVer = SemVer(),
    val versionCode: Int = 0,
    val buildVariant: BuildVariant = BuildVariant.Unknown
) {
    data class Version(val major: Int = 0, val minor: Int = 0, val patch: Int = 0)

    enum class PhoneOS {
        iOS, Android, Unknown
    }

    enum class BuildVariant {
        Debug, Release, Unknown
    }
}
