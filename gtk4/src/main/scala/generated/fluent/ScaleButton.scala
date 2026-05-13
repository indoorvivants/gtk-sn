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
import sn.gnome.runtime.*

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
class ScaleButton private[gnome] (raw: Ptr[GtkScaleButton])
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
  def getActive(): Boolean /* None */ =
    gtk_scale_button_get_active(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkScaleButton]]
    ).value.!=(0)
  end getActive

  /** Gets the `GtkAdjustment` associated with the `GtkScaleButton`’s scale.
    *
    * See [method@Gtk.Range.get_adjustment] for details.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getAdjustment()(using
      Runtime
  ): sn.gnome.gtk4.fluent.Adjustment /* None */ =
    sn.gnome.gtk4.fluent.Adjustment.applyUnsafe(
      gtk_scale_button_get_adjustment(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkScaleButton]]
      ).asInstanceOf
    )
  end getAdjustment

  /** Retrieves the minus button of the `GtkScaleButton`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getMinusButton()(using Runtime): sn.gnome.gtk4.fluent.Button /* None */ =
    sn.gnome.gtk4.fluent.Button.applyUnsafe(
      gtk_scale_button_get_minus_button(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkScaleButton]]
      ).asInstanceOf
    )
  end getMinusButton

  /** Retrieves the plus button of the `GtkScaleButton.`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPlusButton()(using Runtime): sn.gnome.gtk4.fluent.Button /* None */ =
    sn.gnome.gtk4.fluent.Button.applyUnsafe(
      gtk_scale_button_get_plus_button(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkScaleButton]]
      ).asInstanceOf
    )
  end getPlusButton

  /** Retrieves the popup of the `GtkScaleButton`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPopup()(using Runtime): sn.gnome.gtk4.fluent.Widget /* None */ =
    sn.gnome.gtk4.fluent.Widget.applyUnsafe(
      gtk_scale_button_get_popup(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkScaleButton]]
      ).asInstanceOf
    )
  end getPopup

  /** Gets the current value of the scale button.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getValue(): Double /* None */ =
    gtk_scale_button_get_value(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkScaleButton]]
    )
  end getValue

  /** Sets the `GtkAdjustment` to be used as a model for the `GtkScaleButton`’s
    * scale.
    *
    * See [method@Gtk.Range.set_adjustment] for details.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setAdjustment(
      adjustment: sn.gnome.gtk4.fluent.Adjustment /* Some(Ptr[GtkAdjustment]) */
  )(using Runtime): Unit /* None */ =
    gtk_scale_button_set_adjustment(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkScaleButton]],
      adjustment.getUnsafeRawPointer().asInstanceOf
    )
  end setAdjustment

  /** Sets the icons to be used by the scale button.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setIcons(
      icons: Array[String] /* Some(Ptr[CString]) */
  )(using Zone): Unit /* None */ =
    gtk_scale_button_set_icons(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkScaleButton]],
      MemoryWrite.nullTerminatedStringArray(icons)
    )
  end setIcons

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
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkScaleButton]],
      value
    )
  end setValue

  /** Emitted to dismiss the popup.
    *
    * This is a [keybinding signal](class.SignalAction.html).
    *
    * The default binding for this signal is <kbd>Escape</kbd>.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onPopdown(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkScaleButton],
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
  def onPopup(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkScaleButton],
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
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkScaleButton])(using Runtime) =
    summon[Runtime].getOrCreate[ScaleButton](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new ScaleButton(ptr)
    )

  /** Creates a `GtkScaleButton`.
    *
    * The new scale button has a range between @min and @max, with a stepping of @step.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      min: Double /* Some(Double) */,
      max: Double /* Some(Double) */,
      step: Double /* Some(Double) */,
      icons: Option[Array[String] /* Some(Ptr[CString]) */ ]
  )(using Zone, Runtime): ScaleButton =
    val raw: Ptr[Byte] = gtk_scale_button_new(
      min,
      max,
      step,
      icons
        .map[Ptr[CString]](o => MemoryWrite.nullTerminatedStringArray(o))
        .getOrElse(null.asInstanceOf[Ptr[CString]])
    ).asInstanceOf
    summon[Runtime].getOrCreate[ScaleButton](
      raw,
      r => ScaleButton.applyUnsafe(r.asInstanceOf)
    )
  end apply
end ScaleButton
