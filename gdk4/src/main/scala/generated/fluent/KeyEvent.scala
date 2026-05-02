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

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * An event related to a key-based device.
  */
class KeyEvent(raw: Ptr[GdkKeyEvent]) extends Event(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Extracts the consumed modifiers from a key event.
    */
  def getConsumedModifiers(): GdkModifierType /* None */ =
    gdk_key_event_get_consumed_modifiers(this.raw.asInstanceOf[Ptr[GdkEvent]])

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Extracts the keycode from a key event.
    */
  def getKeycode(): UInt /* None */ = gdk_key_event_get_keycode(
    this.raw.asInstanceOf[Ptr[GdkEvent]]
  ).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Extracts the keyval from a key event.
    */
  def getKeyval(): UInt /* None */ = gdk_key_event_get_keyval(
    this.raw.asInstanceOf[Ptr[GdkEvent]]
  ).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Extracts the layout from a key event.
    */
  def getLayout(): UInt /* None */ = gdk_key_event_get_layout(
    this.raw.asInstanceOf[Ptr[GdkEvent]]
  ).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Extracts the shift level from a key event.
    */
  def getLevel(): UInt /* None */ = gdk_key_event_get_level(
    this.raw.asInstanceOf[Ptr[GdkEvent]]
  ).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Gets a keyval and modifier combination that will match the event.
    *
    * See [method@Gdk.KeyEvent.matches].
    */
  @annotation.compileTimeOnly(
    "Method get_match contains an OUT parameter, which is not supported yet"
  )
  private def getMatch__ = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Extracts whether the key event is for a modifier key.
    */
  def isModifier(): Boolean /* None */ =
    gdk_key_event_is_modifier(this.raw.asInstanceOf[Ptr[GdkEvent]]).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Matches a key event against a keyval and modifiers.
    *
    * This is typically used to trigger keyboard shortcuts such as Ctrl-C.
    *
    * Partial matches are possible where the combination matches if the
    * currently active group is ignored.
    *
    * Note that we ignore Caps Lock for matching.
    */
  def matches(
      keyval: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */,
      modifiers: GdkModifierType /* Some(GdkModifierType) */
  ): GdkKeyMatch /* None */ = gdk_key_event_matches(
    this.raw.asInstanceOf[Ptr[GdkEvent]],
    guint(keyval),
    modifiers
  )

end KeyEvent
