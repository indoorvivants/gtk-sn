package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GFilenameCompleterClass = CStruct5[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr1[Ptr[GFilenameCompleter], Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]

object _GFilenameCompleterClass:
  given _tag: Tag[_GFilenameCompleterClass] = Tag.materializeCStruct5Tag[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr1[Ptr[GFilenameCompleter], Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GFilenameCompleterClass)
      inline def parent_class : _root_.sn.gnome.gobject.internal.GObjectClass = struct._1
      inline def parent_class_=(value: _root_.sn.gnome.gobject.internal.GObjectClass): Unit = (!struct.at1 = value)
      inline def got_completion_data : CFuncPtr1[Ptr[GFilenameCompleter], Unit] = struct._2
      inline def got_completion_data_=(value: CFuncPtr1[Ptr[GFilenameCompleter], Unit]): Unit = (!struct.at2 = value)
      inline def _g_reserved1 : CFuncPtr0[Unit] = struct._3
      inline def _g_reserved1_=(value: CFuncPtr0[Unit]): Unit = (!struct.at3 = value)
      inline def _g_reserved2 : CFuncPtr0[Unit] = struct._4
      inline def _g_reserved2_=(value: CFuncPtr0[Unit]): Unit = (!struct.at4 = value)
      inline def _g_reserved3 : CFuncPtr0[Unit] = struct._5
      inline def _g_reserved3_=(value: CFuncPtr0[Unit]): Unit = (!struct.at5 = value)
    end extension
  
  // Allocates _GFilenameCompleterClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GFilenameCompleterClass] = scala.scalanative.unsafe.alloc[_GFilenameCompleterClass](1)
  def apply(parent_class : _root_.sn.gnome.gobject.internal.GObjectClass, got_completion_data : CFuncPtr1[Ptr[GFilenameCompleter], Unit], _g_reserved1 : CFuncPtr0[Unit], _g_reserved2 : CFuncPtr0[Unit], _g_reserved3 : CFuncPtr0[Unit])(using Zone): Ptr[_GFilenameCompleterClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).got_completion_data = got_completion_data
    (!____ptr)._g_reserved1 = _g_reserved1
    (!____ptr)._g_reserved2 = _g_reserved2
    (!____ptr)._g_reserved3 = _g_reserved3
    ____ptr