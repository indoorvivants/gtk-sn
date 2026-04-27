package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkIMContextSimpleClass = CStruct1[GtkIMContextClass]

object GtkIMContextSimpleClass:
  given _tag: Tag[GtkIMContextSimpleClass] = Tag.materializeCStruct1Tag[GtkIMContextClass]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GtkIMContextSimpleClass)
      inline def parent_class : GtkIMContextClass = struct._1
      inline def parent_class_=(value: GtkIMContextClass): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates GtkIMContextSimpleClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GtkIMContextSimpleClass] = scala.scalanative.unsafe.alloc[GtkIMContextSimpleClass](1)
  def apply(parent_class : GtkIMContextClass)(using Zone): Ptr[GtkIMContextSimpleClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr