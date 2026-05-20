package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.{gboolean, gchar, gint, gpointer}
import sn.gnome.gobject.internal.{
  GClosure,
  GClosureNotify,
  GConnectFlags,
  g_signal_connect_data
}
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.{
  Accessible,
  Buildable,
  Button,
  ConstraintTarget,
  MessageType,
  ResponseType,
  Widget
}
import sn.gnome.gtk4.internal.{GtkInfoBar, GtkResponseType}
import sn.gnome.runtime.*

/** `GtkInfoBar` can be used to show messages to the user without a dialog.
  *
  * ![An example GtkInfoBar](info-bar.png)
  *
  * It is often temporarily shown at the top or bottom of a document. In
  * contrast to [class@Gtk.Dialog], which has an action area at the bottom,
  * `GtkInfoBar` has an action area at the side.
  *
  * The API of `GtkInfoBar` is very similar to `GtkDialog`, allowing you to add
  * buttons to the action area with [method@Gtk.InfoBar.add_button] or
  * [ctor@Gtk.InfoBar.new_with_buttons]. The sensitivity of action widgets can
  * be controlled with [method@Gtk.InfoBar.set_response_sensitive].
  *
  * To add widgets to the main content area of a `GtkInfoBar`, use
  * [method@Gtk.InfoBar.add_child].
  *
  * Similar to [class@Gtk.MessageDialog], the contents of a `GtkInfoBar` can by
  * classified as error message, warning, informational message, etc, by using
  * [method@Gtk.InfoBar.set_message_type]. GTK may use the message type to
  * determine how the message is displayed.
  *
  * A simple example for using a `GtkInfoBar`:
  * ```c
  * GtkWidget *message_label;
  * GtkWidget *widget;
  * GtkWidget *grid;
  * GtkInfoBar *bar;
  *
  * // set up info bar
  * widget = gtk_info_bar_new ();
  * bar = GTK_INFO_BAR (widget);
  * grid = gtk_grid_new ();
  *
  * message_label = gtk_label_new ("");
  * gtk_info_bar_add_child (bar, message_label);
  * gtk_info_bar_add_button (bar,
  *                          _("_OK"),
  *                          GTK_RESPONSE_OK);
  * g_signal_connect (bar,
  *                   "response",
  *                   G_CALLBACK (gtk_widget_hide),
  *                   NULL);
  * gtk_grid_attach (GTK_GRID (grid),
  *                  widget,
  *                  0, 2, 1, 1);
  *
  * // ...
  *
  * // show an error message
  * gtk_label_set_text (GTK_LABEL (message_label), "An error occurred!");
  * gtk_info_bar_set_message_type (bar, GTK_MESSAGE_ERROR);
  * gtk_widget_show (bar);
  * ```
  *
  * # GtkInfoBar as GtkBuildable
  *
  * `GtkInfoBar` supports a custom `<action-widgets>` element, which can contain
  * multiple `<action-widget>` elements. The “response” attribute specifies a
  * numeric response, and the content of the element is the id of widget (which
  * should be a child of the dialogs @action_area).
  *
  * `GtkInfoBar` supports adding action widgets by specifying “action” as the
  * “type” attribute of a `<child>` element. The widget will be added either to
  * the action area. The response id has to be associated with the action widget
  * using the `<action-widgets>` element.
  *
  * # CSS nodes
  *
  * `GtkInfoBar` has a single CSS node with name infobar. The node may get one
  * of the style classes .info, .warning, .error or .question, depending on the
  * message type. If the info bar shows a close button, that button will have
  * the .close style class applied.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class InfoBar private[gnome] (raw: Ptr[GtkInfoBar])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Add an activatable widget to the action area of a `GtkInfoBar`.
    *
    * This also connects a signal handler that will emit the
    * [signal@Gtk.InfoBar::response] signal on the message area when the widget
    * is activated. The widget is appended to the end of the message areas
    * action area.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def addActionWidget(
      child: sn.gnome.gtk4.Widget /* Some(Ptr[GtkWidget]) */,
      response_id: sn.gnome.gtk4.ResponseType /* Some(CInt) */
  )(using Runtime): Unit /* None */ =
    gtk_info_bar_add_action_widget(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkInfoBar]],
      child.getUnsafeRawPointer().asInstanceOf,
      response_id.raw.value
    )
  end addActionWidget

  /** Adds a button with the given text.
    *
    * Clicking the button will emit the [signal@Gtk.InfoBar::response] signal
    * with the given response_id. The button is appended to the end of the info
    * bar's action area. The button widget is returned, but usually you don't
    * need it.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def addButton(
      button_text: scala.Predef.String /* Some(CString) */,
      response_id: sn.gnome.gtk4.ResponseType /* Some(CInt) */
  )(using Runtime): sn.gnome.gtk4.Button /* None */ =
    sn.gnome.gtk4.Button.applyUnsafe(
      gtk_info_bar_add_button(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkInfoBar]],
        summon[Runtime].inZone(toCString(button_text)),
        response_id.raw.value
      ).asInstanceOf
    )
  end addButton

  /** Adds multiple buttons.
    *
    * This is the same as calling [method@Gtk.InfoBar.add_button] repeatedly.
    * The variable argument list should be %NULL-terminated as with
    * [ctor@Gtk.InfoBar.new_with_buttons]. Each button must have both text and
    * response ID.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method add_buttons/<method parameters>]: Vararg parameters require inlining which doesn't work with overriding"
  )
  private def addButtons__ = ???

  /** Adds a widget to the content area of the info bar.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def addChild(
      widget: sn.gnome.gtk4.Widget /* Some(Ptr[GtkWidget]) */
  )(using Runtime): Unit /* None */ =
    gtk_info_bar_add_child(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkInfoBar]],
      widget.getUnsafeRawPointer().asInstanceOf
    )
  end addChild

  /** Returns the message type of the message area.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getMessageType(): sn.gnome.gtk4.MessageType /* None */ =
    sn.gnome.gtk4.MessageType.fromRaw(
      gtk_info_bar_get_message_type(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkInfoBar]]
      )
    )
  end getMessageType

  /** Returns whether the info bar is currently revealed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getRevealed(): Boolean /* None */ =
    gtk_info_bar_get_revealed(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkInfoBar]]
    ).value.!=(0)
  end getRevealed

  /** Returns whether the widget will display a standard close button.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getShowCloseButton(): Boolean /* None */ =
    gtk_info_bar_get_show_close_button(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkInfoBar]]
    ).value.!=(0)
  end getShowCloseButton

  /** Removes a widget from the action area of @info_bar.
    *
    * The widget must have been put there by a call to
    * [method@Gtk.InfoBar.add_action_widget] or [method@Gtk.InfoBar.add_button].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def removeActionWidget(
      widget: sn.gnome.gtk4.Widget /* Some(Ptr[GtkWidget]) */
  )(using Runtime): Unit /* None */ =
    gtk_info_bar_remove_action_widget(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkInfoBar]],
      widget.getUnsafeRawPointer().asInstanceOf
    )
  end removeActionWidget

  /** Removes a widget from the content area of the info bar.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def removeChild(
      widget: sn.gnome.gtk4.Widget /* Some(Ptr[GtkWidget]) */
  )(using Runtime): Unit /* None */ =
    gtk_info_bar_remove_child(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkInfoBar]],
      widget.getUnsafeRawPointer().asInstanceOf
    )
  end removeChild

  /** Emits the “response” signal with the given @response_id.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def response(
      response_id: sn.gnome.gtk4.ResponseType /* Some(CInt) */
  ): Unit /* None */ =
    gtk_info_bar_response(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkInfoBar]],
      response_id.raw.value
    )
  end response

  /** Sets the last widget in the info bar’s action area with the given
    * response_id as the default widget for the dialog.
    *
    * Pressing “Enter” normally activates the default widget.
    *
    * Note that this function currently requires @info_bar to be added to a
    * widget hierarchy.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setDefaultResponse(
      response_id: sn.gnome.gtk4.ResponseType /* Some(CInt) */
  ): Unit /* None */ =
    gtk_info_bar_set_default_response(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkInfoBar]],
      response_id.raw.value
    )
  end setDefaultResponse

  /** Sets the message type of the message area.
    *
    * GTK uses this type to determine how the message is displayed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setMessageType(
      message_type: sn.gnome.gtk4.MessageType /* Some(GtkMessageType) */
  ): Unit /* None */ =
    gtk_info_bar_set_message_type(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkInfoBar]],
      message_type.raw
    )
  end setMessageType

  /** Sets the sensitivity of action widgets for @response_id.
    *
    * Calls `gtk_widget_set_sensitive (widget, setting)` for each widget in the
    * info bars’s action area with the given @response_id. A convenient way to
    * sensitize/desensitize buttons.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setResponseSensitive(
      response_id: sn.gnome.gtk4.ResponseType /* Some(CInt) */,
      setting: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_info_bar_set_response_sensitive(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkInfoBar]],
      response_id.raw.value,
      gboolean(gint((if setting == true then 1 else 0)))
    )
  end setResponseSensitive

  /** Sets whether the `GtkInfoBar` is revealed.
    *
    * Changing this will make @info_bar reveal or conceal itself via a sliding
    * transition.
    *
    * Note: this does not show or hide @info_bar in the
    * [property@Gtk.Widget:visible] sense, so revealing has no effect if
    * [property@Gtk.Widget:visible] is %FALSE.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setRevealed(
      revealed: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_info_bar_set_revealed(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkInfoBar]],
      gboolean(gint((if revealed == true then 1 else 0)))
    )
  end setRevealed

  /** If true, a standard close button is shown.
    *
    * When clicked it emits the response %GTK_RESPONSE_CLOSE.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setShowCloseButton(
      setting: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_info_bar_set_show_close_button(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkInfoBar]],
      gboolean(gint((if setting == true then 1 else 0)))
    )
  end setShowCloseButton

  /** Gets emitted when the user uses a keybinding to dismiss the info bar.
    *
    * The ::close signal is a [keybinding signal](class.SignalAction.html).
    *
    * The default binding for this signal is the Escape key.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onClose(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkInfoBar],
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
    val signal = c"close"
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
  end onClose

  /** Emitted when an action widget is clicked.
    *
    * The signal is also emitted when the application programmer calls
    * [method@Gtk.InfoBar.response]. The @response_id depends on which action
    * widget was clicked.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onResponse(handler: ((responseId: ResponseType)) => Unit)(using Runtime) =
    type SignalRegType =
      SignalRegistration[this.type, (responseId: ResponseType), Unit]
    val c_handler = CFuncPtr3.fromScalaFunction {
      (
          self: Ptr[GtkInfoBar],
          responseId: GtkResponseType /* param */,
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler((responseId = ResponseType.fromRaw(responseId)))
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
    val signal = c"response"
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
  end onResponse
