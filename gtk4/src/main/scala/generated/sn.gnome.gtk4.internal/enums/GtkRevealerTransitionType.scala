package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkRevealerTransitionType = CUnsignedInt
object GtkRevealerTransitionType extends _BindgenEnumCUnsignedInt[GtkRevealerTransitionType]:
  given _tag: Tag[GtkRevealerTransitionType] = Tag.UInt
  inline def define(inline a: Long): GtkRevealerTransitionType = a.toUInt
  val GTK_REVEALER_TRANSITION_TYPE_NONE = define(0)
  val GTK_REVEALER_TRANSITION_TYPE_CROSSFADE = define(1)
  val GTK_REVEALER_TRANSITION_TYPE_SLIDE_RIGHT = define(2)
  val GTK_REVEALER_TRANSITION_TYPE_SLIDE_LEFT = define(3)
  val GTK_REVEALER_TRANSITION_TYPE_SLIDE_UP = define(4)
  val GTK_REVEALER_TRANSITION_TYPE_SLIDE_DOWN = define(5)
  val GTK_REVEALER_TRANSITION_TYPE_SWING_RIGHT = define(6)
  val GTK_REVEALER_TRANSITION_TYPE_SWING_LEFT = define(7)
  val GTK_REVEALER_TRANSITION_TYPE_SWING_UP = define(8)
  val GTK_REVEALER_TRANSITION_TYPE_SWING_DOWN = define(9)
  def getName(value: GtkRevealerTransitionType): Option[String] =
    value match
      case `GTK_REVEALER_TRANSITION_TYPE_NONE` => Some("GTK_REVEALER_TRANSITION_TYPE_NONE")
      case `GTK_REVEALER_TRANSITION_TYPE_CROSSFADE` => Some("GTK_REVEALER_TRANSITION_TYPE_CROSSFADE")
      case `GTK_REVEALER_TRANSITION_TYPE_SLIDE_RIGHT` => Some("GTK_REVEALER_TRANSITION_TYPE_SLIDE_RIGHT")
      case `GTK_REVEALER_TRANSITION_TYPE_SLIDE_LEFT` => Some("GTK_REVEALER_TRANSITION_TYPE_SLIDE_LEFT")
      case `GTK_REVEALER_TRANSITION_TYPE_SLIDE_UP` => Some("GTK_REVEALER_TRANSITION_TYPE_SLIDE_UP")
      case `GTK_REVEALER_TRANSITION_TYPE_SLIDE_DOWN` => Some("GTK_REVEALER_TRANSITION_TYPE_SLIDE_DOWN")
      case `GTK_REVEALER_TRANSITION_TYPE_SWING_RIGHT` => Some("GTK_REVEALER_TRANSITION_TYPE_SWING_RIGHT")
      case `GTK_REVEALER_TRANSITION_TYPE_SWING_LEFT` => Some("GTK_REVEALER_TRANSITION_TYPE_SWING_LEFT")
      case `GTK_REVEALER_TRANSITION_TYPE_SWING_UP` => Some("GTK_REVEALER_TRANSITION_TYPE_SWING_UP")
      case `GTK_REVEALER_TRANSITION_TYPE_SWING_DOWN` => Some("GTK_REVEALER_TRANSITION_TYPE_SWING_DOWN")
      case _ => _root_.scala.None
  extension (a: GtkRevealerTransitionType)
    inline def &(b: GtkRevealerTransitionType): GtkRevealerTransitionType = a & b
    inline def |(b: GtkRevealerTransitionType): GtkRevealerTransitionType = a | b
    inline def is(b: GtkRevealerTransitionType): Boolean = (a & b) == b