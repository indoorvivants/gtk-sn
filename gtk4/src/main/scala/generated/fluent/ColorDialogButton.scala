package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.internal.GdkRGBA
import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.ColorDialog
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkColorDialogButton

class ColorDialogButton(raw: Ptr[GtkColorDialogButton])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getDialog(): ColorDialog = new ColorDialog(
    gtk_color_dialog_button_get_dialog(this.raw.asInstanceOf).asInstanceOf
  )

  def getRgba(): Ptr[GdkRGBA] = gtk_color_dialog_button_get_rgba(
    this.raw.asInstanceOf
  )

  def setDialog(dialog: ColorDialog): Unit = gtk_color_dialog_button_set_dialog(
    this.raw.asInstanceOf,
    dialog.getUnsafeRawPointer().asInstanceOf
  )

  def setRgba(color: Ptr[GdkRGBA]): Unit =
    gtk_color_dialog_button_set_rgba(this.raw.asInstanceOf, color)

end ColorDialogButton

object ColorDialogButton:
  def apply(dialog: ColorDialog): ColorDialogButton = new ColorDialogButton(
    gtk_color_dialog_button_new(
      dialog.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )
end ColorDialogButton
