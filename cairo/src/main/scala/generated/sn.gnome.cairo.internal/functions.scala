package sn.gnome.cairo.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

@extern def cairo_append_path(cr : Ptr[cairo_t], path : Ptr[cairo_path_t]): Unit = extern

@extern def cairo_arc(cr : Ptr[cairo_t], xc : Double, yc : Double, radius : Double, angle1 : Double, angle2 : Double): Unit = extern

@extern def cairo_arc_negative(cr : Ptr[cairo_t], xc : Double, yc : Double, radius : Double, angle1 : Double, angle2 : Double): Unit = extern

@extern def cairo_clip(cr : Ptr[cairo_t]): Unit = extern

@extern def cairo_clip_extents(cr : Ptr[cairo_t], x1 : Ptr[Double], y1 : Ptr[Double], x2 : Ptr[Double], y2 : Ptr[Double]): Unit = extern

@extern def cairo_clip_preserve(cr : Ptr[cairo_t]): Unit = extern

@extern def cairo_close_path(cr : Ptr[cairo_t]): Unit = extern

@extern def cairo_copy_clip_rectangle_list(cr : Ptr[cairo_t]): Ptr[cairo_rectangle_list_t] = extern

@extern def cairo_copy_page(cr : Ptr[cairo_t]): Unit = extern

@extern def cairo_copy_path(cr : Ptr[cairo_t]): Ptr[cairo_path_t] = extern

@extern def cairo_copy_path_flat(cr : Ptr[cairo_t]): Ptr[cairo_path_t] = extern

@extern def cairo_create(target : Ptr[cairo_surface_t]): Ptr[cairo_t] = extern

@extern def cairo_curve_to(cr : Ptr[cairo_t], x1 : Double, y1 : Double, x2 : Double, y2 : Double, x3 : Double, y3 : Double): Unit = extern

@extern def cairo_debug_reset_static_data(): Unit = extern

@extern def cairo_destroy(cr : Ptr[cairo_t]): Unit = extern

@extern def cairo_device_acquire(device : Ptr[cairo_device_t]): cairo_status_t = extern

@extern def cairo_device_destroy(device : Ptr[cairo_device_t]): Unit = extern

@extern def cairo_device_finish(device : Ptr[cairo_device_t]): Unit = extern

@extern def cairo_device_flush(device : Ptr[cairo_device_t]): Unit = extern

@extern def cairo_device_get_reference_count(device : Ptr[cairo_device_t]): CUnsignedInt = extern

@extern def cairo_device_get_type(device : Ptr[cairo_device_t]): cairo_device_type_t = extern

@extern def cairo_device_get_user_data(device : Ptr[cairo_device_t], key : Ptr[cairo_user_data_key_t]): Ptr[Byte] = extern

@extern def cairo_device_observer_elapsed(abstract_device : Ptr[cairo_device_t]): Double = extern

@extern def cairo_device_observer_fill_elapsed(abstract_device : Ptr[cairo_device_t]): Double = extern

@extern def cairo_device_observer_glyphs_elapsed(abstract_device : Ptr[cairo_device_t]): Double = extern

@extern def cairo_device_observer_mask_elapsed(abstract_device : Ptr[cairo_device_t]): Double = extern

@extern def cairo_device_observer_paint_elapsed(abstract_device : Ptr[cairo_device_t]): Double = extern

@extern def cairo_device_observer_print(abstract_device : Ptr[cairo_device_t], write_func : cairo_write_func_t, closure : Ptr[Byte]): cairo_status_t = extern

@extern def cairo_device_observer_stroke_elapsed(abstract_device : Ptr[cairo_device_t]): Double = extern

@extern def cairo_device_reference(device : Ptr[cairo_device_t]): Ptr[cairo_device_t] = extern

@extern def cairo_device_release(device : Ptr[cairo_device_t]): Unit = extern

@extern def cairo_device_set_user_data(device : Ptr[cairo_device_t], key : Ptr[cairo_user_data_key_t], user_data : Ptr[Byte], destroy : cairo_destroy_func_t): cairo_status_t = extern

@extern def cairo_device_status(device : Ptr[cairo_device_t]): cairo_status_t = extern

@extern def cairo_device_to_user(cr : Ptr[cairo_t], x : Ptr[Double], y : Ptr[Double]): Unit = extern

@extern def cairo_device_to_user_distance(cr : Ptr[cairo_t], dx : Ptr[Double], dy : Ptr[Double]): Unit = extern

@extern def cairo_fill(cr : Ptr[cairo_t]): Unit = extern

@extern def cairo_fill_extents(cr : Ptr[cairo_t], x1 : Ptr[Double], y1 : Ptr[Double], x2 : Ptr[Double], y2 : Ptr[Double]): Unit = extern

@extern def cairo_fill_preserve(cr : Ptr[cairo_t]): Unit = extern

@extern def cairo_font_extents(cr : Ptr[cairo_t], extents : Ptr[cairo_font_extents_t]): Unit = extern

@extern def cairo_font_face_destroy(font_face : Ptr[cairo_font_face_t]): Unit = extern

@extern def cairo_font_face_get_reference_count(font_face : Ptr[cairo_font_face_t]): CUnsignedInt = extern

@extern def cairo_font_face_get_type(font_face : Ptr[cairo_font_face_t]): cairo_font_type_t = extern

@extern def cairo_font_face_get_user_data(font_face : Ptr[cairo_font_face_t], key : Ptr[cairo_user_data_key_t]): Ptr[Byte] = extern

@extern def cairo_font_face_reference(font_face : Ptr[cairo_font_face_t]): Ptr[cairo_font_face_t] = extern

@extern def cairo_font_face_set_user_data(font_face : Ptr[cairo_font_face_t], key : Ptr[cairo_user_data_key_t], user_data : Ptr[Byte], destroy : cairo_destroy_func_t): cairo_status_t = extern

@extern def cairo_font_face_status(font_face : Ptr[cairo_font_face_t]): cairo_status_t = extern

@extern def cairo_font_options_copy(original : Ptr[cairo_font_options_t]): Ptr[cairo_font_options_t] = extern

@extern def cairo_font_options_create(): Ptr[cairo_font_options_t] = extern

@extern def cairo_font_options_destroy(options : Ptr[cairo_font_options_t]): Unit = extern

