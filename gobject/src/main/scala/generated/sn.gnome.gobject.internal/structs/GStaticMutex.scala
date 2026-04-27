package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.3: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GStaticMutex = CStruct2[Ptr[_root_.sn.gnome.glib.internal.GMutex], pthread_mutex_t]

object GStaticMutex:
  given _tag: Tag[GStaticMutex] = Tag.materializeCStruct2Tag[Ptr[_root_.sn.gnome.glib.internal.GMutex], pthread_mutex_t]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GStaticMutex)
      inline def mutex : Ptr[_root_.sn.gnome.glib.internal.GMutex] = struct._1
      inline def mutex_=(value: Ptr[_root_.sn.gnome.glib.internal.GMutex]): Unit = (!struct.at1 = value)
      inline def unused : pthread_mutex_t = struct._2
      inline def unused_=(value: pthread_mutex_t): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates GStaticMutex on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GStaticMutex] = scala.scalanative.unsafe.alloc[GStaticMutex](1)
  def apply(mutex : Ptr[_root_.sn.gnome.glib.internal.GMutex], unused : pthread_mutex_t)(using Zone): Ptr[GStaticMutex] =
    val ____ptr = apply()
    (!____ptr).mutex = mutex
    (!____ptr).unused = unused
    ____ptr