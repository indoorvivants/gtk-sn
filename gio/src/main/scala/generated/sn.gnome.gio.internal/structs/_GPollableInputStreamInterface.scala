package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GPollableInputStreamInterface: _iface: The parent interface. _poll: Checks if the #GPollableInputStream instance is actually pollable _source: Creates a #GSource to poll the stream _nonblocking: Does a non-blocking read or returns %G_IO_ERROR_WOULD_BLOCK
*/
opaque type _GPollableInputStreamInterface = CStruct5[_root_.sn.gnome.gobject.internal.GTypeInterface, CFuncPtr1[Ptr[GPollableInputStream], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr1[Ptr[GPollableInputStream], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr2[Ptr[GPollableInputStream], Ptr[GCancellable], Ptr[Byte]], CFuncPtr4[Ptr[GPollableInputStream], Ptr[Byte], _root_.sn.gnome.glib.internal.gsize, Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gssize]]

object _GPollableInputStreamInterface:
  given _tag: Tag[_GPollableInputStreamInterface] = Tag.materializeCStruct5Tag[_root_.sn.gnome.gobject.internal.GTypeInterface, CFuncPtr1[Ptr[GPollableInputStream], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr1[Ptr[GPollableInputStream], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr2[Ptr[GPollableInputStream], Ptr[GCancellable], Ptr[Byte]], CFuncPtr4[Ptr[GPollableInputStream], Ptr[Byte], _root_.sn.gnome.glib.internal.gsize, Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gssize]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GPollableInputStreamInterface)
      inline def g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface = struct._1
      inline def g_iface_=(value: _root_.sn.gnome.gobject.internal.GTypeInterface): Unit = (!struct.at1 = value)
      inline def can_poll : CFuncPtr1[Ptr[GPollableInputStream], _root_.sn.gnome.glib.internal.gboolean] = struct._2
      inline def can_poll_=(value: CFuncPtr1[Ptr[GPollableInputStream], _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at2 = value)
      inline def is_readable : CFuncPtr1[Ptr[GPollableInputStream], _root_.sn.gnome.glib.internal.gboolean] = struct._3
      inline def is_readable_=(value: CFuncPtr1[Ptr[GPollableInputStream], _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at3 = value)
      inline def create_source : CFuncPtr2[Ptr[GPollableInputStream], Ptr[GCancellable], Ptr[_root_.sn.gnome.glib.internal.GSource]] = struct._4.asInstanceOf[CFuncPtr2[Ptr[GPollableInputStream], Ptr[GCancellable], Ptr[_root_.sn.gnome.glib.internal.GSource]]]
      inline def create_source_=(value: CFuncPtr2[Ptr[GPollableInputStream], Ptr[GCancellable], Ptr[_root_.sn.gnome.glib.internal.GSource]]): Unit = (!struct.at4 = value.asInstanceOf[CFuncPtr2[Ptr[GPollableInputStream], Ptr[GCancellable], Ptr[Byte]]])
      inline def read_nonblocking : CFuncPtr4[Ptr[GPollableInputStream], Ptr[Byte], _root_.sn.gnome.glib.internal.gsize, Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gssize] = struct._5
      inline def read_nonblocking_=(value: CFuncPtr4[Ptr[GPollableInputStream], Ptr[Byte], _root_.sn.gnome.glib.internal.gsize, Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gssize]): Unit = (!struct.at5 = value)
    end extension
  
  // Allocates _GPollableInputStreamInterface on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GPollableInputStreamInterface] = scala.scalanative.unsafe.alloc[_GPollableInputStreamInterface](1)
  def apply(g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface, can_poll : CFuncPtr1[Ptr[GPollableInputStream], _root_.sn.gnome.glib.internal.gboolean], is_readable : CFuncPtr1[Ptr[GPollableInputStream], _root_.sn.gnome.glib.internal.gboolean], create_source : CFuncPtr2[Ptr[GPollableInputStream], Ptr[GCancellable], Ptr[_root_.sn.gnome.glib.internal.GSource]], read_nonblocking : CFuncPtr4[Ptr[GPollableInputStream], Ptr[Byte], _root_.sn.gnome.glib.internal.gsize, Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gssize])(using Zone): Ptr[_GPollableInputStreamInterface] =
    val ____ptr = apply()
    (!____ptr).g_iface = g_iface
    (!____ptr).can_poll = can_poll
    (!____ptr).is_readable = is_readable
    (!____ptr).create_source = create_source
    (!____ptr).read_nonblocking = read_nonblocking
    ____ptr