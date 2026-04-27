package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-about-dialog.h
*/
opaque type AdwAboutDialog_autoptr = Ptr[AdwAboutDialog]
object AdwAboutDialog_autoptr:
  given _tag: Tag[AdwAboutDialog_autoptr] = Tag.Ptr[AdwAboutDialog](AdwAboutDialog._tag)
  inline def apply(inline o: Ptr[AdwAboutDialog]): AdwAboutDialog_autoptr = o
  extension (v: AdwAboutDialog_autoptr)
    inline def value: Ptr[AdwAboutDialog] = v