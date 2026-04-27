package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-carousel.h
*/
opaque type AdwCarouselClass_autoptr = Ptr[AdwCarouselClass]
object AdwCarouselClass_autoptr:
  given _tag: Tag[AdwCarouselClass_autoptr] = Tag.Ptr[AdwCarouselClass](AdwCarouselClass._tag)
  inline def apply(inline o: Ptr[AdwCarouselClass]): AdwCarouselClass_autoptr = o
  extension (v: AdwCarouselClass_autoptr)
    inline def value: Ptr[AdwCarouselClass] = v