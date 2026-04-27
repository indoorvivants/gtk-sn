package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GTypeQuery: : the #GType value of the type _name: the name of the type _size: the size of the instance structure
*/
opaque type GTypeQuery = CStruct4[GType, Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint]

object GTypeQuery:
  given _tag: Tag[GTypeQuery] = Tag.materializeCStruct4Tag[GType, Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GTypeQuery)
      inline def `type` : GType = struct._1
      inline def type_=(value: GType): Unit = (!struct.at1 = value)
      inline def type_name : Ptr[_root_.sn.gnome.glib.internal.gchar] = struct._2
      inline def type_name_=(value: Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = (!struct.at2 = value)
      inline def class_size : _root_.sn.gnome.glib.internal.guint = struct._3
      inline def class_size_=(value: _root_.sn.gnome.glib.internal.guint): Unit = (!struct.at3 = value)
      inline def instance_size : _root_.sn.gnome.glib.internal.guint = struct._4
      inline def instance_size_=(value: _root_.sn.gnome.glib.internal.guint): Unit = (!struct.at4 = value)
    end extension
  
  // Allocates GTypeQuery on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GTypeQuery] = scala.scalanative.unsafe.alloc[GTypeQuery](1)
  def apply(`type` : GType, type_name : Ptr[_root_.sn.gnome.glib.internal.gchar], class_size : _root_.sn.gnome.glib.internal.guint, instance_size : _root_.sn.gnome.glib.internal.guint)(using Zone): Ptr[GTypeQuery] =
    val ____ptr = apply()
    (!____ptr).`type` = `type`
    (!____ptr).type_name = type_name
    (!____ptr).class_size = class_size
    (!____ptr).instance_size = instance_size
    ____ptr