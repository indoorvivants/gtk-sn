package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-view-switcher-bar.h
*/
opaque type AdwViewSwitcherBarClass_autoptr = Ptr[AdwViewSwitcherBarClass]
object AdwViewSwitcherBarClass_autoptr:
  given _tag: Tag[AdwViewSwitcherBarClass_autoptr] = Tag.Ptr[AdwViewSwitcherBarClass](AdwViewSwitcherBarClass._tag)
  inline def apply(inline o: Ptr[AdwViewSwitcherBarClass]): AdwViewSwitcherBarClass_autoptr = o
  extension (v: AdwViewSwitcherBarClass_autoptr)
    inline def value: Ptr[AdwViewSwitcherBarClass] = v