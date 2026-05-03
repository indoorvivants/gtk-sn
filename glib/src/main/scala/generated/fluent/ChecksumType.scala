package sn.gnome.glib.fluent

import _root_.sn.gnome.glib.internal.GChecksumType

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * The hashing algorithm to be used by #GChecksum when performing the digest of
  * some data.
  *
  * Note that the #GChecksumType enumeration may be extended at a later date to
  * include new hashing algorithm types.
  */
enum ChecksumType(val raw: GChecksumType):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Use the MD5 hashing algorithm
    */
  case MD5 extends ChecksumType(GChecksumType.G_CHECKSUM_MD5)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Use the SHA-1 hashing algorithm
    */
  case SHA1 extends ChecksumType(GChecksumType.G_CHECKSUM_SHA1)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Use the SHA-256 hashing algorithm
    */
  case SHA256 extends ChecksumType(GChecksumType.G_CHECKSUM_SHA256)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Use the SHA-512 hashing algorithm (Since: 2.36)
    */
  case SHA512 extends ChecksumType(GChecksumType.G_CHECKSUM_SHA512)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Use the SHA-384 hashing algorithm (Since: 2.51)
    */
  case SHA384 extends ChecksumType(GChecksumType.G_CHECKSUM_SHA384)
end ChecksumType

object ChecksumType:
  def fromRaw(raw: GChecksumType): ChecksumType =
    raw match
      case GChecksumType.G_CHECKSUM_MD5    => ChecksumType.MD5
      case GChecksumType.G_CHECKSUM_SHA1   => ChecksumType.SHA1
      case GChecksumType.G_CHECKSUM_SHA256 => ChecksumType.SHA256
      case GChecksumType.G_CHECKSUM_SHA512 => ChecksumType.SHA512
      case GChecksumType.G_CHECKSUM_SHA384 => ChecksumType.SHA384
  end fromRaw
end ChecksumType
