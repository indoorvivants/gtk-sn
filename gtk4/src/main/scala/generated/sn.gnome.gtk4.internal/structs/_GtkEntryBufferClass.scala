package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GtkEntryBufferClass = CStruct15[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr4[Ptr[GtkEntryBuffer], _root_.sn.gnome.glib.internal.guint, CString, _root_.sn.gnome.glib.internal.guint, Unit], CFuncPtr3[Ptr[GtkEntryBuffer], _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, Unit], CFuncPtr2[Ptr[GtkEntryBuffer], Ptr[_root_.sn.gnome.glib.internal.gsize], CString], CFuncPtr1[Ptr[GtkEntryBuffer], _root_.sn.gnome.glib.internal.guint], CFuncPtr4[Ptr[GtkEntryBuffer], _root_.sn.gnome.glib.internal.guint, CString, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint], CFuncPtr3[Ptr[GtkEntryBuffer], _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]

object _GtkEntryBufferClass:
  given _tag: Tag[_GtkEntryBufferClass] = Tag.materializeCStruct15Tag[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr4[Ptr[GtkEntryBuffer], _root_.sn.gnome.glib.internal.guint, CString, _root_.sn.gnome.glib.internal.guint, Unit], CFuncPtr3[Ptr[GtkEntryBuffer], _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, Unit], CFuncPtr2[Ptr[GtkEntryBuffer], Ptr[_root_.sn.gnome.glib.internal.gsize], CString], CFuncPtr1[Ptr[GtkEntryBuffer], _root_.sn.gnome.glib.internal.guint], CFuncPtr4[Ptr[GtkEntryBuffer], _root_.sn.gnome.glib.internal.guint, CString, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint], CFuncPtr3[Ptr[GtkEntryBuffer], _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GtkEntryBufferClass)
      inline def parent_class : _root_.sn.gnome.gobject.internal.GObjectClass = struct._1
      inline def parent_class_=(value: _root_.sn.gnome.gobject.internal.GObjectClass): Unit = (!struct.at1 = value)
      inline def inserted_text : CFuncPtr4[Ptr[GtkEntryBuffer], _root_.sn.gnome.glib.internal.guint, CString, _root_.sn.gnome.glib.internal.guint, Unit] = struct._2
      inline def inserted_text_=(value: CFuncPtr4[Ptr[GtkEntryBuffer], _root_.sn.gnome.glib.internal.guint, CString, _root_.sn.gnome.glib.internal.guint, Unit]): Unit = (!struct.at2 = value)
      inline def deleted_text : CFuncPtr3[Ptr[GtkEntryBuffer], _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, Unit] = struct._3
      inline def deleted_text_=(value: CFuncPtr3[Ptr[GtkEntryBuffer], _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, Unit]): Unit = (!struct.at3 = value)
      inline def get_text : CFuncPtr2[Ptr[GtkEntryBuffer], Ptr[_root_.sn.gnome.glib.internal.gsize], CString] = struct._4
      inline def get_text_=(value: CFuncPtr2[Ptr[GtkEntryBuffer], Ptr[_root_.sn.gnome.glib.internal.gsize], CString]): Unit = (!struct.at4 = value)
      inline def get_length : CFuncPtr1[Ptr[GtkEntryBuffer], _root_.sn.gnome.glib.internal.guint] = struct._5
      inline def get_length_=(value: CFuncPtr1[Ptr[GtkEntryBuffer], _root_.sn.gnome.glib.internal.guint]): Unit = (!struct.at5 = value)
      inline def insert_text : CFuncPtr4[Ptr[GtkEntryBuffer], _root_.sn.gnome.glib.internal.guint, CString, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint] = struct._6
      inline def insert_text_=(value: CFuncPtr4[Ptr[GtkEntryBuffer], _root_.sn.gnome.glib.internal.guint, CString, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint]): Unit = (!struct.at6 = value)
      inline def delete_text : CFuncPtr3[Ptr[GtkEntryBuffer], _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint] = struct._7
      inline def delete_text_=(value: CFuncPtr3[Ptr[GtkEntryBuffer], _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint]): Unit = (!struct.at7 = value)
      inline def _gtk_reserved1 : CFuncPtr0[Unit] = struct._8
      inline def _gtk_reserved1_=(value: CFuncPtr0[Unit]): Unit = (!struct.at8 = value)
      inline def _gtk_reserved2 : CFuncPtr0[Unit] = struct._9
      inline def _gtk_reserved2_=(value: CFuncPtr0[Unit]): Unit = (!struct.at9 = value)
      inline def _gtk_reserved3 : CFuncPtr0[Unit] = struct._10
      inline def _gtk_reserved3_=(value: CFuncPtr0[Unit]): Unit = (!struct.at10 = value)
      inline def _gtk_reserved4 : CFuncPtr0[Unit] = struct._11
      inline def _gtk_reserved4_=(value: CFuncPtr0[Unit]): Unit = (!struct.at11 = value)
      inline def _gtk_reserved5 : CFuncPtr0[Unit] = struct._12
      inline def _gtk_reserved5_=(value: CFuncPtr0[Unit]): Unit = (!struct.at12 = value)
      inline def _gtk_reserved6 : CFuncPtr0[Unit] = struct._13
      inline def _gtk_reserved6_=(value: CFuncPtr0[Unit]): Unit = (!struct.at13 = value)
      inline def _gtk_reserved7 : CFuncPtr0[Unit] = struct._14
      inline def _gtk_reserved7_=(value: CFuncPtr0[Unit]): Unit = (!struct.at14 = value)
      inline def _gtk_reserved8 : CFuncPtr0[Unit] = struct._15
      inline def _gtk_reserved8_=(value: CFuncPtr0[Unit]): Unit = (!struct.at15 = value)
    end extension
  
  // Allocates _GtkEntryBufferClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GtkEntryBufferClass] = scala.scalanative.unsafe.alloc[_GtkEntryBufferClass](1)
  def apply(parent_class : _root_.sn.gnome.gobject.internal.GObjectClass, inserted_text : CFuncPtr4[Ptr[GtkEntryBuffer], _root_.sn.gnome.glib.internal.guint, CString, _root_.sn.gnome.glib.internal.guint, Unit], deleted_text : CFuncPtr3[Ptr[GtkEntryBuffer], _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, Unit], get_text : CFuncPtr2[Ptr[GtkEntryBuffer], Ptr[_root_.sn.gnome.glib.internal.gsize], CString], get_length : CFuncPtr1[Ptr[GtkEntryBuffer], _root_.sn.gnome.glib.internal.guint], insert_text : CFuncPtr4[Ptr[GtkEntryBuffer], _root_.sn.gnome.glib.internal.guint, CString, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint], delete_text : CFuncPtr3[Ptr[GtkEntryBuffer], _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint], _gtk_reserved1 : CFuncPtr0[Unit], _gtk_reserved2 : CFuncPtr0[Unit], _gtk_reserved3 : CFuncPtr0[Unit], _gtk_reserved4 : CFuncPtr0[Unit], _gtk_reserved5 : CFuncPtr0[Unit], _gtk_reserved6 : CFuncPtr0[Unit], _gtk_reserved7 : CFuncPtr0[Unit], _gtk_reserved8 : CFuncPtr0[Unit])(using Zone): Ptr[_GtkEntryBufferClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).inserted_text = inserted_text
    (!____ptr).deleted_text = deleted_text
    (!____ptr).get_text = get_text
    (!____ptr).get_length = get_length
    (!____ptr).insert_text = insert_text
    (!____ptr).delete_text = delete_text
    (!____ptr)._gtk_reserved1 = _gtk_reserved1
    (!____ptr)._gtk_reserved2 = _gtk_reserved2
    (!____ptr)._gtk_reserved3 = _gtk_reserved3
    (!____ptr)._gtk_reserved4 = _gtk_reserved4
    (!____ptr)._gtk_reserved5 = _gtk_reserved5
    (!____ptr)._gtk_reserved6 = _gtk_reserved6
    (!____ptr)._gtk_reserved7 = _gtk_reserved7
    (!____ptr)._gtk_reserved8 = _gtk_reserved8
    ____ptr