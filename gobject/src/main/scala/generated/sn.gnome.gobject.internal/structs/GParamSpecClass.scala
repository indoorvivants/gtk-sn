package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GParamSpecClass: _type_class: the parent class _type: the #GValue type for this parameter : The instance finalization function (optional), should chain up to the finalize method of the parent class. _set_default: Resets a to the default value for this type (recommended, the default is g_value_reset()), see g_param_value_set_default(). _validate: Ensures that the contents of comply with the specifications set out by this type (optional), see g_param_value_validate(). _cmp: Compares with according to this type (recommended, the default is memcmp()), see g_param_values_cmp(). _is_valid: Checks if contents of comply with the specifications set out by this type, without modifying the value. This vfunc is optional. If it isn't set, GObject will use _validate. Since 2.74
*/
opaque type GParamSpecClass = CStruct8[GTypeClass, GType, CFuncPtr1[Ptr[GParamSpec], Unit], CFuncPtr2[Ptr[GParamSpec], Ptr[GValue], Unit], CFuncPtr2[Ptr[GParamSpec], Ptr[GValue], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr3[Ptr[GParamSpec], Ptr[GValue], Ptr[GValue], _root_.sn.gnome.glib.internal.gint], CFuncPtr2[Ptr[GParamSpec], Ptr[GValue], _root_.sn.gnome.glib.internal.gboolean], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._3]]

object GParamSpecClass:
  given _tag: Tag[GParamSpecClass] = Tag.materializeCStruct8Tag[GTypeClass, GType, CFuncPtr1[Ptr[GParamSpec], Unit], CFuncPtr2[Ptr[GParamSpec], Ptr[GValue], Unit], CFuncPtr2[Ptr[GParamSpec], Ptr[GValue], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr3[Ptr[GParamSpec], Ptr[GValue], Ptr[GValue], _root_.sn.gnome.glib.internal.gint], CFuncPtr2[Ptr[GParamSpec], Ptr[GValue], _root_.sn.gnome.glib.internal.gboolean], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._3]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GParamSpecClass)
      inline def g_type_class : GTypeClass = struct._1
      inline def g_type_class_=(value: GTypeClass): Unit = (!struct.at1 = value)
      inline def value_type : GType = struct._2
      inline def value_type_=(value: GType): Unit = (!struct.at2 = value)
      inline def finalize : CFuncPtr1[Ptr[GParamSpec], Unit] = struct._3
      inline def finalize_=(value: CFuncPtr1[Ptr[GParamSpec], Unit]): Unit = (!struct.at3 = value)
      inline def value_set_default : CFuncPtr2[Ptr[GParamSpec], Ptr[GValue], Unit] = struct._4
      inline def value_set_default_=(value: CFuncPtr2[Ptr[GParamSpec], Ptr[GValue], Unit]): Unit = (!struct.at4 = value)
      inline def value_validate : CFuncPtr2[Ptr[GParamSpec], Ptr[GValue], _root_.sn.gnome.glib.internal.gboolean] = struct._5
      inline def value_validate_=(value: CFuncPtr2[Ptr[GParamSpec], Ptr[GValue], _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at5 = value)
      inline def values_cmp : CFuncPtr3[Ptr[GParamSpec], Ptr[GValue], Ptr[GValue], _root_.sn.gnome.glib.internal.gint] = struct._6
      inline def values_cmp_=(value: CFuncPtr3[Ptr[GParamSpec], Ptr[GValue], Ptr[GValue], _root_.sn.gnome.glib.internal.gint]): Unit = (!struct.at6 = value)
      inline def value_is_valid : CFuncPtr2[Ptr[GParamSpec], Ptr[GValue], _root_.sn.gnome.glib.internal.gboolean] = struct._7
      inline def value_is_valid_=(value: CFuncPtr2[Ptr[GParamSpec], Ptr[GValue], _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at7 = value)
      inline def dummy : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._3] = struct._8
      inline def dummy_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._3]): Unit = (!struct.at8 = value)
    end extension
  
  // Allocates GParamSpecClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GParamSpecClass] = scala.scalanative.unsafe.alloc[GParamSpecClass](1)
  def apply(g_type_class : GTypeClass, value_type : GType, finalize : CFuncPtr1[Ptr[GParamSpec], Unit], value_set_default : CFuncPtr2[Ptr[GParamSpec], Ptr[GValue], Unit], value_validate : CFuncPtr2[Ptr[GParamSpec], Ptr[GValue], _root_.sn.gnome.glib.internal.gboolean], values_cmp : CFuncPtr3[Ptr[GParamSpec], Ptr[GValue], Ptr[GValue], _root_.sn.gnome.glib.internal.gint], value_is_valid : CFuncPtr2[Ptr[GParamSpec], Ptr[GValue], _root_.sn.gnome.glib.internal.gboolean], dummy : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._3])(using Zone): Ptr[GParamSpecClass] =
    val ____ptr = apply()
    (!____ptr).g_type_class = g_type_class
    (!____ptr).value_type = value_type
    (!____ptr).finalize = finalize
    (!____ptr).value_set_default = value_set_default
    (!____ptr).value_validate = value_validate
    (!____ptr).values_cmp = values_cmp
    (!____ptr).value_is_valid = value_is_valid
    (!____ptr).dummy = dummy
    ____ptr