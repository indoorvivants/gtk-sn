package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-expander-row.h
*/
opaque type AdwExpanderRow = CStruct1[AdwPreferencesRow]

object AdwExpanderRow:
  given _tag: Tag[AdwExpanderRow] = Tag.materializeCStruct1Tag[AdwPreferencesRow]
  
  export fields.*
  private[internal] object fields:
    extension (struct: AdwExpanderRow)
      inline def parent_instance : AdwPreferencesRow = struct._1
      inline def parent_instance_=(value: AdwPreferencesRow): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates AdwExpanderRow on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[AdwExpanderRow] = scala.scalanative.unsafe.alloc[AdwExpanderRow](1)
  def apply(parent_instance : AdwPreferencesRow)(using Zone): Ptr[AdwExpanderRow] =
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr