package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GTokenValue = CArray[Byte, Nat._8]
object _GTokenValue:
  given _tag: Tag[_GTokenValue] = Tag.CArray[CChar, Nat._8](Tag.Byte, Tag.Nat8)
  
  def apply()(using Zone): Ptr[_GTokenValue] =
    val ___ptr = _root_.scala.scalanative.unsafe.alloc[_GTokenValue](1)
    ___ptr
  
  @scala.annotation.targetName("apply_v_symbol")
  def apply(v_symbol: gpointer)(using Zone): Ptr[_GTokenValue] =
    val ___ptr = _root_.scala.scalanative.unsafe.alloc[_GTokenValue](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[gpointer]].update(0, v_symbol)
    ___ptr
  
  @scala.annotation.targetName("apply_v_identifier")
  def apply(v_identifier: Ptr[gchar])(using Zone): Ptr[_GTokenValue] =
    val ___ptr = _root_.scala.scalanative.unsafe.alloc[_GTokenValue](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[Ptr[gchar]]].update(0, v_identifier)
    ___ptr
  
  @scala.annotation.targetName("apply_v_binary")
  def apply(v_binary: gulong)(using Zone): Ptr[_GTokenValue] =
    val ___ptr = _root_.scala.scalanative.unsafe.alloc[_GTokenValue](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[gulong]].update(0, v_binary)
    ___ptr
  
  @scala.annotation.targetName("apply_v_octal")
  def apply(v_octal: gulong)(using Zone): Ptr[_GTokenValue] =
    val ___ptr = _root_.scala.scalanative.unsafe.alloc[_GTokenValue](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[gulong]].update(0, v_octal)
    ___ptr
  
  @scala.annotation.targetName("apply_v_int")
  def apply(v_int: gulong)(using Zone): Ptr[_GTokenValue] =
    val ___ptr = _root_.scala.scalanative.unsafe.alloc[_GTokenValue](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[gulong]].update(0, v_int)
    ___ptr
  
  @scala.annotation.targetName("apply_v_int64")
  def apply(v_int64: guint64)(using Zone): Ptr[_GTokenValue] =
    val ___ptr = _root_.scala.scalanative.unsafe.alloc[_GTokenValue](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[guint64]].update(0, v_int64)
    ___ptr
  
  @scala.annotation.targetName("apply_v_float")
  def apply(v_float: gdouble)(using Zone): Ptr[_GTokenValue] =
    val ___ptr = _root_.scala.scalanative.unsafe.alloc[_GTokenValue](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[gdouble]].update(0, v_float)
    ___ptr
  
  @scala.annotation.targetName("apply_v_hex")
  def apply(v_hex: gulong)(using Zone): Ptr[_GTokenValue] =
    val ___ptr = _root_.scala.scalanative.unsafe.alloc[_GTokenValue](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[gulong]].update(0, v_hex)
    ___ptr
  
  @scala.annotation.targetName("apply_v_string")
  def apply(v_string: Ptr[gchar])(using Zone): Ptr[_GTokenValue] =
    val ___ptr = _root_.scala.scalanative.unsafe.alloc[_GTokenValue](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[Ptr[gchar]]].update(0, v_string)
    ___ptr
  
  @scala.annotation.targetName("apply_v_comment")
  def apply(v_comment: Ptr[gchar])(using Zone): Ptr[_GTokenValue] =
    val ___ptr = _root_.scala.scalanative.unsafe.alloc[_GTokenValue](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[Ptr[gchar]]].update(0, v_comment)
    ___ptr
  
  @scala.annotation.targetName("apply_v_char")
  def apply(v_char: guchar)(using Zone): Ptr[_GTokenValue] =
    val ___ptr = _root_.scala.scalanative.unsafe.alloc[_GTokenValue](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[guchar]].update(0, v_char)
    ___ptr
  
  @scala.annotation.targetName("apply_v_error")
  def apply(v_error: guint)(using Zone): Ptr[_GTokenValue] =
    val ___ptr = _root_.scala.scalanative.unsafe.alloc[_GTokenValue](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[guint]].update(0, v_error)
    ___ptr
  
  extension (struct: _GTokenValue)
    inline def v_symbol : gpointer = !struct.at(0).asInstanceOf[Ptr[gpointer]]
    inline def v_symbol_=(value: gpointer): Unit = !struct.at(0).asInstanceOf[Ptr[gpointer]] = value
    inline def v_identifier : Ptr[gchar] = !struct.at(0).asInstanceOf[Ptr[Ptr[gchar]]]
    inline def v_identifier_=(value: Ptr[gchar]): Unit = !struct.at(0).asInstanceOf[Ptr[Ptr[gchar]]] = value
    inline def v_binary : gulong = !struct.at(0).asInstanceOf[Ptr[gulong]]
    inline def v_binary_=(value: gulong): Unit = !struct.at(0).asInstanceOf[Ptr[gulong]] = value
    inline def v_octal : gulong = !struct.at(0).asInstanceOf[Ptr[gulong]]
    inline def v_octal_=(value: gulong): Unit = !struct.at(0).asInstanceOf[Ptr[gulong]] = value
    inline def v_int : gulong = !struct.at(0).asInstanceOf[Ptr[gulong]]
    inline def v_int_=(value: gulong): Unit = !struct.at(0).asInstanceOf[Ptr[gulong]] = value
    inline def v_int64 : guint64 = !struct.at(0).asInstanceOf[Ptr[guint64]]
    inline def v_int64_=(value: guint64): Unit = !struct.at(0).asInstanceOf[Ptr[guint64]] = value
    inline def v_float : gdouble = !struct.at(0).asInstanceOf[Ptr[gdouble]]
    inline def v_float_=(value: gdouble): Unit = !struct.at(0).asInstanceOf[Ptr[gdouble]] = value
    inline def v_hex : gulong = !struct.at(0).asInstanceOf[Ptr[gulong]]
    inline def v_hex_=(value: gulong): Unit = !struct.at(0).asInstanceOf[Ptr[gulong]] = value
    inline def v_string : Ptr[gchar] = !struct.at(0).asInstanceOf[Ptr[Ptr[gchar]]]
    inline def v_string_=(value: Ptr[gchar]): Unit = !struct.at(0).asInstanceOf[Ptr[Ptr[gchar]]] = value
    inline def v_comment : Ptr[gchar] = !struct.at(0).asInstanceOf[Ptr[Ptr[gchar]]]
    inline def v_comment_=(value: Ptr[gchar]): Unit = !struct.at(0).asInstanceOf[Ptr[Ptr[gchar]]] = value
    inline def v_char : guchar = !struct.at(0).asInstanceOf[Ptr[guchar]]
    inline def v_char_=(value: guchar): Unit = !struct.at(0).asInstanceOf[Ptr[guchar]] = value
    inline def v_error : guint = !struct.at(0).asInstanceOf[Ptr[guint]]
    inline def v_error_=(value: guint): Unit = !struct.at(0).asInstanceOf[Ptr[guint]] = value