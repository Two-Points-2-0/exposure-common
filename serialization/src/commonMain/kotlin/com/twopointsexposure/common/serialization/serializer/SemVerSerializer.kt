package com.twopointsexposure.common.serialization.serializer

import com.twopointsexposure.common.serialization.model.SemVer
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializer
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

@Serializer(forClass = SemVer::class)
object SemVerSerializer :
    KSerializer<SemVer> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor(
            "dev.mobilehealth.reimaginedlamp.SemVer",
            PrimitiveKind.STRING
        )

    override fun serialize(encoder: Encoder, value: SemVer) {
        encoder.encodeString(value.toString())
    }

    override fun deserialize(decoder: Decoder): SemVer {
        return SemVer.parse(decoder.decodeString())
    }
}