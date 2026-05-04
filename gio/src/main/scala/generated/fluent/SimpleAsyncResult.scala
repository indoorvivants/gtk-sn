package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.fluent.{AsyncResult, Cancellable}
import sn.gnome.gio.internal.GSimpleAsyncResult
import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.{gboolean, gint, gpointer, gssize}
import sn.gnome.gobject.fluent.Object

/**  COMMENT FOR THE ORIGINAL C DEFINITION
  *
  *  As of GLib 2.46, #GSimpleAsyncResult is deprecated in favor of
  *  #GTask, which provides a simpler API.
  *
  *  #GSimpleAsyncResult implements #GAsyncResult.
  *
  *  GSimpleAsyncResult handles #GAsyncReadyCallbacks, error
  *  reporting, operation cancellation and the final state of an operation,
  *  completely transparent to the application. Results can be returned
  *  as a pointer e.g. for functions that return data that is collected
  *  asynchronously, a boolean value for checking the success or failure
  *  of an operation, or a #gssize for operations which return the number
  *  of bytes modified by the operation; all of the simple return cases
  *  are covered.
  *
  *  Most of the time, an application will not need to know of the details
  *  of this API; it is handled transparently, and any necessary operations
  *  are handled by #GAsyncResult's interface. However, if implementing a
  *  new GIO module, for writing language bindings, or for complex
  *  applications that need better control of how asynchronous operations
  *  are completed, it is important to understand this functionality.
  *
  *  GSimpleAsyncResults are tagged with the calling function to ensure
  *  that asynchronous functions and their finishing functions are used
  *  together correctly.
  *
  *  To create a new #GSimpleAsyncResult, call g_simple_async_result_new().
  *  If the result needs to be created for a #GError, use
  *  g_simple_async_result_new_from_error() or
  *  g_simple_async_result_new_take_error(). If a #GError is not available
  *  (e.g. the asynchronous operation's doesn't take a #GError argument),
  *  but the result still needs to be created for an error condition, use
  *  g_simple_async_result_new_error() (or g_simple_async_result_set_error_va()
  *  if your application or binding requires passing a variable argument list
  *  directly), and the error can then be propagated through the use of
  *  g_simple_async_result_propagate_error().
  *
  *  An asynchronous operation can be made to ignore a cancellation event by
  *  calling g_simple_async_result_set_handle_cancellation() with a
  *  #GSimpleAsyncResult for the operation and %FALSE. This is useful for
  *  operations that are dangerous to cancel, such as close (which would
  *  cause a leak if cancelled before being run).
  *
  *  GSimpleAsyncResult can integrate into GLib's event loop, #GMainLoop,
  *  or it can use #GThreads.
  *  g_simple_async_result_complete() will finish an I/O task directly
  *  from the point where it is called. g_simple_async_result_complete_in_idle()
  *  will finish it from an idle handler in the
  *  [thread-default main context][g-main-context-push-thread-default]
  *  where the #GSimpleAsyncResult was created.
  *  g_simple_async_result_run_in_thread() will run the job in a
  *  separate thread and then use
  *  g_simple_async_result_complete_in_idle() to deliver the result.
  *
  *  To set the results of an asynchronous function,
  *  g_simple_async_result_set_op_res_gpointer(),
  *  g_simple_async_result_set_op_res_gboolean(), and
  *  g_simple_async_result_set_op_res_gssize()
  *  are provided, setting the operation's result to a gpointer, gboolean, or
  *  gssize, respectively.
  *
  *  Likewise, to get the result of an asynchronous function,
  *  g_simple_async_result_get_op_res_gpointer(),
  *  g_simple_async_result_get_op_res_gboolean(), and
  *  g_simple_async_result_get_op_res_gssize() are
  *  provided, getting the operation's result as a gpointer, gboolean, and
  *  gssize, respectively.
  *
  *  For the details of the requirements implementations must respect, see
  *  #GAsyncResult.  A typical implementation of an asynchronous operation
  *  using GSimpleAsyncResult looks something like this:
  *
  *  |[<!-- language="C" -->
  *  static void
  *  baked_cb (Cake    *cake,
  *            gpointer user_data)
  *  {
  *    // In this example, this callback is not given a reference to the cake,
  *    // so the GSimpleAsyncResult has to take a reference to it.
  *    GSimpleAsyncResult *result = user_data;
  *
  *    if (cake == NULL)
  *      g_simple_async_result_set_error (result,
  *                                       BAKER_ERRORS,
  *                                       BAKER_ERROR_NO_FLOUR,
  *                                       "Go to the supermarket");
  *    else
  *      g_simple_async_result_set_op_res_gpointer (result,
  *                                                 g_object_ref (cake),
  *                                                 g_object_unref);
  *
  *    // In this example, we assume that baked_cb is called as a callback from
  *    // the mainloop, so it's safe to complete the operation synchronously here.
  *    // If, however, _baker_prepare_cake () might call its callback without
  *    // first returning to the mainloop — inadvisable, but some APIs do so —
  *    // we would need to use g_simple_async_result_complete_in_idle().
  *    g_simple_async_result_complete (result);
  *    g_object_unref (result);
  *  }
  *
  *  void
  *  baker_bake_cake_async (Baker              *self,
  *                         guint               radius,
  *                         GAsyncReadyCallback callback,
  *                         gpointer            user_data)
  *  {
  *    GSimpleAsyncResult *simple;
  *    Cake               *cake;
  *
  *    if (radius < 3)
  *      {
  *        g_simple_async_report_error_in_idle (G_OBJECT (self),
  *                                             callback,
  *                                             user_data,
  *                                             BAKER_ERRORS,
  *                                             BAKER_ERROR_TOO_SMALL,
  *                                             "%ucm radius cakes are silly",
  *                                             radius);
  *        return;
  *      }
  *
  *    simple = g_simple_async_result_new (G_OBJECT (self),
  *                                        callback,
  *                                        user_data,
  *                                        baker_bake_cake_async);
  *    cake = _baker_get_cached_cake (self, radius);
  *
  *    if (cake != NULL)
  *      {
  *        g_simple_async_result_set_op_res_gpointer (simple,
  *                                                   g_object_ref (cake),
  *                                                   g_object_unref);
  *        g_simple_async_result_complete_in_idle (simple);
  *        g_object_unref (simple);
  *        // Drop the reference returned by _baker_get_cached_cake();
  *        // the GSimpleAsyncResult has taken its own reference.
  *        g_object_unref (cake);
  *        return;
  *      }
  *
  *    _baker_prepare_cake (self, radius, baked_cb, simple);
  *  }
  *
  *  Cake *
  *  baker_bake_cake_finish (Baker        *self,
  *                          GAsyncResult *result,
  *                          GError      **error)
  *  {
  *    GSimpleAsyncResult *simple;
  *    Cake               *cake;
  *
  *    g_return_val_if_fail (g_simple_async_result_is_valid (result,
  *                                                          G_OBJECT (self),
  *                                                          baker_bake_cake_async),
  *                          NULL);
  *
  *    simple = (GSimpleAsyncResult *) result;
  *
  *    if (g_simple_async_result_propagate_error (simple, error))
  *      return NULL;
  *
  *    cake = CAKE (g_simple_async_result_get_op_res_gpointer (simple));
  *    return g_object_ref (cake);
  *  }
  *  ]|
  */
