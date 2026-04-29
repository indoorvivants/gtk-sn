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

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A #GPermission represents the status of the caller's permission to perform a
  * certain action.
  *
  * You can query if the action is currently allowed and if it is possible to
  * acquire the permission so that the action will be allowed in the future.
  *
  * There is also an API to actually acquire the permission and one to release
  * it.
  *
  * As an example, a #GPermission might represent the ability for the user to
  * write to a #GSettings object. This #GPermission object could then be used to
  * decide if it is appropriate to show a "Click here to unlock" button in a
  * dialog and to provide the mechanism to invoke when that button is clicked.
  */
class Permission(raw: Ptr[GPermission]) extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Attempts to acquire the permission represented by @permission.
    *
    * The precise method by which this happens depends on the permission and the
    * underlying authentication mechanism. A simple example is that a dialog may
    * appear asking the user to enter their password.
    *
    * You should check with g_permission_get_can_acquire() before calling this
    * function.
    *
    * If the permission is acquired then %TRUE is returned. Otherwise, %FALSE is
    * returned and @error is set appropriately.
    *
    * This call is blocking, likely for a very long time (in the case that user
    * interaction is required). See g_permission_acquire_async() for the
    * non-blocking version.
    */
  def acquire(cancellable: Cancellable): GResult[Boolean] =
    GResult.wrap(__errorPtr =>
      g_permission_acquire(
        this.raw.asInstanceOf,
        cancellable.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value.!=(0)
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Attempts to acquire the permission represented by @permission.
    *
    * This is the first half of the asynchronous version of
    * g_permission_acquire().
    */
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

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Collects the result of attempting to acquire the permission represented by @permission.
    *
    * This is the second half of the asynchronous version of
    * g_permission_acquire().
    */
  def acquireFinish(result: AsyncResult): GResult[Boolean] =
    GResult.wrap(__errorPtr =>
      g_permission_acquire_finish(
        this.raw.asInstanceOf,
        result.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value.!=(0)
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the value of the 'allowed' property. This property is %TRUE if the
    * caller currently has permission to perform the action that
    * @permission
    *   represents the permission to perform.
    */
  def getAllowed(): Boolean =
    g_permission_get_allowed(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the value of the 'can-acquire' property. This property is %TRUE if it
    * is generally possible to acquire the permission by calling
    * g_permission_acquire().
    */
  def getCanAcquire(): Boolean =
    g_permission_get_can_acquire(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the value of the 'can-release' property. This property is %TRUE if it
    * is generally possible to release the permission by calling
    * g_permission_release().
    */
  def getCanRelease(): Boolean =
    g_permission_get_can_release(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * This function is called by the #GPermission implementation to update the
    * properties of the permission. You should never call this function except
    * from a #GPermission implementation.
    *
    * GObject notify signals are generated, as appropriate.
    */
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

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Attempts to release the permission represented by @permission.
    *
    * The precise method by which this happens depends on the permission and the
    * underlying authentication mechanism. In most cases the permission will be
    * dropped immediately without further action.
    *
    * You should check with g_permission_get_can_release() before calling this
    * function.
    *
    * If the permission is released then %TRUE is returned. Otherwise, %FALSE is
    * returned and @error is set appropriately.
    *
    * This call is blocking, likely for a very long time (in the case that user
    * interaction is required). See g_permission_release_async() for the
    * non-blocking version.
    */
  def release(cancellable: Cancellable): GResult[Boolean] =
    GResult.wrap(__errorPtr =>
      g_permission_release(
        this.raw.asInstanceOf,
        cancellable.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value.!=(0)
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Attempts to release the permission represented by @permission.
    *
    * This is the first half of the asynchronous version of
    * g_permission_release().
    */
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

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Collects the result of attempting to release the permission represented by @permission.
    *
    * This is the second half of the asynchronous version of
    * g_permission_release().
    */
  def releaseFinish(result: AsyncResult): GResult[Boolean] =
    GResult.wrap(__errorPtr =>
      g_permission_release_finish(
        this.raw.asInstanceOf,
        result.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value.!=(0)
    )

end Permission
