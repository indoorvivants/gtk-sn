package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-animation.h
*/
opaque type AdwAnimationClass_autoptr = Ptr[AdwAnimationClass]
object AdwAnimationClass_autoptr:
  given _tag: Tag[AdwAnimationClass_autoptr] = Tag.Ptr[AdwAnimationClass](AdwAnimationClass._tag)
  inline def apply(inline o: Ptr[AdwAnimationClass]): AdwAnimationClass_autoptr = o
  extension (v: AdwAnimationClass_autoptr)
    inline def value: Ptr[AdwAnimationClass] = v