package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkInputPurpose: _INPUT_PURPOSE_FREE_FORM: Allow any character _INPUT_PURPOSE_ALPHA: Allow only alphabetic characters _INPUT_PURPOSE_DIGITS: Allow only digits _INPUT_PURPOSE_NUMBER: Edited field expects numbers _INPUT_PURPOSE_PHONE: Edited field expects phone number _INPUT_PURPOSE_URL: Edited field expects URL _INPUT_PURPOSE_EMAIL: Edited field expects email address _INPUT_PURPOSE_NAME: Edited field expects the name of a person _INPUT_PURPOSE_PASSWORD: Like %GTK_INPUT_PURPOSE_FREE_FORM, but characters are hidden _INPUT_PURPOSE_PIN: Like %GTK_INPUT_PURPOSE_DIGITS, but characters are hidden _INPUT_PURPOSE_TERMINAL: Allow any character, in addition to control codes
*/
opaque type GtkInputPurpose = CUnsignedInt
object GtkInputPurpose extends _BindgenEnumCUnsignedInt[GtkInputPurpose]:
  given _tag: Tag[GtkInputPurpose] = Tag.UInt
  inline def define(inline a: Long): GtkInputPurpose = a.toUInt
  val GTK_INPUT_PURPOSE_FREE_FORM = define(0)
  val GTK_INPUT_PURPOSE_ALPHA = define(1)
  val GTK_INPUT_PURPOSE_DIGITS = define(2)
  val GTK_INPUT_PURPOSE_NUMBER = define(3)
  val GTK_INPUT_PURPOSE_PHONE = define(4)
  val GTK_INPUT_PURPOSE_URL = define(5)
  val GTK_INPUT_PURPOSE_EMAIL = define(6)
  val GTK_INPUT_PURPOSE_NAME = define(7)
  val GTK_INPUT_PURPOSE_PASSWORD = define(8)
  val GTK_INPUT_PURPOSE_PIN = define(9)
  val GTK_INPUT_PURPOSE_TERMINAL = define(10)
  def getName(value: GtkInputPurpose): Option[String] =
    value match
      case `GTK_INPUT_PURPOSE_FREE_FORM` => Some("GTK_INPUT_PURPOSE_FREE_FORM")
      case `GTK_INPUT_PURPOSE_ALPHA` => Some("GTK_INPUT_PURPOSE_ALPHA")
      case `GTK_INPUT_PURPOSE_DIGITS` => Some("GTK_INPUT_PURPOSE_DIGITS")
      case `GTK_INPUT_PURPOSE_NUMBER` => Some("GTK_INPUT_PURPOSE_NUMBER")
      case `GTK_INPUT_PURPOSE_PHONE` => Some("GTK_INPUT_PURPOSE_PHONE")
      case `GTK_INPUT_PURPOSE_URL` => Some("GTK_INPUT_PURPOSE_URL")
      case `GTK_INPUT_PURPOSE_EMAIL` => Some("GTK_INPUT_PURPOSE_EMAIL")
      case `GTK_INPUT_PURPOSE_NAME` => Some("GTK_INPUT_PURPOSE_NAME")
      case `GTK_INPUT_PURPOSE_PASSWORD` => Some("GTK_INPUT_PURPOSE_PASSWORD")
      case `GTK_INPUT_PURPOSE_PIN` => Some("GTK_INPUT_PURPOSE_PIN")
      case `GTK_INPUT_PURPOSE_TERMINAL` => Some("GTK_INPUT_PURPOSE_TERMINAL")
      case _ => _root_.scala.None
  extension (a: GtkInputPurpose)
    inline def &(b: GtkInputPurpose): GtkInputPurpose = a & b
    inline def |(b: GtkInputPurpose): GtkInputPurpose = a | b
    inline def is(b: GtkInputPurpose): Boolean = (a & b) == b