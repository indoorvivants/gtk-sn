package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-style-manager.h
*/
opaque type AdwStyleManagerClass_autoptr = Ptr[AdwStyleManagerClass]
object AdwStyleManagerClass_autoptr:
  given _tag: Tag[AdwStyleManagerClass_autoptr] = Tag.Ptr[AdwStyleManagerClass](AdwStyleManagerClass._tag)
  inline def apply(inline o: Ptr[AdwStyleManagerClass]): AdwStyleManagerClass_autoptr = o
  extension (v: AdwStyleManagerClass_autoptr)
    inline def value: Ptr[AdwStyleManagerClass] = v