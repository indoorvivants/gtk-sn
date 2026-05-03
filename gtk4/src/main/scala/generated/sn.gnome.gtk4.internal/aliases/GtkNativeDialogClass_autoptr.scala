package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkNativeDialogClass_autoptr = Ptr[GtkNativeDialogClass]
object GtkNativeDialogClass_autoptr:
  given _tag: Tag[GtkNativeDialogClass_autoptr] = Tag.Ptr[GtkNativeDialogClass](GtkNativeDialogClass._tag)
  inline def apply(inline o: Ptr[GtkNativeDialogClass]): GtkNativeDialogClass_autoptr = o
  extension (v: GtkNativeDialogClass_autoptr)
    inline def value: Ptr[GtkNativeDialogClass] = v