package sn.gnome.gio

import _root_.sn.gnome.gio.internal.GResourceError

/** An error code used with %G_RESOURCE_ERROR in a #GError returned from a
  * #GResource routine.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum ResourceError(val raw: GResourceError):
  /** no file was found at the requested path
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NOT_FOUND
      extends ResourceError(GResourceError.G_RESOURCE_ERROR_NOT_FOUND)

  /** unknown error
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case INTERNAL extends ResourceError(GResourceError.G_RESOURCE_ERROR_INTERNAL)
end ResourceError

object ResourceError:
  def fromRaw(raw: GResourceError): ResourceError =
    raw match
      case GResourceError.G_RESOURCE_ERROR_NOT_FOUND => ResourceError.NOT_FOUND
      case GResourceError.G_RESOURCE_ERROR_INTERNAL  => ResourceError.INTERNAL
  end fromRaw
end ResourceError
