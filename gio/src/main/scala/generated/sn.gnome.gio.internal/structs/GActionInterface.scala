package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GActionInterface = CArray[CChar, Nat.Digit2[Nat._8, Nat._0]]

object GActionInterface:
  given _tag: Tag[GActionInterface] = Tag.CArray[CChar, Nat.Digit2[Nat._8, Nat._0]](Tag.Byte, Tag.Digit2[Nat._8, Nat._0](Tag.Nat8, Tag.Nat0))
  
  export fields.*
  private[internal] object fields:
    extension (struct: GActionInterface)
      inline def g_iface: _root_.sn.gnome.gobject.internal.GTypeInterface = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GTypeInterface]]
      inline def g_iface_=(value: _root_.sn.gnome.gobject.internal.GTypeInterface): Unit = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GTypeInterface]] = value
      inline def get_name: CFuncPtr1[Ptr[GAction], Ptr[_root_.sn.gnome.glib.internal.gchar]] = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GAction], Ptr[_root_.sn.gnome.glib.internal.gchar]]]]
      inline def get_name_=(value: CFuncPtr1[Ptr[GAction], Ptr[_root_.sn.gnome.glib.internal.gchar]]): Unit = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GAction], Ptr[_root_.sn.gnome.glib.internal.gchar]]]] = value
      inline def get_parameter_type: CFuncPtr1[Ptr[GAction], Ptr[_root_.sn.gnome.glib.internal.GVariantType]] = !struct.at(offsets(2)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GAction], Ptr[_root_.sn.gnome.glib.internal.GVariantType]]]]
      inline def get_parameter_type_=(value: CFuncPtr1[Ptr[GAction], Ptr[_root_.sn.gnome.glib.internal.GVariantType]]): Unit = !struct.at(offsets(2)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GAction], Ptr[_root_.sn.gnome.glib.internal.GVariantType]]]] = value
      inline def get_state_type: CFuncPtr1[Ptr[GAction], Ptr[_root_.sn.gnome.glib.internal.GVariantType]] = !struct.at(offsets(3)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GAction], Ptr[_root_.sn.gnome.glib.internal.GVariantType]]]]
      inline def get_state_type_=(value: CFuncPtr1[Ptr[GAction], Ptr[_root_.sn.gnome.glib.internal.GVariantType]]): Unit = !struct.at(offsets(3)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GAction], Ptr[_root_.sn.gnome.glib.internal.GVariantType]]]] = value
      inline def get_state_hint: CFuncPtr1[Ptr[GAction], Ptr[_root_.sn.gnome.glib.internal.GVariant]] = !struct.at(offsets(4)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GAction], Ptr[_root_.sn.gnome.glib.internal.GVariant]]]]
      inline def get_state_hint_=(value: CFuncPtr1[Ptr[GAction], Ptr[_root_.sn.gnome.glib.internal.GVariant]]): Unit = !struct.at(offsets(4)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GAction], Ptr[_root_.sn.gnome.glib.internal.GVariant]]]] = value
      inline def get_enabled: CFuncPtr1[Ptr[GAction], _root_.sn.gnome.glib.internal.gboolean] = !struct.at(offsets(5)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GAction], _root_.sn.gnome.glib.internal.gboolean]]]
      inline def get_enabled_=(value: CFuncPtr1[Ptr[GAction], _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at(offsets(5)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GAction], _root_.sn.gnome.glib.internal.gboolean]]] = value
      inline def get_state: CFuncPtr1[Ptr[GAction], Ptr[_root_.sn.gnome.glib.internal.GVariant]] = !struct.at(offsets(6)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GAction], Ptr[_root_.sn.gnome.glib.internal.GVariant]]]]
      inline def get_state_=(value: CFuncPtr1[Ptr[GAction], Ptr[_root_.sn.gnome.glib.internal.GVariant]]): Unit = !struct.at(offsets(6)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GAction], Ptr[_root_.sn.gnome.glib.internal.GVariant]]]] = value
      inline def change_state: CFuncPtr2[Ptr[GAction], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit] = !struct.at(offsets(7)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GAction], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit]]]
      inline def change_state_=(value: CFuncPtr2[Ptr[GAction], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit]): Unit = !struct.at(offsets(7)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GAction], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit]]] = value
      inline def activate: CFuncPtr2[Ptr[GAction], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit] = !struct.at(offsets(8)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GAction], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit]]]
      inline def activate_=(value: CFuncPtr2[Ptr[GAction], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit]): Unit = !struct.at(offsets(8)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GAction], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit]]] = value
    end extension
  
  // Allocates GActionInterface on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GActionInterface] = scala.scalanative.unsafe.alloc[GActionInterface](1)
  def apply(g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface, get_name : CFuncPtr1[Ptr[GAction], Ptr[_root_.sn.gnome.glib.internal.gchar]], get_parameter_type : CFuncPtr1[Ptr[GAction], Ptr[_root_.sn.gnome.glib.internal.GVariantType]], get_state_type : CFuncPtr1[Ptr[GAction], Ptr[_root_.sn.gnome.glib.internal.GVariantType]], get_state_hint : CFuncPtr1[Ptr[GAction], Ptr[_root_.sn.gnome.glib.internal.GVariant]], get_enabled : CFuncPtr1[Ptr[GAction], _root_.sn.gnome.glib.internal.gboolean], get_state : CFuncPtr1[Ptr[GAction], Ptr[_root_.sn.gnome.glib.internal.GVariant]], change_state : CFuncPtr2[Ptr[GAction], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit], activate : CFuncPtr2[Ptr[GAction], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit])(using Zone): Ptr[GActionInterface] =
    val ____ptr = apply()
    (!____ptr).g_iface = g_iface
    (!____ptr).get_name = get_name
    (!____ptr).get_parameter_type = get_parameter_type
    (!____ptr).get_state_type = get_state_type
    (!____ptr).get_state_hint = get_state_hint
    (!____ptr).get_enabled = get_enabled
    (!____ptr).get_state = get_state
    (!____ptr).change_state = change_state
    (!____ptr).activate = activate
    ____ptr
  
  val offsets: Array[Int] =
    val res = Array.ofDim[Int](9)
    def align(offset: Int, alignment: Int) = {
      val alignmentMask = alignment - 1
      val padding =
        if ((offset & alignmentMask) == 0) 0
        else alignment - (offset & alignmentMask)
      offset + padding
    }
    
    res(0) = align(0, alignmentof[_root_.sn.gnome.gobject.internal.GTypeInterface].toInt)
    res(1) = align(res(0) + sizeof[_root_.sn.gnome.gobject.internal.GTypeInterface].toInt, alignmentof[CFuncPtr1[Ptr[GAction], Ptr[_root_.sn.gnome.glib.internal.gchar]]].toInt)
    res(2) = align(res(1) + sizeof[CFuncPtr1[Ptr[GAction], Ptr[_root_.sn.gnome.glib.internal.gchar]]].toInt, alignmentof[CFuncPtr1[Ptr[GAction], Ptr[_root_.sn.gnome.glib.internal.GVariantType]]].toInt)
    res(3) = align(res(2) + sizeof[CFuncPtr1[Ptr[GAction], Ptr[_root_.sn.gnome.glib.internal.GVariantType]]].toInt, alignmentof[CFuncPtr1[Ptr[GAction], Ptr[_root_.sn.gnome.glib.internal.GVariantType]]].toInt)
    res(4) = align(res(3) + sizeof[CFuncPtr1[Ptr[GAction], Ptr[_root_.sn.gnome.glib.internal.GVariantType]]].toInt, alignmentof[CFuncPtr1[Ptr[GAction], Ptr[_root_.sn.gnome.glib.internal.GVariant]]].toInt)
    res(5) = align(res(4) + sizeof[CFuncPtr1[Ptr[GAction], Ptr[_root_.sn.gnome.glib.internal.GVariant]]].toInt, alignmentof[CFuncPtr1[Ptr[GAction], _root_.sn.gnome.glib.internal.gboolean]].toInt)
    res(6) = align(res(5) + sizeof[CFuncPtr1[Ptr[GAction], _root_.sn.gnome.glib.internal.gboolean]].toInt, alignmentof[CFuncPtr1[Ptr[GAction], Ptr[_root_.sn.gnome.glib.internal.GVariant]]].toInt)
    res(7) = align(res(6) + sizeof[CFuncPtr1[Ptr[GAction], Ptr[_root_.sn.gnome.glib.internal.GVariant]]].toInt, alignmentof[CFuncPtr2[Ptr[GAction], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit]].toInt)
    res(8) = align(res(7) + sizeof[CFuncPtr2[Ptr[GAction], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit]].toInt, alignmentof[CFuncPtr2[Ptr[GAction], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit]].toInt)
    res
  end offsets