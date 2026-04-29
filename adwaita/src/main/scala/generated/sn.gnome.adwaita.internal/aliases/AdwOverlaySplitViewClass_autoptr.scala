package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-overlay-split-view.h
*/
opaque type AdwOverlaySplitViewClass_autoptr = Ptr[AdwOverlaySplitViewClass]
object AdwOverlaySplitViewClass_autoptr:
  given _tag: Tag[AdwOverlaySplitViewClass_autoptr] = Tag.Ptr[AdwOverlaySplitViewClass](AdwOverlaySplitViewClass._tag)
  inline def apply(inline o: Ptr[AdwOverlaySplitViewClass]): AdwOverlaySplitViewClass_autoptr = o
  extension (v: AdwOverlaySplitViewClass_autoptr)
    inline def value: Ptr[AdwOverlaySplitViewClass] = v