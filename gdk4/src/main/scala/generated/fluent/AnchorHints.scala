package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.GdkAnchorHints

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Positioning hints for aligning a surface relative to a rectangle.
  *
  * These hints determine how the surface should be positioned in the case that
  * the surface would fall off-screen if placed in its ideal position.
  *
  * For example, %GDK_ANCHOR_FLIP_X will replace %GDK_GRAVITY_NORTH_WEST with
  * %GDK_GRAVITY_NORTH_EAST and vice versa if the surface extends beyond the
  * left or right edges of the monitor.
  *
  * If %GDK_ANCHOR_SLIDE_X is set, the surface can be shifted horizontally to
  * fit on-screen. If %GDK_ANCHOR_RESIZE_X is set, the surface can be shrunken
  * horizontally to fit.
  *
  * In general, when multiple flags are set, flipping should take precedence
  * over sliding, which should take precedence over resizing.
  */
class AnchorHints private (val raw: GdkAnchorHints):
  def is(kv: AnchorHints): Boolean =
    raw.is(kv.raw)

  override def toString(): String =
    var rem = raw.value
    val sb = List.newBuilder[AnchorHints.KnownValue]
    AnchorHints.KnownValue.values.foreach: kv =>
      if this.is(kv) then sb += kv

      rem = rem & (~kv.raw.value)

    s"AnchorHints(${sb.result().mkString(", ")})"
end AnchorHints

object AnchorHints:
  export KnownValue.*

  def fromRaw(raw: GdkAnchorHints) = new AnchorHints(raw)

  extension (af: AnchorHints)
    def &(other: AnchorHints) =
      AnchorHints(af.raw & other.raw)
    def |(other: AnchorHints) =
      AnchorHints(af.raw | other.raw)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Positioning hints for aligning a surface relative to a rectangle.
    *
    * These hints determine how the surface should be positioned in the case
    * that the surface would fall off-screen if placed in its ideal position.
    *
    * For example, %GDK_ANCHOR_FLIP_X will replace %GDK_GRAVITY_NORTH_WEST with
    * %GDK_GRAVITY_NORTH_EAST and vice versa if the surface extends beyond the
    * left or right edges of the monitor.
    *
    * If %GDK_ANCHOR_SLIDE_X is set, the surface can be shifted horizontally to
    * fit on-screen. If %GDK_ANCHOR_RESIZE_X is set, the surface can be shrunken
    * horizontally to fit.
    *
    * In general, when multiple flags are set, flipping should take precedence
    * over sliding, which should take precedence over resizing.
    */
  enum KnownValue(override val raw: GdkAnchorHints, name: String)
      extends AnchorHints(raw):
    override def toString(): String = this.name

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * allow flipping anchors horizontally
      */
    case FLIP_X extends KnownValue(GdkAnchorHints.GDK_ANCHOR_FLIP_X, "FLIP_X")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * allow flipping anchors vertically
      */
    case FLIP_Y extends KnownValue(GdkAnchorHints.GDK_ANCHOR_FLIP_Y, "FLIP_Y")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * allow sliding surface horizontally
      */
    case SLIDE_X
        extends KnownValue(GdkAnchorHints.GDK_ANCHOR_SLIDE_X, "SLIDE_X")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * allow sliding surface vertically
      */
    case SLIDE_Y
        extends KnownValue(GdkAnchorHints.GDK_ANCHOR_SLIDE_Y, "SLIDE_Y")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * allow resizing surface horizontally
      */
    case RESIZE_X
        extends KnownValue(GdkAnchorHints.GDK_ANCHOR_RESIZE_X, "RESIZE_X")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * allow resizing surface vertically
      */
    case RESIZE_Y
        extends KnownValue(GdkAnchorHints.GDK_ANCHOR_RESIZE_Y, "RESIZE_Y")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * allow flipping anchors on both axes
      */
    case FLIP extends KnownValue(GdkAnchorHints.GDK_ANCHOR_FLIP, "FLIP")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * allow sliding surface on both axes
      */
    case SLIDE extends KnownValue(GdkAnchorHints.GDK_ANCHOR_SLIDE, "SLIDE")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * allow resizing surface on both axes
      */
    case RESIZE extends KnownValue(GdkAnchorHints.GDK_ANCHOR_RESIZE, "RESIZE")
  end KnownValue
end AnchorHints
