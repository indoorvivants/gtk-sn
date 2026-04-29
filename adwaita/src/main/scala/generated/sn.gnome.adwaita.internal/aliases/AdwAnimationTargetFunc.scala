package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * AdwAnimationTargetFunc: : The animation value _data: (nullable): The user data provided when creating the target

 * [bindgen] header: /usr/include/libadwaita-1/adw-animation-target.h
*/
opaque type AdwAnimationTargetFunc = CFuncPtr2[Double, _root_.sn.gnome.glib.internal.gpointer, Unit]
object AdwAnimationTargetFunc:
  given _tag: Tag[AdwAnimationTargetFunc] = Tag.materializeCFuncPtr2[Double, _root_.sn.gnome.glib.internal.gpointer, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): AdwAnimationTargetFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[Double, _root_.sn.gnome.glib.internal.gpointer, Unit]): AdwAnimationTargetFunc = o
  extension (v: AdwAnimationTargetFunc)
    inline def value: CFuncPtr2[Double, _root_.sn.gnome.glib.internal.gpointer, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)