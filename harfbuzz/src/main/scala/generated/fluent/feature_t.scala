package sn.gnome.harfbuzz

import _root_.sn.gnome.harfbuzz.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.harfbuzz.internal.hb_feature_t

/** The #hb_feature_t is the structure that holds information about requested
  * feature application. The feature will be applied with the given value to all
  * glyphs which are in clusters between @start (inclusive) and @end
  * (exclusive). Setting start to #HB_FEATURE_GLOBAL_START and end to
  * #HB_FEATURE_GLOBAL_END specifies that the feature always applies to the
  * entire buffer.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class feature_t private[gnome] (raw: Ptr[hb_feature_t]):

  def getUnsafeRawPointer(): Ptr[hb_feature_t] = this.raw

  /** The #hb_tag_t tag of the feature
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[field tag]: Cannot render type Type(List(),ListMap(@name -> DataRecord(tag_t), @type -> DataRecord(hb_tag_t)))"
  )
  private def tag__ = ???

  /** The value of the feature. 0 disables the feature, non-zero (usually 1)
    * enables the feature. For features implemented as lookup type 3 (like
    * 'salt') the @value is a one based index into the alternates.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[field value]: Cannot render type Type(List(),ListMap(@name -> DataRecord(guint32), @type -> DataRecord(uint32_t)))"
  )
  private def value__ = ???

  /** the cluster to start applying this feature setting (inclusive).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[field start]: Cannot render type Type(List(),ListMap(@name -> DataRecord(guint), @type -> DataRecord(unsigned int)))"
  )
  private def start__ = ???

  /** the cluster to end applying this feature setting (exclusive).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[field end]: Cannot render type Type(List(),ListMap(@name -> DataRecord(guint), @type -> DataRecord(unsigned int)))"
  )
  private def end__ = ???

  /** Converts a #hb_feature_t into a `NULL`-terminated string in the format
    * understood by hb_feature_from_string(). The client in responsible for
    * allocating big enough size for @buf, 128 bytes is more than enough.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method _string]: Method _string contains an OUT parameter, which is not supported yet"
  )
  private def String__ = ???

end feature_t

object feature_t:
  def fromRaw(ptr: Ptr[hb_feature_t]): feature_t = new feature_t(ptr)
end feature_t
