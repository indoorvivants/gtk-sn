package sn.gnome.pango.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * PangoAttrShape: : the common portion of the attribute
*/
opaque type _PangoAttrShape = CStruct6[PangoAttribute, PangoRectangle, PangoRectangle, _root_.sn.gnome.glib.internal.gpointer, PangoAttrDataCopyFunc, _root_.sn.gnome.glib.internal.GDestroyNotify]

object _PangoAttrShape:
  given _tag: Tag[_PangoAttrShape] = Tag.materializeCStruct6Tag[PangoAttribute, PangoRectangle, PangoRectangle, _root_.sn.gnome.glib.internal.gpointer, PangoAttrDataCopyFunc, _root_.sn.gnome.glib.internal.GDestroyNotify]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _PangoAttrShape)
      inline def attr : PangoAttribute = struct._1
      inline def attr_=(value: PangoAttribute): Unit = (!struct.at1 = value)
      inline def ink_rect : PangoRectangle = struct._2
      inline def ink_rect_=(value: PangoRectangle): Unit = (!struct.at2 = value)
      inline def logical_rect : PangoRectangle = struct._3
      inline def logical_rect_=(value: PangoRectangle): Unit = (!struct.at3 = value)
      inline def data : _root_.sn.gnome.glib.internal.gpointer = struct._4
      inline def data_=(value: _root_.sn.gnome.glib.internal.gpointer): Unit = (!struct.at4 = value)
      inline def copy_func : PangoAttrDataCopyFunc = struct._5
      inline def copy_func_=(value: PangoAttrDataCopyFunc): Unit = (!struct.at5 = value)
      inline def destroy_func : _root_.sn.gnome.glib.internal.GDestroyNotify = struct._6
      inline def destroy_func_=(value: _root_.sn.gnome.glib.internal.GDestroyNotify): Unit = (!struct.at6 = value)
    end extension
  
  // Allocates _PangoAttrShape on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_PangoAttrShape] = scala.scalanative.unsafe.alloc[_PangoAttrShape](1)
  def apply(attr : PangoAttribute, ink_rect : PangoRectangle, logical_rect : PangoRectangle, data : _root_.sn.gnome.glib.internal.gpointer, copy_func : PangoAttrDataCopyFunc, destroy_func : _root_.sn.gnome.glib.internal.GDestroyNotify)(using Zone): Ptr[_PangoAttrShape] =
    val ____ptr = apply()
    (!____ptr).attr = attr
    (!____ptr).ink_rect = ink_rect
    (!____ptr).logical_rect = logical_rect
    (!____ptr).data = data
    (!____ptr).copy_func = copy_func
    (!____ptr).destroy_func = destroy_func
    ____ptr