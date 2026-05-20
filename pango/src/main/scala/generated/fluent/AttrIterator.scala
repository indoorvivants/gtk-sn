package sn.gnome.pango

import _root_.sn.gnome.pango.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.SList
import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.pango.{AttrIterator, AttrType, Attribute}
import sn.gnome.pango.internal.PangoAttrIterator

/** A `PangoAttrIterator` is used to iterate through a `PangoAttrList`.
  *
  * A new iterator is created with [method@Pango.AttrList.get_iterator]. Once
  * the iterator is created, it can be advanced through the style changes in the
  * text using [method@Pango.AttrIterator.next]. At each style change, the range
  * of the current style segment and the attributes currently in effect can be
  * queried.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class AttrIterator private[gnome] (raw: Ptr[PangoAttrIterator]):

  def getUnsafeRawPointer(): Ptr[PangoAttrIterator] = this.raw

  /** Copy a `PangoAttrIterator`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def copy(): sn.gnome.pango.AttrIterator /* None */ =
    sn.gnome.pango.AttrIterator.fromRaw(
      pango_attr_iterator_copy(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoAttrIterator]]
      )
    )
  end copy

  /** Destroy a `PangoAttrIterator` and free all associated memory.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def destroy(): Unit /* None */ =
    pango_attr_iterator_destroy(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoAttrIterator]]
    )
  end destroy

  /** Find the current attribute of a particular type at the iterator location.
    *
    * When multiple attributes of the same type overlap, the attribute whose
    * range starts closest to the current location is used.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def get(
      `type`: sn.gnome.pango.AttrType /* Some(PangoAttrType) */
  ): sn.gnome.pango.Attribute /* None */ =
    sn.gnome.pango.Attribute.fromRaw(
      pango_attr_iterator_get(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoAttrIterator]],
        `type`.raw
      )
    )
  end get

  /** Gets a list of all attributes at the current position of the iterator.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getAttrs(): sn.gnome.glib.SList /* None */ =
    sn.gnome.glib.SList.fromRaw(
      pango_attr_iterator_get_attrs(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoAttrIterator]]
      )
    )
  end getAttrs

  /** Get the font and other attributes at the current iterator position.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_font]: Method get_font contains an OUT parameter, which is not supported yet"
  )
  private def getFont__ = ???

  /** Advance the iterator until the next change of style.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def next(): Boolean /* None */ =
    pango_attr_iterator_next(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoAttrIterator]]
    ).value.!=(0)
  end next

  /** Get the range of the current segment.
    *
    * Note that the stored return values are signed, not unsigned like the
    * values in `PangoAttribute`. To deal with this API oversight, stored return
    * values that wouldn't fit into a signed integer are clamped to %G_MAXINT.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method range]: Method range contains an OUT parameter, which is not supported yet"
  )
  private def range__ = ???

end AttrIterator

object AttrIterator:
  def fromRaw(ptr: Ptr[PangoAttrIterator]): AttrIterator = new AttrIterator(ptr)
end AttrIterator
