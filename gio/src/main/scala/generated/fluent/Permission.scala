package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.AsyncResult
import sn.gnome.gio.fluent.Cancellable
import sn.gnome.gio.internal.GAsyncReadyCallback
import sn.gnome.gio.internal.GPermission
import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.gpointer
import sn.gnome.gobject.fluent.Object

class Permission(raw: Ptr[GPermission]) extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def acquire(cancellable: Cancellable): GResult[Boolean] =
    GResult.wrap(__errorPtr =>
      g_permission_acquire(
        this.raw.asInstanceOf,
        cancellable.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value.!=(0)
    )

  def acquireAsync(
      cancellable: Cancellable,
      callback: GAsyncReadyCallback,
      user_data: Ptr[Byte]
  ): Unit = g_permission_acquire_async(
    this.raw.asInstanceOf,
    cancellable.getUnsafeRawPointer().asInstanceOf,
    callback,
    gpointer(user_data)
  )

  def acquireFinish(result: AsyncResult): GResult[Boolean] =
    GResult.wrap(__errorPtr =>
      g_permission_acquire_finish(
        this.raw.asInstanceOf,
        result.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value.!=(0)
    )

  def getAllowed(): Boolean =
    g_permission_get_allowed(this.raw.asInstanceOf).value.!=(0)

  def getCanAcquire(): Boolean =
    g_permission_get_can_acquire(this.raw.asInstanceOf).value.!=(0)

  def getCanRelease(): Boolean =
    g_permission_get_can_release(this.raw.asInstanceOf).value.!=(0)

  def implUpdate(
      allowed: Boolean,
      can_acquire: Boolean,
      can_release: Boolean
  ): Unit = g_permission_impl_update(
    this.raw.asInstanceOf,
    gboolean(gint((if allowed == true then 1 else 0))),
    gboolean(gint((if can_acquire == true then 1 else 0))),
    gboolean(gint((if can_release == true then 1 else 0)))
  )

  def release(cancellable: Cancellable): GResult[Boolean] =
    GResult.wrap(__errorPtr =>
      g_permission_release(
        this.raw.asInstanceOf,
        cancellable.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value.!=(0)
    )

  def releaseAsync(
      cancellable: Cancellable,
      callback: GAsyncReadyCallback,
      user_data: Ptr[Byte]
  ): Unit = g_permission_release_async(
    this.raw.asInstanceOf,
    cancellable.getUnsafeRawPointer().asInstanceOf,
    callback,
    gpointer(user_data)
  )

  def releaseFinish(result: AsyncResult): GResult[Boolean] =
    GResult.wrap(__errorPtr =>
      g_permission_release_finish(
        this.raw.asInstanceOf,
        result.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value.!=(0)
    )

end Permission
