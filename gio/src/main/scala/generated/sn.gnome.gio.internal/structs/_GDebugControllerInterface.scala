package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GDebugControllerInterface: _iface: The parent interface.
*/
opaque type _GDebugControllerInterface = CStruct1[_root_.sn.gnome.gobject.internal.GTypeInterface]

object _GDebugControllerInterface:
  given _tag: Tag[_GDebugControllerInterface] = Tag.materializeCStruct1Tag[_root_.sn.gnome.gobject.internal.GTypeInterface]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GDebugControllerInterface)
      inline def g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface = struct._1
      inline def g_iface_=(value: _root_.sn.gnome.gobject.internal.GTypeInterface): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates _GDebugControllerInterface on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GDebugControllerInterface] = scala.scalanative.unsafe.alloc[_GDebugControllerInterface](1)
  def apply(g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface)(using Zone): Ptr[_GDebugControllerInterface] =
    val ____ptr = apply()
    (!____ptr).g_iface = g_iface
    ____ptr