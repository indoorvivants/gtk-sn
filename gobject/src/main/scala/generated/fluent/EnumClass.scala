package sn.gnome.gobject

import _root_.sn.gnome.gobject.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.{gint, guint}
import sn.gnome.gobject.{EnumValue, TypeClass}
import sn.gnome.gobject.internal.GEnumClass

/** The class of an enumeration type holds information about its possible
  * values.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class EnumClass private[gnome] (raw: Ptr[GEnumClass]):

  def getUnsafeRawPointer(): Ptr[GEnumClass] = this.raw

  /** the parent class
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def gTypeClass: sn.gnome.gobject.TypeClass /* None */ =
    (!raw).g_type_class.asInstanceOf[GTypeClass]

  /** the parent class
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def gTypeClass_=(value: sn.gnome.gobject.TypeClass /* None */ ): Unit =
    (!raw).g_type_class_=(
      value.getUnsafeRawPointer().asInstanceOf.asInstanceOf[GTypeClass]
    )

  /** the smallest possible value.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def minimum: Int /* None */ =
    (!raw).minimum.asInstanceOf[_root_.sn.gnome.glib.internal.gint]

  /** the smallest possible value.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def minimum_=(value: Int /* None */ ): Unit = (!raw).minimum_=(
    gint(value).asInstanceOf[_root_.sn.gnome.glib.internal.gint]
  )

  /** the largest possible value.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def maximum: Int /* None */ =
    (!raw).maximum.asInstanceOf[_root_.sn.gnome.glib.internal.gint]

  /** the largest possible value.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def maximum_=(value: Int /* None */ ): Unit = (!raw).maximum_=(
    gint(value).asInstanceOf[_root_.sn.gnome.glib.internal.gint]
  )

  /** the number of possible values.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def nValues: UInt /* None */ =
    (!raw).n_values.asInstanceOf[_root_.sn.gnome.glib.internal.guint]

  /** the number of possible values.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def nValues_=(value: UInt /* None */ ): Unit = (!raw).n_values_=(
    guint(value).asInstanceOf[_root_.sn.gnome.glib.internal.guint]
  )

  /** an array of #GEnumValue structs describing the individual values.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def values: sn.gnome.gobject.EnumValue /* None */ =
    (!raw).values.asInstanceOf[Ptr[GEnumValue]]

  /** an array of #GEnumValue structs describing the individual values.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def values_=(value: sn.gnome.gobject.EnumValue /* None */ ): Unit =
    (!raw).values_=(
      value.getUnsafeRawPointer().asInstanceOf.asInstanceOf[Ptr[GEnumValue]]
    )
end EnumClass

object EnumClass:
  def fromRaw(ptr: Ptr[GEnumClass]): EnumClass = new EnumClass(ptr)
end EnumClass
