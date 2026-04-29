package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-animation.h
*/
opaque type AdwAnimation_autoptr = Ptr[AdwAnimation]
object AdwAnimation_autoptr:
  given _tag: Tag[AdwAnimation_autoptr] = Tag.Ptr[AdwAnimation](AdwAnimation._tag)
  inline def apply(inline o: Ptr[AdwAnimation]): AdwAnimation_autoptr = o
  extension (v: AdwAnimation_autoptr)
    inline def value: Ptr[AdwAnimation] = v