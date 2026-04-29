package sn.gnome.pango.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * PangoAttrClass: : the type ID for this attribute : function to duplicate an attribute of this type (see [method.Attribute.copy]) : function to free an attribute of this type (see [method.Attribute.destroy]) : function to check two attributes of this type for equality (see [method.Attribute.equal])
*/
opaque type PangoAttrClass = CStruct4[PangoAttrType, CFuncPtr1[Ptr[Byte], Ptr[Byte]], CFuncPtr1[Ptr[Byte], Unit], CFuncPtr2[Ptr[Byte], Ptr[Byte], _root_.sn.gnome.glib.internal.gboolean]]

object PangoAttrClass:
  given _tag: Tag[PangoAttrClass] = Tag.materializeCStruct4Tag[PangoAttrType, CFuncPtr1[Ptr[Byte], Ptr[Byte]], CFuncPtr1[Ptr[Byte], Unit], CFuncPtr2[Ptr[Byte], Ptr[Byte], _root_.sn.gnome.glib.internal.gboolean]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: PangoAttrClass)
      inline def `type` : PangoAttrType = struct._1
      inline def type_=(value: PangoAttrType): Unit = (!struct.at1 = value)
      inline def copy : CFuncPtr1[Ptr[PangoAttribute], Ptr[PangoAttribute]] = struct._2.asInstanceOf[CFuncPtr1[Ptr[PangoAttribute], Ptr[PangoAttribute]]]
      inline def copy_=(value: CFuncPtr1[Ptr[PangoAttribute], Ptr[PangoAttribute]]): Unit = (!struct.at2 = value.asInstanceOf[CFuncPtr1[Ptr[Byte], Ptr[Byte]]])
      inline def destroy : CFuncPtr1[Ptr[PangoAttribute], Unit] = struct._3.asInstanceOf[CFuncPtr1[Ptr[PangoAttribute], Unit]]
      inline def destroy_=(value: CFuncPtr1[Ptr[PangoAttribute], Unit]): Unit = (!struct.at3 = value.asInstanceOf[CFuncPtr1[Ptr[Byte], Unit]])
      inline def equal : CFuncPtr2[Ptr[PangoAttribute], Ptr[PangoAttribute], _root_.sn.gnome.glib.internal.gboolean] = struct._4.asInstanceOf[CFuncPtr2[Ptr[PangoAttribute], Ptr[PangoAttribute], _root_.sn.gnome.glib.internal.gboolean]]
      inline def equal_=(value: CFuncPtr2[Ptr[PangoAttribute], Ptr[PangoAttribute], _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at4 = value.asInstanceOf[CFuncPtr2[Ptr[Byte], Ptr[Byte], _root_.sn.gnome.glib.internal.gboolean]])
    end extension
  
  // Allocates PangoAttrClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[PangoAttrClass] = scala.scalanative.unsafe.alloc[PangoAttrClass](1)
  def apply(`type` : PangoAttrType, copy : CFuncPtr1[Ptr[PangoAttribute], Ptr[PangoAttribute]], destroy : CFuncPtr1[Ptr[PangoAttribute], Unit], equal : CFuncPtr2[Ptr[PangoAttribute], Ptr[PangoAttribute], _root_.sn.gnome.glib.internal.gboolean])(using Zone): Ptr[PangoAttrClass] =
    val ____ptr = apply()
    (!____ptr).`type` = `type`
    (!____ptr).copy = copy
    (!____ptr).destroy = destroy
    (!____ptr).equal = equal
    ____ptr