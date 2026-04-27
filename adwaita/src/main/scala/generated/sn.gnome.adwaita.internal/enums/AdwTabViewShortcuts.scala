package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-tab-view.h
*/
opaque type AdwTabViewShortcuts = CUnsignedInt
object AdwTabViewShortcuts extends _BindgenEnumCUnsignedInt[AdwTabViewShortcuts]:
  given _tag: Tag[AdwTabViewShortcuts] = Tag.UInt
  inline def define(inline a: Long): AdwTabViewShortcuts = a.toUInt
  val ADW_TAB_VIEW_SHORTCUT_NONE = define(0)
  val ADW_TAB_VIEW_SHORTCUT_CONTROL_TAB = define(1)
  val ADW_TAB_VIEW_SHORTCUT_CONTROL_SHIFT_TAB = define(2)
  val ADW_TAB_VIEW_SHORTCUT_CONTROL_PAGE_UP = define(4)
  val ADW_TAB_VIEW_SHORTCUT_CONTROL_PAGE_DOWN = define(8)
  val ADW_TAB_VIEW_SHORTCUT_CONTROL_HOME = define(16)
  val ADW_TAB_VIEW_SHORTCUT_CONTROL_END = define(32)
  val ADW_TAB_VIEW_SHORTCUT_CONTROL_SHIFT_PAGE_UP = define(64)
  val ADW_TAB_VIEW_SHORTCUT_CONTROL_SHIFT_PAGE_DOWN = define(128)
  val ADW_TAB_VIEW_SHORTCUT_CONTROL_SHIFT_HOME = define(256)
  val ADW_TAB_VIEW_SHORTCUT_CONTROL_SHIFT_END = define(512)
  val ADW_TAB_VIEW_SHORTCUT_ALT_DIGITS = define(1024)
  val ADW_TAB_VIEW_SHORTCUT_ALT_ZERO = define(2048)
  val ADW_TAB_VIEW_SHORTCUT_ALL_SHORTCUTS = define(4095)
  def getName(value: AdwTabViewShortcuts): Option[String] =
    value match
      case `ADW_TAB_VIEW_SHORTCUT_NONE` => Some("ADW_TAB_VIEW_SHORTCUT_NONE")
      case `ADW_TAB_VIEW_SHORTCUT_CONTROL_TAB` => Some("ADW_TAB_VIEW_SHORTCUT_CONTROL_TAB")
      case `ADW_TAB_VIEW_SHORTCUT_CONTROL_SHIFT_TAB` => Some("ADW_TAB_VIEW_SHORTCUT_CONTROL_SHIFT_TAB")
      case `ADW_TAB_VIEW_SHORTCUT_CONTROL_PAGE_UP` => Some("ADW_TAB_VIEW_SHORTCUT_CONTROL_PAGE_UP")
      case `ADW_TAB_VIEW_SHORTCUT_CONTROL_PAGE_DOWN` => Some("ADW_TAB_VIEW_SHORTCUT_CONTROL_PAGE_DOWN")
      case `ADW_TAB_VIEW_SHORTCUT_CONTROL_HOME` => Some("ADW_TAB_VIEW_SHORTCUT_CONTROL_HOME")
      case `ADW_TAB_VIEW_SHORTCUT_CONTROL_END` => Some("ADW_TAB_VIEW_SHORTCUT_CONTROL_END")
      case `ADW_TAB_VIEW_SHORTCUT_CONTROL_SHIFT_PAGE_UP` => Some("ADW_TAB_VIEW_SHORTCUT_CONTROL_SHIFT_PAGE_UP")
      case `ADW_TAB_VIEW_SHORTCUT_CONTROL_SHIFT_PAGE_DOWN` => Some("ADW_TAB_VIEW_SHORTCUT_CONTROL_SHIFT_PAGE_DOWN")
      case `ADW_TAB_VIEW_SHORTCUT_CONTROL_SHIFT_HOME` => Some("ADW_TAB_VIEW_SHORTCUT_CONTROL_SHIFT_HOME")
      case `ADW_TAB_VIEW_SHORTCUT_CONTROL_SHIFT_END` => Some("ADW_TAB_VIEW_SHORTCUT_CONTROL_SHIFT_END")
      case `ADW_TAB_VIEW_SHORTCUT_ALT_DIGITS` => Some("ADW_TAB_VIEW_SHORTCUT_ALT_DIGITS")
      case `ADW_TAB_VIEW_SHORTCUT_ALT_ZERO` => Some("ADW_TAB_VIEW_SHORTCUT_ALT_ZERO")
      case `ADW_TAB_VIEW_SHORTCUT_ALL_SHORTCUTS` => Some("ADW_TAB_VIEW_SHORTCUT_ALL_SHORTCUTS")
      case _ => _root_.scala.None
  extension (a: AdwTabViewShortcuts)
    inline def &(b: AdwTabViewShortcuts): AdwTabViewShortcuts = a & b
    inline def |(b: AdwTabViewShortcuts): AdwTabViewShortcuts = a | b
    inline def is(b: AdwTabViewShortcuts): Boolean = (a & b) == b