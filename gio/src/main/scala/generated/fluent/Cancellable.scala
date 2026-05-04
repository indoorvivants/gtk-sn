package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.fluent.Cancellable
import sn.gnome.gio.internal.GCancellable
import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.{gboolean, gint, gulong}
import sn.gnome.gobject.fluent.Object

/** GCancellable is a thread-safe operation cancellation stack used throughout
  * GIO to allow for cancellation of synchronous and asynchronous operations.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class Cancellable(raw: Ptr[GCancellable]) extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Will set @cancellable to cancelled, and will emit the
    * #GCancellable::cancelled signal. (However, see the warning about race
    * conditions in the documentation for that signal if you are planning to
    * connect to it.)
    *
    * This function is thread-safe. In other words, you can safely call it from
    * a thread other than the one running the operation that was passed the @cancellable.
    *
    * If @cancellable is %NULL, this function returns immediately for
    * convenience.
    *
    * The convention within GIO is that cancelling an asynchronous operation
    * causes it to complete asynchronously. That is, if you cancel the operation
    * from the same thread in which it is running, then the operation's
    * #GAsyncReadyCallback will not be invoked until the application returns to
    * the main loop.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def cancel(): Unit /* None */ = g_cancellable_cancel(
    this.raw.asInstanceOf[Ptr[GCancellable]]
  )

  /** Convenience function to connect to the #GCancellable::cancelled signal.
    * Also handles the race condition that may happen if the cancellable is
    * cancelled right before connecting.
    *
    * @callback
    *   is called at most once, either directly at the time of the connect if @cancellable
    *   is already cancelled, or when @cancellable is cancelled in some thread.
    *
    * @data_destroy_func
    *   will be called when the handler is disconnected, or immediately if the
    *   cancellable is already cancelled.
    *
    * See #GCancellable::cancelled for details on how to use this.
    *
    * Since GLib 2.40, the lock protecting @cancellable is not held when
    * @callback
    *   is invoked. This lifts a restriction in place for earlier GLib versions
    *   which now makes it easier to write cleanup code that unconditionally
    *   invokes e.g. g_cancellable_cancel().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[connect/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GObject.Callback), @type -> DataRecord(GCallback)))"
  )
  private def connect__ = ???

  /** Disconnects a handler from a cancellable instance similar to
    * g_signal_handler_disconnect(). Additionally, in the event that a signal
    * handler is currently running, this call will block until the handler has
    * finished. Calling this function from a #GCancellable::cancelled signal
    * handler will therefore result in a deadlock.
    *
    * This avoids a race condition where a thread cancels at the same time as
    * the cancellable operation is finished and the signal handler is removed.
    * See #GCancellable::cancelled for details on how to use this.
    *
    * If @cancellable is %NULL or @handler_id is `0` this function does nothing.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def disconnect(
      handler_id: CUnsignedLongInt /* Some(_root_.sn.gnome.glib.internal.gulong) */
  ): Unit /* None */ = g_cancellable_disconnect(
    this.raw.asInstanceOf[Ptr[GCancellable]],
    gulong(handler_id)
  )

  /** Gets the file descriptor for a cancellable job. This can be used to
    * implement cancellable operations on Unix systems. The returned fd will
    * turn readable when @cancellable is cancelled.
    *
    * You are not supposed to read from the fd yourself, just check for readable
    * status. Reading to unset the readable status is done with
    * g_cancellable_reset().
    *
    * After a successful return from this function, you should use
    * g_cancellable_release_fd() to free up resources allocated for the returned
    * file descriptor.
    *
    * See also g_cancellable_make_pollfd().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getFd(): Int /* None */ = g_cancellable_get_fd(
    this.raw.asInstanceOf[Ptr[GCancellable]]
  )

  /** Checks if a cancellable job has been cancelled.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isCancelled(): Boolean /* None */ = g_cancellable_is_cancelled(
    this.raw.asInstanceOf[Ptr[GCancellable]]
  ).value.!=(0)

  /** Creates a #GPollFD corresponding to @cancellable; this can be passed to
    * g_poll() and used to poll for cancellation. This is useful both for unix
    * systems without a native poll and for portability to windows.
    *
    * When this function returns %TRUE, you should use
    * g_cancellable_release_fd() to free up resources allocated for the
    * @pollfd.
    *   After a %FALSE return, do not call g_cancellable_release_fd().
    *
    * If this function returns %FALSE, either no @cancellable was given or
    * resource limits prevent this function from allocating the necessary
    * structures for polling. (On Linux, you will likely have reached the
    * maximum number of file descriptors.) The suggested way to handle these
    * cases is to ignore the @cancellable.
    *
    * You are not supposed to read from the fd yourself, just check for readable
    * status. Reading to unset the readable status is done with
    * g_cancellable_reset().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[make_pollfd/<method parameters>/pollfd]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.PollFD), @type -> DataRecord(GPollFD*)))"
  )
  private def makePollfd__ = ???

  /** Pops @cancellable off the cancellable stack (verifying that @cancellable
    * is on the top of the stack).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def popCurrent(): Unit /* None */ = g_cancellable_pop_current(
    this.raw.asInstanceOf[Ptr[GCancellable]]
  )

  /** Pushes @cancellable onto the cancellable stack. The current cancellable
    * can then be received using g_cancellable_get_current().
    *
    * This is useful when implementing cancellable operations in code that does
    * not allow you to pass down the cancellable object.
    *
    * This is typically called automatically by e.g. #GFile operations, so you
    * rarely have to call this yourself.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def pushCurrent(): Unit /* None */ = g_cancellable_push_current(
    this.raw.asInstanceOf[Ptr[GCancellable]]
  )

  /** Releases a resources previously allocated by g_cancellable_get_fd() or
    * g_cancellable_make_pollfd().
    *
    * For compatibility reasons with older releases, calling this function is
    * not strictly required, the resources will be automatically freed when the @cancellable
    * is finalized. However, the @cancellable will block scarce file descriptors
    * until it is finalized if this function is not called. This can cause the
    * application to run out of file descriptors when many #GCancellables are
    * used at the same time.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def releaseFd(): Unit /* None */ = g_cancellable_release_fd(
    this.raw.asInstanceOf[Ptr[GCancellable]]
  )

  /** Resets @cancellable to its uncancelled state.
    *
    * If cancellable is currently in use by any cancellable operation then the
    * behavior of this function is undefined.
    *
    * Note that it is generally not a good idea to reuse an existing cancellable
    * for more operations after it has been cancelled once, as this function
    * might tempt you to do. The recommended practice is to drop the reference
    * to a cancellable after cancelling it, and let it die with the outstanding
    * async operations. You should create a fresh cancellable for further async
    * operations.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def reset(): Unit /* None */ = g_cancellable_reset(
    this.raw.asInstanceOf[Ptr[GCancellable]]
  )

  /** If the @cancellable is cancelled, sets the error to notify that the
    * operation was cancelled.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setErrorIfCancelled(): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_cancellable_set_error_if_cancelled(
        this.raw.asInstanceOf[Ptr[GCancellable]],
        __errorPtr
      ).value.!=(0)
    )

  /** Creates a source that triggers if @cancellable is cancelled and calls its
    * callback of type #GCancellableSourceFunc. This is primarily useful for
    * attaching to another (non-cancellable) source with
    * g_source_add_child_source() to add cancellability to it.
    *
    * For convenience, you can call this with a %NULL #GCancellable, in which
    * case the source will never trigger.
    *
    * The new #GSource will hold a reference to the #GCancellable.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[source_new/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Source), @type -> DataRecord(GSource*)))"
  )
  private def sourceNew__ = ???

end Cancellable

object Cancellable:
  /** Creates a new #GCancellable object.
    *
    * Applications that want to start one or more operations that should be
    * cancellable should create a #GCancellable and pass it to the operations.
    *
    * One #GCancellable can be used in multiple consecutive operations or in
    * multiple concurrent operations.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(): Cancellable = new Cancellable(g_cancellable_new().asInstanceOf)

  /** Gets the top cancellable from the stack.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getCurrent(): Cancellable /* Some(Ptr[GCancellable]) */ = new Cancellable(
    g_cancellable_get_current().asInstanceOf
  )

end Cancellable
