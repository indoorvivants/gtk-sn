package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GLoadableIconIface: _iface: The parent interface. : Loads an icon. _async: Loads an icon asynchronously. _finish: Finishes an asynchronous icon load.
*/
opaque type GLoadableIconIface = CArray[CChar, Nat.Digit2[Nat._4, Nat._0]]

object GLoadableIconIface:
  given _tag: Tag[GLoadableIconIface] = Tag.CArray[CChar, Nat.Digit2[Nat._4, Nat._0]](Tag.Byte, Tag.Digit2[Nat._4, Nat._0](Tag.Nat4, Tag.Nat0))
  
  export fields.*
  private[internal] object fields:
    extension (struct: GLoadableIconIface)
      inline def g_iface: _root_.sn.gnome.gobject.internal.GTypeInterface = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GTypeInterface]]
      inline def g_iface_=(value: _root_.sn.gnome.gobject.internal.GTypeInterface): Unit = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GTypeInterface]] = value
      inline def load: CFuncPtr5[Ptr[GLoadableIcon], CInt, Ptr[CString], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GInputStream]] = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr5[Ptr[GLoadableIcon], CInt, Ptr[CString], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GInputStream]]]]
      inline def load_=(value: CFuncPtr5[Ptr[GLoadableIcon], CInt, Ptr[CString], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GInputStream]]): Unit = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr5[Ptr[GLoadableIcon], CInt, Ptr[CString], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GInputStream]]]] = value
      inline def load_async: CFuncPtr5[Ptr[GLoadableIcon], CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit] = !struct.at(offsets(2)).asInstanceOf[Ptr[CFuncPtr5[Ptr[GLoadableIcon], CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]]]
      inline def load_async_=(value: CFuncPtr5[Ptr[GLoadableIcon], CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]): Unit = !struct.at(offsets(2)).asInstanceOf[Ptr[CFuncPtr5[Ptr[GLoadableIcon], CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]]] = value
      inline def load_finish: CFuncPtr4[Ptr[GLoadableIcon], Ptr[GAsyncResult], Ptr[CString], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GInputStream]] = !struct.at(offsets(3)).asInstanceOf[Ptr[CFuncPtr4[Ptr[GLoadableIcon], Ptr[GAsyncResult], Ptr[CString], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GInputStream]]]]
      inline def load_finish_=(value: CFuncPtr4[Ptr[GLoadableIcon], Ptr[GAsyncResult], Ptr[CString], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GInputStream]]): Unit = !struct.at(offsets(3)).asInstanceOf[Ptr[CFuncPtr4[Ptr[GLoadableIcon], Ptr[GAsyncResult], Ptr[CString], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GInputStream]]]] = value
    end extension
  
  // Allocates GLoadableIconIface on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GLoadableIconIface] = scala.scalanative.unsafe.alloc[GLoadableIconIface](1)
  def apply(g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface, load : CFuncPtr5[Ptr[GLoadableIcon], CInt, Ptr[CString], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GInputStream]], load_async : CFuncPtr5[Ptr[GLoadableIcon], CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit], load_finish : CFuncPtr4[Ptr[GLoadableIcon], Ptr[GAsyncResult], Ptr[CString], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GInputStream]])(using Zone): Ptr[GLoadableIconIface] =
    val ____ptr = apply()
    (!____ptr).g_iface = g_iface
    (!____ptr).load = load
    (!____ptr).load_async = load_async
    (!____ptr).load_finish = load_finish
    ____ptr
  
  val offsets: Array[Int] =
    val res = Array.ofDim[Int](4)
    def align(offset: Int, alignment: Int) = {
      val alignmentMask = alignment - 1
      val padding =
        if ((offset & alignmentMask) == 0) 0
        else alignment - (offset & alignmentMask)
      offset + padding
    }
    
    res(0) = align(0, alignmentof[_root_.sn.gnome.gobject.internal.GTypeInterface].toInt)
    res(1) = align(res(0) + sizeof[_root_.sn.gnome.gobject.internal.GTypeInterface].toInt, alignmentof[CFuncPtr5[Ptr[GLoadableIcon], CInt, Ptr[CString], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GInputStream]]].toInt)
    res(2) = align(res(1) + sizeof[CFuncPtr5[Ptr[GLoadableIcon], CInt, Ptr[CString], Ptr[GCancellable], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GInputStream]]].toInt, alignmentof[CFuncPtr5[Ptr[GLoadableIcon], CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]].toInt)
    res(3) = align(res(2) + sizeof[CFuncPtr5[Ptr[GLoadableIcon], CInt, Ptr[GCancellable], GAsyncReadyCallback, _root_.sn.gnome.glib.internal.gpointer, Unit]].toInt, alignmentof[CFuncPtr4[Ptr[GLoadableIcon], Ptr[GAsyncResult], Ptr[CString], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Ptr[GInputStream]]].toInt)
    res
  end offsets