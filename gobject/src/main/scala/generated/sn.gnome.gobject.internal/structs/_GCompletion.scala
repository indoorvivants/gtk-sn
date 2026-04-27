package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.3: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GCompletion = CStruct5[Ptr[Byte], _root_.sn.gnome.glib.internal.GCompletionFunc, Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[Byte], _root_.sn.gnome.glib.internal.GCompletionStrncmpFunc]

object _GCompletion:
  given _tag: Tag[_GCompletion] = Tag.materializeCStruct5Tag[Ptr[Byte], _root_.sn.gnome.glib.internal.GCompletionFunc, Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[Byte], _root_.sn.gnome.glib.internal.GCompletionStrncmpFunc]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GCompletion)
      inline def items : Ptr[_root_.sn.gnome.glib.internal.GList] = struct._1.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.GList]]
      inline def items_=(value: Ptr[_root_.sn.gnome.glib.internal.GList]): Unit = (!struct.at1 = value.asInstanceOf[Ptr[Byte]])
      inline def func : _root_.sn.gnome.glib.internal.GCompletionFunc = struct._2
      inline def func_=(value: _root_.sn.gnome.glib.internal.GCompletionFunc): Unit = (!struct.at2 = value)
      inline def prefix : Ptr[_root_.sn.gnome.glib.internal.gchar] = struct._3
      inline def prefix_=(value: Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = (!struct.at3 = value)
      inline def cache : Ptr[_root_.sn.gnome.glib.internal.GList] = struct._4.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.GList]]
      inline def cache_=(value: Ptr[_root_.sn.gnome.glib.internal.GList]): Unit = (!struct.at4 = value.asInstanceOf[Ptr[Byte]])
      inline def strncmp_func : _root_.sn.gnome.glib.internal.GCompletionStrncmpFunc = struct._5
      inline def strncmp_func_=(value: _root_.sn.gnome.glib.internal.GCompletionStrncmpFunc): Unit = (!struct.at5 = value)
    end extension
  
  // Allocates _GCompletion on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GCompletion] = scala.scalanative.unsafe.alloc[_GCompletion](1)
  def apply(items : Ptr[_root_.sn.gnome.glib.internal.GList], func : _root_.sn.gnome.glib.internal.GCompletionFunc, prefix : Ptr[_root_.sn.gnome.glib.internal.gchar], cache : Ptr[_root_.sn.gnome.glib.internal.GList], strncmp_func : _root_.sn.gnome.glib.internal.GCompletionStrncmpFunc)(using Zone): Ptr[_GCompletion] =
    val ____ptr = apply()
    (!____ptr).items = items
    (!____ptr).func = func
    (!____ptr).prefix = prefix
    (!____ptr).cache = cache
    (!____ptr).strncmp_func = strncmp_func
    ____ptr