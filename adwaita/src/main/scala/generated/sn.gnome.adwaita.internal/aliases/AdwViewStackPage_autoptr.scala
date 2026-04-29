package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-view-stack.h
*/
opaque type AdwViewStackPage_autoptr = Ptr[AdwViewStackPage]
object AdwViewStackPage_autoptr:
  given _tag: Tag[AdwViewStackPage_autoptr] = Tag.Ptr[AdwViewStackPage](AdwViewStackPage._tag)
  inline def apply(inline o: Ptr[AdwViewStackPage]): AdwViewStackPage_autoptr = o
  extension (v: AdwViewStackPage_autoptr)
    inline def value: Ptr[AdwViewStackPage] = v