package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GThreadedSocketService = CStruct2[GSocketService, Ptr[GThreadedSocketServicePrivate]]

object _GThreadedSocketService:
  given _tag: Tag[_GThreadedSocketService] = Tag.materializeCStruct2Tag[GSocketService, Ptr[GThreadedSocketServicePrivate]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GThreadedSocketService)
      inline def parent_instance : GSocketService = struct._1
      inline def parent_instance_=(value: GSocketService): Unit = (!struct.at1 = value)
      inline def priv : Ptr[GThreadedSocketServicePrivate] = struct._2
      inline def priv_=(value: Ptr[GThreadedSocketServicePrivate]): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates _GThreadedSocketService on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GThreadedSocketService] = scala.scalanative.unsafe.alloc[_GThreadedSocketService](1)
  def apply(parent_instance : GSocketService, priv : Ptr[GThreadedSocketServicePrivate])(using Zone): Ptr[_GThreadedSocketService] =
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).priv = priv
    ____ptr