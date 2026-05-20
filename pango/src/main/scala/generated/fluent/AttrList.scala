package sn.gnome.pango

import _root_.sn.gnome.pango.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.SList
import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.pango.{AttrIterator, AttrList, Attribute}
import sn.gnome.pango.internal.PangoAttrList

/** A `PangoAttrList` represents a list of attributes that apply to a section of
  * text.
  *
  * The attributes in a `PangoAttrList` are, in general, allowed to overlap in
  * an arbitrary fashion. However, if the attributes are manipulated only
  * through [method@Pango.AttrList.change], the overlap between properties will
  * meet stricter criteria.
  *
  * Since the `PangoAttrList` structure is stored as a linear list, it is not
  * suitable for storing attributes for large amounts of text. In general, you
  * should not use a single `PangoAttrList` for more than one paragraph of text.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class AttrList private[gnome] (raw: Ptr[PangoAttrList]):

  def getUnsafeRawPointer(): Ptr[PangoAttrList] = this.raw

  /** Insert the given attribute into the `PangoAttrList`.
    *
    * It will replace any attributes of the same type on that segment and be
    * merged with any adjoining attributes that are identical.
    *
    * This function is slower than [method@Pango.AttrList.insert] for creating
    * an attribute list in order (potentially much slower for large lists).
    * However, [method@Pango.AttrList.insert] is not suitable for continually
    * changing a set of attributes since it never removes or combines existing
    * attributes.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def change(
      attr: sn.gnome.pango.Attribute /* Some(Ptr[PangoAttribute]) */
  ): Unit /* None */ =
    pango_attr_list_change(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoAttrList]],
      attr.getUnsafeRawPointer().asInstanceOf
    )
  end change

  /** Copy @list and return an identical new list.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def copy(): sn.gnome.pango.AttrList /* None */ =
    sn.gnome.pango.AttrList.fromRaw(
      pango_attr_list_copy(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoAttrList]]
      )
    )
  end copy

  /** Checks whether @list and @other_list contain the same attributes and
    * whether those attributes apply to the same ranges.
    *
    * Beware that this will return wrong values if any list contains duplicates.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def equal(
      other_list: sn.gnome.pango.AttrList /* Some(Ptr[PangoAttrList]) */
  ): Boolean /* None */ =
    pango_attr_list_equal(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoAttrList]],
      other_list.getUnsafeRawPointer().asInstanceOf
    ).value.!=(0)
  end equal

  /** Given a `PangoAttrList` and callback function, removes any elements of @list
    * for which @func returns %TRUE and inserts them into a new list.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method filter/<method parameters>/func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AttrFilterFunc), @type -> DataRecord(PangoAttrFilterFunc)))"
  )
  private def filter__ = ???

  /** Gets a list of all attributes in @list.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getAttributes(): sn.gnome.glib.SList /* None */ =
    sn.gnome.glib.SList.fromRaw(
      pango_attr_list_get_attributes(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoAttrList]]
      )
    )
  end getAttributes

  /** Create a iterator initialized to the beginning of the list.
    *
    * @list
    *   must not be modified until this iterator is freed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getIterator(): sn.gnome.pango.AttrIterator /* None */ =
    sn.gnome.pango.AttrIterator.fromRaw(
      pango_attr_list_get_iterator(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoAttrList]]
      )
    )
  end getIterator

  /** Insert the given attribute into the `PangoAttrList`.
    *
    * It will be inserted after all other attributes with a matching @start_index.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def insert(
      attr: sn.gnome.pango.Attribute /* Some(Ptr[PangoAttribute]) */
  ): Unit /* None */ =
    pango_attr_list_insert(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoAttrList]],
      attr.getUnsafeRawPointer().asInstanceOf
    )
  end insert

  /** Insert the given attribute into the `PangoAttrList`.
    *
    * It will be inserted before all other attributes with a matching @start_index.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def insertBefore(
      attr: sn.gnome.pango.Attribute /* Some(Ptr[PangoAttribute]) */
  ): Unit /* None */ =
    pango_attr_list_insert_before(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoAttrList]],
      attr.getUnsafeRawPointer().asInstanceOf
    )
  end insertBefore

  /** Increase the reference count of the given attribute list by one.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def ref(): sn.gnome.pango.AttrList /* None */ =
    sn.gnome.pango.AttrList.fromRaw(
      pango_attr_list_ref(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoAttrList]]
      )
    )
  end ref

  /** This function opens up a hole in @list, fills it in with attributes from
    * the left, and then merges
    * @other
    *   on top of the hole.
    *
    * This operation is equivalent to stretching every attribute that applies at
    * position @pos in @list by an amount @len, and then calling
    * [method@Pango.AttrList.change] with a copy of each attribute in @other in
    * sequence (offset in position by @pos, and limited in length to @len).
    *
    * This operation proves useful for, for instance, inserting a pre-edit
    * string in the middle of an edit buffer.
    *
    * For backwards compatibility, the function behaves differently when @len is 0.
    * In this case, the attributes from @other are not imited to @len, and are
    * just overlayed on top of @list.
    *
    * This mode is useful for merging two lists of attributes together.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def splice(
      other: sn.gnome.pango.AttrList /* Some(Ptr[PangoAttrList]) */,
      pos: Int /* Some(CInt) */,
      len: Int /* Some(CInt) */
  ): Unit /* None */ =
    pango_attr_list_splice(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoAttrList]],
      other.getUnsafeRawPointer().asInstanceOf,
      pos,
      len
    )
  end splice

  /** Serializes a `PangoAttrList` to a string.
    *
    * In the resulting string, serialized attributes are separated by newlines
    * or commas. Individual attributes are serialized to a string of the form
    *
    * START END TYPE VALUE
    *
    * Where START and END are the indices (with -1 being accepted in place of
    * MAXUINT), TYPE is the nickname of the attribute value type, e.g. _weight_
    * or _stretch_, and the value is serialized according to its type:
    *
    *   - enum values as nick or numeric value
    *   - boolean values as _true_ or _false_
    *   - integers and floats as numbers
    *   - strings as string, optionally quoted
    *   - font features as quoted string
    *   - PangoLanguage as string
    *   - PangoFontDescription as serialized by
    *     [method@Pango.FontDescription.to_string], quoted
    *   - PangoColor as serialized by [method@Pango.Color.to_string]
    *
    * Examples:
    *
    * ```
    * 0 10 foreground red, 5 15 weight bold, 0 200 font-desc "Sans 10"
    * ```
    *
    * ```
    * 0 -1 weight 700
    * 0 100 family Times
    * ```
    *
    * To parse the returned value, use [func@Pango.AttrList.from_string].
    *
    * Note that shape attributes can not be serialized.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def _toString(): scala.Predef.String /* None */ =
    fromCString(
      pango_attr_list_to_string(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoAttrList]]
      ).asInstanceOf
    )
  end _toString

  /** Decrease the reference count of the given attribute list by one.
    *
    * If the result is zero, free the attribute list and the attributes it
    * contains.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unref(): Unit /* None */ =
    pango_attr_list_unref(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoAttrList]]
    )
  end unref

  /** Update indices of attributes in @list for a change in the text they refer
    * to.
    *
    * The change that this function applies is removing @remove bytes at
    * position @pos and inserting @add bytes instead.
    *
    * Attributes that fall entirely in the (@pos, @pos + @remove) range are
    * removed.
    *
    * Attributes that start or end inside the (@pos, @pos + @remove) range are
    * shortened to reflect the removal.
    *
    * Attributes start and end positions are updated if they are behind @pos + @remove.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def update(
      pos: Int /* Some(CInt) */,
      remove: Int /* Some(CInt) */,
      add: Int /* Some(CInt) */
  ): Unit /* None */ =
    pango_attr_list_update(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoAttrList]],
      pos,
      remove,
      add
    )
  end update

end AttrList

object AttrList:
  def fromRaw(ptr: Ptr[PangoAttrList]): AttrList = new AttrList(ptr)
end AttrList
