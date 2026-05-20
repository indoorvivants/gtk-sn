package sn.gnome.glib

import _root_.sn.gnome.glib.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.List
import sn.gnome.glib.internal.{GList, gpointer}

/** The #GList struct is used for each element in a doubly-linked list.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class List private[gnome] (raw: Ptr[GList]):

  def getUnsafeRawPointer(): Ptr[GList] = this.raw

  /** holds the element's data, which can be a pointer to any kind of data, or
    * any integer value using the [Type Conversion
    * Macros][glib-Type-Conversion-Macros]
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def data: Ptr[Byte] /* None */ = (!raw).data.asInstanceOf[gpointer]

  /** holds the element's data, which can be a pointer to any kind of data, or
    * any integer value using the [Type Conversion
    * Macros][glib-Type-Conversion-Macros]
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def data_=(value: Ptr[Byte] /* None */ ): Unit =
    (!raw).data_=(gpointer(value).asInstanceOf[gpointer])

  /** contains the link to the next element in the list
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def next: sn.gnome.glib.List /* None */ = (!raw).next.asInstanceOf[Ptr[GList]]

  /** contains the link to the next element in the list
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def next_=(value: sn.gnome.glib.List /* None */ ): Unit = (!raw).next_=(
    value.getUnsafeRawPointer().asInstanceOf.asInstanceOf[Ptr[GList]]
  )

  /** contains the link to the previous element in the list
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def prev: sn.gnome.glib.List /* None */ = (!raw).prev.asInstanceOf[Ptr[GList]]

  /** contains the link to the previous element in the list
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def prev_=(value: sn.gnome.glib.List /* None */ ): Unit = (!raw).prev_=(
    value.getUnsafeRawPointer().asInstanceOf.asInstanceOf[Ptr[GList]]
  )
end List

object List:
  def fromRaw(ptr: Ptr[GList]): List = new List(ptr)
end List
