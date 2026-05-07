package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gdk4.fluent.ModifierType
import sn.gnome.gdk4.internal.GdkModifierType
import sn.gnome.glib.internal.{gboolean, gchar, gint, gpointer, guint}
import sn.gnome.gobject.internal.{
  GClosure,
  GClosureNotify,
  GConnectFlags,
  g_signal_connect_data
}
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.fluent.{EventController, IMContext, Widget}
import sn.gnome.gtk4.internal.GtkEventControllerKey
import sn.gnome.runtime.*

/** `GtkEventControllerKey` is an event controller that provides access to key
  * events.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class EventControllerKey(raw: Ptr[GtkEventControllerKey])
    extends EventController(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Forwards the current event of this @controller to a @widget.
    *
    * This function can only be used in handlers for the
    * [signal@Gtk.EventControllerKey::key-pressed],
    * [signal@Gtk.EventControllerKey::key-released] or
    * [signal@Gtk.EventControllerKey::modifiers] signals.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def forward(widget: Widget /* Some(Ptr[GtkWidget]) */ ): Boolean /* None */ =
    gtk_event_controller_key_forward(
      this.raw.asInstanceOf[Ptr[GtkEventControllerKey]],
      widget.getUnsafeRawPointer().asInstanceOf
    ).value.!=(0)

  /** Gets the key group of the current event of this @controller.
    *
    * See [method@Gdk.KeyEvent.get_layout].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getGroup(): UInt /* None */ = gtk_event_controller_key_get_group(
    this.raw.asInstanceOf[Ptr[GtkEventControllerKey]]
  ).value

  /** Gets the input method context of the key @controller.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getImContext(): IMContext /* None */ = new IMContext(
    gtk_event_controller_key_get_im_context(
      this.raw.asInstanceOf[Ptr[GtkEventControllerKey]]
    ).asInstanceOf
  )

  /** Sets the input method context of the key @controller.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setImContext(
      im_context: Option[IMContext /* Some(Ptr[GtkIMContext]) */ ]
  ): Unit /* None */ = gtk_event_controller_key_set_im_context(
    this.raw.asInstanceOf[Ptr[GtkEventControllerKey]],
    im_context
      .map[Ptr[GtkIMContext]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkIMContext]])
  )

  /** Emitted whenever the input method context filters away a keypress and
    * prevents the @controller receiving it.
    *
    * See [method@Gtk.EventControllerKey.set_im_context] and
    * [method@Gtk.IMContext.filter_keypress].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onImUpdate(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkEventControllerKey],
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
    val signal = c"im-update"
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
  end onImUpdate

  /** Emitted whenever a key is pressed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal key-pressed]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(guint), @type -> DataRecord(guint)))"
  )
  private def onKeyPressed = ???

  /** Emitted whenever a key is released.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal key-released]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(guint), @type -> DataRecord(guint)))"
  )
  private def onKeyReleased = ???

  /** Emitted whenever the state of modifier keys and pointer buttons change.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onModifiers(handler: ((state: ModifierType)) => Boolean)(using Runtime) =
    type SignalRegType =
      SignalRegistration[this.type, (state: ModifierType), Boolean]
    val c_handler = CFuncPtr3.fromScalaFunction {
      (
          self: Ptr[GtkEventControllerKey],
          state: GdkModifierType /* param */,
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler((state = ModifierType.fromRaw(state)))
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
    val signal = c"modifiers"
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
  end onModifiers
end EventControllerKey

object EventControllerKey:
  /** Creates a new event controller that will handle key events.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(): EventControllerKey = new EventControllerKey(
    gtk_event_controller_key_new().asInstanceOf
  )
end EventControllerKey
