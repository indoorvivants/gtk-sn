package sn.gnome.graphene.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

@extern private[internal] def __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_add(a : Ptr[graphene_simd4f_t], b : Ptr[graphene_simd4f_t], __return : Ptr[graphene_simd4f_t]): Unit = extern

@extern private[internal] def __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_clamp(v : Ptr[graphene_simd4f_t], min : Ptr[graphene_simd4f_t], max : Ptr[graphene_simd4f_t], __return : Ptr[graphene_simd4f_t]): Unit = extern

@extern private[internal] def __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_clamp_scalar(v : Ptr[graphene_simd4f_t], min : Float, max : Float, __return : Ptr[graphene_simd4f_t]): Unit = extern

@extern private[internal] def __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_cmp_eq(a : Ptr[graphene_simd4f_t], b : Ptr[graphene_simd4f_t]): Boolean = extern

@extern private[internal] def __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_cmp_ge(a : Ptr[graphene_simd4f_t], b : Ptr[graphene_simd4f_t]): Boolean = extern

@extern private[internal] def __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_cmp_gt(a : Ptr[graphene_simd4f_t], b : Ptr[graphene_simd4f_t]): Boolean = extern

@extern private[internal] def __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_cmp_le(a : Ptr[graphene_simd4f_t], b : Ptr[graphene_simd4f_t]): Boolean = extern

@extern private[internal] def __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_cmp_lt(a : Ptr[graphene_simd4f_t], b : Ptr[graphene_simd4f_t]): Boolean = extern

@extern private[internal] def __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_cmp_neq(a : Ptr[graphene_simd4f_t], b : Ptr[graphene_simd4f_t]): Boolean = extern

@extern private[internal] def __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_cross3(a : Ptr[graphene_simd4f_t], b : Ptr[graphene_simd4f_t], __return : Ptr[graphene_simd4f_t]): Unit = extern

@extern private[internal] def __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_div(a : Ptr[graphene_simd4f_t], b : Ptr[graphene_simd4f_t], __return : Ptr[graphene_simd4f_t]): Unit = extern

@extern private[internal] def __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_dot2(a : Ptr[graphene_simd4f_t], b : Ptr[graphene_simd4f_t], __return : Ptr[graphene_simd4f_t]): Unit = extern

@extern private[internal] def __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_dot3(a : Ptr[graphene_simd4f_t], b : Ptr[graphene_simd4f_t], __return : Ptr[graphene_simd4f_t]): Unit = extern

@extern private[internal] def __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_dot3_scalar(a : Ptr[graphene_simd4f_t], b : Ptr[graphene_simd4f_t]): Float = extern

@extern private[internal] def __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_dot4(a : Ptr[graphene_simd4f_t], b : Ptr[graphene_simd4f_t], __return : Ptr[graphene_simd4f_t]): Unit = extern

@extern private[internal] def __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_dup_2f(s : Ptr[graphene_simd4f_t], v : Ptr[Float]): Unit = extern

@extern private[internal] def __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_dup_3f(s : Ptr[graphene_simd4f_t], v : Ptr[Float]): Unit = extern

@extern private[internal] def __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_dup_4f(s : Ptr[graphene_simd4f_t], v : Ptr[Float]): Unit = extern

@extern private[internal] def __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_flip_sign_0101(s : Ptr[graphene_simd4f_t], __return : Ptr[graphene_simd4f_t]): Unit = extern

@extern private[internal] def __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_flip_sign_1010(s : Ptr[graphene_simd4f_t], __return : Ptr[graphene_simd4f_t]): Unit = extern

@extern private[internal] def __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_get_w(s : Ptr[graphene_simd4f_t]): Float = extern

@extern private[internal] def __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_get_x(s : Ptr[graphene_simd4f_t]): Float = extern

@extern private[internal] def __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_get_y(s : Ptr[graphene_simd4f_t]): Float = extern

@extern private[internal] def __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_get_z(s : Ptr[graphene_simd4f_t]): Float = extern

@extern private[internal] def __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_init(x : Float, y : Float, z : Float, w : Float, __return : Ptr[graphene_simd4f_t]): Unit = extern

@extern private[internal] def __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_init_2f(v : Ptr[Float], __return : Ptr[graphene_simd4f_t]): Unit = extern

@extern private[internal] def __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_init_3f(v : Ptr[Float], __return : Ptr[graphene_simd4f_t]): Unit = extern

@extern private[internal] def __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_init_4f(v : Ptr[Float], __return : Ptr[graphene_simd4f_t]): Unit = extern

@extern private[internal] def __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_init_zero(__return : Ptr[graphene_simd4f_t]): Unit = extern

@extern private[internal] def __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_interpolate(a : Ptr[graphene_simd4f_t], b : Ptr[graphene_simd4f_t], f : Float, __return : Ptr[graphene_simd4f_t]): Unit = extern

@extern private[internal] def __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_is_zero2(v : Ptr[graphene_simd4f_t]): Boolean = extern

@extern private[internal] def __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_is_zero3(v : Ptr[graphene_simd4f_t]): Boolean = extern

@extern private[internal] def __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_is_zero4(v : Ptr[graphene_simd4f_t]): Boolean = extern

@extern private[internal] def __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_length2(v : Ptr[graphene_simd4f_t], __return : Ptr[graphene_simd4f_t]): Unit = extern

@extern private[internal] def __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_length3(v : Ptr[graphene_simd4f_t], __return : Ptr[graphene_simd4f_t]): Unit = extern

@extern private[internal] def __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_length4(v : Ptr[graphene_simd4f_t], __return : Ptr[graphene_simd4f_t]): Unit = extern

@extern private[internal] def __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_madd(m1 : Ptr[graphene_simd4f_t], m2 : Ptr[graphene_simd4f_t], a : Ptr[graphene_simd4f_t], __return : Ptr[graphene_simd4f_t]): Unit = extern

@extern private[internal] def __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_max(a : Ptr[graphene_simd4f_t], b : Ptr[graphene_simd4f_t], __return : Ptr[graphene_simd4f_t]): Unit = extern

@extern private[internal] def __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_max_val(v : Ptr[graphene_simd4f_t], __return : Ptr[graphene_simd4f_t]): Unit = extern

@extern private[internal] def __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_merge_high(a : Ptr[graphene_simd4f_t], b : Ptr[graphene_simd4f_t], __return : Ptr[graphene_simd4f_t]): Unit = extern

@extern private[internal] def __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_merge_low(a : Ptr[graphene_simd4f_t], b : Ptr[graphene_simd4f_t], __return : Ptr[graphene_simd4f_t]): Unit = extern

@extern private[internal] def __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_merge_w(s : Ptr[graphene_simd4f_t], v : Float, __return : Ptr[graphene_simd4f_t]): Unit = extern

@extern private[internal] def __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_min(a : Ptr[graphene_simd4f_t], b : Ptr[graphene_simd4f_t], __return : Ptr[graphene_simd4f_t]): Unit = extern

@extern private[internal] def __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_min_val(v : Ptr[graphene_simd4f_t], __return : Ptr[graphene_simd4f_t]): Unit = extern

@extern private[internal] def __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_mul(a : Ptr[graphene_simd4f_t], b : Ptr[graphene_simd4f_t], __return : Ptr[graphene_simd4f_t]): Unit = extern

@extern private[internal] def __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_neg(s : Ptr[graphene_simd4f_t], __return : Ptr[graphene_simd4f_t]): Unit = extern

@extern private[internal] def __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_normalize2(v : Ptr[graphene_simd4f_t], __return : Ptr[graphene_simd4f_t]): Unit = extern

@extern private[internal] def __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_normalize3(v : Ptr[graphene_simd4f_t], __return : Ptr[graphene_simd4f_t]): Unit = extern

@extern private[internal] def __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_normalize4(v : Ptr[graphene_simd4f_t], __return : Ptr[graphene_simd4f_t]): Unit = extern

@extern private[internal] def __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_reciprocal(s : Ptr[graphene_simd4f_t], __return : Ptr[graphene_simd4f_t]): Unit = extern

@extern private[internal] def __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_rsqrt(s : Ptr[graphene_simd4f_t], __return : Ptr[graphene_simd4f_t]): Unit = extern

@extern private[internal] def __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_shuffle_wxyz(s : Ptr[graphene_simd4f_t], __return : Ptr[graphene_simd4f_t]): Unit = extern

@extern private[internal] def __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_shuffle_yzwx(s : Ptr[graphene_simd4f_t], __return : Ptr[graphene_simd4f_t]): Unit = extern

@extern private[internal] def __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_shuffle_zwxy(s : Ptr[graphene_simd4f_t], __return : Ptr[graphene_simd4f_t]): Unit = extern

@extern private[internal] def __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_splat(v : Float, __return : Ptr[graphene_simd4f_t]): Unit = extern

@extern private[internal] def __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_splat_w(s : Ptr[graphene_simd4f_t], __return : Ptr[graphene_simd4f_t]): Unit = extern

@extern private[internal] def __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_splat_x(s : Ptr[graphene_simd4f_t], __return : Ptr[graphene_simd4f_t]): Unit = extern

@extern private[internal] def __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_splat_y(s : Ptr[graphene_simd4f_t], __return : Ptr[graphene_simd4f_t]): Unit = extern

@extern private[internal] def __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_splat_z(s : Ptr[graphene_simd4f_t], __return : Ptr[graphene_simd4f_t]): Unit = extern

@extern private[internal] def __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_sqrt(s : Ptr[graphene_simd4f_t], __return : Ptr[graphene_simd4f_t]): Unit = extern

@extern private[internal] def __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_sub(a : Ptr[graphene_simd4f_t], b : Ptr[graphene_simd4f_t], __return : Ptr[graphene_simd4f_t]): Unit = extern

@extern private[internal] def __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_sum(v : Ptr[graphene_simd4f_t], __return : Ptr[graphene_simd4f_t]): Unit = extern

@extern private[internal] def __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_sum_scalar(v : Ptr[graphene_simd4f_t]): Float = extern

@extern private[internal] def __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_zero_w(s : Ptr[graphene_simd4f_t], __return : Ptr[graphene_simd4f_t]): Unit = extern

@extern private[internal] def __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_zero_zw(s : Ptr[graphene_simd4f_t], __return : Ptr[graphene_simd4f_t]): Unit = extern

@extern private[internal] def __sn_wrap_sn_gnome_graphene_internal_graphene_simd4x4f_init(x : Ptr[graphene_simd4f_t], y : Ptr[graphene_simd4f_t], z : Ptr[graphene_simd4f_t], w : Ptr[graphene_simd4f_t], __return : Ptr[graphene_simd4x4f_t]): Unit = extern

@extern private[internal] def __sn_wrap_sn_gnome_graphene_internal_graphene_simd4x4f_init_look_at(m : Ptr[graphene_simd4x4f_t], eye : Ptr[graphene_simd4f_t], center : Ptr[graphene_simd4f_t], up : Ptr[graphene_simd4f_t]): Unit = extern

@extern private[internal] def __sn_wrap_sn_gnome_graphene_internal_graphene_simd4x4f_rotation(m : Ptr[graphene_simd4x4f_t], rad : Float, axis : Ptr[graphene_simd4f_t]): Unit = extern

@extern def graphene_box_alloc(): Ptr[graphene_box_t] = extern

@extern def graphene_box_contains_box(a : Ptr[graphene_box_t], b : Ptr[graphene_box_t]): Boolean = extern

@extern def graphene_box_contains_point(box : Ptr[graphene_box_t], point : Ptr[graphene_point3d_t]): Boolean = extern

@extern def graphene_box_empty(): Ptr[graphene_box_t] = extern

@extern def graphene_box_equal(a : Ptr[graphene_box_t], b : Ptr[graphene_box_t]): Boolean = extern

@extern def graphene_box_expand(box : Ptr[graphene_box_t], point : Ptr[graphene_point3d_t], res : Ptr[graphene_box_t]): Unit = extern

@extern def graphene_box_expand_scalar(box : Ptr[graphene_box_t], scalar : Float, res : Ptr[graphene_box_t]): Unit = extern

@extern def graphene_box_expand_vec3(box : Ptr[graphene_box_t], vec : Ptr[graphene_vec3_t], res : Ptr[graphene_box_t]): Unit = extern

@extern def graphene_box_free(box : Ptr[graphene_box_t]): Unit = extern

@extern def graphene_box_get_bounding_sphere(box : Ptr[graphene_box_t], sphere : Ptr[graphene_sphere_t]): Unit = extern

@extern def graphene_box_get_center(box : Ptr[graphene_box_t], center : Ptr[graphene_point3d_t]): Unit = extern

@extern def graphene_box_get_depth(box : Ptr[graphene_box_t]): Float = extern

@extern def graphene_box_get_height(box : Ptr[graphene_box_t]): Float = extern

@extern def graphene_box_get_max(box : Ptr[graphene_box_t], max : Ptr[graphene_point3d_t]): Unit = extern

@extern def graphene_box_get_min(box : Ptr[graphene_box_t], min : Ptr[graphene_point3d_t]): Unit = extern

@extern def graphene_box_get_size(box : Ptr[graphene_box_t], size : Ptr[graphene_vec3_t]): Unit = extern

@extern def graphene_box_get_vertices(box : Ptr[graphene_box_t], vertices : Ptr[graphene_vec3_t]): Unit = extern

@extern def graphene_box_get_width(box : Ptr[graphene_box_t]): Float = extern

@extern def graphene_box_infinite(): Ptr[graphene_box_t] = extern

@extern def graphene_box_init(box : Ptr[graphene_box_t], min : Ptr[graphene_point3d_t], max : Ptr[graphene_point3d_t]): Ptr[graphene_box_t] = extern

@extern def graphene_box_init_from_box(box : Ptr[graphene_box_t], src : Ptr[graphene_box_t]): Ptr[graphene_box_t] = extern

@extern def graphene_box_init_from_points(box : Ptr[graphene_box_t], n_points : CUnsignedInt, points : Ptr[graphene_point3d_t]): Ptr[graphene_box_t] = extern

@extern def graphene_box_init_from_vec3(box : Ptr[graphene_box_t], min : Ptr[graphene_vec3_t], max : Ptr[graphene_vec3_t]): Ptr[graphene_box_t] = extern

@extern def graphene_box_init_from_vectors(box : Ptr[graphene_box_t], n_vectors : CUnsignedInt, vectors : Ptr[graphene_vec3_t]): Ptr[graphene_box_t] = extern

@extern def graphene_box_intersection(a : Ptr[graphene_box_t], b : Ptr[graphene_box_t], res : Ptr[graphene_box_t]): Boolean = extern

@extern def graphene_box_minus_one(): Ptr[graphene_box_t] = extern

@extern def graphene_box_one(): Ptr[graphene_box_t] = extern

@extern def graphene_box_one_minus_one(): Ptr[graphene_box_t] = extern

@extern def graphene_box_union(a : Ptr[graphene_box_t], b : Ptr[graphene_box_t], res : Ptr[graphene_box_t]): Unit = extern

@extern def graphene_box_zero(): Ptr[graphene_box_t] = extern

@extern def graphene_euler_alloc(): Ptr[graphene_euler_t] = extern

@extern def graphene_euler_equal(a : Ptr[graphene_euler_t], b : Ptr[graphene_euler_t]): Boolean = extern

@extern def graphene_euler_free(e : Ptr[graphene_euler_t]): Unit = extern

@extern def graphene_euler_get_alpha(e : Ptr[graphene_euler_t]): Float = extern

@extern def graphene_euler_get_beta(e : Ptr[graphene_euler_t]): Float = extern

@extern def graphene_euler_get_gamma(e : Ptr[graphene_euler_t]): Float = extern

@extern def graphene_euler_get_order(e : Ptr[graphene_euler_t]): graphene_euler_order_t = extern

@extern def graphene_euler_get_x(e : Ptr[graphene_euler_t]): Float = extern

@extern def graphene_euler_get_y(e : Ptr[graphene_euler_t]): Float = extern

@extern def graphene_euler_get_z(e : Ptr[graphene_euler_t]): Float = extern

@extern def graphene_euler_init(e : Ptr[graphene_euler_t], x : Float, y : Float, z : Float): Ptr[graphene_euler_t] = extern

@extern def graphene_euler_init_from_euler(e : Ptr[graphene_euler_t], src : Ptr[graphene_euler_t]): Ptr[graphene_euler_t] = extern

@extern def graphene_euler_init_from_matrix(e : Ptr[graphene_euler_t], m : Ptr[graphene_matrix_t], order : graphene_euler_order_t): Ptr[graphene_euler_t] = extern

@extern def graphene_euler_init_from_quaternion(e : Ptr[graphene_euler_t], q : Ptr[graphene_quaternion_t], order : graphene_euler_order_t): Ptr[graphene_euler_t] = extern

@extern def graphene_euler_init_from_radians(e : Ptr[graphene_euler_t], x : Float, y : Float, z : Float, order : graphene_euler_order_t): Ptr[graphene_euler_t] = extern

@extern def graphene_euler_init_from_vec3(e : Ptr[graphene_euler_t], v : Ptr[graphene_vec3_t], order : graphene_euler_order_t): Ptr[graphene_euler_t] = extern

@extern def graphene_euler_init_with_order(e : Ptr[graphene_euler_t], x : Float, y : Float, z : Float, order : graphene_euler_order_t): Ptr[graphene_euler_t] = extern

@extern def graphene_euler_reorder(e : Ptr[graphene_euler_t], order : graphene_euler_order_t, res : Ptr[graphene_euler_t]): Unit = extern

@extern def graphene_euler_to_matrix(e : Ptr[graphene_euler_t], res : Ptr[graphene_matrix_t]): Unit = extern

