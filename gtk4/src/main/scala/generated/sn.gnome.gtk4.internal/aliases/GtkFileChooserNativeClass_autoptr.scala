package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkFileChooserNativeClass_autoptr = Ptr[GtkFileChooserNativeClass]
object GtkFileChooserNativeClass_autoptr:
  given _tag: Tag[GtkFileChooserNativeClass_autoptr] = Tag.Ptr[GtkFileChooserNativeClass](GtkFileChooserNativeClass._tag)
  inline def apply(inline o: Ptr[GtkFileChooserNativeClass]): GtkFileChooserNativeClass_autoptr = o
  extension (v: GtkFileChooserNativeClass_autoptr)
    inline def value: Ptr[GtkFileChooserNativeClass] = v