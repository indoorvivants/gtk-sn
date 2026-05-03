package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GMarkupParser: _element: Callback to invoke when the opening tag of an element is seen. The callback's _names and _values parameters are %NULL-terminated. _element: Callback to invoke when the closing tag of an element is seen. Note that this is also called for empty tags like `<empty/>`.
*/
opaque type _GMarkupParser = CStruct5[CFuncPtr6[Ptr[GMarkupParseContext], Ptr[gchar], Ptr[Ptr[gchar]], Ptr[Ptr[gchar]], gpointer, Ptr[Ptr[GError]], Unit], CFuncPtr4[Ptr[GMarkupParseContext], Ptr[gchar], gpointer, Ptr[Ptr[GError]], Unit], CFuncPtr5[Ptr[GMarkupParseContext], Ptr[gchar], gsize, gpointer, Ptr[Ptr[GError]], Unit], CFuncPtr5[Ptr[GMarkupParseContext], Ptr[gchar], gsize, gpointer, Ptr[Ptr[GError]], Unit], CFuncPtr3[Ptr[GMarkupParseContext], Ptr[GError], gpointer, Unit]]

object _GMarkupParser:
  given _tag: Tag[_GMarkupParser] = Tag.materializeCStruct5Tag[CFuncPtr6[Ptr[GMarkupParseContext], Ptr[gchar], Ptr[Ptr[gchar]], Ptr[Ptr[gchar]], gpointer, Ptr[Ptr[GError]], Unit], CFuncPtr4[Ptr[GMarkupParseContext], Ptr[gchar], gpointer, Ptr[Ptr[GError]], Unit], CFuncPtr5[Ptr[GMarkupParseContext], Ptr[gchar], gsize, gpointer, Ptr[Ptr[GError]], Unit], CFuncPtr5[Ptr[GMarkupParseContext], Ptr[gchar], gsize, gpointer, Ptr[Ptr[GError]], Unit], CFuncPtr3[Ptr[GMarkupParseContext], Ptr[GError], gpointer, Unit]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GMarkupParser)
      inline def start_element : CFuncPtr6[Ptr[GMarkupParseContext], Ptr[gchar], Ptr[Ptr[gchar]], Ptr[Ptr[gchar]], gpointer, Ptr[Ptr[GError]], Unit] = struct._1
      inline def start_element_=(value: CFuncPtr6[Ptr[GMarkupParseContext], Ptr[gchar], Ptr[Ptr[gchar]], Ptr[Ptr[gchar]], gpointer, Ptr[Ptr[GError]], Unit]): Unit = (!struct.at1 = value)
      inline def end_element : CFuncPtr4[Ptr[GMarkupParseContext], Ptr[gchar], gpointer, Ptr[Ptr[GError]], Unit] = struct._2
      inline def end_element_=(value: CFuncPtr4[Ptr[GMarkupParseContext], Ptr[gchar], gpointer, Ptr[Ptr[GError]], Unit]): Unit = (!struct.at2 = value)
      inline def text : CFuncPtr5[Ptr[GMarkupParseContext], Ptr[gchar], gsize, gpointer, Ptr[Ptr[GError]], Unit] = struct._3
      inline def text_=(value: CFuncPtr5[Ptr[GMarkupParseContext], Ptr[gchar], gsize, gpointer, Ptr[Ptr[GError]], Unit]): Unit = (!struct.at3 = value)
      inline def passthrough : CFuncPtr5[Ptr[GMarkupParseContext], Ptr[gchar], gsize, gpointer, Ptr[Ptr[GError]], Unit] = struct._4
      inline def passthrough_=(value: CFuncPtr5[Ptr[GMarkupParseContext], Ptr[gchar], gsize, gpointer, Ptr[Ptr[GError]], Unit]): Unit = (!struct.at4 = value)
      inline def error : CFuncPtr3[Ptr[GMarkupParseContext], Ptr[GError], gpointer, Unit] = struct._5
      inline def error_=(value: CFuncPtr3[Ptr[GMarkupParseContext], Ptr[GError], gpointer, Unit]): Unit = (!struct.at5 = value)
    end extension
  
  // Allocates _GMarkupParser on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GMarkupParser] = scala.scalanative.unsafe.alloc[_GMarkupParser](1)
  def apply(start_element : CFuncPtr6[Ptr[GMarkupParseContext], Ptr[gchar], Ptr[Ptr[gchar]], Ptr[Ptr[gchar]], gpointer, Ptr[Ptr[GError]], Unit], end_element : CFuncPtr4[Ptr[GMarkupParseContext], Ptr[gchar], gpointer, Ptr[Ptr[GError]], Unit], text : CFuncPtr5[Ptr[GMarkupParseContext], Ptr[gchar], gsize, gpointer, Ptr[Ptr[GError]], Unit], passthrough : CFuncPtr5[Ptr[GMarkupParseContext], Ptr[gchar], gsize, gpointer, Ptr[Ptr[GError]], Unit], error : CFuncPtr3[Ptr[GMarkupParseContext], Ptr[GError], gpointer, Unit])(using Zone): Ptr[_GMarkupParser] =
    val ____ptr = apply()
    (!____ptr).start_element = start_element
    (!____ptr).end_element = end_element
    (!____ptr).text = text
    (!____ptr).passthrough = passthrough
    (!____ptr).error = error
    ____ptr