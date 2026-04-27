package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GSocketConnectableIface: _iface: The parent interface. : Creates a #GSocketAddressEnumerator _enumerate: Creates a #GProxyAddressEnumerator _string: Format the connectable’s address as a string for debugging. Implementing this is optional. (Since: 2.48)
*/
opaque type GSocketConnectableIface = CArray[CChar, Nat.Digit2[Nat._4, Nat._0]]

object GSocketConnectableIface:
  given _tag: Tag[GSocketConnectableIface] = Tag.CArray[CChar, Nat.Digit2[Nat._4, Nat._0]](Tag.Byte, Tag.Digit2[Nat._4, Nat._0](Tag.Nat4, Tag.Nat0))
  
  export fields.*
  private[internal] object fields:
    extension (struct: GSocketConnectableIface)
      inline def g_iface: _root_.sn.gnome.gobject.internal.GTypeInterface = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GTypeInterface]]
      inline def g_iface_=(value: _root_.sn.gnome.gobject.internal.GTypeInterface): Unit = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GTypeInterface]] = value
      inline def enumerate: CFuncPtr1[Ptr[GSocketConnectable], Ptr[GSocketAddressEnumerator]] = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GSocketConnectable], Ptr[GSocketAddressEnumerator]]]]
      inline def enumerate_=(value: CFuncPtr1[Ptr[GSocketConnectable], Ptr[GSocketAddressEnumerator]]): Unit = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GSocketConnectable], Ptr[GSocketAddressEnumerator]]]] = value
      inline def proxy_enumerate: CFuncPtr1[Ptr[GSocketConnectable], Ptr[GSocketAddressEnumerator]] = !struct.at(offsets(2)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GSocketConnectable], Ptr[GSocketAddressEnumerator]]]]
      inline def proxy_enumerate_=(value: CFuncPtr1[Ptr[GSocketConnectable], Ptr[GSocketAddressEnumerator]]): Unit = !struct.at(offsets(2)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GSocketConnectable], Ptr[GSocketAddressEnumerator]]]] = value
      inline def to_string: CFuncPtr1[Ptr[GSocketConnectable], Ptr[_root_.sn.gnome.glib.internal.gchar]] = !struct.at(offsets(3)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GSocketConnectable], Ptr[_root_.sn.gnome.glib.internal.gchar]]]]
      inline def to_string_=(value: CFuncPtr1[Ptr[GSocketConnectable], Ptr[_root_.sn.gnome.glib.internal.gchar]]): Unit = !struct.at(offsets(3)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GSocketConnectable], Ptr[_root_.sn.gnome.glib.internal.gchar]]]] = value
    end extension
  
  // Allocates GSocketConnectableIface on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GSocketConnectableIface] = scala.scalanative.unsafe.alloc[GSocketConnectableIface](1)
  def apply(g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface, enumerate : CFuncPtr1[Ptr[GSocketConnectable], Ptr[GSocketAddressEnumerator]], proxy_enumerate : CFuncPtr1[Ptr[GSocketConnectable], Ptr[GSocketAddressEnumerator]], to_string : CFuncPtr1[Ptr[GSocketConnectable], Ptr[_root_.sn.gnome.glib.internal.gchar]])(using Zone): Ptr[GSocketConnectableIface] =
    val ____ptr = apply()
    (!____ptr).g_iface = g_iface
    (!____ptr).enumerate = enumerate
    (!____ptr).proxy_enumerate = proxy_enumerate
    (!____ptr).to_string = to_string
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
    
    res(0) = align(0, alignmentof[_root_.sn.gnome.gobject.internal.GTypeInterface].toInt)
    res(1) = align(res(0) + sizeof[_root_.sn.gnome.gobject.internal.GTypeInterface].toInt, alignmentof[CFuncPtr1[Ptr[GSocketConnectable], Ptr[GSocketAddressEnumerator]]].toInt)
    res(2) = align(res(1) + sizeof[CFuncPtr1[Ptr[GSocketConnectable], Ptr[GSocketAddressEnumerator]]].toInt, alignmentof[CFuncPtr1[Ptr[GSocketConnectable], Ptr[GSocketAddressEnumerator]]].toInt)
    res(3) = align(res(2) + sizeof[CFuncPtr1[Ptr[GSocketConnectable], Ptr[GSocketAddressEnumerator]]].toInt, alignmentof[CFuncPtr1[Ptr[GSocketConnectable], Ptr[_root_.sn.gnome.glib.internal.gchar]]].toInt)
    res
  end offsets