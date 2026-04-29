package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GPollableInputStreamInterface: _iface: The parent interface. _poll: Checks if the #GPollableInputStream instance is actually pollable _source: Creates a #GSource to poll the stream _nonblocking: Does a non-blocking read or returns %G_IO_ERROR_WOULD_BLOCK
*/
opaque type GPollableInputStreamInterface = CArray[CChar, Nat.Digit2[Nat._4, Nat._8]]

object GPollableInputStreamInterface:
  given _tag: Tag[GPollableInputStreamInterface] = Tag.CArray[CChar, Nat.Digit2[Nat._4, Nat._8]](Tag.Byte, Tag.Digit2[Nat._4, Nat._8](Tag.Nat4, Tag.Nat8))
  
  export fields.*
  private[internal] object fields:
    extension (struct: GPollableInputStreamInterface)
      inline def g_iface: _root_.sn.gnome.gobject.internal.GTypeInterface = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GTypeInterface]]
      inline def g_iface_=(value: _root_.sn.gnome.gobject.internal.GTypeInterface): Unit = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GTypeInterface]] = value
      inline def can_poll: CFuncPtr1[Ptr[GPollableInputStream], _root_.sn.gnome.glib.internal.gboolean] = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GPollableInputStream], _root_.sn.gnome.glib.internal.gboolean]]]
      inline def can_poll_=(value: CFuncPtr1[Ptr[GPollableInputStream], _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GPollableInputStream], _root_.sn.gnome.glib.internal.gboolean]]] = value
      inline def is_readable: CFuncPtr1[Ptr[GPollableInputStream], _root_.sn.gnome.glib.internal.gboolean] = !struct.at(offsets(2)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GPollableInputStream], _root_.sn.gnome.glib.internal.gboolean]]]
      inline def is_readable_=(value: CFuncPtr1[Ptr[GPollableInputStream], _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at(offsets(2)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GPollableInputStream], _root_.sn.gnome.glib.internal.gboolean]]] = value
      inline def create_source: CFuncPtr2[Ptr[GPollableInputStream], Ptr[GCancellable], Ptr[_root_.sn.gnome.glib.internal.GSource]] = !struct.at(offsets(3)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GPollableInputStream], Ptr[GCancellable], Ptr[_root_.sn.gnome.glib.internal.GSource]]]]
      inline def create_source_=(value: CFuncPtr2[Ptr[GPollableInputStream], Ptr[GCancellable], Ptr[_root_.sn.gnome.glib.internal.GSource]]): Unit = !struct.at(offsets(3)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GPollableInputStream], Ptr[GCancellable], Ptr[_root_.sn.gnome.glib.internal.GSource]]]] = value
      inline def read_nonblocking: CFuncPtr4[Ptr[GPollableInputStream], Ptr[Byte], _root_.sn.gnome.glib.internal.gsize, Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gssize] = !struct.at(offsets(4)).asInstanceOf[Ptr[CFuncPtr4[Ptr[GPollableInputStream], Ptr[Byte], _root_.sn.gnome.glib.internal.gsize, Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gssize]]]
      inline def read_nonblocking_=(value: CFuncPtr4[Ptr[GPollableInputStream], Ptr[Byte], _root_.sn.gnome.glib.internal.gsize, Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gssize]): Unit = !struct.at(offsets(4)).asInstanceOf[Ptr[CFuncPtr4[Ptr[GPollableInputStream], Ptr[Byte], _root_.sn.gnome.glib.internal.gsize, Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gssize]]] = value
    end extension
  
  // Allocates GPollableInputStreamInterface on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GPollableInputStreamInterface] = scala.scalanative.unsafe.alloc[GPollableInputStreamInterface](1)
  def apply(g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface, can_poll : CFuncPtr1[Ptr[GPollableInputStream], _root_.sn.gnome.glib.internal.gboolean], is_readable : CFuncPtr1[Ptr[GPollableInputStream], _root_.sn.gnome.glib.internal.gboolean], create_source : CFuncPtr2[Ptr[GPollableInputStream], Ptr[GCancellable], Ptr[_root_.sn.gnome.glib.internal.GSource]], read_nonblocking : CFuncPtr4[Ptr[GPollableInputStream], Ptr[Byte], _root_.sn.gnome.glib.internal.gsize, Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gssize])(using Zone): Ptr[GPollableInputStreamInterface] =
    val ____ptr = apply()
    (!____ptr).g_iface = g_iface
    (!____ptr).can_poll = can_poll
    (!____ptr).is_readable = is_readable
    (!____ptr).create_source = create_source
    (!____ptr).read_nonblocking = read_nonblocking
    ____ptr
  
  val offsets: Array[Int] =
    val res = Array.ofDim[Int](5)
    def align(offset: Int, alignment: Int) = {
      val alignmentMask = alignment - 1
      val padding =
        if ((offset & alignmentMask) == 0) 0
        else alignment - (offset & alignmentMask)
      offset + padding
    }
    
    res(0) = align(0, alignmentof[_root_.sn.gnome.gobject.internal.GTypeInterface].toInt)
    res(1) = align(res(0) + sizeof[_root_.sn.gnome.gobject.internal.GTypeInterface].toInt, alignmentof[CFuncPtr1[Ptr[GPollableInputStream], _root_.sn.gnome.glib.internal.gboolean]].toInt)
    res(2) = align(res(1) + sizeof[CFuncPtr1[Ptr[GPollableInputStream], _root_.sn.gnome.glib.internal.gboolean]].toInt, alignmentof[CFuncPtr1[Ptr[GPollableInputStream], _root_.sn.gnome.glib.internal.gboolean]].toInt)
    res(3) = align(res(2) + sizeof[CFuncPtr1[Ptr[GPollableInputStream], _root_.sn.gnome.glib.internal.gboolean]].toInt, alignmentof[CFuncPtr2[Ptr[GPollableInputStream], Ptr[GCancellable], Ptr[_root_.sn.gnome.glib.internal.GSource]]].toInt)
    res(4) = align(res(3) + sizeof[CFuncPtr2[Ptr[GPollableInputStream], Ptr[GCancellable], Ptr[_root_.sn.gnome.glib.internal.GSource]]].toInt, alignmentof[CFuncPtr4[Ptr[GPollableInputStream], Ptr[Byte], _root_.sn.gnome.glib.internal.gsize, Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gssize]].toInt)
    res
  end offsets