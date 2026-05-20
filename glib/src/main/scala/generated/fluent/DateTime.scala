package sn.gnome.glib

import _root_.sn.gnome.glib.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.{DateTime, TimeVal, TimeZone}
import sn.gnome.glib.internal.{
  GDateTime,
  gboolean,
  gchar,
  gdouble,
  gint,
  gint64,
  guint
}

/** An opaque structure that represents a date and time, including a time zone.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class DateTime private[gnome] (raw: Ptr[GDateTime]):

  def getUnsafeRawPointer(): Ptr[GDateTime] = this.raw

  /** Creates a copy of @datetime and adds the specified timespan to the copy.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method add/<method parameters>/timespan]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TimeSpan), @type -> DataRecord(GTimeSpan)))"
  )
  private def add__ = ???

  /** Creates a copy of @datetime and adds the specified number of days to the
    * copy. Add negative values to subtract days.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def addDays(days: Int /* Some(gint) */ ): sn.gnome.glib.DateTime /* None */ =
    sn.gnome.glib.DateTime.fromRaw(
      g_date_time_add_days(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GDateTime]],
        gint(days)
      )
    )
  end addDays

  /** Creates a new #GDateTime adding the specified values to the current date
    * and time in @datetime. Add negative values to subtract.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def addFull(
      years: Int /* Some(gint) */,
      months: Int /* Some(gint) */,
      days: Int /* Some(gint) */,
      hours: Int /* Some(gint) */,
      minutes: Int /* Some(gint) */,
      seconds: Double /* Some(gdouble) */
  ): sn.gnome.glib.DateTime /* None */ =
    sn.gnome.glib.DateTime.fromRaw(
      g_date_time_add_full(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GDateTime]],
        gint(years),
        gint(months),
        gint(days),
        gint(hours),
        gint(minutes),
        gdouble(seconds)
      )
    )
  end addFull

  /** Creates a copy of @datetime and adds the specified number of hours. Add
    * negative values to subtract hours.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def addHours(
      hours: Int /* Some(gint) */
  ): sn.gnome.glib.DateTime /* None */ =
    sn.gnome.glib.DateTime.fromRaw(
      g_date_time_add_hours(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GDateTime]],
        gint(hours)
      )
    )
  end addHours

  /** Creates a copy of @datetime adding the specified number of minutes. Add
    * negative values to subtract minutes.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def addMinutes(
      minutes: Int /* Some(gint) */
  ): sn.gnome.glib.DateTime /* None */ =
    sn.gnome.glib.DateTime.fromRaw(
      g_date_time_add_minutes(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GDateTime]],
        gint(minutes)
      )
    )
  end addMinutes

  /** Creates a copy of @datetime and adds the specified number of months to the
    * copy. Add negative values to subtract months.
    *
    * The day of the month of the resulting #GDateTime is clamped to the number
    * of days in the updated calendar month. For example, if adding 1 month to
    * 31st January 2018, the result would be 28th February 2018. In 2020 (a leap
    * year), the result would be 29th February.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def addMonths(
      months: Int /* Some(gint) */
  ): sn.gnome.glib.DateTime /* None */ =
    sn.gnome.glib.DateTime.fromRaw(
      g_date_time_add_months(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GDateTime]],
        gint(months)
      )
    )
  end addMonths

  /** Creates a copy of @datetime and adds the specified number of seconds. Add
    * negative values to subtract seconds.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def addSeconds(
      seconds: Double /* Some(gdouble) */
  ): sn.gnome.glib.DateTime /* None */ =
    sn.gnome.glib.DateTime.fromRaw(
      g_date_time_add_seconds(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GDateTime]],
        gdouble(seconds)
      )
    )
  end addSeconds

  /** Creates a copy of @datetime and adds the specified number of weeks to the
    * copy. Add negative values to subtract weeks.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def addWeeks(
      weeks: Int /* Some(gint) */
  ): sn.gnome.glib.DateTime /* None */ =
    sn.gnome.glib.DateTime.fromRaw(
      g_date_time_add_weeks(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GDateTime]],
        gint(weeks)
      )
    )
  end addWeeks

  /** Creates a copy of @datetime and adds the specified number of years to the
    * copy. Add negative values to subtract years.
    *
    * As with g_date_time_add_months(), if the resulting date would be 29th
    * February on a non-leap year, the day will be clamped to 28th February.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def addYears(
      years: Int /* Some(gint) */
  ): sn.gnome.glib.DateTime /* None */ =
    sn.gnome.glib.DateTime.fromRaw(
      g_date_time_add_years(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GDateTime]],
        gint(years)
      )
    )
  end addYears

  /** A comparison function for #GDateTimes that is suitable as a #GCompareFunc.
    * Both #GDateTimes must be non-%NULL.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def compare(
      dt2: sn.gnome.glib.DateTime /* Some(gconstpointer) */
  ): Int /* None */ =
    g_date_time_compare(
      this.getUnsafeRawPointer().asInstanceOf[gconstpointer],
      dt2.getUnsafeRawPointer().asInstanceOf
    ).value
  end compare

  /** Calculates the difference in time between @end and @begin. The #GTimeSpan
    * that is returned is effectively @end - @begin (ie: positive if the first
    * parameter is larger).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method difference/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TimeSpan), @type -> DataRecord(GTimeSpan)))"
  )
  private def difference__ = ???

  /** Checks to see if @dt1 and @dt2 are equal.
    *
    * Equal here means that they represent the same moment after converting them
    * to the same time zone.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def equal(
      dt2: sn.gnome.glib.DateTime /* Some(gconstpointer) */
  ): Boolean /* None */ =
    g_date_time_equal(
      this.getUnsafeRawPointer().asInstanceOf[gconstpointer],
      dt2.getUnsafeRawPointer().asInstanceOf
    ).value.!=(0)
  end equal

  /** Creates a newly allocated string representing the requested @format.
    *
    * The format strings understood by this function are a subset of the
    * `strftime()` format language as specified by C99. The `%D`, `%U` and `%W`
    * conversions are not supported, nor is the `E` modifier. The GNU extensions
    * `%k`, `%l`, `%s` and `%P` are supported, however, as are the `0`, `_` and
    * `-` modifiers. The Python extension `%f` is also supported.
    *
    * In contrast to `strftime()`, this function always produces a UTF-8 string,
    * regardless of the current locale. Note that the rendering of many formats
    * is locale-dependent and may not match the `strftime()` output exactly.
    *
    * The following format specifiers are supported:
    *
    *   - `%a`: the abbreviated weekday name according to the current locale
    *   - `%A`: the full weekday name according to the current locale
    *   - `%b`: the abbreviated month name according to the current locale
    *   - `%B`: the full month name according to the current locale
    *   - `%c`: the preferred date and time representation for the current
    *     locale
    *   - `%C`: the century number (year/100) as a 2-digit integer (00-99)
    *   - `%d`: the day of the month as a decimal number (range 01 to 31)
    *   - `%e`: the day of the month as a decimal number (range 1 to 31); single
    *     digits are preceded by a figure space (U+2007)
    *   - `%F`: equivalent to `%Y-%m-%d` (the ISO 8601 date format)
    *   - `%g`: the last two digits of the ISO 8601 week-based year as a decimal
    *     number (00-99). This works well with `%V` and `%u`.
    *   - `%G`: the ISO 8601 week-based year as a decimal number. This works
    *     well with `%V` and `%u`.
    *   - `%h`: equivalent to `%b`
    *   - `%H`: the hour as a decimal number using a 24-hour clock (range 00 to
    *     23)
    *   - `%I`: the hour as a decimal number using a 12-hour clock (range 01 to
    *     12)
    *   - `%j`: the day of the year as a decimal number (range 001 to 366)
    *   - `%k`: the hour (24-hour clock) as a decimal number (range 0 to 23);
    *     single digits are preceded by a figure space (U+2007)
    *   - `%l`: the hour (12-hour clock) as a decimal number (range 1 to 12);
    *     single digits are preceded by a figure space (U+2007)
    *   - `%m`: the month as a decimal number (range 01 to 12)
    *   - `%M`: the minute as a decimal number (range 00 to 59)
    *   - `%f`: the microsecond as a decimal number (range 000000 to 999999)
    *   - `%p`: either ‘AM’ or ‘PM’ according to the given time value, or the
    *     corresponding strings for the current locale. Noon is treated as ‘PM’
    *     and midnight as ‘AM’. Use of this format specifier is discouraged, as
    *     many locales have no concept of AM/PM formatting. Use `%c` or `%X`
    *     instead.
    *   - `%P`: like `%p` but lowercase: ‘am’ or ‘pm’ or a corresponding string
    *     for the current locale. Use of this format specifier is discouraged,
    *     as many locales have no concept of AM/PM formatting. Use `%c` or `%X`
    *     instead.
    *   - `%r`: the time in a.m. or p.m. notation. Use of this format specifier
    *     is discouraged, as many locales have no concept of AM/PM formatting.
    *     Use `%c` or `%X` instead.
    *   - `%R`: the time in 24-hour notation (`%H:%M`)
    *   - `%s`: the number of seconds since the Epoch, that is, since 1970-01-01
    *     00:00:00 UTC
    *   - `%S`: the second as a decimal number (range 00 to 60)
    *   - `%t`: a tab character
    *   - `%T`: the time in 24-hour notation with seconds (`%H:%M:%S`)
    *   - `%u`: the ISO 8601 standard day of the week as a decimal, range 1 to
    *     7, Monday being 1. This works well with `%G` and `%V`.
    *   - `%V`: the ISO 8601 standard week number of the current year as a
    *     decimal number, range 01 to 53, where week 1 is the first week that
    *     has at least 4 days in the new year. See
    *     g_date_time_get_week_of_year(). This works well with `%G` and `%u`.
    *   - `%w`: the day of the week as a decimal, range 0 to 6, Sunday being 0.
    *     This is not the ISO 8601 standard format — use `%u` instead.
    *   - `%x`: the preferred date representation for the current locale without
    *     the time
    *   - `%X`: the preferred time representation for the current locale without
    *     the date
    *   - `%y`: the year as a decimal number without the century
    *   - `%Y`: the year as a decimal number including the century
    *   - `%z`: the time zone as an offset from UTC (`+hhmm`)
    *   - `%:z`: the time zone as an offset from UTC (`+hh:mm`). This is a
    *     gnulib `strftime()` extension. Since: 2.38
    *   - `%::z`: the time zone as an offset from UTC (`+hh:mm:ss`). This is a
    *     gnulib `strftime()` extension. Since: 2.38
    *   - `%:::z`: the time zone as an offset from UTC, with `:` to necessary
    *     precision (e.g., `-04`, `+05:30`). This is a gnulib `strftime()`
    *     extension. Since: 2.38
    *   - `%Z`: the time zone or name or abbreviation
    *   - `%%`: a literal `%` character
    *
    * Some conversion specifications can be modified by preceding the conversion
    * specifier by one or more modifier characters. The following modifiers are
    * supported for many of the numeric conversions:
    *
    *   - `O`: Use alternative numeric symbols, if the current locale supports
    *     those.
    *   - `_`: Pad a numeric result with spaces. This overrides the default
    *     padding for the specifier.
    *   - `-`: Do not pad a numeric result. This overrides the default padding
    *     for the specifier.
    *   - `0`: Pad a numeric result with zeros. This overrides the default
    *     padding for the specifier.
    *
    * Additionally, when `O` is used with `B`, `b`, or `h`, it produces the
    * alternative form of a month name. The alternative form should be used when
    * the month name is used without a day number (e.g., standalone). It is
    * required in some languages (Baltic, Slavic, Greek, and more) due to their
    * grammatical rules. For other languages there is no difference. `%OB` is a
    * GNU and BSD `strftime()` extension expected to be added to the future
    * POSIX specification, `%Ob` and `%Oh` are GNU `strftime()` extensions.
    * Since: 2.56
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def format(
      format: scala.Predef.String /* Some(Ptr[gchar]) */
  )(using Zone): scala.Predef.String /* None */ =
    fromCString(
      g_date_time_format(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GDateTime]],
        toCString(format).asInstanceOf[Ptr[gchar]]
      ).asInstanceOf
    )
  end format

  /** Format @datetime in [ISO 8601
    * format](https://en.wikipedia.org/wiki/ISO_8601), including the date, time
    * and time zone, and return that as a UTF-8 encoded string.
    *
    * Since GLib 2.66, this will output to sub-second precision if needed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def formatIso8601()(using Zone): scala.Predef.String /* None */ =
    fromCString(
      g_date_time_format_iso8601(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GDateTime]]
      ).asInstanceOf
    )
  end formatIso8601

  /** Retrieves the day of the month represented by @datetime in the gregorian
    * calendar.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDayOfMonth(): Int /* None */ =
    g_date_time_get_day_of_month(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GDateTime]]
    ).value
  end getDayOfMonth

  /** Retrieves the ISO 8601 day of the week on which @datetime falls (1 is
    * Monday, 2 is Tuesday... 7 is Sunday).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDayOfWeek(): Int /* None */ =
    g_date_time_get_day_of_week(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GDateTime]]
    ).value
  end getDayOfWeek

  /** Retrieves the day of the year represented by @datetime in the Gregorian
    * calendar.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDayOfYear(): Int /* None */ =
    g_date_time_get_day_of_year(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GDateTime]]
    ).value
  end getDayOfYear

  /** Retrieves the hour of the day represented by @datetime
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getHour(): Int /* None */ =
    g_date_time_get_hour(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GDateTime]]
    ).value
  end getHour

  /** Retrieves the microsecond of the date represented by @datetime
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getMicrosecond(): Int /* None */ =
    g_date_time_get_microsecond(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GDateTime]]
    ).value
  end getMicrosecond

  /** Retrieves the minute of the hour represented by @datetime
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getMinute(): Int /* None */ =
    g_date_time_get_minute(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GDateTime]]
    ).value
  end getMinute

  /** Retrieves the month of the year represented by @datetime in the Gregorian
    * calendar.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getMonth(): Int /* None */ =
    g_date_time_get_month(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GDateTime]]
    ).value
  end getMonth

  /** Retrieves the second of the minute represented by @datetime
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSecond(): Int /* None */ =
    g_date_time_get_second(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GDateTime]]
    ).value
  end getSecond

  /** Retrieves the number of seconds since the start of the last minute,
    * including the fractional part.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSeconds(): Double /* None */ =
    g_date_time_get_seconds(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GDateTime]]
    ).value
  end getSeconds

  /** Get the time zone for this @datetime.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getTimezone(): sn.gnome.glib.TimeZone /* None */ =
    sn.gnome.glib.TimeZone.fromRaw(
      g_date_time_get_timezone(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GDateTime]]
      )
    )
  end getTimezone

  /** Determines the time zone abbreviation to be used at the time and in the
    * time zone of @datetime.
    *
    * For example, in Toronto this is currently "EST" during the winter months
    * and "EDT" during the summer months when daylight savings time is in
    * effect.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getTimezoneAbbreviation(): scala.Predef.String /* None */ =
    fromCString(
      g_date_time_get_timezone_abbreviation(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GDateTime]]
      ).asInstanceOf
    )
  end getTimezoneAbbreviation

  /** Determines the offset to UTC in effect at the time and in the time zone of @datetime.
    *
    * The offset is the number of microseconds that you add to UTC time to
    * arrive at local time for the time zone (ie: negative numbers for time
    * zones west of GMT, positive numbers for east).
    *
    * If @datetime represents UTC time, then the offset is always zero.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_utc_offset/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TimeSpan), @type -> DataRecord(GTimeSpan)))"
  )
  private def getUtcOffset__ = ???

  /** Returns the ISO 8601 week-numbering year in which the week containing
    * @datetime
    *   falls.
    *
    * This function, taken together with g_date_time_get_week_of_year() and
    * g_date_time_get_day_of_week() can be used to determine the full ISO week
    * date on which @datetime falls.
    *
    * This is usually equal to the normal Gregorian year (as returned by
    * g_date_time_get_year()), except as detailed below:
    *
    * For Thursday, the week-numbering year is always equal to the usual
    * calendar year. For other days, the number is such that every day within a
    * complete week (Monday to Sunday) is contained within the same
    * week-numbering year.
    *
    * For Monday, Tuesday and Wednesday occurring near the end of the year, this
    * may mean that the week-numbering year is one greater than the calendar
    * year (so that these days have the same week-numbering year as the Thursday
    * occurring early in the next year).
    *
    * For Friday, Saturday and Sunday occurring near the start of the year, this
    * may mean that the week-numbering year is one less than the calendar year
    * (so that these days have the same week-numbering year as the Thursday
    * occurring late in the previous year).
    *
    * An equivalent description is that the week-numbering year is equal to the
    * calendar year containing the majority of the days in the current week
    * (Monday to Sunday).
    *
    * Note that January 1 0001 in the proleptic Gregorian calendar is a Monday,
    * so this function never returns 0.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getWeekNumberingYear(): Int /* None */ =
    g_date_time_get_week_numbering_year(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GDateTime]]
    ).value
  end getWeekNumberingYear

  /** Returns the ISO 8601 week number for the week containing @datetime. The
    * ISO 8601 week number is the same for every day of the week (from Moday
    * through Sunday). That can produce some unusual results (described below).
    *
    * The first week of the year is week 1. This is the week that contains the
    * first Thursday of the year. Equivalently, this is the first week that has
    * more than 4 of its days falling within the calendar year.
    *
    * The value 0 is never returned by this function. Days contained within a
    * year but occurring before the first ISO 8601 week of that year are
    * considered as being contained in the last week of the previous year.
    * Similarly, the final days of a calendar year may be considered as being
    * part of the first ISO 8601 week of the next year if 4 or more days of that
    * week are contained within the new year.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getWeekOfYear(): Int /* None */ =
    g_date_time_get_week_of_year(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GDateTime]]
    ).value
  end getWeekOfYear

  /** Retrieves the year represented by @datetime in the Gregorian calendar.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getYear(): Int /* None */ =
    g_date_time_get_year(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GDateTime]]
    ).value
  end getYear

  /** Retrieves the Gregorian day, month, and year of a given #GDateTime.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_ymd]: Method get_ymd contains an OUT parameter, which is not supported yet"
  )
  private def getYmd__ = ???

  /** Hashes @datetime into a #guint, suitable for use within #GHashTable.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def hash(): UInt /* None */ =
    g_date_time_hash(
      this.getUnsafeRawPointer().asInstanceOf[gconstpointer]
    ).value
  end hash

  /** Determines if daylight savings time is in effect at the time and in the
    * time zone of @datetime.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isDaylightSavings(): Boolean /* None */ =
    g_date_time_is_daylight_savings(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GDateTime]]
    ).value.!=(0)
  end isDaylightSavings

  /** Atomically increments the reference count of @datetime by one.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def ref(): sn.gnome.glib.DateTime /* None */ =
    sn.gnome.glib.DateTime.fromRaw(
      g_date_time_ref(this.getUnsafeRawPointer().asInstanceOf[Ptr[GDateTime]])
    )
  end ref

  /** Creates a new #GDateTime corresponding to the same instant in time as
    * @datetime,
    *   but in the local time zone.
    *
    * This call is equivalent to calling g_date_time_to_timezone() with the time
    * zone returned by g_time_zone_new_local().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def toLocal(): sn.gnome.glib.DateTime /* None */ =
    sn.gnome.glib.DateTime.fromRaw(
      g_date_time_to_local(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GDateTime]]
      )
    )
  end toLocal

  /** Stores the instant in time that @datetime represents into @tv.
    *
    * The time contained in a #GTimeVal is always stored in the form of seconds
    * elapsed since 1970-01-01 00:00:00 UTC, regardless of the time zone
    * associated with @datetime.
    *
    * On systems where 'long' is 32bit (ie: all 32bit systems and all Windows
    * systems), a #GTimeVal is incapable of storing the entire range of values
    * that #GDateTime is capable of expressing. On those systems, this function
    * returns %FALSE to indicate that the time is out of range.
    *
    * On systems where 'long' is 64bit, this function never fails.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def toTimeval(
      tv: sn.gnome.glib.TimeVal /* Some(Ptr[GTimeVal]) */
  ): Boolean /* None */ =
    g_date_time_to_timeval(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GDateTime]],
      tv.getUnsafeRawPointer().asInstanceOf
    ).value.!=(0)
  end toTimeval

  /** Create a new #GDateTime corresponding to the same instant in time as
    * @datetime,
    *   but in the time zone @tz.
    *
    * This call can fail in the case that the time goes out of bounds. For
    * example, converting 0001-01-01 00:00:00 UTC to a time zone west of
    * Greenwich will fail (due to the year 0 being out of range).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def toTimezone(
      tz: sn.gnome.glib.TimeZone /* Some(Ptr[GTimeZone]) */
  ): sn.gnome.glib.DateTime /* None */ =
    sn.gnome.glib.DateTime.fromRaw(
      g_date_time_to_timezone(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GDateTime]],
        tz.getUnsafeRawPointer().asInstanceOf
      )
    )
  end toTimezone

  /** Gives the Unix time corresponding to @datetime, rounding down to the
    * nearest second.
    *
    * Unix time is the number of seconds that have elapsed since 1970-01-01
    * 00:00:00 UTC, regardless of the time zone associated with @datetime.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def toUnix(): CLongInt /* None */ =
    g_date_time_to_unix(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GDateTime]]
    ).value
  end toUnix

  /** Creates a new #GDateTime corresponding to the same instant in time as
    * @datetime,
    *   but in UTC.
    *
    * This call is equivalent to calling g_date_time_to_timezone() with the time
    * zone returned by g_time_zone_new_utc().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def toUtc(): sn.gnome.glib.DateTime /* None */ =
    sn.gnome.glib.DateTime.fromRaw(
      g_date_time_to_utc(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GDateTime]]
      )
    )
  end toUtc

  /** Atomically decrements the reference count of @datetime by one.
    *
    * When the reference count reaches zero, the resources allocated by
    * @datetime
    *   are freed
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unref(): Unit /* None */ =
    g_date_time_unref(this.getUnsafeRawPointer().asInstanceOf[Ptr[GDateTime]])
  end unref

end DateTime

object DateTime:
  def fromRaw(ptr: Ptr[GDateTime]): DateTime = new DateTime(ptr)
end DateTime