@extern def cairo_font_options_equal(options : Ptr[cairo_font_options_t], other : Ptr[cairo_font_options_t]): cairo_bool_t = extern

@extern def cairo_font_options_get_antialias(options : Ptr[cairo_font_options_t]): cairo_antialias_t = extern

@extern def cairo_font_options_get_color_mode(options : Ptr[cairo_font_options_t]): cairo_color_mode_t = extern

@extern def cairo_font_options_get_color_palette(options : Ptr[cairo_font_options_t]): CUnsignedInt = extern

@extern def cairo_font_options_get_custom_palette_color(options : Ptr[cairo_font_options_t], index : CUnsignedInt, red : Ptr[Double], green : Ptr[Double], blue : Ptr[Double], alpha : Ptr[Double]): cairo_status_t = extern

@extern def cairo_font_options_get_hint_metrics(options : Ptr[cairo_font_options_t]): cairo_hint_metrics_t = extern

@extern def cairo_font_options_get_hint_style(options : Ptr[cairo_font_options_t]): cairo_hint_style_t = extern

@extern def cairo_font_options_get_subpixel_order(options : Ptr[cairo_font_options_t]): cairo_subpixel_order_t = extern

@extern def cairo_font_options_get_variations(options : Ptr[cairo_font_options_t]): CString = extern

@extern def cairo_font_options_hash(options : Ptr[cairo_font_options_t]): CUnsignedLongInt = extern

@extern def cairo_font_options_merge(options : Ptr[cairo_font_options_t], other : Ptr[cairo_font_options_t]): Unit = extern

@extern def cairo_font_options_set_antialias(options : Ptr[cairo_font_options_t], antialias : cairo_antialias_t): Unit = extern

@extern def cairo_font_options_set_color_mode(options : Ptr[cairo_font_options_t], color_mode : cairo_color_mode_t): Unit = extern

@extern def cairo_font_options_set_color_palette(options : Ptr[cairo_font_options_t], palette_index : CUnsignedInt): Unit = extern

@extern def cairo_font_options_set_custom_palette_color(options : Ptr[cairo_font_options_t], index : CUnsignedInt, red : Double, green : Double, blue : Double, alpha : Double): Unit = extern

@extern def cairo_font_options_set_hint_metrics(options : Ptr[cairo_font_options_t], hint_metrics : cairo_hint_metrics_t): Unit = extern

@extern def cairo_font_options_set_hint_style(options : Ptr[cairo_font_options_t], hint_style : cairo_hint_style_t): Unit = extern

@extern def cairo_font_options_set_subpixel_order(options : Ptr[cairo_font_options_t], subpixel_order : cairo_subpixel_order_t): Unit = extern

@extern def cairo_font_options_set_variations(options : Ptr[cairo_font_options_t], variations : CString): Unit = extern

@extern def cairo_font_options_status(options : Ptr[cairo_font_options_t]): cairo_status_t = extern

@extern def cairo_format_stride_for_width(format : cairo_format_t, width : CInt): CInt = extern

@extern def cairo_get_antialias(cr : Ptr[cairo_t]): cairo_antialias_t = extern

@extern def cairo_get_current_point(cr : Ptr[cairo_t], x : Ptr[Double], y : Ptr[Double]): Unit = extern

@extern def cairo_get_dash(cr : Ptr[cairo_t], dashes : Ptr[Double], offset : Ptr[Double]): Unit = extern

@extern def cairo_get_dash_count(cr : Ptr[cairo_t]): CInt = extern

@extern def cairo_get_fill_rule(cr : Ptr[cairo_t]): cairo_fill_rule_t = extern

@extern def cairo_get_font_face(cr : Ptr[cairo_t]): Ptr[cairo_font_face_t] = extern

@extern def cairo_get_font_matrix(cr : Ptr[cairo_t], matrix : Ptr[cairo_matrix_t]): Unit = extern

@extern def cairo_get_font_options(cr : Ptr[cairo_t], options : Ptr[cairo_font_options_t]): Unit = extern

@extern def cairo_get_group_target(cr : Ptr[cairo_t]): Ptr[cairo_surface_t] = extern

@extern def cairo_get_hairline(cr : Ptr[cairo_t]): cairo_bool_t = extern

@extern def cairo_get_line_cap(cr : Ptr[cairo_t]): cairo_line_cap_t = extern

@extern def cairo_get_line_join(cr : Ptr[cairo_t]): cairo_line_join_t = extern

@extern def cairo_get_line_width(cr : Ptr[cairo_t]): Double = extern

@extern def cairo_get_matrix(cr : Ptr[cairo_t], matrix : Ptr[cairo_matrix_t]): Unit = extern

@extern def cairo_get_miter_limit(cr : Ptr[cairo_t]): Double = extern

@extern def cairo_get_operator(cr : Ptr[cairo_t]): cairo_operator_t = extern

@extern def cairo_get_reference_count(cr : Ptr[cairo_t]): CUnsignedInt = extern

@extern def cairo_get_scaled_font(cr : Ptr[cairo_t]): Ptr[cairo_scaled_font_t] = extern

@extern def cairo_get_source(cr : Ptr[cairo_t]): Ptr[cairo_pattern_t] = extern

@extern def cairo_get_target(cr : Ptr[cairo_t]): Ptr[cairo_surface_t] = extern

@extern def cairo_get_tolerance(cr : Ptr[cairo_t]): Double = extern

@extern def cairo_get_user_data(cr : Ptr[cairo_t], key : Ptr[cairo_user_data_key_t]): Ptr[Byte] = extern

@extern def cairo_glyph_allocate(num_glyphs : CInt): Ptr[cairo_glyph_t] = extern

@extern def cairo_glyph_extents(cr : Ptr[cairo_t], glyphs : Ptr[cairo_glyph_t], num_glyphs : CInt, extents : Ptr[cairo_text_extents_t]): Unit = extern

@extern def cairo_glyph_free(glyphs : Ptr[cairo_glyph_t]): Unit = extern

@extern def cairo_glyph_path(cr : Ptr[cairo_t], glyphs : Ptr[cairo_glyph_t], num_glyphs : CInt): Unit = extern

@extern def cairo_has_current_point(cr : Ptr[cairo_t]): cairo_bool_t = extern

@extern def cairo_identity_matrix(cr : Ptr[cairo_t]): Unit = extern

