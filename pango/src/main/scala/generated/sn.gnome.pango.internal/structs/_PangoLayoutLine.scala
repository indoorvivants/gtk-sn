package sn.gnome.pango.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * PangoLayoutLine: : (nullable): the layout this line belongs to, might be %NULL _index: start of line as byte index into layout->text : length of line in bytes : (nullable) (element-type Pango.LayoutRun): list of runs in the line, from left to right _dir: #Resolved PangoDirection of line
*/
opaque type _PangoLayoutLine = CStruct6[Ptr[PangoLayout], _root_.sn.gnome.glib.internal.gint, _root_.sn.gnome.glib.internal.gint, Ptr[Byte], _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint]

object _PangoLayoutLine:
  given _tag: Tag[_PangoLayoutLine] = Tag.materializeCStruct6Tag[Ptr[PangoLayout], _root_.sn.gnome.glib.internal.gint, _root_.sn.gnome.glib.internal.gint, Ptr[Byte], _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _PangoLayoutLine)
      inline def layout : Ptr[PangoLayout] = struct._1
      inline def layout_=(value: Ptr[PangoLayout]): Unit = (!struct.at1 = value)
      inline def start_index : _root_.sn.gnome.glib.internal.gint = struct._2
      inline def start_index_=(value: _root_.sn.gnome.glib.internal.gint): Unit = (!struct.at2 = value)
      inline def length : _root_.sn.gnome.glib.internal.gint = struct._3
      inline def length_=(value: _root_.sn.gnome.glib.internal.gint): Unit = (!struct.at3 = value)
      inline def runs : Ptr[_root_.sn.gnome.glib.internal.GSList] = struct._4.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.GSList]]
      inline def runs_=(value: Ptr[_root_.sn.gnome.glib.internal.GSList]): Unit = (!struct.at4 = value.asInstanceOf[Ptr[Byte]])
      inline def is_paragraph_start : _root_.sn.gnome.glib.internal.guint = struct._5
      inline def is_paragraph_start_=(value: _root_.sn.gnome.glib.internal.guint): Unit = (!struct.at5 = value)
      inline def resolved_dir : _root_.sn.gnome.glib.internal.guint = struct._6
      inline def resolved_dir_=(value: _root_.sn.gnome.glib.internal.guint): Unit = (!struct.at6 = value)
    end extension
  
  // Allocates _PangoLayoutLine on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_PangoLayoutLine] = scala.scalanative.unsafe.alloc[_PangoLayoutLine](1)
  def apply(layout : Ptr[PangoLayout], start_index : _root_.sn.gnome.glib.internal.gint, length : _root_.sn.gnome.glib.internal.gint, runs : Ptr[_root_.sn.gnome.glib.internal.GSList], is_paragraph_start : _root_.sn.gnome.glib.internal.guint, resolved_dir : _root_.sn.gnome.glib.internal.guint)(using Zone): Ptr[_PangoLayoutLine] =
    val ____ptr = apply()
    (!____ptr).layout = layout
    (!____ptr).start_index = start_index
    (!____ptr).length = length
    (!____ptr).runs = runs
    (!____ptr).is_paragraph_start = is_paragraph_start
    (!____ptr).resolved_dir = resolved_dir
    ____ptr