package sn.gnome.gdkpixbuf

import _root_.sn.gnome.gdkpixbuf.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdkpixbuf.internal.GdkPixbufModulePattern

/** The signature prefix for a module.
  *
  * The signature of a module is a set of prefixes. Prefixes are encoded as
  * pairs of ordinary strings, where the second string, called the mask, if not
  * `NULL`, must be of the same length as the first one and may contain ' ',
  * '!', 'x', 'z', and 'n' to indicate bytes that must be matched, not matched,
  * "don't-care"-bytes, zeros and non-zeros, respectively.
  *
  * Each prefix has an associated integer that describes the relevance of the
  * prefix, with 0 meaning a mismatch and 100 a "perfect match".
  *
  * Starting with gdk-pixbuf 2.8, the first byte of the mask may be '*',
  * indicating an unanchored pattern that matches not only at the beginning, but
  * also in the middle. Versions prior to 2.8 will interpret the '*' like an
  * 'x'.
  *
  * The signature of a module is stored as an array of
  * `GdkPixbufModulePatterns`. The array is terminated by a pattern where the
  * `prefix` is `NULL`.
  *
  * ```c
  * GdkPixbufModulePattern *signature[] = {
  *   { "abcdx", " !x z", 100 },
  *   { "bla", NULL,  90 },
  *   { NULL, NULL, 0 }
  * };
  * ```
  *
  * In the example above, the signature matches e.g. "auud\0" with relevance
  * 100, and "blau" with relevance 90.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class PixbufModulePattern private[gnome] (raw: Ptr[GdkPixbufModulePattern]):

  def getUnsafeRawPointer(): Ptr[GdkPixbufModulePattern] = this.raw

  /** the prefix for this pattern
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def prefix: String /* None */ = fromCString((!raw).prefix.asInstanceOf)

  /** the prefix for this pattern
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def prefix_=(value: String /* None */ ): Unit =
    (!raw).prefix_=(summon[Runtime].inZone(toCString(value)))

  /** mask containing bytes which modify how the prefix is matched against test
    * data
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def mask: String /* None */ = fromCString((!raw).mask.asInstanceOf)

  /** mask containing bytes which modify how the prefix is matched against test
    * data
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def mask_=(value: String /* None */ ): Unit =
    (!raw).mask_=(summon[Runtime].inZone(toCString(value)))

  /** relevance of this pattern
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def relevance: Int /* None */ = (!raw).relevance

  /** relevance of this pattern
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def relevance_=(value: Int /* None */ ): Unit = (!raw).relevance_=(value)
end PixbufModulePattern
object PixbufModulePattern:
  def fromRaw(ptr: Ptr[GdkPixbufModulePattern]): PixbufModulePattern =
    new PixbufModulePattern(ptr)
end PixbufModulePattern
