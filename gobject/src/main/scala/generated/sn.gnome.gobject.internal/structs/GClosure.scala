package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gclosure.h
*/
opaque type GClosure = CStruct13[_root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, CFuncPtr6[Ptr[Byte], Ptr[GValue], _root_.sn.gnome.glib.internal.guint, Ptr[GValue], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer, Unit], _root_.sn.gnome.glib.internal.gpointer, Ptr[Byte]]

object GClosure:
  given _tag: Tag[GClosure] = Tag.materializeCStruct13Tag[_root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, CFuncPtr6[Ptr[Byte], Ptr[GValue], _root_.sn.gnome.glib.internal.guint, Ptr[GValue], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer, Unit], _root_.sn.gnome.glib.internal.gpointer, Ptr[Byte]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GClosure)
      inline def ref_count : _root_.sn.gnome.glib.internal.guint = struct._1
      inline def ref_count_=(value: _root_.sn.gnome.glib.internal.guint): Unit = (!struct.at1 = value)
      inline def meta_marshal_nouse : _root_.sn.gnome.glib.internal.guint = struct._2
      inline def meta_marshal_nouse_=(value: _root_.sn.gnome.glib.internal.guint): Unit = (!struct.at2 = value)
      inline def n_guards : _root_.sn.gnome.glib.internal.guint = struct._3
      inline def n_guards_=(value: _root_.sn.gnome.glib.internal.guint): Unit = (!struct.at3 = value)
      inline def n_fnotifiers : _root_.sn.gnome.glib.internal.guint = struct._4
      inline def n_fnotifiers_=(value: _root_.sn.gnome.glib.internal.guint): Unit = (!struct.at4 = value)
      inline def n_inotifiers : _root_.sn.gnome.glib.internal.guint = struct._5
      inline def n_inotifiers_=(value: _root_.sn.gnome.glib.internal.guint): Unit = (!struct.at5 = value)
      inline def in_inotify : _root_.sn.gnome.glib.internal.guint = struct._6
      inline def in_inotify_=(value: _root_.sn.gnome.glib.internal.guint): Unit = (!struct.at6 = value)
      inline def floating : _root_.sn.gnome.glib.internal.guint = struct._7
      inline def floating_=(value: _root_.sn.gnome.glib.internal.guint): Unit = (!struct.at7 = value)
      inline def derivative_flag : _root_.sn.gnome.glib.internal.guint = struct._8
      inline def derivative_flag_=(value: _root_.sn.gnome.glib.internal.guint): Unit = (!struct.at8 = value)
      inline def in_marshal : _root_.sn.gnome.glib.internal.guint = struct._9
      inline def in_marshal_=(value: _root_.sn.gnome.glib.internal.guint): Unit = (!struct.at9 = value)
      inline def is_invalid : _root_.sn.gnome.glib.internal.guint = struct._10
      inline def is_invalid_=(value: _root_.sn.gnome.glib.internal.guint): Unit = (!struct.at10 = value)
      inline def marshal : CFuncPtr6[Ptr[GClosure], Ptr[GValue], _root_.sn.gnome.glib.internal.guint, Ptr[GValue], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer, Unit] = struct._11.asInstanceOf[CFuncPtr6[Ptr[GClosure], Ptr[GValue], _root_.sn.gnome.glib.internal.guint, Ptr[GValue], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer, Unit]]
      inline def marshal_=(value: CFuncPtr6[Ptr[GClosure], Ptr[GValue], _root_.sn.gnome.glib.internal.guint, Ptr[GValue], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer, Unit]): Unit = (!struct.at11 = value.asInstanceOf[CFuncPtr6[Ptr[Byte], Ptr[GValue], _root_.sn.gnome.glib.internal.guint, Ptr[GValue], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer, Unit]])
      inline def data : _root_.sn.gnome.glib.internal.gpointer = struct._12
      inline def data_=(value: _root_.sn.gnome.glib.internal.gpointer): Unit = (!struct.at12 = value)
      inline def notifiers : Ptr[GClosureNotifyData] = struct._13.asInstanceOf[Ptr[GClosureNotifyData]]
      inline def notifiers_=(value: Ptr[GClosureNotifyData]): Unit = (!struct.at13 = value.asInstanceOf[Ptr[Byte]])
    end extension
  
  // Allocates GClosure on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GClosure] = scala.scalanative.unsafe.alloc[GClosure](1)
  def apply(ref_count : _root_.sn.gnome.glib.internal.guint, meta_marshal_nouse : _root_.sn.gnome.glib.internal.guint, n_guards : _root_.sn.gnome.glib.internal.guint, n_fnotifiers : _root_.sn.gnome.glib.internal.guint, n_inotifiers : _root_.sn.gnome.glib.internal.guint, in_inotify : _root_.sn.gnome.glib.internal.guint, floating : _root_.sn.gnome.glib.internal.guint, derivative_flag : _root_.sn.gnome.glib.internal.guint, in_marshal : _root_.sn.gnome.glib.internal.guint, is_invalid : _root_.sn.gnome.glib.internal.guint, marshal : CFuncPtr6[Ptr[GClosure], Ptr[GValue], _root_.sn.gnome.glib.internal.guint, Ptr[GValue], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer, Unit], data : _root_.sn.gnome.glib.internal.gpointer, notifiers : Ptr[GClosureNotifyData])(using Zone): Ptr[GClosure] =
    val ____ptr = apply()
    (!____ptr).ref_count = ref_count
    (!____ptr).meta_marshal_nouse = meta_marshal_nouse
    (!____ptr).n_guards = n_guards
    (!____ptr).n_fnotifiers = n_fnotifiers
    (!____ptr).n_inotifiers = n_inotifiers
    (!____ptr).in_inotify = in_inotify
    (!____ptr).floating = floating
    (!____ptr).derivative_flag = derivative_flag
    (!____ptr).in_marshal = in_marshal
    (!____ptr).is_invalid = is_invalid
    (!____ptr).marshal = marshal
    (!____ptr).data = data
    (!____ptr).notifiers = notifiers
    ____ptr