package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.fluent.ListModel
import sn.gnome.glib.internal.{gboolean, gint, guint}
import sn.gnome.gobject.fluent.Object
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.fluent.{SectionModel, Sorter}
import sn.gnome.gtk4.internal.GtkSortListModel

/** A `GListModel` that sorts the elements of an underlying model according to a
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
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class SortListModel private[gnome] (raw: Ptr[GtkSortListModel])
    extends Object(raw.asInstanceOf),
      ListModel,
      SectionModel:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Returns whether incremental sorting is enabled.
    *
    * See [method@Gtk.SortListModel.set_incremental].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getIncremental(): Boolean /* None */ =
    gtk_sort_list_model_get_incremental(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkSortListModel]]
    ).value.!=(0)
  end getIncremental

  /** Gets the model currently sorted or %NULL if none.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getModel(): ListModel /* None */ =
    new ListModel.Abstract(
      gtk_sort_list_model_get_model(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkSortListModel]]
      ).asInstanceOf
    )
  end getModel

  /** Estimates progress of an ongoing sorting operation.
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPending(): UInt /* None */ =
    gtk_sort_list_model_get_pending(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkSortListModel]]
    ).value
  end getPending

  /** Gets the section sorter that is used to sort items of @self into sections.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSectionSorter()(using
      Runtime
  ): sn.gnome.gtk4.fluent.Sorter /* None */ =
    sn.gnome.gtk4.fluent.Sorter.applyUnsafe(
      gtk_sort_list_model_get_section_sorter(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkSortListModel]]
      ).asInstanceOf
    )
  end getSectionSorter

  /** Gets the sorter that is used to sort @self.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSorter()(using Runtime): sn.gnome.gtk4.fluent.Sorter /* None */ =
    sn.gnome.gtk4.fluent.Sorter.applyUnsafe(
      gtk_sort_list_model_get_sorter(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkSortListModel]]
      ).asInstanceOf
    )
  end getSorter

  /** Sets the sort model to do an incremental sort.
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setIncremental(
      incremental: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_sort_list_model_set_incremental(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkSortListModel]],
      gboolean(gint((if incremental == true then 1 else 0)))
    )
  end setIncremental

  /** Sets the model to be sorted.
    *
    * The @model's item type must conform to the item type of @self.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setModel(
      model: Option[
        ListModel /* Some(Ptr[_root_.sn.gnome.gio.internal.GListModel]) */
      ]
  ): Unit /* None */ =
    gtk_sort_list_model_set_model(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkSortListModel]],
      model
        .map[Ptr[_root_.sn.gnome.gio.internal.GListModel]](o =>
          o.getUnsafeRawPointer().asInstanceOf
        )
        .getOrElse(
          null.asInstanceOf[Ptr[_root_.sn.gnome.gio.internal.GListModel]]
        )
    )
  end setModel

  /** Sets a new section sorter on @self.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setSectionSorter(
      sorter: Option[sn.gnome.gtk4.fluent.Sorter /* Some(Ptr[GtkSorter]) */ ]
  )(using Runtime): Unit /* None */ =
    gtk_sort_list_model_set_section_sorter(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkSortListModel]],
      sorter
        .map[Ptr[GtkSorter]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkSorter]])
    )
  end setSectionSorter

  /** Sets a new sorter on @self.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setSorter(
      sorter: Option[sn.gnome.gtk4.fluent.Sorter /* Some(Ptr[GtkSorter]) */ ]
  )(using Runtime): Unit /* None */ =
    gtk_sort_list_model_set_sorter(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkSortListModel]],
      sorter
        .map[Ptr[GtkSorter]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkSorter]])
    )
  end setSorter

end SortListModel

object SortListModel:
  def applyUnsafe(ptr: Ptr[GtkSortListModel])(using Runtime) =
    summon[Runtime].getOrCreate[SortListModel](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new SortListModel(ptr)
    )

  /** Creates a new sort list model that uses the @sorter to sort @model.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      model: Option[
        ListModel /* Some(Ptr[_root_.sn.gnome.gio.internal.GListModel]) */
      ],
      sorter: Option[sn.gnome.gtk4.fluent.Sorter /* Some(Ptr[GtkSorter]) */ ]
  )(using Runtime): SortListModel =
    val raw: Ptr[Byte] = gtk_sort_list_model_new(
      model
        .map[Ptr[_root_.sn.gnome.gio.internal.GListModel]](o =>
          o.getUnsafeRawPointer().asInstanceOf
        )
        .getOrElse(
          null.asInstanceOf[Ptr[_root_.sn.gnome.gio.internal.GListModel]]
        ),
      sorter
        .map[Ptr[GtkSorter]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkSorter]])
    ).asInstanceOf
    summon[Runtime].getOrCreate[SortListModel](
      raw,
      r => SortListModel.applyUnsafe(r.asInstanceOf)
    )
  end apply
end SortListModel
