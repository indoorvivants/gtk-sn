package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GDebugControllerDBusClass: _class: The parent class. : Default handler for the #GDebugControllerDBus::authorize signal.
*/
opaque type GDebugControllerDBusClass = CArray[CChar, Nat.Digit3[Nat._2, Nat._4, Nat._0]]

object GDebugControllerDBusClass:
  given _tag: Tag[GDebugControllerDBusClass] = Tag.CArray[CChar, Nat.Digit3[Nat._2, Nat._4, Nat._0]](Tag.Byte, Tag.Digit3[Nat._2, Nat._4, Nat._0](Tag.Nat2, Tag.Nat4, Tag.Nat0))
  
  export fields.*
  private[internal] object fields:
    extension (struct: GDebugControllerDBusClass)
      inline def parent_class: _root_.sn.gnome.gobject.internal.GObjectClass = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GObjectClass]]
      inline def parent_class_=(value: _root_.sn.gnome.gobject.internal.GObjectClass): Unit = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GObjectClass]] = value
      inline def authorize: CFuncPtr2[Ptr[GDebugControllerDBus], Ptr[GDBusMethodInvocation], _root_.sn.gnome.glib.internal.gboolean] = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GDebugControllerDBus], Ptr[GDBusMethodInvocation], _root_.sn.gnome.glib.internal.gboolean]]]
      inline def authorize_=(value: CFuncPtr2[Ptr[GDebugControllerDBus], Ptr[GDBusMethodInvocation], _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GDebugControllerDBus], Ptr[GDBusMethodInvocation], _root_.sn.gnome.glib.internal.gboolean]]] = value
      inline def padding: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat.Digit2[Nat._1, Nat._2]] = !struct.at(offsets(2)).asInstanceOf[Ptr[CArray[_root_.sn.gnome.glib.internal.gpointer, Nat.Digit2[Nat._1, Nat._2]]]]
      inline def padding_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat.Digit2[Nat._1, Nat._2]]): Unit = !struct.at(offsets(2)).asInstanceOf[Ptr[CArray[_root_.sn.gnome.glib.internal.gpointer, Nat.Digit2[Nat._1, Nat._2]]]] = value
    end extension
  
  // Allocates GDebugControllerDBusClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GDebugControllerDBusClass] = scala.scalanative.unsafe.alloc[GDebugControllerDBusClass](1)
  def apply(parent_class : _root_.sn.gnome.gobject.internal.GObjectClass, authorize : CFuncPtr2[Ptr[GDebugControllerDBus], Ptr[GDBusMethodInvocation], _root_.sn.gnome.glib.internal.gboolean], padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat.Digit2[Nat._1, Nat._2]])(using Zone): Ptr[GDebugControllerDBusClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).authorize = authorize
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
    res(1) = align(res(0) + sizeof[_root_.sn.gnome.gobject.internal.GObjectClass].toInt, alignmentof[CFuncPtr2[Ptr[GDebugControllerDBus], Ptr[GDBusMethodInvocation], _root_.sn.gnome.glib.internal.gboolean]].toInt)
    res(2) = align(res(1) + sizeof[CFuncPtr2[Ptr[GDebugControllerDBus], Ptr[GDBusMethodInvocation], _root_.sn.gnome.glib.internal.gboolean]].toInt, alignmentof[_root_.sn.gnome.glib.internal.gpointer].toInt)
    res
  end offsets