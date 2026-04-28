package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gdk4.internal.GdkModifierType
import sn.gnome.glib.internal.guint
import sn.gnome.gtk4.fluent.ShortcutTrigger
import sn.gnome.gtk4.internal.GtkKeyvalTrigger

class KeyvalTrigger(raw: Ptr[GtkKeyvalTrigger])
    extends ShortcutTrigger(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getKeyval(): UInt = gtk_keyval_trigger_get_keyval(
    this.raw.asInstanceOf
  ).value

  def getModifiers(): GdkModifierType = gtk_keyval_trigger_get_modifiers(
    this.raw.asInstanceOf
  )

end KeyvalTrigger

object KeyvalTrigger:
  def apply(keyval: UInt, modifiers: GdkModifierType): KeyvalTrigger =
    new KeyvalTrigger(
      gtk_keyval_trigger_new(guint(keyval), modifiers).asInstanceOf
    )
end KeyvalTrigger
