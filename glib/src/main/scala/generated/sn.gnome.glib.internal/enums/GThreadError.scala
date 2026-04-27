package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GThreadError = CUnsignedInt
object GThreadError extends _BindgenEnumCUnsignedInt[GThreadError]:
  given _tag: Tag[GThreadError] = Tag.UInt
  inline def define(inline a: Long): GThreadError = a.toUInt
  val G_THREAD_ERROR_AGAIN = define(0)
  def getName(value: GThreadError): Option[String] =
    value match
      case `G_THREAD_ERROR_AGAIN` => Some("G_THREAD_ERROR_AGAIN")
      case _ => _root_.scala.None
  extension (a: GThreadError)
    inline def &(b: GThreadError): GThreadError = a & b
    inline def |(b: GThreadError): GThreadError = a | b
    inline def is(b: GThreadError): Boolean = (a & b) == b