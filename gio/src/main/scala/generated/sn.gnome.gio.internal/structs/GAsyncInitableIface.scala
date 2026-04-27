package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GAsyncInitableIface: _iface: The parent interface. _async: Starts initialization of the object. _finish: Finishes initialization of the object.
*/
opaque type GAsyncInitableIface = CArray[CChar, Nat.Digit2[Nat._3, Nat._2]]

object GAsyncInitableIface:
  given _tag: Tag[GAsyncInitableIface] = Tag.CArray[CChar, Nat.Digit2[Nat._3, Nat._2]](Tag.Byte, Tag.Digit2[Nat._3, Nat._2](Tag.Nat3, Tag.Nat2))
  
  export fields.*
  private[internal] object fields:
    extension (struct: GAsyncInitableIface)
      inline def g_iface: _root_.sn.gnome.gobject.internal.GTypeInterface = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GTypeInterface]]
      inline def g_iface_=(value: _root_.sn.gnome.gobject.internal.GTypeInterface): Unit = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GTypeInterface]] = value
      inline def init_async: CFuncPtr5[Ptr[GAsyncInitable], CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit] = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr5[Ptr[GAsyncInitable], CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]]]
      inline def init_async_=(value: CFuncPtr5[Ptr[GAsyncInitable], CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]): Unit = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr5[Ptr[GAsyncInitable], CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]]] = value
      inline def init_finish: CFuncPtr3[Ptr[GAsyncInitable], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean] = !struct.at(offsets(2)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GAsyncInitable], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]]]
      inline def init_finish_=(value: CFuncPtr3[Ptr[GAsyncInitable], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at(offsets(2)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GAsyncInitable], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]]] = value
    end extension
  
  // Allocates GAsyncInitableIface on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GAsyncInitableIface] = scala.scalanative.unsafe.alloc[GAsyncInitableIface](1)
  def apply(g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface, init_async : CFuncPtr5[Ptr[GAsyncInitable], CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], init_finish : CFuncPtr3[Ptr[GAsyncInitable], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean])(using Zone): Ptr[GAsyncInitableIface] =
    val ____ptr = apply()
    (!____ptr).g_iface = g_iface
    (!____ptr).init_async = init_async
    (!____ptr).init_finish = init_finish
    ____ptr
  
  val offsets: Array[Int] =
    val res = Array.ofDim[Int](3)
    def align(offset: Int, alignment: Int) = {
      val alignmentMask = alignment - 1
      val padding =
        if ((offset & alignmentMask) == 0) 0
        else alignment - (offset & alignmentMask)
      offset + padding
    }
    
    res(0) = align(0, alignmentof[_root_.sn.gnome.gobject.internal.GTypeInterface].toInt)
    res(1) = align(res(0) + sizeof[_root_.sn.gnome.gobject.internal.GTypeInterface].toInt, alignmentof[CFuncPtr5[Ptr[GAsyncInitable], CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]].toInt)
    res(2) = align(res(1) + sizeof[CFuncPtr5[Ptr[GAsyncInitable], CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]].toInt, alignmentof[CFuncPtr3[Ptr[GAsyncInitable], Ptr[GAsyncResult], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]].toInt)
    res
  end offsets