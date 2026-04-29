package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-animation-target.h
*/
opaque type AdwPropertyAnimationTargetClass_autoptr = Ptr[AdwPropertyAnimationTargetClass]
object AdwPropertyAnimationTargetClass_autoptr:
  given _tag: Tag[AdwPropertyAnimationTargetClass_autoptr] = Tag.Ptr[AdwPropertyAnimationTargetClass](AdwPropertyAnimationTargetClass._tag)
  inline def apply(inline o: Ptr[AdwPropertyAnimationTargetClass]): AdwPropertyAnimationTargetClass_autoptr = o
  extension (v: AdwPropertyAnimationTargetClass_autoptr)
    inline def value: Ptr[AdwPropertyAnimationTargetClass] = v