@extern def cairo_image_surface_create(format : cairo_format_t, width : CInt, height : CInt): Ptr[cairo_surface_t] = extern

@extern def cairo_image_surface_create_for_data(data : Ptr[CUnsignedChar], format : cairo_format_t, width : CInt, height : CInt, stride : CInt): Ptr[cairo_surface_t] = extern

@extern def cairo_image_surface_create_from_png(filename : CString): Ptr[cairo_surface_t] = extern

@extern def cairo_image_surface_create_from_png_stream(read_func : cairo_read_func_t, closure : Ptr[Byte]): Ptr[cairo_surface_t] = extern

@extern def cairo_image_surface_get_data(surface : Ptr[cairo_surface_t]): Ptr[CUnsignedChar] = extern

@extern def cairo_image_surface_get_format(surface : Ptr[cairo_surface_t]): cairo_format_t = extern

@extern def cairo_image_surface_get_height(surface : Ptr[cairo_surface_t]): CInt = extern

@extern def cairo_image_surface_get_stride(surface : Ptr[cairo_surface_t]): CInt = extern

@extern def cairo_image_surface_get_width(surface : Ptr[cairo_surface_t]): CInt = extern

@extern def cairo_in_clip(cr : Ptr[cairo_t], x : Double, y : Double): cairo_bool_t = extern

@extern def cairo_in_fill(cr : Ptr[cairo_t], x : Double, y : Double): cairo_bool_t = extern

@extern def cairo_in_stroke(cr : Ptr[cairo_t], x : Double, y : Double): cairo_bool_t = extern

@extern def cairo_line_to(cr : Ptr[cairo_t], x : Double, y : Double): Unit = extern

@extern def cairo_mask(cr : Ptr[cairo_t], pattern : Ptr[cairo_pattern_t]): Unit = extern

@extern def cairo_mask_surface(cr : Ptr[cairo_t], surface : Ptr[cairo_surface_t], surface_x : Double, surface_y : Double): Unit = extern

@extern def cairo_matrix_init(matrix : Ptr[cairo_matrix_t], xx : Double, yx : Double, xy : Double, yy : Double, x0 : Double, y0 : Double): Unit = extern

@extern def cairo_matrix_init_identity(matrix : Ptr[cairo_matrix_t]): Unit = extern

@extern def cairo_matrix_init_rotate(matrix : Ptr[cairo_matrix_t], radians : Double): Unit = extern

@extern def cairo_matrix_init_scale(matrix : Ptr[cairo_matrix_t], sx : Double, sy : Double): Unit = extern

@extern def cairo_matrix_init_translate(matrix : Ptr[cairo_matrix_t], tx : Double, ty : Double): Unit = extern

@extern def cairo_matrix_invert(matrix : Ptr[cairo_matrix_t]): cairo_status_t = extern

@extern def cairo_matrix_multiply(result : Ptr[cairo_matrix_t], a : Ptr[cairo_matrix_t], b : Ptr[cairo_matrix_t]): Unit = extern

@extern def cairo_matrix_rotate(matrix : Ptr[cairo_matrix_t], radians : Double): Unit = extern

@extern def cairo_matrix_scale(matrix : Ptr[cairo_matrix_t], sx : Double, sy : Double): Unit = extern

@extern def cairo_matrix_transform_distance(matrix : Ptr[cairo_matrix_t], dx : Ptr[Double], dy : Ptr[Double]): Unit = extern

@extern def cairo_matrix_transform_point(matrix : Ptr[cairo_matrix_t], x : Ptr[Double], y : Ptr[Double]): Unit = extern

@extern def cairo_matrix_translate(matrix : Ptr[cairo_matrix_t], tx : Double, ty : Double): Unit = extern

@extern def cairo_mesh_pattern_begin_patch(pattern : Ptr[cairo_pattern_t]): Unit = extern

@extern def cairo_mesh_pattern_curve_to(pattern : Ptr[cairo_pattern_t], x1 : Double, y1 : Double, x2 : Double, y2 : Double, x3 : Double, y3 : Double): Unit = extern

@extern def cairo_mesh_pattern_end_patch(pattern : Ptr[cairo_pattern_t]): Unit = extern

@extern def cairo_mesh_pattern_get_control_point(pattern : Ptr[cairo_pattern_t], patch_num : CUnsignedInt, point_num : CUnsignedInt, x : Ptr[Double], y : Ptr[Double]): cairo_status_t = extern

@extern def cairo_mesh_pattern_get_corner_color_rgba(pattern : Ptr[cairo_pattern_t], patch_num : CUnsignedInt, corner_num : CUnsignedInt, red : Ptr[Double], green : Ptr[Double], blue : Ptr[Double], alpha : Ptr[Double]): cairo_status_t = extern

@extern def cairo_mesh_pattern_get_patch_count(pattern : Ptr[cairo_pattern_t], count : Ptr[CUnsignedInt]): cairo_status_t = extern

@extern def cairo_mesh_pattern_get_path(pattern : Ptr[cairo_pattern_t], patch_num : CUnsignedInt): Ptr[cairo_path_t] = extern

@extern def cairo_mesh_pattern_line_to(pattern : Ptr[cairo_pattern_t], x : Double, y : Double): Unit = extern

@extern def cairo_mesh_pattern_move_to(pattern : Ptr[cairo_pattern_t], x : Double, y : Double): Unit = extern

@extern def cairo_mesh_pattern_set_control_point(pattern : Ptr[cairo_pattern_t], point_num : CUnsignedInt, x : Double, y : Double): Unit = extern

@extern def cairo_mesh_pattern_set_corner_color_rgb(pattern : Ptr[cairo_pattern_t], corner_num : CUnsignedInt, red : Double, green : Double, blue : Double): Unit = extern

@extern def cairo_mesh_pattern_set_corner_color_rgba(pattern : Ptr[cairo_pattern_t], corner_num : CUnsignedInt, red : Double, green : Double, blue : Double, alpha : Double): Unit = extern

@extern def cairo_move_to(cr : Ptr[cairo_t], x : Double, y : Double): Unit = extern

@extern def cairo_new_path(cr : Ptr[cairo_t]): Unit = extern

@extern def cairo_new_sub_path(cr : Ptr[cairo_t]): Unit = extern

