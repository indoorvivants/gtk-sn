package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GAppLaunchContextClass = CArray[CChar, Nat.Digit3[Nat._2, Nat._0, Nat._0]]

object GAppLaunchContextClass:
  given _tag: Tag[GAppLaunchContextClass] = Tag.CArray[CChar, Nat.Digit3[Nat._2, Nat._0, Nat._0]](Tag.Byte, Tag.Digit3[Nat._2, Nat._0, Nat._0](Tag.Nat2, Tag.Nat0, Tag.Nat0))
  
  export fields.*
  private[internal] object fields:
    extension (struct: GAppLaunchContextClass)
      inline def parent_class: _root_.sn.gnome.gobject.internal.GObjectClass = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GObjectClass]]
      inline def parent_class_=(value: _root_.sn.gnome.gobject.internal.GObjectClass): Unit = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GObjectClass]] = value
      inline def get_display: CFuncPtr3[Ptr[GAppLaunchContext], Ptr[GAppInfo], Ptr[_root_.sn.gnome.glib.internal.GList], CString] = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GAppLaunchContext], Ptr[GAppInfo], Ptr[_root_.sn.gnome.glib.internal.GList], CString]]]
      inline def get_display_=(value: CFuncPtr3[Ptr[GAppLaunchContext], Ptr[GAppInfo], Ptr[_root_.sn.gnome.glib.internal.GList], CString]): Unit = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GAppLaunchContext], Ptr[GAppInfo], Ptr[_root_.sn.gnome.glib.internal.GList], CString]]] = value
      inline def get_startup_notify_id: CFuncPtr3[Ptr[GAppLaunchContext], Ptr[GAppInfo], Ptr[_root_.sn.gnome.glib.internal.GList], CString] = !struct.at(offsets(2)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GAppLaunchContext], Ptr[GAppInfo], Ptr[_root_.sn.gnome.glib.internal.GList], CString]]]
      inline def get_startup_notify_id_=(value: CFuncPtr3[Ptr[GAppLaunchContext], Ptr[GAppInfo], Ptr[_root_.sn.gnome.glib.internal.GList], CString]): Unit = !struct.at(offsets(2)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GAppLaunchContext], Ptr[GAppInfo], Ptr[_root_.sn.gnome.glib.internal.GList], CString]]] = value
      inline def launch_failed: CFuncPtr2[Ptr[GAppLaunchContext], CString, Unit] = !struct.at(offsets(3)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GAppLaunchContext], CString, Unit]]]
      inline def launch_failed_=(value: CFuncPtr2[Ptr[GAppLaunchContext], CString, Unit]): Unit = !struct.at(offsets(3)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GAppLaunchContext], CString, Unit]]] = value
      inline def launched: CFuncPtr3[Ptr[GAppLaunchContext], Ptr[GAppInfo], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit] = !struct.at(offsets(4)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GAppLaunchContext], Ptr[GAppInfo], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit]]]
      inline def launched_=(value: CFuncPtr3[Ptr[GAppLaunchContext], Ptr[GAppInfo], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit]): Unit = !struct.at(offsets(4)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GAppLaunchContext], Ptr[GAppInfo], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit]]] = value
      inline def launch_started: CFuncPtr3[Ptr[GAppLaunchContext], Ptr[GAppInfo], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit] = !struct.at(offsets(5)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GAppLaunchContext], Ptr[GAppInfo], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit]]]
      inline def launch_started_=(value: CFuncPtr3[Ptr[GAppLaunchContext], Ptr[GAppInfo], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit]): Unit = !struct.at(offsets(5)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GAppLaunchContext], Ptr[GAppInfo], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit]]] = value
      inline def _g_reserved1: CFuncPtr0[Unit] = !struct.at(offsets(6)).asInstanceOf[Ptr[CFuncPtr0[Unit]]]
      inline def _g_reserved1_=(value: CFuncPtr0[Unit]): Unit = !struct.at(offsets(6)).asInstanceOf[Ptr[CFuncPtr0[Unit]]] = value
      inline def _g_reserved2: CFuncPtr0[Unit] = !struct.at(offsets(7)).asInstanceOf[Ptr[CFuncPtr0[Unit]]]
      inline def _g_reserved2_=(value: CFuncPtr0[Unit]): Unit = !struct.at(offsets(7)).asInstanceOf[Ptr[CFuncPtr0[Unit]]] = value
      inline def _g_reserved3: CFuncPtr0[Unit] = !struct.at(offsets(8)).asInstanceOf[Ptr[CFuncPtr0[Unit]]]
      inline def _g_reserved3_=(value: CFuncPtr0[Unit]): Unit = !struct.at(offsets(8)).asInstanceOf[Ptr[CFuncPtr0[Unit]]] = value
    end extension
  
  // Allocates GAppLaunchContextClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GAppLaunchContextClass] = scala.scalanative.unsafe.alloc[GAppLaunchContextClass](1)
  def apply(parent_class : _root_.sn.gnome.gobject.internal.GObjectClass, get_display : CFuncPtr3[Ptr[GAppLaunchContext], Ptr[GAppInfo], Ptr[_root_.sn.gnome.glib.internal.GList], CString], get_startup_notify_id : CFuncPtr3[Ptr[GAppLaunchContext], Ptr[GAppInfo], Ptr[_root_.sn.gnome.glib.internal.GList], CString], launch_failed : CFuncPtr2[Ptr[GAppLaunchContext], CString, Unit], launched : CFuncPtr3[Ptr[GAppLaunchContext], Ptr[GAppInfo], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit], launch_started : CFuncPtr3[Ptr[GAppLaunchContext], Ptr[GAppInfo], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit], _g_reserved1 : CFuncPtr0[Unit], _g_reserved2 : CFuncPtr0[Unit], _g_reserved3 : CFuncPtr0[Unit])(using Zone): Ptr[GAppLaunchContextClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).get_display = get_display
    (!____ptr).get_startup_notify_id = get_startup_notify_id
    (!____ptr).launch_failed = launch_failed
    (!____ptr).launched = launched
    (!____ptr).launch_started = launch_started
    (!____ptr)._g_reserved1 = _g_reserved1
    (!____ptr)._g_reserved2 = _g_reserved2
    (!____ptr)._g_reserved3 = _g_reserved3
    ____ptr
  
  val offsets: Array[Int] =
    val res = Array.ofDim[Int](9)
    def align(offset: Int, alignment: Int) = {
      val alignmentMask = alignment - 1
      val padding =
        if ((offset & alignmentMask) == 0) 0
        else alignment - (offset & alignmentMask)
      offset + padding
    }
    
    res(0) = align(0, alignmentof[_root_.sn.gnome.gobject.internal.GObjectClass].toInt)
    res(1) = align(res(0) + sizeof[_root_.sn.gnome.gobject.internal.GObjectClass].toInt, alignmentof[CFuncPtr3[Ptr[GAppLaunchContext], Ptr[GAppInfo], Ptr[_root_.sn.gnome.glib.internal.GList], CString]].toInt)
    res(2) = align(res(1) + sizeof[CFuncPtr3[Ptr[GAppLaunchContext], Ptr[GAppInfo], Ptr[_root_.sn.gnome.glib.internal.GList], CString]].toInt, alignmentof[CFuncPtr3[Ptr[GAppLaunchContext], Ptr[GAppInfo], Ptr[_root_.sn.gnome.glib.internal.GList], CString]].toInt)
    res(3) = align(res(2) + sizeof[CFuncPtr3[Ptr[GAppLaunchContext], Ptr[GAppInfo], Ptr[_root_.sn.gnome.glib.internal.GList], CString]].toInt, alignmentof[CFuncPtr2[Ptr[GAppLaunchContext], CString, Unit]].toInt)
    res(4) = align(res(3) + sizeof[CFuncPtr2[Ptr[GAppLaunchContext], CString, Unit]].toInt, alignmentof[CFuncPtr3[Ptr[GAppLaunchContext], Ptr[GAppInfo], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit]].toInt)
    res(5) = align(res(4) + sizeof[CFuncPtr3[Ptr[GAppLaunchContext], Ptr[GAppInfo], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit]].toInt, alignmentof[CFuncPtr3[Ptr[GAppLaunchContext], Ptr[GAppInfo], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit]].toInt)
    res(6) = align(res(5) + sizeof[CFuncPtr3[Ptr[GAppLaunchContext], Ptr[GAppInfo], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit]].toInt, alignmentof[CFuncPtr0[Unit]].toInt)
    res(7) = align(res(6) + sizeof[CFuncPtr0[Unit]].toInt, alignmentof[CFuncPtr0[Unit]].toInt)
    res(8) = align(res(7) + sizeof[CFuncPtr0[Unit]].toInt, alignmentof[CFuncPtr0[Unit]].toInt)
    res
  end offsets