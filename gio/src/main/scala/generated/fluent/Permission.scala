package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.fluent.{AsyncResult, Cancellable}
import sn.gnome.gio.internal.GPermission
import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gobject.fluent.Object

/** A #GPermission represents the status of the caller's permission to perform a
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
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class Permission(raw: Ptr[GPermission]) extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Attempts to acquire the permission represented by @permission.
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def acquire(
      cancellable: Option[Cancellable /* Some(Ptr[GCancellable]) */ ]
  ): GResult[Boolean /* None */ ] = GResult.wrap(__errorPtr =>
    g_permission_acquire(
      this.raw.asInstanceOf[Ptr[GPermission]],
      cancellable
        .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
      __errorPtr
    ).value.!=(0)
  )

  /** Attempts to acquire the permission represented by @permission.
    *
    * This is the first half of the asynchronous version of
    * g_permission_acquire().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method acquire_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def acquireAsync__ = ???

  /** Collects the result of attempting to acquire the permission represented by @permission.
    *
    * This is the second half of the asynchronous version of
    * g_permission_acquire().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def acquireFinish(
      result: AsyncResult /* Some(Ptr[GAsyncResult]) */
  ): GResult[Boolean /* None */ ] = GResult.wrap(__errorPtr =>
    g_permission_acquire_finish(
      this.raw.asInstanceOf[Ptr[GPermission]],
      result.getUnsafeRawPointer().asInstanceOf,
      __errorPtr
    ).value.!=(0)
  )

  /** Gets the value of the 'allowed' property. This property is %TRUE if the
    * caller currently has permission to perform the action that
    * @permission
    *   represents the permission to perform.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getAllowed(): Boolean /* None */ = g_permission_get_allowed(
    this.raw.asInstanceOf[Ptr[GPermission]]
  ).value.!=(0)

  /** Gets the value of the 'can-acquire' property. This property is %TRUE if it
    * is generally possible to acquire the permission by calling
    * g_permission_acquire().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getCanAcquire(): Boolean /* None */ = g_permission_get_can_acquire(
    this.raw.asInstanceOf[Ptr[GPermission]]
  ).value.!=(0)

  /** Gets the value of the 'can-release' property. This property is %TRUE if it
    * is generally possible to release the permission by calling
    * g_permission_release().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getCanRelease(): Boolean /* None */ = g_permission_get_can_release(
    this.raw.asInstanceOf[Ptr[GPermission]]
  ).value.!=(0)

  /** This function is called by the #GPermission implementation to update the
    * properties of the permission. You should never call this function except
    * from a #GPermission implementation.
    *
    * GObject notify signals are generated, as appropriate.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def implUpdate(
      allowed: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */,
      can_acquire: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */,
      can_release: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = g_permission_impl_update(
    this.raw.asInstanceOf[Ptr[GPermission]],
    gboolean(gint((if allowed == true then 1 else 0))),
    gboolean(gint((if can_acquire == true then 1 else 0))),
    gboolean(gint((if can_release == true then 1 else 0)))
  )

  /** Attempts to release the permission represented by @permission.
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def release(
      cancellable: Option[Cancellable /* Some(Ptr[GCancellable]) */ ]
  ): GResult[Boolean /* None */ ] = GResult.wrap(__errorPtr =>
    g_permission_release(
      this.raw.asInstanceOf[Ptr[GPermission]],
      cancellable
        .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
      __errorPtr
    ).value.!=(0)
  )

  /** Attempts to release the permission represented by @permission.
    *
    * This is the first half of the asynchronous version of
    * g_permission_release().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method release_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def releaseAsync__ = ???

  /** Collects the result of attempting to release the permission represented by @permission.
    *
    * This is the second half of the asynchronous version of
    * g_permission_release().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def releaseFinish(
      result: AsyncResult /* Some(Ptr[GAsyncResult]) */
  ): GResult[Boolean /* None */ ] = GResult.wrap(__errorPtr =>
    g_permission_release_finish(
      this.raw.asInstanceOf[Ptr[GPermission]],
      result.getUnsafeRawPointer().asInstanceOf,
      __errorPtr
    ).value.!=(0)
  )

end Permission
