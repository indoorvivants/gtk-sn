package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GFileAttributeInfo: : the #GFileAttributeType type of the attribute. : a set of #GFileAttributeInfoFlags.
*/
opaque type _GFileAttributeInfo = CStruct3[CString, GFileAttributeType, GFileAttributeInfoFlags]

object _GFileAttributeInfo:
  given _tag: Tag[_GFileAttributeInfo] = Tag.materializeCStruct3Tag[CString, GFileAttributeType, GFileAttributeInfoFlags]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GFileAttributeInfo)
      inline def name : CString = struct._1
      inline def name_=(value: CString): Unit = (!struct.at1 = value)
      inline def `type` : GFileAttributeType = struct._2
      inline def type_=(value: GFileAttributeType): Unit = (!struct.at2 = value)
      inline def flags : GFileAttributeInfoFlags = struct._3
      inline def flags_=(value: GFileAttributeInfoFlags): Unit = (!struct.at3 = value)
    end extension
  
  // Allocates _GFileAttributeInfo on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GFileAttributeInfo] = scala.scalanative.unsafe.alloc[_GFileAttributeInfo](1)
  def apply(name : CString, `type` : GFileAttributeType, flags : GFileAttributeInfoFlags)(using Zone): Ptr[_GFileAttributeInfo] =
    val ____ptr = apply()
    (!____ptr).name = name
    (!____ptr).`type` = `type`
    (!____ptr).flags = flags
    ____ptr