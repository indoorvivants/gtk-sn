package sn.gnome.pango

import _root_.sn.gnome.pango.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.ObjectClass
import sn.gnome.pango.internal.PangoFontFaceClass

class FontFaceClass private[gnome] (raw: Ptr[PangoFontFaceClass]):

  def getUnsafeRawPointer(): Ptr[PangoFontFaceClass] = this.raw

  def parentClass: sn.gnome.gobject.ObjectClass /* None */ = (!raw).parent_class
    .asInstanceOf[_root_.sn.gnome.gobject.internal.GObjectClass]
  @annotation.compileTimeOnly("[field get_face_name]: Field is missing <type>")
  private def getFaceName__ = ???
  @annotation.compileTimeOnly("[field describe]: Field is missing <type>")
  private def describe__ = ???
  @annotation.compileTimeOnly("[field list_sizes]: Field is missing <type>")
  private def listSizes__ = ???
  @annotation.compileTimeOnly("[field is_synthesized]: Field is missing <type>")
  private def isSynthesized__ = ???
  @annotation.compileTimeOnly("[field get_family]: Field is missing <type>")
  private def getFamily__ = ???
  @annotation.compileTimeOnly(
    "[field _pango_reserved3]: Field is missing <type>"
  )
  private def PangoReserved3__ = ???
  @annotation.compileTimeOnly(
    "[field _pango_reserved4]: Field is missing <type>"
  )
  private def PangoReserved4__ = ???
end FontFaceClass

object FontFaceClass:
  def fromRaw(ptr: Ptr[PangoFontFaceClass]): FontFaceClass = new FontFaceClass(
    ptr
  )
end FontFaceClass
