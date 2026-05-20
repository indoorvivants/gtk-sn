package sn.gnome.glib

import _root_.sn.gnome.glib.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.{AsyncQueue, TimeVal}
import sn.gnome.glib.internal.{GAsyncQueue, gboolean, gint, gpointer, guint64}

/** An opaque data structure which represents an asynchronous queue.
  *
  * It should only be accessed through the `g_async_queue_*` functions.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class AsyncQueue private[gnome] (raw: Ptr[GAsyncQueue]):

  def getUnsafeRawPointer(): Ptr[GAsyncQueue] = this.raw

  /** Returns the length of the queue.
    *
    * Actually this function returns the number of data items in the queue minus
    * the number of waiting threads, so a negative value means waiting threads,
    * and a positive value means available entries in the @queue. A return value
    * of 0 could mean n entries in the queue and n threads waiting. This can
    * happen due to locking of the queue or due to scheduling.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def length(): Int /* None */ =
    g_async_queue_length(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GAsyncQueue]]
    ).value
  end length

  /** Returns the length of the queue.
    *
    * Actually this function returns the number of data items in the queue minus
    * the number of waiting threads, so a negative value means waiting threads,
    * and a positive value means available entries in the @queue. A return value
    * of 0 could mean n entries in the queue and n threads waiting. This can
    * happen due to locking of the queue or due to scheduling.
    *
    * This function must be called while holding the @queue's lock.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def lengthUnlocked(): Int /* None */ =
    g_async_queue_length_unlocked(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GAsyncQueue]]
    ).value
  end lengthUnlocked

  /** Acquires the @queue's lock. If another thread is already holding the lock,
    * this call will block until the lock becomes available.
    *
    * Call g_async_queue_unlock() to drop the lock again.
    *
    * While holding the lock, you can only call the g_async_queue_*_unlocked()
    * functions on @queue. Otherwise, deadlock may occur.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def lock(): Unit /* None */ =
    g_async_queue_lock(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GAsyncQueue]]
    )
  end lock

  /** Pops data from the @queue. If @queue is empty, this function blocks until
    * data becomes available.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def pop(): Ptr[Byte] /* None */ =
    g_async_queue_pop(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GAsyncQueue]]
    ).value
  end pop

  /** Pops data from the @queue. If @queue is empty, this function blocks until
    * data becomes available.
    *
    * This function must be called while holding the @queue's lock.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def popUnlocked(): Ptr[Byte] /* None */ =
    g_async_queue_pop_unlocked(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GAsyncQueue]]
    ).value
  end popUnlocked

  /** Pushes the @data into the @queue.
    *
    * The @data parameter must not be %NULL.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def push(data: Ptr[Byte] /* Some(gpointer) */ ): Unit /* None */ =
    g_async_queue_push(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GAsyncQueue]],
      gpointer(data)
    )
  end push

  /** Pushes the @item into the @queue. @item must not be %NULL. In contrast to
    * g_async_queue_push(), this function pushes the new item ahead of the items
    * already in the queue, so that it will be the next one to be popped off the
    * queue.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def pushFront(item: Ptr[Byte] /* Some(gpointer) */ ): Unit /* None */ =
    g_async_queue_push_front(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GAsyncQueue]],
      gpointer(item)
    )
  end pushFront

  /** Pushes the @item into the @queue. @item must not be %NULL. In contrast to
    * g_async_queue_push_unlocked(), this function pushes the new item ahead of
    * the items already in the queue, so that it will be the next one to be
    * popped off the queue.
    *
    * This function must be called while holding the @queue's lock.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def pushFrontUnlocked(
      item: Ptr[Byte] /* Some(gpointer) */
  ): Unit /* None */ =
    g_async_queue_push_front_unlocked(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GAsyncQueue]],
      gpointer(item)
    )
  end pushFrontUnlocked

  /** Inserts @data into @queue using @func to determine the new position.
    *
    * This function requires that the @queue is sorted before pushing on new
    * elements, see g_async_queue_sort().
    *
    * This function will lock @queue before it sorts the queue and unlock it
    * when it is finished.
    *
    * For an example of @func see g_async_queue_sort().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method push_sorted/<method parameters>/func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(CompareDataFunc), @type -> DataRecord(GCompareDataFunc)))"
  )
  private def pushSorted__ = ???

  /** Inserts @data into @queue using @func to determine the new position.
    *
    * The sort function @func is passed two elements of the @queue. It should
    * return 0 if they are equal, a negative value if the first element should
    * be higher in the @queue or a positive value if the first element should be
    * lower in the @queue than the second element.
    *
    * This function requires that the @queue is sorted before pushing on new
    * elements, see g_async_queue_sort().
    *
    * This function must be called while holding the @queue's lock.
    *
    * For an example of @func see g_async_queue_sort().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method push_sorted_unlocked/<method parameters>/func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(CompareDataFunc), @type -> DataRecord(GCompareDataFunc)))"
  )
  private def pushSortedUnlocked__ = ???

  /** Pushes the @data into the @queue.
    *
    * The @data parameter must not be %NULL.
    *
    * This function must be called while holding the @queue's lock.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def pushUnlocked(data: Ptr[Byte] /* Some(gpointer) */ ): Unit /* None */ =
    g_async_queue_push_unlocked(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GAsyncQueue]],
      gpointer(data)
    )
  end pushUnlocked

  /** Increases the reference count of the asynchronous @queue by 1. You do not
    * need to hold the lock to call this function.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def ref(): sn.gnome.glib.AsyncQueue /* None */ =
    sn.gnome.glib.AsyncQueue.fromRaw(
      g_async_queue_ref(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GAsyncQueue]]
      )
    )
  end ref

  /** Increases the reference count of the asynchronous @queue by 1.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def refUnlocked(): Unit /* None */ =
    g_async_queue_ref_unlocked(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GAsyncQueue]]
    )
  end refUnlocked

  /** Remove an item from the queue.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def remove(item: Ptr[Byte] /* Some(gpointer) */ ): Boolean /* None */ =
    g_async_queue_remove(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GAsyncQueue]],
      gpointer(item)
    ).value.!=(0)
  end remove

  /** Remove an item from the queue.
    *
    * This function must be called while holding the @queue's lock.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def removeUnlocked(
      item: Option[Ptr[Byte] /* Some(gpointer) */ ]
  ): Boolean /* None */ =
    g_async_queue_remove_unlocked(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GAsyncQueue]],
      item
        .map[gpointer](o => gpointer(o))
        .getOrElse(null.asInstanceOf[gpointer])
    ).value.!=(0)
  end removeUnlocked

  /**  Sorts @queue using @func.
    *
    *  The sort function @func is passed two elements of the @queue.
    *  It should return 0 if they are equal, a negative value if the
    *  first element should be higher in the @queue or a positive value
    *  if the first element should be lower in the @queue than the second
    *  element.
    *
    *  This function will lock @queue before it sorts the queue and unlock
    *  it when it is finished.
    *
    *  If you were sorting a list of priority numbers to make sure the
    *  lowest priority would be at the top of the queue, you could use:
    *  |[<!-- language="C" -->
    *   gint32 id1;
    *   gint32 id2;
    *
    *   id1 = GPOINTER_TO_INT (element1);
    *   id2 = GPOINTER_TO_INT (element2);
    *
    *   return (id1 > id2 ? +1 : id1 == id2 ? 0 : -1);
    *  ]|
    *
    *  NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method sort/<method parameters>/func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(CompareDataFunc), @type -> DataRecord(GCompareDataFunc)))"
  )
  private def sort__ = ???

  /** Sorts @queue using @func.
    *
    * The sort function @func is passed two elements of the @queue. It should
    * return 0 if they are equal, a negative value if the first element should
    * be higher in the @queue or a positive value if the first element should be
    * lower in the @queue than the second element.
    *
    * This function must be called while holding the @queue's lock.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method sort_unlocked/<method parameters>/func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(CompareDataFunc), @type -> DataRecord(GCompareDataFunc)))"
  )
  private def sortUnlocked__ = ???

  /** Pops data from the @queue. If the queue is empty, blocks until
    * @end_time
    *   or until data becomes available.
    *
    * If no data is received before @end_time, %NULL is returned.
    *
    * To easily calculate @end_time, a combination of g_get_real_time() and
    * g_time_val_add() can be used.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def timedPop(
      end_time: sn.gnome.glib.TimeVal /* Some(Ptr[GTimeVal]) */
  ): Ptr[Byte] /* None */ =
    g_async_queue_timed_pop(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GAsyncQueue]],
      end_time.getUnsafeRawPointer().asInstanceOf
    ).value
  end timedPop

  /** Pops data from the @queue. If the queue is empty, blocks until
    * @end_time
    *   or until data becomes available.
    *
    * If no data is received before @end_time, %NULL is returned.
    *
    * To easily calculate @end_time, a combination of g_get_real_time() and
    * g_time_val_add() can be used.
    *
    * This function must be called while holding the @queue's lock.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def timedPopUnlocked(
      end_time: sn.gnome.glib.TimeVal /* Some(Ptr[GTimeVal]) */
  ): Ptr[Byte] /* None */ =
    g_async_queue_timed_pop_unlocked(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GAsyncQueue]],
      end_time.getUnsafeRawPointer().asInstanceOf
    ).value
  end timedPopUnlocked

  /** Pops data from the @queue. If the queue is empty, blocks for
    * @timeout
    *   microseconds, or until data becomes available.
    *
    * If no data is received before the timeout, %NULL is returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def timeoutPop(
      timeout: CUnsignedLongInt /* Some(guint64) */
  ): Ptr[Byte] /* None */ =
    g_async_queue_timeout_pop(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GAsyncQueue]],
      guint64(timeout)
    ).value
  end timeoutPop

  /** Pops data from the @queue. If the queue is empty, blocks for
    * @timeout
    *   microseconds, or until data becomes available.
    *
    * If no data is received before the timeout, %NULL is returned.
    *
    * This function must be called while holding the @queue's lock.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def timeoutPopUnlocked(
      timeout: CUnsignedLongInt /* Some(guint64) */
  ): Ptr[Byte] /* None */ =
    g_async_queue_timeout_pop_unlocked(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GAsyncQueue]],
      guint64(timeout)
    ).value
  end timeoutPopUnlocked

  /** Tries to pop data from the @queue. If no data is available, %NULL is
    * returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def tryPop(): Ptr[Byte] /* None */ =
    g_async_queue_try_pop(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GAsyncQueue]]
    ).value
  end tryPop

  /** Tries to pop data from the @queue. If no data is available, %NULL is
    * returned.
    *
    * This function must be called while holding the @queue's lock.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def tryPopUnlocked(): Ptr[Byte] /* None */ =
    g_async_queue_try_pop_unlocked(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GAsyncQueue]]
    ).value
  end tryPopUnlocked

  /** Releases the queue's lock.
    *
    * Calling this function when you have not acquired the with
    * g_async_queue_lock() leads to undefined behaviour.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unlock(): Unit /* None */ =
    g_async_queue_unlock(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GAsyncQueue]]
    )
  end unlock

  /** Decreases the reference count of the asynchronous @queue by 1.
    *
    * If the reference count went to 0, the @queue will be destroyed and the
    * memory allocated will be freed. So you are not allowed to use the @queue
    * afterwards, as it might have disappeared. You do not need to hold the lock
    * to call this function.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unref(): Unit /* None */ =
    g_async_queue_unref(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GAsyncQueue]]
    )
  end unref

  /** Decreases the reference count of the asynchronous @queue by 1 and releases
    * the lock. This function must be called while holding the @queue's lock. If
    * the reference count went to 0, the @queue will be destroyed and the memory
    * allocated will be freed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unrefAndUnlock(): Unit /* None */ =
    g_async_queue_unref_and_unlock(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GAsyncQueue]]
    )
  end unrefAndUnlock

end AsyncQueue

object AsyncQueue:
  def fromRaw(ptr: Ptr[GAsyncQueue]): AsyncQueue = new AsyncQueue(ptr)
end AsyncQueue
