package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.fluent.Texture
import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gtk4.fluent.{
  Accessible,
  Buildable,
  CellArea,
  CellAreaContext,
  CellLayout,
  ConstraintTarget,
  Orientable,
  TreeModel,
  Widget
}
import sn.gnome.gtk4.internal.GtkCellView

/** A widget displaying a single row of a GtkTreeModel
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
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class CellView(raw: Ptr[GtkCellView])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      CellLayout,
      ConstraintTarget,
      Orientable:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Returns a `GtkTreePath` referring to the currently displayed row. If no
    * row is currently displayed, %NULL is returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_displayed_row/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TreePath), @type -> DataRecord(GtkTreePath*)))"
  )
  private def getDisplayedRow__ = ???

  /** Gets whether @cell_view is configured to draw all of its cells in a
    * sensitive state.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDrawSensitive(): Boolean /* None */ = gtk_cell_view_get_draw_sensitive(
    this.raw.asInstanceOf[Ptr[GtkCellView]]
  ).value.!=(0)

  /** Gets whether @cell_view is configured to request space to fit the entire
    * `GtkTreeModel`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getFitModel(): Boolean /* None */ = gtk_cell_view_get_fit_model(
    this.raw.asInstanceOf[Ptr[GtkCellView]]
  ).value.!=(0)

  /** Returns the model for @cell_view. If no model is used %NULL is returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getModel(): TreeModel /* None */ = new TreeModel.Abstract(
    gtk_cell_view_get_model(
      this.raw.asInstanceOf[Ptr[GtkCellView]]
    ).asInstanceOf
  )

  /** Sets the row of the model that is currently displayed by the
    * `GtkCellView`. If the path is unset, then the contents of the cellview
    * “stick” at their last value; this is not normally a desired result, but
    * may be a needed intermediate state if say, the model for the `GtkCellView`
    * becomes temporarily empty.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_displayed_row/<method parameters>/path]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TreePath), @type -> DataRecord(GtkTreePath*)))"
  )
  private def setDisplayedRow__ = ???

  /** Sets whether @cell_view should draw all of its cells in a sensitive state,
    * this is used by `GtkComboBox` menus to ensure that rows with insensitive
    * cells that contain children appear sensitive in the parent menu item.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setDrawSensitive(
      draw_sensitive: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_cell_view_set_draw_sensitive(
    this.raw.asInstanceOf[Ptr[GtkCellView]],
    gboolean(gint((if draw_sensitive == true then 1 else 0)))
  )

  /** Sets whether @cell_view should request space to fit the entire
    * `GtkTreeModel`.
    *
    * This is used by `GtkComboBox` to ensure that the cell view displayed on
    * the combo box’s button always gets enough space and does not resize when
    * selection changes.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setFitModel(
      fit_model: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_cell_view_set_fit_model(
    this.raw.asInstanceOf[Ptr[GtkCellView]],
    gboolean(gint((if fit_model == true then 1 else 0)))
  )

  /** Sets the model for @cell_view. If @cell_view already has a model set, it
    * will remove it before setting the new model. If @model is %NULL, then it
    * will unset the old model.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setModel(
      model: Option[TreeModel /* Some(Ptr[GtkTreeModel]) */ ]
  ): Unit /* None */ = gtk_cell_view_set_model(
    this.raw.asInstanceOf[Ptr[GtkCellView]],
    model
      .map[Ptr[GtkTreeModel]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkTreeModel]])
  )

end CellView

object CellView:
  /** Creates a new `GtkCellView` widget.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(): CellView = new CellView(gtk_cell_view_new().asInstanceOf)

  /** Creates a new `GtkCellView` widget with a specific `GtkCellArea` to layout
    * cells and a specific `GtkCellAreaContext`.
    *
    * Specifying the same context for a handful of cells lets the underlying
    * area synchronize the geometry for those cells, in this way alignments with
    * cellviews for other rows are possible.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def withContext(
      area: CellArea /* Some(Ptr[GtkCellArea]) */,
      context: CellAreaContext /* Some(Ptr[GtkCellAreaContext]) */
  ): CellView = new CellView(
    gtk_cell_view_new_with_context(
      area.getUnsafeRawPointer().asInstanceOf,
      context.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )

  /** Creates a new `GtkCellView` widget, adds a `GtkCellRendererText` to it,
    * and makes it show @markup. The text can be marked up with the [Pango text
    * markup language](https://docs.gtk.org/Pango/pango_markup.html).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def withMarkup(
      markup: String | CString /* Some(CString) */
  )(using Zone): CellView = new CellView(
    gtk_cell_view_new_with_markup(__sn_extract_string(markup)).asInstanceOf
  )

  /** Creates a new `GtkCellView` widget, adds a `GtkCellRendererText` to it,
    * and makes it show @text.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def withText(
      text: String | CString /* Some(CString) */
  )(using Zone): CellView = new CellView(
    gtk_cell_view_new_with_text(__sn_extract_string(text)).asInstanceOf
  )

  /** Creates a new `GtkCellView` widget, adds a `GtkCellRendererPixbuf` to it,
    * and makes it show @texture.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def withTexture(
      texture: Texture /* Some(Ptr[_root_.sn.gnome.gdk4.internal.GdkTexture]) */
  ): CellView = new CellView(
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
