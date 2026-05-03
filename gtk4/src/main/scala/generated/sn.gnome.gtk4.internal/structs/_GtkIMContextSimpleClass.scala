package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GtkIMContextSimpleClass = CStruct1[GtkIMContextClass]

object _GtkIMContextSimpleClass:
  given _tag: Tag[_GtkIMContextSimpleClass] = Tag.materializeCStruct1Tag[GtkIMContextClass]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GtkIMContextSimpleClass)
      inline def parent_class : GtkIMContextClass = struct._1
      inline def parent_class_=(value: GtkIMContextClass): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates _GtkIMContextSimpleClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GtkIMContextSimpleClass] = scala.scalanative.unsafe.alloc[_GtkIMContextSimpleClass](1)
  def apply(parent_class : GtkIMContextClass)(using Zone): Ptr[_GtkIMContextSimpleClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr