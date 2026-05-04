package sn.gnome.harfbuzz.fluent

import _root_.sn.gnome.harfbuzz.internal.hb_buffer_cluster_level_t

/** Data type for holding HarfBuzz's clustering behavior options. The cluster
  * level dictates one aspect of how HarfBuzz will treat non-base characters
  * during shaping.
  *
  * In @HB_BUFFER_CLUSTER_LEVEL_MONOTONE_GRAPHEMES, non-base characters are
  * merged into the cluster of the base character that precedes them.
  *
  * In @HB_BUFFER_CLUSTER_LEVEL_MONOTONE_CHARACTERS, non-base characters are
  * initially assigned their own cluster values, which are not merged into
  * preceding base clusters. This allows HarfBuzz to perform additional
  * operations like reorder sequences of adjacent marks.
  *
  * @HB_BUFFER_CLUSTER_LEVEL_MONOTONE_GRAPHEMES
  *   is the default, because it maintains backward compatibility with older
  *   versions of HarfBuzz. New client programs that do not need to maintain
  *   such backward compatibility are recommended to use
  * @HB_BUFFER_CLUSTER_LEVEL_MONOTONE_CHARACTERS
  *   instead of the default.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum Buffer_cluster_level_t(val raw: hb_buffer_cluster_level_t):
  /** Return cluster values grouped by graphemes into monotone order.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case MONOTONE_GRAPHEMES
      extends Buffer_cluster_level_t(
        hb_buffer_cluster_level_t.HB_BUFFER_CLUSTER_LEVEL_MONOTONE_GRAPHEMES
      )

  /** Return cluster values grouped into monotone order.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case MONOTONE_CHARACTERS
      extends Buffer_cluster_level_t(
        hb_buffer_cluster_level_t.HB_BUFFER_CLUSTER_LEVEL_MONOTONE_CHARACTERS
      )

  /** Don't group cluster values.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CHARACTERS
      extends Buffer_cluster_level_t(
        hb_buffer_cluster_level_t.HB_BUFFER_CLUSTER_LEVEL_CHARACTERS
      )

  /** Default cluster level, equal to @HB_BUFFER_CLUSTER_LEVEL_MONOTONE_GRAPHEMES.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case DEFAULT
      extends Buffer_cluster_level_t(
        hb_buffer_cluster_level_t.HB_BUFFER_CLUSTER_LEVEL_DEFAULT
      )
end Buffer_cluster_level_t

object Buffer_cluster_level_t:
  def fromRaw(raw: hb_buffer_cluster_level_t): Buffer_cluster_level_t =
    raw match
      case hb_buffer_cluster_level_t.HB_BUFFER_CLUSTER_LEVEL_MONOTONE_GRAPHEMES =>
        Buffer_cluster_level_t.MONOTONE_GRAPHEMES
      case hb_buffer_cluster_level_t.HB_BUFFER_CLUSTER_LEVEL_MONOTONE_CHARACTERS =>
        Buffer_cluster_level_t.MONOTONE_CHARACTERS
      case hb_buffer_cluster_level_t.HB_BUFFER_CLUSTER_LEVEL_CHARACTERS =>
        Buffer_cluster_level_t.CHARACTERS
      case hb_buffer_cluster_level_t.HB_BUFFER_CLUSTER_LEVEL_DEFAULT =>
        Buffer_cluster_level_t.DEFAULT
  end fromRaw
end Buffer_cluster_level_t
