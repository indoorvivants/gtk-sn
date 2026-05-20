package sn.gnome.glib

import _root_.sn.gnome.glib.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.{Variant, VariantDict, VariantType}
import sn.gnome.glib.internal.{GVariantDict, gboolean, gchar, gint}

/**  #GVariantDict is a mutable interface to #GVariant dictionaries.
  *
  *  It can be used for doing a sequence of dictionary lookups in an
  *  efficient way on an existing #GVariant dictionary or it can be used
  *  to construct new dictionaries with a hashtable-like interface.  It
  *  can also be used for taking existing dictionaries and modifying them
  *  in order to create new ones.
  *
  *  #GVariantDict can only be used with %G_VARIANT_TYPE_VARDICT
  *  dictionaries.
  *
  *  It is possible to use #GVariantDict allocated on the stack or on the
  *  heap.  When using a stack-allocated #GVariantDict, you begin with a
  *  call to g_variant_dict_init() and free the resources with a call to
  *  g_variant_dict_clear().
  *
  *  Heap-allocated #GVariantDict follows normal refcounting rules: you
  *  allocate it with g_variant_dict_new() and use g_variant_dict_ref()
  *  and g_variant_dict_unref().
  *
  *  g_variant_dict_end() is used to convert the #GVariantDict back into a
  *  dictionary-type #GVariant.  When used with stack-allocated instances,
  *  this also implicitly frees all associated memory, but for
  *  heap-allocated instances, you must still call g_variant_dict_unref()
  *  afterwards.
  *
  *  You will typically want to use a heap-allocated #GVariantDict when
  *  you expose it as part of an API.  For most other uses, the
  *  stack-allocated form will be more convenient.
  *
  *  Consider the following two examples that do the same thing in each
  *  style: take an existing dictionary and look up the "count" uint32
  *  key, adding 1 to it if it is found, or returning an error if the
  *  key is not found.  Each returns the new dictionary as a floating
  *  #GVariant.
  *
  *  ## Using a stack-allocated GVariantDict
  *
  *  |[<!-- language="C" -->
  *    GVariant *
  *    add_to_count (GVariant  *orig,
  *                  GError   **error)
  *    {
  *      GVariantDict dict;
  *      guint32 count;
  *
  *      g_variant_dict_init (&dict, orig);
  *      if (!g_variant_dict_lookup (&dict, "count", "u", &count))
  *        {
  *          g_set_error (...);
  *          g_variant_dict_clear (&dict);
  *          return NULL;
  *        }
  *
  *      g_variant_dict_insert (&dict, "count", "u", count + 1);
  *
  *      return g_variant_dict_end (&dict);
  *    }
  *  ]|
  *
  *  ## Using heap-allocated GVariantDict
  *
  *  |[<!-- language="C" -->
  *    GVariant *
  *    add_to_count (GVariant  *orig,
  *                  GError   **error)
  *    {
  *      GVariantDict *dict;
  *      GVariant *result;
  *      guint32 count;
  *
  *      dict = g_variant_dict_new (orig);
  *
  *      if (g_variant_dict_lookup (dict, "count", "u", &count))
  *        {
  *          g_variant_dict_insert (dict, "count", "u", count + 1);
  *          result = g_variant_dict_end (dict);
  *        }
  *      else
  *        {
  *          g_set_error (...);
  *          result = NULL;
  *        }
  *
  *      g_variant_dict_unref (dict);
  *
  *      return result;
  *    }
  *  ]|
  *
  *  NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT BE APPLICABLE TO SCALA
  */
