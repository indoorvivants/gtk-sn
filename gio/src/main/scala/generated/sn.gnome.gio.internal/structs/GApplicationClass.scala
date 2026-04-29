package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GApplicationClass = CArray[CChar, Nat.Digit3[Nat._3, Nat._1, Nat._2]]

object GApplicationClass:
  given _tag: Tag[GApplicationClass] = Tag.CArray[CChar, Nat.Digit3[Nat._3, Nat._1, Nat._2]](Tag.Byte, Tag.Digit3[Nat._3, Nat._1, Nat._2](Tag.Nat3, Tag.Nat1, Tag.Nat2))
  
  export fields.*
  private[internal] object fields:
    extension (struct: GApplicationClass)
      inline def parent_class: _root_.sn.gnome.gobject.internal.GObjectClass = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GObjectClass]]
      inline def parent_class_=(value: _root_.sn.gnome.gobject.internal.GObjectClass): Unit = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GObjectClass]] = value
      inline def startup: CFuncPtr1[Ptr[GApplication], Unit] = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GApplication], Unit]]]
      inline def startup_=(value: CFuncPtr1[Ptr[GApplication], Unit]): Unit = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GApplication], Unit]]] = value
      inline def activate: CFuncPtr1[Ptr[GApplication], Unit] = !struct.at(offsets(2)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GApplication], Unit]]]
      inline def activate_=(value: CFuncPtr1[Ptr[GApplication], Unit]): Unit = !struct.at(offsets(2)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GApplication], Unit]]] = value
      inline def open: CFuncPtr4[Ptr[GApplication], Ptr[Ptr[GFile]], _root_.sn.gnome.glib.internal.gint, Ptr[_root_.sn.gnome.glib.internal.gchar], Unit] = !struct.at(offsets(3)).asInstanceOf[Ptr[CFuncPtr4[Ptr[GApplication], Ptr[Ptr[GFile]], _root_.sn.gnome.glib.internal.gint, Ptr[_root_.sn.gnome.glib.internal.gchar], Unit]]]
      inline def open_=(value: CFuncPtr4[Ptr[GApplication], Ptr[Ptr[GFile]], _root_.sn.gnome.glib.internal.gint, Ptr[_root_.sn.gnome.glib.internal.gchar], Unit]): Unit = !struct.at(offsets(3)).asInstanceOf[Ptr[CFuncPtr4[Ptr[GApplication], Ptr[Ptr[GFile]], _root_.sn.gnome.glib.internal.gint, Ptr[_root_.sn.gnome.glib.internal.gchar], Unit]]] = value
      inline def command_line: CFuncPtr2[Ptr[GApplication], Ptr[GApplicationCommandLine], CInt] = !struct.at(offsets(4)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GApplication], Ptr[GApplicationCommandLine], CInt]]]
      inline def command_line_=(value: CFuncPtr2[Ptr[GApplication], Ptr[GApplicationCommandLine], CInt]): Unit = !struct.at(offsets(4)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GApplication], Ptr[GApplicationCommandLine], CInt]]] = value
      inline def local_command_line: CFuncPtr3[Ptr[GApplication], Ptr[Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]], Ptr[CInt], _root_.sn.gnome.glib.internal.gboolean] = !struct.at(offsets(5)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GApplication], Ptr[Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]], Ptr[CInt], _root_.sn.gnome.glib.internal.gboolean]]]
      inline def local_command_line_=(value: CFuncPtr3[Ptr[GApplication], Ptr[Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]], Ptr[CInt], _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at(offsets(5)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GApplication], Ptr[Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]], Ptr[CInt], _root_.sn.gnome.glib.internal.gboolean]]] = value
      inline def before_emit: CFuncPtr2[Ptr[GApplication], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit] = !struct.at(offsets(6)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GApplication], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit]]]
      inline def before_emit_=(value: CFuncPtr2[Ptr[GApplication], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit]): Unit = !struct.at(offsets(6)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GApplication], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit]]] = value
      inline def after_emit: CFuncPtr2[Ptr[GApplication], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit] = !struct.at(offsets(7)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GApplication], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit]]]
      inline def after_emit_=(value: CFuncPtr2[Ptr[GApplication], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit]): Unit = !struct.at(offsets(7)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GApplication], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit]]] = value
      inline def add_platform_data: CFuncPtr2[Ptr[GApplication], Ptr[_root_.sn.gnome.glib.internal.GVariantBuilder], Unit] = !struct.at(offsets(8)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GApplication], Ptr[_root_.sn.gnome.glib.internal.GVariantBuilder], Unit]]]
      inline def add_platform_data_=(value: CFuncPtr2[Ptr[GApplication], Ptr[_root_.sn.gnome.glib.internal.GVariantBuilder], Unit]): Unit = !struct.at(offsets(8)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GApplication], Ptr[_root_.sn.gnome.glib.internal.GVariantBuilder], Unit]]] = value
      inline def quit_mainloop: CFuncPtr1[Ptr[GApplication], Unit] = !struct.at(offsets(9)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GApplication], Unit]]]
      inline def quit_mainloop_=(value: CFuncPtr1[Ptr[GApplication], Unit]): Unit = !struct.at(offsets(9)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GApplication], Unit]]] = value
      inline def run_mainloop: CFuncPtr1[Ptr[GApplication], Unit] = !struct.at(offsets(10)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GApplication], Unit]]]
      inline def run_mainloop_=(value: CFuncPtr1[Ptr[GApplication], Unit]): Unit = !struct.at(offsets(10)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GApplication], Unit]]] = value
      inline def shutdown: CFuncPtr1[Ptr[GApplication], Unit] = !struct.at(offsets(11)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GApplication], Unit]]]
      inline def shutdown_=(value: CFuncPtr1[Ptr[GApplication], Unit]): Unit = !struct.at(offsets(11)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GApplication], Unit]]] = value
      inline def dbus_register: CFuncPtr4[Ptr[GApplication], Ptr[GDBusConnection], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean] = !struct.at(offsets(12)).asInstanceOf[Ptr[CFuncPtr4[Ptr[GApplication], Ptr[GDBusConnection], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]]]
      inline def dbus_register_=(value: CFuncPtr4[Ptr[GApplication], Ptr[GDBusConnection], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at(offsets(12)).asInstanceOf[Ptr[CFuncPtr4[Ptr[GApplication], Ptr[GDBusConnection], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]]] = value
      inline def dbus_unregister: CFuncPtr3[Ptr[GApplication], Ptr[GDBusConnection], Ptr[_root_.sn.gnome.glib.internal.gchar], Unit] = !struct.at(offsets(13)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GApplication], Ptr[GDBusConnection], Ptr[_root_.sn.gnome.glib.internal.gchar], Unit]]]
      inline def dbus_unregister_=(value: CFuncPtr3[Ptr[GApplication], Ptr[GDBusConnection], Ptr[_root_.sn.gnome.glib.internal.gchar], Unit]): Unit = !struct.at(offsets(13)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GApplication], Ptr[GDBusConnection], Ptr[_root_.sn.gnome.glib.internal.gchar], Unit]]] = value
      inline def handle_local_options: CFuncPtr2[Ptr[GApplication], Ptr[_root_.sn.gnome.glib.internal.GVariantDict], _root_.sn.gnome.glib.internal.gint] = !struct.at(offsets(14)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GApplication], Ptr[_root_.sn.gnome.glib.internal.GVariantDict], _root_.sn.gnome.glib.internal.gint]]]
      inline def handle_local_options_=(value: CFuncPtr2[Ptr[GApplication], Ptr[_root_.sn.gnome.glib.internal.GVariantDict], _root_.sn.gnome.glib.internal.gint]): Unit = !struct.at(offsets(14)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GApplication], Ptr[_root_.sn.gnome.glib.internal.GVariantDict], _root_.sn.gnome.glib.internal.gint]]] = value
      inline def name_lost: CFuncPtr1[Ptr[GApplication], _root_.sn.gnome.glib.internal.gboolean] = !struct.at(offsets(15)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GApplication], _root_.sn.gnome.glib.internal.gboolean]]]
      inline def name_lost_=(value: CFuncPtr1[Ptr[GApplication], _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at(offsets(15)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GApplication], _root_.sn.gnome.glib.internal.gboolean]]] = value
      inline def padding: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._7] = !struct.at(offsets(16)).asInstanceOf[Ptr[CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._7]]]
      inline def padding_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._7]): Unit = !struct.at(offsets(16)).asInstanceOf[Ptr[CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._7]]] = value
    end extension
  
  // Allocates GApplicationClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GApplicationClass] = scala.scalanative.unsafe.alloc[GApplicationClass](1)
  def apply(parent_class : _root_.sn.gnome.gobject.internal.GObjectClass, startup : CFuncPtr1[Ptr[GApplication], Unit], activate : CFuncPtr1[Ptr[GApplication], Unit], open : CFuncPtr4[Ptr[GApplication], Ptr[Ptr[GFile]], _root_.sn.gnome.glib.internal.gint, Ptr[_root_.sn.gnome.glib.internal.gchar], Unit], command_line : CFuncPtr2[Ptr[GApplication], Ptr[GApplicationCommandLine], CInt], local_command_line : CFuncPtr3[Ptr[GApplication], Ptr[Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]], Ptr[CInt], _root_.sn.gnome.glib.internal.gboolean], before_emit : CFuncPtr2[Ptr[GApplication], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit], after_emit : CFuncPtr2[Ptr[GApplication], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit], add_platform_data : CFuncPtr2[Ptr[GApplication], Ptr[_root_.sn.gnome.glib.internal.GVariantBuilder], Unit], quit_mainloop : CFuncPtr1[Ptr[GApplication], Unit], run_mainloop : CFuncPtr1[Ptr[GApplication], Unit], shutdown : CFuncPtr1[Ptr[GApplication], Unit], dbus_register : CFuncPtr4[Ptr[GApplication], Ptr[GDBusConnection], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean], dbus_unregister : CFuncPtr3[Ptr[GApplication], Ptr[GDBusConnection], Ptr[_root_.sn.gnome.glib.internal.gchar], Unit], handle_local_options : CFuncPtr2[Ptr[GApplication], Ptr[_root_.sn.gnome.glib.internal.GVariantDict], _root_.sn.gnome.glib.internal.gint], name_lost : CFuncPtr1[Ptr[GApplication], _root_.sn.gnome.glib.internal.gboolean], padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._7])(using Zone): Ptr[GApplicationClass] =
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
  
  val offsets: Array[Int] =
    val res = Array.ofDim[Int](17)
    def align(offset: Int, alignment: Int) = {
      val alignmentMask = alignment - 1
      val padding =
        if ((offset & alignmentMask) == 0) 0
        else alignment - (offset & alignmentMask)
      offset + padding
    }
    
    res(0) = align(0, alignmentof[_root_.sn.gnome.gobject.internal.GObjectClass].toInt)
    res(1) = align(res(0) + sizeof[_root_.sn.gnome.gobject.internal.GObjectClass].toInt, alignmentof[CFuncPtr1[Ptr[GApplication], Unit]].toInt)
    res(2) = align(res(1) + sizeof[CFuncPtr1[Ptr[GApplication], Unit]].toInt, alignmentof[CFuncPtr1[Ptr[GApplication], Unit]].toInt)
    res(3) = align(res(2) + sizeof[CFuncPtr1[Ptr[GApplication], Unit]].toInt, alignmentof[CFuncPtr4[Ptr[GApplication], Ptr[Ptr[GFile]], _root_.sn.gnome.glib.internal.gint, Ptr[_root_.sn.gnome.glib.internal.gchar], Unit]].toInt)
    res(4) = align(res(3) + sizeof[CFuncPtr4[Ptr[GApplication], Ptr[Ptr[GFile]], _root_.sn.gnome.glib.internal.gint, Ptr[_root_.sn.gnome.glib.internal.gchar], Unit]].toInt, alignmentof[CFuncPtr2[Ptr[GApplication], Ptr[GApplicationCommandLine], CInt]].toInt)
    res(5) = align(res(4) + sizeof[CFuncPtr2[Ptr[GApplication], Ptr[GApplicationCommandLine], CInt]].toInt, alignmentof[CFuncPtr3[Ptr[GApplication], Ptr[Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]], Ptr[CInt], _root_.sn.gnome.glib.internal.gboolean]].toInt)
    res(6) = align(res(5) + sizeof[CFuncPtr3[Ptr[GApplication], Ptr[Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]], Ptr[CInt], _root_.sn.gnome.glib.internal.gboolean]].toInt, alignmentof[CFuncPtr2[Ptr[GApplication], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit]].toInt)
    res(7) = align(res(6) + sizeof[CFuncPtr2[Ptr[GApplication], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit]].toInt, alignmentof[CFuncPtr2[Ptr[GApplication], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit]].toInt)
    res(8) = align(res(7) + sizeof[CFuncPtr2[Ptr[GApplication], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit]].toInt, alignmentof[CFuncPtr2[Ptr[GApplication], Ptr[_root_.sn.gnome.glib.internal.GVariantBuilder], Unit]].toInt)
    res(9) = align(res(8) + sizeof[CFuncPtr2[Ptr[GApplication], Ptr[_root_.sn.gnome.glib.internal.GVariantBuilder], Unit]].toInt, alignmentof[CFuncPtr1[Ptr[GApplication], Unit]].toInt)
    res(10) = align(res(9) + sizeof[CFuncPtr1[Ptr[GApplication], Unit]].toInt, alignmentof[CFuncPtr1[Ptr[GApplication], Unit]].toInt)
    res(11) = align(res(10) + sizeof[CFuncPtr1[Ptr[GApplication], Unit]].toInt, alignmentof[CFuncPtr1[Ptr[GApplication], Unit]].toInt)
    res(12) = align(res(11) + sizeof[CFuncPtr1[Ptr[GApplication], Unit]].toInt, alignmentof[CFuncPtr4[Ptr[GApplication], Ptr[GDBusConnection], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]].toInt)
    res(13) = align(res(12) + sizeof[CFuncPtr4[Ptr[GApplication], Ptr[GDBusConnection], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gboolean]].toInt, alignmentof[CFuncPtr3[Ptr[GApplication], Ptr[GDBusConnection], Ptr[_root_.sn.gnome.glib.internal.gchar], Unit]].toInt)
    res(14) = align(res(13) + sizeof[CFuncPtr3[Ptr[GApplication], Ptr[GDBusConnection], Ptr[_root_.sn.gnome.glib.internal.gchar], Unit]].toInt, alignmentof[CFuncPtr2[Ptr[GApplication], Ptr[_root_.sn.gnome.glib.internal.GVariantDict], _root_.sn.gnome.glib.internal.gint]].toInt)
    res(15) = align(res(14) + sizeof[CFuncPtr2[Ptr[GApplication], Ptr[_root_.sn.gnome.glib.internal.GVariantDict], _root_.sn.gnome.glib.internal.gint]].toInt, alignmentof[CFuncPtr1[Ptr[GApplication], _root_.sn.gnome.glib.internal.gboolean]].toInt)
    res(16) = align(res(15) + sizeof[CFuncPtr1[Ptr[GApplication], _root_.sn.gnome.glib.internal.gboolean]].toInt, alignmentof[_root_.sn.gnome.glib.internal.gpointer].toInt)
    res
  end offsets