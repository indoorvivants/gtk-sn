package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkCellRendererState

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Tells how a cell is to be rendered.
  */
class CellRendererState private (val raw: GtkCellRendererState):
  def is(kv: CellRendererState): Boolean =
    raw.is(kv.raw)

  override def toString(): String =
    var rem = raw.value
    val sb = List.newBuilder[CellRendererState.KnownValue]
    CellRendererState.KnownValue.values.foreach: kv =>
      if this.is(kv) then sb += kv

      rem = rem & (~kv.raw.value)

    s"CellRendererState(${sb.result().mkString(", ")})"
end CellRendererState

object CellRendererState:
  export KnownValue.*

  def fromRaw(raw: GtkCellRendererState) = new CellRendererState(raw)

  extension (af: CellRendererState)
    def &(other: CellRendererState) =
      CellRendererState(af.raw & other.raw)
    def |(other: CellRendererState) =
      CellRendererState(af.raw | other.raw)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Tells how a cell is to be rendered.
    */
  enum KnownValue(override val raw: GtkCellRendererState, name: String)
      extends CellRendererState(raw):
    override def toString(): String = this.name

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * The cell is currently selected, and probably has a selection colored
      * background to render to.
      */
    case SELECTED
        extends KnownValue(
          GtkCellRendererState.GTK_CELL_RENDERER_SELECTED,
          "SELECTED"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * The mouse is hovering over the cell.
      */
    case PRELIT
        extends KnownValue(
          GtkCellRendererState.GTK_CELL_RENDERER_PRELIT,
          "PRELIT"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * The cell is drawn in an insensitive manner
      */
    case INSENSITIVE
        extends KnownValue(
          GtkCellRendererState.GTK_CELL_RENDERER_INSENSITIVE,
          "INSENSITIVE"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * The cell is in a sorted row
      */
    case SORTED
        extends KnownValue(
          GtkCellRendererState.GTK_CELL_RENDERER_SORTED,
          "SORTED"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * The cell is in the focus row.
      */
    case FOCUSED
        extends KnownValue(
          GtkCellRendererState.GTK_CELL_RENDERER_FOCUSED,
          "FOCUSED"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * The cell is in a row that can be expanded
      */
    case EXPANDABLE
        extends KnownValue(
          GtkCellRendererState.GTK_CELL_RENDERER_EXPANDABLE,
          "EXPANDABLE"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * The cell is in a row that is expanded
      */
    case EXPANDED
        extends KnownValue(
          GtkCellRendererState.GTK_CELL_RENDERER_EXPANDED,
          "EXPANDED"
        )
  end KnownValue
end CellRendererState
