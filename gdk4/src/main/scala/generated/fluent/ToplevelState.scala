package sn.gnome.gdk4

import _root_.sn.gnome.gdk4.internal.GdkToplevelState

/** Specifies the state of a toplevel surface.
  *
  * On platforms that support information about individual edges, the
  * %GDK_TOPLEVEL_STATE_TILED state will be set whenever any of the individual
  * tiled states is set. On platforms that lack that support, the tiled state
  * will give an indication of tiledness without any of the per-edge states
  * being set.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ToplevelState private (val raw: GdkToplevelState):
  def is(kv: ToplevelState): Boolean =
    raw.is(kv.raw)

  override def toString(): String =
    var rem = raw.value
    val sb = List.newBuilder[ToplevelState.KnownValue]
    ToplevelState.KnownValue.values.foreach: kv =>
      if this.is(kv) then sb += kv

      rem = rem & (~kv.raw.value)

    s"ToplevelState(${sb.result().mkString(", ")})"
end ToplevelState

object ToplevelState:
  export KnownValue.*

  def fromRaw(raw: GdkToplevelState) = new ToplevelState(raw)

  extension (af: ToplevelState)
    def &(other: ToplevelState) =
      ToplevelState(af.raw & other.raw)
    def |(other: ToplevelState) =
      ToplevelState(af.raw | other.raw)

  /** Specifies the state of a toplevel surface.
    *
    * On platforms that support information about individual edges, the
    * %GDK_TOPLEVEL_STATE_TILED state will be set whenever any of the individual
    * tiled states is set. On platforms that lack that support, the tiled state
    * will give an indication of tiledness without any of the per-edge states
    * being set.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  enum KnownValue(override val raw: GdkToplevelState, name: String)
      extends ToplevelState(raw):
    override def toString(): String = this.name

    /** the surface is minimized
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case MINIMIZED
        extends KnownValue(
          GdkToplevelState.GDK_TOPLEVEL_STATE_MINIMIZED,
          "MINIMIZED"
        )

    /** the surface is maximized
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case MAXIMIZED
        extends KnownValue(
          GdkToplevelState.GDK_TOPLEVEL_STATE_MAXIMIZED,
          "MAXIMIZED"
        )

    /** the surface is sticky
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case STICKY
        extends KnownValue(GdkToplevelState.GDK_TOPLEVEL_STATE_STICKY, "STICKY")

    /** the surface is maximized without decorations
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case FULLSCREEN
        extends KnownValue(
          GdkToplevelState.GDK_TOPLEVEL_STATE_FULLSCREEN,
          "FULLSCREEN"
        )

    /** the surface is kept above other surfaces
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case ABOVE
        extends KnownValue(GdkToplevelState.GDK_TOPLEVEL_STATE_ABOVE, "ABOVE")

    /** the surface is kept below other surfaces
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case BELOW
        extends KnownValue(GdkToplevelState.GDK_TOPLEVEL_STATE_BELOW, "BELOW")

    /** the surface is presented as focused (with active decorations)
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case FOCUSED
        extends KnownValue(
          GdkToplevelState.GDK_TOPLEVEL_STATE_FOCUSED,
          "FOCUSED"
        )

    /** the surface is in a tiled state
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case TILED
        extends KnownValue(GdkToplevelState.GDK_TOPLEVEL_STATE_TILED, "TILED")

    /** whether the top edge is tiled
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case TOP_TILED
        extends KnownValue(
          GdkToplevelState.GDK_TOPLEVEL_STATE_TOP_TILED,
          "TOP_TILED"
        )

    /** whether the top edge is resizable
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case TOP_RESIZABLE
        extends KnownValue(
          GdkToplevelState.GDK_TOPLEVEL_STATE_TOP_RESIZABLE,
          "TOP_RESIZABLE"
        )

    /** whether the right edge is tiled
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case RIGHT_TILED
        extends KnownValue(
          GdkToplevelState.GDK_TOPLEVEL_STATE_RIGHT_TILED,
          "RIGHT_TILED"
        )

    /** whether the right edge is resizable
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case RIGHT_RESIZABLE
        extends KnownValue(
          GdkToplevelState.GDK_TOPLEVEL_STATE_RIGHT_RESIZABLE,
          "RIGHT_RESIZABLE"
        )

    /** whether the bottom edge is tiled
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case BOTTOM_TILED
        extends KnownValue(
          GdkToplevelState.GDK_TOPLEVEL_STATE_BOTTOM_TILED,
          "BOTTOM_TILED"
        )

    /** whether the bottom edge is resizable
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case BOTTOM_RESIZABLE
        extends KnownValue(
          GdkToplevelState.GDK_TOPLEVEL_STATE_BOTTOM_RESIZABLE,
          "BOTTOM_RESIZABLE"
        )

    /** whether the left edge is tiled
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case LEFT_TILED
        extends KnownValue(
          GdkToplevelState.GDK_TOPLEVEL_STATE_LEFT_TILED,
          "LEFT_TILED"
        )

    /** whether the left edge is resizable
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case LEFT_RESIZABLE
        extends KnownValue(
          GdkToplevelState.GDK_TOPLEVEL_STATE_LEFT_RESIZABLE,
          "LEFT_RESIZABLE"
        )

    /** the surface is not visible to the user
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case SUSPENDED
        extends KnownValue(
          GdkToplevelState.GDK_TOPLEVEL_STATE_SUSPENDED,
          "SUSPENDED"
        )
  end KnownValue
end ToplevelState
