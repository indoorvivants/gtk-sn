package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GUnicodeType: _UNICODE_CONTROL: General category "Other, Control" (Cc) _UNICODE_FORMAT: General category "Other, Format" (Cf) _UNICODE_UNASSIGNED: General category "Other, Not Assigned" (Cn) _UNICODE_PRIVATE_USE: General category "Other, Private Use" (Co) _UNICODE_SURROGATE: General category "Other, Surrogate" (Cs) _UNICODE_LOWERCASE_LETTER: General category "Letter, Lowercase" (Ll) _UNICODE_MODIFIER_LETTER: General category "Letter, Modifier" (Lm) _UNICODE_OTHER_LETTER: General category "Letter, Other" (Lo) _UNICODE_TITLECASE_LETTER: General category "Letter, Titlecase" (Lt) _UNICODE_UPPERCASE_LETTER: General category "Letter, Uppercase" (Lu) _UNICODE_SPACING_MARK: General category "Mark, Spacing" (Mc) _UNICODE_ENCLOSING_MARK: General category "Mark, Enclosing" (Me) _UNICODE_NON_SPACING_MARK: General category "Mark, Nonspacing" (Mn) _UNICODE_DECIMAL_NUMBER: General category "Number, Decimal Digit" (Nd) _UNICODE_LETTER_NUMBER: General category "Number, Letter" (Nl) _UNICODE_OTHER_NUMBER: General category "Number, Other" (No) _UNICODE_CONNECT_PUNCTUATION: General category "Punctuation, Connector" (Pc) _UNICODE_DASH_PUNCTUATION: General category "Punctuation, Dash" (Pd) _UNICODE_CLOSE_PUNCTUATION: General category "Punctuation, Close" (Pe) _UNICODE_FINAL_PUNCTUATION: General category "Punctuation, Final quote" (Pf) _UNICODE_INITIAL_PUNCTUATION: General category "Punctuation, Initial quote" (Pi) _UNICODE_OTHER_PUNCTUATION: General category "Punctuation, Other" (Po) _UNICODE_OPEN_PUNCTUATION: General category "Punctuation, Open" (Ps) _UNICODE_CURRENCY_SYMBOL: General category "Symbol, Currency" (Sc) _UNICODE_MODIFIER_SYMBOL: General category "Symbol, Modifier" (Sk) _UNICODE_MATH_SYMBOL: General category "Symbol, Math" (Sm) _UNICODE_OTHER_SYMBOL: General category "Symbol, Other" (So) _UNICODE_LINE_SEPARATOR: General category "Separator, Line" (Zl) _UNICODE_PARAGRAPH_SEPARATOR: General category "Separator, Paragraph" (Zp) _UNICODE_SPACE_SEPARATOR: General category "Separator, Space" (Zs)
*/
opaque type GUnicodeType = CUnsignedInt
object GUnicodeType extends _BindgenEnumCUnsignedInt[GUnicodeType]:
  given _tag: Tag[GUnicodeType] = Tag.UInt
  inline def define(inline a: Long): GUnicodeType = a.toUInt
  val G_UNICODE_CONTROL = define(0)
  val G_UNICODE_FORMAT = define(1)
  val G_UNICODE_UNASSIGNED = define(2)
  val G_UNICODE_PRIVATE_USE = define(3)
  val G_UNICODE_SURROGATE = define(4)
  val G_UNICODE_LOWERCASE_LETTER = define(5)
  val G_UNICODE_MODIFIER_LETTER = define(6)
  val G_UNICODE_OTHER_LETTER = define(7)
  val G_UNICODE_TITLECASE_LETTER = define(8)
  val G_UNICODE_UPPERCASE_LETTER = define(9)
  val G_UNICODE_SPACING_MARK = define(10)
  val G_UNICODE_ENCLOSING_MARK = define(11)
  val G_UNICODE_NON_SPACING_MARK = define(12)
  val G_UNICODE_DECIMAL_NUMBER = define(13)
  val G_UNICODE_LETTER_NUMBER = define(14)
  val G_UNICODE_OTHER_NUMBER = define(15)
  val G_UNICODE_CONNECT_PUNCTUATION = define(16)
  val G_UNICODE_DASH_PUNCTUATION = define(17)
  val G_UNICODE_CLOSE_PUNCTUATION = define(18)
  val G_UNICODE_FINAL_PUNCTUATION = define(19)
  val G_UNICODE_INITIAL_PUNCTUATION = define(20)
  val G_UNICODE_OTHER_PUNCTUATION = define(21)
  val G_UNICODE_OPEN_PUNCTUATION = define(22)
  val G_UNICODE_CURRENCY_SYMBOL = define(23)
  val G_UNICODE_MODIFIER_SYMBOL = define(24)
  val G_UNICODE_MATH_SYMBOL = define(25)
  val G_UNICODE_OTHER_SYMBOL = define(26)
  val G_UNICODE_LINE_SEPARATOR = define(27)
  val G_UNICODE_PARAGRAPH_SEPARATOR = define(28)
  val G_UNICODE_SPACE_SEPARATOR = define(29)
  def getName(value: GUnicodeType): Option[String] =
    value match
      case `G_UNICODE_CONTROL` => Some("G_UNICODE_CONTROL")
      case `G_UNICODE_FORMAT` => Some("G_UNICODE_FORMAT")
      case `G_UNICODE_UNASSIGNED` => Some("G_UNICODE_UNASSIGNED")
      case `G_UNICODE_PRIVATE_USE` => Some("G_UNICODE_PRIVATE_USE")
      case `G_UNICODE_SURROGATE` => Some("G_UNICODE_SURROGATE")
      case `G_UNICODE_LOWERCASE_LETTER` => Some("G_UNICODE_LOWERCASE_LETTER")
      case `G_UNICODE_MODIFIER_LETTER` => Some("G_UNICODE_MODIFIER_LETTER")
      case `G_UNICODE_OTHER_LETTER` => Some("G_UNICODE_OTHER_LETTER")
      case `G_UNICODE_TITLECASE_LETTER` => Some("G_UNICODE_TITLECASE_LETTER")
      case `G_UNICODE_UPPERCASE_LETTER` => Some("G_UNICODE_UPPERCASE_LETTER")
      case `G_UNICODE_SPACING_MARK` => Some("G_UNICODE_SPACING_MARK")
      case `G_UNICODE_ENCLOSING_MARK` => Some("G_UNICODE_ENCLOSING_MARK")
      case `G_UNICODE_NON_SPACING_MARK` => Some("G_UNICODE_NON_SPACING_MARK")
      case `G_UNICODE_DECIMAL_NUMBER` => Some("G_UNICODE_DECIMAL_NUMBER")
      case `G_UNICODE_LETTER_NUMBER` => Some("G_UNICODE_LETTER_NUMBER")
      case `G_UNICODE_OTHER_NUMBER` => Some("G_UNICODE_OTHER_NUMBER")
      case `G_UNICODE_CONNECT_PUNCTUATION` => Some("G_UNICODE_CONNECT_PUNCTUATION")
      case `G_UNICODE_DASH_PUNCTUATION` => Some("G_UNICODE_DASH_PUNCTUATION")
      case `G_UNICODE_CLOSE_PUNCTUATION` => Some("G_UNICODE_CLOSE_PUNCTUATION")
      case `G_UNICODE_FINAL_PUNCTUATION` => Some("G_UNICODE_FINAL_PUNCTUATION")
      case `G_UNICODE_INITIAL_PUNCTUATION` => Some("G_UNICODE_INITIAL_PUNCTUATION")
      case `G_UNICODE_OTHER_PUNCTUATION` => Some("G_UNICODE_OTHER_PUNCTUATION")
      case `G_UNICODE_OPEN_PUNCTUATION` => Some("G_UNICODE_OPEN_PUNCTUATION")
      case `G_UNICODE_CURRENCY_SYMBOL` => Some("G_UNICODE_CURRENCY_SYMBOL")
      case `G_UNICODE_MODIFIER_SYMBOL` => Some("G_UNICODE_MODIFIER_SYMBOL")
      case `G_UNICODE_MATH_SYMBOL` => Some("G_UNICODE_MATH_SYMBOL")
      case `G_UNICODE_OTHER_SYMBOL` => Some("G_UNICODE_OTHER_SYMBOL")
      case `G_UNICODE_LINE_SEPARATOR` => Some("G_UNICODE_LINE_SEPARATOR")
      case `G_UNICODE_PARAGRAPH_SEPARATOR` => Some("G_UNICODE_PARAGRAPH_SEPARATOR")
      case `G_UNICODE_SPACE_SEPARATOR` => Some("G_UNICODE_SPACE_SEPARATOR")
      case _ => _root_.scala.None
  extension (a: GUnicodeType)
    inline def &(b: GUnicodeType): GUnicodeType = a & b
    inline def |(b: GUnicodeType): GUnicodeType = a | b
    inline def is(b: GUnicodeType): Boolean = (a & b) == b