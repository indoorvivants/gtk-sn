package sn.gnome.glib

import _root_.sn.gnome.glib.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.{Variant, VariantIter}
import sn.gnome.glib.internal.{GVariantIter, gsize}

/** #GVariantIter is an opaque data structure and can only be accessed using the
  * following functions.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class VariantIter private[gnome] (raw: Ptr[GVariantIter]):

  def getUnsafeRawPointer(): Ptr[GVariantIter] = this.raw

  /** Creates a new heap-allocated #GVariantIter to iterate over the container
    * that was being iterated over by @iter. Iteration begins on the new
    * iterator from the current position of the old iterator but the two copies
    * are independent past that point.
    *
    * Use g_variant_iter_free() to free the return value when you no longer need
    * it.
    *
    * A reference is taken to the container that @iter is iterating over and
    * will be related only when g_variant_iter_free() is called.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def copy(): sn.gnome.glib.VariantIter /* None */ =
    sn.gnome.glib.VariantIter.fromRaw(
      g_variant_iter_copy(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GVariantIter]]
      )
    )
  end copy

  /** Frees a heap-allocated #GVariantIter. Only call this function on iterators
    * that were returned by g_variant_iter_new() or g_variant_iter_copy().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def free(): Unit /* None */ =
    g_variant_iter_free(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GVariantIter]]
    )
  end free

  /** Initialises (without allocating) a #GVariantIter. @iter may be completely
    * uninitialised prior to this call; its old value is ignored.
    *
    * The iterator remains valid for as long as @value exists, and need not be
    * freed in any way.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def init(
      value: sn.gnome.glib.Variant /* Some(Ptr[GVariant]) */
  ): CUnsignedLongInt /* None */ =
    g_variant_iter_init(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GVariantIter]],
      value.getUnsafeRawPointer().asInstanceOf
    ).value
  end init

  /**  Gets the next item in the container and unpacks it into the variable
    *  argument list according to @format_string, returning %TRUE.
    *
    *  If no more items remain then %FALSE is returned.
    *
    *  On the first call to this function, the pointers appearing on the
    *  variable argument list are assumed to point at uninitialised memory.
    *  On the second and later calls, it is assumed that the same pointers
    *  will be given and that they will point to the memory as set by the
    *  previous call to this function.  This allows the previous values to
    *  be freed, as appropriate.
    *
    *  This function is intended to be used with a while loop as
    *  demonstrated in the following example.  This function can only be
    *  used when iterating over an array.  It is only valid to call this
    *  function with a string constant for the format string and the same
    *  string constant must be used each time.  Mixing calls to this
    *  function and g_variant_iter_next() or g_variant_iter_next_value() on
    *  the same iterator causes undefined behavior.
    *
    *  If you break out of a such a while loop using g_variant_iter_loop() then
    *  you must free or unreference all the unpacked values as you would with
    *  g_variant_get(). Failure to do so will cause a memory leak.
    *
    *  Here is an example for memory management with g_variant_iter_loop():
    *  |[<!-- language="C" -->
    *    // Iterates a dictionary of type 'a{sv}'
    *    void
    *    iterate_dictionary (GVariant *dictionary)
    *    {
    *      GVariantIter iter;
    *      GVariant *value;
    *      gchar *key;
    *
    *      g_variant_iter_init (&iter, dictionary);
    *      while (g_variant_iter_loop (&iter, "{sv}", &key, &value))
    *        {
    *          g_print ("Item '%s' has type '%s'\n", key,
    *                   g_variant_get_type_string (value));
    *
    *          // no need to free 'key' and 'value' here
    *          // unless breaking out of this loop
    *        }
    *    }
    *  ]|
    *
    *  For most cases you should use g_variant_iter_next().
    *
    *  This function is really only useful when unpacking into #GVariant or
    *  #GVariantIter in order to allow you to skip the call to
    *  g_variant_unref() or g_variant_iter_free().
    *
    *  For example, if you are only looping over simple integer and string
    *  types, g_variant_iter_next() is definitely preferred.  For string
    *  types, use the '&' prefix to avoid allocating any memory at all (and
    *  thereby avoiding the need to free anything as well).
    *
    *  @format_string determines the C types that are used for unpacking
    *  the values and also determines if the values are copied or borrowed.
    *
    *  See the section on
    *  [GVariant format strings][gvariant-format-strings-pointers].
    *
    *  NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method loop/<method parameters>]: Vararg parameters require inlining which doesn't work with overriding"
  )
  private def loop__ = ???

  /** Queries the number of child items in the container that we are iterating
    * over. This is the total number of items -- not the number of items
    * remaining.
    *
    * This function might be useful for preallocation of arrays.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def nChildren(): CUnsignedLongInt /* None */ =
    g_variant_iter_n_children(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GVariantIter]]
    ).value
  end nChildren

  /**  Gets the next item in the container and unpacks it into the variable
    *  argument list according to @format_string, returning %TRUE.
    *
    *  If no more items remain then %FALSE is returned.
    *
    *  All of the pointers given on the variable arguments list of this
    *  function are assumed to point at uninitialised memory.  It is the
    *  responsibility of the caller to free all of the values returned by
    *  the unpacking process.
    *
    *  Here is an example for memory management with g_variant_iter_next():
    *  |[<!-- language="C" -->
    *    // Iterates a dictionary of type 'a{sv}'
    *    void
    *    iterate_dictionary (GVariant *dictionary)
    *    {
    *      GVariantIter iter;
    *      GVariant *value;
    *      gchar *key;
    *
    *      g_variant_iter_init (&iter, dictionary);
    *      while (g_variant_iter_next (&iter, "{sv}", &key, &value))
    *        {
    *          g_print ("Item '%s' has type '%s'\n", key,
    *                   g_variant_get_type_string (value));
    *
    *          // must free data for ourselves
    *          g_variant_unref (value);
    *          g_free (key);
    *        }
    *    }
    *  ]|
    *
    *  For a solution that is likely to be more convenient to C programmers
    *  when dealing with loops, see g_variant_iter_loop().
    *
    *  @format_string determines the C types that are used for unpacking
    *  the values and also determines if the values are copied or borrowed.
    *
    *  See the section on
    *  [GVariant format strings][gvariant-format-strings-pointers].
    *
    *  NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method next/<method parameters>]: Vararg parameters require inlining which doesn't work with overriding"
  )
  private def next__ = ???

  /**  Gets the next item in the container.  If no more items remain then
    *  %NULL is returned.
    *
    *  Use g_variant_unref() to drop your reference on the return value when
    *  you no longer need it.
    *
    *  Here is an example for iterating with g_variant_iter_next_value():
    *  |[<!-- language="C" -->
    *    // recursively iterate a container
    *    void
    *    iterate_container_recursive (GVariant *container)
    *    {
    *      GVariantIter iter;
    *      GVariant *child;
    *
    *      g_variant_iter_init (&iter, container);
    *      while ((child = g_variant_iter_next_value (&iter)))
    *        {
    *          g_print ("type '%s'\n", g_variant_get_type_string (child));
    *
    *          if (g_variant_is_container (child))
    *            iterate_container_recursive (child);
    *
    *          g_variant_unref (child);
    *        }
    *    }
    *  ]|
    *
    *  NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT BE APPLICABLE TO SCALA
    */
  def nextValue(): sn.gnome.glib.Variant /* None */ =
    sn.gnome.glib.Variant.fromRaw(
      g_variant_iter_next_value(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GVariantIter]]
      )
    )
  end nextValue

end VariantIter

object VariantIter:
  def fromRaw(ptr: Ptr[GVariantIter]): VariantIter = new VariantIter(ptr)
end VariantIter
