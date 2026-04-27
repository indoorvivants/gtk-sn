package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkMenuButtonCreatePopupFunc: _button: the `GtkMenuButton` _data: User data passed to gtk_menu_button_set_create_popup_func()
*/
opaque type GtkMenuButtonCreatePopupFunc = CFuncPtr2[Ptr[GtkMenuButton], _root_.sn.gnome.glib.internal.gpointer, Unit]
object GtkMenuButtonCreatePopupFunc:
  given _tag: Tag[GtkMenuButtonCreatePopupFunc] = Tag.materializeCFuncPtr2[Ptr[GtkMenuButton], _root_.sn.gnome.glib.internal.gpointer, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GtkMenuButtonCreatePopupFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[Ptr[GtkMenuButton], _root_.sn.gnome.glib.internal.gpointer, Unit]): GtkMenuButtonCreatePopupFunc = o
  extension (v: GtkMenuButtonCreatePopupFunc)
    inline def value: CFuncPtr2[Ptr[GtkMenuButton], _root_.sn.gnome.glib.internal.gpointer, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)