package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkPasswordEntryBufferClass = CStruct1[GtkEntryBufferClass]

object GtkPasswordEntryBufferClass:
  given _tag: Tag[GtkPasswordEntryBufferClass] = Tag.materializeCStruct1Tag[GtkEntryBufferClass]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GtkPasswordEntryBufferClass)
      inline def parent_class : GtkEntryBufferClass = struct._1
      inline def parent_class_=(value: GtkEntryBufferClass): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates GtkPasswordEntryBufferClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GtkPasswordEntryBufferClass] = scala.scalanative.unsafe.alloc[GtkPasswordEntryBufferClass](1)
  def apply(parent_class : GtkEntryBufferClass)(using Zone): Ptr[GtkPasswordEntryBufferClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr