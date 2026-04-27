package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-spring-animation.h
*/
opaque type AdwSpringAnimation_autoptr = Ptr[AdwSpringAnimation]
object AdwSpringAnimation_autoptr:
  given _tag: Tag[AdwSpringAnimation_autoptr] = Tag.Ptr[AdwSpringAnimation](AdwSpringAnimation._tag)
  inline def apply(inline o: Ptr[AdwSpringAnimation]): AdwSpringAnimation_autoptr = o
  extension (v: AdwSpringAnimation_autoptr)
    inline def value: Ptr[AdwSpringAnimation] = v