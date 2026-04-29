package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-status-page.h
*/
opaque type AdwStatusPageClass_autoptr = Ptr[AdwStatusPageClass]
object AdwStatusPageClass_autoptr:
  given _tag: Tag[AdwStatusPageClass_autoptr] = Tag.Ptr[AdwStatusPageClass](AdwStatusPageClass._tag)
  inline def apply(inline o: Ptr[AdwStatusPageClass]): AdwStatusPageClass_autoptr = o
  extension (v: AdwStatusPageClass_autoptr)
    inline def value: Ptr[AdwStatusPageClass] = v