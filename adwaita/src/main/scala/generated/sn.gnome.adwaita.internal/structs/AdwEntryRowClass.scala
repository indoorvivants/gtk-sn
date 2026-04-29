package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * AdwEntryRowClass _class: The parent class

 * [bindgen] header: /usr/include/libadwaita-1/adw-entry-row.h
*/
opaque type AdwEntryRowClass = CStruct1[AdwPreferencesRowClass]

object AdwEntryRowClass:
  given _tag: Tag[AdwEntryRowClass] = Tag.materializeCStruct1Tag[AdwPreferencesRowClass]
  
  export fields.*
  private[internal] object fields:
    extension (struct: AdwEntryRowClass)
      inline def parent_class : AdwPreferencesRowClass = struct._1
      inline def parent_class_=(value: AdwPreferencesRowClass): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates AdwEntryRowClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[AdwEntryRowClass] = scala.scalanative.unsafe.alloc[AdwEntryRowClass](1)
  def apply(parent_class : AdwPreferencesRowClass)(using Zone): Ptr[AdwEntryRowClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr