package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gdk4.fluent.Event
import sn.gnome.gdk4.internal.GdkKeyEvent
import sn.gnome.gdk4.internal.GdkKeyMatch
import sn.gnome.gdk4.internal.GdkModifierType
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.guint

class KeyEvent(raw: Ptr[GdkKeyEvent]) extends Event(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getConsumedModifiers(): GdkModifierType =
    gdk_key_event_get_consumed_modifiers(this.raw.asInstanceOf)

  def getKeycode(): UInt = gdk_key_event_get_keycode(
    this.raw.asInstanceOf
  ).value

  def getKeyval(): UInt = gdk_key_event_get_keyval(this.raw.asInstanceOf).value

  def getLayout(): UInt = gdk_key_event_get_layout(this.raw.asInstanceOf).value

  def getLevel(): UInt = gdk_key_event_get_level(this.raw.asInstanceOf).value

  // Method get_match contains an OUT parameter, which is not supported yet

  def isModifier(): Boolean =
    gdk_key_event_is_modifier(this.raw.asInstanceOf).value.!=(0)

  def matches(keyval: UInt, modifiers: GdkModifierType): GdkKeyMatch =
    gdk_key_event_matches(this.raw.asInstanceOf, guint(keyval), modifiers)

end KeyEvent
