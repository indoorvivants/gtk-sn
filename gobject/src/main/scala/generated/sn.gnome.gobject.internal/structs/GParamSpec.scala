package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GParamSpec = CStruct10[GTypeInstance, Ptr[_root_.sn.gnome.glib.internal.gchar], GParamFlags, GType, GType, Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GData], _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint]

object GParamSpec:
  given _tag: Tag[GParamSpec] = Tag.materializeCStruct10Tag[GTypeInstance, Ptr[_root_.sn.gnome.glib.internal.gchar], GParamFlags, GType, GType, Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GData], _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GParamSpec)
      inline def g_type_instance : GTypeInstance = struct._1
      inline def g_type_instance_=(value: GTypeInstance): Unit = (!struct.at1 = value)
      inline def name : Ptr[_root_.sn.gnome.glib.internal.gchar] = struct._2
      inline def name_=(value: Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = (!struct.at2 = value)
      inline def flags : GParamFlags = struct._3
      inline def flags_=(value: GParamFlags): Unit = (!struct.at3 = value)
      inline def value_type : GType = struct._4
      inline def value_type_=(value: GType): Unit = (!struct.at4 = value)
      inline def owner_type : GType = struct._5
      inline def owner_type_=(value: GType): Unit = (!struct.at5 = value)
      inline def _nick : Ptr[_root_.sn.gnome.glib.internal.gchar] = struct._6
      inline def _nick_=(value: Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = (!struct.at6 = value)
      inline def _blurb : Ptr[_root_.sn.gnome.glib.internal.gchar] = struct._7
      inline def _blurb_=(value: Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = (!struct.at7 = value)
      inline def qdata : Ptr[_root_.sn.gnome.glib.internal.GData] = struct._8
      inline def qdata_=(value: Ptr[_root_.sn.gnome.glib.internal.GData]): Unit = (!struct.at8 = value)
      inline def ref_count : _root_.sn.gnome.glib.internal.guint = struct._9
      inline def ref_count_=(value: _root_.sn.gnome.glib.internal.guint): Unit = (!struct.at9 = value)
      inline def param_id : _root_.sn.gnome.glib.internal.guint = struct._10
      inline def param_id_=(value: _root_.sn.gnome.glib.internal.guint): Unit = (!struct.at10 = value)
    end extension
  
  // Allocates GParamSpec on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GParamSpec] = scala.scalanative.unsafe.alloc[GParamSpec](1)
  def apply(g_type_instance : GTypeInstance, name : Ptr[_root_.sn.gnome.glib.internal.gchar], flags : GParamFlags, value_type : GType, owner_type : GType, _nick : Ptr[_root_.sn.gnome.glib.internal.gchar], _blurb : Ptr[_root_.sn.gnome.glib.internal.gchar], qdata : Ptr[_root_.sn.gnome.glib.internal.GData], ref_count : _root_.sn.gnome.glib.internal.guint, param_id : _root_.sn.gnome.glib.internal.guint)(using Zone): Ptr[GParamSpec] =
    val ____ptr = apply()
    (!____ptr).g_type_instance = g_type_instance
    (!____ptr).name = name
    (!____ptr).flags = flags
    (!____ptr).value_type = value_type
    (!____ptr).owner_type = owner_type
    (!____ptr)._nick = _nick
    (!____ptr)._blurb = _blurb
    (!____ptr).qdata = qdata
    (!____ptr).ref_count = ref_count
    (!____ptr).param_id = param_id
    ____ptr