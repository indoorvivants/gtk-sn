import sn.gnome.gobject.{Value, ValueData}
import sn.gnome.gobject.runtime.*
import scalanative.unsafe.*

class ValueTests extends munit.FunSuite:
  test("basics"):

    Runtime.use:
      def roundtrip(data: ValueData): Unit =
        val value = Value.init(data)
        assertEquals(value.data, Some(data))

        val ptr = value.getUnsafeRawPointer()
        val readBack = Value.fromRaw(ptr.asInstanceOf)
        assertEquals(readBack.data, Some(data))

        val newVal = Value.init(ValueData.Bool(true))
        newVal.set(data)
        assertEquals(newVal.data, Some(data))

        val readBackAfterSetting =
          Value.fromRaw(newVal.getUnsafeRawPointer().asInstanceOf)
        assertEquals(readBackAfterSetting.data, Some(data))
      end roundtrip

      roundtrip(ValueData.Int(50))
      roundtrip(ValueData.Int64(12381239123123L))
      roundtrip(ValueData.Float(3.14f))
      roundtrip(ValueData.Double(3.14d))
      roundtrip(ValueData.Str("hello"))
      roundtrip(ValueData.Bool(true))
      roundtrip(ValueData.Bool(false))
      roundtrip(ValueData.Pointer(stackalloc[Byte]()))
end ValueTests
