import sn.gnome.codegentests.fluent.*

import scalanative.unsafe.*
import scalanative.unsigned.*

import sn.gnome.gobject.runtime.Runtime
import sn.gnome.glib.fluent.*
import sn.gnome.glib.internal.g_quark_from_static_string
import scala.util.Try

class ImplTests extends munit.FunSuite:

  test("object lifetime") {
    Zone:
      var rt: Runtime = null
      var inst: Impl = null
      Runtime.use:
        inst = Impl()
        rt = summon[Runtime]

        assertEquals(
          summon[Runtime].get[Impl](inst.getUnsafeRawPointer()),
          inst
        )
      assertEquals(Try(rt.get[Impl](inst.getUnsafeRawPointer())).toOption, None)
  }

  test("basics") {
    Zone:
      Runtime.use:
        val inst = Impl()

        inst.setOptions(
          count = 25,
          title = "Howdy from Scala Native",
          flags = Array("a", "b", "c")
        )

        assertEquals(25, inst.getCount())
        assertEquals("Howdy from Scala Native", inst.getTitle())
        assertEquals(Array("a", "b", "c").toList, inst.getFlags().toList)

        val inst2 = Impl.withTitle("Hello from Scala Native")
        assertEquals("Hello from Scala Native", inst2.getTitle())

        val results = Impl.addPrefix("yo-", Array("a", "b", "c"))
        assertEquals(Array("yo-a", "yo-b", "yo-c").toList, results.toList)

        assertEquals(inst.sqrtCount(), GResult.Ok(5))

        inst.setOptions(count = -100, title = "bla", flags = Array.empty)

        val errQuark =
          g_quark_from_static_string(c"Number is negative".asInstanceOf)

        assertEquals(
          inst.sqrtCount(),
          GResult.Error(errQuark, 0, "Number is negative")
        )

        val inst3 = Impl.withCount(25).getOrThrow()
        assertEquals(inst3.getCount(), 25)

        val inst4 = Impl.withCount(-100).toError

        assertEquals(
          inst4,
          Some(
            new GResultException(
              errQuark,
              0,
              "Number is negative"
            )
          )
        )

  }
end ImplTests
