package sn.gnome.pango.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * PangoGlyphVisAttr:
*/
opaque type PangoGlyphVisAttr = CStruct2[_root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint]

object PangoGlyphVisAttr:
  given _tag: Tag[PangoGlyphVisAttr] = Tag.materializeCStruct2Tag[_root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint]
  
  export fields.*
  private[internal] object fields:
    extension (struct: PangoGlyphVisAttr)
      inline def is_cluster_start : _root_.sn.gnome.glib.internal.guint = struct._1
      inline def is_cluster_start_=(value: _root_.sn.gnome.glib.internal.guint): Unit = (!struct.at1 = value)
      inline def is_color : _root_.sn.gnome.glib.internal.guint = struct._2
      inline def is_color_=(value: _root_.sn.gnome.glib.internal.guint): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates PangoGlyphVisAttr on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[PangoGlyphVisAttr] = scala.scalanative.unsafe.alloc[PangoGlyphVisAttr](1)
  def apply(is_cluster_start : _root_.sn.gnome.glib.internal.guint, is_color : _root_.sn.gnome.glib.internal.guint)(using Zone): Ptr[PangoGlyphVisAttr] =
    val ____ptr = apply()
    (!____ptr).is_cluster_start = is_cluster_start
    (!____ptr).is_color = is_color
    ____ptr