@extern def cairo_paint(cr : Ptr[cairo_t]): Unit = extern

@extern def cairo_paint_with_alpha(cr : Ptr[cairo_t], alpha : Double): Unit = extern

@extern def cairo_path_destroy(path : Ptr[cairo_path_t]): Unit = extern

@extern def cairo_path_extents(cr : Ptr[cairo_t], x1 : Ptr[Double], y1 : Ptr[Double], x2 : Ptr[Double], y2 : Ptr[Double]): Unit = extern

@extern def cairo_pattern_add_color_stop_rgb(pattern : Ptr[cairo_pattern_t], offset : Double, red : Double, green : Double, blue : Double): Unit = extern

@extern def cairo_pattern_add_color_stop_rgba(pattern : Ptr[cairo_pattern_t], offset : Double, red : Double, green : Double, blue : Double, alpha : Double): Unit = extern

@extern def cairo_pattern_create_for_surface(surface : Ptr[cairo_surface_t]): Ptr[cairo_pattern_t] = extern

@extern def cairo_pattern_create_linear(x0 : Double, y0 : Double, x1 : Double, y1 : Double): Ptr[cairo_pattern_t] = extern

@extern def cairo_pattern_create_mesh(): Ptr[cairo_pattern_t] = extern

@extern def cairo_pattern_create_radial(cx0 : Double, cy0 : Double, radius0 : Double, cx1 : Double, cy1 : Double, radius1 : Double): Ptr[cairo_pattern_t] = extern

@extern def cairo_pattern_create_raster_source(user_data : Ptr[Byte], content : cairo_content_t, width : CInt, height : CInt): Ptr[cairo_pattern_t] = extern

@extern def cairo_pattern_create_rgb(red : Double, green : Double, blue : Double): Ptr[cairo_pattern_t] = extern

@extern def cairo_pattern_create_rgba(red : Double, green : Double, blue : Double, alpha : Double): Ptr[cairo_pattern_t] = extern

@extern def cairo_pattern_destroy(pattern : Ptr[cairo_pattern_t]): Unit = extern

@extern def cairo_pattern_get_color_stop_count(pattern : Ptr[cairo_pattern_t], count : Ptr[CInt]): cairo_status_t = extern

@extern def cairo_pattern_get_color_stop_rgba(pattern : Ptr[cairo_pattern_t], index : CInt, offset : Ptr[Double], red : Ptr[Double], green : Ptr[Double], blue : Ptr[Double], alpha : Ptr[Double]): cairo_status_t = extern

@extern def cairo_pattern_get_dither(pattern : Ptr[cairo_pattern_t]): cairo_dither_t = extern

@extern def cairo_pattern_get_extend(pattern : Ptr[cairo_pattern_t]): cairo_extend_t = extern

@extern def cairo_pattern_get_filter(pattern : Ptr[cairo_pattern_t]): cairo_filter_t = extern

@extern def cairo_pattern_get_linear_points(pattern : Ptr[cairo_pattern_t], x0 : Ptr[Double], y0 : Ptr[Double], x1 : Ptr[Double], y1 : Ptr[Double]): cairo_status_t = extern

@extern def cairo_pattern_get_matrix(pattern : Ptr[cairo_pattern_t], matrix : Ptr[cairo_matrix_t]): Unit = extern

@extern def cairo_pattern_get_radial_circles(pattern : Ptr[cairo_pattern_t], x0 : Ptr[Double], y0 : Ptr[Double], r0 : Ptr[Double], x1 : Ptr[Double], y1 : Ptr[Double], r1 : Ptr[Double]): cairo_status_t = extern

@extern def cairo_pattern_get_reference_count(pattern : Ptr[cairo_pattern_t]): CUnsignedInt = extern

@extern def cairo_pattern_get_rgba(pattern : Ptr[cairo_pattern_t], red : Ptr[Double], green : Ptr[Double], blue : Ptr[Double], alpha : Ptr[Double]): cairo_status_t = extern

@extern def cairo_pattern_get_surface(pattern : Ptr[cairo_pattern_t], surface : Ptr[Ptr[cairo_surface_t]]): cairo_status_t = extern

@extern def cairo_pattern_get_type(pattern : Ptr[cairo_pattern_t]): cairo_pattern_type_t = extern

@extern def cairo_pattern_get_user_data(pattern : Ptr[cairo_pattern_t], key : Ptr[cairo_user_data_key_t]): Ptr[Byte] = extern

@extern def cairo_pattern_reference(pattern : Ptr[cairo_pattern_t]): Ptr[cairo_pattern_t] = extern

@extern def cairo_pattern_set_dither(pattern : Ptr[cairo_pattern_t], dither : cairo_dither_t): Unit = extern

@extern def cairo_pattern_set_extend(pattern : Ptr[cairo_pattern_t], extend : cairo_extend_t): Unit = extern

@extern def cairo_pattern_set_filter(pattern : Ptr[cairo_pattern_t], filter : cairo_filter_t): Unit = extern

@extern def cairo_pattern_set_matrix(pattern : Ptr[cairo_pattern_t], matrix : Ptr[cairo_matrix_t]): Unit = extern

@extern def cairo_pattern_set_user_data(pattern : Ptr[cairo_pattern_t], key : Ptr[cairo_user_data_key_t], user_data : Ptr[Byte], destroy : cairo_destroy_func_t): cairo_status_t = extern

@extern def cairo_pattern_status(pattern : Ptr[cairo_pattern_t]): cairo_status_t = extern

@extern def cairo_pop_group(cr : Ptr[cairo_t]): Ptr[cairo_pattern_t] = extern

@extern def cairo_pop_group_to_source(cr : Ptr[cairo_t]): Unit = extern

@extern def cairo_push_group(cr : Ptr[cairo_t]): Unit = extern

@extern def cairo_push_group_with_content(cr : Ptr[cairo_t], content : cairo_content_t): Unit = extern

@extern def cairo_raster_source_pattern_get_acquire(pattern : Ptr[cairo_pattern_t], acquire : Ptr[cairo_raster_source_acquire_func_t], release : Ptr[cairo_raster_source_release_func_t]): Unit = extern

@extern def cairo_raster_source_pattern_get_callback_data(pattern : Ptr[cairo_pattern_t]): Ptr[Byte] = extern

