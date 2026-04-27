package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GDBusErrorEntry: _code: An error code. _error_name: The D-Bus error name to associate with _code.
*/
opaque type GDBusErrorEntry = CArray[CChar, Nat.Digit2[Nat._1, Nat._6]]

object GDBusErrorEntry:
  given _tag: Tag[GDBusErrorEntry] = Tag.CArray[CChar, Nat.Digit2[Nat._1, Nat._6]](Tag.Byte, Tag.Digit2[Nat._1, Nat._6](Tag.Nat1, Tag.Nat6))
  
  export fields.*
  private[internal] object fields:
    extension (struct: GDBusErrorEntry)
      inline def error_code: _root_.sn.gnome.glib.internal.gint = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gint]]
      inline def error_code_=(value: _root_.sn.gnome.glib.internal.gint): Unit = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gint]] = value
      inline def dbus_error_name: Ptr[_root_.sn.gnome.glib.internal.gchar] = !struct.at(offsets(1)).asInstanceOf[Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]]
      inline def dbus_error_name_=(value: Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = !struct.at(offsets(1)).asInstanceOf[Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]] = value
    end extension
  
  // Allocates GDBusErrorEntry on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GDBusErrorEntry] = scala.scalanative.unsafe.alloc[GDBusErrorEntry](1)
  def apply(error_code : _root_.sn.gnome.glib.internal.gint, dbus_error_name : Ptr[_root_.sn.gnome.glib.internal.gchar])(using Zone): Ptr[GDBusErrorEntry] =
    val ____ptr = apply()
    (!____ptr).error_code = error_code
    (!____ptr).dbus_error_name = dbus_error_name
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
    
    res(0) = align(0, alignmentof[_root_.sn.gnome.glib.internal.gint].toInt)
    res(1) = align(res(0) + sizeof[_root_.sn.gnome.glib.internal.gint].toInt, alignmentof[Ptr[_root_.sn.gnome.glib.internal.gchar]].toInt)
    res
  end offsets