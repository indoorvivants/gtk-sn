package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gobject.Object
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.internal.GtkTextTag

/** A tag that can be applied to text contained in a `GtkTextBuffer`.
  *
  * You may wish to begin by reading the [text widget conceptual
  * overview](section-text-widget.html), which gives an overview of all the
  * objects and data types related to the text widget and how they work
  * together.
  *
  * Tags should be in the [class@Gtk.TextTagTable] for a given `GtkTextBuffer`
  * before using them with that buffer.
  *
  * [method@Gtk.TextBuffer.create_tag] is the best way to create tags. See
  * “gtk4-demo” for numerous examples.
  *
  * For each property of `GtkTextTag`, there is a “set” property, e.g.
  * “font-set” corresponds to “font”. These “set” properties reflect whether a
  * property has been set or not.
  *
  * They are maintained by GTK and you should not set them independently.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class TextTag private[gnome] (raw: Ptr[GtkTextTag])
    extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Emits the [signal@Gtk.TextTagTable::tag-changed] signal on the
    * `GtkTextTagTable` where the tag is included.
    *
    * The signal is already emitted when setting a `GtkTextTag` property. This
    * function is useful for a `GtkTextTag` subclass.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def changed(
      size_changed: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_text_tag_changed(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextTag]],
      gboolean(gint((if size_changed == true then 1 else 0)))
    )
  end changed

  /** Get the tag priority.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getPriority(): Int /* None */ =
    gtk_text_tag_get_priority(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextTag]]
    )
  end getPriority

  /** Sets the priority of a `GtkTextTag`.
    *
    * Valid priorities start at 0 and go to one less than
    * [method@Gtk.TextTagTable.get_size]. Each tag in a table has a unique
    * priority; setting the priority of one tag shifts the priorities of all the
    * other tags in the table to maintain a unique priority for each tag.
    *
    * Higher priority tags “win” if two tags both set the same text attribute.
    * When adding a tag to a tag table, it will be assigned the highest priority
    * in the table by default; so normally the precedence of a set of tags is
    * the order in which they were added to the table, or created with
    * [method@Gtk.TextBuffer.create_tag], which adds the tag to the buffer’s
    * table automatically.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setPriority(priority: Int /* Some(CInt) */ ): Unit /* None */ =
    gtk_text_tag_set_priority(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextTag]],
      priority
    )
  end setPriority

end TextTag

object TextTag:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkTextTag])(using Runtime) = summon[Runtime]
    .getOrCreate[TextTag](ptr.asInstanceOf[Ptr[Byte]], p => new TextTag(ptr))

  /** Creates a `GtkTextTag`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(name: Option[scala.Predef.String /* Some(CString) */ ])(using
      Runtime
  ): TextTag =
    val raw: Ptr[Byte] = gtk_text_tag_new(
      name
        .map[CString](o => summon[Runtime].inZone(toCString(o)))
        .getOrElse(null.asInstanceOf[CString])
    ).asInstanceOf
    summon[Runtime]
      .getOrCreate[TextTag](raw, r => TextTag.applyUnsafe(r.asInstanceOf))
  end apply
end TextTag
