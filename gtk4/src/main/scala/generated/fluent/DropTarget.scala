package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gdk4.fluent.Drop
import sn.gnome.gdk4.internal.GdkContentFormats
import sn.gnome.gdk4.internal.GdkDragAction
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.gsize
import sn.gnome.gobject.internal.GType
import sn.gnome.gobject.internal.GValue
import sn.gnome.gtk4.fluent.EventController
import sn.gnome.gtk4.internal.GtkDropTarget

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkDropTarget` is an event controller to receive Drag-and-Drop operations.
  *
  * The most basic way to use a `GtkDropTarget` to receive drops on a widget is
  * to create it via [ctor@Gtk.DropTarget.new], passing in the `GType` of the
  * data you want to receive and connect to the [signal@Gtk.DropTarget::drop]
  * signal to receive the data:
  *
  * ```c
  * static gboolean
  * on_drop (GtkDropTarget *target,
  *          const GValue  *value,
  *          double         x,
  *          double         y,
  *          gpointer       data)
  * {
  *   MyWidget *self = data;
  *
  *   // Call the appropriate setter depending on the type of data
  *   // that we received
  *   if (G_VALUE_HOLDS (value, G_TYPE_FILE))
  *     my_widget_set_file (self, g_value_get_object (value));
  *   else if (G_VALUE_HOLDS (value, GDK_TYPE_PIXBUF))
  *     my_widget_set_pixbuf (self, g_value_get_object (value));
  *   else
  *     return FALSE;
  *
  *   return TRUE;
  * }
  *
  * static void
  * my_widget_init (MyWidget *self)
  * {
  *   GtkDropTarget *target =
  *     gtk_drop_target_new (G_TYPE_INVALID, GDK_ACTION_COPY);
  *
  *   // This widget accepts two types of drop types: GFile objects
  *   // and GdkPixbuf objects
  *   gtk_drop_target_set_gtypes (target, (GTypes [2]) {
  *     G_TYPE_FILE,
  *     GDK_TYPE_PIXBUF,
  *   }, 2);
  *
  *   g_signal_connect (target, "drop", G_CALLBACK (on_drop), self);
  *   gtk_widget_add_controller (GTK_WIDGET (self), GTK_EVENT_CONTROLLER (target));
  * }
  * ```
  *
  * `GtkDropTarget` supports more options, such as:
  *
  * * rejecting potential drops via the [signal@Gtk.DropTarget::accept] signal
  * and the [method@Gtk.DropTarget.reject] function to let other drop targets
  * handle the drop * tracking an ongoing drag operation before the drop via the
  * [signal@Gtk.DropTarget::enter], [signal@Gtk.DropTarget::motion] and
  * [signal@Gtk.DropTarget::leave] signals * configuring how to receive data by
  * setting the [property@Gtk.DropTarget:preload] property and listening for its
  * availability via the [property@Gtk.DropTarget:value] property
  *
  * However, `GtkDropTarget` is ultimately modeled in a synchronous way and only
  * supports data transferred via `GType`. If you want full control over an
  * ongoing drop, the [class@Gtk.DropTargetAsync] object gives you this ability.
  *
  * While a pointer is dragged over the drop target's widget and the drop has
  * not been rejected, that widget will receive the %GTK_STATE_FLAG_DROP_ACTIVE
  * state, which can be used to style the widget.
  *
  * If you are not interested in receiving the drop, but just want to update UI
  * state during a Drag-and-Drop operation (e.g. switching tabs), you can use
  * [class@Gtk.DropControllerMotion].
  */
class DropTarget(raw: Ptr[GtkDropTarget])
    extends EventController(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the actions that this drop target supports.
    */
  def getActions(): GdkDragAction = gtk_drop_target_get_actions(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the currently handled drop operation.
    *
    * If no drop operation is going on, %NULL is returned.
    */
  def getCurrentDrop(): Drop = new Drop(
    gtk_drop_target_get_current_drop(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the currently handled drop operation.
    *
    * If no drop operation is going on, %NULL is returned.
    */
  def getDrop(): Drop = new Drop(
    gtk_drop_target_get_drop(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the data formats that this drop target accepts.
    *
    * If the result is %NULL, all formats are expected to be supported.
    */
  def getFormats(): Ptr[GdkContentFormats] = gtk_drop_target_get_formats(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the list of supported `GType`s that can be dropped on the target.
    *
    * If no types have been set, `NULL` will be returned.
    */
  @annotation.compileTimeOnly(
    "Method get_gtypes contains an OUT parameter, which is not supported yet"
  )
  def getGtypes(using DummyImplicit) = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets whether data should be preloaded on hover.
    */
  def getPreload(): Boolean =
    gtk_drop_target_get_preload(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the current drop data, as a `GValue`.
    */
  def getValue(): Ptr[GValue] = gtk_drop_target_get_value(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Rejects the ongoing drop operation.
    *
    * If no drop operation is ongoing, i.e when
    * [property@Gtk.DropTarget:current-drop] is %NULL, this function does
    * nothing.
    *
    * This function should be used when delaying the decision on whether to
    * accept a drag or not until after reading the data.
    */
  def reject(): Unit = gtk_drop_target_reject(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the actions that this drop target supports.
    */
  def setActions(actions: GdkDragAction): Unit =
    gtk_drop_target_set_actions(this.raw.asInstanceOf, actions)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the supported `GTypes` for this drop target.
    */
  def setGtypes(types: Ptr[GType], n_types: CUnsignedLongInt): Unit =
    gtk_drop_target_set_gtypes(this.raw.asInstanceOf, types, gsize(n_types))

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether data should be preloaded on hover.
    */
  def setPreload(preload: Boolean): Unit = gtk_drop_target_set_preload(
    this.raw.asInstanceOf,
    gboolean(gint((if preload == true then 1 else 0)))
  )

end DropTarget

object DropTarget:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkDropTarget` object.
    *
    * If the drop target should support more than 1 type, pass %G_TYPE_INVALID
    * for @type and then call [method@Gtk.DropTarget.set_gtypes].
    */
  def apply(`type`: GType, actions: GdkDragAction): DropTarget = new DropTarget(
    gtk_drop_target_new(`type`, actions).asInstanceOf
  )
end DropTarget
