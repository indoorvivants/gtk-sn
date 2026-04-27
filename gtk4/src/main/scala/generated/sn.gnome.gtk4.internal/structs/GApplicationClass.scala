package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GApplicationClass = CStruct17[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr1[Ptr[_root_.sn.gnome.gio.internal.GApplication], Unit], CFuncPtr1[Ptr[_root_.sn.gnome.gio.internal.GApplication], Unit], CFuncPtr4[Ptr[_root_.sn.gnome.gio.internal.GApplication], Ptr[Ptr[_root_.sn.gnome.gio.internal.GFile]], _root_.sn.gnome.glib.internal.gint, Ptr[_root_.sn.gnome.glib.internal.gchar], Unit], CFuncPtr2[Ptr[_root_.sn.gnome.gio.internal.GApplication], Ptr[_root_.sn.gnome.gio.internal.GApplicationCommandLine], CInt], CFuncPtr3[Ptr[_root_.sn.gnome.gio.internal.GApplication], Ptr[Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]], Ptr[CInt], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr2[Ptr[_root_.sn.gnome.gio.internal.GApplication], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit], CFuncPtr2[Ptr[_root_.sn.gnome.gio.internal.GApplication], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit], CFuncPtr2[Ptr[_root_.sn.gnome.gio.internal.GApplication], Ptr[_root_.sn.gnome.glib.internal.GVariantBuilder], Unit], CFuncPtr1[Ptr[_root_.sn.gnome.gio.internal.GApplication], Unit], CFuncPtr1[Ptr[_root_.sn.gnome.gio.internal.GApplication], Unit], CFuncPtr1[Ptr[_root_.sn.gnome.gio.internal.GApplication], Unit], CFuncPtr4[Ptr[_root_.sn.gnome.gio.internal.GApplication], Ptr[_root_.sn.gnome.gio.internal.GDBusConnection], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr3[Ptr[_root_.sn.gnome.gio.internal.GApplication], Ptr[_root_.sn.gnome.gio.internal.GDBusConnection], Ptr[_root_.sn.gnome.glib.internal.gchar], Unit], CFuncPtr2[Ptr[_root_.sn.gnome.gio.internal.GApplication], Ptr[_root_.sn.gnome.glib.internal.GVariantDict], _root_.sn.gnome.glib.internal.gint], CFuncPtr1[Ptr[_root_.sn.gnome.gio.internal.GApplication], _root_.sn.gnome.glib.internal.gboolean], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._7]]

