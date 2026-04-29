package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.fluent.Event
import sn.gnome.gio.fluent.MenuModel
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.Scrollable
import sn.gnome.gtk4.fluent.TextBuffer
import sn.gnome.gtk4.fluent.TextChildAnchor
import sn.gnome.gtk4.fluent.TextMark
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkInputHints
import sn.gnome.gtk4.internal.GtkInputPurpose
import sn.gnome.gtk4.internal.GtkJustification
import sn.gnome.gtk4.internal.GtkTextIter
import sn.gnome.gtk4.internal.GtkTextView
import sn.gnome.gtk4.internal.GtkTextWindowType
import sn.gnome.gtk4.internal.GtkWrapMode
import sn.gnome.pango.fluent.Context
import sn.gnome.pango.internal.PangoTabArray

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A widget that displays the contents of a [class@Gtk.TextBuffer].
  *
  * ![An example GtkTextview](multiline-text.png)
  *
  * You may wish to begin by reading the [conceptual
  * overview](section-text-widget.html), which gives an overview of all the
  * objects and data types related to the text widget and how they work
  * together.
  *
  * ## CSS nodes
  *
  * ```
  * textview.view
  * ├── border.top
  * ├── border.left
  * ├── text
  * │   ╰── [selection]
  * ├── border.right
  * ├── border.bottom
  * ╰── [window.popup]
  * ```
  *
  * `GtkTextView` has a main css node with name textview and style class .view,
  * and subnodes for each of the border windows, and the main text area, with
  * names border and text, respectively. The border nodes each get one of the
  * style classes .left, .right, .top or .bottom.
  *
  * A node representing the selection will appear below the text node.
  *
  * If a context menu is opened, the window node will appear as a subnode of the
  * main node.
  *
  * ## Accessibility
  *
  * `GtkTextView` uses the %GTK_ACCESSIBLE_ROLE_TEXT_BOX role.
  */
