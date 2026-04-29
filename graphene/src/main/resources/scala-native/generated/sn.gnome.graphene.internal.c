// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

#include <string.h>
#include "graphene.h"

void __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_add(const graphene_simd4f_t *a, const graphene_simd4f_t *b, graphene_simd4f_t *____return) {
  graphene_simd4f_t ____ret = graphene_simd4f_add(*a, *b);
  memcpy(____return, &____ret, sizeof(graphene_simd4f_t));
}


void __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_clamp(const graphene_simd4f_t *v, const graphene_simd4f_t *min, const graphene_simd4f_t *max, graphene_simd4f_t *____return) {
  graphene_simd4f_t ____ret = graphene_simd4f_clamp(*v, *min, *max);
  memcpy(____return, &____ret, sizeof(graphene_simd4f_t));
}


void __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_clamp_scalar(const graphene_simd4f_t *v, float min, float max, graphene_simd4f_t *____return) {
  graphene_simd4f_t ____ret = graphene_simd4f_clamp_scalar(*v, min, max);
  memcpy(____return, &____ret, sizeof(graphene_simd4f_t));
}


_Bool __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_cmp_eq(const graphene_simd4f_t *a, const graphene_simd4f_t *b) {
 return graphene_simd4f_cmp_eq(*a, *b);
};


_Bool __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_cmp_ge(const graphene_simd4f_t *a, const graphene_simd4f_t *b) {
 return graphene_simd4f_cmp_ge(*a, *b);
};


_Bool __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_cmp_gt(const graphene_simd4f_t *a, const graphene_simd4f_t *b) {
 return graphene_simd4f_cmp_gt(*a, *b);
};


_Bool __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_cmp_le(const graphene_simd4f_t *a, const graphene_simd4f_t *b) {
 return graphene_simd4f_cmp_le(*a, *b);
};


_Bool __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_cmp_lt(const graphene_simd4f_t *a, const graphene_simd4f_t *b) {
 return graphene_simd4f_cmp_lt(*a, *b);
};


_Bool __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_cmp_neq(const graphene_simd4f_t *a, const graphene_simd4f_t *b) {
 return graphene_simd4f_cmp_neq(*a, *b);
};


void __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_cross3(const graphene_simd4f_t *a, const graphene_simd4f_t *b, graphene_simd4f_t *____return) {
  graphene_simd4f_t ____ret = graphene_simd4f_cross3(*a, *b);
  memcpy(____return, &____ret, sizeof(graphene_simd4f_t));
}


void __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_div(const graphene_simd4f_t *a, const graphene_simd4f_t *b, graphene_simd4f_t *____return) {
  graphene_simd4f_t ____ret = graphene_simd4f_div(*a, *b);
  memcpy(____return, &____ret, sizeof(graphene_simd4f_t));
}


void __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_dot2(const graphene_simd4f_t *a, const graphene_simd4f_t *b, graphene_simd4f_t *____return) {
  graphene_simd4f_t ____ret = graphene_simd4f_dot2(*a, *b);
  memcpy(____return, &____ret, sizeof(graphene_simd4f_t));
}


void __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_dot3(const graphene_simd4f_t *a, const graphene_simd4f_t *b, graphene_simd4f_t *____return) {
  graphene_simd4f_t ____ret = graphene_simd4f_dot3(*a, *b);
  memcpy(____return, &____ret, sizeof(graphene_simd4f_t));
}


float __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_dot3_scalar(const graphene_simd4f_t *a, const graphene_simd4f_t *b) {
 return graphene_simd4f_dot3_scalar(*a, *b);
};


void __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_dot4(const graphene_simd4f_t *a, const graphene_simd4f_t *b, graphene_simd4f_t *____return) {
  graphene_simd4f_t ____ret = graphene_simd4f_dot4(*a, *b);
  memcpy(____return, &____ret, sizeof(graphene_simd4f_t));
}


void __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_dup_2f(const graphene_simd4f_t *s, float * v) {
 graphene_simd4f_dup_2f(*s, v);
};


void __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_dup_3f(const graphene_simd4f_t *s, float * v) {
 graphene_simd4f_dup_3f(*s, v);
};


void __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_dup_4f(const graphene_simd4f_t *s, float * v) {
 graphene_simd4f_dup_4f(*s, v);
};


