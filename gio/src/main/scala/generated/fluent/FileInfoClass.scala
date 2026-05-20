package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GFileInfoClass

class FileInfoClass private[gnome] (raw: Ptr[GFileInfoClass]):

  def getUnsafeRawPointer(): Ptr[GFileInfoClass] = this.raw
end FileInfoClass

object FileInfoClass:
  def fromRaw(ptr: Ptr[GFileInfoClass]): FileInfoClass = new FileInfoClass(ptr)
end FileInfoClass
