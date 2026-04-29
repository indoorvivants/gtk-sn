package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-overlay-split-view.h
*/
opaque type AdwOverlaySplitView_autoptr = Ptr[AdwOverlaySplitView]
object AdwOverlaySplitView_autoptr:
  given _tag: Tag[AdwOverlaySplitView_autoptr] = Tag.Ptr[AdwOverlaySplitView](AdwOverlaySplitView._tag)
  inline def apply(inline o: Ptr[AdwOverlaySplitView]): AdwOverlaySplitView_autoptr = o
  extension (v: AdwOverlaySplitView_autoptr)
    inline def value: Ptr[AdwOverlaySplitView] = v