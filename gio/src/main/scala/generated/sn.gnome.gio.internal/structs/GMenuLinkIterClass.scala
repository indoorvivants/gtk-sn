package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GMenuLinkIterClass = CArray[CChar, Nat.Digit3[Nat._1, Nat._4, Nat._4]]

object GMenuLinkIterClass:
  given _tag: Tag[GMenuLinkIterClass] = Tag.CArray[CChar, Nat.Digit3[Nat._1, Nat._4, Nat._4]](Tag.Byte, Tag.Digit3[Nat._1, Nat._4, Nat._4](Tag.Nat1, Tag.Nat4, Tag.Nat4))
  
  export fields.*
  private[internal] object fields:
    extension (struct: GMenuLinkIterClass)
      inline def parent_class: _root_.sn.gnome.gobject.internal.GObjectClass = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GObjectClass]]
      inline def parent_class_=(value: _root_.sn.gnome.gobject.internal.GObjectClass): Unit = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GObjectClass]] = value
      inline def get_next: CFuncPtr3[Ptr[GMenuLinkIter], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]], Ptr[Ptr[GMenuModel]], _root_.sn.gnome.glib.internal.gboolean] = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GMenuLinkIter], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]], Ptr[Ptr[GMenuModel]], _root_.sn.gnome.glib.internal.gboolean]]]
      inline def get_next_=(value: CFuncPtr3[Ptr[GMenuLinkIter], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]], Ptr[Ptr[GMenuModel]], _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GMenuLinkIter], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]], Ptr[Ptr[GMenuModel]], _root_.sn.gnome.glib.internal.gboolean]]] = value
    end extension
  
  // Allocates GMenuLinkIterClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GMenuLinkIterClass] = scala.scalanative.unsafe.alloc[GMenuLinkIterClass](1)
  def apply(parent_class : _root_.sn.gnome.gobject.internal.GObjectClass, get_next : CFuncPtr3[Ptr[GMenuLinkIter], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]], Ptr[Ptr[GMenuModel]], _root_.sn.gnome.glib.internal.gboolean])(using Zone): Ptr[GMenuLinkIterClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).get_next = get_next
    ____ptr
  
  val offsets: Array[Int] =
    val res = Array.ofDim[Int](2)
    def align(offset: Int, alignment: Int) = {
      val alignmentMask = alignment - 1
      val padding =
        if ((offset & alignmentMask) == 0) 0
        else alignment - (offset & alignmentMask)
      offset + padding
    }
    
    res(0) = align(0, alignmentof[_root_.sn.gnome.gobject.internal.GObjectClass].toInt)
    res(1) = align(res(0) + sizeof[_root_.sn.gnome.gobject.internal.GObjectClass].toInt, alignmentof[CFuncPtr3[Ptr[GMenuLinkIter], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]], Ptr[Ptr[GMenuModel]], _root_.sn.gnome.glib.internal.gboolean]].toInt)
    res
  end offsets