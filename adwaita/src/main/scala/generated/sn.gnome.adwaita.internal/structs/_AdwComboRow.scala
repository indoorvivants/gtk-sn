package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-combo-row.h
*/
opaque type _AdwComboRow = CStruct1[AdwActionRow]

object _AdwComboRow:
  given _tag: Tag[_AdwComboRow] = Tag.materializeCStruct1Tag[AdwActionRow]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _AdwComboRow)
      inline def parent_instance : AdwActionRow = struct._1
      inline def parent_instance_=(value: AdwActionRow): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates _AdwComboRow on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_AdwComboRow] = scala.scalanative.unsafe.alloc[_AdwComboRow](1)
  def apply(parent_instance : AdwActionRow)(using Zone): Ptr[_AdwComboRow] =
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr