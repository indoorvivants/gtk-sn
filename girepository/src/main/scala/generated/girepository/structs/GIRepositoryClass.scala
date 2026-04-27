package girepository

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GIRepositoryClass = CStruct1[_root_.sn.gnome.gobject.internal.GObjectClass]

object GIRepositoryClass:
  given _tag: Tag[GIRepositoryClass] = Tag.materializeCStruct1Tag[_root_.sn.gnome.gobject.internal.GObjectClass]
  
  export fields.*
  private[girepository] object fields:
    extension (struct: GIRepositoryClass)
      inline def parent : _root_.sn.gnome.gobject.internal.GObjectClass = struct._1
      inline def parent_=(value: _root_.sn.gnome.gobject.internal.GObjectClass): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates GIRepositoryClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GIRepositoryClass] = scala.scalanative.unsafe.alloc[GIRepositoryClass](1)
  def apply(parent : _root_.sn.gnome.gobject.internal.GObjectClass)(using Zone): Ptr[GIRepositoryClass] =
    val ____ptr = apply()
    (!____ptr).parent = parent
    ____ptr