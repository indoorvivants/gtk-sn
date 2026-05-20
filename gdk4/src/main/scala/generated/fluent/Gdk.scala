package sn.gnome.gdk4

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.cairo.{Context, Region, Surface}
import sn.gnome.gdk4.{
  ContentFormats,
  DragAction,
  Paintable,
  RGBA,
  Rectangle,
  Surface,
  Texture
}
import sn.gnome.gdkpixbuf.Pixbuf
import sn.gnome.gio.AsyncResult
import sn.gnome.glib.GResult
import sn.gnome.glib.internal.{gboolean, gint, guint, guint32}
import sn.gnome.gobject.internal.GType
import sn.gnome.gobject.runtime.*

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
  def cairoDrawFromGl(
      cr: sn.gnome.cairo.Context /* Some(Ptr[_root_.sn.gnome.cairo.internal.cairo_t]) */,
      surface: sn.gnome.gdk4.Surface /* Some(Ptr[GdkSurface]) */,
      source: Int /* Some(CInt) */,
      source_type: Int /* Some(CInt) */,
      buffer_scale: Int /* Some(CInt) */,
      x: Int /* Some(CInt) */,
      y: Int /* Some(CInt) */,
      width: Int /* Some(CInt) */,
      height: Int /* Some(CInt) */
  )(using Runtime): Unit /* Some(Unit) */ = gdk_cairo_draw_from_gl(
    cr.getUnsafeRawPointer().asInstanceOf,
    surface.getUnsafeRawPointer().asInstanceOf,
    source,
    source_type,
    buffer_scale,
    x,
    y,
    width,
    height
  )

  /** Adds the given rectangle to the current path of @cr.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def cairoRectangle(
      cr: sn.gnome.cairo.Context /* Some(Ptr[_root_.sn.gnome.cairo.internal.cairo_t]) */,
      rectangle: sn.gnome.gdk4.Rectangle /* Some(Ptr[GdkRectangle]) */
  ): Unit /* Some(Unit) */ = gdk_cairo_rectangle(
    cr.getUnsafeRawPointer().asInstanceOf,
    rectangle.getUnsafeRawPointer().asInstanceOf
  )

  /** Adds the given region to the current path of @cr.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def cairoRegion(
      cr: sn.gnome.cairo.Context /* Some(Ptr[_root_.sn.gnome.cairo.internal.cairo_t]) */,
      region: sn.gnome.cairo.Region /* Some(Ptr[_root_.sn.gnome.cairo.internal.cairo_region_t]) */
  ): Unit /* Some(Unit) */ = gdk_cairo_region(
    cr.getUnsafeRawPointer().asInstanceOf,
    region.getUnsafeRawPointer().asInstanceOf
  )

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
  def cairoRegionCreateFromSurface(
      surface: sn.gnome.cairo.Surface /* Some(Ptr[_root_.sn.gnome.cairo.internal.cairo_surface_t]) */
  ): sn.gnome.cairo.Region /* Some(Ptr[_root_.sn.gnome.cairo.internal.cairo_region_t]) */ =
    sn.gnome.cairo.Region.fromRaw(
      gdk_cairo_region_create_from_surface(
        surface.getUnsafeRawPointer().asInstanceOf
      )
    )

  /** Sets the given pixbuf as the source pattern for @cr.
    *
    * The pattern has an extend mode of %CAIRO_EXTEND_NONE and is aligned so
    * that the origin of @pixbuf is @pixbuf_x, @pixbuf_y.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def cairoSetSourcePixbuf(
      cr: sn.gnome.cairo.Context /* Some(Ptr[_root_.sn.gnome.cairo.internal.cairo_t]) */,
      pixbuf: sn.gnome.gdkpixbuf.Pixbuf /* Some(Ptr[_root_.sn.gnome.gdkpixbuf.internal.GdkPixbuf]) */,
      pixbuf_x: Double /* Some(Double) */,
      pixbuf_y: Double /* Some(Double) */
  )(using Runtime): Unit /* Some(Unit) */ = gdk_cairo_set_source_pixbuf(
    cr.getUnsafeRawPointer().asInstanceOf,
    pixbuf.getUnsafeRawPointer().asInstanceOf,
    pixbuf_x,
    pixbuf_y
  )

  /** Sets the specified `GdkRGBA` as the source color of @cr.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def cairoSetSourceRgba(
      cr: sn.gnome.cairo.Context /* Some(Ptr[_root_.sn.gnome.cairo.internal.cairo_t]) */,
      rgba: sn.gnome.gdk4.RGBA /* Some(Ptr[GdkRGBA]) */
  ): Unit /* Some(Unit) */ = gdk_cairo_set_source_rgba(
    cr.getUnsafeRawPointer().asInstanceOf,
    rgba.getUnsafeRawPointer().asInstanceOf
  )

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
  def contentFormatsParse(string: scala.Predef.String /* Some(CString) */ )(
      using Runtime
  ): sn.gnome.gdk4.ContentFormats /* Some(Ptr[GdkContentFormats]) */ =
    sn.gnome.gdk4.ContentFormats.fromRaw(
      gdk_content_formats_parse(summon[Runtime].inZone(toCString(string)))
    )

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
    "[content_serialize_async:/<function parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(Gio.AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def contentSerializeAsync() = ???

  /** Finishes a content serialization operation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def contentSerializeFinish(
      result: sn.gnome.gio.AsyncResult /* Some(Ptr[_root_.sn.gnome.gio.internal.GAsyncResult]) */
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
      action: sn.gnome.gdk4.DragAction /* Some(GdkDragAction) */
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
      string: scala.Predef.String /* Some(CString) */
  )(using Runtime): scala.Predef.String /* Some(CString) */ = fromCString(
    gdk_intern_mime_type(summon[Runtime].inZone(toCString(string))).asInstanceOf
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
      keyval_name: scala.Predef.String /* Some(CString) */
  )(using Runtime): UInt /* Some(_root_.sn.gnome.glib.internal.guint) */ =
    gdk_keyval_from_name(summon[Runtime].inZone(toCString(keyval_name))).value

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
  ): scala.Predef.String /* Some(CString) */ = fromCString(
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
  ): sn.gnome.gdk4.Paintable /* Some(Ptr[GdkPaintable]) */ =
    new Paintable.Abstract(
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
    "[pango_layout_line_get_clip_region:/<function parameters>/index_ranges]: Cannot render array type ArrayType(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(gint), @type -> DataRecord(int)))),ListMap(@zero-terminated -> DataRecord(0), @type -> DataRecord(const int*)))"
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
  def pixbufGetFromSurface(
      surface: sn.gnome.cairo.Surface /* Some(Ptr[_root_.sn.gnome.cairo.internal.cairo_surface_t]) */,
      src_x: Int /* Some(CInt) */,
      src_y: Int /* Some(CInt) */,
      width: Int /* Some(CInt) */,
      height: Int /* Some(CInt) */
  )(using
      Runtime
  ): sn.gnome.gdkpixbuf.Pixbuf /* Some(Ptr[_root_.sn.gnome.gdkpixbuf.internal.GdkPixbuf]) */ =
    sn.gnome.gdkpixbuf.Pixbuf.applyUnsafe(
      gdk_pixbuf_get_from_surface(
        surface.getUnsafeRawPointer().asInstanceOf,
        src_x,
        src_y,
        width,
        height
      ).asInstanceOf
    )

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
      texture: sn.gnome.gdk4.Texture /* Some(Ptr[GdkTexture]) */
  )(using
      Runtime
  ): sn.gnome.gdkpixbuf.Pixbuf /* Some(Ptr[_root_.sn.gnome.gdkpixbuf.internal.GdkPixbuf]) */ =
    sn.gnome.gdkpixbuf.Pixbuf.applyUnsafe(
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
      backends: scala.Predef.String /* Some(CString) */
  )(using Runtime): Unit /* Some(Unit) */ = gdk_set_allowed_backends(
    summon[Runtime].inZone(toCString(backends))
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

  /** Defines all possible DND actions.
    *
    * This can be used in [method@Gdk.Drop.status] messages when any drop can be
    * accepted or a more specific drop method is not yet known.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val ACTION_ALL: Int = 7

  /** The middle button.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val BUTTON_MIDDLE: Int = 2

  /** The primary button. This is typically the left mouse button, or the right
    * button in a left-handed setup.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val BUTTON_PRIMARY: Int = 1

  /** The secondary button. This is typically the right mouse button, or the
    * left button in a left-handed setup.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val BUTTON_SECONDARY: Int = 3

  /** Represents the current time, and can be used anywhere a time is expected.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val CURRENT_TIME: Int = 0

  /** Use this macro as the return value for continuing the propagation of an
    * event handler.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val EVENT_PROPAGATE: Boolean = false

  /** Use this macro as the return value for stopping the propagation of an
    * event handler.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val EVENT_STOP: Boolean = true
  final val KEY_0: Int = 48
  final val KEY_1: Int = 49
  final val KEY_2: Int = 50
  final val KEY_3: Int = 51
  final val KEY_3270_AltCursor: Int = 64784
  final val KEY_3270_Attn: Int = 64782
  final val KEY_3270_BackTab: Int = 64773
  final val KEY_3270_ChangeScreen: Int = 64793
  final val KEY_3270_Copy: Int = 64789
  final val KEY_3270_CursorBlink: Int = 64783
  final val KEY_3270_CursorSelect: Int = 64796
  final val KEY_3270_DeleteWord: Int = 64794
  final val KEY_3270_Duplicate: Int = 64769
  final val KEY_3270_Enter: Int = 64798
  final val KEY_3270_EraseEOF: Int = 64774
  final val KEY_3270_EraseInput: Int = 64775
  final val KEY_3270_ExSelect: Int = 64795
  final val KEY_3270_FieldMark: Int = 64770
  final val KEY_3270_Ident: Int = 64787
  final val KEY_3270_Jump: Int = 64786
  final val KEY_3270_KeyClick: Int = 64785
  final val KEY_3270_Left2: Int = 64772
  final val KEY_3270_PA1: Int = 64778
  final val KEY_3270_PA2: Int = 64779
  final val KEY_3270_PA3: Int = 64780
  final val KEY_3270_Play: Int = 64790
  final val KEY_3270_PrintScreen: Int = 64797
  final val KEY_3270_Quit: Int = 64777
  final val KEY_3270_Record: Int = 64792
  final val KEY_3270_Reset: Int = 64776
  final val KEY_3270_Right2: Int = 64771
  final val KEY_3270_Rule: Int = 64788
  final val KEY_3270_Setup: Int = 64791
  final val KEY_3270_Test: Int = 64781
  final val KEY_4: Int = 52
  final val KEY_5: Int = 53
  final val KEY_6: Int = 54
  final val KEY_7: Int = 55
  final val KEY_8: Int = 56
  final val KEY_9: Int = 57
  final val KEY_A: Int = 65
  final val KEY_AE: Int = 198
  final val KEY_Aacute: Int = 193
  final val KEY_Abelowdot: Int = 16785056
  final val KEY_Abreve: Int = 451
  final val KEY_Abreveacute: Int = 16785070
  final val KEY_Abrevebelowdot: Int = 16785078
  final val KEY_Abrevegrave: Int = 16785072
  final val KEY_Abrevehook: Int = 16785074
  final val KEY_Abrevetilde: Int = 16785076
  final val KEY_AccessX_Enable: Int = 65136
  final val KEY_AccessX_Feedback_Enable: Int = 65137
  final val KEY_Acircumflex: Int = 194
  final val KEY_Acircumflexacute: Int = 16785060
  final val KEY_Acircumflexbelowdot: Int = 16785068
  final val KEY_Acircumflexgrave: Int = 16785062
  final val KEY_Acircumflexhook: Int = 16785064
  final val KEY_Acircumflextilde: Int = 16785066
  final val KEY_AddFavorite: Int = 269025081
  final val KEY_Adiaeresis: Int = 196
  final val KEY_Agrave: Int = 192
  final val KEY_Ahook: Int = 16785058
  final val KEY_Alt_L: Int = 65513
  final val KEY_Alt_R: Int = 65514
  final val KEY_Amacron: Int = 960
  final val KEY_Aogonek: Int = 417
  final val KEY_ApplicationLeft: Int = 269025104
  final val KEY_ApplicationRight: Int = 269025105
  final val KEY_Arabic_0: Int = 16778848
  final val KEY_Arabic_1: Int = 16778849
  final val KEY_Arabic_2: Int = 16778850
  final val KEY_Arabic_3: Int = 16778851
  final val KEY_Arabic_4: Int = 16778852
  final val KEY_Arabic_5: Int = 16778853
  final val KEY_Arabic_6: Int = 16778854
  final val KEY_Arabic_7: Int = 16778855
  final val KEY_Arabic_8: Int = 16778856
  final val KEY_Arabic_9: Int = 16778857
  final val KEY_Arabic_ain: Int = 1497
  final val KEY_Arabic_alef: Int = 1479
  final val KEY_Arabic_alefmaksura: Int = 1513
  final val KEY_Arabic_beh: Int = 1480
  final val KEY_Arabic_comma: Int = 1452
  final val KEY_Arabic_dad: Int = 1494
  final val KEY_Arabic_dal: Int = 1487
  final val KEY_Arabic_damma: Int = 1519
  final val KEY_Arabic_dammatan: Int = 1516
  final val KEY_Arabic_ddal: Int = 16778888
  final val KEY_Arabic_farsi_yeh: Int = 16778956
  final val KEY_Arabic_fatha: Int = 1518
  final val KEY_Arabic_fathatan: Int = 1515
  final val KEY_Arabic_feh: Int = 1505
  final val KEY_Arabic_fullstop: Int = 16778964
  final val KEY_Arabic_gaf: Int = 16778927
  final val KEY_Arabic_ghain: Int = 1498
  final val KEY_Arabic_ha: Int = 1511
  final val KEY_Arabic_hah: Int = 1485
  final val KEY_Arabic_hamza: Int = 1473
  final val KEY_Arabic_hamza_above: Int = 16778836
  final val KEY_Arabic_hamza_below: Int = 16778837
  final val KEY_Arabic_hamzaonalef: Int = 1475
  final val KEY_Arabic_hamzaonwaw: Int = 1476
  final val KEY_Arabic_hamzaonyeh: Int = 1478
  final val KEY_Arabic_hamzaunderalef: Int = 1477
  final val KEY_Arabic_heh: Int = 1511
  final val KEY_Arabic_heh_doachashmee: Int = 16778942
  final val KEY_Arabic_heh_goal: Int = 16778945
  final val KEY_Arabic_jeem: Int = 1484
  final val KEY_Arabic_jeh: Int = 16778904
  final val KEY_Arabic_kaf: Int = 1507
  final val KEY_Arabic_kasra: Int = 1520
  final val KEY_Arabic_kasratan: Int = 1517
  final val KEY_Arabic_keheh: Int = 16778921
  final val KEY_Arabic_khah: Int = 1486
  final val KEY_Arabic_lam: Int = 1508
  final val KEY_Arabic_madda_above: Int = 16778835
  final val KEY_Arabic_maddaonalef: Int = 1474
  final val KEY_Arabic_meem: Int = 1509
  final val KEY_Arabic_noon: Int = 1510
  final val KEY_Arabic_noon_ghunna: Int = 16778938
  final val KEY_Arabic_peh: Int = 16778878
  final val KEY_Arabic_percent: Int = 16778858
  final val KEY_Arabic_qaf: Int = 1506
  final val KEY_Arabic_question_mark: Int = 1471
  final val KEY_Arabic_ra: Int = 1489
  final val KEY_Arabic_rreh: Int = 16778897
  final val KEY_Arabic_sad: Int = 1493
  final val KEY_Arabic_seen: Int = 1491
  final val KEY_Arabic_semicolon: Int = 1467
  final val KEY_Arabic_shadda: Int = 1521
  final val KEY_Arabic_sheen: Int = 1492
  final val KEY_Arabic_sukun: Int = 1522
  final val KEY_Arabic_superscript_alef: Int = 16778864
  final val KEY_Arabic_switch: Int = 65406
  final val KEY_Arabic_tah: Int = 1495
  final val KEY_Arabic_tatweel: Int = 1504
  final val KEY_Arabic_tcheh: Int = 16778886
  final val KEY_Arabic_teh: Int = 1482
  final val KEY_Arabic_tehmarbuta: Int = 1481
  final val KEY_Arabic_thal: Int = 1488
  final val KEY_Arabic_theh: Int = 1483
  final val KEY_Arabic_tteh: Int = 16778873
  final val KEY_Arabic_veh: Int = 16778916
  final val KEY_Arabic_waw: Int = 1512
  final val KEY_Arabic_yeh: Int = 1514
  final val KEY_Arabic_yeh_baree: Int = 16778962
  final val KEY_Arabic_zah: Int = 1496
  final val KEY_Arabic_zain: Int = 1490
  final val KEY_Aring: Int = 197
  final val KEY_Armenian_AT: Int = 16778552
  final val KEY_Armenian_AYB: Int = 16778545
  final val KEY_Armenian_BEN: Int = 16778546
  final val KEY_Armenian_CHA: Int = 16778569
  final val KEY_Armenian_DA: Int = 16778548
  final val KEY_Armenian_DZA: Int = 16778561
  final val KEY_Armenian_E: Int = 16778551
  final val KEY_Armenian_FE: Int = 16778582
  final val KEY_Armenian_GHAT: Int = 16778562
  final val KEY_Armenian_GIM: Int = 16778547
  final val KEY_Armenian_HI: Int = 16778565
  final val KEY_Armenian_HO: Int = 16778560
  final val KEY_Armenian_INI: Int = 16778555
  final val KEY_Armenian_JE: Int = 16778571
  final val KEY_Armenian_KE: Int = 16778580
  final val KEY_Armenian_KEN: Int = 16778559
  final val KEY_Armenian_KHE: Int = 16778557
  final val KEY_Armenian_LYUN: Int = 16778556
  final val KEY_Armenian_MEN: Int = 16778564
  final val KEY_Armenian_NU: Int = 16778566
  final val KEY_Armenian_O: Int = 16778581
  final val KEY_Armenian_PE: Int = 16778570
  final val KEY_Armenian_PYUR: Int = 16778579
  final val KEY_Armenian_RA: Int = 16778572
  final val KEY_Armenian_RE: Int = 16778576
  final val KEY_Armenian_SE: Int = 16778573
  final val KEY_Armenian_SHA: Int = 16778567
  final val KEY_Armenian_TCHE: Int = 16778563
  final val KEY_Armenian_TO: Int = 16778553
  final val KEY_Armenian_TSA: Int = 16778558
  final val KEY_Armenian_TSO: Int = 16778577
  final val KEY_Armenian_TYUN: Int = 16778575
  final val KEY_Armenian_VEV: Int = 16778574
  final val KEY_Armenian_VO: Int = 16778568
  final val KEY_Armenian_VYUN: Int = 16778578
  final val KEY_Armenian_YECH: Int = 16778549
  final val KEY_Armenian_ZA: Int = 16778550
  final val KEY_Armenian_ZHE: Int = 16778554
  final val KEY_Armenian_accent: Int = 16778587
  final val KEY_Armenian_amanak: Int = 16778588
  final val KEY_Armenian_apostrophe: Int = 16778586
  final val KEY_Armenian_at: Int = 16778600
  final val KEY_Armenian_ayb: Int = 16778593
  final val KEY_Armenian_ben: Int = 16778594
  final val KEY_Armenian_but: Int = 16778589
  final val KEY_Armenian_cha: Int = 16778617
  final val KEY_Armenian_da: Int = 16778596
  final val KEY_Armenian_dza: Int = 16778609
  final val KEY_Armenian_e: Int = 16778599
  final val KEY_Armenian_exclam: Int = 16778588
  final val KEY_Armenian_fe: Int = 16778630
  final val KEY_Armenian_full_stop: Int = 16778633
  final val KEY_Armenian_ghat: Int = 16778610
  final val KEY_Armenian_gim: Int = 16778595
  final val KEY_Armenian_hi: Int = 16778613
  final val KEY_Armenian_ho: Int = 16778608
  final val KEY_Armenian_hyphen: Int = 16778634
  final val KEY_Armenian_ini: Int = 16778603
  final val KEY_Armenian_je: Int = 16778619
  final val KEY_Armenian_ke: Int = 16778628
  final val KEY_Armenian_ken: Int = 16778607
  final val KEY_Armenian_khe: Int = 16778605
  final val KEY_Armenian_ligature_ew: Int = 16778631
  final val KEY_Armenian_lyun: Int = 16778604
  final val KEY_Armenian_men: Int = 16778612
  final val KEY_Armenian_nu: Int = 16778614
  final val KEY_Armenian_o: Int = 16778629
  final val KEY_Armenian_paruyk: Int = 16778590
  final val KEY_Armenian_pe: Int = 16778618
  final val KEY_Armenian_pyur: Int = 16778627
  final val KEY_Armenian_question: Int = 16778590
  final val KEY_Armenian_ra: Int = 16778620
  final val KEY_Armenian_re: Int = 16778624
  final val KEY_Armenian_se: Int = 16778621
  final val KEY_Armenian_separation_mark: Int = 16778589
  final val KEY_Armenian_sha: Int = 16778615
  final val KEY_Armenian_shesht: Int = 16778587
  final val KEY_Armenian_tche: Int = 16778611
  final val KEY_Armenian_to: Int = 16778601
  final val KEY_Armenian_tsa: Int = 16778606
  final val KEY_Armenian_tso: Int = 16778625
  final val KEY_Armenian_tyun: Int = 16778623
  final val KEY_Armenian_verjaket: Int = 16778633
  final val KEY_Armenian_vev: Int = 16778622
  final val KEY_Armenian_vo: Int = 16778616
  final val KEY_Armenian_vyun: Int = 16778626
  final val KEY_Armenian_yech: Int = 16778597
  final val KEY_Armenian_yentamna: Int = 16778634
  final val KEY_Armenian_za: Int = 16778598
  final val KEY_Armenian_zhe: Int = 16778602
  final val KEY_Atilde: Int = 195
  final val KEY_AudibleBell_Enable: Int = 65146
  final val KEY_AudioCycleTrack: Int = 269025179
  final val KEY_AudioForward: Int = 269025175
  final val KEY_AudioLowerVolume: Int = 269025041
  final val KEY_AudioMedia: Int = 269025074
  final val KEY_AudioMicMute: Int = 269025202
  final val KEY_AudioMute: Int = 269025042
  final val KEY_AudioNext: Int = 269025047
  final val KEY_AudioPause: Int = 269025073
  final val KEY_AudioPlay: Int = 269025044
  final val KEY_AudioPreset: Int = 269025206
  final val KEY_AudioPrev: Int = 269025046
  final val KEY_AudioRaiseVolume: Int = 269025043
  final val KEY_AudioRandomPlay: Int = 269025177
  final val KEY_AudioRecord: Int = 269025052
  final val KEY_AudioRepeat: Int = 269025176
  final val KEY_AudioRewind: Int = 269025086
  final val KEY_AudioStop: Int = 269025045
  final val KEY_Away: Int = 269025165
  final val KEY_B: Int = 66
  final val KEY_Babovedot: Int = 16784898
  final val KEY_Back: Int = 269025062
  final val KEY_BackForward: Int = 269025087
  final val KEY_BackSpace: Int = 65288
  final val KEY_Battery: Int = 269025171
  final val KEY_Begin: Int = 65368
  final val KEY_Blue: Int = 269025190
  final val KEY_Bluetooth: Int = 269025172
  final val KEY_Book: Int = 269025106
  final val KEY_BounceKeys_Enable: Int = 65140
  final val KEY_Break: Int = 65387
  final val KEY_BrightnessAdjust: Int = 269025083
  final val KEY_Byelorussian_SHORTU: Int = 1726
  final val KEY_Byelorussian_shortu: Int = 1710
  final val KEY_C: Int = 67
  final val KEY_CD: Int = 269025107
  final val KEY_CH: Int = 65186
  final val KEY_C_H: Int = 65189
  final val KEY_C_h: Int = 65188
  final val KEY_Cabovedot: Int = 709
  final val KEY_Cacute: Int = 454
  final val KEY_Calculator: Int = 269025053
  final val KEY_Calendar: Int = 269025056
  final val KEY_Cancel: Int = 65385
  final val KEY_Caps_Lock: Int = 65509
  final val KEY_Ccaron: Int = 456
  final val KEY_Ccedilla: Int = 199
  final val KEY_Ccircumflex: Int = 710
  final val KEY_Ch: Int = 65185
  final val KEY_Clear: Int = 65291
  final val KEY_ClearGrab: Int = 269024801
  final val KEY_Close: Int = 269025110
  final val KEY_Codeinput: Int = 65335
  final val KEY_ColonSign: Int = 16785569
  final val KEY_Community: Int = 269025085
  final val KEY_ContrastAdjust: Int = 269025058
  final val KEY_Control_L: Int = 65507
  final val KEY_Control_R: Int = 65508
  final val KEY_Copy: Int = 269025111
  final val KEY_CruzeiroSign: Int = 16785570
  final val KEY_Cut: Int = 269025112
  final val KEY_CycleAngle: Int = 269025180
  final val KEY_Cyrillic_A: Int = 1761
  final val KEY_Cyrillic_BE: Int = 1762
  final val KEY_Cyrillic_CHE: Int = 1790
  final val KEY_Cyrillic_CHE_descender: Int = 16778422
  final val KEY_Cyrillic_CHE_vertstroke: Int = 16778424
  final val KEY_Cyrillic_DE: Int = 1764
  final val KEY_Cyrillic_DZHE: Int = 1727
  final val KEY_Cyrillic_E: Int = 1788
  final val KEY_Cyrillic_EF: Int = 1766
  final val KEY_Cyrillic_EL: Int = 1772
  final val KEY_Cyrillic_EM: Int = 1773
  final val KEY_Cyrillic_EN: Int = 1774
  final val KEY_Cyrillic_EN_descender: Int = 16778402
  final val KEY_Cyrillic_ER: Int = 1778
  final val KEY_Cyrillic_ES: Int = 1779
  final val KEY_Cyrillic_GHE: Int = 1767
  final val KEY_Cyrillic_GHE_bar: Int = 16778386
  final val KEY_Cyrillic_HA: Int = 1768
  final val KEY_Cyrillic_HARDSIGN: Int = 1791
  final val KEY_Cyrillic_HA_descender: Int = 16778418
  final val KEY_Cyrillic_I: Int = 1769
  final val KEY_Cyrillic_IE: Int = 1765
  final val KEY_Cyrillic_IO: Int = 1715
  final val KEY_Cyrillic_I_macron: Int = 16778466
  final val KEY_Cyrillic_JE: Int = 1720
  final val KEY_Cyrillic_KA: Int = 1771
  final val KEY_Cyrillic_KA_descender: Int = 16778394
  final val KEY_Cyrillic_KA_vertstroke: Int = 16778396
  final val KEY_Cyrillic_LJE: Int = 1721
  final val KEY_Cyrillic_NJE: Int = 1722
  final val KEY_Cyrillic_O: Int = 1775
  final val KEY_Cyrillic_O_bar: Int = 16778472
  final val KEY_Cyrillic_PE: Int = 1776
  final val KEY_Cyrillic_SCHWA: Int = 16778456
  final val KEY_Cyrillic_SHA: Int = 1787
  final val KEY_Cyrillic_SHCHA: Int = 1789
  final val KEY_Cyrillic_SHHA: Int = 16778426
  final val KEY_Cyrillic_SHORTI: Int = 1770
  final val KEY_Cyrillic_SOFTSIGN: Int = 1784
  final val KEY_Cyrillic_TE: Int = 1780
  final val KEY_Cyrillic_TSE: Int = 1763
  final val KEY_Cyrillic_U: Int = 1781
  final val KEY_Cyrillic_U_macron: Int = 16778478
  final val KEY_Cyrillic_U_straight: Int = 16778414
  final val KEY_Cyrillic_U_straight_bar: Int = 16778416
  final val KEY_Cyrillic_VE: Int = 1783
  final val KEY_Cyrillic_YA: Int = 1777
  final val KEY_Cyrillic_YERU: Int = 1785
  final val KEY_Cyrillic_YU: Int = 1760
  final val KEY_Cyrillic_ZE: Int = 1786
  final val KEY_Cyrillic_ZHE: Int = 1782
  final val KEY_Cyrillic_ZHE_descender: Int = 16778390
  final val KEY_Cyrillic_a: Int = 1729
  final val KEY_Cyrillic_be: Int = 1730
  final val KEY_Cyrillic_che: Int = 1758
  final val KEY_Cyrillic_che_descender: Int = 16778423
  final val KEY_Cyrillic_che_vertstroke: Int = 16778425
  final val KEY_Cyrillic_de: Int = 1732
  final val KEY_Cyrillic_dzhe: Int = 1711
  final val KEY_Cyrillic_e: Int = 1756
  final val KEY_Cyrillic_ef: Int = 1734
  final val KEY_Cyrillic_el: Int = 1740
  final val KEY_Cyrillic_em: Int = 1741
  final val KEY_Cyrillic_en: Int = 1742
  final val KEY_Cyrillic_en_descender: Int = 16778403
  final val KEY_Cyrillic_er: Int = 1746
  final val KEY_Cyrillic_es: Int = 1747
  final val KEY_Cyrillic_ghe: Int = 1735
  final val KEY_Cyrillic_ghe_bar: Int = 16778387
  final val KEY_Cyrillic_ha: Int = 1736
  final val KEY_Cyrillic_ha_descender: Int = 16778419
  final val KEY_Cyrillic_hardsign: Int = 1759
  final val KEY_Cyrillic_i: Int = 1737
  final val KEY_Cyrillic_i_macron: Int = 16778467
  final val KEY_Cyrillic_ie: Int = 1733
  final val KEY_Cyrillic_io: Int = 1699
  final val KEY_Cyrillic_je: Int = 1704
  final val KEY_Cyrillic_ka: Int = 1739
  final val KEY_Cyrillic_ka_descender: Int = 16778395
  final val KEY_Cyrillic_ka_vertstroke: Int = 16778397
  final val KEY_Cyrillic_lje: Int = 1705
  final val KEY_Cyrillic_nje: Int = 1706
  final val KEY_Cyrillic_o: Int = 1743
  final val KEY_Cyrillic_o_bar: Int = 16778473
  final val KEY_Cyrillic_pe: Int = 1744
  final val KEY_Cyrillic_schwa: Int = 16778457
  final val KEY_Cyrillic_sha: Int = 1755
  final val KEY_Cyrillic_shcha: Int = 1757
  final val KEY_Cyrillic_shha: Int = 16778427
  final val KEY_Cyrillic_shorti: Int = 1738
  final val KEY_Cyrillic_softsign: Int = 1752
  final val KEY_Cyrillic_te: Int = 1748
  final val KEY_Cyrillic_tse: Int = 1731
  final val KEY_Cyrillic_u: Int = 1749
  final val KEY_Cyrillic_u_macron: Int = 16778479
  final val KEY_Cyrillic_u_straight: Int = 16778415
  final val KEY_Cyrillic_u_straight_bar: Int = 16778417
  final val KEY_Cyrillic_ve: Int = 1751
  final val KEY_Cyrillic_ya: Int = 1745
  final val KEY_Cyrillic_yeru: Int = 1753
  final val KEY_Cyrillic_yu: Int = 1728
  final val KEY_Cyrillic_ze: Int = 1754
  final val KEY_Cyrillic_zhe: Int = 1750
  final val KEY_Cyrillic_zhe_descender: Int = 16778391
  final val KEY_D: Int = 68
  final val KEY_DOS: Int = 269025114
  final val KEY_Dabovedot: Int = 16784906
  final val KEY_Dcaron: Int = 463
  final val KEY_Delete: Int = 65535
  final val KEY_Display: Int = 269025113
  final val KEY_Documents: Int = 269025115
  final val KEY_DongSign: Int = 16785579
  final val KEY_Down: Int = 65364
  final val KEY_Dstroke: Int = 464
  final val KEY_E: Int = 69
  final val KEY_ENG: Int = 957
  final val KEY_ETH: Int = 208
  final val KEY_EZH: Int = 16777655
  final val KEY_Eabovedot: Int = 972
  final val KEY_Eacute: Int = 201
  final val KEY_Ebelowdot: Int = 16785080
  final val KEY_Ecaron: Int = 460
  final val KEY_Ecircumflex: Int = 202
  final val KEY_Ecircumflexacute: Int = 16785086
  final val KEY_Ecircumflexbelowdot: Int = 16785094
  final val KEY_Ecircumflexgrave: Int = 16785088
  final val KEY_Ecircumflexhook: Int = 16785090
  final val KEY_Ecircumflextilde: Int = 16785092
  final val KEY_EcuSign: Int = 16785568
  final val KEY_Ediaeresis: Int = 203
  final val KEY_Egrave: Int = 200
  final val KEY_Ehook: Int = 16785082
  final val KEY_Eisu_Shift: Int = 65327
  final val KEY_Eisu_toggle: Int = 65328
  final val KEY_Eject: Int = 269025068
  final val KEY_Emacron: Int = 938
  final val KEY_End: Int = 65367
  final val KEY_Eogonek: Int = 458
  final val KEY_Escape: Int = 65307
  final val KEY_Eth: Int = 208
  final val KEY_Etilde: Int = 16785084
  final val KEY_EuroSign: Int = 8364
  final val KEY_Excel: Int = 269025116
  final val KEY_Execute: Int = 65378
  final val KEY_Explorer: Int = 269025117
  final val KEY_F: Int = 70
  final val KEY_F1: Int = 65470
  final val KEY_F10: Int = 65479
  final val KEY_F11: Int = 65480
  final val KEY_F12: Int = 65481
  final val KEY_F13: Int = 65482
  final val KEY_F14: Int = 65483
  final val KEY_F15: Int = 65484
  final val KEY_F16: Int = 65485
  final val KEY_F17: Int = 65486
  final val KEY_F18: Int = 65487
  final val KEY_F19: Int = 65488
  final val KEY_F2: Int = 65471
  final val KEY_F20: Int = 65489
  final val KEY_F21: Int = 65490
  final val KEY_F22: Int = 65491
  final val KEY_F23: Int = 65492
  final val KEY_F24: Int = 65493
  final val KEY_F25: Int = 65494
  final val KEY_F26: Int = 65495
  final val KEY_F27: Int = 65496
  final val KEY_F28: Int = 65497
  final val KEY_F29: Int = 65498
  final val KEY_F3: Int = 65472
  final val KEY_F30: Int = 65499
  final val KEY_F31: Int = 65500
  final val KEY_F32: Int = 65501
  final val KEY_F33: Int = 65502
  final val KEY_F34: Int = 65503
  final val KEY_F35: Int = 65504
  final val KEY_F4: Int = 65473
  final val KEY_F5: Int = 65474
  final val KEY_F6: Int = 65475
  final val KEY_F7: Int = 65476
  final val KEY_F8: Int = 65477
  final val KEY_F9: Int = 65478
  final val KEY_FFrancSign: Int = 16785571
  final val KEY_Fabovedot: Int = 16784926
  final val KEY_Farsi_0: Int = 16778992
  final val KEY_Farsi_1: Int = 16778993
  final val KEY_Farsi_2: Int = 16778994
  final val KEY_Farsi_3: Int = 16778995
  final val KEY_Farsi_4: Int = 16778996
  final val KEY_Farsi_5: Int = 16778997
  final val KEY_Farsi_6: Int = 16778998
  final val KEY_Farsi_7: Int = 16778999
  final val KEY_Farsi_8: Int = 16779000
  final val KEY_Farsi_9: Int = 16779001
  final val KEY_Farsi_yeh: Int = 16778956
  final val KEY_Favorites: Int = 269025072
  final val KEY_Finance: Int = 269025084
  final val KEY_Find: Int = 65384
  final val KEY_First_Virtual_Screen: Int = 65232
  final val KEY_Forward: Int = 269025063
  final val KEY_FrameBack: Int = 269025181
  final val KEY_FrameForward: Int = 269025182
  final val KEY_G: Int = 71
  final val KEY_Gabovedot: Int = 725
  final val KEY_Game: Int = 269025118
  final val KEY_Gbreve: Int = 683
  final val KEY_Gcaron: Int = 16777702
  final val KEY_Gcedilla: Int = 939
  final val KEY_Gcircumflex: Int = 728
  final val KEY_Georgian_an: Int = 16781520
  final val KEY_Georgian_ban: Int = 16781521
  final val KEY_Georgian_can: Int = 16781546
  final val KEY_Georgian_char: Int = 16781549
  final val KEY_Georgian_chin: Int = 16781545
  final val KEY_Georgian_cil: Int = 16781548
  final val KEY_Georgian_don: Int = 16781523
  final val KEY_Georgian_en: Int = 16781524
  final val KEY_Georgian_fi: Int = 16781558
  final val KEY_Georgian_gan: Int = 16781522
  final val KEY_Georgian_ghan: Int = 16781542
  final val KEY_Georgian_hae: Int = 16781552
  final val KEY_Georgian_har: Int = 16781556
  final val KEY_Georgian_he: Int = 16781553
  final val KEY_Georgian_hie: Int = 16781554
  final val KEY_Georgian_hoe: Int = 16781557
  final val KEY_Georgian_in: Int = 16781528
  final val KEY_Georgian_jhan: Int = 16781551
  final val KEY_Georgian_jil: Int = 16781547
  final val KEY_Georgian_kan: Int = 16781529
  final val KEY_Georgian_khar: Int = 16781541
  final val KEY_Georgian_las: Int = 16781530
  final val KEY_Georgian_man: Int = 16781531
  final val KEY_Georgian_nar: Int = 16781532
  final val KEY_Georgian_on: Int = 16781533
  final val KEY_Georgian_par: Int = 16781534
  final val KEY_Georgian_phar: Int = 16781540
  final val KEY_Georgian_qar: Int = 16781543
  final val KEY_Georgian_rae: Int = 16781536
  final val KEY_Georgian_san: Int = 16781537
  final val KEY_Georgian_shin: Int = 16781544
  final val KEY_Georgian_tan: Int = 16781527
  final val KEY_Georgian_tar: Int = 16781538
  final val KEY_Georgian_un: Int = 16781539
  final val KEY_Georgian_vin: Int = 16781525
  final val KEY_Georgian_we: Int = 16781555
  final val KEY_Georgian_xan: Int = 16781550
  final val KEY_Georgian_zen: Int = 16781526
  final val KEY_Georgian_zhar: Int = 16781535
  final val KEY_Go: Int = 269025119
  final val KEY_Greek_ALPHA: Int = 1985
  final val KEY_Greek_ALPHAaccent: Int = 1953
  final val KEY_Greek_BETA: Int = 1986
  final val KEY_Greek_CHI: Int = 2007
  final val KEY_Greek_DELTA: Int = 1988
  final val KEY_Greek_EPSILON: Int = 1989
  final val KEY_Greek_EPSILONaccent: Int = 1954
  final val KEY_Greek_ETA: Int = 1991
  final val KEY_Greek_ETAaccent: Int = 1955
  final val KEY_Greek_GAMMA: Int = 1987
  final val KEY_Greek_IOTA: Int = 1993
  final val KEY_Greek_IOTAaccent: Int = 1956
  final val KEY_Greek_IOTAdiaeresis: Int = 1957
  final val KEY_Greek_IOTAdieresis: Int = 1957
  final val KEY_Greek_KAPPA: Int = 1994
  final val KEY_Greek_LAMBDA: Int = 1995
  final val KEY_Greek_LAMDA: Int = 1995
  final val KEY_Greek_MU: Int = 1996
  final val KEY_Greek_NU: Int = 1997
  final val KEY_Greek_OMEGA: Int = 2009
  final val KEY_Greek_OMEGAaccent: Int = 1963
  final val KEY_Greek_OMICRON: Int = 1999
  final val KEY_Greek_OMICRONaccent: Int = 1959
  final val KEY_Greek_PHI: Int = 2006
  final val KEY_Greek_PI: Int = 2000
  final val KEY_Greek_PSI: Int = 2008
  final val KEY_Greek_RHO: Int = 2001
  final val KEY_Greek_SIGMA: Int = 2002
  final val KEY_Greek_TAU: Int = 2004
  final val KEY_Greek_THETA: Int = 1992
  final val KEY_Greek_UPSILON: Int = 2005
  final val KEY_Greek_UPSILONaccent: Int = 1960
  final val KEY_Greek_UPSILONdieresis: Int = 1961
  final val KEY_Greek_XI: Int = 1998
  final val KEY_Greek_ZETA: Int = 1990
  final val KEY_Greek_accentdieresis: Int = 1966
  final val KEY_Greek_alpha: Int = 2017
  final val KEY_Greek_alphaaccent: Int = 1969
  final val KEY_Greek_beta: Int = 2018
  final val KEY_Greek_chi: Int = 2039
  final val KEY_Greek_delta: Int = 2020
  final val KEY_Greek_epsilon: Int = 2021
  final val KEY_Greek_epsilonaccent: Int = 1970
  final val KEY_Greek_eta: Int = 2023
  final val KEY_Greek_etaaccent: Int = 1971
  final val KEY_Greek_finalsmallsigma: Int = 2035
  final val KEY_Greek_gamma: Int = 2019
  final val KEY_Greek_horizbar: Int = 1967
  final val KEY_Greek_iota: Int = 2025
  final val KEY_Greek_iotaaccent: Int = 1972
  final val KEY_Greek_iotaaccentdieresis: Int = 1974
  final val KEY_Greek_iotadieresis: Int = 1973
  final val KEY_Greek_kappa: Int = 2026
  final val KEY_Greek_lambda: Int = 2027
  final val KEY_Greek_lamda: Int = 2027
  final val KEY_Greek_mu: Int = 2028
  final val KEY_Greek_nu: Int = 2029
  final val KEY_Greek_omega: Int = 2041
  final val KEY_Greek_omegaaccent: Int = 1979
  final val KEY_Greek_omicron: Int = 2031
  final val KEY_Greek_omicronaccent: Int = 1975
  final val KEY_Greek_phi: Int = 2038
  final val KEY_Greek_pi: Int = 2032
  final val KEY_Greek_psi: Int = 2040
  final val KEY_Greek_rho: Int = 2033
  final val KEY_Greek_sigma: Int = 2034
  final val KEY_Greek_switch: Int = 65406
  final val KEY_Greek_tau: Int = 2036
  final val KEY_Greek_theta: Int = 2024
  final val KEY_Greek_upsilon: Int = 2037
  final val KEY_Greek_upsilonaccent: Int = 1976
  final val KEY_Greek_upsilonaccentdieresis: Int = 1978
  final val KEY_Greek_upsilondieresis: Int = 1977
  final val KEY_Greek_xi: Int = 2030
  final val KEY_Greek_zeta: Int = 2022
  final val KEY_Green: Int = 269025188
  final val KEY_H: Int = 72
  final val KEY_Hangul: Int = 65329
  final val KEY_Hangul_A: Int = 3775
  final val KEY_Hangul_AE: Int = 3776
  final val KEY_Hangul_AraeA: Int = 3830
  final val KEY_Hangul_AraeAE: Int = 3831
  final val KEY_Hangul_Banja: Int = 65337
  final val KEY_Hangul_Cieuc: Int = 3770
  final val KEY_Hangul_Codeinput: Int = 65335
  final val KEY_Hangul_Dikeud: Int = 3751
  final val KEY_Hangul_E: Int = 3780
  final val KEY_Hangul_EO: Int = 3779
  final val KEY_Hangul_EU: Int = 3793
  final val KEY_Hangul_End: Int = 65331
  final val KEY_Hangul_Hanja: Int = 65332
  final val KEY_Hangul_Hieuh: Int = 3774
  final val KEY_Hangul_I: Int = 3795
  final val KEY_Hangul_Ieung: Int = 3767
  final val KEY_Hangul_J_Cieuc: Int = 3818
  final val KEY_Hangul_J_Dikeud: Int = 3802
  final val KEY_Hangul_J_Hieuh: Int = 3822
  final val KEY_Hangul_J_Ieung: Int = 3816
  final val KEY_Hangul_J_Jieuj: Int = 3817
  final val KEY_Hangul_J_Khieuq: Int = 3819
  final val KEY_Hangul_J_Kiyeog: Int = 3796
  final val KEY_Hangul_J_KiyeogSios: Int = 3798
  final val KEY_Hangul_J_KkogjiDalrinIeung: Int = 3833
  final val KEY_Hangul_J_Mieum: Int = 3811
  final val KEY_Hangul_J_Nieun: Int = 3799
  final val KEY_Hangul_J_NieunHieuh: Int = 3801
  final val KEY_Hangul_J_NieunJieuj: Int = 3800
  final val KEY_Hangul_J_PanSios: Int = 3832
  final val KEY_Hangul_J_Phieuf: Int = 3821
  final val KEY_Hangul_J_Pieub: Int = 3812
  final val KEY_Hangul_J_PieubSios: Int = 3813
  final val KEY_Hangul_J_Rieul: Int = 3803
  final val KEY_Hangul_J_RieulHieuh: Int = 3810
  final val KEY_Hangul_J_RieulKiyeog: Int = 3804
  final val KEY_Hangul_J_RieulMieum: Int = 3805
  final val KEY_Hangul_J_RieulPhieuf: Int = 3809
  final val KEY_Hangul_J_RieulPieub: Int = 3806
  final val KEY_Hangul_J_RieulSios: Int = 3807
  final val KEY_Hangul_J_RieulTieut: Int = 3808
  final val KEY_Hangul_J_Sios: Int = 3814
  final val KEY_Hangul_J_SsangKiyeog: Int = 3797
  final val KEY_Hangul_J_SsangSios: Int = 3815
  final val KEY_Hangul_J_Tieut: Int = 3820
  final val KEY_Hangul_J_YeorinHieuh: Int = 3834
  final val KEY_Hangul_Jamo: Int = 65333
  final val KEY_Hangul_Jeonja: Int = 65336
  final val KEY_Hangul_Jieuj: Int = 3768
  final val KEY_Hangul_Khieuq: Int = 3771
  final val KEY_Hangul_Kiyeog: Int = 3745
  final val KEY_Hangul_KiyeogSios: Int = 3747
  final val KEY_Hangul_KkogjiDalrinIeung: Int = 3827
  final val KEY_Hangul_Mieum: Int = 3761
  final val KEY_Hangul_MultipleCandidate: Int = 65341
  final val KEY_Hangul_Nieun: Int = 3748
  final val KEY_Hangul_NieunHieuh: Int = 3750
  final val KEY_Hangul_NieunJieuj: Int = 3749
  final val KEY_Hangul_O: Int = 3783
  final val KEY_Hangul_OE: Int = 3786
  final val KEY_Hangul_PanSios: Int = 3826
  final val KEY_Hangul_Phieuf: Int = 3773
  final val KEY_Hangul_Pieub: Int = 3762
  final val KEY_Hangul_PieubSios: Int = 3764
  final val KEY_Hangul_PostHanja: Int = 65339
  final val KEY_Hangul_PreHanja: Int = 65338
  final val KEY_Hangul_PreviousCandidate: Int = 65342
  final val KEY_Hangul_Rieul: Int = 3753
  final val KEY_Hangul_RieulHieuh: Int = 3760
  final val KEY_Hangul_RieulKiyeog: Int = 3754
  final val KEY_Hangul_RieulMieum: Int = 3755
  final val KEY_Hangul_RieulPhieuf: Int = 3759
  final val KEY_Hangul_RieulPieub: Int = 3756
  final val KEY_Hangul_RieulSios: Int = 3757
  final val KEY_Hangul_RieulTieut: Int = 3758
  final val KEY_Hangul_RieulYeorinHieuh: Int = 3823
  final val KEY_Hangul_Romaja: Int = 65334
  final val KEY_Hangul_SingleCandidate: Int = 65340
  final val KEY_Hangul_Sios: Int = 3765
  final val KEY_Hangul_Special: Int = 65343
  final val KEY_Hangul_SsangDikeud: Int = 3752
  final val KEY_Hangul_SsangJieuj: Int = 3769
  final val KEY_Hangul_SsangKiyeog: Int = 3746
  final val KEY_Hangul_SsangPieub: Int = 3763
  final val KEY_Hangul_SsangSios: Int = 3766
  final val KEY_Hangul_Start: Int = 65330
  final val KEY_Hangul_SunkyeongeumMieum: Int = 3824
  final val KEY_Hangul_SunkyeongeumPhieuf: Int = 3828
  final val KEY_Hangul_SunkyeongeumPieub: Int = 3825
  final val KEY_Hangul_Tieut: Int = 3772
  final val KEY_Hangul_U: Int = 3788
  final val KEY_Hangul_WA: Int = 3784
  final val KEY_Hangul_WAE: Int = 3785
  final val KEY_Hangul_WE: Int = 3790
  final val KEY_Hangul_WEO: Int = 3789
  final val KEY_Hangul_WI: Int = 3791
  final val KEY_Hangul_YA: Int = 3777
  final val KEY_Hangul_YAE: Int = 3778
  final val KEY_Hangul_YE: Int = 3782
  final val KEY_Hangul_YEO: Int = 3781
  final val KEY_Hangul_YI: Int = 3794
  final val KEY_Hangul_YO: Int = 3787
  final val KEY_Hangul_YU: Int = 3792
  final val KEY_Hangul_YeorinHieuh: Int = 3829
  final val KEY_Hangul_switch: Int = 65406
  final val KEY_Hankaku: Int = 65321
  final val KEY_Hcircumflex: Int = 678
  final val KEY_Hebrew_switch: Int = 65406
  final val KEY_Help: Int = 65386
  final val KEY_Henkan: Int = 65315
  final val KEY_Henkan_Mode: Int = 65315
  final val KEY_Hibernate: Int = 269025192
  final val KEY_Hiragana: Int = 65317
  final val KEY_Hiragana_Katakana: Int = 65319
  final val KEY_History: Int = 269025079
  final val KEY_Home: Int = 65360
  final val KEY_HomePage: Int = 269025048
  final val KEY_HotLinks: Int = 269025082
  final val KEY_Hstroke: Int = 673
  final val KEY_Hyper_L: Int = 65517
  final val KEY_Hyper_R: Int = 65518
  final val KEY_I: Int = 73
  final val KEY_ISO_Center_Object: Int = 65075
  final val KEY_ISO_Continuous_Underline: Int = 65072
  final val KEY_ISO_Discontinuous_Underline: Int = 65073
  final val KEY_ISO_Emphasize: Int = 65074
  final val KEY_ISO_Enter: Int = 65076
  final val KEY_ISO_Fast_Cursor_Down: Int = 65071
  final val KEY_ISO_Fast_Cursor_Left: Int = 65068
  final val KEY_ISO_Fast_Cursor_Right: Int = 65069
  final val KEY_ISO_Fast_Cursor_Up: Int = 65070
  final val KEY_ISO_First_Group: Int = 65036
  final val KEY_ISO_First_Group_Lock: Int = 65037
  final val KEY_ISO_Group_Latch: Int = 65030
  final val KEY_ISO_Group_Lock: Int = 65031
  final val KEY_ISO_Group_Shift: Int = 65406
  final val KEY_ISO_Last_Group: Int = 65038
  final val KEY_ISO_Last_Group_Lock: Int = 65039
  final val KEY_ISO_Left_Tab: Int = 65056
  final val KEY_ISO_Level2_Latch: Int = 65026
  final val KEY_ISO_Level3_Latch: Int = 65028
  final val KEY_ISO_Level3_Lock: Int = 65029
  final val KEY_ISO_Level3_Shift: Int = 65027
  final val KEY_ISO_Level5_Latch: Int = 65042
  final val KEY_ISO_Level5_Lock: Int = 65043
  final val KEY_ISO_Level5_Shift: Int = 65041
  final val KEY_ISO_Lock: Int = 65025
  final val KEY_ISO_Move_Line_Down: Int = 65058
  final val KEY_ISO_Move_Line_Up: Int = 65057
  final val KEY_ISO_Next_Group: Int = 65032
  final val KEY_ISO_Next_Group_Lock: Int = 65033
  final val KEY_ISO_Partial_Line_Down: Int = 65060
  final val KEY_ISO_Partial_Line_Up: Int = 65059
  final val KEY_ISO_Partial_Space_Left: Int = 65061
  final val KEY_ISO_Partial_Space_Right: Int = 65062
  final val KEY_ISO_Prev_Group: Int = 65034
  final val KEY_ISO_Prev_Group_Lock: Int = 65035
  final val KEY_ISO_Release_Both_Margins: Int = 65067
  final val KEY_ISO_Release_Margin_Left: Int = 65065
  final val KEY_ISO_Release_Margin_Right: Int = 65066
  final val KEY_ISO_Set_Margin_Left: Int = 65063
  final val KEY_ISO_Set_Margin_Right: Int = 65064
  final val KEY_Iabovedot: Int = 681
  final val KEY_Iacute: Int = 205
  final val KEY_Ibelowdot: Int = 16785098
  final val KEY_Ibreve: Int = 16777516
  final val KEY_Icircumflex: Int = 206
  final val KEY_Idiaeresis: Int = 207
  final val KEY_Igrave: Int = 204
  final val KEY_Ihook: Int = 16785096
  final val KEY_Imacron: Int = 975
  final val KEY_Insert: Int = 65379
  final val KEY_Iogonek: Int = 967
  final val KEY_Itilde: Int = 933
  final val KEY_J: Int = 74
  final val KEY_Jcircumflex: Int = 684
  final val KEY_K: Int = 75
  final val KEY_KP_0: Int = 65456
  final val KEY_KP_1: Int = 65457
  final val KEY_KP_2: Int = 65458
  final val KEY_KP_3: Int = 65459
  final val KEY_KP_4: Int = 65460
  final val KEY_KP_5: Int = 65461
  final val KEY_KP_6: Int = 65462
  final val KEY_KP_7: Int = 65463
  final val KEY_KP_8: Int = 65464
  final val KEY_KP_9: Int = 65465
  final val KEY_KP_Add: Int = 65451
  final val KEY_KP_Begin: Int = 65437
  final val KEY_KP_Decimal: Int = 65454
  final val KEY_KP_Delete: Int = 65439
  final val KEY_KP_Divide: Int = 65455
  final val KEY_KP_Down: Int = 65433
  final val KEY_KP_End: Int = 65436
  final val KEY_KP_Enter: Int = 65421
  final val KEY_KP_Equal: Int = 65469
  final val KEY_KP_F1: Int = 65425
  final val KEY_KP_F2: Int = 65426
  final val KEY_KP_F3: Int = 65427
  final val KEY_KP_F4: Int = 65428
  final val KEY_KP_Home: Int = 65429
  final val KEY_KP_Insert: Int = 65438
  final val KEY_KP_Left: Int = 65430
  final val KEY_KP_Multiply: Int = 65450
  final val KEY_KP_Next: Int = 65435
  final val KEY_KP_Page_Down: Int = 65435
  final val KEY_KP_Page_Up: Int = 65434
  final val KEY_KP_Prior: Int = 65434
  final val KEY_KP_Right: Int = 65432
  final val KEY_KP_Separator: Int = 65452
  final val KEY_KP_Space: Int = 65408
  final val KEY_KP_Subtract: Int = 65453
  final val KEY_KP_Tab: Int = 65417
  final val KEY_KP_Up: Int = 65431
  final val KEY_Kana_Lock: Int = 65325
  final val KEY_Kana_Shift: Int = 65326
  final val KEY_Kanji: Int = 65313
  final val KEY_Kanji_Bangou: Int = 65335
  final val KEY_Katakana: Int = 65318
  final val KEY_KbdBrightnessDown: Int = 269025030
  final val KEY_KbdBrightnessUp: Int = 269025029
  final val KEY_KbdLightOnOff: Int = 269025028
  final val KEY_Kcedilla: Int = 979
  final val KEY_Keyboard: Int = 269025203
  final val KEY_Korean_Won: Int = 3839
  final val KEY_L: Int = 76
  final val KEY_L1: Int = 65480
  final val KEY_L10: Int = 65489
  final val KEY_L2: Int = 65481
  final val KEY_L3: Int = 65482
  final val KEY_L4: Int = 65483
  final val KEY_L5: Int = 65484
  final val KEY_L6: Int = 65485
  final val KEY_L7: Int = 65486
  final val KEY_L8: Int = 65487
  final val KEY_L9: Int = 65488
  final val KEY_Lacute: Int = 453
  final val KEY_Last_Virtual_Screen: Int = 65236
  final val KEY_Launch0: Int = 269025088
  final val KEY_Launch1: Int = 269025089
  final val KEY_Launch2: Int = 269025090
  final val KEY_Launch3: Int = 269025091
  final val KEY_Launch4: Int = 269025092
  final val KEY_Launch5: Int = 269025093
  final val KEY_Launch6: Int = 269025094
  final val KEY_Launch7: Int = 269025095
  final val KEY_Launch8: Int = 269025096
  final val KEY_Launch9: Int = 269025097
  final val KEY_LaunchA: Int = 269025098
  final val KEY_LaunchB: Int = 269025099
  final val KEY_LaunchC: Int = 269025100
  final val KEY_LaunchD: Int = 269025101
  final val KEY_LaunchE: Int = 269025102
  final val KEY_LaunchF: Int = 269025103
  final val KEY_Lbelowdot: Int = 16784950
  final val KEY_Lcaron: Int = 421
  final val KEY_Lcedilla: Int = 934
  final val KEY_Left: Int = 65361
  final val KEY_LightBulb: Int = 269025077
  final val KEY_Linefeed: Int = 65290
  final val KEY_LiraSign: Int = 16785572
  final val KEY_LogGrabInfo: Int = 269024805
  final val KEY_LogOff: Int = 269025121
  final val KEY_LogWindowTree: Int = 269024804
  final val KEY_Lstroke: Int = 419
  final val KEY_M: Int = 77
  final val KEY_Mabovedot: Int = 16784960
  final val KEY_Macedonia_DSE: Int = 1717
  final val KEY_Macedonia_GJE: Int = 1714
  final val KEY_Macedonia_KJE: Int = 1724
  final val KEY_Macedonia_dse: Int = 1701
  final val KEY_Macedonia_gje: Int = 1698
  final val KEY_Macedonia_kje: Int = 1708
  final val KEY_Mae_Koho: Int = 65342
  final val KEY_Mail: Int = 269025049
  final val KEY_MailForward: Int = 269025168
  final val KEY_Market: Int = 269025122
  final val KEY_Massyo: Int = 65324
  final val KEY_Meeting: Int = 269025123
  final val KEY_Memo: Int = 269025054
  final val KEY_Menu: Int = 65383
  final val KEY_MenuKB: Int = 269025125
  final val KEY_MenuPB: Int = 269025126
  final val KEY_Messenger: Int = 269025166
  final val KEY_Meta_L: Int = 65511
  final val KEY_Meta_R: Int = 65512
  final val KEY_MillSign: Int = 16785573
  final val KEY_ModeLock: Int = 269025025
  final val KEY_Mode_switch: Int = 65406
  final val KEY_MonBrightnessDown: Int = 269025027
  final val KEY_MonBrightnessUp: Int = 269025026
  final val KEY_MouseKeys_Accel_Enable: Int = 65143
  final val KEY_MouseKeys_Enable: Int = 65142
  final val KEY_Muhenkan: Int = 65314
  final val KEY_Multi_key: Int = 65312
  final val KEY_MultipleCandidate: Int = 65341
  final val KEY_Music: Int = 269025170
  final val KEY_MyComputer: Int = 269025075
  final val KEY_MySites: Int = 269025127
  final val KEY_N: Int = 78
  final val KEY_Nacute: Int = 465
  final val KEY_NairaSign: Int = 16785574
  final val KEY_Ncaron: Int = 466
  final val KEY_Ncedilla: Int = 977
  final val KEY_New: Int = 269025128
  final val KEY_NewSheqelSign: Int = 16785578
  final val KEY_News: Int = 269025129
  final val KEY_Next: Int = 65366
  final val KEY_Next_VMode: Int = 269024802
  final val KEY_Next_Virtual_Screen: Int = 65234
  final val KEY_Ntilde: Int = 209
  final val KEY_Num_Lock: Int = 65407
  final val KEY_O: Int = 79
  final val KEY_OE: Int = 5052
  final val KEY_Oacute: Int = 211
  final val KEY_Obarred: Int = 16777631
  final val KEY_Obelowdot: Int = 16785100
  final val KEY_Ocaron: Int = 16777681
  final val KEY_Ocircumflex: Int = 212
  final val KEY_Ocircumflexacute: Int = 16785104
  final val KEY_Ocircumflexbelowdot: Int = 16785112
  final val KEY_Ocircumflexgrave: Int = 16785106
  final val KEY_Ocircumflexhook: Int = 16785108
  final val KEY_Ocircumflextilde: Int = 16785110
  final val KEY_Odiaeresis: Int = 214
  final val KEY_Odoubleacute: Int = 469
  final val KEY_OfficeHome: Int = 269025130
  final val KEY_Ograve: Int = 210
  final val KEY_Ohook: Int = 16785102
  final val KEY_Ohorn: Int = 16777632
  final val KEY_Ohornacute: Int = 16785114
  final val KEY_Ohornbelowdot: Int = 16785122
  final val KEY_Ohorngrave: Int = 16785116
  final val KEY_Ohornhook: Int = 16785118
  final val KEY_Ohorntilde: Int = 16785120
  final val KEY_Omacron: Int = 978
  final val KEY_Ooblique: Int = 216
  final val KEY_Open: Int = 269025131
  final val KEY_OpenURL: Int = 269025080
  final val KEY_Option: Int = 269025132
  final val KEY_Oslash: Int = 216
  final val KEY_Otilde: Int = 213
  final val KEY_Overlay1_Enable: Int = 65144
  final val KEY_Overlay2_Enable: Int = 65145
  final val KEY_P: Int = 80
  final val KEY_Pabovedot: Int = 16784982
  final val KEY_Page_Down: Int = 65366
  final val KEY_Page_Up: Int = 65365
  final val KEY_Paste: Int = 269025133
  final val KEY_Pause: Int = 65299
  final val KEY_PesetaSign: Int = 16785575
  final val KEY_Phone: Int = 269025134
  final val KEY_Pictures: Int = 269025169
  final val KEY_Pointer_Accelerate: Int = 65274
  final val KEY_Pointer_Button1: Int = 65257
  final val KEY_Pointer_Button2: Int = 65258
  final val KEY_Pointer_Button3: Int = 65259
  final val KEY_Pointer_Button4: Int = 65260
  final val KEY_Pointer_Button5: Int = 65261
  final val KEY_Pointer_Button_Dflt: Int = 65256
  final val KEY_Pointer_DblClick1: Int = 65263
  final val KEY_Pointer_DblClick2: Int = 65264
  final val KEY_Pointer_DblClick3: Int = 65265
  final val KEY_Pointer_DblClick4: Int = 65266
  final val KEY_Pointer_DblClick5: Int = 65267
  final val KEY_Pointer_DblClick_Dflt: Int = 65262
  final val KEY_Pointer_DfltBtnNext: Int = 65275
  final val KEY_Pointer_DfltBtnPrev: Int = 65276
  final val KEY_Pointer_Down: Int = 65251
  final val KEY_Pointer_DownLeft: Int = 65254
  final val KEY_Pointer_DownRight: Int = 65255
  final val KEY_Pointer_Drag1: Int = 65269
  final val KEY_Pointer_Drag2: Int = 65270
  final val KEY_Pointer_Drag3: Int = 65271
  final val KEY_Pointer_Drag4: Int = 65272
  final val KEY_Pointer_Drag5: Int = 65277
  final val KEY_Pointer_Drag_Dflt: Int = 65268
  final val KEY_Pointer_EnableKeys: Int = 65273
  final val KEY_Pointer_Left: Int = 65248
  final val KEY_Pointer_Right: Int = 65249
  final val KEY_Pointer_Up: Int = 65250
  final val KEY_Pointer_UpLeft: Int = 65252
  final val KEY_Pointer_UpRight: Int = 65253
  final val KEY_PowerDown: Int = 269025057
  final val KEY_PowerOff: Int = 269025066
  final val KEY_Prev_VMode: Int = 269024803
  final val KEY_Prev_Virtual_Screen: Int = 65233
  final val KEY_PreviousCandidate: Int = 65342
  final val KEY_Print: Int = 65377
  final val KEY_Prior: Int = 65365
  final val KEY_Q: Int = 81
  final val KEY_R: Int = 82
  final val KEY_R1: Int = 65490
  final val KEY_R10: Int = 65499
  final val KEY_R11: Int = 65500
  final val KEY_R12: Int = 65501
  final val KEY_R13: Int = 65502
  final val KEY_R14: Int = 65503
  final val KEY_R15: Int = 65504
  final val KEY_R2: Int = 65491
  final val KEY_R3: Int = 65492
  final val KEY_R4: Int = 65493
  final val KEY_R5: Int = 65494
  final val KEY_R6: Int = 65495
  final val KEY_R7: Int = 65496
  final val KEY_R8: Int = 65497
  final val KEY_R9: Int = 65498
  final val KEY_RFKill: Int = 269025205
  final val KEY_Racute: Int = 448
  final val KEY_Rcaron: Int = 472
  final val KEY_Rcedilla: Int = 931
  final val KEY_Red: Int = 269025187
  final val KEY_Redo: Int = 65382
  final val KEY_Refresh: Int = 269025065
  final val KEY_Reload: Int = 269025139
  final val KEY_RepeatKeys_Enable: Int = 65138
  final val KEY_Reply: Int = 269025138
  final val KEY_Return: Int = 65293
  final val KEY_Right: Int = 65363
  final val KEY_RockerDown: Int = 269025060
  final val KEY_RockerEnter: Int = 269025061
  final val KEY_RockerUp: Int = 269025059
  final val KEY_Romaji: Int = 65316
  final val KEY_RotateWindows: Int = 269025140
  final val KEY_RotationKB: Int = 269025142
  final val KEY_RotationPB: Int = 269025141
  final val KEY_RupeeSign: Int = 16785576
  final val KEY_S: Int = 83
  final val KEY_SCHWA: Int = 16777615
  final val KEY_Sabovedot: Int = 16784992
  final val KEY_Sacute: Int = 422
  final val KEY_Save: Int = 269025143
  final val KEY_Scaron: Int = 425
  final val KEY_Scedilla: Int = 426
  final val KEY_Scircumflex: Int = 734
  final val KEY_ScreenSaver: Int = 269025069
  final val KEY_ScrollClick: Int = 269025146
  final val KEY_ScrollDown: Int = 269025145
  final val KEY_ScrollUp: Int = 269025144
  final val KEY_Scroll_Lock: Int = 65300
  final val KEY_Search: Int = 269025051
  final val KEY_Select: Int = 65376
  final val KEY_SelectButton: Int = 269025184
  final val KEY_Send: Int = 269025147
  final val KEY_Serbian_DJE: Int = 1713
  final val KEY_Serbian_DZE: Int = 1727
  final val KEY_Serbian_JE: Int = 1720
  final val KEY_Serbian_LJE: Int = 1721
  final val KEY_Serbian_NJE: Int = 1722
  final val KEY_Serbian_TSHE: Int = 1723
  final val KEY_Serbian_dje: Int = 1697
  final val KEY_Serbian_dze: Int = 1711
  final val KEY_Serbian_je: Int = 1704
  final val KEY_Serbian_lje: Int = 1705
  final val KEY_Serbian_nje: Int = 1706
  final val KEY_Serbian_tshe: Int = 1707
  final val KEY_Shift_L: Int = 65505
  final val KEY_Shift_Lock: Int = 65510
  final val KEY_Shift_R: Int = 65506
  final val KEY_Shop: Int = 269025078
  final val KEY_SingleCandidate: Int = 65340
  final val KEY_Sinh_a: Int = 16780677
  final val KEY_Sinh_aa: Int = 16780678
  final val KEY_Sinh_aa2: Int = 16780751
  final val KEY_Sinh_ae: Int = 16780679
  final val KEY_Sinh_ae2: Int = 16780752
  final val KEY_Sinh_aee: Int = 16780680
  final val KEY_Sinh_aee2: Int = 16780753
  final val KEY_Sinh_ai: Int = 16780691
  final val KEY_Sinh_ai2: Int = 16780763
  final val KEY_Sinh_al: Int = 16780746
  final val KEY_Sinh_au: Int = 16780694
  final val KEY_Sinh_au2: Int = 16780766
  final val KEY_Sinh_ba: Int = 16780726
  final val KEY_Sinh_bha: Int = 16780727
  final val KEY_Sinh_ca: Int = 16780704
  final val KEY_Sinh_cha: Int = 16780705
  final val KEY_Sinh_dda: Int = 16780713
  final val KEY_Sinh_ddha: Int = 16780714
  final val KEY_Sinh_dha: Int = 16780719
  final val KEY_Sinh_dhha: Int = 16780720
  final val KEY_Sinh_e: Int = 16780689
  final val KEY_Sinh_e2: Int = 16780761
  final val KEY_Sinh_ee: Int = 16780690
  final val KEY_Sinh_ee2: Int = 16780762
  final val KEY_Sinh_fa: Int = 16780742
  final val KEY_Sinh_ga: Int = 16780700
  final val KEY_Sinh_gha: Int = 16780701
  final val KEY_Sinh_h2: Int = 16780675
  final val KEY_Sinh_ha: Int = 16780740
  final val KEY_Sinh_i: Int = 16780681
  final val KEY_Sinh_i2: Int = 16780754
  final val KEY_Sinh_ii: Int = 16780682
  final val KEY_Sinh_ii2: Int = 16780755
  final val KEY_Sinh_ja: Int = 16780706
  final val KEY_Sinh_jha: Int = 16780707
  final val KEY_Sinh_jnya: Int = 16780709
  final val KEY_Sinh_ka: Int = 16780698
  final val KEY_Sinh_kha: Int = 16780699
  final val KEY_Sinh_kunddaliya: Int = 16780788
  final val KEY_Sinh_la: Int = 16780733
  final val KEY_Sinh_lla: Int = 16780741
  final val KEY_Sinh_lu: Int = 16780687
  final val KEY_Sinh_lu2: Int = 16780767
  final val KEY_Sinh_luu: Int = 16780688
  final val KEY_Sinh_luu2: Int = 16780787
  final val KEY_Sinh_ma: Int = 16780728
  final val KEY_Sinh_mba: Int = 16780729
  final val KEY_Sinh_na: Int = 16780721
  final val KEY_Sinh_ndda: Int = 16780716
  final val KEY_Sinh_ndha: Int = 16780723
  final val KEY_Sinh_ng: Int = 16780674
  final val KEY_Sinh_ng2: Int = 16780702
  final val KEY_Sinh_nga: Int = 16780703
  final val KEY_Sinh_nja: Int = 16780710
  final val KEY_Sinh_nna: Int = 16780715
  final val KEY_Sinh_nya: Int = 16780708
  final val KEY_Sinh_o: Int = 16780692
  final val KEY_Sinh_o2: Int = 16780764
  final val KEY_Sinh_oo: Int = 16780693
  final val KEY_Sinh_oo2: Int = 16780765
  final val KEY_Sinh_pa: Int = 16780724
  final val KEY_Sinh_pha: Int = 16780725
  final val KEY_Sinh_ra: Int = 16780731
  final val KEY_Sinh_ri: Int = 16780685
  final val KEY_Sinh_rii: Int = 16780686
  final val KEY_Sinh_ru2: Int = 16780760
  final val KEY_Sinh_ruu2: Int = 16780786
  final val KEY_Sinh_sa: Int = 16780739
  final val KEY_Sinh_sha: Int = 16780737
  final val KEY_Sinh_ssha: Int = 16780738
  final val KEY_Sinh_tha: Int = 16780717
  final val KEY_Sinh_thha: Int = 16780718
  final val KEY_Sinh_tta: Int = 16780711
  final val KEY_Sinh_ttha: Int = 16780712
  final val KEY_Sinh_u: Int = 16780683
  final val KEY_Sinh_u2: Int = 16780756
  final val KEY_Sinh_uu: Int = 16780684
  final val KEY_Sinh_uu2: Int = 16780758
  final val KEY_Sinh_va: Int = 16780736
  final val KEY_Sinh_ya: Int = 16780730
  final val KEY_Sleep: Int = 269025071
  final val KEY_SlowKeys_Enable: Int = 65139
  final val KEY_Spell: Int = 269025148
  final val KEY_SplitScreen: Int = 269025149
  final val KEY_Standby: Int = 269025040
  final val KEY_Start: Int = 269025050
  final val KEY_StickyKeys_Enable: Int = 65141
  final val KEY_Stop: Int = 269025064
  final val KEY_Subtitle: Int = 269025178
  final val KEY_Super_L: Int = 65515
  final val KEY_Super_R: Int = 65516
  final val KEY_Support: Int = 269025150
  final val KEY_Suspend: Int = 269025191
  final val KEY_Switch_VT_1: Int = 269024769
  final val KEY_Switch_VT_10: Int = 269024778
  final val KEY_Switch_VT_11: Int = 269024779
  final val KEY_Switch_VT_12: Int = 269024780
  final val KEY_Switch_VT_2: Int = 269024770
  final val KEY_Switch_VT_3: Int = 269024771
  final val KEY_Switch_VT_4: Int = 269024772
  final val KEY_Switch_VT_5: Int = 269024773
  final val KEY_Switch_VT_6: Int = 269024774
  final val KEY_Switch_VT_7: Int = 269024775
  final val KEY_Switch_VT_8: Int = 269024776
  final val KEY_Switch_VT_9: Int = 269024777
  final val KEY_Sys_Req: Int = 65301
  final val KEY_T: Int = 84
  final val KEY_THORN: Int = 222
  final val KEY_Tab: Int = 65289
  final val KEY_Tabovedot: Int = 16785002
  final val KEY_TaskPane: Int = 269025151
  final val KEY_Tcaron: Int = 427
  final val KEY_Tcedilla: Int = 478
  final val KEY_Terminal: Int = 269025152
  final val KEY_Terminate_Server: Int = 65237
  final val KEY_Thai_baht: Int = 3551
  final val KEY_Thai_bobaimai: Int = 3514
  final val KEY_Thai_chochan: Int = 3496
  final val KEY_Thai_chochang: Int = 3498
  final val KEY_Thai_choching: Int = 3497
  final val KEY_Thai_chochoe: Int = 3500
  final val KEY_Thai_dochada: Int = 3502
  final val KEY_Thai_dodek: Int = 3508
  final val KEY_Thai_fofa: Int = 3517
  final val KEY_Thai_fofan: Int = 3519
  final val KEY_Thai_hohip: Int = 3531
  final val KEY_Thai_honokhuk: Int = 3534
  final val KEY_Thai_khokhai: Int = 3490
  final val KEY_Thai_khokhon: Int = 3493
  final val KEY_Thai_khokhuat: Int = 3491
  final val KEY_Thai_khokhwai: Int = 3492
  final val KEY_Thai_khorakhang: Int = 3494
  final val KEY_Thai_kokai: Int = 3489
  final val KEY_Thai_lakkhangyao: Int = 3557
  final val KEY_Thai_lekchet: Int = 3575
  final val KEY_Thai_lekha: Int = 3573
  final val KEY_Thai_lekhok: Int = 3574
  final val KEY_Thai_lekkao: Int = 3577
  final val KEY_Thai_leknung: Int = 3569
  final val KEY_Thai_lekpaet: Int = 3576
  final val KEY_Thai_leksam: Int = 3571
  final val KEY_Thai_leksi: Int = 3572
  final val KEY_Thai_leksong: Int = 3570
  final val KEY_Thai_leksun: Int = 3568
  final val KEY_Thai_lochula: Int = 3532
  final val KEY_Thai_loling: Int = 3525
  final val KEY_Thai_lu: Int = 3526
  final val KEY_Thai_maichattawa: Int = 3563
  final val KEY_Thai_maiek: Int = 3560
  final val KEY_Thai_maihanakat: Int = 3537
  final val KEY_Thai_maihanakat_maitho: Int = 3550
  final val KEY_Thai_maitaikhu: Int = 3559
  final val KEY_Thai_maitho: Int = 3561
  final val KEY_Thai_maitri: Int = 3562
  final val KEY_Thai_maiyamok: Int = 3558
  final val KEY_Thai_moma: Int = 3521
  final val KEY_Thai_ngongu: Int = 3495
  final val KEY_Thai_nikhahit: Int = 3565
  final val KEY_Thai_nonen: Int = 3507
  final val KEY_Thai_nonu: Int = 3513
  final val KEY_Thai_oang: Int = 3533
  final val KEY_Thai_paiyannoi: Int = 3535
  final val KEY_Thai_phinthu: Int = 3546
  final val KEY_Thai_phophan: Int = 3518
  final val KEY_Thai_phophung: Int = 3516
  final val KEY_Thai_phosamphao: Int = 3520
  final val KEY_Thai_popla: Int = 3515
  final val KEY_Thai_rorua: Int = 3523
  final val KEY_Thai_ru: Int = 3524
  final val KEY_Thai_saraa: Int = 3536
  final val KEY_Thai_saraaa: Int = 3538
  final val KEY_Thai_saraae: Int = 3553
  final val KEY_Thai_saraaimaimalai: Int = 3556
  final val KEY_Thai_saraaimaimuan: Int = 3555
  final val KEY_Thai_saraam: Int = 3539
  final val KEY_Thai_sarae: Int = 3552
  final val KEY_Thai_sarai: Int = 3540
  final val KEY_Thai_saraii: Int = 3541
  final val KEY_Thai_sarao: Int = 3554
  final val KEY_Thai_sarau: Int = 3544
  final val KEY_Thai_saraue: Int = 3542
  final val KEY_Thai_sarauee: Int = 3543
  final val KEY_Thai_sarauu: Int = 3545
  final val KEY_Thai_sorusi: Int = 3529
  final val KEY_Thai_sosala: Int = 3528
  final val KEY_Thai_soso: Int = 3499
  final val KEY_Thai_sosua: Int = 3530
  final val KEY_Thai_thanthakhat: Int = 3564
  final val KEY_Thai_thonangmontho: Int = 3505
  final val KEY_Thai_thophuthao: Int = 3506
  final val KEY_Thai_thothahan: Int = 3511
  final val KEY_Thai_thothan: Int = 3504
  final val KEY_Thai_thothong: Int = 3512
  final val KEY_Thai_thothung: Int = 3510
  final val KEY_Thai_topatak: Int = 3503
  final val KEY_Thai_totao: Int = 3509
  final val KEY_Thai_wowaen: Int = 3527
  final val KEY_Thai_yoyak: Int = 3522
  final val KEY_Thai_yoying: Int = 3501
  final val KEY_Thorn: Int = 222
  final val KEY_Time: Int = 269025183
  final val KEY_ToDoList: Int = 269025055
  final val KEY_Tools: Int = 269025153
  final val KEY_TopMenu: Int = 269025186
  final val KEY_TouchpadOff: Int = 269025201
  final val KEY_TouchpadOn: Int = 269025200
  final val KEY_TouchpadToggle: Int = 269025193
  final val KEY_Touroku: Int = 65323
  final val KEY_Travel: Int = 269025154
  final val KEY_Tslash: Int = 940
  final val KEY_U: Int = 85
  final val KEY_UWB: Int = 269025174
  final val KEY_Uacute: Int = 218
  final val KEY_Ubelowdot: Int = 16785124
  final val KEY_Ubreve: Int = 733
  final val KEY_Ucircumflex: Int = 219
  final val KEY_Udiaeresis: Int = 220
  final val KEY_Udoubleacute: Int = 475
  final val KEY_Ugrave: Int = 217
  final val KEY_Uhook: Int = 16785126
  final val KEY_Uhorn: Int = 16777647
  final val KEY_Uhornacute: Int = 16785128
  final val KEY_Uhornbelowdot: Int = 16785136
  final val KEY_Uhorngrave: Int = 16785130
  final val KEY_Uhornhook: Int = 16785132
  final val KEY_Uhorntilde: Int = 16785134
  final val KEY_Ukrainian_GHE_WITH_UPTURN: Int = 1725
  final val KEY_Ukrainian_I: Int = 1718
  final val KEY_Ukrainian_IE: Int = 1716
  final val KEY_Ukrainian_YI: Int = 1719
  final val KEY_Ukrainian_ghe_with_upturn: Int = 1709
  final val KEY_Ukrainian_i: Int = 1702
  final val KEY_Ukrainian_ie: Int = 1700
  final val KEY_Ukrainian_yi: Int = 1703
  final val KEY_Ukranian_I: Int = 1718
  final val KEY_Ukranian_JE: Int = 1716
  final val KEY_Ukranian_YI: Int = 1719
  final val KEY_Ukranian_i: Int = 1702
  final val KEY_Ukranian_je: Int = 1700
  final val KEY_Ukranian_yi: Int = 1703
  final val KEY_Umacron: Int = 990
  final val KEY_Undo: Int = 65381
  final val KEY_Ungrab: Int = 269024800
  final val KEY_Uogonek: Int = 985
  final val KEY_Up: Int = 65362
  final val KEY_Uring: Int = 473
  final val KEY_User1KB: Int = 269025157
  final val KEY_User2KB: Int = 269025158
  final val KEY_UserPB: Int = 269025156
  final val KEY_Utilde: Int = 989
  final val KEY_V: Int = 86
  final val KEY_VendorHome: Int = 269025076
  final val KEY_Video: Int = 269025159
  final val KEY_View: Int = 269025185
  final val KEY_VoidSymbol: Int = 16777215
  final val KEY_W: Int = 87
  final val KEY_WLAN: Int = 269025173
  final val KEY_WWAN: Int = 269025204
  final val KEY_WWW: Int = 269025070
  final val KEY_Wacute: Int = 16785026
  final val KEY_WakeUp: Int = 269025067
  final val KEY_Wcircumflex: Int = 16777588
  final val KEY_Wdiaeresis: Int = 16785028
  final val KEY_WebCam: Int = 269025167
  final val KEY_Wgrave: Int = 16785024
  final val KEY_WheelButton: Int = 269025160
  final val KEY_WindowClear: Int = 269025109
  final val KEY_WonSign: Int = 16785577
  final val KEY_Word: Int = 269025161
  final val KEY_X: Int = 88
  final val KEY_Xabovedot: Int = 16785034
  final val KEY_Xfer: Int = 269025162
  final val KEY_Y: Int = 89
  final val KEY_Yacute: Int = 221
  final val KEY_Ybelowdot: Int = 16785140
  final val KEY_Ycircumflex: Int = 16777590
  final val KEY_Ydiaeresis: Int = 5054
  final val KEY_Yellow: Int = 269025189
  final val KEY_Ygrave: Int = 16785138
  final val KEY_Yhook: Int = 16785142
  final val KEY_Ytilde: Int = 16785144
  final val KEY_Z: Int = 90
  final val KEY_Zabovedot: Int = 431
  final val KEY_Zacute: Int = 428
  final val KEY_Zcaron: Int = 430
  final val KEY_Zen_Koho: Int = 65341
  final val KEY_Zenkaku: Int = 65320
  final val KEY_Zenkaku_Hankaku: Int = 65322
  final val KEY_ZoomIn: Int = 269025163
  final val KEY_ZoomOut: Int = 269025164
  final val KEY_Zstroke: Int = 16777653
  final val KEY_a: Int = 97
  final val KEY_aacute: Int = 225
  final val KEY_abelowdot: Int = 16785057
  final val KEY_abovedot: Int = 511
  final val KEY_abreve: Int = 483
  final val KEY_abreveacute: Int = 16785071
  final val KEY_abrevebelowdot: Int = 16785079
  final val KEY_abrevegrave: Int = 16785073
  final val KEY_abrevehook: Int = 16785075
  final val KEY_abrevetilde: Int = 16785077
  final val KEY_acircumflex: Int = 226
  final val KEY_acircumflexacute: Int = 16785061
  final val KEY_acircumflexbelowdot: Int = 16785069
  final val KEY_acircumflexgrave: Int = 16785063
  final val KEY_acircumflexhook: Int = 16785065
  final val KEY_acircumflextilde: Int = 16785067
  final val KEY_acute: Int = 180
  final val KEY_adiaeresis: Int = 228
  final val KEY_ae: Int = 230
  final val KEY_agrave: Int = 224
  final val KEY_ahook: Int = 16785059
  final val KEY_amacron: Int = 992
  final val KEY_ampersand: Int = 38
  final val KEY_aogonek: Int = 433
  final val KEY_apostrophe: Int = 39
  final val KEY_approxeq: Int = 16785992
  final val KEY_approximate: Int = 2248
  final val KEY_aring: Int = 229
  final val KEY_asciicircum: Int = 94
  final val KEY_asciitilde: Int = 126
  final val KEY_asterisk: Int = 42
  final val KEY_at: Int = 64
  final val KEY_atilde: Int = 227
  final val KEY_b: Int = 98
  final val KEY_babovedot: Int = 16784899
  final val KEY_backslash: Int = 92
  final val KEY_ballotcross: Int = 2804
  final val KEY_bar: Int = 124
  final val KEY_because: Int = 16785973
  final val KEY_blank: Int = 2527
  final val KEY_botintegral: Int = 2213
  final val KEY_botleftparens: Int = 2220
  final val KEY_botleftsqbracket: Int = 2216
  final val KEY_botleftsummation: Int = 2226
  final val KEY_botrightparens: Int = 2222
  final val KEY_botrightsqbracket: Int = 2218
  final val KEY_botrightsummation: Int = 2230
  final val KEY_bott: Int = 2550
  final val KEY_botvertsummationconnector: Int = 2228
  final val KEY_braceleft: Int = 123
  final val KEY_braceright: Int = 125
  final val KEY_bracketleft: Int = 91
  final val KEY_bracketright: Int = 93
  final val KEY_braille_blank: Int = 16787456
  final val KEY_braille_dot_1: Int = 65521
  final val KEY_braille_dot_10: Int = 65530
  final val KEY_braille_dot_2: Int = 65522
  final val KEY_braille_dot_3: Int = 65523
  final val KEY_braille_dot_4: Int = 65524
  final val KEY_braille_dot_5: Int = 65525
  final val KEY_braille_dot_6: Int = 65526
  final val KEY_braille_dot_7: Int = 65527
  final val KEY_braille_dot_8: Int = 65528
  final val KEY_braille_dot_9: Int = 65529
  final val KEY_braille_dots_1: Int = 16787457
  final val KEY_braille_dots_12: Int = 16787459
  final val KEY_braille_dots_123: Int = 16787463
  final val KEY_braille_dots_1234: Int = 16787471
  final val KEY_braille_dots_12345: Int = 16787487
  final val KEY_braille_dots_123456: Int = 16787519
  final val KEY_braille_dots_1234567: Int = 16787583
  final val KEY_braille_dots_12345678: Int = 16787711
  final val KEY_braille_dots_1234568: Int = 16787647
  final val KEY_braille_dots_123457: Int = 16787551
  final val KEY_braille_dots_1234578: Int = 16787679
  final val KEY_braille_dots_123458: Int = 16787615
  final val KEY_braille_dots_12346: Int = 16787503
  final val KEY_braille_dots_123467: Int = 16787567
  final val KEY_braille_dots_1234678: Int = 16787695
  final val KEY_braille_dots_123468: Int = 16787631
  final val KEY_braille_dots_12347: Int = 16787535
  final val KEY_braille_dots_123478: Int = 16787663
  final val KEY_braille_dots_12348: Int = 16787599
  final val KEY_braille_dots_1235: Int = 16787479
  final val KEY_braille_dots_12356: Int = 16787511
  final val KEY_braille_dots_123567: Int = 16787575
  final val KEY_braille_dots_1235678: Int = 16787703
  final val KEY_braille_dots_123568: Int = 16787639
  final val KEY_braille_dots_12357: Int = 16787543
  final val KEY_braille_dots_123578: Int = 16787671
  final val KEY_braille_dots_12358: Int = 16787607
  final val KEY_braille_dots_1236: Int = 16787495
  final val KEY_braille_dots_12367: Int = 16787559
  final val KEY_braille_dots_123678: Int = 16787687
  final val KEY_braille_dots_12368: Int = 16787623
  final val KEY_braille_dots_1237: Int = 16787527
  final val KEY_braille_dots_12378: Int = 16787655
  final val KEY_braille_dots_1238: Int = 16787591
  final val KEY_braille_dots_124: Int = 16787467
  final val KEY_braille_dots_1245: Int = 16787483
  final val KEY_braille_dots_12456: Int = 16787515
  final val KEY_braille_dots_124567: Int = 16787579
  final val KEY_braille_dots_1245678: Int = 16787707
  final val KEY_braille_dots_124568: Int = 16787643
  final val KEY_braille_dots_12457: Int = 16787547
  final val KEY_braille_dots_124578: Int = 16787675
  final val KEY_braille_dots_12458: Int = 16787611
  final val KEY_braille_dots_1246: Int = 16787499
  final val KEY_braille_dots_12467: Int = 16787563
  final val KEY_braille_dots_124678: Int = 16787691
  final val KEY_braille_dots_12468: Int = 16787627
  final val KEY_braille_dots_1247: Int = 16787531
  final val KEY_braille_dots_12478: Int = 16787659
  final val KEY_braille_dots_1248: Int = 16787595
  final val KEY_braille_dots_125: Int = 16787475
  final val KEY_braille_dots_1256: Int = 16787507
  final val KEY_braille_dots_12567: Int = 16787571
  final val KEY_braille_dots_125678: Int = 16787699
  final val KEY_braille_dots_12568: Int = 16787635
  final val KEY_braille_dots_1257: Int = 16787539
  final val KEY_braille_dots_12578: Int = 16787667
  final val KEY_braille_dots_1258: Int = 16787603
  final val KEY_braille_dots_126: Int = 16787491
  final val KEY_braille_dots_1267: Int = 16787555
  final val KEY_braille_dots_12678: Int = 16787683
  final val KEY_braille_dots_1268: Int = 16787619
  final val KEY_braille_dots_127: Int = 16787523
  final val KEY_braille_dots_1278: Int = 16787651
  final val KEY_braille_dots_128: Int = 16787587
  final val KEY_braille_dots_13: Int = 16787461
  final val KEY_braille_dots_134: Int = 16787469
  final val KEY_braille_dots_1345: Int = 16787485
  final val KEY_braille_dots_13456: Int = 16787517
  final val KEY_braille_dots_134567: Int = 16787581
  final val KEY_braille_dots_1345678: Int = 16787709
  final val KEY_braille_dots_134568: Int = 16787645
  final val KEY_braille_dots_13457: Int = 16787549
  final val KEY_braille_dots_134578: Int = 16787677
  final val KEY_braille_dots_13458: Int = 16787613
  final val KEY_braille_dots_1346: Int = 16787501
  final val KEY_braille_dots_13467: Int = 16787565
  final val KEY_braille_dots_134678: Int = 16787693
  final val KEY_braille_dots_13468: Int = 16787629
  final val KEY_braille_dots_1347: Int = 16787533
  final val KEY_braille_dots_13478: Int = 16787661
  final val KEY_braille_dots_1348: Int = 16787597
  final val KEY_braille_dots_135: Int = 16787477
  final val KEY_braille_dots_1356: Int = 16787509
  final val KEY_braille_dots_13567: Int = 16787573
  final val KEY_braille_dots_135678: Int = 16787701
  final val KEY_braille_dots_13568: Int = 16787637
  final val KEY_braille_dots_1357: Int = 16787541
  final val KEY_braille_dots_13578: Int = 16787669
  final val KEY_braille_dots_1358: Int = 16787605
  final val KEY_braille_dots_136: Int = 16787493
  final val KEY_braille_dots_1367: Int = 16787557
  final val KEY_braille_dots_13678: Int = 16787685
  final val KEY_braille_dots_1368: Int = 16787621
  final val KEY_braille_dots_137: Int = 16787525
  final val KEY_braille_dots_1378: Int = 16787653
  final val KEY_braille_dots_138: Int = 16787589
  final val KEY_braille_dots_14: Int = 16787465
  final val KEY_braille_dots_145: Int = 16787481
  final val KEY_braille_dots_1456: Int = 16787513
  final val KEY_braille_dots_14567: Int = 16787577
  final val KEY_braille_dots_145678: Int = 16787705
  final val KEY_braille_dots_14568: Int = 16787641
  final val KEY_braille_dots_1457: Int = 16787545
  final val KEY_braille_dots_14578: Int = 16787673
  final val KEY_braille_dots_1458: Int = 16787609
  final val KEY_braille_dots_146: Int = 16787497
  final val KEY_braille_dots_1467: Int = 16787561
  final val KEY_braille_dots_14678: Int = 16787689
  final val KEY_braille_dots_1468: Int = 16787625
  final val KEY_braille_dots_147: Int = 16787529
  final val KEY_braille_dots_1478: Int = 16787657
  final val KEY_braille_dots_148: Int = 16787593
  final val KEY_braille_dots_15: Int = 16787473
  final val KEY_braille_dots_156: Int = 16787505
  final val KEY_braille_dots_1567: Int = 16787569
  final val KEY_braille_dots_15678: Int = 16787697
  final val KEY_braille_dots_1568: Int = 16787633
  final val KEY_braille_dots_157: Int = 16787537
  final val KEY_braille_dots_1578: Int = 16787665
  final val KEY_braille_dots_158: Int = 16787601
  final val KEY_braille_dots_16: Int = 16787489
  final val KEY_braille_dots_167: Int = 16787553
  final val KEY_braille_dots_1678: Int = 16787681
  final val KEY_braille_dots_168: Int = 16787617
  final val KEY_braille_dots_17: Int = 16787521
  final val KEY_braille_dots_178: Int = 16787649
  final val KEY_braille_dots_18: Int = 16787585
  final val KEY_braille_dots_2: Int = 16787458
  final val KEY_braille_dots_23: Int = 16787462
  final val KEY_braille_dots_234: Int = 16787470
  final val KEY_braille_dots_2345: Int = 16787486
  final val KEY_braille_dots_23456: Int = 16787518
  final val KEY_braille_dots_234567: Int = 16787582
  final val KEY_braille_dots_2345678: Int = 16787710
  final val KEY_braille_dots_234568: Int = 16787646
  final val KEY_braille_dots_23457: Int = 16787550
  final val KEY_braille_dots_234578: Int = 16787678
  final val KEY_braille_dots_23458: Int = 16787614
  final val KEY_braille_dots_2346: Int = 16787502
  final val KEY_braille_dots_23467: Int = 16787566
  final val KEY_braille_dots_234678: Int = 16787694
  final val KEY_braille_dots_23468: Int = 16787630
  final val KEY_braille_dots_2347: Int = 16787534
  final val KEY_braille_dots_23478: Int = 16787662
  final val KEY_braille_dots_2348: Int = 16787598
  final val KEY_braille_dots_235: Int = 16787478
  final val KEY_braille_dots_2356: Int = 16787510
  final val KEY_braille_dots_23567: Int = 16787574
  final val KEY_braille_dots_235678: Int = 16787702
  final val KEY_braille_dots_23568: Int = 16787638
  final val KEY_braille_dots_2357: Int = 16787542
  final val KEY_braille_dots_23578: Int = 16787670
  final val KEY_braille_dots_2358: Int = 16787606
  final val KEY_braille_dots_236: Int = 16787494
  final val KEY_braille_dots_2367: Int = 16787558
  final val KEY_braille_dots_23678: Int = 16787686
  final val KEY_braille_dots_2368: Int = 16787622
  final val KEY_braille_dots_237: Int = 16787526
  final val KEY_braille_dots_2378: Int = 16787654
  final val KEY_braille_dots_238: Int = 16787590
  final val KEY_braille_dots_24: Int = 16787466
  final val KEY_braille_dots_245: Int = 16787482
  final val KEY_braille_dots_2456: Int = 16787514
  final val KEY_braille_dots_24567: Int = 16787578
  final val KEY_braille_dots_245678: Int = 16787706
  final val KEY_braille_dots_24568: Int = 16787642
  final val KEY_braille_dots_2457: Int = 16787546
  final val KEY_braille_dots_24578: Int = 16787674
  final val KEY_braille_dots_2458: Int = 16787610
  final val KEY_braille_dots_246: Int = 16787498
  final val KEY_braille_dots_2467: Int = 16787562
  final val KEY_braille_dots_24678: Int = 16787690
  final val KEY_braille_dots_2468: Int = 16787626
  final val KEY_braille_dots_247: Int = 16787530
  final val KEY_braille_dots_2478: Int = 16787658
  final val KEY_braille_dots_248: Int = 16787594
  final val KEY_braille_dots_25: Int = 16787474
  final val KEY_braille_dots_256: Int = 16787506
  final val KEY_braille_dots_2567: Int = 16787570
  final val KEY_braille_dots_25678: Int = 16787698
  final val KEY_braille_dots_2568: Int = 16787634
  final val KEY_braille_dots_257: Int = 16787538
  final val KEY_braille_dots_2578: Int = 16787666
  final val KEY_braille_dots_258: Int = 16787602
  final val KEY_braille_dots_26: Int = 16787490
  final val KEY_braille_dots_267: Int = 16787554
  final val KEY_braille_dots_2678: Int = 16787682
  final val KEY_braille_dots_268: Int = 16787618
  final val KEY_braille_dots_27: Int = 16787522
  final val KEY_braille_dots_278: Int = 16787650
  final val KEY_braille_dots_28: Int = 16787586
  final val KEY_braille_dots_3: Int = 16787460
  final val KEY_braille_dots_34: Int = 16787468
  final val KEY_braille_dots_345: Int = 16787484
  final val KEY_braille_dots_3456: Int = 16787516
  final val KEY_braille_dots_34567: Int = 16787580
  final val KEY_braille_dots_345678: Int = 16787708
  final val KEY_braille_dots_34568: Int = 16787644
  final val KEY_braille_dots_3457: Int = 16787548
  final val KEY_braille_dots_34578: Int = 16787676
  final val KEY_braille_dots_3458: Int = 16787612
  final val KEY_braille_dots_346: Int = 16787500
  final val KEY_braille_dots_3467: Int = 16787564
  final val KEY_braille_dots_34678: Int = 16787692
  final val KEY_braille_dots_3468: Int = 16787628
  final val KEY_braille_dots_347: Int = 16787532
  final val KEY_braille_dots_3478: Int = 16787660
  final val KEY_braille_dots_348: Int = 16787596
  final val KEY_braille_dots_35: Int = 16787476
  final val KEY_braille_dots_356: Int = 16787508
  final val KEY_braille_dots_3567: Int = 16787572
  final val KEY_braille_dots_35678: Int = 16787700
  final val KEY_braille_dots_3568: Int = 16787636
  final val KEY_braille_dots_357: Int = 16787540
  final val KEY_braille_dots_3578: Int = 16787668
  final val KEY_braille_dots_358: Int = 16787604
  final val KEY_braille_dots_36: Int = 16787492
  final val KEY_braille_dots_367: Int = 16787556
  final val KEY_braille_dots_3678: Int = 16787684
  final val KEY_braille_dots_368: Int = 16787620
  final val KEY_braille_dots_37: Int = 16787524
  final val KEY_braille_dots_378: Int = 16787652
  final val KEY_braille_dots_38: Int = 16787588
  final val KEY_braille_dots_4: Int = 16787464
  final val KEY_braille_dots_45: Int = 16787480
  final val KEY_braille_dots_456: Int = 16787512
  final val KEY_braille_dots_4567: Int = 16787576
  final val KEY_braille_dots_45678: Int = 16787704
  final val KEY_braille_dots_4568: Int = 16787640
  final val KEY_braille_dots_457: Int = 16787544
  final val KEY_braille_dots_4578: Int = 16787672
  final val KEY_braille_dots_458: Int = 16787608
  final val KEY_braille_dots_46: Int = 16787496
  final val KEY_braille_dots_467: Int = 16787560
  final val KEY_braille_dots_4678: Int = 16787688
  final val KEY_braille_dots_468: Int = 16787624
  final val KEY_braille_dots_47: Int = 16787528
  final val KEY_braille_dots_478: Int = 16787656
  final val KEY_braille_dots_48: Int = 16787592
  final val KEY_braille_dots_5: Int = 16787472
  final val KEY_braille_dots_56: Int = 16787504
  final val KEY_braille_dots_567: Int = 16787568
  final val KEY_braille_dots_5678: Int = 16787696
  final val KEY_braille_dots_568: Int = 16787632
  final val KEY_braille_dots_57: Int = 16787536
  final val KEY_braille_dots_578: Int = 16787664
  final val KEY_braille_dots_58: Int = 16787600
  final val KEY_braille_dots_6: Int = 16787488
  final val KEY_braille_dots_67: Int = 16787552
  final val KEY_braille_dots_678: Int = 16787680
  final val KEY_braille_dots_68: Int = 16787616
  final val KEY_braille_dots_7: Int = 16787520
  final val KEY_braille_dots_78: Int = 16787648
  final val KEY_braille_dots_8: Int = 16787584
  final val KEY_breve: Int = 418
  final val KEY_brokenbar: Int = 166
  final val KEY_c: Int = 99
  final val KEY_c_h: Int = 65187
  final val KEY_cabovedot: Int = 741
  final val KEY_cacute: Int = 486
  final val KEY_careof: Int = 2744
  final val KEY_caret: Int = 2812
  final val KEY_caron: Int = 439
  final val KEY_ccaron: Int = 488
  final val KEY_ccedilla: Int = 231
  final val KEY_ccircumflex: Int = 742
  final val KEY_cedilla: Int = 184
  final val KEY_cent: Int = 162
  final val KEY_ch: Int = 65184
  final val KEY_checkerboard: Int = 2529
  final val KEY_checkmark: Int = 2803
  final val KEY_circle: Int = 3023
  final val KEY_club: Int = 2796
  final val KEY_colon: Int = 58
  final val KEY_comma: Int = 44
  final val KEY_containsas: Int = 16785931
  final val KEY_copyright: Int = 169
  final val KEY_cr: Int = 2532
  final val KEY_crossinglines: Int = 2542
  final val KEY_cuberoot: Int = 16785947
  final val KEY_currency: Int = 164
  final val KEY_cursor: Int = 2815
  final val KEY_d: Int = 100
  final val KEY_dabovedot: Int = 16784907
  final val KEY_dagger: Int = 2801
  final val KEY_dcaron: Int = 495
  final val KEY_dead_A: Int = 65153
  final val KEY_dead_E: Int = 65155
  final val KEY_dead_I: Int = 65157
  final val KEY_dead_O: Int = 65159
  final val KEY_dead_U: Int = 65161
  final val KEY_dead_a: Int = 65152
  final val KEY_dead_abovecomma: Int = 65124
  final val KEY_dead_abovedot: Int = 65110
  final val KEY_dead_abovereversedcomma: Int = 65125
  final val KEY_dead_abovering: Int = 65112
  final val KEY_dead_aboveverticalline: Int = 65169
  final val KEY_dead_acute: Int = 65105
  final val KEY_dead_belowbreve: Int = 65131
  final val KEY_dead_belowcircumflex: Int = 65129
  final val KEY_dead_belowcomma: Int = 65134
  final val KEY_dead_belowdiaeresis: Int = 65132
  final val KEY_dead_belowdot: Int = 65120
  final val KEY_dead_belowmacron: Int = 65128
  final val KEY_dead_belowring: Int = 65127
  final val KEY_dead_belowtilde: Int = 65130
  final val KEY_dead_belowverticalline: Int = 65170
  final val KEY_dead_breve: Int = 65109
  final val KEY_dead_capital_schwa: Int = 65163
  final val KEY_dead_caron: Int = 65114
  final val KEY_dead_cedilla: Int = 65115
  final val KEY_dead_circumflex: Int = 65106
  final val KEY_dead_currency: Int = 65135
  final val KEY_dead_dasia: Int = 65125
  final val KEY_dead_diaeresis: Int = 65111
  final val KEY_dead_doubleacute: Int = 65113
  final val KEY_dead_doublegrave: Int = 65126
  final val KEY_dead_e: Int = 65154
  final val KEY_dead_grave: Int = 65104
  final val KEY_dead_greek: Int = 65164
  final val KEY_dead_hook: Int = 65121
  final val KEY_dead_horn: Int = 65122
  final val KEY_dead_i: Int = 65156
  final val KEY_dead_invertedbreve: Int = 65133
  final val KEY_dead_iota: Int = 65117
  final val KEY_dead_longsolidusoverlay: Int = 65171
  final val KEY_dead_lowline: Int = 65168
  final val KEY_dead_macron: Int = 65108
  final val KEY_dead_o: Int = 65158
  final val KEY_dead_ogonek: Int = 65116
  final val KEY_dead_perispomeni: Int = 65107
  final val KEY_dead_psili: Int = 65124
  final val KEY_dead_semivoiced_sound: Int = 65119
  final val KEY_dead_small_schwa: Int = 65162
  final val KEY_dead_stroke: Int = 65123
  final val KEY_dead_tilde: Int = 65107
  final val KEY_dead_u: Int = 65160
  final val KEY_dead_voiced_sound: Int = 65118
  final val KEY_decimalpoint: Int = 2749
  final val KEY_degree: Int = 176
  final val KEY_diaeresis: Int = 168
  final val KEY_diamond: Int = 2797
  final val KEY_digitspace: Int = 2725
  final val KEY_dintegral: Int = 16785964
  final val KEY_division: Int = 247
  final val KEY_dollar: Int = 36
  final val KEY_doubbaselinedot: Int = 2735
  final val KEY_doubleacute: Int = 445
  final val KEY_doubledagger: Int = 2802
  final val KEY_doublelowquotemark: Int = 2814
  final val KEY_downarrow: Int = 2302
  final val KEY_downcaret: Int = 2984
  final val KEY_downshoe: Int = 3030
  final val KEY_downstile: Int = 3012
  final val KEY_downtack: Int = 3010
  final val KEY_dstroke: Int = 496
  final val KEY_e: Int = 101
  final val KEY_eabovedot: Int = 1004
  final val KEY_eacute: Int = 233
  final val KEY_ebelowdot: Int = 16785081
  final val KEY_ecaron: Int = 492
  final val KEY_ecircumflex: Int = 234
  final val KEY_ecircumflexacute: Int = 16785087
  final val KEY_ecircumflexbelowdot: Int = 16785095
  final val KEY_ecircumflexgrave: Int = 16785089
  final val KEY_ecircumflexhook: Int = 16785091
  final val KEY_ecircumflextilde: Int = 16785093
  final val KEY_ediaeresis: Int = 235
  final val KEY_egrave: Int = 232
  final val KEY_ehook: Int = 16785083
  final val KEY_eightsubscript: Int = 16785544
  final val KEY_eightsuperior: Int = 16785528
  final val KEY_elementof: Int = 16785928
  final val KEY_ellipsis: Int = 2734
  final val KEY_em3space: Int = 2723
  final val KEY_em4space: Int = 2724
  final val KEY_emacron: Int = 954
  final val KEY_emdash: Int = 2729
  final val KEY_emfilledcircle: Int = 2782
  final val KEY_emfilledrect: Int = 2783
  final val KEY_emopencircle: Int = 2766
  final val KEY_emopenrectangle: Int = 2767
  final val KEY_emptyset: Int = 16785925
  final val KEY_emspace: Int = 2721
  final val KEY_endash: Int = 2730
  final val KEY_enfilledcircbullet: Int = 2790
  final val KEY_enfilledsqbullet: Int = 2791
  final val KEY_eng: Int = 959
  final val KEY_enopencircbullet: Int = 2784
  final val KEY_enopensquarebullet: Int = 2785
  final val KEY_enspace: Int = 2722
  final val KEY_eogonek: Int = 490
  final val KEY_equal: Int = 61
  final val KEY_eth: Int = 240
  final val KEY_etilde: Int = 16785085
  final val KEY_exclam: Int = 33
  final val KEY_exclamdown: Int = 161
  final val KEY_ezh: Int = 16777874
  final val KEY_f: Int = 102
  final val KEY_fabovedot: Int = 16784927
  final val KEY_femalesymbol: Int = 2808
  final val KEY_ff: Int = 2531
  final val KEY_figdash: Int = 2747
  final val KEY_filledlefttribullet: Int = 2780
  final val KEY_filledrectbullet: Int = 2779
  final val KEY_filledrighttribullet: Int = 2781
  final val KEY_filledtribulletdown: Int = 2793
  final val KEY_filledtribulletup: Int = 2792
  final val KEY_fiveeighths: Int = 2757
  final val KEY_fivesixths: Int = 2743
  final val KEY_fivesubscript: Int = 16785541
  final val KEY_fivesuperior: Int = 16785525
  final val KEY_fourfifths: Int = 2741
  final val KEY_foursubscript: Int = 16785540
  final val KEY_foursuperior: Int = 16785524
  final val KEY_fourthroot: Int = 16785948
  final val KEY_function: Int = 2294
  final val KEY_g: Int = 103
  final val KEY_gabovedot: Int = 757
  final val KEY_gbreve: Int = 699
  final val KEY_gcaron: Int = 16777703
  final val KEY_gcedilla: Int = 955
  final val KEY_gcircumflex: Int = 760
  final val KEY_grave: Int = 96
  final val KEY_greater: Int = 62
  final val KEY_greaterthanequal: Int = 2238
  final val KEY_guillemotleft: Int = 171
  final val KEY_guillemotright: Int = 187
  final val KEY_h: Int = 104
  final val KEY_hairspace: Int = 2728
  final val KEY_hcircumflex: Int = 694
  final val KEY_heart: Int = 2798
  final val KEY_hebrew_aleph: Int = 3296
  final val KEY_hebrew_ayin: Int = 3314
  final val KEY_hebrew_bet: Int = 3297
  final val KEY_hebrew_beth: Int = 3297
  final val KEY_hebrew_chet: Int = 3303
  final val KEY_hebrew_dalet: Int = 3299
  final val KEY_hebrew_daleth: Int = 3299
  final val KEY_hebrew_doublelowline: Int = 3295
  final val KEY_hebrew_finalkaph: Int = 3306
  final val KEY_hebrew_finalmem: Int = 3309
  final val KEY_hebrew_finalnun: Int = 3311
  final val KEY_hebrew_finalpe: Int = 3315
  final val KEY_hebrew_finalzade: Int = 3317
  final val KEY_hebrew_finalzadi: Int = 3317
  final val KEY_hebrew_gimel: Int = 3298
  final val KEY_hebrew_gimmel: Int = 3298
  final val KEY_hebrew_he: Int = 3300
  final val KEY_hebrew_het: Int = 3303
  final val KEY_hebrew_kaph: Int = 3307
  final val KEY_hebrew_kuf: Int = 3319
  final val KEY_hebrew_lamed: Int = 3308
  final val KEY_hebrew_mem: Int = 3310
  final val KEY_hebrew_nun: Int = 3312
  final val KEY_hebrew_pe: Int = 3316
  final val KEY_hebrew_qoph: Int = 3319
  final val KEY_hebrew_resh: Int = 3320
  final val KEY_hebrew_samech: Int = 3313
  final val KEY_hebrew_samekh: Int = 3313
  final val KEY_hebrew_shin: Int = 3321
  final val KEY_hebrew_taf: Int = 3322
  final val KEY_hebrew_taw: Int = 3322
  final val KEY_hebrew_tet: Int = 3304
  final val KEY_hebrew_teth: Int = 3304
  final val KEY_hebrew_waw: Int = 3301
  final val KEY_hebrew_yod: Int = 3305
  final val KEY_hebrew_zade: Int = 3318
  final val KEY_hebrew_zadi: Int = 3318
  final val KEY_hebrew_zain: Int = 3302
  final val KEY_hebrew_zayin: Int = 3302
  final val KEY_hexagram: Int = 2778
  final val KEY_horizconnector: Int = 2211
  final val KEY_horizlinescan1: Int = 2543
  final val KEY_horizlinescan3: Int = 2544
  final val KEY_horizlinescan5: Int = 2545
  final val KEY_horizlinescan7: Int = 2546
  final val KEY_horizlinescan9: Int = 2547
  final val KEY_hstroke: Int = 689
  final val KEY_ht: Int = 2530
  final val KEY_hyphen: Int = 173
  final val KEY_i: Int = 105
  final val KEY_iTouch: Int = 269025120
  final val KEY_iacute: Int = 237
  final val KEY_ibelowdot: Int = 16785099
  final val KEY_ibreve: Int = 16777517
  final val KEY_icircumflex: Int = 238
  final val KEY_identical: Int = 2255
  final val KEY_idiaeresis: Int = 239
  final val KEY_idotless: Int = 697
  final val KEY_ifonlyif: Int = 2253
  final val KEY_igrave: Int = 236
  final val KEY_ihook: Int = 16785097
  final val KEY_imacron: Int = 1007
  final val KEY_implies: Int = 2254
  final val KEY_includedin: Int = 2266
  final val KEY_includes: Int = 2267
  final val KEY_infinity: Int = 2242
  final val KEY_integral: Int = 2239
  final val KEY_intersection: Int = 2268
  final val KEY_iogonek: Int = 999
  final val KEY_itilde: Int = 949
  final val KEY_j: Int = 106
  final val KEY_jcircumflex: Int = 700
  final val KEY_jot: Int = 3018
  final val KEY_k: Int = 107
  final val KEY_kana_A: Int = 1201
  final val KEY_kana_CHI: Int = 1217
  final val KEY_kana_E: Int = 1204
  final val KEY_kana_FU: Int = 1228
  final val KEY_kana_HA: Int = 1226
  final val KEY_kana_HE: Int = 1229
  final val KEY_kana_HI: Int = 1227
  final val KEY_kana_HO: Int = 1230
  final val KEY_kana_HU: Int = 1228
  final val KEY_kana_I: Int = 1202
  final val KEY_kana_KA: Int = 1206
  final val KEY_kana_KE: Int = 1209
  final val KEY_kana_KI: Int = 1207
  final val KEY_kana_KO: Int = 1210
  final val KEY_kana_KU: Int = 1208
  final val KEY_kana_MA: Int = 1231
  final val KEY_kana_ME: Int = 1234
  final val KEY_kana_MI: Int = 1232
  final val KEY_kana_MO: Int = 1235
  final val KEY_kana_MU: Int = 1233
  final val KEY_kana_N: Int = 1245
  final val KEY_kana_NA: Int = 1221
  final val KEY_kana_NE: Int = 1224
  final val KEY_kana_NI: Int = 1222
  final val KEY_kana_NO: Int = 1225
  final val KEY_kana_NU: Int = 1223
  final val KEY_kana_O: Int = 1205
  final val KEY_kana_RA: Int = 1239
  final val KEY_kana_RE: Int = 1242
  final val KEY_kana_RI: Int = 1240
  final val KEY_kana_RO: Int = 1243
  final val KEY_kana_RU: Int = 1241
  final val KEY_kana_SA: Int = 1211
  final val KEY_kana_SE: Int = 1214
  final val KEY_kana_SHI: Int = 1212
  final val KEY_kana_SO: Int = 1215
  final val KEY_kana_SU: Int = 1213
  final val KEY_kana_TA: Int = 1216
  final val KEY_kana_TE: Int = 1219
  final val KEY_kana_TI: Int = 1217
  final val KEY_kana_TO: Int = 1220
  final val KEY_kana_TSU: Int = 1218
  final val KEY_kana_TU: Int = 1218
  final val KEY_kana_U: Int = 1203
  final val KEY_kana_WA: Int = 1244
  final val KEY_kana_WO: Int = 1190
  final val KEY_kana_YA: Int = 1236
  final val KEY_kana_YO: Int = 1238
  final val KEY_kana_YU: Int = 1237
  final val KEY_kana_a: Int = 1191
  final val KEY_kana_closingbracket: Int = 1187
  final val KEY_kana_comma: Int = 1188
  final val KEY_kana_conjunctive: Int = 1189
  final val KEY_kana_e: Int = 1194
  final val KEY_kana_fullstop: Int = 1185
  final val KEY_kana_i: Int = 1192
  final val KEY_kana_middledot: Int = 1189
  final val KEY_kana_o: Int = 1195
  final val KEY_kana_openingbracket: Int = 1186
  final val KEY_kana_switch: Int = 65406
  final val KEY_kana_tsu: Int = 1199
  final val KEY_kana_tu: Int = 1199
  final val KEY_kana_u: Int = 1193
  final val KEY_kana_ya: Int = 1196
  final val KEY_kana_yo: Int = 1198
  final val KEY_kana_yu: Int = 1197
  final val KEY_kappa: Int = 930
  final val KEY_kcedilla: Int = 1011
  final val KEY_kra: Int = 930
  final val KEY_l: Int = 108
  final val KEY_lacute: Int = 485
  final val KEY_latincross: Int = 2777
  final val KEY_lbelowdot: Int = 16784951
  final val KEY_lcaron: Int = 437
  final val KEY_lcedilla: Int = 950
  final val KEY_leftanglebracket: Int = 2748
  final val KEY_leftarrow: Int = 2299
  final val KEY_leftcaret: Int = 2979
  final val KEY_leftdoublequotemark: Int = 2770
  final val KEY_leftmiddlecurlybrace: Int = 2223
  final val KEY_leftopentriangle: Int = 2764
  final val KEY_leftpointer: Int = 2794
  final val KEY_leftradical: Int = 2209
  final val KEY_leftshoe: Int = 3034
  final val KEY_leftsinglequotemark: Int = 2768
  final val KEY_leftt: Int = 2548
  final val KEY_lefttack: Int = 3036
  final val KEY_less: Int = 60
  final val KEY_lessthanequal: Int = 2236
  final val KEY_lf: Int = 2533
  final val KEY_logicaland: Int = 2270
  final val KEY_logicalor: Int = 2271
  final val KEY_lowleftcorner: Int = 2541
  final val KEY_lowrightcorner: Int = 2538
  final val KEY_lstroke: Int = 435
  final val KEY_m: Int = 109
  final val KEY_mabovedot: Int = 16784961
  final val KEY_macron: Int = 175
  final val KEY_malesymbol: Int = 2807
  final val KEY_maltesecross: Int = 2800
  final val KEY_marker: Int = 2751
  final val KEY_masculine: Int = 186
  final val KEY_minus: Int = 45
  final val KEY_minutes: Int = 2774
  final val KEY_mu: Int = 181
  final val KEY_multiply: Int = 215
  final val KEY_musicalflat: Int = 2806
  final val KEY_musicalsharp: Int = 2805
  final val KEY_n: Int = 110
  final val KEY_nabla: Int = 2245
  final val KEY_nacute: Int = 497
  final val KEY_ncaron: Int = 498
  final val KEY_ncedilla: Int = 1009
  final val KEY_ninesubscript: Int = 16785545
  final val KEY_ninesuperior: Int = 16785529
  final val KEY_nl: Int = 2536
  final val KEY_nobreakspace: Int = 160
  final val KEY_notapproxeq: Int = 16785991
  final val KEY_notelementof: Int = 16785929
  final val KEY_notequal: Int = 2237
  final val KEY_notidentical: Int = 16786018
  final val KEY_notsign: Int = 172
  final val KEY_ntilde: Int = 241
  final val KEY_numbersign: Int = 35
  final val KEY_numerosign: Int = 1712
  final val KEY_o: Int = 111
  final val KEY_oacute: Int = 243
  final val KEY_obarred: Int = 16777845
  final val KEY_obelowdot: Int = 16785101
  final val KEY_ocaron: Int = 16777682
  final val KEY_ocircumflex: Int = 244
  final val KEY_ocircumflexacute: Int = 16785105
  final val KEY_ocircumflexbelowdot: Int = 16785113
  final val KEY_ocircumflexgrave: Int = 16785107
  final val KEY_ocircumflexhook: Int = 16785109
  final val KEY_ocircumflextilde: Int = 16785111
  final val KEY_odiaeresis: Int = 246
  final val KEY_odoubleacute: Int = 501
  final val KEY_oe: Int = 5053
  final val KEY_ogonek: Int = 434
  final val KEY_ograve: Int = 242
  final val KEY_ohook: Int = 16785103
  final val KEY_ohorn: Int = 16777633
  final val KEY_ohornacute: Int = 16785115
  final val KEY_ohornbelowdot: Int = 16785123
  final val KEY_ohorngrave: Int = 16785117
  final val KEY_ohornhook: Int = 16785119
  final val KEY_ohorntilde: Int = 16785121
  final val KEY_omacron: Int = 1010
  final val KEY_oneeighth: Int = 2755
  final val KEY_onefifth: Int = 2738
  final val KEY_onehalf: Int = 189
  final val KEY_onequarter: Int = 188
  final val KEY_onesixth: Int = 2742
  final val KEY_onesubscript: Int = 16785537
  final val KEY_onesuperior: Int = 185
  final val KEY_onethird: Int = 2736
  final val KEY_ooblique: Int = 248
  final val KEY_openrectbullet: Int = 2786
  final val KEY_openstar: Int = 2789
  final val KEY_opentribulletdown: Int = 2788
  final val KEY_opentribulletup: Int = 2787
  final val KEY_ordfeminine: Int = 170
  final val KEY_oslash: Int = 248
  final val KEY_otilde: Int = 245
  final val KEY_overbar: Int = 3008
  final val KEY_overline: Int = 1150
  final val KEY_p: Int = 112
  final val KEY_pabovedot: Int = 16784983
  final val KEY_paragraph: Int = 182
  final val KEY_parenleft: Int = 40
  final val KEY_parenright: Int = 41
  final val KEY_partdifferential: Int = 16785922
  final val KEY_partialderivative: Int = 2287
  final val KEY_percent: Int = 37
  final val KEY_period: Int = 46
  final val KEY_periodcentered: Int = 183
  final val KEY_permille: Int = 2773
  final val KEY_phonographcopyright: Int = 2811
  final val KEY_plus: Int = 43
  final val KEY_plusminus: Int = 177
  final val KEY_prescription: Int = 2772
  final val KEY_prolongedsound: Int = 1200
  final val KEY_punctspace: Int = 2726
  final val KEY_q: Int = 113
  final val KEY_quad: Int = 3020
  final val KEY_question: Int = 63
  final val KEY_questiondown: Int = 191
  final val KEY_quotedbl: Int = 34
  final val KEY_quoteleft: Int = 96
  final val KEY_quoteright: Int = 39
  final val KEY_r: Int = 114
  final val KEY_racute: Int = 480
  final val KEY_radical: Int = 2262
  final val KEY_rcaron: Int = 504
  final val KEY_rcedilla: Int = 947
  final val KEY_registered: Int = 174
  final val KEY_rightanglebracket: Int = 2750
  final val KEY_rightarrow: Int = 2301
  final val KEY_rightcaret: Int = 2982
  final val KEY_rightdoublequotemark: Int = 2771
  final val KEY_rightmiddlecurlybrace: Int = 2224
  final val KEY_rightmiddlesummation: Int = 2231
  final val KEY_rightopentriangle: Int = 2765
  final val KEY_rightpointer: Int = 2795
  final val KEY_rightshoe: Int = 3032
  final val KEY_rightsinglequotemark: Int = 2769
  final val KEY_rightt: Int = 2549
  final val KEY_righttack: Int = 3068
  final val KEY_s: Int = 115
  final val KEY_sabovedot: Int = 16784993
  final val KEY_sacute: Int = 438
  final val KEY_scaron: Int = 441
  final val KEY_scedilla: Int = 442
  final val KEY_schwa: Int = 16777817
  final val KEY_scircumflex: Int = 766
  final val KEY_script_switch: Int = 65406
  final val KEY_seconds: Int = 2775
  final val KEY_section: Int = 167
  final val KEY_semicolon: Int = 59
  final val KEY_semivoicedsound: Int = 1247
  final val KEY_seveneighths: Int = 2758
  final val KEY_sevensubscript: Int = 16785543
  final val KEY_sevensuperior: Int = 16785527
  final val KEY_signaturemark: Int = 2762
  final val KEY_signifblank: Int = 2732
  final val KEY_similarequal: Int = 2249
  final val KEY_singlelowquotemark: Int = 2813
  final val KEY_sixsubscript: Int = 16785542
  final val KEY_sixsuperior: Int = 16785526
  final val KEY_slash: Int = 47
  final val KEY_soliddiamond: Int = 2528
  final val KEY_space: Int = 32
  final val KEY_squareroot: Int = 16785946
  final val KEY_ssharp: Int = 223
  final val KEY_sterling: Int = 163
  final val KEY_stricteq: Int = 16786019
  final val KEY_t: Int = 116
  final val KEY_tabovedot: Int = 16785003
  final val KEY_tcaron: Int = 443
  final val KEY_tcedilla: Int = 510
  final val KEY_telephone: Int = 2809
  final val KEY_telephonerecorder: Int = 2810
  final val KEY_therefore: Int = 2240
  final val KEY_thinspace: Int = 2727
  final val KEY_thorn: Int = 254
  final val KEY_threeeighths: Int = 2756
  final val KEY_threefifths: Int = 2740
  final val KEY_threequarters: Int = 190
  final val KEY_threesubscript: Int = 16785539
  final val KEY_threesuperior: Int = 179
  final val KEY_tintegral: Int = 16785965
  final val KEY_topintegral: Int = 2212
  final val KEY_topleftparens: Int = 2219
  final val KEY_topleftradical: Int = 2210
  final val KEY_topleftsqbracket: Int = 2215
  final val KEY_topleftsummation: Int = 2225
  final val KEY_toprightparens: Int = 2221
  final val KEY_toprightsqbracket: Int = 2217
  final val KEY_toprightsummation: Int = 2229
  final val KEY_topt: Int = 2551
  final val KEY_topvertsummationconnector: Int = 2227
  final val KEY_trademark: Int = 2761
  final val KEY_trademarkincircle: Int = 2763
  final val KEY_tslash: Int = 956
  final val KEY_twofifths: Int = 2739
  final val KEY_twosubscript: Int = 16785538
  final val KEY_twosuperior: Int = 178
  final val KEY_twothirds: Int = 2737
  final val KEY_u: Int = 117
  final val KEY_uacute: Int = 250
  final val KEY_ubelowdot: Int = 16785125
  final val KEY_ubreve: Int = 765
  final val KEY_ucircumflex: Int = 251
  final val KEY_udiaeresis: Int = 252
  final val KEY_udoubleacute: Int = 507
  final val KEY_ugrave: Int = 249
  final val KEY_uhook: Int = 16785127
  final val KEY_uhorn: Int = 16777648
  final val KEY_uhornacute: Int = 16785129
  final val KEY_uhornbelowdot: Int = 16785137
  final val KEY_uhorngrave: Int = 16785131
  final val KEY_uhornhook: Int = 16785133
  final val KEY_uhorntilde: Int = 16785135
  final val KEY_umacron: Int = 1022
  final val KEY_underbar: Int = 3014
  final val KEY_underscore: Int = 95
  final val KEY_union: Int = 2269
  final val KEY_uogonek: Int = 1017
  final val KEY_uparrow: Int = 2300
  final val KEY_upcaret: Int = 2985
  final val KEY_upleftcorner: Int = 2540
  final val KEY_uprightcorner: Int = 2539
  final val KEY_upshoe: Int = 3011
  final val KEY_upstile: Int = 3027
  final val KEY_uptack: Int = 3022
  final val KEY_uring: Int = 505
  final val KEY_utilde: Int = 1021
  final val KEY_v: Int = 118
  final val KEY_variation: Int = 2241
  final val KEY_vertbar: Int = 2552
  final val KEY_vertconnector: Int = 2214
  final val KEY_voicedsound: Int = 1246
  final val KEY_vt: Int = 2537
  final val KEY_w: Int = 119
  final val KEY_wacute: Int = 16785027
  final val KEY_wcircumflex: Int = 16777589
  final val KEY_wdiaeresis: Int = 16785029
  final val KEY_wgrave: Int = 16785025
  final val KEY_x: Int = 120
  final val KEY_xabovedot: Int = 16785035
  final val KEY_y: Int = 121
  final val KEY_yacute: Int = 253
  final val KEY_ybelowdot: Int = 16785141
  final val KEY_ycircumflex: Int = 16777591
  final val KEY_ydiaeresis: Int = 255
  final val KEY_yen: Int = 165
  final val KEY_ygrave: Int = 16785139
  final val KEY_yhook: Int = 16785143
  final val KEY_ytilde: Int = 16785145
  final val KEY_z: Int = 122
  final val KEY_zabovedot: Int = 447
  final val KEY_zacute: Int = 444
  final val KEY_zcaron: Int = 446
  final val KEY_zerosubscript: Int = 16785536
  final val KEY_zerosuperior: Int = 16785520
  final val KEY_zstroke: Int = 16777654

  /** A mask covering all entries in `GdkModifierType`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val MODIFIER_MASK: Int = 469769999

  /** This is the priority that the idle handler processing surface updates is
    * given in the main loop.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  final val PRIORITY_REDRAW: Int = 120
end Gdk
