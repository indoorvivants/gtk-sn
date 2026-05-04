package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.GResolverError

/** An error code used with %G_RESOLVER_ERROR in a #GError returned from a
  * #GResolver routine.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum ResolverError(val raw: GResolverError):
  /** the requested name/address/service was not found
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NOT_FOUND
      extends ResolverError(GResolverError.G_RESOLVER_ERROR_NOT_FOUND)

  /** the requested information could not be looked up due to a network error or
    * similar problem
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case TEMPORARY_FAILURE
      extends ResolverError(GResolverError.G_RESOLVER_ERROR_TEMPORARY_FAILURE)

  /** unknown error
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case INTERNAL extends ResolverError(GResolverError.G_RESOLVER_ERROR_INTERNAL)
end ResolverError

object ResolverError:
  def fromRaw(raw: GResolverError): ResolverError =
    raw match
      case GResolverError.G_RESOLVER_ERROR_NOT_FOUND => ResolverError.NOT_FOUND
      case GResolverError.G_RESOLVER_ERROR_TEMPORARY_FAILURE =>
        ResolverError.TEMPORARY_FAILURE
      case GResolverError.G_RESOLVER_ERROR_INTERNAL => ResolverError.INTERNAL
  end fromRaw
end ResolverError
