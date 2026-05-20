package sn.gnome.pango

import _root_.sn.gnome.pango.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.SList
import sn.gnome.pango.{AttrList, GlyphItem, GlyphString, Item}
import sn.gnome.pango.internal.PangoGlyphItem

/** A `PangoGlyphItem` is a pair of a `PangoItem` and the glyphs resulting from
  * shaping the items text.
  *
  * As an example of the usage of `PangoGlyphItem`, the results of shaping text
  * with `PangoLayout` is a list of `PangoLayoutLine`, each of which contains a
  * list of `PangoGlyphItem`.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class GlyphItem private[gnome] (raw: Ptr[PangoGlyphItem]):

  def getUnsafeRawPointer(): Ptr[PangoGlyphItem] = this.raw

  /** corresponding `PangoItem`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def item: sn.gnome.pango.Item /* None */ =
    (!raw).item.asInstanceOf[Ptr[PangoItem]]

  /** corresponding `PangoItem`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def item_=(value: sn.gnome.pango.Item /* None */ ): Unit = (!raw).item_=(
    value.getUnsafeRawPointer().asInstanceOf.asInstanceOf[Ptr[PangoItem]]
  )

  /** corresponding `PangoGlyphString`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def glyphs: sn.gnome.pango.GlyphString /* None */ =
    (!raw).glyphs.asInstanceOf[Ptr[PangoGlyphString]]

  /** corresponding `PangoGlyphString`
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def glyphs_=(value: sn.gnome.pango.GlyphString /* None */ ): Unit =
    (!raw).glyphs_=(
      value
        .getUnsafeRawPointer()
        .asInstanceOf
        .asInstanceOf[Ptr[PangoGlyphString]]
    )

  /** shift of the baseline, relative to the baseline of the containing line.
    * Positive values shift upwards
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def yOffset: Int /* None */ = (!raw).y_offset.asInstanceOf[CInt]

  /** shift of the baseline, relative to the baseline of the containing line.
    * Positive values shift upwards
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def yOffset_=(value: Int /* None */ ): Unit =
    (!raw).y_offset_=(value.asInstanceOf[CInt])

  /** horizontal displacement to apply before the glyph item. Positive values
    * shift right
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def startXOffset: Int /* None */ = (!raw).start_x_offset.asInstanceOf[CInt]

  /** horizontal displacement to apply before the glyph item. Positive values
    * shift right
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def startXOffset_=(value: Int /* None */ ): Unit =
    (!raw).start_x_offset_=(value.asInstanceOf[CInt])

  /** horizontal displacement to apply after th glyph item. Positive values
    * shift right
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def endXOffset: Int /* None */ = (!raw).end_x_offset.asInstanceOf[CInt]

  /** horizontal displacement to apply after th glyph item. Positive values
    * shift right
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def endXOffset_=(value: Int /* None */ ): Unit =
    (!raw).end_x_offset_=(value.asInstanceOf[CInt])

  /** Splits a shaped item (`PangoGlyphItem`) into multiple items based on an
    * attribute list.
    *
    * The idea is that if you have attributes that don't affect shaping, such as
    * color or underline, to avoid affecting shaping, you filter them out
    * ([method@Pango.AttrList.filter]), apply the shaping process and then
    * reapply them to the result using this function.
    *
    * All attributes that start or end inside a cluster are applied to that
    * cluster; for instance, if half of a cluster is underlined and the
    * other-half strikethrough, then the cluster will end up with both underline
    * and strikethrough attributes. In these cases, it may happen that @item->extra_attrs
    * for some of the result items can have multiple attributes of the same
    * type.
    *
    * This function takes ownership of @glyph_item; it will be reused as one of
    * the elements in the list.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def applyAttrs(
      text: scala.Predef.String /* Some(CString) */,
      list: sn.gnome.pango.AttrList /* Some(Ptr[PangoAttrList]) */
  )(using Zone): sn.gnome.glib.SList /* None */ =
    sn.gnome.glib.SList.fromRaw(
      pango_glyph_item_apply_attrs(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoGlyphItem]],
        toCString(text),
        list.getUnsafeRawPointer().asInstanceOf
      )
    )
  end applyAttrs

  /** Make a deep copy of an existing `PangoGlyphItem` structure.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def copy(): sn.gnome.pango.GlyphItem /* None */ =
    sn.gnome.pango.GlyphItem.fromRaw(
      pango_glyph_item_copy(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoGlyphItem]]
      )
    )
  end copy

  /** Frees a `PangoGlyphItem` and resources to which it points.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def free(): Unit /* None */ =
    pango_glyph_item_free(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoGlyphItem]]
    )
  end free

  /** Given a `PangoGlyphItem` and the corresponding text, determine the width
    * corresponding to each character.
    *
    * When multiple characters compose a single cluster, the width of the entire
    * cluster is divided equally among the characters.
    *
    * See also [method@Pango.GlyphString.get_logical_widths].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_logical_widths/<method parameters>/logical_widths]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(gint), @type -> DataRecord(int)))),ListMap(@zero-terminated -> DataRecord(0), @type -> DataRecord(int*)))"
  )
  private def getLogicalWidths__ = ???

  /** Adds spacing between the graphemes of @glyph_item to give the effect of
    * typographic letter spacing.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method letter_space/<method parameters>/log_attrs]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(LogAttr), @type -> DataRecord(PangoLogAttr)))),ListMap(@zero-terminated -> DataRecord(0), @type -> DataRecord(PangoLogAttr*)))"
  )
  private def letterSpace__ = ???

  /** Modifies @orig to cover only the text after @split_index, and returns a
    * new item that covers the text before @split_index that used to be in @orig.
    *
    * You can think of @split_index as the length of the returned item.
    * @split_index
    *   may not be 0, and it may not be greater than or equal to the length of @orig
    *   (that is, there must be at least one byte assigned to each item, you
    *   can't create a zero-length item).
    *
    * This function is similar in function to pango_item_split() (and uses it
    * internally.)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def split(
      text: scala.Predef.String /* Some(CString) */,
      split_index: Int /* Some(CInt) */
  )(using Zone): sn.gnome.pango.GlyphItem /* None */ =
    sn.gnome.pango.GlyphItem.fromRaw(
      pango_glyph_item_split(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoGlyphItem]],
        toCString(text),
        split_index
      )
    )
  end split

end GlyphItem

object GlyphItem:
  def fromRaw(ptr: Ptr[PangoGlyphItem]): GlyphItem = new GlyphItem(ptr)
end GlyphItem
