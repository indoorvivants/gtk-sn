package girepository

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GIInterfaceInfo:
*/
type GIInterfaceInfo = GIBaseInfo
object GIInterfaceInfo:
  given _tag: Tag[GIInterfaceInfo] = GIBaseInfo._tag
  inline def apply(inline o: GIBaseInfo): GIInterfaceInfo = o
  extension (v: GIInterfaceInfo)
    inline def value: GIBaseInfo = v