package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-toolbar-view.h
*/
opaque type AdwToolbarStyle = CUnsignedInt
object AdwToolbarStyle extends _BindgenEnumCUnsignedInt[AdwToolbarStyle]:
  given _tag: Tag[AdwToolbarStyle] = Tag.UInt
  inline def define(inline a: Long): AdwToolbarStyle = a.toUInt
  val ADW_TOOLBAR_FLAT = define(0)
  val ADW_TOOLBAR_RAISED = define(1)
  val ADW_TOOLBAR_RAISED_BORDER = define(2)
  def getName(value: AdwToolbarStyle): Option[String] =
    value match
      case `ADW_TOOLBAR_FLAT` => Some("ADW_TOOLBAR_FLAT")
      case `ADW_TOOLBAR_RAISED` => Some("ADW_TOOLBAR_RAISED")
      case `ADW_TOOLBAR_RAISED_BORDER` => Some("ADW_TOOLBAR_RAISED_BORDER")
      case _ => _root_.scala.None
  extension (a: AdwToolbarStyle)
    inline def &(b: AdwToolbarStyle): AdwToolbarStyle = a & b
    inline def |(b: AdwToolbarStyle): AdwToolbarStyle = a | b
    inline def is(b: AdwToolbarStyle): Boolean = (a & b) == b