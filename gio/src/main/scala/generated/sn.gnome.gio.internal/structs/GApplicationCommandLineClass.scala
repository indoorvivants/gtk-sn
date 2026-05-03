package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GApplicationCommandLineClass = CArray[CChar, Nat.Digit3[Nat._2, Nat._4, Nat._8]]

object GApplicationCommandLineClass:
  given _tag: Tag[GApplicationCommandLineClass] = Tag.CArray[CChar, Nat.Digit3[Nat._2, Nat._4, Nat._8]](Tag.Byte, Tag.Digit3[Nat._2, Nat._4, Nat._8](Tag.Nat2, Tag.Nat4, Tag.Nat8))
  
  export fields.*
  private[internal] object fields:
    extension (struct: GApplicationCommandLineClass)
      inline def parent_class: _root_.sn.gnome.gobject.internal.GObjectClass = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GObjectClass]]
      inline def parent_class_=(value: _root_.sn.gnome.gobject.internal.GObjectClass): Unit = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GObjectClass]] = value
      inline def print_literal: CFuncPtr2[Ptr[GApplicationCommandLine], Ptr[_root_.sn.gnome.glib.internal.gchar], Unit] = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GApplicationCommandLine], Ptr[_root_.sn.gnome.glib.internal.gchar], Unit]]]
      inline def print_literal_=(value: CFuncPtr2[Ptr[GApplicationCommandLine], Ptr[_root_.sn.gnome.glib.internal.gchar], Unit]): Unit = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GApplicationCommandLine], Ptr[_root_.sn.gnome.glib.internal.gchar], Unit]]] = value
      inline def printerr_literal: CFuncPtr2[Ptr[GApplicationCommandLine], Ptr[_root_.sn.gnome.glib.internal.gchar], Unit] = !struct.at(offsets(2)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GApplicationCommandLine], Ptr[_root_.sn.gnome.glib.internal.gchar], Unit]]]
      inline def printerr_literal_=(value: CFuncPtr2[Ptr[GApplicationCommandLine], Ptr[_root_.sn.gnome.glib.internal.gchar], Unit]): Unit = !struct.at(offsets(2)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GApplicationCommandLine], Ptr[_root_.sn.gnome.glib.internal.gchar], Unit]]] = value
      inline def get_stdin: CFuncPtr1[Ptr[GApplicationCommandLine], Ptr[GInputStream]] = !struct.at(offsets(3)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GApplicationCommandLine], Ptr[GInputStream]]]]
      inline def get_stdin_=(value: CFuncPtr1[Ptr[GApplicationCommandLine], Ptr[GInputStream]]): Unit = !struct.at(offsets(3)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GApplicationCommandLine], Ptr[GInputStream]]]] = value
      inline def done: CFuncPtr1[Ptr[GApplicationCommandLine], Unit] = !struct.at(offsets(4)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GApplicationCommandLine], Unit]]]
      inline def done_=(value: CFuncPtr1[Ptr[GApplicationCommandLine], Unit]): Unit = !struct.at(offsets(4)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GApplicationCommandLine], Unit]]] = value
      inline def padding: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat.Digit2[Nat._1, Nat._0]] = !struct.at(offsets(5)).asInstanceOf[Ptr[CArray[_root_.sn.gnome.glib.internal.gpointer, Nat.Digit2[Nat._1, Nat._0]]]]
      inline def padding_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat.Digit2[Nat._1, Nat._0]]): Unit = !struct.at(offsets(5)).asInstanceOf[Ptr[CArray[_root_.sn.gnome.glib.internal.gpointer, Nat.Digit2[Nat._1, Nat._0]]]] = value
    end extension
  
  // Allocates GApplicationCommandLineClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GApplicationCommandLineClass] = scala.scalanative.unsafe.alloc[GApplicationCommandLineClass](1)
  def apply(parent_class : _root_.sn.gnome.gobject.internal.GObjectClass, print_literal : CFuncPtr2[Ptr[GApplicationCommandLine], Ptr[_root_.sn.gnome.glib.internal.gchar], Unit], printerr_literal : CFuncPtr2[Ptr[GApplicationCommandLine], Ptr[_root_.sn.gnome.glib.internal.gchar], Unit], get_stdin : CFuncPtr1[Ptr[GApplicationCommandLine], Ptr[GInputStream]], done : CFuncPtr1[Ptr[GApplicationCommandLine], Unit], padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat.Digit2[Nat._1, Nat._0]])(using Zone): Ptr[GApplicationCommandLineClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).print_literal = print_literal
    (!____ptr).printerr_literal = printerr_literal
    (!____ptr).get_stdin = get_stdin
    (!____ptr).done = done
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
    res(1) = align(res(0) + sizeof[_root_.sn.gnome.gobject.internal.GObjectClass].toInt, alignmentof[CFuncPtr2[Ptr[GApplicationCommandLine], Ptr[_root_.sn.gnome.glib.internal.gchar], Unit]].toInt)
    res(2) = align(res(1) + sizeof[CFuncPtr2[Ptr[GApplicationCommandLine], Ptr[_root_.sn.gnome.glib.internal.gchar], Unit]].toInt, alignmentof[CFuncPtr2[Ptr[GApplicationCommandLine], Ptr[_root_.sn.gnome.glib.internal.gchar], Unit]].toInt)
    res(3) = align(res(2) + sizeof[CFuncPtr2[Ptr[GApplicationCommandLine], Ptr[_root_.sn.gnome.glib.internal.gchar], Unit]].toInt, alignmentof[CFuncPtr1[Ptr[GApplicationCommandLine], Ptr[GInputStream]]].toInt)
    res(4) = align(res(3) + sizeof[CFuncPtr1[Ptr[GApplicationCommandLine], Ptr[GInputStream]]].toInt, alignmentof[CFuncPtr1[Ptr[GApplicationCommandLine], Unit]].toInt)
    res(5) = align(res(4) + sizeof[CFuncPtr1[Ptr[GApplicationCommandLine], Unit]].toInt, alignmentof[_root_.sn.gnome.glib.internal.gpointer].toInt)
    res
  end offsets