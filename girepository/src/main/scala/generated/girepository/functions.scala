package girepository

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

@extern def g_irepository_dump(arg : CString, error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_irepository_enumerate_versions(repository : Ptr[GIRepository], `namespace_` : Ptr[_root_.sn.gnome.glib.internal.gchar]): Ptr[_root_.sn.gnome.glib.internal.GList] = extern

@extern def g_irepository_error_quark(): _root_.sn.gnome.glib.internal.GQuark = extern

@extern def g_irepository_find_by_error_domain(repository : Ptr[GIRepository], domain : _root_.sn.gnome.glib.internal.GQuark): Ptr[GIEnumInfo] = extern

@extern def g_irepository_find_by_gtype(repository : Ptr[GIRepository], gtype : _root_.sn.gnome.gobject.internal.GType): Ptr[GIBaseInfo] = extern

@extern def g_irepository_find_by_name(repository : Ptr[GIRepository], `namespace_` : Ptr[_root_.sn.gnome.glib.internal.gchar], name : Ptr[_root_.sn.gnome.glib.internal.gchar]): Ptr[GIBaseInfo] = extern

@extern def g_irepository_get_c_prefix(repository : Ptr[GIRepository], `namespace_` : Ptr[_root_.sn.gnome.glib.internal.gchar]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def g_irepository_get_default(): Ptr[GIRepository] = extern

@extern def g_irepository_get_dependencies(repository : Ptr[GIRepository], `namespace_` : Ptr[_root_.sn.gnome.glib.internal.gchar]): Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]] = extern

@extern def g_irepository_get_immediate_dependencies(repository : Ptr[GIRepository], `namespace_` : Ptr[_root_.sn.gnome.glib.internal.gchar]): Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]] = extern

@extern def g_irepository_get_info(repository : Ptr[GIRepository], `namespace_` : Ptr[_root_.sn.gnome.glib.internal.gchar], index : _root_.sn.gnome.glib.internal.gint): Ptr[GIBaseInfo] = extern

@extern def g_irepository_get_loaded_namespaces(repository : Ptr[GIRepository]): Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]] = extern

@extern def g_irepository_get_n_infos(repository : Ptr[GIRepository], `namespace_` : Ptr[_root_.sn.gnome.glib.internal.gchar]): _root_.sn.gnome.glib.internal.gint = extern

@extern def g_irepository_get_object_gtype_interfaces(repository : Ptr[GIRepository], gtype : _root_.sn.gnome.gobject.internal.GType, n_interfaces_out : Ptr[_root_.sn.gnome.glib.internal.guint], interfaces_out : Ptr[Ptr[Ptr[GIInterfaceInfo]]]): Unit = extern

@extern def g_irepository_get_option_group(): Ptr[_root_.sn.gnome.glib.internal.GOptionGroup] = extern

@extern def g_irepository_get_search_path(): Ptr[_root_.sn.gnome.glib.internal.GSList] = extern

@extern def g_irepository_get_shared_library(repository : Ptr[GIRepository], `namespace_` : Ptr[_root_.sn.gnome.glib.internal.gchar]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def g_irepository_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_irepository_get_typelib_path(repository : Ptr[GIRepository], `namespace_` : Ptr[_root_.sn.gnome.glib.internal.gchar]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def g_irepository_get_version(repository : Ptr[GIRepository], `namespace_` : Ptr[_root_.sn.gnome.glib.internal.gchar]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def g_irepository_is_registered(repository : Ptr[GIRepository], `namespace_` : Ptr[_root_.sn.gnome.glib.internal.gchar], version : Ptr[_root_.sn.gnome.glib.internal.gchar]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_irepository_load_typelib(repository : Ptr[GIRepository], typelib : Ptr[GITypelib], flags : GIRepositoryLoadFlags, error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): CString = extern

@extern def g_irepository_prepend_library_path(directory : CString): Unit = extern

@extern def g_irepository_prepend_search_path(directory : CString): Unit = extern

@extern def g_irepository_require(repository : Ptr[GIRepository], `namespace_` : Ptr[_root_.sn.gnome.glib.internal.gchar], version : Ptr[_root_.sn.gnome.glib.internal.gchar], flags : GIRepositoryLoadFlags, error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GITypelib] = extern

@extern def g_irepository_require_private(repository : Ptr[GIRepository], typelib_dir : Ptr[_root_.sn.gnome.glib.internal.gchar], `namespace_` : Ptr[_root_.sn.gnome.glib.internal.gchar], version : Ptr[_root_.sn.gnome.glib.internal.gchar], flags : GIRepositoryLoadFlags, error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GITypelib] = extern

@extern def gi_cclosure_marshal_generic(closure : Ptr[_root_.sn.gnome.gobject.internal.GClosure], return_gvalue : Ptr[_root_.sn.gnome.gobject.internal.GValue], n_param_values : _root_.sn.gnome.glib.internal.guint, param_values : Ptr[_root_.sn.gnome.gobject.internal.GValue], invocation_hint : _root_.sn.gnome.glib.internal.gpointer, marshal_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern