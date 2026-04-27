package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.3: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GHookList = CStruct7[_root_.sn.gnome.glib.internal.gulong, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, Ptr[Byte], _root_.sn.gnome.glib.internal.gpointer, Ptr[Byte], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._2]]

object _GHookList:
  given _tag: Tag[_GHookList] = Tag.materializeCStruct7Tag[_root_.sn.gnome.glib.internal.gulong, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, Ptr[Byte], _root_.sn.gnome.glib.internal.gpointer, Ptr[Byte], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._2]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GHookList)
      inline def seq_id : _root_.sn.gnome.glib.internal.gulong = struct._1
      inline def seq_id_=(value: _root_.sn.gnome.glib.internal.gulong): Unit = (!struct.at1 = value)
      inline def hook_size : _root_.sn.gnome.glib.internal.guint = struct._2
      inline def hook_size_=(value: _root_.sn.gnome.glib.internal.guint): Unit = (!struct.at2 = value)
      inline def is_setup : _root_.sn.gnome.glib.internal.guint = struct._3
      inline def is_setup_=(value: _root_.sn.gnome.glib.internal.guint): Unit = (!struct.at3 = value)
      inline def hooks : Ptr[_root_.sn.gnome.glib.internal.GHook] = struct._4.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.GHook]]
      inline def hooks_=(value: Ptr[_root_.sn.gnome.glib.internal.GHook]): Unit = (!struct.at4 = value.asInstanceOf[Ptr[Byte]])
      inline def dummy3 : _root_.sn.gnome.glib.internal.gpointer = struct._5
      inline def dummy3_=(value: _root_.sn.gnome.glib.internal.gpointer): Unit = (!struct.at5 = value)
      inline def finalize_hook : _root_.sn.gnome.glib.internal.GHookFinalizeFunc = struct._6.asInstanceOf[_root_.sn.gnome.glib.internal.GHookFinalizeFunc]
      inline def finalize_hook_=(value: _root_.sn.gnome.glib.internal.GHookFinalizeFunc): Unit = (!struct.at6 = value.asInstanceOf[Ptr[Byte]])
      inline def dummy : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._2] = struct._7
      inline def dummy_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._2]): Unit = (!struct.at7 = value)
    end extension
  
  // Allocates _GHookList on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GHookList] = scala.scalanative.unsafe.alloc[_GHookList](1)
  def apply(seq_id : _root_.sn.gnome.glib.internal.gulong, hook_size : _root_.sn.gnome.glib.internal.guint, is_setup : _root_.sn.gnome.glib.internal.guint, hooks : Ptr[_root_.sn.gnome.glib.internal.GHook], dummy3 : _root_.sn.gnome.glib.internal.gpointer, finalize_hook : _root_.sn.gnome.glib.internal.GHookFinalizeFunc, dummy : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._2])(using Zone): Ptr[_GHookList] =
    val ____ptr = apply()
    (!____ptr).seq_id = seq_id
    (!____ptr).hook_size = hook_size
    (!____ptr).is_setup = is_setup
    (!____ptr).hooks = hooks
    (!____ptr).dummy3 = dummy3
    (!____ptr).finalize_hook = finalize_hook
    (!____ptr).dummy = dummy
    ____ptr