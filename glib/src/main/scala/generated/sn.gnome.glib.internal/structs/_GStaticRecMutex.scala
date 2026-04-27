package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GStaticRecMutex = CStruct3[GStaticMutex, guint, _GStaticRecMutex_Unused]

object _GStaticRecMutex:
  given _tag: Tag[_GStaticRecMutex] = Tag.materializeCStruct3Tag[GStaticMutex, guint, _GStaticRecMutex_Unused]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GStaticRecMutex)
      inline def mutex : GStaticMutex = struct._1
      inline def mutex_=(value: GStaticMutex): Unit = (!struct.at1 = value)
      inline def depth : guint = struct._2
      inline def depth_=(value: guint): Unit = (!struct.at2 = value)
      inline def unused : _GStaticRecMutex_Unused = struct._3
      inline def unused_=(value: _GStaticRecMutex_Unused): Unit = (!struct.at3 = value)
    end extension
  
  // Allocates _GStaticRecMutex on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GStaticRecMutex] = scala.scalanative.unsafe.alloc[_GStaticRecMutex](1)
  def apply(mutex : GStaticMutex, depth : guint, unused : _GStaticRecMutex_Unused)(using Zone): Ptr[_GStaticRecMutex] =
    val ____ptr = apply()
    (!____ptr).mutex = mutex
    (!____ptr).depth = depth
    (!____ptr).unused = unused
    ____ptr
  
  
opaque type _GStaticRecMutex_Unused = CArray[Byte, Nat._8]
object _GStaticRecMutex_Unused:
  given _tag: Tag[_GStaticRecMutex_Unused] = Tag.CArray[CChar, Nat._8](Tag.Byte, Tag.Nat8)
  
  def apply()(using Zone): Ptr[_GStaticRecMutex_Unused] =
    val ___ptr = _root_.scala.scalanative.unsafe.alloc[_GStaticRecMutex_Unused](1)
    ___ptr
  
  @scala.annotation.targetName("apply_owner")
  def apply(owner: pthread_t)(using Zone): Ptr[_GStaticRecMutex_Unused] =
    val ___ptr = _root_.scala.scalanative.unsafe.alloc[_GStaticRecMutex_Unused](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[pthread_t]].update(0, owner)
    ___ptr
  
  @scala.annotation.targetName("apply_dummy")
  def apply(dummy: gdouble)(using Zone): Ptr[_GStaticRecMutex_Unused] =
    val ___ptr = _root_.scala.scalanative.unsafe.alloc[_GStaticRecMutex_Unused](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[gdouble]].update(0, dummy)
    ___ptr
  
  extension (struct: _GStaticRecMutex_Unused)
    inline def owner : pthread_t = !struct.at(0).asInstanceOf[Ptr[pthread_t]]
    inline def owner_=(value: pthread_t): Unit = !struct.at(0).asInstanceOf[Ptr[pthread_t]] = value
    inline def dummy : gdouble = !struct.at(0).asInstanceOf[Ptr[gdouble]]
    inline def dummy_=(value: gdouble): Unit = !struct.at(0).asInstanceOf[Ptr[gdouble]] = value