void __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_flip_sign_0101(const graphene_simd4f_t *s, graphene_simd4f_t *____return) {
  graphene_simd4f_t ____ret = graphene_simd4f_flip_sign_0101(*s);
  memcpy(____return, &____ret, sizeof(graphene_simd4f_t));
}


void __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_flip_sign_1010(const graphene_simd4f_t *s, graphene_simd4f_t *____return) {
  graphene_simd4f_t ____ret = graphene_simd4f_flip_sign_1010(*s);
  memcpy(____return, &____ret, sizeof(graphene_simd4f_t));
}


float __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_get_w(const graphene_simd4f_t *s) {
 return graphene_simd4f_get_w(*s);
};


float __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_get_x(const graphene_simd4f_t *s) {
 return graphene_simd4f_get_x(*s);
};


float __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_get_y(const graphene_simd4f_t *s) {
 return graphene_simd4f_get_y(*s);
};


float __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_get_z(const graphene_simd4f_t *s) {
 return graphene_simd4f_get_z(*s);
};


void __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_init(float x, float y, float z, float w, graphene_simd4f_t *____return) {
  graphene_simd4f_t ____ret = graphene_simd4f_init(x, y, z, w);
  memcpy(____return, &____ret, sizeof(graphene_simd4f_t));
}


void __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_init_2f(const float * v, graphene_simd4f_t *____return) {
  graphene_simd4f_t ____ret = graphene_simd4f_init_2f(v);
  memcpy(____return, &____ret, sizeof(graphene_simd4f_t));
}


void __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_init_3f(const float * v, graphene_simd4f_t *____return) {
  graphene_simd4f_t ____ret = graphene_simd4f_init_3f(v);
  memcpy(____return, &____ret, sizeof(graphene_simd4f_t));
}


void __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_init_4f(const float * v, graphene_simd4f_t *____return) {
  graphene_simd4f_t ____ret = graphene_simd4f_init_4f(v);
  memcpy(____return, &____ret, sizeof(graphene_simd4f_t));
}


void __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_init_zero(graphene_simd4f_t *____return) {
  graphene_simd4f_t ____ret = graphene_simd4f_init_zero();
  memcpy(____return, &____ret, sizeof(graphene_simd4f_t));
}


void __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_interpolate(const graphene_simd4f_t *a, const graphene_simd4f_t *b, float f, graphene_simd4f_t *____return) {
  graphene_simd4f_t ____ret = graphene_simd4f_interpolate(*a, *b, f);
  memcpy(____return, &____ret, sizeof(graphene_simd4f_t));
}


_Bool __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_is_zero2(const graphene_simd4f_t *v) {
 return graphene_simd4f_is_zero2(*v);
};


_Bool __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_is_zero3(const graphene_simd4f_t *v) {
 return graphene_simd4f_is_zero3(*v);
};


_Bool __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_is_zero4(const graphene_simd4f_t *v) {
 return graphene_simd4f_is_zero4(*v);
};


void __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_length2(const graphene_simd4f_t *v, graphene_simd4f_t *____return) {
  graphene_simd4f_t ____ret = graphene_simd4f_length2(*v);
  memcpy(____return, &____ret, sizeof(graphene_simd4f_t));
}


void __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_length3(const graphene_simd4f_t *v, graphene_simd4f_t *____return) {
  graphene_simd4f_t ____ret = graphene_simd4f_length3(*v);
  memcpy(____return, &____ret, sizeof(graphene_simd4f_t));
}


void __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_length4(const graphene_simd4f_t *v, graphene_simd4f_t *____return) {
  graphene_simd4f_t ____ret = graphene_simd4f_length4(*v);
  memcpy(____return, &____ret, sizeof(graphene_simd4f_t));
}


void __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_madd(const graphene_simd4f_t *m1, const graphene_simd4f_t *m2, const graphene_simd4f_t *a, graphene_simd4f_t *____return) {
  graphene_simd4f_t ____ret = graphene_simd4f_madd(*m1, *m2, *a);
  memcpy(____return, &____ret, sizeof(graphene_simd4f_t));
}


void __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_max(const graphene_simd4f_t *a, const graphene_simd4f_t *b, graphene_simd4f_t *____return) {
  graphene_simd4f_t ____ret = graphene_simd4f_max(*a, *b);
  memcpy(____return, &____ret, sizeof(graphene_simd4f_t));
}


