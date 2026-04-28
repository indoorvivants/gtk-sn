package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GtkTextMark = CStruct2[_root_.sn.gnome.gobject.internal.GObject, _root_.sn.gnome.glib.internal.gpointer]

object _GtkTextMark:
  given _tag: Tag[_GtkTextMark] = Tag.materializeCStruct2Tag[_root_.sn.gnome.gobject.internal.GObject, _root_.sn.gnome.glib.internal.gpointer]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GtkTextMark)
      inline def parent_instance : _root_.sn.gnome.gobject.internal.GObject = struct._1
      inline def parent_instance_=(value: _root_.sn.gnome.gobject.internal.GObject): Unit = (!struct.at1 = value)
      inline def segment : _root_.sn.gnome.glib.internal.gpointer = struct._2
      inline def segment_=(value: _root_.sn.gnome.glib.internal.gpointer): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates _GtkTextMark on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GtkTextMark] = scala.scalanative.unsafe.alloc[_GtkTextMark](1)
  def apply(parent_instance : _root_.sn.gnome.gobject.internal.GObject, segment : _root_.sn.gnome.glib.internal.gpointer)(using Zone): Ptr[_GtkTextMark] =
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).segment = segment
    ____ptr