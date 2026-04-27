package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-message-dialog.h
*/
opaque type AdwMessageDialog_autoptr = Ptr[AdwMessageDialog]
object AdwMessageDialog_autoptr:
  given _tag: Tag[AdwMessageDialog_autoptr] = Tag.Ptr[AdwMessageDialog](AdwMessageDialog._tag)
  inline def apply(inline o: Ptr[AdwMessageDialog]): AdwMessageDialog_autoptr = o
  extension (v: AdwMessageDialog_autoptr)
    inline def value: Ptr[AdwMessageDialog] = v