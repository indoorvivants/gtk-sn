package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.3: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GStaticRecMutex = CStruct3[_root_.sn.gnome.glib.internal.GStaticMutex, _root_.sn.gnome.glib.internal.guint, _GStaticRecMutex_Unused]

object _GStaticRecMutex:
  given _tag: Tag[_GStaticRecMutex] = Tag.materializeCStruct3Tag[_root_.sn.gnome.glib.internal.GStaticMutex, _root_.sn.gnome.glib.internal.guint, _GStaticRecMutex_Unused]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GStaticRecMutex)
      inline def mutex : _root_.sn.gnome.glib.internal.GStaticMutex = struct._1
      inline def mutex_=(value: _root_.sn.gnome.glib.internal.GStaticMutex): Unit = (!struct.at1 = value)
      inline def depth : _root_.sn.gnome.glib.internal.guint = struct._2
      inline def depth_=(value: _root_.sn.gnome.glib.internal.guint): Unit = (!struct.at2 = value)
      inline def unused : _GStaticRecMutex_Unused = struct._3
      inline def unused_=(value: _GStaticRecMutex_Unused): Unit = (!struct.at3 = value)
    end extension
  
  // Allocates _GStaticRecMutex on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GStaticRecMutex] = scala.scalanative.unsafe.alloc[_GStaticRecMutex](1)
  def apply(mutex : _root_.sn.gnome.glib.internal.GStaticMutex, depth : _root_.sn.gnome.glib.internal.guint, unused : _GStaticRecMutex_Unused)(using Zone): Ptr[_GStaticRecMutex] =
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
  def apply(dummy: _root_.sn.gnome.glib.internal.gdouble)(using Zone): Ptr[_GStaticRecMutex_Unused] =
    val ___ptr = _root_.scala.scalanative.unsafe.alloc[_GStaticRecMutex_Unused](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gdouble]].update(0, dummy)
    ___ptr
  
  extension (struct: _GStaticRecMutex_Unused)
    inline def owner : pthread_t = !struct.at(0).asInstanceOf[Ptr[pthread_t]]
    inline def owner_=(value: pthread_t): Unit = !struct.at(0).asInstanceOf[Ptr[pthread_t]] = value
    inline def dummy : _root_.sn.gnome.glib.internal.gdouble = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gdouble]]
    inline def dummy_=(value: _root_.sn.gnome.glib.internal.gdouble): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gdouble]] = value