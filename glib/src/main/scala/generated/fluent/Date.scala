package sn.gnome.glib

import _root_.sn.gnome.glib.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.{Date, DateMonth, DateWeekday, TimeVal}
import sn.gnome.glib.internal.{GDate, gboolean, gchar, gint, guint, guint32}

/** Represents a day between January 1, Year 1 and a few thousand years in the
  * future. None of its members should be accessed directly.
  *
  * If the `GDate` is obtained from g_date_new(), it will be safe to mutate but
  * invalid and thus not safe for calendrical computations.
  *
  * If it's declared on the stack, it will contain garbage so must be
  * initialized with g_date_clear(). g_date_clear() makes the date invalid but
  * safe. An invalid date doesn't represent a day, it's "empty." A date becomes
  * valid after you set it to a Julian day or you set a day, month, and year.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class Date private[gnome] (raw: Ptr[GDate]):

  def getUnsafeRawPointer(): Ptr[GDate] = this.raw

  /** the Julian representation of the date
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def julianDays: UInt /* None */ = (!raw).julian_days.asInstanceOf[guint]

  /** the Julian representation of the date
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def julianDays_=(value: UInt /* None */ ): Unit =
    (!raw).julian_days_=(guint(value).asInstanceOf[guint])

  /** this bit is set if @julian_days is valid
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def julian: UInt /* None */ = (!raw).julian.asInstanceOf[guint]

  /** this bit is set if @julian_days is valid
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def julian_=(value: UInt /* None */ ): Unit =
    (!raw).julian_=(guint(value).asInstanceOf[guint])

  /** this is set if @day, @month and @year are valid
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def dmy: UInt /* None */ = (!raw).dmy.asInstanceOf[guint]

  /** this is set if @day, @month and @year are valid
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def dmy_=(value: UInt /* None */ ): Unit =
    (!raw).dmy_=(guint(value).asInstanceOf[guint])

  /** the day of the day-month-year representation of the date, as a number
    * between 1 and 31
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def day: UInt /* None */ = (!raw).day.asInstanceOf[guint]

  /** the day of the day-month-year representation of the date, as a number
    * between 1 and 31
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def day_=(value: UInt /* None */ ): Unit =
    (!raw).day_=(guint(value).asInstanceOf[guint])

  /** the day of the day-month-year representation of the date, as a number
    * between 1 and 12
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def month: UInt /* None */ = (!raw).month.asInstanceOf[guint]

  /** the day of the day-month-year representation of the date, as a number
    * between 1 and 12
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def month_=(value: UInt /* None */ ): Unit =
    (!raw).month_=(guint(value).asInstanceOf[guint])

  /** the day of the day-month-year representation of the date
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def year: UInt /* None */ = (!raw).year.asInstanceOf[guint]

  /** the day of the day-month-year representation of the date
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def year_=(value: UInt /* None */ ): Unit =
    (!raw).year_=(guint(value).asInstanceOf[guint])

  /** Increments a date some number of days. To move forward by weeks, add
    * weeks*7 days. The date must be valid.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def addDays(n_days: UInt /* Some(guint) */ ): Unit /* None */ =
    g_date_add_days(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GDate]],
      guint(n_days)
    )
  end addDays

  /** Increments a date by some number of months. If the day of the month is
    * greater than 28, this routine may change the day of the month (because the
    * destination month may not have the current day in it). The date must be
    * valid.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def addMonths(n_months: UInt /* Some(guint) */ ): Unit /* None */ =
    g_date_add_months(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GDate]],
      guint(n_months)
    )
  end addMonths

  /** Increments a date by some number of years. If the date is February 29, and
    * the destination year is not a leap year, the date will be changed to
    * February 28. The date must be valid.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def addYears(n_years: UInt /* Some(guint) */ ): Unit /* None */ =
    g_date_add_years(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GDate]],
      guint(n_years)
    )
  end addYears

  /** If @date is prior to @min_date, sets @date equal to @min_date. If @date
    * falls after @max_date, sets @date equal to @max_date. Otherwise, @date is
    * unchanged. Either of @min_date and @max_date may be %NULL. All non-%NULL
    * dates must be valid.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def clamp(
      min_date: sn.gnome.glib.Date /* Some(Ptr[GDate]) */,
      max_date: sn.gnome.glib.Date /* Some(Ptr[GDate]) */
  ): Unit /* None */ =
    g_date_clamp(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GDate]],
      min_date.getUnsafeRawPointer().asInstanceOf,
      max_date.getUnsafeRawPointer().asInstanceOf
    )
  end clamp

  /** Initializes one or more #GDate structs to a safe but invalid state. The
    * cleared dates will not represent an existing date, but will not contain
    * garbage. Useful to init a date declared on the stack. Validity can be
    * tested with g_date_valid().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def clear(n_dates: UInt /* Some(guint) */ ): Unit /* None */ =
    g_date_clear(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GDate]],
      guint(n_dates)
    )
  end clear

  /** qsort()-style comparison function for dates. Both dates must be valid.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def compare(rhs: sn.gnome.glib.Date /* Some(Ptr[GDate]) */ ): Int /* None */ =
    g_date_compare(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GDate]],
      rhs.getUnsafeRawPointer().asInstanceOf
    ).value
  end compare

  /** Copies a GDate to a newly-allocated GDate. If the input was invalid (as
    * determined by g_date_valid()), the invalid state will be copied as is into
    * the new object.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def copy(): sn.gnome.glib.Date /* None */ =
    sn.gnome.glib.Date
      .fromRaw(g_date_copy(this.getUnsafeRawPointer().asInstanceOf[Ptr[GDate]]))
  end copy

  /** Computes the number of days between two dates. If @date2 is prior to @date1,
    * the returned value is negative. Both dates must be valid.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def daysBetween(
      date2: sn.gnome.glib.Date /* Some(Ptr[GDate]) */
  ): Int /* None */ =
    g_date_days_between(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GDate]],
      date2.getUnsafeRawPointer().asInstanceOf
    ).value
  end daysBetween

  /** Frees a #GDate returned from g_date_new().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def free(): Unit /* None */ =
    g_date_free(this.getUnsafeRawPointer().asInstanceOf[Ptr[GDate]])
  end free

  /** Returns the day of the month. The date must be valid.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_day/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(DateDay), @type -> DataRecord(GDateDay)))"
  )
  private def getDay__ = ???

  /** Returns the day of the year, where Jan 1 is the first day of the year. The
    * date must be valid.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDayOfYear(): UInt /* None */ =
    g_date_get_day_of_year(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GDate]]
    ).value
  end getDayOfYear

  /** Returns the week of the year, where weeks are interpreted according to ISO
    * 8601.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getIso8601WeekOfYear(): UInt /* None */ =
    g_date_get_iso8601_week_of_year(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GDate]]
    ).value
  end getIso8601WeekOfYear

  /** Returns the Julian day or "serial number" of the #GDate. The Julian day is
    * simply the number of days since January 1, Year 1; i.e., January 1, Year 1
    * is Julian day 1; January 2, Year 1 is Julian day 2, etc. The date must be
    * valid.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getJulian(): UInt /* None */ =
    g_date_get_julian(this.getUnsafeRawPointer().asInstanceOf[Ptr[GDate]]).value
  end getJulian

  /** Returns the week of the year, where weeks are understood to start on
    * Monday. If the date is before the first Monday of the year, return 0. The
    * date must be valid.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getMondayWeekOfYear(): UInt /* None */ =
    g_date_get_monday_week_of_year(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GDate]]
    ).value
  end getMondayWeekOfYear

  /** Returns the month of the year. The date must be valid.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getMonth(): sn.gnome.glib.DateMonth /* None */ =
    sn.gnome.glib.DateMonth.fromRaw(
      g_date_get_month(this.getUnsafeRawPointer().asInstanceOf[Ptr[GDate]])
    )
  end getMonth

  /** Returns the week of the year during which this date falls, if weeks are
    * understood to begin on Sunday. The date must be valid. Can return 0 if the
    * day is before the first Sunday of the year.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSundayWeekOfYear(): UInt /* None */ =
    g_date_get_sunday_week_of_year(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GDate]]
    ).value
  end getSundayWeekOfYear

  /** Returns the day of the week for a #GDate. The date must be valid.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getWeekday(): sn.gnome.glib.DateWeekday /* None */ =
    sn.gnome.glib.DateWeekday.fromRaw(
      g_date_get_weekday(this.getUnsafeRawPointer().asInstanceOf[Ptr[GDate]])
    )
  end getWeekday

  /** Returns the year of a #GDate. The date must be valid.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_year/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(DateYear), @type -> DataRecord(GDateYear)))"
  )
  private def getYear__ = ???

  /** Returns %TRUE if the date is on the first of a month. The date must be
    * valid.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isFirstOfMonth(): Boolean /* None */ =
    g_date_is_first_of_month(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GDate]]
    ).value.!=(0)
  end isFirstOfMonth

  /** Returns %TRUE if the date is the last day of the month. The date must be
    * valid.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isLastOfMonth(): Boolean /* None */ =
    g_date_is_last_of_month(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GDate]]
    ).value.!=(0)
  end isLastOfMonth

  /** Checks if @date1 is less than or equal to @date2, and swap the values if
    * this is not the case.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def order(
      date2: sn.gnome.glib.Date /* Some(Ptr[GDate]) */
  ): Unit /* None */ =
    g_date_order(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GDate]],
      date2.getUnsafeRawPointer().asInstanceOf
    )
  end order

  /** Sets the day of the month for a #GDate. If the resulting day-month-year
    * triplet is invalid, the date will be invalid.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_day/<method parameters>/day]: Cannot render type Type(List(),ListMap(@name -> DataRecord(DateDay), @type -> DataRecord(GDateDay)))"
  )
  private def setDay__ = ???

  /** Sets the value of a #GDate from a day, month, and year. The day-month-year
    * triplet must be valid; if you aren't sure it is, call g_date_valid_dmy()
    * to check before you set it.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_dmy/<method parameters>/day]: Cannot render type Type(List(),ListMap(@name -> DataRecord(DateDay), @type -> DataRecord(GDateDay)))"
  )
  private def setDmy__ = ???

  /** Sets the value of a #GDate from a Julian day number.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setJulian(julian_date: UInt /* Some(guint32) */ ): Unit /* None */ =
    g_date_set_julian(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GDate]],
      guint32(julian_date)
    )
  end setJulian

  /** Sets the month of the year for a #GDate. If the resulting day-month-year
    * triplet is invalid, the date will be invalid.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setMonth(
      month: sn.gnome.glib.DateMonth /* Some(GDateMonth) */
  ): Unit /* None */ =
    g_date_set_month(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GDate]],
      month.raw
    )
  end setMonth

  /** Parses a user-inputted string @str, and try to figure out what date it
    * represents, taking the [current locale][setlocale] into account. If the
    * string is successfully parsed, the date will be valid after the call.
    * Otherwise, it will be invalid. You should check using g_date_valid() to
    * see whether the parsing succeeded.
    *
    * This function is not appropriate for file formats and the like; it isn't
    * very precise, and its exact behavior varies with the locale. It's intended
    * to be a heuristic routine that guesses what the user means by a given
    * string (and it does work pretty well in that capacity).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setParse(
      str: scala.Predef.String /* Some(Ptr[gchar]) */
  )(using Zone): Unit /* None */ =
    g_date_set_parse(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GDate]],
      toCString(str).asInstanceOf[Ptr[gchar]]
    )
  end setParse

  /** Sets the value of a date from a #GTime value. The time to date conversion
    * is done using the user's current timezone.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_time/<method parameters>/time_]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Time), @type -> DataRecord(GTime)))"
  )
  private def setTime__ = ???

  /**  Sets the value of a date to the date corresponding to a time
    *  specified as a time_t. The time to date conversion is done using
    *  the user's current timezone.
    *
    *  To set the value of a date to the current day, you could write:
    *  |[<!-- language="C" -->
    *   time_t now = time (NULL);
    *   if (now == (time_t) -1)
    *     // handle the error
    *   g_date_set_time_t (date, now);
    *  ]|
    *
    *  NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_time_t/<method parameters>/timet]: Cannot render type Type(List(),ListMap(@name -> DataRecord(glong), @type -> DataRecord(time_t)))"
  )
  private def setTimeT__ = ???

  /** Sets the value of a date from a #GTimeVal value. Note that the
    * @tv_usec
    *   member is ignored, because #GDate can't make use of the additional
    *   precision.
    *
    * The time to date conversion is done using the user's current timezone.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setTimeVal(
      timeval: sn.gnome.glib.TimeVal /* Some(Ptr[GTimeVal]) */
  ): Unit /* None */ =
    g_date_set_time_val(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GDate]],
      timeval.getUnsafeRawPointer().asInstanceOf
    )
  end setTimeVal

  /** Sets the year for a #GDate. If the resulting day-month-year triplet is
    * invalid, the date will be invalid.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_year/<method parameters>/year]: Cannot render type Type(List(),ListMap(@name -> DataRecord(DateYear), @type -> DataRecord(GDateYear)))"
  )
  private def setYear__ = ???

  /** Moves a date some number of days into the past. To move by weeks, just
    * move by weeks*7 days. The date must be valid.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def subtractDays(n_days: UInt /* Some(guint) */ ): Unit /* None */ =
    g_date_subtract_days(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GDate]],
      guint(n_days)
    )
  end subtractDays

  /** Moves a date some number of months into the past. If the current day of
    * the month doesn't exist in the destination month, the day of the month may
    * change. The date must be valid.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def subtractMonths(n_months: UInt /* Some(guint) */ ): Unit /* None */ =
    g_date_subtract_months(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GDate]],
      guint(n_months)
    )
  end subtractMonths

  /** Moves a date some number of years into the past. If the current day
    * doesn't exist in the destination year (i.e. it's February 29 and you move
    * to a non-leap-year) then the day is changed to February 29. The date must
    * be valid.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def subtractYears(n_years: UInt /* Some(guint) */ ): Unit /* None */ =
    g_date_subtract_years(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GDate]],
      guint(n_years)
    )
  end subtractYears

  /** Fills in the date-related bits of a struct tm using the @date value.
    * Initializes the non-date parts with something safe but meaningless.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method to_struct_tm/<method parameters>/tm]: Cannot render type Type(List(),ListMap(@name -> DataRecord(gpointer), @type -> DataRecord(tm*)))"
  )
  private def toStructTm__ = ???

  /** Returns %TRUE if the #GDate represents an existing day. The date must not
    * contain garbage; it should have been initialized with g_date_clear() if it
    * wasn't allocated by one of the g_date_new() variants.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def valid(): Boolean /* None */ =
    g_date_valid(this.getUnsafeRawPointer().asInstanceOf[Ptr[GDate]]).value
      .!=(0)
  end valid

end Date

object Date:
  def fromRaw(ptr: Ptr[GDate]): Date = new Date(ptr)
end Date
