package sn.gnome.glib

import _root_.sn.gnome.glib.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.{GDebugKey, gchar, guint}

/** Associates a string with a bit flag. Used in g_parse_debug_string().
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class DebugKey private[gnome] (raw: Ptr[GDebugKey]):

  def getUnsafeRawPointer(): Ptr[GDebugKey] = this.raw

  /** the string
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def key: scala.Predef.String /* None */ = (!raw).key.asInstanceOf[Ptr[gchar]]

  /** the string
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def key_=(value: scala.Predef.String /* None */ )(using Zone): Unit =
    (!raw).key_=(
      toCString(value).asInstanceOf[Ptr[gchar]].asInstanceOf[Ptr[gchar]]
    )

  /** the flag
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def value: UInt /* None */ = (!raw).value.asInstanceOf[guint]

  /** the flag
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def value_=(value: UInt /* None */ ): Unit =
    (!raw).value_=(guint(value).asInstanceOf[guint])
end DebugKey

object DebugKey:
  def fromRaw(ptr: Ptr[GDebugKey]): DebugKey = new DebugKey(ptr)
end DebugKey
