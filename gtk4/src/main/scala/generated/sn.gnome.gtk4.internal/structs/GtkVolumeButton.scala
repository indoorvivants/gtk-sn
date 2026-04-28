package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkVolumeButton = CStruct1[GtkScaleButton]

object GtkVolumeButton:
  given _tag: Tag[GtkVolumeButton] = Tag.materializeCStruct1Tag[GtkScaleButton]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GtkVolumeButton)
      inline def parent : GtkScaleButton = struct._1
      inline def parent_=(value: GtkScaleButton): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates GtkVolumeButton on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GtkVolumeButton] = scala.scalanative.unsafe.alloc[GtkVolumeButton](1)
  def apply(parent : GtkScaleButton)(using Zone): Ptr[GtkVolumeButton] =
    val ____ptr = apply()
    (!____ptr).parent = parent
    ____ptr