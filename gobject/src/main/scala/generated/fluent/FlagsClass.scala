package sn.gnome.gobject

import _root_.sn.gnome.gobject.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.guint
import sn.gnome.gobject.{FlagsValue, TypeClass}
import sn.gnome.gobject.internal.GFlagsClass

/** The class of a flags type holds information about its possible values.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class FlagsClass private[gnome] (raw: Ptr[GFlagsClass]):

  def getUnsafeRawPointer(): Ptr[GFlagsClass] = this.raw

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

  /** a mask covering all possible values.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def mask: UInt /* None */ =
    (!raw).mask.asInstanceOf[_root_.sn.gnome.glib.internal.guint]

  /** a mask covering all possible values.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def mask_=(value: UInt /* None */ ): Unit = (!raw).mask_=(
    guint(value).asInstanceOf[_root_.sn.gnome.glib.internal.guint]
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

  /** an array of #GFlagsValue structs describing the individual values.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def values: sn.gnome.gobject.FlagsValue /* None */ =
    (!raw).values.asInstanceOf[Ptr[GFlagsValue]]

  /** an array of #GFlagsValue structs describing the individual values.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def values_=(value: sn.gnome.gobject.FlagsValue /* None */ ): Unit =
    (!raw).values_=(
      value.getUnsafeRawPointer().asInstanceOf.asInstanceOf[Ptr[GFlagsValue]]
    )
end FlagsClass

object FlagsClass:
  def fromRaw(ptr: Ptr[GFlagsClass]): FlagsClass = new FlagsClass(ptr)
end FlagsClass
