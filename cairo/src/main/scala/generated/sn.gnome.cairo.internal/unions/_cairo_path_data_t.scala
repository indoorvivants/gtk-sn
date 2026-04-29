package sn.gnome.cairo.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _cairo_path_data_t = CArray[Byte, Nat.Digit2[Nat._1, Nat._6]]
object _cairo_path_data_t:
  given _tag: Tag[_cairo_path_data_t] = Tag.CArray[CChar, Nat.Digit2[Nat._1, Nat._6]](Tag.Byte, Tag.Digit2[Nat._1, Nat._6](Tag.Nat1, Tag.Nat6))
  
  def apply()(using Zone): Ptr[_cairo_path_data_t] =
    val ___ptr = _root_.scala.scalanative.unsafe.alloc[_cairo_path_data_t](1)
    ___ptr
  
  @scala.annotation.targetName("apply_header")
  def apply(header: _cairo_path_data_t_Header)(using Zone): Ptr[_cairo_path_data_t] =
    val ___ptr = _root_.scala.scalanative.unsafe.alloc[_cairo_path_data_t](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[_cairo_path_data_t_Header]].update(0, header)
    ___ptr
  
  @scala.annotation.targetName("apply_point")
  def apply(point: _cairo_path_data_t_Point)(using Zone): Ptr[_cairo_path_data_t] =
    val ___ptr = _root_.scala.scalanative.unsafe.alloc[_cairo_path_data_t](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[_cairo_path_data_t_Point]].update(0, point)
    ___ptr
  
  extension (struct: _cairo_path_data_t)
    inline def header : _cairo_path_data_t_Header = !struct.at(0).asInstanceOf[Ptr[_cairo_path_data_t_Header]]
    inline def header_=(value: _cairo_path_data_t_Header): Unit = !struct.at(0).asInstanceOf[Ptr[_cairo_path_data_t_Header]] = value
    inline def point : _cairo_path_data_t_Point = !struct.at(0).asInstanceOf[Ptr[_cairo_path_data_t_Point]]
    inline def point_=(value: _cairo_path_data_t_Point): Unit = !struct.at(0).asInstanceOf[Ptr[_cairo_path_data_t_Point]] = value
opaque type _cairo_path_data_t_Header = CStruct2[cairo_path_data_type_t, CInt]

object _cairo_path_data_t_Header:
  given _tag: Tag[_cairo_path_data_t_Header] = Tag.materializeCStruct2Tag[cairo_path_data_type_t, CInt]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _cairo_path_data_t_Header)
      inline def `type` : cairo_path_data_type_t = struct._1
      inline def type_=(value: cairo_path_data_type_t): Unit = (!struct.at1 = value)
      inline def length : CInt = struct._2
      inline def length_=(value: CInt): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates _cairo_path_data_t_Header on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_cairo_path_data_t_Header] = scala.scalanative.unsafe.alloc[_cairo_path_data_t_Header](1)
  def apply(`type` : cairo_path_data_type_t, length : CInt)(using Zone): Ptr[_cairo_path_data_t_Header] =
    val ____ptr = apply()
    (!____ptr).`type` = `type`
    (!____ptr).length = length
    ____ptr
  
  
opaque type _cairo_path_data_t_Point = CStruct2[Double, Double]

object _cairo_path_data_t_Point:
  given _tag: Tag[_cairo_path_data_t_Point] = Tag.materializeCStruct2Tag[Double, Double]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _cairo_path_data_t_Point)
      inline def x : Double = struct._1
      inline def x_=(value: Double): Unit = (!struct.at1 = value)
      inline def y : Double = struct._2
      inline def y_=(value: Double): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates _cairo_path_data_t_Point on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_cairo_path_data_t_Point] = scala.scalanative.unsafe.alloc[_cairo_path_data_t_Point](1)
  def apply(x : Double, y : Double)(using Zone): Ptr[_cairo_path_data_t_Point] =
    val ____ptr = apply()
    (!____ptr).x = x
    (!____ptr).y = y
    ____ptr