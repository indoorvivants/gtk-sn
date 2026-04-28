package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkAppChooserButton_autoptr = Ptr[GtkAppChooserButton]
object GtkAppChooserButton_autoptr:
  given _tag: Tag[GtkAppChooserButton_autoptr] = Tag.Ptr[GtkAppChooserButton](GtkAppChooserButton._tag)
  inline def apply(inline o: Ptr[GtkAppChooserButton]): GtkAppChooserButton_autoptr = o
  extension (v: GtkAppChooserButton_autoptr)
    inline def value: Ptr[GtkAppChooserButton] = v