class TextView(raw: Ptr[GtkTextView])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget,
      Scrollable:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Adds a child widget in the text buffer, at the given @anchor.
    */
  def addChildAtAnchor(child: Widget, anchor: TextChildAnchor): Unit =
    gtk_text_view_add_child_at_anchor(
      this.raw.asInstanceOf,
      child.getUnsafeRawPointer().asInstanceOf,
      anchor.getUnsafeRawPointer().asInstanceOf
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Adds @child at a fixed coordinate in the `GtkTextView`'s text window.
    *
    * The @xpos and @ypos must be in buffer coordinates (see
    * [method@Gtk.TextView.get_iter_location] to convert to buffer coordinates).
    *
    * @child
    *   will scroll with the text view.
    *
    * If instead you want a widget that will not move with the `GtkTextView`
    * contents see `GtkOverlay`.
    */
  def addOverlay(child: Widget, xpos: Int, ypos: Int): Unit =
    gtk_text_view_add_overlay(
      this.raw.asInstanceOf,
      child.getUnsafeRawPointer().asInstanceOf,
      xpos,
      ypos
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Moves the given @iter backward by one display (wrapped) line.
    *
    * A display line is different from a paragraph. Paragraphs are separated by
    * newlines or other paragraph separator characters. Display lines are
    * created by line-wrapping a paragraph. If wrapping is turned off, display
    * lines and paragraphs will be the same. Display lines are divided
    * differently for each view, since they depend on the view’s width;
    * paragraphs are the same in all views, since they depend on the contents of
    * the `GtkTextBuffer`.
    */
  def backwardDisplayLine(iter: Ptr[GtkTextIter]): Boolean =
    gtk_text_view_backward_display_line(this.raw.asInstanceOf, iter).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Moves the given @iter backward to the next display line start.
    *
    * A display line is different from a paragraph. Paragraphs are separated by
    * newlines or other paragraph separator characters. Display lines are
    * created by line-wrapping a paragraph. If wrapping is turned off, display
    * lines and paragraphs will be the same. Display lines are divided
    * differently for each view, since they depend on the view’s width;
    * paragraphs are the same in all views, since they depend on the contents of
    * the `GtkTextBuffer`.
    */
  def backwardDisplayLineStart(iter: Ptr[GtkTextIter]): Boolean =
    gtk_text_view_backward_display_line_start(this.raw.asInstanceOf, iter).value
      .!=(0)

  @annotation.compileTimeOnly(
    "Method buffer_to_window_coords contains an OUT parameter, which is not supported yet"
  )
  def bufferToWindowCoords() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Moves the given @iter forward by one display (wrapped) line.
    *
    * A display line is different from a paragraph. Paragraphs are separated by
    * newlines or other paragraph separator characters. Display lines are
    * created by line-wrapping a paragraph. If wrapping is turned off, display
    * lines and paragraphs will be the same. Display lines are divided
    * differently for each view, since they depend on the view’s width;
    * paragraphs are the same in all views, since they depend on the contents of
    * the `GtkTextBuffer`.
    */
  def forwardDisplayLine(iter: Ptr[GtkTextIter]): Boolean =
    gtk_text_view_forward_display_line(this.raw.asInstanceOf, iter).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Moves the given @iter forward to the next display line end.
    *
    * A display line is different from a paragraph. Paragraphs are separated by
    * newlines or other paragraph separator characters. Display lines are
    * created by line-wrapping a paragraph. If wrapping is turned off, display
    * lines and paragraphs will be the same. Display lines are divided
    * differently for each view, since they depend on the view’s width;
    * paragraphs are the same in all views, since they depend on the contents of
    * the `GtkTextBuffer`.
    */
  def forwardDisplayLineEnd(iter: Ptr[GtkTextIter]): Boolean =
    gtk_text_view_forward_display_line_end(this.raw.asInstanceOf, iter).value
      .!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether pressing the <kbd>Tab</kbd> key inserts a tab characters.
    *
    * See [method@Gtk.TextView.set_accepts_tab].
    */
  def getAcceptsTab(): Boolean =
    gtk_text_view_get_accepts_tab(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the bottom margin for text in the @text_view.
    */
  def getBottomMargin(): Int = gtk_text_view_get_bottom_margin(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the `GtkTextBuffer` being displayed by this text view.
    *
    * The reference count on the buffer is not incremented; the caller of this
    * function won’t own a new reference.
    */
  def getBuffer(): TextBuffer = new TextBuffer(
    gtk_text_view_get_buffer(this.raw.asInstanceOf).asInstanceOf
  )

  @annotation.compileTimeOnly(
    "Method get_cursor_locations contains an OUT parameter, which is not supported yet"
  )
  def getCursorLocations() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Find out whether the cursor should be displayed.
    */
  def getCursorVisible(): Boolean =
    gtk_text_view_get_cursor_visible(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the default editability of the `GtkTextView`.
    *
    * Tags in the buffer may override this setting for some ranges of text.
    */
  def getEditable(): Boolean =
    gtk_text_view_get_editable(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the menu model that gets added to the context menu or %NULL if none
    * has been set.
    */
  def getExtraMenu(): MenuModel = new MenuModel(
    gtk_text_view_get_extra_menu(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets a `GtkWidget` that has previously been set as gutter.
    *
    * See [method@Gtk.TextView.set_gutter].
    *
    * @win
    *   must be one of %GTK_TEXT_WINDOW_LEFT, %GTK_TEXT_WINDOW_RIGHT,
    *   %GTK_TEXT_WINDOW_TOP, or %GTK_TEXT_WINDOW_BOTTOM.
    */
  def getGutter(win: GtkTextWindowType): Widget = new Widget(
    gtk_text_view_get_gutter(this.raw.asInstanceOf, win).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the default indentation of paragraphs in @text_view.
    *
    * Tags in the view’s buffer may override the default. The indentation may be
    * negative.
    */
  def getIndent(): Int = gtk_text_view_get_indent(this.raw.asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the `input-hints` of the `GtkTextView`.
    */
  def getInputHints(): GtkInputHints = gtk_text_view_get_input_hints(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the `input-purpose` of the `GtkTextView`.
    */
  def getInputPurpose(): GtkInputPurpose = gtk_text_view_get_input_purpose(
    this.raw.asInstanceOf
  )

  @annotation.compileTimeOnly(
    "Method get_iter_at_location contains an OUT parameter, which is not supported yet"
  )
  def getIterAtLocation() = ???

  @annotation.compileTimeOnly(
    "Method get_iter_at_position contains an OUT parameter, which is not supported yet"
  )
  def getIterAtPosition() = ???

  @annotation.compileTimeOnly(
    "Method get_iter_location contains an OUT parameter, which is not supported yet"
  )
  def getIterLocation() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the default justification of paragraphs in @text_view.
    *
    * Tags in the buffer may override the default.
    */
  def getJustification(): GtkJustification = gtk_text_view_get_justification(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the default left margin size of paragraphs in the @text_view.
    *
    * Tags in the buffer may override the default.
    */
  def getLeftMargin(): Int = gtk_text_view_get_left_margin(
    this.raw.asInstanceOf
  )

  @annotation.compileTimeOnly(
    "Method get_line_at_y contains an OUT parameter, which is not supported yet"
  )
  def getLineAtY() = ???

  @annotation.compileTimeOnly(
    "Method get_line_yrange contains an OUT parameter, which is not supported yet"
  )
  def getLineYrange() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the `PangoContext` that is used for rendering LTR directed text
    * layouts.
    *
    * The context may be replaced when CSS changes occur.
    */
  def getLtrContext(): Context = new Context(
    gtk_text_view_get_ltr_context(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets whether the `GtkTextView` uses monospace styling.
    */
  def getMonospace(): Boolean =
    gtk_text_view_get_monospace(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns whether the `GtkTextView` is in overwrite mode or not.
    */
  def getOverwrite(): Boolean =
    gtk_text_view_get_overwrite(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the default number of pixels to put above paragraphs.
    *
    * Adding this function with [method@Gtk.TextView.get_pixels_below_lines] is
    * equal to the line space between each paragraph.
    */
  def getPixelsAboveLines(): Int = gtk_text_view_get_pixels_above_lines(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the default number of pixels to put below paragraphs.
    *
    * The line space is the sum of the value returned by this function and the
    * value returned by [method@Gtk.TextView.get_pixels_above_lines].
    */
  def getPixelsBelowLines(): Int = gtk_text_view_get_pixels_below_lines(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the default number of pixels to put between wrapped lines inside a
    * paragraph.
    */
  def getPixelsInsideWrap(): Int = gtk_text_view_get_pixels_inside_wrap(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the default right margin for text in @text_view.
    *
    * Tags in the buffer may override the default.
    */
  def getRightMargin(): Int = gtk_text_view_get_right_margin(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the `PangoContext` that is used for rendering RTL directed text
    * layouts.
    *
    * The context may be replaced when CSS changes occur.
    */
  def getRtlContext(): Context = new Context(
    gtk_text_view_get_rtl_context(this.raw.asInstanceOf).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the default tabs for @text_view.
    *
    * Tags in the buffer may override the defaults. The returned array will be
    * %NULL if “standard” (8-space) tabs are used. Free the return value with
    * [method@Pango.TabArray.free].
    */
  def getTabs(): Ptr[PangoTabArray] = gtk_text_view_get_tabs(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the top margin for text in the @text_view.
    */
  def getTopMargin(): Int = gtk_text_view_get_top_margin(this.raw.asInstanceOf)

  @annotation.compileTimeOnly(
    "Method get_visible_rect contains an OUT parameter, which is not supported yet"
  )
  def getVisibleRect() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the line wrapping for the view.
    */
  def getWrapMode(): GtkWrapMode = gtk_text_view_get_wrap_mode(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Allow the `GtkTextView` input method to internally handle key press and
    * release events.
    *
    * If this function returns %TRUE, then no further processing should be done
    * for this key event. See [method@Gtk.IMContext.filter_keypress].
    *
    * Note that you are expected to call this function from your handler when
    * overriding key event handling. This is needed in the case when you need to
    * insert your own key handling between the input method and the default key
    * event handling of the `GtkTextView`.
    *
    * ```c
    * static gboolean
    * gtk_foo_bar_key_press_event (GtkWidget *widget,
    *                              GdkEvent  *event)
    * {
    *   guint keyval;
    *
    *   gdk_event_get_keyval ((GdkEvent*)event, &keyval);
    *
    *   if (keyval == GDK_KEY_Return || keyval == GDK_KEY_KP_Enter)
    *     {
    *       if (gtk_text_view_im_context_filter_keypress (GTK_TEXT_VIEW (widget), event))
    *         return TRUE;
    *     }
    *
    *   // Do some stuff
    *
    *   return GTK_WIDGET_CLASS (gtk_foo_bar_parent_class)->key_press_event (widget, event);
    * }
    * ```
    */
  def imContextFilterKeypress(event: Event): Boolean =
    gtk_text_view_im_context_filter_keypress(
      this.raw.asInstanceOf,
      event.getUnsafeRawPointer().asInstanceOf
    ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Moves a mark within the buffer so that it's located within the
    * currently-visible text area.
    */
  def moveMarkOnscreen(mark: TextMark): Boolean =
    gtk_text_view_move_mark_onscreen(
      this.raw.asInstanceOf,
      mark.getUnsafeRawPointer().asInstanceOf
    ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Updates the position of a child.
    *
    * See [method@Gtk.TextView.add_overlay].
    */
  def moveOverlay(child: Widget, xpos: Int, ypos: Int): Unit =
    gtk_text_view_move_overlay(
      this.raw.asInstanceOf,
      child.getUnsafeRawPointer().asInstanceOf,
      xpos,
      ypos
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Move the iterator a given number of characters visually, treating it as
    * the strong cursor position.
    *
    * If @count is positive, then the new strong cursor position will be @count
    * positions to the right of the old cursor position. If @count is negative
    * then the new strong cursor position will be @count positions to the left
    * of the old cursor position.
    *
    * In the presence of bi-directional text, the correspondence between logical
    * and visual order will depend on the direction of the current run, and
    * there may be jumps when the cursor is moved off of the end of a run.
    */
  def moveVisually(iter: Ptr[GtkTextIter], count: Int): Boolean =
    gtk_text_view_move_visually(this.raw.asInstanceOf, iter, count).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Moves the cursor to the currently visible region of the buffer.
    */
  def placeCursorOnscreen(): Boolean =
    gtk_text_view_place_cursor_onscreen(this.raw.asInstanceOf).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Removes a child widget from @text_view.
    */
  def remove(child: Widget): Unit = gtk_text_view_remove(
    this.raw.asInstanceOf,
    child.getUnsafeRawPointer().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Ensures that the cursor is shown.
    *
    * This also resets the time that it will stay blinking (or visible, in case
    * blinking is disabled).
    *
    * This function should be called in response to user input (e.g. from
    * derived classes that override the textview's event handlers).
    */
  def resetCursorBlink(): Unit = gtk_text_view_reset_cursor_blink(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Reset the input method context of the text view if needed.
    *
    * This can be necessary in the case where modifying the buffer would confuse
    * on-going input method behavior.
    */
  def resetImContext(): Unit = gtk_text_view_reset_im_context(
    this.raw.asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Scrolls @text_view the minimum distance such that @mark is contained
    * within the visible area of the widget.
    */
  def scrollMarkOnscreen(mark: TextMark): Unit =
    gtk_text_view_scroll_mark_onscreen(
      this.raw.asInstanceOf,
      mark.getUnsafeRawPointer().asInstanceOf
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Scrolls @text_view so that @iter is on the screen in the position
    * indicated by @xalign and @yalign.
    *
    * An alignment of 0.0 indicates left or top, 1.0 indicates right or bottom,
    * 0.5 means center. If @use_align is %FALSE, the text scrolls the minimal
    * distance to get the mark onscreen, possibly not scrolling at all. The
    * effective screen for purposes of this function is reduced by a margin of
    * size @within_margin.
    *
    * Note that this function uses the currently-computed height of the lines in
    * the text buffer. Line heights are computed in an idle handler; so this
    * function may not have the desired effect if it’s called before the height
    * computations. To avoid oddness, consider using
    * [method@Gtk.TextView.scroll_to_mark] which saves a point to be scrolled to
    * after line validation.
    */
  def scrollToIter(
      iter: Ptr[GtkTextIter],
      within_margin: Double,
      use_align: Boolean,
      xalign: Double,
      yalign: Double
  ): Boolean = gtk_text_view_scroll_to_iter(
    this.raw.asInstanceOf,
    iter,
    within_margin,
    gboolean(gint((if use_align == true then 1 else 0))),
    xalign,
    yalign
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Scrolls @text_view so that @mark is on the screen in the position
    * indicated by @xalign and @yalign.
    *
    * An alignment of 0.0 indicates left or top, 1.0 indicates right or bottom,
    * 0.5 means center. If @use_align is %FALSE, the text scrolls the minimal
    * distance to get the mark onscreen, possibly not scrolling at all. The
    * effective screen for purposes of this function is reduced by a margin of
    * size @within_margin.
    */
  def scrollToMark(
      mark: TextMark,
      within_margin: Double,
      use_align: Boolean,
      xalign: Double,
      yalign: Double
  ): Unit = gtk_text_view_scroll_to_mark(
    this.raw.asInstanceOf,
    mark.getUnsafeRawPointer().asInstanceOf,
    within_margin,
    gboolean(gint((if use_align == true then 1 else 0))),
    xalign,
    yalign
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the behavior of the text widget when the <kbd>Tab</kbd> key is
    * pressed.
    *
    * If @accepts_tab is %TRUE, a tab character is inserted. If @accepts_tab is
    * %FALSE the keyboard focus is moved to the next widget in the focus chain.
    *
    * Focus can always be moved using <kbd>Ctrl</kbd>+<kbd>Tab</kbd>.
    */
  def setAcceptsTab(accepts_tab: Boolean): Unit = gtk_text_view_set_accepts_tab(
    this.raw.asInstanceOf,
    gboolean(gint((if accepts_tab == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the bottom margin for text in @text_view.
    *
    * Note that this function is confusingly named. In CSS terms, the value set
    * here is padding.
    */
  def setBottomMargin(bottom_margin: Int): Unit =
    gtk_text_view_set_bottom_margin(this.raw.asInstanceOf, bottom_margin)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets @buffer as the buffer being displayed by @text_view.
    *
    * The previous buffer displayed by the text view is unreferenced, and a
    * reference is added to @buffer. If you owned a reference to @buffer before
    * passing it to this function, you must remove that reference yourself;
    * `GtkTextView` will not “adopt” it.
    */
  def setBuffer(buffer: TextBuffer): Unit = gtk_text_view_set_buffer(
    this.raw.asInstanceOf,
    buffer.getUnsafeRawPointer().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Toggles whether the insertion point should be displayed.
    *
    * A buffer with no editable text probably shouldn’t have a visible cursor,
    * so you may want to turn the cursor off.
    *
    * Note that this property may be overridden by the
    * [property@Gtk.Settings:gtk-keynav-use-caret] setting.
    */
  def setCursorVisible(setting: Boolean): Unit =
    gtk_text_view_set_cursor_visible(
      this.raw.asInstanceOf,
      gboolean(gint((if setting == true then 1 else 0)))
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the default editability of the `GtkTextView`.
    *
    * You can override this default setting with tags in the buffer, using the
    * “editable” attribute of tags.
    */
  def setEditable(setting: Boolean): Unit = gtk_text_view_set_editable(
    this.raw.asInstanceOf,
    gboolean(gint((if setting == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets a menu model to add when constructing the context menu for @text_view.
    *
    * You can pass %NULL to remove a previously set extra menu.
    */
  def setExtraMenu(model: MenuModel): Unit = gtk_text_view_set_extra_menu(
    this.raw.asInstanceOf,
    model.getUnsafeRawPointer().asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Places @widget into the gutter specified by @win.
    *
    * @win
    *   must be one of %GTK_TEXT_WINDOW_LEFT, %GTK_TEXT_WINDOW_RIGHT,
    *   %GTK_TEXT_WINDOW_TOP, or %GTK_TEXT_WINDOW_BOTTOM.
    */
  def setGutter(win: GtkTextWindowType, widget: Widget): Unit =
    gtk_text_view_set_gutter(
      this.raw.asInstanceOf,
      win,
      widget.getUnsafeRawPointer().asInstanceOf
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the default indentation for paragraphs in @text_view.
    *
    * Tags in the buffer may override the default.
    */
  def setIndent(indent: Int): Unit =
    gtk_text_view_set_indent(this.raw.asInstanceOf, indent)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the `input-hints` of the `GtkTextView`.
    *
    * The `input-hints` allow input methods to fine-tune their behaviour.
    */
  def setInputHints(hints: GtkInputHints): Unit =
    gtk_text_view_set_input_hints(this.raw.asInstanceOf, hints)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the `input-purpose` of the `GtkTextView`.
    *
    * The `input-purpose` can be used by on-screen keyboards and other input
    * methods to adjust their behaviour.
    */
  def setInputPurpose(purpose: GtkInputPurpose): Unit =
    gtk_text_view_set_input_purpose(this.raw.asInstanceOf, purpose)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the default justification of text in @text_view.
    *
    * Tags in the view’s buffer may override the default.
    */
  def setJustification(justification: GtkJustification): Unit =
    gtk_text_view_set_justification(this.raw.asInstanceOf, justification)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the default left margin for text in @text_view.
    *
    * Tags in the buffer may override the default.
    *
    * Note that this function is confusingly named. In CSS terms, the value set
    * here is padding.
    */
  def setLeftMargin(left_margin: Int): Unit =
    gtk_text_view_set_left_margin(this.raw.asInstanceOf, left_margin)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether the `GtkTextView` should display text in monospace styling.
    */
  def setMonospace(monospace: Boolean): Unit = gtk_text_view_set_monospace(
    this.raw.asInstanceOf,
    gboolean(gint((if monospace == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Changes the `GtkTextView` overwrite mode.
    */
  def setOverwrite(overwrite: Boolean): Unit = gtk_text_view_set_overwrite(
    this.raw.asInstanceOf,
    gboolean(gint((if overwrite == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the default number of blank pixels above paragraphs in @text_view.
    *
    * Tags in the buffer for @text_view may override the defaults.
    */
  def setPixelsAboveLines(pixels_above_lines: Int): Unit =
    gtk_text_view_set_pixels_above_lines(
      this.raw.asInstanceOf,
      pixels_above_lines
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the default number of pixels of blank space to put below paragraphs
    * in @text_view.
    *
    * May be overridden by tags applied to @text_view’s buffer.
    */
  def setPixelsBelowLines(pixels_below_lines: Int): Unit =
    gtk_text_view_set_pixels_below_lines(
      this.raw.asInstanceOf,
      pixels_below_lines
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the default number of pixels of blank space to leave between
    * display/wrapped lines within a paragraph.
    *
    * May be overridden by tags in @text_view’s buffer.
    */
  def setPixelsInsideWrap(pixels_inside_wrap: Int): Unit =
    gtk_text_view_set_pixels_inside_wrap(
      this.raw.asInstanceOf,
      pixels_inside_wrap
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the default right margin for text in the text view.
    *
    * Tags in the buffer may override the default.
    *
    * Note that this function is confusingly named. In CSS terms, the value set
    * here is padding.
    */
  def setRightMargin(right_margin: Int): Unit =
    gtk_text_view_set_right_margin(this.raw.asInstanceOf, right_margin)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the default tab stops for paragraphs in @text_view.
    *
    * Tags in the buffer may override the default.
    */
  def setTabs(tabs: Ptr[PangoTabArray]): Unit =
    gtk_text_view_set_tabs(this.raw.asInstanceOf, tabs)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the top margin for text in @text_view.
    *
    * Note that this function is confusingly named. In CSS terms, the value set
    * here is padding.
    */
  def setTopMargin(top_margin: Int): Unit =
    gtk_text_view_set_top_margin(this.raw.asInstanceOf, top_margin)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the line wrapping for the view.
    */
  def setWrapMode(wrap_mode: GtkWrapMode): Unit =
    gtk_text_view_set_wrap_mode(this.raw.asInstanceOf, wrap_mode)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Determines whether @iter is at the start of a display line.
    *
    * See [method@Gtk.TextView.forward_display_line] for an explanation of
    * display lines vs. paragraphs.
    */
  def startsDisplayLine(iter: Ptr[GtkTextIter]): Boolean =
    gtk_text_view_starts_display_line(this.raw.asInstanceOf, iter).value.!=(0)

  @annotation.compileTimeOnly(
    "Method window_to_buffer_coords contains an OUT parameter, which is not supported yet"
  )
  def windowToBufferCoords() = ???

end TextView

object TextView:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkTextView`.
    *
    * If you don’t call [method@Gtk.TextView.set_buffer] before using the text
    * view, an empty default buffer will be created for you. Get the buffer with
    * [method@Gtk.TextView.get_buffer]. If you want to specify your own buffer,
    * consider [ctor@Gtk.TextView.new_with_buffer].
    */
  def apply(): TextView = new TextView(gtk_text_view_new().asInstanceOf)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new `GtkTextView` widget displaying the buffer @buffer.
    *
    * One buffer can be shared among many widgets. @buffer may be %NULL to
    * create a default buffer, in which case this function is equivalent to
    * [ctor@Gtk.TextView.new]. The text view adds its own reference count to the
    * buffer; it does not take over an existing reference.
    */
  def withBuffer(buffer: TextBuffer): TextView = new TextView(
    gtk_text_view_new_with_buffer(
      buffer.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )
end TextView
