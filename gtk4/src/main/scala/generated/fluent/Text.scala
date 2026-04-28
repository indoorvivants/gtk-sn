package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.fluent.MenuModel
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.guint16
import sn.gnome.glib.internal.guint32
import sn.gnome.glib.internal.gunichar
import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.Editable
import sn.gnome.gtk4.fluent.EntryBuffer
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkInputHints
import sn.gnome.gtk4.internal.GtkInputPurpose
import sn.gnome.gtk4.internal.GtkText
import sn.gnome.pango.internal.PangoAttrList
import sn.gnome.pango.internal.PangoTabArray

class Text(raw: Ptr[GtkText])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget,
      Editable:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  // Method compute_cursor_extents contains an OUT parameter, which is not supported yet

  def getActivatesDefault(): Boolean =
    gtk_text_get_activates_default(this.raw.asInstanceOf).value.!=(0)

  def getAttributes(): Ptr[PangoAttrList] = gtk_text_get_attributes(
    this.raw.asInstanceOf
  )

  def getBuffer(): EntryBuffer = new EntryBuffer(
    gtk_text_get_buffer(this.raw.asInstanceOf).asInstanceOf
  )

  def getEnableEmojiCompletion(): Boolean =
    gtk_text_get_enable_emoji_completion(this.raw.asInstanceOf).value.!=(0)

  def getExtraMenu(): MenuModel = new MenuModel(
    gtk_text_get_extra_menu(this.raw.asInstanceOf).asInstanceOf
  )

  def getInputHints(): GtkInputHints = gtk_text_get_input_hints(
    this.raw.asInstanceOf
  )

  def getInputPurpose(): GtkInputPurpose = gtk_text_get_input_purpose(
    this.raw.asInstanceOf
  )

  def getInvisibleChar(): CUnsignedInt = gtk_text_get_invisible_char(
    this.raw.asInstanceOf
  ).value

  def getMaxLength(): Int = gtk_text_get_max_length(this.raw.asInstanceOf)

  def getOverwriteMode(): Boolean =
    gtk_text_get_overwrite_mode(this.raw.asInstanceOf).value.!=(0)

  def getPlaceholderText()(using Zone): String = fromCString(
    gtk_text_get_placeholder_text(this.raw.asInstanceOf).asInstanceOf
  )

  def getPropagateTextWidth(): Boolean =
    gtk_text_get_propagate_text_width(this.raw.asInstanceOf).value.!=(0)

  def getTabs(): Ptr[PangoTabArray] = gtk_text_get_tabs(this.raw.asInstanceOf)

  def getTextLength(): UShort = gtk_text_get_text_length(
    this.raw.asInstanceOf
  ).value

  def getTruncateMultiline(): Boolean =
    gtk_text_get_truncate_multiline(this.raw.asInstanceOf).value.!=(0)

  def getVisibility(): Boolean =
    gtk_text_get_visibility(this.raw.asInstanceOf).value.!=(0)

  def grabFocusWithoutSelecting(): Boolean =
    gtk_text_grab_focus_without_selecting(this.raw.asInstanceOf).value.!=(0)

  def setActivatesDefault(activates: Boolean): Unit =
    gtk_text_set_activates_default(
      this.raw.asInstanceOf,
      gboolean(gint((if activates == true then 1 else 0)))
    )

  def setAttributes(attrs: Ptr[PangoAttrList]): Unit =
    gtk_text_set_attributes(this.raw.asInstanceOf, attrs)

  def setBuffer(buffer: EntryBuffer): Unit = gtk_text_set_buffer(
    this.raw.asInstanceOf,
    buffer.getUnsafeRawPointer().asInstanceOf
  )

  def setEnableEmojiCompletion(enable_emoji_completion: Boolean): Unit =
    gtk_text_set_enable_emoji_completion(
      this.raw.asInstanceOf,
      gboolean(gint((if enable_emoji_completion == true then 1 else 0)))
    )

  def setExtraMenu(model: MenuModel): Unit = gtk_text_set_extra_menu(
    this.raw.asInstanceOf,
    model.getUnsafeRawPointer().asInstanceOf
  )

  def setInputHints(hints: GtkInputHints): Unit =
    gtk_text_set_input_hints(this.raw.asInstanceOf, hints)

  def setInputPurpose(purpose: GtkInputPurpose): Unit =
    gtk_text_set_input_purpose(this.raw.asInstanceOf, purpose)

  def setInvisibleChar(ch: CUnsignedInt): Unit =
    gtk_text_set_invisible_char(this.raw.asInstanceOf, gunichar(guint32(ch)))

  def setMaxLength(length: Int): Unit =
    gtk_text_set_max_length(this.raw.asInstanceOf, length)

  def setOverwriteMode(overwrite: Boolean): Unit = gtk_text_set_overwrite_mode(
    this.raw.asInstanceOf,
    gboolean(gint((if overwrite == true then 1 else 0)))
  )

  def setPlaceholderText(text: String | CString)(using Zone): Unit =
    gtk_text_set_placeholder_text(
      this.raw.asInstanceOf,
      __sn_extract_string(text)
    )

  def setPropagateTextWidth(propagate_text_width: Boolean): Unit =
    gtk_text_set_propagate_text_width(
      this.raw.asInstanceOf,
      gboolean(gint((if propagate_text_width == true then 1 else 0)))
    )

  def setTabs(tabs: Ptr[PangoTabArray]): Unit =
    gtk_text_set_tabs(this.raw.asInstanceOf, tabs)

  def setTruncateMultiline(truncate_multiline: Boolean): Unit =
    gtk_text_set_truncate_multiline(
      this.raw.asInstanceOf,
      gboolean(gint((if truncate_multiline == true then 1 else 0)))
    )

  def setVisibility(visible: Boolean): Unit = gtk_text_set_visibility(
    this.raw.asInstanceOf,
    gboolean(gint((if visible == true then 1 else 0)))
  )

  def unsetInvisibleChar(): Unit = gtk_text_unset_invisible_char(
    this.raw.asInstanceOf
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end Text

object Text:
  def apply(): Text = new Text(gtk_text_new().asInstanceOf)
  def withBuffer(buffer: EntryBuffer): Text = new Text(
    gtk_text_new_with_buffer(
      buffer.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )
end Text
