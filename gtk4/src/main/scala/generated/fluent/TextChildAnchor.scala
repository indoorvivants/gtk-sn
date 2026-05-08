package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.{gboolean, gint}
import sn.gnome.gobject.fluent.Object
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.internal.GtkTextChildAnchor

/** A `GtkTextChildAnchor` is a spot in a `GtkTextBuffer` where child widgets
  * can be “anchored”.
  *
  * The anchor can have multiple widgets anchored, to allow for multiple views.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class TextChildAnchor(raw: Ptr[GtkTextChildAnchor])
    extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Determines whether a child anchor has been deleted from the buffer.
    *
    * Keep in mind that the child anchor will be unreferenced when removed from
    * the buffer, so you need to hold your own reference (with g_object_ref())
    * if you plan to use this function — otherwise all deleted child anchors
    * will also be finalized.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDeleted(): Boolean /* None */ = gtk_text_child_anchor_get_deleted(
    this.raw.asInstanceOf[Ptr[GtkTextChildAnchor]]
  ).value.!=(0)

  /** Gets a list of all widgets anchored at this child anchor.
    *
    * The order in which the widgets are returned is not defined.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method get_widgets]: Method get_widgets contains an OUT parameter, which is not supported yet"
  )
  private def getWidgets__ = ???

end TextChildAnchor

object TextChildAnchor:
  /** Creates a new `GtkTextChildAnchor`.
    *
    * Usually you would then insert it into a `GtkTextBuffer` with
    * [method@Gtk.TextBuffer.insert_child_anchor]. To perform the creation and
    * insertion in one step, use the convenience function
    * [method@Gtk.TextBuffer.create_child_anchor].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply()(using Runtime): TextChildAnchor =
    val raw: Ptr[Byte] = gtk_text_child_anchor_new().asInstanceOf
    summon[Runtime].getOrCreate[TextChildAnchor](
      raw,
      r => new TextChildAnchor(r.asInstanceOf)
    )
  end apply

  /** Creates a new `GtkTextChildAnchor` with the given replacement character.
    *
    * Usually you would then insert it into a `GtkTextBuffer` with
    * [method@Gtk.TextBuffer.insert_child_anchor].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def withReplacement(character: String | CString /* Some(CString) */ )(using
      Zone
  )(using Runtime): TextChildAnchor =
    val raw: Ptr[Byte] = gtk_text_child_anchor_new_with_replacement(
      __sn_extract_string(character)
    ).asInstanceOf
    summon[Runtime].getOrCreate[TextChildAnchor](
      raw,
      r => new TextChildAnchor(r.asInstanceOf)
    )
  end withReplacement

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end TextChildAnchor
