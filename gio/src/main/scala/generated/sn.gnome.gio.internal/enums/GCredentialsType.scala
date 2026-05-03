package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GCredentialsType: _CREDENTIALS_TYPE_INVALID: Indicates an invalid native credential type. _CREDENTIALS_TYPE_LINUX_UCRED: The native credentials type is a `struct ucred`. _CREDENTIALS_TYPE_FREEBSD_CMSGCRED: The native credentials type is a `struct cmsgcred`. _CREDENTIALS_TYPE_OPENBSD_SOCKPEERCRED: The native credentials type is a `struct sockpeercred`. Added in 2.30. _CREDENTIALS_TYPE_SOLARIS_UCRED: The native credentials type is a `ucred_t`. Added in 2.40. _CREDENTIALS_TYPE_NETBSD_UNPCBID: The native credentials type is a `struct unpcbid`. Added in 2.42. _CREDENTIALS_TYPE_APPLE_XUCRED: The native credentials type is a `struct xucred`. Added in 2.66. _CREDENTIALS_TYPE_WIN32_PID: The native credentials type is a PID `DWORD`. Added in 2.72.
*/
opaque type GCredentialsType = CUnsignedInt
object GCredentialsType extends _BindgenEnumCUnsignedInt[GCredentialsType]:
  given _tag: Tag[GCredentialsType] = Tag.UInt
  inline def define(inline a: Long): GCredentialsType = a.toUInt
  val G_CREDENTIALS_TYPE_INVALID = define(0)
  val G_CREDENTIALS_TYPE_LINUX_UCRED = define(1)
  val G_CREDENTIALS_TYPE_FREEBSD_CMSGCRED = define(2)
  val G_CREDENTIALS_TYPE_OPENBSD_SOCKPEERCRED = define(3)
  val G_CREDENTIALS_TYPE_SOLARIS_UCRED = define(4)
  val G_CREDENTIALS_TYPE_NETBSD_UNPCBID = define(5)
  val G_CREDENTIALS_TYPE_APPLE_XUCRED = define(6)
  val G_CREDENTIALS_TYPE_WIN32_PID = define(7)
  def getName(value: GCredentialsType): Option[String] =
    value match
      case `G_CREDENTIALS_TYPE_INVALID` => Some("G_CREDENTIALS_TYPE_INVALID")
      case `G_CREDENTIALS_TYPE_LINUX_UCRED` => Some("G_CREDENTIALS_TYPE_LINUX_UCRED")
      case `G_CREDENTIALS_TYPE_FREEBSD_CMSGCRED` => Some("G_CREDENTIALS_TYPE_FREEBSD_CMSGCRED")
      case `G_CREDENTIALS_TYPE_OPENBSD_SOCKPEERCRED` => Some("G_CREDENTIALS_TYPE_OPENBSD_SOCKPEERCRED")
      case `G_CREDENTIALS_TYPE_SOLARIS_UCRED` => Some("G_CREDENTIALS_TYPE_SOLARIS_UCRED")
      case `G_CREDENTIALS_TYPE_NETBSD_UNPCBID` => Some("G_CREDENTIALS_TYPE_NETBSD_UNPCBID")
      case `G_CREDENTIALS_TYPE_APPLE_XUCRED` => Some("G_CREDENTIALS_TYPE_APPLE_XUCRED")
      case `G_CREDENTIALS_TYPE_WIN32_PID` => Some("G_CREDENTIALS_TYPE_WIN32_PID")
      case _ => _root_.scala.None
  extension (a: GCredentialsType)
    inline def &(b: GCredentialsType): GCredentialsType = a & b
    inline def |(b: GCredentialsType): GCredentialsType = a | b
    inline def is(b: GCredentialsType): Boolean = (a & b) == b