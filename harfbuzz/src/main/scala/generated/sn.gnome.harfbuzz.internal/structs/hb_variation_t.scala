package sn.gnome.harfbuzz.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * hb_variation_t: : The #hb_tag_t tag of the variation-axis name : The value of the variation axis
*/
opaque type hb_variation_t = CStruct2[hb_tag_t, Float]

object hb_variation_t:
  given _tag: Tag[hb_variation_t] = Tag.materializeCStruct2Tag[hb_tag_t, Float]
  
  export fields.*
  private[internal] object fields:
    extension (struct: hb_variation_t)
      inline def tag : hb_tag_t = struct._1
      inline def tag_=(value: hb_tag_t): Unit = (!struct.at1 = value)
      inline def value : Float = struct._2
      inline def value_=(value: Float): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates hb_variation_t on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[hb_variation_t] = scala.scalanative.unsafe.alloc[hb_variation_t](1)
  def apply(tag : hb_tag_t, value : Float)(using Zone): Ptr[hb_variation_t] =
    val ____ptr = apply()
    (!____ptr).tag = tag
    (!____ptr).value = value
    ____ptr