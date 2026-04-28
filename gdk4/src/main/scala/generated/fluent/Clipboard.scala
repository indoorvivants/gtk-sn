package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.fluent.ContentProvider
import sn.gnome.gdk4.fluent.Display
import sn.gnome.gdk4.fluent.Texture
import sn.gnome.gdk4.internal.GdkClipboard
import sn.gnome.gdk4.internal.GdkContentFormats
import sn.gnome.gio.fluent.AsyncResult
import sn.gnome.gio.fluent.Cancellable
import sn.gnome.gio.internal.GAsyncReadyCallback
import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.gboolean
import sn.gnome.glib.internal.gint
import sn.gnome.glib.internal.gpointer
import sn.gnome.gobject.fluent.Object
import sn.gnome.gobject.internal.GType
import sn.gnome.gobject.internal.GValue

class Clipboard(raw: Ptr[GdkClipboard]) extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getContent(): ContentProvider = new ContentProvider(
    gdk_clipboard_get_content(this.raw.asInstanceOf).asInstanceOf
  )

  def getDisplay(): Display = new Display(
    gdk_clipboard_get_display(this.raw.asInstanceOf).asInstanceOf
  )

  def getFormats(): Ptr[GdkContentFormats] = gdk_clipboard_get_formats(
    this.raw.asInstanceOf
  )

  def isLocal(): Boolean =
    gdk_clipboard_is_local(this.raw.asInstanceOf).value.!=(0)

  // Method read_async contains an array parameter, which is not supported yet

  // Method read_finish contains an OUT parameter, which is not supported yet

  def readTextAsync(
      cancellable: Cancellable,
      callback: GAsyncReadyCallback,
      user_data: Ptr[Byte]
  ): Unit = gdk_clipboard_read_text_async(
    this.raw.asInstanceOf,
    cancellable.getUnsafeRawPointer().asInstanceOf,
    callback,
    gpointer(user_data)
  )

  def readTextFinish(result: AsyncResult)(using Zone): GResult[String] =
    GResult.wrap(__errorPtr =>
      fromCString(
        gdk_clipboard_read_text_finish(
          this.raw.asInstanceOf,
          result.getUnsafeRawPointer().asInstanceOf,
          __errorPtr
        ).asInstanceOf
      )
    )

  def readTextureAsync(
      cancellable: Cancellable,
      callback: GAsyncReadyCallback,
      user_data: Ptr[Byte]
  ): Unit = gdk_clipboard_read_texture_async(
    this.raw.asInstanceOf,
    cancellable.getUnsafeRawPointer().asInstanceOf,
    callback,
    gpointer(user_data)
  )

  def readTextureFinish(result: AsyncResult): GResult[Texture] =
    GResult.wrap(__errorPtr =>
      new Texture(
        gdk_clipboard_read_texture_finish(
          this.raw.asInstanceOf,
          result.getUnsafeRawPointer().asInstanceOf,
          __errorPtr
        ).asInstanceOf
      )
    )

  def readValueAsync(
      `type`: GType,
      io_priority: Int,
      cancellable: Cancellable,
      callback: GAsyncReadyCallback,
      user_data: Ptr[Byte]
  ): Unit = gdk_clipboard_read_value_async(
    this.raw.asInstanceOf,
    `type`,
    io_priority,
    cancellable.getUnsafeRawPointer().asInstanceOf,
    callback,
    gpointer(user_data)
  )

  def readValueFinish(result: AsyncResult): GResult[Ptr[GValue]] =
    GResult.wrap(__errorPtr =>
      gdk_clipboard_read_value_finish(
        this.raw.asInstanceOf,
        result.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      )
    )

  inline def set(`type`: GType, args: Any*): Unit =
    gdk_clipboard_set(this.raw.asInstanceOf, `type`, args*)

  def setContent(provider: ContentProvider): Boolean =
    gdk_clipboard_set_content(
      this.raw.asInstanceOf,
      provider.getUnsafeRawPointer().asInstanceOf
    ).value.!=(0)

  def setText(text: String | CString)(using Zone): Unit =
    gdk_clipboard_set_text(this.raw.asInstanceOf, __sn_extract_string(text))

  def setTexture(texture: Texture): Unit = gdk_clipboard_set_texture(
    this.raw.asInstanceOf,
    texture.getUnsafeRawPointer().asInstanceOf
  )

  def setValist(`type`: GType, args: CVarArgList): Unit =
    gdk_clipboard_set_valist(this.raw.asInstanceOf, `type`, args)

  def setValue(value: Ptr[GValue]): Unit =
    gdk_clipboard_set_value(this.raw.asInstanceOf, value)

  def storeAsync(
      io_priority: Int,
      cancellable: Cancellable,
      callback: GAsyncReadyCallback,
      user_data: Ptr[Byte]
  ): Unit = gdk_clipboard_store_async(
    this.raw.asInstanceOf,
    io_priority,
    cancellable.getUnsafeRawPointer().asInstanceOf,
    callback,
    gpointer(user_data)
  )

  def storeFinish(result: AsyncResult): GResult[Boolean] =
    GResult.wrap(__errorPtr =>
      gdk_clipboard_store_finish(
        this.raw.asInstanceOf,
        result.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value.!=(0)
    )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end Clipboard
