package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GtkIMContextSimple = CStruct2[GtkIMContext, Ptr[GtkIMContextSimplePrivate]]

object _GtkIMContextSimple:
  given _tag: Tag[_GtkIMContextSimple] = Tag.materializeCStruct2Tag[GtkIMContext, Ptr[GtkIMContextSimplePrivate]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GtkIMContextSimple)
      inline def `object` : GtkIMContext = struct._1
      inline def object_=(value: GtkIMContext): Unit = (!struct.at1 = value)
      inline def priv : Ptr[GtkIMContextSimplePrivate] = struct._2
      inline def priv_=(value: Ptr[GtkIMContextSimplePrivate]): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates _GtkIMContextSimple on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GtkIMContextSimple] = scala.scalanative.unsafe.alloc[_GtkIMContextSimple](1)
  def apply(`object` : GtkIMContext, priv : Ptr[GtkIMContextSimplePrivate])(using Zone): Ptr[_GtkIMContextSimple] =
    val ____ptr = apply()
    (!____ptr).`object` = `object`
    (!____ptr).priv = priv
    ____ptr