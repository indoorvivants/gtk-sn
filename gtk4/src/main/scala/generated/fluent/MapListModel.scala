package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.ListModel
import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.fluent.SectionModel
import sn.gnome.gtk4.internal.GtkMapListModel

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A `GtkMapListModel` maps the items in a list model to different items.
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
  */
class MapListModel(raw: Ptr[GtkMapListModel])
    extends Object(raw.asInstanceOf),
      ListModel,
      SectionModel:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the model that is currently being mapped or %NULL if none.
    */
  def getModel(): ListModel /* None */ = new ListModel.Abstract(
    gtk_map_list_model_get_model(
      this.raw.asInstanceOf[Ptr[GtkMapListModel]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Checks if a map function is currently set on @self.
    */
  def hasMap(): Boolean /* None */ = gtk_map_list_model_has_map(
    this.raw.asInstanceOf[Ptr[GtkMapListModel]]
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the function used to map items.
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
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(MapListModelMapFunc), @type -> DataRecord(GtkMapListModelMapFunc)))"
  )
  def setMapFunc__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the model to be mapped.
    *
    * GTK makes no effort to ensure that @model conforms to the item type
    * expected by the map function. It assumes that the caller knows what they
    * are doing and have set up an appropriate map function.
    */
  def setModel(
      model: Option[
        ListModel /* Some(Ptr[_root_.sn.gnome.gio.internal.GListModel]) */
      ]
  ): Unit /* None */ = gtk_map_list_model_set_model(
    this.raw.asInstanceOf[Ptr[GtkMapListModel]],
    model
      .map[Ptr[_root_.sn.gnome.gio.internal.GListModel]](o =>
        o.getUnsafeRawPointer().asInstanceOf
      )
      .getOrElse(
        null.asInstanceOf[Ptr[_root_.sn.gnome.gio.internal.GListModel]]
      )
  )

end MapListModel

object MapListModel:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkMapListModel` for the given arguments.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(MapListModelMapFunc), @type -> DataRecord(GtkMapListModelMapFunc)))"
  )
  def `new`() = ???

end MapListModel
