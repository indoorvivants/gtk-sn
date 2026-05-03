package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-switch-row.h
*/
opaque type AdwSwitchRowClass = CStruct1[AdwActionRowClass]

object AdwSwitchRowClass:
  given _tag: Tag[AdwSwitchRowClass] = Tag.materializeCStruct1Tag[AdwActionRowClass]
  
  export fields.*
  private[internal] object fields:
    extension (struct: AdwSwitchRowClass)
      inline def parent_class : AdwActionRowClass = struct._1
      inline def parent_class_=(value: AdwActionRowClass): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates AdwSwitchRowClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[AdwSwitchRowClass] = scala.scalanative.unsafe.alloc[AdwSwitchRowClass](1)
  def apply(parent_class : AdwActionRowClass)(using Zone): Ptr[AdwSwitchRowClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr