package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.{FileAttributeInfoFlags, FileAttributeType}
import sn.gnome.gio.internal.GFileAttributeInfo

/** Information about a specific attribute.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class FileAttributeInfo private[gnome] (raw: Ptr[GFileAttributeInfo]):

  def getUnsafeRawPointer(): Ptr[GFileAttributeInfo] = this.raw

  /** the name of the attribute.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def name: scala.Predef.String /* None */ = (!raw).name.asInstanceOf[CString]

  /** the name of the attribute.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def name_=(value: scala.Predef.String /* None */ )(using Zone): Unit =
    (!raw).name_=(toCString(value).asInstanceOf[CString])

  /** the #GFileAttributeType type of the attribute.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def `type`: sn.gnome.gio.FileAttributeType /* None */ =
    (!raw).`type`.asInstanceOf[GFileAttributeType]

  /** the #GFileAttributeType type of the attribute.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def type_=(value: sn.gnome.gio.FileAttributeType /* None */ ): Unit =
    (!raw).type_=(value.raw.asInstanceOf[GFileAttributeType])

  /** a set of #GFileAttributeInfoFlags.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def flags: sn.gnome.gio.FileAttributeInfoFlags /* None */ =
    (!raw).flags.asInstanceOf[GFileAttributeInfoFlags]

  /** a set of #GFileAttributeInfoFlags.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def flags_=(value: sn.gnome.gio.FileAttributeInfoFlags /* None */ ): Unit =
    (!raw).flags_=(value.raw.value.asInstanceOf[GFileAttributeInfoFlags])
end FileAttributeInfo

object FileAttributeInfo:
  def fromRaw(ptr: Ptr[GFileAttributeInfo]): FileAttributeInfo =
    new FileAttributeInfo(ptr)
end FileAttributeInfo
