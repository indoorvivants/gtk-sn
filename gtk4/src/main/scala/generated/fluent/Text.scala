package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.fluent.MenuModel
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.guint16
import sn.gnome.glib.internal.guint32
import sn.gnome.glib.internal.gunichar
import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.Editable
import sn.gnome.gtk4.fluent.EntryBuffer
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkInputHints
import sn.gnome.gtk4.internal.GtkInputPurpose
import sn.gnome.gtk4.internal.GtkText
import sn.gnome.pango.internal.PangoAttrList
import sn.gnome.pango.internal.PangoTabArray

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * The `GtkText` widget is a single-line text entry widget.
  *
  * `GtkText` is the common implementation of single-line text editing that is
  * shared between [class@Gtk.Entry], [class@Gtk.PasswordEntry],
  * [class@Gtk.SpinButton], and other widgets. In all of these, `GtkText` is
  * used as the delegate for the [iface@Gtk.Editable] implementation.
  *
  * A fairly large set of key bindings are supported by default. If the entered
  * text is longer than the allocation of the widget, the widget will scroll so
  * that the cursor position is visible.
  *
  * When using an entry for passwords and other sensitive information, it can be
  * put into “password mode” using [method@Gtk.Text.set_visibility]. In this
  * mode, entered text is displayed using a “invisible” character. By default,
  * GTK picks the best invisible character that is available in the current
  * font, but it can be changed with [method@Gtk.Text.set_invisible_char].
  *
  * If you are looking to add icons or progress display in an entry, look at
  * [class@Gtk.Entry]. There other alternatives for more specialized use cases,
  * such as [class@Gtk.SearchEntry].
  *
  * If you need multi-line editable text, look at [class@Gtk.TextView].
  *
  * # CSS nodes
  *
  * ```
  * text[.read-only]
  * ├── placeholder
  * ├── undershoot.left
  * ├── undershoot.right
  * ├── [selection]
  * ├── [block-cursor]
  * ╰── [window.popup]
  * ```
  *
  * `GtkText` has a main node with the name `text`. Depending on the properties
  * of the widget, the `.read-only` style class may appear.
  *
  * When the entry has a selection, it adds a subnode with the name `selection`.
  *
  * When the entry is in overwrite mode, it adds a subnode with the name
  * `block-cursor` that determines how the block cursor is drawn.
  *
  * The CSS node for a context menu is added as a subnode with the name `popup`.
  *
  * The `undershoot` nodes are used to draw the underflow indication when
  * content is scrolled out of view. These nodes get the `.left` or `.right`
  * style class added depending on where the indication is drawn.
  *
  * When touch is used and touch selection handles are shown, they are using CSS
  * nodes with name `cursor-handle`. They get the `.top` or `.bottom` style
  * class depending on where they are shown in relation to the selection. If
  * there is just a single handle for the text cursor, it gets the style class
  * `.insertion-cursor`.
  *
  * # Accessibility
  *
  * `GtkText` uses the %GTK_ACCESSIBLE_ROLE_NONE role, which causes it to be
  * skipped for accessibility. This is because `GtkText` is expected to be used
  * as a delegate for a `GtkEditable` implementation that will be represented to
  * accessibility.
  */