void __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_max_val(const graphene_simd4f_t *v, graphene_simd4f_t *____return) {
  graphene_simd4f_t ____ret = graphene_simd4f_max_val(*v);
  memcpy(____return, &____ret, sizeof(graphene_simd4f_t));
}


void __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_merge_high(const graphene_simd4f_t *a, const graphene_simd4f_t *b, graphene_simd4f_t *____return) {
  graphene_simd4f_t ____ret = graphene_simd4f_merge_high(*a, *b);
  memcpy(____return, &____ret, sizeof(graphene_simd4f_t));
}


void __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_merge_low(const graphene_simd4f_t *a, const graphene_simd4f_t *b, graphene_simd4f_t *____return) {
  graphene_simd4f_t ____ret = graphene_simd4f_merge_low(*a, *b);
  memcpy(____return, &____ret, sizeof(graphene_simd4f_t));
}


void __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_merge_w(const graphene_simd4f_t *s, float v, graphene_simd4f_t *____return) {
  graphene_simd4f_t ____ret = graphene_simd4f_merge_w(*s, v);
  memcpy(____return, &____ret, sizeof(graphene_simd4f_t));
}


void __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_min(const graphene_simd4f_t *a, const graphene_simd4f_t *b, graphene_simd4f_t *____return) {
  graphene_simd4f_t ____ret = graphene_simd4f_min(*a, *b);
  memcpy(____return, &____ret, sizeof(graphene_simd4f_t));
}


void __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_min_val(const graphene_simd4f_t *v, graphene_simd4f_t *____return) {
  graphene_simd4f_t ____ret = graphene_simd4f_min_val(*v);
  memcpy(____return, &____ret, sizeof(graphene_simd4f_t));
}


void __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_mul(const graphene_simd4f_t *a, const graphene_simd4f_t *b, graphene_simd4f_t *____return) {
  graphene_simd4f_t ____ret = graphene_simd4f_mul(*a, *b);
  memcpy(____return, &____ret, sizeof(graphene_simd4f_t));
}


void __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_neg(const graphene_simd4f_t *s, graphene_simd4f_t *____return) {
  graphene_simd4f_t ____ret = graphene_simd4f_neg(*s);
  memcpy(____return, &____ret, sizeof(graphene_simd4f_t));
}


void __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_normalize2(const graphene_simd4f_t *v, graphene_simd4f_t *____return) {
  graphene_simd4f_t ____ret = graphene_simd4f_normalize2(*v);
  memcpy(____return, &____ret, sizeof(graphene_simd4f_t));
}


void __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_normalize3(const graphene_simd4f_t *v, graphene_simd4f_t *____return) {
  graphene_simd4f_t ____ret = graphene_simd4f_normalize3(*v);
  memcpy(____return, &____ret, sizeof(graphene_simd4f_t));
}


void __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_normalize4(const graphene_simd4f_t *v, graphene_simd4f_t *____return) {
  graphene_simd4f_t ____ret = graphene_simd4f_normalize4(*v);
  memcpy(____return, &____ret, sizeof(graphene_simd4f_t));
}


void __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_reciprocal(const graphene_simd4f_t *s, graphene_simd4f_t *____return) {
  graphene_simd4f_t ____ret = graphene_simd4f_reciprocal(*s);
  memcpy(____return, &____ret, sizeof(graphene_simd4f_t));
}


void __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_rsqrt(const graphene_simd4f_t *s, graphene_simd4f_t *____return) {
  graphene_simd4f_t ____ret = graphene_simd4f_rsqrt(*s);
  memcpy(____return, &____ret, sizeof(graphene_simd4f_t));
}


void __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_shuffle_wxyz(const graphene_simd4f_t *s, graphene_simd4f_t *____return) {
  graphene_simd4f_t ____ret = graphene_simd4f_shuffle_wxyz(*s);
  memcpy(____return, &____ret, sizeof(graphene_simd4f_t));
}


void __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_shuffle_yzwx(const graphene_simd4f_t *s, graphene_simd4f_t *____return) {
  graphene_simd4f_t ____ret = graphene_simd4f_shuffle_yzwx(*s);
  memcpy(____return, &____ret, sizeof(graphene_simd4f_t));
}


