package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gdk4.fluent.{Event, KeyMatch, ModifierType}
import sn.gnome.gdk4.internal.GdkKeyEvent
import sn.gnome.glib.internal.{gboolean, gint, guint}

/** An event related to a key-based device.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class KeyEvent(raw: Ptr[GdkKeyEvent]) extends Event(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Extracts the consumed modifiers from a key event.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getConsumedModifiers(): ModifierType /* None */ = ModifierType.fromRaw(
    gdk_key_event_get_consumed_modifiers(this.raw.asInstanceOf[Ptr[GdkEvent]])
  )

  /** Extracts the keycode from a key event.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getKeycode(): UInt /* None */ = gdk_key_event_get_keycode(
    this.raw.asInstanceOf[Ptr[GdkEvent]]
  ).value

  /** Extracts the keyval from a key event.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getKeyval(): UInt /* None */ = gdk_key_event_get_keyval(
    this.raw.asInstanceOf[Ptr[GdkEvent]]
  ).value

  /** Extracts the layout from a key event.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getLayout(): UInt /* None */ = gdk_key_event_get_layout(
    this.raw.asInstanceOf[Ptr[GdkEvent]]
  ).value

  /** Extracts the shift level from a key event.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getLevel(): UInt /* None */ = gdk_key_event_get_level(
    this.raw.asInstanceOf[Ptr[GdkEvent]]
  ).value

  /** Gets a keyval and modifier combination that will match the event.
    *
    * See [method@Gdk.KeyEvent.matches].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[get_match]: Method get_match contains an OUT parameter, which is not supported yet"
  )
  private def getMatch__ = ???

  /** Extracts whether the key event is for a modifier key.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isModifier(): Boolean /* None */ =
    gdk_key_event_is_modifier(this.raw.asInstanceOf[Ptr[GdkEvent]]).value.!=(0)

  /** Matches a key event against a keyval and modifiers.
    *
    * This is typically used to trigger keyboard shortcuts such as Ctrl-C.
    *
    * Partial matches are possible where the combination matches if the
    * currently active group is ignored.
    *
    * Note that we ignore Caps Lock for matching.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def matches(
      keyval: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */,
      modifiers: ModifierType /* Some(GdkModifierType) */
  ): KeyMatch /* None */ = KeyMatch.fromRaw(
    gdk_key_event_matches(
      this.raw.asInstanceOf[Ptr[GdkEvent]],
      guint(keyval),
      modifiers.raw
    )
  )

end KeyEvent
