package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.fluent.Cursor
import sn.gnome.gdk4.fluent.Texture
import sn.gnome.gdk4.internal.GdkCursor
import sn.gnome.gobject.fluent.Object

class Cursor(raw: Ptr[GdkCursor]) extends Object(raw.asInstanceOf):
  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  def getFallback(): Cursor = new Cursor(
    gdk_cursor_get_fallback(this.raw.asInstanceOf).asInstanceOf
  )

  def getHotspotX(): Int = gdk_cursor_get_hotspot_x(this.raw.asInstanceOf)

  def getHotspotY(): Int = gdk_cursor_get_hotspot_y(this.raw.asInstanceOf)

  def getName()(using Zone): String = fromCString(
    gdk_cursor_get_name(this.raw.asInstanceOf).asInstanceOf
  )

  def getTexture(): Texture = new Texture(
    gdk_cursor_get_texture(this.raw.asInstanceOf).asInstanceOf
  )

end Cursor

object Cursor:
  def fromName(name: String | CString, fallback: Cursor)(using Zone): Cursor =
    new Cursor(
      gdk_cursor_new_from_name(
        __sn_extract_string(name),
        fallback.getUnsafeRawPointer().asInstanceOf
      ).asInstanceOf
    )
  def fromTexture(
      texture: Texture,
      hotspot_x: Int,
      hotspot_y: Int,
      fallback: Cursor
  ): Cursor = new Cursor(
    gdk_cursor_new_from_texture(
      texture.getUnsafeRawPointer().asInstanceOf,
      hotspot_x,
      hotspot_y,
      fallback.getUnsafeRawPointer().asInstanceOf
    ).asInstanceOf
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end Cursor
