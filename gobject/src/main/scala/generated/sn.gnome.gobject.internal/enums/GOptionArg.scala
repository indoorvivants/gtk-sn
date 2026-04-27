package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.3: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GOptionArg: _OPTION_ARG_NONE: No extra argument. This is useful for simple flags or booleans. _OPTION_ARG_STRING: The option takes a UTF-8 string argument. _OPTION_ARG_INT: The option takes an integer argument. _OPTION_ARG_CALLBACK: The option provides a callback (of type #GOptionArgFunc) to parse the extra argument. _OPTION_ARG_FILENAME: The option takes a filename as argument, which will be in the GLib filename encoding rather than UTF-8. _OPTION_ARG_STRING_ARRAY: The option takes a string argument, multiple uses of the option are collected into an array of strings. _OPTION_ARG_FILENAME_ARRAY: The option takes a filename as argument, multiple uses of the option are collected into an array of strings. _OPTION_ARG_DOUBLE: The option takes a double argument. The argument can be formatted either for the user's locale or for the "C" locale. Since 2.12 _OPTION_ARG_INT64: The option takes a 64-bit integer. Like %G_OPTION_ARG_INT but for larger numbers. The number can be in decimal base, or in hexadecimal (when prefixed with `0x`, for example, `0xffffffff`). Since 2.12
*/
opaque type GOptionArg = CUnsignedInt
object GOptionArg extends _BindgenEnumCUnsignedInt[GOptionArg]:
  given _tag: Tag[GOptionArg] = Tag.UInt
  inline def define(inline a: Long): GOptionArg = a.toUInt
  val G_OPTION_ARG_NONE = define(0)
  val G_OPTION_ARG_STRING = define(1)
  val G_OPTION_ARG_INT = define(2)
  val G_OPTION_ARG_CALLBACK = define(3)
  val G_OPTION_ARG_FILENAME = define(4)
  val G_OPTION_ARG_STRING_ARRAY = define(5)
  val G_OPTION_ARG_FILENAME_ARRAY = define(6)
  val G_OPTION_ARG_DOUBLE = define(7)
  val G_OPTION_ARG_INT64 = define(8)
  def getName(value: GOptionArg): Option[String] =
    value match
      case `G_OPTION_ARG_NONE` => Some("G_OPTION_ARG_NONE")
      case `G_OPTION_ARG_STRING` => Some("G_OPTION_ARG_STRING")
      case `G_OPTION_ARG_INT` => Some("G_OPTION_ARG_INT")
      case `G_OPTION_ARG_CALLBACK` => Some("G_OPTION_ARG_CALLBACK")
      case `G_OPTION_ARG_FILENAME` => Some("G_OPTION_ARG_FILENAME")
      case `G_OPTION_ARG_STRING_ARRAY` => Some("G_OPTION_ARG_STRING_ARRAY")
      case `G_OPTION_ARG_FILENAME_ARRAY` => Some("G_OPTION_ARG_FILENAME_ARRAY")
      case `G_OPTION_ARG_DOUBLE` => Some("G_OPTION_ARG_DOUBLE")
      case `G_OPTION_ARG_INT64` => Some("G_OPTION_ARG_INT64")
      case _ => _root_.scala.None
  extension (a: GOptionArg)
    inline def &(b: GOptionArg): GOptionArg = a & b
    inline def |(b: GOptionArg): GOptionArg = a | b
    inline def is(b: GOptionArg): Boolean = (a & b) == b