package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkImageType: _IMAGE_EMPTY: there is no image displayed by the widget _IMAGE_ICON_NAME: the widget contains a named icon _IMAGE_GICON: the widget contains a `GIcon` _IMAGE_PAINTABLE: the widget contains a `GdkPaintable`
*/
opaque type GtkImageType = CUnsignedInt
object GtkImageType extends _BindgenEnumCUnsignedInt[GtkImageType]:
  given _tag: Tag[GtkImageType] = Tag.UInt
  inline def define(inline a: Long): GtkImageType = a.toUInt
  val GTK_IMAGE_EMPTY = define(0)
  val GTK_IMAGE_ICON_NAME = define(1)
  val GTK_IMAGE_GICON = define(2)
  val GTK_IMAGE_PAINTABLE = define(3)
  def getName(value: GtkImageType): Option[String] =
    value match
      case `GTK_IMAGE_EMPTY` => Some("GTK_IMAGE_EMPTY")
      case `GTK_IMAGE_ICON_NAME` => Some("GTK_IMAGE_ICON_NAME")
      case `GTK_IMAGE_GICON` => Some("GTK_IMAGE_GICON")
      case `GTK_IMAGE_PAINTABLE` => Some("GTK_IMAGE_PAINTABLE")
      case _ => _root_.scala.None
  extension (a: GtkImageType)
    inline def &(b: GtkImageType): GtkImageType = a & b
    inline def |(b: GtkImageType): GtkImageType = a | b
    inline def is(b: GtkImageType): Boolean = (a & b) == b