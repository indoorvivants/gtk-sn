package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.GResolverError

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * An error code used with %G_RESOLVER_ERROR in a #GError returned from a
  * #GResolver routine.
  */
enum ResolverError(val raw: GResolverError):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the requested name/address/service was not found
    */
  case NOT_FOUND
      extends ResolverError(GResolverError.G_RESOLVER_ERROR_NOT_FOUND)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the requested information could not be looked up due to a network error or
    * similar problem
    */
  case TEMPORARY_FAILURE
      extends ResolverError(GResolverError.G_RESOLVER_ERROR_TEMPORARY_FAILURE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * unknown error
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
