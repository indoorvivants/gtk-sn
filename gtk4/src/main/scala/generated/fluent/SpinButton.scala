package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.guint
import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.AccessibleRange
import sn.gnome.gtk4.fluent.Adjustment
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.CellEditable
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.Editable
import sn.gnome.gtk4.fluent.Orientable
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkSpinButton
import sn.gnome.gtk4.internal.GtkSpinButtonUpdatePolicy
import sn.gnome.gtk4.internal.GtkSpinType

class SpinButton(raw: Ptr[GtkSpinButton])
    extends Widget(raw.asInstanceOf),
      Accessible,
      AccessibleRange,
      Buildable,
      CellEditable,
      ConstraintTarget,
      Editable,
      Orientable:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def configure(
      adjustment: Adjustment,
      climb_rate: Double,
      digits: UInt
  ): Unit = gtk_spin_button_configure(
    this.raw.asInstanceOf,
    adjustment.getUnsafeRawPointer().asInstanceOf,
    climb_rate,
    guint(digits)
  )

  def getAdjustment(): Adjustment = new Adjustment(
    gtk_spin_button_get_adjustment(this.raw.asInstanceOf).asInstanceOf
  )

  def getClimbRate(): Double = gtk_spin_button_get_climb_rate(
    this.raw.asInstanceOf
  )

  def getDigits(): UInt = gtk_spin_button_get_digits(
    this.raw.asInstanceOf
  ).value

  // Method get_increments contains an OUT parameter, which is not supported yet

  def getNumeric(): Boolean =
    gtk_spin_button_get_numeric(this.raw.asInstanceOf).value.!=(0)

  // Method get_range contains an OUT parameter, which is not supported yet

  def getSnapToTicks(): Boolean =
    gtk_spin_button_get_snap_to_ticks(this.raw.asInstanceOf).value.!=(0)

  def getUpdatePolicy(): GtkSpinButtonUpdatePolicy =
    gtk_spin_button_get_update_policy(this.raw.asInstanceOf)

  def getValue(): Double = gtk_spin_button_get_value(this.raw.asInstanceOf)

  def getValueAsInt(): Int = gtk_spin_button_get_value_as_int(
    this.raw.asInstanceOf
  )

  def getWrap(): Boolean =
    gtk_spin_button_get_wrap(this.raw.asInstanceOf).value.!=(0)

  def setAdjustment(adjustment: Adjustment): Unit =
    gtk_spin_button_set_adjustment(
      this.raw.asInstanceOf,
      adjustment.getUnsafeRawPointer().asInstanceOf
    )

  def setClimbRate(climb_rate: Double): Unit =
    gtk_spin_button_set_climb_rate(this.raw.asInstanceOf, climb_rate)

  def setDigits(digits: UInt): Unit =
    gtk_spin_button_set_digits(this.raw.asInstanceOf, guint(digits))

  def setIncrements(step: Double, page: Double): Unit =
    gtk_spin_button_set_increments(this.raw.asInstanceOf, step, page)

  def setNumeric(numeric: Boolean): Unit = gtk_spin_button_set_numeric(
    this.raw.asInstanceOf,
    gboolean(gint((if numeric == true then 1 else 0)))
  )

  def setRange(min: Double, max: Double): Unit =
    gtk_spin_button_set_range(this.raw.asInstanceOf, min, max)

  def setSnapToTicks(snap_to_ticks: Boolean): Unit =
    gtk_spin_button_set_snap_to_ticks(
      this.raw.asInstanceOf,
      gboolean(gint((if snap_to_ticks == true then 1 else 0)))
    )

  def setUpdatePolicy(policy: GtkSpinButtonUpdatePolicy): Unit =
    gtk_spin_button_set_update_policy(this.raw.asInstanceOf, policy)

  def setValue(value: Double): Unit =
    gtk_spin_button_set_value(this.raw.asInstanceOf, value)

  def setWrap(wrap: Boolean): Unit = gtk_spin_button_set_wrap(
    this.raw.asInstanceOf,
    gboolean(gint((if wrap == true then 1 else 0)))
  )

  def spin(direction: GtkSpinType, increment: Double): Unit =
    gtk_spin_button_spin(this.raw.asInstanceOf, direction, increment)

  def update(): Unit = gtk_spin_button_update(this.raw.asInstanceOf)

end SpinButton

object SpinButton:
  def apply(
      adjustment: Adjustment,
      climb_rate: Double,
      digits: UInt
  ): SpinButton = new SpinButton(
    gtk_spin_button_new(
      adjustment.getUnsafeRawPointer().asInstanceOf,
      climb_rate,
      guint(digits)
    ).asInstanceOf
  )
  def withRange(min: Double, max: Double, step: Double): SpinButton =
    new SpinButton(gtk_spin_button_new_with_range(min, max, step).asInstanceOf)
end SpinButton
