package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkContentFit: _CONTENT_FIT_FILL: Make the content fill the entire allocation, without taking its aspect ratio in consideration. The resulting content will appear as stretched if its aspect ratio is different from the allocation aspect ratio. _CONTENT_FIT_CONTAIN: Scale the content to fit the allocation, while taking its aspect ratio in consideration. The resulting content will appear as letterboxed if its aspect ratio is different from the allocation aspect ratio. _CONTENT_FIT_COVER: Cover the entire allocation, while taking the content aspect ratio in consideration. The resulting content will appear as clipped if its aspect ratio is different from the allocation aspect ratio. _CONTENT_FIT_SCALE_DOWN: The content is scaled down to fit the allocation, if needed, otherwise its original size is used.
*/
opaque type GtkContentFit = CUnsignedInt
object GtkContentFit extends _BindgenEnumCUnsignedInt[GtkContentFit]:
  given _tag: Tag[GtkContentFit] = Tag.UInt
  inline def define(inline a: Long): GtkContentFit = a.toUInt
  val GTK_CONTENT_FIT_FILL = define(0)
  val GTK_CONTENT_FIT_CONTAIN = define(1)
  val GTK_CONTENT_FIT_COVER = define(2)
  val GTK_CONTENT_FIT_SCALE_DOWN = define(3)
  def getName(value: GtkContentFit): Option[String] =
    value match
      case `GTK_CONTENT_FIT_FILL` => Some("GTK_CONTENT_FIT_FILL")
      case `GTK_CONTENT_FIT_CONTAIN` => Some("GTK_CONTENT_FIT_CONTAIN")
      case `GTK_CONTENT_FIT_COVER` => Some("GTK_CONTENT_FIT_COVER")
      case `GTK_CONTENT_FIT_SCALE_DOWN` => Some("GTK_CONTENT_FIT_SCALE_DOWN")
      case _ => _root_.scala.None
  extension (a: GtkContentFit)
    inline def &(b: GtkContentFit): GtkContentFit = a & b
    inline def |(b: GtkContentFit): GtkContentFit = a | b
    inline def is(b: GtkContentFit): Boolean = (a & b) == b