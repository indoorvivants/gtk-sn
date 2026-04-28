package sn.gnome.gdk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

@extern def GDK_DMABUF_TEXTURE_BUILDER(ptr : _root_.sn.gnome.glib.internal.gpointer): Ptr[GdkDmabufTextureBuilder] = extern

@extern def GDK_DMABUF_TEXTURE_BUILDER_CLASS(ptr : _root_.sn.gnome.glib.internal.gpointer): Ptr[GdkDmabufTextureBuilderClass] = extern

@extern def GDK_DMABUF_TEXTURE_BUILDER_GET_CLASS(ptr : _root_.sn.gnome.glib.internal.gpointer): Ptr[GdkDmabufTextureBuilderClass] = extern

@extern def GDK_DRAG_SURFACE(ptr : _root_.sn.gnome.glib.internal.gpointer): Ptr[GdkDragSurface] = extern

@extern def GDK_DRAG_SURFACE_GET_IFACE(ptr : _root_.sn.gnome.glib.internal.gpointer): Ptr[GdkDragSurfaceInterface] = extern

@extern def GDK_GL_TEXTURE_BUILDER(ptr : _root_.sn.gnome.glib.internal.gpointer): Ptr[GdkGLTextureBuilder] = extern

@extern def GDK_GL_TEXTURE_BUILDER_CLASS(ptr : _root_.sn.gnome.glib.internal.gpointer): Ptr[GdkGLTextureBuilderClass] = extern

@extern def GDK_GL_TEXTURE_BUILDER_GET_CLASS(ptr : _root_.sn.gnome.glib.internal.gpointer): Ptr[GdkGLTextureBuilderClass] = extern

@extern def GDK_IS_DMABUF_TEXTURE_BUILDER(ptr : _root_.sn.gnome.glib.internal.gpointer): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def GDK_IS_DMABUF_TEXTURE_BUILDER_CLASS(ptr : _root_.sn.gnome.glib.internal.gpointer): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def GDK_IS_DRAG_SURFACE(ptr : _root_.sn.gnome.glib.internal.gpointer): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def GDK_IS_GL_TEXTURE_BUILDER(ptr : _root_.sn.gnome.glib.internal.gpointer): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def GDK_IS_GL_TEXTURE_BUILDER_CLASS(ptr : _root_.sn.gnome.glib.internal.gpointer): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def GDK_IS_PAINTABLE(ptr : _root_.sn.gnome.glib.internal.gpointer): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def GDK_IS_POPUP(ptr : _root_.sn.gnome.glib.internal.gpointer): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def GDK_IS_TOPLEVEL(ptr : _root_.sn.gnome.glib.internal.gpointer): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def GDK_PAINTABLE(ptr : _root_.sn.gnome.glib.internal.gpointer): Ptr[GdkPaintable] = extern

@extern def GDK_PAINTABLE_GET_IFACE(ptr : _root_.sn.gnome.glib.internal.gpointer): Ptr[GdkPaintableInterface] = extern

@extern def GDK_POPUP(ptr : _root_.sn.gnome.glib.internal.gpointer): Ptr[GdkPopup] = extern

@extern def GDK_POPUP_GET_IFACE(ptr : _root_.sn.gnome.glib.internal.gpointer): Ptr[GdkPopupInterface] = extern

@extern def GDK_TOPLEVEL(ptr : _root_.sn.gnome.glib.internal.gpointer): Ptr[GdkToplevel] = extern

@extern def GDK_TOPLEVEL_GET_IFACE(ptr : _root_.sn.gnome.glib.internal.gpointer): Ptr[GdkToplevelInterface] = extern

@extern def gdk_anchor_hints_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def gdk_app_launch_context_get_display(context : Ptr[GdkAppLaunchContext]): Ptr[GdkDisplay] = extern

@extern def gdk_app_launch_context_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def gdk_app_launch_context_set_desktop(context : Ptr[GdkAppLaunchContext], desktop : CInt): Unit = extern

@extern def gdk_app_launch_context_set_icon(context : Ptr[GdkAppLaunchContext], icon : Ptr[_root_.sn.gnome.gio.internal.GIcon]): Unit = extern

@extern def gdk_app_launch_context_set_icon_name(context : Ptr[GdkAppLaunchContext], icon_name : CString): Unit = extern

@extern def gdk_app_launch_context_set_timestamp(context : Ptr[GdkAppLaunchContext], timestamp : _root_.sn.gnome.glib.internal.guint32): Unit = extern

@extern def gdk_axis_flags_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def gdk_axis_use_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def gdk_button_event_get_button(event : Ptr[GdkEvent]): _root_.sn.gnome.glib.internal.guint = extern

@extern def gdk_button_event_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def gdk_cairo_context_cairo_create(self : Ptr[GdkCairoContext]): Ptr[_root_.sn.gnome.cairo.internal.cairo_t] = extern

@extern def gdk_cairo_context_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def gdk_cairo_draw_from_gl(cr : Ptr[_root_.sn.gnome.cairo.internal.cairo_t], surface : Ptr[GdkSurface], source : CInt, source_type : CInt, buffer_scale : CInt, x : CInt, y : CInt, width : CInt, height : CInt): Unit = extern

@extern def gdk_cairo_rectangle(cr : Ptr[_root_.sn.gnome.cairo.internal.cairo_t], rectangle : Ptr[GdkRectangle]): Unit = extern

@extern def gdk_cairo_region(cr : Ptr[_root_.sn.gnome.cairo.internal.cairo_t], region : Ptr[_root_.sn.gnome.cairo.internal.cairo_region_t]): Unit = extern

@extern def gdk_cairo_region_create_from_surface(surface : Ptr[_root_.sn.gnome.cairo.internal.cairo_surface_t]): Ptr[_root_.sn.gnome.cairo.internal.cairo_region_t] = extern

@extern def gdk_cairo_set_source_pixbuf(cr : Ptr[_root_.sn.gnome.cairo.internal.cairo_t], pixbuf : Ptr[_root_.sn.gnome.gdkpixbuf.internal.GdkPixbuf], pixbuf_x : Double, pixbuf_y : Double): Unit = extern

@extern def gdk_cairo_set_source_rgba(cr : Ptr[_root_.sn.gnome.cairo.internal.cairo_t], rgba : Ptr[GdkRGBA]): Unit = extern

@extern def gdk_clipboard_get_content(clipboard : Ptr[GdkClipboard]): Ptr[GdkContentProvider] = extern

@extern def gdk_clipboard_get_display(clipboard : Ptr[GdkClipboard]): Ptr[GdkDisplay] = extern

@extern def gdk_clipboard_get_formats(clipboard : Ptr[GdkClipboard]): Ptr[GdkContentFormats] = extern

