package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GActionEntry = CArray[CChar, Nat.Digit2[Nat._6, Nat._4]]

object GActionEntry:
  given _tag: Tag[GActionEntry] = Tag.CArray[CChar, Nat.Digit2[Nat._6, Nat._4]](Tag.Byte, Tag.Digit2[Nat._6, Nat._4](Tag.Nat6, Tag.Nat4))
  
  export fields.*
  private[internal] object fields:
    extension (struct: GActionEntry)
      inline def name: Ptr[_root_.sn.gnome.glib.internal.gchar] = !struct.at(offsets(0)).asInstanceOf[Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]]
      inline def name_=(value: Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = !struct.at(offsets(0)).asInstanceOf[Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]] = value
      inline def activate: CFuncPtr3[Ptr[GSimpleAction], Ptr[_root_.sn.gnome.glib.internal.GVariant], _root_.sn.gnome.glib.internal.gpointer, Unit] = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GSimpleAction], Ptr[_root_.sn.gnome.glib.internal.GVariant], _root_.sn.gnome.glib.internal.gpointer, Unit]]]
      inline def activate_=(value: CFuncPtr3[Ptr[GSimpleAction], Ptr[_root_.sn.gnome.glib.internal.GVariant], _root_.sn.gnome.glib.internal.gpointer, Unit]): Unit = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GSimpleAction], Ptr[_root_.sn.gnome.glib.internal.GVariant], _root_.sn.gnome.glib.internal.gpointer, Unit]]] = value
      inline def parameter_type: Ptr[_root_.sn.gnome.glib.internal.gchar] = !struct.at(offsets(2)).asInstanceOf[Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]]
      inline def parameter_type_=(value: Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = !struct.at(offsets(2)).asInstanceOf[Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]] = value
      inline def state: Ptr[_root_.sn.gnome.glib.internal.gchar] = !struct.at(offsets(3)).asInstanceOf[Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]]
      inline def state_=(value: Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = !struct.at(offsets(3)).asInstanceOf[Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]] = value
      inline def change_state: CFuncPtr3[Ptr[GSimpleAction], Ptr[_root_.sn.gnome.glib.internal.GVariant], _root_.sn.gnome.glib.internal.gpointer, Unit] = !struct.at(offsets(4)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GSimpleAction], Ptr[_root_.sn.gnome.glib.internal.GVariant], _root_.sn.gnome.glib.internal.gpointer, Unit]]]
      inline def change_state_=(value: CFuncPtr3[Ptr[GSimpleAction], Ptr[_root_.sn.gnome.glib.internal.GVariant], _root_.sn.gnome.glib.internal.gpointer, Unit]): Unit = !struct.at(offsets(4)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GSimpleAction], Ptr[_root_.sn.gnome.glib.internal.GVariant], _root_.sn.gnome.glib.internal.gpointer, Unit]]] = value
      inline def padding: CArray[_root_.sn.gnome.glib.internal.gsize, Nat._3] = !struct.at(offsets(5)).asInstanceOf[Ptr[CArray[_root_.sn.gnome.glib.internal.gsize, Nat._3]]]
      inline def padding_=(value: CArray[_root_.sn.gnome.glib.internal.gsize, Nat._3]): Unit = !struct.at(offsets(5)).asInstanceOf[Ptr[CArray[_root_.sn.gnome.glib.internal.gsize, Nat._3]]] = value
    end extension
  
  // Allocates GActionEntry on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GActionEntry] = scala.scalanative.unsafe.alloc[GActionEntry](1)
  def apply(name : Ptr[_root_.sn.gnome.glib.internal.gchar], activate : CFuncPtr3[Ptr[GSimpleAction], Ptr[_root_.sn.gnome.glib.internal.GVariant], _root_.sn.gnome.glib.internal.gpointer, Unit], parameter_type : Ptr[_root_.sn.gnome.glib.internal.gchar], state : Ptr[_root_.sn.gnome.glib.internal.gchar], change_state : CFuncPtr3[Ptr[GSimpleAction], Ptr[_root_.sn.gnome.glib.internal.GVariant], _root_.sn.gnome.glib.internal.gpointer, Unit], padding : CArray[_root_.sn.gnome.glib.internal.gsize, Nat._3])(using Zone): Ptr[GActionEntry] =
    val ____ptr = apply()
    (!____ptr).name = name
    (!____ptr).activate = activate
    (!____ptr).parameter_type = parameter_type
    (!____ptr).state = state
    (!____ptr).change_state = change_state
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
    
    res(0) = align(0, alignmentof[Ptr[_root_.sn.gnome.glib.internal.gchar]].toInt)
    res(1) = align(res(0) + sizeof[Ptr[_root_.sn.gnome.glib.internal.gchar]].toInt, alignmentof[CFuncPtr3[Ptr[GSimpleAction], Ptr[_root_.sn.gnome.glib.internal.GVariant], _root_.sn.gnome.glib.internal.gpointer, Unit]].toInt)
    res(2) = align(res(1) + sizeof[CFuncPtr3[Ptr[GSimpleAction], Ptr[_root_.sn.gnome.glib.internal.GVariant], _root_.sn.gnome.glib.internal.gpointer, Unit]].toInt, alignmentof[Ptr[_root_.sn.gnome.glib.internal.gchar]].toInt)
    res(3) = align(res(2) + sizeof[Ptr[_root_.sn.gnome.glib.internal.gchar]].toInt, alignmentof[Ptr[_root_.sn.gnome.glib.internal.gchar]].toInt)
    res(4) = align(res(3) + sizeof[Ptr[_root_.sn.gnome.glib.internal.gchar]].toInt, alignmentof[CFuncPtr3[Ptr[GSimpleAction], Ptr[_root_.sn.gnome.glib.internal.GVariant], _root_.sn.gnome.glib.internal.gpointer, Unit]].toInt)
    res(5) = align(res(4) + sizeof[CFuncPtr3[Ptr[GSimpleAction], Ptr[_root_.sn.gnome.glib.internal.GVariant], _root_.sn.gnome.glib.internal.gpointer, Unit]].toInt, alignmentof[_root_.sn.gnome.glib.internal.gsize].toInt)
    res
  end offsets