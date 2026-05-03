package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkSpinType: _SPIN_STEP_FORWARD: Increment by the adjustments step increment. _SPIN_STEP_BACKWARD: Decrement by the adjustments step increment. _SPIN_PAGE_FORWARD: Increment by the adjustments page increment. _SPIN_PAGE_BACKWARD: Decrement by the adjustments page increment. _SPIN_HOME: Go to the adjustments lower bound. _SPIN_END: Go to the adjustments upper bound. _SPIN_USER_DEFINED: Change by a specified amount.
*/
opaque type GtkSpinType = CUnsignedInt
object GtkSpinType extends _BindgenEnumCUnsignedInt[GtkSpinType]:
  given _tag: Tag[GtkSpinType] = Tag.UInt
  inline def define(inline a: Long): GtkSpinType = a.toUInt
  val GTK_SPIN_STEP_FORWARD = define(0)
  val GTK_SPIN_STEP_BACKWARD = define(1)
  val GTK_SPIN_PAGE_FORWARD = define(2)
  val GTK_SPIN_PAGE_BACKWARD = define(3)
  val GTK_SPIN_HOME = define(4)
  val GTK_SPIN_END = define(5)
  val GTK_SPIN_USER_DEFINED = define(6)
  def getName(value: GtkSpinType): Option[String] =
    value match
      case `GTK_SPIN_STEP_FORWARD` => Some("GTK_SPIN_STEP_FORWARD")
      case `GTK_SPIN_STEP_BACKWARD` => Some("GTK_SPIN_STEP_BACKWARD")
      case `GTK_SPIN_PAGE_FORWARD` => Some("GTK_SPIN_PAGE_FORWARD")
      case `GTK_SPIN_PAGE_BACKWARD` => Some("GTK_SPIN_PAGE_BACKWARD")
      case `GTK_SPIN_HOME` => Some("GTK_SPIN_HOME")
      case `GTK_SPIN_END` => Some("GTK_SPIN_END")
      case `GTK_SPIN_USER_DEFINED` => Some("GTK_SPIN_USER_DEFINED")
      case _ => _root_.scala.None
  extension (a: GtkSpinType)
    inline def &(b: GtkSpinType): GtkSpinType = a & b
    inline def |(b: GtkSpinType): GtkSpinType = a | b
    inline def is(b: GtkSpinType): Boolean = (a & b) == b