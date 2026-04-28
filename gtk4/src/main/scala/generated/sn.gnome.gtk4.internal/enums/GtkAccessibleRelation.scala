package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkAccessibleRelation: _ACCESSIBLE_RELATION_ACTIVE_DESCENDANT: Identifies the currently active element when focus is on a composite widget, combobox, textbox, group, or application. Value type: reference _ACCESSIBLE_RELATION_COL_COUNT: Defines the total number of columns in a table, grid, or treegrid. Value type: integer _ACCESSIBLE_RELATION_COL_INDEX: Defines an element's column index or position with respect to the total number of columns within a table, grid, or treegrid. Value type: integer _ACCESSIBLE_RELATION_COL_INDEX_TEXT: Defines a human readable text alternative of %GTK_ACCESSIBLE_RELATION_COL_INDEX. Value type: string _ACCESSIBLE_RELATION_COL_SPAN: Defines the number of columns spanned by a cell or gridcell within a table, grid, or treegrid. Value type: integer _ACCESSIBLE_RELATION_CONTROLS: Identifies the element (or elements) whose contents or presence are controlled by the current element. Value type: reference _ACCESSIBLE_RELATION_DESCRIBED_BY: Identifies the element (or elements) that describes the object. Value type: reference _ACCESSIBLE_RELATION_DETAILS: Identifies the element (or elements) that provide additional information related to the object. Value type: reference _ACCESSIBLE_RELATION_ERROR_MESSAGE: Identifies the element that provides an error message for an object. Value type: reference _ACCESSIBLE_RELATION_FLOW_TO: Identifies the next element (or elements) in an alternate reading order of content which, at the user's discretion, allows assistive technology to override the general default of reading in document source order. Value type: reference _ACCESSIBLE_RELATION_LABELLED_BY: Identifies the element (or elements) that labels the current element. Value type: reference _ACCESSIBLE_RELATION_OWNS: Identifies an element (or elements) in order to define a visual, functional, or contextual parent/child relationship between elements where the widget hierarchy cannot be used to represent the relationship. Value type: reference _ACCESSIBLE_RELATION_POS_IN_SET: Defines an element's number or position in the current set of listitems or treeitems. Value type: integer _ACCESSIBLE_RELATION_ROW_COUNT: Defines the total number of rows in a table, grid, or treegrid. Value type: integer _ACCESSIBLE_RELATION_ROW_INDEX: Defines an element's row index or position with respect to the total number of rows within a table, grid, or treegrid. Value type: integer _ACCESSIBLE_RELATION_ROW_INDEX_TEXT: Defines a human readable text alternative of aria-rowindex. Value type: string _ACCESSIBLE_RELATION_ROW_SPAN: Defines the number of rows spanned by a cell or gridcell within a table, grid, or treegrid. Value type: integer _ACCESSIBLE_RELATION_SET_SIZE: Defines the number of items in the current set of listitems or treeitems. Value type: integer
*/
opaque type GtkAccessibleRelation = CUnsignedInt
object GtkAccessibleRelation extends _BindgenEnumCUnsignedInt[GtkAccessibleRelation]:
  given _tag: Tag[GtkAccessibleRelation] = Tag.UInt
  inline def define(inline a: Long): GtkAccessibleRelation = a.toUInt
  val GTK_ACCESSIBLE_RELATION_ACTIVE_DESCENDANT = define(0)
  val GTK_ACCESSIBLE_RELATION_COL_COUNT = define(1)
  val GTK_ACCESSIBLE_RELATION_COL_INDEX = define(2)
  val GTK_ACCESSIBLE_RELATION_COL_INDEX_TEXT = define(3)
  val GTK_ACCESSIBLE_RELATION_COL_SPAN = define(4)
  val GTK_ACCESSIBLE_RELATION_CONTROLS = define(5)
  val GTK_ACCESSIBLE_RELATION_DESCRIBED_BY = define(6)
  val GTK_ACCESSIBLE_RELATION_DETAILS = define(7)
  val GTK_ACCESSIBLE_RELATION_ERROR_MESSAGE = define(8)
  val GTK_ACCESSIBLE_RELATION_FLOW_TO = define(9)
  val GTK_ACCESSIBLE_RELATION_LABELLED_BY = define(10)
  val GTK_ACCESSIBLE_RELATION_OWNS = define(11)
  val GTK_ACCESSIBLE_RELATION_POS_IN_SET = define(12)
  val GTK_ACCESSIBLE_RELATION_ROW_COUNT = define(13)
  val GTK_ACCESSIBLE_RELATION_ROW_INDEX = define(14)
  val GTK_ACCESSIBLE_RELATION_ROW_INDEX_TEXT = define(15)
  val GTK_ACCESSIBLE_RELATION_ROW_SPAN = define(16)
  val GTK_ACCESSIBLE_RELATION_SET_SIZE = define(17)
  def getName(value: GtkAccessibleRelation): Option[String] =
    value match
      case `GTK_ACCESSIBLE_RELATION_ACTIVE_DESCENDANT` => Some("GTK_ACCESSIBLE_RELATION_ACTIVE_DESCENDANT")
      case `GTK_ACCESSIBLE_RELATION_COL_COUNT` => Some("GTK_ACCESSIBLE_RELATION_COL_COUNT")
      case `GTK_ACCESSIBLE_RELATION_COL_INDEX` => Some("GTK_ACCESSIBLE_RELATION_COL_INDEX")
      case `GTK_ACCESSIBLE_RELATION_COL_INDEX_TEXT` => Some("GTK_ACCESSIBLE_RELATION_COL_INDEX_TEXT")
      case `GTK_ACCESSIBLE_RELATION_COL_SPAN` => Some("GTK_ACCESSIBLE_RELATION_COL_SPAN")
      case `GTK_ACCESSIBLE_RELATION_CONTROLS` => Some("GTK_ACCESSIBLE_RELATION_CONTROLS")
      case `GTK_ACCESSIBLE_RELATION_DESCRIBED_BY` => Some("GTK_ACCESSIBLE_RELATION_DESCRIBED_BY")
      case `GTK_ACCESSIBLE_RELATION_DETAILS` => Some("GTK_ACCESSIBLE_RELATION_DETAILS")
      case `GTK_ACCESSIBLE_RELATION_ERROR_MESSAGE` => Some("GTK_ACCESSIBLE_RELATION_ERROR_MESSAGE")
      case `GTK_ACCESSIBLE_RELATION_FLOW_TO` => Some("GTK_ACCESSIBLE_RELATION_FLOW_TO")
      case `GTK_ACCESSIBLE_RELATION_LABELLED_BY` => Some("GTK_ACCESSIBLE_RELATION_LABELLED_BY")
      case `GTK_ACCESSIBLE_RELATION_OWNS` => Some("GTK_ACCESSIBLE_RELATION_OWNS")
      case `GTK_ACCESSIBLE_RELATION_POS_IN_SET` => Some("GTK_ACCESSIBLE_RELATION_POS_IN_SET")
      case `GTK_ACCESSIBLE_RELATION_ROW_COUNT` => Some("GTK_ACCESSIBLE_RELATION_ROW_COUNT")
      case `GTK_ACCESSIBLE_RELATION_ROW_INDEX` => Some("GTK_ACCESSIBLE_RELATION_ROW_INDEX")
      case `GTK_ACCESSIBLE_RELATION_ROW_INDEX_TEXT` => Some("GTK_ACCESSIBLE_RELATION_ROW_INDEX_TEXT")
      case `GTK_ACCESSIBLE_RELATION_ROW_SPAN` => Some("GTK_ACCESSIBLE_RELATION_ROW_SPAN")
      case `GTK_ACCESSIBLE_RELATION_SET_SIZE` => Some("GTK_ACCESSIBLE_RELATION_SET_SIZE")
      case _ => _root_.scala.None
  extension (a: GtkAccessibleRelation)
    inline def &(b: GtkAccessibleRelation): GtkAccessibleRelation = a & b
    inline def |(b: GtkAccessibleRelation): GtkAccessibleRelation = a | b
    inline def is(b: GtkAccessibleRelation): Boolean = (a & b) == b