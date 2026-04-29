package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.fluent.Device
import sn.gnome.gdk4.fluent.Display
import sn.gnome.gdk4.fluent.Drag
import sn.gnome.gdk4.fluent.Surface
import sn.gnome.gdk4.internal.GdkContentFormats
import sn.gnome.gdk4.internal.GdkDragAction
import sn.gnome.gdk4.internal.GdkDrop
import sn.gnome.gio.fluent.AsyncResult
import sn.gnome.gio.fluent.Cancellable
import sn.gnome.gio.internal.GAsyncReadyCallback
import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.gpointer
import sn.gnome.gobject.fluent.Object
import sn.gnome.gobject.internal.GType
import sn.gnome.gobject.internal.GValue

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * The `GdkDrop` object represents the target of an ongoing DND operation.
  *
  * Possible drop sites get informed about the status of the ongoing drag
  * operation with events of type %GDK_DRAG_ENTER, %GDK_DRAG_LEAVE,
  * %GDK_DRAG_MOTION and %GDK_DROP_START. The `GdkDrop` object can be obtained
  * from these [class@Gdk.Event] types using [method@Gdk.DNDEvent.get_drop].
  *
  * The actual data transfer is initiated from the target side via an async
  * read, using one of the `GdkDrop` methods for this purpose:
  * [method@Gdk.Drop.read_async] or [method@Gdk.Drop.read_value_async].
  *
  * GTK provides a higher level abstraction based on top of these functions, and
  * so they are not normally needed in GTK applications. See the "Drag and Drop"
  * section of the GTK documentation for more information.
  */
class Drop(raw: Ptr[GdkDrop]) extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Ends the drag operation after a drop.
    *
    * The @action must be a single action selected from the actions available
    * via [method@Gdk.Drop.get_actions].
    */
  def finish(action: GdkDragAction): Unit =
    gdk_drop_finish(this.raw.asInstanceOf, action)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the possible actions for this `GdkDrop`.
    *
    * If this value contains multiple actions - i.e.
    * [func@Gdk.DragAction.is_unique] returns %FALSE for the result -
    * [method@Gdk.Drop.finish] must choose the action to use when accepting the
    * drop. This will only happen if you passed %GDK_ACTION_ASK as one of the
    * possible actions in [method@Gdk.Drop.status]. %GDK_ACTION_ASK itself will
    * not be included in the actions returned by this function.
    *
    * This value may change over the lifetime of the [class@Gdk.Drop] both as a
    * response to source side actions as well as to calls to
    * [method@Gdk.Drop.status] or [method@Gdk.Drop.finish]. The source side will
    * not change this value anymore once a drop has started.
    */
  def getActions(): GdkDragAction = gdk_drop_get_actions(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the `GdkDevice` performing the drop.
    */
  def getDevice(): Device = new Device(
    gdk_drop_get_device(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the `GdkDisplay` that @self was created for.
    */
  def getDisplay(): Display = new Display(
    gdk_drop_get_display(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * If this is an in-app drag-and-drop operation, returns the `GdkDrag` that
    * corresponds to this drop.
    *
    * If it is not, %NULL is returned.
    */
  def getDrag(): Drag = new Drag(
    gdk_drop_get_drag(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the `GdkContentFormats` that the drop offers the data to be read
    * in.
    */
  def getFormats(): Ptr[GdkContentFormats] = gdk_drop_get_formats(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the `GdkSurface` performing the drop.
    */
  def getSurface(): Surface = new Surface(
    gdk_drop_get_surface(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Finishes an async drop read operation.
    *
    * Note that you must not use blocking read calls on the returned stream in
    * the GTK thread, since some platforms might require communication with GTK
    * to complete the data transfer. You can use async APIs such as
    * g_input_stream_read_bytes_async().
    *
    * See [method@Gdk.Drop.read_async].
    */
  @annotation.compileTimeOnly(
    "Method read_finish contains an OUT parameter, which is not supported yet"
  )
  def readFinish(using DummyImplicit) = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Asynchronously request the drag operation's contents converted to the
    * given @type.
    *
    * When the operation is finished @callback will be called. You must then
    * call [method@Gdk.Drop.read_value_finish] to get the resulting `GValue`.
    *
    * For local drag-and-drop operations that are available in the given
    * `GType`, the value will be copied directly. Otherwise, GDK will try to use
    * [func@Gdk.content_deserialize_async] to convert the data.
    */
  def readValueAsync(
      `type`: GType,
      io_priority: Int,
      cancellable: Cancellable,
      callback: GAsyncReadyCallback,
      user_data: Ptr[Byte]
  ): Unit = gdk_drop_read_value_async(
    this.raw.asInstanceOf,
    `type`,
    io_priority,
    cancellable.getUnsafeRawPointer().asInstanceOf,
    callback,
    gpointer(user_data)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Finishes an async drop read.
    *
    * See [method@Gdk.Drop.read_value_async].
    */
  def readValueFinish(result: AsyncResult): GResult[Ptr[GValue]] =
    GResult.wrap(__errorPtr =>
      gdk_drop_read_value_finish(
        this.raw.asInstanceOf,
        result.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      )
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Selects all actions that are potentially supported by the destination.
    *
    * When calling this function, do not restrict the passed in actions to the
    * ones provided by [method@Gdk.Drop.get_actions]. Those actions may change
    * in the future, even depending on the actions you provide here.
    *
    * The @preferred action is a hint to the drag-and-drop mechanism about which
    * action to use when multiple actions are possible.
    *
    * This function should be called by drag destinations in response to
    * %GDK_DRAG_ENTER or %GDK_DRAG_MOTION events. If the destination does not
    * yet know the exact actions it supports, it should set any possible actions
    * first and then later call this function again.
    */
  def status(actions: GdkDragAction, preferred: GdkDragAction): Unit =
    gdk_drop_status(this.raw.asInstanceOf, actions, preferred)

end Drop
