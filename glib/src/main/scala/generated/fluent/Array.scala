package sn.gnome.glib

import _root_.sn.gnome.glib.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.{GArray, gchar, guint}

/** Contains the public fields of a GArray.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class Array private[gnome] (raw: Ptr[GArray]):

  def getUnsafeRawPointer(): Ptr[GArray] = this.raw

  /** a pointer to the element data. The data may be moved as elements are added
    * to the #GArray.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def data(using Zone): scala.Predef.String /* None */ =
    (!raw).data.asInstanceOf[Ptr[gchar]]

  /** a pointer to the element data. The data may be moved as elements are added
    * to the #GArray.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def data_=(value: scala.Predef.String /* None */ )(using Zone): Unit =
    (!raw).data_=(
      toCString(value).asInstanceOf[Ptr[gchar]].asInstanceOf[Ptr[gchar]]
    )

  /** the number of elements in the #GArray not including the possible
    * terminating zero element.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def len: UInt /* None */ = (!raw).len.asInstanceOf[guint]

  /** the number of elements in the #GArray not including the possible
    * terminating zero element.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def len_=(value: UInt /* None */ ): Unit =
    (!raw).len_=(guint(value).asInstanceOf[guint])
end Array

object Array:
  def fromRaw(ptr: Ptr[GArray]): Array = new Array(ptr)
end Array
