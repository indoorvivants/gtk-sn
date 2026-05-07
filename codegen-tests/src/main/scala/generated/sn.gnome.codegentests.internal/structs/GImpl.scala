package sn.gnome.codegentests.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GImpl = CStruct3[CString, CInt, Ptr[CString]]

object GImpl:
  given _tag: Tag[GImpl] = Tag.materializeCStruct3Tag[CString, CInt, Ptr[CString]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GImpl)
      inline def title : CString = struct._1
      inline def title_=(value: CString): Unit = (!struct.at1 = value)
      inline def count : CInt = struct._2
      inline def count_=(value: CInt): Unit = (!struct.at2 = value)
      inline def flags : Ptr[CString] = struct._3
      inline def flags_=(value: Ptr[CString]): Unit = (!struct.at3 = value)
    end extension
  
  // Allocates GImpl on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GImpl] = scala.scalanative.unsafe.alloc[GImpl](1)
  def apply(title : CString, count : CInt, flags : Ptr[CString])(using Zone): Ptr[GImpl] =
    val ____ptr = apply()
    (!____ptr).title = title
    (!____ptr).count = count
    (!____ptr).flags = flags
    ____ptr