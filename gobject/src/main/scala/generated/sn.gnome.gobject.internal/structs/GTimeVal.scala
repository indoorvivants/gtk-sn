package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.3: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GTimeVal = CStruct2[_root_.sn.gnome.glib.internal.glong, _root_.sn.gnome.glib.internal.glong]

object GTimeVal:
  given _tag: Tag[GTimeVal] = Tag.materializeCStruct2Tag[_root_.sn.gnome.glib.internal.glong, _root_.sn.gnome.glib.internal.glong]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GTimeVal)
      inline def tv_sec : _root_.sn.gnome.glib.internal.glong = struct._1
      inline def tv_sec_=(value: _root_.sn.gnome.glib.internal.glong): Unit = (!struct.at1 = value)
      inline def tv_usec : _root_.sn.gnome.glib.internal.glong = struct._2
      inline def tv_usec_=(value: _root_.sn.gnome.glib.internal.glong): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates GTimeVal on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GTimeVal] = scala.scalanative.unsafe.alloc[GTimeVal](1)
  def apply(tv_sec : _root_.sn.gnome.glib.internal.glong, tv_usec : _root_.sn.gnome.glib.internal.glong)(using Zone): Ptr[GTimeVal] =
    val ____ptr = apply()
    (!____ptr).tv_sec = tv_sec
    (!____ptr).tv_usec = tv_usec
    ____ptr