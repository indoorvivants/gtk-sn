package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.internal.GtkBuilderClass

class BuilderClass private[gnome] (raw: Ptr[GtkBuilderClass]):

  def getUnsafeRawPointer(): Ptr[GtkBuilderClass] = this.raw
end BuilderClass

object BuilderClass:
  def fromRaw(ptr: Ptr[GtkBuilderClass]): BuilderClass = new BuilderClass(ptr)
end BuilderClass
