package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkApplicationInhibitFlags = CUnsignedInt
object GtkApplicationInhibitFlags extends _BindgenEnumCUnsignedInt[GtkApplicationInhibitFlags]:
  given _tag: Tag[GtkApplicationInhibitFlags] = Tag.UInt
  inline def define(inline a: Long): GtkApplicationInhibitFlags = a.toUInt
  val GTK_APPLICATION_INHIBIT_LOGOUT = define(1)
  val GTK_APPLICATION_INHIBIT_SWITCH = define(2)
  val GTK_APPLICATION_INHIBIT_SUSPEND = define(4)
  val GTK_APPLICATION_INHIBIT_IDLE = define(8)
  def getName(value: GtkApplicationInhibitFlags): Option[String] =
    value match
      case `GTK_APPLICATION_INHIBIT_LOGOUT` => Some("GTK_APPLICATION_INHIBIT_LOGOUT")
      case `GTK_APPLICATION_INHIBIT_SWITCH` => Some("GTK_APPLICATION_INHIBIT_SWITCH")
      case `GTK_APPLICATION_INHIBIT_SUSPEND` => Some("GTK_APPLICATION_INHIBIT_SUSPEND")
      case `GTK_APPLICATION_INHIBIT_IDLE` => Some("GTK_APPLICATION_INHIBIT_IDLE")
      case _ => _root_.scala.None
  extension (a: GtkApplicationInhibitFlags)
    inline def &(b: GtkApplicationInhibitFlags): GtkApplicationInhibitFlags = a & b
    inline def |(b: GtkApplicationInhibitFlags): GtkApplicationInhibitFlags = a | b
    inline def is(b: GtkApplicationInhibitFlags): Boolean = (a & b) == b