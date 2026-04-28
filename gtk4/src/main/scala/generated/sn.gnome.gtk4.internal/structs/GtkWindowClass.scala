package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkWindowClass: _class: The parent class. _focus: Activates the current focused widget within the window. _default: Activates the default widget for the window. _changed: Signal gets emitted when the set of accelerators or mnemonics that are associated with window changes. _debugging: Class handler for the `GtkWindow::enable-debugging` keybinding signal. _request: Class handler for the `GtkWindow::close-request` signal.
*/
opaque type GtkWindowClass = CStruct7[GtkWidgetClass, CFuncPtr1[Ptr[GtkWindow], Unit], CFuncPtr1[Ptr[GtkWindow], Unit], CFuncPtr1[Ptr[GtkWindow], Unit], CFuncPtr2[Ptr[GtkWindow], _root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.gboolean], CFuncPtr1[Ptr[GtkWindow], _root_.sn.gnome.glib.internal.gboolean], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]]

object GtkWindowClass:
  given _tag: Tag[GtkWindowClass] = Tag.materializeCStruct7Tag[GtkWidgetClass, CFuncPtr1[Ptr[GtkWindow], Unit], CFuncPtr1[Ptr[GtkWindow], Unit], CFuncPtr1[Ptr[GtkWindow], Unit], CFuncPtr2[Ptr[GtkWindow], _root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.gboolean], CFuncPtr1[Ptr[GtkWindow], _root_.sn.gnome.glib.internal.gboolean], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GtkWindowClass)
      inline def parent_class : GtkWidgetClass = struct._1
      inline def parent_class_=(value: GtkWidgetClass): Unit = (!struct.at1 = value)
      inline def activate_focus : CFuncPtr1[Ptr[GtkWindow], Unit] = struct._2
      inline def activate_focus_=(value: CFuncPtr1[Ptr[GtkWindow], Unit]): Unit = (!struct.at2 = value)
      inline def activate_default : CFuncPtr1[Ptr[GtkWindow], Unit] = struct._3
      inline def activate_default_=(value: CFuncPtr1[Ptr[GtkWindow], Unit]): Unit = (!struct.at3 = value)
      inline def keys_changed : CFuncPtr1[Ptr[GtkWindow], Unit] = struct._4
      inline def keys_changed_=(value: CFuncPtr1[Ptr[GtkWindow], Unit]): Unit = (!struct.at4 = value)
      inline def enable_debugging : CFuncPtr2[Ptr[GtkWindow], _root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.gboolean] = struct._5
      inline def enable_debugging_=(value: CFuncPtr2[Ptr[GtkWindow], _root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at5 = value)
      inline def close_request : CFuncPtr1[Ptr[GtkWindow], _root_.sn.gnome.glib.internal.gboolean] = struct._6
      inline def close_request_=(value: CFuncPtr1[Ptr[GtkWindow], _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at6 = value)
      inline def padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8] = struct._7
      inline def padding_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]): Unit = (!struct.at7 = value)
    end extension
  
  // Allocates GtkWindowClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GtkWindowClass] = scala.scalanative.unsafe.alloc[GtkWindowClass](1)
  def apply(parent_class : GtkWidgetClass, activate_focus : CFuncPtr1[Ptr[GtkWindow], Unit], activate_default : CFuncPtr1[Ptr[GtkWindow], Unit], keys_changed : CFuncPtr1[Ptr[GtkWindow], Unit], enable_debugging : CFuncPtr2[Ptr[GtkWindow], _root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.gboolean], close_request : CFuncPtr1[Ptr[GtkWindow], _root_.sn.gnome.glib.internal.gboolean], padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8])(using Zone): Ptr[GtkWindowClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).activate_focus = activate_focus
    (!____ptr).activate_default = activate_default
    (!____ptr).keys_changed = keys_changed
    (!____ptr).enable_debugging = enable_debugging
    (!____ptr).close_request = close_request
    (!____ptr).padding = padding
    ____ptr