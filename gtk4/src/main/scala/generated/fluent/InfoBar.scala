package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.Button
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkInfoBar
import sn.gnome.gtk4.internal.GtkMessageType
import sn.gnome.gtk4.internal.GtkResponseType

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkInfoBar` can be used to show messages to the user without a dialog.
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
  */
class InfoBar(raw: Ptr[GtkInfoBar])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Add an activatable widget to the action area of a `GtkInfoBar`.
    *
    * This also connects a signal handler that will emit the
    * [signal@Gtk.InfoBar::response] signal on the message area when the widget
    * is activated. The widget is appended to the end of the message areas
    * action area.
    */
  def addActionWidget(
      child: Widget /* Some(Ptr[GtkWidget]) */,
      response_id: GtkResponseType /* Some(CInt) */
  ): Unit /* None */ = gtk_info_bar_add_action_widget(
    this.raw.asInstanceOf[Ptr[GtkInfoBar]],
    child.getUnsafeRawPointer().asInstanceOf,
    response_id.value
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Adds a button with the given text.
    *
    * Clicking the button will emit the [signal@Gtk.InfoBar::response] signal
    * with the given response_id. The button is appended to the end of the info
    * bar's action area. The button widget is returned, but usually you don't
    * need it.
    */
  def addButton(
      button_text: String | CString /* Some(CString) */,
      response_id: GtkResponseType /* Some(CInt) */
  )(using Zone): Button /* None */ = new Button(
    gtk_info_bar_add_button(
      this.raw.asInstanceOf[Ptr[GtkInfoBar]],
      __sn_extract_string(button_text),
      response_id.value
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Adds multiple buttons.
    *
    * This is the same as calling [method@Gtk.InfoBar.add_button] repeatedly.
    * The variable argument list should be %NULL-terminated as with
    * [ctor@Gtk.InfoBar.new_with_buttons]. Each button must have both text and
    * response ID.
    */
  inline def addButtons(
      first_button_text: String | CString /* Some(CString) */,
      args: Any*
  )(using Zone): Unit /* None */ = gtk_info_bar_add_buttons(
    this.raw.asInstanceOf[Ptr[GtkInfoBar]],
    __sn_extract_string(first_button_text),
    args*
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Adds a widget to the content area of the info bar.
    */
  def addChild(widget: Widget /* Some(Ptr[GtkWidget]) */ ): Unit /* None */ =
    gtk_info_bar_add_child(
      this.raw.asInstanceOf[Ptr[GtkInfoBar]],
      widget.getUnsafeRawPointer().asInstanceOf
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the message type of the message area.
    */
  def getMessageType(): GtkMessageType /* None */ =
    gtk_info_bar_get_message_type(this.raw.asInstanceOf[Ptr[GtkInfoBar]])

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether the info bar is currently revealed.
    */
  def getRevealed(): Boolean /* None */ = gtk_info_bar_get_revealed(
    this.raw.asInstanceOf[Ptr[GtkInfoBar]]
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether the widget will display a standard close button.
    */
  def getShowCloseButton(): Boolean /* None */ =
    gtk_info_bar_get_show_close_button(
      this.raw.asInstanceOf[Ptr[GtkInfoBar]]
    ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Removes a widget from the action area of @info_bar.
    *
    * The widget must have been put there by a call to
    * [method@Gtk.InfoBar.add_action_widget] or [method@Gtk.InfoBar.add_button].
    */
  def removeActionWidget(
      widget: Widget /* Some(Ptr[GtkWidget]) */
  ): Unit /* None */ = gtk_info_bar_remove_action_widget(
    this.raw.asInstanceOf[Ptr[GtkInfoBar]],
    widget.getUnsafeRawPointer().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Removes a widget from the content area of the info bar.
    */
  def removeChild(widget: Widget /* Some(Ptr[GtkWidget]) */ ): Unit /* None */ =
    gtk_info_bar_remove_child(
      this.raw.asInstanceOf[Ptr[GtkInfoBar]],
      widget.getUnsafeRawPointer().asInstanceOf
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Emits the “response” signal with the given @response_id.
    */
  def response(
      response_id: GtkResponseType /* Some(CInt) */
  ): Unit /* None */ = gtk_info_bar_response(
    this.raw.asInstanceOf[Ptr[GtkInfoBar]],
    response_id.value
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the last widget in the info bar’s action area with the given
    * response_id as the default widget for the dialog.
    *
    * Pressing “Enter” normally activates the default widget.
    *
    * Note that this function currently requires @info_bar to be added to a
    * widget hierarchy.
    */
  def setDefaultResponse(
      response_id: GtkResponseType /* Some(CInt) */
  ): Unit /* None */ = gtk_info_bar_set_default_response(
    this.raw.asInstanceOf[Ptr[GtkInfoBar]],
    response_id.value
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the message type of the message area.
    *
    * GTK uses this type to determine how the message is displayed.
    */
  def setMessageType(
      message_type: GtkMessageType /* Some(GtkMessageType) */
  ): Unit /* None */ = gtk_info_bar_set_message_type(
    this.raw.asInstanceOf[Ptr[GtkInfoBar]],
    message_type
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the sensitivity of action widgets for @response_id.
    *
    * Calls `gtk_widget_set_sensitive (widget, setting)` for each widget in the
    * info bars’s action area with the given @response_id. A convenient way to
    * sensitize/desensitize buttons.
    */
  def setResponseSensitive(
      response_id: GtkResponseType /* Some(CInt) */,
      setting: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_info_bar_set_response_sensitive(
    this.raw.asInstanceOf[Ptr[GtkInfoBar]],
    response_id.value,
    gboolean(gint((if setting == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether the `GtkInfoBar` is revealed.
    *
    * Changing this will make @info_bar reveal or conceal itself via a sliding
    * transition.
    *
    * Note: this does not show or hide @info_bar in the
    * [property@Gtk.Widget:visible] sense, so revealing has no effect if
    * [property@Gtk.Widget:visible] is %FALSE.
    */
  def setRevealed(
      revealed: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_info_bar_set_revealed(
    this.raw.asInstanceOf[Ptr[GtkInfoBar]],
    gboolean(gint((if revealed == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * If true, a standard close button is shown.
    *
    * When clicked it emits the response %GTK_RESPONSE_CLOSE.
    */
  def setShowCloseButton(
      setting: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_info_bar_set_show_close_button(
    this.raw.asInstanceOf[Ptr[GtkInfoBar]],
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
end InfoBar

object InfoBar:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkInfoBar` object.
    */
  def apply(): InfoBar = new InfoBar(gtk_info_bar_new().asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkInfoBar` with buttons.
    *
    * Button text/response ID pairs should be listed, with a %NULL pointer
    * ending the list. A response ID can be any positive number, or one of the
    * values in the `GtkResponseType` enumeration. If the user clicks one of
    * these dialog buttons, GtkInfoBar will emit the
    * [signal@Gtk.InfoBar::response] signal with the corresponding response ID.
    */
  inline def withButtons(
      first_button_text: Option[String | CString /* Some(CString) */ ],
      args: Any*
  )(using Zone): InfoBar = new InfoBar(
    gtk_info_bar_new_with_buttons(
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
end InfoBar
