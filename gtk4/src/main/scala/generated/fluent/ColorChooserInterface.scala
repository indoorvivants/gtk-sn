package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.TypeInterface
import sn.gnome.gtk4.internal.GtkColorChooserInterface

class ColorChooserInterface private[gnome] (raw: Ptr[GtkColorChooserInterface]):

  def getUnsafeRawPointer(): Ptr[GtkColorChooserInterface] = this.raw

  def baseInterface: sn.gnome.gobject.TypeInterface /* None */ =
    (!raw).base_interface
      .asInstanceOf[_root_.sn.gnome.gobject.internal.GTypeInterface]
  @annotation.compileTimeOnly("[field get_rgba]: Field is missing <type>")
  private def getRgba__ = ???
  @annotation.compileTimeOnly("[field set_rgba]: Field is missing <type>")
  private def setRgba__ = ???
  @annotation.compileTimeOnly("[field add_palette]: Field is missing <type>")
  private def addPalette__ = ???
  @annotation.compileTimeOnly(
    "[field color_activated]: Field is missing <type>"
  )
  private def colorActivated__ = ???

end ColorChooserInterface

object ColorChooserInterface:
  def fromRaw(ptr: Ptr[GtkColorChooserInterface]): ColorChooserInterface =
    new ColorChooserInterface(ptr)
end ColorChooserInterface
