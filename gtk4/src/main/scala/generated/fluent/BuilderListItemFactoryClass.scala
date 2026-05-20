package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.internal.GtkBuilderListItemFactoryClass

class BuilderListItemFactoryClass private[gnome] (
    raw: Ptr[GtkBuilderListItemFactoryClass]
):

  def getUnsafeRawPointer(): Ptr[GtkBuilderListItemFactoryClass] = this.raw
end BuilderListItemFactoryClass

object BuilderListItemFactoryClass:
  def fromRaw(
      ptr: Ptr[GtkBuilderListItemFactoryClass]
  ): BuilderListItemFactoryClass = new BuilderListItemFactoryClass(ptr)
end BuilderListItemFactoryClass
