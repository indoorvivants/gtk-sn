package sn.gnome.harfbuzz.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * hb_color_line_t:
*/
opaque type hb_color_line_t = CStruct13[Ptr[Byte], Ptr[Byte], Ptr[Byte], Ptr[Byte], Ptr[Byte], Ptr[Byte], Ptr[Byte], Ptr[Byte], Ptr[Byte], Ptr[Byte], Ptr[Byte], Ptr[Byte], Ptr[Byte]]

object hb_color_line_t:
  given _tag: Tag[hb_color_line_t] = Tag.materializeCStruct13Tag[Ptr[Byte], Ptr[Byte], Ptr[Byte], Ptr[Byte], Ptr[Byte], Ptr[Byte], Ptr[Byte], Ptr[Byte], Ptr[Byte], Ptr[Byte], Ptr[Byte], Ptr[Byte], Ptr[Byte]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: hb_color_line_t)
      inline def data : Ptr[Byte] = struct._1
      inline def data_=(value: Ptr[Byte]): Unit = (!struct.at1 = value)
      inline def get_color_stops : hb_color_line_get_color_stops_func_t = struct._2.asInstanceOf[hb_color_line_get_color_stops_func_t]
      inline def get_color_stops_=(value: hb_color_line_get_color_stops_func_t): Unit = (!struct.at2 = value.asInstanceOf[Ptr[Byte]])
      inline def get_color_stops_user_data : Ptr[Byte] = struct._3
      inline def get_color_stops_user_data_=(value: Ptr[Byte]): Unit = (!struct.at3 = value)
      inline def get_extend : hb_color_line_get_extend_func_t = struct._4.asInstanceOf[hb_color_line_get_extend_func_t]
      inline def get_extend_=(value: hb_color_line_get_extend_func_t): Unit = (!struct.at4 = value.asInstanceOf[Ptr[Byte]])
      inline def get_extend_user_data : Ptr[Byte] = struct._5
      inline def get_extend_user_data_=(value: Ptr[Byte]): Unit = (!struct.at5 = value)
      inline def reserved0 : Ptr[Byte] = struct._6
      inline def reserved0_=(value: Ptr[Byte]): Unit = (!struct.at6 = value)
      inline def reserved1 : Ptr[Byte] = struct._7
      inline def reserved1_=(value: Ptr[Byte]): Unit = (!struct.at7 = value)
      inline def reserved2 : Ptr[Byte] = struct._8
      inline def reserved2_=(value: Ptr[Byte]): Unit = (!struct.at8 = value)
      inline def reserved3 : Ptr[Byte] = struct._9
      inline def reserved3_=(value: Ptr[Byte]): Unit = (!struct.at9 = value)
      inline def reserved5 : Ptr[Byte] = struct._10
      inline def reserved5_=(value: Ptr[Byte]): Unit = (!struct.at10 = value)
      inline def reserved6 : Ptr[Byte] = struct._11
      inline def reserved6_=(value: Ptr[Byte]): Unit = (!struct.at11 = value)
      inline def reserved7 : Ptr[Byte] = struct._12
      inline def reserved7_=(value: Ptr[Byte]): Unit = (!struct.at12 = value)
      inline def reserved8 : Ptr[Byte] = struct._13
      inline def reserved8_=(value: Ptr[Byte]): Unit = (!struct.at13 = value)
    end extension
  
  // Allocates hb_color_line_t on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[hb_color_line_t] = scala.scalanative.unsafe.alloc[hb_color_line_t](1)
  def apply(data : Ptr[Byte], get_color_stops : hb_color_line_get_color_stops_func_t, get_color_stops_user_data : Ptr[Byte], get_extend : hb_color_line_get_extend_func_t, get_extend_user_data : Ptr[Byte], reserved0 : Ptr[Byte], reserved1 : Ptr[Byte], reserved2 : Ptr[Byte], reserved3 : Ptr[Byte], reserved5 : Ptr[Byte], reserved6 : Ptr[Byte], reserved7 : Ptr[Byte], reserved8 : Ptr[Byte])(using Zone): Ptr[hb_color_line_t] =
    val ____ptr = apply()
    (!____ptr).data = data
    (!____ptr).get_color_stops = get_color_stops
    (!____ptr).get_color_stops_user_data = get_color_stops_user_data
    (!____ptr).get_extend = get_extend
    (!____ptr).get_extend_user_data = get_extend_user_data
    (!____ptr).reserved0 = reserved0
    (!____ptr).reserved1 = reserved1
    (!____ptr).reserved2 = reserved2
    (!____ptr).reserved3 = reserved3
    (!____ptr).reserved5 = reserved5
    (!____ptr).reserved6 = reserved6
    (!____ptr).reserved7 = reserved7
    (!____ptr).reserved8 = reserved8
    ____ptr