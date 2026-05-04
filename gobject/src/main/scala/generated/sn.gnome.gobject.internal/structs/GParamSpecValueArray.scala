package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GParamSpecValueArray: _instance: private #GParamSpec portion _spec: a #GParamSpec describing the elements contained in arrays of this property, may be %NULL _n_elements: if greater than 0, arrays of this property will always have this many elements

 * [bindgen] header: /usr/include/glib-2.0/gobject/gparamspecs.h
*/
opaque type GParamSpecValueArray = CStruct3[GParamSpec, Ptr[GParamSpec], _root_.sn.gnome.glib.internal.guint]

object GParamSpecValueArray:
  given _tag: Tag[GParamSpecValueArray] = Tag.materializeCStruct3Tag[GParamSpec, Ptr[GParamSpec], _root_.sn.gnome.glib.internal.guint]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GParamSpecValueArray)
      inline def parent_instance : GParamSpec = struct._1
      inline def parent_instance_=(value: GParamSpec): Unit = (!struct.at1 = value)
      inline def element_spec : Ptr[GParamSpec] = struct._2
      inline def element_spec_=(value: Ptr[GParamSpec]): Unit = (!struct.at2 = value)
      inline def fixed_n_elements : _root_.sn.gnome.glib.internal.guint = struct._3
      inline def fixed_n_elements_=(value: _root_.sn.gnome.glib.internal.guint): Unit = (!struct.at3 = value)
    end extension
  
  // Allocates GParamSpecValueArray on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GParamSpecValueArray] = scala.scalanative.unsafe.alloc[GParamSpecValueArray](1)
  def apply(parent_instance : GParamSpec, element_spec : Ptr[GParamSpec], fixed_n_elements : _root_.sn.gnome.glib.internal.guint)(using Zone): Ptr[GParamSpecValueArray] =
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).element_spec = element_spec
    (!____ptr).fixed_n_elements = fixed_n_elements
    ____ptr