@extern def graphene_euler_to_quaternion(e : Ptr[graphene_euler_t], res : Ptr[graphene_quaternion_t]): Unit = extern

@extern def graphene_euler_to_vec3(e : Ptr[graphene_euler_t], res : Ptr[graphene_vec3_t]): Unit = extern

@extern def graphene_frustum_alloc(): Ptr[graphene_frustum_t] = extern

@extern def graphene_frustum_contains_point(f : Ptr[graphene_frustum_t], point : Ptr[graphene_point3d_t]): Boolean = extern

@extern def graphene_frustum_equal(a : Ptr[graphene_frustum_t], b : Ptr[graphene_frustum_t]): Boolean = extern

@extern def graphene_frustum_free(f : Ptr[graphene_frustum_t]): Unit = extern

@extern def graphene_frustum_get_planes(f : Ptr[graphene_frustum_t], planes : Ptr[graphene_plane_t]): Unit = extern

@extern def graphene_frustum_init(f : Ptr[graphene_frustum_t], p0 : Ptr[graphene_plane_t], p1 : Ptr[graphene_plane_t], p2 : Ptr[graphene_plane_t], p3 : Ptr[graphene_plane_t], p4 : Ptr[graphene_plane_t], p5 : Ptr[graphene_plane_t]): Ptr[graphene_frustum_t] = extern

@extern def graphene_frustum_init_from_frustum(f : Ptr[graphene_frustum_t], src : Ptr[graphene_frustum_t]): Ptr[graphene_frustum_t] = extern

@extern def graphene_frustum_init_from_matrix(f : Ptr[graphene_frustum_t], matrix : Ptr[graphene_matrix_t]): Ptr[graphene_frustum_t] = extern

@extern def graphene_frustum_intersects_box(f : Ptr[graphene_frustum_t], box : Ptr[graphene_box_t]): Boolean = extern

@extern def graphene_frustum_intersects_sphere(f : Ptr[graphene_frustum_t], sphere : Ptr[graphene_sphere_t]): Boolean = extern

@extern def graphene_matrix_alloc(): Ptr[graphene_matrix_t] = extern

@extern def graphene_matrix_decompose(m : Ptr[graphene_matrix_t], translate : Ptr[graphene_vec3_t], scale : Ptr[graphene_vec3_t], rotate : Ptr[graphene_quaternion_t], shear : Ptr[graphene_vec3_t], perspective : Ptr[graphene_vec4_t]): Boolean = extern

@extern def graphene_matrix_determinant(m : Ptr[graphene_matrix_t]): Float = extern

@extern def graphene_matrix_equal(a : Ptr[graphene_matrix_t], b : Ptr[graphene_matrix_t]): Boolean = extern

@extern def graphene_matrix_equal_fast(a : Ptr[graphene_matrix_t], b : Ptr[graphene_matrix_t]): Boolean = extern

@extern def graphene_matrix_free(m : Ptr[graphene_matrix_t]): Unit = extern

@extern def graphene_matrix_get_row(m : Ptr[graphene_matrix_t], `index_` : CUnsignedInt, res : Ptr[graphene_vec4_t]): Unit = extern

@extern def graphene_matrix_get_value(m : Ptr[graphene_matrix_t], row : CUnsignedInt, col : CUnsignedInt): Float = extern

@extern def graphene_matrix_get_x_scale(m : Ptr[graphene_matrix_t]): Float = extern

@extern def graphene_matrix_get_x_translation(m : Ptr[graphene_matrix_t]): Float = extern

@extern def graphene_matrix_get_y_scale(m : Ptr[graphene_matrix_t]): Float = extern

@extern def graphene_matrix_get_y_translation(m : Ptr[graphene_matrix_t]): Float = extern

@extern def graphene_matrix_get_z_scale(m : Ptr[graphene_matrix_t]): Float = extern

@extern def graphene_matrix_get_z_translation(m : Ptr[graphene_matrix_t]): Float = extern

@extern def graphene_matrix_init_from_2d(m : Ptr[graphene_matrix_t], xx : Double, yx : Double, xy : Double, yy : Double, x_0 : Double, y_0 : Double): Ptr[graphene_matrix_t] = extern

@extern def graphene_matrix_init_from_float(m : Ptr[graphene_matrix_t], v : Ptr[Float]): Ptr[graphene_matrix_t] = extern

@extern def graphene_matrix_init_from_matrix(m : Ptr[graphene_matrix_t], src : Ptr[graphene_matrix_t]): Ptr[graphene_matrix_t] = extern

@extern def graphene_matrix_init_from_vec4(m : Ptr[graphene_matrix_t], v0 : Ptr[graphene_vec4_t], v1 : Ptr[graphene_vec4_t], v2 : Ptr[graphene_vec4_t], v3 : Ptr[graphene_vec4_t]): Ptr[graphene_matrix_t] = extern

@extern def graphene_matrix_init_frustum(m : Ptr[graphene_matrix_t], left : Float, right : Float, bottom : Float, top : Float, z_near : Float, z_far : Float): Ptr[graphene_matrix_t] = extern

@extern def graphene_matrix_init_identity(m : Ptr[graphene_matrix_t]): Ptr[graphene_matrix_t] = extern

@extern def graphene_matrix_init_look_at(m : Ptr[graphene_matrix_t], eye : Ptr[graphene_vec3_t], center : Ptr[graphene_vec3_t], up : Ptr[graphene_vec3_t]): Ptr[graphene_matrix_t] = extern

@extern def graphene_matrix_init_ortho(m : Ptr[graphene_matrix_t], left : Float, right : Float, top : Float, bottom : Float, z_near : Float, z_far : Float): Ptr[graphene_matrix_t] = extern

@extern def graphene_matrix_init_perspective(m : Ptr[graphene_matrix_t], fovy : Float, aspect : Float, z_near : Float, z_far : Float): Ptr[graphene_matrix_t] = extern

@extern def graphene_matrix_init_rotate(m : Ptr[graphene_matrix_t], angle : Float, axis : Ptr[graphene_vec3_t]): Ptr[graphene_matrix_t] = extern

@extern def graphene_matrix_init_scale(m : Ptr[graphene_matrix_t], x : Float, y : Float, z : Float): Ptr[graphene_matrix_t] = extern

@extern def graphene_matrix_init_skew(m : Ptr[graphene_matrix_t], x_skew : Float, y_skew : Float): Ptr[graphene_matrix_t] = extern

@extern def graphene_matrix_init_translate(m : Ptr[graphene_matrix_t], p : Ptr[graphene_point3d_t]): Ptr[graphene_matrix_t] = extern

@extern def graphene_matrix_interpolate(a : Ptr[graphene_matrix_t], b : Ptr[graphene_matrix_t], factor : Double, res : Ptr[graphene_matrix_t]): Unit = extern

@extern def graphene_matrix_inverse(m : Ptr[graphene_matrix_t], res : Ptr[graphene_matrix_t]): Boolean = extern

@extern def graphene_matrix_is_2d(m : Ptr[graphene_matrix_t]): Boolean = extern

@extern def graphene_matrix_is_backface_visible(m : Ptr[graphene_matrix_t]): Boolean = extern

@extern def graphene_matrix_is_identity(m : Ptr[graphene_matrix_t]): Boolean = extern

@extern def graphene_matrix_is_singular(m : Ptr[graphene_matrix_t]): Boolean = extern

@extern def graphene_matrix_multiply(a : Ptr[graphene_matrix_t], b : Ptr[graphene_matrix_t], res : Ptr[graphene_matrix_t]): Unit = extern

@extern def graphene_matrix_near(a : Ptr[graphene_matrix_t], b : Ptr[graphene_matrix_t], epsilon : Float): Boolean = extern

@extern def graphene_matrix_normalize(m : Ptr[graphene_matrix_t], res : Ptr[graphene_matrix_t]): Unit = extern

@extern def graphene_matrix_perspective(m : Ptr[graphene_matrix_t], depth : Float, res : Ptr[graphene_matrix_t]): Unit = extern

@extern def graphene_matrix_print(m : Ptr[graphene_matrix_t]): Unit = extern

@extern def graphene_matrix_project_point(m : Ptr[graphene_matrix_t], p : Ptr[graphene_point_t], res : Ptr[graphene_point_t]): Unit = extern

@extern def graphene_matrix_project_rect(m : Ptr[graphene_matrix_t], r : Ptr[graphene_rect_t], res : Ptr[graphene_quad_t]): Unit = extern

@extern def graphene_matrix_project_rect_bounds(m : Ptr[graphene_matrix_t], r : Ptr[graphene_rect_t], res : Ptr[graphene_rect_t]): Unit = extern

@extern def graphene_matrix_rotate(m : Ptr[graphene_matrix_t], angle : Float, axis : Ptr[graphene_vec3_t]): Unit = extern

@extern def graphene_matrix_rotate_euler(m : Ptr[graphene_matrix_t], e : Ptr[graphene_euler_t]): Unit = extern

@extern def graphene_matrix_rotate_quaternion(m : Ptr[graphene_matrix_t], q : Ptr[graphene_quaternion_t]): Unit = extern

@extern def graphene_matrix_rotate_x(m : Ptr[graphene_matrix_t], angle : Float): Unit = extern

@extern def graphene_matrix_rotate_y(m : Ptr[graphene_matrix_t], angle : Float): Unit = extern

@extern def graphene_matrix_rotate_z(m : Ptr[graphene_matrix_t], angle : Float): Unit = extern

@extern def graphene_matrix_scale(m : Ptr[graphene_matrix_t], factor_x : Float, factor_y : Float, factor_z : Float): Unit = extern

@extern def graphene_matrix_skew_xy(m : Ptr[graphene_matrix_t], factor : Float): Unit = extern

@extern def graphene_matrix_skew_xz(m : Ptr[graphene_matrix_t], factor : Float): Unit = extern

@extern def graphene_matrix_skew_yz(m : Ptr[graphene_matrix_t], factor : Float): Unit = extern

@extern def graphene_matrix_to_2d(m : Ptr[graphene_matrix_t], xx : Ptr[Double], yx : Ptr[Double], xy : Ptr[Double], yy : Ptr[Double], x_0 : Ptr[Double], y_0 : Ptr[Double]): Boolean = extern

@extern def graphene_matrix_to_float(m : Ptr[graphene_matrix_t], v : Ptr[Float]): Unit = extern

@extern def graphene_matrix_transform_bounds(m : Ptr[graphene_matrix_t], r : Ptr[graphene_rect_t], res : Ptr[graphene_rect_t]): Unit = extern

@extern def graphene_matrix_transform_box(m : Ptr[graphene_matrix_t], b : Ptr[graphene_box_t], res : Ptr[graphene_box_t]): Unit = extern

@extern def graphene_matrix_transform_point(m : Ptr[graphene_matrix_t], p : Ptr[graphene_point_t], res : Ptr[graphene_point_t]): Unit = extern

@extern def graphene_matrix_transform_point3d(m : Ptr[graphene_matrix_t], p : Ptr[graphene_point3d_t], res : Ptr[graphene_point3d_t]): Unit = extern

@extern def graphene_matrix_transform_ray(m : Ptr[graphene_matrix_t], r : Ptr[graphene_ray_t], res : Ptr[graphene_ray_t]): Unit = extern

@extern def graphene_matrix_transform_rect(m : Ptr[graphene_matrix_t], r : Ptr[graphene_rect_t], res : Ptr[graphene_quad_t]): Unit = extern

@extern def graphene_matrix_transform_sphere(m : Ptr[graphene_matrix_t], s : Ptr[graphene_sphere_t], res : Ptr[graphene_sphere_t]): Unit = extern

@extern def graphene_matrix_transform_vec3(m : Ptr[graphene_matrix_t], v : Ptr[graphene_vec3_t], res : Ptr[graphene_vec3_t]): Unit = extern

@extern def graphene_matrix_transform_vec4(m : Ptr[graphene_matrix_t], v : Ptr[graphene_vec4_t], res : Ptr[graphene_vec4_t]): Unit = extern

@extern def graphene_matrix_translate(m : Ptr[graphene_matrix_t], pos : Ptr[graphene_point3d_t]): Unit = extern

@extern def graphene_matrix_transpose(m : Ptr[graphene_matrix_t], res : Ptr[graphene_matrix_t]): Unit = extern

@extern def graphene_matrix_unproject_point3d(projection : Ptr[graphene_matrix_t], modelview : Ptr[graphene_matrix_t], point : Ptr[graphene_point3d_t], res : Ptr[graphene_point3d_t]): Unit = extern

@extern def graphene_matrix_untransform_bounds(m : Ptr[graphene_matrix_t], r : Ptr[graphene_rect_t], bounds : Ptr[graphene_rect_t], res : Ptr[graphene_rect_t]): Unit = extern

@extern def graphene_matrix_untransform_point(m : Ptr[graphene_matrix_t], p : Ptr[graphene_point_t], bounds : Ptr[graphene_rect_t], res : Ptr[graphene_point_t]): Boolean = extern

@extern def graphene_plane_alloc(): Ptr[graphene_plane_t] = extern

@extern def graphene_plane_distance(p : Ptr[graphene_plane_t], point : Ptr[graphene_point3d_t]): Float = extern

@extern def graphene_plane_equal(a : Ptr[graphene_plane_t], b : Ptr[graphene_plane_t]): Boolean = extern

@extern def graphene_plane_free(p : Ptr[graphene_plane_t]): Unit = extern

@extern def graphene_plane_get_constant(p : Ptr[graphene_plane_t]): Float = extern

@extern def graphene_plane_get_normal(p : Ptr[graphene_plane_t], normal : Ptr[graphene_vec3_t]): Unit = extern

@extern def graphene_plane_init(p : Ptr[graphene_plane_t], normal : Ptr[graphene_vec3_t], constant : Float): Ptr[graphene_plane_t] = extern

@extern def graphene_plane_init_from_plane(p : Ptr[graphene_plane_t], src : Ptr[graphene_plane_t]): Ptr[graphene_plane_t] = extern

@extern def graphene_plane_init_from_point(p : Ptr[graphene_plane_t], normal : Ptr[graphene_vec3_t], point : Ptr[graphene_point3d_t]): Ptr[graphene_plane_t] = extern

@extern def graphene_plane_init_from_points(p : Ptr[graphene_plane_t], a : Ptr[graphene_point3d_t], b : Ptr[graphene_point3d_t], c : Ptr[graphene_point3d_t]): Ptr[graphene_plane_t] = extern

@extern def graphene_plane_init_from_vec4(p : Ptr[graphene_plane_t], src : Ptr[graphene_vec4_t]): Ptr[graphene_plane_t] = extern

@extern def graphene_plane_negate(p : Ptr[graphene_plane_t], res : Ptr[graphene_plane_t]): Unit = extern

@extern def graphene_plane_normalize(p : Ptr[graphene_plane_t], res : Ptr[graphene_plane_t]): Unit = extern

@extern def graphene_plane_transform(p : Ptr[graphene_plane_t], matrix : Ptr[graphene_matrix_t], normal_matrix : Ptr[graphene_matrix_t], res : Ptr[graphene_plane_t]): Unit = extern

@extern def graphene_point3d_alloc(): Ptr[graphene_point3d_t] = extern

@extern def graphene_point3d_cross(a : Ptr[graphene_point3d_t], b : Ptr[graphene_point3d_t], res : Ptr[graphene_point3d_t]): Unit = extern

@extern def graphene_point3d_distance(a : Ptr[graphene_point3d_t], b : Ptr[graphene_point3d_t], delta : Ptr[graphene_vec3_t]): Float = extern

@extern def graphene_point3d_dot(a : Ptr[graphene_point3d_t], b : Ptr[graphene_point3d_t]): Float = extern

@extern def graphene_point3d_equal(a : Ptr[graphene_point3d_t], b : Ptr[graphene_point3d_t]): Boolean = extern

@extern def graphene_point3d_free(p : Ptr[graphene_point3d_t]): Unit = extern

@extern def graphene_point3d_init(p : Ptr[graphene_point3d_t], x : Float, y : Float, z : Float): Ptr[graphene_point3d_t] = extern

@extern def graphene_point3d_init_from_point(p : Ptr[graphene_point3d_t], src : Ptr[graphene_point3d_t]): Ptr[graphene_point3d_t] = extern

@extern def graphene_point3d_init_from_vec3(p : Ptr[graphene_point3d_t], v : Ptr[graphene_vec3_t]): Ptr[graphene_point3d_t] = extern

@extern def graphene_point3d_interpolate(a : Ptr[graphene_point3d_t], b : Ptr[graphene_point3d_t], factor : Double, res : Ptr[graphene_point3d_t]): Unit = extern

@extern def graphene_point3d_length(p : Ptr[graphene_point3d_t]): Float = extern

@extern def graphene_point3d_near(a : Ptr[graphene_point3d_t], b : Ptr[graphene_point3d_t], epsilon : Float): Boolean = extern

@extern def graphene_point3d_normalize(p : Ptr[graphene_point3d_t], res : Ptr[graphene_point3d_t]): Unit = extern

@extern def graphene_point3d_normalize_viewport(p : Ptr[graphene_point3d_t], viewport : Ptr[graphene_rect_t], z_near : Float, z_far : Float, res : Ptr[graphene_point3d_t]): Unit = extern

@extern def graphene_point3d_scale(p : Ptr[graphene_point3d_t], factor : Float, res : Ptr[graphene_point3d_t]): Unit = extern

@extern def graphene_point3d_to_vec3(p : Ptr[graphene_point3d_t], v : Ptr[graphene_vec3_t]): Unit = extern

@extern def graphene_point3d_zero(): Ptr[graphene_point3d_t] = extern

@extern def graphene_point_alloc(): Ptr[graphene_point_t] = extern

