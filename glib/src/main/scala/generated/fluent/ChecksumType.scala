package sn.gnome.glib.fluent

import _root_.sn.gnome.glib.internal.GChecksumType

/** The hashing algorithm to be used by #GChecksum when performing the digest of
  * some data.
  *
  * Note that the #GChecksumType enumeration may be extended at a later date to
  * include new hashing algorithm types.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum ChecksumType(val raw: GChecksumType):
  /** Use the MD5 hashing algorithm
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case MD5 extends ChecksumType(GChecksumType.G_CHECKSUM_MD5)

  /** Use the SHA-1 hashing algorithm
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SHA1 extends ChecksumType(GChecksumType.G_CHECKSUM_SHA1)

  /** Use the SHA-256 hashing algorithm
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SHA256 extends ChecksumType(GChecksumType.G_CHECKSUM_SHA256)

  /** Use the SHA-512 hashing algorithm (Since: 2.36)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SHA512 extends ChecksumType(GChecksumType.G_CHECKSUM_SHA512)

  /** Use the SHA-384 hashing algorithm (Since: 2.51)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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
