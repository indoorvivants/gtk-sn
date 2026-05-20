package sn.gnome.glib

import _root_.sn.gnome.glib.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.Rand
import sn.gnome.glib.internal.{GRand, gdouble, gint32, guint32}

/** The GRand struct is an opaque data structure. It should only be accessed
  * through the g_rand_* functions.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class Rand private[gnome] (raw: Ptr[GRand]):

  def getUnsafeRawPointer(): Ptr[GRand] = this.raw

  /** Copies a #GRand into a new one with the same exact state as before. This
    * way you can take a snapshot of the random number generator for replaying
    * later.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def copy(): sn.gnome.glib.Rand /* None */ =
    sn.gnome.glib.Rand
      .fromRaw(g_rand_copy(this.getUnsafeRawPointer().asInstanceOf[Ptr[GRand]]))
  end copy

  /** Returns the next random #gdouble from @rand_ equally distributed over the
    * range [0..1).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def double(): Double /* None */ =
    g_rand_double(this.getUnsafeRawPointer().asInstanceOf[Ptr[GRand]]).value
  end double

  /** Returns the next random #gdouble from @rand_ equally distributed over the
    * range [@begin..@end).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def doubleRange(
      begin: Double /* Some(gdouble) */,
      end: Double /* Some(gdouble) */
  ): Double /* None */ =
    g_rand_double_range(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GRand]],
      gdouble(begin),
      gdouble(end)
    ).value
  end doubleRange

  /** Frees the memory allocated for the #GRand.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def free(): Unit /* None */ =
    g_rand_free(this.getUnsafeRawPointer().asInstanceOf[Ptr[GRand]])
  end free

  /** Returns the next random #guint32 from @rand_ equally distributed over the
    * range [0..2^32-1].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def int(): UInt /* None */ =
    g_rand_int(this.getUnsafeRawPointer().asInstanceOf[Ptr[GRand]]).value
  end int

  /** Returns the next random #gint32 from @rand_ equally distributed over the
    * range [@begin..@end-1].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def intRange(
      begin: CInt /* Some(gint32) */,
      end: CInt /* Some(gint32) */
  ): CInt /* None */ =
    g_rand_int_range(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GRand]],
      gint32(begin),
      gint32(end)
    ).value
  end intRange

  /** Sets the seed for the random number generator #GRand to @seed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setSeed(seed: UInt /* Some(guint32) */ ): Unit /* None */ =
    g_rand_set_seed(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GRand]],
      guint32(seed)
    )
  end setSeed

  /** Initializes the random number generator by an array of longs. Array can be
    * of arbitrary size, though only the first 624 values are taken. This
    * function is useful if you have many low entropy seeds, or if you require
    * more then 32 bits of actual entropy for your application.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_seed_array/<method parameters>/seed]: Cannot render type Type(List(),ListMap(@name -> DataRecord(guint32), @type -> DataRecord(const guint32*)))"
  )
  private def setSeedArray__ = ???

end Rand

object Rand:
  def fromRaw(ptr: Ptr[GRand]): Rand = new Rand(ptr)
end Rand
