package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-button-content.h
*/
opaque type AdwButtonContent_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object AdwButtonContent_queueautoptr:
  given _tag: Tag[AdwButtonContent_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): AdwButtonContent_queueautoptr = o
  extension (v: AdwButtonContent_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v