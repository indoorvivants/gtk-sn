package sn.gnome.pango

import _root_.sn.gnome.pango.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.ObjectClass
import sn.gnome.pango.internal.PangoFontsetClass

/** The `PangoFontsetClass` structure holds the virtual functions for a
  * particular `PangoFontset` implementation.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class FontsetClass private[gnome] (raw: Ptr[PangoFontsetClass]):

  def getUnsafeRawPointer(): Ptr[PangoFontsetClass] = this.raw

  /** parent `GObjectClass`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def parentClass: sn.gnome.gobject.ObjectClass /* None */ = (!raw).parent_class
    .asInstanceOf[_root_.sn.gnome.gobject.internal.GObjectClass]
  @annotation.compileTimeOnly("[field get_font]: Field is missing <type>")
  private def getFont__ = ???
  @annotation.compileTimeOnly("[field get_metrics]: Field is missing <type>")
  private def getMetrics__ = ???
  @annotation.compileTimeOnly("[field get_language]: Field is missing <type>")
  private def getLanguage__ = ???
  @annotation.compileTimeOnly("[field foreach]: Field is missing <type>")
  private def foreach__ = ???
  @annotation.compileTimeOnly(
    "[field _pango_reserved1]: Field is missing <type>"
  )
  private def PangoReserved1__ = ???
  @annotation.compileTimeOnly(
    "[field _pango_reserved2]: Field is missing <type>"
  )
  private def PangoReserved2__ = ???
  @annotation.compileTimeOnly(
    "[field _pango_reserved3]: Field is missing <type>"
  )
  private def PangoReserved3__ = ???
  @annotation.compileTimeOnly(
    "[field _pango_reserved4]: Field is missing <type>"
  )
  private def PangoReserved4__ = ???
end FontsetClass

object FontsetClass:
  def fromRaw(ptr: Ptr[PangoFontsetClass]): FontsetClass = new FontsetClass(ptr)
end FontsetClass
