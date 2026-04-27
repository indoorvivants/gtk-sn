package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-view-stack.h
*/
opaque type AdwViewStackPages_autoptr = Ptr[AdwViewStackPages]
object AdwViewStackPages_autoptr:
  given _tag: Tag[AdwViewStackPages_autoptr] = Tag.Ptr[AdwViewStackPages](AdwViewStackPages._tag)
  inline def apply(inline o: Ptr[AdwViewStackPages]): AdwViewStackPages_autoptr = o
  extension (v: AdwViewStackPages_autoptr)
    inline def value: Ptr[AdwViewStackPages] = v