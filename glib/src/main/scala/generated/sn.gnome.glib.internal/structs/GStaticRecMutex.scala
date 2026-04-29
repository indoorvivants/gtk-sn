package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GStaticRecMutex = CStruct3[GStaticMutex, guint, GStaticRecMutex_Unused]

object GStaticRecMutex:
  given _tag: Tag[GStaticRecMutex] = Tag.materializeCStruct3Tag[GStaticMutex, guint, GStaticRecMutex_Unused]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GStaticRecMutex)
      inline def mutex : GStaticMutex = struct._1
      inline def mutex_=(value: GStaticMutex): Unit = (!struct.at1 = value)
      inline def depth : guint = struct._2
      inline def depth_=(value: guint): Unit = (!struct.at2 = value)
      inline def unused : GStaticRecMutex_Unused = struct._3
      inline def unused_=(value: GStaticRecMutex_Unused): Unit = (!struct.at3 = value)
    end extension
  
  // Allocates GStaticRecMutex on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GStaticRecMutex] = scala.scalanative.unsafe.alloc[GStaticRecMutex](1)
  def apply(mutex : GStaticMutex, depth : guint, unused : GStaticRecMutex_Unused)(using Zone): Ptr[GStaticRecMutex] =
    val ____ptr = apply()
    (!____ptr).mutex = mutex
    (!____ptr).depth = depth
    (!____ptr).unused = unused
    ____ptr
  
  
opaque type GStaticRecMutex_Unused = CArray[Byte, Nat._8]
object GStaticRecMutex_Unused:
  given _tag: Tag[GStaticRecMutex_Unused] = Tag.CArray[CChar, Nat._8](Tag.Byte, Tag.Nat8)
  
  def apply()(using Zone): Ptr[GStaticRecMutex_Unused] =
    val ___ptr = _root_.scala.scalanative.unsafe.alloc[GStaticRecMutex_Unused](1)
    ___ptr
  
  @scala.annotation.targetName("apply_owner")
  def apply(owner: pthread_t)(using Zone): Ptr[GStaticRecMutex_Unused] =
    val ___ptr = _root_.scala.scalanative.unsafe.alloc[GStaticRecMutex_Unused](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[pthread_t]].update(0, owner)
    ___ptr
  
  @scala.annotation.targetName("apply_dummy")
  def apply(dummy: gdouble)(using Zone): Ptr[GStaticRecMutex_Unused] =
    val ___ptr = _root_.scala.scalanative.unsafe.alloc[GStaticRecMutex_Unused](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[gdouble]].update(0, dummy)
    ___ptr
  
  extension (struct: GStaticRecMutex_Unused)
    inline def owner : pthread_t = !struct.at(0).asInstanceOf[Ptr[pthread_t]]
    inline def owner_=(value: pthread_t): Unit = !struct.at(0).asInstanceOf[Ptr[pthread_t]] = value
    inline def dummy : gdouble = !struct.at(0).asInstanceOf[Ptr[gdouble]]
    inline def dummy_=(value: gdouble): Unit = !struct.at(0).asInstanceOf[Ptr[gdouble]] = value