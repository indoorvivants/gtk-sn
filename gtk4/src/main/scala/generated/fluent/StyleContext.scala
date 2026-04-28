package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gdk4.fluent.Display
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.guint
import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.fluent.StyleProvider
import sn.gnome.gtk4.internal.GtkStateFlags
import sn.gnome.gtk4.internal.GtkStyleContext
import sn.gnome.gtk4.internal.GtkStyleContextPrintFlags

class StyleContext(raw: Ptr[GtkStyleContext]) extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def addClass(class_name: String | CString)(using Zone): Unit =
    gtk_style_context_add_class(
      this.raw.asInstanceOf,
      __sn_extract_string(class_name)
    )

  def addProvider(provider: StyleProvider, priority: UInt): Unit =
    gtk_style_context_add_provider(
      this.raw.asInstanceOf,
      provider.getUnsafeRawPointer().asInstanceOf,
      guint(priority)
    )

  // Method get_border contains an OUT parameter, which is not supported yet

  // Method get_color contains an OUT parameter, which is not supported yet

  def getDisplay(): Display = new Display(
    gtk_style_context_get_display(this.raw.asInstanceOf).asInstanceOf
  )

  // Method get_margin contains an OUT parameter, which is not supported yet

  // Method get_padding contains an OUT parameter, which is not supported yet

  def getScale(): Int = gtk_style_context_get_scale(this.raw.asInstanceOf)

  def getState(): GtkStateFlags = gtk_style_context_get_state(
    this.raw.asInstanceOf
  )

  def hasClass(class_name: String | CString)(using Zone): Boolean =
    gtk_style_context_has_class(
      this.raw.asInstanceOf,
      __sn_extract_string(class_name)
    ).value.!=(0)

  // Method lookup_color contains an OUT parameter, which is not supported yet

  def removeClass(class_name: String | CString)(using Zone): Unit =
    gtk_style_context_remove_class(
      this.raw.asInstanceOf,
      __sn_extract_string(class_name)
    )

  def removeProvider(provider: StyleProvider): Unit =
    gtk_style_context_remove_provider(
      this.raw.asInstanceOf,
      provider.getUnsafeRawPointer().asInstanceOf
    )

  def restore(): Unit = gtk_style_context_restore(this.raw.asInstanceOf)

  def save(): Unit = gtk_style_context_save(this.raw.asInstanceOf)

  def setDisplay(display: Display): Unit = gtk_style_context_set_display(
    this.raw.asInstanceOf,
    display.getUnsafeRawPointer().asInstanceOf
  )

  def setScale(scale: Int): Unit =
    gtk_style_context_set_scale(this.raw.asInstanceOf, scale)

  def setState(flags: GtkStateFlags): Unit =
    gtk_style_context_set_state(this.raw.asInstanceOf, flags)

  def toString(flags: GtkStyleContextPrintFlags)(using Zone): String =
    fromCString(
      gtk_style_context_to_string(this.raw.asInstanceOf, flags).asInstanceOf
    )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end StyleContext
