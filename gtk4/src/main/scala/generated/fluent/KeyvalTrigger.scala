package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gdk4.internal.GdkModifierType
import sn.gnome.glib.internal.guint
import sn.gnome.gtk4.fluent.ShortcutTrigger
import sn.gnome.gtk4.internal.GtkKeyvalTrigger

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * A `GtkShortcutTrigger` that triggers when a specific keyval and modifiers
  * are pressed.
  */
class KeyvalTrigger(raw: Ptr[GtkKeyvalTrigger])
    extends ShortcutTrigger(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the keyval that must be pressed to succeed triggering @self.
    */
  def getKeyval(): UInt /* None */ = gtk_keyval_trigger_get_keyval(
    this.raw.asInstanceOf
  ).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets the modifiers that must be present to succeed triggering @self.
    */
  def getModifiers(): GdkModifierType /* None */ =
    gtk_keyval_trigger_get_modifiers(this.raw.asInstanceOf)

end KeyvalTrigger

object KeyvalTrigger:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a `GtkShortcutTrigger` that will trigger whenever the key with the
    * given @keyval and @modifiers is pressed.
    */
  def apply(
      keyval: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */,
      modifiers: GdkModifierType /* Some(_root_.sn.gnome.gdk4.internal.GdkModifierType) */
  ): KeyvalTrigger = new KeyvalTrigger(
    gtk_keyval_trigger_new(guint(keyval), modifiers).asInstanceOf
  )
end KeyvalTrigger
