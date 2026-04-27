package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GtkCssLocation = CStruct5[_root_.sn.gnome.glib.internal.gsize, _root_.sn.gnome.glib.internal.gsize, _root_.sn.gnome.glib.internal.gsize, _root_.sn.gnome.glib.internal.gsize, _root_.sn.gnome.glib.internal.gsize]

object _GtkCssLocation:
  given _tag: Tag[_GtkCssLocation] = Tag.materializeCStruct5Tag[_root_.sn.gnome.glib.internal.gsize, _root_.sn.gnome.glib.internal.gsize, _root_.sn.gnome.glib.internal.gsize, _root_.sn.gnome.glib.internal.gsize, _root_.sn.gnome.glib.internal.gsize]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GtkCssLocation)
      inline def bytes : _root_.sn.gnome.glib.internal.gsize = struct._1
      inline def bytes_=(value: _root_.sn.gnome.glib.internal.gsize): Unit = (!struct.at1 = value)
      inline def chars : _root_.sn.gnome.glib.internal.gsize = struct._2
      inline def chars_=(value: _root_.sn.gnome.glib.internal.gsize): Unit = (!struct.at2 = value)
      inline def lines : _root_.sn.gnome.glib.internal.gsize = struct._3
      inline def lines_=(value: _root_.sn.gnome.glib.internal.gsize): Unit = (!struct.at3 = value)
      inline def line_bytes : _root_.sn.gnome.glib.internal.gsize = struct._4
      inline def line_bytes_=(value: _root_.sn.gnome.glib.internal.gsize): Unit = (!struct.at4 = value)
      inline def line_chars : _root_.sn.gnome.glib.internal.gsize = struct._5
      inline def line_chars_=(value: _root_.sn.gnome.glib.internal.gsize): Unit = (!struct.at5 = value)
    end extension
  
  // Allocates _GtkCssLocation on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GtkCssLocation] = scala.scalanative.unsafe.alloc[_GtkCssLocation](1)
  def apply(bytes : _root_.sn.gnome.glib.internal.gsize, chars : _root_.sn.gnome.glib.internal.gsize, lines : _root_.sn.gnome.glib.internal.gsize, line_bytes : _root_.sn.gnome.glib.internal.gsize, line_chars : _root_.sn.gnome.glib.internal.gsize)(using Zone): Ptr[_GtkCssLocation] =
    val ____ptr = apply()
    (!____ptr).bytes = bytes
    (!____ptr).chars = chars
    (!____ptr).lines = lines
    (!____ptr).line_bytes = line_bytes
    (!____ptr).line_chars = line_chars
    ____ptr