package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GSourceCallbackFuncs = CStruct3[CFuncPtr1[gpointer, Unit], CFuncPtr1[gpointer, Unit], CFuncPtr4[gpointer, Ptr[Byte], Ptr[GSourceFunc], Ptr[gpointer], Unit]]

object _GSourceCallbackFuncs:
  given _tag: Tag[_GSourceCallbackFuncs] = Tag.materializeCStruct3Tag[CFuncPtr1[gpointer, Unit], CFuncPtr1[gpointer, Unit], CFuncPtr4[gpointer, Ptr[Byte], Ptr[GSourceFunc], Ptr[gpointer], Unit]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GSourceCallbackFuncs)
      inline def ref : CFuncPtr1[gpointer, Unit] = struct._1
      inline def ref_=(value: CFuncPtr1[gpointer, Unit]): Unit = (!struct.at1 = value)
      inline def unref : CFuncPtr1[gpointer, Unit] = struct._2
      inline def unref_=(value: CFuncPtr1[gpointer, Unit]): Unit = (!struct.at2 = value)
      inline def get : CFuncPtr4[gpointer, Ptr[GSource], Ptr[GSourceFunc], Ptr[gpointer], Unit] = struct._3.asInstanceOf[CFuncPtr4[gpointer, Ptr[GSource], Ptr[GSourceFunc], Ptr[gpointer], Unit]]
      inline def get_=(value: CFuncPtr4[gpointer, Ptr[GSource], Ptr[GSourceFunc], Ptr[gpointer], Unit]): Unit = (!struct.at3 = value.asInstanceOf[CFuncPtr4[gpointer, Ptr[Byte], Ptr[GSourceFunc], Ptr[gpointer], Unit]])
    end extension
  
  // Allocates _GSourceCallbackFuncs on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GSourceCallbackFuncs] = scala.scalanative.unsafe.alloc[_GSourceCallbackFuncs](1)
  def apply(ref : CFuncPtr1[gpointer, Unit], unref : CFuncPtr1[gpointer, Unit], get : CFuncPtr4[gpointer, Ptr[GSource], Ptr[GSourceFunc], Ptr[gpointer], Unit])(using Zone): Ptr[_GSourceCallbackFuncs] =
    val ____ptr = apply()
    (!____ptr).ref = ref
    (!____ptr).unref = unref
    (!____ptr).get = get
    ____ptr