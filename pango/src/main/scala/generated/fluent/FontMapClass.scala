package sn.gnome.pango

import _root_.sn.gnome.pango.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.ObjectClass
import sn.gnome.pango.internal.PangoFontMapClass

/** The `PangoFontMapClass` structure holds the virtual functions for a
  * particular `PangoFontMap` implementation.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class FontMapClass private[gnome] (raw: Ptr[PangoFontMapClass]):

  def getUnsafeRawPointer(): Ptr[PangoFontMapClass] = this.raw

  /** parent `GObjectClass`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def parentClass: sn.gnome.gobject.ObjectClass /* None */ = (!raw).parent_class
    .asInstanceOf[_root_.sn.gnome.gobject.internal.GObjectClass]
  @annotation.compileTimeOnly("[field load_font]: Field is missing <type>")
  private def loadFont__ = ???
  @annotation.compileTimeOnly("[field list_families]: Field is missing <type>")
  private def listFamilies__ = ???
  @annotation.compileTimeOnly("[field load_fontset]: Field is missing <type>")
  private def loadFontset__ = ???

  /** the type of rendering-system-dependent engines that can handle fonts of
    * this fonts loaded with this fontmap.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def shapeEngineType: scala.Predef.String /* None */ =
    (!raw).shape_engine_type.asInstanceOf[CString]
  @annotation.compileTimeOnly("[field get_serial]: Field is missing <type>")
  private def getSerial__ = ???
  @annotation.compileTimeOnly("[field changed]: Field is missing <type>")
  private def changed__ = ???
  @annotation.compileTimeOnly("[field get_family]: Field is missing <type>")
  private def getFamily__ = ???
  @annotation.compileTimeOnly("[field get_face]: Field is missing <type>")
  private def getFace__ = ???
end FontMapClass

object FontMapClass:
  def fromRaw(ptr: Ptr[PangoFontMapClass]): FontMapClass = new FontMapClass(ptr)
end FontMapClass
