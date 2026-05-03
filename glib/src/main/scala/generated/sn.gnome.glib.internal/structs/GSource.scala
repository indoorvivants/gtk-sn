package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GSource = CStruct13[gpointer, Ptr[Byte], Ptr[Byte], guint, Ptr[GMainContext], gint, guint, guint, Ptr[Byte], Ptr[Byte], Ptr[Byte], CString, Ptr[GSourcePrivate]]

object GSource:
  given _tag: Tag[GSource] = Tag.materializeCStruct13Tag[gpointer, Ptr[Byte], Ptr[Byte], guint, Ptr[GMainContext], gint, guint, guint, Ptr[Byte], Ptr[Byte], Ptr[Byte], CString, Ptr[GSourcePrivate]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GSource)
      inline def callback_data : gpointer = struct._1
      inline def callback_data_=(value: gpointer): Unit = (!struct.at1 = value)
      inline def callback_funcs : Ptr[GSourceCallbackFuncs] = struct._2.asInstanceOf[Ptr[GSourceCallbackFuncs]]
      inline def callback_funcs_=(value: Ptr[GSourceCallbackFuncs]): Unit = (!struct.at2 = value.asInstanceOf[Ptr[Byte]])
      inline def source_funcs : Ptr[GSourceFuncs] = struct._3.asInstanceOf[Ptr[GSourceFuncs]]
      inline def source_funcs_=(value: Ptr[GSourceFuncs]): Unit = (!struct.at3 = value.asInstanceOf[Ptr[Byte]])
      inline def ref_count : guint = struct._4
      inline def ref_count_=(value: guint): Unit = (!struct.at4 = value)
      inline def context : Ptr[GMainContext] = struct._5
      inline def context_=(value: Ptr[GMainContext]): Unit = (!struct.at5 = value)
      inline def priority : gint = struct._6
      inline def priority_=(value: gint): Unit = (!struct.at6 = value)
      inline def flags : guint = struct._7
      inline def flags_=(value: guint): Unit = (!struct.at7 = value)
      inline def source_id : guint = struct._8
      inline def source_id_=(value: guint): Unit = (!struct.at8 = value)
      inline def poll_fds : Ptr[GSList] = struct._9.asInstanceOf[Ptr[GSList]]
      inline def poll_fds_=(value: Ptr[GSList]): Unit = (!struct.at9 = value.asInstanceOf[Ptr[Byte]])
      inline def prev : Ptr[GSource] = struct._10.asInstanceOf[Ptr[GSource]]
      inline def prev_=(value: Ptr[GSource]): Unit = (!struct.at10 = value.asInstanceOf[Ptr[Byte]])
      inline def next : Ptr[GSource] = struct._11.asInstanceOf[Ptr[GSource]]
      inline def next_=(value: Ptr[GSource]): Unit = (!struct.at11 = value.asInstanceOf[Ptr[Byte]])
      inline def name : CString = struct._12
      inline def name_=(value: CString): Unit = (!struct.at12 = value)
      inline def priv : Ptr[GSourcePrivate] = struct._13
      inline def priv_=(value: Ptr[GSourcePrivate]): Unit = (!struct.at13 = value)
    end extension
  
  // Allocates GSource on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GSource] = scala.scalanative.unsafe.alloc[GSource](1)
  def apply(callback_data : gpointer, callback_funcs : Ptr[GSourceCallbackFuncs], source_funcs : Ptr[GSourceFuncs], ref_count : guint, context : Ptr[GMainContext], priority : gint, flags : guint, source_id : guint, poll_fds : Ptr[GSList], prev : Ptr[GSource], next : Ptr[GSource], name : CString, priv : Ptr[GSourcePrivate])(using Zone): Ptr[GSource] =
    val ____ptr = apply()
    (!____ptr).callback_data = callback_data
    (!____ptr).callback_funcs = callback_funcs
    (!____ptr).source_funcs = source_funcs
    (!____ptr).ref_count = ref_count
    (!____ptr).context = context
    (!____ptr).priority = priority
    (!____ptr).flags = flags
    (!____ptr).source_id = source_id
    (!____ptr).poll_fds = poll_fds
    (!____ptr).prev = prev
    (!____ptr).next = next
    (!____ptr).name = name
    (!____ptr).priv = priv
    ____ptr