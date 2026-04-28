package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkIMMulticontextClass = CStruct5[GtkIMContextClass, CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]

object GtkIMMulticontextClass:
  given _tag: Tag[GtkIMMulticontextClass] = Tag.materializeCStruct5Tag[GtkIMContextClass, CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GtkIMMulticontextClass)
      inline def parent_class : GtkIMContextClass = struct._1
      inline def parent_class_=(value: GtkIMContextClass): Unit = (!struct.at1 = value)
      inline def _gtk_reserved1 : CFuncPtr0[Unit] = struct._2
      inline def _gtk_reserved1_=(value: CFuncPtr0[Unit]): Unit = (!struct.at2 = value)
      inline def _gtk_reserved2 : CFuncPtr0[Unit] = struct._3
      inline def _gtk_reserved2_=(value: CFuncPtr0[Unit]): Unit = (!struct.at3 = value)
      inline def _gtk_reserved3 : CFuncPtr0[Unit] = struct._4
      inline def _gtk_reserved3_=(value: CFuncPtr0[Unit]): Unit = (!struct.at4 = value)
      inline def _gtk_reserved4 : CFuncPtr0[Unit] = struct._5
      inline def _gtk_reserved4_=(value: CFuncPtr0[Unit]): Unit = (!struct.at5 = value)
    end extension
  
  // Allocates GtkIMMulticontextClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GtkIMMulticontextClass] = scala.scalanative.unsafe.alloc[GtkIMMulticontextClass](1)
  def apply(parent_class : GtkIMContextClass, _gtk_reserved1 : CFuncPtr0[Unit], _gtk_reserved2 : CFuncPtr0[Unit], _gtk_reserved3 : CFuncPtr0[Unit], _gtk_reserved4 : CFuncPtr0[Unit])(using Zone): Ptr[GtkIMMulticontextClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr)._gtk_reserved1 = _gtk_reserved1
    (!____ptr)._gtk_reserved2 = _gtk_reserved2
    (!____ptr)._gtk_reserved3 = _gtk_reserved3
    (!____ptr)._gtk_reserved4 = _gtk_reserved4
    ____ptr