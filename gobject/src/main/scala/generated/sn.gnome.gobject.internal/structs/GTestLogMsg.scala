package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.3: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GTestLogMsg = CStruct5[_root_.sn.gnome.glib.internal.GTestLogType, _root_.sn.gnome.glib.internal.guint, Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]], _root_.sn.gnome.glib.internal.guint, Ptr[Double]]

object GTestLogMsg:
  given _tag: Tag[GTestLogMsg] = Tag.materializeCStruct5Tag[_root_.sn.gnome.glib.internal.GTestLogType, _root_.sn.gnome.glib.internal.guint, Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]], _root_.sn.gnome.glib.internal.guint, Ptr[Double]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GTestLogMsg)
      inline def log_type : _root_.sn.gnome.glib.internal.GTestLogType = struct._1
      inline def log_type_=(value: _root_.sn.gnome.glib.internal.GTestLogType): Unit = (!struct.at1 = value)
      inline def n_strings : _root_.sn.gnome.glib.internal.guint = struct._2
      inline def n_strings_=(value: _root_.sn.gnome.glib.internal.guint): Unit = (!struct.at2 = value)
      inline def strings : Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]] = struct._3
      inline def strings_=(value: Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]): Unit = (!struct.at3 = value)
      inline def n_nums : _root_.sn.gnome.glib.internal.guint = struct._4
      inline def n_nums_=(value: _root_.sn.gnome.glib.internal.guint): Unit = (!struct.at4 = value)
      inline def nums : Ptr[Double] = struct._5
      inline def nums_=(value: Ptr[Double]): Unit = (!struct.at5 = value)
    end extension
  
  // Allocates GTestLogMsg on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GTestLogMsg] = scala.scalanative.unsafe.alloc[GTestLogMsg](1)
  def apply(log_type : _root_.sn.gnome.glib.internal.GTestLogType, n_strings : _root_.sn.gnome.glib.internal.guint, strings : Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]], n_nums : _root_.sn.gnome.glib.internal.guint, nums : Ptr[Double])(using Zone): Ptr[GTestLogMsg] =
    val ____ptr = apply()
    (!____ptr).log_type = log_type
    (!____ptr).n_strings = n_strings
    (!____ptr).strings = strings
    (!____ptr).n_nums = n_nums
    (!____ptr).nums = nums
    ____ptr