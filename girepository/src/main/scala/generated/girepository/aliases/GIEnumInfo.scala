package girepository

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GIEnumInfo:
*/
type GIEnumInfo = GIBaseInfo
object GIEnumInfo:
  given _tag: Tag[GIEnumInfo] = GIBaseInfo._tag
  inline def apply(inline o: GIBaseInfo): GIEnumInfo = o
  extension (v: GIEnumInfo)
    inline def value: GIBaseInfo = v