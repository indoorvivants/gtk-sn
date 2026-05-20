package sn.gnome.glib

import _root_.sn.gnome.glib.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.GResult
import sn.gnome.glib.internal.{GThreadPool, gboolean, gint, gpointer, guint}

/** The #GThreadPool struct represents a thread pool. It has three public
  * read-only members, but the underlying struct is bigger, so you must not copy
  * this struct.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ThreadPool private[gnome] (raw: Ptr[GThreadPool]):

  def getUnsafeRawPointer(): Ptr[GThreadPool] = this.raw

  /** the function to execute in the threads of this pool
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[field func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Func), @type -> DataRecord(GFunc)))"
  )
  private def func__ = ???

  /** the user data for the threads of this pool
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def userData: Ptr[Byte] /* None */ = (!raw).user_data.asInstanceOf[gpointer]

  /** the user data for the threads of this pool
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def userData_=(value: Ptr[Byte] /* None */ ): Unit =
    (!raw).user_data_=(gpointer(value).asInstanceOf[gpointer])

  /** are all threads exclusive to this pool
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def exclusive: Boolean /* None */ = (!raw).exclusive.asInstanceOf[gboolean]

  /** are all threads exclusive to this pool
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def exclusive_=(value: Boolean /* None */ ): Unit = (!raw).exclusive_=(
    gboolean(gint((if value == true then 1 else 0))).asInstanceOf[gboolean]
  )

  /** Frees all resources allocated for @pool.
    *
    * If @immediate is %TRUE, no new task is processed for @pool. Otherwise @pool
    * is not freed before the last task is processed. Note however, that no
    * thread of this pool is interrupted while processing a task. Instead at
    * least all still running threads can finish their tasks before the @pool is
    * freed.
    *
    * If @wait_ is %TRUE, this function does not return before all tasks to be
    * processed (dependent on @immediate, whether all or only the currently
    * running) are ready. Otherwise this function returns immediately.
    *
    * After calling this function @pool must not be used anymore.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def free(
      immediate: Boolean /* Some(gboolean) */,
      `wait_`: Boolean /* Some(gboolean) */
  ): Unit /* None */ =
    g_thread_pool_free(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GThreadPool]],
      gboolean(gint((if immediate == true then 1 else 0))),
      gboolean(gint((if `wait_` == true then 1 else 0)))
    )
  end free

  /** Returns the maximal number of threads for @pool.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getMaxThreads(): Int /* None */ =
    g_thread_pool_get_max_threads(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GThreadPool]]
    ).value
  end getMaxThreads

  /** Returns the number of threads currently running in @pool.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getNumThreads(): UInt /* None */ =
    g_thread_pool_get_num_threads(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GThreadPool]]
    ).value
  end getNumThreads

  /** Moves the item to the front of the queue of unprocessed items, so that it
    * will be processed next.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def moveToFront(
      data: Option[Ptr[Byte] /* Some(gpointer) */ ]
  ): Boolean /* None */ =
    g_thread_pool_move_to_front(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GThreadPool]],
      data
        .map[gpointer](o => gpointer(o))
        .getOrElse(null.asInstanceOf[gpointer])
    ).value.!=(0)
  end moveToFront

  /** Inserts @data into the list of tasks to be executed by @pool.
    *
    * When the number of currently running threads is lower than the maximal
    * allowed number of threads, a new thread is started (or reused) with the
    * properties given to g_thread_pool_new(). Otherwise, @data stays in the
    * queue until a thread in this pool finishes its previous task and processes @data.
    *
    * @error
    *   can be %NULL to ignore errors, or non-%NULL to report errors. An error
    *   can only occur when a new thread couldn't be created. In that case @data
    *   is simply appended to the queue of work to do.
    *
    * Before version 2.32, this function did not return a success status.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def push(
      data: Option[Ptr[Byte] /* Some(gpointer) */ ]
  ): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_thread_pool_push(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GThreadPool]],
        data
          .map[gpointer](o => gpointer(o))
          .getOrElse(null.asInstanceOf[gpointer]),
        __errorPtr
      ).value.!=(0)
    )
  end push

  /** Sets the maximal allowed number of threads for @pool. A value of -1 means
    * that the maximal number of threads is unlimited. If @pool is an exclusive
    * thread pool, setting the maximal number of threads to -1 is not allowed.
    *
    * Setting @max_threads to 0 means stopping all work for @pool. It is
    * effectively frozen until @max_threads is set to a non-zero value again.
    *
    * A thread is never terminated while calling @func, as supplied by
    * g_thread_pool_new(). Instead the maximal number of threads only has effect
    * for the allocation of new threads in g_thread_pool_push(). A new thread is
    * allocated, whenever the number of currently running threads in @pool is
    * smaller than the maximal number.
    *
    * @error
    *   can be %NULL to ignore errors, or non-%NULL to report errors. An error
    *   can only occur when a new thread couldn't be created.
    *
    * Before version 2.32, this function did not return a success status.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setMaxThreads(
      max_threads: Int /* Some(gint) */
  ): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_thread_pool_set_max_threads(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GThreadPool]],
        gint(max_threads),
        __errorPtr
      ).value.!=(0)
    )
  end setMaxThreads

  /** Sets the function used to sort the list of tasks. This allows the tasks to
    * be processed by a priority determined by @func, and not just in the order
    * in which they were added to the pool.
    *
    * Note, if the maximum number of threads is more than 1, the order that
    * threads are executed cannot be guaranteed 100%. Threads are scheduled by
    * the operating system and are executed at random. It cannot be assumed that
    * threads are executed in the order they are created.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_sort_function/<method parameters>/func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(CompareDataFunc), @type -> DataRecord(GCompareDataFunc)))"
  )
  private def setSortFunction__ = ???

  /** Returns the number of tasks still unprocessed in @pool.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unprocessed(): UInt /* None */ =
    g_thread_pool_unprocessed(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GThreadPool]]
    ).value
  end unprocessed

end ThreadPool

object ThreadPool:
  def fromRaw(ptr: Ptr[GThreadPool]): ThreadPool = new ThreadPool(ptr)
end ThreadPool
