package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkEventControllerScrollFlags

/** Describes the behavior of a `GtkEventControllerScroll`.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
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

  /** Describes the behavior of a `GtkEventControllerScroll`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  enum KnownValue(override val raw: GtkEventControllerScrollFlags, name: String)
      extends EventControllerScrollFlags(raw):
    override def toString(): String = this.name

    /** Don't emit scroll.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case NONE
        extends KnownValue(
          GtkEventControllerScrollFlags.GTK_EVENT_CONTROLLER_SCROLL_NONE,
          "NONE"
        )

    /** Emit scroll with vertical deltas.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case VERTICAL
        extends KnownValue(
          GtkEventControllerScrollFlags.GTK_EVENT_CONTROLLER_SCROLL_VERTICAL,
          "VERTICAL"
        )

    /** Emit scroll with horizontal deltas.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case HORIZONTAL
        extends KnownValue(
          GtkEventControllerScrollFlags.GTK_EVENT_CONTROLLER_SCROLL_HORIZONTAL,
          "HORIZONTAL"
        )

    /** Only emit deltas that are multiples of 1.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case DISCRETE
        extends KnownValue(
          GtkEventControllerScrollFlags.GTK_EVENT_CONTROLLER_SCROLL_DISCRETE,
          "DISCRETE"
        )

    /** Emit ::decelerate after continuous scroll finishes.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case KINETIC
        extends KnownValue(
          GtkEventControllerScrollFlags.GTK_EVENT_CONTROLLER_SCROLL_KINETIC,
          "KINETIC"
        )

    /** Emit scroll on both axes.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case BOTH_AXES
        extends KnownValue(
          GtkEventControllerScrollFlags.GTK_EVENT_CONTROLLER_SCROLL_BOTH_AXES,
          "BOTH_AXES"
        )
  end KnownValue
end EventControllerScrollFlags
