package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gparam.h
*/
@extern def _g_param_type_register_static_constant(name : Ptr[_root_.sn.gnome.glib.internal.gchar], pspec_info : Ptr[GParamSpecTypeInfo], opt_type : GType): GType = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gsignal.h
*/
@extern def _g_signals_destroy(itype : GType): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/glib-types.h
*/
@extern def g_array_get_type(): GType = extern

/**
 * g_assert_finalize_object: (skip) : (transfer full) (type GObject.Object): an object

 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject.h
*/
@extern def g_assert_finalize_object(`object` : Ptr[GObject]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gbinding.h
*/
@extern def g_binding_dup_source(binding : Ptr[GBinding]): Ptr[GObject] = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gbinding.h
*/
@extern def g_binding_dup_target(binding : Ptr[GBinding]): Ptr[GObject] = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gbinding.h
*/
@extern def g_binding_flags_get_type(): GType = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gbinding.h
*/
@extern def g_binding_get_flags(binding : Ptr[GBinding]): GBindingFlags = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gbinding.h
*/
@extern def g_binding_get_source(binding : Ptr[GBinding]): Ptr[GObject] = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gbinding.h
*/
@extern def g_binding_get_source_property(binding : Ptr[GBinding]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gbinding.h
*/
@extern def g_binding_get_target(binding : Ptr[GBinding]): Ptr[GObject] = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gbinding.h
*/
@extern def g_binding_get_target_property(binding : Ptr[GBinding]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gbinding.h
*/
@extern def g_binding_get_type(): GType = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gbindinggroup.h
*/
@extern def g_binding_group_bind(self : Ptr[GBindingGroup], source_property : Ptr[_root_.sn.gnome.glib.internal.gchar], target : _root_.sn.gnome.glib.internal.gpointer, target_property : Ptr[_root_.sn.gnome.glib.internal.gchar], flags : GBindingFlags): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gbindinggroup.h
*/
@extern def g_binding_group_bind_full(self : Ptr[GBindingGroup], source_property : Ptr[_root_.sn.gnome.glib.internal.gchar], target : _root_.sn.gnome.glib.internal.gpointer, target_property : Ptr[_root_.sn.gnome.glib.internal.gchar], flags : GBindingFlags, transform_to : GBindingTransformFunc, transform_from : GBindingTransformFunc, user_data : _root_.sn.gnome.glib.internal.gpointer, user_data_destroy : _root_.sn.gnome.glib.internal.GDestroyNotify): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gbindinggroup.h
*/
@extern def g_binding_group_bind_with_closures(self : Ptr[GBindingGroup], source_property : Ptr[_root_.sn.gnome.glib.internal.gchar], target : _root_.sn.gnome.glib.internal.gpointer, target_property : Ptr[_root_.sn.gnome.glib.internal.gchar], flags : GBindingFlags, transform_to : Ptr[GClosure], transform_from : Ptr[GClosure]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gbindinggroup.h
*/
@extern def g_binding_group_dup_source(self : Ptr[GBindingGroup]): _root_.sn.gnome.glib.internal.gpointer = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gbindinggroup.h
*/
@extern def g_binding_group_get_type(): GType = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gbindinggroup.h
*/
@extern def g_binding_group_new(): Ptr[GBindingGroup] = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gbindinggroup.h
*/
@extern def g_binding_group_set_source(self : Ptr[GBindingGroup], source : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gbinding.h
*/
@extern def g_binding_unbind(binding : Ptr[GBinding]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/glib-types.h
*/
@extern def g_bookmark_file_get_type(): GType = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gboxed.h
*/
@extern def g_boxed_copy(boxed_type : GType, src_boxed : _root_.sn.gnome.glib.internal.gconstpointer): _root_.sn.gnome.glib.internal.gpointer = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gboxed.h
*/
@extern def g_boxed_free(boxed_type : GType, boxed : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gboxed.h
*/
@extern def g_boxed_type_register_static(name : Ptr[_root_.sn.gnome.glib.internal.gchar], boxed_copy : GBoxedCopyFunc, boxed_free : GBoxedFreeFunc): GType = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/glib-types.h
*/
@extern def g_byte_array_get_type(): GType = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/glib-types.h
*/
@extern def g_bytes_get_type(): GType = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gmarshal.h
*/
@extern def g_cclosure_marshal_BOOLEAN__BOXED_BOXED(closure : Ptr[GClosure], return_value : Ptr[GValue], n_param_values : _root_.sn.gnome.glib.internal.guint, param_values : Ptr[GValue], invocation_hint : _root_.sn.gnome.glib.internal.gpointer, marshal_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gmarshal.h
*/
@extern def g_cclosure_marshal_BOOLEAN__BOXED_BOXEDv(closure : Ptr[GClosure], return_value : Ptr[GValue], instance : _root_.sn.gnome.glib.internal.gpointer, args : va_list, marshal_data : _root_.sn.gnome.glib.internal.gpointer, n_params : CInt, param_types : Ptr[GType]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gmarshal.h
*/
@extern def g_cclosure_marshal_BOOLEAN__FLAGS(closure : Ptr[GClosure], return_value : Ptr[GValue], n_param_values : _root_.sn.gnome.glib.internal.guint, param_values : Ptr[GValue], invocation_hint : _root_.sn.gnome.glib.internal.gpointer, marshal_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gmarshal.h
*/
@extern def g_cclosure_marshal_BOOLEAN__FLAGSv(closure : Ptr[GClosure], return_value : Ptr[GValue], instance : _root_.sn.gnome.glib.internal.gpointer, args : va_list, marshal_data : _root_.sn.gnome.glib.internal.gpointer, n_params : CInt, param_types : Ptr[GType]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gmarshal.h
*/
@extern def g_cclosure_marshal_STRING__OBJECT_POINTER(closure : Ptr[GClosure], return_value : Ptr[GValue], n_param_values : _root_.sn.gnome.glib.internal.guint, param_values : Ptr[GValue], invocation_hint : _root_.sn.gnome.glib.internal.gpointer, marshal_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gmarshal.h
*/
@extern def g_cclosure_marshal_STRING__OBJECT_POINTERv(closure : Ptr[GClosure], return_value : Ptr[GValue], instance : _root_.sn.gnome.glib.internal.gpointer, args : va_list, marshal_data : _root_.sn.gnome.glib.internal.gpointer, n_params : CInt, param_types : Ptr[GType]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gmarshal.h
*/
@extern def g_cclosure_marshal_VOID__BOOLEAN(closure : Ptr[GClosure], return_value : Ptr[GValue], n_param_values : _root_.sn.gnome.glib.internal.guint, param_values : Ptr[GValue], invocation_hint : _root_.sn.gnome.glib.internal.gpointer, marshal_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gmarshal.h
*/
@extern def g_cclosure_marshal_VOID__BOOLEANv(closure : Ptr[GClosure], return_value : Ptr[GValue], instance : _root_.sn.gnome.glib.internal.gpointer, args : va_list, marshal_data : _root_.sn.gnome.glib.internal.gpointer, n_params : CInt, param_types : Ptr[GType]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gmarshal.h
*/
@extern def g_cclosure_marshal_VOID__BOXED(closure : Ptr[GClosure], return_value : Ptr[GValue], n_param_values : _root_.sn.gnome.glib.internal.guint, param_values : Ptr[GValue], invocation_hint : _root_.sn.gnome.glib.internal.gpointer, marshal_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gmarshal.h
*/
@extern def g_cclosure_marshal_VOID__BOXEDv(closure : Ptr[GClosure], return_value : Ptr[GValue], instance : _root_.sn.gnome.glib.internal.gpointer, args : va_list, marshal_data : _root_.sn.gnome.glib.internal.gpointer, n_params : CInt, param_types : Ptr[GType]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gmarshal.h
*/
@extern def g_cclosure_marshal_VOID__CHAR(closure : Ptr[GClosure], return_value : Ptr[GValue], n_param_values : _root_.sn.gnome.glib.internal.guint, param_values : Ptr[GValue], invocation_hint : _root_.sn.gnome.glib.internal.gpointer, marshal_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gmarshal.h
*/
@extern def g_cclosure_marshal_VOID__CHARv(closure : Ptr[GClosure], return_value : Ptr[GValue], instance : _root_.sn.gnome.glib.internal.gpointer, args : va_list, marshal_data : _root_.sn.gnome.glib.internal.gpointer, n_params : CInt, param_types : Ptr[GType]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gmarshal.h
*/
@extern def g_cclosure_marshal_VOID__DOUBLE(closure : Ptr[GClosure], return_value : Ptr[GValue], n_param_values : _root_.sn.gnome.glib.internal.guint, param_values : Ptr[GValue], invocation_hint : _root_.sn.gnome.glib.internal.gpointer, marshal_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gmarshal.h
*/
@extern def g_cclosure_marshal_VOID__DOUBLEv(closure : Ptr[GClosure], return_value : Ptr[GValue], instance : _root_.sn.gnome.glib.internal.gpointer, args : va_list, marshal_data : _root_.sn.gnome.glib.internal.gpointer, n_params : CInt, param_types : Ptr[GType]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gmarshal.h
*/
@extern def g_cclosure_marshal_VOID__ENUM(closure : Ptr[GClosure], return_value : Ptr[GValue], n_param_values : _root_.sn.gnome.glib.internal.guint, param_values : Ptr[GValue], invocation_hint : _root_.sn.gnome.glib.internal.gpointer, marshal_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gmarshal.h
*/
@extern def g_cclosure_marshal_VOID__ENUMv(closure : Ptr[GClosure], return_value : Ptr[GValue], instance : _root_.sn.gnome.glib.internal.gpointer, args : va_list, marshal_data : _root_.sn.gnome.glib.internal.gpointer, n_params : CInt, param_types : Ptr[GType]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gmarshal.h
*/
@extern def g_cclosure_marshal_VOID__FLAGS(closure : Ptr[GClosure], return_value : Ptr[GValue], n_param_values : _root_.sn.gnome.glib.internal.guint, param_values : Ptr[GValue], invocation_hint : _root_.sn.gnome.glib.internal.gpointer, marshal_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gmarshal.h
*/
@extern def g_cclosure_marshal_VOID__FLAGSv(closure : Ptr[GClosure], return_value : Ptr[GValue], instance : _root_.sn.gnome.glib.internal.gpointer, args : va_list, marshal_data : _root_.sn.gnome.glib.internal.gpointer, n_params : CInt, param_types : Ptr[GType]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gmarshal.h
*/
@extern def g_cclosure_marshal_VOID__FLOAT(closure : Ptr[GClosure], return_value : Ptr[GValue], n_param_values : _root_.sn.gnome.glib.internal.guint, param_values : Ptr[GValue], invocation_hint : _root_.sn.gnome.glib.internal.gpointer, marshal_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gmarshal.h
*/
@extern def g_cclosure_marshal_VOID__FLOATv(closure : Ptr[GClosure], return_value : Ptr[GValue], instance : _root_.sn.gnome.glib.internal.gpointer, args : va_list, marshal_data : _root_.sn.gnome.glib.internal.gpointer, n_params : CInt, param_types : Ptr[GType]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gmarshal.h
*/
@extern def g_cclosure_marshal_VOID__INT(closure : Ptr[GClosure], return_value : Ptr[GValue], n_param_values : _root_.sn.gnome.glib.internal.guint, param_values : Ptr[GValue], invocation_hint : _root_.sn.gnome.glib.internal.gpointer, marshal_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gmarshal.h
*/
@extern def g_cclosure_marshal_VOID__INTv(closure : Ptr[GClosure], return_value : Ptr[GValue], instance : _root_.sn.gnome.glib.internal.gpointer, args : va_list, marshal_data : _root_.sn.gnome.glib.internal.gpointer, n_params : CInt, param_types : Ptr[GType]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gmarshal.h
*/
@extern def g_cclosure_marshal_VOID__LONG(closure : Ptr[GClosure], return_value : Ptr[GValue], n_param_values : _root_.sn.gnome.glib.internal.guint, param_values : Ptr[GValue], invocation_hint : _root_.sn.gnome.glib.internal.gpointer, marshal_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gmarshal.h
*/
@extern def g_cclosure_marshal_VOID__LONGv(closure : Ptr[GClosure], return_value : Ptr[GValue], instance : _root_.sn.gnome.glib.internal.gpointer, args : va_list, marshal_data : _root_.sn.gnome.glib.internal.gpointer, n_params : CInt, param_types : Ptr[GType]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gmarshal.h
*/
@extern def g_cclosure_marshal_VOID__OBJECT(closure : Ptr[GClosure], return_value : Ptr[GValue], n_param_values : _root_.sn.gnome.glib.internal.guint, param_values : Ptr[GValue], invocation_hint : _root_.sn.gnome.glib.internal.gpointer, marshal_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gmarshal.h
*/
@extern def g_cclosure_marshal_VOID__OBJECTv(closure : Ptr[GClosure], return_value : Ptr[GValue], instance : _root_.sn.gnome.glib.internal.gpointer, args : va_list, marshal_data : _root_.sn.gnome.glib.internal.gpointer, n_params : CInt, param_types : Ptr[GType]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gmarshal.h
*/
@extern def g_cclosure_marshal_VOID__PARAM(closure : Ptr[GClosure], return_value : Ptr[GValue], n_param_values : _root_.sn.gnome.glib.internal.guint, param_values : Ptr[GValue], invocation_hint : _root_.sn.gnome.glib.internal.gpointer, marshal_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gmarshal.h
*/
@extern def g_cclosure_marshal_VOID__PARAMv(closure : Ptr[GClosure], return_value : Ptr[GValue], instance : _root_.sn.gnome.glib.internal.gpointer, args : va_list, marshal_data : _root_.sn.gnome.glib.internal.gpointer, n_params : CInt, param_types : Ptr[GType]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gmarshal.h
*/
@extern def g_cclosure_marshal_VOID__POINTER(closure : Ptr[GClosure], return_value : Ptr[GValue], n_param_values : _root_.sn.gnome.glib.internal.guint, param_values : Ptr[GValue], invocation_hint : _root_.sn.gnome.glib.internal.gpointer, marshal_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gmarshal.h
*/
@extern def g_cclosure_marshal_VOID__POINTERv(closure : Ptr[GClosure], return_value : Ptr[GValue], instance : _root_.sn.gnome.glib.internal.gpointer, args : va_list, marshal_data : _root_.sn.gnome.glib.internal.gpointer, n_params : CInt, param_types : Ptr[GType]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gmarshal.h
*/
@extern def g_cclosure_marshal_VOID__STRING(closure : Ptr[GClosure], return_value : Ptr[GValue], n_param_values : _root_.sn.gnome.glib.internal.guint, param_values : Ptr[GValue], invocation_hint : _root_.sn.gnome.glib.internal.gpointer, marshal_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gmarshal.h
*/
@extern def g_cclosure_marshal_VOID__STRINGv(closure : Ptr[GClosure], return_value : Ptr[GValue], instance : _root_.sn.gnome.glib.internal.gpointer, args : va_list, marshal_data : _root_.sn.gnome.glib.internal.gpointer, n_params : CInt, param_types : Ptr[GType]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gmarshal.h
*/
@extern def g_cclosure_marshal_VOID__UCHAR(closure : Ptr[GClosure], return_value : Ptr[GValue], n_param_values : _root_.sn.gnome.glib.internal.guint, param_values : Ptr[GValue], invocation_hint : _root_.sn.gnome.glib.internal.gpointer, marshal_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gmarshal.h
*/
@extern def g_cclosure_marshal_VOID__UCHARv(closure : Ptr[GClosure], return_value : Ptr[GValue], instance : _root_.sn.gnome.glib.internal.gpointer, args : va_list, marshal_data : _root_.sn.gnome.glib.internal.gpointer, n_params : CInt, param_types : Ptr[GType]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gmarshal.h
*/
@extern def g_cclosure_marshal_VOID__UINT(closure : Ptr[GClosure], return_value : Ptr[GValue], n_param_values : _root_.sn.gnome.glib.internal.guint, param_values : Ptr[GValue], invocation_hint : _root_.sn.gnome.glib.internal.gpointer, marshal_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gmarshal.h
*/
@extern def g_cclosure_marshal_VOID__UINT_POINTER(closure : Ptr[GClosure], return_value : Ptr[GValue], n_param_values : _root_.sn.gnome.glib.internal.guint, param_values : Ptr[GValue], invocation_hint : _root_.sn.gnome.glib.internal.gpointer, marshal_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gmarshal.h
*/
@extern def g_cclosure_marshal_VOID__UINT_POINTERv(closure : Ptr[GClosure], return_value : Ptr[GValue], instance : _root_.sn.gnome.glib.internal.gpointer, args : va_list, marshal_data : _root_.sn.gnome.glib.internal.gpointer, n_params : CInt, param_types : Ptr[GType]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gmarshal.h
*/
@extern def g_cclosure_marshal_VOID__UINTv(closure : Ptr[GClosure], return_value : Ptr[GValue], instance : _root_.sn.gnome.glib.internal.gpointer, args : va_list, marshal_data : _root_.sn.gnome.glib.internal.gpointer, n_params : CInt, param_types : Ptr[GType]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gmarshal.h
*/
@extern def g_cclosure_marshal_VOID__ULONG(closure : Ptr[GClosure], return_value : Ptr[GValue], n_param_values : _root_.sn.gnome.glib.internal.guint, param_values : Ptr[GValue], invocation_hint : _root_.sn.gnome.glib.internal.gpointer, marshal_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gmarshal.h
*/
@extern def g_cclosure_marshal_VOID__ULONGv(closure : Ptr[GClosure], return_value : Ptr[GValue], instance : _root_.sn.gnome.glib.internal.gpointer, args : va_list, marshal_data : _root_.sn.gnome.glib.internal.gpointer, n_params : CInt, param_types : Ptr[GType]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gmarshal.h
*/
@extern def g_cclosure_marshal_VOID__VARIANT(closure : Ptr[GClosure], return_value : Ptr[GValue], n_param_values : _root_.sn.gnome.glib.internal.guint, param_values : Ptr[GValue], invocation_hint : _root_.sn.gnome.glib.internal.gpointer, marshal_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gmarshal.h
*/
@extern def g_cclosure_marshal_VOID__VARIANTv(closure : Ptr[GClosure], return_value : Ptr[GValue], instance : _root_.sn.gnome.glib.internal.gpointer, args : va_list, marshal_data : _root_.sn.gnome.glib.internal.gpointer, n_params : CInt, param_types : Ptr[GType]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gmarshal.h
*/
@extern def g_cclosure_marshal_VOID__VOID(closure : Ptr[GClosure], return_value : Ptr[GValue], n_param_values : _root_.sn.gnome.glib.internal.guint, param_values : Ptr[GValue], invocation_hint : _root_.sn.gnome.glib.internal.gpointer, marshal_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gmarshal.h
*/
@extern def g_cclosure_marshal_VOID__VOIDv(closure : Ptr[GClosure], return_value : Ptr[GValue], instance : _root_.sn.gnome.glib.internal.gpointer, args : va_list, marshal_data : _root_.sn.gnome.glib.internal.gpointer, n_params : CInt, param_types : Ptr[GType]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gclosure.h
*/
@extern def g_cclosure_marshal_generic(closure : Ptr[GClosure], return_gvalue : Ptr[GValue], n_param_values : _root_.sn.gnome.glib.internal.guint, param_values : Ptr[GValue], invocation_hint : _root_.sn.gnome.glib.internal.gpointer, marshal_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gclosure.h
*/
@extern def g_cclosure_marshal_generic_va(closure : Ptr[GClosure], return_value : Ptr[GValue], instance : _root_.sn.gnome.glib.internal.gpointer, args_list : va_list, marshal_data : _root_.sn.gnome.glib.internal.gpointer, n_params : CInt, param_types : Ptr[GType]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gclosure.h
*/
@extern def g_cclosure_new(callback_func : GCallback, user_data : _root_.sn.gnome.glib.internal.gpointer, destroy_data : GClosureNotify): Ptr[GClosure] = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject.h
*/
@extern def g_cclosure_new_object(callback_func : GCallback, `object` : Ptr[GObject]): Ptr[GClosure] = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject.h
*/
@extern def g_cclosure_new_object_swap(callback_func : GCallback, `object` : Ptr[GObject]): Ptr[GClosure] = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gclosure.h
*/
@extern def g_cclosure_new_swap(callback_func : GCallback, user_data : _root_.sn.gnome.glib.internal.gpointer, destroy_data : GClosureNotify): Ptr[GClosure] = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/glib-types.h
*/
@extern def g_checksum_get_type(): GType = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject.h
*/
@extern def g_clear_object(object_ptr : Ptr[Ptr[GObject]]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gsignal.h
*/
@extern def g_clear_signal_handler(handler_id_ptr : Ptr[_root_.sn.gnome.glib.internal.gulong], instance : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

/**
 * g_clear_weak_pointer: (skip) _pointer_location: The memory address of a pointer

 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject.h
*/
@extern def g_clear_weak_pointer(weak_pointer_location : Ptr[_root_.sn.gnome.glib.internal.gpointer]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gclosure.h
*/
@extern def g_closure_add_finalize_notifier(closure : Ptr[GClosure], notify_data : _root_.sn.gnome.glib.internal.gpointer, notify_func : GClosureNotify): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gclosure.h
*/
@extern def g_closure_add_invalidate_notifier(closure : Ptr[GClosure], notify_data : _root_.sn.gnome.glib.internal.gpointer, notify_func : GClosureNotify): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gclosure.h
*/
@extern def g_closure_add_marshal_guards(closure : Ptr[GClosure], pre_marshal_data : _root_.sn.gnome.glib.internal.gpointer, pre_marshal_notify : GClosureNotify, post_marshal_data : _root_.sn.gnome.glib.internal.gpointer, post_marshal_notify : GClosureNotify): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gboxed.h
*/
@extern def g_closure_get_type(): GType = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gclosure.h
*/
@extern def g_closure_invalidate(closure : Ptr[GClosure]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gclosure.h
*/
@extern def g_closure_invoke(closure : Ptr[GClosure], return_value : Ptr[GValue], n_param_values : _root_.sn.gnome.glib.internal.guint, param_values : Ptr[GValue], invocation_hint : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject.h
*/
@extern def g_closure_new_object(sizeof_closure : _root_.sn.gnome.glib.internal.guint, `object` : Ptr[GObject]): Ptr[GClosure] = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gclosure.h
*/
@extern def g_closure_new_simple(sizeof_closure : _root_.sn.gnome.glib.internal.guint, data : _root_.sn.gnome.glib.internal.gpointer): Ptr[GClosure] = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gclosure.h
*/
@extern def g_closure_ref(closure : Ptr[GClosure]): Ptr[GClosure] = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gclosure.h
*/
@extern def g_closure_remove_finalize_notifier(closure : Ptr[GClosure], notify_data : _root_.sn.gnome.glib.internal.gpointer, notify_func : GClosureNotify): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gclosure.h
*/
@extern def g_closure_remove_invalidate_notifier(closure : Ptr[GClosure], notify_data : _root_.sn.gnome.glib.internal.gpointer, notify_func : GClosureNotify): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gclosure.h
*/
@extern def g_closure_set_marshal(closure : Ptr[GClosure], marshal : GClosureMarshal): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gclosure.h
*/
@extern def g_closure_set_meta_marshal(closure : Ptr[GClosure], marshal_data : _root_.sn.gnome.glib.internal.gpointer, meta_marshal : GClosureMarshal): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gclosure.h
*/
@extern def g_closure_sink(closure : Ptr[GClosure]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gclosure.h
*/
@extern def g_closure_unref(closure : Ptr[GClosure]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/glib-types.h
*/
@extern def g_date_get_type(): GType = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/glib-types.h
*/
@extern def g_date_time_get_type(): GType = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/glib-types.h
*/
@extern def g_dir_get_type(): GType = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/genums.h
*/
@extern def g_enum_complete_type_info(g_enum_type : GType, info : Ptr[GTypeInfo], const_values : Ptr[GEnumValue]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/genums.h
*/
@extern def g_enum_get_value(enum_class : Ptr[GEnumClass], value : _root_.sn.gnome.glib.internal.gint): Ptr[GEnumValue] = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/genums.h
*/
@extern def g_enum_get_value_by_name(enum_class : Ptr[GEnumClass], name : Ptr[_root_.sn.gnome.glib.internal.gchar]): Ptr[GEnumValue] = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/genums.h
*/
@extern def g_enum_get_value_by_nick(enum_class : Ptr[GEnumClass], nick : Ptr[_root_.sn.gnome.glib.internal.gchar]): Ptr[GEnumValue] = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/genums.h
*/
@extern def g_enum_register_static(name : Ptr[_root_.sn.gnome.glib.internal.gchar], const_static_values : Ptr[GEnumValue]): GType = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/genums.h
*/
@extern def g_enum_to_string(g_enum_type : GType, value : _root_.sn.gnome.glib.internal.gint): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/glib-types.h
*/
@extern def g_error_get_type(): GType = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/genums.h
*/
@extern def g_flags_complete_type_info(g_flags_type : GType, info : Ptr[GTypeInfo], const_values : Ptr[GFlagsValue]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/genums.h
*/
@extern def g_flags_get_first_value(flags_class : Ptr[GFlagsClass], value : _root_.sn.gnome.glib.internal.guint): Ptr[GFlagsValue] = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/genums.h
*/
@extern def g_flags_get_value_by_name(flags_class : Ptr[GFlagsClass], name : Ptr[_root_.sn.gnome.glib.internal.gchar]): Ptr[GFlagsValue] = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/genums.h
*/
@extern def g_flags_get_value_by_nick(flags_class : Ptr[GFlagsClass], nick : Ptr[_root_.sn.gnome.glib.internal.gchar]): Ptr[GFlagsValue] = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/genums.h
*/
@extern def g_flags_register_static(name : Ptr[_root_.sn.gnome.glib.internal.gchar], const_static_values : Ptr[GFlagsValue]): GType = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/genums.h
*/
@extern def g_flags_to_string(flags_type : GType, value : _root_.sn.gnome.glib.internal.guint): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/glib-types.h
*/
@extern def g_gstring_get_type(): GType = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gvaluetypes.h
*/
@extern def g_gtype_get_type(): GType = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/glib-types.h
*/
@extern def g_hash_table_get_type(): GType = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/glib-types.h
*/
@extern def g_hmac_get_type(): GType = extern

/**
 * GInitiallyUnowned:

 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject.h
*/
@extern def g_initially_unowned_get_type(): GType = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/glib-types.h
*/
@extern def g_io_channel_get_type(): GType = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/glib-types.h
*/
@extern def g_io_condition_get_type(): GType = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/glib-types.h
*/
@extern def g_key_file_get_type(): GType = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/glib-types.h
*/
@extern def g_main_context_get_type(): GType = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/glib-types.h
*/
@extern def g_main_loop_get_type(): GType = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/glib-types.h
*/
@extern def g_mapped_file_get_type(): GType = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/glib-types.h
*/
@extern def g_markup_parse_context_get_type(): GType = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/glib-types.h
*/
@extern def g_match_info_get_type(): GType = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/glib-enumtypes.h
*/
@extern def g_normalize_mode_get_type(): GType = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject.h
*/
@extern def g_object_add_toggle_ref(`object` : Ptr[GObject], notify : GToggleNotify, data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject.h
*/
@extern def g_object_add_weak_pointer(`object` : Ptr[GObject], weak_pointer_location : Ptr[_root_.sn.gnome.glib.internal.gpointer]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gbinding.h
*/
@extern def g_object_bind_property(source : _root_.sn.gnome.glib.internal.gpointer, source_property : Ptr[_root_.sn.gnome.glib.internal.gchar], target : _root_.sn.gnome.glib.internal.gpointer, target_property : Ptr[_root_.sn.gnome.glib.internal.gchar], flags : GBindingFlags): Ptr[GBinding] = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gbinding.h
*/
@extern def g_object_bind_property_full(source : _root_.sn.gnome.glib.internal.gpointer, source_property : Ptr[_root_.sn.gnome.glib.internal.gchar], target : _root_.sn.gnome.glib.internal.gpointer, target_property : Ptr[_root_.sn.gnome.glib.internal.gchar], flags : GBindingFlags, transform_to : GBindingTransformFunc, transform_from : GBindingTransformFunc, user_data : _root_.sn.gnome.glib.internal.gpointer, notify : _root_.sn.gnome.glib.internal.GDestroyNotify): Ptr[GBinding] = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gbinding.h
*/
@extern def g_object_bind_property_with_closures(source : _root_.sn.gnome.glib.internal.gpointer, source_property : Ptr[_root_.sn.gnome.glib.internal.gchar], target : _root_.sn.gnome.glib.internal.gpointer, target_property : Ptr[_root_.sn.gnome.glib.internal.gchar], flags : GBindingFlags, transform_to : Ptr[GClosure], transform_from : Ptr[GClosure]): Ptr[GBinding] = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject.h
*/
@extern def g_object_class_find_property(oclass : Ptr[GObjectClass], property_name : Ptr[_root_.sn.gnome.glib.internal.gchar]): Ptr[GParamSpec] = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject.h
*/
@extern def g_object_class_install_properties(oclass : Ptr[GObjectClass], n_pspecs : _root_.sn.gnome.glib.internal.guint, pspecs : Ptr[Ptr[GParamSpec]]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject.h
*/
@extern def g_object_class_install_property(oclass : Ptr[GObjectClass], property_id : _root_.sn.gnome.glib.internal.guint, pspec : Ptr[GParamSpec]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject.h
*/
@extern def g_object_class_list_properties(oclass : Ptr[GObjectClass], n_properties : Ptr[_root_.sn.gnome.glib.internal.guint]): Ptr[Ptr[GParamSpec]] = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject.h
*/
@extern def g_object_class_override_property(oclass : Ptr[GObjectClass], property_id : _root_.sn.gnome.glib.internal.guint, name : Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject.h
*/
@extern def g_object_compat_control(what : _root_.sn.gnome.glib.internal.gsize, data : _root_.sn.gnome.glib.internal.gpointer): _root_.sn.gnome.glib.internal.gsize = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject.h
*/
@extern def g_object_connect(`object` : _root_.sn.gnome.glib.internal.gpointer, signal_spec : Ptr[_root_.sn.gnome.glib.internal.gchar], rest: Any*): _root_.sn.gnome.glib.internal.gpointer = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject.h
*/
@extern def g_object_disconnect(`object` : _root_.sn.gnome.glib.internal.gpointer, signal_spec : Ptr[_root_.sn.gnome.glib.internal.gchar], rest: Any*): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject.h
*/
@extern def g_object_dup_data(`object` : Ptr[GObject], key : Ptr[_root_.sn.gnome.glib.internal.gchar], dup_func : _root_.sn.gnome.glib.internal.GDuplicateFunc, user_data : _root_.sn.gnome.glib.internal.gpointer): _root_.sn.gnome.glib.internal.gpointer = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject.h
*/
@extern def g_object_dup_qdata(`object` : Ptr[GObject], quark : _root_.sn.gnome.glib.internal.GQuark, dup_func : _root_.sn.gnome.glib.internal.GDuplicateFunc, user_data : _root_.sn.gnome.glib.internal.gpointer): _root_.sn.gnome.glib.internal.gpointer = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject.h
*/
@extern def g_object_force_floating(`object` : Ptr[GObject]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject.h
*/
@extern def g_object_freeze_notify(`object` : Ptr[GObject]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject.h
*/
@extern def g_object_get(`object` : _root_.sn.gnome.glib.internal.gpointer, first_property_name : Ptr[_root_.sn.gnome.glib.internal.gchar], rest: Any*): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject.h
*/
@extern def g_object_get_data(`object` : Ptr[GObject], key : Ptr[_root_.sn.gnome.glib.internal.gchar]): _root_.sn.gnome.glib.internal.gpointer = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject.h
*/
@extern def g_object_get_property(`object` : Ptr[GObject], property_name : Ptr[_root_.sn.gnome.glib.internal.gchar], value : Ptr[GValue]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject.h
*/
@extern def g_object_get_qdata(`object` : Ptr[GObject], quark : _root_.sn.gnome.glib.internal.GQuark): _root_.sn.gnome.glib.internal.gpointer = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject.h
*/
@extern def g_object_get_type(): GType = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject.h
*/
@extern def g_object_get_valist(`object` : Ptr[GObject], first_property_name : Ptr[_root_.sn.gnome.glib.internal.gchar], var_args : va_list): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject.h
*/
@extern def g_object_getv(`object` : Ptr[GObject], n_properties : _root_.sn.gnome.glib.internal.guint, names : Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]], values : Ptr[GValue]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject.h
*/
@extern def g_object_interface_find_property(g_iface : _root_.sn.gnome.glib.internal.gpointer, property_name : Ptr[_root_.sn.gnome.glib.internal.gchar]): Ptr[GParamSpec] = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject.h
*/
@extern def g_object_interface_install_property(g_iface : _root_.sn.gnome.glib.internal.gpointer, pspec : Ptr[GParamSpec]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject.h
*/
@extern def g_object_interface_list_properties(g_iface : _root_.sn.gnome.glib.internal.gpointer, n_properties_p : Ptr[_root_.sn.gnome.glib.internal.guint]): Ptr[Ptr[GParamSpec]] = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject.h
*/
@extern def g_object_is_floating(`object` : _root_.sn.gnome.glib.internal.gpointer): _root_.sn.gnome.glib.internal.gboolean = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject.h
*/
@extern def g_object_new(object_type : GType, first_property_name : Ptr[_root_.sn.gnome.glib.internal.gchar], rest: Any*): _root_.sn.gnome.glib.internal.gpointer = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject.h
*/
@extern def g_object_new_valist(object_type : GType, first_property_name : Ptr[_root_.sn.gnome.glib.internal.gchar], var_args : va_list): Ptr[GObject] = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject.h
*/
@extern def g_object_new_with_properties(object_type : GType, n_properties : _root_.sn.gnome.glib.internal.guint, names : Ptr[CString], values : Ptr[GValue]): Ptr[GObject] = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject.h
*/
@extern def g_object_newv(object_type : GType, n_parameters : _root_.sn.gnome.glib.internal.guint, parameters : Ptr[GParameter]): _root_.sn.gnome.glib.internal.gpointer = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject.h
*/
@extern def g_object_notify(`object` : Ptr[GObject], property_name : Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject.h
*/
@extern def g_object_notify_by_pspec(`object` : Ptr[GObject], pspec : Ptr[GParamSpec]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject.h
*/
@extern def g_object_ref(`object` : _root_.sn.gnome.glib.internal.gpointer): _root_.sn.gnome.glib.internal.gpointer = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject.h
*/
@extern def g_object_ref_sink(`object` : _root_.sn.gnome.glib.internal.gpointer): _root_.sn.gnome.glib.internal.gpointer = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject.h
*/
@extern def g_object_remove_toggle_ref(`object` : Ptr[GObject], notify : GToggleNotify, data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject.h
*/
@extern def g_object_remove_weak_pointer(`object` : Ptr[GObject], weak_pointer_location : Ptr[_root_.sn.gnome.glib.internal.gpointer]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject.h
*/
@extern def g_object_replace_data(`object` : Ptr[GObject], key : Ptr[_root_.sn.gnome.glib.internal.gchar], oldval : _root_.sn.gnome.glib.internal.gpointer, newval : _root_.sn.gnome.glib.internal.gpointer, destroy : _root_.sn.gnome.glib.internal.GDestroyNotify, old_destroy : Ptr[_root_.sn.gnome.glib.internal.GDestroyNotify]): _root_.sn.gnome.glib.internal.gboolean = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject.h
*/
@extern def g_object_replace_qdata(`object` : Ptr[GObject], quark : _root_.sn.gnome.glib.internal.GQuark, oldval : _root_.sn.gnome.glib.internal.gpointer, newval : _root_.sn.gnome.glib.internal.gpointer, destroy : _root_.sn.gnome.glib.internal.GDestroyNotify, old_destroy : Ptr[_root_.sn.gnome.glib.internal.GDestroyNotify]): _root_.sn.gnome.glib.internal.gboolean = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject.h
*/
@extern def g_object_run_dispose(`object` : Ptr[GObject]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject.h
*/
@extern def g_object_set(`object` : _root_.sn.gnome.glib.internal.gpointer, first_property_name : Ptr[_root_.sn.gnome.glib.internal.gchar], rest: Any*): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject.h
*/
@extern def g_object_set_data(`object` : Ptr[GObject], key : Ptr[_root_.sn.gnome.glib.internal.gchar], data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject.h
*/
@extern def g_object_set_data_full(`object` : Ptr[GObject], key : Ptr[_root_.sn.gnome.glib.internal.gchar], data : _root_.sn.gnome.glib.internal.gpointer, destroy : _root_.sn.gnome.glib.internal.GDestroyNotify): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject.h
*/
@extern def g_object_set_property(`object` : Ptr[GObject], property_name : Ptr[_root_.sn.gnome.glib.internal.gchar], value : Ptr[GValue]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject.h
*/
@extern def g_object_set_qdata(`object` : Ptr[GObject], quark : _root_.sn.gnome.glib.internal.GQuark, data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject.h
*/
@extern def g_object_set_qdata_full(`object` : Ptr[GObject], quark : _root_.sn.gnome.glib.internal.GQuark, data : _root_.sn.gnome.glib.internal.gpointer, destroy : _root_.sn.gnome.glib.internal.GDestroyNotify): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject.h
*/
@extern def g_object_set_valist(`object` : Ptr[GObject], first_property_name : Ptr[_root_.sn.gnome.glib.internal.gchar], var_args : va_list): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject.h
*/
@extern def g_object_setv(`object` : Ptr[GObject], n_properties : _root_.sn.gnome.glib.internal.guint, names : Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]], values : Ptr[GValue]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject.h
*/
@extern def g_object_steal_data(`object` : Ptr[GObject], key : Ptr[_root_.sn.gnome.glib.internal.gchar]): _root_.sn.gnome.glib.internal.gpointer = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject.h
*/
@extern def g_object_steal_qdata(`object` : Ptr[GObject], quark : _root_.sn.gnome.glib.internal.GQuark): _root_.sn.gnome.glib.internal.gpointer = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject.h
*/
@extern def g_object_take_ref(`object` : _root_.sn.gnome.glib.internal.gpointer): _root_.sn.gnome.glib.internal.gpointer = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject.h
*/
@extern def g_object_thaw_notify(`object` : Ptr[GObject]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject.h
*/
@extern def g_object_unref(`object` : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject.h
*/
@extern def g_object_watch_closure(`object` : Ptr[GObject], closure : Ptr[GClosure]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject.h
*/
@extern def g_object_weak_ref(`object` : Ptr[GObject], notify : GWeakNotify, data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject.h
*/
@extern def g_object_weak_unref(`object` : Ptr[GObject], notify : GWeakNotify, data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/glib-types.h
*/
@extern def g_option_group_get_type(): GType = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gparamspecs.h
*/
@extern def g_param_spec_boolean(name : Ptr[_root_.sn.gnome.glib.internal.gchar], nick : Ptr[_root_.sn.gnome.glib.internal.gchar], blurb : Ptr[_root_.sn.gnome.glib.internal.gchar], default_value : _root_.sn.gnome.glib.internal.gboolean, flags : GParamFlags): Ptr[GParamSpec] = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gparamspecs.h
*/
@extern def g_param_spec_boxed(name : Ptr[_root_.sn.gnome.glib.internal.gchar], nick : Ptr[_root_.sn.gnome.glib.internal.gchar], blurb : Ptr[_root_.sn.gnome.glib.internal.gchar], boxed_type : GType, flags : GParamFlags): Ptr[GParamSpec] = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gparamspecs.h
*/
@extern def g_param_spec_char(name : Ptr[_root_.sn.gnome.glib.internal.gchar], nick : Ptr[_root_.sn.gnome.glib.internal.gchar], blurb : Ptr[_root_.sn.gnome.glib.internal.gchar], minimum : _root_.sn.gnome.glib.internal.gint8, maximum : _root_.sn.gnome.glib.internal.gint8, default_value : _root_.sn.gnome.glib.internal.gint8, flags : GParamFlags): Ptr[GParamSpec] = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gparamspecs.h
*/
@extern def g_param_spec_double(name : Ptr[_root_.sn.gnome.glib.internal.gchar], nick : Ptr[_root_.sn.gnome.glib.internal.gchar], blurb : Ptr[_root_.sn.gnome.glib.internal.gchar], minimum : _root_.sn.gnome.glib.internal.gdouble, maximum : _root_.sn.gnome.glib.internal.gdouble, default_value : _root_.sn.gnome.glib.internal.gdouble, flags : GParamFlags): Ptr[GParamSpec] = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gparamspecs.h
*/
@extern def g_param_spec_enum(name : Ptr[_root_.sn.gnome.glib.internal.gchar], nick : Ptr[_root_.sn.gnome.glib.internal.gchar], blurb : Ptr[_root_.sn.gnome.glib.internal.gchar], enum_type : GType, default_value : _root_.sn.gnome.glib.internal.gint, flags : GParamFlags): Ptr[GParamSpec] = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gparamspecs.h
*/
@extern def g_param_spec_flags(name : Ptr[_root_.sn.gnome.glib.internal.gchar], nick : Ptr[_root_.sn.gnome.glib.internal.gchar], blurb : Ptr[_root_.sn.gnome.glib.internal.gchar], flags_type : GType, default_value : _root_.sn.gnome.glib.internal.guint, flags : GParamFlags): Ptr[GParamSpec] = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gparamspecs.h
*/
@extern def g_param_spec_float(name : Ptr[_root_.sn.gnome.glib.internal.gchar], nick : Ptr[_root_.sn.gnome.glib.internal.gchar], blurb : Ptr[_root_.sn.gnome.glib.internal.gchar], minimum : _root_.sn.gnome.glib.internal.gfloat, maximum : _root_.sn.gnome.glib.internal.gfloat, default_value : _root_.sn.gnome.glib.internal.gfloat, flags : GParamFlags): Ptr[GParamSpec] = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gparam.h
*/
@extern def g_param_spec_get_blurb(pspec : Ptr[GParamSpec]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gparam.h
*/
@extern def g_param_spec_get_default_value(pspec : Ptr[GParamSpec]): Ptr[GValue] = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gparam.h
*/
@extern def g_param_spec_get_name(pspec : Ptr[GParamSpec]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gparam.h
*/
@extern def g_param_spec_get_name_quark(pspec : Ptr[GParamSpec]): _root_.sn.gnome.glib.internal.GQuark = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gparam.h
*/
@extern def g_param_spec_get_nick(pspec : Ptr[GParamSpec]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gparam.h
*/
@extern def g_param_spec_get_qdata(pspec : Ptr[GParamSpec], quark : _root_.sn.gnome.glib.internal.GQuark): _root_.sn.gnome.glib.internal.gpointer = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gparam.h
*/
@extern def g_param_spec_get_redirect_target(pspec : Ptr[GParamSpec]): Ptr[GParamSpec] = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gparamspecs.h
*/
@extern def g_param_spec_gtype(name : Ptr[_root_.sn.gnome.glib.internal.gchar], nick : Ptr[_root_.sn.gnome.glib.internal.gchar], blurb : Ptr[_root_.sn.gnome.glib.internal.gchar], is_a_type : GType, flags : GParamFlags): Ptr[GParamSpec] = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gparamspecs.h
*/
@extern def g_param_spec_int(name : Ptr[_root_.sn.gnome.glib.internal.gchar], nick : Ptr[_root_.sn.gnome.glib.internal.gchar], blurb : Ptr[_root_.sn.gnome.glib.internal.gchar], minimum : _root_.sn.gnome.glib.internal.gint, maximum : _root_.sn.gnome.glib.internal.gint, default_value : _root_.sn.gnome.glib.internal.gint, flags : GParamFlags): Ptr[GParamSpec] = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gparamspecs.h
*/
@extern def g_param_spec_int64(name : Ptr[_root_.sn.gnome.glib.internal.gchar], nick : Ptr[_root_.sn.gnome.glib.internal.gchar], blurb : Ptr[_root_.sn.gnome.glib.internal.gchar], minimum : _root_.sn.gnome.glib.internal.gint64, maximum : _root_.sn.gnome.glib.internal.gint64, default_value : _root_.sn.gnome.glib.internal.gint64, flags : GParamFlags): Ptr[GParamSpec] = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gparam.h
*/
@extern def g_param_spec_internal(param_type : GType, name : Ptr[_root_.sn.gnome.glib.internal.gchar], nick : Ptr[_root_.sn.gnome.glib.internal.gchar], blurb : Ptr[_root_.sn.gnome.glib.internal.gchar], flags : GParamFlags): _root_.sn.gnome.glib.internal.gpointer = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gparam.h
*/
@extern def g_param_spec_is_valid_name(name : Ptr[_root_.sn.gnome.glib.internal.gchar]): _root_.sn.gnome.glib.internal.gboolean = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gparamspecs.h
*/
@extern def g_param_spec_long(name : Ptr[_root_.sn.gnome.glib.internal.gchar], nick : Ptr[_root_.sn.gnome.glib.internal.gchar], blurb : Ptr[_root_.sn.gnome.glib.internal.gchar], minimum : _root_.sn.gnome.glib.internal.glong, maximum : _root_.sn.gnome.glib.internal.glong, default_value : _root_.sn.gnome.glib.internal.glong, flags : GParamFlags): Ptr[GParamSpec] = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gparamspecs.h
*/
@extern def g_param_spec_object(name : Ptr[_root_.sn.gnome.glib.internal.gchar], nick : Ptr[_root_.sn.gnome.glib.internal.gchar], blurb : Ptr[_root_.sn.gnome.glib.internal.gchar], object_type : GType, flags : GParamFlags): Ptr[GParamSpec] = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gparamspecs.h
*/
@extern def g_param_spec_override(name : Ptr[_root_.sn.gnome.glib.internal.gchar], overridden : Ptr[GParamSpec]): Ptr[GParamSpec] = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gparamspecs.h
*/
@extern def g_param_spec_param(name : Ptr[_root_.sn.gnome.glib.internal.gchar], nick : Ptr[_root_.sn.gnome.glib.internal.gchar], blurb : Ptr[_root_.sn.gnome.glib.internal.gchar], param_type : GType, flags : GParamFlags): Ptr[GParamSpec] = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gparamspecs.h
*/
@extern def g_param_spec_pointer(name : Ptr[_root_.sn.gnome.glib.internal.gchar], nick : Ptr[_root_.sn.gnome.glib.internal.gchar], blurb : Ptr[_root_.sn.gnome.glib.internal.gchar], flags : GParamFlags): Ptr[GParamSpec] = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gparam.h
*/
@extern def g_param_spec_pool_free(pool : Ptr[GParamSpecPool]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gparam.h
*/
@extern def g_param_spec_pool_insert(pool : Ptr[GParamSpecPool], pspec : Ptr[GParamSpec], owner_type : GType): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gparam.h
*/
@extern def g_param_spec_pool_list(pool : Ptr[GParamSpecPool], owner_type : GType, n_pspecs_p : Ptr[_root_.sn.gnome.glib.internal.guint]): Ptr[Ptr[GParamSpec]] = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gparam.h
*/
@extern def g_param_spec_pool_list_owned(pool : Ptr[GParamSpecPool], owner_type : GType): Ptr[_root_.sn.gnome.glib.internal.GList] = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gparam.h
*/
@extern def g_param_spec_pool_lookup(pool : Ptr[GParamSpecPool], param_name : Ptr[_root_.sn.gnome.glib.internal.gchar], owner_type : GType, walk_ancestors : _root_.sn.gnome.glib.internal.gboolean): Ptr[GParamSpec] = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gparam.h
*/
@extern def g_param_spec_pool_new(type_prefixing : _root_.sn.gnome.glib.internal.gboolean): Ptr[GParamSpecPool] = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gparam.h
*/
@extern def g_param_spec_pool_remove(pool : Ptr[GParamSpecPool], pspec : Ptr[GParamSpec]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gparam.h
*/
@extern def g_param_spec_ref(pspec : Ptr[GParamSpec]): Ptr[GParamSpec] = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gparam.h
*/
@extern def g_param_spec_ref_sink(pspec : Ptr[GParamSpec]): Ptr[GParamSpec] = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gparam.h
*/
@extern def g_param_spec_set_qdata(pspec : Ptr[GParamSpec], quark : _root_.sn.gnome.glib.internal.GQuark, data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gparam.h
*/
@extern def g_param_spec_set_qdata_full(pspec : Ptr[GParamSpec], quark : _root_.sn.gnome.glib.internal.GQuark, data : _root_.sn.gnome.glib.internal.gpointer, destroy : _root_.sn.gnome.glib.internal.GDestroyNotify): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gparam.h
*/
@extern def g_param_spec_sink(pspec : Ptr[GParamSpec]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gparam.h
*/
@extern def g_param_spec_steal_qdata(pspec : Ptr[GParamSpec], quark : _root_.sn.gnome.glib.internal.GQuark): _root_.sn.gnome.glib.internal.gpointer = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gparamspecs.h
*/
@extern def g_param_spec_string(name : Ptr[_root_.sn.gnome.glib.internal.gchar], nick : Ptr[_root_.sn.gnome.glib.internal.gchar], blurb : Ptr[_root_.sn.gnome.glib.internal.gchar], default_value : Ptr[_root_.sn.gnome.glib.internal.gchar], flags : GParamFlags): Ptr[GParamSpec] = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gparamspecs.h
*/
@extern def g_param_spec_uchar(name : Ptr[_root_.sn.gnome.glib.internal.gchar], nick : Ptr[_root_.sn.gnome.glib.internal.gchar], blurb : Ptr[_root_.sn.gnome.glib.internal.gchar], minimum : _root_.sn.gnome.glib.internal.guint8, maximum : _root_.sn.gnome.glib.internal.guint8, default_value : _root_.sn.gnome.glib.internal.guint8, flags : GParamFlags): Ptr[GParamSpec] = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gparamspecs.h
*/
@extern def g_param_spec_uint(name : Ptr[_root_.sn.gnome.glib.internal.gchar], nick : Ptr[_root_.sn.gnome.glib.internal.gchar], blurb : Ptr[_root_.sn.gnome.glib.internal.gchar], minimum : _root_.sn.gnome.glib.internal.guint, maximum : _root_.sn.gnome.glib.internal.guint, default_value : _root_.sn.gnome.glib.internal.guint, flags : GParamFlags): Ptr[GParamSpec] = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gparamspecs.h
*/
@extern def g_param_spec_uint64(name : Ptr[_root_.sn.gnome.glib.internal.gchar], nick : Ptr[_root_.sn.gnome.glib.internal.gchar], blurb : Ptr[_root_.sn.gnome.glib.internal.gchar], minimum : _root_.sn.gnome.glib.internal.guint64, maximum : _root_.sn.gnome.glib.internal.guint64, default_value : _root_.sn.gnome.glib.internal.guint64, flags : GParamFlags): Ptr[GParamSpec] = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gparamspecs.h
*/
@extern def g_param_spec_ulong(name : Ptr[_root_.sn.gnome.glib.internal.gchar], nick : Ptr[_root_.sn.gnome.glib.internal.gchar], blurb : Ptr[_root_.sn.gnome.glib.internal.gchar], minimum : _root_.sn.gnome.glib.internal.gulong, maximum : _root_.sn.gnome.glib.internal.gulong, default_value : _root_.sn.gnome.glib.internal.gulong, flags : GParamFlags): Ptr[GParamSpec] = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gparamspecs.h
*/
@extern def g_param_spec_unichar(name : Ptr[_root_.sn.gnome.glib.internal.gchar], nick : Ptr[_root_.sn.gnome.glib.internal.gchar], blurb : Ptr[_root_.sn.gnome.glib.internal.gchar], default_value : _root_.sn.gnome.glib.internal.gunichar, flags : GParamFlags): Ptr[GParamSpec] = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gparam.h
*/
@extern def g_param_spec_unref(pspec : Ptr[GParamSpec]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gparamspecs.h
*/
@extern def g_param_spec_value_array(name : Ptr[_root_.sn.gnome.glib.internal.gchar], nick : Ptr[_root_.sn.gnome.glib.internal.gchar], blurb : Ptr[_root_.sn.gnome.glib.internal.gchar], element_spec : Ptr[GParamSpec], flags : GParamFlags): Ptr[GParamSpec] = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gparamspecs.h
*/
@extern def g_param_spec_variant(name : Ptr[_root_.sn.gnome.glib.internal.gchar], nick : Ptr[_root_.sn.gnome.glib.internal.gchar], blurb : Ptr[_root_.sn.gnome.glib.internal.gchar], `type` : Ptr[_root_.sn.gnome.glib.internal.GVariantType], default_value : Ptr[_root_.sn.gnome.glib.internal.GVariant], flags : GParamFlags): Ptr[GParamSpec] = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gparam.h
*/
@extern def g_param_type_register_static(name : Ptr[_root_.sn.gnome.glib.internal.gchar], pspec_info : Ptr[GParamSpecTypeInfo]): GType = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gparam.h
*/
@extern def g_param_value_convert(pspec : Ptr[GParamSpec], src_value : Ptr[GValue], dest_value : Ptr[GValue], strict_validation : _root_.sn.gnome.glib.internal.gboolean): _root_.sn.gnome.glib.internal.gboolean = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gparam.h
*/
@extern def g_param_value_defaults(pspec : Ptr[GParamSpec], value : Ptr[GValue]): _root_.sn.gnome.glib.internal.gboolean = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gparam.h
*/
@extern def g_param_value_is_valid(pspec : Ptr[GParamSpec], value : Ptr[GValue]): _root_.sn.gnome.glib.internal.gboolean = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gparam.h
*/
@extern def g_param_value_set_default(pspec : Ptr[GParamSpec], value : Ptr[GValue]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gparam.h
*/
@extern def g_param_value_validate(pspec : Ptr[GParamSpec], value : Ptr[GValue]): _root_.sn.gnome.glib.internal.gboolean = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gparam.h
*/
@extern def g_param_values_cmp(pspec : Ptr[GParamSpec], value1 : Ptr[GValue], value2 : Ptr[GValue]): _root_.sn.gnome.glib.internal.gint = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/glib-types.h
*/
@extern def g_pattern_spec_get_type(): GType = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gvaluetypes.h
*/
@extern def g_pointer_type_register_static(name : Ptr[_root_.sn.gnome.glib.internal.gchar]): GType = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/glib-types.h
*/
@extern def g_pollfd_get_type(): GType = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/glib-types.h
*/
@extern def g_ptr_array_get_type(): GType = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/glib-types.h
*/
@extern def g_rand_get_type(): GType = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/glib-types.h
*/
@extern def g_regex_get_type(): GType = extern

/**
 * g_set_object: (skip) _ptr: (inout) (not optional) (nullable): a pointer to a #GObject reference _object: (nullable) (transfer none): a pointer to the new #GObject to assign to _ptr, or %NULL to clear the pointer

 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject.h
*/
@extern def g_set_object(object_ptr : Ptr[Ptr[GObject]], new_object : Ptr[GObject]): _root_.sn.gnome.glib.internal.gboolean = extern

/**
 * g_set_weak_pointer: (skip) _pointer_location: the memory address of a pointer _object: (nullable) (transfer none): a pointer to the new #GObject to assign to it, or %NULL to clear the pointer

 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject.h
*/
@extern def g_set_weak_pointer(weak_pointer_location : Ptr[_root_.sn.gnome.glib.internal.gpointer], new_object : Ptr[GObject]): _root_.sn.gnome.glib.internal.gboolean = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gsignal.h
*/
@extern def g_signal_accumulator_first_wins(ihint : Ptr[GSignalInvocationHint], return_accu : Ptr[GValue], handler_return : Ptr[GValue], dummy : _root_.sn.gnome.glib.internal.gpointer): _root_.sn.gnome.glib.internal.gboolean = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gsignal.h
*/
@extern def g_signal_accumulator_true_handled(ihint : Ptr[GSignalInvocationHint], return_accu : Ptr[GValue], handler_return : Ptr[GValue], dummy : _root_.sn.gnome.glib.internal.gpointer): _root_.sn.gnome.glib.internal.gboolean = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gsignal.h
*/
@extern def g_signal_add_emission_hook(signal_id : _root_.sn.gnome.glib.internal.guint, detail : _root_.sn.gnome.glib.internal.GQuark, hook_func : GSignalEmissionHook, hook_data : _root_.sn.gnome.glib.internal.gpointer, data_destroy : _root_.sn.gnome.glib.internal.GDestroyNotify): _root_.sn.gnome.glib.internal.gulong = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gsignal.h
*/
@extern def g_signal_chain_from_overridden(instance_and_params : Ptr[GValue], return_value : Ptr[GValue]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gsignal.h
*/
@extern def g_signal_chain_from_overridden_handler(instance : _root_.sn.gnome.glib.internal.gpointer, rest: Any*): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gsignal.h
*/
@extern def g_signal_connect_closure(instance : _root_.sn.gnome.glib.internal.gpointer, detailed_signal : Ptr[_root_.sn.gnome.glib.internal.gchar], closure : Ptr[GClosure], after : _root_.sn.gnome.glib.internal.gboolean): _root_.sn.gnome.glib.internal.gulong = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gsignal.h
*/
@extern def g_signal_connect_closure_by_id(instance : _root_.sn.gnome.glib.internal.gpointer, signal_id : _root_.sn.gnome.glib.internal.guint, detail : _root_.sn.gnome.glib.internal.GQuark, closure : Ptr[GClosure], after : _root_.sn.gnome.glib.internal.gboolean): _root_.sn.gnome.glib.internal.gulong = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gsignal.h
*/
@extern def g_signal_connect_data(instance : _root_.sn.gnome.glib.internal.gpointer, detailed_signal : Ptr[_root_.sn.gnome.glib.internal.gchar], c_handler : GCallback, data : _root_.sn.gnome.glib.internal.gpointer, destroy_data : GClosureNotify, connect_flags : GConnectFlags): _root_.sn.gnome.glib.internal.gulong = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject.h
*/
@extern def g_signal_connect_object(instance : _root_.sn.gnome.glib.internal.gpointer, detailed_signal : Ptr[_root_.sn.gnome.glib.internal.gchar], c_handler : GCallback, gobject : _root_.sn.gnome.glib.internal.gpointer, connect_flags : GConnectFlags): _root_.sn.gnome.glib.internal.gulong = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gsignal.h
*/
@extern def g_signal_emit(instance : _root_.sn.gnome.glib.internal.gpointer, signal_id : _root_.sn.gnome.glib.internal.guint, detail : _root_.sn.gnome.glib.internal.GQuark, rest: Any*): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gsignal.h
*/
@extern def g_signal_emit_by_name(instance : _root_.sn.gnome.glib.internal.gpointer, detailed_signal : Ptr[_root_.sn.gnome.glib.internal.gchar], rest: Any*): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gsignal.h
*/
@extern def g_signal_emit_valist(instance : _root_.sn.gnome.glib.internal.gpointer, signal_id : _root_.sn.gnome.glib.internal.guint, detail : _root_.sn.gnome.glib.internal.GQuark, var_args : va_list): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gsignal.h
*/
@extern def g_signal_emitv(instance_and_params : Ptr[GValue], signal_id : _root_.sn.gnome.glib.internal.guint, detail : _root_.sn.gnome.glib.internal.GQuark, return_value : Ptr[GValue]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gsignal.h
*/
@extern def g_signal_get_invocation_hint(instance : _root_.sn.gnome.glib.internal.gpointer): Ptr[GSignalInvocationHint] = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gsignalgroup.h
*/
@extern def g_signal_group_block(self : Ptr[GSignalGroup]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gsignalgroup.h
*/
@extern def g_signal_group_connect(self : Ptr[GSignalGroup], detailed_signal : Ptr[_root_.sn.gnome.glib.internal.gchar], c_handler : GCallback, data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gsignalgroup.h
*/
@extern def g_signal_group_connect_after(self : Ptr[GSignalGroup], detailed_signal : Ptr[_root_.sn.gnome.glib.internal.gchar], c_handler : GCallback, data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gsignalgroup.h
*/
@extern def g_signal_group_connect_closure(self : Ptr[GSignalGroup], detailed_signal : Ptr[_root_.sn.gnome.glib.internal.gchar], closure : Ptr[GClosure], after : _root_.sn.gnome.glib.internal.gboolean): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gsignalgroup.h
*/
@extern def g_signal_group_connect_data(self : Ptr[GSignalGroup], detailed_signal : Ptr[_root_.sn.gnome.glib.internal.gchar], c_handler : GCallback, data : _root_.sn.gnome.glib.internal.gpointer, notify : GClosureNotify, flags : GConnectFlags): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gsignalgroup.h
*/
@extern def g_signal_group_connect_object(self : Ptr[GSignalGroup], detailed_signal : Ptr[_root_.sn.gnome.glib.internal.gchar], c_handler : GCallback, `object` : _root_.sn.gnome.glib.internal.gpointer, flags : GConnectFlags): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gsignalgroup.h
*/
@extern def g_signal_group_connect_swapped(self : Ptr[GSignalGroup], detailed_signal : Ptr[_root_.sn.gnome.glib.internal.gchar], c_handler : GCallback, data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gsignalgroup.h
*/
@extern def g_signal_group_dup_target(self : Ptr[GSignalGroup]): _root_.sn.gnome.glib.internal.gpointer = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gsignalgroup.h
*/
@extern def g_signal_group_get_type(): GType = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gsignalgroup.h
*/
@extern def g_signal_group_new(target_type : GType): Ptr[GSignalGroup] = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gsignalgroup.h
*/
@extern def g_signal_group_set_target(self : Ptr[GSignalGroup], target : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gsignalgroup.h
*/
@extern def g_signal_group_unblock(self : Ptr[GSignalGroup]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gsignal.h
*/
@extern def g_signal_handler_block(instance : _root_.sn.gnome.glib.internal.gpointer, handler_id : _root_.sn.gnome.glib.internal.gulong): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gsignal.h
*/
@extern def g_signal_handler_disconnect(instance : _root_.sn.gnome.glib.internal.gpointer, handler_id : _root_.sn.gnome.glib.internal.gulong): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gsignal.h
*/
@extern def g_signal_handler_find(instance : _root_.sn.gnome.glib.internal.gpointer, mask : GSignalMatchType, signal_id : _root_.sn.gnome.glib.internal.guint, detail : _root_.sn.gnome.glib.internal.GQuark, closure : Ptr[GClosure], func : _root_.sn.gnome.glib.internal.gpointer, data : _root_.sn.gnome.glib.internal.gpointer): _root_.sn.gnome.glib.internal.gulong = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gsignal.h
*/
@extern def g_signal_handler_is_connected(instance : _root_.sn.gnome.glib.internal.gpointer, handler_id : _root_.sn.gnome.glib.internal.gulong): _root_.sn.gnome.glib.internal.gboolean = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gsignal.h
*/
@extern def g_signal_handler_unblock(instance : _root_.sn.gnome.glib.internal.gpointer, handler_id : _root_.sn.gnome.glib.internal.gulong): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gsignal.h
*/
@extern def g_signal_handlers_block_matched(instance : _root_.sn.gnome.glib.internal.gpointer, mask : GSignalMatchType, signal_id : _root_.sn.gnome.glib.internal.guint, detail : _root_.sn.gnome.glib.internal.GQuark, closure : Ptr[GClosure], func : _root_.sn.gnome.glib.internal.gpointer, data : _root_.sn.gnome.glib.internal.gpointer): _root_.sn.gnome.glib.internal.guint = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gsignal.h
*/
@extern def g_signal_handlers_destroy(instance : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gsignal.h
*/
@extern def g_signal_handlers_disconnect_matched(instance : _root_.sn.gnome.glib.internal.gpointer, mask : GSignalMatchType, signal_id : _root_.sn.gnome.glib.internal.guint, detail : _root_.sn.gnome.glib.internal.GQuark, closure : Ptr[GClosure], func : _root_.sn.gnome.glib.internal.gpointer, data : _root_.sn.gnome.glib.internal.gpointer): _root_.sn.gnome.glib.internal.guint = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gsignal.h
*/
@extern def g_signal_handlers_unblock_matched(instance : _root_.sn.gnome.glib.internal.gpointer, mask : GSignalMatchType, signal_id : _root_.sn.gnome.glib.internal.guint, detail : _root_.sn.gnome.glib.internal.GQuark, closure : Ptr[GClosure], func : _root_.sn.gnome.glib.internal.gpointer, data : _root_.sn.gnome.glib.internal.gpointer): _root_.sn.gnome.glib.internal.guint = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gsignal.h
*/
@extern def g_signal_has_handler_pending(instance : _root_.sn.gnome.glib.internal.gpointer, signal_id : _root_.sn.gnome.glib.internal.guint, detail : _root_.sn.gnome.glib.internal.GQuark, may_be_blocked : _root_.sn.gnome.glib.internal.gboolean): _root_.sn.gnome.glib.internal.gboolean = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gsignal.h
*/
@extern def g_signal_is_valid_name(name : Ptr[_root_.sn.gnome.glib.internal.gchar]): _root_.sn.gnome.glib.internal.gboolean = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gsignal.h
*/
@extern def g_signal_list_ids(itype : GType, n_ids : Ptr[_root_.sn.gnome.glib.internal.guint]): Ptr[_root_.sn.gnome.glib.internal.guint] = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gsignal.h
*/
@extern def g_signal_lookup(name : Ptr[_root_.sn.gnome.glib.internal.gchar], itype : GType): _root_.sn.gnome.glib.internal.guint = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gsignal.h
*/
@extern def g_signal_name(signal_id : _root_.sn.gnome.glib.internal.guint): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gsignal.h
*/
@extern def g_signal_new(signal_name : Ptr[_root_.sn.gnome.glib.internal.gchar], itype : GType, signal_flags : GSignalFlags, class_offset : _root_.sn.gnome.glib.internal.guint, accumulator : GSignalAccumulator, accu_data : _root_.sn.gnome.glib.internal.gpointer, c_marshaller : GSignalCMarshaller, return_type : GType, n_params : _root_.sn.gnome.glib.internal.guint, rest: Any*): _root_.sn.gnome.glib.internal.guint = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gsignal.h
*/
@extern def g_signal_new_class_handler(signal_name : Ptr[_root_.sn.gnome.glib.internal.gchar], itype : GType, signal_flags : GSignalFlags, class_handler : GCallback, accumulator : GSignalAccumulator, accu_data : _root_.sn.gnome.glib.internal.gpointer, c_marshaller : GSignalCMarshaller, return_type : GType, n_params : _root_.sn.gnome.glib.internal.guint, rest: Any*): _root_.sn.gnome.glib.internal.guint = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gsignal.h
*/
@extern def g_signal_new_valist(signal_name : Ptr[_root_.sn.gnome.glib.internal.gchar], itype : GType, signal_flags : GSignalFlags, class_closure : Ptr[GClosure], accumulator : GSignalAccumulator, accu_data : _root_.sn.gnome.glib.internal.gpointer, c_marshaller : GSignalCMarshaller, return_type : GType, n_params : _root_.sn.gnome.glib.internal.guint, args : va_list): _root_.sn.gnome.glib.internal.guint = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gsignal.h
*/
@extern def g_signal_newv(signal_name : Ptr[_root_.sn.gnome.glib.internal.gchar], itype : GType, signal_flags : GSignalFlags, class_closure : Ptr[GClosure], accumulator : GSignalAccumulator, accu_data : _root_.sn.gnome.glib.internal.gpointer, c_marshaller : GSignalCMarshaller, return_type : GType, n_params : _root_.sn.gnome.glib.internal.guint, param_types : Ptr[GType]): _root_.sn.gnome.glib.internal.guint = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gsignal.h
*/
@extern def g_signal_override_class_closure(signal_id : _root_.sn.gnome.glib.internal.guint, instance_type : GType, class_closure : Ptr[GClosure]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gsignal.h
*/
@extern def g_signal_override_class_handler(signal_name : Ptr[_root_.sn.gnome.glib.internal.gchar], instance_type : GType, class_handler : GCallback): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gsignal.h
*/
@extern def g_signal_parse_name(detailed_signal : Ptr[_root_.sn.gnome.glib.internal.gchar], itype : GType, signal_id_p : Ptr[_root_.sn.gnome.glib.internal.guint], detail_p : Ptr[_root_.sn.gnome.glib.internal.GQuark], force_detail_quark : _root_.sn.gnome.glib.internal.gboolean): _root_.sn.gnome.glib.internal.gboolean = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gsignal.h
*/
@extern def g_signal_query(signal_id : _root_.sn.gnome.glib.internal.guint, query : Ptr[GSignalQuery]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gsignal.h
*/
@extern def g_signal_remove_emission_hook(signal_id : _root_.sn.gnome.glib.internal.guint, hook_id : _root_.sn.gnome.glib.internal.gulong): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gsignal.h
*/
@extern def g_signal_set_va_marshaller(signal_id : _root_.sn.gnome.glib.internal.guint, instance_type : GType, va_marshaller : GSignalCVaMarshaller): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gsignal.h
*/
@extern def g_signal_stop_emission(instance : _root_.sn.gnome.glib.internal.gpointer, signal_id : _root_.sn.gnome.glib.internal.guint, detail : _root_.sn.gnome.glib.internal.GQuark): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gsignal.h
*/
@extern def g_signal_stop_emission_by_name(instance : _root_.sn.gnome.glib.internal.gpointer, detailed_signal : Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gclosure.h
*/
@extern def g_signal_type_cclosure_new(itype : GType, struct_offset : _root_.sn.gnome.glib.internal.guint): Ptr[GClosure] = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/glib-types.h
*/
@extern def g_source_get_type(): GType = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gsourceclosure.h
*/
@extern def g_source_set_closure(source : Ptr[_root_.sn.gnome.glib.internal.GSource], closure : Ptr[GClosure]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gsourceclosure.h
*/
@extern def g_source_set_dummy_callback(source : Ptr[_root_.sn.gnome.glib.internal.GSource]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gvaluetypes.h
*/
@extern def g_strdup_value_contents(value : Ptr[GValue]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/glib-types.h
*/
@extern def g_strv_builder_get_type(): GType = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/glib-types.h
*/
@extern def g_strv_get_type(): GType = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/glib-types.h
*/
@extern def g_thread_get_type(): GType = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/glib-types.h
*/
@extern def g_time_zone_get_type(): GType = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/glib-types.h
*/
@extern def g_tree_get_type(): GType = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gtype.h
*/
@extern def g_type_add_class_cache_func(cache_data : _root_.sn.gnome.glib.internal.gpointer, cache_func : GTypeClassCacheFunc): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gtype.h
*/
@extern def g_type_add_class_private(class_type : GType, private_size : _root_.sn.gnome.glib.internal.gsize): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gtype.h
*/
@extern def g_type_add_instance_private(class_type : GType, private_size : _root_.sn.gnome.glib.internal.gsize): _root_.sn.gnome.glib.internal.gint = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gtype.h
*/
@extern def g_type_add_interface_check(check_data : _root_.sn.gnome.glib.internal.gpointer, check_func : GTypeInterfaceCheckFunc): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gtype.h
*/
@extern def g_type_add_interface_dynamic(instance_type : GType, interface_type : GType, plugin : Ptr[GTypePlugin]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gtype.h
*/
@extern def g_type_add_interface_static(instance_type : GType, interface_type : GType, info : Ptr[GInterfaceInfo]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gtype.h
*/
@extern def g_type_check_class_cast(g_class : Ptr[GTypeClass], is_a_type : GType): Ptr[GTypeClass] = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gtype.h
*/
@extern def g_type_check_class_is_a(g_class : Ptr[GTypeClass], is_a_type : GType): _root_.sn.gnome.glib.internal.gboolean = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gtype.h
*/
@extern def g_type_check_instance(instance : Ptr[GTypeInstance]): _root_.sn.gnome.glib.internal.gboolean = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gtype.h
*/
@extern def g_type_check_instance_cast(instance : Ptr[GTypeInstance], iface_type : GType): Ptr[GTypeInstance] = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gtype.h
*/
@extern def g_type_check_instance_is_a(instance : Ptr[GTypeInstance], iface_type : GType): _root_.sn.gnome.glib.internal.gboolean = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gtype.h
*/
@extern def g_type_check_instance_is_fundamentally_a(instance : Ptr[GTypeInstance], fundamental_type : GType): _root_.sn.gnome.glib.internal.gboolean = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gtype.h
*/
@extern def g_type_check_is_value_type(`type` : GType): _root_.sn.gnome.glib.internal.gboolean = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gtype.h
*/
@extern def g_type_check_value(value : Ptr[GValue]): _root_.sn.gnome.glib.internal.gboolean = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gtype.h
*/
@extern def g_type_check_value_holds(value : Ptr[GValue], `type` : GType): _root_.sn.gnome.glib.internal.gboolean = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gtype.h
*/
@extern def g_type_children(`type` : GType, n_children : Ptr[_root_.sn.gnome.glib.internal.guint]): Ptr[GType] = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gtype.h
*/
@extern def g_type_class_add_private(g_class : _root_.sn.gnome.glib.internal.gpointer, private_size : _root_.sn.gnome.glib.internal.gsize): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gtype.h
*/
@extern def g_type_class_adjust_private_offset(g_class : _root_.sn.gnome.glib.internal.gpointer, private_size_or_offset : Ptr[_root_.sn.gnome.glib.internal.gint]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gtype.h
*/
@extern def g_type_class_get_instance_private_offset(g_class : _root_.sn.gnome.glib.internal.gpointer): _root_.sn.gnome.glib.internal.gint = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gtype.h
*/
@extern def g_type_class_get_private(klass : Ptr[GTypeClass], private_type : GType): _root_.sn.gnome.glib.internal.gpointer = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gtype.h
*/
@extern def g_type_class_peek(`type` : GType): _root_.sn.gnome.glib.internal.gpointer = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gtype.h
*/
@extern def g_type_class_peek_parent(g_class : _root_.sn.gnome.glib.internal.gpointer): _root_.sn.gnome.glib.internal.gpointer = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gtype.h
*/
@extern def g_type_class_peek_static(`type` : GType): _root_.sn.gnome.glib.internal.gpointer = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gtype.h
*/
@extern def g_type_class_ref(`type` : GType): _root_.sn.gnome.glib.internal.gpointer = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gtype.h
*/
@extern def g_type_class_unref(g_class : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gtype.h
*/
@extern def g_type_class_unref_uncached(g_class : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gtype.h
*/
@extern def g_type_create_instance(`type` : GType): Ptr[GTypeInstance] = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gtype.h
*/
@extern def g_type_default_interface_peek(g_type : GType): _root_.sn.gnome.glib.internal.gpointer = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gtype.h
*/
@extern def g_type_default_interface_ref(g_type : GType): _root_.sn.gnome.glib.internal.gpointer = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gtype.h
*/
@extern def g_type_default_interface_unref(g_iface : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gtype.h
*/
@extern def g_type_depth(`type` : GType): _root_.sn.gnome.glib.internal.guint = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gtype.h
*/
@extern def g_type_ensure(`type` : GType): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gtype.h
*/
@extern def g_type_free_instance(instance : Ptr[GTypeInstance]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gtype.h
*/
@extern def g_type_from_name(name : Ptr[_root_.sn.gnome.glib.internal.gchar]): GType = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gtype.h
*/
@extern def g_type_fundamental(type_id : GType): GType = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gtype.h
*/
@extern def g_type_fundamental_next(): GType = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gtype.h
*/
@extern def g_type_get_instance_count(`type` : GType): CInt = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gtype.h
*/
@extern def g_type_get_plugin(`type` : GType): Ptr[GTypePlugin] = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gtype.h
*/
@extern def g_type_get_qdata(`type` : GType, quark : _root_.sn.gnome.glib.internal.GQuark): _root_.sn.gnome.glib.internal.gpointer = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gtype.h
*/
@extern def g_type_get_type_registration_serial(): _root_.sn.gnome.glib.internal.guint = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gtype.h
*/
@extern def g_type_init(): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gtype.h
*/
@extern def g_type_init_with_debug_flags(debug_flags : GTypeDebugFlags): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gtype.h
*/
@extern def g_type_instance_get_private(instance : Ptr[GTypeInstance], private_type : GType): _root_.sn.gnome.glib.internal.gpointer = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gtype.h
*/
@extern def g_type_interface_add_prerequisite(interface_type : GType, prerequisite_type : GType): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gtype.h
*/
@extern def g_type_interface_get_plugin(instance_type : GType, interface_type : GType): Ptr[GTypePlugin] = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gtype.h
*/
@extern def g_type_interface_instantiatable_prerequisite(interface_type : GType): GType = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gtype.h
*/
@extern def g_type_interface_peek(instance_class : _root_.sn.gnome.glib.internal.gpointer, iface_type : GType): _root_.sn.gnome.glib.internal.gpointer = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gtype.h
*/
@extern def g_type_interface_peek_parent(g_iface : _root_.sn.gnome.glib.internal.gpointer): _root_.sn.gnome.glib.internal.gpointer = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gtype.h
*/
@extern def g_type_interface_prerequisites(interface_type : GType, n_prerequisites : Ptr[_root_.sn.gnome.glib.internal.guint]): Ptr[GType] = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gtype.h
*/
@extern def g_type_interfaces(`type` : GType, n_interfaces : Ptr[_root_.sn.gnome.glib.internal.guint]): Ptr[GType] = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gtype.h
*/
@extern def g_type_is_a(`type` : GType, is_a_type : GType): _root_.sn.gnome.glib.internal.gboolean = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gtypemodule.h
*/
@extern def g_type_module_add_interface(module : Ptr[GTypeModule], instance_type : GType, interface_type : GType, interface_info : Ptr[GInterfaceInfo]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gtypemodule.h
*/
@extern def g_type_module_get_type(): GType = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gtypemodule.h
*/
@extern def g_type_module_register_enum(module : Ptr[GTypeModule], name : Ptr[_root_.sn.gnome.glib.internal.gchar], const_static_values : Ptr[GEnumValue]): GType = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gtypemodule.h
*/
@extern def g_type_module_register_flags(module : Ptr[GTypeModule], name : Ptr[_root_.sn.gnome.glib.internal.gchar], const_static_values : Ptr[GFlagsValue]): GType = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gtypemodule.h
*/
@extern def g_type_module_register_type(module : Ptr[GTypeModule], parent_type : GType, type_name : Ptr[_root_.sn.gnome.glib.internal.gchar], type_info : Ptr[GTypeInfo], flags : GTypeFlags): GType = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gtypemodule.h
*/
@extern def g_type_module_set_name(module : Ptr[GTypeModule], name : Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gtypemodule.h
*/
@extern def g_type_module_unuse(module : Ptr[GTypeModule]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gtypemodule.h
*/
@extern def g_type_module_use(module : Ptr[GTypeModule]): _root_.sn.gnome.glib.internal.gboolean = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gtype.h
*/
@extern def g_type_name(`type` : GType): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gtype.h
*/
@extern def g_type_name_from_class(g_class : Ptr[GTypeClass]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gtype.h
*/
@extern def g_type_name_from_instance(instance : Ptr[GTypeInstance]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gtype.h
*/
@extern def g_type_next_base(leaf_type : GType, root_type : GType): GType = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gtype.h
*/
@extern def g_type_parent(`type` : GType): GType = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gtypeplugin.h
*/
@extern def g_type_plugin_complete_interface_info(plugin : Ptr[GTypePlugin], instance_type : GType, interface_type : GType, info : Ptr[GInterfaceInfo]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gtypeplugin.h
*/
@extern def g_type_plugin_complete_type_info(plugin : Ptr[GTypePlugin], g_type : GType, info : Ptr[GTypeInfo], value_table : Ptr[GTypeValueTable]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gtypeplugin.h
*/
@extern def g_type_plugin_get_type(): GType = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gtypeplugin.h
*/
@extern def g_type_plugin_unuse(plugin : Ptr[GTypePlugin]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gtypeplugin.h
*/
@extern def g_type_plugin_use(plugin : Ptr[GTypePlugin]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gtype.h
*/
@extern def g_type_qname(`type` : GType): _root_.sn.gnome.glib.internal.GQuark = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gtype.h
*/
@extern def g_type_query(`type` : GType, query : Ptr[GTypeQuery]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gtype.h
*/
@extern def g_type_register_dynamic(parent_type : GType, type_name : Ptr[_root_.sn.gnome.glib.internal.gchar], plugin : Ptr[GTypePlugin], flags : GTypeFlags): GType = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gtype.h
*/
@extern def g_type_register_fundamental(type_id : GType, type_name : Ptr[_root_.sn.gnome.glib.internal.gchar], info : Ptr[GTypeInfo], finfo : Ptr[GTypeFundamentalInfo], flags : GTypeFlags): GType = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gtype.h
*/
@extern def g_type_register_static(parent_type : GType, type_name : Ptr[_root_.sn.gnome.glib.internal.gchar], info : Ptr[GTypeInfo], flags : GTypeFlags): GType = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gtype.h
*/
@extern def g_type_register_static_simple(parent_type : GType, type_name : Ptr[_root_.sn.gnome.glib.internal.gchar], class_size : _root_.sn.gnome.glib.internal.guint, class_init : GClassInitFunc, instance_size : _root_.sn.gnome.glib.internal.guint, instance_init : GInstanceInitFunc, flags : GTypeFlags): GType = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gtype.h
*/
@extern def g_type_remove_class_cache_func(cache_data : _root_.sn.gnome.glib.internal.gpointer, cache_func : GTypeClassCacheFunc): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gtype.h
*/
@extern def g_type_remove_interface_check(check_data : _root_.sn.gnome.glib.internal.gpointer, check_func : GTypeInterfaceCheckFunc): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gtype.h
*/
@extern def g_type_set_qdata(`type` : GType, quark : _root_.sn.gnome.glib.internal.GQuark, data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gtype.h
*/
@extern def g_type_test_flags(`type` : GType, flags : _root_.sn.gnome.glib.internal.guint): _root_.sn.gnome.glib.internal.gboolean = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gtype.h
*/
@extern def g_type_value_table_peek(`type` : GType): Ptr[GTypeValueTable] = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/glib-enumtypes.h
*/
@extern def g_unicode_break_type_get_type(): GType = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/glib-enumtypes.h
*/
@extern def g_unicode_script_get_type(): GType = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/glib-enumtypes.h
*/
@extern def g_unicode_type_get_type(): GType = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/glib-types.h
*/
@extern def g_uri_get_type(): GType = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gvaluearray.h
*/
@extern def g_value_array_append(value_array : Ptr[GValueArray], value : Ptr[GValue]): Ptr[GValueArray] = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gvaluearray.h
*/
@extern def g_value_array_copy(value_array : Ptr[GValueArray]): Ptr[GValueArray] = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gvaluearray.h
*/
@extern def g_value_array_free(value_array : Ptr[GValueArray]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gvaluearray.h
*/
@extern def g_value_array_get_nth(value_array : Ptr[GValueArray], `index_` : _root_.sn.gnome.glib.internal.guint): Ptr[GValue] = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gvaluearray.h
*/
@extern def g_value_array_get_type(): GType = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gvaluearray.h
*/
@extern def g_value_array_insert(value_array : Ptr[GValueArray], `index_` : _root_.sn.gnome.glib.internal.guint, value : Ptr[GValue]): Ptr[GValueArray] = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gvaluearray.h
*/
@extern def g_value_array_new(n_prealloced : _root_.sn.gnome.glib.internal.guint): Ptr[GValueArray] = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gvaluearray.h
*/
@extern def g_value_array_prepend(value_array : Ptr[GValueArray], value : Ptr[GValue]): Ptr[GValueArray] = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gvaluearray.h
*/
@extern def g_value_array_remove(value_array : Ptr[GValueArray], `index_` : _root_.sn.gnome.glib.internal.guint): Ptr[GValueArray] = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gvaluearray.h
*/
@extern def g_value_array_sort(value_array : Ptr[GValueArray], compare_func : _root_.sn.gnome.glib.internal.GCompareFunc): Ptr[GValueArray] = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gvaluearray.h
*/
@extern def g_value_array_sort_with_data(value_array : Ptr[GValueArray], compare_func : _root_.sn.gnome.glib.internal.GCompareDataFunc, user_data : _root_.sn.gnome.glib.internal.gpointer): Ptr[GValueArray] = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gvalue.h
*/
@extern def g_value_copy(src_value : Ptr[GValue], dest_value : Ptr[GValue]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gboxed.h
*/
@extern def g_value_dup_boxed(value : Ptr[GValue]): _root_.sn.gnome.glib.internal.gpointer = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject.h
*/
@extern def g_value_dup_object(value : Ptr[GValue]): _root_.sn.gnome.glib.internal.gpointer = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gparam.h
*/
@extern def g_value_dup_param(value : Ptr[GValue]): Ptr[GParamSpec] = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gvaluetypes.h
*/
@extern def g_value_dup_string(value : Ptr[GValue]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gvaluetypes.h
*/
@extern def g_value_dup_variant(value : Ptr[GValue]): Ptr[_root_.sn.gnome.glib.internal.GVariant] = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gvalue.h
*/
@extern def g_value_fits_pointer(value : Ptr[GValue]): _root_.sn.gnome.glib.internal.gboolean = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gvaluetypes.h
*/
@extern def g_value_get_boolean(value : Ptr[GValue]): _root_.sn.gnome.glib.internal.gboolean = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gboxed.h
*/
@extern def g_value_get_boxed(value : Ptr[GValue]): _root_.sn.gnome.glib.internal.gpointer = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gvaluetypes.h
*/
@extern def g_value_get_char(value : Ptr[GValue]): _root_.sn.gnome.glib.internal.gchar = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gvaluetypes.h
*/
@extern def g_value_get_double(value : Ptr[GValue]): _root_.sn.gnome.glib.internal.gdouble = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/genums.h
*/
@extern def g_value_get_enum(value : Ptr[GValue]): _root_.sn.gnome.glib.internal.gint = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/genums.h
*/
@extern def g_value_get_flags(value : Ptr[GValue]): _root_.sn.gnome.glib.internal.guint = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gvaluetypes.h
*/
@extern def g_value_get_float(value : Ptr[GValue]): _root_.sn.gnome.glib.internal.gfloat = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gvaluetypes.h
*/
@extern def g_value_get_gtype(value : Ptr[GValue]): GType = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gvaluetypes.h
*/
@extern def g_value_get_int(value : Ptr[GValue]): _root_.sn.gnome.glib.internal.gint = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gvaluetypes.h
*/
@extern def g_value_get_int64(value : Ptr[GValue]): _root_.sn.gnome.glib.internal.gint64 = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gvaluetypes.h
*/
@extern def g_value_get_long(value : Ptr[GValue]): _root_.sn.gnome.glib.internal.glong = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject.h
*/
@extern def g_value_get_object(value : Ptr[GValue]): _root_.sn.gnome.glib.internal.gpointer = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gparam.h
*/
@extern def g_value_get_param(value : Ptr[GValue]): Ptr[GParamSpec] = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gvaluetypes.h
*/
@extern def g_value_get_pointer(value : Ptr[GValue]): _root_.sn.gnome.glib.internal.gpointer = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gvaluetypes.h
*/
@extern def g_value_get_schar(value : Ptr[GValue]): _root_.sn.gnome.glib.internal.gint8 = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gvaluetypes.h
*/
@extern def g_value_get_string(value : Ptr[GValue]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gboxed.h
*/
@extern def g_value_get_type(): GType = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gvaluetypes.h
*/
@extern def g_value_get_uchar(value : Ptr[GValue]): _root_.sn.gnome.glib.internal.guchar = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gvaluetypes.h
*/
@extern def g_value_get_uint(value : Ptr[GValue]): _root_.sn.gnome.glib.internal.guint = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gvaluetypes.h
*/
@extern def g_value_get_uint64(value : Ptr[GValue]): _root_.sn.gnome.glib.internal.guint64 = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gvaluetypes.h
*/
@extern def g_value_get_ulong(value : Ptr[GValue]): _root_.sn.gnome.glib.internal.gulong = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gvaluetypes.h
*/
@extern def g_value_get_variant(value : Ptr[GValue]): Ptr[_root_.sn.gnome.glib.internal.GVariant] = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gvalue.h
*/
@extern def g_value_init(value : Ptr[GValue], g_type : GType): Ptr[GValue] = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gvalue.h
*/
@extern def g_value_init_from_instance(value : Ptr[GValue], instance : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gvalue.h
*/
@extern def g_value_peek_pointer(value : Ptr[GValue]): _root_.sn.gnome.glib.internal.gpointer = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gvalue.h
*/
@extern def g_value_register_transform_func(src_type : GType, dest_type : GType, transform_func : GValueTransform): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gvalue.h
*/
@extern def g_value_reset(value : Ptr[GValue]): Ptr[GValue] = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gvaluetypes.h
*/
@extern def g_value_set_boolean(value : Ptr[GValue], v_boolean : _root_.sn.gnome.glib.internal.gboolean): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gboxed.h
*/
@extern def g_value_set_boxed(value : Ptr[GValue], v_boxed : _root_.sn.gnome.glib.internal.gconstpointer): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gboxed.h
*/
@extern def g_value_set_boxed_take_ownership(value : Ptr[GValue], v_boxed : _root_.sn.gnome.glib.internal.gconstpointer): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gvaluetypes.h
*/
@extern def g_value_set_char(value : Ptr[GValue], v_char : _root_.sn.gnome.glib.internal.gchar): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gvaluetypes.h
*/
@extern def g_value_set_double(value : Ptr[GValue], v_double : _root_.sn.gnome.glib.internal.gdouble): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/genums.h
*/
@extern def g_value_set_enum(value : Ptr[GValue], v_enum : _root_.sn.gnome.glib.internal.gint): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/genums.h
*/
@extern def g_value_set_flags(value : Ptr[GValue], v_flags : _root_.sn.gnome.glib.internal.guint): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gvaluetypes.h
*/
@extern def g_value_set_float(value : Ptr[GValue], v_float : _root_.sn.gnome.glib.internal.gfloat): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gvaluetypes.h
*/
@extern def g_value_set_gtype(value : Ptr[GValue], v_gtype : GType): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gvalue.h
*/
@extern def g_value_set_instance(value : Ptr[GValue], instance : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gvaluetypes.h
*/
@extern def g_value_set_int(value : Ptr[GValue], v_int : _root_.sn.gnome.glib.internal.gint): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gvaluetypes.h
*/
@extern def g_value_set_int64(value : Ptr[GValue], v_int64 : _root_.sn.gnome.glib.internal.gint64): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gvaluetypes.h
*/
@extern def g_value_set_interned_string(value : Ptr[GValue], v_string : Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gvaluetypes.h
*/
@extern def g_value_set_long(value : Ptr[GValue], v_long : _root_.sn.gnome.glib.internal.glong): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject.h
*/
@extern def g_value_set_object(value : Ptr[GValue], v_object : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject.h
*/
@extern def g_value_set_object_take_ownership(value : Ptr[GValue], v_object : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gparam.h
*/
@extern def g_value_set_param(value : Ptr[GValue], param : Ptr[GParamSpec]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gparam.h
*/
@extern def g_value_set_param_take_ownership(value : Ptr[GValue], param : Ptr[GParamSpec]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gvaluetypes.h
*/
@extern def g_value_set_pointer(value : Ptr[GValue], v_pointer : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gvaluetypes.h
*/
@extern def g_value_set_schar(value : Ptr[GValue], v_char : _root_.sn.gnome.glib.internal.gint8): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gboxed.h
*/
@extern def g_value_set_static_boxed(value : Ptr[GValue], v_boxed : _root_.sn.gnome.glib.internal.gconstpointer): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gvaluetypes.h
*/
@extern def g_value_set_static_string(value : Ptr[GValue], v_string : Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gvaluetypes.h
*/
@extern def g_value_set_string(value : Ptr[GValue], v_string : Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gvaluetypes.h
*/
@extern def g_value_set_string_take_ownership(value : Ptr[GValue], v_string : Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gvaluetypes.h
*/
@extern def g_value_set_uchar(value : Ptr[GValue], v_uchar : _root_.sn.gnome.glib.internal.guchar): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gvaluetypes.h
*/
@extern def g_value_set_uint(value : Ptr[GValue], v_uint : _root_.sn.gnome.glib.internal.guint): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gvaluetypes.h
*/
@extern def g_value_set_uint64(value : Ptr[GValue], v_uint64 : _root_.sn.gnome.glib.internal.guint64): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gvaluetypes.h
*/
@extern def g_value_set_ulong(value : Ptr[GValue], v_ulong : _root_.sn.gnome.glib.internal.gulong): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gvaluetypes.h
*/
@extern def g_value_set_variant(value : Ptr[GValue], variant : Ptr[_root_.sn.gnome.glib.internal.GVariant]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gvaluetypes.h
*/
@extern def g_value_steal_string(value : Ptr[GValue]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gboxed.h
*/
@extern def g_value_take_boxed(value : Ptr[GValue], v_boxed : _root_.sn.gnome.glib.internal.gconstpointer): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject.h
*/
@extern def g_value_take_object(value : Ptr[GValue], v_object : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gparam.h
*/
@extern def g_value_take_param(value : Ptr[GValue], param : Ptr[GParamSpec]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gvaluetypes.h
*/
@extern def g_value_take_string(value : Ptr[GValue], v_string : Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gvaluetypes.h
*/
@extern def g_value_take_variant(value : Ptr[GValue], variant : Ptr[_root_.sn.gnome.glib.internal.GVariant]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gvalue.h
*/
@extern def g_value_transform(src_value : Ptr[GValue], dest_value : Ptr[GValue]): _root_.sn.gnome.glib.internal.gboolean = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gvalue.h
*/
@extern def g_value_type_compatible(src_type : GType, dest_type : GType): _root_.sn.gnome.glib.internal.gboolean = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gvalue.h
*/
@extern def g_value_type_transformable(src_type : GType, dest_type : GType): _root_.sn.gnome.glib.internal.gboolean = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gvalue.h
*/
@extern def g_value_unset(value : Ptr[GValue]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/glib-types.h
*/
@extern def g_variant_builder_get_type(): GType = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/glib-types.h
*/
@extern def g_variant_dict_get_type(): GType = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/glib-types.h
*/
@extern def g_variant_get_gtype(): GType = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/glib-types.h
*/
@extern def g_variant_type_get_gtype(): GType = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject.h
*/
@extern def g_weak_ref_clear(weak_ref : Ptr[GWeakRef]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject.h
*/
@extern def g_weak_ref_get(weak_ref : Ptr[GWeakRef]): _root_.sn.gnome.glib.internal.gpointer = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject.h
*/
@extern def g_weak_ref_init(weak_ref : Ptr[GWeakRef], `object` : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject.h
*/
@extern def g_weak_ref_set(weak_ref : Ptr[GWeakRef], `object` : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject-autocleanups.h
*/
@extern def glib_auto_cleanup_GValue(_ptr : Ptr[GValue]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject-autocleanups.h
*/
@extern def glib_autoptr_cleanup_GClosure(_ptr : Ptr[Ptr[GClosure]]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject-autocleanups.h
*/
@extern def glib_autoptr_cleanup_GEnumClass(_ptr : Ptr[Ptr[GEnumClass]]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject-autocleanups.h
*/
@extern def glib_autoptr_cleanup_GFlagsClass(_ptr : Ptr[Ptr[GFlagsClass]]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject-autocleanups.h
*/
@extern def glib_autoptr_cleanup_GInitiallyUnowned(_ptr : Ptr[Ptr[GInitiallyUnowned]]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject-autocleanups.h
*/
@extern def glib_autoptr_cleanup_GObject(_ptr : Ptr[Ptr[GObject]]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject-autocleanups.h
*/
@extern def glib_autoptr_cleanup_GParamSpec(_ptr : Ptr[Ptr[GParamSpec]]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject-autocleanups.h
*/
@extern def glib_autoptr_cleanup_GTypeClass(_ptr : Ptr[Ptr[GTypeClass]]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gtypemodule.h
*/
@extern def glib_autoptr_cleanup_GTypeModule(_ptr : Ptr[Ptr[GTypeModule]]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject-autocleanups.h
*/
@extern def glib_autoptr_clear_GClosure(_ptr : Ptr[GClosure]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject-autocleanups.h
*/
@extern def glib_autoptr_clear_GEnumClass(_ptr : Ptr[GEnumClass]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject-autocleanups.h
*/
@extern def glib_autoptr_clear_GFlagsClass(_ptr : Ptr[GFlagsClass]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject-autocleanups.h
*/
@extern def glib_autoptr_clear_GInitiallyUnowned(_ptr : Ptr[GInitiallyUnowned]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject-autocleanups.h
*/
@extern def glib_autoptr_clear_GObject(_ptr : Ptr[GObject]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject-autocleanups.h
*/
@extern def glib_autoptr_clear_GParamSpec(_ptr : Ptr[GParamSpec]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject-autocleanups.h
*/
@extern def glib_autoptr_clear_GTypeClass(_ptr : Ptr[GTypeClass]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gtypemodule.h
*/
@extern def glib_autoptr_clear_GTypeModule(_ptr : Ptr[GTypeModule]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject-autocleanups.h
*/
@extern def glib_listautoptr_cleanup_GClosure(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject-autocleanups.h
*/
@extern def glib_listautoptr_cleanup_GEnumClass(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject-autocleanups.h
*/
@extern def glib_listautoptr_cleanup_GFlagsClass(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject-autocleanups.h
*/
@extern def glib_listautoptr_cleanup_GInitiallyUnowned(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject-autocleanups.h
*/
@extern def glib_listautoptr_cleanup_GObject(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject-autocleanups.h
*/
@extern def glib_listautoptr_cleanup_GParamSpec(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject-autocleanups.h
*/
@extern def glib_listautoptr_cleanup_GTypeClass(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gtypemodule.h
*/
@extern def glib_listautoptr_cleanup_GTypeModule(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject-autocleanups.h
*/
@extern def glib_queueautoptr_cleanup_GClosure(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject-autocleanups.h
*/
@extern def glib_queueautoptr_cleanup_GEnumClass(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject-autocleanups.h
*/
@extern def glib_queueautoptr_cleanup_GFlagsClass(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject-autocleanups.h
*/
@extern def glib_queueautoptr_cleanup_GInitiallyUnowned(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject-autocleanups.h
*/
@extern def glib_queueautoptr_cleanup_GObject(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject-autocleanups.h
*/
@extern def glib_queueautoptr_cleanup_GParamSpec(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject-autocleanups.h
*/
@extern def glib_queueautoptr_cleanup_GTypeClass(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gtypemodule.h
*/
@extern def glib_queueautoptr_cleanup_GTypeModule(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject-autocleanups.h
*/
@extern def glib_slistautoptr_cleanup_GClosure(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject-autocleanups.h
*/
@extern def glib_slistautoptr_cleanup_GEnumClass(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject-autocleanups.h
*/
@extern def glib_slistautoptr_cleanup_GFlagsClass(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject-autocleanups.h
*/
@extern def glib_slistautoptr_cleanup_GInitiallyUnowned(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject-autocleanups.h
*/
@extern def glib_slistautoptr_cleanup_GObject(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject-autocleanups.h
*/
@extern def glib_slistautoptr_cleanup_GParamSpec(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject-autocleanups.h
*/
@extern def glib_slistautoptr_cleanup_GTypeClass(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

/**
 * [bindgen] header: /usr/include/glib-2.0/gobject/gtypemodule.h
*/
@extern def glib_slistautoptr_cleanup_GTypeModule(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern