package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkAccessibleTextRange: : the start of the range, in characters : the length of the range, in characters
*/
opaque type GtkAccessibleTextRange = CStruct2[_root_.sn.gnome.glib.internal.gsize, _root_.sn.gnome.glib.internal.gsize]

object GtkAccessibleTextRange:
  given _tag: Tag[GtkAccessibleTextRange] = Tag.materializeCStruct2Tag[_root_.sn.gnome.glib.internal.gsize, _root_.sn.gnome.glib.internal.gsize]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GtkAccessibleTextRange)
      inline def start : _root_.sn.gnome.glib.internal.gsize = struct._1
      inline def start_=(value: _root_.sn.gnome.glib.internal.gsize): Unit = (!struct.at1 = value)
      inline def length : _root_.sn.gnome.glib.internal.gsize = struct._2
      inline def length_=(value: _root_.sn.gnome.glib.internal.gsize): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates GtkAccessibleTextRange on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GtkAccessibleTextRange] = scala.scalanative.unsafe.alloc[GtkAccessibleTextRange](1)
  def apply(start : _root_.sn.gnome.glib.internal.gsize, length : _root_.sn.gnome.glib.internal.gsize)(using Zone): Ptr[GtkAccessibleTextRange] =
    val ____ptr = apply()
    (!____ptr).start = start
    (!____ptr).length = length
    ____ptr