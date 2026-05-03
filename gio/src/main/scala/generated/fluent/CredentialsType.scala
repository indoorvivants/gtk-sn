package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.GCredentialsType

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Enumeration describing different kinds of native credential types.
  */
enum CredentialsType(val raw: GCredentialsType):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Indicates an invalid native credential type.
    */
  case INVALID
      extends CredentialsType(GCredentialsType.G_CREDENTIALS_TYPE_INVALID)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The native credentials type is a `struct ucred`.
    */
  case LINUX_UCRED
      extends CredentialsType(GCredentialsType.G_CREDENTIALS_TYPE_LINUX_UCRED)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The native credentials type is a `struct cmsgcred`.
    */
  case FREEBSD_CMSGCRED
      extends CredentialsType(
        GCredentialsType.G_CREDENTIALS_TYPE_FREEBSD_CMSGCRED
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The native credentials type is a `struct sockpeercred`. Added in 2.30.
    */
  case OPENBSD_SOCKPEERCRED
      extends CredentialsType(
        GCredentialsType.G_CREDENTIALS_TYPE_OPENBSD_SOCKPEERCRED
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The native credentials type is a `ucred_t`. Added in 2.40.
    */
  case SOLARIS_UCRED
      extends CredentialsType(GCredentialsType.G_CREDENTIALS_TYPE_SOLARIS_UCRED)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The native credentials type is a `struct unpcbid`. Added in 2.42.
    */
  case NETBSD_UNPCBID
      extends CredentialsType(
        GCredentialsType.G_CREDENTIALS_TYPE_NETBSD_UNPCBID
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The native credentials type is a `struct xucred`. Added in 2.66.
    */
  case APPLE_XUCRED
      extends CredentialsType(GCredentialsType.G_CREDENTIALS_TYPE_APPLE_XUCRED)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The native credentials type is a PID `DWORD`. Added in 2.72.
    */
  case WIN32_PID
      extends CredentialsType(GCredentialsType.G_CREDENTIALS_TYPE_WIN32_PID)
end CredentialsType

object CredentialsType:
  def fromRaw(raw: GCredentialsType): CredentialsType =
    raw match
      case GCredentialsType.G_CREDENTIALS_TYPE_INVALID =>
        CredentialsType.INVALID
      case GCredentialsType.G_CREDENTIALS_TYPE_LINUX_UCRED =>
        CredentialsType.LINUX_UCRED
      case GCredentialsType.G_CREDENTIALS_TYPE_FREEBSD_CMSGCRED =>
        CredentialsType.FREEBSD_CMSGCRED
      case GCredentialsType.G_CREDENTIALS_TYPE_OPENBSD_SOCKPEERCRED =>
        CredentialsType.OPENBSD_SOCKPEERCRED
      case GCredentialsType.G_CREDENTIALS_TYPE_SOLARIS_UCRED =>
        CredentialsType.SOLARIS_UCRED
      case GCredentialsType.G_CREDENTIALS_TYPE_NETBSD_UNPCBID =>
        CredentialsType.NETBSD_UNPCBID
      case GCredentialsType.G_CREDENTIALS_TYPE_APPLE_XUCRED =>
        CredentialsType.APPLE_XUCRED
      case GCredentialsType.G_CREDENTIALS_TYPE_WIN32_PID =>
        CredentialsType.WIN32_PID
  end fromRaw
end CredentialsType
