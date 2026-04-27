package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.3: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GSourceFuncs = CStruct6[CFuncPtr2[Ptr[Byte], Ptr[_root_.sn.gnome.glib.internal.gint], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr1[Ptr[Byte], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr3[Ptr[Byte], _root_.sn.gnome.glib.internal.GSourceFunc, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean], CFuncPtr1[Ptr[Byte], Unit], _root_.sn.gnome.glib.internal.GSourceFunc, _root_.sn.gnome.glib.internal.GSourceDummyMarshal]

object GSourceFuncs:
  given _tag: Tag[GSourceFuncs] = Tag.materializeCStruct6Tag[CFuncPtr2[Ptr[Byte], Ptr[_root_.sn.gnome.glib.internal.gint], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr1[Ptr[Byte], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr3[Ptr[Byte], _root_.sn.gnome.glib.internal.GSourceFunc, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean], CFuncPtr1[Ptr[Byte], Unit], _root_.sn.gnome.glib.internal.GSourceFunc, _root_.sn.gnome.glib.internal.GSourceDummyMarshal]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GSourceFuncs)
      inline def prepare : CFuncPtr2[Ptr[_root_.sn.gnome.glib.internal.GSource], Ptr[_root_.sn.gnome.glib.internal.gint], _root_.sn.gnome.glib.internal.gboolean] = struct._1.asInstanceOf[CFuncPtr2[Ptr[_root_.sn.gnome.glib.internal.GSource], Ptr[_root_.sn.gnome.glib.internal.gint], _root_.sn.gnome.glib.internal.gboolean]]
      inline def prepare_=(value: CFuncPtr2[Ptr[_root_.sn.gnome.glib.internal.GSource], Ptr[_root_.sn.gnome.glib.internal.gint], _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at1 = value.asInstanceOf[CFuncPtr2[Ptr[Byte], Ptr[_root_.sn.gnome.glib.internal.gint], _root_.sn.gnome.glib.internal.gboolean]])
      inline def check : CFuncPtr1[Ptr[_root_.sn.gnome.glib.internal.GSource], _root_.sn.gnome.glib.internal.gboolean] = struct._2.asInstanceOf[CFuncPtr1[Ptr[_root_.sn.gnome.glib.internal.GSource], _root_.sn.gnome.glib.internal.gboolean]]
      inline def check_=(value: CFuncPtr1[Ptr[_root_.sn.gnome.glib.internal.GSource], _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at2 = value.asInstanceOf[CFuncPtr1[Ptr[Byte], _root_.sn.gnome.glib.internal.gboolean]])
      inline def dispatch : CFuncPtr3[Ptr[_root_.sn.gnome.glib.internal.GSource], _root_.sn.gnome.glib.internal.GSourceFunc, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean] = struct._3.asInstanceOf[CFuncPtr3[Ptr[_root_.sn.gnome.glib.internal.GSource], _root_.sn.gnome.glib.internal.GSourceFunc, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]]
      inline def dispatch_=(value: CFuncPtr3[Ptr[_root_.sn.gnome.glib.internal.GSource], _root_.sn.gnome.glib.internal.GSourceFunc, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at3 = value.asInstanceOf[CFuncPtr3[Ptr[Byte], _root_.sn.gnome.glib.internal.GSourceFunc, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]])
      inline def finalize : CFuncPtr1[Ptr[_root_.sn.gnome.glib.internal.GSource], Unit] = struct._4.asInstanceOf[CFuncPtr1[Ptr[_root_.sn.gnome.glib.internal.GSource], Unit]]
      inline def finalize_=(value: CFuncPtr1[Ptr[_root_.sn.gnome.glib.internal.GSource], Unit]): Unit = (!struct.at4 = value.asInstanceOf[CFuncPtr1[Ptr[Byte], Unit]])
      inline def closure_callback : _root_.sn.gnome.glib.internal.GSourceFunc = struct._5
      inline def closure_callback_=(value: _root_.sn.gnome.glib.internal.GSourceFunc): Unit = (!struct.at5 = value)
      inline def closure_marshal : _root_.sn.gnome.glib.internal.GSourceDummyMarshal = struct._6
      inline def closure_marshal_=(value: _root_.sn.gnome.glib.internal.GSourceDummyMarshal): Unit = (!struct.at6 = value)
    end extension
  
  // Allocates GSourceFuncs on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GSourceFuncs] = scala.scalanative.unsafe.alloc[GSourceFuncs](1)
  def apply(prepare : CFuncPtr2[Ptr[_root_.sn.gnome.glib.internal.GSource], Ptr[_root_.sn.gnome.glib.internal.gint], _root_.sn.gnome.glib.internal.gboolean], check : CFuncPtr1[Ptr[_root_.sn.gnome.glib.internal.GSource], _root_.sn.gnome.glib.internal.gboolean], dispatch : CFuncPtr3[Ptr[_root_.sn.gnome.glib.internal.GSource], _root_.sn.gnome.glib.internal.GSourceFunc, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean], finalize : CFuncPtr1[Ptr[_root_.sn.gnome.glib.internal.GSource], Unit], closure_callback : _root_.sn.gnome.glib.internal.GSourceFunc, closure_marshal : _root_.sn.gnome.glib.internal.GSourceDummyMarshal)(using Zone): Ptr[GSourceFuncs] =
    val ____ptr = apply()
    (!____ptr).prepare = prepare
    (!____ptr).check = check
    (!____ptr).dispatch = dispatch
    (!____ptr).finalize = finalize
    (!____ptr).closure_callback = closure_callback
    (!____ptr).closure_marshal = closure_marshal
    ____ptr