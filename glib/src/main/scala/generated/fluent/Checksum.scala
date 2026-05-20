package sn.gnome.glib

import _root_.sn.gnome.glib.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.Checksum
import sn.gnome.glib.internal.{GChecksum, gchar}

/** An opaque structure representing a checksumming operation.
  *
  * To create a new GChecksum, use g_checksum_new(). To free a GChecksum, use
  * g_checksum_free().
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class Checksum private[gnome] (raw: Ptr[GChecksum]):

  def getUnsafeRawPointer(): Ptr[GChecksum] = this.raw

  /** Copies a #GChecksum. If @checksum has been closed, by calling
    * g_checksum_get_string() or g_checksum_get_digest(), the copied checksum
    * will be closed as well.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def copy(): sn.gnome.glib.Checksum /* None */ =
    sn.gnome.glib.Checksum.fromRaw(
      g_checksum_copy(this.getUnsafeRawPointer().asInstanceOf[Ptr[GChecksum]])
    )
  end copy

  /** Frees the memory allocated for @checksum.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def free(): Unit /* None */ =
    g_checksum_free(this.getUnsafeRawPointer().asInstanceOf[Ptr[GChecksum]])
  end free

  /** Gets the digest from @checksum as a raw binary vector and places it into @buffer.
    * The size of the digest depends on the type of checksum.
    *
    * Once this function has been called, the #GChecksum is closed and can no
    * longer be updated with g_checksum_update().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_digest]: Method get_digest contains an INOUT parameter, which is not supported yet"
  )
  private def getDigest__ = ???

  /** Gets the digest as a hexadecimal string.
    *
    * Once this function has been called the #GChecksum can no longer be updated
    * with g_checksum_update().
    *
    * The hexadecimal characters will be lower case.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getString(): scala.Predef.String /* None */ =
    fromCString(
      g_checksum_get_string(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GChecksum]]
      ).asInstanceOf
    )
  end getString

  /** Resets the state of the @checksum back to its initial state.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def reset(): Unit /* None */ =
    g_checksum_reset(this.getUnsafeRawPointer().asInstanceOf[Ptr[GChecksum]])
  end reset

  /** Feeds @data into an existing #GChecksum. The checksum must still be open,
    * that is g_checksum_get_string() or g_checksum_get_digest() must not have
    * been called on @checksum.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method update/<method parameters>/data]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(guint8)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(1), @type -> DataRecord(const guchar*)))"
  )
  private def update__ = ???

end Checksum

object Checksum:
  def fromRaw(ptr: Ptr[GChecksum]): Checksum = new Checksum(ptr)
end Checksum
