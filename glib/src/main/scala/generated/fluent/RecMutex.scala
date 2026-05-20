package sn.gnome.glib

import _root_.sn.gnome.glib.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.{GRecMutex, gboolean, gint}

/** The GRecMutex struct is an opaque data structure to represent a recursive
  * mutex. It is similar to a #GMutex with the difference that it is possible to
  * lock a GRecMutex multiple times in the same thread without deadlock. When
  * doing so, care has to be taken to unlock the recursive mutex as often as it
  * has been locked.
  *
  * If a #GRecMutex is allocated in static storage then it can be used without
  * initialisation. Otherwise, you should call g_rec_mutex_init() on it and
  * g_rec_mutex_clear() when done.
  *
  * A GRecMutex should only be accessed with the g_rec_mutex_ functions.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class RecMutex private[gnome] (raw: Ptr[GRecMutex]):

  def getUnsafeRawPointer(): Ptr[GRecMutex] = this.raw

  /** Frees the resources allocated to a recursive mutex with
    * g_rec_mutex_init().
    *
    * This function should not be used with a #GRecMutex that has been
    * statically allocated.
    *
    * Calling g_rec_mutex_clear() on a locked recursive mutex leads to undefined
    * behaviour.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def clear(): Unit /* None */ =
    g_rec_mutex_clear(this.getUnsafeRawPointer().asInstanceOf[Ptr[GRecMutex]])
  end clear

  /**  Initializes a #GRecMutex so that it can be used.
    *
    *  This function is useful to initialize a recursive mutex
    *  that has been allocated on the stack, or as part of a larger
    *  structure.
    *
    *  It is not necessary to initialise a recursive mutex that has been
    *  statically allocated.
    *
    *  |[<!-- language="C" -->
    *    typedef struct {
    *      GRecMutex m;
    *      ...
    *    } Blob;
    *
    *  Blob *b;
    *
    *  b = g_new (Blob, 1);
    *  g_rec_mutex_init (&b->m);
    *  ]|
    *
    *  Calling g_rec_mutex_init() on an already initialized #GRecMutex
    *  leads to undefined behaviour.
    *
    *  To undo the effect of g_rec_mutex_init() when a recursive mutex
    *  is no longer needed, use g_rec_mutex_clear().
    *
    *  NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT BE APPLICABLE TO SCALA
    */
  def init(): Unit /* None */ =
    g_rec_mutex_init(this.getUnsafeRawPointer().asInstanceOf[Ptr[GRecMutex]])
  end init

  /** Locks @rec_mutex. If @rec_mutex is already locked by another thread, the
    * current thread will block until @rec_mutex is unlocked by the other
    * thread. If @rec_mutex is already locked by the current thread, the 'lock
    * count' of @rec_mutex is increased. The mutex will only become available
    * again when it is unlocked as many times as it has been locked.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def lock(): Unit /* None */ =
    g_rec_mutex_lock(this.getUnsafeRawPointer().asInstanceOf[Ptr[GRecMutex]])
  end lock

  /** Tries to lock @rec_mutex. If @rec_mutex is already locked by another
    * thread, it immediately returns %FALSE. Otherwise it locks @rec_mutex and
    * returns %TRUE.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def trylock(): Boolean /* None */ =
    g_rec_mutex_trylock(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GRecMutex]]
    ).value.!=(0)
  end trylock

  /** Unlocks @rec_mutex. If another thread is blocked in a g_rec_mutex_lock()
    * call for @rec_mutex, it will become unblocked and can lock @rec_mutex
    * itself.
    *
    * Calling g_rec_mutex_unlock() on a recursive mutex that is not locked by
    * the current thread leads to undefined behaviour.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unlock(): Unit /* None */ =
    g_rec_mutex_unlock(this.getUnsafeRawPointer().asInstanceOf[Ptr[GRecMutex]])
  end unlock

end RecMutex

object RecMutex:
  def fromRaw(ptr: Ptr[GRecMutex]): RecMutex = new RecMutex(ptr)
end RecMutex
