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

class CellView(raw: Ptr[GtkCellView])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      CellLayout,
      ConstraintTarget,
      Orientable:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getDisplayedRow(): Ptr[GtkTreePath] = gtk_cell_view_get_displayed_row(
    this.raw.asInstanceOf
  )

  def getDrawSensitive(): Boolean =
    gtk_cell_view_get_draw_sensitive(this.raw.asInstanceOf).value.!=(0)

  def getFitModel(): Boolean =
    gtk_cell_view_get_fit_model(this.raw.asInstanceOf).value.!=(0)

  def getModel(): TreeModel = new TreeModel.Abstract(
    gtk_cell_view_get_model(this.raw.asInstanceOf).asInstanceOf
  )

  def setDisplayedRow(path: Ptr[GtkTreePath]): Unit =
    gtk_cell_view_set_displayed_row(this.raw.asInstanceOf, path)

  def setDrawSensitive(draw_sensitive: Boolean): Unit =
    gtk_cell_view_set_draw_sensitive(
      this.raw.asInstanceOf,
      gboolean(gint((if draw_sensitive == true then 1 else 0)))
    )

  def setFitModel(fit_model: Boolean): Unit = gtk_cell_view_set_fit_model(
    this.raw.asInstanceOf,
    gboolean(gint((if fit_model == true then 1 else 0)))
  )

  def setModel(model: TreeModel): Unit = gtk_cell_view_set_model(
    this.raw.asInstanceOf,
    model.getUnsafeRawPointer().asInstanceOf
  )

end CellView

object CellView:
  def apply(): CellView = new CellView(gtk_cell_view_new().asInstanceOf)
  def withContext(area: CellArea, context: CellAreaContext): CellView =
    new CellView(
      gtk_cell_view_new_with_context(
        area.getUnsafeRawPointer().asInstanceOf,
        context.getUnsafeRawPointer().asInstanceOf
      ).asInstanceOf
    )
  def withMarkup(markup: String | CString)(using Zone): CellView = new CellView(
    gtk_cell_view_new_with_markup(__sn_extract_string(markup)).asInstanceOf
  )
  def withText(text: String | CString)(using Zone): CellView = new CellView(
    gtk_cell_view_new_with_text(__sn_extract_string(text)).asInstanceOf
  )
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
