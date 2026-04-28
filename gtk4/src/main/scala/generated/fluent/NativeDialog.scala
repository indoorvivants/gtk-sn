package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.fluent.Window
import sn.gnome.gtk4.internal.GtkNativeDialog

class NativeDialog(raw: Ptr[GtkNativeDialog]) extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def destroy(): Unit = gtk_native_dialog_destroy(this.raw.asInstanceOf)

  def getModal(): Boolean =
    gtk_native_dialog_get_modal(this.raw.asInstanceOf).value.!=(0)

  def getTitle()(using Zone): String = fromCString(
    gtk_native_dialog_get_title(this.raw.asInstanceOf).asInstanceOf
  )

  def getTransientFor(): Window = new Window(
    gtk_native_dialog_get_transient_for(this.raw.asInstanceOf).asInstanceOf
  )

  def getVisible(): Boolean =
    gtk_native_dialog_get_visible(this.raw.asInstanceOf).value.!=(0)

  def hide(): Unit = gtk_native_dialog_hide(this.raw.asInstanceOf)

  def setModal(modal: Boolean): Unit = gtk_native_dialog_set_modal(
    this.raw.asInstanceOf,
    gboolean(gint((if modal == true then 1 else 0)))
  )

  def setTitle(title: String | CString)(using Zone): Unit =
    gtk_native_dialog_set_title(
      this.raw.asInstanceOf,
      __sn_extract_string(title)
    )

  def setTransientFor(parent: Window): Unit =
    gtk_native_dialog_set_transient_for(
      this.raw.asInstanceOf,
      parent.getUnsafeRawPointer().asInstanceOf
    )

  def show(): Unit = gtk_native_dialog_show(this.raw.asInstanceOf)

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end NativeDialog
