package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkEditableProperties: _EDITABLE_PROP_TEXT: the property id for [property.Editable:text] _EDITABLE_PROP_CURSOR_POSITION: the property id for [property.Editable:cursor-position] _EDITABLE_PROP_SELECTION_BOUND: the property id for [property.Editable:selection-bound] _EDITABLE_PROP_EDITABLE: the property id for [property.Editable:editable] _EDITABLE_PROP_WIDTH_CHARS: the property id for [property.Editable:width-chars] _EDITABLE_PROP_MAX_WIDTH_CHARS: the property id for [property.Editable:max-width-chars] _EDITABLE_PROP_XALIGN: the property id for [property.Editable:xalign] _EDITABLE_PROP_ENABLE_UNDO: the property id for [property.Editable:enable-undo] _EDITABLE_NUM_PROPERTIES: the number of properties
*/
opaque type GtkEditableProperties = CUnsignedInt
object GtkEditableProperties extends _BindgenEnumCUnsignedInt[GtkEditableProperties]:
  given _tag: Tag[GtkEditableProperties] = Tag.UInt
  inline def define(inline a: Long): GtkEditableProperties = a.toUInt
  val GTK_EDITABLE_PROP_TEXT = define(0)
  val GTK_EDITABLE_PROP_CURSOR_POSITION = define(1)
  val GTK_EDITABLE_PROP_SELECTION_BOUND = define(2)
  val GTK_EDITABLE_PROP_EDITABLE = define(3)
  val GTK_EDITABLE_PROP_WIDTH_CHARS = define(4)
  val GTK_EDITABLE_PROP_MAX_WIDTH_CHARS = define(5)
  val GTK_EDITABLE_PROP_XALIGN = define(6)
  val GTK_EDITABLE_PROP_ENABLE_UNDO = define(7)
  val GTK_EDITABLE_NUM_PROPERTIES = define(8)
  def getName(value: GtkEditableProperties): Option[String] =
    value match
      case `GTK_EDITABLE_PROP_TEXT` => Some("GTK_EDITABLE_PROP_TEXT")
      case `GTK_EDITABLE_PROP_CURSOR_POSITION` => Some("GTK_EDITABLE_PROP_CURSOR_POSITION")
      case `GTK_EDITABLE_PROP_SELECTION_BOUND` => Some("GTK_EDITABLE_PROP_SELECTION_BOUND")
      case `GTK_EDITABLE_PROP_EDITABLE` => Some("GTK_EDITABLE_PROP_EDITABLE")
      case `GTK_EDITABLE_PROP_WIDTH_CHARS` => Some("GTK_EDITABLE_PROP_WIDTH_CHARS")
      case `GTK_EDITABLE_PROP_MAX_WIDTH_CHARS` => Some("GTK_EDITABLE_PROP_MAX_WIDTH_CHARS")
      case `GTK_EDITABLE_PROP_XALIGN` => Some("GTK_EDITABLE_PROP_XALIGN")
      case `GTK_EDITABLE_PROP_ENABLE_UNDO` => Some("GTK_EDITABLE_PROP_ENABLE_UNDO")
      case `GTK_EDITABLE_NUM_PROPERTIES` => Some("GTK_EDITABLE_NUM_PROPERTIES")
      case _ => _root_.scala.None
  extension (a: GtkEditableProperties)
    inline def &(b: GtkEditableProperties): GtkEditableProperties = a & b
    inline def |(b: GtkEditableProperties): GtkEditableProperties = a | b
    inline def is(b: GtkEditableProperties): Boolean = (a & b) == b