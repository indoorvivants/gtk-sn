import sn.gnome.codegentests.fluent.*

import scalanative.unsafe.*

class ImplTests extends munit.FunSuite:
  test("basics") {
    Zone:
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

  }
end ImplTests
