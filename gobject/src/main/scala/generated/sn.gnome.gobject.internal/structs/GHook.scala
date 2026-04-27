package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.3: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GHook = CStruct8[_root_.sn.gnome.glib.internal.gpointer, Ptr[Byte], Ptr[Byte], _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.gulong, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.GDestroyNotify]

object GHook:
  given _tag: Tag[GHook] = Tag.materializeCStruct8Tag[_root_.sn.gnome.glib.internal.gpointer, Ptr[Byte], Ptr[Byte], _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.gulong, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.GDestroyNotify]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GHook)
      inline def data : _root_.sn.gnome.glib.internal.gpointer = struct._1
      inline def data_=(value: _root_.sn.gnome.glib.internal.gpointer): Unit = (!struct.at1 = value)
      inline def next : Ptr[_root_.sn.gnome.glib.internal.GHook] = struct._2.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.GHook]]
      inline def next_=(value: Ptr[_root_.sn.gnome.glib.internal.GHook]): Unit = (!struct.at2 = value.asInstanceOf[Ptr[Byte]])
      inline def prev : Ptr[_root_.sn.gnome.glib.internal.GHook] = struct._3.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.GHook]]
      inline def prev_=(value: Ptr[_root_.sn.gnome.glib.internal.GHook]): Unit = (!struct.at3 = value.asInstanceOf[Ptr[Byte]])
      inline def ref_count : _root_.sn.gnome.glib.internal.guint = struct._4
      inline def ref_count_=(value: _root_.sn.gnome.glib.internal.guint): Unit = (!struct.at4 = value)
      inline def hook_id : _root_.sn.gnome.glib.internal.gulong = struct._5
      inline def hook_id_=(value: _root_.sn.gnome.glib.internal.gulong): Unit = (!struct.at5 = value)
      inline def flags : _root_.sn.gnome.glib.internal.guint = struct._6
      inline def flags_=(value: _root_.sn.gnome.glib.internal.guint): Unit = (!struct.at6 = value)
      inline def func : _root_.sn.gnome.glib.internal.gpointer = struct._7
      inline def func_=(value: _root_.sn.gnome.glib.internal.gpointer): Unit = (!struct.at7 = value)
      inline def destroy : _root_.sn.gnome.glib.internal.GDestroyNotify = struct._8
      inline def destroy_=(value: _root_.sn.gnome.glib.internal.GDestroyNotify): Unit = (!struct.at8 = value)
    end extension
  
  // Allocates GHook on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GHook] = scala.scalanative.unsafe.alloc[GHook](1)
  def apply(data : _root_.sn.gnome.glib.internal.gpointer, next : Ptr[_root_.sn.gnome.glib.internal.GHook], prev : Ptr[_root_.sn.gnome.glib.internal.GHook], ref_count : _root_.sn.gnome.glib.internal.guint, hook_id : _root_.sn.gnome.glib.internal.gulong, flags : _root_.sn.gnome.glib.internal.guint, func : _root_.sn.gnome.glib.internal.gpointer, destroy : _root_.sn.gnome.glib.internal.GDestroyNotify)(using Zone): Ptr[GHook] =
    val ____ptr = apply()
    (!____ptr).data = data
    (!____ptr).next = next
    (!____ptr).prev = prev
    (!____ptr).ref_count = ref_count
    (!____ptr).hook_id = hook_id
    (!____ptr).flags = flags
    (!____ptr).func = func
    (!____ptr).destroy = destroy
    ____ptr