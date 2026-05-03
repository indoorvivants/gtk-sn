package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-toolbar-view.h
*/
opaque type AdwToolbarView_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object AdwToolbarView_queueautoptr:
  given _tag: Tag[AdwToolbarView_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): AdwToolbarView_queueautoptr = o
  extension (v: AdwToolbarView_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v