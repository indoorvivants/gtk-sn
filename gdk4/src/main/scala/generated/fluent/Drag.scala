package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.fluent.{
  ContentProvider,
  Device,
  Display,
  Drag,
  DragAction,
  DragCancelReason,
  Surface
}
import sn.gnome.gdk4.internal.{GdkDrag, GdkDragCancelReason}
import sn.gnome.glib.internal.{gboolean, gchar, gint, gpointer}
import sn.gnome.gobject.fluent.Object
import sn.gnome.gobject.internal.{
  GClosure,
  GClosureNotify,
  GConnectFlags,
  g_signal_connect_data
}
import sn.gnome.gobject.runtime.*
import sn.gnome.runtime.*

/** The `GdkDrag` object represents the source of an ongoing DND operation.
  *
  * A `GdkDrag` is created when a drag is started, and stays alive for duration
  * of the DND operation. After a drag has been started with
  * [func@Gdk.Drag.begin], the caller gets informed about the status of the
  * ongoing drag operation with signals on the `GdkDrag` object.
  *
  * GTK provides a higher level abstraction based on top of these functions, and
  * so they are not normally needed in GTK applications. See the "Drag and Drop"
  * section of the GTK documentation for more information.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class Drag private[gnome] (raw: Ptr[GdkDrag]) extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Informs GDK that the drop ended.
    *
    * Passing %FALSE for @success may trigger a drag cancellation animation.
    *
    * This function is called by the drag source, and should be the last call
    * before dropping the reference to the @drag.
    *
    * The `GdkDrag` will only take the first [method@Gdk.Drag.drop_done] call as
    * effective, if this function is called multiple times, all subsequent calls
    * will be ignored.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def dropDone(
      success: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gdk_drag_drop_done(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkDrag]],
      gboolean(gint((if success == true then 1 else 0)))
    )
  end dropDone

  /** Determines the bitmask of possible actions proposed by the source.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getActions(): DragAction /* None */ =
    DragAction.fromRaw(
      gdk_drag_get_actions(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkDrag]]
      )
    )
  end getActions

  /** Returns the `GdkContentProvider` associated to the `GdkDrag` object.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getContent()(using
      Runtime
  ): sn.gnome.gdk4.fluent.ContentProvider /* None */ =
    sn.gnome.gdk4.fluent.ContentProvider.applyUnsafe(
      gdk_drag_get_content(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkDrag]]
      ).asInstanceOf
    )
  end getContent

  /** Returns the `GdkDevice` associated to the `GdkDrag` object.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDevice()(using Runtime): sn.gnome.gdk4.fluent.Device /* None */ =
    sn.gnome.gdk4.fluent.Device.applyUnsafe(
      gdk_drag_get_device(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkDrag]]
      ).asInstanceOf
    )
  end getDevice

  /** Gets the `GdkDisplay` that the drag object was created for.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDisplay()(using Runtime): sn.gnome.gdk4.fluent.Display /* None */ =
    sn.gnome.gdk4.fluent.Display.applyUnsafe(
      gdk_drag_get_display(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkDrag]]
      ).asInstanceOf
    )
  end getDisplay

  /** Returns the surface on which the drag icon should be rendered during the
    * drag operation.
    *
    * Note that the surface may not be available until the drag operation has
    * begun. GDK will move the surface in accordance with the ongoing drag
    * operation. The surface is owned by @drag and will be destroyed when the
    * drag operation is over.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDragSurface()(using Runtime): sn.gnome.gdk4.fluent.Surface /* None */ =
    sn.gnome.gdk4.fluent.Surface.applyUnsafe(
      gdk_drag_get_drag_surface(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkDrag]]
      ).asInstanceOf
    )
  end getDragSurface

  /** Retrieves the formats supported by this `GdkDrag` object.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_formats/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(ContentFormats), @type -> DataRecord(GdkContentFormats*)))"
  )
  private def getFormats__ = ???

  /** Determines the action chosen by the drag destination.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSelectedAction(): DragAction /* None */ =
    DragAction.fromRaw(
      gdk_drag_get_selected_action(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkDrag]]
      )
    )
  end getSelectedAction

  /** Returns the `GdkSurface` where the drag originates.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSurface()(using Runtime): sn.gnome.gdk4.fluent.Surface /* None */ =
    sn.gnome.gdk4.fluent.Surface.applyUnsafe(
      gdk_drag_get_surface(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkDrag]]
      ).asInstanceOf
    )
  end getSurface

  /** Sets the position of the drag surface that will be kept under the cursor
    * hotspot.
    *
    * Initially, the hotspot is at the top left corner of the drag surface.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setHotspot(
      hot_x: Int /* Some(CInt) */,
      hot_y: Int /* Some(CInt) */
  ): Unit /* None */ =
    gdk_drag_set_hotspot(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkDrag]],
      hot_x,
      hot_y
    )
  end setHotspot

  /** Emitted when the drag operation is cancelled.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onCancel(handler: ((reason: DragCancelReason)) => Unit)(using Runtime) =
    type SignalRegType =
      SignalRegistration[this.type, (reason: DragCancelReason), Unit]
    val c_handler = CFuncPtr3.fromScalaFunction {
      (
          self: Ptr[GdkDrag],
          reason: GdkDragCancelReason /* param */,
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler((reason = DragCancelReason.fromRaw(reason)))
    }
    val f = handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"cancel"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onCancel

  /** Emitted when the destination side has finished reading all data.
    *
    * The drag object can now free all miscellaneous data.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onDndFinished(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GdkDrag],
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(EmptyTuple)
    }
    val f = (e: EmptyTuple.type) => handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"dnd-finished"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onDndFinished

  /** Emitted when the drop operation is performed on an accepting client.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onDropPerformed(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GdkDrag],
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(EmptyTuple)
    }
    val f = (e: EmptyTuple.type) => handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"drop-performed"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onDropPerformed
end Drag

object Drag:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GdkDrag])(using Runtime) = summon[Runtime]
    .getOrCreate[Drag](ptr.asInstanceOf[Ptr[Byte]], p => new Drag(ptr))

  /** Starts a drag and creates a new drag context for it.
    *
    * This function is called by the drag source. After this call, you probably
    * want to set up the drag icon using the surface returned by
    * [method@Gdk.Drag.get_drag_surface].
    *
    * This function returns a reference to the [class@Gdk.Drag] object, but GTK
    * keeps its own reference as well, as long as the DND operation is going on.
    *
    * Note: if @actions include %GDK_ACTION_MOVE, you need to listen for the
    * [signal@Gdk.Drag::dnd-finished] signal and delete the data at the source
    * if [method@Gdk.Drag.get_selected_action] returns %GDK_ACTION_MOVE.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def begin(
      surface: sn.gnome.gdk4.fluent.Surface /* Some(Ptr[GdkSurface]) */,
      device: sn.gnome.gdk4.fluent.Device /* Some(Ptr[GdkDevice]) */,
      content: sn.gnome.gdk4.fluent.ContentProvider /* Some(Ptr[GdkContentProvider]) */,
      actions: DragAction /* Some(GdkDragAction) */,
      dx: Double /* Some(Double) */,
      dy: Double /* Some(Double) */
  )(using Runtime): sn.gnome.gdk4.fluent.Drag /* Some(Ptr[GdkDrag]) */ =
    sn.gnome.gdk4.fluent.Drag.applyUnsafe(
      gdk_drag_begin(
        surface.getUnsafeRawPointer().asInstanceOf,
        device.getUnsafeRawPointer().asInstanceOf,
        content.getUnsafeRawPointer().asInstanceOf,
        actions.raw,
        dx,
        dy
      ).asInstanceOf
    )

end Drag
