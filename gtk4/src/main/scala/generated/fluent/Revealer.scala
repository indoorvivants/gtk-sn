package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.guint
import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkRevealer
import sn.gnome.gtk4.internal.GtkRevealerTransitionType

class Revealer(raw: Ptr[GtkRevealer])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getChild(): Widget = new Widget(
    gtk_revealer_get_child(this.raw.asInstanceOf).asInstanceOf
  )

  def getChildRevealed(): Boolean =
    gtk_revealer_get_child_revealed(this.raw.asInstanceOf).value.!=(0)

  def getRevealChild(): Boolean =
    gtk_revealer_get_reveal_child(this.raw.asInstanceOf).value.!=(0)

  def getTransitionDuration(): UInt = gtk_revealer_get_transition_duration(
    this.raw.asInstanceOf
  ).value

  def getTransitionType(): GtkRevealerTransitionType =
    gtk_revealer_get_transition_type(this.raw.asInstanceOf)

  def setChild(child: Widget): Unit = gtk_revealer_set_child(
    this.raw.asInstanceOf,
    child.getUnsafeRawPointer().asInstanceOf
  )

  def setRevealChild(reveal_child: Boolean): Unit =
    gtk_revealer_set_reveal_child(
      this.raw.asInstanceOf,
      gboolean(gint((if reveal_child == true then 1 else 0)))
    )

  def setTransitionDuration(duration: UInt): Unit =
    gtk_revealer_set_transition_duration(this.raw.asInstanceOf, guint(duration))

  def setTransitionType(transition: GtkRevealerTransitionType): Unit =
    gtk_revealer_set_transition_type(this.raw.asInstanceOf, transition)

end Revealer

object Revealer:
  def apply(): Revealer = new Revealer(gtk_revealer_new().asInstanceOf)
end Revealer
