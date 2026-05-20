package sn.gnome.glib

import _root_.sn.gnome.glib.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.{TimeType, TimeZone}
import sn.gnome.glib.internal.{GTimeZone, gboolean, gchar, gint, gint32, gint64}

/** #GTimeZone is an opaque structure whose members cannot be accessed directly.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class TimeZone private[gnome] (raw: Ptr[GTimeZone]):

  def getUnsafeRawPointer(): Ptr[GTimeZone] = this.raw

  /** Finds an interval within @tz that corresponds to the given @time_,
    * possibly adjusting @time_ if required to fit into an interval. The meaning
    * of @time_ depends on @type.
    *
    * This function is similar to g_time_zone_find_interval(), with the
    * difference that it always succeeds (by making the adjustments described
    * below).
    *
    * In any of the cases where g_time_zone_find_interval() succeeds then this
    * function returns the same value, without modifying @time_.
    *
    * This function may, however, modify @time_ in order to deal with
    * non-existent times. If the non-existent local @time_ of 02:30 were
    * requested on March 14th 2010 in Toronto then this function would adjust @time_
    * to be 03:00 and return the interval containing the adjusted time.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method adjust_time]: Method adjust_time contains an INOUT parameter, which is not supported yet"
  )
  private def adjustTime__ = ???

  /** Finds an interval within @tz that corresponds to the given @time_. The
    * meaning of @time_ depends on @type.
    *
    * If @type is %G_TIME_TYPE_UNIVERSAL then this function will always succeed
    * (since universal time is monotonic and continuous).
    *
    * Otherwise @time_ is treated as local time. The distinction between
    * %G_TIME_TYPE_STANDARD and %G_TIME_TYPE_DAYLIGHT is ignored except in the
    * case that the given @time_ is ambiguous. In Toronto, for example, 01:30 on
    * November 7th 2010 occurred twice (once inside of daylight savings time and
    * the next, an hour later, outside of daylight savings time). In this case,
    * the different value of @type would result in a different interval being
    * returned.
    *
    * It is still possible for this function to fail. In Toronto, for example,
    * 02:00 on March 14th 2010 does not exist (due to the leap forward to begin
    * daylight savings time). -1 is returned in that case.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def findInterval(
      `type`: sn.gnome.glib.TimeType /* Some(GTimeType) */,
      `time_`: CLongInt /* Some(gint64) */
  ): Int /* None */ =
    g_time_zone_find_interval(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GTimeZone]],
      `type`.raw,
      gint64(`time_`)
    ).value
  end findInterval

  /** Determines the time zone abbreviation to be used during a particular
    * @interval
    *   of time in the time zone @tz.
    *
    * For example, in Toronto this is currently "EST" during the winter months
    * and "EDT" during the summer months when daylight savings time is in
    * effect.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getAbbreviation(
      interval: Int /* Some(gint) */
  ): scala.Predef.String /* None */ =
    fromCString(
      g_time_zone_get_abbreviation(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GTimeZone]],
        gint(interval)
      ).asInstanceOf
    )
  end getAbbreviation

  /** Get the identifier of this #GTimeZone, as passed to g_time_zone_new(). If
    * the identifier passed at construction time was not recognised, `UTC` will
    * be returned. If it was %NULL, the identifier of the local timezone at
    * construction time will be returned.
    *
    * The identifier will be returned in the same format as provided at
    * construction time: if provided as a time offset, that will be returned by
    * this function.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getIdentifier(): scala.Predef.String /* None */ =
    fromCString(
      g_time_zone_get_identifier(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GTimeZone]]
      ).asInstanceOf
    )
  end getIdentifier

  /** Determines the offset to UTC in effect during a particular @interval of
    * time in the time zone @tz.
    *
    * The offset is the number of seconds that you add to UTC time to arrive at
    * local time for @tz (ie: negative numbers for time zones west of GMT,
    * positive numbers for east).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getOffset(interval: Int /* Some(gint) */ ): CInt /* None */ =
    g_time_zone_get_offset(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GTimeZone]],
      gint(interval)
    ).value
  end getOffset

  /** Determines if daylight savings time is in effect during a particular
    * @interval
    *   of time in the time zone @tz.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isDst(interval: Int /* Some(gint) */ ): Boolean /* None */ =
    g_time_zone_is_dst(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GTimeZone]],
      gint(interval)
    ).value.!=(0)
  end isDst

  /** Increases the reference count on @tz.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def ref(): sn.gnome.glib.TimeZone /* None */ =
    sn.gnome.glib.TimeZone.fromRaw(
      g_time_zone_ref(this.getUnsafeRawPointer().asInstanceOf[Ptr[GTimeZone]])
    )
  end ref

  /** Decreases the reference count on @tz.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unref(): Unit /* None */ =
    g_time_zone_unref(this.getUnsafeRawPointer().asInstanceOf[Ptr[GTimeZone]])
  end unref

end TimeZone

object TimeZone:
  def fromRaw(ptr: Ptr[GTimeZone]): TimeZone = new TimeZone(ptr)
end TimeZone
