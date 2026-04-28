package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gtk4.fluent.Accessible
import sn.gnome.gtk4.fluent.Buildable
import sn.gnome.gtk4.fluent.ConstraintTarget
import sn.gnome.gtk4.fluent.Widget
import sn.gnome.gtk4.internal.GtkExpander

class Expander(raw: Ptr[GtkExpander])
    extends Widget(raw.asInstanceOf),
      Accessible,
      Buildable,
      ConstraintTarget:
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getChild(): Widget = new Widget(
    gtk_expander_get_child(this.raw.asInstanceOf).asInstanceOf
  )

  def getExpanded(): Boolean =
    gtk_expander_get_expanded(this.raw.asInstanceOf).value.!=(0)

  def getLabel()(using Zone): String = fromCString(
    gtk_expander_get_label(this.raw.asInstanceOf).asInstanceOf
  )

  def getLabelWidget(): Widget = new Widget(
    gtk_expander_get_label_widget(this.raw.asInstanceOf).asInstanceOf
  )

  def getResizeToplevel(): Boolean =
    gtk_expander_get_resize_toplevel(this.raw.asInstanceOf).value.!=(0)

  def getUseMarkup(): Boolean =
    gtk_expander_get_use_markup(this.raw.asInstanceOf).value.!=(0)

  def getUseUnderline(): Boolean =
    gtk_expander_get_use_underline(this.raw.asInstanceOf).value.!=(0)

  def setChild(child: Widget): Unit = gtk_expander_set_child(
    this.raw.asInstanceOf,
    child.getUnsafeRawPointer().asInstanceOf
  )

  def setExpanded(expanded: Boolean): Unit = gtk_expander_set_expanded(
    this.raw.asInstanceOf,
    gboolean(gint((if expanded == true then 1 else 0)))
  )

  def setLabel(label: String | CString)(using Zone): Unit =
    gtk_expander_set_label(this.raw.asInstanceOf, __sn_extract_string(label))

  def setLabelWidget(label_widget: Widget): Unit =
    gtk_expander_set_label_widget(
      this.raw.asInstanceOf,
      label_widget.getUnsafeRawPointer().asInstanceOf
    )

  def setResizeToplevel(resize_toplevel: Boolean): Unit =
    gtk_expander_set_resize_toplevel(
      this.raw.asInstanceOf,
      gboolean(gint((if resize_toplevel == true then 1 else 0)))
    )

  def setUseMarkup(use_markup: Boolean): Unit = gtk_expander_set_use_markup(
    this.raw.asInstanceOf,
    gboolean(gint((if use_markup == true then 1 else 0)))
  )

  def setUseUnderline(use_underline: Boolean): Unit =
    gtk_expander_set_use_underline(
      this.raw.asInstanceOf,
      gboolean(gint((if use_underline == true then 1 else 0)))
    )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end Expander

object Expander:
  def apply(label: String | CString)(using Zone): Expander = new Expander(
    gtk_expander_new(__sn_extract_string(label)).asInstanceOf
  )
  def withMnemonic(label: String | CString)(using Zone): Expander =
    new Expander(
      gtk_expander_new_with_mnemonic(__sn_extract_string(label)).asInstanceOf
    )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end Expander
