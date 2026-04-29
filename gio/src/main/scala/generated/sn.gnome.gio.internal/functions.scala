package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

@extern def G_DEBUG_CONTROLLER_DBUS(ptr : _root_.sn.gnome.glib.internal.gpointer): Ptr[GDebugControllerDBus] = extern

@extern def G_DEBUG_CONTROLLER_DBUS_CLASS(ptr : _root_.sn.gnome.glib.internal.gpointer): Ptr[GDebugControllerDBusClass] = extern

@extern def G_DEBUG_CONTROLLER_DBUS_GET_CLASS(ptr : _root_.sn.gnome.glib.internal.gpointer): Ptr[GDebugControllerDBusClass] = extern

@extern def G_IS_DEBUG_CONTROLLER_DBUS(ptr : _root_.sn.gnome.glib.internal.gpointer): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def G_IS_DEBUG_CONTROLLER_DBUS_CLASS(ptr : _root_.sn.gnome.glib.internal.gpointer): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def G_IS_LIST_MODEL(ptr : _root_.sn.gnome.glib.internal.gpointer): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def G_IS_LIST_STORE(ptr : _root_.sn.gnome.glib.internal.gpointer): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def G_LIST_MODEL(ptr : _root_.sn.gnome.glib.internal.gpointer): Ptr[GListModel] = extern

@extern def G_LIST_MODEL_GET_IFACE(ptr : _root_.sn.gnome.glib.internal.gpointer): Ptr[GListModelInterface] = extern

@extern def G_LIST_STORE(ptr : _root_.sn.gnome.glib.internal.gpointer): Ptr[GListStore] = extern

@extern def g_IS_debug_controller(ptr : _root_.sn.gnome.glib.internal.gpointer): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_IS_memory_monitor(ptr : _root_.sn.gnome.glib.internal.gpointer): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_IS_power_profile_monitor(ptr : _root_.sn.gnome.glib.internal.gpointer): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_action_activate(action : Ptr[GAction], parameter : Ptr[_root_.sn.gnome.glib.internal.GVariant]): Unit = extern

@extern def g_action_change_state(action : Ptr[GAction], value : Ptr[_root_.sn.gnome.glib.internal.GVariant]): Unit = extern

