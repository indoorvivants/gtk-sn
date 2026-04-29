package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.fluent.ListModel
import sn.gnome.glib.internal.guint
import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.fluent.SectionModel
import sn.gnome.gtk4.internal.GtkSliceListModel

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkSliceListModel` is a list model that presents a slice of another model.
  *
  * This is useful when implementing paging by setting the size to the number of
  * elements per page and updating the offset whenever a different page is
  * opened.
  *
  * `GtkSliceListModel` passes through sections from the underlying model.
  */
class SliceListModel(raw: Ptr[GtkSliceListModel])
    extends Object(raw.asInstanceOf),
      ListModel,
      SectionModel:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the model that is currently being used or %NULL if none.
    */
  def getModel(): ListModel = new ListModel.Abstract(
    gtk_slice_list_model_get_model(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the offset set via gtk_slice_list_model_set_offset().
    */
  def getOffset(): UInt = gtk_slice_list_model_get_offset(
    this.raw.asInstanceOf
  ).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the size set via gtk_slice_list_model_set_size().
    */
  def getSize(): UInt = gtk_slice_list_model_get_size(
    this.raw.asInstanceOf
  ).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the model to show a slice of.
    *
    * The model's item type must conform to @self's item type.
    */
  def setModel(model: ListModel): Unit = gtk_slice_list_model_set_model(
    this.raw.asInstanceOf,
    model.getUnsafeRawPointer().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the offset into the original model for this slice.
    *
    * If the offset is too large for the sliced model,
    * @self
    *   will end up empty.
    */
  def setOffset(offset: UInt): Unit =
    gtk_slice_list_model_set_offset(this.raw.asInstanceOf, guint(offset))

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the maximum size. @self will never have more items than @size.
    *
    * It can however have fewer items if the offset is too large or the model
    * sliced from doesn't have enough items.
    */
  def setSize(size: UInt): Unit =
    gtk_slice_list_model_set_size(this.raw.asInstanceOf, guint(size))

end SliceListModel

object SliceListModel:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new slice model.
    *
    * It presents the slice from @offset to offset + @size of the given @model.
    */
  def apply(model: ListModel, offset: UInt, size: UInt): SliceListModel =
    new SliceListModel(
      gtk_slice_list_model_new(
        model.getUnsafeRawPointer().asInstanceOf,
        guint(offset),
        guint(size)
      ).asInstanceOf
    )
end SliceListModel
