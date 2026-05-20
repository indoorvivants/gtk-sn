package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gobject.Object
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.TextBuffer
import sn.gnome.gtk4.internal.GtkTextMark

/** A `GtkTextMark` is a position in a `GtkTextbuffer` that is preserved across
  * modifications.
  *
  * You may wish to begin by reading the [text widget conceptual
  * overview](section-text-widget.html), which gives an overview of all the
  * objects and data types related to the text widget and how they work
  * together.
  *
  * A `GtkTextMark` is like a bookmark in a text buffer; it preserves a position
  * in the text. You can convert the mark to an iterator using
  * [method@Gtk.TextBuffer.get_iter_at_mark]. Unlike iterators, marks remain
  * valid across buffer mutations, because their behavior is defined when text
  * is inserted or deleted. When text containing a mark is deleted, the mark
  * remains in the position originally occupied by the deleted text. When text
  * is inserted at a mark, a mark with “left gravity” will be moved to the
  * beginning of the newly-inserted text, and a mark with “right gravity” will
  * be moved to the end.
  *
  * Note that “left” and “right” here refer to logical direction (left is the
  * toward the start of the buffer); in some languages such as Hebrew the
  * logically-leftmost text is not actually on the left when displayed.
  *
  * Marks are reference counted, but the reference count only controls the
  * validity of the memory; marks can be deleted from the buffer at any time
  * with [method@Gtk.TextBuffer.delete_mark]. Once deleted from the buffer, a
  * mark is essentially useless.
  *
  * Marks optionally have names; these can be convenient to avoid passing the
  * `GtkTextMark` object around.
  *
  * Marks are typically created using the [method@Gtk.TextBuffer.create_mark]
  * function.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class TextMark private[gnome] (raw: Ptr[GtkTextMark])
    extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Gets the buffer this mark is located inside.
    *
    * Returns %NULL if the mark is deleted.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getBuffer()(using Runtime): sn.gnome.gtk4.TextBuffer /* None */ =
    sn.gnome.gtk4.TextBuffer.applyUnsafe(
      gtk_text_mark_get_buffer(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextMark]]
      ).asInstanceOf
    )
  end getBuffer

  /** Returns %TRUE if the mark has been removed from its buffer.
    *
    * See [method@Gtk.TextBuffer.add_mark] for a way to add it to a buffer
    * again.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDeleted(): Boolean /* None */ =
    gtk_text_mark_get_deleted(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextMark]]
    ).value.!=(0)
  end getDeleted

  /** Determines whether the mark has left gravity.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getLeftGravity(): Boolean /* None */ =
    gtk_text_mark_get_left_gravity(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextMark]]
    ).value.!=(0)
  end getLeftGravity

  /** Returns the mark name.
    *
    * Returns %NULL for anonymous marks.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getName(): scala.Predef.String /* None */ =
    fromCString(
      gtk_text_mark_get_name(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextMark]]
      ).asInstanceOf
    )
  end getName

  /** Returns %TRUE if the mark is visible.
    *
    * A cursor is displayed for visible marks.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getVisible(): Boolean /* None */ =
    gtk_text_mark_get_visible(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextMark]]
    ).value.!=(0)
  end getVisible

  def setVisible(
      setting: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  ): Unit /* None */ =
    gtk_text_mark_set_visible(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextMark]],
      gboolean(gint((if setting == true then 1 else 0)))
    )
  end setVisible

end TextMark

object TextMark:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkTextMark])(using Runtime) = summon[Runtime]
    .getOrCreate[TextMark](ptr.asInstanceOf[Ptr[Byte]], p => new TextMark(ptr))

  /** Creates a text mark.
    *
    * Add it to a buffer using [method@Gtk.TextBuffer.add_mark]. If @name is
    * %NULL, the mark is anonymous; otherwise, the mark can be retrieved by name
    * using [method@Gtk.TextBuffer.get_mark]. If a mark has left gravity, and
    * text is inserted at the mark’s current location, the mark will be moved to
    * the left of the newly-inserted text. If the mark has right gravity
    * (@left_gravity = %FALSE), the mark will end up on the right of
    * newly-inserted text. The standard left-to-right cursor is a mark with
    * right gravity (when you type, the cursor stays on the right side of the
    * text you’re typing).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      name: Option[scala.Predef.String /* Some(CString) */ ],
      left_gravity: Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */
  )(using Runtime): TextMark =
    val raw: Ptr[Byte] = gtk_text_mark_new(
      name
        .map[CString](o => summon[Runtime].inZone(toCString(o)))
        .getOrElse(null.asInstanceOf[CString]),
      gboolean(gint((if left_gravity == true then 1 else 0)))
    ).asInstanceOf
    summon[Runtime]
      .getOrCreate[TextMark](raw, r => TextMark.applyUnsafe(r.asInstanceOf))
  end apply
end TextMark
