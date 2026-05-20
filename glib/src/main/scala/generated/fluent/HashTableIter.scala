package sn.gnome.glib

import _root_.sn.gnome.glib.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.HashTable
import sn.gnome.glib.internal.{GHashTableIter, gpointer}

/** A GHashTableIter structure represents an iterator that can be used to
  * iterate over the elements of a #GHashTable. GHashTableIter structures are
  * typically allocated on the stack and then initialized with
  * g_hash_table_iter_init().
  *
  * The iteration order of a #GHashTableIter over the keys/values in a hash
  * table is not defined.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class HashTableIter private[gnome] (raw: Ptr[GHashTableIter]):

  def getUnsafeRawPointer(): Ptr[GHashTableIter] = this.raw

  /** Returns the #GHashTable associated with @iter.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getHashTable(): sn.gnome.glib.HashTable /* None */ =
    sn.gnome.glib.HashTable.fromRaw(
      g_hash_table_iter_get_hash_table(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GHashTableIter]]
      )
    )
  end getHashTable

  /**  Initializes a key/value pair iterator and associates it with
    *  @hash_table. Modifying the hash table after calling this function
    *  invalidates the returned iterator.
    *
    *  The iteration order of a #GHashTableIter over the keys/values in a hash
    *  table is not defined.
    *
    *  |[<!-- language="C" -->
    *  GHashTableIter iter;
    *  gpointer key, value;
    *
    *  g_hash_table_iter_init (&iter, hash_table);
    *  while (g_hash_table_iter_next (&iter, &key, &value))
    *    {
    *      // do something with key and value
    *    }
    *  ]|
    *
    *  NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT BE APPLICABLE TO SCALA
    */
  def init(
      hash_table: sn.gnome.glib.HashTable /* Some(Ptr[GHashTable]) */
  ): Unit /* None */ =
    g_hash_table_iter_init(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GHashTableIter]],
      hash_table.getUnsafeRawPointer().asInstanceOf
    )
  end init

  /** Advances @iter and retrieves the key and/or value that are now pointed to
    * as a result of this advancement. If %FALSE is returned,
    * @key
    *   and @value are not set, and the iterator becomes invalid.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method next]: Method next contains an OUT parameter, which is not supported yet"
  )
  private def next__ = ???

  /**  Removes the key/value pair currently pointed to by the iterator
    *  from its associated #GHashTable. Can only be called after
    *  g_hash_table_iter_next() returned %TRUE, and cannot be called
    *  more than once for the same key/value pair.
    *
    *  If the #GHashTable was created using g_hash_table_new_full(),
    *  the key and value are freed using the supplied destroy functions,
    *  otherwise you have to make sure that any dynamically allocated
    *  values are freed yourself.
    *
    *  It is safe to continue iterating the #GHashTable afterward:
    *  |[<!-- language="C" -->
    *  while (g_hash_table_iter_next (&iter, &key, &value))
    *    {
    *      if (condition)
    *        g_hash_table_iter_remove (&iter);
    *    }
    *  ]|
    *
    *  NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT BE APPLICABLE TO SCALA
    */
  def remove(): Unit /* None */ =
    g_hash_table_iter_remove(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GHashTableIter]]
    )
  end remove

  /** Replaces the value currently pointed to by the iterator from its
    * associated #GHashTable. Can only be called after g_hash_table_iter_next()
    * returned %TRUE.
    *
    * If you supplied a @value_destroy_func when creating the #GHashTable, the
    * old value is freed using that function.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def replace(value: Option[Ptr[Byte] /* Some(gpointer) */ ]): Unit /* None */ =
    g_hash_table_iter_replace(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GHashTableIter]],
      value
        .map[gpointer](o => gpointer(o))
        .getOrElse(null.asInstanceOf[gpointer])
    )
  end replace

  /** Removes the key/value pair currently pointed to by the iterator from its
    * associated #GHashTable, without calling the key and value destroy
    * functions. Can only be called after g_hash_table_iter_next() returned
    * %TRUE, and cannot be called more than once for the same key/value pair.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def steal(): Unit /* None */ =
    g_hash_table_iter_steal(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GHashTableIter]]
    )
  end steal

end HashTableIter

object HashTableIter:
  def fromRaw(ptr: Ptr[GHashTableIter]): HashTableIter = new HashTableIter(ptr)
end HashTableIter
