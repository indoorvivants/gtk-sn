package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GTypeModuleClass: _class: the parent class : loads the module and registers one or more types using g_type_module_register_type(). : unloads the module
*/
opaque type GTypeModuleClass = CStruct7[GObjectClass, CFuncPtr1[Ptr[Byte], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr1[Ptr[Byte], Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]

object GTypeModuleClass:
  given _tag: Tag[GTypeModuleClass] = Tag.materializeCStruct7Tag[GObjectClass, CFuncPtr1[Ptr[Byte], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr1[Ptr[Byte], Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GTypeModuleClass)
      inline def parent_class : GObjectClass = struct._1
      inline def parent_class_=(value: GObjectClass): Unit = (!struct.at1 = value)
      inline def load : CFuncPtr1[Ptr[GTypeModule], _root_.sn.gnome.glib.internal.gboolean] = struct._2.asInstanceOf[CFuncPtr1[Ptr[GTypeModule], _root_.sn.gnome.glib.internal.gboolean]]
      inline def load_=(value: CFuncPtr1[Ptr[GTypeModule], _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at2 = value.asInstanceOf[CFuncPtr1[Ptr[Byte], _root_.sn.gnome.glib.internal.gboolean]])
      inline def unload : CFuncPtr1[Ptr[GTypeModule], Unit] = struct._3.asInstanceOf[CFuncPtr1[Ptr[GTypeModule], Unit]]
      inline def unload_=(value: CFuncPtr1[Ptr[GTypeModule], Unit]): Unit = (!struct.at3 = value.asInstanceOf[CFuncPtr1[Ptr[Byte], Unit]])
      inline def reserved1 : CFuncPtr0[Unit] = struct._4
      inline def reserved1_=(value: CFuncPtr0[Unit]): Unit = (!struct.at4 = value)
      inline def reserved2 : CFuncPtr0[Unit] = struct._5
      inline def reserved2_=(value: CFuncPtr0[Unit]): Unit = (!struct.at5 = value)
      inline def reserved3 : CFuncPtr0[Unit] = struct._6
      inline def reserved3_=(value: CFuncPtr0[Unit]): Unit = (!struct.at6 = value)
      inline def reserved4 : CFuncPtr0[Unit] = struct._7
      inline def reserved4_=(value: CFuncPtr0[Unit]): Unit = (!struct.at7 = value)
    end extension
  
  // Allocates GTypeModuleClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GTypeModuleClass] = scala.scalanative.unsafe.alloc[GTypeModuleClass](1)
  def apply(parent_class : GObjectClass, load : CFuncPtr1[Ptr[GTypeModule], _root_.sn.gnome.glib.internal.gboolean], unload : CFuncPtr1[Ptr[GTypeModule], Unit], reserved1 : CFuncPtr0[Unit], reserved2 : CFuncPtr0[Unit], reserved3 : CFuncPtr0[Unit], reserved4 : CFuncPtr0[Unit])(using Zone): Ptr[GTypeModuleClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).load = load
    (!____ptr).unload = unload
    (!____ptr).reserved1 = reserved1
    (!____ptr).reserved2 = reserved2
    (!____ptr).reserved3 = reserved3
    (!____ptr).reserved4 = reserved4
    ____ptr