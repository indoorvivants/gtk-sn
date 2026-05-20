package sn.gnome.glib

import _root_.sn.gnome.glib.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.GTestCase

/** An opaque structure representing a test case.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class TestCase private[gnome] (raw: Ptr[GTestCase]):

  def getUnsafeRawPointer(): Ptr[GTestCase] = this.raw

  /** Free the @test_case.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def free(): Unit /* None */ =
    g_test_case_free(this.getUnsafeRawPointer().asInstanceOf[Ptr[GTestCase]])
  end free

end TestCase

object TestCase:
  def fromRaw(ptr: Ptr[GTestCase]): TestCase = new TestCase(ptr)
end TestCase
