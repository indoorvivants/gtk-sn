package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.TypeInterface
import sn.gnome.gtk4.internal.GtkFontChooserIface

class FontChooserIface private[gnome] (raw: Ptr[GtkFontChooserIface]):

  def getUnsafeRawPointer(): Ptr[GtkFontChooserIface] = this.raw

  def baseIface: sn.gnome.gobject.TypeInterface /* None */ = (!raw).base_iface
    .asInstanceOf[_root_.sn.gnome.gobject.internal.GTypeInterface]
  @annotation.compileTimeOnly(
    "[field get_font_family]: Field is missing <type>"
  )
  private def getFontFamily__ = ???
  @annotation.compileTimeOnly("[field get_font_face]: Field is missing <type>")
  private def getFontFace__ = ???
  @annotation.compileTimeOnly("[field get_font_size]: Field is missing <type>")
  private def getFontSize__ = ???
  @annotation.compileTimeOnly(
    "[field set_filter_func]: Field is missing <type>"
  )
  private def setFilterFunc__ = ???
  @annotation.compileTimeOnly("[field font_activated]: Field is missing <type>")
  private def fontActivated__ = ???
  @annotation.compileTimeOnly("[field set_font_map]: Field is missing <type>")
  private def setFontMap__ = ???
  @annotation.compileTimeOnly("[field get_font_map]: Field is missing <type>")
  private def getFontMap__ = ???

end FontChooserIface

object FontChooserIface:
  def fromRaw(ptr: Ptr[GtkFontChooserIface]): FontChooserIface =
    new FontChooserIface(ptr)
end FontChooserIface
