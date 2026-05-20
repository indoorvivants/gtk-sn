package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.internal.GtkNeverTriggerClass

class NeverTriggerClass private[gnome] (raw: Ptr[GtkNeverTriggerClass]):

  def getUnsafeRawPointer(): Ptr[GtkNeverTriggerClass] = this.raw
end NeverTriggerClass

object NeverTriggerClass:
  def fromRaw(ptr: Ptr[GtkNeverTriggerClass]): NeverTriggerClass =
    new NeverTriggerClass(ptr)
end NeverTriggerClass
