package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.{gboolean, gint, guint}
import sn.gnome.gtk4.fluent.{EventController, IMContext, Widget}
import sn.gnome.gtk4.internal.GtkEventControllerKey

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkEventControllerKey` is an event controller that provides access to key
  * events.
  */
class EventControllerKey(raw: Ptr[GtkEventControllerKey])
    extends EventController(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Forwards the current event of this @controller to a @widget.
    *
    * This function can only be used in handlers for the
    * [signal@Gtk.EventControllerKey::key-pressed],
    * [signal@Gtk.EventControllerKey::key-released] or
    * [signal@Gtk.EventControllerKey::modifiers] signals.
    */
  def forward(widget: Widget /* Some(Ptr[GtkWidget]) */ ): Boolean /* None */ =
    gtk_event_controller_key_forward(
      this.raw.asInstanceOf[Ptr[GtkEventControllerKey]],
      widget.getUnsafeRawPointer().asInstanceOf
    ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the key group of the current event of this @controller.
    *
    * See [method@Gdk.KeyEvent.get_layout].
    */
  def getGroup(): UInt /* None */ = gtk_event_controller_key_get_group(
    this.raw.asInstanceOf[Ptr[GtkEventControllerKey]]
  ).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the input method context of the key @controller.
    */
  def getImContext(): IMContext /* None */ = new IMContext(
    gtk_event_controller_key_get_im_context(
      this.raw.asInstanceOf[Ptr[GtkEventControllerKey]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the input method context of the key @controller.
    */
  def setImContext(
      im_context: Option[IMContext /* Some(Ptr[GtkIMContext]) */ ]
  ): Unit /* None */ = gtk_event_controller_key_set_im_context(
    this.raw.asInstanceOf[Ptr[GtkEventControllerKey]],
    im_context
      .map[Ptr[GtkIMContext]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkIMContext]])
  )

end EventControllerKey

object EventControllerKey:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new event controller that will handle key events.
    */
  def apply(): EventControllerKey = new EventControllerKey(
    gtk_event_controller_key_new().asInstanceOf
  )
end EventControllerKey
