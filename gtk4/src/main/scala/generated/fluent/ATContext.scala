package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.Display
import sn.gnome.glib.internal.{gchar, gpointer}
import sn.gnome.gobject.Object
import sn.gnome.gobject.internal.{
  GClosure,
  GClosureNotify,
  GConnectFlags,
  g_signal_connect_data
}
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.{Accessible, AccessibleRole}
import sn.gnome.gtk4.internal.GtkATContext
import sn.gnome.runtime.*

/** `GtkATContext` is an abstract class provided by GTK to communicate to
  * platform-specific assistive technologies API.
  *
  * Each platform supported by GTK implements a `GtkATContext` subclass, and is
  * responsible for updating the accessible state in response to state changes
  * in `GtkAccessible`.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ATContext private[gnome] (raw: Ptr[GtkATContext])
    extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Retrieves the `GtkAccessible` using this context.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getAccessible(): Accessible /* None */ =
    new Accessible.Abstract(
      gtk_at_context_get_accessible(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkATContext]]
      ).asInstanceOf
    )
  end getAccessible

  /** Retrieves the accessible role of this context.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getAccessibleRole(): AccessibleRole /* None */ =
    AccessibleRole.fromRaw(
      gtk_at_context_get_accessible_role(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkATContext]]
      )
    )
  end getAccessibleRole

  /** Emitted when the attributes of the accessible for the `GtkATContext`
    * instance change.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onStateChange(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkATContext],
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
    val signal = c"state-change"
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
  end onStateChange
end ATContext

object ATContext:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkATContext])(using Runtime) =
    summon[Runtime].getOrCreate[ATContext](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new ATContext(ptr)
    )

  /** Creates a new `GtkATContext` instance for the given accessible role,
    * accessible instance, and display connection.
    *
    * The `GtkATContext` implementation being instantiated will depend on the
    * platform.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def create(
      accessible_role: AccessibleRole /* Some(GtkAccessibleRole) */,
      accessible: Accessible /* Some(Ptr[GtkAccessible]) */,
      display: sn.gnome.gdk4.Display /* Some(Ptr[_root_.sn.gnome.gdk4.internal.GdkDisplay]) */
  )(using Runtime): ATContext =
    val raw: Ptr[Byte] = gtk_at_context_create(
      accessible_role.raw,
      accessible.getUnsafeRawPointer().asInstanceOf,
      display.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
    summon[Runtime]
      .getOrCreate[ATContext](raw, r => ATContext.applyUnsafe(r.asInstanceOf))
  end create
end ATContext
