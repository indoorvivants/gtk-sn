package sn.gnome.glib

import _root_.sn.gnome.glib.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.{TestCase, TestSuite}
import sn.gnome.glib.internal.GTestSuite

/** An opaque structure representing a test suite.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class TestSuite private[gnome] (raw: Ptr[GTestSuite]):

  def getUnsafeRawPointer(): Ptr[GTestSuite] = this.raw

  /** Adds @test_case to @suite.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def add(
      test_case: sn.gnome.glib.TestCase /* Some(Ptr[GTestCase]) */
  ): Unit /* None */ =
    g_test_suite_add(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GTestSuite]],
      test_case.getUnsafeRawPointer().asInstanceOf
    )
  end add

  /** Adds @nestedsuite to @suite.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def addSuite(
      nestedsuite: sn.gnome.glib.TestSuite /* Some(Ptr[GTestSuite]) */
  ): Unit /* None */ =
    g_test_suite_add_suite(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GTestSuite]],
      nestedsuite.getUnsafeRawPointer().asInstanceOf
    )
  end addSuite

  /** Free the @suite and all nested #GTestSuites.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def free(): Unit /* None */ =
    g_test_suite_free(this.getUnsafeRawPointer().asInstanceOf[Ptr[GTestSuite]])
  end free

end TestSuite

object TestSuite:
  def fromRaw(ptr: Ptr[GTestSuite]): TestSuite = new TestSuite(ptr)
end TestSuite
