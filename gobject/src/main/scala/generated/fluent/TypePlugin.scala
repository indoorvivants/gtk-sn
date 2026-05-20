package sn.gnome.gobject

import _root_.sn.gnome.gobject.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.{InterfaceInfo, TypeInfo, TypeValueTable}
import sn.gnome.gobject.internal.GType

trait TypePlugin:
  def getUnsafeRawPointer(): Ptr[Byte]

  /** Calls the @complete_interface_info function from the #GTypePluginClass of @plugin.
    * There should be no need to use this function outside of the GObject type
    * system itself.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def completeInterfaceInfo(
      instance_type: GType /* Some(GType) */,
      interface_type: GType /* Some(GType) */,
      info: sn.gnome.gobject.InterfaceInfo /* Some(Ptr[GInterfaceInfo]) */
  ): Unit /* None */ =
    g_type_plugin_complete_interface_info(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GTypePlugin]],
      instance_type,
      interface_type,
      info.getUnsafeRawPointer().asInstanceOf
    )
  end completeInterfaceInfo

  /** Calls the @complete_type_info function from the #GTypePluginClass of @plugin.
    * There should be no need to use this function outside of the GObject type
    * system itself.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def completeTypeInfo(
      g_type: GType /* Some(GType) */,
      info: sn.gnome.gobject.TypeInfo /* Some(Ptr[GTypeInfo]) */,
      value_table: sn.gnome.gobject.TypeValueTable /* Some(Ptr[GTypeValueTable]) */
  ): Unit /* None */ =
    g_type_plugin_complete_type_info(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GTypePlugin]],
      g_type,
      info.getUnsafeRawPointer().asInstanceOf,
      value_table.getUnsafeRawPointer().asInstanceOf
    )
  end completeTypeInfo

  /** Calls the @unuse_plugin function from the #GTypePluginClass of
    * @plugin.
    *   There should be no need to use this function outside of the GObject type
    *   system itself.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unuse(): Unit /* None */ =
    g_type_plugin_unuse(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GTypePlugin]]
    )
  end unuse

  /** Calls the @use_plugin function from the #GTypePluginClass of
    * @plugin.
    *   There should be no need to use this function outside of the GObject type
    *   system itself.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def use(): Unit /* None */ =
    g_type_plugin_use(this.getUnsafeRawPointer().asInstanceOf[Ptr[GTypePlugin]])
  end use

end TypePlugin

object TypePlugin:
  class Abstract(raw: Ptr[Byte]) extends TypePlugin:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end TypePlugin
