package sn.gnome.pango.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _PangoFontFamilyClass = CStruct7[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr3[Ptr[PangoFontFamily], Ptr[Ptr[Ptr[PangoFontFace]]], Ptr[CInt], Unit], CFuncPtr1[Ptr[PangoFontFamily], CString], CFuncPtr1[Ptr[PangoFontFamily], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr1[Ptr[PangoFontFamily], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr2[Ptr[PangoFontFamily], CString, Ptr[PangoFontFace]], CFuncPtr0[Unit]]

object _PangoFontFamilyClass:
  given _tag: Tag[_PangoFontFamilyClass] = Tag.materializeCStruct7Tag[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr3[Ptr[PangoFontFamily], Ptr[Ptr[Ptr[PangoFontFace]]], Ptr[CInt], Unit], CFuncPtr1[Ptr[PangoFontFamily], CString], CFuncPtr1[Ptr[PangoFontFamily], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr1[Ptr[PangoFontFamily], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr2[Ptr[PangoFontFamily], CString, Ptr[PangoFontFace]], CFuncPtr0[Unit]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _PangoFontFamilyClass)
      inline def parent_class : _root_.sn.gnome.gobject.internal.GObjectClass = struct._1
      inline def parent_class_=(value: _root_.sn.gnome.gobject.internal.GObjectClass): Unit = (!struct.at1 = value)
      inline def list_faces : CFuncPtr3[Ptr[PangoFontFamily], Ptr[Ptr[Ptr[PangoFontFace]]], Ptr[CInt], Unit] = struct._2
      inline def list_faces_=(value: CFuncPtr3[Ptr[PangoFontFamily], Ptr[Ptr[Ptr[PangoFontFace]]], Ptr[CInt], Unit]): Unit = (!struct.at2 = value)
      inline def get_name : CFuncPtr1[Ptr[PangoFontFamily], CString] = struct._3
      inline def get_name_=(value: CFuncPtr1[Ptr[PangoFontFamily], CString]): Unit = (!struct.at3 = value)
      inline def is_monospace : CFuncPtr1[Ptr[PangoFontFamily], _root_.sn.gnome.glib.internal.gboolean] = struct._4
      inline def is_monospace_=(value: CFuncPtr1[Ptr[PangoFontFamily], _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at4 = value)
      inline def is_variable : CFuncPtr1[Ptr[PangoFontFamily], _root_.sn.gnome.glib.internal.gboolean] = struct._5
      inline def is_variable_=(value: CFuncPtr1[Ptr[PangoFontFamily], _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at5 = value)
      inline def get_face : CFuncPtr2[Ptr[PangoFontFamily], CString, Ptr[PangoFontFace]] = struct._6
      inline def get_face_=(value: CFuncPtr2[Ptr[PangoFontFamily], CString, Ptr[PangoFontFace]]): Unit = (!struct.at6 = value)
      inline def _pango_reserved2 : CFuncPtr0[Unit] = struct._7
      inline def _pango_reserved2_=(value: CFuncPtr0[Unit]): Unit = (!struct.at7 = value)
    end extension
  
  // Allocates _PangoFontFamilyClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_PangoFontFamilyClass] = scala.scalanative.unsafe.alloc[_PangoFontFamilyClass](1)
  def apply(parent_class : _root_.sn.gnome.gobject.internal.GObjectClass, list_faces : CFuncPtr3[Ptr[PangoFontFamily], Ptr[Ptr[Ptr[PangoFontFace]]], Ptr[CInt], Unit], get_name : CFuncPtr1[Ptr[PangoFontFamily], CString], is_monospace : CFuncPtr1[Ptr[PangoFontFamily], _root_.sn.gnome.glib.internal.gboolean], is_variable : CFuncPtr1[Ptr[PangoFontFamily], _root_.sn.gnome.glib.internal.gboolean], get_face : CFuncPtr2[Ptr[PangoFontFamily], CString, Ptr[PangoFontFace]], _pango_reserved2 : CFuncPtr0[Unit])(using Zone): Ptr[_PangoFontFamilyClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).list_faces = list_faces
    (!____ptr).get_name = get_name
    (!____ptr).is_monospace = is_monospace
    (!____ptr).is_variable = is_variable
    (!____ptr).get_face = get_face
    (!____ptr)._pango_reserved2 = _pango_reserved2
    ____ptr