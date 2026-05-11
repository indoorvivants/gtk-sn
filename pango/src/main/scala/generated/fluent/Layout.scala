package sn.gnome.pango.fluent

import _root_.sn.gnome.pango.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.{gboolean, gint, guint}
import sn.gnome.gobject.fluent.Object
import sn.gnome.gobject.runtime.*
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

/** A `PangoLayout` structure represents an entire paragraph of text.
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
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class Layout private[gnome] (raw: Ptr[PangoLayout])
    extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Forces recomputation of any state in the `PangoLayout` that might depend
    * on the layout's context.
    *
    * This function should be called if you make changes to the context
    * subsequent to creating the layout.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def contextChanged(): Unit /* None */ =
    pango_layout_context_changed(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoLayout]]
    )
  end contextChanged

  /** Creates a deep copy-by-value of the layout.
    *
    * The attribute list, tab array, and text from the original layout are all
    * copied by value.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def copy()(using Runtime): sn.gnome.pango.fluent.Layout /* None */ =
    sn.gnome.pango.fluent.Layout.applyUnsafe(
      pango_layout_copy(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoLayout]]
      ).asInstanceOf
    )
  end copy

  /** Gets the alignment for the layout: how partial lines are positioned within
    * the horizontal space available.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getAlignment(): Alignment /* None */ =
    Alignment.fromRaw(
      pango_layout_get_alignment(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoLayout]]
      )
    )
  end getAlignment

  /** Gets the attribute list for the layout, if any.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_attributes/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AttrList), @type -> DataRecord(PangoAttrList*)))"
  )
  private def getAttributes__ = ???

  /** Gets whether to calculate the base direction for the layout according to
    * its contents.
    *
    * See [method@Pango.Layout.set_auto_dir].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getAutoDir(): Boolean /* None */ =
    pango_layout_get_auto_dir(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoLayout]]
    ).value.!=(0)
  end getAutoDir

  /** Gets the Y position of baseline of the first line in @layout.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getBaseline(): Int /* None */ =
    pango_layout_get_baseline(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoLayout]]
    )
  end getBaseline

  /** Given an index within a layout, determines the positions that of the
    * strong and weak cursors if the insertion point is at that index.
    *
    * This is a variant of [method@Pango.Layout.get_cursor_pos] that applies
    * font metric information about caret slope and offset to the positions it
    * returns.
    *
    * <picture> <source srcset="caret-metrics-dark.png"
    * media="(prefers-color-scheme: dark)"> <img alt="Caret metrics"
    * src="caret-metrics-light.png"> </picture>
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_caret_pos]: Method get_caret_pos contains an OUT parameter, which is not supported yet"
  )
  private def getCaretPos__ = ???

  /** Returns the number of Unicode characters in the the text of @layout.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getCharacterCount(): Int /* None */ =
    pango_layout_get_character_count(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoLayout]]
    ).value
  end getCharacterCount

  /** Retrieves the `PangoContext` used for this layout.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getContext()(using Runtime): sn.gnome.pango.fluent.Context /* None */ =
    sn.gnome.pango.fluent.Context.applyUnsafe(
      pango_layout_get_context(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoLayout]]
      ).asInstanceOf
    )
  end getContext

  /** Given an index within a layout, determines the positions that of the
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_cursor_pos]: Method get_cursor_pos contains an OUT parameter, which is not supported yet"
  )
  private def getCursorPos__ = ???

  /** Gets the text direction at the given character position in @layout.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDirection(index: Int /* Some(CInt) */ ): Direction /* None */ =
    Direction.fromRaw(
      pango_layout_get_direction(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoLayout]],
        index
      )
    )
  end getDirection

  /** Gets the type of ellipsization being performed for @layout.
    *
    * See [method@Pango.Layout.set_ellipsize].
    *
    * Use [method@Pango.Layout.is_ellipsized] to query whether any paragraphs
    * were actually ellipsized.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getEllipsize(): EllipsizeMode /* None */ =
    EllipsizeMode.fromRaw(
      pango_layout_get_ellipsize(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoLayout]]
      )
    )
  end getEllipsize

  /** Computes the logical and ink extents of @layout.
    *
    * Logical extents are usually what you want for positioning things. Note
    * that both extents may have non-zero x and y. You may want to use those to
    * offset where you render the layout. Not doing that is a very typical bug
    * that shows up as right-to-left layouts not being correctly positioned in a
    * layout with a set width.
    *
    * The extents are given in layout coordinates and in Pango units; layout
    * coordinates begin at the top left corner of the layout.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_extents]: Method get_extents contains an OUT parameter, which is not supported yet"
  )
  private def getExtents__ = ???

  /** Gets the font description for the layout, if any.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_font_description/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(FontDescription), @type -> DataRecord(const PangoFontDescription*)))"
  )
  private def getFontDescription__ = ???

  /** Gets the height of layout used for ellipsization.
    *
    * See [method@Pango.Layout.set_height] for details.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getHeight(): Int /* None */ =
    pango_layout_get_height(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoLayout]]
    )
  end getHeight

  /** Gets the paragraph indent width in Pango units.
    *
    * A negative value indicates a hanging indentation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getIndent(): Int /* None */ =
    pango_layout_get_indent(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoLayout]]
    )
  end getIndent

  /** Returns an iterator to iterate over the visual extents of the layout.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_iter/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(LayoutIter), @type -> DataRecord(PangoLayoutIter*)))"
  )
  private def getIter__ = ???

  /** Gets whether each complete line should be stretched to fill the entire
    * width of the layout.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getJustify(): Boolean /* None */ =
    pango_layout_get_justify(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoLayout]]
    ).value.!=(0)
  end getJustify

  /** Gets whether the last line should be stretched to fill the entire width of
    * the layout.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getJustifyLastLine(): Boolean /* None */ =
    pango_layout_get_justify_last_line(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoLayout]]
    ).value.!=(0)
  end getJustifyLastLine

  /** Retrieves a particular line from a `PangoLayout`.
    *
    * Use the faster [method@Pango.Layout.get_line_readonly] if you do not plan
    * to modify the contents of the line (glyphs, glyph widths, etc.).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_line/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(LayoutLine), @type -> DataRecord(PangoLayoutLine*)))"
  )
  private def getLine__ = ???

  /** Retrieves the count of lines for the @layout.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getLineCount(): Int /* None */ =
    pango_layout_get_line_count(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoLayout]]
    )
  end getLineCount

  /** Retrieves a particular line from a `PangoLayout`.
    *
    * This is a faster alternative to [method@Pango.Layout.get_line], but the
    * user is not expected to modify the contents of the line (glyphs, glyph
    * widths, etc.).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_line_readonly/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(LayoutLine), @type -> DataRecord(PangoLayoutLine*)))"
  )
  private def getLineReadonly__ = ???

  /** Gets the line spacing factor of @layout.
    *
    * See [method@Pango.Layout.set_line_spacing].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getLineSpacing(): Float /* None */ =
    pango_layout_get_line_spacing(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoLayout]]
    )
  end getLineSpacing

  /** Returns the lines of the @layout as a list.
    *
    * Use the faster [method@Pango.Layout.get_lines_readonly] if you do not plan
    * to modify the contents of the lines (glyphs, glyph widths, etc.).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_lines/return type]: Cannot render type Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(LayoutLine))))),ListMap(@name -> DataRecord(GLib.SList), @type -> DataRecord(GSList*)))"
  )
  private def getLines__ = ???

  /** Returns the lines of the @layout as a list.
    *
    * This is a faster alternative to [method@Pango.Layout.get_lines], but the
    * user is not expected to modify the contents of the lines (glyphs, glyph
    * widths, etc.).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_lines_readonly/return type]: Cannot render type Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(LayoutLine))))),ListMap(@name -> DataRecord(GLib.SList), @type -> DataRecord(GSList*)))"
  )
  private def getLinesReadonly__ = ???

  /** Retrieves an array of logical attributes for each character in the @layout.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_log_attrs]: Method get_log_attrs contains an OUT parameter, which is not supported yet"
  )
  private def getLogAttrs__ = ???

  /** Retrieves an array of logical attributes for each character in the @layout.
    *
    * This is a faster alternative to [method@Pango.Layout.get_log_attrs]. The
    * returned array is part of @layout and must not be modified. Modifying the
    * layout will invalidate the returned array.
    *
    * The number of attributes returned in @n_attrs will be one more than the
    * total number of characters in the layout, since there need to be
    * attributes corresponding to both the position before the first character
    * and the position after the last character.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_log_attrs_readonly]: Method get_log_attrs_readonly contains an OUT parameter, which is not supported yet"
  )
  private def getLogAttrsReadonly__ = ???

  /** Computes the logical and ink extents of @layout in device units.
    *
    * This function just calls [method@Pango.Layout.get_extents] followed by two
    * [func@extents_to_pixels] calls, rounding @ink_rect and @logical_rect such
    * that the rounded rectangles fully contain the unrounded one (that is,
    * passes them as first argument to [func@Pango.extents_to_pixels]).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_pixel_extents]: Method get_pixel_extents contains an OUT parameter, which is not supported yet"
  )
  private def getPixelExtents__ = ???

  /** Determines the logical width and height of a `PangoLayout` in device
    * units.
    *
    * [method@Pango.Layout.get_size] returns the width and height scaled by
    * %PANGO_SCALE. This is simply a convenience function around
    * [method@Pango.Layout.get_pixel_extents].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_pixel_size]: Method get_pixel_size contains an OUT parameter, which is not supported yet"
  )
  private def getPixelSize__ = ???

  /** Returns the current serial number of @layout.
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSerial(): UInt /* None */ =
    pango_layout_get_serial(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoLayout]]
    ).value
  end getSerial

  /** Obtains whether @layout is in single paragraph mode.
    *
    * See [method@Pango.Layout.set_single_paragraph_mode].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSingleParagraphMode(): Boolean /* None */ =
    pango_layout_get_single_paragraph_mode(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoLayout]]
    ).value.!=(0)
  end getSingleParagraphMode

  /** Determines the logical width and height of a `PangoLayout` in Pango units.
    *
    * This is simply a convenience function around
    * [method@Pango.Layout.get_extents].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_size]: Method get_size contains an OUT parameter, which is not supported yet"
  )
  private def getSize__ = ???

  /** Gets the amount of spacing between the lines of the layout.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSpacing(): Int /* None */ =
    pango_layout_get_spacing(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoLayout]]
    )
  end getSpacing

  /** Gets the current `PangoTabArray` used by this layout.
    *
    * If no `PangoTabArray` has been set, then the default tabs are in use and
    * %NULL is returned. Default tabs are every 8 spaces.
    *
    * The return value should be freed with [method@Pango.TabArray.free].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_tabs/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TabArray), @type -> DataRecord(PangoTabArray*)))"
  )
  private def getTabs__ = ???

  /** Gets the text in the layout.
    *
    * The returned text should not be freed or modified.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getText()(using Zone): String /* None */ =
    fromCString(
      pango_layout_get_text(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoLayout]]
      ).asInstanceOf
    )
  end getText

  /** Counts the number of unknown glyphs in @layout.
    *
    * This function can be used to determine if there are any fonts available to
    * render all characters in a certain string, or when used in combination
    * with %PANGO_ATTR_FALLBACK, to check if a certain font supports all the
    * characters in the string.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getUnknownGlyphsCount(): Int /* None */ =
    pango_layout_get_unknown_glyphs_count(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoLayout]]
    )
  end getUnknownGlyphsCount

  /** Gets the width to which the lines of the `PangoLayout` should wrap.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getWidth(): Int /* None */ =
    pango_layout_get_width(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoLayout]]
    )
  end getWidth

  /** Gets the wrap mode for the layout.
    *
    * Use [method@Pango.Layout.is_wrapped] to query whether any paragraphs were
    * actually wrapped.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getWrap(): WrapMode /* None */ =
    WrapMode.fromRaw(
      pango_layout_get_wrap(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoLayout]]
      )
    )
  end getWrap

  /** Converts from byte @index_ within the @layout to line and X position.
    *
    * The X position is measured from the left edge of the line.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method index_to_line_x]: Method index_to_line_x contains an OUT parameter, which is not supported yet"
  )
  private def indexToLineX__ = ???

  /** Converts from an index within a `PangoLayout` to the onscreen position
    * corresponding to the grapheme at that index.
    *
    * The returns is represented as rectangle. Note that `pos->x` is always the
    * leading edge of the grapheme and `pos->x + pos->width` the trailing edge
    * of the grapheme. If the directionality of the grapheme is right-to-left,
    * then `pos->width` will be negative.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method index_to_pos]: Method index_to_pos contains an OUT parameter, which is not supported yet"
  )
  private def indexToPos__ = ???

  /** Queries whether the layout had to ellipsize any paragraphs.
    *
    * This returns %TRUE if the ellipsization mode for @layout is not
    * %PANGO_ELLIPSIZE_NONE, a positive width is set on @layout, and there are
    * paragraphs exceeding that width that have to be ellipsized.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isEllipsized(): Boolean /* None */ =
    pango_layout_is_ellipsized(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoLayout]]
    ).value.!=(0)
  end isEllipsized

  /** Queries whether the layout had to wrap any paragraphs.
    *
    * This returns %TRUE if a positive width is set on @layout, ellipsization
    * mode of @layout is set to %PANGO_ELLIPSIZE_NONE, and there are paragraphs
    * exceeding the layout width that have to be wrapped.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isWrapped(): Boolean /* None */ =
    pango_layout_is_wrapped(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoLayout]]
    ).value.!=(0)
  end isWrapped

  /** Computes a new cursor position from an old position and a direction.
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method move_cursor_visually]: Method move_cursor_visually contains an OUT parameter, which is not supported yet"
  )
  private def moveCursorVisually__ = ???

  /** Serializes the @layout for later deserialization via
    * [func@Pango.Layout.deserialize].
    *
    * There are no guarantees about the format of the output across different
    * versions of Pango and [func@Pango.Layout.deserialize] will reject data
    * that it cannot parse.
    *
    * The intended use of this function is testing, benchmarking and debugging.
    * The format is not meant as a permanent storage format.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method serialize/return type]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Bytes), @type -> DataRecord(GBytes*)))"
  )
  private def serialize__ = ???

  /** Sets the alignment for the layout: how partial lines are positioned within
    * the horizontal space available.
    *
    * The default alignment is %PANGO_ALIGN_LEFT.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setAlignment(
      alignment: Alignment /* Some(PangoAlignment) */
  ): Unit /* None */ =
    pango_layout_set_alignment(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoLayout]],
      alignment.raw
    )
  end setAlignment

  /** Sets the text attributes for a layout object.
    *
    * References @attrs, so the caller can unref its reference.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_attributes/<method parameters>/attrs]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AttrList), @type -> DataRecord(PangoAttrList*)))"
  )
  private def setAttributes__ = ???

  /** Sets whether to calculate the base direction for the layout according to
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setAutoDir(
      auto_dir: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    pango_layout_set_auto_dir(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoLayout]],
      gboolean(gint((if auto_dir == true then 1 else 0)))
    )
  end setAutoDir

  /** Sets the type of ellipsization being performed for @layout.
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setEllipsize(
      ellipsize: EllipsizeMode /* Some(PangoEllipsizeMode) */
  ): Unit /* None */ =
    pango_layout_set_ellipsize(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoLayout]],
      ellipsize.raw
    )
  end setEllipsize

  /** Sets the default font description for the layout.
    *
    * If no font description is set on the layout, the font description from the
    * layout's context is used.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_font_description/<method parameters>/desc]: Cannot render type Type(List(),ListMap(@name -> DataRecord(FontDescription), @type -> DataRecord(const PangoFontDescription*)))"
  )
  private def setFontDescription__ = ???

  /** Sets the height to which the `PangoLayout` should be ellipsized at.
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setHeight(height: Int /* Some(CInt) */ ): Unit /* None */ =
    pango_layout_set_height(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoLayout]],
      height
    )
  end setHeight

  /** Sets the width in Pango units to indent each paragraph.
    *
    * A negative value of @indent will produce a hanging indentation. That is,
    * the first line will have the full width, and subsequent lines will be
    * indented by the absolute value of @indent.
    *
    * The indent setting is ignored if layout alignment is set to
    * %PANGO_ALIGN_CENTER.
    *
    * The default value is 0.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setIndent(indent: Int /* Some(CInt) */ ): Unit /* None */ =
    pango_layout_set_indent(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoLayout]],
      indent
    )
  end setIndent

  /** Sets whether each complete line should be stretched to fill the entire
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setJustify(
      justify: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    pango_layout_set_justify(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoLayout]],
      gboolean(gint((if justify == true then 1 else 0)))
    )
  end setJustify

  /** Sets whether the last line should be stretched to fill the entire width of
    * the layout.
    *
    * This only has an effect if [method@Pango.Layout.set_justify] has been
    * called as well.
    *
    * The default value is %FALSE.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setJustifyLastLine(
      justify: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    pango_layout_set_justify_last_line(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoLayout]],
      gboolean(gint((if justify == true then 1 else 0)))
    )
  end setJustifyLastLine

  /** Sets a factor for line spacing.
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setLineSpacing(factor: Float /* Some(Float) */ ): Unit /* None */ =
    pango_layout_set_line_spacing(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoLayout]],
      factor.asInstanceOf
    )
  end setLineSpacing

  /** Sets the layout text and attribute list from marked-up text.
    *
    * See [Pango Markup](pango_markup.html)).
    *
    * Replaces the current text and attribute list.
    *
    * This is the same as [method@Pango.Layout.set_markup_with_accel], but the
    * markup text isn't scanned for accelerators.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setMarkup(
      markup: String /* Some(CString) */,
      length: Int /* Some(CInt) */
  )(using Zone): Unit /* None */ =
    pango_layout_set_markup(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoLayout]],
      toCString(markup),
      length
    )
  end setMarkup

  /** Sets the layout text and attribute list from marked-up text.
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_markup_with_accel]: Method set_markup_with_accel contains an OUT parameter, which is not supported yet"
  )
  private def setMarkupWithAccel__ = ???

  /** Sets the single paragraph mode of @layout.
    *
    * If @setting is %TRUE, do not treat newlines and similar characters as
    * paragraph separators; instead, keep all text in a single paragraph, and
    * display a glyph for paragraph separator characters. Used when you want to
    * allow editing of newlines on a single text line.
    *
    * The default value is %FALSE.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setSingleParagraphMode(
      setting: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    pango_layout_set_single_paragraph_mode(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoLayout]],
      gboolean(gint((if setting == true then 1 else 0)))
    )
  end setSingleParagraphMode

  /** Sets the amount of spacing in Pango units between the lines of the layout.
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setSpacing(spacing: Int /* Some(CInt) */ ): Unit /* None */ =
    pango_layout_set_spacing(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoLayout]],
      spacing
    )
  end setSpacing

  /** Sets the tabs to use for @layout, overriding the default tabs.
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method set_tabs/<method parameters>/tabs]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TabArray), @type -> DataRecord(PangoTabArray*)))"
  )
  private def setTabs__ = ???

  /** Sets the text of the layout.
    *
    * This function validates @text and renders invalid UTF-8 with a placeholder
    * glyph.
    *
    * Note that if you have used [method@Pango.Layout.set_markup] or
    * [method@Pango.Layout.set_markup_with_accel] on @layout before, you may
    * want to call [method@Pango.Layout.set_attributes] to clear the attributes
    * set on the layout from the markup as this function does not clear
    * attributes.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setText(text: String /* Some(CString) */, length: Int /* Some(CInt) */ )(
      using Zone
  ): Unit /* None */ =
    pango_layout_set_text(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoLayout]],
      toCString(text),
      length
    )
  end setText

  /** Sets the width to which the lines of the `PangoLayout` should wrap or
    * ellipsized.
    *
    * The default value is -1: no width set.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setWidth(width: Int /* Some(CInt) */ ): Unit /* None */ =
    pango_layout_set_width(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoLayout]],
      width
    )
  end setWidth

  /** Sets the wrap mode.
    *
    * The wrap mode only has effect if a width is set on the layout with
    * [method@Pango.Layout.set_width]. To turn off wrapping, set the width to
    * -1.
    *
    * The default value is %PANGO_WRAP_WORD.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setWrap(wrap: WrapMode /* Some(PangoWrapMode) */ ): Unit /* None */ =
    pango_layout_set_wrap(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoLayout]],
      wrap.raw
    )
  end setWrap

  /** A convenience method to serialize a layout to a file.
    *
    * It is equivalent to calling [method@Pango.Layout.serialize] followed by
    * [func@GLib.file_set_contents].
    *
    * See those two functions for details on the arguments.
    *
    * It is mostly intended for use inside a debugger to quickly dump a layout
    * to a file for later inspection.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def writeToFile(
      flags: LayoutSerializeFlags /* Some(PangoLayoutSerializeFlags) */,
      filename: String /* Some(CString) */
  )(using Zone): GResult[Boolean /* None */ ] =
    GResult.wrap(__errorPtr =>
      pango_layout_write_to_file(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoLayout]],
        flags.raw,
        toCString(filename),
        __errorPtr
      ).value.!=(0)
    )
  end writeToFile

  /** Converts from X and Y position within a layout to the byte index to the
    * character at that logical position.
    *
    * If the Y position is not inside the layout, the closest position is chosen
    * (the position will be clamped inside the layout). If the X position is not
    * within the layout, then the start or the end of the line is chosen as
    * described for [method@Pango.LayoutLine.x_to_index]. If either the X or Y
    * positions were not inside the layout, then the function returns %FALSE; on
    * an exact hit, it returns %TRUE.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method xy_to_index]: Method xy_to_index contains an OUT parameter, which is not supported yet"
  )
  private def xyToIndex__ = ???

end Layout

object Layout:
  def applyUnsafe(ptr: Ptr[PangoLayout])(using Runtime) = summon[Runtime]
    .getOrCreate[Layout](ptr.asInstanceOf[Ptr[Byte]], p => new Layout(ptr))

  /** Create a new `PangoLayout` object with attributes initialized to default
    * values for a particular `PangoContext`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      context: sn.gnome.pango.fluent.Context /* Some(Ptr[PangoContext]) */
  )(using Runtime): Layout =
    val raw: Ptr[Byte] = pango_layout_new(
      context.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
    summon[Runtime]
      .getOrCreate[Layout](raw, r => Layout.applyUnsafe(r.asInstanceOf))
  end apply

  /** Loads data previously created via [method@Pango.Layout.serialize].
    *
    * For a discussion of the supported format, see that function.
    *
    * Note: to verify that the returned layout is identical to the one that was
    * serialized, you can compare @bytes to the result of serializing the layout
    * again.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[<function parameters>/bytes]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Bytes), @type -> DataRecord(GBytes*)))"
  )
  private def deserialize() = ???

end Layout
