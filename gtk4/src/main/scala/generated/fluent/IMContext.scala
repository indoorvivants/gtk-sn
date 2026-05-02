package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gdk4.fluent.Device
import sn.gnome.gdk4.fluent.Event
import sn.gnome.gdk4.fluent.Surface
import sn.gnome.gdk4.internal.GdkModifierType
import sn.gnome.gdk4.internal.GdkRectangle
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.guint
import sn.gnome.glib.internal.guint32
import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkIMContext

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GtkIMContext` defines the interface for GTK input methods.
  *
  * `GtkIMContext` is used by GTK text input widgets like `GtkText` to map from
  * key events to Unicode character strings.
  *
  * An input method may consume multiple key events in sequence before finally
  * outputting the composed result. This is called *preediting*, and an input
  * method may provide feedback about this process by displaying the
  * intermediate composition states as preedit text. To do so, the
  * `GtkIMContext` will emit [signal@Gtk.IMContext::preedit-start],
  * [signal@Gtk.IMContext::preedit-changed] and
  * [signal@Gtk.IMContext::preedit-end] signals.
  *
  * For instance, the built-in GTK input method [class@Gtk.IMContextSimple]
  * implements the input of arbitrary Unicode code points by holding down the
  * <kbd>Control</kbd> and <kbd>Shift</kbd> keys and then typing <kbd>u</kbd>
  * followed by the hexadecimal digits of the code point. When releasing the
  * <kbd>Control</kbd> and <kbd>Shift</kbd> keys, preediting ends and the
  * character is inserted as text. For example,
  *
  * Ctrl+Shift+u 2 0 A C
  *
  * results in the € sign.
  *
  * Additional input methods can be made available for use by GTK widgets as
  * loadable modules. An input method module is a small shared library which
  * provides a `GIOExtension` for the extension point named "gtk-im-module".
  *
  * To connect a widget to the users preferred input method, you should use
  * [class@Gtk.IMMulticontext].
  */
class IMContext(raw: Ptr[GtkIMContext]) extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Asks the widget that the input context is attached to delete characters
    * around the cursor position by emitting the `::delete_surrounding` signal.
    *
    * Note that @offset and @n_chars are in characters not in bytes which
    * differs from the usage other places in `GtkIMContext`.
    *
    * In order to use this function, you should first call
    * [method@Gtk.IMContext.get_surrounding] to get the current context, and
    * call this function immediately afterwards to make sure that you know what
    * you are deleting. You should also account for the fact that even if the
    * signal was handled, the input context might not have deleted all the
    * characters that were requested to be deleted.
    *
    * This function is used by an input method that wants to make substitutions
    * in the existing text in response to new input. It is not useful for
    * applications.
    */
  def deleteSurrounding(
      offset: Int /* Some(CInt) */,
      n_chars: Int /* Some(CInt) */
  ): Boolean /* None */ = gtk_im_context_delete_surrounding(
    this.raw.asInstanceOf[Ptr[GtkIMContext]],
    offset,
    n_chars
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Allow an input method to forward key press and release events to another
    * input method without necessarily having a `GdkEvent` available.
    */
  def filterKey(
      press: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */,
      surface: Surface /* Some(Ptr[_root_.sn.gnome.gdk4.internal.GdkSurface]) */,
      device: Device /* Some(Ptr[_root_.sn.gnome.gdk4.internal.GdkDevice]) */,
      time: UInt /* Some(_root_.sn.gnome.glib.internal.guint32) */,
      keycode: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */,
      state: GdkModifierType /* Some(_root_.sn.gnome.gdk4.internal.GdkModifierType) */,
      group: Int /* Some(CInt) */
  ): Boolean /* None */ = gtk_im_context_filter_key(
    this.raw.asInstanceOf[Ptr[GtkIMContext]],
    gboolean(gint((if press == true then 1 else 0))),
    surface.getUnsafeRawPointer().asInstanceOf,
    device.getUnsafeRawPointer().asInstanceOf,
    guint32(time),
    guint(keycode),
    state,
    group
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Allow an input method to internally handle key press and release events.
    *
    * If this function returns %TRUE, then no further processing should be done
    * for this key event.
    */
  def filterKeypress(
      event: Event /* Some(Ptr[_root_.sn.gnome.gdk4.internal.GdkEvent]) */
  ): Boolean /* None */ = gtk_im_context_filter_keypress(
    this.raw.asInstanceOf[Ptr[GtkIMContext]],
    event.getUnsafeRawPointer().asInstanceOf
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Notify the input method that the widget to which this input context
    * corresponds has gained focus.
    *
    * The input method may, for example, change the displayed feedback to
    * reflect this change.
    */
  def focusIn(): Unit /* None */ = gtk_im_context_focus_in(
    this.raw.asInstanceOf[Ptr[GtkIMContext]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Notify the input method that the widget to which this input context
    * corresponds has lost focus.
    *
    * The input method may, for example, change the displayed feedback or reset
    * the contexts state to reflect this change.
    */
  def focusOut(): Unit /* None */ = gtk_im_context_focus_out(
    this.raw.asInstanceOf[Ptr[GtkIMContext]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieve the current preedit string for the input context, and a list of
    * attributes to apply to the string.
    *
    * This string should be displayed inserted at the insertion point.
    */
  @annotation.compileTimeOnly(
    "Method get_preedit_string contains an OUT parameter, which is not supported yet"
  )
  private def getPreeditString__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves context around the insertion point.
    *
    * Input methods typically want context in order to constrain input text
    * based on existing text; this is important for languages such as Thai where
    * only some sequences of characters are allowed.
    *
    * This function is implemented by emitting the
    * [signal@Gtk.IMContext::retrieve-surrounding] signal on the input method;
    * in response to this signal, a widget should provide as much context as is
    * available, up to an entire paragraph, by calling
    * [method@Gtk.IMContext.set_surrounding].
    *
    * Note that there is no obligation for a widget to respond to the
    * `::retrieve-surrounding` signal, so input methods must be prepared to
    * function without context.
    */
  @annotation.compileTimeOnly(
    "Method get_surrounding contains an OUT parameter, which is not supported yet"
  )
  private def getSurrounding__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves context around the insertion point.
    *
    * Input methods typically want context in order to constrain input text
    * based on existing text; this is important for languages such as Thai where
    * only some sequences of characters are allowed.
    *
    * This function is implemented by emitting the
    * [signal@Gtk.IMContext::retrieve-surrounding] signal on the input method;
    * in response to this signal, a widget should provide as much context as is
    * available, up to an entire paragraph, by calling
    * [method@Gtk.IMContext.set_surrounding_with_selection].
    *
    * Note that there is no obligation for a widget to respond to the
    * `::retrieve-surrounding` signal, so input methods must be prepared to
    * function without context.
    */
  @annotation.compileTimeOnly(
    "Method get_surrounding_with_selection contains an OUT parameter, which is not supported yet"
  )
  private def getSurroundingWithSelection__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Notify the input method that a change such as a change in cursor position
    * has been made.
    *
    * This will typically cause the input method to clear the preedit state.
    */
  def reset(): Unit /* None */ = gtk_im_context_reset(
    this.raw.asInstanceOf[Ptr[GtkIMContext]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Set the client widget for the input context.
    *
    * This is the `GtkWidget` holding the input focus. This widget is used in
    * order to correctly position status windows, and may also be used for
    * purposes internal to the input method.
    */
  def setClientWidget(
      widget: Option[Widget /* Some(Ptr[GtkWidget]) */ ]
  ): Unit /* None */ = gtk_im_context_set_client_widget(
    this.raw.asInstanceOf[Ptr[GtkIMContext]],
    widget
      .map[Ptr[GtkWidget]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GtkWidget]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Notify the input method that a change in cursor position has been made.
    *
    * The location is relative to the client widget.
    */
  def setCursorLocation(
      area: Ptr[
        GdkRectangle
      ] /* Some(Ptr[_root_.sn.gnome.gdk4.internal.GdkRectangle]) */
  ): Unit /* None */ = gtk_im_context_set_cursor_location(
    this.raw.asInstanceOf[Ptr[GtkIMContext]],
    area
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets surrounding context around the insertion point and preedit string.
    *
    * This function is expected to be called in response to the
    * [signal@Gtk.IMContext::retrieve-surrounding] signal, and will likely have
    * no effect if called at other times.
    */
  def setSurrounding(
      text: String | CString /* Some(CString) */,
      len: Int /* Some(CInt) */,
      cursor_index: Int /* Some(CInt) */
  )(using Zone): Unit /* None */ = gtk_im_context_set_surrounding(
    this.raw.asInstanceOf[Ptr[GtkIMContext]],
    __sn_extract_string(text),
    len,
    cursor_index
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets surrounding context around the insertion point and preedit string.
    * This function is expected to be called in response to the
    * [signal@Gtk.IMContext::retrieve_surrounding] signal, and will likely have
    * no effect if called at other times.
    */
  def setSurroundingWithSelection(
      text: String | CString /* Some(CString) */,
      len: Int /* Some(CInt) */,
      cursor_index: Int /* Some(CInt) */,
      anchor_index: Int /* Some(CInt) */
  )(using Zone): Unit /* None */ =
    gtk_im_context_set_surrounding_with_selection(
      this.raw.asInstanceOf[Ptr[GtkIMContext]],
      __sn_extract_string(text),
      len,
      cursor_index,
      anchor_index
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether the IM context should use the preedit string to display
    * feedback.
    *
    * If @use_preedit is %FALSE (default is %TRUE), then the IM context may use
    * some other method to display feedback, such as displaying it in a child of
    * the root window.
    */
  def setUsePreedit(
      use_preedit: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_im_context_set_use_preedit(
    this.raw.asInstanceOf[Ptr[GtkIMContext]],
    gboolean(gint((if use_preedit == true then 1 else 0)))
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end IMContext
