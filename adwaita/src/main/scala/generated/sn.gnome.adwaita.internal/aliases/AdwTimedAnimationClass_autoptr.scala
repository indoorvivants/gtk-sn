package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-timed-animation.h
*/
opaque type AdwTimedAnimationClass_autoptr = Ptr[AdwTimedAnimationClass]
object AdwTimedAnimationClass_autoptr:
  given _tag: Tag[AdwTimedAnimationClass_autoptr] = Tag.Ptr[AdwTimedAnimationClass](AdwTimedAnimationClass._tag)
  inline def apply(inline o: Ptr[AdwTimedAnimationClass]): AdwTimedAnimationClass_autoptr = o
  extension (v: AdwTimedAnimationClass_autoptr)
    inline def value: Ptr[AdwTimedAnimationClass] = v