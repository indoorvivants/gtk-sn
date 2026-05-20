package sn.gnome.gobject

import _root_.sn.gnome.gobject.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.{gchar, guint}
import sn.gnome.gobject.internal.GFlagsValue

/** A structure which contains a single flags value, its name, and its nickname.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class FlagsValue private[gnome] (raw: Ptr[GFlagsValue]):

  def getUnsafeRawPointer(): Ptr[GFlagsValue] = this.raw

  /** the flags value
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def value: UInt /* None */ =
    (!raw).value.asInstanceOf[_root_.sn.gnome.glib.internal.guint]

  /** the flags value
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def value_=(value: UInt /* None */ ): Unit = (!raw).value_=(
    guint(value).asInstanceOf[_root_.sn.gnome.glib.internal.guint]
  )

  /** the name of the value
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def valueName: scala.Predef.String /* None */ =
    (!raw).value_name.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]

  /** the name of the value
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def valueName_=(value: scala.Predef.String /* None */ )(using Zone): Unit =
    (!raw).value_name_=(
      toCString(value)
        .asInstanceOf[Ptr[gchar]]
        .asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]
    )

  /** the nickname of the value
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def valueNick: scala.Predef.String /* None */ =
    (!raw).value_nick.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]

  /** the nickname of the value
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def valueNick_=(value: scala.Predef.String /* None */ )(using Zone): Unit =
    (!raw).value_nick_=(
      toCString(value)
        .asInstanceOf[Ptr[gchar]]
        .asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]
    )
end FlagsValue

object FlagsValue:
  def fromRaw(ptr: Ptr[GFlagsValue]): FlagsValue = new FlagsValue(ptr)
end FlagsValue
