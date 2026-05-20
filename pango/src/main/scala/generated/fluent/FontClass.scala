package sn.gnome.pango

import _root_.sn.gnome.pango.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.ObjectClass
import sn.gnome.pango.internal.PangoFontClass

class FontClass private[gnome] (raw: Ptr[PangoFontClass]):

  def getUnsafeRawPointer(): Ptr[PangoFontClass] = this.raw

  def parentClass: sn.gnome.gobject.ObjectClass /* None */ = (!raw).parent_class
    .asInstanceOf[_root_.sn.gnome.gobject.internal.GObjectClass]
  @annotation.compileTimeOnly("[field describe]: Field is missing <type>")
  private def describe__ = ???
  @annotation.compileTimeOnly("[field get_coverage]: Field is missing <type>")
  private def getCoverage__ = ???
  @annotation.compileTimeOnly(
    "[field get_glyph_extents]: Field is missing <type>"
  )
  private def getGlyphExtents__ = ???
  @annotation.compileTimeOnly("[field get_metrics]: Field is missing <type>")
  private def getMetrics__ = ???
  @annotation.compileTimeOnly("[field get_font_map]: Field is missing <type>")
  private def getFontMap__ = ???
  @annotation.compileTimeOnly(
    "[field describe_absolute]: Field is missing <type>"
  )
  private def describeAbsolute__ = ???
  @annotation.compileTimeOnly("[field get_features]: Field is missing <type>")
  private def getFeatures__ = ???
  @annotation.compileTimeOnly("[field create_hb_font]: Field is missing <type>")
  private def createHbFont__ = ???
end FontClass

object FontClass:
  def fromRaw(ptr: Ptr[PangoFontClass]): FontClass = new FontClass(ptr)
end FontClass
