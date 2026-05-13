package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.fluent.ListModel
import sn.gnome.glib.internal.{gboolean, gint, guint}
import sn.gnome.gobject.fluent.Object
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.fluent.{Filter, SectionModel}
import sn.gnome.gtk4.internal.GtkFilterListModel

/** `GtkFilterListModel` is a list model that filters the elements of the
  * underlying model according to a `GtkFilter`.
  *
  * It hides some elements from the other model according to criteria given by a
  * `GtkFilter`.
  *
  * The model can be set up to do incremental filtering, so that filtering long
  * lists doesn't block the UI. See [method@Gtk.FilterListModel.set_incremental]
  * for details.
  *
  * `GtkFilterListModel` passes through sections from the underlying model.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class FilterListModel private[gnome] (raw: Ptr[GtkFilterListModel])
    extends Object(raw.asInstanceOf),
      ListModel,
      SectionModel:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets the `GtkFilter` currently set on @self.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getFilter()(using Runtime): sn.gnome.gtk4.fluent.Filter /* None */ =
    sn.gnome.gtk4.fluent.Filter.applyUnsafe(
      gtk_filter_list_model_get_filter(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFilterListModel]]
      ).asInstanceOf
    )
  end getFilter

  /** Returns whether incremental filtering is enabled.
    *
    * See [method@Gtk.FilterListModel.set_incremental].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getIncremental(): Boolean /* None */ =
    gtk_filter_list_model_get_incremental(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFilterListModel]]
    ).value.!=(0)
  end getIncremental

  /** Gets the model currently filtered or %NULL if none.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getModel(): ListModel /* None */ =
    new ListModel.Abstract(
      gtk_filter_list_model_get_model(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFilterListModel]]
      ).asInstanceOf
    )
  end getModel

  /** Returns the number of items that have not been filtered yet.
    *
    * You can use this value to check if @self is busy filtering by comparing
    * the return value to 0 or you can compute the percentage of the filter
    * remaining by dividing the return value by the total number of items in the
    * underlying model:
    *
    * ```c
    * pending = gtk_filter_list_model_get_pending (self);
    * model = gtk_filter_list_model_get_model (self);
    * percentage = pending / (double) g_list_model_get_n_items (model);
    * ```
    *
    * If no filter operation is ongoing - in particular when
    * [property@Gtk.FilterListModel:incremental] is %FALSE - this function
    * returns 0.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPending(): UInt /* None */ =
    gtk_filter_list_model_get_pending(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFilterListModel]]
    ).value
  end getPending

  /** Sets the filter used to filter items.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setFilter(
      filter: Option[sn.gnome.gtk4.fluent.Filter /* Some(Ptr[GtkFilter]) */ ]
  )(using Runtime): Unit /* None */ =
    gtk_filter_list_model_set_filter(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFilterListModel]],
      filter
        .map[Ptr[GtkFilter]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkFilter]])
    )
  end setFilter

  /** Sets the filter model to do an incremental sort.
    *
    * When incremental filtering is enabled, the `GtkFilterListModel` will not
    * run filters immediately, but will instead queue an idle handler that
    * incrementally filters the items and adds them to the list. This of course
    * means that items are not instantly added to the list, but only appear
    * incrementally.
    *
    * When your filter blocks the UI while filtering, you might consider turning
    * this on. Depending on your model and filters, this may become interesting
    * around 10,000 to 100,000 items.
    *
    * By default, incremental filtering is disabled.
    *
    * See [method@Gtk.FilterListModel.get_pending] for progress information
    * about an ongoing incremental filtering operation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setIncremental(
      incremental: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_filter_list_model_set_incremental(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFilterListModel]],
      gboolean(gint((if incremental == true then 1 else 0)))
    )
  end setIncremental

  /** Sets the model to be filtered.
    *
    * Note that GTK makes no effort to ensure that @model conforms to the item
    * type of @self. It assumes that the caller knows what they are doing and
    * have set up an appropriate filter to ensure that item types match.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setModel(
      model: Option[
        ListModel /* Some(Ptr[_root_.sn.gnome.gio.internal.GListModel]) */
      ]
  ): Unit /* None */ =
    gtk_filter_list_model_set_model(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkFilterListModel]],
      model
        .map[Ptr[_root_.sn.gnome.gio.internal.GListModel]](o =>
          o.getUnsafeRawPointer().asInstanceOf
        )
        .getOrElse(
          null.asInstanceOf[Ptr[_root_.sn.gnome.gio.internal.GListModel]]
        )
    )
  end setModel

end FilterListModel

object FilterListModel:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkFilterListModel])(using Runtime) =
    summon[Runtime].getOrCreate[FilterListModel](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new FilterListModel(ptr)
    )

  /** Creates a new `GtkFilterListModel` that will filter @model using the given
    * @filter.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      model: Option[
        ListModel /* Some(Ptr[_root_.sn.gnome.gio.internal.GListModel]) */
      ],
      filter: Option[sn.gnome.gtk4.fluent.Filter /* Some(Ptr[GtkFilter]) */ ]
  )(using Runtime): FilterListModel =
    val raw: Ptr[Byte] = gtk_filter_list_model_new(
      model
        .map[Ptr[_root_.sn.gnome.gio.internal.GListModel]](o =>
          o.getUnsafeRawPointer().asInstanceOf
        )
        .getOrElse(
          null.asInstanceOf[Ptr[_root_.sn.gnome.gio.internal.GListModel]]
        ),
      filter
        .map[Ptr[GtkFilter]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkFilter]])
    ).asInstanceOf
    summon[Runtime].getOrCreate[FilterListModel](
      raw,
      r => FilterListModel.applyUnsafe(r.asInstanceOf)
    )
  end apply
end FilterListModel
