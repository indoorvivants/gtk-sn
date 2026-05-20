package sn.gnome.glib

import _root_.sn.gnome.glib.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.{Sequence, SequenceIter}
import sn.gnome.glib.internal.{GSequenceIter, gboolean, gint}

/** The #GSequenceIter struct is an opaque data type representing an iterator
  * pointing into a #GSequence.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class SequenceIter private[gnome] (raw: Ptr[GSequenceIter]):

  def getUnsafeRawPointer(): Ptr[GSequenceIter] = this.raw

  /** Returns a negative number if @a comes before @b, 0 if they are equal, and
    * a positive number if @a comes after @b.
    *
    * The @a and @b iterators must point into the same sequence.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def compare(
      b: sn.gnome.glib.SequenceIter /* Some(Ptr[GSequenceIter]) */
  ): Int /* None */ =
    g_sequence_iter_compare(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GSequenceIter]],
      b.getUnsafeRawPointer().asInstanceOf
    ).value
  end compare

  /** Returns the position of @iter
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPosition(): Int /* None */ =
    g_sequence_iter_get_position(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GSequenceIter]]
    ).value
  end getPosition

  /** Returns the #GSequence that @iter points into.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSequence(): sn.gnome.glib.Sequence /* None */ =
    sn.gnome.glib.Sequence.fromRaw(
      g_sequence_iter_get_sequence(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GSequenceIter]]
      )
    )
  end getSequence

  /** Returns whether @iter is the begin iterator
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isBegin(): Boolean /* None */ =
    g_sequence_iter_is_begin(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GSequenceIter]]
    ).value.!=(0)
  end isBegin

  /** Returns whether @iter is the end iterator
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isEnd(): Boolean /* None */ =
    g_sequence_iter_is_end(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GSequenceIter]]
    ).value.!=(0)
  end isEnd

  /** Returns the #GSequenceIter which is @delta positions away from @iter. If @iter
    * is closer than -@delta positions to the beginning of the sequence, the
    * begin iterator is returned. If @iter is closer than @delta positions to
    * the end of the sequence, the end iterator is returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def move(
      delta: Int /* Some(gint) */
  ): sn.gnome.glib.SequenceIter /* None */ =
    sn.gnome.glib.SequenceIter.fromRaw(
      g_sequence_iter_move(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GSequenceIter]],
        gint(delta)
      )
    )
  end move

  /** Returns an iterator pointing to the next position after @iter. If @iter is
    * the end iterator, the end iterator is returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def next(): sn.gnome.glib.SequenceIter /* None */ =
    sn.gnome.glib.SequenceIter.fromRaw(
      g_sequence_iter_next(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GSequenceIter]]
      )
    )
  end next

  /** Returns an iterator pointing to the previous position before @iter. If @iter
    * is the begin iterator, the begin iterator is returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def prev(): sn.gnome.glib.SequenceIter /* None */ =
    sn.gnome.glib.SequenceIter.fromRaw(
      g_sequence_iter_prev(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GSequenceIter]]
      )
    )
  end prev

end SequenceIter

object SequenceIter:
  def fromRaw(ptr: Ptr[GSequenceIter]): SequenceIter = new SequenceIter(ptr)
end SequenceIter
