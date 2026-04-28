package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.fluent.InitiallyUnowned
import sn.gnome.gtk4.internal.GtkAdjustment

class Adjustment(raw: Ptr[GtkAdjustment])
    extends InitiallyUnowned(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def clampPage(lower: Double, upper: Double): Unit =
    gtk_adjustment_clamp_page(this.raw.asInstanceOf, lower, upper)

  def configure(
      value: Double,
      lower: Double,
      upper: Double,
      step_increment: Double,
      page_increment: Double,
      page_size: Double
  ): Unit = gtk_adjustment_configure(
    this.raw.asInstanceOf,
    value,
    lower,
    upper,
    step_increment,
    page_increment,
    page_size
  )

  def getLower(): Double = gtk_adjustment_get_lower(this.raw.asInstanceOf)

  def getMinimumIncrement(): Double = gtk_adjustment_get_minimum_increment(
    this.raw.asInstanceOf
  )

  def getPageIncrement(): Double = gtk_adjustment_get_page_increment(
    this.raw.asInstanceOf
  )

  def getPageSize(): Double = gtk_adjustment_get_page_size(
    this.raw.asInstanceOf
  )

  def getStepIncrement(): Double = gtk_adjustment_get_step_increment(
    this.raw.asInstanceOf
  )

  def getUpper(): Double = gtk_adjustment_get_upper(this.raw.asInstanceOf)

  def getValue(): Double = gtk_adjustment_get_value(this.raw.asInstanceOf)

  def setLower(lower: Double): Unit =
    gtk_adjustment_set_lower(this.raw.asInstanceOf, lower)

  def setPageIncrement(page_increment: Double): Unit =
    gtk_adjustment_set_page_increment(this.raw.asInstanceOf, page_increment)

  def setPageSize(page_size: Double): Unit =
    gtk_adjustment_set_page_size(this.raw.asInstanceOf, page_size)

  def setStepIncrement(step_increment: Double): Unit =
    gtk_adjustment_set_step_increment(this.raw.asInstanceOf, step_increment)

  def setUpper(upper: Double): Unit =
    gtk_adjustment_set_upper(this.raw.asInstanceOf, upper)

  def setValue(value: Double): Unit =
    gtk_adjustment_set_value(this.raw.asInstanceOf, value)

end Adjustment

object Adjustment:
  def apply(
      value: Double,
      lower: Double,
      upper: Double,
      step_increment: Double,
      page_increment: Double,
      page_size: Double
  ): Adjustment = new Adjustment(
    gtk_adjustment_new(
      value,
      lower,
      upper,
      step_increment,
      page_increment,
      page_size
    ).asInstanceOf
  )
end Adjustment
