package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-view-stack.h
*/
opaque type AdwViewStackClass_autoptr = Ptr[AdwViewStackClass]
object AdwViewStackClass_autoptr:
  given _tag: Tag[AdwViewStackClass_autoptr] = Tag.Ptr[AdwViewStackClass](AdwViewStackClass._tag)
  inline def apply(inline o: Ptr[AdwViewStackClass]): AdwViewStackClass_autoptr = o
  extension (v: AdwViewStackClass_autoptr)
    inline def value: Ptr[AdwViewStackClass] = v