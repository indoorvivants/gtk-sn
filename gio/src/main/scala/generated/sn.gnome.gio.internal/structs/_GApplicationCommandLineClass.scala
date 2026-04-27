package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GApplicationCommandLineClass = CStruct6[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr2[Ptr[GApplicationCommandLine], Ptr[_root_.sn.gnome.glib.internal.gchar], Unit], CFuncPtr2[Ptr[GApplicationCommandLine], Ptr[_root_.sn.gnome.glib.internal.gchar], Unit], CFuncPtr1[Ptr[GApplicationCommandLine], Ptr[GInputStream]], CFuncPtr1[Ptr[GApplicationCommandLine], Unit], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat.Digit2[Nat._1, Nat._0]]]

object _GApplicationCommandLineClass:
  given _tag: Tag[_GApplicationCommandLineClass] = Tag.materializeCStruct6Tag[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr2[Ptr[GApplicationCommandLine], Ptr[_root_.sn.gnome.glib.internal.gchar], Unit], CFuncPtr2[Ptr[GApplicationCommandLine], Ptr[_root_.sn.gnome.glib.internal.gchar], Unit], CFuncPtr1[Ptr[GApplicationCommandLine], Ptr[GInputStream]], CFuncPtr1[Ptr[GApplicationCommandLine], Unit], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat.Digit2[Nat._1, Nat._0]]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GApplicationCommandLineClass)
      inline def parent_class : _root_.sn.gnome.gobject.internal.GObjectClass = struct._1
      inline def parent_class_=(value: _root_.sn.gnome.gobject.internal.GObjectClass): Unit = (!struct.at1 = value)
      inline def print_literal : CFuncPtr2[Ptr[GApplicationCommandLine], Ptr[_root_.sn.gnome.glib.internal.gchar], Unit] = struct._2
      inline def print_literal_=(value: CFuncPtr2[Ptr[GApplicationCommandLine], Ptr[_root_.sn.gnome.glib.internal.gchar], Unit]): Unit = (!struct.at2 = value)
      inline def printerr_literal : CFuncPtr2[Ptr[GApplicationCommandLine], Ptr[_root_.sn.gnome.glib.internal.gchar], Unit] = struct._3
      inline def printerr_literal_=(value: CFuncPtr2[Ptr[GApplicationCommandLine], Ptr[_root_.sn.gnome.glib.internal.gchar], Unit]): Unit = (!struct.at3 = value)
      inline def get_stdin : CFuncPtr1[Ptr[GApplicationCommandLine], Ptr[GInputStream]] = struct._4
      inline def get_stdin_=(value: CFuncPtr1[Ptr[GApplicationCommandLine], Ptr[GInputStream]]): Unit = (!struct.at4 = value)
      inline def done : CFuncPtr1[Ptr[GApplicationCommandLine], Unit] = struct._5
      inline def done_=(value: CFuncPtr1[Ptr[GApplicationCommandLine], Unit]): Unit = (!struct.at5 = value)
      inline def padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat.Digit2[Nat._1, Nat._0]] = struct._6
      inline def padding_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat.Digit2[Nat._1, Nat._0]]): Unit = (!struct.at6 = value)
    end extension
  
  // Allocates _GApplicationCommandLineClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GApplicationCommandLineClass] = scala.scalanative.unsafe.alloc[_GApplicationCommandLineClass](1)
  def apply(parent_class : _root_.sn.gnome.gobject.internal.GObjectClass, print_literal : CFuncPtr2[Ptr[GApplicationCommandLine], Ptr[_root_.sn.gnome.glib.internal.gchar], Unit], printerr_literal : CFuncPtr2[Ptr[GApplicationCommandLine], Ptr[_root_.sn.gnome.glib.internal.gchar], Unit], get_stdin : CFuncPtr1[Ptr[GApplicationCommandLine], Ptr[GInputStream]], done : CFuncPtr1[Ptr[GApplicationCommandLine], Unit], padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat.Digit2[Nat._1, Nat._0]])(using Zone): Ptr[_GApplicationCommandLineClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).print_literal = print_literal
    (!____ptr).printerr_literal = printerr_literal
    (!____ptr).get_stdin = get_stdin
    (!____ptr).done = done
    (!____ptr).padding = padding
    ____ptr