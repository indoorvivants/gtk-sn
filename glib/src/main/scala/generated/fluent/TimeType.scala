package sn.gnome.glib

import _root_.sn.gnome.glib.internal.GTimeType

/** Disambiguates a given time in two ways.
  *
  * First, specifies if the given time is in universal or local time.
  *
  * Second, if the time is in local time, specifies if it is local standard time
  * or local daylight time. This is important for the case where the same local
  * time occurs twice (during daylight savings time transitions, for example).
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum TimeType(val raw: GTimeType):
  /** the time is in local standard time
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case STANDARD extends TimeType(GTimeType.G_TIME_TYPE_STANDARD)

  /** the time is in local daylight time
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case DAYLIGHT extends TimeType(GTimeType.G_TIME_TYPE_DAYLIGHT)

  /** the time is in UTC
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case UNIVERSAL extends TimeType(GTimeType.G_TIME_TYPE_UNIVERSAL)
end TimeType

object TimeType:
  def fromRaw(raw: GTimeType): TimeType =
    raw match
      case GTimeType.G_TIME_TYPE_STANDARD  => TimeType.STANDARD
      case GTimeType.G_TIME_TYPE_DAYLIGHT  => TimeType.DAYLIGHT
      case GTimeType.G_TIME_TYPE_UNIVERSAL => TimeType.UNIVERSAL
  end fromRaw
end TimeType
