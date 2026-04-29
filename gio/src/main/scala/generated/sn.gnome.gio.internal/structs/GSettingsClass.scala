package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GSettingsClass = CArray[CChar, Nat.Digit3[Nat._3, Nat._2, Nat._8]]

object GSettingsClass:
  given _tag: Tag[GSettingsClass] = Tag.CArray[CChar, Nat.Digit3[Nat._3, Nat._2, Nat._8]](Tag.Byte, Tag.Digit3[Nat._3, Nat._2, Nat._8](Tag.Nat3, Tag.Nat2, Tag.Nat8))
  
  export fields.*
  private[internal] object fields:
    extension (struct: GSettingsClass)
      inline def parent_class: _root_.sn.gnome.gobject.internal.GObjectClass = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GObjectClass]]
      inline def parent_class_=(value: _root_.sn.gnome.gobject.internal.GObjectClass): Unit = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GObjectClass]] = value
      inline def writable_changed: CFuncPtr2[Ptr[GSettings], Ptr[_root_.sn.gnome.glib.internal.gchar], Unit] = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GSettings], Ptr[_root_.sn.gnome.glib.internal.gchar], Unit]]]
      inline def writable_changed_=(value: CFuncPtr2[Ptr[GSettings], Ptr[_root_.sn.gnome.glib.internal.gchar], Unit]): Unit = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GSettings], Ptr[_root_.sn.gnome.glib.internal.gchar], Unit]]] = value
      inline def changed: CFuncPtr2[Ptr[GSettings], Ptr[_root_.sn.gnome.glib.internal.gchar], Unit] = !struct.at(offsets(2)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GSettings], Ptr[_root_.sn.gnome.glib.internal.gchar], Unit]]]
      inline def changed_=(value: CFuncPtr2[Ptr[GSettings], Ptr[_root_.sn.gnome.glib.internal.gchar], Unit]): Unit = !struct.at(offsets(2)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GSettings], Ptr[_root_.sn.gnome.glib.internal.gchar], Unit]]] = value
      inline def writable_change_event: CFuncPtr2[Ptr[GSettings], _root_.sn.gnome.glib.internal.GQuark, _root_.sn.gnome.glib.internal.gboolean] = !struct.at(offsets(3)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GSettings], _root_.sn.gnome.glib.internal.GQuark, _root_.sn.gnome.glib.internal.gboolean]]]
      inline def writable_change_event_=(value: CFuncPtr2[Ptr[GSettings], _root_.sn.gnome.glib.internal.GQuark, _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at(offsets(3)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GSettings], _root_.sn.gnome.glib.internal.GQuark, _root_.sn.gnome.glib.internal.gboolean]]] = value
      inline def change_event: CFuncPtr3[Ptr[GSettings], Ptr[_root_.sn.gnome.glib.internal.GQuark], _root_.sn.gnome.glib.internal.gint, _root_.sn.gnome.glib.internal.gboolean] = !struct.at(offsets(4)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GSettings], Ptr[_root_.sn.gnome.glib.internal.GQuark], _root_.sn.gnome.glib.internal.gint, _root_.sn.gnome.glib.internal.gboolean]]]
      inline def change_event_=(value: CFuncPtr3[Ptr[GSettings], Ptr[_root_.sn.gnome.glib.internal.GQuark], _root_.sn.gnome.glib.internal.gint, _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at(offsets(4)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GSettings], Ptr[_root_.sn.gnome.glib.internal.GQuark], _root_.sn.gnome.glib.internal.gint, _root_.sn.gnome.glib.internal.gboolean]]] = value
      inline def padding: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat.Digit2[Nat._2, Nat._0]] = !struct.at(offsets(5)).asInstanceOf[Ptr[CArray[_root_.sn.gnome.glib.internal.gpointer, Nat.Digit2[Nat._2, Nat._0]]]]
      inline def padding_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat.Digit2[Nat._2, Nat._0]]): Unit = !struct.at(offsets(5)).asInstanceOf[Ptr[CArray[_root_.sn.gnome.glib.internal.gpointer, Nat.Digit2[Nat._2, Nat._0]]]] = value
    end extension
  
  // Allocates GSettingsClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GSettingsClass] = scala.scalanative.unsafe.alloc[GSettingsClass](1)
  def apply(parent_class : _root_.sn.gnome.gobject.internal.GObjectClass, writable_changed : CFuncPtr2[Ptr[GSettings], Ptr[_root_.sn.gnome.glib.internal.gchar], Unit], changed : CFuncPtr2[Ptr[GSettings], Ptr[_root_.sn.gnome.glib.internal.gchar], Unit], writable_change_event : CFuncPtr2[Ptr[GSettings], _root_.sn.gnome.glib.internal.GQuark, _root_.sn.gnome.glib.internal.gboolean], change_event : CFuncPtr3[Ptr[GSettings], Ptr[_root_.sn.gnome.glib.internal.GQuark], _root_.sn.gnome.glib.internal.gint, _root_.sn.gnome.glib.internal.gboolean], padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat.Digit2[Nat._2, Nat._0]])(using Zone): Ptr[GSettingsClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).writable_changed = writable_changed
    (!____ptr).changed = changed
    (!____ptr).writable_change_event = writable_change_event
    (!____ptr).change_event = change_event
    (!____ptr).padding = padding
    ____ptr
  
  val offsets: Array[Int] =
    val res = Array.ofDim[Int](6)
    def align(offset: Int, alignment: Int) = {
      val alignmentMask = alignment - 1
      val padding =
        if ((offset & alignmentMask) == 0) 0
        else alignment - (offset & alignmentMask)
      offset + padding
    }
    
    res(0) = align(0, alignmentof[_root_.sn.gnome.gobject.internal.GObjectClass].toInt)
    res(1) = align(res(0) + sizeof[_root_.sn.gnome.gobject.internal.GObjectClass].toInt, alignmentof[CFuncPtr2[Ptr[GSettings], Ptr[_root_.sn.gnome.glib.internal.gchar], Unit]].toInt)
    res(2) = align(res(1) + sizeof[CFuncPtr2[Ptr[GSettings], Ptr[_root_.sn.gnome.glib.internal.gchar], Unit]].toInt, alignmentof[CFuncPtr2[Ptr[GSettings], Ptr[_root_.sn.gnome.glib.internal.gchar], Unit]].toInt)
    res(3) = align(res(2) + sizeof[CFuncPtr2[Ptr[GSettings], Ptr[_root_.sn.gnome.glib.internal.gchar], Unit]].toInt, alignmentof[CFuncPtr2[Ptr[GSettings], _root_.sn.gnome.glib.internal.GQuark, _root_.sn.gnome.glib.internal.gboolean]].toInt)
    res(4) = align(res(3) + sizeof[CFuncPtr2[Ptr[GSettings], _root_.sn.gnome.glib.internal.GQuark, _root_.sn.gnome.glib.internal.gboolean]].toInt, alignmentof[CFuncPtr3[Ptr[GSettings], Ptr[_root_.sn.gnome.glib.internal.GQuark], _root_.sn.gnome.glib.internal.gint, _root_.sn.gnome.glib.internal.gboolean]].toInt)
    res(5) = align(res(4) + sizeof[CFuncPtr3[Ptr[GSettings], Ptr[_root_.sn.gnome.glib.internal.GQuark], _root_.sn.gnome.glib.internal.gint, _root_.sn.gnome.glib.internal.gboolean]].toInt, alignmentof[_root_.sn.gnome.glib.internal.gpointer].toInt)
    res
  end offsets