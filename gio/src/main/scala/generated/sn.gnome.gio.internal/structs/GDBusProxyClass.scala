package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GDBusProxyClass: _properties_changed: Signal class handler for the #GDBusProxy::g-properties-changed signal. _signal: Signal class handler for the #GDBusProxy::g-signal signal.
*/
opaque type GDBusProxyClass = CArray[CChar, Nat.Digit3[Nat._4, Nat._0, Nat._8]]

object GDBusProxyClass:
  given _tag: Tag[GDBusProxyClass] = Tag.CArray[CChar, Nat.Digit3[Nat._4, Nat._0, Nat._8]](Tag.Byte, Tag.Digit3[Nat._4, Nat._0, Nat._8](Tag.Nat4, Tag.Nat0, Tag.Nat8))
  
  export fields.*
  private[internal] object fields:
    extension (struct: GDBusProxyClass)
      inline def parent_class: _root_.sn.gnome.gobject.internal.GObjectClass = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GObjectClass]]
      inline def parent_class_=(value: _root_.sn.gnome.gobject.internal.GObjectClass): Unit = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GObjectClass]] = value
      inline def g_properties_changed: CFuncPtr3[Ptr[GDBusProxy], Ptr[_root_.sn.gnome.glib.internal.GVariant], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]], Unit] = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GDBusProxy], Ptr[_root_.sn.gnome.glib.internal.GVariant], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]], Unit]]]
      inline def g_properties_changed_=(value: CFuncPtr3[Ptr[GDBusProxy], Ptr[_root_.sn.gnome.glib.internal.GVariant], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]], Unit]): Unit = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GDBusProxy], Ptr[_root_.sn.gnome.glib.internal.GVariant], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]], Unit]]] = value
      inline def g_signal: CFuncPtr4[Ptr[GDBusProxy], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit] = !struct.at(offsets(2)).asInstanceOf[Ptr[CFuncPtr4[Ptr[GDBusProxy], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit]]]
      inline def g_signal_=(value: CFuncPtr4[Ptr[GDBusProxy], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit]): Unit = !struct.at(offsets(2)).asInstanceOf[Ptr[CFuncPtr4[Ptr[GDBusProxy], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit]]] = value
      inline def padding: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat.Digit2[Nat._3, Nat._2]] = !struct.at(offsets(3)).asInstanceOf[Ptr[CArray[_root_.sn.gnome.glib.internal.gpointer, Nat.Digit2[Nat._3, Nat._2]]]]
      inline def padding_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat.Digit2[Nat._3, Nat._2]]): Unit = !struct.at(offsets(3)).asInstanceOf[Ptr[CArray[_root_.sn.gnome.glib.internal.gpointer, Nat.Digit2[Nat._3, Nat._2]]]] = value
    end extension
  
  // Allocates GDBusProxyClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GDBusProxyClass] = scala.scalanative.unsafe.alloc[GDBusProxyClass](1)
  def apply(parent_class : _root_.sn.gnome.gobject.internal.GObjectClass, g_properties_changed : CFuncPtr3[Ptr[GDBusProxy], Ptr[_root_.sn.gnome.glib.internal.GVariant], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]], Unit], g_signal : CFuncPtr4[Ptr[GDBusProxy], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit], padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat.Digit2[Nat._3, Nat._2]])(using Zone): Ptr[GDBusProxyClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).g_properties_changed = g_properties_changed
    (!____ptr).g_signal = g_signal
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
    res(1) = align(res(0) + sizeof[_root_.sn.gnome.gobject.internal.GObjectClass].toInt, alignmentof[CFuncPtr3[Ptr[GDBusProxy], Ptr[_root_.sn.gnome.glib.internal.GVariant], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]], Unit]].toInt)
    res(2) = align(res(1) + sizeof[CFuncPtr3[Ptr[GDBusProxy], Ptr[_root_.sn.gnome.glib.internal.GVariant], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]], Unit]].toInt, alignmentof[CFuncPtr4[Ptr[GDBusProxy], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit]].toInt)
    res(3) = align(res(2) + sizeof[CFuncPtr4[Ptr[GDBusProxy], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit]].toInt, alignmentof[_root_.sn.gnome.glib.internal.gpointer].toInt)
    res
  end offsets