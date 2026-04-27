package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.3: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GLogField = CStruct3[Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.gconstpointer, _root_.sn.gnome.glib.internal.gssize]

object GLogField:
  given _tag: Tag[GLogField] = Tag.materializeCStruct3Tag[Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.gconstpointer, _root_.sn.gnome.glib.internal.gssize]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GLogField)
      inline def key : Ptr[_root_.sn.gnome.glib.internal.gchar] = struct._1
      inline def key_=(value: Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = (!struct.at1 = value)
      inline def value : _root_.sn.gnome.glib.internal.gconstpointer = struct._2
      inline def value_=(value: _root_.sn.gnome.glib.internal.gconstpointer): Unit = (!struct.at2 = value)
      inline def length : _root_.sn.gnome.glib.internal.gssize = struct._3
      inline def length_=(value: _root_.sn.gnome.glib.internal.gssize): Unit = (!struct.at3 = value)
    end extension
  
  // Allocates GLogField on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GLogField] = scala.scalanative.unsafe.alloc[GLogField](1)
  def apply(key : Ptr[_root_.sn.gnome.glib.internal.gchar], value : _root_.sn.gnome.glib.internal.gconstpointer, length : _root_.sn.gnome.glib.internal.gssize)(using Zone): Ptr[GLogField] =
    val ____ptr = apply()
    (!____ptr).key = key
    (!____ptr).value = value
    (!____ptr).length = length
    ____ptr