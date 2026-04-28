package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkSpinner

class Spinner(raw: Ptr[GtkSpinner])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getSpinning(): Boolean =
    gtk_spinner_get_spinning(this.raw.asInstanceOf).value.!=(0)

  def setSpinning(spinning: Boolean): Unit = gtk_spinner_set_spinning(
    this.raw.asInstanceOf,
    gboolean(gint((if spinning == true then 1 else 0)))
  )

  def start(): Unit = gtk_spinner_start(this.raw.asInstanceOf)

  def stop(): Unit = gtk_spinner_stop(this.raw.asInstanceOf)

end Spinner

object Spinner:
  def apply(): Spinner = new Spinner(gtk_spinner_new().asInstanceOf)
end Spinner
