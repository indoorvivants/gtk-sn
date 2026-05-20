package sn.gnome.glib

import _root_.sn.gnome.glib.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.{GByteArray, guint}

/** Contains the public fields of a GByteArray.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ByteArray private[gnome] (raw: Ptr[GByteArray]):

  def getUnsafeRawPointer(): Ptr[GByteArray] = this.raw

  /** a pointer to the element data. The data may be moved as elements are added
    * to the #GByteArray
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[field data]: Cannot render type Type(List(),ListMap(@name -> DataRecord(guint8), @type -> DataRecord(guint8*)))"
  )
  private def data__ = ???

  /** the number of elements in the #GByteArray
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def len: UInt /* None */ = (!raw).len.asInstanceOf[guint]

  /** the number of elements in the #GByteArray
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def len_=(value: UInt /* None */ ): Unit =
    (!raw).len_=(guint(value).asInstanceOf[guint])
end ByteArray

object ByteArray:
  def fromRaw(ptr: Ptr[GByteArray]): ByteArray = new ByteArray(ptr)
end ByteArray
