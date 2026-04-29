package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-toast.h
*/
opaque type AdwToastClass_autoptr = Ptr[AdwToastClass]
object AdwToastClass_autoptr:
  given _tag: Tag[AdwToastClass_autoptr] = Tag.Ptr[AdwToastClass](AdwToastClass._tag)
  inline def apply(inline o: Ptr[AdwToastClass]): AdwToastClass_autoptr = o
  extension (v: AdwToastClass_autoptr)
    inline def value: Ptr[AdwToastClass] = v