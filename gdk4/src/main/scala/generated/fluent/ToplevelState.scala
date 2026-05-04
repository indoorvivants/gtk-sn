package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.GdkToplevelState

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Specifies the state of a toplevel surface.
  *
  * On platforms that support information about individual edges, the
  * %GDK_TOPLEVEL_STATE_TILED state will be set whenever any of the individual
  * tiled states is set. On platforms that lack that support, the tiled state
  * will give an indication of tiledness without any of the per-edge states
  * being set.
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

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Specifies the state of a toplevel surface.
    *
    * On platforms that support information about individual edges, the
    * %GDK_TOPLEVEL_STATE_TILED state will be set whenever any of the individual
    * tiled states is set. On platforms that lack that support, the tiled state
    * will give an indication of tiledness without any of the per-edge states
    * being set.
    */
  enum KnownValue(override val raw: GdkToplevelState, name: String)
      extends ToplevelState(raw):
    override def toString(): String = this.name

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * the surface is minimized
      */
    case MINIMIZED
        extends KnownValue(
          GdkToplevelState.GDK_TOPLEVEL_STATE_MINIMIZED,
          "MINIMIZED"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * the surface is maximized
      */
    case MAXIMIZED
        extends KnownValue(
          GdkToplevelState.GDK_TOPLEVEL_STATE_MAXIMIZED,
          "MAXIMIZED"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * the surface is sticky
      */
    case STICKY
        extends KnownValue(GdkToplevelState.GDK_TOPLEVEL_STATE_STICKY, "STICKY")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * the surface is maximized without decorations
      */
    case FULLSCREEN
        extends KnownValue(
          GdkToplevelState.GDK_TOPLEVEL_STATE_FULLSCREEN,
          "FULLSCREEN"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * the surface is kept above other surfaces
      */
    case ABOVE
        extends KnownValue(GdkToplevelState.GDK_TOPLEVEL_STATE_ABOVE, "ABOVE")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * the surface is kept below other surfaces
      */
    case BELOW
        extends KnownValue(GdkToplevelState.GDK_TOPLEVEL_STATE_BELOW, "BELOW")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * the surface is presented as focused (with active decorations)
      */
    case FOCUSED
        extends KnownValue(
          GdkToplevelState.GDK_TOPLEVEL_STATE_FOCUSED,
          "FOCUSED"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * the surface is in a tiled state
      */
    case TILED
        extends KnownValue(GdkToplevelState.GDK_TOPLEVEL_STATE_TILED, "TILED")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * whether the top edge is tiled
      */
    case TOP_TILED
        extends KnownValue(
          GdkToplevelState.GDK_TOPLEVEL_STATE_TOP_TILED,
          "TOP_TILED"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * whether the top edge is resizable
      */
    case TOP_RESIZABLE
        extends KnownValue(
          GdkToplevelState.GDK_TOPLEVEL_STATE_TOP_RESIZABLE,
          "TOP_RESIZABLE"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * whether the right edge is tiled
      */
    case RIGHT_TILED
        extends KnownValue(
          GdkToplevelState.GDK_TOPLEVEL_STATE_RIGHT_TILED,
          "RIGHT_TILED"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * whether the right edge is resizable
      */
    case RIGHT_RESIZABLE
        extends KnownValue(
          GdkToplevelState.GDK_TOPLEVEL_STATE_RIGHT_RESIZABLE,
          "RIGHT_RESIZABLE"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * whether the bottom edge is tiled
      */
    case BOTTOM_TILED
        extends KnownValue(
          GdkToplevelState.GDK_TOPLEVEL_STATE_BOTTOM_TILED,
          "BOTTOM_TILED"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * whether the bottom edge is resizable
      */
    case BOTTOM_RESIZABLE
        extends KnownValue(
          GdkToplevelState.GDK_TOPLEVEL_STATE_BOTTOM_RESIZABLE,
          "BOTTOM_RESIZABLE"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * whether the left edge is tiled
      */
    case LEFT_TILED
        extends KnownValue(
          GdkToplevelState.GDK_TOPLEVEL_STATE_LEFT_TILED,
          "LEFT_TILED"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * whether the left edge is resizable
      */
    case LEFT_RESIZABLE
        extends KnownValue(
          GdkToplevelState.GDK_TOPLEVEL_STATE_LEFT_RESIZABLE,
          "LEFT_RESIZABLE"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * the surface is not visible to the user
      */
    case SUSPENDED
        extends KnownValue(
          GdkToplevelState.GDK_TOPLEVEL_STATE_SUSPENDED,
          "SUSPENDED"
        )
  end KnownValue
end ToplevelState
