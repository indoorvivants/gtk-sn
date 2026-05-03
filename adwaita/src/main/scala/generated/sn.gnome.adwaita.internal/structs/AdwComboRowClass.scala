package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * AdwComboRowClass _class: The parent class

 * [bindgen] header: /usr/include/libadwaita-1/adw-combo-row.h
*/
opaque type AdwComboRowClass = CStruct2[AdwActionRowClass, CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]]

object AdwComboRowClass:
  given _tag: Tag[AdwComboRowClass] = Tag.materializeCStruct2Tag[AdwActionRowClass, CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: AdwComboRowClass)
      inline def parent_class : AdwActionRowClass = struct._1
      inline def parent_class_=(value: AdwActionRowClass): Unit = (!struct.at1 = value)
      inline def padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4] = struct._2
      inline def padding_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates AdwComboRowClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[AdwComboRowClass] = scala.scalanative.unsafe.alloc[AdwComboRowClass](1)
  def apply(parent_class : AdwActionRowClass, padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4])(using Zone): Ptr[AdwComboRowClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).padding = padding
    ____ptr