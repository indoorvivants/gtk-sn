package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-toolbar-view.h
*/
opaque type AdwToolbarViewClass_autoptr = Ptr[AdwToolbarViewClass]
object AdwToolbarViewClass_autoptr:
  given _tag: Tag[AdwToolbarViewClass_autoptr] = Tag.Ptr[AdwToolbarViewClass](AdwToolbarViewClass._tag)
  inline def apply(inline o: Ptr[AdwToolbarViewClass]): AdwToolbarViewClass_autoptr = o
  extension (v: AdwToolbarViewClass_autoptr)
    inline def value: Ptr[AdwToolbarViewClass] = v