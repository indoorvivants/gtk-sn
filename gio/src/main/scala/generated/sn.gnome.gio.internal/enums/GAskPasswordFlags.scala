package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GAskPasswordFlags: _ASK_PASSWORD_NEED_PASSWORD: operation requires a password. _ASK_PASSWORD_NEED_USERNAME: operation requires a username. _ASK_PASSWORD_NEED_DOMAIN: operation requires a domain. _ASK_PASSWORD_SAVING_SUPPORTED: operation supports saving settings. _ASK_PASSWORD_ANONYMOUS_SUPPORTED: operation supports anonymous users. _ASK_PASSWORD_TCRYPT: operation takes TCRYPT parameters (Since: 2.58)
*/
opaque type GAskPasswordFlags = CUnsignedInt
object GAskPasswordFlags extends _BindgenEnumCUnsignedInt[GAskPasswordFlags]:
  given _tag: Tag[GAskPasswordFlags] = Tag.UInt
  inline def define(inline a: Long): GAskPasswordFlags = a.toUInt
  val G_ASK_PASSWORD_NEED_PASSWORD = define(1)
  val G_ASK_PASSWORD_NEED_USERNAME = define(2)
  val G_ASK_PASSWORD_NEED_DOMAIN = define(4)
  val G_ASK_PASSWORD_SAVING_SUPPORTED = define(8)
  val G_ASK_PASSWORD_ANONYMOUS_SUPPORTED = define(16)
  val G_ASK_PASSWORD_TCRYPT = define(32)
  def getName(value: GAskPasswordFlags): Option[String] =
    value match
      case `G_ASK_PASSWORD_NEED_PASSWORD` => Some("G_ASK_PASSWORD_NEED_PASSWORD")
      case `G_ASK_PASSWORD_NEED_USERNAME` => Some("G_ASK_PASSWORD_NEED_USERNAME")
      case `G_ASK_PASSWORD_NEED_DOMAIN` => Some("G_ASK_PASSWORD_NEED_DOMAIN")
      case `G_ASK_PASSWORD_SAVING_SUPPORTED` => Some("G_ASK_PASSWORD_SAVING_SUPPORTED")
      case `G_ASK_PASSWORD_ANONYMOUS_SUPPORTED` => Some("G_ASK_PASSWORD_ANONYMOUS_SUPPORTED")
      case `G_ASK_PASSWORD_TCRYPT` => Some("G_ASK_PASSWORD_TCRYPT")
      case _ => _root_.scala.None
  extension (a: GAskPasswordFlags)
    inline def &(b: GAskPasswordFlags): GAskPasswordFlags = a & b
    inline def |(b: GAskPasswordFlags): GAskPasswordFlags = a | b
    inline def is(b: GAskPasswordFlags): Boolean = (a & b) == b