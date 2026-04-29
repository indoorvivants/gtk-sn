package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GActionEntry = CStruct6[Ptr[_root_.sn.gnome.glib.internal.gchar], CFuncPtr3[Ptr[GSimpleAction], Ptr[_root_.sn.gnome.glib.internal.GVariant], _root_.sn.gnome.glib.internal.gpointer, Unit], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], CFuncPtr3[Ptr[GSimpleAction], Ptr[_root_.sn.gnome.glib.internal.GVariant], _root_.sn.gnome.glib.internal.gpointer, Unit], CArray[_root_.sn.gnome.glib.internal.gsize, Nat._3]]

object _GActionEntry:
  given _tag: Tag[_GActionEntry] = Tag.materializeCStruct6Tag[Ptr[_root_.sn.gnome.glib.internal.gchar], CFuncPtr3[Ptr[GSimpleAction], Ptr[_root_.sn.gnome.glib.internal.GVariant], _root_.sn.gnome.glib.internal.gpointer, Unit], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], CFuncPtr3[Ptr[GSimpleAction], Ptr[_root_.sn.gnome.glib.internal.GVariant], _root_.sn.gnome.glib.internal.gpointer, Unit], CArray[_root_.sn.gnome.glib.internal.gsize, Nat._3]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GActionEntry)
      inline def name : Ptr[_root_.sn.gnome.glib.internal.gchar] = struct._1
      inline def name_=(value: Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = (!struct.at1 = value)
      inline def activate : CFuncPtr3[Ptr[GSimpleAction], Ptr[_root_.sn.gnome.glib.internal.GVariant], _root_.sn.gnome.glib.internal.gpointer, Unit] = struct._2
      inline def activate_=(value: CFuncPtr3[Ptr[GSimpleAction], Ptr[_root_.sn.gnome.glib.internal.GVariant], _root_.sn.gnome.glib.internal.gpointer, Unit]): Unit = (!struct.at2 = value)
      inline def parameter_type : Ptr[_root_.sn.gnome.glib.internal.gchar] = struct._3
      inline def parameter_type_=(value: Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = (!struct.at3 = value)
      inline def state : Ptr[_root_.sn.gnome.glib.internal.gchar] = struct._4
      inline def state_=(value: Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = (!struct.at4 = value)
      inline def change_state : CFuncPtr3[Ptr[GSimpleAction], Ptr[_root_.sn.gnome.glib.internal.GVariant], _root_.sn.gnome.glib.internal.gpointer, Unit] = struct._5
      inline def change_state_=(value: CFuncPtr3[Ptr[GSimpleAction], Ptr[_root_.sn.gnome.glib.internal.GVariant], _root_.sn.gnome.glib.internal.gpointer, Unit]): Unit = (!struct.at5 = value)
      inline def padding : CArray[_root_.sn.gnome.glib.internal.gsize, Nat._3] = struct._6
      inline def padding_=(value: CArray[_root_.sn.gnome.glib.internal.gsize, Nat._3]): Unit = (!struct.at6 = value)
    end extension
  
  // Allocates _GActionEntry on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GActionEntry] = scala.scalanative.unsafe.alloc[_GActionEntry](1)
  def apply(name : Ptr[_root_.sn.gnome.glib.internal.gchar], activate : CFuncPtr3[Ptr[GSimpleAction], Ptr[_root_.sn.gnome.glib.internal.GVariant], _root_.sn.gnome.glib.internal.gpointer, Unit], parameter_type : Ptr[_root_.sn.gnome.glib.internal.gchar], state : Ptr[_root_.sn.gnome.glib.internal.gchar], change_state : CFuncPtr3[Ptr[GSimpleAction], Ptr[_root_.sn.gnome.glib.internal.GVariant], _root_.sn.gnome.glib.internal.gpointer, Unit], padding : CArray[_root_.sn.gnome.glib.internal.gsize, Nat._3])(using Zone): Ptr[_GActionEntry] =
    val ____ptr = apply()
    (!____ptr).name = name
    (!____ptr).activate = activate
    (!____ptr).parameter_type = parameter_type
    (!____ptr).state = state
    (!____ptr).change_state = change_state
    (!____ptr).padding = padding
    ____ptr