end InfoBar

object InfoBar:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkInfoBar])(using Runtime) = summon[Runtime]
    .getOrCreate[InfoBar](ptr.asInstanceOf[Ptr[Byte]], p => new InfoBar(ptr))

  /** Creates a new `GtkInfoBar` object.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply()(using Runtime): InfoBar =
    val raw: Ptr[Byte] = gtk_info_bar_new().asInstanceOf
    summon[Runtime]
      .getOrCreate[InfoBar](raw, r => InfoBar.applyUnsafe(r.asInstanceOf))
  end apply

  /** Creates a new `GtkInfoBar` with buttons.
    *
    * Button text/response ID pairs should be listed, with a %NULL pointer
    * ending the list. A response ID can be any positive number, or one of the
    * values in the `GtkResponseType` enumeration. If the user clicks one of
    * these dialog buttons, GtkInfoBar will emit the
    * [signal@Gtk.InfoBar::response] signal with the corresponding response ID.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  inline def withButtons(
      first_button_text: Option[scala.Predef.String /* Some(CString) */ ],
      args: Any*
  )(using Runtime): InfoBar =
    val raw: Ptr[Byte] = gtk_info_bar_new_with_buttons(
      first_button_text
        .map[CString](o => summon[Runtime].inZone(toCString(o)))
        .getOrElse(null.asInstanceOf[CString]),
      args*
    ).asInstanceOf
    summon[Runtime]
      .getOrCreate[InfoBar](raw, r => InfoBar.applyUnsafe(r.asInstanceOf))
  end withButtons
end InfoBar
