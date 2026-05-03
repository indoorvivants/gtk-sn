package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkSelectionMode: _SELECTION_NONE: No selection is possible. _SELECTION_SINGLE: Zero or one element may be selected. _SELECTION_BROWSE: Exactly one element is selected. In some circumstances, such as initially or during a search operation, it’s possible for no element to be selected with %GTK_SELECTION_BROWSE. What is really enforced is that the user can’t deselect a currently selected element except by selecting another element. _SELECTION_MULTIPLE: Any number of elements may be selected. The Ctrl key may be used to enlarge the selection, and Shift key to select between the focus and the child pointed to. Some widgets may also allow Click-drag to select a range of elements.
*/
opaque type GtkSelectionMode = CUnsignedInt
object GtkSelectionMode extends _BindgenEnumCUnsignedInt[GtkSelectionMode]:
  given _tag: Tag[GtkSelectionMode] = Tag.UInt
  inline def define(inline a: Long): GtkSelectionMode = a.toUInt
  val GTK_SELECTION_NONE = define(0)
  val GTK_SELECTION_SINGLE = define(1)
  val GTK_SELECTION_BROWSE = define(2)
  val GTK_SELECTION_MULTIPLE = define(3)
  def getName(value: GtkSelectionMode): Option[String] =
    value match
      case `GTK_SELECTION_NONE` => Some("GTK_SELECTION_NONE")
      case `GTK_SELECTION_SINGLE` => Some("GTK_SELECTION_SINGLE")
      case `GTK_SELECTION_BROWSE` => Some("GTK_SELECTION_BROWSE")
      case `GTK_SELECTION_MULTIPLE` => Some("GTK_SELECTION_MULTIPLE")
      case _ => _root_.scala.None
  extension (a: GtkSelectionMode)
    inline def &(b: GtkSelectionMode): GtkSelectionMode = a & b
    inline def |(b: GtkSelectionMode): GtkSelectionMode = a | b
    inline def is(b: GtkSelectionMode): Boolean = (a & b) == b