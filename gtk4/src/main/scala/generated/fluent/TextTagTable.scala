package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.gpointer
import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.TextTag
import sn.gnome.gtk4.internal.GtkTextTagTable
import sn.gnome.gtk4.internal.GtkTextTagTableForeach

class TextTagTable(raw: Ptr[GtkTextTagTable])
    extends Object(raw.asInstanceOf),
      Buildable:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def add(tag: TextTag): Boolean = gtk_text_tag_table_add(
    this.raw.asInstanceOf,
    tag.getUnsafeRawPointer().asInstanceOf
  ).value.!=(0)

  def foreach(func: GtkTextTagTableForeach, data: Ptr[Byte]): Unit =
    gtk_text_tag_table_foreach(this.raw.asInstanceOf, func, gpointer(data))

  def getSize(): Int = gtk_text_tag_table_get_size(this.raw.asInstanceOf)

  def lookup(name: String | CString)(using Zone): TextTag = new TextTag(
    gtk_text_tag_table_lookup(
      this.raw.asInstanceOf,
      __sn_extract_string(name)
    ).asInstanceOf
  )

  def remove(tag: TextTag): Unit = gtk_text_tag_table_remove(
    this.raw.asInstanceOf,
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
  def apply(): TextTagTable = new TextTagTable(
    gtk_text_tag_table_new().asInstanceOf
  )
end TextTagTable
