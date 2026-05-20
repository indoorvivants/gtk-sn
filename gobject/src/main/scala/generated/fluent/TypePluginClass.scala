package sn.gnome.gobject

import _root_.sn.gnome.gobject.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.internal.GTypePluginClass

/** The #GTypePlugin interface is used by the type system in order to handle the
  * lifecycle of dynamically loaded types.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class TypePluginClass private[gnome] (raw: Ptr[GTypePluginClass]):

  def getUnsafeRawPointer(): Ptr[GTypePluginClass] = this.raw

  /** Increases the use count of the plugin.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[field use_plugin]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TypePluginUse), @type -> DataRecord(GTypePluginUse)))"
  )
  private def usePlugin__ = ???

  /** Decreases the use count of the plugin.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[field unuse_plugin]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TypePluginUnuse), @type -> DataRecord(GTypePluginUnuse)))"
  )
  private def unusePlugin__ = ???

  /** Fills in the #GTypeInfo and #GTypeValueTable structs for the type. The
    * structs are initialized with `memset(s, 0, sizeof (s))` before calling
    * this function.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[field complete_type_info]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TypePluginCompleteTypeInfo), @type -> DataRecord(GTypePluginCompleteTypeInfo)))"
  )
  private def completeTypeInfo__ = ???

  /** Fills in missing parts of the #GInterfaceInfo for the interface. The
    * structs is initialized with `memset(s, 0, sizeof (s))` before calling this
    * function.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[field complete_interface_info]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TypePluginCompleteInterfaceInfo), @type -> DataRecord(GTypePluginCompleteInterfaceInfo)))"
  )
  private def completeInterfaceInfo__ = ???
end TypePluginClass

object TypePluginClass:
  def fromRaw(ptr: Ptr[GTypePluginClass]): TypePluginClass =
    new TypePluginClass(ptr)
end TypePluginClass
