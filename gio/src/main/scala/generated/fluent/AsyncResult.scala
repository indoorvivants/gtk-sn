package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.GResult
import sn.gnome.glib.internal.{gboolean, gint, gpointer}
import sn.gnome.gobject.Object
import sn.gnome.gobject.runtime.*

trait AsyncResult:
  def getUnsafeRawPointer(): Ptr[Byte]

  /** Gets the source object from a #GAsyncResult.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSourceObject()(using Runtime): sn.gnome.gobject.Object /* None */ =
    sn.gnome.gobject.Object.applyUnsafe(
      g_async_result_get_source_object(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GAsyncResult]]
      ).asInstanceOf
    )
  end getSourceObject

  /** Gets the user data from a #GAsyncResult.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getUserData(): Ptr[Byte] /* None */ =
    g_async_result_get_user_data(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GAsyncResult]]
    ).value
  end getUserData

  /** Checks if @res has the given @source_tag (generally a function pointer
    * indicating the function @res was created by).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isTagged(
      source_tag: Option[
        Ptr[Byte] /* Some(_root_.sn.gnome.glib.internal.gpointer) */
      ]
  ): Boolean /* None */ =
    g_async_result_is_tagged(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GAsyncResult]],
      source_tag
        .map[_root_.sn.gnome.glib.internal.gpointer](o => gpointer(o))
        .getOrElse(null.asInstanceOf[_root_.sn.gnome.glib.internal.gpointer])
    ).value.!=(0)
  end isTagged

  /** If @res is a #GSimpleAsyncResult, this is equivalent to
    * g_simple_async_result_propagate_error(). Otherwise it returns %FALSE.
    *
    * This can be used for legacy error handling in async *_finish() wrapper
    * functions that traditionally handled #GSimpleAsyncResult error returns
    * themselves rather than calling into the virtual method. This should not be
    * used in new code; #GAsyncResult errors that are set by virtual methods
    * should also be extracted by virtual methods, to enable subclasses to chain
    * up correctly.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def legacyPropagateError(): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      g_async_result_legacy_propagate_error(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GAsyncResult]],
        __errorPtr
      ).value.!=(0)
    )
  end legacyPropagateError

end AsyncResult

object AsyncResult:
  class Abstract(raw: Ptr[Byte]) extends AsyncResult:
    override def getUnsafeRawPointer(): Ptr[Byte] = raw
  end Abstract
end AsyncResult
