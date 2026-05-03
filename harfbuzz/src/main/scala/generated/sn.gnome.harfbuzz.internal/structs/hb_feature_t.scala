package sn.gnome.harfbuzz.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * hb_feature_t: : The #hb_tag_t tag of the feature : The value of the feature. 0 disables the feature, non-zero (usually 1) enables the feature. For features implemented as lookup type 3 (like 'salt') the is a one based index into the alternates. : the cluster to start applying this feature setting (inclusive). : the cluster to end applying this feature setting (exclusive).
*/
opaque type hb_feature_t = CStruct4[hb_tag_t, uint32_t, CUnsignedInt, CUnsignedInt]

object hb_feature_t:
  given _tag: Tag[hb_feature_t] = Tag.materializeCStruct4Tag[hb_tag_t, uint32_t, CUnsignedInt, CUnsignedInt]
  
  export fields.*
  private[internal] object fields:
    extension (struct: hb_feature_t)
      inline def tag : hb_tag_t = struct._1
      inline def tag_=(value: hb_tag_t): Unit = (!struct.at1 = value)
      inline def value : uint32_t = struct._2
      inline def value_=(value: uint32_t): Unit = (!struct.at2 = value)
      inline def start : CUnsignedInt = struct._3
      inline def start_=(value: CUnsignedInt): Unit = (!struct.at3 = value)
      inline def end : CUnsignedInt = struct._4
      inline def end_=(value: CUnsignedInt): Unit = (!struct.at4 = value)
    end extension
  
  // Allocates hb_feature_t on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[hb_feature_t] = scala.scalanative.unsafe.alloc[hb_feature_t](1)
  def apply(tag : hb_tag_t, value : uint32_t, start : CUnsignedInt, end : CUnsignedInt)(using Zone): Ptr[hb_feature_t] =
    val ____ptr = apply()
    (!____ptr).tag = tag
    (!____ptr).value = value
    (!____ptr).start = start
    (!____ptr).end = end
    ____ptr