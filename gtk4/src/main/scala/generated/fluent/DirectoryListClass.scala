package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.ObjectClass
import sn.gnome.gtk4.internal.GtkDirectoryListClass

class DirectoryListClass private[gnome] (raw: Ptr[GtkDirectoryListClass]):

  def getUnsafeRawPointer(): Ptr[GtkDirectoryListClass] = this.raw

  def parentClass: sn.gnome.gobject.ObjectClass /* None */ = (!raw).parent_class
    .asInstanceOf[_root_.sn.gnome.gobject.internal.GObjectClass]
end DirectoryListClass

object DirectoryListClass:
  def fromRaw(ptr: Ptr[GtkDirectoryListClass]): DirectoryListClass =
    new DirectoryListClass(ptr)
end DirectoryListClass
