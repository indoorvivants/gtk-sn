package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-spring-animation.h
*/
opaque type AdwSpringAnimationClass_autoptr = Ptr[AdwSpringAnimationClass]
object AdwSpringAnimationClass_autoptr:
  given _tag: Tag[AdwSpringAnimationClass_autoptr] = Tag.Ptr[AdwSpringAnimationClass](AdwSpringAnimationClass._tag)
  inline def apply(inline o: Ptr[AdwSpringAnimationClass]): AdwSpringAnimationClass_autoptr = o
  extension (v: AdwSpringAnimationClass_autoptr)
    inline def value: Ptr[AdwSpringAnimationClass] = v