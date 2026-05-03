package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-carousel-indicator-dots.h
*/
opaque type AdwCarouselIndicatorDotsClass_autoptr = Ptr[AdwCarouselIndicatorDotsClass]
object AdwCarouselIndicatorDotsClass_autoptr:
  given _tag: Tag[AdwCarouselIndicatorDotsClass_autoptr] = Tag.Ptr[AdwCarouselIndicatorDotsClass](AdwCarouselIndicatorDotsClass._tag)
  inline def apply(inline o: Ptr[AdwCarouselIndicatorDotsClass]): AdwCarouselIndicatorDotsClass_autoptr = o
  extension (v: AdwCarouselIndicatorDotsClass_autoptr)
    inline def value: Ptr[AdwCarouselIndicatorDotsClass] = v