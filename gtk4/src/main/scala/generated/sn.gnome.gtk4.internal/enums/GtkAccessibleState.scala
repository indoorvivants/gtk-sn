package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkAccessibleState: _ACCESSIBLE_STATE_BUSY: A “busy” state. This state has boolean values _ACCESSIBLE_STATE_CHECKED: A “checked” state; indicates the current state of a [class]. Value type: [enum] _ACCESSIBLE_STATE_DISABLED: A “disabled” state; corresponds to the [property:sensitive] property. It indicates a UI element that is perceivable, but not editable or operable. Value type: boolean _ACCESSIBLE_STATE_EXPANDED: An “expanded” state; corresponds to the [property:expanded] property. Value type: boolean or undefined _ACCESSIBLE_STATE_HIDDEN: A “hidden” state; corresponds to the [property:visible] property. You can use this state explicitly on UI elements that should not be exposed to an assistive technology. Value type: boolean See also: %GTK_ACCESSIBLE_STATE_DISABLED _ACCESSIBLE_STATE_INVALID: An “invalid” state; set when a widget is showing an error. Value type: [enum] _ACCESSIBLE_STATE_PRESSED: A “pressed” state; indicates the current state of a [class]. Value type: [enum] enumeration _ACCESSIBLE_STATE_SELECTED: A “selected” state; set when a widget is selected. Value type: boolean or undefined
*/
opaque type GtkAccessibleState = CUnsignedInt
object GtkAccessibleState extends _BindgenEnumCUnsignedInt[GtkAccessibleState]:
  given _tag: Tag[GtkAccessibleState] = Tag.UInt
  inline def define(inline a: Long): GtkAccessibleState = a.toUInt
  val GTK_ACCESSIBLE_STATE_BUSY = define(0)
  val GTK_ACCESSIBLE_STATE_CHECKED = define(1)
  val GTK_ACCESSIBLE_STATE_DISABLED = define(2)
  val GTK_ACCESSIBLE_STATE_EXPANDED = define(3)
  val GTK_ACCESSIBLE_STATE_HIDDEN = define(4)
  val GTK_ACCESSIBLE_STATE_INVALID = define(5)
  val GTK_ACCESSIBLE_STATE_PRESSED = define(6)
  val GTK_ACCESSIBLE_STATE_SELECTED = define(7)
  val GTK_ACCESSIBLE_STATE_VISITED = define(8)
  def getName(value: GtkAccessibleState): Option[String] =
    value match
      case `GTK_ACCESSIBLE_STATE_BUSY` => Some("GTK_ACCESSIBLE_STATE_BUSY")
      case `GTK_ACCESSIBLE_STATE_CHECKED` => Some("GTK_ACCESSIBLE_STATE_CHECKED")
      case `GTK_ACCESSIBLE_STATE_DISABLED` => Some("GTK_ACCESSIBLE_STATE_DISABLED")
      case `GTK_ACCESSIBLE_STATE_EXPANDED` => Some("GTK_ACCESSIBLE_STATE_EXPANDED")
      case `GTK_ACCESSIBLE_STATE_HIDDEN` => Some("GTK_ACCESSIBLE_STATE_HIDDEN")
      case `GTK_ACCESSIBLE_STATE_INVALID` => Some("GTK_ACCESSIBLE_STATE_INVALID")
      case `GTK_ACCESSIBLE_STATE_PRESSED` => Some("GTK_ACCESSIBLE_STATE_PRESSED")
      case `GTK_ACCESSIBLE_STATE_SELECTED` => Some("GTK_ACCESSIBLE_STATE_SELECTED")
      case `GTK_ACCESSIBLE_STATE_VISITED` => Some("GTK_ACCESSIBLE_STATE_VISITED")
      case _ => _root_.scala.None
  extension (a: GtkAccessibleState)
    inline def &(b: GtkAccessibleState): GtkAccessibleState = a & b
    inline def |(b: GtkAccessibleState): GtkAccessibleState = a | b
    inline def is(b: GtkAccessibleState): Boolean = (a & b) == b