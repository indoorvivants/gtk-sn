package sn.gnome.glib

import _root_.sn.gnome.glib.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.VariantType
import sn.gnome.glib.internal.{
  GVariantType,
  gboolean,
  gchar,
  gint,
  gsize,
  guint
}

/** This section introduces the GVariant type system. It is based, in large
  * part, on the D-Bus type system, with two major changes and some minor
  * lifting of restrictions. The [D-Bus
  * specification](http://dbus.freedesktop.org/doc/dbus-specification.html),
  * therefore, provides a significant amount of information that is useful when
  * working with GVariant.
  *
  * The first major change with respect to the D-Bus type system is the
  * introduction of maybe (or "nullable") types. Any type in GVariant can be
  * converted to a maybe type, in which case, "nothing" (or "null") becomes a
  * valid value. Maybe types have been added by introducing the character "m" to
  * type strings.
  *
  * The second major change is that the GVariant type system supports the
  * concept of "indefinite types" -- types that are less specific than the
  * normal types found in D-Bus. For example, it is possible to speak of "an
  * array of any type" in GVariant, where the D-Bus type system would require
  * you to speak of "an array of integers" or "an array of strings". Indefinite
  * types have been added by introducing the characters "*", "?" and "r" to type
  * strings.
  *
  * Finally, all arbitrary restrictions relating to the complexity of types are
  * lifted along with the restriction that dictionary entries may only appear
  * nested inside of arrays.
  *
  * Just as in D-Bus, GVariant types are described with strings ("type
  * strings"). Subject to the differences mentioned above, these strings are of
  * the same form as those found in D-Bus. Note, however: D-Bus always works in
  * terms of messages and therefore individual type strings appear nowhere in
  * its interface. Instead, "signatures" are a concatenation of the strings of
  * the type of each argument in a message. GVariant deals with single values
  * directly so GVariant type strings always describe the type of exactly one
  * value. This means that a D-Bus signature string is generally not a valid
  * GVariant type string -- except in the case that it is the signature of a
  * message containing exactly one argument.
  *
  * An indefinite type is similar in spirit to what may be called an abstract
  * type in other type systems. No value can exist that has an indefinite type
  * as its type, but values can exist that have types that are subtypes of
  * indefinite types. That is to say, g_variant_get_type() will never return an
  * indefinite type, but calling g_variant_is_of_type() with an indefinite type
  * may return %TRUE. For example, you cannot have a value that represents "an
  * array of no particular type", but you can have an "array of integers" which
  * certainly matches the type of "an array of no particular type", since "array
  * of integers" is a subtype of "array of no particular type".
  *
  * This is similar to how instances of abstract classes may not directly exist
  * in other type systems, but instances of their non-abstract subtypes may. For
  * example, in GTK, no object that has the type of #GtkBin can exist (since
  * #GtkBin is an abstract class), but a #GtkWindow can certainly be
  * instantiated, and you would say that the #GtkWindow is a #GtkBin (since
  * #GtkWindow is a subclass of #GtkBin).
  *
  * ## GVariant Type Strings
  *
  * A GVariant type string can be any of the following:
  *
  *   - any basic type string (listed below)
  *   - "v", "r" or "*"
  *   - one of the characters 'a' or 'm', followed by another type string
  *   - the character '(', followed by a concatenation of zero or more other
  *     type strings, followed by the character ')'
  *   - the character '{', followed by a basic type string (see below), followed
  *     by another type string, followed by the character '}'
  *
  * A basic type string describes a basic type (as per
  * g_variant_type_is_basic()) and is always a single character in length. The
  * valid basic type strings are "b", "y", "n", "q", "i", "u", "x", "t", "h",
  * "d", "s", "o", "g" and "?".
  *
  * The above definition is recursive to arbitrary depth. "aaaaai" and
  * "(ui(nq((y)))s)" are both valid type strings, as is
  * "a(aa(ui)(qna{ya(yd)}))". In order to not hit memory limits, #GVariant
  * imposes a limit on recursion depth of 65 nested containers. This is the
  * limit in the D-Bus specification (64) plus one to allow a #GDBusMessage to
  * be nested in a top-level tuple.
  *
  * The meaning of each of the characters is as follows:
  *   - `b`: the type string of %G_VARIANT_TYPE_BOOLEAN; a boolean value.
  *   - `y`: the type string of %G_VARIANT_TYPE_BYTE; a byte.
  *   - `n`: the type string of %G_VARIANT_TYPE_INT16; a signed 16 bit integer.
  *   - `q`: the type string of %G_VARIANT_TYPE_UINT16; an unsigned 16 bit
  *     integer.
  *   - `i`: the type string of %G_VARIANT_TYPE_INT32; a signed 32 bit integer.
  *   - `u`: the type string of %G_VARIANT_TYPE_UINT32; an unsigned 32 bit
  *     integer.
  *   - `x`: the type string of %G_VARIANT_TYPE_INT64; a signed 64 bit integer.
  *   - `t`: the type string of %G_VARIANT_TYPE_UINT64; an unsigned 64 bit
  *     integer.
  *   - `h`: the type string of %G_VARIANT_TYPE_HANDLE; a signed 32 bit value
  *     that, by convention, is used as an index into an array of file
  *     descriptors that are sent alongside a D-Bus message.
  *   - `d`: the type string of %G_VARIANT_TYPE_DOUBLE; a double precision
  *     floating point value.
  *   - `s`: the type string of %G_VARIANT_TYPE_STRING; a string.
  *   - `o`: the type string of %G_VARIANT_TYPE_OBJECT_PATH; a string in the
  *     form of a D-Bus object path.
  *   - `g`: the type string of %G_VARIANT_TYPE_SIGNATURE; a string in the form
  *     of a D-Bus type signature.
  *   - `?`: the type string of %G_VARIANT_TYPE_BASIC; an indefinite type that
  *     is a supertype of any of the basic types.
  *   - `v`: the type string of %G_VARIANT_TYPE_VARIANT; a container type that
  *     contain any other type of value.
  *   - `a`: used as a prefix on another type string to mean an array of that
  *     type; the type string "ai", for example, is the type of an array of
  *     signed 32-bit integers.
  *   - `m`: used as a prefix on another type string to mean a "maybe", or
  *     "nullable", version of that type; the type string "ms", for example, is
  *     the type of a value that maybe contains a string, or maybe contains
  *     nothing.
  *   - `()`: used to enclose zero or more other concatenated type strings to
  *     create a tuple type; the type string "(is)", for example, is the type of
  *     a pair of an integer and a string.
  *   - `r`: the type string of %G_VARIANT_TYPE_TUPLE; an indefinite type that
  *     is a supertype of any tuple type, regardless of the number of items.
  *   - `{}`: used to enclose a basic type string concatenated with another type
  *     string to create a dictionary entry type, which usually appears inside
  *     of an array to form a dictionary; the type string "a{sd}", for example,
  *     is the type of a dictionary that maps strings to double precision
  *     floating point values.
  *
  * The first type (the basic type) is the key type and the second type is the
  * value type. The reason that the first type is restricted to being a basic
  * type is so that it can easily be hashed.
  *   - `*`: the type string of %G_VARIANT_TYPE_ANY; the indefinite type that is
  *     a supertype of all types. Note that, as with all type strings, this
  *     character represents exactly one type. It cannot be used inside of
  *     tuples to mean "any number of items".
  *
  * Any type string of a container that contains an indefinite type is, itself,
  * an indefinite type. For example, the type string "a*" (corresponding to
  * %G_VARIANT_TYPE_ARRAY) is an indefinite type that is a supertype of every
  * array type. "(*s)" is a supertype of all tuples that contain exactly two
  * items where the second item is a string.
  *
  * "a{?*}" is an indefinite type that is a supertype of all arrays containing
  * dictionary entries where the key is any basic type and the value is any type
  * at all. This is, by definition, a dictionary, so this type string
  * corresponds to %G_VARIANT_TYPE_DICTIONARY. Note that, due to the restriction
  * that the key of a dictionary entry must be a basic type, "{**}" is not a
  * valid type string.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class VariantType private[gnome] (raw: Ptr[GVariantType]):

  def getUnsafeRawPointer(): Ptr[GVariantType] = this.raw

  /** Makes a copy of a #GVariantType. It is appropriate to call
    * g_variant_type_free() on the return value. @type may not be %NULL.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def copy(): sn.gnome.glib.VariantType /* None */ =
    sn.gnome.glib.VariantType.fromRaw(
      g_variant_type_copy(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GVariantType]]
      )
    )
  end copy

  /** Returns a newly-allocated copy of the type string corresponding to
    * @type.
    *   The returned string is nul-terminated. It is appropriate to call
    *   g_free() on the return value.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def dupString()(using Zone): scala.Predef.String /* None */ =
    fromCString(
      g_variant_type_dup_string(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GVariantType]]
      ).asInstanceOf
    )
  end dupString

  /** Determines the element type of an array or maybe type.
    *
    * This function may only be used with array or maybe types.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def element(): sn.gnome.glib.VariantType /* None */ =
    sn.gnome.glib.VariantType.fromRaw(
      g_variant_type_element(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GVariantType]]
      )
    )
  end element

  /** Compares @type1 and @type2 for equality.
    *
    * Only returns %TRUE if the types are exactly equal. Even if one type is an
    * indefinite type and the other is a subtype of it, %FALSE will be returned
    * if they are not exactly equal. If you want to check for subtypes, use
    * g_variant_type_is_subtype_of().
    *
    * The argument types of @type1 and @type2 are only #gconstpointer to allow
    * use with #GHashTable without function pointer casting. For both arguments,
    * a valid #GVariantType must be provided.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def equal(
      type2: sn.gnome.glib.VariantType /* Some(gconstpointer) */
  ): Boolean /* None */ =
    g_variant_type_equal(
      this.getUnsafeRawPointer().asInstanceOf[gconstpointer],
      type2.getUnsafeRawPointer().asInstanceOf
    ).value.!=(0)
  end equal

  /** Determines the first item type of a tuple or dictionary entry type.
    *
    * This function may only be used with tuple or dictionary entry types, but
    * must not be used with the generic tuple type %G_VARIANT_TYPE_TUPLE.
    *
    * In the case of a dictionary entry type, this returns the type of the key.
    *
    * %NULL is returned in case of @type being %G_VARIANT_TYPE_UNIT.
    *
    * This call, together with g_variant_type_next() provides an iterator
    * interface over tuple and dictionary entry types.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def first(): sn.gnome.glib.VariantType /* None */ =
    sn.gnome.glib.VariantType.fromRaw(
      g_variant_type_first(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GVariantType]]
      )
    )
  end first

  /** Frees a #GVariantType that was allocated with g_variant_type_copy(),
    * g_variant_type_new() or one of the container type constructor functions.
    *
    * In the case that @type is %NULL, this function does nothing.
    *
    * Since 2.24
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def free(): Unit /* None */ =
    g_variant_type_free(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GVariantType]]
    )
  end free

  /** Returns the length of the type string corresponding to the given
    * @type.
    *   This function must be used to determine the valid extent of the memory
    *   region returned by g_variant_type_peek_string().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getStringLength(): CUnsignedLongInt /* None */ =
    g_variant_type_get_string_length(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GVariantType]]
    ).value
  end getStringLength

  /** Hashes @type.
    *
    * The argument type of @type is only #gconstpointer to allow use with
    * #GHashTable without function pointer casting. A valid #GVariantType must
    * be provided.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def hash(): UInt /* None */ =
    g_variant_type_hash(
      this.getUnsafeRawPointer().asInstanceOf[gconstpointer]
    ).value
  end hash

  /** Determines if the given @type is an array type. This is true if the type
    * string for @type starts with an 'a'.
    *
    * This function returns %TRUE for any indefinite type for which every
    * definite subtype is an array type -- %G_VARIANT_TYPE_ARRAY, for example.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isArray(): Boolean /* None */ =
    g_variant_type_is_array(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GVariantType]]
    ).value.!=(0)
  end isArray

  /** Determines if the given @type is a basic type.
    *
    * Basic types are booleans, bytes, integers, doubles, strings, object paths
    * and signatures.
    *
    * Only a basic type may be used as the key of a dictionary entry.
    *
    * This function returns %FALSE for all indefinite types except
    * %G_VARIANT_TYPE_BASIC.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isBasic(): Boolean /* None */ =
    g_variant_type_is_basic(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GVariantType]]
    ).value.!=(0)
  end isBasic

  /** Determines if the given @type is a container type.
    *
    * Container types are any array, maybe, tuple, or dictionary entry types
    * plus the variant type.
    *
    * This function returns %TRUE for any indefinite type for which every
    * definite subtype is a container -- %G_VARIANT_TYPE_ARRAY, for example.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isContainer(): Boolean /* None */ =
    g_variant_type_is_container(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GVariantType]]
    ).value.!=(0)
  end isContainer

  /** Determines if the given @type is definite (ie: not indefinite).
    *
    * A type is definite if its type string does not contain any indefinite type
    * characters ('*', '?', or 'r').
    *
    * A #GVariant instance may not have an indefinite type, so calling this
    * function on the result of g_variant_get_type() will always result in %TRUE
    * being returned. Calling this function on an indefinite type like
    * %G_VARIANT_TYPE_ARRAY, however, will result in %FALSE being returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isDefinite(): Boolean /* None */ =
    g_variant_type_is_definite(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GVariantType]]
    ).value.!=(0)
  end isDefinite

  /** Determines if the given @type is a dictionary entry type. This is true if
    * the type string for @type starts with a '{'.
    *
    * This function returns %TRUE for any indefinite type for which every
    * definite subtype is a dictionary entry type -- %G_VARIANT_TYPE_DICT_ENTRY,
    * for example.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isDictEntry(): Boolean /* None */ =
    g_variant_type_is_dict_entry(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GVariantType]]
    ).value.!=(0)
  end isDictEntry

  /** Determines if the given @type is a maybe type. This is true if the type
    * string for @type starts with an 'm'.
    *
    * This function returns %TRUE for any indefinite type for which every
    * definite subtype is a maybe type -- %G_VARIANT_TYPE_MAYBE, for example.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isMaybe(): Boolean /* None */ =
    g_variant_type_is_maybe(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GVariantType]]
    ).value.!=(0)
  end isMaybe

  /** Checks if @type is a subtype of @supertype.
    *
    * This function returns %TRUE if @type is a subtype of @supertype. All types
    * are considered to be subtypes of themselves. Aside from that, only
    * indefinite types can have subtypes.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isSubtypeOf(
      supertype: sn.gnome.glib.VariantType /* Some(Ptr[GVariantType]) */
  ): Boolean /* None */ =
    g_variant_type_is_subtype_of(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GVariantType]],
      supertype.getUnsafeRawPointer().asInstanceOf
    ).value.!=(0)
  end isSubtypeOf

  /** Determines if the given @type is a tuple type. This is true if the type
    * string for @type starts with a '(' or if @type is %G_VARIANT_TYPE_TUPLE.
    *
    * This function returns %TRUE for any indefinite type for which every
    * definite subtype is a tuple type -- %G_VARIANT_TYPE_TUPLE, for example.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isTuple(): Boolean /* None */ =
    g_variant_type_is_tuple(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GVariantType]]
    ).value.!=(0)
  end isTuple

  /** Determines if the given @type is the variant type.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isVariant(): Boolean /* None */ =
    g_variant_type_is_variant(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GVariantType]]
    ).value.!=(0)
  end isVariant

  /** Determines the key type of a dictionary entry type.
    *
    * This function may only be used with a dictionary entry type. Other than
    * the additional restriction, this call is equivalent to
    * g_variant_type_first().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def key(): sn.gnome.glib.VariantType /* None */ =
    sn.gnome.glib.VariantType.fromRaw(
      g_variant_type_key(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GVariantType]]
      )
    )
  end key

  /** Determines the number of items contained in a tuple or dictionary entry
    * type.
    *
    * This function may only be used with tuple or dictionary entry types, but
    * must not be used with the generic tuple type %G_VARIANT_TYPE_TUPLE.
    *
    * In the case of a dictionary entry type, this function will always return 2.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def nItems(): CUnsignedLongInt /* None */ =
    g_variant_type_n_items(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GVariantType]]
    ).value
  end nItems

  /** Determines the next item type of a tuple or dictionary entry type.
    *
    * @type
    *   must be the result of a previous call to g_variant_type_first() or
    *   g_variant_type_next().
    *
    * If called on the key type of a dictionary entry then this call returns the
    * value type. If called on the value type of a dictionary entry then this
    * call returns %NULL.
    *
    * For tuples, %NULL is returned when @type is the last item in a tuple.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def next(): sn.gnome.glib.VariantType /* None */ =
    sn.gnome.glib.VariantType.fromRaw(
      g_variant_type_next(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GVariantType]]
      )
    )
  end next

  /** Returns the type string corresponding to the given @type. The result is
    * not nul-terminated; in order to determine its length you must call
    * g_variant_type_get_string_length().
    *
    * To get a nul-terminated string, see g_variant_type_dup_string().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def peekString(): scala.Predef.String /* None */ =
    fromCString(
      g_variant_type_peek_string(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GVariantType]]
      ).asInstanceOf
    )
  end peekString

  /** Determines the value type of a dictionary entry type.
    *
    * This function may only be used with a dictionary entry type.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def value(): sn.gnome.glib.VariantType /* None */ =
    sn.gnome.glib.VariantType.fromRaw(
      g_variant_type_value(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GVariantType]]
      )
    )
  end value

end VariantType

object VariantType:
  def fromRaw(ptr: Ptr[GVariantType]): VariantType = new VariantType(ptr)
end VariantType
