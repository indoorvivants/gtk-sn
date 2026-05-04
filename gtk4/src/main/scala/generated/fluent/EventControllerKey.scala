package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.{gboolean, gint, guint}
import sn.gnome.gtk4.fluent.{EventController, IMContext, Widget}
import sn.gnome.gtk4.internal.GtkEventControllerKey

/** `GtkEventControllerKey` is an event controller that provides access to key
  * events.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class EventControllerKey(raw: Ptr[GtkEventControllerKey])
    extends EventController(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Forwards the current event of this @controller to a @widget.
    *
    * This function can only be used in handlers for the
    * [signal@Gtk.EventControllerKey::key-pressed],
    * [signal@Gtk.EventControllerKey::key-released] or
    * [signal@Gtk.EventControllerKey::modifiers] signals.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def forward(widget: Widget /* Some(Ptr[GtkWidget]) */ ): Boolean /* None */ =
    gtk_event_controller_key_forward(
      this.raw.asInstanceOf[Ptr[GtkEventControllerKey]],
      widget.getUnsafeRawPointer().asInstanceOf
    ).value.!=(0)

  /** Gets the key group of the current event of this @controller.
    *
    * See [method@Gdk.KeyEvent.get_layout].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getGroup(): UInt /* None */ = gtk_event_controller_key_get_group(
    this.raw.asInstanceOf[Ptr[GtkEventControllerKey]]
  ).value

  /** Gets the input method context of the key @controller.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getImContext(): IMContext /* None */ = new IMContext(
    gtk_event_controller_key_get_im_context(
      this.raw.asInstanceOf[Ptr[GtkEventControllerKey]]
    ).asInstanceOf
  )

  /** Sets the input method context of the key @controller.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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
  /** Creates a new event controller that will handle key events.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(): EventControllerKey = new EventControllerKey(
    gtk_event_controller_key_new().asInstanceOf
  )
end EventControllerKey
