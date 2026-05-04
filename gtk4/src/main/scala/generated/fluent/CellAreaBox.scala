package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gtk4.fluent.{
  Buildable,
  CellArea,
  CellLayout,
  CellRenderer,
  Orientable
}
import sn.gnome.gtk4.internal.GtkCellAreaBox

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A cell area that renders GtkCellRenderers into a row or a column
  *
  * The `GtkCellAreaBox` renders cell renderers into a row or a column depending
  * on its `GtkOrientation`.
  *
  * GtkCellAreaBox uses a notion of packing. Packing refers to adding cell
  * renderers with reference to a particular position in a `GtkCellAreaBox`.
  * There are two reference positions: the start and the end of the box. When
  * the `GtkCellAreaBox` is oriented in the %GTK_ORIENTATION_VERTICAL
  * orientation, the start is defined as the top of the box and the end is
  * defined as the bottom. In the %GTK_ORIENTATION_HORIZONTAL orientation start
  * is defined as the left side and the end is defined as the right side.
  *
  * Alignments of `GtkCellRenderer`s rendered in adjacent rows can be configured
  * by configuring the `GtkCellAreaBox` align child cell property with
  * gtk_cell_area_cell_set_property() or by specifying the "align" argument to
  * gtk_cell_area_box_pack_start() and gtk_cell_area_box_pack_end().
  */
class CellAreaBox(raw: Ptr[GtkCellAreaBox])
    extends CellArea(raw.asInstanceOf),
      Buildable,
      CellLayout,
      Orientable:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the spacing added between cell renderers.
    */
  def getSpacing(): Int /* None */ = gtk_cell_area_box_get_spacing(
    this.raw.asInstanceOf[Ptr[GtkCellAreaBox]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Adds @renderer to @box, packed with reference to the end of @box.
    *
    * The @renderer is packed after (away from end of) any other
    * `GtkCellRenderer` packed with reference to the end of @box.
    */
  def packEnd(
      renderer: CellRenderer /* Some(Ptr[GtkCellRenderer]) */,
      expand: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */,
      align: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */,
      fixed: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_cell_area_box_pack_end(
    this.raw.asInstanceOf[Ptr[GtkCellAreaBox]],
    renderer.getUnsafeRawPointer().asInstanceOf,
    gboolean(gint((if expand == true then 1 else 0))),
    gboolean(gint((if align == true then 1 else 0))),
    gboolean(gint((if fixed == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Adds @renderer to @box, packed with reference to the start of @box.
    *
    * The @renderer is packed after any other `GtkCellRenderer` packed with
    * reference to the start of @box.
    */
  def packStart(
      renderer: CellRenderer /* Some(Ptr[GtkCellRenderer]) */,
      expand: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */,
      align: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */,
      fixed: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_cell_area_box_pack_start(
    this.raw.asInstanceOf[Ptr[GtkCellAreaBox]],
    renderer.getUnsafeRawPointer().asInstanceOf,
    gboolean(gint((if expand == true then 1 else 0))),
    gboolean(gint((if align == true then 1 else 0))),
    gboolean(gint((if fixed == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the spacing to add between cell renderers in @box.
    */
  def setSpacing(spacing: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_cell_area_box_set_spacing(
      this.raw.asInstanceOf[Ptr[GtkCellAreaBox]],
      spacing
    )

end CellAreaBox

object CellAreaBox:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkCellAreaBox`.
    */
  def apply(): CellAreaBox = new CellAreaBox(
    gtk_cell_area_box_new().asInstanceOf
  )
end CellAreaBox
