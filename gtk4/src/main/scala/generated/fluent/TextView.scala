package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.Event
import sn.gnome.gio.MenuModel
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
  ConstraintTarget,
  DeleteType,
  InputHints,
  InputPurpose,
  Justification,
  MovementStep,
  ScrollStep,
  Scrollable,
  TextBuffer,
  TextChildAnchor,
  TextMark,
  TextWindowType,
  Widget,
  WrapMode
}
import sn.gnome.gtk4.internal.{
  GtkDeleteType,
  GtkMovementStep,
  GtkScrollStep,
  GtkTextView
}
import sn.gnome.pango.Context
import sn.gnome.runtime.*

/** A widget that displays the contents of a [class@Gtk.TextBuffer].
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
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class TextView private[gnome] (raw: Ptr[GtkTextView])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget,
      Scrollable:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Adds a child widget in the text buffer, at the given @anchor.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def addChildAtAnchor(
      child: sn.gnome.gtk4.Widget /* Some(Ptr[GtkWidget]) */,
      anchor: sn.gnome.gtk4.TextChildAnchor /* Some(Ptr[GtkTextChildAnchor]) */
  )(using Runtime): Unit /* None */ =
    gtk_text_view_add_child_at_anchor(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextView]],
      child.getUnsafeRawPointer().asInstanceOf,
      anchor.getUnsafeRawPointer().asInstanceOf
    )
  end addChildAtAnchor

  /** Adds @child at a fixed coordinate in the `GtkTextView`'s text window.
    *
    * The @xpos and @ypos must be in buffer coordinates (see
    * [method@Gtk.TextView.get_iter_location] to convert to buffer coordinates).
    *
    * @child
    *   will scroll with the text view.
    *
    * If instead you want a widget that will not move with the `GtkTextView`
    * contents see `GtkOverlay`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def addOverlay(
      child: sn.gnome.gtk4.Widget /* Some(Ptr[GtkWidget]) */,
      xpos: Int /* Some(CInt) */,
      ypos: Int /* Some(CInt) */
  )(using Runtime): Unit /* None */ =
    gtk_text_view_add_overlay(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextView]],
      child.getUnsafeRawPointer().asInstanceOf,
      xpos,
      ypos
    )
  end addOverlay

  /** Moves the given @iter backward by one display (wrapped) line.
    *
    * A display line is different from a paragraph. Paragraphs are separated by
    * newlines or other paragraph separator characters. Display lines are
    * created by line-wrapping a paragraph. If wrapping is turned off, display
    * lines and paragraphs will be the same. Display lines are divided
    * differently for each view, since they depend on the view’s width;
    * paragraphs are the same in all views, since they depend on the contents of
    * the `GtkTextBuffer`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method backward_display_line/<method parameters>/iter]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TextIter), @type -> DataRecord(GtkTextIter*)))"
  )
  private def backwardDisplayLine__ = ???

  /** Moves the given @iter backward to the next display line start.
    *
    * A display line is different from a paragraph. Paragraphs are separated by
    * newlines or other paragraph separator characters. Display lines are
    * created by line-wrapping a paragraph. If wrapping is turned off, display
    * lines and paragraphs will be the same. Display lines are divided
    * differently for each view, since they depend on the view’s width;
    * paragraphs are the same in all views, since they depend on the contents of
    * the `GtkTextBuffer`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method backward_display_line_start/<method parameters>/iter]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TextIter), @type -> DataRecord(GtkTextIter*)))"
  )
  private def backwardDisplayLineStart__ = ???

  /** Converts buffer coordinates to window coordinates.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method buffer_to_window_coords]: Method buffer_to_window_coords contains an OUT parameter, which is not supported yet"
  )
  private def bufferToWindowCoords__ = ???

  /** Moves the given @iter forward by one display (wrapped) line.
    *
    * A display line is different from a paragraph. Paragraphs are separated by
    * newlines or other paragraph separator characters. Display lines are
    * created by line-wrapping a paragraph. If wrapping is turned off, display
    * lines and paragraphs will be the same. Display lines are divided
    * differently for each view, since they depend on the view’s width;
    * paragraphs are the same in all views, since they depend on the contents of
    * the `GtkTextBuffer`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method forward_display_line/<method parameters>/iter]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TextIter), @type -> DataRecord(GtkTextIter*)))"
  )
  private def forwardDisplayLine__ = ???

  /** Moves the given @iter forward to the next display line end.
    *
    * A display line is different from a paragraph. Paragraphs are separated by
    * newlines or other paragraph separator characters. Display lines are
    * created by line-wrapping a paragraph. If wrapping is turned off, display
    * lines and paragraphs will be the same. Display lines are divided
    * differently for each view, since they depend on the view’s width;
    * paragraphs are the same in all views, since they depend on the contents of
    * the `GtkTextBuffer`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method forward_display_line_end/<method parameters>/iter]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TextIter), @type -> DataRecord(GtkTextIter*)))"
  )
  private def forwardDisplayLineEnd__ = ???

  /** Returns whether pressing the <kbd>Tab</kbd> key inserts a tab characters.
    *
    * See [method@Gtk.TextView.set_accepts_tab].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getAcceptsTab(): Boolean /* None */ =
    gtk_text_view_get_accepts_tab(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextView]]
    ).value.!=(0)
  end getAcceptsTab

  /** Gets the bottom margin for text in the @text_view.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getBottomMargin(): Int /* None */ =
    gtk_text_view_get_bottom_margin(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextView]]
    )
  end getBottomMargin

  /** Returns the `GtkTextBuffer` being displayed by this text view.
    *
    * The reference count on the buffer is not incremented; the caller of this
    * function won’t own a new reference.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getBuffer()(using Runtime): sn.gnome.gtk4.TextBuffer /* None */ =
    sn.gnome.gtk4.TextBuffer.applyUnsafe(
      gtk_text_view_get_buffer(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextView]]
      ).asInstanceOf
    )
  end getBuffer

  /** Determine the positions of the strong and weak cursors if the insertion
    * point is at @iter.
    *
    * The position of each cursor is stored as a zero-width rectangle. The
    * strong cursor location is the location where characters of the
    * directionality equal to the base direction of the paragraph are inserted.
    * The weak cursor location is the location where characters of the
    * directionality opposite to the base direction of the paragraph are
    * inserted.
    *
    * If @iter is %NULL, the actual cursor position is used.
    *
    * Note that if @iter happens to be the actual cursor position, and there is
    * currently an IM preedit sequence being entered, the returned locations
    * will be adjusted to account for the preedit cursor’s offset within the
    * preedit sequence.
    *
    * The rectangle position is in buffer coordinates; use
    * [method@Gtk.TextView.buffer_to_window_coords] to convert these coordinates
    * to coordinates for one of the windows in the text view.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_cursor_locations]: Method get_cursor_locations contains an OUT parameter, which is not supported yet"
  )
  private def getCursorLocations__ = ???

  /** Find out whether the cursor should be displayed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getCursorVisible(): Boolean /* None */ =
    gtk_text_view_get_cursor_visible(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextView]]
    ).value.!=(0)
  end getCursorVisible

  /** Returns the default editability of the `GtkTextView`.
    *
    * Tags in the buffer may override this setting for some ranges of text.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getEditable(): Boolean /* None */ =
    gtk_text_view_get_editable(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextView]]
    ).value.!=(0)
  end getEditable

  /** Gets the menu model that gets added to the context menu or %NULL if none
    * has been set.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getExtraMenu()(using Runtime): sn.gnome.gio.MenuModel /* None */ =
    sn.gnome.gio.MenuModel.applyUnsafe(
      gtk_text_view_get_extra_menu(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextView]]
      ).asInstanceOf
    )
  end getExtraMenu

  /** Gets a `GtkWidget` that has previously been set as gutter.
    *
    * See [method@Gtk.TextView.set_gutter].
    *
    * @win
    *   must be one of %GTK_TEXT_WINDOW_LEFT, %GTK_TEXT_WINDOW_RIGHT,
    *   %GTK_TEXT_WINDOW_TOP, or %GTK_TEXT_WINDOW_BOTTOM.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getGutter(
      win: TextWindowType /* Some(GtkTextWindowType) */
  )(using Runtime): sn.gnome.gtk4.Widget /* None */ =
    sn.gnome.gtk4.Widget.applyUnsafe(
      gtk_text_view_get_gutter(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextView]],
        win.raw
      ).asInstanceOf
    )
  end getGutter

  /** Gets the default indentation of paragraphs in @text_view.
    *
    * Tags in the view’s buffer may override the default. The indentation may be
    * negative.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getIndent(): Int /* None */ =
    gtk_text_view_get_indent(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextView]]
    )
  end getIndent

  /** Gets the `input-hints` of the `GtkTextView`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getInputHints(): InputHints /* None */ =
    InputHints.fromRaw(
      gtk_text_view_get_input_hints(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextView]]
      )
    )
  end getInputHints

  /** Gets the `input-purpose` of the `GtkTextView`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getInputPurpose(): InputPurpose /* None */ =
    InputPurpose.fromRaw(
      gtk_text_view_get_input_purpose(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextView]]
      )
    )
  end getInputPurpose

  /** Retrieves the iterator at buffer coordinates @x and @y.
    *
    * Buffer coordinates are coordinates for the entire buffer, not just the
    * currently-displayed portion. If you have coordinates from an event, you
    * have to convert those to buffer coordinates with
    * [method@Gtk.TextView.window_to_buffer_coords].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_iter_at_location]: Method get_iter_at_location contains an OUT parameter, which is not supported yet"
  )
  private def getIterAtLocation__ = ???

  /** Retrieves the iterator pointing to the character at buffer coordinates @x
    * and @y.
    *
    * Buffer coordinates are coordinates for the entire buffer, not just the
    * currently-displayed portion. If you have coordinates from an event, you
    * have to convert those to buffer coordinates with
    * [method@Gtk.TextView.window_to_buffer_coords].
    *
    * Note that this is different from
    * [method@Gtk.TextView.get_iter_at_location], which returns cursor
    * locations, i.e. positions between characters.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_iter_at_position]: Method get_iter_at_position contains an OUT parameter, which is not supported yet"
  )
  private def getIterAtPosition__ = ???

  /** Gets a rectangle which roughly contains the character at @iter.
    *
    * The rectangle position is in buffer coordinates; use
    * [method@Gtk.TextView.buffer_to_window_coords] to convert these coordinates
    * to coordinates for one of the windows in the text view.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_iter_location]: Method get_iter_location contains an OUT parameter, which is not supported yet"
  )
  private def getIterLocation__ = ???

  /** Gets the default justification of paragraphs in @text_view.
    *
    * Tags in the buffer may override the default.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getJustification(): Justification /* None */ =
    Justification.fromRaw(
      gtk_text_view_get_justification(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextView]]
      )
    )
  end getJustification

  /** Gets the default left margin size of paragraphs in the @text_view.
    *
    * Tags in the buffer may override the default.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getLeftMargin(): Int /* None */ =
    gtk_text_view_get_left_margin(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextView]]
    )
  end getLeftMargin

  /** Gets the `GtkTextIter` at the start of the line containing the coordinate @y.
    *
    * @y
    *   is in buffer coordinates, convert from window coordinates with
    *   [method@Gtk.TextView.window_to_buffer_coords]. If non-%NULL,
    * @line_top
    *   will be filled with the coordinate of the top edge of the line.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_line_at_y]: Method get_line_at_y contains an OUT parameter, which is not supported yet"
  )
  private def getLineAtY__ = ???

  /** Gets the y coordinate of the top of the line containing @iter, and the
    * height of the line.
    *
    * The coordinate is a buffer coordinate; convert to window coordinates with
    * [method@Gtk.TextView.buffer_to_window_coords].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_line_yrange]: Method get_line_yrange contains an OUT parameter, which is not supported yet"
  )
  private def getLineYrange__ = ???

  /** Gets the `PangoContext` that is used for rendering LTR directed text
    * layouts.
    *
    * The context may be replaced when CSS changes occur.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getLtrContext()(using Runtime): sn.gnome.pango.Context /* None */ =
    sn.gnome.pango.Context.applyUnsafe(
      gtk_text_view_get_ltr_context(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextView]]
      ).asInstanceOf
    )
  end getLtrContext

  /** Gets whether the `GtkTextView` uses monospace styling.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getMonospace(): Boolean /* None */ =
    gtk_text_view_get_monospace(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextView]]
    ).value.!=(0)
  end getMonospace

  /** Returns whether the `GtkTextView` is in overwrite mode or not.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getOverwrite(): Boolean /* None */ =
    gtk_text_view_get_overwrite(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextView]]
    ).value.!=(0)
  end getOverwrite

  /** Gets the default number of pixels to put above paragraphs.
    *
    * Adding this function with [method@Gtk.TextView.get_pixels_below_lines] is
    * equal to the line space between each paragraph.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPixelsAboveLines(): Int /* None */ =
    gtk_text_view_get_pixels_above_lines(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextView]]
    )
  end getPixelsAboveLines

  /** Gets the default number of pixels to put below paragraphs.
    *
    * The line space is the sum of the value returned by this function and the
    * value returned by [method@Gtk.TextView.get_pixels_above_lines].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPixelsBelowLines(): Int /* None */ =
    gtk_text_view_get_pixels_below_lines(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextView]]
    )
  end getPixelsBelowLines

  /** Gets the default number of pixels to put between wrapped lines inside a
    * paragraph.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPixelsInsideWrap(): Int /* None */ =
    gtk_text_view_get_pixels_inside_wrap(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextView]]
    )
  end getPixelsInsideWrap

  /** Gets the default right margin for text in @text_view.
    *
    * Tags in the buffer may override the default.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getRightMargin(): Int /* None */ =
    gtk_text_view_get_right_margin(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextView]]
    )
  end getRightMargin

  /** Gets the `PangoContext` that is used for rendering RTL directed text
    * layouts.
    *
    * The context may be replaced when CSS changes occur.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getRtlContext()(using Runtime): sn.gnome.pango.Context /* None */ =
    sn.gnome.pango.Context.applyUnsafe(
      gtk_text_view_get_rtl_context(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextView]]
      ).asInstanceOf
    )
  end getRtlContext

  /** Gets the default tabs for @text_view.
    *
    * Tags in the buffer may override the defaults. The returned array will be
    * %NULL if “standard” (8-space) tabs are used. Free the return value with
    * [method@Pango.TabArray.free].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_tabs/return type]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Pango.TabArray), @type -> DataRecord(PangoTabArray*)))"
  )
  private def getTabs__ = ???

  /** Gets the top margin for text in the @text_view.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getTopMargin(): Int /* None */ =
    gtk_text_view_get_top_margin(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextView]]
    )
  end getTopMargin

  /** Fills @visible_rect with the currently-visible region of the buffer, in
    * buffer coordinates.
    *
    * Convert to window coordinates with
    * [method@Gtk.TextView.buffer_to_window_coords].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_visible_rect]: Method get_visible_rect contains an OUT parameter, which is not supported yet"
  )
  private def getVisibleRect__ = ???

  /** Gets the line wrapping for the view.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getWrapMode(): WrapMode /* None */ =
    WrapMode.fromRaw(
      gtk_text_view_get_wrap_mode(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextView]]
      )
    )
  end getWrapMode

  /** Allow the `GtkTextView` input method to internally handle key press and
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def imContextFilterKeypress(
      event: sn.gnome.gdk4.Event /* Some(Ptr[_root_.sn.gnome.gdk4.internal.GdkEvent]) */
  )(using Runtime): Boolean /* None */ =
    gtk_text_view_im_context_filter_keypress(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextView]],
      event.getUnsafeRawPointer().asInstanceOf
    ).value.!=(0)
  end imContextFilterKeypress

  /** Moves a mark within the buffer so that it's located within the
    * currently-visible text area.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def moveMarkOnscreen(
      mark: sn.gnome.gtk4.TextMark /* Some(Ptr[GtkTextMark]) */
  )(using Runtime): Boolean /* None */ =
    gtk_text_view_move_mark_onscreen(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextView]],
      mark.getUnsafeRawPointer().asInstanceOf
    ).value.!=(0)
  end moveMarkOnscreen

  /** Updates the position of a child.
    *
    * See [method@Gtk.TextView.add_overlay].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def moveOverlay(
      child: sn.gnome.gtk4.Widget /* Some(Ptr[GtkWidget]) */,
      xpos: Int /* Some(CInt) */,
      ypos: Int /* Some(CInt) */
  )(using Runtime): Unit /* None */ =
    gtk_text_view_move_overlay(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextView]],
      child.getUnsafeRawPointer().asInstanceOf,
      xpos,
      ypos
    )
  end moveOverlay

  /** Move the iterator a given number of characters visually, treating it as
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method move_visually/<method parameters>/iter]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TextIter), @type -> DataRecord(GtkTextIter*)))"
  )
  private def moveVisually__ = ???

  /** Moves the cursor to the currently visible region of the buffer.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def placeCursorOnscreen(): Boolean /* None */ =
    gtk_text_view_place_cursor_onscreen(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextView]]
    ).value.!=(0)
  end placeCursorOnscreen

  /** Removes a child widget from @text_view.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def remove(
      child: sn.gnome.gtk4.Widget /* Some(Ptr[GtkWidget]) */
  )(using Runtime): Unit /* None */ =
    gtk_text_view_remove(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextView]],
      child.getUnsafeRawPointer().asInstanceOf
    )
  end remove

  /** Ensures that the cursor is shown.
    *
    * This also resets the time that it will stay blinking (or visible, in case
    * blinking is disabled).
    *
    * This function should be called in response to user input (e.g. from
    * derived classes that override the textview's event handlers).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def resetCursorBlink(): Unit /* None */ =
    gtk_text_view_reset_cursor_blink(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextView]]
    )
  end resetCursorBlink

  /** Reset the input method context of the text view if needed.
    *
    * This can be necessary in the case where modifying the buffer would confuse
    * on-going input method behavior.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def resetImContext(): Unit /* None */ =
    gtk_text_view_reset_im_context(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextView]]
    )
  end resetImContext

  /** Scrolls @text_view the minimum distance such that @mark is contained
    * within the visible area of the widget.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def scrollMarkOnscreen(
      mark: sn.gnome.gtk4.TextMark /* Some(Ptr[GtkTextMark]) */
  )(using Runtime): Unit /* None */ =
    gtk_text_view_scroll_mark_onscreen(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextView]],
      mark.getUnsafeRawPointer().asInstanceOf
    )
  end scrollMarkOnscreen

  /** Scrolls @text_view so that @iter is on the screen in the position
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method scroll_to_iter/<method parameters>/iter]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TextIter), @type -> DataRecord(GtkTextIter*)))"
  )
  private def scrollToIter__ = ???

  /** Scrolls @text_view so that @mark is on the screen in the position
    * indicated by @xalign and @yalign.
    *
    * An alignment of 0.0 indicates left or top, 1.0 indicates right or bottom,
    * 0.5 means center. If @use_align is %FALSE, the text scrolls the minimal
    * distance to get the mark onscreen, possibly not scrolling at all. The
    * effective screen for purposes of this function is reduced by a margin of
    * size @within_margin.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def scrollToMark(
      mark: sn.gnome.gtk4.TextMark /* Some(Ptr[GtkTextMark]) */,
      within_margin: Double /* Some(Double) */,
      use_align: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */,
      xalign: Double /* Some(Double) */,
      yalign: Double /* Some(Double) */
  )(using Runtime): Unit /* None */ =
    gtk_text_view_scroll_to_mark(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextView]],
      mark.getUnsafeRawPointer().asInstanceOf,
      within_margin,
      gboolean(gint((if use_align == true then 1 else 0))),
      xalign,
      yalign
    )
  end scrollToMark

  /** Sets the behavior of the text widget when the <kbd>Tab</kbd> key is
    * pressed.
    *
    * If @accepts_tab is %TRUE, a tab character is inserted. If @accepts_tab is
    * %FALSE the keyboard focus is moved to the next widget in the focus chain.
    *
    * Focus can always be moved using <kbd>Ctrl</kbd>+<kbd>Tab</kbd>.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setAcceptsTab(
      accepts_tab: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_text_view_set_accepts_tab(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextView]],
      gboolean(gint((if accepts_tab == true then 1 else 0)))
    )
  end setAcceptsTab

  /** Sets the bottom margin for text in @text_view.
    *
    * Note that this function is confusingly named. In CSS terms, the value set
    * here is padding.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setBottomMargin(bottom_margin: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_text_view_set_bottom_margin(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextView]],
      bottom_margin
    )
  end setBottomMargin

  /** Sets @buffer as the buffer being displayed by @text_view.
    *
    * The previous buffer displayed by the text view is unreferenced, and a
    * reference is added to @buffer. If you owned a reference to @buffer before
    * passing it to this function, you must remove that reference yourself;
    * `GtkTextView` will not “adopt” it.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setBuffer(
      buffer: Option[sn.gnome.gtk4.TextBuffer /* Some(Ptr[GtkTextBuffer]) */ ]
  )(using Runtime): Unit /* None */ =
    gtk_text_view_set_buffer(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextView]],
      buffer
        .map[Ptr[GtkTextBuffer]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkTextBuffer]])
    )
  end setBuffer

  /** Toggles whether the insertion point should be displayed.
    *
    * A buffer with no editable text probably shouldn’t have a visible cursor,
    * so you may want to turn the cursor off.
    *
    * Note that this property may be overridden by the
    * [property@Gtk.Settings:gtk-keynav-use-caret] setting.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setCursorVisible(
      setting: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_text_view_set_cursor_visible(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextView]],
      gboolean(gint((if setting == true then 1 else 0)))
    )
  end setCursorVisible

  /** Sets the default editability of the `GtkTextView`.
    *
    * You can override this default setting with tags in the buffer, using the
    * “editable” attribute of tags.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setEditable(
      setting: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_text_view_set_editable(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextView]],
      gboolean(gint((if setting == true then 1 else 0)))
    )
  end setEditable

  /** Sets a menu model to add when constructing the context menu for @text_view.
    *
    * You can pass %NULL to remove a previously set extra menu.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setExtraMenu(
      model: Option[
        sn.gnome.gio.MenuModel /* Some(Ptr[_root_.sn.gnome.gio.internal.GMenuModel]) */
      ]
  )(using Runtime): Unit /* None */ =
    gtk_text_view_set_extra_menu(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextView]],
      model
        .map[Ptr[_root_.sn.gnome.gio.internal.GMenuModel]](o =>
          o.getUnsafeRawPointer().asInstanceOf
        )
        .getOrElse(
          null.asInstanceOf[Ptr[_root_.sn.gnome.gio.internal.GMenuModel]]
        )
    )
  end setExtraMenu

  /** Places @widget into the gutter specified by @win.
    *
    * @win
    *   must be one of %GTK_TEXT_WINDOW_LEFT, %GTK_TEXT_WINDOW_RIGHT,
    *   %GTK_TEXT_WINDOW_TOP, or %GTK_TEXT_WINDOW_BOTTOM.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setGutter(
      win: TextWindowType /* Some(GtkTextWindowType) */,
      widget: Option[sn.gnome.gtk4.Widget /* Some(Ptr[GtkWidget]) */ ]
  )(using Runtime): Unit /* None */ =
    gtk_text_view_set_gutter(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextView]],
      win.raw,
      widget
        .map[Ptr[GtkWidget]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkWidget]])
    )
  end setGutter

  /** Sets the default indentation for paragraphs in @text_view.
    *
    * Tags in the buffer may override the default.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setIndent(indent: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_text_view_set_indent(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextView]],
      indent
    )
  end setIndent

  /** Sets the `input-hints` of the `GtkTextView`.
    *
    * The `input-hints` allow input methods to fine-tune their behaviour.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setInputHints(
      hints: InputHints /* Some(GtkInputHints) */
  ): Unit /* None */ =
    gtk_text_view_set_input_hints(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextView]],
      hints.raw
    )
  end setInputHints

  /** Sets the `input-purpose` of the `GtkTextView`.
    *
    * The `input-purpose` can be used by on-screen keyboards and other input
    * methods to adjust their behaviour.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setInputPurpose(
      purpose: InputPurpose /* Some(GtkInputPurpose) */
  ): Unit /* None */ =
    gtk_text_view_set_input_purpose(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextView]],
      purpose.raw
    )
  end setInputPurpose

  /** Sets the default justification of text in @text_view.
    *
    * Tags in the view’s buffer may override the default.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setJustification(
      justification: Justification /* Some(GtkJustification) */
  ): Unit /* None */ =
    gtk_text_view_set_justification(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextView]],
      justification.raw
    )
  end setJustification

  /** Sets the default left margin for text in @text_view.
    *
    * Tags in the buffer may override the default.
    *
    * Note that this function is confusingly named. In CSS terms, the value set
    * here is padding.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setLeftMargin(left_margin: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_text_view_set_left_margin(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextView]],
      left_margin
    )
  end setLeftMargin

  /** Sets whether the `GtkTextView` should display text in monospace styling.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setMonospace(
      monospace: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_text_view_set_monospace(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextView]],
      gboolean(gint((if monospace == true then 1 else 0)))
    )
  end setMonospace

  /** Changes the `GtkTextView` overwrite mode.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setOverwrite(
      overwrite: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_text_view_set_overwrite(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextView]],
      gboolean(gint((if overwrite == true then 1 else 0)))
    )
  end setOverwrite

  /** Sets the default number of blank pixels above paragraphs in @text_view.
    *
    * Tags in the buffer for @text_view may override the defaults.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setPixelsAboveLines(
      pixels_above_lines: Int /* Some(CInt) */
  ): Unit /* None */ =
    gtk_text_view_set_pixels_above_lines(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextView]],
      pixels_above_lines
    )
  end setPixelsAboveLines

  /** Sets the default number of pixels of blank space to put below paragraphs
    * in @text_view.
    *
    * May be overridden by tags applied to @text_view’s buffer.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setPixelsBelowLines(
      pixels_below_lines: Int /* Some(CInt) */
  ): Unit /* None */ =
    gtk_text_view_set_pixels_below_lines(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextView]],
      pixels_below_lines
    )
  end setPixelsBelowLines

  /** Sets the default number of pixels of blank space to leave between
    * display/wrapped lines within a paragraph.
    *
    * May be overridden by tags in @text_view’s buffer.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setPixelsInsideWrap(
      pixels_inside_wrap: Int /* Some(CInt) */
  ): Unit /* None */ =
    gtk_text_view_set_pixels_inside_wrap(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextView]],
      pixels_inside_wrap
    )
  end setPixelsInsideWrap

  /** Sets the default right margin for text in the text view.
    *
    * Tags in the buffer may override the default.
    *
    * Note that this function is confusingly named. In CSS terms, the value set
    * here is padding.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setRightMargin(right_margin: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_text_view_set_right_margin(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextView]],
      right_margin
    )
  end setRightMargin

  /** Sets the default tab stops for paragraphs in @text_view.
    *
    * Tags in the buffer may override the default.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_tabs/<method parameters>/tabs]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(Pango.TabArray), @type -> DataRecord(PangoTabArray*)))"
  )
  private def setTabs__ = ???

  /** Sets the top margin for text in @text_view.
    *
    * Note that this function is confusingly named. In CSS terms, the value set
    * here is padding.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setTopMargin(top_margin: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_text_view_set_top_margin(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextView]],
      top_margin
    )
  end setTopMargin

  /** Sets the line wrapping for the view.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setWrapMode(
      wrap_mode: WrapMode /* Some(GtkWrapMode) */
  ): Unit /* None */ =
    gtk_text_view_set_wrap_mode(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextView]],
      wrap_mode.raw
    )
  end setWrapMode

  /** Determines whether @iter is at the start of a display line.
    *
    * See [method@Gtk.TextView.forward_display_line] for an explanation of
    * display lines vs. paragraphs.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method starts_display_line/<method parameters>/iter]: Rendering references to records is not supported yet: Type(List(),ListMap(@name -> DataRecord(TextIter), @type -> DataRecord(const GtkTextIter*)))"
  )
  private def startsDisplayLine__ = ???

  /** Converts coordinates on the window identified by @win to buffer
    * coordinates.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method window_to_buffer_coords]: Method window_to_buffer_coords contains an OUT parameter, which is not supported yet"
  )
  private def windowToBufferCoords__ = ???

  /** Gets emitted when the user asks for it.
    *
    * The ::backspace signal is a [keybinding signal](class.SignalAction.html).
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
          self: Ptr[GtkTextView],
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

  /** Gets emitted to copy the selection to the clipboard.
    *
    * The ::copy-clipboard signal is a [keybinding
    * signal](class.SignalAction.html).
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
          self: Ptr[GtkTextView],
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

  /** Gets emitted to cut the selection to the clipboard.
    *
    * The ::cut-clipboard signal is a [keybinding
    * signal](class.SignalAction.html).
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
          self: Ptr[GtkTextView],
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

  /** Gets emitted when the user initiates a text deletion.
    *
    * The ::delete-from-cursor signal is a [keybinding
    * signal](class.SignalAction.html).
    *
    * If the @type is %GTK_DELETE_CHARS, GTK deletes the selection if there is
    * one, otherwise it deletes the requested number of characters.
    *
    * The default bindings for this signal are <kbd>Delete</kbd> for deleting a
    * character, <kbd>Ctrl</kbd>+<kbd>Delete</kbd> for deleting a word and
    * <kbd>Ctrl</kbd>+<kbd>Backspace</kbd> for deleting a word backwards.
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
          self: Ptr[GtkTextView],
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

  /** Emitted when the selection needs to be extended at @location.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[signal extend-selection]: Signal param/return type cannot be serialised: Type(List(),ListMap(@name -> DataRecord(TextIter)))"
  )
  private def onExtendSelection = ???

  /** Gets emitted when the user initiates the insertion of a fixed string at
    * the cursor.
    *
    * The ::insert-at-cursor signal is a [keybinding
    * signal](class.SignalAction.html).
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
          self: Ptr[GtkTextView],
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

  /** Gets emitted to present the Emoji chooser for the @text_view.
    *
    * The ::insert-emoji signal is a [keybinding
    * signal](class.SignalAction.html).
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
          self: Ptr[GtkTextView],
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

  /** Gets emitted when the user initiates a cursor movement.
    *
    * The ::move-cursor signal is a [keybinding
    * signal](class.SignalAction.html). If the cursor is not visible in @text_view,
    * this signal causes the viewport to be moved instead.
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
    *   - <kbd>PgUp</kbd> and <kbd>PgDn</kbd> move vertically by pages
    *   - <kbd>Ctrl</kbd>+<kbd>PgUp</kbd> and <kbd>Ctrl</kbd>+<kbd>PgDn</kbd>
    *     move horizontally by pages
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onMoveCursor(
      handler: (
          (step: MovementStep, count: Int, extendSelection: Boolean)
      ) => Unit
  )(using Runtime) =
    type SignalRegType = SignalRegistration[
      this.type,
      (step: MovementStep, count: Int, extendSelection: Boolean),
      Unit
    ]
    val c_handler = CFuncPtr5.fromScalaFunction {
      (
          self: Ptr[GtkTextView],
          step: GtkMovementStep /* param */,
          count: Int /* param */,
          extendSelection: Boolean /* param */,
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(
          (
            step = MovementStep.fromRaw(step),
            count = count,
            extendSelection = extendSelection
          )
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

  /** Gets emitted to move the viewport.
    *
    * The ::move-viewport signal is a [keybinding
    * signal](class.SignalAction.html), which can be bound to key combinations
    * to allow the user to move the viewport, i.e. change what part of the text
    * view is visible in a containing scrolled window.
    *
    * There are no default bindings for this signal.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onMoveViewport(handler: ((step: ScrollStep, count: Int)) => Unit)(using
      Runtime
  ) =
    type SignalRegType =
      SignalRegistration[this.type, (step: ScrollStep, count: Int), Unit]
    val c_handler = CFuncPtr4.fromScalaFunction {
      (
          self: Ptr[GtkTextView],
          step: GtkScrollStep /* param */,
          count: Int /* param */,
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler((step = ScrollStep.fromRaw(step), count = count))
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
    val signal = c"move-viewport"
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
  end onMoveViewport

  /** Gets emitted to paste the contents of the clipboard into the text view.
    *
    * The ::paste-clipboard signal is a [keybinding
    * signal](class.SignalAction.html).
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
          self: Ptr[GtkTextView],
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

  /** Emitted when preedit text of the active IM changes.
    *
    * If an input method is used, the typed text will not immediately be
    * committed to the buffer. So if you are interested in the text, connect to
    * this signal.
    *
    * This signal is only emitted if the text at the given position is actually
    * editable.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onPreeditChanged(handler: ((preedit: String)) => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, (preedit: String), Unit]
    val c_handler = CFuncPtr3.fromScalaFunction {
      (
          self: Ptr[GtkTextView],
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

  /** Gets emitted to select or unselect the complete contents of the text view.
    *
    * The ::select-all signal is a [keybinding signal](class.SignalAction.html).
    *
    * The default bindings for this signal are <kbd>Ctrl</kbd>+<kbd>a</kbd> and
    * <kbd>Ctrl</kbd>+<kbd>/</kbd> for selecting and
    * <kbd>Shift</kbd>+<kbd>Ctrl</kbd>+<kbd>a</kbd> and
    * <kbd>Ctrl</kbd>+<kbd>\</kbd> for unselecting.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onSelectAll(handler: ((select: Boolean)) => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, (select: Boolean), Unit]
    val c_handler = CFuncPtr3.fromScalaFunction {
      (
          self: Ptr[GtkTextView],
          select: Boolean /* param */,
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler((select = select))
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
    val signal = c"select-all"
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
  end onSelectAll

  /** Gets emitted when the user initiates settings the "anchor" mark.
    *
    * The ::set-anchor signal is a [keybinding signal](class.SignalAction.html)
    * which gets emitted when the user initiates setting the "anchor" mark. The
    * "anchor" mark gets placed at the same position as the "insert" mark.
    *
    * This signal has no default bindings.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onSetAnchor(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkTextView],
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
    val signal = c"set-anchor"
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
  end onSetAnchor

  /** Gets emitted to toggle the `cursor-visible` property.
    *
    * The ::toggle-cursor-visible signal is a [keybinding
    * signal](class.SignalAction.html).
    *
    * The default binding for this signal is <kbd>F7</kbd>.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onToggleCursorVisible(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkTextView],
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
    val signal = c"toggle-cursor-visible"
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
  end onToggleCursorVisible

  /** Gets emitted to toggle the overwrite mode of the text view.
    *
    * The ::toggle-overwrite signal is a [keybinding
    * signal](class.SignalAction.html).
    *
    * The default binding for this signal is <kbd>Insert</kbd>.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onToggleOverwrite(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GtkTextView],
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
end TextView

object TextView:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkTextView])(using Runtime) = summon[Runtime]
    .getOrCreate[TextView](ptr.asInstanceOf[Ptr[Byte]], p => new TextView(ptr))

  /** Creates a new `GtkTextView`.
    *
    * If you don’t call [method@Gtk.TextView.set_buffer] before using the text
    * view, an empty default buffer will be created for you. Get the buffer with
    * [method@Gtk.TextView.get_buffer]. If you want to specify your own buffer,
    * consider [ctor@Gtk.TextView.new_with_buffer].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply()(using Runtime): TextView =
    val raw: Ptr[Byte] = gtk_text_view_new().asInstanceOf
    summon[Runtime]
      .getOrCreate[TextView](raw, r => TextView.applyUnsafe(r.asInstanceOf))
  end apply

  /** Creates a new `GtkTextView` widget displaying the buffer @buffer.
    *
    * One buffer can be shared among many widgets. @buffer may be %NULL to
    * create a default buffer, in which case this function is equivalent to
    * [ctor@Gtk.TextView.new]. The text view adds its own reference count to the
    * buffer; it does not take over an existing reference.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def withBuffer(
      buffer: sn.gnome.gtk4.TextBuffer /* Some(Ptr[GtkTextBuffer]) */
  )(using Runtime): TextView =
    val raw: Ptr[Byte] = gtk_text_view_new_with_buffer(
      buffer.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
    summon[Runtime]
      .getOrCreate[TextView](raw, r => TextView.applyUnsafe(r.asInstanceOf))
  end withBuffer
end TextView
