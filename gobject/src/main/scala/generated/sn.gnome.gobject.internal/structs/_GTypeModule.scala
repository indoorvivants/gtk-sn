package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GTypeModule = CStruct5[GObject, _root_.sn.gnome.glib.internal.guint, Ptr[Byte], Ptr[Byte], Ptr[_root_.sn.gnome.glib.internal.gchar]]

object _GTypeModule:
  given _tag: Tag[_GTypeModule] = Tag.materializeCStruct5Tag[GObject, _root_.sn.gnome.glib.internal.guint, Ptr[Byte], Ptr[Byte], Ptr[_root_.sn.gnome.glib.internal.gchar]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GTypeModule)
      inline def parent_instance : GObject = struct._1
      inline def parent_instance_=(value: GObject): Unit = (!struct.at1 = value)
      inline def use_count : _root_.sn.gnome.glib.internal.guint = struct._2
      inline def use_count_=(value: _root_.sn.gnome.glib.internal.guint): Unit = (!struct.at2 = value)
      inline def type_infos : Ptr[_root_.sn.gnome.glib.internal.GSList] = struct._3.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.GSList]]
      inline def type_infos_=(value: Ptr[_root_.sn.gnome.glib.internal.GSList]): Unit = (!struct.at3 = value.asInstanceOf[Ptr[Byte]])
      inline def interface_infos : Ptr[_root_.sn.gnome.glib.internal.GSList] = struct._4.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.GSList]]
      inline def interface_infos_=(value: Ptr[_root_.sn.gnome.glib.internal.GSList]): Unit = (!struct.at4 = value.asInstanceOf[Ptr[Byte]])
      inline def name : Ptr[_root_.sn.gnome.glib.internal.gchar] = struct._5
      inline def name_=(value: Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = (!struct.at5 = value)
    end extension
  
  // Allocates _GTypeModule on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GTypeModule] = scala.scalanative.unsafe.alloc[_GTypeModule](1)
  def apply(parent_instance : GObject, use_count : _root_.sn.gnome.glib.internal.guint, type_infos : Ptr[_root_.sn.gnome.glib.internal.GSList], interface_infos : Ptr[_root_.sn.gnome.glib.internal.GSList], name : Ptr[_root_.sn.gnome.glib.internal.gchar])(using Zone): Ptr[_GTypeModule] =
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).use_count = use_count
    (!____ptr).type_infos = type_infos
    (!____ptr).interface_infos = interface_infos
    (!____ptr).name = name
    ____ptr