package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.GResourceError

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * An error code used with %G_RESOURCE_ERROR in a #GError returned from a
  * #GResource routine.
  */
enum ResourceError(val raw: GResourceError):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * no file was found at the requested path
    */
  case NOT_FOUND
      extends ResourceError(GResourceError.G_RESOURCE_ERROR_NOT_FOUND)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * unknown error
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
