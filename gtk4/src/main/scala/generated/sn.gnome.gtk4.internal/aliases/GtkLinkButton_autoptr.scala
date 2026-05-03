package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkLinkButton_autoptr = Ptr[GtkLinkButton]
object GtkLinkButton_autoptr:
  given _tag: Tag[GtkLinkButton_autoptr] = Tag.Ptr[GtkLinkButton](GtkLinkButton._tag)
  inline def apply(inline o: Ptr[GtkLinkButton]): GtkLinkButton_autoptr = o
  extension (v: GtkLinkButton_autoptr)
    inline def value: Ptr[GtkLinkButton] = v