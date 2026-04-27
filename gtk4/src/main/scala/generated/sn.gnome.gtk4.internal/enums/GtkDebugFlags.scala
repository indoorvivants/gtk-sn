package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GTK_DEBUG_INVERT_TEXT_DIR:
*/
opaque type GtkDebugFlags = CUnsignedInt
object GtkDebugFlags extends _BindgenEnumCUnsignedInt[GtkDebugFlags]:
  given _tag: Tag[GtkDebugFlags] = Tag.UInt
  inline def define(inline a: Long): GtkDebugFlags = a.toUInt
  val GTK_DEBUG_TEXT = define(1)
  val GTK_DEBUG_TREE = define(2)
  val GTK_DEBUG_KEYBINDINGS = define(4)
  val GTK_DEBUG_MODULES = define(8)
  val GTK_DEBUG_GEOMETRY = define(16)
  val GTK_DEBUG_ICONTHEME = define(32)
  val GTK_DEBUG_PRINTING = define(64)
  val GTK_DEBUG_BUILDER = define(128)
  val GTK_DEBUG_SIZE_REQUEST = define(256)
  val GTK_DEBUG_NO_CSS_CACHE = define(512)
  val GTK_DEBUG_INTERACTIVE = define(1024)
  val GTK_DEBUG_ACTIONS = define(4096)
  val GTK_DEBUG_LAYOUT = define(8192)
  val GTK_DEBUG_SNAPSHOT = define(16384)
  val GTK_DEBUG_CONSTRAINTS = define(32768)
  val GTK_DEBUG_BUILDER_OBJECTS = define(65536)
  val GTK_DEBUG_A11Y = define(131072)
  val GTK_DEBUG_ICONFALLBACK = define(262144)
  val GTK_DEBUG_INVERT_TEXT_DIR = define(524288)
  def getName(value: GtkDebugFlags): Option[String] =
    value match
      case `GTK_DEBUG_TEXT` => Some("GTK_DEBUG_TEXT")
      case `GTK_DEBUG_TREE` => Some("GTK_DEBUG_TREE")
      case `GTK_DEBUG_KEYBINDINGS` => Some("GTK_DEBUG_KEYBINDINGS")
      case `GTK_DEBUG_MODULES` => Some("GTK_DEBUG_MODULES")
      case `GTK_DEBUG_GEOMETRY` => Some("GTK_DEBUG_GEOMETRY")
      case `GTK_DEBUG_ICONTHEME` => Some("GTK_DEBUG_ICONTHEME")
      case `GTK_DEBUG_PRINTING` => Some("GTK_DEBUG_PRINTING")
      case `GTK_DEBUG_BUILDER` => Some("GTK_DEBUG_BUILDER")
      case `GTK_DEBUG_SIZE_REQUEST` => Some("GTK_DEBUG_SIZE_REQUEST")
      case `GTK_DEBUG_NO_CSS_CACHE` => Some("GTK_DEBUG_NO_CSS_CACHE")
      case `GTK_DEBUG_INTERACTIVE` => Some("GTK_DEBUG_INTERACTIVE")
      case `GTK_DEBUG_ACTIONS` => Some("GTK_DEBUG_ACTIONS")
      case `GTK_DEBUG_LAYOUT` => Some("GTK_DEBUG_LAYOUT")
      case `GTK_DEBUG_SNAPSHOT` => Some("GTK_DEBUG_SNAPSHOT")
      case `GTK_DEBUG_CONSTRAINTS` => Some("GTK_DEBUG_CONSTRAINTS")
      case `GTK_DEBUG_BUILDER_OBJECTS` => Some("GTK_DEBUG_BUILDER_OBJECTS")
      case `GTK_DEBUG_A11Y` => Some("GTK_DEBUG_A11Y")
      case `GTK_DEBUG_ICONFALLBACK` => Some("GTK_DEBUG_ICONFALLBACK")
      case `GTK_DEBUG_INVERT_TEXT_DIR` => Some("GTK_DEBUG_INVERT_TEXT_DIR")
      case _ => _root_.scala.None
  extension (a: GtkDebugFlags)
    inline def &(b: GtkDebugFlags): GtkDebugFlags = a & b
    inline def |(b: GtkDebugFlags): GtkDebugFlags = a | b
    inline def is(b: GtkDebugFlags): Boolean = (a & b) == b