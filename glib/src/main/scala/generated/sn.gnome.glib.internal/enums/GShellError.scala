package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GShellError = CUnsignedInt
object GShellError extends _BindgenEnumCUnsignedInt[GShellError]:
  given _tag: Tag[GShellError] = Tag.UInt
  inline def define(inline a: Long): GShellError = a.toUInt
  val G_SHELL_ERROR_BAD_QUOTING = define(0)
  val G_SHELL_ERROR_EMPTY_STRING = define(1)
  val G_SHELL_ERROR_FAILED = define(2)
  def getName(value: GShellError): Option[String] =
    value match
      case `G_SHELL_ERROR_BAD_QUOTING` => Some("G_SHELL_ERROR_BAD_QUOTING")
      case `G_SHELL_ERROR_EMPTY_STRING` => Some("G_SHELL_ERROR_EMPTY_STRING")
      case `G_SHELL_ERROR_FAILED` => Some("G_SHELL_ERROR_FAILED")
      case _ => _root_.scala.None
  extension (a: GShellError)
    inline def &(b: GShellError): GShellError = a & b
    inline def |(b: GShellError): GShellError = a | b
    inline def is(b: GShellError): Boolean = (a & b) == b