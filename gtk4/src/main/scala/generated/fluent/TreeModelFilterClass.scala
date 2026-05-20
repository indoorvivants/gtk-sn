package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.ObjectClass
import sn.gnome.gtk4.internal.GtkTreeModelFilterClass

class TreeModelFilterClass private[gnome] (raw: Ptr[GtkTreeModelFilterClass]):

  def getUnsafeRawPointer(): Ptr[GtkTreeModelFilterClass] = this.raw

  def parentClass: sn.gnome.gobject.ObjectClass /* None */ = (!raw).parent_class
    .asInstanceOf[_root_.sn.gnome.gobject.internal.GObjectClass]
  @annotation.compileTimeOnly("[field visible]: Field is missing <type>")
  private def visible__ = ???
  @annotation.compileTimeOnly("[field modify]: Field is missing <type>")
  private def modify__ = ???

end TreeModelFilterClass

object TreeModelFilterClass:
  def fromRaw(ptr: Ptr[GtkTreeModelFilterClass]): TreeModelFilterClass =
    new TreeModelFilterClass(ptr)
end TreeModelFilterClass
