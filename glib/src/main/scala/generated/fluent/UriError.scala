package sn.gnome.glib

import _root_.sn.gnome.glib.internal.GUriError

/** Error codes returned by #GUri methods.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum UriError(val raw: GUriError):
  /** Generic error if no more specific error is available. See the error
    * message for details.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case FAILED extends UriError(GUriError.G_URI_ERROR_FAILED)

  /** The scheme of a URI could not be parsed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case BAD_SCHEME extends UriError(GUriError.G_URI_ERROR_BAD_SCHEME)

  /** The user/userinfo of a URI could not be parsed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case BAD_USER extends UriError(GUriError.G_URI_ERROR_BAD_USER)

  /** The password of a URI could not be parsed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case BAD_PASSWORD extends UriError(GUriError.G_URI_ERROR_BAD_PASSWORD)

  /** The authentication parameters of a URI could not be parsed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case BAD_AUTH_PARAMS extends UriError(GUriError.G_URI_ERROR_BAD_AUTH_PARAMS)

  /** The host of a URI could not be parsed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case BAD_HOST extends UriError(GUriError.G_URI_ERROR_BAD_HOST)

  /** The port of a URI could not be parsed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case BAD_PORT extends UriError(GUriError.G_URI_ERROR_BAD_PORT)

  /** The path of a URI could not be parsed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case BAD_PATH extends UriError(GUriError.G_URI_ERROR_BAD_PATH)

  /** The query of a URI could not be parsed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case BAD_QUERY extends UriError(GUriError.G_URI_ERROR_BAD_QUERY)

  /** The fragment of a URI could not be parsed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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
