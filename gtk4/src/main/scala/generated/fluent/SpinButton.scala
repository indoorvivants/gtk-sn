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

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A `GtkSpinButton` is an ideal way to allow the user to set the value of some
  * attribute.
  *
  * ![An example GtkSpinButton](spinbutton.png)
  *
  * Rather than having to directly type a number into a `GtkEntry`,
  * `GtkSpinButton` allows the user to click on one of two arrows to increment
  * or decrement the displayed value. A value can still be typed in, with the
  * bonus that it can be checked to ensure it is in a given range.
  *
  * The main properties of a `GtkSpinButton` are through an adjustment. See the
  * [class@Gtk.Adjustment] documentation for more details about an adjustment's
  * properties.
  *
  * Note that `GtkSpinButton` will by default make its entry large enough to
  * accommodate the lower and upper bounds of the adjustment. If this is not
  * desired, the automatic sizing can be turned off by explicitly setting
  * [property@Gtk.Editable:width-chars] to a value != -1.
  *
  * ## Using a GtkSpinButton to get an integer
  *
  * ```c
  * // Provides a function to retrieve an integer value from a GtkSpinButton
  * // and creates a spin button to model percentage values.
  *
  * int
  * grab_int_value (GtkSpinButton *button,
  *                 gpointer       user_data)
  * {
  *   return gtk_spin_button_get_value_as_int (button);
  * }
  *
  * void
  * create_integer_spin_button (void)
  * {
  *
  *   GtkWidget *window, *button;
  *   GtkAdjustment *adjustment;
  *
  *   adjustment = gtk_adjustment_new (50.0, 0.0, 100.0, 1.0, 5.0, 0.0);
  *
  *   window = gtk_window_new ();
  *
  *   // creates the spinbutton, with no decimal places
  *   button = gtk_spin_button_new (adjustment, 1.0, 0);
  *   gtk_window_set_child (GTK_WINDOW (window), button);
  *
  *   gtk_window_present (GTK_WINDOW (window));
  * }
  * ```
  *
  * ## Using a GtkSpinButton to get a floating point value
  *
  * ```c
  * // Provides a function to retrieve a floating point value from a
  * // GtkSpinButton, and creates a high precision spin button.
  *
  * float
  * grab_float_value (GtkSpinButton *button,
  *                   gpointer       user_data)
  * {
  *   return gtk_spin_button_get_value (button);
  * }
  *
  * void
  * create_floating_spin_button (void)
  * {
  *   GtkWidget *window, *button;
  *   GtkAdjustment *adjustment;
  *
  *   adjustment = gtk_adjustment_new (2.500, 0.0, 5.0, 0.001, 0.1, 0.0);
  *
  *   window = gtk_window_new ();
  *
  *   // creates the spinbutton, with three decimal places
  *   button = gtk_spin_button_new (adjustment, 0.001, 3);
  *   gtk_window_set_child (GTK_WINDOW (window), button);
  *
  *   gtk_window_present (GTK_WINDOW (window));
  * }
  * ```
  *
  * # CSS nodes
  *
  * ```
  * spinbutton.horizontal
  * ├── text
  * │    ├── undershoot.left
  * │    ╰── undershoot.right
  * ├── button.down
  * ╰── button.up
  * ```
  *
  * ```
  * spinbutton.vertical
  * ├── button.up
  * ├── text
  * │    ├── undershoot.left
  * │    ╰── undershoot.right
  * ╰── button.down
  * ```
  *
  * `GtkSpinButton`s main CSS node has the name spinbutton. It creates subnodes
  * for the entry and the two buttons, with these names. The button nodes have
  * the style classes .up and .down. The `GtkText` subnodes (if present) are put
  * below the text node. The orientation of the spin button is reflected in the
  * .vertical or .horizontal style class on the main node.
  *
  * # Accessibility
  *
  * `GtkSpinButton` uses the %GTK_ACCESSIBLE_ROLE_SPIN_BUTTON role.
  */
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

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Changes the properties of an existing spin button.
    *
    * The adjustment, climb rate, and number of decimal places are updated
    * accordingly.
    */
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

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Get the adjustment associated with a `GtkSpinButton`.
    */
  def getAdjustment(): Adjustment = new Adjustment(
    gtk_spin_button_get_adjustment(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the acceleration rate for repeated changes.
    */
  def getClimbRate(): Double = gtk_spin_button_get_climb_rate(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Fetches the precision of @spin_button.
    */
  def getDigits(): UInt = gtk_spin_button_get_digits(
    this.raw.asInstanceOf
  ).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the current step and page the increments used by @spin_button.
    *
    * See [method@Gtk.SpinButton.set_increments].
    */
  @annotation.compileTimeOnly(
    "Method get_increments contains an OUT parameter, which is not supported yet"
  )
  def getIncrements(using DummyImplicit) = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether non-numeric text can be typed into the spin button.
    */
  def getNumeric(): Boolean =
    gtk_spin_button_get_numeric(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the range allowed for @spin_button.
    *
    * See [method@Gtk.SpinButton.set_range].
    */
  @annotation.compileTimeOnly(
    "Method get_range contains an OUT parameter, which is not supported yet"
  )
  def getRange(using DummyImplicit) = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether the values are corrected to the nearest step.
    */
  def getSnapToTicks(): Boolean =
    gtk_spin_button_get_snap_to_ticks(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the update behavior of a spin button.
    *
    * See [method@Gtk.SpinButton.set_update_policy].
    */
  def getUpdatePolicy(): GtkSpinButtonUpdatePolicy =
    gtk_spin_button_get_update_policy(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Get the value in the @spin_button.
    */
  def getValue(): Double = gtk_spin_button_get_value(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Get the value @spin_button represented as an integer.
    */
  def getValueAsInt(): Int = gtk_spin_button_get_value_as_int(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether the spin button’s value wraps around to the opposite limit
    * when the upper or lower limit of the range is exceeded.
    */
  def getWrap(): Boolean =
    gtk_spin_button_get_wrap(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Replaces the `GtkAdjustment` associated with @spin_button.
    */
  def setAdjustment(adjustment: Adjustment): Unit =
    gtk_spin_button_set_adjustment(
      this.raw.asInstanceOf,
      adjustment.getUnsafeRawPointer().asInstanceOf
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the acceleration rate for repeated changes when you hold down a
    * button or key.
    */
  def setClimbRate(climb_rate: Double): Unit =
    gtk_spin_button_set_climb_rate(this.raw.asInstanceOf, climb_rate)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Set the precision to be displayed by @spin_button.
    *
    * Up to 20 digit precision is allowed.
    */
  def setDigits(digits: UInt): Unit =
    gtk_spin_button_set_digits(this.raw.asInstanceOf, guint(digits))

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the step and page increments for spin_button.
    *
    * This affects how quickly the value changes when the spin button’s arrows
    * are activated.
    */
  def setIncrements(step: Double, page: Double): Unit =
    gtk_spin_button_set_increments(this.raw.asInstanceOf, step, page)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the flag that determines if non-numeric text can be typed into the
    * spin button.
    */
  def setNumeric(numeric: Boolean): Unit = gtk_spin_button_set_numeric(
    this.raw.asInstanceOf,
    gboolean(gint((if numeric == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the minimum and maximum allowable values for @spin_button.
    *
    * If the current value is outside this range, it will be adjusted to fit
    * within the range, otherwise it will remain unchanged.
    */
  def setRange(min: Double, max: Double): Unit =
    gtk_spin_button_set_range(this.raw.asInstanceOf, min, max)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the policy as to whether values are corrected to the nearest step
    * increment when a spin button is activated after providing an invalid
    * value.
    */
  def setSnapToTicks(snap_to_ticks: Boolean): Unit =
    gtk_spin_button_set_snap_to_ticks(
      this.raw.asInstanceOf,
      gboolean(gint((if snap_to_ticks == true then 1 else 0)))
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the update behavior of a spin button.
    *
    * This determines whether the spin button is always updated or only when a
    * valid value is set.
    */
  def setUpdatePolicy(policy: GtkSpinButtonUpdatePolicy): Unit =
    gtk_spin_button_set_update_policy(this.raw.asInstanceOf, policy)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the value of @spin_button.
    */
  def setValue(value: Double): Unit =
    gtk_spin_button_set_value(this.raw.asInstanceOf, value)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the flag that determines if a spin button value wraps around to the
    * opposite limit when the upper or lower limit of the range is exceeded.
    */
  def setWrap(wrap: Boolean): Unit = gtk_spin_button_set_wrap(
    this.raw.asInstanceOf,
    gboolean(gint((if wrap == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Increment or decrement a spin button’s value in a specified direction by a
    * specified amount.
    */
  def spin(direction: GtkSpinType, increment: Double): Unit =
    gtk_spin_button_spin(this.raw.asInstanceOf, direction, increment)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Manually force an update of the spin button.
    */
  def update(): Unit = gtk_spin_button_update(this.raw.asInstanceOf)

end SpinButton

object SpinButton:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkSpinButton`.
    */
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

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkSpinButton` with the given properties.
    *
    * This is a convenience constructor that allows creation of a numeric
    * `GtkSpinButton` without manually creating an adjustment. The value is
    * initially set to the minimum value and a page increment of 10 * @step is
    * the default. The precision of the spin button is equivalent to the
    * precision of @step.
    *
    * Note that the way in which the precision is derived works best if @step is
    * a power of ten. If the resulting precision is not suitable for your needs,
    * use [method@Gtk.SpinButton.set_digits] to correct it.
    */
  def withRange(min: Double, max: Double, step: Double): SpinButton =
    new SpinButton(gtk_spin_button_new_with_range(min, max, step).asInstanceOf)
end SpinButton
