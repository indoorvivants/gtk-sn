package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GParamSpecVariant: _instance: private #GParamSpec portion : a #GVariantType, or %NULL _value: a #GVariant, or %NULL
*/
opaque type _GParamSpecVariant = CStruct4[GParamSpec, Ptr[_root_.sn.gnome.glib.internal.GVariantType], Ptr[_root_.sn.gnome.glib.internal.GVariant], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]]

object _GParamSpecVariant:
  given _tag: Tag[_GParamSpecVariant] = Tag.materializeCStruct4Tag[GParamSpec, Ptr[_root_.sn.gnome.glib.internal.GVariantType], Ptr[_root_.sn.gnome.glib.internal.GVariant], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GParamSpecVariant)
      inline def parent_instance : GParamSpec = struct._1
      inline def parent_instance_=(value: GParamSpec): Unit = (!struct.at1 = value)
      inline def `type` : Ptr[_root_.sn.gnome.glib.internal.GVariantType] = struct._2
      inline def type_=(value: Ptr[_root_.sn.gnome.glib.internal.GVariantType]): Unit = (!struct.at2 = value)
      inline def default_value : Ptr[_root_.sn.gnome.glib.internal.GVariant] = struct._3
      inline def default_value_=(value: Ptr[_root_.sn.gnome.glib.internal.GVariant]): Unit = (!struct.at3 = value)
      inline def padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4] = struct._4
      inline def padding_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]): Unit = (!struct.at4 = value)
    end extension
  
  // Allocates _GParamSpecVariant on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GParamSpecVariant] = scala.scalanative.unsafe.alloc[_GParamSpecVariant](1)
  def apply(parent_instance : GParamSpec, `type` : Ptr[_root_.sn.gnome.glib.internal.GVariantType], default_value : Ptr[_root_.sn.gnome.glib.internal.GVariant], padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4])(using Zone): Ptr[_GParamSpecVariant] =
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).`type` = `type`
    (!____ptr).default_value = default_value
    (!____ptr).padding = padding
    ____ptr