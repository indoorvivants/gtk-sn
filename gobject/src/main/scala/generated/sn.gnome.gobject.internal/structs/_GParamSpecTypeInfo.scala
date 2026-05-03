package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GParamSpecTypeInfo: _size: Size of the instance (object) structure. _preallocs: Prior to GLib 2.10, it specified the number of pre-allocated (cached) instances to reserve memory for (0 indicates no caching). Since GLib 2.10, it is ignored, since instances are allocated with the [slice allocator][glib-Memory-Slices] now. _init: Location of the instance initialization function (optional). _type: The #GType of values conforming to this #GParamSpec : The instance finalization function (optional). _set_default: Resets a to the default value for (recommended, the default is g_value_reset()), see g_param_value_set_default(). _validate: Ensures that the contents of comply with the specifications set out by (optional), see g_param_value_validate(). _cmp: Compares with according to (recommended, the default is memcmp()), see g_param_values_cmp().
*/
opaque type _GParamSpecTypeInfo = CStruct8[_root_.sn.gnome.glib.internal.guint16, _root_.sn.gnome.glib.internal.guint16, CFuncPtr1[Ptr[GParamSpec], Unit], GType, CFuncPtr1[Ptr[GParamSpec], Unit], CFuncPtr2[Ptr[GParamSpec], Ptr[GValue], Unit], CFuncPtr2[Ptr[GParamSpec], Ptr[GValue], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr3[Ptr[GParamSpec], Ptr[GValue], Ptr[GValue], _root_.sn.gnome.glib.internal.gint]]

object _GParamSpecTypeInfo:
  given _tag: Tag[_GParamSpecTypeInfo] = Tag.materializeCStruct8Tag[_root_.sn.gnome.glib.internal.guint16, _root_.sn.gnome.glib.internal.guint16, CFuncPtr1[Ptr[GParamSpec], Unit], GType, CFuncPtr1[Ptr[GParamSpec], Unit], CFuncPtr2[Ptr[GParamSpec], Ptr[GValue], Unit], CFuncPtr2[Ptr[GParamSpec], Ptr[GValue], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr3[Ptr[GParamSpec], Ptr[GValue], Ptr[GValue], _root_.sn.gnome.glib.internal.gint]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GParamSpecTypeInfo)
      inline def instance_size : _root_.sn.gnome.glib.internal.guint16 = struct._1
      inline def instance_size_=(value: _root_.sn.gnome.glib.internal.guint16): Unit = (!struct.at1 = value)
      inline def n_preallocs : _root_.sn.gnome.glib.internal.guint16 = struct._2
      inline def n_preallocs_=(value: _root_.sn.gnome.glib.internal.guint16): Unit = (!struct.at2 = value)
      inline def instance_init : CFuncPtr1[Ptr[GParamSpec], Unit] = struct._3
      inline def instance_init_=(value: CFuncPtr1[Ptr[GParamSpec], Unit]): Unit = (!struct.at3 = value)
      inline def value_type : GType = struct._4
      inline def value_type_=(value: GType): Unit = (!struct.at4 = value)
      inline def finalize : CFuncPtr1[Ptr[GParamSpec], Unit] = struct._5
      inline def finalize_=(value: CFuncPtr1[Ptr[GParamSpec], Unit]): Unit = (!struct.at5 = value)
      inline def value_set_default : CFuncPtr2[Ptr[GParamSpec], Ptr[GValue], Unit] = struct._6
      inline def value_set_default_=(value: CFuncPtr2[Ptr[GParamSpec], Ptr[GValue], Unit]): Unit = (!struct.at6 = value)
      inline def value_validate : CFuncPtr2[Ptr[GParamSpec], Ptr[GValue], _root_.sn.gnome.glib.internal.gboolean] = struct._7
      inline def value_validate_=(value: CFuncPtr2[Ptr[GParamSpec], Ptr[GValue], _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at7 = value)
      inline def values_cmp : CFuncPtr3[Ptr[GParamSpec], Ptr[GValue], Ptr[GValue], _root_.sn.gnome.glib.internal.gint] = struct._8
      inline def values_cmp_=(value: CFuncPtr3[Ptr[GParamSpec], Ptr[GValue], Ptr[GValue], _root_.sn.gnome.glib.internal.gint]): Unit = (!struct.at8 = value)
    end extension
  
  // Allocates _GParamSpecTypeInfo on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GParamSpecTypeInfo] = scala.scalanative.unsafe.alloc[_GParamSpecTypeInfo](1)
  def apply(instance_size : _root_.sn.gnome.glib.internal.guint16, n_preallocs : _root_.sn.gnome.glib.internal.guint16, instance_init : CFuncPtr1[Ptr[GParamSpec], Unit], value_type : GType, finalize : CFuncPtr1[Ptr[GParamSpec], Unit], value_set_default : CFuncPtr2[Ptr[GParamSpec], Ptr[GValue], Unit], value_validate : CFuncPtr2[Ptr[GParamSpec], Ptr[GValue], _root_.sn.gnome.glib.internal.gboolean], values_cmp : CFuncPtr3[Ptr[GParamSpec], Ptr[GValue], Ptr[GValue], _root_.sn.gnome.glib.internal.gint])(using Zone): Ptr[_GParamSpecTypeInfo] =
    val ____ptr = apply()
    (!____ptr).instance_size = instance_size
    (!____ptr).n_preallocs = n_preallocs
    (!____ptr).instance_init = instance_init
    (!____ptr).value_type = value_type
    (!____ptr).finalize = finalize
    (!____ptr).value_set_default = value_set_default
    (!____ptr).value_validate = value_validate
    (!____ptr).values_cmp = values_cmp
    ____ptr