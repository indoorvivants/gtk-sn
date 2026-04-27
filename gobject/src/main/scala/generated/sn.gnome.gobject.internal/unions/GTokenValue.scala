package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.3: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GTokenValue = CArray[Byte, Nat._8]
object GTokenValue:
  given _tag: Tag[GTokenValue] = Tag.CArray[CChar, Nat._8](Tag.Byte, Tag.Nat8)
  
  def apply()(using Zone): Ptr[GTokenValue] =
    val ___ptr = _root_.scala.scalanative.unsafe.alloc[GTokenValue](1)
    ___ptr
  
  @scala.annotation.targetName("apply_v_symbol")
  def apply(v_symbol: _root_.sn.gnome.glib.internal.gpointer)(using Zone): Ptr[GTokenValue] =
    val ___ptr = _root_.scala.scalanative.unsafe.alloc[GTokenValue](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gpointer]].update(0, v_symbol)
    ___ptr
  
  @scala.annotation.targetName("apply_v_identifier")
  def apply(v_identifier: Ptr[_root_.sn.gnome.glib.internal.gchar])(using Zone): Ptr[GTokenValue] =
    val ___ptr = _root_.scala.scalanative.unsafe.alloc[GTokenValue](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]].update(0, v_identifier)
    ___ptr
  
  @scala.annotation.targetName("apply_v_binary")
  def apply(v_binary: _root_.sn.gnome.glib.internal.gulong)(using Zone): Ptr[GTokenValue] =
    val ___ptr = _root_.scala.scalanative.unsafe.alloc[GTokenValue](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gulong]].update(0, v_binary)
    ___ptr
  
  @scala.annotation.targetName("apply_v_octal")
  def apply(v_octal: _root_.sn.gnome.glib.internal.gulong)(using Zone): Ptr[GTokenValue] =
    val ___ptr = _root_.scala.scalanative.unsafe.alloc[GTokenValue](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gulong]].update(0, v_octal)
    ___ptr
  
  @scala.annotation.targetName("apply_v_int")
  def apply(v_int: _root_.sn.gnome.glib.internal.gulong)(using Zone): Ptr[GTokenValue] =
    val ___ptr = _root_.scala.scalanative.unsafe.alloc[GTokenValue](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gulong]].update(0, v_int)
    ___ptr
  
  @scala.annotation.targetName("apply_v_int64")
  def apply(v_int64: _root_.sn.gnome.glib.internal.guint64)(using Zone): Ptr[GTokenValue] =
    val ___ptr = _root_.scala.scalanative.unsafe.alloc[GTokenValue](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.guint64]].update(0, v_int64)
    ___ptr
  
  @scala.annotation.targetName("apply_v_float")
  def apply(v_float: _root_.sn.gnome.glib.internal.gdouble)(using Zone): Ptr[GTokenValue] =
    val ___ptr = _root_.scala.scalanative.unsafe.alloc[GTokenValue](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gdouble]].update(0, v_float)
    ___ptr
  
  @scala.annotation.targetName("apply_v_hex")
  def apply(v_hex: _root_.sn.gnome.glib.internal.gulong)(using Zone): Ptr[GTokenValue] =
    val ___ptr = _root_.scala.scalanative.unsafe.alloc[GTokenValue](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gulong]].update(0, v_hex)
    ___ptr
  
  @scala.annotation.targetName("apply_v_string")
  def apply(v_string: Ptr[_root_.sn.gnome.glib.internal.gchar])(using Zone): Ptr[GTokenValue] =
    val ___ptr = _root_.scala.scalanative.unsafe.alloc[GTokenValue](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]].update(0, v_string)
    ___ptr
  
  @scala.annotation.targetName("apply_v_comment")
  def apply(v_comment: Ptr[_root_.sn.gnome.glib.internal.gchar])(using Zone): Ptr[GTokenValue] =
    val ___ptr = _root_.scala.scalanative.unsafe.alloc[GTokenValue](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]].update(0, v_comment)
    ___ptr
  
  @scala.annotation.targetName("apply_v_char")
  def apply(v_char: _root_.sn.gnome.glib.internal.guchar)(using Zone): Ptr[GTokenValue] =
    val ___ptr = _root_.scala.scalanative.unsafe.alloc[GTokenValue](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.guchar]].update(0, v_char)
    ___ptr
  
  @scala.annotation.targetName("apply_v_error")
  def apply(v_error: _root_.sn.gnome.glib.internal.guint)(using Zone): Ptr[GTokenValue] =
    val ___ptr = _root_.scala.scalanative.unsafe.alloc[GTokenValue](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.guint]].update(0, v_error)
    ___ptr
  
  extension (struct: GTokenValue)
    inline def v_symbol : _root_.sn.gnome.glib.internal.gpointer = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gpointer]]
    inline def v_symbol_=(value: _root_.sn.gnome.glib.internal.gpointer): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gpointer]] = value
    inline def v_identifier : Ptr[_root_.sn.gnome.glib.internal.gchar] = !struct.at(0).asInstanceOf[Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]]
    inline def v_identifier_=(value: Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = !struct.at(0).asInstanceOf[Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]] = value
    inline def v_binary : _root_.sn.gnome.glib.internal.gulong = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gulong]]
    inline def v_binary_=(value: _root_.sn.gnome.glib.internal.gulong): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gulong]] = value
    inline def v_octal : _root_.sn.gnome.glib.internal.gulong = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gulong]]
    inline def v_octal_=(value: _root_.sn.gnome.glib.internal.gulong): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gulong]] = value
    inline def v_int : _root_.sn.gnome.glib.internal.gulong = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gulong]]
    inline def v_int_=(value: _root_.sn.gnome.glib.internal.gulong): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gulong]] = value
    inline def v_int64 : _root_.sn.gnome.glib.internal.guint64 = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.guint64]]
    inline def v_int64_=(value: _root_.sn.gnome.glib.internal.guint64): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.guint64]] = value
    inline def v_float : _root_.sn.gnome.glib.internal.gdouble = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gdouble]]
    inline def v_float_=(value: _root_.sn.gnome.glib.internal.gdouble): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gdouble]] = value
    inline def v_hex : _root_.sn.gnome.glib.internal.gulong = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gulong]]
    inline def v_hex_=(value: _root_.sn.gnome.glib.internal.gulong): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gulong]] = value
    inline def v_string : Ptr[_root_.sn.gnome.glib.internal.gchar] = !struct.at(0).asInstanceOf[Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]]
    inline def v_string_=(value: Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = !struct.at(0).asInstanceOf[Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]] = value
    inline def v_comment : Ptr[_root_.sn.gnome.glib.internal.gchar] = !struct.at(0).asInstanceOf[Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]]
    inline def v_comment_=(value: Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = !struct.at(0).asInstanceOf[Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]] = value
    inline def v_char : _root_.sn.gnome.glib.internal.guchar = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.guchar]]
    inline def v_char_=(value: _root_.sn.gnome.glib.internal.guchar): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.guchar]] = value
    inline def v_error : _root_.sn.gnome.glib.internal.guint = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.guint]]
    inline def v_error_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.guint]] = value