package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkAccessibleProperty: _ACCESSIBLE_PROPERTY_AUTOCOMPLETE: Indicates whether inputting text could trigger display of one or more predictions of the user's intended value for a combobox, searchbox, or textbox and specifies how predictions would be presented if they were made. Value type: [enum] _ACCESSIBLE_PROPERTY_DESCRIPTION: Defines a string value that describes or annotates the current element. Value type: string _ACCESSIBLE_PROPERTY_HAS_POPUP: Indicates the availability and type of interactive popup element, such as menu or dialog, that can be triggered by an element. _ACCESSIBLE_PROPERTY_KEY_SHORTCUTS: Indicates keyboard shortcuts that an author has implemented to activate or give focus to an element. Value type: string _ACCESSIBLE_PROPERTY_LABEL: Defines a string value that labels the current element. Value type: string _ACCESSIBLE_PROPERTY_LEVEL: Defines the hierarchical level of an element within a structure. Value type: integer _ACCESSIBLE_PROPERTY_MODAL: Indicates whether an element is modal when displayed. Value type: boolean _ACCESSIBLE_PROPERTY_MULTI_LINE: Indicates whether a text box accepts multiple lines of input or only a single line. Value type: boolean _ACCESSIBLE_PROPERTY_MULTI_SELECTABLE: Indicates that the user may select more than one item from the current selectable descendants. Value type: boolean _ACCESSIBLE_PROPERTY_ORIENTATION: Indicates whether the element's orientation is horizontal, vertical, or unknown/ambiguous. Value type: [enum] _ACCESSIBLE_PROPERTY_PLACEHOLDER: Defines a short hint (a word or short phrase) intended to aid the user with data entry when the control has no value. A hint could be a sample value or a brief description of the expected format. Value type: string _ACCESSIBLE_PROPERTY_READ_ONLY: Indicates that the element is not editable, but is otherwise operable. Value type: boolean _ACCESSIBLE_PROPERTY_REQUIRED: Indicates that user input is required on the element before a form may be submitted. Value type: boolean _ACCESSIBLE_PROPERTY_ROLE_DESCRIPTION: Defines a human-readable, author-localized description for the role of an element. Value type: string _ACCESSIBLE_PROPERTY_SORT: Indicates if items in a table or grid are sorted in ascending or descending order. Value type: [enum] _ACCESSIBLE_PROPERTY_VALUE_MAX: Defines the maximum allowed value for a range widget. Value type: double _ACCESSIBLE_PROPERTY_VALUE_MIN: Defines the minimum allowed value for a range widget. Value type: double _ACCESSIBLE_PROPERTY_VALUE_NOW: Defines the current value for a range widget. Value type: double _ACCESSIBLE_PROPERTY_VALUE_TEXT: Defines the human readable text alternative of aria-valuenow for a range widget. Value type: string
*/
opaque type GtkAccessibleProperty = CUnsignedInt
object GtkAccessibleProperty extends _BindgenEnumCUnsignedInt[GtkAccessibleProperty]:
  given _tag: Tag[GtkAccessibleProperty] = Tag.UInt
  inline def define(inline a: Long): GtkAccessibleProperty = a.toUInt
  val GTK_ACCESSIBLE_PROPERTY_AUTOCOMPLETE = define(0)
  val GTK_ACCESSIBLE_PROPERTY_DESCRIPTION = define(1)
  val GTK_ACCESSIBLE_PROPERTY_HAS_POPUP = define(2)
  val GTK_ACCESSIBLE_PROPERTY_KEY_SHORTCUTS = define(3)
  val GTK_ACCESSIBLE_PROPERTY_LABEL = define(4)
  val GTK_ACCESSIBLE_PROPERTY_LEVEL = define(5)
  val GTK_ACCESSIBLE_PROPERTY_MODAL = define(6)
  val GTK_ACCESSIBLE_PROPERTY_MULTI_LINE = define(7)
  val GTK_ACCESSIBLE_PROPERTY_MULTI_SELECTABLE = define(8)
  val GTK_ACCESSIBLE_PROPERTY_ORIENTATION = define(9)
  val GTK_ACCESSIBLE_PROPERTY_PLACEHOLDER = define(10)
  val GTK_ACCESSIBLE_PROPERTY_READ_ONLY = define(11)
  val GTK_ACCESSIBLE_PROPERTY_REQUIRED = define(12)
  val GTK_ACCESSIBLE_PROPERTY_ROLE_DESCRIPTION = define(13)
  val GTK_ACCESSIBLE_PROPERTY_SORT = define(14)
  val GTK_ACCESSIBLE_PROPERTY_VALUE_MAX = define(15)
  val GTK_ACCESSIBLE_PROPERTY_VALUE_MIN = define(16)
  val GTK_ACCESSIBLE_PROPERTY_VALUE_NOW = define(17)
  val GTK_ACCESSIBLE_PROPERTY_VALUE_TEXT = define(18)
  def getName(value: GtkAccessibleProperty): Option[String] =
    value match
      case `GTK_ACCESSIBLE_PROPERTY_AUTOCOMPLETE` => Some("GTK_ACCESSIBLE_PROPERTY_AUTOCOMPLETE")
      case `GTK_ACCESSIBLE_PROPERTY_DESCRIPTION` => Some("GTK_ACCESSIBLE_PROPERTY_DESCRIPTION")
      case `GTK_ACCESSIBLE_PROPERTY_HAS_POPUP` => Some("GTK_ACCESSIBLE_PROPERTY_HAS_POPUP")
      case `GTK_ACCESSIBLE_PROPERTY_KEY_SHORTCUTS` => Some("GTK_ACCESSIBLE_PROPERTY_KEY_SHORTCUTS")
      case `GTK_ACCESSIBLE_PROPERTY_LABEL` => Some("GTK_ACCESSIBLE_PROPERTY_LABEL")
      case `GTK_ACCESSIBLE_PROPERTY_LEVEL` => Some("GTK_ACCESSIBLE_PROPERTY_LEVEL")
      case `GTK_ACCESSIBLE_PROPERTY_MODAL` => Some("GTK_ACCESSIBLE_PROPERTY_MODAL")
      case `GTK_ACCESSIBLE_PROPERTY_MULTI_LINE` => Some("GTK_ACCESSIBLE_PROPERTY_MULTI_LINE")
      case `GTK_ACCESSIBLE_PROPERTY_MULTI_SELECTABLE` => Some("GTK_ACCESSIBLE_PROPERTY_MULTI_SELECTABLE")
      case `GTK_ACCESSIBLE_PROPERTY_ORIENTATION` => Some("GTK_ACCESSIBLE_PROPERTY_ORIENTATION")
      case `GTK_ACCESSIBLE_PROPERTY_PLACEHOLDER` => Some("GTK_ACCESSIBLE_PROPERTY_PLACEHOLDER")
      case `GTK_ACCESSIBLE_PROPERTY_READ_ONLY` => Some("GTK_ACCESSIBLE_PROPERTY_READ_ONLY")
      case `GTK_ACCESSIBLE_PROPERTY_REQUIRED` => Some("GTK_ACCESSIBLE_PROPERTY_REQUIRED")
      case `GTK_ACCESSIBLE_PROPERTY_ROLE_DESCRIPTION` => Some("GTK_ACCESSIBLE_PROPERTY_ROLE_DESCRIPTION")
      case `GTK_ACCESSIBLE_PROPERTY_SORT` => Some("GTK_ACCESSIBLE_PROPERTY_SORT")
      case `GTK_ACCESSIBLE_PROPERTY_VALUE_MAX` => Some("GTK_ACCESSIBLE_PROPERTY_VALUE_MAX")
      case `GTK_ACCESSIBLE_PROPERTY_VALUE_MIN` => Some("GTK_ACCESSIBLE_PROPERTY_VALUE_MIN")
      case `GTK_ACCESSIBLE_PROPERTY_VALUE_NOW` => Some("GTK_ACCESSIBLE_PROPERTY_VALUE_NOW")
      case `GTK_ACCESSIBLE_PROPERTY_VALUE_TEXT` => Some("GTK_ACCESSIBLE_PROPERTY_VALUE_TEXT")
      case _ => _root_.scala.None
  extension (a: GtkAccessibleProperty)
    inline def &(b: GtkAccessibleProperty): GtkAccessibleProperty = a & b
    inline def |(b: GtkAccessibleProperty): GtkAccessibleProperty = a | b
    inline def is(b: GtkAccessibleProperty): Boolean = (a & b) == b