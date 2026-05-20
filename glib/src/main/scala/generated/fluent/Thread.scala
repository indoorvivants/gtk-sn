package sn.gnome.glib

import _root_.sn.gnome.glib.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.Thread
import sn.gnome.glib.internal.{GThread, gpointer}

/** The #GThread struct represents a running thread. This struct is returned by
  * g_thread_new() or g_thread_try_new(). You can obtain the #GThread struct
  * representing the current thread by calling g_thread_self().
  *
  * GThread is refcounted, see g_thread_ref() and g_thread_unref(). The thread
  * represented by it holds a reference while it is running, and g_thread_join()
  * consumes the reference that it is given, so it is normally not necessary to
  * manage GThread references explicitly.
  *
  * The structure is opaque -- none of its fields may be directly accessed.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class Thread private[gnome] (raw: Ptr[GThread]):

  def getUnsafeRawPointer(): Ptr[GThread] = this.raw

  /** Waits until @thread finishes, i.e. the function @func, as given to
    * g_thread_new(), returns or g_thread_exit() is called. If @thread has
    * already terminated, then g_thread_join() returns immediately.
    *
    * Any thread can wait for any other thread by calling g_thread_join(), not
    * just its 'creator'. Calling g_thread_join() from multiple threads for the
    * same @thread leads to undefined behaviour.
    *
    * The value returned by @func or given to g_thread_exit() is returned by
    * this function.
    *
    * g_thread_join() consumes the reference to the passed-in @thread. This will
    * usually cause the #GThread struct and associated resources to be freed.
    * Use g_thread_ref() to obtain an extra reference if you want to keep the
    * GThread alive beyond the g_thread_join() call.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def join(): Ptr[Byte] /* None */ =
    g_thread_join(this.getUnsafeRawPointer().asInstanceOf[Ptr[GThread]]).value
  end join

  /** Increase the reference count on @thread.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def ref(): sn.gnome.glib.Thread /* None */ =
    sn.gnome.glib.Thread.fromRaw(
      g_thread_ref(this.getUnsafeRawPointer().asInstanceOf[Ptr[GThread]])
    )
  end ref

  /** Decrease the reference count on @thread, possibly freeing all resources
    * associated with it.
    *
    * Note that each thread holds a reference to its #GThread while it is
    * running, so it is safe to drop your own reference to it if you don't need
    * it anymore.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unref(): Unit /* None */ =
    g_thread_unref(this.getUnsafeRawPointer().asInstanceOf[Ptr[GThread]])
  end unref

end Thread

object Thread:
  def fromRaw(ptr: Ptr[GThread]): Thread = new Thread(ptr)
end Thread
