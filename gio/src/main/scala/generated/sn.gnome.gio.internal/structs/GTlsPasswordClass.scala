package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GTlsPasswordClass: _value: virtual method for g_tls_password_get_value()
*/
opaque type GTlsPasswordClass = CArray[CChar, Nat.Digit3[Nat._1, Nat._9, Nat._2]]

object GTlsPasswordClass:
  given _tag: Tag[GTlsPasswordClass] = Tag.CArray[CChar, Nat.Digit3[Nat._1, Nat._9, Nat._2]](Tag.Byte, Tag.Digit3[Nat._1, Nat._9, Nat._2](Tag.Nat1, Tag.Nat9, Tag.Nat2))
  
  export fields.*
  private[internal] object fields:
    extension (struct: GTlsPasswordClass)
      inline def parent_class: _root_.sn.gnome.gobject.internal.GObjectClass = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GObjectClass]]
      inline def parent_class_=(value: _root_.sn.gnome.gobject.internal.GObjectClass): Unit = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GObjectClass]] = value
      inline def get_value: CFuncPtr2[Ptr[GTlsPassword], Ptr[_root_.sn.gnome.glib.internal.gsize], Ptr[_root_.sn.gnome.glib.internal.guchar]] = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GTlsPassword], Ptr[_root_.sn.gnome.glib.internal.gsize], Ptr[_root_.sn.gnome.glib.internal.guchar]]]]
      inline def get_value_=(value: CFuncPtr2[Ptr[GTlsPassword], Ptr[_root_.sn.gnome.glib.internal.gsize], Ptr[_root_.sn.gnome.glib.internal.guchar]]): Unit = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GTlsPassword], Ptr[_root_.sn.gnome.glib.internal.gsize], Ptr[_root_.sn.gnome.glib.internal.guchar]]]] = value
      inline def set_value: CFuncPtr4[Ptr[GTlsPassword], Ptr[_root_.sn.gnome.glib.internal.guchar], _root_.sn.gnome.glib.internal.gssize, _root_.sn.gnome.glib.internal.GDestroyNotify, Unit] = !struct.at(offsets(2)).asInstanceOf[Ptr[CFuncPtr4[Ptr[GTlsPassword], Ptr[_root_.sn.gnome.glib.internal.guchar], _root_.sn.gnome.glib.internal.gssize, _root_.sn.gnome.glib.internal.GDestroyNotify, Unit]]]
      inline def set_value_=(value: CFuncPtr4[Ptr[GTlsPassword], Ptr[_root_.sn.gnome.glib.internal.guchar], _root_.sn.gnome.glib.internal.gssize, _root_.sn.gnome.glib.internal.GDestroyNotify, Unit]): Unit = !struct.at(offsets(2)).asInstanceOf[Ptr[CFuncPtr4[Ptr[GTlsPassword], Ptr[_root_.sn.gnome.glib.internal.guchar], _root_.sn.gnome.glib.internal.gssize, _root_.sn.gnome.glib.internal.GDestroyNotify, Unit]]] = value
      inline def get_default_warning: CFuncPtr1[Ptr[GTlsPassword], Ptr[_root_.sn.gnome.glib.internal.gchar]] = !struct.at(offsets(3)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GTlsPassword], Ptr[_root_.sn.gnome.glib.internal.gchar]]]]
      inline def get_default_warning_=(value: CFuncPtr1[Ptr[GTlsPassword], Ptr[_root_.sn.gnome.glib.internal.gchar]]): Unit = !struct.at(offsets(3)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GTlsPassword], Ptr[_root_.sn.gnome.glib.internal.gchar]]]] = value
      inline def padding: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4] = !struct.at(offsets(4)).asInstanceOf[Ptr[CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]]]
      inline def padding_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]): Unit = !struct.at(offsets(4)).asInstanceOf[Ptr[CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]]] = value
    end extension
  
  // Allocates GTlsPasswordClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GTlsPasswordClass] = scala.scalanative.unsafe.alloc[GTlsPasswordClass](1)
  def apply(parent_class : _root_.sn.gnome.gobject.internal.GObjectClass, get_value : CFuncPtr2[Ptr[GTlsPassword], Ptr[_root_.sn.gnome.glib.internal.gsize], Ptr[_root_.sn.gnome.glib.internal.guchar]], set_value : CFuncPtr4[Ptr[GTlsPassword], Ptr[_root_.sn.gnome.glib.internal.guchar], _root_.sn.gnome.glib.internal.gssize, _root_.sn.gnome.glib.internal.GDestroyNotify, Unit], get_default_warning : CFuncPtr1[Ptr[GTlsPassword], Ptr[_root_.sn.gnome.glib.internal.gchar]], padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4])(using Zone): Ptr[GTlsPasswordClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).get_value = get_value
    (!____ptr).set_value = set_value
    (!____ptr).get_default_warning = get_default_warning
    (!____ptr).padding = padding
    ____ptr
  
  val offsets: Array[Int] =
    val res = Array.ofDim[Int](5)
    def align(offset: Int, alignment: Int) = {
      val alignmentMask = alignment - 1
      val padding =
        if ((offset & alignmentMask) == 0) 0
        else alignment - (offset & alignmentMask)
      offset + padding
    }
    
    res(0) = align(0, alignmentof[_root_.sn.gnome.gobject.internal.GObjectClass].toInt)
    res(1) = align(res(0) + sizeof[_root_.sn.gnome.gobject.internal.GObjectClass].toInt, alignmentof[CFuncPtr2[Ptr[GTlsPassword], Ptr[_root_.sn.gnome.glib.internal.gsize], Ptr[_root_.sn.gnome.glib.internal.guchar]]].toInt)
    res(2) = align(res(1) + sizeof[CFuncPtr2[Ptr[GTlsPassword], Ptr[_root_.sn.gnome.glib.internal.gsize], Ptr[_root_.sn.gnome.glib.internal.guchar]]].toInt, alignmentof[CFuncPtr4[Ptr[GTlsPassword], Ptr[_root_.sn.gnome.glib.internal.guchar], _root_.sn.gnome.glib.internal.gssize, _root_.sn.gnome.glib.internal.GDestroyNotify, Unit]].toInt)
    res(3) = align(res(2) + sizeof[CFuncPtr4[Ptr[GTlsPassword], Ptr[_root_.sn.gnome.glib.internal.guchar], _root_.sn.gnome.glib.internal.gssize, _root_.sn.gnome.glib.internal.GDestroyNotify, Unit]].toInt, alignmentof[CFuncPtr1[Ptr[GTlsPassword], Ptr[_root_.sn.gnome.glib.internal.gchar]]].toInt)
    res(4) = align(res(3) + sizeof[CFuncPtr1[Ptr[GTlsPassword], Ptr[_root_.sn.gnome.glib.internal.gchar]]].toInt, alignmentof[_root_.sn.gnome.glib.internal.gpointer].toInt)
    res
  end offsets