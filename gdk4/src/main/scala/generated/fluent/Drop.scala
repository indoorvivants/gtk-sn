package sn.gnome.gdk4

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.{Device, Display, Drag, DragAction, Surface}
import sn.gnome.gdk4.internal.GdkDrop
import sn.gnome.gobject.Object
import sn.gnome.gobject.runtime.*

/** The `GdkDrop` object represents the target of an ongoing DND operation.
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
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class Drop private[gnome] (raw: Ptr[GdkDrop]) extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Ends the drag operation after a drop.
    *
    * The @action must be a single action selected from the actions available
    * via [method@Gdk.Drop.get_actions].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def finish(action: DragAction /* Some(GdkDragAction) */ ): Unit /* None */ =
    gdk_drop_finish(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkDrop]],
      action.raw
    )
  end finish

  /** Returns the possible actions for this `GdkDrop`.
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getActions(): DragAction /* None */ =
    DragAction.fromRaw(
      gdk_drop_get_actions(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkDrop]]
      )
    )
  end getActions

  /** Returns the `GdkDevice` performing the drop.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDevice()(using Runtime): sn.gnome.gdk4.Device /* None */ =
    sn.gnome.gdk4.Device.applyUnsafe(
      gdk_drop_get_device(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkDrop]]
      ).asInstanceOf
    )
  end getDevice

  /** Gets the `GdkDisplay` that @self was created for.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDisplay()(using Runtime): sn.gnome.gdk4.Display /* None */ =
    sn.gnome.gdk4.Display.applyUnsafe(
      gdk_drop_get_display(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkDrop]]
      ).asInstanceOf
    )
  end getDisplay

  /** If this is an in-app drag-and-drop operation, returns the `GdkDrag` that
    * corresponds to this drop.
    *
    * If it is not, %NULL is returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDrag()(using Runtime): sn.gnome.gdk4.Drag /* None */ =
    sn.gnome.gdk4.Drag.applyUnsafe(
      gdk_drop_get_drag(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkDrop]]
      ).asInstanceOf
    )
  end getDrag

  /** Returns the `GdkContentFormats` that the drop offers the data to be read
    * in.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_formats/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(ContentFormats), @type -> DataRecord(GdkContentFormats*)))"
  )
  private def getFormats__ = ???

  /** Returns the `GdkSurface` performing the drop.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSurface()(using Runtime): sn.gnome.gdk4.Surface /* None */ =
    sn.gnome.gdk4.Surface.applyUnsafe(
      gdk_drop_get_surface(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkDrop]]
      ).asInstanceOf
    )
  end getSurface

  /** Asynchronously read the dropped data from a `GdkDrop` in a format that
    * complies with one of the mime types.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method read_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Gio.AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def readAsync__ = ???

  /** Finishes an async drop read operation.
    *
    * Note that you must not use blocking read calls on the returned stream in
    * the GTK thread, since some platforms might require communication with GTK
    * to complete the data transfer. You can use async APIs such as
    * g_input_stream_read_bytes_async().
    *
    * See [method@Gdk.Drop.read_async].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method read_finish]: Method read_finish contains an OUT parameter, which is not supported yet"
  )
  private def readFinish__ = ???

  /** Asynchronously request the drag operation's contents converted to the
    * given @type.
    *
    * When the operation is finished @callback will be called. You must then
    * call [method@Gdk.Drop.read_value_finish] to get the resulting `GValue`.
    *
    * For local drag-and-drop operations that are available in the given
    * `GType`, the value will be copied directly. Otherwise, GDK will try to use
    * [func@Gdk.content_deserialize_async] to convert the data.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method read_value_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Gio.AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def readValueAsync__ = ???

  /** Finishes an async drop read.
    *
    * See [method@Gdk.Drop.read_value_async].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method read_value_finish/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GObject.Value), @type -> DataRecord(const GValue*)))"
  )
  private def readValueFinish__ = ???

  /** Selects all actions that are potentially supported by the destination.
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def status(
      actions: DragAction /* Some(GdkDragAction) */,
      preferred: DragAction /* Some(GdkDragAction) */
  ): Unit /* None */ =
    gdk_drop_status(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkDrop]],
      actions.raw,
      preferred.raw
    )
  end status

end Drop

object Drop:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GdkDrop])(using Runtime) = summon[Runtime]
    .getOrCreate[Drop](ptr.asInstanceOf[Ptr[Byte]], p => new Drop(ptr))

end Drop
