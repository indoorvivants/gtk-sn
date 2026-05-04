package sn.gnome.pango.fluent

import _root_.sn.gnome.pango.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.{gboolean, gint, guint}
import sn.gnome.gobject.fluent.Object
import sn.gnome.pango.fluent.{
  Alignment,
  Context,
  Direction,
  EllipsizeMode,
  Layout,
  LayoutSerializeFlags,
  WrapMode
}
import sn.gnome.pango.internal.PangoLayout

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A `PangoLayout` structure represents an entire paragraph of text.
  *
  * While complete access to the layout capabilities of Pango is provided using
  * the detailed interfaces for itemization and shaping, using that
  * functionality directly involves writing a fairly large amount of code.
  * `PangoLayout` provides a high-level driver for formatting entire paragraphs
  * of text at once. This includes paragraph-level functionality such as line
  * breaking, justification, alignment and ellipsization.
  *
  * A `PangoLayout` is initialized with a `PangoContext`, UTF-8 string and set
  * of attributes for that string. Once that is done, the set of formatted lines
  * can be extracted from the object, the layout can be rendered, and conversion
  * between logical character positions within the layout's text, and the
  * physical position of the resulting glyphs can be made.
  *
  * There are a number of parameters to adjust the formatting of a
  * `PangoLayout`. The following image shows adjustable parameters (on the left)
  * and font metrics (on the right):
  *
  * <picture> <source srcset="layout-dark.png" media="(prefers-color-scheme:
  * dark)"> <img alt="Pango Layout Parameters" src="layout-light.png">
  * </picture>
  *
  * The following images demonstrate the effect of alignment and justification
  * on the layout of text:
  *
  * |                                   |                                                    |
  * |:----------------------------------|:---------------------------------------------------|
  * | ![align=left](align-left.png)     | ![align=left, justify](align-left-justify.png)     |
  * | ![align=center](align-center.png) | ![align=center, justify](align-center-justify.png) |
  * | ![align=right](align-right.png)   | ![align=right, justify](align-right-justify.png)   |
  *
  * It is possible, as well, to ignore the 2-D setup, and simply treat the
  * results of a `PangoLayout` as a list of lines.
  */
