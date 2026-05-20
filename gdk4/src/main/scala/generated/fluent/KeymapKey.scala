package sn.gnome.gdk4

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gdk4.internal.GdkKeymapKey
import sn.gnome.glib.internal.guint

/** A `GdkKeymapKey` is a hardware key that can be mapped to a keyval.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class KeymapKey private[gnome] (raw: Ptr[GdkKeymapKey]):

  def getUnsafeRawPointer(): Ptr[GdkKeymapKey] = this.raw

  /** the hardware keycode. This is an identifying number for a physical key.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def keycode: UInt /* None */ =
    (!raw).keycode.asInstanceOf[_root_.sn.gnome.glib.internal.guint]

  /** the hardware keycode. This is an identifying number for a physical key.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def keycode_=(value: UInt /* None */ ): Unit = (!raw).keycode_=(
    guint(value).asInstanceOf[_root_.sn.gnome.glib.internal.guint]
  )

  /** indicates movement in a horizontal direction. Usually groups are used for
    * two different languages. In group 0, a key might have two English
    * characters, and in group 1 it might have two Hebrew characters. The Hebrew
    * characters will be printed on the key next to the English characters.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def group: Int /* None */ = (!raw).group.asInstanceOf[CInt]

  /** indicates movement in a horizontal direction. Usually groups are used for
    * two different languages. In group 0, a key might have two English
    * characters, and in group 1 it might have two Hebrew characters. The Hebrew
    * characters will be printed on the key next to the English characters.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def group_=(value: Int /* None */ ): Unit =
    (!raw).group_=(value.asInstanceOf[CInt])

  /** indicates which symbol on the key will be used, in a vertical direction.
    * So on a standard US keyboard, the key with the number “1” on it also has
    * the exclamation point ("!") character on it. The level indicates whether
    * to use the “1” or the “!” symbol. The letter keys are considered to have a
    * lowercase letter at level 0, and an uppercase letter at level 1, though
    * only the uppercase letter is printed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def level: Int /* None */ = (!raw).level.asInstanceOf[CInt]

  /** indicates which symbol on the key will be used, in a vertical direction.
    * So on a standard US keyboard, the key with the number “1” on it also has
    * the exclamation point ("!") character on it. The level indicates whether
    * to use the “1” or the “!” symbol. The letter keys are considered to have a
    * lowercase letter at level 0, and an uppercase letter at level 1, though
    * only the uppercase letter is printed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def level_=(value: Int /* None */ ): Unit =
    (!raw).level_=(value.asInstanceOf[CInt])
end KeymapKey

object KeymapKey:
  def fromRaw(ptr: Ptr[GdkKeymapKey]): KeymapKey = new KeymapKey(ptr)
end KeymapKey
