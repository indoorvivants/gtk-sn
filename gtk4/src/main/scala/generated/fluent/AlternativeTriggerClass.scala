package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.internal.GtkAlternativeTriggerClass

class AlternativeTriggerClass private[gnome] (
    raw: Ptr[GtkAlternativeTriggerClass]
):

  def getUnsafeRawPointer(): Ptr[GtkAlternativeTriggerClass] = this.raw
end AlternativeTriggerClass

object AlternativeTriggerClass:
  def fromRaw(ptr: Ptr[GtkAlternativeTriggerClass]): AlternativeTriggerClass =
    new AlternativeTriggerClass(ptr)
end AlternativeTriggerClass
