package sn.gnome.glib

import _root_.sn.gnome.glib.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.{Variant, VariantBuilder, VariantType}
import sn.gnome.glib.internal.GVariantBuilder

/** A utility type for constructing container-type #GVariant instances.
  *
  * This is an opaque structure and may only be accessed using the following
  * functions.
  *
  * #GVariantBuilder is not threadsafe in any way. Do not attempt to access it
  * from more than one thread.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class VariantBuilder private[gnome] (raw: Ptr[GVariantBuilder]):

  def getUnsafeRawPointer(): Ptr[GVariantBuilder] = this.raw

  /**  Adds to a #GVariantBuilder.
    *
    *  This call is a convenience wrapper that is exactly equivalent to
    *  calling g_variant_new() followed by g_variant_builder_add_value().
    *
    *  Note that the arguments must be of the correct width for their types
    *  specified in @format_string. This can be achieved by casting them. See
    *  the [GVariant varargs documentation][gvariant-varargs].
    *
    *  This function might be used as follows:
    *
    *  |[<!-- language="C" -->
    *  GVariant *
    *  make_pointless_dictionary (void)
    *  {
    *    GVariantBuilder builder;
    *    int i;
    *
    *    g_variant_builder_init (&builder, G_VARIANT_TYPE_ARRAY);
    *    for (i = 0; i < 16; i++)
    *      {
    *        gchar buf[3];
    *
    *        sprintf (buf, "%d", i);
    *        g_variant_builder_add (&builder, "{is}", i, buf);
    *      }
    *
    *    return g_variant_builder_end (&builder);
    *  }
    *  ]|
    *
    *  NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method add/<method parameters>]: Vararg parameters require inlining which doesn't work with overriding"
  )
  private def add__ = ???

  /**  Adds to a #GVariantBuilder.
    *
    *  This call is a convenience wrapper that is exactly equivalent to
    *  calling g_variant_new_parsed() followed by
    *  g_variant_builder_add_value().
    *
    *  Note that the arguments must be of the correct width for their types
    *  specified in @format_string. This can be achieved by casting them. See
    *  the [GVariant varargs documentation][gvariant-varargs].
    *
    *  This function might be used as follows:
    *
    *  |[<!-- language="C" -->
    *  GVariant *
    *  make_pointless_dictionary (void)
    *  {
    *    GVariantBuilder builder;
    *    int i;
    *
    *    g_variant_builder_init (&builder, G_VARIANT_TYPE_ARRAY);
    *    g_variant_builder_add_parsed (&builder, "{'width', <%i>}", 600);
    *    g_variant_builder_add_parsed (&builder, "{'title', <%s>}", "foo");
    *    g_variant_builder_add_parsed (&builder, "{'transparency', <0.5>}");
    *    return g_variant_builder_end (&builder);
    *  }
    *  ]|
    *
    *  NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method add_parsed/<method parameters>]: Vararg parameters require inlining which doesn't work with overriding"
  )
  private def addParsed__ = ???

  /** Adds @value to @builder.
    *
    * It is an error to call this function in any way that would create an
    * inconsistent value to be constructed. Some examples of this are putting
    * different types of items into an array, putting the wrong types or number
    * of items in a tuple, putting more than one value into a variant, etc.
    *
    * If @value is a floating reference (see g_variant_ref_sink()), the @builder
    * instance takes ownership of @value.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def addValue(
      value: sn.gnome.glib.Variant /* Some(Ptr[GVariant]) */
  ): Unit /* None */ =
    g_variant_builder_add_value(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GVariantBuilder]],
      value.getUnsafeRawPointer().asInstanceOf
    )
  end addValue

  /** Releases all memory associated with a #GVariantBuilder without freeing the
    * #GVariantBuilder structure itself.
    *
    * It typically only makes sense to do this on a stack-allocated
    * #GVariantBuilder if you want to abort building the value part-way through.
    * This function need not be called if you call g_variant_builder_end() and
    * it also doesn't need to be called on builders allocated with
    * g_variant_builder_new() (see g_variant_builder_unref() for that).
    *
    * This function leaves the #GVariantBuilder structure set to all-zeros. It
    * is valid to call this function on either an initialised #GVariantBuilder
    * or one that is set to all-zeros but it is not valid to call this function
    * on uninitialised memory.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def clear(): Unit /* None */ =
    g_variant_builder_clear(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GVariantBuilder]]
    )
  end clear

  /** Closes the subcontainer inside the given @builder that was opened by the
    * most recent call to g_variant_builder_open().
    *
    * It is an error to call this function in any way that would create an
    * inconsistent value to be constructed (ie: too few values added to the
    * subcontainer).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def close(): Unit /* None */ =
    g_variant_builder_close(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GVariantBuilder]]
    )
  end close

  /** Ends the builder process and returns the constructed value.
    *
    * It is not permissible to use @builder in any way after this call except
    * for reference counting operations (in the case of a heap-allocated
    * #GVariantBuilder) or by reinitialising it with g_variant_builder_init()
    * (in the case of stack-allocated). This means that for the stack-allocated
    * builders there is no need to call g_variant_builder_clear() after the call
    * to g_variant_builder_end().
    *
    * It is an error to call this function in any way that would create an
    * inconsistent value to be constructed (ie: insufficient number of items
    * added to a container with a specific number of children required). It is
    * also an error to call this function if the builder was created with an
    * indefinite array or maybe type and no children have been added; in this
    * case it is impossible to infer the type of the empty array.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def end(): sn.gnome.glib.Variant /* None */ =
    sn.gnome.glib.Variant.fromRaw(
      g_variant_builder_end(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GVariantBuilder]]
      )
    )
  end end

  /** Initialises a #GVariantBuilder structure.
    *
    * @type
    *   must be non-%NULL. It specifies the type of container to construct. It
    *   can be an indefinite type such as %G_VARIANT_TYPE_ARRAY or a definite
    *   type such as "as" or "(ii)". Maybe, array, tuple, dictionary entry and
    *   variant-typed values may be constructed.
    *
    * After the builder is initialised, values are added using
    * g_variant_builder_add_value() or g_variant_builder_add().
    *
    * After all the child values are added, g_variant_builder_end() frees the
    * memory associated with the builder and returns the #GVariant that was
    * created.
    *
    * This function completely ignores the previous contents of @builder. On one
    * hand this means that it is valid to pass in completely uninitialised
    * memory. On the other hand, this means that if you are initialising over
    * top of an existing #GVariantBuilder you need to first call
    * g_variant_builder_clear() in order to avoid leaking memory.
    *
    * You must not call g_variant_builder_ref() or g_variant_builder_unref() on
    * a #GVariantBuilder that was initialised with this function. If you ever
    * pass a reference to a #GVariantBuilder outside of the control of your own
    * code then you should assume that the person receiving that reference may
    * try to use reference counting; you should use g_variant_builder_new()
    * instead of this function.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def init(
      `type`: sn.gnome.glib.VariantType /* Some(Ptr[GVariantType]) */
  ): Unit /* None */ =
    g_variant_builder_init(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GVariantBuilder]],
      `type`.getUnsafeRawPointer().asInstanceOf
    )
  end init

  /**  Opens a subcontainer inside the given @builder.  When done adding
    *  items to the subcontainer, g_variant_builder_close() must be called. @type
    *  is the type of the container: so to build a tuple of several values, @type
    *  must include the tuple itself.
    *
    *  It is an error to call this function in any way that would cause an
    *  inconsistent value to be constructed (ie: adding too many values or
    *  a value of an incorrect type).
    *
    *  Example of building a nested variant:
    *  |[<!-- language="C" -->
    *  GVariantBuilder builder;
    *  guint32 some_number = get_number ();
    *  g_autoptr (GHashTable) some_dict = get_dict ();
    *  GHashTableIter iter;
    *  const gchar *key;
    *  const GVariant *value;
    *  g_autoptr (GVariant) output = NULL;
    *
    *  g_variant_builder_init (&builder, G_VARIANT_TYPE ("(ua{sv})"));
    *  g_variant_builder_add (&builder, "u", some_number);
    *  g_variant_builder_open (&builder, G_VARIANT_TYPE ("a{sv}"));
    *
    *  g_hash_table_iter_init (&iter, some_dict);
    *  while (g_hash_table_iter_next (&iter, (gpointer *) &key, (gpointer *) &value))
    *    {
    *      g_variant_builder_open (&builder, G_VARIANT_TYPE ("{sv}"));
    *      g_variant_builder_add (&builder, "s", key);
    *      g_variant_builder_add (&builder, "v", value);
    *      g_variant_builder_close (&builder);
    *    }
    *
    *  g_variant_builder_close (&builder);
    *
    *  output = g_variant_builder_end (&builder);
    *  ]|
    *
    *  NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT BE APPLICABLE TO SCALA
    */
  def open(
      `type`: sn.gnome.glib.VariantType /* Some(Ptr[GVariantType]) */
  ): Unit /* None */ =
    g_variant_builder_open(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GVariantBuilder]],
      `type`.getUnsafeRawPointer().asInstanceOf
    )
  end open

  /** Increases the reference count on @builder.
    *
    * Don't call this on stack-allocated #GVariantBuilder instances or bad
    * things will happen.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def ref(): sn.gnome.glib.VariantBuilder /* None */ =
    sn.gnome.glib.VariantBuilder.fromRaw(
      g_variant_builder_ref(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GVariantBuilder]]
      )
    )
  end ref

  /** Decreases the reference count on @builder.
    *
    * In the event that there are no more references, releases all memory
    * associated with the #GVariantBuilder.
    *
    * Don't call this on stack-allocated #GVariantBuilder instances or bad
    * things will happen.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unref(): Unit /* None */ =
    g_variant_builder_unref(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GVariantBuilder]]
    )
  end unref

end VariantBuilder

object VariantBuilder:
  def fromRaw(ptr: Ptr[GVariantBuilder]): VariantBuilder = new VariantBuilder(
    ptr
  )
end VariantBuilder
