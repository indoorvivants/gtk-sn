package sn.gnome.pango.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * PangoEngineLangClass: _break: (nullable): Provides a custom implementation of pango_break(). If %NULL, pango_default_break() is used instead. If not %NULL, for Pango versions before 1.16 (module interface version before 1.6.0), this was called instead of pango_default_break(), but in newer versions, pango_default_break() is always called and this is called after that to allow tailoring the breaking results.
*/
opaque type _PangoEngineLangClass = CStruct2[PangoEngineClass, CFuncPtr6[Ptr[PangoEngineLang], CString, CInt, Ptr[Byte], Ptr[PangoLogAttr], CInt, Unit]]

object _PangoEngineLangClass:
  given _tag: Tag[_PangoEngineLangClass] = Tag.materializeCStruct2Tag[PangoEngineClass, CFuncPtr6[Ptr[PangoEngineLang], CString, CInt, Ptr[Byte], Ptr[PangoLogAttr], CInt, Unit]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _PangoEngineLangClass)
      inline def parent_class : PangoEngineClass = struct._1
      inline def parent_class_=(value: PangoEngineClass): Unit = (!struct.at1 = value)
      inline def script_break : CFuncPtr6[Ptr[PangoEngineLang], CString, CInt, Ptr[PangoAnalysis], Ptr[PangoLogAttr], CInt, Unit] = struct._2.asInstanceOf[CFuncPtr6[Ptr[PangoEngineLang], CString, CInt, Ptr[PangoAnalysis], Ptr[PangoLogAttr], CInt, Unit]]
      inline def script_break_=(value: CFuncPtr6[Ptr[PangoEngineLang], CString, CInt, Ptr[PangoAnalysis], Ptr[PangoLogAttr], CInt, Unit]): Unit = (!struct.at2 = value.asInstanceOf[CFuncPtr6[Ptr[PangoEngineLang], CString, CInt, Ptr[Byte], Ptr[PangoLogAttr], CInt, Unit]])
    end extension
  
  // Allocates _PangoEngineLangClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_PangoEngineLangClass] = scala.scalanative.unsafe.alloc[_PangoEngineLangClass](1)
  def apply(parent_class : PangoEngineClass, script_break : CFuncPtr6[Ptr[PangoEngineLang], CString, CInt, Ptr[PangoAnalysis], Ptr[PangoLogAttr], CInt, Unit])(using Zone): Ptr[_PangoEngineLangClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).script_break = script_break
    ____ptr