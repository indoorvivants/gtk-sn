package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-navigation-split-view.h
*/
opaque type AdwNavigationSplitView_autoptr = Ptr[AdwNavigationSplitView]
object AdwNavigationSplitView_autoptr:
  given _tag: Tag[AdwNavigationSplitView_autoptr] = Tag.Ptr[AdwNavigationSplitView](AdwNavigationSplitView._tag)
  inline def apply(inline o: Ptr[AdwNavigationSplitView]): AdwNavigationSplitView_autoptr = o
  extension (v: AdwNavigationSplitView_autoptr)
    inline def value: Ptr[AdwNavigationSplitView] = v