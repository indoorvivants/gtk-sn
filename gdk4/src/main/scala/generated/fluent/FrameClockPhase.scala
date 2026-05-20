package sn.gnome.gdk4

import _root_.sn.gnome.gdk4.internal.GdkFrameClockPhase

/** Used to represent the different paint clock phases that can be requested.
  *
  * The elements of the enumeration correspond to the signals of
  * `GdkFrameClock`.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class FrameClockPhase private (val raw: GdkFrameClockPhase):
  def is(kv: FrameClockPhase): Boolean =
    raw.is(kv.raw)

  override def toString(): scala.Predef.String =
    var rem = raw.value
    val sb = scala.List.newBuilder[FrameClockPhase.KnownValue]
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

  /** Used to represent the different paint clock phases that can be requested.
    *
    * The elements of the enumeration correspond to the signals of
    * `GdkFrameClock`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  enum KnownValue(
      override val raw: GdkFrameClockPhase,
      name: scala.Predef.String
  ) extends FrameClockPhase(raw):
    override def toString(): scala.Predef.String = this.name

    /** no phase
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case NONE
        extends KnownValue(
          GdkFrameClockPhase.GDK_FRAME_CLOCK_PHASE_NONE,
          "NONE"
        )

    /** corresponds to GdkFrameClock::flush-events. Should not be handled by
      * applications.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case FLUSH_EVENTS
        extends KnownValue(
          GdkFrameClockPhase.GDK_FRAME_CLOCK_PHASE_FLUSH_EVENTS,
          "FLUSH_EVENTS"
        )

    /** corresponds to GdkFrameClock::before-paint. Should not be handled by
      * applications.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case BEFORE_PAINT
        extends KnownValue(
          GdkFrameClockPhase.GDK_FRAME_CLOCK_PHASE_BEFORE_PAINT,
          "BEFORE_PAINT"
        )

    /** corresponds to GdkFrameClock::update.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case UPDATE
        extends KnownValue(
          GdkFrameClockPhase.GDK_FRAME_CLOCK_PHASE_UPDATE,
          "UPDATE"
        )

    /** corresponds to GdkFrameClock::layout. Should not be handled by
      * applications.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case LAYOUT
        extends KnownValue(
          GdkFrameClockPhase.GDK_FRAME_CLOCK_PHASE_LAYOUT,
          "LAYOUT"
        )

    /** corresponds to GdkFrameClock::paint.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case PAINT
        extends KnownValue(
          GdkFrameClockPhase.GDK_FRAME_CLOCK_PHASE_PAINT,
          "PAINT"
        )

    /** corresponds to GdkFrameClock::resume-events. Should not be handled by
      * applications.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case RESUME_EVENTS
        extends KnownValue(
          GdkFrameClockPhase.GDK_FRAME_CLOCK_PHASE_RESUME_EVENTS,
          "RESUME_EVENTS"
        )

    /** corresponds to GdkFrameClock::after-paint. Should not be handled by
      * applications.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case AFTER_PAINT
        extends KnownValue(
          GdkFrameClockPhase.GDK_FRAME_CLOCK_PHASE_AFTER_PAINT,
          "AFTER_PAINT"
        )
  end KnownValue
end FrameClockPhase
