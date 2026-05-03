package sn.gnome.glib.fluent

import _root_.sn.gnome.glib.internal.GDateMonth

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Enumeration representing a month; values are %G_DATE_JANUARY,
  * %G_DATE_FEBRUARY, etc. %G_DATE_BAD_MONTH is the invalid value.
  */
enum DateMonth(val raw: GDateMonth):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * invalid value
    */
  case BAD_MONTH extends DateMonth(GDateMonth.G_DATE_BAD_MONTH)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * January
    */
  case JANUARY extends DateMonth(GDateMonth.G_DATE_JANUARY)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * February
    */
  case FEBRUARY extends DateMonth(GDateMonth.G_DATE_FEBRUARY)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * March
    */
  case MARCH extends DateMonth(GDateMonth.G_DATE_MARCH)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * April
    */
  case APRIL extends DateMonth(GDateMonth.G_DATE_APRIL)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * May
    */
  case MAY extends DateMonth(GDateMonth.G_DATE_MAY)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * June
    */
  case JUNE extends DateMonth(GDateMonth.G_DATE_JUNE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * July
    */
  case JULY extends DateMonth(GDateMonth.G_DATE_JULY)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * August
    */
  case AUGUST extends DateMonth(GDateMonth.G_DATE_AUGUST)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * September
    */
  case SEPTEMBER extends DateMonth(GDateMonth.G_DATE_SEPTEMBER)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * October
    */
  case OCTOBER extends DateMonth(GDateMonth.G_DATE_OCTOBER)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * November
    */
  case NOVEMBER extends DateMonth(GDateMonth.G_DATE_NOVEMBER)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * December
    */
  case DECEMBER extends DateMonth(GDateMonth.G_DATE_DECEMBER)
end DateMonth

object DateMonth:
  def fromRaw(raw: GDateMonth): DateMonth =
    raw match
      case GDateMonth.G_DATE_BAD_MONTH => DateMonth.BAD_MONTH
      case GDateMonth.G_DATE_JANUARY   => DateMonth.JANUARY
      case GDateMonth.G_DATE_FEBRUARY  => DateMonth.FEBRUARY
      case GDateMonth.G_DATE_MARCH     => DateMonth.MARCH
      case GDateMonth.G_DATE_APRIL     => DateMonth.APRIL
      case GDateMonth.G_DATE_MAY       => DateMonth.MAY
      case GDateMonth.G_DATE_JUNE      => DateMonth.JUNE
      case GDateMonth.G_DATE_JULY      => DateMonth.JULY
      case GDateMonth.G_DATE_AUGUST    => DateMonth.AUGUST
      case GDateMonth.G_DATE_SEPTEMBER => DateMonth.SEPTEMBER
      case GDateMonth.G_DATE_OCTOBER   => DateMonth.OCTOBER
      case GDateMonth.G_DATE_NOVEMBER  => DateMonth.NOVEMBER
      case GDateMonth.G_DATE_DECEMBER  => DateMonth.DECEMBER
  end fromRaw
end DateMonth
