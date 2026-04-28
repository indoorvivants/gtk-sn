package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GtkOrientableIface = CStruct1[_root_.sn.gnome.gobject.internal.GTypeInterface]

object _GtkOrientableIface:
  given _tag: Tag[_GtkOrientableIface] = Tag.materializeCStruct1Tag[_root_.sn.gnome.gobject.internal.GTypeInterface]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GtkOrientableIface)
      inline def base_iface : _root_.sn.gnome.gobject.internal.GTypeInterface = struct._1
      inline def base_iface_=(value: _root_.sn.gnome.gobject.internal.GTypeInterface): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates _GtkOrientableIface on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GtkOrientableIface] = scala.scalanative.unsafe.alloc[_GtkOrientableIface](1)
  def apply(base_iface : _root_.sn.gnome.gobject.internal.GTypeInterface)(using Zone): Ptr[_GtkOrientableIface] =
    val ____ptr = apply()
    (!____ptr).base_iface = base_iface
    ____ptr