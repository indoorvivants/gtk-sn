package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.ObjectClass
import sn.gnome.gtk4.internal.GtkBookmarkListClass

class BookmarkListClass private[gnome] (raw: Ptr[GtkBookmarkListClass]):

  def getUnsafeRawPointer(): Ptr[GtkBookmarkListClass] = this.raw

  def parentClass: sn.gnome.gobject.ObjectClass /* None */ = (!raw).parent_class
    .asInstanceOf[_root_.sn.gnome.gobject.internal.GObjectClass]
end BookmarkListClass

object BookmarkListClass:
  def fromRaw(ptr: Ptr[GtkBookmarkListClass]): BookmarkListClass =
    new BookmarkListClass(ptr)
end BookmarkListClass
