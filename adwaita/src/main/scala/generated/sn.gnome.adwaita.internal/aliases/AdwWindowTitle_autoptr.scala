package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-window-title.h
*/
opaque type AdwWindowTitle_autoptr = Ptr[AdwWindowTitle]
object AdwWindowTitle_autoptr:
  given _tag: Tag[AdwWindowTitle_autoptr] = Tag.Ptr[AdwWindowTitle](AdwWindowTitle._tag)
  inline def apply(inline o: Ptr[AdwWindowTitle]): AdwWindowTitle_autoptr = o
  extension (v: AdwWindowTitle_autoptr)
    inline def value: Ptr[AdwWindowTitle] = v