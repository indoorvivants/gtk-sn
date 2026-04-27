package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.fluent.AsyncResult
import sn.gnome.gio.fluent.Cancellable
import sn.gnome.gio.internal.GAsyncReadyCallback
import sn.gnome.gio.internal.GSimpleAsyncResult
import sn.gnome.gio.internal.GSimpleAsyncThreadFunc
import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.GDestroyNotify
import sn.gnome.glib.internal.GError
import sn.gnome.glib.internal.GQuark
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.gpointer
import sn.gnome.glib.internal.gssize
import sn.gnome.gobject.fluent.Object

class SimpleAsyncResult(raw: Ptr[GSimpleAsyncResult])
    extends Object(raw.asInstanceOf),
      AsyncResult:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def complete(): Unit = g_simple_async_result_complete(this.raw.asInstanceOf)

  def completeInIdle(): Unit = g_simple_async_result_complete_in_idle(
    this.raw.asInstanceOf
  )

  def getOpResGboolean(): Boolean =
    g_simple_async_result_get_op_res_gboolean(this.raw.asInstanceOf).value.!=(0)

  def getOpResGpointer(): Ptr[Byte] = g_simple_async_result_get_op_res_gpointer(
    this.raw.asInstanceOf
  ).value

  def getOpResGssize(): CLongInt = g_simple_async_result_get_op_res_gssize(
    this.raw.asInstanceOf
  ).value

  def getSourceTag(): Ptr[Byte] = g_simple_async_result_get_source_tag(
    this.raw.asInstanceOf
  ).value

  def propagateError(): GResult[Boolean] = GResult.wrap(__errorPtr =>
    g_simple_async_result_propagate_error(
      this.raw.asInstanceOf,
      __errorPtr
    ).value.!=(0)
  )

  def runInThread(
      func: GSimpleAsyncThreadFunc,
      io_priority: Int,
      cancellable: Cancellable
  ): Unit = g_simple_async_result_run_in_thread(
    this.raw.asInstanceOf,
    func,
    io_priority,
    cancellable.getUnsafeRawPointer().asInstanceOf
  )

  def setCheckCancellable(check_cancellable: Cancellable): Unit =
    g_simple_async_result_set_check_cancellable(
      this.raw.asInstanceOf,
      check_cancellable.getUnsafeRawPointer().asInstanceOf
    )

  inline def setError(
      domain: GQuark,
      code: Int,
      format: String | CString,
      args: Any*
  )(using Zone): Unit = g_simple_async_result_set_error(
    this.raw.asInstanceOf,
    domain,
    gint(code),
    __sn_extract_string(format),
    args*
  )

  def setErrorVa(
      domain: GQuark,
      code: Int,
      format: String | CString,
      args: CVarArgList
  )(using Zone): Unit = g_simple_async_result_set_error_va(
    this.raw.asInstanceOf,
    domain,
    gint(code),
    __sn_extract_string(format),
    args
  )

  def setFromError(error: Ptr[GError]): Unit =
    g_simple_async_result_set_from_error(this.raw.asInstanceOf, error)

  def setHandleCancellation(handle_cancellation: Boolean): Unit =
    g_simple_async_result_set_handle_cancellation(
      this.raw.asInstanceOf,
      gboolean(gint((if handle_cancellation == true then 1 else 0)))
    )

  def setOpResGboolean(op_res: Boolean): Unit =
    g_simple_async_result_set_op_res_gboolean(
      this.raw.asInstanceOf,
      gboolean(gint((if op_res == true then 1 else 0)))
    )

  def setOpResGpointer(
      op_res: Ptr[Byte],
      destroy_op_res: GDestroyNotify
  ): Unit = g_simple_async_result_set_op_res_gpointer(
    this.raw.asInstanceOf,
    gpointer(op_res),
    destroy_op_res
  )

  def setOpResGssize(op_res: CLongInt): Unit =
    g_simple_async_result_set_op_res_gssize(
      this.raw.asInstanceOf,
      gssize(op_res)
    )

  def takeError(error: Ptr[GError]): Unit =
    g_simple_async_result_take_error(this.raw.asInstanceOf, error)

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end SimpleAsyncResult

object SimpleAsyncResult:
  def apply(
      source_object: Object,
      callback: GAsyncReadyCallback,
      user_data: Ptr[Byte],
      source_tag: Ptr[Byte]
  ): SimpleAsyncResult = new SimpleAsyncResult(
    g_simple_async_result_new(
      source_object.getUnsafeRawPointer().asInstanceOf,
      callback,
      gpointer(user_data),
      gpointer(source_tag)
    ).asInstanceOf
  )
  inline def error(
      source_object: Object,
      callback: GAsyncReadyCallback,
      user_data: Ptr[Byte],
      domain: GQuark,
      code: Int,
      format: String | CString,
      args: Any*
  )(using Zone): SimpleAsyncResult = new SimpleAsyncResult(
    g_simple_async_result_new_error(
      source_object.getUnsafeRawPointer().asInstanceOf,
      callback,
      gpointer(user_data),
      domain,
      gint(code),
      __sn_extract_string(format),
      args*
    ).asInstanceOf
  )
  def fromError(
      source_object: Object,
      callback: GAsyncReadyCallback,
      user_data: Ptr[Byte],
      error: Ptr[GError]
  ): SimpleAsyncResult = new SimpleAsyncResult(
    g_simple_async_result_new_from_error(
      source_object.getUnsafeRawPointer().asInstanceOf,
      callback,
      gpointer(user_data),
      error
    ).asInstanceOf
  )
  def takeError(
      source_object: Object,
      callback: GAsyncReadyCallback,
      user_data: Ptr[Byte],
      error: Ptr[GError]
  ): SimpleAsyncResult = new SimpleAsyncResult(
    g_simple_async_result_new_take_error(
      source_object.getUnsafeRawPointer().asInstanceOf,
      callback,
      gpointer(user_data),
      error
    ).asInstanceOf
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end SimpleAsyncResult
