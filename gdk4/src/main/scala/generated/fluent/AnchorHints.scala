package sn.gnome.gdk4

import _root_.sn.gnome.gdk4.internal.GdkAnchorHints

/** Positioning hints for aligning a surface relative to a rectangle.
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
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class AnchorHints private (val raw: GdkAnchorHints):
  def is(kv: AnchorHints): Boolean =
    raw.is(kv.raw)

  override def toString(): scala.Predef.String =
    var rem = raw.value
    val sb = scala.List.newBuilder[AnchorHints.KnownValue]
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

  /** Positioning hints for aligning a surface relative to a rectangle.
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  enum KnownValue(override val raw: GdkAnchorHints, name: scala.Predef.String)
      extends AnchorHints(raw):
    override def toString(): scala.Predef.String = this.name

    /** allow flipping anchors horizontally
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case FLIP_X extends KnownValue(GdkAnchorHints.GDK_ANCHOR_FLIP_X, "FLIP_X")

    /** allow flipping anchors vertically
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case FLIP_Y extends KnownValue(GdkAnchorHints.GDK_ANCHOR_FLIP_Y, "FLIP_Y")

    /** allow sliding surface horizontally
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case SLIDE_X
        extends KnownValue(GdkAnchorHints.GDK_ANCHOR_SLIDE_X, "SLIDE_X")

    /** allow sliding surface vertically
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case SLIDE_Y
        extends KnownValue(GdkAnchorHints.GDK_ANCHOR_SLIDE_Y, "SLIDE_Y")

    /** allow resizing surface horizontally
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case RESIZE_X
        extends KnownValue(GdkAnchorHints.GDK_ANCHOR_RESIZE_X, "RESIZE_X")

    /** allow resizing surface vertically
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case RESIZE_Y
        extends KnownValue(GdkAnchorHints.GDK_ANCHOR_RESIZE_Y, "RESIZE_Y")

    /** allow flipping anchors on both axes
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case FLIP extends KnownValue(GdkAnchorHints.GDK_ANCHOR_FLIP, "FLIP")

    /** allow sliding surface on both axes
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case SLIDE extends KnownValue(GdkAnchorHints.GDK_ANCHOR_SLIDE, "SLIDE")

    /** allow resizing surface on both axes
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case RESIZE extends KnownValue(GdkAnchorHints.GDK_ANCHOR_RESIZE, "RESIZE")
  end KnownValue
end AnchorHints
