package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-toast-overlay.h
*/
opaque type AdwToastOverlayClass_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object AdwToastOverlayClass_queueautoptr:
  given _tag: Tag[AdwToastOverlayClass_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): AdwToastOverlayClass_queueautoptr = o
  extension (v: AdwToastOverlayClass_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v