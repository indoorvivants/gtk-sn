package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.3: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GMutex = CArray[Byte, Nat._8]
object GMutex:
  given _tag: Tag[GMutex] = Tag.CArray[CChar, Nat._8](Tag.Byte, Tag.Nat8)
  
  def apply()(using Zone): Ptr[GMutex] =
    val ___ptr = _root_.scala.scalanative.unsafe.alloc[GMutex](1)
    ___ptr
  
  @scala.annotation.targetName("apply_p")
  def apply(p: _root_.sn.gnome.glib.internal.gpointer)(using Zone): Ptr[GMutex] =
    val ___ptr = _root_.scala.scalanative.unsafe.alloc[GMutex](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gpointer]].update(0, p)
    ___ptr
  
  @scala.annotation.targetName("apply_i")
  def apply(i: CArray[_root_.sn.gnome.glib.internal.guint, Nat._2])(using Zone): Ptr[GMutex] =
    val ___ptr = _root_.scala.scalanative.unsafe.alloc[GMutex](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[CArray[_root_.sn.gnome.glib.internal.guint, Nat._2]]].update(0, i)
    ___ptr
  
  extension (struct: GMutex)
    inline def p : _root_.sn.gnome.glib.internal.gpointer = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gpointer]]
    inline def p_=(value: _root_.sn.gnome.glib.internal.gpointer): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gpointer]] = value
    inline def i : CArray[_root_.sn.gnome.glib.internal.guint, Nat._2] = !struct.at(0).asInstanceOf[Ptr[CArray[_root_.sn.gnome.glib.internal.guint, Nat._2]]]
    inline def i_=(value: CArray[_root_.sn.gnome.glib.internal.guint, Nat._2]): Unit = !struct.at(0).asInstanceOf[Ptr[CArray[_root_.sn.gnome.glib.internal.guint, Nat._2]]] = value