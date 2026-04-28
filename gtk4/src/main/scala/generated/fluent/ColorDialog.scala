package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.internal.GdkRGBA
import sn.gnome.gio.fluent.AsyncResult
import sn.gnome.gio.fluent.Cancellable
import sn.gnome.gio.internal.GAsyncReadyCallback
import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.gpointer
import sn.gnome.gobject.fluent.Object
import sn.gnome.gtk4.fluent.Window
import sn.gnome.gtk4.internal.GtkColorDialog

class ColorDialog(raw: Ptr[GtkColorDialog]) extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def chooseRgba(
      parent: Window,
      initial_color: Ptr[GdkRGBA],
      cancellable: Cancellable,
      callback: GAsyncReadyCallback,
      user_data: Ptr[Byte]
  ): Unit = gtk_color_dialog_choose_rgba(
    this.raw.asInstanceOf,
    parent.getUnsafeRawPointer().asInstanceOf,
    initial_color,
    cancellable.getUnsafeRawPointer().asInstanceOf,
    callback,
    gpointer(user_data)
  )

  def chooseRgbaFinish(result: AsyncResult): GResult[Ptr[GdkRGBA]] =
    GResult.wrap(__errorPtr =>
      gtk_color_dialog_choose_rgba_finish(
        this.raw.asInstanceOf,
        result.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      )
    )

  def getModal(): Boolean =
    gtk_color_dialog_get_modal(this.raw.asInstanceOf).value.!=(0)

  def getTitle()(using Zone): String = fromCString(
    gtk_color_dialog_get_title(this.raw.asInstanceOf).asInstanceOf
  )

  def getWithAlpha(): Boolean =
    gtk_color_dialog_get_with_alpha(this.raw.asInstanceOf).value.!=(0)

  def setModal(modal: Boolean): Unit = gtk_color_dialog_set_modal(
    this.raw.asInstanceOf,
    gboolean(gint((if modal == true then 1 else 0)))
  )

  def setTitle(title: String | CString)(using Zone): Unit =
    gtk_color_dialog_set_title(
      this.raw.asInstanceOf,
      __sn_extract_string(title)
    )

  def setWithAlpha(with_alpha: Boolean): Unit = gtk_color_dialog_set_with_alpha(
    this.raw.asInstanceOf,
    gboolean(gint((if with_alpha == true then 1 else 0)))
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end ColorDialog

object ColorDialog:
  def apply(): ColorDialog = new ColorDialog(
    gtk_color_dialog_new().asInstanceOf
  )
end ColorDialog
