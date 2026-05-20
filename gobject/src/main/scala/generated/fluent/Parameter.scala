package sn.gnome.gobject

import _root_.sn.gnome.gobject.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.gchar
import sn.gnome.gobject.Value
import sn.gnome.gobject.internal.GParameter
import sn.gnome.runtime.*

/** The GParameter struct is an auxiliary structure used to hand parameter
  * name/value pairs to g_object_newv().
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class Parameter private[gnome] (raw: Ptr[GParameter]):

  def getUnsafeRawPointer(): Ptr[GParameter] = this.raw

  /** the parameter name
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def name: scala.Predef.String /* None */ =
    (!raw).name.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]

  /** the parameter name
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def name_=(value: scala.Predef.String /* None */ )(using Zone): Unit =
    (!raw).name_=(
      toCString(value)
        .asInstanceOf[Ptr[gchar]]
        .asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]
    )

  /** the parameter value
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def value(using Runtime): sn.gnome.gobject.Value /* None */ =
    (!raw).value.asInstanceOf[GValue]

  /** the parameter value
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def value_=(value: sn.gnome.gobject.Value /* None */ )(using Runtime): Unit =
    (!raw).value_=(
      value.getUnsafeRawPointer().asInstanceOf.asInstanceOf[GValue]
    )
end Parameter

object Parameter:
  def fromRaw(ptr: Ptr[GParameter]): Parameter = new Parameter(ptr)
end Parameter
