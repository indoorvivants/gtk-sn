package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GRemoteActionGroupInterface = CArray[CChar, Nat.Digit2[Nat._3, Nat._2]]

object GRemoteActionGroupInterface:
  given _tag: Tag[GRemoteActionGroupInterface] = Tag.CArray[CChar, Nat.Digit2[Nat._3, Nat._2]](Tag.Byte, Tag.Digit2[Nat._3, Nat._2](Tag.Nat3, Tag.Nat2))
  
  export fields.*
  private[internal] object fields:
    extension (struct: GRemoteActionGroupInterface)
      inline def g_iface: _root_.sn.gnome.gobject.internal.GTypeInterface = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GTypeInterface]]
      inline def g_iface_=(value: _root_.sn.gnome.gobject.internal.GTypeInterface): Unit = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GTypeInterface]] = value
      inline def activate_action_full: CFuncPtr4[Ptr[GRemoteActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit] = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr4[Ptr[GRemoteActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit]]]
      inline def activate_action_full_=(value: CFuncPtr4[Ptr[GRemoteActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit]): Unit = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr4[Ptr[GRemoteActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit]]] = value
      inline def change_action_state_full: CFuncPtr4[Ptr[GRemoteActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit] = !struct.at(offsets(2)).asInstanceOf[Ptr[CFuncPtr4[Ptr[GRemoteActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit]]]
      inline def change_action_state_full_=(value: CFuncPtr4[Ptr[GRemoteActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit]): Unit = !struct.at(offsets(2)).asInstanceOf[Ptr[CFuncPtr4[Ptr[GRemoteActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit]]] = value
    end extension
  
  // Allocates GRemoteActionGroupInterface on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GRemoteActionGroupInterface] = scala.scalanative.unsafe.alloc[GRemoteActionGroupInterface](1)
  def apply(g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface, activate_action_full : CFuncPtr4[Ptr[GRemoteActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit], change_action_state_full : CFuncPtr4[Ptr[GRemoteActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit])(using Zone): Ptr[GRemoteActionGroupInterface] =
    val ____ptr = apply()
    (!____ptr).g_iface = g_iface
    (!____ptr).activate_action_full = activate_action_full
    (!____ptr).change_action_state_full = change_action_state_full
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
    
    res(0) = align(0, alignmentof[_root_.sn.gnome.gobject.internal.GTypeInterface].toInt)
    res(1) = align(res(0) + sizeof[_root_.sn.gnome.gobject.internal.GTypeInterface].toInt, alignmentof[CFuncPtr4[Ptr[GRemoteActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit]].toInt)
    res(2) = align(res(1) + sizeof[CFuncPtr4[Ptr[GRemoteActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit]].toInt, alignmentof[CFuncPtr4[Ptr[GRemoteActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit]].toInt)
    res
  end offsets