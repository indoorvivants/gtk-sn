package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkDirectionType: _DIR_TAB_FORWARD: Move forward. _DIR_TAB_BACKWARD: Move backward. _DIR_UP: Move up. _DIR_DOWN: Move down. _DIR_LEFT: Move left. _DIR_RIGHT: Move right.
*/
opaque type GtkDirectionType = CUnsignedInt
object GtkDirectionType extends _BindgenEnumCUnsignedInt[GtkDirectionType]:
  given _tag: Tag[GtkDirectionType] = Tag.UInt
  inline def define(inline a: Long): GtkDirectionType = a.toUInt
  val GTK_DIR_TAB_FORWARD = define(0)
  val GTK_DIR_TAB_BACKWARD = define(1)
  val GTK_DIR_UP = define(2)
  val GTK_DIR_DOWN = define(3)
  val GTK_DIR_LEFT = define(4)
  val GTK_DIR_RIGHT = define(5)
  def getName(value: GtkDirectionType): Option[String] =
    value match
      case `GTK_DIR_TAB_FORWARD` => Some("GTK_DIR_TAB_FORWARD")
      case `GTK_DIR_TAB_BACKWARD` => Some("GTK_DIR_TAB_BACKWARD")
      case `GTK_DIR_UP` => Some("GTK_DIR_UP")
      case `GTK_DIR_DOWN` => Some("GTK_DIR_DOWN")
      case `GTK_DIR_LEFT` => Some("GTK_DIR_LEFT")
      case `GTK_DIR_RIGHT` => Some("GTK_DIR_RIGHT")
      case _ => _root_.scala.None
  extension (a: GtkDirectionType)
    inline def &(b: GtkDirectionType): GtkDirectionType = a & b
    inline def |(b: GtkDirectionType): GtkDirectionType = a | b
    inline def is(b: GtkDirectionType): Boolean = (a & b) == b