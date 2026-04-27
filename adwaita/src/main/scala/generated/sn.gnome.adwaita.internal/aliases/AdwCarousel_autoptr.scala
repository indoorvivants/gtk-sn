package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-carousel.h
*/
opaque type AdwCarousel_autoptr = Ptr[AdwCarousel]
object AdwCarousel_autoptr:
  given _tag: Tag[AdwCarousel_autoptr] = Tag.Ptr[AdwCarousel](AdwCarousel._tag)
  inline def apply(inline o: Ptr[AdwCarousel]): AdwCarousel_autoptr = o
  extension (v: AdwCarousel_autoptr)
    inline def value: Ptr[AdwCarousel] = v