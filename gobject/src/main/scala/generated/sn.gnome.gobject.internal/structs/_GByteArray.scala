package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.3: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GByteArray = CStruct2[Ptr[_root_.sn.gnome.glib.internal.guint8], _root_.sn.gnome.glib.internal.guint]

object _GByteArray:
  given _tag: Tag[_GByteArray] = Tag.materializeCStruct2Tag[Ptr[_root_.sn.gnome.glib.internal.guint8], _root_.sn.gnome.glib.internal.guint]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GByteArray)
      inline def data : Ptr[_root_.sn.gnome.glib.internal.guint8] = struct._1
      inline def data_=(value: Ptr[_root_.sn.gnome.glib.internal.guint8]): Unit = (!struct.at1 = value)
      inline def len : _root_.sn.gnome.glib.internal.guint = struct._2
      inline def len_=(value: _root_.sn.gnome.glib.internal.guint): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates _GByteArray on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GByteArray] = scala.scalanative.unsafe.alloc[_GByteArray](1)
  def apply(data : Ptr[_root_.sn.gnome.glib.internal.guint8], len : _root_.sn.gnome.glib.internal.guint)(using Zone): Ptr[_GByteArray] =
    val ____ptr = apply()
    (!____ptr).data = data
    (!____ptr).len = len
    ____ptr