class VariantDict private[gnome] (raw: Ptr[GVariantDict]):

  def getUnsafeRawPointer(): Ptr[GVariantDict] = this.raw

  /** Releases all memory associated with a #GVariantDict without freeing the
    * #GVariantDict structure itself.
    *
    * It typically only makes sense to do this on a stack-allocated
    * #GVariantDict if you want to abort building the value part-way through.
    * This function need not be called if you call g_variant_dict_end() and it
    * also doesn't need to be called on dicts allocated with g_variant_dict_new
    * (see g_variant_dict_unref() for that).
    *
    * It is valid to call this function on either an initialised #GVariantDict
    * or one that was previously cleared by an earlier call to
    * g_variant_dict_clear() but it is not valid to call this function on
    * uninitialised memory.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def clear(): Unit /* None */ =
    g_variant_dict_clear(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GVariantDict]]
    )
  end clear

  /** Checks if @key exists in @dict.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def contains(
      key: scala.Predef.String /* Some(Ptr[gchar]) */
  )(using Zone): Boolean /* None */ =
    g_variant_dict_contains(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GVariantDict]],
      toCString(key).asInstanceOf[Ptr[gchar]]
    ).value.!=(0)
  end contains

  /** Returns the current value of @dict as a #GVariant of type
    * %G_VARIANT_TYPE_VARDICT, clearing it in the process.
    *
    * It is not permissible to use @dict in any way after this call except for
    * reference counting operations (in the case of a heap-allocated
    * #GVariantDict) or by reinitialising it with g_variant_dict_init() (in the
    * case of stack-allocated).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def end(): sn.gnome.glib.Variant /* None */ =
    sn.gnome.glib.Variant.fromRaw(
      g_variant_dict_end(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GVariantDict]]
      )
    )
  end end

  /** Initialises a #GVariantDict structure.
    *
    * If @from_asv is given, it is used to initialise the dictionary.
    *
    * This function completely ignores the previous contents of @dict. On one
    * hand this means that it is valid to pass in completely uninitialised
    * memory. On the other hand, this means that if you are initialising over
    * top of an existing #GVariantDict you need to first call
    * g_variant_dict_clear() in order to avoid leaking memory.
    *
    * You must not call g_variant_dict_ref() or g_variant_dict_unref() on a
    * #GVariantDict that was initialised with this function. If you ever pass a
    * reference to a #GVariantDict outside of the control of your own code then
    * you should assume that the person receiving that reference may try to use
    * reference counting; you should use g_variant_dict_new() instead of this
    * function.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def init(
      from_asv: Option[sn.gnome.glib.Variant /* Some(Ptr[GVariant]) */ ]
  ): Unit /* None */ =
    g_variant_dict_init(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GVariantDict]],
      from_asv
        .map[Ptr[GVariant]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GVariant]])
    )
  end init

  /** Inserts a value into a #GVariantDict.
    *
    * This call is a convenience wrapper that is exactly equivalent to calling
    * g_variant_new() followed by g_variant_dict_insert_value().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method insert/<method parameters>]: Vararg parameters require inlining which doesn't work with overriding"
  )
  private def insert__ = ???

  /** Inserts (or replaces) a key in a #GVariantDict.
    *
    * @value
    *   is consumed if it is floating.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def insertValue(
      key: scala.Predef.String /* Some(Ptr[gchar]) */,
      value: sn.gnome.glib.Variant /* Some(Ptr[GVariant]) */
  )(using Zone): Unit /* None */ =
    g_variant_dict_insert_value(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GVariantDict]],
      toCString(key).asInstanceOf[Ptr[gchar]],
      value.getUnsafeRawPointer().asInstanceOf
    )
  end insertValue

  /** Looks up a value in a #GVariantDict.
    *
    * This function is a wrapper around g_variant_dict_lookup_value() and
    * g_variant_get(). In the case that %NULL would have been returned, this
    * function returns %FALSE and does not modify the values of the arguments
    * passed in to @.... Otherwise, it unpacks the returned value and returns
    * %TRUE.
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
    "[method lookup/<method parameters>]: Vararg parameters require inlining which doesn't work with overriding"
  )
  private def lookup__ = ???

  /** Looks up a value in a #GVariantDict.
    *
    * If @key is not found in @dictionary, %NULL is returned.
    *
    * The @expected_type string specifies what type of value is expected. If the
    * value associated with @key has a different type then %NULL is returned.
    *
    * If the key is found and the value has the correct type, it is returned. If @expected_type
    * was specified then any non-%NULL return value will have this type.
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
      g_variant_dict_lookup_value(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GVariantDict]],
        toCString(key).asInstanceOf[Ptr[gchar]],
        expected_type
          .map[Ptr[GVariantType]](o => o.getUnsafeRawPointer().asInstanceOf)
          .getOrElse(null.asInstanceOf[Ptr[GVariantType]])
      )
    )
  end lookupValue

  /** Increases the reference count on @dict.
    *
    * Don't call this on stack-allocated #GVariantDict instances or bad things
    * will happen.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def ref(): sn.gnome.glib.VariantDict /* None */ =
    sn.gnome.glib.VariantDict.fromRaw(
      g_variant_dict_ref(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GVariantDict]]
      )
    )
  end ref

  /** Removes a key and its associated value from a #GVariantDict.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def remove(
      key: scala.Predef.String /* Some(Ptr[gchar]) */
  )(using Zone): Boolean /* None */ =
    g_variant_dict_remove(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GVariantDict]],
      toCString(key).asInstanceOf[Ptr[gchar]]
    ).value.!=(0)
  end remove

  /** Decreases the reference count on @dict.
    *
    * In the event that there are no more references, releases all memory
    * associated with the #GVariantDict.
    *
    * Don't call this on stack-allocated #GVariantDict instances or bad things
    * will happen.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unref(): Unit /* None */ =
    g_variant_dict_unref(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GVariantDict]]
    )
  end unref

end VariantDict

object VariantDict:
  def fromRaw(ptr: Ptr[GVariantDict]): VariantDict = new VariantDict(ptr)
end VariantDict
