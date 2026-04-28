package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkComboBox = CStruct1[GtkWidget]

object GtkComboBox:
  given _tag: Tag[GtkComboBox] = Tag.materializeCStruct1Tag[GtkWidget]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GtkComboBox)
      inline def parent_instance : GtkWidget = struct._1
      inline def parent_instance_=(value: GtkWidget): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates GtkComboBox on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GtkComboBox] = scala.scalanative.unsafe.alloc[GtkComboBox](1)
  def apply(parent_instance : GtkWidget)(using Zone): Ptr[GtkComboBox] =
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr