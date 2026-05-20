package sn.gnome.glib

import _root_.sn.gnome.glib.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.Bytes
import sn.gnome.glib.internal.{
  GBytes,
  gboolean,
  gconstpointer,
  gint,
  gsize,
  guint
}

/** A simple refcounted data type representing an immutable sequence of zero or
  * more bytes from an unspecified origin.
  *
  * The purpose of a #GBytes is to keep the memory region that it holds alive
  * for as long as anyone holds a reference to the bytes. When the last
  * reference count is dropped, the memory is released. Multiple unrelated
  * callers can use byte data in the #GBytes without coordinating their
  * activities, resting assured that the byte data will not change or move while
  * they hold a reference.
  *
  * A #GBytes can come from many different origins that may have different
  * procedures for freeing the memory region. Examples are memory from
  * g_malloc(), from memory slices, from a #GMappedFile or memory from other
  * allocators.
  *
  * #GBytes work well as keys in #GHashTable. Use g_bytes_equal() and
  * g_bytes_hash() as parameters to g_hash_table_new() or
  * g_hash_table_new_full(). #GBytes can also be used as keys in a #GTree by
  * passing the g_bytes_compare() function to g_tree_new().
  *
  * The data pointed to by this bytes must not be modified. For a mutable array
  * of bytes see #GByteArray. Use g_bytes_unref_to_array() to create a mutable
  * array for a #GBytes sequence. To create an immutable #GBytes from a mutable
  * #GByteArray, use the g_byte_array_free_to_bytes() function.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class Bytes private[gnome] (raw: Ptr[GBytes]):

  def getUnsafeRawPointer(): Ptr[GBytes] = this.raw

  /** Compares the two #GBytes values.
    *
    * This function can be used to sort GBytes instances in lexicographical
    * order.
    *
    * If @bytes1 and @bytes2 have different length but the shorter one is a
    * prefix of the longer one then the shorter one is considered to be less
    * than the longer one. Otherwise the first byte where both differ is used
    * for comparison. If @bytes1 has a smaller value at that position it is
    * considered less, otherwise greater than @bytes2.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def compare(
      bytes2: sn.gnome.glib.Bytes /* Some(gconstpointer) */
  ): Int /* None */ =
    g_bytes_compare(
      this.getUnsafeRawPointer().asInstanceOf[gconstpointer],
      bytes2.getUnsafeRawPointer().asInstanceOf
    ).value
  end compare

  /** Compares the two #GBytes values being pointed to and returns %TRUE if they
    * are equal.
    *
    * This function can be passed to g_hash_table_new() as the @key_equal_func
    * parameter, when using non-%NULL #GBytes pointers as keys in a #GHashTable.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def equal(
      bytes2: sn.gnome.glib.Bytes /* Some(gconstpointer) */
  ): Boolean /* None */ =
    g_bytes_equal(
      this.getUnsafeRawPointer().asInstanceOf[gconstpointer],
      bytes2.getUnsafeRawPointer().asInstanceOf
    ).value.!=(0)
  end equal

  /** Get the byte data in the #GBytes. This data should not be modified.
    *
    * This function will always return the same pointer for a given #GBytes.
    *
    * %NULL may be returned if @size is 0. This is not guaranteed, as the
    * #GBytes may represent an empty string with @data non-%NULL and @size as 0.
    * %NULL will not be returned if @size is non-zero.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_data]: Method get_data contains an OUT parameter, which is not supported yet"
  )
  private def getData__ = ???

  /** Gets a pointer to a region in @bytes.
    *
    * The region starts at @offset many bytes from the start of the data and
    * contains @n_elements many elements of @element_size size.
    *
    * @n_elements
    *   may be zero, but @element_size must always be non-zero. Ideally, @element_size
    *   is a static constant (eg: sizeof a struct).
    *
    * This function does careful bounds checking (including checking for
    * arithmetic overflows) and returns a non-%NULL pointer if the specified
    * region lies entirely within the @bytes. If the region is in some way out
    * of range, or if an overflow has occurred, then %NULL is returned.
    *
    * Note: it is possible to have a valid zero-size region. In this case, the
    * returned pointer will be equal to the base pointer of the data of
    * @bytes,
    *   plus @offset. This will be non-%NULL except for the case where @bytes
    *   itself was a zero-sized region. Since it is unlikely that you will be
    *   using this function to check for a zero-sized region in a zero-sized @bytes,
    *   %NULL effectively always means "error".
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getRegion(
      element_size: CUnsignedLongInt /* Some(gsize) */,
      offset: CUnsignedLongInt /* Some(gsize) */,
      n_elements: CUnsignedLongInt /* Some(gsize) */
  ): Ptr[Byte] /* None */ =
    g_bytes_get_region(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GBytes]],
      gsize(element_size),
      gsize(offset),
      gsize(n_elements)
    ).value
  end getRegion

  /** Get the size of the byte data in the #GBytes.
    *
    * This function will always return the same value for a given #GBytes.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSize(): CUnsignedLongInt /* None */ =
    g_bytes_get_size(this.getUnsafeRawPointer().asInstanceOf[Ptr[GBytes]]).value
  end getSize

  /** Creates an integer hash code for the byte data in the #GBytes.
    *
    * This function can be passed to g_hash_table_new() as the @key_hash_func
    * parameter, when using non-%NULL #GBytes pointers as keys in a #GHashTable.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def hash(): UInt /* None */ =
    g_bytes_hash(this.getUnsafeRawPointer().asInstanceOf[gconstpointer]).value
  end hash

  /** Creates a #GBytes which is a subsection of another #GBytes. The @offset +
    * @length
    *   may not be longer than the size of @bytes.
    *
    * A reference to @bytes will be held by the newly created #GBytes until the
    * byte data is no longer needed.
    *
    * Since 2.56, if @offset is 0 and @length matches the size of @bytes, then
    * @bytes
    *   will be returned with the reference count incremented by 1. If @bytes is
    *   a slice of another #GBytes, then the resulting #GBytes will reference
    *   the same #GBytes instead of @bytes. This allows consumers to simplify
    *   the usage of #GBytes when asynchronously writing to streams.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def newFromBytes(
      offset: CUnsignedLongInt /* Some(gsize) */,
      length: CUnsignedLongInt /* Some(gsize) */
  ): sn.gnome.glib.Bytes /* None */ =
    sn.gnome.glib.Bytes.fromRaw(
      g_bytes_new_from_bytes(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GBytes]],
        gsize(offset),
        gsize(length)
      )
    )
  end newFromBytes

  /** Increase the reference count on @bytes.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def ref(): sn.gnome.glib.Bytes /* None */ =
    sn.gnome.glib.Bytes.fromRaw(
      g_bytes_ref(this.getUnsafeRawPointer().asInstanceOf[Ptr[GBytes]])
    )
  end ref

  /** Releases a reference on @bytes. This may result in the bytes being freed.
    * If @bytes is %NULL, it will return immediately.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unref(): Unit /* None */ =
    g_bytes_unref(this.getUnsafeRawPointer().asInstanceOf[Ptr[GBytes]])
  end unref

  /** Unreferences the bytes, and returns a new mutable #GByteArray containing
    * the same byte data.
    *
    * As an optimization, the byte data is transferred to the array without
    * copying if this was the last reference to bytes and bytes was created with
    * g_bytes_new(), g_bytes_new_take() or g_byte_array_free_to_bytes(). In all
    * other cases the data is copied.
    *
    * Do not use it if @bytes contains more than %G_MAXUINT bytes. #GByteArray
    * stores the length of its data in #guint, which may be shorter than #gsize,
    * that @bytes is using.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method unref_to_array/return type]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(guint8), @type -> DataRecord(guint8)))),ListMap(@name -> DataRecord(GLib.ByteArray), @type -> DataRecord(GByteArray*)))"
  )
  private def unrefToArray__ = ???

  /** Unreferences the bytes, and returns a pointer the same byte data contents.
    *
    * As an optimization, the byte data is returned without copying if this was
    * the last reference to bytes and bytes was created with g_bytes_new(),
    * g_bytes_new_take() or g_byte_array_free_to_bytes(). In all other cases the
    * data is copied.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method unref_to_data]: Method unref_to_data contains an OUT parameter, which is not supported yet"
  )
  private def unrefToData__ = ???

end Bytes

object Bytes:
  def fromRaw(ptr: Ptr[GBytes]): Bytes = new Bytes(ptr)
end Bytes
