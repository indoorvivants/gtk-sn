package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-spin-row.h
*/
opaque type AdwSpinRowClass = CStruct1[AdwActionRowClass]

object AdwSpinRowClass:
  given _tag: Tag[AdwSpinRowClass] = Tag.materializeCStruct1Tag[AdwActionRowClass]
  
  export fields.*
  private[internal] object fields:
    extension (struct: AdwSpinRowClass)
      inline def parent_class : AdwActionRowClass = struct._1
      inline def parent_class_=(value: AdwActionRowClass): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates AdwSpinRowClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[AdwSpinRowClass] = scala.scalanative.unsafe.alloc[AdwSpinRowClass](1)
  def apply(parent_class : AdwActionRowClass)(using Zone): Ptr[AdwSpinRowClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr