package sn.gnome.pango.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * PangoAttrSize: : the common portion of the attribute : size of font, in units of 1/%PANGO_SCALE of a point (for %PANGO_ATTR_SIZE) or of a device unit (for %PANGO_ATTR_ABSOLUTE_SIZE) : whether the font size is in device units or points. This field is only present for compatibility with Pango-1.8.0 (%PANGO_ATTR_ABSOLUTE_SIZE was added in 1.8.1); and always will be %FALSE for %PANGO_ATTR_SIZE and %TRUE for %PANGO_ATTR_ABSOLUTE_SIZE.
*/
opaque type PangoAttrSize = CStruct3[PangoAttribute, CInt, _root_.sn.gnome.glib.internal.guint]

object PangoAttrSize:
  given _tag: Tag[PangoAttrSize] = Tag.materializeCStruct3Tag[PangoAttribute, CInt, _root_.sn.gnome.glib.internal.guint]
  
  export fields.*
  private[internal] object fields:
    extension (struct: PangoAttrSize)
      inline def attr : PangoAttribute = struct._1
      inline def attr_=(value: PangoAttribute): Unit = (!struct.at1 = value)
      inline def size : CInt = struct._2
      inline def size_=(value: CInt): Unit = (!struct.at2 = value)
      inline def absolute : _root_.sn.gnome.glib.internal.guint = struct._3
      inline def absolute_=(value: _root_.sn.gnome.glib.internal.guint): Unit = (!struct.at3 = value)
    end extension
  
  // Allocates PangoAttrSize on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[PangoAttrSize] = scala.scalanative.unsafe.alloc[PangoAttrSize](1)
  def apply(attr : PangoAttribute, size : CInt, absolute : _root_.sn.gnome.glib.internal.guint)(using Zone): Ptr[PangoAttrSize] =
    val ____ptr = apply()
    (!____ptr).attr = attr
    (!____ptr).size = size
    (!____ptr).absolute = absolute
    ____ptr