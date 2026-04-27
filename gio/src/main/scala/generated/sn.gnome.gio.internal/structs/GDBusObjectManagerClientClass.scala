package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GDBusObjectManagerClientClass: _class: The parent class.
*/
opaque type GDBusObjectManagerClientClass = CArray[CChar, Nat.Digit3[Nat._2, Nat._1, Nat._6]]

object GDBusObjectManagerClientClass:
  given _tag: Tag[GDBusObjectManagerClientClass] = Tag.CArray[CChar, Nat.Digit3[Nat._2, Nat._1, Nat._6]](Tag.Byte, Tag.Digit3[Nat._2, Nat._1, Nat._6](Tag.Nat2, Tag.Nat1, Tag.Nat6))
  
  export fields.*
  private[internal] object fields:
    extension (struct: GDBusObjectManagerClientClass)
      inline def parent_class: _root_.sn.gnome.gobject.internal.GObjectClass = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GObjectClass]]
      inline def parent_class_=(value: _root_.sn.gnome.gobject.internal.GObjectClass): Unit = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GObjectClass]] = value
      inline def interface_proxy_signal: CFuncPtr6[Ptr[GDBusObjectManagerClient], Ptr[GDBusObjectProxy], Ptr[GDBusProxy], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit] = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr6[Ptr[GDBusObjectManagerClient], Ptr[GDBusObjectProxy], Ptr[GDBusProxy], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit]]]
      inline def interface_proxy_signal_=(value: CFuncPtr6[Ptr[GDBusObjectManagerClient], Ptr[GDBusObjectProxy], Ptr[GDBusProxy], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit]): Unit = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr6[Ptr[GDBusObjectManagerClient], Ptr[GDBusObjectProxy], Ptr[GDBusProxy], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit]]] = value
      inline def interface_proxy_properties_changed: CFuncPtr5[Ptr[GDBusObjectManagerClient], Ptr[GDBusObjectProxy], Ptr[GDBusProxy], Ptr[_root_.sn.gnome.glib.internal.GVariant], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]], Unit] = !struct.at(offsets(2)).asInstanceOf[Ptr[CFuncPtr5[Ptr[GDBusObjectManagerClient], Ptr[GDBusObjectProxy], Ptr[GDBusProxy], Ptr[_root_.sn.gnome.glib.internal.GVariant], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]], Unit]]]
      inline def interface_proxy_properties_changed_=(value: CFuncPtr5[Ptr[GDBusObjectManagerClient], Ptr[GDBusObjectProxy], Ptr[GDBusProxy], Ptr[_root_.sn.gnome.glib.internal.GVariant], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]], Unit]): Unit = !struct.at(offsets(2)).asInstanceOf[Ptr[CFuncPtr5[Ptr[GDBusObjectManagerClient], Ptr[GDBusObjectProxy], Ptr[GDBusProxy], Ptr[_root_.sn.gnome.glib.internal.GVariant], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]], Unit]]] = value
      inline def padding: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8] = !struct.at(offsets(3)).asInstanceOf[Ptr[CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]]]
      inline def padding_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]): Unit = !struct.at(offsets(3)).asInstanceOf[Ptr[CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]]] = value
    end extension
  
  // Allocates GDBusObjectManagerClientClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GDBusObjectManagerClientClass] = scala.scalanative.unsafe.alloc[GDBusObjectManagerClientClass](1)
  def apply(parent_class : _root_.sn.gnome.gobject.internal.GObjectClass, interface_proxy_signal : CFuncPtr6[Ptr[GDBusObjectManagerClient], Ptr[GDBusObjectProxy], Ptr[GDBusProxy], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit], interface_proxy_properties_changed : CFuncPtr5[Ptr[GDBusObjectManagerClient], Ptr[GDBusObjectProxy], Ptr[GDBusProxy], Ptr[_root_.sn.gnome.glib.internal.GVariant], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]], Unit], padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8])(using Zone): Ptr[GDBusObjectManagerClientClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).interface_proxy_signal = interface_proxy_signal
    (!____ptr).interface_proxy_properties_changed = interface_proxy_properties_changed
    (!____ptr).padding = padding
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
    
    res(0) = align(0, alignmentof[_root_.sn.gnome.gobject.internal.GObjectClass].toInt)
    res(1) = align(res(0) + sizeof[_root_.sn.gnome.gobject.internal.GObjectClass].toInt, alignmentof[CFuncPtr6[Ptr[GDBusObjectManagerClient], Ptr[GDBusObjectProxy], Ptr[GDBusProxy], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit]].toInt)
    res(2) = align(res(1) + sizeof[CFuncPtr6[Ptr[GDBusObjectManagerClient], Ptr[GDBusObjectProxy], Ptr[GDBusProxy], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit]].toInt, alignmentof[CFuncPtr5[Ptr[GDBusObjectManagerClient], Ptr[GDBusObjectProxy], Ptr[GDBusProxy], Ptr[_root_.sn.gnome.glib.internal.GVariant], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]], Unit]].toInt)
    res(3) = align(res(2) + sizeof[CFuncPtr5[Ptr[GDBusObjectManagerClient], Ptr[GDBusObjectProxy], Ptr[GDBusProxy], Ptr[_root_.sn.gnome.glib.internal.GVariant], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]], Unit]].toInt, alignmentof[_root_.sn.gnome.glib.internal.gpointer].toInt)
    res
  end offsets