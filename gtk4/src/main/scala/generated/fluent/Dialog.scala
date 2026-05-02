package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.Box
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.HeaderBar
import sn.gnome.gtk4.fluent.Native
import sn.gnome.gtk4.fluent.Root
import sn.gnome.gtk4.fluent.ShortcutManager
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.fluent.Window
import sn.gnome.gtk4.internal.GtkDialog
import sn.gnome.gtk4.internal.GtkDialogFlags
import sn.gnome.gtk4.internal.GtkResponseType

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Dialogs are a convenient way to prompt the user for a small amount of input.
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
  */
class Dialog(raw: Ptr[GtkDialog])
    extends Window(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget,
      Native,
      Root,
      ShortcutManager:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Adds an activatable widget to the action area of a `GtkDialog`.
    *
    * GTK connects a signal handler that will emit the
    * [signal@Gtk.Dialog::response] signal on the dialog when the widget is
    * activated. The widget is appended to the end of the dialog’s action area.
    *
    * If you want to add a non-activatable widget, simply pack it into the @action_area
    * field of the `GtkDialog` struct.
    */
  def addActionWidget(
      child: Widget /* Some(Ptr[GtkWidget]) */,
      response_id: GtkResponseType /* Some(CInt) */
  ): Unit /* None */ = gtk_dialog_add_action_widget(
    this.raw.asInstanceOf,
    child.getUnsafeRawPointer().asInstanceOf,
    response_id.value
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Adds a button with the given text.
    *
    * GTK arranges things so that clicking the button will emit the
    * [signal@Gtk.Dialog::response] signal with the given @response_id. The
    * button is appended to the end of the dialog’s action area. The button
    * widget is returned, but usually you don’t need it.
    */
  def addButton(
      button_text: String | CString /* Some(CString) */,
      response_id: GtkResponseType /* Some(CInt) */
  )(using Zone): Widget /* None */ = new Widget(
    gtk_dialog_add_button(
      this.raw.asInstanceOf,
      __sn_extract_string(button_text),
      response_id.value
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Adds multiple buttons.
    *
    * This is the same as calling [method@Gtk.Dialog.add_button] repeatedly. The
    * variable argument list should be %NULL-terminated as with
    * [ctor@Gtk.Dialog.new_with_buttons]. Each button must have both text and
    * response ID.
    */
  inline def addButtons(
      first_button_text: String | CString /* Some(CString) */,
      args: Any*
  )(using Zone): Unit /* None */ = gtk_dialog_add_buttons(
    this.raw.asInstanceOf,
    __sn_extract_string(first_button_text),
    args*
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the content area of @dialog.
    */
  def getContentArea(): Box /* None */ = new Box(
    gtk_dialog_get_content_area(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the header bar of @dialog.
    *
    * Note that the headerbar is only used by the dialog if the
    * [property@Gtk.Dialog:use-header-bar] property is %TRUE.
    */
  def getHeaderBar(): HeaderBar /* None */ = new HeaderBar(
    gtk_dialog_get_header_bar(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the response id of a widget in the action area of a dialog.
    */
  def getResponseForWidget(
      widget: Widget /* Some(Ptr[GtkWidget]) */
  ): Int /* None */ = gtk_dialog_get_response_for_widget(
    this.raw.asInstanceOf,
    widget.getUnsafeRawPointer().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the widget button that uses the given response ID in the action area
    * of a dialog.
    */
  def getWidgetForResponse(
      response_id: GtkResponseType /* Some(CInt) */
  ): Widget /* None */ = new Widget(
    gtk_dialog_get_widget_for_response(
      this.raw.asInstanceOf,
      response_id.value
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Emits the ::response signal with the given response ID.
    *
    * Used to indicate that the user has responded to the dialog in some way.
    */
  def response(
      response_id: GtkResponseType /* Some(CInt) */
  ): Unit /* None */ =
    gtk_dialog_response(this.raw.asInstanceOf, response_id.value)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the default widget for the dialog based on the response ID.
    *
    * Pressing “Enter” normally activates the default widget.
    */
  def setDefaultResponse(
      response_id: GtkResponseType /* Some(CInt) */
  ): Unit /* None */ =
    gtk_dialog_set_default_response(this.raw.asInstanceOf, response_id.value)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A convenient way to sensitize/desensitize dialog buttons.
    *
    * Calls `gtk_widget_set_sensitive (widget, @setting)` for each widget in the
    * dialog’s action area with the given @response_id.
    */
  def setResponseSensitive(
      response_id: GtkResponseType /* Some(CInt) */,
      setting: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_dialog_set_response_sensitive(
    this.raw.asInstanceOf,
    response_id.value,
    gboolean(gint((if setting == true then 1 else 0)))
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end Dialog

object Dialog:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new dialog box.
    *
    * Widgets should not be packed into the `GtkWindow` directly, but into the @content_area
    * and @action_area, as described above.
    */
  def apply(): Dialog = new Dialog(gtk_dialog_new().asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkDialog` with the given title and transient parent.
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
    */
  inline def withButtons(
      title: Option[String | CString /* Some(CString) */ ],
      parent: Option[Window /* Some(Ptr[GtkWindow]) */ ],
      flags: GtkDialogFlags /* Some(GtkDialogFlags) */,
      first_button_text: Option[String | CString /* Some(CString) */ ],
      args: Any*
  )(using Zone): Dialog = new Dialog(
    gtk_dialog_new_with_buttons(
      title
        .map[CString](o => __sn_extract_string(o))
        .getOrElse(null.asInstanceOf[CString]),
      parent
        .map[Ptr[GtkWindow]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkWindow]]),
      flags,
      first_button_text
        .map[CString](o => __sn_extract_string(o))
        .getOrElse(null.asInstanceOf[CString]),
      args*
    ).asInstanceOf
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end Dialog
