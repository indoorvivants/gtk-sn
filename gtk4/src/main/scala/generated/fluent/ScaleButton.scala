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
  Button,
  ConstraintTarget,
  Orientable,
  Widget
}
import sn.gnome.gtk4.internal.GtkScaleButton

/** `GtkScaleButton` provides a button which pops up a scale widget.
  *
  * This kind of widget is commonly used for volume controls in multimedia
  * applications, and GTK provides a [class@Gtk.VolumeButton] subclass that is
  * tailored for this use case.
  *
  * # CSS nodes
  *
  * ```
  * scalebutton.scale
  * ╰── button.toggle
  *     ╰── <icon>
  * ```
  *
  * `GtkScaleButton` has a single CSS node with name scalebutton and `.scale`
  * style class, and contains a `button` node with a `.toggle` style class.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ScaleButton(raw: Ptr[GtkScaleButton])
    extends Widget(raw.asInstanceOf),
      Accessible,
      AccessibleRange,
      Buildable,
      ConstraintTarget,
      Orientable:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Queries a `GtkScaleButton` and returns its current state.
    *
    * Returns %TRUE if the scale button is pressed in and %FALSE if it is
    * raised.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getActive(): Boolean /* None */ = gtk_scale_button_get_active(
    this.raw.asInstanceOf[Ptr[GtkScaleButton]]
  ).value.!=(0)

  /** Gets the `GtkAdjustment` associated with the `GtkScaleButton`’s scale.
    *
    * See [method@Gtk.Range.get_adjustment] for details.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getAdjustment(): Adjustment /* None */ = new Adjustment(
    gtk_scale_button_get_adjustment(
      this.raw.asInstanceOf[Ptr[GtkScaleButton]]
    ).asInstanceOf
  )

  /** Retrieves the minus button of the `GtkScaleButton`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getMinusButton(): Button /* None */ = new Button(
    gtk_scale_button_get_minus_button(
      this.raw.asInstanceOf[Ptr[GtkScaleButton]]
    ).asInstanceOf
  )

  /** Retrieves the plus button of the `GtkScaleButton.`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPlusButton(): Button /* None */ = new Button(
    gtk_scale_button_get_plus_button(
      this.raw.asInstanceOf[Ptr[GtkScaleButton]]
    ).asInstanceOf
  )

  /** Retrieves the popup of the `GtkScaleButton`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPopup(): Widget /* None */ = new Widget(
    gtk_scale_button_get_popup(
      this.raw.asInstanceOf[Ptr[GtkScaleButton]]
    ).asInstanceOf
  )

  /** Gets the current value of the scale button.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getValue(): Double /* None */ = gtk_scale_button_get_value(
    this.raw.asInstanceOf[Ptr[GtkScaleButton]]
  )

  /** Sets the `GtkAdjustment` to be used as a model for the `GtkScaleButton`’s
    * scale.
    *
    * See [method@Gtk.Range.set_adjustment] for details.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setAdjustment(
      adjustment: Adjustment /* Some(Ptr[GtkAdjustment]) */
  ): Unit /* None */ = gtk_scale_button_set_adjustment(
    this.raw.asInstanceOf[Ptr[GtkScaleButton]],
    adjustment.getUnsafeRawPointer().asInstanceOf
  )

  /** Sets the icons to be used by the scale button.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_icons/<method parameters>/icons]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(utf8), @type -> DataRecord(char*)))),ListMap(@type -> DataRecord(const char**)))"
  )
  private def setIcons__ = ???

  /** Sets the current value of the scale.
    *
    * If the value is outside the minimum or maximum range values, it will be
    * clamped to fit inside them.
    *
    * The scale button emits the [signal@Gtk.ScaleButton::value-changed] signal
    * if the value changes.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setValue(value: Double /* Some(Double) */ ): Unit /* None */ =
    gtk_scale_button_set_value(
      this.raw.asInstanceOf[Ptr[GtkScaleButton]],
      value
    )

  /** Emitted to dismiss the popup.
    *
    * This is a [keybinding signal](class.SignalAction.html).
    *
    * The default binding for this signal is <kbd>Escape</kbd>.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onPopdown(f: EmptyTuple.type => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkScaleButton],
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(EmptyTuple)
    }
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"popdown"
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
  end onPopdown

  /** Emitted to popup the scale widget.
    *
    * This is a [keybinding signal](class.SignalAction.html).
    *
    * The default bindings for this signal are <kbd>Space</kbd>,
    * <kbd>Enter</kbd> and <kbd>Return</kbd>.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onPopup(f: EmptyTuple.type => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkScaleButton],
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(EmptyTuple)
    }
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"popup"
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
  end onPopup

  /** Emitted when the value field has changed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal value-changed]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(gdouble), @type -> DataRecord(gdouble)))"
  )
  private def onValueChanged = ???

end ScaleButton

object ScaleButton:
  /** Creates a `GtkScaleButton`.
    *
    * The new scale button has a range between @min and @max, with a stepping of @step.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[icons]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(utf8), @type -> DataRecord(char*)))),ListMap(@type -> DataRecord(const char**)))"
  )
  private def `new`() = ???

end ScaleButton
