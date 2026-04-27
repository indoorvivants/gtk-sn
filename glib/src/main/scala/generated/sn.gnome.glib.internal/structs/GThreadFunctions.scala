package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GThreadFunctions = CStruct21[CFuncPtr0[Ptr[GMutex]], CFuncPtr1[Ptr[GMutex], Unit], CFuncPtr1[Ptr[GMutex], gboolean], CFuncPtr1[Ptr[GMutex], Unit], CFuncPtr1[Ptr[GMutex], Unit], CFuncPtr0[Ptr[GCond]], CFuncPtr1[Ptr[GCond], Unit], CFuncPtr1[Ptr[GCond], Unit], CFuncPtr2[Ptr[GCond], Ptr[GMutex], Unit], CFuncPtr3[Ptr[GCond], Ptr[GMutex], Ptr[GTimeVal], gboolean], CFuncPtr1[Ptr[GCond], Unit], CFuncPtr1[GDestroyNotify, Ptr[GPrivate]], CFuncPtr1[Ptr[GPrivate], gpointer], CFuncPtr2[Ptr[GPrivate], gpointer, Unit], CFuncPtr8[GThreadFunc, gpointer, gulong, gboolean, gboolean, GThreadPriority, gpointer, Ptr[Ptr[GError]], Unit], CFuncPtr0[Unit], CFuncPtr1[gpointer, Unit], CFuncPtr0[Unit], CFuncPtr2[gpointer, GThreadPriority, Unit], CFuncPtr1[gpointer, Unit], CFuncPtr2[gpointer, gpointer, gboolean]]

