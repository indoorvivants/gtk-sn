package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.AccessibleRange
import sn.gnome.gtk4.fluent.Adjustment
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.Button
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.Orientable
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkScaleButton

class ScaleButton(raw: Ptr[GtkScaleButton])
    extends Widget(raw.asInstanceOf),
      Accessible,
      AccessibleRange,
      Buildable,
      ConstraintTarget,
      Orientable:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getActive(): Boolean =
    gtk_scale_button_get_active(this.raw.asInstanceOf).value.!=(0)

  def getAdjustment(): Adjustment = new Adjustment(
    gtk_scale_button_get_adjustment(this.raw.asInstanceOf).asInstanceOf
  )

  def getMinusButton(): Button = new Button(
    gtk_scale_button_get_minus_button(this.raw.asInstanceOf).asInstanceOf
  )

  def getPlusButton(): Button = new Button(
    gtk_scale_button_get_plus_button(this.raw.asInstanceOf).asInstanceOf
  )

  def getPopup(): Widget = new Widget(
    gtk_scale_button_get_popup(this.raw.asInstanceOf).asInstanceOf
  )

  def getValue(): Double = gtk_scale_button_get_value(this.raw.asInstanceOf)

  def setAdjustment(adjustment: Adjustment): Unit =
    gtk_scale_button_set_adjustment(
      this.raw.asInstanceOf,
      adjustment.getUnsafeRawPointer().asInstanceOf
    )

  // Method set_icons contains an array parameter, which is not supported yet

  def setValue(value: Double): Unit =
    gtk_scale_button_set_value(this.raw.asInstanceOf, value)

end ScaleButton
