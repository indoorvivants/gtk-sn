package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.{gboolean, gchar, gint, gpointer}
import sn.gnome.gobject.fluent.Object
import sn.gnome.gobject.internal.{
  GClosure,
  GClosureNotify,
  GConnectFlags,
  g_signal_connect_data
}
import sn.gnome.gobject.runtime.*
import sn.gnome.gtk4.fluent.{Buildable, TextTag}
import sn.gnome.gtk4.internal.{GtkTextTag, GtkTextTagTable}
import sn.gnome.runtime.*

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
class TextTagTable private[gnome] (raw: Ptr[GtkTextTagTable])
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
  def add(
      tag: sn.gnome.gtk4.fluent.TextTag /* Some(Ptr[GtkTextTag]) */
  )(using Runtime): Boolean /* None */ =
    gtk_text_tag_table_add(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextTagTable]],
      tag.getUnsafeRawPointer().asInstanceOf
    ).value.!=(0)
  end add

  /** Calls @func on each tag in @table, with user data @data.
    *
    * Note that the table may not be modified while iterating over it (you can’t
    * add/remove tags).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method foreach/<method parameters>/func]: Cannot render type Type(List(),ListMap(@name -> DataRecord(TextTagTableForeach), @type -> DataRecord(GtkTextTagTableForeach)))"
  )
  private def foreach__ = ???

  /** Returns the size of the table (number of tags)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getSize(): Int /* None */ =
    gtk_text_tag_table_get_size(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextTagTable]]
    )
  end getSize

  /** Look up a named tag.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def lookup(
      name: String /* Some(CString) */
  )(using Zone, Runtime): sn.gnome.gtk4.fluent.TextTag /* None */ =
    sn.gnome.gtk4.fluent.TextTag.applyUnsafe(
      gtk_text_tag_table_lookup(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextTagTable]],
        toCString(name)
      ).asInstanceOf
    )
  end lookup

  /** Remove a tag from the table.
    *
    * If a `GtkTextBuffer` has @table as its tag table, the tag is removed from
    * the buffer. The table’s reference to the tag is removed, so the tag will
    * end up destroyed if you don’t have a reference to it.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def remove(
      tag: sn.gnome.gtk4.fluent.TextTag /* Some(Ptr[GtkTextTag]) */
  )(using Runtime): Unit /* None */ =
    gtk_text_tag_table_remove(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GtkTextTagTable]],
      tag.getUnsafeRawPointer().asInstanceOf
    )
  end remove

  /** Emitted every time a new tag is added in the `GtkTextTagTable`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onTagAdded(handler: ((tag: TextTag)) => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, (tag: TextTag), Unit]
    val c_handler = CFuncPtr3.fromScalaFunction {
      (
          self: Ptr[GtkTextTagTable],
          tag: Ptr[GtkTextTag] /* param */,
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler((tag = sr.runtime.get[TextTag](tag.asInstanceOf[Ptr[Byte]])))
    }
    val f = handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"tag-added"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onTagAdded

  /** Emitted every time a tag in the `GtkTextTagTable` changes.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onTagChanged(handler: ((tag: TextTag, sizeChanged: Boolean)) => Unit)(
      using Runtime
  ) =
    type SignalRegType =
      SignalRegistration[this.type, (tag: TextTag, sizeChanged: Boolean), Unit]
    val c_handler = CFuncPtr4.fromScalaFunction {
      (
          self: Ptr[GtkTextTagTable],
          tag: Ptr[GtkTextTag] /* param */,
          sizeChanged: Boolean /* param */,
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(
          (
            tag = sr.runtime.get[TextTag](tag.asInstanceOf[Ptr[Byte]]),
            sizeChanged = sizeChanged
          )
        )
    }
    val f = handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"tag-changed"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onTagChanged

  /** Emitted every time a tag is removed from the `GtkTextTagTable`.
    *
    * The @tag is still valid by the time the signal is emitted, but it is not
    * associated with a tag table any more.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onTagRemoved(handler: ((tag: TextTag)) => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, (tag: TextTag), Unit]
    val c_handler = CFuncPtr3.fromScalaFunction {
      (
          self: Ptr[GtkTextTagTable],
          tag: Ptr[GtkTextTag] /* param */,
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler((tag = sr.runtime.get[TextTag](tag.asInstanceOf[Ptr[Byte]])))
    }
    val f = handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"tag-removed"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onTagRemoved
end TextTagTable

object TextTagTable:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GtkTextTagTable])(using Runtime) =
    summon[Runtime].getOrCreate[TextTagTable](
      ptr.asInstanceOf[Ptr[Byte]],
      p => new TextTagTable(ptr)
    )

  /** Creates a new `GtkTextTagTable`.
    *
    * The table contains no tags by default.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply()(using Runtime): TextTagTable =
    val raw: Ptr[Byte] = gtk_text_tag_table_new().asInstanceOf
    summon[Runtime].getOrCreate[TextTagTable](
      raw,
      r => TextTagTable.applyUnsafe(r.asInstanceOf)
    )
  end apply
end TextTagTable
