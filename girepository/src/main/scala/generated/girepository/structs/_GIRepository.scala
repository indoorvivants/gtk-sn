package girepository

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GIRepository = CStruct2[_root_.sn.gnome.gobject.internal.GObject, Ptr[GIRepositoryPrivate]]

object _GIRepository:
  given _tag: Tag[_GIRepository] = Tag.materializeCStruct2Tag[_root_.sn.gnome.gobject.internal.GObject, Ptr[GIRepositoryPrivate]]
  
  export fields.*
  private[girepository] object fields:
    extension (struct: _GIRepository)
      inline def parent : _root_.sn.gnome.gobject.internal.GObject = struct._1
      inline def parent_=(value: _root_.sn.gnome.gobject.internal.GObject): Unit = (!struct.at1 = value)
      inline def priv : Ptr[GIRepositoryPrivate] = struct._2
      inline def priv_=(value: Ptr[GIRepositoryPrivate]): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates _GIRepository on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GIRepository] = scala.scalanative.unsafe.alloc[_GIRepository](1)
  def apply(parent : _root_.sn.gnome.gobject.internal.GObject, priv : Ptr[GIRepositoryPrivate])(using Zone): Ptr[_GIRepository] =
    val ____ptr = apply()
    (!____ptr).parent = parent
    (!____ptr).priv = priv
    ____ptr