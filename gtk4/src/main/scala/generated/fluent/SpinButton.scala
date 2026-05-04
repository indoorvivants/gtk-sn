package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.{gboolean, gint, guint}
import sn.gnome.gtk4.fluent.{
  Accessible,
  AccessibleRange,
  Adjustment,
  Buildable,
  CellEditable,
  ConstraintTarget,
  Editable,
  Orientable,
  SpinButtonUpdatePolicy,
  SpinType,
  Widget
}
import sn.gnome.gtk4.internal.GtkSpinButton

/** A `GtkSpinButton` is an ideal way to allow the user to set the value of some
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
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
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

  /** Changes the properties of an existing spin button.
    *
    * The adjustment, climb rate, and number of decimal places are updated
    * accordingly.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def configure(
      adjustment: Option[Adjustment /* Some(Ptr[GtkAdjustment]) */ ],
      climb_rate: Double /* Some(Double) */,
      digits: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): Unit /* None */ = gtk_spin_button_configure(
    this.raw.asInstanceOf[Ptr[GtkSpinButton]],
    adjustment
      .map[Ptr[GtkAdjustment]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkAdjustment]]),
    climb_rate,
    guint(digits)
  )

  /** Get the adjustment associated with a `GtkSpinButton`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getAdjustment(): Adjustment /* None */ = new Adjustment(
    gtk_spin_button_get_adjustment(
      this.raw.asInstanceOf[Ptr[GtkSpinButton]]
    ).asInstanceOf
  )

  /** Returns the acceleration rate for repeated changes.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getClimbRate(): Double /* None */ = gtk_spin_button_get_climb_rate(
    this.raw.asInstanceOf[Ptr[GtkSpinButton]]
  )

  /** Fetches the precision of @spin_button.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDigits(): UInt /* None */ = gtk_spin_button_get_digits(
    this.raw.asInstanceOf[Ptr[GtkSpinButton]]
  ).value

  /** Gets the current step and page the increments used by @spin_button.
    *
    * See [method@Gtk.SpinButton.set_increments].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[get_increments]: Method get_increments contains an OUT parameter, which is not supported yet"
  )
  private def getIncrements__ = ???

  /** Returns whether non-numeric text can be typed into the spin button.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getNumeric(): Boolean /* None */ = gtk_spin_button_get_numeric(
    this.raw.asInstanceOf[Ptr[GtkSpinButton]]
  ).value.!=(0)

  /** Gets the range allowed for @spin_button.
    *
    * See [method@Gtk.SpinButton.set_range].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[get_range]: Method get_range contains an OUT parameter, which is not supported yet"
  )
  private def getRange__ = ???

  /** Returns whether the values are corrected to the nearest step.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSnapToTicks(): Boolean /* None */ = gtk_spin_button_get_snap_to_ticks(
    this.raw.asInstanceOf[Ptr[GtkSpinButton]]
  ).value.!=(0)

  /** Gets the update behavior of a spin button.
    *
    * See [method@Gtk.SpinButton.set_update_policy].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getUpdatePolicy(): SpinButtonUpdatePolicy /* None */ =
    SpinButtonUpdatePolicy.fromRaw(
      gtk_spin_button_get_update_policy(
        this.raw.asInstanceOf[Ptr[GtkSpinButton]]
      )
    )

  /** Get the value in the @spin_button.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getValue(): Double /* None */ = gtk_spin_button_get_value(
    this.raw.asInstanceOf[Ptr[GtkSpinButton]]
  )

  /** Get the value @spin_button represented as an integer.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getValueAsInt(): Int /* None */ = gtk_spin_button_get_value_as_int(
    this.raw.asInstanceOf[Ptr[GtkSpinButton]]
  )

  /** Returns whether the spin button’s value wraps around to the opposite limit
    * when the upper or lower limit of the range is exceeded.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getWrap(): Boolean /* None */ = gtk_spin_button_get_wrap(
    this.raw.asInstanceOf[Ptr[GtkSpinButton]]
  ).value.!=(0)

  /** Replaces the `GtkAdjustment` associated with @spin_button.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setAdjustment(
      adjustment: Adjustment /* Some(Ptr[GtkAdjustment]) */
  ): Unit /* None */ = gtk_spin_button_set_adjustment(
    this.raw.asInstanceOf[Ptr[GtkSpinButton]],
    adjustment.getUnsafeRawPointer().asInstanceOf
  )

  /** Sets the acceleration rate for repeated changes when you hold down a
    * button or key.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setClimbRate(climb_rate: Double /* Some(Double) */ ): Unit /* None */ =
    gtk_spin_button_set_climb_rate(
      this.raw.asInstanceOf[Ptr[GtkSpinButton]],
      climb_rate
    )

  /** Set the precision to be displayed by @spin_button.
    *
    * Up to 20 digit precision is allowed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setDigits(
      digits: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): Unit /* None */ = gtk_spin_button_set_digits(
    this.raw.asInstanceOf[Ptr[GtkSpinButton]],
    guint(digits)
  )

  /** Sets the step and page increments for spin_button.
    *
    * This affects how quickly the value changes when the spin button’s arrows
    * are activated.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setIncrements(
      step: Double /* Some(Double) */,
      page: Double /* Some(Double) */
  ): Unit /* None */ = gtk_spin_button_set_increments(
    this.raw.asInstanceOf[Ptr[GtkSpinButton]],
    step,
    page
  )

  /** Sets the flag that determines if non-numeric text can be typed into the
    * spin button.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setNumeric(
      numeric: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_spin_button_set_numeric(
    this.raw.asInstanceOf[Ptr[GtkSpinButton]],
    gboolean(gint((if numeric == true then 1 else 0)))
  )

  /** Sets the minimum and maximum allowable values for @spin_button.
    *
    * If the current value is outside this range, it will be adjusted to fit
    * within the range, otherwise it will remain unchanged.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setRange(
      min: Double /* Some(Double) */,
      max: Double /* Some(Double) */
  ): Unit /* None */ = gtk_spin_button_set_range(
    this.raw.asInstanceOf[Ptr[GtkSpinButton]],
    min,
    max
  )

  /** Sets the policy as to whether values are corrected to the nearest step
    * increment when a spin button is activated after providing an invalid
    * value.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setSnapToTicks(
      snap_to_ticks: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_spin_button_set_snap_to_ticks(
    this.raw.asInstanceOf[Ptr[GtkSpinButton]],
    gboolean(gint((if snap_to_ticks == true then 1 else 0)))
  )

  /** Sets the update behavior of a spin button.
    *
    * This determines whether the spin button is always updated or only when a
    * valid value is set.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setUpdatePolicy(
      policy: SpinButtonUpdatePolicy /* Some(GtkSpinButtonUpdatePolicy) */
  ): Unit /* None */ = gtk_spin_button_set_update_policy(
    this.raw.asInstanceOf[Ptr[GtkSpinButton]],
    policy.raw
  )

  /** Sets the value of @spin_button.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setValue(value: Double /* Some(Double) */ ): Unit /* None */ =
    gtk_spin_button_set_value(this.raw.asInstanceOf[Ptr[GtkSpinButton]], value)

  /** Sets the flag that determines if a spin button value wraps around to the
    * opposite limit when the upper or lower limit of the range is exceeded.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setWrap(
      wrap: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_spin_button_set_wrap(
    this.raw.asInstanceOf[Ptr[GtkSpinButton]],
    gboolean(gint((if wrap == true then 1 else 0)))
  )

  /** Increment or decrement a spin button’s value in a specified direction by a
    * specified amount.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def spin(
      direction: SpinType /* Some(GtkSpinType) */,
      increment: Double /* Some(Double) */
  ): Unit /* None */ = gtk_spin_button_spin(
    this.raw.asInstanceOf[Ptr[GtkSpinButton]],
    direction.raw,
    increment
  )

  /** Manually force an update of the spin button.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def update(): Unit /* None */ = gtk_spin_button_update(
    this.raw.asInstanceOf[Ptr[GtkSpinButton]]
  )

end SpinButton

object SpinButton:
  /** Creates a new `GtkSpinButton`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      adjustment: Option[Adjustment /* Some(Ptr[GtkAdjustment]) */ ],
      climb_rate: Double /* Some(Double) */,
      digits: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): SpinButton = new SpinButton(
    gtk_spin_button_new(
      adjustment
        .map[Ptr[GtkAdjustment]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkAdjustment]]),
      climb_rate,
      guint(digits)
    ).asInstanceOf
  )

  /** Creates a new `GtkSpinButton` with the given properties.
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def withRange(
      min: Double /* Some(Double) */,
      max: Double /* Some(Double) */,
      step: Double /* Some(Double) */
  ): SpinButton = new SpinButton(
    gtk_spin_button_new_with_range(min, max, step).asInstanceOf
  )
end SpinButton
