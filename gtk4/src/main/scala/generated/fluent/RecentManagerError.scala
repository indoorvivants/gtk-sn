package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.GtkRecentManagerError

/** Error codes for `GtkRecentManager` operations
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum RecentManagerError(val raw: GtkRecentManagerError):
  /** the URI specified does not exists in the recently used resources list.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NOT_FOUND
      extends RecentManagerError(
        GtkRecentManagerError.GTK_RECENT_MANAGER_ERROR_NOT_FOUND
      )

  /** the URI specified is not valid.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case INVALID_URI
      extends RecentManagerError(
        GtkRecentManagerError.GTK_RECENT_MANAGER_ERROR_INVALID_URI
      )

  /** the supplied string is not UTF-8 encoded.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case INVALID_ENCODING
      extends RecentManagerError(
        GtkRecentManagerError.GTK_RECENT_MANAGER_ERROR_INVALID_ENCODING
      )

  /** no application has registered the specified item.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NOT_REGISTERED
      extends RecentManagerError(
        GtkRecentManagerError.GTK_RECENT_MANAGER_ERROR_NOT_REGISTERED
      )

  /** failure while reading the recently used resources file.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case READ
      extends RecentManagerError(
        GtkRecentManagerError.GTK_RECENT_MANAGER_ERROR_READ
      )

  /** failure while writing the recently used resources file.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case WRITE
      extends RecentManagerError(
        GtkRecentManagerError.GTK_RECENT_MANAGER_ERROR_WRITE
      )

  /** unspecified error.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case UNKNOWN
      extends RecentManagerError(
        GtkRecentManagerError.GTK_RECENT_MANAGER_ERROR_UNKNOWN
      )
end RecentManagerError

object RecentManagerError:
  def fromRaw(raw: GtkRecentManagerError): RecentManagerError =
    raw match
      case GtkRecentManagerError.GTK_RECENT_MANAGER_ERROR_NOT_FOUND =>
        RecentManagerError.NOT_FOUND
      case GtkRecentManagerError.GTK_RECENT_MANAGER_ERROR_INVALID_URI =>
        RecentManagerError.INVALID_URI
      case GtkRecentManagerError.GTK_RECENT_MANAGER_ERROR_INVALID_ENCODING =>
        RecentManagerError.INVALID_ENCODING
      case GtkRecentManagerError.GTK_RECENT_MANAGER_ERROR_NOT_REGISTERED =>
        RecentManagerError.NOT_REGISTERED
      case GtkRecentManagerError.GTK_RECENT_MANAGER_ERROR_READ =>
        RecentManagerError.READ
      case GtkRecentManagerError.GTK_RECENT_MANAGER_ERROR_WRITE =>
        RecentManagerError.WRITE
      case GtkRecentManagerError.GTK_RECENT_MANAGER_ERROR_UNKNOWN =>
        RecentManagerError.UNKNOWN
  end fromRaw
end RecentManagerError
