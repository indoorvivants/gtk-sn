package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.AccessibleRange
import sn.gnome.gtk4.fluent.Adjustment
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.Orientable
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkRange

class Range(raw: Ptr[GtkRange])
    extends Widget(raw.asInstanceOf),
      Accessible,
      AccessibleRange,
      Buildable,
      ConstraintTarget,
      Orientable:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getAdjustment(): Adjustment = new Adjustment(
    gtk_range_get_adjustment(this.raw.asInstanceOf).asInstanceOf
  )

  def getFillLevel(): Double = gtk_range_get_fill_level(this.raw.asInstanceOf)

  def getFlippable(): Boolean =
    gtk_range_get_flippable(this.raw.asInstanceOf).value.!=(0)

  def getInverted(): Boolean =
    gtk_range_get_inverted(this.raw.asInstanceOf).value.!=(0)

  // Method get_range_rect contains an OUT parameter, which is not supported yet

  def getRestrictToFillLevel(): Boolean =
    gtk_range_get_restrict_to_fill_level(this.raw.asInstanceOf).value.!=(0)

  def getRoundDigits(): Int = gtk_range_get_round_digits(this.raw.asInstanceOf)

  def getShowFillLevel(): Boolean =
    gtk_range_get_show_fill_level(this.raw.asInstanceOf).value.!=(0)

  // Method get_slider_range contains an OUT parameter, which is not supported yet

  def getSliderSizeFixed(): Boolean =
    gtk_range_get_slider_size_fixed(this.raw.asInstanceOf).value.!=(0)

  def getValue(): Double = gtk_range_get_value(this.raw.asInstanceOf)

  def setAdjustment(adjustment: Adjustment): Unit = gtk_range_set_adjustment(
    this.raw.asInstanceOf,
    adjustment.getUnsafeRawPointer().asInstanceOf
  )

  def setFillLevel(fill_level: Double): Unit =
    gtk_range_set_fill_level(this.raw.asInstanceOf, fill_level)

  def setFlippable(flippable: Boolean): Unit = gtk_range_set_flippable(
    this.raw.asInstanceOf,
    gboolean(gint((if flippable == true then 1 else 0)))
  )

  def setIncrements(step: Double, page: Double): Unit =
    gtk_range_set_increments(this.raw.asInstanceOf, step, page)

  def setInverted(setting: Boolean): Unit = gtk_range_set_inverted(
    this.raw.asInstanceOf,
    gboolean(gint((if setting == true then 1 else 0)))
  )

  def setRange(min: Double, max: Double): Unit =
    gtk_range_set_range(this.raw.asInstanceOf, min, max)

  def setRestrictToFillLevel(restrict_to_fill_level: Boolean): Unit =
    gtk_range_set_restrict_to_fill_level(
      this.raw.asInstanceOf,
      gboolean(gint((if restrict_to_fill_level == true then 1 else 0)))
    )

  def setRoundDigits(round_digits: Int): Unit =
    gtk_range_set_round_digits(this.raw.asInstanceOf, round_digits)

  def setShowFillLevel(show_fill_level: Boolean): Unit =
    gtk_range_set_show_fill_level(
      this.raw.asInstanceOf,
      gboolean(gint((if show_fill_level == true then 1 else 0)))
    )

  def setSliderSizeFixed(size_fixed: Boolean): Unit =
    gtk_range_set_slider_size_fixed(
      this.raw.asInstanceOf,
      gboolean(gint((if size_fixed == true then 1 else 0)))
    )

  def setValue(value: Double): Unit =
    gtk_range_set_value(this.raw.asInstanceOf, value)

end Range
