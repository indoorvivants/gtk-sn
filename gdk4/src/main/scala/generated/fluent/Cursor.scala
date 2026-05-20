package sn.gnome.gdk4

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gdk4.{Cursor, Texture}
import sn.gnome.gdk4.internal.GdkCursor
import sn.gnome.gobject.Object
import sn.gnome.gobject.runtime.*

/** `GdkCursor` is used to create and destroy cursors.
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
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class Cursor private[gnome] (raw: Ptr[GdkCursor])
    extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Returns the fallback for this @cursor.
    *
    * The fallback will be used if this cursor is not available on a given
    * `GdkDisplay`. For named cursors, this can happen when using nonstandard
    * names or when using an incomplete cursor theme. For textured cursors, this
    * can happen when the texture is too large or when the `GdkDisplay` it is
    * used on does not support textured cursors.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getFallback()(using Runtime): sn.gnome.gdk4.Cursor /* None */ =
    sn.gnome.gdk4.Cursor.applyUnsafe(
      gdk_cursor_get_fallback(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkCursor]]
      ).asInstanceOf
    )
  end getFallback

  /** Returns the horizontal offset of the hotspot.
    *
    * The hotspot indicates the pixel that will be directly above the cursor.
    *
    * Note that named cursors may have a nonzero hotspot, but this function will
    * only return the hotspot position for cursors created with
    * [ctor@Gdk.Cursor.new_from_texture].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getHotspotX(): Int /* None */ =
    gdk_cursor_get_hotspot_x(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkCursor]]
    )
  end getHotspotX

  /** Returns the vertical offset of the hotspot.
    *
    * The hotspot indicates the pixel that will be directly above the cursor.
    *
    * Note that named cursors may have a nonzero hotspot, but this function will
    * only return the hotspot position for cursors created with
    * [ctor@Gdk.Cursor.new_from_texture].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getHotspotY(): Int /* None */ =
    gdk_cursor_get_hotspot_y(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkCursor]]
    )
  end getHotspotY

  /** Returns the name of the cursor.
    *
    * If the cursor is not a named cursor, %NULL will be returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getName(): scala.Predef.String /* None */ =
    fromCString(
      gdk_cursor_get_name(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkCursor]]
      ).asInstanceOf
    )
  end getName

  /** Returns the texture for the cursor.
    *
    * If the cursor is a named cursor, %NULL will be returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getTexture()(using Runtime): sn.gnome.gdk4.Texture /* None */ =
    sn.gnome.gdk4.Texture.applyUnsafe(
      gdk_cursor_get_texture(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkCursor]]
      ).asInstanceOf
    )
  end getTexture

end Cursor

object Cursor:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GdkCursor])(using Runtime) = summon[Runtime]
    .getOrCreate[Cursor](ptr.asInstanceOf[Ptr[Byte]], p => new Cursor(ptr))

  /** Creates a new cursor by looking up @name in the current cursor theme.
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def fromName(
      name: scala.Predef.String /* Some(CString) */,
      fallback: Option[sn.gnome.gdk4.Cursor /* Some(Ptr[GdkCursor]) */ ]
  )(using Runtime): Cursor =
    val raw: Ptr[Byte] = gdk_cursor_new_from_name(
      summon[Runtime].inZone(toCString(name)),
      fallback
        .map[Ptr[GdkCursor]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GdkCursor]])
    ).asInstanceOf
    summon[Runtime]
      .getOrCreate[Cursor](raw, r => Cursor.applyUnsafe(r.asInstanceOf))
  end fromName

  /** Creates a new cursor from a `GdkTexture`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def fromTexture(
      texture: sn.gnome.gdk4.Texture /* Some(Ptr[GdkTexture]) */,
      hotspot_x: Int /* Some(CInt) */,
      hotspot_y: Int /* Some(CInt) */,
      fallback: Option[sn.gnome.gdk4.Cursor /* Some(Ptr[GdkCursor]) */ ]
  )(using Runtime): Cursor =
    val raw: Ptr[Byte] = gdk_cursor_new_from_texture(
      texture.getUnsafeRawPointer().asInstanceOf,
      hotspot_x,
      hotspot_y,
      fallback
        .map[Ptr[GdkCursor]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GdkCursor]])
    ).asInstanceOf
    summon[Runtime]
      .getOrCreate[Cursor](raw, r => Cursor.applyUnsafe(r.asInstanceOf))
  end fromTexture
end Cursor
