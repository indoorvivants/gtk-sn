package sn.gnome.pango.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * PangoEngineInfo: _type: a string identifying the engine type. _type: a string identifying the render type. : array of scripts this engine supports. _scripts: number of items in .
*/
opaque type PangoEngineInfo = CStruct5[Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[PangoEngineScriptInfo], _root_.sn.gnome.glib.internal.gint]

object PangoEngineInfo:
  given _tag: Tag[PangoEngineInfo] = Tag.materializeCStruct5Tag[Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[PangoEngineScriptInfo], _root_.sn.gnome.glib.internal.gint]
  
  export fields.*
  private[internal] object fields:
    extension (struct: PangoEngineInfo)
      inline def id : Ptr[_root_.sn.gnome.glib.internal.gchar] = struct._1
      inline def id_=(value: Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = (!struct.at1 = value)
      inline def engine_type : Ptr[_root_.sn.gnome.glib.internal.gchar] = struct._2
      inline def engine_type_=(value: Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = (!struct.at2 = value)
      inline def render_type : Ptr[_root_.sn.gnome.glib.internal.gchar] = struct._3
      inline def render_type_=(value: Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = (!struct.at3 = value)
      inline def scripts : Ptr[PangoEngineScriptInfo] = struct._4
      inline def scripts_=(value: Ptr[PangoEngineScriptInfo]): Unit = (!struct.at4 = value)
      inline def n_scripts : _root_.sn.gnome.glib.internal.gint = struct._5
      inline def n_scripts_=(value: _root_.sn.gnome.glib.internal.gint): Unit = (!struct.at5 = value)
    end extension
  
  // Allocates PangoEngineInfo on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[PangoEngineInfo] = scala.scalanative.unsafe.alloc[PangoEngineInfo](1)
  def apply(id : Ptr[_root_.sn.gnome.glib.internal.gchar], engine_type : Ptr[_root_.sn.gnome.glib.internal.gchar], render_type : Ptr[_root_.sn.gnome.glib.internal.gchar], scripts : Ptr[PangoEngineScriptInfo], n_scripts : _root_.sn.gnome.glib.internal.gint)(using Zone): Ptr[PangoEngineInfo] =
    val ____ptr = apply()
    (!____ptr).id = id
    (!____ptr).engine_type = engine_type
    (!____ptr).render_type = render_type
    (!____ptr).scripts = scripts
    (!____ptr).n_scripts = n_scripts
    ____ptr