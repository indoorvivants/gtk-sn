package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.3: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GString = CStruct3[Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.gsize, _root_.sn.gnome.glib.internal.gsize]

object GString:
  given _tag: Tag[GString] = Tag.materializeCStruct3Tag[Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.gsize, _root_.sn.gnome.glib.internal.gsize]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GString)
      inline def str : Ptr[_root_.sn.gnome.glib.internal.gchar] = struct._1
      inline def str_=(value: Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = (!struct.at1 = value)
      inline def len : _root_.sn.gnome.glib.internal.gsize = struct._2
      inline def len_=(value: _root_.sn.gnome.glib.internal.gsize): Unit = (!struct.at2 = value)
      inline def allocated_len : _root_.sn.gnome.glib.internal.gsize = struct._3
      inline def allocated_len_=(value: _root_.sn.gnome.glib.internal.gsize): Unit = (!struct.at3 = value)
    end extension
  
  // Allocates GString on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GString] = scala.scalanative.unsafe.alloc[GString](1)
  def apply(str : Ptr[_root_.sn.gnome.glib.internal.gchar], len : _root_.sn.gnome.glib.internal.gsize, allocated_len : _root_.sn.gnome.glib.internal.gsize)(using Zone): Ptr[GString] =
    val ____ptr = apply()
    (!____ptr).str = str
    (!____ptr).len = len
    (!____ptr).allocated_len = allocated_len
    ____ptr