package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.WidgetClass
import sn.gnome.gtk4.internal.GtkMediaControlsClass

class MediaControlsClass private[gnome] (raw: Ptr[GtkMediaControlsClass]):

  def getUnsafeRawPointer(): Ptr[GtkMediaControlsClass] = this.raw

  def parentClass: sn.gnome.gtk4.WidgetClass /* None */ =
    (!raw).parent_class.asInstanceOf[GtkWidgetClass]
end MediaControlsClass

object MediaControlsClass:
  def fromRaw(ptr: Ptr[GtkMediaControlsClass]): MediaControlsClass =
    new MediaControlsClass(ptr)
end MediaControlsClass