class SimpleAsyncResult(raw: Ptr[GSimpleAsyncResult])
    extends Object(raw.asInstanceOf),
      AsyncResult:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Completes an asynchronous I/O job immediately. Must be called in the
    * thread where the asynchronous result was to be delivered, as it invokes
    * the callback directly. If you are in a different thread use
    * g_simple_async_result_complete_in_idle().
    *
    * Calling this function takes a reference to @simple for as long as is
    * needed to complete the call.
    */
  def complete(): Unit /* None */ = g_simple_async_result_complete(
    this.raw.asInstanceOf[Ptr[GSimpleAsyncResult]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Completes an asynchronous function in an idle handler in the
    * [thread-default main context][g-main-context-push-thread-default] of the
    * thread that @simple was initially created in (and re-pushes that context
    * around the invocation of the callback).
    *
    * Calling this function takes a reference to @simple for as long as is
    * needed to complete the call.
    */
  def completeInIdle(): Unit /* None */ =
    g_simple_async_result_complete_in_idle(
      this.raw.asInstanceOf[Ptr[GSimpleAsyncResult]]
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the operation result boolean from within the asynchronous result.
    */
  def getOpResGboolean(): Boolean /* None */ =
    g_simple_async_result_get_op_res_gboolean(
      this.raw.asInstanceOf[Ptr[GSimpleAsyncResult]]
    ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets a pointer result as returned by the asynchronous function.
    */
  def getOpResGpointer(): Ptr[Byte] /* None */ =
    g_simple_async_result_get_op_res_gpointer(
      this.raw.asInstanceOf[Ptr[GSimpleAsyncResult]]
    ).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets a gssize from the asynchronous result.
    */
  def getOpResGssize(): CLongInt /* None */ =
    g_simple_async_result_get_op_res_gssize(
      this.raw.asInstanceOf[Ptr[GSimpleAsyncResult]]
    ).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the source tag for the #GSimpleAsyncResult.
    */
  def getSourceTag(): Ptr[Byte] /* None */ =
    g_simple_async_result_get_source_tag(
      this.raw.asInstanceOf[Ptr[GSimpleAsyncResult]]
    ).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Propagates an error from within the simple asynchronous result to a given
    * destination.
    *
    * If the #GCancellable given to a prior call to
    * g_simple_async_result_set_check_cancellable() is cancelled then this
    * function will return %TRUE with @dest set appropriately.
    */
  def propagateError(): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_simple_async_result_propagate_error(
        this.raw.asInstanceOf[Ptr[GSimpleAsyncResult]],
        __errorPtr
      ).value.!=(0)
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Runs the asynchronous job in a separate thread and then calls
    * g_simple_async_result_complete_in_idle() on @simple to return the result
    * to the appropriate main loop.
    *
    * Calling this function takes a reference to @simple for as long as is
    * needed to run the job and report its completion.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(SimpleAsyncThreadFunc), @type -> DataRecord(GSimpleAsyncThreadFunc)))"
  )
  def runInThread__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets a #GCancellable to check before dispatching results.
    *
    * This function has one very specific purpose: the provided cancellable is
    * checked at the time of g_simple_async_result_propagate_error() If it is
    * cancelled, these functions will return an "Operation was cancelled" error
    * (%G_IO_ERROR_CANCELLED).
    *
    * Implementors of cancellable asynchronous functions should use this in
    * order to provide a guarantee to their callers that cancelling an async
    * operation will reliably result in an error being returned for that
    * operation (even if a positive result for the operation has already been
    * sent as an idle to the main context to be dispatched).
    *
    * The checking described above is done regardless of any call to the
    * unrelated g_simple_async_result_set_handle_cancellation() function.
    */
  def setCheckCancellable(
      check_cancellable: Option[Cancellable /* Some(Ptr[GCancellable]) */ ]
  ): Unit /* None */ = g_simple_async_result_set_check_cancellable(
    this.raw.asInstanceOf[Ptr[GSimpleAsyncResult]],
    check_cancellable
      .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GCancellable]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets an error within the asynchronous result without a #GError.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Quark), @type -> DataRecord(GQuark)))"
  )
  def setError__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets an error within the asynchronous result without a #GError. Unless
    * writing a binding, see g_simple_async_result_set_error().
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Quark), @type -> DataRecord(GQuark)))"
  )
  def setErrorVa__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the result from a #GError.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Error), @type -> DataRecord(const GError*)))"
  )
  def setFromError__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether to handle cancellation within the asynchronous operation.
    *
    * This function has nothing to do with
    * g_simple_async_result_set_check_cancellable(). It only refers to the
    * #GCancellable passed to g_simple_async_result_run_in_thread().
    */
  def setHandleCancellation(
      handle_cancellation: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = g_simple_async_result_set_handle_cancellation(
    this.raw.asInstanceOf[Ptr[GSimpleAsyncResult]],
    gboolean(gint((if handle_cancellation == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the operation result to a boolean within the asynchronous result.
    */
  def setOpResGboolean(
      op_res: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = g_simple_async_result_set_op_res_gboolean(
    this.raw.asInstanceOf[Ptr[GSimpleAsyncResult]],
    gboolean(gint((if op_res == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the operation result within the asynchronous result to a pointer.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.DestroyNotify), @type -> DataRecord(GDestroyNotify)))"
  )
  def setOpResGpointer__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the operation result within the asynchronous result to the given @op_res.
    */
  def setOpResGssize(
      op_res: CLongInt /* Some(_root_.sn.gnome.glib.internal.gssize) */
  ): Unit /* None */ = g_simple_async_result_set_op_res_gssize(
    this.raw.asInstanceOf[Ptr[GSimpleAsyncResult]],
    gssize(op_res)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the result from @error, and takes over the caller's ownership of @error,
    * so the caller does not need to free it any more.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Error), @type -> DataRecord(GError*)))"
  )
  def takeError__ = ???

end SimpleAsyncResult

object SimpleAsyncResult:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a #GSimpleAsyncResult.
    *
    * The common convention is to create the #GSimpleAsyncResult in the function
    * that starts the asynchronous operation and use that same function as the @source_tag.
    *
    * If your operation supports cancellation with #GCancellable (which it
    * probably should) then you should provide the user's cancellable to
    * g_simple_async_result_set_check_cancellable() immediately after this
    * function returns.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  def `new`() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new #GSimpleAsyncResult with a set error.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  def new_error() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a #GSimpleAsyncResult from an error condition.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  def new_from_error() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a #GSimpleAsyncResult from an error condition, and takes over the
    * caller's ownership of @error, so the caller does not need to free it
    * anymore.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  def new_take_error() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Ensures that the data passed to the _finish function of an async operation
    * is consistent. Three checks are performed.
    *
    * First, @result is checked to ensure that it is really a
    * #GSimpleAsyncResult. Second, @source is checked to ensure that it matches
    * the source object of @result. Third, @source_tag is checked to ensure that
    * it is equal to the @source_tag argument given to
    * g_simple_async_result_new() (which, by convention, is a pointer to the
    * _async function corresponding to the _finish function from which this
    * function is called). (Alternatively, if either
    * @source_tag
    *   or @result's source tag is %NULL, then the source tag check is skipped.)
    */
  def isValid(
      result: AsyncResult /* Some(Ptr[GAsyncResult]) */,
      source: Option[
        Object /* Some(Ptr[_root_.sn.gnome.gobject.internal.GObject]) */
      ],
      source_tag: Option[
        Ptr[Byte] /* Some(_root_.sn.gnome.glib.internal.gpointer) */
      ]
  ): Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */ =
    g_simple_async_result_is_valid(
      result.getUnsafeRawPointer().asInstanceOf,
      source
        .map[Ptr[_root_.sn.gnome.gobject.internal.GObject]](o =>
          o.getUnsafeRawPointer().asInstanceOf
        )
        .getOrElse(
          null.asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GObject]]
        ),
      source_tag
        .map[_root_.sn.gnome.glib.internal.gpointer](o => gpointer(o))
        .getOrElse(null.asInstanceOf[_root_.sn.gnome.glib.internal.gpointer])
    ).value.!=(0)

end SimpleAsyncResult
