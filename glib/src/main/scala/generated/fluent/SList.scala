package sn.gnome.glib

import _root_.sn.gnome.glib.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.SList
import sn.gnome.glib.internal.{GSList, gpointer}

/** The #GSList struct is used for each element in the singly-linked list.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class SList private[gnome] (raw: Ptr[GSList]):

  def getUnsafeRawPointer(): Ptr[GSList] = this.raw

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

  /** contains the link to the next element in the list.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def next: sn.gnome.glib.SList /* None */ =
    (!raw).next.asInstanceOf[Ptr[GSList]]

  /** contains the link to the next element in the list.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def next_=(value: sn.gnome.glib.SList /* None */ ): Unit = (!raw).next_=(
    value.getUnsafeRawPointer().asInstanceOf.asInstanceOf[Ptr[GSList]]
  )
end SList

object SList:
  def fromRaw(ptr: Ptr[GSList]): SList = new SList(ptr)
end SList
