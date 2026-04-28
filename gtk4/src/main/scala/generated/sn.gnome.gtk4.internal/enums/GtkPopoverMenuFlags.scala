package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkPopoverMenuFlags: _POPOVER_MENU_NESTED: Submenus are presented as traditional, nested popovers.
*/
opaque type GtkPopoverMenuFlags = CUnsignedInt
object GtkPopoverMenuFlags extends _BindgenEnumCUnsignedInt[GtkPopoverMenuFlags]:
  given _tag: Tag[GtkPopoverMenuFlags] = Tag.UInt
  inline def define(inline a: Long): GtkPopoverMenuFlags = a.toUInt
  val GTK_POPOVER_MENU_SLIDING = define(0)
  val GTK_POPOVER_MENU_NESTED = define(1)
  def getName(value: GtkPopoverMenuFlags): Option[String] =
    value match
      case `GTK_POPOVER_MENU_SLIDING` => Some("GTK_POPOVER_MENU_SLIDING")
      case `GTK_POPOVER_MENU_NESTED` => Some("GTK_POPOVER_MENU_NESTED")
      case _ => _root_.scala.None
  extension (a: GtkPopoverMenuFlags)
    inline def &(b: GtkPopoverMenuFlags): GtkPopoverMenuFlags = a & b
    inline def |(b: GtkPopoverMenuFlags): GtkPopoverMenuFlags = a | b
    inline def is(b: GtkPopoverMenuFlags): Boolean = (a & b) == b