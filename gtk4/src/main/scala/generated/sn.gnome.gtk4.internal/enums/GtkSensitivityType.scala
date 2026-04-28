package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkSensitivityType: _SENSITIVITY_AUTO: The control is made insensitive if no action can be triggered _SENSITIVITY_ON: The control is always sensitive _SENSITIVITY_OFF: The control is always insensitive
*/
opaque type GtkSensitivityType = CUnsignedInt
object GtkSensitivityType extends _BindgenEnumCUnsignedInt[GtkSensitivityType]:
  given _tag: Tag[GtkSensitivityType] = Tag.UInt
  inline def define(inline a: Long): GtkSensitivityType = a.toUInt
  val GTK_SENSITIVITY_AUTO = define(0)
  val GTK_SENSITIVITY_ON = define(1)
  val GTK_SENSITIVITY_OFF = define(2)
  def getName(value: GtkSensitivityType): Option[String] =
    value match
      case `GTK_SENSITIVITY_AUTO` => Some("GTK_SENSITIVITY_AUTO")
      case `GTK_SENSITIVITY_ON` => Some("GTK_SENSITIVITY_ON")
      case `GTK_SENSITIVITY_OFF` => Some("GTK_SENSITIVITY_OFF")
      case _ => _root_.scala.None
  extension (a: GtkSensitivityType)
    inline def &(b: GtkSensitivityType): GtkSensitivityType = a & b
    inline def |(b: GtkSensitivityType): GtkSensitivityType = a | b
    inline def is(b: GtkSensitivityType): Boolean = (a & b) == b