@extern def cairo_raster_source_pattern_get_copy(pattern : Ptr[cairo_pattern_t]): cairo_raster_source_copy_func_t = extern

@extern def cairo_raster_source_pattern_get_finish(pattern : Ptr[cairo_pattern_t]): cairo_raster_source_finish_func_t = extern

@extern def cairo_raster_source_pattern_get_snapshot(pattern : Ptr[cairo_pattern_t]): cairo_raster_source_snapshot_func_t = extern

@extern def cairo_raster_source_pattern_set_acquire(pattern : Ptr[cairo_pattern_t], acquire : cairo_raster_source_acquire_func_t, release : cairo_raster_source_release_func_t): Unit = extern

@extern def cairo_raster_source_pattern_set_callback_data(pattern : Ptr[cairo_pattern_t], data : Ptr[Byte]): Unit = extern

@extern def cairo_raster_source_pattern_set_copy(pattern : Ptr[cairo_pattern_t], copy : cairo_raster_source_copy_func_t): Unit = extern

@extern def cairo_raster_source_pattern_set_finish(pattern : Ptr[cairo_pattern_t], finish : cairo_raster_source_finish_func_t): Unit = extern

@extern def cairo_raster_source_pattern_set_snapshot(pattern : Ptr[cairo_pattern_t], snapshot : cairo_raster_source_snapshot_func_t): Unit = extern

@extern def cairo_recording_surface_create(content : cairo_content_t, extents : Ptr[cairo_rectangle_t]): Ptr[cairo_surface_t] = extern

@extern def cairo_recording_surface_get_extents(surface : Ptr[cairo_surface_t], extents : Ptr[cairo_rectangle_t]): cairo_bool_t = extern

@extern def cairo_recording_surface_ink_extents(surface : Ptr[cairo_surface_t], x0 : Ptr[Double], y0 : Ptr[Double], width : Ptr[Double], height : Ptr[Double]): Unit = extern

@extern def cairo_rectangle(cr : Ptr[cairo_t], x : Double, y : Double, width : Double, height : Double): Unit = extern

@extern def cairo_rectangle_list_destroy(rectangle_list : Ptr[cairo_rectangle_list_t]): Unit = extern

@extern def cairo_reference(cr : Ptr[cairo_t]): Ptr[cairo_t] = extern

@extern def cairo_region_contains_point(region : Ptr[cairo_region_t], x : CInt, y : CInt): cairo_bool_t = extern

@extern def cairo_region_contains_rectangle(region : Ptr[cairo_region_t], rectangle : Ptr[cairo_rectangle_int_t]): cairo_region_overlap_t = extern

@extern def cairo_region_copy(original : Ptr[cairo_region_t]): Ptr[cairo_region_t] = extern

@extern def cairo_region_create(): Ptr[cairo_region_t] = extern

@extern def cairo_region_create_rectangle(rectangle : Ptr[cairo_rectangle_int_t]): Ptr[cairo_region_t] = extern

@extern def cairo_region_create_rectangles(rects : Ptr[cairo_rectangle_int_t], count : CInt): Ptr[cairo_region_t] = extern

@extern def cairo_region_destroy(region : Ptr[cairo_region_t]): Unit = extern

@extern def cairo_region_equal(a : Ptr[cairo_region_t], b : Ptr[cairo_region_t]): cairo_bool_t = extern

@extern def cairo_region_get_extents(region : Ptr[cairo_region_t], extents : Ptr[cairo_rectangle_int_t]): Unit = extern

@extern def cairo_region_get_rectangle(region : Ptr[cairo_region_t], nth : CInt, rectangle : Ptr[cairo_rectangle_int_t]): Unit = extern

@extern def cairo_region_intersect(dst : Ptr[cairo_region_t], other : Ptr[cairo_region_t]): cairo_status_t = extern

@extern def cairo_region_intersect_rectangle(dst : Ptr[cairo_region_t], rectangle : Ptr[cairo_rectangle_int_t]): cairo_status_t = extern

@extern def cairo_region_is_empty(region : Ptr[cairo_region_t]): cairo_bool_t = extern

@extern def cairo_region_num_rectangles(region : Ptr[cairo_region_t]): CInt = extern

@extern def cairo_region_reference(region : Ptr[cairo_region_t]): Ptr[cairo_region_t] = extern

@extern def cairo_region_status(region : Ptr[cairo_region_t]): cairo_status_t = extern

@extern def cairo_region_subtract(dst : Ptr[cairo_region_t], other : Ptr[cairo_region_t]): cairo_status_t = extern

@extern def cairo_region_subtract_rectangle(dst : Ptr[cairo_region_t], rectangle : Ptr[cairo_rectangle_int_t]): cairo_status_t = extern

@extern def cairo_region_translate(region : Ptr[cairo_region_t], dx : CInt, dy : CInt): Unit = extern

@extern def cairo_region_union(dst : Ptr[cairo_region_t], other : Ptr[cairo_region_t]): cairo_status_t = extern

@extern def cairo_region_union_rectangle(dst : Ptr[cairo_region_t], rectangle : Ptr[cairo_rectangle_int_t]): cairo_status_t = extern

@extern def cairo_region_xor(dst : Ptr[cairo_region_t], other : Ptr[cairo_region_t]): cairo_status_t = extern

@extern def cairo_region_xor_rectangle(dst : Ptr[cairo_region_t], rectangle : Ptr[cairo_rectangle_int_t]): cairo_status_t = extern

@extern def cairo_rel_curve_to(cr : Ptr[cairo_t], dx1 : Double, dy1 : Double, dx2 : Double, dy2 : Double, dx3 : Double, dy3 : Double): Unit = extern

@extern def cairo_rel_line_to(cr : Ptr[cairo_t], dx : Double, dy : Double): Unit = extern

@extern def cairo_rel_move_to(cr : Ptr[cairo_t], dx : Double, dy : Double): Unit = extern

@extern def cairo_reset_clip(cr : Ptr[cairo_t]): Unit = extern

@extern def cairo_restore(cr : Ptr[cairo_t]): Unit = extern

@extern def cairo_rotate(cr : Ptr[cairo_t], angle : Double): Unit = extern

@extern def cairo_save(cr : Ptr[cairo_t]): Unit = extern

@extern def cairo_scale(cr : Ptr[cairo_t], sx : Double, sy : Double): Unit = extern

