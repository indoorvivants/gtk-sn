package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-message-dialog.h
*/
opaque type AdwMessageDialogClass_autoptr = Ptr[AdwMessageDialogClass]
object AdwMessageDialogClass_autoptr:
  given _tag: Tag[AdwMessageDialogClass_autoptr] = Tag.Ptr[AdwMessageDialogClass](AdwMessageDialogClass._tag)
  inline def apply(inline o: Ptr[AdwMessageDialogClass]): AdwMessageDialogClass_autoptr = o
  extension (v: AdwMessageDialogClass_autoptr)
    inline def value: Ptr[AdwMessageDialogClass] = v