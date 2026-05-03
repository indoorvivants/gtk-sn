package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-animation-target.h
*/
opaque type AdwCallbackAnimationTarget_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object AdwCallbackAnimationTarget_slistautoptr:
  given _tag: Tag[AdwCallbackAnimationTarget_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): AdwCallbackAnimationTarget_slistautoptr = o
  extension (v: AdwCallbackAnimationTarget_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v