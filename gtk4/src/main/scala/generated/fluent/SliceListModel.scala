package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.ListModel
import sn.gnome.glib.internal.guint
import sn.gnome.gobject.Object
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.SectionModel
import sn.gnome.gtk4.internal.GtkSliceListModel

/** `GtkSliceListModel` is a list model that presents a slice of another model.
  *
  * This is useful when implementing paging by setting the size to the number of
  * elements per page and updating the offset whenever a different page is
  * opened.
  *
  * `GtkSliceListModel` passes through sections from the underlying model.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class SliceListModel private[gnome] (raw: Ptr[GtkSliceListModel])
    extends Object(raw.asInstanceOf),
      ListModel,
      SectionModel:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets the model that is currently being used or %NULL if none.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getModel(): sn.gnome.gio.ListModel /* None */ =
    new ListModel.Abstract(
      gtk_slice_list_model_get_model(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkSliceListModel]]
      ).asInstanceOf
    )
  end getModel

  /** Gets the offset set via gtk_slice_list_model_set_offset().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getOffset(): UInt /* None */ =
    gtk_slice_list_model_get_offset(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkSliceListModel]]
    ).value
  end getOffset

  /** Gets the size set via gtk_slice_list_model_set_size().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSize(): UInt /* None */ =
    gtk_slice_list_model_get_size(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkSliceListModel]]
    ).value
  end getSize

  /** Sets the model to show a slice of.
    *
    * The model's item type must conform to @self's item type.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setModel(
      model: Option[
        sn.gnome.gio.ListModel /* Some(Ptr[_root_.sn.gnome.gio.internal.GListModel]) */
      ]
  ): Unit /* None */ =
    gtk_slice_list_model_set_model(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkSliceListModel]],
      model
        .map[Ptr[_root_.sn.gnome.gio.internal.GListModel]](o =>
          o.getUnsafeRawPointer().asInstanceOf
        )
        .getOrElse(
          null.asInstanceOf[Ptr[_root_.sn.gnome.gio.internal.GListModel]]
        )
    )
  end setModel

  /** Sets the offset into the original model for this slice.
    *
    * If the offset is too large for the sliced model,
    * @self
    *   will end up empty.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setOffset(
      offset: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): Unit /* None */ =
    gtk_slice_list_model_set_offset(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkSliceListModel]],
      guint(offset)
    )
  end setOffset

  /** Sets the maximum size. @self will never have more items than @size.
    *
    * It can however have fewer items if the offset is too large or the model
    * sliced from doesn't have enough items.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setSize(
      size: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): Unit /* None */ =
    gtk_slice_list_model_set_size(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkSliceListModel]],
      guint(size)
    )
  end setSize

end SliceListModel

object SliceListModel:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkSliceListModel])(using Runtime) =
    summon[Runtime].getOrCreate[SliceListModel](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new SliceListModel(ptr)
    )

  /** Creates a new slice model.
    *
    * It presents the slice from @offset to offset + @size of the given @model.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      model: Option[
        sn.gnome.gio.ListModel /* Some(Ptr[_root_.sn.gnome.gio.internal.GListModel]) */
      ],
      offset: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */,
      size: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  )(using Runtime): SliceListModel =
    val raw: Ptr[Byte] = gtk_slice_list_model_new(
      model
        .map[Ptr[_root_.sn.gnome.gio.internal.GListModel]](o =>
          o.getUnsafeRawPointer().asInstanceOf
        )
        .getOrElse(
          null.asInstanceOf[Ptr[_root_.sn.gnome.gio.internal.GListModel]]
        ),
      guint(offset),
      guint(size)
    ).asInstanceOf
    summon[Runtime].getOrCreate[SliceListModel](
      raw,
      r => SliceListModel.applyUnsafe(r.asInstanceOf)
    )
  end apply
end SliceListModel
