package sn.gnome.gobject

import _root_.sn.gnome.gobject.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.{gchar, guint}
import sn.gnome.gobject.internal.{GType, GTypeQuery}

/** A structure holding information for a specific type.
  *
  * See also: g_type_query()
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class TypeQuery private[gnome] (raw: Ptr[GTypeQuery]):

  def getUnsafeRawPointer(): Ptr[GTypeQuery] = this.raw

  /** the #GType value of the type
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def `type`: GType /* None */ = (!raw).`type`.asInstanceOf[GType]

  /** the #GType value of the type
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def type_=(value: GType /* None */ ): Unit =
    (!raw).type_=(value.asInstanceOf[GType])

  /** the name of the type
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def typeName: scala.Predef.String /* None */ =
    (!raw).type_name.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]

  /** the name of the type
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def typeName_=(value: scala.Predef.String /* None */ )(using Zone): Unit =
    (!raw).type_name_=(
      toCString(value)
        .asInstanceOf[Ptr[gchar]]
        .asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]
    )

  /** the size of the class structure
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def classSize: UInt /* None */ =
    (!raw).class_size.asInstanceOf[_root_.sn.gnome.glib.internal.guint]

  /** the size of the class structure
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def classSize_=(value: UInt /* None */ ): Unit = (!raw).class_size_=(
    guint(value).asInstanceOf[_root_.sn.gnome.glib.internal.guint]
  )

  /** the size of the instance structure
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def instanceSize: UInt /* None */ =
    (!raw).instance_size.asInstanceOf[_root_.sn.gnome.glib.internal.guint]

  /** the size of the instance structure
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def instanceSize_=(value: UInt /* None */ ): Unit = (!raw).instance_size_=(
    guint(value).asInstanceOf[_root_.sn.gnome.glib.internal.guint]
  )
end TypeQuery

object TypeQuery:
  def fromRaw(ptr: Ptr[GTypeQuery]): TypeQuery = new TypeQuery(ptr)
end TypeQuery
