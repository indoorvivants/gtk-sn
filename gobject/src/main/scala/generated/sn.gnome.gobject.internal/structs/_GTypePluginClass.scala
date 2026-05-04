package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GTypePluginClass: _plugin: Increases the use count of the plugin. _plugin: Decreases the use count of the plugin. _type_info: Fills in the #GTypeInfo and #GTypeValueTable structs for the type. The structs are initialized with `memset(s, 0, sizeof (s))` before calling this function. _interface_info: Fills in missing parts of the #GInterfaceInfo for the interface. The structs is initialized with `memset(s, 0, sizeof (s))` before calling this function.

 * [bindgen] header: /usr/include/glib-2.0/gobject/gtypeplugin.h
*/
opaque type _GTypePluginClass = CStruct5[GTypeInterface, GTypePluginUse, GTypePluginUnuse, GTypePluginCompleteTypeInfo, GTypePluginCompleteInterfaceInfo]

object _GTypePluginClass:
  given _tag: Tag[_GTypePluginClass] = Tag.materializeCStruct5Tag[GTypeInterface, GTypePluginUse, GTypePluginUnuse, GTypePluginCompleteTypeInfo, GTypePluginCompleteInterfaceInfo]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GTypePluginClass)
      inline def base_iface : GTypeInterface = struct._1
      inline def base_iface_=(value: GTypeInterface): Unit = (!struct.at1 = value)
      inline def use_plugin : GTypePluginUse = struct._2
      inline def use_plugin_=(value: GTypePluginUse): Unit = (!struct.at2 = value)
      inline def unuse_plugin : GTypePluginUnuse = struct._3
      inline def unuse_plugin_=(value: GTypePluginUnuse): Unit = (!struct.at3 = value)
      inline def complete_type_info : GTypePluginCompleteTypeInfo = struct._4
      inline def complete_type_info_=(value: GTypePluginCompleteTypeInfo): Unit = (!struct.at4 = value)
      inline def complete_interface_info : GTypePluginCompleteInterfaceInfo = struct._5
      inline def complete_interface_info_=(value: GTypePluginCompleteInterfaceInfo): Unit = (!struct.at5 = value)
    end extension
  
  // Allocates _GTypePluginClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GTypePluginClass] = scala.scalanative.unsafe.alloc[_GTypePluginClass](1)
  def apply(base_iface : GTypeInterface, use_plugin : GTypePluginUse, unuse_plugin : GTypePluginUnuse, complete_type_info : GTypePluginCompleteTypeInfo, complete_interface_info : GTypePluginCompleteInterfaceInfo)(using Zone): Ptr[_GTypePluginClass] =
    val ____ptr = apply()
    (!____ptr).base_iface = base_iface
    (!____ptr).use_plugin = use_plugin
    (!____ptr).unuse_plugin = unuse_plugin
    (!____ptr).complete_type_info = complete_type_info
    (!____ptr).complete_interface_info = complete_interface_info
    ____ptr