class Text(raw: Ptr[GtkText])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget,
      Editable:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Determine the positions of the strong and weak cursors if the insertion
    * point in the layout is at @position.
    *
    * The position of each cursor is stored as a zero-width rectangle. The
    * strong cursor location is the location where characters of the
    * directionality equal to the base direction are inserted. The weak cursor
    * location is the location where characters of the directionality opposite
    * to the base direction are inserted.
    *
    * The rectangle positions are in widget coordinates.
    */
  @annotation.compileTimeOnly(
    "Method compute_cursor_extents contains an OUT parameter, which is not supported yet"
  )
  private def computeCursorExtents__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether pressing Enter will activate the default widget for the
    * window containing @self.
    *
    * See [method@Gtk.Text.set_activates_default].
    */
  def getActivatesDefault(): Boolean /* None */ =
    gtk_text_get_activates_default(this.raw.asInstanceOf[Ptr[GtkText]]).value
      .!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the attribute list that was set on the `GtkText`.
    *
    * See [method@Gtk.Text.set_attributes].
    */
  def getAttributes(): Ptr[PangoAttrList] /* None */ = gtk_text_get_attributes(
    this.raw.asInstanceOf[Ptr[GtkText]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Get the `GtkEntryBuffer` object which holds the text for this widget.
    */
  def getBuffer(): EntryBuffer /* None */ = new EntryBuffer(
    gtk_text_get_buffer(this.raw.asInstanceOf[Ptr[GtkText]]).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether Emoji completion is enabled for this `GtkText` widget.
    */
  def getEnableEmojiCompletion(): Boolean /* None */ =
    gtk_text_get_enable_emoji_completion(
      this.raw.asInstanceOf[Ptr[GtkText]]
    ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the menu model for extra items in the context menu.
    *
    * See [method@Gtk.Text.set_extra_menu].
    */
  def getExtraMenu(): MenuModel /* None */ = new MenuModel(
    gtk_text_get_extra_menu(this.raw.asInstanceOf[Ptr[GtkText]]).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the input hints of the `GtkText`.
    */
  def getInputHints(): GtkInputHints /* None */ = gtk_text_get_input_hints(
    this.raw.asInstanceOf[Ptr[GtkText]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the input purpose of the `GtkText`.
    */
  def getInputPurpose(): GtkInputPurpose /* None */ =
    gtk_text_get_input_purpose(this.raw.asInstanceOf[Ptr[GtkText]])

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the character displayed when visibility is set to false.
    *
    * Note that GTK does not compute this value unless it needs it, so the value
    * returned by this function is not very useful unless it has been explicitly
    * set with [method@Gtk.Text.set_invisible_char].
    */
  def getInvisibleChar(): CUnsignedInt /* None */ = gtk_text_get_invisible_char(
    this.raw.asInstanceOf[Ptr[GtkText]]
  ).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the maximum allowed length of the text in @self.
    *
    * See [method@Gtk.Text.set_max_length].
    *
    * This is equivalent to getting @self's `GtkEntryBuffer` and calling
    * [method@Gtk.EntryBuffer.get_max_length] on it.
    */
  def getMaxLength(): Int /* None */ = gtk_text_get_max_length(
    this.raw.asInstanceOf[Ptr[GtkText]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets whether text is overwritten when typing in the `GtkText`.
    *
    * See [method@Gtk.Text.set_overwrite_mode].
    */
  def getOverwriteMode(): Boolean /* None */ =
    gtk_text_get_overwrite_mode(this.raw.asInstanceOf[Ptr[GtkText]]).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the text that will be displayed when
    * @self
    *   is empty and unfocused
    *
    * If no placeholder text has been set, %NULL will be returned.
    */
  def getPlaceholderText()(using Zone): String /* None */ = fromCString(
    gtk_text_get_placeholder_text(
      this.raw.asInstanceOf[Ptr[GtkText]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether the `GtkText` will grow and shrink with the content.
    */
  def getPropagateTextWidth(): Boolean /* None */ =
    gtk_text_get_propagate_text_width(this.raw.asInstanceOf[Ptr[GtkText]]).value
      .!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the tabstops that were set on the `GtkText`.
    *
    * See [method@Gtk.Text.set_tabs].
    */
  def getTabs(): Ptr[PangoTabArray] /* None */ = gtk_text_get_tabs(
    this.raw.asInstanceOf[Ptr[GtkText]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the current length of the text in @self.
    *
    * This is equivalent to getting @self's `GtkEntryBuffer` and calling
    * [method@Gtk.EntryBuffer.get_length] on it.
    */
  def getTextLength(): UShort /* None */ = gtk_text_get_text_length(
    this.raw.asInstanceOf[Ptr[GtkText]]
  ).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether the `GtkText` will truncate multi-line text that is pasted
    * into the widget
    */
  def getTruncateMultiline(): Boolean /* None */ =
    gtk_text_get_truncate_multiline(this.raw.asInstanceOf[Ptr[GtkText]]).value
      .!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves whether the text in @self is visible.
    */
  def getVisibility(): Boolean /* None */ =
    gtk_text_get_visibility(this.raw.asInstanceOf[Ptr[GtkText]]).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Causes @self to have keyboard focus.
    *
    * It behaves like [method@Gtk.Widget.grab_focus], except that it doesn't
    * select the contents of @self. You only want to call this on some special
    * entries which the user usually doesn't want to replace all text in, such
    * as search-as-you-type entries.
    */
  def grabFocusWithoutSelecting(): Boolean /* None */ =
    gtk_text_grab_focus_without_selecting(
      this.raw.asInstanceOf[Ptr[GtkText]]
    ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * If @activates is %TRUE, pressing Enter will activate the default widget
    * for the window containing @self.
    *
    * This usually means that the dialog containing the `GtkText` will be
    * closed, since the default widget is usually one of the dialog buttons.
    */
  def setActivatesDefault(
      activates: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_text_set_activates_default(
    this.raw.asInstanceOf[Ptr[GtkText]],
    gboolean(gint((if activates == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets attributes that are applied to the text.
    */
  def setAttributes(
      attrs: Option[Ptr[
        PangoAttrList
      ] /* Some(Ptr[_root_.sn.gnome.pango.internal.PangoAttrList]) */ ]
  ): Unit /* None */ = gtk_text_set_attributes(
    this.raw.asInstanceOf[Ptr[GtkText]],
    attrs
      .map[Ptr[_root_.sn.gnome.pango.internal.PangoAttrList]](o => o)
      .getOrElse(
        null.asInstanceOf[Ptr[_root_.sn.gnome.pango.internal.PangoAttrList]]
      )
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Set the `GtkEntryBuffer` object which holds the text for this widget.
    */
  def setBuffer(
      buffer: EntryBuffer /* Some(Ptr[GtkEntryBuffer]) */
  ): Unit /* None */ = gtk_text_set_buffer(
    this.raw.asInstanceOf[Ptr[GtkText]],
    buffer.getUnsafeRawPointer().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether Emoji completion is enabled.
    *
    * If it is, typing ':', followed by a recognized keyword, will pop up a
    * window with suggested Emojis matching the keyword.
    */
  def setEnableEmojiCompletion(
      enable_emoji_completion: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_text_set_enable_emoji_completion(
    this.raw.asInstanceOf[Ptr[GtkText]],
    gboolean(gint((if enable_emoji_completion == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets a menu model to add when constructing the context menu for @self.
    */
  def setExtraMenu(
      model: Option[
        MenuModel /* Some(Ptr[_root_.sn.gnome.gio.internal.GMenuModel]) */
      ]
  ): Unit /* None */ = gtk_text_set_extra_menu(
    this.raw.asInstanceOf[Ptr[GtkText]],
    model
      .map[Ptr[_root_.sn.gnome.gio.internal.GMenuModel]](o =>
        o.getUnsafeRawPointer().asInstanceOf
      )
      .getOrElse(
        null.asInstanceOf[Ptr[_root_.sn.gnome.gio.internal.GMenuModel]]
      )
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets input hints that allow input methods to fine-tune their behaviour.
    */
  def setInputHints(
      hints: GtkInputHints /* Some(GtkInputHints) */
  ): Unit /* None */ =
    gtk_text_set_input_hints(this.raw.asInstanceOf[Ptr[GtkText]], hints)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the input purpose of the `GtkText`.
    *
    * This can be used by on-screen keyboards and other input methods to adjust
    * their behaviour.
    */
  def setInputPurpose(
      purpose: GtkInputPurpose /* Some(GtkInputPurpose) */
  ): Unit /* None */ =
    gtk_text_set_input_purpose(this.raw.asInstanceOf[Ptr[GtkText]], purpose)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the character to use when in “password mode”.
    *
    * By default, GTK picks the best invisible char available in the current
    * font. If you set the invisible char to 0, then the user will get no
    * feedback at all; there will be no text on the screen as they type.
    */
  def setInvisibleChar(
      ch: CUnsignedInt /* Some(_root_.sn.gnome.glib.internal.gunichar) */
  ): Unit /* None */ = gtk_text_set_invisible_char(
    this.raw.asInstanceOf[Ptr[GtkText]],
    gunichar(guint32(ch))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the maximum allowed length of the contents of the widget.
    *
    * If the current contents are longer than the given length, then they will
    * be truncated to fit.
    *
    * This is equivalent to getting @self's `GtkEntryBuffer` and calling
    * [method@Gtk.EntryBuffer.set_max_length] on it.
    */
  def setMaxLength(length: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_text_set_max_length(this.raw.asInstanceOf[Ptr[GtkText]], length)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether the text is overwritten when typing in the `GtkText`.
    */
  def setOverwriteMode(
      overwrite: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_text_set_overwrite_mode(
    this.raw.asInstanceOf[Ptr[GtkText]],
    gboolean(gint((if overwrite == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets text to be displayed in @self when it is empty.
    *
    * This can be used to give a visual hint of the expected contents of the
    * `GtkText`.
    */
  def setPlaceholderText(
      text: Option[String | CString /* Some(CString) */ ]
  )(using Zone): Unit /* None */ = gtk_text_set_placeholder_text(
    this.raw.asInstanceOf[Ptr[GtkText]],
    text
      .map[CString](o => __sn_extract_string(o))
      .getOrElse(null.asInstanceOf[CString])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether the `GtkText` should grow and shrink with the content.
    */
  def setPropagateTextWidth(
      propagate_text_width: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_text_set_propagate_text_width(
    this.raw.asInstanceOf[Ptr[GtkText]],
    gboolean(gint((if propagate_text_width == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets tabstops that are applied to the text.
    */
  def setTabs(
      tabs: Option[Ptr[
        PangoTabArray
      ] /* Some(Ptr[_root_.sn.gnome.pango.internal.PangoTabArray]) */ ]
  ): Unit /* None */ = gtk_text_set_tabs(
    this.raw.asInstanceOf[Ptr[GtkText]],
    tabs
      .map[Ptr[_root_.sn.gnome.pango.internal.PangoTabArray]](o => o)
      .getOrElse(
        null.asInstanceOf[Ptr[_root_.sn.gnome.pango.internal.PangoTabArray]]
      )
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether the `GtkText` should truncate multi-line text that is pasted
    * into the widget.
    */
  def setTruncateMultiline(
      truncate_multiline: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_text_set_truncate_multiline(
    this.raw.asInstanceOf[Ptr[GtkText]],
    gboolean(gint((if truncate_multiline == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether the contents of the `GtkText` are visible or not.
    *
    * When visibility is set to %FALSE, characters are displayed as the
    * invisible char, and will also appear that way when the text in the widget
    * is copied to the clipboard.
    *
    * By default, GTK picks the best invisible character available in the
    * current font, but it can be changed with
    * [method@Gtk.Text.set_invisible_char].
    *
    * Note that you probably want to set [property@Gtk.Text:input-purpose] to
    * %GTK_INPUT_PURPOSE_PASSWORD or %GTK_INPUT_PURPOSE_PIN to inform input
    * methods about the purpose of this self, in addition to setting visibility
    * to %FALSE.
    */
  def setVisibility(
      visible: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = gtk_text_set_visibility(
    this.raw.asInstanceOf[Ptr[GtkText]],
    gboolean(gint((if visible == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Unsets the invisible char.
    *
    * After calling this, the default invisible char is used again.
    */
  def unsetInvisibleChar(): Unit /* None */ = gtk_text_unset_invisible_char(
    this.raw.asInstanceOf[Ptr[GtkText]]
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end Text

object Text:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkText`.
    */
  def apply(): Text = new Text(gtk_text_new().asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkText` with the specified text buffer.
    */
  def withBuffer(buffer: EntryBuffer /* Some(Ptr[GtkEntryBuffer]) */ ): Text =
    new Text(
      gtk_text_new_with_buffer(
        buffer.getUnsafeRawPointer().asInstanceOf
      ).asInstanceOf
    )
end Text
