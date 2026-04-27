package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GInputVector = CStruct2[_root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gsize]

object _GInputVector:
  given _tag: Tag[_GInputVector] = Tag.materializeCStruct2Tag[_root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gsize]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GInputVector)
      inline def buffer : _root_.sn.gnome.glib.internal.gpointer = struct._1
      inline def buffer_=(value: _root_.sn.gnome.glib.internal.gpointer): Unit = (!struct.at1 = value)
      inline def size : _root_.sn.gnome.glib.internal.gsize = struct._2
      inline def size_=(value: _root_.sn.gnome.glib.internal.gsize): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates _GInputVector on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GInputVector] = scala.scalanative.unsafe.alloc[_GInputVector](1)
  def apply(buffer : _root_.sn.gnome.glib.internal.gpointer, size : _root_.sn.gnome.glib.internal.gsize)(using Zone): Ptr[_GInputVector] =
    val ____ptr = apply()
    (!____ptr).buffer = buffer
    (!____ptr).size = size
    ____ptr