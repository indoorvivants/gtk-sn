package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkFileChooserError: _FILE_CHOOSER_ERROR_NONEXISTENT: Indicates that a file does not exist. _FILE_CHOOSER_ERROR_BAD_FILENAME: Indicates a malformed filename. _FILE_CHOOSER_ERROR_ALREADY_EXISTS: Indicates a duplicate path (e.g. when adding a bookmark). _FILE_CHOOSER_ERROR_INCOMPLETE_HOSTNAME: Indicates an incomplete hostname (e.g. "http://foo" without a slash after that).
*/
opaque type GtkFileChooserError = CUnsignedInt
object GtkFileChooserError extends _BindgenEnumCUnsignedInt[GtkFileChooserError]:
  given _tag: Tag[GtkFileChooserError] = Tag.UInt
  inline def define(inline a: Long): GtkFileChooserError = a.toUInt
  val GTK_FILE_CHOOSER_ERROR_NONEXISTENT = define(0)
  val GTK_FILE_CHOOSER_ERROR_BAD_FILENAME = define(1)
  val GTK_FILE_CHOOSER_ERROR_ALREADY_EXISTS = define(2)
  val GTK_FILE_CHOOSER_ERROR_INCOMPLETE_HOSTNAME = define(3)
  def getName(value: GtkFileChooserError): Option[String] =
    value match
      case `GTK_FILE_CHOOSER_ERROR_NONEXISTENT` => Some("GTK_FILE_CHOOSER_ERROR_NONEXISTENT")
      case `GTK_FILE_CHOOSER_ERROR_BAD_FILENAME` => Some("GTK_FILE_CHOOSER_ERROR_BAD_FILENAME")
      case `GTK_FILE_CHOOSER_ERROR_ALREADY_EXISTS` => Some("GTK_FILE_CHOOSER_ERROR_ALREADY_EXISTS")
      case `GTK_FILE_CHOOSER_ERROR_INCOMPLETE_HOSTNAME` => Some("GTK_FILE_CHOOSER_ERROR_INCOMPLETE_HOSTNAME")
      case _ => _root_.scala.None
  extension (a: GtkFileChooserError)
    inline def &(b: GtkFileChooserError): GtkFileChooserError = a & b
    inline def |(b: GtkFileChooserError): GtkFileChooserError = a | b
    inline def is(b: GtkFileChooserError): Boolean = (a & b) == b