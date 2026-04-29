package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GInitiallyUnowned = CStruct3[GTypeInstance, _root_.sn.gnome.glib.internal.guint, Ptr[_root_.sn.gnome.glib.internal.GData]]

object GInitiallyUnowned:
  given _tag: Tag[GInitiallyUnowned] = Tag.materializeCStruct3Tag[GTypeInstance, _root_.sn.gnome.glib.internal.guint, Ptr[_root_.sn.gnome.glib.internal.GData]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GInitiallyUnowned)
      inline def g_type_instance : GTypeInstance = struct._1
      inline def g_type_instance_=(value: GTypeInstance): Unit = (!struct.at1 = value)
      inline def ref_count : _root_.sn.gnome.glib.internal.guint = struct._2
      inline def ref_count_=(value: _root_.sn.gnome.glib.internal.guint): Unit = (!struct.at2 = value)
      inline def qdata : Ptr[_root_.sn.gnome.glib.internal.GData] = struct._3
      inline def qdata_=(value: Ptr[_root_.sn.gnome.glib.internal.GData]): Unit = (!struct.at3 = value)
    end extension
  
  // Allocates GInitiallyUnowned on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GInitiallyUnowned] = scala.scalanative.unsafe.alloc[GInitiallyUnowned](1)
  def apply(g_type_instance : GTypeInstance, ref_count : _root_.sn.gnome.glib.internal.guint, qdata : Ptr[_root_.sn.gnome.glib.internal.GData])(using Zone): Ptr[GInitiallyUnowned] =
    val ____ptr = apply()
    (!____ptr).g_type_instance = g_type_instance
    (!____ptr).ref_count = ref_count
    (!____ptr).qdata = qdata
    ____ptr