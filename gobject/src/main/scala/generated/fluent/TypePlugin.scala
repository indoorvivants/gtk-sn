package sn.gnome.gobject.fluent

import _root_.sn.gnome.gobject.internal.*

import _root_.scala.scalanative.unsafe.*

trait TypePlugin:
  def getUnsafeRawPointer(): Ptr[Byte]

  /** Calls the @complete_interface_info function from the #GTypePluginClass of @plugin.
    * There should be no need to use this function outside of the GObject type
    * system itself.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method complete_interface_info/<method parameters>/info]: Cannot render type Type(List(),ListMap(@name -> DataRecord(InterfaceInfo), @type -> DataRecord(GInterfaceInfo*)))"
  )
  private def completeInterfaceInfo__ = ???

  /** Calls the @complete_type_info function from the #GTypePluginClass of @plugin.
    * There should be no need to use this function outside of the GObject type
    * system itself.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method complete_type_info/<method parameters>/info]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TypeInfo), @type -> DataRecord(GTypeInfo*)))"
  )
  private def completeTypeInfo__ = ???

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
