package sn.gnome.glib

import _root_.sn.gnome.glib.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.SequenceIter
import sn.gnome.glib.internal.{GSequence, gboolean, gint, gpointer}

/** The #GSequence struct is an opaque data type representing a
  * [sequence][glib-Sequences] data type.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class Sequence private[gnome] (raw: Ptr[GSequence]):

  def getUnsafeRawPointer(): Ptr[GSequence] = this.raw

  /** Adds a new item to the end of @seq.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def append(
      data: Option[Ptr[Byte] /* Some(gpointer) */ ]
  ): sn.gnome.glib.SequenceIter /* None */ =
    sn.gnome.glib.SequenceIter.fromRaw(
      g_sequence_append(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GSequence]],
        data
          .map[gpointer](o => gpointer(o))
          .getOrElse(null.asInstanceOf[gpointer])
      )
    )
  end append

  /** Calls @func for each item in the sequence passing @user_data to the
    * function. @func must not modify the sequence itself.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method foreach/<method parameters>/func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Func), @type -> DataRecord(GFunc)))"
  )
  private def foreach__ = ???

  /** Frees the memory allocated for @seq. If @seq has a data destroy function
    * associated with it, that function is called on all items in @seq.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def free(): Unit /* None */ =
    g_sequence_free(this.getUnsafeRawPointer().asInstanceOf[Ptr[GSequence]])
  end free

  /** Returns the begin iterator for @seq.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getBeginIter(): sn.gnome.glib.SequenceIter /* None */ =
    sn.gnome.glib.SequenceIter.fromRaw(
      g_sequence_get_begin_iter(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GSequence]]
      )
    )
  end getBeginIter

  /** Returns the end iterator for @seg
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getEndIter(): sn.gnome.glib.SequenceIter /* None */ =
    sn.gnome.glib.SequenceIter.fromRaw(
      g_sequence_get_end_iter(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GSequence]]
      )
    )
  end getEndIter

  /** Returns the iterator at position @pos. If @pos is negative or larger than
    * the number of items in @seq, the end iterator is returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getIterAtPos(
      pos: Int /* Some(gint) */
  ): sn.gnome.glib.SequenceIter /* None */ =
    sn.gnome.glib.SequenceIter.fromRaw(
      g_sequence_get_iter_at_pos(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GSequence]],
        gint(pos)
      )
    )
  end getIterAtPos

  /** Returns the positive length (>= 0) of @seq. Note that this method is O(h)
    * where `h' is the height of the tree. It is thus more efficient to use
    * g_sequence_is_empty() when comparing the length to zero.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getLength(): Int /* None */ =
    g_sequence_get_length(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GSequence]]
    ).value
  end getLength

  /** Inserts @data into @seq using @cmp_func to determine the new position. The
    * sequence must already be sorted according to @cmp_func; otherwise the new
    * position of @data is undefined.
    *
    * @cmp_func
    *   is called with two items of the @seq, and @cmp_data. It should return 0
    *   if the items are equal, a negative value if the first item comes before
    *   the second, and a positive value if the second item comes before the
    *   first.
    *
    * Note that when adding a large amount of data to a #GSequence, it is more
    * efficient to do unsorted insertions and then call g_sequence_sort() or
    * g_sequence_sort_iter().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method insert_sorted/<method parameters>/cmp_func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(CompareDataFunc), @type -> DataRecord(GCompareDataFunc)))"
  )
  private def insertSorted__ = ???

  /** Like g_sequence_insert_sorted(), but uses a #GSequenceIterCompareFunc
    * instead of a #GCompareDataFunc as the compare function.
    *
    * @iter_cmp
    *   is called with two iterators pointing into @seq. It should return 0 if
    *   the iterators are equal, a negative value if the first iterator comes
    *   before the second, and a positive value if the second iterator comes
    *   before the first.
    *
    * Note that when adding a large amount of data to a #GSequence, it is more
    * efficient to do unsorted insertions and then call g_sequence_sort() or
    * g_sequence_sort_iter().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method insert_sorted_iter/<method parameters>/iter_cmp]: Cannot render type Type(List(),ListMap(@name -> DataRecord(SequenceIterCompareFunc), @type -> DataRecord(GSequenceIterCompareFunc)))"
  )
  private def insertSortedIter__ = ???

  /** Returns %TRUE if the sequence contains zero items.
    *
    * This function is functionally identical to checking the result of
    * g_sequence_get_length() being equal to zero. However this function is
    * implemented in O(1) running time.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isEmpty(): Boolean /* None */ =
    g_sequence_is_empty(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GSequence]]
    ).value.!=(0)
  end isEmpty

  /** Returns an iterator pointing to the position of the first item found equal
    * to @data according to @cmp_func and @cmp_data. If more than one item is
    * equal, it is not guaranteed that it is the first which is returned. In
    * that case, you can use g_sequence_iter_next() and g_sequence_iter_prev()
    * to get others.
    *
    * @cmp_func
    *   is called with two items of the @seq, and @cmp_data. It should return 0
    *   if the items are equal, a negative value if the first item comes before
    *   the second, and a positive value if the second item comes before the
    *   first.
    *
    * This function will fail if the data contained in the sequence is unsorted.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method lookup/<method parameters>/cmp_func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(CompareDataFunc), @type -> DataRecord(GCompareDataFunc)))"
  )
  private def lookup__ = ???

  /** Like g_sequence_lookup(), but uses a #GSequenceIterCompareFunc instead of
    * a #GCompareDataFunc as the compare function.
    *
    * @iter_cmp
    *   is called with two iterators pointing into @seq. It should return 0 if
    *   the iterators are equal, a negative value if the first iterator comes
    *   before the second, and a positive value if the second iterator comes
    *   before the first.
    *
    * This function will fail if the data contained in the sequence is unsorted.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method lookup_iter/<method parameters>/iter_cmp]: Cannot render type Type(List(),ListMap(@name -> DataRecord(SequenceIterCompareFunc), @type -> DataRecord(GSequenceIterCompareFunc)))"
  )
  private def lookupIter__ = ???

  /** Adds a new item to the front of @seq
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def prepend(
      data: Option[Ptr[Byte] /* Some(gpointer) */ ]
  ): sn.gnome.glib.SequenceIter /* None */ =
    sn.gnome.glib.SequenceIter.fromRaw(
      g_sequence_prepend(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GSequence]],
        data
          .map[gpointer](o => gpointer(o))
          .getOrElse(null.asInstanceOf[gpointer])
      )
    )
  end prepend

  /** Returns an iterator pointing to the position where @data would be inserted
    * according to @cmp_func and @cmp_data.
    *
    * @cmp_func
    *   is called with two items of the @seq, and @cmp_data. It should return 0
    *   if the items are equal, a negative value if the first item comes before
    *   the second, and a positive value if the second item comes before the
    *   first.
    *
    * If you are simply searching for an existing element of the sequence,
    * consider using g_sequence_lookup().
    *
    * This function will fail if the data contained in the sequence is unsorted.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method search/<method parameters>/cmp_func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(CompareDataFunc), @type -> DataRecord(GCompareDataFunc)))"
  )
  private def search__ = ???

  /** Like g_sequence_search(), but uses a #GSequenceIterCompareFunc instead of
    * a #GCompareDataFunc as the compare function.
    *
    * @iter_cmp
    *   is called with two iterators pointing into @seq. It should return 0 if
    *   the iterators are equal, a negative value if the first iterator comes
    *   before the second, and a positive value if the second iterator comes
    *   before the first.
    *
    * If you are simply searching for an existing element of the sequence,
    * consider using g_sequence_lookup_iter().
    *
    * This function will fail if the data contained in the sequence is unsorted.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method search_iter/<method parameters>/iter_cmp]: Cannot render type Type(List(),ListMap(@name -> DataRecord(SequenceIterCompareFunc), @type -> DataRecord(GSequenceIterCompareFunc)))"
  )
  private def searchIter__ = ???

  /** Sorts @seq using @cmp_func.
    *
    * @cmp_func
    *   is passed two items of @seq and should return 0 if they are equal, a
    *   negative value if the first comes before the second, and a positive
    *   value if the second comes before the first.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method sort/<method parameters>/cmp_func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(CompareDataFunc), @type -> DataRecord(GCompareDataFunc)))"
  )
  private def sort__ = ???

  /** Like g_sequence_sort(), but uses a #GSequenceIterCompareFunc instead of a
    * #GCompareDataFunc as the compare function
    *
    * @cmp_func
    *   is called with two iterators pointing into @seq. It should return 0 if
    *   the iterators are equal, a negative value if the first iterator comes
    *   before the second, and a positive value if the second iterator comes
    *   before the first.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method sort_iter/<method parameters>/cmp_func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(SequenceIterCompareFunc), @type -> DataRecord(GSequenceIterCompareFunc)))"
  )
  private def sortIter__ = ???

end Sequence

object Sequence:
  def fromRaw(ptr: Ptr[GSequence]): Sequence = new Sequence(ptr)
end Sequence
