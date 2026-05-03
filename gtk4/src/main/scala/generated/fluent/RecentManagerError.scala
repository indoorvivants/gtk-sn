package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkRecentManagerError

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Error codes for `GtkRecentManager` operations
  */
enum RecentManagerError(val raw: GtkRecentManagerError):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the URI specified does not exists in the recently used resources list.
    */
  case NOT_FOUND
      extends RecentManagerError(
        GtkRecentManagerError.GTK_RECENT_MANAGER_ERROR_NOT_FOUND
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the URI specified is not valid.
    */
  case INVALID_URI
      extends RecentManagerError(
        GtkRecentManagerError.GTK_RECENT_MANAGER_ERROR_INVALID_URI
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the supplied string is not UTF-8 encoded.
    */
  case INVALID_ENCODING
      extends RecentManagerError(
        GtkRecentManagerError.GTK_RECENT_MANAGER_ERROR_INVALID_ENCODING
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * no application has registered the specified item.
    */
  case NOT_REGISTERED
      extends RecentManagerError(
        GtkRecentManagerError.GTK_RECENT_MANAGER_ERROR_NOT_REGISTERED
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * failure while reading the recently used resources file.
    */
  case READ
      extends RecentManagerError(
        GtkRecentManagerError.GTK_RECENT_MANAGER_ERROR_READ
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * failure while writing the recently used resources file.
    */
  case WRITE
      extends RecentManagerError(
        GtkRecentManagerError.GTK_RECENT_MANAGER_ERROR_WRITE
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * unspecified error.
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
