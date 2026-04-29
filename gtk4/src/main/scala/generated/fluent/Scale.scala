package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.GDestroyNotify
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.gpointer
import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.AccessibleRange
import sn.gnome.gtk4.fluent.Adjustment
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.Orientable
import sn.gnome.gtk4.fluent.Range
import sn.gnome.gtk4.internal.GtkOrientation
import sn.gnome.gtk4.internal.GtkPositionType
import sn.gnome.gtk4.internal.GtkScale
import sn.gnome.gtk4.internal.GtkScaleFormatValueFunc
import sn.gnome.pango.fluent.Layout

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A `GtkScale` is a slider control used to select a numeric value.
  *
  * ![An example GtkScale](scales.png)
  *
  * To use it, you’ll probably want to investigate the methods on its base
  * class, [class@Gtk.Range], in addition to the methods for `GtkScale` itself.
  * To set the value of a scale, you would normally use
  * [method@Gtk.Range.set_value]. To detect changes to the value, you would
  * normally use the [signal@Gtk.Range::value-changed] signal.
  *
  * Note that using the same upper and lower bounds for the `GtkScale` (through
  * the `GtkRange` methods) will hide the slider itself. This is useful for
  * applications that want to show an undeterminate value on the scale, without
  * changing the layout of the application (such as movie or music players).
  *
  * # GtkScale as GtkBuildable
  *
  * `GtkScale` supports a custom `<marks>` element, which can contain multiple
  * `<mark\>` elements. The “value” and “position” attributes have the same
  * meaning as [method@Gtk.Scale.add_mark] parameters of the same name. If the
  * element is not empty, its content is taken as the markup to show at the
  * mark. It can be translated with the usual ”translatable” and “context”
  * attributes.
  *
  * # CSS nodes
  *
  * ```
  * scale[.fine-tune][.marks-before][.marks-after]
  * ├── [value][.top][.right][.bottom][.left]
  * ├── marks.top
  * │   ├── mark
  * │   ┊    ├── [label]
  * │   ┊    ╰── indicator
  * ┊   ┊
  * │   ╰── mark
  * ├── marks.bottom
  * │   ├── mark
  * │   ┊    ├── indicator
  * │   ┊    ╰── [label]
  * ┊   ┊
  * │   ╰── mark
  * ╰── trough
  *     ├── [fill]
  *     ├── [highlight]
  *     ╰── slider
  * ```
  *
  * `GtkScale` has a main CSS node with name scale and a subnode for its
  * contents, with subnodes named trough and slider.
  *
  * The main node gets the style class .fine-tune added when the scale is in
  * 'fine-tuning' mode.
  *
  * If the scale has an origin (see [method@Gtk.Scale.set_has_origin]), there is
  * a subnode with name highlight below the trough node that is used for
  * rendering the highlighted part of the trough.
  *
  * If the scale is showing a fill level (see
  * [method@Gtk.Range.set_show_fill_level]), there is a subnode with name fill
  * below the trough node that is used for rendering the filled in part of the
  * trough.
  *
  * If marks are present, there is a marks subnode before or after the trough
  * node, below which each mark gets a node with name mark. The marks nodes get
  * either the .top or .bottom style class.
  *
  * The mark node has a subnode named indicator. If the mark has text, it also
  * has a subnode named label. When the mark is either above or left of the
  * scale, the label subnode is the first when present. Otherwise, the indicator
  * subnode is the first.
  *
  * The main CSS node gets the 'marks-before' and/or 'marks-after' style classes
  * added depending on what marks are present.
  *
  * If the scale is displaying the value (see [property@Gtk.Scale:draw-value]),
  * there is subnode with name value. This node will get the .top or .bottom
  * style classes similar to the marks node.
  *
  * # Accessibility
  *
  * `GtkScale` uses the %GTK_ACCESSIBLE_ROLE_SLIDER role.
  */
