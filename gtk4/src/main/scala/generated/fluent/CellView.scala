package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.fluent.Texture
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.CellArea
import sn.gnome.gtk4.fluent.CellAreaContext
import sn.gnome.gtk4.fluent.CellLayout
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.Orientable
import sn.gnome.gtk4.fluent.TreeModel
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkCellView
import sn.gnome.gtk4.internal.GtkTreePath

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A widget displaying a single row of a GtkTreeModel
  *
  * A `GtkCellView` displays a single row of a `GtkTreeModel` using a
  * `GtkCellArea` and `GtkCellAreaContext`. A `GtkCellAreaContext` can be
  * provided to the `GtkCellView` at construction time in order to keep the
  * cellview in context of a group of cell views, this ensures that the
  * renderers displayed will be properly aligned with each other (like the
  * aligned cells in the menus of `GtkComboBox`).
  *
  * `GtkCellView` is `GtkOrientable` in order to decide in which orientation the
  * underlying `GtkCellAreaContext` should be allocated. Taking the
  * `GtkComboBox` menu as an example, cellviews should be oriented horizontally
  * if the menus are listed top-to-bottom and thus all share the same width but
  * may have separate individual heights (left-to-right menus should be
  * allocated vertically since they all share the same height but may have
  * variable widths).
  *
  * ## CSS nodes
  *
  * GtkCellView has a single CSS node with name cellview.
  */
class CellView(raw: Ptr[GtkCellView])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      CellLayout,
      ConstraintTarget,
      Orientable:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns a `GtkTreePath` referring to the currently displayed row. If no
    * row is currently displayed, %NULL is returned.
    */
  def getDisplayedRow(): Ptr[GtkTreePath] = gtk_cell_view_get_displayed_row(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets whether @cell_view is configured to draw all of its cells in a
    * sensitive state.
    */
  def getDrawSensitive(): Boolean =
    gtk_cell_view_get_draw_sensitive(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets whether @cell_view is configured to request space to fit the entire
    * `GtkTreeModel`.
    */
  def getFitModel(): Boolean =
    gtk_cell_view_get_fit_model(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the model for @cell_view. If no model is used %NULL is returned.
    */
  def getModel(): TreeModel = new TreeModel.Abstract(
    gtk_cell_view_get_model(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the row of the model that is currently displayed by the
    * `GtkCellView`. If the path is unset, then the contents of the cellview
    * “stick” at their last value; this is not normally a desired result, but
    * may be a needed intermediate state if say, the model for the `GtkCellView`
    * becomes temporarily empty.
    */
  def setDisplayedRow(path: Ptr[GtkTreePath]): Unit =
    gtk_cell_view_set_displayed_row(this.raw.asInstanceOf, path)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether @cell_view should draw all of its cells in a sensitive state,
    * this is used by `GtkComboBox` menus to ensure that rows with insensitive
    * cells that contain children appear sensitive in the parent menu item.
    */
  def setDrawSensitive(draw_sensitive: Boolean): Unit =
    gtk_cell_view_set_draw_sensitive(
      this.raw.asInstanceOf,
      gboolean(gint((if draw_sensitive == true then 1 else 0)))
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether @cell_view should request space to fit the entire
    * `GtkTreeModel`.
    *
    * This is used by `GtkComboBox` to ensure that the cell view displayed on
    * the combo box’s button always gets enough space and does not resize when
    * selection changes.
    */
  def setFitModel(fit_model: Boolean): Unit = gtk_cell_view_set_fit_model(
    this.raw.asInstanceOf,
    gboolean(gint((if fit_model == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the model for @cell_view. If @cell_view already has a model set, it
    * will remove it before setting the new model. If @model is %NULL, then it
    * will unset the old model.
    */
  def setModel(model: TreeModel): Unit = gtk_cell_view_set_model(
    this.raw.asInstanceOf,
    model.getUnsafeRawPointer().asInstanceOf
  )

end CellView

object CellView:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkCellView` widget.
    */
  def apply(): CellView = new CellView(gtk_cell_view_new().asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkCellView` widget with a specific `GtkCellArea` to layout
    * cells and a specific `GtkCellAreaContext`.
    *
    * Specifying the same context for a handful of cells lets the underlying
    * area synchronize the geometry for those cells, in this way alignments with
    * cellviews for other rows are possible.
    */
  def withContext(area: CellArea, context: CellAreaContext): CellView =
    new CellView(
      gtk_cell_view_new_with_context(
        area.getUnsafeRawPointer().asInstanceOf,
        context.getUnsafeRawPointer().asInstanceOf
      ).asInstanceOf
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkCellView` widget, adds a `GtkCellRendererText` to it,
    * and makes it show @markup. The text can be marked up with the [Pango text
    * markup language](https://docs.gtk.org/Pango/pango_markup.html).
    */
  def withMarkup(markup: String | CString)(using Zone): CellView = new CellView(
    gtk_cell_view_new_with_markup(__sn_extract_string(markup)).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkCellView` widget, adds a `GtkCellRendererText` to it,
    * and makes it show @text.
    */
  def withText(text: String | CString)(using Zone): CellView = new CellView(
    gtk_cell_view_new_with_text(__sn_extract_string(text)).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkCellView` widget, adds a `GtkCellRendererPixbuf` to it,
    * and makes it show @texture.
    */
  def withTexture(texture: Texture): CellView = new CellView(
    gtk_cell_view_new_with_texture(
      texture.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end CellView
