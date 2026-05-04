package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gdk4.fluent.{DragAction, Paintable, Texture}
import sn.gnome.gdkpixbuf.fluent.Pixbuf
import sn.gnome.gio.fluent.AsyncResult
import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.{gboolean, gint, guint, guint32}
import sn.gnome.gobject.internal.GType

object Gdk:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The main way to not draw GL content in GTK.
    *
    * It takes a render buffer ID (@source_type == GL_RENDERBUFFER) or a texture
    * id (@source_type == GL_TEXTURE) and draws it onto @cr with an OVER
    * operation, respecting the current clip. The top left corner of the
    * rectangle specified by @x, @y, @width and @height will be drawn at the
    * current (0,0) position of the `cairo_t`.
    *
    * This will work for *all* `cairo_t`, as long as @surface is realized, but
    * the fallback implementation that reads back the pixels from the buffer may
    * be used in the general case. In the case of direct drawing to a surface
    * with no special effects applied to @cr it will however use a more
    * efficient approach.
    *
    * For GL_RENDERBUFFER the code will always fall back to software for buffers
    * with alpha components, so make sure you use GL_TEXTURE if using alpha.
    *
    * Calling this may change the current GL context.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(cairo.Context), @type -> DataRecord(cairo_t*)))"
  )
  def cairoDrawFromGl() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Adds the given rectangle to the current path of @cr.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(cairo.Context), @type -> DataRecord(cairo_t*)))"
  )
  def cairoRectangle() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Adds the given region to the current path of @cr.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(cairo.Context), @type -> DataRecord(cairo_t*)))"
  )
  def cairoRegion() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates region that covers the area where the given
    * @surface
    *   is more than 50% opaque.
    *
    * This function takes into account device offsets that might be set with
    * cairo_surface_set_device_offset().
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(cairo.Surface), @type -> DataRecord(cairo_surface_t*)))"
  )
  def cairoRegionCreateFromSurface() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the given pixbuf as the source pattern for @cr.
    *
    * The pattern has an extend mode of %CAIRO_EXTEND_NONE and is aligned so
    * that the origin of @pixbuf is @pixbuf_x, @pixbuf_y.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(cairo.Context), @type -> DataRecord(cairo_t*)))"
  )
  def cairoSetSourcePixbuf() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets the specified `GdkRGBA` as the source color of @cr.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(cairo.Context), @type -> DataRecord(cairo_t*)))"
  )
  def cairoSetSourceRgba() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Read content from the given input stream and deserialize it,
    * asynchronously.
    *
    * The default I/O priority is %G_PRIORITY_DEFAULT (i.e. 0), and lower
    * numbers indicate a higher priority.
    *
    * When the operation is finished, @callback will be called. You must then
    * call [func@Gdk.content_deserialize_finish] to get the result of the
    * operation.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Gio.AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  def contentDeserializeAsync() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Finishes a content deserialization operation.
    */
  @annotation.compileTimeOnly(
    "Function content_deserialize_finish contains an OUT parameter, which is not supported yet"
  )
  def contentDeserializeFinish() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Parses the given @string into `GdkContentFormats` and returns the formats.
    *
    * Strings printed via [method@Gdk.ContentFormats.to_string] can be read in
    * again successfully using this function.
    *
    * If @string does not describe valid content formats, %NULL is returned.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(ContentFormats), @type -> DataRecord(GdkContentFormats*)))"
  )
  def contentFormatsParse() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Registers a function to deserialize object of a given type.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(ContentDeserializeFunc), @type -> DataRecord(GdkContentDeserializeFunc)))"
  )
  def contentRegisterDeserializer() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Registers a function to serialize objects of a given type.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(ContentSerializeFunc), @type -> DataRecord(GdkContentSerializeFunc)))"
  )
  def contentRegisterSerializer() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Serialize content and write it to the given output stream, asynchronously.
    *
    * The default I/O priority is %G_PRIORITY_DEFAULT (i.e. 0), and lower
    * numbers indicate a higher priority.
    *
    * When the operation is finished, @callback will be called. You must then
    * call [func@Gdk.content_serialize_finish] to get the result of the
    * operation.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(GObject.Value), @type -> DataRecord(const GValue*)))"
  )
  def contentSerializeAsync() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Finishes a content serialization operation.
    */
  def contentSerializeFinish(
      result: AsyncResult /* Some(Ptr[_root_.sn.gnome.gio.internal.GAsyncResult]) */
  ): GResult[Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */ ] =
    GResult.wrap(__errorPtr =>
      gdk_content_serialize_finish(
        result.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).value.!=(0)
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Checks if @action represents a single action or includes multiple actions.
    *
    * When @action is 0 - ie no action was given, %TRUE is returned.
    */
  def dragActionIsUnique(
      action: DragAction /* Some(GdkDragAction) */
  ): Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */ =
    gdk_drag_action_is_unique(action.raw).value.!=(0)

  def dragSurfaceSizeGetType()
      : GType /* Some(_root_.sn.gnome.gobject.internal.GType) */ =
    gdk_drag_surface_size_get_type()

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the relative angle from @event1 to @event2.
    *
    * The relative angle is the angle between the X axis and the line through
    * both events' positions. The rotation direction for positive angles is from
    * the positive X axis towards the positive Y axis.
    *
    * This assumes that both events have X/Y information. If not, this function
    * returns %FALSE.
    */
  @annotation.compileTimeOnly(
    "Function events_get_angle contains an OUT parameter, which is not supported yet"
  )
  def eventsGetAngle() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the point halfway between the events' positions.
    *
    * This assumes that both events have X/Y information. If not, this function
    * returns %FALSE.
    */
  @annotation.compileTimeOnly(
    "Function events_get_center contains an OUT parameter, which is not supported yet"
  )
  def eventsGetCenter() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns the distance between the event locations.
    *
    * This assumes that both events have X/Y information. If not, this function
    * returns %FALSE.
    */
  @annotation.compileTimeOnly(
    "Function events_get_distance contains an OUT parameter, which is not supported yet"
  )
  def eventsGetDistance() = ???

  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Quark), @type -> DataRecord(GQuark)))"
  )
  def glErrorQuark() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Canonicalizes the given mime type and interns the result.
    *
    * If @string is not a valid mime type, %NULL is returned instead. See RFC
    * 2048 for the syntax if mime types.
    */
  def internMimeType(
      string: String | CString /* Some(CString) */
  )(using Zone): String /* Some(CString) */ = fromCString(
    gdk_intern_mime_type(__sn_extract_string(string)).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Obtains the upper- and lower-case versions of the keyval @symbol.
    *
    * Examples of keyvals are `GDK_KEY_a`, `GDK_KEY_Enter`, `GDK_KEY_F1`, etc.
    */
  @annotation.compileTimeOnly(
    "Function keyval_convert_case contains an OUT parameter, which is not supported yet"
  )
  def keyvalConvertCase() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Converts a key name to a key value.
    *
    * The names are the same as those in the `gdk/gdkkeysyms.h` header file but
    * without the leading “GDK_KEY_”.
    */
  def keyvalFromName(
      keyval_name: String | CString /* Some(CString) */
  )(using Zone): UInt /* Some(_root_.sn.gnome.glib.internal.guint) */ =
    gdk_keyval_from_name(__sn_extract_string(keyval_name)).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns %TRUE if the given key value is in lower case.
    */
  def keyvalIsLower(
      keyval: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */ =
    gdk_keyval_is_lower(guint(keyval)).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns %TRUE if the given key value is in upper case.
    */
  def keyvalIsUpper(
      keyval: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */ =
    gdk_keyval_is_upper(guint(keyval)).value.!=(0)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Converts a key value into a symbolic name.
    *
    * The names are the same as those in the `gdk/gdkkeysyms.h` header file but
    * without the leading “GDK_KEY_”.
    */
  def keyvalName(
      keyval: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  )(using Zone): String /* Some(CString) */ = fromCString(
    gdk_keyval_name(guint(keyval)).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Converts a key value to lower case, if applicable.
    */
  def keyvalToLower(
      keyval: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): UInt /* Some(_root_.sn.gnome.glib.internal.guint) */ = gdk_keyval_to_lower(
    guint(keyval)
  ).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Convert from a GDK key symbol to the corresponding Unicode character.
    *
    * Note that the conversion does not take the current locale into
    * consideration, which might be expected for particular keyvals, such as
    * %GDK_KEY_KP_Decimal.
    */
  def keyvalToUnicode(
      keyval: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): UInt /* Some(_root_.sn.gnome.glib.internal.guint32) */ =
    gdk_keyval_to_unicode(guint(keyval)).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Converts a key value to upper case, if applicable.
    */
  def keyvalToUpper(
      keyval: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): UInt /* Some(_root_.sn.gnome.glib.internal.guint) */ = gdk_keyval_to_upper(
    guint(keyval)
  ).value

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Returns a paintable that has the given intrinsic size and draws nothing.
    *
    * This is often useful for implementing the
    * [vfunc@Gdk.Paintable.get_current_image] virtual function when the
    * paintable is in an incomplete state (like a [class@Gtk.MediaStream] before
    * receiving the first frame).
    */
  def paintableNewEmpty(
      intrinsic_width: Int /* Some(CInt) */,
      intrinsic_height: Int /* Some(CInt) */
  ): Paintable /* Some(Ptr[GdkPaintable]) */ = new Paintable.Abstract(
    gdk_paintable_new_empty(intrinsic_width, intrinsic_height).asInstanceOf
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Obtains a clip region which contains the areas where the given ranges of
    * text would be drawn.
    *
    * @x_origin
    *   and @y_origin are the top left point to center the layout.
    * @index_ranges
    *   should contain ranges of bytes in the layout’s text.
    *
    * Note that the regions returned correspond to logical extents of the text
    * ranges, not ink extents. So the drawn layout may in fact touch areas out
    * of the clip region. The clip region is mainly useful for highlightling
    * parts of text, such as when text is selected.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(gint), @type -> DataRecord(const int*)))"
  )
  def pangoLayoutGetClipRegion() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Obtains a clip region which contains the areas where the given ranges of
    * text would be drawn.
    *
    * @x_origin
    *   and @y_origin are the top left position of the layout.
    * @index_ranges
    *   should contain ranges of bytes in the layout’s text. The clip region
    *   will include space to the left or right of the line (to the layout
    *   bounding box) if you have indexes above or below the indexes contained
    *   inside the line. This is to draw the selection all the way to the side
    *   of the layout. However, the clip region is in line coordinates, not
    *   layout coordinates.
    *
    * Note that the regions returned correspond to logical extents of the text
    * ranges, not ink extents. So the drawn line may in fact touch areas out of
    * the clip region. The clip region is mainly useful for highlightling parts
    * of text, such as when text is selected.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(Pango.LayoutLine), @type -> DataRecord(PangoLayoutLine*)))"
  )
  def pangoLayoutLineGetClipRegion() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Transfers image data from a `cairo_surface_t` and converts it to a
    * `GdkPixbuf`.
    *
    * This allows you to efficiently read individual pixels from cairo surfaces.
    *
    * This function will create an RGB pixbuf with 8 bits per channel. The
    * pixbuf will contain an alpha channel if the @surface contains one.
    */
  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(cairo.Surface), @type -> DataRecord(cairo_surface_t*)))"
  )
  def pixbufGetFromSurface() = ???

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new pixbuf from @texture.
    *
    * This should generally not be used in newly written code as later stages
    * will almost certainly convert the pixbuf back into a texture to draw it on
    * screen.
    */
  def pixbufGetFromTexture(
      texture: Texture /* Some(Ptr[GdkTexture]) */
  ): Pixbuf /* Some(Ptr[_root_.sn.gnome.gdkpixbuf.internal.GdkPixbuf]) */ =
    new Pixbuf(
      gdk_pixbuf_get_from_texture(
        texture.getUnsafeRawPointer().asInstanceOf
      ).asInstanceOf
    )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets a list of backends that GDK should try to use.
    *
    * This can be useful if your application does not work with certain GDK
    * backends.
    *
    * By default, GDK tries all included backends.
    *
    * For example:
    *
    * ```c
    * gdk_set_allowed_backends ("wayland,macos,*");
    * ```
    *
    * instructs GDK to try the Wayland backend first, followed by the MacOs
    * backend, and then all others.
    *
    * If the `GDK_BACKEND` environment variable is set, it determines what
    * backends are tried in what order, while still respecting the set of
    * allowed backends that are specified by this function.
    *
    * The possible backend names are:
    *
    *   - `broadway`
    *   - `macos`
    *   - `wayland`.
    *   - `win32`
    *   - `x11`
    *
    * You can also include a `*` in the list to try all remaining backends.
    *
    * This call must happen prior to functions that open a display, such as
    * [func@Gdk.Display.open], `gtk_init()`, or `gtk_init_check()` in order to
    * take effect.
    */
  def setAllowedBackends(
      backends: String | CString /* Some(CString) */
  )(using Zone): Unit /* Some(Unit) */ = gdk_set_allowed_backends(
    __sn_extract_string(backends)
  )

  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Quark), @type -> DataRecord(GQuark)))"
  )
  def textureErrorQuark() = ???

  def toplevelSizeGetType()
      : GType /* Some(_root_.sn.gnome.gobject.internal.GType) */ =
    gdk_toplevel_size_get_type()

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Convert from a Unicode character to a key symbol.
    */
  def unicodeToKeyval(
      wc: UInt /* Some(_root_.sn.gnome.glib.internal.guint32) */
  ): UInt /* Some(_root_.sn.gnome.glib.internal.guint) */ =
    gdk_unicode_to_keyval(guint32(wc)).value

  @annotation.compileTimeOnly(
    "Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Quark), @type -> DataRecord(GQuark)))"
  )
  def vulkanErrorQuark() = ???

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end Gdk
