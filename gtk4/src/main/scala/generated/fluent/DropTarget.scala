package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.{DragAction, Drop}
import sn.gnome.gdk4.internal.GdkDrop
import sn.gnome.glib.internal.{gboolean, gchar, gint, gpointer}
import sn.gnome.gobject.Value
import sn.gnome.gobject.internal.{
  GClosure,
  GClosureNotify,
  GConnectFlags,
  GType,
  g_signal_connect_data
}
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.EventController
import sn.gnome.gtk4.internal.GtkDropTarget
import sn.gnome.runtime.*

/** `GtkDropTarget` is an event controller to receive Drag-and-Drop operations.
  *
  * The most basic way to use a `GtkDropTarget` to receive drops on a widget is
  * to create it via [ctor@Gtk.DropTarget.new], passing in the `GType` of the
  * data you want to receive and connect to the [signal@Gtk.DropTarget::drop]
  * signal to receive the data:
  *
  * ```c
  * static gboolean
  * on_drop (GtkDropTarget *target,
  *          const GValue  *value,
  *          double         x,
  *          double         y,
  *          gpointer       data)
  * {
  *   MyWidget *self = data;
  *
  *   // Call the appropriate setter depending on the type of data
  *   // that we received
  *   if (G_VALUE_HOLDS (value, G_TYPE_FILE))
  *     my_widget_set_file (self, g_value_get_object (value));
  *   else if (G_VALUE_HOLDS (value, GDK_TYPE_PIXBUF))
  *     my_widget_set_pixbuf (self, g_value_get_object (value));
  *   else
  *     return FALSE;
  *
  *   return TRUE;
  * }
  *
  * static void
  * my_widget_init (MyWidget *self)
  * {
  *   GtkDropTarget *target =
  *     gtk_drop_target_new (G_TYPE_INVALID, GDK_ACTION_COPY);
  *
  *   // This widget accepts two types of drop types: GFile objects
  *   // and GdkPixbuf objects
  *   gtk_drop_target_set_gtypes (target, (GTypes [2]) {
  *     G_TYPE_FILE,
  *     GDK_TYPE_PIXBUF,
  *   }, 2);
  *
  *   g_signal_connect (target, "drop", G_CALLBACK (on_drop), self);
  *   gtk_widget_add_controller (GTK_WIDGET (self), GTK_EVENT_CONTROLLER (target));
  * }
  * ```
  *
  * `GtkDropTarget` supports more options, such as:
  *
  * * rejecting potential drops via the [signal@Gtk.DropTarget::accept] signal
  * and the [method@Gtk.DropTarget.reject] function to let other drop targets
  * handle the drop * tracking an ongoing drag operation before the drop via the
  * [signal@Gtk.DropTarget::enter], [signal@Gtk.DropTarget::motion] and
  * [signal@Gtk.DropTarget::leave] signals * configuring how to receive data by
  * setting the [property@Gtk.DropTarget:preload] property and listening for its
  * availability via the [property@Gtk.DropTarget:value] property
  *
  * However, `GtkDropTarget` is ultimately modeled in a synchronous way and only
  * supports data transferred via `GType`. If you want full control over an
  * ongoing drop, the [class@Gtk.DropTargetAsync] object gives you this ability.
  *
  * While a pointer is dragged over the drop target's widget and the drop has
  * not been rejected, that widget will receive the %GTK_STATE_FLAG_DROP_ACTIVE
  * state, which can be used to style the widget.
  *
  * If you are not interested in receiving the drop, but just want to update UI
  * state during a Drag-and-Drop operation (e.g. switching tabs), you can use
  * [class@Gtk.DropControllerMotion].
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class DropTarget private[gnome] (raw: Ptr[GtkDropTarget])
    extends EventController(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets the actions that this drop target supports.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getActions(): DragAction /* None */ =
    DragAction.fromRaw(
      gtk_drop_target_get_actions(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkDropTarget]]
      )
    )
  end getActions

  /** Gets the currently handled drop operation.
    *
    * If no drop operation is going on, %NULL is returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getCurrentDrop()(using Runtime): sn.gnome.gdk4.Drop /* None */ =
    sn.gnome.gdk4.Drop.applyUnsafe(
      gtk_drop_target_get_current_drop(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkDropTarget]]
      ).asInstanceOf
    )
  end getCurrentDrop

  /** Gets the currently handled drop operation.
    *
    * If no drop operation is going on, %NULL is returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDrop()(using Runtime): sn.gnome.gdk4.Drop /* None */ =
    sn.gnome.gdk4.Drop.applyUnsafe(
      gtk_drop_target_get_drop(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkDropTarget]]
      ).asInstanceOf
    )
  end getDrop

  /** Gets the data formats that this drop target accepts.
    *
    * If the result is %NULL, all formats are expected to be supported.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_formats/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Gdk.ContentFormats), @type -> DataRecord(GdkContentFormats*)))"
  )
  private def getFormats__ = ???

  /** Gets the list of supported `GType`s that can be dropped on the target.
    *
    * If no types have been set, `NULL` will be returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_gtypes]: Method get_gtypes contains an OUT parameter, which is not supported yet"
  )
  private def getGtypes__ = ???

  /** Gets whether data should be preloaded on hover.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPreload(): Boolean /* None */ =
    gtk_drop_target_get_preload(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkDropTarget]]
    ).value.!=(0)
  end getPreload

  /** Gets the current drop data, as a `GValue`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getValue()(using Runtime): Value /* None */ =
    Value.fromRaw(
      gtk_drop_target_get_value(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkDropTarget]]
      )
    )
  end getValue

  /** Rejects the ongoing drop operation.
    *
    * If no drop operation is ongoing, i.e when
    * [property@Gtk.DropTarget:current-drop] is %NULL, this function does
    * nothing.
    *
    * This function should be used when delaying the decision on whether to
    * accept a drag or not until after reading the data.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def reject(): Unit /* None */ =
    gtk_drop_target_reject(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkDropTarget]]
    )
  end reject

  /** Sets the actions that this drop target supports.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setActions(
      actions: DragAction /* Some(_root_.sn.gnome.gdk4.internal.GdkDragAction) */
  ): Unit /* None */ =
    gtk_drop_target_set_actions(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkDropTarget]],
      actions.raw
    )
  end setActions

  /** Sets the supported `GTypes` for this drop target.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_gtypes/<method parameters>/types]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(GType), @type -> DataRecord(GType)))),ListMap(@zero-terminated -> DataRecord(0), @length -> DataRecord(1), @type -> DataRecord(GType*)))"
  )
  private def setGtypes__ = ???

  /** Sets whether data should be preloaded on hover.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setPreload(
      preload: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_drop_target_set_preload(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkDropTarget]],
      gboolean(gint((if preload == true then 1 else 0)))
    )
  end setPreload

  /** Emitted on the drop site when a drop operation is about to begin.
    *
    * If the drop is not accepted, %FALSE will be returned and the drop target
    * will ignore the drop. If %TRUE is returned, the drop is accepted for now
    * but may be rejected later via a call to [method@Gtk.DropTarget.reject] or
    * ultimately by returning %FALSE from a [signal@Gtk.DropTarget::drop]
    * handler.
    *
    * The default handler for this signal decides whether to accept the drop
    * based on the formats provided by the @drop.
    *
    * If the decision whether the drop will be accepted or rejected depends on
    * the data, this function should return %TRUE, the
    * [property@Gtk.DropTarget:preload] property should be set and the value
    * should be inspected via the ::notify:value signal, calling
    * [method@Gtk.DropTarget.reject] if required.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onAccept(handler: ((drop: Drop)) => Boolean)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, (drop: Drop), Boolean]
    val c_handler = CFuncPtr3.fromScalaFunction {
      (
          self: Ptr[GtkDropTarget],
          drop: Ptr[GdkDrop] /* param */,
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler((drop = sr.runtime.get[Drop](drop.asInstanceOf[Ptr[Byte]])))
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
    val signal = c"accept"
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
  end onAccept

  /** Emitted on the drop site when the user drops the data onto the widget.
    *
    * The signal handler must determine whether the pointer position is in a
    * drop zone or not. If it is not in a drop zone, it returns %FALSE and no
    * further processing is necessary.
    *
    * Otherwise, the handler returns %TRUE. In this case, this handler will
    * accept the drop. The handler is responsible for using the given @value and
    * performing the drop operation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal drop]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(GObject.Value)))"
  )
  private def onDrop = ???

  /** Emitted on the drop site when the pointer enters the widget.
    *
    * It can be used to set up custom highlighting.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal enter]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(gdouble), @type -> DataRecord(gdouble)))"
  )
  private def onEnter = ???

  /** Emitted on the drop site when the pointer leaves the widget.
    *
    * Its main purpose it to undo things done in [signal@Gtk.DropTarget::enter].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onLeave(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkDropTarget],
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
    val signal = c"leave"
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
  end onLeave

  /** Emitted while the pointer is moving over the drop target.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal motion]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(gdouble), @type -> DataRecord(gdouble)))"
  )
  private def onMotion = ???

end DropTarget

object DropTarget:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkDropTarget])(using Runtime) =
    summon[Runtime].getOrCreate[DropTarget](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new DropTarget(ptr)
    )

  /** Creates a new `GtkDropTarget` object.
    *
    * If the drop target should support more than 1 type, pass %G_TYPE_INVALID
    * for @type and then call [method@Gtk.DropTarget.set_gtypes].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      `type`: GType /* Some(_root_.sn.gnome.gobject.internal.GType) */,
      actions: DragAction /* Some(_root_.sn.gnome.gdk4.internal.GdkDragAction) */
  )(using Runtime): DropTarget =
    val raw: Ptr[Byte] = gtk_drop_target_new(`type`, actions.raw).asInstanceOf
    summon[Runtime]
      .getOrCreate[DropTarget](raw, r => DropTarget.applyUnsafe(r.asInstanceOf))
  end apply
end DropTarget
