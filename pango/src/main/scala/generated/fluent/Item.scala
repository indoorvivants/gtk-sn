package sn.gnome.pango

import _root_.sn.gnome.pango.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.pango.{Analysis, AttrIterator, Item}
import sn.gnome.pango.internal.PangoItem

/** The `PangoItem` structure stores information about a segment of text.
  *
  * You typically obtain `PangoItems` by itemizing a piece of text with
  * [func@itemize].
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class Item private[gnome] (raw: Ptr[PangoItem]):

  def getUnsafeRawPointer(): Ptr[PangoItem] = this.raw

  /** byte offset of the start of this item in text.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def offset: Int /* None */ = (!raw).offset.asInstanceOf[CInt]

  /** byte offset of the start of this item in text.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def offset_=(value: Int /* None */ ): Unit =
    (!raw).offset_=(value.asInstanceOf[CInt])

  /** length of this item in bytes.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def length: Int /* None */ = (!raw).length.asInstanceOf[CInt]

  /** length of this item in bytes.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def length_=(value: Int /* None */ ): Unit =
    (!raw).length_=(value.asInstanceOf[CInt])

  /** number of Unicode characters in the item.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def numChars: Int /* None */ = (!raw).num_chars.asInstanceOf[CInt]

  /** number of Unicode characters in the item.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def numChars_=(value: Int /* None */ ): Unit =
    (!raw).num_chars_=(value.asInstanceOf[CInt])

  /** analysis results for the item.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def analysis: sn.gnome.pango.Analysis /* None */ =
    (!raw).analysis.asInstanceOf[PangoAnalysis]

  /** analysis results for the item.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def analysis_=(value: sn.gnome.pango.Analysis /* None */ ): Unit =
    (!raw).analysis_=(
      value.getUnsafeRawPointer().asInstanceOf.asInstanceOf[PangoAnalysis]
    )

  /** Add attributes to a `PangoItem`.
    *
    * The idea is that you have attributes that don't affect itemization, such
    * as font features, so you filter them out using
    * [method@Pango.AttrList.filter], itemize your text, then reapply the
    * attributes to the resulting items using this function.
    *
    * The @iter should be positioned before the range of the item, and will be
    * advanced past it. This function is meant to be called in a loop over the
    * items resulting from itemization, while passing the iter to each call.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def applyAttrs(
      iter: sn.gnome.pango.AttrIterator /* Some(Ptr[PangoAttrIterator]) */
  ): Unit /* None */ =
    pango_item_apply_attrs(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoItem]],
      iter.getUnsafeRawPointer().asInstanceOf
    )
  end applyAttrs

  /** Copy an existing `PangoItem` structure.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def copy(): sn.gnome.pango.Item /* None */ =
    sn.gnome.pango.Item.fromRaw(
      pango_item_copy(this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoItem]])
    )
  end copy

  /** Free a `PangoItem` and all associated memory.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def free(): Unit /* None */ =
    pango_item_free(this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoItem]])
  end free

  /** Modifies @orig to cover only the text after @split_index, and returns a
    * new item that covers the text before @split_index that used to be in @orig.
    *
    * You can think of @split_index as the length of the returned item.
    * @split_index
    *   may not be 0, and it may not be greater than or equal to the length of @orig
    *   (that is, there must be at least one byte assigned to each item, you
    *   can't create a zero-length item).
    * @split_offset
    *   is the length of the first item in chars, and must be provided because
    *   the text used to generate the item isn't available, so
    *   `pango_item_split()` can't count the char length of the split items
    *   itself.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def split(
      split_index: Int /* Some(CInt) */,
      split_offset: Int /* Some(CInt) */
  ): sn.gnome.pango.Item /* None */ =
    sn.gnome.pango.Item.fromRaw(
      pango_item_split(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoItem]],
        split_index,
        split_offset
      )
    )
  end split

end Item

object Item:
  def fromRaw(ptr: Ptr[PangoItem]): Item = new Item(ptr)
end Item
