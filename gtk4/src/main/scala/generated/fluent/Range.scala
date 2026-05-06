package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.{gboolean, gchar, gint, gpointer}
import sn.gnome.gobject.internal.{
  GClosure,
  GClosureNotify,
  GConnectFlags,
  g_signal_connect_data
}
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.fluent.{
  Accessible,
  AccessibleRange,
  Adjustment,
  Buildable,
  ConstraintTarget,
  Orientable,
  ScrollType,
  Widget
}
import sn.gnome.gtk4.internal.{GtkRange, GtkScrollType}

/** `GtkRange` is the common base class for widgets which visualize an
  * adjustment.
  *
  * Widgets that are derived from `GtkRange` include [class@Gtk.Scale] and
  * [class@Gtk.Scrollbar].
  *
  * Apart from signals for monitoring the parameters of the adjustment,
  * `GtkRange` provides properties and methods for setting a “fill level” on
  * range widgets. See [method@Gtk.Range.set_fill_level].
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class Range(raw: Ptr[GtkRange])
    extends Widget(raw.asInstanceOf),
      Accessible,
      AccessibleRange,
      Buildable,
      ConstraintTarget,
      Orientable:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Get the adjustment which is the “model” object for `GtkRange`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getAdjustment(): Adjustment /* None */ = new Adjustment(
    gtk_range_get_adjustment(this.raw.asInstanceOf[Ptr[GtkRange]]).asInstanceOf
  )

  /** Gets the current position of the fill level indicator.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getFillLevel(): Double /* None */ = gtk_range_get_fill_level(
    this.raw.asInstanceOf[Ptr[GtkRange]]
  )

  /** Gets whether the `GtkRange` respects text direction.
    *
    * See [method@Gtk.Range.set_flippable].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getFlippable(): Boolean /* None */ =
    gtk_range_get_flippable(this.raw.asInstanceOf[Ptr[GtkRange]]).value.!=(0)

  /** Gets whether the range is inverted.
    *
    * See [method@Gtk.Range.set_inverted].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getInverted(): Boolean /* None */ =
    gtk_range_get_inverted(this.raw.asInstanceOf[Ptr[GtkRange]]).value.!=(0)

  /** This function returns the area that contains the range’s trough, in
    * coordinates relative to @range's origin.
    *
    * This function is useful mainly for `GtkRange` subclasses.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_range_rect]: Method get_range_rect contains an OUT parameter, which is not supported yet"
  )
  private def getRangeRect__ = ???

  /** Gets whether the range is restricted to the fill level.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getRestrictToFillLevel(): Boolean /* None */ =
    gtk_range_get_restrict_to_fill_level(
      this.raw.asInstanceOf[Ptr[GtkRange]]
    ).value.!=(0)

  /** Gets the number of digits to round the value to when it changes.
    *
    * See [signal@Gtk.Range::change-value].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getRoundDigits(): Int /* None */ = gtk_range_get_round_digits(
    this.raw.asInstanceOf[Ptr[GtkRange]]
  )

  /** Gets whether the range displays the fill level graphically.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getShowFillLevel(): Boolean /* None */ = gtk_range_get_show_fill_level(
    this.raw.asInstanceOf[Ptr[GtkRange]]
  ).value.!=(0)

  /** This function returns sliders range along the long dimension, in
    * widget->window coordinates.
    *
    * This function is useful mainly for `GtkRange` subclasses.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_slider_range]: Method get_slider_range contains an OUT parameter, which is not supported yet"
  )
  private def getSliderRange__ = ???

  /** This function is useful mainly for `GtkRange` subclasses.
    *
    * See [method@Gtk.Range.set_slider_size_fixed].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSliderSizeFixed(): Boolean /* None */ =
    gtk_range_get_slider_size_fixed(this.raw.asInstanceOf[Ptr[GtkRange]]).value
      .!=(0)

  /** Gets the current value of the range.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getValue(): Double /* None */ = gtk_range_get_value(
    this.raw.asInstanceOf[Ptr[GtkRange]]
  )

  /** Sets the adjustment to be used as the “model” object for the `GtkRange`
    *
    * The adjustment indicates the current range value, the minimum and maximum
    * range values, the step/page increments used for keybindings and scrolling,
    * and the page size.
    *
    * The page size is normally 0 for `GtkScale` and nonzero for `GtkScrollbar`,
    * and indicates the size of the visible area of the widget being scrolled.
    * The page size affects the size of the scrollbar slider.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setAdjustment(
      adjustment: Adjustment /* Some(Ptr[GtkAdjustment]) */
  ): Unit /* None */ = gtk_range_set_adjustment(
    this.raw.asInstanceOf[Ptr[GtkRange]],
    adjustment.getUnsafeRawPointer().asInstanceOf
  )

  /** Set the new position of the fill level indicator.
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setFillLevel(fill_level: Double /* Some(Double) */ ): Unit /* None */ =
    gtk_range_set_fill_level(this.raw.asInstanceOf[Ptr[GtkRange]], fill_level)

  /** Sets whether the `GtkRange` respects text direction.
    *
    * If a range is flippable, it will switch its direction if it is horizontal
    * and its direction is %GTK_TEXT_DIR_RTL.
    *
    * See [method@Gtk.Widget.get_direction].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setFlippable(
      flippable: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_range_set_flippable(
    this.raw.asInstanceOf[Ptr[GtkRange]],
    gboolean(gint((if flippable == true then 1 else 0)))
  )

  /** Sets the step and page sizes for the range.
    *
    * The step size is used when the user clicks the `GtkScrollbar` arrows or
    * moves a `GtkScale` via arrow keys. The page size is used for example when
    * moving via Page Up or Page Down keys.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setIncrements(
      step: Double /* Some(Double) */,
      page: Double /* Some(Double) */
  ): Unit /* None */ =
    gtk_range_set_increments(this.raw.asInstanceOf[Ptr[GtkRange]], step, page)

  /** Sets whether to invert the range.
    *
    * Ranges normally move from lower to higher values as the slider moves from
    * top to bottom or left to right. Inverted ranges have higher values at the
    * top or on the right rather than on the bottom or left.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setInverted(
      setting: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_range_set_inverted(
    this.raw.asInstanceOf[Ptr[GtkRange]],
    gboolean(gint((if setting == true then 1 else 0)))
  )

  /** Sets the allowable values in the `GtkRange`.
    *
    * The range value is clamped to be between @min and @max. (If the range has
    * a non-zero page size, it is clamped between @min and @max - page-size.)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setRange(
      min: Double /* Some(Double) */,
      max: Double /* Some(Double) */
  ): Unit /* None */ =
    gtk_range_set_range(this.raw.asInstanceOf[Ptr[GtkRange]], min, max)

  /** Sets whether the slider is restricted to the fill level.
    *
    * See [method@Gtk.Range.set_fill_level] for a general description of the
    * fill level concept.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setRestrictToFillLevel(
      restrict_to_fill_level: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_range_set_restrict_to_fill_level(
    this.raw.asInstanceOf[Ptr[GtkRange]],
    gboolean(gint((if restrict_to_fill_level == true then 1 else 0)))
  )

  /** Sets the number of digits to round the value to when it changes.
    *
    * See [signal@Gtk.Range::change-value].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setRoundDigits(round_digits: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_range_set_round_digits(
      this.raw.asInstanceOf[Ptr[GtkRange]],
      round_digits
    )

  /** Sets whether a graphical fill level is show on the trough.
    *
    * See [method@Gtk.Range.set_fill_level] for a general description of the
    * fill level concept.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setShowFillLevel(
      show_fill_level: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_range_set_show_fill_level(
    this.raw.asInstanceOf[Ptr[GtkRange]],
    gboolean(gint((if show_fill_level == true then 1 else 0)))
  )

  /** Sets whether the range’s slider has a fixed size, or a size that depends
    * on its adjustment’s page size.
    *
    * This function is useful mainly for `GtkRange` subclasses.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setSliderSizeFixed(
      size_fixed: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_range_set_slider_size_fixed(
    this.raw.asInstanceOf[Ptr[GtkRange]],
    gboolean(gint((if size_fixed == true then 1 else 0)))
  )

  /** Sets the current value of the range.
    *
    * If the value is outside the minimum or maximum range values, it will be
    * clamped to fit inside them. The range emits the
    * [signal@Gtk.Range::value-changed] signal if the value changes.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setValue(value: Double /* Some(Double) */ ): Unit /* None */ =
    gtk_range_set_value(this.raw.asInstanceOf[Ptr[GtkRange]], value)

  /** Emitted before clamping a value, to give the application a chance to
    * adjust the bounds.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal adjust-bounds]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(gdouble), @type -> DataRecord(gdouble)))"
  )
  private def onAdjustBounds = ???

  /** Emitted when a scroll action is performed on a range.
    *
    * It allows an application to determine the type of scroll event that
    * occurred and the resultant new value. The application can handle the event
    * itself and return %TRUE to prevent further processing. Or, by returning
    * %FALSE, it can pass the event to other handlers until the default GTK
    * handler is reached.
    *
    * The value parameter is unrounded. An application that overrides the
    * ::change-value signal is responsible for clamping the value to the desired
    * number of decimal digits; the default GTK handler clamps the value based
    * on [property@Gtk.Range:round-digits].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal change-value]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(gdouble), @type -> DataRecord(gdouble)))"
  )
  private def onChangeValue = ???

  /** Virtual function that moves the slider.
    *
    * Used for keybindings.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onMoveSlider(handler: ((step: ScrollType)) => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, (step: ScrollType), Unit]
    val c_handler = CFuncPtr3.fromScalaFunction {
      (
          self: Ptr[GtkRange],
          step: GtkScrollType /* param */,
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler((step = ScrollType.fromRaw(step)))
    }
    val f = handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"move-slider"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onMoveSlider

  /** Emitted when the range value changes.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onValueChanged(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkRange],
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(EmptyTuple)
    }
    val f = (e: EmptyTuple.type) => handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"value-changed"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onValueChanged
end Range
