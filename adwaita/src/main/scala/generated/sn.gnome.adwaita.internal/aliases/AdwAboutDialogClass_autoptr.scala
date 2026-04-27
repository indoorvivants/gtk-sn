package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-about-dialog.h
*/
opaque type AdwAboutDialogClass_autoptr = Ptr[AdwAboutDialogClass]
object AdwAboutDialogClass_autoptr:
  given _tag: Tag[AdwAboutDialogClass_autoptr] = Tag.Ptr[AdwAboutDialogClass](AdwAboutDialogClass._tag)
  inline def apply(inline o: Ptr[AdwAboutDialogClass]): AdwAboutDialogClass_autoptr = o
  extension (v: AdwAboutDialogClass_autoptr)
    inline def value: Ptr[AdwAboutDialogClass] = v