@extern def cairo_scaled_font_create(font_face : Ptr[cairo_font_face_t], font_matrix : Ptr[cairo_matrix_t], ctm : Ptr[cairo_matrix_t], options : Ptr[cairo_font_options_t]): Ptr[cairo_scaled_font_t] = extern

@extern def cairo_scaled_font_destroy(scaled_font : Ptr[cairo_scaled_font_t]): Unit = extern

@extern def cairo_scaled_font_extents(scaled_font : Ptr[cairo_scaled_font_t], extents : Ptr[cairo_font_extents_t]): Unit = extern

@extern def cairo_scaled_font_get_ctm(scaled_font : Ptr[cairo_scaled_font_t], ctm : Ptr[cairo_matrix_t]): Unit = extern

@extern def cairo_scaled_font_get_font_face(scaled_font : Ptr[cairo_scaled_font_t]): Ptr[cairo_font_face_t] = extern

@extern def cairo_scaled_font_get_font_matrix(scaled_font : Ptr[cairo_scaled_font_t], font_matrix : Ptr[cairo_matrix_t]): Unit = extern

@extern def cairo_scaled_font_get_font_options(scaled_font : Ptr[cairo_scaled_font_t], options : Ptr[cairo_font_options_t]): Unit = extern

@extern def cairo_scaled_font_get_reference_count(scaled_font : Ptr[cairo_scaled_font_t]): CUnsignedInt = extern

@extern def cairo_scaled_font_get_scale_matrix(scaled_font : Ptr[cairo_scaled_font_t], scale_matrix : Ptr[cairo_matrix_t]): Unit = extern

@extern def cairo_scaled_font_get_type(scaled_font : Ptr[cairo_scaled_font_t]): cairo_font_type_t = extern

@extern def cairo_scaled_font_get_user_data(scaled_font : Ptr[cairo_scaled_font_t], key : Ptr[cairo_user_data_key_t]): Ptr[Byte] = extern

@extern def cairo_scaled_font_glyph_extents(scaled_font : Ptr[cairo_scaled_font_t], glyphs : Ptr[cairo_glyph_t], num_glyphs : CInt, extents : Ptr[cairo_text_extents_t]): Unit = extern

@extern def cairo_scaled_font_reference(scaled_font : Ptr[cairo_scaled_font_t]): Ptr[cairo_scaled_font_t] = extern

@extern def cairo_scaled_font_set_user_data(scaled_font : Ptr[cairo_scaled_font_t], key : Ptr[cairo_user_data_key_t], user_data : Ptr[Byte], destroy : cairo_destroy_func_t): cairo_status_t = extern

@extern def cairo_scaled_font_status(scaled_font : Ptr[cairo_scaled_font_t]): cairo_status_t = extern

@extern def cairo_scaled_font_text_extents(scaled_font : Ptr[cairo_scaled_font_t], utf8 : CString, extents : Ptr[cairo_text_extents_t]): Unit = extern

@extern def cairo_scaled_font_text_to_glyphs(scaled_font : Ptr[cairo_scaled_font_t], x : Double, y : Double, utf8 : CString, utf8_len : CInt, glyphs : Ptr[Ptr[cairo_glyph_t]], num_glyphs : Ptr[CInt], clusters : Ptr[Ptr[cairo_text_cluster_t]], num_clusters : Ptr[CInt], cluster_flags : Ptr[cairo_text_cluster_flags_t]): cairo_status_t = extern

@extern def cairo_select_font_face(cr : Ptr[cairo_t], family : CString, slant : cairo_font_slant_t, weight : cairo_font_weight_t): Unit = extern

@extern def cairo_set_antialias(cr : Ptr[cairo_t], antialias : cairo_antialias_t): Unit = extern

@extern def cairo_set_dash(cr : Ptr[cairo_t], dashes : Ptr[Double], num_dashes : CInt, offset : Double): Unit = extern

@extern def cairo_set_fill_rule(cr : Ptr[cairo_t], fill_rule : cairo_fill_rule_t): Unit = extern

@extern def cairo_set_font_face(cr : Ptr[cairo_t], font_face : Ptr[cairo_font_face_t]): Unit = extern

@extern def cairo_set_font_matrix(cr : Ptr[cairo_t], matrix : Ptr[cairo_matrix_t]): Unit = extern

@extern def cairo_set_font_options(cr : Ptr[cairo_t], options : Ptr[cairo_font_options_t]): Unit = extern

@extern def cairo_set_font_size(cr : Ptr[cairo_t], size : Double): Unit = extern

@extern def cairo_set_hairline(cr : Ptr[cairo_t], set_hairline : cairo_bool_t): Unit = extern

@extern def cairo_set_line_cap(cr : Ptr[cairo_t], line_cap : cairo_line_cap_t): Unit = extern

@extern def cairo_set_line_join(cr : Ptr[cairo_t], line_join : cairo_line_join_t): Unit = extern

@extern def cairo_set_line_width(cr : Ptr[cairo_t], width : Double): Unit = extern

@extern def cairo_set_matrix(cr : Ptr[cairo_t], matrix : Ptr[cairo_matrix_t]): Unit = extern

@extern def cairo_set_miter_limit(cr : Ptr[cairo_t], limit : Double): Unit = extern

@extern def cairo_set_operator(cr : Ptr[cairo_t], op : cairo_operator_t): Unit = extern

@extern def cairo_set_scaled_font(cr : Ptr[cairo_t], scaled_font : Ptr[cairo_scaled_font_t]): Unit = extern

@extern def cairo_set_source(cr : Ptr[cairo_t], source : Ptr[cairo_pattern_t]): Unit = extern

@extern def cairo_set_source_rgb(cr : Ptr[cairo_t], red : Double, green : Double, blue : Double): Unit = extern

@extern def cairo_set_source_rgba(cr : Ptr[cairo_t], red : Double, green : Double, blue : Double, alpha : Double): Unit = extern

@extern def cairo_set_source_surface(cr : Ptr[cairo_t], surface : Ptr[cairo_surface_t], x : Double, y : Double): Unit = extern

@extern def cairo_set_tolerance(cr : Ptr[cairo_t], tolerance : Double): Unit = extern

