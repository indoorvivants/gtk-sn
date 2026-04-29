package sn.gnome.pango.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type PangoFontFaceClass = CStruct8[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr1[Ptr[PangoFontFace], CString], CFuncPtr1[Ptr[PangoFontFace], Ptr[PangoFontDescription]], CFuncPtr3[Ptr[PangoFontFace], Ptr[Ptr[CInt]], Ptr[CInt], Unit], CFuncPtr1[Ptr[PangoFontFace], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr1[Ptr[PangoFontFace], Ptr[PangoFontFamily]], CFuncPtr0[Unit], CFuncPtr0[Unit]]

object PangoFontFaceClass:
  given _tag: Tag[PangoFontFaceClass] = Tag.materializeCStruct8Tag[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr1[Ptr[PangoFontFace], CString], CFuncPtr1[Ptr[PangoFontFace], Ptr[PangoFontDescription]], CFuncPtr3[Ptr[PangoFontFace], Ptr[Ptr[CInt]], Ptr[CInt], Unit], CFuncPtr1[Ptr[PangoFontFace], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr1[Ptr[PangoFontFace], Ptr[PangoFontFamily]], CFuncPtr0[Unit], CFuncPtr0[Unit]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: PangoFontFaceClass)
      inline def parent_class : _root_.sn.gnome.gobject.internal.GObjectClass = struct._1
      inline def parent_class_=(value: _root_.sn.gnome.gobject.internal.GObjectClass): Unit = (!struct.at1 = value)
      inline def get_face_name : CFuncPtr1[Ptr[PangoFontFace], CString] = struct._2
      inline def get_face_name_=(value: CFuncPtr1[Ptr[PangoFontFace], CString]): Unit = (!struct.at2 = value)
      inline def describe : CFuncPtr1[Ptr[PangoFontFace], Ptr[PangoFontDescription]] = struct._3
      inline def describe_=(value: CFuncPtr1[Ptr[PangoFontFace], Ptr[PangoFontDescription]]): Unit = (!struct.at3 = value)
      inline def list_sizes : CFuncPtr3[Ptr[PangoFontFace], Ptr[Ptr[CInt]], Ptr[CInt], Unit] = struct._4
      inline def list_sizes_=(value: CFuncPtr3[Ptr[PangoFontFace], Ptr[Ptr[CInt]], Ptr[CInt], Unit]): Unit = (!struct.at4 = value)
      inline def is_synthesized : CFuncPtr1[Ptr[PangoFontFace], _root_.sn.gnome.glib.internal.gboolean] = struct._5
      inline def is_synthesized_=(value: CFuncPtr1[Ptr[PangoFontFace], _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at5 = value)
      inline def get_family : CFuncPtr1[Ptr[PangoFontFace], Ptr[PangoFontFamily]] = struct._6
      inline def get_family_=(value: CFuncPtr1[Ptr[PangoFontFace], Ptr[PangoFontFamily]]): Unit = (!struct.at6 = value)
      inline def _pango_reserved3 : CFuncPtr0[Unit] = struct._7
      inline def _pango_reserved3_=(value: CFuncPtr0[Unit]): Unit = (!struct.at7 = value)
      inline def _pango_reserved4 : CFuncPtr0[Unit] = struct._8
      inline def _pango_reserved4_=(value: CFuncPtr0[Unit]): Unit = (!struct.at8 = value)
    end extension
  
  // Allocates PangoFontFaceClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[PangoFontFaceClass] = scala.scalanative.unsafe.alloc[PangoFontFaceClass](1)
  def apply(parent_class : _root_.sn.gnome.gobject.internal.GObjectClass, get_face_name : CFuncPtr1[Ptr[PangoFontFace], CString], describe : CFuncPtr1[Ptr[PangoFontFace], Ptr[PangoFontDescription]], list_sizes : CFuncPtr3[Ptr[PangoFontFace], Ptr[Ptr[CInt]], Ptr[CInt], Unit], is_synthesized : CFuncPtr1[Ptr[PangoFontFace], _root_.sn.gnome.glib.internal.gboolean], get_family : CFuncPtr1[Ptr[PangoFontFace], Ptr[PangoFontFamily]], _pango_reserved3 : CFuncPtr0[Unit], _pango_reserved4 : CFuncPtr0[Unit])(using Zone): Ptr[PangoFontFaceClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).get_face_name = get_face_name
    (!____ptr).describe = describe
    (!____ptr).list_sizes = list_sizes
    (!____ptr).is_synthesized = is_synthesized
    (!____ptr).get_family = get_family
    (!____ptr)._pango_reserved3 = _pango_reserved3
    (!____ptr)._pango_reserved4 = _pango_reserved4
    ____ptr