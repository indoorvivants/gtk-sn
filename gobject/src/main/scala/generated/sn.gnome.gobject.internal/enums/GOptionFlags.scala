package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.3: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GOptionFlags: _OPTION_FLAG_NONE: No flags. Since: 2.42. _OPTION_FLAG_HIDDEN: The option doesn't appear in `--help` output. _OPTION_FLAG_IN_MAIN: The option appears in the main section of the `--help` output, even if it is defined in a group. _OPTION_FLAG_REVERSE: For options of the %G_OPTION_ARG_NONE kind, this flag indicates that the sense of the option is reversed. i.e. %FALSE will be stored into the argument rather than %TRUE. _OPTION_FLAG_NO_ARG: For options of the %G_OPTION_ARG_CALLBACK kind, this flag indicates that the callback does not take any argument (like a %G_OPTION_ARG_NONE option). Since 2.8 _OPTION_FLAG_FILENAME: For options of the %G_OPTION_ARG_CALLBACK kind, this flag indicates that the argument should be passed to the callback in the GLib filename encoding rather than UTF-8. Since 2.8 _OPTION_FLAG_OPTIONAL_ARG: For options of the %G_OPTION_ARG_CALLBACK kind, this flag indicates that the argument supply is optional. If no argument is given then data of %GOptionParseFunc will be set to NULL. Since 2.8 _OPTION_FLAG_NOALIAS: This flag turns off the automatic conflict resolution which prefixes long option names with `groupname-` if there is a conflict. This option should only be used in situations where aliasing is necessary to model some legacy commandline interface. It is not safe to use this option, unless all option groups are under your direct control. Since 2.8.
*/
opaque type GOptionFlags = CUnsignedInt
object GOptionFlags extends _BindgenEnumCUnsignedInt[GOptionFlags]:
  given _tag: Tag[GOptionFlags] = Tag.UInt
  inline def define(inline a: Long): GOptionFlags = a.toUInt
  val G_OPTION_FLAG_NONE = define(0)
  val G_OPTION_FLAG_HIDDEN = define(1)
  val G_OPTION_FLAG_IN_MAIN = define(2)
  val G_OPTION_FLAG_REVERSE = define(4)
  val G_OPTION_FLAG_NO_ARG = define(8)
  val G_OPTION_FLAG_FILENAME = define(16)
  val G_OPTION_FLAG_OPTIONAL_ARG = define(32)
  val G_OPTION_FLAG_NOALIAS = define(64)
  def getName(value: GOptionFlags): Option[String] =
    value match
      case `G_OPTION_FLAG_NONE` => Some("G_OPTION_FLAG_NONE")
      case `G_OPTION_FLAG_HIDDEN` => Some("G_OPTION_FLAG_HIDDEN")
      case `G_OPTION_FLAG_IN_MAIN` => Some("G_OPTION_FLAG_IN_MAIN")
      case `G_OPTION_FLAG_REVERSE` => Some("G_OPTION_FLAG_REVERSE")
      case `G_OPTION_FLAG_NO_ARG` => Some("G_OPTION_FLAG_NO_ARG")
      case `G_OPTION_FLAG_FILENAME` => Some("G_OPTION_FLAG_FILENAME")
      case `G_OPTION_FLAG_OPTIONAL_ARG` => Some("G_OPTION_FLAG_OPTIONAL_ARG")
      case `G_OPTION_FLAG_NOALIAS` => Some("G_OPTION_FLAG_NOALIAS")
      case _ => _root_.scala.None
  extension (a: GOptionFlags)
    inline def &(b: GOptionFlags): GOptionFlags = a & b
    inline def |(b: GOptionFlags): GOptionFlags = a | b
    inline def is(b: GOptionFlags): Boolean = (a & b) == b