@extern def graphene_point_distance(a : Ptr[graphene_point_t], b : Ptr[graphene_point_t], d_x : Ptr[Float], d_y : Ptr[Float]): Float = extern

@extern def graphene_point_equal(a : Ptr[graphene_point_t], b : Ptr[graphene_point_t]): Boolean = extern

@extern def graphene_point_free(p : Ptr[graphene_point_t]): Unit = extern

@extern def graphene_point_init(p : Ptr[graphene_point_t], x : Float, y : Float): Ptr[graphene_point_t] = extern

@extern def graphene_point_init_from_point(p : Ptr[graphene_point_t], src : Ptr[graphene_point_t]): Ptr[graphene_point_t] = extern

@extern def graphene_point_init_from_vec2(p : Ptr[graphene_point_t], src : Ptr[graphene_vec2_t]): Ptr[graphene_point_t] = extern

@extern def graphene_point_interpolate(a : Ptr[graphene_point_t], b : Ptr[graphene_point_t], factor : Double, res : Ptr[graphene_point_t]): Unit = extern

@extern def graphene_point_near(a : Ptr[graphene_point_t], b : Ptr[graphene_point_t], epsilon : Float): Boolean = extern

@extern def graphene_point_to_vec2(p : Ptr[graphene_point_t], v : Ptr[graphene_vec2_t]): Unit = extern

@extern def graphene_point_zero(): Ptr[graphene_point_t] = extern

@extern def graphene_quad_alloc(): Ptr[graphene_quad_t] = extern

@extern def graphene_quad_bounds(q : Ptr[graphene_quad_t], r : Ptr[graphene_rect_t]): Unit = extern

@extern def graphene_quad_contains(q : Ptr[graphene_quad_t], p : Ptr[graphene_point_t]): Boolean = extern

@extern def graphene_quad_free(q : Ptr[graphene_quad_t]): Unit = extern

@extern def graphene_quad_get_point(q : Ptr[graphene_quad_t], `index_` : CUnsignedInt): Ptr[graphene_point_t] = extern

@extern def graphene_quad_init(q : Ptr[graphene_quad_t], p1 : Ptr[graphene_point_t], p2 : Ptr[graphene_point_t], p3 : Ptr[graphene_point_t], p4 : Ptr[graphene_point_t]): Ptr[graphene_quad_t] = extern

@extern def graphene_quad_init_from_points(q : Ptr[graphene_quad_t], points : Ptr[graphene_point_t]): Ptr[graphene_quad_t] = extern

@extern def graphene_quad_init_from_rect(q : Ptr[graphene_quad_t], r : Ptr[graphene_rect_t]): Ptr[graphene_quad_t] = extern

@extern def graphene_quaternion_add(a : Ptr[graphene_quaternion_t], b : Ptr[graphene_quaternion_t], res : Ptr[graphene_quaternion_t]): Unit = extern

@extern def graphene_quaternion_alloc(): Ptr[graphene_quaternion_t] = extern

@extern def graphene_quaternion_dot(a : Ptr[graphene_quaternion_t], b : Ptr[graphene_quaternion_t]): Float = extern

@extern def graphene_quaternion_equal(a : Ptr[graphene_quaternion_t], b : Ptr[graphene_quaternion_t]): Boolean = extern

@extern def graphene_quaternion_free(q : Ptr[graphene_quaternion_t]): Unit = extern

@extern def graphene_quaternion_init(q : Ptr[graphene_quaternion_t], x : Float, y : Float, z : Float, w : Float): Ptr[graphene_quaternion_t] = extern

@extern def graphene_quaternion_init_from_angle_vec3(q : Ptr[graphene_quaternion_t], angle : Float, axis : Ptr[graphene_vec3_t]): Ptr[graphene_quaternion_t] = extern

@extern def graphene_quaternion_init_from_angles(q : Ptr[graphene_quaternion_t], deg_x : Float, deg_y : Float, deg_z : Float): Ptr[graphene_quaternion_t] = extern

@extern def graphene_quaternion_init_from_euler(q : Ptr[graphene_quaternion_t], e : Ptr[graphene_euler_t]): Ptr[graphene_quaternion_t] = extern

@extern def graphene_quaternion_init_from_matrix(q : Ptr[graphene_quaternion_t], m : Ptr[graphene_matrix_t]): Ptr[graphene_quaternion_t] = extern

@extern def graphene_quaternion_init_from_quaternion(q : Ptr[graphene_quaternion_t], src : Ptr[graphene_quaternion_t]): Ptr[graphene_quaternion_t] = extern

@extern def graphene_quaternion_init_from_radians(q : Ptr[graphene_quaternion_t], rad_x : Float, rad_y : Float, rad_z : Float): Ptr[graphene_quaternion_t] = extern

@extern def graphene_quaternion_init_from_vec4(q : Ptr[graphene_quaternion_t], src : Ptr[graphene_vec4_t]): Ptr[graphene_quaternion_t] = extern

@extern def graphene_quaternion_init_identity(q : Ptr[graphene_quaternion_t]): Ptr[graphene_quaternion_t] = extern

@extern def graphene_quaternion_invert(q : Ptr[graphene_quaternion_t], res : Ptr[graphene_quaternion_t]): Unit = extern

@extern def graphene_quaternion_multiply(a : Ptr[graphene_quaternion_t], b : Ptr[graphene_quaternion_t], res : Ptr[graphene_quaternion_t]): Unit = extern

@extern def graphene_quaternion_normalize(q : Ptr[graphene_quaternion_t], res : Ptr[graphene_quaternion_t]): Unit = extern

@extern def graphene_quaternion_scale(q : Ptr[graphene_quaternion_t], factor : Float, res : Ptr[graphene_quaternion_t]): Unit = extern

@extern def graphene_quaternion_slerp(a : Ptr[graphene_quaternion_t], b : Ptr[graphene_quaternion_t], factor : Float, res : Ptr[graphene_quaternion_t]): Unit = extern

@extern def graphene_quaternion_to_angle_vec3(q : Ptr[graphene_quaternion_t], angle : Ptr[Float], axis : Ptr[graphene_vec3_t]): Unit = extern

@extern def graphene_quaternion_to_angles(q : Ptr[graphene_quaternion_t], deg_x : Ptr[Float], deg_y : Ptr[Float], deg_z : Ptr[Float]): Unit = extern

@extern def graphene_quaternion_to_matrix(q : Ptr[graphene_quaternion_t], m : Ptr[graphene_matrix_t]): Unit = extern

@extern def graphene_quaternion_to_radians(q : Ptr[graphene_quaternion_t], rad_x : Ptr[Float], rad_y : Ptr[Float], rad_z : Ptr[Float]): Unit = extern

@extern def graphene_quaternion_to_vec4(q : Ptr[graphene_quaternion_t], res : Ptr[graphene_vec4_t]): Unit = extern

@extern def graphene_ray_alloc(): Ptr[graphene_ray_t] = extern

@extern def graphene_ray_equal(a : Ptr[graphene_ray_t], b : Ptr[graphene_ray_t]): Boolean = extern

@extern def graphene_ray_free(r : Ptr[graphene_ray_t]): Unit = extern

@extern def graphene_ray_get_closest_point_to_point(r : Ptr[graphene_ray_t], p : Ptr[graphene_point3d_t], res : Ptr[graphene_point3d_t]): Unit = extern

@extern def graphene_ray_get_direction(r : Ptr[graphene_ray_t], direction : Ptr[graphene_vec3_t]): Unit = extern

@extern def graphene_ray_get_distance_to_plane(r : Ptr[graphene_ray_t], p : Ptr[graphene_plane_t]): Float = extern

@extern def graphene_ray_get_distance_to_point(r : Ptr[graphene_ray_t], p : Ptr[graphene_point3d_t]): Float = extern

@extern def graphene_ray_get_origin(r : Ptr[graphene_ray_t], origin : Ptr[graphene_point3d_t]): Unit = extern

@extern def graphene_ray_get_position_at(r : Ptr[graphene_ray_t], t : Float, position : Ptr[graphene_point3d_t]): Unit = extern

@extern def graphene_ray_init(r : Ptr[graphene_ray_t], origin : Ptr[graphene_point3d_t], direction : Ptr[graphene_vec3_t]): Ptr[graphene_ray_t] = extern

@extern def graphene_ray_init_from_ray(r : Ptr[graphene_ray_t], src : Ptr[graphene_ray_t]): Ptr[graphene_ray_t] = extern

@extern def graphene_ray_init_from_vec3(r : Ptr[graphene_ray_t], origin : Ptr[graphene_vec3_t], direction : Ptr[graphene_vec3_t]): Ptr[graphene_ray_t] = extern

@extern def graphene_ray_intersect_box(r : Ptr[graphene_ray_t], b : Ptr[graphene_box_t], t_out : Ptr[Float]): graphene_ray_intersection_kind_t = extern

@extern def graphene_ray_intersect_sphere(r : Ptr[graphene_ray_t], s : Ptr[graphene_sphere_t], t_out : Ptr[Float]): graphene_ray_intersection_kind_t = extern

@extern def graphene_ray_intersect_triangle(r : Ptr[graphene_ray_t], t : Ptr[graphene_triangle_t], t_out : Ptr[Float]): graphene_ray_intersection_kind_t = extern

@extern def graphene_ray_intersects_box(r : Ptr[graphene_ray_t], b : Ptr[graphene_box_t]): Boolean = extern

@extern def graphene_ray_intersects_sphere(r : Ptr[graphene_ray_t], s : Ptr[graphene_sphere_t]): Boolean = extern

@extern def graphene_ray_intersects_triangle(r : Ptr[graphene_ray_t], t : Ptr[graphene_triangle_t]): Boolean = extern

@extern def graphene_rect_alloc(): Ptr[graphene_rect_t] = extern

@extern def graphene_rect_contains_point(r : Ptr[graphene_rect_t], p : Ptr[graphene_point_t]): Boolean = extern

@extern def graphene_rect_contains_rect(a : Ptr[graphene_rect_t], b : Ptr[graphene_rect_t]): Boolean = extern

@extern def graphene_rect_equal(a : Ptr[graphene_rect_t], b : Ptr[graphene_rect_t]): Boolean = extern

@extern def graphene_rect_expand(r : Ptr[graphene_rect_t], p : Ptr[graphene_point_t], res : Ptr[graphene_rect_t]): Unit = extern

@extern def graphene_rect_free(r : Ptr[graphene_rect_t]): Unit = extern

@extern def graphene_rect_get_area(r : Ptr[graphene_rect_t]): Float = extern

@extern def graphene_rect_get_bottom_left(r : Ptr[graphene_rect_t], p : Ptr[graphene_point_t]): Unit = extern

@extern def graphene_rect_get_bottom_right(r : Ptr[graphene_rect_t], p : Ptr[graphene_point_t]): Unit = extern

@extern def graphene_rect_get_center(r : Ptr[graphene_rect_t], p : Ptr[graphene_point_t]): Unit = extern

@extern def graphene_rect_get_height(r : Ptr[graphene_rect_t]): Float = extern

@extern def graphene_rect_get_top_left(r : Ptr[graphene_rect_t], p : Ptr[graphene_point_t]): Unit = extern

@extern def graphene_rect_get_top_right(r : Ptr[graphene_rect_t], p : Ptr[graphene_point_t]): Unit = extern

@extern def graphene_rect_get_vertices(r : Ptr[graphene_rect_t], vertices : Ptr[graphene_vec2_t]): Unit = extern

@extern def graphene_rect_get_width(r : Ptr[graphene_rect_t]): Float = extern

@extern def graphene_rect_get_x(r : Ptr[graphene_rect_t]): Float = extern

@extern def graphene_rect_get_y(r : Ptr[graphene_rect_t]): Float = extern

@extern def graphene_rect_init(r : Ptr[graphene_rect_t], x : Float, y : Float, width : Float, height : Float): Ptr[graphene_rect_t] = extern

@extern def graphene_rect_init_from_rect(r : Ptr[graphene_rect_t], src : Ptr[graphene_rect_t]): Ptr[graphene_rect_t] = extern

@extern def graphene_rect_inset(r : Ptr[graphene_rect_t], d_x : Float, d_y : Float): Ptr[graphene_rect_t] = extern

@extern def graphene_rect_inset_r(r : Ptr[graphene_rect_t], d_x : Float, d_y : Float, res : Ptr[graphene_rect_t]): Unit = extern

@extern def graphene_rect_interpolate(a : Ptr[graphene_rect_t], b : Ptr[graphene_rect_t], factor : Double, res : Ptr[graphene_rect_t]): Unit = extern

@extern def graphene_rect_intersection(a : Ptr[graphene_rect_t], b : Ptr[graphene_rect_t], res : Ptr[graphene_rect_t]): Boolean = extern

@extern def graphene_rect_normalize(r : Ptr[graphene_rect_t]): Ptr[graphene_rect_t] = extern

@extern def graphene_rect_normalize_r(r : Ptr[graphene_rect_t], res : Ptr[graphene_rect_t]): Unit = extern

@extern def graphene_rect_offset(r : Ptr[graphene_rect_t], d_x : Float, d_y : Float): Ptr[graphene_rect_t] = extern

@extern def graphene_rect_offset_r(r : Ptr[graphene_rect_t], d_x : Float, d_y : Float, res : Ptr[graphene_rect_t]): Unit = extern

@extern def graphene_rect_round(r : Ptr[graphene_rect_t], res : Ptr[graphene_rect_t]): Unit = extern

@extern def graphene_rect_round_extents(r : Ptr[graphene_rect_t], res : Ptr[graphene_rect_t]): Unit = extern

@extern def graphene_rect_round_to_pixel(r : Ptr[graphene_rect_t]): Ptr[graphene_rect_t] = extern

@extern def graphene_rect_scale(r : Ptr[graphene_rect_t], s_h : Float, s_v : Float, res : Ptr[graphene_rect_t]): Unit = extern

@extern def graphene_rect_union(a : Ptr[graphene_rect_t], b : Ptr[graphene_rect_t], res : Ptr[graphene_rect_t]): Unit = extern

@extern def graphene_rect_zero(): Ptr[graphene_rect_t] = extern

/**
 * graphene_simd4x4f_add: : a #graphene_simd4x4f_t : a #graphene_simd4x4f_t : (out caller-allocates): return location for a #graphene_simd4x4f_t
*/
@extern def graphene_simd4x4f_add(a : Ptr[graphene_simd4x4f_t], b : Ptr[graphene_simd4x4f_t], res : Ptr[graphene_simd4x4f_t]): Unit = extern

/**
 * graphene_simd4x4f_determinant: : a #graphene_simd4x4f_t _r: (out): return location for the matrix determinant _r: (out): return location for the inverse of the matrix determinant
*/
@extern def graphene_simd4x4f_determinant(m : Ptr[graphene_simd4x4f_t], det_r : Ptr[graphene_simd4f_t], invdet_r : Ptr[graphene_simd4f_t]): Unit = extern

/**
 * graphene_simd4x4f_div: : a #graphene_simd4x4f_t : a #graphene_simd4x4f_t : (out caller-allocates): return location for a #graphene_simd4x4f_t
*/
@extern def graphene_simd4x4f_div(a : Ptr[graphene_simd4x4f_t], b : Ptr[graphene_simd4x4f_t], res : Ptr[graphene_simd4x4f_t]): Unit = extern

/**
 * graphene_simd4x4f_init_from_float: : a #graphene_simd4x4f_t : (array fixed-size=16): an array of 16 floating point values
*/
@extern def graphene_simd4x4f_init_from_float(m : Ptr[graphene_simd4x4f_t], f : Ptr[Float]): Unit = extern

/**
 * graphene_simd4x4f_init_frustum: : a #graphene_simd4x4f_t : distance of the left clipping plane : distance of the right clipping plane : distance of the bottom clipping plane : distance of the top clipping plane _near: distance of the near clipping plane _far: distance of the far clipping plane
*/
@extern def graphene_simd4x4f_init_frustum(m : Ptr[graphene_simd4x4f_t], left : Float, right : Float, bottom : Float, top : Float, z_near : Float, z_far : Float): Unit = extern

/**
 * graphene_simd4x4f_init_identity: : a #graphene_simd4x4f_t
*/
@extern def graphene_simd4x4f_init_identity(m : Ptr[graphene_simd4x4f_t]): Unit = extern

/**
 * graphene_simd4x4f_init_ortho: : a #graphene_simd4x4f_t : edge of the left clipping plane : edge of the right clipping plane : edge of the bottom clipping plane : edge of the top clipping plane _near: depth of the near clipping plane _far: depth of the far clipping plane
*/
@extern def graphene_simd4x4f_init_ortho(m : Ptr[graphene_simd4x4f_t], left : Float, right : Float, bottom : Float, top : Float, z_near : Float, z_far : Float): Unit = extern

/**
 * graphene_simd4x4f_init_perspective: : a #graphene_simd4x4f_t _rad: the angle of the field of vision, in radians : the aspect value _near: the depth of the near clipping plane _far: the depth of the far clipping plane
*/
@extern def graphene_simd4x4f_init_perspective(m : Ptr[graphene_simd4x4f_t], fovy_rad : Float, aspect : Float, z_near : Float, z_far : Float): Unit = extern

/**
 * graphene_simd4x4f_inv_ortho_point3_mul: : a #graphene_simd4x4f_t : a #graphene_simd4x4f_t : (out): return location for the result vector
*/
@extern def graphene_simd4x4f_inv_ortho_point3_mul(a : Ptr[graphene_simd4x4f_t], b : Ptr[graphene_simd4f_t], res : Ptr[graphene_simd4f_t]): Unit = extern

