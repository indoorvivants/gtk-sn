package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GActionGroupInterface = CArray[CChar, Nat.Digit3[Nat._1, Nat._2, Nat._8]]

object GActionGroupInterface:
  given _tag: Tag[GActionGroupInterface] = Tag.CArray[CChar, Nat.Digit3[Nat._1, Nat._2, Nat._8]](Tag.Byte, Tag.Digit3[Nat._1, Nat._2, Nat._8](Tag.Nat1, Tag.Nat2, Tag.Nat8))
  
  export fields.*
  private[internal] object fields:
    extension (struct: GActionGroupInterface)
      inline def g_iface: _root_.sn.gnome.gobject.internal.GTypeInterface = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GTypeInterface]]
      inline def g_iface_=(value: _root_.sn.gnome.gobject.internal.GTypeInterface): Unit = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GTypeInterface]] = value
      inline def has_action: CFuncPtr2[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.gboolean] = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.gboolean]]]
      inline def has_action_=(value: CFuncPtr2[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.gboolean]]] = value
      inline def list_actions: CFuncPtr1[Ptr[GActionGroup], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]] = !struct.at(offsets(2)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GActionGroup], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]]]]
      inline def list_actions_=(value: CFuncPtr1[Ptr[GActionGroup], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]]): Unit = !struct.at(offsets(2)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GActionGroup], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]]]] = value
      inline def get_action_enabled: CFuncPtr2[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.gboolean] = !struct.at(offsets(3)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.gboolean]]]
      inline def get_action_enabled_=(value: CFuncPtr2[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at(offsets(3)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.gboolean]]] = value
      inline def get_action_parameter_type: CFuncPtr2[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariantType]] = !struct.at(offsets(4)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariantType]]]]
      inline def get_action_parameter_type_=(value: CFuncPtr2[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariantType]]): Unit = !struct.at(offsets(4)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariantType]]]] = value
      inline def get_action_state_type: CFuncPtr2[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariantType]] = !struct.at(offsets(5)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariantType]]]]
      inline def get_action_state_type_=(value: CFuncPtr2[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariantType]]): Unit = !struct.at(offsets(5)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariantType]]]] = value
      inline def get_action_state_hint: CFuncPtr2[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant]] = !struct.at(offsets(6)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant]]]]
      inline def get_action_state_hint_=(value: CFuncPtr2[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant]]): Unit = !struct.at(offsets(6)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant]]]] = value
      inline def get_action_state: CFuncPtr2[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant]] = !struct.at(offsets(7)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant]]]]
      inline def get_action_state_=(value: CFuncPtr2[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant]]): Unit = !struct.at(offsets(7)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant]]]] = value
      inline def change_action_state: CFuncPtr3[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit] = !struct.at(offsets(8)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit]]]
      inline def change_action_state_=(value: CFuncPtr3[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit]): Unit = !struct.at(offsets(8)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit]]] = value
      inline def activate_action: CFuncPtr3[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit] = !struct.at(offsets(9)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit]]]
      inline def activate_action_=(value: CFuncPtr3[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit]): Unit = !struct.at(offsets(9)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit]]] = value
      inline def action_added: CFuncPtr2[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Unit] = !struct.at(offsets(10)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Unit]]]
      inline def action_added_=(value: CFuncPtr2[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Unit]): Unit = !struct.at(offsets(10)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Unit]]] = value
      inline def action_removed: CFuncPtr2[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Unit] = !struct.at(offsets(11)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Unit]]]
      inline def action_removed_=(value: CFuncPtr2[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Unit]): Unit = !struct.at(offsets(11)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Unit]]] = value
      inline def action_enabled_changed: CFuncPtr3[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.gboolean, Unit] = !struct.at(offsets(12)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.gboolean, Unit]]]
      inline def action_enabled_changed_=(value: CFuncPtr3[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.gboolean, Unit]): Unit = !struct.at(offsets(12)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.gboolean, Unit]]] = value
      inline def action_state_changed: CFuncPtr3[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit] = !struct.at(offsets(13)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit]]]
      inline def action_state_changed_=(value: CFuncPtr3[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit]): Unit = !struct.at(offsets(13)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit]]] = value
      inline def query_action: CFuncPtr7[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gboolean], Ptr[Ptr[_root_.sn.gnome.glib.internal.GVariantType]], Ptr[Ptr[_root_.sn.gnome.glib.internal.GVariantType]], Ptr[Ptr[_root_.sn.gnome.glib.internal.GVariant]], Ptr[Ptr[_root_.sn.gnome.glib.internal.GVariant]], _root_.sn.gnome.glib.internal.gboolean] = !struct.at(offsets(14)).asInstanceOf[Ptr[CFuncPtr7[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gboolean], Ptr[Ptr[_root_.sn.gnome.glib.internal.GVariantType]], Ptr[Ptr[_root_.sn.gnome.glib.internal.GVariantType]], Ptr[Ptr[_root_.sn.gnome.glib.internal.GVariant]], Ptr[Ptr[_root_.sn.gnome.glib.internal.GVariant]], _root_.sn.gnome.glib.internal.gboolean]]]
      inline def query_action_=(value: CFuncPtr7[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gboolean], Ptr[Ptr[_root_.sn.gnome.glib.internal.GVariantType]], Ptr[Ptr[_root_.sn.gnome.glib.internal.GVariantType]], Ptr[Ptr[_root_.sn.gnome.glib.internal.GVariant]], Ptr[Ptr[_root_.sn.gnome.glib.internal.GVariant]], _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at(offsets(14)).asInstanceOf[Ptr[CFuncPtr7[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gboolean], Ptr[Ptr[_root_.sn.gnome.glib.internal.GVariantType]], Ptr[Ptr[_root_.sn.gnome.glib.internal.GVariantType]], Ptr[Ptr[_root_.sn.gnome.glib.internal.GVariant]], Ptr[Ptr[_root_.sn.gnome.glib.internal.GVariant]], _root_.sn.gnome.glib.internal.gboolean]]] = value
    end extension
  
  // Allocates GActionGroupInterface on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GActionGroupInterface] = scala.scalanative.unsafe.alloc[GActionGroupInterface](1)
  def apply(g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface, has_action : CFuncPtr2[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.gboolean], list_actions : CFuncPtr1[Ptr[GActionGroup], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]], get_action_enabled : CFuncPtr2[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.gboolean], get_action_parameter_type : CFuncPtr2[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariantType]], get_action_state_type : CFuncPtr2[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariantType]], get_action_state_hint : CFuncPtr2[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant]], get_action_state : CFuncPtr2[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant]], change_action_state : CFuncPtr3[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit], activate_action : CFuncPtr3[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit], action_added : CFuncPtr2[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Unit], action_removed : CFuncPtr2[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Unit], action_enabled_changed : CFuncPtr3[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.gboolean, Unit], action_state_changed : CFuncPtr3[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit], query_action : CFuncPtr7[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gboolean], Ptr[Ptr[_root_.sn.gnome.glib.internal.GVariantType]], Ptr[Ptr[_root_.sn.gnome.glib.internal.GVariantType]], Ptr[Ptr[_root_.sn.gnome.glib.internal.GVariant]], Ptr[Ptr[_root_.sn.gnome.glib.internal.GVariant]], _root_.sn.gnome.glib.internal.gboolean])(using Zone): Ptr[GActionGroupInterface] =
    val ____ptr = apply()
    (!____ptr).g_iface = g_iface
    (!____ptr).has_action = has_action
    (!____ptr).list_actions = list_actions
    (!____ptr).get_action_enabled = get_action_enabled
    (!____ptr).get_action_parameter_type = get_action_parameter_type
    (!____ptr).get_action_state_type = get_action_state_type
    (!____ptr).get_action_state_hint = get_action_state_hint
    (!____ptr).get_action_state = get_action_state
    (!____ptr).change_action_state = change_action_state
    (!____ptr).activate_action = activate_action
    (!____ptr).action_added = action_added
    (!____ptr).action_removed = action_removed
    (!____ptr).action_enabled_changed = action_enabled_changed
    (!____ptr).action_state_changed = action_state_changed
    (!____ptr).query_action = query_action
    ____ptr
  
  val offsets: Array[Int] =
    val res = Array.ofDim[Int](15)
    def align(offset: Int, alignment: Int) = {
      val alignmentMask = alignment - 1
      val padding =
        if ((offset & alignmentMask) == 0) 0
        else alignment - (offset & alignmentMask)
      offset + padding
    }
    
    res(0) = align(0, alignmentof[_root_.sn.gnome.gobject.internal.GTypeInterface].toInt)
    res(1) = align(res(0) + sizeof[_root_.sn.gnome.gobject.internal.GTypeInterface].toInt, alignmentof[CFuncPtr2[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.gboolean]].toInt)
    res(2) = align(res(1) + sizeof[CFuncPtr2[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.gboolean]].toInt, alignmentof[CFuncPtr1[Ptr[GActionGroup], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]]].toInt)
    res(3) = align(res(2) + sizeof[CFuncPtr1[Ptr[GActionGroup], Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]]].toInt, alignmentof[CFuncPtr2[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.gboolean]].toInt)
    res(4) = align(res(3) + sizeof[CFuncPtr2[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.gboolean]].toInt, alignmentof[CFuncPtr2[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariantType]]].toInt)
    res(5) = align(res(4) + sizeof[CFuncPtr2[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariantType]]].toInt, alignmentof[CFuncPtr2[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariantType]]].toInt)
    res(6) = align(res(5) + sizeof[CFuncPtr2[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariantType]]].toInt, alignmentof[CFuncPtr2[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant]]].toInt)
    res(7) = align(res(6) + sizeof[CFuncPtr2[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant]]].toInt, alignmentof[CFuncPtr2[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant]]].toInt)
    res(8) = align(res(7) + sizeof[CFuncPtr2[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant]]].toInt, alignmentof[CFuncPtr3[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit]].toInt)
    res(9) = align(res(8) + sizeof[CFuncPtr3[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit]].toInt, alignmentof[CFuncPtr3[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit]].toInt)
    res(10) = align(res(9) + sizeof[CFuncPtr3[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit]].toInt, alignmentof[CFuncPtr2[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Unit]].toInt)
    res(11) = align(res(10) + sizeof[CFuncPtr2[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Unit]].toInt, alignmentof[CFuncPtr2[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Unit]].toInt)
    res(12) = align(res(11) + sizeof[CFuncPtr2[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Unit]].toInt, alignmentof[CFuncPtr3[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.gboolean, Unit]].toInt)
    res(13) = align(res(12) + sizeof[CFuncPtr3[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.gboolean, Unit]].toInt, alignmentof[CFuncPtr3[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit]].toInt)
    res(14) = align(res(13) + sizeof[CFuncPtr3[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit]].toInt, alignmentof[CFuncPtr7[Ptr[GActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gboolean], Ptr[Ptr[_root_.sn.gnome.glib.internal.GVariantType]], Ptr[Ptr[_root_.sn.gnome.glib.internal.GVariantType]], Ptr[Ptr[_root_.sn.gnome.glib.internal.GVariant]], Ptr[Ptr[_root_.sn.gnome.glib.internal.GVariant]], _root_.sn.gnome.glib.internal.gboolean]].toInt)
    res
  end offsets