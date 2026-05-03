package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkRecentManagerError: _RECENT_MANAGER_ERROR_NOT_FOUND: the URI specified does not exists in the recently used resources list. _RECENT_MANAGER_ERROR_INVALID_URI: the URI specified is not valid. _RECENT_MANAGER_ERROR_INVALID_ENCODING: the supplied string is not UTF-8 encoded. _RECENT_MANAGER_ERROR_NOT_REGISTERED: no application has registered the specified item. _RECENT_MANAGER_ERROR_READ: failure while reading the recently used resources file. _RECENT_MANAGER_ERROR_WRITE: failure while writing the recently used resources file. _RECENT_MANAGER_ERROR_UNKNOWN: unspecified error.
*/
opaque type GtkRecentManagerError = CUnsignedInt
object GtkRecentManagerError extends _BindgenEnumCUnsignedInt[GtkRecentManagerError]:
  given _tag: Tag[GtkRecentManagerError] = Tag.UInt
  inline def define(inline a: Long): GtkRecentManagerError = a.toUInt
  val GTK_RECENT_MANAGER_ERROR_NOT_FOUND = define(0)
  val GTK_RECENT_MANAGER_ERROR_INVALID_URI = define(1)
  val GTK_RECENT_MANAGER_ERROR_INVALID_ENCODING = define(2)
  val GTK_RECENT_MANAGER_ERROR_NOT_REGISTERED = define(3)
  val GTK_RECENT_MANAGER_ERROR_READ = define(4)
  val GTK_RECENT_MANAGER_ERROR_WRITE = define(5)
  val GTK_RECENT_MANAGER_ERROR_UNKNOWN = define(6)
  def getName(value: GtkRecentManagerError): Option[String] =
    value match
      case `GTK_RECENT_MANAGER_ERROR_NOT_FOUND` => Some("GTK_RECENT_MANAGER_ERROR_NOT_FOUND")
      case `GTK_RECENT_MANAGER_ERROR_INVALID_URI` => Some("GTK_RECENT_MANAGER_ERROR_INVALID_URI")
      case `GTK_RECENT_MANAGER_ERROR_INVALID_ENCODING` => Some("GTK_RECENT_MANAGER_ERROR_INVALID_ENCODING")
      case `GTK_RECENT_MANAGER_ERROR_NOT_REGISTERED` => Some("GTK_RECENT_MANAGER_ERROR_NOT_REGISTERED")
      case `GTK_RECENT_MANAGER_ERROR_READ` => Some("GTK_RECENT_MANAGER_ERROR_READ")
      case `GTK_RECENT_MANAGER_ERROR_WRITE` => Some("GTK_RECENT_MANAGER_ERROR_WRITE")
      case `GTK_RECENT_MANAGER_ERROR_UNKNOWN` => Some("GTK_RECENT_MANAGER_ERROR_UNKNOWN")
      case _ => _root_.scala.None
  extension (a: GtkRecentManagerError)
    inline def &(b: GtkRecentManagerError): GtkRecentManagerError = a & b
    inline def |(b: GtkRecentManagerError): GtkRecentManagerError = a | b
    inline def is(b: GtkRecentManagerError): Boolean = (a & b) == b