/**
 * graphene_simd4x4f_inv_ortho_vec3_mul: : a #graphene_simd4x4f_t : a #graphene_simd4f_t : (out): return location for the transformed vector
*/
@extern def graphene_simd4x4f_inv_ortho_vec3_mul(a : Ptr[graphene_simd4x4f_t], b : Ptr[graphene_simd4f_t], res : Ptr[graphene_simd4f_t]): Unit = extern

/**
 * graphene_simd4x4f_inverse: : a #graphene_simd4x4f_t : (out): return location for the inverse matrix
*/
@extern def graphene_simd4x4f_inverse(m : Ptr[graphene_simd4x4f_t], res : Ptr[graphene_simd4x4f_t]): Boolean = extern

/**
 * graphene_simd4x4f_is_2d: : a #graphene_simd4x4f_t
*/
@extern def graphene_simd4x4f_is_2d(m : Ptr[graphene_simd4x4f_t]): Boolean = extern

/**
 * graphene_simd4x4f_is_identity: : a #graphene_simd4x4f_t
*/
@extern def graphene_simd4x4f_is_identity(m : Ptr[graphene_simd4x4f_t]): Boolean = extern

/**
 * graphene_simd4x4f_matrix_mul: : a #graphene_simd4x4f_t : a #graphene_simd4x4f_t : (out): return location for the result
*/
@extern def graphene_simd4x4f_matrix_mul(a : Ptr[graphene_simd4x4f_t], b : Ptr[graphene_simd4x4f_t], res : Ptr[graphene_simd4x4f_t]): Unit = extern

/**
 * graphene_simd4x4f_mul: : a #graphene_simd4x4f_t : a #graphene_simd4x4f_t : (out caller-allocates): return location for a #graphene_simd4x4f_t
*/
@extern def graphene_simd4x4f_mul(a : Ptr[graphene_simd4x4f_t], b : Ptr[graphene_simd4x4f_t], res : Ptr[graphene_simd4x4f_t]): Unit = extern

/**
 * graphene_simd4x4f_perspective: : a #graphene_simd4x4f_t : depth of the perspective
*/
@extern def graphene_simd4x4f_perspective(m : Ptr[graphene_simd4x4f_t], depth : Float): Unit = extern

/**
 * graphene_simd4x4f_point3_mul: : a #graphene_simd4x4f_t : a #graphene_simd4f_t : (out): return location for a #graphene_simd4f_t
*/
@extern def graphene_simd4x4f_point3_mul(m : Ptr[graphene_simd4x4f_t], p : Ptr[graphene_simd4f_t], res : Ptr[graphene_simd4f_t]): Unit = extern

/**
 * graphene_simd4x4f_scale: : a #graphene_simd4x4f_t : scaling factor on the X axis : scaling factor on the Y axis : scaling factor on the Z axis
*/
@extern def graphene_simd4x4f_scale(m : Ptr[graphene_simd4x4f_t], x : Float, y : Float, z : Float): Unit = extern

/**
 * graphene_simd4x4f_sub: : a #graphene_simd4x4f_t : a #graphene_simd4x4f_t : (out caller-allocates): return location for a #graphene_simd4x4f_t
*/
@extern def graphene_simd4x4f_sub(a : Ptr[graphene_simd4x4f_t], b : Ptr[graphene_simd4x4f_t], res : Ptr[graphene_simd4x4f_t]): Unit = extern

/**
 * graphene_simd4x4f_sum: : a #graphene_simd4f_t : (out): return location for the sum vector
*/
@extern def graphene_simd4x4f_sum(a : Ptr[graphene_simd4x4f_t], res : Ptr[graphene_simd4f_t]): Unit = extern

/**
 * graphene_simd4x4f_to_float: : a #graphene_sidm4x4f_t : (out caller-allocates) (array fixed-size=16): a floating point values vector capable of holding at least 16 values
*/
@extern def graphene_simd4x4f_to_float(m : Ptr[graphene_simd4x4f_t], v : Ptr[Float]): Unit = extern

/**
 * graphene_simd4x4f_translation: : a #graphene_simd4x4f_t : coordinate of the X translation : coordinate of the Y translation : coordinate of the Z translation
*/
@extern def graphene_simd4x4f_translation(m : Ptr[graphene_simd4x4f_t], x : Float, y : Float, z : Float): Unit = extern

/**
 * graphene_simd4x4f_transpose: : a #graphene_simd4x4f_t : (out): return location for the transposed matrix
*/
@extern def graphene_simd4x4f_transpose(s : Ptr[graphene_simd4x4f_t], res : Ptr[graphene_simd4x4f_t]): Unit = extern

@extern def graphene_simd4x4f_transpose_in_place(s : Ptr[graphene_simd4x4f_t]): Unit = extern

/**
 * graphene_simd4x4f_vec3_mul: : a #graphene_simd4x4f_t : a #graphene_simd4f_t : (out): return location for a #graphene_simd4f_t
*/
@extern def graphene_simd4x4f_vec3_mul(m : Ptr[graphene_simd4x4f_t], v : Ptr[graphene_simd4f_t], res : Ptr[graphene_simd4f_t]): Unit = extern

/**
 * graphene_simd4x4f_vec4_mul: : a #graphene_simd4x4f_t : a #graphene_simd4f_t : (out): return location for a #graphene_simd4f_t
*/
@extern def graphene_simd4x4f_vec4_mul(a : Ptr[graphene_simd4x4f_t], b : Ptr[graphene_simd4f_t], res : Ptr[graphene_simd4f_t]): Unit = extern

@extern def graphene_size_alloc(): Ptr[graphene_size_t] = extern

@extern def graphene_size_equal(a : Ptr[graphene_size_t], b : Ptr[graphene_size_t]): Boolean = extern

@extern def graphene_size_free(s : Ptr[graphene_size_t]): Unit = extern

@extern def graphene_size_init(s : Ptr[graphene_size_t], width : Float, height : Float): Ptr[graphene_size_t] = extern

@extern def graphene_size_init_from_size(s : Ptr[graphene_size_t], src : Ptr[graphene_size_t]): Ptr[graphene_size_t] = extern

@extern def graphene_size_interpolate(a : Ptr[graphene_size_t], b : Ptr[graphene_size_t], factor : Double, res : Ptr[graphene_size_t]): Unit = extern

@extern def graphene_size_scale(s : Ptr[graphene_size_t], factor : Float, res : Ptr[graphene_size_t]): Unit = extern

@extern def graphene_size_zero(): Ptr[graphene_size_t] = extern

@extern def graphene_sphere_alloc(): Ptr[graphene_sphere_t] = extern

@extern def graphene_sphere_contains_point(s : Ptr[graphene_sphere_t], point : Ptr[graphene_point3d_t]): Boolean = extern

@extern def graphene_sphere_distance(s : Ptr[graphene_sphere_t], point : Ptr[graphene_point3d_t]): Float = extern

@extern def graphene_sphere_equal(a : Ptr[graphene_sphere_t], b : Ptr[graphene_sphere_t]): Boolean = extern

@extern def graphene_sphere_free(s : Ptr[graphene_sphere_t]): Unit = extern

@extern def graphene_sphere_get_bounding_box(s : Ptr[graphene_sphere_t], box : Ptr[graphene_box_t]): Unit = extern

@extern def graphene_sphere_get_center(s : Ptr[graphene_sphere_t], center : Ptr[graphene_point3d_t]): Unit = extern

@extern def graphene_sphere_get_radius(s : Ptr[graphene_sphere_t]): Float = extern

@extern def graphene_sphere_init(s : Ptr[graphene_sphere_t], center : Ptr[graphene_point3d_t], radius : Float): Ptr[graphene_sphere_t] = extern

@extern def graphene_sphere_init_from_points(s : Ptr[graphene_sphere_t], n_points : CUnsignedInt, points : Ptr[graphene_point3d_t], center : Ptr[graphene_point3d_t]): Ptr[graphene_sphere_t] = extern

@extern def graphene_sphere_init_from_vectors(s : Ptr[graphene_sphere_t], n_vectors : CUnsignedInt, vectors : Ptr[graphene_vec3_t], center : Ptr[graphene_point3d_t]): Ptr[graphene_sphere_t] = extern

@extern def graphene_sphere_is_empty(s : Ptr[graphene_sphere_t]): Boolean = extern

@extern def graphene_sphere_translate(s : Ptr[graphene_sphere_t], point : Ptr[graphene_point3d_t], res : Ptr[graphene_sphere_t]): Unit = extern

@extern def graphene_triangle_alloc(): Ptr[graphene_triangle_t] = extern

@extern def graphene_triangle_contains_point(t : Ptr[graphene_triangle_t], p : Ptr[graphene_point3d_t]): Boolean = extern

@extern def graphene_triangle_equal(a : Ptr[graphene_triangle_t], b : Ptr[graphene_triangle_t]): Boolean = extern

@extern def graphene_triangle_free(t : Ptr[graphene_triangle_t]): Unit = extern

@extern def graphene_triangle_get_area(t : Ptr[graphene_triangle_t]): Float = extern

@extern def graphene_triangle_get_barycoords(t : Ptr[graphene_triangle_t], p : Ptr[graphene_point3d_t], res : Ptr[graphene_vec2_t]): Boolean = extern

@extern def graphene_triangle_get_bounding_box(t : Ptr[graphene_triangle_t], res : Ptr[graphene_box_t]): Unit = extern

@extern def graphene_triangle_get_midpoint(t : Ptr[graphene_triangle_t], res : Ptr[graphene_point3d_t]): Unit = extern

@extern def graphene_triangle_get_normal(t : Ptr[graphene_triangle_t], res : Ptr[graphene_vec3_t]): Unit = extern

@extern def graphene_triangle_get_plane(t : Ptr[graphene_triangle_t], res : Ptr[graphene_plane_t]): Unit = extern

@extern def graphene_triangle_get_points(t : Ptr[graphene_triangle_t], a : Ptr[graphene_point3d_t], b : Ptr[graphene_point3d_t], c : Ptr[graphene_point3d_t]): Unit = extern

@extern def graphene_triangle_get_uv(t : Ptr[graphene_triangle_t], p : Ptr[graphene_point3d_t], uv_a : Ptr[graphene_vec2_t], uv_b : Ptr[graphene_vec2_t], uv_c : Ptr[graphene_vec2_t], res : Ptr[graphene_vec2_t]): Boolean = extern

@extern def graphene_triangle_get_vertices(t : Ptr[graphene_triangle_t], a : Ptr[graphene_vec3_t], b : Ptr[graphene_vec3_t], c : Ptr[graphene_vec3_t]): Unit = extern

@extern def graphene_triangle_init_from_float(t : Ptr[graphene_triangle_t], a : Ptr[Float], b : Ptr[Float], c : Ptr[Float]): Ptr[graphene_triangle_t] = extern

@extern def graphene_triangle_init_from_point3d(t : Ptr[graphene_triangle_t], a : Ptr[graphene_point3d_t], b : Ptr[graphene_point3d_t], c : Ptr[graphene_point3d_t]): Ptr[graphene_triangle_t] = extern

@extern def graphene_triangle_init_from_vec3(t : Ptr[graphene_triangle_t], a : Ptr[graphene_vec3_t], b : Ptr[graphene_vec3_t], c : Ptr[graphene_vec3_t]): Ptr[graphene_triangle_t] = extern

@extern def graphene_vec2_add(a : Ptr[graphene_vec2_t], b : Ptr[graphene_vec2_t], res : Ptr[graphene_vec2_t]): Unit = extern

@extern def graphene_vec2_alloc(): Ptr[graphene_vec2_t] = extern

@extern def graphene_vec2_divide(a : Ptr[graphene_vec2_t], b : Ptr[graphene_vec2_t], res : Ptr[graphene_vec2_t]): Unit = extern

@extern def graphene_vec2_dot(a : Ptr[graphene_vec2_t], b : Ptr[graphene_vec2_t]): Float = extern

@extern def graphene_vec2_equal(v1 : Ptr[graphene_vec2_t], v2 : Ptr[graphene_vec2_t]): Boolean = extern

@extern def graphene_vec2_free(v : Ptr[graphene_vec2_t]): Unit = extern

@extern def graphene_vec2_get_x(v : Ptr[graphene_vec2_t]): Float = extern

@extern def graphene_vec2_get_y(v : Ptr[graphene_vec2_t]): Float = extern

@extern def graphene_vec2_init(v : Ptr[graphene_vec2_t], x : Float, y : Float): Ptr[graphene_vec2_t] = extern

@extern def graphene_vec2_init_from_float(v : Ptr[graphene_vec2_t], src : Ptr[Float]): Ptr[graphene_vec2_t] = extern

@extern def graphene_vec2_init_from_vec2(v : Ptr[graphene_vec2_t], src : Ptr[graphene_vec2_t]): Ptr[graphene_vec2_t] = extern

@extern def graphene_vec2_interpolate(v1 : Ptr[graphene_vec2_t], v2 : Ptr[graphene_vec2_t], factor : Double, res : Ptr[graphene_vec2_t]): Unit = extern

@extern def graphene_vec2_length(v : Ptr[graphene_vec2_t]): Float = extern

@extern def graphene_vec2_max(a : Ptr[graphene_vec2_t], b : Ptr[graphene_vec2_t], res : Ptr[graphene_vec2_t]): Unit = extern

@extern def graphene_vec2_min(a : Ptr[graphene_vec2_t], b : Ptr[graphene_vec2_t], res : Ptr[graphene_vec2_t]): Unit = extern

@extern def graphene_vec2_multiply(a : Ptr[graphene_vec2_t], b : Ptr[graphene_vec2_t], res : Ptr[graphene_vec2_t]): Unit = extern

@extern def graphene_vec2_near(v1 : Ptr[graphene_vec2_t], v2 : Ptr[graphene_vec2_t], epsilon : Float): Boolean = extern

@extern def graphene_vec2_negate(v : Ptr[graphene_vec2_t], res : Ptr[graphene_vec2_t]): Unit = extern

@extern def graphene_vec2_normalize(v : Ptr[graphene_vec2_t], res : Ptr[graphene_vec2_t]): Unit = extern

@extern def graphene_vec2_one(): Ptr[graphene_vec2_t] = extern

@extern def graphene_vec2_scale(v : Ptr[graphene_vec2_t], factor : Float, res : Ptr[graphene_vec2_t]): Unit = extern

@extern def graphene_vec2_subtract(a : Ptr[graphene_vec2_t], b : Ptr[graphene_vec2_t], res : Ptr[graphene_vec2_t]): Unit = extern

@extern def graphene_vec2_to_float(v : Ptr[graphene_vec2_t], dest : Ptr[Float]): Unit = extern

@extern def graphene_vec2_x_axis(): Ptr[graphene_vec2_t] = extern

@extern def graphene_vec2_y_axis(): Ptr[graphene_vec2_t] = extern

@extern def graphene_vec2_zero(): Ptr[graphene_vec2_t] = extern

@extern def graphene_vec3_add(a : Ptr[graphene_vec3_t], b : Ptr[graphene_vec3_t], res : Ptr[graphene_vec3_t]): Unit = extern

@extern def graphene_vec3_alloc(): Ptr[graphene_vec3_t] = extern

@extern def graphene_vec3_cross(a : Ptr[graphene_vec3_t], b : Ptr[graphene_vec3_t], res : Ptr[graphene_vec3_t]): Unit = extern

@extern def graphene_vec3_divide(a : Ptr[graphene_vec3_t], b : Ptr[graphene_vec3_t], res : Ptr[graphene_vec3_t]): Unit = extern

@extern def graphene_vec3_dot(a : Ptr[graphene_vec3_t], b : Ptr[graphene_vec3_t]): Float = extern

@extern def graphene_vec3_equal(v1 : Ptr[graphene_vec3_t], v2 : Ptr[graphene_vec3_t]): Boolean = extern

@extern def graphene_vec3_free(v : Ptr[graphene_vec3_t]): Unit = extern

@extern def graphene_vec3_get_x(v : Ptr[graphene_vec3_t]): Float = extern

@extern def graphene_vec3_get_xy(v : Ptr[graphene_vec3_t], res : Ptr[graphene_vec2_t]): Unit = extern

@extern def graphene_vec3_get_xy0(v : Ptr[graphene_vec3_t], res : Ptr[graphene_vec3_t]): Unit = extern

@extern def graphene_vec3_get_xyz0(v : Ptr[graphene_vec3_t], res : Ptr[graphene_vec4_t]): Unit = extern

@extern def graphene_vec3_get_xyz1(v : Ptr[graphene_vec3_t], res : Ptr[graphene_vec4_t]): Unit = extern

@extern def graphene_vec3_get_xyzw(v : Ptr[graphene_vec3_t], w : Float, res : Ptr[graphene_vec4_t]): Unit = extern

@extern def graphene_vec3_get_y(v : Ptr[graphene_vec3_t]): Float = extern

@extern def graphene_vec3_get_z(v : Ptr[graphene_vec3_t]): Float = extern

@extern def graphene_vec3_init(v : Ptr[graphene_vec3_t], x : Float, y : Float, z : Float): Ptr[graphene_vec3_t] = extern

@extern def graphene_vec3_init_from_float(v : Ptr[graphene_vec3_t], src : Ptr[Float]): Ptr[graphene_vec3_t] = extern

@extern def graphene_vec3_init_from_vec3(v : Ptr[graphene_vec3_t], src : Ptr[graphene_vec3_t]): Ptr[graphene_vec3_t] = extern

@extern def graphene_vec3_interpolate(v1 : Ptr[graphene_vec3_t], v2 : Ptr[graphene_vec3_t], factor : Double, res : Ptr[graphene_vec3_t]): Unit = extern

@extern def graphene_vec3_length(v : Ptr[graphene_vec3_t]): Float = extern

@extern def graphene_vec3_max(a : Ptr[graphene_vec3_t], b : Ptr[graphene_vec3_t], res : Ptr[graphene_vec3_t]): Unit = extern

