package sn.gnome.gobject

import _root_.sn.gnome.gobject.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.{ParamSpec, Value}
import sn.gnome.gobject.internal.GObjectConstructParam
import sn.gnome.gobject.runtime.*
import sn.gnome.runtime.*

/** The GObjectConstructParam struct is an auxiliary structure used to hand
  * #GParamSpec/#GValue pairs to the @constructor of a #GObjectClass.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ObjectConstructParam private[gnome] (raw: Ptr[GObjectConstructParam]):

  def getUnsafeRawPointer(): Ptr[GObjectConstructParam] = this.raw

  /** the #GParamSpec of the construct parameter
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def pspec(using Runtime): sn.gnome.gobject.ParamSpec /* None */ =
    (!raw).pspec.asInstanceOf[Ptr[GParamSpec]]

  /** the #GParamSpec of the construct parameter
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def pspec_=(
      value: sn.gnome.gobject.ParamSpec /* None */
  )(using Runtime): Unit = (!raw).pspec_=(
    value.getUnsafeRawPointer().asInstanceOf.asInstanceOf[Ptr[GParamSpec]]
  )

  /** the value to set the parameter to
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def value(using Runtime): sn.gnome.gobject.Value /* None */ =
    (!raw).value.asInstanceOf[Ptr[GValue]]

  /** the value to set the parameter to
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def value_=(value: sn.gnome.gobject.Value /* None */ )(using Runtime): Unit =
    (!raw).value_=(
      value.getUnsafeRawPointer().asInstanceOf.asInstanceOf[Ptr[GValue]]
    )
end ObjectConstructParam

object ObjectConstructParam:
  def fromRaw(ptr: Ptr[GObjectConstructParam]): ObjectConstructParam =
    new ObjectConstructParam(ptr)
end ObjectConstructParam
