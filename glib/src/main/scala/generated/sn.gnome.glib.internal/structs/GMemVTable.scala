package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GMemVTable = CStruct6[CFuncPtr1[gsize, gpointer], CFuncPtr2[gpointer, gsize, gpointer], CFuncPtr1[gpointer, Unit], CFuncPtr2[gsize, gsize, gpointer], CFuncPtr1[gsize, gpointer], CFuncPtr2[gpointer, gsize, gpointer]]

object GMemVTable:
  given _tag: Tag[GMemVTable] = Tag.materializeCStruct6Tag[CFuncPtr1[gsize, gpointer], CFuncPtr2[gpointer, gsize, gpointer], CFuncPtr1[gpointer, Unit], CFuncPtr2[gsize, gsize, gpointer], CFuncPtr1[gsize, gpointer], CFuncPtr2[gpointer, gsize, gpointer]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GMemVTable)
      inline def malloc : CFuncPtr1[gsize, gpointer] = struct._1
      inline def malloc_=(value: CFuncPtr1[gsize, gpointer]): Unit = (!struct.at1 = value)
      inline def realloc : CFuncPtr2[gpointer, gsize, gpointer] = struct._2
      inline def realloc_=(value: CFuncPtr2[gpointer, gsize, gpointer]): Unit = (!struct.at2 = value)
      inline def free : CFuncPtr1[gpointer, Unit] = struct._3
      inline def free_=(value: CFuncPtr1[gpointer, Unit]): Unit = (!struct.at3 = value)
      inline def calloc : CFuncPtr2[gsize, gsize, gpointer] = struct._4
      inline def calloc_=(value: CFuncPtr2[gsize, gsize, gpointer]): Unit = (!struct.at4 = value)
      inline def try_malloc : CFuncPtr1[gsize, gpointer] = struct._5
      inline def try_malloc_=(value: CFuncPtr1[gsize, gpointer]): Unit = (!struct.at5 = value)
      inline def try_realloc : CFuncPtr2[gpointer, gsize, gpointer] = struct._6
      inline def try_realloc_=(value: CFuncPtr2[gpointer, gsize, gpointer]): Unit = (!struct.at6 = value)
    end extension
  
  // Allocates GMemVTable on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GMemVTable] = scala.scalanative.unsafe.alloc[GMemVTable](1)
  def apply(malloc : CFuncPtr1[gsize, gpointer], realloc : CFuncPtr2[gpointer, gsize, gpointer], free : CFuncPtr1[gpointer, Unit], calloc : CFuncPtr2[gsize, gsize, gpointer], try_malloc : CFuncPtr1[gsize, gpointer], try_realloc : CFuncPtr2[gpointer, gsize, gpointer])(using Zone): Ptr[GMemVTable] =
    val ____ptr = apply()
    (!____ptr).malloc = malloc
    (!____ptr).realloc = realloc
    (!____ptr).free = free
    (!____ptr).calloc = calloc
    (!____ptr).try_malloc = try_malloc
    (!____ptr).try_realloc = try_realloc
    ____ptr