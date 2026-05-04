package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.GdkFrameClockPhase

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Used to represent the different paint clock phases that can be requested.
  *
  * The elements of the enumeration correspond to the signals of
  * `GdkFrameClock`.
  */
class FrameClockPhase private (val raw: GdkFrameClockPhase):
  def is(kv: FrameClockPhase): Boolean =
    raw.is(kv.raw)

  override def toString(): String =
    var rem = raw.value
    val sb = List.newBuilder[FrameClockPhase.KnownValue]
    FrameClockPhase.KnownValue.values.foreach: kv =>
      if this.is(kv) then sb += kv

      rem = rem & (~kv.raw.value)

    s"FrameClockPhase(${sb.result().mkString(", ")})"
end FrameClockPhase

object FrameClockPhase:
  export KnownValue.*

  def fromRaw(raw: GdkFrameClockPhase) = new FrameClockPhase(raw)

  extension (af: FrameClockPhase)
    def &(other: FrameClockPhase) =
      FrameClockPhase(af.raw & other.raw)
    def |(other: FrameClockPhase) =
      FrameClockPhase(af.raw | other.raw)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Used to represent the different paint clock phases that can be requested.
    *
    * The elements of the enumeration correspond to the signals of
    * `GdkFrameClock`.
    */
  enum KnownValue(override val raw: GdkFrameClockPhase, name: String)
      extends FrameClockPhase(raw):
    override def toString(): String = this.name

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * no phase
      */
    case NONE
        extends KnownValue(
          GdkFrameClockPhase.GDK_FRAME_CLOCK_PHASE_NONE,
          "NONE"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * corresponds to GdkFrameClock::flush-events. Should not be handled by
      * applications.
      */
    case FLUSH_EVENTS
        extends KnownValue(
          GdkFrameClockPhase.GDK_FRAME_CLOCK_PHASE_FLUSH_EVENTS,
          "FLUSH_EVENTS"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * corresponds to GdkFrameClock::before-paint. Should not be handled by
      * applications.
      */
    case BEFORE_PAINT
        extends KnownValue(
          GdkFrameClockPhase.GDK_FRAME_CLOCK_PHASE_BEFORE_PAINT,
          "BEFORE_PAINT"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * corresponds to GdkFrameClock::update.
      */
    case UPDATE
        extends KnownValue(
          GdkFrameClockPhase.GDK_FRAME_CLOCK_PHASE_UPDATE,
          "UPDATE"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * corresponds to GdkFrameClock::layout. Should not be handled by
      * applications.
      */
    case LAYOUT
        extends KnownValue(
          GdkFrameClockPhase.GDK_FRAME_CLOCK_PHASE_LAYOUT,
          "LAYOUT"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * corresponds to GdkFrameClock::paint.
      */
    case PAINT
        extends KnownValue(
          GdkFrameClockPhase.GDK_FRAME_CLOCK_PHASE_PAINT,
          "PAINT"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * corresponds to GdkFrameClock::resume-events. Should not be handled by
      * applications.
      */
    case RESUME_EVENTS
        extends KnownValue(
          GdkFrameClockPhase.GDK_FRAME_CLOCK_PHASE_RESUME_EVENTS,
          "RESUME_EVENTS"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * corresponds to GdkFrameClock::after-paint. Should not be handled by
      * applications.
      */
    case AFTER_PAINT
        extends KnownValue(
          GdkFrameClockPhase.GDK_FRAME_CLOCK_PHASE_AFTER_PAINT,
          "AFTER_PAINT"
        )
  end KnownValue
end FrameClockPhase