@extern def cairo_set_user_data(cr : Ptr[cairo_t], key : Ptr[cairo_user_data_key_t], user_data : Ptr[Byte], destroy : cairo_destroy_func_t): cairo_status_t = extern

@extern def cairo_show_glyphs(cr : Ptr[cairo_t], glyphs : Ptr[cairo_glyph_t], num_glyphs : CInt): Unit = extern

@extern def cairo_show_page(cr : Ptr[cairo_t]): Unit = extern

@extern def cairo_show_text(cr : Ptr[cairo_t], utf8 : CString): Unit = extern

@extern def cairo_show_text_glyphs(cr : Ptr[cairo_t], utf8 : CString, utf8_len : CInt, glyphs : Ptr[cairo_glyph_t], num_glyphs : CInt, clusters : Ptr[cairo_text_cluster_t], num_clusters : CInt, cluster_flags : cairo_text_cluster_flags_t): Unit = extern

@extern def cairo_status(cr : Ptr[cairo_t]): cairo_status_t = extern

@extern def cairo_status_to_string(status : cairo_status_t): CString = extern

@extern def cairo_stroke(cr : Ptr[cairo_t]): Unit = extern

@extern def cairo_stroke_extents(cr : Ptr[cairo_t], x1 : Ptr[Double], y1 : Ptr[Double], x2 : Ptr[Double], y2 : Ptr[Double]): Unit = extern

@extern def cairo_stroke_preserve(cr : Ptr[cairo_t]): Unit = extern

@extern def cairo_surface_copy_page(surface : Ptr[cairo_surface_t]): Unit = extern

@extern def cairo_surface_create_for_rectangle(target : Ptr[cairo_surface_t], x : Double, y : Double, width : Double, height : Double): Ptr[cairo_surface_t] = extern

@extern def cairo_surface_create_observer(target : Ptr[cairo_surface_t], mode : cairo_surface_observer_mode_t): Ptr[cairo_surface_t] = extern

@extern def cairo_surface_create_similar(other : Ptr[cairo_surface_t], content : cairo_content_t, width : CInt, height : CInt): Ptr[cairo_surface_t] = extern

@extern def cairo_surface_create_similar_image(other : Ptr[cairo_surface_t], format : cairo_format_t, width : CInt, height : CInt): Ptr[cairo_surface_t] = extern

@extern def cairo_surface_destroy(surface : Ptr[cairo_surface_t]): Unit = extern

@extern def cairo_surface_finish(surface : Ptr[cairo_surface_t]): Unit = extern

@extern def cairo_surface_flush(surface : Ptr[cairo_surface_t]): Unit = extern

@extern def cairo_surface_get_content(surface : Ptr[cairo_surface_t]): cairo_content_t = extern

@extern def cairo_surface_get_device(surface : Ptr[cairo_surface_t]): Ptr[cairo_device_t] = extern

@extern def cairo_surface_get_device_offset(surface : Ptr[cairo_surface_t], x_offset : Ptr[Double], y_offset : Ptr[Double]): Unit = extern

@extern def cairo_surface_get_device_scale(surface : Ptr[cairo_surface_t], x_scale : Ptr[Double], y_scale : Ptr[Double]): Unit = extern

@extern def cairo_surface_get_fallback_resolution(surface : Ptr[cairo_surface_t], x_pixels_per_inch : Ptr[Double], y_pixels_per_inch : Ptr[Double]): Unit = extern

@extern def cairo_surface_get_font_options(surface : Ptr[cairo_surface_t], options : Ptr[cairo_font_options_t]): Unit = extern

@extern def cairo_surface_get_mime_data(surface : Ptr[cairo_surface_t], mime_type : CString, data : Ptr[Ptr[CUnsignedChar]], length : Ptr[CUnsignedLongInt]): Unit = extern

@extern def cairo_surface_get_reference_count(surface : Ptr[cairo_surface_t]): CUnsignedInt = extern

@extern def cairo_surface_get_type(surface : Ptr[cairo_surface_t]): cairo_surface_type_t = extern

@extern def cairo_surface_get_user_data(surface : Ptr[cairo_surface_t], key : Ptr[cairo_user_data_key_t]): Ptr[Byte] = extern

@extern def cairo_surface_has_show_text_glyphs(surface : Ptr[cairo_surface_t]): cairo_bool_t = extern

@extern def cairo_surface_map_to_image(surface : Ptr[cairo_surface_t], extents : Ptr[cairo_rectangle_int_t]): Ptr[cairo_surface_t] = extern

@extern def cairo_surface_mark_dirty(surface : Ptr[cairo_surface_t]): Unit = extern

@extern def cairo_surface_mark_dirty_rectangle(surface : Ptr[cairo_surface_t], x : CInt, y : CInt, width : CInt, height : CInt): Unit = extern

@extern def cairo_surface_observer_add_fill_callback(abstract_surface : Ptr[cairo_surface_t], func : cairo_surface_observer_callback_t, data : Ptr[Byte]): cairo_status_t = extern

@extern def cairo_surface_observer_add_finish_callback(abstract_surface : Ptr[cairo_surface_t], func : cairo_surface_observer_callback_t, data : Ptr[Byte]): cairo_status_t = extern

@extern def cairo_surface_observer_add_flush_callback(abstract_surface : Ptr[cairo_surface_t], func : cairo_surface_observer_callback_t, data : Ptr[Byte]): cairo_status_t = extern

@extern def cairo_surface_observer_add_glyphs_callback(abstract_surface : Ptr[cairo_surface_t], func : cairo_surface_observer_callback_t, data : Ptr[Byte]): cairo_status_t = extern

@extern def cairo_surface_observer_add_mask_callback(abstract_surface : Ptr[cairo_surface_t], func : cairo_surface_observer_callback_t, data : Ptr[Byte]): cairo_status_t = extern

@extern def cairo_surface_observer_add_paint_callback(abstract_surface : Ptr[cairo_surface_t], func : cairo_surface_observer_callback_t, data : Ptr[Byte]): cairo_status_t = extern

@extern def cairo_surface_observer_add_stroke_callback(abstract_surface : Ptr[cairo_surface_t], func : cairo_surface_observer_callback_t, data : Ptr[Byte]): cairo_status_t = extern

@extern def cairo_surface_observer_elapsed(abstract_surface : Ptr[cairo_surface_t]): Double = extern

