package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkShortcutScope: _SHORTCUT_SCOPE_LOCAL: Shortcuts are handled inside the widget the controller belongs to. _SHORTCUT_SCOPE_MANAGED: Shortcuts are handled by the first ancestor that is a [iface] _SHORTCUT_SCOPE_GLOBAL: Shortcuts are handled by the root widget.
*/
opaque type GtkShortcutScope = CUnsignedInt
object GtkShortcutScope extends _BindgenEnumCUnsignedInt[GtkShortcutScope]:
  given _tag: Tag[GtkShortcutScope] = Tag.UInt
  inline def define(inline a: Long): GtkShortcutScope = a.toUInt
  val GTK_SHORTCUT_SCOPE_LOCAL = define(0)
  val GTK_SHORTCUT_SCOPE_MANAGED = define(1)
  val GTK_SHORTCUT_SCOPE_GLOBAL = define(2)
  def getName(value: GtkShortcutScope): Option[String] =
    value match
      case `GTK_SHORTCUT_SCOPE_LOCAL` => Some("GTK_SHORTCUT_SCOPE_LOCAL")
      case `GTK_SHORTCUT_SCOPE_MANAGED` => Some("GTK_SHORTCUT_SCOPE_MANAGED")
      case `GTK_SHORTCUT_SCOPE_GLOBAL` => Some("GTK_SHORTCUT_SCOPE_GLOBAL")
      case _ => _root_.scala.None
  extension (a: GtkShortcutScope)
    inline def &(b: GtkShortcutScope): GtkShortcutScope = a & b
    inline def |(b: GtkShortcutScope): GtkShortcutScope = a | b
    inline def is(b: GtkShortcutScope): Boolean = (a & b) == b