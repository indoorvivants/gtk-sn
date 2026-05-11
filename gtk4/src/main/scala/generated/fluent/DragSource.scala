package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.fluent.{
  ContentProvider,
  Drag,
  DragAction,
  DragCancelReason,
  Paintable
}
import sn.gnome.gdk4.internal.{GdkDrag, GdkDragCancelReason}
import sn.gnome.glib.internal.{gchar, gpointer}
import sn.gnome.gobject.internal.{
  GClosure,
  GClosureNotify,
  GConnectFlags,
  g_signal_connect_data
}
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.fluent.GestureSingle
import sn.gnome.gtk4.internal.GtkDragSource
import sn.gnome.runtime.*

/** `GtkDragSource` is an event controller to initiate Drag-And-Drop operations.
  *
  * `GtkDragSource` can be set up with the necessary ingredients for a DND
  * operation ahead of time. This includes the source for the data that is being
  * transferred, in the form of a [class@Gdk.ContentProvider], the desired
  * action, and the icon to use during the drag operation. After setting it up,
  * the drag source must be added to a widget as an event controller, using
  * [method@Gtk.Widget.add_controller].
  *
  * ```c
  * static void
  * my_widget_init (MyWidget *self)
  * {
  *   GtkDragSource *drag_source = gtk_drag_source_new ();
  *
  *   g_signal_connect (drag_source, "prepare", G_CALLBACK (on_drag_prepare), self);
  *   g_signal_connect (drag_source, "drag-begin", G_CALLBACK (on_drag_begin), self);
  *
  *   gtk_widget_add_controller (GTK_WIDGET (self), GTK_EVENT_CONTROLLER (drag_source));
  * }
  * ```
  *
  * Setting up the content provider and icon ahead of time only makes sense when
  * the data does not change. More commonly, you will want to set them up just
  * in time. To do so, `GtkDragSource` has [signal@Gtk.DragSource::prepare] and
  * [signal@Gtk.DragSource::drag-begin] signals.
  *
  * The ::prepare signal is emitted before a drag is started, and can be used to
  * set the content provider and actions that the drag should be started with.
  *
  * ```c
  * static GdkContentProvider *
  * on_drag_prepare (GtkDragSource *source,
  *                  double         x,
  *                  double         y,
  *                  MyWidget      *self)
  * {
  *   // This widget supports two types of content: GFile objects
  *   // and GdkPixbuf objects; GTK will handle the serialization
  *   // of these types automatically
  *   GFile *file = my_widget_get_file (self);
  *   GdkPixbuf *pixbuf = my_widget_get_pixbuf (self);
  *
  *   return gdk_content_provider_new_union ((GdkContentProvider *[2]) {
  *       gdk_content_provider_new_typed (G_TYPE_FILE, file),
  *       gdk_content_provider_new_typed (GDK_TYPE_PIXBUF, pixbuf),
  *     }, 2);
  * }
  * ```
  *
  * The ::drag-begin signal is emitted after the `GdkDrag` object has been
  * created, and can be used to set up the drag icon.
  *
  * ```c
  * static void
  * on_drag_begin (GtkDragSource *source,
  *                GdkDrag       *drag,
  *                MyWidget      *self)
  * {
  *   // Set the widget as the drag icon
  *   GdkPaintable *paintable = gtk_widget_paintable_new (GTK_WIDGET (self));
  *   gtk_drag_source_set_icon (source, paintable, 0, 0);
  *   g_object_unref (paintable);
  * }
  * ```
  *
  * During the DND operation, `GtkDragSource` emits signals that can be used to
  * obtain updates about the status of the operation, but it is not normally
  * necessary to connect to any signals, except for one case: when the supported
  * actions include %GDK_ACTION_MOVE, you need to listen for the
  * [signal@Gtk.DragSource::drag-end] signal and delete the data after it has
  * been transferred.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class DragSource private[gnome] (raw: Ptr[GtkDragSource])
    extends GestureSingle(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Cancels a currently ongoing drag operation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def dragCancel(): Unit /* None */ =
    gtk_drag_source_drag_cancel(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkDragSource]]
    )
  end dragCancel

  /** Gets the actions that are currently set on the `GtkDragSource`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getActions(): DragAction /* None */ =
    DragAction.fromRaw(
      gtk_drag_source_get_actions(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkDragSource]]
      )
    )
  end getActions

  /** Gets the current content provider of a `GtkDragSource`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getContent()(using
      Runtime
  ): sn.gnome.gdk4.fluent.ContentProvider /* None */ =
    sn.gnome.gdk4.fluent.ContentProvider.applyUnsafe(
      gtk_drag_source_get_content(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkDragSource]]
      ).asInstanceOf
    )
  end getContent

  /** Returns the underlying `GdkDrag` object for an ongoing drag.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDrag()(using Runtime): sn.gnome.gdk4.fluent.Drag /* None */ =
    sn.gnome.gdk4.fluent.Drag.applyUnsafe(
      gtk_drag_source_get_drag(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkDragSource]]
      ).asInstanceOf
    )
  end getDrag

  /** Sets the actions on the `GtkDragSource`.
    *
    * During a DND operation, the actions are offered to potential drop targets.
    * If @actions include %GDK_ACTION_MOVE, you need to listen to the
    * [signal@Gtk.DragSource::drag-end] signal and handle @delete_data being
    * %TRUE.
    *
    * This function can be called before a drag is started, or in a handler for
    * the [signal@Gtk.DragSource::prepare] signal.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setActions(
      actions: DragAction /* Some(_root_.sn.gnome.gdk4.internal.GdkDragAction) */
  ): Unit /* None */ =
    gtk_drag_source_set_actions(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkDragSource]],
      actions.raw
    )
  end setActions

  /** Sets a content provider on a `GtkDragSource`.
    *
    * When the data is requested in the cause of a DND operation, it will be
    * obtained from the content provider.
    *
    * This function can be called before a drag is started, or in a handler for
    * the [signal@Gtk.DragSource::prepare] signal.
    *
    * You may consider setting the content provider back to %NULL in a
    * [signal@Gtk.DragSource::drag-end] signal handler.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setContent(
      content: Option[
        sn.gnome.gdk4.fluent.ContentProvider /* Some(Ptr[_root_.sn.gnome.gdk4.internal.GdkContentProvider]) */
      ]
  )(using Runtime): Unit /* None */ =
    gtk_drag_source_set_content(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkDragSource]],
      content
        .map[Ptr[_root_.sn.gnome.gdk4.internal.GdkContentProvider]](o =>
          o.getUnsafeRawPointer().asInstanceOf
        )
        .getOrElse(
          null
            .asInstanceOf[Ptr[_root_.sn.gnome.gdk4.internal.GdkContentProvider]]
        )
    )
  end setContent

  /** Sets a paintable to use as icon during DND operations.
    *
    * The hotspot coordinates determine the point on the icon that gets aligned
    * with the hotspot of the cursor.
    *
    * If @paintable is %NULL, a default icon is used.
    *
    * This function can be called before a drag is started, or in a
    * [signal@Gtk.DragSource::prepare] or [signal@Gtk.DragSource::drag-begin]
    * signal handler.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setIcon(
      paintable: Option[
        Paintable /* Some(Ptr[_root_.sn.gnome.gdk4.internal.GdkPaintable]) */
      ],
      hot_x: Int /* Some(CInt) */,
      hot_y: Int /* Some(CInt) */
  ): Unit /* None */ =
    gtk_drag_source_set_icon(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkDragSource]],
      paintable
        .map[Ptr[_root_.sn.gnome.gdk4.internal.GdkPaintable]](o =>
          o.getUnsafeRawPointer().asInstanceOf
        )
        .getOrElse(
          null.asInstanceOf[Ptr[_root_.sn.gnome.gdk4.internal.GdkPaintable]]
        ),
      hot_x,
      hot_y
    )
  end setIcon

  /** Emitted on the drag source when a drag is started.
    *
    * It can be used to e.g. set a custom drag icon with
    * [method@Gtk.DragSource.set_icon].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onDragBegin(handler: ((drag: Drag)) => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, (drag: Drag), Unit]
    val c_handler = CFuncPtr3.fromScalaFunction {
      (
          self: Ptr[GtkDragSource],
          drag: Ptr[GdkDrag] /* param */,
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler((drag = sr.runtime.get[Drag](drag.asInstanceOf[Ptr[Byte]])))
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
    val signal = c"drag-begin"
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
  end onDragBegin

  /** Emitted on the drag source when a drag has failed.
    *
    * The signal handler may handle a failed drag operation based on the type of
    * error. It should return %TRUE if the failure has been handled and the
    * default "drag operation failed" animation should not be shown.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onDragCancel(
      handler: ((drag: Drag, reason: DragCancelReason)) => Boolean
  )(using Runtime) =
    type SignalRegType = SignalRegistration[
      this.type,
      (drag: Drag, reason: DragCancelReason),
      Boolean
    ]
    val c_handler = CFuncPtr4.fromScalaFunction {
      (
          self: Ptr[GtkDragSource],
          drag: Ptr[GdkDrag] /* param */,
          reason: GdkDragCancelReason /* param */,
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(
          (
            drag = sr.runtime.get[Drag](drag.asInstanceOf[Ptr[Byte]]),
            reason = DragCancelReason.fromRaw(reason)
          )
        )
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
    val signal = c"drag-cancel"
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
  end onDragCancel

  /** Emitted on the drag source when a drag is finished.
    *
    * A typical reason to connect to this signal is to undo things done in
    * [signal@Gtk.DragSource::prepare] or [signal@Gtk.DragSource::drag-begin]
    * handlers.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onDragEnd(handler: ((drag: Drag, deleteData: Boolean)) => Unit)(using
      Runtime
  ) =
    type SignalRegType =
      SignalRegistration[this.type, (drag: Drag, deleteData: Boolean), Unit]
    val c_handler = CFuncPtr4.fromScalaFunction {
      (
          self: Ptr[GtkDragSource],
          drag: Ptr[GdkDrag] /* param */,
          deleteData: Boolean /* param */,
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(
          (
            drag = sr.runtime.get[Drag](drag.asInstanceOf[Ptr[Byte]]),
            deleteData = deleteData
          )
        )
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
    val signal = c"drag-end"
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
  end onDragEnd

  /** Emitted when a drag is about to be initiated.
    *
    * It returns the `GdkContentProvider` to use for the drag that is about to
    * start. The default handler for this signal returns the value of the
    * [property@Gtk.DragSource:content] property, so if you set up that property
    * ahead of time, you don't need to connect to this signal.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal prepare]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(gdouble), @type -> DataRecord(gdouble)))"
  )
  private def onPrepare = ???

end DragSource

object DragSource:
  def applyUnsafe(ptr: Ptr[GtkDragSource])(using Runtime) =
    summon[Runtime].getOrCreate[DragSource](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new DragSource(ptr)
    )

  /** Creates a new `GtkDragSource` object.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply()(using Runtime): DragSource =
    val raw: Ptr[Byte] = gtk_drag_source_new().asInstanceOf
    summon[Runtime]
      .getOrCreate[DragSource](raw, r => DragSource.applyUnsafe(r.asInstanceOf))
  end apply
end DragSource
