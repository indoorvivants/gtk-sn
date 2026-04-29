package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-about-window.h
*/
opaque type AdwAboutWindowClass = CStruct1[AdwWindowClass]

object AdwAboutWindowClass:
  given _tag: Tag[AdwAboutWindowClass] = Tag.materializeCStruct1Tag[AdwWindowClass]
  
  export fields.*
  private[internal] object fields:
    extension (struct: AdwAboutWindowClass)
      inline def parent_class : AdwWindowClass = struct._1
      inline def parent_class_=(value: AdwWindowClass): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates AdwAboutWindowClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[AdwAboutWindowClass] = scala.scalanative.unsafe.alloc[AdwAboutWindowClass](1)
  def apply(parent_class : AdwWindowClass)(using Zone): Ptr[AdwAboutWindowClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr