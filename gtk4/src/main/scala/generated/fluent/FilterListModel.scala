package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.fluent.ListModel
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.guint
import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.fluent.Filter
import sn.gnome.gtk4.fluent.SectionModel
import sn.gnome.gtk4.internal.GtkFilterListModel

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkFilterListModel` is a list model that filters the elements of the
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
  */
class FilterListModel(raw: Ptr[GtkFilterListModel])
    extends Object(raw.asInstanceOf),
      ListModel,
      SectionModel:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the `GtkFilter` currently set on @self.
    */
  def getFilter(): Filter = new Filter(
    gtk_filter_list_model_get_filter(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether incremental filtering is enabled.
    *
    * See [method@Gtk.FilterListModel.set_incremental].
    */
  def getIncremental(): Boolean =
    gtk_filter_list_model_get_incremental(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the model currently filtered or %NULL if none.
    */
  def getModel(): ListModel = new ListModel.Abstract(
    gtk_filter_list_model_get_model(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the number of items that have not been filtered yet.
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
    */
  def getPending(): UInt = gtk_filter_list_model_get_pending(
    this.raw.asInstanceOf
  ).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the filter used to filter items.
    */
  def setFilter(filter: Filter): Unit = gtk_filter_list_model_set_filter(
    this.raw.asInstanceOf,
    filter.getUnsafeRawPointer().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the filter model to do an incremental sort.
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
    */
  def setIncremental(incremental: Boolean): Unit =
    gtk_filter_list_model_set_incremental(
      this.raw.asInstanceOf,
      gboolean(gint((if incremental == true then 1 else 0)))
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the model to be filtered.
    *
    * Note that GTK makes no effort to ensure that @model conforms to the item
    * type of @self. It assumes that the caller knows what they are doing and
    * have set up an appropriate filter to ensure that item types match.
    */
  def setModel(model: ListModel): Unit = gtk_filter_list_model_set_model(
    this.raw.asInstanceOf,
    model.getUnsafeRawPointer().asInstanceOf
  )

end FilterListModel

object FilterListModel:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkFilterListModel` that will filter @model using the given
    * @filter.
    */
  def apply(model: ListModel, filter: Filter): FilterListModel =
    new FilterListModel(
      gtk_filter_list_model_new(
        model.getUnsafeRawPointer().asInstanceOf,
        filter.getUnsafeRawPointer().asInstanceOf
      ).asInstanceOf
    )
end FilterListModel
