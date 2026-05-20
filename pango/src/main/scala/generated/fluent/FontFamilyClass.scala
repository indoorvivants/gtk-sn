package sn.gnome.pango

import _root_.sn.gnome.pango.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.ObjectClass
import sn.gnome.pango.internal.PangoFontFamilyClass

class FontFamilyClass private[gnome] (raw: Ptr[PangoFontFamilyClass]):

  def getUnsafeRawPointer(): Ptr[PangoFontFamilyClass] = this.raw

  def parentClass: sn.gnome.gobject.ObjectClass /* None */ = (!raw).parent_class
    .asInstanceOf[_root_.sn.gnome.gobject.internal.GObjectClass]
  @annotation.compileTimeOnly("[field list_faces]: Field is missing <type>")
  private def listFaces__ = ???
  @annotation.compileTimeOnly("[field get_name]: Field is missing <type>")
  private def getName__ = ???
  @annotation.compileTimeOnly("[field is_monospace]: Field is missing <type>")
  private def isMonospace__ = ???
  @annotation.compileTimeOnly("[field is_variable]: Field is missing <type>")
  private def isVariable__ = ???
  @annotation.compileTimeOnly("[field get_face]: Field is missing <type>")
  private def getFace__ = ???
  @annotation.compileTimeOnly(
    "[field _pango_reserved2]: Field is missing <type>"
  )
  private def PangoReserved2__ = ???
end FontFamilyClass

object FontFamilyClass:
  def fromRaw(ptr: Ptr[PangoFontFamilyClass]): FontFamilyClass =
    new FontFamilyClass(ptr)
end FontFamilyClass
