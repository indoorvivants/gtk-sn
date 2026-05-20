package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.internal.GtkKeyvalTriggerClass

class KeyvalTriggerClass private[gnome] (raw: Ptr[GtkKeyvalTriggerClass]):

  def getUnsafeRawPointer(): Ptr[GtkKeyvalTriggerClass] = this.raw
end KeyvalTriggerClass

object KeyvalTriggerClass:
  def fromRaw(ptr: Ptr[GtkKeyvalTriggerClass]): KeyvalTriggerClass =
    new KeyvalTriggerClass(ptr)
end KeyvalTriggerClass
