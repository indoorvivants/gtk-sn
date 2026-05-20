package sn.gnome.glib

import _root_.sn.gnome.glib.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.TrashStack
import sn.gnome.glib.internal.GTrashStack

/** Each piece of memory that is pushed onto the stack is cast to a
  * GTrashStack*.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class TrashStack private[gnome] (raw: Ptr[GTrashStack]):

  def getUnsafeRawPointer(): Ptr[GTrashStack] = this.raw

  /** pointer to the previous element of the stack, gets stored in the first
    * `sizeof (gpointer)` bytes of the element
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def next: sn.gnome.glib.TrashStack /* None */ =
    (!raw).next.asInstanceOf[Ptr[GTrashStack]]

  /** pointer to the previous element of the stack, gets stored in the first
    * `sizeof (gpointer)` bytes of the element
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def next_=(value: sn.gnome.glib.TrashStack /* None */ ): Unit = (!raw).next_=(
    value.getUnsafeRawPointer().asInstanceOf.asInstanceOf[Ptr[GTrashStack]]
  )
end TrashStack

object TrashStack:
  def fromRaw(ptr: Ptr[GTrashStack]): TrashStack = new TrashStack(ptr)
end TrashStack
