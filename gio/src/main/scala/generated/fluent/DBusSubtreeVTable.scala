package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GDBusSubtreeVTable

/** Virtual table for handling subtrees registered with
  * g_dbus_connection_register_subtree().
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class DBusSubtreeVTable private[gnome] (raw: Ptr[GDBusSubtreeVTable]):

  def getUnsafeRawPointer(): Ptr[GDBusSubtreeVTable] = this.raw

  /** Function for enumerating child nodes.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[field enumerate]: Cannot render type Type(List(),ListMap(@name -> DataRecord(DBusSubtreeEnumerateFunc), @type -> DataRecord(GDBusSubtreeEnumerateFunc)))"
  )
  private def enumerate__ = ???

  /** Function for introspecting a child node.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[field introspect]: Cannot render type Type(List(),ListMap(@name -> DataRecord(DBusSubtreeIntrospectFunc), @type -> DataRecord(GDBusSubtreeIntrospectFunc)))"
  )
  private def introspect__ = ???

  /** Function for dispatching a remote call on a child node.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[field dispatch]: Cannot render type Type(List(),ListMap(@name -> DataRecord(DBusSubtreeDispatchFunc), @type -> DataRecord(GDBusSubtreeDispatchFunc)))"
  )
  private def dispatch__ = ???

end DBusSubtreeVTable

object DBusSubtreeVTable:
  def fromRaw(ptr: Ptr[GDBusSubtreeVTable]): DBusSubtreeVTable =
    new DBusSubtreeVTable(ptr)
end DBusSubtreeVTable
