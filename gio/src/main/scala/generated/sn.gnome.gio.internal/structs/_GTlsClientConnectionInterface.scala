package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GTlsClientConnectionInterface: _iface: The parent interface. _session_state: Copies session state from one #GTlsClientConnection to another.
*/
opaque type _GTlsClientConnectionInterface = CStruct2[_root_.sn.gnome.gobject.internal.GTypeInterface, CFuncPtr2[Ptr[GTlsClientConnection], Ptr[GTlsClientConnection], Unit]]

object _GTlsClientConnectionInterface:
  given _tag: Tag[_GTlsClientConnectionInterface] = Tag.materializeCStruct2Tag[_root_.sn.gnome.gobject.internal.GTypeInterface, CFuncPtr2[Ptr[GTlsClientConnection], Ptr[GTlsClientConnection], Unit]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GTlsClientConnectionInterface)
      inline def g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface = struct._1
      inline def g_iface_=(value: _root_.sn.gnome.gobject.internal.GTypeInterface): Unit = (!struct.at1 = value)
      inline def copy_session_state : CFuncPtr2[Ptr[GTlsClientConnection], Ptr[GTlsClientConnection], Unit] = struct._2
      inline def copy_session_state_=(value: CFuncPtr2[Ptr[GTlsClientConnection], Ptr[GTlsClientConnection], Unit]): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates _GTlsClientConnectionInterface on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GTlsClientConnectionInterface] = scala.scalanative.unsafe.alloc[_GTlsClientConnectionInterface](1)
  def apply(g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface, copy_session_state : CFuncPtr2[Ptr[GTlsClientConnection], Ptr[GTlsClientConnection], Unit])(using Zone): Ptr[_GTlsClientConnectionInterface] =
    val ____ptr = apply()
    (!____ptr).g_iface = g_iface
    (!____ptr).copy_session_state = copy_session_state
    ____ptr