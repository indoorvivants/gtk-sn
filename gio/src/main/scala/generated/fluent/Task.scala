package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.fluent.AsyncResult
import sn.gnome.gio.fluent.Cancellable
import sn.gnome.gio.internal.GAsyncReadyCallback
import sn.gnome.gio.internal.GTask
import sn.gnome.gio.internal.GTaskThreadFunc
import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.GDestroyNotify
import sn.gnome.glib.internal.GError
import sn.gnome.glib.internal.GMainContext
import sn.gnome.glib.internal.GQuark
import sn.gnome.glib.internal.GSource
import sn.gnome.glib.internal.GSourceFunc
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gchar
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.gpointer
import sn.gnome.glib.internal.gssize
import sn.gnome.gobject.fluent.Object
import sn.gnome.gobject.internal.GValue

class Task(raw: Ptr[GTask]) extends Object(raw.asInstanceOf), AsyncResult:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def attachSource(source: Ptr[GSource], callback: GSourceFunc): Unit =
    g_task_attach_source(this.raw.asInstanceOf, source, callback)

  def getCancellable(): Cancellable = new Cancellable(
    g_task_get_cancellable(this.raw.asInstanceOf).asInstanceOf
  )

  def getCheckCancellable(): Boolean =
    g_task_get_check_cancellable(this.raw.asInstanceOf).value.!=(0)

  def getCompleted(): Boolean =
    g_task_get_completed(this.raw.asInstanceOf).value.!=(0)

  def getContext(): Ptr[GMainContext] = g_task_get_context(
    this.raw.asInstanceOf
  )

  def getName()(using Zone): String = fromCString(
    g_task_get_name(this.raw.asInstanceOf).asInstanceOf
  )

  def getPriority(): Int = g_task_get_priority(this.raw.asInstanceOf).value

  def getReturnOnCancel(): Boolean =
    g_task_get_return_on_cancel(this.raw.asInstanceOf).value.!=(0)

  def getSourceObject(): Object = new Object(
    g_task_get_source_object(this.raw.asInstanceOf).asInstanceOf
  )

  def getSourceTag(): Ptr[Byte] = g_task_get_source_tag(
    this.raw.asInstanceOf
  ).value

  def getTaskData(): Ptr[Byte] = g_task_get_task_data(
    this.raw.asInstanceOf
  ).value

  def hadError(): Boolean = g_task_had_error(this.raw.asInstanceOf).value.!=(0)

  def propagateBoolean(): GResult[Boolean] = GResult.wrap(__errorPtr =>
    g_task_propagate_boolean(this.raw.asInstanceOf, __errorPtr).value.!=(0)
  )

  def propagateInt(): GResult[CLongInt] = GResult.wrap(__errorPtr =>
    g_task_propagate_int(this.raw.asInstanceOf, __errorPtr).value
  )

  def propagatePointer(): GResult[Ptr[Byte]] = GResult.wrap(__errorPtr =>
    g_task_propagate_pointer(this.raw.asInstanceOf, __errorPtr).value
  )

  // Method propagate_value contains an OUT parameter, which is not supported yet

  def returnBoolean(result: Boolean): Unit = g_task_return_boolean(
    this.raw.asInstanceOf,
    gboolean(gint((if result == true then 1 else 0)))
  )

  def returnError(error: Ptr[GError]): Unit =
    g_task_return_error(this.raw.asInstanceOf, error)

  def returnErrorIfCancelled(): Boolean =
    g_task_return_error_if_cancelled(this.raw.asInstanceOf).value.!=(0)

  def returnInt(result: CLongInt): Unit =
    g_task_return_int(this.raw.asInstanceOf, gssize(result))

  inline def returnNewError(
      domain: GQuark,
      code: Int,
      format: String | CString,
      args: Any*
  )(using Zone): Unit = g_task_return_new_error(
    this.raw.asInstanceOf,
    domain,
    gint(code),
    __sn_extract_string(format),
    args*
  )

  def returnPointer(result: Ptr[Byte], result_destroy: GDestroyNotify): Unit =
    g_task_return_pointer(
      this.raw.asInstanceOf,
      gpointer(result),
      result_destroy
    )

  def returnValue(result: Ptr[GValue]): Unit =
    g_task_return_value(this.raw.asInstanceOf, result)

  def runInThread(task_func: GTaskThreadFunc): Unit =
    g_task_run_in_thread(this.raw.asInstanceOf, task_func)

  def runInThreadSync(task_func: GTaskThreadFunc): Unit =
    g_task_run_in_thread_sync(this.raw.asInstanceOf, task_func)

  def setCheckCancellable(check_cancellable: Boolean): Unit =
    g_task_set_check_cancellable(
      this.raw.asInstanceOf,
      gboolean(gint((if check_cancellable == true then 1 else 0)))
    )

  def setName(name: String | CString)(using Zone): Unit = g_task_set_name(
    this.raw.asInstanceOf,
    __sn_extract_string(name).asInstanceOf[Ptr[gchar]]
  )

  def setPriority(priority: Int): Unit =
    g_task_set_priority(this.raw.asInstanceOf, gint(priority))

  def setReturnOnCancel(return_on_cancel: Boolean): Boolean =
    g_task_set_return_on_cancel(
      this.raw.asInstanceOf,
      gboolean(gint((if return_on_cancel == true then 1 else 0)))
    ).value.!=(0)

  def setSourceTag(source_tag: Ptr[Byte]): Unit =
    g_task_set_source_tag(this.raw.asInstanceOf, gpointer(source_tag))

  def setStaticName(name: String | CString)(using Zone): Unit =
    g_task_set_static_name(
      this.raw.asInstanceOf,
      __sn_extract_string(name).asInstanceOf[Ptr[gchar]]
    )

  def setTaskData(
      task_data: Ptr[Byte],
      task_data_destroy: GDestroyNotify
  ): Unit = g_task_set_task_data(
    this.raw.asInstanceOf,
    gpointer(task_data),
    task_data_destroy
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end Task

object Task:
  def apply(
      source_object: Object,
      cancellable: Cancellable,
      callback: GAsyncReadyCallback,
      callback_data: Ptr[Byte]
  ): Task = new Task(
    g_task_new(
      gpointer(
        source_object.getUnsafeRawPointer().asInstanceOf.asInstanceOf[Ptr[Byte]]
      ),
      cancellable.getUnsafeRawPointer().asInstanceOf,
      callback,
      gpointer(callback_data)
    ).asInstanceOf
  )
end Task
