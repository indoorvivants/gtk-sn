package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.fluent.{
  Accessible,
  AccessibleRange,
  Adjustment,
  Buildable,
  ConstraintTarget,
  Orientable,
  Orientation,
  PositionType,
  Range
}
import sn.gnome.gtk4.internal.GtkScale
import sn.gnome.pango.fluent.Layout

/** A `GtkScale` is a slider control used to select a numeric value.
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
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class Scale private[gnome] (raw: Ptr[GtkScale])
    extends Range(raw.asInstanceOf),
      Accessible,
      AccessibleRange,
      Buildable,
      ConstraintTarget,
      Orientable:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Adds a mark at @value.
    *
    * A mark is indicated visually by drawing a tick mark next to the scale, and
    * GTK makes it easy for the user to position the scale exactly at the marks
    * value.
    *
    * If @markup is not %NULL, text is shown next to the tick mark.
    *
    * To remove marks from a scale, use [method@Gtk.Scale.clear_marks].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def addMark(
      value: Double /* Some(Double) */,
      position: PositionType /* Some(GtkPositionType) */,
      markup: Option[String /* Some(CString) */ ]
  )(using Zone): Unit /* None */ =
    gtk_scale_add_mark(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkScale]],
      value,
      position.raw,
      markup
        .map[CString](o => toCString(o))
        .getOrElse(null.asInstanceOf[CString])
    )
  end addMark

  /** Removes any marks that have been added.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def clearMarks(): Unit /* None */ =
    gtk_scale_clear_marks(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkScale]]
    )
  end clearMarks

  /** Gets the number of decimal places that are displayed in the value.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDigits(): Int /* None */ =
    gtk_scale_get_digits(this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkScale]])
  end getDigits

  /** Returns whether the current value is displayed as a string next to the
    * slider.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDrawValue(): Boolean /* None */ =
    gtk_scale_get_draw_value(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkScale]]
    ).value.!=(0)
  end getDrawValue

  /** Returns whether the scale has an origin.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getHasOrigin(): Boolean /* None */ =
    gtk_scale_get_has_origin(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkScale]]
    ).value.!=(0)
  end getHasOrigin

  /** Gets the `PangoLayout` used to display the scale.
    *
    * The returned object is owned by the scale so does not need to be freed by
    * the caller.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getLayout()(using Runtime): sn.gnome.pango.fluent.Layout /* None */ =
    sn.gnome.pango.fluent.Layout.applyUnsafe(
      gtk_scale_get_layout(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkScale]]
      ).asInstanceOf
    )
  end getLayout

  /** Obtains the coordinates where the scale will draw the `PangoLayout`
    * representing the text in the scale.
    *
    * Remember when using the `PangoLayout` function you need to convert to and
    * from pixels using `PANGO_PIXELS()` or `PANGO_SCALE`.
    *
    * If the [property@Gtk.Scale:draw-value] property is %FALSE, the return
    * values are undefined.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_layout_offsets]: Method get_layout_offsets contains an OUT parameter, which is not supported yet"
  )
  private def getLayoutOffsets__ = ???

  /** Gets the position in which the current value is displayed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getValuePos(): PositionType /* None */ =
    PositionType.fromRaw(
      gtk_scale_get_value_pos(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkScale]]
      )
    )
  end getValuePos

  /** Sets the number of decimal places that are displayed in the value.
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setDigits(digits: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_scale_set_digits(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkScale]],
      digits
    )
  end setDigits

  /** Specifies whether the current value is displayed as a string next to the
    * slider.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setDrawValue(
      draw_value: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_scale_set_draw_value(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkScale]],
      gboolean(gint((if draw_value == true then 1 else 0)))
    )
  end setDrawValue

  /** @func
    *   allows you to change how the scale value is displayed.
    *
    * The given function will return an allocated string representing
    * @value.
    *   That string will then be used to display the scale's value.
    *
    * If #NULL is passed as @func, the value will be displayed on its own,
    * rounded according to the value of the [property@Gtk.Scale:digits]
    * property.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_format_value_func/<method parameters>/func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(ScaleFormatValueFunc), @type -> DataRecord(GtkScaleFormatValueFunc)))"
  )
  private def setFormatValueFunc__ = ???

  /** Sets whether the scale has an origin.
    *
    * If [property@Gtk.Scale:has-origin] is set to %TRUE (the default), the
    * scale will highlight the part of the trough between the origin (bottom or
    * left side) and the current value.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setHasOrigin(
      has_origin: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_scale_set_has_origin(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkScale]],
      gboolean(gint((if has_origin == true then 1 else 0)))
    )
  end setHasOrigin

  /** Sets the position in which the current value is displayed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setValuePos(
      pos: PositionType /* Some(GtkPositionType) */
  ): Unit /* None */ =
    gtk_scale_set_value_pos(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkScale]],
      pos.raw
    )
  end setValuePos

end Scale

object Scale:
  def applyUnsafe(ptr: Ptr[GtkScale])(using Runtime) = summon[Runtime]
    .getOrCreate[Scale](ptr.asInstanceOf[Ptr[Byte]], p => new Scale(ptr))

  /** Creates a new `GtkScale`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      orientation: Orientation /* Some(GtkOrientation) */,
      adjustment: Option[
        sn.gnome.gtk4.fluent.Adjustment /* Some(Ptr[GtkAdjustment]) */
      ]
  )(using Runtime): Scale =
    val raw: Ptr[Byte] = gtk_scale_new(
      orientation.raw,
      adjustment
        .map[Ptr[GtkAdjustment]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkAdjustment]])
    ).asInstanceOf
    summon[Runtime]
      .getOrCreate[Scale](raw, r => Scale.applyUnsafe(r.asInstanceOf))
  end apply

  /** Creates a new scale widget with a range from @min to @max.
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def withRange(
      orientation: Orientation /* Some(GtkOrientation) */,
      min: Double /* Some(Double) */,
      max: Double /* Some(Double) */,
      step: Double /* Some(Double) */
  )(using Runtime): Scale =
    val raw: Ptr[Byte] =
      gtk_scale_new_with_range(orientation.raw, min, max, step).asInstanceOf
    summon[Runtime]
      .getOrCreate[Scale](raw, r => Scale.applyUnsafe(r.asInstanceOf))
  end withRange
end Scale
