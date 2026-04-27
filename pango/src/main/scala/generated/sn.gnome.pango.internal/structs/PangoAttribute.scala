package sn.gnome.pango.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * PangoAttribute: _index: the start index of the range (in bytes). _index: end index of the range (in bytes). The character at this index is not included in the range.
*/
opaque type PangoAttribute = CStruct3[Ptr[Byte], _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint]

object PangoAttribute:
  given _tag: Tag[PangoAttribute] = Tag.materializeCStruct3Tag[Ptr[Byte], _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint]
  
  export fields.*
  private[internal] object fields:
    extension (struct: PangoAttribute)
      inline def klass : Ptr[PangoAttrClass] = struct._1.asInstanceOf[Ptr[PangoAttrClass]]
      inline def klass_=(value: Ptr[PangoAttrClass]): Unit = (!struct.at1 = value.asInstanceOf[Ptr[Byte]])
      inline def start_index : _root_.sn.gnome.glib.internal.guint = struct._2
      inline def start_index_=(value: _root_.sn.gnome.glib.internal.guint): Unit = (!struct.at2 = value)
      inline def end_index : _root_.sn.gnome.glib.internal.guint = struct._3
      inline def end_index_=(value: _root_.sn.gnome.glib.internal.guint): Unit = (!struct.at3 = value)
    end extension
  
  // Allocates PangoAttribute on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[PangoAttribute] = scala.scalanative.unsafe.alloc[PangoAttribute](1)
  def apply(klass : Ptr[PangoAttrClass], start_index : _root_.sn.gnome.glib.internal.guint, end_index : _root_.sn.gnome.glib.internal.guint)(using Zone): Ptr[PangoAttribute] =
    val ____ptr = apply()
    (!____ptr).klass = klass
    (!____ptr).start_index = start_index
    (!____ptr).end_index = end_index
    ____ptr