package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkStateFlags: _STATE_FLAG_NORMAL: State during normal operation _STATE_FLAG_ACTIVE: Widget is active _STATE_FLAG_PRELIGHT: Widget has a mouse pointer over it _STATE_FLAG_SELECTED: Widget is selected _STATE_FLAG_INSENSITIVE: Widget is insensitive _STATE_FLAG_INCONSISTENT: Widget is inconsistent _STATE_FLAG_FOCUSED: Widget has the keyboard focus _STATE_FLAG_BACKDROP: Widget is in a background toplevel window _STATE_FLAG_DIR_LTR: Widget is in left-to-right text direction _STATE_FLAG_DIR_RTL: Widget is in right-to-left text direction _STATE_FLAG_LINK: Widget is a link _STATE_FLAG_VISITED: The location the widget points to has already been visited _STATE_FLAG_CHECKED: Widget is checked _STATE_FLAG_DROP_ACTIVE: Widget is highlighted as a drop target for DND _STATE_FLAG_FOCUS_VISIBLE: Widget has the visible focus _STATE_FLAG_FOCUS_WITHIN: Widget contains the keyboard focus
*/
opaque type GtkStateFlags = CUnsignedInt
object GtkStateFlags extends _BindgenEnumCUnsignedInt[GtkStateFlags]:
  given _tag: Tag[GtkStateFlags] = Tag.UInt
  inline def define(inline a: Long): GtkStateFlags = a.toUInt
  val GTK_STATE_FLAG_NORMAL = define(0)
  val GTK_STATE_FLAG_ACTIVE = define(1)
  val GTK_STATE_FLAG_PRELIGHT = define(2)
  val GTK_STATE_FLAG_SELECTED = define(4)
  val GTK_STATE_FLAG_INSENSITIVE = define(8)
  val GTK_STATE_FLAG_INCONSISTENT = define(16)
  val GTK_STATE_FLAG_FOCUSED = define(32)
  val GTK_STATE_FLAG_BACKDROP = define(64)
  val GTK_STATE_FLAG_DIR_LTR = define(128)
  val GTK_STATE_FLAG_DIR_RTL = define(256)
  val GTK_STATE_FLAG_LINK = define(512)
  val GTK_STATE_FLAG_VISITED = define(1024)
  val GTK_STATE_FLAG_CHECKED = define(2048)
  val GTK_STATE_FLAG_DROP_ACTIVE = define(4096)
  val GTK_STATE_FLAG_FOCUS_VISIBLE = define(8192)
  val GTK_STATE_FLAG_FOCUS_WITHIN = define(16384)
  def getName(value: GtkStateFlags): Option[String] =
    value match
      case `GTK_STATE_FLAG_NORMAL` => Some("GTK_STATE_FLAG_NORMAL")
      case `GTK_STATE_FLAG_ACTIVE` => Some("GTK_STATE_FLAG_ACTIVE")
      case `GTK_STATE_FLAG_PRELIGHT` => Some("GTK_STATE_FLAG_PRELIGHT")
      case `GTK_STATE_FLAG_SELECTED` => Some("GTK_STATE_FLAG_SELECTED")
      case `GTK_STATE_FLAG_INSENSITIVE` => Some("GTK_STATE_FLAG_INSENSITIVE")
      case `GTK_STATE_FLAG_INCONSISTENT` => Some("GTK_STATE_FLAG_INCONSISTENT")
      case `GTK_STATE_FLAG_FOCUSED` => Some("GTK_STATE_FLAG_FOCUSED")
      case `GTK_STATE_FLAG_BACKDROP` => Some("GTK_STATE_FLAG_BACKDROP")
      case `GTK_STATE_FLAG_DIR_LTR` => Some("GTK_STATE_FLAG_DIR_LTR")
      case `GTK_STATE_FLAG_DIR_RTL` => Some("GTK_STATE_FLAG_DIR_RTL")
      case `GTK_STATE_FLAG_LINK` => Some("GTK_STATE_FLAG_LINK")
      case `GTK_STATE_FLAG_VISITED` => Some("GTK_STATE_FLAG_VISITED")
      case `GTK_STATE_FLAG_CHECKED` => Some("GTK_STATE_FLAG_CHECKED")
      case `GTK_STATE_FLAG_DROP_ACTIVE` => Some("GTK_STATE_FLAG_DROP_ACTIVE")
      case `GTK_STATE_FLAG_FOCUS_VISIBLE` => Some("GTK_STATE_FLAG_FOCUS_VISIBLE")
      case `GTK_STATE_FLAG_FOCUS_WITHIN` => Some("GTK_STATE_FLAG_FOCUS_WITHIN")
      case _ => _root_.scala.None
  extension (a: GtkStateFlags)
    inline def &(b: GtkStateFlags): GtkStateFlags = a & b
    inline def |(b: GtkStateFlags): GtkStateFlags = a | b
    inline def is(b: GtkStateFlags): Boolean = (a & b) == b