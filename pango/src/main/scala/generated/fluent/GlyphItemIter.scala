package sn.gnome.pango

import _root_.sn.gnome.pango.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.{gboolean, gchar, gint}
import sn.gnome.pango.{GlyphItem, GlyphItemIter}
import sn.gnome.pango.internal.PangoGlyphItemIter

/**  A `PangoGlyphItemIter` is an iterator over the clusters in a
  *  `PangoGlyphItem`.
  *
  *  The *forward direction* of the iterator is the logical direction of text.
  *  That is, with increasing @start_index and @start_char values. If @glyph_item
  *  is right-to-left (that is, if `glyph_item->item->analysis.level` is odd),
  *  then @start_glyph decreases as the iterator moves forward.  Moreover,
  *  in right-to-left cases, @start_glyph is greater than @end_glyph.
  *
  *  An iterator should be initialized using either
  *  pango_glyph_item_iter_init_start() or
  *  pango_glyph_item_iter_init_end(), for forward and backward iteration
  *  respectively, and walked over using any desired mixture of
  *  pango_glyph_item_iter_next_cluster() and
  *  pango_glyph_item_iter_prev_cluster().
  *
  *  A common idiom for doing a forward iteration over the clusters is:
  *
  *  ```
  *  PangoGlyphItemIter cluster_iter;
  *  gboolean have_cluster;
  *
  *  for (have_cluster = pango_glyph_item_iter_init_start (&cluster_iter,
  *                                                        glyph_item, text);
  *       have_cluster;
  *       have_cluster = pango_glyph_item_iter_next_cluster (&cluster_iter))
  *  {
  *    ...
  *  }
  *  ```
  *
  *  Note that @text is the start of the text for layout, which is then
  *  indexed by `glyph_item->item->offset` to get to the text of @glyph_item.
  *  The @start_index and @end_index values can directly index into @text. The
  *  @start_glyph, @end_glyph, @start_char, and @end_char values however are
  *  zero-based for the @glyph_item.  For each cluster, the item pointed at by
  *  the start variables is included in the cluster while the one pointed at by
  *  end variables is not.
  *
  *  None of the members of a `PangoGlyphItemIter` should be modified manually.
  *
  *  NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT BE APPLICABLE TO SCALA
  */
class GlyphItemIter private[gnome] (raw: Ptr[PangoGlyphItemIter]):

  def getUnsafeRawPointer(): Ptr[PangoGlyphItemIter] = this.raw

  def glyphItem: sn.gnome.pango.GlyphItem /* None */ =
    (!raw).glyph_item.asInstanceOf[Ptr[PangoGlyphItem]]
  def glyphItem_=(value: sn.gnome.pango.GlyphItem /* None */ ): Unit =
    (!raw).glyph_item_=(
      value.getUnsafeRawPointer().asInstanceOf.asInstanceOf[Ptr[PangoGlyphItem]]
    )

  def text: scala.Predef.String /* None */ =
    (!raw).text.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]
  def text_=(value: scala.Predef.String /* None */ )(using Zone): Unit =
    (!raw).text_=(
      toCString(value)
        .asInstanceOf[Ptr[gchar]]
        .asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gchar]]
    )

  def startGlyph: Int /* None */ = (!raw).start_glyph.asInstanceOf[CInt]
  def startGlyph_=(value: Int /* None */ ): Unit =
    (!raw).start_glyph_=(value.asInstanceOf[CInt])

  def startIndex: Int /* None */ = (!raw).start_index.asInstanceOf[CInt]
  def startIndex_=(value: Int /* None */ ): Unit =
    (!raw).start_index_=(value.asInstanceOf[CInt])

  def startChar: Int /* None */ = (!raw).start_char.asInstanceOf[CInt]
  def startChar_=(value: Int /* None */ ): Unit =
    (!raw).start_char_=(value.asInstanceOf[CInt])

  def endGlyph: Int /* None */ = (!raw).end_glyph.asInstanceOf[CInt]
  def endGlyph_=(value: Int /* None */ ): Unit =
    (!raw).end_glyph_=(value.asInstanceOf[CInt])

  def endIndex: Int /* None */ = (!raw).end_index.asInstanceOf[CInt]
  def endIndex_=(value: Int /* None */ ): Unit =
    (!raw).end_index_=(value.asInstanceOf[CInt])

  def endChar: Int /* None */ = (!raw).end_char.asInstanceOf[CInt]
  def endChar_=(value: Int /* None */ ): Unit =
    (!raw).end_char_=(value.asInstanceOf[CInt])

  /** Make a shallow copy of an existing `PangoGlyphItemIter` structure.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def copy(): sn.gnome.pango.GlyphItemIter /* None */ =
    sn.gnome.pango.GlyphItemIter.fromRaw(
      pango_glyph_item_iter_copy(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoGlyphItemIter]]
      )
    )
  end copy

  /** Frees a `PangoGlyphItem`Iter.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def free(): Unit /* None */ =
    pango_glyph_item_iter_free(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoGlyphItemIter]]
    )
  end free

  /** Initializes a `PangoGlyphItemIter` structure to point to the last cluster
    * in a glyph item.
    *
    * See `PangoGlyphItemIter` for details of cluster orders.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def initEnd(
      glyph_item: sn.gnome.pango.GlyphItem /* Some(Ptr[PangoGlyphItem]) */,
      text: scala.Predef.String /* Some(CString) */
  )(using Zone): Boolean /* None */ =
    pango_glyph_item_iter_init_end(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoGlyphItemIter]],
      glyph_item.getUnsafeRawPointer().asInstanceOf,
      toCString(text)
    ).value.!=(0)
  end initEnd

  /** Initializes a `PangoGlyphItemIter` structure to point to the first cluster
    * in a glyph item.
    *
    * See `PangoGlyphItemIter` for details of cluster orders.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def initStart(
      glyph_item: sn.gnome.pango.GlyphItem /* Some(Ptr[PangoGlyphItem]) */,
      text: scala.Predef.String /* Some(CString) */
  )(using Zone): Boolean /* None */ =
    pango_glyph_item_iter_init_start(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoGlyphItemIter]],
      glyph_item.getUnsafeRawPointer().asInstanceOf,
      toCString(text)
    ).value.!=(0)
  end initStart

  /** Advances the iterator to the next cluster in the glyph item.
    *
    * See `PangoGlyphItemIter` for details of cluster orders.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def nextCluster(): Boolean /* None */ =
    pango_glyph_item_iter_next_cluster(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoGlyphItemIter]]
    ).value.!=(0)
  end nextCluster

  /** Moves the iterator to the preceding cluster in the glyph item. See
    * `PangoGlyphItemIter` for details of cluster orders.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def prevCluster(): Boolean /* None */ =
    pango_glyph_item_iter_prev_cluster(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoGlyphItemIter]]
    ).value.!=(0)
  end prevCluster

end GlyphItemIter

object GlyphItemIter:
  def fromRaw(ptr: Ptr[PangoGlyphItemIter]): GlyphItemIter = new GlyphItemIter(
    ptr
  )
end GlyphItemIter
