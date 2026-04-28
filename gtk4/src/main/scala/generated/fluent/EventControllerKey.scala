package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.guint
import sn.gnome.gtk4.fluent.EventController
import sn.gnome.gtk4.fluent.IMContext
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkEventControllerKey

class EventControllerKey(raw: Ptr[GtkEventControllerKey])
    extends EventController(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def forward(widget: Widget): Boolean = gtk_event_controller_key_forward(
    this.raw.asInstanceOf,
    widget.getUnsafeRawPointer().asInstanceOf
  ).value.!=(0)

  def getGroup(): UInt = gtk_event_controller_key_get_group(
    this.raw.asInstanceOf
  ).value

  def getImContext(): IMContext = new IMContext(
    gtk_event_controller_key_get_im_context(this.raw.asInstanceOf).asInstanceOf
  )

  def setImContext(im_context: IMContext): Unit =
    gtk_event_controller_key_set_im_context(
      this.raw.asInstanceOf,
      im_context.getUnsafeRawPointer().asInstanceOf
    )

end EventControllerKey

object EventControllerKey:
  def apply(): EventControllerKey = new EventControllerKey(
    gtk_event_controller_key_new().asInstanceOf
  )
end EventControllerKey
