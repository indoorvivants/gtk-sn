package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.Paintable
import sn.gnome.glib.SList
import sn.gnome.glib.internal.{gboolean, gint, guint32, gunichar}
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.{TextBuffer, TextChildAnchor, TextIter, TextTag}
import sn.gnome.gtk4.internal.GtkTextIter
import sn.gnome.pango.Language

/** An iterator for the contents of a `GtkTextBuffer`.
  *
  * You may wish to begin by reading the [text widget conceptual
  * overview](section-text-widget.html), which gives an overview of all the
  * objects and data types related to the text widget and how they work
  * together.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class TextIter private[gnome] (raw: Ptr[GtkTextIter]):

  def getUnsafeRawPointer(): Ptr[GtkTextIter] = this.raw

  /** Assigns the value of @other to @iter.
    *
    * This function is not useful in applications, because iterators can be
    * assigned with `GtkTextIter i = j;`.
    *
    * The function is used by language bindings.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def assign(
      other: sn.gnome.gtk4.TextIter /* Some(Ptr[GtkTextIter]) */
  ): Unit /* None */ =
    gtk_text_iter_assign(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextIter]],
      other.getUnsafeRawPointer().asInstanceOf
    )
  end assign

  /** Moves backward by one character offset.
    *
    * Returns %TRUE if movement was possible; if @iter was the first in the
    * buffer (character offset 0), this function returns %FALSE for convenience
    * when writing loops.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def backwardChar(): Boolean /* None */ =
    gtk_text_iter_backward_char(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextIter]]
    ).value.!=(0)
  end backwardChar

  /** Moves @count characters backward, if possible.
    *
    * If @count would move past the start or end of the buffer, moves to the
    * start or end of the buffer.
    *
    * The return value indicates whether the iterator moved onto a
    * dereferenceable position; if the iterator didn’t move, or moved onto the
    * end iterator, then %FALSE is returned. If @count is 0, the function does
    * nothing and returns %FALSE.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def backwardChars(count: Int /* Some(CInt) */ ): Boolean /* None */ =
    gtk_text_iter_backward_chars(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextIter]],
      count
    ).value.!=(0)
  end backwardChars

  /** Like [method@Gtk.TextIter.forward_cursor_position], but moves backward.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def backwardCursorPosition(): Boolean /* None */ =
    gtk_text_iter_backward_cursor_position(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextIter]]
    ).value.!=(0)
  end backwardCursorPosition

  /** Moves up to @count cursor positions.
    *
    * See [method@Gtk.TextIter.forward_cursor_position] for details.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def backwardCursorPositions(
      count: Int /* Some(CInt) */
  ): Boolean /* None */ =
    gtk_text_iter_backward_cursor_positions(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextIter]],
      count
    ).value.!=(0)
  end backwardCursorPositions

  /** Same as [method@Gtk.TextIter.forward_find_char], but goes backward from @iter.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method backward_find_char/<method parameters>/pred]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TextCharPredicate), @type -> DataRecord(GtkTextCharPredicate)))"
  )
  private def backwardFindChar__ = ???

  /** Moves @iter to the start of the previous line.
    *
    * Returns %TRUE if @iter could be moved; i.e. if @iter was at character
    * offset 0, this function returns %FALSE. Therefore, if @iter was already on
    * line 0, but not at the start of the line,
    * @iter
    *   is snapped to the start of the line and the function returns %TRUE.
    *   (Note that this implies that in a loop calling this function, the line
    *   number may not change on every iteration, if your first iteration is on
    *   line 0.)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def backwardLine(): Boolean /* None */ =
    gtk_text_iter_backward_line(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextIter]]
    ).value.!=(0)
  end backwardLine

  /** Moves @count lines backward, if possible.
    *
    * If @count would move past the start or end of the buffer, moves to the
    * start or end of the buffer.
    *
    * The return value indicates whether the iterator moved onto a
    * dereferenceable position; if the iterator didn’t move, or moved onto the
    * end iterator, then %FALSE is returned. If @count is 0, the function does
    * nothing and returns %FALSE. If @count is negative, moves forward by 0 - @count
    * lines.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def backwardLines(count: Int /* Some(CInt) */ ): Boolean /* None */ =
    gtk_text_iter_backward_lines(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextIter]],
      count
    ).value.!=(0)
  end backwardLines

  /** Same as [method@Gtk.TextIter.forward_search], but moves backward.
    *
    * @match_end
    *   will never be set to a `GtkTextIter` located after @iter, even if there
    *   is a possible @match_start before or at @iter.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method backward_search]: Method backward_search contains an OUT parameter, which is not supported yet"
  )
  private def backwardSearch__ = ???

  /** Moves backward to the previous sentence start.
    *
    * If @iter is already at the start of a sentence, moves backward to the next
    * one.
    *
    * Sentence boundaries are determined by Pango and should be correct for
    * nearly any language.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def backwardSentenceStart(): Boolean /* None */ =
    gtk_text_iter_backward_sentence_start(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextIter]]
    ).value.!=(0)
  end backwardSentenceStart

  /** Calls [method@Gtk.TextIter.backward_sentence_start] up to @count times.
    *
    * If @count is negative, moves forward instead of backward.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def backwardSentenceStarts(count: Int /* Some(CInt) */ ): Boolean /* None */ =
    gtk_text_iter_backward_sentence_starts(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextIter]],
      count
    ).value.!=(0)
  end backwardSentenceStarts

  /** Moves backward to the next toggle (on or off) of the
    * @tag,
    *   or to the next toggle of any tag if
    * @tag
    *   is %NULL.
    *
    * If no matching tag toggles are found, returns %FALSE, otherwise %TRUE.
    * Does not return toggles located at @iter, only toggles before @iter. Sets @iter
    * to the location of the toggle, or the start of the buffer if no toggle is
    * found.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def backwardToTagToggle(
      tag: Option[sn.gnome.gtk4.TextTag /* Some(Ptr[GtkTextTag]) */ ]
  )(using Runtime): Boolean /* None */ =
    gtk_text_iter_backward_to_tag_toggle(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextIter]],
      tag
        .map[Ptr[GtkTextTag]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkTextTag]])
    ).value.!=(0)
  end backwardToTagToggle

  /** Moves @iter backward to the previous visible cursor position.
    *
    * See [method@Gtk.TextIter.backward_cursor_position] for details.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def backwardVisibleCursorPosition(): Boolean /* None */ =
    gtk_text_iter_backward_visible_cursor_position(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextIter]]
    ).value.!=(0)
  end backwardVisibleCursorPosition

  /** Moves up to @count visible cursor positions.
    *
    * See [method@Gtk.TextIter.backward_cursor_position] for details.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def backwardVisibleCursorPositions(
      count: Int /* Some(CInt) */
  ): Boolean /* None */ =
    gtk_text_iter_backward_visible_cursor_positions(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextIter]],
      count
    ).value.!=(0)
  end backwardVisibleCursorPositions

  /** Moves @iter to the start of the previous visible line.
    *
    * Returns %TRUE if
    * @iter
    *   could be moved; i.e. if @iter was at character offset 0, this function
    *   returns %FALSE. Therefore if @iter was already on line 0, but not at the
    *   start of the line, @iter is snapped to the start of the line and the
    *   function returns %TRUE. (Note that this implies that in a loop calling
    *   this function, the line number may not change on every iteration, if
    *   your first iteration is on line 0.)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def backwardVisibleLine(): Boolean /* None */ =
    gtk_text_iter_backward_visible_line(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextIter]]
    ).value.!=(0)
  end backwardVisibleLine

  /** Moves @count visible lines backward, if possible.
    *
    * If @count would move past the start or end of the buffer, moves to the
    * start or end of the buffer.
    *
    * The return value indicates whether the iterator moved onto a
    * dereferenceable position; if the iterator didn’t move, or moved onto the
    * end iterator, then %FALSE is returned. If @count is 0, the function does
    * nothing and returns %FALSE. If @count is negative, moves forward by 0 - @count
    * lines.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def backwardVisibleLines(count: Int /* Some(CInt) */ ): Boolean /* None */ =
    gtk_text_iter_backward_visible_lines(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextIter]],
      count
    ).value.!=(0)
  end backwardVisibleLines

  /** Moves backward to the previous visible word start.
    *
    * If @iter is currently on a word start, moves backward to the next one
    * after that.
    *
    * Word breaks are determined by Pango and should be correct for nearly any
    * language.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def backwardVisibleWordStart(): Boolean /* None */ =
    gtk_text_iter_backward_visible_word_start(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextIter]]
    ).value.!=(0)
  end backwardVisibleWordStart

  /** Calls [method@Gtk.TextIter.backward_visible_word_start] up to @count
    * times.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def backwardVisibleWordStarts(
      count: Int /* Some(CInt) */
  ): Boolean /* None */ =
    gtk_text_iter_backward_visible_word_starts(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextIter]],
      count
    ).value.!=(0)
  end backwardVisibleWordStarts

  /** Moves backward to the previous word start.
    *
    * If @iter is currently on a word start, moves backward to the next one
    * after that.
    *
    * Word breaks are determined by Pango and should be correct for nearly any
    * language
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def backwardWordStart(): Boolean /* None */ =
    gtk_text_iter_backward_word_start(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextIter]]
    ).value.!=(0)
  end backwardWordStart

  /** Calls [method@Gtk.TextIter.backward_word_start] up to @count times.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def backwardWordStarts(count: Int /* Some(CInt) */ ): Boolean /* None */ =
    gtk_text_iter_backward_word_starts(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextIter]],
      count
    ).value.!=(0)
  end backwardWordStarts

  /** Considering the default editability of the buffer, and tags that affect
    * editability, determines whether text inserted at @iter would be editable.
    *
    * If text inserted at @iter would be editable then the user should be
    * allowed to insert text at @iter.
    * [method@Gtk.TextBuffer.insert_interactive] uses this function to decide
    * whether insertions are allowed at a given position.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def canInsert(
      default_editability: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Boolean /* None */ =
    gtk_text_iter_can_insert(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextIter]],
      gboolean(gint((if default_editability == true then 1 else 0)))
    ).value.!=(0)
  end canInsert

  /** A qsort()-style function that returns negative if @lhs is less than
    * @rhs,
    *   positive if @lhs is greater than @rhs, and 0 if they’re equal.
    *
    * Ordering is in character offset order, i.e. the first character in the
    * buffer is less than the second character in the buffer.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def compare(
      rhs: sn.gnome.gtk4.TextIter /* Some(Ptr[GtkTextIter]) */
  ): Int /* None */ =
    gtk_text_iter_compare(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextIter]],
      rhs.getUnsafeRawPointer().asInstanceOf
    )
  end compare

  /** Creates a dynamically-allocated copy of an iterator.
    *
    * This function is not useful in applications, because iterators can be
    * copied with a simple assignment (`GtkTextIter i = j;`).
    *
    * The function is used by language bindings.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def copy(): sn.gnome.gtk4.TextIter /* None */ =
    sn.gnome.gtk4.TextIter.fromRaw(
      gtk_text_iter_copy(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextIter]]
      )
    )
  end copy

  /** Returns whether the character at @iter is within an editable region of
    * text.
    *
    * Non-editable text is “locked” and can’t be changed by the user via
    * `GtkTextView`. If no tags applied to this text affect editability, @default_setting
    * will be returned.
    *
    * You don’t want to use this function to decide whether text can be inserted
    * at @iter, because for insertion you don’t want to know whether the char at @iter
    * is inside an editable range, you want to know whether a new character
    * inserted at @iter would be inside an editable range. Use
    * [method@Gtk.TextIter.can_insert] to handle this case.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def editable(
      default_setting: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Boolean /* None */ =
    gtk_text_iter_editable(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextIter]],
      gboolean(gint((if default_setting == true then 1 else 0)))
    ).value.!=(0)
  end editable

  /** Returns %TRUE if @iter points to the start of the paragraph delimiter
    * characters for a line.
    *
    * Delimiters will be either a newline, a carriage return, a carriage return
    * followed by a newline, or a Unicode paragraph separator character.
    *
    * Note that an iterator pointing to the \n of a \r\n pair will not be
    * counted as the end of a line, the line ends before the \r. The end
    * iterator is considered to be at the end of a line, even though there are
    * no paragraph delimiter chars there.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def endsLine(): Boolean /* None */ =
    gtk_text_iter_ends_line(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextIter]]
    ).value.!=(0)
  end endsLine

  /** Determines whether @iter ends a sentence.
    *
    * Sentence boundaries are determined by Pango and should be correct for
    * nearly any language.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def endsSentence(): Boolean /* None */ =
    gtk_text_iter_ends_sentence(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextIter]]
    ).value.!=(0)
  end endsSentence

  /** Returns %TRUE if @tag is toggled off at exactly this point.
    *
    * If @tag is %NULL, returns %TRUE if any tag is toggled off at this point.
    *
    * Note that if this function returns %TRUE, it means that
    * @iter
    *   is at the end of the tagged range, but that the character at @iter is
    *   outside the tagged range. In other words, unlike
    *   [method@Gtk.TextIter.starts_tag], if this function returns %TRUE,
    *   [method@Gtk.TextIter.has_tag] will return %FALSE for the same
    *   parameters.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def endsTag(tag: Option[sn.gnome.gtk4.TextTag /* Some(Ptr[GtkTextTag]) */ ])(
      using Runtime
  ): Boolean /* None */ =
    gtk_text_iter_ends_tag(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextIter]],
      tag
        .map[Ptr[GtkTextTag]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkTextTag]])
    ).value.!=(0)
  end endsTag

  /** Determines whether @iter ends a natural-language word.
    *
    * Word breaks are determined by Pango and should be correct for nearly any
    * language.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def endsWord(): Boolean /* None */ =
    gtk_text_iter_ends_word(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextIter]]
    ).value.!=(0)
  end endsWord

  /** Tests whether two iterators are equal, using the fastest possible
    * mechanism.
    *
    * This function is very fast; you can expect it to perform better than e.g.
    * getting the character offset for each iterator and comparing the offsets
    * yourself. Also, it’s a bit faster than [method@Gtk.TextIter.compare].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def equal(
      rhs: sn.gnome.gtk4.TextIter /* Some(Ptr[GtkTextIter]) */
  ): Boolean /* None */ =
    gtk_text_iter_equal(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextIter]],
      rhs.getUnsafeRawPointer().asInstanceOf
    ).value.!=(0)
  end equal

  /** Moves @iter forward by one character offset.
    *
    * Note that images embedded in the buffer occupy 1 character slot, so this
    * function may actually move onto an image instead of a character, if you
    * have images in your buffer. If @iter is the end iterator or one character
    * before it, @iter will now point at the end iterator, and this function
    * returns %FALSE for convenience when writing loops.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def forwardChar(): Boolean /* None */ =
    gtk_text_iter_forward_char(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextIter]]
    ).value.!=(0)
  end forwardChar

  /** Moves @count characters if possible.
    *
    * If @count would move past the start or end of the buffer, moves to the
    * start or end of the buffer.
    *
    * The return value indicates whether the new position of
    * @iter
    *   is different from its original position, and dereferenceable (the last
    *   iterator in the buffer is not dereferenceable). If @count is 0, the
    *   function does nothing and returns %FALSE.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def forwardChars(count: Int /* Some(CInt) */ ): Boolean /* None */ =
    gtk_text_iter_forward_chars(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextIter]],
      count
    ).value.!=(0)
  end forwardChars

  /** Moves @iter forward by a single cursor position.
    *
    * Cursor positions are (unsurprisingly) positions where the cursor can
    * appear. Perhaps surprisingly, there may not be a cursor position between
    * all characters. The most common example for European languages would be a
    * carriage return/newline sequence.
    *
    * For some Unicode characters, the equivalent of say the letter “a” with an
    * accent mark will be represented as two characters, first the letter then a
    * "combining mark" that causes the accent to be rendered; so the cursor
    * can’t go between those two characters.
    *
    * See also the [struct@Pango.LogAttr] struct and the [func@Pango.break]
    * function.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def forwardCursorPosition(): Boolean /* None */ =
    gtk_text_iter_forward_cursor_position(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextIter]]
    ).value.!=(0)
  end forwardCursorPosition

  /** Moves up to @count cursor positions.
    *
    * See [method@Gtk.TextIter.forward_cursor_position] for details.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def forwardCursorPositions(count: Int /* Some(CInt) */ ): Boolean /* None */ =
    gtk_text_iter_forward_cursor_positions(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextIter]],
      count
    ).value.!=(0)
  end forwardCursorPositions

  /** Advances @iter, calling @pred on each character.
    *
    * If @pred returns %TRUE, returns %TRUE and stops scanning. If @pred never
    * returns %TRUE, @iter is set to @limit if
    * @limit
    *   is non-%NULL, otherwise to the end iterator.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method forward_find_char/<method parameters>/pred]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TextCharPredicate), @type -> DataRecord(GtkTextCharPredicate)))"
  )
  private def forwardFindChar__ = ???

  /** Moves @iter to the start of the next line.
    *
    * If the iter is already on the last line of the buffer, moves the iter to
    * the end of the current line. If after the operation, the iter is at the
    * end of the buffer and not dereferenceable, returns %FALSE. Otherwise,
    * returns %TRUE.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def forwardLine(): Boolean /* None */ =
    gtk_text_iter_forward_line(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextIter]]
    ).value.!=(0)
  end forwardLine

  /** Moves @count lines forward, if possible.
    *
    * If @count would move past the start or end of the buffer, moves to the
    * start or end of the buffer.
    *
    * The return value indicates whether the iterator moved onto a
    * dereferenceable position; if the iterator didn’t move, or moved onto the
    * end iterator, then %FALSE is returned. If @count is 0, the function does
    * nothing and returns %FALSE. If @count is negative, moves backward by 0 - @count
    * lines.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def forwardLines(count: Int /* Some(CInt) */ ): Boolean /* None */ =
    gtk_text_iter_forward_lines(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextIter]],
      count
    ).value.!=(0)
  end forwardLines

  /** Searches forward for @str.
    *
    * Any match is returned by setting @match_start to the first character of
    * the match and @match_end to the first character after the match. The
    * search will not continue past @limit. Note that a search is a linear or
    * O(n) operation, so you may wish to use @limit to avoid locking up your UI
    * on large buffers.
    *
    * @match_start
    *   will never be set to a `GtkTextIter` located before @iter, even if there
    *   is a possible @match_end after or at @iter.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method forward_search]: Method forward_search contains an OUT parameter, which is not supported yet"
  )
  private def forwardSearch__ = ???

  /** Moves forward to the next sentence end.
    *
    * If @iter is at the end of a sentence, moves to the next end of sentence.
    *
    * Sentence boundaries are determined by Pango and should be correct for
    * nearly any language.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def forwardSentenceEnd(): Boolean /* None */ =
    gtk_text_iter_forward_sentence_end(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextIter]]
    ).value.!=(0)
  end forwardSentenceEnd

  /** Calls [method@Gtk.TextIter.forward_sentence_end] @count times.
    *
    * If @count is negative, moves backward instead of forward.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def forwardSentenceEnds(count: Int /* Some(CInt) */ ): Boolean /* None */ =
    gtk_text_iter_forward_sentence_ends(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextIter]],
      count
    ).value.!=(0)
  end forwardSentenceEnds

  /** Moves @iter forward to the “end iterator”, which points one past the last
    * valid character in the buffer.
    *
    * [method@Gtk.TextIter.get_char] called on the end iterator returns 0, which
    * is convenient for writing loops.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def forwardToEnd(): Unit /* None */ =
    gtk_text_iter_forward_to_end(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextIter]]
    )
  end forwardToEnd

  /** Moves the iterator to point to the paragraph delimiter characters.
    *
    * The possible characters are either a newline, a carriage return, a
    * carriage return/newline in sequence, or the Unicode paragraph separator
    * character.
    *
    * If the iterator is already at the paragraph delimiter characters, moves to
    * the paragraph delimiter characters for the next line. If @iter is on the
    * last line in the buffer, which does not end in paragraph delimiters, moves
    * to the end iterator (end of the last line), and returns %FALSE.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def forwardToLineEnd(): Boolean /* None */ =
    gtk_text_iter_forward_to_line_end(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextIter]]
    ).value.!=(0)
  end forwardToLineEnd

  /** Moves forward to the next toggle (on or off) of the
    * @tag,
    *   or to the next toggle of any tag if
    * @tag
    *   is %NULL.
    *
    * If no matching tag toggles are found, returns %FALSE, otherwise %TRUE.
    * Does not return toggles located at @iter, only toggles after @iter. Sets @iter
    * to the location of the toggle, or to the end of the buffer if no toggle is
    * found.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def forwardToTagToggle(
      tag: Option[sn.gnome.gtk4.TextTag /* Some(Ptr[GtkTextTag]) */ ]
  )(using Runtime): Boolean /* None */ =
    gtk_text_iter_forward_to_tag_toggle(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextIter]],
      tag
        .map[Ptr[GtkTextTag]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkTextTag]])
    ).value.!=(0)
  end forwardToTagToggle

  /** Moves @iter forward to the next visible cursor position.
    *
    * See [method@Gtk.TextIter.forward_cursor_position] for details.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def forwardVisibleCursorPosition(): Boolean /* None */ =
    gtk_text_iter_forward_visible_cursor_position(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextIter]]
    ).value.!=(0)
  end forwardVisibleCursorPosition

  /** Moves up to @count visible cursor positions.
    *
    * See [method@Gtk.TextIter.forward_cursor_position] for details.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def forwardVisibleCursorPositions(
      count: Int /* Some(CInt) */
  ): Boolean /* None */ =
    gtk_text_iter_forward_visible_cursor_positions(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextIter]],
      count
    ).value.!=(0)
  end forwardVisibleCursorPositions

  /** Moves @iter to the start of the next visible line.
    *
    * Returns %TRUE if there was a next line to move to, and %FALSE if @iter was
    * simply moved to the end of the buffer and is now not dereferenceable, or
    * if @iter was already at the end of the buffer.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def forwardVisibleLine(): Boolean /* None */ =
    gtk_text_iter_forward_visible_line(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextIter]]
    ).value.!=(0)
  end forwardVisibleLine

  /** Moves @count visible lines forward, if possible.
    *
    * If @count would move past the start or end of the buffer, moves to the
    * start or end of the buffer.
    *
    * The return value indicates whether the iterator moved onto a
    * dereferenceable position; if the iterator didn’t move, or moved onto the
    * end iterator, then %FALSE is returned. If @count is 0, the function does
    * nothing and returns %FALSE. If @count is negative, moves backward by 0 - @count
    * lines.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def forwardVisibleLines(count: Int /* Some(CInt) */ ): Boolean /* None */ =
    gtk_text_iter_forward_visible_lines(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextIter]],
      count
    ).value.!=(0)
  end forwardVisibleLines

  /** Moves forward to the next visible word end.
    *
    * If @iter is currently on a word end, moves forward to the next one after
    * that.
    *
    * Word breaks are determined by Pango and should be correct for nearly any
    * language
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def forwardVisibleWordEnd(): Boolean /* None */ =
    gtk_text_iter_forward_visible_word_end(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextIter]]
    ).value.!=(0)
  end forwardVisibleWordEnd

  /** Calls [method@Gtk.TextIter.forward_visible_word_end] up to @count times.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def forwardVisibleWordEnds(count: Int /* Some(CInt) */ ): Boolean /* None */ =
    gtk_text_iter_forward_visible_word_ends(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextIter]],
      count
    ).value.!=(0)
  end forwardVisibleWordEnds

  /** Moves forward to the next word end.
    *
    * If @iter is currently on a word end, moves forward to the next one after
    * that.
    *
    * Word breaks are determined by Pango and should be correct for nearly any
    * language.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def forwardWordEnd(): Boolean /* None */ =
    gtk_text_iter_forward_word_end(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextIter]]
    ).value.!=(0)
  end forwardWordEnd

  /** Calls [method@Gtk.TextIter.forward_word_end] up to @count times.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def forwardWordEnds(count: Int /* Some(CInt) */ ): Boolean /* None */ =
    gtk_text_iter_forward_word_ends(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextIter]],
      count
    ).value.!=(0)
  end forwardWordEnds

  /** Free an iterator allocated on the heap.
    *
    * This function is intended for use in language bindings, and is not
    * especially useful for applications, because iterators can simply be
    * allocated on the stack.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def free(): Unit /* None */ =
    gtk_text_iter_free(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextIter]]
    )
  end free

  /** Returns the `GtkTextBuffer` this iterator is associated with.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getBuffer()(using Runtime): sn.gnome.gtk4.TextBuffer /* None */ =
    sn.gnome.gtk4.TextBuffer.applyUnsafe(
      gtk_text_iter_get_buffer(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextIter]]
      ).asInstanceOf
    )
  end getBuffer

  /** Returns the number of bytes in the line containing @iter, including the
    * paragraph delimiters.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getBytesInLine(): Int /* None */ =
    gtk_text_iter_get_bytes_in_line(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextIter]]
    )
  end getBytesInLine

  /** The Unicode character at this iterator is returned.
    *
    * Equivalent to operator* on a C++ iterator. If the element at this iterator
    * is a non-character element, such as an image embedded in the buffer, the
    * Unicode “unknown” character 0xFFFC is returned. If invoked on the end
    * iterator, zero is returned; zero is not a valid Unicode character.
    *
    * So you can write a loop which ends when this function returns 0.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getChar(): CUnsignedInt /* None */ =
    gtk_text_iter_get_char(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextIter]]
    ).value
  end getChar

  /** Returns the number of characters in the line containing @iter, including
    * the paragraph delimiters.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getCharsInLine(): Int /* None */ =
    gtk_text_iter_get_chars_in_line(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextIter]]
    )
  end getCharsInLine

  /** If the location at @iter contains a child anchor, the anchor is returned.
    *
    * Otherwise, %NULL is returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getChildAnchor()(using
      Runtime
  ): sn.gnome.gtk4.TextChildAnchor /* None */ =
    sn.gnome.gtk4.TextChildAnchor.applyUnsafe(
      gtk_text_iter_get_child_anchor(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextIter]]
      ).asInstanceOf
    )
  end getChildAnchor

  /** Returns the language in effect at @iter.
    *
    * If no tags affecting language apply to @iter, the return value is
    * identical to that of [func@Gtk.get_default_language].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getLanguage(): sn.gnome.pango.Language /* None */ =
    sn.gnome.pango.Language.fromRaw(
      gtk_text_iter_get_language(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextIter]]
      )
    )
  end getLanguage

  /** Returns the line number containing the iterator.
    *
    * Lines in a `GtkTextBuffer` are numbered beginning with 0 for the first
    * line in the buffer.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getLine(): Int /* None */ =
    gtk_text_iter_get_line(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextIter]]
    )
  end getLine

  /** Returns the byte index of the iterator, counting from the start of a
    * newline-terminated line.
    *
    * Remember that `GtkTextBuffer` encodes text in UTF-8, and that characters
    * can require a variable number of bytes to represent.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getLineIndex(): Int /* None */ =
    gtk_text_iter_get_line_index(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextIter]]
    )
  end getLineIndex

  /** Returns the character offset of the iterator, counting from the start of a
    * newline-terminated line.
    *
    * The first character on the line has offset 0.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getLineOffset(): Int /* None */ =
    gtk_text_iter_get_line_offset(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextIter]]
    )
  end getLineOffset

  /** Returns a list of all `GtkTextMark` at this location.
    *
    * Because marks are not iterable (they don’t take up any "space" in the
    * buffer, they are just marks in between iterable locations), multiple marks
    * can exist in the same place.
    *
    * The returned list is not in any meaningful order.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getMarks(): sn.gnome.glib.SList /* None */ =
    sn.gnome.glib.SList.fromRaw(
      gtk_text_iter_get_marks(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextIter]]
      )
    )
  end getMarks

  /** Returns the character offset of an iterator.
    *
    * Each character in a `GtkTextBuffer` has an offset, starting with 0 for the
    * first character in the buffer. Use
    * [method@Gtk.TextBuffer.get_iter_at_offset] to convert an offset back into
    * an iterator.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getOffset(): Int /* None */ =
    gtk_text_iter_get_offset(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextIter]]
    )
  end getOffset

  /** If the element at @iter is a paintable, the paintable is returned.
    *
    * Otherwise, %NULL is returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPaintable(): sn.gnome.gdk4.Paintable /* None */ =
    new Paintable.Abstract(
      gtk_text_iter_get_paintable(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextIter]]
      ).asInstanceOf
    )
  end getPaintable

  /** Returns the text in the given range.
    *
    * A “slice” is an array of characters encoded in UTF-8 format, including the
    * Unicode “unknown” character 0xFFFC for iterable non-character elements in
    * the buffer, such as images. Because images are encoded in the slice, byte
    * and character offsets in the returned array will correspond to byte
    * offsets in the text buffer. Note that 0xFFFC can occur in normal text as
    * well, so it is not a reliable indicator that a paintable or widget is in
    * the buffer.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSlice(
      end: sn.gnome.gtk4.TextIter /* Some(Ptr[GtkTextIter]) */
  ): scala.Predef.String /* None */ =
    fromCString(
      gtk_text_iter_get_slice(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextIter]],
        end.getUnsafeRawPointer().asInstanceOf
      ).asInstanceOf
    )
  end getSlice

  /** Returns a list of tags that apply to @iter, in ascending order of
    * priority.
    *
    * The highest-priority tags are last.
    *
    * The `GtkTextTag`s in the list don’t have a reference added, but you have
    * to free the list itself.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getTags(): sn.gnome.glib.SList /* None */ =
    sn.gnome.glib.SList.fromRaw(
      gtk_text_iter_get_tags(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextIter]]
      )
    )
  end getTags

  /** Returns text in the given range.
    *
    * If the range contains non-text elements such as images, the character and
    * byte offsets in the returned string will not correspond to character and
    * byte offsets in the buffer. If you want offsets to correspond, see
    * [method@Gtk.TextIter.get_slice].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getText(
      end: sn.gnome.gtk4.TextIter /* Some(Ptr[GtkTextIter]) */
  ): scala.Predef.String /* None */ =
    fromCString(
      gtk_text_iter_get_text(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextIter]],
        end.getUnsafeRawPointer().asInstanceOf
      ).asInstanceOf
    )
  end getText

  /** Returns a list of `GtkTextTag` that are toggled on or off at this point.
    *
    * If @toggled_on is %TRUE, the list contains tags that are toggled on. If a
    * tag is toggled on at @iter, then some non-empty range of characters
    * following @iter has that tag applied to it. If a tag is toggled off, then
    * some non-empty range following @iter does not have the tag applied to it.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getToggledTags(
      toggled_on: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): sn.gnome.glib.SList /* None */ =
    sn.gnome.glib.SList.fromRaw(
      gtk_text_iter_get_toggled_tags(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextIter]],
        gboolean(gint((if toggled_on == true then 1 else 0)))
      )
    )
  end getToggledTags

  /** Returns the number of bytes from the start of the line to the given @iter,
    * not counting bytes that are invisible due to tags with the “invisible”
    * flag toggled on.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getVisibleLineIndex(): Int /* None */ =
    gtk_text_iter_get_visible_line_index(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextIter]]
    )
  end getVisibleLineIndex

  /** Returns the offset in characters from the start of the line to the given @iter,
    * not counting characters that are invisible due to tags with the
    * “invisible” flag toggled on.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getVisibleLineOffset(): Int /* None */ =
    gtk_text_iter_get_visible_line_offset(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextIter]]
    )
  end getVisibleLineOffset

  /** Returns visible text in the given range.
    *
    * Like [method@Gtk.TextIter.get_slice], but invisible text is not included.
    * Invisible text is usually invisible because a `GtkTextTag` with the
    * “invisible” attribute turned on has been applied to it.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getVisibleSlice(
      end: sn.gnome.gtk4.TextIter /* Some(Ptr[GtkTextIter]) */
  ): scala.Predef.String /* None */ =
    fromCString(
      gtk_text_iter_get_visible_slice(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextIter]],
        end.getUnsafeRawPointer().asInstanceOf
      ).asInstanceOf
    )
  end getVisibleSlice

  /** Returns visible text in the given range.
    *
    * Like [method@Gtk.TextIter.get_text], but invisible text is not included.
    * Invisible text is usually invisible because a `GtkTextTag` with the
    * “invisible” attribute turned on has been applied to it.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getVisibleText(
      end: sn.gnome.gtk4.TextIter /* Some(Ptr[GtkTextIter]) */
  ): scala.Predef.String /* None */ =
    fromCString(
      gtk_text_iter_get_visible_text(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextIter]],
        end.getUnsafeRawPointer().asInstanceOf
      ).asInstanceOf
    )
  end getVisibleText

  /** Returns %TRUE if @iter points to a character that is part of a range
    * tagged with @tag.
    *
    * See also [method@Gtk.TextIter.starts_tag] and
    * [method@Gtk.TextIter.ends_tag].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def hasTag(
      tag: sn.gnome.gtk4.TextTag /* Some(Ptr[GtkTextTag]) */
  )(using Runtime): Boolean /* None */ =
    gtk_text_iter_has_tag(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextIter]],
      tag.getUnsafeRawPointer().asInstanceOf
    ).value.!=(0)
  end hasTag

  /** Checks whether @iter falls in the range [@start, @end).
    *
    * @start
    *   and @end must be in ascending order.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def inRange(
      start: sn.gnome.gtk4.TextIter /* Some(Ptr[GtkTextIter]) */,
      end: sn.gnome.gtk4.TextIter /* Some(Ptr[GtkTextIter]) */
  ): Boolean /* None */ =
    gtk_text_iter_in_range(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextIter]],
      start.getUnsafeRawPointer().asInstanceOf,
      end.getUnsafeRawPointer().asInstanceOf
    ).value.!=(0)
  end inRange

  /** Determines whether @iter is inside a sentence (as opposed to in between
    * two sentences, e.g. after a period and before the first letter of the next
    * sentence).
    *
    * Sentence boundaries are determined by Pango and should be correct for
    * nearly any language.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def insideSentence(): Boolean /* None */ =
    gtk_text_iter_inside_sentence(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextIter]]
    ).value.!=(0)
  end insideSentence

  /** Determines whether the character pointed by @iter is part of a
    * natural-language word (as opposed to say inside some whitespace).
    *
    * Word breaks are determined by Pango and should be correct for nearly any
    * language.
    *
    * Note that if [method@Gtk.TextIter.starts_word] returns %TRUE, then this
    * function returns %TRUE too, since @iter points to the first character of
    * the word.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def insideWord(): Boolean /* None */ =
    gtk_text_iter_inside_word(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextIter]]
    ).value.!=(0)
  end insideWord

  /** Determine if @iter is at a cursor position.
    *
    * See [method@Gtk.TextIter.forward_cursor_position] or
    * [struct@Pango.LogAttr] or [func@Pango.break] for details on what a cursor
    * position is.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isCursorPosition(): Boolean /* None */ =
    gtk_text_iter_is_cursor_position(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextIter]]
    ).value.!=(0)
  end isCursorPosition

  /** Returns %TRUE if @iter is the end iterator.
    *
    * This means it is one past the last dereferenceable iterator in the buffer.
    * [method@Gtk.TextIter.is_end] is the most efficient way to check whether an
    * iterator is the end iterator.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isEnd(): Boolean /* None */ =
    gtk_text_iter_is_end(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextIter]]
    ).value.!=(0)
  end isEnd

  /** Returns %TRUE if @iter is the first iterator in the buffer.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isStart(): Boolean /* None */ =
    gtk_text_iter_is_start(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextIter]]
    ).value.!=(0)
  end isStart

  /** Swaps the value of @first and @second if @second comes before
    * @first
    *   in the buffer.
    *
    * That is, ensures that @first and @second are in sequence. Most text buffer
    * functions that take a range call this automatically on your behalf, so
    * there’s no real reason to call it yourself in those cases. There are some
    * exceptions, such as [method@Gtk.TextIter.in_range], that expect a
    * pre-sorted range.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def order(
      second: sn.gnome.gtk4.TextIter /* Some(Ptr[GtkTextIter]) */
  ): Unit /* None */ =
    gtk_text_iter_order(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextIter]],
      second.getUnsafeRawPointer().asInstanceOf
    )
  end order

  /** Moves iterator @iter to the start of the line @line_number.
    *
    * If @line_number is negative or larger than or equal to the number of lines
    * in the buffer, moves @iter to the start of the last line in the buffer.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setLine(line_number: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_text_iter_set_line(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextIter]],
      line_number
    )
  end setLine

  /** Same as [method@Gtk.TextIter.set_line_offset], but works with a byte
    * index. The given byte index must be at the start of a character, it can’t
    * be in the middle of a UTF-8 encoded character.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setLineIndex(byte_on_line: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_text_iter_set_line_index(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextIter]],
      byte_on_line
    )
  end setLineIndex

  /** Moves @iter within a line, to a new character (not byte) offset.
    *
    * The given character offset must be less than or equal to the number of
    * characters in the line; if equal, @iter moves to the start of the next
    * line. See [method@Gtk.TextIter.set_line_index] if you have a byte index
    * rather than a character offset.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setLineOffset(char_on_line: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_text_iter_set_line_offset(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextIter]],
      char_on_line
    )
  end setLineOffset

  /** Sets @iter to point to @char_offset.
    *
    * @char_offset
    *   counts from the start of the entire text buffer, starting with 0.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setOffset(char_offset: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_text_iter_set_offset(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextIter]],
      char_offset
    )
  end setOffset

  /** Like [method@Gtk.TextIter.set_line_index], but the index is in visible
    * bytes, i.e. text with a tag making it invisible is not counted in the
    * index.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setVisibleLineIndex(
      byte_on_line: Int /* Some(CInt) */
  ): Unit /* None */ =
    gtk_text_iter_set_visible_line_index(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextIter]],
      byte_on_line
    )
  end setVisibleLineIndex

  /** Like [method@Gtk.TextIter.set_line_offset], but the offset is in visible
    * characters, i.e. text with a tag making it invisible is not counted in the
    * offset.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setVisibleLineOffset(
      char_on_line: Int /* Some(CInt) */
  ): Unit /* None */ =
    gtk_text_iter_set_visible_line_offset(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextIter]],
      char_on_line
    )
  end setVisibleLineOffset

  /** Returns %TRUE if @iter begins a paragraph.
    *
    * This is the case if [method@Gtk.TextIter.get_line_offset] would return 0.
    * However this function is potentially more efficient than
    * [method@Gtk.TextIter.get_line_offset], because it doesn’t have to compute
    * the offset, it just has to see whether it’s 0.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def startsLine(): Boolean /* None */ =
    gtk_text_iter_starts_line(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextIter]]
    ).value.!=(0)
  end startsLine

  /** Determines whether @iter begins a sentence.
    *
    * Sentence boundaries are determined by Pango and should be correct for
    * nearly any language.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def startsSentence(): Boolean /* None */ =
    gtk_text_iter_starts_sentence(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextIter]]
    ).value.!=(0)
  end startsSentence

  /** Returns %TRUE if @tag is toggled on at exactly this point.
    *
    * If @tag is %NULL, returns %TRUE if any tag is toggled on at this point.
    *
    * Note that if this function returns %TRUE, it means that
    * @iter
    *   is at the beginning of the tagged range, and that the character at @iter
    *   is inside the tagged range. In other words, unlike
    *   [method@Gtk.TextIter.ends_tag], if this function returns %TRUE,
    *   [method@Gtk.TextIter.has_tag] will also return %TRUE for the same
    *   parameters.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def startsTag(
      tag: Option[sn.gnome.gtk4.TextTag /* Some(Ptr[GtkTextTag]) */ ]
  )(using Runtime): Boolean /* None */ =
    gtk_text_iter_starts_tag(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextIter]],
      tag
        .map[Ptr[GtkTextTag]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkTextTag]])
    ).value.!=(0)
  end startsTag

  /** Determines whether @iter begins a natural-language word.
    *
    * Word breaks are determined by Pango and should be correct for nearly any
    * language.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def startsWord(): Boolean /* None */ =
    gtk_text_iter_starts_word(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextIter]]
    ).value.!=(0)
  end startsWord

  /** Gets whether a range with @tag applied to it begins or ends at @iter.
    *
    * This is equivalent to (gtk_text_iter_starts_tag() ||
    * gtk_text_iter_ends_tag())
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def togglesTag(
      tag: Option[sn.gnome.gtk4.TextTag /* Some(Ptr[GtkTextTag]) */ ]
  )(using Runtime): Boolean /* None */ =
    gtk_text_iter_toggles_tag(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextIter]],
      tag
        .map[Ptr[GtkTextTag]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GtkTextTag]])
    ).value.!=(0)
  end togglesTag

end TextIter

object TextIter:
  def fromRaw(ptr: Ptr[GtkTextIter]): TextIter = new TextIter(ptr)
end TextIter
