package sn.gnome.glib

import _root_.sn.gnome.glib.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.{
  IOCondition,
  MainContext,
  PollFD,
  Source,
  SourceCallbackFuncs,
  SourceFuncs,
  TimeVal
}
import sn.gnome.glib.internal.{GSource, gboolean, gint, gint64, gpointer, guint}

/** The `GSource` struct is an opaque data type representing an event source.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class Source private[gnome] (raw: Ptr[GSource]):

  def getUnsafeRawPointer(): Ptr[GSource] = this.raw

  /** Adds @child_source to @source as a "polled" source; when @source is added
    * to a #GMainContext, @child_source will be automatically added with the
    * same priority, when @child_source is triggered, it will cause @source to
    * dispatch (in addition to calling its own callback), and when @source is
    * destroyed, it will destroy
    * @child_source
    *   as well. (@source will also still be dispatched if its own prepare/check
    *   functions indicate that it is ready.)
    *
    * If you don't need @child_source to do anything on its own when it
    * triggers, you can call g_source_set_dummy_callback() on it to set a
    * callback that does nothing (except return %TRUE if appropriate).
    *
    * @source
    *   will hold a reference on @child_source while @child_source is attached
    *   to it.
    *
    * This API is only intended to be used by implementations of #GSource. Do
    * not call this API on a #GSource that you did not create.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def addChildSource(
      child_source: sn.gnome.glib.Source /* Some(Ptr[GSource]) */
  ): Unit /* None */ =
    g_source_add_child_source(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GSource]],
      child_source.getUnsafeRawPointer().asInstanceOf
    )
  end addChildSource

  /** Adds a file descriptor to the set of file descriptors polled for this
    * source. This is usually combined with g_source_new() to add an event
    * source. The event source's check function will typically test the @revents
    * field in the #GPollFD struct and return %TRUE if events need to be
    * processed.
    *
    * This API is only intended to be used by implementations of #GSource. Do
    * not call this API on a #GSource that you did not create.
    *
    * Using this API forces the linear scanning of event sources on each main
    * loop iteration. Newly-written event sources should try to use
    * g_source_add_unix_fd() instead of this API.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def addPoll(
      fd: sn.gnome.glib.PollFD /* Some(Ptr[GPollFD]) */
  ): Unit /* None */ =
    g_source_add_poll(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GSource]],
      fd.getUnsafeRawPointer().asInstanceOf
    )
  end addPoll

  /** Monitors @fd for the IO events in @events.
    *
    * The tag returned by this function can be used to remove or modify the
    * monitoring of the fd using g_source_remove_unix_fd() or
    * g_source_modify_unix_fd().
    *
    * It is not necessary to remove the fd before destroying the source; it will
    * be cleaned up automatically.
    *
    * This API is only intended to be used by implementations of #GSource. Do
    * not call this API on a #GSource that you did not create.
    *
    * As the name suggests, this function is not available on Windows.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def addUnixFd(
      fd: Int /* Some(gint) */,
      events: sn.gnome.glib.IOCondition /* Some(GIOCondition) */
  ): Ptr[Byte] /* None */ =
    g_source_add_unix_fd(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GSource]],
      gint(fd),
      events.raw
    ).value
  end addUnixFd

  /** Adds a #GSource to a @context so that it will be executed within that
    * context. Remove it by calling g_source_destroy().
    *
    * This function is safe to call from any thread, regardless of which thread
    * the @context is running in.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def attach(
      context: Option[sn.gnome.glib.MainContext /* Some(Ptr[GMainContext]) */ ]
  ): UInt /* None */ =
    g_source_attach(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GSource]],
      context
        .map[Ptr[GMainContext]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GMainContext]])
    ).value
  end attach

  /** Removes a source from its #GMainContext, if any, and mark it as destroyed.
    * The source cannot be subsequently added to another context. It is safe to
    * call this on sources which have already been removed from their context.
    *
    * This does not unref the #GSource: if you still hold a reference, use
    * g_source_unref() to drop it.
    *
    * This function is safe to call from any thread, regardless of which thread
    * the #GMainContext is running in.
    *
    * If the source is currently attached to a #GMainContext, destroying it will
    * effectively unset the callback similar to calling g_source_set_callback().
    * This can mean, that the data's #GDestroyNotify gets called right away.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def destroy(): Unit /* None */ =
    g_source_destroy(this.getUnsafeRawPointer().asInstanceOf[Ptr[GSource]])
  end destroy

  /** Checks whether a source is allowed to be called recursively. see
    * g_source_set_can_recurse().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getCanRecurse(): Boolean /* None */ =
    g_source_get_can_recurse(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GSource]]
    ).value.!=(0)
  end getCanRecurse

  /** Gets the #GMainContext with which the source is associated.
    *
    * You can call this on a source that has been destroyed, provided that the
    * #GMainContext it was attached to still exists (in which case it will
    * return that #GMainContext). In particular, you can always call this
    * function on the source returned from g_main_current_source(). But calling
    * this function on a source whose #GMainContext has been destroyed is an
    * error.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getContext(): sn.gnome.glib.MainContext /* None */ =
    sn.gnome.glib.MainContext.fromRaw(
      g_source_get_context(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GSource]]
      )
    )
  end getContext

  /** This function ignores @source and is otherwise the same as
    * g_get_current_time().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getCurrentTime(
      timeval: sn.gnome.glib.TimeVal /* Some(Ptr[GTimeVal]) */
  ): Unit /* None */ =
    g_source_get_current_time(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GSource]],
      timeval.getUnsafeRawPointer().asInstanceOf
    )
  end getCurrentTime

  /** Returns the numeric ID for a particular source. The ID of a source is a
    * positive integer which is unique within a particular main loop context.
    * The reverse mapping from ID to source is done by
    * g_main_context_find_source_by_id().
    *
    * You can only call this function while the source is associated to a
    * #GMainContext instance; calling this function before g_source_attach() or
    * after g_source_destroy() yields undefined behavior. The ID returned is
    * unique within the #GMainContext instance passed to g_source_attach().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getId(): UInt /* None */ =
    g_source_get_id(this.getUnsafeRawPointer().asInstanceOf[Ptr[GSource]]).value
  end getId

  /** Gets a name for the source, used in debugging and profiling. The name may
    * be #NULL if it has never been set with g_source_set_name().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getName(): scala.Predef.String /* None */ =
    fromCString(
      g_source_get_name(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GSource]]
      ).asInstanceOf
    )
  end getName

  /** Gets the priority of a source.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPriority(): Int /* None */ =
    g_source_get_priority(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GSource]]
    ).value
  end getPriority

  /** Gets the "ready time" of @source, as set by g_source_set_ready_time().
    *
    * Any time before the current monotonic time (including 0) is an indication
    * that the source will fire immediately.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getReadyTime(): CLongInt /* None */ =
    g_source_get_ready_time(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GSource]]
    ).value
  end getReadyTime

  /** Gets the time to be used when checking this source. The advantage of
    * calling this function over calling g_get_monotonic_time() directly is that
    * when checking multiple sources, GLib can cache a single value instead of
    * having to repeatedly get the system monotonic time.
    *
    * The time here is the system monotonic time, if available, or some other
    * reasonable alternative otherwise. See g_get_monotonic_time().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getTime(): CLongInt /* None */ =
    g_source_get_time(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GSource]]
    ).value
  end getTime

  /**  Returns whether @source has been destroyed.
    *
    *  This is important when you operate upon your objects
    *  from within idle handlers, but may have freed the object
    *  before the dispatch of your idle handler.
    *
    *  |[<!-- language="C" -->
    *  static gboolean
    *  idle_callback (gpointer data)
    *  {
    *    SomeWidget *self = data;
    *
    *    g_mutex_lock (&self->idle_id_mutex);
    *    // do stuff with self
    *    self->idle_id = 0;
    *    g_mutex_unlock (&self->idle_id_mutex);
    *
    *    return G_SOURCE_REMOVE;
    *  }
    *
    *  static void
    *  some_widget_do_stuff_later (SomeWidget *self)
    *  {
    *    g_mutex_lock (&self->idle_id_mutex);
    *    self->idle_id = g_idle_add (idle_callback, self);
    *    g_mutex_unlock (&self->idle_id_mutex);
    *  }
    *
    *  static void
    *  some_widget_init (SomeWidget *self)
    *  {
    *    g_mutex_init (&self->idle_id_mutex);
    *
    *    // ...
    *  }
    *
    *  static void
    *  some_widget_finalize (GObject *object)
    *  {
    *    SomeWidget *self = SOME_WIDGET (object);
    *
    *    if (self->idle_id)
    *      g_source_remove (self->idle_id);
    *
    *    g_mutex_clear (&self->idle_id_mutex);
    *
    *    G_OBJECT_CLASS (parent_class)->finalize (object);
    *  }
    *  ]|
    *
    *  This will fail in a multi-threaded application if the
    *  widget is destroyed before the idle handler fires due
    *  to the use after free in the callback. A solution, to
    *  this particular problem, is to check to if the source
    *  has already been destroy within the callback.
    *
    *  |[<!-- language="C" -->
    *  static gboolean
    *  idle_callback (gpointer data)
    *  {
    *    SomeWidget *self = data;
    *
    *    g_mutex_lock (&self->idle_id_mutex);
    *    if (!g_source_is_destroyed (g_main_current_source ()))
    *      {
    *        // do stuff with self
    *      }
    *    g_mutex_unlock (&self->idle_id_mutex);
    *
    *    return FALSE;
    *  }
    *  ]|
    *
    *  Calls to this function from a thread other than the one acquired by the
    *  #GMainContext the #GSource is attached to are typically redundant, as the
    *  source could be destroyed immediately after this function returns. However,
    *  once a source is destroyed it cannot be un-destroyed, so this function can be
    *  used for opportunistic checks from any thread.
    *
    *  NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT BE APPLICABLE TO SCALA
    */
  def isDestroyed(): Boolean /* None */ =
    g_source_is_destroyed(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GSource]]
    ).value.!=(0)
  end isDestroyed

  /** Updates the event mask to watch for the fd identified by @tag.
    *
    * @tag
    *   is the tag returned from g_source_add_unix_fd().
    *
    * If you want to remove a fd, don't set its event mask to zero. Instead,
    * call g_source_remove_unix_fd().
    *
    * This API is only intended to be used by implementations of #GSource. Do
    * not call this API on a #GSource that you did not create.
    *
    * As the name suggests, this function is not available on Windows.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def modifyUnixFd(
      tag: Ptr[Byte] /* Some(gpointer) */,
      new_events: sn.gnome.glib.IOCondition /* Some(GIOCondition) */
  ): Unit /* None */ =
    g_source_modify_unix_fd(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GSource]],
      gpointer(tag),
      new_events.raw
    )
  end modifyUnixFd

  /** Queries the events reported for the fd corresponding to @tag on
    * @source
    *   during the last poll.
    *
    * The return value of this function is only defined when the function is
    * called from the check or dispatch functions for @source.
    *
    * This API is only intended to be used by implementations of #GSource. Do
    * not call this API on a #GSource that you did not create.
    *
    * As the name suggests, this function is not available on Windows.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def queryUnixFd(
      tag: Ptr[Byte] /* Some(gpointer) */
  ): sn.gnome.glib.IOCondition /* None */ =
    sn.gnome.glib.IOCondition.fromRaw(
      g_source_query_unix_fd(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GSource]],
        gpointer(tag)
      )
    )
  end queryUnixFd

  /** Increases the reference count on a source by one.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def ref(): sn.gnome.glib.Source /* None */ =
    sn.gnome.glib.Source.fromRaw(
      g_source_ref(this.getUnsafeRawPointer().asInstanceOf[Ptr[GSource]])
    )
  end ref

  /** Detaches @child_source from @source and destroys it.
    *
    * This API is only intended to be used by implementations of #GSource. Do
    * not call this API on a #GSource that you did not create.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def removeChildSource(
      child_source: sn.gnome.glib.Source /* Some(Ptr[GSource]) */
  ): Unit /* None */ =
    g_source_remove_child_source(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GSource]],
      child_source.getUnsafeRawPointer().asInstanceOf
    )
  end removeChildSource

  /** Removes a file descriptor from the set of file descriptors polled for this
    * source.
    *
    * This API is only intended to be used by implementations of #GSource. Do
    * not call this API on a #GSource that you did not create.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def removePoll(
      fd: sn.gnome.glib.PollFD /* Some(Ptr[GPollFD]) */
  ): Unit /* None */ =
    g_source_remove_poll(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GSource]],
      fd.getUnsafeRawPointer().asInstanceOf
    )
  end removePoll

  /** Reverses the effect of a previous call to g_source_add_unix_fd().
    *
    * You only need to call this if you want to remove an fd from being watched
    * while keeping the same source around. In the normal case you will just
    * want to destroy the source.
    *
    * This API is only intended to be used by implementations of #GSource. Do
    * not call this API on a #GSource that you did not create.
    *
    * As the name suggests, this function is not available on Windows.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def removeUnixFd(tag: Ptr[Byte] /* Some(gpointer) */ ): Unit /* None */ =
    g_source_remove_unix_fd(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GSource]],
      gpointer(tag)
    )
  end removeUnixFd

  /** Sets the callback function for a source. The callback for a source is
    * called from the source's dispatch function.
    *
    * The exact type of @func depends on the type of source; ie. you should not
    * count on @func being called with @data as its first parameter. Cast @func
    * with G_SOURCE_FUNC() to avoid warnings about incompatible function types.
    *
    * See [memory management of sources][mainloop-memory-management] for details
    * on how to handle memory management of @data.
    *
    * Typically, you won't use this function. Instead use functions specific to
    * the type of source you are using, such as g_idle_add() or g_timeout_add().
    *
    * It is safe to call this function multiple times on a source which has
    * already been attached to a context. The changes will take effect for the
    * next time the source is dispatched after this call returns.
    *
    * Note that g_source_destroy() for a currently attached source has the
    * effect of also unsetting the callback.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_callback/<method parameters>/func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(SourceFunc), @type -> DataRecord(GSourceFunc)))"
  )
  private def setCallback__ = ???

  /** Sets the callback function storing the data as a refcounted callback
    * "object". This is used internally. Note that calling
    * g_source_set_callback_indirect() assumes an initial reference count on @callback_data,
    * and thus
    * @callback_funcs->unref
    *   will eventually be called once more than @callback_funcs->ref.
    *
    * It is safe to call this function multiple times on a source which has
    * already been attached to a context. The changes will take effect for the
    * next time the source is dispatched after this call returns.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setCallbackIndirect(
      callback_data: Option[Ptr[Byte] /* Some(gpointer) */ ],
      callback_funcs: sn.gnome.glib.SourceCallbackFuncs /* Some(Ptr[GSourceCallbackFuncs]) */
  ): Unit /* None */ =
    g_source_set_callback_indirect(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GSource]],
      callback_data
        .map[gpointer](o => gpointer(o))
        .getOrElse(null.asInstanceOf[gpointer]),
      callback_funcs.getUnsafeRawPointer().asInstanceOf
    )
  end setCallbackIndirect

  /** Sets whether a source can be called recursively. If @can_recurse is %TRUE,
    * then while the source is being dispatched then this source will be
    * processed normally. Otherwise, all processing of this source is blocked
    * until the dispatch function returns.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setCanRecurse(
      can_recurse: Boolean /* Some(gboolean) */
  ): Unit /* None */ =
    g_source_set_can_recurse(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GSource]],
      gboolean(gint((if can_recurse == true then 1 else 0)))
    )
  end setCanRecurse

  /** Set @dispose as dispose function on @source. @dispose will be called once
    * the reference count of @source reaches 0 but before any of the state of
    * the source is freed, especially before the finalize function is called.
    *
    * This means that at this point @source is still a valid #GSource and it is
    * allow for the reference count to increase again until @dispose returns.
    *
    * The dispose function can be used to clear any "weak" references to the
    * @source
    *   in other data structures in a thread-safe way where it is possible for
    *   another thread to increase the reference count of @source again while it
    *   is being freed.
    *
    * The finalize function can not be used for this purpose as at that point
    * @source
    *   is already partially freed and not valid anymore.
    *
    * This should only ever be called from #GSource implementations.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_dispose_function/<method parameters>/dispose]: Cannot render type Type(List(),ListMap(@name -> DataRecord(SourceDisposeFunc), @type -> DataRecord(GSourceDisposeFunc)))"
  )
  private def setDisposeFunction__ = ???

  /** Sets the source functions (can be used to override default
    * implementations) of an unattached source.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setFuncs(
      funcs: sn.gnome.glib.SourceFuncs /* Some(Ptr[GSourceFuncs]) */
  ): Unit /* None */ =
    g_source_set_funcs(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GSource]],
      funcs.getUnsafeRawPointer().asInstanceOf
    )
  end setFuncs

  /** Sets a name for the source, used in debugging and profiling. The name
    * defaults to #NULL.
    *
    * The source name should describe in a human-readable way what the source
    * does. For example, "X11 event queue" or "GTK repaint idle handler" or
    * whatever it is.
    *
    * It is permitted to call this function multiple times, but is not
    * recommended due to the potential performance impact. For example, one
    * could change the name in the "check" function of a #GSourceFuncs to
    * include details like the event type in the source name.
    *
    * Use caution if changing the name while another thread may be accessing it
    * with g_source_get_name(); that function does not copy the value, and
    * changing the value will free it while the other thread may be attempting
    * to use it.
    *
    * Also see g_source_set_static_name().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setName(
      name: scala.Predef.String /* Some(CString) */
  )(using Zone): Unit /* None */ =
    g_source_set_name(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GSource]],
      toCString(name)
    )
  end setName

  /** Sets the priority of a source. While the main loop is being run, a source
    * will be dispatched if it is ready to be dispatched and no sources at a
    * higher (numerically smaller) priority are ready to be dispatched.
    *
    * A child source always has the same priority as its parent. It is not
    * permitted to change the priority of a source once it has been added as a
    * child of another source.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setPriority(priority: Int /* Some(gint) */ ): Unit /* None */ =
    g_source_set_priority(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GSource]],
      gint(priority)
    )
  end setPriority

  /** Sets a #GSource to be dispatched when the given monotonic time is reached
    * (or passed). If the monotonic time is in the past (as it always will be if @ready_time
    * is 0) then the source will be dispatched immediately.
    *
    * If @ready_time is -1 then the source is never woken up on the basis of the
    * passage of time.
    *
    * Dispatching the source does not reset the ready time. You should do so
    * yourself, from the source dispatch function.
    *
    * Note that if you have a pair of sources where the ready time of one
    * suggests that it will be delivered first but the priority for the other
    * suggests that it would be delivered first, and the ready time for both
    * sources is reached during the same main context iteration, then the order
    * of dispatch is undefined.
    *
    * It is a no-op to call this function on a #GSource which has already been
    * destroyed with g_source_destroy().
    *
    * This API is only intended to be used by implementations of #GSource. Do
    * not call this API on a #GSource that you did not create.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setReadyTime(ready_time: CLongInt /* Some(gint64) */ ): Unit /* None */ =
    g_source_set_ready_time(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GSource]],
      gint64(ready_time)
    )
  end setReadyTime

  /** A variant of g_source_set_name() that does not duplicate the @name, and
    * can only be used with string literals.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setStaticName(
      name: scala.Predef.String /* Some(CString) */
  )(using Zone): Unit /* None */ =
    g_source_set_static_name(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GSource]],
      toCString(name)
    )
  end setStaticName

  /** Decreases the reference count of a source by one. If the resulting
    * reference count is zero the source and associated memory will be
    * destroyed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unref(): Unit /* None */ =
    g_source_unref(this.getUnsafeRawPointer().asInstanceOf[Ptr[GSource]])
  end unref

end Source

object Source:
  def fromRaw(ptr: Ptr[GSource]): Source = new Source(ptr)
end Source
