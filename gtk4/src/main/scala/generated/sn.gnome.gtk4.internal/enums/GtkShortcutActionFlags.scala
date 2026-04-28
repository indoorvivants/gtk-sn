package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkShortcutActionFlags: _SHORTCUT_ACTION_EXCLUSIVE: The action is the only action that can be activated. If this flag is not set, a future activation may select a different action.
*/
opaque type GtkShortcutActionFlags = CUnsignedInt
object GtkShortcutActionFlags extends _BindgenEnumCUnsignedInt[GtkShortcutActionFlags]:
  given _tag: Tag[GtkShortcutActionFlags] = Tag.UInt
  inline def define(inline a: Long): GtkShortcutActionFlags = a.toUInt
  val GTK_SHORTCUT_ACTION_EXCLUSIVE = define(1)
  def getName(value: GtkShortcutActionFlags): Option[String] =
    value match
      case `GTK_SHORTCUT_ACTION_EXCLUSIVE` => Some("GTK_SHORTCUT_ACTION_EXCLUSIVE")
      case _ => _root_.scala.None
  extension (a: GtkShortcutActionFlags)
    inline def &(b: GtkShortcutActionFlags): GtkShortcutActionFlags = a & b
    inline def |(b: GtkShortcutActionFlags): GtkShortcutActionFlags = a | b
    inline def is(b: GtkShortcutActionFlags): Boolean = (a & b) == b