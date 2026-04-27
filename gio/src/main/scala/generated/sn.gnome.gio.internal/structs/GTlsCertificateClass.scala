package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GTlsCertificateClass = CArray[CChar, Nat.Digit3[Nat._2, Nat._0, Nat._8]]

object GTlsCertificateClass:
  given _tag: Tag[GTlsCertificateClass] = Tag.CArray[CChar, Nat.Digit3[Nat._2, Nat._0, Nat._8]](Tag.Byte, Tag.Digit3[Nat._2, Nat._0, Nat._8](Tag.Nat2, Tag.Nat0, Tag.Nat8))
  
  export fields.*
  private[internal] object fields:
    extension (struct: GTlsCertificateClass)
      inline def parent_class: _root_.sn.gnome.gobject.internal.GObjectClass = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GObjectClass]]
      inline def parent_class_=(value: _root_.sn.gnome.gobject.internal.GObjectClass): Unit = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GObjectClass]] = value
      inline def verify: CFuncPtr3[Ptr[GTlsCertificate], Ptr[GSocketConnectable], Ptr[GTlsCertificate], GTlsCertificateFlags] = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GTlsCertificate], Ptr[GSocketConnectable], Ptr[GTlsCertificate], GTlsCertificateFlags]]]
      inline def verify_=(value: CFuncPtr3[Ptr[GTlsCertificate], Ptr[GSocketConnectable], Ptr[GTlsCertificate], GTlsCertificateFlags]): Unit = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GTlsCertificate], Ptr[GSocketConnectable], Ptr[GTlsCertificate], GTlsCertificateFlags]]] = value
      inline def padding: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8] = !struct.at(offsets(2)).asInstanceOf[Ptr[CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]]]
      inline def padding_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]): Unit = !struct.at(offsets(2)).asInstanceOf[Ptr[CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]]] = value
    end extension
  
  // Allocates GTlsCertificateClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GTlsCertificateClass] = scala.scalanative.unsafe.alloc[GTlsCertificateClass](1)
  def apply(parent_class : _root_.sn.gnome.gobject.internal.GObjectClass, verify : CFuncPtr3[Ptr[GTlsCertificate], Ptr[GSocketConnectable], Ptr[GTlsCertificate], GTlsCertificateFlags], padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8])(using Zone): Ptr[GTlsCertificateClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).verify = verify
    (!____ptr).padding = padding
    ____ptr
  
  val offsets: Array[Int] =
    val res = Array.ofDim[Int](3)
    def align(offset: Int, alignment: Int) = {
      val alignmentMask = alignment - 1
      val padding =
        if ((offset & alignmentMask) == 0) 0
        else alignment - (offset & alignmentMask)
      offset + padding
    }
    
    res(0) = align(0, alignmentof[_root_.sn.gnome.gobject.internal.GObjectClass].toInt)
    res(1) = align(res(0) + sizeof[_root_.sn.gnome.gobject.internal.GObjectClass].toInt, alignmentof[CFuncPtr3[Ptr[GTlsCertificate], Ptr[GSocketConnectable], Ptr[GTlsCertificate], GTlsCertificateFlags]].toInt)
    res(2) = align(res(1) + sizeof[CFuncPtr3[Ptr[GTlsCertificate], Ptr[GSocketConnectable], Ptr[GTlsCertificate], GTlsCertificateFlags]].toInt, alignmentof[_root_.sn.gnome.glib.internal.gpointer].toInt)
    res
  end offsets