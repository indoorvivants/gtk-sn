package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GSignalQuery: _id: The signal id of the signal being queried, or 0 if the signal to be queried was unknown. _name: The signal name. : The interface/instance type that this signal can be emitted for. _flags: The signal flags as passed in to g_signal_new().

 * [bindgen] header: /usr/include/glib-2.0/gobject/gsignal.h
*/
opaque type _GSignalQuery = CStruct7[_root_.sn.gnome.glib.internal.guint, Ptr[_root_.sn.gnome.glib.internal.gchar], GType, GSignalFlags, GType, _root_.sn.gnome.glib.internal.guint, Ptr[GType]]

object _GSignalQuery:
  given _tag: Tag[_GSignalQuery] = Tag.materializeCStruct7Tag[_root_.sn.gnome.glib.internal.guint, Ptr[_root_.sn.gnome.glib.internal.gchar], GType, GSignalFlags, GType, _root_.sn.gnome.glib.internal.guint, Ptr[GType]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GSignalQuery)
      inline def signal_id : _root_.sn.gnome.glib.internal.guint = struct._1
      inline def signal_id_=(value: _root_.sn.gnome.glib.internal.guint): Unit = (!struct.at1 = value)
      inline def signal_name : Ptr[_root_.sn.gnome.glib.internal.gchar] = struct._2
      inline def signal_name_=(value: Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = (!struct.at2 = value)
      inline def itype : GType = struct._3
      inline def itype_=(value: GType): Unit = (!struct.at3 = value)
      inline def signal_flags : GSignalFlags = struct._4
      inline def signal_flags_=(value: GSignalFlags): Unit = (!struct.at4 = value)
      inline def return_type : GType = struct._5
      inline def return_type_=(value: GType): Unit = (!struct.at5 = value)
      inline def n_params : _root_.sn.gnome.glib.internal.guint = struct._6
      inline def n_params_=(value: _root_.sn.gnome.glib.internal.guint): Unit = (!struct.at6 = value)
      inline def param_types : Ptr[GType] = struct._7
      inline def param_types_=(value: Ptr[GType]): Unit = (!struct.at7 = value)
    end extension
  
  // Allocates _GSignalQuery on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GSignalQuery] = scala.scalanative.unsafe.alloc[_GSignalQuery](1)
  def apply(signal_id : _root_.sn.gnome.glib.internal.guint, signal_name : Ptr[_root_.sn.gnome.glib.internal.gchar], itype : GType, signal_flags : GSignalFlags, return_type : GType, n_params : _root_.sn.gnome.glib.internal.guint, param_types : Ptr[GType])(using Zone): Ptr[_GSignalQuery] =
    val ____ptr = apply()
    (!____ptr).signal_id = signal_id
    (!____ptr).signal_name = signal_name
    (!____ptr).itype = itype
    (!____ptr).signal_flags = signal_flags
    (!____ptr).return_type = return_type
    (!____ptr).n_params = n_params
    (!____ptr).param_types = param_types
    ____ptr