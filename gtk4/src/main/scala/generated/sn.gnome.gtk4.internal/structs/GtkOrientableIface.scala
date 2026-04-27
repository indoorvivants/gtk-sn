package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkOrientableIface = CStruct1[_root_.sn.gnome.gobject.internal.GTypeInterface]

object GtkOrientableIface:
  given _tag: Tag[GtkOrientableIface] = Tag.materializeCStruct1Tag[_root_.sn.gnome.gobject.internal.GTypeInterface]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GtkOrientableIface)
      inline def base_iface : _root_.sn.gnome.gobject.internal.GTypeInterface = struct._1
      inline def base_iface_=(value: _root_.sn.gnome.gobject.internal.GTypeInterface): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates GtkOrientableIface on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GtkOrientableIface] = scala.scalanative.unsafe.alloc[GtkOrientableIface](1)
  def apply(base_iface : _root_.sn.gnome.gobject.internal.GTypeInterface)(using Zone): Ptr[GtkOrientableIface] =
    val ____ptr = apply()
    (!____ptr).base_iface = base_iface
    ____ptr