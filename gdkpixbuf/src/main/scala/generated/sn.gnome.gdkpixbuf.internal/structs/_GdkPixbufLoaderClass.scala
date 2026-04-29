package sn.gnome.gdkpixbuf.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GdkPixbufLoaderClass = CStruct5[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr3[Ptr[GdkPixbufLoader], CInt, CInt, Unit], CFuncPtr1[Ptr[GdkPixbufLoader], Unit], CFuncPtr5[Ptr[GdkPixbufLoader], CInt, CInt, CInt, CInt, Unit], CFuncPtr1[Ptr[GdkPixbufLoader], Unit]]

object _GdkPixbufLoaderClass:
  given _tag: Tag[_GdkPixbufLoaderClass] = Tag.materializeCStruct5Tag[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr3[Ptr[GdkPixbufLoader], CInt, CInt, Unit], CFuncPtr1[Ptr[GdkPixbufLoader], Unit], CFuncPtr5[Ptr[GdkPixbufLoader], CInt, CInt, CInt, CInt, Unit], CFuncPtr1[Ptr[GdkPixbufLoader], Unit]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GdkPixbufLoaderClass)
      inline def parent_class : _root_.sn.gnome.gobject.internal.GObjectClass = struct._1
      inline def parent_class_=(value: _root_.sn.gnome.gobject.internal.GObjectClass): Unit = (!struct.at1 = value)
      inline def size_prepared : CFuncPtr3[Ptr[GdkPixbufLoader], CInt, CInt, Unit] = struct._2
      inline def size_prepared_=(value: CFuncPtr3[Ptr[GdkPixbufLoader], CInt, CInt, Unit]): Unit = (!struct.at2 = value)
      inline def area_prepared : CFuncPtr1[Ptr[GdkPixbufLoader], Unit] = struct._3
      inline def area_prepared_=(value: CFuncPtr1[Ptr[GdkPixbufLoader], Unit]): Unit = (!struct.at3 = value)
      inline def area_updated : CFuncPtr5[Ptr[GdkPixbufLoader], CInt, CInt, CInt, CInt, Unit] = struct._4
      inline def area_updated_=(value: CFuncPtr5[Ptr[GdkPixbufLoader], CInt, CInt, CInt, CInt, Unit]): Unit = (!struct.at4 = value)
      inline def closed : CFuncPtr1[Ptr[GdkPixbufLoader], Unit] = struct._5
      inline def closed_=(value: CFuncPtr1[Ptr[GdkPixbufLoader], Unit]): Unit = (!struct.at5 = value)
    end extension
  
  // Allocates _GdkPixbufLoaderClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GdkPixbufLoaderClass] = scala.scalanative.unsafe.alloc[_GdkPixbufLoaderClass](1)
  def apply(parent_class : _root_.sn.gnome.gobject.internal.GObjectClass, size_prepared : CFuncPtr3[Ptr[GdkPixbufLoader], CInt, CInt, Unit], area_prepared : CFuncPtr1[Ptr[GdkPixbufLoader], Unit], area_updated : CFuncPtr5[Ptr[GdkPixbufLoader], CInt, CInt, CInt, CInt, Unit], closed : CFuncPtr1[Ptr[GdkPixbufLoader], Unit])(using Zone): Ptr[_GdkPixbufLoaderClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).size_prepared = size_prepared
    (!____ptr).area_prepared = area_prepared
    (!____ptr).area_updated = area_updated
    (!____ptr).closed = closed
    ____ptr