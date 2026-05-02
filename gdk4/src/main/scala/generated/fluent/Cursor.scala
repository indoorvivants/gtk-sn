package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.fluent.Cursor
import sn.gnome.gdk4.fluent.Texture
import sn.gnome.gdk4.internal.GdkCursor
import sn.gnome.gobject.fluent.Object

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GdkCursor` is used to create and destroy cursors.
  *
  * Cursors are immutable objects, so once you created them, there is no way to
  * modify them later. You should create a new cursor when you want to change
  * something about it.
  *
  * Cursors by themselves are not very interesting: they must be bound to a
  * window for users to see them. This is done with
  * [method@Gdk.Surface.set_cursor] or [method@Gdk.Surface.set_device_cursor].
  * Applications will typically use higher-level GTK functions such as
  * [method@Gtk.Widget.set_cursor] instead.
  *
  * Cursors are not bound to a given [class@Gdk.Display], so they can be shared.
  * However, the appearance of cursors may vary when used on different
  * platforms.
  *
  * ## Named and texture cursors
  *
  * There are multiple ways to create cursors. The platform's own cursors can be
  * created with [ctor@Gdk.Cursor.new_from_name]. That function lists the
  * commonly available names that are shared with the CSS specification. Other
  * names may be available, depending on the platform in use. On some platforms,
  * what images are used for named cursors may be influenced by the cursor
  * theme.
  *
  * Another option to create a cursor is to use
  * [ctor@Gdk.Cursor.new_from_texture] and provide an image to use for the
  * cursor.
  *
  * To ease work with unsupported cursors, a fallback cursor can be provided. If
  * a [class@Gdk.Surface] cannot use a cursor because of the reasons mentioned
  * above, it will try the fallback cursor. Fallback cursors can themselves have
  * fallback cursors again, so it is possible to provide a chain of
  * progressively easier to support cursors. If none of the provided cursors can
  * be supported, the default cursor will be the ultimate fallback.
  */
class Cursor(raw: Ptr[GdkCursor]) extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the fallback for this @cursor.
    *
    * The fallback will be used if this cursor is not available on a given
    * `GdkDisplay`. For named cursors, this can happen when using nonstandard
    * names or when using an incomplete cursor theme. For textured cursors, this
    * can happen when the texture is too large or when the `GdkDisplay` it is
    * used on does not support textured cursors.
    */
  def getFallback(): Cursor /* None */ = new Cursor(
    gdk_cursor_get_fallback(this.raw.asInstanceOf[Ptr[GdkCursor]]).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the horizontal offset of the hotspot.
    *
    * The hotspot indicates the pixel that will be directly above the cursor.
    *
    * Note that named cursors may have a nonzero hotspot, but this function will
    * only return the hotspot position for cursors created with
    * [ctor@Gdk.Cursor.new_from_texture].
    */
  def getHotspotX(): Int /* None */ = gdk_cursor_get_hotspot_x(
    this.raw.asInstanceOf[Ptr[GdkCursor]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the vertical offset of the hotspot.
    *
    * The hotspot indicates the pixel that will be directly above the cursor.
    *
    * Note that named cursors may have a nonzero hotspot, but this function will
    * only return the hotspot position for cursors created with
    * [ctor@Gdk.Cursor.new_from_texture].
    */
  def getHotspotY(): Int /* None */ = gdk_cursor_get_hotspot_y(
    this.raw.asInstanceOf[Ptr[GdkCursor]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the name of the cursor.
    *
    * If the cursor is not a named cursor, %NULL will be returned.
    */
  def getName()(using Zone): String /* None */ = fromCString(
    gdk_cursor_get_name(this.raw.asInstanceOf[Ptr[GdkCursor]]).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the texture for the cursor.
    *
    * If the cursor is a named cursor, %NULL will be returned.
    */
  def getTexture(): Texture /* None */ = new Texture(
    gdk_cursor_get_texture(this.raw.asInstanceOf[Ptr[GdkCursor]]).asInstanceOf
  )

end Cursor

object Cursor:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new cursor by looking up @name in the current cursor theme.
    *
    * A recommended set of cursor names that will work across different
    * platforms can be found in the CSS specification:
    *
    * |                                             |                                       |                                               |                                           |
    * |:--------------------------------------------|:--------------------------------------|:----------------------------------------------|:------------------------------------------|
    * | "none"                                      | ![](default_cursor.png) "default"     | ![](help_cursor.png) "help"                   | ![](pointer_cursor.png) "pointer"         |
    * | ![](context_menu_cursor.png) "context-menu" | ![](progress_cursor.png) "progress"   | ![](wait_cursor.png) "wait"                   | ![](cell_cursor.png) "cell"               |
    * | ![](crosshair_cursor.png) "crosshair"       | ![](text_cursor.png) "text"           | ![](vertical_text_cursor.png) "vertical-text" | ![](alias_cursor.png) "alias"             |
    * | ![](copy_cursor.png) "copy"                 | ![](no_drop_cursor.png) "no-drop"     | ![](move_cursor.png) "move"                   | ![](not_allowed_cursor.png) "not-allowed" |
    * | ![](grab_cursor.png) "grab"                 | ![](grabbing_cursor.png) "grabbing"   | ![](all_scroll_cursor.png) "all-scroll"       | ![](col_resize_cursor.png) "col-resize"   |
    * | ![](row_resize_cursor.png) "row-resize"     | ![](n_resize_cursor.png) "n-resize"   | ![](e_resize_cursor.png) "e-resize"           | ![](s_resize_cursor.png) "s-resize"       |
    * | ![](w_resize_cursor.png) "w-resize"         | ![](ne_resize_cursor.png) "ne-resize" | ![](nw_resize_cursor.png) "nw-resize"         | ![](sw_resize_cursor.png) "sw-resize"     |
    * | ![](se_resize_cursor.png) "se-resize"       | ![](ew_resize_cursor.png) "ew-resize" | ![](ns_resize_cursor.png) "ns-resize"         | ![](nesw_resize_cursor.png) "nesw-resize" |
    * | ![](nwse_resize_cursor.png) "nwse-resize"   | ![](zoom_in_cursor.png) "zoom-in"     | ![](zoom_out_cursor.png) "zoom-out"           |                                           |
    */
  def fromName(
      name: String | CString /* Some(CString) */,
      fallback: Option[Cursor /* Some(Ptr[GdkCursor]) */ ]
  )(using Zone): Cursor = new Cursor(
    gdk_cursor_new_from_name(
      __sn_extract_string(name),
      fallback
        .map[Ptr[GdkCursor]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GdkCursor]])
    ).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new cursor from a `GdkTexture`.
    */
  def fromTexture(
      texture: Texture /* Some(Ptr[GdkTexture]) */,
      hotspot_x: Int /* Some(CInt) */,
      hotspot_y: Int /* Some(CInt) */,
      fallback: Option[Cursor /* Some(Ptr[GdkCursor]) */ ]
  ): Cursor = new Cursor(
    gdk_cursor_new_from_texture(
      texture.getUnsafeRawPointer().asInstanceOf,
      hotspot_x,
      hotspot_y,
      fallback
        .map[Ptr[GdkCursor]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GdkCursor]])
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
