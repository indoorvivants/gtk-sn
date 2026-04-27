package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-tab-button.h
*/
opaque type AdwTabButtonClass_autoptr = Ptr[AdwTabButtonClass]
object AdwTabButtonClass_autoptr:
  given _tag: Tag[AdwTabButtonClass_autoptr] = Tag.Ptr[AdwTabButtonClass](AdwTabButtonClass._tag)
  inline def apply(inline o: Ptr[AdwTabButtonClass]): AdwTabButtonClass_autoptr = o
  extension (v: AdwTabButtonClass_autoptr)
    inline def value: Ptr[AdwTabButtonClass] = v