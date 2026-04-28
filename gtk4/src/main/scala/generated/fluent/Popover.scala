package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.internal.GdkRectangle
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.Native
import sn.gnome.gtk4.fluent.ShortcutManager
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkPopover
import sn.gnome.gtk4.internal.GtkPositionType

class Popover(raw: Ptr[GtkPopover])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget,
      Native,
      ShortcutManager:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getAutohide(): Boolean =
    gtk_popover_get_autohide(this.raw.asInstanceOf).value.!=(0)

  def getCascadePopdown(): Boolean =
    gtk_popover_get_cascade_popdown(this.raw.asInstanceOf).value.!=(0)

  def getChild(): Widget = new Widget(
    gtk_popover_get_child(this.raw.asInstanceOf).asInstanceOf
  )

  def getHasArrow(): Boolean =
    gtk_popover_get_has_arrow(this.raw.asInstanceOf).value.!=(0)

  def getMnemonicsVisible(): Boolean =
    gtk_popover_get_mnemonics_visible(this.raw.asInstanceOf).value.!=(0)

  // Method get_offset contains an OUT parameter, which is not supported yet

  // Method get_pointing_to contains an OUT parameter, which is not supported yet

  def getPosition(): GtkPositionType = gtk_popover_get_position(
    this.raw.asInstanceOf
  )

  def popdown(): Unit = gtk_popover_popdown(this.raw.asInstanceOf)

  def popup(): Unit = gtk_popover_popup(this.raw.asInstanceOf)

  def present(): Unit = gtk_popover_present(this.raw.asInstanceOf)

  def setAutohide(autohide: Boolean): Unit = gtk_popover_set_autohide(
    this.raw.asInstanceOf,
    gboolean(gint((if autohide == true then 1 else 0)))
  )

  def setCascadePopdown(cascade_popdown: Boolean): Unit =
    gtk_popover_set_cascade_popdown(
      this.raw.asInstanceOf,
      gboolean(gint((if cascade_popdown == true then 1 else 0)))
    )

  def setChild(child: Widget): Unit = gtk_popover_set_child(
    this.raw.asInstanceOf,
    child.getUnsafeRawPointer().asInstanceOf
  )

  def setDefaultWidget(widget: Widget): Unit = gtk_popover_set_default_widget(
    this.raw.asInstanceOf,
    widget.getUnsafeRawPointer().asInstanceOf
  )

  def setHasArrow(has_arrow: Boolean): Unit = gtk_popover_set_has_arrow(
    this.raw.asInstanceOf,
    gboolean(gint((if has_arrow == true then 1 else 0)))
  )

  def setMnemonicsVisible(mnemonics_visible: Boolean): Unit =
    gtk_popover_set_mnemonics_visible(
      this.raw.asInstanceOf,
      gboolean(gint((if mnemonics_visible == true then 1 else 0)))
    )

  def setOffset(x_offset: Int, y_offset: Int): Unit =
    gtk_popover_set_offset(this.raw.asInstanceOf, x_offset, y_offset)

  def setPointingTo(rect: Ptr[GdkRectangle]): Unit =
    gtk_popover_set_pointing_to(this.raw.asInstanceOf, rect)

  def setPosition(position: GtkPositionType): Unit =
    gtk_popover_set_position(this.raw.asInstanceOf, position)

end Popover

object Popover:
  def apply(): Popover = new Popover(gtk_popover_new().asInstanceOf)
end Popover