@extern def graphene_vec3_min(a : Ptr[graphene_vec3_t], b : Ptr[graphene_vec3_t], res : Ptr[graphene_vec3_t]): Unit = extern

@extern def graphene_vec3_multiply(a : Ptr[graphene_vec3_t], b : Ptr[graphene_vec3_t], res : Ptr[graphene_vec3_t]): Unit = extern

@extern def graphene_vec3_near(v1 : Ptr[graphene_vec3_t], v2 : Ptr[graphene_vec3_t], epsilon : Float): Boolean = extern

@extern def graphene_vec3_negate(v : Ptr[graphene_vec3_t], res : Ptr[graphene_vec3_t]): Unit = extern

@extern def graphene_vec3_normalize(v : Ptr[graphene_vec3_t], res : Ptr[graphene_vec3_t]): Unit = extern

@extern def graphene_vec3_one(): Ptr[graphene_vec3_t] = extern

@extern def graphene_vec3_scale(v : Ptr[graphene_vec3_t], factor : Float, res : Ptr[graphene_vec3_t]): Unit = extern

@extern def graphene_vec3_subtract(a : Ptr[graphene_vec3_t], b : Ptr[graphene_vec3_t], res : Ptr[graphene_vec3_t]): Unit = extern

@extern def graphene_vec3_to_float(v : Ptr[graphene_vec3_t], dest : Ptr[Float]): Unit = extern

@extern def graphene_vec3_x_axis(): Ptr[graphene_vec3_t] = extern

@extern def graphene_vec3_y_axis(): Ptr[graphene_vec3_t] = extern

@extern def graphene_vec3_z_axis(): Ptr[graphene_vec3_t] = extern

@extern def graphene_vec3_zero(): Ptr[graphene_vec3_t] = extern

@extern def graphene_vec4_add(a : Ptr[graphene_vec4_t], b : Ptr[graphene_vec4_t], res : Ptr[graphene_vec4_t]): Unit = extern

@extern def graphene_vec4_alloc(): Ptr[graphene_vec4_t] = extern

@extern def graphene_vec4_divide(a : Ptr[graphene_vec4_t], b : Ptr[graphene_vec4_t], res : Ptr[graphene_vec4_t]): Unit = extern

@extern def graphene_vec4_dot(a : Ptr[graphene_vec4_t], b : Ptr[graphene_vec4_t]): Float = extern

@extern def graphene_vec4_equal(v1 : Ptr[graphene_vec4_t], v2 : Ptr[graphene_vec4_t]): Boolean = extern

@extern def graphene_vec4_free(v : Ptr[graphene_vec4_t]): Unit = extern

@extern def graphene_vec4_get_w(v : Ptr[graphene_vec4_t]): Float = extern

@extern def graphene_vec4_get_x(v : Ptr[graphene_vec4_t]): Float = extern

@extern def graphene_vec4_get_xy(v : Ptr[graphene_vec4_t], res : Ptr[graphene_vec2_t]): Unit = extern

@extern def graphene_vec4_get_xyz(v : Ptr[graphene_vec4_t], res : Ptr[graphene_vec3_t]): Unit = extern

@extern def graphene_vec4_get_y(v : Ptr[graphene_vec4_t]): Float = extern

@extern def graphene_vec4_get_z(v : Ptr[graphene_vec4_t]): Float = extern

@extern def graphene_vec4_init(v : Ptr[graphene_vec4_t], x : Float, y : Float, z : Float, w : Float): Ptr[graphene_vec4_t] = extern

@extern def graphene_vec4_init_from_float(v : Ptr[graphene_vec4_t], src : Ptr[Float]): Ptr[graphene_vec4_t] = extern

@extern def graphene_vec4_init_from_vec2(v : Ptr[graphene_vec4_t], src : Ptr[graphene_vec2_t], z : Float, w : Float): Ptr[graphene_vec4_t] = extern

@extern def graphene_vec4_init_from_vec3(v : Ptr[graphene_vec4_t], src : Ptr[graphene_vec3_t], w : Float): Ptr[graphene_vec4_t] = extern

@extern def graphene_vec4_init_from_vec4(v : Ptr[graphene_vec4_t], src : Ptr[graphene_vec4_t]): Ptr[graphene_vec4_t] = extern

@extern def graphene_vec4_interpolate(v1 : Ptr[graphene_vec4_t], v2 : Ptr[graphene_vec4_t], factor : Double, res : Ptr[graphene_vec4_t]): Unit = extern

@extern def graphene_vec4_length(v : Ptr[graphene_vec4_t]): Float = extern

@extern def graphene_vec4_max(a : Ptr[graphene_vec4_t], b : Ptr[graphene_vec4_t], res : Ptr[graphene_vec4_t]): Unit = extern

@extern def graphene_vec4_min(a : Ptr[graphene_vec4_t], b : Ptr[graphene_vec4_t], res : Ptr[graphene_vec4_t]): Unit = extern

@extern def graphene_vec4_multiply(a : Ptr[graphene_vec4_t], b : Ptr[graphene_vec4_t], res : Ptr[graphene_vec4_t]): Unit = extern

@extern def graphene_vec4_near(v1 : Ptr[graphene_vec4_t], v2 : Ptr[graphene_vec4_t], epsilon : Float): Boolean = extern

@extern def graphene_vec4_negate(v : Ptr[graphene_vec4_t], res : Ptr[graphene_vec4_t]): Unit = extern

@extern def graphene_vec4_normalize(v : Ptr[graphene_vec4_t], res : Ptr[graphene_vec4_t]): Unit = extern

@extern def graphene_vec4_one(): Ptr[graphene_vec4_t] = extern

@extern def graphene_vec4_scale(v : Ptr[graphene_vec4_t], factor : Float, res : Ptr[graphene_vec4_t]): Unit = extern

@extern def graphene_vec4_subtract(a : Ptr[graphene_vec4_t], b : Ptr[graphene_vec4_t], res : Ptr[graphene_vec4_t]): Unit = extern

@extern def graphene_vec4_to_float(v : Ptr[graphene_vec4_t], dest : Ptr[Float]): Unit = extern

@extern def graphene_vec4_w_axis(): Ptr[graphene_vec4_t] = extern

@extern def graphene_vec4_x_axis(): Ptr[graphene_vec4_t] = extern

@extern def graphene_vec4_y_axis(): Ptr[graphene_vec4_t] = extern

@extern def graphene_vec4_z_axis(): Ptr[graphene_vec4_t] = extern

@extern def graphene_vec4_zero(): Ptr[graphene_vec4_t] = extern
def graphene_simd4f_add(a : Ptr[graphene_simd4f_t], b : Ptr[graphene_simd4f_t])(using Zone): graphene_simd4f_t =
  val __ptr_0: Ptr[graphene_simd4f_t] = _root_.scala.scalanative.unsafe.alloc[graphene_simd4f_t](1)
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_add(a, b, (__ptr_0 + 0))
  !(__ptr_0 + 0)

def graphene_simd4f_add(a : Ptr[graphene_simd4f_t], b : Ptr[graphene_simd4f_t])(__return : Ptr[graphene_simd4f_t]): Unit =
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_add(a, b, __return)

def graphene_simd4f_add(a : graphene_simd4f_t, b : graphene_simd4f_t)(using Zone): graphene_simd4f_t =
  val __ptr_0: Ptr[graphene_simd4f_t] = _root_.scala.scalanative.unsafe.alloc[graphene_simd4f_t](3)
  !(__ptr_0 + 0) = a
  !(__ptr_0 + 1) = b
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_add((__ptr_0 + 0), (__ptr_0 + 1), (__ptr_0 + 2))
  !(__ptr_0 + 2)

/**
 * graphene_simd4f_clamp: : a #graphene_simd4f_t : the lower boundary : the upper boundary
*/
def graphene_simd4f_clamp(v : Ptr[graphene_simd4f_t], min : Ptr[graphene_simd4f_t], max : Ptr[graphene_simd4f_t])(__return : Ptr[graphene_simd4f_t]): Unit =
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_clamp(v, min, max, __return)

/**
 * graphene_simd4f_clamp: : a #graphene_simd4f_t : the lower boundary : the upper boundary
*/
def graphene_simd4f_clamp(v : graphene_simd4f_t, min : graphene_simd4f_t, max : graphene_simd4f_t)(using Zone): graphene_simd4f_t =
  val __ptr_0: Ptr[graphene_simd4f_t] = _root_.scala.scalanative.unsafe.alloc[graphene_simd4f_t](4)
  !(__ptr_0 + 0) = v
  !(__ptr_0 + 1) = min
  !(__ptr_0 + 2) = max
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_clamp((__ptr_0 + 0), (__ptr_0 + 1), (__ptr_0 + 2), (__ptr_0 + 3))
  !(__ptr_0 + 3)

