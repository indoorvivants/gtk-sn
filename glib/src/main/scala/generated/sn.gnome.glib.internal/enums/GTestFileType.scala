package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GTestFileType = CUnsignedInt
object GTestFileType extends _BindgenEnumCUnsignedInt[GTestFileType]:
  given _tag: Tag[GTestFileType] = Tag.UInt
  inline def define(inline a: Long): GTestFileType = a.toUInt
  val G_TEST_DIST = define(0)
  val G_TEST_BUILT = define(1)
  def getName(value: GTestFileType): Option[String] =
    value match
      case `G_TEST_DIST` => Some("G_TEST_DIST")
      case `G_TEST_BUILT` => Some("G_TEST_BUILT")
      case _ => _root_.scala.None
  extension (a: GTestFileType)
    inline def &(b: GTestFileType): GTestFileType = a & b
    inline def |(b: GTestFileType): GTestFileType = a | b
    inline def is(b: GTestFileType): Boolean = (a & b) == b