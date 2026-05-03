package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkPadActionType: _PAD_ACTION_BUTTON: Action is triggered by a pad button _PAD_ACTION_RING: Action is triggered by a pad ring _PAD_ACTION_STRIP: Action is triggered by a pad strip
*/
opaque type GtkPadActionType = CUnsignedInt
object GtkPadActionType extends _BindgenEnumCUnsignedInt[GtkPadActionType]:
  given _tag: Tag[GtkPadActionType] = Tag.UInt
  inline def define(inline a: Long): GtkPadActionType = a.toUInt
  val GTK_PAD_ACTION_BUTTON = define(0)
  val GTK_PAD_ACTION_RING = define(1)
  val GTK_PAD_ACTION_STRIP = define(2)
  def getName(value: GtkPadActionType): Option[String] =
    value match
      case `GTK_PAD_ACTION_BUTTON` => Some("GTK_PAD_ACTION_BUTTON")
      case `GTK_PAD_ACTION_RING` => Some("GTK_PAD_ACTION_RING")
      case `GTK_PAD_ACTION_STRIP` => Some("GTK_PAD_ACTION_STRIP")
      case _ => _root_.scala.None
  extension (a: GtkPadActionType)
    inline def &(b: GtkPadActionType): GtkPadActionType = a & b
    inline def |(b: GtkPadActionType): GtkPadActionType = a | b
    inline def is(b: GtkPadActionType): Boolean = (a & b) == b