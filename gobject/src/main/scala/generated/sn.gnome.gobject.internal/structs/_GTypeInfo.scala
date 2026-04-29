package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GTypeInfo: _init: Location of the base initialization function (optional) _finalize: Location of the base finalization function (optional) classed and instantiatable types. Location of the default vtable inititalization function for interface types. (optional) This function is used both to fill in virtual functions in the class or default vtable, and to do type-specific setup such as registering signals and object properties. classed and instantiatable types. Location of the default vtable finalization function for interface types. (optional) _size: Size of the instance (object) structure (required for instantiatable types only) _preallocs: Prior to GLib 2.10, it specified the number of pre-allocated (cached) instances to reserve memory for (0 indicates no caching). Since GLib 2.10 this field is ignored. _init: Location of the instance initialization function (optional, for instantiatable types only) _table: A #GTypeValueTable function table for generic handling of GValues of this type (usually only useful for fundamental types)
*/
opaque type _GTypeInfo = CStruct10[_root_.sn.gnome.glib.internal.guint16, GBaseInitFunc, GBaseFinalizeFunc, GClassInitFunc, GClassFinalizeFunc, _root_.sn.gnome.glib.internal.gconstpointer, _root_.sn.gnome.glib.internal.guint16, _root_.sn.gnome.glib.internal.guint16, GInstanceInitFunc, Ptr[GTypeValueTable]]

object _GTypeInfo:
  given _tag: Tag[_GTypeInfo] = Tag.materializeCStruct10Tag[_root_.sn.gnome.glib.internal.guint16, GBaseInitFunc, GBaseFinalizeFunc, GClassInitFunc, GClassFinalizeFunc, _root_.sn.gnome.glib.internal.gconstpointer, _root_.sn.gnome.glib.internal.guint16, _root_.sn.gnome.glib.internal.guint16, GInstanceInitFunc, Ptr[GTypeValueTable]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GTypeInfo)
      inline def class_size : _root_.sn.gnome.glib.internal.guint16 = struct._1
      inline def class_size_=(value: _root_.sn.gnome.glib.internal.guint16): Unit = (!struct.at1 = value)
      inline def base_init : GBaseInitFunc = struct._2
      inline def base_init_=(value: GBaseInitFunc): Unit = (!struct.at2 = value)
      inline def base_finalize : GBaseFinalizeFunc = struct._3
      inline def base_finalize_=(value: GBaseFinalizeFunc): Unit = (!struct.at3 = value)
      inline def class_init : GClassInitFunc = struct._4
      inline def class_init_=(value: GClassInitFunc): Unit = (!struct.at4 = value)
      inline def class_finalize : GClassFinalizeFunc = struct._5
      inline def class_finalize_=(value: GClassFinalizeFunc): Unit = (!struct.at5 = value)
      inline def class_data : _root_.sn.gnome.glib.internal.gconstpointer = struct._6
      inline def class_data_=(value: _root_.sn.gnome.glib.internal.gconstpointer): Unit = (!struct.at6 = value)
      inline def instance_size : _root_.sn.gnome.glib.internal.guint16 = struct._7
      inline def instance_size_=(value: _root_.sn.gnome.glib.internal.guint16): Unit = (!struct.at7 = value)
      inline def n_preallocs : _root_.sn.gnome.glib.internal.guint16 = struct._8
      inline def n_preallocs_=(value: _root_.sn.gnome.glib.internal.guint16): Unit = (!struct.at8 = value)
      inline def instance_init : GInstanceInitFunc = struct._9
      inline def instance_init_=(value: GInstanceInitFunc): Unit = (!struct.at9 = value)
      inline def value_table : Ptr[GTypeValueTable] = struct._10
      inline def value_table_=(value: Ptr[GTypeValueTable]): Unit = (!struct.at10 = value)
    end extension
  
  // Allocates _GTypeInfo on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GTypeInfo] = scala.scalanative.unsafe.alloc[_GTypeInfo](1)
  def apply(class_size : _root_.sn.gnome.glib.internal.guint16, base_init : GBaseInitFunc, base_finalize : GBaseFinalizeFunc, class_init : GClassInitFunc, class_finalize : GClassFinalizeFunc, class_data : _root_.sn.gnome.glib.internal.gconstpointer, instance_size : _root_.sn.gnome.glib.internal.guint16, n_preallocs : _root_.sn.gnome.glib.internal.guint16, instance_init : GInstanceInitFunc, value_table : Ptr[GTypeValueTable])(using Zone): Ptr[_GTypeInfo] =
    val ____ptr = apply()
    (!____ptr).class_size = class_size
    (!____ptr).base_init = base_init
    (!____ptr).base_finalize = base_finalize
    (!____ptr).class_init = class_init
    (!____ptr).class_finalize = class_finalize
    (!____ptr).class_data = class_data
    (!____ptr).instance_size = instance_size
    (!____ptr).n_preallocs = n_preallocs
    (!____ptr).instance_init = instance_init
    (!____ptr).value_table = value_table
    ____ptr