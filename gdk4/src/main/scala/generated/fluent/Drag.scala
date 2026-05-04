package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.fluent.{
  ContentProvider,
  Device,
  Display,
  Drag,
  DragAction,
  Surface
}
import sn.gnome.gdk4.internal.GdkDrag
import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gobject.fluent.Object

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * The `GdkDrag` object represents the source of an ongoing DND operation.
  *
  * A `GdkDrag` is created when a drag is started, and stays alive for duration
  * of the DND operation. After a drag has been started with
  * [func@Gdk.Drag.begin], the caller gets informed about the status of the
  * ongoing drag operation with signals on the `GdkDrag` object.
  *
  * GTK provides a higher level abstraction based on top of these functions, and
  * so they are not normally needed in GTK applications. See the "Drag and Drop"
  * section of the GTK documentation for more information.
  */
class Drag(raw: Ptr[GdkDrag]) extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Informs GDK that the drop ended.
    *
    * Passing %FALSE for @success may trigger a drag cancellation animation.
    *
    * This function is called by the drag source, and should be the last call
    * before dropping the reference to the @drag.
    *
    * The `GdkDrag` will only take the first [method@Gdk.Drag.drop_done] call as
    * effective, if this function is called multiple times, all subsequent calls
    * will be ignored.
    */
  def dropDone(
      success: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gdk_drag_drop_done(
    this.raw.asInstanceOf[Ptr[GdkDrag]],
    gboolean(gint((if success == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Determines the bitmask of possible actions proposed by the source.
    */
  def getActions(): DragAction /* None */ = DragAction.fromRaw(
    gdk_drag_get_actions(this.raw.asInstanceOf[Ptr[GdkDrag]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the `GdkContentProvider` associated to the `GdkDrag` object.
    */
  def getContent(): ContentProvider /* None */ = new ContentProvider(
    gdk_drag_get_content(this.raw.asInstanceOf[Ptr[GdkDrag]]).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the `GdkDevice` associated to the `GdkDrag` object.
    */
  def getDevice(): Device /* None */ = new Device(
    gdk_drag_get_device(this.raw.asInstanceOf[Ptr[GdkDrag]]).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the `GdkDisplay` that the drag object was created for.
    */
  def getDisplay(): Display /* None */ = new Display(
    gdk_drag_get_display(this.raw.asInstanceOf[Ptr[GdkDrag]]).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the surface on which the drag icon should be rendered during the
    * drag operation.
    *
    * Note that the surface may not be available until the drag operation has
    * begun. GDK will move the surface in accordance with the ongoing drag
    * operation. The surface is owned by @drag and will be destroyed when the
    * drag operation is over.
    */
  def getDragSurface(): Surface /* None */ = new Surface(
    gdk_drag_get_drag_surface(this.raw.asInstanceOf[Ptr[GdkDrag]]).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the formats supported by this `GdkDrag` object.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(ContentFormats), @type -> DataRecord(GdkContentFormats*)))"
  )
  def getFormats__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Determines the action chosen by the drag destination.
    */
  def getSelectedAction(): DragAction /* None */ = DragAction.fromRaw(
    gdk_drag_get_selected_action(this.raw.asInstanceOf[Ptr[GdkDrag]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the `GdkSurface` where the drag originates.
    */
  def getSurface(): Surface /* None */ = new Surface(
    gdk_drag_get_surface(this.raw.asInstanceOf[Ptr[GdkDrag]]).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the position of the drag surface that will be kept under the cursor
    * hotspot.
    *
    * Initially, the hotspot is at the top left corner of the drag surface.
    */
  def setHotspot(
      hot_x: Int /* Some(CInt) */,
      hot_y: Int /* Some(CInt) */
  ): Unit /* None */ =
    gdk_drag_set_hotspot(this.raw.asInstanceOf[Ptr[GdkDrag]], hot_x, hot_y)

end Drag

object Drag:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Starts a drag and creates a new drag context for it.
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
    */
  def begin(
      surface: Surface /* Some(Ptr[GdkSurface]) */,
      device: Device /* Some(Ptr[GdkDevice]) */,
      content: ContentProvider /* Some(Ptr[GdkContentProvider]) */,
      actions: DragAction /* Some(GdkDragAction) */,
      dx: Double /* Some(Double) */,
      dy: Double /* Some(Double) */
  ): Drag /* Some(Ptr[GdkDrag]) */ = new Drag(
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
