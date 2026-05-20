package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.MenuModel
import sn.gnome.glib.internal.{
  gboolean,
  gchar,
  gint,
  gpointer,
  guint16,
  guint32,
  gunichar
}
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
  ConstraintTarget,
  DeleteType,
  Editable,
  EntryBuffer,
  InputHints,
  InputPurpose,
  MovementStep,
  Widget
}
import sn.gnome.gtk4.internal.{GtkDeleteType, GtkMovementStep, GtkText}
import sn.gnome.pango.{AttrList, TabArray}
import sn.gnome.runtime.*

/** The `GtkText` widget is a single-line text entry widget.
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
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class Text private[gnome] (raw: Ptr[GtkText])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget,
      Editable:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Determine the positions of the strong and weak cursors if the insertion
    * point in the layout is at @position.
    *
    * The position of each cursor is stored as a zero-width rectangle. The
    * strong cursor location is the location where characters of the
    * directionality equal to the base direction are inserted. The weak cursor
    * location is the location where characters of the directionality opposite
    * to the base direction are inserted.
    *
    * The rectangle positions are in widget coordinates.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method compute_cursor_extents]: Method compute_cursor_extents contains an OUT parameter, which is not supported yet"
  )
  private def computeCursorExtents__ = ???

  /** Returns whether pressing Enter will activate the default widget for the
    * window containing @self.
    *
    * See [method@Gtk.Text.set_activates_default].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getActivatesDefault(): Boolean /* None */ =
    gtk_text_get_activates_default(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkText]]
    ).value.!=(0)
  end getActivatesDefault

  /** Gets the attribute list that was set on the `GtkText`.
    *
    * See [method@Gtk.Text.set_attributes].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getAttributes(): sn.gnome.pango.AttrList /* None */ =
    sn.gnome.pango.AttrList.fromRaw(
      gtk_text_get_attributes(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkText]]
      )
    )
  end getAttributes

  /** Get the `GtkEntryBuffer` object which holds the text for this widget.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getBuffer()(using Runtime): sn.gnome.gtk4.EntryBuffer /* None */ =
    sn.gnome.gtk4.EntryBuffer.applyUnsafe(
      gtk_text_get_buffer(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkText]]
      ).asInstanceOf
    )
  end getBuffer

  /** Returns whether Emoji completion is enabled for this `GtkText` widget.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getEnableEmojiCompletion(): Boolean /* None */ =
    gtk_text_get_enable_emoji_completion(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkText]]
    ).value.!=(0)
  end getEnableEmojiCompletion

  /** Gets the menu model for extra items in the context menu.
    *
    * See [method@Gtk.Text.set_extra_menu].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getExtraMenu()(using Runtime): sn.gnome.gio.MenuModel /* None */ =
    sn.gnome.gio.MenuModel.applyUnsafe(
      gtk_text_get_extra_menu(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkText]]
      ).asInstanceOf
    )
  end getExtraMenu

  /** Gets the input hints of the `GtkText`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getInputHints(): sn.gnome.gtk4.InputHints /* None */ =
    sn.gnome.gtk4.InputHints.fromRaw(
      gtk_text_get_input_hints(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkText]]
      )
    )
  end getInputHints

  /** Gets the input purpose of the `GtkText`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getInputPurpose(): sn.gnome.gtk4.InputPurpose /* None */ =
    sn.gnome.gtk4.InputPurpose.fromRaw(
      gtk_text_get_input_purpose(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkText]]
      )
    )
  end getInputPurpose

  /** Retrieves the character displayed when visibility is set to false.
    *
    * Note that GTK does not compute this value unless it needs it, so the value
    * returned by this function is not very useful unless it has been explicitly
    * set with [method@Gtk.Text.set_invisible_char].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getInvisibleChar(): CUnsignedInt /* None */ =
    gtk_text_get_invisible_char(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkText]]
    ).value
  end getInvisibleChar

  /** Retrieves the maximum allowed length of the text in @self.
    *
    * See [method@Gtk.Text.set_max_length].
    *
    * This is equivalent to getting @self's `GtkEntryBuffer` and calling
    * [method@Gtk.EntryBuffer.get_max_length] on it.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getMaxLength(): Int /* None */ =
    gtk_text_get_max_length(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkText]]
    )
  end getMaxLength

  /** Gets whether text is overwritten when typing in the `GtkText`.
    *
    * See [method@Gtk.Text.set_overwrite_mode].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getOverwriteMode(): Boolean /* None */ =
    gtk_text_get_overwrite_mode(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkText]]
    ).value.!=(0)
  end getOverwriteMode

  /** Retrieves the text that will be displayed when
    * @self
    *   is empty and unfocused
    *
    * If no placeholder text has been set, %NULL will be returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPlaceholderText(): scala.Predef.String /* None */ =
    fromCString(
      gtk_text_get_placeholder_text(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkText]]
      ).asInstanceOf
    )
  end getPlaceholderText

  /** Returns whether the `GtkText` will grow and shrink with the content.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPropagateTextWidth(): Boolean /* None */ =
    gtk_text_get_propagate_text_width(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkText]]
    ).value.!=(0)
  end getPropagateTextWidth

  /** Gets the tabstops that were set on the `GtkText`.
    *
    * See [method@Gtk.Text.set_tabs].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getTabs(): sn.gnome.pango.TabArray /* None */ =
    sn.gnome.pango.TabArray.fromRaw(
      gtk_text_get_tabs(this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkText]])
    )
  end getTabs

  /** Retrieves the current length of the text in @self.
    *
    * This is equivalent to getting @self's `GtkEntryBuffer` and calling
    * [method@Gtk.EntryBuffer.get_length] on it.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getTextLength(): UShort /* None */ =
    gtk_text_get_text_length(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkText]]
    ).value
  end getTextLength

  /** Returns whether the `GtkText` will truncate multi-line text that is pasted
    * into the widget
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getTruncateMultiline(): Boolean /* None */ =
    gtk_text_get_truncate_multiline(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkText]]
    ).value.!=(0)
  end getTruncateMultiline

  /** Retrieves whether the text in @self is visible.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getVisibility(): Boolean /* None */ =
    gtk_text_get_visibility(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkText]]
    ).value.!=(0)
  end getVisibility

  /** Causes @self to have keyboard focus.
    *
    * It behaves like [method@Gtk.Widget.grab_focus], except that it doesn't
    * select the contents of @self. You only want to call this on some special
    * entries which the user usually doesn't want to replace all text in, such
    * as search-as-you-type entries.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def grabFocusWithoutSelecting(): Boolean /* None */ =
    gtk_text_grab_focus_without_selecting(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkText]]
    ).value.!=(0)
  end grabFocusWithoutSelecting

  /** If @activates is %TRUE, pressing Enter will activate the default widget
    * for the window containing @self.
    *
    * This usually means that the dialog containing the `GtkText` will be
    * closed, since the default widget is usually one of the dialog buttons.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setActivatesDefault(
      activates: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_text_set_activates_default(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkText]],
      gboolean(gint((if activates == true then 1 else 0)))
    )
  end setActivatesDefault

  /** Sets attributes that are applied to the text.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setAttributes(
      attrs: Option[
        sn.gnome.pango.AttrList /* Some(Ptr[_root_.sn.gnome.pango.internal.PangoAttrList]) */
      ]
  ): Unit /* None */ =
    gtk_text_set_attributes(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkText]],
      attrs
        .map[Ptr[_root_.sn.gnome.pango.internal.PangoAttrList]](o =>
          o.getUnsafeRawPointer().asInstanceOf
        )
        .getOrElse(
          null.asInstanceOf[Ptr[_root_.sn.gnome.pango.internal.PangoAttrList]]
        )
    )
  end setAttributes

  /** Set the `GtkEntryBuffer` object which holds the text for this widget.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setBuffer(
      buffer: sn.gnome.gtk4.EntryBuffer /* Some(Ptr[GtkEntryBuffer]) */
  )(using Runtime): Unit /* None */ =
    gtk_text_set_buffer(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkText]],
      buffer.getUnsafeRawPointer().asInstanceOf
    )
  end setBuffer

  /** Sets whether Emoji completion is enabled.
    *
    * If it is, typing ':', followed by a recognized keyword, will pop up a
    * window with suggested Emojis matching the keyword.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setEnableEmojiCompletion(
      enable_emoji_completion: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_text_set_enable_emoji_completion(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkText]],
      gboolean(gint((if enable_emoji_completion == true then 1 else 0)))
    )
  end setEnableEmojiCompletion

  /** Sets a menu model to add when constructing the context menu for @self.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setExtraMenu(
      model: Option[
        sn.gnome.gio.MenuModel /* Some(Ptr[_root_.sn.gnome.gio.internal.GMenuModel]) */
      ]
  )(using Runtime): Unit /* None */ =
    gtk_text_set_extra_menu(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkText]],
      model
        .map[Ptr[_root_.sn.gnome.gio.internal.GMenuModel]](o =>
          o.getUnsafeRawPointer().asInstanceOf
        )
        .getOrElse(
          null.asInstanceOf[Ptr[_root_.sn.gnome.gio.internal.GMenuModel]]
        )
    )
  end setExtraMenu

  /** Sets input hints that allow input methods to fine-tune their behaviour.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setInputHints(
      hints: sn.gnome.gtk4.InputHints /* Some(GtkInputHints) */
  ): Unit /* None */ =
    gtk_text_set_input_hints(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkText]],
      hints.raw
    )
  end setInputHints

  /** Sets the input purpose of the `GtkText`.
    *
    * This can be used by on-screen keyboards and other input methods to adjust
    * their behaviour.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setInputPurpose(
      purpose: sn.gnome.gtk4.InputPurpose /* Some(GtkInputPurpose) */
  ): Unit /* None */ =
    gtk_text_set_input_purpose(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkText]],
      purpose.raw
    )
  end setInputPurpose

  /** Sets the character to use when in “password mode”.
    *
    * By default, GTK picks the best invisible char available in the current
    * font. If you set the invisible char to 0, then the user will get no
    * feedback at all; there will be no text on the screen as they type.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setInvisibleChar(
      ch: CUnsignedInt /* Some(_root_.sn.gnome.glib.internal.gunichar) */
  ): Unit /* None */ =
    gtk_text_set_invisible_char(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkText]],
      gunichar(guint32(ch))
    )
  end setInvisibleChar

  /** Sets the maximum allowed length of the contents of the widget.
    *
    * If the current contents are longer than the given length, then they will
    * be truncated to fit.
    *
    * This is equivalent to getting @self's `GtkEntryBuffer` and calling
    * [method@Gtk.EntryBuffer.set_max_length] on it.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setMaxLength(length: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_text_set_max_length(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkText]],
      length
    )
  end setMaxLength

  /** Sets whether the text is overwritten when typing in the `GtkText`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setOverwriteMode(
      overwrite: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_text_set_overwrite_mode(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkText]],
      gboolean(gint((if overwrite == true then 1 else 0)))
    )
  end setOverwriteMode

  /** Sets text to be displayed in @self when it is empty.
    *
    * This can be used to give a visual hint of the expected contents of the
    * `GtkText`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setPlaceholderText(
      text: Option[scala.Predef.String /* Some(CString) */ ]
  )(using Runtime): Unit /* None */ =
    gtk_text_set_placeholder_text(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkText]],
      text
        .map[CString](o => summon[Runtime].inZone(toCString(o)))
        .getOrElse(null.asInstanceOf[CString])
    )
  end setPlaceholderText

  /** Sets whether the `GtkText` should grow and shrink with the content.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setPropagateTextWidth(
      propagate_text_width: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_text_set_propagate_text_width(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkText]],
      gboolean(gint((if propagate_text_width == true then 1 else 0)))
    )
  end setPropagateTextWidth

  /** Sets tabstops that are applied to the text.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setTabs(
      tabs: Option[
        sn.gnome.pango.TabArray /* Some(Ptr[_root_.sn.gnome.pango.internal.PangoTabArray]) */
      ]
  ): Unit /* None */ =
    gtk_text_set_tabs(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkText]],
      tabs
        .map[Ptr[_root_.sn.gnome.pango.internal.PangoTabArray]](o =>
          o.getUnsafeRawPointer().asInstanceOf
        )
        .getOrElse(
          null.asInstanceOf[Ptr[_root_.sn.gnome.pango.internal.PangoTabArray]]
        )
    )
  end setTabs

  /** Sets whether the `GtkText` should truncate multi-line text that is pasted
    * into the widget.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setTruncateMultiline(
      truncate_multiline: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_text_set_truncate_multiline(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkText]],
      gboolean(gint((if truncate_multiline == true then 1 else 0)))
    )
  end setTruncateMultiline

  /** Sets whether the contents of the `GtkText` are visible or not.
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setVisibility(
      visible: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_text_set_visibility(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkText]],
      gboolean(gint((if visible == true then 1 else 0)))
    )
  end setVisibility

  /** Unsets the invisible char.
    *
    * After calling this, the default invisible char is used again.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unsetInvisibleChar(): Unit /* None */ =
    gtk_text_unset_invisible_char(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkText]]
    )
  end unsetInvisibleChar

  /** Emitted when the user hits the <kbd>Enter</kbd> key.
    *
    * The default bindings for this signal are all forms of the <kbd>Enter</kbd>
    * key.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onActivate(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkText],
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
    val signal = c"activate"
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
  end onActivate

  /** Emitted when the user asks for it.
    *
    * This is a [keybinding signal](class.SignalAction.html).
    *
    * The default bindings for this signal are <kbd>Backspace</kbd> and
    * <kbd>Shift</kbd>+<kbd>Backspace</kbd>.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onBackspace(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkText],
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
    val signal = c"backspace"
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
  end onBackspace

  /** Emitted to copy the selection to the clipboard.
    *
    * This is a [keybinding signal](class.SignalAction.html).
    *
    * The default bindings for this signal are <kbd>Ctrl</kbd>+<kbd>c</kbd> and
    * <kbd>Ctrl</kbd>+<kbd>Insert</kbd>.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onCopyClipboard(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkText],
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
    val signal = c"copy-clipboard"
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
  end onCopyClipboard

  /** Emitted to cut the selection to the clipboard.
    *
    * This is a [keybinding signal](class.SignalAction.html).
    *
    * The default bindings for this signal are <kbd>Ctrl</kbd>+<kbd>x</kbd> and
    * <kbd>Shift</kbd>+<kbd>Delete</kbd>.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onCutClipboard(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkText],
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
    val signal = c"cut-clipboard"
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
  end onCutClipboard

  /** Emitted when the user initiates a text deletion.
    *
    * This is a [keybinding signal](class.SignalAction.html).
    *
    * If the @type is %GTK_DELETE_CHARS, GTK deletes the selection if there is
    * one, otherwise it deletes the requested number of characters.
    *
    * The default bindings for this signal are <kbd>Delete</kbd> for deleting a
    * character and <kbd>Ctrl</kbd>+<kbd>Delete</kbd> for deleting a word.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onDeleteFromCursor(handler: ((`type`: DeleteType, count: Int)) => Unit)(
      using Runtime
  ) =
    type SignalRegType =
      SignalRegistration[this.type, (`type`: DeleteType, count: Int), Unit]
    val c_handler = CFuncPtr4.fromScalaFunction {
      (
          self: Ptr[GtkText],
          `type`: GtkDeleteType /* param */,
          count: Int /* param */,
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler((`type` = DeleteType.fromRaw(`type`), count = count))
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
    val signal = c"delete-from-cursor"
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
  end onDeleteFromCursor

  /** Emitted when the user initiates the insertion of a fixed string at the
    * cursor.
    *
    * This is a [keybinding signal](class.SignalAction.html).
    *
    * This signal has no default bindings.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onInsertAtCursor(handler: ((string: String)) => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, (string: String), Unit]
    val c_handler = CFuncPtr3.fromScalaFunction {
      (
          self: Ptr[GtkText],
          string: CString /* param */,
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler((string = fromCString(string)))
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
    val signal = c"insert-at-cursor"
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
  end onInsertAtCursor

  /** Emitted to present the Emoji chooser for the widget.
    *
    * This is a [keybinding signal](class.SignalAction.html).
    *
    * The default bindings for this signal are <kbd>Ctrl</kbd>+<kbd>.</kbd> and
    * <kbd>Ctrl</kbd>+<kbd>;</kbd>
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onInsertEmoji(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkText],
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
    val signal = c"insert-emoji"
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
  end onInsertEmoji

  /** Emitted when the user initiates a cursor movement.
    *
    * If the cursor is not visible in @self, this signal causes the viewport to
    * be moved instead.
    *
    * This is a [keybinding signal](class.SignalAction.html).
    *
    * Applications should not connect to it, but may emit it with
    * g_signal_emit_by_name() if they need to control the cursor
    * programmatically.
    *
    * The default bindings for this signal come in two variants, the variant
    * with the <kbd>Shift</kbd> modifier extends the selection, the variant
    * without it does not. There are too many key combinations to list them all
    * here.
    *
    *   - <kbd>←</kbd>, <kbd>→</kbd>, <kbd>↑</kbd>, <kbd>↓</kbd> move by
    *     individual characters/lines
    *   - <kbd>Ctrl</kbd>+<kbd>←</kbd>, etc. move by words/paragraphs
    *   - <kbd>Home</kbd> and <kbd>End</kbd> move to the ends of the buffer
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onMoveCursor(
      handler: ((step: MovementStep, count: Int, extend: Boolean)) => Unit
  )(using Runtime) =
    type SignalRegType = SignalRegistration[
      this.type,
      (step: MovementStep, count: Int, extend: Boolean),
      Unit
    ]
    val c_handler = CFuncPtr5.fromScalaFunction {
      (
          self: Ptr[GtkText],
          step: GtkMovementStep /* param */,
          count: Int /* param */,
          extend: Boolean /* param */,
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(
          (step = MovementStep.fromRaw(step), count = count, extend = extend)
        )
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
    val signal = c"move-cursor"
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
  end onMoveCursor

  /** Emitted to paste the contents of the clipboard.
    *
    * This is a [keybinding signal](class.SignalAction.html).
    *
    * The default bindings for this signal are <kbd>Ctrl</kbd>+<kbd>v</kbd> and
    * <kbd>Shift</kbd>+<kbd>Insert</kbd>.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onPasteClipboard(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkText],
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
    val signal = c"paste-clipboard"
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
  end onPasteClipboard

  /** Emitted when the preedit text changes.
    *
    * If an input method is used, the typed text will not immediately be
    * committed to the buffer. So if you are interested in the text, connect to
    * this signal.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onPreeditChanged(handler: ((preedit: String)) => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, (preedit: String), Unit]
    val c_handler = CFuncPtr3.fromScalaFunction {
      (
          self: Ptr[GtkText],
          preedit: CString /* param */,
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler((preedit = fromCString(preedit)))
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
    val signal = c"preedit-changed"
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
  end onPreeditChanged

  /** Emitted to toggle the overwrite mode of the `GtkText`.
    *
    * This is a [keybinding signal](class.SignalAction.html).
    *
    * The default bindings for this signal is <kbd>Insert</kbd>.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onToggleOverwrite(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkText],
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
    val signal = c"toggle-overwrite"
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
  end onToggleOverwrite
end Text

object Text:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkText])(using Runtime) = summon[Runtime]
    .getOrCreate[Text](ptr.asInstanceOf[Ptr[Byte]], p => new Text(ptr))

  /** Creates a new `GtkText`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply()(using Runtime): Text =
    val raw: Ptr[Byte] = gtk_text_new().asInstanceOf
    summon[Runtime]
      .getOrCreate[Text](raw, r => Text.applyUnsafe(r.asInstanceOf))
  end apply

  /** Creates a new `GtkText` with the specified text buffer.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def withBuffer(
      buffer: sn.gnome.gtk4.EntryBuffer /* Some(Ptr[GtkEntryBuffer]) */
  )(using Runtime): Text =
    val raw: Ptr[Byte] = gtk_text_new_with_buffer(
      buffer.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
    summon[Runtime]
      .getOrCreate[Text](raw, r => Text.applyUnsafe(r.asInstanceOf))
  end withBuffer
end Text
