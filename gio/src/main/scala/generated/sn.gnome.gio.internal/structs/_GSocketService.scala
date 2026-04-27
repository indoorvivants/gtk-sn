package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GSocketService = CStruct2[GSocketListener, Ptr[GSocketServicePrivate]]

object _GSocketService:
  given _tag: Tag[_GSocketService] = Tag.materializeCStruct2Tag[GSocketListener, Ptr[GSocketServicePrivate]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GSocketService)
      inline def parent_instance : GSocketListener = struct._1
      inline def parent_instance_=(value: GSocketListener): Unit = (!struct.at1 = value)
      inline def priv : Ptr[GSocketServicePrivate] = struct._2
      inline def priv_=(value: Ptr[GSocketServicePrivate]): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates _GSocketService on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GSocketService] = scala.scalanative.unsafe.alloc[_GSocketService](1)
  def apply(parent_instance : GSocketListener, priv : Ptr[GSocketServicePrivate])(using Zone): Ptr[_GSocketService] =
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).priv = priv
    ____ptr