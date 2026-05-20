package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.{DBusInterfaceInfo, DBusNodeInfo}
import sn.gnome.gio.internal.GDBusNodeInfo
import sn.gnome.glib.String
import sn.gnome.glib.internal.{gchar, gint, guint}

/** Information about nodes in a remote object hierarchy.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class DBusNodeInfo private[gnome] (raw: Ptr[GDBusNodeInfo]):

  def getUnsafeRawPointer(): Ptr[GDBusNodeInfo] = this.raw

  /** The reference count or -1 if statically allocated.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def refCount: Int /* None */ =
    (!raw).ref_count.asInstanceOf[_root_.sn.gnome.glib.internal.gint]

  /** The reference count or -1 if statically allocated.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def refCount_=(value: Int /* None */ ): Unit = (!raw).ref_count_=(
    gint(value).asInstanceOf[_root_.sn.gnome.glib.internal.gint]
  )

  /** The path of the node or %NULL if omitted. Note that this may be a relative
    * path. See the D-Bus specification for more details.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def path(using Zone): scala.Predef.String /* None */ =
    (!raw).path.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]

  /** The path of the node or %NULL if omitted. Note that this may be a relative
    * path. See the D-Bus specification for more details.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def path_=(value: scala.Predef.String /* None */ )(using Zone): Unit =
    (!raw).path_=(
      toCString(value)
        .asInstanceOf[Ptr[gchar]]
        .asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]
    )

  /** A pointer to a %NULL-terminated array of pointers to #GDBusInterfaceInfo
    * structures or %NULL if there are no interfaces.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[field interfaces]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(DBusInterfaceInfo), @type -> DataRecord(GDBusInterfaceInfo*)))),ListMap(@type -> DataRecord(GDBusInterfaceInfo**)))"
  )
  private def interfaces__ = ???

  /** A pointer to a %NULL-terminated array of pointers to #GDBusNodeInfo
    * structures or %NULL if there are no nodes.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[field nodes]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(DBusNodeInfo), @type -> DataRecord(GDBusNodeInfo*)))),ListMap(@type -> DataRecord(GDBusNodeInfo**)))"
  )
  private def nodes__ = ???

  /** A pointer to a %NULL-terminated array of pointers to #GDBusAnnotationInfo
    * structures or %NULL if there are no annotations.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[field annotations]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(DBusAnnotationInfo), @type -> DataRecord(GDBusAnnotationInfo*)))),ListMap(@type -> DataRecord(GDBusAnnotationInfo**)))"
  )
  private def annotations__ = ???

  /** Appends an XML representation of @info (and its children) to @string_builder.
    *
    * This function is typically used for generating introspection XML documents
    * at run-time for handling the
    * `org.freedesktop.DBus.Introspectable.Introspect` method.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def generateXml(
      indent: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */,
      string_builder: sn.gnome.glib.String /* Some(Ptr[_root_.sn.gnome.glib.internal.GString]) */
  ): Unit /* None */ =
    g_dbus_node_info_generate_xml(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GDBusNodeInfo]],
      guint(indent),
      string_builder.getUnsafeRawPointer().asInstanceOf
    )
  end generateXml

  /** Looks up information about an interface.
    *
    * The cost of this function is O(n) in number of interfaces.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def lookupInterface(
      name: scala.Predef.String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): sn.gnome.gio.DBusInterfaceInfo /* None */ =
    sn.gnome.gio.DBusInterfaceInfo.fromRaw(
      g_dbus_node_info_lookup_interface(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GDBusNodeInfo]],
        toCString(name).asInstanceOf[Ptr[gchar]]
      )
    )
  end lookupInterface

  /** If @info is statically allocated does nothing. Otherwise increases the
    * reference count.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def ref(): sn.gnome.gio.DBusNodeInfo /* None */ =
    sn.gnome.gio.DBusNodeInfo.fromRaw(
      g_dbus_node_info_ref(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GDBusNodeInfo]]
      )
    )
  end ref

  /** If @info is statically allocated, does nothing. Otherwise decreases the
    * reference count of @info. When its reference count drops to 0, the memory
    * used is freed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unref(): Unit /* None */ =
    g_dbus_node_info_unref(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GDBusNodeInfo]]
    )
  end unref

end DBusNodeInfo

object DBusNodeInfo:
  def fromRaw(ptr: Ptr[GDBusNodeInfo]): DBusNodeInfo = new DBusNodeInfo(ptr)
end DBusNodeInfo
