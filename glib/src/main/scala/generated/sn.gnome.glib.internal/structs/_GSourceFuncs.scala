package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GSourceFuncs = CStruct6[CFuncPtr2[Ptr[Byte], Ptr[gint], gboolean], CFuncPtr1[Ptr[Byte], gboolean], CFuncPtr3[Ptr[Byte], GSourceFunc, gpointer, gboolean], CFuncPtr1[Ptr[Byte], Unit], GSourceFunc, GSourceDummyMarshal]

object _GSourceFuncs:
  given _tag: Tag[_GSourceFuncs] = Tag.materializeCStruct6Tag[CFuncPtr2[Ptr[Byte], Ptr[gint], gboolean], CFuncPtr1[Ptr[Byte], gboolean], CFuncPtr3[Ptr[Byte], GSourceFunc, gpointer, gboolean], CFuncPtr1[Ptr[Byte], Unit], GSourceFunc, GSourceDummyMarshal]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GSourceFuncs)
      inline def prepare : CFuncPtr2[Ptr[GSource], Ptr[gint], gboolean] = struct._1.asInstanceOf[CFuncPtr2[Ptr[GSource], Ptr[gint], gboolean]]
      inline def prepare_=(value: CFuncPtr2[Ptr[GSource], Ptr[gint], gboolean]): Unit = (!struct.at1 = value.asInstanceOf[CFuncPtr2[Ptr[Byte], Ptr[gint], gboolean]])
      inline def check : CFuncPtr1[Ptr[GSource], gboolean] = struct._2.asInstanceOf[CFuncPtr1[Ptr[GSource], gboolean]]
      inline def check_=(value: CFuncPtr1[Ptr[GSource], gboolean]): Unit = (!struct.at2 = value.asInstanceOf[CFuncPtr1[Ptr[Byte], gboolean]])
      inline def dispatch : CFuncPtr3[Ptr[GSource], GSourceFunc, gpointer, gboolean] = struct._3.asInstanceOf[CFuncPtr3[Ptr[GSource], GSourceFunc, gpointer, gboolean]]
      inline def dispatch_=(value: CFuncPtr3[Ptr[GSource], GSourceFunc, gpointer, gboolean]): Unit = (!struct.at3 = value.asInstanceOf[CFuncPtr3[Ptr[Byte], GSourceFunc, gpointer, gboolean]])
      inline def finalize : CFuncPtr1[Ptr[GSource], Unit] = struct._4.asInstanceOf[CFuncPtr1[Ptr[GSource], Unit]]
      inline def finalize_=(value: CFuncPtr1[Ptr[GSource], Unit]): Unit = (!struct.at4 = value.asInstanceOf[CFuncPtr1[Ptr[Byte], Unit]])
      inline def closure_callback : GSourceFunc = struct._5
      inline def closure_callback_=(value: GSourceFunc): Unit = (!struct.at5 = value)
      inline def closure_marshal : GSourceDummyMarshal = struct._6
      inline def closure_marshal_=(value: GSourceDummyMarshal): Unit = (!struct.at6 = value)
    end extension
  
  // Allocates _GSourceFuncs on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GSourceFuncs] = scala.scalanative.unsafe.alloc[_GSourceFuncs](1)
  def apply(prepare : CFuncPtr2[Ptr[GSource], Ptr[gint], gboolean], check : CFuncPtr1[Ptr[GSource], gboolean], dispatch : CFuncPtr3[Ptr[GSource], GSourceFunc, gpointer, gboolean], finalize : CFuncPtr1[Ptr[GSource], Unit], closure_callback : GSourceFunc, closure_marshal : GSourceDummyMarshal)(using Zone): Ptr[_GSourceFuncs] =
    val ____ptr = apply()
    (!____ptr).prepare = prepare
    (!____ptr).check = check
    (!____ptr).dispatch = dispatch
    (!____ptr).finalize = finalize
    (!____ptr).closure_callback = closure_callback
    (!____ptr).closure_marshal = closure_marshal
    ____ptr