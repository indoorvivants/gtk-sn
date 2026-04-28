package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gtk4.fluent.ShortcutTrigger
import sn.gnome.gtk4.internal.GtkAlternativeTrigger

class AlternativeTrigger(raw: Ptr[GtkAlternativeTrigger])
    extends ShortcutTrigger(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getFirst(): ShortcutTrigger = new ShortcutTrigger(
    gtk_alternative_trigger_get_first(this.raw.asInstanceOf).asInstanceOf
  )

  def getSecond(): ShortcutTrigger = new ShortcutTrigger(
    gtk_alternative_trigger_get_second(this.raw.asInstanceOf).asInstanceOf
  )

end AlternativeTrigger

object AlternativeTrigger:
  def apply(
      first: ShortcutTrigger,
      second: ShortcutTrigger
  ): AlternativeTrigger = new AlternativeTrigger(
    gtk_alternative_trigger_new(
      first.getUnsafeRawPointer().asInstanceOf,
      second.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )
end AlternativeTrigger
