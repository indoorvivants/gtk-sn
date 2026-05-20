package sn.gnome.glib

import _root_.sn.gnome.glib.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.{
  Bytes,
  String,
  Variant,
  VariantClass,
  VariantIter,
  VariantType
}
import sn.gnome.glib.internal.{
  GVariant,
  gboolean,
  gchar,
  gconstpointer,
  gdouble,
  gint,
  gint16,
  gint32,
  gint64,
  gpointer,
  gsize,
  guint,
  guint16,
  guint32,
  guint64,
  guint8
}

/**  #GVariant is a variant datatype; it can contain one or more values
  *  along with information about the type of the values.
  *
  *  A #GVariant may contain simple types, like an integer, or a boolean value;
  *  or complex types, like an array of two strings, or a dictionary of key
  *  value pairs. A #GVariant is also immutable: once it's been created neither
  *  its type nor its content can be modified further.
  *
  *  GVariant is useful whenever data needs to be serialized, for example when
  *  sending method parameters in D-Bus, or when saving settings using GSettings.
  *
  *  When creating a new #GVariant, you pass the data you want to store in it
  *  along with a string representing the type of data you wish to pass to it.
  *
  *  For instance, if you want to create a #GVariant holding an integer value you
  *  can use:
  *
  *  |[<!-- language="C" -->
  *    GVariant *v = g_variant_new ("u", 40);
  *  ]|
  *
  *  The string "u" in the first argument tells #GVariant that the data passed to
  *  the constructor (40) is going to be an unsigned integer.
  *
  *  More advanced examples of #GVariant in use can be found in documentation for
  *  [GVariant format strings][gvariant-format-strings-pointers].
  *
  *  The range of possible values is determined by the type.
  *
  *  The type system used by #GVariant is #GVariantType.
  *
  *  #GVariant instances always have a type and a value (which are given
  *  at construction time).  The type and value of a #GVariant instance
  *  can never change other than by the #GVariant itself being
  *  destroyed.  A #GVariant cannot contain a pointer.
  *
  *  #GVariant is reference counted using g_variant_ref() and
  *  g_variant_unref().  #GVariant also has floating reference counts --
  *  see g_variant_ref_sink().
  *
  *  #GVariant is completely threadsafe.  A #GVariant instance can be
  *  concurrently accessed in any way from any number of threads without
  *  problems.
  *
  *  #GVariant is heavily optimised for dealing with data in serialized
  *  form.  It works particularly well with data located in memory-mapped
  *  files.  It can perform nearly all deserialization operations in a
  *  small constant time, usually touching only a single memory page.
  *  Serialized #GVariant data can also be sent over the network.
  *
  *  #GVariant is largely compatible with D-Bus.  Almost all types of
  *  #GVariant instances can be sent over D-Bus.  See #GVariantType for
  *  exceptions.  (However, #GVariant's serialization format is not the same
  *  as the serialization format of a D-Bus message body: use #GDBusMessage,
  *  in the gio library, for those.)
  *
  *  For space-efficiency, the #GVariant serialization format does not
  *  automatically include the variant's length, type or endianness,
  *  which must either be implied from context (such as knowledge that a
  *  particular file format always contains a little-endian
  *  %G_VARIANT_TYPE_VARIANT which occupies the whole length of the file)
  *  or supplied out-of-band (for instance, a length, type and/or endianness
  *  indicator could be placed at the beginning of a file, network message
  *  or network stream).
  *
  *  A #GVariant's size is limited mainly by any lower level operating
  *  system constraints, such as the number of bits in #gsize.  For
  *  example, it is reasonable to have a 2GB file mapped into memory
  *  with #GMappedFile, and call g_variant_new_from_data() on it.
  *
  *  For convenience to C programmers, #GVariant features powerful
  *  varargs-based value construction and destruction.  This feature is
  *  designed to be embedded in other libraries.
  *
  *  There is a Python-inspired text language for describing #GVariant
  *  values.  #GVariant includes a printer for this language and a parser
  *  with type inferencing.
  *
  *  ## Memory Use
  *
  *  #GVariant tries to be quite efficient with respect to memory use.
  *  This section gives a rough idea of how much memory is used by the
  *  current implementation.  The information here is subject to change
  *  in the future.
  *
  *  The memory allocated by #GVariant can be grouped into 4 broad
  *  purposes: memory for serialized data, memory for the type
  *  information cache, buffer management memory and memory for the
  *  #GVariant structure itself.
  *
  *  ## Serialized Data Memory
  *
  *  This is the memory that is used for storing GVariant data in
  *  serialized form.  This is what would be sent over the network or
  *  what would end up on disk, not counting any indicator of the
  *  endianness, or of the length or type of the top-level variant.
  *
  *  The amount of memory required to store a boolean is 1 byte. 16,
  *  32 and 64 bit integers and double precision floating point numbers
  *  use their "natural" size.  Strings (including object path and
  *  signature strings) are stored with a nul terminator, and as such
  *  use the length of the string plus 1 byte.
  *
  *  Maybe types use no space at all to represent the null value and
  *  use the same amount of space (sometimes plus one byte) as the
  *  equivalent non-maybe-typed value to represent the non-null case.
  *
  *  Arrays use the amount of space required to store each of their
  *  members, concatenated.  Additionally, if the items stored in an
  *  array are not of a fixed-size (ie: strings, other arrays, etc)
  *  then an additional framing offset is stored for each item.  The
  *  size of this offset is either 1, 2 or 4 bytes depending on the
  *  overall size of the container.  Additionally, extra padding bytes
  *  are added as required for alignment of child values.
  *
  *  Tuples (including dictionary entries) use the amount of space
  *  required to store each of their members, concatenated, plus one
  *  framing offset (as per arrays) for each non-fixed-sized item in
  *  the tuple, except for the last one.  Additionally, extra padding
  *  bytes are added as required for alignment of child values.
  *
  *  Variants use the same amount of space as the item inside of the
  *  variant, plus 1 byte, plus the length of the type string for the
  *  item inside the variant.
  *
  *  As an example, consider a dictionary mapping strings to variants.
  *  In the case that the dictionary is empty, 0 bytes are required for
  *  the serialization.
  *
  *  If we add an item "width" that maps to the int32 value of 500 then
  *  we will use 4 byte to store the int32 (so 6 for the variant
  *  containing it) and 6 bytes for the string.  The variant must be
  *  aligned to 8 after the 6 bytes of the string, so that's 2 extra
  *  bytes.  6 (string) + 2 (padding) + 6 (variant) is 14 bytes used
  *  for the dictionary entry.  An additional 1 byte is added to the
  *  array as a framing offset making a total of 15 bytes.
  *
  *  If we add another entry, "title" that maps to a nullable string
  *  that happens to have a value of null, then we use 0 bytes for the
  *  null value (and 3 bytes for the variant to contain it along with
  *  its type string) plus 6 bytes for the string.  Again, we need 2
  *  padding bytes.  That makes a total of 6 + 2 + 3 = 11 bytes.
  *
  *  We now require extra padding between the two items in the array.
  *  After the 14 bytes of the first item, that's 2 bytes required.
  *  We now require 2 framing offsets for an extra two
  *  bytes. 14 + 2 + 11 + 2 = 29 bytes to encode the entire two-item
  *  dictionary.
  *
  *  ## Type Information Cache
  *
  *  For each GVariant type that currently exists in the program a type
  *  information structure is kept in the type information cache.  The
  *  type information structure is required for rapid deserialization.
  *
  *  Continuing with the above example, if a #GVariant exists with the
  *  type "a{sv}" then a type information struct will exist for
  *  "a{sv}", "{sv}", "s", and "v".  Multiple uses of the same type
  *  will share the same type information.  Additionally, all
  *  single-digit types are stored in read-only static memory and do
  *  not contribute to the writable memory footprint of a program using
  *  #GVariant.
  *
  *  Aside from the type information structures stored in read-only
  *  memory, there are two forms of type information.  One is used for
  *  container types where there is a single element type: arrays and
  *  maybe types.  The other is used for container types where there
  *  are multiple element types: tuples and dictionary entries.
  *
  *  Array type info structures are 6 * sizeof (void *), plus the
  *  memory required to store the type string itself.  This means that
  *  on 32-bit systems, the cache entry for "a{sv}" would require 30
  *  bytes of memory (plus malloc overhead).
  *
  *  Tuple type info structures are 6 * sizeof (void *), plus 4 *
  *  sizeof (void *) for each item in the tuple, plus the memory
  *  required to store the type string itself.  A 2-item tuple, for
  *  example, would have a type information structure that consumed
  *  writable memory in the size of 14 * sizeof (void *) (plus type
  *  string)  This means that on 32-bit systems, the cache entry for
  *  "{sv}" would require 61 bytes of memory (plus malloc overhead).
  *
  *  This means that in total, for our "a{sv}" example, 91 bytes of
  *  type information would be allocated.
  *
  *  The type information cache, additionally, uses a #GHashTable to
  *  store and look up the cached items and stores a pointer to this
  *  hash table in static storage.  The hash table is freed when there
  *  are zero items in the type cache.
  *
  *  Although these sizes may seem large it is important to remember
  *  that a program will probably only have a very small number of
  *  different types of values in it and that only one type information
  *  structure is required for many different values of the same type.
  *
  *  ## Buffer Management Memory
  *
  *  #GVariant uses an internal buffer management structure to deal
  *  with the various different possible sources of serialized data
  *  that it uses.  The buffer is responsible for ensuring that the
  *  correct call is made when the data is no longer in use by
  *  #GVariant.  This may involve a g_free() or a g_slice_free() or
  *  even g_mapped_file_unref().
  *
  *  One buffer management structure is used for each chunk of
  *  serialized data.  The size of the buffer management structure
  *  is 4 * (void *).  On 32-bit systems, that's 16 bytes.
  *
  *  ## GVariant structure
  *
  *  The size of a #GVariant structure is 6 * (void *).  On 32-bit
  *  systems, that's 24 bytes.
  *
  *  #GVariant structures only exist if they are explicitly created
  *  with API calls.  For example, if a #GVariant is constructed out of
  *  serialized data for the example given above (with the dictionary)
  *  then although there are 9 individual values that comprise the
  *  entire dictionary (two keys, two values, two variants containing
  *  the values, two dictionary entries, plus the dictionary itself),
  *  only 1 #GVariant instance exists -- the one referring to the
  *  dictionary.
  *
  *  If calls are made to start accessing the other values then
  *  #GVariant instances will exist for those values only for as long
  *  as they are in use (ie: until you call g_variant_unref()).  The
  *  type information is shared.  The serialized data and the buffer
  *  management structure for that serialized data is shared by the
  *  child.
  *
  *  ## Summary
  *
  *  To put the entire example together, for our dictionary mapping
  *  strings to variants (with two entries, as given above), we are
  *  using 91 bytes of memory for type information, 29 bytes of memory
  *  for the serialized data, 16 bytes for buffer management and 24
  *  bytes for the #GVariant instance, or a total of 160 bytes, plus
  *  malloc overhead.  If we were to use g_variant_get_child_value() to
  *  access the two dictionary entries, we would use an additional 48
  *  bytes.  If we were to have other dictionaries of the same type, we
  *  would use more memory for the serialized data and buffer
  *  management for those dictionaries, but the type information would
  *  be shared.
  *
  *  NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT BE APPLICABLE TO SCALA
  */
