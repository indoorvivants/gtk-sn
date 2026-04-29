package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GMutex = CArray[Byte, Nat._8]
object _GMutex:
  given _tag: Tag[_GMutex] = Tag.CArray[CChar, Nat._8](Tag.Byte, Tag.Nat8)
  
  def apply()(using Zone): Ptr[_GMutex] =
    val ___ptr = _root_.scala.scalanative.unsafe.alloc[_GMutex](1)
    ___ptr
  
  @scala.annotation.targetName("apply_p")
  def apply(p: gpointer)(using Zone): Ptr[_GMutex] =
    val ___ptr = _root_.scala.scalanative.unsafe.alloc[_GMutex](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[gpointer]].update(0, p)
    ___ptr
  
  @scala.annotation.targetName("apply_i")
  def apply(i: CArray[guint, Nat._2])(using Zone): Ptr[_GMutex] =
    val ___ptr = _root_.scala.scalanative.unsafe.alloc[_GMutex](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[CArray[guint, Nat._2]]].update(0, i)
    ___ptr
  
  extension (struct: _GMutex)
    inline def p : gpointer = !struct.at(0).asInstanceOf[Ptr[gpointer]]
    inline def p_=(value: gpointer): Unit = !struct.at(0).asInstanceOf[Ptr[gpointer]] = value
    inline def i : CArray[guint, Nat._2] = !struct.at(0).asInstanceOf[Ptr[CArray[guint, Nat._2]]]
    inline def i_=(value: CArray[guint, Nat._2]): Unit = !struct.at(0).asInstanceOf[Ptr[CArray[guint, Nat._2]]] = value