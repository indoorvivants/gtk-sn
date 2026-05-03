package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-view-stack.h
*/
opaque type AdwViewStack_autoptr = Ptr[AdwViewStack]
object AdwViewStack_autoptr:
  given _tag: Tag[AdwViewStack_autoptr] = Tag.Ptr[AdwViewStack](AdwViewStack._tag)
  inline def apply(inline o: Ptr[AdwViewStack]): AdwViewStack_autoptr = o
  extension (v: AdwViewStack_autoptr)
    inline def value: Ptr[AdwViewStack] = v