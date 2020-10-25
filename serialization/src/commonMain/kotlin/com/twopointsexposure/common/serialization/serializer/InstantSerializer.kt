package com.twopointsexposure.common.serialization.serializer

import io.islandtime.Instant
import io.islandtime.toInstant
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializer
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

@Serializer(forClass = Instant::class)
object InstantSerializer : KSerializer<Instant> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.islandtime.InstantSerializer", PrimitiveKind.STRING)

    override fun serialize(encoder: Encoder, obj: Instant) {
        encoder.encodeString(obj.toString())
    }

    override fun deserialize(decoder: Decoder): Instant {
        return decoder.decodeString().toInstant()
    }
}