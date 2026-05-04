package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gtk4.fluent.{
  Accessible,
  AccessibleRange,
  Buildable,
  ConstraintTarget,
  LevelBarMode,
  Orientable,
  Widget
}
import sn.gnome.gtk4.internal.GtkLevelBar

/** `GtkLevelBar` is a widget that can be used as a level indicator.
  *
  * Typical use cases are displaying the strength of a password, or showing the
  * charge level of a battery.
  *
  * ![An example GtkLevelBar](levelbar.png)
  *
  * Use [method@Gtk.LevelBar.set_value] to set the current value, and
  * [method@Gtk.LevelBar.add_offset_value] to set the value offsets at which the
  * bar will be considered in a different state. GTK will add a few offsets by
  * default on the level bar: %GTK_LEVEL_BAR_OFFSET_LOW,
  * %GTK_LEVEL_BAR_OFFSET_HIGH and %GTK_LEVEL_BAR_OFFSET_FULL, with values 0.25,
  * 0.75 and 1.0 respectively.
  *
  * Note that it is your responsibility to update preexisting offsets when
  * changing the minimum or maximum value. GTK will simply clamp them to the new
  * range.
  *
  * ## Adding a custom offset on the bar
  *
  * ```c
  * static GtkWidget *
  * create_level_bar (void)
  * {
  *   GtkWidget *widget;
  *   GtkLevelBar *bar;
  *
  *   widget = gtk_level_bar_new ();
  *   bar = GTK_LEVEL_BAR (widget);
  *
  *   // This changes the value of the default low offset
  *
  *   gtk_level_bar_add_offset_value (bar,
  *                                   GTK_LEVEL_BAR_OFFSET_LOW,
  *                                   0.10);
  *
  *   // This adds a new offset to the bar; the application will
  *   // be able to change its color CSS like this:
  *   //
  *   // levelbar block.my-offset {
  *   //   background-color: magenta;
  *   //   border-style: solid;
  *   //   border-color: black;
  *   //   border-width: 1px;
  *   // }
  *
  *   gtk_level_bar_add_offset_value (bar, "my-offset", 0.60);
  *
  *   return widget;
  * }
  * ```
  *
  * The default interval of values is between zero and one, but it’s possible to
  * modify the interval using [method@Gtk.LevelBar.set_min_value] and
  * [method@Gtk.LevelBar.set_max_value]. The value will be always drawn in
  * proportion to the admissible interval, i.e. a value of 15 with a specified
  * interval between 10 and 20 is equivalent to a value of 0.5 with an interval
  * between 0 and 1. When %GTK_LEVEL_BAR_MODE_DISCRETE is used, the bar level is
  * rendered as a finite number of separated blocks instead of a single one. The
  * number of blocks that will be rendered is equal to the number of units
  * specified by the admissible interval.
  *
  * For instance, to build a bar rendered with five blocks, it’s sufficient to
  * set the minimum value to 0 and the maximum value to 5 after changing the
  * indicator mode to discrete.
  *
  * # GtkLevelBar as GtkBuildable
  *
  * The `GtkLevelBar` implementation of the `GtkBuildable` interface supports a
  * custom `<offsets>` element, which can contain any number of `<offset>`
  * elements, each of which must have "name" and "value" attributes.
  *
  * # CSS nodes
  *
  * ```
  * levelbar[.discrete]
  * ╰── trough
  *     ├── block.filled.level-name
  *     ┊
  *     ├── block.empty
  *     ┊
  * ```
  *
  * `GtkLevelBar` has a main CSS node with name levelbar and one of the style
  * classes .discrete or .continuous and a subnode with name trough. Below the
  * trough node are a number of nodes with name block and style class .filled or
  * .empty. In continuous mode, there is exactly one node of each, in discrete
  * mode, the number of filled and unfilled nodes corresponds to blocks that are
  * drawn. The block.filled nodes also get a style class .level-name
  * corresponding to the level for the current value.
  *
  * In horizontal orientation, the nodes are always arranged from left to right,
  * regardless of text direction.
  *
  * # Accessibility
  *
  * `GtkLevelBar` uses the %GTK_ACCESSIBLE_ROLE_METER role.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class LevelBar(raw: Ptr[GtkLevelBar])
    extends Widget(raw.asInstanceOf),
      Accessible,
      AccessibleRange,
      Buildable,
      ConstraintTarget,
      Orientable:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Adds a new offset marker on @self at the position specified by @value.
    *
    * When the bar value is in the interval topped by @value (or between @value
    * and [property@Gtk.LevelBar:max-value] in case the offset is the last one
    * on the bar) a style class named `level-`@name will be applied when
    * rendering the level bar fill.
    *
    * If another offset marker named @name exists, its value will be replaced by @value.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def addOffsetValue(
      name: String | CString /* Some(CString) */,
      value: Double /* Some(Double) */
  )(using Zone): Unit /* None */ = gtk_level_bar_add_offset_value(
    this.raw.asInstanceOf[Ptr[GtkLevelBar]],
    __sn_extract_string(name),
    value
  )

  /** Returns whether the levelbar is inverted.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getInverted(): Boolean /* None */ = gtk_level_bar_get_inverted(
    this.raw.asInstanceOf[Ptr[GtkLevelBar]]
  ).value.!=(0)

  /** Returns the `max-value` of the `GtkLevelBar`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getMaxValue(): Double /* None */ = gtk_level_bar_get_max_value(
    this.raw.asInstanceOf[Ptr[GtkLevelBar]]
  )

  /** Returns the `min-value` of the `GtkLevelBar`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getMinValue(): Double /* None */ = gtk_level_bar_get_min_value(
    this.raw.asInstanceOf[Ptr[GtkLevelBar]]
  )

  /** Returns the `mode` of the `GtkLevelBar`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getMode(): LevelBarMode /* None */ = LevelBarMode.fromRaw(
    gtk_level_bar_get_mode(this.raw.asInstanceOf[Ptr[GtkLevelBar]])
  )

  /** Fetches the value specified for the offset marker @name in @self.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[get_offset_value]: Method get_offset_value contains an OUT parameter, which is not supported yet"
  )
  private def getOffsetValue__ = ???

  /** Returns the `value` of the `GtkLevelBar`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getValue(): Double /* None */ = gtk_level_bar_get_value(
    this.raw.asInstanceOf[Ptr[GtkLevelBar]]
  )

  /** Removes an offset marker from a `GtkLevelBar`.
    *
    * The marker must have been previously added with
    * [method@Gtk.LevelBar.add_offset_value].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def removeOffsetValue(
      name: Option[String | CString /* Some(CString) */ ]
  )(using Zone): Unit /* None */ = gtk_level_bar_remove_offset_value(
    this.raw.asInstanceOf[Ptr[GtkLevelBar]],
    name
      .map[CString](o => __sn_extract_string(o))
      .getOrElse(null.asInstanceOf[CString])
  )

  /** Sets whether the `GtkLevelBar` is inverted.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setInverted(
      inverted: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_level_bar_set_inverted(
    this.raw.asInstanceOf[Ptr[GtkLevelBar]],
    gboolean(gint((if inverted == true then 1 else 0)))
  )

  /** Sets the `max-value` of the `GtkLevelBar`.
    *
    * You probably want to update preexisting level offsets after calling this
    * function.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setMaxValue(value: Double /* Some(Double) */ ): Unit /* None */ =
    gtk_level_bar_set_max_value(this.raw.asInstanceOf[Ptr[GtkLevelBar]], value)

  /** Sets the `min-value` of the `GtkLevelBar`.
    *
    * You probably want to update preexisting level offsets after calling this
    * function.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setMinValue(value: Double /* Some(Double) */ ): Unit /* None */ =
    gtk_level_bar_set_min_value(this.raw.asInstanceOf[Ptr[GtkLevelBar]], value)

  /** Sets the `mode` of the `GtkLevelBar`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setMode(
      mode: LevelBarMode /* Some(GtkLevelBarMode) */
  ): Unit /* None */ =
    gtk_level_bar_set_mode(this.raw.asInstanceOf[Ptr[GtkLevelBar]], mode.raw)

  /** Sets the value of the `GtkLevelBar`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setValue(value: Double /* Some(Double) */ ): Unit /* None */ =
    gtk_level_bar_set_value(this.raw.asInstanceOf[Ptr[GtkLevelBar]], value)

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end LevelBar

object LevelBar:
  /** Creates a new `GtkLevelBar`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(): LevelBar = new LevelBar(gtk_level_bar_new().asInstanceOf)

  /** Creates a new `GtkLevelBar` for the specified interval.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def forInterval(
      min_value: Double /* Some(Double) */,
      max_value: Double /* Some(Double) */
  ): LevelBar = new LevelBar(
    gtk_level_bar_new_for_interval(min_value, max_value).asInstanceOf
  )
end LevelBar
