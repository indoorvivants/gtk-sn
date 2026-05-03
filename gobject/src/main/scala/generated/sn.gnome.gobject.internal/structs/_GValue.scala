package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GValue:
*/
opaque type _GValue = CStruct2[GType, CArray[_GValue_Data, Nat._2]]

object _GValue:
  given _tag: Tag[_GValue] = Tag.materializeCStruct2Tag[GType, CArray[_GValue_Data, Nat._2]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GValue)
      inline def g_type : GType = struct._1
      inline def g_type_=(value: GType): Unit = (!struct.at1 = value)
      inline def data : CArray[_GValue_Data, Nat._2] = struct._2
      inline def data_=(value: CArray[_GValue_Data, Nat._2]): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates _GValue on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GValue] = scala.scalanative.unsafe.alloc[_GValue](1)
  def apply(g_type : GType, data : CArray[_GValue_Data, Nat._2])(using Zone): Ptr[_GValue] =
    val ____ptr = apply()
    (!____ptr).g_type = g_type
    (!____ptr).data = data
    ____ptr
  
  
opaque type _GValue_Data = CArray[Byte, Nat._8]
object _GValue_Data:
  given _tag: Tag[_GValue_Data] = Tag.CArray[CChar, Nat._8](Tag.Byte, Tag.Nat8)
  
  def apply()(using Zone): Ptr[_GValue_Data] =
    val ___ptr = _root_.scala.scalanative.unsafe.alloc[_GValue_Data](1)
    ___ptr
  
  @scala.annotation.targetName("apply_v_int")
  def apply(v_int: _root_.sn.gnome.glib.internal.gint)(using Zone): Ptr[_GValue_Data] =
    val ___ptr = _root_.scala.scalanative.unsafe.alloc[_GValue_Data](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gint]].update(0, v_int)
    ___ptr
  
  @scala.annotation.targetName("apply_v_uint")
  def apply(v_uint: _root_.sn.gnome.glib.internal.guint)(using Zone): Ptr[_GValue_Data] =
    val ___ptr = _root_.scala.scalanative.unsafe.alloc[_GValue_Data](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.guint]].update(0, v_uint)
    ___ptr
  
  @scala.annotation.targetName("apply_v_long")
  def apply(v_long: _root_.sn.gnome.glib.internal.glong)(using Zone): Ptr[_GValue_Data] =
    val ___ptr = _root_.scala.scalanative.unsafe.alloc[_GValue_Data](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.glong]].update(0, v_long)
    ___ptr
  
  @scala.annotation.targetName("apply_v_ulong")
  def apply(v_ulong: _root_.sn.gnome.glib.internal.gulong)(using Zone): Ptr[_GValue_Data] =
    val ___ptr = _root_.scala.scalanative.unsafe.alloc[_GValue_Data](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gulong]].update(0, v_ulong)
    ___ptr
  
  @scala.annotation.targetName("apply_v_int64")
  def apply(v_int64: _root_.sn.gnome.glib.internal.gint64)(using Zone): Ptr[_GValue_Data] =
    val ___ptr = _root_.scala.scalanative.unsafe.alloc[_GValue_Data](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gint64]].update(0, v_int64)
    ___ptr
  
  @scala.annotation.targetName("apply_v_uint64")
  def apply(v_uint64: _root_.sn.gnome.glib.internal.guint64)(using Zone): Ptr[_GValue_Data] =
    val ___ptr = _root_.scala.scalanative.unsafe.alloc[_GValue_Data](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.guint64]].update(0, v_uint64)
    ___ptr
  
  @scala.annotation.targetName("apply_v_float")
  def apply(v_float: _root_.sn.gnome.glib.internal.gfloat)(using Zone): Ptr[_GValue_Data] =
    val ___ptr = _root_.scala.scalanative.unsafe.alloc[_GValue_Data](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gfloat]].update(0, v_float)
    ___ptr
  
  @scala.annotation.targetName("apply_v_double")
  def apply(v_double: _root_.sn.gnome.glib.internal.gdouble)(using Zone): Ptr[_GValue_Data] =
    val ___ptr = _root_.scala.scalanative.unsafe.alloc[_GValue_Data](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gdouble]].update(0, v_double)
    ___ptr
  
  @scala.annotation.targetName("apply_v_pointer")
  def apply(v_pointer: _root_.sn.gnome.glib.internal.gpointer)(using Zone): Ptr[_GValue_Data] =
    val ___ptr = _root_.scala.scalanative.unsafe.alloc[_GValue_Data](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gpointer]].update(0, v_pointer)
    ___ptr
  
  extension (struct: _GValue_Data)
    inline def v_int : _root_.sn.gnome.glib.internal.gint = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gint]]
    inline def v_int_=(value: _root_.sn.gnome.glib.internal.gint): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gint]] = value
    inline def v_uint : _root_.sn.gnome.glib.internal.guint = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.guint]]
    inline def v_uint_=(value: _root_.sn.gnome.glib.internal.guint): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.guint]] = value
    inline def v_long : _root_.sn.gnome.glib.internal.glong = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.glong]]
    inline def v_long_=(value: _root_.sn.gnome.glib.internal.glong): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.glong]] = value
    inline def v_ulong : _root_.sn.gnome.glib.internal.gulong = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gulong]]
    inline def v_ulong_=(value: _root_.sn.gnome.glib.internal.gulong): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gulong]] = value
    inline def v_int64 : _root_.sn.gnome.glib.internal.gint64 = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gint64]]
    inline def v_int64_=(value: _root_.sn.gnome.glib.internal.gint64): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gint64]] = value
    inline def v_uint64 : _root_.sn.gnome.glib.internal.guint64 = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.guint64]]
    inline def v_uint64_=(value: _root_.sn.gnome.glib.internal.guint64): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.guint64]] = value
    inline def v_float : _root_.sn.gnome.glib.internal.gfloat = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gfloat]]
    inline def v_float_=(value: _root_.sn.gnome.glib.internal.gfloat): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gfloat]] = value
    inline def v_double : _root_.sn.gnome.glib.internal.gdouble = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gdouble]]
    inline def v_double_=(value: _root_.sn.gnome.glib.internal.gdouble): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gdouble]] = value
    inline def v_pointer : _root_.sn.gnome.glib.internal.gpointer = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gpointer]]
    inline def v_pointer_=(value: _root_.sn.gnome.glib.internal.gpointer): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gpointer]] = value