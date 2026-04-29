package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.fluent.ListModel
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.guint
import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.fluent.SectionModel
import sn.gnome.gtk4.fluent.Sorter
import sn.gnome.gtk4.internal.GtkSortListModel

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A `GListModel` that sorts the elements of an underlying model according to a
  * `GtkSorter`.
  *
  * The model is a stable sort. If two items compare equal according to the
  * sorter, the one that appears first in the original model will also appear
  * first after sorting. Note that if you change the sorter, the previous order
  * will have no influence on the new order. If you want that, consider using a
  * `GtkMultiSorter` and appending the previous sorter to it.
  *
  * The model can be set up to do incremental sorting, so that sorting long
  * lists doesn't block the UI. See [method@Gtk.SortListModel.set_incremental]
  * for details.
  *
  * `GtkSortListModel` is a generic model and because of that it cannot take
  * advantage of any external knowledge when sorting. If you run into
  * performance issues with `GtkSortListModel`, it is strongly recommended that
  * you write your own sorting list model.
  *
  * `GtkSortListModel` allows sorting the items into sections. It implements
  * `GtkSectionModel` and when [property@Gtk.SortListModel:section-sorter] is
  * set, it will sort all items with that sorter and items comparing equal with
  * it will be put into the same section. The
  * [property@Gtk.SortListModel:sorter] will then be used to sort items inside
  * their sections.
  */
class SortListModel(raw: Ptr[GtkSortListModel])
    extends Object(raw.asInstanceOf),
      ListModel,
      SectionModel:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether incremental sorting is enabled.
    *
    * See [method@Gtk.SortListModel.set_incremental].
    */
  def getIncremental(): Boolean =
    gtk_sort_list_model_get_incremental(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the model currently sorted or %NULL if none.
    */
  def getModel(): ListModel = new ListModel.Abstract(
    gtk_sort_list_model_get_model(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Estimates progress of an ongoing sorting operation.
    *
    * The estimate is the number of items that would still need to be sorted to
    * finish the sorting operation if this was a linear algorithm. So this
    * number is not related to how many items are already correctly sorted.
    *
    * If you want to estimate the progress, you can use code like this:
    * ```c
    * pending = gtk_sort_list_model_get_pending (self);
    * model = gtk_sort_list_model_get_model (self);
    * progress = 1.0 - pending / (double) MAX (1, g_list_model_get_n_items (model));
    * ```
    *
    * If no sort operation is ongoing - in particular when
    * [property@Gtk.SortListModel:incremental] is %FALSE - this function returns 0.
    */
  def getPending(): UInt = gtk_sort_list_model_get_pending(
    this.raw.asInstanceOf
  ).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the section sorter that is used to sort items of @self into sections.
    */
  def getSectionSorter(): Sorter = new Sorter(
    gtk_sort_list_model_get_section_sorter(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the sorter that is used to sort @self.
    */
  def getSorter(): Sorter = new Sorter(
    gtk_sort_list_model_get_sorter(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the sort model to do an incremental sort.
    *
    * When incremental sorting is enabled, the `GtkSortListModel` will not do a
    * complete sort immediately, but will instead queue an idle handler that
    * incrementally sorts the items towards their correct position. This of
    * course means that items do not instantly appear in the right place. It
    * also means that the total sorting time is a lot slower.
    *
    * When your filter blocks the UI while sorting, you might consider turning
    * this on. Depending on your model and sorters, this may become interesting
    * around 10,000 to 100,000 items.
    *
    * By default, incremental sorting is disabled.
    *
    * See [method@Gtk.SortListModel.get_pending] for progress information about
    * an ongoing incremental sorting operation.
    */
  def setIncremental(incremental: Boolean): Unit =
    gtk_sort_list_model_set_incremental(
      this.raw.asInstanceOf,
      gboolean(gint((if incremental == true then 1 else 0)))
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the model to be sorted.
    *
    * The @model's item type must conform to the item type of @self.
    */
  def setModel(model: ListModel): Unit = gtk_sort_list_model_set_model(
    this.raw.asInstanceOf,
    model.getUnsafeRawPointer().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets a new section sorter on @self.
    */
  def setSectionSorter(sorter: Sorter): Unit =
    gtk_sort_list_model_set_section_sorter(
      this.raw.asInstanceOf,
      sorter.getUnsafeRawPointer().asInstanceOf
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets a new sorter on @self.
    */
  def setSorter(sorter: Sorter): Unit = gtk_sort_list_model_set_sorter(
    this.raw.asInstanceOf,
    sorter.getUnsafeRawPointer().asInstanceOf
  )

end SortListModel

object SortListModel:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new sort list model that uses the @sorter to sort @model.
    */
  def apply(model: ListModel, sorter: Sorter): SortListModel =
    new SortListModel(
      gtk_sort_list_model_new(
        model.getUnsafeRawPointer().asInstanceOf,
        sorter.getUnsafeRawPointer().asInstanceOf
      ).asInstanceOf
    )
end SortListModel
