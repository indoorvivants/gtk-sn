package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GActionMapInterface = CArray[CChar, Nat.Digit2[Nat._4, Nat._0]]

object GActionMapInterface:
  given _tag: Tag[GActionMapInterface] = Tag.CArray[CChar, Nat.Digit2[Nat._4, Nat._0]](Tag.Byte, Tag.Digit2[Nat._4, Nat._0](Tag.Nat4, Tag.Nat0))
  
  export fields.*
  private[internal] object fields:
    extension (struct: GActionMapInterface)
      inline def g_iface: _root_.sn.gnome.gobject.internal.GTypeInterface = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GTypeInterface]]
      inline def g_iface_=(value: _root_.sn.gnome.gobject.internal.GTypeInterface): Unit = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GTypeInterface]] = value
      inline def lookup_action: CFuncPtr2[Ptr[GActionMap], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[GAction]] = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GActionMap], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[GAction]]]]
      inline def lookup_action_=(value: CFuncPtr2[Ptr[GActionMap], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[GAction]]): Unit = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GActionMap], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[GAction]]]] = value
      inline def add_action: CFuncPtr2[Ptr[GActionMap], Ptr[GAction], Unit] = !struct.at(offsets(2)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GActionMap], Ptr[GAction], Unit]]]
      inline def add_action_=(value: CFuncPtr2[Ptr[GActionMap], Ptr[GAction], Unit]): Unit = !struct.at(offsets(2)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GActionMap], Ptr[GAction], Unit]]] = value
      inline def remove_action: CFuncPtr2[Ptr[GActionMap], Ptr[_root_.sn.gnome.glib.internal.gchar], Unit] = !struct.at(offsets(3)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GActionMap], Ptr[_root_.sn.gnome.glib.internal.gchar], Unit]]]
      inline def remove_action_=(value: CFuncPtr2[Ptr[GActionMap], Ptr[_root_.sn.gnome.glib.internal.gchar], Unit]): Unit = !struct.at(offsets(3)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GActionMap], Ptr[_root_.sn.gnome.glib.internal.gchar], Unit]]] = value
    end extension
  
  // Allocates GActionMapInterface on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GActionMapInterface] = scala.scalanative.unsafe.alloc[GActionMapInterface](1)
  def apply(g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface, lookup_action : CFuncPtr2[Ptr[GActionMap], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[GAction]], add_action : CFuncPtr2[Ptr[GActionMap], Ptr[GAction], Unit], remove_action : CFuncPtr2[Ptr[GActionMap], Ptr[_root_.sn.gnome.glib.internal.gchar], Unit])(using Zone): Ptr[GActionMapInterface] =
    val ____ptr = apply()
    (!____ptr).g_iface = g_iface
    (!____ptr).lookup_action = lookup_action
    (!____ptr).add_action = add_action
    (!____ptr).remove_action = remove_action
    ____ptr
  
  val offsets: Array[Int] =
    val res = Array.ofDim[Int](4)
    def align(offset: Int, alignment: Int) = {
      val alignmentMask = alignment - 1
      val padding =
        if ((offset & alignmentMask) == 0) 0
        else alignment - (offset & alignmentMask)
      offset + padding
    }
    
    res(0) = align(0, alignmentof[_root_.sn.gnome.gobject.internal.GTypeInterface].toInt)
    res(1) = align(res(0) + sizeof[_root_.sn.gnome.gobject.internal.GTypeInterface].toInt, alignmentof[CFuncPtr2[Ptr[GActionMap], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[GAction]]].toInt)
    res(2) = align(res(1) + sizeof[CFuncPtr2[Ptr[GActionMap], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[GAction]]].toInt, alignmentof[CFuncPtr2[Ptr[GActionMap], Ptr[GAction], Unit]].toInt)
    res(3) = align(res(2) + sizeof[CFuncPtr2[Ptr[GActionMap], Ptr[GAction], Unit]].toInt, alignmentof[CFuncPtr2[Ptr[GActionMap], Ptr[_root_.sn.gnome.glib.internal.gchar], Unit]].toInt)
    res
  end offsets