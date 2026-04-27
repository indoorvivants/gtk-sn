package sn.gnome.pango.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * PangoEngineScriptInfo: : a `PangoScript`. The value %PANGO_SCRIPT_COMMON has the special meaning here of "all scripts" : a semicolon separated list of languages that this engine handles for this script. This may be empty, in which case the engine is saying that it is a fallback choice for all languages for this range, but should not be used if another engine indicates that it is specific for the language for a given code point. An entry in this list of "*" indicates that this engine is specific to all languages for this range.
*/
opaque type _PangoEngineScriptInfo = CStruct2[PangoScript, Ptr[_root_.sn.gnome.glib.internal.gchar]]

object _PangoEngineScriptInfo:
  given _tag: Tag[_PangoEngineScriptInfo] = Tag.materializeCStruct2Tag[PangoScript, Ptr[_root_.sn.gnome.glib.internal.gchar]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _PangoEngineScriptInfo)
      inline def script : PangoScript = struct._1
      inline def script_=(value: PangoScript): Unit = (!struct.at1 = value)
      inline def langs : Ptr[_root_.sn.gnome.glib.internal.gchar] = struct._2
      inline def langs_=(value: Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates _PangoEngineScriptInfo on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_PangoEngineScriptInfo] = scala.scalanative.unsafe.alloc[_PangoEngineScriptInfo](1)
  def apply(script : PangoScript, langs : Ptr[_root_.sn.gnome.glib.internal.gchar])(using Zone): Ptr[_PangoEngineScriptInfo] =
    val ____ptr = apply()
    (!____ptr).script = script
    (!____ptr).langs = langs
    ____ptr