package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GParamSpecString: _instance: private #GParamSpec portion _value: default value for the property specified _first: a string containing the allowed values for the first byte _nth: a string containing the allowed values for the subsequent bytes : the replacement byte for bytes which don't match _first or _nth. _fold_if_empty: replace empty string by %NULL _non_null: replace %NULL strings by an empty string
*/
opaque type GParamSpecString = CStruct7[GParamSpec, Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.gchar, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint]

object GParamSpecString:
  given _tag: Tag[GParamSpecString] = Tag.materializeCStruct7Tag[GParamSpec, Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.gchar, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GParamSpecString)
      inline def parent_instance : GParamSpec = struct._1
      inline def parent_instance_=(value: GParamSpec): Unit = (!struct.at1 = value)
      inline def default_value : Ptr[_root_.sn.gnome.glib.internal.gchar] = struct._2
      inline def default_value_=(value: Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = (!struct.at2 = value)
      inline def cset_first : Ptr[_root_.sn.gnome.glib.internal.gchar] = struct._3
      inline def cset_first_=(value: Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = (!struct.at3 = value)
      inline def cset_nth : Ptr[_root_.sn.gnome.glib.internal.gchar] = struct._4
      inline def cset_nth_=(value: Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = (!struct.at4 = value)
      inline def substitutor : _root_.sn.gnome.glib.internal.gchar = struct._5
      inline def substitutor_=(value: _root_.sn.gnome.glib.internal.gchar): Unit = (!struct.at5 = value)
      inline def null_fold_if_empty : _root_.sn.gnome.glib.internal.guint = struct._6
      inline def null_fold_if_empty_=(value: _root_.sn.gnome.glib.internal.guint): Unit = (!struct.at6 = value)
      inline def ensure_non_null : _root_.sn.gnome.glib.internal.guint = struct._7
      inline def ensure_non_null_=(value: _root_.sn.gnome.glib.internal.guint): Unit = (!struct.at7 = value)
    end extension
  
  // Allocates GParamSpecString on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GParamSpecString] = scala.scalanative.unsafe.alloc[GParamSpecString](1)
  def apply(parent_instance : GParamSpec, default_value : Ptr[_root_.sn.gnome.glib.internal.gchar], cset_first : Ptr[_root_.sn.gnome.glib.internal.gchar], cset_nth : Ptr[_root_.sn.gnome.glib.internal.gchar], substitutor : _root_.sn.gnome.glib.internal.gchar, null_fold_if_empty : _root_.sn.gnome.glib.internal.guint, ensure_non_null : _root_.sn.gnome.glib.internal.guint)(using Zone): Ptr[GParamSpecString] =
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).default_value = default_value
    (!____ptr).cset_first = cset_first
    (!____ptr).cset_nth = cset_nth
    (!____ptr).substitutor = substitutor
    (!____ptr).null_fold_if_empty = null_fold_if_empty
    (!____ptr).ensure_non_null = ensure_non_null
    ____ptr