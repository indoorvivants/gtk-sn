package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-dialog.h
*/
opaque type AdwDialog_autoptr = Ptr[AdwDialog]
object AdwDialog_autoptr:
  given _tag: Tag[AdwDialog_autoptr] = Tag.Ptr[AdwDialog](AdwDialog._tag)
  inline def apply(inline o: Ptr[AdwDialog]): AdwDialog_autoptr = o
  extension (v: AdwDialog_autoptr)
    inline def value: Ptr[AdwDialog] = v