object GThreadFunctions:
  given _tag: Tag[GThreadFunctions] = Tag.materializeCStruct21Tag[CFuncPtr0[Ptr[GMutex]], CFuncPtr1[Ptr[GMutex], Unit], CFuncPtr1[Ptr[GMutex], gboolean], CFuncPtr1[Ptr[GMutex], Unit], CFuncPtr1[Ptr[GMutex], Unit], CFuncPtr0[Ptr[GCond]], CFuncPtr1[Ptr[GCond], Unit], CFuncPtr1[Ptr[GCond], Unit], CFuncPtr2[Ptr[GCond], Ptr[GMutex], Unit], CFuncPtr3[Ptr[GCond], Ptr[GMutex], Ptr[GTimeVal], gboolean], CFuncPtr1[Ptr[GCond], Unit], CFuncPtr1[GDestroyNotify, Ptr[GPrivate]], CFuncPtr1[Ptr[GPrivate], gpointer], CFuncPtr2[Ptr[GPrivate], gpointer, Unit], CFuncPtr8[GThreadFunc, gpointer, gulong, gboolean, gboolean, GThreadPriority, gpointer, Ptr[Ptr[GError]], Unit], CFuncPtr0[Unit], CFuncPtr1[gpointer, Unit], CFuncPtr0[Unit], CFuncPtr2[gpointer, GThreadPriority, Unit], CFuncPtr1[gpointer, Unit], CFuncPtr2[gpointer, gpointer, gboolean]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GThreadFunctions)
      inline def mutex_new : CFuncPtr0[Ptr[GMutex]] = struct._1
      inline def mutex_new_=(value: CFuncPtr0[Ptr[GMutex]]): Unit = (!struct.at1 = value)
      inline def mutex_lock : CFuncPtr1[Ptr[GMutex], Unit] = struct._2
      inline def mutex_lock_=(value: CFuncPtr1[Ptr[GMutex], Unit]): Unit = (!struct.at2 = value)
      inline def mutex_trylock : CFuncPtr1[Ptr[GMutex], gboolean] = struct._3
      inline def mutex_trylock_=(value: CFuncPtr1[Ptr[GMutex], gboolean]): Unit = (!struct.at3 = value)
      inline def mutex_unlock : CFuncPtr1[Ptr[GMutex], Unit] = struct._4
      inline def mutex_unlock_=(value: CFuncPtr1[Ptr[GMutex], Unit]): Unit = (!struct.at4 = value)
      inline def mutex_free : CFuncPtr1[Ptr[GMutex], Unit] = struct._5
      inline def mutex_free_=(value: CFuncPtr1[Ptr[GMutex], Unit]): Unit = (!struct.at5 = value)
      inline def cond_new : CFuncPtr0[Ptr[GCond]] = struct._6
      inline def cond_new_=(value: CFuncPtr0[Ptr[GCond]]): Unit = (!struct.at6 = value)
      inline def cond_signal : CFuncPtr1[Ptr[GCond], Unit] = struct._7
      inline def cond_signal_=(value: CFuncPtr1[Ptr[GCond], Unit]): Unit = (!struct.at7 = value)
      inline def cond_broadcast : CFuncPtr1[Ptr[GCond], Unit] = struct._8
      inline def cond_broadcast_=(value: CFuncPtr1[Ptr[GCond], Unit]): Unit = (!struct.at8 = value)
      inline def cond_wait : CFuncPtr2[Ptr[GCond], Ptr[GMutex], Unit] = struct._9
      inline def cond_wait_=(value: CFuncPtr2[Ptr[GCond], Ptr[GMutex], Unit]): Unit = (!struct.at9 = value)
      inline def cond_timed_wait : CFuncPtr3[Ptr[GCond], Ptr[GMutex], Ptr[GTimeVal], gboolean] = struct._10
      inline def cond_timed_wait_=(value: CFuncPtr3[Ptr[GCond], Ptr[GMutex], Ptr[GTimeVal], gboolean]): Unit = (!struct.at10 = value)
      inline def cond_free : CFuncPtr1[Ptr[GCond], Unit] = struct._11
      inline def cond_free_=(value: CFuncPtr1[Ptr[GCond], Unit]): Unit = (!struct.at11 = value)
      inline def private_new : CFuncPtr1[GDestroyNotify, Ptr[GPrivate]] = struct._12
      inline def private_new_=(value: CFuncPtr1[GDestroyNotify, Ptr[GPrivate]]): Unit = (!struct.at12 = value)
      inline def private_get : CFuncPtr1[Ptr[GPrivate], gpointer] = struct._13
      inline def private_get_=(value: CFuncPtr1[Ptr[GPrivate], gpointer]): Unit = (!struct.at13 = value)
      inline def private_set : CFuncPtr2[Ptr[GPrivate], gpointer, Unit] = struct._14
      inline def private_set_=(value: CFuncPtr2[Ptr[GPrivate], gpointer, Unit]): Unit = (!struct.at14 = value)
      inline def thread_create : CFuncPtr8[GThreadFunc, gpointer, gulong, gboolean, gboolean, GThreadPriority, gpointer, Ptr[Ptr[GError]], Unit] = struct._15
      inline def thread_create_=(value: CFuncPtr8[GThreadFunc, gpointer, gulong, gboolean, gboolean, GThreadPriority, gpointer, Ptr[Ptr[GError]], Unit]): Unit = (!struct.at15 = value)
      inline def thread_yield : CFuncPtr0[Unit] = struct._16
      inline def thread_yield_=(value: CFuncPtr0[Unit]): Unit = (!struct.at16 = value)
      inline def thread_join : CFuncPtr1[gpointer, Unit] = struct._17
      inline def thread_join_=(value: CFuncPtr1[gpointer, Unit]): Unit = (!struct.at17 = value)
      inline def thread_exit : CFuncPtr0[Unit] = struct._18
      inline def thread_exit_=(value: CFuncPtr0[Unit]): Unit = (!struct.at18 = value)
      inline def thread_set_priority : CFuncPtr2[gpointer, GThreadPriority, Unit] = struct._19
      inline def thread_set_priority_=(value: CFuncPtr2[gpointer, GThreadPriority, Unit]): Unit = (!struct.at19 = value)
      inline def thread_self : CFuncPtr1[gpointer, Unit] = struct._20
      inline def thread_self_=(value: CFuncPtr1[gpointer, Unit]): Unit = (!struct.at20 = value)
      inline def thread_equal : CFuncPtr2[gpointer, gpointer, gboolean] = struct._21
      inline def thread_equal_=(value: CFuncPtr2[gpointer, gpointer, gboolean]): Unit = (!struct.at21 = value)
    end extension
  
  // Allocates GThreadFunctions on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GThreadFunctions] = scala.scalanative.unsafe.alloc[GThreadFunctions](1)
  def apply(mutex_new : CFuncPtr0[Ptr[GMutex]], mutex_lock : CFuncPtr1[Ptr[GMutex], Unit], mutex_trylock : CFuncPtr1[Ptr[GMutex], gboolean], mutex_unlock : CFuncPtr1[Ptr[GMutex], Unit], mutex_free : CFuncPtr1[Ptr[GMutex], Unit], cond_new : CFuncPtr0[Ptr[GCond]], cond_signal : CFuncPtr1[Ptr[GCond], Unit], cond_broadcast : CFuncPtr1[Ptr[GCond], Unit], cond_wait : CFuncPtr2[Ptr[GCond], Ptr[GMutex], Unit], cond_timed_wait : CFuncPtr3[Ptr[GCond], Ptr[GMutex], Ptr[GTimeVal], gboolean], cond_free : CFuncPtr1[Ptr[GCond], Unit], private_new : CFuncPtr1[GDestroyNotify, Ptr[GPrivate]], private_get : CFuncPtr1[Ptr[GPrivate], gpointer], private_set : CFuncPtr2[Ptr[GPrivate], gpointer, Unit], thread_create : CFuncPtr8[GThreadFunc, gpointer, gulong, gboolean, gboolean, GThreadPriority, gpointer, Ptr[Ptr[GError]], Unit], thread_yield : CFuncPtr0[Unit], thread_join : CFuncPtr1[gpointer, Unit], thread_exit : CFuncPtr0[Unit], thread_set_priority : CFuncPtr2[gpointer, GThreadPriority, Unit], thread_self : CFuncPtr1[gpointer, Unit], thread_equal : CFuncPtr2[gpointer, gpointer, gboolean])(using Zone): Ptr[GThreadFunctions] =
    val ____ptr = apply()
    (!____ptr).mutex_new = mutex_new
    (!____ptr).mutex_lock = mutex_lock
    (!____ptr).mutex_trylock = mutex_trylock
    (!____ptr).mutex_unlock = mutex_unlock
    (!____ptr).mutex_free = mutex_free
    (!____ptr).cond_new = cond_new
    (!____ptr).cond_signal = cond_signal
    (!____ptr).cond_broadcast = cond_broadcast
    (!____ptr).cond_wait = cond_wait
    (!____ptr).cond_timed_wait = cond_timed_wait
    (!____ptr).cond_free = cond_free
    (!____ptr).private_new = private_new
    (!____ptr).private_get = private_get
    (!____ptr).private_set = private_set
    (!____ptr).thread_create = thread_create
    (!____ptr).thread_yield = thread_yield
    (!____ptr).thread_join = thread_join
    (!____ptr).thread_exit = thread_exit
    (!____ptr).thread_set_priority = thread_set_priority
    (!____ptr).thread_self = thread_self
    (!____ptr).thread_equal = thread_equal
    ____ptr