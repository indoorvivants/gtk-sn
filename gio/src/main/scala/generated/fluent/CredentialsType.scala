package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.GCredentialsType

/** Enumeration describing different kinds of native credential types.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum CredentialsType(val raw: GCredentialsType):
  /** Indicates an invalid native credential type.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case INVALID
      extends CredentialsType(GCredentialsType.G_CREDENTIALS_TYPE_INVALID)

  /** The native credentials type is a `struct ucred`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case LINUX_UCRED
      extends CredentialsType(GCredentialsType.G_CREDENTIALS_TYPE_LINUX_UCRED)

  /** The native credentials type is a `struct cmsgcred`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case FREEBSD_CMSGCRED
      extends CredentialsType(
        GCredentialsType.G_CREDENTIALS_TYPE_FREEBSD_CMSGCRED
      )

  /** The native credentials type is a `struct sockpeercred`. Added in 2.30.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case OPENBSD_SOCKPEERCRED
      extends CredentialsType(
        GCredentialsType.G_CREDENTIALS_TYPE_OPENBSD_SOCKPEERCRED
      )

  /** The native credentials type is a `ucred_t`. Added in 2.40.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SOLARIS_UCRED
      extends CredentialsType(GCredentialsType.G_CREDENTIALS_TYPE_SOLARIS_UCRED)

  /** The native credentials type is a `struct unpcbid`. Added in 2.42.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NETBSD_UNPCBID
      extends CredentialsType(
        GCredentialsType.G_CREDENTIALS_TYPE_NETBSD_UNPCBID
      )

  /** The native credentials type is a `struct xucred`. Added in 2.66.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case APPLE_XUCRED
      extends CredentialsType(GCredentialsType.G_CREDENTIALS_TYPE_APPLE_XUCRED)

  /** The native credentials type is a PID `DWORD`. Added in 2.72.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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
