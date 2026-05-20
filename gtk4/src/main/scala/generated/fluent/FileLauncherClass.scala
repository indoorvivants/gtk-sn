package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gobject.ObjectClass
import sn.gnome.gtk4.internal.GtkFileLauncherClass

class FileLauncherClass private[gnome] (raw: Ptr[GtkFileLauncherClass]):

  def getUnsafeRawPointer(): Ptr[GtkFileLauncherClass] = this.raw

  def parentClass: sn.gnome.gobject.ObjectClass /* None */ = (!raw).parent_class
    .asInstanceOf[_root_.sn.gnome.gobject.internal.GObjectClass]
end FileLauncherClass

object FileLauncherClass:
  def fromRaw(ptr: Ptr[GtkFileLauncherClass]): FileLauncherClass =
    new FileLauncherClass(ptr)
end FileLauncherClass
