package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GFileTest = CUnsignedInt
object GFileTest extends _BindgenEnumCUnsignedInt[GFileTest]:
  given _tag: Tag[GFileTest] = Tag.UInt
  inline def define(inline a: Long): GFileTest = a.toUInt
  val G_FILE_TEST_IS_REGULAR = define(1)
  val G_FILE_TEST_IS_SYMLINK = define(2)
  val G_FILE_TEST_IS_DIR = define(4)
  val G_FILE_TEST_IS_EXECUTABLE = define(8)
  val G_FILE_TEST_EXISTS = define(16)
  def getName(value: GFileTest): Option[String] =
    value match
      case `G_FILE_TEST_IS_REGULAR` => Some("G_FILE_TEST_IS_REGULAR")
      case `G_FILE_TEST_IS_SYMLINK` => Some("G_FILE_TEST_IS_SYMLINK")
      case `G_FILE_TEST_IS_DIR` => Some("G_FILE_TEST_IS_DIR")
      case `G_FILE_TEST_IS_EXECUTABLE` => Some("G_FILE_TEST_IS_EXECUTABLE")
      case `G_FILE_TEST_EXISTS` => Some("G_FILE_TEST_EXISTS")
      case _ => _root_.scala.None
  extension (a: GFileTest)
    inline def &(b: GFileTest): GFileTest = a & b
    inline def |(b: GFileTest): GFileTest = a | b
    inline def is(b: GFileTest): Boolean = (a & b) == b