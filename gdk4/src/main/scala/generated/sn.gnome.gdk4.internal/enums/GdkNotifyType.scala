package sn.gnome.gdk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GdkNotifyType: _NOTIFY_ANCESTOR: the surface is entered from an ancestor or left towards an ancestor. _NOTIFY_VIRTUAL: the pointer moves between an ancestor and an inferior of the surface. _NOTIFY_INFERIOR: the surface is entered from an inferior or left towards an inferior. _NOTIFY_NONLINEAR: the surface is entered from or left towards a surface which is neither an ancestor nor an inferior. _NOTIFY_NONLINEAR_VIRTUAL: the pointer moves between two surfaces which are not ancestors of each other and the surface is part of the ancestor chain between one of these surfaces and their least common ancestor. _NOTIFY_UNKNOWN: an unknown type of enter/leave event occurred.
*/
opaque type GdkNotifyType = CUnsignedInt
object GdkNotifyType extends _BindgenEnumCUnsignedInt[GdkNotifyType]:
  given _tag: Tag[GdkNotifyType] = Tag.UInt
  inline def define(inline a: Long): GdkNotifyType = a.toUInt
  val GDK_NOTIFY_ANCESTOR = define(0)
  val GDK_NOTIFY_VIRTUAL = define(1)
  val GDK_NOTIFY_INFERIOR = define(2)
  val GDK_NOTIFY_NONLINEAR = define(3)
  val GDK_NOTIFY_NONLINEAR_VIRTUAL = define(4)
  val GDK_NOTIFY_UNKNOWN = define(5)
  def getName(value: GdkNotifyType): Option[String] =
    value match
      case `GDK_NOTIFY_ANCESTOR` => Some("GDK_NOTIFY_ANCESTOR")
      case `GDK_NOTIFY_VIRTUAL` => Some("GDK_NOTIFY_VIRTUAL")
      case `GDK_NOTIFY_INFERIOR` => Some("GDK_NOTIFY_INFERIOR")
      case `GDK_NOTIFY_NONLINEAR` => Some("GDK_NOTIFY_NONLINEAR")
      case `GDK_NOTIFY_NONLINEAR_VIRTUAL` => Some("GDK_NOTIFY_NONLINEAR_VIRTUAL")
      case `GDK_NOTIFY_UNKNOWN` => Some("GDK_NOTIFY_UNKNOWN")
      case _ => _root_.scala.None
  extension (a: GdkNotifyType)
    inline def &(b: GdkNotifyType): GdkNotifyType = a & b
    inline def |(b: GdkNotifyType): GdkNotifyType = a | b
    inline def is(b: GdkNotifyType): Boolean = (a & b) == b