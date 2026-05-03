package sn.gnome.gdk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GdkPopup_autoptr = Ptr[GdkPopup]
object GdkPopup_autoptr:
  given _tag: Tag[GdkPopup_autoptr] = Tag.Ptr[GdkPopup](GdkPopup._tag)
  inline def apply(inline o: Ptr[GdkPopup]): GdkPopup_autoptr = o
  extension (v: GdkPopup_autoptr)
    inline def value: Ptr[GdkPopup] = v