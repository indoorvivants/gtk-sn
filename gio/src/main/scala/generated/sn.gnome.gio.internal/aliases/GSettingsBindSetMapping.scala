package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GSettingsBindSetMapping: : a #GValue containing the property value to map _type: the #GVariantType to create _data: user data that was specified when the binding was created
*/
opaque type GSettingsBindSetMapping = CFuncPtr3[Ptr[_root_.sn.gnome.gobject.internal.GValue], Ptr[_root_.sn.gnome.glib.internal.GVariantType], _root_.sn.gnome.glib.internal.gpointer, Ptr[_root_.sn.gnome.glib.internal.GVariant]]
object GSettingsBindSetMapping:
  given _tag: Tag[GSettingsBindSetMapping] = Tag.materializeCFuncPtr3[Ptr[_root_.sn.gnome.gobject.internal.GValue], Ptr[_root_.sn.gnome.glib.internal.GVariantType], _root_.sn.gnome.glib.internal.gpointer, Ptr[_root_.sn.gnome.glib.internal.GVariant]]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GSettingsBindSetMapping = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[Ptr[_root_.sn.gnome.gobject.internal.GValue], Ptr[_root_.sn.gnome.glib.internal.GVariantType], _root_.sn.gnome.glib.internal.gpointer, Ptr[_root_.sn.gnome.glib.internal.GVariant]]): GSettingsBindSetMapping = o
  extension (v: GSettingsBindSetMapping)
    inline def value: CFuncPtr3[Ptr[_root_.sn.gnome.gobject.internal.GValue], Ptr[_root_.sn.gnome.glib.internal.GVariantType], _root_.sn.gnome.glib.internal.gpointer, Ptr[_root_.sn.gnome.glib.internal.GVariant]] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)