class Scale(raw: Ptr[GtkScale])
    extends Range(raw.asInstanceOf),
      Accessible,
      AccessibleRange,
      Buildable,
      ConstraintTarget,
      Orientable:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Adds a mark at @value.
    *
    * A mark is indicated visually by drawing a tick mark next to the scale, and
    * GTK makes it easy for the user to position the scale exactly at the marks
    * value.
    *
    * If @markup is not %NULL, text is shown next to the tick mark.
    *
    * To remove marks from a scale, use [method@Gtk.Scale.clear_marks].
    */
  def addMark(
      value: Double,
      position: GtkPositionType,
      markup: String | CString
  )(using Zone): Unit = gtk_scale_add_mark(
    this.raw.asInstanceOf,
    value,
    position,
    __sn_extract_string(markup)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Removes any marks that have been added.
    */
  def clearMarks(): Unit = gtk_scale_clear_marks(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the number of decimal places that are displayed in the value.
    */
  def getDigits(): Int = gtk_scale_get_digits(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether the current value is displayed as a string next to the
    * slider.
    */
  def getDrawValue(): Boolean =
    gtk_scale_get_draw_value(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether the scale has an origin.
    */
  def getHasOrigin(): Boolean =
    gtk_scale_get_has_origin(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the `PangoLayout` used to display the scale.
    *
    * The returned object is owned by the scale so does not need to be freed by
    * the caller.
    */
  def getLayout(): Layout = new Layout(
    gtk_scale_get_layout(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Obtains the coordinates where the scale will draw the `PangoLayout`
    * representing the text in the scale.
    *
    * Remember when using the `PangoLayout` function you need to convert to and
    * from pixels using `PANGO_PIXELS()` or `PANGO_SCALE`.
    *
    * If the [property@Gtk.Scale:draw-value] property is %FALSE, the return
    * values are undefined.
    */
  @annotation.compileTimeOnly(
    "Method get_layout_offsets contains an OUT parameter, which is not supported yet"
  )
  def getLayoutOffsets(using DummyImplicit) = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the position in which the current value is displayed.
    */
  def getValuePos(): GtkPositionType = gtk_scale_get_value_pos(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the number of decimal places that are displayed in the value.
    *
    * Also causes the value of the adjustment to be rounded to this number of
    * digits, so the retrieved value matches the displayed one, if
    * [property@Gtk.Scale:draw-value] is %TRUE when the value changes. If you
    * want to enforce rounding the value when [property@Gtk.Scale:draw-value] is
    * %FALSE, you can set [property@Gtk.Range:round-digits] instead.
    *
    * Note that rounding to a small number of digits can interfere with the
    * smooth autoscrolling that is built into `GtkScale`. As an alternative, you
    * can use [method@Gtk.Scale.set_format_value_func] to format the displayed
    * value yourself.
    */
  def setDigits(digits: Int): Unit =
    gtk_scale_set_digits(this.raw.asInstanceOf, digits)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Specifies whether the current value is displayed as a string next to the
    * slider.
    */
  def setDrawValue(draw_value: Boolean): Unit = gtk_scale_set_draw_value(
    this.raw.asInstanceOf,
    gboolean(gint((if draw_value == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * @func
    *   allows you to change how the scale value is displayed.
    *
    * The given function will return an allocated string representing
    * @value.
    *   That string will then be used to display the scale's value.
    *
    * If #NULL is passed as @func, the value will be displayed on its own,
    * rounded according to the value of the [property@Gtk.Scale:digits]
    * property.
    */
  def setFormatValueFunc(
      func: GtkScaleFormatValueFunc,
      user_data: Ptr[Byte],
      destroy_notify: GDestroyNotify
  ): Unit = gtk_scale_set_format_value_func(
    this.raw.asInstanceOf,
    func,
    gpointer(user_data),
    destroy_notify
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether the scale has an origin.
    *
    * If [property@Gtk.Scale:has-origin] is set to %TRUE (the default), the
    * scale will highlight the part of the trough between the origin (bottom or
    * left side) and the current value.
    */
  def setHasOrigin(has_origin: Boolean): Unit = gtk_scale_set_has_origin(
    this.raw.asInstanceOf,
    gboolean(gint((if has_origin == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the position in which the current value is displayed.
    */
  def setValuePos(pos: GtkPositionType): Unit =
    gtk_scale_set_value_pos(this.raw.asInstanceOf, pos)

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end Scale

object Scale:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkScale`.
    */
  def apply(orientation: GtkOrientation, adjustment: Adjustment): Scale =
    new Scale(
      gtk_scale_new(
        orientation,
        adjustment.getUnsafeRawPointer().asInstanceOf
      ).asInstanceOf
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new scale widget with a range from @min to @max.
    *
    * The returns scale will have the given orientation and will let the user
    * input a number between @min and @max (including @min and @max) with the
    * increment @step. @step must be nonzero; it’s the distance the slider moves
    * when using the arrow keys to adjust the scale value.
    *
    * Note that the way in which the precision is derived works best if
    * @step
    *   is a power of ten. If the resulting precision is not suitable for your
    *   needs, use [method@Gtk.Scale.set_digits] to correct it.
    */
  def withRange(
      orientation: GtkOrientation,
      min: Double,
      max: Double,
      step: Double
  ): Scale = new Scale(
    gtk_scale_new_with_range(orientation, min, max, step).asInstanceOf
  )
end Scale
