package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-about-window.h
*/
opaque type AdwAboutWindow_queueautoptr = Ptr[_root_.sn.gnome.glib.internal.GQueue]
object AdwAboutWindow_queueautoptr:
  given _tag: Tag[AdwAboutWindow_queueautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GQueue](_root_.sn.gnome.glib.internal.GQueue._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GQueue]): AdwAboutWindow_queueautoptr = o
  extension (v: AdwAboutWindow_queueautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GQueue] = v