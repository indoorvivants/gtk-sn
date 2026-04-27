package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-bin.h
*/
opaque type AdwBin_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object AdwBin_queueautoptr:
  given _tag: Tag[AdwBin_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): AdwBin_queueautoptr = o
  extension (v: AdwBin_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v