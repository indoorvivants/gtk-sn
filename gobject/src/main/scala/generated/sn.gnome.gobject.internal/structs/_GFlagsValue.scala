package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GFlagsValue: : the flags value _name: the name of the value _nick: the nickname of the value
*/
opaque type _GFlagsValue = CStruct3[_root_.sn.gnome.glib.internal.guint, Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar]]

object _GFlagsValue:
  given _tag: Tag[_GFlagsValue] = Tag.materializeCStruct3Tag[_root_.sn.gnome.glib.internal.guint, Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GFlagsValue)
      inline def value : _root_.sn.gnome.glib.internal.guint = struct._1
      inline def value_=(value: _root_.sn.gnome.glib.internal.guint): Unit = (!struct.at1 = value)
      inline def value_name : Ptr[_root_.sn.gnome.glib.internal.gchar] = struct._2
      inline def value_name_=(value: Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = (!struct.at2 = value)
      inline def value_nick : Ptr[_root_.sn.gnome.glib.internal.gchar] = struct._3
      inline def value_nick_=(value: Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = (!struct.at3 = value)
    end extension
  
  // Allocates _GFlagsValue on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GFlagsValue] = scala.scalanative.unsafe.alloc[_GFlagsValue](1)
  def apply(value : _root_.sn.gnome.glib.internal.guint, value_name : Ptr[_root_.sn.gnome.glib.internal.gchar], value_nick : Ptr[_root_.sn.gnome.glib.internal.gchar])(using Zone): Ptr[_GFlagsValue] =
    val ____ptr = apply()
    (!____ptr).value = value
    (!____ptr).value_name = value_name
    (!____ptr).value_nick = value_nick
    ____ptr