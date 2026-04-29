package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GWeakRef = CStruct1[GWeakRef_Priv]

object GWeakRef:
  given _tag: Tag[GWeakRef] = Tag.materializeCStruct1Tag[GWeakRef_Priv]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GWeakRef)
      inline def priv : GWeakRef_Priv = struct._1
      inline def priv_=(value: GWeakRef_Priv): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates GWeakRef on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GWeakRef] = scala.scalanative.unsafe.alloc[GWeakRef](1)
  def apply(priv : GWeakRef_Priv)(using Zone): Ptr[GWeakRef] =
    val ____ptr = apply()
    (!____ptr).priv = priv
    ____ptr
  
  
opaque type GWeakRef_Priv = CArray[Byte, Nat._8]
object GWeakRef_Priv:
  given _tag: Tag[GWeakRef_Priv] = Tag.CArray[CChar, Nat._8](Tag.Byte, Tag.Nat8)
  
  def apply()(using Zone): Ptr[GWeakRef_Priv] =
    val ___ptr = _root_.scala.scalanative.unsafe.alloc[GWeakRef_Priv](1)
    ___ptr
  
  @scala.annotation.targetName("apply_p")
  def apply(p: _root_.sn.gnome.glib.internal.gpointer)(using Zone): Ptr[GWeakRef_Priv] =
    val ___ptr = _root_.scala.scalanative.unsafe.alloc[GWeakRef_Priv](1)
    val un = !___ptr
    un.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gpointer]].update(0, p)
    ___ptr
  
  extension (struct: GWeakRef_Priv)
    inline def p : _root_.sn.gnome.glib.internal.gpointer = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gpointer]]
    inline def p_=(value: _root_.sn.gnome.glib.internal.gpointer): Unit = !struct.at(0).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gpointer]] = value