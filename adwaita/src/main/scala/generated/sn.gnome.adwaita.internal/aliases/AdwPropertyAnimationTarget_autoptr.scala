package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-animation-target.h
*/
opaque type AdwPropertyAnimationTarget_autoptr = Ptr[AdwPropertyAnimationTarget]
object AdwPropertyAnimationTarget_autoptr:
  given _tag: Tag[AdwPropertyAnimationTarget_autoptr] = Tag.Ptr[AdwPropertyAnimationTarget](AdwPropertyAnimationTarget._tag)
  inline def apply(inline o: Ptr[AdwPropertyAnimationTarget]): AdwPropertyAnimationTarget_autoptr = o
  extension (v: AdwPropertyAnimationTarget_autoptr)
    inline def value: Ptr[AdwPropertyAnimationTarget] = v