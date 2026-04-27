package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.3: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GDebugKey = CStruct2[Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.guint]

object GDebugKey:
  given _tag: Tag[GDebugKey] = Tag.materializeCStruct2Tag[Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.guint]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GDebugKey)
      inline def key : Ptr[_root_.sn.gnome.glib.internal.gchar] = struct._1
      inline def key_=(value: Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = (!struct.at1 = value)
      inline def value : _root_.sn.gnome.glib.internal.guint = struct._2
      inline def value_=(value: _root_.sn.gnome.glib.internal.guint): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates GDebugKey on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GDebugKey] = scala.scalanative.unsafe.alloc[GDebugKey](1)
  def apply(key : Ptr[_root_.sn.gnome.glib.internal.gchar], value : _root_.sn.gnome.glib.internal.guint)(using Zone): Ptr[GDebugKey] =
    val ____ptr = apply()
    (!____ptr).key = key
    (!____ptr).value = value
    ____ptr