package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GHook = CStruct8[gpointer, Ptr[Byte], Ptr[Byte], guint, gulong, guint, gpointer, GDestroyNotify]

object _GHook:
  given _tag: Tag[_GHook] = Tag.materializeCStruct8Tag[gpointer, Ptr[Byte], Ptr[Byte], guint, gulong, guint, gpointer, GDestroyNotify]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GHook)
      inline def data : gpointer = struct._1
      inline def data_=(value: gpointer): Unit = (!struct.at1 = value)
      inline def next : Ptr[GHook] = struct._2.asInstanceOf[Ptr[GHook]]
      inline def next_=(value: Ptr[GHook]): Unit = (!struct.at2 = value.asInstanceOf[Ptr[Byte]])
      inline def prev : Ptr[GHook] = struct._3.asInstanceOf[Ptr[GHook]]
      inline def prev_=(value: Ptr[GHook]): Unit = (!struct.at3 = value.asInstanceOf[Ptr[Byte]])
      inline def ref_count : guint = struct._4
      inline def ref_count_=(value: guint): Unit = (!struct.at4 = value)
      inline def hook_id : gulong = struct._5
      inline def hook_id_=(value: gulong): Unit = (!struct.at5 = value)
      inline def flags : guint = struct._6
      inline def flags_=(value: guint): Unit = (!struct.at6 = value)
      inline def func : gpointer = struct._7
      inline def func_=(value: gpointer): Unit = (!struct.at7 = value)
      inline def destroy : GDestroyNotify = struct._8
      inline def destroy_=(value: GDestroyNotify): Unit = (!struct.at8 = value)
    end extension
  
  // Allocates _GHook on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GHook] = scala.scalanative.unsafe.alloc[_GHook](1)
  def apply(data : gpointer, next : Ptr[GHook], prev : Ptr[GHook], ref_count : guint, hook_id : gulong, flags : guint, func : gpointer, destroy : GDestroyNotify)(using Zone): Ptr[_GHook] =
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