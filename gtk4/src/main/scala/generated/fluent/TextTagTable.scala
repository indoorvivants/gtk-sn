package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.fluent.{Buildable, TextTag}
import sn.gnome.gtk4.internal.GtkTextTagTable

/** The collection of tags in a `GtkTextBuffer`
  *
  * You may wish to begin by reading the [text widget conceptual
  * overview](section-text-widget.html), which gives an overview of all the
  * objects and data types related to the text widget and how they work
  * together.
  *
  * # GtkTextTagTables as GtkBuildable
  *
  * The `GtkTextTagTable` implementation of the `GtkBuildable` interface
  * supports adding tags by specifying “tag” as the “type” attribute of a
  * `<child>` element.
  *
  * An example of a UI definition fragment specifying tags:
  * ```xml
  * <object class="GtkTextTagTable">
  *  <child type="tag">
  *    <object class="GtkTextTag"/>
  *  </child>
  * </object>
  * ```
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class TextTagTable(raw: Ptr[GtkTextTagTable])
    extends Object(raw.asInstanceOf),
      Buildable:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Add a tag to the table.
    *
    * The tag is assigned the highest priority in the table.
    *
    * @tag
    *   must not be in a tag table already, and may not have the same name as an
    *   already-added tag.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def add(tag: TextTag /* Some(Ptr[GtkTextTag]) */ ): Boolean /* None */ =
    gtk_text_tag_table_add(
      this.raw.asInstanceOf[Ptr[GtkTextTagTable]],
      tag.getUnsafeRawPointer().asInstanceOf
    ).value.!=(0)

  /** Calls @func on each tag in @table, with user data @data.
    *
    * Note that the table may not be modified while iterating over it (you can’t
    * add/remove tags).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[foreach/<method parameters>/func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TextTagTableForeach), @type -> DataRecord(GtkTextTagTableForeach)))"
  )
  private def foreach__ = ???

  /** Returns the size of the table (number of tags)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSize(): Int /* None */ = gtk_text_tag_table_get_size(
    this.raw.asInstanceOf[Ptr[GtkTextTagTable]]
  )

  /** Look up a named tag.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def lookup(
      name: String | CString /* Some(CString) */
  )(using Zone): TextTag /* None */ = new TextTag(
    gtk_text_tag_table_lookup(
      this.raw.asInstanceOf[Ptr[GtkTextTagTable]],
      __sn_extract_string(name)
    ).asInstanceOf
  )

  /** Remove a tag from the table.
    *
    * If a `GtkTextBuffer` has @table as its tag table, the tag is removed from
    * the buffer. The table’s reference to the tag is removed, so the tag will
    * end up destroyed if you don’t have a reference to it.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def remove(tag: TextTag /* Some(Ptr[GtkTextTag]) */ ): Unit /* None */ =
    gtk_text_tag_table_remove(
      this.raw.asInstanceOf[Ptr[GtkTextTagTable]],
      tag.getUnsafeRawPointer().asInstanceOf
    )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end TextTagTable

object TextTagTable:
  /** Creates a new `GtkTextTagTable`.
    *
    * The table contains no tags by default.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(): TextTagTable = new TextTagTable(
    gtk_text_tag_table_new().asInstanceOf
  )
end TextTagTable
