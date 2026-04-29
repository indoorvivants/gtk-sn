package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GSocketConnectableIface: _iface: The parent interface. : Creates a #GSocketAddressEnumerator _enumerate: Creates a #GProxyAddressEnumerator _string: Format the connectable’s address as a string for debugging. Implementing this is optional. (Since: 2.48)
*/
opaque type _GSocketConnectableIface = CStruct4[_root_.sn.gnome.gobject.internal.GTypeInterface, CFuncPtr1[Ptr[GSocketConnectable], Ptr[GSocketAddressEnumerator]], CFuncPtr1[Ptr[GSocketConnectable], Ptr[GSocketAddressEnumerator]], CFuncPtr1[Ptr[GSocketConnectable], Ptr[_root_.sn.gnome.glib.internal.gchar]]]

object _GSocketConnectableIface:
  given _tag: Tag[_GSocketConnectableIface] = Tag.materializeCStruct4Tag[_root_.sn.gnome.gobject.internal.GTypeInterface, CFuncPtr1[Ptr[GSocketConnectable], Ptr[GSocketAddressEnumerator]], CFuncPtr1[Ptr[GSocketConnectable], Ptr[GSocketAddressEnumerator]], CFuncPtr1[Ptr[GSocketConnectable], Ptr[_root_.sn.gnome.glib.internal.gchar]]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GSocketConnectableIface)
      inline def g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface = struct._1
      inline def g_iface_=(value: _root_.sn.gnome.gobject.internal.GTypeInterface): Unit = (!struct.at1 = value)
      inline def enumerate : CFuncPtr1[Ptr[GSocketConnectable], Ptr[GSocketAddressEnumerator]] = struct._2
      inline def enumerate_=(value: CFuncPtr1[Ptr[GSocketConnectable], Ptr[GSocketAddressEnumerator]]): Unit = (!struct.at2 = value)
      inline def proxy_enumerate : CFuncPtr1[Ptr[GSocketConnectable], Ptr[GSocketAddressEnumerator]] = struct._3
      inline def proxy_enumerate_=(value: CFuncPtr1[Ptr[GSocketConnectable], Ptr[GSocketAddressEnumerator]]): Unit = (!struct.at3 = value)
      inline def to_string : CFuncPtr1[Ptr[GSocketConnectable], Ptr[_root_.sn.gnome.glib.internal.gchar]] = struct._4
      inline def to_string_=(value: CFuncPtr1[Ptr[GSocketConnectable], Ptr[_root_.sn.gnome.glib.internal.gchar]]): Unit = (!struct.at4 = value)
    end extension
  
  // Allocates _GSocketConnectableIface on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GSocketConnectableIface] = scala.scalanative.unsafe.alloc[_GSocketConnectableIface](1)
  def apply(g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface, enumerate : CFuncPtr1[Ptr[GSocketConnectable], Ptr[GSocketAddressEnumerator]], proxy_enumerate : CFuncPtr1[Ptr[GSocketConnectable], Ptr[GSocketAddressEnumerator]], to_string : CFuncPtr1[Ptr[GSocketConnectable], Ptr[_root_.sn.gnome.glib.internal.gchar]])(using Zone): Ptr[_GSocketConnectableIface] =
    val ____ptr = apply()
    (!____ptr).g_iface = g_iface
    (!____ptr).enumerate = enumerate
    (!____ptr).proxy_enumerate = proxy_enumerate
    (!____ptr).to_string = to_string
    ____ptr