package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.GtkAlign

/** Controls how a widget deals with extra space in a single dimension.
  *
  * Alignment only matters if the widget receives a “too large” allocation, for
  * example if you packed the widget with the [property@Gtk.Widget:hexpand]
  * property inside a [class@Box], then the widget might get extra space. If you
  * have for example a 16x16 icon inside a 32x32 space, the icon could be scaled
  * and stretched, it could be centered, or it could be positioned to one side
  * of the space.
  *
  * Note that in horizontal context `GTK_ALIGN_START` and `GTK_ALIGN_END` are
  * interpreted relative to text direction.
  *
  * Baseline support is optional for containers and widgets, and is only
  * available for vertical alignment.
  * `GTK_ALIGN_BASELINE_CENTER and `GTK_ALIGN_BASELINE_FILL` are treated similar
  * to `GTK_ALIGN_CENTER` and `GTK_ALIGN_FILL`, except that it positions the
  * widget to line up the baselines, where that is supported.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum Align(val raw: GtkAlign):
  /** stretch to fill all space if possible, center if no meaningful way to
    * stretch
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case FILL extends Align(GtkAlign.GTK_ALIGN_FILL)

  /** snap to left or top side, leaving space on right or bottom
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case START extends Align(GtkAlign.GTK_ALIGN_START)

  /** snap to right or bottom side, leaving space on left or top
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case END extends Align(GtkAlign.GTK_ALIGN_END)

  /** center natural width of widget inside the allocation
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CENTER extends Align(GtkAlign.GTK_ALIGN_CENTER)

  /** a different name for `GTK_ALIGN_BASELINE`. Since 4.12
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case BASELINE_FILL extends Align(GtkAlign.GTK_ALIGN_BASELINE_FILL)

  /** align the widget according to the baseline. See [class@Gtk.Widget].
    * Deprecated: 4.12: Use `GTK_ALIGN_BASELINE_FILL` instead
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case BASELINE extends Align(GtkAlign.GTK_ALIGN_BASELINE)

  /** stretch to fill all space, but align the baseline. Since 4.12
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case BASELINE_CENTER extends Align(GtkAlign.GTK_ALIGN_BASELINE_CENTER)
end Align

object Align:
  def fromRaw(raw: GtkAlign): Align =
    raw match
      case GtkAlign.GTK_ALIGN_FILL            => Align.FILL
      case GtkAlign.GTK_ALIGN_START           => Align.START
      case GtkAlign.GTK_ALIGN_END             => Align.END
      case GtkAlign.GTK_ALIGN_CENTER          => Align.CENTER
      case GtkAlign.GTK_ALIGN_BASELINE_FILL   => Align.BASELINE_FILL
      case GtkAlign.GTK_ALIGN_BASELINE        => Align.BASELINE
      case GtkAlign.GTK_ALIGN_BASELINE_CENTER => Align.BASELINE_CENTER
  end fromRaw
end Align