@extern def cairo_surface_observer_print(abstract_surface : Ptr[cairo_surface_t], write_func : cairo_write_func_t, closure : Ptr[Byte]): cairo_status_t = extern

@extern def cairo_surface_reference(surface : Ptr[cairo_surface_t]): Ptr[cairo_surface_t] = extern

@extern def cairo_surface_set_device_offset(surface : Ptr[cairo_surface_t], x_offset : Double, y_offset : Double): Unit = extern

@extern def cairo_surface_set_device_scale(surface : Ptr[cairo_surface_t], x_scale : Double, y_scale : Double): Unit = extern

@extern def cairo_surface_set_fallback_resolution(surface : Ptr[cairo_surface_t], x_pixels_per_inch : Double, y_pixels_per_inch : Double): Unit = extern

@extern def cairo_surface_set_mime_data(surface : Ptr[cairo_surface_t], mime_type : CString, data : Ptr[CUnsignedChar], length : CUnsignedLongInt, destroy : cairo_destroy_func_t, closure : Ptr[Byte]): cairo_status_t = extern

@extern def cairo_surface_set_user_data(surface : Ptr[cairo_surface_t], key : Ptr[cairo_user_data_key_t], user_data : Ptr[Byte], destroy : cairo_destroy_func_t): cairo_status_t = extern

@extern def cairo_surface_show_page(surface : Ptr[cairo_surface_t]): Unit = extern

@extern def cairo_surface_status(surface : Ptr[cairo_surface_t]): cairo_status_t = extern

@extern def cairo_surface_supports_mime_type(surface : Ptr[cairo_surface_t], mime_type : CString): cairo_bool_t = extern

@extern def cairo_surface_unmap_image(surface : Ptr[cairo_surface_t], image : Ptr[cairo_surface_t]): Unit = extern

@extern def cairo_surface_write_to_png(surface : Ptr[cairo_surface_t], filename : CString): cairo_status_t = extern

@extern def cairo_surface_write_to_png_stream(surface : Ptr[cairo_surface_t], write_func : cairo_write_func_t, closure : Ptr[Byte]): cairo_status_t = extern

@extern def cairo_tag_begin(cr : Ptr[cairo_t], tag_name : CString, attributes : CString): Unit = extern

@extern def cairo_tag_end(cr : Ptr[cairo_t], tag_name : CString): Unit = extern

@extern def cairo_text_cluster_allocate(num_clusters : CInt): Ptr[cairo_text_cluster_t] = extern

@extern def cairo_text_cluster_free(clusters : Ptr[cairo_text_cluster_t]): Unit = extern

@extern def cairo_text_extents(cr : Ptr[cairo_t], utf8 : CString, extents : Ptr[cairo_text_extents_t]): Unit = extern

@extern def cairo_text_path(cr : Ptr[cairo_t], utf8 : CString): Unit = extern

@extern def cairo_toy_font_face_create(family : CString, slant : cairo_font_slant_t, weight : cairo_font_weight_t): Ptr[cairo_font_face_t] = extern

@extern def cairo_toy_font_face_get_family(font_face : Ptr[cairo_font_face_t]): CString = extern

@extern def cairo_toy_font_face_get_slant(font_face : Ptr[cairo_font_face_t]): cairo_font_slant_t = extern

@extern def cairo_toy_font_face_get_weight(font_face : Ptr[cairo_font_face_t]): cairo_font_weight_t = extern

@extern def cairo_transform(cr : Ptr[cairo_t], matrix : Ptr[cairo_matrix_t]): Unit = extern

@extern def cairo_translate(cr : Ptr[cairo_t], tx : Double, ty : Double): Unit = extern

@extern def cairo_user_font_face_create(): Ptr[cairo_font_face_t] = extern

@extern def cairo_user_font_face_get_init_func(font_face : Ptr[cairo_font_face_t]): cairo_user_scaled_font_init_func_t = extern

@extern def cairo_user_font_face_get_render_color_glyph_func(font_face : Ptr[cairo_font_face_t]): cairo_user_scaled_font_render_glyph_func_t = extern

@extern def cairo_user_font_face_get_render_glyph_func(font_face : Ptr[cairo_font_face_t]): cairo_user_scaled_font_render_glyph_func_t = extern

@extern def cairo_user_font_face_get_text_to_glyphs_func(font_face : Ptr[cairo_font_face_t]): cairo_user_scaled_font_text_to_glyphs_func_t = extern

@extern def cairo_user_font_face_get_unicode_to_glyph_func(font_face : Ptr[cairo_font_face_t]): cairo_user_scaled_font_unicode_to_glyph_func_t = extern

@extern def cairo_user_font_face_set_init_func(font_face : Ptr[cairo_font_face_t], init_func : cairo_user_scaled_font_init_func_t): Unit = extern

@extern def cairo_user_font_face_set_render_color_glyph_func(font_face : Ptr[cairo_font_face_t], render_glyph_func : cairo_user_scaled_font_render_glyph_func_t): Unit = extern

@extern def cairo_user_font_face_set_render_glyph_func(font_face : Ptr[cairo_font_face_t], render_glyph_func : cairo_user_scaled_font_render_glyph_func_t): Unit = extern

@extern def cairo_user_font_face_set_text_to_glyphs_func(font_face : Ptr[cairo_font_face_t], text_to_glyphs_func : cairo_user_scaled_font_text_to_glyphs_func_t): Unit = extern

@extern def cairo_user_font_face_set_unicode_to_glyph_func(font_face : Ptr[cairo_font_face_t], unicode_to_glyph_func : cairo_user_scaled_font_unicode_to_glyph_func_t): Unit = extern

@extern def cairo_user_scaled_font_get_foreground_marker(scaled_font : Ptr[cairo_scaled_font_t]): Ptr[cairo_pattern_t] = extern

@extern def cairo_user_scaled_font_get_foreground_source(scaled_font : Ptr[cairo_scaled_font_t]): Ptr[cairo_pattern_t] = extern

@extern def cairo_user_to_device(cr : Ptr[cairo_t], x : Ptr[Double], y : Ptr[Double]): Unit = extern

@extern def cairo_user_to_device_distance(cr : Ptr[cairo_t], dx : Ptr[Double], dy : Ptr[Double]): Unit = extern

@extern def cairo_version(): CInt = extern

@extern def cairo_version_string(): CString = extern