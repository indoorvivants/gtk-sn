package sn.gnome.glib.fluent

import _root_.sn.gnome.glib.internal.GDateMonth

/** Enumeration representing a month; values are %G_DATE_JANUARY,
  * %G_DATE_FEBRUARY, etc. %G_DATE_BAD_MONTH is the invalid value.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum DateMonth(val raw: GDateMonth):
  /** invalid value
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case BAD_MONTH extends DateMonth(GDateMonth.G_DATE_BAD_MONTH)

  /** January
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case JANUARY extends DateMonth(GDateMonth.G_DATE_JANUARY)

  /** February
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case FEBRUARY extends DateMonth(GDateMonth.G_DATE_FEBRUARY)

  /** March
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case MARCH extends DateMonth(GDateMonth.G_DATE_MARCH)

  /** April
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case APRIL extends DateMonth(GDateMonth.G_DATE_APRIL)

  /** May
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case MAY extends DateMonth(GDateMonth.G_DATE_MAY)

  /** June
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case JUNE extends DateMonth(GDateMonth.G_DATE_JUNE)

  /** July
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case JULY extends DateMonth(GDateMonth.G_DATE_JULY)

  /** August
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case AUGUST extends DateMonth(GDateMonth.G_DATE_AUGUST)

  /** September
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SEPTEMBER extends DateMonth(GDateMonth.G_DATE_SEPTEMBER)

  /** October
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case OCTOBER extends DateMonth(GDateMonth.G_DATE_OCTOBER)

  /** November
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NOVEMBER extends DateMonth(GDateMonth.G_DATE_NOVEMBER)

  /** December
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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
