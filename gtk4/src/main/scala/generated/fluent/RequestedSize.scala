package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.gpointer
import sn.gnome.gtk4.internal.GtkRequestedSize

/** Represents a request of a screen object in a given orientation. These are
  * primarily used in container implementations when allocating a natural size
  * for children calling. See [func@distribute_natural_allocation].
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class RequestedSize private[gnome] (raw: Ptr[GtkRequestedSize]):

  def getUnsafeRawPointer(): Ptr[GtkRequestedSize] = this.raw

  /** A client pointer
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def data: Ptr[Byte] /* None */ =
    (!raw).data.asInstanceOf[_root_.sn.gnome.glib.internal.gpointer]

  /** A client pointer
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def data_=(value: Ptr[Byte] /* None */ ): Unit = (!raw).data_=(
    gpointer(value).asInstanceOf[_root_.sn.gnome.glib.internal.gpointer]
  )

  /** The minimum size needed for allocation in a given orientation
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def minimumSize: Int /* None */ = (!raw).minimum_size.asInstanceOf[CInt]

  /** The minimum size needed for allocation in a given orientation
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def minimumSize_=(value: Int /* None */ ): Unit =
    (!raw).minimum_size_=(value.asInstanceOf[CInt])

  /** The natural size for allocation in a given orientation
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def naturalSize: Int /* None */ = (!raw).natural_size.asInstanceOf[CInt]

  /** The natural size for allocation in a given orientation
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def naturalSize_=(value: Int /* None */ ): Unit =
    (!raw).natural_size_=(value.asInstanceOf[CInt])
end RequestedSize

object RequestedSize:
  def fromRaw(ptr: Ptr[GtkRequestedSize]): RequestedSize = new RequestedSize(
    ptr
  )
end RequestedSize
