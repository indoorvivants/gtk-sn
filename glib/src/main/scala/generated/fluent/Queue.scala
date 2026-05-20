package sn.gnome.glib

import _root_.sn.gnome.glib.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.{List, Queue}
import sn.gnome.glib.internal.{
  GQueue,
  gboolean,
  gconstpointer,
  gint,
  gpointer,
  guint
}

/** Contains the public fields of a [Queue][glib-Double-ended-Queues].
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class Queue private[gnome] (raw: Ptr[GQueue]):

  def getUnsafeRawPointer(): Ptr[GQueue] = this.raw

  /** a pointer to the first element of the queue
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def head: sn.gnome.glib.List /* None */ = (!raw).head.asInstanceOf[Ptr[GList]]

  /** a pointer to the first element of the queue
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def head_=(value: sn.gnome.glib.List /* None */ ): Unit = (!raw).head_=(
    value.getUnsafeRawPointer().asInstanceOf.asInstanceOf[Ptr[GList]]
  )

  /** a pointer to the last element of the queue
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def tail: sn.gnome.glib.List /* None */ = (!raw).tail.asInstanceOf[Ptr[GList]]

  /** a pointer to the last element of the queue
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def tail_=(value: sn.gnome.glib.List /* None */ ): Unit = (!raw).tail_=(
    value.getUnsafeRawPointer().asInstanceOf.asInstanceOf[Ptr[GList]]
  )

  /** the number of elements in the queue
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def length: UInt /* None */ = (!raw).length.asInstanceOf[guint]

  /** the number of elements in the queue
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def length_=(value: UInt /* None */ ): Unit =
    (!raw).length_=(guint(value).asInstanceOf[guint])

  /** Removes all the elements in @queue. If queue elements contain
    * dynamically-allocated memory, they should be freed first.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def clear(): Unit /* None */ =
    g_queue_clear(this.getUnsafeRawPointer().asInstanceOf[Ptr[GQueue]])
  end clear

  /** Convenience method, which frees all the memory used by a #GQueue, and
    * calls the provided @free_func on each item in the #GQueue.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method clear_full/<method parameters>/free_func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(DestroyNotify), @type -> DataRecord(GDestroyNotify)))"
  )
  private def clearFull__ = ???

  /** Copies a @queue. Note that is a shallow copy. If the elements in the queue
    * consist of pointers to data, the pointers are copied, but the actual data
    * is not.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def copy(): sn.gnome.glib.Queue /* None */ =
    sn.gnome.glib.Queue.fromRaw(
      g_queue_copy(this.getUnsafeRawPointer().asInstanceOf[Ptr[GQueue]])
    )
  end copy

  /** Removes @link_ from @queue and frees it.
    *
    * @link_
    *   must be part of @queue.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def deleteLink(
      `link_`: sn.gnome.glib.List /* Some(Ptr[GList]) */
  ): Unit /* None */ =
    g_queue_delete_link(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GQueue]],
      `link_`.getUnsafeRawPointer().asInstanceOf
    )
  end deleteLink

  /** Finds the first link in @queue which contains @data.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def find(
      data: Option[Ptr[Byte] /* Some(gconstpointer) */ ]
  ): sn.gnome.glib.List /* None */ =
    sn.gnome.glib.List.fromRaw(
      g_queue_find(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GQueue]],
        data
          .map[gconstpointer](o => gconstpointer(o))
          .getOrElse(null.asInstanceOf[gconstpointer])
      )
    )
  end find

  /** Finds an element in a #GQueue, using a supplied function to find the
    * desired element. It iterates over the queue, calling the given function
    * which should return 0 when the desired element is found. The function
    * takes two gconstpointer arguments, the #GQueue element's data as the first
    * argument and the given user data as the second argument.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method find_custom/<method parameters>/func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(CompareFunc), @type -> DataRecord(GCompareFunc)))"
  )
  private def findCustom__ = ???

  /** Calls @func for each element in the queue passing @user_data to the
    * function.
    *
    * It is safe for @func to remove the element from @queue, but it must not
    * modify any part of the queue after that element.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method foreach/<method parameters>/func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Func), @type -> DataRecord(GFunc)))"
  )
  private def foreach__ = ???

  /** Frees the memory allocated for the #GQueue. Only call this function if @queue
    * was created with g_queue_new(). If queue elements contain
    * dynamically-allocated memory, they should be freed first.
    *
    * If queue elements contain dynamically-allocated memory, you should either
    * use g_queue_free_full() or free them manually first.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def free(): Unit /* None */ =
    g_queue_free(this.getUnsafeRawPointer().asInstanceOf[Ptr[GQueue]])
  end free

  /** Convenience method, which frees all the memory used by a #GQueue, and
    * calls the specified destroy function on every element's data.
    *
    * @free_func
    *   should not modify the queue (eg, by removing the freed element from it).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method free_full/<method parameters>/free_func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(DestroyNotify), @type -> DataRecord(GDestroyNotify)))"
  )
  private def freeFull__ = ???

  /** Returns the number of items in @queue.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getLength(): UInt /* None */ =
    g_queue_get_length(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GQueue]]
    ).value
  end getLength

  /** Returns the position of the first element in @queue which contains @data.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def index(
      data: Option[Ptr[Byte] /* Some(gconstpointer) */ ]
  ): Int /* None */ =
    g_queue_index(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GQueue]],
      data
        .map[gconstpointer](o => gconstpointer(o))
        .getOrElse(null.asInstanceOf[gconstpointer])
    ).value
  end index

  /** A statically-allocated #GQueue must be initialized with this function
    * before it can be used. Alternatively you can initialize it with
    * %G_QUEUE_INIT. It is not necessary to initialize queues created with
    * g_queue_new().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def init(): Unit /* None */ =
    g_queue_init(this.getUnsafeRawPointer().asInstanceOf[Ptr[GQueue]])
  end init

  /** Inserts @data into @queue after @sibling.
    *
    * @sibling
    *   must be part of @queue. Since GLib 2.44 a %NULL sibling pushes the data
    *   at the head of the queue.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def insertAfter(
      sibling: Option[sn.gnome.glib.List /* Some(Ptr[GList]) */ ],
      data: Option[Ptr[Byte] /* Some(gpointer) */ ]
  ): Unit /* None */ =
    g_queue_insert_after(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GQueue]],
      sibling
        .map[Ptr[GList]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GList]]),
      data
        .map[gpointer](o => gpointer(o))
        .getOrElse(null.asInstanceOf[gpointer])
    )
  end insertAfter

  /** Inserts @link_ into @queue after @sibling.
    *
    * @sibling
    *   must be part of @queue.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def insertAfterLink(
      sibling: Option[sn.gnome.glib.List /* Some(Ptr[GList]) */ ],
      `link_`: sn.gnome.glib.List /* Some(Ptr[GList]) */
  ): Unit /* None */ =
    g_queue_insert_after_link(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GQueue]],
      sibling
        .map[Ptr[GList]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GList]]),
      `link_`.getUnsafeRawPointer().asInstanceOf
    )
  end insertAfterLink

  /** Inserts @data into @queue before @sibling.
    *
    * @sibling
    *   must be part of @queue. Since GLib 2.44 a %NULL sibling pushes the data
    *   at the tail of the queue.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def insertBefore(
      sibling: Option[sn.gnome.glib.List /* Some(Ptr[GList]) */ ],
      data: Option[Ptr[Byte] /* Some(gpointer) */ ]
  ): Unit /* None */ =
    g_queue_insert_before(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GQueue]],
      sibling
        .map[Ptr[GList]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GList]]),
      data
        .map[gpointer](o => gpointer(o))
        .getOrElse(null.asInstanceOf[gpointer])
    )
  end insertBefore

  /** Inserts @link_ into @queue before @sibling.
    *
    * @sibling
    *   must be part of @queue.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def insertBeforeLink(
      sibling: Option[sn.gnome.glib.List /* Some(Ptr[GList]) */ ],
      `link_`: sn.gnome.glib.List /* Some(Ptr[GList]) */
  ): Unit /* None */ =
    g_queue_insert_before_link(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GQueue]],
      sibling
        .map[Ptr[GList]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GList]]),
      `link_`.getUnsafeRawPointer().asInstanceOf
    )
  end insertBeforeLink

  /** Inserts @data into @queue using @func to determine the new position.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method insert_sorted/<method parameters>/func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(CompareDataFunc), @type -> DataRecord(GCompareDataFunc)))"
  )
  private def insertSorted__ = ???

  /** Returns %TRUE if the queue is empty.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isEmpty(): Boolean /* None */ =
    g_queue_is_empty(this.getUnsafeRawPointer().asInstanceOf[Ptr[GQueue]]).value
      .!=(0)
  end isEmpty

  /** Returns the position of @link_ in @queue.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def linkIndex(
      `link_`: sn.gnome.glib.List /* Some(Ptr[GList]) */
  ): Int /* None */ =
    g_queue_link_index(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GQueue]],
      `link_`.getUnsafeRawPointer().asInstanceOf
    ).value
  end linkIndex

  /** Returns the first element of the queue.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def peekHead(): Ptr[Byte] /* None */ =
    g_queue_peek_head(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GQueue]]
    ).value
  end peekHead

  /** Returns the first link in @queue.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def peekHeadLink(): sn.gnome.glib.List /* None */ =
    sn.gnome.glib.List.fromRaw(
      g_queue_peek_head_link(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GQueue]]
      )
    )
  end peekHeadLink

  /** Returns the @n'th element of @queue.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def peekNth(n: UInt /* Some(guint) */ ): Ptr[Byte] /* None */ =
    g_queue_peek_nth(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GQueue]],
      guint(n)
    ).value
  end peekNth

  /** Returns the link at the given position
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def peekNthLink(n: UInt /* Some(guint) */ ): sn.gnome.glib.List /* None */ =
    sn.gnome.glib.List.fromRaw(
      g_queue_peek_nth_link(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GQueue]],
        guint(n)
      )
    )
  end peekNthLink

  /** Returns the last element of the queue.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def peekTail(): Ptr[Byte] /* None */ =
    g_queue_peek_tail(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GQueue]]
    ).value
  end peekTail

  /** Returns the last link in @queue.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def peekTailLink(): sn.gnome.glib.List /* None */ =
    sn.gnome.glib.List.fromRaw(
      g_queue_peek_tail_link(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GQueue]]
      )
    )
  end peekTailLink

  /** Removes the first element of the queue and returns its data.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def popHead(): Ptr[Byte] /* None */ =
    g_queue_pop_head(this.getUnsafeRawPointer().asInstanceOf[Ptr[GQueue]]).value
  end popHead

  /** Removes and returns the first element of the queue.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def popHeadLink(): sn.gnome.glib.List /* None */ =
    sn.gnome.glib.List.fromRaw(
      g_queue_pop_head_link(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GQueue]]
      )
    )
  end popHeadLink

  /** Removes the @n'th element of @queue and returns its data.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def popNth(n: UInt /* Some(guint) */ ): Ptr[Byte] /* None */ =
    g_queue_pop_nth(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GQueue]],
      guint(n)
    ).value
  end popNth

  /** Removes and returns the link at the given position.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def popNthLink(n: UInt /* Some(guint) */ ): sn.gnome.glib.List /* None */ =
    sn.gnome.glib.List.fromRaw(
      g_queue_pop_nth_link(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GQueue]],
        guint(n)
      )
    )
  end popNthLink

  /** Removes the last element of the queue and returns its data.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def popTail(): Ptr[Byte] /* None */ =
    g_queue_pop_tail(this.getUnsafeRawPointer().asInstanceOf[Ptr[GQueue]]).value
  end popTail

  /** Removes and returns the last element of the queue.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def popTailLink(): sn.gnome.glib.List /* None */ =
    sn.gnome.glib.List.fromRaw(
      g_queue_pop_tail_link(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GQueue]]
      )
    )
  end popTailLink

  /** Adds a new element at the head of the queue.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def pushHead(data: Option[Ptr[Byte] /* Some(gpointer) */ ]): Unit /* None */ =
    g_queue_push_head(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GQueue]],
      data
        .map[gpointer](o => gpointer(o))
        .getOrElse(null.asInstanceOf[gpointer])
    )
  end pushHead

  /** Adds a new element at the head of the queue.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def pushHeadLink(
      `link_`: sn.gnome.glib.List /* Some(Ptr[GList]) */
  ): Unit /* None */ =
    g_queue_push_head_link(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GQueue]],
      `link_`.getUnsafeRawPointer().asInstanceOf
    )
  end pushHeadLink

  /** Inserts a new element into @queue at the given position.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def pushNth(
      data: Option[Ptr[Byte] /* Some(gpointer) */ ],
      n: Int /* Some(gint) */
  ): Unit /* None */ =
    g_queue_push_nth(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GQueue]],
      data
        .map[gpointer](o => gpointer(o))
        .getOrElse(null.asInstanceOf[gpointer]),
      gint(n)
    )
  end pushNth

  /** Inserts @link into @queue at the given position.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def pushNthLink(
      n: Int /* Some(gint) */,
      `link_`: sn.gnome.glib.List /* Some(Ptr[GList]) */
  ): Unit /* None */ =
    g_queue_push_nth_link(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GQueue]],
      gint(n),
      `link_`.getUnsafeRawPointer().asInstanceOf
    )
  end pushNthLink

  /** Adds a new element at the tail of the queue.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def pushTail(data: Option[Ptr[Byte] /* Some(gpointer) */ ]): Unit /* None */ =
    g_queue_push_tail(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GQueue]],
      data
        .map[gpointer](o => gpointer(o))
        .getOrElse(null.asInstanceOf[gpointer])
    )
  end pushTail

  /** Adds a new element at the tail of the queue.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def pushTailLink(
      `link_`: sn.gnome.glib.List /* Some(Ptr[GList]) */
  ): Unit /* None */ =
    g_queue_push_tail_link(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GQueue]],
      `link_`.getUnsafeRawPointer().asInstanceOf
    )
  end pushTailLink

  /** Removes the first element in @queue that contains @data.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def remove(
      data: Option[Ptr[Byte] /* Some(gconstpointer) */ ]
  ): Boolean /* None */ =
    g_queue_remove(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GQueue]],
      data
        .map[gconstpointer](o => gconstpointer(o))
        .getOrElse(null.asInstanceOf[gconstpointer])
    ).value.!=(0)
  end remove

  /** Remove all elements whose data equals @data from @queue.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def removeAll(
      data: Option[Ptr[Byte] /* Some(gconstpointer) */ ]
  ): UInt /* None */ =
    g_queue_remove_all(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GQueue]],
      data
        .map[gconstpointer](o => gconstpointer(o))
        .getOrElse(null.asInstanceOf[gconstpointer])
    ).value
  end removeAll

  /** Reverses the order of the items in @queue.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def reverse(): Unit /* None */ =
    g_queue_reverse(this.getUnsafeRawPointer().asInstanceOf[Ptr[GQueue]])
  end reverse

  /** Sorts @queue using @compare_func.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method sort/<method parameters>/compare_func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(CompareDataFunc), @type -> DataRecord(GCompareDataFunc)))"
  )
  private def sort__ = ???

  /** Unlinks @link_ so that it will no longer be part of @queue. The link is
    * not freed.
    *
    * @link_
    *   must be part of @queue.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unlink(
      `link_`: sn.gnome.glib.List /* Some(Ptr[GList]) */
  ): Unit /* None */ =
    g_queue_unlink(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GQueue]],
      `link_`.getUnsafeRawPointer().asInstanceOf
    )
  end unlink

end Queue

object Queue:
  def fromRaw(ptr: Ptr[GQueue]): Queue = new Queue(ptr)
end Queue
