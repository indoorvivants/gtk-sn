package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GMountOperationClass = CArray[CChar, Nat.Digit3[Nat._2, Nat._5, Nat._6]]

object GMountOperationClass:
  given _tag: Tag[GMountOperationClass] = Tag.CArray[CChar, Nat.Digit3[Nat._2, Nat._5, Nat._6]](Tag.Byte, Tag.Digit3[Nat._2, Nat._5, Nat._6](Tag.Nat2, Tag.Nat5, Tag.Nat6))
  
  export fields.*
  private[internal] object fields:
    extension (struct: GMountOperationClass)
      inline def parent_class: _root_.sn.gnome.gobject.internal.GObjectClass = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GObjectClass]]
      inline def parent_class_=(value: _root_.sn.gnome.gobject.internal.GObjectClass): Unit = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GObjectClass]] = value
      inline def ask_password: CFuncPtr5[Ptr[GMountOperation], CString, CString, CString, GAskPasswordFlags, Unit] = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr5[Ptr[GMountOperation], CString, CString, CString, GAskPasswordFlags, Unit]]]
      inline def ask_password_=(value: CFuncPtr5[Ptr[GMountOperation], CString, CString, CString, GAskPasswordFlags, Unit]): Unit = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr5[Ptr[GMountOperation], CString, CString, CString, GAskPasswordFlags, Unit]]] = value
      inline def ask_question: CFuncPtr3[Ptr[GMountOperation], CString, Ptr[CString], Unit] = !struct.at(offsets(2)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GMountOperation], CString, Ptr[CString], Unit]]]
      inline def ask_question_=(value: CFuncPtr3[Ptr[GMountOperation], CString, Ptr[CString], Unit]): Unit = !struct.at(offsets(2)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GMountOperation], CString, Ptr[CString], Unit]]] = value
      inline def reply: CFuncPtr2[Ptr[GMountOperation], GMountOperationResult, Unit] = !struct.at(offsets(3)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GMountOperation], GMountOperationResult, Unit]]]
      inline def reply_=(value: CFuncPtr2[Ptr[GMountOperation], GMountOperationResult, Unit]): Unit = !struct.at(offsets(3)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GMountOperation], GMountOperationResult, Unit]]] = value
      inline def aborted: CFuncPtr1[Ptr[GMountOperation], Unit] = !struct.at(offsets(4)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GMountOperation], Unit]]]
      inline def aborted_=(value: CFuncPtr1[Ptr[GMountOperation], Unit]): Unit = !struct.at(offsets(4)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GMountOperation], Unit]]] = value
      inline def show_processes: CFuncPtr4[Ptr[GMountOperation], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GArray], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]], Unit] = !struct.at(offsets(5)).asInstanceOf[Ptr[CFuncPtr4[Ptr[GMountOperation], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GArray], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]], Unit]]]
      inline def show_processes_=(value: CFuncPtr4[Ptr[GMountOperation], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GArray], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]], Unit]): Unit = !struct.at(offsets(5)).asInstanceOf[Ptr[CFuncPtr4[Ptr[GMountOperation], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GArray], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]], Unit]]] = value
      inline def show_unmount_progress: CFuncPtr4[Ptr[GMountOperation], Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.gint64, _root_.sn.gnome.glib.internal.gint64, Unit] = !struct.at(offsets(6)).asInstanceOf[Ptr[CFuncPtr4[Ptr[GMountOperation], Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.gint64, _root_.sn.gnome.glib.internal.gint64, Unit]]]
      inline def show_unmount_progress_=(value: CFuncPtr4[Ptr[GMountOperation], Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.gint64, _root_.sn.gnome.glib.internal.gint64, Unit]): Unit = !struct.at(offsets(6)).asInstanceOf[Ptr[CFuncPtr4[Ptr[GMountOperation], Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.gint64, _root_.sn.gnome.glib.internal.gint64, Unit]]] = value
      inline def _g_reserved1: CFuncPtr0[Unit] = !struct.at(offsets(7)).asInstanceOf[Ptr[CFuncPtr0[Unit]]]
      inline def _g_reserved1_=(value: CFuncPtr0[Unit]): Unit = !struct.at(offsets(7)).asInstanceOf[Ptr[CFuncPtr0[Unit]]] = value
      inline def _g_reserved2: CFuncPtr0[Unit] = !struct.at(offsets(8)).asInstanceOf[Ptr[CFuncPtr0[Unit]]]
      inline def _g_reserved2_=(value: CFuncPtr0[Unit]): Unit = !struct.at(offsets(8)).asInstanceOf[Ptr[CFuncPtr0[Unit]]] = value
      inline def _g_reserved3: CFuncPtr0[Unit] = !struct.at(offsets(9)).asInstanceOf[Ptr[CFuncPtr0[Unit]]]
      inline def _g_reserved3_=(value: CFuncPtr0[Unit]): Unit = !struct.at(offsets(9)).asInstanceOf[Ptr[CFuncPtr0[Unit]]] = value
      inline def _g_reserved4: CFuncPtr0[Unit] = !struct.at(offsets(10)).asInstanceOf[Ptr[CFuncPtr0[Unit]]]
      inline def _g_reserved4_=(value: CFuncPtr0[Unit]): Unit = !struct.at(offsets(10)).asInstanceOf[Ptr[CFuncPtr0[Unit]]] = value
      inline def _g_reserved5: CFuncPtr0[Unit] = !struct.at(offsets(11)).asInstanceOf[Ptr[CFuncPtr0[Unit]]]
      inline def _g_reserved5_=(value: CFuncPtr0[Unit]): Unit = !struct.at(offsets(11)).asInstanceOf[Ptr[CFuncPtr0[Unit]]] = value
      inline def _g_reserved6: CFuncPtr0[Unit] = !struct.at(offsets(12)).asInstanceOf[Ptr[CFuncPtr0[Unit]]]
      inline def _g_reserved6_=(value: CFuncPtr0[Unit]): Unit = !struct.at(offsets(12)).asInstanceOf[Ptr[CFuncPtr0[Unit]]] = value
      inline def _g_reserved7: CFuncPtr0[Unit] = !struct.at(offsets(13)).asInstanceOf[Ptr[CFuncPtr0[Unit]]]
      inline def _g_reserved7_=(value: CFuncPtr0[Unit]): Unit = !struct.at(offsets(13)).asInstanceOf[Ptr[CFuncPtr0[Unit]]] = value
      inline def _g_reserved8: CFuncPtr0[Unit] = !struct.at(offsets(14)).asInstanceOf[Ptr[CFuncPtr0[Unit]]]
      inline def _g_reserved8_=(value: CFuncPtr0[Unit]): Unit = !struct.at(offsets(14)).asInstanceOf[Ptr[CFuncPtr0[Unit]]] = value
      inline def _g_reserved9: CFuncPtr0[Unit] = !struct.at(offsets(15)).asInstanceOf[Ptr[CFuncPtr0[Unit]]]
      inline def _g_reserved9_=(value: CFuncPtr0[Unit]): Unit = !struct.at(offsets(15)).asInstanceOf[Ptr[CFuncPtr0[Unit]]] = value
    end extension
  
  // Allocates GMountOperationClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GMountOperationClass] = scala.scalanative.unsafe.alloc[GMountOperationClass](1)
  def apply(parent_class : _root_.sn.gnome.gobject.internal.GObjectClass, ask_password : CFuncPtr5[Ptr[GMountOperation], CString, CString, CString, GAskPasswordFlags, Unit], ask_question : CFuncPtr3[Ptr[GMountOperation], CString, Ptr[CString], Unit], reply : CFuncPtr2[Ptr[GMountOperation], GMountOperationResult, Unit], aborted : CFuncPtr1[Ptr[GMountOperation], Unit], show_processes : CFuncPtr4[Ptr[GMountOperation], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GArray], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]], Unit], show_unmount_progress : CFuncPtr4[Ptr[GMountOperation], Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.gint64, _root_.sn.gnome.glib.internal.gint64, Unit], _g_reserved1 : CFuncPtr0[Unit], _g_reserved2 : CFuncPtr0[Unit], _g_reserved3 : CFuncPtr0[Unit], _g_reserved4 : CFuncPtr0[Unit], _g_reserved5 : CFuncPtr0[Unit], _g_reserved6 : CFuncPtr0[Unit], _g_reserved7 : CFuncPtr0[Unit], _g_reserved8 : CFuncPtr0[Unit], _g_reserved9 : CFuncPtr0[Unit])(using Zone): Ptr[GMountOperationClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).ask_password = ask_password
    (!____ptr).ask_question = ask_question
    (!____ptr).reply = reply
    (!____ptr).aborted = aborted
    (!____ptr).show_processes = show_processes
    (!____ptr).show_unmount_progress = show_unmount_progress
    (!____ptr)._g_reserved1 = _g_reserved1
    (!____ptr)._g_reserved2 = _g_reserved2
    (!____ptr)._g_reserved3 = _g_reserved3
    (!____ptr)._g_reserved4 = _g_reserved4
    (!____ptr)._g_reserved5 = _g_reserved5
    (!____ptr)._g_reserved6 = _g_reserved6
    (!____ptr)._g_reserved7 = _g_reserved7
    (!____ptr)._g_reserved8 = _g_reserved8
    (!____ptr)._g_reserved9 = _g_reserved9
    ____ptr
  
  val offsets: Array[Int] =
    val res = Array.ofDim[Int](16)
    def align(offset: Int, alignment: Int) = {
      val alignmentMask = alignment - 1
      val padding =
        if ((offset & alignmentMask) == 0) 0
        else alignment - (offset & alignmentMask)
      offset + padding
    }
    
    res(0) = align(0, alignmentof[_root_.sn.gnome.gobject.internal.GObjectClass].toInt)
    res(1) = align(res(0) + sizeof[_root_.sn.gnome.gobject.internal.GObjectClass].toInt, alignmentof[CFuncPtr5[Ptr[GMountOperation], CString, CString, CString, GAskPasswordFlags, Unit]].toInt)
    res(2) = align(res(1) + sizeof[CFuncPtr5[Ptr[GMountOperation], CString, CString, CString, GAskPasswordFlags, Unit]].toInt, alignmentof[CFuncPtr3[Ptr[GMountOperation], CString, Ptr[CString], Unit]].toInt)
    res(3) = align(res(2) + sizeof[CFuncPtr3[Ptr[GMountOperation], CString, Ptr[CString], Unit]].toInt, alignmentof[CFuncPtr2[Ptr[GMountOperation], GMountOperationResult, Unit]].toInt)
    res(4) = align(res(3) + sizeof[CFuncPtr2[Ptr[GMountOperation], GMountOperationResult, Unit]].toInt, alignmentof[CFuncPtr1[Ptr[GMountOperation], Unit]].toInt)
    res(5) = align(res(4) + sizeof[CFuncPtr1[Ptr[GMountOperation], Unit]].toInt, alignmentof[CFuncPtr4[Ptr[GMountOperation], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GArray], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]], Unit]].toInt)
    res(6) = align(res(5) + sizeof[CFuncPtr4[Ptr[GMountOperation], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GArray], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]], Unit]].toInt, alignmentof[CFuncPtr4[Ptr[GMountOperation], Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.gint64, _root_.sn.gnome.glib.internal.gint64, Unit]].toInt)
    res(7) = align(res(6) + sizeof[CFuncPtr4[Ptr[GMountOperation], Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.gint64, _root_.sn.gnome.glib.internal.gint64, Unit]].toInt, alignmentof[CFuncPtr0[Unit]].toInt)
    res(8) = align(res(7) + sizeof[CFuncPtr0[Unit]].toInt, alignmentof[CFuncPtr0[Unit]].toInt)
    res(9) = align(res(8) + sizeof[CFuncPtr0[Unit]].toInt, alignmentof[CFuncPtr0[Unit]].toInt)
    res(10) = align(res(9) + sizeof[CFuncPtr0[Unit]].toInt, alignmentof[CFuncPtr0[Unit]].toInt)
    res(11) = align(res(10) + sizeof[CFuncPtr0[Unit]].toInt, alignmentof[CFuncPtr0[Unit]].toInt)
    res(12) = align(res(11) + sizeof[CFuncPtr0[Unit]].toInt, alignmentof[CFuncPtr0[Unit]].toInt)
    res(13) = align(res(12) + sizeof[CFuncPtr0[Unit]].toInt, alignmentof[CFuncPtr0[Unit]].toInt)
    res(14) = align(res(13) + sizeof[CFuncPtr0[Unit]].toInt, alignmentof[CFuncPtr0[Unit]].toInt)
    res(15) = align(res(14) + sizeof[CFuncPtr0[Unit]].toInt, alignmentof[CFuncPtr0[Unit]].toInt)
    res
  end offsets