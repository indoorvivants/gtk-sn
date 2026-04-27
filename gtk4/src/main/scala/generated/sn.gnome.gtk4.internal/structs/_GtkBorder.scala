package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkBorder: : The width of the left border : The width of the right border : The width of the top border : The width of the bottom border
*/
opaque type _GtkBorder = CStruct4[_root_.sn.gnome.glib.internal.gint16, _root_.sn.gnome.glib.internal.gint16, _root_.sn.gnome.glib.internal.gint16, _root_.sn.gnome.glib.internal.gint16]

object _GtkBorder:
  given _tag: Tag[_GtkBorder] = Tag.materializeCStruct4Tag[_root_.sn.gnome.glib.internal.gint16, _root_.sn.gnome.glib.internal.gint16, _root_.sn.gnome.glib.internal.gint16, _root_.sn.gnome.glib.internal.gint16]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GtkBorder)
      inline def left : _root_.sn.gnome.glib.internal.gint16 = struct._1
      inline def left_=(value: _root_.sn.gnome.glib.internal.gint16): Unit = (!struct.at1 = value)
      inline def right : _root_.sn.gnome.glib.internal.gint16 = struct._2
      inline def right_=(value: _root_.sn.gnome.glib.internal.gint16): Unit = (!struct.at2 = value)
      inline def top : _root_.sn.gnome.glib.internal.gint16 = struct._3
      inline def top_=(value: _root_.sn.gnome.glib.internal.gint16): Unit = (!struct.at3 = value)
      inline def bottom : _root_.sn.gnome.glib.internal.gint16 = struct._4
      inline def bottom_=(value: _root_.sn.gnome.glib.internal.gint16): Unit = (!struct.at4 = value)
    end extension
  
  // Allocates _GtkBorder on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GtkBorder] = scala.scalanative.unsafe.alloc[_GtkBorder](1)
  def apply(left : _root_.sn.gnome.glib.internal.gint16, right : _root_.sn.gnome.glib.internal.gint16, top : _root_.sn.gnome.glib.internal.gint16, bottom : _root_.sn.gnome.glib.internal.gint16)(using Zone): Ptr[_GtkBorder] =
    val ____ptr = apply()
    (!____ptr).left = left
    (!____ptr).right = right
    (!____ptr).top = top
    (!____ptr).bottom = bottom
    ____ptr