object GApplicationClass:
  given _tag: Tag[GApplicationClass] = Tag.materializeCStruct17Tag[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr1[Ptr[_root_.sn.gnome.gio.internal.GApplication], Unit], CFuncPtr1[Ptr[_root_.sn.gnome.gio.internal.GApplication], Unit], CFuncPtr4[Ptr[_root_.sn.gnome.gio.internal.GApplication], Ptr[Ptr[_root_.sn.gnome.gio.internal.GFile]], _root_.sn.gnome.glib.internal.gint, Ptr[_root_.sn.gnome.glib.internal.gchar], Unit], CFuncPtr2[Ptr[_root_.sn.gnome.gio.internal.GApplication], Ptr[_root_.sn.gnome.gio.internal.GApplicationCommandLine], CInt], CFuncPtr3[Ptr[_root_.sn.gnome.gio.internal.GApplication], Ptr[Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]], Ptr[CInt], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr2[Ptr[_root_.sn.gnome.gio.internal.GApplication], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit], CFuncPtr2[Ptr[_root_.sn.gnome.gio.internal.GApplication], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit], CFuncPtr2[Ptr[_root_.sn.gnome.gio.internal.GApplication], Ptr[_root_.sn.gnome.glib.internal.GVariantBuilder], Unit], CFuncPtr1[Ptr[_root_.sn.gnome.gio.internal.GApplication], Unit], CFuncPtr1[Ptr[_root_.sn.gnome.gio.internal.GApplication], Unit], CFuncPtr1[Ptr[_root_.sn.gnome.gio.internal.GApplication], Unit], CFuncPtr4[Ptr[_root_.sn.gnome.gio.internal.GApplication], Ptr[_root_.sn.gnome.gio.internal.GDBusConnection], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr3[Ptr[_root_.sn.gnome.gio.internal.GApplication], Ptr[_root_.sn.gnome.gio.internal.GDBusConnection], Ptr[_root_.sn.gnome.glib.internal.gchar], Unit], CFuncPtr2[Ptr[_root_.sn.gnome.gio.internal.GApplication], Ptr[_root_.sn.gnome.glib.internal.GVariantDict], _root_.sn.gnome.glib.internal.gint], CFuncPtr1[Ptr[_root_.sn.gnome.gio.internal.GApplication], _root_.sn.gnome.glib.internal.gboolean], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._7]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GApplicationClass)
      inline def parent_class : _root_.sn.gnome.gobject.internal.GObjectClass = struct._1
      inline def parent_class_=(value: _root_.sn.gnome.gobject.internal.GObjectClass): Unit = (!struct.at1 = value)
      inline def startup : CFuncPtr1[Ptr[_root_.sn.gnome.gio.internal.GApplication], Unit] = struct._2
      inline def startup_=(value: CFuncPtr1[Ptr[_root_.sn.gnome.gio.internal.GApplication], Unit]): Unit = (!struct.at2 = value)
      inline def activate : CFuncPtr1[Ptr[_root_.sn.gnome.gio.internal.GApplication], Unit] = struct._3
      inline def activate_=(value: CFuncPtr1[Ptr[_root_.sn.gnome.gio.internal.GApplication], Unit]): Unit = (!struct.at3 = value)
      inline def open : CFuncPtr4[Ptr[_root_.sn.gnome.gio.internal.GApplication], Ptr[Ptr[_root_.sn.gnome.gio.internal.GFile]], _root_.sn.gnome.glib.internal.gint, Ptr[_root_.sn.gnome.glib.internal.gchar], Unit] = struct._4
      inline def open_=(value: CFuncPtr4[Ptr[_root_.sn.gnome.gio.internal.GApplication], Ptr[Ptr[_root_.sn.gnome.gio.internal.GFile]], _root_.sn.gnome.glib.internal.gint, Ptr[_root_.sn.gnome.glib.internal.gchar], Unit]): Unit = (!struct.at4 = value)
      inline def command_line : CFuncPtr2[Ptr[_root_.sn.gnome.gio.internal.GApplication], Ptr[_root_.sn.gnome.gio.internal.GApplicationCommandLine], CInt] = struct._5
      inline def command_line_=(value: CFuncPtr2[Ptr[_root_.sn.gnome.gio.internal.GApplication], Ptr[_root_.sn.gnome.gio.internal.GApplicationCommandLine], CInt]): Unit = (!struct.at5 = value)
      inline def local_command_line : CFuncPtr3[Ptr[_root_.sn.gnome.gio.internal.GApplication], Ptr[Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]], Ptr[CInt], _root_.sn.gnome.glib.internal.gboolean] = struct._6
      inline def local_command_line_=(value: CFuncPtr3[Ptr[_root_.sn.gnome.gio.internal.GApplication], Ptr[Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]], Ptr[CInt], _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at6 = value)
      inline def before_emit : CFuncPtr2[Ptr[_root_.sn.gnome.gio.internal.GApplication], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit] = struct._7
      inline def before_emit_=(value: CFuncPtr2[Ptr[_root_.sn.gnome.gio.internal.GApplication], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit]): Unit = (!struct.at7 = value)
      inline def after_emit : CFuncPtr2[Ptr[_root_.sn.gnome.gio.internal.GApplication], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit] = struct._8
      inline def after_emit_=(value: CFuncPtr2[Ptr[_root_.sn.gnome.gio.internal.GApplication], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit]): Unit = (!struct.at8 = value)
      inline def add_platform_data : CFuncPtr2[Ptr[_root_.sn.gnome.gio.internal.GApplication], Ptr[_root_.sn.gnome.glib.internal.GVariantBuilder], Unit] = struct._9
      inline def add_platform_data_=(value: CFuncPtr2[Ptr[_root_.sn.gnome.gio.internal.GApplication], Ptr[_root_.sn.gnome.glib.internal.GVariantBuilder], Unit]): Unit = (!struct.at9 = value)
      inline def quit_mainloop : CFuncPtr1[Ptr[_root_.sn.gnome.gio.internal.GApplication], Unit] = struct._10
      inline def quit_mainloop_=(value: CFuncPtr1[Ptr[_root_.sn.gnome.gio.internal.GApplication], Unit]): Unit = (!struct.at10 = value)
      inline def run_mainloop : CFuncPtr1[Ptr[_root_.sn.gnome.gio.internal.GApplication], Unit] = struct._11
      inline def run_mainloop_=(value: CFuncPtr1[Ptr[_root_.sn.gnome.gio.internal.GApplication], Unit]): Unit = (!struct.at11 = value)
      inline def shutdown : CFuncPtr1[Ptr[_root_.sn.gnome.gio.internal.GApplication], Unit] = struct._12
      inline def shutdown_=(value: CFuncPtr1[Ptr[_root_.sn.gnome.gio.internal.GApplication], Unit]): Unit = (!struct.at12 = value)
      inline def dbus_register : CFuncPtr4[Ptr[_root_.sn.gnome.gio.internal.GApplication], Ptr[_root_.sn.gnome.gio.internal.GDBusConnection], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean] = struct._13
      inline def dbus_register_=(value: CFuncPtr4[Ptr[_root_.sn.gnome.gio.internal.GApplication], Ptr[_root_.sn.gnome.gio.internal.GDBusConnection], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at13 = value)
      inline def dbus_unregister : CFuncPtr3[Ptr[_root_.sn.gnome.gio.internal.GApplication], Ptr[_root_.sn.gnome.gio.internal.GDBusConnection], Ptr[_root_.sn.gnome.glib.internal.gchar], Unit] = struct._14
      inline def dbus_unregister_=(value: CFuncPtr3[Ptr[_root_.sn.gnome.gio.internal.GApplication], Ptr[_root_.sn.gnome.gio.internal.GDBusConnection], Ptr[_root_.sn.gnome.glib.internal.gchar], Unit]): Unit = (!struct.at14 = value)
      inline def handle_local_options : CFuncPtr2[Ptr[_root_.sn.gnome.gio.internal.GApplication], Ptr[_root_.sn.gnome.glib.internal.GVariantDict], _root_.sn.gnome.glib.internal.gint] = struct._15
      inline def handle_local_options_=(value: CFuncPtr2[Ptr[_root_.sn.gnome.gio.internal.GApplication], Ptr[_root_.sn.gnome.glib.internal.GVariantDict], _root_.sn.gnome.glib.internal.gint]): Unit = (!struct.at15 = value)
      inline def name_lost : CFuncPtr1[Ptr[_root_.sn.gnome.gio.internal.GApplication], _root_.sn.gnome.glib.internal.gboolean] = struct._16
      inline def name_lost_=(value: CFuncPtr1[Ptr[_root_.sn.gnome.gio.internal.GApplication], _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at16 = value)
      inline def padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._7] = struct._17
      inline def padding_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._7]): Unit = (!struct.at17 = value)
    end extension
  
  // Allocates GApplicationClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GApplicationClass] = scala.scalanative.unsafe.alloc[GApplicationClass](1)
  def apply(parent_class : _root_.sn.gnome.gobject.internal.GObjectClass, startup : CFuncPtr1[Ptr[_root_.sn.gnome.gio.internal.GApplication], Unit], activate : CFuncPtr1[Ptr[_root_.sn.gnome.gio.internal.GApplication], Unit], open : CFuncPtr4[Ptr[_root_.sn.gnome.gio.internal.GApplication], Ptr[Ptr[_root_.sn.gnome.gio.internal.GFile]], _root_.sn.gnome.glib.internal.gint, Ptr[_root_.sn.gnome.glib.internal.gchar], Unit], command_line : CFuncPtr2[Ptr[_root_.sn.gnome.gio.internal.GApplication], Ptr[_root_.sn.gnome.gio.internal.GApplicationCommandLine], CInt], local_command_line : CFuncPtr3[Ptr[_root_.sn.gnome.gio.internal.GApplication], Ptr[Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]], Ptr[CInt], _root_.sn.gnome.glib.internal.gboolean], before_emit : CFuncPtr2[Ptr[_root_.sn.gnome.gio.internal.GApplication], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit], after_emit : CFuncPtr2[Ptr[_root_.sn.gnome.gio.internal.GApplication], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit], add_platform_data : CFuncPtr2[Ptr[_root_.sn.gnome.gio.internal.GApplication], Ptr[_root_.sn.gnome.glib.internal.GVariantBuilder], Unit], quit_mainloop : CFuncPtr1[Ptr[_root_.sn.gnome.gio.internal.GApplication], Unit], run_mainloop : CFuncPtr1[Ptr[_root_.sn.gnome.gio.internal.GApplication], Unit], shutdown : CFuncPtr1[Ptr[_root_.sn.gnome.gio.internal.GApplication], Unit], dbus_register : CFuncPtr4[Ptr[_root_.sn.gnome.gio.internal.GApplication], Ptr[_root_.sn.gnome.gio.internal.GDBusConnection], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], dbus_unregister : CFuncPtr3[Ptr[_root_.sn.gnome.gio.internal.GApplication], Ptr[_root_.sn.gnome.gio.internal.GDBusConnection], Ptr[_root_.sn.gnome.glib.internal.gchar], Unit], handle_local_options : CFuncPtr2[Ptr[_root_.sn.gnome.gio.internal.GApplication], Ptr[_root_.sn.gnome.glib.internal.GVariantDict], _root_.sn.gnome.glib.internal.gint], name_lost : CFuncPtr1[Ptr[_root_.sn.gnome.gio.internal.GApplication], _root_.sn.gnome.glib.internal.gboolean], padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._7])(using Zone): Ptr[GApplicationClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).startup = startup
    (!____ptr).activate = activate
    (!____ptr).open = open
    (!____ptr).command_line = command_line
    (!____ptr).local_command_line = local_command_line
    (!____ptr).before_emit = before_emit
    (!____ptr).after_emit = after_emit
    (!____ptr).add_platform_data = add_platform_data
    (!____ptr).quit_mainloop = quit_mainloop
    (!____ptr).run_mainloop = run_mainloop
    (!____ptr).shutdown = shutdown
    (!____ptr).dbus_register = dbus_register
    (!____ptr).dbus_unregister = dbus_unregister
    (!____ptr).handle_local_options = handle_local_options
    (!____ptr).name_lost = name_lost
    (!____ptr).padding = padding
    ____ptr