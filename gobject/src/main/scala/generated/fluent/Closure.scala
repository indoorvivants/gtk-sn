package sn.gnome.gobject

import _root_.sn.gnome.gobject.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.guint
import sn.gnome.gobject.Closure
import sn.gnome.gobject.internal.GClosure

/** A #GClosure represents a callback supplied by the programmer.
  *
  * It will generally comprise a function of some kind and a marshaller used to
  * call it. It is the responsibility of the marshaller to convert the arguments
  * for the invocation from #GValues into a suitable form, perform the callback
  * on the converted arguments, and transform the return value back into a
  * #GValue.
  *
  * In the case of C programs, a closure usually just holds a pointer to a
  * function and maybe a data argument, and the marshaller converts between
  * #GValue and native C types. The GObject library provides the #GCClosure type
  * for this purpose. Bindings for other languages need marshallers which
  * convert between #GValues and suitable representations in the runtime of the
  * language in order to use functions written in that language as callbacks.
  * Use g_closure_set_marshal() to set the marshaller on such a custom closure
  * implementation.
  *
  * Within GObject, closures play an important role in the implementation of
  * signals. When a signal is registered, the
  * @c_marshaller
  *   argument to g_signal_new() specifies the default C marshaller for any
  *   closure which is connected to this signal. GObject provides a number of C
  *   marshallers for this purpose, see the g_cclosure_marshal_*() functions.
  *   Additional C marshallers can be generated with the
  *   [glib-genmarshal][glib-genmarshal] utility. Closures can be explicitly
  *   connected to signals with g_signal_connect_closure(), but it usually more
  *   convenient to let GObject create a closure automatically by using one of
  *   the g_signal_connect_*() functions which take a callback function/user
  *   data pair.
  *
  * Using closures has a number of important advantages over a simple callback
  * function/data pointer combination:
  *
  *   - Closures allow the callee to get the types of the callback parameters,
  *     which means that language bindings don't have to write individual glue
  *     for each callback type.
  *   - The reference counting of #GClosure makes it easy to handle reentrancy
  *     right; if a callback is removed while it is being invoked, the closure
  *     and its parameters won't be freed until the invocation finishes.
  *   - g_closure_invalidate() and invalidation notifiers allow callbacks to be
  *     automatically removed when the objects they point to go away.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class Closure private[gnome] (raw: Ptr[GClosure]):

  def getUnsafeRawPointer(): Ptr[GClosure] = this.raw

  /** Indicates whether the closure is currently being invoked with
    * g_closure_invoke()
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def inMarshal: UInt /* None */ =
    (!raw).in_marshal.asInstanceOf[_root_.sn.gnome.glib.internal.guint]

  /** Indicates whether the closure is currently being invoked with
    * g_closure_invoke()
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def inMarshal_=(value: UInt /* None */ ): Unit = (!raw).in_marshal_=(
    guint(value).asInstanceOf[_root_.sn.gnome.glib.internal.guint]
  )

  /** Indicates whether the closure has been invalidated by
    * g_closure_invalidate()
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isInvalid: UInt /* None */ =
    (!raw).is_invalid.asInstanceOf[_root_.sn.gnome.glib.internal.guint]

  /** Indicates whether the closure has been invalidated by
    * g_closure_invalidate()
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isInvalid_=(value: UInt /* None */ ): Unit = (!raw).is_invalid_=(
    guint(value).asInstanceOf[_root_.sn.gnome.glib.internal.guint]
  )
  @annotation.compileTimeOnly("[field marshal]: Field is missing <type>")
  private def marshal__ = ???

  /** Registers a finalization notifier which will be called when the reference
    * count of @closure goes down to 0.
    *
    * Multiple finalization notifiers on a single closure are invoked in
    * unspecified order. If a single call to g_closure_unref() results in the
    * closure being both invalidated and finalized, then the invalidate
    * notifiers will be run before the finalize notifiers.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method add_finalize_notifier/<method parameters>/notify_func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(ClosureNotify), @type -> DataRecord(GClosureNotify)))"
  )
  private def addFinalizeNotifier__ = ???

  /** Registers an invalidation notifier which will be called when the
    * @closure
    *   is invalidated with g_closure_invalidate().
    *
    * Invalidation notifiers are invoked before finalization notifiers, in an
    * unspecified order.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method add_invalidate_notifier/<method parameters>/notify_func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(ClosureNotify), @type -> DataRecord(GClosureNotify)))"
  )
  private def addInvalidateNotifier__ = ???

  /** Adds a pair of notifiers which get invoked before and after the closure
    * callback, respectively.
    *
    * This is typically used to protect the extra arguments for the duration of
    * the callback. See g_object_watch_closure() for an example of marshal
    * guards.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method add_marshal_guards/<method parameters>/pre_marshal_notify]: Cannot render type Type(List(),ListMap(@name -> DataRecord(ClosureNotify), @type -> DataRecord(GClosureNotify)))"
  )
  private def addMarshalGuards__ = ???

  /** Sets a flag on the closure to indicate that its calling environment has
    * become invalid, and thus causes any future invocations of
    * g_closure_invoke() on this @closure to be ignored.
    *
    * Also, invalidation notifiers installed on the closure will be called at
    * this point. Note that unless you are holding a reference to the closure
    * yourself, the invalidation notifiers may unref the closure and cause it to
    * be destroyed, so if you need to access the closure after calling
    * g_closure_invalidate(), make sure that you've previously called
    * g_closure_ref().
    *
    * Note that g_closure_invalidate() will also be called when the reference
    * count of a closure drops to zero (unless it has already been invalidated
    * before).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def invalidate(): Unit /* None */ =
    g_closure_invalidate(this.getUnsafeRawPointer().asInstanceOf[Ptr[GClosure]])
  end invalidate

  /** Invokes the closure, i.e. executes the callback represented by the @closure.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method invoke]: Method invoke contains an OUT parameter, which is not supported yet"
  )
  private def invoke__ = ???

  /** Increments the reference count on a closure to force it staying alive
    * while the caller holds a pointer to it.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def ref(): sn.gnome.gobject.Closure /* None */ =
    sn.gnome.gobject.Closure.fromRaw(
      g_closure_ref(this.getUnsafeRawPointer().asInstanceOf[Ptr[GClosure]])
    )
  end ref

  /** Removes a finalization notifier.
    *
    * Notice that notifiers are automatically removed after they are run.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method remove_finalize_notifier/<method parameters>/notify_func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(ClosureNotify), @type -> DataRecord(GClosureNotify)))"
  )
  private def removeFinalizeNotifier__ = ???

  /** Removes an invalidation notifier.
    *
    * Notice that notifiers are automatically removed after they are run.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method remove_invalidate_notifier/<method parameters>/notify_func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(ClosureNotify), @type -> DataRecord(GClosureNotify)))"
  )
  private def removeInvalidateNotifier__ = ???

  /** Sets the marshaller of @closure.
    *
    * The `marshal_data` of @marshal provides a way for a meta marshaller to
    * provide additional information to the marshaller.
    *
    * For GObject's C predefined marshallers (the `g_cclosure_marshal_*()`
    * functions), what it provides is a callback function to use instead of
    * @closure->callback.
    *
    * See also: g_closure_set_meta_marshal()
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_marshal/<method parameters>/marshal]: Cannot render type Type(List(),ListMap(@name -> DataRecord(ClosureMarshal), @type -> DataRecord(GClosureMarshal)))"
  )
  private def setMarshal__ = ???

  /** Sets the meta marshaller of @closure.
    *
    * A meta marshaller wraps the @closure's marshal and modifies the way it is
    * called in some fashion. The most common use of this facility is for C
    * callbacks.
    *
    * The same marshallers (generated by [glib-genmarshal][glib-genmarshal]),
    * are used everywhere, but the way that we get the callback function
    * differs. In most cases we want to use the @closure's callback, but in
    * other cases we want to use some different technique to retrieve the
    * callback function.
    *
    * For example, class closures for signals (see g_signal_type_cclosure_new())
    * retrieve the callback function from a fixed offset in the class structure.
    * The meta marshaller retrieves the right callback and passes it to the
    * marshaller as the
    * @marshal_data
    *   argument.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_meta_marshal/<method parameters>/meta_marshal]: Cannot render type Type(List(),ListMap(@name -> DataRecord(ClosureMarshal), @type -> DataRecord(GClosureMarshal)))"
  )
  private def setMetaMarshal__ = ???

  /**  Takes over the initial ownership of a closure.
    *
    *  Each closure is initially created in a "floating" state, which means
    *  that the initial reference count is not owned by any caller.
    *
    *  This function checks to see if the object is still floating, and if so,
    *  unsets the floating state and decreases the reference count. If the
    *  closure is not floating, g_closure_sink() does nothing.
    *
    *  The reason for the existence of the floating state is to prevent
    *  cumbersome code sequences like:
    *
    *  |[<!-- language="C" -->
    *  closure = g_cclosure_new (cb_func, cb_data);
    *  g_source_set_closure (source, closure);
    *  g_closure_unref (closure); // GObject doesn't really need this
    *  ]|
    *
    *  Because g_source_set_closure() (and similar functions) take ownership of the
    *  initial reference count, if it is unowned, we instead can write:
    *
    *  |[<!-- language="C" -->
    *  g_source_set_closure (source, g_cclosure_new (cb_func, cb_data));
    *  ]|
    *
    *  Generally, this function is used together with g_closure_ref(). An example
    *  of storing a closure for later notification looks like:
    *
    *  |[<!-- language="C" -->
    *  static GClosure *notify_closure = NULL;
    *  void
    *  foo_notify_set_closure (GClosure *closure)
    *  {
    *    if (notify_closure)
    *      g_closure_unref (notify_closure);
    *    notify_closure = closure;
    *    if (notify_closure)
    *      {
    *        g_closure_ref (notify_closure);
    *        g_closure_sink (notify_closure);
    *      }
    *  }
    *  ]|
    *
    *  Because g_closure_sink() may decrement the reference count of a closure
    *  (if it hasn't been called on @closure yet) just like g_closure_unref(),
    *  g_closure_ref() should be called prior to this function.
    *
    *  NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT BE APPLICABLE TO SCALA
    */
  def sink(): Unit /* None */ =
    g_closure_sink(this.getUnsafeRawPointer().asInstanceOf[Ptr[GClosure]])
  end sink

  /** Decrements the reference count of a closure after it was previously
    * incremented by the same caller.
    *
    * If no other callers are using the closure, then the closure will be
    * destroyed and freed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unref(): Unit /* None */ =
    g_closure_unref(this.getUnsafeRawPointer().asInstanceOf[Ptr[GClosure]])
  end unref

end Closure

object Closure:
  def fromRaw(ptr: Ptr[GClosure]): Closure = new Closure(ptr)
end Closure
