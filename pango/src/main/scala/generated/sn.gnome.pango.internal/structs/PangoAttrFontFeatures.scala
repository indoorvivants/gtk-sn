package sn.gnome.pango.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * PangoAttrFontFeatures: : the common portion of the attribute : the features, as a string in CSS syntax
*/
opaque type PangoAttrFontFeatures = CStruct2[PangoAttribute, Ptr[_root_.sn.gnome.glib.internal.gchar]]

object PangoAttrFontFeatures:
  given _tag: Tag[PangoAttrFontFeatures] = Tag.materializeCStruct2Tag[PangoAttribute, Ptr[_root_.sn.gnome.glib.internal.gchar]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: PangoAttrFontFeatures)
      inline def attr : PangoAttribute = struct._1
      inline def attr_=(value: PangoAttribute): Unit = (!struct.at1 = value)
      inline def features : Ptr[_root_.sn.gnome.glib.internal.gchar] = struct._2
      inline def features_=(value: Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates PangoAttrFontFeatures on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[PangoAttrFontFeatures] = scala.scalanative.unsafe.alloc[PangoAttrFontFeatures](1)
  def apply(attr : PangoAttribute, features : Ptr[_root_.sn.gnome.glib.internal.gchar])(using Zone): Ptr[PangoAttrFontFeatures] =
    val ____ptr = apply()
    (!____ptr).attr = attr
    (!____ptr).features = features
    ____ptr