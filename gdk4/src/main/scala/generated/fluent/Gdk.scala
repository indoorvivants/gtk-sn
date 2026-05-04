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
  /** The main way to not draw GL content in GTK.
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[cairo_draw_from_gl:/<function parameters>/cr]: Cannot render type Type(List(),ListMap(@name -> DataRecord(cairo.Context), @type -> DataRecord(cairo_t*)))"
  )
  private def cairoDrawFromGl() = ???

  /** Adds the given rectangle to the current path of @cr.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[cairo_rectangle:/<function parameters>/cr]: Cannot render type Type(List(),ListMap(@name -> DataRecord(cairo.Context), @type -> DataRecord(cairo_t*)))"
  )
  private def cairoRectangle() = ???

  /** Adds the given region to the current path of @cr.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[cairo_region:/<function parameters>/cr]: Cannot render type Type(List(),ListMap(@name -> DataRecord(cairo.Context), @type -> DataRecord(cairo_t*)))"
  )
  private def cairoRegion() = ???

  /** Creates region that covers the area where the given
    * @surface
    *   is more than 50% opaque.
    *
    * This function takes into account device offsets that might be set with
    * cairo_surface_set_device_offset().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[cairo_region_create_from_surface:/<function parameters>/surface]: Cannot render type Type(List(),ListMap(@name -> DataRecord(cairo.Surface), @type -> DataRecord(cairo_surface_t*)))"
  )
  private def cairoRegionCreateFromSurface() = ???

  /** Sets the given pixbuf as the source pattern for @cr.
    *
    * The pattern has an extend mode of %CAIRO_EXTEND_NONE and is aligned so
    * that the origin of @pixbuf is @pixbuf_x, @pixbuf_y.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[cairo_set_source_pixbuf:/<function parameters>/cr]: Cannot render type Type(List(),ListMap(@name -> DataRecord(cairo.Context), @type -> DataRecord(cairo_t*)))"
  )
  private def cairoSetSourcePixbuf() = ???

  /** Sets the specified `GdkRGBA` as the source color of @cr.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[cairo_set_source_rgba:/<function parameters>/cr]: Cannot render type Type(List(),ListMap(@name -> DataRecord(cairo.Context), @type -> DataRecord(cairo_t*)))"
  )
  private def cairoSetSourceRgba() = ???

  /** Read content from the given input stream and deserialize it,
    * asynchronously.
    *
    * The default I/O priority is %G_PRIORITY_DEFAULT (i.e. 0), and lower
    * numbers indicate a higher priority.
    *
    * When the operation is finished, @callback will be called. You must then
    * call [func@Gdk.content_deserialize_finish] to get the result of the
    * operation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[content_deserialize_async:/<function parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Gio.AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def contentDeserializeAsync() = ???

  /** Finishes a content deserialization operation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[content_deserialize_finish:]: Function content_deserialize_finish contains an OUT parameter, which is not supported yet"
  )
  private def contentDeserializeFinish() = ???

  /** Parses the given @string into `GdkContentFormats` and returns the formats.
    *
    * Strings printed via [method@Gdk.ContentFormats.to_string] can be read in
    * again successfully using this function.
    *
    * If @string does not describe valid content formats, %NULL is returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[content_formats_parse:/<return type>]: Cannot render type Type(List(),ListMap(@name -> DataRecord(ContentFormats), @type -> DataRecord(GdkContentFormats*)))"
  )
  private def contentFormatsParse() = ???

  /** Registers a function to deserialize object of a given type.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[content_register_deserializer:/<function parameters>/deserialize]: Cannot render type Type(List(),ListMap(@name -> DataRecord(ContentDeserializeFunc), @type -> DataRecord(GdkContentDeserializeFunc)))"
  )
  private def contentRegisterDeserializer() = ???

  /** Registers a function to serialize objects of a given type.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[content_register_serializer:/<function parameters>/serialize]: Cannot render type Type(List(),ListMap(@name -> DataRecord(ContentSerializeFunc), @type -> DataRecord(GdkContentSerializeFunc)))"
  )
  private def contentRegisterSerializer() = ???

  /** Serialize content and write it to the given output stream, asynchronously.
    *
    * The default I/O priority is %G_PRIORITY_DEFAULT (i.e. 0), and lower
    * numbers indicate a higher priority.
    *
    * When the operation is finished, @callback will be called. You must then
    * call [func@Gdk.content_serialize_finish] to get the result of the
    * operation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[content_serialize_async:/<function parameters>/value]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GObject.Value), @type -> DataRecord(const GValue*)))"
  )
  private def contentSerializeAsync() = ???

  /** Finishes a content serialization operation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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

  /** Checks if @action represents a single action or includes multiple actions.
    *
    * When @action is 0 - ie no action was given, %TRUE is returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def dragActionIsUnique(
      action: DragAction /* Some(GdkDragAction) */
  ): Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */ =
    gdk_drag_action_is_unique(action.raw).value.!=(0)

  def dragSurfaceSizeGetType()
      : GType /* Some(_root_.sn.gnome.gobject.internal.GType) */ =
    gdk_drag_surface_size_get_type()

  /** Returns the relative angle from @event1 to @event2.
    *
    * The relative angle is the angle between the X axis and the line through
    * both events' positions. The rotation direction for positive angles is from
    * the positive X axis towards the positive Y axis.
    *
    * This assumes that both events have X/Y information. If not, this function
    * returns %FALSE.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[events_get_angle:]: Function events_get_angle contains an OUT parameter, which is not supported yet"
  )
  private def eventsGetAngle() = ???

  /** Returns the point halfway between the events' positions.
    *
    * This assumes that both events have X/Y information. If not, this function
    * returns %FALSE.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[events_get_center:]: Function events_get_center contains an OUT parameter, which is not supported yet"
  )
  private def eventsGetCenter() = ???

  /** Returns the distance between the event locations.
    *
    * This assumes that both events have X/Y information. If not, this function
    * returns %FALSE.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[events_get_distance:]: Function events_get_distance contains an OUT parameter, which is not supported yet"
  )
  private def eventsGetDistance() = ???

  @annotation.compileTimeOnly(
    "[gl_error_quark:/<return type>]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Quark), @type -> DataRecord(GQuark)))"
  )
  private def glErrorQuark() = ???

  /** Canonicalizes the given mime type and interns the result.
    *
    * If @string is not a valid mime type, %NULL is returned instead. See RFC
    * 2048 for the syntax if mime types.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def internMimeType(
      string: String | CString /* Some(CString) */
  )(using Zone): String /* Some(CString) */ = fromCString(
    gdk_intern_mime_type(__sn_extract_string(string)).asInstanceOf
  )

  /** Obtains the upper- and lower-case versions of the keyval @symbol.
    *
    * Examples of keyvals are `GDK_KEY_a`, `GDK_KEY_Enter`, `GDK_KEY_F1`, etc.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[keyval_convert_case:]: Function keyval_convert_case contains an OUT parameter, which is not supported yet"
  )
  private def keyvalConvertCase() = ???

  /** Converts a key name to a key value.
    *
    * The names are the same as those in the `gdk/gdkkeysyms.h` header file but
    * without the leading “GDK_KEY_”.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def keyvalFromName(
      keyval_name: String | CString /* Some(CString) */
  )(using Zone): UInt /* Some(_root_.sn.gnome.glib.internal.guint) */ =
    gdk_keyval_from_name(__sn_extract_string(keyval_name)).value

  /** Returns %TRUE if the given key value is in lower case.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def keyvalIsLower(
      keyval: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */ =
    gdk_keyval_is_lower(guint(keyval)).value.!=(0)

  /** Returns %TRUE if the given key value is in upper case.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def keyvalIsUpper(
      keyval: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): Boolean /* Some(_root_.sn.gnome.glib.internal.gboolean) */ =
    gdk_keyval_is_upper(guint(keyval)).value.!=(0)

  /** Converts a key value into a symbolic name.
    *
    * The names are the same as those in the `gdk/gdkkeysyms.h` header file but
    * without the leading “GDK_KEY_”.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def keyvalName(
      keyval: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  )(using Zone): String /* Some(CString) */ = fromCString(
    gdk_keyval_name(guint(keyval)).asInstanceOf
  )

  /** Converts a key value to lower case, if applicable.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def keyvalToLower(
      keyval: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): UInt /* Some(_root_.sn.gnome.glib.internal.guint) */ = gdk_keyval_to_lower(
    guint(keyval)
  ).value

  /** Convert from a GDK key symbol to the corresponding Unicode character.
    *
    * Note that the conversion does not take the current locale into
    * consideration, which might be expected for particular keyvals, such as
    * %GDK_KEY_KP_Decimal.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def keyvalToUnicode(
      keyval: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): UInt /* Some(_root_.sn.gnome.glib.internal.guint32) */ =
    gdk_keyval_to_unicode(guint(keyval)).value

  /** Converts a key value to upper case, if applicable.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def keyvalToUpper(
      keyval: UInt /* Some(_root_.sn.gnome.glib.internal.guint) */
  ): UInt /* Some(_root_.sn.gnome.glib.internal.guint) */ = gdk_keyval_to_upper(
    guint(keyval)
  ).value

  /** Returns a paintable that has the given intrinsic size and draws nothing.
    *
    * This is often useful for implementing the
    * [vfunc@Gdk.Paintable.get_current_image] virtual function when the
    * paintable is in an incomplete state (like a [class@Gtk.MediaStream] before
    * receiving the first frame).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def paintableNewEmpty(
      intrinsic_width: Int /* Some(CInt) */,
      intrinsic_height: Int /* Some(CInt) */
  ): Paintable /* Some(Ptr[GdkPaintable]) */ = new Paintable.Abstract(
    gdk_paintable_new_empty(intrinsic_width, intrinsic_height).asInstanceOf
  )

  /** Obtains a clip region which contains the areas where the given ranges of
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[pango_layout_get_clip_region:/<function parameters>/index_ranges]: Cannot render type Type(List(),ListMap(@name -> DataRecord(gint), @type -> DataRecord(const int*)))"
  )
  private def pangoLayoutGetClipRegion() = ???

  /** Obtains a clip region which contains the areas where the given ranges of
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[pango_layout_line_get_clip_region:/<function parameters>/line]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Pango.LayoutLine), @type -> DataRecord(PangoLayoutLine*)))"
  )
  private def pangoLayoutLineGetClipRegion() = ???

  /** Transfers image data from a `cairo_surface_t` and converts it to a
    * `GdkPixbuf`.
    *
    * This allows you to efficiently read individual pixels from cairo surfaces.
    *
    * This function will create an RGB pixbuf with 8 bits per channel. The
    * pixbuf will contain an alpha channel if the @surface contains one.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[pixbuf_get_from_surface:/<function parameters>/surface]: Cannot render type Type(List(),ListMap(@name -> DataRecord(cairo.Surface), @type -> DataRecord(cairo_surface_t*)))"
  )
  private def pixbufGetFromSurface() = ???

  /** Creates a new pixbuf from @texture.
    *
    * This should generally not be used in newly written code as later stages
    * will almost certainly convert the pixbuf back into a texture to draw it on
    * screen.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def pixbufGetFromTexture(
      texture: Texture /* Some(Ptr[GdkTexture]) */
  ): Pixbuf /* Some(Ptr[_root_.sn.gnome.gdkpixbuf.internal.GdkPixbuf]) */ =
    new Pixbuf(
      gdk_pixbuf_get_from_texture(
        texture.getUnsafeRawPointer().asInstanceOf
      ).asInstanceOf
    )

  /** Sets a list of backends that GDK should try to use.
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setAllowedBackends(
      backends: String | CString /* Some(CString) */
  )(using Zone): Unit /* Some(Unit) */ = gdk_set_allowed_backends(
    __sn_extract_string(backends)
  )

  @annotation.compileTimeOnly(
    "[texture_error_quark:/<return type>]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Quark), @type -> DataRecord(GQuark)))"
  )
  private def textureErrorQuark() = ???

  def toplevelSizeGetType()
      : GType /* Some(_root_.sn.gnome.gobject.internal.GType) */ =
    gdk_toplevel_size_get_type()

  /** Convert from a Unicode character to a key symbol.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unicodeToKeyval(
      wc: UInt /* Some(_root_.sn.gnome.glib.internal.guint32) */
  ): UInt /* Some(_root_.sn.gnome.glib.internal.guint) */ =
    gdk_unicode_to_keyval(guint32(wc)).value

  @annotation.compileTimeOnly(
    "[vulkan_error_quark:/<return type>]: Cannot render type Type(List(),ListMap(@name -> DataRecord(GLib.Quark), @type -> DataRecord(GQuark)))"
  )
  private def vulkanErrorQuark() = ???

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end Gdk