class Variant private[gnome] (raw: Ptr[GVariant]):

  def getUnsafeRawPointer(): Ptr[GVariant] = this.raw

  /** Performs a byteswapping operation on the contents of @value. The result is
    * that all multi-byte numeric data contained in @value is byteswapped. That
    * includes 16, 32, and 64bit signed and unsigned integers as well as file
    * handles and double precision floating point values.
    *
    * This function is an identity mapping on any value that does not contain
    * multi-byte numeric data. That include strings, booleans, bytes and
    * containers containing only these things (recursively).
    *
    * While this function can safely handle untrusted, non-normal data, it is
    * recommended to check whether the input is in normal form beforehand, using
    * g_variant_is_normal_form(), and to reject non-normal inputs if your
    * application can be strict about what inputs it rejects.
    *
    * The returned value is always in normal form and is marked as trusted. A
    * full, not floating, reference is returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def byteswap(): sn.gnome.glib.Variant /* None */ =
    sn.gnome.glib.Variant.fromRaw(
      g_variant_byteswap(this.getUnsafeRawPointer().asInstanceOf[Ptr[GVariant]])
    )
  end byteswap

  /** Checks if calling g_variant_get() with @format_string on @value would be
    * valid from a type-compatibility standpoint. @format_string is assumed to
    * be a valid format string (from a syntactic standpoint).
    *
    * If @copy_only is %TRUE then this function additionally checks that it
    * would be safe to call g_variant_unref() on @value immediately after the
    * call to g_variant_get() without invalidating the result. This is only
    * possible if deep copies are made (ie: there are no pointers to the data
    * inside of the soon-to-be-freed #GVariant instance). If this check fails
    * then a g_critical() is printed and %FALSE is returned.
    *
    * This function is meant to be used by functions that wish to provide
    * varargs accessors to #GVariant values of uncertain values (eg:
    * g_variant_lookup() or g_menu_model_get_item_attribute()).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def checkFormatString(
      format_string: scala.Predef.String /* Some(Ptr[gchar]) */,
      copy_only: Boolean /* Some(gboolean) */
  )(using Zone): Boolean /* None */ =
    g_variant_check_format_string(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GVariant]],
      toCString(format_string).asInstanceOf[Ptr[gchar]],
      gboolean(gint((if copy_only == true then 1 else 0)))
    ).value.!=(0)
  end checkFormatString

  /** Classifies @value according to its top-level type.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def classify(): sn.gnome.glib.VariantClass /* None */ =
    sn.gnome.glib.VariantClass.fromRaw(
      g_variant_classify(this.getUnsafeRawPointer().asInstanceOf[Ptr[GVariant]])
    )
  end classify

  /** Compares @one and @two.
    *
    * The types of @one and @two are #gconstpointer only to allow use of this
    * function with #GTree, #GPtrArray, etc. They must each be a #GVariant.
    *
    * Comparison is only defined for basic types (ie: booleans, numbers,
    * strings). For booleans, %FALSE is less than %TRUE. Numbers are ordered in
    * the usual way. Strings are in ASCII lexographical order.
    *
    * It is a programmer error to attempt to compare container values or two
    * values that have types that are not exactly equal. For example, you cannot
    * compare a 32-bit signed integer with a 32-bit unsigned integer. Also note
    * that this function is not particularly well-behaved when it comes to
    * comparison of doubles; in particular, the handling of incomparable values
    * (ie: NaN) is undefined.
    *
    * If you only require an equality comparison, g_variant_equal() is more
    * general.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def compare(
      two: sn.gnome.glib.Variant /* Some(gconstpointer) */
  ): Int /* None */ =
    g_variant_compare(
      this.getUnsafeRawPointer().asInstanceOf[gconstpointer],
      two.getUnsafeRawPointer().asInstanceOf
    ).value
  end compare

  /** Similar to g_variant_get_bytestring() except that instead of returning a
    * constant string, the string is duplicated.
    *
    * The return value must be freed using g_free().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method dup_bytestring]: Method dup_bytestring contains an OUT parameter, which is not supported yet"
  )
  private def dupBytestring__ = ???

  /** Gets the contents of an array of array of bytes #GVariant. This call makes
    * a deep copy; the return result should be released with g_strfreev().
    *
    * If @length is non-%NULL then the number of elements in the result is
    * stored there. In any case, the resulting array will be %NULL-terminated.
    *
    * For an empty array, @length will be set to 0 and a pointer to a %NULL
    * pointer will be returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method dup_bytestring_array]: Method dup_bytestring_array contains an OUT parameter, which is not supported yet"
  )
  private def dupBytestringArray__ = ???

  /** Gets the contents of an array of object paths #GVariant. This call makes a
    * deep copy; the return result should be released with g_strfreev().
    *
    * If @length is non-%NULL then the number of elements in the result is
    * stored there. In any case, the resulting array will be %NULL-terminated.
    *
    * For an empty array, @length will be set to 0 and a pointer to a %NULL
    * pointer will be returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method dup_objv]: Method dup_objv contains an OUT parameter, which is not supported yet"
  )
  private def dupObjv__ = ???

  /** Similar to g_variant_get_string() except that instead of returning a
    * constant string, the string is duplicated.
    *
    * The string will always be UTF-8 encoded.
    *
    * The return value must be freed using g_free().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method dup_string]: Method dup_string contains an OUT parameter, which is not supported yet"
  )
  private def dupString__ = ???

  /** Gets the contents of an array of strings #GVariant. This call makes a deep
    * copy; the return result should be released with g_strfreev().
    *
    * If @length is non-%NULL then the number of elements in the result is
    * stored there. In any case, the resulting array will be %NULL-terminated.
    *
    * For an empty array, @length will be set to 0 and a pointer to a %NULL
    * pointer will be returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method dup_strv]: Method dup_strv contains an OUT parameter, which is not supported yet"
  )
  private def dupStrv__ = ???

  /** Checks if @one and @two have the same type and value.
    *
    * The types of @one and @two are #gconstpointer only to allow use of this
    * function with #GHashTable. They must each be a #GVariant.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def equal(
      two: sn.gnome.glib.Variant /* Some(gconstpointer) */
  ): Boolean /* None */ =
    g_variant_equal(
      this.getUnsafeRawPointer().asInstanceOf[gconstpointer],
      two.getUnsafeRawPointer().asInstanceOf
    ).value.!=(0)
  end equal

  /** Deconstructs a #GVariant instance.
    *
    * Think of this function as an analogue to scanf().
    *
    * The arguments that are expected by this function are entirely determined
    * by @format_string. @format_string also restricts the permissible types of @value.
    * It is an error to give a value with an incompatible type. See the section
    * on [GVariant format strings][gvariant-format-strings]. Please note that
    * the syntax of the format string is very likely to be extended in the
    * future.
    *
    * @format_string
    *   determines the C types that are used for unpacking the values and also
    *   determines if the values are copied or borrowed, see the section on
    *   [GVariant format strings][gvariant-format-strings-pointers].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get/<method parameters>]: Vararg parameters require inlining which doesn't work with overriding"
  )
  private def get__ = ???

  /** Returns the boolean value of @value.
    *
    * It is an error to call this function with a @value of any type other than
    * %G_VARIANT_TYPE_BOOLEAN.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getBoolean(): Boolean /* None */ =
    g_variant_get_boolean(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GVariant]]
    ).value.!=(0)
  end getBoolean

  /** Returns the byte value of @value.
    *
    * It is an error to call this function with a @value of any type other than
    * %G_VARIANT_TYPE_BYTE.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getByte(): UByte /* None */ =
    g_variant_get_byte(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GVariant]]
    ).value
  end getByte

  /** Returns the string value of a #GVariant instance with an array-of-bytes
    * type. The string has no particular encoding.
    *
    * If the array does not end with a nul terminator character, the empty
    * string is returned. For this reason, you can always trust that a non-%NULL
    * nul-terminated string will be returned by this function.
    *
    * If the array contains a nul terminator character somewhere other than the
    * last byte then the returned string is the string, up to the first such nul
    * character.
    *
    * g_variant_get_fixed_array() should be used instead if the array contains
    * arbitrary data that could not be nul-terminated or could contain nul
    * bytes.
    *
    * It is an error to call this function with a @value that is not an array of
    * bytes.
    *
    * The return value remains valid as long as @value exists.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_bytestring/return type]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(guint8)))),ListMap(@type -> DataRecord(const gchar*)))"
  )
  private def getBytestring__ = ???

  /** Gets the contents of an array of array of bytes #GVariant. This call makes
    * a shallow copy; the return result should be released with g_free(), but
    * the individual strings must not be modified.
    *
    * If @length is non-%NULL then the number of elements in the result is
    * stored there. In any case, the resulting array will be %NULL-terminated.
    *
    * For an empty array, @length will be set to 0 and a pointer to a %NULL
    * pointer will be returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_bytestring_array]: Method get_bytestring_array contains an OUT parameter, which is not supported yet"
  )
  private def getBytestringArray__ = ???

  /** Reads a child item out of a container #GVariant instance and deconstructs
    * it according to @format_string. This call is essentially a combination of
    * g_variant_get_child_value() and g_variant_get().
    *
    * @format_string
    *   determines the C types that are used for unpacking the values and also
    *   determines if the values are copied or borrowed, see the section on
    *   [GVariant format strings][gvariant-format-strings-pointers].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_child/<method parameters>]: Vararg parameters require inlining which doesn't work with overriding"
  )
  private def getChild__ = ???

  /** Reads a child item out of a container #GVariant instance. This includes
    * variants, maybes, arrays, tuples and dictionary entries. It is an error to
    * call this function on any other type of #GVariant.
    *
    * It is an error if @index_ is greater than the number of child items in the
    * container. See g_variant_n_children().
    *
    * The returned value is never floating. You should free it with
    * g_variant_unref() when you're done with it.
    *
    * Note that values borrowed from the returned child are not guaranteed to
    * still be valid after the child is freed even if you still hold a reference
    * to @value, if @value has not been serialized at the time this function is
    * called. To avoid this, you can serialize @value by calling
    * g_variant_get_data() and optionally ignoring the return value.
    *
    * There may be implementation specific restrictions on deeply nested values,
    * which would result in the unit tuple being returned as the child value,
    * instead of further nested children. #GVariant is guaranteed to handle
    * nesting up to at least 64 levels.
    *
    * This function is O(1).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getChildValue(
      `index_`: CUnsignedLongInt /* Some(gsize) */
  ): sn.gnome.glib.Variant /* None */ =
    sn.gnome.glib.Variant.fromRaw(
      g_variant_get_child_value(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GVariant]],
        gsize(`index_`)
      )
    )
  end getChildValue

  /** Returns a pointer to the serialized form of a #GVariant instance. The
    * returned data may not be in fully-normalised form if read from an
    * untrusted source. The returned data must not be freed; it remains valid
    * for as long as @value exists.
    *
    * If @value is a fixed-sized value that was deserialized from a corrupted
    * serialized container then %NULL may be returned. In this case, the proper
    * thing to do is typically to use the appropriate number of nul bytes in
    * place of @value. If @value is not fixed-sized then %NULL is never
    * returned.
    *
    * In the case that @value is already in serialized form, this function is
    * O(1). If the value is not already in serialized form, serialization occurs
    * implicitly and is approximately O(n) in the size of the result.
    *
    * To deserialize the data returned by this function, in addition to the
    * serialized data, you must know the type of the #GVariant, and (if the
    * machine might be different) the endianness of the machine that stored it.
    * As a result, file formats or network messages that incorporate serialized
    * #GVariants must include this information either implicitly (for instance
    * "the file always contains a %G_VARIANT_TYPE_VARIANT and it is always in
    * little-endian order") or explicitly (by storing the type and/or endianness
    * in addition to the serialized data).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getData(): Ptr[Byte] /* None */ =
    g_variant_get_data(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GVariant]]
    ).value
  end getData

  /** Returns a pointer to the serialized form of a #GVariant instance. The
    * semantics of this function are exactly the same as g_variant_get_data(),
    * except that the returned #GBytes holds a reference to the variant data.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDataAsBytes(): sn.gnome.glib.Bytes /* None */ =
    sn.gnome.glib.Bytes.fromRaw(
      g_variant_get_data_as_bytes(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GVariant]]
      )
    )
  end getDataAsBytes

  /** Returns the double precision floating point value of @value.
    *
    * It is an error to call this function with a @value of any type other than
    * %G_VARIANT_TYPE_DOUBLE.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDouble(): Double /* None */ =
    g_variant_get_double(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GVariant]]
    ).value
  end getDouble

  /** Provides access to the serialized data for an array of fixed-sized items.
    *
    * @value
    *   must be an array with fixed-sized elements. Numeric types are
    *   fixed-size, as are tuples containing only other fixed-sized types.
    *
    * @element_size
    *   must be the size of a single element in the array, as given by the
    *   section on [serialized data memory][gvariant-serialized-data-memory].
    *
    * In particular, arrays of these fixed-sized types can be interpreted as an
    * array of the given C type, with @element_size set to the size the
    * appropriate type:
    *   - %G_VARIANT_TYPE_INT16 (etc.): #gint16 (etc.)
    *   - %G_VARIANT_TYPE_BOOLEAN: #guchar (not #gboolean!)
    *   - %G_VARIANT_TYPE_BYTE: #guint8
    *   - %G_VARIANT_TYPE_HANDLE: #guint32
    *   - %G_VARIANT_TYPE_DOUBLE: #gdouble
    *
    * For example, if calling this function for an array of 32-bit integers, you
    * might say `sizeof(gint32)`. This value isn't used except for the purpose
    * of a double-check that the form of the serialized data matches the
    * caller's expectation.
    *
    * @n_elements,
    *   which must be non-%NULL, is set equal to the number of items in the
    *   array.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_fixed_array]: Method get_fixed_array contains an OUT parameter, which is not supported yet"
  )
  private def getFixedArray__ = ???

  /** Returns the 32-bit signed integer value of @value.
    *
    * It is an error to call this function with a @value of any type other than
    * %G_VARIANT_TYPE_HANDLE.
    *
    * By convention, handles are indexes into an array of file descriptors that
    * are sent alongside a D-Bus message. If you're not interacting with D-Bus,
    * you probably don't need them.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getHandle(): CInt /* None */ =
    g_variant_get_handle(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GVariant]]
    ).value
  end getHandle

  /** Returns the 16-bit signed integer value of @value.
    *
    * It is an error to call this function with a @value of any type other than
    * %G_VARIANT_TYPE_INT16.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getInt16(): CShort /* None */ =
    g_variant_get_int16(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GVariant]]
    ).value
  end getInt16

  /** Returns the 32-bit signed integer value of @value.
    *
    * It is an error to call this function with a @value of any type other than
    * %G_VARIANT_TYPE_INT32.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getInt32(): CInt /* None */ =
    g_variant_get_int32(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GVariant]]
    ).value
  end getInt32

  /** Returns the 64-bit signed integer value of @value.
    *
    * It is an error to call this function with a @value of any type other than
    * %G_VARIANT_TYPE_INT64.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getInt64(): CLongInt /* None */ =
    g_variant_get_int64(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GVariant]]
    ).value
  end getInt64

  /** Given a maybe-typed #GVariant instance, extract its value. If the value is
    * Nothing, then this function returns %NULL.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getMaybe(): sn.gnome.glib.Variant /* None */ =
    sn.gnome.glib.Variant.fromRaw(
      g_variant_get_maybe(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GVariant]]
      )
    )
  end getMaybe

  /** Gets a #GVariant instance that has the same value as @value and is trusted
    * to be in normal form.
    *
    * If @value is already trusted to be in normal form then a new reference to @value
    * is returned.
    *
    * If @value is not already trusted, then it is scanned to check if it is in
    * normal form. If it is found to be in normal form then it is marked as
    * trusted and a new reference to it is returned.
    *
    * If @value is found not to be in normal form then a new trusted #GVariant
    * is created with the same value as @value. The non-normal parts of
    * @value
    *   will be replaced with default values which are guaranteed to be in
    *   normal form.
    *
    * It makes sense to call this function if you've received #GVariant data
    * from untrusted sources and you want to ensure your serialized output is
    * definitely in normal form.
    *
    * If @value is already in normal form, a new reference will be returned
    * (which will be floating if @value is floating). If it is not in normal
    * form, the newly created #GVariant will be returned with a single
    * non-floating reference. Typically, g_variant_take_ref() should be called
    * on the return value from this function to guarantee ownership of a single
    * non-floating reference to it.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getNormalForm(): sn.gnome.glib.Variant /* None */ =
    sn.gnome.glib.Variant.fromRaw(
      g_variant_get_normal_form(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GVariant]]
      )
    )
  end getNormalForm

  /** Gets the contents of an array of object paths #GVariant. This call makes a
    * shallow copy; the return result should be released with g_free(), but the
    * individual strings must not be modified.
    *
    * If @length is non-%NULL then the number of elements in the result is
    * stored there. In any case, the resulting array will be %NULL-terminated.
    *
    * For an empty array, @length will be set to 0 and a pointer to a %NULL
    * pointer will be returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_objv]: Method get_objv contains an OUT parameter, which is not supported yet"
  )
  private def getObjv__ = ???

  /** Determines the number of bytes that would be required to store @value with
    * g_variant_store().
    *
    * If @value has a fixed-sized type then this function always returned that
    * fixed size.
    *
    * In the case that @value is already in serialized form or the size has
    * already been calculated (ie: this function has been called before) then
    * this function is O(1). Otherwise, the size is calculated, an operation
    * which is approximately O(n) in the number of values involved.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSize(): CUnsignedLongInt /* None */ =
    g_variant_get_size(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GVariant]]
    ).value
  end getSize

  /** Returns the string value of a #GVariant instance with a string type. This
    * includes the types %G_VARIANT_TYPE_STRING, %G_VARIANT_TYPE_OBJECT_PATH and
    * %G_VARIANT_TYPE_SIGNATURE.
    *
    * The string will always be UTF-8 encoded, will never be %NULL, and will
    * never contain nul bytes.
    *
    * If @length is non-%NULL then the length of the string (in bytes) is
    * returned there. For trusted values, this information is already known.
    * Untrusted values will be validated and, if valid, a strlen() will be
    * performed. If invalid, a default value will be returned — for
    * %G_VARIANT_TYPE_OBJECT_PATH, this is `"/"`, and for other types it is the
    * empty string.
    *
    * It is an error to call this function with a @value of any type other than
    * those three.
    *
    * The return value remains valid as long as @value exists.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_string]: Method get_string contains an OUT parameter, which is not supported yet"
  )
  private def getString__ = ???

  /** Gets the contents of an array of strings #GVariant. This call makes a
    * shallow copy; the return result should be released with g_free(), but the
    * individual strings must not be modified.
    *
    * If @length is non-%NULL then the number of elements in the result is
    * stored there. In any case, the resulting array will be %NULL-terminated.
    *
    * For an empty array, @length will be set to 0 and a pointer to a %NULL
    * pointer will be returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_strv]: Method get_strv contains an OUT parameter, which is not supported yet"
  )
  private def getStrv__ = ???

  /** Determines the type of @value.
    *
    * The return value is valid for the lifetime of @value and must not be
    * freed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getType(): sn.gnome.glib.VariantType /* None */ =
    sn.gnome.glib.VariantType.fromRaw(
      g_variant_get_type(this.getUnsafeRawPointer().asInstanceOf[Ptr[GVariant]])
    )
  end getType

  /** Returns the type string of @value. Unlike the result of calling
    * g_variant_type_peek_string(), this string is nul-terminated. This string
    * belongs to #GVariant and must not be freed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getTypeString(): scala.Predef.String /* None */ =
    fromCString(
      g_variant_get_type_string(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GVariant]]
      ).asInstanceOf
    )
  end getTypeString

  /** Returns the 16-bit unsigned integer value of @value.
    *
    * It is an error to call this function with a @value of any type other than
    * %G_VARIANT_TYPE_UINT16.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getUint16(): UShort /* None */ =
    g_variant_get_uint16(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GVariant]]
    ).value
  end getUint16

  /** Returns the 32-bit unsigned integer value of @value.
    *
    * It is an error to call this function with a @value of any type other than
    * %G_VARIANT_TYPE_UINT32.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getUint32(): UInt /* None */ =
    g_variant_get_uint32(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GVariant]]
    ).value
  end getUint32

  /** Returns the 64-bit unsigned integer value of @value.
    *
    * It is an error to call this function with a @value of any type other than
    * %G_VARIANT_TYPE_UINT64.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getUint64(): CUnsignedLongInt /* None */ =
    g_variant_get_uint64(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GVariant]]
    ).value
  end getUint64

  /** This function is intended to be used by libraries based on #GVariant that
    * want to provide g_variant_get()-like functionality to their users.
    *
    * The API is more general than g_variant_get() to allow a wider range of
    * possible uses.
    *
    * @format_string
    *   must still point to a valid format string, but it only need to be
    *   nul-terminated if @endptr is %NULL. If @endptr is non-%NULL then it is
    *   updated to point to the first character past the end of the format
    *   string.
    *
    * @app
    *   is a pointer to a #va_list. The arguments, according to
    * @format_string,
    *   are collected from this #va_list and the list is left pointing to the
    *   argument following the last.
    *
    * These two generalisations allow mixing of multiple calls to
    * g_variant_new_va() and g_variant_get_va() within a single actual varargs
    * call by the user.
    *
    * @format_string
    *   determines the C types that are used for unpacking the values and also
    *   determines if the values are copied or borrowed, see the section on
    *   [GVariant format strings][gvariant-format-strings-pointers].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_va/<method parameters>/endptr]: Cannot render type Type(List(),ListMap(@name -> DataRecord(utf8), @type -> DataRecord(const gchar**)))"
  )
  private def getVa__ = ???

  /** Unboxes @value. The result is the #GVariant instance that was contained in @value.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getVariant(): sn.gnome.glib.Variant /* None */ =
    sn.gnome.glib.Variant.fromRaw(
      g_variant_get_variant(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GVariant]]
      )
    )
  end getVariant

  /** Generates a hash value for a #GVariant instance.
    *
    * The output of this function is guaranteed to be the same for a given value
    * only per-process. It may change between different processor architectures
    * or even different versions of GLib. Do not use this function as a basis
    * for building protocols or file formats.
    *
    * The type of @value is #gconstpointer only to allow use of this function
    * with #GHashTable. @value must be a #GVariant.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def hash(): UInt /* None */ =
    g_variant_hash(this.getUnsafeRawPointer().asInstanceOf[gconstpointer]).value
  end hash

  /** Checks if @value is a container.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isContainer(): Boolean /* None */ =
    g_variant_is_container(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GVariant]]
    ).value.!=(0)
  end isContainer

  /** Checks whether @value has a floating reference count.
    *
    * This function should only ever be used to assert that a given variant is
    * or is not floating, or for debug purposes. To acquire a reference to a
    * variant that might be floating, always use g_variant_ref_sink() or
    * g_variant_take_ref().
    *
    * See g_variant_ref_sink() for more information about floating reference
    * counts.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isFloating(): Boolean /* None */ =
    g_variant_is_floating(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GVariant]]
    ).value.!=(0)
  end isFloating

  /** Checks if @value is in normal form.
    *
    * The main reason to do this is to detect if a given chunk of serialized
    * data is in normal form: load the data into a #GVariant using
    * g_variant_new_from_data() and then use this function to check.
    *
    * If @value is found to be in normal form then it will be marked as being
    * trusted. If the value was already marked as being trusted then this
    * function will immediately return %TRUE.
    *
    * There may be implementation specific restrictions on deeply nested values.
    * GVariant is guaranteed to handle nesting up to at least 64 levels.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isNormalForm(): Boolean /* None */ =
    g_variant_is_normal_form(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GVariant]]
    ).value.!=(0)
  end isNormalForm

  /** Checks if a value has a type matching the provided type.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isOfType(
      `type`: sn.gnome.glib.VariantType /* Some(Ptr[GVariantType]) */
  ): Boolean /* None */ =
    g_variant_is_of_type(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GVariant]],
      `type`.getUnsafeRawPointer().asInstanceOf
    ).value.!=(0)
  end isOfType

  /** Creates a heap-allocated #GVariantIter for iterating over the items in @value.
    *
    * Use g_variant_iter_free() to free the return value when you no longer need
    * it.
    *
    * A reference is taken to @value and will be released only when
    * g_variant_iter_free() is called.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def iterNew(): sn.gnome.glib.VariantIter /* None */ =
    sn.gnome.glib.VariantIter.fromRaw(
      g_variant_iter_new(this.getUnsafeRawPointer().asInstanceOf[Ptr[GVariant]])
    )
  end iterNew

  /** Looks up a value in a dictionary #GVariant.
    *
    * This function is a wrapper around g_variant_lookup_value() and
    * g_variant_get(). In the case that %NULL would have been returned, this
    * function returns %FALSE. Otherwise, it unpacks the returned value and
    * returns %TRUE.
    *
    * @format_string
    *   determines the C types that are used for unpacking the values and also
    *   determines if the values are copied or borrowed, see the section on
    *   [GVariant format strings][gvariant-format-strings-pointers].
    *
    * This function is currently implemented with a linear scan. If you plan to
    * do many lookups then #GVariantDict may be more efficient.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method lookup/<method parameters>]: Vararg parameters require inlining which doesn't work with overriding"
  )
  private def lookup__ = ???

  /** Looks up a value in a dictionary #GVariant.
    *
    * This function works with dictionaries of the type a{s*} (and equally well
    * with type a{o*}, but we only further discuss the string case for sake of
    * clarity).
    *
    * In the event that @dictionary has the type a{sv}, the @expected_type
    * string specifies what type of value is expected to be inside of the
    * variant. If the value inside the variant has a different type then %NULL
    * is returned. In the event that @dictionary has a value type other than v
    * then @expected_type must directly match the value type and it is used to
    * unpack the value directly or an error occurs.
    *
    * In either case, if @key is not found in @dictionary, %NULL is returned.
    *
    * If the key is found and the value has the correct type, it is returned. If @expected_type
    * was specified then any non-%NULL return value will have this type.
    *
    * This function is currently implemented with a linear scan. If you plan to
    * do many lookups then #GVariantDict may be more efficient.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def lookupValue(
      key: scala.Predef.String /* Some(Ptr[gchar]) */,
      expected_type: Option[
        sn.gnome.glib.VariantType /* Some(Ptr[GVariantType]) */
      ]
  )(using Zone): sn.gnome.glib.Variant /* None */ =
    sn.gnome.glib.Variant.fromRaw(
      g_variant_lookup_value(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GVariant]],
        toCString(key).asInstanceOf[Ptr[gchar]],
        expected_type
          .map[Ptr[GVariantType]](o => o.getUnsafeRawPointer().asInstanceOf)
          .getOrElse(null.asInstanceOf[Ptr[GVariantType]])
      )
    )
  end lookupValue

  /** Determines the number of children in a container #GVariant instance. This
    * includes variants, maybes, arrays, tuples and dictionary entries. It is an
    * error to call this function on any other type of #GVariant.
    *
    * For variants, the return value is always 1. For values with maybe types,
    * it is always zero or one. For arrays, it is the length of the array. For
    * tuples it is the number of tuple items (which depends only on the type).
    * For dictionary entries, it is always 2
    *
    * This function is O(1).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def nChildren(): CUnsignedLongInt /* None */ =
    g_variant_n_children(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GVariant]]
    ).value
  end nChildren

  /** Pretty-prints @value in the format understood by g_variant_parse().
    *
    * The format is described [here][gvariant-text].
    *
    * If @type_annotate is %TRUE, then type information is included in the
    * output.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def print(
      type_annotate: Boolean /* Some(gboolean) */
  )(using Zone): scala.Predef.String /* None */ =
    fromCString(
      g_variant_print(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GVariant]],
        gboolean(gint((if type_annotate == true then 1 else 0)))
      ).asInstanceOf
    )
  end print

  /** Behaves as g_variant_print(), but operates on a #GString.
    *
    * If @string is non-%NULL then it is appended to and returned. Else, a new
    * empty #GString is allocated and it is returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def printString(
      string: Option[sn.gnome.glib.String /* Some(Ptr[GString]) */ ],
      type_annotate: Boolean /* Some(gboolean) */
  ): sn.gnome.glib.String /* None */ =
    sn.gnome.glib.String.fromRaw(
      g_variant_print_string(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GVariant]],
        string
          .map[Ptr[GString]](o => o.getUnsafeRawPointer().asInstanceOf)
          .getOrElse(null.asInstanceOf[Ptr[GString]]),
        gboolean(gint((if type_annotate == true then 1 else 0)))
      )
    )
  end printString

  /** Increases the reference count of @value.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def ref(): sn.gnome.glib.Variant /* None */ =
    sn.gnome.glib.Variant.fromRaw(
      g_variant_ref(this.getUnsafeRawPointer().asInstanceOf[Ptr[GVariant]])
    )
  end ref

  /** #GVariant uses a floating reference count system. All functions with names
    * starting with `g_variant_new_` return floating references.
    *
    * Calling g_variant_ref_sink() on a #GVariant with a floating reference will
    * convert the floating reference into a full reference. Calling
    * g_variant_ref_sink() on a non-floating #GVariant results in an additional
    * normal reference being added.
    *
    * In other words, if the @value is floating, then this call "assumes
    * ownership" of the floating reference, converting it to a normal reference.
    * If the @value is not floating, then this call adds a new normal reference
    * increasing the reference count by one.
    *
    * All calls that result in a #GVariant instance being inserted into a
    * container will call g_variant_ref_sink() on the instance. This means that
    * if the value was just created (and has only its floating reference) then
    * the container will assume sole ownership of the value at that point and
    * the caller will not need to unreference it. This makes certain common
    * styles of programming much easier while still maintaining normal
    * refcounting semantics in situations where values are not floating.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def refSink(): sn.gnome.glib.Variant /* None */ =
    sn.gnome.glib.Variant.fromRaw(
      g_variant_ref_sink(this.getUnsafeRawPointer().asInstanceOf[Ptr[GVariant]])
    )
  end refSink

  /** Stores the serialized form of @value at @data. @data should be large
    * enough. See g_variant_get_size().
    *
    * The stored data is in machine native byte order but may not be in
    * fully-normalised form if read from an untrusted source. See
    * g_variant_get_normal_form() for a solution.
    *
    * As with g_variant_get_data(), to be able to deserialize the serialized
    * variant successfully, its type and (if the destination machine might be
    * different) its endianness must also be available.
    *
    * This function is approximately O(n) in the size of @data.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def store(data: Ptr[Byte] /* Some(gpointer) */ ): Unit /* None */ =
    g_variant_store(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GVariant]],
      gpointer(data)
    )
  end store

  /** If @value is floating, sink it. Otherwise, do nothing.
    *
    * Typically you want to use g_variant_ref_sink() in order to automatically
    * do the correct thing with respect to floating or non-floating references,
    * but there is one specific scenario where this function is helpful.
    *
    * The situation where this function is helpful is when creating an API that
    * allows the user to provide a callback function that returns a #GVariant.
    * We certainly want to allow the user the flexibility to return a
    * non-floating reference from this callback (for the case where the value
    * that is being returned already exists).
    *
    * At the same time, the style of the #GVariant API makes it likely that for
    * newly-created #GVariant instances, the user can be saved some typing if
    * they are allowed to return a #GVariant with a floating reference.
    *
    * Using this function on the return value of the user's callback allows the
    * user to do whichever is more convenient for them. The caller will always
    * receives exactly one full reference to the value: either the one that was
    * returned in the first place, or a floating reference that has been
    * converted to a full reference.
    *
    * This function has an odd interaction when combined with
    * g_variant_ref_sink() running at the same time in another thread on the
    * same #GVariant instance. If g_variant_ref_sink() runs first then the
    * result will be that the floating reference is converted to a hard
    * reference. If g_variant_take_ref() runs first then the result will be that
    * the floating reference is converted to a hard reference and an additional
    * reference on top of that one is added. It is best to avoid this situation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def takeRef(): sn.gnome.glib.Variant /* None */ =
    sn.gnome.glib.Variant.fromRaw(
      g_variant_take_ref(this.getUnsafeRawPointer().asInstanceOf[Ptr[GVariant]])
    )
  end takeRef

  /** Decreases the reference count of @value. When its reference count drops to
    * 0, the memory used by the variant is freed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unref(): Unit /* None */ =
    g_variant_unref(this.getUnsafeRawPointer().asInstanceOf[Ptr[GVariant]])
  end unref

end Variant

object Variant:
  def fromRaw(ptr: Ptr[GVariant]): Variant = new Variant(ptr)
end Variant
