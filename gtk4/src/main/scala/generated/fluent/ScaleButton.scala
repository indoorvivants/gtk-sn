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

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkScaleButton` provides a button which pops up a scale widget.
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
  */
class ScaleButton(raw: Ptr[GtkScaleButton])
    extends Widget(raw.asInstanceOf),
      Accessible,
      AccessibleRange,
      Buildable,
      ConstraintTarget,
      Orientable:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Queries a `GtkScaleButton` and returns its current state.
    *
    * Returns %TRUE if the scale button is pressed in and %FALSE if it is
    * raised.
    */
  def getActive(): Boolean /* None */ =
    gtk_scale_button_get_active(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the `GtkAdjustment` associated with the `GtkScaleButton`’s scale.
    *
    * See [method@Gtk.Range.get_adjustment] for details.
    */
  def getAdjustment(): Adjustment /* None */ = new Adjustment(
    gtk_scale_button_get_adjustment(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the minus button of the `GtkScaleButton`.
    */
  def getMinusButton(): Button /* None */ = new Button(
    gtk_scale_button_get_minus_button(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the plus button of the `GtkScaleButton.`
    */
  def getPlusButton(): Button /* None */ = new Button(
    gtk_scale_button_get_plus_button(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the popup of the `GtkScaleButton`.
    */
  def getPopup(): Widget /* None */ = new Widget(
    gtk_scale_button_get_popup(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the current value of the scale button.
    */
  def getValue(): Double /* None */ = gtk_scale_button_get_value(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the `GtkAdjustment` to be used as a model for the `GtkScaleButton`’s
    * scale.
    *
    * See [method@Gtk.Range.set_adjustment] for details.
    */
  def setAdjustment(
      adjustment: Adjustment /* Some(Ptr[GtkAdjustment]) */
  ): Unit /* None */ = gtk_scale_button_set_adjustment(
    this.raw.asInstanceOf,
    adjustment.getUnsafeRawPointer().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the icons to be used by the scale button.
    */
  def setIcons(icons: Ptr[CString] /* Some(Ptr[CString]) */ )(using
      Zone
  ): Unit /* None */ = gtk_scale_button_set_icons(this.raw.asInstanceOf, icons)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the current value of the scale.
    *
    * If the value is outside the minimum or maximum range values, it will be
    * clamped to fit inside them.
    *
    * The scale button emits the [signal@Gtk.ScaleButton::value-changed] signal
    * if the value changes.
    */
  def setValue(value: Double /* Some(Double) */ ): Unit /* None */ =
    gtk_scale_button_set_value(this.raw.asInstanceOf, value)

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end ScaleButton

object ScaleButton:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a `GtkScaleButton`.
    *
    * The new scale button has a range between @min and @max, with a stepping of @step.
    */
  def apply(
      min: Double /* Some(Double) */,
      max: Double /* Some(Double) */,
      step: Double /* Some(Double) */,
      icons: Option[Ptr[CString] /* Some(Ptr[CString]) */ ]
  )(using Zone): ScaleButton = new ScaleButton(
    gtk_scale_button_new(
      min,
      max,
      step,
      icons.map[Ptr[CString]](o => o).getOrElse(null.asInstanceOf[Ptr[CString]])
    ).asInstanceOf
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end ScaleButton
