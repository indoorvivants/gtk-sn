package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-entry-row.h
*/
opaque type _AdwEntryRow = CStruct1[AdwPreferencesRow]

object _AdwEntryRow:
  given _tag: Tag[_AdwEntryRow] = Tag.materializeCStruct1Tag[AdwPreferencesRow]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _AdwEntryRow)
      inline def parent_instance : AdwPreferencesRow = struct._1
      inline def parent_instance_=(value: AdwPreferencesRow): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates _AdwEntryRow on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_AdwEntryRow] = scala.scalanative.unsafe.alloc[_AdwEntryRow](1)
  def apply(parent_instance : AdwPreferencesRow)(using Zone): Ptr[_AdwEntryRow] =
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr