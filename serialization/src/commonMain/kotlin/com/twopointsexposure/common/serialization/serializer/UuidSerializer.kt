package com.twopointsexposure.common.serialization.serializer

import com.benasher44.uuid.Uuid
import com.benasher44.uuid.uuidFrom
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializer
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

@Serializer(forClass = Uuid::class)
class UuidSerializer :
    KSerializer<Uuid> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor(
            "com.benasher44.uuid.Uuid",
            PrimitiveKind.STRING
        )

    override fun serialize(encoder: Encoder, value: Uuid) {
        encoder.encodeString(value.toString())
    }

    override fun deserialize(decoder: Decoder): Uuid {
        return uuidFrom(decoder.decodeString())
    }
//}
//
//@Serializer(forClass = DateTimeTz::class)
//class DateTimeTzSerializer : KSerializer<DateTimeTz> {
//    override val descriptor: SerialDescriptor =
//        PrimitiveDescriptor(
//            "com.soywiz.klock.DateTimeTz",
//            PrimitiveKind.STRING
//        )
//
//    override fun serialize(encoder: Encoder, value: DateTimeTz) {
//        encoder.encodeString(ISO8601.DATETIME_COMPLETE.format(value))
//    }
//
//    override fun deserialize(decoder: Decoder): DateTimeTz {
//        return ISO8601.DATETIME_COMPLETE.parse(decoder.decodeString())
//    }
//}
//
//
//@Serializer(forClass = DateTimeRange::class)
//class DateTimeRangeSerializer() : KSerializer<DateTimeRange> {
//    override val descriptor: SerialDescriptor =
//        PrimitiveDescriptor(
//            "com.soywiz.klock.DateTimeRange",
//            PrimitiveKind.STRING
//        )
//
//    override fun serialize(encoder: Encoder, value: DateTimeRange) = encoder.encodeStructure(descriptor) {
////        val composite = encoder.beginStructure(descriptor, dateTimeSerializer)
////        encoder.encode(obj.from)
////        encoder.encodeString(obj)
//        encodeSerializableElement(descriptor, 0, serializer(), value.from)
//
//        encodeSerializableElement(descriptor, 1, serializer(), value.to)
////        composite.endStructure(descriptor)
//    }
//
//    override fun deserialize(decoder: Decoder): DateTimeRange = decoder.decodeStructure(descriptor) {
//        val from: DateTime = decodeSerializableElement(descriptor, 0, serializer())
//        val to: DateTime = decodeSerializableElement(descriptor, 1, serializer())
//        DateTimeRange(from, to)
//    }
//}
//
//@Serializer(forClass = DateTime::class)
//class DateTimeSerializer : KSerializer<DateTime> {
//    override val descriptor: SerialDescriptor =
//        PrimitiveDescriptor(
//            "com.soywiz.klock.DateTime",
//            PrimitiveKind.STRING
//        )
//
//    override fun serialize(encoder: Encoder, obj: DateTime) {
//        encoder.encodeString(ISO8601.DATETIME_COMPLETE.format(obj))
//    }
//
//    override fun deserialize(decoder: Decoder): DateTime {
//        return ISO8601.DATETIME_COMPLETE.parseUtc(decoder.decodeString())
//    }

}