package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gdk4.fluent.ContentProvider
import sn.gnome.gdk4.fluent.Paintable
import sn.gnome.gdk4.internal.GdkDragAction
import sn.gnome.gio.fluent.Icon
import sn.gnome.gio.fluent.MenuModel
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.guint16
import sn.gnome.glib.internal.guint32
import sn.gnome.glib.internal.gunichar
import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.CellEditable
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.Editable
import sn.gnome.gtk4.fluent.EntryBuffer
import sn.gnome.gtk4.fluent.EntryCompletion
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkEntry
import sn.gnome.gtk4.internal.GtkEntryIconPosition
import sn.gnome.gtk4.internal.GtkImageType
import sn.gnome.gtk4.internal.GtkInputHints
import sn.gnome.gtk4.internal.GtkInputPurpose
import sn.gnome.pango.internal.PangoAttrList
import sn.gnome.pango.internal.PangoTabArray

class Entry(raw: Ptr[GtkEntry])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      CellEditable,
      ConstraintTarget,
      Editable:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getActivatesDefault(): Boolean =
    gtk_entry_get_activates_default(this.raw.asInstanceOf).value.!=(0)

  def getAlignment(): Float = gtk_entry_get_alignment(this.raw.asInstanceOf)

  def getAttributes(): Ptr[PangoAttrList] = gtk_entry_get_attributes(
    this.raw.asInstanceOf
  )

  def getBuffer(): EntryBuffer = new EntryBuffer(
    gtk_entry_get_buffer(this.raw.asInstanceOf).asInstanceOf
  )

  def getCompletion(): EntryCompletion = new EntryCompletion(
    gtk_entry_get_completion(this.raw.asInstanceOf).asInstanceOf
  )

  def getCurrentIconDragSource(): Int = gtk_entry_get_current_icon_drag_source(
    this.raw.asInstanceOf
  )

  def getExtraMenu(): MenuModel = new MenuModel(
    gtk_entry_get_extra_menu(this.raw.asInstanceOf).asInstanceOf
  )

  def getHasFrame(): Boolean =
    gtk_entry_get_has_frame(this.raw.asInstanceOf).value.!=(0)

  def getIconActivatable(icon_pos: GtkEntryIconPosition): Boolean =
    gtk_entry_get_icon_activatable(this.raw.asInstanceOf, icon_pos).value.!=(0)

  // Method get_icon_area contains an OUT parameter, which is not supported yet

  def getIconAtPos(x: Int, y: Int): Int =
    gtk_entry_get_icon_at_pos(this.raw.asInstanceOf, x, y)

  def getIconGicon(icon_pos: GtkEntryIconPosition): Icon = new Icon.Abstract(
    gtk_entry_get_icon_gicon(this.raw.asInstanceOf, icon_pos).asInstanceOf
  )

  def getIconName(icon_pos: GtkEntryIconPosition)(using Zone): String =
    fromCString(
      gtk_entry_get_icon_name(this.raw.asInstanceOf, icon_pos).asInstanceOf
    )

  def getIconPaintable(icon_pos: GtkEntryIconPosition): Paintable =
    new Paintable.Abstract(
      gtk_entry_get_icon_paintable(this.raw.asInstanceOf, icon_pos).asInstanceOf
    )

  def getIconSensitive(icon_pos: GtkEntryIconPosition): Boolean =
    gtk_entry_get_icon_sensitive(this.raw.asInstanceOf, icon_pos).value.!=(0)

  def getIconStorageType(icon_pos: GtkEntryIconPosition): GtkImageType =
    gtk_entry_get_icon_storage_type(this.raw.asInstanceOf, icon_pos)

  def getIconTooltipMarkup(icon_pos: GtkEntryIconPosition)(using Zone): String =
    fromCString(
      gtk_entry_get_icon_tooltip_markup(
        this.raw.asInstanceOf,
        icon_pos
      ).asInstanceOf
    )

  def getIconTooltipText(icon_pos: GtkEntryIconPosition)(using Zone): String =
    fromCString(
      gtk_entry_get_icon_tooltip_text(
        this.raw.asInstanceOf,
        icon_pos
      ).asInstanceOf
    )

  def getInputHints(): GtkInputHints = gtk_entry_get_input_hints(
    this.raw.asInstanceOf
  )

  def getInputPurpose(): GtkInputPurpose = gtk_entry_get_input_purpose(
    this.raw.asInstanceOf
  )

  def getInvisibleChar(): CUnsignedInt = gtk_entry_get_invisible_char(
    this.raw.asInstanceOf
  ).value

  def getMaxLength(): Int = gtk_entry_get_max_length(this.raw.asInstanceOf)

  def getOverwriteMode(): Boolean =
    gtk_entry_get_overwrite_mode(this.raw.asInstanceOf).value.!=(0)

  def getPlaceholderText()(using Zone): String = fromCString(
    gtk_entry_get_placeholder_text(this.raw.asInstanceOf).asInstanceOf
  )

  def getProgressFraction(): Double = gtk_entry_get_progress_fraction(
    this.raw.asInstanceOf
  )

  def getProgressPulseStep(): Double = gtk_entry_get_progress_pulse_step(
    this.raw.asInstanceOf
  )

  def getTabs(): Ptr[PangoTabArray] = gtk_entry_get_tabs(this.raw.asInstanceOf)

  def getTextLength(): UShort = gtk_entry_get_text_length(
    this.raw.asInstanceOf
  ).value

  def getVisibility(): Boolean =
    gtk_entry_get_visibility(this.raw.asInstanceOf).value.!=(0)

  def grabFocusWithoutSelecting(): Boolean =
    gtk_entry_grab_focus_without_selecting(this.raw.asInstanceOf).value.!=(0)

  def progressPulse(): Unit = gtk_entry_progress_pulse(this.raw.asInstanceOf)

  def resetImContext(): Unit = gtk_entry_reset_im_context(this.raw.asInstanceOf)

  def setActivatesDefault(setting: Boolean): Unit =
    gtk_entry_set_activates_default(
      this.raw.asInstanceOf,
      gboolean(gint((if setting == true then 1 else 0)))
    )

  def setAlignment(xalign: Float): Unit =
    gtk_entry_set_alignment(this.raw.asInstanceOf, xalign.asInstanceOf)

  def setAttributes(attrs: Ptr[PangoAttrList]): Unit =
    gtk_entry_set_attributes(this.raw.asInstanceOf, attrs)

  def setBuffer(buffer: EntryBuffer): Unit = gtk_entry_set_buffer(
    this.raw.asInstanceOf,
    buffer.getUnsafeRawPointer().asInstanceOf
  )

  def setCompletion(completion: EntryCompletion): Unit =
    gtk_entry_set_completion(
      this.raw.asInstanceOf,
      completion.getUnsafeRawPointer().asInstanceOf
    )

  def setExtraMenu(model: MenuModel): Unit = gtk_entry_set_extra_menu(
    this.raw.asInstanceOf,
    model.getUnsafeRawPointer().asInstanceOf
  )

  def setHasFrame(setting: Boolean): Unit = gtk_entry_set_has_frame(
    this.raw.asInstanceOf,
    gboolean(gint((if setting == true then 1 else 0)))
  )

  def setIconActivatable(
      icon_pos: GtkEntryIconPosition,
      activatable: Boolean
  ): Unit = gtk_entry_set_icon_activatable(
    this.raw.asInstanceOf,
    icon_pos,
    gboolean(gint((if activatable == true then 1 else 0)))
  )

  def setIconDragSource(
      icon_pos: GtkEntryIconPosition,
      provider: ContentProvider,
      actions: GdkDragAction
  ): Unit = gtk_entry_set_icon_drag_source(
    this.raw.asInstanceOf,
    icon_pos,
    provider.getUnsafeRawPointer().asInstanceOf,
    actions
  )

  def setIconFromGicon(icon_pos: GtkEntryIconPosition, icon: Icon): Unit =
    gtk_entry_set_icon_from_gicon(
      this.raw.asInstanceOf,
      icon_pos,
      icon.getUnsafeRawPointer().asInstanceOf
    )

  def setIconFromIconName(
      icon_pos: GtkEntryIconPosition,
      icon_name: String | CString
  )(using Zone): Unit = gtk_entry_set_icon_from_icon_name(
    this.raw.asInstanceOf,
    icon_pos,
    __sn_extract_string(icon_name)
  )

  def setIconFromPaintable(
      icon_pos: GtkEntryIconPosition,
      paintable: Paintable
  ): Unit = gtk_entry_set_icon_from_paintable(
    this.raw.asInstanceOf,
    icon_pos,
    paintable.getUnsafeRawPointer().asInstanceOf
  )

  def setIconSensitive(
      icon_pos: GtkEntryIconPosition,
      sensitive: Boolean
  ): Unit = gtk_entry_set_icon_sensitive(
    this.raw.asInstanceOf,
    icon_pos,
    gboolean(gint((if sensitive == true then 1 else 0)))
  )

  def setIconTooltipMarkup(
      icon_pos: GtkEntryIconPosition,
      tooltip: String | CString
  )(using Zone): Unit = gtk_entry_set_icon_tooltip_markup(
    this.raw.asInstanceOf,
    icon_pos,
    __sn_extract_string(tooltip)
  )

  def setIconTooltipText(
      icon_pos: GtkEntryIconPosition,
      tooltip: String | CString
  )(using Zone): Unit = gtk_entry_set_icon_tooltip_text(
    this.raw.asInstanceOf,
    icon_pos,
    __sn_extract_string(tooltip)
  )

  def setInputHints(hints: GtkInputHints): Unit =
    gtk_entry_set_input_hints(this.raw.asInstanceOf, hints)

  def setInputPurpose(purpose: GtkInputPurpose): Unit =
    gtk_entry_set_input_purpose(this.raw.asInstanceOf, purpose)

  def setInvisibleChar(ch: CUnsignedInt): Unit =
    gtk_entry_set_invisible_char(this.raw.asInstanceOf, gunichar(guint32(ch)))

  def setMaxLength(max: Int): Unit =
    gtk_entry_set_max_length(this.raw.asInstanceOf, max)

  def setOverwriteMode(overwrite: Boolean): Unit = gtk_entry_set_overwrite_mode(
    this.raw.asInstanceOf,
    gboolean(gint((if overwrite == true then 1 else 0)))
  )

  def setPlaceholderText(text: String | CString)(using Zone): Unit =
    gtk_entry_set_placeholder_text(
      this.raw.asInstanceOf,
      __sn_extract_string(text)
    )

  def setProgressFraction(fraction: Double): Unit =
    gtk_entry_set_progress_fraction(this.raw.asInstanceOf, fraction)

  def setProgressPulseStep(fraction: Double): Unit =
    gtk_entry_set_progress_pulse_step(this.raw.asInstanceOf, fraction)

  def setTabs(tabs: Ptr[PangoTabArray]): Unit =
    gtk_entry_set_tabs(this.raw.asInstanceOf, tabs)

  def setVisibility(visible: Boolean): Unit = gtk_entry_set_visibility(
    this.raw.asInstanceOf,
    gboolean(gint((if visible == true then 1 else 0)))
  )

  def unsetInvisibleChar(): Unit = gtk_entry_unset_invisible_char(
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
end Entry

object Entry:
  def apply(): Entry = new Entry(gtk_entry_new().asInstanceOf)
  def withBuffer(buffer: EntryBuffer): Entry = new Entry(
    gtk_entry_new_with_buffer(
      buffer.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )
end Entry
