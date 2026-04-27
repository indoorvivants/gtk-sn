package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GObjectClass: _type_class: the parent class : the function is called by g_object_new () to complete the object initialization after all the construction properties are set. The first thing a implementation must do is chain up to the of the parent class. Overriding should be rarely needed, e.g. to handle construct properties, or to implement singletons.
*/
opaque type _GObjectClass = CStruct15[GTypeClass, Ptr[Byte], CFuncPtr3[GType, _root_.sn.gnome.glib.internal.guint, Ptr[GObjectConstructParam], Ptr[GObject]], CFuncPtr4[Ptr[GObject], _root_.sn.gnome.glib.internal.guint, Ptr[GValue], Ptr[GParamSpec], Unit], CFuncPtr4[Ptr[GObject], _root_.sn.gnome.glib.internal.guint, Ptr[GValue], Ptr[GParamSpec], Unit], CFuncPtr1[Ptr[GObject], Unit], CFuncPtr1[Ptr[GObject], Unit], CFuncPtr3[Ptr[GObject], _root_.sn.gnome.glib.internal.guint, Ptr[Ptr[GParamSpec]], Unit], CFuncPtr2[Ptr[GObject], Ptr[GParamSpec], Unit], CFuncPtr1[Ptr[GObject], Unit], _root_.sn.gnome.glib.internal.gsize, _root_.sn.gnome.glib.internal.gsize, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gsize, CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._3]]

