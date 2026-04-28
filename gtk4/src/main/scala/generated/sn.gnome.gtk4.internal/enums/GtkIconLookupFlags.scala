package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkIconLookupFlags: _ICON_LOOKUP_FORCE_REGULAR: Try to always load regular icons, even when symbolic icon names are given _ICON_LOOKUP_FORCE_SYMBOLIC: Try to always load symbolic icons, even when regular icon names are given _ICON_LOOKUP_PRELOAD: Starts loading the texture in the background so it is ready when later needed.
*/
opaque type GtkIconLookupFlags = CUnsignedInt
object GtkIconLookupFlags extends _BindgenEnumCUnsignedInt[GtkIconLookupFlags]:
  given _tag: Tag[GtkIconLookupFlags] = Tag.UInt
  inline def define(inline a: Long): GtkIconLookupFlags = a.toUInt
  val GTK_ICON_LOOKUP_FORCE_REGULAR = define(1)
  val GTK_ICON_LOOKUP_FORCE_SYMBOLIC = define(2)
  val GTK_ICON_LOOKUP_PRELOAD = define(4)
  def getName(value: GtkIconLookupFlags): Option[String] =
    value match
      case `GTK_ICON_LOOKUP_FORCE_REGULAR` => Some("GTK_ICON_LOOKUP_FORCE_REGULAR")
      case `GTK_ICON_LOOKUP_FORCE_SYMBOLIC` => Some("GTK_ICON_LOOKUP_FORCE_SYMBOLIC")
      case `GTK_ICON_LOOKUP_PRELOAD` => Some("GTK_ICON_LOOKUP_PRELOAD")
      case _ => _root_.scala.None
  extension (a: GtkIconLookupFlags)
    inline def &(b: GtkIconLookupFlags): GtkIconLookupFlags = a & b
    inline def |(b: GtkIconLookupFlags): GtkIconLookupFlags = a | b
    inline def is(b: GtkIconLookupFlags): Boolean = (a & b) == b