package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-button-content.h
*/
opaque type AdwButtonContentClass_autoptr = Ptr[AdwButtonContentClass]
object AdwButtonContentClass_autoptr:
  given _tag: Tag[AdwButtonContentClass_autoptr] = Tag.Ptr[AdwButtonContentClass](AdwButtonContentClass._tag)
  inline def apply(inline o: Ptr[AdwButtonContentClass]): AdwButtonContentClass_autoptr = o
  extension (v: AdwButtonContentClass_autoptr)
    inline def value: Ptr[AdwButtonContentClass] = v