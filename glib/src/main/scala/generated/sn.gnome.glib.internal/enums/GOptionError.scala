package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GOptionError: _OPTION_ERROR_UNKNOWN_OPTION: An option was not known to the parser. This error will only be reported, if the parser hasn't been instructed to ignore unknown options, see g_option_context_set_ignore_unknown_options(). _OPTION_ERROR_BAD_VALUE: A value couldn't be parsed. _OPTION_ERROR_FAILED: A #GOptionArgFunc callback failed.
*/
opaque type GOptionError = CUnsignedInt
object GOptionError extends _BindgenEnumCUnsignedInt[GOptionError]:
  given _tag: Tag[GOptionError] = Tag.UInt
  inline def define(inline a: Long): GOptionError = a.toUInt
  val G_OPTION_ERROR_UNKNOWN_OPTION = define(0)
  val G_OPTION_ERROR_BAD_VALUE = define(1)
  val G_OPTION_ERROR_FAILED = define(2)
  def getName(value: GOptionError): Option[String] =
    value match
      case `G_OPTION_ERROR_UNKNOWN_OPTION` => Some("G_OPTION_ERROR_UNKNOWN_OPTION")
      case `G_OPTION_ERROR_BAD_VALUE` => Some("G_OPTION_ERROR_BAD_VALUE")
      case `G_OPTION_ERROR_FAILED` => Some("G_OPTION_ERROR_FAILED")
      case _ => _root_.scala.None
  extension (a: GOptionError)
    inline def &(b: GOptionError): GOptionError = a & b
    inline def |(b: GOptionError): GOptionError = a | b
    inline def is(b: GOptionError): Boolean = (a & b) == b