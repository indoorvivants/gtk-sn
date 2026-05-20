package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.internal.GInputVector
import sn.gnome.glib.internal.{gpointer, gsize}

/** Structure used for scatter/gather data input. You generally pass in an array
  * of #GInputVectors and the operation will store the read data starting in the
  * first buffer, switching to the next as needed.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class InputVector private[gnome] (raw: Ptr[GInputVector]):

  def getUnsafeRawPointer(): Ptr[GInputVector] = this.raw

  /** Pointer to a buffer where data will be written.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def buffer: Ptr[Byte] /* None */ =
    (!raw).buffer.asInstanceOf[_root_.sn.gnome.glib.internal.gpointer]

  /** Pointer to a buffer where data will be written.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def buffer_=(value: Ptr[Byte] /* None */ ): Unit = (!raw).buffer_=(
    gpointer(value).asInstanceOf[_root_.sn.gnome.glib.internal.gpointer]
  )

  /** the available size in @buffer.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def size: CUnsignedLongInt /* None */ =
    (!raw).size.asInstanceOf[_root_.sn.gnome.glib.internal.gsize]

  /** the available size in @buffer.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def size_=(value: CUnsignedLongInt /* None */ ): Unit = (!raw).size_=(
    gsize(value).asInstanceOf[_root_.sn.gnome.glib.internal.gsize]
  )
end InputVector

object InputVector:
  def fromRaw(ptr: Ptr[GInputVector]): InputVector = new InputVector(ptr)
end InputVector
