package sn.gnome.glib

import _root_.sn.gnome.glib.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.{GPtrArray, guint}

/** Contains the public fields of a pointer array.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class PtrArray private[gnome] (raw: Ptr[GPtrArray]):

  def getUnsafeRawPointer(): Ptr[GPtrArray] = this.raw

  /** points to the array of pointers, which may be moved when the array grows
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[field pdata]: Cannot render type Type(List(),ListMap(@name -> DataRecord(gpointer), @type -> DataRecord(gpointer*)))"
  )
  private def pdata__ = ???

  /** number of pointers in the array
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def len: UInt /* None */ = (!raw).len.asInstanceOf[guint]

  /** number of pointers in the array
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def len_=(value: UInt /* None */ ): Unit =
    (!raw).len_=(guint(value).asInstanceOf[guint])
end PtrArray

object PtrArray:
  def fromRaw(ptr: Ptr[GPtrArray]): PtrArray = new PtrArray(ptr)
end PtrArray