@extern def g_action_get_enabled(action : Ptr[GAction]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_action_get_name(action : Ptr[GAction]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def g_action_get_parameter_type(action : Ptr[GAction]): Ptr[_root_.sn.gnome.glib.internal.GVariantType] = extern

@extern def g_action_get_state(action : Ptr[GAction]): Ptr[_root_.sn.gnome.glib.internal.GVariant] = extern

@extern def g_action_get_state_hint(action : Ptr[GAction]): Ptr[_root_.sn.gnome.glib.internal.GVariant] = extern

@extern def g_action_get_state_type(action : Ptr[GAction]): Ptr[_root_.sn.gnome.glib.internal.GVariantType] = extern

@extern def g_action_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_action_group_action_added(action_group : Ptr[GActionGroup], action_name : Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = extern

@extern def g_action_group_action_enabled_changed(action_group : Ptr[GActionGroup], action_name : Ptr[_root_.sn.gnome.glib.internal.gchar], enabled : _root_.sn.gnome.glib.internal.gboolean): Unit = extern

@extern def g_action_group_action_removed(action_group : Ptr[GActionGroup], action_name : Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = extern

@extern def g_action_group_action_state_changed(action_group : Ptr[GActionGroup], action_name : Ptr[_root_.sn.gnome.glib.internal.gchar], state : Ptr[_root_.sn.gnome.glib.internal.GVariant]): Unit = extern

@extern def g_action_group_activate_action(action_group : Ptr[GActionGroup], action_name : Ptr[_root_.sn.gnome.glib.internal.gchar], parameter : Ptr[_root_.sn.gnome.glib.internal.GVariant]): Unit = extern

@extern def g_action_group_change_action_state(action_group : Ptr[GActionGroup], action_name : Ptr[_root_.sn.gnome.glib.internal.gchar], value : Ptr[_root_.sn.gnome.glib.internal.GVariant]): Unit = extern

@extern def g_action_group_get_action_enabled(action_group : Ptr[GActionGroup], action_name : Ptr[_root_.sn.gnome.glib.internal.gchar]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_action_group_get_action_parameter_type(action_group : Ptr[GActionGroup], action_name : Ptr[_root_.sn.gnome.glib.internal.gchar]): Ptr[_root_.sn.gnome.glib.internal.GVariantType] = extern

@extern def g_action_group_get_action_state(action_group : Ptr[GActionGroup], action_name : Ptr[_root_.sn.gnome.glib.internal.gchar]): Ptr[_root_.sn.gnome.glib.internal.GVariant] = extern

@extern def g_action_group_get_action_state_hint(action_group : Ptr[GActionGroup], action_name : Ptr[_root_.sn.gnome.glib.internal.gchar]): Ptr[_root_.sn.gnome.glib.internal.GVariant] = extern

@extern def g_action_group_get_action_state_type(action_group : Ptr[GActionGroup], action_name : Ptr[_root_.sn.gnome.glib.internal.gchar]): Ptr[_root_.sn.gnome.glib.internal.GVariantType] = extern

@extern def g_action_group_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_action_group_has_action(action_group : Ptr[GActionGroup], action_name : Ptr[_root_.sn.gnome.glib.internal.gchar]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_action_group_list_actions(action_group : Ptr[GActionGroup]): Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]] = extern

@extern def g_action_group_query_action(action_group : Ptr[GActionGroup], action_name : Ptr[_root_.sn.gnome.glib.internal.gchar], enabled : Ptr[_root_.sn.gnome.glib.internal.gboolean], parameter_type : Ptr[Ptr[_root_.sn.gnome.glib.internal.GVariantType]], state_type : Ptr[Ptr[_root_.sn.gnome.glib.internal.GVariantType]], state_hint : Ptr[Ptr[_root_.sn.gnome.glib.internal.GVariant]], state : Ptr[Ptr[_root_.sn.gnome.glib.internal.GVariant]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_action_map_add_action(action_map : Ptr[GActionMap], action : Ptr[GAction]): Unit = extern

@extern def g_action_map_add_action_entries(action_map : Ptr[GActionMap], entries : Ptr[GActionEntry], n_entries : _root_.sn.gnome.glib.internal.gint, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_action_map_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_action_map_lookup_action(action_map : Ptr[GActionMap], action_name : Ptr[_root_.sn.gnome.glib.internal.gchar]): Ptr[GAction] = extern

@extern def g_action_map_remove_action(action_map : Ptr[GActionMap], action_name : Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = extern

@extern def g_action_map_remove_action_entries(action_map : Ptr[GActionMap], entries : Ptr[GActionEntry], n_entries : _root_.sn.gnome.glib.internal.gint): Unit = extern

@extern def g_action_name_is_valid(action_name : Ptr[_root_.sn.gnome.glib.internal.gchar]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_action_parse_detailed_name(detailed_name : Ptr[_root_.sn.gnome.glib.internal.gchar], action_name : Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]], target_value : Ptr[Ptr[_root_.sn.gnome.glib.internal.GVariant]], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_action_print_detailed_name(action_name : Ptr[_root_.sn.gnome.glib.internal.gchar], target_value : Ptr[_root_.sn.gnome.glib.internal.GVariant]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def g_app_info_add_supports_type(appinfo : Ptr[GAppInfo], content_type : CString, error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_app_info_can_delete(appinfo : Ptr[GAppInfo]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_app_info_can_remove_supports_type(appinfo : Ptr[GAppInfo]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_app_info_create_flags_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_app_info_create_from_commandline(commandline : CString, application_name : CString, flags : GAppInfoCreateFlags, error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GAppInfo] = extern

@extern def g_app_info_delete(appinfo : Ptr[GAppInfo]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_app_info_dup(appinfo : Ptr[GAppInfo]): Ptr[GAppInfo] = extern

@extern def g_app_info_equal(appinfo1 : Ptr[GAppInfo], appinfo2 : Ptr[GAppInfo]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_app_info_get_all(): Ptr[_root_.sn.gnome.glib.internal.GList] = extern

@extern def g_app_info_get_all_for_type(content_type : CString): Ptr[_root_.sn.gnome.glib.internal.GList] = extern

@extern def g_app_info_get_commandline(appinfo : Ptr[GAppInfo]): CString = extern

@extern def g_app_info_get_default_for_type(content_type : CString, must_support_uris : _root_.sn.gnome.glib.internal.gboolean): Ptr[GAppInfo] = extern

@extern def g_app_info_get_default_for_type_async(content_type : CString, must_support_uris : _root_.sn.gnome.glib.internal.gboolean, cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_app_info_get_default_for_type_finish(result : Ptr[GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GAppInfo] = extern

@extern def g_app_info_get_default_for_uri_scheme(uri_scheme : CString): Ptr[GAppInfo] = extern

@extern def g_app_info_get_default_for_uri_scheme_async(uri_scheme : CString, cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_app_info_get_default_for_uri_scheme_finish(result : Ptr[GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GAppInfo] = extern

@extern def g_app_info_get_description(appinfo : Ptr[GAppInfo]): CString = extern

@extern def g_app_info_get_display_name(appinfo : Ptr[GAppInfo]): CString = extern

@extern def g_app_info_get_executable(appinfo : Ptr[GAppInfo]): CString = extern

@extern def g_app_info_get_fallback_for_type(content_type : Ptr[_root_.sn.gnome.glib.internal.gchar]): Ptr[_root_.sn.gnome.glib.internal.GList] = extern

@extern def g_app_info_get_icon(appinfo : Ptr[GAppInfo]): Ptr[GIcon] = extern

@extern def g_app_info_get_id(appinfo : Ptr[GAppInfo]): CString = extern

@extern def g_app_info_get_name(appinfo : Ptr[GAppInfo]): CString = extern

@extern def g_app_info_get_recommended_for_type(content_type : Ptr[_root_.sn.gnome.glib.internal.gchar]): Ptr[_root_.sn.gnome.glib.internal.GList] = extern

@extern def g_app_info_get_supported_types(appinfo : Ptr[GAppInfo]): Ptr[CString] = extern

@extern def g_app_info_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_app_info_launch(appinfo : Ptr[GAppInfo], files : Ptr[_root_.sn.gnome.glib.internal.GList], context : Ptr[GAppLaunchContext], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_app_info_launch_default_for_uri(uri : CString, context : Ptr[GAppLaunchContext], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_app_info_launch_default_for_uri_async(uri : CString, context : Ptr[GAppLaunchContext], cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_app_info_launch_default_for_uri_finish(result : Ptr[GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_app_info_launch_uris(appinfo : Ptr[GAppInfo], uris : Ptr[_root_.sn.gnome.glib.internal.GList], context : Ptr[GAppLaunchContext], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_app_info_launch_uris_async(appinfo : Ptr[GAppInfo], uris : Ptr[_root_.sn.gnome.glib.internal.GList], context : Ptr[GAppLaunchContext], cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_app_info_launch_uris_finish(appinfo : Ptr[GAppInfo], result : Ptr[GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_app_info_monitor_get(): Ptr[GAppInfoMonitor] = extern

@extern def g_app_info_monitor_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_app_info_remove_supports_type(appinfo : Ptr[GAppInfo], content_type : CString, error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_app_info_reset_type_associations(content_type : CString): Unit = extern

@extern def g_app_info_set_as_default_for_extension(appinfo : Ptr[GAppInfo], extension : CString, error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_app_info_set_as_default_for_type(appinfo : Ptr[GAppInfo], content_type : CString, error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_app_info_set_as_last_used_for_type(appinfo : Ptr[GAppInfo], content_type : CString, error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_app_info_should_show(appinfo : Ptr[GAppInfo]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_app_info_supports_files(appinfo : Ptr[GAppInfo]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_app_info_supports_uris(appinfo : Ptr[GAppInfo]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_app_launch_context_get_display(context : Ptr[GAppLaunchContext], info : Ptr[GAppInfo], files : Ptr[_root_.sn.gnome.glib.internal.GList]): CString = extern

@extern def g_app_launch_context_get_environment(context : Ptr[GAppLaunchContext]): Ptr[CString] = extern

@extern def g_app_launch_context_get_startup_notify_id(context : Ptr[GAppLaunchContext], info : Ptr[GAppInfo], files : Ptr[_root_.sn.gnome.glib.internal.GList]): CString = extern

@extern def g_app_launch_context_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_app_launch_context_launch_failed(context : Ptr[GAppLaunchContext], startup_notify_id : CString): Unit = extern

@extern def g_app_launch_context_new(): Ptr[GAppLaunchContext] = extern

@extern def g_app_launch_context_setenv(context : Ptr[GAppLaunchContext], variable : CString, value : CString): Unit = extern

@extern def g_app_launch_context_unsetenv(context : Ptr[GAppLaunchContext], variable : CString): Unit = extern

@extern def g_application_activate(application : Ptr[GApplication]): Unit = extern

@extern def g_application_add_main_option(application : Ptr[GApplication], long_name : CString, short_name : CChar, flags : _root_.sn.gnome.glib.internal.GOptionFlags, arg : _root_.sn.gnome.glib.internal.GOptionArg, description : CString, arg_description : CString): Unit = extern

@extern def g_application_add_main_option_entries(application : Ptr[GApplication], entries : Ptr[_root_.sn.gnome.glib.internal.GOptionEntry]): Unit = extern

@extern def g_application_add_option_group(application : Ptr[GApplication], group : Ptr[_root_.sn.gnome.glib.internal.GOptionGroup]): Unit = extern

@extern def g_application_bind_busy_property(application : Ptr[GApplication], `object` : _root_.sn.gnome.glib.internal.gpointer, property : Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = extern

@extern def g_application_command_line_create_file_for_arg(cmdline : Ptr[GApplicationCommandLine], arg : Ptr[_root_.sn.gnome.glib.internal.gchar]): Ptr[GFile] = extern

@extern def g_application_command_line_done(cmdline : Ptr[GApplicationCommandLine]): Unit = extern

@extern def g_application_command_line_get_arguments(cmdline : Ptr[GApplicationCommandLine], argc : Ptr[CInt]): Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]] = extern

@extern def g_application_command_line_get_cwd(cmdline : Ptr[GApplicationCommandLine]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def g_application_command_line_get_environ(cmdline : Ptr[GApplicationCommandLine]): Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]] = extern

@extern def g_application_command_line_get_exit_status(cmdline : Ptr[GApplicationCommandLine]): CInt = extern

@extern def g_application_command_line_get_is_remote(cmdline : Ptr[GApplicationCommandLine]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_application_command_line_get_options_dict(cmdline : Ptr[GApplicationCommandLine]): Ptr[_root_.sn.gnome.glib.internal.GVariantDict] = extern

@extern def g_application_command_line_get_platform_data(cmdline : Ptr[GApplicationCommandLine]): Ptr[_root_.sn.gnome.glib.internal.GVariant] = extern

@extern def g_application_command_line_get_stdin(cmdline : Ptr[GApplicationCommandLine]): Ptr[GInputStream] = extern

@extern def g_application_command_line_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_application_command_line_getenv(cmdline : Ptr[GApplicationCommandLine], name : Ptr[_root_.sn.gnome.glib.internal.gchar]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def g_application_command_line_print(cmdline : Ptr[GApplicationCommandLine], format : Ptr[_root_.sn.gnome.glib.internal.gchar], rest: Any*): Unit = extern

@extern def g_application_command_line_print_literal(cmdline : Ptr[GApplicationCommandLine], message : Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = extern

@extern def g_application_command_line_printerr(cmdline : Ptr[GApplicationCommandLine], format : Ptr[_root_.sn.gnome.glib.internal.gchar], rest: Any*): Unit = extern

@extern def g_application_command_line_printerr_literal(cmdline : Ptr[GApplicationCommandLine], message : Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = extern

@extern def g_application_command_line_set_exit_status(cmdline : Ptr[GApplicationCommandLine], exit_status : CInt): Unit = extern

@extern def g_application_flags_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_application_get_application_id(application : Ptr[GApplication]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def g_application_get_dbus_connection(application : Ptr[GApplication]): Ptr[GDBusConnection] = extern

@extern def g_application_get_dbus_object_path(application : Ptr[GApplication]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def g_application_get_default(): Ptr[GApplication] = extern

@extern def g_application_get_flags(application : Ptr[GApplication]): GApplicationFlags = extern

@extern def g_application_get_inactivity_timeout(application : Ptr[GApplication]): _root_.sn.gnome.glib.internal.guint = extern

@extern def g_application_get_is_busy(application : Ptr[GApplication]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_application_get_is_registered(application : Ptr[GApplication]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_application_get_is_remote(application : Ptr[GApplication]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_application_get_resource_base_path(application : Ptr[GApplication]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def g_application_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_application_get_version(application : Ptr[GApplication]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def g_application_hold(application : Ptr[GApplication]): Unit = extern

@extern def g_application_id_is_valid(application_id : Ptr[_root_.sn.gnome.glib.internal.gchar]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_application_mark_busy(application : Ptr[GApplication]): Unit = extern

@extern def g_application_new(application_id : Ptr[_root_.sn.gnome.glib.internal.gchar], flags : GApplicationFlags): Ptr[GApplication] = extern

@extern def g_application_open(application : Ptr[GApplication], files : Ptr[Ptr[GFile]], n_files : _root_.sn.gnome.glib.internal.gint, hint : Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = extern

@extern def g_application_quit(application : Ptr[GApplication]): Unit = extern

@extern def g_application_register(application : Ptr[GApplication], cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_application_release(application : Ptr[GApplication]): Unit = extern

@extern def g_application_run(application : Ptr[GApplication], argc : CInt, argv : Ptr[CString]): CInt = extern

@extern def g_application_send_notification(application : Ptr[GApplication], id : Ptr[_root_.sn.gnome.glib.internal.gchar], notification : Ptr[GNotification]): Unit = extern

@extern def g_application_set_action_group(application : Ptr[GApplication], action_group : Ptr[GActionGroup]): Unit = extern

@extern def g_application_set_application_id(application : Ptr[GApplication], application_id : Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = extern

@extern def g_application_set_default(application : Ptr[GApplication]): Unit = extern

@extern def g_application_set_flags(application : Ptr[GApplication], flags : GApplicationFlags): Unit = extern

@extern def g_application_set_inactivity_timeout(application : Ptr[GApplication], inactivity_timeout : _root_.sn.gnome.glib.internal.guint): Unit = extern

@extern def g_application_set_option_context_description(application : Ptr[GApplication], description : Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = extern

@extern def g_application_set_option_context_parameter_string(application : Ptr[GApplication], parameter_string : Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = extern

@extern def g_application_set_option_context_summary(application : Ptr[GApplication], summary : Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = extern

@extern def g_application_set_resource_base_path(application : Ptr[GApplication], resource_path : Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = extern

@extern def g_application_set_version(application : Ptr[GApplication], version : Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = extern

@extern def g_application_unbind_busy_property(application : Ptr[GApplication], `object` : _root_.sn.gnome.glib.internal.gpointer, property : Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = extern

@extern def g_application_unmark_busy(application : Ptr[GApplication]): Unit = extern

@extern def g_application_withdraw_notification(application : Ptr[GApplication], id : Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = extern

@extern def g_ask_password_flags_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_async_initable_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_async_initable_init_async(initable : Ptr[GAsyncInitable], io_priority : CInt, cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_async_initable_init_finish(initable : Ptr[GAsyncInitable], res : Ptr[GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_async_initable_new_async(object_type : _root_.sn.gnome.gobject.internal.GType, io_priority : CInt, cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer, first_property_name : Ptr[_root_.sn.gnome.glib.internal.gchar], rest: Any*): Unit = extern

@extern def g_async_initable_new_finish(initable : Ptr[GAsyncInitable], res : Ptr[GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[_root_.sn.gnome.gobject.internal.GObject] = extern

@extern def g_async_initable_new_valist_async(object_type : _root_.sn.gnome.gobject.internal.GType, first_property_name : Ptr[_root_.sn.gnome.glib.internal.gchar], var_args : va_list, io_priority : CInt, cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_async_initable_newv_async(object_type : _root_.sn.gnome.gobject.internal.GType, n_parameters : _root_.sn.gnome.glib.internal.guint, parameters : Ptr[_root_.sn.gnome.gobject.internal.GParameter], io_priority : CInt, cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_async_result_get_source_object(res : Ptr[GAsyncResult]): Ptr[_root_.sn.gnome.gobject.internal.GObject] = extern

@extern def g_async_result_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_async_result_get_user_data(res : Ptr[GAsyncResult]): _root_.sn.gnome.glib.internal.gpointer = extern

@extern def g_async_result_is_tagged(res : Ptr[GAsyncResult], source_tag : _root_.sn.gnome.glib.internal.gpointer): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_async_result_legacy_propagate_error(res : Ptr[GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_buffered_input_stream_fill(stream : Ptr[GBufferedInputStream], count : _root_.sn.gnome.glib.internal.gssize, cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gssize = extern

@extern def g_buffered_input_stream_fill_async(stream : Ptr[GBufferedInputStream], count : _root_.sn.gnome.glib.internal.gssize, io_priority : CInt, cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_buffered_input_stream_fill_finish(stream : Ptr[GBufferedInputStream], result : Ptr[GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gssize = extern

@extern def g_buffered_input_stream_get_available(stream : Ptr[GBufferedInputStream]): _root_.sn.gnome.glib.internal.gsize = extern

@extern def g_buffered_input_stream_get_buffer_size(stream : Ptr[GBufferedInputStream]): _root_.sn.gnome.glib.internal.gsize = extern

@extern def g_buffered_input_stream_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_buffered_input_stream_new(base_stream : Ptr[GInputStream]): Ptr[GInputStream] = extern

@extern def g_buffered_input_stream_new_sized(base_stream : Ptr[GInputStream], size : _root_.sn.gnome.glib.internal.gsize): Ptr[GInputStream] = extern

@extern def g_buffered_input_stream_peek(stream : Ptr[GBufferedInputStream], buffer : Ptr[Byte], offset : _root_.sn.gnome.glib.internal.gsize, count : _root_.sn.gnome.glib.internal.gsize): _root_.sn.gnome.glib.internal.gsize = extern

@extern def g_buffered_input_stream_peek_buffer(stream : Ptr[GBufferedInputStream], count : Ptr[_root_.sn.gnome.glib.internal.gsize]): Ptr[Byte] = extern

@extern def g_buffered_input_stream_read_byte(stream : Ptr[GBufferedInputStream], cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): CInt = extern

@extern def g_buffered_input_stream_set_buffer_size(stream : Ptr[GBufferedInputStream], size : _root_.sn.gnome.glib.internal.gsize): Unit = extern

@extern def g_buffered_output_stream_get_auto_grow(stream : Ptr[GBufferedOutputStream]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_buffered_output_stream_get_buffer_size(stream : Ptr[GBufferedOutputStream]): _root_.sn.gnome.glib.internal.gsize = extern

@extern def g_buffered_output_stream_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_buffered_output_stream_new(base_stream : Ptr[GOutputStream]): Ptr[GOutputStream] = extern

@extern def g_buffered_output_stream_new_sized(base_stream : Ptr[GOutputStream], size : _root_.sn.gnome.glib.internal.gsize): Ptr[GOutputStream] = extern

@extern def g_buffered_output_stream_set_auto_grow(stream : Ptr[GBufferedOutputStream], auto_grow : _root_.sn.gnome.glib.internal.gboolean): Unit = extern

@extern def g_buffered_output_stream_set_buffer_size(stream : Ptr[GBufferedOutputStream], size : _root_.sn.gnome.glib.internal.gsize): Unit = extern

@extern def g_bus_get(bus_type : GBusType, cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_bus_get_finish(res : Ptr[GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GDBusConnection] = extern

@extern def g_bus_get_sync(bus_type : GBusType, cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GDBusConnection] = extern

@extern def g_bus_name_owner_flags_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_bus_name_watcher_flags_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_bus_own_name(bus_type : GBusType, name : Ptr[_root_.sn.gnome.glib.internal.gchar], flags : GBusNameOwnerFlags, bus_acquired_handler : GBusAcquiredCallback, name_acquired_handler : GBusNameAcquiredCallback, name_lost_handler : GBusNameLostCallback, user_data : _root_.sn.gnome.glib.internal.gpointer, user_data_free_func : _root_.sn.gnome.glib.internal.GDestroyNotify): _root_.sn.gnome.glib.internal.guint = extern

@extern def g_bus_own_name_on_connection(connection : Ptr[GDBusConnection], name : Ptr[_root_.sn.gnome.glib.internal.gchar], flags : GBusNameOwnerFlags, name_acquired_handler : GBusNameAcquiredCallback, name_lost_handler : GBusNameLostCallback, user_data : _root_.sn.gnome.glib.internal.gpointer, user_data_free_func : _root_.sn.gnome.glib.internal.GDestroyNotify): _root_.sn.gnome.glib.internal.guint = extern

@extern def g_bus_own_name_on_connection_with_closures(connection : Ptr[GDBusConnection], name : Ptr[_root_.sn.gnome.glib.internal.gchar], flags : GBusNameOwnerFlags, name_acquired_closure : Ptr[_root_.sn.gnome.gobject.internal.GClosure], name_lost_closure : Ptr[_root_.sn.gnome.gobject.internal.GClosure]): _root_.sn.gnome.glib.internal.guint = extern

@extern def g_bus_own_name_with_closures(bus_type : GBusType, name : Ptr[_root_.sn.gnome.glib.internal.gchar], flags : GBusNameOwnerFlags, bus_acquired_closure : Ptr[_root_.sn.gnome.gobject.internal.GClosure], name_acquired_closure : Ptr[_root_.sn.gnome.gobject.internal.GClosure], name_lost_closure : Ptr[_root_.sn.gnome.gobject.internal.GClosure]): _root_.sn.gnome.glib.internal.guint = extern

@extern def g_bus_type_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_bus_unown_name(owner_id : _root_.sn.gnome.glib.internal.guint): Unit = extern

@extern def g_bus_unwatch_name(watcher_id : _root_.sn.gnome.glib.internal.guint): Unit = extern

@extern def g_bus_watch_name(bus_type : GBusType, name : Ptr[_root_.sn.gnome.glib.internal.gchar], flags : GBusNameWatcherFlags, name_appeared_handler : GBusNameAppearedCallback, name_vanished_handler : GBusNameVanishedCallback, user_data : _root_.sn.gnome.glib.internal.gpointer, user_data_free_func : _root_.sn.gnome.glib.internal.GDestroyNotify): _root_.sn.gnome.glib.internal.guint = extern

@extern def g_bus_watch_name_on_connection(connection : Ptr[GDBusConnection], name : Ptr[_root_.sn.gnome.glib.internal.gchar], flags : GBusNameWatcherFlags, name_appeared_handler : GBusNameAppearedCallback, name_vanished_handler : GBusNameVanishedCallback, user_data : _root_.sn.gnome.glib.internal.gpointer, user_data_free_func : _root_.sn.gnome.glib.internal.GDestroyNotify): _root_.sn.gnome.glib.internal.guint = extern

@extern def g_bus_watch_name_on_connection_with_closures(connection : Ptr[GDBusConnection], name : Ptr[_root_.sn.gnome.glib.internal.gchar], flags : GBusNameWatcherFlags, name_appeared_closure : Ptr[_root_.sn.gnome.gobject.internal.GClosure], name_vanished_closure : Ptr[_root_.sn.gnome.gobject.internal.GClosure]): _root_.sn.gnome.glib.internal.guint = extern

@extern def g_bus_watch_name_with_closures(bus_type : GBusType, name : Ptr[_root_.sn.gnome.glib.internal.gchar], flags : GBusNameWatcherFlags, name_appeared_closure : Ptr[_root_.sn.gnome.gobject.internal.GClosure], name_vanished_closure : Ptr[_root_.sn.gnome.gobject.internal.GClosure]): _root_.sn.gnome.glib.internal.guint = extern

@extern def g_bytes_icon_get_bytes(icon : Ptr[GBytesIcon]): Ptr[_root_.sn.gnome.glib.internal.GBytes] = extern

@extern def g_bytes_icon_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_bytes_icon_new(bytes : Ptr[_root_.sn.gnome.glib.internal.GBytes]): Ptr[GIcon] = extern

@extern def g_cancellable_cancel(cancellable : Ptr[GCancellable]): Unit = extern

@extern def g_cancellable_connect(cancellable : Ptr[GCancellable], callback : _root_.sn.gnome.gobject.internal.GCallback, data : _root_.sn.gnome.glib.internal.gpointer, data_destroy_func : _root_.sn.gnome.glib.internal.GDestroyNotify): _root_.sn.gnome.glib.internal.gulong = extern

@extern def g_cancellable_disconnect(cancellable : Ptr[GCancellable], handler_id : _root_.sn.gnome.glib.internal.gulong): Unit = extern

@extern def g_cancellable_get_current(): Ptr[GCancellable] = extern

@extern def g_cancellable_get_fd(cancellable : Ptr[GCancellable]): CInt = extern

@extern def g_cancellable_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_cancellable_is_cancelled(cancellable : Ptr[GCancellable]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_cancellable_make_pollfd(cancellable : Ptr[GCancellable], pollfd : Ptr[_root_.sn.gnome.glib.internal.GPollFD]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_cancellable_new(): Ptr[GCancellable] = extern

@extern def g_cancellable_pop_current(cancellable : Ptr[GCancellable]): Unit = extern

@extern def g_cancellable_push_current(cancellable : Ptr[GCancellable]): Unit = extern

@extern def g_cancellable_release_fd(cancellable : Ptr[GCancellable]): Unit = extern

@extern def g_cancellable_reset(cancellable : Ptr[GCancellable]): Unit = extern

@extern def g_cancellable_set_error_if_cancelled(cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_cancellable_source_new(cancellable : Ptr[GCancellable]): Ptr[_root_.sn.gnome.glib.internal.GSource] = extern

@extern def g_charset_converter_get_num_fallbacks(converter : Ptr[GCharsetConverter]): _root_.sn.gnome.glib.internal.guint = extern

@extern def g_charset_converter_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_charset_converter_get_use_fallback(converter : Ptr[GCharsetConverter]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_charset_converter_new(to_charset : Ptr[_root_.sn.gnome.glib.internal.gchar], from_charset : Ptr[_root_.sn.gnome.glib.internal.gchar], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GCharsetConverter] = extern

@extern def g_charset_converter_set_use_fallback(converter : Ptr[GCharsetConverter], use_fallback : _root_.sn.gnome.glib.internal.gboolean): Unit = extern

@extern def g_content_type_can_be_executable(`type` : Ptr[_root_.sn.gnome.glib.internal.gchar]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_content_type_equals(type1 : Ptr[_root_.sn.gnome.glib.internal.gchar], type2 : Ptr[_root_.sn.gnome.glib.internal.gchar]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_content_type_from_mime_type(mime_type : Ptr[_root_.sn.gnome.glib.internal.gchar]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def g_content_type_get_description(`type` : Ptr[_root_.sn.gnome.glib.internal.gchar]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def g_content_type_get_generic_icon_name(`type` : Ptr[_root_.sn.gnome.glib.internal.gchar]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def g_content_type_get_icon(`type` : Ptr[_root_.sn.gnome.glib.internal.gchar]): Ptr[GIcon] = extern

@extern def g_content_type_get_mime_dirs(): Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]] = extern

@extern def g_content_type_get_mime_type(`type` : Ptr[_root_.sn.gnome.glib.internal.gchar]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def g_content_type_get_symbolic_icon(`type` : Ptr[_root_.sn.gnome.glib.internal.gchar]): Ptr[GIcon] = extern

@extern def g_content_type_guess(filename : Ptr[_root_.sn.gnome.glib.internal.gchar], data : Ptr[_root_.sn.gnome.glib.internal.guchar], data_size : _root_.sn.gnome.glib.internal.gsize, result_uncertain : Ptr[_root_.sn.gnome.glib.internal.gboolean]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def g_content_type_guess_for_tree(root : Ptr[GFile]): Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]] = extern

@extern def g_content_type_is_a(`type` : Ptr[_root_.sn.gnome.glib.internal.gchar], supertype : Ptr[_root_.sn.gnome.glib.internal.gchar]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_content_type_is_mime_type(`type` : Ptr[_root_.sn.gnome.glib.internal.gchar], mime_type : Ptr[_root_.sn.gnome.glib.internal.gchar]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_content_type_is_unknown(`type` : Ptr[_root_.sn.gnome.glib.internal.gchar]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_content_type_set_mime_dirs(dirs : Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]): Unit = extern

@extern def g_content_types_get_registered(): Ptr[_root_.sn.gnome.glib.internal.GList] = extern

@extern def g_converter_convert(converter : Ptr[GConverter], inbuf : Ptr[Byte], inbuf_size : _root_.sn.gnome.glib.internal.gsize, outbuf : Ptr[Byte], outbuf_size : _root_.sn.gnome.glib.internal.gsize, flags : GConverterFlags, bytes_read : Ptr[_root_.sn.gnome.glib.internal.gsize], bytes_written : Ptr[_root_.sn.gnome.glib.internal.gsize], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): GConverterResult = extern

@extern def g_converter_flags_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_converter_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_converter_input_stream_get_converter(converter_stream : Ptr[GConverterInputStream]): Ptr[GConverter] = extern

@extern def g_converter_input_stream_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_converter_input_stream_new(base_stream : Ptr[GInputStream], converter : Ptr[GConverter]): Ptr[GInputStream] = extern

@extern def g_converter_output_stream_get_converter(converter_stream : Ptr[GConverterOutputStream]): Ptr[GConverter] = extern

@extern def g_converter_output_stream_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_converter_output_stream_new(base_stream : Ptr[GOutputStream], converter : Ptr[GConverter]): Ptr[GOutputStream] = extern

@extern def g_converter_reset(converter : Ptr[GConverter]): Unit = extern

@extern def g_converter_result_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_credentials_get_native(credentials : Ptr[GCredentials], native_type : GCredentialsType): _root_.sn.gnome.glib.internal.gpointer = extern

@extern def g_credentials_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_credentials_get_unix_pid(credentials : Ptr[GCredentials], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): pid_t = extern

@extern def g_credentials_get_unix_user(credentials : Ptr[GCredentials], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): uid_t = extern

@extern def g_credentials_is_same_user(credentials : Ptr[GCredentials], other_credentials : Ptr[GCredentials], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_credentials_new(): Ptr[GCredentials] = extern

@extern def g_credentials_set_native(credentials : Ptr[GCredentials], native_type : GCredentialsType, native : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_credentials_set_unix_user(credentials : Ptr[GCredentials], uid : uid_t, error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_credentials_to_string(credentials : Ptr[GCredentials]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def g_credentials_type_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_data_input_stream_get_byte_order(stream : Ptr[GDataInputStream]): GDataStreamByteOrder = extern

@extern def g_data_input_stream_get_newline_type(stream : Ptr[GDataInputStream]): GDataStreamNewlineType = extern

@extern def g_data_input_stream_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_data_input_stream_new(base_stream : Ptr[GInputStream]): Ptr[GDataInputStream] = extern

@extern def g_data_input_stream_read_byte(stream : Ptr[GDataInputStream], cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.guchar = extern

@extern def g_data_input_stream_read_int16(stream : Ptr[GDataInputStream], cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gint16 = extern

@extern def g_data_input_stream_read_int32(stream : Ptr[GDataInputStream], cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gint32 = extern

@extern def g_data_input_stream_read_int64(stream : Ptr[GDataInputStream], cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gint64 = extern

@extern def g_data_input_stream_read_line(stream : Ptr[GDataInputStream], length : Ptr[_root_.sn.gnome.glib.internal.gsize], cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): CString = extern

@extern def g_data_input_stream_read_line_async(stream : Ptr[GDataInputStream], io_priority : _root_.sn.gnome.glib.internal.gint, cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_data_input_stream_read_line_finish(stream : Ptr[GDataInputStream], result : Ptr[GAsyncResult], length : Ptr[_root_.sn.gnome.glib.internal.gsize], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): CString = extern

@extern def g_data_input_stream_read_line_finish_utf8(stream : Ptr[GDataInputStream], result : Ptr[GAsyncResult], length : Ptr[_root_.sn.gnome.glib.internal.gsize], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): CString = extern

@extern def g_data_input_stream_read_line_utf8(stream : Ptr[GDataInputStream], length : Ptr[_root_.sn.gnome.glib.internal.gsize], cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): CString = extern

@extern def g_data_input_stream_read_uint16(stream : Ptr[GDataInputStream], cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.guint16 = extern

@extern def g_data_input_stream_read_uint32(stream : Ptr[GDataInputStream], cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.guint32 = extern

@extern def g_data_input_stream_read_uint64(stream : Ptr[GDataInputStream], cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.guint64 = extern

@extern def g_data_input_stream_read_until(stream : Ptr[GDataInputStream], stop_chars : Ptr[_root_.sn.gnome.glib.internal.gchar], length : Ptr[_root_.sn.gnome.glib.internal.gsize], cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): CString = extern

@extern def g_data_input_stream_read_until_async(stream : Ptr[GDataInputStream], stop_chars : Ptr[_root_.sn.gnome.glib.internal.gchar], io_priority : _root_.sn.gnome.glib.internal.gint, cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_data_input_stream_read_until_finish(stream : Ptr[GDataInputStream], result : Ptr[GAsyncResult], length : Ptr[_root_.sn.gnome.glib.internal.gsize], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): CString = extern

@extern def g_data_input_stream_read_upto(stream : Ptr[GDataInputStream], stop_chars : Ptr[_root_.sn.gnome.glib.internal.gchar], stop_chars_len : _root_.sn.gnome.glib.internal.gssize, length : Ptr[_root_.sn.gnome.glib.internal.gsize], cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): CString = extern

@extern def g_data_input_stream_read_upto_async(stream : Ptr[GDataInputStream], stop_chars : Ptr[_root_.sn.gnome.glib.internal.gchar], stop_chars_len : _root_.sn.gnome.glib.internal.gssize, io_priority : _root_.sn.gnome.glib.internal.gint, cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_data_input_stream_read_upto_finish(stream : Ptr[GDataInputStream], result : Ptr[GAsyncResult], length : Ptr[_root_.sn.gnome.glib.internal.gsize], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): CString = extern

@extern def g_data_input_stream_set_byte_order(stream : Ptr[GDataInputStream], order : GDataStreamByteOrder): Unit = extern

@extern def g_data_input_stream_set_newline_type(stream : Ptr[GDataInputStream], `type` : GDataStreamNewlineType): Unit = extern

@extern def g_data_output_stream_get_byte_order(stream : Ptr[GDataOutputStream]): GDataStreamByteOrder = extern

@extern def g_data_output_stream_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_data_output_stream_new(base_stream : Ptr[GOutputStream]): Ptr[GDataOutputStream] = extern

@extern def g_data_output_stream_put_byte(stream : Ptr[GDataOutputStream], data : _root_.sn.gnome.glib.internal.guchar, cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_data_output_stream_put_int16(stream : Ptr[GDataOutputStream], data : _root_.sn.gnome.glib.internal.gint16, cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_data_output_stream_put_int32(stream : Ptr[GDataOutputStream], data : _root_.sn.gnome.glib.internal.gint32, cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_data_output_stream_put_int64(stream : Ptr[GDataOutputStream], data : _root_.sn.gnome.glib.internal.gint64, cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_data_output_stream_put_string(stream : Ptr[GDataOutputStream], str : CString, cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_data_output_stream_put_uint16(stream : Ptr[GDataOutputStream], data : _root_.sn.gnome.glib.internal.guint16, cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_data_output_stream_put_uint32(stream : Ptr[GDataOutputStream], data : _root_.sn.gnome.glib.internal.guint32, cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_data_output_stream_put_uint64(stream : Ptr[GDataOutputStream], data : _root_.sn.gnome.glib.internal.guint64, cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_data_output_stream_set_byte_order(stream : Ptr[GDataOutputStream], order : GDataStreamByteOrder): Unit = extern

@extern def g_data_stream_byte_order_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_data_stream_newline_type_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_datagram_based_condition_check(datagram_based : Ptr[GDatagramBased], condition : _root_.sn.gnome.glib.internal.GIOCondition): _root_.sn.gnome.glib.internal.GIOCondition = extern

@extern def g_datagram_based_condition_wait(datagram_based : Ptr[GDatagramBased], condition : _root_.sn.gnome.glib.internal.GIOCondition, timeout : _root_.sn.gnome.glib.internal.gint64, cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_datagram_based_create_source(datagram_based : Ptr[GDatagramBased], condition : _root_.sn.gnome.glib.internal.GIOCondition, cancellable : Ptr[GCancellable]): Ptr[_root_.sn.gnome.glib.internal.GSource] = extern

@extern def g_datagram_based_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_datagram_based_receive_messages(datagram_based : Ptr[GDatagramBased], messages : Ptr[GInputMessage], num_messages : _root_.sn.gnome.glib.internal.guint, flags : _root_.sn.gnome.glib.internal.gint, timeout : _root_.sn.gnome.glib.internal.gint64, cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gint = extern

@extern def g_datagram_based_send_messages(datagram_based : Ptr[GDatagramBased], messages : Ptr[GOutputMessage], num_messages : _root_.sn.gnome.glib.internal.guint, flags : _root_.sn.gnome.glib.internal.gint, timeout : _root_.sn.gnome.glib.internal.gint64, cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gint = extern

@extern def g_dbus_action_group_get(connection : Ptr[GDBusConnection], bus_name : Ptr[_root_.sn.gnome.glib.internal.gchar], object_path : Ptr[_root_.sn.gnome.glib.internal.gchar]): Ptr[GDBusActionGroup] = extern

@extern def g_dbus_action_group_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_dbus_address_escape_value(string : Ptr[_root_.sn.gnome.glib.internal.gchar]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def g_dbus_address_get_for_bus_sync(bus_type : GBusType, cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def g_dbus_address_get_stream(address : Ptr[_root_.sn.gnome.glib.internal.gchar], cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_dbus_address_get_stream_finish(res : Ptr[GAsyncResult], out_guid : Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GIOStream] = extern

@extern def g_dbus_address_get_stream_sync(address : Ptr[_root_.sn.gnome.glib.internal.gchar], out_guid : Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]], cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GIOStream] = extern

@extern def g_dbus_annotation_info_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_dbus_annotation_info_lookup(annotations : Ptr[Ptr[GDBusAnnotationInfo]], name : Ptr[_root_.sn.gnome.glib.internal.gchar]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def g_dbus_annotation_info_ref(info : Ptr[GDBusAnnotationInfo]): Ptr[GDBusAnnotationInfo] = extern

@extern def g_dbus_annotation_info_unref(info : Ptr[GDBusAnnotationInfo]): Unit = extern

@extern def g_dbus_arg_info_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_dbus_arg_info_ref(info : Ptr[GDBusArgInfo]): Ptr[GDBusArgInfo] = extern

@extern def g_dbus_arg_info_unref(info : Ptr[GDBusArgInfo]): Unit = extern

@extern def g_dbus_auth_observer_allow_mechanism(observer : Ptr[GDBusAuthObserver], mechanism : Ptr[_root_.sn.gnome.glib.internal.gchar]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_dbus_auth_observer_authorize_authenticated_peer(observer : Ptr[GDBusAuthObserver], stream : Ptr[GIOStream], credentials : Ptr[GCredentials]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_dbus_auth_observer_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_dbus_auth_observer_new(): Ptr[GDBusAuthObserver] = extern

@extern def g_dbus_call_flags_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_dbus_capability_flags_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_dbus_connection_add_filter(connection : Ptr[GDBusConnection], filter_function : GDBusMessageFilterFunction, user_data : _root_.sn.gnome.glib.internal.gpointer, user_data_free_func : _root_.sn.gnome.glib.internal.GDestroyNotify): _root_.sn.gnome.glib.internal.guint = extern

@extern def g_dbus_connection_call(connection : Ptr[GDBusConnection], bus_name : Ptr[_root_.sn.gnome.glib.internal.gchar], object_path : Ptr[_root_.sn.gnome.glib.internal.gchar], interface_name : Ptr[_root_.sn.gnome.glib.internal.gchar], method_name : Ptr[_root_.sn.gnome.glib.internal.gchar], parameters : Ptr[_root_.sn.gnome.glib.internal.GVariant], reply_type : Ptr[_root_.sn.gnome.glib.internal.GVariantType], flags : GDBusCallFlags, timeout_msec : _root_.sn.gnome.glib.internal.gint, cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_dbus_connection_call_finish(connection : Ptr[GDBusConnection], res : Ptr[GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[_root_.sn.gnome.glib.internal.GVariant] = extern

@extern def g_dbus_connection_call_sync(connection : Ptr[GDBusConnection], bus_name : Ptr[_root_.sn.gnome.glib.internal.gchar], object_path : Ptr[_root_.sn.gnome.glib.internal.gchar], interface_name : Ptr[_root_.sn.gnome.glib.internal.gchar], method_name : Ptr[_root_.sn.gnome.glib.internal.gchar], parameters : Ptr[_root_.sn.gnome.glib.internal.GVariant], reply_type : Ptr[_root_.sn.gnome.glib.internal.GVariantType], flags : GDBusCallFlags, timeout_msec : _root_.sn.gnome.glib.internal.gint, cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[_root_.sn.gnome.glib.internal.GVariant] = extern

@extern def g_dbus_connection_call_with_unix_fd_list(connection : Ptr[GDBusConnection], bus_name : Ptr[_root_.sn.gnome.glib.internal.gchar], object_path : Ptr[_root_.sn.gnome.glib.internal.gchar], interface_name : Ptr[_root_.sn.gnome.glib.internal.gchar], method_name : Ptr[_root_.sn.gnome.glib.internal.gchar], parameters : Ptr[_root_.sn.gnome.glib.internal.GVariant], reply_type : Ptr[_root_.sn.gnome.glib.internal.GVariantType], flags : GDBusCallFlags, timeout_msec : _root_.sn.gnome.glib.internal.gint, fd_list : Ptr[GUnixFDList], cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_dbus_connection_call_with_unix_fd_list_finish(connection : Ptr[GDBusConnection], out_fd_list : Ptr[Ptr[GUnixFDList]], res : Ptr[GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[_root_.sn.gnome.glib.internal.GVariant] = extern

@extern def g_dbus_connection_call_with_unix_fd_list_sync(connection : Ptr[GDBusConnection], bus_name : Ptr[_root_.sn.gnome.glib.internal.gchar], object_path : Ptr[_root_.sn.gnome.glib.internal.gchar], interface_name : Ptr[_root_.sn.gnome.glib.internal.gchar], method_name : Ptr[_root_.sn.gnome.glib.internal.gchar], parameters : Ptr[_root_.sn.gnome.glib.internal.GVariant], reply_type : Ptr[_root_.sn.gnome.glib.internal.GVariantType], flags : GDBusCallFlags, timeout_msec : _root_.sn.gnome.glib.internal.gint, fd_list : Ptr[GUnixFDList], out_fd_list : Ptr[Ptr[GUnixFDList]], cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[_root_.sn.gnome.glib.internal.GVariant] = extern

@extern def g_dbus_connection_close(connection : Ptr[GDBusConnection], cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_dbus_connection_close_finish(connection : Ptr[GDBusConnection], res : Ptr[GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_dbus_connection_close_sync(connection : Ptr[GDBusConnection], cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_dbus_connection_emit_signal(connection : Ptr[GDBusConnection], destination_bus_name : Ptr[_root_.sn.gnome.glib.internal.gchar], object_path : Ptr[_root_.sn.gnome.glib.internal.gchar], interface_name : Ptr[_root_.sn.gnome.glib.internal.gchar], signal_name : Ptr[_root_.sn.gnome.glib.internal.gchar], parameters : Ptr[_root_.sn.gnome.glib.internal.GVariant], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_dbus_connection_export_action_group(connection : Ptr[GDBusConnection], object_path : Ptr[_root_.sn.gnome.glib.internal.gchar], action_group : Ptr[GActionGroup], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.guint = extern

@extern def g_dbus_connection_export_menu_model(connection : Ptr[GDBusConnection], object_path : Ptr[_root_.sn.gnome.glib.internal.gchar], menu : Ptr[GMenuModel], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.guint = extern

@extern def g_dbus_connection_flags_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_dbus_connection_flush(connection : Ptr[GDBusConnection], cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_dbus_connection_flush_finish(connection : Ptr[GDBusConnection], res : Ptr[GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_dbus_connection_flush_sync(connection : Ptr[GDBusConnection], cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_dbus_connection_get_capabilities(connection : Ptr[GDBusConnection]): GDBusCapabilityFlags = extern

@extern def g_dbus_connection_get_exit_on_close(connection : Ptr[GDBusConnection]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_dbus_connection_get_flags(connection : Ptr[GDBusConnection]): GDBusConnectionFlags = extern

@extern def g_dbus_connection_get_guid(connection : Ptr[GDBusConnection]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def g_dbus_connection_get_last_serial(connection : Ptr[GDBusConnection]): _root_.sn.gnome.glib.internal.guint32 = extern

@extern def g_dbus_connection_get_peer_credentials(connection : Ptr[GDBusConnection]): Ptr[GCredentials] = extern

@extern def g_dbus_connection_get_stream(connection : Ptr[GDBusConnection]): Ptr[GIOStream] = extern

@extern def g_dbus_connection_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_dbus_connection_get_unique_name(connection : Ptr[GDBusConnection]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def g_dbus_connection_is_closed(connection : Ptr[GDBusConnection]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_dbus_connection_new(stream : Ptr[GIOStream], guid : Ptr[_root_.sn.gnome.glib.internal.gchar], flags : GDBusConnectionFlags, observer : Ptr[GDBusAuthObserver], cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_dbus_connection_new_finish(res : Ptr[GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GDBusConnection] = extern

@extern def g_dbus_connection_new_for_address(address : Ptr[_root_.sn.gnome.glib.internal.gchar], flags : GDBusConnectionFlags, observer : Ptr[GDBusAuthObserver], cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_dbus_connection_new_for_address_finish(res : Ptr[GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GDBusConnection] = extern

@extern def g_dbus_connection_new_for_address_sync(address : Ptr[_root_.sn.gnome.glib.internal.gchar], flags : GDBusConnectionFlags, observer : Ptr[GDBusAuthObserver], cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GDBusConnection] = extern

@extern def g_dbus_connection_new_sync(stream : Ptr[GIOStream], guid : Ptr[_root_.sn.gnome.glib.internal.gchar], flags : GDBusConnectionFlags, observer : Ptr[GDBusAuthObserver], cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GDBusConnection] = extern

@extern def g_dbus_connection_register_object(connection : Ptr[GDBusConnection], object_path : Ptr[_root_.sn.gnome.glib.internal.gchar], interface_info : Ptr[GDBusInterfaceInfo], vtable : Ptr[GDBusInterfaceVTable], user_data : _root_.sn.gnome.glib.internal.gpointer, user_data_free_func : _root_.sn.gnome.glib.internal.GDestroyNotify, error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.guint = extern

@extern def g_dbus_connection_register_object_with_closures(connection : Ptr[GDBusConnection], object_path : Ptr[_root_.sn.gnome.glib.internal.gchar], interface_info : Ptr[GDBusInterfaceInfo], method_call_closure : Ptr[_root_.sn.gnome.gobject.internal.GClosure], get_property_closure : Ptr[_root_.sn.gnome.gobject.internal.GClosure], set_property_closure : Ptr[_root_.sn.gnome.gobject.internal.GClosure], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.guint = extern

@extern def g_dbus_connection_register_subtree(connection : Ptr[GDBusConnection], object_path : Ptr[_root_.sn.gnome.glib.internal.gchar], vtable : Ptr[GDBusSubtreeVTable], flags : GDBusSubtreeFlags, user_data : _root_.sn.gnome.glib.internal.gpointer, user_data_free_func : _root_.sn.gnome.glib.internal.GDestroyNotify, error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.guint = extern

@extern def g_dbus_connection_remove_filter(connection : Ptr[GDBusConnection], filter_id : _root_.sn.gnome.glib.internal.guint): Unit = extern

@extern def g_dbus_connection_send_message(connection : Ptr[GDBusConnection], message : Ptr[GDBusMessage], flags : GDBusSendMessageFlags, out_serial : Ptr[_root_.sn.gnome.glib.internal.guint32], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_dbus_connection_send_message_with_reply(connection : Ptr[GDBusConnection], message : Ptr[GDBusMessage], flags : GDBusSendMessageFlags, timeout_msec : _root_.sn.gnome.glib.internal.gint, out_serial : Ptr[_root_.sn.gnome.glib.internal.guint32], cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_dbus_connection_send_message_with_reply_finish(connection : Ptr[GDBusConnection], res : Ptr[GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GDBusMessage] = extern

@extern def g_dbus_connection_send_message_with_reply_sync(connection : Ptr[GDBusConnection], message : Ptr[GDBusMessage], flags : GDBusSendMessageFlags, timeout_msec : _root_.sn.gnome.glib.internal.gint, out_serial : Ptr[_root_.sn.gnome.glib.internal.guint32], cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GDBusMessage] = extern

@extern def g_dbus_connection_set_exit_on_close(connection : Ptr[GDBusConnection], exit_on_close : _root_.sn.gnome.glib.internal.gboolean): Unit = extern

@extern def g_dbus_connection_signal_subscribe(connection : Ptr[GDBusConnection], sender : Ptr[_root_.sn.gnome.glib.internal.gchar], interface_name : Ptr[_root_.sn.gnome.glib.internal.gchar], member : Ptr[_root_.sn.gnome.glib.internal.gchar], object_path : Ptr[_root_.sn.gnome.glib.internal.gchar], arg0 : Ptr[_root_.sn.gnome.glib.internal.gchar], flags : GDBusSignalFlags, callback : GDBusSignalCallback, user_data : _root_.sn.gnome.glib.internal.gpointer, user_data_free_func : _root_.sn.gnome.glib.internal.GDestroyNotify): _root_.sn.gnome.glib.internal.guint = extern

@extern def g_dbus_connection_signal_unsubscribe(connection : Ptr[GDBusConnection], subscription_id : _root_.sn.gnome.glib.internal.guint): Unit = extern

@extern def g_dbus_connection_start_message_processing(connection : Ptr[GDBusConnection]): Unit = extern

@extern def g_dbus_connection_unexport_action_group(connection : Ptr[GDBusConnection], export_id : _root_.sn.gnome.glib.internal.guint): Unit = extern

@extern def g_dbus_connection_unexport_menu_model(connection : Ptr[GDBusConnection], export_id : _root_.sn.gnome.glib.internal.guint): Unit = extern

@extern def g_dbus_connection_unregister_object(connection : Ptr[GDBusConnection], registration_id : _root_.sn.gnome.glib.internal.guint): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_dbus_connection_unregister_subtree(connection : Ptr[GDBusConnection], registration_id : _root_.sn.gnome.glib.internal.guint): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_dbus_error_encode_gerror(error : Ptr[_root_.sn.gnome.glib.internal.GError]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def g_dbus_error_get_remote_error(error : Ptr[_root_.sn.gnome.glib.internal.GError]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def g_dbus_error_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_dbus_error_is_remote_error(error : Ptr[_root_.sn.gnome.glib.internal.GError]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_dbus_error_new_for_dbus_error(dbus_error_name : Ptr[_root_.sn.gnome.glib.internal.gchar], dbus_error_message : Ptr[_root_.sn.gnome.glib.internal.gchar]): Ptr[_root_.sn.gnome.glib.internal.GError] = extern

@extern def g_dbus_error_quark(): _root_.sn.gnome.glib.internal.GQuark = extern

@extern def g_dbus_error_register_error(error_domain : _root_.sn.gnome.glib.internal.GQuark, error_code : _root_.sn.gnome.glib.internal.gint, dbus_error_name : Ptr[_root_.sn.gnome.glib.internal.gchar]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_dbus_error_register_error_domain(error_domain_quark_name : Ptr[_root_.sn.gnome.glib.internal.gchar], quark_volatile : Ptr[_root_.sn.gnome.glib.internal.gsize], entries : Ptr[GDBusErrorEntry], num_entries : _root_.sn.gnome.glib.internal.guint): Unit = extern

@extern def g_dbus_error_set_dbus_error(error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], dbus_error_name : Ptr[_root_.sn.gnome.glib.internal.gchar], dbus_error_message : Ptr[_root_.sn.gnome.glib.internal.gchar], format : Ptr[_root_.sn.gnome.glib.internal.gchar], rest: Any*): Unit = extern

@extern def g_dbus_error_set_dbus_error_valist(error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], dbus_error_name : Ptr[_root_.sn.gnome.glib.internal.gchar], dbus_error_message : Ptr[_root_.sn.gnome.glib.internal.gchar], format : Ptr[_root_.sn.gnome.glib.internal.gchar], var_args : va_list): Unit = extern

@extern def g_dbus_error_strip_remote_error(error : Ptr[_root_.sn.gnome.glib.internal.GError]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_dbus_error_unregister_error(error_domain : _root_.sn.gnome.glib.internal.GQuark, error_code : _root_.sn.gnome.glib.internal.gint, dbus_error_name : Ptr[_root_.sn.gnome.glib.internal.gchar]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_dbus_escape_object_path(s : Ptr[_root_.sn.gnome.glib.internal.gchar]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def g_dbus_escape_object_path_bytestring(bytes : Ptr[_root_.sn.gnome.glib.internal.guint8]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def g_dbus_generate_guid(): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def g_dbus_gvalue_to_gvariant(gvalue : Ptr[_root_.sn.gnome.gobject.internal.GValue], `type` : Ptr[_root_.sn.gnome.glib.internal.GVariantType]): Ptr[_root_.sn.gnome.glib.internal.GVariant] = extern

@extern def g_dbus_gvariant_to_gvalue(value : Ptr[_root_.sn.gnome.glib.internal.GVariant], out_gvalue : Ptr[_root_.sn.gnome.gobject.internal.GValue]): Unit = extern

@extern def g_dbus_interface_dup_object(`interface_` : Ptr[GDBusInterface]): Ptr[GDBusObject] = extern

@extern def g_dbus_interface_get_info(`interface_` : Ptr[GDBusInterface]): Ptr[GDBusInterfaceInfo] = extern

@extern def g_dbus_interface_get_object(`interface_` : Ptr[GDBusInterface]): Ptr[GDBusObject] = extern

@extern def g_dbus_interface_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_dbus_interface_info_cache_build(info : Ptr[GDBusInterfaceInfo]): Unit = extern

@extern def g_dbus_interface_info_cache_release(info : Ptr[GDBusInterfaceInfo]): Unit = extern

@extern def g_dbus_interface_info_generate_xml(info : Ptr[GDBusInterfaceInfo], indent : _root_.sn.gnome.glib.internal.guint, string_builder : Ptr[_root_.sn.gnome.glib.internal.GString]): Unit = extern

@extern def g_dbus_interface_info_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_dbus_interface_info_lookup_method(info : Ptr[GDBusInterfaceInfo], name : Ptr[_root_.sn.gnome.glib.internal.gchar]): Ptr[GDBusMethodInfo] = extern

@extern def g_dbus_interface_info_lookup_property(info : Ptr[GDBusInterfaceInfo], name : Ptr[_root_.sn.gnome.glib.internal.gchar]): Ptr[GDBusPropertyInfo] = extern

@extern def g_dbus_interface_info_lookup_signal(info : Ptr[GDBusInterfaceInfo], name : Ptr[_root_.sn.gnome.glib.internal.gchar]): Ptr[GDBusSignalInfo] = extern

@extern def g_dbus_interface_info_ref(info : Ptr[GDBusInterfaceInfo]): Ptr[GDBusInterfaceInfo] = extern

@extern def g_dbus_interface_info_unref(info : Ptr[GDBusInterfaceInfo]): Unit = extern

@extern def g_dbus_interface_set_object(`interface_` : Ptr[GDBusInterface], `object` : Ptr[GDBusObject]): Unit = extern

@extern def g_dbus_interface_skeleton_export(`interface_` : Ptr[GDBusInterfaceSkeleton], connection : Ptr[GDBusConnection], object_path : Ptr[_root_.sn.gnome.glib.internal.gchar], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_dbus_interface_skeleton_flags_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_dbus_interface_skeleton_flush(`interface_` : Ptr[GDBusInterfaceSkeleton]): Unit = extern

@extern def g_dbus_interface_skeleton_get_connection(`interface_` : Ptr[GDBusInterfaceSkeleton]): Ptr[GDBusConnection] = extern

@extern def g_dbus_interface_skeleton_get_connections(`interface_` : Ptr[GDBusInterfaceSkeleton]): Ptr[_root_.sn.gnome.glib.internal.GList] = extern

@extern def g_dbus_interface_skeleton_get_flags(`interface_` : Ptr[GDBusInterfaceSkeleton]): GDBusInterfaceSkeletonFlags = extern

@extern def g_dbus_interface_skeleton_get_info(`interface_` : Ptr[GDBusInterfaceSkeleton]): Ptr[GDBusInterfaceInfo] = extern

@extern def g_dbus_interface_skeleton_get_object_path(`interface_` : Ptr[GDBusInterfaceSkeleton]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def g_dbus_interface_skeleton_get_properties(`interface_` : Ptr[GDBusInterfaceSkeleton]): Ptr[_root_.sn.gnome.glib.internal.GVariant] = extern

@extern def g_dbus_interface_skeleton_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_dbus_interface_skeleton_get_vtable(`interface_` : Ptr[GDBusInterfaceSkeleton]): Ptr[GDBusInterfaceVTable] = extern

@extern def g_dbus_interface_skeleton_has_connection(`interface_` : Ptr[GDBusInterfaceSkeleton], connection : Ptr[GDBusConnection]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_dbus_interface_skeleton_set_flags(`interface_` : Ptr[GDBusInterfaceSkeleton], flags : GDBusInterfaceSkeletonFlags): Unit = extern

@extern def g_dbus_interface_skeleton_unexport(`interface_` : Ptr[GDBusInterfaceSkeleton]): Unit = extern

@extern def g_dbus_interface_skeleton_unexport_from_connection(`interface_` : Ptr[GDBusInterfaceSkeleton], connection : Ptr[GDBusConnection]): Unit = extern

@extern def g_dbus_is_address(string : Ptr[_root_.sn.gnome.glib.internal.gchar]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_dbus_is_error_name(string : Ptr[_root_.sn.gnome.glib.internal.gchar]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_dbus_is_guid(string : Ptr[_root_.sn.gnome.glib.internal.gchar]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_dbus_is_interface_name(string : Ptr[_root_.sn.gnome.glib.internal.gchar]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_dbus_is_member_name(string : Ptr[_root_.sn.gnome.glib.internal.gchar]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_dbus_is_name(string : Ptr[_root_.sn.gnome.glib.internal.gchar]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_dbus_is_supported_address(string : Ptr[_root_.sn.gnome.glib.internal.gchar], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_dbus_is_unique_name(string : Ptr[_root_.sn.gnome.glib.internal.gchar]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_dbus_menu_model_get(connection : Ptr[GDBusConnection], bus_name : Ptr[_root_.sn.gnome.glib.internal.gchar], object_path : Ptr[_root_.sn.gnome.glib.internal.gchar]): Ptr[GDBusMenuModel] = extern

@extern def g_dbus_menu_model_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_dbus_message_byte_order_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_dbus_message_bytes_needed(blob : Ptr[_root_.sn.gnome.glib.internal.guchar], blob_len : _root_.sn.gnome.glib.internal.gsize, error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gssize = extern

@extern def g_dbus_message_copy(message : Ptr[GDBusMessage], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GDBusMessage] = extern

@extern def g_dbus_message_flags_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_dbus_message_get_arg0(message : Ptr[GDBusMessage]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def g_dbus_message_get_arg0_path(message : Ptr[GDBusMessage]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def g_dbus_message_get_body(message : Ptr[GDBusMessage]): Ptr[_root_.sn.gnome.glib.internal.GVariant] = extern

@extern def g_dbus_message_get_byte_order(message : Ptr[GDBusMessage]): GDBusMessageByteOrder = extern

@extern def g_dbus_message_get_destination(message : Ptr[GDBusMessage]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def g_dbus_message_get_error_name(message : Ptr[GDBusMessage]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def g_dbus_message_get_flags(message : Ptr[GDBusMessage]): GDBusMessageFlags = extern

@extern def g_dbus_message_get_header(message : Ptr[GDBusMessage], header_field : GDBusMessageHeaderField): Ptr[_root_.sn.gnome.glib.internal.GVariant] = extern

@extern def g_dbus_message_get_header_fields(message : Ptr[GDBusMessage]): Ptr[_root_.sn.gnome.glib.internal.guchar] = extern

@extern def g_dbus_message_get_interface(message : Ptr[GDBusMessage]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def g_dbus_message_get_locked(message : Ptr[GDBusMessage]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_dbus_message_get_member(message : Ptr[GDBusMessage]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def g_dbus_message_get_message_type(message : Ptr[GDBusMessage]): GDBusMessageType = extern

@extern def g_dbus_message_get_num_unix_fds(message : Ptr[GDBusMessage]): _root_.sn.gnome.glib.internal.guint32 = extern

@extern def g_dbus_message_get_path(message : Ptr[GDBusMessage]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def g_dbus_message_get_reply_serial(message : Ptr[GDBusMessage]): _root_.sn.gnome.glib.internal.guint32 = extern

@extern def g_dbus_message_get_sender(message : Ptr[GDBusMessage]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def g_dbus_message_get_serial(message : Ptr[GDBusMessage]): _root_.sn.gnome.glib.internal.guint32 = extern

@extern def g_dbus_message_get_signature(message : Ptr[GDBusMessage]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def g_dbus_message_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_dbus_message_get_unix_fd_list(message : Ptr[GDBusMessage]): Ptr[GUnixFDList] = extern

@extern def g_dbus_message_header_field_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_dbus_message_lock(message : Ptr[GDBusMessage]): Unit = extern

@extern def g_dbus_message_new(): Ptr[GDBusMessage] = extern

@extern def g_dbus_message_new_from_blob(blob : Ptr[_root_.sn.gnome.glib.internal.guchar], blob_len : _root_.sn.gnome.glib.internal.gsize, capabilities : GDBusCapabilityFlags, error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GDBusMessage] = extern

@extern def g_dbus_message_new_method_call(name : Ptr[_root_.sn.gnome.glib.internal.gchar], path : Ptr[_root_.sn.gnome.glib.internal.gchar], `interface_` : Ptr[_root_.sn.gnome.glib.internal.gchar], method : Ptr[_root_.sn.gnome.glib.internal.gchar]): Ptr[GDBusMessage] = extern

@extern def g_dbus_message_new_method_error(method_call_message : Ptr[GDBusMessage], error_name : Ptr[_root_.sn.gnome.glib.internal.gchar], error_message_format : Ptr[_root_.sn.gnome.glib.internal.gchar], rest: Any*): Ptr[GDBusMessage] = extern

@extern def g_dbus_message_new_method_error_literal(method_call_message : Ptr[GDBusMessage], error_name : Ptr[_root_.sn.gnome.glib.internal.gchar], error_message : Ptr[_root_.sn.gnome.glib.internal.gchar]): Ptr[GDBusMessage] = extern

@extern def g_dbus_message_new_method_error_valist(method_call_message : Ptr[GDBusMessage], error_name : Ptr[_root_.sn.gnome.glib.internal.gchar], error_message_format : Ptr[_root_.sn.gnome.glib.internal.gchar], var_args : va_list): Ptr[GDBusMessage] = extern

@extern def g_dbus_message_new_method_reply(method_call_message : Ptr[GDBusMessage]): Ptr[GDBusMessage] = extern

@extern def g_dbus_message_new_signal(path : Ptr[_root_.sn.gnome.glib.internal.gchar], `interface_` : Ptr[_root_.sn.gnome.glib.internal.gchar], signal : Ptr[_root_.sn.gnome.glib.internal.gchar]): Ptr[GDBusMessage] = extern

@extern def g_dbus_message_print(message : Ptr[GDBusMessage], indent : _root_.sn.gnome.glib.internal.guint): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def g_dbus_message_set_body(message : Ptr[GDBusMessage], body : Ptr[_root_.sn.gnome.glib.internal.GVariant]): Unit = extern

@extern def g_dbus_message_set_byte_order(message : Ptr[GDBusMessage], byte_order : GDBusMessageByteOrder): Unit = extern

@extern def g_dbus_message_set_destination(message : Ptr[GDBusMessage], value : Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = extern

@extern def g_dbus_message_set_error_name(message : Ptr[GDBusMessage], value : Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = extern

@extern def g_dbus_message_set_flags(message : Ptr[GDBusMessage], flags : GDBusMessageFlags): Unit = extern

@extern def g_dbus_message_set_header(message : Ptr[GDBusMessage], header_field : GDBusMessageHeaderField, value : Ptr[_root_.sn.gnome.glib.internal.GVariant]): Unit = extern

@extern def g_dbus_message_set_interface(message : Ptr[GDBusMessage], value : Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = extern

@extern def g_dbus_message_set_member(message : Ptr[GDBusMessage], value : Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = extern

@extern def g_dbus_message_set_message_type(message : Ptr[GDBusMessage], `type` : GDBusMessageType): Unit = extern

@extern def g_dbus_message_set_num_unix_fds(message : Ptr[GDBusMessage], value : _root_.sn.gnome.glib.internal.guint32): Unit = extern

@extern def g_dbus_message_set_path(message : Ptr[GDBusMessage], value : Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = extern

@extern def g_dbus_message_set_reply_serial(message : Ptr[GDBusMessage], value : _root_.sn.gnome.glib.internal.guint32): Unit = extern

@extern def g_dbus_message_set_sender(message : Ptr[GDBusMessage], value : Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = extern

@extern def g_dbus_message_set_serial(message : Ptr[GDBusMessage], serial : _root_.sn.gnome.glib.internal.guint32): Unit = extern

@extern def g_dbus_message_set_signature(message : Ptr[GDBusMessage], value : Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = extern

@extern def g_dbus_message_set_unix_fd_list(message : Ptr[GDBusMessage], fd_list : Ptr[GUnixFDList]): Unit = extern

@extern def g_dbus_message_to_blob(message : Ptr[GDBusMessage], out_size : Ptr[_root_.sn.gnome.glib.internal.gsize], capabilities : GDBusCapabilityFlags, error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[_root_.sn.gnome.glib.internal.guchar] = extern

@extern def g_dbus_message_to_gerror(message : Ptr[GDBusMessage], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_dbus_message_type_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_dbus_method_info_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_dbus_method_info_ref(info : Ptr[GDBusMethodInfo]): Ptr[GDBusMethodInfo] = extern

@extern def g_dbus_method_info_unref(info : Ptr[GDBusMethodInfo]): Unit = extern

@extern def g_dbus_method_invocation_get_connection(invocation : Ptr[GDBusMethodInvocation]): Ptr[GDBusConnection] = extern

@extern def g_dbus_method_invocation_get_interface_name(invocation : Ptr[GDBusMethodInvocation]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def g_dbus_method_invocation_get_message(invocation : Ptr[GDBusMethodInvocation]): Ptr[GDBusMessage] = extern

@extern def g_dbus_method_invocation_get_method_info(invocation : Ptr[GDBusMethodInvocation]): Ptr[GDBusMethodInfo] = extern

@extern def g_dbus_method_invocation_get_method_name(invocation : Ptr[GDBusMethodInvocation]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def g_dbus_method_invocation_get_object_path(invocation : Ptr[GDBusMethodInvocation]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def g_dbus_method_invocation_get_parameters(invocation : Ptr[GDBusMethodInvocation]): Ptr[_root_.sn.gnome.glib.internal.GVariant] = extern

@extern def g_dbus_method_invocation_get_property_info(invocation : Ptr[GDBusMethodInvocation]): Ptr[GDBusPropertyInfo] = extern

@extern def g_dbus_method_invocation_get_sender(invocation : Ptr[GDBusMethodInvocation]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def g_dbus_method_invocation_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_dbus_method_invocation_get_user_data(invocation : Ptr[GDBusMethodInvocation]): _root_.sn.gnome.glib.internal.gpointer = extern

@extern def g_dbus_method_invocation_return_dbus_error(invocation : Ptr[GDBusMethodInvocation], error_name : Ptr[_root_.sn.gnome.glib.internal.gchar], error_message : Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = extern

@extern def g_dbus_method_invocation_return_error(invocation : Ptr[GDBusMethodInvocation], domain : _root_.sn.gnome.glib.internal.GQuark, code : _root_.sn.gnome.glib.internal.gint, format : Ptr[_root_.sn.gnome.glib.internal.gchar], rest: Any*): Unit = extern

@extern def g_dbus_method_invocation_return_error_literal(invocation : Ptr[GDBusMethodInvocation], domain : _root_.sn.gnome.glib.internal.GQuark, code : _root_.sn.gnome.glib.internal.gint, message : Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = extern

@extern def g_dbus_method_invocation_return_error_valist(invocation : Ptr[GDBusMethodInvocation], domain : _root_.sn.gnome.glib.internal.GQuark, code : _root_.sn.gnome.glib.internal.gint, format : Ptr[_root_.sn.gnome.glib.internal.gchar], var_args : va_list): Unit = extern

@extern def g_dbus_method_invocation_return_gerror(invocation : Ptr[GDBusMethodInvocation], error : Ptr[_root_.sn.gnome.glib.internal.GError]): Unit = extern

@extern def g_dbus_method_invocation_return_value(invocation : Ptr[GDBusMethodInvocation], parameters : Ptr[_root_.sn.gnome.glib.internal.GVariant]): Unit = extern

@extern def g_dbus_method_invocation_return_value_with_unix_fd_list(invocation : Ptr[GDBusMethodInvocation], parameters : Ptr[_root_.sn.gnome.glib.internal.GVariant], fd_list : Ptr[GUnixFDList]): Unit = extern

@extern def g_dbus_method_invocation_take_error(invocation : Ptr[GDBusMethodInvocation], error : Ptr[_root_.sn.gnome.glib.internal.GError]): Unit = extern

@extern def g_dbus_node_info_generate_xml(info : Ptr[GDBusNodeInfo], indent : _root_.sn.gnome.glib.internal.guint, string_builder : Ptr[_root_.sn.gnome.glib.internal.GString]): Unit = extern

@extern def g_dbus_node_info_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_dbus_node_info_lookup_interface(info : Ptr[GDBusNodeInfo], name : Ptr[_root_.sn.gnome.glib.internal.gchar]): Ptr[GDBusInterfaceInfo] = extern

@extern def g_dbus_node_info_new_for_xml(xml_data : Ptr[_root_.sn.gnome.glib.internal.gchar], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GDBusNodeInfo] = extern

@extern def g_dbus_node_info_ref(info : Ptr[GDBusNodeInfo]): Ptr[GDBusNodeInfo] = extern

@extern def g_dbus_node_info_unref(info : Ptr[GDBusNodeInfo]): Unit = extern

@extern def g_dbus_object_get_interface(`object` : Ptr[GDBusObject], interface_name : Ptr[_root_.sn.gnome.glib.internal.gchar]): Ptr[GDBusInterface] = extern

@extern def g_dbus_object_get_interfaces(`object` : Ptr[GDBusObject]): Ptr[_root_.sn.gnome.glib.internal.GList] = extern

@extern def g_dbus_object_get_object_path(`object` : Ptr[GDBusObject]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def g_dbus_object_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_dbus_object_manager_client_flags_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_dbus_object_manager_client_get_connection(manager : Ptr[GDBusObjectManagerClient]): Ptr[GDBusConnection] = extern

@extern def g_dbus_object_manager_client_get_flags(manager : Ptr[GDBusObjectManagerClient]): GDBusObjectManagerClientFlags = extern

@extern def g_dbus_object_manager_client_get_name(manager : Ptr[GDBusObjectManagerClient]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def g_dbus_object_manager_client_get_name_owner(manager : Ptr[GDBusObjectManagerClient]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def g_dbus_object_manager_client_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_dbus_object_manager_client_new(connection : Ptr[GDBusConnection], flags : GDBusObjectManagerClientFlags, name : Ptr[_root_.sn.gnome.glib.internal.gchar], object_path : Ptr[_root_.sn.gnome.glib.internal.gchar], get_proxy_type_func : GDBusProxyTypeFunc, get_proxy_type_user_data : _root_.sn.gnome.glib.internal.gpointer, get_proxy_type_destroy_notify : _root_.sn.gnome.glib.internal.GDestroyNotify, cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_dbus_object_manager_client_new_finish(res : Ptr[GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GDBusObjectManager] = extern

@extern def g_dbus_object_manager_client_new_for_bus(bus_type : GBusType, flags : GDBusObjectManagerClientFlags, name : Ptr[_root_.sn.gnome.glib.internal.gchar], object_path : Ptr[_root_.sn.gnome.glib.internal.gchar], get_proxy_type_func : GDBusProxyTypeFunc, get_proxy_type_user_data : _root_.sn.gnome.glib.internal.gpointer, get_proxy_type_destroy_notify : _root_.sn.gnome.glib.internal.GDestroyNotify, cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_dbus_object_manager_client_new_for_bus_finish(res : Ptr[GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GDBusObjectManager] = extern

@extern def g_dbus_object_manager_client_new_for_bus_sync(bus_type : GBusType, flags : GDBusObjectManagerClientFlags, name : Ptr[_root_.sn.gnome.glib.internal.gchar], object_path : Ptr[_root_.sn.gnome.glib.internal.gchar], get_proxy_type_func : GDBusProxyTypeFunc, get_proxy_type_user_data : _root_.sn.gnome.glib.internal.gpointer, get_proxy_type_destroy_notify : _root_.sn.gnome.glib.internal.GDestroyNotify, cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GDBusObjectManager] = extern

@extern def g_dbus_object_manager_client_new_sync(connection : Ptr[GDBusConnection], flags : GDBusObjectManagerClientFlags, name : Ptr[_root_.sn.gnome.glib.internal.gchar], object_path : Ptr[_root_.sn.gnome.glib.internal.gchar], get_proxy_type_func : GDBusProxyTypeFunc, get_proxy_type_user_data : _root_.sn.gnome.glib.internal.gpointer, get_proxy_type_destroy_notify : _root_.sn.gnome.glib.internal.GDestroyNotify, cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GDBusObjectManager] = extern

@extern def g_dbus_object_manager_get_interface(manager : Ptr[GDBusObjectManager], object_path : Ptr[_root_.sn.gnome.glib.internal.gchar], interface_name : Ptr[_root_.sn.gnome.glib.internal.gchar]): Ptr[GDBusInterface] = extern

@extern def g_dbus_object_manager_get_object(manager : Ptr[GDBusObjectManager], object_path : Ptr[_root_.sn.gnome.glib.internal.gchar]): Ptr[GDBusObject] = extern

@extern def g_dbus_object_manager_get_object_path(manager : Ptr[GDBusObjectManager]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def g_dbus_object_manager_get_objects(manager : Ptr[GDBusObjectManager]): Ptr[_root_.sn.gnome.glib.internal.GList] = extern

@extern def g_dbus_object_manager_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_dbus_object_manager_server_export(manager : Ptr[GDBusObjectManagerServer], `object` : Ptr[GDBusObjectSkeleton]): Unit = extern

@extern def g_dbus_object_manager_server_export_uniquely(manager : Ptr[GDBusObjectManagerServer], `object` : Ptr[GDBusObjectSkeleton]): Unit = extern

@extern def g_dbus_object_manager_server_get_connection(manager : Ptr[GDBusObjectManagerServer]): Ptr[GDBusConnection] = extern

@extern def g_dbus_object_manager_server_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_dbus_object_manager_server_is_exported(manager : Ptr[GDBusObjectManagerServer], `object` : Ptr[GDBusObjectSkeleton]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_dbus_object_manager_server_new(object_path : Ptr[_root_.sn.gnome.glib.internal.gchar]): Ptr[GDBusObjectManagerServer] = extern

@extern def g_dbus_object_manager_server_set_connection(manager : Ptr[GDBusObjectManagerServer], connection : Ptr[GDBusConnection]): Unit = extern

@extern def g_dbus_object_manager_server_unexport(manager : Ptr[GDBusObjectManagerServer], object_path : Ptr[_root_.sn.gnome.glib.internal.gchar]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_dbus_object_proxy_get_connection(proxy : Ptr[GDBusObjectProxy]): Ptr[GDBusConnection] = extern

@extern def g_dbus_object_proxy_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_dbus_object_proxy_new(connection : Ptr[GDBusConnection], object_path : Ptr[_root_.sn.gnome.glib.internal.gchar]): Ptr[GDBusObjectProxy] = extern

@extern def g_dbus_object_skeleton_add_interface(`object` : Ptr[GDBusObjectSkeleton], `interface_` : Ptr[GDBusInterfaceSkeleton]): Unit = extern

@extern def g_dbus_object_skeleton_flush(`object` : Ptr[GDBusObjectSkeleton]): Unit = extern

@extern def g_dbus_object_skeleton_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_dbus_object_skeleton_new(object_path : Ptr[_root_.sn.gnome.glib.internal.gchar]): Ptr[GDBusObjectSkeleton] = extern

@extern def g_dbus_object_skeleton_remove_interface(`object` : Ptr[GDBusObjectSkeleton], `interface_` : Ptr[GDBusInterfaceSkeleton]): Unit = extern

@extern def g_dbus_object_skeleton_remove_interface_by_name(`object` : Ptr[GDBusObjectSkeleton], interface_name : Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = extern

@extern def g_dbus_object_skeleton_set_object_path(`object` : Ptr[GDBusObjectSkeleton], object_path : Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = extern

@extern def g_dbus_property_info_flags_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_dbus_property_info_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_dbus_property_info_ref(info : Ptr[GDBusPropertyInfo]): Ptr[GDBusPropertyInfo] = extern

@extern def g_dbus_property_info_unref(info : Ptr[GDBusPropertyInfo]): Unit = extern

@extern def g_dbus_proxy_call(proxy : Ptr[GDBusProxy], method_name : Ptr[_root_.sn.gnome.glib.internal.gchar], parameters : Ptr[_root_.sn.gnome.glib.internal.GVariant], flags : GDBusCallFlags, timeout_msec : _root_.sn.gnome.glib.internal.gint, cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_dbus_proxy_call_finish(proxy : Ptr[GDBusProxy], res : Ptr[GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[_root_.sn.gnome.glib.internal.GVariant] = extern

@extern def g_dbus_proxy_call_sync(proxy : Ptr[GDBusProxy], method_name : Ptr[_root_.sn.gnome.glib.internal.gchar], parameters : Ptr[_root_.sn.gnome.glib.internal.GVariant], flags : GDBusCallFlags, timeout_msec : _root_.sn.gnome.glib.internal.gint, cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[_root_.sn.gnome.glib.internal.GVariant] = extern

@extern def g_dbus_proxy_call_with_unix_fd_list(proxy : Ptr[GDBusProxy], method_name : Ptr[_root_.sn.gnome.glib.internal.gchar], parameters : Ptr[_root_.sn.gnome.glib.internal.GVariant], flags : GDBusCallFlags, timeout_msec : _root_.sn.gnome.glib.internal.gint, fd_list : Ptr[GUnixFDList], cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_dbus_proxy_call_with_unix_fd_list_finish(proxy : Ptr[GDBusProxy], out_fd_list : Ptr[Ptr[GUnixFDList]], res : Ptr[GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[_root_.sn.gnome.glib.internal.GVariant] = extern

@extern def g_dbus_proxy_call_with_unix_fd_list_sync(proxy : Ptr[GDBusProxy], method_name : Ptr[_root_.sn.gnome.glib.internal.gchar], parameters : Ptr[_root_.sn.gnome.glib.internal.GVariant], flags : GDBusCallFlags, timeout_msec : _root_.sn.gnome.glib.internal.gint, fd_list : Ptr[GUnixFDList], out_fd_list : Ptr[Ptr[GUnixFDList]], cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[_root_.sn.gnome.glib.internal.GVariant] = extern

@extern def g_dbus_proxy_flags_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_dbus_proxy_get_cached_property(proxy : Ptr[GDBusProxy], property_name : Ptr[_root_.sn.gnome.glib.internal.gchar]): Ptr[_root_.sn.gnome.glib.internal.GVariant] = extern

@extern def g_dbus_proxy_get_cached_property_names(proxy : Ptr[GDBusProxy]): Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]] = extern

@extern def g_dbus_proxy_get_connection(proxy : Ptr[GDBusProxy]): Ptr[GDBusConnection] = extern

@extern def g_dbus_proxy_get_default_timeout(proxy : Ptr[GDBusProxy]): _root_.sn.gnome.glib.internal.gint = extern

@extern def g_dbus_proxy_get_flags(proxy : Ptr[GDBusProxy]): GDBusProxyFlags = extern

@extern def g_dbus_proxy_get_interface_info(proxy : Ptr[GDBusProxy]): Ptr[GDBusInterfaceInfo] = extern

@extern def g_dbus_proxy_get_interface_name(proxy : Ptr[GDBusProxy]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def g_dbus_proxy_get_name(proxy : Ptr[GDBusProxy]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def g_dbus_proxy_get_name_owner(proxy : Ptr[GDBusProxy]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def g_dbus_proxy_get_object_path(proxy : Ptr[GDBusProxy]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def g_dbus_proxy_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_dbus_proxy_new(connection : Ptr[GDBusConnection], flags : GDBusProxyFlags, info : Ptr[GDBusInterfaceInfo], name : Ptr[_root_.sn.gnome.glib.internal.gchar], object_path : Ptr[_root_.sn.gnome.glib.internal.gchar], interface_name : Ptr[_root_.sn.gnome.glib.internal.gchar], cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_dbus_proxy_new_finish(res : Ptr[GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GDBusProxy] = extern

@extern def g_dbus_proxy_new_for_bus(bus_type : GBusType, flags : GDBusProxyFlags, info : Ptr[GDBusInterfaceInfo], name : Ptr[_root_.sn.gnome.glib.internal.gchar], object_path : Ptr[_root_.sn.gnome.glib.internal.gchar], interface_name : Ptr[_root_.sn.gnome.glib.internal.gchar], cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_dbus_proxy_new_for_bus_finish(res : Ptr[GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GDBusProxy] = extern

@extern def g_dbus_proxy_new_for_bus_sync(bus_type : GBusType, flags : GDBusProxyFlags, info : Ptr[GDBusInterfaceInfo], name : Ptr[_root_.sn.gnome.glib.internal.gchar], object_path : Ptr[_root_.sn.gnome.glib.internal.gchar], interface_name : Ptr[_root_.sn.gnome.glib.internal.gchar], cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GDBusProxy] = extern

@extern def g_dbus_proxy_new_sync(connection : Ptr[GDBusConnection], flags : GDBusProxyFlags, info : Ptr[GDBusInterfaceInfo], name : Ptr[_root_.sn.gnome.glib.internal.gchar], object_path : Ptr[_root_.sn.gnome.glib.internal.gchar], interface_name : Ptr[_root_.sn.gnome.glib.internal.gchar], cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GDBusProxy] = extern

@extern def g_dbus_proxy_set_cached_property(proxy : Ptr[GDBusProxy], property_name : Ptr[_root_.sn.gnome.glib.internal.gchar], value : Ptr[_root_.sn.gnome.glib.internal.GVariant]): Unit = extern

@extern def g_dbus_proxy_set_default_timeout(proxy : Ptr[GDBusProxy], timeout_msec : _root_.sn.gnome.glib.internal.gint): Unit = extern

@extern def g_dbus_proxy_set_interface_info(proxy : Ptr[GDBusProxy], info : Ptr[GDBusInterfaceInfo]): Unit = extern

@extern def g_dbus_send_message_flags_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_dbus_server_flags_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_dbus_server_get_client_address(server : Ptr[GDBusServer]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def g_dbus_server_get_flags(server : Ptr[GDBusServer]): GDBusServerFlags = extern

@extern def g_dbus_server_get_guid(server : Ptr[GDBusServer]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def g_dbus_server_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_dbus_server_is_active(server : Ptr[GDBusServer]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_dbus_server_new_sync(address : Ptr[_root_.sn.gnome.glib.internal.gchar], flags : GDBusServerFlags, guid : Ptr[_root_.sn.gnome.glib.internal.gchar], observer : Ptr[GDBusAuthObserver], cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GDBusServer] = extern

@extern def g_dbus_server_start(server : Ptr[GDBusServer]): Unit = extern

@extern def g_dbus_server_stop(server : Ptr[GDBusServer]): Unit = extern

@extern def g_dbus_signal_flags_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_dbus_signal_info_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_dbus_signal_info_ref(info : Ptr[GDBusSignalInfo]): Ptr[GDBusSignalInfo] = extern

@extern def g_dbus_signal_info_unref(info : Ptr[GDBusSignalInfo]): Unit = extern

@extern def g_dbus_subtree_flags_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_dbus_unescape_object_path(s : Ptr[_root_.sn.gnome.glib.internal.gchar]): Ptr[_root_.sn.gnome.glib.internal.guint8] = extern

@extern def g_debug_controller(ptr : _root_.sn.gnome.glib.internal.gpointer): Ptr[GDebugController] = extern

@extern def g_debug_controller_GET_IFACE(ptr : _root_.sn.gnome.glib.internal.gpointer): Ptr[GDebugControllerInterface] = extern

@extern def g_debug_controller_dbus_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_debug_controller_dbus_new(connection : Ptr[GDBusConnection], cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GDebugControllerDBus] = extern

@extern def g_debug_controller_dbus_stop(self : Ptr[GDebugControllerDBus]): Unit = extern

@extern def g_debug_controller_get_debug_enabled(self : Ptr[GDebugController]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_debug_controller_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_debug_controller_set_debug_enabled(self : Ptr[GDebugController], debug_enabled : _root_.sn.gnome.glib.internal.gboolean): Unit = extern

@extern def g_drive_can_eject(drive : Ptr[GDrive]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_drive_can_poll_for_media(drive : Ptr[GDrive]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_drive_can_start(drive : Ptr[GDrive]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_drive_can_start_degraded(drive : Ptr[GDrive]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_drive_can_stop(drive : Ptr[GDrive]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_drive_eject(drive : Ptr[GDrive], flags : GMountUnmountFlags, cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_drive_eject_finish(drive : Ptr[GDrive], result : Ptr[GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_drive_eject_with_operation(drive : Ptr[GDrive], flags : GMountUnmountFlags, mount_operation : Ptr[GMountOperation], cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_drive_eject_with_operation_finish(drive : Ptr[GDrive], result : Ptr[GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_drive_enumerate_identifiers(drive : Ptr[GDrive]): Ptr[CString] = extern

@extern def g_drive_get_icon(drive : Ptr[GDrive]): Ptr[GIcon] = extern

@extern def g_drive_get_identifier(drive : Ptr[GDrive], kind : CString): CString = extern

@extern def g_drive_get_name(drive : Ptr[GDrive]): CString = extern

@extern def g_drive_get_sort_key(drive : Ptr[GDrive]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def g_drive_get_start_stop_type(drive : Ptr[GDrive]): GDriveStartStopType = extern

@extern def g_drive_get_symbolic_icon(drive : Ptr[GDrive]): Ptr[GIcon] = extern

@extern def g_drive_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_drive_get_volumes(drive : Ptr[GDrive]): Ptr[_root_.sn.gnome.glib.internal.GList] = extern

@extern def g_drive_has_media(drive : Ptr[GDrive]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_drive_has_volumes(drive : Ptr[GDrive]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_drive_is_media_check_automatic(drive : Ptr[GDrive]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_drive_is_media_removable(drive : Ptr[GDrive]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_drive_is_removable(drive : Ptr[GDrive]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_drive_poll_for_media(drive : Ptr[GDrive], cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_drive_poll_for_media_finish(drive : Ptr[GDrive], result : Ptr[GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_drive_start(drive : Ptr[GDrive], flags : GDriveStartFlags, mount_operation : Ptr[GMountOperation], cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_drive_start_finish(drive : Ptr[GDrive], result : Ptr[GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_drive_start_flags_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_drive_start_stop_type_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_drive_stop(drive : Ptr[GDrive], flags : GMountUnmountFlags, mount_operation : Ptr[GMountOperation], cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_drive_stop_finish(drive : Ptr[GDrive], result : Ptr[GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_dtls_client_connection_get_accepted_cas(conn : Ptr[GDtlsClientConnection]): Ptr[_root_.sn.gnome.glib.internal.GList] = extern

@extern def g_dtls_client_connection_get_server_identity(conn : Ptr[GDtlsClientConnection]): Ptr[GSocketConnectable] = extern

@extern def g_dtls_client_connection_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_dtls_client_connection_get_validation_flags(conn : Ptr[GDtlsClientConnection]): GTlsCertificateFlags = extern

@extern def g_dtls_client_connection_new(base_socket : Ptr[GDatagramBased], server_identity : Ptr[GSocketConnectable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GDatagramBased] = extern

@extern def g_dtls_client_connection_set_server_identity(conn : Ptr[GDtlsClientConnection], identity : Ptr[GSocketConnectable]): Unit = extern

@extern def g_dtls_client_connection_set_validation_flags(conn : Ptr[GDtlsClientConnection], flags : GTlsCertificateFlags): Unit = extern

@extern def g_dtls_connection_close(conn : Ptr[GDtlsConnection], cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_dtls_connection_close_async(conn : Ptr[GDtlsConnection], io_priority : CInt, cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_dtls_connection_close_finish(conn : Ptr[GDtlsConnection], result : Ptr[GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_dtls_connection_emit_accept_certificate(conn : Ptr[GDtlsConnection], peer_cert : Ptr[GTlsCertificate], errors : GTlsCertificateFlags): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_dtls_connection_get_certificate(conn : Ptr[GDtlsConnection]): Ptr[GTlsCertificate] = extern

@extern def g_dtls_connection_get_channel_binding_data(conn : Ptr[GDtlsConnection], `type` : GTlsChannelBindingType, data : Ptr[_root_.sn.gnome.glib.internal.GByteArray], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_dtls_connection_get_ciphersuite_name(conn : Ptr[GDtlsConnection]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def g_dtls_connection_get_database(conn : Ptr[GDtlsConnection]): Ptr[GTlsDatabase] = extern

@extern def g_dtls_connection_get_interaction(conn : Ptr[GDtlsConnection]): Ptr[GTlsInteraction] = extern

@extern def g_dtls_connection_get_negotiated_protocol(conn : Ptr[GDtlsConnection]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def g_dtls_connection_get_peer_certificate(conn : Ptr[GDtlsConnection]): Ptr[GTlsCertificate] = extern

@extern def g_dtls_connection_get_peer_certificate_errors(conn : Ptr[GDtlsConnection]): GTlsCertificateFlags = extern

@extern def g_dtls_connection_get_protocol_version(conn : Ptr[GDtlsConnection]): GTlsProtocolVersion = extern

@extern def g_dtls_connection_get_rehandshake_mode(conn : Ptr[GDtlsConnection]): GTlsRehandshakeMode = extern

@extern def g_dtls_connection_get_require_close_notify(conn : Ptr[GDtlsConnection]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_dtls_connection_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_dtls_connection_handshake(conn : Ptr[GDtlsConnection], cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_dtls_connection_handshake_async(conn : Ptr[GDtlsConnection], io_priority : CInt, cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_dtls_connection_handshake_finish(conn : Ptr[GDtlsConnection], result : Ptr[GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_dtls_connection_set_advertised_protocols(conn : Ptr[GDtlsConnection], protocols : Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]): Unit = extern

@extern def g_dtls_connection_set_certificate(conn : Ptr[GDtlsConnection], certificate : Ptr[GTlsCertificate]): Unit = extern

@extern def g_dtls_connection_set_database(conn : Ptr[GDtlsConnection], database : Ptr[GTlsDatabase]): Unit = extern

@extern def g_dtls_connection_set_interaction(conn : Ptr[GDtlsConnection], interaction : Ptr[GTlsInteraction]): Unit = extern

@extern def g_dtls_connection_set_rehandshake_mode(conn : Ptr[GDtlsConnection], mode : GTlsRehandshakeMode): Unit = extern

@extern def g_dtls_connection_set_require_close_notify(conn : Ptr[GDtlsConnection], require_close_notify : _root_.sn.gnome.glib.internal.gboolean): Unit = extern

@extern def g_dtls_connection_shutdown(conn : Ptr[GDtlsConnection], shutdown_read : _root_.sn.gnome.glib.internal.gboolean, shutdown_write : _root_.sn.gnome.glib.internal.gboolean, cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_dtls_connection_shutdown_async(conn : Ptr[GDtlsConnection], shutdown_read : _root_.sn.gnome.glib.internal.gboolean, shutdown_write : _root_.sn.gnome.glib.internal.gboolean, io_priority : CInt, cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_dtls_connection_shutdown_finish(conn : Ptr[GDtlsConnection], result : Ptr[GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_dtls_server_connection_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_dtls_server_connection_new(base_socket : Ptr[GDatagramBased], certificate : Ptr[GTlsCertificate], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GDatagramBased] = extern

@extern def g_emblem_get_icon(emblem : Ptr[GEmblem]): Ptr[GIcon] = extern

@extern def g_emblem_get_origin(emblem : Ptr[GEmblem]): GEmblemOrigin = extern

@extern def g_emblem_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_emblem_new(icon : Ptr[GIcon]): Ptr[GEmblem] = extern

@extern def g_emblem_new_with_origin(icon : Ptr[GIcon], origin : GEmblemOrigin): Ptr[GEmblem] = extern

@extern def g_emblem_origin_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_emblemed_icon_add_emblem(emblemed : Ptr[GEmblemedIcon], emblem : Ptr[GEmblem]): Unit = extern

@extern def g_emblemed_icon_clear_emblems(emblemed : Ptr[GEmblemedIcon]): Unit = extern

@extern def g_emblemed_icon_get_emblems(emblemed : Ptr[GEmblemedIcon]): Ptr[_root_.sn.gnome.glib.internal.GList] = extern

@extern def g_emblemed_icon_get_icon(emblemed : Ptr[GEmblemedIcon]): Ptr[GIcon] = extern

@extern def g_emblemed_icon_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_emblemed_icon_new(icon : Ptr[GIcon], emblem : Ptr[GEmblem]): Ptr[GIcon] = extern

@extern def g_file_append_to(file : Ptr[GFile], flags : GFileCreateFlags, cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GFileOutputStream] = extern

@extern def g_file_append_to_async(file : Ptr[GFile], flags : GFileCreateFlags, io_priority : CInt, cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_file_append_to_finish(file : Ptr[GFile], res : Ptr[GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GFileOutputStream] = extern

@extern def g_file_attribute_info_flags_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_file_attribute_info_list_add(list : Ptr[GFileAttributeInfoList], name : CString, `type` : GFileAttributeType, flags : GFileAttributeInfoFlags): Unit = extern

@extern def g_file_attribute_info_list_dup(list : Ptr[GFileAttributeInfoList]): Ptr[GFileAttributeInfoList] = extern

@extern def g_file_attribute_info_list_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_file_attribute_info_list_lookup(list : Ptr[GFileAttributeInfoList], name : CString): Ptr[GFileAttributeInfo] = extern

@extern def g_file_attribute_info_list_new(): Ptr[GFileAttributeInfoList] = extern

@extern def g_file_attribute_info_list_ref(list : Ptr[GFileAttributeInfoList]): Ptr[GFileAttributeInfoList] = extern

@extern def g_file_attribute_info_list_unref(list : Ptr[GFileAttributeInfoList]): Unit = extern

@extern def g_file_attribute_matcher_enumerate_namespace(matcher : Ptr[GFileAttributeMatcher], ns : CString): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_file_attribute_matcher_enumerate_next(matcher : Ptr[GFileAttributeMatcher]): CString = extern

@extern def g_file_attribute_matcher_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_file_attribute_matcher_matches(matcher : Ptr[GFileAttributeMatcher], attribute : CString): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_file_attribute_matcher_matches_only(matcher : Ptr[GFileAttributeMatcher], attribute : CString): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_file_attribute_matcher_new(attributes : CString): Ptr[GFileAttributeMatcher] = extern

@extern def g_file_attribute_matcher_ref(matcher : Ptr[GFileAttributeMatcher]): Ptr[GFileAttributeMatcher] = extern

@extern def g_file_attribute_matcher_subtract(matcher : Ptr[GFileAttributeMatcher], subtract : Ptr[GFileAttributeMatcher]): Ptr[GFileAttributeMatcher] = extern

@extern def g_file_attribute_matcher_to_string(matcher : Ptr[GFileAttributeMatcher]): CString = extern

@extern def g_file_attribute_matcher_unref(matcher : Ptr[GFileAttributeMatcher]): Unit = extern

@extern def g_file_attribute_status_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_file_attribute_type_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_file_build_attribute_list_for_copy(file : Ptr[GFile], flags : GFileCopyFlags, cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): CString = extern

@extern def g_file_copy(source : Ptr[GFile], destination : Ptr[GFile], flags : GFileCopyFlags, cancellable : Ptr[GCancellable], progress_callback : GFileProgressCallback, progress_callback_data : _root_.sn.gnome.glib.internal.gpointer, error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_file_copy_async(source : Ptr[GFile], destination : Ptr[GFile], flags : GFileCopyFlags, io_priority : CInt, cancellable : Ptr[GCancellable], progress_callback : GFileProgressCallback, progress_callback_data : _root_.sn.gnome.glib.internal.gpointer, callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_file_copy_attributes(source : Ptr[GFile], destination : Ptr[GFile], flags : GFileCopyFlags, cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_file_copy_finish(file : Ptr[GFile], res : Ptr[GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_file_copy_flags_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_file_create(file : Ptr[GFile], flags : GFileCreateFlags, cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GFileOutputStream] = extern

@extern def g_file_create_async(file : Ptr[GFile], flags : GFileCreateFlags, io_priority : CInt, cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_file_create_finish(file : Ptr[GFile], res : Ptr[GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GFileOutputStream] = extern

@extern def g_file_create_flags_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_file_create_readwrite(file : Ptr[GFile], flags : GFileCreateFlags, cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GFileIOStream] = extern

@extern def g_file_create_readwrite_async(file : Ptr[GFile], flags : GFileCreateFlags, io_priority : CInt, cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_file_create_readwrite_finish(file : Ptr[GFile], res : Ptr[GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GFileIOStream] = extern

@extern def g_file_delete(file : Ptr[GFile], cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_file_delete_async(file : Ptr[GFile], io_priority : CInt, cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_file_delete_finish(file : Ptr[GFile], result : Ptr[GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_file_dup(file : Ptr[GFile]): Ptr[GFile] = extern

@extern def g_file_eject_mountable(file : Ptr[GFile], flags : GMountUnmountFlags, cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_file_eject_mountable_finish(file : Ptr[GFile], result : Ptr[GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_file_eject_mountable_with_operation(file : Ptr[GFile], flags : GMountUnmountFlags, mount_operation : Ptr[GMountOperation], cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_file_eject_mountable_with_operation_finish(file : Ptr[GFile], result : Ptr[GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_file_enumerate_children(file : Ptr[GFile], attributes : CString, flags : GFileQueryInfoFlags, cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GFileEnumerator] = extern

@extern def g_file_enumerate_children_async(file : Ptr[GFile], attributes : CString, flags : GFileQueryInfoFlags, io_priority : CInt, cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_file_enumerate_children_finish(file : Ptr[GFile], res : Ptr[GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GFileEnumerator] = extern

@extern def g_file_enumerator_close(enumerator : Ptr[GFileEnumerator], cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_file_enumerator_close_async(enumerator : Ptr[GFileEnumerator], io_priority : CInt, cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_file_enumerator_close_finish(enumerator : Ptr[GFileEnumerator], result : Ptr[GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_file_enumerator_get_child(enumerator : Ptr[GFileEnumerator], info : Ptr[GFileInfo]): Ptr[GFile] = extern

@extern def g_file_enumerator_get_container(enumerator : Ptr[GFileEnumerator]): Ptr[GFile] = extern

@extern def g_file_enumerator_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_file_enumerator_has_pending(enumerator : Ptr[GFileEnumerator]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_file_enumerator_is_closed(enumerator : Ptr[GFileEnumerator]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_file_enumerator_iterate(direnum : Ptr[GFileEnumerator], out_info : Ptr[Ptr[GFileInfo]], out_child : Ptr[Ptr[GFile]], cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_file_enumerator_next_file(enumerator : Ptr[GFileEnumerator], cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GFileInfo] = extern

@extern def g_file_enumerator_next_files_async(enumerator : Ptr[GFileEnumerator], num_files : CInt, io_priority : CInt, cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_file_enumerator_next_files_finish(enumerator : Ptr[GFileEnumerator], result : Ptr[GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[_root_.sn.gnome.glib.internal.GList] = extern

@extern def g_file_enumerator_set_pending(enumerator : Ptr[GFileEnumerator], pending : _root_.sn.gnome.glib.internal.gboolean): Unit = extern

@extern def g_file_equal(file1 : Ptr[GFile], file2 : Ptr[GFile]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_file_find_enclosing_mount(file : Ptr[GFile], cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GMount] = extern

@extern def g_file_find_enclosing_mount_async(file : Ptr[GFile], io_priority : CInt, cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_file_find_enclosing_mount_finish(file : Ptr[GFile], res : Ptr[GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GMount] = extern

@extern def g_file_get_basename(file : Ptr[GFile]): CString = extern

@extern def g_file_get_child(file : Ptr[GFile], name : CString): Ptr[GFile] = extern

@extern def g_file_get_child_for_display_name(file : Ptr[GFile], display_name : CString, error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GFile] = extern

@extern def g_file_get_parent(file : Ptr[GFile]): Ptr[GFile] = extern

@extern def g_file_get_parse_name(file : Ptr[GFile]): CString = extern

@extern def g_file_get_path(file : Ptr[GFile]): CString = extern

@extern def g_file_get_relative_path(parent : Ptr[GFile], descendant : Ptr[GFile]): CString = extern

@extern def g_file_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_file_get_uri(file : Ptr[GFile]): CString = extern

@extern def g_file_get_uri_scheme(file : Ptr[GFile]): CString = extern

@extern def g_file_has_parent(file : Ptr[GFile], parent : Ptr[GFile]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_file_has_prefix(file : Ptr[GFile], prefix : Ptr[GFile]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_file_has_uri_scheme(file : Ptr[GFile], uri_scheme : CString): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_file_hash(file : _root_.sn.gnome.glib.internal.gconstpointer): _root_.sn.gnome.glib.internal.guint = extern

@extern def g_file_icon_get_file(icon : Ptr[GFileIcon]): Ptr[GFile] = extern

@extern def g_file_icon_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_file_icon_new(file : Ptr[GFile]): Ptr[GIcon] = extern

@extern def g_file_info_clear_status(info : Ptr[GFileInfo]): Unit = extern

@extern def g_file_info_copy_into(src_info : Ptr[GFileInfo], dest_info : Ptr[GFileInfo]): Unit = extern

@extern def g_file_info_dup(other : Ptr[GFileInfo]): Ptr[GFileInfo] = extern

@extern def g_file_info_get_access_date_time(info : Ptr[GFileInfo]): Ptr[_root_.sn.gnome.glib.internal.GDateTime] = extern

@extern def g_file_info_get_attribute_as_string(info : Ptr[GFileInfo], attribute : CString): CString = extern

@extern def g_file_info_get_attribute_boolean(info : Ptr[GFileInfo], attribute : CString): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_file_info_get_attribute_byte_string(info : Ptr[GFileInfo], attribute : CString): CString = extern

@extern def g_file_info_get_attribute_data(info : Ptr[GFileInfo], attribute : CString, `type` : Ptr[GFileAttributeType], value_pp : Ptr[_root_.sn.gnome.glib.internal.gpointer], status : Ptr[GFileAttributeStatus]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_file_info_get_attribute_file_path(info : Ptr[GFileInfo], attribute : CString): CString = extern

@extern def g_file_info_get_attribute_int32(info : Ptr[GFileInfo], attribute : CString): _root_.sn.gnome.glib.internal.gint32 = extern

@extern def g_file_info_get_attribute_int64(info : Ptr[GFileInfo], attribute : CString): _root_.sn.gnome.glib.internal.gint64 = extern

@extern def g_file_info_get_attribute_object(info : Ptr[GFileInfo], attribute : CString): Ptr[_root_.sn.gnome.gobject.internal.GObject] = extern

@extern def g_file_info_get_attribute_status(info : Ptr[GFileInfo], attribute : CString): GFileAttributeStatus = extern

@extern def g_file_info_get_attribute_string(info : Ptr[GFileInfo], attribute : CString): CString = extern

@extern def g_file_info_get_attribute_stringv(info : Ptr[GFileInfo], attribute : CString): Ptr[CString] = extern

@extern def g_file_info_get_attribute_type(info : Ptr[GFileInfo], attribute : CString): GFileAttributeType = extern

@extern def g_file_info_get_attribute_uint32(info : Ptr[GFileInfo], attribute : CString): _root_.sn.gnome.glib.internal.guint32 = extern

@extern def g_file_info_get_attribute_uint64(info : Ptr[GFileInfo], attribute : CString): _root_.sn.gnome.glib.internal.guint64 = extern

@extern def g_file_info_get_content_type(info : Ptr[GFileInfo]): CString = extern

@extern def g_file_info_get_creation_date_time(info : Ptr[GFileInfo]): Ptr[_root_.sn.gnome.glib.internal.GDateTime] = extern

@extern def g_file_info_get_deletion_date(info : Ptr[GFileInfo]): Ptr[_root_.sn.gnome.glib.internal.GDateTime] = extern

@extern def g_file_info_get_display_name(info : Ptr[GFileInfo]): CString = extern

@extern def g_file_info_get_edit_name(info : Ptr[GFileInfo]): CString = extern

@extern def g_file_info_get_etag(info : Ptr[GFileInfo]): CString = extern

@extern def g_file_info_get_file_type(info : Ptr[GFileInfo]): GFileType = extern

@extern def g_file_info_get_icon(info : Ptr[GFileInfo]): Ptr[GIcon] = extern

@extern def g_file_info_get_is_backup(info : Ptr[GFileInfo]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_file_info_get_is_hidden(info : Ptr[GFileInfo]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_file_info_get_is_symlink(info : Ptr[GFileInfo]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_file_info_get_modification_date_time(info : Ptr[GFileInfo]): Ptr[_root_.sn.gnome.glib.internal.GDateTime] = extern

@extern def g_file_info_get_modification_time(info : Ptr[GFileInfo], result : Ptr[_root_.sn.gnome.glib.internal.GTimeVal]): Unit = extern

@extern def g_file_info_get_name(info : Ptr[GFileInfo]): CString = extern

@extern def g_file_info_get_size(info : Ptr[GFileInfo]): _root_.sn.gnome.glib.internal.goffset = extern

@extern def g_file_info_get_sort_order(info : Ptr[GFileInfo]): _root_.sn.gnome.glib.internal.gint32 = extern

@extern def g_file_info_get_symbolic_icon(info : Ptr[GFileInfo]): Ptr[GIcon] = extern

@extern def g_file_info_get_symlink_target(info : Ptr[GFileInfo]): CString = extern

@extern def g_file_info_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_file_info_has_attribute(info : Ptr[GFileInfo], attribute : CString): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_file_info_has_namespace(info : Ptr[GFileInfo], name_space : CString): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_file_info_list_attributes(info : Ptr[GFileInfo], name_space : CString): Ptr[CString] = extern

@extern def g_file_info_new(): Ptr[GFileInfo] = extern

@extern def g_file_info_remove_attribute(info : Ptr[GFileInfo], attribute : CString): Unit = extern

@extern def g_file_info_set_access_date_time(info : Ptr[GFileInfo], atime : Ptr[_root_.sn.gnome.glib.internal.GDateTime]): Unit = extern

@extern def g_file_info_set_attribute(info : Ptr[GFileInfo], attribute : CString, `type` : GFileAttributeType, value_p : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_file_info_set_attribute_boolean(info : Ptr[GFileInfo], attribute : CString, attr_value : _root_.sn.gnome.glib.internal.gboolean): Unit = extern

@extern def g_file_info_set_attribute_byte_string(info : Ptr[GFileInfo], attribute : CString, attr_value : CString): Unit = extern

@extern def g_file_info_set_attribute_file_path(info : Ptr[GFileInfo], attribute : CString, attr_value : CString): Unit = extern

@extern def g_file_info_set_attribute_int32(info : Ptr[GFileInfo], attribute : CString, attr_value : _root_.sn.gnome.glib.internal.gint32): Unit = extern

@extern def g_file_info_set_attribute_int64(info : Ptr[GFileInfo], attribute : CString, attr_value : _root_.sn.gnome.glib.internal.gint64): Unit = extern

@extern def g_file_info_set_attribute_mask(info : Ptr[GFileInfo], mask : Ptr[GFileAttributeMatcher]): Unit = extern

@extern def g_file_info_set_attribute_object(info : Ptr[GFileInfo], attribute : CString, attr_value : Ptr[_root_.sn.gnome.gobject.internal.GObject]): Unit = extern

@extern def g_file_info_set_attribute_status(info : Ptr[GFileInfo], attribute : CString, status : GFileAttributeStatus): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_file_info_set_attribute_string(info : Ptr[GFileInfo], attribute : CString, attr_value : CString): Unit = extern

@extern def g_file_info_set_attribute_stringv(info : Ptr[GFileInfo], attribute : CString, attr_value : Ptr[CString]): Unit = extern

@extern def g_file_info_set_attribute_uint32(info : Ptr[GFileInfo], attribute : CString, attr_value : _root_.sn.gnome.glib.internal.guint32): Unit = extern

@extern def g_file_info_set_attribute_uint64(info : Ptr[GFileInfo], attribute : CString, attr_value : _root_.sn.gnome.glib.internal.guint64): Unit = extern

@extern def g_file_info_set_content_type(info : Ptr[GFileInfo], content_type : CString): Unit = extern

@extern def g_file_info_set_creation_date_time(info : Ptr[GFileInfo], creation_time : Ptr[_root_.sn.gnome.glib.internal.GDateTime]): Unit = extern

@extern def g_file_info_set_display_name(info : Ptr[GFileInfo], display_name : CString): Unit = extern

@extern def g_file_info_set_edit_name(info : Ptr[GFileInfo], edit_name : CString): Unit = extern

@extern def g_file_info_set_file_type(info : Ptr[GFileInfo], `type` : GFileType): Unit = extern

@extern def g_file_info_set_icon(info : Ptr[GFileInfo], icon : Ptr[GIcon]): Unit = extern

@extern def g_file_info_set_is_hidden(info : Ptr[GFileInfo], is_hidden : _root_.sn.gnome.glib.internal.gboolean): Unit = extern

@extern def g_file_info_set_is_symlink(info : Ptr[GFileInfo], is_symlink : _root_.sn.gnome.glib.internal.gboolean): Unit = extern

@extern def g_file_info_set_modification_date_time(info : Ptr[GFileInfo], mtime : Ptr[_root_.sn.gnome.glib.internal.GDateTime]): Unit = extern

@extern def g_file_info_set_modification_time(info : Ptr[GFileInfo], mtime : Ptr[_root_.sn.gnome.glib.internal.GTimeVal]): Unit = extern

@extern def g_file_info_set_name(info : Ptr[GFileInfo], name : CString): Unit = extern

@extern def g_file_info_set_size(info : Ptr[GFileInfo], size : _root_.sn.gnome.glib.internal.goffset): Unit = extern

@extern def g_file_info_set_sort_order(info : Ptr[GFileInfo], sort_order : _root_.sn.gnome.glib.internal.gint32): Unit = extern

@extern def g_file_info_set_symbolic_icon(info : Ptr[GFileInfo], icon : Ptr[GIcon]): Unit = extern

@extern def g_file_info_set_symlink_target(info : Ptr[GFileInfo], symlink_target : CString): Unit = extern

@extern def g_file_info_unset_attribute_mask(info : Ptr[GFileInfo]): Unit = extern

@extern def g_file_input_stream_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_file_input_stream_query_info(stream : Ptr[GFileInputStream], attributes : CString, cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GFileInfo] = extern

@extern def g_file_input_stream_query_info_async(stream : Ptr[GFileInputStream], attributes : CString, io_priority : CInt, cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_file_input_stream_query_info_finish(stream : Ptr[GFileInputStream], result : Ptr[GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GFileInfo] = extern

@extern def g_file_io_stream_get_etag(stream : Ptr[GFileIOStream]): CString = extern

@extern def g_file_io_stream_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_file_io_stream_query_info(stream : Ptr[GFileIOStream], attributes : CString, cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GFileInfo] = extern

@extern def g_file_io_stream_query_info_async(stream : Ptr[GFileIOStream], attributes : CString, io_priority : CInt, cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_file_io_stream_query_info_finish(stream : Ptr[GFileIOStream], result : Ptr[GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GFileInfo] = extern

@extern def g_file_is_native(file : Ptr[GFile]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_file_load_bytes(file : Ptr[GFile], cancellable : Ptr[GCancellable], etag_out : Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[_root_.sn.gnome.glib.internal.GBytes] = extern

@extern def g_file_load_bytes_async(file : Ptr[GFile], cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_file_load_bytes_finish(file : Ptr[GFile], result : Ptr[GAsyncResult], etag_out : Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[_root_.sn.gnome.glib.internal.GBytes] = extern

@extern def g_file_load_contents(file : Ptr[GFile], cancellable : Ptr[GCancellable], contents : Ptr[CString], length : Ptr[_root_.sn.gnome.glib.internal.gsize], etag_out : Ptr[CString], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_file_load_contents_async(file : Ptr[GFile], cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_file_load_contents_finish(file : Ptr[GFile], res : Ptr[GAsyncResult], contents : Ptr[CString], length : Ptr[_root_.sn.gnome.glib.internal.gsize], etag_out : Ptr[CString], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_file_load_partial_contents_async(file : Ptr[GFile], cancellable : Ptr[GCancellable], read_more_callback : GFileReadMoreCallback, callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_file_load_partial_contents_finish(file : Ptr[GFile], res : Ptr[GAsyncResult], contents : Ptr[CString], length : Ptr[_root_.sn.gnome.glib.internal.gsize], etag_out : Ptr[CString], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_file_make_directory(file : Ptr[GFile], cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_file_make_directory_async(file : Ptr[GFile], io_priority : CInt, cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_file_make_directory_finish(file : Ptr[GFile], result : Ptr[GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_file_make_directory_with_parents(file : Ptr[GFile], cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_file_make_symbolic_link(file : Ptr[GFile], symlink_value : CString, cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_file_make_symbolic_link_async(file : Ptr[GFile], symlink_value : CString, io_priority : CInt, cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_file_make_symbolic_link_finish(file : Ptr[GFile], result : Ptr[GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_file_measure_disk_usage(file : Ptr[GFile], flags : GFileMeasureFlags, cancellable : Ptr[GCancellable], progress_callback : GFileMeasureProgressCallback, progress_data : _root_.sn.gnome.glib.internal.gpointer, disk_usage : Ptr[_root_.sn.gnome.glib.internal.guint64], num_dirs : Ptr[_root_.sn.gnome.glib.internal.guint64], num_files : Ptr[_root_.sn.gnome.glib.internal.guint64], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_file_measure_disk_usage_async(file : Ptr[GFile], flags : GFileMeasureFlags, io_priority : _root_.sn.gnome.glib.internal.gint, cancellable : Ptr[GCancellable], progress_callback : GFileMeasureProgressCallback, progress_data : _root_.sn.gnome.glib.internal.gpointer, callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_file_measure_disk_usage_finish(file : Ptr[GFile], result : Ptr[GAsyncResult], disk_usage : Ptr[_root_.sn.gnome.glib.internal.guint64], num_dirs : Ptr[_root_.sn.gnome.glib.internal.guint64], num_files : Ptr[_root_.sn.gnome.glib.internal.guint64], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_file_measure_flags_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_file_monitor(file : Ptr[GFile], flags : GFileMonitorFlags, cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GFileMonitor] = extern

@extern def g_file_monitor_cancel(monitor : Ptr[GFileMonitor]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_file_monitor_directory(file : Ptr[GFile], flags : GFileMonitorFlags, cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GFileMonitor] = extern

@extern def g_file_monitor_emit_event(monitor : Ptr[GFileMonitor], child : Ptr[GFile], other_file : Ptr[GFile], event_type : GFileMonitorEvent): Unit = extern

@extern def g_file_monitor_event_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_file_monitor_file(file : Ptr[GFile], flags : GFileMonitorFlags, cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GFileMonitor] = extern

@extern def g_file_monitor_flags_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_file_monitor_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_file_monitor_is_cancelled(monitor : Ptr[GFileMonitor]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_file_monitor_set_rate_limit(monitor : Ptr[GFileMonitor], limit_msecs : _root_.sn.gnome.glib.internal.gint): Unit = extern

@extern def g_file_mount_enclosing_volume(location : Ptr[GFile], flags : GMountMountFlags, mount_operation : Ptr[GMountOperation], cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_file_mount_enclosing_volume_finish(location : Ptr[GFile], result : Ptr[GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_file_mount_mountable(file : Ptr[GFile], flags : GMountMountFlags, mount_operation : Ptr[GMountOperation], cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_file_mount_mountable_finish(file : Ptr[GFile], result : Ptr[GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GFile] = extern

@extern def g_file_move(source : Ptr[GFile], destination : Ptr[GFile], flags : GFileCopyFlags, cancellable : Ptr[GCancellable], progress_callback : GFileProgressCallback, progress_callback_data : _root_.sn.gnome.glib.internal.gpointer, error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_file_move_async(source : Ptr[GFile], destination : Ptr[GFile], flags : GFileCopyFlags, io_priority : CInt, cancellable : Ptr[GCancellable], progress_callback : GFileProgressCallback, progress_callback_data : _root_.sn.gnome.glib.internal.gpointer, callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_file_move_finish(file : Ptr[GFile], result : Ptr[GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_file_new_build_filename(first_element : Ptr[_root_.sn.gnome.glib.internal.gchar], rest: Any*): Ptr[GFile] = extern

@extern def g_file_new_build_filenamev(args : Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]): Ptr[GFile] = extern

@extern def g_file_new_for_commandline_arg(arg : CString): Ptr[GFile] = extern

@extern def g_file_new_for_commandline_arg_and_cwd(arg : Ptr[_root_.sn.gnome.glib.internal.gchar], cwd : Ptr[_root_.sn.gnome.glib.internal.gchar]): Ptr[GFile] = extern

@extern def g_file_new_for_path(path : CString): Ptr[GFile] = extern

@extern def g_file_new_for_uri(uri : CString): Ptr[GFile] = extern

@extern def g_file_new_tmp(tmpl : CString, iostream : Ptr[Ptr[GFileIOStream]], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GFile] = extern

@extern def g_file_new_tmp_async(tmpl : CString, io_priority : CInt, cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_file_new_tmp_dir_async(tmpl : CString, io_priority : CInt, cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_file_new_tmp_dir_finish(result : Ptr[GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GFile] = extern

@extern def g_file_new_tmp_finish(result : Ptr[GAsyncResult], iostream : Ptr[Ptr[GFileIOStream]], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GFile] = extern

@extern def g_file_open_readwrite(file : Ptr[GFile], cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GFileIOStream] = extern

@extern def g_file_open_readwrite_async(file : Ptr[GFile], io_priority : CInt, cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_file_open_readwrite_finish(file : Ptr[GFile], res : Ptr[GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GFileIOStream] = extern

@extern def g_file_output_stream_get_etag(stream : Ptr[GFileOutputStream]): CString = extern

@extern def g_file_output_stream_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_file_output_stream_query_info(stream : Ptr[GFileOutputStream], attributes : CString, cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GFileInfo] = extern

@extern def g_file_output_stream_query_info_async(stream : Ptr[GFileOutputStream], attributes : CString, io_priority : CInt, cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_file_output_stream_query_info_finish(stream : Ptr[GFileOutputStream], result : Ptr[GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GFileInfo] = extern

@extern def g_file_parse_name(parse_name : CString): Ptr[GFile] = extern

@extern def g_file_peek_path(file : Ptr[GFile]): CString = extern

@extern def g_file_poll_mountable(file : Ptr[GFile], cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_file_poll_mountable_finish(file : Ptr[GFile], result : Ptr[GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_file_query_default_handler(file : Ptr[GFile], cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GAppInfo] = extern

@extern def g_file_query_default_handler_async(file : Ptr[GFile], io_priority : CInt, cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_file_query_default_handler_finish(file : Ptr[GFile], result : Ptr[GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GAppInfo] = extern

@extern def g_file_query_exists(file : Ptr[GFile], cancellable : Ptr[GCancellable]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_file_query_file_type(file : Ptr[GFile], flags : GFileQueryInfoFlags, cancellable : Ptr[GCancellable]): GFileType = extern

@extern def g_file_query_filesystem_info(file : Ptr[GFile], attributes : CString, cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GFileInfo] = extern

@extern def g_file_query_filesystem_info_async(file : Ptr[GFile], attributes : CString, io_priority : CInt, cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_file_query_filesystem_info_finish(file : Ptr[GFile], res : Ptr[GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GFileInfo] = extern

@extern def g_file_query_info(file : Ptr[GFile], attributes : CString, flags : GFileQueryInfoFlags, cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GFileInfo] = extern

@extern def g_file_query_info_async(file : Ptr[GFile], attributes : CString, flags : GFileQueryInfoFlags, io_priority : CInt, cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_file_query_info_finish(file : Ptr[GFile], res : Ptr[GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GFileInfo] = extern

@extern def g_file_query_info_flags_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_file_query_settable_attributes(file : Ptr[GFile], cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GFileAttributeInfoList] = extern

@extern def g_file_query_writable_namespaces(file : Ptr[GFile], cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GFileAttributeInfoList] = extern

@extern def g_file_read(file : Ptr[GFile], cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GFileInputStream] = extern

@extern def g_file_read_async(file : Ptr[GFile], io_priority : CInt, cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_file_read_finish(file : Ptr[GFile], res : Ptr[GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GFileInputStream] = extern

@extern def g_file_replace(file : Ptr[GFile], etag : CString, make_backup : _root_.sn.gnome.glib.internal.gboolean, flags : GFileCreateFlags, cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GFileOutputStream] = extern

@extern def g_file_replace_async(file : Ptr[GFile], etag : CString, make_backup : _root_.sn.gnome.glib.internal.gboolean, flags : GFileCreateFlags, io_priority : CInt, cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_file_replace_contents(file : Ptr[GFile], contents : CString, length : _root_.sn.gnome.glib.internal.gsize, etag : CString, make_backup : _root_.sn.gnome.glib.internal.gboolean, flags : GFileCreateFlags, new_etag : Ptr[CString], cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_file_replace_contents_async(file : Ptr[GFile], contents : CString, length : _root_.sn.gnome.glib.internal.gsize, etag : CString, make_backup : _root_.sn.gnome.glib.internal.gboolean, flags : GFileCreateFlags, cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_file_replace_contents_bytes_async(file : Ptr[GFile], contents : Ptr[_root_.sn.gnome.glib.internal.GBytes], etag : CString, make_backup : _root_.sn.gnome.glib.internal.gboolean, flags : GFileCreateFlags, cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_file_replace_contents_finish(file : Ptr[GFile], res : Ptr[GAsyncResult], new_etag : Ptr[CString], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_file_replace_finish(file : Ptr[GFile], res : Ptr[GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GFileOutputStream] = extern

@extern def g_file_replace_readwrite(file : Ptr[GFile], etag : CString, make_backup : _root_.sn.gnome.glib.internal.gboolean, flags : GFileCreateFlags, cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GFileIOStream] = extern

@extern def g_file_replace_readwrite_async(file : Ptr[GFile], etag : CString, make_backup : _root_.sn.gnome.glib.internal.gboolean, flags : GFileCreateFlags, io_priority : CInt, cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_file_replace_readwrite_finish(file : Ptr[GFile], res : Ptr[GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GFileIOStream] = extern

@extern def g_file_resolve_relative_path(file : Ptr[GFile], relative_path : CString): Ptr[GFile] = extern

@extern def g_file_set_attribute(file : Ptr[GFile], attribute : CString, `type` : GFileAttributeType, value_p : _root_.sn.gnome.glib.internal.gpointer, flags : GFileQueryInfoFlags, cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_file_set_attribute_byte_string(file : Ptr[GFile], attribute : CString, value : CString, flags : GFileQueryInfoFlags, cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_file_set_attribute_int32(file : Ptr[GFile], attribute : CString, value : _root_.sn.gnome.glib.internal.gint32, flags : GFileQueryInfoFlags, cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_file_set_attribute_int64(file : Ptr[GFile], attribute : CString, value : _root_.sn.gnome.glib.internal.gint64, flags : GFileQueryInfoFlags, cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_file_set_attribute_string(file : Ptr[GFile], attribute : CString, value : CString, flags : GFileQueryInfoFlags, cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_file_set_attribute_uint32(file : Ptr[GFile], attribute : CString, value : _root_.sn.gnome.glib.internal.guint32, flags : GFileQueryInfoFlags, cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_file_set_attribute_uint64(file : Ptr[GFile], attribute : CString, value : _root_.sn.gnome.glib.internal.guint64, flags : GFileQueryInfoFlags, cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_file_set_attributes_async(file : Ptr[GFile], info : Ptr[GFileInfo], flags : GFileQueryInfoFlags, io_priority : CInt, cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_file_set_attributes_finish(file : Ptr[GFile], result : Ptr[GAsyncResult], info : Ptr[Ptr[GFileInfo]], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_file_set_attributes_from_info(file : Ptr[GFile], info : Ptr[GFileInfo], flags : GFileQueryInfoFlags, cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_file_set_display_name(file : Ptr[GFile], display_name : CString, cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GFile] = extern

@extern def g_file_set_display_name_async(file : Ptr[GFile], display_name : CString, io_priority : CInt, cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_file_set_display_name_finish(file : Ptr[GFile], res : Ptr[GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GFile] = extern

@extern def g_file_start_mountable(file : Ptr[GFile], flags : GDriveStartFlags, start_operation : Ptr[GMountOperation], cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_file_start_mountable_finish(file : Ptr[GFile], result : Ptr[GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_file_stop_mountable(file : Ptr[GFile], flags : GMountUnmountFlags, mount_operation : Ptr[GMountOperation], cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_file_stop_mountable_finish(file : Ptr[GFile], result : Ptr[GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_file_supports_thread_contexts(file : Ptr[GFile]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_file_trash(file : Ptr[GFile], cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_file_trash_async(file : Ptr[GFile], io_priority : CInt, cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_file_trash_finish(file : Ptr[GFile], result : Ptr[GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_file_type_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_file_unmount_mountable(file : Ptr[GFile], flags : GMountUnmountFlags, cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_file_unmount_mountable_finish(file : Ptr[GFile], result : Ptr[GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_file_unmount_mountable_with_operation(file : Ptr[GFile], flags : GMountUnmountFlags, mount_operation : Ptr[GMountOperation], cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_file_unmount_mountable_with_operation_finish(file : Ptr[GFile], result : Ptr[GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_filename_completer_get_completion_suffix(completer : Ptr[GFilenameCompleter], initial_text : CString): CString = extern

@extern def g_filename_completer_get_completions(completer : Ptr[GFilenameCompleter], initial_text : CString): Ptr[CString] = extern

@extern def g_filename_completer_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_filename_completer_new(): Ptr[GFilenameCompleter] = extern

@extern def g_filename_completer_set_dirs_only(completer : Ptr[GFilenameCompleter], dirs_only : _root_.sn.gnome.glib.internal.gboolean): Unit = extern

@extern def g_filesystem_preview_type_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_filter_input_stream_get_base_stream(stream : Ptr[GFilterInputStream]): Ptr[GInputStream] = extern

@extern def g_filter_input_stream_get_close_base_stream(stream : Ptr[GFilterInputStream]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_filter_input_stream_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_filter_input_stream_set_close_base_stream(stream : Ptr[GFilterInputStream], close_base : _root_.sn.gnome.glib.internal.gboolean): Unit = extern

@extern def g_filter_output_stream_get_base_stream(stream : Ptr[GFilterOutputStream]): Ptr[GOutputStream] = extern

@extern def g_filter_output_stream_get_close_base_stream(stream : Ptr[GFilterOutputStream]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_filter_output_stream_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_filter_output_stream_set_close_base_stream(stream : Ptr[GFilterOutputStream], close_base : _root_.sn.gnome.glib.internal.gboolean): Unit = extern

@extern def g_icon_deserialize(value : Ptr[_root_.sn.gnome.glib.internal.GVariant]): Ptr[GIcon] = extern

@extern def g_icon_equal(icon1 : Ptr[GIcon], icon2 : Ptr[GIcon]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_icon_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_icon_hash(icon : _root_.sn.gnome.glib.internal.gconstpointer): _root_.sn.gnome.glib.internal.guint = extern

@extern def g_icon_new_for_string(str : Ptr[_root_.sn.gnome.glib.internal.gchar], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GIcon] = extern

@extern def g_icon_serialize(icon : Ptr[GIcon]): Ptr[_root_.sn.gnome.glib.internal.GVariant] = extern

@extern def g_icon_to_string(icon : Ptr[GIcon]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def g_inet_address_equal(address : Ptr[GInetAddress], other_address : Ptr[GInetAddress]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_inet_address_get_family(address : Ptr[GInetAddress]): GSocketFamily = extern

@extern def g_inet_address_get_is_any(address : Ptr[GInetAddress]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_inet_address_get_is_link_local(address : Ptr[GInetAddress]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_inet_address_get_is_loopback(address : Ptr[GInetAddress]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_inet_address_get_is_mc_global(address : Ptr[GInetAddress]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_inet_address_get_is_mc_link_local(address : Ptr[GInetAddress]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_inet_address_get_is_mc_node_local(address : Ptr[GInetAddress]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_inet_address_get_is_mc_org_local(address : Ptr[GInetAddress]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_inet_address_get_is_mc_site_local(address : Ptr[GInetAddress]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_inet_address_get_is_multicast(address : Ptr[GInetAddress]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_inet_address_get_is_site_local(address : Ptr[GInetAddress]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_inet_address_get_native_size(address : Ptr[GInetAddress]): _root_.sn.gnome.glib.internal.gsize = extern

@extern def g_inet_address_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_inet_address_mask_equal(mask : Ptr[GInetAddressMask], mask2 : Ptr[GInetAddressMask]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_inet_address_mask_get_address(mask : Ptr[GInetAddressMask]): Ptr[GInetAddress] = extern

@extern def g_inet_address_mask_get_family(mask : Ptr[GInetAddressMask]): GSocketFamily = extern

@extern def g_inet_address_mask_get_length(mask : Ptr[GInetAddressMask]): _root_.sn.gnome.glib.internal.guint = extern

@extern def g_inet_address_mask_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_inet_address_mask_matches(mask : Ptr[GInetAddressMask], address : Ptr[GInetAddress]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_inet_address_mask_new(addr : Ptr[GInetAddress], length : _root_.sn.gnome.glib.internal.guint, error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GInetAddressMask] = extern

@extern def g_inet_address_mask_new_from_string(mask_string : Ptr[_root_.sn.gnome.glib.internal.gchar], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GInetAddressMask] = extern

@extern def g_inet_address_mask_to_string(mask : Ptr[GInetAddressMask]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def g_inet_address_new_any(family : GSocketFamily): Ptr[GInetAddress] = extern

@extern def g_inet_address_new_from_bytes(bytes : Ptr[_root_.sn.gnome.glib.internal.guint8], family : GSocketFamily): Ptr[GInetAddress] = extern

@extern def g_inet_address_new_from_string(string : Ptr[_root_.sn.gnome.glib.internal.gchar]): Ptr[GInetAddress] = extern

@extern def g_inet_address_new_loopback(family : GSocketFamily): Ptr[GInetAddress] = extern

@extern def g_inet_address_to_bytes(address : Ptr[GInetAddress]): Ptr[_root_.sn.gnome.glib.internal.guint8] = extern

@extern def g_inet_address_to_string(address : Ptr[GInetAddress]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def g_inet_socket_address_get_address(address : Ptr[GInetSocketAddress]): Ptr[GInetAddress] = extern

@extern def g_inet_socket_address_get_flowinfo(address : Ptr[GInetSocketAddress]): _root_.sn.gnome.glib.internal.guint32 = extern

@extern def g_inet_socket_address_get_port(address : Ptr[GInetSocketAddress]): _root_.sn.gnome.glib.internal.guint16 = extern

@extern def g_inet_socket_address_get_scope_id(address : Ptr[GInetSocketAddress]): _root_.sn.gnome.glib.internal.guint32 = extern

@extern def g_inet_socket_address_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_inet_socket_address_new(address : Ptr[GInetAddress], port : _root_.sn.gnome.glib.internal.guint16): Ptr[GSocketAddress] = extern

@extern def g_inet_socket_address_new_from_string(address : CString, port : _root_.sn.gnome.glib.internal.guint): Ptr[GSocketAddress] = extern

@extern def g_initable_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_initable_init(initable : Ptr[GInitable], cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_initable_new(object_type : _root_.sn.gnome.gobject.internal.GType, cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], first_property_name : Ptr[_root_.sn.gnome.glib.internal.gchar], rest: Any*): _root_.sn.gnome.glib.internal.gpointer = extern

@extern def g_initable_new_valist(object_type : _root_.sn.gnome.gobject.internal.GType, first_property_name : Ptr[_root_.sn.gnome.glib.internal.gchar], var_args : va_list, cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[_root_.sn.gnome.gobject.internal.GObject] = extern

@extern def g_initable_newv(object_type : _root_.sn.gnome.gobject.internal.GType, n_parameters : _root_.sn.gnome.glib.internal.guint, parameters : Ptr[_root_.sn.gnome.gobject.internal.GParameter], cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gpointer = extern

@extern def g_input_stream_clear_pending(stream : Ptr[GInputStream]): Unit = extern

@extern def g_input_stream_close(stream : Ptr[GInputStream], cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_input_stream_close_async(stream : Ptr[GInputStream], io_priority : CInt, cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_input_stream_close_finish(stream : Ptr[GInputStream], result : Ptr[GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_input_stream_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_input_stream_has_pending(stream : Ptr[GInputStream]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_input_stream_is_closed(stream : Ptr[GInputStream]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_input_stream_read(stream : Ptr[GInputStream], buffer : Ptr[Byte], count : _root_.sn.gnome.glib.internal.gsize, cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gssize = extern

@extern def g_input_stream_read_all(stream : Ptr[GInputStream], buffer : Ptr[Byte], count : _root_.sn.gnome.glib.internal.gsize, bytes_read : Ptr[_root_.sn.gnome.glib.internal.gsize], cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_input_stream_read_all_async(stream : Ptr[GInputStream], buffer : Ptr[Byte], count : _root_.sn.gnome.glib.internal.gsize, io_priority : CInt, cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_input_stream_read_all_finish(stream : Ptr[GInputStream], result : Ptr[GAsyncResult], bytes_read : Ptr[_root_.sn.gnome.glib.internal.gsize], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_input_stream_read_async(stream : Ptr[GInputStream], buffer : Ptr[Byte], count : _root_.sn.gnome.glib.internal.gsize, io_priority : CInt, cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_input_stream_read_bytes(stream : Ptr[GInputStream], count : _root_.sn.gnome.glib.internal.gsize, cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[_root_.sn.gnome.glib.internal.GBytes] = extern

@extern def g_input_stream_read_bytes_async(stream : Ptr[GInputStream], count : _root_.sn.gnome.glib.internal.gsize, io_priority : CInt, cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_input_stream_read_bytes_finish(stream : Ptr[GInputStream], result : Ptr[GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[_root_.sn.gnome.glib.internal.GBytes] = extern

@extern def g_input_stream_read_finish(stream : Ptr[GInputStream], result : Ptr[GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gssize = extern

@extern def g_input_stream_set_pending(stream : Ptr[GInputStream], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_input_stream_skip(stream : Ptr[GInputStream], count : _root_.sn.gnome.glib.internal.gsize, cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gssize = extern

@extern def g_input_stream_skip_async(stream : Ptr[GInputStream], count : _root_.sn.gnome.glib.internal.gsize, io_priority : CInt, cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_input_stream_skip_finish(stream : Ptr[GInputStream], result : Ptr[GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gssize = extern

@extern def g_io_error_enum_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_io_error_from_errno(err_no : _root_.sn.gnome.glib.internal.gint): GIOErrorEnum = extern

@extern def g_io_error_from_file_error(file_error : _root_.sn.gnome.glib.internal.GFileError): GIOErrorEnum = extern

@extern def g_io_error_quark(): _root_.sn.gnome.glib.internal.GQuark = extern

@extern def g_io_extension_get_name(extension : Ptr[GIOExtension]): CString = extern

@extern def g_io_extension_get_priority(extension : Ptr[GIOExtension]): _root_.sn.gnome.glib.internal.gint = extern

@extern def g_io_extension_get_type(extension : Ptr[GIOExtension]): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_io_extension_point_get_extension_by_name(extension_point : Ptr[GIOExtensionPoint], name : CString): Ptr[GIOExtension] = extern

@extern def g_io_extension_point_get_extensions(extension_point : Ptr[GIOExtensionPoint]): Ptr[_root_.sn.gnome.glib.internal.GList] = extern

@extern def g_io_extension_point_get_required_type(extension_point : Ptr[GIOExtensionPoint]): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_io_extension_point_implement(extension_point_name : CString, `type` : _root_.sn.gnome.gobject.internal.GType, extension_name : CString, priority : _root_.sn.gnome.glib.internal.gint): Ptr[GIOExtension] = extern

@extern def g_io_extension_point_lookup(name : CString): Ptr[GIOExtensionPoint] = extern

@extern def g_io_extension_point_register(name : CString): Ptr[GIOExtensionPoint] = extern

@extern def g_io_extension_point_set_required_type(extension_point : Ptr[GIOExtensionPoint], `type` : _root_.sn.gnome.gobject.internal.GType): Unit = extern

@extern def g_io_extension_ref_class(extension : Ptr[GIOExtension]): Ptr[_root_.sn.gnome.gobject.internal.GTypeClass] = extern

@extern def g_io_module_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

/**
 * g_io_module_load: (skip) : a #GIOModule.
*/
@extern def g_io_module_load(module : Ptr[GIOModule]): Unit = extern

@extern def g_io_module_new(filename : Ptr[_root_.sn.gnome.glib.internal.gchar]): Ptr[GIOModule] = extern

/**
 * g_io_module_query:
*/
@extern def g_io_module_query(): Ptr[CString] = extern

@extern def g_io_module_scope_block(scope : Ptr[GIOModuleScope], basename : Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = extern

@extern def g_io_module_scope_flags_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_io_module_scope_free(scope : Ptr[GIOModuleScope]): Unit = extern

@extern def g_io_module_scope_new(flags : GIOModuleScopeFlags): Ptr[GIOModuleScope] = extern

/**
 * g_io_module_unload: (skip) : a #GIOModule.
*/
@extern def g_io_module_unload(module : Ptr[GIOModule]): Unit = extern

@extern def g_io_modules_load_all_in_directory(dirname : Ptr[_root_.sn.gnome.glib.internal.gchar]): Ptr[_root_.sn.gnome.glib.internal.GList] = extern

@extern def g_io_modules_load_all_in_directory_with_scope(dirname : Ptr[_root_.sn.gnome.glib.internal.gchar], scope : Ptr[GIOModuleScope]): Ptr[_root_.sn.gnome.glib.internal.GList] = extern

@extern def g_io_modules_scan_all_in_directory(dirname : CString): Unit = extern

@extern def g_io_modules_scan_all_in_directory_with_scope(dirname : Ptr[_root_.sn.gnome.glib.internal.gchar], scope : Ptr[GIOModuleScope]): Unit = extern

@extern def g_io_scheduler_cancel_all_jobs(): Unit = extern

@extern def g_io_scheduler_job_send_to_mainloop(job : Ptr[GIOSchedulerJob], func : _root_.sn.gnome.glib.internal.GSourceFunc, user_data : _root_.sn.gnome.glib.internal.gpointer, notify : _root_.sn.gnome.glib.internal.GDestroyNotify): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_io_scheduler_job_send_to_mainloop_async(job : Ptr[GIOSchedulerJob], func : _root_.sn.gnome.glib.internal.GSourceFunc, user_data : _root_.sn.gnome.glib.internal.gpointer, notify : _root_.sn.gnome.glib.internal.GDestroyNotify): Unit = extern

@extern def g_io_scheduler_push_job(job_func : GIOSchedulerJobFunc, user_data : _root_.sn.gnome.glib.internal.gpointer, notify : _root_.sn.gnome.glib.internal.GDestroyNotify, io_priority : _root_.sn.gnome.glib.internal.gint, cancellable : Ptr[GCancellable]): Unit = extern

@extern def g_io_stream_clear_pending(stream : Ptr[GIOStream]): Unit = extern

@extern def g_io_stream_close(stream : Ptr[GIOStream], cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_io_stream_close_async(stream : Ptr[GIOStream], io_priority : CInt, cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_io_stream_close_finish(stream : Ptr[GIOStream], result : Ptr[GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_io_stream_get_input_stream(stream : Ptr[GIOStream]): Ptr[GInputStream] = extern

@extern def g_io_stream_get_output_stream(stream : Ptr[GIOStream]): Ptr[GOutputStream] = extern

@extern def g_io_stream_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_io_stream_has_pending(stream : Ptr[GIOStream]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_io_stream_is_closed(stream : Ptr[GIOStream]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_io_stream_set_pending(stream : Ptr[GIOStream], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_io_stream_splice_async(stream1 : Ptr[GIOStream], stream2 : Ptr[GIOStream], flags : GIOStreamSpliceFlags, io_priority : CInt, cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_io_stream_splice_finish(result : Ptr[GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_io_stream_splice_flags_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_list_model_get_item(list : Ptr[GListModel], position : _root_.sn.gnome.glib.internal.guint): _root_.sn.gnome.glib.internal.gpointer = extern

@extern def g_list_model_get_item_type(list : Ptr[GListModel]): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_list_model_get_n_items(list : Ptr[GListModel]): _root_.sn.gnome.glib.internal.guint = extern

@extern def g_list_model_get_object(list : Ptr[GListModel], position : _root_.sn.gnome.glib.internal.guint): Ptr[_root_.sn.gnome.gobject.internal.GObject] = extern

@extern def g_list_model_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_list_model_items_changed(list : Ptr[GListModel], position : _root_.sn.gnome.glib.internal.guint, removed : _root_.sn.gnome.glib.internal.guint, added : _root_.sn.gnome.glib.internal.guint): Unit = extern

@extern def g_list_store_append(store : Ptr[GListStore], item : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_list_store_find(store : Ptr[GListStore], item : _root_.sn.gnome.glib.internal.gpointer, position : Ptr[_root_.sn.gnome.glib.internal.guint]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_list_store_find_with_equal_func(store : Ptr[GListStore], item : _root_.sn.gnome.glib.internal.gpointer, equal_func : _root_.sn.gnome.glib.internal.GEqualFunc, position : Ptr[_root_.sn.gnome.glib.internal.guint]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_list_store_find_with_equal_func_full(store : Ptr[GListStore], item : _root_.sn.gnome.glib.internal.gpointer, equal_func : _root_.sn.gnome.glib.internal.GEqualFuncFull, user_data : _root_.sn.gnome.glib.internal.gpointer, position : Ptr[_root_.sn.gnome.glib.internal.guint]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_list_store_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_list_store_insert(store : Ptr[GListStore], position : _root_.sn.gnome.glib.internal.guint, item : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_list_store_insert_sorted(store : Ptr[GListStore], item : _root_.sn.gnome.glib.internal.gpointer, compare_func : _root_.sn.gnome.glib.internal.GCompareDataFunc, user_data : _root_.sn.gnome.glib.internal.gpointer): _root_.sn.gnome.glib.internal.guint = extern

@extern def g_list_store_new(item_type : _root_.sn.gnome.gobject.internal.GType): Ptr[GListStore] = extern

@extern def g_list_store_remove(store : Ptr[GListStore], position : _root_.sn.gnome.glib.internal.guint): Unit = extern

@extern def g_list_store_remove_all(store : Ptr[GListStore]): Unit = extern

@extern def g_list_store_sort(store : Ptr[GListStore], compare_func : _root_.sn.gnome.glib.internal.GCompareDataFunc, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_list_store_splice(store : Ptr[GListStore], position : _root_.sn.gnome.glib.internal.guint, n_removals : _root_.sn.gnome.glib.internal.guint, additions : Ptr[_root_.sn.gnome.glib.internal.gpointer], n_additions : _root_.sn.gnome.glib.internal.guint): Unit = extern

@extern def g_loadable_icon_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_loadable_icon_load(icon : Ptr[GLoadableIcon], size : CInt, `type` : Ptr[CString], cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GInputStream] = extern

@extern def g_loadable_icon_load_async(icon : Ptr[GLoadableIcon], size : CInt, cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_loadable_icon_load_finish(icon : Ptr[GLoadableIcon], res : Ptr[GAsyncResult], `type` : Ptr[CString], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GInputStream] = extern

@extern def g_memory_input_stream_add_bytes(stream : Ptr[GMemoryInputStream], bytes : Ptr[_root_.sn.gnome.glib.internal.GBytes]): Unit = extern

@extern def g_memory_input_stream_add_data(stream : Ptr[GMemoryInputStream], data : Ptr[Byte], len : _root_.sn.gnome.glib.internal.gssize, destroy : _root_.sn.gnome.glib.internal.GDestroyNotify): Unit = extern

@extern def g_memory_input_stream_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_memory_input_stream_new(): Ptr[GInputStream] = extern

@extern def g_memory_input_stream_new_from_bytes(bytes : Ptr[_root_.sn.gnome.glib.internal.GBytes]): Ptr[GInputStream] = extern

@extern def g_memory_input_stream_new_from_data(data : Ptr[Byte], len : _root_.sn.gnome.glib.internal.gssize, destroy : _root_.sn.gnome.glib.internal.GDestroyNotify): Ptr[GInputStream] = extern

@extern def g_memory_monitor(ptr : _root_.sn.gnome.glib.internal.gpointer): Ptr[GMemoryMonitor] = extern

@extern def g_memory_monitor_GET_IFACE(ptr : _root_.sn.gnome.glib.internal.gpointer): Ptr[GMemoryMonitorInterface] = extern

@extern def g_memory_monitor_dup_default(): Ptr[GMemoryMonitor] = extern

@extern def g_memory_monitor_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_memory_monitor_warning_level_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_memory_output_stream_get_data(ostream : Ptr[GMemoryOutputStream]): _root_.sn.gnome.glib.internal.gpointer = extern

@extern def g_memory_output_stream_get_data_size(ostream : Ptr[GMemoryOutputStream]): _root_.sn.gnome.glib.internal.gsize = extern

@extern def g_memory_output_stream_get_size(ostream : Ptr[GMemoryOutputStream]): _root_.sn.gnome.glib.internal.gsize = extern

@extern def g_memory_output_stream_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_memory_output_stream_new(data : _root_.sn.gnome.glib.internal.gpointer, size : _root_.sn.gnome.glib.internal.gsize, realloc_function : GReallocFunc, destroy_function : _root_.sn.gnome.glib.internal.GDestroyNotify): Ptr[GOutputStream] = extern

@extern def g_memory_output_stream_new_resizable(): Ptr[GOutputStream] = extern

@extern def g_memory_output_stream_steal_as_bytes(ostream : Ptr[GMemoryOutputStream]): Ptr[_root_.sn.gnome.glib.internal.GBytes] = extern

@extern def g_memory_output_stream_steal_data(ostream : Ptr[GMemoryOutputStream]): _root_.sn.gnome.glib.internal.gpointer = extern

@extern def g_menu_append(menu : Ptr[GMenu], label : Ptr[_root_.sn.gnome.glib.internal.gchar], detailed_action : Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = extern

@extern def g_menu_append_item(menu : Ptr[GMenu], item : Ptr[GMenuItem]): Unit = extern

@extern def g_menu_append_section(menu : Ptr[GMenu], label : Ptr[_root_.sn.gnome.glib.internal.gchar], section : Ptr[GMenuModel]): Unit = extern

@extern def g_menu_append_submenu(menu : Ptr[GMenu], label : Ptr[_root_.sn.gnome.glib.internal.gchar], submenu : Ptr[GMenuModel]): Unit = extern

@extern def g_menu_attribute_iter_get_name(iter : Ptr[GMenuAttributeIter]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def g_menu_attribute_iter_get_next(iter : Ptr[GMenuAttributeIter], out_name : Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]], value : Ptr[Ptr[_root_.sn.gnome.glib.internal.GVariant]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_menu_attribute_iter_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_menu_attribute_iter_get_value(iter : Ptr[GMenuAttributeIter]): Ptr[_root_.sn.gnome.glib.internal.GVariant] = extern

@extern def g_menu_attribute_iter_next(iter : Ptr[GMenuAttributeIter]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_menu_freeze(menu : Ptr[GMenu]): Unit = extern

@extern def g_menu_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_menu_insert(menu : Ptr[GMenu], position : _root_.sn.gnome.glib.internal.gint, label : Ptr[_root_.sn.gnome.glib.internal.gchar], detailed_action : Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = extern

@extern def g_menu_insert_item(menu : Ptr[GMenu], position : _root_.sn.gnome.glib.internal.gint, item : Ptr[GMenuItem]): Unit = extern

@extern def g_menu_insert_section(menu : Ptr[GMenu], position : _root_.sn.gnome.glib.internal.gint, label : Ptr[_root_.sn.gnome.glib.internal.gchar], section : Ptr[GMenuModel]): Unit = extern

@extern def g_menu_insert_submenu(menu : Ptr[GMenu], position : _root_.sn.gnome.glib.internal.gint, label : Ptr[_root_.sn.gnome.glib.internal.gchar], submenu : Ptr[GMenuModel]): Unit = extern

@extern def g_menu_item_get_attribute(menu_item : Ptr[GMenuItem], attribute : Ptr[_root_.sn.gnome.glib.internal.gchar], format_string : Ptr[_root_.sn.gnome.glib.internal.gchar], rest: Any*): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_menu_item_get_attribute_value(menu_item : Ptr[GMenuItem], attribute : Ptr[_root_.sn.gnome.glib.internal.gchar], expected_type : Ptr[_root_.sn.gnome.glib.internal.GVariantType]): Ptr[_root_.sn.gnome.glib.internal.GVariant] = extern

@extern def g_menu_item_get_link(menu_item : Ptr[GMenuItem], link : Ptr[_root_.sn.gnome.glib.internal.gchar]): Ptr[GMenuModel] = extern

@extern def g_menu_item_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_menu_item_new(label : Ptr[_root_.sn.gnome.glib.internal.gchar], detailed_action : Ptr[_root_.sn.gnome.glib.internal.gchar]): Ptr[GMenuItem] = extern

@extern def g_menu_item_new_from_model(model : Ptr[GMenuModel], item_index : _root_.sn.gnome.glib.internal.gint): Ptr[GMenuItem] = extern

@extern def g_menu_item_new_section(label : Ptr[_root_.sn.gnome.glib.internal.gchar], section : Ptr[GMenuModel]): Ptr[GMenuItem] = extern

@extern def g_menu_item_new_submenu(label : Ptr[_root_.sn.gnome.glib.internal.gchar], submenu : Ptr[GMenuModel]): Ptr[GMenuItem] = extern

@extern def g_menu_item_set_action_and_target(menu_item : Ptr[GMenuItem], action : Ptr[_root_.sn.gnome.glib.internal.gchar], format_string : Ptr[_root_.sn.gnome.glib.internal.gchar], rest: Any*): Unit = extern

@extern def g_menu_item_set_action_and_target_value(menu_item : Ptr[GMenuItem], action : Ptr[_root_.sn.gnome.glib.internal.gchar], target_value : Ptr[_root_.sn.gnome.glib.internal.GVariant]): Unit = extern

@extern def g_menu_item_set_attribute(menu_item : Ptr[GMenuItem], attribute : Ptr[_root_.sn.gnome.glib.internal.gchar], format_string : Ptr[_root_.sn.gnome.glib.internal.gchar], rest: Any*): Unit = extern

@extern def g_menu_item_set_attribute_value(menu_item : Ptr[GMenuItem], attribute : Ptr[_root_.sn.gnome.glib.internal.gchar], value : Ptr[_root_.sn.gnome.glib.internal.GVariant]): Unit = extern

@extern def g_menu_item_set_detailed_action(menu_item : Ptr[GMenuItem], detailed_action : Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = extern

@extern def g_menu_item_set_icon(menu_item : Ptr[GMenuItem], icon : Ptr[GIcon]): Unit = extern

@extern def g_menu_item_set_label(menu_item : Ptr[GMenuItem], label : Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = extern

@extern def g_menu_item_set_link(menu_item : Ptr[GMenuItem], link : Ptr[_root_.sn.gnome.glib.internal.gchar], model : Ptr[GMenuModel]): Unit = extern

@extern def g_menu_item_set_section(menu_item : Ptr[GMenuItem], section : Ptr[GMenuModel]): Unit = extern

@extern def g_menu_item_set_submenu(menu_item : Ptr[GMenuItem], submenu : Ptr[GMenuModel]): Unit = extern

@extern def g_menu_link_iter_get_name(iter : Ptr[GMenuLinkIter]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def g_menu_link_iter_get_next(iter : Ptr[GMenuLinkIter], out_link : Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]], value : Ptr[Ptr[GMenuModel]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_menu_link_iter_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_menu_link_iter_get_value(iter : Ptr[GMenuLinkIter]): Ptr[GMenuModel] = extern

@extern def g_menu_link_iter_next(iter : Ptr[GMenuLinkIter]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_menu_model_get_item_attribute(model : Ptr[GMenuModel], item_index : _root_.sn.gnome.glib.internal.gint, attribute : Ptr[_root_.sn.gnome.glib.internal.gchar], format_string : Ptr[_root_.sn.gnome.glib.internal.gchar], rest: Any*): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_menu_model_get_item_attribute_value(model : Ptr[GMenuModel], item_index : _root_.sn.gnome.glib.internal.gint, attribute : Ptr[_root_.sn.gnome.glib.internal.gchar], expected_type : Ptr[_root_.sn.gnome.glib.internal.GVariantType]): Ptr[_root_.sn.gnome.glib.internal.GVariant] = extern

@extern def g_menu_model_get_item_link(model : Ptr[GMenuModel], item_index : _root_.sn.gnome.glib.internal.gint, link : Ptr[_root_.sn.gnome.glib.internal.gchar]): Ptr[GMenuModel] = extern

@extern def g_menu_model_get_n_items(model : Ptr[GMenuModel]): _root_.sn.gnome.glib.internal.gint = extern

@extern def g_menu_model_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_menu_model_is_mutable(model : Ptr[GMenuModel]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_menu_model_items_changed(model : Ptr[GMenuModel], position : _root_.sn.gnome.glib.internal.gint, removed : _root_.sn.gnome.glib.internal.gint, added : _root_.sn.gnome.glib.internal.gint): Unit = extern

@extern def g_menu_model_iterate_item_attributes(model : Ptr[GMenuModel], item_index : _root_.sn.gnome.glib.internal.gint): Ptr[GMenuAttributeIter] = extern

@extern def g_menu_model_iterate_item_links(model : Ptr[GMenuModel], item_index : _root_.sn.gnome.glib.internal.gint): Ptr[GMenuLinkIter] = extern

@extern def g_menu_new(): Ptr[GMenu] = extern

@extern def g_menu_prepend(menu : Ptr[GMenu], label : Ptr[_root_.sn.gnome.glib.internal.gchar], detailed_action : Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = extern

@extern def g_menu_prepend_item(menu : Ptr[GMenu], item : Ptr[GMenuItem]): Unit = extern

@extern def g_menu_prepend_section(menu : Ptr[GMenu], label : Ptr[_root_.sn.gnome.glib.internal.gchar], section : Ptr[GMenuModel]): Unit = extern

@extern def g_menu_prepend_submenu(menu : Ptr[GMenu], label : Ptr[_root_.sn.gnome.glib.internal.gchar], submenu : Ptr[GMenuModel]): Unit = extern

@extern def g_menu_remove(menu : Ptr[GMenu], position : _root_.sn.gnome.glib.internal.gint): Unit = extern

@extern def g_menu_remove_all(menu : Ptr[GMenu]): Unit = extern

@extern def g_mount_can_eject(mount : Ptr[GMount]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_mount_can_unmount(mount : Ptr[GMount]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_mount_eject(mount : Ptr[GMount], flags : GMountUnmountFlags, cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_mount_eject_finish(mount : Ptr[GMount], result : Ptr[GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_mount_eject_with_operation(mount : Ptr[GMount], flags : GMountUnmountFlags, mount_operation : Ptr[GMountOperation], cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_mount_eject_with_operation_finish(mount : Ptr[GMount], result : Ptr[GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_mount_get_default_location(mount : Ptr[GMount]): Ptr[GFile] = extern

@extern def g_mount_get_drive(mount : Ptr[GMount]): Ptr[GDrive] = extern

@extern def g_mount_get_icon(mount : Ptr[GMount]): Ptr[GIcon] = extern

@extern def g_mount_get_name(mount : Ptr[GMount]): CString = extern

@extern def g_mount_get_root(mount : Ptr[GMount]): Ptr[GFile] = extern

@extern def g_mount_get_sort_key(mount : Ptr[GMount]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def g_mount_get_symbolic_icon(mount : Ptr[GMount]): Ptr[GIcon] = extern

@extern def g_mount_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_mount_get_uuid(mount : Ptr[GMount]): CString = extern

@extern def g_mount_get_volume(mount : Ptr[GMount]): Ptr[GVolume] = extern

@extern def g_mount_guess_content_type(mount : Ptr[GMount], force_rescan : _root_.sn.gnome.glib.internal.gboolean, cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_mount_guess_content_type_finish(mount : Ptr[GMount], result : Ptr[GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]] = extern

@extern def g_mount_guess_content_type_sync(mount : Ptr[GMount], force_rescan : _root_.sn.gnome.glib.internal.gboolean, cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]] = extern

@extern def g_mount_is_shadowed(mount : Ptr[GMount]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_mount_mount_flags_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_mount_operation_get_anonymous(op : Ptr[GMountOperation]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_mount_operation_get_choice(op : Ptr[GMountOperation]): CInt = extern

@extern def g_mount_operation_get_domain(op : Ptr[GMountOperation]): CString = extern

@extern def g_mount_operation_get_is_tcrypt_hidden_volume(op : Ptr[GMountOperation]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_mount_operation_get_is_tcrypt_system_volume(op : Ptr[GMountOperation]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_mount_operation_get_password(op : Ptr[GMountOperation]): CString = extern

@extern def g_mount_operation_get_password_save(op : Ptr[GMountOperation]): GPasswordSave = extern

@extern def g_mount_operation_get_pim(op : Ptr[GMountOperation]): _root_.sn.gnome.glib.internal.guint = extern

@extern def g_mount_operation_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_mount_operation_get_username(op : Ptr[GMountOperation]): CString = extern

@extern def g_mount_operation_new(): Ptr[GMountOperation] = extern

@extern def g_mount_operation_reply(op : Ptr[GMountOperation], result : GMountOperationResult): Unit = extern

@extern def g_mount_operation_result_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_mount_operation_set_anonymous(op : Ptr[GMountOperation], anonymous : _root_.sn.gnome.glib.internal.gboolean): Unit = extern

@extern def g_mount_operation_set_choice(op : Ptr[GMountOperation], choice : CInt): Unit = extern

@extern def g_mount_operation_set_domain(op : Ptr[GMountOperation], domain : CString): Unit = extern

@extern def g_mount_operation_set_is_tcrypt_hidden_volume(op : Ptr[GMountOperation], hidden_volume : _root_.sn.gnome.glib.internal.gboolean): Unit = extern

@extern def g_mount_operation_set_is_tcrypt_system_volume(op : Ptr[GMountOperation], system_volume : _root_.sn.gnome.glib.internal.gboolean): Unit = extern

@extern def g_mount_operation_set_password(op : Ptr[GMountOperation], password : CString): Unit = extern

@extern def g_mount_operation_set_password_save(op : Ptr[GMountOperation], save : GPasswordSave): Unit = extern

@extern def g_mount_operation_set_pim(op : Ptr[GMountOperation], pim : _root_.sn.gnome.glib.internal.guint): Unit = extern

@extern def g_mount_operation_set_username(op : Ptr[GMountOperation], username : CString): Unit = extern

@extern def g_mount_remount(mount : Ptr[GMount], flags : GMountMountFlags, mount_operation : Ptr[GMountOperation], cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_mount_remount_finish(mount : Ptr[GMount], result : Ptr[GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_mount_shadow(mount : Ptr[GMount]): Unit = extern

@extern def g_mount_unmount(mount : Ptr[GMount], flags : GMountUnmountFlags, cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_mount_unmount_finish(mount : Ptr[GMount], result : Ptr[GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_mount_unmount_flags_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_mount_unmount_with_operation(mount : Ptr[GMount], flags : GMountUnmountFlags, mount_operation : Ptr[GMountOperation], cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_mount_unmount_with_operation_finish(mount : Ptr[GMount], result : Ptr[GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_mount_unshadow(mount : Ptr[GMount]): Unit = extern

@extern def g_native_socket_address_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_native_socket_address_new(native : _root_.sn.gnome.glib.internal.gpointer, len : _root_.sn.gnome.glib.internal.gsize): Ptr[GSocketAddress] = extern

@extern def g_native_volume_monitor_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_network_address_get_hostname(addr : Ptr[GNetworkAddress]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def g_network_address_get_port(addr : Ptr[GNetworkAddress]): _root_.sn.gnome.glib.internal.guint16 = extern

@extern def g_network_address_get_scheme(addr : Ptr[GNetworkAddress]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def g_network_address_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_network_address_new(hostname : Ptr[_root_.sn.gnome.glib.internal.gchar], port : _root_.sn.gnome.glib.internal.guint16): Ptr[GSocketConnectable] = extern

@extern def g_network_address_new_loopback(port : _root_.sn.gnome.glib.internal.guint16): Ptr[GSocketConnectable] = extern

@extern def g_network_address_parse(host_and_port : Ptr[_root_.sn.gnome.glib.internal.gchar], default_port : _root_.sn.gnome.glib.internal.guint16, error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GSocketConnectable] = extern

@extern def g_network_address_parse_uri(uri : Ptr[_root_.sn.gnome.glib.internal.gchar], default_port : _root_.sn.gnome.glib.internal.guint16, error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GSocketConnectable] = extern

@extern def g_network_connectivity_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_network_monitor_can_reach(monitor : Ptr[GNetworkMonitor], connectable : Ptr[GSocketConnectable], cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_network_monitor_can_reach_async(monitor : Ptr[GNetworkMonitor], connectable : Ptr[GSocketConnectable], cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_network_monitor_can_reach_finish(monitor : Ptr[GNetworkMonitor], result : Ptr[GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_network_monitor_get_connectivity(monitor : Ptr[GNetworkMonitor]): GNetworkConnectivity = extern

@extern def g_network_monitor_get_default(): Ptr[GNetworkMonitor] = extern

@extern def g_network_monitor_get_network_available(monitor : Ptr[GNetworkMonitor]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_network_monitor_get_network_metered(monitor : Ptr[GNetworkMonitor]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_network_monitor_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_network_service_get_domain(srv : Ptr[GNetworkService]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def g_network_service_get_protocol(srv : Ptr[GNetworkService]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def g_network_service_get_scheme(srv : Ptr[GNetworkService]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def g_network_service_get_service(srv : Ptr[GNetworkService]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def g_network_service_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_network_service_new(service : Ptr[_root_.sn.gnome.glib.internal.gchar], protocol : Ptr[_root_.sn.gnome.glib.internal.gchar], domain : Ptr[_root_.sn.gnome.glib.internal.gchar]): Ptr[GSocketConnectable] = extern

@extern def g_network_service_set_scheme(srv : Ptr[GNetworkService], scheme : Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = extern

@extern def g_notification_add_button(notification : Ptr[GNotification], label : Ptr[_root_.sn.gnome.glib.internal.gchar], detailed_action : Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = extern

@extern def g_notification_add_button_with_target(notification : Ptr[GNotification], label : Ptr[_root_.sn.gnome.glib.internal.gchar], action : Ptr[_root_.sn.gnome.glib.internal.gchar], target_format : Ptr[_root_.sn.gnome.glib.internal.gchar], rest: Any*): Unit = extern

@extern def g_notification_add_button_with_target_value(notification : Ptr[GNotification], label : Ptr[_root_.sn.gnome.glib.internal.gchar], action : Ptr[_root_.sn.gnome.glib.internal.gchar], target : Ptr[_root_.sn.gnome.glib.internal.GVariant]): Unit = extern

@extern def g_notification_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_notification_new(title : Ptr[_root_.sn.gnome.glib.internal.gchar]): Ptr[GNotification] = extern

@extern def g_notification_priority_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_notification_set_body(notification : Ptr[GNotification], body : Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = extern

@extern def g_notification_set_category(notification : Ptr[GNotification], category : Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = extern

@extern def g_notification_set_default_action(notification : Ptr[GNotification], detailed_action : Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = extern

@extern def g_notification_set_default_action_and_target(notification : Ptr[GNotification], action : Ptr[_root_.sn.gnome.glib.internal.gchar], target_format : Ptr[_root_.sn.gnome.glib.internal.gchar], rest: Any*): Unit = extern

@extern def g_notification_set_default_action_and_target_value(notification : Ptr[GNotification], action : Ptr[_root_.sn.gnome.glib.internal.gchar], target : Ptr[_root_.sn.gnome.glib.internal.GVariant]): Unit = extern

@extern def g_notification_set_icon(notification : Ptr[GNotification], icon : Ptr[GIcon]): Unit = extern

@extern def g_notification_set_priority(notification : Ptr[GNotification], priority : GNotificationPriority): Unit = extern

@extern def g_notification_set_title(notification : Ptr[GNotification], title : Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = extern

@extern def g_notification_set_urgent(notification : Ptr[GNotification], urgent : _root_.sn.gnome.glib.internal.gboolean): Unit = extern

@extern def g_output_stream_clear_pending(stream : Ptr[GOutputStream]): Unit = extern

@extern def g_output_stream_close(stream : Ptr[GOutputStream], cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_output_stream_close_async(stream : Ptr[GOutputStream], io_priority : CInt, cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_output_stream_close_finish(stream : Ptr[GOutputStream], result : Ptr[GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_output_stream_flush(stream : Ptr[GOutputStream], cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_output_stream_flush_async(stream : Ptr[GOutputStream], io_priority : CInt, cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_output_stream_flush_finish(stream : Ptr[GOutputStream], result : Ptr[GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_output_stream_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_output_stream_has_pending(stream : Ptr[GOutputStream]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_output_stream_is_closed(stream : Ptr[GOutputStream]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_output_stream_is_closing(stream : Ptr[GOutputStream]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_output_stream_printf(stream : Ptr[GOutputStream], bytes_written : Ptr[_root_.sn.gnome.glib.internal.gsize], cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], format : Ptr[_root_.sn.gnome.glib.internal.gchar], rest: Any*): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_output_stream_set_pending(stream : Ptr[GOutputStream], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_output_stream_splice(stream : Ptr[GOutputStream], source : Ptr[GInputStream], flags : GOutputStreamSpliceFlags, cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gssize = extern

@extern def g_output_stream_splice_async(stream : Ptr[GOutputStream], source : Ptr[GInputStream], flags : GOutputStreamSpliceFlags, io_priority : CInt, cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_output_stream_splice_finish(stream : Ptr[GOutputStream], result : Ptr[GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gssize = extern

@extern def g_output_stream_splice_flags_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_output_stream_vprintf(stream : Ptr[GOutputStream], bytes_written : Ptr[_root_.sn.gnome.glib.internal.gsize], cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], format : Ptr[_root_.sn.gnome.glib.internal.gchar], args : va_list): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_output_stream_write(stream : Ptr[GOutputStream], buffer : Ptr[Byte], count : _root_.sn.gnome.glib.internal.gsize, cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gssize = extern

@extern def g_output_stream_write_all(stream : Ptr[GOutputStream], buffer : Ptr[Byte], count : _root_.sn.gnome.glib.internal.gsize, bytes_written : Ptr[_root_.sn.gnome.glib.internal.gsize], cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_output_stream_write_all_async(stream : Ptr[GOutputStream], buffer : Ptr[Byte], count : _root_.sn.gnome.glib.internal.gsize, io_priority : CInt, cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_output_stream_write_all_finish(stream : Ptr[GOutputStream], result : Ptr[GAsyncResult], bytes_written : Ptr[_root_.sn.gnome.glib.internal.gsize], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_output_stream_write_async(stream : Ptr[GOutputStream], buffer : Ptr[Byte], count : _root_.sn.gnome.glib.internal.gsize, io_priority : CInt, cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_output_stream_write_bytes(stream : Ptr[GOutputStream], bytes : Ptr[_root_.sn.gnome.glib.internal.GBytes], cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gssize = extern

@extern def g_output_stream_write_bytes_async(stream : Ptr[GOutputStream], bytes : Ptr[_root_.sn.gnome.glib.internal.GBytes], io_priority : CInt, cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_output_stream_write_bytes_finish(stream : Ptr[GOutputStream], result : Ptr[GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gssize = extern

@extern def g_output_stream_write_finish(stream : Ptr[GOutputStream], result : Ptr[GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gssize = extern

@extern def g_output_stream_writev(stream : Ptr[GOutputStream], vectors : Ptr[GOutputVector], n_vectors : _root_.sn.gnome.glib.internal.gsize, bytes_written : Ptr[_root_.sn.gnome.glib.internal.gsize], cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_output_stream_writev_all(stream : Ptr[GOutputStream], vectors : Ptr[GOutputVector], n_vectors : _root_.sn.gnome.glib.internal.gsize, bytes_written : Ptr[_root_.sn.gnome.glib.internal.gsize], cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_output_stream_writev_all_async(stream : Ptr[GOutputStream], vectors : Ptr[GOutputVector], n_vectors : _root_.sn.gnome.glib.internal.gsize, io_priority : CInt, cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_output_stream_writev_all_finish(stream : Ptr[GOutputStream], result : Ptr[GAsyncResult], bytes_written : Ptr[_root_.sn.gnome.glib.internal.gsize], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_output_stream_writev_async(stream : Ptr[GOutputStream], vectors : Ptr[GOutputVector], n_vectors : _root_.sn.gnome.glib.internal.gsize, io_priority : CInt, cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_output_stream_writev_finish(stream : Ptr[GOutputStream], result : Ptr[GAsyncResult], bytes_written : Ptr[_root_.sn.gnome.glib.internal.gsize], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_password_save_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_permission_acquire(permission : Ptr[GPermission], cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_permission_acquire_async(permission : Ptr[GPermission], cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_permission_acquire_finish(permission : Ptr[GPermission], result : Ptr[GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_permission_get_allowed(permission : Ptr[GPermission]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_permission_get_can_acquire(permission : Ptr[GPermission]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_permission_get_can_release(permission : Ptr[GPermission]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_permission_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_permission_impl_update(permission : Ptr[GPermission], allowed : _root_.sn.gnome.glib.internal.gboolean, can_acquire : _root_.sn.gnome.glib.internal.gboolean, can_release : _root_.sn.gnome.glib.internal.gboolean): Unit = extern

@extern def g_permission_release(permission : Ptr[GPermission], cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_permission_release_async(permission : Ptr[GPermission], cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_permission_release_finish(permission : Ptr[GPermission], result : Ptr[GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_pollable_input_stream_can_poll(stream : Ptr[GPollableInputStream]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_pollable_input_stream_create_source(stream : Ptr[GPollableInputStream], cancellable : Ptr[GCancellable]): Ptr[_root_.sn.gnome.glib.internal.GSource] = extern

@extern def g_pollable_input_stream_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_pollable_input_stream_is_readable(stream : Ptr[GPollableInputStream]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_pollable_input_stream_read_nonblocking(stream : Ptr[GPollableInputStream], buffer : Ptr[Byte], count : _root_.sn.gnome.glib.internal.gsize, cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gssize = extern

@extern def g_pollable_output_stream_can_poll(stream : Ptr[GPollableOutputStream]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_pollable_output_stream_create_source(stream : Ptr[GPollableOutputStream], cancellable : Ptr[GCancellable]): Ptr[_root_.sn.gnome.glib.internal.GSource] = extern

@extern def g_pollable_output_stream_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_pollable_output_stream_is_writable(stream : Ptr[GPollableOutputStream]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_pollable_output_stream_write_nonblocking(stream : Ptr[GPollableOutputStream], buffer : Ptr[Byte], count : _root_.sn.gnome.glib.internal.gsize, cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gssize = extern

@extern def g_pollable_output_stream_writev_nonblocking(stream : Ptr[GPollableOutputStream], vectors : Ptr[GOutputVector], n_vectors : _root_.sn.gnome.glib.internal.gsize, bytes_written : Ptr[_root_.sn.gnome.glib.internal.gsize], cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): GPollableReturn = extern

@extern def g_pollable_return_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_pollable_source_new(pollable_stream : Ptr[_root_.sn.gnome.gobject.internal.GObject]): Ptr[_root_.sn.gnome.glib.internal.GSource] = extern

@extern def g_pollable_source_new_full(pollable_stream : _root_.sn.gnome.glib.internal.gpointer, child_source : Ptr[_root_.sn.gnome.glib.internal.GSource], cancellable : Ptr[GCancellable]): Ptr[_root_.sn.gnome.glib.internal.GSource] = extern

@extern def g_pollable_stream_read(stream : Ptr[GInputStream], buffer : Ptr[Byte], count : _root_.sn.gnome.glib.internal.gsize, blocking : _root_.sn.gnome.glib.internal.gboolean, cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gssize = extern

@extern def g_pollable_stream_write(stream : Ptr[GOutputStream], buffer : Ptr[Byte], count : _root_.sn.gnome.glib.internal.gsize, blocking : _root_.sn.gnome.glib.internal.gboolean, cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gssize = extern

@extern def g_pollable_stream_write_all(stream : Ptr[GOutputStream], buffer : Ptr[Byte], count : _root_.sn.gnome.glib.internal.gsize, blocking : _root_.sn.gnome.glib.internal.gboolean, bytes_written : Ptr[_root_.sn.gnome.glib.internal.gsize], cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_power_profile_monitor(ptr : _root_.sn.gnome.glib.internal.gpointer): Ptr[GPowerProfileMonitor] = extern

@extern def g_power_profile_monitor_GET_IFACE(ptr : _root_.sn.gnome.glib.internal.gpointer): Ptr[GPowerProfileMonitorInterface] = extern

@extern def g_power_profile_monitor_dup_default(): Ptr[GPowerProfileMonitor] = extern

@extern def g_power_profile_monitor_get_power_saver_enabled(monitor : Ptr[GPowerProfileMonitor]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_power_profile_monitor_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_property_action_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_property_action_new(name : Ptr[_root_.sn.gnome.glib.internal.gchar], `object` : _root_.sn.gnome.glib.internal.gpointer, property_name : Ptr[_root_.sn.gnome.glib.internal.gchar]): Ptr[GPropertyAction] = extern

@extern def g_proxy_address_enumerator_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_proxy_address_get_destination_hostname(proxy : Ptr[GProxyAddress]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def g_proxy_address_get_destination_port(proxy : Ptr[GProxyAddress]): _root_.sn.gnome.glib.internal.guint16 = extern

@extern def g_proxy_address_get_destination_protocol(proxy : Ptr[GProxyAddress]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def g_proxy_address_get_password(proxy : Ptr[GProxyAddress]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def g_proxy_address_get_protocol(proxy : Ptr[GProxyAddress]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def g_proxy_address_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_proxy_address_get_uri(proxy : Ptr[GProxyAddress]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def g_proxy_address_get_username(proxy : Ptr[GProxyAddress]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def g_proxy_address_new(inetaddr : Ptr[GInetAddress], port : _root_.sn.gnome.glib.internal.guint16, protocol : Ptr[_root_.sn.gnome.glib.internal.gchar], dest_hostname : Ptr[_root_.sn.gnome.glib.internal.gchar], dest_port : _root_.sn.gnome.glib.internal.guint16, username : Ptr[_root_.sn.gnome.glib.internal.gchar], password : Ptr[_root_.sn.gnome.glib.internal.gchar]): Ptr[GSocketAddress] = extern

@extern def g_proxy_connect(proxy : Ptr[GProxy], connection : Ptr[GIOStream], proxy_address : Ptr[GProxyAddress], cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GIOStream] = extern

@extern def g_proxy_connect_async(proxy : Ptr[GProxy], connection : Ptr[GIOStream], proxy_address : Ptr[GProxyAddress], cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_proxy_connect_finish(proxy : Ptr[GProxy], result : Ptr[GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GIOStream] = extern

@extern def g_proxy_get_default_for_protocol(protocol : Ptr[_root_.sn.gnome.glib.internal.gchar]): Ptr[GProxy] = extern

@extern def g_proxy_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_proxy_resolver_get_default(): Ptr[GProxyResolver] = extern

@extern def g_proxy_resolver_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_proxy_resolver_is_supported(resolver : Ptr[GProxyResolver]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_proxy_resolver_lookup(resolver : Ptr[GProxyResolver], uri : Ptr[_root_.sn.gnome.glib.internal.gchar], cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]] = extern

@extern def g_proxy_resolver_lookup_async(resolver : Ptr[GProxyResolver], uri : Ptr[_root_.sn.gnome.glib.internal.gchar], cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_proxy_resolver_lookup_finish(resolver : Ptr[GProxyResolver], result : Ptr[GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]] = extern

@extern def g_proxy_supports_hostname(proxy : Ptr[GProxy]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_remote_action_group_activate_action_full(remote : Ptr[GRemoteActionGroup], action_name : Ptr[_root_.sn.gnome.glib.internal.gchar], parameter : Ptr[_root_.sn.gnome.glib.internal.GVariant], platform_data : Ptr[_root_.sn.gnome.glib.internal.GVariant]): Unit = extern

@extern def g_remote_action_group_change_action_state_full(remote : Ptr[GRemoteActionGroup], action_name : Ptr[_root_.sn.gnome.glib.internal.gchar], value : Ptr[_root_.sn.gnome.glib.internal.GVariant], platform_data : Ptr[_root_.sn.gnome.glib.internal.GVariant]): Unit = extern

@extern def g_remote_action_group_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_resolver_error_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_resolver_error_quark(): _root_.sn.gnome.glib.internal.GQuark = extern

@extern def g_resolver_free_addresses(addresses : Ptr[_root_.sn.gnome.glib.internal.GList]): Unit = extern

@extern def g_resolver_free_targets(targets : Ptr[_root_.sn.gnome.glib.internal.GList]): Unit = extern

@extern def g_resolver_get_default(): Ptr[GResolver] = extern

@extern def g_resolver_get_timeout(resolver : Ptr[GResolver]): CUnsignedInt = extern

@extern def g_resolver_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_resolver_lookup_by_address(resolver : Ptr[GResolver], address : Ptr[GInetAddress], cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def g_resolver_lookup_by_address_async(resolver : Ptr[GResolver], address : Ptr[GInetAddress], cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_resolver_lookup_by_address_finish(resolver : Ptr[GResolver], result : Ptr[GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def g_resolver_lookup_by_name(resolver : Ptr[GResolver], hostname : Ptr[_root_.sn.gnome.glib.internal.gchar], cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[_root_.sn.gnome.glib.internal.GList] = extern

@extern def g_resolver_lookup_by_name_async(resolver : Ptr[GResolver], hostname : Ptr[_root_.sn.gnome.glib.internal.gchar], cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_resolver_lookup_by_name_finish(resolver : Ptr[GResolver], result : Ptr[GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[_root_.sn.gnome.glib.internal.GList] = extern

@extern def g_resolver_lookup_by_name_with_flags(resolver : Ptr[GResolver], hostname : Ptr[_root_.sn.gnome.glib.internal.gchar], flags : GResolverNameLookupFlags, cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[_root_.sn.gnome.glib.internal.GList] = extern

@extern def g_resolver_lookup_by_name_with_flags_async(resolver : Ptr[GResolver], hostname : Ptr[_root_.sn.gnome.glib.internal.gchar], flags : GResolverNameLookupFlags, cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_resolver_lookup_by_name_with_flags_finish(resolver : Ptr[GResolver], result : Ptr[GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[_root_.sn.gnome.glib.internal.GList] = extern

@extern def g_resolver_lookup_records(resolver : Ptr[GResolver], rrname : Ptr[_root_.sn.gnome.glib.internal.gchar], record_type : GResolverRecordType, cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[_root_.sn.gnome.glib.internal.GList] = extern

@extern def g_resolver_lookup_records_async(resolver : Ptr[GResolver], rrname : Ptr[_root_.sn.gnome.glib.internal.gchar], record_type : GResolverRecordType, cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_resolver_lookup_records_finish(resolver : Ptr[GResolver], result : Ptr[GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[_root_.sn.gnome.glib.internal.GList] = extern

@extern def g_resolver_lookup_service(resolver : Ptr[GResolver], service : Ptr[_root_.sn.gnome.glib.internal.gchar], protocol : Ptr[_root_.sn.gnome.glib.internal.gchar], domain : Ptr[_root_.sn.gnome.glib.internal.gchar], cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[_root_.sn.gnome.glib.internal.GList] = extern

@extern def g_resolver_lookup_service_async(resolver : Ptr[GResolver], service : Ptr[_root_.sn.gnome.glib.internal.gchar], protocol : Ptr[_root_.sn.gnome.glib.internal.gchar], domain : Ptr[_root_.sn.gnome.glib.internal.gchar], cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_resolver_lookup_service_finish(resolver : Ptr[GResolver], result : Ptr[GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[_root_.sn.gnome.glib.internal.GList] = extern

@extern def g_resolver_name_lookup_flags_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_resolver_record_type_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_resolver_set_default(resolver : Ptr[GResolver]): Unit = extern

@extern def g_resolver_set_timeout(resolver : Ptr[GResolver], timeout_ms : CUnsignedInt): Unit = extern

@extern def g_resource_enumerate_children(resource : Ptr[GResource], path : CString, lookup_flags : GResourceLookupFlags, error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[CString] = extern

@extern def g_resource_error_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_resource_error_quark(): _root_.sn.gnome.glib.internal.GQuark = extern

@extern def g_resource_flags_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_resource_get_info(resource : Ptr[GResource], path : CString, lookup_flags : GResourceLookupFlags, size : Ptr[_root_.sn.gnome.glib.internal.gsize], flags : Ptr[_root_.sn.gnome.glib.internal.guint32], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_resource_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_resource_load(filename : Ptr[_root_.sn.gnome.glib.internal.gchar], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GResource] = extern

@extern def g_resource_lookup_data(resource : Ptr[GResource], path : CString, lookup_flags : GResourceLookupFlags, error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[_root_.sn.gnome.glib.internal.GBytes] = extern

@extern def g_resource_lookup_flags_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_resource_new_from_data(data : Ptr[_root_.sn.gnome.glib.internal.GBytes], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GResource] = extern

@extern def g_resource_open_stream(resource : Ptr[GResource], path : CString, lookup_flags : GResourceLookupFlags, error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GInputStream] = extern

@extern def g_resource_ref(resource : Ptr[GResource]): Ptr[GResource] = extern

@extern def g_resource_unref(resource : Ptr[GResource]): Unit = extern

@extern def g_resources_enumerate_children(path : CString, lookup_flags : GResourceLookupFlags, error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[CString] = extern

@extern def g_resources_get_info(path : CString, lookup_flags : GResourceLookupFlags, size : Ptr[_root_.sn.gnome.glib.internal.gsize], flags : Ptr[_root_.sn.gnome.glib.internal.guint32], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_resources_lookup_data(path : CString, lookup_flags : GResourceLookupFlags, error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[_root_.sn.gnome.glib.internal.GBytes] = extern

@extern def g_resources_open_stream(path : CString, lookup_flags : GResourceLookupFlags, error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GInputStream] = extern

@extern def g_resources_register(resource : Ptr[GResource]): Unit = extern

@extern def g_resources_unregister(resource : Ptr[GResource]): Unit = extern

@extern def g_seekable_can_seek(seekable : Ptr[GSeekable]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_seekable_can_truncate(seekable : Ptr[GSeekable]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_seekable_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_seekable_seek(seekable : Ptr[GSeekable], offset : _root_.sn.gnome.glib.internal.goffset, `type` : _root_.sn.gnome.glib.internal.GSeekType, cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_seekable_tell(seekable : Ptr[GSeekable]): _root_.sn.gnome.glib.internal.goffset = extern

@extern def g_seekable_truncate(seekable : Ptr[GSeekable], offset : _root_.sn.gnome.glib.internal.goffset, cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_settings_apply(settings : Ptr[GSettings]): Unit = extern

@extern def g_settings_bind(settings : Ptr[GSettings], key : Ptr[_root_.sn.gnome.glib.internal.gchar], `object` : _root_.sn.gnome.glib.internal.gpointer, property : Ptr[_root_.sn.gnome.glib.internal.gchar], flags : GSettingsBindFlags): Unit = extern

@extern def g_settings_bind_flags_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_settings_bind_with_mapping(settings : Ptr[GSettings], key : Ptr[_root_.sn.gnome.glib.internal.gchar], `object` : _root_.sn.gnome.glib.internal.gpointer, property : Ptr[_root_.sn.gnome.glib.internal.gchar], flags : GSettingsBindFlags, get_mapping : GSettingsBindGetMapping, set_mapping : GSettingsBindSetMapping, user_data : _root_.sn.gnome.glib.internal.gpointer, destroy : _root_.sn.gnome.glib.internal.GDestroyNotify): Unit = extern

@extern def g_settings_bind_writable(settings : Ptr[GSettings], key : Ptr[_root_.sn.gnome.glib.internal.gchar], `object` : _root_.sn.gnome.glib.internal.gpointer, property : Ptr[_root_.sn.gnome.glib.internal.gchar], inverted : _root_.sn.gnome.glib.internal.gboolean): Unit = extern

@extern def g_settings_create_action(settings : Ptr[GSettings], key : Ptr[_root_.sn.gnome.glib.internal.gchar]): Ptr[GAction] = extern

@extern def g_settings_delay(settings : Ptr[GSettings]): Unit = extern

@extern def g_settings_get(settings : Ptr[GSettings], key : Ptr[_root_.sn.gnome.glib.internal.gchar], format : Ptr[_root_.sn.gnome.glib.internal.gchar], rest: Any*): Unit = extern

@extern def g_settings_get_boolean(settings : Ptr[GSettings], key : Ptr[_root_.sn.gnome.glib.internal.gchar]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_settings_get_child(settings : Ptr[GSettings], name : Ptr[_root_.sn.gnome.glib.internal.gchar]): Ptr[GSettings] = extern

@extern def g_settings_get_default_value(settings : Ptr[GSettings], key : Ptr[_root_.sn.gnome.glib.internal.gchar]): Ptr[_root_.sn.gnome.glib.internal.GVariant] = extern

@extern def g_settings_get_double(settings : Ptr[GSettings], key : Ptr[_root_.sn.gnome.glib.internal.gchar]): _root_.sn.gnome.glib.internal.gdouble = extern

@extern def g_settings_get_enum(settings : Ptr[GSettings], key : Ptr[_root_.sn.gnome.glib.internal.gchar]): _root_.sn.gnome.glib.internal.gint = extern

@extern def g_settings_get_flags(settings : Ptr[GSettings], key : Ptr[_root_.sn.gnome.glib.internal.gchar]): _root_.sn.gnome.glib.internal.guint = extern

@extern def g_settings_get_has_unapplied(settings : Ptr[GSettings]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_settings_get_int(settings : Ptr[GSettings], key : Ptr[_root_.sn.gnome.glib.internal.gchar]): _root_.sn.gnome.glib.internal.gint = extern

@extern def g_settings_get_int64(settings : Ptr[GSettings], key : Ptr[_root_.sn.gnome.glib.internal.gchar]): _root_.sn.gnome.glib.internal.gint64 = extern

@extern def g_settings_get_mapped(settings : Ptr[GSettings], key : Ptr[_root_.sn.gnome.glib.internal.gchar], mapping : GSettingsGetMapping, user_data : _root_.sn.gnome.glib.internal.gpointer): _root_.sn.gnome.glib.internal.gpointer = extern

@extern def g_settings_get_range(settings : Ptr[GSettings], key : Ptr[_root_.sn.gnome.glib.internal.gchar]): Ptr[_root_.sn.gnome.glib.internal.GVariant] = extern

@extern def g_settings_get_string(settings : Ptr[GSettings], key : Ptr[_root_.sn.gnome.glib.internal.gchar]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def g_settings_get_strv(settings : Ptr[GSettings], key : Ptr[_root_.sn.gnome.glib.internal.gchar]): Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]] = extern

@extern def g_settings_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_settings_get_uint(settings : Ptr[GSettings], key : Ptr[_root_.sn.gnome.glib.internal.gchar]): _root_.sn.gnome.glib.internal.guint = extern

@extern def g_settings_get_uint64(settings : Ptr[GSettings], key : Ptr[_root_.sn.gnome.glib.internal.gchar]): _root_.sn.gnome.glib.internal.guint64 = extern

@extern def g_settings_get_user_value(settings : Ptr[GSettings], key : Ptr[_root_.sn.gnome.glib.internal.gchar]): Ptr[_root_.sn.gnome.glib.internal.GVariant] = extern

@extern def g_settings_get_value(settings : Ptr[GSettings], key : Ptr[_root_.sn.gnome.glib.internal.gchar]): Ptr[_root_.sn.gnome.glib.internal.GVariant] = extern

@extern def g_settings_is_writable(settings : Ptr[GSettings], name : Ptr[_root_.sn.gnome.glib.internal.gchar]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_settings_list_children(settings : Ptr[GSettings]): Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]] = extern

@extern def g_settings_list_keys(settings : Ptr[GSettings]): Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]] = extern

@extern def g_settings_list_relocatable_schemas(): Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]] = extern

@extern def g_settings_list_schemas(): Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]] = extern

@extern def g_settings_new(schema_id : Ptr[_root_.sn.gnome.glib.internal.gchar]): Ptr[GSettings] = extern

@extern def g_settings_new_full(schema : Ptr[GSettingsSchema], backend : Ptr[GSettingsBackend], path : Ptr[_root_.sn.gnome.glib.internal.gchar]): Ptr[GSettings] = extern

@extern def g_settings_new_with_backend(schema_id : Ptr[_root_.sn.gnome.glib.internal.gchar], backend : Ptr[GSettingsBackend]): Ptr[GSettings] = extern

@extern def g_settings_new_with_backend_and_path(schema_id : Ptr[_root_.sn.gnome.glib.internal.gchar], backend : Ptr[GSettingsBackend], path : Ptr[_root_.sn.gnome.glib.internal.gchar]): Ptr[GSettings] = extern

@extern def g_settings_new_with_path(schema_id : Ptr[_root_.sn.gnome.glib.internal.gchar], path : Ptr[_root_.sn.gnome.glib.internal.gchar]): Ptr[GSettings] = extern

@extern def g_settings_range_check(settings : Ptr[GSettings], key : Ptr[_root_.sn.gnome.glib.internal.gchar], value : Ptr[_root_.sn.gnome.glib.internal.GVariant]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_settings_reset(settings : Ptr[GSettings], key : Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = extern

@extern def g_settings_revert(settings : Ptr[GSettings]): Unit = extern

@extern def g_settings_schema_get_id(schema : Ptr[GSettingsSchema]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def g_settings_schema_get_key(schema : Ptr[GSettingsSchema], name : Ptr[_root_.sn.gnome.glib.internal.gchar]): Ptr[GSettingsSchemaKey] = extern

@extern def g_settings_schema_get_path(schema : Ptr[GSettingsSchema]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def g_settings_schema_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_settings_schema_has_key(schema : Ptr[GSettingsSchema], name : Ptr[_root_.sn.gnome.glib.internal.gchar]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_settings_schema_key_get_default_value(key : Ptr[GSettingsSchemaKey]): Ptr[_root_.sn.gnome.glib.internal.GVariant] = extern

@extern def g_settings_schema_key_get_description(key : Ptr[GSettingsSchemaKey]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def g_settings_schema_key_get_name(key : Ptr[GSettingsSchemaKey]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def g_settings_schema_key_get_range(key : Ptr[GSettingsSchemaKey]): Ptr[_root_.sn.gnome.glib.internal.GVariant] = extern

@extern def g_settings_schema_key_get_summary(key : Ptr[GSettingsSchemaKey]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def g_settings_schema_key_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_settings_schema_key_get_value_type(key : Ptr[GSettingsSchemaKey]): Ptr[_root_.sn.gnome.glib.internal.GVariantType] = extern

@extern def g_settings_schema_key_range_check(key : Ptr[GSettingsSchemaKey], value : Ptr[_root_.sn.gnome.glib.internal.GVariant]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_settings_schema_key_ref(key : Ptr[GSettingsSchemaKey]): Ptr[GSettingsSchemaKey] = extern

@extern def g_settings_schema_key_unref(key : Ptr[GSettingsSchemaKey]): Unit = extern

@extern def g_settings_schema_list_children(schema : Ptr[GSettingsSchema]): Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]] = extern

@extern def g_settings_schema_list_keys(schema : Ptr[GSettingsSchema]): Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]] = extern

@extern def g_settings_schema_ref(schema : Ptr[GSettingsSchema]): Ptr[GSettingsSchema] = extern

@extern def g_settings_schema_source_get_default(): Ptr[GSettingsSchemaSource] = extern

@extern def g_settings_schema_source_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_settings_schema_source_list_schemas(source : Ptr[GSettingsSchemaSource], recursive : _root_.sn.gnome.glib.internal.gboolean, non_relocatable : Ptr[Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]], relocatable : Ptr[Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]]): Unit = extern

@extern def g_settings_schema_source_lookup(source : Ptr[GSettingsSchemaSource], schema_id : Ptr[_root_.sn.gnome.glib.internal.gchar], recursive : _root_.sn.gnome.glib.internal.gboolean): Ptr[GSettingsSchema] = extern

@extern def g_settings_schema_source_new_from_directory(directory : Ptr[_root_.sn.gnome.glib.internal.gchar], parent : Ptr[GSettingsSchemaSource], trusted : _root_.sn.gnome.glib.internal.gboolean, error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GSettingsSchemaSource] = extern

@extern def g_settings_schema_source_ref(source : Ptr[GSettingsSchemaSource]): Ptr[GSettingsSchemaSource] = extern

@extern def g_settings_schema_source_unref(source : Ptr[GSettingsSchemaSource]): Unit = extern

@extern def g_settings_schema_unref(schema : Ptr[GSettingsSchema]): Unit = extern

@extern def g_settings_set(settings : Ptr[GSettings], key : Ptr[_root_.sn.gnome.glib.internal.gchar], format : Ptr[_root_.sn.gnome.glib.internal.gchar], rest: Any*): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_settings_set_boolean(settings : Ptr[GSettings], key : Ptr[_root_.sn.gnome.glib.internal.gchar], value : _root_.sn.gnome.glib.internal.gboolean): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_settings_set_double(settings : Ptr[GSettings], key : Ptr[_root_.sn.gnome.glib.internal.gchar], value : _root_.sn.gnome.glib.internal.gdouble): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_settings_set_enum(settings : Ptr[GSettings], key : Ptr[_root_.sn.gnome.glib.internal.gchar], value : _root_.sn.gnome.glib.internal.gint): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_settings_set_flags(settings : Ptr[GSettings], key : Ptr[_root_.sn.gnome.glib.internal.gchar], value : _root_.sn.gnome.glib.internal.guint): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_settings_set_int(settings : Ptr[GSettings], key : Ptr[_root_.sn.gnome.glib.internal.gchar], value : _root_.sn.gnome.glib.internal.gint): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_settings_set_int64(settings : Ptr[GSettings], key : Ptr[_root_.sn.gnome.glib.internal.gchar], value : _root_.sn.gnome.glib.internal.gint64): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_settings_set_string(settings : Ptr[GSettings], key : Ptr[_root_.sn.gnome.glib.internal.gchar], value : Ptr[_root_.sn.gnome.glib.internal.gchar]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_settings_set_strv(settings : Ptr[GSettings], key : Ptr[_root_.sn.gnome.glib.internal.gchar], value : Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_settings_set_uint(settings : Ptr[GSettings], key : Ptr[_root_.sn.gnome.glib.internal.gchar], value : _root_.sn.gnome.glib.internal.guint): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_settings_set_uint64(settings : Ptr[GSettings], key : Ptr[_root_.sn.gnome.glib.internal.gchar], value : _root_.sn.gnome.glib.internal.guint64): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_settings_set_value(settings : Ptr[GSettings], key : Ptr[_root_.sn.gnome.glib.internal.gchar], value : Ptr[_root_.sn.gnome.glib.internal.GVariant]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_settings_sync(): Unit = extern

@extern def g_settings_unbind(`object` : _root_.sn.gnome.glib.internal.gpointer, property : Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = extern

@extern def g_simple_action_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_simple_action_group_add_entries(simple : Ptr[GSimpleActionGroup], entries : Ptr[GActionEntry], n_entries : _root_.sn.gnome.glib.internal.gint, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_simple_action_group_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_simple_action_group_insert(simple : Ptr[GSimpleActionGroup], action : Ptr[GAction]): Unit = extern

@extern def g_simple_action_group_lookup(simple : Ptr[GSimpleActionGroup], action_name : Ptr[_root_.sn.gnome.glib.internal.gchar]): Ptr[GAction] = extern

@extern def g_simple_action_group_new(): Ptr[GSimpleActionGroup] = extern

@extern def g_simple_action_group_remove(simple : Ptr[GSimpleActionGroup], action_name : Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = extern

@extern def g_simple_action_new(name : Ptr[_root_.sn.gnome.glib.internal.gchar], parameter_type : Ptr[_root_.sn.gnome.glib.internal.GVariantType]): Ptr[GSimpleAction] = extern

@extern def g_simple_action_new_stateful(name : Ptr[_root_.sn.gnome.glib.internal.gchar], parameter_type : Ptr[_root_.sn.gnome.glib.internal.GVariantType], state : Ptr[_root_.sn.gnome.glib.internal.GVariant]): Ptr[GSimpleAction] = extern

@extern def g_simple_action_set_enabled(simple : Ptr[GSimpleAction], enabled : _root_.sn.gnome.glib.internal.gboolean): Unit = extern

@extern def g_simple_action_set_state(simple : Ptr[GSimpleAction], value : Ptr[_root_.sn.gnome.glib.internal.GVariant]): Unit = extern

@extern def g_simple_action_set_state_hint(simple : Ptr[GSimpleAction], state_hint : Ptr[_root_.sn.gnome.glib.internal.GVariant]): Unit = extern

@extern def g_simple_async_report_error_in_idle(`object` : Ptr[_root_.sn.gnome.gobject.internal.GObject], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer, domain : _root_.sn.gnome.glib.internal.GQuark, code : _root_.sn.gnome.glib.internal.gint, format : CString, rest: Any*): Unit = extern

@extern def g_simple_async_report_gerror_in_idle(`object` : Ptr[_root_.sn.gnome.gobject.internal.GObject], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer, error : Ptr[_root_.sn.gnome.glib.internal.GError]): Unit = extern

@extern def g_simple_async_report_take_gerror_in_idle(`object` : Ptr[_root_.sn.gnome.gobject.internal.GObject], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer, error : Ptr[_root_.sn.gnome.glib.internal.GError]): Unit = extern

@extern def g_simple_async_result_complete(simple : Ptr[GSimpleAsyncResult]): Unit = extern

@extern def g_simple_async_result_complete_in_idle(simple : Ptr[GSimpleAsyncResult]): Unit = extern

@extern def g_simple_async_result_get_op_res_gboolean(simple : Ptr[GSimpleAsyncResult]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_simple_async_result_get_op_res_gpointer(simple : Ptr[GSimpleAsyncResult]): _root_.sn.gnome.glib.internal.gpointer = extern

@extern def g_simple_async_result_get_op_res_gssize(simple : Ptr[GSimpleAsyncResult]): _root_.sn.gnome.glib.internal.gssize = extern

@extern def g_simple_async_result_get_source_tag(simple : Ptr[GSimpleAsyncResult]): _root_.sn.gnome.glib.internal.gpointer = extern

@extern def g_simple_async_result_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_simple_async_result_is_valid(result : Ptr[GAsyncResult], source : Ptr[_root_.sn.gnome.gobject.internal.GObject], source_tag : _root_.sn.gnome.glib.internal.gpointer): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_simple_async_result_new(source_object : Ptr[_root_.sn.gnome.gobject.internal.GObject], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer, source_tag : _root_.sn.gnome.glib.internal.gpointer): Ptr[GSimpleAsyncResult] = extern

@extern def g_simple_async_result_new_error(source_object : Ptr[_root_.sn.gnome.gobject.internal.GObject], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer, domain : _root_.sn.gnome.glib.internal.GQuark, code : _root_.sn.gnome.glib.internal.gint, format : CString, rest: Any*): Ptr[GSimpleAsyncResult] = extern

@extern def g_simple_async_result_new_from_error(source_object : Ptr[_root_.sn.gnome.gobject.internal.GObject], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer, error : Ptr[_root_.sn.gnome.glib.internal.GError]): Ptr[GSimpleAsyncResult] = extern

@extern def g_simple_async_result_new_take_error(source_object : Ptr[_root_.sn.gnome.gobject.internal.GObject], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer, error : Ptr[_root_.sn.gnome.glib.internal.GError]): Ptr[GSimpleAsyncResult] = extern

@extern def g_simple_async_result_propagate_error(simple : Ptr[GSimpleAsyncResult], dest : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_simple_async_result_run_in_thread(simple : Ptr[GSimpleAsyncResult], func : GSimpleAsyncThreadFunc, io_priority : CInt, cancellable : Ptr[GCancellable]): Unit = extern

@extern def g_simple_async_result_set_check_cancellable(simple : Ptr[GSimpleAsyncResult], check_cancellable : Ptr[GCancellable]): Unit = extern

@extern def g_simple_async_result_set_error(simple : Ptr[GSimpleAsyncResult], domain : _root_.sn.gnome.glib.internal.GQuark, code : _root_.sn.gnome.glib.internal.gint, format : CString, rest: Any*): Unit = extern

@extern def g_simple_async_result_set_error_va(simple : Ptr[GSimpleAsyncResult], domain : _root_.sn.gnome.glib.internal.GQuark, code : _root_.sn.gnome.glib.internal.gint, format : CString, args : va_list): Unit = extern

@extern def g_simple_async_result_set_from_error(simple : Ptr[GSimpleAsyncResult], error : Ptr[_root_.sn.gnome.glib.internal.GError]): Unit = extern

@extern def g_simple_async_result_set_handle_cancellation(simple : Ptr[GSimpleAsyncResult], handle_cancellation : _root_.sn.gnome.glib.internal.gboolean): Unit = extern

@extern def g_simple_async_result_set_op_res_gboolean(simple : Ptr[GSimpleAsyncResult], op_res : _root_.sn.gnome.glib.internal.gboolean): Unit = extern

@extern def g_simple_async_result_set_op_res_gpointer(simple : Ptr[GSimpleAsyncResult], op_res : _root_.sn.gnome.glib.internal.gpointer, destroy_op_res : _root_.sn.gnome.glib.internal.GDestroyNotify): Unit = extern

@extern def g_simple_async_result_set_op_res_gssize(simple : Ptr[GSimpleAsyncResult], op_res : _root_.sn.gnome.glib.internal.gssize): Unit = extern

@extern def g_simple_async_result_take_error(simple : Ptr[GSimpleAsyncResult], error : Ptr[_root_.sn.gnome.glib.internal.GError]): Unit = extern

@extern def g_simple_io_stream_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_simple_io_stream_new(input_stream : Ptr[GInputStream], output_stream : Ptr[GOutputStream]): Ptr[GIOStream] = extern

@extern def g_simple_permission_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_simple_permission_new(allowed : _root_.sn.gnome.glib.internal.gboolean): Ptr[GPermission] = extern

@extern def g_simple_proxy_resolver_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_simple_proxy_resolver_new(default_proxy : Ptr[_root_.sn.gnome.glib.internal.gchar], ignore_hosts : Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]): Ptr[GProxyResolver] = extern

@extern def g_simple_proxy_resolver_set_default_proxy(resolver : Ptr[GSimpleProxyResolver], default_proxy : Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = extern

@extern def g_simple_proxy_resolver_set_ignore_hosts(resolver : Ptr[GSimpleProxyResolver], ignore_hosts : Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]): Unit = extern

@extern def g_simple_proxy_resolver_set_uri_proxy(resolver : Ptr[GSimpleProxyResolver], uri_scheme : Ptr[_root_.sn.gnome.glib.internal.gchar], proxy : Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = extern

@extern def g_socket_accept(socket : Ptr[GSocket], cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GSocket] = extern

@extern def g_socket_address_enumerator_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_socket_address_enumerator_next(enumerator : Ptr[GSocketAddressEnumerator], cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GSocketAddress] = extern

@extern def g_socket_address_enumerator_next_async(enumerator : Ptr[GSocketAddressEnumerator], cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_socket_address_enumerator_next_finish(enumerator : Ptr[GSocketAddressEnumerator], result : Ptr[GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GSocketAddress] = extern

@extern def g_socket_address_get_family(address : Ptr[GSocketAddress]): GSocketFamily = extern

@extern def g_socket_address_get_native_size(address : Ptr[GSocketAddress]): _root_.sn.gnome.glib.internal.gssize = extern

@extern def g_socket_address_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_socket_address_new_from_native(native : _root_.sn.gnome.glib.internal.gpointer, len : _root_.sn.gnome.glib.internal.gsize): Ptr[GSocketAddress] = extern

@extern def g_socket_address_to_native(address : Ptr[GSocketAddress], dest : _root_.sn.gnome.glib.internal.gpointer, destlen : _root_.sn.gnome.glib.internal.gsize, error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_socket_bind(socket : Ptr[GSocket], address : Ptr[GSocketAddress], allow_reuse : _root_.sn.gnome.glib.internal.gboolean, error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_socket_check_connect_result(socket : Ptr[GSocket], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_socket_client_add_application_proxy(client : Ptr[GSocketClient], protocol : Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = extern

@extern def g_socket_client_connect(client : Ptr[GSocketClient], connectable : Ptr[GSocketConnectable], cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GSocketConnection] = extern

@extern def g_socket_client_connect_async(client : Ptr[GSocketClient], connectable : Ptr[GSocketConnectable], cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_socket_client_connect_finish(client : Ptr[GSocketClient], result : Ptr[GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GSocketConnection] = extern

@extern def g_socket_client_connect_to_host(client : Ptr[GSocketClient], host_and_port : Ptr[_root_.sn.gnome.glib.internal.gchar], default_port : _root_.sn.gnome.glib.internal.guint16, cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GSocketConnection] = extern

@extern def g_socket_client_connect_to_host_async(client : Ptr[GSocketClient], host_and_port : Ptr[_root_.sn.gnome.glib.internal.gchar], default_port : _root_.sn.gnome.glib.internal.guint16, cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_socket_client_connect_to_host_finish(client : Ptr[GSocketClient], result : Ptr[GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GSocketConnection] = extern

@extern def g_socket_client_connect_to_service(client : Ptr[GSocketClient], domain : Ptr[_root_.sn.gnome.glib.internal.gchar], service : Ptr[_root_.sn.gnome.glib.internal.gchar], cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GSocketConnection] = extern

@extern def g_socket_client_connect_to_service_async(client : Ptr[GSocketClient], domain : Ptr[_root_.sn.gnome.glib.internal.gchar], service : Ptr[_root_.sn.gnome.glib.internal.gchar], cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_socket_client_connect_to_service_finish(client : Ptr[GSocketClient], result : Ptr[GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GSocketConnection] = extern

@extern def g_socket_client_connect_to_uri(client : Ptr[GSocketClient], uri : Ptr[_root_.sn.gnome.glib.internal.gchar], default_port : _root_.sn.gnome.glib.internal.guint16, cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GSocketConnection] = extern

@extern def g_socket_client_connect_to_uri_async(client : Ptr[GSocketClient], uri : Ptr[_root_.sn.gnome.glib.internal.gchar], default_port : _root_.sn.gnome.glib.internal.guint16, cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_socket_client_connect_to_uri_finish(client : Ptr[GSocketClient], result : Ptr[GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GSocketConnection] = extern

@extern def g_socket_client_event_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_socket_client_get_enable_proxy(client : Ptr[GSocketClient]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_socket_client_get_family(client : Ptr[GSocketClient]): GSocketFamily = extern

@extern def g_socket_client_get_local_address(client : Ptr[GSocketClient]): Ptr[GSocketAddress] = extern

@extern def g_socket_client_get_protocol(client : Ptr[GSocketClient]): GSocketProtocol = extern

@extern def g_socket_client_get_proxy_resolver(client : Ptr[GSocketClient]): Ptr[GProxyResolver] = extern

@extern def g_socket_client_get_socket_type(client : Ptr[GSocketClient]): GSocketType = extern

@extern def g_socket_client_get_timeout(client : Ptr[GSocketClient]): _root_.sn.gnome.glib.internal.guint = extern

@extern def g_socket_client_get_tls(client : Ptr[GSocketClient]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_socket_client_get_tls_validation_flags(client : Ptr[GSocketClient]): GTlsCertificateFlags = extern

@extern def g_socket_client_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_socket_client_new(): Ptr[GSocketClient] = extern

@extern def g_socket_client_set_enable_proxy(client : Ptr[GSocketClient], enable : _root_.sn.gnome.glib.internal.gboolean): Unit = extern

@extern def g_socket_client_set_family(client : Ptr[GSocketClient], family : GSocketFamily): Unit = extern

@extern def g_socket_client_set_local_address(client : Ptr[GSocketClient], address : Ptr[GSocketAddress]): Unit = extern

@extern def g_socket_client_set_protocol(client : Ptr[GSocketClient], protocol : GSocketProtocol): Unit = extern

@extern def g_socket_client_set_proxy_resolver(client : Ptr[GSocketClient], proxy_resolver : Ptr[GProxyResolver]): Unit = extern

@extern def g_socket_client_set_socket_type(client : Ptr[GSocketClient], `type` : GSocketType): Unit = extern

@extern def g_socket_client_set_timeout(client : Ptr[GSocketClient], timeout : _root_.sn.gnome.glib.internal.guint): Unit = extern

@extern def g_socket_client_set_tls(client : Ptr[GSocketClient], tls : _root_.sn.gnome.glib.internal.gboolean): Unit = extern

@extern def g_socket_client_set_tls_validation_flags(client : Ptr[GSocketClient], flags : GTlsCertificateFlags): Unit = extern

@extern def g_socket_close(socket : Ptr[GSocket], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_socket_condition_check(socket : Ptr[GSocket], condition : _root_.sn.gnome.glib.internal.GIOCondition): _root_.sn.gnome.glib.internal.GIOCondition = extern

@extern def g_socket_condition_timed_wait(socket : Ptr[GSocket], condition : _root_.sn.gnome.glib.internal.GIOCondition, timeout_us : _root_.sn.gnome.glib.internal.gint64, cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_socket_condition_wait(socket : Ptr[GSocket], condition : _root_.sn.gnome.glib.internal.GIOCondition, cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_socket_connect(socket : Ptr[GSocket], address : Ptr[GSocketAddress], cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_socket_connectable_enumerate(connectable : Ptr[GSocketConnectable]): Ptr[GSocketAddressEnumerator] = extern

@extern def g_socket_connectable_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_socket_connectable_proxy_enumerate(connectable : Ptr[GSocketConnectable]): Ptr[GSocketAddressEnumerator] = extern

@extern def g_socket_connectable_to_string(connectable : Ptr[GSocketConnectable]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def g_socket_connection_connect(connection : Ptr[GSocketConnection], address : Ptr[GSocketAddress], cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_socket_connection_connect_async(connection : Ptr[GSocketConnection], address : Ptr[GSocketAddress], cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_socket_connection_connect_finish(connection : Ptr[GSocketConnection], result : Ptr[GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_socket_connection_factory_create_connection(socket : Ptr[GSocket]): Ptr[GSocketConnection] = extern

@extern def g_socket_connection_factory_lookup_type(family : GSocketFamily, `type` : GSocketType, protocol_id : _root_.sn.gnome.glib.internal.gint): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_socket_connection_factory_register_type(g_type : _root_.sn.gnome.gobject.internal.GType, family : GSocketFamily, `type` : GSocketType, protocol : _root_.sn.gnome.glib.internal.gint): Unit = extern

@extern def g_socket_connection_get_local_address(connection : Ptr[GSocketConnection], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GSocketAddress] = extern

@extern def g_socket_connection_get_remote_address(connection : Ptr[GSocketConnection], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GSocketAddress] = extern

@extern def g_socket_connection_get_socket(connection : Ptr[GSocketConnection]): Ptr[GSocket] = extern

@extern def g_socket_connection_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_socket_connection_is_connected(connection : Ptr[GSocketConnection]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_socket_control_message_deserialize(level : CInt, `type` : CInt, size : _root_.sn.gnome.glib.internal.gsize, data : _root_.sn.gnome.glib.internal.gpointer): Ptr[GSocketControlMessage] = extern

@extern def g_socket_control_message_get_level(message : Ptr[GSocketControlMessage]): CInt = extern

@extern def g_socket_control_message_get_msg_type(message : Ptr[GSocketControlMessage]): CInt = extern

@extern def g_socket_control_message_get_size(message : Ptr[GSocketControlMessage]): _root_.sn.gnome.glib.internal.gsize = extern

@extern def g_socket_control_message_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_socket_control_message_serialize(message : Ptr[GSocketControlMessage], data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_socket_create_source(socket : Ptr[GSocket], condition : _root_.sn.gnome.glib.internal.GIOCondition, cancellable : Ptr[GCancellable]): Ptr[_root_.sn.gnome.glib.internal.GSource] = extern

@extern def g_socket_family_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_socket_get_available_bytes(socket : Ptr[GSocket]): _root_.sn.gnome.glib.internal.gssize = extern

@extern def g_socket_get_blocking(socket : Ptr[GSocket]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_socket_get_broadcast(socket : Ptr[GSocket]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_socket_get_credentials(socket : Ptr[GSocket], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GCredentials] = extern

@extern def g_socket_get_family(socket : Ptr[GSocket]): GSocketFamily = extern

@extern def g_socket_get_fd(socket : Ptr[GSocket]): CInt = extern

@extern def g_socket_get_keepalive(socket : Ptr[GSocket]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_socket_get_listen_backlog(socket : Ptr[GSocket]): _root_.sn.gnome.glib.internal.gint = extern

@extern def g_socket_get_local_address(socket : Ptr[GSocket], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GSocketAddress] = extern

@extern def g_socket_get_multicast_loopback(socket : Ptr[GSocket]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_socket_get_multicast_ttl(socket : Ptr[GSocket]): _root_.sn.gnome.glib.internal.guint = extern

@extern def g_socket_get_option(socket : Ptr[GSocket], level : _root_.sn.gnome.glib.internal.gint, optname : _root_.sn.gnome.glib.internal.gint, value : Ptr[_root_.sn.gnome.glib.internal.gint], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_socket_get_protocol(socket : Ptr[GSocket]): GSocketProtocol = extern

@extern def g_socket_get_remote_address(socket : Ptr[GSocket], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GSocketAddress] = extern

@extern def g_socket_get_socket_type(socket : Ptr[GSocket]): GSocketType = extern

@extern def g_socket_get_timeout(socket : Ptr[GSocket]): _root_.sn.gnome.glib.internal.guint = extern

@extern def g_socket_get_ttl(socket : Ptr[GSocket]): _root_.sn.gnome.glib.internal.guint = extern

@extern def g_socket_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_socket_is_closed(socket : Ptr[GSocket]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_socket_is_connected(socket : Ptr[GSocket]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_socket_join_multicast_group(socket : Ptr[GSocket], group : Ptr[GInetAddress], source_specific : _root_.sn.gnome.glib.internal.gboolean, iface : Ptr[_root_.sn.gnome.glib.internal.gchar], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_socket_join_multicast_group_ssm(socket : Ptr[GSocket], group : Ptr[GInetAddress], source_specific : Ptr[GInetAddress], iface : Ptr[_root_.sn.gnome.glib.internal.gchar], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_socket_leave_multicast_group(socket : Ptr[GSocket], group : Ptr[GInetAddress], source_specific : _root_.sn.gnome.glib.internal.gboolean, iface : Ptr[_root_.sn.gnome.glib.internal.gchar], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_socket_leave_multicast_group_ssm(socket : Ptr[GSocket], group : Ptr[GInetAddress], source_specific : Ptr[GInetAddress], iface : Ptr[_root_.sn.gnome.glib.internal.gchar], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_socket_listen(socket : Ptr[GSocket], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_socket_listener_accept(listener : Ptr[GSocketListener], source_object : Ptr[Ptr[_root_.sn.gnome.gobject.internal.GObject]], cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GSocketConnection] = extern

@extern def g_socket_listener_accept_async(listener : Ptr[GSocketListener], cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_socket_listener_accept_finish(listener : Ptr[GSocketListener], result : Ptr[GAsyncResult], source_object : Ptr[Ptr[_root_.sn.gnome.gobject.internal.GObject]], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GSocketConnection] = extern

@extern def g_socket_listener_accept_socket(listener : Ptr[GSocketListener], source_object : Ptr[Ptr[_root_.sn.gnome.gobject.internal.GObject]], cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GSocket] = extern

@extern def g_socket_listener_accept_socket_async(listener : Ptr[GSocketListener], cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_socket_listener_accept_socket_finish(listener : Ptr[GSocketListener], result : Ptr[GAsyncResult], source_object : Ptr[Ptr[_root_.sn.gnome.gobject.internal.GObject]], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GSocket] = extern

@extern def g_socket_listener_add_address(listener : Ptr[GSocketListener], address : Ptr[GSocketAddress], `type` : GSocketType, protocol : GSocketProtocol, source_object : Ptr[_root_.sn.gnome.gobject.internal.GObject], effective_address : Ptr[Ptr[GSocketAddress]], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_socket_listener_add_any_inet_port(listener : Ptr[GSocketListener], source_object : Ptr[_root_.sn.gnome.gobject.internal.GObject], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.guint16 = extern

@extern def g_socket_listener_add_inet_port(listener : Ptr[GSocketListener], port : _root_.sn.gnome.glib.internal.guint16, source_object : Ptr[_root_.sn.gnome.gobject.internal.GObject], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_socket_listener_add_socket(listener : Ptr[GSocketListener], socket : Ptr[GSocket], source_object : Ptr[_root_.sn.gnome.gobject.internal.GObject], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_socket_listener_close(listener : Ptr[GSocketListener]): Unit = extern

@extern def g_socket_listener_event_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_socket_listener_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_socket_listener_new(): Ptr[GSocketListener] = extern

@extern def g_socket_listener_set_backlog(listener : Ptr[GSocketListener], listen_backlog : CInt): Unit = extern

@extern def g_socket_msg_flags_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_socket_new(family : GSocketFamily, `type` : GSocketType, protocol : GSocketProtocol, error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GSocket] = extern

@extern def g_socket_new_from_fd(fd : _root_.sn.gnome.glib.internal.gint, error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GSocket] = extern

@extern def g_socket_protocol_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_socket_receive(socket : Ptr[GSocket], buffer : Ptr[_root_.sn.gnome.glib.internal.gchar], size : _root_.sn.gnome.glib.internal.gsize, cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gssize = extern

@extern def g_socket_receive_bytes(socket : Ptr[GSocket], size : _root_.sn.gnome.glib.internal.gsize, timeout_us : _root_.sn.gnome.glib.internal.gint64, cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[_root_.sn.gnome.glib.internal.GBytes] = extern

@extern def g_socket_receive_bytes_from(socket : Ptr[GSocket], address : Ptr[Ptr[GSocketAddress]], size : _root_.sn.gnome.glib.internal.gsize, timeout_us : _root_.sn.gnome.glib.internal.gint64, cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[_root_.sn.gnome.glib.internal.GBytes] = extern

@extern def g_socket_receive_from(socket : Ptr[GSocket], address : Ptr[Ptr[GSocketAddress]], buffer : Ptr[_root_.sn.gnome.glib.internal.gchar], size : _root_.sn.gnome.glib.internal.gsize, cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gssize = extern

@extern def g_socket_receive_message(socket : Ptr[GSocket], address : Ptr[Ptr[GSocketAddress]], vectors : Ptr[GInputVector], num_vectors : _root_.sn.gnome.glib.internal.gint, messages : Ptr[Ptr[Ptr[GSocketControlMessage]]], num_messages : Ptr[_root_.sn.gnome.glib.internal.gint], flags : Ptr[_root_.sn.gnome.glib.internal.gint], cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gssize = extern

@extern def g_socket_receive_messages(socket : Ptr[GSocket], messages : Ptr[GInputMessage], num_messages : _root_.sn.gnome.glib.internal.guint, flags : _root_.sn.gnome.glib.internal.gint, cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gint = extern

@extern def g_socket_receive_with_blocking(socket : Ptr[GSocket], buffer : Ptr[_root_.sn.gnome.glib.internal.gchar], size : _root_.sn.gnome.glib.internal.gsize, blocking : _root_.sn.gnome.glib.internal.gboolean, cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gssize = extern

@extern def g_socket_send(socket : Ptr[GSocket], buffer : Ptr[_root_.sn.gnome.glib.internal.gchar], size : _root_.sn.gnome.glib.internal.gsize, cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gssize = extern

@extern def g_socket_send_message(socket : Ptr[GSocket], address : Ptr[GSocketAddress], vectors : Ptr[GOutputVector], num_vectors : _root_.sn.gnome.glib.internal.gint, messages : Ptr[Ptr[GSocketControlMessage]], num_messages : _root_.sn.gnome.glib.internal.gint, flags : _root_.sn.gnome.glib.internal.gint, cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gssize = extern

@extern def g_socket_send_message_with_timeout(socket : Ptr[GSocket], address : Ptr[GSocketAddress], vectors : Ptr[GOutputVector], num_vectors : _root_.sn.gnome.glib.internal.gint, messages : Ptr[Ptr[GSocketControlMessage]], num_messages : _root_.sn.gnome.glib.internal.gint, flags : _root_.sn.gnome.glib.internal.gint, timeout_us : _root_.sn.gnome.glib.internal.gint64, bytes_written : Ptr[_root_.sn.gnome.glib.internal.gsize], cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): GPollableReturn = extern

@extern def g_socket_send_messages(socket : Ptr[GSocket], messages : Ptr[GOutputMessage], num_messages : _root_.sn.gnome.glib.internal.guint, flags : _root_.sn.gnome.glib.internal.gint, cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gint = extern

@extern def g_socket_send_to(socket : Ptr[GSocket], address : Ptr[GSocketAddress], buffer : Ptr[_root_.sn.gnome.glib.internal.gchar], size : _root_.sn.gnome.glib.internal.gsize, cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gssize = extern

@extern def g_socket_send_with_blocking(socket : Ptr[GSocket], buffer : Ptr[_root_.sn.gnome.glib.internal.gchar], size : _root_.sn.gnome.glib.internal.gsize, blocking : _root_.sn.gnome.glib.internal.gboolean, cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gssize = extern

@extern def g_socket_service_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_socket_service_is_active(service : Ptr[GSocketService]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_socket_service_new(): Ptr[GSocketService] = extern

@extern def g_socket_service_start(service : Ptr[GSocketService]): Unit = extern

@extern def g_socket_service_stop(service : Ptr[GSocketService]): Unit = extern

@extern def g_socket_set_blocking(socket : Ptr[GSocket], blocking : _root_.sn.gnome.glib.internal.gboolean): Unit = extern

@extern def g_socket_set_broadcast(socket : Ptr[GSocket], broadcast : _root_.sn.gnome.glib.internal.gboolean): Unit = extern

@extern def g_socket_set_keepalive(socket : Ptr[GSocket], keepalive : _root_.sn.gnome.glib.internal.gboolean): Unit = extern

@extern def g_socket_set_listen_backlog(socket : Ptr[GSocket], backlog : _root_.sn.gnome.glib.internal.gint): Unit = extern

@extern def g_socket_set_multicast_loopback(socket : Ptr[GSocket], loopback : _root_.sn.gnome.glib.internal.gboolean): Unit = extern

@extern def g_socket_set_multicast_ttl(socket : Ptr[GSocket], ttl : _root_.sn.gnome.glib.internal.guint): Unit = extern

@extern def g_socket_set_option(socket : Ptr[GSocket], level : _root_.sn.gnome.glib.internal.gint, optname : _root_.sn.gnome.glib.internal.gint, value : _root_.sn.gnome.glib.internal.gint, error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_socket_set_timeout(socket : Ptr[GSocket], timeout : _root_.sn.gnome.glib.internal.guint): Unit = extern

@extern def g_socket_set_ttl(socket : Ptr[GSocket], ttl : _root_.sn.gnome.glib.internal.guint): Unit = extern

@extern def g_socket_shutdown(socket : Ptr[GSocket], shutdown_read : _root_.sn.gnome.glib.internal.gboolean, shutdown_write : _root_.sn.gnome.glib.internal.gboolean, error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_socket_speaks_ipv4(socket : Ptr[GSocket]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_socket_type_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_srv_target_copy(target : Ptr[GSrvTarget]): Ptr[GSrvTarget] = extern

@extern def g_srv_target_free(target : Ptr[GSrvTarget]): Unit = extern

@extern def g_srv_target_get_hostname(target : Ptr[GSrvTarget]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def g_srv_target_get_port(target : Ptr[GSrvTarget]): _root_.sn.gnome.glib.internal.guint16 = extern

@extern def g_srv_target_get_priority(target : Ptr[GSrvTarget]): _root_.sn.gnome.glib.internal.guint16 = extern

@extern def g_srv_target_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_srv_target_get_weight(target : Ptr[GSrvTarget]): _root_.sn.gnome.glib.internal.guint16 = extern

@extern def g_srv_target_list_sort(targets : Ptr[_root_.sn.gnome.glib.internal.GList]): Ptr[_root_.sn.gnome.glib.internal.GList] = extern

@extern def g_srv_target_new(hostname : Ptr[_root_.sn.gnome.glib.internal.gchar], port : _root_.sn.gnome.glib.internal.guint16, priority : _root_.sn.gnome.glib.internal.guint16, weight : _root_.sn.gnome.glib.internal.guint16): Ptr[GSrvTarget] = extern

@extern def g_static_resource_fini(static_resource : Ptr[GStaticResource]): Unit = extern

@extern def g_static_resource_get_resource(static_resource : Ptr[GStaticResource]): Ptr[GResource] = extern

@extern def g_static_resource_init(static_resource : Ptr[GStaticResource]): Unit = extern

@extern def g_subprocess_communicate(subprocess : Ptr[GSubprocess], stdin_buf : Ptr[_root_.sn.gnome.glib.internal.GBytes], cancellable : Ptr[GCancellable], stdout_buf : Ptr[Ptr[_root_.sn.gnome.glib.internal.GBytes]], stderr_buf : Ptr[Ptr[_root_.sn.gnome.glib.internal.GBytes]], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_subprocess_communicate_async(subprocess : Ptr[GSubprocess], stdin_buf : Ptr[_root_.sn.gnome.glib.internal.GBytes], cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_subprocess_communicate_finish(subprocess : Ptr[GSubprocess], result : Ptr[GAsyncResult], stdout_buf : Ptr[Ptr[_root_.sn.gnome.glib.internal.GBytes]], stderr_buf : Ptr[Ptr[_root_.sn.gnome.glib.internal.GBytes]], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_subprocess_communicate_utf8(subprocess : Ptr[GSubprocess], stdin_buf : CString, cancellable : Ptr[GCancellable], stdout_buf : Ptr[CString], stderr_buf : Ptr[CString], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_subprocess_communicate_utf8_async(subprocess : Ptr[GSubprocess], stdin_buf : CString, cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_subprocess_communicate_utf8_finish(subprocess : Ptr[GSubprocess], result : Ptr[GAsyncResult], stdout_buf : Ptr[CString], stderr_buf : Ptr[CString], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_subprocess_flags_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_subprocess_force_exit(subprocess : Ptr[GSubprocess]): Unit = extern

@extern def g_subprocess_get_exit_status(subprocess : Ptr[GSubprocess]): _root_.sn.gnome.glib.internal.gint = extern

@extern def g_subprocess_get_identifier(subprocess : Ptr[GSubprocess]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def g_subprocess_get_if_exited(subprocess : Ptr[GSubprocess]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_subprocess_get_if_signaled(subprocess : Ptr[GSubprocess]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_subprocess_get_status(subprocess : Ptr[GSubprocess]): _root_.sn.gnome.glib.internal.gint = extern

@extern def g_subprocess_get_stderr_pipe(subprocess : Ptr[GSubprocess]): Ptr[GInputStream] = extern

@extern def g_subprocess_get_stdin_pipe(subprocess : Ptr[GSubprocess]): Ptr[GOutputStream] = extern

@extern def g_subprocess_get_stdout_pipe(subprocess : Ptr[GSubprocess]): Ptr[GInputStream] = extern

@extern def g_subprocess_get_successful(subprocess : Ptr[GSubprocess]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_subprocess_get_term_sig(subprocess : Ptr[GSubprocess]): _root_.sn.gnome.glib.internal.gint = extern

@extern def g_subprocess_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_subprocess_launcher_close(self : Ptr[GSubprocessLauncher]): Unit = extern

@extern def g_subprocess_launcher_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_subprocess_launcher_getenv(self : Ptr[GSubprocessLauncher], variable : Ptr[_root_.sn.gnome.glib.internal.gchar]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def g_subprocess_launcher_new(flags : GSubprocessFlags): Ptr[GSubprocessLauncher] = extern

@extern def g_subprocess_launcher_set_child_setup(self : Ptr[GSubprocessLauncher], child_setup : _root_.sn.gnome.glib.internal.GSpawnChildSetupFunc, user_data : _root_.sn.gnome.glib.internal.gpointer, destroy_notify : _root_.sn.gnome.glib.internal.GDestroyNotify): Unit = extern

@extern def g_subprocess_launcher_set_cwd(self : Ptr[GSubprocessLauncher], cwd : Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = extern

@extern def g_subprocess_launcher_set_environ(self : Ptr[GSubprocessLauncher], env : Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]): Unit = extern

@extern def g_subprocess_launcher_set_flags(self : Ptr[GSubprocessLauncher], flags : GSubprocessFlags): Unit = extern

@extern def g_subprocess_launcher_set_stderr_file_path(self : Ptr[GSubprocessLauncher], path : Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = extern

@extern def g_subprocess_launcher_set_stdin_file_path(self : Ptr[GSubprocessLauncher], path : Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = extern

@extern def g_subprocess_launcher_set_stdout_file_path(self : Ptr[GSubprocessLauncher], path : Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = extern

@extern def g_subprocess_launcher_setenv(self : Ptr[GSubprocessLauncher], variable : Ptr[_root_.sn.gnome.glib.internal.gchar], value : Ptr[_root_.sn.gnome.glib.internal.gchar], overwrite : _root_.sn.gnome.glib.internal.gboolean): Unit = extern

@extern def g_subprocess_launcher_spawn(self : Ptr[GSubprocessLauncher], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], argv0 : Ptr[_root_.sn.gnome.glib.internal.gchar], rest: Any*): Ptr[GSubprocess] = extern

@extern def g_subprocess_launcher_spawnv(self : Ptr[GSubprocessLauncher], argv : Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GSubprocess] = extern

@extern def g_subprocess_launcher_take_fd(self : Ptr[GSubprocessLauncher], source_fd : _root_.sn.gnome.glib.internal.gint, target_fd : _root_.sn.gnome.glib.internal.gint): Unit = extern

@extern def g_subprocess_launcher_take_stderr_fd(self : Ptr[GSubprocessLauncher], fd : _root_.sn.gnome.glib.internal.gint): Unit = extern

@extern def g_subprocess_launcher_take_stdin_fd(self : Ptr[GSubprocessLauncher], fd : _root_.sn.gnome.glib.internal.gint): Unit = extern

@extern def g_subprocess_launcher_take_stdout_fd(self : Ptr[GSubprocessLauncher], fd : _root_.sn.gnome.glib.internal.gint): Unit = extern

@extern def g_subprocess_launcher_unsetenv(self : Ptr[GSubprocessLauncher], variable : Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = extern

/**
 * ** Core API ***
*/
@extern def g_subprocess_new(flags : GSubprocessFlags, error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], argv0 : Ptr[_root_.sn.gnome.glib.internal.gchar], rest: Any*): Ptr[GSubprocess] = extern

@extern def g_subprocess_newv(argv : Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]], flags : GSubprocessFlags, error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GSubprocess] = extern

@extern def g_subprocess_send_signal(subprocess : Ptr[GSubprocess], signal_num : _root_.sn.gnome.glib.internal.gint): Unit = extern

@extern def g_subprocess_wait(subprocess : Ptr[GSubprocess], cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_subprocess_wait_async(subprocess : Ptr[GSubprocess], cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_subprocess_wait_check(subprocess : Ptr[GSubprocess], cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_subprocess_wait_check_async(subprocess : Ptr[GSubprocess], cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_subprocess_wait_check_finish(subprocess : Ptr[GSubprocess], result : Ptr[GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_subprocess_wait_finish(subprocess : Ptr[GSubprocess], result : Ptr[GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_task_attach_source(task : Ptr[GTask], source : Ptr[_root_.sn.gnome.glib.internal.GSource], callback : _root_.sn.gnome.glib.internal.GSourceFunc): Unit = extern

@extern def g_task_get_cancellable(task : Ptr[GTask]): Ptr[GCancellable] = extern

@extern def g_task_get_check_cancellable(task : Ptr[GTask]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_task_get_completed(task : Ptr[GTask]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_task_get_context(task : Ptr[GTask]): Ptr[_root_.sn.gnome.glib.internal.GMainContext] = extern

@extern def g_task_get_name(task : Ptr[GTask]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def g_task_get_priority(task : Ptr[GTask]): _root_.sn.gnome.glib.internal.gint = extern

@extern def g_task_get_return_on_cancel(task : Ptr[GTask]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_task_get_source_object(task : Ptr[GTask]): _root_.sn.gnome.glib.internal.gpointer = extern

@extern def g_task_get_source_tag(task : Ptr[GTask]): _root_.sn.gnome.glib.internal.gpointer = extern

@extern def g_task_get_task_data(task : Ptr[GTask]): _root_.sn.gnome.glib.internal.gpointer = extern

@extern def g_task_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_task_had_error(task : Ptr[GTask]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_task_is_valid(result : _root_.sn.gnome.glib.internal.gpointer, source_object : _root_.sn.gnome.glib.internal.gpointer): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_task_new(source_object : _root_.sn.gnome.glib.internal.gpointer, cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, callback_data : _root_.sn.gnome.glib.internal.gpointer): Ptr[GTask] = extern

@extern def g_task_print_alive_tasks(): Unit = extern

@extern def g_task_propagate_boolean(task : Ptr[GTask], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_task_propagate_int(task : Ptr[GTask], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gssize = extern

@extern def g_task_propagate_pointer(task : Ptr[GTask], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gpointer = extern

@extern def g_task_propagate_value(task : Ptr[GTask], value : Ptr[_root_.sn.gnome.gobject.internal.GValue], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_task_report_error(source_object : _root_.sn.gnome.glib.internal.gpointer, callback : GAsyncReadyCallback, callback_data : _root_.sn.gnome.glib.internal.gpointer, source_tag : _root_.sn.gnome.glib.internal.gpointer, error : Ptr[_root_.sn.gnome.glib.internal.GError]): Unit = extern

@extern def g_task_report_new_error(source_object : _root_.sn.gnome.glib.internal.gpointer, callback : GAsyncReadyCallback, callback_data : _root_.sn.gnome.glib.internal.gpointer, source_tag : _root_.sn.gnome.glib.internal.gpointer, domain : _root_.sn.gnome.glib.internal.GQuark, code : _root_.sn.gnome.glib.internal.gint, format : CString, rest: Any*): Unit = extern

@extern def g_task_return_boolean(task : Ptr[GTask], result : _root_.sn.gnome.glib.internal.gboolean): Unit = extern

@extern def g_task_return_error(task : Ptr[GTask], error : Ptr[_root_.sn.gnome.glib.internal.GError]): Unit = extern

@extern def g_task_return_error_if_cancelled(task : Ptr[GTask]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_task_return_int(task : Ptr[GTask], result : _root_.sn.gnome.glib.internal.gssize): Unit = extern

@extern def g_task_return_new_error(task : Ptr[GTask], domain : _root_.sn.gnome.glib.internal.GQuark, code : _root_.sn.gnome.glib.internal.gint, format : CString, rest: Any*): Unit = extern

@extern def g_task_return_new_error_literal(task : Ptr[GTask], domain : _root_.sn.gnome.glib.internal.GQuark, code : _root_.sn.gnome.glib.internal.gint, message : CString): Unit = extern

@extern def g_task_return_pointer(task : Ptr[GTask], result : _root_.sn.gnome.glib.internal.gpointer, result_destroy : _root_.sn.gnome.glib.internal.GDestroyNotify): Unit = extern

@extern def g_task_return_prefixed_error(task : Ptr[GTask], error : Ptr[_root_.sn.gnome.glib.internal.GError], format : CString, rest: Any*): Unit = extern

@extern def g_task_return_value(task : Ptr[GTask], result : Ptr[_root_.sn.gnome.gobject.internal.GValue]): Unit = extern

@extern def g_task_run_in_thread(task : Ptr[GTask], task_func : GTaskThreadFunc): Unit = extern

@extern def g_task_run_in_thread_sync(task : Ptr[GTask], task_func : GTaskThreadFunc): Unit = extern

@extern def g_task_set_check_cancellable(task : Ptr[GTask], check_cancellable : _root_.sn.gnome.glib.internal.gboolean): Unit = extern

@extern def g_task_set_name(task : Ptr[GTask], name : Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = extern

@extern def g_task_set_priority(task : Ptr[GTask], priority : _root_.sn.gnome.glib.internal.gint): Unit = extern

@extern def g_task_set_return_on_cancel(task : Ptr[GTask], return_on_cancel : _root_.sn.gnome.glib.internal.gboolean): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_task_set_source_tag(task : Ptr[GTask], source_tag : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_task_set_static_name(task : Ptr[GTask], name : Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = extern

@extern def g_task_set_task_data(task : Ptr[GTask], task_data : _root_.sn.gnome.glib.internal.gpointer, task_data_destroy : _root_.sn.gnome.glib.internal.GDestroyNotify): Unit = extern

@extern def g_tcp_connection_get_graceful_disconnect(connection : Ptr[GTcpConnection]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_tcp_connection_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_tcp_connection_set_graceful_disconnect(connection : Ptr[GTcpConnection], graceful_disconnect : _root_.sn.gnome.glib.internal.gboolean): Unit = extern

@extern def g_tcp_wrapper_connection_get_base_io_stream(conn : Ptr[GTcpWrapperConnection]): Ptr[GIOStream] = extern

@extern def g_tcp_wrapper_connection_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_tcp_wrapper_connection_new(base_io_stream : Ptr[GIOStream], socket : Ptr[GSocket]): Ptr[GSocketConnection] = extern

@extern def g_test_dbus_add_service_dir(self : Ptr[GTestDBus], path : Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = extern

@extern def g_test_dbus_down(self : Ptr[GTestDBus]): Unit = extern

@extern def g_test_dbus_flags_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_test_dbus_get_bus_address(self : Ptr[GTestDBus]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def g_test_dbus_get_flags(self : Ptr[GTestDBus]): GTestDBusFlags = extern

@extern def g_test_dbus_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_test_dbus_new(flags : GTestDBusFlags): Ptr[GTestDBus] = extern

@extern def g_test_dbus_stop(self : Ptr[GTestDBus]): Unit = extern

@extern def g_test_dbus_unset(): Unit = extern

@extern def g_test_dbus_up(self : Ptr[GTestDBus]): Unit = extern

@extern def g_themed_icon_append_name(icon : Ptr[GThemedIcon], iconname : CString): Unit = extern

@extern def g_themed_icon_get_names(icon : Ptr[GThemedIcon]): Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]] = extern

@extern def g_themed_icon_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_themed_icon_new(iconname : CString): Ptr[GIcon] = extern

@extern def g_themed_icon_new_from_names(iconnames : Ptr[CString], len : CInt): Ptr[GIcon] = extern

@extern def g_themed_icon_new_with_default_fallbacks(iconname : CString): Ptr[GIcon] = extern

@extern def g_themed_icon_prepend_name(icon : Ptr[GThemedIcon], iconname : CString): Unit = extern

@extern def g_threaded_socket_service_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_threaded_socket_service_new(max_threads : CInt): Ptr[GSocketService] = extern

@extern def g_tls_authentication_mode_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_tls_backend_get_certificate_type(backend : Ptr[GTlsBackend]): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_tls_backend_get_client_connection_type(backend : Ptr[GTlsBackend]): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_tls_backend_get_default(): Ptr[GTlsBackend] = extern

@extern def g_tls_backend_get_default_database(backend : Ptr[GTlsBackend]): Ptr[GTlsDatabase] = extern

@extern def g_tls_backend_get_dtls_client_connection_type(backend : Ptr[GTlsBackend]): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_tls_backend_get_dtls_server_connection_type(backend : Ptr[GTlsBackend]): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_tls_backend_get_file_database_type(backend : Ptr[GTlsBackend]): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_tls_backend_get_server_connection_type(backend : Ptr[GTlsBackend]): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_tls_backend_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_tls_backend_set_default_database(backend : Ptr[GTlsBackend], database : Ptr[GTlsDatabase]): Unit = extern

@extern def g_tls_backend_supports_dtls(backend : Ptr[GTlsBackend]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_tls_backend_supports_tls(backend : Ptr[GTlsBackend]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_tls_certificate_flags_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_tls_certificate_get_dns_names(cert : Ptr[GTlsCertificate]): Ptr[_root_.sn.gnome.glib.internal.GPtrArray] = extern

@extern def g_tls_certificate_get_ip_addresses(cert : Ptr[GTlsCertificate]): Ptr[_root_.sn.gnome.glib.internal.GPtrArray] = extern

@extern def g_tls_certificate_get_issuer(cert : Ptr[GTlsCertificate]): Ptr[GTlsCertificate] = extern

@extern def g_tls_certificate_get_issuer_name(cert : Ptr[GTlsCertificate]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def g_tls_certificate_get_not_valid_after(cert : Ptr[GTlsCertificate]): Ptr[_root_.sn.gnome.glib.internal.GDateTime] = extern

@extern def g_tls_certificate_get_not_valid_before(cert : Ptr[GTlsCertificate]): Ptr[_root_.sn.gnome.glib.internal.GDateTime] = extern

@extern def g_tls_certificate_get_subject_name(cert : Ptr[GTlsCertificate]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def g_tls_certificate_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_tls_certificate_is_same(cert_one : Ptr[GTlsCertificate], cert_two : Ptr[GTlsCertificate]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_tls_certificate_list_new_from_file(file : Ptr[_root_.sn.gnome.glib.internal.gchar], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[_root_.sn.gnome.glib.internal.GList] = extern

@extern def g_tls_certificate_new_from_file(file : Ptr[_root_.sn.gnome.glib.internal.gchar], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GTlsCertificate] = extern

@extern def g_tls_certificate_new_from_file_with_password(file : Ptr[_root_.sn.gnome.glib.internal.gchar], password : Ptr[_root_.sn.gnome.glib.internal.gchar], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GTlsCertificate] = extern

@extern def g_tls_certificate_new_from_files(cert_file : Ptr[_root_.sn.gnome.glib.internal.gchar], key_file : Ptr[_root_.sn.gnome.glib.internal.gchar], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GTlsCertificate] = extern

@extern def g_tls_certificate_new_from_pem(data : Ptr[_root_.sn.gnome.glib.internal.gchar], length : _root_.sn.gnome.glib.internal.gssize, error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GTlsCertificate] = extern

@extern def g_tls_certificate_new_from_pkcs11_uris(pkcs11_uri : Ptr[_root_.sn.gnome.glib.internal.gchar], private_key_pkcs11_uri : Ptr[_root_.sn.gnome.glib.internal.gchar], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GTlsCertificate] = extern

@extern def g_tls_certificate_new_from_pkcs12(data : Ptr[_root_.sn.gnome.glib.internal.guint8], length : _root_.sn.gnome.glib.internal.gsize, password : Ptr[_root_.sn.gnome.glib.internal.gchar], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GTlsCertificate] = extern

@extern def g_tls_certificate_request_flags_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_tls_certificate_verify(cert : Ptr[GTlsCertificate], identity : Ptr[GSocketConnectable], trusted_ca : Ptr[GTlsCertificate]): GTlsCertificateFlags = extern

@extern def g_tls_channel_binding_error_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_tls_channel_binding_error_quark(): _root_.sn.gnome.glib.internal.GQuark = extern

@extern def g_tls_channel_binding_type_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_tls_client_connection_copy_session_state(conn : Ptr[GTlsClientConnection], source : Ptr[GTlsClientConnection]): Unit = extern

@extern def g_tls_client_connection_get_accepted_cas(conn : Ptr[GTlsClientConnection]): Ptr[_root_.sn.gnome.glib.internal.GList] = extern

@extern def g_tls_client_connection_get_server_identity(conn : Ptr[GTlsClientConnection]): Ptr[GSocketConnectable] = extern

@extern def g_tls_client_connection_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_tls_client_connection_get_use_ssl3(conn : Ptr[GTlsClientConnection]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_tls_client_connection_get_validation_flags(conn : Ptr[GTlsClientConnection]): GTlsCertificateFlags = extern

@extern def g_tls_client_connection_new(base_io_stream : Ptr[GIOStream], server_identity : Ptr[GSocketConnectable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GIOStream] = extern

@extern def g_tls_client_connection_set_server_identity(conn : Ptr[GTlsClientConnection], identity : Ptr[GSocketConnectable]): Unit = extern

@extern def g_tls_client_connection_set_use_ssl3(conn : Ptr[GTlsClientConnection], use_ssl3 : _root_.sn.gnome.glib.internal.gboolean): Unit = extern

@extern def g_tls_client_connection_set_validation_flags(conn : Ptr[GTlsClientConnection], flags : GTlsCertificateFlags): Unit = extern

@extern def g_tls_connection_emit_accept_certificate(conn : Ptr[GTlsConnection], peer_cert : Ptr[GTlsCertificate], errors : GTlsCertificateFlags): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_tls_connection_get_certificate(conn : Ptr[GTlsConnection]): Ptr[GTlsCertificate] = extern

@extern def g_tls_connection_get_channel_binding_data(conn : Ptr[GTlsConnection], `type` : GTlsChannelBindingType, data : Ptr[_root_.sn.gnome.glib.internal.GByteArray], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_tls_connection_get_ciphersuite_name(conn : Ptr[GTlsConnection]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def g_tls_connection_get_database(conn : Ptr[GTlsConnection]): Ptr[GTlsDatabase] = extern

@extern def g_tls_connection_get_interaction(conn : Ptr[GTlsConnection]): Ptr[GTlsInteraction] = extern

@extern def g_tls_connection_get_negotiated_protocol(conn : Ptr[GTlsConnection]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def g_tls_connection_get_peer_certificate(conn : Ptr[GTlsConnection]): Ptr[GTlsCertificate] = extern

@extern def g_tls_connection_get_peer_certificate_errors(conn : Ptr[GTlsConnection]): GTlsCertificateFlags = extern

@extern def g_tls_connection_get_protocol_version(conn : Ptr[GTlsConnection]): GTlsProtocolVersion = extern

@extern def g_tls_connection_get_rehandshake_mode(conn : Ptr[GTlsConnection]): GTlsRehandshakeMode = extern

@extern def g_tls_connection_get_require_close_notify(conn : Ptr[GTlsConnection]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_tls_connection_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_tls_connection_get_use_system_certdb(conn : Ptr[GTlsConnection]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_tls_connection_handshake(conn : Ptr[GTlsConnection], cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_tls_connection_handshake_async(conn : Ptr[GTlsConnection], io_priority : CInt, cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_tls_connection_handshake_finish(conn : Ptr[GTlsConnection], result : Ptr[GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_tls_connection_set_advertised_protocols(conn : Ptr[GTlsConnection], protocols : Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]]): Unit = extern

@extern def g_tls_connection_set_certificate(conn : Ptr[GTlsConnection], certificate : Ptr[GTlsCertificate]): Unit = extern

@extern def g_tls_connection_set_database(conn : Ptr[GTlsConnection], database : Ptr[GTlsDatabase]): Unit = extern

@extern def g_tls_connection_set_interaction(conn : Ptr[GTlsConnection], interaction : Ptr[GTlsInteraction]): Unit = extern

@extern def g_tls_connection_set_rehandshake_mode(conn : Ptr[GTlsConnection], mode : GTlsRehandshakeMode): Unit = extern

@extern def g_tls_connection_set_require_close_notify(conn : Ptr[GTlsConnection], require_close_notify : _root_.sn.gnome.glib.internal.gboolean): Unit = extern

@extern def g_tls_connection_set_use_system_certdb(conn : Ptr[GTlsConnection], use_system_certdb : _root_.sn.gnome.glib.internal.gboolean): Unit = extern

@extern def g_tls_database_create_certificate_handle(self : Ptr[GTlsDatabase], certificate : Ptr[GTlsCertificate]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def g_tls_database_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_tls_database_lookup_certificate_for_handle(self : Ptr[GTlsDatabase], handle : Ptr[_root_.sn.gnome.glib.internal.gchar], interaction : Ptr[GTlsInteraction], flags : GTlsDatabaseLookupFlags, cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GTlsCertificate] = extern

@extern def g_tls_database_lookup_certificate_for_handle_async(self : Ptr[GTlsDatabase], handle : Ptr[_root_.sn.gnome.glib.internal.gchar], interaction : Ptr[GTlsInteraction], flags : GTlsDatabaseLookupFlags, cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_tls_database_lookup_certificate_for_handle_finish(self : Ptr[GTlsDatabase], result : Ptr[GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GTlsCertificate] = extern

@extern def g_tls_database_lookup_certificate_issuer(self : Ptr[GTlsDatabase], certificate : Ptr[GTlsCertificate], interaction : Ptr[GTlsInteraction], flags : GTlsDatabaseLookupFlags, cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GTlsCertificate] = extern

@extern def g_tls_database_lookup_certificate_issuer_async(self : Ptr[GTlsDatabase], certificate : Ptr[GTlsCertificate], interaction : Ptr[GTlsInteraction], flags : GTlsDatabaseLookupFlags, cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_tls_database_lookup_certificate_issuer_finish(self : Ptr[GTlsDatabase], result : Ptr[GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GTlsCertificate] = extern

@extern def g_tls_database_lookup_certificates_issued_by(self : Ptr[GTlsDatabase], issuer_raw_dn : Ptr[_root_.sn.gnome.glib.internal.GByteArray], interaction : Ptr[GTlsInteraction], flags : GTlsDatabaseLookupFlags, cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[_root_.sn.gnome.glib.internal.GList] = extern

@extern def g_tls_database_lookup_certificates_issued_by_async(self : Ptr[GTlsDatabase], issuer_raw_dn : Ptr[_root_.sn.gnome.glib.internal.GByteArray], interaction : Ptr[GTlsInteraction], flags : GTlsDatabaseLookupFlags, cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_tls_database_lookup_certificates_issued_by_finish(self : Ptr[GTlsDatabase], result : Ptr[GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[_root_.sn.gnome.glib.internal.GList] = extern

@extern def g_tls_database_lookup_flags_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_tls_database_verify_chain(self : Ptr[GTlsDatabase], chain : Ptr[GTlsCertificate], purpose : Ptr[_root_.sn.gnome.glib.internal.gchar], identity : Ptr[GSocketConnectable], interaction : Ptr[GTlsInteraction], flags : GTlsDatabaseVerifyFlags, cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): GTlsCertificateFlags = extern

@extern def g_tls_database_verify_chain_async(self : Ptr[GTlsDatabase], chain : Ptr[GTlsCertificate], purpose : Ptr[_root_.sn.gnome.glib.internal.gchar], identity : Ptr[GSocketConnectable], interaction : Ptr[GTlsInteraction], flags : GTlsDatabaseVerifyFlags, cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_tls_database_verify_chain_finish(self : Ptr[GTlsDatabase], result : Ptr[GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): GTlsCertificateFlags = extern

@extern def g_tls_database_verify_flags_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_tls_error_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_tls_error_quark(): _root_.sn.gnome.glib.internal.GQuark = extern

@extern def g_tls_file_database_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_tls_file_database_new(anchors : Ptr[_root_.sn.gnome.glib.internal.gchar], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GTlsDatabase] = extern

@extern def g_tls_interaction_ask_password(interaction : Ptr[GTlsInteraction], password : Ptr[GTlsPassword], cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): GTlsInteractionResult = extern

@extern def g_tls_interaction_ask_password_async(interaction : Ptr[GTlsInteraction], password : Ptr[GTlsPassword], cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_tls_interaction_ask_password_finish(interaction : Ptr[GTlsInteraction], result : Ptr[GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): GTlsInteractionResult = extern

@extern def g_tls_interaction_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_tls_interaction_invoke_ask_password(interaction : Ptr[GTlsInteraction], password : Ptr[GTlsPassword], cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): GTlsInteractionResult = extern

@extern def g_tls_interaction_invoke_request_certificate(interaction : Ptr[GTlsInteraction], connection : Ptr[GTlsConnection], flags : GTlsCertificateRequestFlags, cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): GTlsInteractionResult = extern

@extern def g_tls_interaction_request_certificate(interaction : Ptr[GTlsInteraction], connection : Ptr[GTlsConnection], flags : GTlsCertificateRequestFlags, cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): GTlsInteractionResult = extern

@extern def g_tls_interaction_request_certificate_async(interaction : Ptr[GTlsInteraction], connection : Ptr[GTlsConnection], flags : GTlsCertificateRequestFlags, cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_tls_interaction_request_certificate_finish(interaction : Ptr[GTlsInteraction], result : Ptr[GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): GTlsInteractionResult = extern

@extern def g_tls_interaction_result_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_tls_password_flags_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_tls_password_get_description(password : Ptr[GTlsPassword]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def g_tls_password_get_flags(password : Ptr[GTlsPassword]): GTlsPasswordFlags = extern

@extern def g_tls_password_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_tls_password_get_value(password : Ptr[GTlsPassword], length : Ptr[_root_.sn.gnome.glib.internal.gsize]): Ptr[_root_.sn.gnome.glib.internal.guchar] = extern

@extern def g_tls_password_get_warning(password : Ptr[GTlsPassword]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def g_tls_password_new(flags : GTlsPasswordFlags, description : Ptr[_root_.sn.gnome.glib.internal.gchar]): Ptr[GTlsPassword] = extern

@extern def g_tls_password_set_description(password : Ptr[GTlsPassword], description : Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = extern

@extern def g_tls_password_set_flags(password : Ptr[GTlsPassword], flags : GTlsPasswordFlags): Unit = extern

@extern def g_tls_password_set_value(password : Ptr[GTlsPassword], value : Ptr[_root_.sn.gnome.glib.internal.guchar], length : _root_.sn.gnome.glib.internal.gssize): Unit = extern

@extern def g_tls_password_set_value_full(password : Ptr[GTlsPassword], value : Ptr[_root_.sn.gnome.glib.internal.guchar], length : _root_.sn.gnome.glib.internal.gssize, destroy : _root_.sn.gnome.glib.internal.GDestroyNotify): Unit = extern

@extern def g_tls_password_set_warning(password : Ptr[GTlsPassword], warning : Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = extern

@extern def g_tls_protocol_version_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_tls_rehandshake_mode_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_tls_server_connection_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_tls_server_connection_new(base_io_stream : Ptr[GIOStream], certificate : Ptr[GTlsCertificate], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GIOStream] = extern

@extern def g_unix_connection_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_unix_connection_receive_credentials(connection : Ptr[GUnixConnection], cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GCredentials] = extern

@extern def g_unix_connection_receive_credentials_async(connection : Ptr[GUnixConnection], cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_unix_connection_receive_credentials_finish(connection : Ptr[GUnixConnection], result : Ptr[GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): Ptr[GCredentials] = extern

@extern def g_unix_connection_receive_fd(connection : Ptr[GUnixConnection], cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gint = extern

@extern def g_unix_connection_send_credentials(connection : Ptr[GUnixConnection], cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_unix_connection_send_credentials_async(connection : Ptr[GUnixConnection], cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_unix_connection_send_credentials_finish(connection : Ptr[GUnixConnection], result : Ptr[GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_unix_connection_send_fd(connection : Ptr[GUnixConnection], fd : _root_.sn.gnome.glib.internal.gint, cancellable : Ptr[GCancellable], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_unix_credentials_message_get_credentials(message : Ptr[GUnixCredentialsMessage]): Ptr[GCredentials] = extern

@extern def g_unix_credentials_message_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_unix_credentials_message_is_supported(): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_unix_credentials_message_new(): Ptr[GSocketControlMessage] = extern

@extern def g_unix_credentials_message_new_with_credentials(credentials : Ptr[GCredentials]): Ptr[GSocketControlMessage] = extern

@extern def g_unix_fd_list_append(list : Ptr[GUnixFDList], fd : _root_.sn.gnome.glib.internal.gint, error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gint = extern

@extern def g_unix_fd_list_get(list : Ptr[GUnixFDList], `index_` : _root_.sn.gnome.glib.internal.gint, error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gint = extern

@extern def g_unix_fd_list_get_length(list : Ptr[GUnixFDList]): _root_.sn.gnome.glib.internal.gint = extern

@extern def g_unix_fd_list_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_unix_fd_list_new(): Ptr[GUnixFDList] = extern

@extern def g_unix_fd_list_new_from_array(fds : Ptr[_root_.sn.gnome.glib.internal.gint], n_fds : _root_.sn.gnome.glib.internal.gint): Ptr[GUnixFDList] = extern

@extern def g_unix_fd_list_peek_fds(list : Ptr[GUnixFDList], length : Ptr[_root_.sn.gnome.glib.internal.gint]): Ptr[_root_.sn.gnome.glib.internal.gint] = extern

@extern def g_unix_fd_list_steal_fds(list : Ptr[GUnixFDList], length : Ptr[_root_.sn.gnome.glib.internal.gint]): Ptr[_root_.sn.gnome.glib.internal.gint] = extern

@extern def g_unix_socket_address_abstract_names_supported(): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_unix_socket_address_get_address_type(address : Ptr[GUnixSocketAddress]): GUnixSocketAddressType = extern

@extern def g_unix_socket_address_get_is_abstract(address : Ptr[GUnixSocketAddress]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_unix_socket_address_get_path(address : Ptr[GUnixSocketAddress]): CString = extern

@extern def g_unix_socket_address_get_path_len(address : Ptr[GUnixSocketAddress]): _root_.sn.gnome.glib.internal.gsize = extern

@extern def g_unix_socket_address_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_unix_socket_address_new(path : Ptr[_root_.sn.gnome.glib.internal.gchar]): Ptr[GSocketAddress] = extern

@extern def g_unix_socket_address_new_abstract(path : Ptr[_root_.sn.gnome.glib.internal.gchar], path_len : _root_.sn.gnome.glib.internal.gint): Ptr[GSocketAddress] = extern

@extern def g_unix_socket_address_new_with_type(path : Ptr[_root_.sn.gnome.glib.internal.gchar], path_len : _root_.sn.gnome.glib.internal.gint, `type` : GUnixSocketAddressType): Ptr[GSocketAddress] = extern

@extern def g_unix_socket_address_type_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_vfs_get_default(): Ptr[GVfs] = extern

@extern def g_vfs_get_file_for_path(vfs : Ptr[GVfs], path : CString): Ptr[GFile] = extern

@extern def g_vfs_get_file_for_uri(vfs : Ptr[GVfs], uri : CString): Ptr[GFile] = extern

@extern def g_vfs_get_local(): Ptr[GVfs] = extern

@extern def g_vfs_get_supported_uri_schemes(vfs : Ptr[GVfs]): Ptr[Ptr[_root_.sn.gnome.glib.internal.gchar]] = extern

@extern def g_vfs_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_vfs_is_active(vfs : Ptr[GVfs]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_vfs_parse_name(vfs : Ptr[GVfs], parse_name : CString): Ptr[GFile] = extern

@extern def g_vfs_register_uri_scheme(vfs : Ptr[GVfs], scheme : CString, uri_func : GVfsFileLookupFunc, uri_data : _root_.sn.gnome.glib.internal.gpointer, uri_destroy : _root_.sn.gnome.glib.internal.GDestroyNotify, parse_name_func : GVfsFileLookupFunc, parse_name_data : _root_.sn.gnome.glib.internal.gpointer, parse_name_destroy : _root_.sn.gnome.glib.internal.GDestroyNotify): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_vfs_unregister_uri_scheme(vfs : Ptr[GVfs], scheme : CString): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_volume_can_eject(volume : Ptr[GVolume]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_volume_can_mount(volume : Ptr[GVolume]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_volume_eject(volume : Ptr[GVolume], flags : GMountUnmountFlags, cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_volume_eject_finish(volume : Ptr[GVolume], result : Ptr[GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_volume_eject_with_operation(volume : Ptr[GVolume], flags : GMountUnmountFlags, mount_operation : Ptr[GMountOperation], cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_volume_eject_with_operation_finish(volume : Ptr[GVolume], result : Ptr[GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_volume_enumerate_identifiers(volume : Ptr[GVolume]): Ptr[CString] = extern

@extern def g_volume_get_activation_root(volume : Ptr[GVolume]): Ptr[GFile] = extern

@extern def g_volume_get_drive(volume : Ptr[GVolume]): Ptr[GDrive] = extern

@extern def g_volume_get_icon(volume : Ptr[GVolume]): Ptr[GIcon] = extern

@extern def g_volume_get_identifier(volume : Ptr[GVolume], kind : CString): CString = extern

@extern def g_volume_get_mount(volume : Ptr[GVolume]): Ptr[GMount] = extern

@extern def g_volume_get_name(volume : Ptr[GVolume]): CString = extern

@extern def g_volume_get_sort_key(volume : Ptr[GVolume]): Ptr[_root_.sn.gnome.glib.internal.gchar] = extern

@extern def g_volume_get_symbolic_icon(volume : Ptr[GVolume]): Ptr[GIcon] = extern

@extern def g_volume_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_volume_get_uuid(volume : Ptr[GVolume]): CString = extern

@extern def g_volume_monitor_adopt_orphan_mount(mount : Ptr[GMount]): Ptr[GVolume] = extern

@extern def g_volume_monitor_get(): Ptr[GVolumeMonitor] = extern

@extern def g_volume_monitor_get_connected_drives(volume_monitor : Ptr[GVolumeMonitor]): Ptr[_root_.sn.gnome.glib.internal.GList] = extern

@extern def g_volume_monitor_get_mount_for_uuid(volume_monitor : Ptr[GVolumeMonitor], uuid : CString): Ptr[GMount] = extern

@extern def g_volume_monitor_get_mounts(volume_monitor : Ptr[GVolumeMonitor]): Ptr[_root_.sn.gnome.glib.internal.GList] = extern

@extern def g_volume_monitor_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_volume_monitor_get_volume_for_uuid(volume_monitor : Ptr[GVolumeMonitor], uuid : CString): Ptr[GVolume] = extern

@extern def g_volume_monitor_get_volumes(volume_monitor : Ptr[GVolumeMonitor]): Ptr[_root_.sn.gnome.glib.internal.GList] = extern

@extern def g_volume_mount(volume : Ptr[GVolume], flags : GMountMountFlags, mount_operation : Ptr[GMountOperation], cancellable : Ptr[GCancellable], callback : GAsyncReadyCallback, user_data : _root_.sn.gnome.glib.internal.gpointer): Unit = extern

@extern def g_volume_mount_finish(volume : Ptr[GVolume], result : Ptr[GAsyncResult], error : Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_volume_should_automount(volume : Ptr[GVolume]): _root_.sn.gnome.glib.internal.gboolean = extern

@extern def g_zlib_compressor_format_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_zlib_compressor_get_file_info(compressor : Ptr[GZlibCompressor]): Ptr[GFileInfo] = extern

@extern def g_zlib_compressor_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_zlib_compressor_new(format : GZlibCompressorFormat, level : CInt): Ptr[GZlibCompressor] = extern

@extern def g_zlib_compressor_set_file_info(compressor : Ptr[GZlibCompressor], file_info : Ptr[GFileInfo]): Unit = extern

@extern def g_zlib_decompressor_get_file_info(decompressor : Ptr[GZlibDecompressor]): Ptr[GFileInfo] = extern

@extern def g_zlib_decompressor_get_type(): _root_.sn.gnome.gobject.internal.GType = extern

@extern def g_zlib_decompressor_new(format : GZlibCompressorFormat): Ptr[GZlibDecompressor] = extern

@extern def glib_autoptr_cleanup_GAction(_ptr : Ptr[Ptr[GAction]]): Unit = extern

@extern def glib_autoptr_cleanup_GActionMap(_ptr : Ptr[Ptr[GActionMap]]): Unit = extern

@extern def glib_autoptr_cleanup_GAppInfo(_ptr : Ptr[Ptr[GAppInfo]]): Unit = extern

@extern def glib_autoptr_cleanup_GAppInfoMonitor(_ptr : Ptr[Ptr[GAppInfoMonitor]]): Unit = extern

@extern def glib_autoptr_cleanup_GAppLaunchContext(_ptr : Ptr[Ptr[GAppLaunchContext]]): Unit = extern

@extern def glib_autoptr_cleanup_GApplication(_ptr : Ptr[Ptr[GApplication]]): Unit = extern

@extern def glib_autoptr_cleanup_GApplicationCommandLine(_ptr : Ptr[Ptr[GApplicationCommandLine]]): Unit = extern

@extern def glib_autoptr_cleanup_GAsyncInitable(_ptr : Ptr[Ptr[GAsyncInitable]]): Unit = extern

@extern def glib_autoptr_cleanup_GAsyncResult(_ptr : Ptr[Ptr[GAsyncResult]]): Unit = extern

@extern def glib_autoptr_cleanup_GBufferedInputStream(_ptr : Ptr[Ptr[GBufferedInputStream]]): Unit = extern

@extern def glib_autoptr_cleanup_GBufferedOutputStream(_ptr : Ptr[Ptr[GBufferedOutputStream]]): Unit = extern

@extern def glib_autoptr_cleanup_GBytesIcon(_ptr : Ptr[Ptr[GBytesIcon]]): Unit = extern

@extern def glib_autoptr_cleanup_GCancellable(_ptr : Ptr[Ptr[GCancellable]]): Unit = extern

@extern def glib_autoptr_cleanup_GCharsetConverter(_ptr : Ptr[Ptr[GCharsetConverter]]): Unit = extern

@extern def glib_autoptr_cleanup_GConverter(_ptr : Ptr[Ptr[GConverter]]): Unit = extern

@extern def glib_autoptr_cleanup_GConverterInputStream(_ptr : Ptr[Ptr[GConverterInputStream]]): Unit = extern

@extern def glib_autoptr_cleanup_GConverterOutputStream(_ptr : Ptr[Ptr[GConverterOutputStream]]): Unit = extern

@extern def glib_autoptr_cleanup_GCredentials(_ptr : Ptr[Ptr[GCredentials]]): Unit = extern

@extern def glib_autoptr_cleanup_GDBusActionGroup(_ptr : Ptr[Ptr[GDBusActionGroup]]): Unit = extern

@extern def glib_autoptr_cleanup_GDBusAuthObserver(_ptr : Ptr[Ptr[GDBusAuthObserver]]): Unit = extern

@extern def glib_autoptr_cleanup_GDBusConnection(_ptr : Ptr[Ptr[GDBusConnection]]): Unit = extern

@extern def glib_autoptr_cleanup_GDBusInterface(_ptr : Ptr[Ptr[GDBusInterface]]): Unit = extern

@extern def glib_autoptr_cleanup_GDBusInterfaceSkeleton(_ptr : Ptr[Ptr[GDBusInterfaceSkeleton]]): Unit = extern

@extern def glib_autoptr_cleanup_GDBusMenuModel(_ptr : Ptr[Ptr[GDBusMenuModel]]): Unit = extern

@extern def glib_autoptr_cleanup_GDBusMessage(_ptr : Ptr[Ptr[GDBusMessage]]): Unit = extern

@extern def glib_autoptr_cleanup_GDBusMethodInvocation(_ptr : Ptr[Ptr[GDBusMethodInvocation]]): Unit = extern

@extern def glib_autoptr_cleanup_GDBusNodeInfo(_ptr : Ptr[Ptr[GDBusNodeInfo]]): Unit = extern

@extern def glib_autoptr_cleanup_GDBusObject(_ptr : Ptr[Ptr[GDBusObject]]): Unit = extern

@extern def glib_autoptr_cleanup_GDBusObjectManager(_ptr : Ptr[Ptr[GDBusObjectManager]]): Unit = extern

@extern def glib_autoptr_cleanup_GDBusObjectManagerClient(_ptr : Ptr[Ptr[GDBusObjectManagerClient]]): Unit = extern

@extern def glib_autoptr_cleanup_GDBusObjectManagerServer(_ptr : Ptr[Ptr[GDBusObjectManagerServer]]): Unit = extern

@extern def glib_autoptr_cleanup_GDBusObjectProxy(_ptr : Ptr[Ptr[GDBusObjectProxy]]): Unit = extern

@extern def glib_autoptr_cleanup_GDBusObjectSkeleton(_ptr : Ptr[Ptr[GDBusObjectSkeleton]]): Unit = extern

@extern def glib_autoptr_cleanup_GDBusProxy(_ptr : Ptr[Ptr[GDBusProxy]]): Unit = extern

@extern def glib_autoptr_cleanup_GDBusServer(_ptr : Ptr[Ptr[GDBusServer]]): Unit = extern

@extern def glib_autoptr_cleanup_GDataInputStream(_ptr : Ptr[Ptr[GDataInputStream]]): Unit = extern

@extern def glib_autoptr_cleanup_GDataOutputStream(_ptr : Ptr[Ptr[GDataOutputStream]]): Unit = extern

@extern def glib_autoptr_cleanup_GDatagramBased(_ptr : Ptr[Ptr[GDatagramBased]]): Unit = extern

@extern def glib_autoptr_cleanup_GDebugController(_ptr : Ptr[Ptr[GDebugController]]): Unit = extern

@extern def glib_autoptr_cleanup_GDebugControllerDBus(_ptr : Ptr[Ptr[GDebugControllerDBus]]): Unit = extern

@extern def glib_autoptr_cleanup_GDebugControllerDBusClass(_ptr : Ptr[Ptr[GDebugControllerDBusClass]]): Unit = extern

@extern def glib_autoptr_cleanup_GDrive(_ptr : Ptr[Ptr[GDrive]]): Unit = extern

@extern def glib_autoptr_cleanup_GEmblem(_ptr : Ptr[Ptr[GEmblem]]): Unit = extern

@extern def glib_autoptr_cleanup_GEmblemedIcon(_ptr : Ptr[Ptr[GEmblemedIcon]]): Unit = extern

@extern def glib_autoptr_cleanup_GFile(_ptr : Ptr[Ptr[GFile]]): Unit = extern

@extern def glib_autoptr_cleanup_GFileAttributeInfoList(_ptr : Ptr[Ptr[GFileAttributeInfoList]]): Unit = extern

@extern def glib_autoptr_cleanup_GFileEnumerator(_ptr : Ptr[Ptr[GFileEnumerator]]): Unit = extern

@extern def glib_autoptr_cleanup_GFileIOStream(_ptr : Ptr[Ptr[GFileIOStream]]): Unit = extern

@extern def glib_autoptr_cleanup_GFileIcon(_ptr : Ptr[Ptr[GFileIcon]]): Unit = extern

@extern def glib_autoptr_cleanup_GFileInfo(_ptr : Ptr[Ptr[GFileInfo]]): Unit = extern

@extern def glib_autoptr_cleanup_GFileInputStream(_ptr : Ptr[Ptr[GFileInputStream]]): Unit = extern

@extern def glib_autoptr_cleanup_GFileMonitor(_ptr : Ptr[Ptr[GFileMonitor]]): Unit = extern

@extern def glib_autoptr_cleanup_GFileOutputStream(_ptr : Ptr[Ptr[GFileOutputStream]]): Unit = extern

@extern def glib_autoptr_cleanup_GFilenameCompleter(_ptr : Ptr[Ptr[GFilenameCompleter]]): Unit = extern

@extern def glib_autoptr_cleanup_GFilterInputStream(_ptr : Ptr[Ptr[GFilterInputStream]]): Unit = extern

@extern def glib_autoptr_cleanup_GFilterOutputStream(_ptr : Ptr[Ptr[GFilterOutputStream]]): Unit = extern

@extern def glib_autoptr_cleanup_GIOModule(_ptr : Ptr[Ptr[GIOModule]]): Unit = extern

@extern def glib_autoptr_cleanup_GIOStream(_ptr : Ptr[Ptr[GIOStream]]): Unit = extern

@extern def glib_autoptr_cleanup_GIcon(_ptr : Ptr[Ptr[GIcon]]): Unit = extern

@extern def glib_autoptr_cleanup_GInetAddress(_ptr : Ptr[Ptr[GInetAddress]]): Unit = extern

@extern def glib_autoptr_cleanup_GInetAddressMask(_ptr : Ptr[Ptr[GInetAddressMask]]): Unit = extern

@extern def glib_autoptr_cleanup_GInetSocketAddress(_ptr : Ptr[Ptr[GInetSocketAddress]]): Unit = extern

@extern def glib_autoptr_cleanup_GInitable(_ptr : Ptr[Ptr[GInitable]]): Unit = extern

@extern def glib_autoptr_cleanup_GInputStream(_ptr : Ptr[Ptr[GInputStream]]): Unit = extern

@extern def glib_autoptr_cleanup_GListModel(_ptr : Ptr[Ptr[GListModel]]): Unit = extern

@extern def glib_autoptr_cleanup_GListStore(_ptr : Ptr[Ptr[GListStore]]): Unit = extern

@extern def glib_autoptr_cleanup_GListStoreClass(_ptr : Ptr[Ptr[GListStoreClass]]): Unit = extern

@extern def glib_autoptr_cleanup_GLoadableIcon(_ptr : Ptr[Ptr[GLoadableIcon]]): Unit = extern

@extern def glib_autoptr_cleanup_GMemoryInputStream(_ptr : Ptr[Ptr[GMemoryInputStream]]): Unit = extern

@extern def glib_autoptr_cleanup_GMemoryMonitor(_ptr : Ptr[Ptr[GMemoryMonitor]]): Unit = extern

@extern def glib_autoptr_cleanup_GMemoryOutputStream(_ptr : Ptr[Ptr[GMemoryOutputStream]]): Unit = extern

@extern def glib_autoptr_cleanup_GMenu(_ptr : Ptr[Ptr[GMenu]]): Unit = extern

@extern def glib_autoptr_cleanup_GMenuAttributeIter(_ptr : Ptr[Ptr[GMenuAttributeIter]]): Unit = extern

@extern def glib_autoptr_cleanup_GMenuItem(_ptr : Ptr[Ptr[GMenuItem]]): Unit = extern

@extern def glib_autoptr_cleanup_GMenuLinkIter(_ptr : Ptr[Ptr[GMenuLinkIter]]): Unit = extern

@extern def glib_autoptr_cleanup_GMenuModel(_ptr : Ptr[Ptr[GMenuModel]]): Unit = extern

@extern def glib_autoptr_cleanup_GMount(_ptr : Ptr[Ptr[GMount]]): Unit = extern

@extern def glib_autoptr_cleanup_GMountOperation(_ptr : Ptr[Ptr[GMountOperation]]): Unit = extern

@extern def glib_autoptr_cleanup_GNativeVolumeMonitor(_ptr : Ptr[Ptr[GNativeVolumeMonitor]]): Unit = extern

@extern def glib_autoptr_cleanup_GNetworkAddress(_ptr : Ptr[Ptr[GNetworkAddress]]): Unit = extern

@extern def glib_autoptr_cleanup_GNetworkMonitor(_ptr : Ptr[Ptr[GNetworkMonitor]]): Unit = extern

@extern def glib_autoptr_cleanup_GNetworkService(_ptr : Ptr[Ptr[GNetworkService]]): Unit = extern

@extern def glib_autoptr_cleanup_GNotification(_ptr : Ptr[Ptr[GNotification]]): Unit = extern

@extern def glib_autoptr_cleanup_GOutputStream(_ptr : Ptr[Ptr[GOutputStream]]): Unit = extern

@extern def glib_autoptr_cleanup_GPermission(_ptr : Ptr[Ptr[GPermission]]): Unit = extern

@extern def glib_autoptr_cleanup_GPollableInputStream(_ptr : Ptr[Ptr[GPollableInputStream]]): Unit = extern

@extern def glib_autoptr_cleanup_GPollableOutputStream(_ptr : Ptr[Ptr[GPollableOutputStream]]): Unit = extern

@extern def glib_autoptr_cleanup_GPowerProfileMonitor(_ptr : Ptr[Ptr[GPowerProfileMonitor]]): Unit = extern

@extern def glib_autoptr_cleanup_GPropertyAction(_ptr : Ptr[Ptr[GPropertyAction]]): Unit = extern

@extern def glib_autoptr_cleanup_GProxy(_ptr : Ptr[Ptr[GProxy]]): Unit = extern

@extern def glib_autoptr_cleanup_GProxyAddress(_ptr : Ptr[Ptr[GProxyAddress]]): Unit = extern

@extern def glib_autoptr_cleanup_GProxyAddressEnumerator(_ptr : Ptr[Ptr[GProxyAddressEnumerator]]): Unit = extern

@extern def glib_autoptr_cleanup_GProxyResolver(_ptr : Ptr[Ptr[GProxyResolver]]): Unit = extern

@extern def glib_autoptr_cleanup_GRemoteActionGroup(_ptr : Ptr[Ptr[GRemoteActionGroup]]): Unit = extern

@extern def glib_autoptr_cleanup_GResolver(_ptr : Ptr[Ptr[GResolver]]): Unit = extern

@extern def glib_autoptr_cleanup_GResource(_ptr : Ptr[Ptr[GResource]]): Unit = extern

@extern def glib_autoptr_cleanup_GSeekable(_ptr : Ptr[Ptr[GSeekable]]): Unit = extern

@extern def glib_autoptr_cleanup_GSettings(_ptr : Ptr[Ptr[GSettings]]): Unit = extern

@extern def glib_autoptr_cleanup_GSettingsBackend(_ptr : Ptr[Ptr[GSettingsBackend]]): Unit = extern

@extern def glib_autoptr_cleanup_GSettingsSchema(_ptr : Ptr[Ptr[GSettingsSchema]]): Unit = extern

@extern def glib_autoptr_cleanup_GSettingsSchemaKey(_ptr : Ptr[Ptr[GSettingsSchemaKey]]): Unit = extern

@extern def glib_autoptr_cleanup_GSettingsSchemaSource(_ptr : Ptr[Ptr[GSettingsSchemaSource]]): Unit = extern

@extern def glib_autoptr_cleanup_GSimpleAction(_ptr : Ptr[Ptr[GSimpleAction]]): Unit = extern

@extern def glib_autoptr_cleanup_GSimpleActionGroup(_ptr : Ptr[Ptr[GSimpleActionGroup]]): Unit = extern

@extern def glib_autoptr_cleanup_GSimpleAsyncResult(_ptr : Ptr[Ptr[GSimpleAsyncResult]]): Unit = extern

@extern def glib_autoptr_cleanup_GSimplePermission(_ptr : Ptr[Ptr[GSimplePermission]]): Unit = extern

@extern def glib_autoptr_cleanup_GSimpleProxyResolver(_ptr : Ptr[Ptr[GSimpleProxyResolver]]): Unit = extern

@extern def glib_autoptr_cleanup_GSocket(_ptr : Ptr[Ptr[GSocket]]): Unit = extern

@extern def glib_autoptr_cleanup_GSocketAddress(_ptr : Ptr[Ptr[GSocketAddress]]): Unit = extern

@extern def glib_autoptr_cleanup_GSocketAddressEnumerator(_ptr : Ptr[Ptr[GSocketAddressEnumerator]]): Unit = extern

@extern def glib_autoptr_cleanup_GSocketClient(_ptr : Ptr[Ptr[GSocketClient]]): Unit = extern

@extern def glib_autoptr_cleanup_GSocketConnectable(_ptr : Ptr[Ptr[GSocketConnectable]]): Unit = extern

@extern def glib_autoptr_cleanup_GSocketConnection(_ptr : Ptr[Ptr[GSocketConnection]]): Unit = extern

@extern def glib_autoptr_cleanup_GSocketControlMessage(_ptr : Ptr[Ptr[GSocketControlMessage]]): Unit = extern

@extern def glib_autoptr_cleanup_GSocketListener(_ptr : Ptr[Ptr[GSocketListener]]): Unit = extern

@extern def glib_autoptr_cleanup_GSocketService(_ptr : Ptr[Ptr[GSocketService]]): Unit = extern

@extern def glib_autoptr_cleanup_GSubprocess(_ptr : Ptr[Ptr[GSubprocess]]): Unit = extern

@extern def glib_autoptr_cleanup_GSubprocessLauncher(_ptr : Ptr[Ptr[GSubprocessLauncher]]): Unit = extern

@extern def glib_autoptr_cleanup_GTask(_ptr : Ptr[Ptr[GTask]]): Unit = extern

@extern def glib_autoptr_cleanup_GTcpConnection(_ptr : Ptr[Ptr[GTcpConnection]]): Unit = extern

@extern def glib_autoptr_cleanup_GTcpWrapperConnection(_ptr : Ptr[Ptr[GTcpWrapperConnection]]): Unit = extern

@extern def glib_autoptr_cleanup_GTestDBus(_ptr : Ptr[Ptr[GTestDBus]]): Unit = extern

@extern def glib_autoptr_cleanup_GThemedIcon(_ptr : Ptr[Ptr[GThemedIcon]]): Unit = extern

@extern def glib_autoptr_cleanup_GThreadedSocketService(_ptr : Ptr[Ptr[GThreadedSocketService]]): Unit = extern

@extern def glib_autoptr_cleanup_GTlsBackend(_ptr : Ptr[Ptr[GTlsBackend]]): Unit = extern

@extern def glib_autoptr_cleanup_GTlsCertificate(_ptr : Ptr[Ptr[GTlsCertificate]]): Unit = extern

@extern def glib_autoptr_cleanup_GTlsClientConnection(_ptr : Ptr[Ptr[GTlsClientConnection]]): Unit = extern

@extern def glib_autoptr_cleanup_GTlsConnection(_ptr : Ptr[Ptr[GTlsConnection]]): Unit = extern

@extern def glib_autoptr_cleanup_GTlsDatabase(_ptr : Ptr[Ptr[GTlsDatabase]]): Unit = extern

@extern def glib_autoptr_cleanup_GTlsFileDatabase(_ptr : Ptr[Ptr[GTlsFileDatabase]]): Unit = extern

@extern def glib_autoptr_cleanup_GTlsInteraction(_ptr : Ptr[Ptr[GTlsInteraction]]): Unit = extern

@extern def glib_autoptr_cleanup_GTlsPassword(_ptr : Ptr[Ptr[GTlsPassword]]): Unit = extern

@extern def glib_autoptr_cleanup_GTlsServerConnection(_ptr : Ptr[Ptr[GTlsServerConnection]]): Unit = extern

@extern def glib_autoptr_cleanup_GUnixConnection(_ptr : Ptr[Ptr[GUnixConnection]]): Unit = extern

@extern def glib_autoptr_cleanup_GUnixCredentialsMessage(_ptr : Ptr[Ptr[GUnixCredentialsMessage]]): Unit = extern

@extern def glib_autoptr_cleanup_GUnixFDList(_ptr : Ptr[Ptr[GUnixFDList]]): Unit = extern

@extern def glib_autoptr_cleanup_GUnixSocketAddress(_ptr : Ptr[Ptr[GUnixSocketAddress]]): Unit = extern

@extern def glib_autoptr_cleanup_GVfs(_ptr : Ptr[Ptr[GVfs]]): Unit = extern

@extern def glib_autoptr_cleanup_GVolume(_ptr : Ptr[Ptr[GVolume]]): Unit = extern

@extern def glib_autoptr_cleanup_GVolumeMonitor(_ptr : Ptr[Ptr[GVolumeMonitor]]): Unit = extern

@extern def glib_autoptr_cleanup_GZlibCompressor(_ptr : Ptr[Ptr[GZlibCompressor]]): Unit = extern

@extern def glib_autoptr_cleanup_GZlibDecompressor(_ptr : Ptr[Ptr[GZlibDecompressor]]): Unit = extern

@extern def glib_autoptr_clear_GAction(_ptr : Ptr[GAction]): Unit = extern

@extern def glib_autoptr_clear_GActionMap(_ptr : Ptr[GActionMap]): Unit = extern

@extern def glib_autoptr_clear_GAppInfo(_ptr : Ptr[GAppInfo]): Unit = extern

@extern def glib_autoptr_clear_GAppInfoMonitor(_ptr : Ptr[GAppInfoMonitor]): Unit = extern

@extern def glib_autoptr_clear_GAppLaunchContext(_ptr : Ptr[GAppLaunchContext]): Unit = extern

@extern def glib_autoptr_clear_GApplication(_ptr : Ptr[GApplication]): Unit = extern

@extern def glib_autoptr_clear_GApplicationCommandLine(_ptr : Ptr[GApplicationCommandLine]): Unit = extern

@extern def glib_autoptr_clear_GAsyncInitable(_ptr : Ptr[GAsyncInitable]): Unit = extern

@extern def glib_autoptr_clear_GAsyncResult(_ptr : Ptr[GAsyncResult]): Unit = extern

@extern def glib_autoptr_clear_GBufferedInputStream(_ptr : Ptr[GBufferedInputStream]): Unit = extern

@extern def glib_autoptr_clear_GBufferedOutputStream(_ptr : Ptr[GBufferedOutputStream]): Unit = extern

@extern def glib_autoptr_clear_GBytesIcon(_ptr : Ptr[GBytesIcon]): Unit = extern

@extern def glib_autoptr_clear_GCancellable(_ptr : Ptr[GCancellable]): Unit = extern

@extern def glib_autoptr_clear_GCharsetConverter(_ptr : Ptr[GCharsetConverter]): Unit = extern

@extern def glib_autoptr_clear_GConverter(_ptr : Ptr[GConverter]): Unit = extern

@extern def glib_autoptr_clear_GConverterInputStream(_ptr : Ptr[GConverterInputStream]): Unit = extern

@extern def glib_autoptr_clear_GConverterOutputStream(_ptr : Ptr[GConverterOutputStream]): Unit = extern

@extern def glib_autoptr_clear_GCredentials(_ptr : Ptr[GCredentials]): Unit = extern

@extern def glib_autoptr_clear_GDBusActionGroup(_ptr : Ptr[GDBusActionGroup]): Unit = extern

@extern def glib_autoptr_clear_GDBusAuthObserver(_ptr : Ptr[GDBusAuthObserver]): Unit = extern

@extern def glib_autoptr_clear_GDBusConnection(_ptr : Ptr[GDBusConnection]): Unit = extern

@extern def glib_autoptr_clear_GDBusInterface(_ptr : Ptr[GDBusInterface]): Unit = extern

@extern def glib_autoptr_clear_GDBusInterfaceSkeleton(_ptr : Ptr[GDBusInterfaceSkeleton]): Unit = extern

@extern def glib_autoptr_clear_GDBusMenuModel(_ptr : Ptr[GDBusMenuModel]): Unit = extern

@extern def glib_autoptr_clear_GDBusMessage(_ptr : Ptr[GDBusMessage]): Unit = extern

@extern def glib_autoptr_clear_GDBusMethodInvocation(_ptr : Ptr[GDBusMethodInvocation]): Unit = extern

@extern def glib_autoptr_clear_GDBusNodeInfo(_ptr : Ptr[GDBusNodeInfo]): Unit = extern

@extern def glib_autoptr_clear_GDBusObject(_ptr : Ptr[GDBusObject]): Unit = extern

@extern def glib_autoptr_clear_GDBusObjectManager(_ptr : Ptr[GDBusObjectManager]): Unit = extern

@extern def glib_autoptr_clear_GDBusObjectManagerClient(_ptr : Ptr[GDBusObjectManagerClient]): Unit = extern

@extern def glib_autoptr_clear_GDBusObjectManagerServer(_ptr : Ptr[GDBusObjectManagerServer]): Unit = extern

@extern def glib_autoptr_clear_GDBusObjectProxy(_ptr : Ptr[GDBusObjectProxy]): Unit = extern

@extern def glib_autoptr_clear_GDBusObjectSkeleton(_ptr : Ptr[GDBusObjectSkeleton]): Unit = extern

@extern def glib_autoptr_clear_GDBusProxy(_ptr : Ptr[GDBusProxy]): Unit = extern

@extern def glib_autoptr_clear_GDBusServer(_ptr : Ptr[GDBusServer]): Unit = extern

@extern def glib_autoptr_clear_GDataInputStream(_ptr : Ptr[GDataInputStream]): Unit = extern

@extern def glib_autoptr_clear_GDataOutputStream(_ptr : Ptr[GDataOutputStream]): Unit = extern

@extern def glib_autoptr_clear_GDatagramBased(_ptr : Ptr[GDatagramBased]): Unit = extern

@extern def glib_autoptr_clear_GDebugController(_ptr : Ptr[GDebugController]): Unit = extern

@extern def glib_autoptr_clear_GDebugControllerDBus(_ptr : Ptr[GDebugControllerDBus]): Unit = extern

@extern def glib_autoptr_clear_GDebugControllerDBusClass(_ptr : Ptr[GDebugControllerDBusClass]): Unit = extern

@extern def glib_autoptr_clear_GDrive(_ptr : Ptr[GDrive]): Unit = extern

@extern def glib_autoptr_clear_GEmblem(_ptr : Ptr[GEmblem]): Unit = extern

@extern def glib_autoptr_clear_GEmblemedIcon(_ptr : Ptr[GEmblemedIcon]): Unit = extern

@extern def glib_autoptr_clear_GFile(_ptr : Ptr[GFile]): Unit = extern

@extern def glib_autoptr_clear_GFileAttributeInfoList(_ptr : Ptr[GFileAttributeInfoList]): Unit = extern

@extern def glib_autoptr_clear_GFileEnumerator(_ptr : Ptr[GFileEnumerator]): Unit = extern

@extern def glib_autoptr_clear_GFileIOStream(_ptr : Ptr[GFileIOStream]): Unit = extern

@extern def glib_autoptr_clear_GFileIcon(_ptr : Ptr[GFileIcon]): Unit = extern

@extern def glib_autoptr_clear_GFileInfo(_ptr : Ptr[GFileInfo]): Unit = extern

@extern def glib_autoptr_clear_GFileInputStream(_ptr : Ptr[GFileInputStream]): Unit = extern

@extern def glib_autoptr_clear_GFileMonitor(_ptr : Ptr[GFileMonitor]): Unit = extern

@extern def glib_autoptr_clear_GFileOutputStream(_ptr : Ptr[GFileOutputStream]): Unit = extern

@extern def glib_autoptr_clear_GFilenameCompleter(_ptr : Ptr[GFilenameCompleter]): Unit = extern

@extern def glib_autoptr_clear_GFilterInputStream(_ptr : Ptr[GFilterInputStream]): Unit = extern

@extern def glib_autoptr_clear_GFilterOutputStream(_ptr : Ptr[GFilterOutputStream]): Unit = extern

@extern def glib_autoptr_clear_GIOModule(_ptr : Ptr[GIOModule]): Unit = extern

@extern def glib_autoptr_clear_GIOStream(_ptr : Ptr[GIOStream]): Unit = extern

@extern def glib_autoptr_clear_GIcon(_ptr : Ptr[GIcon]): Unit = extern

@extern def glib_autoptr_clear_GInetAddress(_ptr : Ptr[GInetAddress]): Unit = extern

@extern def glib_autoptr_clear_GInetAddressMask(_ptr : Ptr[GInetAddressMask]): Unit = extern

@extern def glib_autoptr_clear_GInetSocketAddress(_ptr : Ptr[GInetSocketAddress]): Unit = extern

@extern def glib_autoptr_clear_GInitable(_ptr : Ptr[GInitable]): Unit = extern

@extern def glib_autoptr_clear_GInputStream(_ptr : Ptr[GInputStream]): Unit = extern

@extern def glib_autoptr_clear_GListModel(_ptr : Ptr[GListModel]): Unit = extern

@extern def glib_autoptr_clear_GListStore(_ptr : Ptr[GListStore]): Unit = extern

@extern def glib_autoptr_clear_GListStoreClass(_ptr : Ptr[GListStoreClass]): Unit = extern

@extern def glib_autoptr_clear_GLoadableIcon(_ptr : Ptr[GLoadableIcon]): Unit = extern

@extern def glib_autoptr_clear_GMemoryInputStream(_ptr : Ptr[GMemoryInputStream]): Unit = extern

@extern def glib_autoptr_clear_GMemoryMonitor(_ptr : Ptr[GMemoryMonitor]): Unit = extern

@extern def glib_autoptr_clear_GMemoryOutputStream(_ptr : Ptr[GMemoryOutputStream]): Unit = extern

@extern def glib_autoptr_clear_GMenu(_ptr : Ptr[GMenu]): Unit = extern

@extern def glib_autoptr_clear_GMenuAttributeIter(_ptr : Ptr[GMenuAttributeIter]): Unit = extern

@extern def glib_autoptr_clear_GMenuItem(_ptr : Ptr[GMenuItem]): Unit = extern

@extern def glib_autoptr_clear_GMenuLinkIter(_ptr : Ptr[GMenuLinkIter]): Unit = extern

@extern def glib_autoptr_clear_GMenuModel(_ptr : Ptr[GMenuModel]): Unit = extern

@extern def glib_autoptr_clear_GMount(_ptr : Ptr[GMount]): Unit = extern

@extern def glib_autoptr_clear_GMountOperation(_ptr : Ptr[GMountOperation]): Unit = extern

@extern def glib_autoptr_clear_GNativeVolumeMonitor(_ptr : Ptr[GNativeVolumeMonitor]): Unit = extern

@extern def glib_autoptr_clear_GNetworkAddress(_ptr : Ptr[GNetworkAddress]): Unit = extern

@extern def glib_autoptr_clear_GNetworkMonitor(_ptr : Ptr[GNetworkMonitor]): Unit = extern

@extern def glib_autoptr_clear_GNetworkService(_ptr : Ptr[GNetworkService]): Unit = extern

@extern def glib_autoptr_clear_GNotification(_ptr : Ptr[GNotification]): Unit = extern

@extern def glib_autoptr_clear_GOutputStream(_ptr : Ptr[GOutputStream]): Unit = extern

@extern def glib_autoptr_clear_GPermission(_ptr : Ptr[GPermission]): Unit = extern

@extern def glib_autoptr_clear_GPollableInputStream(_ptr : Ptr[GPollableInputStream]): Unit = extern

@extern def glib_autoptr_clear_GPollableOutputStream(_ptr : Ptr[GPollableOutputStream]): Unit = extern

@extern def glib_autoptr_clear_GPowerProfileMonitor(_ptr : Ptr[GPowerProfileMonitor]): Unit = extern

@extern def glib_autoptr_clear_GPropertyAction(_ptr : Ptr[GPropertyAction]): Unit = extern

@extern def glib_autoptr_clear_GProxy(_ptr : Ptr[GProxy]): Unit = extern

@extern def glib_autoptr_clear_GProxyAddress(_ptr : Ptr[GProxyAddress]): Unit = extern

@extern def glib_autoptr_clear_GProxyAddressEnumerator(_ptr : Ptr[GProxyAddressEnumerator]): Unit = extern

@extern def glib_autoptr_clear_GProxyResolver(_ptr : Ptr[GProxyResolver]): Unit = extern

@extern def glib_autoptr_clear_GRemoteActionGroup(_ptr : Ptr[GRemoteActionGroup]): Unit = extern

@extern def glib_autoptr_clear_GResolver(_ptr : Ptr[GResolver]): Unit = extern

@extern def glib_autoptr_clear_GResource(_ptr : Ptr[GResource]): Unit = extern

@extern def glib_autoptr_clear_GSeekable(_ptr : Ptr[GSeekable]): Unit = extern

@extern def glib_autoptr_clear_GSettings(_ptr : Ptr[GSettings]): Unit = extern

@extern def glib_autoptr_clear_GSettingsBackend(_ptr : Ptr[GSettingsBackend]): Unit = extern

@extern def glib_autoptr_clear_GSettingsSchema(_ptr : Ptr[GSettingsSchema]): Unit = extern

@extern def glib_autoptr_clear_GSettingsSchemaKey(_ptr : Ptr[GSettingsSchemaKey]): Unit = extern

@extern def glib_autoptr_clear_GSettingsSchemaSource(_ptr : Ptr[GSettingsSchemaSource]): Unit = extern

@extern def glib_autoptr_clear_GSimpleAction(_ptr : Ptr[GSimpleAction]): Unit = extern

@extern def glib_autoptr_clear_GSimpleActionGroup(_ptr : Ptr[GSimpleActionGroup]): Unit = extern

@extern def glib_autoptr_clear_GSimpleAsyncResult(_ptr : Ptr[GSimpleAsyncResult]): Unit = extern

@extern def glib_autoptr_clear_GSimplePermission(_ptr : Ptr[GSimplePermission]): Unit = extern

@extern def glib_autoptr_clear_GSimpleProxyResolver(_ptr : Ptr[GSimpleProxyResolver]): Unit = extern

@extern def glib_autoptr_clear_GSocket(_ptr : Ptr[GSocket]): Unit = extern

@extern def glib_autoptr_clear_GSocketAddress(_ptr : Ptr[GSocketAddress]): Unit = extern

@extern def glib_autoptr_clear_GSocketAddressEnumerator(_ptr : Ptr[GSocketAddressEnumerator]): Unit = extern

@extern def glib_autoptr_clear_GSocketClient(_ptr : Ptr[GSocketClient]): Unit = extern

@extern def glib_autoptr_clear_GSocketConnectable(_ptr : Ptr[GSocketConnectable]): Unit = extern

@extern def glib_autoptr_clear_GSocketConnection(_ptr : Ptr[GSocketConnection]): Unit = extern

@extern def glib_autoptr_clear_GSocketControlMessage(_ptr : Ptr[GSocketControlMessage]): Unit = extern

@extern def glib_autoptr_clear_GSocketListener(_ptr : Ptr[GSocketListener]): Unit = extern

@extern def glib_autoptr_clear_GSocketService(_ptr : Ptr[GSocketService]): Unit = extern

@extern def glib_autoptr_clear_GSubprocess(_ptr : Ptr[GSubprocess]): Unit = extern

@extern def glib_autoptr_clear_GSubprocessLauncher(_ptr : Ptr[GSubprocessLauncher]): Unit = extern

@extern def glib_autoptr_clear_GTask(_ptr : Ptr[GTask]): Unit = extern

@extern def glib_autoptr_clear_GTcpConnection(_ptr : Ptr[GTcpConnection]): Unit = extern

@extern def glib_autoptr_clear_GTcpWrapperConnection(_ptr : Ptr[GTcpWrapperConnection]): Unit = extern

@extern def glib_autoptr_clear_GTestDBus(_ptr : Ptr[GTestDBus]): Unit = extern

@extern def glib_autoptr_clear_GThemedIcon(_ptr : Ptr[GThemedIcon]): Unit = extern

@extern def glib_autoptr_clear_GThreadedSocketService(_ptr : Ptr[GThreadedSocketService]): Unit = extern

@extern def glib_autoptr_clear_GTlsBackend(_ptr : Ptr[GTlsBackend]): Unit = extern

@extern def glib_autoptr_clear_GTlsCertificate(_ptr : Ptr[GTlsCertificate]): Unit = extern

@extern def glib_autoptr_clear_GTlsClientConnection(_ptr : Ptr[GTlsClientConnection]): Unit = extern

@extern def glib_autoptr_clear_GTlsConnection(_ptr : Ptr[GTlsConnection]): Unit = extern

@extern def glib_autoptr_clear_GTlsDatabase(_ptr : Ptr[GTlsDatabase]): Unit = extern

@extern def glib_autoptr_clear_GTlsFileDatabase(_ptr : Ptr[GTlsFileDatabase]): Unit = extern

@extern def glib_autoptr_clear_GTlsInteraction(_ptr : Ptr[GTlsInteraction]): Unit = extern

@extern def glib_autoptr_clear_GTlsPassword(_ptr : Ptr[GTlsPassword]): Unit = extern

@extern def glib_autoptr_clear_GTlsServerConnection(_ptr : Ptr[GTlsServerConnection]): Unit = extern

@extern def glib_autoptr_clear_GUnixConnection(_ptr : Ptr[GUnixConnection]): Unit = extern

@extern def glib_autoptr_clear_GUnixCredentialsMessage(_ptr : Ptr[GUnixCredentialsMessage]): Unit = extern

@extern def glib_autoptr_clear_GUnixFDList(_ptr : Ptr[GUnixFDList]): Unit = extern

@extern def glib_autoptr_clear_GUnixSocketAddress(_ptr : Ptr[GUnixSocketAddress]): Unit = extern

@extern def glib_autoptr_clear_GVfs(_ptr : Ptr[GVfs]): Unit = extern

@extern def glib_autoptr_clear_GVolume(_ptr : Ptr[GVolume]): Unit = extern

@extern def glib_autoptr_clear_GVolumeMonitor(_ptr : Ptr[GVolumeMonitor]): Unit = extern

@extern def glib_autoptr_clear_GZlibCompressor(_ptr : Ptr[GZlibCompressor]): Unit = extern

@extern def glib_autoptr_clear_GZlibDecompressor(_ptr : Ptr[GZlibDecompressor]): Unit = extern

@extern def glib_listautoptr_cleanup_GAction(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GActionMap(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GAppInfo(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GAppInfoMonitor(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GAppLaunchContext(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GApplication(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GApplicationCommandLine(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GAsyncInitable(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GAsyncResult(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GBufferedInputStream(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GBufferedOutputStream(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GBytesIcon(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GCancellable(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GCharsetConverter(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GConverter(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GConverterInputStream(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GConverterOutputStream(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GCredentials(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GDBusActionGroup(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GDBusAuthObserver(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GDBusConnection(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GDBusInterface(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GDBusInterfaceSkeleton(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GDBusMenuModel(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GDBusMessage(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GDBusMethodInvocation(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GDBusNodeInfo(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GDBusObject(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GDBusObjectManager(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GDBusObjectManagerClient(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GDBusObjectManagerServer(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GDBusObjectProxy(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GDBusObjectSkeleton(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GDBusProxy(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GDBusServer(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GDataInputStream(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GDataOutputStream(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GDatagramBased(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GDebugController(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GDebugControllerDBus(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GDebugControllerDBusClass(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GDrive(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GEmblem(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GEmblemedIcon(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GFile(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GFileAttributeInfoList(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GFileEnumerator(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GFileIOStream(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GFileIcon(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GFileInfo(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GFileInputStream(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GFileMonitor(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GFileOutputStream(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GFilenameCompleter(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GFilterInputStream(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GFilterOutputStream(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GIOModule(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GIOStream(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GIcon(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GInetAddress(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GInetAddressMask(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GInetSocketAddress(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GInitable(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GInputStream(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GListModel(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GListStore(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GListStoreClass(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GLoadableIcon(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GMemoryInputStream(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GMemoryMonitor(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GMemoryOutputStream(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GMenu(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GMenuAttributeIter(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GMenuItem(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GMenuLinkIter(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GMenuModel(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GMount(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GMountOperation(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GNativeVolumeMonitor(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GNetworkAddress(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GNetworkMonitor(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GNetworkService(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GNotification(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GOutputStream(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GPermission(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GPollableInputStream(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GPollableOutputStream(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GPowerProfileMonitor(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GPropertyAction(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GProxy(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GProxyAddress(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GProxyAddressEnumerator(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GProxyResolver(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GRemoteActionGroup(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GResolver(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GResource(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GSeekable(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GSettings(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GSettingsBackend(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GSettingsSchema(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GSettingsSchemaKey(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GSettingsSchemaSource(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GSimpleAction(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GSimpleActionGroup(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GSimpleAsyncResult(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GSimplePermission(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GSimpleProxyResolver(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GSocket(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GSocketAddress(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GSocketAddressEnumerator(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GSocketClient(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GSocketConnectable(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GSocketConnection(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GSocketControlMessage(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GSocketListener(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GSocketService(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GSubprocess(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GSubprocessLauncher(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GTask(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GTcpConnection(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GTcpWrapperConnection(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GTestDBus(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GThemedIcon(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GThreadedSocketService(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GTlsBackend(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GTlsCertificate(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GTlsClientConnection(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GTlsConnection(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GTlsDatabase(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GTlsFileDatabase(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GTlsInteraction(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GTlsPassword(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GTlsServerConnection(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GUnixConnection(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GUnixCredentialsMessage(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GUnixFDList(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GUnixSocketAddress(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GVfs(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GVolume(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GVolumeMonitor(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GZlibCompressor(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GZlibDecompressor(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GAction(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GActionMap(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GAppInfo(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GAppInfoMonitor(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GAppLaunchContext(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GApplication(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GApplicationCommandLine(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GAsyncInitable(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GAsyncResult(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GBufferedInputStream(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GBufferedOutputStream(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GBytesIcon(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GCancellable(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GCharsetConverter(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GConverter(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GConverterInputStream(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GConverterOutputStream(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GCredentials(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GDBusActionGroup(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GDBusAuthObserver(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GDBusConnection(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GDBusInterface(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GDBusInterfaceSkeleton(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GDBusMenuModel(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GDBusMessage(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GDBusMethodInvocation(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GDBusNodeInfo(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GDBusObject(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GDBusObjectManager(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GDBusObjectManagerClient(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GDBusObjectManagerServer(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GDBusObjectProxy(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GDBusObjectSkeleton(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GDBusProxy(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GDBusServer(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GDataInputStream(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GDataOutputStream(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GDatagramBased(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GDebugController(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GDebugControllerDBus(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GDebugControllerDBusClass(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GDrive(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GEmblem(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GEmblemedIcon(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GFile(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GFileAttributeInfoList(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GFileEnumerator(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GFileIOStream(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GFileIcon(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GFileInfo(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GFileInputStream(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GFileMonitor(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GFileOutputStream(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GFilenameCompleter(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GFilterInputStream(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GFilterOutputStream(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GIOModule(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GIOStream(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GIcon(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GInetAddress(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GInetAddressMask(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GInetSocketAddress(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GInitable(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GInputStream(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GListModel(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GListStore(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GListStoreClass(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GLoadableIcon(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GMemoryInputStream(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GMemoryMonitor(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GMemoryOutputStream(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GMenu(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GMenuAttributeIter(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GMenuItem(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GMenuLinkIter(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GMenuModel(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GMount(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GMountOperation(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GNativeVolumeMonitor(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GNetworkAddress(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GNetworkMonitor(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GNetworkService(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GNotification(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GOutputStream(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GPermission(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GPollableInputStream(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GPollableOutputStream(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GPowerProfileMonitor(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GPropertyAction(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GProxy(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GProxyAddress(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GProxyAddressEnumerator(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GProxyResolver(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GRemoteActionGroup(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GResolver(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GResource(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GSeekable(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GSettings(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GSettingsBackend(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GSettingsSchema(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GSettingsSchemaKey(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GSettingsSchemaSource(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GSimpleAction(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GSimpleActionGroup(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GSimpleAsyncResult(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GSimplePermission(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GSimpleProxyResolver(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GSocket(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GSocketAddress(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GSocketAddressEnumerator(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GSocketClient(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GSocketConnectable(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GSocketConnection(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GSocketControlMessage(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GSocketListener(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GSocketService(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GSubprocess(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GSubprocessLauncher(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GTask(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GTcpConnection(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GTcpWrapperConnection(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GTestDBus(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GThemedIcon(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GThreadedSocketService(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GTlsBackend(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GTlsCertificate(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GTlsClientConnection(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GTlsConnection(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GTlsDatabase(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GTlsFileDatabase(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GTlsInteraction(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GTlsPassword(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GTlsServerConnection(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GUnixConnection(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GUnixCredentialsMessage(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GUnixFDList(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GUnixSocketAddress(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GVfs(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GVolume(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GVolumeMonitor(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GZlibCompressor(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GZlibDecompressor(_q : Ptr[Ptr[_root_.sn.gnome.glib.internal.GQueue]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GAction(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GActionMap(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GAppInfo(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GAppInfoMonitor(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GAppLaunchContext(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GApplication(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GApplicationCommandLine(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GAsyncInitable(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GAsyncResult(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GBufferedInputStream(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GBufferedOutputStream(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GBytesIcon(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GCancellable(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GCharsetConverter(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GConverter(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GConverterInputStream(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GConverterOutputStream(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GCredentials(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GDBusActionGroup(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GDBusAuthObserver(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GDBusConnection(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GDBusInterface(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GDBusInterfaceSkeleton(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GDBusMenuModel(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GDBusMessage(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GDBusMethodInvocation(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GDBusNodeInfo(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GDBusObject(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GDBusObjectManager(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GDBusObjectManagerClient(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GDBusObjectManagerServer(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GDBusObjectProxy(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GDBusObjectSkeleton(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GDBusProxy(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GDBusServer(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GDataInputStream(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GDataOutputStream(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GDatagramBased(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GDebugController(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GDebugControllerDBus(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GDebugControllerDBusClass(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GDrive(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GEmblem(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GEmblemedIcon(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GFile(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GFileAttributeInfoList(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GFileEnumerator(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GFileIOStream(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GFileIcon(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GFileInfo(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GFileInputStream(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GFileMonitor(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GFileOutputStream(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GFilenameCompleter(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GFilterInputStream(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GFilterOutputStream(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GIOModule(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GIOStream(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GIcon(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GInetAddress(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GInetAddressMask(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GInetSocketAddress(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GInitable(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GInputStream(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GListModel(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GListStore(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GListStoreClass(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GLoadableIcon(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GMemoryInputStream(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GMemoryMonitor(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GMemoryOutputStream(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GMenu(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GMenuAttributeIter(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GMenuItem(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GMenuLinkIter(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GMenuModel(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GMount(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GMountOperation(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GNativeVolumeMonitor(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GNetworkAddress(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GNetworkMonitor(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GNetworkService(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GNotification(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GOutputStream(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GPermission(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GPollableInputStream(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GPollableOutputStream(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GPowerProfileMonitor(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GPropertyAction(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GProxy(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GProxyAddress(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GProxyAddressEnumerator(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GProxyResolver(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GRemoteActionGroup(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GResolver(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GResource(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GSeekable(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GSettings(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GSettingsBackend(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GSettingsSchema(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GSettingsSchemaKey(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GSettingsSchemaSource(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GSimpleAction(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GSimpleActionGroup(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GSimpleAsyncResult(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GSimplePermission(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GSimpleProxyResolver(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GSocket(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GSocketAddress(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GSocketAddressEnumerator(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GSocketClient(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GSocketConnectable(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GSocketConnection(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GSocketControlMessage(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GSocketListener(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GSocketService(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GSubprocess(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GSubprocessLauncher(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GTask(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GTcpConnection(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GTcpWrapperConnection(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GTestDBus(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GThemedIcon(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GThreadedSocketService(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GTlsBackend(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GTlsCertificate(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GTlsClientConnection(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GTlsConnection(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GTlsDatabase(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GTlsFileDatabase(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GTlsInteraction(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GTlsPassword(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GTlsServerConnection(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GUnixConnection(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GUnixCredentialsMessage(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GUnixFDList(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GUnixSocketAddress(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GVfs(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GVolume(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GVolumeMonitor(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GZlibCompressor(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GZlibDecompressor(_l : Ptr[Ptr[_root_.sn.gnome.glib.internal.GSList]]): Unit = extern