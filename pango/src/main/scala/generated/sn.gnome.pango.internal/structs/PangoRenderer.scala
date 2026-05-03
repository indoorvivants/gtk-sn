package sn.gnome.pango.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * PangoRenderer: : (nullable): the current transformation matrix for the Renderer; may be %NULL, which should be treated the same as the identity matrix.
*/
opaque type PangoRenderer = CStruct6[_root_.sn.gnome.gobject.internal.GObject, PangoUnderline, _root_.sn.gnome.glib.internal.gboolean, CInt, Ptr[PangoMatrix], Ptr[PangoRendererPrivate]]

object PangoRenderer:
  given _tag: Tag[PangoRenderer] = Tag.materializeCStruct6Tag[_root_.sn.gnome.gobject.internal.GObject, PangoUnderline, _root_.sn.gnome.glib.internal.gboolean, CInt, Ptr[PangoMatrix], Ptr[PangoRendererPrivate]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: PangoRenderer)
      inline def parent_instance : _root_.sn.gnome.gobject.internal.GObject = struct._1
      inline def parent_instance_=(value: _root_.sn.gnome.gobject.internal.GObject): Unit = (!struct.at1 = value)
      inline def underline : PangoUnderline = struct._2
      inline def underline_=(value: PangoUnderline): Unit = (!struct.at2 = value)
      inline def strikethrough : _root_.sn.gnome.glib.internal.gboolean = struct._3
      inline def strikethrough_=(value: _root_.sn.gnome.glib.internal.gboolean): Unit = (!struct.at3 = value)
      inline def active_count : CInt = struct._4
      inline def active_count_=(value: CInt): Unit = (!struct.at4 = value)
      inline def matrix : Ptr[PangoMatrix] = struct._5
      inline def matrix_=(value: Ptr[PangoMatrix]): Unit = (!struct.at5 = value)
      inline def priv : Ptr[PangoRendererPrivate] = struct._6
      inline def priv_=(value: Ptr[PangoRendererPrivate]): Unit = (!struct.at6 = value)
    end extension
  
  // Allocates PangoRenderer on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[PangoRenderer] = scala.scalanative.unsafe.alloc[PangoRenderer](1)
  def apply(parent_instance : _root_.sn.gnome.gobject.internal.GObject, underline : PangoUnderline, strikethrough : _root_.sn.gnome.glib.internal.gboolean, active_count : CInt, matrix : Ptr[PangoMatrix], priv : Ptr[PangoRendererPrivate])(using Zone): Ptr[PangoRenderer] =
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).underline = underline
    (!____ptr).strikethrough = strikethrough
    (!____ptr).active_count = active_count
    (!____ptr).matrix = matrix
    (!____ptr).priv = priv
    ____ptr