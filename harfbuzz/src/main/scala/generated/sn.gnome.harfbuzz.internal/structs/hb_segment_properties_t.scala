package sn.gnome.harfbuzz.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * hb_segment_properties_t: : the #hb_direction_t of the buffer, see hb_buffer_set_direction(). : the #hb_script_t of the buffer, see hb_buffer_set_script(). : the #hb_language_t of the buffer, see hb_buffer_set_language().
*/
opaque type hb_segment_properties_t = CStruct5[hb_direction_t, hb_script_t, hb_language_t, Ptr[Byte], Ptr[Byte]]

object hb_segment_properties_t:
  given _tag: Tag[hb_segment_properties_t] = Tag.materializeCStruct5Tag[hb_direction_t, hb_script_t, hb_language_t, Ptr[Byte], Ptr[Byte]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: hb_segment_properties_t)
      inline def direction : hb_direction_t = struct._1
      inline def direction_=(value: hb_direction_t): Unit = (!struct.at1 = value)
      inline def script : hb_script_t = struct._2
      inline def script_=(value: hb_script_t): Unit = (!struct.at2 = value)
      inline def language : hb_language_t = struct._3
      inline def language_=(value: hb_language_t): Unit = (!struct.at3 = value)
      inline def reserved1 : Ptr[Byte] = struct._4
      inline def reserved1_=(value: Ptr[Byte]): Unit = (!struct.at4 = value)
      inline def reserved2 : Ptr[Byte] = struct._5
      inline def reserved2_=(value: Ptr[Byte]): Unit = (!struct.at5 = value)
    end extension
  
  // Allocates hb_segment_properties_t on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[hb_segment_properties_t] = scala.scalanative.unsafe.alloc[hb_segment_properties_t](1)
  def apply(direction : hb_direction_t, script : hb_script_t, language : hb_language_t, reserved1 : Ptr[Byte], reserved2 : Ptr[Byte])(using Zone): Ptr[hb_segment_properties_t] =
    val ____ptr = apply()
    (!____ptr).direction = direction
    (!____ptr).script = script
    (!____ptr).language = language
    (!____ptr).reserved1 = reserved1
    (!____ptr).reserved2 = reserved2
    ____ptr