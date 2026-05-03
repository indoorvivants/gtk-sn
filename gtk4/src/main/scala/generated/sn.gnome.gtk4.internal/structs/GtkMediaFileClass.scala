package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkMediaFileClass = CStruct7[GtkMediaStreamClass, CFuncPtr1[Ptr[GtkMediaFile], Unit], CFuncPtr1[Ptr[GtkMediaFile], Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]

object GtkMediaFileClass:
  given _tag: Tag[GtkMediaFileClass] = Tag.materializeCStruct7Tag[GtkMediaStreamClass, CFuncPtr1[Ptr[GtkMediaFile], Unit], CFuncPtr1[Ptr[GtkMediaFile], Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GtkMediaFileClass)
      inline def parent_class : GtkMediaStreamClass = struct._1
      inline def parent_class_=(value: GtkMediaStreamClass): Unit = (!struct.at1 = value)
      inline def open : CFuncPtr1[Ptr[GtkMediaFile], Unit] = struct._2
      inline def open_=(value: CFuncPtr1[Ptr[GtkMediaFile], Unit]): Unit = (!struct.at2 = value)
      inline def close : CFuncPtr1[Ptr[GtkMediaFile], Unit] = struct._3
      inline def close_=(value: CFuncPtr1[Ptr[GtkMediaFile], Unit]): Unit = (!struct.at3 = value)
      inline def _gtk_reserved1 : CFuncPtr0[Unit] = struct._4
      inline def _gtk_reserved1_=(value: CFuncPtr0[Unit]): Unit = (!struct.at4 = value)
      inline def _gtk_reserved2 : CFuncPtr0[Unit] = struct._5
      inline def _gtk_reserved2_=(value: CFuncPtr0[Unit]): Unit = (!struct.at5 = value)
      inline def _gtk_reserved3 : CFuncPtr0[Unit] = struct._6
      inline def _gtk_reserved3_=(value: CFuncPtr0[Unit]): Unit = (!struct.at6 = value)
      inline def _gtk_reserved4 : CFuncPtr0[Unit] = struct._7
      inline def _gtk_reserved4_=(value: CFuncPtr0[Unit]): Unit = (!struct.at7 = value)
    end extension
  
  // Allocates GtkMediaFileClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GtkMediaFileClass] = scala.scalanative.unsafe.alloc[GtkMediaFileClass](1)
  def apply(parent_class : GtkMediaStreamClass, open : CFuncPtr1[Ptr[GtkMediaFile], Unit], close : CFuncPtr1[Ptr[GtkMediaFile], Unit], _gtk_reserved1 : CFuncPtr0[Unit], _gtk_reserved2 : CFuncPtr0[Unit], _gtk_reserved3 : CFuncPtr0[Unit], _gtk_reserved4 : CFuncPtr0[Unit])(using Zone): Ptr[GtkMediaFileClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).open = open
    (!____ptr).close = close
    (!____ptr)._gtk_reserved1 = _gtk_reserved1
    (!____ptr)._gtk_reserved2 = _gtk_reserved2
    (!____ptr)._gtk_reserved3 = _gtk_reserved3
    (!____ptr)._gtk_reserved4 = _gtk_reserved4
    ____ptr