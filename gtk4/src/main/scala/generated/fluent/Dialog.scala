package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.Display
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
  Box,
  Buildable,
  ConstraintTarget,
  DialogFlags,
  HeaderBar,
  Native,
  ResponseType,
  Root,
  ShortcutManager,
  Widget,
  Window
}
import sn.gnome.gtk4.internal.{
  GtkDialog,
  GtkNative,
  GtkResponseType,
  GtkRoot,
  GtkWindow
}
import sn.gnome.runtime.*

/** Dialogs are a convenient way to prompt the user for a small amount of input.
  *
  * ![An example GtkDialog](dialog.png)
  *
  * Typical uses are to display a message, ask a question, or anything else that
  * does not require extensive effort on the user’s part.
  *
  * The main area of a `GtkDialog` is called the "content area", and is yours to
  * populate with widgets such a `GtkLabel` or `GtkEntry`, to present your
  * information, questions, or tasks to the user.
  *
  * In addition, dialogs allow you to add "action widgets". Most commonly,
  * action widgets are buttons. Depending on the platform, action widgets may be
  * presented in the header bar at the top of the window, or at the bottom of
  * the window. To add action widgets, create your `GtkDialog` using
  * [ctor@Gtk.Dialog.new_with_buttons], or use [method@Gtk.Dialog.add_button],
  * [method@Gtk.Dialog.add_buttons], or [method@Gtk.Dialog.add_action_widget].
  *
  * `GtkDialogs` uses some heuristics to decide whether to add a close button to
  * the window decorations. If any of the action buttons use the response ID
  * %GTK_RESPONSE_CLOSE or %GTK_RESPONSE_CANCEL, the close button is omitted.
  *
  * Clicking a button that was added as an action widget will emit the
  * [signal@Gtk.Dialog::response] signal with a response ID that you specified.
  * GTK will never assign a meaning to positive response IDs; these are entirely
  * user-defined. But for convenience, you can use the response IDs in the
  * [enum@Gtk.ResponseType] enumeration (these all have values less than zero).
  * If a dialog receives a delete event, the [signal@Gtk.Dialog::response]
  * signal will be emitted with the %GTK_RESPONSE_DELETE_EVENT response ID.
  *
  * Dialogs are created with a call to [ctor@Gtk.Dialog.new] or
  * [ctor@Gtk.Dialog.new_with_buttons]. The latter is recommended; it allows you
  * to set the dialog title, some convenient flags, and add buttons.
  *
  * A “modal” dialog (that is, one which freezes the rest of the application
  * from user input), can be created by calling [method@Gtk.Window.set_modal] on
  * the dialog. When using [ctor@Gtk.Dialog.new_with_buttons], you can also pass
  * the %GTK_DIALOG_MODAL flag to make a dialog modal.
  *
  * For the simple dialog in the following example, a [class@Gtk.MessageDialog]
  * would save some effort. But you’d need to create the dialog contents
  * manually if you had more than a simple message in the dialog.
  *
  * An example for simple `GtkDialog` usage:
  *
  * ```c
  * // Function to open a dialog box with a message
  * void
  * quick_message (GtkWindow *parent, char *message)
  * {
  *  GtkWidget *dialog, *label, *content_area;
  *  GtkDialogFlags flags;
  *
  *  // Create the widgets
  *  flags = GTK_DIALOG_DESTROY_WITH_PARENT;
  *  dialog = gtk_dialog_new_with_buttons ("Message",
  *                                        parent,
  *                                        flags,
  *                                        _("_OK"),
  *                                        GTK_RESPONSE_NONE,
  *                                        NULL);
  *  content_area = gtk_dialog_get_content_area (GTK_DIALOG (dialog));
  *  label = gtk_label_new (message);
  *
  *  // Ensure that the dialog box is destroyed when the user responds
  *
  *  g_signal_connect_swapped (dialog,
  *                            "response",
  *                            G_CALLBACK (gtk_window_destroy),
  *                            dialog);
  *
  *  // Add the label, and show everything we’ve added
  *
  *  gtk_box_append (GTK_BOX (content_area), label);
  *  gtk_widget_show (dialog);
  * }
  * ```
  *
  * # GtkDialog as GtkBuildable
  *
  * The `GtkDialog` implementation of the `GtkBuildable` interface exposes the
  * @content_area
  *   as an internal child with the name “content_area”.
  *
  * `GtkDialog` supports a custom `<action-widgets>` element, which can contain
  * multiple `<action-widget>` elements. The “response” attribute specifies a
  * numeric response, and the content of the element is the id of widget (which
  * should be a child of the dialogs @action_area). To mark a response as
  * default, set the “default” attribute of the `<action-widget>` element to
  * true.
  *
  * `GtkDialog` supports adding action widgets by specifying “action” as the
  * “type” attribute of a `<child>` element. The widget will be added either to
  * the action area or the headerbar of the dialog, depending on the
  * “use-header-bar” property. The response id has to be associated with the
  * action widget using the `<action-widgets>` element.
  *
  * An example of a `GtkDialog` UI definition fragment:
  *
  * ```xml
  * <object class="GtkDialog" id="dialog1">
  *   <child type="action">
  *     <object class="GtkButton" id="button_cancel"/>
  *   </child>
  *   <child type="action">
  *     <object class="GtkButton" id="button_ok">
  *     </object>
  *   </child>
  *   <action-widgets>
  *     <action-widget response="cancel">button_cancel</action-widget>
  *     <action-widget response="ok" default="true">button_ok</action-widget>
  *   </action-widgets>
  * </object>
  * ```
  *
  * # Accessibility
  *
  * `GtkDialog` uses the %GTK_ACCESSIBLE_ROLE_DIALOG role.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class Dialog private[gnome] (raw: Ptr[GtkDialog])
    extends Window(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget,
      Native,
      Root,
      ShortcutManager:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Adds an activatable widget to the action area of a `GtkDialog`.
    *
    * GTK connects a signal handler that will emit the
    * [signal@Gtk.Dialog::response] signal on the dialog when the widget is
    * activated. The widget is appended to the end of the dialog’s action area.
    *
    * If you want to add a non-activatable widget, simply pack it into the @action_area
    * field of the `GtkDialog` struct.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def addActionWidget(
      child: sn.gnome.gtk4.Widget /* Some(Ptr[GtkWidget]) */,
      response_id: ResponseType /* Some(CInt) */
  )(using Runtime): Unit /* None */ =
    gtk_dialog_add_action_widget(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkDialog]],
      child.getUnsafeRawPointer().asInstanceOf,
      response_id.raw.value
    )
  end addActionWidget

  /** Adds a button with the given text.
    *
    * GTK arranges things so that clicking the button will emit the
    * [signal@Gtk.Dialog::response] signal with the given @response_id. The
    * button is appended to the end of the dialog’s action area. The button
    * widget is returned, but usually you don’t need it.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def addButton(
      button_text: String /* Some(CString) */,
      response_id: ResponseType /* Some(CInt) */
  )(using Zone, Runtime): sn.gnome.gtk4.Widget /* None */ =
    sn.gnome.gtk4.Widget.applyUnsafe(
      gtk_dialog_add_button(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkDialog]],
        toCString(button_text),
        response_id.raw.value
      ).asInstanceOf
    )
  end addButton

  /** Adds multiple buttons.
    *
    * This is the same as calling [method@Gtk.Dialog.add_button] repeatedly. The
    * variable argument list should be %NULL-terminated as with
    * [ctor@Gtk.Dialog.new_with_buttons]. Each button must have both text and
    * response ID.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method add_buttons/<method parameters>]: Vararg parameters require inlining which doesn't work with overriding"
  )
  private def addButtons__ = ???

  /** Returns the content area of @dialog.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getContentArea()(using Runtime): sn.gnome.gtk4.Box /* None */ =
    sn.gnome.gtk4.Box.applyUnsafe(
      gtk_dialog_get_content_area(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkDialog]]
      ).asInstanceOf
    )
  end getContentArea

  /** Returns the display that this `GtkRoot` is on.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  override def getDisplay()(using Runtime): sn.gnome.gdk4.Display /* None */ =
    sn.gnome.gdk4.Display.applyUnsafe(
      gtk_root_get_display(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkRoot]]
      ).asInstanceOf
    )
  end getDisplay

  /** Retrieves the current focused widget within the window.
    *
    * Note that this is the widget that would have the focus if the toplevel
    * window focused; if the toplevel window is not focused then
    * `gtk_widget_has_focus (widget)` will not be %TRUE for the widget.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  override def getFocus()(using Runtime): sn.gnome.gtk4.Widget /* None */ =
    sn.gnome.gtk4.Widget.applyUnsafe(
      gtk_window_get_focus(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWindow]]
      ).asInstanceOf
    )
  end getFocus

  /** Returns the header bar of @dialog.
    *
    * Note that the headerbar is only used by the dialog if the
    * [property@Gtk.Dialog:use-header-bar] property is %TRUE.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getHeaderBar()(using Runtime): sn.gnome.gtk4.HeaderBar /* None */ =
    sn.gnome.gtk4.HeaderBar.applyUnsafe(
      gtk_dialog_get_header_bar(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkDialog]]
      ).asInstanceOf
    )
  end getHeaderBar

  /** Gets the response id of a widget in the action area of a dialog.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getResponseForWidget(
      widget: sn.gnome.gtk4.Widget /* Some(Ptr[GtkWidget]) */
  )(using Runtime): Int /* None */ =
    gtk_dialog_get_response_for_widget(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkDialog]],
      widget.getUnsafeRawPointer().asInstanceOf
    )
  end getResponseForWidget

  /** Gets the widget button that uses the given response ID in the action area
    * of a dialog.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getWidgetForResponse(
      response_id: ResponseType /* Some(CInt) */
  )(using Runtime): sn.gnome.gtk4.Widget /* None */ =
    sn.gnome.gtk4.Widget.applyUnsafe(
      gtk_dialog_get_widget_for_response(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkDialog]],
        response_id.raw.value
      ).asInstanceOf
    )
  end getWidgetForResponse

  /** Realizes a `GtkNative`.
    *
    * This should only be used by subclasses.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  override def realize(): Unit /* None */ =
    gtk_native_realize(this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkNative]])
  end realize

  /** Emits the ::response signal with the given response ID.
    *
    * Used to indicate that the user has responded to the dialog in some way.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def response(response_id: ResponseType /* Some(CInt) */ ): Unit /* None */ =
    gtk_dialog_response(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkDialog]],
      response_id.raw.value
    )
  end response

  /** Sets the default widget for the dialog based on the response ID.
    *
    * Pressing “Enter” normally activates the default widget.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setDefaultResponse(
      response_id: ResponseType /* Some(CInt) */
  ): Unit /* None */ =
    gtk_dialog_set_default_response(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkDialog]],
      response_id.raw.value
    )
  end setDefaultResponse

  /** Sets the focus widget.
    *
    * If @focus is not the current focus widget, and is focusable, sets it as
    * the focus widget for the window. If @focus is %NULL, unsets the focus
    * widget for this window. To set the focus to a particular widget in the
    * toplevel, it is usually more convenient to use
    * [method@Gtk.Widget.grab_focus] instead of this function.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  override def setFocus(
      focus: Option[sn.gnome.gtk4.Widget /* Some(Ptr[GtkWidget]) */ ]
  )(using Runtime): Unit /* None */ =
    gtk_window_set_focus(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkWindow]],
      focus
        .map[Ptr[GtkWidget]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkWidget]])
    )
  end setFocus

  /** A convenient way to sensitize/desensitize dialog buttons.
    *
    * Calls `gtk_widget_set_sensitive (widget, @setting)` for each widget in the
    * dialog’s action area with the given @response_id.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setResponseSensitive(
      response_id: ResponseType /* Some(CInt) */,
      setting: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_dialog_set_response_sensitive(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkDialog]],
      response_id.raw.value,
      gboolean(gint((if setting == true then 1 else 0)))
    )
  end setResponseSensitive

  /** Unrealizes a `GtkNative`.
    *
    * This should only be used by subclasses.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  override def unrealize(): Unit /* None */ =
    gtk_native_unrealize(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkNative]]
    )
  end unrealize

  /** Emitted when the user uses a keybinding to close the dialog.
    *
    * This is a [keybinding signal](class.SignalAction.html).
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
          self: Ptr[GtkDialog],
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
    * The signal is also emitted when the dialog receives a delete event, and
    * when [method@Gtk.Dialog.response] is called. On a delete event, the
    * response ID is %GTK_RESPONSE_DELETE_EVENT. Otherwise, it depends on which
    * action widget was clicked.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onResponse(handler: ((responseId: ResponseType)) => Unit)(using Runtime) =
    type SignalRegType =
      SignalRegistration[this.type, (responseId: ResponseType), Unit]
    val c_handler = CFuncPtr3.fromScalaFunction {
      (
          self: Ptr[GtkDialog],
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
end Dialog

object Dialog:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkDialog])(using Runtime) = summon[Runtime]
    .getOrCreate[Dialog](ptr.asInstanceOf[Ptr[Byte]], p => new Dialog(ptr))

  /** Creates a new dialog box.
    *
    * Widgets should not be packed into the `GtkWindow` directly, but into the @content_area
    * and @action_area, as described above.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply()(using Runtime): Dialog =
    val raw: Ptr[Byte] = gtk_dialog_new().asInstanceOf
    summon[Runtime]
      .getOrCreate[Dialog](raw, r => Dialog.applyUnsafe(r.asInstanceOf))
  end apply

  /** Creates a new `GtkDialog` with the given title and transient parent.
    *
    * The @flags argument can be used to make the dialog modal, have it
    * destroyed along with its transient parent, or make it use a headerbar.
    *
    * Button text/response ID pairs should be listed in pairs, with a %NULL
    * pointer ending the list. Button text can be arbitrary text. A response ID
    * can be any positive number, or one of the values in the
    * [enum@Gtk.ResponseType] enumeration. If the user clicks one of these
    * buttons, `GtkDialog` will emit the [signal@Gtk.Dialog::response] signal
    * with the corresponding response ID.
    *
    * If a `GtkDialog` receives a delete event, it will emit ::response with a
    * response ID of %GTK_RESPONSE_DELETE_EVENT.
    *
    * However, destroying a dialog does not emit the ::response signal; so be
    * careful relying on ::response when using the
    * %GTK_DIALOG_DESTROY_WITH_PARENT flag.
    *
    * Here’s a simple example:
    * ```c
    * GtkWindow *main_app_window; // Window the dialog should show up on
    * GtkWidget *dialog;
    * GtkDialogFlags flags = GTK_DIALOG_MODAL | GTK_DIALOG_DESTROY_WITH_PARENT;
    * dialog = gtk_dialog_new_with_buttons ("My dialog",
    *                                       main_app_window,
    *                                       flags,
    *                                       _("_OK"),
    *                                       GTK_RESPONSE_ACCEPT,
    *                                       _("_Cancel"),
    *                                       GTK_RESPONSE_REJECT,
    *                                       NULL);
    * ```
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  inline def withButtons(
      title: Option[String /* Some(CString) */ ],
      parent: Option[sn.gnome.gtk4.Window /* Some(Ptr[GtkWindow]) */ ],
      flags: DialogFlags /* Some(GtkDialogFlags) */,
      first_button_text: Option[String /* Some(CString) */ ],
      args: Any*
  )(using Zone, Runtime): Dialog =
    val raw: Ptr[Byte] = gtk_dialog_new_with_buttons(
      title
        .map[CString](o => toCString(o))
        .getOrElse(null.asInstanceOf[CString]),
      parent
        .map[Ptr[GtkWindow]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkWindow]]),
      flags.raw,
      first_button_text
        .map[CString](o => toCString(o))
        .getOrElse(null.asInstanceOf[CString]),
      args*
    ).asInstanceOf
    summon[Runtime]
      .getOrCreate[Dialog](raw, r => Dialog.applyUnsafe(r.asInstanceOf))
  end withButtons
end Dialog
