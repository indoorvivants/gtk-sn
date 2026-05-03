package sn.gnome.glib.fluent

import _root_.sn.gnome.glib.internal.GTimeType

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Disambiguates a given time in two ways.
  *
  * First, specifies if the given time is in universal or local time.
  *
  * Second, if the time is in local time, specifies if it is local standard time
  * or local daylight time. This is important for the case where the same local
  * time occurs twice (during daylight savings time transitions, for example).
  */
enum TimeType(val raw: GTimeType):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the time is in local standard time
    */
  case STANDARD extends TimeType(GTimeType.G_TIME_TYPE_STANDARD)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the time is in local daylight time
    */
  case DAYLIGHT extends TimeType(GTimeType.G_TIME_TYPE_DAYLIGHT)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the time is in UTC
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
