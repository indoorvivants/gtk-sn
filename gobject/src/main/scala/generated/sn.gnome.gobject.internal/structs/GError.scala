package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.3: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GError = CStruct3[_root_.sn.gnome.glib.internal.GQuark, _root_.sn.gnome.glib.internal.gint, Ptr[_root_.sn.gnome.glib.internal.gchar]]

object GError:
  given _tag: Tag[GError] = Tag.materializeCStruct3Tag[_root_.sn.gnome.glib.internal.GQuark, _root_.sn.gnome.glib.internal.gint, Ptr[_root_.sn.gnome.glib.internal.gchar]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GError)
      inline def domain : _root_.sn.gnome.glib.internal.GQuark = struct._1
      inline def domain_=(value: _root_.sn.gnome.glib.internal.GQuark): Unit = (!struct.at1 = value)
      inline def code : _root_.sn.gnome.glib.internal.gint = struct._2
      inline def code_=(value: _root_.sn.gnome.glib.internal.gint): Unit = (!struct.at2 = value)
      inline def message : Ptr[_root_.sn.gnome.glib.internal.gchar] = struct._3
      inline def message_=(value: Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = (!struct.at3 = value)
    end extension
  
  // Allocates GError on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GError] = scala.scalanative.unsafe.alloc[GError](1)
  def apply(domain : _root_.sn.gnome.glib.internal.GQuark, code : _root_.sn.gnome.glib.internal.gint, message : Ptr[_root_.sn.gnome.glib.internal.gchar])(using Zone): Ptr[GError] =
    val ____ptr = apply()
    (!____ptr).domain = domain
    (!____ptr).code = code
    (!____ptr).message = message
    ____ptr