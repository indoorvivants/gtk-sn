package sn.gnome.glib

import _root_.sn.gnome.glib.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.{Bytes, String}
import sn.gnome.glib.internal.{
  GString,
  gboolean,
  gchar,
  gint,
  gsize,
  gssize,
  guint,
  guint32,
  gunichar
}

/** The GString struct contains the public fields of a GString.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class String private[gnome] (raw: Ptr[GString]):

  def getUnsafeRawPointer(): Ptr[GString] = this.raw

  /** points to the character data. It may move as text is added. The @str field
    * is null-terminated and so can be used as an ordinary C string.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def str(using Zone): scala.Predef.String /* None */ =
    (!raw).str.asInstanceOf[Ptr[gchar]]

  /** points to the character data. It may move as text is added. The @str field
    * is null-terminated and so can be used as an ordinary C string.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def str_=(value: scala.Predef.String /* None */ )(using Zone): Unit =
    (!raw).str_=(
      toCString(value).asInstanceOf[Ptr[gchar]].asInstanceOf[Ptr[gchar]]
    )

  /** contains the length of the string, not including the terminating nul byte.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def len: CUnsignedLongInt /* None */ = (!raw).len.asInstanceOf[gsize]

  /** contains the length of the string, not including the terminating nul byte.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def len_=(value: CUnsignedLongInt /* None */ ): Unit =
    (!raw).len_=(gsize(value).asInstanceOf[gsize])

  /** the number of bytes that can be stored in the string before it needs to be
    * reallocated. May be larger than @len.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def allocatedLen: CUnsignedLongInt /* None */ =
    (!raw).allocated_len.asInstanceOf[gsize]

  /** the number of bytes that can be stored in the string before it needs to be
    * reallocated. May be larger than @len.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def allocatedLen_=(value: CUnsignedLongInt /* None */ ): Unit =
    (!raw).allocated_len_=(gsize(value).asInstanceOf[gsize])

  /** Adds a string onto the end of a #GString, expanding it if necessary.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def append(
      `val`: scala.Predef.String /* Some(Ptr[gchar]) */
  )(using Zone): sn.gnome.glib.String /* None */ =
    sn.gnome.glib.String.fromRaw(
      g_string_append(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GString]],
        toCString(`val`).asInstanceOf[Ptr[gchar]]
      )
    )
  end append

  /** Adds a byte onto the end of a #GString, expanding it if necessary.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def appendC(c: Byte /* Some(gchar) */ ): sn.gnome.glib.String /* None */ =
    sn.gnome.glib.String.fromRaw(
      g_string_append_c(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GString]],
        gchar(c)
      )
    )
  end appendC

  /** Appends @len bytes of @val to @string.
    *
    * If @len is positive, @val may contain embedded nuls and need not be
    * nul-terminated. It is the caller's responsibility to ensure that @val has
    * at least @len addressable bytes.
    *
    * If @len is negative, @val must be nul-terminated and @len is considered to
    * request the entire string length. This makes g_string_append_len()
    * equivalent to g_string_append().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def appendLen(
      `val`: scala.Predef.String /* Some(Ptr[gchar]) */,
      len: CLongInt /* Some(gssize) */
  )(using Zone): sn.gnome.glib.String /* None */ =
    sn.gnome.glib.String.fromRaw(
      g_string_append_len(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GString]],
        toCString(`val`).asInstanceOf[Ptr[gchar]],
        gssize(len)
      )
    )
  end appendLen

  /** Appends a formatted string onto the end of a #GString. This function is
    * similar to g_string_printf() except that the text is appended to the
    * #GString.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method append_printf/<method parameters>]: Vararg parameters require inlining which doesn't work with overriding"
  )
  private def appendPrintf__ = ???

  /** Converts a Unicode character into UTF-8, and appends it to the string.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def appendUnichar(
      wc: CUnsignedInt /* Some(gunichar) */
  ): sn.gnome.glib.String /* None */ =
    sn.gnome.glib.String.fromRaw(
      g_string_append_unichar(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GString]],
        gunichar(guint32(wc))
      )
    )
  end appendUnichar

  /** Appends @unescaped to @string, escaping any characters that are reserved
    * in URIs using URI-style escape sequences.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def appendUriEscaped(
      unescaped: scala.Predef.String /* Some(Ptr[gchar]) */,
      reserved_chars_allowed: scala.Predef.String /* Some(Ptr[gchar]) */,
      allow_utf8: Boolean /* Some(gboolean) */
  )(using Zone): sn.gnome.glib.String /* None */ =
    sn.gnome.glib.String.fromRaw(
      g_string_append_uri_escaped(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GString]],
        toCString(unescaped).asInstanceOf[Ptr[gchar]],
        toCString(reserved_chars_allowed).asInstanceOf[Ptr[gchar]],
        gboolean(gint((if allow_utf8 == true then 1 else 0)))
      )
    )
  end appendUriEscaped

  /** Appends a formatted string onto the end of a #GString. This function is
    * similar to g_string_append_printf() except that the arguments to the
    * format string are passed as a va_list.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def appendVprintf(
      format: scala.Predef.String /* Some(Ptr[gchar]) */,
      args: CVarArgList /* Some(va_list) */
  )(using Zone): Unit /* None */ =
    g_string_append_vprintf(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GString]],
      toCString(format).asInstanceOf[Ptr[gchar]],
      args
    )
  end appendVprintf

  /** Converts all uppercase ASCII letters to lowercase ASCII letters.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def asciiDown(): sn.gnome.glib.String /* None */ =
    sn.gnome.glib.String.fromRaw(
      g_string_ascii_down(this.getUnsafeRawPointer().asInstanceOf[Ptr[GString]])
    )
  end asciiDown

  /** Converts all lowercase ASCII letters to uppercase ASCII letters.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def asciiUp(): sn.gnome.glib.String /* None */ =
    sn.gnome.glib.String.fromRaw(
      g_string_ascii_up(this.getUnsafeRawPointer().asInstanceOf[Ptr[GString]])
    )
  end asciiUp

  /** Copies the bytes from a string into a #GString, destroying any previous
    * contents. It is rather like the standard strcpy() function, except that
    * you do not have to worry about having enough space to copy the string.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def assign(
      rval: scala.Predef.String /* Some(Ptr[gchar]) */
  )(using Zone): sn.gnome.glib.String /* None */ =
    sn.gnome.glib.String.fromRaw(
      g_string_assign(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GString]],
        toCString(rval).asInstanceOf[Ptr[gchar]]
      )
    )
  end assign

  /** Converts a #GString to lowercase.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def down(): sn.gnome.glib.String /* None */ =
    sn.gnome.glib.String.fromRaw(
      g_string_down(this.getUnsafeRawPointer().asInstanceOf[Ptr[GString]])
    )
  end down

  /** Compares two strings for equality, returning %TRUE if they are equal. For
    * use with #GHashTable.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def equal(
      v2: sn.gnome.glib.String /* Some(Ptr[GString]) */
  ): Boolean /* None */ =
    g_string_equal(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GString]],
      v2.getUnsafeRawPointer().asInstanceOf
    ).value.!=(0)
  end equal

  /** Removes @len bytes from a #GString, starting at position @pos. The rest of
    * the #GString is shifted down to fill the gap.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def erase(
      pos: CLongInt /* Some(gssize) */,
      len: CLongInt /* Some(gssize) */
  ): sn.gnome.glib.String /* None */ =
    sn.gnome.glib.String.fromRaw(
      g_string_erase(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GString]],
        gssize(pos),
        gssize(len)
      )
    )
  end erase

  /** Frees the memory allocated for the #GString. If @free_segment is %TRUE it
    * also frees the character data. If it's %FALSE, the caller gains ownership
    * of the buffer and must free it after use with g_free().
    *
    * Instead of passing %FALSE to this function, consider using
    * g_string_free_and_steal().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def free(
      free_segment: Boolean /* Some(gboolean) */
  )(using Zone): scala.Predef.String /* None */ =
    fromCString(
      g_string_free(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GString]],
        gboolean(gint((if free_segment == true then 1 else 0)))
      ).asInstanceOf
    )
  end free

  /** Frees the memory allocated for the #GString.
    *
    * The caller gains ownership of the buffer and must free it after use with
    * g_free().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def freeAndSteal()(using Zone): scala.Predef.String /* None */ =
    fromCString(
      g_string_free_and_steal(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GString]]
      ).asInstanceOf
    )
  end freeAndSteal

  /** Transfers ownership of the contents of @string to a newly allocated
    * #GBytes. The #GString structure itself is deallocated, and it is therefore
    * invalid to use @string after invoking this function.
    *
    * Note that while #GString ensures that its buffer always has a trailing nul
    * character (not reflected in its "len"), the returned #GBytes does not
    * include this extra nul; i.e. it has length exactly equal to the "len"
    * member.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def freeToBytes(): sn.gnome.glib.Bytes /* None */ =
    sn.gnome.glib.Bytes.fromRaw(
      g_string_free_to_bytes(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GString]]
      )
    )
  end freeToBytes

  /** Creates a hash code for @str; for use with #GHashTable.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def hash(): UInt /* None */ =
    g_string_hash(this.getUnsafeRawPointer().asInstanceOf[Ptr[GString]]).value
  end hash

  /** Inserts a copy of a string into a #GString, expanding it if necessary.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def insert(
      pos: CLongInt /* Some(gssize) */,
      `val`: scala.Predef.String /* Some(Ptr[gchar]) */
  )(using Zone): sn.gnome.glib.String /* None */ =
    sn.gnome.glib.String.fromRaw(
      g_string_insert(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GString]],
        gssize(pos),
        toCString(`val`).asInstanceOf[Ptr[gchar]]
      )
    )
  end insert

  /** Inserts a byte into a #GString, expanding it if necessary.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def insertC(
      pos: CLongInt /* Some(gssize) */,
      c: Byte /* Some(gchar) */
  ): sn.gnome.glib.String /* None */ =
    sn.gnome.glib.String.fromRaw(
      g_string_insert_c(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GString]],
        gssize(pos),
        gchar(c)
      )
    )
  end insertC

  /** Inserts @len bytes of @val into @string at @pos.
    *
    * If @len is positive, @val may contain embedded nuls and need not be
    * nul-terminated. It is the caller's responsibility to ensure that @val has
    * at least @len addressable bytes.
    *
    * If @len is negative, @val must be nul-terminated and @len is considered to
    * request the entire string length.
    *
    * If @pos is -1, bytes are inserted at the end of the string.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def insertLen(
      pos: CLongInt /* Some(gssize) */,
      `val`: scala.Predef.String /* Some(Ptr[gchar]) */,
      len: CLongInt /* Some(gssize) */
  )(using Zone): sn.gnome.glib.String /* None */ =
    sn.gnome.glib.String.fromRaw(
      g_string_insert_len(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GString]],
        gssize(pos),
        toCString(`val`).asInstanceOf[Ptr[gchar]],
        gssize(len)
      )
    )
  end insertLen

  /** Converts a Unicode character into UTF-8, and insert it into the string at
    * the given position.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def insertUnichar(
      pos: CLongInt /* Some(gssize) */,
      wc: CUnsignedInt /* Some(gunichar) */
  ): sn.gnome.glib.String /* None */ =
    sn.gnome.glib.String.fromRaw(
      g_string_insert_unichar(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GString]],
        gssize(pos),
        gunichar(guint32(wc))
      )
    )
  end insertUnichar

  /** Overwrites part of a string, lengthening it if necessary.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def overwrite(
      pos: CUnsignedLongInt /* Some(gsize) */,
      `val`: scala.Predef.String /* Some(Ptr[gchar]) */
  )(using Zone): sn.gnome.glib.String /* None */ =
    sn.gnome.glib.String.fromRaw(
      g_string_overwrite(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GString]],
        gsize(pos),
        toCString(`val`).asInstanceOf[Ptr[gchar]]
      )
    )
  end overwrite

  /** Overwrites part of a string, lengthening it if necessary. This function
    * will work with embedded nuls.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def overwriteLen(
      pos: CUnsignedLongInt /* Some(gsize) */,
      `val`: scala.Predef.String /* Some(Ptr[gchar]) */,
      len: CLongInt /* Some(gssize) */
  )(using Zone): sn.gnome.glib.String /* None */ =
    sn.gnome.glib.String.fromRaw(
      g_string_overwrite_len(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GString]],
        gsize(pos),
        toCString(`val`).asInstanceOf[Ptr[gchar]],
        gssize(len)
      )
    )
  end overwriteLen

  /** Adds a string on to the start of a #GString, expanding it if necessary.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def prepend(
      `val`: scala.Predef.String /* Some(Ptr[gchar]) */
  )(using Zone): sn.gnome.glib.String /* None */ =
    sn.gnome.glib.String.fromRaw(
      g_string_prepend(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GString]],
        toCString(`val`).asInstanceOf[Ptr[gchar]]
      )
    )
  end prepend

  /** Adds a byte onto the start of a #GString, expanding it if necessary.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def prependC(c: Byte /* Some(gchar) */ ): sn.gnome.glib.String /* None */ =
    sn.gnome.glib.String.fromRaw(
      g_string_prepend_c(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GString]],
        gchar(c)
      )
    )
  end prependC

  /** Prepends @len bytes of @val to @string.
    *
    * If @len is positive, @val may contain embedded nuls and need not be
    * nul-terminated. It is the caller's responsibility to ensure that @val has
    * at least @len addressable bytes.
    *
    * If @len is negative, @val must be nul-terminated and @len is considered to
    * request the entire string length. This makes g_string_prepend_len()
    * equivalent to g_string_prepend().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def prependLen(
      `val`: scala.Predef.String /* Some(Ptr[gchar]) */,
      len: CLongInt /* Some(gssize) */
  )(using Zone): sn.gnome.glib.String /* None */ =
    sn.gnome.glib.String.fromRaw(
      g_string_prepend_len(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GString]],
        toCString(`val`).asInstanceOf[Ptr[gchar]],
        gssize(len)
      )
    )
  end prependLen

  /** Converts a Unicode character into UTF-8, and prepends it to the string.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def prependUnichar(
      wc: CUnsignedInt /* Some(gunichar) */
  ): sn.gnome.glib.String /* None */ =
    sn.gnome.glib.String.fromRaw(
      g_string_prepend_unichar(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GString]],
        gunichar(guint32(wc))
      )
    )
  end prependUnichar

  /** Writes a formatted string into a #GString. This is similar to the standard
    * sprintf() function, except that the #GString buffer automatically expands
    * to contain the results. The previous contents of the #GString are
    * destroyed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method printf/<method parameters>]: Vararg parameters require inlining which doesn't work with overriding"
  )
  private def printf__ = ???

  /** Replaces the string @find with the string @replace in a #GString up to
    * @limit
    *   times. If the number of instances of @find in the #GString is less than @limit,
    *   all instances are replaced. If @limit is `0`, all instances of @find are
    *   replaced.
    *
    * If @find is the empty string, since versions 2.69.1 and 2.68.4 the
    * replacement will be inserted no more than once per possible position
    * (beginning of string, end of string and between characters). This did not
    * work correctly in earlier versions.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def replace(
      find: scala.Predef.String /* Some(Ptr[gchar]) */,
      replace: scala.Predef.String /* Some(Ptr[gchar]) */,
      limit: UInt /* Some(guint) */
  )(using Zone): UInt /* None */ =
    g_string_replace(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GString]],
      toCString(find).asInstanceOf[Ptr[gchar]],
      toCString(replace).asInstanceOf[Ptr[gchar]],
      guint(limit)
    ).value
  end replace

  /** Sets the length of a #GString. If the length is less than the current
    * length, the string will be truncated. If the length is greater than the
    * current length, the contents of the newly added area are undefined.
    * (However, as always, string->str[string->len] will be a nul byte.)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setSize(
      len: CUnsignedLongInt /* Some(gsize) */
  ): sn.gnome.glib.String /* None */ =
    sn.gnome.glib.String.fromRaw(
      g_string_set_size(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GString]],
        gsize(len)
      )
    )
  end setSize

  /** Cuts off the end of the GString, leaving the first @len bytes.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def truncate(
      len: CUnsignedLongInt /* Some(gsize) */
  ): sn.gnome.glib.String /* None */ =
    sn.gnome.glib.String.fromRaw(
      g_string_truncate(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GString]],
        gsize(len)
      )
    )
  end truncate

  /** Converts a #GString to uppercase.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def up(): sn.gnome.glib.String /* None */ =
    sn.gnome.glib.String.fromRaw(
      g_string_up(this.getUnsafeRawPointer().asInstanceOf[Ptr[GString]])
    )
  end up

  /** Writes a formatted string into a #GString. This function is similar to
    * g_string_printf() except that the arguments to the format string are
    * passed as a va_list.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def vprintf(
      format: scala.Predef.String /* Some(Ptr[gchar]) */,
      args: CVarArgList /* Some(va_list) */
  )(using Zone): Unit /* None */ =
    g_string_vprintf(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GString]],
      toCString(format).asInstanceOf[Ptr[gchar]],
      args
    )
  end vprintf

end String

object String:
  def fromRaw(ptr: Ptr[GString]): String = new String(ptr)
end String
