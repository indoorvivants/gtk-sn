package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkAppChooserWidget_autoptr = Ptr[GtkAppChooserWidget]
object GtkAppChooserWidget_autoptr:
  given _tag: Tag[GtkAppChooserWidget_autoptr] = Tag.Ptr[GtkAppChooserWidget](GtkAppChooserWidget._tag)
  inline def apply(inline o: Ptr[GtkAppChooserWidget]): GtkAppChooserWidget_autoptr = o
  extension (v: GtkAppChooserWidget_autoptr)
    inline def value: Ptr[GtkAppChooserWidget] = v