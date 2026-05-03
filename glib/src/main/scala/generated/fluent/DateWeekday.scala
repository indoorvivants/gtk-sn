package sn.gnome.glib.fluent

import _root_.sn.gnome.glib.internal.GDateWeekday

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Enumeration representing a day of the week; %G_DATE_MONDAY, %G_DATE_TUESDAY,
  * etc. %G_DATE_BAD_WEEKDAY is an invalid weekday.
  */
enum DateWeekday(val raw: GDateWeekday):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * invalid value
    */
  case BAD_WEEKDAY extends DateWeekday(GDateWeekday.G_DATE_BAD_WEEKDAY)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Monday
    */
  case MONDAY extends DateWeekday(GDateWeekday.G_DATE_MONDAY)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Tuesday
    */
  case TUESDAY extends DateWeekday(GDateWeekday.G_DATE_TUESDAY)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Wednesday
    */
  case WEDNESDAY extends DateWeekday(GDateWeekday.G_DATE_WEDNESDAY)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Thursday
    */
  case THURSDAY extends DateWeekday(GDateWeekday.G_DATE_THURSDAY)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Friday
    */
  case FRIDAY extends DateWeekday(GDateWeekday.G_DATE_FRIDAY)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Saturday
    */
  case SATURDAY extends DateWeekday(GDateWeekday.G_DATE_SATURDAY)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sunday
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
