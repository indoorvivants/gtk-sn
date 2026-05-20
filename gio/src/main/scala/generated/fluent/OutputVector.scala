package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.internal.GOutputVector
import sn.gnome.glib.internal.{gconstpointer, gsize}

/** Structure used for scatter/gather data output. You generally pass in an
  * array of #GOutputVectors and the operation will use all the buffers as if
  * they were one buffer.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class OutputVector private[gnome] (raw: Ptr[GOutputVector]):

  def getUnsafeRawPointer(): Ptr[GOutputVector] = this.raw

  /** Pointer to a buffer of data to read.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def buffer: Ptr[Byte] /* None */ =
    (!raw).buffer.asInstanceOf[_root_.sn.gnome.glib.internal.gconstpointer]

  /** Pointer to a buffer of data to read.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def buffer_=(value: Ptr[Byte] /* None */ ): Unit = (!raw).buffer_=(
    gconstpointer(value)
      .asInstanceOf[_root_.sn.gnome.glib.internal.gconstpointer]
  )

  /** the size of @buffer.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def size: CUnsignedLongInt /* None */ =
    (!raw).size.asInstanceOf[_root_.sn.gnome.glib.internal.gsize]

  /** the size of @buffer.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def size_=(value: CUnsignedLongInt /* None */ ): Unit = (!raw).size_=(
    gsize(value).asInstanceOf[_root_.sn.gnome.glib.internal.gsize]
  )
end OutputVector

object OutputVector:
  def fromRaw(ptr: Ptr[GOutputVector]): OutputVector = new OutputVector(ptr)
end OutputVector
