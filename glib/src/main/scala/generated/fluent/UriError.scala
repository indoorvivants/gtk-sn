package sn.gnome.glib.fluent

import _root_.sn.gnome.glib.internal.GUriError

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Error codes returned by #GUri methods.
  */
enum UriError(val raw: GUriError):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Generic error if no more specific error is available. See the error
    * message for details.
    */
  case FAILED extends UriError(GUriError.G_URI_ERROR_FAILED)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The scheme of a URI could not be parsed.
    */
  case BAD_SCHEME extends UriError(GUriError.G_URI_ERROR_BAD_SCHEME)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The user/userinfo of a URI could not be parsed.
    */
  case BAD_USER extends UriError(GUriError.G_URI_ERROR_BAD_USER)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The password of a URI could not be parsed.
    */
  case BAD_PASSWORD extends UriError(GUriError.G_URI_ERROR_BAD_PASSWORD)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The authentication parameters of a URI could not be parsed.
    */
  case BAD_AUTH_PARAMS extends UriError(GUriError.G_URI_ERROR_BAD_AUTH_PARAMS)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The host of a URI could not be parsed.
    */
  case BAD_HOST extends UriError(GUriError.G_URI_ERROR_BAD_HOST)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The port of a URI could not be parsed.
    */
  case BAD_PORT extends UriError(GUriError.G_URI_ERROR_BAD_PORT)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The path of a URI could not be parsed.
    */
  case BAD_PATH extends UriError(GUriError.G_URI_ERROR_BAD_PATH)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The query of a URI could not be parsed.
    */
  case BAD_QUERY extends UriError(GUriError.G_URI_ERROR_BAD_QUERY)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The fragment of a URI could not be parsed.
    */
  case BAD_FRAGMENT extends UriError(GUriError.G_URI_ERROR_BAD_FRAGMENT)
end UriError

object UriError:
  def fromRaw(raw: GUriError): UriError =
    raw match
      case GUriError.G_URI_ERROR_FAILED          => UriError.FAILED
      case GUriError.G_URI_ERROR_BAD_SCHEME      => UriError.BAD_SCHEME
      case GUriError.G_URI_ERROR_BAD_USER        => UriError.BAD_USER
      case GUriError.G_URI_ERROR_BAD_PASSWORD    => UriError.BAD_PASSWORD
      case GUriError.G_URI_ERROR_BAD_AUTH_PARAMS => UriError.BAD_AUTH_PARAMS
      case GUriError.G_URI_ERROR_BAD_HOST        => UriError.BAD_HOST
      case GUriError.G_URI_ERROR_BAD_PORT        => UriError.BAD_PORT
      case GUriError.G_URI_ERROR_BAD_PATH        => UriError.BAD_PATH
      case GUriError.G_URI_ERROR_BAD_QUERY       => UriError.BAD_QUERY
      case GUriError.G_URI_ERROR_BAD_FRAGMENT    => UriError.BAD_FRAGMENT
  end fromRaw
end UriError
