package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.ListModel
import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gobject.Object
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.SectionModel
import sn.gnome.gtk4.internal.GtkMapListModel

/** A `GtkMapListModel` maps the items in a list model to different items.
  *
  * `GtkMapListModel` uses a [callback@Gtk.MapListModelMapFunc].
  *
  * Example: Create a list of `GtkEventControllers`
  * ```c
  * static gpointer
  * map_to_controllers (gpointer widget,
  *                     gpointer data)
  * {
  *   gpointer result = gtk_widget_observe_controllers (widget);
  *   g_object_unref (widget);
  *   return result;
  * }
  *
  * widgets = gtk_widget_observe_children (widget);
  *
  * controllers = gtk_map_list_model_new (widgets,
  *                                       map_to_controllers,
  *                                       NULL, NULL);
  *
  * model = gtk_flatten_list_model_new (GTK_TYPE_EVENT_CONTROLLER,
  *                                     controllers);
  * ```
  *
  * `GtkMapListModel` will attempt to discard the mapped objects as soon as they
  * are no longer needed and recreate them if necessary.
  *
  * `GtkMapListModel` passes through sections from the underlying model.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class MapListModel private[gnome] (raw: Ptr[GtkMapListModel])
    extends Object(raw.asInstanceOf),
      ListModel,
      SectionModel:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets the model that is currently being mapped or %NULL if none.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getModel(): ListModel /* None */ =
    new ListModel.Abstract(
      gtk_map_list_model_get_model(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkMapListModel]]
      ).asInstanceOf
    )
  end getModel

  /** Checks if a map function is currently set on @self.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def hasMap(): Boolean /* None */ =
    gtk_map_list_model_has_map(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkMapListModel]]
    ).value.!=(0)
  end hasMap

  /** Sets the function used to map items.
    *
    * The function will be called whenever an item needs to be mapped and must
    * return the item to use for the given input item.
    *
    * Note that `GtkMapListModel` may call this function multiple times on the
    * same item, because it may delete items it doesn't need anymore.
    *
    * GTK makes no effort to ensure that @map_func conforms to the item type of @self.
    * It assumes that the caller knows what they are doing and the map function
    * returns items of the appropriate type.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_map_func/<method parameters>/map_func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(MapListModelMapFunc), @type -> DataRecord(GtkMapListModelMapFunc)))"
  )
  private def setMapFunc__ = ???

  /** Sets the model to be mapped.
    *
    * GTK makes no effort to ensure that @model conforms to the item type
    * expected by the map function. It assumes that the caller knows what they
    * are doing and have set up an appropriate map function.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setModel(
      model: Option[
        ListModel /* Some(Ptr[_root_.sn.gnome.gio.internal.GListModel]) */
      ]
  ): Unit /* None */ =
    gtk_map_list_model_set_model(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkMapListModel]],
      model
        .map[Ptr[_root_.sn.gnome.gio.internal.GListModel]](o =>
          o.getUnsafeRawPointer().asInstanceOf
        )
        .getOrElse(
          null.asInstanceOf[Ptr[_root_.sn.gnome.gio.internal.GListModel]]
        )
    )
  end setModel

end MapListModel

object MapListModel:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkMapListModel])(using Runtime) =
    summon[Runtime].getOrCreate[MapListModel](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new MapListModel(ptr)
    )

  /** Creates a new `GtkMapListModel` for the given arguments.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[constructor new/map_func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(MapListModelMapFunc), @type -> DataRecord(GtkMapListModelMapFunc)))"
  )
  private def apply() = ???

end MapListModel
