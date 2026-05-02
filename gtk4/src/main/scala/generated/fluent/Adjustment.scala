package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.fluent.InitiallyUnowned
import sn.gnome.gtk4.internal.GtkAdjustment

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkAdjustment` is a model for a numeric value.
  *
  * The `GtkAdjustment` has an associated lower and upper bound. It also
  * contains step and page increments, and a page size.
  *
  * Adjustments are used within several GTK widgets, including
  * [class@Gtk.SpinButton], [class@Gtk.Viewport], [class@Gtk.Scrollbar] and
  * [class@Gtk.Scale].
  *
  * The `GtkAdjustment` object does not update the value itself. Instead it is
  * left up to the owner of the `GtkAdjustment` to control the value.
  */
class Adjustment(raw: Ptr[GtkAdjustment])
    extends InitiallyUnowned(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Updates the value property to ensure that the range between @lower and @upper
    * is in the current page.
    *
    * The current page goes from `value` to `value` + `page-size`. If the range
    * is larger than the page size, then only the start of it will be in the
    * current page.
    *
    * A [signal@Gtk.Adjustment::value-changed] signal will be emitted if the
    * value is changed.
    */
  def clampPage(
      lower: Double /* Some(Double) */,
      upper: Double /* Some(Double) */
  ): Unit /* None */ =
    gtk_adjustment_clamp_page(this.raw.asInstanceOf, lower, upper)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets all properties of the adjustment at once.
    *
    * Use this function to avoid multiple emissions of the
    * [signal@Gtk.Adjustment::changed] signal. See
    * [method@Gtk.Adjustment.set_lower] for an alternative way of compressing
    * multiple emissions of [signal@Gtk.Adjustment::changed] into one.
    */
  def configure(
      value: Double /* Some(Double) */,
      lower: Double /* Some(Double) */,
      upper: Double /* Some(Double) */,
      step_increment: Double /* Some(Double) */,
      page_increment: Double /* Some(Double) */,
      page_size: Double /* Some(Double) */
  ): Unit /* None */ = gtk_adjustment_configure(
    this.raw.asInstanceOf,
    value,
    lower,
    upper,
    step_increment,
    page_increment,
    page_size
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the minimum value of the adjustment.
    */
  def getLower(): Double /* None */ = gtk_adjustment_get_lower(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the smaller of step increment and page increment.
    */
  def getMinimumIncrement(): Double /* None */ =
    gtk_adjustment_get_minimum_increment(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the page increment of the adjustment.
    */
  def getPageIncrement(): Double /* None */ = gtk_adjustment_get_page_increment(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the page size of the adjustment.
    */
  def getPageSize(): Double /* None */ = gtk_adjustment_get_page_size(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the step increment of the adjustment.
    */
  def getStepIncrement(): Double /* None */ = gtk_adjustment_get_step_increment(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the maximum value of the adjustment.
    */
  def getUpper(): Double /* None */ = gtk_adjustment_get_upper(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the current value of the adjustment.
    */
  def getValue(): Double /* None */ = gtk_adjustment_get_value(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the minimum value of the adjustment.
    *
    * When setting multiple adjustment properties via their individual setters,
    * multiple [signal@Gtk.Adjustment::changed] signals will be emitted.
    * However, since the emission of the [signal@Gtk.Adjustment::changed] signal
    * is tied to the emission of the ::notify signals of the changed properties,
    * it’s possible to compress the [signal@Gtk.Adjustment::changed] signals
    * into one by calling g_object_freeze_notify() and g_object_thaw_notify()
    * around the calls to the individual setters.
    *
    * Alternatively, using a single g_object_set() for all the properties to
    * change, or using [method@Gtk.Adjustment.configure] has the same effect.
    */
  def setLower(lower: Double /* Some(Double) */ ): Unit /* None */ =
    gtk_adjustment_set_lower(this.raw.asInstanceOf, lower)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the page increment of the adjustment.
    *
    * See [method@Gtk.Adjustment.set_lower] about how to compress multiple
    * emissions of the [signal@Gtk.Adjustment::changed] signal when setting
    * multiple adjustment properties.
    */
  def setPageIncrement(
      page_increment: Double /* Some(Double) */
  ): Unit /* None */ =
    gtk_adjustment_set_page_increment(this.raw.asInstanceOf, page_increment)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the page size of the adjustment.
    *
    * See [method@Gtk.Adjustment.set_lower] about how to compress multiple
    * emissions of the [signal@Gtk.Adjustment::changed] signal when setting
    * multiple adjustment properties.
    */
  def setPageSize(page_size: Double /* Some(Double) */ ): Unit /* None */ =
    gtk_adjustment_set_page_size(this.raw.asInstanceOf, page_size)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the step increment of the adjustment.
    *
    * See [method@Gtk.Adjustment.set_lower] about how to compress multiple
    * emissions of the [signal@Gtk.Adjustment::changed] signal when setting
    * multiple adjustment properties.
    */
  def setStepIncrement(
      step_increment: Double /* Some(Double) */
  ): Unit /* None */ =
    gtk_adjustment_set_step_increment(this.raw.asInstanceOf, step_increment)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the maximum value of the adjustment.
    *
    * Note that values will be restricted by `upper - page-size` if the
    * page-size property is nonzero.
    *
    * See [method@Gtk.Adjustment.set_lower] about how to compress multiple
    * emissions of the [signal@Gtk.Adjustment::changed] signal when setting
    * multiple adjustment properties.
    */
  def setUpper(upper: Double /* Some(Double) */ ): Unit /* None */ =
    gtk_adjustment_set_upper(this.raw.asInstanceOf, upper)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the `GtkAdjustment` value.
    *
    * The value is clamped to lie between [property@Gtk.Adjustment:lower] and
    * [property@Gtk.Adjustment:upper].
    *
    * Note that for adjustments which are used in a `GtkScrollbar`, the
    * effective range of allowed values goes from
    * [property@Gtk.Adjustment:lower] to [property@Gtk.Adjustment:upper] -
    * [property@Gtk.Adjustment:page-size].
    */
  def setValue(value: Double /* Some(Double) */ ): Unit /* None */ =
    gtk_adjustment_set_value(this.raw.asInstanceOf, value)

end Adjustment

object Adjustment:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkAdjustment`.
    */
  def apply(
      value: Double /* Some(Double) */,
      lower: Double /* Some(Double) */,
      upper: Double /* Some(Double) */,
      step_increment: Double /* Some(Double) */,
      page_increment: Double /* Some(Double) */,
      page_size: Double /* Some(Double) */
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