@extern def gdk_clipboard_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def gdk_clipboard_is_local(clipboard : Ptr[GdkClipboard]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def gdk_clipboard_read_async(clipboard : Ptr[GdkClipboard], mime_types : Ptr[CString], io_priority : CInt, cancellable : Ptr[_root_.sn.gnome.gio.internal.GCancellable], callback : _root_.sn.gnome.gio.internal.GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def gdk_clipboard_read_finish(clipboard : Ptr[GdkClipboard], result : Ptr[_root_.sn.gnome.gio.internal.GAsyncResult], out_mime_type : Ptr[CString], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[_root_.sn.gnome.gio.internal.GInputStream] = extern

@extern def gdk_clipboard_read_text_async(clipboard : Ptr[GdkClipboard], cancellable : Ptr[_root_.sn.gnome.gio.internal.GCancellable], callback : _root_.sn.gnome.gio.internal.GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def gdk_clipboard_read_text_finish(clipboard : Ptr[GdkClipboard], result : Ptr[_root_.sn.gnome.gio.internal.GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): CString = extern

@extern def gdk_clipboard_read_texture_async(clipboard : Ptr[GdkClipboard], cancellable : Ptr[_root_.sn.gnome.gio.internal.GCancellable], callback : _root_.sn.gnome.gio.internal.GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def gdk_clipboard_read_texture_finish(clipboard : Ptr[GdkClipboard], result : Ptr[_root_.sn.gnome.gio.internal.GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GdkTexture] = extern

@extern def gdk_clipboard_read_value_async(clipboard : Ptr[GdkClipboard], `type` : _root_.sn.gnome.gobject.internal.GType, io_priority : CInt, cancellable : Ptr[_root_.sn.gnome.gio.internal.GCancellable], callback : _root_.sn.gnome.gio.internal.GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def gdk_clipboard_read_value_finish(clipboard : Ptr[GdkClipboard], result : Ptr[_root_.sn.gnome.gio.internal.GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[_root_.sn.gnome.gobject.internal.GValue] = extern

@extern def gdk_clipboard_set(clipboard : Ptr[GdkClipboard], `type` : _root_.sn.gnome.gobject.internal.GType, rest: Any*): Unit = extern

@extern def gdk_clipboard_set_content(clipboard : Ptr[GdkClipboard], provider : Ptr[GdkContentProvider]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def gdk_clipboard_set_text(clipboard : Ptr[GdkClipboard], text : CString): Unit = extern

@extern def gdk_clipboard_set_texture(clipboard : Ptr[GdkClipboard], texture : Ptr[GdkTexture]): Unit = extern

@extern def gdk_clipboard_set_valist(clipboard : Ptr[GdkClipboard], `type` : _root_.sn.gnome.gobject.internal.GType, args : va_list): Unit = extern

@extern def gdk_clipboard_set_value(clipboard : Ptr[GdkClipboard], value : Ptr[_root_.sn.gnome.gobject.internal.GValue]): Unit = extern

@extern def gdk_clipboard_store_async(clipboard : Ptr[GdkClipboard], io_priority : CInt, cancellable : Ptr[_root_.sn.gnome.gio.internal.GCancellable], callback : _root_.sn.gnome.gio.internal.GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def gdk_clipboard_store_finish(clipboard : Ptr[GdkClipboard], result : Ptr[_root_.sn.gnome.gio.internal.GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def gdk_content_deserialize_async(stream : Ptr[_root_.sn.gnome.gio.internal.GInputStream], mime_type : CString, `type` : _root_.sn.gnome.gobject.internal.GType, io_priority : CInt, cancellable : Ptr[_root_.sn.gnome.gio.internal.GCancellable], callback : _root_.sn.gnome.gio.internal.GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def gdk_content_deserialize_finish(result : Ptr[_root_.sn.gnome.gio.internal.GAsyncResult], value : Ptr[_root_.sn.gnome.gobject.internal.GValue], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def gdk_content_deserializer_get_cancellable(deserializer : Ptr[GdkContentDeserializer]): Ptr[_root_.sn.gnome.gio.internal.GCancellable] = extern

@extern def gdk_content_deserializer_get_gtype(deserializer : Ptr[GdkContentDeserializer]): _root_.sn.gnome.gobject.internal.GType = extern

@extern def gdk_content_deserializer_get_input_stream(deserializer : Ptr[GdkContentDeserializer]): Ptr[_root_.sn.gnome.gio.internal.GInputStream] = extern

@extern def gdk_content_deserializer_get_mime_type(deserializer : Ptr[GdkContentDeserializer]): CString = extern

@extern def gdk_content_deserializer_get_priority(deserializer : Ptr[GdkContentDeserializer]): CInt = extern

@extern def gdk_content_deserializer_get_task_data(deserializer : Ptr[GdkContentDeserializer]): _root_.sn.gnome.glib.internal.gpointer = extern

@extern def gdk_content_deserializer_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def gdk_content_deserializer_get_user_data(deserializer : Ptr[GdkContentDeserializer]): _root_.sn.gnome.glib.internal.gpointer = extern

@extern def gdk_content_deserializer_get_value(deserializer : Ptr[GdkContentDeserializer]): Ptr[_root_.sn.gnome.gobject.internal.GValue] = extern

@extern def gdk_content_deserializer_return_error(deserializer : Ptr[GdkContentDeserializer], error : Ptr[_root_.sn.gnome.glib.internal.GError]): Unit = extern

@extern def gdk_content_deserializer_return_success(deserializer : Ptr[GdkContentDeserializer]): Unit = extern

@extern def gdk_content_deserializer_set_task_data(deserializer : Ptr[GdkContentDeserializer], data : _root_.sn.gnome.glib.internal.gpointer, notify : _root_.sn.gnome.glib.internal.GDestroyNotify): Unit = extern

@extern def gdk_content_formats_builder_add_formats(builder : Ptr[GdkContentFormatsBuilder], formats : Ptr[GdkContentFormats]): Unit = extern

@extern def gdk_content_formats_builder_add_gtype(builder : Ptr[GdkContentFormatsBuilder], `type` : _root_.sn.gnome.gobject.internal.GType): Unit = extern

@extern def gdk_content_formats_builder_add_mime_type(builder : Ptr[GdkContentFormatsBuilder], mime_type : CString): Unit = extern

@extern def gdk_content_formats_builder_free_to_formats(builder : Ptr[GdkContentFormatsBuilder]): Ptr[GdkContentFormats] = extern

@extern def gdk_content_formats_builder_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def gdk_content_formats_builder_new(): Ptr[GdkContentFormatsBuilder] = extern

@extern def gdk_content_formats_builder_ref(builder : Ptr[GdkContentFormatsBuilder]): Ptr[GdkContentFormatsBuilder] = extern

@extern def gdk_content_formats_builder_to_formats(builder : Ptr[GdkContentFormatsBuilder]): Ptr[GdkContentFormats] = extern

@extern def gdk_content_formats_builder_unref(builder : Ptr[GdkContentFormatsBuilder]): Unit = extern

@extern def gdk_content_formats_contain_gtype(formats : Ptr[GdkContentFormats], `type` : _root_.sn.gnome.gobject.internal.GType): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def gdk_content_formats_contain_mime_type(formats : Ptr[GdkContentFormats], mime_type : CString): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def gdk_content_formats_get_gtypes(formats : Ptr[GdkContentFormats], n_gtypes : Ptr[_root_.sn.gnome.glib.internal.gsize]): Ptr[_root_.sn.gnome.gobject.internal.GType] = extern

@extern def gdk_content_formats_get_mime_types(formats : Ptr[GdkContentFormats], n_mime_types : Ptr[_root_.sn.gnome.glib.internal.gsize]): Ptr[CString] = extern

@extern def gdk_content_formats_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def gdk_content_formats_match(first : Ptr[GdkContentFormats], second : Ptr[GdkContentFormats]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def gdk_content_formats_match_gtype(first : Ptr[GdkContentFormats], second : Ptr[GdkContentFormats]): _root_.sn.gnome.gobject.internal.GType = extern

@extern def gdk_content_formats_match_mime_type(first : Ptr[GdkContentFormats], second : Ptr[GdkContentFormats]): CString = extern

@extern def gdk_content_formats_new(mime_types : Ptr[CString], n_mime_types : _root_.sn.gnome.glib.internal.guint): Ptr[GdkContentFormats] = extern

@extern def gdk_content_formats_new_for_gtype(`type` : _root_.sn.gnome.gobject.internal.GType): Ptr[GdkContentFormats] = extern

@extern def gdk_content_formats_parse(string : CString): Ptr[GdkContentFormats] = extern

@extern def gdk_content_formats_print(formats : Ptr[GdkContentFormats], string : Ptr[_root_.sn.gnome.glib.internal.GString]): Unit = extern

@extern def gdk_content_formats_ref(formats : Ptr[GdkContentFormats]): Ptr[GdkContentFormats] = extern

@extern def gdk_content_formats_to_string(formats : Ptr[GdkContentFormats]): CString = extern

@extern def gdk_content_formats_union(first : Ptr[GdkContentFormats], second : Ptr[GdkContentFormats]): Ptr[GdkContentFormats] = extern

@extern def gdk_content_formats_union_deserialize_gtypes(formats : Ptr[GdkContentFormats]): Ptr[GdkContentFormats] = extern

@extern def gdk_content_formats_union_deserialize_mime_types(formats : Ptr[GdkContentFormats]): Ptr[GdkContentFormats] = extern

@extern def gdk_content_formats_union_serialize_gtypes(formats : Ptr[GdkContentFormats]): Ptr[GdkContentFormats] = extern

@extern def gdk_content_formats_union_serialize_mime_types(formats : Ptr[GdkContentFormats]): Ptr[GdkContentFormats] = extern

@extern def gdk_content_formats_unref(formats : Ptr[GdkContentFormats]): Unit = extern

@extern def gdk_content_provider_content_changed(provider : Ptr[GdkContentProvider]): Unit = extern

@extern def gdk_content_provider_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def gdk_content_provider_get_value(provider : Ptr[GdkContentProvider], value : Ptr[_root_.sn.gnome.gobject.internal.GValue], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def gdk_content_provider_new_for_bytes(mime_type : CString, bytes : Ptr[_root_.sn.gnome.glib.internal.GBytes]): Ptr[GdkContentProvider] = extern

@extern def gdk_content_provider_new_for_value(value : Ptr[_root_.sn.gnome.gobject.internal.GValue]): Ptr[GdkContentProvider] = extern

@extern def gdk_content_provider_new_typed(`type` : _root_.sn.gnome.gobject.internal.GType, rest: Any*): Ptr[GdkContentProvider] = extern

@extern def gdk_content_provider_new_union(providers : Ptr[Ptr[GdkContentProvider]], n_providers : _root_.sn.gnome.glib.internal.gsize): Ptr[GdkContentProvider] = extern

@extern def gdk_content_provider_ref_formats(provider : Ptr[GdkContentProvider]): Ptr[GdkContentFormats] = extern

@extern def gdk_content_provider_ref_storable_formats(provider : Ptr[GdkContentProvider]): Ptr[GdkContentFormats] = extern

@extern def gdk_content_provider_write_mime_type_async(provider : Ptr[GdkContentProvider], mime_type : CString, stream : Ptr[_root_.sn.gnome.gio.internal.GOutputStream], io_priority : CInt, cancellable : Ptr[_root_.sn.gnome.gio.internal.GCancellable], callback : _root_.sn.gnome.gio.internal.GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def gdk_content_provider_write_mime_type_finish(provider : Ptr[GdkContentProvider], result : Ptr[_root_.sn.gnome.gio.internal.GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def gdk_content_register_deserializer(mime_type : CString, `type` : _root_.sn.gnome.gobject.internal.GType, deserialize : GdkContentDeserializeFunc, data : _root_.sn.gnome.glib.internal.gpointer, notify : _root_.sn.gnome.glib.internal.GDestroyNotify): Unit = extern

@extern def gdk_content_register_serializer(`type` : _root_.sn.gnome.gobject.internal.GType, mime_type : CString, serialize : GdkContentSerializeFunc, data : _root_.sn.gnome.glib.internal.gpointer, notify : _root_.sn.gnome.glib.internal.GDestroyNotify): Unit = extern

@extern def gdk_content_serialize_async(stream : Ptr[_root_.sn.gnome.gio.internal.GOutputStream], mime_type : CString, value : Ptr[_root_.sn.gnome.gobject.internal.GValue], io_priority : CInt, cancellable : Ptr[_root_.sn.gnome.gio.internal.GCancellable], callback : _root_.sn.gnome.gio.internal.GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def gdk_content_serialize_finish(result : Ptr[_root_.sn.gnome.gio.internal.GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def gdk_content_serializer_get_cancellable(serializer : Ptr[GdkContentSerializer]): Ptr[_root_.sn.gnome.gio.internal.GCancellable] = extern

@extern def gdk_content_serializer_get_gtype(serializer : Ptr[GdkContentSerializer]): _root_.sn.gnome.gobject.internal.GType = extern

@extern def gdk_content_serializer_get_mime_type(serializer : Ptr[GdkContentSerializer]): CString = extern

@extern def gdk_content_serializer_get_output_stream(serializer : Ptr[GdkContentSerializer]): Ptr[_root_.sn.gnome.gio.internal.GOutputStream] = extern

@extern def gdk_content_serializer_get_priority(serializer : Ptr[GdkContentSerializer]): CInt = extern

@extern def gdk_content_serializer_get_task_data(serializer : Ptr[GdkContentSerializer]): _root_.sn.gnome.glib.internal.gpointer = extern

@extern def gdk_content_serializer_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def gdk_content_serializer_get_user_data(serializer : Ptr[GdkContentSerializer]): _root_.sn.gnome.glib.internal.gpointer = extern

@extern def gdk_content_serializer_get_value(serializer : Ptr[GdkContentSerializer]): Ptr[_root_.sn.gnome.gobject.internal.GValue] = extern

@extern def gdk_content_serializer_return_error(serializer : Ptr[GdkContentSerializer], error : Ptr[_root_.sn.gnome.glib.internal.GError]): Unit = extern

@extern def gdk_content_serializer_return_success(serializer : Ptr[GdkContentSerializer]): Unit = extern

@extern def gdk_content_serializer_set_task_data(serializer : Ptr[GdkContentSerializer], data : _root_.sn.gnome.glib.internal.gpointer, notify : _root_.sn.gnome.glib.internal.GDestroyNotify): Unit = extern

@extern def gdk_crossing_event_get_detail(event : Ptr[GdkEvent]): GdkNotifyType = extern

@extern def gdk_crossing_event_get_focus(event : Ptr[GdkEvent]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def gdk_crossing_event_get_mode(event : Ptr[GdkEvent]): GdkCrossingMode = extern

@extern def gdk_crossing_event_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def gdk_crossing_mode_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def gdk_cursor_get_fallback(cursor : Ptr[GdkCursor]): Ptr[GdkCursor] = extern

@extern def gdk_cursor_get_hotspot_x(cursor : Ptr[GdkCursor]): CInt = extern

@extern def gdk_cursor_get_hotspot_y(cursor : Ptr[GdkCursor]): CInt = extern

@extern def gdk_cursor_get_name(cursor : Ptr[GdkCursor]): CString = extern

@extern def gdk_cursor_get_texture(cursor : Ptr[GdkCursor]): Ptr[GdkTexture] = extern

@extern def gdk_cursor_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def gdk_cursor_new_from_name(name : CString, fallback : Ptr[GdkCursor]): Ptr[GdkCursor] = extern

@extern def gdk_cursor_new_from_texture(texture : Ptr[GdkTexture], hotspot_x : CInt, hotspot_y : CInt, fallback : Ptr[GdkCursor]): Ptr[GdkCursor] = extern

@extern def gdk_delete_event_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def gdk_device_get_caps_lock_state(device : Ptr[GdkDevice]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def gdk_device_get_device_tool(device : Ptr[GdkDevice]): Ptr[GdkDeviceTool] = extern

@extern def gdk_device_get_direction(device : Ptr[GdkDevice]): _root_.sn.gnome.pango.internal.PangoDirection = extern

@extern def gdk_device_get_display(device : Ptr[GdkDevice]): Ptr[GdkDisplay] = extern

@extern def gdk_device_get_has_cursor(device : Ptr[GdkDevice]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def gdk_device_get_modifier_state(device : Ptr[GdkDevice]): GdkModifierType = extern

@extern def gdk_device_get_name(device : Ptr[GdkDevice]): CString = extern

@extern def gdk_device_get_num_lock_state(device : Ptr[GdkDevice]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def gdk_device_get_num_touches(device : Ptr[GdkDevice]): _root_.sn.gnome.glib.internal.guint = extern

@extern def gdk_device_get_product_id(device : Ptr[GdkDevice]): CString = extern

@extern def gdk_device_get_scroll_lock_state(device : Ptr[GdkDevice]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def gdk_device_get_seat(device : Ptr[GdkDevice]): Ptr[GdkSeat] = extern

@extern def gdk_device_get_source(device : Ptr[GdkDevice]): GdkInputSource = extern

@extern def gdk_device_get_surface_at_position(device : Ptr[GdkDevice], win_x : Ptr[Double], win_y : Ptr[Double]): Ptr[GdkSurface] = extern

@extern def gdk_device_get_timestamp(device : Ptr[GdkDevice]): _root_.sn.gnome.glib.internal.guint32 = extern

@extern def gdk_device_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def gdk_device_get_vendor_id(device : Ptr[GdkDevice]): CString = extern

@extern def gdk_device_has_bidi_layouts(device : Ptr[GdkDevice]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def gdk_device_pad_feature_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def gdk_device_pad_get_feature_group(pad : Ptr[GdkDevicePad], feature : GdkDevicePadFeature, feature_idx : CInt): CInt = extern

@extern def gdk_device_pad_get_group_n_modes(pad : Ptr[GdkDevicePad], group_idx : CInt): CInt = extern

@extern def gdk_device_pad_get_n_features(pad : Ptr[GdkDevicePad], feature : GdkDevicePadFeature): CInt = extern

@extern def gdk_device_pad_get_n_groups(pad : Ptr[GdkDevicePad]): CInt = extern

@extern def gdk_device_pad_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def gdk_device_tool_get_axes(tool : Ptr[GdkDeviceTool]): GdkAxisFlags = extern

@extern def gdk_device_tool_get_hardware_id(tool : Ptr[GdkDeviceTool]): _root_.sn.gnome.glib.internal.guint64 = extern

@extern def gdk_device_tool_get_serial(tool : Ptr[GdkDeviceTool]): _root_.sn.gnome.glib.internal.guint64 = extern

@extern def gdk_device_tool_get_tool_type(tool : Ptr[GdkDeviceTool]): GdkDeviceToolType = extern

@extern def gdk_device_tool_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def gdk_device_tool_type_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def gdk_display_beep(display : Ptr[GdkDisplay]): Unit = extern

@extern def gdk_display_close(display : Ptr[GdkDisplay]): Unit = extern

@extern def gdk_display_create_gl_context(self : Ptr[GdkDisplay], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GdkGLContext] = extern

@extern def gdk_display_device_is_grabbed(display : Ptr[GdkDisplay], device : Ptr[GdkDevice]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def gdk_display_flush(display : Ptr[GdkDisplay]): Unit = extern

@extern def gdk_display_get_app_launch_context(display : Ptr[GdkDisplay]): Ptr[GdkAppLaunchContext] = extern

@extern def gdk_display_get_clipboard(display : Ptr[GdkDisplay]): Ptr[GdkClipboard] = extern

@extern def gdk_display_get_default(): Ptr[GdkDisplay] = extern

@extern def gdk_display_get_default_seat(display : Ptr[GdkDisplay]): Ptr[GdkSeat] = extern

@extern def gdk_display_get_dmabuf_formats(display : Ptr[GdkDisplay]): Ptr[GdkDmabufFormats] = extern

@extern def gdk_display_get_monitor_at_surface(display : Ptr[GdkDisplay], surface : Ptr[GdkSurface]): Ptr[GdkMonitor] = extern

@extern def gdk_display_get_monitors(self : Ptr[GdkDisplay]): Ptr[_root_.sn.gnome.gio.internal.GListModel] = extern

@extern def gdk_display_get_name(display : Ptr[GdkDisplay]): CString = extern

@extern def gdk_display_get_primary_clipboard(display : Ptr[GdkDisplay]): Ptr[GdkClipboard] = extern

@extern def gdk_display_get_setting(display : Ptr[GdkDisplay], name : CString, value : Ptr[_root_.sn.gnome.gobject.internal.GValue]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def gdk_display_get_startup_notification_id(display : Ptr[GdkDisplay]): CString = extern

@extern def gdk_display_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def gdk_display_is_closed(display : Ptr[GdkDisplay]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def gdk_display_is_composited(display : Ptr[GdkDisplay]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def gdk_display_is_rgba(display : Ptr[GdkDisplay]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def gdk_display_list_seats(display : Ptr[GdkDisplay]): Ptr[_root_.sn.gnome.glib.internal.GList] = extern

@extern def gdk_display_manager_get(): Ptr[GdkDisplayManager] = extern

@extern def gdk_display_manager_get_default_display(manager : Ptr[GdkDisplayManager]): Ptr[GdkDisplay] = extern

@extern def gdk_display_manager_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def gdk_display_manager_list_displays(manager : Ptr[GdkDisplayManager]): Ptr[_root_.sn.gnome.glib.internal.GSList] = extern

@extern def gdk_display_manager_open_display(manager : Ptr[GdkDisplayManager], name : CString): Ptr[GdkDisplay] = extern

@extern def gdk_display_manager_set_default_display(manager : Ptr[GdkDisplayManager], display : Ptr[GdkDisplay]): Unit = extern

@extern def gdk_display_map_keycode(display : Ptr[GdkDisplay], keycode : _root_.sn.gnome.glib.internal.guint, keys : Ptr[Ptr[GdkKeymapKey]], keyvals : Ptr[Ptr[_root_.sn.gnome.glib.internal.guint]], n_entries : Ptr[CInt]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def gdk_display_map_keyval(display : Ptr[GdkDisplay], keyval : _root_.sn.gnome.glib.internal.guint, keys : Ptr[Ptr[GdkKeymapKey]], n_keys : Ptr[CInt]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def gdk_display_notify_startup_complete(display : Ptr[GdkDisplay], startup_id : CString): Unit = extern

@extern def gdk_display_open(display_name : CString): Ptr[GdkDisplay] = extern

@extern def gdk_display_prepare_gl(self : Ptr[GdkDisplay], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def gdk_display_put_event(display : Ptr[GdkDisplay], event : Ptr[GdkEvent]): Unit = extern

@extern def gdk_display_supports_input_shapes(display : Ptr[GdkDisplay]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def gdk_display_supports_shadow_width(display : Ptr[GdkDisplay]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def gdk_display_sync(display : Ptr[GdkDisplay]): Unit = extern

@extern def gdk_display_translate_key(display : Ptr[GdkDisplay], keycode : _root_.sn.gnome.glib.internal.guint, state : GdkModifierType, group : CInt, keyval : Ptr[_root_.sn.gnome.glib.internal.guint], effective_group : Ptr[CInt], level : Ptr[CInt], consumed : Ptr[GdkModifierType]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def gdk_dmabuf_error_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def gdk_dmabuf_error_quark(): _root_.sn.gnome.glib.internal.GQuark = extern

@extern def gdk_dmabuf_formats_contains(formats : Ptr[GdkDmabufFormats], fourcc : _root_.sn.gnome.glib.internal.guint32, modifier : _root_.sn.gnome.glib.internal.guint64): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def gdk_dmabuf_formats_equal(formats1 : Ptr[GdkDmabufFormats], formats2 : Ptr[GdkDmabufFormats]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def gdk_dmabuf_formats_get_format(formats : Ptr[GdkDmabufFormats], idx : _root_.sn.gnome.glib.internal.gsize, fourcc : Ptr[_root_.sn.gnome.glib.internal.guint32], modifier : Ptr[_root_.sn.gnome.glib.internal.guint64]): Unit = extern

@extern def gdk_dmabuf_formats_get_n_formats(formats : Ptr[GdkDmabufFormats]): _root_.sn.gnome.glib.internal.gsize = extern

@extern def gdk_dmabuf_formats_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def gdk_dmabuf_formats_ref(formats : Ptr[GdkDmabufFormats]): Ptr[GdkDmabufFormats] = extern

@extern def gdk_dmabuf_formats_unref(formats : Ptr[GdkDmabufFormats]): Unit = extern

@extern def gdk_dmabuf_texture_builder_build(self : Ptr[GdkDmabufTextureBuilder], destroy : _root_.sn.gnome.glib.internal.GDestroyNotify, data : _root_.sn.gnome.glib.internal.gpointer, error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GdkTexture] = extern

@extern def gdk_dmabuf_texture_builder_get_display(self : Ptr[GdkDmabufTextureBuilder]): Ptr[GdkDisplay] = extern

@extern def gdk_dmabuf_texture_builder_get_fd(self : Ptr[GdkDmabufTextureBuilder], plane : CUnsignedInt): CInt = extern

@extern def gdk_dmabuf_texture_builder_get_fourcc(self : Ptr[GdkDmabufTextureBuilder]): _root_.sn.gnome.glib.internal.guint32 = extern

@extern def gdk_dmabuf_texture_builder_get_height(self : Ptr[GdkDmabufTextureBuilder]): CUnsignedInt = extern

@extern def gdk_dmabuf_texture_builder_get_modifier(self : Ptr[GdkDmabufTextureBuilder]): _root_.sn.gnome.glib.internal.guint64 = extern

@extern def gdk_dmabuf_texture_builder_get_n_planes(self : Ptr[GdkDmabufTextureBuilder]): CUnsignedInt = extern

@extern def gdk_dmabuf_texture_builder_get_offset(self : Ptr[GdkDmabufTextureBuilder], plane : CUnsignedInt): CUnsignedInt = extern

@extern def gdk_dmabuf_texture_builder_get_premultiplied(self : Ptr[GdkDmabufTextureBuilder]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def gdk_dmabuf_texture_builder_get_stride(self : Ptr[GdkDmabufTextureBuilder], plane : CUnsignedInt): CUnsignedInt = extern

@extern def gdk_dmabuf_texture_builder_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def gdk_dmabuf_texture_builder_get_update_region(self : Ptr[GdkDmabufTextureBuilder]): Ptr[_root_.sn.gnome.cairo.internal.cairo_region_t] = extern

@extern def gdk_dmabuf_texture_builder_get_update_texture(self : Ptr[GdkDmabufTextureBuilder]): Ptr[GdkTexture] = extern

@extern def gdk_dmabuf_texture_builder_get_width(self : Ptr[GdkDmabufTextureBuilder]): CUnsignedInt = extern

@extern def gdk_dmabuf_texture_builder_new(): Ptr[GdkDmabufTextureBuilder] = extern

@extern def gdk_dmabuf_texture_builder_set_display(self : Ptr[GdkDmabufTextureBuilder], display : Ptr[GdkDisplay]): Unit = extern

@extern def gdk_dmabuf_texture_builder_set_fd(self : Ptr[GdkDmabufTextureBuilder], plane : CUnsignedInt, fd : CInt): Unit = extern

@extern def gdk_dmabuf_texture_builder_set_fourcc(self : Ptr[GdkDmabufTextureBuilder], fourcc : _root_.sn.gnome.glib.internal.guint32): Unit = extern

@extern def gdk_dmabuf_texture_builder_set_height(self : Ptr[GdkDmabufTextureBuilder], height : CUnsignedInt): Unit = extern

@extern def gdk_dmabuf_texture_builder_set_modifier(self : Ptr[GdkDmabufTextureBuilder], modifier : _root_.sn.gnome.glib.internal.guint64): Unit = extern

@extern def gdk_dmabuf_texture_builder_set_n_planes(self : Ptr[GdkDmabufTextureBuilder], n_planes : CUnsignedInt): Unit = extern

@extern def gdk_dmabuf_texture_builder_set_offset(self : Ptr[GdkDmabufTextureBuilder], plane : CUnsignedInt, offset : CUnsignedInt): Unit = extern

@extern def gdk_dmabuf_texture_builder_set_premultiplied(self : Ptr[GdkDmabufTextureBuilder], premultiplied : _root_.sn.gnome.glib.internal.gboolean): Unit = extern

@extern def gdk_dmabuf_texture_builder_set_stride(self : Ptr[GdkDmabufTextureBuilder], plane : CUnsignedInt, stride : CUnsignedInt): Unit = extern

@extern def gdk_dmabuf_texture_builder_set_update_region(self : Ptr[GdkDmabufTextureBuilder], region : Ptr[_root_.sn.gnome.cairo.internal.cairo_region_t]): Unit = extern

@extern def gdk_dmabuf_texture_builder_set_update_texture(self : Ptr[GdkDmabufTextureBuilder], texture : Ptr[GdkTexture]): Unit = extern

@extern def gdk_dmabuf_texture_builder_set_width(self : Ptr[GdkDmabufTextureBuilder], width : CUnsignedInt): Unit = extern

@extern def gdk_dmabuf_texture_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def gdk_dnd_event_get_drop(event : Ptr[GdkEvent]): Ptr[GdkDrop] = extern

@extern def gdk_dnd_event_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def gdk_drag_action_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def gdk_drag_action_is_unique(action : GdkDragAction): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def gdk_drag_begin(surface : Ptr[GdkSurface], device : Ptr[GdkDevice], content : Ptr[GdkContentProvider], actions : GdkDragAction, dx : Double, dy : Double): Ptr[GdkDrag] = extern

@extern def gdk_drag_cancel_reason_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def gdk_drag_drop_done(drag : Ptr[GdkDrag], success : _root_.sn.gnome.glib.internal.gboolean): Unit = extern

@extern def gdk_drag_get_actions(drag : Ptr[GdkDrag]): GdkDragAction = extern

@extern def gdk_drag_get_content(drag : Ptr[GdkDrag]): Ptr[GdkContentProvider] = extern

@extern def gdk_drag_get_device(drag : Ptr[GdkDrag]): Ptr[GdkDevice] = extern

@extern def gdk_drag_get_display(drag : Ptr[GdkDrag]): Ptr[GdkDisplay] = extern

@extern def gdk_drag_get_drag_surface(drag : Ptr[GdkDrag]): Ptr[GdkSurface] = extern

@extern def gdk_drag_get_formats(drag : Ptr[GdkDrag]): Ptr[GdkContentFormats] = extern

@extern def gdk_drag_get_selected_action(drag : Ptr[GdkDrag]): GdkDragAction = extern

@extern def gdk_drag_get_surface(drag : Ptr[GdkDrag]): Ptr[GdkSurface] = extern

@extern def gdk_drag_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def gdk_drag_set_hotspot(drag : Ptr[GdkDrag], hot_x : CInt, hot_y : CInt): Unit = extern

@extern def gdk_drag_surface_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def gdk_drag_surface_present(drag_surface : Ptr[GdkDragSurface], width : CInt, height : CInt): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def gdk_drag_surface_size_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def gdk_drag_surface_size_set_size(size : Ptr[GdkDragSurfaceSize], width : CInt, height : CInt): Unit = extern

@extern def gdk_draw_context_begin_frame(context : Ptr[GdkDrawContext], region : Ptr[_root_.sn.gnome.cairo.internal.cairo_region_t]): Unit = extern

@extern def gdk_draw_context_end_frame(context : Ptr[GdkDrawContext]): Unit = extern

@extern def gdk_draw_context_get_display(context : Ptr[GdkDrawContext]): Ptr[GdkDisplay] = extern

@extern def gdk_draw_context_get_frame_region(context : Ptr[GdkDrawContext]): Ptr[_root_.sn.gnome.cairo.internal.cairo_region_t] = extern

@extern def gdk_draw_context_get_surface(context : Ptr[GdkDrawContext]): Ptr[GdkSurface] = extern

@extern def gdk_draw_context_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def gdk_draw_context_is_in_frame(context : Ptr[GdkDrawContext]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def gdk_drop_finish(self : Ptr[GdkDrop], action : GdkDragAction): Unit = extern

@extern def gdk_drop_get_actions(self : Ptr[GdkDrop]): GdkDragAction = extern

@extern def gdk_drop_get_device(self : Ptr[GdkDrop]): Ptr[GdkDevice] = extern

@extern def gdk_drop_get_display(self : Ptr[GdkDrop]): Ptr[GdkDisplay] = extern

@extern def gdk_drop_get_drag(self : Ptr[GdkDrop]): Ptr[GdkDrag] = extern

@extern def gdk_drop_get_formats(self : Ptr[GdkDrop]): Ptr[GdkContentFormats] = extern

@extern def gdk_drop_get_surface(self : Ptr[GdkDrop]): Ptr[GdkSurface] = extern

@extern def gdk_drop_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def gdk_drop_read_async(self : Ptr[GdkDrop], mime_types : Ptr[CString], io_priority : CInt, cancellable : Ptr[_root_.sn.gnome.gio.internal.GCancellable], callback : _root_.sn.gnome.gio.internal.GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def gdk_drop_read_finish(self : Ptr[GdkDrop], result : Ptr[_root_.sn.gnome.gio.internal.GAsyncResult], out_mime_type : Ptr[CString], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[_root_.sn.gnome.gio.internal.GInputStream] = extern

@extern def gdk_drop_read_value_async(self : Ptr[GdkDrop], `type` : _root_.sn.gnome.gobject.internal.GType, io_priority : CInt, cancellable : Ptr[_root_.sn.gnome.gio.internal.GCancellable], callback : _root_.sn.gnome.gio.internal.GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def gdk_drop_read_value_finish(self : Ptr[GdkDrop], result : Ptr[_root_.sn.gnome.gio.internal.GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[_root_.sn.gnome.gobject.internal.GValue] = extern

@extern def gdk_drop_status(self : Ptr[GdkDrop], actions : GdkDragAction, preferred : GdkDragAction): Unit = extern

@extern def gdk_event_get_axes(event : Ptr[GdkEvent], axes : Ptr[Ptr[Double]], n_axes : Ptr[_root_.sn.gnome.glib.internal.guint]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def gdk_event_get_axis(event : Ptr[GdkEvent], axis_use : GdkAxisUse, value : Ptr[Double]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def gdk_event_get_device(event : Ptr[GdkEvent]): Ptr[GdkDevice] = extern

@extern def gdk_event_get_device_tool(event : Ptr[GdkEvent]): Ptr[GdkDeviceTool] = extern

@extern def gdk_event_get_display(event : Ptr[GdkEvent]): Ptr[GdkDisplay] = extern

@extern def gdk_event_get_event_sequence(event : Ptr[GdkEvent]): Ptr[GdkEventSequence] = extern

@extern def gdk_event_get_event_type(event : Ptr[GdkEvent]): GdkEventType = extern

@extern def gdk_event_get_history(event : Ptr[GdkEvent], out_n_coords : Ptr[_root_.sn.gnome.glib.internal.guint]): Ptr[GdkTimeCoord] = extern

@extern def gdk_event_get_modifier_state(event : Ptr[GdkEvent]): GdkModifierType = extern

@extern def gdk_event_get_pointer_emulated(event : Ptr[GdkEvent]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def gdk_event_get_position(event : Ptr[GdkEvent], x : Ptr[Double], y : Ptr[Double]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def gdk_event_get_seat(event : Ptr[GdkEvent]): Ptr[GdkSeat] = extern

@extern def gdk_event_get_surface(event : Ptr[GdkEvent]): Ptr[GdkSurface] = extern

@extern def gdk_event_get_time(event : Ptr[GdkEvent]): _root_.sn.gnome.glib.internal.guint32 = extern

@extern def gdk_event_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def gdk_event_ref(event : Ptr[GdkEvent]): Ptr[GdkEvent] = extern

@extern def gdk_event_sequence_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def gdk_event_triggers_context_menu(event : Ptr[GdkEvent]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def gdk_event_type_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def gdk_event_unref(event : Ptr[GdkEvent]): Unit = extern

@extern def gdk_events_get_angle(event1 : Ptr[GdkEvent], event2 : Ptr[GdkEvent], angle : Ptr[Double]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def gdk_events_get_center(event1 : Ptr[GdkEvent], event2 : Ptr[GdkEvent], x : Ptr[Double], y : Ptr[Double]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def gdk_events_get_distance(event1 : Ptr[GdkEvent], event2 : Ptr[GdkEvent], distance : Ptr[Double]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def gdk_file_list_get_files(file_list : Ptr[GdkFileList]): Ptr[_root_.sn.gnome.glib.internal.GSList] = extern

@extern def gdk_file_list_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def gdk_file_list_new_from_array(files : Ptr[Ptr[_root_.sn.gnome.gio.internal.GFile]], n_files : _root_.sn.gnome.glib.internal.gsize): Ptr[GdkFileList] = extern

@extern def gdk_file_list_new_from_list(files : Ptr[_root_.sn.gnome.glib.internal.GSList]): Ptr[GdkFileList] = extern

@extern def gdk_focus_event_get_in(event : Ptr[GdkEvent]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def gdk_focus_event_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def gdk_frame_clock_begin_updating(frame_clock : Ptr[GdkFrameClock]): Unit = extern

@extern def gdk_frame_clock_end_updating(frame_clock : Ptr[GdkFrameClock]): Unit = extern

@extern def gdk_frame_clock_get_current_timings(frame_clock : Ptr[GdkFrameClock]): Ptr[GdkFrameTimings] = extern

@extern def gdk_frame_clock_get_fps(frame_clock : Ptr[GdkFrameClock]): Double = extern

@extern def gdk_frame_clock_get_frame_counter(frame_clock : Ptr[GdkFrameClock]): _root_.sn.gnome.glib.internal.gint64 = extern

@extern def gdk_frame_clock_get_frame_time(frame_clock : Ptr[GdkFrameClock]): _root_.sn.gnome.glib.internal.gint64 = extern

@extern def gdk_frame_clock_get_history_start(frame_clock : Ptr[GdkFrameClock]): _root_.sn.gnome.glib.internal.gint64 = extern

@extern def gdk_frame_clock_get_refresh_info(frame_clock : Ptr[GdkFrameClock], base_time : _root_.sn.gnome.glib.internal.gint64, refresh_interval_return : Ptr[_root_.sn.gnome.glib.internal.gint64], presentation_time_return : Ptr[_root_.sn.gnome.glib.internal.gint64]): Unit = extern

@extern def gdk_frame_clock_get_timings(frame_clock : Ptr[GdkFrameClock], frame_counter : _root_.sn.gnome.glib.internal.gint64): Ptr[GdkFrameTimings] = extern

@extern def gdk_frame_clock_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def gdk_frame_clock_phase_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def gdk_frame_clock_request_phase(frame_clock : Ptr[GdkFrameClock], phase : GdkFrameClockPhase): Unit = extern

@extern def gdk_frame_timings_get_complete(timings : Ptr[GdkFrameTimings]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def gdk_frame_timings_get_frame_counter(timings : Ptr[GdkFrameTimings]): _root_.sn.gnome.glib.internal.gint64 = extern

@extern def gdk_frame_timings_get_frame_time(timings : Ptr[GdkFrameTimings]): _root_.sn.gnome.glib.internal.gint64 = extern

@extern def gdk_frame_timings_get_predicted_presentation_time(timings : Ptr[GdkFrameTimings]): _root_.sn.gnome.glib.internal.gint64 = extern

@extern def gdk_frame_timings_get_presentation_time(timings : Ptr[GdkFrameTimings]): _root_.sn.gnome.glib.internal.gint64 = extern

@extern def gdk_frame_timings_get_refresh_interval(timings : Ptr[GdkFrameTimings]): _root_.sn.gnome.glib.internal.gint64 = extern

@extern def gdk_frame_timings_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def gdk_frame_timings_ref(timings : Ptr[GdkFrameTimings]): Ptr[GdkFrameTimings] = extern

@extern def gdk_frame_timings_unref(timings : Ptr[GdkFrameTimings]): Unit = extern

@extern def gdk_fullscreen_mode_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def gdk_gl_api_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def gdk_gl_context_clear_current(): Unit = extern

@extern def gdk_gl_context_get_allowed_apis(self : Ptr[GdkGLContext]): GdkGLAPI = extern

@extern def gdk_gl_context_get_api(self : Ptr[GdkGLContext]): GdkGLAPI = extern

@extern def gdk_gl_context_get_current(): Ptr[GdkGLContext] = extern

@extern def gdk_gl_context_get_debug_enabled(context : Ptr[GdkGLContext]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def gdk_gl_context_get_display(context : Ptr[GdkGLContext]): Ptr[GdkDisplay] = extern

@extern def gdk_gl_context_get_forward_compatible(context : Ptr[GdkGLContext]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def gdk_gl_context_get_required_version(context : Ptr[GdkGLContext], major : Ptr[CInt], minor : Ptr[CInt]): Unit = extern

@extern def gdk_gl_context_get_shared_context(context : Ptr[GdkGLContext]): Ptr[GdkGLContext] = extern

@extern def gdk_gl_context_get_surface(context : Ptr[GdkGLContext]): Ptr[GdkSurface] = extern

@extern def gdk_gl_context_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def gdk_gl_context_get_use_es(context : Ptr[GdkGLContext]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def gdk_gl_context_get_version(context : Ptr[GdkGLContext], major : Ptr[CInt], minor : Ptr[CInt]): Unit = extern

@extern def gdk_gl_context_is_legacy(context : Ptr[GdkGLContext]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def gdk_gl_context_is_shared(self : Ptr[GdkGLContext], other : Ptr[GdkGLContext]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def gdk_gl_context_make_current(context : Ptr[GdkGLContext]): Unit = extern

@extern def gdk_gl_context_realize(context : Ptr[GdkGLContext], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def gdk_gl_context_set_allowed_apis(self : Ptr[GdkGLContext], apis : GdkGLAPI): Unit = extern

@extern def gdk_gl_context_set_debug_enabled(context : Ptr[GdkGLContext], enabled : _root_.sn.gnome.glib.internal.gboolean): Unit = extern

@extern def gdk_gl_context_set_forward_compatible(context : Ptr[GdkGLContext], compatible : _root_.sn.gnome.glib.internal.gboolean): Unit = extern

@extern def gdk_gl_context_set_required_version(context : Ptr[GdkGLContext], major : CInt, minor : CInt): Unit = extern

@extern def gdk_gl_context_set_use_es(context : Ptr[GdkGLContext], use_es : CInt): Unit = extern

@extern def gdk_gl_error_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def gdk_gl_error_quark(): _root_.sn.gnome.glib.internal.GQuark = extern

@extern def gdk_gl_texture_builder_build(self : Ptr[GdkGLTextureBuilder], destroy : _root_.sn.gnome.glib.internal.GDestroyNotify, data : _root_.sn.gnome.glib.internal.gpointer): Ptr[GdkTexture] = extern

@extern def gdk_gl_texture_builder_get_context(self : Ptr[GdkGLTextureBuilder]): Ptr[GdkGLContext] = extern

@extern def gdk_gl_texture_builder_get_format(self : Ptr[GdkGLTextureBuilder]): GdkMemoryFormat = extern

@extern def gdk_gl_texture_builder_get_has_mipmap(self : Ptr[GdkGLTextureBuilder]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def gdk_gl_texture_builder_get_height(self : Ptr[GdkGLTextureBuilder]): CInt = extern

@extern def gdk_gl_texture_builder_get_id(self : Ptr[GdkGLTextureBuilder]): _root_.sn.gnome.glib.internal.guint = extern

@extern def gdk_gl_texture_builder_get_sync(self : Ptr[GdkGLTextureBuilder]): _root_.sn.gnome.glib.internal.gpointer = extern

@extern def gdk_gl_texture_builder_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def gdk_gl_texture_builder_get_update_region(self : Ptr[GdkGLTextureBuilder]): Ptr[_root_.sn.gnome.cairo.internal.cairo_region_t] = extern

@extern def gdk_gl_texture_builder_get_update_texture(self : Ptr[GdkGLTextureBuilder]): Ptr[GdkTexture] = extern

@extern def gdk_gl_texture_builder_get_width(self : Ptr[GdkGLTextureBuilder]): CInt = extern

@extern def gdk_gl_texture_builder_new(): Ptr[GdkGLTextureBuilder] = extern

@extern def gdk_gl_texture_builder_set_context(self : Ptr[GdkGLTextureBuilder], context : Ptr[GdkGLContext]): Unit = extern

@extern def gdk_gl_texture_builder_set_format(self : Ptr[GdkGLTextureBuilder], format : GdkMemoryFormat): Unit = extern

@extern def gdk_gl_texture_builder_set_has_mipmap(self : Ptr[GdkGLTextureBuilder], has_mipmap : _root_.sn.gnome.glib.internal.gboolean): Unit = extern

@extern def gdk_gl_texture_builder_set_height(self : Ptr[GdkGLTextureBuilder], height : CInt): Unit = extern

@extern def gdk_gl_texture_builder_set_id(self : Ptr[GdkGLTextureBuilder], id : _root_.sn.gnome.glib.internal.guint): Unit = extern

@extern def gdk_gl_texture_builder_set_sync(self : Ptr[GdkGLTextureBuilder], sync : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def gdk_gl_texture_builder_set_update_region(self : Ptr[GdkGLTextureBuilder], region : Ptr[_root_.sn.gnome.cairo.internal.cairo_region_t]): Unit = extern

@extern def gdk_gl_texture_builder_set_update_texture(self : Ptr[GdkGLTextureBuilder], texture : Ptr[GdkTexture]): Unit = extern

@extern def gdk_gl_texture_builder_set_width(self : Ptr[GdkGLTextureBuilder], width : CInt): Unit = extern

@extern def gdk_gl_texture_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def gdk_gl_texture_new(context : Ptr[GdkGLContext], id : _root_.sn.gnome.glib.internal.guint, width : CInt, height : CInt, destroy : _root_.sn.gnome.glib.internal.GDestroyNotify, data : _root_.sn.gnome.glib.internal.gpointer): Ptr[GdkTexture] = extern

@extern def gdk_gl_texture_release(self : Ptr[GdkGLTexture]): Unit = extern

@extern def gdk_grab_broken_event_get_grab_surface(event : Ptr[GdkEvent]): Ptr[GdkSurface] = extern

@extern def gdk_grab_broken_event_get_implicit(event : Ptr[GdkEvent]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def gdk_grab_broken_event_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def gdk_gravity_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def gdk_input_source_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def gdk_intern_mime_type(string : CString): CString = extern

@extern def gdk_key_event_get_consumed_modifiers(event : Ptr[GdkEvent]): GdkModifierType = extern

@extern def gdk_key_event_get_keycode(event : Ptr[GdkEvent]): _root_.sn.gnome.glib.internal.guint = extern

@extern def gdk_key_event_get_keyval(event : Ptr[GdkEvent]): _root_.sn.gnome.glib.internal.guint = extern

@extern def gdk_key_event_get_layout(event : Ptr[GdkEvent]): _root_.sn.gnome.glib.internal.guint = extern

@extern def gdk_key_event_get_level(event : Ptr[GdkEvent]): _root_.sn.gnome.glib.internal.guint = extern

@extern def gdk_key_event_get_match(event : Ptr[GdkEvent], keyval : Ptr[_root_.sn.gnome.glib.internal.guint], modifiers : Ptr[GdkModifierType]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def gdk_key_event_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def gdk_key_event_is_modifier(event : Ptr[GdkEvent]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def gdk_key_event_matches(event : Ptr[GdkEvent], keyval : _root_.sn.gnome.glib.internal.guint, modifiers : GdkModifierType): GdkKeyMatch = extern

@extern def gdk_key_match_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def gdk_keyval_convert_case(symbol : _root_.sn.gnome.glib.internal.guint, lower : Ptr[_root_.sn.gnome.glib.internal.guint], upper : Ptr[_root_.sn.gnome.glib.internal.guint]): Unit = extern

@extern def gdk_keyval_from_name(keyval_name : CString): _root_.sn.gnome.glib.internal.guint = extern

@extern def gdk_keyval_is_lower(keyval : _root_.sn.gnome.glib.internal.guint): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def gdk_keyval_is_upper(keyval : _root_.sn.gnome.glib.internal.guint): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def gdk_keyval_name(keyval : _root_.sn.gnome.glib.internal.guint): CString = extern

@extern def gdk_keyval_to_lower(keyval : _root_.sn.gnome.glib.internal.guint): _root_.sn.gnome.glib.internal.guint = extern

@extern def gdk_keyval_to_unicode(keyval : _root_.sn.gnome.glib.internal.guint): _root_.sn.gnome.glib.internal.guint32 = extern

@extern def gdk_keyval_to_upper(keyval : _root_.sn.gnome.glib.internal.guint): _root_.sn.gnome.glib.internal.guint = extern

@extern def gdk_memory_format_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def gdk_memory_texture_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def gdk_memory_texture_new(width : CInt, height : CInt, format : GdkMemoryFormat, bytes : Ptr[_root_.sn.gnome.glib.internal.GBytes], stride : _root_.sn.gnome.glib.internal.gsize): Ptr[GdkTexture] = extern

@extern def gdk_modifier_type_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def gdk_monitor_get_connector(monitor : Ptr[GdkMonitor]): CString = extern

@extern def gdk_monitor_get_description(monitor : Ptr[GdkMonitor]): CString = extern

@extern def gdk_monitor_get_display(monitor : Ptr[GdkMonitor]): Ptr[GdkDisplay] = extern

@extern def gdk_monitor_get_geometry(monitor : Ptr[GdkMonitor], geometry : Ptr[GdkRectangle]): Unit = extern

@extern def gdk_monitor_get_height_mm(monitor : Ptr[GdkMonitor]): CInt = extern

@extern def gdk_monitor_get_manufacturer(monitor : Ptr[GdkMonitor]): CString = extern

@extern def gdk_monitor_get_model(monitor : Ptr[GdkMonitor]): CString = extern

@extern def gdk_monitor_get_refresh_rate(monitor : Ptr[GdkMonitor]): CInt = extern

@extern def gdk_monitor_get_scale(monitor : Ptr[GdkMonitor]): Double = extern

@extern def gdk_monitor_get_scale_factor(monitor : Ptr[GdkMonitor]): CInt = extern

@extern def gdk_monitor_get_subpixel_layout(monitor : Ptr[GdkMonitor]): GdkSubpixelLayout = extern

@extern def gdk_monitor_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def gdk_monitor_get_width_mm(monitor : Ptr[GdkMonitor]): CInt = extern

@extern def gdk_monitor_is_valid(monitor : Ptr[GdkMonitor]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def gdk_motion_event_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def gdk_notify_type_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def gdk_pad_event_get_axis_value(event : Ptr[GdkEvent], index : Ptr[_root_.sn.gnome.glib.internal.guint], value : Ptr[Double]): Unit = extern

@extern def gdk_pad_event_get_button(event : Ptr[GdkEvent]): _root_.sn.gnome.glib.internal.guint = extern

@extern def gdk_pad_event_get_group_mode(event : Ptr[GdkEvent], group : Ptr[_root_.sn.gnome.glib.internal.guint], mode : Ptr[_root_.sn.gnome.glib.internal.guint]): Unit = extern

@extern def gdk_pad_event_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def gdk_paintable_compute_concrete_size(paintable : Ptr[GdkPaintable], specified_width : Double, specified_height : Double, default_width : Double, default_height : Double, concrete_width : Ptr[Double], concrete_height : Ptr[Double]): Unit = extern

@extern def gdk_paintable_flags_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def gdk_paintable_get_current_image(paintable : Ptr[GdkPaintable]): Ptr[GdkPaintable] = extern

@extern def gdk_paintable_get_flags(paintable : Ptr[GdkPaintable]): GdkPaintableFlags = extern

@extern def gdk_paintable_get_intrinsic_aspect_ratio(paintable : Ptr[GdkPaintable]): Double = extern

@extern def gdk_paintable_get_intrinsic_height(paintable : Ptr[GdkPaintable]): CInt = extern

@extern def gdk_paintable_get_intrinsic_width(paintable : Ptr[GdkPaintable]): CInt = extern

@extern def gdk_paintable_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def gdk_paintable_invalidate_contents(paintable : Ptr[GdkPaintable]): Unit = extern

@extern def gdk_paintable_invalidate_size(paintable : Ptr[GdkPaintable]): Unit = extern

@extern def gdk_paintable_new_empty(intrinsic_width : CInt, intrinsic_height : CInt): Ptr[GdkPaintable] = extern

@extern def gdk_paintable_snapshot(paintable : Ptr[GdkPaintable], snapshot : Ptr[GdkSnapshot], width : Double, height : Double): Unit = extern

@extern def gdk_pango_layout_get_clip_region(layout : Ptr[_root_.sn.gnome.pango.internal.PangoLayout], x_origin : CInt, y_origin : CInt, index_ranges : Ptr[CInt], n_ranges : CInt): Ptr[_root_.sn.gnome.cairo.internal.cairo_region_t] = extern

@extern def gdk_pango_layout_line_get_clip_region(line : Ptr[_root_.sn.gnome.pango.internal.PangoLayoutLine], x_origin : CInt, y_origin : CInt, index_ranges : Ptr[CInt], n_ranges : CInt): Ptr[_root_.sn.gnome.cairo.internal.cairo_region_t] = extern

@extern def gdk_pixbuf_get_from_surface(surface : Ptr[_root_.sn.gnome.cairo.internal.cairo_surface_t], src_x : CInt, src_y : CInt, width : CInt, height : CInt): Ptr[_root_.sn.gnome.gdkpixbuf.internal.GdkPixbuf] = extern

@extern def gdk_pixbuf_get_from_texture(texture : Ptr[GdkTexture]): Ptr[_root_.sn.gnome.gdkpixbuf.internal.GdkPixbuf] = extern

@extern def gdk_popup_get_autohide(popup : Ptr[GdkPopup]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def gdk_popup_get_parent(popup : Ptr[GdkPopup]): Ptr[GdkSurface] = extern

@extern def gdk_popup_get_position_x(popup : Ptr[GdkPopup]): CInt = extern

@extern def gdk_popup_get_position_y(popup : Ptr[GdkPopup]): CInt = extern

@extern def gdk_popup_get_rect_anchor(popup : Ptr[GdkPopup]): GdkGravity = extern

@extern def gdk_popup_get_surface_anchor(popup : Ptr[GdkPopup]): GdkGravity = extern

@extern def gdk_popup_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def gdk_popup_layout_copy(layout : Ptr[GdkPopupLayout]): Ptr[GdkPopupLayout] = extern

@extern def gdk_popup_layout_equal(layout : Ptr[GdkPopupLayout], other : Ptr[GdkPopupLayout]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def gdk_popup_layout_get_anchor_hints(layout : Ptr[GdkPopupLayout]): GdkAnchorHints = extern

@extern def gdk_popup_layout_get_anchor_rect(layout : Ptr[GdkPopupLayout]): Ptr[GdkRectangle] = extern

@extern def gdk_popup_layout_get_offset(layout : Ptr[GdkPopupLayout], dx : Ptr[CInt], dy : Ptr[CInt]): Unit = extern

@extern def gdk_popup_layout_get_rect_anchor(layout : Ptr[GdkPopupLayout]): GdkGravity = extern

@extern def gdk_popup_layout_get_shadow_width(layout : Ptr[GdkPopupLayout], left : Ptr[CInt], right : Ptr[CInt], top : Ptr[CInt], bottom : Ptr[CInt]): Unit = extern

@extern def gdk_popup_layout_get_surface_anchor(layout : Ptr[GdkPopupLayout]): GdkGravity = extern

@extern def gdk_popup_layout_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def gdk_popup_layout_new(anchor_rect : Ptr[GdkRectangle], rect_anchor : GdkGravity, surface_anchor : GdkGravity): Ptr[GdkPopupLayout] = extern

@extern def gdk_popup_layout_ref(layout : Ptr[GdkPopupLayout]): Ptr[GdkPopupLayout] = extern

@extern def gdk_popup_layout_set_anchor_hints(layout : Ptr[GdkPopupLayout], anchor_hints : GdkAnchorHints): Unit = extern

@extern def gdk_popup_layout_set_anchor_rect(layout : Ptr[GdkPopupLayout], anchor_rect : Ptr[GdkRectangle]): Unit = extern

@extern def gdk_popup_layout_set_offset(layout : Ptr[GdkPopupLayout], dx : CInt, dy : CInt): Unit = extern

@extern def gdk_popup_layout_set_rect_anchor(layout : Ptr[GdkPopupLayout], anchor : GdkGravity): Unit = extern

@extern def gdk_popup_layout_set_shadow_width(layout : Ptr[GdkPopupLayout], left : CInt, right : CInt, top : CInt, bottom : CInt): Unit = extern

@extern def gdk_popup_layout_set_surface_anchor(layout : Ptr[GdkPopupLayout], anchor : GdkGravity): Unit = extern

@extern def gdk_popup_layout_unref(layout : Ptr[GdkPopupLayout]): Unit = extern

@extern def gdk_popup_present(popup : Ptr[GdkPopup], width : CInt, height : CInt, layout : Ptr[GdkPopupLayout]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def gdk_proximity_event_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def gdk_rectangle_contains_point(rect : Ptr[GdkRectangle], x : CInt, y : CInt): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def gdk_rectangle_equal(rect1 : Ptr[GdkRectangle], rect2 : Ptr[GdkRectangle]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def gdk_rectangle_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def gdk_rectangle_intersect(src1 : Ptr[GdkRectangle], src2 : Ptr[GdkRectangle], dest : Ptr[GdkRectangle]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def gdk_rectangle_union(src1 : Ptr[GdkRectangle], src2 : Ptr[GdkRectangle], dest : Ptr[GdkRectangle]): Unit = extern

@extern def gdk_rgba_copy(rgba : Ptr[GdkRGBA]): Ptr[GdkRGBA] = extern

@extern def gdk_rgba_equal(p1 : _root_.sn.gnome.glib.internal.gconstpointer, p2 : _root_.sn.gnome.glib.internal.gconstpointer): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def gdk_rgba_free(rgba : Ptr[GdkRGBA]): Unit = extern

@extern def gdk_rgba_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def gdk_rgba_hash(p : _root_.sn.gnome.glib.internal.gconstpointer): _root_.sn.gnome.glib.internal.guint = extern

@extern def gdk_rgba_is_clear(rgba : Ptr[GdkRGBA]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def gdk_rgba_is_opaque(rgba : Ptr[GdkRGBA]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def gdk_rgba_parse(rgba : Ptr[GdkRGBA], spec : CString): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def gdk_rgba_to_string(rgba : Ptr[GdkRGBA]): CString = extern

@extern def gdk_scroll_direction_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def gdk_scroll_event_get_deltas(event : Ptr[GdkEvent], delta_x : Ptr[Double], delta_y : Ptr[Double]): Unit = extern

@extern def gdk_scroll_event_get_direction(event : Ptr[GdkEvent]): GdkScrollDirection = extern

@extern def gdk_scroll_event_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def gdk_scroll_event_get_unit(event : Ptr[GdkEvent]): GdkScrollUnit = extern

@extern def gdk_scroll_event_is_stop(event : Ptr[GdkEvent]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def gdk_scroll_unit_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def gdk_seat_capabilities_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def gdk_seat_get_capabilities(seat : Ptr[GdkSeat]): GdkSeatCapabilities = extern

@extern def gdk_seat_get_devices(seat : Ptr[GdkSeat], capabilities : GdkSeatCapabilities): Ptr[_root_.sn.gnome.glib.internal.GList] = extern

@extern def gdk_seat_get_display(seat : Ptr[GdkSeat]): Ptr[GdkDisplay] = extern

@extern def gdk_seat_get_keyboard(seat : Ptr[GdkSeat]): Ptr[GdkDevice] = extern

@extern def gdk_seat_get_pointer(seat : Ptr[GdkSeat]): Ptr[GdkDevice] = extern

@extern def gdk_seat_get_tools(seat : Ptr[GdkSeat]): Ptr[_root_.sn.gnome.glib.internal.GList] = extern

@extern def gdk_seat_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def gdk_set_allowed_backends(backends : CString): Unit = extern

@extern def gdk_snapshot_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def gdk_subpixel_layout_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def gdk_surface_beep(surface : Ptr[GdkSurface]): Unit = extern

@extern def gdk_surface_create_cairo_context(surface : Ptr[GdkSurface]): Ptr[GdkCairoContext] = extern

@extern def gdk_surface_create_gl_context(surface : Ptr[GdkSurface], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GdkGLContext] = extern

@extern def gdk_surface_create_similar_surface(surface : Ptr[GdkSurface], content : _root_.sn.gnome.cairo.internal.cairo_content_t, width : CInt, height : CInt): Ptr[_root_.sn.gnome.cairo.internal.cairo_surface_t] = extern

@extern def gdk_surface_create_vulkan_context(surface : Ptr[GdkSurface], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GdkVulkanContext] = extern

@extern def gdk_surface_destroy(surface : Ptr[GdkSurface]): Unit = extern

@extern def gdk_surface_edge_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def gdk_surface_get_cursor(surface : Ptr[GdkSurface]): Ptr[GdkCursor] = extern

@extern def gdk_surface_get_device_cursor(surface : Ptr[GdkSurface], device : Ptr[GdkDevice]): Ptr[GdkCursor] = extern

@extern def gdk_surface_get_device_position(surface : Ptr[GdkSurface], device : Ptr[GdkDevice], x : Ptr[Double], y : Ptr[Double], mask : Ptr[GdkModifierType]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def gdk_surface_get_display(surface : Ptr[GdkSurface]): Ptr[GdkDisplay] = extern

@extern def gdk_surface_get_frame_clock(surface : Ptr[GdkSurface]): Ptr[GdkFrameClock] = extern

@extern def gdk_surface_get_height(surface : Ptr[GdkSurface]): CInt = extern

@extern def gdk_surface_get_mapped(surface : Ptr[GdkSurface]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def gdk_surface_get_scale(surface : Ptr[GdkSurface]): Double = extern

@extern def gdk_surface_get_scale_factor(surface : Ptr[GdkSurface]): CInt = extern

@extern def gdk_surface_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def gdk_surface_get_width(surface : Ptr[GdkSurface]): CInt = extern

@extern def gdk_surface_hide(surface : Ptr[GdkSurface]): Unit = extern

@extern def gdk_surface_is_destroyed(surface : Ptr[GdkSurface]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def gdk_surface_new_popup(parent : Ptr[GdkSurface], autohide : _root_.sn.gnome.glib.internal.gboolean): Ptr[GdkSurface] = extern

@extern def gdk_surface_new_toplevel(display : Ptr[GdkDisplay]): Ptr[GdkSurface] = extern

@extern def gdk_surface_queue_render(surface : Ptr[GdkSurface]): Unit = extern

@extern def gdk_surface_request_layout(surface : Ptr[GdkSurface]): Unit = extern

@extern def gdk_surface_set_cursor(surface : Ptr[GdkSurface], cursor : Ptr[GdkCursor]): Unit = extern

@extern def gdk_surface_set_device_cursor(surface : Ptr[GdkSurface], device : Ptr[GdkDevice], cursor : Ptr[GdkCursor]): Unit = extern

@extern def gdk_surface_set_input_region(surface : Ptr[GdkSurface], region : Ptr[_root_.sn.gnome.cairo.internal.cairo_region_t]): Unit = extern

@extern def gdk_surface_set_opaque_region(surface : Ptr[GdkSurface], region : Ptr[_root_.sn.gnome.cairo.internal.cairo_region_t]): Unit = extern

@extern def gdk_surface_translate_coordinates(from : Ptr[GdkSurface], to : Ptr[GdkSurface], x : Ptr[Double], y : Ptr[Double]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def gdk_texture_download(texture : Ptr[GdkTexture], data : Ptr[_root_.sn.gnome.glib.internal.guchar], stride : _root_.sn.gnome.glib.internal.gsize): Unit = extern

@extern def gdk_texture_downloader_copy(self : Ptr[GdkTextureDownloader]): Ptr[GdkTextureDownloader] = extern

@extern def gdk_texture_downloader_download_bytes(self : Ptr[GdkTextureDownloader], out_stride : Ptr[_root_.sn.gnome.glib.internal.gsize]): Ptr[_root_.sn.gnome.glib.internal.GBytes] = extern

@extern def gdk_texture_downloader_download_into(self : Ptr[GdkTextureDownloader], data : Ptr[_root_.sn.gnome.glib.internal.guchar], stride : _root_.sn.gnome.glib.internal.gsize): Unit = extern

@extern def gdk_texture_downloader_free(self : Ptr[GdkTextureDownloader]): Unit = extern

@extern def gdk_texture_downloader_get_format(self : Ptr[GdkTextureDownloader]): GdkMemoryFormat = extern

@extern def gdk_texture_downloader_get_texture(self : Ptr[GdkTextureDownloader]): Ptr[GdkTexture] = extern

@extern def gdk_texture_downloader_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def gdk_texture_downloader_new(texture : Ptr[GdkTexture]): Ptr[GdkTextureDownloader] = extern

@extern def gdk_texture_downloader_set_format(self : Ptr[GdkTextureDownloader], format : GdkMemoryFormat): Unit = extern

@extern def gdk_texture_downloader_set_texture(self : Ptr[GdkTextureDownloader], texture : Ptr[GdkTexture]): Unit = extern

@extern def gdk_texture_error_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def gdk_texture_error_quark(): _root_.sn.gnome.glib.internal.GQuark = extern

@extern def gdk_texture_get_format(self : Ptr[GdkTexture]): GdkMemoryFormat = extern

@extern def gdk_texture_get_height(texture : Ptr[GdkTexture]): CInt = extern

@extern def gdk_texture_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def gdk_texture_get_width(texture : Ptr[GdkTexture]): CInt = extern

@extern def gdk_texture_new_for_pixbuf(pixbuf : Ptr[_root_.sn.gnome.gdkpixbuf.internal.GdkPixbuf]): Ptr[GdkTexture] = extern

@extern def gdk_texture_new_from_bytes(bytes : Ptr[_root_.sn.gnome.glib.internal.GBytes], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GdkTexture] = extern

@extern def gdk_texture_new_from_file(file : Ptr[_root_.sn.gnome.gio.internal.GFile], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GdkTexture] = extern

@extern def gdk_texture_new_from_filename(path : CString, error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GdkTexture] = extern

@extern def gdk_texture_new_from_resource(resource_path : CString): Ptr[GdkTexture] = extern

@extern def gdk_texture_save_to_png(texture : Ptr[GdkTexture], filename : CString): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def gdk_texture_save_to_png_bytes(texture : Ptr[GdkTexture]): Ptr[_root_.sn.gnome.glib.internal.GBytes] = extern

@extern def gdk_texture_save_to_tiff(texture : Ptr[GdkTexture], filename : CString): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def gdk_texture_save_to_tiff_bytes(texture : Ptr[GdkTexture]): Ptr[_root_.sn.gnome.glib.internal.GBytes] = extern

@extern def gdk_titlebar_gesture_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def gdk_toplevel_begin_move(toplevel : Ptr[GdkToplevel], device : Ptr[GdkDevice], button : CInt, x : Double, y : Double, timestamp : _root_.sn.gnome.glib.internal.guint32): Unit = extern

@extern def gdk_toplevel_begin_resize(toplevel : Ptr[GdkToplevel], edge : GdkSurfaceEdge, device : Ptr[GdkDevice], button : CInt, x : Double, y : Double, timestamp : _root_.sn.gnome.glib.internal.guint32): Unit = extern

@extern def gdk_toplevel_focus(toplevel : Ptr[GdkToplevel], timestamp : _root_.sn.gnome.glib.internal.guint32): Unit = extern

@extern def gdk_toplevel_get_state(toplevel : Ptr[GdkToplevel]): GdkToplevelState = extern

@extern def gdk_toplevel_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def gdk_toplevel_inhibit_system_shortcuts(toplevel : Ptr[GdkToplevel], event : Ptr[GdkEvent]): Unit = extern

@extern def gdk_toplevel_layout_copy(layout : Ptr[GdkToplevelLayout]): Ptr[GdkToplevelLayout] = extern

@extern def gdk_toplevel_layout_equal(layout : Ptr[GdkToplevelLayout], other : Ptr[GdkToplevelLayout]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def gdk_toplevel_layout_get_fullscreen(layout : Ptr[GdkToplevelLayout], fullscreen : Ptr[_root_.sn.gnome.glib.internal.gboolean]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def gdk_toplevel_layout_get_fullscreen_monitor(layout : Ptr[GdkToplevelLayout]): Ptr[GdkMonitor] = extern

@extern def gdk_toplevel_layout_get_maximized(layout : Ptr[GdkToplevelLayout], maximized : Ptr[_root_.sn.gnome.glib.internal.gboolean]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def gdk_toplevel_layout_get_resizable(layout : Ptr[GdkToplevelLayout]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def gdk_toplevel_layout_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def gdk_toplevel_layout_new(): Ptr[GdkToplevelLayout] = extern

@extern def gdk_toplevel_layout_ref(layout : Ptr[GdkToplevelLayout]): Ptr[GdkToplevelLayout] = extern

@extern def gdk_toplevel_layout_set_fullscreen(layout : Ptr[GdkToplevelLayout], fullscreen : _root_.sn.gnome.glib.internal.gboolean, monitor : Ptr[GdkMonitor]): Unit = extern

@extern def gdk_toplevel_layout_set_maximized(layout : Ptr[GdkToplevelLayout], maximized : _root_.sn.gnome.glib.internal.gboolean): Unit = extern

@extern def gdk_toplevel_layout_set_resizable(layout : Ptr[GdkToplevelLayout], resizable : _root_.sn.gnome.glib.internal.gboolean): Unit = extern

@extern def gdk_toplevel_layout_unref(layout : Ptr[GdkToplevelLayout]): Unit = extern

@extern def gdk_toplevel_lower(toplevel : Ptr[GdkToplevel]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def gdk_toplevel_minimize(toplevel : Ptr[GdkToplevel]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def gdk_toplevel_present(toplevel : Ptr[GdkToplevel], layout : Ptr[GdkToplevelLayout]): Unit = extern

@extern def gdk_toplevel_restore_system_shortcuts(toplevel : Ptr[GdkToplevel]): Unit = extern

@extern def gdk_toplevel_set_decorated(toplevel : Ptr[GdkToplevel], decorated : _root_.sn.gnome.glib.internal.gboolean): Unit = extern

@extern def gdk_toplevel_set_deletable(toplevel : Ptr[GdkToplevel], deletable : _root_.sn.gnome.glib.internal.gboolean): Unit = extern

@extern def gdk_toplevel_set_icon_list(toplevel : Ptr[GdkToplevel], surfaces : Ptr[_root_.sn.gnome.glib.internal.GList]): Unit = extern

@extern def gdk_toplevel_set_modal(toplevel : Ptr[GdkToplevel], modal : _root_.sn.gnome.glib.internal.gboolean): Unit = extern

@extern def gdk_toplevel_set_startup_id(toplevel : Ptr[GdkToplevel], startup_id : CString): Unit = extern

@extern def gdk_toplevel_set_title(toplevel : Ptr[GdkToplevel], title : CString): Unit = extern

@extern def gdk_toplevel_set_transient_for(toplevel : Ptr[GdkToplevel], parent : Ptr[GdkSurface]): Unit = extern

@extern def gdk_toplevel_show_window_menu(toplevel : Ptr[GdkToplevel], event : Ptr[GdkEvent]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def gdk_toplevel_size_get_bounds(size : Ptr[GdkToplevelSize], bounds_width : Ptr[CInt], bounds_height : Ptr[CInt]): Unit = extern

@extern def gdk_toplevel_size_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def gdk_toplevel_size_set_min_size(size : Ptr[GdkToplevelSize], min_width : CInt, min_height : CInt): Unit = extern

@extern def gdk_toplevel_size_set_shadow_width(size : Ptr[GdkToplevelSize], left : CInt, right : CInt, top : CInt, bottom : CInt): Unit = extern

@extern def gdk_toplevel_size_set_size(size : Ptr[GdkToplevelSize], width : CInt, height : CInt): Unit = extern

@extern def gdk_toplevel_state_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def gdk_toplevel_supports_edge_constraints(toplevel : Ptr[GdkToplevel]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def gdk_toplevel_titlebar_gesture(toplevel : Ptr[GdkToplevel], gesture : GdkTitlebarGesture): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def gdk_touch_event_get_emulating_pointer(event : Ptr[GdkEvent]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def gdk_touch_event_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def gdk_touchpad_event_get_deltas(event : Ptr[GdkEvent], dx : Ptr[Double], dy : Ptr[Double]): Unit = extern

@extern def gdk_touchpad_event_get_gesture_phase(event : Ptr[GdkEvent]): GdkTouchpadGesturePhase = extern

@extern def gdk_touchpad_event_get_n_fingers(event : Ptr[GdkEvent]): _root_.sn.gnome.glib.internal.guint = extern

@extern def gdk_touchpad_event_get_pinch_angle_delta(event : Ptr[GdkEvent]): Double = extern

@extern def gdk_touchpad_event_get_pinch_scale(event : Ptr[GdkEvent]): Double = extern

@extern def gdk_touchpad_event_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def gdk_touchpad_gesture_phase_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def gdk_unicode_to_keyval(wc : _root_.sn.gnome.glib.internal.guint32): _root_.sn.gnome.glib.internal.guint = extern

@extern def gdk_vulkan_context_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def gdk_vulkan_error_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def gdk_vulkan_error_quark(): _root_.sn.gnome.glib.internal.GQuark = extern

@extern def glib_autoptr_cleanup_GdkAppLaunchContext(_ptr : Ptr[Ptr[GdkAppLaunchContext]]): Unit = extern

@extern def glib_autoptr_cleanup_GdkClipboard(_ptr : Ptr[Ptr[GdkClipboard]]): Unit = extern

@extern def glib_autoptr_cleanup_GdkContentFormats(_ptr : Ptr[Ptr[GdkContentFormats]]): Unit = extern

@extern def glib_autoptr_cleanup_GdkContentProvider(_ptr : Ptr[Ptr[GdkContentProvider]]): Unit = extern

@extern def glib_autoptr_cleanup_GdkCursor(_ptr : Ptr[Ptr[GdkCursor]]): Unit = extern

@extern def glib_autoptr_cleanup_GdkDevice(_ptr : Ptr[Ptr[GdkDevice]]): Unit = extern

@extern def glib_autoptr_cleanup_GdkDisplay(_ptr : Ptr[Ptr[GdkDisplay]]): Unit = extern

@extern def glib_autoptr_cleanup_GdkDisplayManager(_ptr : Ptr[Ptr[GdkDisplayManager]]): Unit = extern

@extern def glib_autoptr_cleanup_GdkDmabufTexture(_ptr : Ptr[Ptr[GdkDmabufTexture]]): Unit = extern

@extern def glib_autoptr_cleanup_GdkDmabufTextureBuilder(_ptr : Ptr[Ptr[GdkDmabufTextureBuilder]]): Unit = extern

@extern def glib_autoptr_cleanup_GdkDmabufTextureBuilderClass(_ptr : Ptr[Ptr[GdkDmabufTextureBuilderClass]]): Unit = extern

@extern def glib_autoptr_cleanup_GdkDrag(_ptr : Ptr[Ptr[GdkDrag]]): Unit = extern

@extern def glib_autoptr_cleanup_GdkDragSurface(_ptr : Ptr[Ptr[GdkDragSurface]]): Unit = extern

@extern def glib_autoptr_cleanup_GdkDrawContext(_ptr : Ptr[Ptr[GdkDrawContext]]): Unit = extern

@extern def glib_autoptr_cleanup_GdkDrop(_ptr : Ptr[Ptr[GdkDrop]]): Unit = extern

@extern def glib_autoptr_cleanup_GdkEvent(_ptr : Ptr[Ptr[GdkEvent]]): Unit = extern

@extern def glib_autoptr_cleanup_GdkFrameClock(_ptr : Ptr[Ptr[GdkFrameClock]]): Unit = extern

@extern def glib_autoptr_cleanup_GdkFrameTimings(_ptr : Ptr[Ptr[GdkFrameTimings]]): Unit = extern

@extern def glib_autoptr_cleanup_GdkGLContext(_ptr : Ptr[Ptr[GdkGLContext]]): Unit = extern

@extern def glib_autoptr_cleanup_GdkGLTexture(_ptr : Ptr[Ptr[GdkGLTexture]]): Unit = extern

@extern def glib_autoptr_cleanup_GdkGLTextureBuilder(_ptr : Ptr[Ptr[GdkGLTextureBuilder]]): Unit = extern

@extern def glib_autoptr_cleanup_GdkGLTextureBuilderClass(_ptr : Ptr[Ptr[GdkGLTextureBuilderClass]]): Unit = extern

@extern def glib_autoptr_cleanup_GdkMemoryTexture(_ptr : Ptr[Ptr[GdkMemoryTexture]]): Unit = extern

@extern def glib_autoptr_cleanup_GdkMonitor(_ptr : Ptr[Ptr[GdkMonitor]]): Unit = extern

@extern def glib_autoptr_cleanup_GdkPaintable(_ptr : Ptr[Ptr[GdkPaintable]]): Unit = extern

@extern def glib_autoptr_cleanup_GdkPopup(_ptr : Ptr[Ptr[GdkPopup]]): Unit = extern

@extern def glib_autoptr_cleanup_GdkPopupLayout(_ptr : Ptr[Ptr[GdkPopupLayout]]): Unit = extern

@extern def glib_autoptr_cleanup_GdkRGBA(_ptr : Ptr[Ptr[GdkRGBA]]): Unit = extern

@extern def glib_autoptr_cleanup_GdkSeat(_ptr : Ptr[Ptr[GdkSeat]]): Unit = extern

@extern def glib_autoptr_cleanup_GdkSnapshot(_ptr : Ptr[Ptr[GdkSnapshot]]): Unit = extern

@extern def glib_autoptr_cleanup_GdkSurface(_ptr : Ptr[Ptr[GdkSurface]]): Unit = extern

@extern def glib_autoptr_cleanup_GdkTexture(_ptr : Ptr[Ptr[GdkTexture]]): Unit = extern

@extern def glib_autoptr_cleanup_GdkTextureDownloader(_ptr : Ptr[Ptr[GdkTextureDownloader]]): Unit = extern

@extern def glib_autoptr_cleanup_GdkToplevel(_ptr : Ptr[Ptr[GdkToplevel]]): Unit = extern

@extern def glib_autoptr_cleanup_GdkToplevelLayout(_ptr : Ptr[Ptr[GdkToplevelLayout]]): Unit = extern

@extern def glib_autoptr_cleanup_GdkVulkanContext(_ptr : Ptr[Ptr[GdkVulkanContext]]): Unit = extern

@extern def glib_autoptr_clear_GdkAppLaunchContext(_ptr : Ptr[GdkAppLaunchContext]): Unit = extern

@extern def glib_autoptr_clear_GdkClipboard(_ptr : Ptr[GdkClipboard]): Unit = extern

@extern def glib_autoptr_clear_GdkContentFormats(_ptr : Ptr[GdkContentFormats]): Unit = extern

@extern def glib_autoptr_clear_GdkContentProvider(_ptr : Ptr[GdkContentProvider]): Unit = extern

@extern def glib_autoptr_clear_GdkCursor(_ptr : Ptr[GdkCursor]): Unit = extern

@extern def glib_autoptr_clear_GdkDevice(_ptr : Ptr[GdkDevice]): Unit = extern

@extern def glib_autoptr_clear_GdkDisplay(_ptr : Ptr[GdkDisplay]): Unit = extern

@extern def glib_autoptr_clear_GdkDisplayManager(_ptr : Ptr[GdkDisplayManager]): Unit = extern

@extern def glib_autoptr_clear_GdkDmabufTexture(_ptr : Ptr[GdkDmabufTexture]): Unit = extern

@extern def glib_autoptr_clear_GdkDmabufTextureBuilder(_ptr : Ptr[GdkDmabufTextureBuilder]): Unit = extern

@extern def glib_autoptr_clear_GdkDmabufTextureBuilderClass(_ptr : Ptr[GdkDmabufTextureBuilderClass]): Unit = extern

@extern def glib_autoptr_clear_GdkDrag(_ptr : Ptr[GdkDrag]): Unit = extern

@extern def glib_autoptr_clear_GdkDragSurface(_ptr : Ptr[GdkDragSurface]): Unit = extern

@extern def glib_autoptr_clear_GdkDrawContext(_ptr : Ptr[GdkDrawContext]): Unit = extern

@extern def glib_autoptr_clear_GdkDrop(_ptr : Ptr[GdkDrop]): Unit = extern

@extern def glib_autoptr_clear_GdkEvent(_ptr : Ptr[GdkEvent]): Unit = extern

@extern def glib_autoptr_clear_GdkFrameClock(_ptr : Ptr[GdkFrameClock]): Unit = extern

@extern def glib_autoptr_clear_GdkFrameTimings(_ptr : Ptr[GdkFrameTimings]): Unit = extern

@extern def glib_autoptr_clear_GdkGLContext(_ptr : Ptr[GdkGLContext]): Unit = extern

@extern def glib_autoptr_clear_GdkGLTexture(_ptr : Ptr[GdkGLTexture]): Unit = extern

@extern def glib_autoptr_clear_GdkGLTextureBuilder(_ptr : Ptr[GdkGLTextureBuilder]): Unit = extern

@extern def glib_autoptr_clear_GdkGLTextureBuilderClass(_ptr : Ptr[GdkGLTextureBuilderClass]): Unit = extern

@extern def glib_autoptr_clear_GdkMemoryTexture(_ptr : Ptr[GdkMemoryTexture]): Unit = extern

@extern def glib_autoptr_clear_GdkMonitor(_ptr : Ptr[GdkMonitor]): Unit = extern

@extern def glib_autoptr_clear_GdkPaintable(_ptr : Ptr[GdkPaintable]): Unit = extern

@extern def glib_autoptr_clear_GdkPopup(_ptr : Ptr[GdkPopup]): Unit = extern

@extern def glib_autoptr_clear_GdkPopupLayout(_ptr : Ptr[GdkPopupLayout]): Unit = extern

@extern def glib_autoptr_clear_GdkRGBA(_ptr : Ptr[GdkRGBA]): Unit = extern

@extern def glib_autoptr_clear_GdkSeat(_ptr : Ptr[GdkSeat]): Unit = extern

@extern def glib_autoptr_clear_GdkSnapshot(_ptr : Ptr[GdkSnapshot]): Unit = extern

@extern def glib_autoptr_clear_GdkSurface(_ptr : Ptr[GdkSurface]): Unit = extern

@extern def glib_autoptr_clear_GdkTexture(_ptr : Ptr[GdkTexture]): Unit = extern

@extern def glib_autoptr_clear_GdkTextureDownloader(_ptr : Ptr[GdkTextureDownloader]): Unit = extern

@extern def glib_autoptr_clear_GdkToplevel(_ptr : Ptr[GdkToplevel]): Unit = extern

@extern def glib_autoptr_clear_GdkToplevelLayout(_ptr : Ptr[GdkToplevelLayout]): Unit = extern

@extern def glib_autoptr_clear_GdkVulkanContext(_ptr : Ptr[GdkVulkanContext]): Unit = extern

@extern def glib_listautoptr_cleanup_GdkAppLaunchContext(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GdkClipboard(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GdkContentFormats(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GdkContentProvider(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GdkCursor(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GdkDevice(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GdkDisplay(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GdkDisplayManager(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GdkDmabufTexture(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GdkDmabufTextureBuilder(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GdkDmabufTextureBuilderClass(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GdkDrag(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GdkDragSurface(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GdkDrawContext(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GdkDrop(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GdkEvent(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GdkFrameClock(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GdkFrameTimings(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GdkGLContext(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GdkGLTexture(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GdkGLTextureBuilder(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GdkGLTextureBuilderClass(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GdkMemoryTexture(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GdkMonitor(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GdkPaintable(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GdkPopup(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GdkPopupLayout(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GdkRGBA(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GdkSeat(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GdkSnapshot(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GdkSurface(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GdkTexture(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GdkTextureDownloader(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GdkToplevel(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GdkToplevelLayout(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GdkVulkanContext(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GdkAppLaunchContext(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GdkClipboard(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GdkContentFormats(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GdkContentProvider(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GdkCursor(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GdkDevice(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GdkDisplay(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GdkDisplayManager(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GdkDmabufTexture(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GdkDmabufTextureBuilder(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GdkDmabufTextureBuilderClass(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GdkDrag(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GdkDragSurface(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GdkDrawContext(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GdkDrop(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GdkEvent(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GdkFrameClock(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GdkFrameTimings(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GdkGLContext(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GdkGLTexture(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GdkGLTextureBuilder(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GdkGLTextureBuilderClass(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GdkMemoryTexture(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GdkMonitor(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GdkPaintable(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GdkPopup(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GdkPopupLayout(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GdkRGBA(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GdkSeat(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GdkSnapshot(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GdkSurface(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GdkTexture(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GdkTextureDownloader(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GdkToplevel(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GdkToplevelLayout(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GdkVulkanContext(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GdkAppLaunchContext(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GdkClipboard(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GdkContentFormats(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GdkContentProvider(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GdkCursor(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GdkDevice(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GdkDisplay(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GdkDisplayManager(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GdkDmabufTexture(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GdkDmabufTextureBuilder(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GdkDmabufTextureBuilderClass(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GdkDrag(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GdkDragSurface(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GdkDrawContext(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GdkDrop(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GdkEvent(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GdkFrameClock(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GdkFrameTimings(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GdkGLContext(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GdkGLTexture(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GdkGLTextureBuilder(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GdkGLTextureBuilderClass(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GdkMemoryTexture(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GdkMonitor(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GdkPaintable(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GdkPopup(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GdkPopupLayout(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GdkRGBA(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GdkSeat(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GdkSnapshot(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GdkSurface(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GdkTexture(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GdkTextureDownloader(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GdkToplevel(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GdkToplevelLayout(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GdkVulkanContext(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern