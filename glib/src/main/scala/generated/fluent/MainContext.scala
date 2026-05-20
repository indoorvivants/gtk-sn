package sn.gnome.glib

import _root_.sn.gnome.glib.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.{MainContext, PollFD, Source, SourceFuncs}
import sn.gnome.glib.internal.{GMainContext, gboolean, gint, gpointer, guint}

/** The `GMainContext` struct is an opaque data type representing a set of
  * sources to be handled in a main loop.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class MainContext private[gnome] (raw: Ptr[GMainContext]):

  def getUnsafeRawPointer(): Ptr[GMainContext] = this.raw

  /** Tries to become the owner of the specified context. If some other thread
    * is the owner of the context, returns %FALSE immediately. Ownership is
    * properly recursive: the owner can require ownership again and will release
    * ownership when g_main_context_release() is called as many times as
    * g_main_context_acquire().
    *
    * You must be the owner of a context before you can call
    * g_main_context_prepare(), g_main_context_query(), g_main_context_check(),
    * g_main_context_dispatch(), g_main_context_release().
    *
    * Since 2.76 @context can be %NULL to use the global-default main context.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def acquire(): Boolean /* None */ =
    g_main_context_acquire(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GMainContext]]
    ).value.!=(0)
  end acquire

  /** Adds a file descriptor to the set of file descriptors polled for this
    * context. This will very seldom be used directly. Instead a typical event
    * source will use g_source_add_unix_fd() instead.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def addPoll(
      fd: sn.gnome.glib.PollFD /* Some(Ptr[GPollFD]) */,
      priority: Int /* Some(gint) */
  ): Unit /* None */ =
    g_main_context_add_poll(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GMainContext]],
      fd.getUnsafeRawPointer().asInstanceOf,
      gint(priority)
    )
  end addPoll

  /** Passes the results of polling back to the main loop. You should be careful
    * to pass @fds and its length @n_fds as received from
    * g_main_context_query(), as this functions relies on assumptions on how @fds
    * is filled.
    *
    * You must have successfully acquired the context with
    * g_main_context_acquire() before you may call this function.
    *
    * Since 2.76 @context can be %NULL to use the global-default main context.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method check/<method parameters>/fds]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(PollFD), @type -> DataRecord(GPollFD)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(2), @type -> DataRecord(GPollFD*)))"
  )
  private def check__ = ???

  /** Dispatches all pending sources.
    *
    * You must have successfully acquired the context with
    * g_main_context_acquire() before you may call this function.
    *
    * Since 2.76 @context can be %NULL to use the global-default main context.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def dispatch(): Unit /* None */ =
    g_main_context_dispatch(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GMainContext]]
    )
  end dispatch

  /** Finds a source with the given source functions and user data. If multiple
    * sources exist with the same source function and user data, the first one
    * found will be returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def findSourceByFuncsUserData(
      funcs: sn.gnome.glib.SourceFuncs /* Some(Ptr[GSourceFuncs]) */,
      user_data: Option[Ptr[Byte] /* Some(gpointer) */ ]
  ): sn.gnome.glib.Source /* None */ =
    sn.gnome.glib.Source.fromRaw(
      g_main_context_find_source_by_funcs_user_data(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GMainContext]],
        funcs.getUnsafeRawPointer().asInstanceOf,
        user_data
          .map[gpointer](o => gpointer(o))
          .getOrElse(null.asInstanceOf[gpointer])
      )
    )
  end findSourceByFuncsUserData

  /** Finds a #GSource given a pair of context and ID.
    *
    * It is a programmer error to attempt to look up a non-existent source.
    *
    * More specifically: source IDs can be reissued after a source has been
    * destroyed and therefore it is never valid to use this function with a
    * source ID which may have already been removed. An example is when
    * scheduling an idle to run in another thread with g_idle_add(): the idle
    * may already have run and been removed by the time this function is called
    * on its (now invalid) source ID. This source ID may have been reissued,
    * leading to the operation being performed against the wrong source.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def findSourceById(
      source_id: UInt /* Some(guint) */
  ): sn.gnome.glib.Source /* None */ =
    sn.gnome.glib.Source.fromRaw(
      g_main_context_find_source_by_id(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GMainContext]],
        guint(source_id)
      )
    )
  end findSourceById

  /** Finds a source with the given user data for the callback. If multiple
    * sources exist with the same user data, the first one found will be
    * returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def findSourceByUserData(
      user_data: Option[Ptr[Byte] /* Some(gpointer) */ ]
  ): sn.gnome.glib.Source /* None */ =
    sn.gnome.glib.Source.fromRaw(
      g_main_context_find_source_by_user_data(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GMainContext]],
        user_data
          .map[gpointer](o => gpointer(o))
          .getOrElse(null.asInstanceOf[gpointer])
      )
    )
  end findSourceByUserData

  /** Gets the poll function set by g_main_context_set_poll_func().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_poll_func/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(PollFunc), @type -> DataRecord(GPollFunc)))"
  )
  private def getPollFunc__ = ???

  /** Invokes a function in such a way that @context is owned during the
    * invocation of @function.
    *
    * If @context is %NULL then the global-default main context — as returned by
    * g_main_context_default() — is used.
    *
    * If @context is owned by the current thread, @function is called directly.
    * Otherwise, if @context is the thread-default main context of the current
    * thread and g_main_context_acquire() succeeds, then
    * @function
    *   is called and g_main_context_release() is called afterwards.
    *
    * In any other case, an idle source is created to call @function and that
    * source is attached to @context (presumably to be run in another thread).
    * The idle source is attached with %G_PRIORITY_DEFAULT priority. If you want
    * a different priority, use g_main_context_invoke_full().
    *
    * Note that, as with normal idle functions, @function should probably return
    * %FALSE. If it returns %TRUE, it will be continuously run in a loop (and
    * may prevent this call from returning).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method invoke/<method parameters>/function]: Cannot render type Type(List(),ListMap(@name -> DataRecord(SourceFunc), @type -> DataRecord(GSourceFunc)))"
  )
  private def invoke__ = ???

  /** Invokes a function in such a way that @context is owned during the
    * invocation of @function.
    *
    * This function is the same as g_main_context_invoke() except that it lets
    * you specify the priority in case @function ends up being scheduled as an
    * idle and also lets you give a #GDestroyNotify for @data.
    *
    * @notify
    *   should not assume that it is called from any particular thread or with
    *   any particular context acquired.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method invoke_full/<method parameters>/function]: Cannot render type Type(List(),ListMap(@name -> DataRecord(SourceFunc), @type -> DataRecord(GSourceFunc)))"
  )
  private def invokeFull__ = ???

  /** Determines whether this thread holds the (recursive) ownership of this
    * #GMainContext. This is useful to know before waiting on another thread
    * that may be blocking to get ownership of @context.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isOwner(): Boolean /* None */ =
    g_main_context_is_owner(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GMainContext]]
    ).value.!=(0)
  end isOwner

  /** Runs a single iteration for the given main loop. This involves checking to
    * see if any event sources are ready to be processed, then if no events
    * sources are ready and @may_block is %TRUE, waiting for a source to become
    * ready, then dispatching the highest priority events sources that are
    * ready. Otherwise, if @may_block is %FALSE sources are not waited to become
    * ready, only those highest priority events sources will be dispatched (if
    * any), that are ready at this given moment without further waiting.
    *
    * Note that even when @may_block is %TRUE, it is still possible for
    * g_main_context_iteration() to return %FALSE, since the wait may be
    * interrupted for other reasons than an event source becoming ready.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def iteration(may_block: Boolean /* Some(gboolean) */ ): Boolean /* None */ =
    g_main_context_iteration(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GMainContext]],
      gboolean(gint((if may_block == true then 1 else 0)))
    ).value.!=(0)
  end iteration

  /** Checks if any sources have pending events for the given context.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def pending(): Boolean /* None */ =
    g_main_context_pending(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GMainContext]]
    ).value.!=(0)
  end pending

  /** Pops @context off the thread-default context stack (verifying that it was
    * on the top of the stack).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def popThreadDefault(): Unit /* None */ =
    g_main_context_pop_thread_default(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GMainContext]]
    )
  end popThreadDefault

  /** Prepares to poll sources within a main loop. The resulting information for
    * polling is determined by calling g_main_context_query ().
    *
    * You must have successfully acquired the context with
    * g_main_context_acquire() before you may call this function.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method prepare]: Method prepare contains an OUT parameter, which is not supported yet"
  )
  private def prepare__ = ???

  /** Acquires @context and sets it as the thread-default context for the
    * current thread. This will cause certain asynchronous operations (such as
    * most [gio][gio]-based I/O) which are started in this thread to run under @context
    * and deliver their results to its main loop, rather than running under the
    * global default main context in the main thread. Note that calling this
    * function changes the context returned by
    * g_main_context_get_thread_default(), not the one returned by
    * g_main_context_default(), so it does not affect the context used by
    * functions like g_idle_add().
    *
    * Normally you would call this function shortly after creating a new thread,
    * passing it a #GMainContext which will be run by a #GMainLoop in that
    * thread, to set a new default context for all async operations in that
    * thread. In this case you may not need to ever call
    * g_main_context_pop_thread_default(), assuming you want the new
    * #GMainContext to be the default for the whole lifecycle of the thread.
    *
    * If you don't have control over how the new thread was created (e.g. in the
    * new thread isn't newly created, or if the thread life cycle is managed by
    * a #GThreadPool), it is always suggested to wrap the logic that needs to
    * use the new #GMainContext inside a g_main_context_push_thread_default() /
    * g_main_context_pop_thread_default() pair, otherwise threads that are
    * re-used will end up never explicitly releasing the #GMainContext reference
    * they hold.
    *
    * In some cases you may want to schedule a single operation in a non-default
    * context, or temporarily use a non-default context in the main thread. In
    * that case, you can wrap the call to the asynchronous operation inside a
    * g_main_context_push_thread_default() / g_main_context_pop_thread_default()
    * pair, but it is up to you to ensure that no other asynchronous operations
    * accidentally get started while the non-default context is active.
    *
    * Beware that libraries that predate this function may not correctly handle
    * being used from a thread with a thread-default context. Eg, see
    * g_file_supports_thread_contexts().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def pushThreadDefault(): Unit /* None */ =
    g_main_context_push_thread_default(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GMainContext]]
    )
  end pushThreadDefault

  /** Determines information necessary to poll this main loop. You should be
    * careful to pass the resulting @fds array and its length @n_fds as is when
    * calling g_main_context_check(), as this function relies on assumptions
    * made when the array is filled.
    *
    * You must have successfully acquired the context with
    * g_main_context_acquire() before you may call this function.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method query]: Method query contains an OUT parameter, which is not supported yet"
  )
  private def query__ = ???

  /** Increases the reference count on a #GMainContext object by one.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def ref(): sn.gnome.glib.MainContext /* None */ =
    sn.gnome.glib.MainContext.fromRaw(
      g_main_context_ref(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GMainContext]]
      )
    )
  end ref

  /** Releases ownership of a context previously acquired by this thread with
    * g_main_context_acquire(). If the context was acquired multiple times, the
    * ownership will be released only when g_main_context_release() is called as
    * many times as it was acquired.
    *
    * You must have successfully acquired the context with
    * g_main_context_acquire() before you may call this function.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def release(): Unit /* None */ =
    g_main_context_release(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GMainContext]]
    )
  end release

  /** Removes file descriptor from the set of file descriptors to be polled for
    * a particular context.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def removePoll(
      fd: sn.gnome.glib.PollFD /* Some(Ptr[GPollFD]) */
  ): Unit /* None */ =
    g_main_context_remove_poll(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GMainContext]],
      fd.getUnsafeRawPointer().asInstanceOf
    )
  end removePoll

  /** Sets the function to use to handle polling of file descriptors. It will be
    * used instead of the poll() system call (or GLib's replacement function,
    * which is used where poll() isn't available).
    *
    * This function could possibly be used to integrate the GLib event loop with
    * an external event loop.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_poll_func/<method parameters>/func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(PollFunc), @type -> DataRecord(GPollFunc)))"
  )
  private def setPollFunc__ = ???

  /** Decreases the reference count on a #GMainContext object by one. If the
    * result is zero, free the context and free all associated memory.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unref(): Unit /* None */ =
    g_main_context_unref(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GMainContext]]
    )
  end unref

  /** Tries to become the owner of the specified context, as with
    * g_main_context_acquire(). But if another thread is the owner, atomically
    * drop @mutex and wait on @cond until that owner releases ownership or until @cond
    * is signaled, then try again (once) to become the owner.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method wait/<method parameters>/mutex]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Mutex), @type -> DataRecord(GMutex*)))"
  )
  private def wait__ = ???

  /**  If @context is currently blocking in g_main_context_iteration()
    *  waiting for a source to become ready, cause it to stop blocking
    *  and return.  Otherwise, cause the next invocation of
    *  g_main_context_iteration() to return without blocking.
    *
    *  This API is useful for low-level control over #GMainContext; for
    *  example, integrating it with main loop implementations such as
    *  #GMainLoop.
    *
    *  Another related use for this function is when implementing a main
    *  loop with a termination condition, computed from multiple threads:
    *
    *  |[<!-- language="C" -->
    *    #define NUM_TASKS 10
    *    static gint tasks_remaining = NUM_TASKS;  // (atomic)
    *    ...
    *
    *    while (g_atomic_int_get (&tasks_remaining) != 0)
    *      g_main_context_iteration (NULL, TRUE);
    *  ]|
    *
    *  Then in a thread:
    *  |[<!-- language="C" -->
    *    perform_work();
    *
    *    if (g_atomic_int_dec_and_test (&tasks_remaining))
    *      g_main_context_wakeup (NULL);
    *  ]|
    *
    *  NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT BE APPLICABLE TO SCALA
    */
  def wakeup(): Unit /* None */ =
    g_main_context_wakeup(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GMainContext]]
    )
  end wakeup

end MainContext

object MainContext:
  def fromRaw(ptr: Ptr[GMainContext]): MainContext = new MainContext(ptr)
end MainContext
