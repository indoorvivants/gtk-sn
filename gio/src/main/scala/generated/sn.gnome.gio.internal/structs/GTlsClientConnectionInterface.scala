package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GTlsClientConnectionInterface: _iface: The parent interface. _session_state: Copies session state from one #GTlsClientConnection to another.
*/
opaque type GTlsClientConnectionInterface = CArray[CChar, Nat.Digit2[Nat._2, Nat._4]]

object GTlsClientConnectionInterface:
  given _tag: Tag[GTlsClientConnectionInterface] = Tag.CArray[CChar, Nat.Digit2[Nat._2, Nat._4]](Tag.Byte, Tag.Digit2[Nat._2, Nat._4](Tag.Nat2, Tag.Nat4))
  
  export fields.*
  private[internal] object fields:
    extension (struct: GTlsClientConnectionInterface)
      inline def g_iface: _root_.sn.gnome.gobject.internal.GTypeInterface = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GTypeInterface]]
      inline def g_iface_=(value: _root_.sn.gnome.gobject.internal.GTypeInterface): Unit = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GTypeInterface]] = value
      inline def copy_session_state: CFuncPtr2[Ptr[GTlsClientConnection], Ptr[GTlsClientConnection], Unit] = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GTlsClientConnection], Ptr[GTlsClientConnection], Unit]]]
      inline def copy_session_state_=(value: CFuncPtr2[Ptr[GTlsClientConnection], Ptr[GTlsClientConnection], Unit]): Unit = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GTlsClientConnection], Ptr[GTlsClientConnection], Unit]]] = value
    end extension
  
  // Allocates GTlsClientConnectionInterface on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GTlsClientConnectionInterface] = scala.scalanative.unsafe.alloc[GTlsClientConnectionInterface](1)
  def apply(g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface, copy_session_state : CFuncPtr2[Ptr[GTlsClientConnection], Ptr[GTlsClientConnection], Unit])(using Zone): Ptr[GTlsClientConnectionInterface] =
    val ____ptr = apply()
    (!____ptr).g_iface = g_iface
    (!____ptr).copy_session_state = copy_session_state
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
    
    res(0) = align(0, alignmentof[_root_.sn.gnome.gobject.internal.GTypeInterface].toInt)
    res(1) = align(res(0) + sizeof[_root_.sn.gnome.gobject.internal.GTypeInterface].toInt, alignmentof[CFuncPtr2[Ptr[GTlsClientConnection], Ptr[GTlsClientConnection], Unit]].toInt)
    res
  end offsets