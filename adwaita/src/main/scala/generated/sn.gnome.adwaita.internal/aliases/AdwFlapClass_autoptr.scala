package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-flap.h
*/
opaque type AdwFlapClass_autoptr = Ptr[AdwFlapClass]
object AdwFlapClass_autoptr:
  given _tag: Tag[AdwFlapClass_autoptr] = Tag.Ptr[AdwFlapClass](AdwFlapClass._tag)
  inline def apply(inline o: Ptr[AdwFlapClass]): AdwFlapClass_autoptr = o
  extension (v: AdwFlapClass_autoptr)
    inline def value: Ptr[AdwFlapClass] = v