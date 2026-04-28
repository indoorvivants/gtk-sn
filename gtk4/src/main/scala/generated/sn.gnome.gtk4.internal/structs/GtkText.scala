package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkText = CStruct1[GtkWidget]

object GtkText:
  given _tag: Tag[GtkText] = Tag.materializeCStruct1Tag[GtkWidget]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GtkText)
      inline def parent_instance : GtkWidget = struct._1
      inline def parent_instance_=(value: GtkWidget): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates GtkText on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GtkText] = scala.scalanative.unsafe.alloc[GtkText](1)
  def apply(parent_instance : GtkWidget)(using Zone): Ptr[GtkText] =
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr