package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-carousel-indicator-dots.h
*/
opaque type AdwCarouselIndicatorDots_autoptr = Ptr[AdwCarouselIndicatorDots]
object AdwCarouselIndicatorDots_autoptr:
  given _tag: Tag[AdwCarouselIndicatorDots_autoptr] = Tag.Ptr[AdwCarouselIndicatorDots](AdwCarouselIndicatorDots._tag)
  inline def apply(inline o: Ptr[AdwCarouselIndicatorDots]): AdwCarouselIndicatorDots_autoptr = o
  extension (v: AdwCarouselIndicatorDots_autoptr)
    inline def value: Ptr[AdwCarouselIndicatorDots] = v