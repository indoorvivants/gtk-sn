package girepository

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GIRepositoryError: _IREPOSITORY_ERROR_TYPELIB_NOT_FOUND: the typelib could not be found. _IREPOSITORY_ERROR_NAMESPACE_MISMATCH: the namespace does not match the requested namespace. _IREPOSITORY_ERROR_NAMESPACE_VERSION_CONFLICT: the version of the typelib does not match the requested version. _IREPOSITORY_ERROR_LIBRARY_NOT_FOUND: the library used by the typelib could not be found.
*/
opaque type GIRepositoryError = CUnsignedInt
object GIRepositoryError extends _BindgenEnumCUnsignedInt[GIRepositoryError]:
  given _tag: Tag[GIRepositoryError] = Tag.UInt
  inline def define(inline a: Long): GIRepositoryError = a.toUInt
  val G_IREPOSITORY_ERROR_TYPELIB_NOT_FOUND = define(0)
  val G_IREPOSITORY_ERROR_NAMESPACE_MISMATCH = define(1)
  val G_IREPOSITORY_ERROR_NAMESPACE_VERSION_CONFLICT = define(2)
  val G_IREPOSITORY_ERROR_LIBRARY_NOT_FOUND = define(3)
  def getName(value: GIRepositoryError): Option[String] =
    value match
      case `G_IREPOSITORY_ERROR_TYPELIB_NOT_FOUND` => Some("G_IREPOSITORY_ERROR_TYPELIB_NOT_FOUND")
      case `G_IREPOSITORY_ERROR_NAMESPACE_MISMATCH` => Some("G_IREPOSITORY_ERROR_NAMESPACE_MISMATCH")
      case `G_IREPOSITORY_ERROR_NAMESPACE_VERSION_CONFLICT` => Some("G_IREPOSITORY_ERROR_NAMESPACE_VERSION_CONFLICT")
      case `G_IREPOSITORY_ERROR_LIBRARY_NOT_FOUND` => Some("G_IREPOSITORY_ERROR_LIBRARY_NOT_FOUND")
      case _ => _root_.scala.None
  extension (a: GIRepositoryError)
    inline def &(b: GIRepositoryError): GIRepositoryError = a & b
    inline def |(b: GIRepositoryError): GIRepositoryError = a | b
    inline def is(b: GIRepositoryError): Boolean = (a & b) == b