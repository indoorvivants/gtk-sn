package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkBuildableParser: _element: function called for open elements _element: function called for close elements
*/
opaque type GtkBuildableParser = CStruct5[CFuncPtr6[Ptr[GtkBuildableParseContext], CString, Ptr[CString], Ptr[CString], _root_.sn.gnome.glib.internal.gpointer, Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Unit], CFuncPtr4[Ptr[GtkBuildableParseContext], CString, _root_.sn.gnome.glib.internal.gpointer, Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Unit], CFuncPtr5[Ptr[GtkBuildableParseContext], CString, _root_.sn.gnome.glib.internal.gsize, _root_.sn.gnome.glib.internal.gpointer, Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Unit], CFuncPtr3[Ptr[GtkBuildableParseContext], Ptr[_root_.sn.gnome.glib.internal.GError], _root_.sn.gnome.glib.internal.gpointer, Unit], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]]

object GtkBuildableParser:
  given _tag: Tag[GtkBuildableParser] = Tag.materializeCStruct5Tag[CFuncPtr6[Ptr[GtkBuildableParseContext], CString, Ptr[CString], Ptr[CString], _root_.sn.gnome.glib.internal.gpointer, Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Unit], CFuncPtr4[Ptr[GtkBuildableParseContext], CString, _root_.sn.gnome.glib.internal.gpointer, Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Unit], CFuncPtr5[Ptr[GtkBuildableParseContext], CString, _root_.sn.gnome.glib.internal.gsize, _root_.sn.gnome.glib.internal.gpointer, Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Unit], CFuncPtr3[Ptr[GtkBuildableParseContext], Ptr[_root_.sn.gnome.glib.internal.GError], _root_.sn.gnome.glib.internal.gpointer, Unit], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GtkBuildableParser)
      inline def start_element : CFuncPtr6[Ptr[GtkBuildableParseContext], CString, Ptr[CString], Ptr[CString], _root_.sn.gnome.glib.internal.gpointer, Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Unit] = struct._1
      inline def start_element_=(value: CFuncPtr6[Ptr[GtkBuildableParseContext], CString, Ptr[CString], Ptr[CString], _root_.sn.gnome.glib.internal.gpointer, Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Unit]): Unit = (!struct.at1 = value)
      inline def end_element : CFuncPtr4[Ptr[GtkBuildableParseContext], CString, _root_.sn.gnome.glib.internal.gpointer, Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Unit] = struct._2
      inline def end_element_=(value: CFuncPtr4[Ptr[GtkBuildableParseContext], CString, _root_.sn.gnome.glib.internal.gpointer, Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Unit]): Unit = (!struct.at2 = value)
      inline def text : CFuncPtr5[Ptr[GtkBuildableParseContext], CString, _root_.sn.gnome.glib.internal.gsize, _root_.sn.gnome.glib.internal.gpointer, Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Unit] = struct._3
      inline def text_=(value: CFuncPtr5[Ptr[GtkBuildableParseContext], CString, _root_.sn.gnome.glib.internal.gsize, _root_.sn.gnome.glib.internal.gpointer, Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Unit]): Unit = (!struct.at3 = value)
      inline def error : CFuncPtr3[Ptr[GtkBuildableParseContext], Ptr[_root_.sn.gnome.glib.internal.GError], _root_.sn.gnome.glib.internal.gpointer, Unit] = struct._4
      inline def error_=(value: CFuncPtr3[Ptr[GtkBuildableParseContext], Ptr[_root_.sn.gnome.glib.internal.GError], _root_.sn.gnome.glib.internal.gpointer, Unit]): Unit = (!struct.at4 = value)
      inline def padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4] = struct._5
      inline def padding_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]): Unit = (!struct.at5 = value)
    end extension
  
  // Allocates GtkBuildableParser on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GtkBuildableParser] = scala.scalanative.unsafe.alloc[GtkBuildableParser](1)
  def apply(start_element : CFuncPtr6[Ptr[GtkBuildableParseContext], CString, Ptr[CString], Ptr[CString], _root_.sn.gnome.glib.internal.gpointer, Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Unit], end_element : CFuncPtr4[Ptr[GtkBuildableParseContext], CString, _root_.sn.gnome.glib.internal.gpointer, Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Unit], text : CFuncPtr5[Ptr[GtkBuildableParseContext], CString, _root_.sn.gnome.glib.internal.gsize, _root_.sn.gnome.glib.internal.gpointer, Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], Unit], error : CFuncPtr3[Ptr[GtkBuildableParseContext], Ptr[_root_.sn.gnome.glib.internal.GError], _root_.sn.gnome.glib.internal.gpointer, Unit], padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4])(using Zone): Ptr[GtkBuildableParser] =
    val ____ptr = apply()
    (!____ptr).start_element = start_element
    (!____ptr).end_element = end_element
    (!____ptr).text = text
    (!____ptr).error = error
    (!____ptr).padding = padding
    ____ptr