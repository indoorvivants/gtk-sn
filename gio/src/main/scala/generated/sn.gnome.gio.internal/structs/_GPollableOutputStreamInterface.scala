package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GPollableOutputStreamInterface: _iface: The parent interface. _poll: Checks if the #GPollableOutputStream instance is actually pollable _source: Creates a #GSource to poll the stream _nonblocking: Does a non-blocking write or returns %G_IO_ERROR_WOULD_BLOCK _nonblocking: Does a vectored non-blocking write, or returns %G_POLLABLE_RETURN_WOULD_BLOCK
*/
opaque type _GPollableOutputStreamInterface = CStruct6[_root_.sn.gnome.gobject.internal.GTypeInterface, CFuncPtr1[Ptr[GPollableOutputStream], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr1[Ptr[GPollableOutputStream], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr2[Ptr[GPollableOutputStream], Ptr[GCancellable], Ptr[Byte]], CFuncPtr4[Ptr[GPollableOutputStream], Ptr[Byte], _root_.sn.gnome.glib.internal.gsize, Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gssize], CFuncPtr5[Ptr[GPollableOutputStream], Ptr[GOutputVector], _root_.sn.gnome.glib.internal.gsize, Ptr[_root_.sn.gnome.glib.internal.gsize], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], GPollableReturn]]

object _GPollableOutputStreamInterface:
  given _tag: Tag[_GPollableOutputStreamInterface] = Tag.materializeCStruct6Tag[_root_.sn.gnome.gobject.internal.GTypeInterface, CFuncPtr1[Ptr[GPollableOutputStream], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr1[Ptr[GPollableOutputStream], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr2[Ptr[GPollableOutputStream], Ptr[GCancellable], Ptr[Byte]], CFuncPtr4[Ptr[GPollableOutputStream], Ptr[Byte], _root_.sn.gnome.glib.internal.gsize, Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gssize], CFuncPtr5[Ptr[GPollableOutputStream], Ptr[GOutputVector], _root_.sn.gnome.glib.internal.gsize, Ptr[_root_.sn.gnome.glib.internal.gsize], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], GPollableReturn]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GPollableOutputStreamInterface)
      inline def g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface = struct._1
      inline def g_iface_=(value: _root_.sn.gnome.gobject.internal.GTypeInterface): Unit = (!struct.at1 = value)
      inline def can_poll : CFuncPtr1[Ptr[GPollableOutputStream], _root_.sn.gnome.glib.internal.gboolean] = struct._2
      inline def can_poll_=(value: CFuncPtr1[Ptr[GPollableOutputStream], _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at2 = value)
      inline def is_writable : CFuncPtr1[Ptr[GPollableOutputStream], _root_.sn.gnome.glib.internal.gboolean] = struct._3
      inline def is_writable_=(value: CFuncPtr1[Ptr[GPollableOutputStream], _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at3 = value)
      inline def create_source : CFuncPtr2[Ptr[GPollableOutputStream], Ptr[GCancellable], Ptr[_root_.sn.gnome.glib.internal.GSource]] = struct._4.asInstanceOf[CFuncPtr2[Ptr[GPollableOutputStream], Ptr[GCancellable], Ptr[_root_.sn.gnome.glib.internal.GSource]]]
      inline def create_source_=(value: CFuncPtr2[Ptr[GPollableOutputStream], Ptr[GCancellable], Ptr[_root_.sn.gnome.glib.internal.GSource]]): Unit = (!struct.at4 = value.asInstanceOf[CFuncPtr2[Ptr[GPollableOutputStream], Ptr[GCancellable], Ptr[Byte]]])
      inline def write_nonblocking : CFuncPtr4[Ptr[GPollableOutputStream], Ptr[Byte], _root_.sn.gnome.glib.internal.gsize, Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gssize] = struct._5
      inline def write_nonblocking_=(value: CFuncPtr4[Ptr[GPollableOutputStream], Ptr[Byte], _root_.sn.gnome.glib.internal.gsize, Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gssize]): Unit = (!struct.at5 = value)
      inline def writev_nonblocking : CFuncPtr5[Ptr[GPollableOutputStream], Ptr[GOutputVector], _root_.sn.gnome.glib.internal.gsize, Ptr[_root_.sn.gnome.glib.internal.gsize], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], GPollableReturn] = struct._6
      inline def writev_nonblocking_=(value: CFuncPtr5[Ptr[GPollableOutputStream], Ptr[GOutputVector], _root_.sn.gnome.glib.internal.gsize, Ptr[_root_.sn.gnome.glib.internal.gsize], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], GPollableReturn]): Unit = (!struct.at6 = value)
    end extension
  
  // Allocates _GPollableOutputStreamInterface on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GPollableOutputStreamInterface] = scala.scalanative.unsafe.alloc[_GPollableOutputStreamInterface](1)
  def apply(g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface, can_poll : CFuncPtr1[Ptr[GPollableOutputStream], _root_.sn.gnome.glib.internal.gboolean], is_writable : CFuncPtr1[Ptr[GPollableOutputStream], _root_.sn.gnome.glib.internal.gboolean], create_source : CFuncPtr2[Ptr[GPollableOutputStream], Ptr[GCancellable], Ptr[_root_.sn.gnome.glib.internal.GSource]], write_nonblocking : CFuncPtr4[Ptr[GPollableOutputStream], Ptr[Byte], _root_.sn.gnome.glib.internal.gsize, Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gssize], writev_nonblocking : CFuncPtr5[Ptr[GPollableOutputStream], Ptr[GOutputVector], _root_.sn.gnome.glib.internal.gsize, Ptr[_root_.sn.gnome.glib.internal.gsize], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], GPollableReturn])(using Zone): Ptr[_GPollableOutputStreamInterface] =
    val ____ptr = apply()
    (!____ptr).g_iface = g_iface
    (!____ptr).can_poll = can_poll
    (!____ptr).is_writable = is_writable
    (!____ptr).create_source = create_source
    (!____ptr).write_nonblocking = write_nonblocking
    (!____ptr).writev_nonblocking = writev_nonblocking
    ____ptr