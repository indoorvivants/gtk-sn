package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GTlsCertificateClass = CStruct3[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr3[Ptr[GTlsCertificate], Ptr[GSocketConnectable], Ptr[GTlsCertificate], GTlsCertificateFlags], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]]

object _GTlsCertificateClass:
  given _tag: Tag[_GTlsCertificateClass] = Tag.materializeCStruct3Tag[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr3[Ptr[GTlsCertificate], Ptr[GSocketConnectable], Ptr[GTlsCertificate], GTlsCertificateFlags], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GTlsCertificateClass)
      inline def parent_class : _root_.sn.gnome.gobject.internal.GObjectClass = struct._1
      inline def parent_class_=(value: _root_.sn.gnome.gobject.internal.GObjectClass): Unit = (!struct.at1 = value)
      inline def verify : CFuncPtr3[Ptr[GTlsCertificate], Ptr[GSocketConnectable], Ptr[GTlsCertificate], GTlsCertificateFlags] = struct._2
      inline def verify_=(value: CFuncPtr3[Ptr[GTlsCertificate], Ptr[GSocketConnectable], Ptr[GTlsCertificate], GTlsCertificateFlags]): Unit = (!struct.at2 = value)
      inline def padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8] = struct._3
      inline def padding_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]): Unit = (!struct.at3 = value)
    end extension
  
  // Allocates _GTlsCertificateClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GTlsCertificateClass] = scala.scalanative.unsafe.alloc[_GTlsCertificateClass](1)
  def apply(parent_class : _root_.sn.gnome.gobject.internal.GObjectClass, verify : CFuncPtr3[Ptr[GTlsCertificate], Ptr[GSocketConnectable], Ptr[GTlsCertificate], GTlsCertificateFlags], padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8])(using Zone): Ptr[_GTlsCertificateClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).verify = verify
    (!____ptr).padding = padding
    ____ptr