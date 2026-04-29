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

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkRange` is the common base class for widgets which visualize an
  * adjustment.
  *
  * Widgets that are derived from `GtkRange` include [class@Gtk.Scale] and
  * [class@Gtk.Scrollbar].
  *
  * Apart from signals for monitoring the parameters of the adjustment,
  * `GtkRange` provides properties and methods for setting a “fill level” on
  * range widgets. See [method@Gtk.Range.set_fill_level].
  */
class Range(raw: Ptr[GtkRange])
    extends Widget(raw.asInstanceOf),
      Accessible,
      AccessibleRange,
      Buildable,
      ConstraintTarget,
      Orientable:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Get the adjustment which is the “model” object for `GtkRange`.
    */
  def getAdjustment(): Adjustment = new Adjustment(
    gtk_range_get_adjustment(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the current position of the fill level indicator.
    */
  def getFillLevel(): Double = gtk_range_get_fill_level(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets whether the `GtkRange` respects text direction.
    *
    * See [method@Gtk.Range.set_flippable].
    */
  def getFlippable(): Boolean =
    gtk_range_get_flippable(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets whether the range is inverted.
    *
    * See [method@Gtk.Range.set_inverted].
    */
  def getInverted(): Boolean =
    gtk_range_get_inverted(this.raw.asInstanceOf).value.!=(0)

  @annotation.compileTimeOnly(
    "Method get_range_rect contains an OUT parameter, which is not supported yet"
  )
  def getRangeRect() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets whether the range is restricted to the fill level.
    */
  def getRestrictToFillLevel(): Boolean =
    gtk_range_get_restrict_to_fill_level(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the number of digits to round the value to when it changes.
    *
    * See [signal@Gtk.Range::change-value].
    */
  def getRoundDigits(): Int = gtk_range_get_round_digits(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets whether the range displays the fill level graphically.
    */
  def getShowFillLevel(): Boolean =
    gtk_range_get_show_fill_level(this.raw.asInstanceOf).value.!=(0)

  @annotation.compileTimeOnly(
    "Method get_slider_range contains an OUT parameter, which is not supported yet"
  )
  def getSliderRange() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * This function is useful mainly for `GtkRange` subclasses.
    *
    * See [method@Gtk.Range.set_slider_size_fixed].
    */
  def getSliderSizeFixed(): Boolean =
    gtk_range_get_slider_size_fixed(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the current value of the range.
    */
  def getValue(): Double = gtk_range_get_value(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the adjustment to be used as the “model” object for the `GtkRange`
    *
    * The adjustment indicates the current range value, the minimum and maximum
    * range values, the step/page increments used for keybindings and scrolling,
    * and the page size.
    *
    * The page size is normally 0 for `GtkScale` and nonzero for `GtkScrollbar`,
    * and indicates the size of the visible area of the widget being scrolled.
    * The page size affects the size of the scrollbar slider.
    */
  def setAdjustment(adjustment: Adjustment): Unit = gtk_range_set_adjustment(
    this.raw.asInstanceOf,
    adjustment.getUnsafeRawPointer().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Set the new position of the fill level indicator.
    *
    * The “fill level” is probably best described by its most prominent use
    * case, which is an indicator for the amount of pre-buffering in a streaming
    * media player. In that use case, the value of the range would indicate the
    * current play position, and the fill level would be the position up to
    * which the file/stream has been downloaded.
    *
    * This amount of prebuffering can be displayed on the range’s trough and is
    * themeable separately from the trough. To enable fill level display, use
    * [method@Gtk.Range.set_show_fill_level]. The range defaults to not showing
    * the fill level.
    *
    * Additionally, it’s possible to restrict the range’s slider position to
    * values which are smaller than the fill level. This is controlled by
    * [method@Gtk.Range.set_restrict_to_fill_level] and is by default enabled.
    */
  def setFillLevel(fill_level: Double): Unit =
    gtk_range_set_fill_level(this.raw.asInstanceOf, fill_level)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether the `GtkRange` respects text direction.
    *
    * If a range is flippable, it will switch its direction if it is horizontal
    * and its direction is %GTK_TEXT_DIR_RTL.
    *
    * See [method@Gtk.Widget.get_direction].
    */
  def setFlippable(flippable: Boolean): Unit = gtk_range_set_flippable(
    this.raw.asInstanceOf,
    gboolean(gint((if flippable == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the step and page sizes for the range.
    *
    * The step size is used when the user clicks the `GtkScrollbar` arrows or
    * moves a `GtkScale` via arrow keys. The page size is used for example when
    * moving via Page Up or Page Down keys.
    */
  def setIncrements(step: Double, page: Double): Unit =
    gtk_range_set_increments(this.raw.asInstanceOf, step, page)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether to invert the range.
    *
    * Ranges normally move from lower to higher values as the slider moves from
    * top to bottom or left to right. Inverted ranges have higher values at the
    * top or on the right rather than on the bottom or left.
    */
  def setInverted(setting: Boolean): Unit = gtk_range_set_inverted(
    this.raw.asInstanceOf,
    gboolean(gint((if setting == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the allowable values in the `GtkRange`.
    *
    * The range value is clamped to be between @min and @max. (If the range has
    * a non-zero page size, it is clamped between @min and @max - page-size.)
    */
  def setRange(min: Double, max: Double): Unit =
    gtk_range_set_range(this.raw.asInstanceOf, min, max)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether the slider is restricted to the fill level.
    *
    * See [method@Gtk.Range.set_fill_level] for a general description of the
    * fill level concept.
    */
  def setRestrictToFillLevel(restrict_to_fill_level: Boolean): Unit =
    gtk_range_set_restrict_to_fill_level(
      this.raw.asInstanceOf,
      gboolean(gint((if restrict_to_fill_level == true then 1 else 0)))
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the number of digits to round the value to when it changes.
    *
    * See [signal@Gtk.Range::change-value].
    */
  def setRoundDigits(round_digits: Int): Unit =
    gtk_range_set_round_digits(this.raw.asInstanceOf, round_digits)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether a graphical fill level is show on the trough.
    *
    * See [method@Gtk.Range.set_fill_level] for a general description of the
    * fill level concept.
    */
  def setShowFillLevel(show_fill_level: Boolean): Unit =
    gtk_range_set_show_fill_level(
      this.raw.asInstanceOf,
      gboolean(gint((if show_fill_level == true then 1 else 0)))
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether the range’s slider has a fixed size, or a size that depends
    * on its adjustment’s page size.
    *
    * This function is useful mainly for `GtkRange` subclasses.
    */
  def setSliderSizeFixed(size_fixed: Boolean): Unit =
    gtk_range_set_slider_size_fixed(
      this.raw.asInstanceOf,
      gboolean(gint((if size_fixed == true then 1 else 0)))
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the current value of the range.
    *
    * If the value is outside the minimum or maximum range values, it will be
    * clamped to fit inside them. The range emits the
    * [signal@Gtk.Range::value-changed] signal if the value changes.
    */
  def setValue(value: Double): Unit =
    gtk_range_set_value(this.raw.asInstanceOf, value)

end Range