void __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_shuffle_zwxy(const graphene_simd4f_t *s, graphene_simd4f_t *____return) {
  graphene_simd4f_t ____ret = graphene_simd4f_shuffle_zwxy(*s);
  memcpy(____return, &____ret, sizeof(graphene_simd4f_t));
}


void __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_splat(float v, graphene_simd4f_t *____return) {
  graphene_simd4f_t ____ret = graphene_simd4f_splat(v);
  memcpy(____return, &____ret, sizeof(graphene_simd4f_t));
}


void __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_splat_w(const graphene_simd4f_t *s, graphene_simd4f_t *____return) {
  graphene_simd4f_t ____ret = graphene_simd4f_splat_w(*s);
  memcpy(____return, &____ret, sizeof(graphene_simd4f_t));
}


void __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_splat_x(const graphene_simd4f_t *s, graphene_simd4f_t *____return) {
  graphene_simd4f_t ____ret = graphene_simd4f_splat_x(*s);
  memcpy(____return, &____ret, sizeof(graphene_simd4f_t));
}


void __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_splat_y(const graphene_simd4f_t *s, graphene_simd4f_t *____return) {
  graphene_simd4f_t ____ret = graphene_simd4f_splat_y(*s);
  memcpy(____return, &____ret, sizeof(graphene_simd4f_t));
}


void __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_splat_z(const graphene_simd4f_t *s, graphene_simd4f_t *____return) {
  graphene_simd4f_t ____ret = graphene_simd4f_splat_z(*s);
  memcpy(____return, &____ret, sizeof(graphene_simd4f_t));
}


void __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_sqrt(const graphene_simd4f_t *s, graphene_simd4f_t *____return) {
  graphene_simd4f_t ____ret = graphene_simd4f_sqrt(*s);
  memcpy(____return, &____ret, sizeof(graphene_simd4f_t));
}


void __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_sub(const graphene_simd4f_t *a, const graphene_simd4f_t *b, graphene_simd4f_t *____return) {
  graphene_simd4f_t ____ret = graphene_simd4f_sub(*a, *b);
  memcpy(____return, &____ret, sizeof(graphene_simd4f_t));
}


void __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_sum(const graphene_simd4f_t *v, graphene_simd4f_t *____return) {
  graphene_simd4f_t ____ret = graphene_simd4f_sum(*v);
  memcpy(____return, &____ret, sizeof(graphene_simd4f_t));
}


float __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_sum_scalar(const graphene_simd4f_t *v) {
 return graphene_simd4f_sum_scalar(*v);
};


void __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_zero_w(const graphene_simd4f_t *s, graphene_simd4f_t *____return) {
  graphene_simd4f_t ____ret = graphene_simd4f_zero_w(*s);
  memcpy(____return, &____ret, sizeof(graphene_simd4f_t));
}


void __sn_wrap_sn_gnome_graphene_internal_graphene_simd4f_zero_zw(const graphene_simd4f_t *s, graphene_simd4f_t *____return) {
  graphene_simd4f_t ____ret = graphene_simd4f_zero_zw(*s);
  memcpy(____return, &____ret, sizeof(graphene_simd4f_t));
}


void __sn_wrap_sn_gnome_graphene_internal_graphene_simd4x4f_init(graphene_simd4f_t *x, graphene_simd4f_t *y, graphene_simd4f_t *z, graphene_simd4f_t *w, graphene_simd4x4f_t *____return) {
  graphene_simd4x4f_t ____ret = graphene_simd4x4f_init(*x, *y, *z, *w);
  memcpy(____return, &____ret, sizeof(graphene_simd4x4f_t));
}


void __sn_wrap_sn_gnome_graphene_internal_graphene_simd4x4f_init_look_at(graphene_simd4x4f_t * m, graphene_simd4f_t *eye, graphene_simd4f_t *center, graphene_simd4f_t *up) {
 graphene_simd4x4f_init_look_at(m, *eye, *center, *up);
};


void __sn_wrap_sn_gnome_graphene_internal_graphene_simd4x4f_rotation(graphene_simd4x4f_t * m, float rad, graphene_simd4f_t *axis) {
 graphene_simd4x4f_rotation(m, rad, *axis);
};