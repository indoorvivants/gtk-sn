package sn.gnome.pango

import _root_.sn.gnome.pango.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.guint
import sn.gnome.pango.internal.PangoLogAttr

/** The `PangoLogAttr` structure stores information about the attributes of a
  * single character.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class LogAttr private[gnome] (raw: Ptr[PangoLogAttr]):

  def getUnsafeRawPointer(): Ptr[PangoLogAttr] = this.raw

  /** if set, can break line in front of character
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isLineBreak: UInt /* None */ =
    (!raw).is_line_break.asInstanceOf[_root_.sn.gnome.glib.internal.guint]

  /** if set, can break line in front of character
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isLineBreak_=(value: UInt /* None */ ): Unit = (!raw).is_line_break_=(
    guint(value).asInstanceOf[_root_.sn.gnome.glib.internal.guint]
  )

  /** if set, must break line in front of character
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isMandatoryBreak: UInt /* None */ =
    (!raw).is_mandatory_break.asInstanceOf[_root_.sn.gnome.glib.internal.guint]

  /** if set, must break line in front of character
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isMandatoryBreak_=(value: UInt /* None */ ): Unit =
    (!raw).is_mandatory_break_=(
      guint(value).asInstanceOf[_root_.sn.gnome.glib.internal.guint]
    )

  /** if set, can break here when doing character wrapping
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isCharBreak: UInt /* None */ =
    (!raw).is_char_break.asInstanceOf[_root_.sn.gnome.glib.internal.guint]

  /** if set, can break here when doing character wrapping
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isCharBreak_=(value: UInt /* None */ ): Unit = (!raw).is_char_break_=(
    guint(value).asInstanceOf[_root_.sn.gnome.glib.internal.guint]
  )

  /** is whitespace character
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isWhite: UInt /* None */ =
    (!raw).is_white.asInstanceOf[_root_.sn.gnome.glib.internal.guint]

  /** is whitespace character
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isWhite_=(value: UInt /* None */ ): Unit = (!raw).is_white_=(
    guint(value).asInstanceOf[_root_.sn.gnome.glib.internal.guint]
  )

  /** if set, cursor can appear in front of character. i.e. this is a grapheme
    * boundary, or the first character in the text. This flag implements
    * Unicode's [Grapheme Cluster
    * Boundaries](http://www.unicode.org/reports/tr29/) semantics.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isCursorPosition: UInt /* None */ =
    (!raw).is_cursor_position.asInstanceOf[_root_.sn.gnome.glib.internal.guint]

  /** if set, cursor can appear in front of character. i.e. this is a grapheme
    * boundary, or the first character in the text. This flag implements
    * Unicode's [Grapheme Cluster
    * Boundaries](http://www.unicode.org/reports/tr29/) semantics.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isCursorPosition_=(value: UInt /* None */ ): Unit =
    (!raw).is_cursor_position_=(
      guint(value).asInstanceOf[_root_.sn.gnome.glib.internal.guint]
    )

  /** is first character in a word
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isWordStart: UInt /* None */ =
    (!raw).is_word_start.asInstanceOf[_root_.sn.gnome.glib.internal.guint]

  /** is first character in a word
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isWordStart_=(value: UInt /* None */ ): Unit = (!raw).is_word_start_=(
    guint(value).asInstanceOf[_root_.sn.gnome.glib.internal.guint]
  )

  /** is first non-word char after a word Note that in degenerate cases, you
    * could have both @is_word_start and @is_word_end set for some character.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isWordEnd: UInt /* None */ =
    (!raw).is_word_end.asInstanceOf[_root_.sn.gnome.glib.internal.guint]

  /** is first non-word char after a word Note that in degenerate cases, you
    * could have both @is_word_start and @is_word_end set for some character.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isWordEnd_=(value: UInt /* None */ ): Unit = (!raw).is_word_end_=(
    guint(value).asInstanceOf[_root_.sn.gnome.glib.internal.guint]
  )

  /** is a sentence boundary. There are two ways to divide sentences. The first
    * assigns all inter-sentence whitespace/control/format chars to some
    * sentence, so all chars are in some sentence; @is_sentence_boundary denotes
    * the boundaries there. The second way doesn't assign between-sentence
    * spaces, etc. to any sentence, so
    * @is_sentence_start/@is_sentence_end
    *   mark the boundaries of those sentences.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isSentenceBoundary: UInt /* None */ = (!raw).is_sentence_boundary
    .asInstanceOf[_root_.sn.gnome.glib.internal.guint]

  /** is a sentence boundary. There are two ways to divide sentences. The first
    * assigns all inter-sentence whitespace/control/format chars to some
    * sentence, so all chars are in some sentence; @is_sentence_boundary denotes
    * the boundaries there. The second way doesn't assign between-sentence
    * spaces, etc. to any sentence, so
    * @is_sentence_start/@is_sentence_end
    *   mark the boundaries of those sentences.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isSentenceBoundary_=(value: UInt /* None */ ): Unit =
    (!raw).is_sentence_boundary_=(
      guint(value).asInstanceOf[_root_.sn.gnome.glib.internal.guint]
    )

  /** is first character in a sentence
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isSentenceStart: UInt /* None */ =
    (!raw).is_sentence_start.asInstanceOf[_root_.sn.gnome.glib.internal.guint]

  /** is first character in a sentence
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isSentenceStart_=(value: UInt /* None */ ): Unit =
    (!raw).is_sentence_start_=(
      guint(value).asInstanceOf[_root_.sn.gnome.glib.internal.guint]
    )

  /** is first char after a sentence. Note that in degenerate cases, you could
    * have both @is_sentence_start and @is_sentence_end set for some character.
    * (e.g. no space after a period, so the next sentence starts right away)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isSentenceEnd: UInt /* None */ =
    (!raw).is_sentence_end.asInstanceOf[_root_.sn.gnome.glib.internal.guint]

  /** is first char after a sentence. Note that in degenerate cases, you could
    * have both @is_sentence_start and @is_sentence_end set for some character.
    * (e.g. no space after a period, so the next sentence starts right away)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isSentenceEnd_=(value: UInt /* None */ ): Unit = (!raw).is_sentence_end_=(
    guint(value).asInstanceOf[_root_.sn.gnome.glib.internal.guint]
  )

  /** if set, backspace deletes one character rather than the entire grapheme
    * cluster. This field is only meaningful on grapheme boundaries (where @is_cursor_position
    * is set). In some languages, the full grapheme (e.g. letter + diacritics)
    * is considered a unit, while in others, each decomposed character in the
    * grapheme is a unit. In the default implementation of [func@break], this
    * bit is set on all grapheme boundaries except those following Latin,
    * Cyrillic or Greek base characters.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def backspaceDeletesCharacter: UInt /* None */ =
    (!raw).backspace_deletes_character
      .asInstanceOf[_root_.sn.gnome.glib.internal.guint]

  /** if set, backspace deletes one character rather than the entire grapheme
    * cluster. This field is only meaningful on grapheme boundaries (where @is_cursor_position
    * is set). In some languages, the full grapheme (e.g. letter + diacritics)
    * is considered a unit, while in others, each decomposed character in the
    * grapheme is a unit. In the default implementation of [func@break], this
    * bit is set on all grapheme boundaries except those following Latin,
    * Cyrillic or Greek base characters.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def backspaceDeletesCharacter_=(value: UInt /* None */ ): Unit =
    (!raw).backspace_deletes_character_=(
      guint(value).asInstanceOf[_root_.sn.gnome.glib.internal.guint]
    )

  /** is a whitespace character that can possibly be expanded for justification
    * purposes. (Since: 1.18)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isExpandableSpace: UInt /* None */ =
    (!raw).is_expandable_space.asInstanceOf[_root_.sn.gnome.glib.internal.guint]

  /** is a whitespace character that can possibly be expanded for justification
    * purposes. (Since: 1.18)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isExpandableSpace_=(value: UInt /* None */ ): Unit =
    (!raw).is_expandable_space_=(
      guint(value).asInstanceOf[_root_.sn.gnome.glib.internal.guint]
    )

  /** is a word boundary, as defined by UAX#29. More specifically, means that
    * this is not a position in the middle of a word. For example, both sides of
    * a punctuation mark are considered word boundaries. This flag is
    * particularly useful when selecting text word-by-word. This flag implements
    * Unicode's [Word Boundaries](http://www.unicode.org/reports/tr29/)
    * semantics. (Since: 1.22)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isWordBoundary: UInt /* None */ =
    (!raw).is_word_boundary.asInstanceOf[_root_.sn.gnome.glib.internal.guint]

  /** is a word boundary, as defined by UAX#29. More specifically, means that
    * this is not a position in the middle of a word. For example, both sides of
    * a punctuation mark are considered word boundaries. This flag is
    * particularly useful when selecting text word-by-word. This flag implements
    * Unicode's [Word Boundaries](http://www.unicode.org/reports/tr29/)
    * semantics. (Since: 1.22)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isWordBoundary_=(value: UInt /* None */ ): Unit =
    (!raw).is_word_boundary_=(
      guint(value).asInstanceOf[_root_.sn.gnome.glib.internal.guint]
    )

  /** when breaking lines before this char, insert a hyphen. Since: 1.50
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def breakInsertsHyphen: UInt /* None */ = (!raw).break_inserts_hyphen
    .asInstanceOf[_root_.sn.gnome.glib.internal.guint]

  /** when breaking lines before this char, insert a hyphen. Since: 1.50
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def breakInsertsHyphen_=(value: UInt /* None */ ): Unit =
    (!raw).break_inserts_hyphen_=(
      guint(value).asInstanceOf[_root_.sn.gnome.glib.internal.guint]
    )

  /** when breaking lines before this char, remove the preceding char. Since
    * 1.50
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def breakRemovesPreceding: UInt /* None */ = (!raw).break_removes_preceding
    .asInstanceOf[_root_.sn.gnome.glib.internal.guint]

  /** when breaking lines before this char, remove the preceding char. Since
    * 1.50
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def breakRemovesPreceding_=(value: UInt /* None */ ): Unit =
    (!raw).break_removes_preceding_=(
      guint(value).asInstanceOf[_root_.sn.gnome.glib.internal.guint]
    )

  def reserved: UInt /* None */ =
    (!raw).reserved.asInstanceOf[_root_.sn.gnome.glib.internal.guint]
  def reserved_=(value: UInt /* None */ ): Unit = (!raw).reserved_=(
    guint(value).asInstanceOf[_root_.sn.gnome.glib.internal.guint]
  )
end LogAttr

object LogAttr:
  def fromRaw(ptr: Ptr[PangoLogAttr]): LogAttr = new LogAttr(ptr)
end LogAttr
