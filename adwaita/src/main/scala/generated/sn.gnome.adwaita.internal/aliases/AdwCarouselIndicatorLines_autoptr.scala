package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-carousel-indicator-lines.h
*/
opaque type AdwCarouselIndicatorLines_autoptr = Ptr[AdwCarouselIndicatorLines]
object AdwCarouselIndicatorLines_autoptr:
  given _tag: Tag[AdwCarouselIndicatorLines_autoptr] = Tag.Ptr[AdwCarouselIndicatorLines](AdwCarouselIndicatorLines._tag)
  inline def apply(inline o: Ptr[AdwCarouselIndicatorLines]): AdwCarouselIndicatorLines_autoptr = o
  extension (v: AdwCarouselIndicatorLines_autoptr)
    inline def value: Ptr[AdwCarouselIndicatorLines] = v