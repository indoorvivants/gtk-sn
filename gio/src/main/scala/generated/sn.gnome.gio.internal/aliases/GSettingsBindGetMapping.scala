package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GSettingsBindGetMapping: : return location for the property value : the #GVariant _data: user data that was specified when the binding was created
*/
opaque type GSettingsBindGetMapping = CFuncPtr3[Ptr[_root_.sn.gnome.gobject.internal.GValue], Ptr[_root_.sn.gnome.glib.internal.GVariant], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]
object GSettingsBindGetMapping:
  given _tag: Tag[GSettingsBindGetMapping] = Tag.materializeCFuncPtr3[Ptr[_root_.sn.gnome.gobject.internal.GValue], Ptr[_root_.sn.gnome.glib.internal.GVariant], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GSettingsBindGetMapping = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[Ptr[_root_.sn.gnome.gobject.internal.GValue], Ptr[_root_.sn.gnome.glib.internal.GVariant], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]): GSettingsBindGetMapping = o
  extension (v: GSettingsBindGetMapping)
    inline def value: CFuncPtr3[Ptr[_root_.sn.gnome.gobject.internal.GValue], Ptr[_root_.sn.gnome.glib.internal.GVariant], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)