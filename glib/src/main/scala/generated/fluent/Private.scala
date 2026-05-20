package sn.gnome.glib

import _root_.sn.gnome.glib.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.{GPrivate, gpointer}

/** The #GPrivate struct is an opaque data structure to represent a thread-local
  * data key. It is approximately equivalent to the
  * pthread_setspecific()/pthread_getspecific() APIs on POSIX and to
  * TlsSetValue()/TlsGetValue() on Windows.
  *
  * If you don't already know why you might want this functionality, then you
  * probably don't need it.
  *
  * #GPrivate is a very limited resource (as far as 128 per program, shared
  * between all libraries). It is also not possible to destroy a #GPrivate after
  * it has been used. As such, it is only ever acceptable to use #GPrivate in
  * static scope, and even then sparingly so.
  *
  * See G_PRIVATE_INIT() for a couple of examples.
  *
  * The #GPrivate structure should be considered opaque. It should only be
  * accessed via the g_private_ functions.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class Private private[gnome] (raw: Ptr[GPrivate]):

  def getUnsafeRawPointer(): Ptr[GPrivate] = this.raw

  @annotation.compileTimeOnly(
    "[field notify]: Field notify has no target types"
  )
  private def notify__ = ???

  /** Returns the current value of the thread local variable @key.
    *
    * If the value has not yet been set in this thread, %NULL is returned.
    * Values are never copied between threads (when a new thread is created, for
    * example).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def get(): Ptr[Byte] /* None */ =
    g_private_get(this.getUnsafeRawPointer().asInstanceOf[Ptr[GPrivate]]).value
  end get

  /** Sets the thread local variable @key to have the value @value in the
    * current thread.
    *
    * This function differs from g_private_set() in the following way: if the
    * previous value was non-%NULL then the #GDestroyNotify handler for
    * @key
    *   is run on it.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def replace(value: Option[Ptr[Byte] /* Some(gpointer) */ ]): Unit /* None */ =
    g_private_replace(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GPrivate]],
      value
        .map[gpointer](o => gpointer(o))
        .getOrElse(null.asInstanceOf[gpointer])
    )
  end replace

  /** Sets the thread local variable @key to have the value @value in the
    * current thread.
    *
    * This function differs from g_private_replace() in the following way: the
    * #GDestroyNotify for @key is not called on the old value.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def set(value: Option[Ptr[Byte] /* Some(gpointer) */ ]): Unit /* None */ =
    g_private_set(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GPrivate]],
      value
        .map[gpointer](o => gpointer(o))
        .getOrElse(null.asInstanceOf[gpointer])
    )
  end set

end Private

object Private:
  def fromRaw(ptr: Ptr[GPrivate]): Private = new Private(ptr)
end Private
