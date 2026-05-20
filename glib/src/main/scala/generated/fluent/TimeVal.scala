package sn.gnome.glib

import _root_.sn.gnome.glib.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.{GTimeVal, gchar}

/** Represents a precise time, with seconds and microseconds.
  *
  * Similar to the struct timeval returned by the `gettimeofday()` UNIX system
  * call.
  *
  * GLib is attempting to unify around the use of 64-bit integers to represent
  * microsecond-precision time. As such, this type will be removed from a future
  * version of GLib. A consequence of using `glong` for `tv_sec` is that on
  * 32-bit systems `GTimeVal` is subject to the year 2038 problem.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class TimeVal private[gnome] (raw: Ptr[GTimeVal]):

  def getUnsafeRawPointer(): Ptr[GTimeVal] = this.raw

  /** seconds
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[field tv_sec]: Cannot render type Type(List(),ListMap(@name -> DataRecord(glong), @type -> DataRecord(glong)))"
  )
  private def tvSec__ = ???

  /** microseconds
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[field tv_usec]: Cannot render type Type(List(),ListMap(@name -> DataRecord(glong), @type -> DataRecord(glong)))"
  )
  private def tvUsec__ = ???

  /** Adds the given number of microseconds to @time_. @microseconds can also be
    * negative to decrease the value of @time_.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method add/<method parameters>/microseconds]: Cannot render type Type(List(),ListMap(@name -> DataRecord(glong), @type -> DataRecord(glong)))"
  )
  private def add__ = ???

  /**  Converts @time_ into an RFC 3339 encoded string, relative to the
    *  Coordinated Universal Time (UTC). This is one of the many formats
    *  allowed by ISO 8601.
    *
    *  ISO 8601 allows a large number of date/time formats, with or without
    *  punctuation and optional elements. The format returned by this function
    *  is a complete date and time, with optional punctuation included, the
    *  UTC time zone represented as "Z", and the @tv_usec part included if
    *  and only if it is nonzero, i.e. either
    *  "YYYY-MM-DDTHH:MM:SSZ" or "YYYY-MM-DDTHH:MM:SS.fffffZ".
    *
    *  This corresponds to the Internet date/time format defined by
    *  [RFC 3339](https://www.ietf.org/rfc/rfc3339.txt),
    *  and to either of the two most-precise formats defined by
    *  the W3C Note
    *  [Date and Time Formats](http://www.w3.org/TR/NOTE-datetime-19980827).
    *  Both of these documents are profiles of ISO 8601.
    *
    *  Use g_date_time_format() or g_strdup_printf() if a different
    *  variation of ISO 8601 format is required.
    *
    *  If @time_ represents a date which is too large to fit into a `struct tm`,
    *  %NULL will be returned. This is platform dependent. Note also that since
    *  `GTimeVal` stores the number of seconds as a `glong`, on 32-bit systems it
    *  is subject to the year 2038 problem. Accordingly, since GLib 2.62, this
    *  function has been deprecated. Equivalent functionality is available using:
    *  |[
    *  GDateTime *dt = g_date_time_new_from_unix_utc (time_val);
    *  iso8601_string = g_date_time_format_iso8601 (dt);
    *  g_date_time_unref (dt);
    *  ]|
    *
    *  The return value of g_time_val_to_iso8601() has been nullable since GLib
    *  2.54; before then, GLib would crash under the same conditions.
    *
    *  NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT BE APPLICABLE TO SCALA
    */
  def toIso8601()(using Zone): scala.Predef.String /* None */ =
    fromCString(
      g_time_val_to_iso8601(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GTimeVal]]
      ).asInstanceOf
    )
  end toIso8601

end TimeVal

object TimeVal:
  def fromRaw(ptr: Ptr[GTimeVal]): TimeVal = new TimeVal(ptr)
end TimeVal