object _GObjectClass:
  given _tag: Tag[_GObjectClass] = Tag.materializeCStruct15Tag[GTypeClass, Ptr[Byte], CFuncPtr3[GType, _root_.sn.gnome.glib.internal.guint, Ptr[GObjectConstructParam], Ptr[GObject]], CFuncPtr4[Ptr[GObject], _root_.sn.gnome.glib.internal.guint, Ptr[GValue], Ptr[GParamSpec], Unit], CFuncPtr4[Ptr[GObject], _root_.sn.gnome.glib.internal.guint, Ptr[GValue], Ptr[GParamSpec], Unit], CFuncPtr1[Ptr[GObject], Unit], CFuncPtr1[Ptr[GObject], Unit], CFuncPtr3[Ptr[GObject], _root_.sn.gnome.glib.internal.guint, Ptr[Ptr[GParamSpec]], Unit], CFuncPtr2[Ptr[GObject], Ptr[GParamSpec], Unit], CFuncPtr1[Ptr[GObject], Unit], _root_.sn.gnome.glib.internal.gsize, _root_.sn.gnome.glib.internal.gsize, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gsize, CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._3]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GObjectClass)
      inline def g_type_class : GTypeClass = struct._1
      inline def g_type_class_=(value: GTypeClass): Unit = (!struct.at1 = value)
      inline def construct_properties : Ptr[_root_.sn.gnome.glib.internal.GSList] = struct._2.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.GSList]]
      inline def construct_properties_=(value: Ptr[_root_.sn.gnome.glib.internal.GSList]): Unit = (!struct.at2 = value.asInstanceOf[Ptr[Byte]])
      inline def constructor : CFuncPtr3[GType, _root_.sn.gnome.glib.internal.guint, Ptr[GObjectConstructParam], Ptr[GObject]] = struct._3
      inline def constructor_=(value: CFuncPtr3[GType, _root_.sn.gnome.glib.internal.guint, Ptr[GObjectConstructParam], Ptr[GObject]]): Unit = (!struct.at3 = value)
      inline def set_property : CFuncPtr4[Ptr[GObject], _root_.sn.gnome.glib.internal.guint, Ptr[GValue], Ptr[GParamSpec], Unit] = struct._4
      inline def set_property_=(value: CFuncPtr4[Ptr[GObject], _root_.sn.gnome.glib.internal.guint, Ptr[GValue], Ptr[GParamSpec], Unit]): Unit = (!struct.at4 = value)
      inline def get_property : CFuncPtr4[Ptr[GObject], _root_.sn.gnome.glib.internal.guint, Ptr[GValue], Ptr[GParamSpec], Unit] = struct._5
      inline def get_property_=(value: CFuncPtr4[Ptr[GObject], _root_.sn.gnome.glib.internal.guint, Ptr[GValue], Ptr[GParamSpec], Unit]): Unit = (!struct.at5 = value)
      inline def dispose : CFuncPtr1[Ptr[GObject], Unit] = struct._6
      inline def dispose_=(value: CFuncPtr1[Ptr[GObject], Unit]): Unit = (!struct.at6 = value)
      inline def finalize : CFuncPtr1[Ptr[GObject], Unit] = struct._7
      inline def finalize_=(value: CFuncPtr1[Ptr[GObject], Unit]): Unit = (!struct.at7 = value)
      inline def dispatch_properties_changed : CFuncPtr3[Ptr[GObject], _root_.sn.gnome.glib.internal.guint, Ptr[Ptr[GParamSpec]], Unit] = struct._8
      inline def dispatch_properties_changed_=(value: CFuncPtr3[Ptr[GObject], _root_.sn.gnome.glib.internal.guint, Ptr[Ptr[GParamSpec]], Unit]): Unit = (!struct.at8 = value)
      inline def _notify : CFuncPtr2[Ptr[GObject], Ptr[GParamSpec], Unit] = struct._9
      inline def _notify_=(value: CFuncPtr2[Ptr[GObject], Ptr[GParamSpec], Unit]): Unit = (!struct.at9 = value)
      inline def constructed : CFuncPtr1[Ptr[GObject], Unit] = struct._10
      inline def constructed_=(value: CFuncPtr1[Ptr[GObject], Unit]): Unit = (!struct.at10 = value)
      inline def flags : _root_.sn.gnome.glib.internal.gsize = struct._11
      inline def flags_=(value: _root_.sn.gnome.glib.internal.gsize): Unit = (!struct.at11 = value)
      inline def n_construct_properties : _root_.sn.gnome.glib.internal.gsize = struct._12
      inline def n_construct_properties_=(value: _root_.sn.gnome.glib.internal.gsize): Unit = (!struct.at12 = value)
      inline def pspecs : _root_.sn.gnome.glib.internal.gpointer = struct._13
      inline def pspecs_=(value: _root_.sn.gnome.glib.internal.gpointer): Unit = (!struct.at13 = value)
      inline def n_pspecs : _root_.sn.gnome.glib.internal.gsize = struct._14
      inline def n_pspecs_=(value: _root_.sn.gnome.glib.internal.gsize): Unit = (!struct.at14 = value)
      inline def pdummy : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._3] = struct._15
      inline def pdummy_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._3]): Unit = (!struct.at15 = value)
    end extension
  
  // Allocates _GObjectClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GObjectClass] = scala.scalanative.unsafe.alloc[_GObjectClass](1)
  def apply(g_type_class : GTypeClass, construct_properties : Ptr[_root_.sn.gnome.glib.internal.GSList], constructor : CFuncPtr3[GType, _root_.sn.gnome.glib.internal.guint, Ptr[GObjectConstructParam], Ptr[GObject]], set_property : CFuncPtr4[Ptr[GObject], _root_.sn.gnome.glib.internal.guint, Ptr[GValue], Ptr[GParamSpec], Unit], get_property : CFuncPtr4[Ptr[GObject], _root_.sn.gnome.glib.internal.guint, Ptr[GValue], Ptr[GParamSpec], Unit], dispose : CFuncPtr1[Ptr[GObject], Unit], finalize : CFuncPtr1[Ptr[GObject], Unit], dispatch_properties_changed : CFuncPtr3[Ptr[GObject], _root_.sn.gnome.glib.internal.guint, Ptr[Ptr[GParamSpec]], Unit], _notify : CFuncPtr2[Ptr[GObject], Ptr[GParamSpec], Unit], constructed : CFuncPtr1[Ptr[GObject], Unit], flags : _root_.sn.gnome.glib.internal.gsize, n_construct_properties : _root_.sn.gnome.glib.internal.gsize, pspecs : _root_.sn.gnome.glib.internal.gpointer, n_pspecs : _root_.sn.gnome.glib.internal.gsize, pdummy : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._3])(using Zone): Ptr[_GObjectClass] =
    val ____ptr = apply()
    (!____ptr).g_type_class = g_type_class
    (!____ptr).construct_properties = construct_properties
    (!____ptr).constructor = constructor
    (!____ptr).set_property = set_property
    (!____ptr).get_property = get_property
    (!____ptr).dispose = dispose
    (!____ptr).finalize = finalize
    (!____ptr).dispatch_properties_changed = dispatch_properties_changed
    (!____ptr)._notify = _notify
    (!____ptr).constructed = constructed
    (!____ptr).flags = flags
    (!____ptr).n_construct_properties = n_construct_properties
    (!____ptr).pspecs = pspecs
    (!____ptr).n_pspecs = n_pspecs
    (!____ptr).pdummy = pdummy
    ____ptr