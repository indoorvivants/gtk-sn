package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GTaskClass

class TaskClass private[gnome] (raw: Ptr[GTaskClass]):

  def getUnsafeRawPointer(): Ptr[GTaskClass] = this.raw
end TaskClass

object TaskClass:
  def fromRaw(ptr: Ptr[GTaskClass]): TaskClass = new TaskClass(ptr)
end TaskClass
