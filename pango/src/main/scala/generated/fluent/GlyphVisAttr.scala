package sn.gnome.pango

import _root_.sn.gnome.pango.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.guint
import sn.gnome.pango.internal.PangoGlyphVisAttr

/** A `PangoGlyphVisAttr` structure communicates information between the shaping
  * and rendering phases.
  *
  * Currently, it contains cluster start and color information. More attributes
  * may be added in the future.
  *
  * Clusters are stored in visual order, within the cluster, glyphs are always
  * ordered in logical order, since visual order is meaningless; that is, in
  * Arabic text, accent glyphs follow the glyphs for the base character.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class GlyphVisAttr private[gnome] (raw: Ptr[PangoGlyphVisAttr]):

  def getUnsafeRawPointer(): Ptr[PangoGlyphVisAttr] = this.raw

  /** set for the first logical glyph in each cluster.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isClusterStart: UInt /* None */ =
    (!raw).is_cluster_start.asInstanceOf[_root_.sn.gnome.glib.internal.guint]

  /** set for the first logical glyph in each cluster.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isClusterStart_=(value: UInt /* None */ ): Unit =
    (!raw).is_cluster_start_=(
      guint(value).asInstanceOf[_root_.sn.gnome.glib.internal.guint]
    )
end GlyphVisAttr

object GlyphVisAttr:
  def fromRaw(ptr: Ptr[PangoGlyphVisAttr]): GlyphVisAttr = new GlyphVisAttr(ptr)
end GlyphVisAttr
