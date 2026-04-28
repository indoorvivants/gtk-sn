package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkInputHints: _INPUT_HINT_NONE: No special behaviour suggested _INPUT_HINT_SPELLCHECK: Suggest checking for typos _INPUT_HINT_NO_SPELLCHECK: Suggest not checking for typos _INPUT_HINT_WORD_COMPLETION: Suggest word completion _INPUT_HINT_LOWERCASE: Suggest to convert all text to lowercase _INPUT_HINT_UPPERCASE_CHARS: Suggest to capitalize all text _INPUT_HINT_UPPERCASE_WORDS: Suggest to capitalize the first character of each word _INPUT_HINT_UPPERCASE_SENTENCES: Suggest to capitalize the first word of each sentence _INPUT_HINT_INHIBIT_OSK: Suggest to not show an onscreen keyboard (e.g for a calculator that already has all the keys). _INPUT_HINT_VERTICAL_WRITING: The text is vertical _INPUT_HINT_EMOJI: Suggest offering Emoji support _INPUT_HINT_NO_EMOJI: Suggest not offering Emoji support _INPUT_HINT_PRIVATE: Request that the input method should not update personalized data (like typing history)
*/
opaque type GtkInputHints = CUnsignedInt
object GtkInputHints extends _BindgenEnumCUnsignedInt[GtkInputHints]:
  given _tag: Tag[GtkInputHints] = Tag.UInt
  inline def define(inline a: Long): GtkInputHints = a.toUInt
  val GTK_INPUT_HINT_NONE = define(0)
  val GTK_INPUT_HINT_SPELLCHECK = define(1)
  val GTK_INPUT_HINT_NO_SPELLCHECK = define(2)
  val GTK_INPUT_HINT_WORD_COMPLETION = define(4)
  val GTK_INPUT_HINT_LOWERCASE = define(8)
  val GTK_INPUT_HINT_UPPERCASE_CHARS = define(16)
  val GTK_INPUT_HINT_UPPERCASE_WORDS = define(32)
  val GTK_INPUT_HINT_UPPERCASE_SENTENCES = define(64)
  val GTK_INPUT_HINT_INHIBIT_OSK = define(128)
  val GTK_INPUT_HINT_VERTICAL_WRITING = define(256)
  val GTK_INPUT_HINT_EMOJI = define(512)
  val GTK_INPUT_HINT_NO_EMOJI = define(1024)
  val GTK_INPUT_HINT_PRIVATE = define(2048)
  def getName(value: GtkInputHints): Option[String] =
    value match
      case `GTK_INPUT_HINT_NONE` => Some("GTK_INPUT_HINT_NONE")
      case `GTK_INPUT_HINT_SPELLCHECK` => Some("GTK_INPUT_HINT_SPELLCHECK")
      case `GTK_INPUT_HINT_NO_SPELLCHECK` => Some("GTK_INPUT_HINT_NO_SPELLCHECK")
      case `GTK_INPUT_HINT_WORD_COMPLETION` => Some("GTK_INPUT_HINT_WORD_COMPLETION")
      case `GTK_INPUT_HINT_LOWERCASE` => Some("GTK_INPUT_HINT_LOWERCASE")
      case `GTK_INPUT_HINT_UPPERCASE_CHARS` => Some("GTK_INPUT_HINT_UPPERCASE_CHARS")
      case `GTK_INPUT_HINT_UPPERCASE_WORDS` => Some("GTK_INPUT_HINT_UPPERCASE_WORDS")
      case `GTK_INPUT_HINT_UPPERCASE_SENTENCES` => Some("GTK_INPUT_HINT_UPPERCASE_SENTENCES")
      case `GTK_INPUT_HINT_INHIBIT_OSK` => Some("GTK_INPUT_HINT_INHIBIT_OSK")
      case `GTK_INPUT_HINT_VERTICAL_WRITING` => Some("GTK_INPUT_HINT_VERTICAL_WRITING")
      case `GTK_INPUT_HINT_EMOJI` => Some("GTK_INPUT_HINT_EMOJI")
      case `GTK_INPUT_HINT_NO_EMOJI` => Some("GTK_INPUT_HINT_NO_EMOJI")
      case `GTK_INPUT_HINT_PRIVATE` => Some("GTK_INPUT_HINT_PRIVATE")
      case _ => _root_.scala.None
  extension (a: GtkInputHints)
    inline def &(b: GtkInputHints): GtkInputHints = a & b
    inline def |(b: GtkInputHints): GtkInputHints = a | b
    inline def is(b: GtkInputHints): Boolean = (a & b) == b