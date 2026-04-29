package sn.gnome.gdkpixbuf.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

@extern def gdk_colorspace_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def gdk_interp_type_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def gdk_pixbuf_add_alpha(pixbuf : Ptr[GdkPixbuf], substitute_color : _root_.sn.gnome.glib.internal.gboolean, r : _root_.sn.gnome.glib.internal.guchar, g : _root_.sn.gnome.glib.internal.guchar, b : _root_.sn.gnome.glib.internal.guchar): Ptr[GdkPixbuf] = extern

@extern def gdk_pixbuf_alpha_mode_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def gdk_pixbuf_animation_get_height(animation : Ptr[GdkPixbufAnimation]): CInt = extern

@extern def gdk_pixbuf_animation_get_iter(animation : Ptr[GdkPixbufAnimation], start_time : Ptr[_root_.sn.gnome.glib.internal.GTimeVal]): Ptr[GdkPixbufAnimationIter] = extern

@extern def gdk_pixbuf_animation_get_static_image(animation : Ptr[GdkPixbufAnimation]): Ptr[GdkPixbuf] = extern

@extern def gdk_pixbuf_animation_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def gdk_pixbuf_animation_get_width(animation : Ptr[GdkPixbufAnimation]): CInt = extern

@extern def gdk_pixbuf_animation_is_static_image(animation : Ptr[GdkPixbufAnimation]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def gdk_pixbuf_animation_iter_advance(iter : Ptr[GdkPixbufAnimationIter], current_time : Ptr[_root_.sn.gnome.glib.internal.GTimeVal]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def gdk_pixbuf_animation_iter_get_delay_time(iter : Ptr[GdkPixbufAnimationIter]): CInt = extern

@extern def gdk_pixbuf_animation_iter_get_pixbuf(iter : Ptr[GdkPixbufAnimationIter]): Ptr[GdkPixbuf] = extern

@extern def gdk_pixbuf_animation_iter_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def gdk_pixbuf_animation_iter_on_currently_loading_frame(iter : Ptr[GdkPixbufAnimationIter]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def gdk_pixbuf_animation_new_from_file(filename : CString, error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GdkPixbufAnimation] = extern

@extern def gdk_pixbuf_animation_new_from_resource(resource_path : CString, error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GdkPixbufAnimation] = extern

@extern def gdk_pixbuf_animation_new_from_stream(stream : Ptr[_root_.sn.gnome.gio.internal.GInputStream], cancellable : Ptr[_root_.sn.gnome.gio.internal.GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GdkPixbufAnimation] = extern

@extern def gdk_pixbuf_animation_new_from_stream_async(stream : Ptr[_root_.sn.gnome.gio.internal.GInputStream], cancellable : Ptr[_root_.sn.gnome.gio.internal.GCancellable], callback : _root_.sn.gnome.gio.internal.GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def gdk_pixbuf_animation_new_from_stream_finish(async_result : Ptr[_root_.sn.gnome.gio.internal.GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GdkPixbufAnimation] = extern

@extern def gdk_pixbuf_animation_ref(animation : Ptr[GdkPixbufAnimation]): Ptr[GdkPixbufAnimation] = extern

@extern def gdk_pixbuf_animation_unref(animation : Ptr[GdkPixbufAnimation]): Unit = extern

@extern def gdk_pixbuf_apply_embedded_orientation(src : Ptr[GdkPixbuf]): Ptr[GdkPixbuf] = extern

@extern def gdk_pixbuf_calculate_rowstride(colorspace : GdkColorspace, has_alpha : _root_.sn.gnome.glib.internal.gboolean, bits_per_sample : CInt, width : CInt, height : CInt): _root_.sn.gnome.glib.internal.gint = extern

@extern def gdk_pixbuf_composite(src : Ptr[GdkPixbuf], dest : Ptr[GdkPixbuf], dest_x : CInt, dest_y : CInt, dest_width : CInt, dest_height : CInt, offset_x : Double, offset_y : Double, scale_x : Double, scale_y : Double, interp_type : GdkInterpType, overall_alpha : CInt): Unit = extern

@extern def gdk_pixbuf_composite_color(src : Ptr[GdkPixbuf], dest : Ptr[GdkPixbuf], dest_x : CInt, dest_y : CInt, dest_width : CInt, dest_height : CInt, offset_x : Double, offset_y : Double, scale_x : Double, scale_y : Double, interp_type : GdkInterpType, overall_alpha : CInt, check_x : CInt, check_y : CInt, check_size : CInt, color1 : _root_.sn.gnome.glib.internal.guint32, color2 : _root_.sn.gnome.glib.internal.guint32): Unit = extern

@extern def gdk_pixbuf_composite_color_simple(src : Ptr[GdkPixbuf], dest_width : CInt, dest_height : CInt, interp_type : GdkInterpType, overall_alpha : CInt, check_size : CInt, color1 : _root_.sn.gnome.glib.internal.guint32, color2 : _root_.sn.gnome.glib.internal.guint32): Ptr[GdkPixbuf] = extern

@extern def gdk_pixbuf_copy(pixbuf : Ptr[GdkPixbuf]): Ptr[GdkPixbuf] = extern

@extern def gdk_pixbuf_copy_area(src_pixbuf : Ptr[GdkPixbuf], src_x : CInt, src_y : CInt, width : CInt, height : CInt, dest_pixbuf : Ptr[GdkPixbuf], dest_x : CInt, dest_y : CInt): Unit = extern

@extern def gdk_pixbuf_copy_options(src_pixbuf : Ptr[GdkPixbuf], dest_pixbuf : Ptr[GdkPixbuf]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def gdk_pixbuf_error_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def gdk_pixbuf_error_quark(): _root_.sn.gnome.glib.internal.GQuark = extern

@extern def gdk_pixbuf_fill(pixbuf : Ptr[GdkPixbuf], pixel : _root_.sn.gnome.glib.internal.guint32): Unit = extern

@extern def gdk_pixbuf_flip(src : Ptr[GdkPixbuf], horizontal : _root_.sn.gnome.glib.internal.gboolean): Ptr[GdkPixbuf] = extern

@extern def gdk_pixbuf_format_copy(format : Ptr[GdkPixbufFormat]): Ptr[GdkPixbufFormat] = extern

@extern def gdk_pixbuf_format_free(format : Ptr[GdkPixbufFormat]): Unit = extern

@extern def gdk_pixbuf_format_get_description(format : Ptr[GdkPixbufFormat]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def gdk_pixbuf_format_get_extensions(format : Ptr[GdkPixbufFormat]): Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]] = extern

@extern def gdk_pixbuf_format_get_license(format : Ptr[GdkPixbufFormat]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def gdk_pixbuf_format_get_mime_types(format : Ptr[GdkPixbufFormat]): Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]] = extern

@extern def gdk_pixbuf_format_get_name(format : Ptr[GdkPixbufFormat]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def gdk_pixbuf_format_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def gdk_pixbuf_format_is_disabled(format : Ptr[GdkPixbufFormat]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def gdk_pixbuf_format_is_save_option_supported(format : Ptr[GdkPixbufFormat], option_key : Ptr[_root_.sn.gnome.glib.internal.gchar]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def gdk_pixbuf_format_is_scalable(format : Ptr[GdkPixbufFormat]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def gdk_pixbuf_format_is_writable(format : Ptr[GdkPixbufFormat]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def gdk_pixbuf_format_set_disabled(format : Ptr[GdkPixbufFormat], disabled : _root_.sn.gnome.glib.internal.gboolean): Unit = extern

@extern def gdk_pixbuf_get_bits_per_sample(pixbuf : Ptr[GdkPixbuf]): CInt = extern

@extern def gdk_pixbuf_get_byte_length(pixbuf : Ptr[GdkPixbuf]): _root_.sn.gnome.glib.internal.gsize = extern

@extern def gdk_pixbuf_get_colorspace(pixbuf : Ptr[GdkPixbuf]): GdkColorspace = extern

@extern def gdk_pixbuf_get_file_info(filename : Ptr[_root_.sn.gnome.glib.internal.gchar], width : Ptr[_root_.sn.gnome.glib.internal.gint], height : Ptr[_root_.sn.gnome.glib.internal.gint]): Ptr[GdkPixbufFormat] = extern

@extern def gdk_pixbuf_get_file_info_async(filename : Ptr[_root_.sn.gnome.glib.internal.gchar], cancellable : Ptr[_root_.sn.gnome.gio.internal.GCancellable], callback : _root_.sn.gnome.gio.internal.GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def gdk_pixbuf_get_file_info_finish(async_result : Ptr[_root_.sn.gnome.gio.internal.GAsyncResult], width : Ptr[_root_.sn.gnome.glib.internal.gint], height : Ptr[_root_.sn.gnome.glib.internal.gint], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GdkPixbufFormat] = extern

@extern def gdk_pixbuf_get_formats(): Ptr[_root_.sn.gnome.glib.internal.GSList] = extern

@extern def gdk_pixbuf_get_has_alpha(pixbuf : Ptr[GdkPixbuf]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def gdk_pixbuf_get_height(pixbuf : Ptr[GdkPixbuf]): CInt = extern

@extern def gdk_pixbuf_get_n_channels(pixbuf : Ptr[GdkPixbuf]): CInt = extern

@extern def gdk_pixbuf_get_option(pixbuf : Ptr[GdkPixbuf], key : Ptr[_root_.sn.gnome.glib.internal.gchar]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def gdk_pixbuf_get_options(pixbuf : Ptr[GdkPixbuf]): Ptr[_root_.sn.gnome.glib.internal.GHashTable] = extern

@extern def gdk_pixbuf_get_pixels(pixbuf : Ptr[GdkPixbuf]): Ptr[_root_.sn.gnome.glib.internal.guchar] = extern

@extern def gdk_pixbuf_get_pixels_with_length(pixbuf : Ptr[GdkPixbuf], length : Ptr[_root_.sn.gnome.glib.internal.guint]): Ptr[_root_.sn.gnome.glib.internal.guchar] = extern

@extern def gdk_pixbuf_get_rowstride(pixbuf : Ptr[GdkPixbuf]): CInt = extern

@extern def gdk_pixbuf_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def gdk_pixbuf_get_width(pixbuf : Ptr[GdkPixbuf]): CInt = extern

@extern def gdk_pixbuf_init_modules(path : CString, error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def gdk_pixbuf_loader_close(loader : Ptr[GdkPixbufLoader], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def gdk_pixbuf_loader_get_animation(loader : Ptr[GdkPixbufLoader]): Ptr[GdkPixbufAnimation] = extern

@extern def gdk_pixbuf_loader_get_format(loader : Ptr[GdkPixbufLoader]): Ptr[GdkPixbufFormat] = extern

@extern def gdk_pixbuf_loader_get_pixbuf(loader : Ptr[GdkPixbufLoader]): Ptr[GdkPixbuf] = extern

@extern def gdk_pixbuf_loader_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def gdk_pixbuf_loader_new(): Ptr[GdkPixbufLoader] = extern

@extern def gdk_pixbuf_loader_new_with_mime_type(mime_type : CString, error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GdkPixbufLoader] = extern

@extern def gdk_pixbuf_loader_new_with_type(image_type : CString, error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GdkPixbufLoader] = extern

@extern def gdk_pixbuf_loader_set_size(loader : Ptr[GdkPixbufLoader], width : CInt, height : CInt): Unit = extern

@extern def gdk_pixbuf_loader_write(loader : Ptr[GdkPixbufLoader], buf : Ptr[_root_.sn.gnome.glib.internal.guchar], count : _root_.sn.gnome.glib.internal.gsize, error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def gdk_pixbuf_loader_write_bytes(loader : Ptr[GdkPixbufLoader], buffer : Ptr[_root_.sn.gnome.glib.internal.GBytes], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def gdk_pixbuf_new(colorspace : GdkColorspace, has_alpha : _root_.sn.gnome.glib.internal.gboolean, bits_per_sample : CInt, width : CInt, height : CInt): Ptr[GdkPixbuf] = extern

@extern def gdk_pixbuf_new_from_bytes(data : Ptr[_root_.sn.gnome.glib.internal.GBytes], colorspace : GdkColorspace, has_alpha : _root_.sn.gnome.glib.internal.gboolean, bits_per_sample : CInt, width : CInt, height : CInt, rowstride : CInt): Ptr[GdkPixbuf] = extern

@extern def gdk_pixbuf_new_from_data(data : Ptr[_root_.sn.gnome.glib.internal.guchar], colorspace : GdkColorspace, has_alpha : _root_.sn.gnome.glib.internal.gboolean, bits_per_sample : CInt, width : CInt, height : CInt, rowstride : CInt, destroy_fn : GdkPixbufDestroyNotify, destroy_fn_data : _root_.sn.gnome.glib.internal.gpointer): Ptr[GdkPixbuf] = extern

@extern def gdk_pixbuf_new_from_file(filename : CString, error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GdkPixbuf] = extern

@extern def gdk_pixbuf_new_from_file_at_scale(filename : CString, width : CInt, height : CInt, preserve_aspect_ratio : _root_.sn.gnome.glib.internal.gboolean, error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GdkPixbuf] = extern

@extern def gdk_pixbuf_new_from_file_at_size(filename : CString, width : CInt, height : CInt, error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GdkPixbuf] = extern

@extern def gdk_pixbuf_new_from_inline(data_length : _root_.sn.gnome.glib.internal.gint, data : Ptr[_root_.sn.gnome.glib.internal.guint8], copy_pixels : _root_.sn.gnome.glib.internal.gboolean, error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GdkPixbuf] = extern

@extern def gdk_pixbuf_new_from_resource(resource_path : CString, error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GdkPixbuf] = extern

@extern def gdk_pixbuf_new_from_resource_at_scale(resource_path : CString, width : CInt, height : CInt, preserve_aspect_ratio : _root_.sn.gnome.glib.internal.gboolean, error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GdkPixbuf] = extern

@extern def gdk_pixbuf_new_from_stream(stream : Ptr[_root_.sn.gnome.gio.internal.GInputStream], cancellable : Ptr[_root_.sn.gnome.gio.internal.GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GdkPixbuf] = extern

@extern def gdk_pixbuf_new_from_stream_async(stream : Ptr[_root_.sn.gnome.gio.internal.GInputStream], cancellable : Ptr[_root_.sn.gnome.gio.internal.GCancellable], callback : _root_.sn.gnome.gio.internal.GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def gdk_pixbuf_new_from_stream_at_scale(stream : Ptr[_root_.sn.gnome.gio.internal.GInputStream], width : _root_.sn.gnome.glib.internal.gint, height : _root_.sn.gnome.glib.internal.gint, preserve_aspect_ratio : _root_.sn.gnome.glib.internal.gboolean, cancellable : Ptr[_root_.sn.gnome.gio.internal.GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GdkPixbuf] = extern

@extern def gdk_pixbuf_new_from_stream_at_scale_async(stream : Ptr[_root_.sn.gnome.gio.internal.GInputStream], width : _root_.sn.gnome.glib.internal.gint, height : _root_.sn.gnome.glib.internal.gint, preserve_aspect_ratio : _root_.sn.gnome.glib.internal.gboolean, cancellable : Ptr[_root_.sn.gnome.gio.internal.GCancellable], callback : _root_.sn.gnome.gio.internal.GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def gdk_pixbuf_new_from_stream_finish(async_result : Ptr[_root_.sn.gnome.gio.internal.GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GdkPixbuf] = extern

@extern def gdk_pixbuf_new_from_xpm_data(data : Ptr[CString]): Ptr[GdkPixbuf] = extern

@extern def gdk_pixbuf_new_subpixbuf(src_pixbuf : Ptr[GdkPixbuf], src_x : CInt, src_y : CInt, width : CInt, height : CInt): Ptr[GdkPixbuf] = extern

@extern def gdk_pixbuf_read_pixel_bytes(pixbuf : Ptr[GdkPixbuf]): Ptr[_root_.sn.gnome.glib.internal.GBytes] = extern

@extern def gdk_pixbuf_read_pixels(pixbuf : Ptr[GdkPixbuf]): Ptr[_root_.sn.gnome.glib.internal.guint8] = extern

@extern def gdk_pixbuf_ref(pixbuf : Ptr[GdkPixbuf]): Ptr[GdkPixbuf] = extern

@extern def gdk_pixbuf_remove_option(pixbuf : Ptr[GdkPixbuf], key : Ptr[_root_.sn.gnome.glib.internal.gchar]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def gdk_pixbuf_rotate_simple(src : Ptr[GdkPixbuf], angle : GdkPixbufRotation): Ptr[GdkPixbuf] = extern

@extern def gdk_pixbuf_rotation_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def gdk_pixbuf_saturate_and_pixelate(src : Ptr[GdkPixbuf], dest : Ptr[GdkPixbuf], saturation : _root_.sn.gnome.glib.internal.gfloat, pixelate : _root_.sn.gnome.glib.internal.gboolean): Unit = extern

@extern def gdk_pixbuf_save(pixbuf : Ptr[GdkPixbuf], filename : CString, `type` : CString, error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], rest: Any*): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def gdk_pixbuf_save_to_buffer(pixbuf : Ptr[GdkPixbuf], buffer : Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]], buffer_size : Ptr[_root_.sn.gnome.glib.internal.gsize], `type` : CString, error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], rest: Any*): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def gdk_pixbuf_save_to_bufferv(pixbuf : Ptr[GdkPixbuf], buffer : Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]], buffer_size : Ptr[_root_.sn.gnome.glib.internal.gsize], `type` : CString, option_keys : Ptr[CString], option_values : Ptr[CString], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def gdk_pixbuf_save_to_callback(pixbuf : Ptr[GdkPixbuf], save_func : GdkPixbufSaveFunc, user_data : _root_.sn.gnome.glib.internal.gpointer, `type` : CString, error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], rest: Any*): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def gdk_pixbuf_save_to_callbackv(pixbuf : Ptr[GdkPixbuf], save_func : GdkPixbufSaveFunc, user_data : _root_.sn.gnome.glib.internal.gpointer, `type` : CString, option_keys : Ptr[CString], option_values : Ptr[CString], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def gdk_pixbuf_save_to_stream(pixbuf : Ptr[GdkPixbuf], stream : Ptr[_root_.sn.gnome.gio.internal.GOutputStream], `type` : CString, cancellable : Ptr[_root_.sn.gnome.gio.internal.GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], rest: Any*): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def gdk_pixbuf_save_to_stream_async(pixbuf : Ptr[GdkPixbuf], stream : Ptr[_root_.sn.gnome.gio.internal.GOutputStream], `type` : Ptr[_root_.sn.gnome.glib.internal.gchar], cancellable : Ptr[_root_.sn.gnome.gio.internal.GCancellable], callback : _root_.sn.gnome.gio.internal.GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer, rest: Any*): Unit = extern

@extern def gdk_pixbuf_save_to_stream_finish(async_result : Ptr[_root_.sn.gnome.gio.internal.GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def gdk_pixbuf_save_to_streamv(pixbuf : Ptr[GdkPixbuf], stream : Ptr[_root_.sn.gnome.gio.internal.GOutputStream], `type` : CString, option_keys : Ptr[CString], option_values : Ptr[CString], cancellable : Ptr[_root_.sn.gnome.gio.internal.GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def gdk_pixbuf_save_to_streamv_async(pixbuf : Ptr[GdkPixbuf], stream : Ptr[_root_.sn.gnome.gio.internal.GOutputStream], `type` : Ptr[_root_.sn.gnome.glib.internal.gchar], option_keys : Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]], option_values : Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]], cancellable : Ptr[_root_.sn.gnome.gio.internal.GCancellable], callback : _root_.sn.gnome.gio.internal.GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def gdk_pixbuf_savev(pixbuf : Ptr[GdkPixbuf], filename : CString, `type` : CString, option_keys : Ptr[CString], option_values : Ptr[CString], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def gdk_pixbuf_scale(src : Ptr[GdkPixbuf], dest : Ptr[GdkPixbuf], dest_x : CInt, dest_y : CInt, dest_width : CInt, dest_height : CInt, offset_x : Double, offset_y : Double, scale_x : Double, scale_y : Double, interp_type : GdkInterpType): Unit = extern

@extern def gdk_pixbuf_scale_simple(src : Ptr[GdkPixbuf], dest_width : CInt, dest_height : CInt, interp_type : GdkInterpType): Ptr[GdkPixbuf] = extern

@extern def gdk_pixbuf_set_option(pixbuf : Ptr[GdkPixbuf], key : Ptr[_root_.sn.gnome.glib.internal.gchar], value : Ptr[_root_.sn.gnome.glib.internal.gchar]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def gdk_pixbuf_simple_anim_add_frame(animation : Ptr[GdkPixbufSimpleAnim], pixbuf : Ptr[GdkPixbuf]): Unit = extern

@extern def gdk_pixbuf_simple_anim_get_loop(animation : Ptr[GdkPixbufSimpleAnim]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def gdk_pixbuf_simple_anim_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def gdk_pixbuf_simple_anim_iter_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def gdk_pixbuf_simple_anim_new(width : _root_.sn.gnome.glib.internal.gint, height : _root_.sn.gnome.glib.internal.gint, rate : _root_.sn.gnome.glib.internal.gfloat): Ptr[GdkPixbufSimpleAnim] = extern

@extern def gdk_pixbuf_simple_anim_set_loop(animation : Ptr[GdkPixbufSimpleAnim], loop : _root_.sn.gnome.glib.internal.gboolean): Unit = extern

@extern def gdk_pixbuf_unref(pixbuf : Ptr[GdkPixbuf]): Unit = extern

@extern def glib_autoptr_cleanup_GdkPixbuf(_ptr : Ptr[Ptr[GdkPixbuf]]): Unit = extern

@extern def glib_autoptr_cleanup_GdkPixbufAnimation(_ptr : Ptr[Ptr[GdkPixbufAnimation]]): Unit = extern

@extern def glib_autoptr_cleanup_GdkPixbufAnimationIter(_ptr : Ptr[Ptr[GdkPixbufAnimationIter]]): Unit = extern

@extern def glib_autoptr_cleanup_GdkPixbufLoader(_ptr : Ptr[Ptr[GdkPixbufLoader]]): Unit = extern

@extern def glib_autoptr_cleanup_GdkPixbufSimpleAnim(_ptr : Ptr[Ptr[GdkPixbufSimpleAnim]]): Unit = extern

@extern def glib_autoptr_clear_GdkPixbuf(_ptr : Ptr[GdkPixbuf]): Unit = extern

@extern def glib_autoptr_clear_GdkPixbufAnimation(_ptr : Ptr[GdkPixbufAnimation]): Unit = extern

@extern def glib_autoptr_clear_GdkPixbufAnimationIter(_ptr : Ptr[GdkPixbufAnimationIter]): Unit = extern

@extern def glib_autoptr_clear_GdkPixbufLoader(_ptr : Ptr[GdkPixbufLoader]): Unit = extern

@extern def glib_autoptr_clear_GdkPixbufSimpleAnim(_ptr : Ptr[GdkPixbufSimpleAnim]): Unit = extern

@extern def glib_listautoptr_cleanup_GdkPixbuf(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GdkPixbufAnimation(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GdkPixbufAnimationIter(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GdkPixbufLoader(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GdkPixbufSimpleAnim(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GdkPixbuf(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GdkPixbufAnimation(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GdkPixbufAnimationIter(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GdkPixbufLoader(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GdkPixbufSimpleAnim(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GdkPixbuf(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GdkPixbufAnimation(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GdkPixbufAnimationIter(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GdkPixbufLoader(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GdkPixbufSimpleAnim(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern