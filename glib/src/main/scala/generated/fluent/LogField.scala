package sn.gnome.glib

import _root_.sn.gnome.glib.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.{GLogField, gchar, gconstpointer, gssize}

/** Structure representing a single field in a structured log entry. See
  * g_log_structured() for details.
  *
  * Log fields may contain arbitrary values, including binary with embedded nul
  * bytes. If the field contains a string, the string must be UTF-8 encoded and
  * have a trailing nul byte. Otherwise, @length must be set to a non-negative
  * value.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class LogField private[gnome] (raw: Ptr[GLogField]):

  def getUnsafeRawPointer(): Ptr[GLogField] = this.raw

  /** field name (UTF-8 string)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def key: scala.Predef.String /* None */ = (!raw).key.asInstanceOf[Ptr[gchar]]

  /** field name (UTF-8 string)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def key_=(value: scala.Predef.String /* None */ )(using Zone): Unit =
    (!raw).key_=(
      toCString(value).asInstanceOf[Ptr[gchar]].asInstanceOf[Ptr[gchar]]
    )

  /** field value (arbitrary bytes)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def value: Ptr[Byte] /* None */ = (!raw).value.asInstanceOf[gconstpointer]

  /** field value (arbitrary bytes)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def value_=(value: Ptr[Byte] /* None */ ): Unit =
    (!raw).value_=(gconstpointer(value).asInstanceOf[gconstpointer])

  /** length of @value, in bytes, or -1 if it is nul-terminated
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def length: CLongInt /* None */ = (!raw).length.asInstanceOf[gssize]

  /** length of @value, in bytes, or -1 if it is nul-terminated
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def length_=(value: CLongInt /* None */ ): Unit =
    (!raw).length_=(gssize(value).asInstanceOf[gssize])
end LogField

object LogField:
  def fromRaw(ptr: Ptr[GLogField]): LogField = new LogField(ptr)
end LogField
