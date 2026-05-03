package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkFileChooserAction: _FILE_CHOOSER_ACTION_OPEN: Indicates open mode. The file chooser will only let the user pick an existing file. _FILE_CHOOSER_ACTION_SAVE: Indicates save mode. The file chooser will let the user pick an existing file, or type in a new filename. _FILE_CHOOSER_ACTION_SELECT_FOLDER: Indicates an Open mode for selecting folders. The file chooser will let the user pick an existing folder.
*/
opaque type GtkFileChooserAction = CUnsignedInt
object GtkFileChooserAction extends _BindgenEnumCUnsignedInt[GtkFileChooserAction]:
  given _tag: Tag[GtkFileChooserAction] = Tag.UInt
  inline def define(inline a: Long): GtkFileChooserAction = a.toUInt
  val GTK_FILE_CHOOSER_ACTION_OPEN = define(0)
  val GTK_FILE_CHOOSER_ACTION_SAVE = define(1)
  val GTK_FILE_CHOOSER_ACTION_SELECT_FOLDER = define(2)
  def getName(value: GtkFileChooserAction): Option[String] =
    value match
      case `GTK_FILE_CHOOSER_ACTION_OPEN` => Some("GTK_FILE_CHOOSER_ACTION_OPEN")
      case `GTK_FILE_CHOOSER_ACTION_SAVE` => Some("GTK_FILE_CHOOSER_ACTION_SAVE")
      case `GTK_FILE_CHOOSER_ACTION_SELECT_FOLDER` => Some("GTK_FILE_CHOOSER_ACTION_SELECT_FOLDER")
      case _ => _root_.scala.None
  extension (a: GtkFileChooserAction)
    inline def &(b: GtkFileChooserAction): GtkFileChooserAction = a & b
    inline def |(b: GtkFileChooserAction): GtkFileChooserAction = a | b
    inline def is(b: GtkFileChooserAction): Boolean = (a & b) == b