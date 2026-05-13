package sn.gnome.glib

import _root_.sn.gnome.glib.internal.GDateWeekday

/** Enumeration representing a day of the week; %G_DATE_MONDAY, %G_DATE_TUESDAY,
  * etc. %G_DATE_BAD_WEEKDAY is an invalid weekday.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum DateWeekday(val raw: GDateWeekday):
  /** invalid value
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case BAD_WEEKDAY extends DateWeekday(GDateWeekday.G_DATE_BAD_WEEKDAY)

  /** Monday
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case MONDAY extends DateWeekday(GDateWeekday.G_DATE_MONDAY)

  /** Tuesday
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case TUESDAY extends DateWeekday(GDateWeekday.G_DATE_TUESDAY)

  /** Wednesday
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case WEDNESDAY extends DateWeekday(GDateWeekday.G_DATE_WEDNESDAY)

  /** Thursday
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case THURSDAY extends DateWeekday(GDateWeekday.G_DATE_THURSDAY)

  /** Friday
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case FRIDAY extends DateWeekday(GDateWeekday.G_DATE_FRIDAY)

  /** Saturday
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SATURDAY extends DateWeekday(GDateWeekday.G_DATE_SATURDAY)

  /** Sunday
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SUNDAY extends DateWeekday(GDateWeekday.G_DATE_SUNDAY)
end DateWeekday

object DateWeekday:
  def fromRaw(raw: GDateWeekday): DateWeekday =
    raw match
      case GDateWeekday.G_DATE_BAD_WEEKDAY => DateWeekday.BAD_WEEKDAY
      case GDateWeekday.G_DATE_MONDAY      => DateWeekday.MONDAY
      case GDateWeekday.G_DATE_TUESDAY     => DateWeekday.TUESDAY
      case GDateWeekday.G_DATE_WEDNESDAY   => DateWeekday.WEDNESDAY
      case GDateWeekday.G_DATE_THURSDAY    => DateWeekday.THURSDAY
      case GDateWeekday.G_DATE_FRIDAY      => DateWeekday.FRIDAY
      case GDateWeekday.G_DATE_SATURDAY    => DateWeekday.SATURDAY
      case GDateWeekday.G_DATE_SUNDAY      => DateWeekday.SUNDAY
  end fromRaw
end DateWeekday
