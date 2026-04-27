package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-application.h
*/
opaque type AdwApplication_autoptr = Ptr[AdwApplication]
object AdwApplication_autoptr:
  given _tag: Tag[AdwApplication_autoptr] = Tag.Ptr[AdwApplication](AdwApplication._tag)
  inline def apply(inline o: Ptr[AdwApplication]): AdwApplication_autoptr = o
  extension (v: AdwApplication_autoptr)
    inline def value: Ptr[AdwApplication] = v