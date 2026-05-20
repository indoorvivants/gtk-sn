package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.ObjectClass
import sn.gnome.gtk4.internal.GtkBuilderCScopeClass

class BuilderCScopeClass private[gnome] (raw: Ptr[GtkBuilderCScopeClass]):

  def getUnsafeRawPointer(): Ptr[GtkBuilderCScopeClass] = this.raw

  def parentClass: sn.gnome.gobject.ObjectClass /* None */ = (!raw).parent_class
    .asInstanceOf[_root_.sn.gnome.gobject.internal.GObjectClass]
end BuilderCScopeClass

object BuilderCScopeClass:
  def fromRaw(ptr: Ptr[GtkBuilderCScopeClass]): BuilderCScopeClass =
    new BuilderCScopeClass(ptr)
end BuilderCScopeClass
