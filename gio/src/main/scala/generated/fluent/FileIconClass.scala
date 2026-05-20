package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GFileIconClass

class FileIconClass private[gnome] (raw: Ptr[GFileIconClass]):

  def getUnsafeRawPointer(): Ptr[GFileIconClass] = this.raw
end FileIconClass

object FileIconClass:
  def fromRaw(ptr: Ptr[GFileIconClass]): FileIconClass = new FileIconClass(ptr)
end FileIconClass
