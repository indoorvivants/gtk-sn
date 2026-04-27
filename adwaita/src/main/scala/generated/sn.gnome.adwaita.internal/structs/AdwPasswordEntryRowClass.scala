package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-password-entry-row.h
*/
opaque type AdwPasswordEntryRowClass = CStruct1[AdwEntryRowClass]

object AdwPasswordEntryRowClass:
  given _tag: Tag[AdwPasswordEntryRowClass] = Tag.materializeCStruct1Tag[AdwEntryRowClass]
  
  export fields.*
  private[internal] object fields:
    extension (struct: AdwPasswordEntryRowClass)
      inline def parent_class : AdwEntryRowClass = struct._1
      inline def parent_class_=(value: AdwEntryRowClass): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates AdwPasswordEntryRowClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[AdwPasswordEntryRowClass] = scala.scalanative.unsafe.alloc[AdwPasswordEntryRowClass](1)
  def apply(parent_class : AdwEntryRowClass)(using Zone): Ptr[AdwPasswordEntryRowClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr