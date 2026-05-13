package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gdk4.ModifierType
import sn.gnome.glib.internal.guint
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.ShortcutTrigger
import sn.gnome.gtk4.internal.GtkKeyvalTrigger

/** A `GtkShortcutTrigger` that triggers when a specific keyval and modifiers
  * are pressed.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class KeyvalTrigger private[gnome] (raw: Ptr[GtkKeyvalTrigger])
    extends ShortcutTrigger(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets the keyval that must be pressed to succeed triggering @self.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getKeyval(): UInt /* None */ =
    gtk_keyval_trigger_get_keyval(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkKeyvalTrigger]]
    ).value
  end getKeyval

  /** Gets the modifiers that must be present to succeed triggering @self.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getModifiers(): ModifierType /* None */ =
    ModifierType.fromRaw(
      gtk_keyval_trigger_get_modifiers(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkKeyvalTrigger]]
      )
    )
  end getModifiers

end KeyvalTrigger

object KeyvalTrigger:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkKeyvalTrigger])(using Runtime) =
    summon[Runtime].getOrCreate[KeyvalTrigger](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new KeyvalTrigger(ptr)
    )

  /** Creates a `GtkShortcutTrigger` that will trigger whenever the key with the
    * given @keyval and @modifiers is pressed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      keyval: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */,
      modifiers: ModifierType /* Some(_root_.sn.gnome.gdk4.internal.GdkModifierType) */
  )(using Runtime): KeyvalTrigger =
    val raw: Ptr[Byte] =
      gtk_keyval_trigger_new(guint(keyval), modifiers.raw).asInstanceOf
    summon[Runtime].getOrCreate[KeyvalTrigger](
      raw,
      r => KeyvalTrigger.applyUnsafe(r.asInstanceOf)
    )
  end apply
end KeyvalTrigger
