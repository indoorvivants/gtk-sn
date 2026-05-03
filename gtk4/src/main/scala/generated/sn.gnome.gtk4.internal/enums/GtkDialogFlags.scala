package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkDialogFlags: _DIALOG_MODAL: Make the constructed dialog modal _DIALOG_DESTROY_WITH_PARENT: Destroy the dialog when its parent is destroyed _DIALOG_USE_HEADER_BAR: Create dialog with actions in header bar instead of action area
*/
opaque type GtkDialogFlags = CUnsignedInt
object GtkDialogFlags extends _BindgenEnumCUnsignedInt[GtkDialogFlags]:
  given _tag: Tag[GtkDialogFlags] = Tag.UInt
  inline def define(inline a: Long): GtkDialogFlags = a.toUInt
  val GTK_DIALOG_MODAL = define(1)
  val GTK_DIALOG_DESTROY_WITH_PARENT = define(2)
  val GTK_DIALOG_USE_HEADER_BAR = define(4)
  def getName(value: GtkDialogFlags): Option[String] =
    value match
      case `GTK_DIALOG_MODAL` => Some("GTK_DIALOG_MODAL")
      case `GTK_DIALOG_DESTROY_WITH_PARENT` => Some("GTK_DIALOG_DESTROY_WITH_PARENT")
      case `GTK_DIALOG_USE_HEADER_BAR` => Some("GTK_DIALOG_USE_HEADER_BAR")
      case _ => _root_.scala.None
  extension (a: GtkDialogFlags)
    inline def &(b: GtkDialogFlags): GtkDialogFlags = a & b
    inline def |(b: GtkDialogFlags): GtkDialogFlags = a | b
    inline def is(b: GtkDialogFlags): Boolean = (a & b) == b