/**
 * graphene_simd4f_clamp: : a #graphene_simd4f_t : the lower boundary : the upper boundary
*/
def graphene_simd4f_clamp(v : Ptr[graphene_simd4f_t], min : Ptr[graphene_simd4f_t], max : Ptr[graphene_simd4f_t])(using Zone): graphene_simd4f_t =
  val __ptr_0: Ptr[graphene_simd4f_t] = _root_.scala.scalanative.unsafe.alloc[graphene_simd4f_t](1)
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_clamp(v, min, max, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/**
 * graphene_simd4f_clamp_scalar: : a #graphene_simd4f_t : the lower boundary : the upper boundary
*/
def graphene_simd4f_clamp_scalar(v : Ptr[graphene_simd4f_t], min : Float, max : Float)(__return : Ptr[graphene_simd4f_t]): Unit =
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_clamp_scalar(v, min, max, __return)

/**
 * graphene_simd4f_clamp_scalar: : a #graphene_simd4f_t : the lower boundary : the upper boundary
*/
def graphene_simd4f_clamp_scalar(v : graphene_simd4f_t, min : Float, max : Float)(using Zone): graphene_simd4f_t =
  val __ptr_0: Ptr[graphene_simd4f_t] = _root_.scala.scalanative.unsafe.alloc[graphene_simd4f_t](2)
  !(__ptr_0 + 0) = v
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_clamp_scalar((__ptr_0 + 0), min, max, (__ptr_0 + 1))
  !(__ptr_0 + 1)

/**
 * graphene_simd4f_clamp_scalar: : a #graphene_simd4f_t : the lower boundary : the upper boundary
*/
def graphene_simd4f_clamp_scalar(v : Ptr[graphene_simd4f_t], min : Float, max : Float)(using Zone): graphene_simd4f_t =
  val __ptr_0: Ptr[graphene_simd4f_t] = _root_.scala.scalanative.unsafe.alloc[graphene_simd4f_t](1)
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_clamp_scalar(v, min, max, (__ptr_0 + 0))
  !(__ptr_0 + 0)

def graphene_simd4f_cmp_eq(a : Ptr[graphene_simd4f_t], b : Ptr[graphene_simd4f_t]): Boolean =
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_cmp_eq(a, b)

def graphene_simd4f_cmp_eq(a : graphene_simd4f_t, b : graphene_simd4f_t)(using Zone): Boolean =
  val __ptr_0: Ptr[graphene_simd4f_t] = _root_.scala.scalanative.unsafe.alloc[graphene_simd4f_t](2)
  !(__ptr_0 + 0) = a
  !(__ptr_0 + 1) = b
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_cmp_eq((__ptr_0 + 0), (__ptr_0 + 1))

def graphene_simd4f_cmp_ge(a : graphene_simd4f_t, b : graphene_simd4f_t)(using Zone): Boolean =
  val __ptr_0: Ptr[graphene_simd4f_t] = _root_.scala.scalanative.unsafe.alloc[graphene_simd4f_t](2)
  !(__ptr_0 + 0) = a
  !(__ptr_0 + 1) = b
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_cmp_ge((__ptr_0 + 0), (__ptr_0 + 1))

def graphene_simd4f_cmp_ge(a : Ptr[graphene_simd4f_t], b : Ptr[graphene_simd4f_t]): Boolean =
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_cmp_ge(a, b)

def graphene_simd4f_cmp_gt(a : graphene_simd4f_t, b : graphene_simd4f_t)(using Zone): Boolean =
  val __ptr_0: Ptr[graphene_simd4f_t] = _root_.scala.scalanative.unsafe.alloc[graphene_simd4f_t](2)
  !(__ptr_0 + 0) = a
  !(__ptr_0 + 1) = b
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_cmp_gt((__ptr_0 + 0), (__ptr_0 + 1))

def graphene_simd4f_cmp_gt(a : Ptr[graphene_simd4f_t], b : Ptr[graphene_simd4f_t]): Boolean =
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_cmp_gt(a, b)

def graphene_simd4f_cmp_le(a : graphene_simd4f_t, b : graphene_simd4f_t)(using Zone): Boolean =
  val __ptr_0: Ptr[graphene_simd4f_t] = _root_.scala.scalanative.unsafe.alloc[graphene_simd4f_t](2)
  !(__ptr_0 + 0) = a
  !(__ptr_0 + 1) = b
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_cmp_le((__ptr_0 + 0), (__ptr_0 + 1))

def graphene_simd4f_cmp_le(a : Ptr[graphene_simd4f_t], b : Ptr[graphene_simd4f_t]): Boolean =
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_cmp_le(a, b)

def graphene_simd4f_cmp_lt(a : graphene_simd4f_t, b : graphene_simd4f_t)(using Zone): Boolean =
  val __ptr_0: Ptr[graphene_simd4f_t] = _root_.scala.scalanative.unsafe.alloc[graphene_simd4f_t](2)
  !(__ptr_0 + 0) = a
  !(__ptr_0 + 1) = b
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_cmp_lt((__ptr_0 + 0), (__ptr_0 + 1))

def graphene_simd4f_cmp_lt(a : Ptr[graphene_simd4f_t], b : Ptr[graphene_simd4f_t]): Boolean =
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_cmp_lt(a, b)

def graphene_simd4f_cmp_neq(a : Ptr[graphene_simd4f_t], b : Ptr[graphene_simd4f_t]): Boolean =
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_cmp_neq(a, b)

def graphene_simd4f_cmp_neq(a : graphene_simd4f_t, b : graphene_simd4f_t)(using Zone): Boolean =
  val __ptr_0: Ptr[graphene_simd4f_t] = _root_.scala.scalanative.unsafe.alloc[graphene_simd4f_t](2)
  !(__ptr_0 + 0) = a
  !(__ptr_0 + 1) = b
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_cmp_neq((__ptr_0 + 0), (__ptr_0 + 1))

def graphene_simd4f_cross3(a : Ptr[graphene_simd4f_t], b : Ptr[graphene_simd4f_t])(using Zone): graphene_simd4f_t =
  val __ptr_0: Ptr[graphene_simd4f_t] = _root_.scala.scalanative.unsafe.alloc[graphene_simd4f_t](1)
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_cross3(a, b, (__ptr_0 + 0))
  !(__ptr_0 + 0)

def graphene_simd4f_cross3(a : graphene_simd4f_t, b : graphene_simd4f_t)(using Zone): graphene_simd4f_t =
  val __ptr_0: Ptr[graphene_simd4f_t] = _root_.scala.scalanative.unsafe.alloc[graphene_simd4f_t](3)
  !(__ptr_0 + 0) = a
  !(__ptr_0 + 1) = b
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_cross3((__ptr_0 + 0), (__ptr_0 + 1), (__ptr_0 + 2))
  !(__ptr_0 + 2)

def graphene_simd4f_cross3(a : Ptr[graphene_simd4f_t], b : Ptr[graphene_simd4f_t])(__return : Ptr[graphene_simd4f_t]): Unit =
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_cross3(a, b, __return)

def graphene_simd4f_div(a : graphene_simd4f_t, b : graphene_simd4f_t)(using Zone): graphene_simd4f_t =
  val __ptr_0: Ptr[graphene_simd4f_t] = _root_.scala.scalanative.unsafe.alloc[graphene_simd4f_t](3)
  !(__ptr_0 + 0) = a
  !(__ptr_0 + 1) = b
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_div((__ptr_0 + 0), (__ptr_0 + 1), (__ptr_0 + 2))
  !(__ptr_0 + 2)

def graphene_simd4f_div(a : Ptr[graphene_simd4f_t], b : Ptr[graphene_simd4f_t])(__return : Ptr[graphene_simd4f_t]): Unit =
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_div(a, b, __return)

def graphene_simd4f_div(a : Ptr[graphene_simd4f_t], b : Ptr[graphene_simd4f_t])(using Zone): graphene_simd4f_t =
  val __ptr_0: Ptr[graphene_simd4f_t] = _root_.scala.scalanative.unsafe.alloc[graphene_simd4f_t](1)
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_div(a, b, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/**
 * graphene_simd4f_dot2: : a #graphene_simd4f_t : a #graphene_simd4f_t
*/
def graphene_simd4f_dot2(a : Ptr[graphene_simd4f_t], b : Ptr[graphene_simd4f_t])(using Zone): graphene_simd4f_t =
  val __ptr_0: Ptr[graphene_simd4f_t] = _root_.scala.scalanative.unsafe.alloc[graphene_simd4f_t](1)
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_dot2(a, b, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/**
 * graphene_simd4f_dot2: : a #graphene_simd4f_t : a #graphene_simd4f_t
*/
def graphene_simd4f_dot2(a : graphene_simd4f_t, b : graphene_simd4f_t)(using Zone): graphene_simd4f_t =
  val __ptr_0: Ptr[graphene_simd4f_t] = _root_.scala.scalanative.unsafe.alloc[graphene_simd4f_t](3)
  !(__ptr_0 + 0) = a
  !(__ptr_0 + 1) = b
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_dot2((__ptr_0 + 0), (__ptr_0 + 1), (__ptr_0 + 2))
  !(__ptr_0 + 2)

/**
 * graphene_simd4f_dot2: : a #graphene_simd4f_t : a #graphene_simd4f_t
*/
def graphene_simd4f_dot2(a : Ptr[graphene_simd4f_t], b : Ptr[graphene_simd4f_t])(__return : Ptr[graphene_simd4f_t]): Unit =
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_dot2(a, b, __return)

def graphene_simd4f_dot3(a : Ptr[graphene_simd4f_t], b : Ptr[graphene_simd4f_t])(__return : Ptr[graphene_simd4f_t]): Unit =
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_dot3(a, b, __return)

def graphene_simd4f_dot3(a : Ptr[graphene_simd4f_t], b : Ptr[graphene_simd4f_t])(using Zone): graphene_simd4f_t =
  val __ptr_0: Ptr[graphene_simd4f_t] = _root_.scala.scalanative.unsafe.alloc[graphene_simd4f_t](1)
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_dot3(a, b, (__ptr_0 + 0))
  !(__ptr_0 + 0)

def graphene_simd4f_dot3(a : graphene_simd4f_t, b : graphene_simd4f_t)(using Zone): graphene_simd4f_t =
  val __ptr_0: Ptr[graphene_simd4f_t] = _root_.scala.scalanative.unsafe.alloc[graphene_simd4f_t](3)
  !(__ptr_0 + 0) = a
  !(__ptr_0 + 1) = b
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_dot3((__ptr_0 + 0), (__ptr_0 + 1), (__ptr_0 + 2))
  !(__ptr_0 + 2)

def graphene_simd4f_dot3_scalar(a : Ptr[graphene_simd4f_t], b : Ptr[graphene_simd4f_t]): Float =
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_dot3_scalar(a, b)

def graphene_simd4f_dot3_scalar(a : graphene_simd4f_t, b : graphene_simd4f_t)(using Zone): Float =
  val __ptr_0: Ptr[graphene_simd4f_t] = _root_.scala.scalanative.unsafe.alloc[graphene_simd4f_t](2)
  !(__ptr_0 + 0) = a
  !(__ptr_0 + 1) = b
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_dot3_scalar((__ptr_0 + 0), (__ptr_0 + 1))

/**
 * graphene_simd4f_dot4: : a #graphene_simd4f_t : a #graphene_simd4f_t
*/
def graphene_simd4f_dot4(a : graphene_simd4f_t, b : graphene_simd4f_t)(using Zone): graphene_simd4f_t =
  val __ptr_0: Ptr[graphene_simd4f_t] = _root_.scala.scalanative.unsafe.alloc[graphene_simd4f_t](3)
  !(__ptr_0 + 0) = a
  !(__ptr_0 + 1) = b
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_dot4((__ptr_0 + 0), (__ptr_0 + 1), (__ptr_0 + 2))
  !(__ptr_0 + 2)

/**
 * graphene_simd4f_dot4: : a #graphene_simd4f_t : a #graphene_simd4f_t
*/
def graphene_simd4f_dot4(a : Ptr[graphene_simd4f_t], b : Ptr[graphene_simd4f_t])(__return : Ptr[graphene_simd4f_t]): Unit =
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_dot4(a, b, __return)

/**
 * graphene_simd4f_dot4: : a #graphene_simd4f_t : a #graphene_simd4f_t
*/
def graphene_simd4f_dot4(a : Ptr[graphene_simd4f_t], b : Ptr[graphene_simd4f_t])(using Zone): graphene_simd4f_t =
  val __ptr_0: Ptr[graphene_simd4f_t] = _root_.scala.scalanative.unsafe.alloc[graphene_simd4f_t](1)
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_dot4(a, b, (__ptr_0 + 0))
  !(__ptr_0 + 0)

def graphene_simd4f_dup_2f(s : Ptr[graphene_simd4f_t], v : Ptr[Float]): Unit =
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_dup_2f(s, v)

def graphene_simd4f_dup_2f(s : graphene_simd4f_t, v : Ptr[Float])(using Zone): Unit =
  val __ptr_0: Ptr[graphene_simd4f_t] = _root_.scala.scalanative.unsafe.alloc[graphene_simd4f_t](1)
  !(__ptr_0 + 0) = s
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_dup_2f((__ptr_0 + 0), v)

def graphene_simd4f_dup_3f(s : graphene_simd4f_t, v : Ptr[Float])(using Zone): Unit =
  val __ptr_0: Ptr[graphene_simd4f_t] = _root_.scala.scalanative.unsafe.alloc[graphene_simd4f_t](1)
  !(__ptr_0 + 0) = s
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_dup_3f((__ptr_0 + 0), v)

def graphene_simd4f_dup_3f(s : Ptr[graphene_simd4f_t], v : Ptr[Float]): Unit =
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_dup_3f(s, v)

def graphene_simd4f_dup_4f(s : graphene_simd4f_t, v : Ptr[Float])(using Zone): Unit =
  val __ptr_0: Ptr[graphene_simd4f_t] = _root_.scala.scalanative.unsafe.alloc[graphene_simd4f_t](1)
  !(__ptr_0 + 0) = s
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_dup_4f((__ptr_0 + 0), v)

def graphene_simd4f_dup_4f(s : Ptr[graphene_simd4f_t], v : Ptr[Float]): Unit =
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_dup_4f(s, v)

def graphene_simd4f_flip_sign_0101(s : Ptr[graphene_simd4f_t])(using Zone): graphene_simd4f_t =
  val __ptr_0: Ptr[graphene_simd4f_t] = _root_.scala.scalanative.unsafe.alloc[graphene_simd4f_t](1)
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_flip_sign_0101(s, (__ptr_0 + 0))
  !(__ptr_0 + 0)

def graphene_simd4f_flip_sign_0101(s : graphene_simd4f_t)(using Zone): graphene_simd4f_t =
  val __ptr_0: Ptr[graphene_simd4f_t] = _root_.scala.scalanative.unsafe.alloc[graphene_simd4f_t](2)
  !(__ptr_0 + 0) = s
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_flip_sign_0101((__ptr_0 + 0), (__ptr_0 + 1))
  !(__ptr_0 + 1)

def graphene_simd4f_flip_sign_0101(s : Ptr[graphene_simd4f_t])(__return : Ptr[graphene_simd4f_t]): Unit =
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_flip_sign_0101(s, __return)

def graphene_simd4f_flip_sign_1010(s : graphene_simd4f_t)(using Zone): graphene_simd4f_t =
  val __ptr_0: Ptr[graphene_simd4f_t] = _root_.scala.scalanative.unsafe.alloc[graphene_simd4f_t](2)
  !(__ptr_0 + 0) = s
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_flip_sign_1010((__ptr_0 + 0), (__ptr_0 + 1))
  !(__ptr_0 + 1)

def graphene_simd4f_flip_sign_1010(s : Ptr[graphene_simd4f_t])(__return : Ptr[graphene_simd4f_t]): Unit =
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_flip_sign_1010(s, __return)

def graphene_simd4f_flip_sign_1010(s : Ptr[graphene_simd4f_t])(using Zone): graphene_simd4f_t =
  val __ptr_0: Ptr[graphene_simd4f_t] = _root_.scala.scalanative.unsafe.alloc[graphene_simd4f_t](1)
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_flip_sign_1010(s, (__ptr_0 + 0))
  !(__ptr_0 + 0)

def graphene_simd4f_get_w(s : graphene_simd4f_t)(using Zone): Float =
  val __ptr_0: Ptr[graphene_simd4f_t] = _root_.scala.scalanative.unsafe.alloc[graphene_simd4f_t](1)
  !(__ptr_0 + 0) = s
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_get_w((__ptr_0 + 0))

def graphene_simd4f_get_w(s : Ptr[graphene_simd4f_t]): Float =
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_get_w(s)

def graphene_simd4f_get_x(s : graphene_simd4f_t)(using Zone): Float =
  val __ptr_0: Ptr[graphene_simd4f_t] = _root_.scala.scalanative.unsafe.alloc[graphene_simd4f_t](1)
  !(__ptr_0 + 0) = s
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_get_x((__ptr_0 + 0))

def graphene_simd4f_get_x(s : Ptr[graphene_simd4f_t]): Float =
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_get_x(s)

def graphene_simd4f_get_y(s : graphene_simd4f_t)(using Zone): Float =
  val __ptr_0: Ptr[graphene_simd4f_t] = _root_.scala.scalanative.unsafe.alloc[graphene_simd4f_t](1)
  !(__ptr_0 + 0) = s
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_get_y((__ptr_0 + 0))

def graphene_simd4f_get_y(s : Ptr[graphene_simd4f_t]): Float =
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_get_y(s)

def graphene_simd4f_get_z(s : graphene_simd4f_t)(using Zone): Float =
  val __ptr_0: Ptr[graphene_simd4f_t] = _root_.scala.scalanative.unsafe.alloc[graphene_simd4f_t](1)
  !(__ptr_0 + 0) = s
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_get_z((__ptr_0 + 0))

def graphene_simd4f_get_z(s : Ptr[graphene_simd4f_t]): Float =
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_get_z(s)

def graphene_simd4f_init(x : Float, y : Float, z : Float, w : Float)(using Zone): graphene_simd4f_t =
  val __ptr_0: Ptr[graphene_simd4f_t] = _root_.scala.scalanative.unsafe.alloc[graphene_simd4f_t](1)
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_init(x, y, z, w, (__ptr_0 + 0))
  !(__ptr_0 + 0)

def graphene_simd4f_init(x : Float, y : Float, z : Float, w : Float)(__return : Ptr[graphene_simd4f_t]): Unit =
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_init(x, y, z, w, __return)

def graphene_simd4f_init_2f(v : Ptr[Float])(__return : Ptr[graphene_simd4f_t]): Unit =
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_init_2f(v, __return)

def graphene_simd4f_init_2f(v : Ptr[Float])(using Zone): graphene_simd4f_t =
  val __ptr_0: Ptr[graphene_simd4f_t] = _root_.scala.scalanative.unsafe.alloc[graphene_simd4f_t](1)
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_init_2f(v, (__ptr_0 + 0))
  !(__ptr_0 + 0)

def graphene_simd4f_init_3f(v : Ptr[Float])(using Zone): graphene_simd4f_t =
  val __ptr_0: Ptr[graphene_simd4f_t] = _root_.scala.scalanative.unsafe.alloc[graphene_simd4f_t](1)
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_init_3f(v, (__ptr_0 + 0))
  !(__ptr_0 + 0)

def graphene_simd4f_init_3f(v : Ptr[Float])(__return : Ptr[graphene_simd4f_t]): Unit =
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_init_3f(v, __return)

def graphene_simd4f_init_4f(v : Ptr[Float])(using Zone): graphene_simd4f_t =
  val __ptr_0: Ptr[graphene_simd4f_t] = _root_.scala.scalanative.unsafe.alloc[graphene_simd4f_t](1)
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_init_4f(v, (__ptr_0 + 0))
  !(__ptr_0 + 0)

def graphene_simd4f_init_4f(v : Ptr[Float])(__return : Ptr[graphene_simd4f_t]): Unit =
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_init_4f(v, __return)

def graphene_simd4f_init_zero()(using Zone): graphene_simd4f_t =
  val __ptr_0: Ptr[graphene_simd4f_t] = _root_.scala.scalanative.unsafe.alloc[graphene_simd4f_t](1)
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_init_zero((__ptr_0 + 0))
  !(__ptr_0 + 0)

def graphene_simd4f_init_zero()(__return : Ptr[graphene_simd4f_t]): Unit =
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_init_zero(__return)

/**
 * graphene_simd4f_interpolate: : a #graphene_simd4f_t : a #graphene_simd4f_t : the interpolation factor
*/
def graphene_simd4f_interpolate(a : graphene_simd4f_t, b : graphene_simd4f_t, f : Float)(using Zone): graphene_simd4f_t =
  val __ptr_0: Ptr[graphene_simd4f_t] = _root_.scala.scalanative.unsafe.alloc[graphene_simd4f_t](3)
  !(__ptr_0 + 0) = a
  !(__ptr_0 + 1) = b
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_interpolate((__ptr_0 + 0), (__ptr_0 + 1), f, (__ptr_0 + 2))
  !(__ptr_0 + 2)

/**
 * graphene_simd4f_interpolate: : a #graphene_simd4f_t : a #graphene_simd4f_t : the interpolation factor
*/
def graphene_simd4f_interpolate(a : Ptr[graphene_simd4f_t], b : Ptr[graphene_simd4f_t], f : Float)(using Zone): graphene_simd4f_t =
  val __ptr_0: Ptr[graphene_simd4f_t] = _root_.scala.scalanative.unsafe.alloc[graphene_simd4f_t](1)
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_interpolate(a, b, f, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/**
 * graphene_simd4f_interpolate: : a #graphene_simd4f_t : a #graphene_simd4f_t : the interpolation factor
*/
def graphene_simd4f_interpolate(a : Ptr[graphene_simd4f_t], b : Ptr[graphene_simd4f_t], f : Float)(__return : Ptr[graphene_simd4f_t]): Unit =
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_interpolate(a, b, f, __return)

/**
 * graphene_simd4f_is_zero2: : a #graphene_simd4f_t
*/
def graphene_simd4f_is_zero2(v : graphene_simd4f_t)(using Zone): Boolean =
  val __ptr_0: Ptr[graphene_simd4f_t] = _root_.scala.scalanative.unsafe.alloc[graphene_simd4f_t](1)
  !(__ptr_0 + 0) = v
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_is_zero2((__ptr_0 + 0))

/**
 * graphene_simd4f_is_zero2: : a #graphene_simd4f_t
*/
def graphene_simd4f_is_zero2(v : Ptr[graphene_simd4f_t]): Boolean =
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_is_zero2(v)

/**
 * graphene_simd4f_is_zero3: : a #graphene_simd4f_t
*/
def graphene_simd4f_is_zero3(v : graphene_simd4f_t)(using Zone): Boolean =
  val __ptr_0: Ptr[graphene_simd4f_t] = _root_.scala.scalanative.unsafe.alloc[graphene_simd4f_t](1)
  !(__ptr_0 + 0) = v
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_is_zero3((__ptr_0 + 0))

/**
 * graphene_simd4f_is_zero3: : a #graphene_simd4f_t
*/
def graphene_simd4f_is_zero3(v : Ptr[graphene_simd4f_t]): Boolean =
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_is_zero3(v)

/**
 * graphene_simd4f_is_zero4: : a #graphene_simd4f_t
*/
def graphene_simd4f_is_zero4(v : Ptr[graphene_simd4f_t]): Boolean =
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_is_zero4(v)

/**
 * graphene_simd4f_is_zero4: : a #graphene_simd4f_t
*/
def graphene_simd4f_is_zero4(v : graphene_simd4f_t)(using Zone): Boolean =
  val __ptr_0: Ptr[graphene_simd4f_t] = _root_.scala.scalanative.unsafe.alloc[graphene_simd4f_t](1)
  !(__ptr_0 + 0) = v
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_is_zero4((__ptr_0 + 0))

/**
 * graphene_simd4f_length2: : a #graphene_simd4f_t
*/
def graphene_simd4f_length2(v : Ptr[graphene_simd4f_t])(__return : Ptr[graphene_simd4f_t]): Unit =
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_length2(v, __return)

/**
 * graphene_simd4f_length2: : a #graphene_simd4f_t
*/
def graphene_simd4f_length2(v : graphene_simd4f_t)(using Zone): graphene_simd4f_t =
  val __ptr_0: Ptr[graphene_simd4f_t] = _root_.scala.scalanative.unsafe.alloc[graphene_simd4f_t](2)
  !(__ptr_0 + 0) = v
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_length2((__ptr_0 + 0), (__ptr_0 + 1))
  !(__ptr_0 + 1)

/**
 * graphene_simd4f_length2: : a #graphene_simd4f_t
*/
def graphene_simd4f_length2(v : Ptr[graphene_simd4f_t])(using Zone): graphene_simd4f_t =
  val __ptr_0: Ptr[graphene_simd4f_t] = _root_.scala.scalanative.unsafe.alloc[graphene_simd4f_t](1)
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_length2(v, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/**
 * graphene_simd4f_length3: : a #graphene_simd4f_t
*/
def graphene_simd4f_length3(v : Ptr[graphene_simd4f_t])(using Zone): graphene_simd4f_t =
  val __ptr_0: Ptr[graphene_simd4f_t] = _root_.scala.scalanative.unsafe.alloc[graphene_simd4f_t](1)
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_length3(v, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/**
 * graphene_simd4f_length3: : a #graphene_simd4f_t
*/
def graphene_simd4f_length3(v : Ptr[graphene_simd4f_t])(__return : Ptr[graphene_simd4f_t]): Unit =
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_length3(v, __return)

/**
 * graphene_simd4f_length3: : a #graphene_simd4f_t
*/
def graphene_simd4f_length3(v : graphene_simd4f_t)(using Zone): graphene_simd4f_t =
  val __ptr_0: Ptr[graphene_simd4f_t] = _root_.scala.scalanative.unsafe.alloc[graphene_simd4f_t](2)
  !(__ptr_0 + 0) = v
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_length3((__ptr_0 + 0), (__ptr_0 + 1))
  !(__ptr_0 + 1)

/**
 * graphene_simd4f_length4: : a #graphene_simd4f_t
*/
def graphene_simd4f_length4(v : Ptr[graphene_simd4f_t])(using Zone): graphene_simd4f_t =
  val __ptr_0: Ptr[graphene_simd4f_t] = _root_.scala.scalanative.unsafe.alloc[graphene_simd4f_t](1)
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_length4(v, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/**
 * graphene_simd4f_length4: : a #graphene_simd4f_t
*/
def graphene_simd4f_length4(v : graphene_simd4f_t)(using Zone): graphene_simd4f_t =
  val __ptr_0: Ptr[graphene_simd4f_t] = _root_.scala.scalanative.unsafe.alloc[graphene_simd4f_t](2)
  !(__ptr_0 + 0) = v
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_length4((__ptr_0 + 0), (__ptr_0 + 1))
  !(__ptr_0 + 1)

/**
 * graphene_simd4f_length4: : a #graphene_simd4f_t
*/
def graphene_simd4f_length4(v : Ptr[graphene_simd4f_t])(__return : Ptr[graphene_simd4f_t]): Unit =
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_length4(v, __return)

/**
 * graphene_simd4f_madd: : a #graphene_simd4f_t : a #graphene_simd4f_t : a #graphene_simd4f_t
*/
def graphene_simd4f_madd(m1 : Ptr[graphene_simd4f_t], m2 : Ptr[graphene_simd4f_t], a : Ptr[graphene_simd4f_t])(using Zone): graphene_simd4f_t =
  val __ptr_0: Ptr[graphene_simd4f_t] = _root_.scala.scalanative.unsafe.alloc[graphene_simd4f_t](1)
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_madd(m1, m2, a, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/**
 * graphene_simd4f_madd: : a #graphene_simd4f_t : a #graphene_simd4f_t : a #graphene_simd4f_t
*/
def graphene_simd4f_madd(m1 : graphene_simd4f_t, m2 : graphene_simd4f_t, a : graphene_simd4f_t)(using Zone): graphene_simd4f_t =
  val __ptr_0: Ptr[graphene_simd4f_t] = _root_.scala.scalanative.unsafe.alloc[graphene_simd4f_t](4)
  !(__ptr_0 + 0) = m1
  !(__ptr_0 + 1) = m2
  !(__ptr_0 + 2) = a
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_madd((__ptr_0 + 0), (__ptr_0 + 1), (__ptr_0 + 2), (__ptr_0 + 3))
  !(__ptr_0 + 3)

/**
 * graphene_simd4f_madd: : a #graphene_simd4f_t : a #graphene_simd4f_t : a #graphene_simd4f_t
*/
def graphene_simd4f_madd(m1 : Ptr[graphene_simd4f_t], m2 : Ptr[graphene_simd4f_t], a : Ptr[graphene_simd4f_t])(__return : Ptr[graphene_simd4f_t]): Unit =
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_madd(m1, m2, a, __return)

def graphene_simd4f_max(a : Ptr[graphene_simd4f_t], b : Ptr[graphene_simd4f_t])(__return : Ptr[graphene_simd4f_t]): Unit =
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_max(a, b, __return)

def graphene_simd4f_max(a : Ptr[graphene_simd4f_t], b : Ptr[graphene_simd4f_t])(using Zone): graphene_simd4f_t =
  val __ptr_0: Ptr[graphene_simd4f_t] = _root_.scala.scalanative.unsafe.alloc[graphene_simd4f_t](1)
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_max(a, b, (__ptr_0 + 0))
  !(__ptr_0 + 0)

def graphene_simd4f_max(a : graphene_simd4f_t, b : graphene_simd4f_t)(using Zone): graphene_simd4f_t =
  val __ptr_0: Ptr[graphene_simd4f_t] = _root_.scala.scalanative.unsafe.alloc[graphene_simd4f_t](3)
  !(__ptr_0 + 0) = a
  !(__ptr_0 + 1) = b
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_max((__ptr_0 + 0), (__ptr_0 + 1), (__ptr_0 + 2))
  !(__ptr_0 + 2)

/**
 * graphene_simd4f_max_val: : a #graphene_simd4f_t
*/
def graphene_simd4f_max_val(v : Ptr[graphene_simd4f_t])(using Zone): graphene_simd4f_t =
  val __ptr_0: Ptr[graphene_simd4f_t] = _root_.scala.scalanative.unsafe.alloc[graphene_simd4f_t](1)
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_max_val(v, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/**
 * graphene_simd4f_max_val: : a #graphene_simd4f_t
*/
def graphene_simd4f_max_val(v : Ptr[graphene_simd4f_t])(__return : Ptr[graphene_simd4f_t]): Unit =
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_max_val(v, __return)

/**
 * graphene_simd4f_max_val: : a #graphene_simd4f_t
*/
def graphene_simd4f_max_val(v : graphene_simd4f_t)(using Zone): graphene_simd4f_t =
  val __ptr_0: Ptr[graphene_simd4f_t] = _root_.scala.scalanative.unsafe.alloc[graphene_simd4f_t](2)
  !(__ptr_0 + 0) = v
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_max_val((__ptr_0 + 0), (__ptr_0 + 1))
  !(__ptr_0 + 1)

def graphene_simd4f_merge_high(a : graphene_simd4f_t, b : graphene_simd4f_t)(using Zone): graphene_simd4f_t =
  val __ptr_0: Ptr[graphene_simd4f_t] = _root_.scala.scalanative.unsafe.alloc[graphene_simd4f_t](3)
  !(__ptr_0 + 0) = a
  !(__ptr_0 + 1) = b
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_merge_high((__ptr_0 + 0), (__ptr_0 + 1), (__ptr_0 + 2))
  !(__ptr_0 + 2)

def graphene_simd4f_merge_high(a : Ptr[graphene_simd4f_t], b : Ptr[graphene_simd4f_t])(__return : Ptr[graphene_simd4f_t]): Unit =
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_merge_high(a, b, __return)

def graphene_simd4f_merge_high(a : Ptr[graphene_simd4f_t], b : Ptr[graphene_simd4f_t])(using Zone): graphene_simd4f_t =
  val __ptr_0: Ptr[graphene_simd4f_t] = _root_.scala.scalanative.unsafe.alloc[graphene_simd4f_t](1)
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_merge_high(a, b, (__ptr_0 + 0))
  !(__ptr_0 + 0)

def graphene_simd4f_merge_low(a : graphene_simd4f_t, b : graphene_simd4f_t)(using Zone): graphene_simd4f_t =
  val __ptr_0: Ptr[graphene_simd4f_t] = _root_.scala.scalanative.unsafe.alloc[graphene_simd4f_t](3)
  !(__ptr_0 + 0) = a
  !(__ptr_0 + 1) = b
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_merge_low((__ptr_0 + 0), (__ptr_0 + 1), (__ptr_0 + 2))
  !(__ptr_0 + 2)

def graphene_simd4f_merge_low(a : Ptr[graphene_simd4f_t], b : Ptr[graphene_simd4f_t])(using Zone): graphene_simd4f_t =
  val __ptr_0: Ptr[graphene_simd4f_t] = _root_.scala.scalanative.unsafe.alloc[graphene_simd4f_t](1)
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_merge_low(a, b, (__ptr_0 + 0))
  !(__ptr_0 + 0)

def graphene_simd4f_merge_low(a : Ptr[graphene_simd4f_t], b : Ptr[graphene_simd4f_t])(__return : Ptr[graphene_simd4f_t]): Unit =
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_merge_low(a, b, __return)

def graphene_simd4f_merge_w(s : Ptr[graphene_simd4f_t], v : Float)(using Zone): graphene_simd4f_t =
  val __ptr_0: Ptr[graphene_simd4f_t] = _root_.scala.scalanative.unsafe.alloc[graphene_simd4f_t](1)
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_merge_w(s, v, (__ptr_0 + 0))
  !(__ptr_0 + 0)

def graphene_simd4f_merge_w(s : graphene_simd4f_t, v : Float)(using Zone): graphene_simd4f_t =
  val __ptr_0: Ptr[graphene_simd4f_t] = _root_.scala.scalanative.unsafe.alloc[graphene_simd4f_t](2)
  !(__ptr_0 + 0) = s
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_merge_w((__ptr_0 + 0), v, (__ptr_0 + 1))
  !(__ptr_0 + 1)

def graphene_simd4f_merge_w(s : Ptr[graphene_simd4f_t], v : Float)(__return : Ptr[graphene_simd4f_t]): Unit =
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_merge_w(s, v, __return)

def graphene_simd4f_min(a : graphene_simd4f_t, b : graphene_simd4f_t)(using Zone): graphene_simd4f_t =
  val __ptr_0: Ptr[graphene_simd4f_t] = _root_.scala.scalanative.unsafe.alloc[graphene_simd4f_t](3)
  !(__ptr_0 + 0) = a
  !(__ptr_0 + 1) = b
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_min((__ptr_0 + 0), (__ptr_0 + 1), (__ptr_0 + 2))
  !(__ptr_0 + 2)

def graphene_simd4f_min(a : Ptr[graphene_simd4f_t], b : Ptr[graphene_simd4f_t])(__return : Ptr[graphene_simd4f_t]): Unit =
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_min(a, b, __return)

def graphene_simd4f_min(a : Ptr[graphene_simd4f_t], b : Ptr[graphene_simd4f_t])(using Zone): graphene_simd4f_t =
  val __ptr_0: Ptr[graphene_simd4f_t] = _root_.scala.scalanative.unsafe.alloc[graphene_simd4f_t](1)
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_min(a, b, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/**
 * graphene_simd4f_min_val: : a #graphene_simd4f_t
*/
def graphene_simd4f_min_val(v : Ptr[graphene_simd4f_t])(using Zone): graphene_simd4f_t =
  val __ptr_0: Ptr[graphene_simd4f_t] = _root_.scala.scalanative.unsafe.alloc[graphene_simd4f_t](1)
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_min_val(v, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/**
 * graphene_simd4f_min_val: : a #graphene_simd4f_t
*/
def graphene_simd4f_min_val(v : graphene_simd4f_t)(using Zone): graphene_simd4f_t =
  val __ptr_0: Ptr[graphene_simd4f_t] = _root_.scala.scalanative.unsafe.alloc[graphene_simd4f_t](2)
  !(__ptr_0 + 0) = v
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_min_val((__ptr_0 + 0), (__ptr_0 + 1))
  !(__ptr_0 + 1)

/**
 * graphene_simd4f_min_val: : a #graphene_simd4f_t
*/
def graphene_simd4f_min_val(v : Ptr[graphene_simd4f_t])(__return : Ptr[graphene_simd4f_t]): Unit =
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_min_val(v, __return)

def graphene_simd4f_mul(a : Ptr[graphene_simd4f_t], b : Ptr[graphene_simd4f_t])(__return : Ptr[graphene_simd4f_t]): Unit =
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_mul(a, b, __return)

def graphene_simd4f_mul(a : Ptr[graphene_simd4f_t], b : Ptr[graphene_simd4f_t])(using Zone): graphene_simd4f_t =
  val __ptr_0: Ptr[graphene_simd4f_t] = _root_.scala.scalanative.unsafe.alloc[graphene_simd4f_t](1)
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_mul(a, b, (__ptr_0 + 0))
  !(__ptr_0 + 0)

def graphene_simd4f_mul(a : graphene_simd4f_t, b : graphene_simd4f_t)(using Zone): graphene_simd4f_t =
  val __ptr_0: Ptr[graphene_simd4f_t] = _root_.scala.scalanative.unsafe.alloc[graphene_simd4f_t](3)
  !(__ptr_0 + 0) = a
  !(__ptr_0 + 1) = b
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_mul((__ptr_0 + 0), (__ptr_0 + 1), (__ptr_0 + 2))
  !(__ptr_0 + 2)

def graphene_simd4f_neg(s : Ptr[graphene_simd4f_t])(using Zone): graphene_simd4f_t =
  val __ptr_0: Ptr[graphene_simd4f_t] = _root_.scala.scalanative.unsafe.alloc[graphene_simd4f_t](1)
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_neg(s, (__ptr_0 + 0))
  !(__ptr_0 + 0)

def graphene_simd4f_neg(s : graphene_simd4f_t)(using Zone): graphene_simd4f_t =
  val __ptr_0: Ptr[graphene_simd4f_t] = _root_.scala.scalanative.unsafe.alloc[graphene_simd4f_t](2)
  !(__ptr_0 + 0) = s
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_neg((__ptr_0 + 0), (__ptr_0 + 1))
  !(__ptr_0 + 1)

def graphene_simd4f_neg(s : Ptr[graphene_simd4f_t])(__return : Ptr[graphene_simd4f_t]): Unit =
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_neg(s, __return)

/**
 * graphene_simd4f_normalize2: : a #graphene_simd4f_t
*/
def graphene_simd4f_normalize2(v : Ptr[graphene_simd4f_t])(__return : Ptr[graphene_simd4f_t]): Unit =
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_normalize2(v, __return)

/**
 * graphene_simd4f_normalize2: : a #graphene_simd4f_t
*/
def graphene_simd4f_normalize2(v : Ptr[graphene_simd4f_t])(using Zone): graphene_simd4f_t =
  val __ptr_0: Ptr[graphene_simd4f_t] = _root_.scala.scalanative.unsafe.alloc[graphene_simd4f_t](1)
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_normalize2(v, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/**
 * graphene_simd4f_normalize2: : a #graphene_simd4f_t
*/
def graphene_simd4f_normalize2(v : graphene_simd4f_t)(using Zone): graphene_simd4f_t =
  val __ptr_0: Ptr[graphene_simd4f_t] = _root_.scala.scalanative.unsafe.alloc[graphene_simd4f_t](2)
  !(__ptr_0 + 0) = v
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_normalize2((__ptr_0 + 0), (__ptr_0 + 1))
  !(__ptr_0 + 1)

/**
 * graphene_simd4f_normalize3: : a #graphene_simd4f_t
*/
def graphene_simd4f_normalize3(v : Ptr[graphene_simd4f_t])(using Zone): graphene_simd4f_t =
  val __ptr_0: Ptr[graphene_simd4f_t] = _root_.scala.scalanative.unsafe.alloc[graphene_simd4f_t](1)
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_normalize3(v, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/**
 * graphene_simd4f_normalize3: : a #graphene_simd4f_t
*/
def graphene_simd4f_normalize3(v : Ptr[graphene_simd4f_t])(__return : Ptr[graphene_simd4f_t]): Unit =
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_normalize3(v, __return)

/**
 * graphene_simd4f_normalize3: : a #graphene_simd4f_t
*/
def graphene_simd4f_normalize3(v : graphene_simd4f_t)(using Zone): graphene_simd4f_t =
  val __ptr_0: Ptr[graphene_simd4f_t] = _root_.scala.scalanative.unsafe.alloc[graphene_simd4f_t](2)
  !(__ptr_0 + 0) = v
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_normalize3((__ptr_0 + 0), (__ptr_0 + 1))
  !(__ptr_0 + 1)

/**
 * graphene_simd4f_normalize4: : a #graphene_simd4f_t
*/
def graphene_simd4f_normalize4(v : Ptr[graphene_simd4f_t])(using Zone): graphene_simd4f_t =
  val __ptr_0: Ptr[graphene_simd4f_t] = _root_.scala.scalanative.unsafe.alloc[graphene_simd4f_t](1)
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_normalize4(v, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/**
 * graphene_simd4f_normalize4: : a #graphene_simd4f_t
*/
def graphene_simd4f_normalize4(v : graphene_simd4f_t)(using Zone): graphene_simd4f_t =
  val __ptr_0: Ptr[graphene_simd4f_t] = _root_.scala.scalanative.unsafe.alloc[graphene_simd4f_t](2)
  !(__ptr_0 + 0) = v
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_normalize4((__ptr_0 + 0), (__ptr_0 + 1))
  !(__ptr_0 + 1)

/**
 * graphene_simd4f_normalize4: : a #graphene_simd4f_t
*/
def graphene_simd4f_normalize4(v : Ptr[graphene_simd4f_t])(__return : Ptr[graphene_simd4f_t]): Unit =
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_normalize4(v, __return)

def graphene_simd4f_reciprocal(s : Ptr[graphene_simd4f_t])(__return : Ptr[graphene_simd4f_t]): Unit =
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_reciprocal(s, __return)

def graphene_simd4f_reciprocal(s : graphene_simd4f_t)(using Zone): graphene_simd4f_t =
  val __ptr_0: Ptr[graphene_simd4f_t] = _root_.scala.scalanative.unsafe.alloc[graphene_simd4f_t](2)
  !(__ptr_0 + 0) = s
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_reciprocal((__ptr_0 + 0), (__ptr_0 + 1))
  !(__ptr_0 + 1)

def graphene_simd4f_reciprocal(s : Ptr[graphene_simd4f_t])(using Zone): graphene_simd4f_t =
  val __ptr_0: Ptr[graphene_simd4f_t] = _root_.scala.scalanative.unsafe.alloc[graphene_simd4f_t](1)
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_reciprocal(s, (__ptr_0 + 0))
  !(__ptr_0 + 0)

def graphene_simd4f_rsqrt(s : Ptr[graphene_simd4f_t])(using Zone): graphene_simd4f_t =
  val __ptr_0: Ptr[graphene_simd4f_t] = _root_.scala.scalanative.unsafe.alloc[graphene_simd4f_t](1)
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_rsqrt(s, (__ptr_0 + 0))
  !(__ptr_0 + 0)

def graphene_simd4f_rsqrt(s : Ptr[graphene_simd4f_t])(__return : Ptr[graphene_simd4f_t]): Unit =
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_rsqrt(s, __return)

def graphene_simd4f_rsqrt(s : graphene_simd4f_t)(using Zone): graphene_simd4f_t =
  val __ptr_0: Ptr[graphene_simd4f_t] = _root_.scala.scalanative.unsafe.alloc[graphene_simd4f_t](2)
  !(__ptr_0 + 0) = s
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_rsqrt((__ptr_0 + 0), (__ptr_0 + 1))
  !(__ptr_0 + 1)

def graphene_simd4f_shuffle_wxyz(s : Ptr[graphene_simd4f_t])(__return : Ptr[graphene_simd4f_t]): Unit =
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_shuffle_wxyz(s, __return)

def graphene_simd4f_shuffle_wxyz(s : Ptr[graphene_simd4f_t])(using Zone): graphene_simd4f_t =
  val __ptr_0: Ptr[graphene_simd4f_t] = _root_.scala.scalanative.unsafe.alloc[graphene_simd4f_t](1)
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_shuffle_wxyz(s, (__ptr_0 + 0))
  !(__ptr_0 + 0)

def graphene_simd4f_shuffle_wxyz(s : graphene_simd4f_t)(using Zone): graphene_simd4f_t =
  val __ptr_0: Ptr[graphene_simd4f_t] = _root_.scala.scalanative.unsafe.alloc[graphene_simd4f_t](2)
  !(__ptr_0 + 0) = s
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_shuffle_wxyz((__ptr_0 + 0), (__ptr_0 + 1))
  !(__ptr_0 + 1)

def graphene_simd4f_shuffle_yzwx(s : graphene_simd4f_t)(using Zone): graphene_simd4f_t =
  val __ptr_0: Ptr[graphene_simd4f_t] = _root_.scala.scalanative.unsafe.alloc[graphene_simd4f_t](2)
  !(__ptr_0 + 0) = s
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_shuffle_yzwx((__ptr_0 + 0), (__ptr_0 + 1))
  !(__ptr_0 + 1)

def graphene_simd4f_shuffle_yzwx(s : Ptr[graphene_simd4f_t])(__return : Ptr[graphene_simd4f_t]): Unit =
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_shuffle_yzwx(s, __return)

def graphene_simd4f_shuffle_yzwx(s : Ptr[graphene_simd4f_t])(using Zone): graphene_simd4f_t =
  val __ptr_0: Ptr[graphene_simd4f_t] = _root_.scala.scalanative.unsafe.alloc[graphene_simd4f_t](1)
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_shuffle_yzwx(s, (__ptr_0 + 0))
  !(__ptr_0 + 0)

def graphene_simd4f_shuffle_zwxy(s : Ptr[graphene_simd4f_t])(using Zone): graphene_simd4f_t =
  val __ptr_0: Ptr[graphene_simd4f_t] = _root_.scala.scalanative.unsafe.alloc[graphene_simd4f_t](1)
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_shuffle_zwxy(s, (__ptr_0 + 0))
  !(__ptr_0 + 0)

def graphene_simd4f_shuffle_zwxy(s : Ptr[graphene_simd4f_t])(__return : Ptr[graphene_simd4f_t]): Unit =
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_shuffle_zwxy(s, __return)

def graphene_simd4f_shuffle_zwxy(s : graphene_simd4f_t)(using Zone): graphene_simd4f_t =
  val __ptr_0: Ptr[graphene_simd4f_t] = _root_.scala.scalanative.unsafe.alloc[graphene_simd4f_t](2)
  !(__ptr_0 + 0) = s
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_shuffle_zwxy((__ptr_0 + 0), (__ptr_0 + 1))
  !(__ptr_0 + 1)

def graphene_simd4f_splat(v : Float)(__return : Ptr[graphene_simd4f_t]): Unit =
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_splat(v, __return)

def graphene_simd4f_splat(v : Float)(using Zone): graphene_simd4f_t =
  val __ptr_0: Ptr[graphene_simd4f_t] = _root_.scala.scalanative.unsafe.alloc[graphene_simd4f_t](1)
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_splat(v, (__ptr_0 + 0))
  !(__ptr_0 + 0)

def graphene_simd4f_splat_w(s : graphene_simd4f_t)(using Zone): graphene_simd4f_t =
  val __ptr_0: Ptr[graphene_simd4f_t] = _root_.scala.scalanative.unsafe.alloc[graphene_simd4f_t](2)
  !(__ptr_0 + 0) = s
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_splat_w((__ptr_0 + 0), (__ptr_0 + 1))
  !(__ptr_0 + 1)

def graphene_simd4f_splat_w(s : Ptr[graphene_simd4f_t])(__return : Ptr[graphene_simd4f_t]): Unit =
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_splat_w(s, __return)

def graphene_simd4f_splat_w(s : Ptr[graphene_simd4f_t])(using Zone): graphene_simd4f_t =
  val __ptr_0: Ptr[graphene_simd4f_t] = _root_.scala.scalanative.unsafe.alloc[graphene_simd4f_t](1)
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_splat_w(s, (__ptr_0 + 0))
  !(__ptr_0 + 0)

def graphene_simd4f_splat_x(s : graphene_simd4f_t)(using Zone): graphene_simd4f_t =
  val __ptr_0: Ptr[graphene_simd4f_t] = _root_.scala.scalanative.unsafe.alloc[graphene_simd4f_t](2)
  !(__ptr_0 + 0) = s
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_splat_x((__ptr_0 + 0), (__ptr_0 + 1))
  !(__ptr_0 + 1)

def graphene_simd4f_splat_x(s : Ptr[graphene_simd4f_t])(using Zone): graphene_simd4f_t =
  val __ptr_0: Ptr[graphene_simd4f_t] = _root_.scala.scalanative.unsafe.alloc[graphene_simd4f_t](1)
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_splat_x(s, (__ptr_0 + 0))
  !(__ptr_0 + 0)

def graphene_simd4f_splat_x(s : Ptr[graphene_simd4f_t])(__return : Ptr[graphene_simd4f_t]): Unit =
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_splat_x(s, __return)

def graphene_simd4f_splat_y(s : Ptr[graphene_simd4f_t])(using Zone): graphene_simd4f_t =
  val __ptr_0: Ptr[graphene_simd4f_t] = _root_.scala.scalanative.unsafe.alloc[graphene_simd4f_t](1)
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_splat_y(s, (__ptr_0 + 0))
  !(__ptr_0 + 0)

def graphene_simd4f_splat_y(s : graphene_simd4f_t)(using Zone): graphene_simd4f_t =
  val __ptr_0: Ptr[graphene_simd4f_t] = _root_.scala.scalanative.unsafe.alloc[graphene_simd4f_t](2)
  !(__ptr_0 + 0) = s
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_splat_y((__ptr_0 + 0), (__ptr_0 + 1))
  !(__ptr_0 + 1)

def graphene_simd4f_splat_y(s : Ptr[graphene_simd4f_t])(__return : Ptr[graphene_simd4f_t]): Unit =
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_splat_y(s, __return)

def graphene_simd4f_splat_z(s : Ptr[graphene_simd4f_t])(__return : Ptr[graphene_simd4f_t]): Unit =
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_splat_z(s, __return)

def graphene_simd4f_splat_z(s : graphene_simd4f_t)(using Zone): graphene_simd4f_t =
  val __ptr_0: Ptr[graphene_simd4f_t] = _root_.scala.scalanative.unsafe.alloc[graphene_simd4f_t](2)
  !(__ptr_0 + 0) = s
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_splat_z((__ptr_0 + 0), (__ptr_0 + 1))
  !(__ptr_0 + 1)

def graphene_simd4f_splat_z(s : Ptr[graphene_simd4f_t])(using Zone): graphene_simd4f_t =
  val __ptr_0: Ptr[graphene_simd4f_t] = _root_.scala.scalanative.unsafe.alloc[graphene_simd4f_t](1)
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_splat_z(s, (__ptr_0 + 0))
  !(__ptr_0 + 0)

def graphene_simd4f_sqrt(s : graphene_simd4f_t)(using Zone): graphene_simd4f_t =
  val __ptr_0: Ptr[graphene_simd4f_t] = _root_.scala.scalanative.unsafe.alloc[graphene_simd4f_t](2)
  !(__ptr_0 + 0) = s
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_sqrt((__ptr_0 + 0), (__ptr_0 + 1))
  !(__ptr_0 + 1)

def graphene_simd4f_sqrt(s : Ptr[graphene_simd4f_t])(using Zone): graphene_simd4f_t =
  val __ptr_0: Ptr[graphene_simd4f_t] = _root_.scala.scalanative.unsafe.alloc[graphene_simd4f_t](1)
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_sqrt(s, (__ptr_0 + 0))
  !(__ptr_0 + 0)

def graphene_simd4f_sqrt(s : Ptr[graphene_simd4f_t])(__return : Ptr[graphene_simd4f_t]): Unit =
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_sqrt(s, __return)

def graphene_simd4f_sub(a : Ptr[graphene_simd4f_t], b : Ptr[graphene_simd4f_t])(__return : Ptr[graphene_simd4f_t]): Unit =
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_sub(a, b, __return)

def graphene_simd4f_sub(a : graphene_simd4f_t, b : graphene_simd4f_t)(using Zone): graphene_simd4f_t =
  val __ptr_0: Ptr[graphene_simd4f_t] = _root_.scala.scalanative.unsafe.alloc[graphene_simd4f_t](3)
  !(__ptr_0 + 0) = a
  !(__ptr_0 + 1) = b
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_sub((__ptr_0 + 0), (__ptr_0 + 1), (__ptr_0 + 2))
  !(__ptr_0 + 2)

def graphene_simd4f_sub(a : Ptr[graphene_simd4f_t], b : Ptr[graphene_simd4f_t])(using Zone): graphene_simd4f_t =
  val __ptr_0: Ptr[graphene_simd4f_t] = _root_.scala.scalanative.unsafe.alloc[graphene_simd4f_t](1)
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_sub(a, b, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/**
 * graphene_simd4f_sum: : a #graphene_simd4f_t
*/
def graphene_simd4f_sum(v : Ptr[graphene_simd4f_t])(__return : Ptr[graphene_simd4f_t]): Unit =
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_sum(v, __return)

/**
 * graphene_simd4f_sum: : a #graphene_simd4f_t
*/
def graphene_simd4f_sum(v : graphene_simd4f_t)(using Zone): graphene_simd4f_t =
  val __ptr_0: Ptr[graphene_simd4f_t] = _root_.scala.scalanative.unsafe.alloc[graphene_simd4f_t](2)
  !(__ptr_0 + 0) = v
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_sum((__ptr_0 + 0), (__ptr_0 + 1))
  !(__ptr_0 + 1)

/**
 * graphene_simd4f_sum: : a #graphene_simd4f_t
*/
def graphene_simd4f_sum(v : Ptr[graphene_simd4f_t])(using Zone): graphene_simd4f_t =
  val __ptr_0: Ptr[graphene_simd4f_t] = _root_.scala.scalanative.unsafe.alloc[graphene_simd4f_t](1)
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_sum(v, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/**
 * graphene_simd4f_sum_scalar: : a #graphene_simd4f_t
*/
def graphene_simd4f_sum_scalar(v : graphene_simd4f_t)(using Zone): Float =
  val __ptr_0: Ptr[graphene_simd4f_t] = _root_.scala.scalanative.unsafe.alloc[graphene_simd4f_t](1)
  !(__ptr_0 + 0) = v
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_sum_scalar((__ptr_0 + 0))

/**
 * graphene_simd4f_sum_scalar: : a #graphene_simd4f_t
*/
def graphene_simd4f_sum_scalar(v : Ptr[graphene_simd4f_t]): Float =
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_sum_scalar(v)

def graphene_simd4f_zero_w(s : Ptr[graphene_simd4f_t])(using Zone): graphene_simd4f_t =
  val __ptr_0: Ptr[graphene_simd4f_t] = _root_.scala.scalanative.unsafe.alloc[graphene_simd4f_t](1)
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_zero_w(s, (__ptr_0 + 0))
  !(__ptr_0 + 0)

def graphene_simd4f_zero_w(s : graphene_simd4f_t)(using Zone): graphene_simd4f_t =
  val __ptr_0: Ptr[graphene_simd4f_t] = _root_.scala.scalanative.unsafe.alloc[graphene_simd4f_t](2)
  !(__ptr_0 + 0) = s
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_zero_w((__ptr_0 + 0), (__ptr_0 + 1))
  !(__ptr_0 + 1)

def graphene_simd4f_zero_w(s : Ptr[graphene_simd4f_t])(__return : Ptr[graphene_simd4f_t]): Unit =
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_zero_w(s, __return)

def graphene_simd4f_zero_zw(s : graphene_simd4f_t)(using Zone): graphene_simd4f_t =
  val __ptr_0: Ptr[graphene_simd4f_t] = _root_.scala.scalanative.unsafe.alloc[graphene_simd4f_t](2)
  !(__ptr_0 + 0) = s
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_zero_zw((__ptr_0 + 0), (__ptr_0 + 1))
  !(__ptr_0 + 1)

def graphene_simd4f_zero_zw(s : Ptr[graphene_simd4f_t])(using Zone): graphene_simd4f_t =
  val __ptr_0: Ptr[graphene_simd4f_t] = _root_.scala.scalanative.unsafe.alloc[graphene_simd4f_t](1)
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_zero_zw(s, (__ptr_0 + 0))
  !(__ptr_0 + 0)

def graphene_simd4f_zero_zw(s : Ptr[graphene_simd4f_t])(__return : Ptr[graphene_simd4f_t]): Unit =
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_zero_zw(s, __return)

/**
 * graphene_simd4x4f_init: : a #graphene_simd4f_t for the first row : a #graphene_simd4f_t for the second row : a #graphene_simd4f_t for the third row : a #graphene_simd4f_t for the fourth row
*/
def graphene_simd4x4f_init(x : Ptr[graphene_simd4f_t], y : Ptr[graphene_simd4f_t], z : Ptr[graphene_simd4f_t], w : Ptr[graphene_simd4f_t])(__return : Ptr[graphene_simd4x4f_t]): Unit =
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4x4f_init(x, y, z, w, __return)

/**
 * graphene_simd4x4f_init: : a #graphene_simd4f_t for the first row : a #graphene_simd4f_t for the second row : a #graphene_simd4f_t for the third row : a #graphene_simd4f_t for the fourth row
*/
def graphene_simd4x4f_init(x : Ptr[graphene_simd4f_t], y : Ptr[graphene_simd4f_t], z : Ptr[graphene_simd4f_t], w : Ptr[graphene_simd4f_t])(using Zone): graphene_simd4x4f_t =
  val __ptr_0: Ptr[graphene_simd4x4f_t] = _root_.scala.scalanative.unsafe.alloc[graphene_simd4x4f_t](1)
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4x4f_init(x, y, z, w, (__ptr_0 + 0))
  !(__ptr_0 + 0)

/**
 * graphene_simd4x4f_init: : a #graphene_simd4f_t for the first row : a #graphene_simd4f_t for the second row : a #graphene_simd4f_t for the third row : a #graphene_simd4f_t for the fourth row
*/
def graphene_simd4x4f_init(x : graphene_simd4f_t, y : graphene_simd4f_t, z : graphene_simd4f_t, w : graphene_simd4f_t)(using Zone): graphene_simd4x4f_t =
  val __ptr_0: Ptr[graphene_simd4f_t] = _root_.scala.scalanative.unsafe.alloc[graphene_simd4f_t](4)
  val __ptr_1: Ptr[graphene_simd4x4f_t] = _root_.scala.scalanative.unsafe.alloc[graphene_simd4x4f_t](1)
  !(__ptr_0 + 0) = x
  !(__ptr_0 + 1) = y
  !(__ptr_0 + 2) = z
  !(__ptr_0 + 3) = w
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4x4f_init((__ptr_0 + 0), (__ptr_0 + 1), (__ptr_0 + 2), (__ptr_0 + 3), (__ptr_1 + 0))
  !(__ptr_1 + 0)

/**
 * graphene_simd4x4f_init_look_at: : a #graphene_simd4x4f_t : vector for the camera coordinates : vector for the object coordinates : vector for the upwards direction
*/
def graphene_simd4x4f_init_look_at(m : Ptr[graphene_simd4x4f_t], eye : graphene_simd4f_t, center : graphene_simd4f_t, up : graphene_simd4f_t)(using Zone): Unit =
  val __ptr_0: Ptr[graphene_simd4f_t] = _root_.scala.scalanative.unsafe.alloc[graphene_simd4f_t](3)
  !(__ptr_0 + 0) = eye
  !(__ptr_0 + 1) = center
  !(__ptr_0 + 2) = up
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4x4f_init_look_at(m, (__ptr_0 + 0), (__ptr_0 + 1), (__ptr_0 + 2))

/**
 * graphene_simd4x4f_init_look_at: : a #graphene_simd4x4f_t : vector for the camera coordinates : vector for the object coordinates : vector for the upwards direction
*/
def graphene_simd4x4f_init_look_at(m : Ptr[graphene_simd4x4f_t], eye : Ptr[graphene_simd4f_t], center : Ptr[graphene_simd4f_t], up : Ptr[graphene_simd4f_t]): Unit =
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4x4f_init_look_at(m, eye, center, up)

/**
 * graphene_simd4x4f_rotation: : a #graphene_simd4x4f_t : the rotation, in radians : the vector of the axis of rotation
*/
def graphene_simd4x4f_rotation(m : Ptr[graphene_simd4x4f_t], rad : Float, axis : graphene_simd4f_t)(using Zone): Unit =
  val __ptr_0: Ptr[graphene_simd4f_t] = _root_.scala.scalanative.unsafe.alloc[graphene_simd4f_t](1)
  !(__ptr_0 + 0) = axis
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4x4f_rotation(m, rad, (__ptr_0 + 0))

/**
 * graphene_simd4x4f_rotation: : a #graphene_simd4x4f_t : the rotation, in radians : the vector of the axis of rotation
*/
def graphene_simd4x4f_rotation(m : Ptr[graphene_simd4x4f_t], rad : Float, axis : Ptr[graphene_simd4f_t]): Unit =
  __sn_wrap_sn_gnome_graphene_internal_graphene_simd4x4f_rotation(m, rad, axis)