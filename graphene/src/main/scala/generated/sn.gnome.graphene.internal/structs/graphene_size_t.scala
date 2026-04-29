package sn.gnome.graphene.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * graphene_size_t: : the width : the height
*/
opaque type graphene_size_t = CStruct2[Float, Float]

object graphene_size_t:
  given _tag: Tag[graphene_size_t] = Tag.materializeCStruct2Tag[Float, Float]
  
  export fields.*
  private[internal] object fields:
    extension (struct: graphene_size_t)
      inline def width : Float = struct._1
      inline def width_=(value: Float): Unit = (!struct.at1 = value)
      inline def height : Float = struct._2
      inline def height_=(value: Float): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates graphene_size_t on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[graphene_size_t] = scala.scalanative.unsafe.alloc[graphene_size_t](1)
  def apply(width : Float, height : Float)(using Zone): Ptr[graphene_size_t] =
    val ____ptr = apply()
    (!____ptr).width = width
    (!____ptr).height = height
    ____ptr