package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GFileAttributeInfoList: : an array of #GFileAttributeInfos. _infos: the number of values in the array.
*/
opaque type _GFileAttributeInfoList = CStruct2[Ptr[GFileAttributeInfo], CInt]

object _GFileAttributeInfoList:
  given _tag: Tag[_GFileAttributeInfoList] = Tag.materializeCStruct2Tag[Ptr[GFileAttributeInfo], CInt]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GFileAttributeInfoList)
      inline def infos : Ptr[GFileAttributeInfo] = struct._1
      inline def infos_=(value: Ptr[GFileAttributeInfo]): Unit = (!struct.at1 = value)
      inline def n_infos : CInt = struct._2
      inline def n_infos_=(value: CInt): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates _GFileAttributeInfoList on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GFileAttributeInfoList] = scala.scalanative.unsafe.alloc[_GFileAttributeInfoList](1)
  def apply(infos : Ptr[GFileAttributeInfo], n_infos : CInt)(using Zone): Ptr[_GFileAttributeInfoList] =
    val ____ptr = apply()
    (!____ptr).infos = infos
    (!____ptr).n_infos = n_infos
    ____ptr