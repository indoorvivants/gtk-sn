package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.GtkCellRendererState

/** Tells how a cell is to be rendered.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
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

  /** Tells how a cell is to be rendered.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  enum KnownValue(override val raw: GtkCellRendererState, name: String)
      extends CellRendererState(raw):
    override def toString(): String = this.name

    /** The cell is currently selected, and probably has a selection colored
      * background to render to.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case SELECTED
        extends KnownValue(
          GtkCellRendererState.GTK_CELL_RENDERER_SELECTED,
          "SELECTED"
        )

    /** The mouse is hovering over the cell.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case PRELIT
        extends KnownValue(
          GtkCellRendererState.GTK_CELL_RENDERER_PRELIT,
          "PRELIT"
        )

    /** The cell is drawn in an insensitive manner
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case INSENSITIVE
        extends KnownValue(
          GtkCellRendererState.GTK_CELL_RENDERER_INSENSITIVE,
          "INSENSITIVE"
        )

    /** The cell is in a sorted row
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case SORTED
        extends KnownValue(
          GtkCellRendererState.GTK_CELL_RENDERER_SORTED,
          "SORTED"
        )

    /** The cell is in the focus row.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case FOCUSED
        extends KnownValue(
          GtkCellRendererState.GTK_CELL_RENDERER_FOCUSED,
          "FOCUSED"
        )

    /** The cell is in a row that can be expanded
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case EXPANDABLE
        extends KnownValue(
          GtkCellRendererState.GTK_CELL_RENDERER_EXPANDABLE,
          "EXPANDABLE"
        )

    /** The cell is in a row that is expanded
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case EXPANDED
        extends KnownValue(
          GtkCellRendererState.GTK_CELL_RENDERER_EXPANDED,
          "EXPANDED"
        )
  end KnownValue
end CellRendererState