class Layout(raw: Ptr[PangoLayout]) extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Forces recomputation of any state in the `PangoLayout` that might depend
    * on the layout's context.
    *
    * This function should be called if you make changes to the context
    * subsequent to creating the layout.
    */
  def contextChanged(): Unit /* None */ = pango_layout_context_changed(
    this.raw.asInstanceOf[Ptr[PangoLayout]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a deep copy-by-value of the layout.
    *
    * The attribute list, tab array, and text from the original layout are all
    * copied by value.
    */
  def copy(): Layout /* None */ = new Layout(
    pango_layout_copy(this.raw.asInstanceOf[Ptr[PangoLayout]]).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the alignment for the layout: how partial lines are positioned within
    * the horizontal space available.
    */
  def getAlignment(): Alignment /* None */ = Alignment.fromRaw(
    pango_layout_get_alignment(this.raw.asInstanceOf[Ptr[PangoLayout]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the attribute list for the layout, if any.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(AttrList), @type -> DataRecord(PangoAttrList*)))"
  )
  def getAttributes__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets whether to calculate the base direction for the layout according to
    * its contents.
    *
    * See [method@Pango.Layout.set_auto_dir].
    */
  def getAutoDir(): Boolean /* None */ = pango_layout_get_auto_dir(
    this.raw.asInstanceOf[Ptr[PangoLayout]]
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the Y position of baseline of the first line in @layout.
    */
  def getBaseline(): Int /* None */ = pango_layout_get_baseline(
    this.raw.asInstanceOf[Ptr[PangoLayout]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Given an index within a layout, determines the positions that of the
    * strong and weak cursors if the insertion point is at that index.
    *
    * This is a variant of [method@Pango.Layout.get_cursor_pos] that applies
    * font metric information about caret slope and offset to the positions it
    * returns.
    *
    * <picture> <source srcset="caret-metrics-dark.png"
    * media="(prefers-color-scheme: dark)"> <img alt="Caret metrics"
    * src="caret-metrics-light.png"> </picture>
    */
  @annotation.compileTimeOnly(
    "Method get_caret_pos contains an OUT parameter, which is not supported yet"
  )
  def getCaretPos__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the number of Unicode characters in the the text of @layout.
    */
  def getCharacterCount(): Int /* None */ = pango_layout_get_character_count(
    this.raw.asInstanceOf[Ptr[PangoLayout]]
  ).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the `PangoContext` used for this layout.
    */
  def getContext(): Context /* None */ = new Context(
    pango_layout_get_context(
      this.raw.asInstanceOf[Ptr[PangoLayout]]
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Given an index within a layout, determines the positions that of the
    * strong and weak cursors if the insertion point is at that index.
    *
    * The position of each cursor is stored as a zero-width rectangle with the
    * height of the run extents.
    *
    * <picture> <source srcset="cursor-positions-dark.png"
    * media="(prefers-color-scheme: dark)"> <img alt="Cursor positions"
    * src="cursor-positions-light.png"> </picture>
    *
    * The strong cursor location is the location where characters of the
    * directionality equal to the base direction of the layout are inserted. The
    * weak cursor location is the location where characters of the
    * directionality opposite to the base direction of the layout are inserted.
    *
    * The following example shows text with both a strong and a weak cursor.
    *
    * <picture> <source srcset="split-cursor-dark.png"
    * media="(prefers-color-scheme: dark)"> <img alt="Strong and weak cursors"
    * src="split-cursor-light.png"> </picture>
    *
    * The strong cursor has a little arrow pointing to the right, the weak
    * cursor to the left. Typing a 'c' in this situation will insert the
    * character after the 'b', and typing another Hebrew character, like 'ג',
    * will insert it at the end.
    */
  @annotation.compileTimeOnly(
    "Method get_cursor_pos contains an OUT parameter, which is not supported yet"
  )
  def getCursorPos__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the text direction at the given character position in @layout.
    */
  def getDirection(index: Int /* Some(CInt) */ ): Direction /* None */ =
    Direction.fromRaw(
      pango_layout_get_direction(this.raw.asInstanceOf[Ptr[PangoLayout]], index)
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the type of ellipsization being performed for @layout.
    *
    * See [method@Pango.Layout.set_ellipsize].
    *
    * Use [method@Pango.Layout.is_ellipsized] to query whether any paragraphs
    * were actually ellipsized.
    */
  def getEllipsize(): EllipsizeMode /* None */ = EllipsizeMode.fromRaw(
    pango_layout_get_ellipsize(this.raw.asInstanceOf[Ptr[PangoLayout]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Computes the logical and ink extents of @layout.
    *
    * Logical extents are usually what you want for positioning things. Note
    * that both extents may have non-zero x and y. You may want to use those to
    * offset where you render the layout. Not doing that is a very typical bug
    * that shows up as right-to-left layouts not being correctly positioned in a
    * layout with a set width.
    *
    * The extents are given in layout coordinates and in Pango units; layout
    * coordinates begin at the top left corner of the layout.
    */
  @annotation.compileTimeOnly(
    "Method get_extents contains an OUT parameter, which is not supported yet"
  )
  def getExtents__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the font description for the layout, if any.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(FontDescription), @type -> DataRecord(const PangoFontDescription*)))"
  )
  def getFontDescription__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the height of layout used for ellipsization.
    *
    * See [method@Pango.Layout.set_height] for details.
    */
  def getHeight(): Int /* None */ = pango_layout_get_height(
    this.raw.asInstanceOf[Ptr[PangoLayout]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the paragraph indent width in Pango units.
    *
    * A negative value indicates a hanging indentation.
    */
  def getIndent(): Int /* None */ = pango_layout_get_indent(
    this.raw.asInstanceOf[Ptr[PangoLayout]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns an iterator to iterate over the visual extents of the layout.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(LayoutIter), @type -> DataRecord(PangoLayoutIter*)))"
  )
  def getIter__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets whether each complete line should be stretched to fill the entire
    * width of the layout.
    */
  def getJustify(): Boolean /* None */ = pango_layout_get_justify(
    this.raw.asInstanceOf[Ptr[PangoLayout]]
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets whether the last line should be stretched to fill the entire width of
    * the layout.
    */
  def getJustifyLastLine(): Boolean /* None */ =
    pango_layout_get_justify_last_line(
      this.raw.asInstanceOf[Ptr[PangoLayout]]
    ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves a particular line from a `PangoLayout`.
    *
    * Use the faster [method@Pango.Layout.get_line_readonly] if you do not plan
    * to modify the contents of the line (glyphs, glyph widths, etc.).
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(LayoutLine), @type -> DataRecord(PangoLayoutLine*)))"
  )
  def getLine__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the count of lines for the @layout.
    */
  def getLineCount(): Int /* None */ = pango_layout_get_line_count(
    this.raw.asInstanceOf[Ptr[PangoLayout]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves a particular line from a `PangoLayout`.
    *
    * This is a faster alternative to [method@Pango.Layout.get_line], but the
    * user is not expected to modify the contents of the line (glyphs, glyph
    * widths, etc.).
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(LayoutLine), @type -> DataRecord(PangoLayoutLine*)))"
  )
  def getLineReadonly__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the line spacing factor of @layout.
    *
    * See [method@Pango.Layout.set_line_spacing].
    */
  def getLineSpacing(): Float /* None */ = pango_layout_get_line_spacing(
    this.raw.asInstanceOf[Ptr[PangoLayout]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the lines of the @layout as a list.
    *
    * Use the faster [method@Pango.Layout.get_lines_readonly] if you do not plan
    * to modify the contents of the lines (glyphs, glyph widths, etc.).
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(LayoutLine))))),ListMap(@name -> DataRecord(GLib.SList), @type -> DataRecord(GSList*)))"
  )
  def getLines__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the lines of the @layout as a list.
    *
    * This is a faster alternative to [method@Pango.Layout.get_lines], but the
    * user is not expected to modify the contents of the lines (glyphs, glyph
    * widths, etc.).
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(LayoutLine))))),ListMap(@name -> DataRecord(GLib.SList), @type -> DataRecord(GSList*)))"
  )
  def getLinesReadonly__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves an array of logical attributes for each character in the @layout.
    */
  @annotation.compileTimeOnly(
    "Method get_log_attrs contains an OUT parameter, which is not supported yet"
  )
  def getLogAttrs__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves an array of logical attributes for each character in the @layout.
    *
    * This is a faster alternative to [method@Pango.Layout.get_log_attrs]. The
    * returned array is part of @layout and must not be modified. Modifying the
    * layout will invalidate the returned array.
    *
    * The number of attributes returned in @n_attrs will be one more than the
    * total number of characters in the layout, since there need to be
    * attributes corresponding to both the position before the first character
    * and the position after the last character.
    */
  @annotation.compileTimeOnly(
    "Method get_log_attrs_readonly contains an OUT parameter, which is not supported yet"
  )
  def getLogAttrsReadonly__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Computes the logical and ink extents of @layout in device units.
    *
    * This function just calls [method@Pango.Layout.get_extents] followed by two
    * [func@extents_to_pixels] calls, rounding @ink_rect and @logical_rect such
    * that the rounded rectangles fully contain the unrounded one (that is,
    * passes them as first argument to [func@Pango.extents_to_pixels]).
    */
  @annotation.compileTimeOnly(
    "Method get_pixel_extents contains an OUT parameter, which is not supported yet"
  )
  def getPixelExtents__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Determines the logical width and height of a `PangoLayout` in device
    * units.
    *
    * [method@Pango.Layout.get_size] returns the width and height scaled by
    * %PANGO_SCALE. This is simply a convenience function around
    * [method@Pango.Layout.get_pixel_extents].
    */
  @annotation.compileTimeOnly(
    "Method get_pixel_size contains an OUT parameter, which is not supported yet"
  )
  def getPixelSize__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the current serial number of @layout.
    *
    * The serial number is initialized to an small number larger than zero when
    * a new layout is created and is increased whenever the layout is changed
    * using any of the setter functions, or the `PangoContext` it uses has
    * changed. The serial may wrap, but will never have the value 0. Since it
    * can wrap, never compare it with "less than", always use "not equals".
    *
    * This can be used to automatically detect changes to a `PangoLayout`, and
    * is useful for example to decide whether a layout needs redrawing. To force
    * the serial to be increased, use [method@Pango.Layout.context_changed].
    */
  def getSerial(): UInt /* None */ = pango_layout_get_serial(
    this.raw.asInstanceOf[Ptr[PangoLayout]]
  ).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Obtains whether @layout is in single paragraph mode.
    *
    * See [method@Pango.Layout.set_single_paragraph_mode].
    */
  def getSingleParagraphMode(): Boolean /* None */ =
    pango_layout_get_single_paragraph_mode(
      this.raw.asInstanceOf[Ptr[PangoLayout]]
    ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Determines the logical width and height of a `PangoLayout` in Pango units.
    *
    * This is simply a convenience function around
    * [method@Pango.Layout.get_extents].
    */
  @annotation.compileTimeOnly(
    "Method get_size contains an OUT parameter, which is not supported yet"
  )
  def getSize__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the amount of spacing between the lines of the layout.
    */
  def getSpacing(): Int /* None */ = pango_layout_get_spacing(
    this.raw.asInstanceOf[Ptr[PangoLayout]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the current `PangoTabArray` used by this layout.
    *
    * If no `PangoTabArray` has been set, then the default tabs are in use and
    * %NULL is returned. Default tabs are every 8 spaces.
    *
    * The return value should be freed with [method@Pango.TabArray.free].
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(TabArray), @type -> DataRecord(PangoTabArray*)))"
  )
  def getTabs__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the text in the layout.
    *
    * The returned text should not be freed or modified.
    */
  def getText()(using Zone): String /* None */ = fromCString(
    pango_layout_get_text(this.raw.asInstanceOf[Ptr[PangoLayout]]).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Counts the number of unknown glyphs in @layout.
    *
    * This function can be used to determine if there are any fonts available to
    * render all characters in a certain string, or when used in combination
    * with %PANGO_ATTR_FALLBACK, to check if a certain font supports all the
    * characters in the string.
    */
  def getUnknownGlyphsCount(): Int /* None */ =
    pango_layout_get_unknown_glyphs_count(
      this.raw.asInstanceOf[Ptr[PangoLayout]]
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the width to which the lines of the `PangoLayout` should wrap.
    */
  def getWidth(): Int /* None */ = pango_layout_get_width(
    this.raw.asInstanceOf[Ptr[PangoLayout]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the wrap mode for the layout.
    *
    * Use [method@Pango.Layout.is_wrapped] to query whether any paragraphs were
    * actually wrapped.
    */
  def getWrap(): WrapMode /* None */ = WrapMode.fromRaw(
    pango_layout_get_wrap(this.raw.asInstanceOf[Ptr[PangoLayout]])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Converts from byte @index_ within the @layout to line and X position.
    *
    * The X position is measured from the left edge of the line.
    */
  @annotation.compileTimeOnly(
    "Method index_to_line_x contains an OUT parameter, which is not supported yet"
  )
  def indexToLineX__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Converts from an index within a `PangoLayout` to the onscreen position
    * corresponding to the grapheme at that index.
    *
    * The returns is represented as rectangle. Note that `pos->x` is always the
    * leading edge of the grapheme and `pos->x + pos->width` the trailing edge
    * of the grapheme. If the directionality of the grapheme is right-to-left,
    * then `pos->width` will be negative.
    */
  @annotation.compileTimeOnly(
    "Method index_to_pos contains an OUT parameter, which is not supported yet"
  )
  def indexToPos__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Queries whether the layout had to ellipsize any paragraphs.
    *
    * This returns %TRUE if the ellipsization mode for @layout is not
    * %PANGO_ELLIPSIZE_NONE, a positive width is set on @layout, and there are
    * paragraphs exceeding that width that have to be ellipsized.
    */
  def isEllipsized(): Boolean /* None */ = pango_layout_is_ellipsized(
    this.raw.asInstanceOf[Ptr[PangoLayout]]
  ).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Queries whether the layout had to wrap any paragraphs.
    *
    * This returns %TRUE if a positive width is set on @layout, ellipsization
    * mode of @layout is set to %PANGO_ELLIPSIZE_NONE, and there are paragraphs
    * exceeding the layout width that have to be wrapped.
    */
  def isWrapped(): Boolean /* None */ =
    pango_layout_is_wrapped(this.raw.asInstanceOf[Ptr[PangoLayout]]).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Computes a new cursor position from an old position and a direction.
    *
    * If @direction is positive, then the new position will cause the strong or
    * weak cursor to be displayed one position to right of where it was with the
    * old cursor position. If @direction is negative, it will be moved to the
    * left.
    *
    * In the presence of bidirectional text, the correspondence between logical
    * and visual order will depend on the direction of the current run, and
    * there may be jumps when the cursor is moved off of the end of a run.
    *
    * Motion here is in cursor positions, not in characters, so a single call to
    * this function may move the cursor over multiple characters when multiple
    * characters combine to form a single grapheme.
    */
  @annotation.compileTimeOnly(
    "Method move_cursor_visually contains an OUT parameter, which is not supported yet"
  )
  def moveCursorVisually__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Serializes the @layout for later deserialization via
    * [func@Pango.Layout.deserialize].
    *
    * There are no guarantees about the format of the output across different
    * versions of Pango and [func@Pango.Layout.deserialize] will reject data
    * that it cannot parse.
    *
    * The intended use of this function is testing, benchmarking and debugging.
    * The format is not meant as a permanent storage format.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Bytes), @type -> DataRecord(GBytes*)))"
  )
  def serialize__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the alignment for the layout: how partial lines are positioned within
    * the horizontal space available.
    *
    * The default alignment is %PANGO_ALIGN_LEFT.
    */
  def setAlignment(
      alignment: Alignment /* Some(PangoAlignment) */
  ): Unit /* None */ = pango_layout_set_alignment(
    this.raw.asInstanceOf[Ptr[PangoLayout]],
    alignment.raw
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the text attributes for a layout object.
    *
    * References @attrs, so the caller can unref its reference.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(AttrList), @type -> DataRecord(PangoAttrList*)))"
  )
  def setAttributes__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether to calculate the base direction for the layout according to
    * its contents.
    *
    * When this flag is on (the default), then paragraphs in @layout that begin
    * with strong right-to-left characters (Arabic and Hebrew principally), will
    * have right-to-left layout, paragraphs with letters from other scripts will
    * have left-to-right layout. Paragraphs with only neutral characters get
    * their direction from the surrounding paragraphs.
    *
    * When %FALSE, the choice between left-to-right and right-to-left layout is
    * done according to the base direction of the layout's `PangoContext`. (See
    * [method@Pango.Context.set_base_dir]).
    *
    * When the auto-computed direction of a paragraph differs from the base
    * direction of the context, the interpretation of %PANGO_ALIGN_LEFT and
    * %PANGO_ALIGN_RIGHT are swapped.
    */
  def setAutoDir(
      auto_dir: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = pango_layout_set_auto_dir(
    this.raw.asInstanceOf[Ptr[PangoLayout]],
    gboolean(gint((if auto_dir == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the type of ellipsization being performed for @layout.
    *
    * Depending on the ellipsization mode @ellipsize text is removed from the
    * start, middle, or end of text so they fit within the width and height of
    * layout set with [method@Pango.Layout.set_width] and
    * [method@Pango.Layout.set_height].
    *
    * If the layout contains characters such as newlines that force it to be
    * layed out in multiple paragraphs, then whether each paragraph is
    * ellipsized separately or the entire layout is ellipsized as a whole
    * depends on the set height of the layout.
    *
    * The default value is %PANGO_ELLIPSIZE_NONE.
    *
    * See [method@Pango.Layout.set_height] for details.
    */
  def setEllipsize(
      ellipsize: EllipsizeMode /* Some(PangoEllipsizeMode) */
  ): Unit /* None */ = pango_layout_set_ellipsize(
    this.raw.asInstanceOf[Ptr[PangoLayout]],
    ellipsize.raw
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the default font description for the layout.
    *
    * If no font description is set on the layout, the font description from the
    * layout's context is used.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(FontDescription), @type -> DataRecord(const PangoFontDescription*)))"
  )
  def setFontDescription__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the height to which the `PangoLayout` should be ellipsized at.
    *
    * There are two different behaviors, based on whether @height is positive or
    * negative.
    *
    * If @height is positive, it will be the maximum height of the layout. Only
    * lines would be shown that would fit, and if there is any text omitted, an
    * ellipsis added. At least one line is included in each paragraph regardless
    * of how small the height value is. A value of zero will render exactly one
    * line for the entire layout.
    *
    * If @height is negative, it will be the (negative of) maximum number of
    * lines per paragraph. That is, the total number of lines shown may well be
    * more than this value if the layout contains multiple paragraphs of text.
    * The default value of -1 means that the first line of each paragraph is
    * ellipsized. This behavior may be changed in the future to act per layout
    * instead of per paragraph. File a bug against pango at
    * [https://gitlab.gnome.org/gnome/pango](https://gitlab.gnome.org/gnome/pango)
    * if your code relies on this behavior.
    *
    * Height setting only has effect if a positive width is set on
    * @layout
    *   and ellipsization mode of @layout is not %PANGO_ELLIPSIZE_NONE. The
    *   behavior is undefined if a height other than -1 is set and ellipsization
    *   mode is set to %PANGO_ELLIPSIZE_NONE, and may change in the future.
    */
  def setHeight(height: Int /* Some(CInt) */ ): Unit /* None */ =
    pango_layout_set_height(this.raw.asInstanceOf[Ptr[PangoLayout]], height)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the width in Pango units to indent each paragraph.
    *
    * A negative value of @indent will produce a hanging indentation. That is,
    * the first line will have the full width, and subsequent lines will be
    * indented by the absolute value of @indent.
    *
    * The indent setting is ignored if layout alignment is set to
    * %PANGO_ALIGN_CENTER.
    *
    * The default value is 0.
    */
  def setIndent(indent: Int /* Some(CInt) */ ): Unit /* None */ =
    pango_layout_set_indent(this.raw.asInstanceOf[Ptr[PangoLayout]], indent)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether each complete line should be stretched to fill the entire
    * width of the layout.
    *
    * Stretching is typically done by adding whitespace, but for some scripts
    * (such as Arabic), the justification may be done in more complex ways, like
    * extending the characters.
    *
    * Note that this setting is not implemented and so is ignored in Pango older
    * than 1.18.
    *
    * Note that tabs and justification conflict with each other: Justification
    * will move content away from its tab-aligned positions.
    *
    * The default value is %FALSE.
    *
    * Also see [method@Pango.Layout.set_justify_last_line].
    */
  def setJustify(
      justify: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = pango_layout_set_justify(
    this.raw.asInstanceOf[Ptr[PangoLayout]],
    gboolean(gint((if justify == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets whether the last line should be stretched to fill the entire width of
    * the layout.
    *
    * This only has an effect if [method@Pango.Layout.set_justify] has been
    * called as well.
    *
    * The default value is %FALSE.
    */
  def setJustifyLastLine(
      justify: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = pango_layout_set_justify_last_line(
    this.raw.asInstanceOf[Ptr[PangoLayout]],
    gboolean(gint((if justify == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets a factor for line spacing.
    *
    * Typical values are: 0, 1, 1.5, 2. The default values is 0.
    *
    * If @factor is non-zero, lines are placed so that
    *
    * baseline2 = baseline1 + factor * height2
    *
    * where height2 is the line height of the second line (as determined by the
    * font(s)). In this case, the spacing set with
    * [method@Pango.Layout.set_spacing] is ignored.
    *
    * If @factor is zero (the default), spacing is applied as before.
    *
    * Note: for semantics that are closer to the CSS line-height property, see
    * [func@Pango.attr_line_height_new].
    */
  def setLineSpacing(factor: Float /* Some(Float) */ ): Unit /* None */ =
    pango_layout_set_line_spacing(
      this.raw.asInstanceOf[Ptr[PangoLayout]],
      factor.asInstanceOf
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the layout text and attribute list from marked-up text.
    *
    * See [Pango Markup](pango_markup.html)).
    *
    * Replaces the current text and attribute list.
    *
    * This is the same as [method@Pango.Layout.set_markup_with_accel], but the
    * markup text isn't scanned for accelerators.
    */
  def setMarkup(
      markup: String | CString /* Some(CString) */,
      length: Int /* Some(CInt) */
  )(using Zone): Unit /* None */ = pango_layout_set_markup(
    this.raw.asInstanceOf[Ptr[PangoLayout]],
    __sn_extract_string(markup),
    length
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the layout text and attribute list from marked-up text.
    *
    * See [Pango Markup](pango_markup.html)).
    *
    * Replaces the current text and attribute list.
    *
    * If @accel_marker is nonzero, the given character will mark the character
    * following it as an accelerator. For example, @accel_marker might be an
    * ampersand or underscore. All characters marked as an accelerator will
    * receive a %PANGO_UNDERLINE_LOW attribute, and the first character so
    * marked will be returned in @accel_char. Two @accel_marker characters
    * following each other produce a single literal @accel_marker character.
    */
  @annotation.compileTimeOnly(
    "Method set_markup_with_accel contains an OUT parameter, which is not supported yet"
  )
  def setMarkupWithAccel__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the single paragraph mode of @layout.
    *
    * If @setting is %TRUE, do not treat newlines and similar characters as
    * paragraph separators; instead, keep all text in a single paragraph, and
    * display a glyph for paragraph separator characters. Used when you want to
    * allow editing of newlines on a single text line.
    *
    * The default value is %FALSE.
    */
  def setSingleParagraphMode(
      setting: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ = pango_layout_set_single_paragraph_mode(
    this.raw.asInstanceOf[Ptr[PangoLayout]],
    gboolean(gint((if setting == true then 1 else 0)))
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the amount of spacing in Pango units between the lines of the layout.
    *
    * When placing lines with spacing, Pango arranges things so that
    *
    * line2.top = line1.bottom + spacing
    *
    * The default value is 0.
    *
    * Note: Since 1.44, Pango is using the line height (as determined by the
    * font) for placing lines when the line spacing factor is set to a non-zero
    * value with [method@Pango.Layout.set_line_spacing]. In that case, the @spacing
    * set with this function is ignored.
    *
    * Note: for semantics that are closer to the CSS line-height property, see
    * [func@Pango.attr_line_height_new].
    */
  def setSpacing(spacing: Int /* Some(CInt) */ ): Unit /* None */ =
    pango_layout_set_spacing(this.raw.asInstanceOf[Ptr[PangoLayout]], spacing)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the tabs to use for @layout, overriding the default tabs.
    *
    * `PangoLayout` will place content at the next tab position whenever it
    * meets a Tab character (U+0009).
    *
    * By default, tabs are every 8 spaces. If @tabs is %NULL, the default tabs
    * are reinstated. @tabs is copied into the layout; you must free your copy
    * of @tabs yourself.
    *
    * Note that tabs and justification conflict with each other: Justification
    * will move content away from its tab-aligned positions. The same is true
    * for alignments other than %PANGO_ALIGN_LEFT.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(TabArray), @type -> DataRecord(PangoTabArray*)))"
  )
  def setTabs__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the text of the layout.
    *
    * This function validates @text and renders invalid UTF-8 with a placeholder
    * glyph.
    *
    * Note that if you have used [method@Pango.Layout.set_markup] or
    * [method@Pango.Layout.set_markup_with_accel] on @layout before, you may
    * want to call [method@Pango.Layout.set_attributes] to clear the attributes
    * set on the layout from the markup as this function does not clear
    * attributes.
    */
  def setText(
      text: String | CString /* Some(CString) */,
      length: Int /* Some(CInt) */
  )(using Zone): Unit /* None */ = pango_layout_set_text(
    this.raw.asInstanceOf[Ptr[PangoLayout]],
    __sn_extract_string(text),
    length
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the width to which the lines of the `PangoLayout` should wrap or
    * ellipsized.
    *
    * The default value is -1: no width set.
    */
  def setWidth(width: Int /* Some(CInt) */ ): Unit /* None */ =
    pango_layout_set_width(this.raw.asInstanceOf[Ptr[PangoLayout]], width)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the wrap mode.
    *
    * The wrap mode only has effect if a width is set on the layout with
    * [method@Pango.Layout.set_width]. To turn off wrapping, set the width to
    * -1.
    *
    * The default value is %PANGO_WRAP_WORD.
    */
  def setWrap(wrap: WrapMode /* Some(PangoWrapMode) */ ): Unit /* None */ =
    pango_layout_set_wrap(this.raw.asInstanceOf[Ptr[PangoLayout]], wrap.raw)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * A convenience method to serialize a layout to a file.
    *
    * It is equivalent to calling [method@Pango.Layout.serialize] followed by
    * [func@GLib.file_set_contents].
    *
    * See those two functions for details on the arguments.
    *
    * It is mostly intended for use inside a debugger to quickly dump a layout
    * to a file for later inspection.
    */
  def writeToFile(
      flags: LayoutSerializeFlags /* Some(PangoLayoutSerializeFlags) */,
      filename: String | CString /* Some(CString) */
  )(using Zone): GResult[Boolean /* None */ ] = GResult.wrap(__errorPtr =>
    pango_layout_write_to_file(
      this.raw.asInstanceOf[Ptr[PangoLayout]],
      flags.raw,
      __sn_extract_string(filename),
      __errorPtr
    ).value.!=(0)
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Converts from X and Y position within a layout to the byte index to the
    * character at that logical position.
    *
    * If the Y position is not inside the layout, the closest position is chosen
    * (the position will be clamped inside the layout). If the X position is not
    * within the layout, then the start or the end of the line is chosen as
    * described for [method@Pango.LayoutLine.x_to_index]. If either the X or Y
    * positions were not inside the layout, then the function returns %FALSE; on
    * an exact hit, it returns %TRUE.
    */
  @annotation.compileTimeOnly(
    "Method xy_to_index contains an OUT parameter, which is not supported yet"
  )
  def xyToIndex__ = ???

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end Layout

object Layout:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Create a new `PangoLayout` object with attributes initialized to default
    * values for a particular `PangoContext`.
    */
  def apply(context: Context /* Some(Ptr[PangoContext]) */ ): Layout =
    new Layout(
      pango_layout_new(context.getUnsafeRawPointer().asInstanceOf).asInstanceOf
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Loads data previously created via [method@Pango.Layout.serialize].
    *
    * For a discussion of the supported format, see that function.
    *
    * Note: to verify that the returned layout is identical to the one that was
    * serialized, you can compare @bytes to the result of serializing the layout
    * again.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Bytes), @type -> DataRecord(GBytes*)))"
  )
  def deserialize() = ???

end Layout
