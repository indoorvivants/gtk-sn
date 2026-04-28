package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkPopoverMenu_autoptr = Ptr[GtkPopoverMenu]
object GtkPopoverMenu_autoptr:
  given _tag: Tag[GtkPopoverMenu_autoptr] = Tag.Ptr[GtkPopoverMenu](GtkPopoverMenu._tag)
  inline def apply(inline o: Ptr[GtkPopoverMenu]): GtkPopoverMenu_autoptr = o
  extension (v: GtkPopoverMenu_autoptr)
    inline def value: Ptr[GtkPopoverMenu] = v