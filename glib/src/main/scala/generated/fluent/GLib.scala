package sn.gnome.glib.fluent

import _root_.sn.gnome.glib.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.fluent.{
  ChecksumType,
  DateMonth,
  DateWeekday,
  FileError,
  FileTest,
  FormatSizeFlags,
  GResult,
  IOChannelError,
  LogLevelFlags,
  NormalizeMode,
  RegexCompileFlags,
  RegexMatchFlags,
  SliceConfig,
  TestFileType,
  TestLogType,
  TestSubprocessFlags,
  TestTrapFlags,
  UnicodeBreakType,
  UnicodeScript,
  UnicodeType,
  UriFlags,
  UserDirectory
}
import sn.gnome.glib.internal.{
  gboolean,
  gchar,
  gconstpointer,
  gdouble,
  gint,
  gint32,
  gint64,
  goffset,
  gpointer,
  gsize,
  gssize,
  guint,
  guint32,
  guint64,
  gulong,
  gunichar
}

object GLib:
  /** A wrapper for the POSIX access() function. This function is used to test a
    * pathname for one or several of read, write or execute permissions, or just
    * existence.
    *
    * On Windows, the file protection mechanism is not at all POSIX-like, and
    * the underlying function in the C library only checks the FAT-style
    * READONLY attribute, and does not look at the ACL of a file at all. This
    * function is this in practise almost useless on Windows. Software that
    * needs to handle file permissions on Windows more exactly should use the
    * Win32 API.
    *
    * See your C library manual for more details about access().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly("[access:]: Method g_access has no target types")
  private def access() = ???

  /** This function is similar to g_malloc(), allocating (@n_blocks * @n_block_bytes)
    * bytes, but care is taken to align the allocated memory to with the given
    * alignment value. Additionally, it will detect possible overflow during
    * multiplication.
    *
    * If the allocation fails (because the system is out of memory), the program
    * is terminated.
    *
    * Aligned memory allocations returned by this function can only be freed
    * using g_aligned_free_sized() or g_aligned_free().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def alignedAlloc(
      n_blocks: CUnsignedLongInt /* Some(gsize) */,
      n_block_bytes: CUnsignedLongInt /* Some(gsize) */,
      alignment: CUnsignedLongInt /* Some(gsize) */
  ): Ptr[Byte] /* Some(gpointer) */ = g_aligned_alloc(
    gsize(n_blocks),
    gsize(n_block_bytes),
    gsize(alignment)
  ).value

  /** This function is similar to g_aligned_alloc(), but it will also clear the
    * allocated memory before returning it.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def alignedAlloc0(
      n_blocks: CUnsignedLongInt /* Some(gsize) */,
      n_block_bytes: CUnsignedLongInt /* Some(gsize) */,
      alignment: CUnsignedLongInt /* Some(gsize) */
  ): Ptr[Byte] /* Some(gpointer) */ = g_aligned_alloc0(
    gsize(n_blocks),
    gsize(n_block_bytes),
    gsize(alignment)
  ).value

  /** Frees the memory allocated by g_aligned_alloc().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def alignedFree(
      mem: Option[Ptr[Byte] /* Some(gpointer) */ ]
  ): Unit /* Some(Unit) */ = g_aligned_free(
    mem.map[gpointer](o => gpointer(o)).getOrElse(null.asInstanceOf[gpointer])
  )

  /** Frees the memory pointed to by @mem, assuming it is has the given @size
    * and
    * @alignment.
    *
    * If @mem is %NULL this is a no-op (and @size is ignored).
    *
    * It is an error if @size doesn’t match the size, or @alignment doesn’t
    * match the alignment, passed when @mem was allocated. @size and @alignment
    * are passed to this function to allow optimizations in the allocator. If
    * you don’t know either of them, use g_aligned_free() instead.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def alignedFreeSized(
      mem: Option[Ptr[Byte] /* Some(gpointer) */ ],
      alignment: CSize /* Some(size_t) */,
      size: CSize /* Some(size_t) */
  ): Unit /* Some(Unit) */ = g_aligned_free_sized(
    mem.map[gpointer](o => gpointer(o)).getOrElse(null.asInstanceOf[gpointer]),
    gsize(alignment).asInstanceOf,
    gsize(size).asInstanceOf
  )

  /** Creates a new #GArray with @data as array data, @len as length and a
    * reference count of 1.
    *
    * This avoids having to copy the data manually, when it can just be
    * inherited. After this call, @data belongs to the #GArray and may no longer
    * be modified by the caller. The memory of @data has to be dynamically
    * allocated and will eventually be freed with g_free().
    *
    * In case the elements need to be cleared when the array is freed, use
    * g_array_set_clear_func() to set a #GDestroyNotify function to perform such
    * task.
    *
    * Do not use it if @len or @element_size are greater than %G_MAXUINT.
    * #GArray stores the length of its data in #guint, which may be shorter than
    * #gsize.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[array_new_take:/<function parameters>/data]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(gpointer), @type -> DataRecord(gpointer)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(1), @type -> DataRecord(gpointer)))"
  )
  private def arrayNewTake() = ???

  /** Creates a new #GArray with @data as array data, computing the length of it
    * and setting the reference count to 1.
    *
    * This avoids having to copy the data manually, when it can just be
    * inherited. After this call, @data belongs to the #GArray and may no longer
    * be modified by the caller. The memory of @data has to be dynamically
    * allocated and will eventually be freed with g_free().
    *
    * The length is calculated by iterating through @data until the first %NULL
    * element is found.
    *
    * In case the elements need to be cleared when the array is freed, use
    * g_array_set_clear_func() to set a #GDestroyNotify function to perform such
    * task.
    *
    * Do not use it if @data length or @element_size are greater than
    * %G_MAXUINT. #GArray stores the length of its data in #guint, which may be
    * shorter than #gsize.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[array_new_take_zero_terminated:/<function parameters>/data]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(gpointer), @type -> DataRecord(gpointer)))),ListMap(@type -> DataRecord(gpointer)))"
  )
  private def arrayNewTakeZeroTerminated() = ???

  /** Determines the numeric value of a character as a decimal digit. Differs
    * from g_unichar_digit_value() because it takes a char, so there's no worry
    * about sign extension if characters are signed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def asciiDigitValue(c: Byte /* Some(gchar) */ ): Int /* Some(gint) */ =
    g_ascii_digit_value(gchar(c)).value

  /** Converts a #gdouble to a string, using the '.' as decimal point.
    *
    * This function generates enough precision that converting the string back
    * using g_ascii_strtod() gives the same machine-number (on machines with
    * IEEE compatible 64bit doubles). It is guaranteed that the size of the
    * resulting string will never be larger than %G_ASCII_DTOSTR_BUF_SIZE bytes,
    * including the terminating nul character, which is always added.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def asciiDtostr(
      buffer: String /* Some(Ptr[gchar]) */,
      buf_len: Int /* Some(gint) */,
      d: Double /* Some(gdouble) */
  )(using Zone): String /* Some(Ptr[gchar]) */ = fromCString(
    g_ascii_dtostr(
      toCString(buffer).asInstanceOf[Ptr[gchar]],
      gint(buf_len),
      gdouble(d)
    ).asInstanceOf
  )

  /** Converts a #gdouble to a string, using the '.' as decimal point. To format
    * the number you pass in a printf()-style format string. Allowed conversion
    * specifiers are 'e', 'E', 'f', 'F', 'g' and 'G'.
    *
    * The @format must just be a single format specifier starting with `%`,
    * expecting a #gdouble argument.
    *
    * The returned buffer is guaranteed to be nul-terminated.
    *
    * If you just want to want to serialize the value into a string, use
    * g_ascii_dtostr().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def asciiFormatd(
      buffer: String /* Some(Ptr[gchar]) */,
      buf_len: Int /* Some(gint) */,
      format: String /* Some(Ptr[gchar]) */,
      d: Double /* Some(gdouble) */
  )(using Zone): String /* Some(Ptr[gchar]) */ = fromCString(
    g_ascii_formatd(
      toCString(buffer).asInstanceOf[Ptr[gchar]],
      gint(buf_len),
      toCString(format).asInstanceOf[Ptr[gchar]],
      gdouble(d)
    ).asInstanceOf
  )

  /** Compare two strings, ignoring the case of ASCII characters.
    *
    * Unlike the BSD strcasecmp() function, this only recognizes standard ASCII
    * letters and ignores the locale, treating all non-ASCII bytes as if they
    * are not letters.
    *
    * This function should be used only on strings that are known to be in
    * encodings where the bytes corresponding to ASCII letters always represent
    * themselves. This includes UTF-8 and the ISO-8859-* charsets, but not for
    * instance double-byte encodings like the Windows Codepage 932, where the
    * trailing bytes of double-byte characters include all ASCII letters. If you
    * compare two CP932 strings using this function, you will get false matches.
    *
    * Both @s1 and @s2 must be non-%NULL.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def asciiStrcasecmp(
      s1: String /* Some(Ptr[gchar]) */,
      s2: String /* Some(Ptr[gchar]) */
  )(using Zone): Int /* Some(gint) */ = g_ascii_strcasecmp(
    toCString(s1).asInstanceOf[Ptr[gchar]],
    toCString(s2).asInstanceOf[Ptr[gchar]]
  ).value

  /** Converts all upper case ASCII letters to lower case ASCII letters.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def asciiStrdown(
      str: String /* Some(Ptr[gchar]) */,
      len: CLongInt /* Some(gssize) */
  )(using Zone): String /* Some(Ptr[gchar]) */ = fromCString(
    g_ascii_strdown(
      toCString(str).asInstanceOf[Ptr[gchar]],
      gssize(len)
    ).asInstanceOf
  )

  /** A convenience function for converting a string to a signed number.
    *
    * This function assumes that @str contains only a number of the given
    * @base
    *   that is within inclusive bounds limited by @min and @max. If this is
    *   true, then the converted number is stored in @out_num. An empty string
    *   is not a valid input. A string with leading or trailing whitespace is
    *   also an invalid input.
    *
    * @base
    *   can be between 2 and 36 inclusive. Hexadecimal numbers must not be
    *   prefixed with "0x" or "0X". Such a problem does not exist for octal
    *   numbers, since they were usually prefixed with a zero which does not
    *   change the value of the parsed number.
    *
    * Parsing failures result in an error with the %G_NUMBER_PARSER_ERROR
    * domain. If the input is invalid, the error code will be
    * %G_NUMBER_PARSER_ERROR_INVALID. If the parsed number is out of bounds -
    * %G_NUMBER_PARSER_ERROR_OUT_OF_BOUNDS.
    *
    * See g_ascii_strtoll() if you have more complex needs such as parsing a
    * string which starts with a number, but then has other characters.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ascii_string_to_signed:]: Function ascii_string_to_signed contains an OUT parameter, which is not supported yet"
  )
  private def asciiStringToSigned() = ???

  /** A convenience function for converting a string to an unsigned number.
    *
    * This function assumes that @str contains only a number of the given
    * @base
    *   that is within inclusive bounds limited by @min and @max. If this is
    *   true, then the converted number is stored in @out_num. An empty string
    *   is not a valid input. A string with leading or trailing whitespace is
    *   also an invalid input. A string with a leading sign (`-` or `+`) is not
    *   a valid input for the unsigned parser.
    *
    * @base
    *   can be between 2 and 36 inclusive. Hexadecimal numbers must not be
    *   prefixed with "0x" or "0X". Such a problem does not exist for octal
    *   numbers, since they were usually prefixed with a zero which does not
    *   change the value of the parsed number.
    *
    * Parsing failures result in an error with the %G_NUMBER_PARSER_ERROR
    * domain. If the input is invalid, the error code will be
    * %G_NUMBER_PARSER_ERROR_INVALID. If the parsed number is out of bounds -
    * %G_NUMBER_PARSER_ERROR_OUT_OF_BOUNDS.
    *
    * See g_ascii_strtoull() if you have more complex needs such as parsing a
    * string which starts with a number, but then has other characters.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ascii_string_to_unsigned:]: Function ascii_string_to_unsigned contains an OUT parameter, which is not supported yet"
  )
  private def asciiStringToUnsigned() = ???

  /** Compare @s1 and @s2, ignoring the case of ASCII characters and any
    * characters after the first @n in each string. If either string is less
    * than @n bytes long, comparison will stop at the first nul byte
    * encountered.
    *
    * Unlike the BSD strcasecmp() function, this only recognizes standard ASCII
    * letters and ignores the locale, treating all non-ASCII characters as if
    * they are not letters.
    *
    * The same warning as in g_ascii_strcasecmp() applies: Use this function
    * only on strings known to be in encodings where bytes corresponding to
    * ASCII letters always represent themselves.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def asciiStrncasecmp(
      s1: String /* Some(Ptr[gchar]) */,
      s2: String /* Some(Ptr[gchar]) */,
      n: CUnsignedLongInt /* Some(gsize) */
  )(using Zone): Int /* Some(gint) */ = g_ascii_strncasecmp(
    toCString(s1).asInstanceOf[Ptr[gchar]],
    toCString(s2).asInstanceOf[Ptr[gchar]],
    gsize(n)
  ).value

  /** Converts a string to a #gdouble value.
    *
    * This function behaves like the standard strtod() function does in the C
    * locale. It does this without actually changing the current locale, since
    * that would not be thread-safe. A limitation of the implementation is that
    * this function will still accept localized versions of infinities and NANs.
    *
    * This function is typically used when reading configuration files or other
    * non-user input that should be locale independent. To handle input from the
    * user you should normally use the locale-sensitive system strtod()
    * function.
    *
    * To convert from a #gdouble to a string in a locale-insensitive way, use
    * g_ascii_dtostr().
    *
    * If the correct value would cause overflow, plus or minus %HUGE_VAL is
    * returned (according to the sign of the value), and %ERANGE is stored in
    * %errno. If the correct value would cause underflow, zero is returned and
    * %ERANGE is stored in %errno.
    *
    * This function resets %errno before calling strtod() so that you can
    * reliably detect overflow and underflow.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ascii_strtod:]: Function ascii_strtod contains an OUT parameter, which is not supported yet"
  )
  private def asciiStrtod() = ???

  /** Converts a string to a #gint64 value. This function behaves like the
    * standard strtoll() function does in the C locale. It does this without
    * actually changing the current locale, since that would not be thread-safe.
    *
    * This function is typically used when reading configuration files or other
    * non-user input that should be locale independent. To handle input from the
    * user you should normally use the locale-sensitive system strtoll()
    * function.
    *
    * If the correct value would cause overflow, %G_MAXINT64 or %G_MININT64 is
    * returned, and `ERANGE` is stored in `errno`. If the base is outside the
    * valid range, zero is returned, and `EINVAL` is stored in `errno`. If the
    * string conversion fails, zero is returned, and @endptr returns @nptr (if @endptr
    * is non-%NULL).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ascii_strtoll:]: Function ascii_strtoll contains an OUT parameter, which is not supported yet"
  )
  private def asciiStrtoll() = ???

  /** Converts a string to a #guint64 value. This function behaves like the
    * standard strtoull() function does in the C locale. It does this without
    * actually changing the current locale, since that would not be thread-safe.
    *
    * Note that input with a leading minus sign (`-`) is accepted, and will
    * return the negation of the parsed number, unless that would overflow a
    * #guint64. Critically, this means you cannot assume that a short fixed
    * length input will never result in a low return value, as the input could
    * have a leading `-`.
    *
    * This function is typically used when reading configuration files or other
    * non-user input that should be locale independent. To handle input from the
    * user you should normally use the locale-sensitive system strtoull()
    * function.
    *
    * If the correct value would cause overflow, %G_MAXUINT64 is returned, and
    * `ERANGE` is stored in `errno`. If the base is outside the valid range,
    * zero is returned, and `EINVAL` is stored in `errno`. If the string
    * conversion fails, zero is returned, and @endptr returns
    * @nptr
    *   (if @endptr is non-%NULL).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ascii_strtoull:]: Function ascii_strtoull contains an OUT parameter, which is not supported yet"
  )
  private def asciiStrtoull() = ???

  /** Converts all lower case ASCII letters to upper case ASCII letters.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def asciiStrup(
      str: String /* Some(Ptr[gchar]) */,
      len: CLongInt /* Some(gssize) */
  )(using Zone): String /* Some(Ptr[gchar]) */ = fromCString(
    g_ascii_strup(
      toCString(str).asInstanceOf[Ptr[gchar]],
      gssize(len)
    ).asInstanceOf
  )

  /** Convert a character to ASCII lower case.
    *
    * Unlike the standard C library tolower() function, this only recognizes
    * standard ASCII letters and ignores the locale, returning all non-ASCII
    * characters unchanged, even if they are lower case letters in a particular
    * character set. Also unlike the standard library function, this takes and
    * returns a char, not an int, so don't call it on %EOF but no need to worry
    * about casting to #guchar before passing a possibly non-ASCII character in.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def asciiTolower(c: Byte /* Some(gchar) */ ): Byte /* Some(gchar) */ =
    g_ascii_tolower(gchar(c)).value

  /** Convert a character to ASCII upper case.
    *
    * Unlike the standard C library toupper() function, this only recognizes
    * standard ASCII letters and ignores the locale, returning all non-ASCII
    * characters unchanged, even if they are upper case letters in a particular
    * character set. Also unlike the standard library function, this takes and
    * returns a char, not an int, so don't call it on %EOF but no need to worry
    * about casting to #guchar before passing a possibly non-ASCII character in.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def asciiToupper(c: Byte /* Some(gchar) */ ): Byte /* Some(gchar) */ =
    g_ascii_toupper(gchar(c)).value

  /** Determines the numeric value of a character as a hexadecimal digit.
    * Differs from g_unichar_xdigit_value() because it takes a char, so there's
    * no worry about sign extension if characters are signed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def asciiXdigitValue(c: Byte /* Some(gchar) */ ): Int /* Some(gint) */ =
    g_ascii_xdigit_value(gchar(c)).value

  @annotation.compileTimeOnly(
    "[assert_warning:/<function parameters>/line]: Cannot render type Type(List(),ListMap(@name -> DataRecord(gint), @type -> DataRecord(const int)))"
  )
  private def assertWarning() = ???

  def assertionMessage(
      domain: String /* Some(CString) */,
      file: String /* Some(CString) */,
      line: Int /* Some(CInt) */,
      func: String /* Some(CString) */,
      message: String /* Some(CString) */
  )(using Zone): Unit /* Some(Unit) */ = g_assertion_message(
    toCString(domain),
    toCString(file),
    line,
    toCString(func),
    toCString(message)
  )

  def assertionMessageCmpint(
      domain: String /* Some(CString) */,
      file: String /* Some(CString) */,
      line: Int /* Some(CInt) */,
      func: String /* Some(CString) */,
      expr: String /* Some(CString) */,
      arg1: CUnsignedLongInt /* Some(guint64) */,
      cmp: String /* Some(CString) */,
      arg2: CUnsignedLongInt /* Some(guint64) */,
      numtype: Byte /* Some(CChar) */
  )(using Zone): Unit /* Some(Unit) */ = g_assertion_message_cmpint(
    toCString(domain),
    toCString(file),
    line,
    toCString(func),
    toCString(expr),
    guint64(arg1),
    toCString(cmp),
    guint64(arg2),
    gchar(numtype).asInstanceOf
  )

  def assertionMessageCmpnum(
      domain: String /* Some(CString) */,
      file: String /* Some(CString) */,
      line: Int /* Some(CInt) */,
      func: String /* Some(CString) */,
      expr: String /* Some(CString) */,
      arg1: Double /* Some(Double) */,
      cmp: String /* Some(CString) */,
      arg2: Double /* Some(Double) */,
      numtype: Byte /* Some(CChar) */
  )(using Zone): Unit /* Some(Unit) */ = g_assertion_message_cmpnum(
    toCString(domain),
    toCString(file),
    line,
    toCString(func),
    toCString(expr),
    arg1,
    toCString(cmp),
    arg2,
    gchar(numtype).asInstanceOf
  )

  def assertionMessageCmpstr(
      domain: String /* Some(CString) */,
      file: String /* Some(CString) */,
      line: Int /* Some(CInt) */,
      func: String /* Some(CString) */,
      expr: String /* Some(CString) */,
      arg1: String /* Some(CString) */,
      cmp: String /* Some(CString) */,
      arg2: String /* Some(CString) */
  )(using Zone): Unit /* Some(Unit) */ = g_assertion_message_cmpstr(
    toCString(domain),
    toCString(file),
    line,
    toCString(func),
    toCString(expr),
    toCString(arg1),
    toCString(cmp),
    toCString(arg2)
  )

  @annotation.compileTimeOnly("[assertion_message_cmpstrv:]: weird")
  private def assertionMessageCmpstrv() = ???

  @annotation.compileTimeOnly(
    "[assertion_message_error:/<function parameters>/error]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Error), @type -> DataRecord(const GError*)))"
  )
  private def assertionMessageError() = ???

  /** Internal function used to print messages from the public g_assert() and
    * g_assert_not_reached() macros.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def assertionMessageExpr(
      domain: Option[String /* Some(CString) */ ],
      file: String /* Some(CString) */,
      line: Int /* Some(CInt) */,
      func: String /* Some(CString) */,
      expr: Option[String /* Some(CString) */ ]
  )(using Zone): Unit /* Some(Unit) */ = g_assertion_message_expr(
    domain
      .map[CString](o => toCString(o))
      .getOrElse(null.asInstanceOf[CString]),
    toCString(file),
    line,
    toCString(func),
    expr.map[CString](o => toCString(o)).getOrElse(null.asInstanceOf[CString])
  )

  /** Specifies a function to be called at normal program termination.
    *
    * Since GLib 2.8.2, on Windows g_atexit() actually is a preprocessor macro
    * that maps to a call to the atexit() function in the C library. This means
    * that in case the code that calls g_atexit(), i.e. atexit(), is in a DLL,
    * the function will be called when the DLL is detached from the program.
    * This typically makes more sense than that the function is called when the
    * GLib DLL is detached, which happened earlier when g_atexit() was a
    * function in the GLib DLL.
    *
    * The behaviour of atexit() in the context of dynamically loaded modules is
    * not formally specified and varies wildly.
    *
    * On POSIX systems, calling g_atexit() (or atexit()) in a dynamically loaded
    * module which is unloaded before the program terminates might well cause a
    * crash at program exit.
    *
    * Some POSIX systems implement atexit() like Windows, and have each
    * dynamically loaded module maintain an own atexit chain that is called when
    * the module is unloaded.
    *
    * On other POSIX systems, before a dynamically loaded module is unloaded,
    * the registered atexit functions (if any) residing in that module are
    * called, regardless where the code that registered them resided. This is
    * presumably the most robust approach.
    *
    * As can be seen from the above, for portability it's best to avoid calling
    * g_atexit() (or atexit()) except in the main executable of a program.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[atexit:/<function parameters>/func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(VoidFunc), @type -> DataRecord(GVoidFunc)))"
  )
  private def atexit() = ???

  /** Atomically adds @val to the value of @atomic.
    *
    * Think of this operation as an atomic version of
    * `{ tmp = *atomic; *atomic += val; return tmp; }`.
    *
    * This call acts as a full compiler and hardware memory barrier.
    *
    * Before version 2.30, this function did not return a value (but
    * g_atomic_int_exchange_and_add() did, and had the same meaning).
    *
    * While @atomic has a `volatile` qualifier, this is a historical artifact
    * and the pointer passed to it should not be `volatile`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly("[atomic_int_add:]: weird")
  private def atomicIntAdd() = ???

  /** Performs an atomic bitwise 'and' of the value of @atomic and @val, storing
    * the result back in @atomic.
    *
    * This call acts as a full compiler and hardware memory barrier.
    *
    * Think of this operation as an atomic version of
    * `{ tmp = *atomic; *atomic &= val; return tmp; }`.
    *
    * While @atomic has a `volatile` qualifier, this is a historical artifact
    * and the pointer passed to it should not be `volatile`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly("[atomic_int_and:]: weird")
  private def atomicIntAnd() = ???

  /** Compares @atomic to @oldval and, if equal, sets it to @newval. If @atomic
    * was not equal to @oldval then no change occurs.
    *
    * This compare and exchange is done atomically.
    *
    * Think of this operation as an atomic version of
    * `{ if (*atomic == oldval) { *atomic = newval; return TRUE; } else return FALSE; }`.
    *
    * This call acts as a full compiler and hardware memory barrier.
    *
    * While @atomic has a `volatile` qualifier, this is a historical artifact
    * and the pointer passed to it should not be `volatile`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly("[atomic_int_compare_and_exchange:]: weird")
  private def atomicIntCompareAndExchange() = ???

  /** Compares @atomic to @oldval and, if equal, sets it to @newval. If @atomic
    * was not equal to @oldval then no change occurs. In any case the value of @atomic
    * before this operation is stored in @preval.
    *
    * This compare and exchange is done atomically.
    *
    * Think of this operation as an atomic version of
    * `{ *preval = *atomic; if (*atomic == oldval) { *atomic = newval; return TRUE; } else return FALSE; }`.
    *
    * This call acts as a full compiler and hardware memory barrier.
    *
    * See also g_atomic_int_compare_and_exchange()
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly("[atomic_int_compare_and_exchange_full:]: weird")
  private def atomicIntCompareAndExchangeFull() = ???

  /** Decrements the value of @atomic by 1.
    *
    * Think of this operation as an atomic version of
    * `{ *atomic -= 1; return (*atomic == 0); }`.
    *
    * This call acts as a full compiler and hardware memory barrier.
    *
    * While @atomic has a `volatile` qualifier, this is a historical artifact
    * and the pointer passed to it should not be `volatile`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly("[atomic_int_dec_and_test:]: weird")
  private def atomicIntDecAndTest() = ???

  /** Sets the @atomic to @newval and returns the old value from @atomic.
    *
    * This exchange is done atomically.
    *
    * Think of this operation as an atomic version of
    * `{ tmp = *atomic; *atomic = val; return tmp; }`.
    *
    * This call acts as a full compiler and hardware memory barrier.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly("[atomic_int_exchange:]: weird")
  private def atomicIntExchange() = ???

  /** This function existed before g_atomic_int_add() returned the prior value
    * of the integer (which it now does). It is retained only for compatibility
    * reasons. Don't use this function in new code.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly("[atomic_int_exchange_and_add:]: weird")
  private def atomicIntExchangeAndAdd() = ???

  /** Gets the current value of @atomic.
    *
    * This call acts as a full compiler and hardware memory barrier (before the
    * get).
    *
    * While @atomic has a `volatile` qualifier, this is a historical artifact
    * and the pointer passed to it should not be `volatile`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly("[atomic_int_get:]: weird")
  private def atomicIntGet() = ???

  /** Increments the value of @atomic by 1.
    *
    * Think of this operation as an atomic version of `{ *atomic += 1; }`.
    *
    * This call acts as a full compiler and hardware memory barrier.
    *
    * While @atomic has a `volatile` qualifier, this is a historical artifact
    * and the pointer passed to it should not be `volatile`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly("[atomic_int_inc:]: weird")
  private def atomicIntInc() = ???

  /** Performs an atomic bitwise 'or' of the value of @atomic and @val, storing
    * the result back in @atomic.
    *
    * Think of this operation as an atomic version of
    * `{ tmp = *atomic; *atomic |= val; return tmp; }`.
    *
    * This call acts as a full compiler and hardware memory barrier.
    *
    * While @atomic has a `volatile` qualifier, this is a historical artifact
    * and the pointer passed to it should not be `volatile`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly("[atomic_int_or:]: weird")
  private def atomicIntOr() = ???

  /** Sets the value of @atomic to @newval.
    *
    * This call acts as a full compiler and hardware memory barrier (after the
    * set).
    *
    * While @atomic has a `volatile` qualifier, this is a historical artifact
    * and the pointer passed to it should not be `volatile`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly("[atomic_int_set:]: weird")
  private def atomicIntSet() = ???

  /** Performs an atomic bitwise 'xor' of the value of @atomic and @val, storing
    * the result back in @atomic.
    *
    * Think of this operation as an atomic version of
    * `{ tmp = *atomic; *atomic ^= val; return tmp; }`.
    *
    * This call acts as a full compiler and hardware memory barrier.
    *
    * While @atomic has a `volatile` qualifier, this is a historical artifact
    * and the pointer passed to it should not be `volatile`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly("[atomic_int_xor:]: weird")
  private def atomicIntXor() = ???

  /** Atomically adds @val to the value of @atomic.
    *
    * Think of this operation as an atomic version of
    * `{ tmp = *atomic; *atomic += val; return tmp; }`.
    *
    * This call acts as a full compiler and hardware memory barrier.
    *
    * While @atomic has a `volatile` qualifier, this is a historical artifact
    * and the pointer passed to it should not be `volatile`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly("[atomic_pointer_add:]: weird")
  private def atomicPointerAdd() = ???

  /** Performs an atomic bitwise 'and' of the value of @atomic and @val, storing
    * the result back in @atomic.
    *
    * Think of this operation as an atomic version of
    * `{ tmp = *atomic; *atomic &= val; return tmp; }`.
    *
    * This call acts as a full compiler and hardware memory barrier.
    *
    * While @atomic has a `volatile` qualifier, this is a historical artifact
    * and the pointer passed to it should not be `volatile`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly("[atomic_pointer_and:]: weird")
  private def atomicPointerAnd() = ???

  /** Compares @atomic to @oldval and, if equal, sets it to @newval. If @atomic
    * was not equal to @oldval then no change occurs.
    *
    * This compare and exchange is done atomically.
    *
    * Think of this operation as an atomic version of
    * `{ if (*atomic == oldval) { *atomic = newval; return TRUE; } else return FALSE; }`.
    *
    * This call acts as a full compiler and hardware memory barrier.
    *
    * While @atomic has a `volatile` qualifier, this is a historical artifact
    * and the pointer passed to it should not be `volatile`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly("[atomic_pointer_compare_and_exchange:]: weird")
  private def atomicPointerCompareAndExchange() = ???

  /** Compares @atomic to @oldval and, if equal, sets it to @newval. If @atomic
    * was not equal to @oldval then no change occurs. In any case the value of @atomic
    * before this operation is stored in @preval.
    *
    * This compare and exchange is done atomically.
    *
    * Think of this operation as an atomic version of
    * `{ *preval = *atomic; if (*atomic == oldval) { *atomic = newval; return TRUE; } else return FALSE; }`.
    *
    * This call acts as a full compiler and hardware memory barrier.
    *
    * See also g_atomic_pointer_compare_and_exchange()
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[atomic_pointer_compare_and_exchange_full:]: weird"
  )
  private def atomicPointerCompareAndExchangeFull() = ???

  /** Sets the @atomic to @newval and returns the old value from @atomic.
    *
    * This exchange is done atomically.
    *
    * Think of this operation as an atomic version of
    * `{ tmp = *atomic; *atomic = val; return tmp; }`.
    *
    * This call acts as a full compiler and hardware memory barrier.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly("[atomic_pointer_exchange:]: weird")
  private def atomicPointerExchange() = ???

  /** Gets the current value of @atomic.
    *
    * This call acts as a full compiler and hardware memory barrier (before the
    * get).
    *
    * While @atomic has a `volatile` qualifier, this is a historical artifact
    * and the pointer passed to it should not be `volatile`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly("[atomic_pointer_get:]: weird")
  private def atomicPointerGet() = ???

  /** Performs an atomic bitwise 'or' of the value of @atomic and @val, storing
    * the result back in @atomic.
    *
    * Think of this operation as an atomic version of
    * `{ tmp = *atomic; *atomic |= val; return tmp; }`.
    *
    * This call acts as a full compiler and hardware memory barrier.
    *
    * While @atomic has a `volatile` qualifier, this is a historical artifact
    * and the pointer passed to it should not be `volatile`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly("[atomic_pointer_or:]: weird")
  private def atomicPointerOr() = ???

  /** Sets the value of @atomic to @newval.
    *
    * This call acts as a full compiler and hardware memory barrier (after the
    * set).
    *
    * While @atomic has a `volatile` qualifier, this is a historical artifact
    * and the pointer passed to it should not be `volatile`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly("[atomic_pointer_set:]: weird")
  private def atomicPointerSet() = ???

  /** Performs an atomic bitwise 'xor' of the value of @atomic and @val, storing
    * the result back in @atomic.
    *
    * Think of this operation as an atomic version of
    * `{ tmp = *atomic; *atomic ^= val; return tmp; }`.
    *
    * This call acts as a full compiler and hardware memory barrier.
    *
    * While @atomic has a `volatile` qualifier, this is a historical artifact
    * and the pointer passed to it should not be `volatile`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly("[atomic_pointer_xor:]: weird")
  private def atomicPointerXor() = ???

  /** Atomically acquires a reference on the data pointed by @mem_block.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly("[atomic_rc_box_acquire:]: weird")
  private def atomicRcBoxAcquire() = ???

  /** Allocates @block_size bytes of memory, and adds atomic reference counting
    * semantics to it.
    *
    * The data will be freed when its reference count drops to zero.
    *
    * The allocated data is guaranteed to be suitably aligned for any built-in
    * type.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly("[atomic_rc_box_alloc:]: weird")
  private def atomicRcBoxAlloc() = ???

  /** Allocates @block_size bytes of memory, and adds atomic reference counting
    * semantics to it.
    *
    * The contents of the returned data is set to zero.
    *
    * The data will be freed when its reference count drops to zero.
    *
    * The allocated data is guaranteed to be suitably aligned for any built-in
    * type.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly("[atomic_rc_box_alloc0:]: weird")
  private def atomicRcBoxAlloc0() = ???

  /** Allocates a new block of data with atomic reference counting semantics,
    * and copies @block_size bytes of @mem_block into it.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly("[atomic_rc_box_dup:]: weird")
  private def atomicRcBoxDup() = ???

  /** Retrieves the size of the reference counted data pointed by @mem_block.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly("[atomic_rc_box_get_size:]: weird")
  private def atomicRcBoxGetSize() = ???

  /** Atomically releases a reference on the data pointed by @mem_block.
    *
    * If the reference was the last one, it will free the resources allocated
    * for @mem_block.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly("[atomic_rc_box_release:]: weird")
  private def atomicRcBoxRelease() = ???

  /** Atomically releases a reference on the data pointed by @mem_block.
    *
    * If the reference was the last one, it will call @clear_func to clear the
    * contents of @mem_block, and then will free the resources allocated for @mem_block.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly("[atomic_rc_box_release_full:]: weird")
  private def atomicRcBoxReleaseFull() = ???

  /** Atomically compares the current value of @arc with @val.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly("[atomic_ref_count_compare:]: weird")
  private def atomicRefCountCompare() = ???

  /** Atomically decreases the reference count.
    *
    * If %TRUE is returned, the reference count reached 0. After this point, @arc
    * is an undefined state and must be reinitialized with
    * g_atomic_ref_count_init() to be used again.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly("[atomic_ref_count_dec:]: weird")
  private def atomicRefCountDec() = ???

  /** Atomically increases the reference count.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly("[atomic_ref_count_inc:]: weird")
  private def atomicRefCountInc() = ???

  /** Initializes a reference count variable to 1.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly("[atomic_ref_count_init:]: weird")
  private def atomicRefCountInit() = ???

  /** Decode a sequence of Base-64 encoded text into binary data. Note that the
    * returned binary data is not necessarily zero-terminated, so it should not
    * be used as a character string.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[base64_decode:]: Function base64_decode contains an OUT parameter, which is not supported yet"
  )
  private def base64Decode() = ???

  /** Decode a sequence of Base-64 encoded text into binary data by overwriting
    * the input data.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[base64_decode_inplace:]: Function base64_decode_inplace contains an INOUT parameter, which is not supported yet"
  )
  private def base64DecodeInplace() = ???

  /** Incrementally decode a sequence of binary data from its Base-64
    * stringified representation. By calling this function multiple times you
    * can convert data in chunks to avoid having to have the full encoded data
    * in memory.
    *
    * The output buffer must be large enough to fit all the data that will be
    * written to it. Since base64 encodes 3 bytes in 4 chars you need at least:
    * (@len / 4) * 3 + 3 bytes (+ 3 may be needed in case of non-zero state).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[base64_decode_step:]: Function base64_decode_step contains an OUT parameter, which is not supported yet"
  )
  private def base64DecodeStep() = ???

  /** Encode a sequence of binary data into its Base-64 stringified
    * representation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[base64_encode:/<function parameters>/data]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(guint8)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(1), @type -> DataRecord(const guchar*)))"
  )
  private def base64Encode() = ???

  /** Flush the status from a sequence of calls to g_base64_encode_step().
    *
    * The output buffer must be large enough to fit all the data that will be
    * written to it. It will need up to 4 bytes, or up to 5 bytes if
    * line-breaking is enabled.
    *
    * The @out array will not be automatically nul-terminated.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[base64_encode_close:]: Function base64_encode_close contains an OUT parameter, which is not supported yet"
  )
  private def base64EncodeClose() = ???

  /** Incrementally encode a sequence of binary data into its Base-64
    * stringified representation. By calling this function multiple times you
    * can convert data in chunks to avoid having to have the full encoded data
    * in memory.
    *
    * When all of the data has been converted you must call
    * g_base64_encode_close() to flush the saved state.
    *
    * The output buffer must be large enough to fit all the data that will be
    * written to it. Due to the way base64 encodes you will need at least: (@len
    * / 3 + 1) * 4 + 4 bytes (+ 4 may be needed in case of non-zero state). If
    * you enable line-breaking you will need at least: ((@len / 3 + 1) * 4 + 4)
    * / 76 + 1 bytes of extra space.
    *
    * @break_lines
    *   is typically used when putting base64-encoded data in emails. It breaks
    *   the lines at 76 columns instead of putting all of the text on the same
    *   line. This avoids problems with long lines in the email system. Note
    *   however that it breaks the lines with `LF` characters, not `CR LF`
    *   sequences, so the result cannot be passed directly to SMTP or certain
    *   other protocols.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[base64_encode_step:]: Function base64_encode_step contains an OUT parameter, which is not supported yet"
  )
  private def base64EncodeStep() = ???

  /** Gets the name of the file without any leading directory components. It
    * returns a pointer into the given file name string.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def basename(
      file_name: String /* Some(Ptr[gchar]) */
  )(using Zone): String /* Some(Ptr[gchar]) */ = fromCString(
    g_basename(toCString(file_name).asInstanceOf[Ptr[gchar]]).asInstanceOf
  )

  /** Sets the indicated @lock_bit in @address. If the bit is already set, this
    * call will block until g_bit_unlock() unsets the corresponding bit.
    *
    * Attempting to lock on two different bits within the same integer is not
    * supported and will very probably cause deadlocks.
    *
    * The value of the bit that is set is (1u << @bit). If @bit is not between 0
    * and 31 then the result is undefined.
    *
    * This function accesses @address atomically. All other accesses to
    * @address
    *   must be atomic in order for this function to work reliably. While @address
    *   has a `volatile` qualifier, this is a historical artifact and the
    *   argument passed to it should not be `volatile`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[bit_lock:/<function parameters>/address]: Cannot render type Type(List(),ListMap(@name -> DataRecord(gint), @type -> DataRecord(volatile gint*)))"
  )
  private def bitLock() = ???

  /** Find the position of the first bit set in @mask, searching from (but not
    * including) @nth_bit upwards. Bits are numbered from 0 (least significant)
    * to sizeof(#gulong) * 8 - 1 (31 or 63, usually). To start searching from
    * the 0th bit, set @nth_bit to -1.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def bitNthLsf(
      mask: CUnsignedLongInt /* Some(gulong) */,
      nth_bit: Int /* Some(gint) */
  ): Int /* Some(gint) */ = g_bit_nth_lsf(gulong(mask), gint(nth_bit)).value

  /** Find the position of the first bit set in @mask, searching from (but not
    * including) @nth_bit downwards. Bits are numbered from 0 (least
    * significant) to sizeof(#gulong) * 8 - 1 (31 or 63, usually). To start
    * searching from the last bit, set @nth_bit to -1 or GLIB_SIZEOF_LONG * 8.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def bitNthMsf(
      mask: CUnsignedLongInt /* Some(gulong) */,
      nth_bit: Int /* Some(gint) */
  ): Int /* Some(gint) */ = g_bit_nth_msf(gulong(mask), gint(nth_bit)).value

  /** Gets the number of bits used to hold @number, e.g. if @number is 4, 3 bits
    * are needed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def bitStorage(
      number: CUnsignedLongInt /* Some(gulong) */
  ): UInt /* Some(guint) */ = g_bit_storage(gulong(number)).value

  /** Sets the indicated @lock_bit in @address, returning %TRUE if successful.
    * If the bit is already set, returns %FALSE immediately.
    *
    * Attempting to lock on two different bits within the same integer is not
    * supported.
    *
    * The value of the bit that is set is (1u << @bit). If @bit is not between 0
    * and 31 then the result is undefined.
    *
    * This function accesses @address atomically. All other accesses to
    * @address
    *   must be atomic in order for this function to work reliably. While @address
    *   has a `volatile` qualifier, this is a historical artifact and the
    *   argument passed to it should not be `volatile`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly("[bit_trylock:]: weird")
  private def bitTrylock() = ???

  /** Clears the indicated @lock_bit in @address. If another thread is currently
    * blocked in g_bit_lock() on this same bit then it will be woken up.
    *
    * This function accesses @address atomically. All other accesses to
    * @address
    *   must be atomic in order for this function to work reliably. While @address
    *   has a `volatile` qualifier, this is a historical artifact and the
    *   argument passed to it should not be `volatile`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly("[bit_unlock:]: weird")
  private def bitUnlock() = ???

  @annotation.compileTimeOnly(
    "[bookmark_file_error_quark:/<return type>]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Quark), @type -> DataRecord(GQuark)))"
  )
  private def bookmarkFileErrorQuark() = ???

  /** Creates a filename from a series of elements using the correct separator
    * for the current platform.
    *
    * On Unix, this function behaves identically to `g_build_path
    * (G_DIR_SEPARATOR_S, first_element, ....)`.
    *
    * On Windows, it takes into account that either the backslash (`\` or slash
    * (`/`) can be used as separator in filenames, but otherwise behaves as on
    * UNIX. When file pathname separators need to be inserted, the one that last
    * previously occurred in the parameters (reading from left to right) is
    * used.
    *
    * No attempt is made to force the resulting filename to be an absolute path.
    * If the first element is a relative path, the result will be a relative
    * path.
    *
    * If you are building a path programmatically you may want to use #GPathBuf
    * instead.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[build_filename:/<function parameters>]: Vararg parameters require inlining which doesn't work with overriding"
  )
  private def buildFilename() = ???

  /** Creates a filename from a list of elements using the correct separator for
    * the current platform.
    *
    * Behaves exactly like g_build_filename(), but takes the path elements as a
    * va_list.
    *
    * This function is mainly meant for implementing other variadic arguments
    * functions.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[build_filename_valist:/<function parameters>/args]: Cannot render type Type(List(),ListMap(@name -> DataRecord(va_list), @type -> DataRecord(va_list*)))"
  )
  private def buildFilenameValist() = ???

  /** Creates a filename from a vector of elements using the correct separator
    * for the current platform.
    *
    * This function behaves exactly like g_build_filename(), but takes the path
    * elements as a string array, instead of varargs. This function is mainly
    * meant for language bindings.
    *
    * If you are building a path programmatically you may want to use #GPathBuf
    * instead.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[build_filenamev:/<function parameters>/args]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(filename)))),ListMap(@type -> DataRecord(gchar**)))"
  )
  private def buildFilenamev() = ???

  /** Creates a path from a series of elements using @separator as the separator
    * between elements.
    *
    * At the boundary between two elements, any trailing occurrences of
    * separator in the first element, or leading occurrences of separator in the
    * second element are removed and exactly one copy of the separator is
    * inserted.
    *
    * Empty elements are ignored.
    *
    * The number of leading copies of the separator on the result is the same as
    * the number of leading copies of the separator on the first non-empty
    * element.
    *
    * The number of trailing copies of the separator on the result is the same
    * as the number of trailing copies of the separator on the last non-empty
    * element. (Determination of the number of trailing copies is done without
    * stripping leading copies, so if the separator is `ABA`, then `ABABA` has 1
    * trailing copy.)
    *
    * However, if there is only a single non-empty element, and there are no
    * characters in that element not part of the leading or trailing separators,
    * then the result is exactly the original value of that element.
    *
    * Other than for determination of the number of leading and trailing copies
    * of the separator, elements consisting only of copies of the separator are
    * ignored.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[build_path:/<function parameters>]: Vararg parameters require inlining which doesn't work with overriding"
  )
  private def buildPath() = ???

  /** Behaves exactly like g_build_path(), but takes the path elements as a
    * string array, instead of variadic arguments.
    *
    * This function is mainly meant for language bindings.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[build_pathv:/<function parameters>/args]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(filename)))),ListMap(@type -> DataRecord(gchar**)))"
  )
  private def buildPathv() = ???

  /** Frees the memory allocated by the #GByteArray. If @free_segment is %TRUE
    * it frees the actual byte data. If the reference count of
    * @array
    *   is greater than one, the #GByteArray wrapper is preserved but the size
    *   of @array will be set to zero.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[byte_array_free:/<function parameters>/array]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(guint8), @type -> DataRecord(guint8)))),ListMap(@name -> DataRecord(GLib.ByteArray), @type -> DataRecord(GByteArray*)))"
  )
  private def byteArrayFree() = ???

  /** Transfers the data from the #GByteArray into a new immutable #GBytes.
    *
    * The #GByteArray is freed unless the reference count of @array is greater
    * than one, the #GByteArray wrapper is preserved but the size of @array will
    * be set to zero.
    *
    * This is identical to using g_bytes_new_take() and g_byte_array_free()
    * together.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[byte_array_free_to_bytes:/<function parameters>/array]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(guint8), @type -> DataRecord(guint8)))),ListMap(@name -> DataRecord(GLib.ByteArray), @type -> DataRecord(GByteArray*)))"
  )
  private def byteArrayFreeToBytes() = ???

  /** Creates a new #GByteArray with a reference count of 1.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[byte_array_new:/<return type>]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(guint8), @type -> DataRecord(guint8)))),ListMap(@name -> DataRecord(GLib.ByteArray), @type -> DataRecord(GByteArray*)))"
  )
  private def byteArrayNew() = ???

  /** Creates a byte array containing the @data. After this call, @data belongs
    * to the #GByteArray and may no longer be modified by the caller. The memory
    * of @data has to be dynamically allocated and will eventually be freed with
    * g_free().
    *
    * Do not use it if @len is greater than %G_MAXUINT. #GByteArray stores the
    * length of its data in #guint, which may be shorter than #gsize.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[byte_array_new_take:/<function parameters>/data]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(guint8), @type -> DataRecord(guint8)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(1), @type -> DataRecord(guint8*)))"
  )
  private def byteArrayNewTake() = ???

  /** Frees the data in the array and resets the size to zero, while the
    * underlying array is preserved for use elsewhere and returned to the
    * caller.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[byte_array_steal:]: Function byte_array_steal contains an OUT parameter, which is not supported yet"
  )
  private def byteArraySteal() = ???

  /** Atomically decrements the reference count of @array by one. If the
    * reference count drops to 0, all memory allocated by the array is released.
    * This function is thread-safe and may be called from any thread.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[byte_array_unref:/<function parameters>/array]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(guint8), @type -> DataRecord(guint8)))),ListMap(@name -> DataRecord(GLib.ByteArray), @type -> DataRecord(GByteArray*)))"
  )
  private def byteArrayUnref() = ???

  /** Gets the canonical file name from @filename. All triple slashes are turned
    * into single slashes, and all `..` and `.`s resolved against @relative_to.
    *
    * Symlinks are not followed, and the returned path is guaranteed to be
    * absolute.
    *
    * If @filename is an absolute path, @relative_to is ignored. Otherwise,
    * @relative_to
    *   will be prepended to @filename to make it absolute. @relative_to must be
    *   an absolute path, or %NULL. If @relative_to is %NULL, it'll fallback to
    *   g_get_current_dir().
    *
    * This function never fails, and will canonicalize file paths even if they
    * don't exist.
    *
    * No file system I/O is done.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def canonicalizeFilename(
      filename: String /* Some(Ptr[gchar]) */,
      relative_to: Option[String /* Some(Ptr[gchar]) */ ]
  )(using Zone): String /* Some(Ptr[gchar]) */ = fromCString(
    g_canonicalize_filename(
      toCString(filename).asInstanceOf[Ptr[gchar]],
      relative_to
        .map[Ptr[gchar]](o => toCString(o).asInstanceOf[Ptr[gchar]])
        .getOrElse(null.asInstanceOf[Ptr[gchar]])
    ).asInstanceOf
  )

  /** A wrapper for the POSIX chdir() function. The function changes the current
    * directory of the process to @path.
    *
    * See your C library manual for more details about chdir().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly("[chdir:]: Method g_chdir has no target types")
  private def chdir() = ???

  /** Checks that the GLib library in use is compatible with the given version.
    *
    * Generally you would pass in the constants %GLIB_MAJOR_VERSION,
    * %GLIB_MINOR_VERSION, %GLIB_MICRO_VERSION as the three arguments to this
    * function; that produces a check that the library in use is compatible with
    * the version of GLib the application or module was compiled against.
    *
    * Compatibility is defined by two things: first the version of the running
    * library is newer than the version
    * `@required_major.required_minor.@required_micro`. Second the running
    * library must be binary compatible with the version
    * `@required_major.@required_minor.@required_micro` (same major version.)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def checkVersion(
      required_major: UInt /* Some(guint) */,
      required_minor: UInt /* Some(guint) */,
      required_micro: UInt /* Some(guint) */
  )(using Zone): String /* Some(Ptr[gchar]) */ = fromCString(
    glib_check_version(
      guint(required_major),
      guint(required_minor),
      guint(required_micro)
    ).asInstanceOf
  )

  /** Gets the length in bytes of digests of type @checksum_type
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def checksumTypeGetLength(
      checksum_type: ChecksumType /* Some(GChecksumType) */
  ): CLongInt /* Some(gssize) */ = g_checksum_type_get_length(
    checksum_type.raw
  ).value

  /** Sets a function to be called when the child indicated by @pid exits, at a
    * default priority, %G_PRIORITY_DEFAULT.
    *
    * If you obtain @pid from g_spawn_async() or g_spawn_async_with_pipes() you
    * will need to pass %G_SPAWN_DO_NOT_REAP_CHILD as flag to the spawn function
    * for the child watching to work.
    *
    * Note that on platforms where #GPid must be explicitly closed (see
    * g_spawn_close_pid()) @pid must not be closed while the source is still
    * active. Typically, you will want to call g_spawn_close_pid() in the
    * callback function for the source.
    *
    * GLib supports only a single callback per process id. On POSIX platforms,
    * the same restrictions mentioned for g_child_watch_source_new() apply to
    * this function.
    *
    * This internally creates a main loop source using
    * g_child_watch_source_new() and attaches it to the main loop context using
    * g_source_attach(). You can do these steps manually if you need greater
    * control.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[child_watch_add:/<function parameters>/pid]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Pid), @type -> DataRecord(GPid)))"
  )
  private def childWatchAdd() = ???

  /** Sets a function to be called when the child indicated by @pid exits, at
    * the priority @priority.
    *
    * If you obtain @pid from g_spawn_async() or g_spawn_async_with_pipes() you
    * will need to pass %G_SPAWN_DO_NOT_REAP_CHILD as flag to the spawn function
    * for the child watching to work.
    *
    * In many programs, you will want to call g_spawn_check_wait_status() in the
    * callback to determine whether or not the child exited successfully.
    *
    * Also, note that on platforms where #GPid must be explicitly closed (see
    * g_spawn_close_pid()) @pid must not be closed while the source is still
    * active. Typically, you should invoke g_spawn_close_pid() in the callback
    * function for the source.
    *
    * GLib supports only a single callback per process id. On POSIX platforms,
    * the same restrictions mentioned for g_child_watch_source_new() apply to
    * this function.
    *
    * This internally creates a main loop source using
    * g_child_watch_source_new() and attaches it to the main loop context using
    * g_source_attach(). You can do these steps manually if you need greater
    * control.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[child_watch_add_full:/<function parameters>/pid]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Pid), @type -> DataRecord(GPid)))"
  )
  private def childWatchAddFull() = ???

  /** Creates a new child_watch source.
    *
    * The source will not initially be associated with any #GMainContext and
    * must be added to one with g_source_attach() before it will be executed.
    *
    * Note that child watch sources can only be used in conjunction with
    * `g_spawn...` when the %G_SPAWN_DO_NOT_REAP_CHILD flag is used.
    *
    * Note that on platforms where #GPid must be explicitly closed (see
    * g_spawn_close_pid()) @pid must not be closed while the source is still
    * active. Typically, you will want to call g_spawn_close_pid() in the
    * callback function for the source.
    *
    * On POSIX platforms, the following restrictions apply to this API due to
    * limitations in POSIX process interfaces:
    *
    * * @pid must be a child of this process * @pid must be positive * the
    * application must not call `waitpid` with a non-positive first argument,
    * for instance in another thread * the application must not wait for @pid to
    * exit by any other mechanism, including `waitpid(pid, ...)` or a second
    * child-watch source for the same @pid * the application must not ignore
    * `SIGCHLD` * Before 2.78, the application could not send a signal
    * (`kill()`) to the watched @pid in a race free manner. Since 2.78, you can
    * do that while the associated #GMainContext is acquired. * Before 2.78,
    * even after destroying the #GSource, you could not be sure that @pid wasn't
    * already reaped. Hence, it was also not safe to `kill()` or `waitpid()` on
    * the process ID after the child watch source was gone. Destroying the
    * source before it fired made it impossible to reliably reap the process.
    *
    * If any of those conditions are not met, this and related APIs will not
    * work correctly. This can often be diagnosed via a GLib warning stating
    * that `ECHILD` was received by `waitpid`.
    *
    * Calling `waitpid` for specific processes other than @pid remains a valid
    * thing to do.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[child_watch_source_new:/<function parameters>/pid]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Pid), @type -> DataRecord(GPid)))"
  )
  private def childWatchSourceNew() = ???

  /** If @err or *@err is %NULL, does nothing. Otherwise, calls g_error_free()
    * on *@err and sets *@err to %NULL.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def clearError(): GResult[Unit /* Some(Unit) */ ] =
    GResult.wrap(__errorPtr => g_clear_error(__errorPtr))

  /** Clears a numeric handler, such as a #GSource ID.
    *
    * @tag_ptr
    *   must be a valid pointer to the variable holding the handler.
    *
    * If the ID is zero then this function does nothing. Otherwise, clear_func()
    * is called with the ID as a parameter, and the tag is set to zero.
    *
    * A macro is also included that allows this function to be used without
    * pointer casts.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[clear_handle_id:/<function parameters>/clear_func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(ClearHandleFunc), @type -> DataRecord(GClearHandleFunc)))"
  )
  private def clearHandleId() = ???

  /** Clears a pointer to a #GList, freeing it and, optionally, freeing its
    * elements using @destroy.
    *
    * @list_ptr
    *   must be a valid pointer. If @list_ptr points to a null #GList, this does
    *   nothing.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[clear_list:/<function parameters>/list_ptr]: Cannot render type Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(gpointer), @type -> DataRecord(gpointer))))),ListMap(@name -> DataRecord(GLib.List), @type -> DataRecord(GList**)))"
  )
  private def clearList() = ???

  /** Clears a reference to a variable.
    *
    * @pp
    *   must not be %NULL.
    *
    * If the reference is %NULL then this function does nothing. Otherwise, the
    * variable is destroyed using @destroy and the pointer is set to %NULL.
    *
    * A macro is also included that allows this function to be used without
    * pointer casts. This will mask any warnings about incompatible function
    * types or calling conventions, so you must ensure that your @destroy
    * function is compatible with being called as `GDestroyNotify` using the
    * standard calling convention for the platform that GLib was compiled for;
    * otherwise the program will experience undefined behaviour.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[clear_pointer:]: Function clear_pointer contains an INOUT parameter, which is not supported yet"
  )
  private def clearPointer() = ???

  /** Clears a pointer to a #GSList, freeing it and, optionally, freeing its
    * elements using @destroy.
    *
    * @slist_ptr
    *   must be a valid pointer. If @slist_ptr points to a null #GSList, this
    *   does nothing.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[clear_slist:/<function parameters>/slist_ptr]: Cannot render type Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(gpointer), @type -> DataRecord(gpointer))))),ListMap(@name -> DataRecord(GLib.SList), @type -> DataRecord(GSList**)))"
  )
  private def clearSlist() = ???

  /** This wraps the close() call. In case of error, %errno will be preserved,
    * but the error will also be stored as a #GError in @error. In case of
    * success, %errno is undefined.
    *
    * Besides using #GError, there is another major reason to prefer this
    * function over the call provided by the system; on Unix, it will attempt to
    * correctly handle %EINTR, which has platform-specific semantics.
    *
    * It is a bug to call this function with an invalid file descriptor.
    *
    * On POSIX platforms since GLib 2.76, this function is async-signal safe if
    * (and only if) @error is %NULL and @fd is a valid open file descriptor.
    * This makes it safe to call from a signal handler or a
    * #GSpawnChildSetupFunc under those conditions. See
    * [`signal(7)`](man:signal(7)) and
    * [`signal-safety(7)`](man:signal-safety(7)) for more details.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly("[close:]: Method g_close has no target types")
  private def close() = ???

  /** Computes the checksum for a binary @data. This is a convenience wrapper
    * for g_checksum_new(), g_checksum_get_string() and g_checksum_free().
    *
    * The hexadecimal string returned will be in lower case.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[compute_checksum_for_bytes:/<function parameters>/data]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Bytes), @type -> DataRecord(GBytes*)))"
  )
  private def computeChecksumForBytes() = ???

  /** Computes the checksum for a binary @data of @length. This is a convenience
    * wrapper for g_checksum_new(), g_checksum_get_string() and
    * g_checksum_free().
    *
    * The hexadecimal string returned will be in lower case.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[compute_checksum_for_data:/<function parameters>/data]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(guint8)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(2), @type -> DataRecord(const guchar*)))"
  )
  private def computeChecksumForData() = ???

  /** Computes the checksum of a string.
    *
    * The hexadecimal string returned will be in lower case.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def computeChecksumForString(
      checksum_type: ChecksumType /* Some(GChecksumType) */,
      str: String /* Some(Ptr[gchar]) */,
      length: CLongInt /* Some(gssize) */
  )(using Zone): String /* Some(Ptr[gchar]) */ = fromCString(
    g_compute_checksum_for_string(
      checksum_type.raw,
      toCString(str).asInstanceOf[Ptr[gchar]],
      gssize(length)
    ).asInstanceOf
  )

  /** Computes the HMAC for a binary @data. This is a convenience wrapper for
    * g_hmac_new(), g_hmac_get_string() and g_hmac_unref().
    *
    * The hexadecimal string returned will be in lower case.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[compute_hmac_for_bytes:/<function parameters>/key]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Bytes), @type -> DataRecord(GBytes*)))"
  )
  private def computeHmacForBytes() = ???

  /** Computes the HMAC for a binary @data of @length. This is a convenience
    * wrapper for g_hmac_new(), g_hmac_get_string() and g_hmac_unref().
    *
    * The hexadecimal string returned will be in lower case.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[compute_hmac_for_data:/<function parameters>/key]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(guint8), @type -> DataRecord(guchar)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(2), @type -> DataRecord(const guchar*)))"
  )
  private def computeHmacForData() = ???

  /** Computes the HMAC for a string.
    *
    * The hexadecimal string returned will be in lower case.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[compute_hmac_for_string:/<function parameters>/key]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(guint8), @type -> DataRecord(guchar)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(2), @type -> DataRecord(const guchar*)))"
  )
  private def computeHmacForString() = ???

  /** Converts a string from one character set to another.
    *
    * Note that you should use g_iconv() for streaming conversions. Despite the
    * fact that @bytes_read can return information about partial characters, the
    * g_convert_... functions are not generally suitable for streaming. If the
    * underlying converter maintains internal state, then this won't be
    * preserved across successive calls to g_convert(), g_convert_with_iconv()
    * or g_convert_with_fallback(). (An example of this is the GNU C converter
    * for CP1255 which does not emit a base character until it knows that the
    * next character is not a mark that could combine with the base character.)
    *
    * Using extensions such as "//TRANSLIT" may not work (or may not work well)
    * on many platforms. Consider using g_str_to_ascii() instead.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[convert:]: Function convert contains an OUT parameter, which is not supported yet"
  )
  private def convert() = ???

  @annotation.compileTimeOnly(
    "[convert_error_quark:/<return type>]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Quark), @type -> DataRecord(GQuark)))"
  )
  private def convertErrorQuark() = ???

  /** Converts a string from one character set to another, possibly including
    * fallback sequences for characters not representable in the output. Note
    * that it is not guaranteed that the specification for the fallback
    * sequences in @fallback will be honored. Some systems may do an approximate
    * conversion from @from_codeset to @to_codeset in their iconv() functions,
    * in which case GLib will simply return that approximate conversion.
    *
    * Note that you should use g_iconv() for streaming conversions. Despite the
    * fact that @bytes_read can return information about partial characters, the
    * g_convert_... functions are not generally suitable for streaming. If the
    * underlying converter maintains internal state, then this won't be
    * preserved across successive calls to g_convert(), g_convert_with_iconv()
    * or g_convert_with_fallback(). (An example of this is the GNU C converter
    * for CP1255 which does not emit a base character until it knows that the
    * next character is not a mark that could combine with the base character.)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[convert_with_fallback:]: Function convert_with_fallback contains an OUT parameter, which is not supported yet"
  )
  private def convertWithFallback() = ???

  /** Converts a string from one character set to another.
    *
    * Note that you should use g_iconv() for streaming conversions. Despite the
    * fact that @bytes_read can return information about partial characters, the
    * g_convert_... functions are not generally suitable for streaming. If the
    * underlying converter maintains internal state, then this won't be
    * preserved across successive calls to g_convert(), g_convert_with_iconv()
    * or g_convert_with_fallback(). (An example of this is the GNU C converter
    * for CP1255 which does not emit a base character until it knows that the
    * next character is not a mark that could combine with the base character.)
    *
    * Characters which are valid in the input character set, but which have no
    * representation in the output character set will result in a
    * %G_CONVERT_ERROR_ILLEGAL_SEQUENCE error. This is in contrast to the
    * iconv() specification, which leaves this behaviour implementation defined.
    * Note that this is the same error code as is returned for an invalid byte
    * sequence in the input character set. To get defined behaviour for
    * conversion of unrepresentable characters, use g_convert_with_fallback().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[convert_with_iconv:]: Function convert_with_iconv contains an OUT parameter, which is not supported yet"
  )
  private def convertWithIconv() = ???

  /** Frees all the data elements of the datalist. The data elements' destroy
    * functions are called if they have been set.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[datalist_clear:/<function parameters>/datalist]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Data), @type -> DataRecord(GData**)))"
  )
  private def datalistClear() = ???

  /** Calls the given function for each data element of the datalist. The
    * function is called with each data element's #GQuark id and data, together
    * with the given @user_data parameter. Note that this function is NOT
    * thread-safe. So unless @datalist can be protected from any modifications
    * during invocation of this function, it should not be called.
    *
    * @func
    *   can make changes to @datalist, but the iteration will not reflect
    *   changes made during the g_datalist_foreach() call, other than skipping
    *   over elements that are removed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[datalist_foreach:/<function parameters>/datalist]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Data), @type -> DataRecord(GData**)))"
  )
  private def datalistForeach() = ???

  /** Gets a data element, using its string identifier. This is slower than
    * g_datalist_id_get_data() because it compares strings.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[datalist_get_data:/<function parameters>/datalist]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Data), @type -> DataRecord(GData**)))"
  )
  private def datalistGetData() = ???

  /** Gets flags values packed in together with the datalist. See
    * g_datalist_set_flags().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[datalist_get_flags:/<function parameters>/datalist]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Data), @type -> DataRecord(GData**)))"
  )
  private def datalistGetFlags() = ???

  /** This is a variant of g_datalist_id_get_data() which returns a 'duplicate'
    * of the value. @dup_func defines the meaning of 'duplicate' in this
    * context, it could e.g. take a reference on a ref-counted object.
    *
    * If the @key_id is not set in the datalist then @dup_func will be called
    * with a %NULL argument.
    *
    * Note that @dup_func is called while the datalist is locked, so it is not
    * allowed to read or modify the datalist.
    *
    * This function can be useful to avoid races when multiple threads are using
    * the same datalist and the same key.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[datalist_id_dup_data:/<function parameters>/datalist]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Data), @type -> DataRecord(GData**)))"
  )
  private def datalistIdDupData() = ???

  /** Retrieves the data element corresponding to @key_id.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[datalist_id_get_data:/<function parameters>/datalist]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Data), @type -> DataRecord(GData**)))"
  )
  private def datalistIdGetData() = ???

  /** Removes multiple keys from a datalist.
    *
    * This is more efficient than calling g_datalist_id_remove_data() multiple
    * times in a row.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[datalist_id_remove_multiple:/<function parameters>/datalist]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Data), @type -> DataRecord(GData**)))"
  )
  private def datalistIdRemoveMultiple() = ???

  /** Removes an element, without calling its destroy notification function.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[datalist_id_remove_no_notify:/<function parameters>/datalist]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Data), @type -> DataRecord(GData**)))"
  )
  private def datalistIdRemoveNoNotify() = ???

  /** Compares the member that is associated with @key_id in
    * @datalist
    *   to @oldval, and if they are the same, replace
    * @oldval
    *   with @newval.
    *
    * This is like a typical atomic compare-and-exchange operation, for a member
    * of @datalist.
    *
    * If the previous value was replaced then ownership of the old value
    * (@oldval) is passed to the caller, including the registered destroy notify
    * for it (passed out in @old_destroy). Its up to the caller to free this as
    * they wish, which may or may not include using @old_destroy as sometimes
    * replacement should not destroy the object in the normal way.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[datalist_id_replace_data:]: Function datalist_id_replace_data contains an OUT parameter, which is not supported yet"
  )
  private def datalistIdReplaceData() = ???

  /** Sets the data corresponding to the given #GQuark id, and the function to
    * be called when the element is removed from the datalist. Any previous data
    * with the same key is removed, and its destroy function is called.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[datalist_id_set_data_full:/<function parameters>/datalist]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Data), @type -> DataRecord(GData**)))"
  )
  private def datalistIdSetDataFull() = ???

  /** Resets the datalist to %NULL. It does not free any memory or call any
    * destroy functions.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[datalist_init:/<function parameters>/datalist]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Data), @type -> DataRecord(GData**)))"
  )
  private def datalistInit() = ???

  /** Turns on flag values for a data list. This function is used to keep a
    * small number of boolean flags in an object with a data list without using
    * any additional space. It is not generally useful except in circumstances
    * where space is very tight. (It is used in the base #GObject type, for
    * example.)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[datalist_set_flags:/<function parameters>/datalist]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Data), @type -> DataRecord(GData**)))"
  )
  private def datalistSetFlags() = ???

  /** Turns off flag values for a data list. See g_datalist_unset_flags()
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[datalist_unset_flags:/<function parameters>/datalist]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Data), @type -> DataRecord(GData**)))"
  )
  private def datalistUnsetFlags() = ???

  /** Destroys the dataset, freeing all memory allocated, and calling any
    * destroy functions set for data elements.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def datasetDestroy(
      dataset_location: Ptr[Byte] /* Some(gconstpointer) */
  ): Unit /* Some(Unit) */ = g_dataset_destroy(gconstpointer(dataset_location))

  /** Calls the given function for each data element which is associated with
    * the given location. Note that this function is NOT thread-safe. So unless @dataset_location
    * can be protected from any modifications during invocation of this
    * function, it should not be called.
    *
    * @func
    *   can make changes to the dataset, but the iteration will not reflect
    *   changes made during the g_dataset_foreach() call, other than skipping
    *   over elements that are removed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[dataset_foreach:/<function parameters>/func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(DataForeachFunc), @type -> DataRecord(GDataForeachFunc)))"
  )
  private def datasetForeach() = ???

  /** Gets the data element corresponding to a #GQuark.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[dataset_id_get_data:/<function parameters>/key_id]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Quark), @type -> DataRecord(GQuark)))"
  )
  private def datasetIdGetData() = ???

  /** Removes an element, without calling its destroy notification function.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[dataset_id_remove_no_notify:/<function parameters>/key_id]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Quark), @type -> DataRecord(GQuark)))"
  )
  private def datasetIdRemoveNoNotify() = ???

  /** Sets the data element associated with the given #GQuark id, and also the
    * function to call when the data element is destroyed. Any previous data
    * with the same key is removed, and its destroy function is called.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[dataset_id_set_data_full:/<function parameters>/key_id]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Quark), @type -> DataRecord(GQuark)))"
  )
  private def datasetIdSetDataFull() = ???

  /** Returns the number of days in a month, taking leap years into account.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[date_get_days_in_month:/<function parameters>/year]: Cannot render type Type(List(),ListMap(@name -> DataRecord(DateYear), @type -> DataRecord(GDateYear)))"
  )
  private def dateGetDaysInMonth() = ???

  /** Returns the number of weeks in the year, where weeks are taken to start on
    * Monday. Will be 52 or 53. The date must be valid. (Years always have 52
    * 7-day periods, plus 1 or 2 extra days depending on whether it's a leap
    * year. This function is basically telling you how many Mondays are in the
    * year, i.e. there are 53 Mondays if one of the extra days happens to be a
    * Monday.)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[date_get_monday_weeks_in_year:/<function parameters>/year]: Cannot render type Type(List(),ListMap(@name -> DataRecord(DateYear), @type -> DataRecord(GDateYear)))"
  )
  private def dateGetMondayWeeksInYear() = ???

  /** Returns the number of weeks in the year, where weeks are taken to start on
    * Sunday. Will be 52 or 53. The date must be valid. (Years always have 52
    * 7-day periods, plus 1 or 2 extra days depending on whether it's a leap
    * year. This function is basically telling you how many Sundays are in the
    * year, i.e. there are 53 Sundays if one of the extra days happens to be a
    * Sunday.)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[date_get_sunday_weeks_in_year:/<function parameters>/year]: Cannot render type Type(List(),ListMap(@name -> DataRecord(DateYear), @type -> DataRecord(GDateYear)))"
  )
  private def dateGetSundayWeeksInYear() = ???

  /** Returns %TRUE if the year is a leap year.
    *
    * For the purposes of this function, leap year is every year divisible by 4
    * unless that year is divisible by 100. If it is divisible by 100 it would
    * be a leap year only if that year is also divisible by 400.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[date_is_leap_year:/<function parameters>/year]: Cannot render type Type(List(),ListMap(@name -> DataRecord(DateYear), @type -> DataRecord(GDateYear)))"
  )
  private def dateIsLeapYear() = ???

  /** Generates a printed representation of the date, in a
    * [locale][setlocale]-specific way. Works just like the platform's C library
    * strftime() function, but only accepts date-related formats; time-related
    * formats give undefined results. Date must be valid. Unlike strftime()
    * (which uses the locale encoding), works on a UTF-8 format string and
    * stores a UTF-8 result.
    *
    * This function does not provide any conversion specifiers in addition to
    * those implemented by the platform's C library. For example, don't expect
    * that using g_date_strftime() would make the \%F provided by the C99
    * strftime() work on Windows where the C library only complies to C89.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[date_strftime:/<function parameters>/date]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Date), @type -> DataRecord(const GDate*)))"
  )
  private def dateStrftime() = ???

  /** Returns %TRUE if the day of the month is valid (a day is valid if it's
    * between 1 and 31 inclusive).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[date_valid_day:/<function parameters>/day]: Cannot render type Type(List(),ListMap(@name -> DataRecord(DateDay), @type -> DataRecord(GDateDay)))"
  )
  private def dateValidDay() = ???

  /** Returns %TRUE if the day-month-year triplet forms a valid, existing day in
    * the range of days #GDate understands (Year 1 or later, no more than a few
    * thousand years in the future).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[date_valid_dmy:/<function parameters>/day]: Cannot render type Type(List(),ListMap(@name -> DataRecord(DateDay), @type -> DataRecord(GDateDay)))"
  )
  private def dateValidDmy() = ???

  /** Returns %TRUE if the Julian day is valid. Anything greater than zero is
    * basically a valid Julian, though there is a 32-bit limit.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def dateValidJulian(
      julian_date: UInt /* Some(guint32) */
  ): Boolean /* Some(gboolean) */ =
    g_date_valid_julian(guint32(julian_date)).value.!=(0)

  /** Returns %TRUE if the month value is valid. The 12 #GDateMonth enumeration
    * values are the only valid months.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def dateValidMonth(
      month: DateMonth /* Some(GDateMonth) */
  ): Boolean /* Some(gboolean) */ = g_date_valid_month(month.raw).value.!=(0)

  /** Returns %TRUE if the weekday is valid. The seven #GDateWeekday enumeration
    * values are the only valid weekdays.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def dateValidWeekday(
      weekday: DateWeekday /* Some(GDateWeekday) */
  ): Boolean /* Some(gboolean) */ =
    g_date_valid_weekday(weekday.raw).value.!=(0)

  /** Returns %TRUE if the year is valid. Any year greater than 0 is valid,
    * though there is a 16-bit limit to what #GDate will understand.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[date_valid_year:/<function parameters>/year]: Cannot render type Type(List(),ListMap(@name -> DataRecord(DateYear), @type -> DataRecord(GDateYear)))"
  )
  private def dateValidYear() = ???

  /** This is a variant of g_dgettext() that allows specifying a locale category
    * instead of always using `LC_MESSAGES`. See g_dgettext() for more
    * information about how this functions differs from calling dcgettext()
    * directly.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def dcgettext(
      domain: Option[String /* Some(Ptr[gchar]) */ ],
      msgid: String /* Some(Ptr[gchar]) */,
      category: Int /* Some(gint) */
  )(using Zone): String /* Some(Ptr[gchar]) */ = fromCString(
    g_dcgettext(
      domain
        .map[Ptr[gchar]](o => toCString(o).asInstanceOf[Ptr[gchar]])
        .getOrElse(null.asInstanceOf[Ptr[gchar]]),
      toCString(msgid).asInstanceOf[Ptr[gchar]],
      gint(category)
    ).asInstanceOf
  )

  /**  This function is a wrapper of dgettext() which does not translate
    *  the message if the default domain as set with textdomain() has no
    *  translations for the current locale.
    *
    *  The advantage of using this function over dgettext() proper is that
    *  libraries using this function (like GTK) will not use translations
    *  if the application using the library does not have translations for
    *  the current locale.  This results in a consistent English-only
    *  interface instead of one having partial translations.  For this
    *  feature to work, the call to textdomain() and setlocale() should
    *  precede any g_dgettext() invocations.  For GTK, it means calling
    *  textdomain() before gtk_init or its variants.
    *
    *  This function disables translations if and only if upon its first
    *  call all the following conditions hold:
    *
    *  - @domain is not %NULL
    *
    *  - textdomain() has been called to set a default text domain
    *
    *  - there is no translations available for the default text domain
    *    and the current locale
    *
    *  - current locale is not "C" or any English locales (those
    *    starting with "en_")
    *
    *  Note that this behavior may not be desired for example if an application
    *  has its untranslated messages in a language other than English. In those
    *  cases the application should call textdomain() after initializing GTK.
    *
    *  Applications should normally not use this function directly,
    *  but use the _() macro for translations.
    *
    *  NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT BE APPLICABLE TO SCALA
    */
  def dgettext(
      domain: Option[String /* Some(Ptr[gchar]) */ ],
      msgid: String /* Some(Ptr[gchar]) */
  )(using Zone): String /* Some(Ptr[gchar]) */ = fromCString(
    g_dgettext(
      domain
        .map[Ptr[gchar]](o => toCString(o).asInstanceOf[Ptr[gchar]])
        .getOrElse(null.asInstanceOf[Ptr[gchar]]),
      toCString(msgid).asInstanceOf[Ptr[gchar]]
    ).asInstanceOf
  )

  /** Creates a subdirectory in the preferred directory for temporary files (as
    * returned by g_get_tmp_dir()).
    *
    * @tmpl
    *   should be a string in the GLib file name encoding containing a sequence
    *   of six 'X' characters, as the parameter to g_mkstemp(). However, unlike
    *   these functions, the template should only be a basename, no directory
    *   components are allowed. If template is %NULL, a default template is
    *   used.
    *
    * Note that in contrast to g_mkdtemp() (and mkdtemp()) @tmpl is not
    * modified, and might thus be a read-only literal string.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def dirMakeTmp(tmpl: Option[String /* Some(Ptr[gchar]) */ ])(using
      Zone
  ): GResult[String /* Some(Ptr[gchar]) */ ] = GResult.wrap(__errorPtr =>
    fromCString(
      g_dir_make_tmp(
        tmpl
          .map[Ptr[gchar]](o => toCString(o).asInstanceOf[Ptr[gchar]])
          .getOrElse(null.asInstanceOf[Ptr[gchar]]),
        __errorPtr
      ).asInstanceOf
    )
  )

  /** Compares two #gpointer arguments and returns %TRUE if they are equal. It
    * can be passed to g_hash_table_new() as the @key_equal_func parameter, when
    * using opaque pointers compared by pointer value as keys in a #GHashTable.
    *
    * This equality function is also appropriate for keys that are integers
    * stored in pointers, such as `GINT_TO_POINTER (n)`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def directEqual(
      v1: Option[Ptr[Byte] /* Some(gconstpointer) */ ],
      v2: Option[Ptr[Byte] /* Some(gconstpointer) */ ]
  ): Boolean /* Some(gboolean) */ = g_direct_equal(
    v1.map[gconstpointer](o => gconstpointer(o))
      .getOrElse(null.asInstanceOf[gconstpointer]),
    v2.map[gconstpointer](o => gconstpointer(o))
      .getOrElse(null.asInstanceOf[gconstpointer])
  ).value.!=(0)

  /** Converts a gpointer to a hash value. It can be passed to
    * g_hash_table_new() as the @hash_func parameter, when using opaque pointers
    * compared by pointer value as keys in a #GHashTable.
    *
    * This hash function is also appropriate for keys that are integers stored
    * in pointers, such as `GINT_TO_POINTER (n)`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def directHash(
      v: Option[Ptr[Byte] /* Some(gconstpointer) */ ]
  ): UInt /* Some(guint) */ = g_direct_hash(
    v.map[gconstpointer](o => gconstpointer(o))
      .getOrElse(null.asInstanceOf[gconstpointer])
  ).value

  /** This function is a wrapper of dngettext() which does not translate the
    * message if the default domain as set with textdomain() has no translations
    * for the current locale.
    *
    * See g_dgettext() for details of how this differs from dngettext() proper.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def dngettext(
      domain: Option[String /* Some(Ptr[gchar]) */ ],
      msgid: String /* Some(Ptr[gchar]) */,
      msgid_plural: String /* Some(Ptr[gchar]) */,
      n: CUnsignedLongInt /* Some(gulong) */
  )(using Zone): String /* Some(Ptr[gchar]) */ = fromCString(
    g_dngettext(
      domain
        .map[Ptr[gchar]](o => toCString(o).asInstanceOf[Ptr[gchar]])
        .getOrElse(null.asInstanceOf[Ptr[gchar]]),
      toCString(msgid).asInstanceOf[Ptr[gchar]],
      toCString(msgid_plural).asInstanceOf[Ptr[gchar]],
      gulong(n)
    ).asInstanceOf
  )

  /** Compares the two #gdouble values being pointed to and returns %TRUE if
    * they are equal. It can be passed to g_hash_table_new() as the @key_equal_func
    * parameter, when using non-%NULL pointers to doubles as keys in a
    * #GHashTable.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def doubleEqual(
      v1: Ptr[Byte] /* Some(gconstpointer) */,
      v2: Ptr[Byte] /* Some(gconstpointer) */
  ): Boolean /* Some(gboolean) */ =
    g_double_equal(gconstpointer(v1), gconstpointer(v2)).value.!=(0)

  /** Converts a pointer to a #gdouble to a hash value. It can be passed to
    * g_hash_table_new() as the @hash_func parameter, It can be passed to
    * g_hash_table_new() as the @hash_func parameter, when using non-%NULL
    * pointers to doubles as keys in a #GHashTable.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def doubleHash(
      v: Ptr[Byte] /* Some(gconstpointer) */
  ): UInt /* Some(guint) */ = g_double_hash(gconstpointer(v)).value

  /** This function is a variant of g_dgettext() which supports a disambiguating
    * message context. GNU gettext uses the '\004' character to separate the
    * message context and message id in @msgctxtid. If 0 is passed as @msgidoffset,
    * this function will fall back to trying to use the deprecated convention of
    * using "|" as a separation character.
    *
    * This uses g_dgettext() internally. See that functions for differences with
    * dgettext() proper.
    *
    * Applications should normally not use this function directly, but use the
    * C_() macro for translations with context.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def dpgettext(
      domain: Option[String /* Some(Ptr[gchar]) */ ],
      msgctxtid: String /* Some(Ptr[gchar]) */,
      msgidoffset: CUnsignedLongInt /* Some(gsize) */
  )(using Zone): String /* Some(Ptr[gchar]) */ = fromCString(
    g_dpgettext(
      domain
        .map[Ptr[gchar]](o => toCString(o).asInstanceOf[Ptr[gchar]])
        .getOrElse(null.asInstanceOf[Ptr[gchar]]),
      toCString(msgctxtid).asInstanceOf[Ptr[gchar]],
      gsize(msgidoffset)
    ).asInstanceOf
  )

  /** This function is a variant of g_dgettext() which supports a disambiguating
    * message context. GNU gettext uses the '\004' character to separate the
    * message context and message id in @msgctxtid.
    *
    * This uses g_dgettext() internally. See that functions for differences with
    * dgettext() proper.
    *
    * This function differs from C_() in that it is not a macro and thus you may
    * use non-string-literals as context and msgid arguments.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def dpgettext2(
      domain: Option[String /* Some(Ptr[gchar]) */ ],
      context: String /* Some(Ptr[gchar]) */,
      msgid: String /* Some(Ptr[gchar]) */
  )(using Zone): String /* Some(Ptr[gchar]) */ = fromCString(
    g_dpgettext2(
      domain
        .map[Ptr[gchar]](o => toCString(o).asInstanceOf[Ptr[gchar]])
        .getOrElse(null.asInstanceOf[Ptr[gchar]]),
      toCString(context).asInstanceOf[Ptr[gchar]],
      toCString(msgid).asInstanceOf[Ptr[gchar]]
    ).asInstanceOf
  )

  /** Returns the value of the environment variable @variable in the provided
    * list @envp.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[environ_getenv:/<function parameters>/envp]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(filename)))),ListMap(@type -> DataRecord(gchar**)))"
  )
  private def environGetenv() = ???

  /** Sets the environment variable @variable in the provided list
    * @envp
    *   to @value.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[environ_setenv:/<function parameters>/envp]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(filename)))),ListMap(@type -> DataRecord(gchar**)))"
  )
  private def environSetenv() = ???

  /** Removes the environment variable @variable from the provided environment @envp.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[environ_unsetenv:/<function parameters>/envp]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(filename)))),ListMap(@type -> DataRecord(gchar**)))"
  )
  private def environUnsetenv() = ???

  /** Gets a #GFileError constant based on the passed-in @err_no.
    *
    * For example, if you pass in `EEXIST` this function returns
    * %G_FILE_ERROR_EXIST. Unlike `errno` values, you can portably assume that
    * all #GFileError values will exist.
    *
    * Normally a #GFileError value goes into a #GError returned from a function
    * that manipulates files. So you would use g_file_error_from_errno() when
    * constructing a #GError.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def fileErrorFromErrno(
      err_no: Int /* Some(gint) */
  ): FileError /* Some(GFileError) */ =
    FileError.fromRaw(g_file_error_from_errno(gint(err_no)))

  @annotation.compileTimeOnly(
    "[file_error_quark:/<return type>]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Quark), @type -> DataRecord(GQuark)))"
  )
  private def fileErrorQuark() = ???

  /** Reads an entire file into allocated memory, with good error checking.
    *
    * If the call was successful, it returns %TRUE and sets @contents to the
    * file contents and @length to the length of the file contents in bytes. The
    * string stored in @contents will be nul-terminated, so for text files you
    * can pass %NULL for the @length argument. If the call was not successful,
    * it returns %FALSE and sets @error. The error domain is %G_FILE_ERROR.
    * Possible error codes are those in the #GFileError enumeration. In the
    * error case,
    * @contents
    *   is set to %NULL and @length is set to zero.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[file_get_contents:]: Function file_get_contents contains an OUT parameter, which is not supported yet"
  )
  private def fileGetContents() = ???

  /** Opens a file for writing in the preferred directory for temporary files
    * (as returned by g_get_tmp_dir()).
    *
    * @tmpl
    *   should be a string in the GLib file name encoding containing a sequence
    *   of six 'X' characters, as the parameter to g_mkstemp(). However, unlike
    *   these functions, the template should only be a basename, no directory
    *   components are allowed. If template is %NULL, a default template is
    *   used.
    *
    * Note that in contrast to g_mkstemp() (and mkstemp()) @tmpl is not
    * modified, and might thus be a read-only literal string.
    *
    * Upon success, and if @name_used is non-%NULL, the actual name used is
    * returned in @name_used. This string should be freed with g_free() when not
    * needed any longer. The returned name is in the GLib file name encoding.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[file_open_tmp:]: Function file_open_tmp contains an OUT parameter, which is not supported yet"
  )
  private def fileOpenTmp() = ???

  /**  Reads the contents of the symbolic link @filename like the POSIX
    *  `readlink()` function.
    *
    *  The returned string is in the encoding used for filenames. Use
    *  g_filename_to_utf8() to convert it to UTF-8.
    *
    *  The returned string may also be a relative path. Use g_build_filename()
    *  to convert it to an absolute path:
    *
    *  |[<!-- language="C" -->
    *  g_autoptr(GError) local_error = NULL;
    *  g_autofree gchar *link_target = g_file_read_link ("/etc/localtime", &local_error);
    *
    *  if (local_error != NULL)
    *    g_error ("Error reading link: %s", local_error->message);
    *
    *  if (!g_path_is_absolute (link_target))
    *    {
    *      g_autofree gchar *absolute_link_target = g_build_filename ("/etc", link_target, NULL);
    *      g_free (link_target);
    *      link_target = g_steal_pointer (&absolute_link_target);
    *    }
    *  ]|
    *
    *  NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT BE APPLICABLE TO SCALA
    */
  def fileReadLink(filename: String /* Some(Ptr[gchar]) */ )(using
      Zone
  ): GResult[String /* Some(Ptr[gchar]) */ ] = GResult.wrap(__errorPtr =>
    fromCString(
      g_file_read_link(
        toCString(filename).asInstanceOf[Ptr[gchar]],
        __errorPtr
      ).asInstanceOf
    )
  )

  /** Writes all of @contents to a file named @filename. This is a convenience
    * wrapper around calling g_file_set_contents_full() with `flags` set to
    * `G_FILE_SET_CONTENTS_CONSISTENT | G_FILE_SET_CONTENTS_ONLY_EXISTING` and
    * `mode` set to `0666`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[file_set_contents:/<function parameters>/contents]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(guint8)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(2), @type -> DataRecord(const gchar*)))"
  )
  private def fileSetContents() = ???

  /** Writes all of @contents to a file named @filename, with good error
    * checking. If a file called @filename already exists it will be
    * overwritten.
    *
    * @flags
    *   control the properties of the write operation: whether it’s atomic, and
    *   what the tradeoff is between returning quickly or being resilient to
    *   system crashes.
    *
    * As this function performs file I/O, it is recommended to not call it
    * anywhere where blocking would cause problems, such as in the main loop of
    * a graphical application. In particular, if @flags has any value other than
    * %G_FILE_SET_CONTENTS_NONE then this function may call `fsync()`.
    *
    * If %G_FILE_SET_CONTENTS_CONSISTENT is set in @flags, the operation is
    * atomic in the sense that it is first written to a temporary file which is
    * then renamed to the final name.
    *
    * Notes:
    *
    *   - On UNIX, if @filename already exists hard links to @filename will
    *     break. Also since the file is recreated, existing permissions, access
    *     control lists, metadata etc. may be lost. If @filename is a symbolic
    *     link, the link itself will be replaced, not the linked file.
    *   - On UNIX, if @filename already exists and is non-empty, and if the
    *     system supports it (via a journalling filesystem or equivalent), and
    *     if %G_FILE_SET_CONTENTS_CONSISTENT is set in @flags, the `fsync()`
    *     call (or equivalent) will be used to ensure atomic replacement: @filename
    *     will contain either its old contents or @contents, even in the face of
    *     system power loss, the disk being unsafely removed, etc.
    *   - On UNIX, if @filename does not already exist or is empty, there is a
    *     possibility that system power loss etc. after calling this function
    *     will leave @filename empty or full of NUL bytes, depending on the
    *     underlying filesystem, unless %G_FILE_SET_CONTENTS_DURABLE and
    *     %G_FILE_SET_CONTENTS_CONSISTENT are set in @flags.
    *   - On Windows renaming a file will not remove an existing file with the
    *     new name, so on Windows there is a race condition between the existing
    *     file being removed and the temporary file being renamed.
    *   - On Windows there is no way to remove a file that is open to some
    *     process, or mapped into memory. Thus, this function will fail if
    * @filename
    *   already exists and is open.
    *
    * If the call was successful, it returns %TRUE. If the call was not
    * successful, it returns %FALSE and sets @error. The error domain is
    * %G_FILE_ERROR. Possible error codes are those in the #GFileError
    * enumeration.
    *
    * Note that the name for the temporary file is constructed by appending up
    * to 7 characters to @filename.
    *
    * If the file didn’t exist before and is created, it will be given the
    * permissions from @mode. Otherwise, the permissions of the existing file
    * may be changed to @mode depending on @flags, or they may remain unchanged.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[file_set_contents_full:/<function parameters>/contents]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(guint8)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(2), @type -> DataRecord(const gchar*)))"
  )
  private def fileSetContentsFull() = ???

  /**  Returns %TRUE if any of the tests in the bitfield @test are
    *  %TRUE. For example, `(G_FILE_TEST_EXISTS | G_FILE_TEST_IS_DIR)`
    *  will return %TRUE if the file exists; the check whether it's a
    *  directory doesn't matter since the existence test is %TRUE. With
    *  the current set of available tests, there's no point passing in
    *  more than one test at a time.
    *
    *  Apart from %G_FILE_TEST_IS_SYMLINK all tests follow symbolic links,
    *  so for a symbolic link to a regular file g_file_test() will return
    *  %TRUE for both %G_FILE_TEST_IS_SYMLINK and %G_FILE_TEST_IS_REGULAR.
    *
    *  Note, that for a dangling symbolic link g_file_test() will return
    *  %TRUE for %G_FILE_TEST_IS_SYMLINK and %FALSE for all other flags.
    *
    *  You should never use g_file_test() to test whether it is safe
    *  to perform an operation, because there is always the possibility
    *  of the condition changing before you actually perform the operation,
    *  see [TOCTOU](https://en.wikipedia.org/wiki/Time-of-check_to_time-of-use).
    *
    *  For example, you might think you could use %G_FILE_TEST_IS_SYMLINK
    *  to know whether it is safe to write to a file without being
    *  tricked into writing into a different location. It doesn't work!
    *
    *  |[<!-- language="C" -->
    *   // DON'T DO THIS
    *   if (!g_file_test (filename, G_FILE_TEST_IS_SYMLINK))
    *     {
    *       fd = g_open (filename, O_WRONLY);
    *       // write to fd
    *     }
    *
    *   // DO THIS INSTEAD
    *   fd = g_open (filename, O_WRONLY | O_NOFOLLOW | O_CLOEXEC);
    *   if (fd == -1)
    *     {
    *       // check error
    *       if (errno == ELOOP)
    *         // file is a symlink and can be ignored
    *       else
    *         // handle errors as before
    *     }
    *   else
    *     {
    *       // write to fd
    *     }
    *  ]|
    *
    *  Another thing to note is that %G_FILE_TEST_EXISTS and
    *  %G_FILE_TEST_IS_EXECUTABLE are implemented using the access()
    *  system call. This usually doesn't matter, but if your program
    *  is setuid or setgid it means that these tests will give you
    *  the answer for the real user ID and group ID, rather than the
    *  effective user ID and group ID.
    *
    *  On Windows, there are no symlinks, so testing for
    *  %G_FILE_TEST_IS_SYMLINK will always return %FALSE. Testing for
    *  %G_FILE_TEST_IS_EXECUTABLE will just check that the file exists and
    *  its name indicates that it is executable, checking for well-known
    *  extensions and those listed in the `PATHEXT` environment variable.
    *
    *  NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT BE APPLICABLE TO SCALA
    */
  def fileTest(
      filename: String /* Some(Ptr[gchar]) */,
      test: FileTest /* Some(GFileTest) */
  )(using Zone): Boolean /* Some(gboolean) */ =
    g_file_test(toCString(filename).asInstanceOf[Ptr[gchar]], test.raw).value
      .!=(0)

  /** Returns the display basename for the particular filename, guaranteed to be
    * valid UTF-8. The display name might not be identical to the filename, for
    * instance there might be problems converting it to UTF-8, and some files
    * can be translated in the display.
    *
    * If GLib cannot make sense of the encoding of @filename, as a last resort
    * it replaces unknown characters with U+FFFD, the Unicode replacement
    * character. You can search the result for the UTF-8 encoding of this
    * character (which is "\357\277\275" in octal notation) to find out if @filename
    * was in an invalid encoding.
    *
    * You must pass the whole absolute pathname to this functions so that
    * translation of well known locations can be done.
    *
    * This function is preferred over g_filename_display_name() if you know the
    * whole path, as it allows translation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def filenameDisplayBasename(
      filename: String /* Some(Ptr[gchar]) */
  )(using Zone): String /* Some(Ptr[gchar]) */ = fromCString(
    g_filename_display_basename(
      toCString(filename).asInstanceOf[Ptr[gchar]]
    ).asInstanceOf
  )

  /** Converts a filename into a valid UTF-8 string. The conversion is not
    * necessarily reversible, so you should keep the original around and use the
    * return value of this function only for display purposes. Unlike
    * g_filename_to_utf8(), the result is guaranteed to be non-%NULL even if the
    * filename actually isn't in the GLib file name encoding.
    *
    * If GLib cannot make sense of the encoding of @filename, as a last resort
    * it replaces unknown characters with U+FFFD, the Unicode replacement
    * character. You can search the result for the UTF-8 encoding of this
    * character (which is "\357\277\275" in octal notation) to find out if @filename
    * was in an invalid encoding.
    *
    * If you know the whole pathname of the file you should use
    * g_filename_display_basename(), since that allows location-based
    * translation of filenames.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def filenameDisplayName(
      filename: String /* Some(Ptr[gchar]) */
  )(using Zone): String /* Some(Ptr[gchar]) */ = fromCString(
    g_filename_display_name(
      toCString(filename).asInstanceOf[Ptr[gchar]]
    ).asInstanceOf
  )

  /** Converts an escaped ASCII-encoded URI to a local filename in the encoding
    * used for filenames.
    *
    * Since GLib 2.78, the query string and fragment can be present in the URI,
    * but are not part of the resulting filename. We take inspiration from
    * https://url.spec.whatwg.org/#file-state, but we don't support the entire
    * standard.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[filename_from_uri:]: Function filename_from_uri contains an OUT parameter, which is not supported yet"
  )
  private def filenameFromUri() = ???

  /** Converts a string from UTF-8 to the encoding GLib uses for filenames. Note
    * that on Windows GLib uses UTF-8 for filenames; on other platforms, this
    * function indirectly depends on the [current locale][setlocale].
    *
    * The input string shall not contain nul characters even if the @len
    * argument is positive. A nul character found inside the string will result
    * in error %G_CONVERT_ERROR_ILLEGAL_SEQUENCE. If the filename encoding is
    * not UTF-8 and the conversion output contains a nul character, the error
    * %G_CONVERT_ERROR_EMBEDDED_NUL is set and the function returns %NULL.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[filename_from_utf8:]: Function filename_from_utf8 contains an OUT parameter, which is not supported yet"
  )
  private def filenameFromUtf8() = ???

  /** Converts an absolute filename to an escaped ASCII-encoded URI, with the
    * path component following Section 3.3. of RFC 2396.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def filenameToUri(
      filename: String /* Some(Ptr[gchar]) */,
      hostname: Option[String /* Some(Ptr[gchar]) */ ]
  )(using Zone): GResult[String /* Some(Ptr[gchar]) */ ] =
    GResult.wrap(__errorPtr =>
      fromCString(
        g_filename_to_uri(
          toCString(filename).asInstanceOf[Ptr[gchar]],
          hostname
            .map[Ptr[gchar]](o => toCString(o).asInstanceOf[Ptr[gchar]])
            .getOrElse(null.asInstanceOf[Ptr[gchar]]),
          __errorPtr
        ).asInstanceOf
      )
    )

  /** Converts a string which is in the encoding used by GLib for filenames into
    * a UTF-8 string. Note that on Windows GLib uses UTF-8 for filenames; on
    * other platforms, this function indirectly depends on the [current
    * locale][setlocale].
    *
    * The input string shall not contain nul characters even if the @len
    * argument is positive. A nul character found inside the string will result
    * in error %G_CONVERT_ERROR_ILLEGAL_SEQUENCE. If the source encoding is not
    * UTF-8 and the conversion output contains a nul character, the error
    * %G_CONVERT_ERROR_EMBEDDED_NUL is set and the function returns %NULL. Use
    * g_convert() to produce output that may contain embedded nul characters.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[filename_to_utf8:]: Function filename_to_utf8 contains an OUT parameter, which is not supported yet"
  )
  private def filenameToUtf8() = ???

  /** Locates the first executable named @program in the user's path, in the
    * same way that execvp() would locate it. Returns an allocated string with
    * the absolute path name, or %NULL if the program is not found in the path.
    * If @program is already an absolute path, returns a copy of
    * @program
    *   if @program exists and is executable, and %NULL otherwise.
    *
    * On Windows, if @program does not have a file type suffix, tries with the
    * suffixes .exe, .cmd, .bat and .com, and the suffixes in the `PATHEXT`
    * environment variable.
    *
    * On Windows, it looks for the file in the same way as CreateProcess()
    * would. This means first in the directory where the executing program was
    * loaded from, then in the current directory, then in the Windows 32-bit
    * system directory, then in the Windows directory, and finally in the
    * directories in the `PATH` environment variable. If the program is found,
    * the return value contains the full name including the type suffix.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def findProgramInPath(
      program: String /* Some(Ptr[gchar]) */
  )(using Zone): String /* Some(Ptr[gchar]) */ = fromCString(
    g_find_program_in_path(
      toCString(program).asInstanceOf[Ptr[gchar]]
    ).asInstanceOf
  )

  /** Formats a size (for example the size of a file) into a human readable
    * string. Sizes are rounded to the nearest size prefix (kB, MB, GB) and are
    * displayed rounded to the nearest tenth. E.g. the file size 3292528 bytes
    * will be converted into the string "3.2 MB". The returned string is UTF-8,
    * and may use a non-breaking space to separate the number and units, to
    * ensure they aren’t separated when line wrapped.
    *
    * The prefix units base is 1000 (i.e. 1 kB is 1000 bytes).
    *
    * This string should be freed with g_free() when not needed any longer.
    *
    * See g_format_size_full() for more options about how the size might be
    * formatted.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def formatSize(
      size: CUnsignedLongInt /* Some(guint64) */
  )(using Zone): String /* Some(Ptr[gchar]) */ = fromCString(
    g_format_size(guint64(size)).asInstanceOf
  )

  /** Formats a size (for example the size of a file) into a human readable
    * string. Sizes are rounded to the nearest size prefix (KB, MB, GB) and are
    * displayed rounded to the nearest tenth. E.g. the file size 3292528 bytes
    * will be converted into the string "3.1 MB".
    *
    * The prefix units base is 1024 (i.e. 1 KB is 1024 bytes).
    *
    * This string should be freed with g_free() when not needed any longer.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def formatSizeForDisplay(
      size: gint64 /* Some(goffset) */
  )(using Zone): String /* Some(Ptr[gchar]) */ = fromCString(
    g_format_size_for_display(goffset(size)).asInstanceOf
  )

  /** Formats a size.
    *
    * This function is similar to g_format_size() but allows for flags that
    * modify the output. See #GFormatSizeFlags.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def formatSizeFull(
      size: CUnsignedLongInt /* Some(guint64) */,
      flags: FormatSizeFlags /* Some(GFormatSizeFlags) */
  )(using Zone): String /* Some(Ptr[gchar]) */ = fromCString(
    g_format_size_full(guint64(size), flags.raw).asInstanceOf
  )

  /** An implementation of the standard fprintf() function which supports
    * positional parameters, as specified in the Single Unix Specification.
    *
    * `glib/gprintf.h` must be explicitly included in order to use this
    * function.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[fprintf:]: Method g_fprintf has no target types"
  )
  private def fprintf() = ???

  /** Frees the memory pointed to by @mem.
    *
    * If you know the allocated size of @mem, calling g_free_sized() may be
    * faster, depending on the libc implementation in use.
    *
    * Starting from GLib 2.78, this may happen automatically in case a GCC
    * compatible compiler is used with some optimization level and the allocated
    * size is known at compile time (see [documentation of
    * `__builtin_object_size()`](https://gcc.gnu.org/onlinedocs/gcc/Object-Size-Checking.html)
    * to understand its caveats).
    *
    * If @mem is %NULL it simply returns, so there is no need to check @mem
    * against %NULL before calling this function.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def free(
      mem: Option[Ptr[Byte] /* Some(gpointer) */ ]
  ): Unit /* Some(Unit) */ = g_free(
    mem.map[gpointer](o => gpointer(o)).getOrElse(null.asInstanceOf[gpointer])
  )

  /** Frees the memory pointed to by @mem, assuming it is has the given @size.
    *
    * If @mem is %NULL this is a no-op (and @size is ignored).
    *
    * It is an error if @size doesn’t match the size passed when @mem was
    * allocated. @size is passed to this function to allow optimizations in the
    * allocator. If you don’t know the allocation size, use g_free() instead.
    *
    * In case a GCC compatible compiler is used, this function may be used
    * automatically via g_free() if the allocated size is known at compile time,
    * since GLib 2.78.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def freeSized(
      mem: Option[Ptr[Byte] /* Some(gpointer) */ ],
      size: CSize /* Some(size_t) */
  ): Unit /* Some(Unit) */ = g_free_sized(
    mem.map[gpointer](o => gpointer(o)).getOrElse(null.asInstanceOf[gpointer]),
    gsize(size).asInstanceOf
  )

  /** Gets a human-readable name for the application, as set by
    * g_set_application_name(). This name should be localized if possible, and
    * is intended for display to the user. Contrast with g_get_prgname(), which
    * gets a non-localized name. If g_set_application_name() has not been
    * called, returns the result of g_get_prgname() (which may be %NULL if
    * g_set_prgname() has also not been called).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getApplicationName()(using Zone): String /* Some(Ptr[gchar]) */ =
    fromCString(g_get_application_name().asInstanceOf)

  /** Obtains the character set for the [current locale][setlocale]; you might
    * use this character set as an argument to g_convert(), to convert from the
    * current locale's encoding to some other encoding. (Frequently
    * g_locale_to_utf8() and g_locale_from_utf8() are nice shortcuts, though.)
    *
    * On Windows the character set returned by this function is the so-called
    * system default ANSI code-page. That is the character set used by the
    * "narrow" versions of C library and Win32 functions that handle file names.
    * It might be different from the character set used by the C library's
    * current locale.
    *
    * On Linux, the character set is found by consulting nl_langinfo() if
    * available. If not, the environment variables `LC_ALL`, `LC_CTYPE`, `LANG`
    * and `CHARSET` are queried in order. nl_langinfo() returns the C locale if
    * no locale has been loaded by setlocale().
    *
    * The return value is %TRUE if the locale's encoding is UTF-8, in that case
    * you can perhaps avoid calling g_convert().
    *
    * The string returned in @charset is not allocated, and should not be freed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[get_charset:]: Function get_charset contains an OUT parameter, which is not supported yet"
  )
  private def getCharset() = ???

  /** Gets the character set for the current locale.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getCodeset()(using Zone): String /* Some(Ptr[gchar]) */ = fromCString(
    g_get_codeset().asInstanceOf
  )

  /** Obtains the character set used by the console attached to the process,
    * which is suitable for printing output to the terminal.
    *
    * Usually this matches the result returned by g_get_charset(), but in
    * environments where the locale's character set does not match the encoding
    * of the console this function tries to guess a more suitable value instead.
    *
    * On Windows the character set returned by this function is the output code
    * page used by the console associated with the calling process. If the
    * codepage can't be determined (for example because there is no console
    * attached) UTF-8 is assumed.
    *
    * The return value is %TRUE if the locale's encoding is UTF-8, in that case
    * you can perhaps avoid calling g_convert().
    *
    * The string returned in @charset is not allocated, and should not be freed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[get_console_charset:]: Function get_console_charset contains an OUT parameter, which is not supported yet"
  )
  private def getConsoleCharset() = ???

  /** Gets the current directory.
    *
    * The returned string should be freed when no longer needed. The encoding of
    * the returned string is system defined. On Windows, it is always UTF-8.
    *
    * Since GLib 2.40, this function will return the value of the "PWD"
    * environment variable if it is set and it happens to be the same as the
    * current directory. This can make a difference in the case that the current
    * directory is the target of a symbolic link.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getCurrentDir()(using Zone): String /* Some(Ptr[gchar]) */ = fromCString(
    g_get_current_dir().asInstanceOf
  )

  /** Equivalent to the UNIX gettimeofday() function, but portable.
    *
    * You may find g_get_real_time() to be more convenient.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[get_current_time:/<function parameters>/result]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TimeVal), @type -> DataRecord(GTimeVal*)))"
  )
  private def getCurrentTime() = ???

  /** Gets the list of environment variables for the current process.
    *
    * The list is %NULL terminated and each item in the list is of the form
    * 'NAME=VALUE'.
    *
    * This is equivalent to direct access to the 'environ' global variable,
    * except portable.
    *
    * The return value is freshly allocated and it should be freed with
    * g_strfreev() when it is no longer needed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[get_environ:/<return type>]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(filename)))),ListMap(@type -> DataRecord(gchar**)))"
  )
  private def getEnviron() = ???

  /** Determines the preferred character sets used for filenames. The first
    * character set from the @charsets is the filename encoding, the subsequent
    * character sets are used when trying to generate a displayable
    * representation of a filename, see g_filename_display_name().
    *
    * On Unix, the character sets are determined by consulting the environment
    * variables `G_FILENAME_ENCODING` and `G_BROKEN_FILENAMES`. On Windows, the
    * character set used in the GLib API is always UTF-8 and said environment
    * variables have no effect.
    *
    * `G_FILENAME_ENCODING` may be set to a comma-separated list of character
    * set names. The special token "\@locale" is taken to mean the character set
    * for the [current locale][setlocale]. If `G_FILENAME_ENCODING` is not set,
    * but `G_BROKEN_FILENAMES` is, the character set of the current locale is
    * taken as the filename encoding. If neither environment variable is set,
    * UTF-8 is taken as the filename encoding, but the character set of the
    * current locale is also put in the list of encodings.
    *
    * The returned @charsets belong to GLib and must not be freed.
    *
    * Note that on Unix, regardless of the locale character set or
    * `G_FILENAME_ENCODING` value, the actual file names present on a system
    * might be in any random encoding or just gibberish.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[get_filename_charsets:]: Function get_filename_charsets contains an OUT parameter, which is not supported yet"
  )
  private def getFilenameCharsets() = ???

  /** Gets the current user's home directory.
    *
    * As with most UNIX tools, this function will return the value of the `HOME`
    * environment variable if it is set to an existing absolute path name,
    * falling back to the `passwd` file in the case that it is unset.
    *
    * If the path given in `HOME` is non-absolute, does not exist, or is not a
    * directory, the result is undefined.
    *
    * Before version 2.36 this function would ignore the `HOME` environment
    * variable, taking the value from the `passwd` database instead. This was
    * changed to increase the compatibility of GLib with other programs (and the
    * XDG basedir specification) and to increase testability of programs based
    * on GLib (by making it easier to run them from test frameworks).
    *
    * If your program has a strong requirement for either the new or the old
    * behaviour (and if you don't wish to increase your GLib dependency to
    * ensure that the new behaviour is in effect) then you should either
    * directly check the `HOME` environment variable yourself or unset it before
    * calling any functions in GLib.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getHomeDir()(using Zone): String /* Some(Ptr[gchar]) */ = fromCString(
    g_get_home_dir().asInstanceOf
  )

  /** Return a name for the machine.
    *
    * The returned name is not necessarily a fully-qualified domain name, or
    * even present in DNS or some other name service at all. It need not even be
    * unique on your local network or site, but usually it is. Callers should
    * not rely on the return value having any specific properties like
    * uniqueness for security purposes. Even if the name of the machine is
    * changed while an application is running, the return value from this
    * function does not change. The returned string is owned by GLib and should
    * not be modified or freed. If no name can be determined, a default fixed
    * string "localhost" is returned.
    *
    * The encoding of the returned string is UTF-8.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getHostName()(using Zone): String /* Some(Ptr[gchar]) */ = fromCString(
    g_get_host_name().asInstanceOf
  )

  /** Computes a list of applicable locale names, which can be used to e.g.
    * construct locale-dependent filenames or search paths. The returned list is
    * sorted from most desirable to least desirable and always contains the
    * default locale "C".
    *
    * For example, if LANGUAGE=de:en_US, then the returned list is "de",
    * "en_US", "en", "C".
    *
    * This function consults the environment variables `LANGUAGE`, `LC_ALL`,
    * `LC_MESSAGES` and `LANG` to find the list of locales specified by the
    * user.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[get_language_names:/<return type>]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(utf8)))),ListMap(@type -> DataRecord(const gchar* const*)))"
  )
  private def getLanguageNames() = ???

  /** Computes a list of applicable locale names with a locale category name,
    * which can be used to construct the fallback locale-dependent filenames or
    * search paths. The returned list is sorted from most desirable to least
    * desirable and always contains the default locale "C".
    *
    * This function consults the environment variables `LANGUAGE`, `LC_ALL`,
    * @category_name,
    *   and `LANG` to find the list of locales specified by the user.
    *
    * g_get_language_names() returns
    * g_get_language_names_with_category("LC_MESSAGES").
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[get_language_names_with_category:/<return type>]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(utf8)))),ListMap(@type -> DataRecord(const gchar* const*)))"
  )
  private def getLanguageNamesWithCategory() = ???

  /** Returns a list of derived variants of @locale, which can be used to e.g.
    * construct locale-dependent filenames or search paths. The returned list is
    * sorted from most desirable to least desirable. This function handles
    * territory, charset and extra locale modifiers. See
    * [`setlocale(3)`](man:setlocale) for information about locales and their
    * format.
    *
    * @locale
    *   itself is guaranteed to be returned in the output.
    *
    * For example, if @locale is `fr_BE`, then the returned list is `fr_BE`,
    * `fr`. If @locale is `en_GB.UTF-8@euro`, then the returned list is
    * `en_GB.UTF-8@euro`, `en_GB.UTF-8`, `en_GB@euro`, `en_GB`, `en.UTF-8@euro`,
    * `en.UTF-8`, `en@euro`, `en`.
    *
    * If you need the list of variants for the current locale, use
    * g_get_language_names().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[get_locale_variants:/<return type>]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(utf8)))),ListMap(@type -> DataRecord(gchar**)))"
  )
  private def getLocaleVariants() = ???

  /** Queries the system monotonic time.
    *
    * The monotonic clock will always increase and doesn't suffer
    * discontinuities when the user (or NTP) changes the system time. It may or
    * may not continue to tick during times where the machine is suspended.
    *
    * We try to use the clock that corresponds as closely as possible to the
    * passage of time as measured by system calls such as poll() but it may not
    * always be possible to do this.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getMonotonicTime(): CLongInt /* Some(gint64) */ =
    g_get_monotonic_time().value

  /** Determine the approximate number of threads that the system will schedule
    * simultaneously for this process. This is intended to be used as a
    * parameter to g_thread_pool_new() for CPU bound tasks and similar cases.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getNumProcessors(): UInt /* Some(guint) */ = g_get_num_processors().value

  /** Get information about the operating system.
    *
    * On Linux this comes from the `/etc/os-release` file. On other systems, it
    * may come from a variety of sources. You can either use the standard key
    * names like %G_OS_INFO_KEY_NAME or pass any UTF-8 string key name. For
    * example, `/etc/os-release` provides a number of other less commonly used
    * values that may be useful. No key is guaranteed to be provided, so the
    * caller should always check if the result is %NULL.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getOsInfo(
      key_name: String /* Some(Ptr[gchar]) */
  )(using Zone): String /* Some(Ptr[gchar]) */ = fromCString(
    g_get_os_info(toCString(key_name).asInstanceOf[Ptr[gchar]]).asInstanceOf
  )

  /** Gets the name of the program. This name should not be localized, in
    * contrast to g_get_application_name().
    *
    * If you are using #GApplication the program name is set in
    * g_application_run(). In case of GDK or GTK it is set in gdk_init(), which
    * is called by gtk_init() and the #GtkApplication::startup handler. The
    * program name is found by taking the last component of @argv[0].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPrgname()(using Zone): String /* Some(Ptr[gchar]) */ = fromCString(
    g_get_prgname().asInstanceOf
  )

  /** Gets the real name of the user. This usually comes from the user's entry
    * in the `passwd` file. The encoding of the returned string is
    * system-defined. (On Windows, it is, however, always UTF-8.) If the real
    * user name cannot be determined, the string "Unknown" is returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getRealName()(using Zone): String /* Some(Ptr[gchar]) */ = fromCString(
    g_get_real_name().asInstanceOf
  )

  /** Queries the system wall-clock time.
    *
    * This call is functionally equivalent to g_get_current_time() except that
    * the return value is often more convenient than dealing with a #GTimeVal.
    *
    * You should only use this call if you are actually interested in the real
    * wall-clock time. g_get_monotonic_time() is probably more useful for
    * measuring intervals.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getRealTime(): CLongInt /* Some(gint64) */ = g_get_real_time().value

  /** Returns an ordered list of base directories in which to access system-wide
    * configuration information.
    *
    * On UNIX platforms this is determined using the mechanisms described in the
    * [XDG Base Directory
    * Specification](http://www.freedesktop.org/Standards/basedir-spec). In this
    * case the list of directories retrieved will be `XDG_CONFIG_DIRS`.
    *
    * On Windows it follows XDG Base Directory Specification if
    * `XDG_CONFIG_DIRS` is defined. If `XDG_CONFIG_DIRS` is undefined, the
    * directory that contains application data for all users is used instead. A
    * typical path is `C:\Documents and Settings\All Users\Application Data`.
    * This folder is used for application data that is not user specific. For
    * example, an application can store a spell-check dictionary, a database of
    * clip art, or a log file in the FOLDERID_ProgramData folder. This
    * information will not roam and is available to anyone using the computer.
    *
    * The return value is cached and modifying it at runtime is not supported,
    * as it’s not thread-safe to modify environment variables at runtime.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[get_system_config_dirs:/<return type>]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(filename)))),ListMap(@type -> DataRecord(const gchar* const*)))"
  )
  private def getSystemConfigDirs() = ???

  /** Returns an ordered list of base directories in which to access system-wide
    * application data.
    *
    * On UNIX platforms this is determined using the mechanisms described in the
    * [XDG Base Directory
    * Specification](http://www.freedesktop.org/Standards/basedir-spec) In this
    * case the list of directories retrieved will be `XDG_DATA_DIRS`.
    *
    * On Windows it follows XDG Base Directory Specification if `XDG_DATA_DIRS`
    * is defined. If `XDG_DATA_DIRS` is undefined, the first elements in the
    * list are the Application Data and Documents folders for All Users. (These
    * can be determined only on Windows 2000 or later and are not present in the
    * list on other Windows versions.) See documentation for
    * FOLDERID_ProgramData and FOLDERID_PublicDocuments.
    *
    * Then follows the "share" subfolder in the installation folder for the
    * package containing the DLL that calls this function, if it can be
    * determined.
    *
    * Finally the list contains the "share" subfolder in the installation folder
    * for GLib, and in the installation folder for the package the application's
    * .exe file belongs to.
    *
    * The installation folders above are determined by looking up the folder
    * where the module (DLL or EXE) in question is located. If the folder's name
    * is "bin", its parent is used, otherwise the folder itself.
    *
    * Note that on Windows the returned list can vary depending on where this
    * function is called.
    *
    * The return value is cached and modifying it at runtime is not supported,
    * as it’s not thread-safe to modify environment variables at runtime.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[get_system_data_dirs:/<return type>]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(filename)))),ListMap(@type -> DataRecord(const gchar* const*)))"
  )
  private def getSystemDataDirs() = ???

  /** Gets the directory to use for temporary files.
    *
    * On UNIX, this is taken from the `TMPDIR` environment variable. If the
    * variable is not set, `P_tmpdir` is used, as defined by the system C
    * library. Failing that, a hard-coded default of "/tmp" is returned.
    *
    * On Windows, the `TEMP` environment variable is used, with the root
    * directory of the Windows installation (eg: "C:\") used as a default.
    *
    * The encoding of the returned string is system-defined. On Windows, it is
    * always UTF-8. The return value is never %NULL or the empty string.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getTmpDir()(using Zone): String /* Some(Ptr[gchar]) */ = fromCString(
    g_get_tmp_dir().asInstanceOf
  )

  /** Returns a base directory in which to store non-essential, cached data
    * specific to particular user.
    *
    * On UNIX platforms this is determined using the mechanisms described in the
    * [XDG Base Directory
    * Specification](http://www.freedesktop.org/Standards/basedir-spec). In this
    * case the directory retrieved will be `XDG_CACHE_HOME`.
    *
    * On Windows it follows XDG Base Directory Specification if `XDG_CACHE_HOME`
    * is defined. If `XDG_CACHE_HOME` is undefined, the directory that serves as
    * a common repository for temporary Internet files is used instead. A
    * typical path is
    * `C:\Documents and Settings\username\Local Settings\Temporary Internet Files`.
    * See the [documentation for
    * `FOLDERID_InternetCache`](https://docs.microsoft.com/en-us/windows/win32/shell/knownfolderid).
    *
    * The return value is cached and modifying it at runtime is not supported,
    * as it’s not thread-safe to modify environment variables at runtime.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getUserCacheDir()(using Zone): String /* Some(Ptr[gchar]) */ =
    fromCString(g_get_user_cache_dir().asInstanceOf)

  /** Returns a base directory in which to store user-specific application
    * configuration information such as user preferences and settings.
    *
    * On UNIX platforms this is determined using the mechanisms described in the
    * [XDG Base Directory
    * Specification](http://www.freedesktop.org/Standards/basedir-spec). In this
    * case the directory retrieved will be `XDG_CONFIG_HOME`.
    *
    * On Windows it follows XDG Base Directory Specification if
    * `XDG_CONFIG_HOME` is defined. If `XDG_CONFIG_HOME` is undefined, the
    * folder to use for local (as opposed to roaming) application data is used
    * instead. See the [documentation for
    * `FOLDERID_LocalAppData`](https://docs.microsoft.com/en-us/windows/win32/shell/knownfolderid).
    * Note that in this case on Windows it will be the same as what
    * g_get_user_data_dir() returns.
    *
    * The return value is cached and modifying it at runtime is not supported,
    * as it’s not thread-safe to modify environment variables at runtime.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getUserConfigDir()(using Zone): String /* Some(Ptr[gchar]) */ =
    fromCString(g_get_user_config_dir().asInstanceOf)

  /** Returns a base directory in which to access application data such as icons
    * that is customized for a particular user.
    *
    * On UNIX platforms this is determined using the mechanisms described in the
    * [XDG Base Directory
    * Specification](http://www.freedesktop.org/Standards/basedir-spec). In this
    * case the directory retrieved will be `XDG_DATA_HOME`.
    *
    * On Windows it follows XDG Base Directory Specification if `XDG_DATA_HOME`
    * is defined. If `XDG_DATA_HOME` is undefined, the folder to use for local
    * (as opposed to roaming) application data is used instead. See the
    * [documentation for
    * `FOLDERID_LocalAppData`](https://docs.microsoft.com/en-us/windows/win32/shell/knownfolderid).
    * Note that in this case on Windows it will be the same as what
    * g_get_user_config_dir() returns.
    *
    * The return value is cached and modifying it at runtime is not supported,
    * as it’s not thread-safe to modify environment variables at runtime.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getUserDataDir()(using Zone): String /* Some(Ptr[gchar]) */ = fromCString(
    g_get_user_data_dir().asInstanceOf
  )

  /** Gets the user name of the current user. The encoding of the returned
    * string is system-defined. On UNIX, it might be the preferred file name
    * encoding, or something else, and there is no guarantee that it is even
    * consistent on a machine. On Windows, it is always UTF-8.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getUserName()(using Zone): String /* Some(Ptr[gchar]) */ = fromCString(
    g_get_user_name().asInstanceOf
  )

  /** Returns a directory that is unique to the current user on the local
    * system.
    *
    * This is determined using the mechanisms described in the [XDG Base
    * Directory
    * Specification](http://www.freedesktop.org/Standards/basedir-spec). This is
    * the directory specified in the `XDG_RUNTIME_DIR` environment variable. In
    * the case that this variable is not set, we return the value of
    * g_get_user_cache_dir(), after verifying that it exists.
    *
    * The return value is cached and modifying it at runtime is not supported,
    * as it’s not thread-safe to modify environment variables at runtime.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getUserRuntimeDir()(using Zone): String /* Some(Ptr[gchar]) */ =
    fromCString(g_get_user_runtime_dir().asInstanceOf)

  /** Returns the full path of a special directory using its logical id.
    *
    * On UNIX this is done using the XDG special user directories. For
    * compatibility with existing practise, %G_USER_DIRECTORY_DESKTOP falls back
    * to `$HOME/Desktop` when XDG special user directories have not been set up.
    *
    * Depending on the platform, the user might be able to change the path of
    * the special directory without requiring the session to restart; GLib will
    * not reflect any change once the special directories are loaded.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getUserSpecialDir(
      directory: UserDirectory /* Some(GUserDirectory) */
  )(using Zone): String /* Some(Ptr[gchar]) */ = fromCString(
    g_get_user_special_dir(directory.raw).asInstanceOf
  )

  /** Returns a base directory in which to store state files specific to
    * particular user.
    *
    * On UNIX platforms this is determined using the mechanisms described in the
    * [XDG Base Directory
    * Specification](http://www.freedesktop.org/Standards/basedir-spec). In this
    * case the directory retrieved will be `XDG_STATE_HOME`.
    *
    * On Windows it follows XDG Base Directory Specification if `XDG_STATE_HOME`
    * is defined. If `XDG_STATE_HOME` is undefined, the folder to use for local
    * (as opposed to roaming) application data is used instead. See the
    * [documentation for
    * `FOLDERID_LocalAppData`](https://docs.microsoft.com/en-us/windows/win32/shell/knownfolderid).
    * Note that in this case on Windows it will be the same as what
    * g_get_user_data_dir() returns.
    *
    * The return value is cached and modifying it at runtime is not supported,
    * as it’s not thread-safe to modify environment variables at runtime.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getUserStateDir()(using Zone): String /* Some(Ptr[gchar]) */ =
    fromCString(g_get_user_state_dir().asInstanceOf)

  /** Returns the value of an environment variable.
    *
    * On UNIX, the name and value are byte strings which might or might not be
    * in some consistent character set and encoding. On Windows, they are in
    * UTF-8. On Windows, in case the environment variable's value contains
    * references to other environment variables, they are expanded.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getenv(
      variable: String /* Some(Ptr[gchar]) */
  )(using Zone): String /* Some(Ptr[gchar]) */ = fromCString(
    g_getenv(toCString(variable).asInstanceOf[Ptr[gchar]]).asInstanceOf
  )

  /** This is a convenience function for using a #GHashTable as a set. It is
    * equivalent to calling g_hash_table_replace() with @key as both the key and
    * the value.
    *
    * In particular, this means that if @key already exists in the hash table,
    * then the old copy of @key in the hash table is freed and @key replaces it
    * in the table.
    *
    * When a hash table only ever contains keys that have themselves as the
    * corresponding value it is able to be stored more efficiently. See the
    * discussion in the section description.
    *
    * Starting from GLib 2.40, this function returns a boolean value to indicate
    * whether the newly added value was already in the hash table or not.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[hash_table_add:/<function parameters>/hash_table]: Cannot render type Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(gpointer), @type -> DataRecord(gpointer)))), DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(gpointer), @type -> DataRecord(gpointer))))),ListMap(@name -> DataRecord(GLib.HashTable), @type -> DataRecord(GHashTable*)))"
  )
  private def hashTableAdd() = ???

  /** Checks if @key is in @hash_table.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[hash_table_contains:/<function parameters>/hash_table]: Cannot render type Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(gpointer), @type -> DataRecord(gpointer)))), DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(gpointer), @type -> DataRecord(gpointer))))),ListMap(@name -> DataRecord(GLib.HashTable), @type -> DataRecord(GHashTable*)))"
  )
  private def hashTableContains() = ???

  /** Destroys all keys and values in the #GHashTable and decrements its
    * reference count by 1. If keys and/or values are dynamically allocated, you
    * should either free them first or create the #GHashTable with destroy
    * notifiers using g_hash_table_new_full(). In the latter case the destroy
    * functions you supplied will be called on all keys and values during the
    * destruction phase.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[hash_table_destroy:/<function parameters>/hash_table]: Cannot render type Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(gpointer), @type -> DataRecord(gpointer)))), DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(gpointer), @type -> DataRecord(gpointer))))),ListMap(@name -> DataRecord(GLib.HashTable), @type -> DataRecord(GHashTable*)))"
  )
  private def hashTableDestroy() = ???

  /** Retrieves every key inside @hash_table, as a #GPtrArray. The returned data
    * is valid until changes to the hash release those keys.
    *
    * This iterates over every entry in the hash table to build its return
    * value. To iterate over the entries in a #GHashTable more efficiently, use
    * a #GHashTableIter.
    *
    * You should always unref the returned array with g_ptr_array_unref().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[hash_table_get_keys_as_ptr_array:/<function parameters>/hash_table]: Cannot render type Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(gpointer), @type -> DataRecord(gpointer)))), DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(gpointer), @type -> DataRecord(gpointer))))),ListMap(@name -> DataRecord(GLib.HashTable), @type -> DataRecord(GHashTable*)))"
  )
  private def hashTableGetKeysAsPtrArray() = ???

  /** Retrieves every value inside @hash_table, as a #GPtrArray. The returned
    * data is valid until changes to the hash release those values.
    *
    * This iterates over every entry in the hash table to build its return
    * value. To iterate over the entries in a #GHashTable more efficiently, use
    * a #GHashTableIter.
    *
    * You should always unref the returned array with g_ptr_array_unref().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[hash_table_get_values_as_ptr_array:/<function parameters>/hash_table]: Cannot render type Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(gpointer), @type -> DataRecord(gpointer)))), DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(gpointer), @type -> DataRecord(gpointer))))),ListMap(@name -> DataRecord(GLib.HashTable), @type -> DataRecord(GHashTable*)))"
  )
  private def hashTableGetValuesAsPtrArray() = ???

  /** Inserts a new key and value into a #GHashTable.
    *
    * If the key already exists in the #GHashTable its current value is replaced
    * with the new value. If you supplied a
    * @value_destroy_func
    *   when creating the #GHashTable, the old value is freed using that
    *   function. If you supplied a
    * @key_destroy_func
    *   when creating the #GHashTable, the passed key is freed using that
    *   function.
    *
    * Starting from GLib 2.40, this function returns a boolean value to indicate
    * whether the newly added value was already in the hash table or not.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[hash_table_insert:/<function parameters>/hash_table]: Cannot render type Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(gpointer), @type -> DataRecord(gpointer)))), DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(gpointer), @type -> DataRecord(gpointer))))),ListMap(@name -> DataRecord(GLib.HashTable), @type -> DataRecord(GHashTable*)))"
  )
  private def hashTableInsert() = ???

  /** Looks up a key in a #GHashTable. Note that this function cannot
    * distinguish between a key that is not present and one which is present and
    * has the value %NULL. If you need this distinction, use
    * g_hash_table_lookup_extended().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[hash_table_lookup:/<function parameters>/hash_table]: Cannot render type Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(gpointer), @type -> DataRecord(gpointer)))), DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(gpointer), @type -> DataRecord(gpointer))))),ListMap(@name -> DataRecord(GLib.HashTable), @type -> DataRecord(GHashTable*)))"
  )
  private def hashTableLookup() = ???

  /** Looks up a key in the #GHashTable, returning the original key and the
    * associated value and a #gboolean which is %TRUE if the key was found. This
    * is useful if you need to free the memory allocated for the original key,
    * for example before calling g_hash_table_remove().
    *
    * You can actually pass %NULL for @lookup_key to test whether the %NULL key
    * exists, provided the hash and equal functions of @hash_table are
    * %NULL-safe.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[hash_table_lookup_extended:]: Function hash_table_lookup_extended contains an OUT parameter, which is not supported yet"
  )
  private def hashTableLookupExtended() = ???

  /** Creates a new #GHashTable like g_hash_table_new_full() with a reference
    * count of 1.
    *
    * It inherits the hash function, the key equal function, the key destroy
    * function, as well as the value destroy function, from @other_hash_table.
    *
    * The returned hash table will be empty; it will not contain the keys or
    * values from @other_hash_table.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[hash_table_new_similar:/<function parameters>/other_hash_table]: Cannot render type Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(gpointer), @type -> DataRecord(gpointer)))), DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(gpointer), @type -> DataRecord(gpointer))))),ListMap(@name -> DataRecord(GLib.HashTable), @type -> DataRecord(GHashTable*)))"
  )
  private def hashTableNewSimilar() = ???

  /** Removes a key and its associated value from a #GHashTable.
    *
    * If the #GHashTable was created using g_hash_table_new_full(), the key and
    * value are freed using the supplied destroy functions, otherwise you have
    * to make sure that any dynamically allocated values are freed yourself.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[hash_table_remove:/<function parameters>/hash_table]: Cannot render type Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(gpointer), @type -> DataRecord(gpointer)))), DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(gpointer), @type -> DataRecord(gpointer))))),ListMap(@name -> DataRecord(GLib.HashTable), @type -> DataRecord(GHashTable*)))"
  )
  private def hashTableRemove() = ???

  /** Removes all keys and their associated values from a #GHashTable.
    *
    * If the #GHashTable was created using g_hash_table_new_full(), the keys and
    * values are freed using the supplied destroy functions, otherwise you have
    * to make sure that any dynamically allocated values are freed yourself.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[hash_table_remove_all:/<function parameters>/hash_table]: Cannot render type Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(gpointer), @type -> DataRecord(gpointer)))), DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(gpointer), @type -> DataRecord(gpointer))))),ListMap(@name -> DataRecord(GLib.HashTable), @type -> DataRecord(GHashTable*)))"
  )
  private def hashTableRemoveAll() = ???

  /** Inserts a new key and value into a #GHashTable similar to
    * g_hash_table_insert(). The difference is that if the key already exists in
    * the #GHashTable, it gets replaced by the new key. If you supplied a @value_destroy_func
    * when creating the #GHashTable, the old value is freed using that function.
    * If you supplied a @key_destroy_func when creating the #GHashTable, the old
    * key is freed using that function.
    *
    * Starting from GLib 2.40, this function returns a boolean value to indicate
    * whether the newly added value was already in the hash table or not.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[hash_table_replace:/<function parameters>/hash_table]: Cannot render type Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(gpointer), @type -> DataRecord(gpointer)))), DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(gpointer), @type -> DataRecord(gpointer))))),ListMap(@name -> DataRecord(GLib.HashTable), @type -> DataRecord(GHashTable*)))"
  )
  private def hashTableReplace() = ???

  /** Returns the number of elements contained in the #GHashTable.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[hash_table_size:/<function parameters>/hash_table]: Cannot render type Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(gpointer), @type -> DataRecord(gpointer)))), DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(gpointer), @type -> DataRecord(gpointer))))),ListMap(@name -> DataRecord(GLib.HashTable), @type -> DataRecord(GHashTable*)))"
  )
  private def hashTableSize() = ???

  /** Removes a key and its associated value from a #GHashTable without calling
    * the key and value destroy functions.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[hash_table_steal:/<function parameters>/hash_table]: Cannot render type Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(gpointer), @type -> DataRecord(gpointer)))), DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(gpointer), @type -> DataRecord(gpointer))))),ListMap(@name -> DataRecord(GLib.HashTable), @type -> DataRecord(GHashTable*)))"
  )
  private def hashTableSteal() = ???

  /** Removes all keys and their associated values from a #GHashTable without
    * calling the key and value destroy functions.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[hash_table_steal_all:/<function parameters>/hash_table]: Cannot render type Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(gpointer), @type -> DataRecord(gpointer)))), DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(gpointer), @type -> DataRecord(gpointer))))),ListMap(@name -> DataRecord(GLib.HashTable), @type -> DataRecord(GHashTable*)))"
  )
  private def hashTableStealAll() = ???

  /** Removes all keys and their associated values from a #GHashTable without
    * calling the key destroy functions, returning the keys as a #GPtrArray with
    * the free func set to the @hash_table key destroy function.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[hash_table_steal_all_keys:/<function parameters>/hash_table]: Cannot render type Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(gpointer), @type -> DataRecord(gpointer)))), DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(gpointer), @type -> DataRecord(gpointer))))),ListMap(@name -> DataRecord(GLib.HashTable), @type -> DataRecord(GHashTable*)))"
  )
  private def hashTableStealAllKeys() = ???

  /** Removes all keys and their associated values from a #GHashTable without
    * calling the value destroy functions, returning the values as a #GPtrArray
    * with the free func set to the @hash_table value destroy function.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[hash_table_steal_all_values:/<function parameters>/hash_table]: Cannot render type Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(gpointer), @type -> DataRecord(gpointer)))), DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(gpointer), @type -> DataRecord(gpointer))))),ListMap(@name -> DataRecord(GLib.HashTable), @type -> DataRecord(GHashTable*)))"
  )
  private def hashTableStealAllValues() = ???

  /** Looks up a key in the #GHashTable, stealing the original key and the
    * associated value and returning %TRUE if the key was found. If the key was
    * not found, %FALSE is returned.
    *
    * If found, the stolen key and value are removed from the hash table without
    * calling the key and value destroy functions, and ownership is transferred
    * to the caller of this method, as with g_hash_table_steal(). That is the
    * case regardless whether @stolen_key or @stolen_value output parameters are
    * requested.
    *
    * You can pass %NULL for @lookup_key, provided the hash and equal functions
    * of @hash_table are %NULL-safe.
    *
    * The dictionary implementation optimizes for having all values identical to
    * their keys, for example by using g_hash_table_add(). When stealing both
    * the key and the value from such a dictionary, the value will be %NULL.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[hash_table_steal_extended:]: Function hash_table_steal_extended contains an OUT parameter, which is not supported yet"
  )
  private def hashTableStealExtended() = ???

  /** Atomically decrements the reference count of @hash_table by one. If the
    * reference count drops to 0, all keys and values will be destroyed, and all
    * memory allocated by the hash table is released. This function is MT-safe
    * and may be called from any thread.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[hash_table_unref:/<function parameters>/hash_table]: Cannot render type Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(gpointer), @type -> DataRecord(gpointer)))), DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(gpointer), @type -> DataRecord(gpointer))))),ListMap(@name -> DataRecord(GLib.HashTable), @type -> DataRecord(GHashTable*)))"
  )
  private def hashTableUnref() = ???

  /** Destroys a #GHook, given its ID.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[hook_destroy:/<function parameters>/hook_list]: Cannot render type Type(List(),ListMap(@name -> DataRecord(HookList), @type -> DataRecord(GHookList*)))"
  )
  private def hookDestroy() = ???

  /** Removes one #GHook from a #GHookList, marking it inactive and calling
    * g_hook_unref() on it.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[hook_destroy_link:/<function parameters>/hook_list]: Cannot render type Type(List(),ListMap(@name -> DataRecord(HookList), @type -> DataRecord(GHookList*)))"
  )
  private def hookDestroyLink() = ???

  /** Calls the #GHookList @finalize_hook function if it exists, and frees the
    * memory allocated for the #GHook.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[hook_free:/<function parameters>/hook_list]: Cannot render type Type(List(),ListMap(@name -> DataRecord(HookList), @type -> DataRecord(GHookList*)))"
  )
  private def hookFree() = ???

  /** Inserts a #GHook into a #GHookList, before a given #GHook.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[hook_insert_before:/<function parameters>/hook_list]: Cannot render type Type(List(),ListMap(@name -> DataRecord(HookList), @type -> DataRecord(GHookList*)))"
  )
  private def hookInsertBefore() = ???

  /** Prepends a #GHook on the start of a #GHookList.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[hook_prepend:/<function parameters>/hook_list]: Cannot render type Type(List(),ListMap(@name -> DataRecord(HookList), @type -> DataRecord(GHookList*)))"
  )
  private def hookPrepend() = ???

  /** Decrements the reference count of a #GHook. If the reference count falls
    * to 0, the #GHook is removed from the #GHookList and g_hook_free() is
    * called to free it.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[hook_unref:/<function parameters>/hook_list]: Cannot render type Type(List(),ListMap(@name -> DataRecord(HookList), @type -> DataRecord(GHookList*)))"
  )
  private def hookUnref() = ???

  /** Tests if @hostname contains segments with an ASCII-compatible encoding of
    * an Internationalized Domain Name. If this returns %TRUE, you should decode
    * the hostname with g_hostname_to_unicode() before displaying it to the
    * user.
    *
    * Note that a hostname might contain a mix of encoded and unencoded
    * segments, and so it is possible for g_hostname_is_non_ascii() and
    * g_hostname_is_ascii_encoded() to both return %TRUE for a name.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def hostnameIsAsciiEncoded(
      hostname: String /* Some(Ptr[gchar]) */
  )(using Zone): Boolean /* Some(gboolean) */ = g_hostname_is_ascii_encoded(
    toCString(hostname).asInstanceOf[Ptr[gchar]]
  ).value.!=(0)

  /** Tests if @hostname is the string form of an IPv4 or IPv6 address. (Eg,
    * "192.168.0.1".)
    *
    * Since 2.66, IPv6 addresses with a zone-id are accepted (RFC6874).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def hostnameIsIpAddress(
      hostname: String /* Some(Ptr[gchar]) */
  )(using Zone): Boolean /* Some(gboolean) */ = g_hostname_is_ip_address(
    toCString(hostname).asInstanceOf[Ptr[gchar]]
  ).value.!=(0)

  /** Tests if @hostname contains Unicode characters. If this returns %TRUE, you
    * need to encode the hostname with g_hostname_to_ascii() before using it in
    * non-IDN-aware contexts.
    *
    * Note that a hostname might contain a mix of encoded and unencoded
    * segments, and so it is possible for g_hostname_is_non_ascii() and
    * g_hostname_is_ascii_encoded() to both return %TRUE for a name.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def hostnameIsNonAscii(
      hostname: String /* Some(Ptr[gchar]) */
  )(using Zone): Boolean /* Some(gboolean) */ = g_hostname_is_non_ascii(
    toCString(hostname).asInstanceOf[Ptr[gchar]]
  ).value.!=(0)

  /** Converts @hostname to its canonical ASCII form; an ASCII-only string
    * containing no uppercase letters and not ending with a trailing dot.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def hostnameToAscii(
      hostname: String /* Some(Ptr[gchar]) */
  )(using Zone): String /* Some(Ptr[gchar]) */ = fromCString(
    g_hostname_to_ascii(
      toCString(hostname).asInstanceOf[Ptr[gchar]]
    ).asInstanceOf
  )

  /** Converts @hostname to its canonical presentation form; a UTF-8 string in
    * Unicode normalization form C, containing no uppercase letters, no
    * forbidden characters, and no ASCII-encoded segments, and not ending with a
    * trailing dot.
    *
    * Of course if @hostname is not an internationalized hostname, then the
    * canonical presentation form will be entirely ASCII.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def hostnameToUnicode(
      hostname: String /* Some(Ptr[gchar]) */
  )(using Zone): String /* Some(Ptr[gchar]) */ = fromCString(
    g_hostname_to_unicode(
      toCString(hostname).asInstanceOf[Ptr[gchar]]
    ).asInstanceOf
  )

  /** Same as the standard UNIX routine iconv(), but may be implemented via
    * libiconv on UNIX flavors that lack a native implementation.
    *
    * GLib provides g_convert() and g_locale_to_utf8() which are likely more
    * convenient than the raw iconv wrappers.
    *
    * Note that the behaviour of iconv() for characters which are valid in the
    * input character set, but which have no representation in the output
    * character set, is implementation defined. This function may return success
    * (with a positive number of non-reversible conversions as replacement
    * characters were used), or it may return -1 and set an error such as
    * %EILSEQ, in such a situation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[iconv:]: Function iconv contains an INOUT parameter, which is not supported yet"
  )
  private def iconv() = ???

  /** Same as the standard UNIX routine iconv_open(), but may be implemented via
    * libiconv on UNIX flavors that lack a native implementation.
    *
    * GLib provides g_convert() and g_locale_to_utf8() which are likely more
    * convenient than the raw iconv wrappers.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[iconv_open:/<return type>]: Cannot render type Type(List(),ListMap(@name -> DataRecord(IConv), @type -> DataRecord(GIConv)))"
  )
  private def iconvOpen() = ???

  /** Adds a function to be called whenever there are no higher priority events
    * pending to the default main loop. The function is given the default idle
    * priority, %G_PRIORITY_DEFAULT_IDLE. If the function returns %FALSE it is
    * automatically removed from the list of event sources and will not be
    * called again.
    *
    * See [memory management of sources][mainloop-memory-management] for details
    * on how to handle the return value and memory management of @data.
    *
    * This internally creates a main loop source using g_idle_source_new() and
    * attaches it to the global #GMainContext using g_source_attach(), so the
    * callback will be invoked in whichever thread is running that main context.
    * You can do these steps manually if you need greater control or to use a
    * custom main context.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[idle_add:/<function parameters>/function]: Cannot render type Type(List(),ListMap(@name -> DataRecord(SourceFunc), @type -> DataRecord(GSourceFunc)))"
  )
  private def idleAdd() = ???

  /** Adds a function to be called whenever there are no higher priority events
    * pending.
    *
    * If the function returns %G_SOURCE_REMOVE or %FALSE it is automatically
    * removed from the list of event sources and will not be called again.
    *
    * See [memory management of sources][mainloop-memory-management] for details
    * on how to handle the return value and memory management of @data.
    *
    * This internally creates a main loop source using g_idle_source_new() and
    * attaches it to the global #GMainContext using g_source_attach(), so the
    * callback will be invoked in whichever thread is running that main context.
    * You can do these steps manually if you need greater control or to use a
    * custom main context.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[idle_add_full:/<function parameters>/function]: Cannot render type Type(List(),ListMap(@name -> DataRecord(SourceFunc), @type -> DataRecord(GSourceFunc)))"
  )
  private def idleAddFull() = ???

  /** Adds a function to be called whenever there are no higher priority events
    * pending to the default main loop. The function is given the default idle
    * priority, %G_PRIORITY_DEFAULT_IDLE.
    *
    * The function will only be called once and then the source will be
    * automatically removed from the main context.
    *
    * This function otherwise behaves like g_idle_add().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[idle_add_once:/<function parameters>/function]: Cannot render type Type(List(),ListMap(@name -> DataRecord(SourceOnceFunc), @type -> DataRecord(GSourceOnceFunc)))"
  )
  private def idleAddOnce() = ???

  /** Removes the idle function with the given data.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def idleRemoveByData(
      data: Option[Ptr[Byte] /* Some(gpointer) */ ]
  ): Boolean /* Some(gboolean) */ = g_idle_remove_by_data(
    data.map[gpointer](o => gpointer(o)).getOrElse(null.asInstanceOf[gpointer])
  ).value.!=(0)

  /** Creates a new idle source.
    *
    * The source will not initially be associated with any #GMainContext and
    * must be added to one with g_source_attach() before it will be executed.
    * Note that the default priority for idle sources is
    * %G_PRIORITY_DEFAULT_IDLE, as compared to other sources which have a
    * default priority of %G_PRIORITY_DEFAULT.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[idle_source_new:/<return type>]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Source), @type -> DataRecord(GSource*)))"
  )
  private def idleSourceNew() = ???

  /** Compares the two #gint64 values being pointed to and returns %TRUE if they
    * are equal. It can be passed to g_hash_table_new() as the @key_equal_func
    * parameter, when using non-%NULL pointers to 64-bit integers as keys in a
    * #GHashTable.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def int64Equal(
      v1: Ptr[Byte] /* Some(gconstpointer) */,
      v2: Ptr[Byte] /* Some(gconstpointer) */
  ): Boolean /* Some(gboolean) */ =
    g_int64_equal(gconstpointer(v1), gconstpointer(v2)).value.!=(0)

  /** Converts a pointer to a #gint64 to a hash value.
    *
    * It can be passed to g_hash_table_new() as the @hash_func parameter, when
    * using non-%NULL pointers to 64-bit integer values as keys in a
    * #GHashTable.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def int64Hash(
      v: Ptr[Byte] /* Some(gconstpointer) */
  ): UInt /* Some(guint) */ = g_int64_hash(gconstpointer(v)).value

  /** Compares the two #gint values being pointed to and returns %TRUE if they
    * are equal. It can be passed to g_hash_table_new() as the @key_equal_func
    * parameter, when using non-%NULL pointers to integers as keys in a
    * #GHashTable.
    *
    * Note that this function acts on pointers to #gint, not on #gint directly:
    * if your hash table's keys are of the form `GINT_TO_POINTER (n)`, use
    * g_direct_equal() instead.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def intEqual(
      v1: Ptr[Byte] /* Some(gconstpointer) */,
      v2: Ptr[Byte] /* Some(gconstpointer) */
  ): Boolean /* Some(gboolean) */ =
    g_int_equal(gconstpointer(v1), gconstpointer(v2)).value.!=(0)

  /** Converts a pointer to a #gint to a hash value. It can be passed to
    * g_hash_table_new() as the @hash_func parameter, when using non-%NULL
    * pointers to integer values as keys in a #GHashTable.
    *
    * Note that this function acts on pointers to #gint, not on #gint directly:
    * if your hash table's keys are of the form `GINT_TO_POINTER (n)`, use
    * g_direct_hash() instead.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def intHash(v: Ptr[Byte] /* Some(gconstpointer) */ ): UInt /* Some(guint) */ =
    g_int_hash(gconstpointer(v)).value

  /** Returns a canonical representation for @string. Interned strings can be
    * compared for equality by comparing the pointers, instead of using
    * strcmp(). g_intern_static_string() does not copy the string, therefore @string
    * must not be freed or modified.
    *
    * This function must not be used before library constructors have finished
    * running. In particular, this means it cannot be used to initialize global
    * variables in C++.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def internStaticString(
      string: Option[String /* Some(Ptr[gchar]) */ ]
  )(using Zone): String /* Some(Ptr[gchar]) */ = fromCString(
    g_intern_static_string(
      string
        .map[Ptr[gchar]](o => toCString(o).asInstanceOf[Ptr[gchar]])
        .getOrElse(null.asInstanceOf[Ptr[gchar]])
    ).asInstanceOf
  )

  /** Returns a canonical representation for @string. Interned strings can be
    * compared for equality by comparing the pointers, instead of using
    * strcmp().
    *
    * This function must not be used before library constructors have finished
    * running. In particular, this means it cannot be used to initialize global
    * variables in C++.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def internString(
      string: Option[String /* Some(Ptr[gchar]) */ ]
  )(using Zone): String /* Some(Ptr[gchar]) */ = fromCString(
    g_intern_string(
      string
        .map[Ptr[gchar]](o => toCString(o).asInstanceOf[Ptr[gchar]])
        .getOrElse(null.asInstanceOf[Ptr[gchar]])
    ).asInstanceOf
  )

  /** Adds the #GIOChannel into the default main loop context with the default
    * priority.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[io_add_watch:/<function parameters>/channel]: Cannot render type Type(List(),ListMap(@name -> DataRecord(IOChannel), @type -> DataRecord(GIOChannel*)))"
  )
  private def ioAddWatch() = ???

  /** Adds the #GIOChannel into the default main loop context with the given
    * priority.
    *
    * This internally creates a main loop source using g_io_create_watch() and
    * attaches it to the main loop context with g_source_attach(). You can do
    * these steps manually if you need greater control.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[io_add_watch_full:/<function parameters>/channel]: Cannot render type Type(List(),ListMap(@name -> DataRecord(IOChannel), @type -> DataRecord(GIOChannel*)))"
  )
  private def ioAddWatchFull() = ???

  /** Converts an `errno` error number to a #GIOChannelError.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def ioChannelErrorFromErrno(
      en: Int /* Some(gint) */
  ): IOChannelError /* Some(GIOChannelError) */ =
    IOChannelError.fromRaw(g_io_channel_error_from_errno(gint(en)))

  @annotation.compileTimeOnly(
    "[io_channel_error_quark:/<return type>]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Quark), @type -> DataRecord(GQuark)))"
  )
  private def ioChannelErrorQuark() = ???

  /** Creates a #GSource that's dispatched when @condition is met for the given @channel.
    * For example, if condition is %G_IO_IN, the source will be dispatched when
    * there's data available for reading.
    *
    * The callback function invoked by the #GSource should be added with
    * g_source_set_callback(), but it has type #GIOFunc (not #GSourceFunc).
    *
    * g_io_add_watch() is a simpler interface to this same functionality, for
    * the case where you want to add the source to the default main loop context
    * at the default priority.
    *
    * On Windows, polling a #GSource created to watch a channel for a socket
    * puts the socket in non-blocking mode. This is a side-effect of the
    * implementation and unavoidable.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[io_create_watch:/<function parameters>/channel]: Cannot render type Type(List(),ListMap(@name -> DataRecord(IOChannel), @type -> DataRecord(GIOChannel*)))"
  )
  private def ioCreateWatch() = ???

  @annotation.compileTimeOnly(
    "[key_file_error_quark:/<return type>]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Quark), @type -> DataRecord(GQuark)))"
  )
  private def keyFileErrorQuark() = ???

  /** Gets the names of all variables set in the environment.
    *
    * Programs that want to be portable to Windows should typically use this
    * function and g_getenv() instead of using the environ array from the C
    * library directly. On Windows, the strings in the environ array are in
    * system codepage encoding, while in most of the typical use cases for
    * environment variables in GLib-using programs you want the UTF-8 encoding
    * that this function and g_getenv() provide.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[listenv:/<return type>]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(filename)))),ListMap(@type -> DataRecord(gchar**)))"
  )
  private def listenv() = ???

  /** Converts a string from UTF-8 to the encoding used for strings by the C
    * runtime (usually the same as that used by the operating system) in the
    * [current locale][setlocale]. On Windows this means the system codepage.
    *
    * The input string shall not contain nul characters even if the @len
    * argument is positive. A nul character found inside the string will result
    * in error %G_CONVERT_ERROR_ILLEGAL_SEQUENCE. Use g_convert() to convert
    * input that may contain embedded nul characters.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[locale_from_utf8:]: Function locale_from_utf8 contains an OUT parameter, which is not supported yet"
  )
  private def localeFromUtf8() = ???

  /** Converts a string which is in the encoding used for strings by the C
    * runtime (usually the same as that used by the operating system) in the
    * [current locale][setlocale] into a UTF-8 string.
    *
    * If the source encoding is not UTF-8 and the conversion output contains a
    * nul character, the error %G_CONVERT_ERROR_EMBEDDED_NUL is set and the
    * function returns %NULL. If the source encoding is UTF-8, an embedded nul
    * character is treated with the %G_CONVERT_ERROR_ILLEGAL_SEQUENCE error for
    * backward compatibility with earlier versions of this library. Use
    * g_convert() to produce output that may contain embedded nul characters.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[locale_to_utf8:]: Function locale_to_utf8 contains an OUT parameter, which is not supported yet"
  )
  private def localeToUtf8() = ???

  /** Logs an error or debugging message.
    *
    * If the log level has been set as fatal, G_BREAKPOINT() is called to
    * terminate the program. See the documentation for G_BREAKPOINT() for
    * details of the debugging options this provides.
    *
    * If g_log_default_handler() is used as the log handler function, a new-line
    * character will automatically be appended to @..., and need not be entered
    * manually.
    *
    * If [structured logging is enabled][using-structured-logging] this will
    * output via the structured log writer function (see
    * g_log_set_writer_func()).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[log:/<function parameters>]: Vararg parameters require inlining which doesn't work with overriding"
  )
  private def log() = ???

  /** The default log handler set up by GLib; g_log_set_default_handler() allows
    * to install an alternate default log handler. This is used if no log
    * handler has been set for the particular log domain and log level
    * combination. It outputs the message to stderr or stdout and if the log
    * level is fatal it calls G_BREAKPOINT(). It automatically prints a new-line
    * character after the message, so one does not need to be manually included
    * in @message.
    *
    * The behavior of this log handler can be influenced by a number of
    * environment variables:
    *
    *   - `G_MESSAGES_PREFIXED`: A :-separated list of log levels for which
    *     messages should be prefixed by the program name and PID of the
    *     application.
    *   - `G_MESSAGES_DEBUG`: A space-separated list of log domains for which
    *     debug and informational messages are printed. By default these
    *     messages are not printed.
    *
    * stderr is used for levels %G_LOG_LEVEL_ERROR, %G_LOG_LEVEL_CRITICAL,
    * %G_LOG_LEVEL_WARNING and %G_LOG_LEVEL_MESSAGE. stdout is used for the
    * rest, unless stderr was requested by
    * g_log_writer_default_set_use_stderr().
    *
    * This has no effect if structured logging is enabled; see [Using Structured
    * Logging][using-structured-logging].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def logDefaultHandler(
      log_domain: Option[String /* Some(Ptr[gchar]) */ ],
      log_level: LogLevelFlags /* Some(GLogLevelFlags) */,
      message: Option[String /* Some(Ptr[gchar]) */ ],
      unused_data: Option[Ptr[Byte] /* Some(gpointer) */ ]
  )(using Zone): Unit /* Some(Unit) */ = g_log_default_handler(
    log_domain
      .map[Ptr[gchar]](o => toCString(o).asInstanceOf[Ptr[gchar]])
      .getOrElse(null.asInstanceOf[Ptr[gchar]]),
    log_level.raw,
    message
      .map[Ptr[gchar]](o => toCString(o).asInstanceOf[Ptr[gchar]])
      .getOrElse(null.asInstanceOf[Ptr[gchar]]),
    unused_data
      .map[gpointer](o => gpointer(o))
      .getOrElse(null.asInstanceOf[gpointer])
  )

  /** Return whether debug output from the GLib logging system is enabled.
    *
    * Note that this should not be used to conditionalise calls to g_debug() or
    * other logging functions; it should only be used from %GLogWriterFunc
    * implementations.
    *
    * Note also that the value of this does not depend on `G_MESSAGES_DEBUG`;
    * see the docs for g_log_set_debug_enabled().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def logGetDebugEnabled(): Boolean /* Some(gboolean) */ =
    g_log_get_debug_enabled().value.!=(0)

  /** Removes the log handler.
    *
    * This has no effect if structured logging is enabled; see [Using Structured
    * Logging][using-structured-logging].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def logRemoveHandler(
      log_domain: String /* Some(Ptr[gchar]) */,
      handler_id: UInt /* Some(guint) */
  )(using Zone): Unit /* Some(Unit) */ = g_log_remove_handler(
    toCString(log_domain).asInstanceOf[Ptr[gchar]],
    guint(handler_id)
  )

  /** Sets the message levels which are always fatal, in any log domain. When a
    * message with any of these levels is logged the program terminates. You can
    * only set the levels defined by GLib to be fatal. %G_LOG_LEVEL_ERROR is
    * always fatal.
    *
    * You can also make some message levels fatal at runtime by setting the
    * `G_DEBUG` environment variable (see [Running GLib
    * Applications](glib-running.html)).
    *
    * Libraries should not call this function, as it affects all messages logged
    * by a process, including those from other libraries.
    *
    * Structured log messages (using g_log_structured() and
    * g_log_structured_array()) are fatal only if the default log writer is
    * used; otherwise it is up to the writer function to determine which log
    * messages are fatal. See [Using Structured
    * Logging][using-structured-logging].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def logSetAlwaysFatal(
      fatal_mask: LogLevelFlags /* Some(GLogLevelFlags) */
  ): LogLevelFlags /* Some(GLogLevelFlags) */ =
    LogLevelFlags.fromRaw(g_log_set_always_fatal(fatal_mask.raw))

  /** Enable or disable debug output from the GLib logging system for all
    * domains. This value interacts disjunctively with `G_MESSAGES_DEBUG` — if
    * either of them would allow a debug message to be outputted, it will be.
    *
    * Note that this should not be used from within library code to enable debug
    * output — it is intended for external use.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def logSetDebugEnabled(
      enabled: Boolean /* Some(gboolean) */
  ): Unit /* Some(Unit) */ = g_log_set_debug_enabled(
    gboolean(gint((if enabled == true then 1 else 0)))
  )

  /** Installs a default log handler which is used if no log handler has been
    * set for the particular log domain and log level combination. By default,
    * GLib uses g_log_default_handler() as default log handler.
    *
    * This has no effect if structured logging is enabled; see [Using Structured
    * Logging][using-structured-logging].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[log_set_default_handler:/<function parameters>/log_func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(LogFunc), @type -> DataRecord(GLogFunc)))"
  )
  private def logSetDefaultHandler() = ???

  /** Sets the log levels which are fatal in the given domain.
    * %G_LOG_LEVEL_ERROR is always fatal.
    *
    * This has no effect on structured log messages (using g_log_structured() or
    * g_log_structured_array()). To change the fatal behaviour for specific log
    * messages, programs must install a custom log writer function using
    * g_log_set_writer_func(). See [Using Structured
    * Logging][using-structured-logging].
    *
    * This function is mostly intended to be used with %G_LOG_LEVEL_CRITICAL.
    * You should typically not set %G_LOG_LEVEL_WARNING, %G_LOG_LEVEL_MESSAGE,
    * %G_LOG_LEVEL_INFO or %G_LOG_LEVEL_DEBUG as fatal except inside of test
    * programs.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def logSetFatalMask(
      log_domain: String /* Some(Ptr[gchar]) */,
      fatal_mask: LogLevelFlags /* Some(GLogLevelFlags) */
  )(using Zone): LogLevelFlags /* Some(GLogLevelFlags) */ =
    LogLevelFlags.fromRaw(
      g_log_set_fatal_mask(
        toCString(log_domain).asInstanceOf[Ptr[gchar]],
        fatal_mask.raw
      )
    )

  /**  Sets the log handler for a domain and a set of log levels.
    *
    *  To handle fatal and recursive messages the @log_levels parameter
    *  must be combined with the %G_LOG_FLAG_FATAL and %G_LOG_FLAG_RECURSION
    *  bit flags.
    *
    *  Note that since the %G_LOG_LEVEL_ERROR log level is always fatal, if
    *  you want to set a handler for this log level you must combine it with
    *  %G_LOG_FLAG_FATAL.
    *
    *  This has no effect if structured logging is enabled; see
    *  [Using Structured Logging][using-structured-logging].
    *
    *  Here is an example for adding a log handler for all warning messages
    *  in the default domain:
    *
    *  |[<!-- language="C" -->
    *  g_log_set_handler (NULL, G_LOG_LEVEL_WARNING | G_LOG_FLAG_FATAL
    *                     | G_LOG_FLAG_RECURSION, my_log_handler, NULL);
    *  ]|
    *
    *  This example adds a log handler for all critical messages from GTK:
    *
    *  |[<!-- language="C" -->
    *  g_log_set_handler ("Gtk", G_LOG_LEVEL_CRITICAL | G_LOG_FLAG_FATAL
    *                     | G_LOG_FLAG_RECURSION, my_log_handler, NULL);
    *  ]|
    *
    *  This example adds a log handler for all messages from GLib:
    *
    *  |[<!-- language="C" -->
    *  g_log_set_handler ("GLib", G_LOG_LEVEL_MASK | G_LOG_FLAG_FATAL
    *                     | G_LOG_FLAG_RECURSION, my_log_handler, NULL);
    *  ]|
    *
    *  NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[log_set_handler:/<function parameters>/log_func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(LogFunc), @type -> DataRecord(GLogFunc)))"
  )
  private def logSetHandler() = ???

  /** Like g_log_set_handler(), but takes a destroy notify for the @user_data.
    *
    * This has no effect if structured logging is enabled; see [Using Structured
    * Logging][using-structured-logging].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[log_set_handler_full:/<function parameters>/log_func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(LogFunc), @type -> DataRecord(GLogFunc)))"
  )
  private def logSetHandlerFull() = ???

  /** Set a writer function which will be called to format and write out each
    * log message. Each program should set a writer function, or the default
    * writer (g_log_writer_default()) will be used.
    *
    * Libraries **must not** call this function — only programs are allowed to
    * install a writer function, as there must be a single, central point where
    * log messages are formatted and outputted.
    *
    * There can only be one writer function. It is an error to set more than
    * one.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[log_set_writer_func:/<function parameters>/func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(LogWriterFunc), @type -> DataRecord(GLogWriterFunc)))"
  )
  private def logSetWriterFunc() = ???

  /**  Log a message with structured data.
    *
    *  The message will be passed through to the log writer set by the application
    *  using g_log_set_writer_func(). If the message is fatal (i.e. its log level
    *  is %G_LOG_LEVEL_ERROR), the program will be aborted by calling
    *  G_BREAKPOINT() at the end of this function. If the log writer returns
    *  %G_LOG_WRITER_UNHANDLED (failure), no other fallback writers will be tried.
    *  See the documentation for #GLogWriterFunc for information on chaining
    *  writers.
    *
    *  The structured data is provided as key–value pairs, where keys are UTF-8
    *  strings, and values are arbitrary pointers — typically pointing to UTF-8
    *  strings, but that is not a requirement. To pass binary (non-nul-terminated)
    *  structured data, use g_log_structured_array(). The keys for structured data
    *  should follow the [systemd journal
    *  fields](https://www.freedesktop.org/software/systemd/man/systemd.journal-fields.html)
    *  specification. It is suggested that custom keys are namespaced according to
    *  the code which sets them. For example, custom keys from GLib all have a
    *  `GLIB_` prefix.
    *
    *  Note that keys that expect UTF-8 strings (specifically `"MESSAGE"` and
    *  `"GLIB_DOMAIN"`) must be passed as NUL-terminated UTF-8 strings until GLib
    *  version 2.74.1 because the default log handler did not consider the length of
    *  the `GLogField`. Starting with GLib 2.74.1 this is fixed and
    *  non-NUL-terminated UTF-8 strings can be passed with their correct length.
    *
    *  The @log_domain will be converted into a `GLIB_DOMAIN` field. @log_level will
    *  be converted into a
    *  [`PRIORITY`](https://www.freedesktop.org/software/systemd/man/systemd.journal-fields.html#PRIORITY=)
    *  field. The format string will have its placeholders substituted for the provided
    *  values and be converted into a
    *  [`MESSAGE`](https://www.freedesktop.org/software/systemd/man/systemd.journal-fields.html#MESSAGE=)
    *  field.
    *
    *  Other fields you may commonly want to pass into this function:
    *
    *   * [`MESSAGE_ID`](https://www.freedesktop.org/software/systemd/man/systemd.journal-fields.html#MESSAGE_ID=)
    *   * [`CODE_FILE`](https://www.freedesktop.org/software/systemd/man/systemd.journal-fields.html#CODE_FILE=)
    *   * [`CODE_LINE`](https://www.freedesktop.org/software/systemd/man/systemd.journal-fields.html#CODE_LINE=)
    *   * [`CODE_FUNC`](https://www.freedesktop.org/software/systemd/man/systemd.journal-fields.html#CODE_FUNC=)
    *   * [`ERRNO`](https://www.freedesktop.org/software/systemd/man/systemd.journal-fields.html#ERRNO=)
    *
    *  Note that `CODE_FILE`, `CODE_LINE` and `CODE_FUNC` are automatically set by
    *  the logging macros, G_DEBUG_HERE(), g_message(), g_warning(), g_critical(),
    *  g_error(), etc, if the symbols `G_LOG_USE_STRUCTURED` is defined before including
    *  `glib.h`.
    *
    *  For example:
    *
    *  |[<!-- language="C" -->
    *  g_log_structured (G_LOG_DOMAIN, G_LOG_LEVEL_DEBUG,
    *                    "MESSAGE_ID", "06d4df59e6c24647bfe69d2c27ef0b4e",
    *                    "MY_APPLICATION_CUSTOM_FIELD", "some debug string",
    *                    "MESSAGE", "This is a debug message about pointer %p and integer %u.",
    *                    some_pointer, some_integer);
    *  ]|
    *
    *  Note that each `MESSAGE_ID` must be [uniquely and randomly
    *  generated](https://www.freedesktop.org/software/systemd/man/systemd.journal-fields.html#MESSAGE_ID=).
    *  If adding a `MESSAGE_ID`, consider shipping a [message
    *  catalog](https://www.freedesktop.org/wiki/Software/systemd/catalog/) with
    *  your software.
    *
    *  To pass a user data pointer to the log writer function which is specific to
    *  this logging call, you must use g_log_structured_array() and pass the pointer
    *  as a field with #GLogField.length set to zero, otherwise it will be
    *  interpreted as a string.
    *
    *  For example:
    *
    *  |[<!-- language="C" -->
    *  const GLogField fields[] = {
    *    { "MESSAGE", "This is a debug message.", -1 },
    *    { "MESSAGE_ID", "fcfb2e1e65c3494386b74878f1abf893", -1 },
    *    { "MY_APPLICATION_CUSTOM_FIELD", "some debug string", -1 },
    *    { "MY_APPLICATION_STATE", state_object, 0 },
    *  };
    *  g_log_structured_array (G_LOG_LEVEL_DEBUG, fields, G_N_ELEMENTS (fields));
    *  ]|
    *
    *  Note also that, even if no other structured fields are specified, there
    *  must always be a `MESSAGE` key before the format string. The `MESSAGE`-format
    *  pair has to be the last of the key-value pairs, and `MESSAGE` is the only
    *  field for which printf()-style formatting is supported.
    *
    *  The default writer function for `stdout` and `stderr` will automatically
    *  append a new-line character after the message, so you should not add one
    *  manually to the format string.
    *
    *  NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[log_structured:/<function parameters>]: Vararg parameters require inlining which doesn't work with overriding"
  )
  private def logStructured() = ???

  /** Log a message with structured data. The message will be passed through to
    * the log writer set by the application using g_log_set_writer_func(). If
    * the message is fatal (i.e. its log level is %G_LOG_LEVEL_ERROR), the
    * program will be aborted at the end of this function.
    *
    * See g_log_structured() for more documentation.
    *
    * This assumes that @log_level is already present in @fields (typically as
    * the `PRIORITY` field).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[log_structured_array:/<function parameters>/fields]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(LogField), @type -> DataRecord(GLogField)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(2), @type -> DataRecord(const GLogField*)))"
  )
  private def logStructuredArray() = ???

  @annotation.compileTimeOnly(
    "[log_structured_standard:/<function parameters>]: Vararg parameters require inlining which doesn't work with overriding"
  )
  private def logStructuredStandard() = ???

  /** Log a message with structured data, accepting the data within a #GVariant.
    * This version is especially useful for use in other languages, via
    * introspection.
    *
    * The only mandatory item in the @fields dictionary is the "MESSAGE" which
    * must contain the text shown to the user.
    *
    * The values in the @fields dictionary are likely to be of type String
    * (%G_VARIANT_TYPE_STRING). Array of bytes (%G_VARIANT_TYPE_BYTESTRING) is
    * also supported. In this case the message is handled as binary and will be
    * forwarded to the log writer as such. The size of the array should not be
    * higher than %G_MAXSSIZE. Otherwise it will be truncated to this size. For
    * other types g_variant_print() will be used to convert the value into a
    * string.
    *
    * For more details on its usage and about the parameters, see
    * g_log_structured().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[log_variant:/<function parameters>/fields]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Variant), @type -> DataRecord(GVariant*)))"
  )
  private def logVariant() = ???

  /** Format a structured log message and output it to the default log
    * destination for the platform. On Linux, this is typically the systemd
    * journal, falling back to `stdout` or `stderr` if running from the terminal
    * or if output is being redirected to a file.
    *
    * Support for other platform-specific logging mechanisms may be added in
    * future. Distributors of GLib may modify this function to impose their own
    * (documented) platform-specific log writing policies.
    *
    * This is suitable for use as a #GLogWriterFunc, and is the default writer
    * used if no other is set using g_log_set_writer_func().
    *
    * As with g_log_default_handler(), this function drops debug and
    * informational messages unless their log domain (or `all`) is listed in the
    * space-separated `G_MESSAGES_DEBUG` environment variable.
    *
    * g_log_writer_default() uses the mask set by g_log_set_always_fatal() to
    * determine which messages are fatal. When using a custom writer func
    * instead it is up to the writer function to determine which log messages
    * are fatal.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[log_writer_default:/<function parameters>/fields]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(LogField), @type -> DataRecord(GLogField)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(2), @type -> DataRecord(const GLogField*)))"
  )
  private def logWriterDefault() = ???

  /** Configure whether the built-in log functions (g_log_default_handler() for
    * the old-style API, and both g_log_writer_default() and
    * g_log_writer_standard_streams() for the structured API) will output all
    * log messages to `stderr`.
    *
    * By default, log messages of levels %G_LOG_LEVEL_INFO and
    * %G_LOG_LEVEL_DEBUG are sent to `stdout`, and other log messages are sent
    * to `stderr`. This is problematic for applications that intend to reserve
    * `stdout` for structured output such as JSON or XML.
    *
    * This function sets global state. It is not thread-aware, and should be
    * called at the very start of a program, before creating any other threads
    * or creating objects that could create worker threads of their own.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def logWriterDefaultSetUseStderr(
      use_stderr: Boolean /* Some(gboolean) */
  ): Unit /* Some(Unit) */ = g_log_writer_default_set_use_stderr(
    gboolean(gint((if use_stderr == true then 1 else 0)))
  )

  /**  Check whether g_log_writer_default() and g_log_default_handler() would
    *  ignore a message with the given domain and level.
    *
    *  As with g_log_default_handler(), this function drops debug and informational
    *  messages unless their log domain (or `all`) is listed in the space-separated
    *  `G_MESSAGES_DEBUG` environment variable.
    *
    *  This can be used when implementing log writers with the same filtering
    *  behaviour as the default, but a different destination or output format:
    *
    *  |[<!-- language="C" -->
    *    if (g_log_writer_default_would_drop (log_level, log_domain))
    *      return G_LOG_WRITER_HANDLED;
    *  ]|
    *
    *  or to skip an expensive computation if it is only needed for a debugging
    *  message, and `G_MESSAGES_DEBUG` is not set:
    *
    *  |[<!-- language="C" -->
    *    if (!g_log_writer_default_would_drop (G_LOG_LEVEL_DEBUG, G_LOG_DOMAIN))
    *      {
    *        gchar *result = expensive_computation (my_object);
    *
    *        g_debug ("my_object result: %s", result);
    *        g_free (result);
    *      }
    *  ]|
    *
    *  NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT BE APPLICABLE TO SCALA
    */
  def logWriterDefaultWouldDrop(
      log_level: LogLevelFlags /* Some(GLogLevelFlags) */,
      log_domain: Option[String /* Some(CString) */ ]
  )(using Zone): Boolean /* Some(gboolean) */ = g_log_writer_default_would_drop(
    log_level.raw,
    log_domain
      .map[CString](o => toCString(o))
      .getOrElse(null.asInstanceOf[CString])
  ).value.!=(0)

  /** Format a structured log message as a string suitable for outputting to the
    * terminal (or elsewhere). This will include the values of all fields it
    * knows how to interpret, which includes `MESSAGE` and `GLIB_DOMAIN` (see
    * the documentation for g_log_structured()). It does not include values from
    * unknown fields.
    *
    * The returned string does **not** have a trailing new-line character. It is
    * encoded in the character set of the current locale, which is not
    * necessarily UTF-8.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[log_writer_format_fields:/<function parameters>/fields]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(LogField), @type -> DataRecord(GLogField)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(2), @type -> DataRecord(const GLogField*)))"
  )
  private def logWriterFormatFields() = ???

  /**  Check whether the given @output_fd file descriptor is a connection to the
    *  systemd journal, or something else (like a log file or `stdout` or
    *  `stderr`).
    *
    *  Invalid file descriptors are accepted and return %FALSE, which allows for
    *  the following construct without needing any additional error handling:
    *  |[<!-- language="C" -->
    *    is_journald = g_log_writer_is_journald (fileno (stderr));
    *  ]|
    *
    *  NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT BE APPLICABLE TO SCALA
    */
  def logWriterIsJournald(
      output_fd: Int /* Some(gint) */
  ): Boolean /* Some(gboolean) */ =
    g_log_writer_is_journald(gint(output_fd)).value.!=(0)

  /** Format a structured log message and send it to the systemd journal as a
    * set of key–value pairs. All fields are sent to the journal, but if a field
    * has length zero (indicating program-specific data) then only its key will
    * be sent.
    *
    * This is suitable for use as a #GLogWriterFunc.
    *
    * If GLib has been compiled without systemd support, this function is still
    * defined, but will always return %G_LOG_WRITER_UNHANDLED.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[log_writer_journald:/<function parameters>/fields]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(LogField), @type -> DataRecord(GLogField)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(2), @type -> DataRecord(const GLogField*)))"
  )
  private def logWriterJournald() = ???

  /** Format a structured log message and print it to either `stdout` or
    * `stderr`, depending on its log level. %G_LOG_LEVEL_INFO and
    * %G_LOG_LEVEL_DEBUG messages are sent to `stdout`, or to `stderr` if
    * requested by g_log_writer_default_set_use_stderr(); all other log levels
    * are sent to `stderr`. Only fields which are understood by this function
    * are included in the formatted string which is printed.
    *
    * If the output stream supports ANSI color escape sequences, they will be
    * used in the output.
    *
    * A trailing new-line character is added to the log message when it is
    * printed.
    *
    * This is suitable for use as a #GLogWriterFunc.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[log_writer_standard_streams:/<function parameters>/fields]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(LogField), @type -> DataRecord(GLogField)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(2), @type -> DataRecord(const GLogField*)))"
  )
  private def logWriterStandardStreams() = ???

  /** Check whether the given @output_fd file descriptor supports ANSI color
    * escape sequences. If so, they can safely be used when formatting log
    * messages.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def logWriterSupportsColor(
      output_fd: Int /* Some(gint) */
  ): Boolean /* Some(gboolean) */ =
    g_log_writer_supports_color(gint(output_fd)).value.!=(0)

  /** Logs an error or debugging message.
    *
    * If the log level has been set as fatal, G_BREAKPOINT() is called to
    * terminate the program. See the documentation for G_BREAKPOINT() for
    * details of the debugging options this provides.
    *
    * If g_log_default_handler() is used as the log handler function, a new-line
    * character will automatically be appended to @..., and need not be entered
    * manually.
    *
    * If [structured logging is enabled][using-structured-logging] this will
    * output via the structured log writer function (see
    * g_log_set_writer_func()).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def logv(
      log_domain: Option[String /* Some(Ptr[gchar]) */ ],
      log_level: LogLevelFlags /* Some(GLogLevelFlags) */,
      format: String /* Some(Ptr[gchar]) */,
      args: CVarArgList /* Some(va_list) */
  )(using Zone): Unit /* Some(Unit) */ = g_logv(
    log_domain
      .map[Ptr[gchar]](o => toCString(o).asInstanceOf[Ptr[gchar]])
      .getOrElse(null.asInstanceOf[Ptr[gchar]]),
    log_level.raw,
    toCString(format).asInstanceOf[Ptr[gchar]],
    args
  )

  /** Returns the global-default main context. This is the main context used for
    * main loop functions when a main loop is not explicitly specified, and
    * corresponds to the "main" main loop. See also
    * g_main_context_get_thread_default().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[main_context_default:/<return type>]: Cannot render type Type(List(),ListMap(@name -> DataRecord(MainContext), @type -> DataRecord(GMainContext*)))"
  )
  private def mainContextDefault() = ???

  /** Gets the thread-default #GMainContext for this thread. Asynchronous
    * operations that want to be able to be run in contexts other than the
    * default one should call this method or g_main_context_ref_thread_default()
    * to get a #GMainContext to add their #GSources to. (Note that even in
    * single-threaded programs applications may sometimes want to temporarily
    * push a non-default context, so it is not safe to assume that this will
    * always return %NULL if you are running in the default thread.)
    *
    * If you need to hold a reference on the context, use
    * g_main_context_ref_thread_default() instead.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[main_context_get_thread_default:/<return type>]: Cannot render type Type(List(),ListMap(@name -> DataRecord(MainContext), @type -> DataRecord(GMainContext*)))"
  )
  private def mainContextGetThreadDefault() = ???

  /** Gets the thread-default #GMainContext for this thread, as with
    * g_main_context_get_thread_default(), but also adds a reference to it with
    * g_main_context_ref(). In addition, unlike
    * g_main_context_get_thread_default(), if the thread-default context is the
    * global-default context, this will return that #GMainContext (with a ref
    * added to it) rather than returning %NULL.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[main_context_ref_thread_default:/<return type>]: Cannot render type Type(List(),ListMap(@name -> DataRecord(MainContext), @type -> DataRecord(GMainContext*)))"
  )
  private def mainContextRefThreadDefault() = ???

  /** Returns the currently firing source for this thread.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[main_current_source:/<return type>]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Source), @type -> DataRecord(GSource*)))"
  )
  private def mainCurrentSource() = ???

  /**  Returns the depth of the stack of calls to
    *  g_main_context_dispatch() on any #GMainContext in the current thread.
    *  That is, when called from the toplevel, it gives 0. When
    *  called from within a callback from g_main_context_iteration()
    *  (or g_main_loop_run(), etc.) it returns 1. When called from within
    *  a callback to a recursive call to g_main_context_iteration(),
    *  it returns 2. And so forth.
    *
    *  This function is useful in a situation like the following:
    *  Imagine an extremely simple "garbage collected" system.
    *
    *  |[<!-- language="C" -->
    *  static GList *free_list;
    *
    *  gpointer
    *  allocate_memory (gsize size)
    *  {
    *    gpointer result = g_malloc (size);
    *    free_list = g_list_prepend (free_list, result);
    *    return result;
    *  }
    *
    *  void
    *  free_allocated_memory (void)
    *  {
    *    GList *l;
    *    for (l = free_list; l; l = l->next);
    *      g_free (l->data);
    *    g_list_free (free_list);
    *    free_list = NULL;
    *   }
    *
    *  [...]
    *
    *  while (TRUE);
    *   {
    *     g_main_context_iteration (NULL, TRUE);
    *     free_allocated_memory();
    *    }
    *  ]|
    *
    *  This works from an application, however, if you want to do the same
    *  thing from a library, it gets more difficult, since you no longer
    *  control the main loop. You might think you can simply use an idle
    *  function to make the call to free_allocated_memory(), but that
    *  doesn't work, since the idle function could be called from a
    *  recursive callback. This can be fixed by using g_main_depth()
    *
    *  |[<!-- language="C" -->
    *  gpointer
    *  allocate_memory (gsize size)
    *  {
    *    FreeListBlock *block = g_new (FreeListBlock, 1);
    *    block->mem = g_malloc (size);
    *    block->depth = g_main_depth ();
    *    free_list = g_list_prepend (free_list, block);
    *    return block->mem;
    *  }
    *
    *  void
    *  free_allocated_memory (void)
    *  {
    *    GList *l;
    *
    *    int depth = g_main_depth ();
    *    for (l = free_list; l; );
    *      {
    *        GList *next = l->next;
    *        FreeListBlock *block = l->data;
    *        if (block->depth > depth)
    *          {
    *            g_free (block->mem);
    *            g_free (block);
    *            free_list = g_list_delete_link (free_list, l);
    *          }
    *
    *        l = next;
    *      }
    *    }
    *  ]|
    *
    *  There is a temptation to use g_main_depth() to solve
    *  problems with reentrancy. For instance, while waiting for data
    *  to be received from the network in response to a menu item,
    *  the menu item might be selected again. It might seem that
    *  one could make the menu item's callback return immediately
    *  and do nothing if g_main_depth() returns a value greater than 1.
    *  However, this should be avoided since the user then sees selecting
    *  the menu item do nothing. Furthermore, you'll find yourself adding
    *  these checks all over your code, since there are doubtless many,
    *  many things that the user could do. Instead, you can use the
    *  following techniques:
    *
    *  1. Use gtk_widget_set_sensitive() or modal dialogs to prevent
    *     the user from interacting with elements while the main
    *     loop is recursing.
    *
    *  2. Avoid main loop recursion in situations where you can't handle
    *     arbitrary  callbacks. Instead, structure your code so that you
    *     simply return to the main loop and then get called again when
    *     there is more work to do.
    *
    *  NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT BE APPLICABLE TO SCALA
    */
  def mainDepth(): Int /* Some(gint) */ = g_main_depth().value

  /** Allocates @n_bytes bytes of memory. If @n_bytes is 0 it returns %NULL.
    *
    * If the allocation fails (because the system is out of memory), the program
    * is terminated.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def malloc(
      n_bytes: CUnsignedLongInt /* Some(gsize) */
  ): Ptr[Byte] /* Some(gpointer) */ = g_malloc(gsize(n_bytes)).value

  /** Allocates @n_bytes bytes of memory, initialized to 0's. If @n_bytes is 0
    * it returns %NULL.
    *
    * If the allocation fails (because the system is out of memory), the program
    * is terminated.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def malloc0(
      n_bytes: CUnsignedLongInt /* Some(gsize) */
  ): Ptr[Byte] /* Some(gpointer) */ = g_malloc0(gsize(n_bytes)).value

  /** This function is similar to g_malloc0(), allocating (@n_blocks * @n_block_bytes)
    * bytes, but care is taken to detect possible overflow during
    * multiplication.
    *
    * If the allocation fails (because the system is out of memory), the program
    * is terminated.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def malloc0N(
      n_blocks: CUnsignedLongInt /* Some(gsize) */,
      n_block_bytes: CUnsignedLongInt /* Some(gsize) */
  ): Ptr[Byte] /* Some(gpointer) */ =
    g_malloc0_n(gsize(n_blocks), gsize(n_block_bytes)).value

  /** This function is similar to g_malloc(), allocating (@n_blocks * @n_block_bytes)
    * bytes, but care is taken to detect possible overflow during
    * multiplication.
    *
    * If the allocation fails (because the system is out of memory), the program
    * is terminated.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def mallocN(
      n_blocks: CUnsignedLongInt /* Some(gsize) */,
      n_block_bytes: CUnsignedLongInt /* Some(gsize) */
  ): Ptr[Byte] /* Some(gpointer) */ =
    g_malloc_n(gsize(n_blocks), gsize(n_block_bytes)).value

  /** Collects the attributes of the element from the data passed to the
    * #GMarkupParser start_element function, dealing with common error
    * conditions and supporting boolean values.
    *
    * This utility function is not required to write a parser but can save a lot
    * of typing.
    *
    * The @element_name, @attribute_names, @attribute_values and @error
    * parameters passed to the start_element callback should be passed
    * unmodified to this function.
    *
    * Following these arguments is a list of "supported" attributes to collect.
    * It is an error to specify multiple attributes with the same name. If any
    * attribute not in the list appears in the @attribute_names array then an
    * unknown attribute error will result.
    *
    * The #GMarkupCollectType field allows specifying the type of collection to
    * perform and if a given attribute must appear or is optional.
    *
    * The attribute name is simply the name of the attribute to collect.
    *
    * The pointer should be of the appropriate type (see the descriptions under
    * #GMarkupCollectType) and may be %NULL in case a particular attribute is to
    * be allowed but ignored.
    *
    * This function deals with issuing errors for missing attributes (of type
    * %G_MARKUP_ERROR_MISSING_ATTRIBUTE), unknown attributes (of type
    * %G_MARKUP_ERROR_UNKNOWN_ATTRIBUTE) and duplicate attributes (of type
    * %G_MARKUP_ERROR_INVALID_CONTENT) as well as parse errors for
    * boolean-valued attributes (again of type %G_MARKUP_ERROR_INVALID_CONTENT).
    * In all of these cases %FALSE will be returned and @error will be set as
    * appropriate.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[markup_collect_attributes:/<function parameters>/attribute_names]: Cannot render type Type(List(),ListMap(@name -> DataRecord(utf8), @type -> DataRecord(const gchar**)))"
  )
  private def markupCollectAttributes() = ???

  @annotation.compileTimeOnly(
    "[markup_error_quark:/<return type>]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Quark), @type -> DataRecord(GQuark)))"
  )
  private def markupErrorQuark() = ???

  /** Escapes text so that the markup parser will parse it verbatim. Less than,
    * greater than, ampersand, etc. are replaced with the corresponding
    * entities. This function would typically be used when writing out a file to
    * be parsed with the markup parser.
    *
    * Note that this function doesn't protect whitespace and line endings from
    * being processed according to the XML rules for normalization of line
    * endings and attribute values.
    *
    * Note also that this function will produce character references in the
    * range of &#x1; ... &#x1f; for all control sequences except for tabstop,
    * newline and carriage return. The character references in this range are
    * not valid XML 1.0, but they are valid XML 1.1 and will be accepted by the
    * GMarkup parser.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def markupEscapeText(
      text: String /* Some(Ptr[gchar]) */,
      length: CLongInt /* Some(gssize) */
  )(using Zone): String /* Some(Ptr[gchar]) */ = fromCString(
    g_markup_escape_text(
      toCString(text).asInstanceOf[Ptr[gchar]],
      gssize(length)
    ).asInstanceOf
  )

  /**  Formats arguments according to @format, escaping
    *  all string and character arguments in the fashion
    *  of g_markup_escape_text(). This is useful when you
    *  want to insert literal strings into XML-style markup
    *  output, without having to worry that the strings
    *  might themselves contain markup.
    *
    *  |[<!-- language="C" -->
    *  const char *store = "Fortnum & Mason";
    *  const char *item = "Tea";
    *  char *output;
    *
    *  output = g_markup_printf_escaped ("<purchase>"
    *                                    "<store>%s</store>"
    *                                    "<item>%s</item>"
    *                                    "</purchase>",
    *                                    store, item);
    *  ]|
    *
    *  NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[markup_printf_escaped:/<function parameters>]: Vararg parameters require inlining which doesn't work with overriding"
  )
  private def markupPrintfEscaped() = ???

  /** Formats the data in @args according to @format, escaping all string and
    * character arguments in the fashion of g_markup_escape_text(). See
    * g_markup_printf_escaped().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def markupVprintfEscaped(
      format: String /* Some(CString) */,
      args: CVarArgList /* Some(va_list) */
  )(using Zone): String /* Some(Ptr[gchar]) */ = fromCString(
    g_markup_vprintf_escaped(toCString(format), args).asInstanceOf
  )

  /** Checks whether the allocator used by g_malloc() is the system's malloc
    * implementation. If it returns %TRUE memory allocated with malloc() can be
    * used interchangeably with memory allocated using g_malloc(). This function
    * is useful for avoiding an extra copy of allocated memory returned by a
    * non-GLib-based API.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def memIsSystemMalloc(): Boolean /* Some(gboolean) */ =
    g_mem_is_system_malloc().value.!=(0)

  /** GLib used to support some tools for memory profiling, but this no longer
    * works. There are many other useful tools for memory profiling these days
    * which can be used instead.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def memProfile(): Unit /* Some(Unit) */ = g_mem_profile()

  /** This function used to let you override the memory allocation function.
    * However, its use was incompatible with the use of global constructors in
    * GLib and GIO, because those use the GLib allocators before main is
    * reached. Therefore this function is now deprecated and is just a stub.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[mem_set_vtable:/<function parameters>/vtable]: Cannot render type Type(List(),ListMap(@name -> DataRecord(MemVTable), @type -> DataRecord(GMemVTable*)))"
  )
  private def memSetVtable() = ???

  /** Allocates @byte_size bytes of memory, and copies @byte_size bytes into it
    * from @mem. If @mem is %NULL it returns %NULL.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def memdup(
      mem: Option[Ptr[Byte] /* Some(gconstpointer) */ ],
      byte_size: UInt /* Some(guint) */
  ): Ptr[Byte] /* Some(gpointer) */ = g_memdup(
    mem
      .map[gconstpointer](o => gconstpointer(o))
      .getOrElse(null.asInstanceOf[gconstpointer]),
    guint(byte_size)
  ).value

  /** Allocates @byte_size bytes of memory, and copies @byte_size bytes into it
    * from @mem. If @mem is %NULL it returns %NULL.
    *
    * This replaces g_memdup(), which was prone to integer overflows when
    * converting the argument from a #gsize to a #guint.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def memdup2(
      mem: Option[Ptr[Byte] /* Some(gconstpointer) */ ],
      byte_size: CUnsignedLongInt /* Some(gsize) */
  ): Ptr[Byte] /* Some(gpointer) */ = g_memdup2(
    mem
      .map[gconstpointer](o => gconstpointer(o))
      .getOrElse(null.asInstanceOf[gconstpointer]),
    gsize(byte_size)
  ).value

  /** Create a directory if it doesn't already exist. Create intermediate parent
    * directories as needed, too.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def mkdirWithParents(
      pathname: String /* Some(Ptr[gchar]) */,
      mode: Int /* Some(gint) */
  )(using Zone): Int /* Some(gint) */ = g_mkdir_with_parents(
    toCString(pathname).asInstanceOf[Ptr[gchar]],
    gint(mode)
  ).value

  /** Creates a temporary directory. See the mkdtemp() documentation on most
    * UNIX-like systems.
    *
    * The parameter is a string that should follow the rules for mkdtemp()
    * templates, i.e. contain the string "XXXXXX". g_mkdtemp() is slightly more
    * flexible than mkdtemp() in that the sequence does not have to occur at the
    * very end of the template. The X string will be modified to form the name
    * of a directory that didn't exist. The string should be in the GLib file
    * name encoding. Most importantly, on Windows it should be in UTF-8.
    *
    * If you are going to be creating a temporary directory inside the directory
    * returned by g_get_tmp_dir(), you might want to use g_dir_make_tmp()
    * instead.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def mkdtemp(
      tmpl: String /* Some(Ptr[gchar]) */
  )(using Zone): String /* Some(Ptr[gchar]) */ = fromCString(
    g_mkdtemp(toCString(tmpl).asInstanceOf[Ptr[gchar]]).asInstanceOf
  )

  /** Creates a temporary directory. See the mkdtemp() documentation on most
    * UNIX-like systems.
    *
    * The parameter is a string that should follow the rules for mkdtemp()
    * templates, i.e. contain the string "XXXXXX". g_mkdtemp_full() is slightly
    * more flexible than mkdtemp() in that the sequence does not have to occur
    * at the very end of the template and you can pass a @mode. The X string
    * will be modified to form the name of a directory that didn't exist. The
    * string should be in the GLib file name encoding. Most importantly, on
    * Windows it should be in UTF-8.
    *
    * If you are going to be creating a temporary directory inside the directory
    * returned by g_get_tmp_dir(), you might want to use g_dir_make_tmp()
    * instead.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def mkdtempFull(
      tmpl: String /* Some(Ptr[gchar]) */,
      mode: Int /* Some(gint) */
  )(using Zone): String /* Some(Ptr[gchar]) */ = fromCString(
    g_mkdtemp_full(
      toCString(tmpl).asInstanceOf[Ptr[gchar]],
      gint(mode)
    ).asInstanceOf
  )

  /** Opens a temporary file. See the mkstemp() documentation on most UNIX-like
    * systems.
    *
    * The parameter is a string that should follow the rules for mkstemp()
    * templates, i.e. contain the string "XXXXXX". g_mkstemp() is slightly more
    * flexible than mkstemp() in that the sequence does not have to occur at the
    * very end of the template. The X string will be modified to form the name
    * of a file that didn't exist. The string should be in the GLib file name
    * encoding. Most importantly, on Windows it should be in UTF-8.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def mkstemp(
      tmpl: String /* Some(Ptr[gchar]) */
  )(using Zone): Int /* Some(gint) */ = g_mkstemp(
    toCString(tmpl).asInstanceOf[Ptr[gchar]]
  ).value

  /** Opens a temporary file. See the mkstemp() documentation on most UNIX-like
    * systems.
    *
    * The parameter is a string that should follow the rules for mkstemp()
    * templates, i.e. contain the string "XXXXXX". g_mkstemp_full() is slightly
    * more flexible than mkstemp() in that the sequence does not have to occur
    * at the very end of the template and you can pass a @mode and additional @flags.
    * The X string will be modified to form the name of a file that didn't
    * exist. The string should be in the GLib file name encoding. Most
    * importantly, on Windows it should be in UTF-8.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def mkstempFull(
      tmpl: String /* Some(Ptr[gchar]) */,
      flags: Int /* Some(gint) */,
      mode: Int /* Some(gint) */
  )(using Zone): Int /* Some(gint) */ = g_mkstemp_full(
    toCString(tmpl).asInstanceOf[Ptr[gchar]],
    gint(flags),
    gint(mode)
  ).value

  /** Set the pointer at the specified location to %NULL.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[nullify_pointer:/<function parameters>/nullify_location]: Cannot render type Type(List(),ListMap(@name -> DataRecord(gpointer), @type -> DataRecord(gpointer*)))"
  )
  private def nullifyPointer() = ???

  @annotation.compileTimeOnly(
    "[number_parser_error_quark:/<return type>]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Quark), @type -> DataRecord(GQuark)))"
  )
  private def numberParserErrorQuark() = ???

  /**  Prompts the user with
    *  `[E]xit, [H]alt, show [S]tack trace or [P]roceed`.
    *  This function is intended to be used for debugging use only.
    *  The following example shows how it can be used together with
    *  the g_log() functions.
    *
    *  |[<!-- language="C" -->
    *  #include <glib.h>
    *
    *  static void
    *  log_handler (const gchar   *log_domain,
    *               GLogLevelFlags log_level,
    *               const gchar   *message,
    *               gpointer       user_data)
    *  {
    *    g_log_default_handler (log_domain, log_level, message, user_data);
    *
    *    g_on_error_query (MY_PROGRAM_NAME);
    *  }
    *
    *  int
    *  main (int argc, char *argv[])
    *  {
    *    g_log_set_handler (MY_LOG_DOMAIN,
    *                       G_LOG_LEVEL_WARNING |
    *                       G_LOG_LEVEL_ERROR |
    *                       G_LOG_LEVEL_CRITICAL,
    *                       log_handler,
    *                       NULL);
    *    ...
    *  ]|
    *
    *  If "[E]xit" is selected, the application terminates with a call
    *  to _exit(0).
    *
    *  If "[S]tack" trace is selected, g_on_error_stack_trace() is called.
    *  This invokes gdb, which attaches to the current process and shows
    *  a stack trace. The prompt is then shown again.
    *
    *  If "[P]roceed" is selected, the function returns.
    *
    *  This function may cause different actions on non-UNIX platforms.
    *
    *  On Windows consider using the `G_DEBUGGER` environment
    *  variable (see [Running GLib Applications](glib-running.html)) and
    *  calling g_on_error_stack_trace() instead.
    *
    *  NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT BE APPLICABLE TO SCALA
    */
  def onErrorQuery(
      prg_name: String /* Some(Ptr[gchar]) */
  )(using Zone): Unit /* Some(Unit) */ = g_on_error_query(
    toCString(prg_name).asInstanceOf[Ptr[gchar]]
  )

  /** Invokes gdb, which attaches to the current process and shows a stack
    * trace. Called by g_on_error_query() when the "[S]tack trace" option is
    * selected. You can get the current process's program name with
    * g_get_prgname(), assuming that you have called gtk_init() or gdk_init().
    *
    * This function may cause different actions on non-UNIX platforms.
    *
    * When running on Windows, this function is *not* called by
    * g_on_error_query(). If called directly, it will raise an exception, which
    * will crash the program. If the `G_DEBUGGER` environment variable is set, a
    * debugger will be invoked to attach and handle that exception (see [Running
    * GLib Applications](glib-running.html)).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onErrorStackTrace(
      prg_name: String /* Some(Ptr[gchar]) */
  )(using Zone): Unit /* Some(Unit) */ = g_on_error_stack_trace(
    toCString(prg_name).asInstanceOf[Ptr[gchar]]
  )

  /**  Function to be called when starting a critical initialization
    *  section. The argument @location must point to a static
    *  0-initialized variable that will be set to a value other than 0 at
    *  the end of the initialization section. In combination with
    *  g_once_init_leave() and the unique address @value_location, it can
    *  be ensured that an initialization section will be executed only once
    *  during a program's life time, and that concurrent threads are
    *  blocked until initialization completed. To be used in constructs
    *  like this:
    *
    *  |[<!-- language="C" -->
    *    static gsize initialization_value = 0;
    *
    *    if (g_once_init_enter (&initialization_value))
    *      {
    *        gsize setup_value = 42; // initialization code here
    *
    *        g_once_init_leave (&initialization_value, setup_value);
    *      }
    *
    *    // use initialization_value here
    *  ]|
    *
    *  While @location has a `volatile` qualifier, this is a historical artifact and
    *  the pointer passed to it should not be `volatile`.
    *
    *  NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[once_init_enter:/<function parameters>/location]: Cannot render type Type(List(),ListMap(@name -> DataRecord(gpointer), @type -> DataRecord(void*)))"
  )
  private def onceInitEnter() = ???

  /** Counterpart to g_once_init_enter(). Expects a location of a static
    * 0-initialized initialization variable, and an initialization value other
    * than 0. Sets the variable to the initialization value, and releases
    * concurrent threads blocking in g_once_init_enter() on this initialization
    * variable.
    *
    * While @location has a `volatile` qualifier, this is a historical artifact
    * and the pointer passed to it should not be `volatile`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[once_init_leave:/<function parameters>/location]: Cannot render type Type(List(),ListMap(@name -> DataRecord(gpointer), @type -> DataRecord(void*)))"
  )
  private def onceInitLeave() = ???

  @annotation.compileTimeOnly(
    "[option_error_quark:/<return type>]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Quark), @type -> DataRecord(GQuark)))"
  )
  private def optionErrorQuark() = ???

  /** Parses a string containing debugging options into a %guint containing bit
    * flags. This is used within GDK and GTK to parse the debug options passed
    * on the command line or through environment variables.
    *
    * If @string is equal to "all", all flags are set. Any flags specified along
    * with "all" in @string are inverted; thus, "all,foo,bar" or "foo,bar,all"
    * sets all flags except those corresponding to "foo" and "bar".
    *
    * If @string is equal to "help", all the available keys in @keys are printed
    * out to standard error.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[parse_debug_string:/<function parameters>/keys]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(DebugKey), @type -> DataRecord(GDebugKey)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(2), @type -> DataRecord(const GDebugKey*)))"
  )
  private def parseDebugString() = ???

  /** Compares two path buffers for equality and returns `TRUE` if they are
    * equal.
    *
    * The path inside the paths buffers are not going to be normalized, so
    * `X/Y/Z/A/..`, `X/./Y/Z` and `X/Y/Z` are not going to be considered equal.
    *
    * This function can be passed to g_hash_table_new() as the `key_equal_func`
    * parameter.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def pathBufEqual(
      v1: Ptr[Byte] /* Some(gconstpointer) */,
      v2: Ptr[Byte] /* Some(gconstpointer) */
  ): Boolean /* Some(gboolean) */ =
    g_path_buf_equal(gconstpointer(v1), gconstpointer(v2)).value.!=(0)

  /** Gets the last component of the filename.
    *
    * If @file_name ends with a directory separator it gets the component before
    * the last slash. If @file_name consists only of directory separators (and
    * on Windows, possibly a drive letter), a single separator is returned. If @file_name
    * is empty, it gets ".".
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def pathGetBasename(
      file_name: String /* Some(Ptr[gchar]) */
  )(using Zone): String /* Some(Ptr[gchar]) */ = fromCString(
    g_path_get_basename(
      toCString(file_name).asInstanceOf[Ptr[gchar]]
    ).asInstanceOf
  )

  /** Gets the directory components of a file name. For example, the directory
    * component of `/usr/bin/test` is `/usr/bin`. The directory component of `/`
    * is `/`.
    *
    * If the file name has no directory components "." is returned. The returned
    * string should be freed when no longer needed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def pathGetDirname(
      file_name: String /* Some(Ptr[gchar]) */
  )(using Zone): String /* Some(Ptr[gchar]) */ = fromCString(
    g_path_get_dirname(
      toCString(file_name).asInstanceOf[Ptr[gchar]]
    ).asInstanceOf
  )

  /** Returns %TRUE if the given @file_name is an absolute file name. Note that
    * this is a somewhat vague concept on Windows.
    *
    * On POSIX systems, an absolute file name is well-defined. It always starts
    * from the single root directory. For example "/usr/local".
    *
    * On Windows, the concepts of current drive and drive-specific current
    * directory introduce vagueness. This function interprets as an absolute
    * file name one that either begins with a directory separator such as
    * "\Users\tml" or begins with the root on a drive, for example "C:\Windows".
    * The first case also includes UNC paths such as "\\\\myserver\docs\foo". In
    * all cases, either slashes or backslashes are accepted.
    *
    * Note that a file name relative to the current drive root does not truly
    * specify a file uniquely over time and across processes, as the current
    * drive is a per-process value and can be changed.
    *
    * File names relative the current directory on some specific drive, such as
    * "D:foo/bar", are not interpreted as absolute by this function, but they
    * obviously are not relative to the normal current directory as returned by
    * getcwd() or g_get_current_dir() either. Such paths should be avoided, or
    * need to be handled using Windows-specific code.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def pathIsAbsolute(
      file_name: String /* Some(Ptr[gchar]) */
  )(using Zone): Boolean /* Some(gboolean) */ = g_path_is_absolute(
    toCString(file_name).asInstanceOf[Ptr[gchar]]
  ).value.!=(0)

  /** Returns a pointer into @file_name after the root component, i.e. after the
    * "/" in UNIX or "C:\" under Windows. If @file_name is not an absolute path
    * it returns %NULL.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def pathSkipRoot(
      file_name: String /* Some(Ptr[gchar]) */
  )(using Zone): String /* Some(Ptr[gchar]) */ = fromCString(
    g_path_skip_root(toCString(file_name).asInstanceOf[Ptr[gchar]]).asInstanceOf
  )

  /** Matches a string against a compiled pattern. Passing the correct length of
    * the string given is mandatory. The reversed string can be omitted by
    * passing %NULL, this is more efficient if the reversed version of the
    * string to be matched is not at hand, as g_pattern_match() will only
    * construct it if the compiled pattern requires reverse matches.
    *
    * Note that, if the user code will (possibly) match a string against a
    * multitude of patterns containing wildcards, chances are high that some
    * patterns will require a reversed string. In this case, it's more efficient
    * to provide the reversed string to avoid multiple constructions thereof in
    * the various calls to g_pattern_match().
    *
    * Note also that the reverse of a UTF-8 encoded string can in general not be
    * obtained by g_strreverse(). This works only if the string does not contain
    * any multibyte characters. GLib offers the g_utf8_strreverse() function to
    * reverse UTF-8 encoded strings.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[pattern_match:/<function parameters>/pspec]: Cannot render type Type(List(),ListMap(@name -> DataRecord(PatternSpec), @type -> DataRecord(GPatternSpec*)))"
  )
  private def patternMatch() = ???

  /** Matches a string against a pattern given as a string. If this function is
    * to be called in a loop, it's more efficient to compile the pattern once
    * with g_pattern_spec_new() and call g_pattern_match_string() repeatedly.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def patternMatchSimple(
      pattern: String /* Some(Ptr[gchar]) */,
      string: String /* Some(Ptr[gchar]) */
  )(using Zone): Boolean /* Some(gboolean) */ = g_pattern_match_simple(
    toCString(pattern).asInstanceOf[Ptr[gchar]],
    toCString(string).asInstanceOf[Ptr[gchar]]
  ).value.!=(0)

  /** Matches a string against a compiled pattern. If the string is to be
    * matched against more than one pattern, consider using g_pattern_match()
    * instead while supplying the reversed string.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[pattern_match_string:/<function parameters>/pspec]: Cannot render type Type(List(),ListMap(@name -> DataRecord(PatternSpec), @type -> DataRecord(GPatternSpec*)))"
  )
  private def patternMatchString() = ???

  /** This is equivalent to g_bit_lock, but working on pointers (or other
    * pointer-sized values).
    *
    * For portability reasons, you may only lock on the bottom 32 bits of the
    * pointer.
    *
    * While @address has a `volatile` qualifier, this is a historical artifact
    * and the argument passed to it should not be `volatile`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[pointer_bit_lock:/<function parameters>/address]: Cannot render type Type(List(),ListMap(@name -> DataRecord(gpointer), @type -> DataRecord(void*)))"
  )
  private def pointerBitLock() = ???

  /** This is equivalent to g_bit_trylock(), but working on pointers (or other
    * pointer-sized values).
    *
    * For portability reasons, you may only lock on the bottom 32 bits of the
    * pointer.
    *
    * While @address has a `volatile` qualifier, this is a historical artifact
    * and the argument passed to it should not be `volatile`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[pointer_bit_trylock:/<function parameters>/address]: Cannot render type Type(List(),ListMap(@name -> DataRecord(gpointer), @type -> DataRecord(void*)))"
  )
  private def pointerBitTrylock() = ???

  /** This is equivalent to g_bit_unlock, but working on pointers (or other
    * pointer-sized values).
    *
    * For portability reasons, you may only lock on the bottom 32 bits of the
    * pointer.
    *
    * While @address has a `volatile` qualifier, this is a historical artifact
    * and the argument passed to it should not be `volatile`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[pointer_bit_unlock:/<function parameters>/address]: Cannot render type Type(List(),ListMap(@name -> DataRecord(gpointer), @type -> DataRecord(void*)))"
  )
  private def pointerBitUnlock() = ???

  /** Polls @fds, as with the poll() system call, but portably. (On systems that
    * don't have poll(), it is emulated using select().) This is used internally
    * by #GMainContext, but it can be called directly if you need to block until
    * a file descriptor is ready, but don't want to run the full main loop.
    *
    * Each element of @fds is a #GPollFD describing a single file descriptor to
    * poll. The @fd field indicates the file descriptor, and the @events field
    * indicates the events to poll for. On return, the @revents fields will be
    * filled with the events that actually occurred.
    *
    * On POSIX systems, the file descriptors in @fds can be any sort of file
    * descriptor, but the situation is much more complicated on Windows. If you
    * need to use g_poll() in code that has to run on Windows, the easiest
    * solution is to construct all of your #GPollFDs with
    * g_io_channel_win32_make_pollfd().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[poll:/<function parameters>/fds]: Cannot render type Type(List(),ListMap(@name -> DataRecord(PollFD), @type -> DataRecord(GPollFD*)))"
  )
  private def poll() = ???

  /** Formats a string according to @format and prefix it to an existing error
    * message. If @err is %NULL (ie: no error variable) then do nothing.
    *
    * If *@err is %NULL (ie: an error variable is present but there is no error
    * condition) then also do nothing.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[prefix_error:]: Function prefix_error contains an INOUT parameter, which is not supported yet"
  )
  private def prefixError() = ???

  /** Prefixes @prefix to an existing error message. If @err or *@err is %NULL
    * (i.e.: no error variable) then do nothing.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[prefix_error_literal:/<function parameters>/err]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Error), @type -> DataRecord(GError**)))"
  )
  private def prefixErrorLiteral() = ???

  /** Outputs a formatted message via the print handler. The default print
    * handler outputs the encoded message to stdout, without appending a
    * trailing new-line character. Typically, @format should end with its own
    * new-line character.
    *
    * g_print() should not be used from within libraries for debugging messages,
    * since it may be redirected by applications to special purpose message
    * windows or even files. Instead, libraries should use g_log(),
    * g_log_structured(), or the convenience macros g_message(), g_warning() and
    * g_error().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[print:/<function parameters>]: Vararg parameters require inlining which doesn't work with overriding"
  )
  private def print() = ???

  /** Outputs a formatted message via the error message handler. The default
    * handler outputs the encoded message to stderr, without appending a
    * trailing new-line character. Typically, @format should end with its own
    * new-line character.
    *
    * g_printerr() should not be used from within libraries. Instead g_log() or
    * g_log_structured() should be used, or the convenience macros g_message(),
    * g_warning() and g_error().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[printerr:/<function parameters>]: Vararg parameters require inlining which doesn't work with overriding"
  )
  private def printerr() = ???

  /** An implementation of the standard printf() function which supports
    * positional parameters, as specified in the Single Unix Specification.
    *
    * As with the standard printf(), this does not automatically append a
    * trailing new-line character to the message, so typically @format should
    * end with its own new-line character.
    *
    * `glib/gprintf.h` must be explicitly included in order to use this
    * function.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly("[printf:]: Method g_printf has no target types")
  private def printf() = ???

  /** Calculates the maximum space needed to store the output of the sprintf()
    * function.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def printfStringUpperBound(
      format: String /* Some(Ptr[gchar]) */,
      args: CVarArgList /* Some(va_list) */
  )(using Zone): CUnsignedLongInt /* Some(gsize) */ =
    g_printf_string_upper_bound(
      toCString(format).asInstanceOf[Ptr[gchar]],
      args
    ).value

  /** If @dest is %NULL, free @src; otherwise, moves @src into *@dest. The error
    * variable @dest points to must be %NULL.
    *
    * @src
    *   must be non-%NULL.
    *
    * Note that @src is no longer valid after this call. If you want to keep
    * using the same GError*, you need to set it to %NULL after calling this
    * function on it.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[propagate_error:]: Function propagate_error contains an OUT parameter, which is not supported yet"
  )
  private def propagateError() = ???

  /** If @dest is %NULL, free @src; otherwise, moves @src into *@dest. *@dest
    * must be %NULL. After the move, add a prefix as with g_prefix_error().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[propagate_prefixed_error:/<function parameters>/dest]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Error), @type -> DataRecord(GError**)))"
  )
  private def propagatePrefixedError() = ???

  /** Checks whether @needle exists in @haystack. If the element is found, %TRUE
    * is returned and the element’s index is returned in @index_ (if non-%NULL).
    * Otherwise, %FALSE is returned and @index_ is undefined. If @needle exists
    * multiple times in @haystack, the index of the first instance is returned.
    *
    * This does pointer comparisons only. If you want to use more complex
    * equality checks, such as string comparisons, use
    * g_ptr_array_find_with_equal_func().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ptr_array_find:]: Function ptr_array_find contains an OUT parameter, which is not supported yet"
  )
  private def ptrArrayFind() = ???

  /** Checks whether @needle exists in @haystack, using the given @equal_func.
    * If the element is found, %TRUE is returned and the element’s index is
    * returned in @index_ (if non-%NULL). Otherwise, %FALSE is returned and @index_
    * is undefined. If @needle exists multiple times in @haystack, the index of
    * the first instance is returned.
    *
    * @equal_func
    *   is called with the element from the array as its first parameter, and @needle
    *   as its second parameter. If @equal_func is %NULL, pointer equality is
    *   used.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ptr_array_find_with_equal_func:]: Function ptr_array_find_with_equal_func contains an OUT parameter, which is not supported yet"
  )
  private def ptrArrayFindWithEqualFunc() = ???

  /** Creates a new #GPtrArray, copying @len pointers from @data, and setting
    * the array’s reference count to 1.
    *
    * This avoids having to manually add each element one by one.
    *
    * If @copy_func is provided, then it is used to copy each element before
    * adding them to the new array. If it is %NULL then the pointers are copied
    * directly.
    *
    * It also sets @element_free_func for freeing each element when the array is
    * destroyed either via g_ptr_array_unref(), when g_ptr_array_free() is
    * called with @free_segment set to %TRUE or when removing elements.
    *
    * Do not use it if @len is greater than %G_MAXUINT. #GPtrArray stores the
    * length of its data in #guint, which may be shorter than #gsize.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ptr_array_new_from_array:/<function parameters>/data]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(gpointer), @type -> DataRecord(gpointer)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(1), @type -> DataRecord(gpointer*)))"
  )
  private def ptrArrayNewFromArray() = ???

  /** Creates a new #GPtrArray copying the pointers from @data after having
    * computed the length of it and with a reference count of 1. This avoids
    * having to manually add each element one by one. If @copy_func is provided,
    * then it is used to copy the data in the new array. It also set @element_free_func
    * for freeing each element when the array is destroyed either via
    * g_ptr_array_unref(), when g_ptr_array_free() is called with @free_segment
    * set to %TRUE or when removing elements.
    *
    * Do not use it if the @data has more than %G_MAXUINT elements. #GPtrArray
    * stores the length of its data in #guint, which may be shorter than #gsize.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ptr_array_new_from_null_terminated_array:/<function parameters>/data]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(gpointer), @type -> DataRecord(gpointer)))),ListMap(@type -> DataRecord(gpointer*)))"
  )
  private def ptrArrayNewFromNullTerminatedArray() = ???

  /** Creates a new #GPtrArray with @data as pointers, @len as length and a
    * reference count of 1.
    *
    * This avoids having to copy such data manually. After this call, @data
    * belongs to the #GPtrArray and may no longer be modified by the caller. The
    * memory of @data has to be dynamically allocated and will eventually be
    * freed with g_free().
    *
    * It also sets @element_free_func for freeing each element when the array is
    * destroyed either via g_ptr_array_unref(), when g_ptr_array_free() is
    * called with @free_segment set to %TRUE or when removing elements.
    *
    * Do not use it if @len is greater than %G_MAXUINT. #GPtrArray stores the
    * length of its data in #guint, which may be shorter than #gsize.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ptr_array_new_take:/<function parameters>/data]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(gpointer), @type -> DataRecord(gpointer)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(1), @type -> DataRecord(gpointer*)))"
  )
  private def ptrArrayNewTake() = ???

  /** Creates a new #GPtrArray with @data as pointers, computing the length of
    * it and setting the reference count to 1.
    *
    * This avoids having to copy such data manually. After this call, @data
    * belongs to the #GPtrArray and may no longer be modified by the caller. The
    * memory of @data has to be dynamically allocated and will eventually be
    * freed with g_free().
    *
    * The length is calculated by iterating through @data until the first %NULL
    * element is found.
    *
    * It also sets @element_free_func for freeing each element when the array is
    * destroyed either via g_ptr_array_unref(), when g_ptr_array_free() is
    * called with @free_segment set to %TRUE or when removing elements.
    *
    * Do not use it if the @data length is greater than %G_MAXUINT. #GPtrArray
    * stores the length of its data in #guint, which may be shorter than #gsize.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ptr_array_new_take_null_terminated:/<function parameters>/data]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(gpointer), @type -> DataRecord(gpointer)))),ListMap(@type -> DataRecord(gpointer*)))"
  )
  private def ptrArrayNewTakeNullTerminated() = ???

  /** This is just like the standard C qsort() function, but the comparison
    * routine accepts a user data argument.
    *
    * This is guaranteed to be a stable sort since version 2.32.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[qsort_with_data:/<function parameters>/compare_func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(CompareDataFunc), @type -> DataRecord(GCompareDataFunc)))"
  )
  private def qsortWithData() = ???

  /** Gets the #GQuark identifying the given (static) string. If the string does
    * not currently have an associated #GQuark, a new #GQuark is created, linked
    * to the given string.
    *
    * Note that this function is identical to g_quark_from_string() except that
    * if a new #GQuark is created the string itself is used rather than a copy.
    * This saves memory, but can only be used if the string will continue to
    * exist until the program terminates. It can be used with statically
    * allocated strings in the main program, but not with statically allocated
    * memory in dynamically loaded modules, if you expect to ever unload the
    * module again (e.g. do not use this function in GTK theme engines).
    *
    * This function must not be used before library constructors have finished
    * running. In particular, this means it cannot be used to initialize global
    * variables in C++.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[quark_from_static_string:/<return type>]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Quark), @type -> DataRecord(GQuark)))"
  )
  private def quarkFromStaticString() = ???

  /** Gets the #GQuark identifying the given string. If the string does not
    * currently have an associated #GQuark, a new #GQuark is created, using a
    * copy of the string.
    *
    * This function must not be used before library constructors have finished
    * running. In particular, this means it cannot be used to initialize global
    * variables in C++.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[quark_from_string:/<return type>]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Quark), @type -> DataRecord(GQuark)))"
  )
  private def quarkFromString() = ???

  /** Gets the string associated with the given #GQuark.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[quark_to_string:/<function parameters>/quark]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Quark), @type -> DataRecord(GQuark)))"
  )
  private def quarkToString() = ???

  /** Gets the #GQuark associated with the given string, or 0 if string is %NULL
    * or it has no associated #GQuark.
    *
    * If you want the GQuark to be created if it doesn't already exist, use
    * g_quark_from_string() or g_quark_from_static_string().
    *
    * This function must not be used before library constructors have finished
    * running.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[quark_try_string:/<return type>]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Quark), @type -> DataRecord(GQuark)))"
  )
  private def quarkTryString() = ???

  /** Returns a random #gdouble equally distributed over the range [0..1).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def randomDouble(): Double /* Some(gdouble) */ = g_random_double().value

  /** Returns a random #gdouble equally distributed over the range
    * [@begin..@end).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def randomDoubleRange(
      begin: Double /* Some(gdouble) */,
      end: Double /* Some(gdouble) */
  ): Double /* Some(gdouble) */ =
    g_random_double_range(gdouble(begin), gdouble(end)).value

  /** Return a random #guint32 equally distributed over the range [0..2^32-1].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def randomInt(): UInt /* Some(guint32) */ = g_random_int().value

  /** Returns a random #gint32 equally distributed over the range
    * [@begin..@end-1].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def randomIntRange(
      begin: CInt /* Some(gint32) */,
      end: CInt /* Some(gint32) */
  ): CInt /* Some(gint32) */ =
    g_random_int_range(gint32(begin), gint32(end)).value

  /** Sets the seed for the global random number generator, which is used by the
    * g_random_* functions, to @seed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def randomSetSeed(seed: UInt /* Some(guint32) */ ): Unit /* Some(Unit) */ =
    g_random_set_seed(guint32(seed))

  /** Acquires a reference on the data pointed by @mem_block.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def rcBoxAcquire(
      mem_block: Ptr[Byte] /* Some(gpointer) */
  ): Ptr[Byte] /* Some(gpointer) */ = g_rc_box_acquire(
    gpointer(mem_block)
  ).value

  /** Allocates @block_size bytes of memory, and adds reference counting
    * semantics to it.
    *
    * The data will be freed when its reference count drops to zero.
    *
    * The allocated data is guaranteed to be suitably aligned for any built-in
    * type.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def rcBoxAlloc(
      block_size: CUnsignedLongInt /* Some(gsize) */
  ): Ptr[Byte] /* Some(gpointer) */ = g_rc_box_alloc(gsize(block_size)).value

  /** Allocates @block_size bytes of memory, and adds reference counting
    * semantics to it.
    *
    * The contents of the returned data is set to zero.
    *
    * The data will be freed when its reference count drops to zero.
    *
    * The allocated data is guaranteed to be suitably aligned for any built-in
    * type.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def rcBoxAlloc0(
      block_size: CUnsignedLongInt /* Some(gsize) */
  ): Ptr[Byte] /* Some(gpointer) */ = g_rc_box_alloc0(gsize(block_size)).value

  /** Allocates a new block of data with reference counting semantics, and
    * copies @block_size bytes of @mem_block into it.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def rcBoxDup(
      block_size: CUnsignedLongInt /* Some(gsize) */,
      mem_block: Ptr[Byte] /* Some(gconstpointer) */
  ): Ptr[Byte] /* Some(gpointer) */ =
    g_rc_box_dup(gsize(block_size), gconstpointer(mem_block)).value

  /** Retrieves the size of the reference counted data pointed by @mem_block.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def rcBoxGetSize(
      mem_block: Ptr[Byte] /* Some(gpointer) */
  ): CUnsignedLongInt /* Some(gsize) */ = g_rc_box_get_size(
    gpointer(mem_block)
  ).value

  /** Releases a reference on the data pointed by @mem_block.
    *
    * If the reference was the last one, it will free the resources allocated
    * for @mem_block.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def rcBoxRelease(
      mem_block: Ptr[Byte] /* Some(gpointer) */
  ): Unit /* Some(Unit) */ = g_rc_box_release(gpointer(mem_block))

  /** Releases a reference on the data pointed by @mem_block.
    *
    * If the reference was the last one, it will call @clear_func to clear the
    * contents of @mem_block, and then will free the resources allocated for @mem_block.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[rc_box_release_full:/<function parameters>/clear_func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(DestroyNotify), @type -> DataRecord(GDestroyNotify)))"
  )
  private def rcBoxReleaseFull() = ???

  /** Reallocates the memory pointed to by @mem, so that it now has space for
    * @n_bytes
    *   bytes of memory. It returns the new address of the memory, which may
    *   have been moved. @mem may be %NULL, in which case it's considered to
    *   have zero-length. @n_bytes may be 0, in which case %NULL will be
    *   returned and @mem will be freed unless it is %NULL.
    *
    * If the allocation fails (because the system is out of memory), the program
    * is terminated.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def realloc(
      mem: Option[Ptr[Byte] /* Some(gpointer) */ ],
      n_bytes: CUnsignedLongInt /* Some(gsize) */
  ): Ptr[Byte] /* Some(gpointer) */ = g_realloc(
    mem.map[gpointer](o => gpointer(o)).getOrElse(null.asInstanceOf[gpointer]),
    gsize(n_bytes)
  ).value

  /** This function is similar to g_realloc(), allocating (@n_blocks * @n_block_bytes)
    * bytes, but care is taken to detect possible overflow during
    * multiplication.
    *
    * If the allocation fails (because the system is out of memory), the program
    * is terminated.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def reallocN(
      mem: Option[Ptr[Byte] /* Some(gpointer) */ ],
      n_blocks: CUnsignedLongInt /* Some(gsize) */,
      n_block_bytes: CUnsignedLongInt /* Some(gsize) */
  ): Ptr[Byte] /* Some(gpointer) */ = g_realloc_n(
    mem.map[gpointer](o => gpointer(o)).getOrElse(null.asInstanceOf[gpointer]),
    gsize(n_blocks),
    gsize(n_block_bytes)
  ).value

  /** Compares the current value of @rc with @val.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ref_count_compare:/<function parameters>/rc]: Cannot render type Type(List(),ListMap(@name -> DataRecord(gint), @type -> DataRecord(grefcount*)))"
  )
  private def refCountCompare() = ???

  /** Decreases the reference count.
    *
    * If %TRUE is returned, the reference count reached 0. After this point, @rc
    * is an undefined state and must be reinitialized with g_ref_count_init() to
    * be used again.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ref_count_dec:/<function parameters>/rc]: Cannot render type Type(List(),ListMap(@name -> DataRecord(gint), @type -> DataRecord(grefcount*)))"
  )
  private def refCountDec() = ???

  /** Increases the reference count.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ref_count_inc:/<function parameters>/rc]: Cannot render type Type(List(),ListMap(@name -> DataRecord(gint), @type -> DataRecord(grefcount*)))"
  )
  private def refCountInc() = ???

  /** Initializes a reference count variable to 1.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ref_count_init:/<function parameters>/rc]: Cannot render type Type(List(),ListMap(@name -> DataRecord(gint), @type -> DataRecord(grefcount*)))"
  )
  private def refCountInit() = ???

  /** Acquires a reference on a string.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def refStringAcquire(
      str: String /* Some(CString) */
  )(using Zone): String /* Some(CString) */ = fromCString(
    g_ref_string_acquire(toCString(str)).asInstanceOf
  )

  /** Retrieves the length of @str.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def refStringLength(
      str: String /* Some(CString) */
  )(using Zone): CUnsignedLongInt /* Some(gsize) */ = g_ref_string_length(
    toCString(str)
  ).value

  /** Creates a new reference counted string and copies the contents of @str
    * into it.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def refStringNew(
      str: String /* Some(CString) */
  )(using Zone): String /* Some(CString) */ = fromCString(
    g_ref_string_new(toCString(str)).asInstanceOf
  )

  /** Creates a new reference counted string and copies the content of @str into
    * it.
    *
    * If you call this function multiple times with the same @str, or with the
    * same contents of @str, it will return a new reference, instead of creating
    * a new string.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def refStringNewIntern(
      str: String /* Some(CString) */
  )(using Zone): String /* Some(CString) */ = fromCString(
    g_ref_string_new_intern(toCString(str)).asInstanceOf
  )

  /** Creates a new reference counted string and copies the contents of @str
    * into it, up to @len bytes.
    *
    * Since this function does not stop at nul bytes, it is the caller's
    * responsibility to ensure that @str has at least @len addressable bytes.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def refStringNewLen(
      str: String /* Some(CString) */,
      len: CLongInt /* Some(gssize) */
  )(using Zone): String /* Some(CString) */ = fromCString(
    g_ref_string_new_len(toCString(str), gssize(len)).asInstanceOf
  )

  /** Releases a reference on a string; if it was the last reference, the
    * resources allocated by the string are freed as well.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def refStringRelease(str: String /* Some(CString) */ )(using
      Zone
  ): Unit /* Some(Unit) */ = g_ref_string_release(toCString(str))

  /** Checks whether @replacement is a valid replacement string (see
    * g_regex_replace()), i.e. that all escape sequences in it are valid.
    *
    * If @has_references is not %NULL then @replacement is checked for pattern
    * references. For instance, replacement text 'foo\n' does not contain
    * references and may be evaluated without information about actual match,
    * but '\0\1' (whole match followed by first subpattern) requires valid
    * #GMatchInfo object.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[regex_check_replacement:]: Function regex_check_replacement contains an OUT parameter, which is not supported yet"
  )
  private def regexCheckReplacement() = ???

  @annotation.compileTimeOnly(
    "[regex_error_quark:/<return type>]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Quark), @type -> DataRecord(GQuark)))"
  )
  private def regexErrorQuark() = ???

  /** Escapes the nul characters in @string to "\x00". It can be used to compile
    * a regex with embedded nul characters.
    *
    * For completeness, @length can be -1 for a nul-terminated string. In this
    * case the output string will be of course equal to @string.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def regexEscapeNul(
      string: String /* Some(Ptr[gchar]) */,
      length: Int /* Some(gint) */
  )(using Zone): String /* Some(Ptr[gchar]) */ = fromCString(
    g_regex_escape_nul(
      toCString(string).asInstanceOf[Ptr[gchar]],
      gint(length)
    ).asInstanceOf
  )

  /** Escapes the special characters used for regular expressions in @string,
    * for instance "a.b*c" becomes "a\.b\*c". This function is useful to
    * dynamically generate regular expressions.
    *
    * @string
    *   can contain nul characters that are replaced with "\0", in this case
    *   remember to specify the correct length of @string in @length.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def regexEscapeString(
      string: String /* Some(Ptr[gchar]) */,
      length: Int /* Some(gint) */
  )(using Zone): String /* Some(Ptr[gchar]) */ = fromCString(
    g_regex_escape_string(
      toCString(string).asInstanceOf[Ptr[gchar]],
      gint(length)
    ).asInstanceOf
  )

  /** Scans for a match in @string for @pattern.
    *
    * This function is equivalent to g_regex_match() but it does not require to
    * compile the pattern with g_regex_new(), avoiding some lines of code when
    * you need just to do a match without extracting substrings, capture counts,
    * and so on.
    *
    * If this function is to be called on the same @pattern more than once, it's
    * more efficient to compile the pattern once with g_regex_new() and then use
    * g_regex_match().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def regexMatchSimple(
      pattern: String /* Some(Ptr[gchar]) */,
      string: String /* Some(Ptr[gchar]) */,
      compile_options: RegexCompileFlags /* Some(GRegexCompileFlags) */,
      match_options: RegexMatchFlags /* Some(GRegexMatchFlags) */
  )(using Zone): Boolean /* Some(gboolean) */ = g_regex_match_simple(
    toCString(pattern).asInstanceOf[Ptr[gchar]],
    toCString(string).asInstanceOf[Ptr[gchar]],
    compile_options.raw,
    match_options.raw
  ).value.!=(0)

  /** Breaks the string on the pattern, and returns an array of the tokens. If
    * the pattern contains capturing parentheses, then the text for each of the
    * substrings will also be returned. If the pattern does not match anywhere
    * in the string, then the whole string is returned as the first token.
    *
    * This function is equivalent to g_regex_split() but it does not require to
    * compile the pattern with g_regex_new(), avoiding some lines of code when
    * you need just to do a split without extracting substrings, capture counts,
    * and so on.
    *
    * If this function is to be called on the same @pattern more than once, it's
    * more efficient to compile the pattern once with g_regex_new() and then use
    * g_regex_split().
    *
    * As a special case, the result of splitting the empty string "" is an empty
    * vector, not a vector containing a single string. The reason for this
    * special case is that being able to represent an empty vector is typically
    * more useful than consistent handling of empty elements. If you do need to
    * represent empty elements, you'll need to check for the empty string before
    * calling this function.
    *
    * A pattern that can match empty strings splits @string into separate
    * characters wherever it matches the empty string between characters. For
    * example splitting "ab c" using as a separator "\s*", you will get "a", "b"
    * and "c".
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[regex_split_simple:/<return type>]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(utf8)))),ListMap(@type -> DataRecord(gchar**)))"
  )
  private def regexSplitSimple() = ???

  /** Resets the cache used for g_get_user_special_dir(), so that the latest
    * on-disk version is used. Call this only if you just changed the data on
    * disk yourself.
    *
    * Due to thread safety issues this may cause leaking of strings that were
    * previously returned from g_get_user_special_dir() that can't be freed. We
    * ensure to only leak the data for the directories that actually changed
    * value though.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def reloadUserSpecialDirsCache(): Unit /* Some(Unit) */ =
    g_reload_user_special_dirs_cache()

  /** Internal function used to print messages from the public
    * g_return_if_fail() and g_return_val_if_fail() macros.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def returnIfFailWarning(
      log_domain: Option[String /* Some(CString) */ ],
      pretty_function: String /* Some(CString) */,
      expression: Option[String /* Some(CString) */ ]
  )(using Zone): Unit /* Some(Unit) */ = g_return_if_fail_warning(
    log_domain
      .map[CString](o => toCString(o))
      .getOrElse(null.asInstanceOf[CString]),
    toCString(pretty_function),
    expression
      .map[CString](o => toCString(o))
      .getOrElse(null.asInstanceOf[CString])
  )

  /** A wrapper for the POSIX rmdir() function. The rmdir() function deletes a
    * directory from the filesystem.
    *
    * See your C library manual for more details about how rmdir() works on your
    * system.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly("[rmdir:]: Method g_rmdir has no target types")
  private def rmdir() = ???

  /** Returns the data that @iter points to.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[sequence_get:/<function parameters>/iter]: Cannot render type Type(List(),ListMap(@name -> DataRecord(SequenceIter), @type -> DataRecord(GSequenceIter*)))"
  )
  private def sequenceGet() = ???

  /** Inserts a new item just before the item pointed to by @iter.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[sequence_insert_before:/<function parameters>/iter]: Cannot render type Type(List(),ListMap(@name -> DataRecord(SequenceIter), @type -> DataRecord(GSequenceIter*)))"
  )
  private def sequenceInsertBefore() = ???

  /** Moves the item pointed to by @src to the position indicated by @dest.
    * After calling this function @dest will point to the position immediately
    * after @src. It is allowed for @src and @dest to point into different
    * sequences.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[sequence_move:/<function parameters>/src]: Cannot render type Type(List(),ListMap(@name -> DataRecord(SequenceIter), @type -> DataRecord(GSequenceIter*)))"
  )
  private def sequenceMove() = ???

  /** Inserts the (@begin, @end) range at the destination pointed to by @dest.
    * The @begin and @end iters must point into the same sequence. It is allowed
    * for @dest to point to a different sequence than the one pointed into by @begin
    * and @end.
    *
    * If @dest is %NULL, the range indicated by @begin and @end is removed from
    * the sequence. If @dest points to a place within the (@begin, @end) range,
    * the range does not move.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[sequence_move_range:/<function parameters>/dest]: Cannot render type Type(List(),ListMap(@name -> DataRecord(SequenceIter), @type -> DataRecord(GSequenceIter*)))"
  )
  private def sequenceMoveRange() = ???

  /** Finds an iterator somewhere in the range (@begin, @end). This iterator
    * will be close to the middle of the range, but is not guaranteed to be
    * exactly in the middle.
    *
    * The @begin and @end iterators must both point to the same sequence and @begin
    * must come before or be equal to @end in the sequence.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[sequence_range_get_midpoint:/<function parameters>/begin]: Cannot render type Type(List(),ListMap(@name -> DataRecord(SequenceIter), @type -> DataRecord(GSequenceIter*)))"
  )
  private def sequenceRangeGetMidpoint() = ???

  /** Removes the item pointed to by @iter. It is an error to pass the end
    * iterator to this function.
    *
    * If the sequence has a data destroy function associated with it, this
    * function is called on the data for the removed item.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[sequence_remove:/<function parameters>/iter]: Cannot render type Type(List(),ListMap(@name -> DataRecord(SequenceIter), @type -> DataRecord(GSequenceIter*)))"
  )
  private def sequenceRemove() = ???

  /** Removes all items in the (@begin, @end) range.
    *
    * If the sequence has a data destroy function associated with it, this
    * function is called on the data for the removed items.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[sequence_remove_range:/<function parameters>/begin]: Cannot render type Type(List(),ListMap(@name -> DataRecord(SequenceIter), @type -> DataRecord(GSequenceIter*)))"
  )
  private def sequenceRemoveRange() = ???

  /** Changes the data for the item pointed to by @iter to be @data. If the
    * sequence has a data destroy function associated with it, that function is
    * called on the existing data that @iter pointed to.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[sequence_set:/<function parameters>/iter]: Cannot render type Type(List(),ListMap(@name -> DataRecord(SequenceIter), @type -> DataRecord(GSequenceIter*)))"
  )
  private def sequenceSet() = ???

  /** Swaps the items pointed to by @a and @b. It is allowed for @a and @b to
    * point into difference sequences.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[sequence_swap:/<function parameters>/a]: Cannot render type Type(List(),ListMap(@name -> DataRecord(SequenceIter), @type -> DataRecord(GSequenceIter*)))"
  )
  private def sequenceSwap() = ???

  /** Sets a human-readable name for the application. This name should be
    * localized if possible, and is intended for display to the user. Contrast
    * with g_set_prgname(), which sets a non-localized name. g_set_prgname()
    * will be called automatically by gtk_init(), but g_set_application_name()
    * will not.
    *
    * Note that for thread safety reasons, this function can only be called
    * once.
    *
    * The application name will be used in contexts such as error messages, or
    * when displaying an application's name in the task list.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setApplicationName(
      application_name: String /* Some(Ptr[gchar]) */
  )(using Zone): Unit /* Some(Unit) */ = g_set_application_name(
    toCString(application_name).asInstanceOf[Ptr[gchar]]
  )

  /** Does nothing if @err is %NULL; if @err is non-%NULL, then *@err must be
    * %NULL. A new #GError is created and assigned to *@err.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[set_error:]: Function set_error contains an OUT parameter, which is not supported yet"
  )
  private def setError() = ???

  /** Does nothing if @err is %NULL; if @err is non-%NULL, then *@err must be
    * %NULL. A new #GError is created and assigned to *@err. Unlike
    * g_set_error(), @message is not a printf()-style format string. Use this
    * function if @message contains text you don't have control over, that could
    * include printf() escape sequences.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[set_error_literal:]: Function set_error_literal contains an OUT parameter, which is not supported yet"
  )
  private def setErrorLiteral() = ???

  /** Sets the name of the program. This name should not be localized, in
    * contrast to g_set_application_name().
    *
    * If you are using #GApplication the program name is set in
    * g_application_run(). In case of GDK or GTK it is set in gdk_init(), which
    * is called by gtk_init() and the #GtkApplication::startup handler. The
    * program name is found by taking the last component of @argv[0].
    *
    * Since GLib 2.72, this function can be called multiple times and is fully
    * thread safe. Prior to GLib 2.72, this function could only be called once
    * per process.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setPrgname(
      prgname: String /* Some(Ptr[gchar]) */
  )(using Zone): Unit /* Some(Unit) */ = g_set_prgname(
    toCString(prgname).asInstanceOf[Ptr[gchar]]
  )

  /** Sets the print handler to @func, or resets it to the default GLib handler
    * if %NULL.
    *
    * Any messages passed to g_print() will be output via the new handler. The
    * default handler outputs the encoded message to stdout. By providing your
    * own handler you can redirect the output, to a GTK widget or a log file for
    * example.
    *
    * Since 2.76 this functions always returns a valid #GPrintFunc, and never
    * returns %NULL. If no custom print handler was set, it will return the GLib
    * default print handler and that can be re-used to decorate its output
    * and/or to write to stderr in all platforms. Before GLib 2.76, this was
    * %NULL.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[set_print_handler:/<function parameters>/func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(PrintFunc), @type -> DataRecord(GPrintFunc)))"
  )
  private def setPrintHandler() = ???

  /** Sets the handler for printing error messages to @func, or resets it to the
    * default GLib handler if %NULL.
    *
    * Any messages passed to g_printerr() will be output via the new handler.
    * The default handler outputs the encoded message to stderr. By providing
    * your own handler you can redirect the output, to a GTK widget or a log
    * file for example.
    *
    * Since 2.76 this functions always returns a valid #GPrintFunc, and never
    * returns %NULL. If no custom error print handler was set, it will return
    * the GLib default error print handler and that can be re-used to decorate
    * its output and/or to write to stderr in all platforms. Before GLib 2.76,
    * this was %NULL.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[set_printerr_handler:/<function parameters>/func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(PrintFunc), @type -> DataRecord(GPrintFunc)))"
  )
  private def setPrinterrHandler() = ???

  /** Sets an environment variable. On UNIX, both the variable's name and value
    * can be arbitrary byte strings, except that the variable's name cannot
    * contain '='. On Windows, they should be in UTF-8.
    *
    * Note that on some systems, when variables are overwritten, the memory used
    * for the previous variables and its value isn't reclaimed.
    *
    * You should be mindful of the fact that environment variable handling in
    * UNIX is not thread-safe, and your program may crash if one thread calls
    * g_setenv() while another thread is calling getenv(). (And note that many
    * functions, such as gettext(), call getenv() internally.) This function is
    * only safe to use at the very start of your program, before creating any
    * other threads (or creating objects that create worker threads of their
    * own).
    *
    * If you need to set up the environment for a child process, you can use
    * g_get_environ() to get an environment array, modify that with
    * g_environ_setenv() and g_environ_unsetenv(), and then pass that array
    * directly to execvpe(), g_spawn_async(), or the like.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setenv(
      variable: String /* Some(Ptr[gchar]) */,
      value: String /* Some(Ptr[gchar]) */,
      overwrite: Boolean /* Some(gboolean) */
  )(using Zone): Boolean /* Some(gboolean) */ = g_setenv(
    toCString(variable).asInstanceOf[Ptr[gchar]],
    toCString(value).asInstanceOf[Ptr[gchar]],
    gboolean(gint((if overwrite == true then 1 else 0)))
  ).value.!=(0)

  @annotation.compileTimeOnly(
    "[shell_error_quark:/<return type>]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Quark), @type -> DataRecord(GQuark)))"
  )
  private def shellErrorQuark() = ???

  /** Parses a command line into an argument vector, in much the same way the
    * shell would, but without many of the expansions the shell would perform
    * (variable expansion, globs, operators, filename expansion, etc. are not
    * supported).
    *
    * The results are defined to be the same as those you would get from a
    * UNIX98 `/bin/sh`, as long as the input contains none of the unsupported
    * shell expansions. If the input does contain such expansions, they are
    * passed through literally.
    *
    * Possible errors are those from the %G_SHELL_ERROR domain.
    *
    * In particular, if @command_line is an empty string (or a string containing
    * only whitespace), %G_SHELL_ERROR_EMPTY_STRING will be returned. It’s
    * guaranteed that @argvp will be a non-empty array if this function returns
    * successfully.
    *
    * Free the returned vector with g_strfreev().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[shell_parse_argv:]: Function shell_parse_argv contains an OUT parameter, which is not supported yet"
  )
  private def shellParseArgv() = ???

  /** Quotes a string so that the shell (/bin/sh) will interpret the quoted
    * string to mean @unquoted_string.
    *
    * If you pass a filename to the shell, for example, you should first quote
    * it with this function.
    *
    * The return value must be freed with g_free().
    *
    * The quoting style used is undefined (single or double quotes may be used).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def shellQuote(
      unquoted_string: String /* Some(Ptr[gchar]) */
  )(using Zone): String /* Some(Ptr[gchar]) */ = fromCString(
    g_shell_quote(
      toCString(unquoted_string).asInstanceOf[Ptr[gchar]]
    ).asInstanceOf
  )

  /** Unquotes a string as the shell (/bin/sh) would.
    *
    * This function only handles quotes; if a string contains file globs,
    * arithmetic operators, variables, backticks, redirections, or other
    * special-to-the-shell features, the result will be different from the
    * result a real shell would produce (the variables, backticks, etc. will be
    * passed through literally instead of being expanded).
    *
    * This function is guaranteed to succeed if applied to the result of
    * g_shell_quote(). If it fails, it returns %NULL and sets the error.
    *
    * The @quoted_string need not actually contain quoted or escaped text;
    * g_shell_unquote() simply goes through the string and unquotes/unescapes
    * anything that the shell would. Both single and double quotes are handled,
    * as are escapes including escaped newlines.
    *
    * The return value must be freed with g_free().
    *
    * Possible errors are in the %G_SHELL_ERROR domain.
    *
    * Shell quoting rules are a bit strange. Single quotes preserve the literal
    * string exactly. escape sequences are not allowed; not even `\'` - if you
    * want a `'` in the quoted text, you have to do something like
    * `'foo'\''bar'`. Double quotes allow `$`, ```, `"`, `\`, and newline to be
    * escaped with backslash. Otherwise double quotes preserve things literally.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def shellUnquote(quoted_string: String /* Some(Ptr[gchar]) */ )(using
      Zone
  ): GResult[String /* Some(Ptr[gchar]) */ ] = GResult.wrap(__errorPtr =>
    fromCString(
      g_shell_unquote(
        toCString(quoted_string).asInstanceOf[Ptr[gchar]],
        __errorPtr
      ).asInstanceOf
    )
  )

  /** Allocates a block of memory from the libc allocator.
    *
    * The block address handed out can be expected to be aligned to at least
    * `1 * sizeof (void*)`.
    *
    * Since GLib 2.76 this always uses the system malloc() implementation
    * internally.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def sliceAlloc(
      block_size: CUnsignedLongInt /* Some(gsize) */
  ): Ptr[Byte] /* Some(gpointer) */ = g_slice_alloc(gsize(block_size)).value

  /** Allocates a block of memory via g_slice_alloc() and initializes the
    * returned memory to 0.
    *
    * Since GLib 2.76 this always uses the system malloc() implementation
    * internally.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def sliceAlloc0(
      block_size: CUnsignedLongInt /* Some(gsize) */
  ): Ptr[Byte] /* Some(gpointer) */ = g_slice_alloc0(gsize(block_size)).value

  /** Allocates a block of memory from the slice allocator and copies @block_size
    * bytes into it from @mem_block.
    *
    * @mem_block
    *   must be non-%NULL if @block_size is non-zero.
    *
    * Since GLib 2.76 this always uses the system malloc() implementation
    * internally.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def sliceCopy(
      block_size: CUnsignedLongInt /* Some(gsize) */,
      mem_block: Option[Ptr[Byte] /* Some(gconstpointer) */ ]
  ): Ptr[Byte] /* Some(gpointer) */ = g_slice_copy(
    gsize(block_size),
    mem_block
      .map[gconstpointer](o => gconstpointer(o))
      .getOrElse(null.asInstanceOf[gconstpointer])
  ).value

  /** Frees a block of memory.
    *
    * The memory must have been allocated via g_slice_alloc() or
    * g_slice_alloc0() and the @block_size has to match the size specified upon
    * allocation. Note that the exact release behaviour can be changed with the
    * [`G_DEBUG=gc-friendly`][G_DEBUG] environment variable.
    *
    * If @mem_block is %NULL, this function does nothing.
    *
    * Since GLib 2.76 this always uses the system free_sized() implementation
    * internally.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def sliceFree1(
      block_size: CUnsignedLongInt /* Some(gsize) */,
      mem_block: Option[Ptr[Byte] /* Some(gpointer) */ ]
  ): Unit /* Some(Unit) */ = g_slice_free1(
    gsize(block_size),
    mem_block
      .map[gpointer](o => gpointer(o))
      .getOrElse(null.asInstanceOf[gpointer])
  )

  /** Frees a linked list of memory blocks of structure type @type.
    *
    * The memory blocks must be equal-sized, allocated via g_slice_alloc() or
    * g_slice_alloc0() and linked together by a
    * @next
    *   pointer (similar to #GSList). The offset of the @next field in each
    *   block is passed as third argument. Note that the exact release behaviour
    *   can be changed with the [`G_DEBUG=gc-friendly`][G_DEBUG] environment
    *   variable.
    *
    * If @mem_chain is %NULL, this function does nothing.
    *
    * Since GLib 2.76 this always uses the system free_sized() implementation
    * internally.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def sliceFreeChainWithOffset(
      block_size: CUnsignedLongInt /* Some(gsize) */,
      mem_chain: Option[Ptr[Byte] /* Some(gpointer) */ ],
      next_offset: CUnsignedLongInt /* Some(gsize) */
  ): Unit /* Some(Unit) */ = g_slice_free_chain_with_offset(
    gsize(block_size),
    mem_chain
      .map[gpointer](o => gpointer(o))
      .getOrElse(null.asInstanceOf[gpointer]),
    gsize(next_offset)
  )

  def sliceGetConfig(
      ckey: SliceConfig /* Some(GSliceConfig) */
  ): CLongInt /* Some(gint64) */ = g_slice_get_config(ckey.raw).value

  @annotation.compileTimeOnly(
    "[slice_get_config_state:/<return type>]: Cannot render type Type(List(),ListMap(@name -> DataRecord(gint64), @type -> DataRecord(gint64*)))"
  )
  private def sliceGetConfigState() = ???

  def sliceSetConfig(
      ckey: SliceConfig /* Some(GSliceConfig) */,
      value: CLongInt /* Some(gint64) */
  ): Unit /* Some(Unit) */ = g_slice_set_config(ckey.raw, gint64(value))

  /** A safer form of the standard sprintf() function. The output is guaranteed
    * to not exceed @n characters (including the terminating nul character), so
    * it is easy to ensure that a buffer overflow cannot occur.
    *
    * See also g_strdup_printf().
    *
    * In versions of GLib prior to 1.2.3, this function may return -1 if the
    * output was truncated, and the truncated string may not be nul-terminated.
    * In versions prior to 1.3.12, this function returns the length of the
    * output string.
    *
    * The return value of g_snprintf() conforms to the snprintf() function as
    * standardized in ISO C99. Note that this is different from traditional
    * snprintf(), which returns the length of the output string.
    *
    * The format string may contain positional parameters, as specified in the
    * Single Unix Specification.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[snprintf:/<function parameters>]: Vararg parameters require inlining which doesn't work with overriding"
  )
  private def snprintf() = ???

  /** Removes the source with the given ID from the default main context. You
    * must use g_source_destroy() for sources added to a non-default main
    * context.
    *
    * The ID of a #GSource is given by g_source_get_id(), or will be returned by
    * the functions g_source_attach(), g_idle_add(), g_idle_add_full(),
    * g_timeout_add(), g_timeout_add_full(), g_child_watch_add(),
    * g_child_watch_add_full(), g_io_add_watch(), and g_io_add_watch_full().
    *
    * It is a programmer error to attempt to remove a non-existent source.
    *
    * More specifically: source IDs can be reissued after a source has been
    * destroyed and therefore it is never valid to use this function with a
    * source ID which may have already been removed. An example is when
    * scheduling an idle to run in another thread with g_idle_add(): the idle
    * may already have run and been removed by the time this function is called
    * on its (now invalid) source ID. This source ID may have been reissued,
    * leading to the operation being performed against the wrong source.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def sourceRemove(tag: UInt /* Some(guint) */ ): Boolean /* Some(gboolean) */ =
    g_source_remove(guint(tag)).value.!=(0)

  /** Removes a source from the default main loop context given the source
    * functions and user data. If multiple sources exist with the same source
    * functions and user data, only one will be destroyed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[source_remove_by_funcs_user_data:/<function parameters>/funcs]: Cannot render type Type(List(),ListMap(@name -> DataRecord(SourceFuncs), @type -> DataRecord(GSourceFuncs*)))"
  )
  private def sourceRemoveByFuncsUserData() = ???

  /** Removes a source from the default main loop context given the user data
    * for the callback. If multiple sources exist with the same user data, only
    * one will be destroyed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def sourceRemoveByUserData(
      user_data: Option[Ptr[Byte] /* Some(gpointer) */ ]
  ): Boolean /* Some(gboolean) */ = g_source_remove_by_user_data(
    user_data
      .map[gpointer](o => gpointer(o))
      .getOrElse(null.asInstanceOf[gpointer])
  ).value.!=(0)

  /** Sets the name of a source using its ID.
    *
    * This is a convenience utility to set source names from the return value of
    * g_idle_add(), g_timeout_add(), etc.
    *
    * It is a programmer error to attempt to set the name of a non-existent
    * source.
    *
    * More specifically: source IDs can be reissued after a source has been
    * destroyed and therefore it is never valid to use this function with a
    * source ID which may have already been removed. An example is when
    * scheduling an idle to run in another thread with g_idle_add(): the idle
    * may already have run and been removed by the time this function is called
    * on its (now invalid) source ID. This source ID may have been reissued,
    * leading to the operation being performed against the wrong source.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def sourceSetNameById(
      tag: UInt /* Some(guint) */,
      name: String /* Some(CString) */
  )(using Zone): Unit /* Some(Unit) */ =
    g_source_set_name_by_id(guint(tag), toCString(name))

  /** Gets the smallest prime number from a built-in array of primes which is
    * larger than @num. This is used within GLib to calculate the optimum size
    * of a #GHashTable.
    *
    * The built-in array of primes ranges from 11 to 13845163 such that each
    * prime is approximately 1.5-2 times the previous prime.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def spacedPrimesClosest(
      num: UInt /* Some(guint) */
  ): UInt /* Some(guint) */ = g_spaced_primes_closest(guint(num)).value

  /** Executes a child program asynchronously.
    *
    * See g_spawn_async_with_pipes() for a full description; this function
    * simply calls the g_spawn_async_with_pipes() without any pipes.
    *
    * You should call g_spawn_close_pid() on the returned child process
    * reference when you don't need it any more.
    *
    * If you are writing a GTK application, and the program you are spawning is
    * a graphical application too, then to ensure that the spawned program opens
    * its windows on the right screen, you may want to use #GdkAppLaunchContext,
    * #GAppLaunchContext, or set the %DISPLAY environment variable.
    *
    * Note that the returned @child_pid on Windows is a handle to the child
    * process and not its identifier. Process handles and process identifiers
    * are different concepts on Windows.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[spawn_async:]: Function spawn_async contains an OUT parameter, which is not supported yet"
  )
  private def spawnAsync() = ???

  /** Executes a child program asynchronously.
    *
    * Identical to g_spawn_async_with_pipes_and_fds() but with `n_fds` set to
    * zero, so no FD assignments are used.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[spawn_async_with_fds:]: Function spawn_async_with_fds contains an OUT parameter, which is not supported yet"
  )
  private def spawnAsyncWithFds() = ???

  /** Identical to g_spawn_async_with_pipes_and_fds() but with `n_fds` set to
    * zero, so no FD assignments are used.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[spawn_async_with_pipes:]: Function spawn_async_with_pipes contains an OUT parameter, which is not supported yet"
  )
  private def spawnAsyncWithPipes() = ???

  /**  Executes a child program asynchronously (your program will not
    *  block waiting for the child to exit).
    *
    *  The child program is specified by the only argument that must be
    *  provided, @argv. @argv should be a %NULL-terminated array of strings,
    *  to be passed as the argument vector for the child. The first string
    *  in @argv is of course the name of the program to execute. By default,
    *  the name of the program must be a full path. If @flags contains the
    *  %G_SPAWN_SEARCH_PATH flag, the `PATH` environment variable is used to
    *  search for the executable. If @flags contains the
    *  %G_SPAWN_SEARCH_PATH_FROM_ENVP flag, the `PATH` variable from @envp
    *  is used to search for the executable. If both the
    *  %G_SPAWN_SEARCH_PATH and %G_SPAWN_SEARCH_PATH_FROM_ENVP flags are
    *  set, the `PATH` variable from @envp takes precedence over the
    *  environment variable.
    *
    *  If the program name is not a full path and %G_SPAWN_SEARCH_PATH flag
    *  is not used, then the program will be run from the current directory
    *  (or @working_directory, if specified); this might be unexpected or even
    *  dangerous in some cases when the current directory is world-writable.
    *
    *  On Windows, note that all the string or string vector arguments to
    *  this function and the other `g_spawn*()` functions are in UTF-8, the
    *  GLib file name encoding. Unicode characters that are not part of
    *  the system codepage passed in these arguments will be correctly
    *  available in the spawned program only if it uses wide character API
    *  to retrieve its command line. For C programs built with Microsoft's
    *  tools it is enough to make the program have a `wmain()` instead of
    *  `main()`. `wmain()` has a wide character argument vector as parameter.
    *
    *  At least currently, mingw doesn't support `wmain()`, so if you use
    *  mingw to develop the spawned program, it should call
    *  g_win32_get_command_line() to get arguments in UTF-8.
    *
    *  On Windows the low-level child process creation API `CreateProcess()`
    *  doesn't use argument vectors, but a command line. The C runtime
    *  library's `spawn*()` family of functions (which g_spawn_async_with_pipes()
    *  eventually calls) paste the argument vector elements together into
    *  a command line, and the C runtime startup code does a corresponding
    *  reconstruction of an argument vector from the command line, to be
    *  passed to `main()`. Complications arise when you have argument vector
    *  elements that contain spaces or double quotes. The `spawn*()` functions
    *  don't do any quoting or escaping, but on the other hand the startup
    *  code does do unquoting and unescaping in order to enable receiving
    *  arguments with embedded spaces or double quotes. To work around this
    *  asymmetry, g_spawn_async_with_pipes() will do quoting and escaping on
    *  argument vector elements that need it before calling the C runtime
    *  `spawn()` function.
    *
    *  The returned @child_pid on Windows is a handle to the child
    *  process, not its identifier. Process handles and process
    *  identifiers are different concepts on Windows.
    *
    *  @envp is a %NULL-terminated array of strings, where each string
    *  has the form `KEY=VALUE`. This will become the child's environment.
    *  If @envp is %NULL, the child inherits its parent's environment.
    *
    *  @flags should be the bitwise OR of any flags you want to affect the
    *  function's behaviour. The %G_SPAWN_DO_NOT_REAP_CHILD means that the
    *  child will not automatically be reaped; you must use a child watch
    *  (g_child_watch_add()) to be notified about the death of the child process,
    *  otherwise it will stay around as a zombie process until this process exits.
    *  Eventually you must call g_spawn_close_pid() on the @child_pid, in order to
    *  free resources which may be associated with the child process. (On Unix,
    *  using a child watch is equivalent to calling waitpid() or handling
    *  the `SIGCHLD` signal manually. On Windows, calling g_spawn_close_pid()
    *  is equivalent to calling `CloseHandle()` on the process handle returned
    *  in @child_pid). See g_child_watch_add().
    *
    *  Open UNIX file descriptors marked as `FD_CLOEXEC` will be automatically
    *  closed in the child process. %G_SPAWN_LEAVE_DESCRIPTORS_OPEN means that
    *  other open file descriptors will be inherited by the child; otherwise all
    *  descriptors except stdin/stdout/stderr will be closed before calling `exec()`
    *  in the child. %G_SPAWN_SEARCH_PATH means that @argv[0] need not be an
    *  absolute path, it will be looked for in the `PATH` environment
    *  variable. %G_SPAWN_SEARCH_PATH_FROM_ENVP means need not be an
    *  absolute path, it will be looked for in the `PATH` variable from
    *  @envp. If both %G_SPAWN_SEARCH_PATH and %G_SPAWN_SEARCH_PATH_FROM_ENVP
    *  are used, the value from @envp takes precedence over the environment.
    *
    *  %G_SPAWN_CHILD_INHERITS_STDIN means that the child will inherit the parent's
    *  standard input (by default, the child's standard input is attached to
    *  `/dev/null`). %G_SPAWN_STDIN_FROM_DEV_NULL explicitly imposes the default
    *  behavior. Both flags cannot be enabled at the same time and, in both cases,
    *  the @stdin_pipe_out argument is ignored.
    *
    *  %G_SPAWN_STDOUT_TO_DEV_NULL means that the child's standard output
    *  will be discarded (by default, it goes to the same location as the parent's
    *  standard output). %G_SPAWN_CHILD_INHERITS_STDOUT explicitly imposes the
    *  default behavior. Both flags cannot be enabled at the same time and, in
    *  both cases, the @stdout_pipe_out argument is ignored.
    *
    *  %G_SPAWN_STDERR_TO_DEV_NULL means that the child's standard error
    *  will be discarded (by default, it goes to the same location as the parent's
    *  standard error). %G_SPAWN_CHILD_INHERITS_STDERR explicitly imposes the
    *  default behavior. Both flags cannot be enabled at the same time and, in
    *  both cases, the @stderr_pipe_out argument is ignored.
    *
    *  It is valid to pass the same FD in multiple parameters (e.g. you can pass
    *  a single FD for both @stdout_fd and @stderr_fd, and include it in
    *  @source_fds too).
    *
    *  @source_fds and @target_fds allow zero or more FDs from this process to be
    *  remapped to different FDs in the spawned process. If @n_fds is greater than
    *  zero, @source_fds and @target_fds must both be non-%NULL and the same length.
    *  Each FD in @source_fds is remapped to the FD number at the same index in
    *  @target_fds. The source and target FD may be equal to simply propagate an FD
    *  to the spawned process. FD remappings are processed after standard FDs, so
    *  any target FDs which equal @stdin_fd, @stdout_fd or @stderr_fd will overwrite
    *  them in the spawned process.
    *
    *  @source_fds is supported on Windows since 2.72.
    *
    *  %G_SPAWN_FILE_AND_ARGV_ZERO means that the first element of @argv is
    *  the file to execute, while the remaining elements are the actual
    *  argument vector to pass to the file. Normally g_spawn_async_with_pipes()
    *  uses @argv[0] as the file to execute, and passes all of @argv to the child.
    *
    *  @child_setup and @user_data are a function and user data. On POSIX
    *  platforms, the function is called in the child after GLib has
    *  performed all the setup it plans to perform (including creating
    *  pipes, closing file descriptors, etc.) but before calling `exec()`.
    *  That is, @child_setup is called just before calling `exec()` in the
    *  child. Obviously actions taken in this function will only affect
    *  the child, not the parent.
    *
    *  On Windows, there is no separate `fork()` and `exec()` functionality.
    *  Child processes are created and run with a single API call,
    *  `CreateProcess()`. There is no sensible thing @child_setup
    *  could be used for on Windows so it is ignored and not called.
    *
    *  If non-%NULL, @child_pid will on Unix be filled with the child's
    *  process ID. You can use the process ID to send signals to the child,
    *  or to use g_child_watch_add() (or `waitpid()`) if you specified the
    *  %G_SPAWN_DO_NOT_REAP_CHILD flag. On Windows, @child_pid will be
    *  filled with a handle to the child process only if you specified the
    *  %G_SPAWN_DO_NOT_REAP_CHILD flag. You can then access the child
    *  process using the Win32 API, for example wait for its termination
    *  with the `WaitFor*()` functions, or examine its exit code with
    *  `GetExitCodeProcess()`. You should close the handle with `CloseHandle()`
    *  or g_spawn_close_pid() when you no longer need it.
    *
    *  If non-%NULL, the @stdin_pipe_out, @stdout_pipe_out, @stderr_pipe_out
    *  locations will be filled with file descriptors for writing to the child's
    *  standard input or reading from its standard output or standard error.
    *  The caller of g_spawn_async_with_pipes() must close these file descriptors
    *  when they are no longer in use. If these parameters are %NULL, the
    *  corresponding pipe won't be created.
    *
    *  If @stdin_pipe_out is %NULL, the child's standard input is attached to
    *  `/dev/null` unless %G_SPAWN_CHILD_INHERITS_STDIN is set.
    *
    *  If @stderr_pipe_out is NULL, the child's standard error goes to the same
    *  location as the parent's standard error unless %G_SPAWN_STDERR_TO_DEV_NULL
    *  is set.
    *
    *  If @stdout_pipe_out is NULL, the child's standard output goes to the same
    *  location as the parent's standard output unless %G_SPAWN_STDOUT_TO_DEV_NULL
    *  is set.
    *
    *  @error can be %NULL to ignore errors, or non-%NULL to report errors.
    *  If an error is set, the function returns %FALSE. Errors are reported
    *  even if they occur in the child (for example if the executable in
    *  `@argv[0]` is not found). Typically the `message` field of returned
    *  errors should be displayed to users. Possible errors are those from
    *  the %G_SPAWN_ERROR domain.
    *
    *  If an error occurs, @child_pid, @stdin_pipe_out, @stdout_pipe_out,
    *  and @stderr_pipe_out will not be filled with valid values.
    *
    *  If @child_pid is not %NULL and an error does not occur then the returned
    *  process reference must be closed using g_spawn_close_pid().
    *
    *  On modern UNIX platforms, GLib can use an efficient process launching
    *  codepath driven internally by `posix_spawn()`. This has the advantage of
    *  avoiding the fork-time performance costs of cloning the parent process
    *  address space, and avoiding associated memory overcommit checks that are
    *  not relevant in the context of immediately executing a distinct process.
    *  This optimized codepath will be used provided that the following conditions
    *  are met:
    *
    *  1. %G_SPAWN_DO_NOT_REAP_CHILD is set
    *  2. %G_SPAWN_LEAVE_DESCRIPTORS_OPEN is set
    *  3. %G_SPAWN_SEARCH_PATH_FROM_ENVP is not set
    *  4. @working_directory is %NULL
    *  5. @child_setup is %NULL
    *  6. The program is of a recognised binary format, or has a shebang.
    *     Otherwise, GLib will have to execute the program through the
    *     shell, which is not done using the optimized codepath.
    *
    *  If you are writing a GTK application, and the program you are spawning is a
    *  graphical application too, then to ensure that the spawned program opens its
    *  windows on the right screen, you may want to use #GdkAppLaunchContext,
    *  #GAppLaunchContext, or set the `DISPLAY` environment variable.
    *
    *  NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[spawn_async_with_pipes_and_fds:]: Function spawn_async_with_pipes_and_fds contains an OUT parameter, which is not supported yet"
  )
  private def spawnAsyncWithPipesAndFds() = ???

  /** An old name for g_spawn_check_wait_status(), deprecated because its name
    * is misleading.
    *
    * Despite the name of the function, @wait_status must be the wait status as
    * returned by g_spawn_sync(), g_subprocess_get_status(), `waitpid()`, etc.
    * On Unix platforms, it is incorrect for it to be the exit status as passed
    * to `exit()` or returned by g_subprocess_get_exit_status() or
    * `WEXITSTATUS()`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def spawnCheckExitStatus(
      wait_status: Int /* Some(gint) */
  ): GResult[Boolean /* Some(gboolean) */ ] = GResult.wrap(__errorPtr =>
    g_spawn_check_exit_status(gint(wait_status), __errorPtr).value.!=(0)
  )

  /** Set @error if @wait_status indicates the child exited abnormally (e.g.
    * with a nonzero exit code, or via a fatal signal).
    *
    * The g_spawn_sync() and g_child_watch_add() family of APIs return the
    * status of subprocesses encoded in a platform-specific way. On Unix, this
    * is guaranteed to be in the same format waitpid() returns, and on Windows
    * it is guaranteed to be the result of GetExitCodeProcess().
    *
    * Prior to the introduction of this function in GLib 2.34, interpreting
    * @wait_status
    *   required use of platform-specific APIs, which is problematic for
    *   software using GLib as a cross-platform layer.
    *
    * Additionally, many programs simply want to determine whether or not the
    * child exited successfully, and either propagate a #GError or print a
    * message to standard error. In that common case, this function can be used.
    * Note that the error message in @error will contain human-readable
    * information about the wait status.
    *
    * The @domain and @code of @error have special semantics in the case where
    * the process has an "exit code", as opposed to being killed by a signal. On
    * Unix, this happens if WIFEXITED() would be true of
    * @wait_status.
    *   On Windows, it is always the case.
    *
    * The special semantics are that the actual exit code will be the code set
    * in @error, and the domain will be %G_SPAWN_EXIT_ERROR. This allows you to
    * differentiate between different exit codes.
    *
    * If the process was terminated by some means other than an exit status (for
    * example if it was killed by a signal), the domain will be %G_SPAWN_ERROR
    * and the code will be %G_SPAWN_ERROR_FAILED.
    *
    * This function just offers convenience; you can of course also check the
    * available platform via a macro such as %G_OS_UNIX, and use WIFEXITED() and
    * WEXITSTATUS() on @wait_status directly. Do not attempt to scan or parse
    * the error message string; it may be translated and/or change in future
    * versions of GLib.
    *
    * Prior to version 2.70, g_spawn_check_exit_status() provides the same
    * functionality, although under a misleading name.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def spawnCheckWaitStatus(
      wait_status: Int /* Some(gint) */
  ): GResult[Boolean /* Some(gboolean) */ ] = GResult.wrap(__errorPtr =>
    g_spawn_check_wait_status(gint(wait_status), __errorPtr).value.!=(0)
  )

  /** On some platforms, notably Windows, the #GPid type represents a resource
    * which must be closed to prevent resource leaking. g_spawn_close_pid() is
    * provided for this purpose. It should be used on all platforms, even though
    * it doesn't do anything under UNIX.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[spawn_close_pid:/<function parameters>/pid]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Pid), @type -> DataRecord(GPid)))"
  )
  private def spawnClosePid() = ???

  /** A simple version of g_spawn_async() that parses a command line with
    * g_shell_parse_argv() and passes it to g_spawn_async().
    *
    * Runs a command line in the background. Unlike g_spawn_async(), the
    * %G_SPAWN_SEARCH_PATH flag is enabled, other flags are not. Note that
    * %G_SPAWN_SEARCH_PATH can have security implications, so consider using
    * g_spawn_async() directly if appropriate. Possible errors are those from
    * g_shell_parse_argv() and g_spawn_async().
    *
    * The same concerns on Windows apply as for g_spawn_command_line_sync().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def spawnCommandLineAsync(command_line: String /* Some(Ptr[gchar]) */ )(using
      Zone
  ): GResult[Boolean /* Some(gboolean) */ ] = GResult.wrap(__errorPtr =>
    g_spawn_command_line_async(
      toCString(command_line).asInstanceOf[Ptr[gchar]],
      __errorPtr
    ).value.!=(0)
  )

  /** A simple version of g_spawn_sync() with little-used parameters removed,
    * taking a command line instead of an argument vector.
    *
    * See g_spawn_sync() for full details.
    *
    * The @command_line argument will be parsed by g_shell_parse_argv().
    *
    * Unlike g_spawn_sync(), the %G_SPAWN_SEARCH_PATH flag is enabled. Note that
    * %G_SPAWN_SEARCH_PATH can have security implications, so consider using
    * g_spawn_sync() directly if appropriate.
    *
    * Possible errors are those from g_spawn_sync() and those from
    * g_shell_parse_argv().
    *
    * If @wait_status is non-%NULL, the platform-specific status of the child is
    * stored there; see the documentation of g_spawn_check_wait_status() for how
    * to use and interpret this. On Unix platforms, note that it is usually not
    * equal to the integer passed to `exit()` or returned from `main()`.
    *
    * On Windows, please note the implications of g_shell_parse_argv() parsing @command_line.
    * Parsing is done according to Unix shell rules, not Windows command
    * interpreter rules. Space is a separator, and backslashes are special. Thus
    * you cannot simply pass a @command_line containing canonical Windows paths,
    * like "c:\\program files\\app\\app.exe", as the backslashes will be eaten,
    * and the space will act as a separator. You need to enclose such paths with
    * single quotes, like "'c:\\program files\\app\\app.exe'
    * 'e:\\folder\\argument.txt'".
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[spawn_command_line_sync:]: Function spawn_command_line_sync contains an OUT parameter, which is not supported yet"
  )
  private def spawnCommandLineSync() = ???

  @annotation.compileTimeOnly(
    "[spawn_error_quark:/<return type>]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Quark), @type -> DataRecord(GQuark)))"
  )
  private def spawnErrorQuark() = ???

  @annotation.compileTimeOnly(
    "[spawn_exit_error_quark:/<return type>]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Quark), @type -> DataRecord(GQuark)))"
  )
  private def spawnExitErrorQuark() = ???

  /** Executes a child synchronously (waits for the child to exit before
    * returning).
    *
    * All output from the child is stored in @standard_output and @standard_error,
    * if those parameters are non-%NULL. Note that you must set the
    * %G_SPAWN_STDOUT_TO_DEV_NULL and %G_SPAWN_STDERR_TO_DEV_NULL flags when
    * passing %NULL for @standard_output and @standard_error.
    *
    * If @wait_status is non-%NULL, the platform-specific status of the child is
    * stored there; see the documentation of g_spawn_check_wait_status() for how
    * to use and interpret this. On Unix platforms, note that it is usually not
    * equal to the integer passed to `exit()` or returned from `main()`.
    *
    * Note that it is invalid to pass %G_SPAWN_DO_NOT_REAP_CHILD in
    * @flags,
    *   and on POSIX platforms, the same restrictions as for
    *   g_child_watch_source_new() apply.
    *
    * If an error occurs, no data is returned in @standard_output,
    * @standard_error,
    *   or @wait_status.
    *
    * This function calls g_spawn_async_with_pipes() internally; see that
    * function for full details on the other parameters and details on how these
    * functions work on Windows.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[spawn_sync:]: Function spawn_sync contains an OUT parameter, which is not supported yet"
  )
  private def spawnSync() = ???

  /** An implementation of the standard sprintf() function which supports
    * positional parameters, as specified in the Single Unix Specification.
    *
    * Note that it is usually better to use g_snprintf(), to avoid the risk of
    * buffer overflow.
    *
    * `glib/gprintf.h` must be explicitly included in order to use this
    * function.
    *
    * See also g_strdup_printf().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[sprintf:]: Method g_sprintf has no target types"
  )
  private def sprintf() = ???

  /** Copies a nul-terminated string into the destination buffer, including the
    * trailing nul byte, and returns a pointer to the trailing nul byte in
    * `dest`. The return value is useful for concatenating multiple strings
    * without having to repeatedly scan for the end.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def stpcpy(
      dest: String /* Some(Ptr[gchar]) */,
      src: String /* Some(CString) */
  )(using Zone): String /* Some(Ptr[gchar]) */ = fromCString(
    g_stpcpy(
      toCString(dest).asInstanceOf[Ptr[gchar]],
      toCString(src)
    ).asInstanceOf
  )

  /** Compares two strings for byte-by-byte equality and returns %TRUE if they
    * are equal. It can be passed to g_hash_table_new() as the
    * @key_equal_func
    *   parameter, when using non-%NULL strings as keys in a #GHashTable.
    *
    * This function is typically used for hash table comparisons, but can be
    * used for general purpose comparisons of non-%NULL strings. For a
    * %NULL-safe string comparison function, see g_strcmp0().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def strEqual(
      v1: Ptr[Byte] /* Some(gconstpointer) */,
      v2: Ptr[Byte] /* Some(gconstpointer) */
  ): Boolean /* Some(gboolean) */ =
    g_str_equal(gconstpointer(v1), gconstpointer(v2)).value.!=(0)

  /** Looks whether the string @str begins with @prefix.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def strHasPrefix(
      str: String /* Some(Ptr[gchar]) */,
      prefix: String /* Some(Ptr[gchar]) */
  )(using Zone): Boolean /* Some(gboolean) */ = g_str_has_prefix(
    toCString(str).asInstanceOf[Ptr[gchar]],
    toCString(prefix).asInstanceOf[Ptr[gchar]]
  ).value.!=(0)

  /** Looks whether the string @str ends with @suffix.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def strHasSuffix(
      str: String /* Some(Ptr[gchar]) */,
      suffix: String /* Some(Ptr[gchar]) */
  )(using Zone): Boolean /* Some(gboolean) */ = g_str_has_suffix(
    toCString(str).asInstanceOf[Ptr[gchar]],
    toCString(suffix).asInstanceOf[Ptr[gchar]]
  ).value.!=(0)

  /** Converts a string to a hash value.
    *
    * This function implements the widely used "djb" hash apparently posted by
    * Daniel Bernstein to comp.lang.c some time ago. The 32 bit unsigned hash
    * value starts at 5381 and for each byte 'c' in the string, is updated:
    * `hash = hash * 33 + c`. This function uses the signed value of each byte.
    *
    * It can be passed to g_hash_table_new() as the @hash_func parameter, when
    * using non-%NULL strings as keys in a #GHashTable.
    *
    * Note that this function may not be a perfect fit for all use cases. For
    * example, it produces some hash collisions with strings as short as 2.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def strHash(v: Ptr[Byte] /* Some(gconstpointer) */ ): UInt /* Some(guint) */ =
    g_str_hash(gconstpointer(v)).value

  /** Determines if a string is pure ASCII. A string is pure ASCII if it
    * contains no bytes with the high bit set.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def strIsAscii(
      str: String /* Some(Ptr[gchar]) */
  )(using Zone): Boolean /* Some(gboolean) */ =
    g_str_is_ascii(toCString(str).asInstanceOf[Ptr[gchar]]).value.!=(0)

  /** Checks if a search conducted for @search_term should match
    * @potential_hit.
    *
    * This function calls g_str_tokenize_and_fold() on both
    * @search_term
    *   and @potential_hit. ASCII alternates are never taken for @search_term
    *   but will be taken for @potential_hit according to the value of @accept_alternates.
    *
    * A hit occurs when each folded token in @search_term is a prefix of a
    * folded token from @potential_hit.
    *
    * Depending on how you're performing the search, it will typically be faster
    * to call g_str_tokenize_and_fold() on each string in your corpus and build
    * an index on the returned folded tokens, then call
    * g_str_tokenize_and_fold() on the search term and perform lookups into that
    * index.
    *
    * As some examples, searching for ‘fred’ would match the potential hit
    * ‘Smith, Fred’ and also ‘Frédéric’. Searching for ‘Fréd’ would match
    * ‘Frédéric’ but not ‘Frederic’ (due to the one-directional nature of accent
    * matching). Searching ‘fo’ would match ‘Foo’ and ‘Bar Foo Baz’, but not
    * ‘SFO’ (because no word has ‘fo’ as a prefix).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def strMatchString(
      search_term: String /* Some(Ptr[gchar]) */,
      potential_hit: String /* Some(Ptr[gchar]) */,
      accept_alternates: Boolean /* Some(gboolean) */
  )(using Zone): Boolean /* Some(gboolean) */ = g_str_match_string(
    toCString(search_term).asInstanceOf[Ptr[gchar]],
    toCString(potential_hit).asInstanceOf[Ptr[gchar]],
    gboolean(gint((if accept_alternates == true then 1 else 0)))
  ).value.!=(0)

  /** Transliterate @str to plain ASCII.
    *
    * For best results, @str should be in composed normalised form.
    *
    * This function performs a reasonably good set of character replacements.
    * The particular set of replacements that is done may change by version or
    * even by runtime environment.
    *
    * If the source language of @str is known, it can used to improve the
    * accuracy of the translation by passing it as @from_locale. It should be a
    * valid POSIX locale string (of the form
    * `language[_territory][.codeset][@modifier]`).
    *
    * If @from_locale is %NULL then the current locale is used.
    *
    * If you want to do translation for no specific locale, and you want it to
    * be done independently of the currently locale, specify `"C"` for
    * @from_locale.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def strToAscii(
      str: String /* Some(Ptr[gchar]) */,
      from_locale: Option[String /* Some(Ptr[gchar]) */ ]
  )(using Zone): String /* Some(Ptr[gchar]) */ = fromCString(
    g_str_to_ascii(
      toCString(str).asInstanceOf[Ptr[gchar]],
      from_locale
        .map[Ptr[gchar]](o => toCString(o).asInstanceOf[Ptr[gchar]])
        .getOrElse(null.asInstanceOf[Ptr[gchar]])
    ).asInstanceOf
  )

  /** Tokenises @string and performs folding on each token.
    *
    * A token is a non-empty sequence of alphanumeric characters in the source
    * string, separated by non-alphanumeric characters. An "alphanumeric"
    * character for this purpose is one that matches g_unichar_isalnum() or
    * g_unichar_ismark().
    *
    * Each token is then (Unicode) normalised and case-folded. If
    * @ascii_alternates
    *   is non-%NULL and some of the returned tokens contain non-ASCII
    *   characters, ASCII alternatives will be generated.
    *
    * The number of ASCII alternatives that are generated and the method for
    * doing so is unspecified, but @translit_locale (if specified) may improve
    * the transliteration if the language of the source string is known.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[str_tokenize_and_fold:]: Function str_tokenize_and_fold contains an OUT parameter, which is not supported yet"
  )
  private def strTokenizeAndFold() = ???

  /**  For each character in @string, if the character is not in @valid_chars,
    *  replaces the character with @substitutor.
    *
    *  Modifies @string in place, and return @string itself, not a copy. The
    *  return value is to allow nesting such as:
    *
    *  |[<!-- language="C" -->
    *    g_ascii_strup (g_strcanon (str, "abc", '?'))
    *  ]|
    *
    *  In order to modify a copy, you may use g_strdup():
    *
    *  |[<!-- language="C" -->
    *    reformatted = g_strcanon (g_strdup (const_str), "abc", '?');
    *    ...
    *    g_free (reformatted);
    *  ]|
    *
    *  NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT BE APPLICABLE TO SCALA
    */
  def strcanon(
      string: String /* Some(Ptr[gchar]) */,
      valid_chars: String /* Some(Ptr[gchar]) */,
      substitutor: Byte /* Some(gchar) */
  )(using Zone): String /* Some(Ptr[gchar]) */ = fromCString(
    g_strcanon(
      toCString(string).asInstanceOf[Ptr[gchar]],
      toCString(valid_chars).asInstanceOf[Ptr[gchar]],
      gchar(substitutor)
    ).asInstanceOf
  )

  /** A case-insensitive string comparison, corresponding to the standard
    * strcasecmp() function on platforms which support it.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def strcasecmp(
      s1: String /* Some(Ptr[gchar]) */,
      s2: String /* Some(Ptr[gchar]) */
  )(using Zone): Int /* Some(gint) */ = g_strcasecmp(
    toCString(s1).asInstanceOf[Ptr[gchar]],
    toCString(s2).asInstanceOf[Ptr[gchar]]
  ).value

  /** Removes trailing whitespace from a string.
    *
    * This function doesn't allocate or reallocate any memory; it modifies @string
    * in place. Therefore, it cannot be used on statically allocated strings.
    *
    * The pointer to @string is returned to allow the nesting of functions.
    *
    * Also see g_strchug() and g_strstrip().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def strchomp(
      string: String /* Some(Ptr[gchar]) */
  )(using Zone): String /* Some(Ptr[gchar]) */ = fromCString(
    g_strchomp(toCString(string).asInstanceOf[Ptr[gchar]]).asInstanceOf
  )

  /** Removes leading whitespace from a string, by moving the rest of the
    * characters forward.
    *
    * This function doesn't allocate or reallocate any memory; it modifies @string
    * in place. Therefore, it cannot be used on statically allocated strings.
    *
    * The pointer to @string is returned to allow the nesting of functions.
    *
    * Also see g_strchomp() and g_strstrip().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def strchug(
      string: String /* Some(Ptr[gchar]) */
  )(using Zone): String /* Some(Ptr[gchar]) */ = fromCString(
    g_strchug(toCString(string).asInstanceOf[Ptr[gchar]]).asInstanceOf
  )

  /** Compares @str1 and @str2 like strcmp(). Handles %NULL gracefully by
    * sorting it before non-%NULL strings. Comparing two %NULL pointers returns 0.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def strcmp0(
      str1: Option[String /* Some(CString) */ ],
      str2: Option[String /* Some(CString) */ ]
  )(using Zone): Int /* Some(CInt) */ = g_strcmp0(
    str1.map[CString](o => toCString(o)).getOrElse(null.asInstanceOf[CString]),
    str2.map[CString](o => toCString(o)).getOrElse(null.asInstanceOf[CString])
  )

  /** Replaces all escaped characters with their one byte equivalent.
    *
    * This function does the reverse conversion of g_strescape().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def strcompress(
      source: String /* Some(Ptr[gchar]) */
  )(using Zone): String /* Some(Ptr[gchar]) */ = fromCString(
    g_strcompress(toCString(source).asInstanceOf[Ptr[gchar]]).asInstanceOf
  )

  /** Concatenates all of the given strings into one long string. The returned
    * string should be freed with g_free() when no longer needed.
    *
    * The variable argument list must end with %NULL. If you forget the %NULL,
    * g_strconcat() will start appending random memory junk to your string.
    *
    * Note that this function is usually not the right function to use to
    * assemble a translated message from pieces, since proper translation often
    * requires the pieces to be reordered.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[strconcat:/<function parameters>]: Vararg parameters require inlining which doesn't work with overriding"
  )
  private def strconcat() = ???

  /**  Converts any delimiter characters in @string to @new_delimiter.
    *
    *  Any characters in @string which are found in @delimiters are
    *  changed to the @new_delimiter character. Modifies @string in place,
    *  and returns @string itself, not a copy.
    *
    *  The return value is to allow nesting such as:
    *
    *  |[<!-- language="C" -->
    *    g_ascii_strup (g_strdelimit (str, "abc", '?'))
    *  ]|
    *
    *  In order to modify a copy, you may use g_strdup():
    *
    *  |[<!-- language="C" -->
    *    reformatted = g_strdelimit (g_strdup (const_str), "abc", '?');
    *    ...
    *    g_free (reformatted);
    *  ]|
    *
    *  NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT BE APPLICABLE TO SCALA
    */
  def strdelimit(
      string: String /* Some(Ptr[gchar]) */,
      delimiters: Option[String /* Some(Ptr[gchar]) */ ],
      new_delimiter: Byte /* Some(gchar) */
  )(using Zone): String /* Some(Ptr[gchar]) */ = fromCString(
    g_strdelimit(
      toCString(string).asInstanceOf[Ptr[gchar]],
      delimiters
        .map[Ptr[gchar]](o => toCString(o).asInstanceOf[Ptr[gchar]])
        .getOrElse(null.asInstanceOf[Ptr[gchar]]),
      gchar(new_delimiter)
    ).asInstanceOf
  )

  /** Converts a string to lower case.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def strdown(
      string: String /* Some(Ptr[gchar]) */
  )(using Zone): String /* Some(Ptr[gchar]) */ = fromCString(
    g_strdown(toCString(string).asInstanceOf[Ptr[gchar]]).asInstanceOf
  )

  /** Duplicates a string. If @str is %NULL it returns %NULL. The returned
    * string should be freed with g_free() when no longer needed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def strdup(
      str: Option[String /* Some(Ptr[gchar]) */ ]
  )(using Zone): String /* Some(Ptr[gchar]) */ = fromCString(
    g_strdup(
      str
        .map[Ptr[gchar]](o => toCString(o).asInstanceOf[Ptr[gchar]])
        .getOrElse(null.asInstanceOf[Ptr[gchar]])
    ).asInstanceOf
  )

  /** Similar to the standard C sprintf() function but safer, since it
    * calculates the maximum space required and allocates memory to hold the
    * result. The returned string should be freed with g_free() when no longer
    * needed.
    *
    * The returned string is guaranteed to be non-NULL, unless @format contains
    * `%lc` or `%ls` conversions, which can fail if no multibyte representation
    * is available for the given character.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[strdup_printf:/<function parameters>]: Vararg parameters require inlining which doesn't work with overriding"
  )
  private def strdupPrintf() = ???

  /** Similar to the standard C vsprintf() function but safer, since it
    * calculates the maximum space required and allocates memory to hold the
    * result. The returned string should be freed with g_free() when no longer
    * needed.
    *
    * The returned string is guaranteed to be non-NULL, unless @format contains
    * `%lc` or `%ls` conversions, which can fail if no multibyte representation
    * is available for the given character.
    *
    * See also g_vasprintf(), which offers the same functionality, but
    * additionally returns the length of the allocated string.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def strdupVprintf(
      format: String /* Some(Ptr[gchar]) */,
      args: CVarArgList /* Some(va_list) */
  )(using Zone): String /* Some(Ptr[gchar]) */ = fromCString(
    g_strdup_vprintf(
      toCString(format).asInstanceOf[Ptr[gchar]],
      args
    ).asInstanceOf
  )

  /** Copies %NULL-terminated array of strings. The copy is a deep copy; the new
    * array should be freed by first freeing each string, then the array itself.
    * g_strfreev() does this for you. If called on a %NULL value, g_strdupv()
    * simply returns %NULL.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[strdupv:/<function parameters>/str_array]: Cannot render type Type(List(),ListMap(@name -> DataRecord(utf8), @type -> DataRecord(gchar**)))"
  )
  private def strdupv() = ???

  /**  Returns a string corresponding to the given error code, e.g. "no
    *  such process". Unlike strerror(), this always returns a string in
    *  UTF-8 encoding, and the pointer is guaranteed to remain valid for
    *  the lifetime of the process.
    *
    *  Note that the string may be translated according to the current locale.
    *
    *  The value of %errno will not be changed by this function. However, it may
    *  be changed by intermediate function calls, so you should save its value
    *  as soon as the call returns:
    *  |[
    *    int saved_errno;
    *
    *    ret = read (blah);
    *    saved_errno = errno;
    *
    *    g_strerror (saved_errno);
    *  ]|
    *
    *  NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT BE APPLICABLE TO SCALA
    */
  def strerror(
      errnum: Int /* Some(gint) */
  )(using Zone): String /* Some(Ptr[gchar]) */ = fromCString(
    g_strerror(gint(errnum)).asInstanceOf
  )

  /** Escapes the special characters '\b', '\f', '\n', '\r', '\t', '\v', '\' and
    * '"' in the string @source by inserting a '\' before them. Additionally all
    * characters in the range 0x01-0x1F (everything below SPACE) and in the
    * range 0x7F-0xFF (all non-ASCII chars) are replaced with a '\' followed by
    * their octal representation. Characters supplied in @exceptions are not
    * escaped.
    *
    * g_strcompress() does the reverse conversion.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def strescape(
      source: String /* Some(Ptr[gchar]) */,
      exceptions: Option[String /* Some(Ptr[gchar]) */ ]
  )(using Zone): String /* Some(Ptr[gchar]) */ = fromCString(
    g_strescape(
      toCString(source).asInstanceOf[Ptr[gchar]],
      exceptions
        .map[Ptr[gchar]](o => toCString(o).asInstanceOf[Ptr[gchar]])
        .getOrElse(null.asInstanceOf[Ptr[gchar]])
    ).asInstanceOf
  )

  /** Frees a %NULL-terminated array of strings, as well as each string it
    * contains.
    *
    * If @str_array is %NULL, this function simply returns.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[strfreev:/<function parameters>/str_array]: Cannot render type Type(List(),ListMap(@name -> DataRecord(utf8), @type -> DataRecord(gchar**)))"
  )
  private def strfreev() = ???

  /** An auxiliary function for gettext() support (see Q_()).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def stripContext(
      msgid: String /* Some(Ptr[gchar]) */,
      msgval: String /* Some(Ptr[gchar]) */
  )(using Zone): String /* Some(Ptr[gchar]) */ = fromCString(
    g_strip_context(
      toCString(msgid).asInstanceOf[Ptr[gchar]],
      toCString(msgval).asInstanceOf[Ptr[gchar]]
    ).asInstanceOf
  )

  /** Joins a number of strings together to form one long string, with the
    * optional @separator inserted between each of them. The returned string
    * should be freed with g_free().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[strjoin:/<function parameters>]: Vararg parameters require inlining which doesn't work with overriding"
  )
  private def strjoin() = ???

  /** Joins a number of strings together to form one long string, with the
    * optional @separator inserted between each of them. The returned string
    * should be freed with g_free().
    *
    * If @str_array has no items, the return value will be an empty string. If @str_array
    * contains a single item, @separator will not appear in the resulting
    * string.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[strjoinv:/<function parameters>/str_array]: Cannot render type Type(List(),ListMap(@name -> DataRecord(utf8), @type -> DataRecord(gchar**)))"
  )
  private def strjoinv() = ???

  /**  Portability wrapper that calls strlcat() on systems which have it,
    *  and emulates it otherwise. Appends nul-terminated @src string to @dest,
    *  guaranteeing nul-termination for @dest. The total size of @dest won't
    *  exceed @dest_size.
    *
    *  At most @dest_size - 1 characters will be copied. Unlike strncat(),
    *  @dest_size is the full size of dest, not the space left over. This
    *  function does not allocate memory. It always nul-terminates (unless
    *  @dest_size == 0 or there were no nul characters in the @dest_size
    *  characters of dest to start with).
    *
    *  Caveat: this is supposedly a more secure alternative to strcat() or
    *  strncat(), but for real security g_strconcat() is harder to mess up.
    *
    *  NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT BE APPLICABLE TO SCALA
    */
  def strlcat(
      dest: String /* Some(Ptr[gchar]) */,
      src: String /* Some(Ptr[gchar]) */,
      dest_size: CUnsignedLongInt /* Some(gsize) */
  )(using Zone): CUnsignedLongInt /* Some(gsize) */ = g_strlcat(
    toCString(dest).asInstanceOf[Ptr[gchar]],
    toCString(src).asInstanceOf[Ptr[gchar]],
    gsize(dest_size)
  ).value

  /** Portability wrapper that calls strlcpy() on systems which have it, and
    * emulates strlcpy() otherwise. Copies @src to @dest; @dest is guaranteed to
    * be nul-terminated; @src must be nul-terminated;
    * @dest_size
    *   is the buffer size, not the number of bytes to copy.
    *
    * At most @dest_size - 1 characters will be copied. Always nul-terminates
    * (unless @dest_size is 0). This function does not allocate memory. Unlike
    * strncpy(), this function doesn't pad @dest (so it's often faster). It
    * returns the size of the attempted result, strlen (src), so if
    * @retval
    *   >= @dest_size, truncation occurred.
    *
    * Caveat: strlcpy() is supposedly more secure than strcpy() or strncpy(),
    * but if you really want to avoid screwups, g_strdup() is an even better
    * idea.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def strlcpy(
      dest: String /* Some(Ptr[gchar]) */,
      src: String /* Some(Ptr[gchar]) */,
      dest_size: CUnsignedLongInt /* Some(gsize) */
  )(using Zone): CUnsignedLongInt /* Some(gsize) */ = g_strlcpy(
    toCString(dest).asInstanceOf[Ptr[gchar]],
    toCString(src).asInstanceOf[Ptr[gchar]],
    gsize(dest_size)
  ).value

  /** A case-insensitive string comparison, corresponding to the standard
    * strncasecmp() function on platforms which support it. It is similar to
    * g_strcasecmp() except it only compares the first @n characters of the
    * strings.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def strncasecmp(
      s1: String /* Some(Ptr[gchar]) */,
      s2: String /* Some(Ptr[gchar]) */,
      n: UInt /* Some(guint) */
  )(using Zone): Int /* Some(gint) */ = g_strncasecmp(
    toCString(s1).asInstanceOf[Ptr[gchar]],
    toCString(s2).asInstanceOf[Ptr[gchar]],
    guint(n)
  ).value

  /** Duplicates the first @n bytes of a string, returning a newly-allocated
    * buffer @n + 1 bytes long which will always be nul-terminated. If @str is
    * less than @n bytes long the buffer is padded with nuls. If @str is %NULL
    * it returns %NULL. The returned value should be freed when no longer
    * needed.
    *
    * To copy a number of characters from a UTF-8 encoded string, use
    * g_utf8_strncpy() instead.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def strndup(
      str: String /* Some(Ptr[gchar]) */,
      n: CUnsignedLongInt /* Some(gsize) */
  )(using Zone): String /* Some(Ptr[gchar]) */ = fromCString(
    g_strndup(toCString(str).asInstanceOf[Ptr[gchar]], gsize(n)).asInstanceOf
  )

  /** Creates a new string @length bytes long filled with @fill_char. The
    * returned string should be freed when no longer needed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def strnfill(
      length: CUnsignedLongInt /* Some(gsize) */,
      fill_char: Byte /* Some(gchar) */
  )(using Zone): String /* Some(Ptr[gchar]) */ = fromCString(
    g_strnfill(gsize(length), gchar(fill_char)).asInstanceOf
  )

  /** Reverses all of the bytes in a string. For example,
    * `g_strreverse ("abcdef")` will result in "fedcba".
    *
    * Note that g_strreverse() doesn't work on UTF-8 strings containing
    * multibyte characters. For that purpose, use g_utf8_strreverse().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def strreverse(
      string: String /* Some(Ptr[gchar]) */
  )(using Zone): String /* Some(Ptr[gchar]) */ = fromCString(
    g_strreverse(toCString(string).asInstanceOf[Ptr[gchar]]).asInstanceOf
  )

  /** Searches the string @haystack for the last occurrence of the string @needle.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def strrstr(
      haystack: String /* Some(Ptr[gchar]) */,
      needle: String /* Some(Ptr[gchar]) */
  )(using Zone): String /* Some(Ptr[gchar]) */ = fromCString(
    g_strrstr(
      toCString(haystack).asInstanceOf[Ptr[gchar]],
      toCString(needle).asInstanceOf[Ptr[gchar]]
    ).asInstanceOf
  )

  /** Searches the string @haystack for the last occurrence of the string @needle,
    * limiting the length of the search to @haystack_len.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def strrstrLen(
      haystack: String /* Some(Ptr[gchar]) */,
      haystack_len: CLongInt /* Some(gssize) */,
      needle: String /* Some(Ptr[gchar]) */
  )(using Zone): String /* Some(Ptr[gchar]) */ = fromCString(
    g_strrstr_len(
      toCString(haystack).asInstanceOf[Ptr[gchar]],
      gssize(haystack_len),
      toCString(needle).asInstanceOf[Ptr[gchar]]
    ).asInstanceOf
  )

  /** Returns a string describing the given signal, e.g. "Segmentation fault".
    * You should use this function in preference to strsignal(), because it
    * returns a string in UTF-8 encoding, and since not all platforms support
    * the strsignal() function.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def strsignal(
      signum: Int /* Some(gint) */
  )(using Zone): String /* Some(Ptr[gchar]) */ = fromCString(
    g_strsignal(gint(signum)).asInstanceOf
  )

  /** Splits a string into a maximum of @max_tokens pieces, using the given
    * @delimiter.
    *   If @max_tokens is reached, the remainder of @string is appended to the
    *   last token.
    *
    * As an example, the result of g_strsplit (":a:bc::d:", ":", -1) is a
    * %NULL-terminated vector containing the six strings "", "a", "bc", "", "d"
    * and "".
    *
    * As a special case, the result of splitting the empty string "" is an empty
    * vector, not a vector containing a single string. The reason for this
    * special case is that being able to represent an empty vector is typically
    * more useful than consistent handling of empty elements. If you do need to
    * represent empty elements, you'll need to check for the empty string before
    * calling g_strsplit().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[strsplit:/<return type>]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(utf8)))),ListMap(@type -> DataRecord(gchar**)))"
  )
  private def strsplit() = ???

  /** Splits @string into a number of tokens not containing any of the
    * characters in @delimiter. A token is the (possibly empty) longest string
    * that does not contain any of the characters in @delimiters. If @max_tokens
    * is reached, the remainder is appended to the last token.
    *
    * For example the result of g_strsplit_set ("abc:def/ghi", ":/", -1) is a
    * %NULL-terminated vector containing the three strings "abc", "def", and
    * "ghi".
    *
    * The result of g_strsplit_set (":def/ghi:", ":/", -1) is a %NULL-terminated
    * vector containing the four strings "", "def", "ghi", and "".
    *
    * As a special case, the result of splitting the empty string "" is an empty
    * vector, not a vector containing a single string. The reason for this
    * special case is that being able to represent an empty vector is typically
    * more useful than consistent handling of empty elements. If you do need to
    * represent empty elements, you'll need to check for the empty string before
    * calling g_strsplit_set().
    *
    * Note that this function works on bytes not characters, so it can't be used
    * to delimit UTF-8 strings for anything but ASCII characters.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[strsplit_set:/<return type>]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(utf8)))),ListMap(@type -> DataRecord(gchar**)))"
  )
  private def strsplitSet() = ???

  /** Searches the string @haystack for the first occurrence of the string @needle,
    * limiting the length of the search to @haystack_len or a nul terminator
    * byte (whichever is reached first).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def strstrLen(
      haystack: String /* Some(Ptr[gchar]) */,
      haystack_len: CLongInt /* Some(gssize) */,
      needle: String /* Some(Ptr[gchar]) */
  )(using Zone): String /* Some(Ptr[gchar]) */ = fromCString(
    g_strstr_len(
      toCString(haystack).asInstanceOf[Ptr[gchar]],
      gssize(haystack_len),
      toCString(needle).asInstanceOf[Ptr[gchar]]
    ).asInstanceOf
  )

  /** Converts a string to a #gdouble value. It calls the standard strtod()
    * function to handle the conversion, but if the string is not completely
    * converted it attempts the conversion again with g_ascii_strtod(), and
    * returns the best match.
    *
    * This function should seldom be used. The normal situation when reading
    * numbers not for human consumption is to use g_ascii_strtod(). Only when
    * you know that you must expect both locale formatted and C formatted
    * numbers should you use this. Make sure that you don't pass strings such as
    * comma separated lists of values, since the commas may be interpreted as a
    * decimal point in some locales, causing unexpected results.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[strtod:]: Function strtod contains an OUT parameter, which is not supported yet"
  )
  private def strtod() = ???

  /** Converts a string to upper case.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def strup(
      string: String /* Some(Ptr[gchar]) */
  )(using Zone): String /* Some(Ptr[gchar]) */ = fromCString(
    g_strup(toCString(string).asInstanceOf[Ptr[gchar]]).asInstanceOf
  )

  /** Checks if @strv contains @str. @strv must not be %NULL.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[strv_contains:/<function parameters>/strv]: Cannot render type Type(List(),ListMap(@name -> DataRecord(utf8), @type -> DataRecord(const gchar* const*)))"
  )
  private def strvContains() = ???

  /** Checks if @strv1 and @strv2 contain exactly the same elements in exactly
    * the same order. Elements are compared using g_str_equal(). To match
    * independently of order, sort the arrays first (using g_qsort_with_data()
    * or similar).
    *
    * Two empty arrays are considered equal. Neither @strv1 not @strv2 may be
    * %NULL.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[strv_equal:/<function parameters>/strv1]: Cannot render type Type(List(),ListMap(@name -> DataRecord(utf8), @type -> DataRecord(const gchar* const*)))"
  )
  private def strvEqual() = ???

  @annotation.compileTimeOnly(
    "[strv_get_type:]: Function strv_get_type is weird: Incorrectly sitting in gobject bindings?"
  )
  private def strvGetType() = ???

  /** Returns the length of the given %NULL-terminated string array @str_array. @str_array
    * must not be %NULL.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[strv_length:/<function parameters>/str_array]: Cannot render type Type(List(),ListMap(@name -> DataRecord(utf8), @type -> DataRecord(gchar**)))"
  )
  private def strvLength() = ???

  /** Create a new test case, similar to g_test_create_case(). However the test
    * is assumed to use no fixture, and test suites are automatically created on
    * the fly and added to the root fixture, based on the slash-separated
    * portions of @testpath. The @test_data argument will be passed as first
    * argument to @test_func.
    *
    * If @testpath includes the component "subprocess" anywhere in it, the test
    * will be skipped by default, and only run if explicitly required via the
    * `-p` command-line option or g_test_trap_subprocess().
    *
    * No component of @testpath may start with a dot (`.`) if the
    * %G_TEST_OPTION_ISOLATE_DIRS option is being used; and it is recommended to
    * do so even if it isn’t.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[test_add_data_func:/<function parameters>/test_func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TestDataFunc), @type -> DataRecord(GTestDataFunc)))"
  )
  private def testAddDataFunc() = ???

  /** Create a new test case, as with g_test_add_data_func(), but freeing
    * @test_data
    *   after the test run is complete.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[test_add_data_func_full:/<function parameters>/test_func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TestDataFunc), @type -> DataRecord(GTestDataFunc)))"
  )
  private def testAddDataFuncFull() = ???

  /** Create a new test case, similar to g_test_create_case(). However the test
    * is assumed to use no fixture, and test suites are automatically created on
    * the fly and added to the root fixture, based on the slash-separated
    * portions of @testpath.
    *
    * If @testpath includes the component "subprocess" anywhere in it, the test
    * will be skipped by default, and only run if explicitly required via the
    * `-p` command-line option or g_test_trap_subprocess().
    *
    * No component of @testpath may start with a dot (`.`) if the
    * %G_TEST_OPTION_ISOLATE_DIRS option is being used; and it is recommended to
    * do so even if it isn’t.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[test_add_func:/<function parameters>/test_func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TestFunc), @type -> DataRecord(GTestFunc)))"
  )
  private def testAddFunc() = ???

  @annotation.compileTimeOnly(
    "[test_add_vtable:/<function parameters>/data_setup]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TestFixtureFunc), @type -> DataRecord(GTestFixtureFunc)))"
  )
  private def testAddVtable() = ???

  def testAssertExpectedMessagesInternal(
      domain: String /* Some(CString) */,
      file: String /* Some(CString) */,
      line: Int /* Some(CInt) */,
      func: String /* Some(CString) */
  )(using Zone): Unit /* Some(Unit) */ =
    g_test_assert_expected_messages_internal(
      toCString(domain),
      toCString(file),
      line,
      toCString(func)
    )

  /** This function adds a message to test reports that associates a bug URI
    * with a test case.
    *
    * Bug URIs are constructed from a base URI set with g_test_bug_base() and @bug_uri_snippet.
    * If g_test_bug_base() has not been called, it is assumed to be the empty
    * string, so a full URI can be provided to g_test_bug() instead.
    *
    * Since GLib 2.70, the base URI is not prepended to @bug_uri_snippet if it
    * is already a valid URI.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def testBug(bug_uri_snippet: String /* Some(CString) */ )(using
      Zone
  ): Unit /* Some(Unit) */ = g_test_bug(toCString(bug_uri_snippet))

  /** Specify the base URI for bug reports.
    *
    * The base URI is used to construct bug report messages for g_test_message()
    * when g_test_bug() is called. Calling this function outside of a test case
    * sets the default base URI for all test cases. Calling it from within a
    * test case changes the base URI for the scope of the test case only. Bug
    * URIs are constructed by appending a bug specific URI portion to @uri_pattern,
    * or by replacing the special string `%s` within @uri_pattern if that is
    * present.
    *
    * If g_test_bug_base() is not called, bug URIs are formed solely from the
    * value provided by g_test_bug().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def testBugBase(uri_pattern: String /* Some(CString) */ )(using
      Zone
  ): Unit /* Some(Unit) */ = g_test_bug_base(toCString(uri_pattern))

  /** Creates the pathname to a data file that is required for a test.
    *
    * This function is conceptually similar to g_build_filename() except that
    * the first argument has been replaced with a #GTestFileType argument.
    *
    * The data file should either have been distributed with the module
    * containing the test (%G_TEST_DIST) or built as part of the build system of
    * that module (%G_TEST_BUILT).
    *
    * In order for this function to work in srcdir != builddir situations, the
    * G_TEST_SRCDIR and G_TEST_BUILDDIR environment variables need to have been
    * defined. As of 2.38, this is done by the glib.mk included in GLib. Please
    * ensure that your copy is up to date before using this function.
    *
    * In case neither variable is set, this function will fall back to using the
    * dirname portion of argv[0], possibly removing ".libs". This allows for
    * casual running of tests directly from the commandline in the srcdir ==
    * builddir case and should also support running of installed tests, assuming
    * the data files have been installed in the same relative path as the test
    * binary.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[test_build_filename:/<function parameters>]: Vararg parameters require inlining which doesn't work with overriding"
  )
  private def testBuildFilename() = ???

  /** Create a new #GTestCase, named @test_name.
    *
    * This API is fairly low level, and calling g_test_add() or
    * g_test_add_func() is preferable.
    *
    * When this test is executed, a fixture structure of size @data_size will be
    * automatically allocated and filled with zeros. Then @data_setup is called
    * to initialize the fixture. After fixture setup, the actual test function @data_test
    * is called. Once the test run completes, the fixture structure is torn down
    * by calling @data_teardown and after that the memory is automatically
    * released by the test framework.
    *
    * Splitting up a test run into fixture setup, test function and fixture
    * teardown is most useful if the same fixture type is used for multiple
    * tests. In this cases, g_test_create_case() will be called with the same
    * type of fixture (the @data_size argument), but varying
    * @test_name
    *   and @data_test arguments.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[test_create_case:/<function parameters>/data_setup]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TestFixtureFunc), @type -> DataRecord(GTestFixtureFunc)))"
  )
  private def testCreateCase() = ???

  /** Create a new test suite with the name @suite_name.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[test_create_suite:/<return type>]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TestSuite), @type -> DataRecord(GTestSuite*)))"
  )
  private def testCreateSuite() = ???

  /** Attempt to disable system crash reporting infrastructure.
    *
    * This function should be called before exercising code paths that are
    * expected or intended to crash, to avoid wasting resources in system-wide
    * crash collection infrastructure such as systemd-coredump or abrt.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def testDisableCrashReporting(): Unit /* Some(Unit) */ =
    g_test_disable_crash_reporting()

  /**  Indicates that a message with the given @log_domain and @log_level,
    *  with text matching @pattern, is expected to be logged. When this
    *  message is logged, it will not be printed, and the test case will
    *  not abort.
    *
    *  This API may only be used with the old logging API (g_log() without
    *  %G_LOG_USE_STRUCTURED defined). It will not work with the structured logging
    *  API. See [Testing for Messages][testing-for-messages].
    *
    *  Use g_test_assert_expected_messages() to assert that all
    *  previously-expected messages have been seen and suppressed.
    *
    *  You can call this multiple times in a row, if multiple messages are
    *  expected as a result of a single call. (The messages must appear in
    *  the same order as the calls to g_test_expect_message().)
    *
    *  For example:
    *
    *  |[<!-- language="C" -->
    *    // g_main_context_push_thread_default() should fail if the
    *    // context is already owned by another thread.
    *    g_test_expect_message (G_LOG_DOMAIN,
    *                           G_LOG_LEVEL_CRITICAL,
    *                           "assertion*acquired_context*failed");
    *    g_main_context_push_thread_default (bad_context);
    *    g_test_assert_expected_messages ();
    *  ]|
    *
    *  Note that you cannot use this to test g_error() messages, since
    *  g_error() intentionally never returns even if the program doesn't
    *  abort; use g_test_trap_subprocess() in this case.
    *
    *  If messages at %G_LOG_LEVEL_DEBUG are emitted, but not explicitly
    *  expected via g_test_expect_message() then they will be ignored.
    *
    *  NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT BE APPLICABLE TO SCALA
    */
  def testExpectMessage(
      log_domain: Option[String /* Some(Ptr[gchar]) */ ],
      log_level: LogLevelFlags /* Some(GLogLevelFlags) */,
      pattern: String /* Some(Ptr[gchar]) */
  )(using Zone): Unit /* Some(Unit) */ = g_test_expect_message(
    log_domain
      .map[Ptr[gchar]](o => toCString(o).asInstanceOf[Ptr[gchar]])
      .getOrElse(null.asInstanceOf[Ptr[gchar]]),
    log_level.raw,
    toCString(pattern).asInstanceOf[Ptr[gchar]]
  )

  /** Indicates that a test failed. This function can be called multiple times
    * from the same test. You can use this function if your test failed in a
    * recoverable way.
    *
    * Do not use this function if the failure of a test could cause other tests
    * to malfunction.
    *
    * Calling this function will not stop the test from running, you need to
    * return from the test function yourself. So you can produce additional
    * diagnostic messages or even continue running the test.
    *
    * If not called from inside a test, this function does nothing.
    *
    * Note that unlike g_test_skip() and g_test_incomplete(), this function does
    * not log a message alongside the test failure. If details of the test
    * failure are available, either log them with g_test_message() before
    * g_test_fail(), or use g_test_fail_printf() instead.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def testFail(): Unit /* Some(Unit) */ = g_test_fail()

  /** Equivalent to g_test_fail(), but also record a message like
    * g_test_skip_printf().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[test_fail_printf:/<function parameters>]: Vararg parameters require inlining which doesn't work with overriding"
  )
  private def testFailPrintf() = ???

  /** Returns whether a test has already failed. This will be the case when
    * g_test_fail(), g_test_incomplete() or g_test_skip() have been called, but
    * also if an assertion has failed.
    *
    * This can be useful to return early from a test if continuing after a
    * failed assertion might be harmful.
    *
    * The return value of this function is only meaningful if it is called from
    * inside a test function.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def testFailed(): Boolean /* Some(gboolean) */ = g_test_failed().value.!=(0)

  /** Gets the pathname of the directory containing test files of the type
    * specified by @file_type.
    *
    * This is approximately the same as calling g_test_build_filename("."), but
    * you don't need to free the return value.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def testGetDir(
      file_type: TestFileType /* Some(GTestFileType) */
  )(using Zone): String /* Some(Ptr[gchar]) */ = fromCString(
    g_test_get_dir(file_type.raw).asInstanceOf
  )

  /** Gets the pathname to a data file that is required for a test.
    *
    * This is the same as g_test_build_filename() with two differences. The
    * first difference is that you must only use this function from within a
    * testcase function. The second difference is that you need not free the
    * return value — it will be automatically freed when the testcase finishes
    * running.
    *
    * It is safe to use this function from a thread inside of a testcase but you
    * must ensure that all such uses occur before the main testcase function
    * returns (ie: it is best to ensure that all threads have been joined).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[test_get_filename:/<function parameters>]: Vararg parameters require inlining which doesn't work with overriding"
  )
  private def testGetFilename() = ???

  /** Gets the test path for the test currently being run.
    *
    * In essence, it will be the same string passed as the first argument to
    * e.g. g_test_add() when the test was added.
    *
    * This function returns a valid string only within a test function.
    *
    * Note that this is a test path, not a file system path.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def testGetPath()(using Zone): String /* Some(CString) */ = fromCString(
    g_test_get_path().asInstanceOf
  )

  /** Get the toplevel test suite for the test path API.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[test_get_root:/<return type>]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TestSuite), @type -> DataRecord(GTestSuite*)))"
  )
  private def testGetRoot() = ???

  /** Indicates that a test failed because of some incomplete functionality.
    * This function can be called multiple times from the same test.
    *
    * Calling this function will not stop the test from running, you need to
    * return from the test function yourself. So you can produce additional
    * diagnostic messages or even continue running the test.
    *
    * If not called from inside a test, this function does nothing.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def testIncomplete(
      msg: Option[String /* Some(Ptr[gchar]) */ ]
  )(using Zone): Unit /* Some(Unit) */ = g_test_incomplete(
    msg
      .map[Ptr[gchar]](o => toCString(o).asInstanceOf[Ptr[gchar]])
      .getOrElse(null.asInstanceOf[Ptr[gchar]])
  )

  /** Equivalent to g_test_incomplete(), but the explanation is formatted as if
    * by g_strdup_printf().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[test_incomplete_printf:/<function parameters>]: Vararg parameters require inlining which doesn't work with overriding"
  )
  private def testIncompletePrintf() = ???

  /** Initialize the GLib testing framework, e.g. by seeding the test random
    * number generator, the name for g_get_prgname() and parsing test related
    * command line args.
    *
    * This should be called before calling any other `g_test_*()` functions.
    *
    * So far, the following arguments are understood:
    *
    *   - `-l`: List test cases available in a test executable.
    *   - `--seed=SEED`: Provide a random seed to reproduce test runs using
    *     random numbers.
    *   - `--verbose`: Run tests verbosely.
    *   - `-q`, `--quiet`: Run tests quietly.
    *   - `-p PATH`: Execute all tests matching the given path.
    *   - `-s PATH`: Skip all tests matching the given path. This can also be
    *     used to force a test to run that would otherwise be skipped (ie, a
    *     test whose name contains "/subprocess").
    *   - `-m {perf|slow|thorough|quick|undefined|no-undefined}`: Execute tests
    *     according to these test modes:
    *
    * `perf`: Performance tests, may take long and report results (off by
    * default).
    *
    * `slow`, `thorough`: Slow and thorough tests, may take quite long and
    * maximize coverage (off by default).
    *
    * `quick`: Quick tests, should run really quickly and give good coverage
    * (the default).
    *
    * `undefined`: Tests for undefined behaviour, may provoke programming errors
    * under g_test_trap_subprocess() or g_test_expect_message() to check that
    * appropriate assertions or warnings are given (the default).
    *
    * `no-undefined`: Avoid tests for undefined behaviour
    *
    *   - `--debug-log`: Debug test logging output.
    *
    * Options which can be passed to @... are:
    *
    *   - `"no_g_set_prgname"`: Causes g_test_init() to not call
    *     g_set_prgname().
    *   - %G_TEST_OPTION_ISOLATE_DIRS: Creates a unique temporary directory for
    *     each unit test and uses g_set_user_dirs() to set XDG directories to
    *     point into that temporary directory for the duration of the unit test.
    *     See the documentation for %G_TEST_OPTION_ISOLATE_DIRS.
    *
    * Since 2.58, if tests are compiled with `G_DISABLE_ASSERT` defined,
    * g_test_init() will print an error and exit. This is to prevent no-op tests
    * from being executed, as g_assert() is commonly (erroneously) used in unit
    * tests, and is a no-op when compiled with `G_DISABLE_ASSERT`. Ensure your
    * tests are compiled without `G_DISABLE_ASSERT` defined.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[test_init:/<function parameters>/argc]: Cannot render type Type(List(),ListMap(@name -> DataRecord(gint), @type -> DataRecord(int*)))"
  )
  private def testInit() = ???

  /** Installs a non-error fatal log handler which can be used to decide whether
    * log messages which are counted as fatal abort the program.
    *
    * The use case here is that you are running a test case that depends on
    * particular libraries or circumstances and cannot prevent certain known
    * critical or warning messages. So you install a handler that compares the
    * domain and message to precisely not abort in such a case.
    *
    * Note that the handler is reset at the beginning of any test case, so you
    * have to set it inside each test function which needs the special behavior.
    *
    * This handler has no effect on g_error messages.
    *
    * This handler also has no effect on structured log messages (using
    * g_log_structured() or g_log_structured_array()). To change the fatal
    * behaviour for specific log messages, programs must install a custom log
    * writer function using g_log_set_writer_func().See [Using Structured
    * Logging][using-structured-logging].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[test_log_set_fatal_handler:/<function parameters>/log_func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TestLogFatalFunc), @type -> DataRecord(GTestLogFatalFunc)))"
  )
  private def testLogSetFatalHandler() = ???

  def testLogTypeName(
      log_type: TestLogType /* Some(GTestLogType) */
  )(using Zone): String /* Some(CString) */ = fromCString(
    g_test_log_type_name(log_type.raw).asInstanceOf
  )

  /** Report the result of a performance or measurement test. The test should
    * generally strive to maximize the reported quantities (larger values are
    * better than smaller ones), this and @maximized_quantity can determine
    * sorting order for test result reports.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[test_maximized_result:/<function parameters>]: Vararg parameters require inlining which doesn't work with overriding"
  )
  private def testMaximizedResult() = ???

  /** Add a message to the test report.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[test_message:/<function parameters>]: Vararg parameters require inlining which doesn't work with overriding"
  )
  private def testMessage() = ???

  /** Report the result of a performance or measurement test. The test should
    * generally strive to minimize the reported quantities (smaller values are
    * better than larger ones), this and @minimized_quantity can determine
    * sorting order for test result reports.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[test_minimized_result:/<function parameters>]: Vararg parameters require inlining which doesn't work with overriding"
  )
  private def testMinimizedResult() = ???

  /** This function enqueus a callback @destroy_func to be executed during the
    * next test case teardown phase. This is most useful to auto destruct
    * allocated test resources at the end of a test run. Resources are released
    * in reverse queue order, that means enqueueing callback A before callback B
    * will cause B() to be called before A() during teardown.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[test_queue_destroy:/<function parameters>/destroy_func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(DestroyNotify), @type -> DataRecord(GDestroyNotify)))"
  )
  private def testQueueDestroy() = ???

  /** Enqueue a pointer to be released with g_free() during the next teardown
    * phase. This is equivalent to calling g_test_queue_destroy() with a destroy
    * callback of g_free().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def testQueueFree(
      gfree_pointer: Option[Ptr[Byte] /* Some(gpointer) */ ]
  ): Unit /* Some(Unit) */ = g_test_queue_free(
    gfree_pointer
      .map[gpointer](o => gpointer(o))
      .getOrElse(null.asInstanceOf[gpointer])
  )

  /** Get a reproducible random floating point number, see g_test_rand_int() for
    * details on test case random numbers.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def testRandDouble(): Double /* Some(Double) */ = g_test_rand_double()

  /** Get a reproducible random floating pointer number out of a specified
    * range, see g_test_rand_int() for details on test case random numbers.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def testRandDoubleRange(
      range_start: Double /* Some(Double) */,
      range_end: Double /* Some(Double) */
  ): Double /* Some(Double) */ =
    g_test_rand_double_range(range_start, range_end)

  /** Get a reproducible random integer number.
    *
    * The random numbers generated by the g_test_rand_*() family of functions
    * change with every new test program start, unless the --seed option is
    * given when starting test programs.
    *
    * For individual test cases however, the random number generator is
    * reseeded, to avoid dependencies between tests and to make --seed effective
    * for all test cases.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def testRandInt(): CInt /* Some(gint32) */ = g_test_rand_int().value

  /** Get a reproducible random integer number out of a specified range, see
    * g_test_rand_int() for details on test case random numbers.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def testRandIntRange(
      begin: CInt /* Some(gint32) */,
      end: CInt /* Some(gint32) */
  ): CInt /* Some(gint32) */ =
    g_test_rand_int_range(gint32(begin), gint32(end)).value

  /** Runs all tests under the toplevel suite which can be retrieved with
    * g_test_get_root(). Similar to g_test_run_suite(), the test cases to be run
    * are filtered according to test path arguments (`-p testpath` and
    * `-s testpath`) as parsed by g_test_init(). g_test_run_suite() or
    * g_test_run() may only be called once in a program.
    *
    * In general, the tests and sub-suites within each suite are run in the
    * order in which they are defined. However, note that prior to GLib 2.36,
    * there was a bug in the `g_test_add_*` functions which caused them to
    * create multiple suites with the same name, meaning that if you created
    * tests "/foo/simple", "/bar/simple", and "/foo/using-bar" in that order,
    * they would get run in that order (since g_test_run() would run the first
    * "/foo" suite, then the "/bar" suite, then the second "/foo" suite). As of
    * 2.36, this bug is fixed, and adding the tests in that order would result
    * in a running order of "/foo/simple", "/foo/using-bar", "/bar/simple". If
    * this new ordering is sub-optimal (because it puts more-complicated tests
    * before simpler ones, making it harder to figure out exactly what has
    * failed), you can fix it by changing the test paths to group tests by suite
    * in a way that will result in the desired running order. Eg, "/simple/foo",
    * "/simple/bar", "/complex/foo-using-bar".
    *
    * However, you should never make the actual result of a test depend on the
    * order that tests are run in. If you need to ensure that some particular
    * code runs before or after a given test case, use g_test_add(), which lets
    * you specify setup and teardown functions.
    *
    * If all tests are skipped or marked as incomplete (expected failures), this
    * function will return 0 if producing TAP output, or 77 (treated as "skip
    * test" by Automake) otherwise.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def testRun(): Int /* Some(CInt) */ = g_test_run()

  /** Execute the tests within @suite and all nested #GTestSuites. The test
    * suites to be executed are filtered according to test path arguments (`-p
    * testpath` and `-s testpath`) as parsed by g_test_init(). See the
    * g_test_run() documentation for more information on the order that tests
    * are run in.
    *
    * g_test_run_suite() or g_test_run() may only be called once in a program.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[test_run_suite:/<function parameters>/suite]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TestSuite), @type -> DataRecord(GTestSuite*)))"
  )
  private def testRunSuite() = ???

  /** Changes the behaviour of the various `g_assert_*()` macros,
    * g_test_assert_expected_messages() and the various `g_test_trap_assert_*()`
    * macros to not abort to program, but instead call g_test_fail() and
    * continue. (This also changes the behavior of g_test_fail() so that it will
    * not cause the test program to abort after completing the failed test.)
    *
    * Note that the g_assert_not_reached() and g_assert() macros are not
    * affected by this.
    *
    * This function can only be called after g_test_init().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def testSetNonfatalAssertions(): Unit /* Some(Unit) */ =
    g_test_set_nonfatal_assertions()

  /** Indicates that a test was skipped.
    *
    * Calling this function will not stop the test from running, you need to
    * return from the test function yourself. So you can produce additional
    * diagnostic messages or even continue running the test.
    *
    * If not called from inside a test, this function does nothing.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def testSkip(
      msg: Option[String /* Some(Ptr[gchar]) */ ]
  )(using Zone): Unit /* Some(Unit) */ = g_test_skip(
    msg
      .map[Ptr[gchar]](o => toCString(o).asInstanceOf[Ptr[gchar]])
      .getOrElse(null.asInstanceOf[Ptr[gchar]])
  )

  /** Equivalent to g_test_skip(), but the explanation is formatted as if by
    * g_strdup_printf().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[test_skip_printf:/<function parameters>]: Vararg parameters require inlining which doesn't work with overriding"
  )
  private def testSkipPrintf() = ???

  /** Returns %TRUE (after g_test_init() has been called) if the test program is
    * running under g_test_trap_subprocess().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def testSubprocess(): Boolean /* Some(gboolean) */ =
    g_test_subprocess().value.!=(0)

  /**  Set the summary for a test, which describes what the test checks, and how it
    *  goes about checking it. This may be included in test report output, and is
    *  useful documentation for anyone reading the source code or modifying a test
    *  in future. It must be a single line.
    *
    *  This should be called at the top of a test function.
    *
    *  For example:
    *  |[<!-- language="C" -->
    *  static void
    *  test_array_sort (void)
    *  {
    *    g_test_summary ("Test my_array_sort() sorts the array correctly and stably, "
    *                    "including testing zero length and one-element arrays.");
    *
    *    …
    *  }
    *  ]|
    *
    *  NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT BE APPLICABLE TO SCALA
    */
  def testSummary(summary: String /* Some(CString) */ )(using
      Zone
  ): Unit /* Some(Unit) */ = g_test_summary(toCString(summary))

  /** Get the number of seconds since the last start of the timer with
    * g_test_timer_start().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def testTimerElapsed(): Double /* Some(Double) */ = g_test_timer_elapsed()

  /** Report the last result of g_test_timer_elapsed().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def testTimerLast(): Double /* Some(Double) */ = g_test_timer_last()

  /** Start a timing test. Call g_test_timer_elapsed() when the task is supposed
    * to be done. Call this function again to restart the timer.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def testTimerStart(): Unit /* Some(Unit) */ = g_test_timer_start()

  def testTrapAssertions(
      domain: String /* Some(CString) */,
      file: String /* Some(CString) */,
      line: Int /* Some(CInt) */,
      func: String /* Some(CString) */,
      assertion_flags: CUnsignedLongInt /* Some(guint64) */,
      pattern: String /* Some(CString) */
  )(using Zone): Unit /* Some(Unit) */ = g_test_trap_assertions(
    toCString(domain),
    toCString(file),
    line,
    toCString(func),
    guint64(assertion_flags),
    toCString(pattern)
  )

  /**  Fork the current test program to execute a test case that might
    *  not return or that might abort.
    *
    *  If @usec_timeout is non-0, the forked test case is aborted and
    *  considered failing if its run time exceeds it.
    *
    *  The forking behavior can be configured with the #GTestTrapFlags flags.
    *
    *  In the following example, the test code forks, the forked child
    *  process produces some sample output and exits successfully.
    *  The forking parent process then asserts successful child program
    *  termination and validates child program outputs.
    *
    *  |[<!-- language="C" -->
    *    static void
    *    test_fork_patterns (void)
    *    {
    *      if (g_test_trap_fork (0, G_TEST_TRAP_SILENCE_STDOUT | G_TEST_TRAP_SILENCE_STDERR))
    *        {
    *          g_print ("some stdout text: somagic17\n");
    *          g_printerr ("some stderr text: semagic43\n");
    *          exit (0); // successful test run
    *        }
    *      g_test_trap_assert_passed ();
    *      g_test_trap_assert_stdout ("*somagic17*");
    *      g_test_trap_assert_stderr ("*semagic43*");
    *    }
    *  ]|
    *
    *  NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT BE APPLICABLE TO SCALA
    */
  def testTrapFork(
      usec_timeout: CUnsignedLongInt /* Some(guint64) */,
      test_trap_flags: TestTrapFlags /* Some(GTestTrapFlags) */
  ): Boolean /* Some(gboolean) */ =
    g_test_trap_fork(guint64(usec_timeout), test_trap_flags.raw).value.!=(0)

  /** Check the result of the last g_test_trap_subprocess() call.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def testTrapHasPassed(): Boolean /* Some(gboolean) */ =
    g_test_trap_has_passed().value.!=(0)

  /** Check the result of the last g_test_trap_subprocess() call.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def testTrapReachedTimeout(): Boolean /* Some(gboolean) */ =
    g_test_trap_reached_timeout().value.!=(0)

  /**  Respawns the test program to run only @test_path in a subprocess.
    *  This can be used for a test case that might not return, or that
    *  might abort.
    *
    *  If @test_path is %NULL then the same test is re-run in a subprocess.
    *  You can use g_test_subprocess() to determine whether the test is in
    *  a subprocess or not.
    *
    *  @test_path can also be the name of the parent test, followed by
    *  "`/subprocess/`" and then a name for the specific subtest (or just
    *  ending with "`/subprocess`" if the test only has one child test);
    *  tests with names of this form will automatically be skipped in the
    *  parent process.
    *
    *  If @usec_timeout is non-0, the test subprocess is aborted and
    *  considered failing if its run time exceeds it.
    *
    *  The subprocess behavior can be configured with the
    *  #GTestSubprocessFlags flags.
    *
    *  You can use methods such as g_test_trap_assert_passed(),
    *  g_test_trap_assert_failed(), and g_test_trap_assert_stderr() to
    *  check the results of the subprocess. (But note that
    *  g_test_trap_assert_stdout() and g_test_trap_assert_stderr()
    *  cannot be used if @test_flags specifies that the child should
    *  inherit the parent stdout/stderr.)
    *
    *  If your `main ()` needs to behave differently in
    *  the subprocess, you can call g_test_subprocess() (after calling
    *  g_test_init()) to see whether you are in a subprocess.
    *
    *  Internally, this function tracks the child process using
    *  g_child_watch_source_new(), so your process must not ignore `SIGCHLD`, and
    *  must not attempt to watch or wait for the child process via another
    *  mechanism.
    *
    *  The following example tests that calling
    *  `my_object_new(1000000)` will abort with an error
    *  message.
    *
    *  |[<!-- language="C" -->
    *    static void
    *    test_create_large_object (void)
    *    {
    *      if (g_test_subprocess ())
    *        {
    *          my_object_new (1000000);
    *          return;
    *        }
    *
    *      // Reruns this same test in a subprocess
    *      g_test_trap_subprocess (NULL, 0, G_TEST_SUBPROCESS_DEFAULT);
    *      g_test_trap_assert_failed ();
    *      g_test_trap_assert_stderr ("*ERROR*too large*");
    *    }
    *
    *    int
    *    main (int argc, char **argv)
    *    {
    *      g_test_init (&argc, &argv, NULL);
    *
    *      g_test_add_func ("/myobject/create_large_object",
    *                       test_create_large_object);
    *      return g_test_run ();
    *    }
    *  ]|
    *
    *  NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT BE APPLICABLE TO SCALA
    */
  def testTrapSubprocess(
      test_path: Option[String /* Some(CString) */ ],
      usec_timeout: CUnsignedLongInt /* Some(guint64) */,
      test_flags: TestSubprocessFlags /* Some(GTestSubprocessFlags) */
  )(using Zone): Unit /* Some(Unit) */ = g_test_trap_subprocess(
    test_path
      .map[CString](o => toCString(o))
      .getOrElse(null.asInstanceOf[CString]),
    guint64(usec_timeout),
    test_flags.raw
  )

  @annotation.compileTimeOnly(
    "[thread_error_quark:/<return type>]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Quark), @type -> DataRecord(GQuark)))"
  )
  private def threadErrorQuark() = ???

  /** Terminates the current thread.
    *
    * If another thread is waiting for us using g_thread_join() then the waiting
    * thread will be woken up and get @retval as the return value of
    * g_thread_join().
    *
    * Calling g_thread_exit() with a parameter @retval is equivalent to
    * returning @retval from the function @func, as given to g_thread_new().
    *
    * You must only call g_thread_exit() from a thread that you created yourself
    * with g_thread_new() or related APIs. You must not call this function from
    * a thread created with another threading library or or from within a
    * #GThreadPool.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def threadExit(
      retval: Option[Ptr[Byte] /* Some(gpointer) */ ]
  ): Unit /* Some(Unit) */ = g_thread_exit(
    retval
      .map[gpointer](o => gpointer(o))
      .getOrElse(null.asInstanceOf[gpointer])
  )

  /** This function will return the maximum @interval that a thread will wait in
    * the thread pool for new tasks before being stopped.
    *
    * If this function returns 0, threads waiting in the thread pool for new
    * work are not stopped.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def threadPoolGetMaxIdleTime(): UInt /* Some(guint) */ =
    g_thread_pool_get_max_idle_time().value

  /** Returns the maximal allowed number of unused threads.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def threadPoolGetMaxUnusedThreads(): Int /* Some(gint) */ =
    g_thread_pool_get_max_unused_threads().value

  /** Returns the number of currently unused threads.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def threadPoolGetNumUnusedThreads(): UInt /* Some(guint) */ =
    g_thread_pool_get_num_unused_threads().value

  /** This function will set the maximum @interval that a thread waiting in the
    * pool for new tasks can be idle for before being stopped. This function is
    * similar to calling g_thread_pool_stop_unused_threads() on a regular
    * timeout, except this is done on a per thread basis.
    *
    * By setting @interval to 0, idle threads will not be stopped.
    *
    * The default value is 15000 (15 seconds).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def threadPoolSetMaxIdleTime(
      interval: UInt /* Some(guint) */
  ): Unit /* Some(Unit) */ = g_thread_pool_set_max_idle_time(guint(interval))

  /** Sets the maximal number of unused threads to @max_threads. If @max_threads
    * is -1, no limit is imposed on the number of unused threads.
    *
    * The default value is 2.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def threadPoolSetMaxUnusedThreads(
      max_threads: Int /* Some(gint) */
  ): Unit /* Some(Unit) */ = g_thread_pool_set_max_unused_threads(
    gint(max_threads)
  )

  /** Stops all currently unused threads. This does not change the maximal
    * number of unused threads. This function can be used to regularly stop all
    * unused threads e.g. from g_timeout_add().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def threadPoolStopUnusedThreads(): Unit /* Some(Unit) */ =
    g_thread_pool_stop_unused_threads()

  /** This function returns the #GThread corresponding to the current thread.
    * Note that this function does not increase the reference count of the
    * returned struct.
    *
    * This function will return a #GThread even for threads that were not
    * created by GLib (i.e. those created by other threading APIs). This may be
    * useful for thread identification purposes (i.e. comparisons) but you must
    * not use GLib functions (such as g_thread_join()) on these threads.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[thread_self:/<return type>]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Thread), @type -> DataRecord(GThread*)))"
  )
  private def threadSelf() = ???

  /** Causes the calling thread to voluntarily relinquish the CPU, so that other
    * threads can run.
    *
    * This function is often used as a method to make busy wait less evil.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def threadYield(): Unit /* Some(Unit) */ = g_thread_yield()

  /**  Converts a string containing an ISO 8601 encoded date and time
    *  to a #GTimeVal and puts it into @time_.
    *
    *  @iso_date must include year, month, day, hours, minutes, and
    *  seconds. It can optionally include fractions of a second and a time
    *  zone indicator. (In the absence of any time zone indication, the
    *  timestamp is assumed to be in local time.)
    *
    *  Any leading or trailing space in @iso_date is ignored.
    *
    *  This function was deprecated, along with #GTimeVal itself, in GLib 2.62.
    *  Equivalent functionality is available using code like:
    *  |[
    *  GDateTime *dt = g_date_time_new_from_iso8601 (iso8601_string, NULL);
    *  gint64 time_val = g_date_time_to_unix (dt);
    *  g_date_time_unref (dt);
    *  ]|
    *
    *  NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[time_val_from_iso8601:]: Function time_val_from_iso8601 contains an OUT parameter, which is not supported yet"
  )
  private def timeValFromIso8601() = ???

  /** Sets a function to be called at regular intervals, with the default
    * priority, %G_PRIORITY_DEFAULT.
    *
    * The given @function is called repeatedly until it returns %G_SOURCE_REMOVE
    * or %FALSE, at which point the timeout is automatically destroyed and the
    * function will not be called again. The first call to the function will be
    * at the end of the first @interval.
    *
    * Note that timeout functions may be delayed, due to the processing of other
    * event sources. Thus they should not be relied on for precise timing. After
    * each call to the timeout function, the time of the next timeout is
    * recalculated based on the current time and the given interval (it does not
    * try to 'catch up' time lost in delays).
    *
    * See [memory management of sources][mainloop-memory-management] for details
    * on how to handle the return value and memory management of @data.
    *
    * If you want to have a timer in the "seconds" range and do not care about
    * the exact time of the first call of the timer, use the
    * g_timeout_add_seconds() function; this function allows for more
    * optimizations and more efficient system power usage.
    *
    * This internally creates a main loop source using g_timeout_source_new()
    * and attaches it to the global #GMainContext using g_source_attach(), so
    * the callback will be invoked in whichever thread is running that main
    * context. You can do these steps manually if you need greater control or to
    * use a custom main context.
    *
    * It is safe to call this function from any thread.
    *
    * The interval given is in terms of monotonic time, not wall clock time. See
    * g_get_monotonic_time().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[timeout_add:/<function parameters>/function]: Cannot render type Type(List(),ListMap(@name -> DataRecord(SourceFunc), @type -> DataRecord(GSourceFunc)))"
  )
  private def timeoutAdd() = ???

  /** Sets a function to be called at regular intervals, with the given
    * priority. The function is called repeatedly until it returns %FALSE, at
    * which point the timeout is automatically destroyed and the function will
    * not be called again. The @notify function is called when the timeout is
    * destroyed. The first call to the function will be at the end of the first @interval.
    *
    * Note that timeout functions may be delayed, due to the processing of other
    * event sources. Thus they should not be relied on for precise timing. After
    * each call to the timeout function, the time of the next timeout is
    * recalculated based on the current time and the given interval (it does not
    * try to 'catch up' time lost in delays).
    *
    * See [memory management of sources][mainloop-memory-management] for details
    * on how to handle the return value and memory management of @data.
    *
    * This internally creates a main loop source using g_timeout_source_new()
    * and attaches it to the global #GMainContext using g_source_attach(), so
    * the callback will be invoked in whichever thread is running that main
    * context. You can do these steps manually if you need greater control or to
    * use a custom main context.
    *
    * The interval given is in terms of monotonic time, not wall clock time. See
    * g_get_monotonic_time().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[timeout_add_full:/<function parameters>/function]: Cannot render type Type(List(),ListMap(@name -> DataRecord(SourceFunc), @type -> DataRecord(GSourceFunc)))"
  )
  private def timeoutAddFull() = ???

  /** Sets a function to be called after @interval milliseconds have elapsed,
    * with the default priority, %G_PRIORITY_DEFAULT.
    *
    * The given @function is called once and then the source will be
    * automatically removed from the main context.
    *
    * This function otherwise behaves like g_timeout_add().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[timeout_add_once:/<function parameters>/function]: Cannot render type Type(List(),ListMap(@name -> DataRecord(SourceOnceFunc), @type -> DataRecord(GSourceOnceFunc)))"
  )
  private def timeoutAddOnce() = ???

  /** Sets a function to be called at regular intervals with the default
    * priority, %G_PRIORITY_DEFAULT.
    *
    * The function is called repeatedly until it returns %G_SOURCE_REMOVE or
    * %FALSE, at which point the timeout is automatically destroyed and the
    * function will not be called again.
    *
    * This internally creates a main loop source using
    * g_timeout_source_new_seconds() and attaches it to the main loop context
    * using g_source_attach(). You can do these steps manually if you need
    * greater control. Also see g_timeout_add_seconds_full().
    *
    * It is safe to call this function from any thread.
    *
    * Note that the first call of the timer may not be precise for timeouts of
    * one second. If you need finer precision and have such a timeout, you may
    * want to use g_timeout_add() instead.
    *
    * See [memory management of sources][mainloop-memory-management] for details
    * on how to handle the return value and memory management of @data.
    *
    * The interval given is in terms of monotonic time, not wall clock time. See
    * g_get_monotonic_time().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[timeout_add_seconds:/<function parameters>/function]: Cannot render type Type(List(),ListMap(@name -> DataRecord(SourceFunc), @type -> DataRecord(GSourceFunc)))"
  )
  private def timeoutAddSeconds() = ???

  /** Sets a function to be called at regular intervals, with @priority.
    *
    * The function is called repeatedly until it returns %G_SOURCE_REMOVE or
    * %FALSE, at which point the timeout is automatically destroyed and the
    * function will not be called again.
    *
    * Unlike g_timeout_add(), this function operates at whole second
    * granularity. The initial starting point of the timer is determined by the
    * implementation and the implementation is expected to group multiple timers
    * together so that they fire all at the same time. To allow this grouping,
    * the @interval to the first timer is rounded and can deviate up to one
    * second from the specified interval. Subsequent timer iterations will
    * generally run at the specified interval.
    *
    * Note that timeout functions may be delayed, due to the processing of other
    * event sources. Thus they should not be relied on for precise timing. After
    * each call to the timeout function, the time of the next timeout is
    * recalculated based on the current time and the given @interval
    *
    * See [memory management of sources][mainloop-memory-management] for details
    * on how to handle the return value and memory management of @data.
    *
    * If you want timing more precise than whole seconds, use g_timeout_add()
    * instead.
    *
    * The grouping of timers to fire at the same time results in a more power
    * and CPU efficient behavior so if your timer is in multiples of seconds and
    * you don't require the first timer exactly one second from now, the use of
    * g_timeout_add_seconds() is preferred over g_timeout_add().
    *
    * This internally creates a main loop source using
    * g_timeout_source_new_seconds() and attaches it to the main loop context
    * using g_source_attach(). You can do these steps manually if you need
    * greater control.
    *
    * It is safe to call this function from any thread.
    *
    * The interval given is in terms of monotonic time, not wall clock time. See
    * g_get_monotonic_time().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[timeout_add_seconds_full:/<function parameters>/function]: Cannot render type Type(List(),ListMap(@name -> DataRecord(SourceFunc), @type -> DataRecord(GSourceFunc)))"
  )
  private def timeoutAddSecondsFull() = ???

  /** This function behaves like g_timeout_add_once() but with a range in
    * seconds.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[timeout_add_seconds_once:/<function parameters>/function]: Cannot render type Type(List(),ListMap(@name -> DataRecord(SourceOnceFunc), @type -> DataRecord(GSourceOnceFunc)))"
  )
  private def timeoutAddSecondsOnce() = ???

  /** Creates a new timeout source.
    *
    * The source will not initially be associated with any #GMainContext and
    * must be added to one with g_source_attach() before it will be executed.
    *
    * The interval given is in terms of monotonic time, not wall clock time. See
    * g_get_monotonic_time().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[timeout_source_new:/<return type>]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Source), @type -> DataRecord(GSource*)))"
  )
  private def timeoutSourceNew() = ???

  /** Creates a new timeout source.
    *
    * The source will not initially be associated with any #GMainContext and
    * must be added to one with g_source_attach() before it will be executed.
    *
    * The scheduling granularity/accuracy of this timeout source will be in
    * seconds.
    *
    * The interval given is in terms of monotonic time, not wall clock time. See
    * g_get_monotonic_time().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[timeout_source_new_seconds:/<return type>]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Source), @type -> DataRecord(GSource*)))"
  )
  private def timeoutSourceNewSeconds() = ???

  /** Returns the height of a #GTrashStack.
    *
    * Note that execution of this function is of O(N) complexity where N denotes
    * the number of items on the stack.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[trash_stack_height:/<function parameters>/stack_p]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TrashStack), @type -> DataRecord(GTrashStack**)))"
  )
  private def trashStackHeight() = ???

  /** Returns the element at the top of a #GTrashStack which may be %NULL.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[trash_stack_peek:/<function parameters>/stack_p]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TrashStack), @type -> DataRecord(GTrashStack**)))"
  )
  private def trashStackPeek() = ???

  /** Pops a piece of memory off a #GTrashStack.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[trash_stack_pop:/<function parameters>/stack_p]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TrashStack), @type -> DataRecord(GTrashStack**)))"
  )
  private def trashStackPop() = ???

  /** Pushes a piece of memory onto a #GTrashStack.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[trash_stack_push:/<function parameters>/stack_p]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TrashStack), @type -> DataRecord(GTrashStack**)))"
  )
  private def trashStackPush() = ???

  /** Attempts to allocate @n_bytes, and returns %NULL on failure. Contrast with
    * g_malloc(), which aborts the program on failure.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def tryMalloc(
      n_bytes: CUnsignedLongInt /* Some(gsize) */
  ): Ptr[Byte] /* Some(gpointer) */ = g_try_malloc(gsize(n_bytes)).value

  /** Attempts to allocate @n_bytes, initialized to 0's, and returns %NULL on
    * failure. Contrast with g_malloc0(), which aborts the program on failure.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def tryMalloc0(
      n_bytes: CUnsignedLongInt /* Some(gsize) */
  ): Ptr[Byte] /* Some(gpointer) */ = g_try_malloc0(gsize(n_bytes)).value

  /** This function is similar to g_try_malloc0(), allocating (@n_blocks * @n_block_bytes)
    * bytes, but care is taken to detect possible overflow during
    * multiplication.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def tryMalloc0N(
      n_blocks: CUnsignedLongInt /* Some(gsize) */,
      n_block_bytes: CUnsignedLongInt /* Some(gsize) */
  ): Ptr[Byte] /* Some(gpointer) */ =
    g_try_malloc0_n(gsize(n_blocks), gsize(n_block_bytes)).value

  /** This function is similar to g_try_malloc(), allocating (@n_blocks * @n_block_bytes)
    * bytes, but care is taken to detect possible overflow during
    * multiplication.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def tryMallocN(
      n_blocks: CUnsignedLongInt /* Some(gsize) */,
      n_block_bytes: CUnsignedLongInt /* Some(gsize) */
  ): Ptr[Byte] /* Some(gpointer) */ =
    g_try_malloc_n(gsize(n_blocks), gsize(n_block_bytes)).value

  /** Attempts to realloc @mem to a new size, @n_bytes, and returns %NULL on
    * failure. Contrast with g_realloc(), which aborts the program on failure.
    *
    * If @mem is %NULL, behaves the same as g_try_malloc().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def tryRealloc(
      mem: Option[Ptr[Byte] /* Some(gpointer) */ ],
      n_bytes: CUnsignedLongInt /* Some(gsize) */
  ): Ptr[Byte] /* Some(gpointer) */ = g_try_realloc(
    mem.map[gpointer](o => gpointer(o)).getOrElse(null.asInstanceOf[gpointer]),
    gsize(n_bytes)
  ).value

  /** This function is similar to g_try_realloc(), allocating (@n_blocks * @n_block_bytes)
    * bytes, but care is taken to detect possible overflow during
    * multiplication.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def tryReallocN(
      mem: Option[Ptr[Byte] /* Some(gpointer) */ ],
      n_blocks: CUnsignedLongInt /* Some(gsize) */,
      n_block_bytes: CUnsignedLongInt /* Some(gsize) */
  ): Ptr[Byte] /* Some(gpointer) */ = g_try_realloc_n(
    mem.map[gpointer](o => gpointer(o)).getOrElse(null.asInstanceOf[gpointer]),
    gsize(n_blocks),
    gsize(n_block_bytes)
  ).value

  /** Convert a string from UCS-4 to UTF-16. A 0 character will be added to the
    * result after the converted text.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ucs4_to_utf16:]: Function ucs4_to_utf16 contains an OUT parameter, which is not supported yet"
  )
  private def ucs4ToUtf16() = ???

  /** Convert a string from a 32-bit fixed width representation as UCS-4. to
    * UTF-8. The result will be terminated with a 0 byte.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[ucs4_to_utf8:]: Function ucs4_to_utf8 contains an OUT parameter, which is not supported yet"
  )
  private def ucs4ToUtf8() = ???

  /** Determines the break type of @c. @c should be a Unicode character (to
    * derive a character from UTF-8 encoded text, use g_utf8_get_char()). The
    * break type is used to find word and line breaks ("text boundaries"), Pango
    * implements the Unicode boundary resolution algorithms and normally you
    * would use a function such as pango_break() instead of caring about break
    * types yourself.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unicharBreakType(
      c: CUnsignedInt /* Some(gunichar) */
  ): UnicodeBreakType /* Some(GUnicodeBreakType) */ =
    UnicodeBreakType.fromRaw(g_unichar_break_type(gunichar(guint32(c))))

  /** Determines the canonical combining class of a Unicode character.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unicharCombiningClass(
      uc: CUnsignedInt /* Some(gunichar) */
  ): Int /* Some(gint) */ = g_unichar_combining_class(
    gunichar(guint32(uc))
  ).value

  /** Performs a single composition step of the Unicode canonical composition
    * algorithm.
    *
    * This function includes algorithmic Hangul Jamo composition, but it is not
    * exactly the inverse of g_unichar_decompose(). No composition can have
    * either of @a or @b equal to zero. To be precise, this function composes if
    * and only if there exists a Primary Composite P which is canonically
    * equivalent to the sequence <@a,@b>. See the Unicode Standard for the
    * definition of Primary Composite.
    *
    * If @a and @b do not compose a new character, @ch is set to zero.
    *
    * See [UAX#15](http://unicode.org/reports/tr15/) for details.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[unichar_compose:]: Function unichar_compose contains an OUT parameter, which is not supported yet"
  )
  private def unicharCompose() = ???

  /** Performs a single decomposition step of the Unicode canonical
    * decomposition algorithm.
    *
    * This function does not include compatibility decompositions. It does,
    * however, include algorithmic Hangul Jamo decomposition, as well as
    * 'singleton' decompositions which replace a character by a single other
    * character. In the case of singletons *@b will be set to zero.
    *
    * If @ch is not decomposable, *@a is set to @ch and *@b is set to zero.
    *
    * Note that the way Unicode decomposition pairs are defined, it is
    * guaranteed that @b would not decompose further, but @a may itself
    * decompose. To get the full canonical decomposition for @ch, one would need
    * to recursively call this function on @a. Or use
    * g_unichar_fully_decompose().
    *
    * See [UAX#15](http://unicode.org/reports/tr15/) for details.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[unichar_decompose:]: Function unichar_decompose contains an OUT parameter, which is not supported yet"
  )
  private def unicharDecompose() = ???

  /** Determines the numeric value of a character as a decimal digit.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unicharDigitValue(
      c: CUnsignedInt /* Some(gunichar) */
  ): Int /* Some(gint) */ = g_unichar_digit_value(gunichar(guint32(c))).value

  /** Computes the canonical or compatibility decomposition of a Unicode
    * character. For compatibility decomposition, pass %TRUE for @compat; for
    * canonical decomposition pass %FALSE for @compat.
    *
    * The decomposed sequence is placed in @result. Only up to
    * @result_len
    *   characters are written into @result. The length of the full
    *   decomposition (irrespective of @result_len) is returned by the function.
    *   For canonical decomposition, currently all decompositions are of length
    *   at most 4, but this may change in the future (very unlikely though). At
    *   any rate, Unicode does guarantee that a buffer of length 18 is always
    *   enough for both compatibility and canonical decompositions, so that is
    *   the size recommended. This is provided as
    *   %G_UNICHAR_MAX_DECOMPOSITION_LENGTH.
    *
    * See [UAX#15](http://unicode.org/reports/tr15/) for details.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[unichar_fully_decompose:]: Function unichar_fully_decompose contains an OUT parameter, which is not supported yet"
  )
  private def unicharFullyDecompose() = ???

  /** In Unicode, some characters are "mirrored". This means that their images
    * are mirrored horizontally in text that is laid out from right to left. For
    * instance, "(" would become its mirror image, ")", in right-to-left text.
    *
    * If @ch has the Unicode mirrored property and there is another unicode
    * character that typically has a glyph that is the mirror image of @ch's
    * glyph and @mirrored_ch is set, it puts that character in the address
    * pointed to by @mirrored_ch. Otherwise the original character is put.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[unichar_get_mirror_char:]: Function unichar_get_mirror_char contains an OUT parameter, which is not supported yet"
  )
  private def unicharGetMirrorChar() = ???

  /** Looks up the #GUnicodeScript for a particular character (as defined by
    * Unicode Standard Annex \#24). No check is made for @ch being a valid
    * Unicode character; if you pass in invalid character, the result is
    * undefined.
    *
    * This function is equivalent to pango_script_for_unichar() and the two are
    * interchangeable.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unicharGetScript(
      ch: CUnsignedInt /* Some(gunichar) */
  ): UnicodeScript /* Some(GUnicodeScript) */ =
    UnicodeScript.fromRaw(g_unichar_get_script(gunichar(guint32(ch))))

  /** Determines whether a character is alphanumeric. Given some UTF-8 text,
    * obtain a character value with g_utf8_get_char().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unicharIsalnum(
      c: CUnsignedInt /* Some(gunichar) */
  ): Boolean /* Some(gboolean) */ =
    g_unichar_isalnum(gunichar(guint32(c))).value.!=(0)

  /** Determines whether a character is alphabetic (i.e. a letter). Given some
    * UTF-8 text, obtain a character value with g_utf8_get_char().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unicharIsalpha(
      c: CUnsignedInt /* Some(gunichar) */
  ): Boolean /* Some(gboolean) */ =
    g_unichar_isalpha(gunichar(guint32(c))).value.!=(0)

  /** Determines whether a character is a control character. Given some UTF-8
    * text, obtain a character value with g_utf8_get_char().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unicharIscntrl(
      c: CUnsignedInt /* Some(gunichar) */
  ): Boolean /* Some(gboolean) */ =
    g_unichar_iscntrl(gunichar(guint32(c))).value.!=(0)

  /** Determines if a given character is assigned in the Unicode standard.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unicharIsdefined(
      c: CUnsignedInt /* Some(gunichar) */
  ): Boolean /* Some(gboolean) */ =
    g_unichar_isdefined(gunichar(guint32(c))).value.!=(0)

  /** Determines whether a character is numeric (i.e. a digit). This covers
    * ASCII 0-9 and also digits in other languages/scripts. Given some UTF-8
    * text, obtain a character value with g_utf8_get_char().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unicharIsdigit(
      c: CUnsignedInt /* Some(gunichar) */
  ): Boolean /* Some(gboolean) */ =
    g_unichar_isdigit(gunichar(guint32(c))).value.!=(0)

  /** Determines whether a character is printable and not a space (returns
    * %FALSE for control characters, format characters, and spaces).
    * g_unichar_isprint() is similar, but returns %TRUE for spaces. Given some
    * UTF-8 text, obtain a character value with g_utf8_get_char().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unicharIsgraph(
      c: CUnsignedInt /* Some(gunichar) */
  ): Boolean /* Some(gboolean) */ =
    g_unichar_isgraph(gunichar(guint32(c))).value.!=(0)

  /** Determines whether a character is a lowercase letter. Given some UTF-8
    * text, obtain a character value with g_utf8_get_char().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unicharIslower(
      c: CUnsignedInt /* Some(gunichar) */
  ): Boolean /* Some(gboolean) */ =
    g_unichar_islower(gunichar(guint32(c))).value.!=(0)

  /** Determines whether a character is a mark (non-spacing mark, combining
    * mark, or enclosing mark in Unicode speak). Given some UTF-8 text, obtain a
    * character value with g_utf8_get_char().
    *
    * Note: in most cases where isalpha characters are allowed, ismark
    * characters should be allowed to as they are essential for writing most
    * European languages as well as many non-Latin scripts.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unicharIsmark(
      c: CUnsignedInt /* Some(gunichar) */
  ): Boolean /* Some(gboolean) */ =
    g_unichar_ismark(gunichar(guint32(c))).value.!=(0)

  /** Determines whether a character is printable. Unlike g_unichar_isgraph(),
    * returns %TRUE for spaces. Given some UTF-8 text, obtain a character value
    * with g_utf8_get_char().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unicharIsprint(
      c: CUnsignedInt /* Some(gunichar) */
  ): Boolean /* Some(gboolean) */ =
    g_unichar_isprint(gunichar(guint32(c))).value.!=(0)

  /** Determines whether a character is punctuation or a symbol. Given some
    * UTF-8 text, obtain a character value with g_utf8_get_char().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unicharIspunct(
      c: CUnsignedInt /* Some(gunichar) */
  ): Boolean /* Some(gboolean) */ =
    g_unichar_ispunct(gunichar(guint32(c))).value.!=(0)

  /** Determines whether a character is a space, tab, or line separator
    * (newline, carriage return, etc.). Given some UTF-8 text, obtain a
    * character value with g_utf8_get_char().
    *
    * (Note: don't use this to do word breaking; you have to use Pango or
    * equivalent to get word breaking right, the algorithm is fairly complex.)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unicharIsspace(
      c: CUnsignedInt /* Some(gunichar) */
  ): Boolean /* Some(gboolean) */ =
    g_unichar_isspace(gunichar(guint32(c))).value.!=(0)

  /** Determines if a character is titlecase. Some characters in Unicode which
    * are composites, such as the DZ digraph have three case variants instead of
    * just two. The titlecase form is used at the beginning of a word where only
    * the first letter is capitalized. The titlecase form of the DZ digraph is
    * U+01F2 LATIN CAPITAL LETTTER D WITH SMALL LETTER Z.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unicharIstitle(
      c: CUnsignedInt /* Some(gunichar) */
  ): Boolean /* Some(gboolean) */ =
    g_unichar_istitle(gunichar(guint32(c))).value.!=(0)

  /** Determines if a character is uppercase.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unicharIsupper(
      c: CUnsignedInt /* Some(gunichar) */
  ): Boolean /* Some(gboolean) */ =
    g_unichar_isupper(gunichar(guint32(c))).value.!=(0)

  /** Determines if a character is typically rendered in a double-width cell.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unicharIswide(
      c: CUnsignedInt /* Some(gunichar) */
  ): Boolean /* Some(gboolean) */ =
    g_unichar_iswide(gunichar(guint32(c))).value.!=(0)

  /** Determines if a character is typically rendered in a double-width cell
    * under legacy East Asian locales. If a character is wide according to
    * g_unichar_iswide(), then it is also reported wide with this function, but
    * the converse is not necessarily true. See the [Unicode Standard Annex
    * #11](http://www.unicode.org/reports/tr11/) for details.
    *
    * If a character passes the g_unichar_iswide() test then it will also pass
    * this test, but not the other way around. Note that some characters may
    * pass both this test and g_unichar_iszerowidth().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unicharIswideCjk(
      c: CUnsignedInt /* Some(gunichar) */
  ): Boolean /* Some(gboolean) */ =
    g_unichar_iswide_cjk(gunichar(guint32(c))).value.!=(0)

  /** Determines if a character is a hexadecimal digit.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unicharIsxdigit(
      c: CUnsignedInt /* Some(gunichar) */
  ): Boolean /* Some(gboolean) */ =
    g_unichar_isxdigit(gunichar(guint32(c))).value.!=(0)

  /** Determines if a given character typically takes zero width when rendered.
    * The return value is %TRUE for all non-spacing and enclosing marks (e.g.,
    * combining accents), format characters, zero-width space, but not U+00AD
    * SOFT HYPHEN.
    *
    * A typical use of this function is with one of g_unichar_iswide() or
    * g_unichar_iswide_cjk() to determine the number of cells a string occupies
    * when displayed on a grid display (terminals). However, note that not all
    * terminals support zero-width rendering of zero-width marks.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unicharIszerowidth(
      c: CUnsignedInt /* Some(gunichar) */
  ): Boolean /* Some(gboolean) */ =
    g_unichar_iszerowidth(gunichar(guint32(c))).value.!=(0)

  /** Converts a single character to UTF-8.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[unichar_to_utf8:]: Function unichar_to_utf8 contains an OUT parameter, which is not supported yet"
  )
  private def unicharToUtf8() = ???

  /** Converts a character to lower case.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unicharTolower(
      c: CUnsignedInt /* Some(gunichar) */
  ): CUnsignedInt /* Some(gunichar) */ = g_unichar_tolower(
    gunichar(guint32(c))
  ).value

  /** Converts a character to the titlecase.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unicharTotitle(
      c: CUnsignedInt /* Some(gunichar) */
  ): CUnsignedInt /* Some(gunichar) */ = g_unichar_totitle(
    gunichar(guint32(c))
  ).value

  /** Converts a character to uppercase.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unicharToupper(
      c: CUnsignedInt /* Some(gunichar) */
  ): CUnsignedInt /* Some(gunichar) */ = g_unichar_toupper(
    gunichar(guint32(c))
  ).value

  /** Classifies a Unicode character by type.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unicharType(
      c: CUnsignedInt /* Some(gunichar) */
  ): UnicodeType /* Some(GUnicodeType) */ =
    UnicodeType.fromRaw(g_unichar_type(gunichar(guint32(c))))

  /** Checks whether @ch is a valid Unicode character. Some possible integer
    * values of @ch will not be valid. 0 is considered a valid character, though
    * it's normally a string terminator.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unicharValidate(
      ch: CUnsignedInt /* Some(gunichar) */
  ): Boolean /* Some(gboolean) */ =
    g_unichar_validate(gunichar(guint32(ch))).value.!=(0)

  /** Determines the numeric value of a character as a hexadecimal digit.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unicharXdigitValue(
      c: CUnsignedInt /* Some(gunichar) */
  ): Int /* Some(gint) */ = g_unichar_xdigit_value(gunichar(guint32(c))).value

  /** Computes the canonical decomposition of a Unicode character.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[unicode_canonical_decomposition:/<function parameters>/result_len]: Cannot render type Type(List(),ListMap(@name -> DataRecord(gsize), @type -> DataRecord(gsize*)))"
  )
  private def unicodeCanonicalDecomposition() = ???

  /** Computes the canonical ordering of a string in-place. This rearranges
    * decomposed characters in the string according to their combining classes.
    * See the Unicode manual for more information.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[unicode_canonical_ordering:/<function parameters>/string]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(gunichar)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(1), @type -> DataRecord(gunichar*)))"
  )
  private def unicodeCanonicalOrdering() = ???

  /** Looks up the Unicode script for @iso15924. ISO 15924 assigns four-letter
    * codes to scripts. For example, the code for Arabic is 'Arab'. This
    * function accepts four letter codes encoded as a @guint32 in a big-endian
    * fashion. That is, the code expected for Arabic is 0x41726162 (0x41 is
    * ASCII code for 'A', 0x72 is ASCII code for 'r', etc).
    *
    * See [Codes for the representation of names of
    * scripts](http://unicode.org/iso15924/codelists.html) for details.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unicodeScriptFromIso15924(
      iso15924: UInt /* Some(guint32) */
  ): UnicodeScript /* Some(GUnicodeScript) */ =
    UnicodeScript.fromRaw(g_unicode_script_from_iso15924(guint32(iso15924)))

  /** Looks up the ISO 15924 code for @script. ISO 15924 assigns four-letter
    * codes to scripts. For example, the code for Arabic is 'Arab'. The four
    * letter codes are encoded as a @guint32 by this function in a big-endian
    * fashion. That is, the code returned for Arabic is 0x41726162 (0x41 is
    * ASCII code for 'A', 0x72 is ASCII code for 'r', etc).
    *
    * See [Codes for the representation of names of
    * scripts](http://unicode.org/iso15924/codelists.html) for details.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unicodeScriptToIso15924(
      script: UnicodeScript /* Some(GUnicodeScript) */
  ): UInt /* Some(guint32) */ = g_unicode_script_to_iso15924(script.raw).value

  @annotation.compileTimeOnly(
    "[unix_error_quark:]: Method g_unix_error_quark has no target types"
  )
  private def unixErrorQuark() = ???

  /** Sets a function to be called when the IO condition, as specified by
    * @condition
    *   becomes true for @fd.
    *
    * @function
    *   will be called when the specified IO condition becomes %TRUE. The
    *   function is expected to clear whatever event caused the IO condition to
    *   become true and return %TRUE in order to be notified when it happens
    *   again. If @function returns %FALSE then the watch will be cancelled.
    *
    * The return value of this function can be passed to g_source_remove() to
    * cancel the watch at any time that it exists.
    *
    * The source will never close the fd -- you must do it yourself.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[unix_fd_add:]: Method g_unix_fd_add has no target types"
  )
  private def unixFdAdd() = ???

  /** Sets a function to be called when the IO condition, as specified by
    * @condition
    *   becomes true for @fd.
    *
    * This is the same as g_unix_fd_add(), except that it allows you to specify
    * a non-default priority and a provide a #GDestroyNotify for
    * @user_data.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[unix_fd_add_full:]: Method g_unix_fd_add_full has no target types"
  )
  private def unixFdAddFull() = ???

  /** Creates a #GSource to watch for a particular I/O condition on a file
    * descriptor.
    *
    * The source will never close the @fd — you must do it yourself.
    *
    * Any callback attached to the returned #GSource must have type
    * #GUnixFDSourceFunc.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[unix_fd_source_new:]: Method g_unix_fd_source_new has no target types"
  )
  private def unixFdSourceNew() = ???

  /** Get the `passwd` file entry for the given @user_name using `getpwnam_r()`.
    * This can fail if the given @user_name doesn’t exist.
    *
    * The returned `struct passwd` has been allocated using g_malloc() and
    * should be freed using g_free(). The strings referenced by the returned
    * struct are included in the same allocation, so are valid until the
    * `struct passwd` is freed.
    *
    * This function is safe to call from multiple threads concurrently.
    *
    * You will need to include `pwd.h` to get the definition of `struct passwd`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[unix_get_passwd_entry:]: Method g_unix_get_passwd_entry has no target types"
  )
  private def unixGetPasswdEntry() = ???

  /** Similar to the UNIX pipe() call, but on modern systems like Linux uses the
    * pipe2() system call, which atomically creates a pipe with the configured
    * flags.
    *
    * As of GLib 2.78, the supported flags are `O_CLOEXEC`/`FD_CLOEXEC` (see
    * below) and `O_NONBLOCK`. Prior to GLib 2.78, only `FD_CLOEXEC` was
    * supported — if you wanted to configure `O_NONBLOCK` then that had to be
    * done separately with `fcntl()`.
    *
    * It is a programmer error to call this function with unsupported flags, and
    * a critical warning will be raised.
    *
    * As of GLib 2.78, it is preferred to pass `O_CLOEXEC` in, rather than
    * `FD_CLOEXEC`, as that matches the underlying `pipe()` API more closely.
    * Prior to 2.78, only `FD_CLOEXEC` was supported. Support for `FD_CLOEXEC`
    * may be deprecated and removed in future.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[unix_open_pipe:]: Method g_unix_open_pipe has no target types"
  )
  private def unixOpenPipe() = ???

  /** Control the non-blocking state of the given file descriptor, according to @nonblock.
    * On most systems this uses %O_NONBLOCK, but on some older ones may use
    * %O_NDELAY.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[unix_set_fd_nonblocking:]: Method g_unix_set_fd_nonblocking has no target types"
  )
  private def unixSetFdNonblocking() = ???

  /** A convenience function for g_unix_signal_source_new(), which attaches to
    * the default #GMainContext. You can remove the watch using
    * g_source_remove().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[unix_signal_add:]: Method g_unix_signal_add has no target types"
  )
  private def unixSignalAdd() = ???

  /** A convenience function for g_unix_signal_source_new(), which attaches to
    * the default #GMainContext. You can remove the watch using
    * g_source_remove().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[unix_signal_add_full:]: Method g_unix_signal_add_full has no target types"
  )
  private def unixSignalAddFull() = ???

  /** Create a #GSource that will be dispatched upon delivery of the UNIX signal @signum.
    * In GLib versions before 2.36, only `SIGHUP`, `SIGINT`, `SIGTERM` can be
    * monitored. In GLib 2.36, `SIGUSR1` and `SIGUSR2` were added. In GLib 2.54,
    * `SIGWINCH` was added.
    *
    * Note that unlike the UNIX default, all sources which have created a watch
    * will be dispatched, regardless of which underlying thread invoked
    * g_unix_signal_source_new().
    *
    * For example, an effective use of this function is to handle `SIGTERM`
    * cleanly; flushing any outstanding files, and then calling
    * g_main_loop_quit(). It is not safe to do any of this from a regular UNIX
    * signal handler; such a handler may be invoked while malloc() or another
    * library function is running, causing reentrancy issues if the handler
    * attempts to use those functions. None of the GLib/GObject API is safe
    * against this kind of reentrancy.
    *
    * The interaction of this source when combined with native UNIX functions
    * like sigprocmask() is not defined.
    *
    * The source will not initially be associated with any #GMainContext and
    * must be added to one with g_source_attach() before it will be executed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[unix_signal_source_new:]: Method g_unix_signal_source_new has no target types"
  )
  private def unixSignalSourceNew() = ???

  /** A wrapper for the POSIX unlink() function. The unlink() function deletes a
    * name from the filesystem. If this was the last link to the file and no
    * processes have it opened, the diskspace occupied by the file is freed.
    *
    * See your C library manual for more details about unlink(). Note that on
    * Windows, it is in general not possible to delete files that are open to
    * some process, or mapped into memory.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly("[unlink:]: Method g_unlink has no target types")
  private def unlink() = ???

  /** Removes an environment variable from the environment.
    *
    * Note that on some systems, when variables are overwritten, the memory used
    * for the previous variables and its value isn't reclaimed.
    *
    * You should be mindful of the fact that environment variable handling in
    * UNIX is not thread-safe, and your program may crash if one thread calls
    * g_unsetenv() while another thread is calling getenv(). (And note that many
    * functions, such as gettext(), call getenv() internally.) This function is
    * only safe to use at the very start of your program, before creating any
    * other threads (or creating objects that create worker threads of their
    * own).
    *
    * If you need to set up the environment for a child process, you can use
    * g_get_environ() to get an environment array, modify that with
    * g_environ_setenv() and g_environ_unsetenv(), and then pass that array
    * directly to execvpe(), g_spawn_async(), or the like.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unsetenv(
      variable: String /* Some(Ptr[gchar]) */
  )(using Zone): Unit /* Some(Unit) */ = g_unsetenv(
    toCString(variable).asInstanceOf[Ptr[gchar]]
  )

  /** Creates a new #GUri from the given components according to @flags.
    *
    * See also g_uri_build_with_user(), which allows specifying the components
    * of the "userinfo" separately.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[uri_build:/<return type>]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Uri), @type -> DataRecord(GUri*)))"
  )
  private def uriBuild() = ???

  /** Creates a new #GUri from the given components according to @flags
    * (%G_URI_FLAGS_HAS_PASSWORD is added unconditionally). The @flags must be
    * coherent with the passed values, in particular use `%`-encoded values with
    * %G_URI_FLAGS_ENCODED.
    *
    * In contrast to g_uri_build(), this allows specifying the components of the
    * ‘userinfo’ field separately. Note that @user must be non-%NULL if either @password
    * or @auth_params is non-%NULL.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[uri_build_with_user:/<return type>]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Uri), @type -> DataRecord(GUri*)))"
  )
  private def uriBuildWithUser() = ???

  @annotation.compileTimeOnly(
    "[uri_error_quark:/<return type>]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Quark), @type -> DataRecord(GQuark)))"
  )
  private def uriErrorQuark() = ???

  /** Escapes arbitrary data for use in a URI.
    *
    * Normally all characters that are not ‘unreserved’ (i.e. ASCII
    * alphanumerical characters plus dash, dot, underscore and tilde) are
    * escaped. But if you specify characters in @reserved_chars_allowed they are
    * not escaped. This is useful for the ‘reserved’ characters in the URI
    * specification, since those are allowed unescaped in some portions of a
    * URI.
    *
    * Though technically incorrect, this will also allow escaping nul bytes as
    * `%``00`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[uri_escape_bytes:/<function parameters>/unescaped]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(guint8), @type -> DataRecord(guint8)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(1), @type -> DataRecord(const guint8*)))"
  )
  private def uriEscapeBytes() = ???

  /** Escapes a string for use in a URI.
    *
    * Normally all characters that are not "unreserved" (i.e. ASCII
    * alphanumerical characters plus dash, dot, underscore and tilde) are
    * escaped. But if you specify characters in @reserved_chars_allowed they are
    * not escaped. This is useful for the "reserved" characters in the URI
    * specification, since those are allowed unescaped in some portions of a
    * URI.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def uriEscapeString(
      unescaped: String /* Some(CString) */,
      reserved_chars_allowed: Option[String /* Some(CString) */ ],
      allow_utf8: Boolean /* Some(gboolean) */
  )(using Zone): String /* Some(CString) */ = fromCString(
    g_uri_escape_string(
      toCString(unescaped),
      reserved_chars_allowed
        .map[CString](o => toCString(o))
        .getOrElse(null.asInstanceOf[CString]),
      gboolean(gint((if allow_utf8 == true then 1 else 0)))
    ).asInstanceOf
  )

  /** Parses @uri_string according to @flags, to determine whether it is a valid
    * [absolute URI][relative-absolute-uris], i.e. it does not need to be
    * resolved relative to another URI using g_uri_parse_relative().
    *
    * If it’s not a valid URI, an error is returned explaining how it’s invalid.
    *
    * See g_uri_split(), and the definition of #GUriFlags, for more information
    * on the effect of @flags.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def uriIsValid(
      uri_string: String /* Some(Ptr[gchar]) */,
      flags: UriFlags /* Some(GUriFlags) */
  )(using Zone): GResult[Boolean /* Some(gboolean) */ ] =
    GResult.wrap(__errorPtr =>
      g_uri_is_valid(
        toCString(uri_string).asInstanceOf[Ptr[gchar]],
        flags.raw,
        __errorPtr
      ).value.!=(0)
    )

  /** Joins the given components together according to @flags to create an
    * absolute URI string. @path may not be %NULL (though it may be the empty
    * string).
    *
    * When @host is present, @path must either be empty or begin with a slash
    * (`/`) character. When @host is not present, @path cannot begin with two
    * slash characters (`//`). See [RFC 3986, section
    * 3](https://tools.ietf.org/html/rfc3986#section-3).
    *
    * See also g_uri_join_with_user(), which allows specifying the components of
    * the ‘userinfo’ separately.
    *
    * %G_URI_FLAGS_HAS_PASSWORD and %G_URI_FLAGS_HAS_AUTH_PARAMS are ignored if
    * set in @flags.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def uriJoin(
      flags: UriFlags /* Some(GUriFlags) */,
      scheme: Option[String /* Some(Ptr[gchar]) */ ],
      userinfo: Option[String /* Some(Ptr[gchar]) */ ],
      host: Option[String /* Some(Ptr[gchar]) */ ],
      port: Int /* Some(gint) */,
      path: String /* Some(Ptr[gchar]) */,
      query: Option[String /* Some(Ptr[gchar]) */ ],
      fragment: Option[String /* Some(Ptr[gchar]) */ ]
  )(using Zone): String /* Some(Ptr[gchar]) */ = fromCString(
    g_uri_join(
      flags.raw,
      scheme
        .map[Ptr[gchar]](o => toCString(o).asInstanceOf[Ptr[gchar]])
        .getOrElse(null.asInstanceOf[Ptr[gchar]]),
      userinfo
        .map[Ptr[gchar]](o => toCString(o).asInstanceOf[Ptr[gchar]])
        .getOrElse(null.asInstanceOf[Ptr[gchar]]),
      host
        .map[Ptr[gchar]](o => toCString(o).asInstanceOf[Ptr[gchar]])
        .getOrElse(null.asInstanceOf[Ptr[gchar]]),
      gint(port),
      toCString(path).asInstanceOf[Ptr[gchar]],
      query
        .map[Ptr[gchar]](o => toCString(o).asInstanceOf[Ptr[gchar]])
        .getOrElse(null.asInstanceOf[Ptr[gchar]]),
      fragment
        .map[Ptr[gchar]](o => toCString(o).asInstanceOf[Ptr[gchar]])
        .getOrElse(null.asInstanceOf[Ptr[gchar]])
    ).asInstanceOf
  )

  /** Joins the given components together according to @flags to create an
    * absolute URI string. @path may not be %NULL (though it may be the empty
    * string).
    *
    * In contrast to g_uri_join(), this allows specifying the components of the
    * ‘userinfo’ separately. It otherwise behaves the same.
    *
    * %G_URI_FLAGS_HAS_PASSWORD and %G_URI_FLAGS_HAS_AUTH_PARAMS are ignored if
    * set in @flags.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def uriJoinWithUser(
      flags: UriFlags /* Some(GUriFlags) */,
      scheme: Option[String /* Some(Ptr[gchar]) */ ],
      user: Option[String /* Some(Ptr[gchar]) */ ],
      password: Option[String /* Some(Ptr[gchar]) */ ],
      auth_params: Option[String /* Some(Ptr[gchar]) */ ],
      host: Option[String /* Some(Ptr[gchar]) */ ],
      port: Int /* Some(gint) */,
      path: String /* Some(Ptr[gchar]) */,
      query: Option[String /* Some(Ptr[gchar]) */ ],
      fragment: Option[String /* Some(Ptr[gchar]) */ ]
  )(using Zone): String /* Some(Ptr[gchar]) */ = fromCString(
    g_uri_join_with_user(
      flags.raw,
      scheme
        .map[Ptr[gchar]](o => toCString(o).asInstanceOf[Ptr[gchar]])
        .getOrElse(null.asInstanceOf[Ptr[gchar]]),
      user
        .map[Ptr[gchar]](o => toCString(o).asInstanceOf[Ptr[gchar]])
        .getOrElse(null.asInstanceOf[Ptr[gchar]]),
      password
        .map[Ptr[gchar]](o => toCString(o).asInstanceOf[Ptr[gchar]])
        .getOrElse(null.asInstanceOf[Ptr[gchar]]),
      auth_params
        .map[Ptr[gchar]](o => toCString(o).asInstanceOf[Ptr[gchar]])
        .getOrElse(null.asInstanceOf[Ptr[gchar]]),
      host
        .map[Ptr[gchar]](o => toCString(o).asInstanceOf[Ptr[gchar]])
        .getOrElse(null.asInstanceOf[Ptr[gchar]]),
      gint(port),
      toCString(path).asInstanceOf[Ptr[gchar]],
      query
        .map[Ptr[gchar]](o => toCString(o).asInstanceOf[Ptr[gchar]])
        .getOrElse(null.asInstanceOf[Ptr[gchar]]),
      fragment
        .map[Ptr[gchar]](o => toCString(o).asInstanceOf[Ptr[gchar]])
        .getOrElse(null.asInstanceOf[Ptr[gchar]])
    ).asInstanceOf
  )

  /** Splits an URI list conforming to the text/uri-list mime type defined in
    * RFC 2483 into individual URIs, discarding any comments. The URIs are not
    * validated.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[uri_list_extract_uris:/<return type>]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(utf8)))),ListMap(@type -> DataRecord(gchar**)))"
  )
  private def uriListExtractUris() = ???

  /** Parses @uri_string according to @flags. If the result is not a valid
    * [absolute URI][relative-absolute-uris], it will be discarded, and an error
    * returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[uri_parse:/<return type>]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Uri), @type -> DataRecord(GUri*)))"
  )
  private def uriParse() = ???

  /** Many URI schemes include one or more attribute/value pairs as part of the
    * URI value. This method can be used to parse them into a hash table. When
    * an attribute has multiple occurrences, the last value is the final
    * returned value. If you need to handle repeated attributes differently, use
    * #GUriParamsIter.
    *
    * The @params string is assumed to still be `%`-encoded, but the returned
    * values will be fully decoded. (Thus it is possible that the returned
    * values may contain `=` or @separators, if the value was encoded in the
    * input.) Invalid `%`-encoding is treated as with the
    * %G_URI_FLAGS_PARSE_RELAXED rules for g_uri_parse(). (However, if @params
    * is the path or query string from a #GUri that was parsed without
    * %G_URI_FLAGS_PARSE_RELAXED and %G_URI_FLAGS_ENCODED, then you already know
    * that it does not contain any invalid encoding.)
    *
    * %G_URI_PARAMS_WWW_FORM is handled as documented for
    * g_uri_params_iter_init().
    *
    * If %G_URI_PARAMS_CASE_INSENSITIVE is passed to @flags, attributes will be
    * compared case-insensitively, so a params string `attr=123&Attr=456` will
    * only return a single attribute–value pair, `Attr=456`. Case will be
    * preserved in the returned attributes.
    *
    * If @params cannot be parsed (for example, it contains two @separators
    * characters in a row), then @error is set and %NULL is returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[uri_parse_params:/<return type>]: Cannot render type Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(utf8)))), DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(utf8))))),ListMap(@name -> DataRecord(GLib.HashTable), @type -> DataRecord(GHashTable*)))"
  )
  private def uriParseParams() = ???

  /**  Gets the scheme portion of a URI string.
    *  [RFC 3986](https://tools.ietf.org/html/rfc3986#section-3) decodes the scheme
    *  as:
    *  |[
    *  URI = scheme ":" hier-part [ "?" query ] [ "#" fragment ]
    *  ]|
    *  Common schemes include `file`, `https`, `svn+ssh`, etc.
    *
    *  NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT BE APPLICABLE TO SCALA
    */
  def uriParseScheme(
      uri: String /* Some(CString) */
  )(using Zone): String /* Some(CString) */ = fromCString(
    g_uri_parse_scheme(toCString(uri)).asInstanceOf
  )

  /**  Gets the scheme portion of a URI string.
    *  [RFC 3986](https://tools.ietf.org/html/rfc3986#section-3) decodes the scheme
    *  as:
    *  |[
    *  URI = scheme ":" hier-part [ "?" query ] [ "#" fragment ]
    *  ]|
    *  Common schemes include `file`, `https`, `svn+ssh`, etc.
    *
    *  Unlike g_uri_parse_scheme(), the returned scheme is normalized to
    *  all-lowercase and does not need to be freed.
    *
    *  NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT BE APPLICABLE TO SCALA
    */
  def uriPeekScheme(
      uri: String /* Some(CString) */
  )(using Zone): String /* Some(CString) */ = fromCString(
    g_uri_peek_scheme(toCString(uri)).asInstanceOf
  )

  /** Parses @uri_ref according to @flags and, if it is a [relative
    * URI][relative-absolute-uris], resolves it relative to
    * @base_uri_string.
    *   If the result is not a valid absolute URI, it will be discarded, and an
    *   error returned.
    *
    * (If @base_uri_string is %NULL, this just returns @uri_ref, or %NULL if @uri_ref
    * is invalid or not absolute.)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def uriResolveRelative(
      base_uri_string: Option[String /* Some(Ptr[gchar]) */ ],
      uri_ref: String /* Some(Ptr[gchar]) */,
      flags: UriFlags /* Some(GUriFlags) */
  )(using Zone): GResult[String /* Some(Ptr[gchar]) */ ] =
    GResult.wrap(__errorPtr =>
      fromCString(
        g_uri_resolve_relative(
          base_uri_string
            .map[Ptr[gchar]](o => toCString(o).asInstanceOf[Ptr[gchar]])
            .getOrElse(null.asInstanceOf[Ptr[gchar]]),
          toCString(uri_ref).asInstanceOf[Ptr[gchar]],
          flags.raw,
          __errorPtr
        ).asInstanceOf
      )
    )

  /** Parses @uri_ref (which can be an [absolute or relative
    * URI][relative-absolute-uris]) according to @flags, and returns the pieces.
    * Any component that doesn't appear in @uri_ref will be returned as %NULL
    * (but note that all URIs always have a path component, though it may be the
    * empty string).
    *
    * If @flags contains %G_URI_FLAGS_ENCODED, then `%`-encoded characters in
    * @uri_ref
    *   will remain encoded in the output strings. (If not, then all such
    *   characters will be decoded.) Note that decoding will only work if the
    *   URI components are ASCII or UTF-8, so you will need to use
    *   %G_URI_FLAGS_ENCODED if they are not.
    *
    * Note that the %G_URI_FLAGS_HAS_PASSWORD and %G_URI_FLAGS_HAS_AUTH_PARAMS @flags
    * are ignored by g_uri_split(), since it always returns only the full
    * userinfo; use g_uri_split_with_user() if you want it split up.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[uri_split:]: Function uri_split contains an OUT parameter, which is not supported yet"
  )
  private def uriSplit() = ???

  /** Parses @uri_string (which must be an [absolute
    * URI][relative-absolute-uris]) according to @flags, and returns the pieces
    * relevant to connecting to a host. See the documentation for g_uri_split()
    * for more details; this is mostly a wrapper around that function with
    * simpler arguments. However, it will return an error if @uri_string is a
    * relative URI, or does not contain a hostname component.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[uri_split_network:]: Function uri_split_network contains an OUT parameter, which is not supported yet"
  )
  private def uriSplitNetwork() = ???

  /** Parses @uri_ref (which can be an [absolute or relative
    * URI][relative-absolute-uris]) according to @flags, and returns the pieces.
    * Any component that doesn't appear in @uri_ref will be returned as %NULL
    * (but note that all URIs always have a path component, though it may be the
    * empty string).
    *
    * See g_uri_split(), and the definition of #GUriFlags, for more information
    * on the effect of @flags. Note that @password will only be parsed out if @flags
    * contains %G_URI_FLAGS_HAS_PASSWORD, and
    * @auth_params
    *   will only be parsed out if @flags contains %G_URI_FLAGS_HAS_AUTH_PARAMS.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[uri_split_with_user:]: Function uri_split_with_user contains an OUT parameter, which is not supported yet"
  )
  private def uriSplitWithUser() = ???

  /** Unescapes a segment of an escaped string as binary data.
    *
    * Note that in contrast to g_uri_unescape_string(), this does allow nul
    * bytes to appear in the output.
    *
    * If any of the characters in @illegal_characters appears as an escaped
    * character in @escaped_string, then that is an error and %NULL will be
    * returned. This is useful if you want to avoid for instance having a slash
    * being expanded in an escaped path element, which might confuse pathname
    * handling.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[uri_unescape_bytes:/<return type>]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Bytes), @type -> DataRecord(GBytes*)))"
  )
  private def uriUnescapeBytes() = ???

  /** Unescapes a segment of an escaped string.
    *
    * If any of the characters in @illegal_characters or the NUL character
    * appears as an escaped character in @escaped_string, then that is an error
    * and %NULL will be returned. This is useful if you want to avoid for
    * instance having a slash being expanded in an escaped path element, which
    * might confuse pathname handling.
    *
    * Note: `NUL` byte is not accepted in the output, in contrast to
    * g_uri_unescape_bytes().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def uriUnescapeSegment(
      escaped_string: Option[String /* Some(CString) */ ],
      escaped_string_end: Option[String /* Some(CString) */ ],
      illegal_characters: Option[String /* Some(CString) */ ]
  )(using Zone): String /* Some(CString) */ = fromCString(
    g_uri_unescape_segment(
      escaped_string
        .map[CString](o => toCString(o))
        .getOrElse(null.asInstanceOf[CString]),
      escaped_string_end
        .map[CString](o => toCString(o))
        .getOrElse(null.asInstanceOf[CString]),
      illegal_characters
        .map[CString](o => toCString(o))
        .getOrElse(null.asInstanceOf[CString])
    ).asInstanceOf
  )

  /** Unescapes a whole escaped string.
    *
    * If any of the characters in @illegal_characters or the NUL character
    * appears as an escaped character in @escaped_string, then that is an error
    * and %NULL will be returned. This is useful if you want to avoid for
    * instance having a slash being expanded in an escaped path element, which
    * might confuse pathname handling.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def uriUnescapeString(
      escaped_string: String /* Some(CString) */,
      illegal_characters: Option[String /* Some(CString) */ ]
  )(using Zone): String /* Some(CString) */ = fromCString(
    g_uri_unescape_string(
      toCString(escaped_string),
      illegal_characters
        .map[CString](o => toCString(o))
        .getOrElse(null.asInstanceOf[CString])
    ).asInstanceOf
  )

  /** Pauses the current thread for the given number of microseconds.
    *
    * There are 1 million microseconds per second (represented by the
    * %G_USEC_PER_SEC macro). g_usleep() may have limited precision, depending
    * on hardware and operating system; don't rely on the exact length of the
    * sleep.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def usleep(
      microseconds: CUnsignedLongInt /* Some(gulong) */
  ): Unit /* Some(Unit) */ = g_usleep(gulong(microseconds))

  /** Convert a string from UTF-16 to UCS-4. The result will be nul-terminated.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[utf16_to_ucs4:]: Function utf16_to_ucs4 contains an OUT parameter, which is not supported yet"
  )
  private def utf16ToUcs4() = ???

  /** Convert a string from UTF-16 to UTF-8. The result will be terminated with
    * a 0 byte.
    *
    * Note that the input is expected to be already in native endianness, an
    * initial byte-order-mark character is not handled specially. g_convert()
    * can be used to convert a byte buffer of UTF-16 data of ambiguous
    * endianness.
    *
    * Further note that this function does not validate the result string; it
    * may e.g. include embedded NUL characters. The only validation done by this
    * function is to ensure that the input can be correctly interpreted as
    * UTF-16, i.e. it doesn't contain unpaired surrogates or partial character
    * sequences.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[utf16_to_utf8:]: Function utf16_to_utf8 contains an OUT parameter, which is not supported yet"
  )
  private def utf16ToUtf8() = ???

  /** Converts a string into a form that is independent of case. The result will
    * not correspond to any particular case, but can be compared for equality or
    * ordered with the results of calling g_utf8_casefold() on other strings.
    *
    * Note that calling g_utf8_casefold() followed by g_utf8_collate() is only
    * an approximation to the correct linguistic case insensitive ordering,
    * though it is a fairly good one. Getting this exactly right would require a
    * more sophisticated collation function that takes case sensitivity into
    * account. GLib does not currently provide such a function.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def utf8Casefold(
      str: String /* Some(Ptr[gchar]) */,
      len: CLongInt /* Some(gssize) */
  )(using Zone): String /* Some(Ptr[gchar]) */ = fromCString(
    g_utf8_casefold(
      toCString(str).asInstanceOf[Ptr[gchar]],
      gssize(len)
    ).asInstanceOf
  )

  /** Compares two strings for ordering using the linguistically correct rules
    * for the [current locale][setlocale]. When sorting a large number of
    * strings, it will be significantly faster to obtain collation keys with
    * g_utf8_collate_key() and compare the keys with strcmp() when sorting
    * instead of sorting the original strings.
    *
    * If the two strings are not comparable due to being in different collation
    * sequences, the result is undefined. This can happen if the strings are in
    * different language scripts, for example.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def utf8Collate(
      str1: String /* Some(Ptr[gchar]) */,
      str2: String /* Some(Ptr[gchar]) */
  )(using Zone): Int /* Some(gint) */ = g_utf8_collate(
    toCString(str1).asInstanceOf[Ptr[gchar]],
    toCString(str2).asInstanceOf[Ptr[gchar]]
  ).value

  /** Converts a string into a collation key that can be compared with other
    * collation keys produced by the same function using strcmp().
    *
    * The results of comparing the collation keys of two strings with strcmp()
    * will always be the same as comparing the two original keys with
    * g_utf8_collate().
    *
    * Note that this function depends on the [current locale][setlocale].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def utf8CollateKey(
      str: String /* Some(Ptr[gchar]) */,
      len: CLongInt /* Some(gssize) */
  )(using Zone): String /* Some(Ptr[gchar]) */ = fromCString(
    g_utf8_collate_key(
      toCString(str).asInstanceOf[Ptr[gchar]],
      gssize(len)
    ).asInstanceOf
  )

  /** Converts a string into a collation key that can be compared with other
    * collation keys produced by the same function using strcmp().
    *
    * In order to sort filenames correctly, this function treats the dot '.' as
    * a special case. Most dictionary orderings seem to consider it
    * insignificant, thus producing the ordering "event.c" "eventgenerator.c"
    * "event.h" instead of "event.c" "event.h" "eventgenerator.c". Also, we
    * would like to treat numbers intelligently so that "file1" "file10" "file5"
    * is sorted as "file1" "file5" "file10".
    *
    * Note that this function depends on the [current locale][setlocale].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def utf8CollateKeyForFilename(
      str: String /* Some(Ptr[gchar]) */,
      len: CLongInt /* Some(gssize) */
  )(using Zone): String /* Some(Ptr[gchar]) */ = fromCString(
    g_utf8_collate_key_for_filename(
      toCString(str).asInstanceOf[Ptr[gchar]],
      gssize(len)
    ).asInstanceOf
  )

  /** Finds the start of the next UTF-8 character in the string after @p.
    *
    * @p
    *   does not have to be at the beginning of a UTF-8 character. No check is
    *   made to see if the character found is actually valid other than it
    *   starts with an appropriate byte.
    *
    * If @end is %NULL, the return value will never be %NULL: if the end of the
    * string is reached, a pointer to the terminating nul byte is returned. If
    * @end
    *   is non-%NULL, the return value will be %NULL if the end of the string is
    *   reached.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def utf8FindNextChar(
      p: String /* Some(Ptr[gchar]) */,
      end: Option[String /* Some(Ptr[gchar]) */ ]
  )(using Zone): String /* Some(Ptr[gchar]) */ = fromCString(
    g_utf8_find_next_char(
      toCString(p).asInstanceOf[Ptr[gchar]],
      end
        .map[Ptr[gchar]](o => toCString(o).asInstanceOf[Ptr[gchar]])
        .getOrElse(null.asInstanceOf[Ptr[gchar]])
    ).asInstanceOf
  )

  /** Given a position @p with a UTF-8 encoded string @str, find the start of
    * the previous UTF-8 character starting before @p. Returns %NULL if no UTF-8
    * characters are present in @str before @p.
    *
    * @p
    *   does not have to be at the beginning of a UTF-8 character. No check is
    *   made to see if the character found is actually valid other than it
    *   starts with an appropriate byte.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def utf8FindPrevChar(
      str: String /* Some(Ptr[gchar]) */,
      p: String /* Some(Ptr[gchar]) */
  )(using Zone): String /* Some(Ptr[gchar]) */ = fromCString(
    g_utf8_find_prev_char(
      toCString(str).asInstanceOf[Ptr[gchar]],
      toCString(p).asInstanceOf[Ptr[gchar]]
    ).asInstanceOf
  )

  /** Converts a sequence of bytes encoded as UTF-8 to a Unicode character.
    *
    * If @p does not point to a valid UTF-8 encoded character, results are
    * undefined. If you are not sure that the bytes are complete valid Unicode
    * characters, you should use g_utf8_get_char_validated() instead.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def utf8GetChar(
      p: String /* Some(Ptr[gchar]) */
  )(using Zone): CUnsignedInt /* Some(gunichar) */ = g_utf8_get_char(
    toCString(p).asInstanceOf[Ptr[gchar]]
  ).value

  /** Convert a sequence of bytes encoded as UTF-8 to a Unicode character. This
    * function checks for incomplete characters, for invalid characters such as
    * characters that are out of the range of Unicode, and for overlong
    * encodings of valid characters.
    *
    * Note that g_utf8_get_char_validated() returns (gunichar)-2 if
    * @max_len
    *   is positive and any of the bytes in the first UTF-8 character sequence
    *   are nul.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def utf8GetCharValidated(
      p: String /* Some(Ptr[gchar]) */,
      max_len: CLongInt /* Some(gssize) */
  )(using Zone): CUnsignedInt /* Some(gunichar) */ = g_utf8_get_char_validated(
    toCString(p).asInstanceOf[Ptr[gchar]],
    gssize(max_len)
  ).value

  /** If the provided string is valid UTF-8, return a copy of it. If not, return
    * a copy in which bytes that could not be interpreted as valid Unicode are
    * replaced with the Unicode replacement character (U+FFFD).
    *
    * For example, this is an appropriate function to use if you have received a
    * string that was incorrectly declared to be UTF-8, and you need a valid
    * UTF-8 version of it that can be logged or displayed to the user, with the
    * assumption that it is close enough to ASCII or UTF-8 to be mostly readable
    * as-is.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def utf8MakeValid(
      str: String /* Some(Ptr[gchar]) */,
      len: CLongInt /* Some(gssize) */
  )(using Zone): String /* Some(Ptr[gchar]) */ = fromCString(
    g_utf8_make_valid(
      toCString(str).asInstanceOf[Ptr[gchar]],
      gssize(len)
    ).asInstanceOf
  )

  /** Converts a string into canonical form, standardizing such issues as
    * whether a character with an accent is represented as a base character and
    * combining accent or as a single precomposed character. The string has to
    * be valid UTF-8, otherwise %NULL is returned. You should generally call
    * g_utf8_normalize() before comparing two Unicode strings.
    *
    * The normalization mode %G_NORMALIZE_DEFAULT only standardizes differences
    * that do not affect the text content, such as the above-mentioned accent
    * representation. %G_NORMALIZE_ALL also standardizes the "compatibility"
    * characters in Unicode, such as SUPERSCRIPT THREE to the standard forms (in
    * this case DIGIT THREE). Formatting information may be lost but for most
    * text operations such characters should be considered the same.
    *
    * %G_NORMALIZE_DEFAULT_COMPOSE and %G_NORMALIZE_ALL_COMPOSE are like
    * %G_NORMALIZE_DEFAULT and %G_NORMALIZE_ALL, but returned a result with
    * composed forms rather than a maximally decomposed form. This is often
    * useful if you intend to convert the string to a legacy encoding or pass it
    * to a system with less capable Unicode handling.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def utf8Normalize(
      str: String /* Some(Ptr[gchar]) */,
      len: CLongInt /* Some(gssize) */,
      mode: NormalizeMode /* Some(GNormalizeMode) */
  )(using Zone): String /* Some(Ptr[gchar]) */ = fromCString(
    g_utf8_normalize(
      toCString(str).asInstanceOf[Ptr[gchar]],
      gssize(len),
      mode.raw
    ).asInstanceOf
  )

  /** Converts from an integer character offset to a pointer to a position
    * within the string.
    *
    * Since 2.10, this function allows to pass a negative @offset to step
    * backwards. It is usually worth stepping backwards from the end instead of
    * forwards if @offset is in the last fourth of the string, since moving
    * forward is about 3 times faster than moving backward.
    *
    * Note that this function doesn't abort when reaching the end of @str.
    * Therefore you should be sure that @offset is within string boundaries
    * before calling that function. Call g_utf8_strlen() when unsure. This
    * limitation exists as this function is called frequently during text
    * rendering and therefore has to be as fast as possible.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[utf8_offset_to_pointer:/<function parameters>/offset]: Cannot render type Type(List(),ListMap(@name -> DataRecord(glong), @type -> DataRecord(glong)))"
  )
  private def utf8OffsetToPointer() = ???

  /** Converts from a pointer to position within a string to an integer
    * character offset.
    *
    * Since 2.10, this function allows @pos to be before @str, and returns a
    * negative offset in this case.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[utf8_pointer_to_offset:/<return type>]: Cannot render type Type(List(),ListMap(@name -> DataRecord(glong), @type -> DataRecord(glong)))"
  )
  private def utf8PointerToOffset() = ???

  /** Finds the previous UTF-8 character in the string before @p.
    *
    * @p
    *   does not have to be at the beginning of a UTF-8 character. No check is
    *   made to see if the character found is actually valid other than it
    *   starts with an appropriate byte. If @p might be the first character of
    *   the string, you must use g_utf8_find_prev_char() instead.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def utf8PrevChar(
      p: String /* Some(Ptr[gchar]) */
  )(using Zone): String /* Some(Ptr[gchar]) */ = fromCString(
    g_utf8_prev_char(toCString(p).asInstanceOf[Ptr[gchar]]).asInstanceOf
  )

  /** Finds the leftmost occurrence of the given Unicode character in a UTF-8
    * encoded string, while limiting the search to @len bytes. If @len is -1,
    * allow unbounded search.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def utf8Strchr(
      p: String /* Some(Ptr[gchar]) */,
      len: CLongInt /* Some(gssize) */,
      c: CUnsignedInt /* Some(gunichar) */
  )(using Zone): String /* Some(Ptr[gchar]) */ = fromCString(
    g_utf8_strchr(
      toCString(p).asInstanceOf[Ptr[gchar]],
      gssize(len),
      gunichar(guint32(c))
    ).asInstanceOf
  )

  /** Converts all Unicode characters in the string that have a case to
    * lowercase. The exact manner that this is done depends on the current
    * locale, and may result in the number of characters in the string changing.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def utf8Strdown(
      str: String /* Some(Ptr[gchar]) */,
      len: CLongInt /* Some(gssize) */
  )(using Zone): String /* Some(Ptr[gchar]) */ = fromCString(
    g_utf8_strdown(
      toCString(str).asInstanceOf[Ptr[gchar]],
      gssize(len)
    ).asInstanceOf
  )

  /** Computes the length of the string in characters, not including the
    * terminating nul character. If the @max'th byte falls in the middle of a
    * character, the last (partial) character is not counted.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[utf8_strlen:/<return type>]: Cannot render type Type(List(),ListMap(@name -> DataRecord(glong), @type -> DataRecord(glong)))"
  )
  private def utf8Strlen() = ???

  /** Like the standard C strncpy() function, but copies a given number of
    * characters instead of a given number of bytes. The @src string must be
    * valid UTF-8 encoded text. (Use g_utf8_validate() on all text before trying
    * to use UTF-8 utility functions with it.)
    *
    * Note you must ensure @dest is at least 4 * @n + 1 to fit the largest
    * possible UTF-8 characters
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def utf8Strncpy(
      dest: String /* Some(Ptr[gchar]) */,
      src: String /* Some(Ptr[gchar]) */,
      n: CUnsignedLongInt /* Some(gsize) */
  )(using Zone): String /* Some(Ptr[gchar]) */ = fromCString(
    g_utf8_strncpy(
      toCString(dest).asInstanceOf[Ptr[gchar]],
      toCString(src).asInstanceOf[Ptr[gchar]],
      gsize(n)
    ).asInstanceOf
  )

  /** Find the rightmost occurrence of the given Unicode character in a UTF-8
    * encoded string, while limiting the search to @len bytes. If @len is -1,
    * allow unbounded search.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def utf8Strrchr(
      p: String /* Some(Ptr[gchar]) */,
      len: CLongInt /* Some(gssize) */,
      c: CUnsignedInt /* Some(gunichar) */
  )(using Zone): String /* Some(Ptr[gchar]) */ = fromCString(
    g_utf8_strrchr(
      toCString(p).asInstanceOf[Ptr[gchar]],
      gssize(len),
      gunichar(guint32(c))
    ).asInstanceOf
  )

  /** Reverses a UTF-8 string. @str must be valid UTF-8 encoded text. (Use
    * g_utf8_validate() on all text before trying to use UTF-8 utility functions
    * with it.)
    *
    * This function is intended for programmatic uses of reversed strings. It
    * pays no attention to decomposed characters, combining marks, byte order
    * marks, directional indicators (LRM, LRO, etc) and similar characters which
    * might need special handling when reversing a string for display purposes.
    *
    * Note that unlike g_strreverse(), this function returns newly-allocated
    * memory, which should be freed with g_free() when no longer needed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def utf8Strreverse(
      str: String /* Some(Ptr[gchar]) */,
      len: CLongInt /* Some(gssize) */
  )(using Zone): String /* Some(Ptr[gchar]) */ = fromCString(
    g_utf8_strreverse(
      toCString(str).asInstanceOf[Ptr[gchar]],
      gssize(len)
    ).asInstanceOf
  )

  /** Converts all Unicode characters in the string that have a case to
    * uppercase. The exact manner that this is done depends on the current
    * locale, and may result in the number of characters in the string
    * increasing. (For instance, the German ess-zet will be changed to SS.)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def utf8Strup(
      str: String /* Some(Ptr[gchar]) */,
      len: CLongInt /* Some(gssize) */
  )(using Zone): String /* Some(Ptr[gchar]) */ = fromCString(
    g_utf8_strup(
      toCString(str).asInstanceOf[Ptr[gchar]],
      gssize(len)
    ).asInstanceOf
  )

  /** Copies a substring out of a UTF-8 encoded string. The substring will
    * contain @end_pos - @start_pos characters.
    *
    * Since GLib 2.72, `-1` can be passed to @end_pos to indicate the end of the
    * string.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[utf8_substring:/<function parameters>/start_pos]: Cannot render type Type(List(),ListMap(@name -> DataRecord(glong), @type -> DataRecord(glong)))"
  )
  private def utf8Substring() = ???

  /** Convert a string from UTF-8 to a 32-bit fixed width representation as
    * UCS-4. A trailing 0 character will be added to the string after the
    * converted text.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[utf8_to_ucs4:]: Function utf8_to_ucs4 contains an OUT parameter, which is not supported yet"
  )
  private def utf8ToUcs4() = ???

  /** Convert a string from UTF-8 to a 32-bit fixed width representation as
    * UCS-4, assuming valid UTF-8 input. This function is roughly twice as fast
    * as g_utf8_to_ucs4() but does no error checking on the input. A trailing 0
    * character will be added to the string after the converted text.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[utf8_to_ucs4_fast:]: Function utf8_to_ucs4_fast contains an OUT parameter, which is not supported yet"
  )
  private def utf8ToUcs4Fast() = ???

  /** Convert a string from UTF-8 to UTF-16. A 0 character will be added to the
    * result after the converted text.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[utf8_to_utf16:]: Function utf8_to_utf16 contains an OUT parameter, which is not supported yet"
  )
  private def utf8ToUtf16() = ???

  /** Cuts off the middle of the string, preserving half of @truncate_length
    * characters at the beginning and half at the end.
    *
    * If @string is already short enough, this returns a copy of @string. If @truncate_length
    * is `0`, an empty string is returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def utf8TruncateMiddle(
      string: String /* Some(Ptr[gchar]) */,
      truncate_length: CUnsignedLongInt /* Some(gsize) */
  )(using Zone): String /* Some(Ptr[gchar]) */ = fromCString(
    g_utf8_truncate_middle(
      toCString(string).asInstanceOf[Ptr[gchar]],
      gsize(truncate_length)
    ).asInstanceOf
  )

  /** Validates UTF-8 encoded text. @str is the text to validate; if @str is
    * nul-terminated, then @max_len can be -1, otherwise
    * @max_len
    *   should be the number of bytes to validate. If @end is non-%NULL, then
    *   the end of the valid range will be stored there (i.e. the start of the
    *   first invalid character if some bytes were invalid, or the end of the
    *   text being validated otherwise).
    *
    * Note that g_utf8_validate() returns %FALSE if @max_len is positive and any
    * of the @max_len bytes are nul.
    *
    * Returns %TRUE if all of @str was valid. Many GLib and GTK routines require
    * valid UTF-8 as input; so data read from a file or the network should be
    * checked with g_utf8_validate() before doing anything else with it.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[utf8_validate:]: Function utf8_validate contains an OUT parameter, which is not supported yet"
  )
  private def utf8Validate() = ???

  /** Validates UTF-8 encoded text.
    *
    * As with g_utf8_validate(), but @max_len must be set, and hence this
    * function will always return %FALSE if any of the bytes of @str are nul.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[utf8_validate_len:]: Function utf8_validate_len contains an OUT parameter, which is not supported yet"
  )
  private def utf8ValidateLen() = ???

  /** Parses the string @str and verify if it is a UUID.
    *
    * The function accepts the following syntax:
    *
    *   - simple forms (e.g. `f81d4fae-7dec-11d0-a765-00a0c91e6bf6`)
    *
    * Note that hyphens are required within the UUID string itself, as per the
    * aforementioned RFC.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def uuidStringIsValid(
      str: String /* Some(Ptr[gchar]) */
  )(using Zone): Boolean /* Some(gboolean) */ =
    g_uuid_string_is_valid(toCString(str).asInstanceOf[Ptr[gchar]]).value.!=(0)

  /** Generates a random UUID (RFC 4122 version 4) as a string. It has the same
    * randomness guarantees as #GRand, so must not be used for cryptographic
    * purposes such as key generation, nonces, salts or one-time pads.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def uuidStringRandom()(using Zone): String /* Some(Ptr[gchar]) */ =
    fromCString(g_uuid_string_random().asInstanceOf)

  @annotation.compileTimeOnly(
    "[variant_get_gtype:]: Function variant_get_gtype is weird: Incorrectly sitting in gobject bindings?"
  )
  private def variantGetGtype() = ???

  /** Determines if a given string is a valid D-Bus object path. You should
    * ensure that a string is a valid D-Bus object path before passing it to
    * g_variant_new_object_path().
    *
    * A valid object path starts with `/` followed by zero or more sequences of
    * characters separated by `/` characters. Each sequence must contain only
    * the characters `[A-Z][a-z][0-9]_`. No sequence (including the one
    * following the final `/` character) may be empty.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def variantIsObjectPath(
      string: String /* Some(Ptr[gchar]) */
  )(using Zone): Boolean /* Some(gboolean) */ = g_variant_is_object_path(
    toCString(string).asInstanceOf[Ptr[gchar]]
  ).value.!=(0)

  /** Determines if a given string is a valid D-Bus type signature. You should
    * ensure that a string is a valid D-Bus type signature before passing it to
    * g_variant_new_signature().
    *
    * D-Bus type signatures consist of zero or more definite #GVariantType
    * strings in sequence.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def variantIsSignature(
      string: String /* Some(Ptr[gchar]) */
  )(using Zone): Boolean /* Some(gboolean) */ = g_variant_is_signature(
    toCString(string).asInstanceOf[Ptr[gchar]]
  ).value.!=(0)

  /** Parses a #GVariant from a text representation.
    *
    * A single #GVariant is parsed from the content of @text.
    *
    * The format is described [here][gvariant-text].
    *
    * The memory at @limit will never be accessed and the parser behaves as if
    * the character at @limit is the nul terminator. This has the effect of
    * bounding @text.
    *
    * If @endptr is non-%NULL then @text is permitted to contain data following
    * the value that this function parses and @endptr will be updated to point
    * to the first character past the end of the text parsed by this function.
    * If @endptr is %NULL and there is extra data then an error is returned.
    *
    * If @type is non-%NULL then the value will be parsed to have that type.
    * This may result in additional parse errors (in the case that the parsed
    * value doesn't fit the type) but may also result in fewer errors (in the
    * case that the type would have been ambiguous, such as with empty arrays).
    *
    * In the event that the parsing is successful, the resulting #GVariant is
    * returned. It is never floating, and must be freed with g_variant_unref().
    *
    * In case of any error, %NULL will be returned. If @error is non-%NULL then
    * it will be set to reflect the error that occurred.
    *
    * Officially, the language understood by the parser is "any string produced
    * by g_variant_print()".
    *
    * There may be implementation specific restrictions on deeply nested values,
    * which would result in a %G_VARIANT_PARSE_ERROR_RECURSION error. #GVariant
    * is guaranteed to handle nesting up to at least 64 levels.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[variant_parse:/<function parameters>/type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(VariantType), @type -> DataRecord(const GVariantType*)))"
  )
  private def variantParse() = ???

  /**  Pretty-prints a message showing the context of a #GVariant parse
    *  error within the string for which parsing was attempted.
    *
    *  The resulting string is suitable for output to the console or other
    *  monospace media where newlines are treated in the usual way.
    *
    *  The message will typically look something like one of the following:
    *
    *  |[
    *  unterminated string constant:
    *    (1, 2, 3, 'abc
    *              ^^^^
    *  ]|
    *
    *  or
    *
    *  |[
    *  unable to find a common type:
    *    [1, 2, 3, 'str']
    *     ^        ^^^^^
    *  ]|
    *
    *  The format of the message may change in a future version.
    *
    *  @error must have come from a failed attempt to g_variant_parse() and
    *  @source_str must be exactly the same string that caused the error.
    *  If @source_str was not nul-terminated when you passed it to
    *  g_variant_parse() then you must add nul termination before using this
    *  function.
    *
    *  NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[variant_parse_error_print_context:/<function parameters>/error]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Error), @type -> DataRecord(GError*)))"
  )
  private def variantParseErrorPrintContext() = ???

  @annotation.compileTimeOnly(
    "[variant_parse_error_quark:/<return type>]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Quark), @type -> DataRecord(GQuark)))"
  )
  private def variantParseErrorQuark() = ???

  /** Same as g_variant_error_quark().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[variant_parser_get_error_quark:/<return type>]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Quark), @type -> DataRecord(GQuark)))"
  )
  private def variantParserGetErrorQuark() = ???

  @annotation.compileTimeOnly(
    "[variant_type_checked_:/<return type>]: Cannot render type Type(List(),ListMap(@name -> DataRecord(VariantType), @type -> DataRecord(const GVariantType*)))"
  )
  private def variantTypeChecked() = ???

  def variantTypeStringGetDepth(type_string: String /* Some(Ptr[gchar]) */ )(
      using Zone
  ): CUnsignedLongInt /* Some(gsize) */ = g_variant_type_string_get_depth_(
    toCString(type_string).asInstanceOf[Ptr[gchar]]
  ).value

  /** Checks if @type_string is a valid GVariant type string. This call is
    * equivalent to calling g_variant_type_string_scan() and confirming that the
    * following character is a nul terminator.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def variantTypeStringIsValid(
      type_string: String /* Some(Ptr[gchar]) */
  )(using Zone): Boolean /* Some(gboolean) */ = g_variant_type_string_is_valid(
    toCString(type_string).asInstanceOf[Ptr[gchar]]
  ).value.!=(0)

  /** Scan for a single complete and valid GVariant type string in @string. The
    * memory pointed to by @limit (or bytes beyond it) is never accessed.
    *
    * If a valid type string is found, @endptr is updated to point to the first
    * character past the end of the string that was found and %TRUE is returned.
    *
    * If there is no valid type string starting at @string, or if the type
    * string does not end before @limit then %FALSE is returned.
    *
    * For the simple case of checking if a string is a valid type string, see
    * g_variant_type_string_is_valid().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[variant_type_string_scan:]: Function variant_type_string_scan contains an OUT parameter, which is not supported yet"
  )
  private def variantTypeStringScan() = ???

  /** An implementation of the GNU vasprintf() function which supports
    * positional parameters, as specified in the Single Unix Specification. This
    * function is similar to g_vsprintf(), except that it allocates a string to
    * hold the output, instead of putting the output in a buffer you allocate in
    * advance.
    *
    * The returned value in @string is guaranteed to be non-NULL, unless
    * @format
    *   contains `%lc` or `%ls` conversions, which can fail if no multibyte
    *   representation is available for the given character.
    *
    * `glib/gprintf.h` must be explicitly included in order to use this
    * function.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[vasprintf:]: Method g_vasprintf has no target types"
  )
  private def vasprintf() = ???

  /** An implementation of the standard fprintf() function which supports
    * positional parameters, as specified in the Single Unix Specification.
    *
    * `glib/gprintf.h` must be explicitly included in order to use this
    * function.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[vfprintf:]: Method g_vfprintf has no target types"
  )
  private def vfprintf() = ???

  /** An implementation of the standard vprintf() function which supports
    * positional parameters, as specified in the Single Unix Specification.
    *
    * `glib/gprintf.h` must be explicitly included in order to use this
    * function.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[vprintf:]: Method g_vprintf has no target types"
  )
  private def vprintf() = ???

  /** A safer form of the standard vsprintf() function. The output is guaranteed
    * to not exceed @n characters (including the terminating nul character), so
    * it is easy to ensure that a buffer overflow cannot occur.
    *
    * See also g_strdup_vprintf().
    *
    * In versions of GLib prior to 1.2.3, this function may return -1 if the
    * output was truncated, and the truncated string may not be nul-terminated.
    * In versions prior to 1.3.12, this function returns the length of the
    * output string.
    *
    * The return value of g_vsnprintf() conforms to the vsnprintf() function as
    * standardized in ISO C99. Note that this is different from traditional
    * vsnprintf(), which returns the length of the output string.
    *
    * The format string may contain positional parameters, as specified in the
    * Single Unix Specification.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def vsnprintf(
      string: String /* Some(Ptr[gchar]) */,
      n: CUnsignedLongInt /* Some(gulong) */,
      format: String /* Some(Ptr[gchar]) */,
      args: CVarArgList /* Some(va_list) */
  )(using Zone): Int /* Some(gint) */ = g_vsnprintf(
    toCString(string).asInstanceOf[Ptr[gchar]],
    gulong(n),
    toCString(format).asInstanceOf[Ptr[gchar]],
    args
  ).value

  /** An implementation of the standard vsprintf() function which supports
    * positional parameters, as specified in the Single Unix Specification.
    *
    * `glib/gprintf.h` must be explicitly included in order to use this
    * function.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[vsprintf:]: Method g_vsprintf has no target types"
  )
  private def vsprintf() = ???

  /** Internal function used to print messages from the public
    * g_warn_if_reached() and g_warn_if_fail() macros.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def warnMessage(
      domain: Option[String /* Some(CString) */ ],
      file: String /* Some(CString) */,
      line: Int /* Some(CInt) */,
      func: String /* Some(CString) */,
      warnexpr: Option[String /* Some(CString) */ ]
  )(using Zone): Unit /* Some(Unit) */ = g_warn_message(
    domain
      .map[CString](o => toCString(o))
      .getOrElse(null.asInstanceOf[CString]),
    toCString(file),
    line,
    toCString(func),
    warnexpr
      .map[CString](o => toCString(o))
      .getOrElse(null.asInstanceOf[CString])
  )

  final val ANALYZER_ANALYZING: Int = 1

  /**  A good size for a buffer to be passed into g_ascii_dtostr().
    *  It is guaranteed to be enough for all output of that function
    *  on systems with 64bit IEEE-compatible doubles.
    *
    *  The typical usage would be something like:
    *  |[<!-- language="C" -->
    *    char buf[G_ASCII_DTOSTR_BUF_SIZE];
    *
    *    fprintf (out, "value=%s\n", g_ascii_dtostr (buf, sizeof (buf), value));
    *  ]|
    *
    *  NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT BE APPLICABLE TO SCALA
    */
  final val ASCII_DTOSTR_BUF_SIZE: Int = 39

  /**  Evaluates to the initial reference count for `gatomicrefcount`.
    *
    *  This macro is useful for initializing `gatomicrefcount` fields inside
    *  structures, for instance:
    *
    *  |[<!-- language="C" -->
    *  typedef struct {
    *    gatomicrefcount ref_count;
    *    char *name;
    *    char *address;
    *  } Person;
    *
    *  static const Person default_person = {
    *    .ref_count = G_ATOMIC_REF_COUNT_INIT,
    *    .name = "Default name",
    *    .address = "Default address",
    *  };
    *  ]|
    *
    *  NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT BE APPLICABLE TO SCALA
    */
  final val ATOMIC_REF_COUNT_INIT: Int = 1

  /** Specifies one of the possible types of byte order. See %G_BYTE_ORDER.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val BIG_ENDIAN: Int = 4321

  /** The set of uppercase ASCII alphabet characters. Used for specifying valid
    * identifier characters in #GScannerConfig.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val CSET_A_2_Z: String = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

  /** The set of ASCII digits. Used for specifying valid identifier characters
    * in #GScannerConfig.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val CSET_DIGITS: String = "0123456789"

  /** The set of lowercase ASCII alphabet characters. Used for specifying valid
    * identifier characters in #GScannerConfig.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val CSET_a_2_z: String = "abcdefghijklmnopqrstuvwxyz"

  /** The C standard version the code is compiling against, it's normally
    * defined with the same value of `__STDC_VERSION__` for C standard
    * compatible compilers, while it uses the lowest standard version in pure
    * MSVC, given that in such compiler the definition depends on a compilation
    * flag.
    *
    * This is granted to be undefined when compiling with a C++ compiler.
    *
    * See also: %G_C_STD_CHECK_VERSION and %G_CXX_STD_VERSION
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val C_STD_VERSION: Int = 199000

  /** A bitmask that restricts the possible flags passed to
    * g_datalist_set_flags(). Passing a flags value where flags &
    * ~G_DATALIST_FLAGS_MASK != 0 is an error.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val DATALIST_FLAGS_MASK: Int = 3

  /** Represents an invalid #GDateDay.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val DATE_BAD_DAY: Int = 0

  /** Represents an invalid Julian day number.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val DATE_BAD_JULIAN: Int = 0

  /** Represents an invalid year.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val DATE_BAD_YEAR: Int = 0

  /** The directory separator character. This is '/' on UNIX machines and '\'
    * under Windows.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val DIR_SEPARATOR: Int = 47

  /** The directory separator as a string. This is "/" on UNIX machines and "\"
    * under Windows.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val DIR_SEPARATOR_S: String = "/"

  /** The base of natural logarithms.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[E:]: Cannot represent constant type Type(List(),ListMap(@name -> DataRecord(gdouble), @type -> DataRecord(gdouble))) with raw value `2.718282`"
  )
  private def E() = ???

  /**  This is the platform dependent conversion specifier for scanning and
    *  printing values of type #gint16. It is a string literal, but doesn't
    *  include the percent-sign, such that you can add precision and length
    *  modifiers between percent-sign and conversion specifier.
    *
    *  |[<!-- language="C" -->
    *  gint16 in;
    *  gint32 out;
    *  sscanf ("42", "%" G_GINT16_FORMAT, &in)
    *  out = in * 1000;
    *  g_print ("%" G_GINT32_FORMAT, out);
    *
    *  This is not necessarily the correct format for printing and scanning
    *  `int16_t` values, even though the in-memory representation is the same.
    *  Standard C macros like `PRId16` and `SCNd16` should be used for `int16_t`.
    *  ]|
    *
    *  NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT BE APPLICABLE TO SCALA
    */
  final val GINT16_FORMAT: String = "hi"

  /**  The platform dependent length modifier for conversion specifiers
    *  for scanning and printing values of type #gint16 or #guint16. It
    *  is a string literal, but doesn't include the percent-sign, such
    *  that you can add precision and length modifiers between percent-sign
    *  and conversion specifier and append a conversion specifier.
    *
    *  The following example prints "0x7b";
    *  |[<!-- language="C" -->
    *  gint16 value = 123;
    *  g_print ("%#" G_GINT16_MODIFIER "x", value);
    *  ]|
    *
    *  This is not necessarily the correct modifier for printing and scanning
    *  `int16_t` values, even though the in-memory representation is the same.
    *  Standard C macros like `PRId16` and `SCNd16` should be used for `int16_t`.
    *
    *  NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT BE APPLICABLE TO SCALA
    */
  final val GINT16_MODIFIER: String = "h"

  /** This is the platform dependent conversion specifier for scanning and
    * printing values of type #gint32. See also %G_GINT16_FORMAT.
    *
    * This is not necessarily the correct modifier for printing and scanning
    * `int32_t` values, even though the in-memory representation is the same.
    * Standard C macros like `PRId32` and `SCNd32` should be used for `int32_t`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val GINT32_FORMAT: String = "i"

  /** The platform dependent length modifier for conversion specifiers for
    * scanning and printing values of type #gint32 or #guint32. It is a string
    * literal. See also %G_GINT16_MODIFIER.
    *
    * This is not necessarily the correct modifier for printing and scanning
    * `int32_t` values, even though the in-memory representation is the same.
    * Standard C macros like `PRId32` and `SCNd32` should be used for `int32_t`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val GINT32_MODIFIER: String = ""

  /** This is the platform dependent conversion specifier for scanning and
    * printing values of type #gint64. See also %G_GINT16_FORMAT.
    *
    * Some platforms do not support scanning and printing 64-bit integers, even
    * though the types are supported. On such platforms %G_GINT64_FORMAT is not
    * defined. Note that scanf() may not support 64-bit integers, even if
    * %G_GINT64_FORMAT is defined. Due to its weak error handling, scanf() is
    * not recommended for parsing anyway; consider using g_ascii_strtoull()
    * instead.
    *
    * This is not necessarily the correct format for printing and scanning
    * `int64_t` values, even though the in-memory representation is the same.
    * Standard C macros like `PRId64` and `SCNd64` should be used for `int64_t`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val GINT64_FORMAT: String = "li"

  /** The platform dependent length modifier for conversion specifiers for
    * scanning and printing values of type #gint64 or #guint64. It is a string
    * literal.
    *
    * Some platforms do not support printing 64-bit integers, even though the
    * types are supported. On such platforms %G_GINT64_MODIFIER is not defined.
    *
    * This is not necessarily the correct modifier for printing and scanning
    * `int64_t` values, even though the in-memory representation is the same.
    * Standard C macros like `PRId64` and `SCNd64` should be used for `int64_t`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val GINT64_MODIFIER: String = "l"

  /** This is the platform dependent conversion specifier for scanning and
    * printing values of type #gintptr.
    *
    * Note that this is not necessarily the correct format to scan or print an
    * `intptr_t`, even though the in-memory representation is the same. Standard
    * C macros like `PRIdPTR` and `SCNdPTR` should be used for `intptr_t`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val GINTPTR_FORMAT: String = "li"

  /** The platform dependent length modifier for conversion specifiers for
    * scanning and printing values of type #gintptr or #guintptr. It is a string
    * literal.
    *
    * Note that this is not necessarily the correct modifier to scan or print an
    * `intptr_t`, even though the in-memory representation is the same. Standard
    * C macros like `PRIdPTR` and `SCNdPTR` should be used for `intptr_t`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val GINTPTR_MODIFIER: String = "l"

  /** Expands to "" on all modern compilers, and to __FUNCTION__ on gcc version
    * 2.x. Don't use it.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val GNUC_FUNCTION: String = ""

  /** Expands to "" on all modern compilers, and to __PRETTY_FUNCTION__ on gcc
    * version 2.x. Don't use it.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val GNUC_PRETTY_FUNCTION: String = ""

  /** This is the platform dependent conversion specifier for scanning and
    * printing values of type #gsize. See also %G_GINT16_FORMAT.
    *
    * Note that this is not necessarily the correct format to scan or print a
    * `size_t`, even though the in-memory representation is the same. The
    * standard C `"zu"` format should be used for `size_t`, assuming a
    * C99-compliant `printf` implementation is available.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val GSIZE_FORMAT: String = "lu"

  /** The platform dependent length modifier for conversion specifiers for
    * scanning and printing values of type #gsize. It is a string literal.
    *
    * Note that this is not necessarily the correct modifier to scan or print a
    * `size_t`, even though the in-memory representation is the same. The
    * Standard C `"z"` modifier should be used for `size_t`, assuming a
    * C99-compliant `printf` implementation is available.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val GSIZE_MODIFIER: String = "l"

  /** This is the platform dependent conversion specifier for scanning and
    * printing values of type #gssize. See also %G_GINT16_FORMAT.
    *
    * Note that this is not necessarily the correct format to scan or print a
    * POSIX `ssize_t` or a Windows `SSIZE_T`, even though the in-memory
    * representation is the same. On POSIX platforms, the `"zd"` format should
    * be used for `ssize_t`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val GSSIZE_FORMAT: String = "li"

  /** The platform dependent length modifier for conversion specifiers for
    * scanning and printing values of type #gssize. It is a string literal.
    *
    * Note that this is not necessarily the correct modifier to scan or print a
    * POSIX `ssize_t` or a Windows `SSIZE_T`, even though the in-memory
    * representation is the same. On POSIX platforms, the `"z"` modifier should
    * be used for `ssize_t`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val GSSIZE_MODIFIER: String = "l"

  /** This is the platform dependent conversion specifier for scanning and
    * printing values of type #guint16. See also %G_GINT16_FORMAT
    *
    * This is not necessarily the correct modifier for printing and scanning
    * `uint16_t` values, even though the in-memory representation is the same.
    * Standard C macros like `PRIu16` and `SCNu16` should be used for
    * `uint16_t`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val GUINT16_FORMAT: String = "hu"

  /** This is the platform dependent conversion specifier for scanning and
    * printing values of type #guint32. See also %G_GINT16_FORMAT.
    *
    * This is not necessarily the correct modifier for printing and scanning
    * `uint32_t` values, even though the in-memory representation is the same.
    * Standard C macros like `PRIu32` and `SCNu32` should be used for
    * `uint32_t`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val GUINT32_FORMAT: String = "u"

  /** This is the platform dependent conversion specifier for scanning and
    * printing values of type #guint64. See also %G_GINT16_FORMAT.
    *
    * Some platforms do not support scanning and printing 64-bit integers, even
    * though the types are supported. On such platforms %G_GUINT64_FORMAT is not
    * defined. Note that scanf() may not support 64-bit integers, even if
    * %G_GINT64_FORMAT is defined. Due to its weak error handling, scanf() is
    * not recommended for parsing anyway; consider using g_ascii_strtoull()
    * instead.
    *
    * This is not necessarily the correct modifier for printing and scanning
    * `uint64_t` values, even though the in-memory representation is the same.
    * Standard C macros like `PRIu64` and `SCNu64` should be used for
    * `uint64_t`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val GUINT64_FORMAT: String = "lu"

  /** This is the platform dependent conversion specifier for scanning and
    * printing values of type #guintptr.
    *
    * Note that this is not necessarily the correct format to scan or print a
    * `uintptr_t`, even though the in-memory representation is the same.
    * Standard C macros like `PRIuPTR` and `SCNuPTR` should be used for
    * `uintptr_t`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val GUINTPTR_FORMAT: String = "lu"
  final val HAVE_GINT64: Int = 1
  final val HAVE_GNUC_VARARGS: Int = 1

  /** Defined to 1 if gcc-style visibility handling is supported.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val HAVE_GNUC_VISIBILITY: Int = 1
  final val HAVE_GROWING_STACK: Int = 0
  final val HAVE_ISO_VARARGS: Int = 1

  /** The position of the first bit which is not reserved for internal use be
    * the #GHook implementation, i.e. `1 << G_HOOK_FLAG_USER_SHIFT` is the first
    * bit which can be used for application-defined flags.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val HOOK_FLAG_USER_SHIFT: Int = 4

  /** The bias by which exponents in double-precision floats are offset.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val IEEE754_DOUBLE_BIAS: Int = 1023

  /** The bias by which exponents in single-precision floats are offset.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val IEEE754_FLOAT_BIAS: Int = 127

  /** The name of the main group of a desktop entry file, as defined in the
    * [Desktop Entry
    * Specification](http://freedesktop.org/Standards/desktop-entry-spec).
    * Consult the specification for more details about the meanings of the keys
    * below.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val KEY_FILE_DESKTOP_GROUP: String = "Desktop Entry"

  /** A key under %G_KEY_FILE_DESKTOP_GROUP, whose value is a string list giving
    * the available application actions.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val KEY_FILE_DESKTOP_KEY_ACTIONS: String = "Actions"

  /** A key under %G_KEY_FILE_DESKTOP_GROUP, whose value is a list of strings
    * giving the categories in which the desktop entry should be shown in a
    * menu.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val KEY_FILE_DESKTOP_KEY_CATEGORIES: String = "Categories"

  /** A key under %G_KEY_FILE_DESKTOP_GROUP, whose value is a localized string
    * giving the tooltip for the desktop entry.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val KEY_FILE_DESKTOP_KEY_COMMENT: String = "Comment"

  /** A key under %G_KEY_FILE_DESKTOP_GROUP, whose value is a boolean set to
    * true if the application is D-Bus activatable.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val KEY_FILE_DESKTOP_KEY_DBUS_ACTIVATABLE: String = "DBusActivatable"

  /** A key under %G_KEY_FILE_DESKTOP_GROUP, whose value is a string giving the
    * command line to execute. It is only valid for desktop entries with the
    * `Application` type.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val KEY_FILE_DESKTOP_KEY_EXEC: String = "Exec"

  /** A key under %G_KEY_FILE_DESKTOP_GROUP, whose value is a localized string
    * giving the generic name of the desktop entry.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val KEY_FILE_DESKTOP_KEY_GENERIC_NAME: String = "GenericName"

  /** A key under %G_KEY_FILE_DESKTOP_GROUP, whose value is a boolean stating
    * whether the desktop entry has been deleted by the user.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val KEY_FILE_DESKTOP_KEY_HIDDEN: String = "Hidden"

  /** A key under %G_KEY_FILE_DESKTOP_GROUP, whose value is a localized string
    * giving the name of the icon to be displayed for the desktop entry.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val KEY_FILE_DESKTOP_KEY_ICON: String = "Icon"

  /** A key under %G_KEY_FILE_DESKTOP_GROUP, whose value is a list of strings
    * giving the MIME types supported by this desktop entry.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val KEY_FILE_DESKTOP_KEY_MIME_TYPE: String = "MimeType"

  /** A key under %G_KEY_FILE_DESKTOP_GROUP, whose value is a localized string
    * giving the specific name of the desktop entry.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val KEY_FILE_DESKTOP_KEY_NAME: String = "Name"

  /** A key under %G_KEY_FILE_DESKTOP_GROUP, whose value is a list of strings
    * identifying the environments that should not display the desktop entry.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val KEY_FILE_DESKTOP_KEY_NOT_SHOW_IN: String = "NotShowIn"

  /** A key under %G_KEY_FILE_DESKTOP_GROUP, whose value is a boolean stating
    * whether the desktop entry should be shown in menus.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val KEY_FILE_DESKTOP_KEY_NO_DISPLAY: String = "NoDisplay"

  /** A key under %G_KEY_FILE_DESKTOP_GROUP, whose value is a list of strings
    * identifying the environments that should display the desktop entry.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val KEY_FILE_DESKTOP_KEY_ONLY_SHOW_IN: String = "OnlyShowIn"

  /** A key under %G_KEY_FILE_DESKTOP_GROUP, whose value is a string containing
    * the working directory to run the program in. It is only valid for desktop
    * entries with the `Application` type.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val KEY_FILE_DESKTOP_KEY_PATH: String = "Path"

  /** A key under %G_KEY_FILE_DESKTOP_GROUP, whose value is a boolean stating
    * whether the application supports the [Startup Notification Protocol
    * Specification](http://www.freedesktop.org/Standards/startup-notification-spec).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val KEY_FILE_DESKTOP_KEY_STARTUP_NOTIFY: String = "StartupNotify"

  /** A key under %G_KEY_FILE_DESKTOP_GROUP, whose value is string identifying
    * the WM class or name hint of a window that the application will create,
    * which can be used to emulate Startup Notification with older applications.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val KEY_FILE_DESKTOP_KEY_STARTUP_WM_CLASS: String = "StartupWMClass"

  /** A key under %G_KEY_FILE_DESKTOP_GROUP, whose value is a boolean stating
    * whether the program should be run in a terminal window.
    *
    * It is only valid for desktop entries with the `Application` type.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val KEY_FILE_DESKTOP_KEY_TERMINAL: String = "Terminal"

  /** A key under %G_KEY_FILE_DESKTOP_GROUP, whose value is a string giving the
    * file name of a binary on disk used to determine if the program is actually
    * installed. It is only valid for desktop entries with the `Application`
    * type.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val KEY_FILE_DESKTOP_KEY_TRY_EXEC: String = "TryExec"

  /** A key under %G_KEY_FILE_DESKTOP_GROUP, whose value is a string giving the
    * type of the desktop entry.
    *
    * Usually %G_KEY_FILE_DESKTOP_TYPE_APPLICATION,
    * %G_KEY_FILE_DESKTOP_TYPE_LINK, or %G_KEY_FILE_DESKTOP_TYPE_DIRECTORY.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val KEY_FILE_DESKTOP_KEY_TYPE: String = "Type"

  /** A key under %G_KEY_FILE_DESKTOP_GROUP, whose value is a string giving the
    * URL to access. It is only valid for desktop entries with the `Link` type.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val KEY_FILE_DESKTOP_KEY_URL: String = "URL"

  /** A key under %G_KEY_FILE_DESKTOP_GROUP, whose value is a string giving the
    * version of the Desktop Entry Specification used for the desktop entry
    * file.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val KEY_FILE_DESKTOP_KEY_VERSION: String = "Version"

  /** The value of the %G_KEY_FILE_DESKTOP_KEY_TYPE, key for desktop entries
    * representing applications.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val KEY_FILE_DESKTOP_TYPE_APPLICATION: String = "Application"

  /** The value of the %G_KEY_FILE_DESKTOP_KEY_TYPE, key for desktop entries
    * representing directories.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val KEY_FILE_DESKTOP_TYPE_DIRECTORY: String = "Directory"

  /** The value of the %G_KEY_FILE_DESKTOP_KEY_TYPE, key for desktop entries
    * representing links to documents.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val KEY_FILE_DESKTOP_TYPE_LINK: String = "Link"

  /** Specifies one of the possible types of byte order. See %G_BYTE_ORDER.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val LITTLE_ENDIAN: Int = 1234

  /** The natural logarithm of 10.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[LN10:]: Cannot represent constant type Type(List(),ListMap(@name -> DataRecord(gdouble), @type -> DataRecord(gdouble))) with raw value `2.302585`"
  )
  private def LN10() = ???

  /** The natural logarithm of 2.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[LN2:]: Cannot represent constant type Type(List(),ListMap(@name -> DataRecord(gdouble), @type -> DataRecord(gdouble))) with raw value `0.693147`"
  )
  private def LN2() = ???

  /** Multiplying the base 2 exponent by this number yields the base 10
    * exponent.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[LOG_2_BASE_10:]: Cannot represent constant type Type(List(),ListMap(@name -> DataRecord(gdouble), @type -> DataRecord(gdouble))) with raw value `0.301030`"
  )
  private def LOG_2_BASE_10() = ???

  /**  Defines the log domain. See [Log Domains](#log-domains).
    *
    *  Libraries should define this so that any messages
    *  which they log can be differentiated from messages from other
    *  libraries and application code. But be careful not to define
    *  it in any public header files.
    *
    *  Log domains must be unique, and it is recommended that they are the
    *  application or library name, optionally followed by a hyphen and a sub-domain
    *  name. For example, `bloatpad` or `bloatpad-io`.
    *
    *  If undefined, it defaults to the default %NULL (or `""`) log domain; this is
    *  not advisable, as it cannot be filtered against using the `G_MESSAGES_DEBUG`
    *  environment variable.
    *
    *  For example, GTK uses this in its `Makefile.am`:
    *  |[
    *  AM_CPPFLAGS = -DG_LOG_DOMAIN=\"Gtk\"
    *  ]|
    *
    *  Applications can choose to leave it as the default %NULL (or `""`)
    *  domain. However, defining the domain offers the same advantages as
    *  above.
    *
    *  NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[LOG_DOMAIN:]: Cannot represent constant type Type(List(),ListMap(@name -> DataRecord(gchar), @type -> DataRecord(gchar))) with raw value `0`"
  )
  private def LOG_DOMAIN() = ???

  /** GLib log levels that are considered fatal by default.
    *
    * This is not used if structured logging is enabled; see [Using Structured
    * Logging][using-structured-logging].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val LOG_FATAL_MASK: Int = 5

  /** Log levels below 1<<G_LOG_LEVEL_USER_SHIFT are used by GLib. Higher bits
    * can be used for user-defined log levels.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val LOG_LEVEL_USER_SHIFT: Int = 8

  /** The major version number of the GLib library.
    *
    * Like #glib_major_version, but from the headers used at application compile
    * time, rather than from the library linked against at application run time.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val MAJOR_VERSION: Int = 2

  /** The maximum value which can be held in a #gint16.
    *
    * This is the same as standard C `INT16_MAX`, which should be preferred in
    * new code.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[MAXINT16:]: Cannot represent constant type Type(List(),ListMap(@name -> DataRecord(gint16), @type -> DataRecord(gint16))) with raw value `32767`"
  )
  private def MAXINT16() = ???

  /** The maximum value which can be held in a #gint32.
    *
    * This is the same as standard C `INT32_MAX`, which should be preferred in
    * new code.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[MAXINT32:]: Cannot represent constant type Type(List(),ListMap(@name -> DataRecord(gint32), @type -> DataRecord(gint32))) with raw value `2147483647`"
  )
  private def MAXINT32() = ???

  /** The maximum value which can be held in a #gint64.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[MAXINT64:]: Cannot represent constant type Type(List(),ListMap(@name -> DataRecord(gint64), @type -> DataRecord(gint64))) with raw value `9223372036854775807`"
  )
  private def MAXINT64() = ???

  /** The maximum value which can be held in a #gint8.
    *
    * This is the same as standard C `INT8_MAX`, which should be preferred in
    * new code.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[MAXINT8:]: Cannot represent constant type Type(List(),ListMap(@name -> DataRecord(gint8), @type -> DataRecord(gint8))) with raw value `127`"
  )
  private def MAXINT8() = ???

  /** The maximum value which can be held in a #guint16.
    *
    * This is the same as standard C `UINT16_MAX`, which should be preferred in
    * new code.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[MAXUINT16:]: Cannot represent constant type Type(List(),ListMap(@name -> DataRecord(guint16), @type -> DataRecord(guint16))) with raw value `65535`"
  )
  private def MAXUINT16() = ???

  /** The maximum value which can be held in a #guint32.
    *
    * This is the same as standard C `UINT32_MAX`, which should be preferred in
    * new code.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[MAXUINT32:]: Cannot represent constant type Type(List(),ListMap(@name -> DataRecord(guint32), @type -> DataRecord(guint32))) with raw value `4294967295`"
  )
  private def MAXUINT32() = ???

  /** The maximum value which can be held in a #guint64.
    *
    * This is the same as standard C `UINT64_MAX`, which should be preferred in
    * new code.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[MAXUINT64:]: Cannot represent constant type Type(List(),ListMap(@name -> DataRecord(guint64), @type -> DataRecord(guint64))) with raw value `18446744073709551615`"
  )
  private def MAXUINT64() = ???

  /** The maximum value which can be held in a #guint8.
    *
    * This is the same as standard C `UINT8_MAX`, which should be preferred in
    * new code.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[MAXUINT8:]: Cannot represent constant type Type(List(),ListMap(@name -> DataRecord(guint8), @type -> DataRecord(guint8))) with raw value `255`"
  )
  private def MAXUINT8() = ???

  /** The micro version number of the GLib library.
    *
    * Like #gtk_micro_version, but from the headers used at application compile
    * time, rather than from the library linked against at application run time.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val MICRO_VERSION: Int = 0

  /** The minimum value which can be held in a #gint16.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[MININT16:]: Cannot represent constant type Type(List(),ListMap(@name -> DataRecord(gint16), @type -> DataRecord(gint16))) with raw value `-32768`"
  )
  private def MININT16() = ???

  /** The minimum value which can be held in a #gint32.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[MININT32:]: Cannot represent constant type Type(List(),ListMap(@name -> DataRecord(gint32), @type -> DataRecord(gint32))) with raw value `-2147483648`"
  )
  private def MININT32() = ???

  /** The minimum value which can be held in a #gint64.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[MININT64:]: Cannot represent constant type Type(List(),ListMap(@name -> DataRecord(gint64), @type -> DataRecord(gint64))) with raw value `-9223372036854775808`"
  )
  private def MININT64() = ???

  /** The minimum value which can be held in a #gint8.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[MININT8:]: Cannot represent constant type Type(List(),ListMap(@name -> DataRecord(gint8), @type -> DataRecord(gint8))) with raw value `-128`"
  )
  private def MININT8() = ???

  /** The minor version number of the GLib library.
    *
    * Like #gtk_minor_version, but from the headers used at application compile
    * time, rather than from the library linked against at application run time.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val MINOR_VERSION: Int = 78
  final val MODULE_SUFFIX: String = "so"

  /** If a long option in the main group has this name, it is not treated as a
    * regular option. Instead it collects all non-option arguments which would
    * otherwise be left in `argv`. The option must be of type
    * %G_OPTION_ARG_CALLBACK, %G_OPTION_ARG_STRING_ARRAY or
    * %G_OPTION_ARG_FILENAME_ARRAY.
    *
    * Using %G_OPTION_REMAINING instead of simply scanning `argv` for leftover
    * arguments has the advantage that GOption takes care of necessary encoding
    * conversions for strings or filenames.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val OPTION_REMAINING: String = ""

  /** Specifies one of the possible types of byte order (currently unused). See
    * %G_BYTE_ORDER.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val PDP_ENDIAN: Int = 3412

  /** The value of pi (ratio of circle's circumference to its diameter).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[PI:]: Cannot represent constant type Type(List(),ListMap(@name -> DataRecord(gdouble), @type -> DataRecord(gdouble))) with raw value `3.141593`"
  )
  private def PI() = ???

  /** A format specifier that can be used in printf()-style format strings when
    * printing a #GPid.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val PID_FORMAT: String = "i"

  /** Pi divided by 2.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[PI_2:]: Cannot represent constant type Type(List(),ListMap(@name -> DataRecord(gdouble), @type -> DataRecord(gdouble))) with raw value `1.570796`"
  )
  private def PI_2() = ???

  /** Pi divided by 4.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[PI_4:]: Cannot represent constant type Type(List(),ListMap(@name -> DataRecord(gdouble), @type -> DataRecord(gdouble))) with raw value `0.785398`"
  )
  private def PI_4() = ???

  /** A format specifier that can be used in printf()-style format strings when
    * printing the @fd member of a #GPollFD.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val POLLFD_FORMAT: String = "%d"

  /** Use this for default priority event sources.
    *
    * In GLib this priority is used when adding timeout functions with
    * g_timeout_add(). In GDK this priority is used for events from the X
    * server.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val PRIORITY_DEFAULT: Int = 0

  /** Use this for default priority idle functions.
    *
    * In GLib this priority is used when adding idle functions with
    * g_idle_add().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val PRIORITY_DEFAULT_IDLE: Int = 200

  /** Use this for high priority event sources.
    *
    * It is not used within GLib or GTK.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val PRIORITY_HIGH: Int = -100

  /** Use this for high priority idle functions.
    *
    * GTK uses %G_PRIORITY_HIGH_IDLE + 10 for resizing operations, and
    * %G_PRIORITY_HIGH_IDLE + 20 for redrawing operations. (This is done to
    * ensure that any pending resizes are processed before any pending redraws,
    * so that widgets are not redrawn twice unnecessarily.)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val PRIORITY_HIGH_IDLE: Int = 100

  /** Use this for very low priority background tasks.
    *
    * It is not used within GLib or GTK.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val PRIORITY_LOW: Int = 300

  /**  Evaluates to the initial reference count for `grefcount`.
    *
    *  This macro is useful for initializing `grefcount` fields inside
    *  structures, for instance:
    *
    *  |[<!-- language="C" -->
    *  typedef struct {
    *    grefcount ref_count;
    *    char *name;
    *    char *address;
    *  } Person;
    *
    *  static const Person default_person = {
    *    .ref_count = G_REF_COUNT_INIT,
    *    .name = "Default name",
    *    .address = "Default address",
    *  };
    *  ]|
    *
    *  NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT BE APPLICABLE TO SCALA
    */
  final val REF_COUNT_INIT: Int = -1

  /** The search path separator character. This is ':' on UNIX machines and ';'
    * under Windows.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val SEARCHPATH_SEPARATOR: Int = 58

  /** The search path separator as a string. This is ":" on UNIX machines and
    * ";" under Windows.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val SEARCHPATH_SEPARATOR_S: String = ":"
  final val SIZEOF_LONG: Int = 8
  final val SIZEOF_SIZE_T: Int = 8
  final val SIZEOF_SSIZE_T: Int = 8
  final val SIZEOF_VOID_P: Int = 8

  /** Use this macro as the return value of a #GSourceFunc to leave the #GSource
    * in the main loop.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val SOURCE_CONTINUE: Boolean = true

  /** Use this macro as the return value of a #GSourceFunc to remove the
    * #GSource from the main loop.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val SOURCE_REMOVE: Boolean = false

  /** The square root of two.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[SQRT2:]: Cannot represent constant type Type(List(),ListMap(@name -> DataRecord(gdouble), @type -> DataRecord(gdouble))) with raw value `1.414214`"
  )
  private def SQRT2() = ???

  /** The standard delimiters, used in g_strdelimit().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val STR_DELIMITERS: String = "_-|> <."
  final val SYSDEF_AF_INET: Int = 2
  final val SYSDEF_AF_INET6: Int = 10
  final val SYSDEF_AF_UNIX: Int = 1
  final val SYSDEF_MSG_DONTROUTE: Int = 4
  final val SYSDEF_MSG_OOB: Int = 1
  final val SYSDEF_MSG_PEEK: Int = 2

  /** Creates a unique temporary directory for each unit test and uses
    * g_set_user_dirs() to set XDG directories to point into subdirectories of
    * it for the duration of the unit test. The directory tree is cleaned up
    * after the test finishes successfully. Note that this doesn’t take effect
    * until g_test_run() is called, so calls to (for example)
    * g_get_user_home_dir() will return the system-wide value when made in a
    * test program’s main() function.
    *
    * The following functions will return subdirectories of the temporary
    * directory when this option is used. The specific subdirectory paths in use
    * are not guaranteed to be stable API — always use a getter function to
    * retrieve them.
    *
    *   - g_get_home_dir()
    *   - g_get_user_cache_dir()
    *   - g_get_system_config_dirs()
    *   - g_get_user_config_dir()
    *   - g_get_system_data_dirs()
    *   - g_get_user_data_dir()
    *   - g_get_user_state_dir()
    *   - g_get_user_runtime_dir()
    *
    * The subdirectories may not be created by the test harness; as with normal
    * calls to functions like g_get_user_cache_dir(), the caller must be
    * prepared to create the directory if it doesn’t exist.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val TEST_OPTION_ISOLATE_DIRS: String = "isolate_dirs"

  /** Evaluates to a time span of one day.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[TIME_SPAN_DAY:]: Cannot represent constant type Type(List(),ListMap(@name -> DataRecord(gint64), @type -> DataRecord(gint64))) with raw value `86400000000`"
  )
  private def TIME_SPAN_DAY() = ???

  /** Evaluates to a time span of one hour.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[TIME_SPAN_HOUR:]: Cannot represent constant type Type(List(),ListMap(@name -> DataRecord(gint64), @type -> DataRecord(gint64))) with raw value `3600000000`"
  )
  private def TIME_SPAN_HOUR() = ???

  /** Evaluates to a time span of one millisecond.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[TIME_SPAN_MILLISECOND:]: Cannot represent constant type Type(List(),ListMap(@name -> DataRecord(gint64), @type -> DataRecord(gint64))) with raw value `1000`"
  )
  private def TIME_SPAN_MILLISECOND() = ???

  /** Evaluates to a time span of one minute.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[TIME_SPAN_MINUTE:]: Cannot represent constant type Type(List(),ListMap(@name -> DataRecord(gint64), @type -> DataRecord(gint64))) with raw value `60000000`"
  )
  private def TIME_SPAN_MINUTE() = ???

  /** Evaluates to a time span of one second.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[TIME_SPAN_SECOND:]: Cannot represent constant type Type(List(),ListMap(@name -> DataRecord(gint64), @type -> DataRecord(gint64))) with raw value `1000000`"
  )
  private def TIME_SPAN_SECOND() = ???

  /** The maximum length (in codepoints) of a compatibility or canonical
    * decomposition of a single Unicode character.
    *
    * This is as defined by Unicode 6.1.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val UNICHAR_MAX_DECOMPOSITION_LENGTH: Int = 18

  /** Generic delimiters characters as defined in [RFC
    * 3986](https://tools.ietf.org/html/rfc3986). Includes `:/?#[]@`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val URI_RESERVED_CHARS_GENERIC_DELIMITERS: String = ":/?#[]@"

  /** Subcomponent delimiter characters as defined in [RFC
    * 3986](https://tools.ietf.org/html/rfc3986). Includes `!$&'()*+,;=`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val URI_RESERVED_CHARS_SUBCOMPONENT_DELIMITERS: String = "!$&'()*+,;="

  /** Number of microseconds in one second (1 million). This macro is provided
    * for code readability.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val USEC_PER_SEC: Int = 1000000
  final val VA_COPY_AS_ARRAY: Int = 1

  /** A macro that should be defined by the user prior to including the glib.h
    * header. The definition should be one of the predefined GLib version
    * macros: %GLIB_VERSION_2_26, %GLIB_VERSION_2_28,...
    *
    * This macro defines the earliest version of GLib that the package is
    * required to be able to compile against.
    *
    * If the compiler is configured to warn about the use of deprecated
    * functions, then using functions that were deprecated in version
    * %GLIB_VERSION_MIN_REQUIRED or earlier will cause warnings (but using
    * functions deprecated in later releases will not).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val VERSION_MIN_REQUIRED: Int = 2
  final val WIN32_MSG_HANDLE: Int = 19981206
  final val macro__has_attribute___noreturn__ : Int = 0
end GLib
