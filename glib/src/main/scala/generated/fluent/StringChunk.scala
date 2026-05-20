package sn.gnome.glib

import _root_.sn.gnome.glib.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.{GStringChunk, gchar, gssize}

/** An opaque data structure representing String Chunks. It should only be
  * accessed by using the following functions.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class StringChunk private[gnome] (raw: Ptr[GStringChunk]):

  def getUnsafeRawPointer(): Ptr[GStringChunk] = this.raw

  /** Frees all strings contained within the #GStringChunk. After calling
    * g_string_chunk_clear() it is not safe to access any of the strings which
    * were contained within it.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def clear(): Unit /* None */ =
    g_string_chunk_clear(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GStringChunk]]
    )
  end clear

  /** Frees all memory allocated by the #GStringChunk. After calling
    * g_string_chunk_free() it is not safe to access any of the strings which
    * were contained within it.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def free(): Unit /* None */ =
    g_string_chunk_free(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GStringChunk]]
    )
  end free

  /** Adds a copy of @string to the #GStringChunk. It returns a pointer to the
    * new copy of the string in the #GStringChunk. The characters in the string
    * can be changed, if necessary, though you should not change anything after
    * the end of the string.
    *
    * Unlike g_string_chunk_insert_const(), this function does not check for
    * duplicates. Also strings added with g_string_chunk_insert() will not be
    * searched by g_string_chunk_insert_const() when looking for duplicates.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def insert(
      string: scala.Predef.String /* Some(Ptr[gchar]) */
  )(using Zone): scala.Predef.String /* None */ =
    fromCString(
      g_string_chunk_insert(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GStringChunk]],
        toCString(string).asInstanceOf[Ptr[gchar]]
      ).asInstanceOf
    )
  end insert

  /** Adds a copy of @string to the #GStringChunk, unless the same string has
    * already been added to the #GStringChunk with
    * g_string_chunk_insert_const().
    *
    * This function is useful if you need to copy a large number of strings but
    * do not want to waste space storing duplicates. But you must remember that
    * there may be several pointers to the same string, and so any changes made
    * to the strings should be done very carefully.
    *
    * Note that g_string_chunk_insert_const() will not return a pointer to a
    * string added with g_string_chunk_insert(), even if they do match.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def insertConst(
      string: scala.Predef.String /* Some(Ptr[gchar]) */
  )(using Zone): scala.Predef.String /* None */ =
    fromCString(
      g_string_chunk_insert_const(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GStringChunk]],
        toCString(string).asInstanceOf[Ptr[gchar]]
      ).asInstanceOf
    )
  end insertConst

  /** Adds a copy of the first @len bytes of @string to the #GStringChunk. The
    * copy is nul-terminated.
    *
    * Since this function does not stop at nul bytes, it is the caller's
    * responsibility to ensure that @string has at least @len addressable bytes.
    *
    * The characters in the returned string can be changed, if necessary, though
    * you should not change anything after the end of the string.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def insertLen(
      string: scala.Predef.String /* Some(Ptr[gchar]) */,
      len: CLongInt /* Some(gssize) */
  )(using Zone): scala.Predef.String /* None */ =
    fromCString(
      g_string_chunk_insert_len(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GStringChunk]],
        toCString(string).asInstanceOf[Ptr[gchar]],
        gssize(len)
      ).asInstanceOf
    )
  end insertLen

end StringChunk

object StringChunk:
  def fromRaw(ptr: Ptr[GStringChunk]): StringChunk = new StringChunk(ptr)
end StringChunk
