package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.{gchar, gpointer}
import sn.gnome.gobject.fluent.InitiallyUnowned
import sn.gnome.gobject.internal.{
  GClosure,
  GClosureNotify,
  GConnectFlags,
  g_signal_connect_data
}
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.internal.GtkAdjustment
import sn.gnome.runtime.*

/** `GtkAdjustment` is a model for a numeric value.
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
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class Adjustment private[gnome] (raw: Ptr[GtkAdjustment])
    extends InitiallyUnowned(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Updates the value property to ensure that the range between @lower and @upper
    * is in the current page.
    *
    * The current page goes from `value` to `value` + `page-size`. If the range
    * is larger than the page size, then only the start of it will be in the
    * current page.
    *
    * A [signal@Gtk.Adjustment::value-changed] signal will be emitted if the
    * value is changed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def clampPage(
      lower: Double /* Some(Double) */,
      upper: Double /* Some(Double) */
  ): Unit /* None */ =
    gtk_adjustment_clamp_page(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAdjustment]],
      lower,
      upper
    )
  end clampPage

  /** Sets all properties of the adjustment at once.
    *
    * Use this function to avoid multiple emissions of the
    * [signal@Gtk.Adjustment::changed] signal. See
    * [method@Gtk.Adjustment.set_lower] for an alternative way of compressing
    * multiple emissions of [signal@Gtk.Adjustment::changed] into one.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def configure(
      value: Double /* Some(Double) */,
      lower: Double /* Some(Double) */,
      upper: Double /* Some(Double) */,
      step_increment: Double /* Some(Double) */,
      page_increment: Double /* Some(Double) */,
      page_size: Double /* Some(Double) */
  ): Unit /* None */ =
    gtk_adjustment_configure(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAdjustment]],
      value,
      lower,
      upper,
      step_increment,
      page_increment,
      page_size
    )
  end configure

  /** Retrieves the minimum value of the adjustment.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getLower(): Double /* None */ =
    gtk_adjustment_get_lower(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAdjustment]]
    )
  end getLower

  /** Gets the smaller of step increment and page increment.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getMinimumIncrement(): Double /* None */ =
    gtk_adjustment_get_minimum_increment(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAdjustment]]
    )
  end getMinimumIncrement

  /** Retrieves the page increment of the adjustment.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPageIncrement(): Double /* None */ =
    gtk_adjustment_get_page_increment(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAdjustment]]
    )
  end getPageIncrement

  /** Retrieves the page size of the adjustment.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPageSize(): Double /* None */ =
    gtk_adjustment_get_page_size(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAdjustment]]
    )
  end getPageSize

  /** Retrieves the step increment of the adjustment.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getStepIncrement(): Double /* None */ =
    gtk_adjustment_get_step_increment(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAdjustment]]
    )
  end getStepIncrement

  /** Retrieves the maximum value of the adjustment.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getUpper(): Double /* None */ =
    gtk_adjustment_get_upper(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAdjustment]]
    )
  end getUpper

  /** Gets the current value of the adjustment.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getValue(): Double /* None */ =
    gtk_adjustment_get_value(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAdjustment]]
    )
  end getValue

  /** Sets the minimum value of the adjustment.
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setLower(lower: Double /* Some(Double) */ ): Unit /* None */ =
    gtk_adjustment_set_lower(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAdjustment]],
      lower
    )
  end setLower

  /** Sets the page increment of the adjustment.
    *
    * See [method@Gtk.Adjustment.set_lower] about how to compress multiple
    * emissions of the [signal@Gtk.Adjustment::changed] signal when setting
    * multiple adjustment properties.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setPageIncrement(
      page_increment: Double /* Some(Double) */
  ): Unit /* None */ =
    gtk_adjustment_set_page_increment(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAdjustment]],
      page_increment
    )
  end setPageIncrement

  /** Sets the page size of the adjustment.
    *
    * See [method@Gtk.Adjustment.set_lower] about how to compress multiple
    * emissions of the [signal@Gtk.Adjustment::changed] signal when setting
    * multiple adjustment properties.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setPageSize(page_size: Double /* Some(Double) */ ): Unit /* None */ =
    gtk_adjustment_set_page_size(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAdjustment]],
      page_size
    )
  end setPageSize

  /** Sets the step increment of the adjustment.
    *
    * See [method@Gtk.Adjustment.set_lower] about how to compress multiple
    * emissions of the [signal@Gtk.Adjustment::changed] signal when setting
    * multiple adjustment properties.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setStepIncrement(
      step_increment: Double /* Some(Double) */
  ): Unit /* None */ =
    gtk_adjustment_set_step_increment(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAdjustment]],
      step_increment
    )
  end setStepIncrement

  /** Sets the maximum value of the adjustment.
    *
    * Note that values will be restricted by `upper - page-size` if the
    * page-size property is nonzero.
    *
    * See [method@Gtk.Adjustment.set_lower] about how to compress multiple
    * emissions of the [signal@Gtk.Adjustment::changed] signal when setting
    * multiple adjustment properties.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setUpper(upper: Double /* Some(Double) */ ): Unit /* None */ =
    gtk_adjustment_set_upper(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAdjustment]],
      upper
    )
  end setUpper

  /** Sets the `GtkAdjustment` value.
    *
    * The value is clamped to lie between [property@Gtk.Adjustment:lower] and
    * [property@Gtk.Adjustment:upper].
    *
    * Note that for adjustments which are used in a `GtkScrollbar`, the
    * effective range of allowed values goes from
    * [property@Gtk.Adjustment:lower] to [property@Gtk.Adjustment:upper] -
    * [property@Gtk.Adjustment:page-size].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setValue(value: Double /* Some(Double) */ ): Unit /* None */ =
    gtk_adjustment_set_value(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkAdjustment]],
      value
    )
  end setValue

  /** Emitted when one or more of the `GtkAdjustment` properties have been
    * changed.
    *
    * Note that the [property@Gtk.Adjustment:value] property is covered by the
    * [signal@Gtk.Adjustment::value-changed] signal.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onChanged(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkAdjustment],
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
    val signal = c"changed"
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
  end onChanged

  /** Emitted when the value has been changed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onValueChanged(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkAdjustment],
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
end Adjustment

object Adjustment:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkAdjustment])(using Runtime) =
    summon[Runtime].getOrCreate[Adjustment](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new Adjustment(ptr)
    )

  /** Creates a new `GtkAdjustment`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      value: Double /* Some(Double) */,
      lower: Double /* Some(Double) */,
      upper: Double /* Some(Double) */,
      step_increment: Double /* Some(Double) */,
      page_increment: Double /* Some(Double) */,
      page_size: Double /* Some(Double) */
  )(using Runtime): Adjustment =
    val raw: Ptr[Byte] = gtk_adjustment_new(
      value,
      lower,
      upper,
      step_increment,
      page_increment,
      page_size
    ).asInstanceOf
    summon[Runtime]
      .getOrCreate[Adjustment](raw, r => Adjustment.applyUnsafe(r.asInstanceOf))
  end apply
end Adjustment
