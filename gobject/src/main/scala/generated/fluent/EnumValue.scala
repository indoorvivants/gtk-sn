package sn.gnome.gobject

import _root_.sn.gnome.gobject.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.{gchar, gint}
import sn.gnome.gobject.internal.GEnumValue

/** A structure which contains a single enum value, its name, and its nickname.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class EnumValue private[gnome] (raw: Ptr[GEnumValue]):

  def getUnsafeRawPointer(): Ptr[GEnumValue] = this.raw

  /** the enum value
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def value: Int /* None */ =
    (!raw).value.asInstanceOf[_root_.sn.gnome.glib.internal.gint]

  /** the enum value
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def value_=(value: Int /* None */ ): Unit =
    (!raw).value_=(gint(value).asInstanceOf[_root_.sn.gnome.glib.internal.gint])

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
end EnumValue

object EnumValue:
  def fromRaw(ptr: Ptr[GEnumValue]): EnumValue = new EnumValue(ptr)
end EnumValue
