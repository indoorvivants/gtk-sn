package sn.gnome.pango.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * PangoColor: : value of red component : value of green component : value of blue component
*/
opaque type _PangoColor = CStruct3[_root_.sn.gnome.glib.internal.guint16, _root_.sn.gnome.glib.internal.guint16, _root_.sn.gnome.glib.internal.guint16]

object _PangoColor:
  given _tag: Tag[_PangoColor] = Tag.materializeCStruct3Tag[_root_.sn.gnome.glib.internal.guint16, _root_.sn.gnome.glib.internal.guint16, _root_.sn.gnome.glib.internal.guint16]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _PangoColor)
      inline def red : _root_.sn.gnome.glib.internal.guint16 = struct._1
      inline def red_=(value: _root_.sn.gnome.glib.internal.guint16): Unit = (!struct.at1 = value)
      inline def green : _root_.sn.gnome.glib.internal.guint16 = struct._2
      inline def green_=(value: _root_.sn.gnome.glib.internal.guint16): Unit = (!struct.at2 = value)
      inline def blue : _root_.sn.gnome.glib.internal.guint16 = struct._3
      inline def blue_=(value: _root_.sn.gnome.glib.internal.guint16): Unit = (!struct.at3 = value)
    end extension
  
  // Allocates _PangoColor on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_PangoColor] = scala.scalanative.unsafe.alloc[_PangoColor](1)
  def apply(red : _root_.sn.gnome.glib.internal.guint16, green : _root_.sn.gnome.glib.internal.guint16, blue : _root_.sn.gnome.glib.internal.guint16)(using Zone): Ptr[_PangoColor] =
    val ____ptr = apply()
    (!____ptr).red = red
    (!____ptr).green = green
    (!____ptr).blue = blue
    ____ptr