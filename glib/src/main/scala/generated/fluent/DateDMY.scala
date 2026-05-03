package sn.gnome.glib.fluent

import _root_.sn.gnome.glib.internal.GDateDMY

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * This enumeration isn't used in the API, but may be useful if you need to
  * mark a number as a day, month, or year.
  */
enum DateDMY(val raw: GDateDMY):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * a day
    */
  case DAY extends DateDMY(GDateDMY.G_DATE_DAY)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * a month
    */
  case MONTH extends DateDMY(GDateDMY.G_DATE_MONTH)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * a year
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
