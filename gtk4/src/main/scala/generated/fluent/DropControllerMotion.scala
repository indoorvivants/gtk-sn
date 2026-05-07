package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.fluent.Drop
import sn.gnome.glib.internal.{gboolean, gchar, gint, gpointer}
import sn.gnome.gobject.internal.{
  GClosure,
  GClosureNotify,
  GConnectFlags,
  g_signal_connect_data
}
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.fluent.EventController
import sn.gnome.gtk4.internal.GtkDropControllerMotion
import sn.gnome.runtime.*

/** `GtkDropControllerMotion` is an event controller tracking the pointer during
  * Drag-and-Drop operations.
  *
  * It is modeled after [class@Gtk.EventControllerMotion] so if you have used
  * that, this should feel really familiar.
  *
  * This controller is not able to accept drops, use [class@Gtk.DropTarget] for
  * that purpose.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class DropControllerMotion(raw: Ptr[GtkDropControllerMotion])
    extends EventController(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Returns if a Drag-and-Drop operation is within the widget
    * @self
    *   or one of its children.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def containsPointer(): Boolean /* None */ =
    gtk_drop_controller_motion_contains_pointer(
      this.raw.asInstanceOf[Ptr[GtkDropControllerMotion]]
    ).value.!=(0)

  /** Returns the `GdkDrop` of a current Drag-and-Drop operation over the widget
    * of @self.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDrop(): Drop /* None */ = new Drop(
    gtk_drop_controller_motion_get_drop(
      this.raw.asInstanceOf[Ptr[GtkDropControllerMotion]]
    ).asInstanceOf
  )

  /** Returns if a Drag-and-Drop operation is within the widget
    * @self,
    *   not one of its children.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isPointer(): Boolean /* None */ = gtk_drop_controller_motion_is_pointer(
    this.raw.asInstanceOf[Ptr[GtkDropControllerMotion]]
  ).value.!=(0)

  /** Signals that the pointer has entered the widget.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal enter]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(gdouble), @type -> DataRecord(gdouble)))"
  )
  private def onEnter = ???

  /** Signals that the pointer has left the widget.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onLeave(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkDropControllerMotion],
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

  /** Emitted when the pointer moves inside the widget.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal motion]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(gdouble), @type -> DataRecord(gdouble)))"
  )
  private def onMotion = ???

end DropControllerMotion

object DropControllerMotion:
  /** Creates a new event controller that will handle pointer motion events
    * during drag and drop.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(): DropControllerMotion = new DropControllerMotion(
    gtk_drop_controller_motion_new().asInstanceOf
  )
end DropControllerMotion
