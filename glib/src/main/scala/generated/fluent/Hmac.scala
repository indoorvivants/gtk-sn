package sn.gnome.glib

import _root_.sn.gnome.glib.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.Hmac
import sn.gnome.glib.internal.{GHmac, gchar}

/** An opaque structure representing a HMAC operation. To create a new GHmac,
  * use g_hmac_new(). To free a GHmac, use g_hmac_unref().
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class Hmac private[gnome] (raw: Ptr[GHmac]):

  def getUnsafeRawPointer(): Ptr[GHmac] = this.raw

  /** Copies a #GHmac. If @hmac has been closed, by calling g_hmac_get_string()
    * or g_hmac_get_digest(), the copied HMAC will be closed as well.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def copy(): sn.gnome.glib.Hmac /* None */ =
    sn.gnome.glib.Hmac
      .fromRaw(g_hmac_copy(this.getUnsafeRawPointer().asInstanceOf[Ptr[GHmac]]))
  end copy

  /** Gets the digest from @checksum as a raw binary array and places it into @buffer.
    * The size of the digest depends on the type of checksum.
    *
    * Once this function has been called, the #GHmac is closed and can no longer
    * be updated with g_checksum_update().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_digest]: Method get_digest contains an INOUT parameter, which is not supported yet"
  )
  private def getDigest__ = ???

  /** Gets the HMAC as a hexadecimal string.
    *
    * Once this function has been called the #GHmac can no longer be updated
    * with g_hmac_update().
    *
    * The hexadecimal characters will be lower case.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getString(): scala.Predef.String /* None */ =
    fromCString(
      g_hmac_get_string(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GHmac]]
      ).asInstanceOf
    )
  end getString

  /** Atomically increments the reference count of @hmac by one.
    *
    * This function is MT-safe and may be called from any thread.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def ref(): sn.gnome.glib.Hmac /* None */ =
    sn.gnome.glib.Hmac
      .fromRaw(g_hmac_ref(this.getUnsafeRawPointer().asInstanceOf[Ptr[GHmac]]))
  end ref

  /** Atomically decrements the reference count of @hmac by one.
    *
    * If the reference count drops to 0, all keys and values will be destroyed,
    * and all memory allocated by the hash table is released. This function is
    * MT-safe and may be called from any thread. Frees the memory allocated for @hmac.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unref(): Unit /* None */ =
    g_hmac_unref(this.getUnsafeRawPointer().asInstanceOf[Ptr[GHmac]])
  end unref

  /** Feeds @data into an existing #GHmac.
    *
    * The HMAC must still be open, that is g_hmac_get_string() or
    * g_hmac_get_digest() must not have been called on @hmac.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method update/<method parameters>/data]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(guint8), @type -> DataRecord(guchar)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(1), @type -> DataRecord(const guchar*)))"
  )
  private def update__ = ???

end Hmac

object Hmac:
  def fromRaw(ptr: Ptr[GHmac]): Hmac = new Hmac(ptr)
end Hmac
