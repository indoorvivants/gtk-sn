package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GAppInfoCreateFlags: _APP_INFO_CREATE_NONE: No flags. _APP_INFO_CREATE_NEEDS_TERMINAL: Application opens in a terminal window. _APP_INFO_CREATE_SUPPORTS_URIS: Application supports URI arguments. _APP_INFO_CREATE_SUPPORTS_STARTUP_NOTIFICATION: Application supports startup notification. Since 2.26
*/
opaque type GAppInfoCreateFlags = CUnsignedInt
object GAppInfoCreateFlags extends _BindgenEnumCUnsignedInt[GAppInfoCreateFlags]:
  given _tag: Tag[GAppInfoCreateFlags] = Tag.UInt
  inline def define(inline a: Long): GAppInfoCreateFlags = a.toUInt
  val G_APP_INFO_CREATE_NONE = define(0)
  val G_APP_INFO_CREATE_NEEDS_TERMINAL = define(1)
  val G_APP_INFO_CREATE_SUPPORTS_URIS = define(2)
  val G_APP_INFO_CREATE_SUPPORTS_STARTUP_NOTIFICATION = define(4)
  def getName(value: GAppInfoCreateFlags): Option[String] =
    value match
      case `G_APP_INFO_CREATE_NONE` => Some("G_APP_INFO_CREATE_NONE")
      case `G_APP_INFO_CREATE_NEEDS_TERMINAL` => Some("G_APP_INFO_CREATE_NEEDS_TERMINAL")
      case `G_APP_INFO_CREATE_SUPPORTS_URIS` => Some("G_APP_INFO_CREATE_SUPPORTS_URIS")
      case `G_APP_INFO_CREATE_SUPPORTS_STARTUP_NOTIFICATION` => Some("G_APP_INFO_CREATE_SUPPORTS_STARTUP_NOTIFICATION")
      case _ => _root_.scala.None
  extension (a: GAppInfoCreateFlags)
    inline def &(b: GAppInfoCreateFlags): GAppInfoCreateFlags = a & b
    inline def |(b: GAppInfoCreateFlags): GAppInfoCreateFlags = a | b
    inline def is(b: GAppInfoCreateFlags): Boolean = (a & b) == b