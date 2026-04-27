package sn.gnome.harfbuzz.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * hb_draw_state_t _open: Whether there is an open path _start_x: X component of the start of current path _start_y: Y component of the start of current path _x: X component of current point _y: Y component of current point
*/
opaque type hb_draw_state_t = CStruct12[hb_bool_t, Float, Float, Float, Float, hb_var_num_t, hb_var_num_t, hb_var_num_t, hb_var_num_t, hb_var_num_t, hb_var_num_t, hb_var_num_t]

object hb_draw_state_t:
  given _tag: Tag[hb_draw_state_t] = Tag.materializeCStruct12Tag[hb_bool_t, Float, Float, Float, Float, hb_var_num_t, hb_var_num_t, hb_var_num_t, hb_var_num_t, hb_var_num_t, hb_var_num_t, hb_var_num_t]
  
  export fields.*
  private[internal] object fields:
    extension (struct: hb_draw_state_t)
      inline def path_open : hb_bool_t = struct._1
      inline def path_open_=(value: hb_bool_t): Unit = (!struct.at1 = value)
      inline def path_start_x : Float = struct._2
      inline def path_start_x_=(value: Float): Unit = (!struct.at2 = value)
      inline def path_start_y : Float = struct._3
      inline def path_start_y_=(value: Float): Unit = (!struct.at3 = value)
      inline def current_x : Float = struct._4
      inline def current_x_=(value: Float): Unit = (!struct.at4 = value)
      inline def current_y : Float = struct._5
      inline def current_y_=(value: Float): Unit = (!struct.at5 = value)
      inline def reserved1 : hb_var_num_t = struct._6
      inline def reserved1_=(value: hb_var_num_t): Unit = (!struct.at6 = value)
      inline def reserved2 : hb_var_num_t = struct._7
      inline def reserved2_=(value: hb_var_num_t): Unit = (!struct.at7 = value)
      inline def reserved3 : hb_var_num_t = struct._8
      inline def reserved3_=(value: hb_var_num_t): Unit = (!struct.at8 = value)
      inline def reserved4 : hb_var_num_t = struct._9
      inline def reserved4_=(value: hb_var_num_t): Unit = (!struct.at9 = value)
      inline def reserved5 : hb_var_num_t = struct._10
      inline def reserved5_=(value: hb_var_num_t): Unit = (!struct.at10 = value)
      inline def reserved6 : hb_var_num_t = struct._11
      inline def reserved6_=(value: hb_var_num_t): Unit = (!struct.at11 = value)
      inline def reserved7 : hb_var_num_t = struct._12
      inline def reserved7_=(value: hb_var_num_t): Unit = (!struct.at12 = value)
    end extension
  
  // Allocates hb_draw_state_t on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[hb_draw_state_t] = scala.scalanative.unsafe.alloc[hb_draw_state_t](1)
  def apply(path_open : hb_bool_t, path_start_x : Float, path_start_y : Float, current_x : Float, current_y : Float, reserved1 : hb_var_num_t, reserved2 : hb_var_num_t, reserved3 : hb_var_num_t, reserved4 : hb_var_num_t, reserved5 : hb_var_num_t, reserved6 : hb_var_num_t, reserved7 : hb_var_num_t)(using Zone): Ptr[hb_draw_state_t] =
    val ____ptr = apply()
    (!____ptr).path_open = path_open
    (!____ptr).path_start_x = path_start_x
    (!____ptr).path_start_y = path_start_y
    (!____ptr).current_x = current_x
    (!____ptr).current_y = current_y
    (!____ptr).reserved1 = reserved1
    (!____ptr).reserved2 = reserved2
    (!____ptr).reserved3 = reserved3
    (!____ptr).reserved4 = reserved4
    (!____ptr).reserved5 = reserved5
    (!____ptr).reserved6 = reserved6
    (!____ptr).reserved7 = reserved7
    ____ptr