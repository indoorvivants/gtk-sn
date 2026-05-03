package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-animation-target.h
*/
opaque type AdwAnimationTargetClass_autoptr = Ptr[AdwAnimationTargetClass]
object AdwAnimationTargetClass_autoptr:
  given _tag: Tag[AdwAnimationTargetClass_autoptr] = Tag.Ptr[AdwAnimationTargetClass](AdwAnimationTargetClass._tag)
  inline def apply(inline o: Ptr[AdwAnimationTargetClass]): AdwAnimationTargetClass_autoptr = o
  extension (v: AdwAnimationTargetClass_autoptr)
    inline def value: Ptr[AdwAnimationTargetClass] = v