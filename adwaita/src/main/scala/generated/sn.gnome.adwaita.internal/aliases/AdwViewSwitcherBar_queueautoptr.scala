package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-view-switcher-bar.h
*/
opaque type AdwViewSwitcherBar_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object AdwViewSwitcherBar_queueautoptr:
  given _tag: Tag[AdwViewSwitcherBar_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): AdwViewSwitcherBar_queueautoptr = o
  extension (v: AdwViewSwitcherBar_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v