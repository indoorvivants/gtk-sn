package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkEntryIconPosition: _ENTRY_ICON_PRIMARY: At the beginning of the entry (depending on the text direction). _ENTRY_ICON_SECONDARY: At the end of the entry (depending on the text direction).
*/
opaque type GtkEntryIconPosition = CUnsignedInt
object GtkEntryIconPosition extends _BindgenEnumCUnsignedInt[GtkEntryIconPosition]:
  given _tag: Tag[GtkEntryIconPosition] = Tag.UInt
  inline def define(inline a: Long): GtkEntryIconPosition = a.toUInt
  val GTK_ENTRY_ICON_PRIMARY = define(0)
  val GTK_ENTRY_ICON_SECONDARY = define(1)
  def getName(value: GtkEntryIconPosition): Option[String] =
    value match
      case `GTK_ENTRY_ICON_PRIMARY` => Some("GTK_ENTRY_ICON_PRIMARY")
      case `GTK_ENTRY_ICON_SECONDARY` => Some("GTK_ENTRY_ICON_SECONDARY")
      case _ => _root_.scala.None
  extension (a: GtkEntryIconPosition)
    inline def &(b: GtkEntryIconPosition): GtkEntryIconPosition = a & b
    inline def |(b: GtkEntryIconPosition): GtkEntryIconPosition = a | b
    inline def is(b: GtkEntryIconPosition): Boolean = (a & b) == b