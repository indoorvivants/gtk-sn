package sn.gnome.glib

import _root_.sn.gnome.glib.internal.GDateDMY

/** This enumeration isn't used in the API, but may be useful if you need to
  * mark a number as a day, month, or year.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum DateDMY(val raw: GDateDMY):
  /** a day
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case DAY extends DateDMY(GDateDMY.G_DATE_DAY)

  /** a month
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case MONTH extends DateDMY(GDateDMY.G_DATE_MONTH)

  /** a year
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case YEAR extends DateDMY(GDateDMY.G_DATE_YEAR)
end DateDMY

object DateDMY:
  def fromRaw(raw: GDateDMY): DateDMY =
    raw match
      case GDateDMY.G_DATE_DAY   => DateDMY.DAY
      case GDateDMY.G_DATE_MONTH => DateDMY.MONTH
      case GDateDMY.G_DATE_YEAR  => DateDMY.YEAR
  end fromRaw
end DateDMY
