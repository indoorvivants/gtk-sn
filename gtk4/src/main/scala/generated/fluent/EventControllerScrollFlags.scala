package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkEventControllerScrollFlags

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Describes the behavior of a `GtkEventControllerScroll`.
  */
class EventControllerScrollFlags private (
    val raw: GtkEventControllerScrollFlags
):
  def is(kv: EventControllerScrollFlags): Boolean =
    raw.is(kv.raw)

  override def toString(): String =
    var rem = raw.value
    val sb = List.newBuilder[EventControllerScrollFlags.KnownValue]
    EventControllerScrollFlags.KnownValue.values.foreach: kv =>
      if this.is(kv) then sb += kv

      rem = rem & (~kv.raw.value)

    s"EventControllerScrollFlags(${sb.result().mkString(", ")})"
end EventControllerScrollFlags

object EventControllerScrollFlags:
  export KnownValue.*

  def fromRaw(raw: GtkEventControllerScrollFlags) =
    new EventControllerScrollFlags(raw)

  extension (af: EventControllerScrollFlags)
    def &(other: EventControllerScrollFlags) =
      EventControllerScrollFlags(af.raw & other.raw)
    def |(other: EventControllerScrollFlags) =
      EventControllerScrollFlags(af.raw | other.raw)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Describes the behavior of a `GtkEventControllerScroll`.
    */
  enum KnownValue(override val raw: GtkEventControllerScrollFlags, name: String)
      extends EventControllerScrollFlags(raw):
    override def toString(): String = this.name

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Don't emit scroll.
      */
    case NONE
        extends KnownValue(
          GtkEventControllerScrollFlags.GTK_EVENT_CONTROLLER_SCROLL_NONE,
          "NONE"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Emit scroll with vertical deltas.
      */
    case VERTICAL
        extends KnownValue(
          GtkEventControllerScrollFlags.GTK_EVENT_CONTROLLER_SCROLL_VERTICAL,
          "VERTICAL"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Emit scroll with horizontal deltas.
      */
    case HORIZONTAL
        extends KnownValue(
          GtkEventControllerScrollFlags.GTK_EVENT_CONTROLLER_SCROLL_HORIZONTAL,
          "HORIZONTAL"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Only emit deltas that are multiples of 1.
      */
    case DISCRETE
        extends KnownValue(
          GtkEventControllerScrollFlags.GTK_EVENT_CONTROLLER_SCROLL_DISCRETE,
          "DISCRETE"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Emit ::decelerate after continuous scroll finishes.
      */
    case KINETIC
        extends KnownValue(
          GtkEventControllerScrollFlags.GTK_EVENT_CONTROLLER_SCROLL_KINETIC,
          "KINETIC"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Emit scroll on both axes.
      */
    case BOTH_AXES
        extends KnownValue(
          GtkEventControllerScrollFlags.GTK_EVENT_CONTROLLER_SCROLL_BOTH_AXES,
          "BOTH_AXES"
        )
  end KnownValue
end EventControllerScrollFlags
