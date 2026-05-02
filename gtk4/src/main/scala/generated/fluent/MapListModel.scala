package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.ListModel
import sn.gnome.glib.internal.GDestroyNotify
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.gpointer
import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.fluent.SectionModel
import sn.gnome.gtk4.internal.GtkMapListModel
import sn.gnome.gtk4.internal.GtkMapListModelMapFunc

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
    gtk_map_list_model_get_model(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Checks if a map function is currently set on @self.
    */
  def hasMap(): Boolean /* None */ =
    gtk_map_list_model_has_map(this.raw.asInstanceOf).value.!=(0)

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
  def setMapFunc(
      map_func: Option[
        GtkMapListModelMapFunc /* Some(GtkMapListModelMapFunc) */
      ],
      user_data: Option[
        Ptr[Byte] /* Some(_root_.sn.gnome.glib.internal.gpointer) */
      ],
      user_destroy: GDestroyNotify /* Some(_root_.sn.gnome.glib.internal.GDestroyNotify) */
  ): Unit /* None */ = gtk_map_list_model_set_map_func(
    this.raw.asInstanceOf,
    map_func
      .map[GtkMapListModelMapFunc](o => o)
      .getOrElse(null.asInstanceOf[GtkMapListModelMapFunc]),
    user_data
      .map[_root_.sn.gnome.glib.internal.gpointer](o => gpointer(o))
      .getOrElse(null.asInstanceOf[_root_.sn.gnome.glib.internal.gpointer]),
    user_destroy
  )

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
    this.raw.asInstanceOf,
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
  def apply(
      model: Option[
        ListModel /* Some(Ptr[_root_.sn.gnome.gio.internal.GListModel]) */
      ],
      map_func: Option[
        GtkMapListModelMapFunc /* Some(GtkMapListModelMapFunc) */
      ],
      user_data: Option[
        Ptr[Byte] /* Some(_root_.sn.gnome.glib.internal.gpointer) */
      ],
      user_destroy: GDestroyNotify /* Some(_root_.sn.gnome.glib.internal.GDestroyNotify) */
  ): MapListModel = new MapListModel(
    gtk_map_list_model_new(
      model
        .map[Ptr[_root_.sn.gnome.gio.internal.GListModel]](o =>
          o.getUnsafeRawPointer().asInstanceOf
        )
        .getOrElse(
          null.asInstanceOf[Ptr[_root_.sn.gnome.gio.internal.GListModel]]
        ),
      map_func
        .map[GtkMapListModelMapFunc](o => o)
        .getOrElse(null.asInstanceOf[GtkMapListModelMapFunc]),
      user_data
        .map[_root_.sn.gnome.glib.internal.gpointer](o => gpointer(o))
        .getOrElse(null.asInstanceOf[_root_.sn.gnome.glib.internal.gpointer]),
      user_destroy
    ).asInstanceOf
  )
end MapListModel
