package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-spring-params.h
*/
opaque type AdwSpringParams_autoptr = Ptr[AdwSpringParams]
object AdwSpringParams_autoptr:
  given _tag: Tag[AdwSpringParams_autoptr] = Tag.Ptr[AdwSpringParams](AdwSpringParams._tag)
  inline def apply(inline o: Ptr[AdwSpringParams]): AdwSpringParams_autoptr = o
  extension (v: AdwSpringParams_autoptr)
    inline def value: Ptr[AdwSpringParams] = v