package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.fluent.MenuModel
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.guint
import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkJustification
import sn.gnome.gtk4.internal.GtkLabel
import sn.gnome.gtk4.internal.GtkNaturalWrapMode
import sn.gnome.pango.fluent.Layout
import sn.gnome.pango.internal.PangoAttrList
import sn.gnome.pango.internal.PangoEllipsizeMode
import sn.gnome.pango.internal.PangoTabArray
import sn.gnome.pango.internal.PangoWrapMode

class Label(raw: Ptr[GtkLabel])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getAttributes(): Ptr[PangoAttrList] = gtk_label_get_attributes(
    this.raw.asInstanceOf
  )

  def getCurrentUri()(using Zone): String = fromCString(
    gtk_label_get_current_uri(this.raw.asInstanceOf).asInstanceOf
  )

  def getEllipsize(): PangoEllipsizeMode = gtk_label_get_ellipsize(
    this.raw.asInstanceOf
  )

  def getExtraMenu(): MenuModel = new MenuModel(
    gtk_label_get_extra_menu(this.raw.asInstanceOf).asInstanceOf
  )

  def getJustify(): GtkJustification = gtk_label_get_justify(
    this.raw.asInstanceOf
  )

  def getLabel()(using Zone): String = fromCString(
    gtk_label_get_label(this.raw.asInstanceOf).asInstanceOf
  )

  def getLayout(): Layout = new Layout(
    gtk_label_get_layout(this.raw.asInstanceOf).asInstanceOf
  )

  // Method get_layout_offsets contains an OUT parameter, which is not supported yet

  def getLines(): Int = gtk_label_get_lines(this.raw.asInstanceOf)

  def getMaxWidthChars(): Int = gtk_label_get_max_width_chars(
    this.raw.asInstanceOf
  )

  def getMnemonicKeyval(): UInt = gtk_label_get_mnemonic_keyval(
    this.raw.asInstanceOf
  ).value

  def getMnemonicWidget(): Widget = new Widget(
    gtk_label_get_mnemonic_widget(this.raw.asInstanceOf).asInstanceOf
  )

  def getNaturalWrapMode(): GtkNaturalWrapMode =
    gtk_label_get_natural_wrap_mode(this.raw.asInstanceOf)

  def getSelectable(): Boolean =
    gtk_label_get_selectable(this.raw.asInstanceOf).value.!=(0)

  // Method get_selection_bounds contains an OUT parameter, which is not supported yet

  def getSingleLineMode(): Boolean =
    gtk_label_get_single_line_mode(this.raw.asInstanceOf).value.!=(0)

  def getTabs(): Ptr[PangoTabArray] = gtk_label_get_tabs(this.raw.asInstanceOf)

  def getText()(using Zone): String = fromCString(
    gtk_label_get_text(this.raw.asInstanceOf).asInstanceOf
  )

  def getUseMarkup(): Boolean =
    gtk_label_get_use_markup(this.raw.asInstanceOf).value.!=(0)

  def getUseUnderline(): Boolean =
    gtk_label_get_use_underline(this.raw.asInstanceOf).value.!=(0)

  def getWidthChars(): Int = gtk_label_get_width_chars(this.raw.asInstanceOf)

  def getWrap(): Boolean = gtk_label_get_wrap(this.raw.asInstanceOf).value.!=(0)

  def getWrapMode(): PangoWrapMode = gtk_label_get_wrap_mode(
    this.raw.asInstanceOf
  )

  def getXalign(): Float = gtk_label_get_xalign(this.raw.asInstanceOf)

  def getYalign(): Float = gtk_label_get_yalign(this.raw.asInstanceOf)

  def selectRegion(start_offset: Int, end_offset: Int): Unit =
    gtk_label_select_region(this.raw.asInstanceOf, start_offset, end_offset)

  def setAttributes(attrs: Ptr[PangoAttrList]): Unit =
    gtk_label_set_attributes(this.raw.asInstanceOf, attrs)

  def setEllipsize(mode: PangoEllipsizeMode): Unit =
    gtk_label_set_ellipsize(this.raw.asInstanceOf, mode)

  def setExtraMenu(model: MenuModel): Unit = gtk_label_set_extra_menu(
    this.raw.asInstanceOf,
    model.getUnsafeRawPointer().asInstanceOf
  )

  def setJustify(jtype: GtkJustification): Unit =
    gtk_label_set_justify(this.raw.asInstanceOf, jtype)

  def setLabel(str: String | CString)(using Zone): Unit =
    gtk_label_set_label(this.raw.asInstanceOf, __sn_extract_string(str))

  def setLines(lines: Int): Unit =
    gtk_label_set_lines(this.raw.asInstanceOf, lines)

  def setMarkup(str: String | CString)(using Zone): Unit =
    gtk_label_set_markup(this.raw.asInstanceOf, __sn_extract_string(str))

  def setMarkupWithMnemonic(str: String | CString)(using Zone): Unit =
    gtk_label_set_markup_with_mnemonic(
      this.raw.asInstanceOf,
      __sn_extract_string(str)
    )

  def setMaxWidthChars(n_chars: Int): Unit =
    gtk_label_set_max_width_chars(this.raw.asInstanceOf, n_chars)

  def setMnemonicWidget(widget: Widget): Unit = gtk_label_set_mnemonic_widget(
    this.raw.asInstanceOf,
    widget.getUnsafeRawPointer().asInstanceOf
  )

  def setNaturalWrapMode(wrap_mode: GtkNaturalWrapMode): Unit =
    gtk_label_set_natural_wrap_mode(this.raw.asInstanceOf, wrap_mode)

  def setSelectable(setting: Boolean): Unit = gtk_label_set_selectable(
    this.raw.asInstanceOf,
    gboolean(gint((if setting == true then 1 else 0)))
  )

  def setSingleLineMode(single_line_mode: Boolean): Unit =
    gtk_label_set_single_line_mode(
      this.raw.asInstanceOf,
      gboolean(gint((if single_line_mode == true then 1 else 0)))
    )

  def setTabs(tabs: Ptr[PangoTabArray]): Unit =
    gtk_label_set_tabs(this.raw.asInstanceOf, tabs)

  def setText(str: String | CString)(using Zone): Unit =
    gtk_label_set_text(this.raw.asInstanceOf, __sn_extract_string(str))

  def setTextWithMnemonic(str: String | CString)(using Zone): Unit =
    gtk_label_set_text_with_mnemonic(
      this.raw.asInstanceOf,
      __sn_extract_string(str)
    )

  def setUseMarkup(setting: Boolean): Unit = gtk_label_set_use_markup(
    this.raw.asInstanceOf,
    gboolean(gint((if setting == true then 1 else 0)))
  )

  def setUseUnderline(setting: Boolean): Unit = gtk_label_set_use_underline(
    this.raw.asInstanceOf,
    gboolean(gint((if setting == true then 1 else 0)))
  )

  def setWidthChars(n_chars: Int): Unit =
    gtk_label_set_width_chars(this.raw.asInstanceOf, n_chars)

  def setWrap(wrap: Boolean): Unit = gtk_label_set_wrap(
    this.raw.asInstanceOf,
    gboolean(gint((if wrap == true then 1 else 0)))
  )

  def setWrapMode(wrap_mode: PangoWrapMode): Unit =
    gtk_label_set_wrap_mode(this.raw.asInstanceOf, wrap_mode)

  def setXalign(xalign: Float): Unit =
    gtk_label_set_xalign(this.raw.asInstanceOf, xalign.asInstanceOf)

  def setYalign(yalign: Float): Unit =
    gtk_label_set_yalign(this.raw.asInstanceOf, yalign.asInstanceOf)

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end Label

object Label:
  def apply(str: String | CString)(using Zone): Label = new Label(
    gtk_label_new(__sn_extract_string(str)).asInstanceOf
  )
  def withMnemonic(str: String | CString)(using Zone): Label = new Label(
    gtk_label_new_with_mnemonic(__sn_extract_string(str)).asInstanceOf
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end Label
