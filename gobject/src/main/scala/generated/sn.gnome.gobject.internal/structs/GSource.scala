package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.3: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GSource = CStruct13[_root_.sn.gnome.glib.internal.gpointer, Ptr[Byte], Ptr[Byte], _root_.sn.gnome.glib.internal.guint, Ptr[_root_.sn.gnome.glib.internal.GMainContext], _root_.sn.gnome.glib.internal.gint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, Ptr[Byte], Ptr[Byte], Ptr[Byte], CString, Ptr[_root_.sn.gnome.glib.internal.GSourcePrivate]]

object GSource:
  given _tag: Tag[GSource] = Tag.materializeCStruct13Tag[_root_.sn.gnome.glib.internal.gpointer, Ptr[Byte], Ptr[Byte], _root_.sn.gnome.glib.internal.guint, Ptr[_root_.sn.gnome.glib.internal.GMainContext], _root_.sn.gnome.glib.internal.gint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, Ptr[Byte], Ptr[Byte], Ptr[Byte], CString, Ptr[_root_.sn.gnome.glib.internal.GSourcePrivate]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GSource)
      inline def callback_data : _root_.sn.gnome.glib.internal.gpointer = struct._1
      inline def callback_data_=(value: _root_.sn.gnome.glib.internal.gpointer): Unit = (!struct.at1 = value)
      inline def callback_funcs : Ptr[_root_.sn.gnome.glib.internal.GSourceCallbackFuncs] = struct._2.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.GSourceCallbackFuncs]]
      inline def callback_funcs_=(value: Ptr[_root_.sn.gnome.glib.internal.GSourceCallbackFuncs]): Unit = (!struct.at2 = value.asInstanceOf[Ptr[Byte]])
      inline def source_funcs : Ptr[_root_.sn.gnome.glib.internal.GSourceFuncs] = struct._3.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.GSourceFuncs]]
      inline def source_funcs_=(value: Ptr[_root_.sn.gnome.glib.internal.GSourceFuncs]): Unit = (!struct.at3 = value.asInstanceOf[Ptr[Byte]])
      inline def ref_count : _root_.sn.gnome.glib.internal.guint = struct._4
      inline def ref_count_=(value: _root_.sn.gnome.glib.internal.guint): Unit = (!struct.at4 = value)
      inline def context : Ptr[_root_.sn.gnome.glib.internal.GMainContext] = struct._5
      inline def context_=(value: Ptr[_root_.sn.gnome.glib.internal.GMainContext]): Unit = (!struct.at5 = value)
      inline def priority : _root_.sn.gnome.glib.internal.gint = struct._6
      inline def priority_=(value: _root_.sn.gnome.glib.internal.gint): Unit = (!struct.at6 = value)
      inline def flags : _root_.sn.gnome.glib.internal.guint = struct._7
      inline def flags_=(value: _root_.sn.gnome.glib.internal.guint): Unit = (!struct.at7 = value)
      inline def source_id : _root_.sn.gnome.glib.internal.guint = struct._8
      inline def source_id_=(value: _root_.sn.gnome.glib.internal.guint): Unit = (!struct.at8 = value)
      inline def poll_fds : Ptr[_root_.sn.gnome.glib.internal.GSList] = struct._9.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.GSList]]
      inline def poll_fds_=(value: Ptr[_root_.sn.gnome.glib.internal.GSList]): Unit = (!struct.at9 = value.asInstanceOf[Ptr[Byte]])
      inline def prev : Ptr[_root_.sn.gnome.glib.internal.GSource] = struct._10.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.GSource]]
      inline def prev_=(value: Ptr[_root_.sn.gnome.glib.internal.GSource]): Unit = (!struct.at10 = value.asInstanceOf[Ptr[Byte]])
      inline def next : Ptr[_root_.sn.gnome.glib.internal.GSource] = struct._11.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.GSource]]
      inline def next_=(value: Ptr[_root_.sn.gnome.glib.internal.GSource]): Unit = (!struct.at11 = value.asInstanceOf[Ptr[Byte]])
      inline def name : CString = struct._12
      inline def name_=(value: CString): Unit = (!struct.at12 = value)
      inline def priv : Ptr[_root_.sn.gnome.glib.internal.GSourcePrivate] = struct._13
      inline def priv_=(value: Ptr[_root_.sn.gnome.glib.internal.GSourcePrivate]): Unit = (!struct.at13 = value)
    end extension
  
  // Allocates GSource on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GSource] = scala.scalanative.unsafe.alloc[GSource](1)
  def apply(callback_data : _root_.sn.gnome.glib.internal.gpointer, callback_funcs : Ptr[_root_.sn.gnome.glib.internal.GSourceCallbackFuncs], source_funcs : Ptr[_root_.sn.gnome.glib.internal.GSourceFuncs], ref_count : _root_.sn.gnome.glib.internal.guint, context : Ptr[_root_.sn.gnome.glib.internal.GMainContext], priority : _root_.sn.gnome.glib.internal.gint, flags : _root_.sn.gnome.glib.internal.guint, source_id : _root_.sn.gnome.glib.internal.guint, poll_fds : Ptr[_root_.sn.gnome.glib.internal.GSList], prev : Ptr[_root_.sn.gnome.glib.internal.GSource], next : Ptr[_root_.sn.gnome.glib.internal.GSource], name : CString, priv : Ptr[_root_.sn.gnome.glib.internal.GSourcePrivate])(using Zone): Ptr[GSource] =
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