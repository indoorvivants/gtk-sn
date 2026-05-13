package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.AsyncResult
import sn.gnome.glib.GResult
import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gobject.Object
import sn.gnome.gobject.runtime.*

trait AsyncInitable:
  def getUnsafeRawPointer(): Ptr[Byte]

  /** Starts asynchronous initialization of the object implementing the
    * interface. This must be done before any real use of the object after
    * initial construction. If the object also implements #GInitable you can
    * optionally call g_initable_init() instead.
    *
    * This method is intended for language bindings. If writing in C,
    * g_async_initable_new_async() should typically be used instead.
    *
    * When the initialization is finished, @callback will be called. You can
    * then call g_async_initable_init_finish() to get the result of the
    * initialization.
    *
    * Implementations may also support cancellation. If @cancellable is not
    * %NULL, then initialization can be cancelled by triggering the cancellable
    * object from another thread. If the operation was cancelled, the error
    * %G_IO_ERROR_CANCELLED will be returned. If @cancellable is not %NULL, and
    * the object doesn't support cancellable initialization, the error
    * %G_IO_ERROR_NOT_SUPPORTED will be returned.
    *
    * As with #GInitable, if the object is not initialized, or initialization
    * returns with an error, then all operations on the object except
    * g_object_ref() and g_object_unref() are considered to be invalid, and have
    * undefined behaviour. They will often fail with g_critical() or
    * g_warning(), but this must not be relied on.
    *
    * Callers should not assume that a class which implements #GAsyncInitable
    * can be initialized multiple times; for more information, see
    * g_initable_init(). If a class explicitly supports being initialized
    * multiple times, implementation requires yielding all subsequent calls to
    * init_async() on the results of the first call.
    *
    * For classes that also support the #GInitable interface, the default
    * implementation of this method will run the g_initable_init() function in a
    * thread, so if you want to support asynchronous initialization via threads,
    * just implement the #GAsyncInitable interface without overriding any
    * interface methods.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method init_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def initAsync__ = ???

  /** Finishes asynchronous initialization and returns the result. See
    * g_async_initable_init_async().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def initFinish(
      res: AsyncResult /* Some(Ptr[GAsyncResult]) */
  ): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_async_initable_init_finish(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GAsyncInitable]],
        res.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value.!=(0)
    )
  end initFinish

  /** Finishes the async construction for the various g_async_initable_new
    * calls, returning the created object or %NULL on error.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def newFinish(
      res: AsyncResult /* Some(Ptr[GAsyncResult]) */
  )(using Runtime): GResult[sn.gnome.gobject.Object /* None */ ] =
    GResult.wrap(__errorPtr =>
      sn.gnome.gobject.Object.applyUnsafe(
        g_async_initable_new_finish(
          this.getUnsafeRawPointer().asInstanceOf[Ptr[GAsyncInitable]],
          res.getUnsafeRawPointer().asInstanceOf,
          __errorPtr
        ).asInstanceOf
      )
    )
  end newFinish

end AsyncInitable

object AsyncInitable:
  class Abstract(raw: Ptr[Byte]) extends AsyncInitable:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end AsyncInitable
