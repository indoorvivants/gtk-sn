package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GCompletion = CStruct5[Ptr[Byte], GCompletionFunc, Ptr[gchar], Ptr[Byte], GCompletionStrncmpFunc]

object GCompletion:
  given _tag: Tag[GCompletion] = Tag.materializeCStruct5Tag[Ptr[Byte], GCompletionFunc, Ptr[gchar], Ptr[Byte], GCompletionStrncmpFunc]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GCompletion)
      inline def items : Ptr[GList] = struct._1.asInstanceOf[Ptr[GList]]
      inline def items_=(value: Ptr[GList]): Unit = (!struct.at1 = value.asInstanceOf[Ptr[Byte]])
      inline def func : GCompletionFunc = struct._2
      inline def func_=(value: GCompletionFunc): Unit = (!struct.at2 = value)
      inline def prefix : Ptr[gchar] = struct._3
      inline def prefix_=(value: Ptr[gchar]): Unit = (!struct.at3 = value)
      inline def cache : Ptr[GList] = struct._4.asInstanceOf[Ptr[GList]]
      inline def cache_=(value: Ptr[GList]): Unit = (!struct.at4 = value.asInstanceOf[Ptr[Byte]])
      inline def strncmp_func : GCompletionStrncmpFunc = struct._5
      inline def strncmp_func_=(value: GCompletionStrncmpFunc): Unit = (!struct.at5 = value)
    end extension
  
  // Allocates GCompletion on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GCompletion] = scala.scalanative.unsafe.alloc[GCompletion](1)
  def apply(items : Ptr[GList], func : GCompletionFunc, prefix : Ptr[gchar], cache : Ptr[GList], strncmp_func : GCompletionStrncmpFunc)(using Zone): Ptr[GCompletion] =
    val ____ptr = apply()
    (!____ptr).items = items
    (!____ptr).func = func
    (!____ptr).prefix = prefix
    (!____ptr).cache = cache
    (!____ptr).strncmp_func = strncmp_func
    ____ptr