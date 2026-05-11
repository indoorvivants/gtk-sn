package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.Cancellable
import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gobject.runtime.*

trait Initable:
  def getUnsafeRawPointer(): Ptr[Byte]

  /** Initializes the object implementing the interface.
    *
    * This method is intended for language bindings. If writing in C,
    * g_initable_new() should typically be used instead.
    *
    * The object must be initialized before any real use after initial
    * construction, either with this function or g_async_initable_init_async().
    *
    * Implementations may also support cancellation. If @cancellable is not
    * %NULL, then initialization can be cancelled by triggering the cancellable
    * object from another thread. If the operation was cancelled, the error
    * %G_IO_ERROR_CANCELLED will be returned. If @cancellable is not %NULL and
    * the object doesn't support cancellable initialization the error
    * %G_IO_ERROR_NOT_SUPPORTED will be returned.
    *
    * If the object is not initialized, or initialization returns with an error,
    * then all operations on the object except g_object_ref() and
    * g_object_unref() are considered to be invalid, and have undefined
    * behaviour. See the [introduction][ginitable] for more details.
    *
    * Callers should not assume that a class which implements #GInitable can be
    * initialized multiple times, unless the class explicitly documents itself
    * as supporting this. Generally, a class’ implementation of init() can
    * assume (and assert) that it will only be called once. Previously, this
    * documentation recommended all #GInitable implementations should be
    * idempotent; that recommendation was relaxed in GLib 2.54.
    *
    * If a class explicitly supports being initialized multiple times, it is
    * recommended that the method is idempotent: multiple calls with the same
    * arguments should return the same results. Only the first call initializes
    * the object; further calls return the result of the first call.
    *
    * One reason why a class might need to support idempotent initialization is
    * if it is designed to be used via the singleton pattern, with a
    * #GObjectClass.constructor that sometimes returns an existing instance. In
    * this pattern, a caller would expect to be able to call g_initable_init()
    * on the result of g_object_new(), regardless of whether it is in fact a new
    * instance.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def init(
      cancellable: Option[
        sn.gnome.gio.fluent.Cancellable /* Some(Ptr[GCancellable]) */
      ]
  )(using Runtime): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_initable_init(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GInitable]],
        cancellable
          .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
          .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
        __errorPtr
      ).value.!=(0)
    )
  end init

end Initable

object Initable:
  class Abstract(raw: Ptr[Byte]) extends Initable:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end Initable
