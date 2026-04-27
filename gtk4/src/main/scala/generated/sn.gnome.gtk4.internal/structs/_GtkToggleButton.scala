package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GtkToggleButton = CStruct1[GtkButton]

object _GtkToggleButton:
  given _tag: Tag[_GtkToggleButton] = Tag.materializeCStruct1Tag[GtkButton]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GtkToggleButton)
      inline def button : GtkButton = struct._1
      inline def button_=(value: GtkButton): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates _GtkToggleButton on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GtkToggleButton] = scala.scalanative.unsafe.alloc[_GtkToggleButton](1)
  def apply(button : GtkButton)(using Zone): Ptr[_GtkToggleButton] =
    val ____ptr = apply()
    (!____ptr).button = button
    ____ptr