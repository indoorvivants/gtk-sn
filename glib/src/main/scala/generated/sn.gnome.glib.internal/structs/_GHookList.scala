package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GHookList = CStruct7[gulong, guint, guint, Ptr[Byte], gpointer, Ptr[Byte], CArray[gpointer, Nat._2]]

object _GHookList:
  given _tag: Tag[_GHookList] = Tag.materializeCStruct7Tag[gulong, guint, guint, Ptr[Byte], gpointer, Ptr[Byte], CArray[gpointer, Nat._2]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GHookList)
      inline def seq_id : gulong = struct._1
      inline def seq_id_=(value: gulong): Unit = (!struct.at1 = value)
      inline def hook_size : guint = struct._2
      inline def hook_size_=(value: guint): Unit = (!struct.at2 = value)
      inline def is_setup : guint = struct._3
      inline def is_setup_=(value: guint): Unit = (!struct.at3 = value)
      inline def hooks : Ptr[GHook] = struct._4.asInstanceOf[Ptr[GHook]]
      inline def hooks_=(value: Ptr[GHook]): Unit = (!struct.at4 = value.asInstanceOf[Ptr[Byte]])
      inline def dummy3 : gpointer = struct._5
      inline def dummy3_=(value: gpointer): Unit = (!struct.at5 = value)
      inline def finalize_hook : GHookFinalizeFunc = struct._6.asInstanceOf[GHookFinalizeFunc]
      inline def finalize_hook_=(value: GHookFinalizeFunc): Unit = (!struct.at6 = value.asInstanceOf[Ptr[Byte]])
      inline def dummy : CArray[gpointer, Nat._2] = struct._7
      inline def dummy_=(value: CArray[gpointer, Nat._2]): Unit = (!struct.at7 = value)
    end extension
  
  // Allocates _GHookList on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GHookList] = scala.scalanative.unsafe.alloc[_GHookList](1)
  def apply(seq_id : gulong, hook_size : guint, is_setup : guint, hooks : Ptr[GHook], dummy3 : gpointer, finalize_hook : GHookFinalizeFunc, dummy : CArray[gpointer, Nat._2])(using Zone): Ptr[_GHookList] =
    val ____ptr = apply()
    (!____ptr).seq_id = seq_id
    (!____ptr).hook_size = hook_size
    (!____ptr).is_setup = is_setup
    (!____ptr).hooks = hooks
    (!____ptr).dummy3 = dummy3
    (!____ptr).finalize_hook = finalize_hook
    (!____ptr).dummy = dummy
    ____ptr