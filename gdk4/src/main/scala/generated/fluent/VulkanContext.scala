package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.fluent.DrawContext
import sn.gnome.gdk4.internal.GdkVulkanContext
import sn.gnome.gio.fluent.Initable

class VulkanContext(raw: Ptr[GdkVulkanContext])
    extends DrawContext(raw.asInstanceOf),
      Initable:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

end VulkanContext
