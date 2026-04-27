package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.3: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GOnce = CStruct2[_root_.sn.gnome.glib.internal.GOnceStatus, _root_.sn.gnome.glib.internal.gpointer]

object GOnce:
  given _tag: Tag[GOnce] = Tag.materializeCStruct2Tag[_root_.sn.gnome.glib.internal.GOnceStatus, _root_.sn.gnome.glib.internal.gpointer]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GOnce)
      inline def status : _root_.sn.gnome.glib.internal.GOnceStatus = struct._1
      inline def status_=(value: _root_.sn.gnome.glib.internal.GOnceStatus): Unit = (!struct.at1 = value)
      inline def retval : _root_.sn.gnome.glib.internal.gpointer = struct._2
      inline def retval_=(value: _root_.sn.gnome.glib.internal.gpointer): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates GOnce on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GOnce] = scala.scalanative.unsafe.alloc[GOnce](1)
  def apply(status : _root_.sn.gnome.glib.internal.GOnceStatus, retval : _root_.sn.gnome.glib.internal.gpointer)(using Zone): Ptr[GOnce] =
    val ____ptr = apply()
    (!____ptr).status = status
    (!____ptr).retval = retval
    ____ptr