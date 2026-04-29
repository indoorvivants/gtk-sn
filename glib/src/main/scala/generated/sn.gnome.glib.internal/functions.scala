package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

@extern def _g_log_fallback_handler(log_domain : Ptr[gchar], log_level : GLogLevelFlags, message : Ptr[gchar], unused_data : gpointer): Unit = extern

@extern def g_aligned_alloc(n_blocks : gsize, n_block_bytes : gsize, alignment : gsize): gpointer = extern

@extern def g_aligned_alloc0(n_blocks : gsize, n_block_bytes : gsize, alignment : gsize): gpointer = extern

@extern def g_aligned_free(mem : gpointer): Unit = extern

@extern def g_aligned_free_sized(mem : gpointer, alignment : size_t, size : size_t): Unit = extern

@extern def g_allocator_free(allocator : Ptr[GAllocator]): Unit = extern

@extern def g_allocator_new(name : Ptr[gchar], n_preallocs : guint): Ptr[GAllocator] = extern

@extern def g_array_append_vals(array : Ptr[GArray], data : gconstpointer, len : guint): Ptr[GArray] = extern

@extern def g_array_binary_search(array : Ptr[GArray], target : gconstpointer, compare_func : GCompareFunc, out_match_index : Ptr[guint]): gboolean = extern

@extern def g_array_copy(array : Ptr[GArray]): Ptr[GArray] = extern

@extern def g_array_free(array : Ptr[GArray], free_segment : gboolean): Ptr[gchar] = extern

@extern def g_array_get_element_size(array : Ptr[GArray]): guint = extern

@extern def g_array_insert_vals(array : Ptr[GArray], `index_` : guint, data : gconstpointer, len : guint): Ptr[GArray] = extern

@extern def g_array_new(zero_terminated : gboolean, `clear_` : gboolean, element_size : guint): Ptr[GArray] = extern

@extern def g_array_new_take(data : gpointer, len : gsize, clear : gboolean, element_size : gsize): Ptr[GArray] = extern

@extern def g_array_new_take_zero_terminated(data : gpointer, clear : gboolean, element_size : gsize): Ptr[GArray] = extern

@extern def g_array_prepend_vals(array : Ptr[GArray], data : gconstpointer, len : guint): Ptr[GArray] = extern

@extern def g_array_ref(array : Ptr[GArray]): Ptr[GArray] = extern

@extern def g_array_remove_index(array : Ptr[GArray], `index_` : guint): Ptr[GArray] = extern

@extern def g_array_remove_index_fast(array : Ptr[GArray], `index_` : guint): Ptr[GArray] = extern

@extern def g_array_remove_range(array : Ptr[GArray], `index_` : guint, length : guint): Ptr[GArray] = extern

@extern def g_array_set_clear_func(array : Ptr[GArray], clear_func : GDestroyNotify): Unit = extern

@extern def g_array_set_size(array : Ptr[GArray], length : guint): Ptr[GArray] = extern

@extern def g_array_sized_new(zero_terminated : gboolean, `clear_` : gboolean, element_size : guint, reserved_size : guint): Ptr[GArray] = extern

@extern def g_array_sort(array : Ptr[GArray], compare_func : GCompareFunc): Unit = extern

@extern def g_array_sort_with_data(array : Ptr[GArray], compare_func : GCompareDataFunc, user_data : gpointer): Unit = extern

@extern def g_array_steal(array : Ptr[GArray], len : Ptr[gsize]): gpointer = extern

@extern def g_array_unref(array : Ptr[GArray]): Unit = extern

@extern def g_ascii_digit_value(c : gchar): gint = extern

@extern def g_ascii_dtostr(buffer : Ptr[gchar], buf_len : gint, d : gdouble): Ptr[gchar] = extern

@extern def g_ascii_formatd(buffer : Ptr[gchar], buf_len : gint, format : Ptr[gchar], d : gdouble): Ptr[gchar] = extern

@extern def g_ascii_strcasecmp(s1 : Ptr[gchar], s2 : Ptr[gchar]): gint = extern

@extern def g_ascii_strdown(str : Ptr[gchar], len : gssize): Ptr[gchar] = extern

@extern def g_ascii_string_to_signed(str : Ptr[gchar], base : guint, min : gint64, max : gint64, out_num : Ptr[gint64], error : Ptr[Ptr[GError]]): gboolean = extern

@extern def g_ascii_string_to_unsigned(str : Ptr[gchar], base : guint, min : guint64, max : guint64, out_num : Ptr[guint64], error : Ptr[Ptr[GError]]): gboolean = extern

@extern def g_ascii_strncasecmp(s1 : Ptr[gchar], s2 : Ptr[gchar], n : gsize): gint = extern

@extern def g_ascii_strtod(nptr : Ptr[gchar], endptr : Ptr[Ptr[gchar]]): gdouble = extern

@extern def g_ascii_strtoll(nptr : Ptr[gchar], endptr : Ptr[Ptr[gchar]], base : guint): gint64 = extern

@extern def g_ascii_strtoull(nptr : Ptr[gchar], endptr : Ptr[Ptr[gchar]], base : guint): guint64 = extern

@extern def g_ascii_strup(str : Ptr[gchar], len : gssize): Ptr[gchar] = extern

@extern def g_ascii_tolower(c : gchar): gchar = extern

@extern def g_ascii_toupper(c : gchar): gchar = extern

@extern def g_ascii_xdigit_value(c : gchar): gint = extern

@extern def g_assert_warning(log_domain : CString, file : CString, line : CInt, pretty_function : CString, expression : CString): Unit = extern

@extern def g_assertion_message(domain : CString, file : CString, line : CInt, func : CString, message : CString): Unit = extern

@extern def g_assertion_message_cmpint(domain : CString, file : CString, line : CInt, func : CString, expr : CString, arg1 : guint64, cmp : CString, arg2 : guint64, numtype : CChar): Unit = extern

@extern def g_assertion_message_cmpnum(domain : CString, file : CString, line : CInt, func : CString, expr : CString, arg1 : Double, cmp : CString, arg2 : Double, numtype : CChar): Unit = extern

@extern def g_assertion_message_cmpstr(domain : CString, file : CString, line : CInt, func : CString, expr : CString, arg1 : CString, cmp : CString, arg2 : CString): Unit = extern

@extern def g_assertion_message_cmpstrv(domain : CString, file : CString, line : CInt, func : CString, expr : CString, arg1 : Ptr[CString], arg2 : Ptr[CString], first_wrong_idx : gsize): Unit = extern

@extern def g_assertion_message_error(domain : CString, file : CString, line : CInt, func : CString, expr : CString, error : Ptr[GError], error_domain : GQuark, error_code : CInt): Unit = extern

@extern def g_assertion_message_expr(domain : CString, file : CString, line : CInt, func : CString, expr : CString): Unit = extern

@extern def g_async_queue_length(queue : Ptr[GAsyncQueue]): gint = extern

@extern def g_async_queue_length_unlocked(queue : Ptr[GAsyncQueue]): gint = extern

@extern def g_async_queue_lock(queue : Ptr[GAsyncQueue]): Unit = extern

@extern def g_async_queue_new(): Ptr[GAsyncQueue] = extern

@extern def g_async_queue_new_full(item_free_func : GDestroyNotify): Ptr[GAsyncQueue] = extern

@extern def g_async_queue_pop(queue : Ptr[GAsyncQueue]): gpointer = extern

@extern def g_async_queue_pop_unlocked(queue : Ptr[GAsyncQueue]): gpointer = extern

@extern def g_async_queue_push(queue : Ptr[GAsyncQueue], data : gpointer): Unit = extern

@extern def g_async_queue_push_front(queue : Ptr[GAsyncQueue], item : gpointer): Unit = extern

@extern def g_async_queue_push_front_unlocked(queue : Ptr[GAsyncQueue], item : gpointer): Unit = extern

@extern def g_async_queue_push_sorted(queue : Ptr[GAsyncQueue], data : gpointer, func : GCompareDataFunc, user_data : gpointer): Unit = extern

@extern def g_async_queue_push_sorted_unlocked(queue : Ptr[GAsyncQueue], data : gpointer, func : GCompareDataFunc, user_data : gpointer): Unit = extern

@extern def g_async_queue_push_unlocked(queue : Ptr[GAsyncQueue], data : gpointer): Unit = extern

@extern def g_async_queue_ref(queue : Ptr[GAsyncQueue]): Ptr[GAsyncQueue] = extern

@extern def g_async_queue_ref_unlocked(queue : Ptr[GAsyncQueue]): Unit = extern

@extern def g_async_queue_remove(queue : Ptr[GAsyncQueue], item : gpointer): gboolean = extern

@extern def g_async_queue_remove_unlocked(queue : Ptr[GAsyncQueue], item : gpointer): gboolean = extern

@extern def g_async_queue_sort(queue : Ptr[GAsyncQueue], func : GCompareDataFunc, user_data : gpointer): Unit = extern

@extern def g_async_queue_sort_unlocked(queue : Ptr[GAsyncQueue], func : GCompareDataFunc, user_data : gpointer): Unit = extern

@extern def g_async_queue_timed_pop(queue : Ptr[GAsyncQueue], end_time : Ptr[GTimeVal]): gpointer = extern

@extern def g_async_queue_timed_pop_unlocked(queue : Ptr[GAsyncQueue], end_time : Ptr[GTimeVal]): gpointer = extern

@extern def g_async_queue_timeout_pop(queue : Ptr[GAsyncQueue], timeout : guint64): gpointer = extern

@extern def g_async_queue_timeout_pop_unlocked(queue : Ptr[GAsyncQueue], timeout : guint64): gpointer = extern

@extern def g_async_queue_try_pop(queue : Ptr[GAsyncQueue]): gpointer = extern

@extern def g_async_queue_try_pop_unlocked(queue : Ptr[GAsyncQueue]): gpointer = extern

@extern def g_async_queue_unlock(queue : Ptr[GAsyncQueue]): Unit = extern

@extern def g_async_queue_unref(queue : Ptr[GAsyncQueue]): Unit = extern

@extern def g_async_queue_unref_and_unlock(queue : Ptr[GAsyncQueue]): Unit = extern

@extern def g_atexit(func : GVoidFunc): Unit = extern

@extern def g_atomic_int_add(atomic : Ptr[gint], `val` : gint): gint = extern

@extern def g_atomic_int_and(atomic : Ptr[guint], `val` : guint): guint = extern

@extern def g_atomic_int_compare_and_exchange(atomic : Ptr[gint], oldval : gint, newval : gint): gboolean = extern

@extern def g_atomic_int_compare_and_exchange_full(atomic : Ptr[gint], oldval : gint, newval : gint, preval : Ptr[gint]): gboolean = extern

@extern def g_atomic_int_dec_and_test(atomic : Ptr[gint]): gboolean = extern

@extern def g_atomic_int_exchange(atomic : Ptr[gint], newval : gint): gint = extern

@extern def g_atomic_int_exchange_and_add(atomic : Ptr[gint], `val` : gint): gint = extern

@extern def g_atomic_int_get(atomic : Ptr[gint]): gint = extern

@extern def g_atomic_int_inc(atomic : Ptr[gint]): Unit = extern

@extern def g_atomic_int_or(atomic : Ptr[guint], `val` : guint): guint = extern

@extern def g_atomic_int_set(atomic : Ptr[gint], newval : gint): Unit = extern

@extern def g_atomic_int_xor(atomic : Ptr[guint], `val` : guint): guint = extern

@extern def g_atomic_pointer_add(atomic : Ptr[Byte], `val` : gssize): gintptr = extern

@extern def g_atomic_pointer_and(atomic : Ptr[Byte], `val` : gsize): guintptr = extern

@extern def g_atomic_pointer_compare_and_exchange(atomic : Ptr[Byte], oldval : gpointer, newval : gpointer): gboolean = extern

@extern def g_atomic_pointer_compare_and_exchange_full(atomic : Ptr[Byte], oldval : gpointer, newval : gpointer, preval : Ptr[Byte]): gboolean = extern

@extern def g_atomic_pointer_exchange(atomic : Ptr[Byte], newval : gpointer): gpointer = extern

@extern def g_atomic_pointer_get(atomic : Ptr[Byte]): gpointer = extern

@extern def g_atomic_pointer_or(atomic : Ptr[Byte], `val` : gsize): guintptr = extern

@extern def g_atomic_pointer_set(atomic : Ptr[Byte], newval : gpointer): Unit = extern

@extern def g_atomic_pointer_xor(atomic : Ptr[Byte], `val` : gsize): guintptr = extern

@extern def g_atomic_rc_box_acquire(mem_block : gpointer): gpointer = extern

@extern def g_atomic_rc_box_alloc(block_size : gsize): gpointer = extern

@extern def g_atomic_rc_box_alloc0(block_size : gsize): gpointer = extern

@extern def g_atomic_rc_box_dup(block_size : gsize, mem_block : gconstpointer): gpointer = extern

@extern def g_atomic_rc_box_get_size(mem_block : gpointer): gsize = extern

@extern def g_atomic_rc_box_release(mem_block : gpointer): Unit = extern

@extern def g_atomic_rc_box_release_full(mem_block : gpointer, clear_func : GDestroyNotify): Unit = extern

@extern def g_atomic_ref_count_compare(arc : Ptr[gatomicrefcount], `val` : gint): gboolean = extern

@extern def g_atomic_ref_count_dec(arc : Ptr[gatomicrefcount]): gboolean = extern

@extern def g_atomic_ref_count_inc(arc : Ptr[gatomicrefcount]): Unit = extern

@extern def g_atomic_ref_count_init(arc : Ptr[gatomicrefcount]): Unit = extern

@extern def g_autoptr_cleanup_generic_gfree(p : Ptr[Byte]): Unit = extern

@extern def g_autoptr_cleanup_gstring_free(string : Ptr[GString]): Unit = extern

@extern def g_base64_decode(text : Ptr[gchar], out_len : Ptr[gsize]): Ptr[guchar] = extern

@extern def g_base64_decode_inplace(text : Ptr[gchar], out_len : Ptr[gsize]): Ptr[guchar] = extern

@extern def g_base64_decode_step(in : Ptr[gchar], len : gsize, out : Ptr[guchar], state : Ptr[gint], save : Ptr[guint]): gsize = extern

@extern def g_base64_encode(data : Ptr[guchar], len : gsize): Ptr[gchar] = extern

@extern def g_base64_encode_close(break_lines : gboolean, out : Ptr[gchar], state : Ptr[gint], save : Ptr[gint]): gsize = extern

@extern def g_base64_encode_step(in : Ptr[guchar], len : gsize, break_lines : gboolean, out : Ptr[gchar], state : Ptr[gint], save : Ptr[gint]): gsize = extern

@extern def g_basename(file_name : Ptr[gchar]): Ptr[gchar] = extern

@extern def g_bit_lock(address : Ptr[gint], lock_bit : gint): Unit = extern

@extern def g_bit_nth_lsf(mask : gulong, nth_bit : gint): gint = extern

@extern def g_bit_nth_lsf_impl(mask : gulong, nth_bit : gint): gint = extern

@extern def g_bit_nth_msf(mask : gulong, nth_bit : gint): gint = extern

@extern def g_bit_nth_msf_impl(mask : gulong, nth_bit : gint): gint = extern

@extern def g_bit_storage(number : gulong): guint = extern

@extern def g_bit_storage_impl(number : gulong): guint = extern

@extern def g_bit_trylock(address : Ptr[gint], lock_bit : gint): gboolean = extern

@extern def g_bit_unlock(address : Ptr[gint], lock_bit : gint): Unit = extern

@extern def g_blow_chunks(): Unit = extern

@extern def g_bookmark_file_add_application(bookmark : Ptr[GBookmarkFile], uri : Ptr[gchar], name : Ptr[gchar], exec : Ptr[gchar]): Unit = extern

@extern def g_bookmark_file_add_group(bookmark : Ptr[GBookmarkFile], uri : Ptr[gchar], group : Ptr[gchar]): Unit = extern

@extern def g_bookmark_file_copy(bookmark : Ptr[GBookmarkFile]): Ptr[GBookmarkFile] = extern

@extern def g_bookmark_file_error_quark(): GQuark = extern

@extern def g_bookmark_file_free(bookmark : Ptr[GBookmarkFile]): Unit = extern

@extern def g_bookmark_file_get_added(bookmark : Ptr[GBookmarkFile], uri : Ptr[gchar], error : Ptr[Ptr[GError]]): time_t = extern

@extern def g_bookmark_file_get_added_date_time(bookmark : Ptr[GBookmarkFile], uri : CString, error : Ptr[Ptr[GError]]): Ptr[GDateTime] = extern

@extern def g_bookmark_file_get_app_info(bookmark : Ptr[GBookmarkFile], uri : Ptr[gchar], name : Ptr[gchar], exec : Ptr[Ptr[gchar]], count : Ptr[guint], stamp : Ptr[time_t], error : Ptr[Ptr[GError]]): gboolean = extern

@extern def g_bookmark_file_get_application_info(bookmark : Ptr[GBookmarkFile], uri : CString, name : CString, exec : Ptr[CString], count : Ptr[CUnsignedInt], stamp : Ptr[Ptr[GDateTime]], error : Ptr[Ptr[GError]]): gboolean = extern

@extern def g_bookmark_file_get_applications(bookmark : Ptr[GBookmarkFile], uri : Ptr[gchar], length : Ptr[gsize], error : Ptr[Ptr[GError]]): Ptr[Ptr[gchar]] = extern

@extern def g_bookmark_file_get_description(bookmark : Ptr[GBookmarkFile], uri : Ptr[gchar], error : Ptr[Ptr[GError]]): Ptr[gchar] = extern

@extern def g_bookmark_file_get_groups(bookmark : Ptr[GBookmarkFile], uri : Ptr[gchar], length : Ptr[gsize], error : Ptr[Ptr[GError]]): Ptr[Ptr[gchar]] = extern

@extern def g_bookmark_file_get_icon(bookmark : Ptr[GBookmarkFile], uri : Ptr[gchar], href : Ptr[Ptr[gchar]], mime_type : Ptr[Ptr[gchar]], error : Ptr[Ptr[GError]]): gboolean = extern

@extern def g_bookmark_file_get_is_private(bookmark : Ptr[GBookmarkFile], uri : Ptr[gchar], error : Ptr[Ptr[GError]]): gboolean = extern

@extern def g_bookmark_file_get_mime_type(bookmark : Ptr[GBookmarkFile], uri : Ptr[gchar], error : Ptr[Ptr[GError]]): Ptr[gchar] = extern

@extern def g_bookmark_file_get_modified(bookmark : Ptr[GBookmarkFile], uri : Ptr[gchar], error : Ptr[Ptr[GError]]): time_t = extern

@extern def g_bookmark_file_get_modified_date_time(bookmark : Ptr[GBookmarkFile], uri : CString, error : Ptr[Ptr[GError]]): Ptr[GDateTime] = extern

@extern def g_bookmark_file_get_size(bookmark : Ptr[GBookmarkFile]): gint = extern

@extern def g_bookmark_file_get_title(bookmark : Ptr[GBookmarkFile], uri : Ptr[gchar], error : Ptr[Ptr[GError]]): Ptr[gchar] = extern

@extern def g_bookmark_file_get_uris(bookmark : Ptr[GBookmarkFile], length : Ptr[gsize]): Ptr[Ptr[gchar]] = extern

@extern def g_bookmark_file_get_visited(bookmark : Ptr[GBookmarkFile], uri : Ptr[gchar], error : Ptr[Ptr[GError]]): time_t = extern

@extern def g_bookmark_file_get_visited_date_time(bookmark : Ptr[GBookmarkFile], uri : CString, error : Ptr[Ptr[GError]]): Ptr[GDateTime] = extern

@extern def g_bookmark_file_has_application(bookmark : Ptr[GBookmarkFile], uri : Ptr[gchar], name : Ptr[gchar], error : Ptr[Ptr[GError]]): gboolean = extern

@extern def g_bookmark_file_has_group(bookmark : Ptr[GBookmarkFile], uri : Ptr[gchar], group : Ptr[gchar], error : Ptr[Ptr[GError]]): gboolean = extern

@extern def g_bookmark_file_has_item(bookmark : Ptr[GBookmarkFile], uri : Ptr[gchar]): gboolean = extern

@extern def g_bookmark_file_load_from_data(bookmark : Ptr[GBookmarkFile], data : Ptr[gchar], length : gsize, error : Ptr[Ptr[GError]]): gboolean = extern

@extern def g_bookmark_file_load_from_data_dirs(bookmark : Ptr[GBookmarkFile], file : Ptr[gchar], full_path : Ptr[Ptr[gchar]], error : Ptr[Ptr[GError]]): gboolean = extern

@extern def g_bookmark_file_load_from_file(bookmark : Ptr[GBookmarkFile], filename : Ptr[gchar], error : Ptr[Ptr[GError]]): gboolean = extern

@extern def g_bookmark_file_move_item(bookmark : Ptr[GBookmarkFile], old_uri : Ptr[gchar], new_uri : Ptr[gchar], error : Ptr[Ptr[GError]]): gboolean = extern

@extern def g_bookmark_file_new(): Ptr[GBookmarkFile] = extern

@extern def g_bookmark_file_remove_application(bookmark : Ptr[GBookmarkFile], uri : Ptr[gchar], name : Ptr[gchar], error : Ptr[Ptr[GError]]): gboolean = extern

@extern def g_bookmark_file_remove_group(bookmark : Ptr[GBookmarkFile], uri : Ptr[gchar], group : Ptr[gchar], error : Ptr[Ptr[GError]]): gboolean = extern

@extern def g_bookmark_file_remove_item(bookmark : Ptr[GBookmarkFile], uri : Ptr[gchar], error : Ptr[Ptr[GError]]): gboolean = extern

@extern def g_bookmark_file_set_added(bookmark : Ptr[GBookmarkFile], uri : Ptr[gchar], added : time_t): Unit = extern

@extern def g_bookmark_file_set_added_date_time(bookmark : Ptr[GBookmarkFile], uri : CString, added : Ptr[GDateTime]): Unit = extern

@extern def g_bookmark_file_set_app_info(bookmark : Ptr[GBookmarkFile], uri : Ptr[gchar], name : Ptr[gchar], exec : Ptr[gchar], count : gint, stamp : time_t, error : Ptr[Ptr[GError]]): gboolean = extern

@extern def g_bookmark_file_set_application_info(bookmark : Ptr[GBookmarkFile], uri : CString, name : CString, exec : CString, count : CInt, stamp : Ptr[GDateTime], error : Ptr[Ptr[GError]]): gboolean = extern

@extern def g_bookmark_file_set_description(bookmark : Ptr[GBookmarkFile], uri : Ptr[gchar], description : Ptr[gchar]): Unit = extern

@extern def g_bookmark_file_set_groups(bookmark : Ptr[GBookmarkFile], uri : Ptr[gchar], groups : Ptr[Ptr[gchar]], length : gsize): Unit = extern

@extern def g_bookmark_file_set_icon(bookmark : Ptr[GBookmarkFile], uri : Ptr[gchar], href : Ptr[gchar], mime_type : Ptr[gchar]): Unit = extern

@extern def g_bookmark_file_set_is_private(bookmark : Ptr[GBookmarkFile], uri : Ptr[gchar], is_private : gboolean): Unit = extern

@extern def g_bookmark_file_set_mime_type(bookmark : Ptr[GBookmarkFile], uri : Ptr[gchar], mime_type : Ptr[gchar]): Unit = extern

@extern def g_bookmark_file_set_modified(bookmark : Ptr[GBookmarkFile], uri : Ptr[gchar], modified : time_t): Unit = extern

@extern def g_bookmark_file_set_modified_date_time(bookmark : Ptr[GBookmarkFile], uri : CString, modified : Ptr[GDateTime]): Unit = extern

@extern def g_bookmark_file_set_title(bookmark : Ptr[GBookmarkFile], uri : Ptr[gchar], title : Ptr[gchar]): Unit = extern

@extern def g_bookmark_file_set_visited(bookmark : Ptr[GBookmarkFile], uri : Ptr[gchar], visited : time_t): Unit = extern

@extern def g_bookmark_file_set_visited_date_time(bookmark : Ptr[GBookmarkFile], uri : CString, visited : Ptr[GDateTime]): Unit = extern

@extern def g_bookmark_file_to_data(bookmark : Ptr[GBookmarkFile], length : Ptr[gsize], error : Ptr[Ptr[GError]]): Ptr[gchar] = extern

@extern def g_bookmark_file_to_file(bookmark : Ptr[GBookmarkFile], filename : Ptr[gchar], error : Ptr[Ptr[GError]]): gboolean = extern

@extern def g_build_filename(first_element : Ptr[gchar], rest: Any*): Ptr[gchar] = extern

@extern def g_build_filename_valist(first_element : Ptr[gchar], args : Ptr[va_list]): Ptr[gchar] = extern

@extern def g_build_filenamev(args : Ptr[Ptr[gchar]]): Ptr[gchar] = extern

@extern def g_build_path(separator : Ptr[gchar], first_element : Ptr[gchar], rest: Any*): Ptr[gchar] = extern

@extern def g_build_pathv(separator : Ptr[gchar], args : Ptr[Ptr[gchar]]): Ptr[gchar] = extern

@extern def g_byte_array_append(array : Ptr[GByteArray], data : Ptr[guint8], len : guint): Ptr[GByteArray] = extern

@extern def g_byte_array_free(array : Ptr[GByteArray], free_segment : gboolean): Ptr[guint8] = extern

@extern def g_byte_array_free_to_bytes(array : Ptr[GByteArray]): Ptr[GBytes] = extern

@extern def g_byte_array_new(): Ptr[GByteArray] = extern

@extern def g_byte_array_new_take(data : Ptr[guint8], len : gsize): Ptr[GByteArray] = extern

@extern def g_byte_array_prepend(array : Ptr[GByteArray], data : Ptr[guint8], len : guint): Ptr[GByteArray] = extern

@extern def g_byte_array_ref(array : Ptr[GByteArray]): Ptr[GByteArray] = extern

@extern def g_byte_array_remove_index(array : Ptr[GByteArray], `index_` : guint): Ptr[GByteArray] = extern

@extern def g_byte_array_remove_index_fast(array : Ptr[GByteArray], `index_` : guint): Ptr[GByteArray] = extern

@extern def g_byte_array_remove_range(array : Ptr[GByteArray], `index_` : guint, length : guint): Ptr[GByteArray] = extern

@extern def g_byte_array_set_size(array : Ptr[GByteArray], length : guint): Ptr[GByteArray] = extern

@extern def g_byte_array_sized_new(reserved_size : guint): Ptr[GByteArray] = extern

@extern def g_byte_array_sort(array : Ptr[GByteArray], compare_func : GCompareFunc): Unit = extern

@extern def g_byte_array_sort_with_data(array : Ptr[GByteArray], compare_func : GCompareDataFunc, user_data : gpointer): Unit = extern

@extern def g_byte_array_steal(array : Ptr[GByteArray], len : Ptr[gsize]): Ptr[guint8] = extern

@extern def g_byte_array_unref(array : Ptr[GByteArray]): Unit = extern

@extern def g_bytes_compare(bytes1 : gconstpointer, bytes2 : gconstpointer): gint = extern

@extern def g_bytes_equal(bytes1 : gconstpointer, bytes2 : gconstpointer): gboolean = extern

@extern def g_bytes_get_data(bytes : Ptr[GBytes], size : Ptr[gsize]): gconstpointer = extern

@extern def g_bytes_get_region(bytes : Ptr[GBytes], element_size : gsize, offset : gsize, n_elements : gsize): gconstpointer = extern

@extern def g_bytes_get_size(bytes : Ptr[GBytes]): gsize = extern

@extern def g_bytes_hash(bytes : gconstpointer): guint = extern

@extern def g_bytes_new(data : gconstpointer, size : gsize): Ptr[GBytes] = extern

@extern def g_bytes_new_from_bytes(bytes : Ptr[GBytes], offset : gsize, length : gsize): Ptr[GBytes] = extern

@extern def g_bytes_new_static(data : gconstpointer, size : gsize): Ptr[GBytes] = extern

@extern def g_bytes_new_take(data : gpointer, size : gsize): Ptr[GBytes] = extern

@extern def g_bytes_new_with_free_func(data : gconstpointer, size : gsize, free_func : GDestroyNotify, user_data : gpointer): Ptr[GBytes] = extern

@extern def g_bytes_ref(bytes : Ptr[GBytes]): Ptr[GBytes] = extern

@extern def g_bytes_unref(bytes : Ptr[GBytes]): Unit = extern

@extern def g_bytes_unref_to_array(bytes : Ptr[GBytes]): Ptr[GByteArray] = extern

@extern def g_bytes_unref_to_data(bytes : Ptr[GBytes], size : Ptr[gsize]): gpointer = extern

@extern def g_cache_destroy(cache : Ptr[GCache]): Unit = extern

@extern def g_cache_insert(cache : Ptr[GCache], key : gpointer): gpointer = extern

@extern def g_cache_key_foreach(cache : Ptr[GCache], func : GHFunc, user_data : gpointer): Unit = extern

@extern def g_cache_new(value_new_func : GCacheNewFunc, value_destroy_func : GCacheDestroyFunc, key_dup_func : GCacheDupFunc, key_destroy_func : GCacheDestroyFunc, hash_key_func : GHashFunc, hash_value_func : GHashFunc, key_equal_func : GEqualFunc): Ptr[GCache] = extern

@extern def g_cache_remove(cache : Ptr[GCache], value : gconstpointer): Unit = extern

@extern def g_cache_value_foreach(cache : Ptr[GCache], func : GHFunc, user_data : gpointer): Unit = extern

@extern def g_canonicalize_filename(filename : Ptr[gchar], relative_to : Ptr[gchar]): Ptr[gchar] = extern

@extern def g_checksum_copy(checksum : Ptr[GChecksum]): Ptr[GChecksum] = extern

@extern def g_checksum_free(checksum : Ptr[GChecksum]): Unit = extern

@extern def g_checksum_get_digest(checksum : Ptr[GChecksum], buffer : Ptr[guint8], digest_len : Ptr[gsize]): Unit = extern

@extern def g_checksum_get_string(checksum : Ptr[GChecksum]): Ptr[gchar] = extern

@extern def g_checksum_new(checksum_type : GChecksumType): Ptr[GChecksum] = extern

@extern def g_checksum_reset(checksum : Ptr[GChecksum]): Unit = extern

@extern def g_checksum_type_get_length(checksum_type : GChecksumType): gssize = extern

@extern def g_checksum_update(checksum : Ptr[GChecksum], data : Ptr[guchar], length : gssize): Unit = extern

@extern def g_child_watch_add(pid : GPid, function : GChildWatchFunc, data : gpointer): guint = extern

@extern def g_child_watch_add_full(priority : gint, pid : GPid, function : GChildWatchFunc, data : gpointer, notify : GDestroyNotify): guint = extern

@extern def g_child_watch_source_new(pid : GPid): Ptr[GSource] = extern

@extern def g_clear_error(err : Ptr[Ptr[GError]]): Unit = extern

@extern def g_clear_handle_id(tag_ptr : Ptr[guint], clear_func : GClearHandleFunc): Unit = extern

@extern def g_clear_list(list_ptr : Ptr[Ptr[GList]], destroy : GDestroyNotify): Unit = extern

@extern def g_clear_pointer(pp : Ptr[gpointer], destroy : GDestroyNotify): Unit = extern

@extern def g_clear_slist(slist_ptr : Ptr[Ptr[GSList]], destroy : GDestroyNotify): Unit = extern

@extern def g_completion_add_items(cmp : Ptr[GCompletion], items : Ptr[GList]): Unit = extern

@extern def g_completion_clear_items(cmp : Ptr[GCompletion]): Unit = extern

@extern def g_completion_complete(cmp : Ptr[GCompletion], prefix : Ptr[gchar], new_prefix : Ptr[Ptr[gchar]]): Ptr[GList] = extern

@extern def g_completion_complete_utf8(cmp : Ptr[GCompletion], prefix : Ptr[gchar], new_prefix : Ptr[Ptr[gchar]]): Ptr[GList] = extern

@extern def g_completion_free(cmp : Ptr[GCompletion]): Unit = extern

@extern def g_completion_new(func : GCompletionFunc): Ptr[GCompletion] = extern

@extern def g_completion_remove_items(cmp : Ptr[GCompletion], items : Ptr[GList]): Unit = extern

@extern def g_completion_set_compare(cmp : Ptr[GCompletion], strncmp_func : GCompletionStrncmpFunc): Unit = extern

@extern def g_compute_checksum_for_bytes(checksum_type : GChecksumType, data : Ptr[GBytes]): Ptr[gchar] = extern

@extern def g_compute_checksum_for_data(checksum_type : GChecksumType, data : Ptr[guchar], length : gsize): Ptr[gchar] = extern

@extern def g_compute_checksum_for_string(checksum_type : GChecksumType, str : Ptr[gchar], length : gssize): Ptr[gchar] = extern

@extern def g_compute_hmac_for_bytes(digest_type : GChecksumType, key : Ptr[GBytes], data : Ptr[GBytes]): Ptr[gchar] = extern

@extern def g_compute_hmac_for_data(digest_type : GChecksumType, key : Ptr[guchar], key_len : gsize, data : Ptr[guchar], length : gsize): Ptr[gchar] = extern

@extern def g_compute_hmac_for_string(digest_type : GChecksumType, key : Ptr[guchar], key_len : gsize, str : Ptr[gchar], length : gssize): Ptr[gchar] = extern

@extern def g_cond_broadcast(cond : Ptr[GCond]): Unit = extern

@extern def g_cond_clear(cond : Ptr[GCond]): Unit = extern

@extern def g_cond_free(cond : Ptr[GCond]): Unit = extern

@extern def g_cond_init(cond : Ptr[GCond]): Unit = extern

@extern def g_cond_new(): Ptr[GCond] = extern

@extern def g_cond_signal(cond : Ptr[GCond]): Unit = extern

@extern def g_cond_timed_wait(cond : Ptr[GCond], mutex : Ptr[GMutex], abs_time : Ptr[GTimeVal]): gboolean = extern

@extern def g_cond_wait(cond : Ptr[GCond], mutex : Ptr[GMutex]): Unit = extern

@extern def g_cond_wait_until(cond : Ptr[GCond], mutex : Ptr[GMutex], end_time : gint64): gboolean = extern

@extern def g_convert(str : Ptr[gchar], len : gssize, to_codeset : Ptr[gchar], from_codeset : Ptr[gchar], bytes_read : Ptr[gsize], bytes_written : Ptr[gsize], error : Ptr[Ptr[GError]]): Ptr[gchar] = extern

@extern def g_convert_error_quark(): GQuark = extern

@extern def g_convert_with_fallback(str : Ptr[gchar], len : gssize, to_codeset : Ptr[gchar], from_codeset : Ptr[gchar], fallback : Ptr[gchar], bytes_read : Ptr[gsize], bytes_written : Ptr[gsize], error : Ptr[Ptr[GError]]): Ptr[gchar] = extern

@extern def g_convert_with_iconv(str : Ptr[gchar], len : gssize, converter : GIConv, bytes_read : Ptr[gsize], bytes_written : Ptr[gsize], error : Ptr[Ptr[GError]]): Ptr[gchar] = extern

@extern def g_datalist_clear(datalist : Ptr[Ptr[GData]]): Unit = extern

@extern def g_datalist_foreach(datalist : Ptr[Ptr[GData]], func : GDataForeachFunc, user_data : gpointer): Unit = extern

@extern def g_datalist_get_data(datalist : Ptr[Ptr[GData]], key : Ptr[gchar]): gpointer = extern

@extern def g_datalist_get_flags(datalist : Ptr[Ptr[GData]]): guint = extern

@extern def g_datalist_id_dup_data(datalist : Ptr[Ptr[GData]], key_id : GQuark, dup_func : GDuplicateFunc, user_data : gpointer): gpointer = extern

@extern def g_datalist_id_get_data(datalist : Ptr[Ptr[GData]], key_id : GQuark): gpointer = extern

@extern def g_datalist_id_remove_multiple(datalist : Ptr[Ptr[GData]], keys : Ptr[GQuark], n_keys : gsize): Unit = extern

@extern def g_datalist_id_remove_no_notify(datalist : Ptr[Ptr[GData]], key_id : GQuark): gpointer = extern

@extern def g_datalist_id_replace_data(datalist : Ptr[Ptr[GData]], key_id : GQuark, oldval : gpointer, newval : gpointer, destroy : GDestroyNotify, old_destroy : Ptr[GDestroyNotify]): gboolean = extern

@extern def g_datalist_id_set_data_full(datalist : Ptr[Ptr[GData]], key_id : GQuark, data : gpointer, destroy_func : GDestroyNotify): Unit = extern

@extern def g_datalist_init(datalist : Ptr[Ptr[GData]]): Unit = extern

@extern def g_datalist_set_flags(datalist : Ptr[Ptr[GData]], flags : guint): Unit = extern

@extern def g_datalist_unset_flags(datalist : Ptr[Ptr[GData]], flags : guint): Unit = extern

@extern def g_dataset_destroy(dataset_location : gconstpointer): Unit = extern

@extern def g_dataset_foreach(dataset_location : gconstpointer, func : GDataForeachFunc, user_data : gpointer): Unit = extern

@extern def g_dataset_id_get_data(dataset_location : gconstpointer, key_id : GQuark): gpointer = extern

@extern def g_dataset_id_remove_no_notify(dataset_location : gconstpointer, key_id : GQuark): gpointer = extern

@extern def g_dataset_id_set_data_full(dataset_location : gconstpointer, key_id : GQuark, data : gpointer, destroy_func : GDestroyNotify): Unit = extern

@extern def g_date_add_days(date : Ptr[GDate], n_days : guint): Unit = extern

@extern def g_date_add_months(date : Ptr[GDate], n_months : guint): Unit = extern

@extern def g_date_add_years(date : Ptr[GDate], n_years : guint): Unit = extern

@extern def g_date_clamp(date : Ptr[GDate], min_date : Ptr[GDate], max_date : Ptr[GDate]): Unit = extern

@extern def g_date_clear(date : Ptr[GDate], n_dates : guint): Unit = extern

@extern def g_date_compare(lhs : Ptr[GDate], rhs : Ptr[GDate]): gint = extern

@extern def g_date_copy(date : Ptr[GDate]): Ptr[GDate] = extern

@extern def g_date_days_between(date1 : Ptr[GDate], date2 : Ptr[GDate]): gint = extern

@extern def g_date_free(date : Ptr[GDate]): Unit = extern

@extern def g_date_get_day(date : Ptr[GDate]): GDateDay = extern

@extern def g_date_get_day_of_year(date : Ptr[GDate]): guint = extern

@extern def g_date_get_days_in_month(month : GDateMonth, year : GDateYear): guint8 = extern

@extern def g_date_get_iso8601_week_of_year(date : Ptr[GDate]): guint = extern

@extern def g_date_get_julian(date : Ptr[GDate]): guint32 = extern

@extern def g_date_get_monday_week_of_year(date : Ptr[GDate]): guint = extern

@extern def g_date_get_monday_weeks_in_year(year : GDateYear): guint8 = extern

@extern def g_date_get_month(date : Ptr[GDate]): GDateMonth = extern

@extern def g_date_get_sunday_week_of_year(date : Ptr[GDate]): guint = extern

@extern def g_date_get_sunday_weeks_in_year(year : GDateYear): guint8 = extern

@extern def g_date_get_weekday(date : Ptr[GDate]): GDateWeekday = extern

@extern def g_date_get_year(date : Ptr[GDate]): GDateYear = extern

@extern def g_date_is_first_of_month(date : Ptr[GDate]): gboolean = extern

@extern def g_date_is_last_of_month(date : Ptr[GDate]): gboolean = extern

@extern def g_date_is_leap_year(year : GDateYear): gboolean = extern

@extern def g_date_new(): Ptr[GDate] = extern

@extern def g_date_new_dmy(day : GDateDay, month : GDateMonth, year : GDateYear): Ptr[GDate] = extern

@extern def g_date_new_julian(julian_day : guint32): Ptr[GDate] = extern

@extern def g_date_order(date1 : Ptr[GDate], date2 : Ptr[GDate]): Unit = extern

@extern def g_date_set_day(date : Ptr[GDate], day : GDateDay): Unit = extern

@extern def g_date_set_dmy(date : Ptr[GDate], day : GDateDay, month : GDateMonth, y : GDateYear): Unit = extern

@extern def g_date_set_julian(date : Ptr[GDate], julian_date : guint32): Unit = extern

@extern def g_date_set_month(date : Ptr[GDate], month : GDateMonth): Unit = extern

@extern def g_date_set_parse(date : Ptr[GDate], str : Ptr[gchar]): Unit = extern

@extern def g_date_set_time(date : Ptr[GDate], `time_` : GTime): Unit = extern

@extern def g_date_set_time_t(date : Ptr[GDate], timet : time_t): Unit = extern

@extern def g_date_set_time_val(date : Ptr[GDate], timeval : Ptr[GTimeVal]): Unit = extern

@extern def g_date_set_year(date : Ptr[GDate], year : GDateYear): Unit = extern

@extern def g_date_strftime(s : Ptr[gchar], slen : gsize, format : Ptr[gchar], date : Ptr[GDate]): gsize = extern

@extern def g_date_subtract_days(date : Ptr[GDate], n_days : guint): Unit = extern

@extern def g_date_subtract_months(date : Ptr[GDate], n_months : guint): Unit = extern

@extern def g_date_subtract_years(date : Ptr[GDate], n_years : guint): Unit = extern

@extern def g_date_time_add(datetime : Ptr[GDateTime], timespan : GTimeSpan): Ptr[GDateTime] = extern

@extern def g_date_time_add_days(datetime : Ptr[GDateTime], days : gint): Ptr[GDateTime] = extern

@extern def g_date_time_add_full(datetime : Ptr[GDateTime], years : gint, months : gint, days : gint, hours : gint, minutes : gint, seconds : gdouble): Ptr[GDateTime] = extern

@extern def g_date_time_add_hours(datetime : Ptr[GDateTime], hours : gint): Ptr[GDateTime] = extern

@extern def g_date_time_add_minutes(datetime : Ptr[GDateTime], minutes : gint): Ptr[GDateTime] = extern

@extern def g_date_time_add_months(datetime : Ptr[GDateTime], months : gint): Ptr[GDateTime] = extern

@extern def g_date_time_add_seconds(datetime : Ptr[GDateTime], seconds : gdouble): Ptr[GDateTime] = extern

@extern def g_date_time_add_weeks(datetime : Ptr[GDateTime], weeks : gint): Ptr[GDateTime] = extern

@extern def g_date_time_add_years(datetime : Ptr[GDateTime], years : gint): Ptr[GDateTime] = extern

@extern def g_date_time_compare(dt1 : gconstpointer, dt2 : gconstpointer): gint = extern

@extern def g_date_time_difference(end : Ptr[GDateTime], begin : Ptr[GDateTime]): GTimeSpan = extern

@extern def g_date_time_equal(dt1 : gconstpointer, dt2 : gconstpointer): gboolean = extern

@extern def g_date_time_format(datetime : Ptr[GDateTime], format : Ptr[gchar]): Ptr[gchar] = extern

@extern def g_date_time_format_iso8601(datetime : Ptr[GDateTime]): Ptr[gchar] = extern

@extern def g_date_time_get_day_of_month(datetime : Ptr[GDateTime]): gint = extern

@extern def g_date_time_get_day_of_week(datetime : Ptr[GDateTime]): gint = extern

@extern def g_date_time_get_day_of_year(datetime : Ptr[GDateTime]): gint = extern

@extern def g_date_time_get_hour(datetime : Ptr[GDateTime]): gint = extern

@extern def g_date_time_get_microsecond(datetime : Ptr[GDateTime]): gint = extern

@extern def g_date_time_get_minute(datetime : Ptr[GDateTime]): gint = extern

@extern def g_date_time_get_month(datetime : Ptr[GDateTime]): gint = extern

@extern def g_date_time_get_second(datetime : Ptr[GDateTime]): gint = extern

@extern def g_date_time_get_seconds(datetime : Ptr[GDateTime]): gdouble = extern

@extern def g_date_time_get_timezone(datetime : Ptr[GDateTime]): Ptr[GTimeZone] = extern

@extern def g_date_time_get_timezone_abbreviation(datetime : Ptr[GDateTime]): Ptr[gchar] = extern

@extern def g_date_time_get_utc_offset(datetime : Ptr[GDateTime]): GTimeSpan = extern

@extern def g_date_time_get_week_numbering_year(datetime : Ptr[GDateTime]): gint = extern

@extern def g_date_time_get_week_of_year(datetime : Ptr[GDateTime]): gint = extern

@extern def g_date_time_get_year(datetime : Ptr[GDateTime]): gint = extern

@extern def g_date_time_get_ymd(datetime : Ptr[GDateTime], year : Ptr[gint], month : Ptr[gint], day : Ptr[gint]): Unit = extern

@extern def g_date_time_hash(datetime : gconstpointer): guint = extern

@extern def g_date_time_is_daylight_savings(datetime : Ptr[GDateTime]): gboolean = extern

@extern def g_date_time_new(tz : Ptr[GTimeZone], year : gint, month : gint, day : gint, hour : gint, minute : gint, seconds : gdouble): Ptr[GDateTime] = extern

@extern def g_date_time_new_from_iso8601(text : Ptr[gchar], default_tz : Ptr[GTimeZone]): Ptr[GDateTime] = extern

@extern def g_date_time_new_from_timeval_local(tv : Ptr[GTimeVal]): Ptr[GDateTime] = extern

@extern def g_date_time_new_from_timeval_utc(tv : Ptr[GTimeVal]): Ptr[GDateTime] = extern

@extern def g_date_time_new_from_unix_local(t : gint64): Ptr[GDateTime] = extern

@extern def g_date_time_new_from_unix_local_usec(usecs : gint64): Ptr[GDateTime] = extern

@extern def g_date_time_new_from_unix_utc(t : gint64): Ptr[GDateTime] = extern

@extern def g_date_time_new_from_unix_utc_usec(usecs : gint64): Ptr[GDateTime] = extern

@extern def g_date_time_new_local(year : gint, month : gint, day : gint, hour : gint, minute : gint, seconds : gdouble): Ptr[GDateTime] = extern

@extern def g_date_time_new_now(tz : Ptr[GTimeZone]): Ptr[GDateTime] = extern

@extern def g_date_time_new_now_local(): Ptr[GDateTime] = extern

@extern def g_date_time_new_now_utc(): Ptr[GDateTime] = extern

@extern def g_date_time_new_utc(year : gint, month : gint, day : gint, hour : gint, minute : gint, seconds : gdouble): Ptr[GDateTime] = extern

@extern def g_date_time_ref(datetime : Ptr[GDateTime]): Ptr[GDateTime] = extern

@extern def g_date_time_to_local(datetime : Ptr[GDateTime]): Ptr[GDateTime] = extern

@extern def g_date_time_to_timeval(datetime : Ptr[GDateTime], tv : Ptr[GTimeVal]): gboolean = extern

@extern def g_date_time_to_timezone(datetime : Ptr[GDateTime], tz : Ptr[GTimeZone]): Ptr[GDateTime] = extern

@extern def g_date_time_to_unix(datetime : Ptr[GDateTime]): gint64 = extern

@extern def g_date_time_to_unix_usec(datetime : Ptr[GDateTime]): gint64 = extern

@extern def g_date_time_to_utc(datetime : Ptr[GDateTime]): Ptr[GDateTime] = extern

@extern def g_date_time_unref(datetime : Ptr[GDateTime]): Unit = extern

@extern def g_date_to_struct_tm(date : Ptr[GDate], tm : Ptr[tm]): Unit = extern

@extern def g_date_valid(date : Ptr[GDate]): gboolean = extern

@extern def g_date_valid_day(day : GDateDay): gboolean = extern

@extern def g_date_valid_dmy(day : GDateDay, month : GDateMonth, year : GDateYear): gboolean = extern

@extern def g_date_valid_julian(julian_date : guint32): gboolean = extern

@extern def g_date_valid_month(month : GDateMonth): gboolean = extern

@extern def g_date_valid_weekday(weekday : GDateWeekday): gboolean = extern

@extern def g_date_valid_year(year : GDateYear): gboolean = extern

@extern def g_dcgettext(domain : Ptr[gchar], msgid : Ptr[gchar], category : gint): Ptr[gchar] = extern

@extern def g_dgettext(domain : Ptr[gchar], msgid : Ptr[gchar]): Ptr[gchar] = extern

@extern def g_dir_close(dir : Ptr[GDir]): Unit = extern

@extern def g_dir_make_tmp(tmpl : Ptr[gchar], error : Ptr[Ptr[GError]]): Ptr[gchar] = extern

@extern def g_dir_open(path : Ptr[gchar], flags : guint, error : Ptr[Ptr[GError]]): Ptr[GDir] = extern

@extern def g_dir_read_name(dir : Ptr[GDir]): Ptr[gchar] = extern

@extern def g_dir_ref(dir : Ptr[GDir]): Ptr[GDir] = extern

@extern def g_dir_rewind(dir : Ptr[GDir]): Unit = extern

@extern def g_dir_unref(dir : Ptr[GDir]): Unit = extern

@extern def g_direct_equal(v1 : gconstpointer, v2 : gconstpointer): gboolean = extern

@extern def g_direct_hash(v : gconstpointer): guint = extern

@extern def g_dngettext(domain : Ptr[gchar], msgid : Ptr[gchar], msgid_plural : Ptr[gchar], n : gulong): Ptr[gchar] = extern

@extern def g_double_equal(v1 : gconstpointer, v2 : gconstpointer): gboolean = extern

@extern def g_double_hash(v : gconstpointer): guint = extern

@extern def g_dpgettext(domain : Ptr[gchar], msgctxtid : Ptr[gchar], msgidoffset : gsize): Ptr[gchar] = extern

@extern def g_dpgettext2(domain : Ptr[gchar], context : Ptr[gchar], msgid : Ptr[gchar]): Ptr[gchar] = extern

@extern def g_environ_getenv(envp : Ptr[Ptr[gchar]], variable : Ptr[gchar]): Ptr[gchar] = extern

@extern def g_environ_setenv(envp : Ptr[Ptr[gchar]], variable : Ptr[gchar], value : Ptr[gchar], overwrite : gboolean): Ptr[Ptr[gchar]] = extern

@extern def g_environ_unsetenv(envp : Ptr[Ptr[gchar]], variable : Ptr[gchar]): Ptr[Ptr[gchar]] = extern

@extern def g_error_copy(error : Ptr[GError]): Ptr[GError] = extern

@extern def g_error_domain_register(error_type_name : CString, error_type_private_size : gsize, error_type_init : GErrorInitFunc, error_type_copy : GErrorCopyFunc, error_type_clear : GErrorClearFunc): GQuark = extern

@extern def g_error_domain_register_static(error_type_name : CString, error_type_private_size : gsize, error_type_init : GErrorInitFunc, error_type_copy : GErrorCopyFunc, error_type_clear : GErrorClearFunc): GQuark = extern

@extern def g_error_free(error : Ptr[GError]): Unit = extern

@extern def g_error_matches(error : Ptr[GError], domain : GQuark, code : gint): gboolean = extern

@extern def g_error_new(domain : GQuark, code : gint, format : Ptr[gchar], rest: Any*): Ptr[GError] = extern

@extern def g_error_new_literal(domain : GQuark, code : gint, message : Ptr[gchar]): Ptr[GError] = extern

@extern def g_error_new_valist(domain : GQuark, code : gint, format : Ptr[gchar], args : va_list): Ptr[GError] = extern

@extern def g_file_error_from_errno(err_no : gint): GFileError = extern

@extern def g_file_error_quark(): GQuark = extern

@extern def g_file_get_contents(filename : Ptr[gchar], contents : Ptr[Ptr[gchar]], length : Ptr[gsize], error : Ptr[Ptr[GError]]): gboolean = extern

@extern def g_file_open_tmp(tmpl : Ptr[gchar], name_used : Ptr[Ptr[gchar]], error : Ptr[Ptr[GError]]): gint = extern

@extern def g_file_read_link(filename : Ptr[gchar], error : Ptr[Ptr[GError]]): Ptr[gchar] = extern

@extern def g_file_set_contents(filename : Ptr[gchar], contents : Ptr[gchar], length : gssize, error : Ptr[Ptr[GError]]): gboolean = extern

@extern def g_file_set_contents_full(filename : Ptr[gchar], contents : Ptr[gchar], length : gssize, flags : GFileSetContentsFlags, mode : CInt, error : Ptr[Ptr[GError]]): gboolean = extern

@extern def g_file_test(filename : Ptr[gchar], test : GFileTest): gboolean = extern

@extern def g_filename_display_basename(filename : Ptr[gchar]): Ptr[gchar] = extern

@extern def g_filename_display_name(filename : Ptr[gchar]): Ptr[gchar] = extern

@extern def g_filename_from_uri(uri : Ptr[gchar], hostname : Ptr[Ptr[gchar]], error : Ptr[Ptr[GError]]): Ptr[gchar] = extern

@extern def g_filename_from_utf8(utf8string : Ptr[gchar], len : gssize, bytes_read : Ptr[gsize], bytes_written : Ptr[gsize], error : Ptr[Ptr[GError]]): Ptr[gchar] = extern

@extern def g_filename_to_uri(filename : Ptr[gchar], hostname : Ptr[gchar], error : Ptr[Ptr[GError]]): Ptr[gchar] = extern

@extern def g_filename_to_utf8(opsysstring : Ptr[gchar], len : gssize, bytes_read : Ptr[gsize], bytes_written : Ptr[gsize], error : Ptr[Ptr[GError]]): Ptr[gchar] = extern

@extern def g_find_program_in_path(program : Ptr[gchar]): Ptr[gchar] = extern

@extern def g_format_size(size : guint64): Ptr[gchar] = extern

@extern def g_format_size_for_display(size : goffset): Ptr[gchar] = extern

@extern def g_format_size_full(size : guint64, flags : GFormatSizeFlags): Ptr[gchar] = extern

@extern def g_free(mem : gpointer): Unit = extern

@extern def g_free_sized(mem : gpointer, size : size_t): Unit = extern

@extern def g_get_application_name(): Ptr[gchar] = extern

@extern def g_get_charset(charset : Ptr[CString]): gboolean = extern

@extern def g_get_codeset(): Ptr[gchar] = extern

@extern def g_get_console_charset(charset : Ptr[CString]): gboolean = extern

@extern def g_get_current_dir(): Ptr[gchar] = extern

@extern def g_get_current_time(result : Ptr[GTimeVal]): Unit = extern

@extern def g_get_environ(): Ptr[Ptr[gchar]] = extern

@extern def g_get_filename_charsets(filename_charsets : Ptr[Ptr[Ptr[gchar]]]): gboolean = extern

@extern def g_get_home_dir(): Ptr[gchar] = extern

@extern def g_get_host_name(): Ptr[gchar] = extern

@extern def g_get_language_names(): Ptr[Ptr[gchar]] = extern

@extern def g_get_language_names_with_category(category_name : Ptr[gchar]): Ptr[Ptr[gchar]] = extern

@extern def g_get_locale_variants(locale : Ptr[gchar]): Ptr[Ptr[gchar]] = extern

@extern def g_get_monotonic_time(): gint64 = extern

@extern def g_get_num_processors(): guint = extern

@extern def g_get_os_info(key_name : Ptr[gchar]): Ptr[gchar] = extern

@extern def g_get_prgname(): Ptr[gchar] = extern

@extern def g_get_real_name(): Ptr[gchar] = extern

@extern def g_get_real_time(): gint64 = extern

@extern def g_get_system_config_dirs(): Ptr[Ptr[gchar]] = extern

@extern def g_get_system_data_dirs(): Ptr[Ptr[gchar]] = extern

@extern def g_get_tmp_dir(): Ptr[gchar] = extern

@extern def g_get_user_cache_dir(): Ptr[gchar] = extern

@extern def g_get_user_config_dir(): Ptr[gchar] = extern

@extern def g_get_user_data_dir(): Ptr[gchar] = extern

@extern def g_get_user_name(): Ptr[gchar] = extern

@extern def g_get_user_runtime_dir(): Ptr[gchar] = extern

@extern def g_get_user_special_dir(directory : GUserDirectory): Ptr[gchar] = extern

@extern def g_get_user_state_dir(): Ptr[gchar] = extern

@extern def g_getenv(variable : Ptr[gchar]): Ptr[gchar] = extern

@extern def g_hash_table_add(hash_table : Ptr[GHashTable], key : gpointer): gboolean = extern

@extern def g_hash_table_contains(hash_table : Ptr[GHashTable], key : gconstpointer): gboolean = extern

@extern def g_hash_table_destroy(hash_table : Ptr[GHashTable]): Unit = extern

@extern def g_hash_table_find(hash_table : Ptr[GHashTable], predicate : GHRFunc, user_data : gpointer): gpointer = extern

@extern def g_hash_table_foreach(hash_table : Ptr[GHashTable], func : GHFunc, user_data : gpointer): Unit = extern

@extern def g_hash_table_foreach_remove(hash_table : Ptr[GHashTable], func : GHRFunc, user_data : gpointer): guint = extern

@extern def g_hash_table_foreach_steal(hash_table : Ptr[GHashTable], func : GHRFunc, user_data : gpointer): guint = extern

@extern def g_hash_table_get_keys(hash_table : Ptr[GHashTable]): Ptr[GList] = extern

@extern def g_hash_table_get_keys_as_array(hash_table : Ptr[GHashTable], length : Ptr[guint]): Ptr[gpointer] = extern

@extern def g_hash_table_get_keys_as_ptr_array(hash_table : Ptr[GHashTable]): Ptr[GPtrArray] = extern

@extern def g_hash_table_get_values(hash_table : Ptr[GHashTable]): Ptr[GList] = extern

@extern def g_hash_table_get_values_as_ptr_array(hash_table : Ptr[GHashTable]): Ptr[GPtrArray] = extern

@extern def g_hash_table_insert(hash_table : Ptr[GHashTable], key : gpointer, value : gpointer): gboolean = extern

@extern def g_hash_table_iter_get_hash_table(iter : Ptr[GHashTableIter]): Ptr[GHashTable] = extern

@extern def g_hash_table_iter_init(iter : Ptr[GHashTableIter], hash_table : Ptr[GHashTable]): Unit = extern

@extern def g_hash_table_iter_next(iter : Ptr[GHashTableIter], key : Ptr[gpointer], value : Ptr[gpointer]): gboolean = extern

@extern def g_hash_table_iter_remove(iter : Ptr[GHashTableIter]): Unit = extern

@extern def g_hash_table_iter_replace(iter : Ptr[GHashTableIter], value : gpointer): Unit = extern

@extern def g_hash_table_iter_steal(iter : Ptr[GHashTableIter]): Unit = extern

@extern def g_hash_table_lookup(hash_table : Ptr[GHashTable], key : gconstpointer): gpointer = extern

@extern def g_hash_table_lookup_extended(hash_table : Ptr[GHashTable], lookup_key : gconstpointer, orig_key : Ptr[gpointer], value : Ptr[gpointer]): gboolean = extern

@extern def g_hash_table_new(hash_func : GHashFunc, key_equal_func : GEqualFunc): Ptr[GHashTable] = extern

@extern def g_hash_table_new_full(hash_func : GHashFunc, key_equal_func : GEqualFunc, key_destroy_func : GDestroyNotify, value_destroy_func : GDestroyNotify): Ptr[GHashTable] = extern

@extern def g_hash_table_new_similar(other_hash_table : Ptr[GHashTable]): Ptr[GHashTable] = extern

@extern def g_hash_table_ref(hash_table : Ptr[GHashTable]): Ptr[GHashTable] = extern

@extern def g_hash_table_remove(hash_table : Ptr[GHashTable], key : gconstpointer): gboolean = extern

@extern def g_hash_table_remove_all(hash_table : Ptr[GHashTable]): Unit = extern

@extern def g_hash_table_replace(hash_table : Ptr[GHashTable], key : gpointer, value : gpointer): gboolean = extern

@extern def g_hash_table_size(hash_table : Ptr[GHashTable]): guint = extern

@extern def g_hash_table_steal(hash_table : Ptr[GHashTable], key : gconstpointer): gboolean = extern

@extern def g_hash_table_steal_all(hash_table : Ptr[GHashTable]): Unit = extern

@extern def g_hash_table_steal_all_keys(hash_table : Ptr[GHashTable]): Ptr[GPtrArray] = extern

@extern def g_hash_table_steal_all_values(hash_table : Ptr[GHashTable]): Ptr[GPtrArray] = extern

@extern def g_hash_table_steal_extended(hash_table : Ptr[GHashTable], lookup_key : gconstpointer, stolen_key : Ptr[gpointer], stolen_value : Ptr[gpointer]): gboolean = extern

@extern def g_hash_table_unref(hash_table : Ptr[GHashTable]): Unit = extern

@extern def g_hmac_copy(hmac : Ptr[GHmac]): Ptr[GHmac] = extern

@extern def g_hmac_get_digest(hmac : Ptr[GHmac], buffer : Ptr[guint8], digest_len : Ptr[gsize]): Unit = extern

@extern def g_hmac_get_string(hmac : Ptr[GHmac]): Ptr[gchar] = extern

@extern def g_hmac_new(digest_type : GChecksumType, key : Ptr[guchar], key_len : gsize): Ptr[GHmac] = extern

@extern def g_hmac_ref(hmac : Ptr[GHmac]): Ptr[GHmac] = extern

@extern def g_hmac_unref(hmac : Ptr[GHmac]): Unit = extern

@extern def g_hmac_update(hmac : Ptr[GHmac], data : Ptr[guchar], length : gssize): Unit = extern

@extern def g_hook_alloc(hook_list : Ptr[GHookList]): Ptr[GHook] = extern

@extern def g_hook_compare_ids(new_hook : Ptr[GHook], sibling : Ptr[GHook]): gint = extern

@extern def g_hook_destroy(hook_list : Ptr[GHookList], hook_id : gulong): gboolean = extern

@extern def g_hook_destroy_link(hook_list : Ptr[GHookList], hook : Ptr[GHook]): Unit = extern

@extern def g_hook_find(hook_list : Ptr[GHookList], need_valids : gboolean, func : GHookFindFunc, data : gpointer): Ptr[GHook] = extern

@extern def g_hook_find_data(hook_list : Ptr[GHookList], need_valids : gboolean, data : gpointer): Ptr[GHook] = extern

@extern def g_hook_find_func(hook_list : Ptr[GHookList], need_valids : gboolean, func : gpointer): Ptr[GHook] = extern

@extern def g_hook_find_func_data(hook_list : Ptr[GHookList], need_valids : gboolean, func : gpointer, data : gpointer): Ptr[GHook] = extern

@extern def g_hook_first_valid(hook_list : Ptr[GHookList], may_be_in_call : gboolean): Ptr[GHook] = extern

@extern def g_hook_free(hook_list : Ptr[GHookList], hook : Ptr[GHook]): Unit = extern

@extern def g_hook_get(hook_list : Ptr[GHookList], hook_id : gulong): Ptr[GHook] = extern

@extern def g_hook_insert_before(hook_list : Ptr[GHookList], sibling : Ptr[GHook], hook : Ptr[GHook]): Unit = extern

@extern def g_hook_insert_sorted(hook_list : Ptr[GHookList], hook : Ptr[GHook], func : GHookCompareFunc): Unit = extern

@extern def g_hook_list_clear(hook_list : Ptr[GHookList]): Unit = extern

@extern def g_hook_list_init(hook_list : Ptr[GHookList], hook_size : guint): Unit = extern

@extern def g_hook_list_invoke(hook_list : Ptr[GHookList], may_recurse : gboolean): Unit = extern

@extern def g_hook_list_invoke_check(hook_list : Ptr[GHookList], may_recurse : gboolean): Unit = extern

@extern def g_hook_list_marshal(hook_list : Ptr[GHookList], may_recurse : gboolean, marshaller : GHookMarshaller, marshal_data : gpointer): Unit = extern

@extern def g_hook_list_marshal_check(hook_list : Ptr[GHookList], may_recurse : gboolean, marshaller : GHookCheckMarshaller, marshal_data : gpointer): Unit = extern

@extern def g_hook_next_valid(hook_list : Ptr[GHookList], hook : Ptr[GHook], may_be_in_call : gboolean): Ptr[GHook] = extern

@extern def g_hook_prepend(hook_list : Ptr[GHookList], hook : Ptr[GHook]): Unit = extern

@extern def g_hook_ref(hook_list : Ptr[GHookList], hook : Ptr[GHook]): Ptr[GHook] = extern

@extern def g_hook_unref(hook_list : Ptr[GHookList], hook : Ptr[GHook]): Unit = extern

@extern def g_hostname_is_ascii_encoded(hostname : Ptr[gchar]): gboolean = extern

@extern def g_hostname_is_ip_address(hostname : Ptr[gchar]): gboolean = extern

@extern def g_hostname_is_non_ascii(hostname : Ptr[gchar]): gboolean = extern

@extern def g_hostname_to_ascii(hostname : Ptr[gchar]): Ptr[gchar] = extern

@extern def g_hostname_to_unicode(hostname : Ptr[gchar]): Ptr[gchar] = extern

@extern def g_iconv(converter : GIConv, inbuf : Ptr[Ptr[gchar]], inbytes_left : Ptr[gsize], outbuf : Ptr[Ptr[gchar]], outbytes_left : Ptr[gsize]): gsize = extern

@extern def g_iconv_close(converter : GIConv): gint = extern

@extern def g_iconv_open(to_codeset : Ptr[gchar], from_codeset : Ptr[gchar]): GIConv = extern

@extern def g_idle_add(function : GSourceFunc, data : gpointer): guint = extern

@extern def g_idle_add_full(priority : gint, function : GSourceFunc, data : gpointer, notify : GDestroyNotify): guint = extern

@extern def g_idle_add_once(function : GSourceOnceFunc, data : gpointer): guint = extern

@extern def g_idle_remove_by_data(data : gpointer): gboolean = extern

@extern def g_idle_source_new(): Ptr[GSource] = extern

@extern def g_int64_equal(v1 : gconstpointer, v2 : gconstpointer): gboolean = extern

@extern def g_int64_hash(v : gconstpointer): guint = extern

@extern def g_int_equal(v1 : gconstpointer, v2 : gconstpointer): gboolean = extern

@extern def g_int_hash(v : gconstpointer): guint = extern

@extern def g_intern_static_string(string : Ptr[gchar]): Ptr[gchar] = extern

@extern def g_intern_string(string : Ptr[gchar]): Ptr[gchar] = extern

@extern def g_io_add_watch(channel : Ptr[GIOChannel], condition : GIOCondition, func : GIOFunc, user_data : gpointer): guint = extern

@extern def g_io_add_watch_full(channel : Ptr[GIOChannel], priority : gint, condition : GIOCondition, func : GIOFunc, user_data : gpointer, notify : GDestroyNotify): guint = extern

@extern def g_io_channel_close(channel : Ptr[GIOChannel]): Unit = extern

@extern def g_io_channel_error_from_errno(en : gint): GIOChannelError = extern

@extern def g_io_channel_error_quark(): GQuark = extern

@extern def g_io_channel_flush(channel : Ptr[GIOChannel], error : Ptr[Ptr[GError]]): GIOStatus = extern

@extern def g_io_channel_get_buffer_condition(channel : Ptr[GIOChannel]): GIOCondition = extern

@extern def g_io_channel_get_buffer_size(channel : Ptr[GIOChannel]): gsize = extern

@extern def g_io_channel_get_buffered(channel : Ptr[GIOChannel]): gboolean = extern

@extern def g_io_channel_get_close_on_unref(channel : Ptr[GIOChannel]): gboolean = extern

@extern def g_io_channel_get_encoding(channel : Ptr[GIOChannel]): Ptr[gchar] = extern

@extern def g_io_channel_get_flags(channel : Ptr[GIOChannel]): GIOFlags = extern

@extern def g_io_channel_get_line_term(channel : Ptr[GIOChannel], length : Ptr[gint]): Ptr[gchar] = extern

@extern def g_io_channel_init(channel : Ptr[GIOChannel]): Unit = extern

@extern def g_io_channel_new_file(filename : Ptr[gchar], mode : Ptr[gchar], error : Ptr[Ptr[GError]]): Ptr[GIOChannel] = extern

@extern def g_io_channel_read(channel : Ptr[GIOChannel], buf : Ptr[gchar], count : gsize, bytes_read : Ptr[gsize]): GIOError = extern

@extern def g_io_channel_read_chars(channel : Ptr[GIOChannel], buf : Ptr[gchar], count : gsize, bytes_read : Ptr[gsize], error : Ptr[Ptr[GError]]): GIOStatus = extern

@extern def g_io_channel_read_line(channel : Ptr[GIOChannel], str_return : Ptr[Ptr[gchar]], length : Ptr[gsize], terminator_pos : Ptr[gsize], error : Ptr[Ptr[GError]]): GIOStatus = extern

@extern def g_io_channel_read_line_string(channel : Ptr[GIOChannel], buffer : Ptr[GString], terminator_pos : Ptr[gsize], error : Ptr[Ptr[GError]]): GIOStatus = extern

@extern def g_io_channel_read_to_end(channel : Ptr[GIOChannel], str_return : Ptr[Ptr[gchar]], length : Ptr[gsize], error : Ptr[Ptr[GError]]): GIOStatus = extern

@extern def g_io_channel_read_unichar(channel : Ptr[GIOChannel], thechar : Ptr[gunichar], error : Ptr[Ptr[GError]]): GIOStatus = extern

@extern def g_io_channel_ref(channel : Ptr[GIOChannel]): Ptr[GIOChannel] = extern

@extern def g_io_channel_seek(channel : Ptr[GIOChannel], offset : gint64, `type` : GSeekType): GIOError = extern

@extern def g_io_channel_seek_position(channel : Ptr[GIOChannel], offset : gint64, `type` : GSeekType, error : Ptr[Ptr[GError]]): GIOStatus = extern

@extern def g_io_channel_set_buffer_size(channel : Ptr[GIOChannel], size : gsize): Unit = extern

@extern def g_io_channel_set_buffered(channel : Ptr[GIOChannel], buffered : gboolean): Unit = extern

@extern def g_io_channel_set_close_on_unref(channel : Ptr[GIOChannel], do_close : gboolean): Unit = extern

@extern def g_io_channel_set_encoding(channel : Ptr[GIOChannel], encoding : Ptr[gchar], error : Ptr[Ptr[GError]]): GIOStatus = extern

@extern def g_io_channel_set_flags(channel : Ptr[GIOChannel], flags : GIOFlags, error : Ptr[Ptr[GError]]): GIOStatus = extern

@extern def g_io_channel_set_line_term(channel : Ptr[GIOChannel], line_term : Ptr[gchar], length : gint): Unit = extern

@extern def g_io_channel_shutdown(channel : Ptr[GIOChannel], flush : gboolean, err : Ptr[Ptr[GError]]): GIOStatus = extern

@extern def g_io_channel_unix_get_fd(channel : Ptr[GIOChannel]): gint = extern

@extern def g_io_channel_unix_new(fd : CInt): Ptr[GIOChannel] = extern

@extern def g_io_channel_unref(channel : Ptr[GIOChannel]): Unit = extern

@extern def g_io_channel_write(channel : Ptr[GIOChannel], buf : Ptr[gchar], count : gsize, bytes_written : Ptr[gsize]): GIOError = extern

@extern def g_io_channel_write_chars(channel : Ptr[GIOChannel], buf : Ptr[gchar], count : gssize, bytes_written : Ptr[gsize], error : Ptr[Ptr[GError]]): GIOStatus = extern

@extern def g_io_channel_write_unichar(channel : Ptr[GIOChannel], thechar : gunichar, error : Ptr[Ptr[GError]]): GIOStatus = extern

@extern def g_io_create_watch(channel : Ptr[GIOChannel], condition : GIOCondition): Ptr[GSource] = extern

@extern def g_key_file_error_quark(): GQuark = extern

@extern def g_key_file_free(key_file : Ptr[GKeyFile]): Unit = extern

@extern def g_key_file_get_boolean(key_file : Ptr[GKeyFile], group_name : Ptr[gchar], key : Ptr[gchar], error : Ptr[Ptr[GError]]): gboolean = extern

@extern def g_key_file_get_boolean_list(key_file : Ptr[GKeyFile], group_name : Ptr[gchar], key : Ptr[gchar], length : Ptr[gsize], error : Ptr[Ptr[GError]]): Ptr[gboolean] = extern

@extern def g_key_file_get_comment(key_file : Ptr[GKeyFile], group_name : Ptr[gchar], key : Ptr[gchar], error : Ptr[Ptr[GError]]): Ptr[gchar] = extern

@extern def g_key_file_get_double(key_file : Ptr[GKeyFile], group_name : Ptr[gchar], key : Ptr[gchar], error : Ptr[Ptr[GError]]): gdouble = extern

@extern def g_key_file_get_double_list(key_file : Ptr[GKeyFile], group_name : Ptr[gchar], key : Ptr[gchar], length : Ptr[gsize], error : Ptr[Ptr[GError]]): Ptr[gdouble] = extern

@extern def g_key_file_get_groups(key_file : Ptr[GKeyFile], length : Ptr[gsize]): Ptr[Ptr[gchar]] = extern

@extern def g_key_file_get_int64(key_file : Ptr[GKeyFile], group_name : Ptr[gchar], key : Ptr[gchar], error : Ptr[Ptr[GError]]): gint64 = extern

@extern def g_key_file_get_integer(key_file : Ptr[GKeyFile], group_name : Ptr[gchar], key : Ptr[gchar], error : Ptr[Ptr[GError]]): gint = extern

@extern def g_key_file_get_integer_list(key_file : Ptr[GKeyFile], group_name : Ptr[gchar], key : Ptr[gchar], length : Ptr[gsize], error : Ptr[Ptr[GError]]): Ptr[gint] = extern

@extern def g_key_file_get_keys(key_file : Ptr[GKeyFile], group_name : Ptr[gchar], length : Ptr[gsize], error : Ptr[Ptr[GError]]): Ptr[Ptr[gchar]] = extern

@extern def g_key_file_get_locale_for_key(key_file : Ptr[GKeyFile], group_name : Ptr[gchar], key : Ptr[gchar], locale : Ptr[gchar]): Ptr[gchar] = extern

@extern def g_key_file_get_locale_string(key_file : Ptr[GKeyFile], group_name : Ptr[gchar], key : Ptr[gchar], locale : Ptr[gchar], error : Ptr[Ptr[GError]]): Ptr[gchar] = extern

@extern def g_key_file_get_locale_string_list(key_file : Ptr[GKeyFile], group_name : Ptr[gchar], key : Ptr[gchar], locale : Ptr[gchar], length : Ptr[gsize], error : Ptr[Ptr[GError]]): Ptr[Ptr[gchar]] = extern

@extern def g_key_file_get_start_group(key_file : Ptr[GKeyFile]): Ptr[gchar] = extern

@extern def g_key_file_get_string(key_file : Ptr[GKeyFile], group_name : Ptr[gchar], key : Ptr[gchar], error : Ptr[Ptr[GError]]): Ptr[gchar] = extern

@extern def g_key_file_get_string_list(key_file : Ptr[GKeyFile], group_name : Ptr[gchar], key : Ptr[gchar], length : Ptr[gsize], error : Ptr[Ptr[GError]]): Ptr[Ptr[gchar]] = extern

@extern def g_key_file_get_uint64(key_file : Ptr[GKeyFile], group_name : Ptr[gchar], key : Ptr[gchar], error : Ptr[Ptr[GError]]): guint64 = extern

@extern def g_key_file_get_value(key_file : Ptr[GKeyFile], group_name : Ptr[gchar], key : Ptr[gchar], error : Ptr[Ptr[GError]]): Ptr[gchar] = extern

@extern def g_key_file_has_group(key_file : Ptr[GKeyFile], group_name : Ptr[gchar]): gboolean = extern

@extern def g_key_file_has_key(key_file : Ptr[GKeyFile], group_name : Ptr[gchar], key : Ptr[gchar], error : Ptr[Ptr[GError]]): gboolean = extern

@extern def g_key_file_load_from_bytes(key_file : Ptr[GKeyFile], bytes : Ptr[GBytes], flags : GKeyFileFlags, error : Ptr[Ptr[GError]]): gboolean = extern

@extern def g_key_file_load_from_data(key_file : Ptr[GKeyFile], data : Ptr[gchar], length : gsize, flags : GKeyFileFlags, error : Ptr[Ptr[GError]]): gboolean = extern

@extern def g_key_file_load_from_data_dirs(key_file : Ptr[GKeyFile], file : Ptr[gchar], full_path : Ptr[Ptr[gchar]], flags : GKeyFileFlags, error : Ptr[Ptr[GError]]): gboolean = extern

@extern def g_key_file_load_from_dirs(key_file : Ptr[GKeyFile], file : Ptr[gchar], search_dirs : Ptr[Ptr[gchar]], full_path : Ptr[Ptr[gchar]], flags : GKeyFileFlags, error : Ptr[Ptr[GError]]): gboolean = extern

@extern def g_key_file_load_from_file(key_file : Ptr[GKeyFile], file : Ptr[gchar], flags : GKeyFileFlags, error : Ptr[Ptr[GError]]): gboolean = extern

@extern def g_key_file_new(): Ptr[GKeyFile] = extern

@extern def g_key_file_ref(key_file : Ptr[GKeyFile]): Ptr[GKeyFile] = extern

@extern def g_key_file_remove_comment(key_file : Ptr[GKeyFile], group_name : Ptr[gchar], key : Ptr[gchar], error : Ptr[Ptr[GError]]): gboolean = extern

@extern def g_key_file_remove_group(key_file : Ptr[GKeyFile], group_name : Ptr[gchar], error : Ptr[Ptr[GError]]): gboolean = extern

@extern def g_key_file_remove_key(key_file : Ptr[GKeyFile], group_name : Ptr[gchar], key : Ptr[gchar], error : Ptr[Ptr[GError]]): gboolean = extern

@extern def g_key_file_save_to_file(key_file : Ptr[GKeyFile], filename : Ptr[gchar], error : Ptr[Ptr[GError]]): gboolean = extern

@extern def g_key_file_set_boolean(key_file : Ptr[GKeyFile], group_name : Ptr[gchar], key : Ptr[gchar], value : gboolean): Unit = extern

@extern def g_key_file_set_boolean_list(key_file : Ptr[GKeyFile], group_name : Ptr[gchar], key : Ptr[gchar], list : Ptr[gboolean], length : gsize): Unit = extern

@extern def g_key_file_set_comment(key_file : Ptr[GKeyFile], group_name : Ptr[gchar], key : Ptr[gchar], comment : Ptr[gchar], error : Ptr[Ptr[GError]]): gboolean = extern

@extern def g_key_file_set_double(key_file : Ptr[GKeyFile], group_name : Ptr[gchar], key : Ptr[gchar], value : gdouble): Unit = extern

@extern def g_key_file_set_double_list(key_file : Ptr[GKeyFile], group_name : Ptr[gchar], key : Ptr[gchar], list : Ptr[gdouble], length : gsize): Unit = extern

@extern def g_key_file_set_int64(key_file : Ptr[GKeyFile], group_name : Ptr[gchar], key : Ptr[gchar], value : gint64): Unit = extern

@extern def g_key_file_set_integer(key_file : Ptr[GKeyFile], group_name : Ptr[gchar], key : Ptr[gchar], value : gint): Unit = extern

@extern def g_key_file_set_integer_list(key_file : Ptr[GKeyFile], group_name : Ptr[gchar], key : Ptr[gchar], list : Ptr[gint], length : gsize): Unit = extern

@extern def g_key_file_set_list_separator(key_file : Ptr[GKeyFile], separator : gchar): Unit = extern

@extern def g_key_file_set_locale_string(key_file : Ptr[GKeyFile], group_name : Ptr[gchar], key : Ptr[gchar], locale : Ptr[gchar], string : Ptr[gchar]): Unit = extern

@extern def g_key_file_set_locale_string_list(key_file : Ptr[GKeyFile], group_name : Ptr[gchar], key : Ptr[gchar], locale : Ptr[gchar], list : Ptr[Ptr[gchar]], length : gsize): Unit = extern

@extern def g_key_file_set_string(key_file : Ptr[GKeyFile], group_name : Ptr[gchar], key : Ptr[gchar], string : Ptr[gchar]): Unit = extern

@extern def g_key_file_set_string_list(key_file : Ptr[GKeyFile], group_name : Ptr[gchar], key : Ptr[gchar], list : Ptr[Ptr[gchar]], length : gsize): Unit = extern

@extern def g_key_file_set_uint64(key_file : Ptr[GKeyFile], group_name : Ptr[gchar], key : Ptr[gchar], value : guint64): Unit = extern

@extern def g_key_file_set_value(key_file : Ptr[GKeyFile], group_name : Ptr[gchar], key : Ptr[gchar], value : Ptr[gchar]): Unit = extern

@extern def g_key_file_to_data(key_file : Ptr[GKeyFile], length : Ptr[gsize], error : Ptr[Ptr[GError]]): Ptr[gchar] = extern

@extern def g_key_file_unref(key_file : Ptr[GKeyFile]): Unit = extern

@extern def g_list_alloc(): Ptr[GList] = extern

@extern def g_list_append(list : Ptr[GList], data : gpointer): Ptr[GList] = extern

@extern def g_list_concat(list1 : Ptr[GList], list2 : Ptr[GList]): Ptr[GList] = extern

@extern def g_list_copy(list : Ptr[GList]): Ptr[GList] = extern

@extern def g_list_copy_deep(list : Ptr[GList], func : GCopyFunc, user_data : gpointer): Ptr[GList] = extern

@extern def g_list_delete_link(list : Ptr[GList], `link_` : Ptr[GList]): Ptr[GList] = extern

@extern def g_list_find(list : Ptr[GList], data : gconstpointer): Ptr[GList] = extern

@extern def g_list_find_custom(list : Ptr[GList], data : gconstpointer, func : GCompareFunc): Ptr[GList] = extern

@extern def g_list_first(list : Ptr[GList]): Ptr[GList] = extern

@extern def g_list_foreach(list : Ptr[GList], func : GFunc, user_data : gpointer): Unit = extern

@extern def g_list_free(list : Ptr[GList]): Unit = extern

@extern def g_list_free_1(list : Ptr[GList]): Unit = extern

@extern def g_list_free_full(list : Ptr[GList], free_func : GDestroyNotify): Unit = extern

@extern def g_list_index(list : Ptr[GList], data : gconstpointer): gint = extern

@extern def g_list_insert(list : Ptr[GList], data : gpointer, position : gint): Ptr[GList] = extern

@extern def g_list_insert_before(list : Ptr[GList], sibling : Ptr[GList], data : gpointer): Ptr[GList] = extern

@extern def g_list_insert_before_link(list : Ptr[GList], sibling : Ptr[GList], `link_` : Ptr[GList]): Ptr[GList] = extern

@extern def g_list_insert_sorted(list : Ptr[GList], data : gpointer, func : GCompareFunc): Ptr[GList] = extern

@extern def g_list_insert_sorted_with_data(list : Ptr[GList], data : gpointer, func : GCompareDataFunc, user_data : gpointer): Ptr[GList] = extern

@extern def g_list_last(list : Ptr[GList]): Ptr[GList] = extern

@extern def g_list_length(list : Ptr[GList]): guint = extern

@extern def g_list_nth(list : Ptr[GList], n : guint): Ptr[GList] = extern

@extern def g_list_nth_data(list : Ptr[GList], n : guint): gpointer = extern

@extern def g_list_nth_prev(list : Ptr[GList], n : guint): Ptr[GList] = extern

@extern def g_list_pop_allocator(): Unit = extern

@extern def g_list_position(list : Ptr[GList], llink : Ptr[GList]): gint = extern

@extern def g_list_prepend(list : Ptr[GList], data : gpointer): Ptr[GList] = extern

@extern def g_list_push_allocator(allocator : Ptr[GAllocator]): Unit = extern

@extern def g_list_remove(list : Ptr[GList], data : gconstpointer): Ptr[GList] = extern

@extern def g_list_remove_all(list : Ptr[GList], data : gconstpointer): Ptr[GList] = extern

@extern def g_list_remove_link(list : Ptr[GList], llink : Ptr[GList]): Ptr[GList] = extern

@extern def g_list_reverse(list : Ptr[GList]): Ptr[GList] = extern

@extern def g_list_sort(list : Ptr[GList], compare_func : GCompareFunc): Ptr[GList] = extern

@extern def g_list_sort_with_data(list : Ptr[GList], compare_func : GCompareDataFunc, user_data : gpointer): Ptr[GList] = extern

@extern def g_listenv(): Ptr[Ptr[gchar]] = extern

@extern def g_locale_from_utf8(utf8string : Ptr[gchar], len : gssize, bytes_read : Ptr[gsize], bytes_written : Ptr[gsize], error : Ptr[Ptr[GError]]): Ptr[gchar] = extern

@extern def g_locale_to_utf8(opsysstring : Ptr[gchar], len : gssize, bytes_read : Ptr[gsize], bytes_written : Ptr[gsize], error : Ptr[Ptr[GError]]): Ptr[gchar] = extern

@extern def g_log(log_domain : Ptr[gchar], log_level : GLogLevelFlags, format : Ptr[gchar], rest: Any*): Unit = extern

@extern def g_log_default_handler(log_domain : Ptr[gchar], log_level : GLogLevelFlags, message : Ptr[gchar], unused_data : gpointer): Unit = extern

@extern def g_log_get_debug_enabled(): gboolean = extern

@extern def g_log_remove_handler(log_domain : Ptr[gchar], handler_id : guint): Unit = extern

@extern def g_log_set_always_fatal(fatal_mask : GLogLevelFlags): GLogLevelFlags = extern

@extern def g_log_set_debug_enabled(enabled : gboolean): Unit = extern

@extern def g_log_set_default_handler(log_func : GLogFunc, user_data : gpointer): GLogFunc = extern

@extern def g_log_set_fatal_mask(log_domain : Ptr[gchar], fatal_mask : GLogLevelFlags): GLogLevelFlags = extern

@extern def g_log_set_handler(log_domain : Ptr[gchar], log_levels : GLogLevelFlags, log_func : GLogFunc, user_data : gpointer): guint = extern

@extern def g_log_set_handler_full(log_domain : Ptr[gchar], log_levels : GLogLevelFlags, log_func : GLogFunc, user_data : gpointer, destroy : GDestroyNotify): guint = extern

@extern def g_log_set_writer_func(func : GLogWriterFunc, user_data : gpointer, user_data_free : GDestroyNotify): Unit = extern

@extern def g_log_structured(log_domain : Ptr[gchar], log_level : GLogLevelFlags, rest: Any*): Unit = extern

@extern def g_log_structured_array(log_level : GLogLevelFlags, fields : Ptr[GLogField], n_fields : gsize): Unit = extern

@extern def g_log_structured_standard(log_domain : Ptr[gchar], log_level : GLogLevelFlags, file : Ptr[gchar], line : Ptr[gchar], func : Ptr[gchar], message_format : Ptr[gchar], rest: Any*): Unit = extern

@extern def g_log_variant(log_domain : Ptr[gchar], log_level : GLogLevelFlags, fields : Ptr[GVariant]): Unit = extern

@extern def g_log_writer_default(log_level : GLogLevelFlags, fields : Ptr[GLogField], n_fields : gsize, user_data : gpointer): GLogWriterOutput = extern

@extern def g_log_writer_default_set_debug_domains(domains : Ptr[Ptr[gchar]]): Unit = extern

@extern def g_log_writer_default_set_use_stderr(use_stderr : gboolean): Unit = extern

@extern def g_log_writer_default_would_drop(log_level : GLogLevelFlags, log_domain : CString): gboolean = extern

@extern def g_log_writer_format_fields(log_level : GLogLevelFlags, fields : Ptr[GLogField], n_fields : gsize, use_color : gboolean): Ptr[gchar] = extern

@extern def g_log_writer_is_journald(output_fd : gint): gboolean = extern

@extern def g_log_writer_journald(log_level : GLogLevelFlags, fields : Ptr[GLogField], n_fields : gsize, user_data : gpointer): GLogWriterOutput = extern

@extern def g_log_writer_standard_streams(log_level : GLogLevelFlags, fields : Ptr[GLogField], n_fields : gsize, user_data : gpointer): GLogWriterOutput = extern

@extern def g_log_writer_supports_color(output_fd : gint): gboolean = extern

@extern def g_log_writer_syslog(log_level : GLogLevelFlags, fields : Ptr[GLogField], n_fields : gsize, user_data : gpointer): GLogWriterOutput = extern

@extern def g_logv(log_domain : Ptr[gchar], log_level : GLogLevelFlags, format : Ptr[gchar], args : va_list): Unit = extern

@extern def g_main_context_acquire(context : Ptr[GMainContext]): gboolean = extern

@extern def g_main_context_add_poll(context : Ptr[GMainContext], fd : Ptr[GPollFD], priority : gint): Unit = extern

@extern def g_main_context_check(context : Ptr[GMainContext], max_priority : gint, fds : Ptr[GPollFD], n_fds : gint): gboolean = extern

@extern def g_main_context_default(): Ptr[GMainContext] = extern

@extern def g_main_context_dispatch(context : Ptr[GMainContext]): Unit = extern

@extern def g_main_context_find_source_by_funcs_user_data(context : Ptr[GMainContext], funcs : Ptr[GSourceFuncs], user_data : gpointer): Ptr[GSource] = extern

@extern def g_main_context_find_source_by_id(context : Ptr[GMainContext], source_id : guint): Ptr[GSource] = extern

@extern def g_main_context_find_source_by_user_data(context : Ptr[GMainContext], user_data : gpointer): Ptr[GSource] = extern

@extern def g_main_context_get_poll_func(context : Ptr[GMainContext]): GPollFunc = extern

@extern def g_main_context_get_thread_default(): Ptr[GMainContext] = extern

@extern def g_main_context_invoke(context : Ptr[GMainContext], function : GSourceFunc, data : gpointer): Unit = extern

@extern def g_main_context_invoke_full(context : Ptr[GMainContext], priority : gint, function : GSourceFunc, data : gpointer, notify : GDestroyNotify): Unit = extern

@extern def g_main_context_is_owner(context : Ptr[GMainContext]): gboolean = extern

@extern def g_main_context_iteration(context : Ptr[GMainContext], may_block : gboolean): gboolean = extern

@extern def g_main_context_new(): Ptr[GMainContext] = extern

@extern def g_main_context_new_with_flags(flags : GMainContextFlags): Ptr[GMainContext] = extern

@extern def g_main_context_pending(context : Ptr[GMainContext]): gboolean = extern

@extern def g_main_context_pop_thread_default(context : Ptr[GMainContext]): Unit = extern

@extern def g_main_context_prepare(context : Ptr[GMainContext], priority : Ptr[gint]): gboolean = extern

@extern def g_main_context_push_thread_default(context : Ptr[GMainContext]): Unit = extern

/**
 * g_main_context_pusher_free: : (transfer full): a #GMainContextPusher
*/
@extern def g_main_context_pusher_free(pusher : Ptr[GMainContextPusher]): Unit = extern

/**
 * g_main_context_pusher_new: _context: (transfer none): a main context to push
*/
@extern def g_main_context_pusher_new(main_context : Ptr[GMainContext]): Ptr[GMainContextPusher] = extern

@extern def g_main_context_query(context : Ptr[GMainContext], max_priority : gint, `timeout_` : Ptr[gint], fds : Ptr[GPollFD], n_fds : gint): gint = extern

@extern def g_main_context_ref(context : Ptr[GMainContext]): Ptr[GMainContext] = extern

@extern def g_main_context_ref_thread_default(): Ptr[GMainContext] = extern

@extern def g_main_context_release(context : Ptr[GMainContext]): Unit = extern

@extern def g_main_context_remove_poll(context : Ptr[GMainContext], fd : Ptr[GPollFD]): Unit = extern

@extern def g_main_context_set_poll_func(context : Ptr[GMainContext], func : GPollFunc): Unit = extern

@extern def g_main_context_unref(context : Ptr[GMainContext]): Unit = extern

@extern def g_main_context_wait(context : Ptr[GMainContext], cond : Ptr[GCond], mutex : Ptr[GMutex]): gboolean = extern

@extern def g_main_context_wakeup(context : Ptr[GMainContext]): Unit = extern

@extern def g_main_current_source(): Ptr[GSource] = extern

@extern def g_main_depth(): gint = extern

@extern def g_main_loop_get_context(loop : Ptr[GMainLoop]): Ptr[GMainContext] = extern

@extern def g_main_loop_is_running(loop : Ptr[GMainLoop]): gboolean = extern

@extern def g_main_loop_new(context : Ptr[GMainContext], is_running : gboolean): Ptr[GMainLoop] = extern

@extern def g_main_loop_quit(loop : Ptr[GMainLoop]): Unit = extern

@extern def g_main_loop_ref(loop : Ptr[GMainLoop]): Ptr[GMainLoop] = extern

@extern def g_main_loop_run(loop : Ptr[GMainLoop]): Unit = extern

@extern def g_main_loop_unref(loop : Ptr[GMainLoop]): Unit = extern

@extern def g_malloc(n_bytes : gsize): gpointer = extern

@extern def g_malloc0(n_bytes : gsize): gpointer = extern

@extern def g_malloc0_n(n_blocks : gsize, n_block_bytes : gsize): gpointer = extern

@extern def g_malloc_n(n_blocks : gsize, n_block_bytes : gsize): gpointer = extern

@extern def g_mapped_file_free(file : Ptr[GMappedFile]): Unit = extern

@extern def g_mapped_file_get_bytes(file : Ptr[GMappedFile]): Ptr[GBytes] = extern

@extern def g_mapped_file_get_contents(file : Ptr[GMappedFile]): Ptr[gchar] = extern

@extern def g_mapped_file_get_length(file : Ptr[GMappedFile]): gsize = extern

@extern def g_mapped_file_new(filename : Ptr[gchar], writable : gboolean, error : Ptr[Ptr[GError]]): Ptr[GMappedFile] = extern

@extern def g_mapped_file_new_from_fd(fd : gint, writable : gboolean, error : Ptr[Ptr[GError]]): Ptr[GMappedFile] = extern

@extern def g_mapped_file_ref(file : Ptr[GMappedFile]): Ptr[GMappedFile] = extern

@extern def g_mapped_file_unref(file : Ptr[GMappedFile]): Unit = extern

@extern def g_markup_collect_attributes(element_name : Ptr[gchar], attribute_names : Ptr[Ptr[gchar]], attribute_values : Ptr[Ptr[gchar]], error : Ptr[Ptr[GError]], first_type : GMarkupCollectType, first_attr : Ptr[gchar], rest: Any*): gboolean = extern

@extern def g_markup_error_quark(): GQuark = extern

@extern def g_markup_escape_text(text : Ptr[gchar], length : gssize): Ptr[gchar] = extern

@extern def g_markup_parse_context_end_parse(context : Ptr[GMarkupParseContext], error : Ptr[Ptr[GError]]): gboolean = extern

@extern def g_markup_parse_context_free(context : Ptr[GMarkupParseContext]): Unit = extern

@extern def g_markup_parse_context_get_element(context : Ptr[GMarkupParseContext]): Ptr[gchar] = extern

@extern def g_markup_parse_context_get_element_stack(context : Ptr[GMarkupParseContext]): Ptr[GSList] = extern

@extern def g_markup_parse_context_get_position(context : Ptr[GMarkupParseContext], line_number : Ptr[gint], char_number : Ptr[gint]): Unit = extern

@extern def g_markup_parse_context_get_user_data(context : Ptr[GMarkupParseContext]): gpointer = extern

@extern def g_markup_parse_context_new(parser : Ptr[GMarkupParser], flags : GMarkupParseFlags, user_data : gpointer, user_data_dnotify : GDestroyNotify): Ptr[GMarkupParseContext] = extern

@extern def g_markup_parse_context_parse(context : Ptr[GMarkupParseContext], text : Ptr[gchar], text_len : gssize, error : Ptr[Ptr[GError]]): gboolean = extern

@extern def g_markup_parse_context_pop(context : Ptr[GMarkupParseContext]): gpointer = extern

@extern def g_markup_parse_context_push(context : Ptr[GMarkupParseContext], parser : Ptr[GMarkupParser], user_data : gpointer): Unit = extern

@extern def g_markup_parse_context_ref(context : Ptr[GMarkupParseContext]): Ptr[GMarkupParseContext] = extern

@extern def g_markup_parse_context_unref(context : Ptr[GMarkupParseContext]): Unit = extern

@extern def g_markup_printf_escaped(format : CString, rest: Any*): Ptr[gchar] = extern

@extern def g_markup_vprintf_escaped(format : CString, args : va_list): Ptr[gchar] = extern

@extern def g_match_info_expand_references(match_info : Ptr[GMatchInfo], string_to_expand : Ptr[gchar], error : Ptr[Ptr[GError]]): Ptr[gchar] = extern

@extern def g_match_info_fetch(match_info : Ptr[GMatchInfo], match_num : gint): Ptr[gchar] = extern

@extern def g_match_info_fetch_all(match_info : Ptr[GMatchInfo]): Ptr[Ptr[gchar]] = extern

@extern def g_match_info_fetch_named(match_info : Ptr[GMatchInfo], name : Ptr[gchar]): Ptr[gchar] = extern

@extern def g_match_info_fetch_named_pos(match_info : Ptr[GMatchInfo], name : Ptr[gchar], start_pos : Ptr[gint], end_pos : Ptr[gint]): gboolean = extern

@extern def g_match_info_fetch_pos(match_info : Ptr[GMatchInfo], match_num : gint, start_pos : Ptr[gint], end_pos : Ptr[gint]): gboolean = extern

@extern def g_match_info_free(match_info : Ptr[GMatchInfo]): Unit = extern

@extern def g_match_info_get_match_count(match_info : Ptr[GMatchInfo]): gint = extern

@extern def g_match_info_get_regex(match_info : Ptr[GMatchInfo]): Ptr[GRegex] = extern

@extern def g_match_info_get_string(match_info : Ptr[GMatchInfo]): Ptr[gchar] = extern

@extern def g_match_info_is_partial_match(match_info : Ptr[GMatchInfo]): gboolean = extern

@extern def g_match_info_matches(match_info : Ptr[GMatchInfo]): gboolean = extern

@extern def g_match_info_next(match_info : Ptr[GMatchInfo], error : Ptr[Ptr[GError]]): gboolean = extern

@extern def g_match_info_ref(match_info : Ptr[GMatchInfo]): Ptr[GMatchInfo] = extern

@extern def g_match_info_unref(match_info : Ptr[GMatchInfo]): Unit = extern

@extern def g_mem_chunk_alloc(mem_chunk : Ptr[GMemChunk]): gpointer = extern

@extern def g_mem_chunk_alloc0(mem_chunk : Ptr[GMemChunk]): gpointer = extern

@extern def g_mem_chunk_clean(mem_chunk : Ptr[GMemChunk]): Unit = extern

@extern def g_mem_chunk_destroy(mem_chunk : Ptr[GMemChunk]): Unit = extern

@extern def g_mem_chunk_free(mem_chunk : Ptr[GMemChunk], mem : gpointer): Unit = extern

@extern def g_mem_chunk_info(): Unit = extern

@extern def g_mem_chunk_new(name : Ptr[gchar], atom_size : gint, area_size : gsize, `type` : gint): Ptr[GMemChunk] = extern

@extern def g_mem_chunk_print(mem_chunk : Ptr[GMemChunk]): Unit = extern

@extern def g_mem_chunk_reset(mem_chunk : Ptr[GMemChunk]): Unit = extern

@extern def g_mem_is_system_malloc(): gboolean = extern

@extern def g_mem_profile(): Unit = extern

@extern def g_mem_set_vtable(vtable : Ptr[GMemVTable]): Unit = extern

@extern def g_memdup(mem : gconstpointer, byte_size : guint): gpointer = extern

@extern def g_memdup2(mem : gconstpointer, byte_size : gsize): gpointer = extern

@extern def g_mkdir_with_parents(pathname : Ptr[gchar], mode : gint): gint = extern

@extern def g_mkdtemp(tmpl : Ptr[gchar]): Ptr[gchar] = extern

@extern def g_mkdtemp_full(tmpl : Ptr[gchar], mode : gint): Ptr[gchar] = extern

@extern def g_mkstemp(tmpl : Ptr[gchar]): gint = extern

@extern def g_mkstemp_full(tmpl : Ptr[gchar], flags : gint, mode : gint): gint = extern

@extern def g_mutex_clear(mutex : Ptr[GMutex]): Unit = extern

@extern def g_mutex_free(mutex : Ptr[GMutex]): Unit = extern

@extern def g_mutex_init(mutex : Ptr[GMutex]): Unit = extern

@extern def g_mutex_lock(mutex : Ptr[GMutex]): Unit = extern

/**
 * g_mutex_locker_free: : a GMutexLocker
*/
@extern def g_mutex_locker_free(locker : Ptr[GMutexLocker]): Unit = extern

/**
 * g_mutex_locker_new: : a mutex to lock
*/
@extern def g_mutex_locker_new(mutex : Ptr[GMutex]): Ptr[GMutexLocker] = extern

@extern def g_mutex_new(): Ptr[GMutex] = extern

@extern def g_mutex_trylock(mutex : Ptr[GMutex]): gboolean = extern

@extern def g_mutex_unlock(mutex : Ptr[GMutex]): Unit = extern

@extern def g_node_child_index(node : Ptr[GNode], data : gpointer): gint = extern

@extern def g_node_child_position(node : Ptr[GNode], child : Ptr[GNode]): gint = extern

@extern def g_node_children_foreach(node : Ptr[GNode], flags : GTraverseFlags, func : GNodeForeachFunc, data : gpointer): Unit = extern

@extern def g_node_copy(node : Ptr[GNode]): Ptr[GNode] = extern

@extern def g_node_copy_deep(node : Ptr[GNode], copy_func : GCopyFunc, data : gpointer): Ptr[GNode] = extern

@extern def g_node_depth(node : Ptr[GNode]): guint = extern

@extern def g_node_destroy(root : Ptr[GNode]): Unit = extern

@extern def g_node_find(root : Ptr[GNode], order : GTraverseType, flags : GTraverseFlags, data : gpointer): Ptr[GNode] = extern

@extern def g_node_find_child(node : Ptr[GNode], flags : GTraverseFlags, data : gpointer): Ptr[GNode] = extern

@extern def g_node_first_sibling(node : Ptr[GNode]): Ptr[GNode] = extern

@extern def g_node_get_root(node : Ptr[GNode]): Ptr[GNode] = extern

@extern def g_node_insert(parent : Ptr[GNode], position : gint, node : Ptr[GNode]): Ptr[GNode] = extern

@extern def g_node_insert_after(parent : Ptr[GNode], sibling : Ptr[GNode], node : Ptr[GNode]): Ptr[GNode] = extern

@extern def g_node_insert_before(parent : Ptr[GNode], sibling : Ptr[GNode], node : Ptr[GNode]): Ptr[GNode] = extern

@extern def g_node_is_ancestor(node : Ptr[GNode], descendant : Ptr[GNode]): gboolean = extern

@extern def g_node_last_child(node : Ptr[GNode]): Ptr[GNode] = extern

@extern def g_node_last_sibling(node : Ptr[GNode]): Ptr[GNode] = extern

@extern def g_node_max_height(root : Ptr[GNode]): guint = extern

@extern def g_node_n_children(node : Ptr[GNode]): guint = extern

@extern def g_node_n_nodes(root : Ptr[GNode], flags : GTraverseFlags): guint = extern

@extern def g_node_new(data : gpointer): Ptr[GNode] = extern

@extern def g_node_nth_child(node : Ptr[GNode], n : guint): Ptr[GNode] = extern

@extern def g_node_pop_allocator(): Unit = extern

@extern def g_node_prepend(parent : Ptr[GNode], node : Ptr[GNode]): Ptr[GNode] = extern

@extern def g_node_push_allocator(allocator : Ptr[GAllocator]): Unit = extern

@extern def g_node_reverse_children(node : Ptr[GNode]): Unit = extern

@extern def g_node_traverse(root : Ptr[GNode], order : GTraverseType, flags : GTraverseFlags, max_depth : gint, func : GNodeTraverseFunc, data : gpointer): Unit = extern

@extern def g_node_unlink(node : Ptr[GNode]): Unit = extern

@extern def g_nullify_pointer(nullify_location : Ptr[gpointer]): Unit = extern

@extern def g_number_parser_error_quark(): GQuark = extern

@extern def g_on_error_query(prg_name : Ptr[gchar]): Unit = extern

@extern def g_on_error_stack_trace(prg_name : Ptr[gchar]): Unit = extern

@extern def g_once_impl(once : Ptr[GOnce], func : GThreadFunc, arg : gpointer): gpointer = extern

@extern def g_once_init_enter(location : Ptr[Byte]): gboolean = extern

@extern def g_once_init_enter_impl(location : Ptr[gsize]): gboolean = extern

@extern def g_once_init_enter_pointer(location : Ptr[Byte]): gboolean = extern

@extern def g_once_init_leave(location : Ptr[Byte], result : gsize): Unit = extern

@extern def g_once_init_leave_pointer(location : Ptr[Byte], result : gpointer): Unit = extern

@extern def g_option_context_add_group(context : Ptr[GOptionContext], group : Ptr[GOptionGroup]): Unit = extern

@extern def g_option_context_add_main_entries(context : Ptr[GOptionContext], entries : Ptr[GOptionEntry], translation_domain : Ptr[gchar]): Unit = extern

@extern def g_option_context_free(context : Ptr[GOptionContext]): Unit = extern

@extern def g_option_context_get_description(context : Ptr[GOptionContext]): Ptr[gchar] = extern

@extern def g_option_context_get_help(context : Ptr[GOptionContext], main_help : gboolean, group : Ptr[GOptionGroup]): Ptr[gchar] = extern

@extern def g_option_context_get_help_enabled(context : Ptr[GOptionContext]): gboolean = extern

@extern def g_option_context_get_ignore_unknown_options(context : Ptr[GOptionContext]): gboolean = extern

@extern def g_option_context_get_main_group(context : Ptr[GOptionContext]): Ptr[GOptionGroup] = extern

@extern def g_option_context_get_strict_posix(context : Ptr[GOptionContext]): gboolean = extern

@extern def g_option_context_get_summary(context : Ptr[GOptionContext]): Ptr[gchar] = extern

@extern def g_option_context_new(parameter_string : Ptr[gchar]): Ptr[GOptionContext] = extern

@extern def g_option_context_parse(context : Ptr[GOptionContext], argc : Ptr[gint], argv : Ptr[Ptr[Ptr[gchar]]], error : Ptr[Ptr[GError]]): gboolean = extern

@extern def g_option_context_parse_strv(context : Ptr[GOptionContext], arguments : Ptr[Ptr[Ptr[gchar]]], error : Ptr[Ptr[GError]]): gboolean = extern

@extern def g_option_context_set_description(context : Ptr[GOptionContext], description : Ptr[gchar]): Unit = extern

@extern def g_option_context_set_help_enabled(context : Ptr[GOptionContext], help_enabled : gboolean): Unit = extern

@extern def g_option_context_set_ignore_unknown_options(context : Ptr[GOptionContext], ignore_unknown : gboolean): Unit = extern

@extern def g_option_context_set_main_group(context : Ptr[GOptionContext], group : Ptr[GOptionGroup]): Unit = extern

@extern def g_option_context_set_strict_posix(context : Ptr[GOptionContext], strict_posix : gboolean): Unit = extern

@extern def g_option_context_set_summary(context : Ptr[GOptionContext], summary : Ptr[gchar]): Unit = extern

@extern def g_option_context_set_translate_func(context : Ptr[GOptionContext], func : GTranslateFunc, data : gpointer, destroy_notify : GDestroyNotify): Unit = extern

@extern def g_option_context_set_translation_domain(context : Ptr[GOptionContext], domain : Ptr[gchar]): Unit = extern

@extern def g_option_error_quark(): GQuark = extern

@extern def g_option_group_add_entries(group : Ptr[GOptionGroup], entries : Ptr[GOptionEntry]): Unit = extern

@extern def g_option_group_free(group : Ptr[GOptionGroup]): Unit = extern

@extern def g_option_group_new(name : Ptr[gchar], description : Ptr[gchar], help_description : Ptr[gchar], user_data : gpointer, destroy : GDestroyNotify): Ptr[GOptionGroup] = extern

@extern def g_option_group_ref(group : Ptr[GOptionGroup]): Ptr[GOptionGroup] = extern

@extern def g_option_group_set_error_hook(group : Ptr[GOptionGroup], error_func : GOptionErrorFunc): Unit = extern

@extern def g_option_group_set_parse_hooks(group : Ptr[GOptionGroup], pre_parse_func : GOptionParseFunc, post_parse_func : GOptionParseFunc): Unit = extern

@extern def g_option_group_set_translate_func(group : Ptr[GOptionGroup], func : GTranslateFunc, data : gpointer, destroy_notify : GDestroyNotify): Unit = extern

@extern def g_option_group_set_translation_domain(group : Ptr[GOptionGroup], domain : Ptr[gchar]): Unit = extern

@extern def g_option_group_unref(group : Ptr[GOptionGroup]): Unit = extern

@extern def g_parse_debug_string(string : Ptr[gchar], keys : Ptr[GDebugKey], nkeys : guint): guint = extern

@extern def g_path_buf_clear(buf : Ptr[GPathBuf]): Unit = extern

@extern def g_path_buf_clear_to_path(buf : Ptr[GPathBuf]): CString = extern

@extern def g_path_buf_copy(buf : Ptr[GPathBuf]): Ptr[GPathBuf] = extern

@extern def g_path_buf_equal(v1 : gconstpointer, v2 : gconstpointer): gboolean = extern

@extern def g_path_buf_free(buf : Ptr[GPathBuf]): Unit = extern

@extern def g_path_buf_free_to_path(buf : Ptr[GPathBuf]): CString = extern

@extern def g_path_buf_init(buf : Ptr[GPathBuf]): Ptr[GPathBuf] = extern

@extern def g_path_buf_init_from_path(buf : Ptr[GPathBuf], path : CString): Ptr[GPathBuf] = extern

@extern def g_path_buf_new(): Ptr[GPathBuf] = extern

@extern def g_path_buf_new_from_path(path : CString): Ptr[GPathBuf] = extern

@extern def g_path_buf_pop(buf : Ptr[GPathBuf]): gboolean = extern

@extern def g_path_buf_push(buf : Ptr[GPathBuf], path : CString): Ptr[GPathBuf] = extern

@extern def g_path_buf_set_extension(buf : Ptr[GPathBuf], extension : CString): gboolean = extern

@extern def g_path_buf_set_filename(buf : Ptr[GPathBuf], file_name : CString): gboolean = extern

@extern def g_path_buf_to_path(buf : Ptr[GPathBuf]): CString = extern

@extern def g_path_get_basename(file_name : Ptr[gchar]): Ptr[gchar] = extern

@extern def g_path_get_dirname(file_name : Ptr[gchar]): Ptr[gchar] = extern

@extern def g_path_is_absolute(file_name : Ptr[gchar]): gboolean = extern

@extern def g_path_skip_root(file_name : Ptr[gchar]): Ptr[gchar] = extern

@extern def g_pattern_match(pspec : Ptr[GPatternSpec], string_length : guint, string : Ptr[gchar], string_reversed : Ptr[gchar]): gboolean = extern

@extern def g_pattern_match_simple(pattern : Ptr[gchar], string : Ptr[gchar]): gboolean = extern

@extern def g_pattern_match_string(pspec : Ptr[GPatternSpec], string : Ptr[gchar]): gboolean = extern

@extern def g_pattern_spec_copy(pspec : Ptr[GPatternSpec]): Ptr[GPatternSpec] = extern

@extern def g_pattern_spec_equal(pspec1 : Ptr[GPatternSpec], pspec2 : Ptr[GPatternSpec]): gboolean = extern

@extern def g_pattern_spec_free(pspec : Ptr[GPatternSpec]): Unit = extern

@extern def g_pattern_spec_match(pspec : Ptr[GPatternSpec], string_length : gsize, string : Ptr[gchar], string_reversed : Ptr[gchar]): gboolean = extern

@extern def g_pattern_spec_match_string(pspec : Ptr[GPatternSpec], string : Ptr[gchar]): gboolean = extern

@extern def g_pattern_spec_new(pattern : Ptr[gchar]): Ptr[GPatternSpec] = extern

@extern def g_pointer_bit_lock(address : Ptr[Byte], lock_bit : gint): Unit = extern

@extern def g_pointer_bit_lock_and_get(address : gpointer, lock_bit : guint, out_ptr : Ptr[guintptr]): Unit = extern

@extern def g_pointer_bit_lock_mask_ptr(ptr : gpointer, lock_bit : guint, set : gboolean, preserve_mask : guintptr, preserve_ptr : gpointer): gpointer = extern

@extern def g_pointer_bit_trylock(address : Ptr[Byte], lock_bit : gint): gboolean = extern

@extern def g_pointer_bit_unlock(address : Ptr[Byte], lock_bit : gint): Unit = extern

@extern def g_pointer_bit_unlock_and_set(address : Ptr[Byte], lock_bit : guint, ptr : gpointer, preserve_mask : guintptr): Unit = extern

/**
 * G_POLLFD_FORMAT:
*/
@extern def g_poll(fds : Ptr[GPollFD], nfds : guint, timeout : gint): gint = extern

@extern def g_prefix_error(err : Ptr[Ptr[GError]], format : Ptr[gchar], rest: Any*): Unit = extern

@extern def g_prefix_error_literal(err : Ptr[Ptr[GError]], prefix : Ptr[gchar]): Unit = extern

@extern def g_print(format : Ptr[gchar], rest: Any*): Unit = extern

@extern def g_printerr(format : Ptr[gchar], rest: Any*): Unit = extern

@extern def g_printf_string_upper_bound(format : Ptr[gchar], args : va_list): gsize = extern

@extern def g_private_get(key : Ptr[GPrivate]): gpointer = extern

@extern def g_private_new(notify : GDestroyNotify): Ptr[GPrivate] = extern

@extern def g_private_replace(key : Ptr[GPrivate], value : gpointer): Unit = extern

@extern def g_private_set(key : Ptr[GPrivate], value : gpointer): Unit = extern

@extern def g_propagate_error(dest : Ptr[Ptr[GError]], src : Ptr[GError]): Unit = extern

@extern def g_propagate_prefixed_error(dest : Ptr[Ptr[GError]], src : Ptr[GError], format : Ptr[gchar], rest: Any*): Unit = extern

@extern def g_ptr_array_add(array : Ptr[GPtrArray], data : gpointer): Unit = extern

@extern def g_ptr_array_copy(array : Ptr[GPtrArray], func : GCopyFunc, user_data : gpointer): Ptr[GPtrArray] = extern

@extern def g_ptr_array_extend(array_to_extend : Ptr[GPtrArray], array : Ptr[GPtrArray], func : GCopyFunc, user_data : gpointer): Unit = extern

@extern def g_ptr_array_extend_and_steal(array_to_extend : Ptr[GPtrArray], array : Ptr[GPtrArray]): Unit = extern

@extern def g_ptr_array_find(haystack : Ptr[GPtrArray], needle : gconstpointer, `index_` : Ptr[guint]): gboolean = extern

@extern def g_ptr_array_find_with_equal_func(haystack : Ptr[GPtrArray], needle : gconstpointer, equal_func : GEqualFunc, `index_` : Ptr[guint]): gboolean = extern

@extern def g_ptr_array_foreach(array : Ptr[GPtrArray], func : GFunc, user_data : gpointer): Unit = extern

@extern def g_ptr_array_free(array : Ptr[GPtrArray], free_seg : gboolean): Ptr[gpointer] = extern

@extern def g_ptr_array_insert(array : Ptr[GPtrArray], `index_` : gint, data : gpointer): Unit = extern

@extern def g_ptr_array_is_null_terminated(array : Ptr[GPtrArray]): gboolean = extern

@extern def g_ptr_array_new(): Ptr[GPtrArray] = extern

@extern def g_ptr_array_new_from_array(data : Ptr[gpointer], len : gsize, copy_func : GCopyFunc, copy_func_user_data : gpointer, element_free_func : GDestroyNotify): Ptr[GPtrArray] = extern

@extern def g_ptr_array_new_from_null_terminated_array(data : Ptr[gpointer], copy_func : GCopyFunc, copy_func_user_data : gpointer, element_free_func : GDestroyNotify): Ptr[GPtrArray] = extern

@extern def g_ptr_array_new_full(reserved_size : guint, element_free_func : GDestroyNotify): Ptr[GPtrArray] = extern

@extern def g_ptr_array_new_null_terminated(reserved_size : guint, element_free_func : GDestroyNotify, null_terminated : gboolean): Ptr[GPtrArray] = extern

@extern def g_ptr_array_new_take(data : Ptr[gpointer], len : gsize, element_free_func : GDestroyNotify): Ptr[GPtrArray] = extern

@extern def g_ptr_array_new_take_null_terminated(data : Ptr[gpointer], element_free_func : GDestroyNotify): Ptr[GPtrArray] = extern

@extern def g_ptr_array_new_with_free_func(element_free_func : GDestroyNotify): Ptr[GPtrArray] = extern

@extern def g_ptr_array_ref(array : Ptr[GPtrArray]): Ptr[GPtrArray] = extern

@extern def g_ptr_array_remove(array : Ptr[GPtrArray], data : gpointer): gboolean = extern

@extern def g_ptr_array_remove_fast(array : Ptr[GPtrArray], data : gpointer): gboolean = extern

@extern def g_ptr_array_remove_index(array : Ptr[GPtrArray], `index_` : guint): gpointer = extern

@extern def g_ptr_array_remove_index_fast(array : Ptr[GPtrArray], `index_` : guint): gpointer = extern

@extern def g_ptr_array_remove_range(array : Ptr[GPtrArray], `index_` : guint, length : guint): Ptr[GPtrArray] = extern

@extern def g_ptr_array_set_free_func(array : Ptr[GPtrArray], element_free_func : GDestroyNotify): Unit = extern

@extern def g_ptr_array_set_size(array : Ptr[GPtrArray], length : gint): Unit = extern

@extern def g_ptr_array_sized_new(reserved_size : guint): Ptr[GPtrArray] = extern

@extern def g_ptr_array_sort(array : Ptr[GPtrArray], compare_func : GCompareFunc): Unit = extern

@extern def g_ptr_array_sort_values(array : Ptr[GPtrArray], compare_func : GCompareFunc): Unit = extern

@extern def g_ptr_array_sort_values_with_data(array : Ptr[GPtrArray], compare_func : GCompareDataFunc, user_data : gpointer): Unit = extern

@extern def g_ptr_array_sort_with_data(array : Ptr[GPtrArray], compare_func : GCompareDataFunc, user_data : gpointer): Unit = extern

@extern def g_ptr_array_steal(array : Ptr[GPtrArray], len : Ptr[gsize]): Ptr[gpointer] = extern

@extern def g_ptr_array_steal_index(array : Ptr[GPtrArray], `index_` : guint): gpointer = extern

@extern def g_ptr_array_steal_index_fast(array : Ptr[GPtrArray], `index_` : guint): gpointer = extern

@extern def g_ptr_array_unref(array : Ptr[GPtrArray]): Unit = extern

@extern def g_qsort_with_data(pbase : gconstpointer, total_elems : gint, size : gsize, compare_func : GCompareDataFunc, user_data : gpointer): Unit = extern

@extern def g_quark_from_static_string(string : Ptr[gchar]): GQuark = extern

@extern def g_quark_from_string(string : Ptr[gchar]): GQuark = extern

@extern def g_quark_to_string(quark : GQuark): Ptr[gchar] = extern

@extern def g_quark_try_string(string : Ptr[gchar]): GQuark = extern

@extern def g_queue_clear(queue : Ptr[GQueue]): Unit = extern

@extern def g_queue_clear_full(queue : Ptr[GQueue], free_func : GDestroyNotify): Unit = extern

@extern def g_queue_copy(queue : Ptr[GQueue]): Ptr[GQueue] = extern

@extern def g_queue_delete_link(queue : Ptr[GQueue], `link_` : Ptr[GList]): Unit = extern

@extern def g_queue_find(queue : Ptr[GQueue], data : gconstpointer): Ptr[GList] = extern

@extern def g_queue_find_custom(queue : Ptr[GQueue], data : gconstpointer, func : GCompareFunc): Ptr[GList] = extern

@extern def g_queue_foreach(queue : Ptr[GQueue], func : GFunc, user_data : gpointer): Unit = extern

@extern def g_queue_free(queue : Ptr[GQueue]): Unit = extern

@extern def g_queue_free_full(queue : Ptr[GQueue], free_func : GDestroyNotify): Unit = extern

@extern def g_queue_get_length(queue : Ptr[GQueue]): guint = extern

@extern def g_queue_index(queue : Ptr[GQueue], data : gconstpointer): gint = extern

@extern def g_queue_init(queue : Ptr[GQueue]): Unit = extern

@extern def g_queue_insert_after(queue : Ptr[GQueue], sibling : Ptr[GList], data : gpointer): Unit = extern

@extern def g_queue_insert_after_link(queue : Ptr[GQueue], sibling : Ptr[GList], `link_` : Ptr[GList]): Unit = extern

@extern def g_queue_insert_before(queue : Ptr[GQueue], sibling : Ptr[GList], data : gpointer): Unit = extern

@extern def g_queue_insert_before_link(queue : Ptr[GQueue], sibling : Ptr[GList], `link_` : Ptr[GList]): Unit = extern

@extern def g_queue_insert_sorted(queue : Ptr[GQueue], data : gpointer, func : GCompareDataFunc, user_data : gpointer): Unit = extern

@extern def g_queue_is_empty(queue : Ptr[GQueue]): gboolean = extern

@extern def g_queue_link_index(queue : Ptr[GQueue], `link_` : Ptr[GList]): gint = extern

@extern def g_queue_new(): Ptr[GQueue] = extern

@extern def g_queue_peek_head(queue : Ptr[GQueue]): gpointer = extern

@extern def g_queue_peek_head_link(queue : Ptr[GQueue]): Ptr[GList] = extern

@extern def g_queue_peek_nth(queue : Ptr[GQueue], n : guint): gpointer = extern

@extern def g_queue_peek_nth_link(queue : Ptr[GQueue], n : guint): Ptr[GList] = extern

@extern def g_queue_peek_tail(queue : Ptr[GQueue]): gpointer = extern

@extern def g_queue_peek_tail_link(queue : Ptr[GQueue]): Ptr[GList] = extern

@extern def g_queue_pop_head(queue : Ptr[GQueue]): gpointer = extern

@extern def g_queue_pop_head_link(queue : Ptr[GQueue]): Ptr[GList] = extern

@extern def g_queue_pop_nth(queue : Ptr[GQueue], n : guint): gpointer = extern

@extern def g_queue_pop_nth_link(queue : Ptr[GQueue], n : guint): Ptr[GList] = extern

@extern def g_queue_pop_tail(queue : Ptr[GQueue]): gpointer = extern

@extern def g_queue_pop_tail_link(queue : Ptr[GQueue]): Ptr[GList] = extern

@extern def g_queue_push_head(queue : Ptr[GQueue], data : gpointer): Unit = extern

@extern def g_queue_push_head_link(queue : Ptr[GQueue], `link_` : Ptr[GList]): Unit = extern

@extern def g_queue_push_nth(queue : Ptr[GQueue], data : gpointer, n : gint): Unit = extern

@extern def g_queue_push_nth_link(queue : Ptr[GQueue], n : gint, `link_` : Ptr[GList]): Unit = extern

@extern def g_queue_push_tail(queue : Ptr[GQueue], data : gpointer): Unit = extern

@extern def g_queue_push_tail_link(queue : Ptr[GQueue], `link_` : Ptr[GList]): Unit = extern

@extern def g_queue_remove(queue : Ptr[GQueue], data : gconstpointer): gboolean = extern

@extern def g_queue_remove_all(queue : Ptr[GQueue], data : gconstpointer): guint = extern

@extern def g_queue_reverse(queue : Ptr[GQueue]): Unit = extern

@extern def g_queue_sort(queue : Ptr[GQueue], compare_func : GCompareDataFunc, user_data : gpointer): Unit = extern

@extern def g_queue_unlink(queue : Ptr[GQueue], `link_` : Ptr[GList]): Unit = extern

@extern def g_rand_copy(`rand_` : Ptr[GRand]): Ptr[GRand] = extern

@extern def g_rand_double(`rand_` : Ptr[GRand]): gdouble = extern

@extern def g_rand_double_range(`rand_` : Ptr[GRand], begin : gdouble, end : gdouble): gdouble = extern

@extern def g_rand_free(`rand_` : Ptr[GRand]): Unit = extern

@extern def g_rand_int(`rand_` : Ptr[GRand]): guint32 = extern

@extern def g_rand_int_range(`rand_` : Ptr[GRand], begin : gint32, end : gint32): gint32 = extern

@extern def g_rand_new(): Ptr[GRand] = extern

@extern def g_rand_new_with_seed(seed : guint32): Ptr[GRand] = extern

@extern def g_rand_new_with_seed_array(seed : Ptr[guint32], seed_length : guint): Ptr[GRand] = extern

@extern def g_rand_set_seed(`rand_` : Ptr[GRand], seed : guint32): Unit = extern

@extern def g_rand_set_seed_array(`rand_` : Ptr[GRand], seed : Ptr[guint32], seed_length : guint): Unit = extern

@extern def g_random_double(): gdouble = extern

@extern def g_random_double_range(begin : gdouble, end : gdouble): gdouble = extern

@extern def g_random_int(): guint32 = extern

@extern def g_random_int_range(begin : gint32, end : gint32): gint32 = extern

@extern def g_random_set_seed(seed : guint32): Unit = extern

@extern def g_rc_box_acquire(mem_block : gpointer): gpointer = extern

@extern def g_rc_box_alloc(block_size : gsize): gpointer = extern

@extern def g_rc_box_alloc0(block_size : gsize): gpointer = extern

@extern def g_rc_box_dup(block_size : gsize, mem_block : gconstpointer): gpointer = extern

@extern def g_rc_box_get_size(mem_block : gpointer): gsize = extern

@extern def g_rc_box_release(mem_block : gpointer): Unit = extern

@extern def g_rc_box_release_full(mem_block : gpointer, clear_func : GDestroyNotify): Unit = extern

@extern def g_realloc(mem : gpointer, n_bytes : gsize): gpointer = extern

@extern def g_realloc_n(mem : gpointer, n_blocks : gsize, n_block_bytes : gsize): gpointer = extern

@extern def g_rec_mutex_clear(rec_mutex : Ptr[GRecMutex]): Unit = extern

@extern def g_rec_mutex_init(rec_mutex : Ptr[GRecMutex]): Unit = extern

@extern def g_rec_mutex_lock(rec_mutex : Ptr[GRecMutex]): Unit = extern

/**
 * g_rec_mutex_locker_free: : a GRecMutexLocker
*/
@extern def g_rec_mutex_locker_free(locker : Ptr[GRecMutexLocker]): Unit = extern

/**
 * g_rec_mutex_locker_new: _mutex: a recursive mutex to lock
*/
@extern def g_rec_mutex_locker_new(rec_mutex : Ptr[GRecMutex]): Ptr[GRecMutexLocker] = extern

@extern def g_rec_mutex_trylock(rec_mutex : Ptr[GRecMutex]): gboolean = extern

@extern def g_rec_mutex_unlock(rec_mutex : Ptr[GRecMutex]): Unit = extern

@extern def g_ref_count_compare(rc : Ptr[grefcount], `val` : gint): gboolean = extern

@extern def g_ref_count_dec(rc : Ptr[grefcount]): gboolean = extern

@extern def g_ref_count_inc(rc : Ptr[grefcount]): Unit = extern

@extern def g_ref_count_init(rc : Ptr[grefcount]): Unit = extern

@extern def g_ref_string_acquire(str : CString): CString = extern

@extern def g_ref_string_length(str : CString): gsize = extern

@extern def g_ref_string_new(str : CString): CString = extern

@extern def g_ref_string_new_intern(str : CString): CString = extern

@extern def g_ref_string_new_len(str : CString, len : gssize): CString = extern

@extern def g_ref_string_release(str : CString): Unit = extern

@extern def g_regex_check_replacement(replacement : Ptr[gchar], has_references : Ptr[gboolean], error : Ptr[Ptr[GError]]): gboolean = extern

@extern def g_regex_error_quark(): GQuark = extern

@extern def g_regex_escape_nul(string : Ptr[gchar], length : gint): Ptr[gchar] = extern

@extern def g_regex_escape_string(string : Ptr[gchar], length : gint): Ptr[gchar] = extern

@extern def g_regex_get_capture_count(regex : Ptr[GRegex]): gint = extern

@extern def g_regex_get_compile_flags(regex : Ptr[GRegex]): GRegexCompileFlags = extern

@extern def g_regex_get_has_cr_or_lf(regex : Ptr[GRegex]): gboolean = extern

@extern def g_regex_get_match_flags(regex : Ptr[GRegex]): GRegexMatchFlags = extern

@extern def g_regex_get_max_backref(regex : Ptr[GRegex]): gint = extern

@extern def g_regex_get_max_lookbehind(regex : Ptr[GRegex]): gint = extern

@extern def g_regex_get_pattern(regex : Ptr[GRegex]): Ptr[gchar] = extern

@extern def g_regex_get_string_number(regex : Ptr[GRegex], name : Ptr[gchar]): gint = extern

@extern def g_regex_match(regex : Ptr[GRegex], string : Ptr[gchar], match_options : GRegexMatchFlags, match_info : Ptr[Ptr[GMatchInfo]]): gboolean = extern

@extern def g_regex_match_all(regex : Ptr[GRegex], string : Ptr[gchar], match_options : GRegexMatchFlags, match_info : Ptr[Ptr[GMatchInfo]]): gboolean = extern

@extern def g_regex_match_all_full(regex : Ptr[GRegex], string : Ptr[gchar], string_len : gssize, start_position : gint, match_options : GRegexMatchFlags, match_info : Ptr[Ptr[GMatchInfo]], error : Ptr[Ptr[GError]]): gboolean = extern

@extern def g_regex_match_full(regex : Ptr[GRegex], string : Ptr[gchar], string_len : gssize, start_position : gint, match_options : GRegexMatchFlags, match_info : Ptr[Ptr[GMatchInfo]], error : Ptr[Ptr[GError]]): gboolean = extern

@extern def g_regex_match_simple(pattern : Ptr[gchar], string : Ptr[gchar], compile_options : GRegexCompileFlags, match_options : GRegexMatchFlags): gboolean = extern

@extern def g_regex_new(pattern : Ptr[gchar], compile_options : GRegexCompileFlags, match_options : GRegexMatchFlags, error : Ptr[Ptr[GError]]): Ptr[GRegex] = extern

@extern def g_regex_ref(regex : Ptr[GRegex]): Ptr[GRegex] = extern

@extern def g_regex_replace(regex : Ptr[GRegex], string : Ptr[gchar], string_len : gssize, start_position : gint, replacement : Ptr[gchar], match_options : GRegexMatchFlags, error : Ptr[Ptr[GError]]): Ptr[gchar] = extern

@extern def g_regex_replace_eval(regex : Ptr[GRegex], string : Ptr[gchar], string_len : gssize, start_position : gint, match_options : GRegexMatchFlags, eval : GRegexEvalCallback, user_data : gpointer, error : Ptr[Ptr[GError]]): Ptr[gchar] = extern

@extern def g_regex_replace_literal(regex : Ptr[GRegex], string : Ptr[gchar], string_len : gssize, start_position : gint, replacement : Ptr[gchar], match_options : GRegexMatchFlags, error : Ptr[Ptr[GError]]): Ptr[gchar] = extern

@extern def g_regex_split(regex : Ptr[GRegex], string : Ptr[gchar], match_options : GRegexMatchFlags): Ptr[Ptr[gchar]] = extern

@extern def g_regex_split_full(regex : Ptr[GRegex], string : Ptr[gchar], string_len : gssize, start_position : gint, match_options : GRegexMatchFlags, max_tokens : gint, error : Ptr[Ptr[GError]]): Ptr[Ptr[gchar]] = extern

@extern def g_regex_split_simple(pattern : Ptr[gchar], string : Ptr[gchar], compile_options : GRegexCompileFlags, match_options : GRegexMatchFlags): Ptr[Ptr[gchar]] = extern

@extern def g_regex_unref(regex : Ptr[GRegex]): Unit = extern

@extern def g_relation_count(relation : Ptr[GRelation], key : gconstpointer, field : gint): gint = extern

@extern def g_relation_delete(relation : Ptr[GRelation], key : gconstpointer, field : gint): gint = extern

@extern def g_relation_destroy(relation : Ptr[GRelation]): Unit = extern

@extern def g_relation_exists(relation : Ptr[GRelation], rest: Any*): gboolean = extern

@extern def g_relation_index(relation : Ptr[GRelation], field : gint, hash_func : GHashFunc, key_equal_func : GEqualFunc): Unit = extern

@extern def g_relation_insert(relation : Ptr[GRelation], rest: Any*): Unit = extern

@extern def g_relation_new(fields : gint): Ptr[GRelation] = extern

@extern def g_relation_print(relation : Ptr[GRelation]): Unit = extern

@extern def g_relation_select(relation : Ptr[GRelation], key : gconstpointer, field : gint): Ptr[GTuples] = extern

@extern def g_reload_user_special_dirs_cache(): Unit = extern

@extern def g_return_if_fail_warning(log_domain : CString, pretty_function : CString, expression : CString): Unit = extern

@extern def g_rw_lock_clear(rw_lock : Ptr[GRWLock]): Unit = extern

@extern def g_rw_lock_init(rw_lock : Ptr[GRWLock]): Unit = extern

@extern def g_rw_lock_reader_lock(rw_lock : Ptr[GRWLock]): Unit = extern

/**
 * g_rw_lock_reader_locker_free: : a GRWLockReaderLocker
*/
@extern def g_rw_lock_reader_locker_free(locker : Ptr[GRWLockReaderLocker]): Unit = extern

/**
 * g_rw_lock_reader_locker_new: _lock: a #GRWLock
*/
@extern def g_rw_lock_reader_locker_new(rw_lock : Ptr[GRWLock]): Ptr[GRWLockReaderLocker] = extern

@extern def g_rw_lock_reader_trylock(rw_lock : Ptr[GRWLock]): gboolean = extern

@extern def g_rw_lock_reader_unlock(rw_lock : Ptr[GRWLock]): Unit = extern

@extern def g_rw_lock_writer_lock(rw_lock : Ptr[GRWLock]): Unit = extern

/**
 * g_rw_lock_writer_locker_free: : a GRWLockWriterLocker
*/
@extern def g_rw_lock_writer_locker_free(locker : Ptr[GRWLockWriterLocker]): Unit = extern

/**
 * g_rw_lock_writer_locker_new: _lock: a #GRWLock
*/
@extern def g_rw_lock_writer_locker_new(rw_lock : Ptr[GRWLock]): Ptr[GRWLockWriterLocker] = extern

@extern def g_rw_lock_writer_trylock(rw_lock : Ptr[GRWLock]): gboolean = extern

@extern def g_rw_lock_writer_unlock(rw_lock : Ptr[GRWLock]): Unit = extern

@extern def g_scanner_cur_line(scanner : Ptr[GScanner]): guint = extern

@extern def g_scanner_cur_position(scanner : Ptr[GScanner]): guint = extern

@extern def g_scanner_cur_token(scanner : Ptr[GScanner]): GTokenType = extern

@extern def g_scanner_cur_value(scanner : Ptr[GScanner]): GTokenValue = extern

@extern def g_scanner_destroy(scanner : Ptr[GScanner]): Unit = extern

@extern def g_scanner_eof(scanner : Ptr[GScanner]): gboolean = extern

@extern def g_scanner_error(scanner : Ptr[GScanner], format : Ptr[gchar], rest: Any*): Unit = extern

@extern def g_scanner_get_next_token(scanner : Ptr[GScanner]): GTokenType = extern

@extern def g_scanner_input_file(scanner : Ptr[GScanner], input_fd : gint): Unit = extern

@extern def g_scanner_input_text(scanner : Ptr[GScanner], text : Ptr[gchar], text_len : guint): Unit = extern

@extern def g_scanner_lookup_symbol(scanner : Ptr[GScanner], symbol : Ptr[gchar]): gpointer = extern

@extern def g_scanner_new(config_templ : Ptr[GScannerConfig]): Ptr[GScanner] = extern

@extern def g_scanner_peek_next_token(scanner : Ptr[GScanner]): GTokenType = extern

@extern def g_scanner_scope_add_symbol(scanner : Ptr[GScanner], scope_id : guint, symbol : Ptr[gchar], value : gpointer): Unit = extern

@extern def g_scanner_scope_foreach_symbol(scanner : Ptr[GScanner], scope_id : guint, func : GHFunc, user_data : gpointer): Unit = extern

@extern def g_scanner_scope_lookup_symbol(scanner : Ptr[GScanner], scope_id : guint, symbol : Ptr[gchar]): gpointer = extern

@extern def g_scanner_scope_remove_symbol(scanner : Ptr[GScanner], scope_id : guint, symbol : Ptr[gchar]): Unit = extern

@extern def g_scanner_set_scope(scanner : Ptr[GScanner], scope_id : guint): guint = extern

@extern def g_scanner_sync_file_offset(scanner : Ptr[GScanner]): Unit = extern

@extern def g_scanner_unexp_token(scanner : Ptr[GScanner], expected_token : GTokenType, identifier_spec : Ptr[gchar], symbol_spec : Ptr[gchar], symbol_name : Ptr[gchar], message : Ptr[gchar], is_error : gint): Unit = extern

@extern def g_scanner_warn(scanner : Ptr[GScanner], format : Ptr[gchar], rest: Any*): Unit = extern

@extern def g_sequence_append(seq : Ptr[GSequence], data : gpointer): Ptr[GSequenceIter] = extern

@extern def g_sequence_foreach(seq : Ptr[GSequence], func : GFunc, user_data : gpointer): Unit = extern

@extern def g_sequence_foreach_range(begin : Ptr[GSequenceIter], end : Ptr[GSequenceIter], func : GFunc, user_data : gpointer): Unit = extern

@extern def g_sequence_free(seq : Ptr[GSequence]): Unit = extern

@extern def g_sequence_get(iter : Ptr[GSequenceIter]): gpointer = extern

@extern def g_sequence_get_begin_iter(seq : Ptr[GSequence]): Ptr[GSequenceIter] = extern

@extern def g_sequence_get_end_iter(seq : Ptr[GSequence]): Ptr[GSequenceIter] = extern

@extern def g_sequence_get_iter_at_pos(seq : Ptr[GSequence], pos : gint): Ptr[GSequenceIter] = extern

@extern def g_sequence_get_length(seq : Ptr[GSequence]): gint = extern

@extern def g_sequence_insert_before(iter : Ptr[GSequenceIter], data : gpointer): Ptr[GSequenceIter] = extern

@extern def g_sequence_insert_sorted(seq : Ptr[GSequence], data : gpointer, cmp_func : GCompareDataFunc, cmp_data : gpointer): Ptr[GSequenceIter] = extern

@extern def g_sequence_insert_sorted_iter(seq : Ptr[GSequence], data : gpointer, iter_cmp : GSequenceIterCompareFunc, cmp_data : gpointer): Ptr[GSequenceIter] = extern

@extern def g_sequence_is_empty(seq : Ptr[GSequence]): gboolean = extern

@extern def g_sequence_iter_compare(a : Ptr[GSequenceIter], b : Ptr[GSequenceIter]): gint = extern

@extern def g_sequence_iter_get_position(iter : Ptr[GSequenceIter]): gint = extern

@extern def g_sequence_iter_get_sequence(iter : Ptr[GSequenceIter]): Ptr[GSequence] = extern

@extern def g_sequence_iter_is_begin(iter : Ptr[GSequenceIter]): gboolean = extern

@extern def g_sequence_iter_is_end(iter : Ptr[GSequenceIter]): gboolean = extern

@extern def g_sequence_iter_move(iter : Ptr[GSequenceIter], delta : gint): Ptr[GSequenceIter] = extern

@extern def g_sequence_iter_next(iter : Ptr[GSequenceIter]): Ptr[GSequenceIter] = extern

@extern def g_sequence_iter_prev(iter : Ptr[GSequenceIter]): Ptr[GSequenceIter] = extern

@extern def g_sequence_lookup(seq : Ptr[GSequence], data : gpointer, cmp_func : GCompareDataFunc, cmp_data : gpointer): Ptr[GSequenceIter] = extern

@extern def g_sequence_lookup_iter(seq : Ptr[GSequence], data : gpointer, iter_cmp : GSequenceIterCompareFunc, cmp_data : gpointer): Ptr[GSequenceIter] = extern

@extern def g_sequence_move(src : Ptr[GSequenceIter], dest : Ptr[GSequenceIter]): Unit = extern

@extern def g_sequence_move_range(dest : Ptr[GSequenceIter], begin : Ptr[GSequenceIter], end : Ptr[GSequenceIter]): Unit = extern

@extern def g_sequence_new(data_destroy : GDestroyNotify): Ptr[GSequence] = extern

@extern def g_sequence_prepend(seq : Ptr[GSequence], data : gpointer): Ptr[GSequenceIter] = extern

@extern def g_sequence_range_get_midpoint(begin : Ptr[GSequenceIter], end : Ptr[GSequenceIter]): Ptr[GSequenceIter] = extern

@extern def g_sequence_remove(iter : Ptr[GSequenceIter]): Unit = extern

@extern def g_sequence_remove_range(begin : Ptr[GSequenceIter], end : Ptr[GSequenceIter]): Unit = extern

@extern def g_sequence_search(seq : Ptr[GSequence], data : gpointer, cmp_func : GCompareDataFunc, cmp_data : gpointer): Ptr[GSequenceIter] = extern

@extern def g_sequence_search_iter(seq : Ptr[GSequence], data : gpointer, iter_cmp : GSequenceIterCompareFunc, cmp_data : gpointer): Ptr[GSequenceIter] = extern

@extern def g_sequence_set(iter : Ptr[GSequenceIter], data : gpointer): Unit = extern

@extern def g_sequence_sort(seq : Ptr[GSequence], cmp_func : GCompareDataFunc, cmp_data : gpointer): Unit = extern

@extern def g_sequence_sort_changed(iter : Ptr[GSequenceIter], cmp_func : GCompareDataFunc, cmp_data : gpointer): Unit = extern

@extern def g_sequence_sort_changed_iter(iter : Ptr[GSequenceIter], iter_cmp : GSequenceIterCompareFunc, cmp_data : gpointer): Unit = extern

@extern def g_sequence_sort_iter(seq : Ptr[GSequence], cmp_func : GSequenceIterCompareFunc, cmp_data : gpointer): Unit = extern

@extern def g_sequence_swap(a : Ptr[GSequenceIter], b : Ptr[GSequenceIter]): Unit = extern

@extern def g_set_application_name(application_name : Ptr[gchar]): Unit = extern

@extern def g_set_error(err : Ptr[Ptr[GError]], domain : GQuark, code : gint, format : Ptr[gchar], rest: Any*): Unit = extern

@extern def g_set_error_literal(err : Ptr[Ptr[GError]], domain : GQuark, code : gint, message : Ptr[gchar]): Unit = extern

@extern def g_set_prgname(prgname : Ptr[gchar]): Unit = extern

@extern def g_set_print_handler(func : GPrintFunc): GPrintFunc = extern

@extern def g_set_printerr_handler(func : GPrintFunc): GPrintFunc = extern

/**
 * g_set_str: (skip) _pointer: (inout) (not optional) (nullable): a pointer to either a string or `NULL` _str: (nullable): a string to assign to _pointer
*/
@extern def g_set_str(str_pointer : Ptr[CString], new_str : CString): gboolean = extern

@extern def g_setenv(variable : Ptr[gchar], value : Ptr[gchar], overwrite : gboolean): gboolean = extern

@extern def g_shell_error_quark(): GQuark = extern

@extern def g_shell_parse_argv(command_line : Ptr[gchar], argcp : Ptr[gint], argvp : Ptr[Ptr[Ptr[gchar]]], error : Ptr[Ptr[GError]]): gboolean = extern

@extern def g_shell_quote(unquoted_string : Ptr[gchar]): Ptr[gchar] = extern

@extern def g_shell_unquote(quoted_string : Ptr[gchar], error : Ptr[Ptr[GError]]): Ptr[gchar] = extern

@extern def g_slice_alloc(block_size : gsize): gpointer = extern

@extern def g_slice_alloc0(block_size : gsize): gpointer = extern

@extern def g_slice_copy(block_size : gsize, mem_block : gconstpointer): gpointer = extern

@extern def g_slice_free1(block_size : gsize, mem_block : gpointer): Unit = extern

@extern def g_slice_free_chain_with_offset(block_size : gsize, mem_chain : gpointer, next_offset : gsize): Unit = extern

@extern def g_slice_get_config(ckey : GSliceConfig): gint64 = extern

@extern def g_slice_get_config_state(ckey : GSliceConfig, address : gint64, n_values : Ptr[guint]): Ptr[gint64] = extern

@extern def g_slice_set_config(ckey : GSliceConfig, value : gint64): Unit = extern

@extern def g_slist_alloc(): Ptr[GSList] = extern

@extern def g_slist_append(list : Ptr[GSList], data : gpointer): Ptr[GSList] = extern

@extern def g_slist_concat(list1 : Ptr[GSList], list2 : Ptr[GSList]): Ptr[GSList] = extern

@extern def g_slist_copy(list : Ptr[GSList]): Ptr[GSList] = extern

@extern def g_slist_copy_deep(list : Ptr[GSList], func : GCopyFunc, user_data : gpointer): Ptr[GSList] = extern

@extern def g_slist_delete_link(list : Ptr[GSList], `link_` : Ptr[GSList]): Ptr[GSList] = extern

@extern def g_slist_find(list : Ptr[GSList], data : gconstpointer): Ptr[GSList] = extern

@extern def g_slist_find_custom(list : Ptr[GSList], data : gconstpointer, func : GCompareFunc): Ptr[GSList] = extern

@extern def g_slist_foreach(list : Ptr[GSList], func : GFunc, user_data : gpointer): Unit = extern

@extern def g_slist_free(list : Ptr[GSList]): Unit = extern

@extern def g_slist_free_1(list : Ptr[GSList]): Unit = extern

@extern def g_slist_free_full(list : Ptr[GSList], free_func : GDestroyNotify): Unit = extern

@extern def g_slist_index(list : Ptr[GSList], data : gconstpointer): gint = extern

@extern def g_slist_insert(list : Ptr[GSList], data : gpointer, position : gint): Ptr[GSList] = extern

@extern def g_slist_insert_before(slist : Ptr[GSList], sibling : Ptr[GSList], data : gpointer): Ptr[GSList] = extern

@extern def g_slist_insert_sorted(list : Ptr[GSList], data : gpointer, func : GCompareFunc): Ptr[GSList] = extern

@extern def g_slist_insert_sorted_with_data(list : Ptr[GSList], data : gpointer, func : GCompareDataFunc, user_data : gpointer): Ptr[GSList] = extern

@extern def g_slist_last(list : Ptr[GSList]): Ptr[GSList] = extern

@extern def g_slist_length(list : Ptr[GSList]): guint = extern

@extern def g_slist_nth(list : Ptr[GSList], n : guint): Ptr[GSList] = extern

@extern def g_slist_nth_data(list : Ptr[GSList], n : guint): gpointer = extern

@extern def g_slist_pop_allocator(): Unit = extern

@extern def g_slist_position(list : Ptr[GSList], llink : Ptr[GSList]): gint = extern

@extern def g_slist_prepend(list : Ptr[GSList], data : gpointer): Ptr[GSList] = extern

@extern def g_slist_push_allocator(allocator : Ptr[GAllocator]): Unit = extern

@extern def g_slist_remove(list : Ptr[GSList], data : gconstpointer): Ptr[GSList] = extern

@extern def g_slist_remove_all(list : Ptr[GSList], data : gconstpointer): Ptr[GSList] = extern

@extern def g_slist_remove_link(list : Ptr[GSList], `link_` : Ptr[GSList]): Ptr[GSList] = extern

@extern def g_slist_reverse(list : Ptr[GSList]): Ptr[GSList] = extern

@extern def g_slist_sort(list : Ptr[GSList], compare_func : GCompareFunc): Ptr[GSList] = extern

@extern def g_slist_sort_with_data(list : Ptr[GSList], compare_func : GCompareDataFunc, user_data : gpointer): Ptr[GSList] = extern

@extern def g_snprintf(string : Ptr[gchar], n : gulong, format : Ptr[gchar], rest: Any*): gint = extern

@extern def g_source_add_child_source(source : Ptr[GSource], child_source : Ptr[GSource]): Unit = extern

@extern def g_source_add_poll(source : Ptr[GSource], fd : Ptr[GPollFD]): Unit = extern

@extern def g_source_add_unix_fd(source : Ptr[GSource], fd : gint, events : GIOCondition): gpointer = extern

@extern def g_source_attach(source : Ptr[GSource], context : Ptr[GMainContext]): guint = extern

@extern def g_source_destroy(source : Ptr[GSource]): Unit = extern

@extern def g_source_get_can_recurse(source : Ptr[GSource]): gboolean = extern

@extern def g_source_get_context(source : Ptr[GSource]): Ptr[GMainContext] = extern

@extern def g_source_get_current_time(source : Ptr[GSource], timeval : Ptr[GTimeVal]): Unit = extern

@extern def g_source_get_id(source : Ptr[GSource]): guint = extern

@extern def g_source_get_name(source : Ptr[GSource]): CString = extern

@extern def g_source_get_priority(source : Ptr[GSource]): gint = extern

@extern def g_source_get_ready_time(source : Ptr[GSource]): gint64 = extern

@extern def g_source_get_time(source : Ptr[GSource]): gint64 = extern

@extern def g_source_is_destroyed(source : Ptr[GSource]): gboolean = extern

@extern def g_source_modify_unix_fd(source : Ptr[GSource], tag : gpointer, new_events : GIOCondition): Unit = extern

@extern def g_source_new(source_funcs : Ptr[GSourceFuncs], struct_size : guint): Ptr[GSource] = extern

@extern def g_source_query_unix_fd(source : Ptr[GSource], tag : gpointer): GIOCondition = extern

@extern def g_source_ref(source : Ptr[GSource]): Ptr[GSource] = extern

@extern def g_source_remove(tag : guint): gboolean = extern

@extern def g_source_remove_by_funcs_user_data(funcs : Ptr[GSourceFuncs], user_data : gpointer): gboolean = extern

@extern def g_source_remove_by_user_data(user_data : gpointer): gboolean = extern

@extern def g_source_remove_child_source(source : Ptr[GSource], child_source : Ptr[GSource]): Unit = extern

@extern def g_source_remove_poll(source : Ptr[GSource], fd : Ptr[GPollFD]): Unit = extern

@extern def g_source_remove_unix_fd(source : Ptr[GSource], tag : gpointer): Unit = extern

@extern def g_source_set_callback(source : Ptr[GSource], func : GSourceFunc, data : gpointer, notify : GDestroyNotify): Unit = extern

@extern def g_source_set_callback_indirect(source : Ptr[GSource], callback_data : gpointer, callback_funcs : Ptr[GSourceCallbackFuncs]): Unit = extern

@extern def g_source_set_can_recurse(source : Ptr[GSource], can_recurse : gboolean): Unit = extern

@extern def g_source_set_dispose_function(source : Ptr[GSource], dispose : GSourceDisposeFunc): Unit = extern

@extern def g_source_set_funcs(source : Ptr[GSource], funcs : Ptr[GSourceFuncs]): Unit = extern

@extern def g_source_set_name(source : Ptr[GSource], name : CString): Unit = extern

@extern def g_source_set_name_by_id(tag : guint, name : CString): Unit = extern

@extern def g_source_set_priority(source : Ptr[GSource], priority : gint): Unit = extern

@extern def g_source_set_ready_time(source : Ptr[GSource], ready_time : gint64): Unit = extern

@extern def g_source_set_static_name(source : Ptr[GSource], name : CString): Unit = extern

@extern def g_source_unref(source : Ptr[GSource]): Unit = extern

@extern def g_spaced_primes_closest(num : guint): guint = extern

@extern def g_spawn_async(working_directory : Ptr[gchar], argv : Ptr[Ptr[gchar]], envp : Ptr[Ptr[gchar]], flags : GSpawnFlags, child_setup : GSpawnChildSetupFunc, user_data : gpointer, child_pid : Ptr[GPid], error : Ptr[Ptr[GError]]): gboolean = extern

@extern def g_spawn_async_with_fds(working_directory : Ptr[gchar], argv : Ptr[Ptr[gchar]], envp : Ptr[Ptr[gchar]], flags : GSpawnFlags, child_setup : GSpawnChildSetupFunc, user_data : gpointer, child_pid : Ptr[GPid], stdin_fd : gint, stdout_fd : gint, stderr_fd : gint, error : Ptr[Ptr[GError]]): gboolean = extern

@extern def g_spawn_async_with_pipes(working_directory : Ptr[gchar], argv : Ptr[Ptr[gchar]], envp : Ptr[Ptr[gchar]], flags : GSpawnFlags, child_setup : GSpawnChildSetupFunc, user_data : gpointer, child_pid : Ptr[GPid], standard_input : Ptr[gint], standard_output : Ptr[gint], standard_error : Ptr[gint], error : Ptr[Ptr[GError]]): gboolean = extern

@extern def g_spawn_async_with_pipes_and_fds(working_directory : Ptr[gchar], argv : Ptr[Ptr[gchar]], envp : Ptr[Ptr[gchar]], flags : GSpawnFlags, child_setup : GSpawnChildSetupFunc, user_data : gpointer, stdin_fd : gint, stdout_fd : gint, stderr_fd : gint, source_fds : Ptr[gint], target_fds : Ptr[gint], n_fds : gsize, child_pid_out : Ptr[GPid], stdin_pipe_out : Ptr[gint], stdout_pipe_out : Ptr[gint], stderr_pipe_out : Ptr[gint], error : Ptr[Ptr[GError]]): gboolean = extern

@extern def g_spawn_check_exit_status(wait_status : gint, error : Ptr[Ptr[GError]]): gboolean = extern

@extern def g_spawn_check_wait_status(wait_status : gint, error : Ptr[Ptr[GError]]): gboolean = extern

@extern def g_spawn_close_pid(pid : GPid): Unit = extern

@extern def g_spawn_command_line_async(command_line : Ptr[gchar], error : Ptr[Ptr[GError]]): gboolean = extern

@extern def g_spawn_command_line_sync(command_line : Ptr[gchar], standard_output : Ptr[Ptr[gchar]], standard_error : Ptr[Ptr[gchar]], wait_status : Ptr[gint], error : Ptr[Ptr[GError]]): gboolean = extern

@extern def g_spawn_error_quark(): GQuark = extern

@extern def g_spawn_exit_error_quark(): GQuark = extern

@extern def g_spawn_sync(working_directory : Ptr[gchar], argv : Ptr[Ptr[gchar]], envp : Ptr[Ptr[gchar]], flags : GSpawnFlags, child_setup : GSpawnChildSetupFunc, user_data : gpointer, standard_output : Ptr[Ptr[gchar]], standard_error : Ptr[Ptr[gchar]], wait_status : Ptr[gint], error : Ptr[Ptr[GError]]): gboolean = extern

@extern def g_static_mutex_free(mutex : Ptr[GStaticMutex]): Unit = extern

@extern def g_static_mutex_get_mutex_impl(mutex : Ptr[GStaticMutex]): Ptr[GMutex] = extern

@extern def g_static_mutex_init(mutex : Ptr[GStaticMutex]): Unit = extern

@extern def g_static_private_free(private_key : Ptr[GStaticPrivate]): Unit = extern

@extern def g_static_private_get(private_key : Ptr[GStaticPrivate]): gpointer = extern

@extern def g_static_private_init(private_key : Ptr[GStaticPrivate]): Unit = extern

@extern def g_static_private_set(private_key : Ptr[GStaticPrivate], data : gpointer, notify : GDestroyNotify): Unit = extern

@extern def g_static_rec_mutex_free(mutex : Ptr[GStaticRecMutex]): Unit = extern

@extern def g_static_rec_mutex_init(mutex : Ptr[GStaticRecMutex]): Unit = extern

@extern def g_static_rec_mutex_lock(mutex : Ptr[GStaticRecMutex]): Unit = extern

@extern def g_static_rec_mutex_lock_full(mutex : Ptr[GStaticRecMutex], depth : guint): Unit = extern

@extern def g_static_rec_mutex_trylock(mutex : Ptr[GStaticRecMutex]): gboolean = extern

@extern def g_static_rec_mutex_unlock(mutex : Ptr[GStaticRecMutex]): Unit = extern

@extern def g_static_rec_mutex_unlock_full(mutex : Ptr[GStaticRecMutex]): guint = extern

@extern def g_static_rw_lock_free(lock : Ptr[GStaticRWLock]): Unit = extern

@extern def g_static_rw_lock_init(lock : Ptr[GStaticRWLock]): Unit = extern

@extern def g_static_rw_lock_reader_lock(lock : Ptr[GStaticRWLock]): Unit = extern

@extern def g_static_rw_lock_reader_trylock(lock : Ptr[GStaticRWLock]): gboolean = extern

@extern def g_static_rw_lock_reader_unlock(lock : Ptr[GStaticRWLock]): Unit = extern

@extern def g_static_rw_lock_writer_lock(lock : Ptr[GStaticRWLock]): Unit = extern

@extern def g_static_rw_lock_writer_trylock(lock : Ptr[GStaticRWLock]): gboolean = extern

@extern def g_static_rw_lock_writer_unlock(lock : Ptr[GStaticRWLock]): Unit = extern

@extern def g_steal_fd(fd_ptr : Ptr[CInt]): CInt = extern

/**
 * g_steal_pointer: : (not nullable): a pointer to a pointer
*/
@extern def g_steal_pointer(pp : gpointer): gpointer = extern

@extern def g_stpcpy(dest : Ptr[gchar], src : CString): Ptr[gchar] = extern

@extern def g_str_equal(v1 : gconstpointer, v2 : gconstpointer): gboolean = extern

@extern def g_str_has_prefix(str : Ptr[gchar], prefix : Ptr[gchar]): gboolean = extern

@extern def g_str_has_suffix(str : Ptr[gchar], suffix : Ptr[gchar]): gboolean = extern

@extern def g_str_hash(v : gconstpointer): guint = extern

@extern def g_str_is_ascii(str : Ptr[gchar]): gboolean = extern

@extern def g_str_match_string(search_term : Ptr[gchar], potential_hit : Ptr[gchar], accept_alternates : gboolean): gboolean = extern

@extern def g_str_to_ascii(str : Ptr[gchar], from_locale : Ptr[gchar]): Ptr[gchar] = extern

@extern def g_str_tokenize_and_fold(string : Ptr[gchar], translit_locale : Ptr[gchar], ascii_alternates : Ptr[Ptr[Ptr[gchar]]]): Ptr[Ptr[gchar]] = extern

@extern def g_strcanon(string : Ptr[gchar], valid_chars : Ptr[gchar], substitutor : gchar): Ptr[gchar] = extern

@extern def g_strcasecmp(s1 : Ptr[gchar], s2 : Ptr[gchar]): gint = extern

@extern def g_strchomp(string : Ptr[gchar]): Ptr[gchar] = extern

@extern def g_strchug(string : Ptr[gchar]): Ptr[gchar] = extern

@extern def g_strcmp0(str1 : CString, str2 : CString): CInt = extern

@extern def g_strcompress(source : Ptr[gchar]): Ptr[gchar] = extern

@extern def g_strconcat(string1 : Ptr[gchar], rest: Any*): Ptr[gchar] = extern

@extern def g_strdelimit(string : Ptr[gchar], delimiters : Ptr[gchar], new_delimiter : gchar): Ptr[gchar] = extern

@extern def g_strdown(string : Ptr[gchar]): Ptr[gchar] = extern

@extern def g_strdup(str : Ptr[gchar]): Ptr[gchar] = extern

@extern def g_strdup_inline(str : CString): CString = extern

@extern def g_strdup_printf(format : Ptr[gchar], rest: Any*): Ptr[gchar] = extern

@extern def g_strdup_vprintf(format : Ptr[gchar], args : va_list): Ptr[gchar] = extern

@extern def g_strdupv(str_array : Ptr[Ptr[gchar]]): Ptr[Ptr[gchar]] = extern

@extern def g_strerror(errnum : gint): Ptr[gchar] = extern

@extern def g_strescape(source : Ptr[gchar], exceptions : Ptr[gchar]): Ptr[gchar] = extern

@extern def g_strfreev(str_array : Ptr[Ptr[gchar]]): Unit = extern

@extern def g_string_append(string : Ptr[GString], `val` : Ptr[gchar]): Ptr[GString] = extern

@extern def g_string_append_c(string : Ptr[GString], c : gchar): Ptr[GString] = extern

@extern def g_string_append_c_inline(gstring : Ptr[GString], c : gchar): Ptr[GString] = extern

@extern def g_string_append_len(string : Ptr[GString], `val` : Ptr[gchar], len : gssize): Ptr[GString] = extern

@extern def g_string_append_len_inline(gstring : Ptr[GString], `val` : CString, len : gssize): Ptr[GString] = extern

@extern def g_string_append_printf(string : Ptr[GString], format : Ptr[gchar], rest: Any*): Unit = extern

@extern def g_string_append_unichar(string : Ptr[GString], wc : gunichar): Ptr[GString] = extern

@extern def g_string_append_uri_escaped(string : Ptr[GString], unescaped : Ptr[gchar], reserved_chars_allowed : Ptr[gchar], allow_utf8 : gboolean): Ptr[GString] = extern

@extern def g_string_append_vprintf(string : Ptr[GString], format : Ptr[gchar], args : va_list): Unit = extern

@extern def g_string_ascii_down(string : Ptr[GString]): Ptr[GString] = extern

@extern def g_string_ascii_up(string : Ptr[GString]): Ptr[GString] = extern

@extern def g_string_assign(string : Ptr[GString], rval : Ptr[gchar]): Ptr[GString] = extern

@extern def g_string_chunk_clear(chunk : Ptr[GStringChunk]): Unit = extern

@extern def g_string_chunk_free(chunk : Ptr[GStringChunk]): Unit = extern

@extern def g_string_chunk_insert(chunk : Ptr[GStringChunk], string : Ptr[gchar]): Ptr[gchar] = extern

@extern def g_string_chunk_insert_const(chunk : Ptr[GStringChunk], string : Ptr[gchar]): Ptr[gchar] = extern

@extern def g_string_chunk_insert_len(chunk : Ptr[GStringChunk], string : Ptr[gchar], len : gssize): Ptr[gchar] = extern

@extern def g_string_chunk_new(size : gsize): Ptr[GStringChunk] = extern

@extern def g_string_down(string : Ptr[GString]): Ptr[GString] = extern

@extern def g_string_equal(v : Ptr[GString], v2 : Ptr[GString]): gboolean = extern

@extern def g_string_erase(string : Ptr[GString], pos : gssize, len : gssize): Ptr[GString] = extern

@extern def g_string_free(string : Ptr[GString], free_segment : gboolean): Ptr[gchar] = extern

@extern def g_string_free_and_steal(string : Ptr[GString]): Ptr[gchar] = extern

@extern def g_string_free_to_bytes(string : Ptr[GString]): Ptr[GBytes] = extern

@extern def g_string_hash(str : Ptr[GString]): guint = extern

@extern def g_string_insert(string : Ptr[GString], pos : gssize, `val` : Ptr[gchar]): Ptr[GString] = extern

@extern def g_string_insert_c(string : Ptr[GString], pos : gssize, c : gchar): Ptr[GString] = extern

@extern def g_string_insert_len(string : Ptr[GString], pos : gssize, `val` : Ptr[gchar], len : gssize): Ptr[GString] = extern

@extern def g_string_insert_unichar(string : Ptr[GString], pos : gssize, wc : gunichar): Ptr[GString] = extern

@extern def g_string_new(init : Ptr[gchar]): Ptr[GString] = extern

@extern def g_string_new_len(init : Ptr[gchar], len : gssize): Ptr[GString] = extern

@extern def g_string_new_take(init : Ptr[gchar]): Ptr[GString] = extern

@extern def g_string_overwrite(string : Ptr[GString], pos : gsize, `val` : Ptr[gchar]): Ptr[GString] = extern

@extern def g_string_overwrite_len(string : Ptr[GString], pos : gsize, `val` : Ptr[gchar], len : gssize): Ptr[GString] = extern

@extern def g_string_prepend(string : Ptr[GString], `val` : Ptr[gchar]): Ptr[GString] = extern

@extern def g_string_prepend_c(string : Ptr[GString], c : gchar): Ptr[GString] = extern

@extern def g_string_prepend_len(string : Ptr[GString], `val` : Ptr[gchar], len : gssize): Ptr[GString] = extern

@extern def g_string_prepend_unichar(string : Ptr[GString], wc : gunichar): Ptr[GString] = extern

@extern def g_string_printf(string : Ptr[GString], format : Ptr[gchar], rest: Any*): Unit = extern

@extern def g_string_replace(string : Ptr[GString], find : Ptr[gchar], replace : Ptr[gchar], limit : guint): guint = extern

@extern def g_string_set_size(string : Ptr[GString], len : gsize): Ptr[GString] = extern

@extern def g_string_sized_new(dfl_size : gsize): Ptr[GString] = extern

@extern def g_string_truncate(string : Ptr[GString], len : gsize): Ptr[GString] = extern

@extern def g_string_truncate_inline(gstring : Ptr[GString], len : gsize): Ptr[GString] = extern

@extern def g_string_up(string : Ptr[GString]): Ptr[GString] = extern

@extern def g_string_vprintf(string : Ptr[GString], format : Ptr[gchar], args : va_list): Unit = extern

@extern def g_strip_context(msgid : Ptr[gchar], msgval : Ptr[gchar]): Ptr[gchar] = extern

@extern def g_strjoin(separator : Ptr[gchar], rest: Any*): Ptr[gchar] = extern

@extern def g_strjoinv(separator : Ptr[gchar], str_array : Ptr[Ptr[gchar]]): Ptr[gchar] = extern

@extern def g_strlcat(dest : Ptr[gchar], src : Ptr[gchar], dest_size : gsize): gsize = extern

@extern def g_strlcpy(dest : Ptr[gchar], src : Ptr[gchar], dest_size : gsize): gsize = extern

@extern def g_strncasecmp(s1 : Ptr[gchar], s2 : Ptr[gchar], n : guint): gint = extern

@extern def g_strndup(str : Ptr[gchar], n : gsize): Ptr[gchar] = extern

@extern def g_strnfill(length : gsize, fill_char : gchar): Ptr[gchar] = extern

@extern def g_strreverse(string : Ptr[gchar]): Ptr[gchar] = extern

@extern def g_strrstr(haystack : Ptr[gchar], needle : Ptr[gchar]): Ptr[gchar] = extern

@extern def g_strrstr_len(haystack : Ptr[gchar], haystack_len : gssize, needle : Ptr[gchar]): Ptr[gchar] = extern

@extern def g_strsignal(signum : gint): Ptr[gchar] = extern

@extern def g_strsplit(string : Ptr[gchar], delimiter : Ptr[gchar], max_tokens : gint): Ptr[Ptr[gchar]] = extern

@extern def g_strsplit_set(string : Ptr[gchar], delimiters : Ptr[gchar], max_tokens : gint): Ptr[Ptr[gchar]] = extern

@extern def g_strstr_len(haystack : Ptr[gchar], haystack_len : gssize, needle : Ptr[gchar]): Ptr[gchar] = extern

@extern def g_strtod(nptr : Ptr[gchar], endptr : Ptr[Ptr[gchar]]): gdouble = extern

@extern def g_strup(string : Ptr[gchar]): Ptr[gchar] = extern

@extern def g_strv_builder_add(builder : Ptr[GStrvBuilder], value : CString): Unit = extern

@extern def g_strv_builder_add_many(builder : Ptr[GStrvBuilder], rest: Any*): Unit = extern

@extern def g_strv_builder_addv(builder : Ptr[GStrvBuilder], value : Ptr[CString]): Unit = extern

@extern def g_strv_builder_end(builder : Ptr[GStrvBuilder]): GStrv = extern

@extern def g_strv_builder_new(): Ptr[GStrvBuilder] = extern

@extern def g_strv_builder_ref(builder : Ptr[GStrvBuilder]): Ptr[GStrvBuilder] = extern

@extern def g_strv_builder_take(builder : Ptr[GStrvBuilder], value : CString): Unit = extern

@extern def g_strv_builder_unref(builder : Ptr[GStrvBuilder]): Unit = extern

@extern def g_strv_contains(strv : Ptr[Ptr[gchar]], str : Ptr[gchar]): gboolean = extern

@extern def g_strv_equal(strv1 : Ptr[Ptr[gchar]], strv2 : Ptr[Ptr[gchar]]): gboolean = extern

@extern def g_strv_length(str_array : Ptr[Ptr[gchar]]): guint = extern

@extern def g_test_add_data_func(testpath : CString, test_data : gconstpointer, test_func : GTestDataFunc): Unit = extern

@extern def g_test_add_data_func_full(testpath : CString, test_data : gpointer, test_func : GTestDataFunc, data_free_func : GDestroyNotify): Unit = extern

@extern def g_test_add_func(testpath : CString, test_func : GTestFunc): Unit = extern

@extern def g_test_add_vtable(testpath : CString, data_size : gsize, test_data : gconstpointer, data_setup : GTestFixtureFunc, data_test : GTestFixtureFunc, data_teardown : GTestFixtureFunc): Unit = extern

@extern def g_test_assert_expected_messages_internal(domain : CString, file : CString, line : CInt, func : CString): Unit = extern

@extern def g_test_bug(bug_uri_snippet : CString): Unit = extern

@extern def g_test_bug_base(uri_pattern : CString): Unit = extern

@extern def g_test_build_filename(file_type : GTestFileType, first_path : Ptr[gchar], rest: Any*): Ptr[gchar] = extern

@extern def g_test_case_free(test_case : Ptr[GTestCase]): Unit = extern

@extern def g_test_create_case(test_name : CString, data_size : gsize, test_data : gconstpointer, data_setup : GTestFixtureFunc, data_test : GTestFixtureFunc, data_teardown : GTestFixtureFunc): Ptr[GTestCase] = extern

@extern def g_test_create_suite(suite_name : CString): Ptr[GTestSuite] = extern

@extern def g_test_disable_crash_reporting(): Unit = extern

@extern def g_test_expect_message(log_domain : Ptr[gchar], log_level : GLogLevelFlags, pattern : Ptr[gchar]): Unit = extern

@extern def g_test_fail(): Unit = extern

@extern def g_test_fail_printf(format : CString, rest: Any*): Unit = extern

@extern def g_test_failed(): gboolean = extern

@extern def g_test_get_dir(file_type : GTestFileType): Ptr[gchar] = extern

@extern def g_test_get_filename(file_type : GTestFileType, first_path : Ptr[gchar], rest: Any*): Ptr[gchar] = extern

@extern def g_test_get_path(): CString = extern

@extern def g_test_get_root(): Ptr[GTestSuite] = extern

@extern def g_test_incomplete(msg : Ptr[gchar]): Unit = extern

@extern def g_test_incomplete_printf(format : CString, rest: Any*): Unit = extern

@extern def g_test_init(argc : Ptr[CInt], argv : Ptr[Ptr[CString]], rest: Any*): Unit = extern

@extern def g_test_log_buffer_free(tbuffer : Ptr[GTestLogBuffer]): Unit = extern

@extern def g_test_log_buffer_new(): Ptr[GTestLogBuffer] = extern

@extern def g_test_log_buffer_pop(tbuffer : Ptr[GTestLogBuffer]): Ptr[GTestLogMsg] = extern

@extern def g_test_log_buffer_push(tbuffer : Ptr[GTestLogBuffer], n_bytes : guint, bytes : Ptr[guint8]): Unit = extern

@extern def g_test_log_msg_free(tmsg : Ptr[GTestLogMsg]): Unit = extern

@extern def g_test_log_set_fatal_handler(log_func : GTestLogFatalFunc, user_data : gpointer): Unit = extern

@extern def g_test_log_type_name(log_type : GTestLogType): CString = extern

@extern def g_test_maximized_result(maximized_quantity : Double, format : CString, rest: Any*): Unit = extern

@extern def g_test_message(format : CString, rest: Any*): Unit = extern

@extern def g_test_minimized_result(minimized_quantity : Double, format : CString, rest: Any*): Unit = extern

@extern def g_test_queue_destroy(destroy_func : GDestroyNotify, destroy_data : gpointer): Unit = extern

@extern def g_test_queue_free(gfree_pointer : gpointer): Unit = extern

@extern def g_test_rand_double(): Double = extern

@extern def g_test_rand_double_range(range_start : Double, range_end : Double): Double = extern

@extern def g_test_rand_int(): gint32 = extern

@extern def g_test_rand_int_range(begin : gint32, end : gint32): gint32 = extern

@extern def g_test_run(): CInt = extern

@extern def g_test_run_suite(suite : Ptr[GTestSuite]): CInt = extern

@extern def g_test_set_nonfatal_assertions(): Unit = extern

@extern def g_test_skip(msg : Ptr[gchar]): Unit = extern

@extern def g_test_skip_printf(format : CString, rest: Any*): Unit = extern

@extern def g_test_subprocess(): gboolean = extern

@extern def g_test_suite_add(suite : Ptr[GTestSuite], test_case : Ptr[GTestCase]): Unit = extern

@extern def g_test_suite_add_suite(suite : Ptr[GTestSuite], nestedsuite : Ptr[GTestSuite]): Unit = extern

@extern def g_test_suite_free(suite : Ptr[GTestSuite]): Unit = extern

@extern def g_test_summary(summary : CString): Unit = extern

@extern def g_test_timer_elapsed(): Double = extern

@extern def g_test_timer_last(): Double = extern

@extern def g_test_timer_start(): Unit = extern

@extern def g_test_trap_assertions(domain : CString, file : CString, line : CInt, func : CString, assertion_flags : guint64, pattern : CString): Unit = extern

@extern def g_test_trap_fork(usec_timeout : guint64, test_trap_flags : GTestTrapFlags): gboolean = extern

@extern def g_test_trap_has_passed(): gboolean = extern

@extern def g_test_trap_reached_timeout(): gboolean = extern

@extern def g_test_trap_subprocess(test_path : CString, usec_timeout : guint64, test_flags : GTestSubprocessFlags): Unit = extern

@extern def g_test_trap_subprocess_with_envp(test_path : CString, envp : Ptr[CString], usec_timeout : guint64, test_flags : GTestSubprocessFlags): Unit = extern

@extern def g_thread_create(func : GThreadFunc, data : gpointer, joinable : gboolean, error : Ptr[Ptr[GError]]): Ptr[GThread] = extern

@extern def g_thread_create_full(func : GThreadFunc, data : gpointer, stack_size : gulong, joinable : gboolean, bound : gboolean, priority : GThreadPriority, error : Ptr[Ptr[GError]]): Ptr[GThread] = extern

@extern def g_thread_error_quark(): GQuark = extern

@extern def g_thread_exit(retval : gpointer): Unit = extern

@extern def g_thread_foreach(thread_func : GFunc, user_data : gpointer): Unit = extern

@extern def g_thread_get_initialized(): gboolean = extern

@extern def g_thread_init(vtable : gpointer): Unit = extern

@extern def g_thread_init_with_errorcheck_mutexes(vtable : gpointer): Unit = extern

@extern def g_thread_join(thread : Ptr[GThread]): gpointer = extern

@extern def g_thread_new(name : Ptr[gchar], func : GThreadFunc, data : gpointer): Ptr[GThread] = extern

@extern def g_thread_pool_free(pool : Ptr[GThreadPool], immediate : gboolean, `wait_` : gboolean): Unit = extern

@extern def g_thread_pool_get_max_idle_time(): guint = extern

@extern def g_thread_pool_get_max_threads(pool : Ptr[GThreadPool]): gint = extern

@extern def g_thread_pool_get_max_unused_threads(): gint = extern

@extern def g_thread_pool_get_num_threads(pool : Ptr[GThreadPool]): guint = extern

@extern def g_thread_pool_get_num_unused_threads(): guint = extern

@extern def g_thread_pool_move_to_front(pool : Ptr[GThreadPool], data : gpointer): gboolean = extern

@extern def g_thread_pool_new(func : GFunc, user_data : gpointer, max_threads : gint, exclusive : gboolean, error : Ptr[Ptr[GError]]): Ptr[GThreadPool] = extern

@extern def g_thread_pool_new_full(func : GFunc, user_data : gpointer, item_free_func : GDestroyNotify, max_threads : gint, exclusive : gboolean, error : Ptr[Ptr[GError]]): Ptr[GThreadPool] = extern

@extern def g_thread_pool_push(pool : Ptr[GThreadPool], data : gpointer, error : Ptr[Ptr[GError]]): gboolean = extern

@extern def g_thread_pool_set_max_idle_time(interval : guint): Unit = extern

@extern def g_thread_pool_set_max_threads(pool : Ptr[GThreadPool], max_threads : gint, error : Ptr[Ptr[GError]]): gboolean = extern

@extern def g_thread_pool_set_max_unused_threads(max_threads : gint): Unit = extern

@extern def g_thread_pool_set_sort_function(pool : Ptr[GThreadPool], func : GCompareDataFunc, user_data : gpointer): Unit = extern

@extern def g_thread_pool_stop_unused_threads(): Unit = extern

@extern def g_thread_pool_unprocessed(pool : Ptr[GThreadPool]): guint = extern

@extern def g_thread_ref(thread : Ptr[GThread]): Ptr[GThread] = extern

@extern def g_thread_self(): Ptr[GThread] = extern

@extern def g_thread_set_priority(thread : Ptr[GThread], priority : GThreadPriority): Unit = extern

@extern def g_thread_try_new(name : Ptr[gchar], func : GThreadFunc, data : gpointer, error : Ptr[Ptr[GError]]): Ptr[GThread] = extern

@extern def g_thread_unref(thread : Ptr[GThread]): Unit = extern

@extern def g_thread_yield(): Unit = extern

@extern def g_time_val_add(`time_` : Ptr[GTimeVal], microseconds : glong): Unit = extern

@extern def g_time_val_from_iso8601(iso_date : Ptr[gchar], `time_` : Ptr[GTimeVal]): gboolean = extern

@extern def g_time_val_to_iso8601(`time_` : Ptr[GTimeVal]): Ptr[gchar] = extern

@extern def g_time_zone_adjust_time(tz : Ptr[GTimeZone], `type` : GTimeType, `time_` : Ptr[gint64]): gint = extern

@extern def g_time_zone_find_interval(tz : Ptr[GTimeZone], `type` : GTimeType, `time_` : gint64): gint = extern

@extern def g_time_zone_get_abbreviation(tz : Ptr[GTimeZone], interval : gint): Ptr[gchar] = extern

@extern def g_time_zone_get_identifier(tz : Ptr[GTimeZone]): Ptr[gchar] = extern

@extern def g_time_zone_get_offset(tz : Ptr[GTimeZone], interval : gint): gint32 = extern

@extern def g_time_zone_is_dst(tz : Ptr[GTimeZone], interval : gint): gboolean = extern

@extern def g_time_zone_new(identifier : Ptr[gchar]): Ptr[GTimeZone] = extern

@extern def g_time_zone_new_identifier(identifier : Ptr[gchar]): Ptr[GTimeZone] = extern

@extern def g_time_zone_new_local(): Ptr[GTimeZone] = extern

@extern def g_time_zone_new_offset(seconds : gint32): Ptr[GTimeZone] = extern

@extern def g_time_zone_new_utc(): Ptr[GTimeZone] = extern

@extern def g_time_zone_ref(tz : Ptr[GTimeZone]): Ptr[GTimeZone] = extern

@extern def g_time_zone_unref(tz : Ptr[GTimeZone]): Unit = extern

@extern def g_timeout_add(interval : guint, function : GSourceFunc, data : gpointer): guint = extern

@extern def g_timeout_add_full(priority : gint, interval : guint, function : GSourceFunc, data : gpointer, notify : GDestroyNotify): guint = extern

@extern def g_timeout_add_once(interval : guint, function : GSourceOnceFunc, data : gpointer): guint = extern

@extern def g_timeout_add_seconds(interval : guint, function : GSourceFunc, data : gpointer): guint = extern

@extern def g_timeout_add_seconds_full(priority : gint, interval : guint, function : GSourceFunc, data : gpointer, notify : GDestroyNotify): guint = extern

@extern def g_timeout_add_seconds_once(interval : guint, function : GSourceOnceFunc, data : gpointer): guint = extern

@extern def g_timeout_source_new(interval : guint): Ptr[GSource] = extern

@extern def g_timeout_source_new_seconds(interval : guint): Ptr[GSource] = extern

@extern def g_timer_continue(timer : Ptr[GTimer]): Unit = extern

@extern def g_timer_destroy(timer : Ptr[GTimer]): Unit = extern

@extern def g_timer_elapsed(timer : Ptr[GTimer], microseconds : Ptr[gulong]): gdouble = extern

@extern def g_timer_is_active(timer : Ptr[GTimer]): gboolean = extern

@extern def g_timer_new(): Ptr[GTimer] = extern

@extern def g_timer_reset(timer : Ptr[GTimer]): Unit = extern

@extern def g_timer_start(timer : Ptr[GTimer]): Unit = extern

@extern def g_timer_stop(timer : Ptr[GTimer]): Unit = extern

@extern def g_trash_stack_height(stack_p : Ptr[Ptr[GTrashStack]]): guint = extern

@extern def g_trash_stack_peek(stack_p : Ptr[Ptr[GTrashStack]]): gpointer = extern

@extern def g_trash_stack_pop(stack_p : Ptr[Ptr[GTrashStack]]): gpointer = extern

@extern def g_trash_stack_push(stack_p : Ptr[Ptr[GTrashStack]], data_p : gpointer): Unit = extern

@extern def g_tree_destroy(tree : Ptr[GTree]): Unit = extern

@extern def g_tree_foreach(tree : Ptr[GTree], func : GTraverseFunc, user_data : gpointer): Unit = extern

@extern def g_tree_foreach_node(tree : Ptr[GTree], func : GTraverseNodeFunc, user_data : gpointer): Unit = extern

@extern def g_tree_height(tree : Ptr[GTree]): gint = extern

@extern def g_tree_insert(tree : Ptr[GTree], key : gpointer, value : gpointer): Unit = extern

@extern def g_tree_insert_node(tree : Ptr[GTree], key : gpointer, value : gpointer): Ptr[GTreeNode] = extern

@extern def g_tree_lookup(tree : Ptr[GTree], key : gconstpointer): gpointer = extern

@extern def g_tree_lookup_extended(tree : Ptr[GTree], lookup_key : gconstpointer, orig_key : Ptr[gpointer], value : Ptr[gpointer]): gboolean = extern

@extern def g_tree_lookup_node(tree : Ptr[GTree], key : gconstpointer): Ptr[GTreeNode] = extern

@extern def g_tree_lower_bound(tree : Ptr[GTree], key : gconstpointer): Ptr[GTreeNode] = extern

@extern def g_tree_new(key_compare_func : GCompareFunc): Ptr[GTree] = extern

@extern def g_tree_new_full(key_compare_func : GCompareDataFunc, key_compare_data : gpointer, key_destroy_func : GDestroyNotify, value_destroy_func : GDestroyNotify): Ptr[GTree] = extern

@extern def g_tree_new_with_data(key_compare_func : GCompareDataFunc, key_compare_data : gpointer): Ptr[GTree] = extern

@extern def g_tree_nnodes(tree : Ptr[GTree]): gint = extern

@extern def g_tree_node_first(tree : Ptr[GTree]): Ptr[GTreeNode] = extern

@extern def g_tree_node_key(node : Ptr[GTreeNode]): gpointer = extern

@extern def g_tree_node_last(tree : Ptr[GTree]): Ptr[GTreeNode] = extern

@extern def g_tree_node_next(node : Ptr[GTreeNode]): Ptr[GTreeNode] = extern

@extern def g_tree_node_previous(node : Ptr[GTreeNode]): Ptr[GTreeNode] = extern

@extern def g_tree_node_value(node : Ptr[GTreeNode]): gpointer = extern

@extern def g_tree_ref(tree : Ptr[GTree]): Ptr[GTree] = extern

@extern def g_tree_remove(tree : Ptr[GTree], key : gconstpointer): gboolean = extern

@extern def g_tree_remove_all(tree : Ptr[GTree]): Unit = extern

@extern def g_tree_replace(tree : Ptr[GTree], key : gpointer, value : gpointer): Unit = extern

@extern def g_tree_replace_node(tree : Ptr[GTree], key : gpointer, value : gpointer): Ptr[GTreeNode] = extern

@extern def g_tree_search(tree : Ptr[GTree], search_func : GCompareFunc, user_data : gconstpointer): gpointer = extern

@extern def g_tree_search_node(tree : Ptr[GTree], search_func : GCompareFunc, user_data : gconstpointer): Ptr[GTreeNode] = extern

@extern def g_tree_steal(tree : Ptr[GTree], key : gconstpointer): gboolean = extern

@extern def g_tree_traverse(tree : Ptr[GTree], traverse_func : GTraverseFunc, traverse_type : GTraverseType, user_data : gpointer): Unit = extern

@extern def g_tree_unref(tree : Ptr[GTree]): Unit = extern

@extern def g_tree_upper_bound(tree : Ptr[GTree], key : gconstpointer): Ptr[GTreeNode] = extern

@extern def g_try_malloc(n_bytes : gsize): gpointer = extern

@extern def g_try_malloc0(n_bytes : gsize): gpointer = extern

@extern def g_try_malloc0_n(n_blocks : gsize, n_block_bytes : gsize): gpointer = extern

@extern def g_try_malloc_n(n_blocks : gsize, n_block_bytes : gsize): gpointer = extern

@extern def g_try_realloc(mem : gpointer, n_bytes : gsize): gpointer = extern

@extern def g_try_realloc_n(mem : gpointer, n_blocks : gsize, n_block_bytes : gsize): gpointer = extern

@extern def g_tuples_destroy(tuples : Ptr[GTuples]): Unit = extern

@extern def g_tuples_index(tuples : Ptr[GTuples], `index_` : gint, field : gint): gpointer = extern

@extern def g_ucs4_to_utf16(str : Ptr[gunichar], len : glong, items_read : Ptr[glong], items_written : Ptr[glong], error : Ptr[Ptr[GError]]): Ptr[gunichar2] = extern

@extern def g_ucs4_to_utf8(str : Ptr[gunichar], len : glong, items_read : Ptr[glong], items_written : Ptr[glong], error : Ptr[Ptr[GError]]): Ptr[gchar] = extern

@extern def g_unichar_break_type(c : gunichar): GUnicodeBreakType = extern

@extern def g_unichar_combining_class(uc : gunichar): gint = extern

@extern def g_unichar_compose(a : gunichar, b : gunichar, ch : Ptr[gunichar]): gboolean = extern

@extern def g_unichar_decompose(ch : gunichar, a : Ptr[gunichar], b : Ptr[gunichar]): gboolean = extern

@extern def g_unichar_digit_value(c : gunichar): gint = extern

@extern def g_unichar_fully_decompose(ch : gunichar, compat : gboolean, result : Ptr[gunichar], result_len : gsize): gsize = extern

@extern def g_unichar_get_mirror_char(ch : gunichar, mirrored_ch : Ptr[gunichar]): gboolean = extern

@extern def g_unichar_get_script(ch : gunichar): GUnicodeScript = extern

@extern def g_unichar_isalnum(c : gunichar): gboolean = extern

@extern def g_unichar_isalpha(c : gunichar): gboolean = extern

@extern def g_unichar_iscntrl(c : gunichar): gboolean = extern

@extern def g_unichar_isdefined(c : gunichar): gboolean = extern

@extern def g_unichar_isdigit(c : gunichar): gboolean = extern

@extern def g_unichar_isgraph(c : gunichar): gboolean = extern

@extern def g_unichar_islower(c : gunichar): gboolean = extern

@extern def g_unichar_ismark(c : gunichar): gboolean = extern

@extern def g_unichar_isprint(c : gunichar): gboolean = extern

@extern def g_unichar_ispunct(c : gunichar): gboolean = extern

@extern def g_unichar_isspace(c : gunichar): gboolean = extern

@extern def g_unichar_istitle(c : gunichar): gboolean = extern

@extern def g_unichar_isupper(c : gunichar): gboolean = extern

@extern def g_unichar_iswide(c : gunichar): gboolean = extern

@extern def g_unichar_iswide_cjk(c : gunichar): gboolean = extern

@extern def g_unichar_isxdigit(c : gunichar): gboolean = extern

@extern def g_unichar_iszerowidth(c : gunichar): gboolean = extern

@extern def g_unichar_to_utf8(c : gunichar, outbuf : Ptr[gchar]): gint = extern

@extern def g_unichar_tolower(c : gunichar): gunichar = extern

@extern def g_unichar_totitle(c : gunichar): gunichar = extern

@extern def g_unichar_toupper(c : gunichar): gunichar = extern

@extern def g_unichar_type(c : gunichar): GUnicodeType = extern

@extern def g_unichar_validate(ch : gunichar): gboolean = extern

@extern def g_unichar_xdigit_value(c : gunichar): gint = extern

@extern def g_unicode_canonical_decomposition(ch : gunichar, result_len : Ptr[gsize]): Ptr[gunichar] = extern

@extern def g_unicode_canonical_ordering(string : Ptr[gunichar], len : gsize): Unit = extern

@extern def g_unicode_script_from_iso15924(iso15924 : guint32): GUnicodeScript = extern

@extern def g_unicode_script_to_iso15924(script : GUnicodeScript): guint32 = extern

@extern def g_unsetenv(variable : Ptr[gchar]): Unit = extern

@extern def g_uri_build(flags : GUriFlags, scheme : Ptr[gchar], userinfo : Ptr[gchar], host : Ptr[gchar], port : gint, path : Ptr[gchar], query : Ptr[gchar], fragment : Ptr[gchar]): Ptr[GUri] = extern

@extern def g_uri_build_with_user(flags : GUriFlags, scheme : Ptr[gchar], user : Ptr[gchar], password : Ptr[gchar], auth_params : Ptr[gchar], host : Ptr[gchar], port : gint, path : Ptr[gchar], query : Ptr[gchar], fragment : Ptr[gchar]): Ptr[GUri] = extern

@extern def g_uri_error_quark(): GQuark = extern

@extern def g_uri_escape_bytes(unescaped : Ptr[guint8], length : gsize, reserved_chars_allowed : CString): CString = extern

@extern def g_uri_escape_string(unescaped : CString, reserved_chars_allowed : CString, allow_utf8 : gboolean): CString = extern

@extern def g_uri_get_auth_params(uri : Ptr[GUri]): Ptr[gchar] = extern

@extern def g_uri_get_flags(uri : Ptr[GUri]): GUriFlags = extern

@extern def g_uri_get_fragment(uri : Ptr[GUri]): Ptr[gchar] = extern

@extern def g_uri_get_host(uri : Ptr[GUri]): Ptr[gchar] = extern

@extern def g_uri_get_password(uri : Ptr[GUri]): Ptr[gchar] = extern

@extern def g_uri_get_path(uri : Ptr[GUri]): Ptr[gchar] = extern

@extern def g_uri_get_port(uri : Ptr[GUri]): gint = extern

@extern def g_uri_get_query(uri : Ptr[GUri]): Ptr[gchar] = extern

@extern def g_uri_get_scheme(uri : Ptr[GUri]): Ptr[gchar] = extern

@extern def g_uri_get_user(uri : Ptr[GUri]): Ptr[gchar] = extern

@extern def g_uri_get_userinfo(uri : Ptr[GUri]): Ptr[gchar] = extern

@extern def g_uri_is_valid(uri_string : Ptr[gchar], flags : GUriFlags, error : Ptr[Ptr[GError]]): gboolean = extern

@extern def g_uri_join(flags : GUriFlags, scheme : Ptr[gchar], userinfo : Ptr[gchar], host : Ptr[gchar], port : gint, path : Ptr[gchar], query : Ptr[gchar], fragment : Ptr[gchar]): Ptr[gchar] = extern

@extern def g_uri_join_with_user(flags : GUriFlags, scheme : Ptr[gchar], user : Ptr[gchar], password : Ptr[gchar], auth_params : Ptr[gchar], host : Ptr[gchar], port : gint, path : Ptr[gchar], query : Ptr[gchar], fragment : Ptr[gchar]): Ptr[gchar] = extern

@extern def g_uri_list_extract_uris(uri_list : Ptr[gchar]): Ptr[Ptr[gchar]] = extern

@extern def g_uri_params_iter_init(iter : Ptr[GUriParamsIter], params : Ptr[gchar], length : gssize, separators : Ptr[gchar], flags : GUriParamsFlags): Unit = extern

@extern def g_uri_params_iter_next(iter : Ptr[GUriParamsIter], attribute : Ptr[Ptr[gchar]], value : Ptr[Ptr[gchar]], error : Ptr[Ptr[GError]]): gboolean = extern

@extern def g_uri_parse(uri_string : Ptr[gchar], flags : GUriFlags, error : Ptr[Ptr[GError]]): Ptr[GUri] = extern

@extern def g_uri_parse_params(params : Ptr[gchar], length : gssize, separators : Ptr[gchar], flags : GUriParamsFlags, error : Ptr[Ptr[GError]]): Ptr[GHashTable] = extern

@extern def g_uri_parse_relative(base_uri : Ptr[GUri], uri_ref : Ptr[gchar], flags : GUriFlags, error : Ptr[Ptr[GError]]): Ptr[GUri] = extern

@extern def g_uri_parse_scheme(uri : CString): CString = extern

@extern def g_uri_peek_scheme(uri : CString): CString = extern

@extern def g_uri_ref(uri : Ptr[GUri]): Ptr[GUri] = extern

@extern def g_uri_resolve_relative(base_uri_string : Ptr[gchar], uri_ref : Ptr[gchar], flags : GUriFlags, error : Ptr[Ptr[GError]]): Ptr[gchar] = extern

@extern def g_uri_split(uri_ref : Ptr[gchar], flags : GUriFlags, scheme : Ptr[Ptr[gchar]], userinfo : Ptr[Ptr[gchar]], host : Ptr[Ptr[gchar]], port : Ptr[gint], path : Ptr[Ptr[gchar]], query : Ptr[Ptr[gchar]], fragment : Ptr[Ptr[gchar]], error : Ptr[Ptr[GError]]): gboolean = extern

@extern def g_uri_split_network(uri_string : Ptr[gchar], flags : GUriFlags, scheme : Ptr[Ptr[gchar]], host : Ptr[Ptr[gchar]], port : Ptr[gint], error : Ptr[Ptr[GError]]): gboolean = extern

@extern def g_uri_split_with_user(uri_ref : Ptr[gchar], flags : GUriFlags, scheme : Ptr[Ptr[gchar]], user : Ptr[Ptr[gchar]], password : Ptr[Ptr[gchar]], auth_params : Ptr[Ptr[gchar]], host : Ptr[Ptr[gchar]], port : Ptr[gint], path : Ptr[Ptr[gchar]], query : Ptr[Ptr[gchar]], fragment : Ptr[Ptr[gchar]], error : Ptr[Ptr[GError]]): gboolean = extern

@extern def g_uri_to_string(uri : Ptr[GUri]): CString = extern

@extern def g_uri_to_string_partial(uri : Ptr[GUri], flags : GUriHideFlags): CString = extern

@extern def g_uri_unescape_bytes(escaped_string : CString, length : gssize, illegal_characters : CString, error : Ptr[Ptr[GError]]): Ptr[GBytes] = extern

@extern def g_uri_unescape_segment(escaped_string : CString, escaped_string_end : CString, illegal_characters : CString): CString = extern

@extern def g_uri_unescape_string(escaped_string : CString, illegal_characters : CString): CString = extern

@extern def g_uri_unref(uri : Ptr[GUri]): Unit = extern

@extern def g_usleep(microseconds : gulong): Unit = extern

@extern def g_utf16_to_ucs4(str : Ptr[gunichar2], len : glong, items_read : Ptr[glong], items_written : Ptr[glong], error : Ptr[Ptr[GError]]): Ptr[gunichar] = extern

@extern def g_utf16_to_utf8(str : Ptr[gunichar2], len : glong, items_read : Ptr[glong], items_written : Ptr[glong], error : Ptr[Ptr[GError]]): Ptr[gchar] = extern

@extern def g_utf8_casefold(str : Ptr[gchar], len : gssize): Ptr[gchar] = extern

@extern def g_utf8_collate(str1 : Ptr[gchar], str2 : Ptr[gchar]): gint = extern

@extern def g_utf8_collate_key(str : Ptr[gchar], len : gssize): Ptr[gchar] = extern

@extern def g_utf8_collate_key_for_filename(str : Ptr[gchar], len : gssize): Ptr[gchar] = extern

@extern def g_utf8_find_next_char(p : Ptr[gchar], end : Ptr[gchar]): Ptr[gchar] = extern

@extern def g_utf8_find_prev_char(str : Ptr[gchar], p : Ptr[gchar]): Ptr[gchar] = extern

@extern def g_utf8_get_char(p : Ptr[gchar]): gunichar = extern

@extern def g_utf8_get_char_validated(p : Ptr[gchar], max_len : gssize): gunichar = extern

@extern def g_utf8_make_valid(str : Ptr[gchar], len : gssize): Ptr[gchar] = extern

@extern def g_utf8_normalize(str : Ptr[gchar], len : gssize, mode : GNormalizeMode): Ptr[gchar] = extern

@extern def g_utf8_offset_to_pointer(str : Ptr[gchar], offset : glong): Ptr[gchar] = extern

@extern def g_utf8_pointer_to_offset(str : Ptr[gchar], pos : Ptr[gchar]): glong = extern

@extern def g_utf8_prev_char(p : Ptr[gchar]): Ptr[gchar] = extern

@extern def g_utf8_strchr(p : Ptr[gchar], len : gssize, c : gunichar): Ptr[gchar] = extern

@extern def g_utf8_strdown(str : Ptr[gchar], len : gssize): Ptr[gchar] = extern

@extern def g_utf8_strlen(p : Ptr[gchar], max : gssize): glong = extern

@extern def g_utf8_strncpy(dest : Ptr[gchar], src : Ptr[gchar], n : gsize): Ptr[gchar] = extern

@extern def g_utf8_strrchr(p : Ptr[gchar], len : gssize, c : gunichar): Ptr[gchar] = extern

@extern def g_utf8_strreverse(str : Ptr[gchar], len : gssize): Ptr[gchar] = extern

@extern def g_utf8_strup(str : Ptr[gchar], len : gssize): Ptr[gchar] = extern

@extern def g_utf8_substring(str : Ptr[gchar], start_pos : glong, end_pos : glong): Ptr[gchar] = extern

@extern def g_utf8_to_ucs4(str : Ptr[gchar], len : glong, items_read : Ptr[glong], items_written : Ptr[glong], error : Ptr[Ptr[GError]]): Ptr[gunichar] = extern

@extern def g_utf8_to_ucs4_fast(str : Ptr[gchar], len : glong, items_written : Ptr[glong]): Ptr[gunichar] = extern

@extern def g_utf8_to_utf16(str : Ptr[gchar], len : glong, items_read : Ptr[glong], items_written : Ptr[glong], error : Ptr[Ptr[GError]]): Ptr[gunichar2] = extern

@extern def g_utf8_truncate_middle(string : Ptr[gchar], truncate_length : gsize): Ptr[gchar] = extern

@extern def g_utf8_validate(str : Ptr[gchar], max_len : gssize, end : Ptr[Ptr[gchar]]): gboolean = extern

@extern def g_utf8_validate_len(str : Ptr[gchar], max_len : gsize, end : Ptr[Ptr[gchar]]): gboolean = extern

@extern def g_uuid_string_is_valid(str : Ptr[gchar]): gboolean = extern

@extern def g_uuid_string_random(): Ptr[gchar] = extern

@extern def g_variant_builder_add(builder : Ptr[GVariantBuilder], format_string : Ptr[gchar], rest: Any*): Unit = extern

@extern def g_variant_builder_add_parsed(builder : Ptr[GVariantBuilder], format : Ptr[gchar], rest: Any*): Unit = extern

@extern def g_variant_builder_add_value(builder : Ptr[GVariantBuilder], value : Ptr[GVariant]): Unit = extern

@extern def g_variant_builder_clear(builder : Ptr[GVariantBuilder]): Unit = extern

@extern def g_variant_builder_close(builder : Ptr[GVariantBuilder]): Unit = extern

@extern def g_variant_builder_end(builder : Ptr[GVariantBuilder]): Ptr[GVariant] = extern

@extern def g_variant_builder_init(builder : Ptr[GVariantBuilder], `type` : Ptr[GVariantType]): Unit = extern

@extern def g_variant_builder_new(`type` : Ptr[GVariantType]): Ptr[GVariantBuilder] = extern

@extern def g_variant_builder_open(builder : Ptr[GVariantBuilder], `type` : Ptr[GVariantType]): Unit = extern

@extern def g_variant_builder_ref(builder : Ptr[GVariantBuilder]): Ptr[GVariantBuilder] = extern

@extern def g_variant_builder_unref(builder : Ptr[GVariantBuilder]): Unit = extern

@extern def g_variant_byteswap(value : Ptr[GVariant]): Ptr[GVariant] = extern

@extern def g_variant_check_format_string(value : Ptr[GVariant], format_string : Ptr[gchar], copy_only : gboolean): gboolean = extern

@extern def g_variant_classify(value : Ptr[GVariant]): GVariantClass = extern

@extern def g_variant_compare(one : gconstpointer, two : gconstpointer): gint = extern

@extern def g_variant_dict_clear(dict : Ptr[GVariantDict]): Unit = extern

@extern def g_variant_dict_contains(dict : Ptr[GVariantDict], key : Ptr[gchar]): gboolean = extern

@extern def g_variant_dict_end(dict : Ptr[GVariantDict]): Ptr[GVariant] = extern

@extern def g_variant_dict_init(dict : Ptr[GVariantDict], from_asv : Ptr[GVariant]): Unit = extern

@extern def g_variant_dict_insert(dict : Ptr[GVariantDict], key : Ptr[gchar], format_string : Ptr[gchar], rest: Any*): Unit = extern

@extern def g_variant_dict_insert_value(dict : Ptr[GVariantDict], key : Ptr[gchar], value : Ptr[GVariant]): Unit = extern

@extern def g_variant_dict_lookup(dict : Ptr[GVariantDict], key : Ptr[gchar], format_string : Ptr[gchar], rest: Any*): gboolean = extern

@extern def g_variant_dict_lookup_value(dict : Ptr[GVariantDict], key : Ptr[gchar], expected_type : Ptr[GVariantType]): Ptr[GVariant] = extern

@extern def g_variant_dict_new(from_asv : Ptr[GVariant]): Ptr[GVariantDict] = extern

@extern def g_variant_dict_ref(dict : Ptr[GVariantDict]): Ptr[GVariantDict] = extern

@extern def g_variant_dict_remove(dict : Ptr[GVariantDict], key : Ptr[gchar]): gboolean = extern

@extern def g_variant_dict_unref(dict : Ptr[GVariantDict]): Unit = extern

@extern def g_variant_dup_bytestring(value : Ptr[GVariant], length : Ptr[gsize]): Ptr[gchar] = extern

@extern def g_variant_dup_bytestring_array(value : Ptr[GVariant], length : Ptr[gsize]): Ptr[Ptr[gchar]] = extern

@extern def g_variant_dup_objv(value : Ptr[GVariant], length : Ptr[gsize]): Ptr[Ptr[gchar]] = extern

@extern def g_variant_dup_string(value : Ptr[GVariant], length : Ptr[gsize]): Ptr[gchar] = extern

@extern def g_variant_dup_strv(value : Ptr[GVariant], length : Ptr[gsize]): Ptr[Ptr[gchar]] = extern

@extern def g_variant_equal(one : gconstpointer, two : gconstpointer): gboolean = extern

@extern def g_variant_get(value : Ptr[GVariant], format_string : Ptr[gchar], rest: Any*): Unit = extern

@extern def g_variant_get_boolean(value : Ptr[GVariant]): gboolean = extern

@extern def g_variant_get_byte(value : Ptr[GVariant]): guint8 = extern

@extern def g_variant_get_bytestring(value : Ptr[GVariant]): Ptr[gchar] = extern

@extern def g_variant_get_bytestring_array(value : Ptr[GVariant], length : Ptr[gsize]): Ptr[Ptr[gchar]] = extern

@extern def g_variant_get_child(value : Ptr[GVariant], `index_` : gsize, format_string : Ptr[gchar], rest: Any*): Unit = extern

@extern def g_variant_get_child_value(value : Ptr[GVariant], `index_` : gsize): Ptr[GVariant] = extern

@extern def g_variant_get_data(value : Ptr[GVariant]): gconstpointer = extern

@extern def g_variant_get_data_as_bytes(value : Ptr[GVariant]): Ptr[GBytes] = extern

@extern def g_variant_get_double(value : Ptr[GVariant]): gdouble = extern

@extern def g_variant_get_fixed_array(value : Ptr[GVariant], n_elements : Ptr[gsize], element_size : gsize): gconstpointer = extern

@extern def g_variant_get_handle(value : Ptr[GVariant]): gint32 = extern

@extern def g_variant_get_int16(value : Ptr[GVariant]): gint16 = extern

@extern def g_variant_get_int32(value : Ptr[GVariant]): gint32 = extern

@extern def g_variant_get_int64(value : Ptr[GVariant]): gint64 = extern

@extern def g_variant_get_maybe(value : Ptr[GVariant]): Ptr[GVariant] = extern

@extern def g_variant_get_normal_form(value : Ptr[GVariant]): Ptr[GVariant] = extern

@extern def g_variant_get_objv(value : Ptr[GVariant], length : Ptr[gsize]): Ptr[Ptr[gchar]] = extern

@extern def g_variant_get_size(value : Ptr[GVariant]): gsize = extern

@extern def g_variant_get_string(value : Ptr[GVariant], length : Ptr[gsize]): Ptr[gchar] = extern

@extern def g_variant_get_strv(value : Ptr[GVariant], length : Ptr[gsize]): Ptr[Ptr[gchar]] = extern

@extern def g_variant_get_type(value : Ptr[GVariant]): Ptr[GVariantType] = extern

@extern def g_variant_get_type_string(value : Ptr[GVariant]): Ptr[gchar] = extern

@extern def g_variant_get_uint16(value : Ptr[GVariant]): guint16 = extern

@extern def g_variant_get_uint32(value : Ptr[GVariant]): guint32 = extern

@extern def g_variant_get_uint64(value : Ptr[GVariant]): guint64 = extern

@extern def g_variant_get_va(value : Ptr[GVariant], format_string : Ptr[gchar], endptr : Ptr[Ptr[gchar]], app : Ptr[va_list]): Unit = extern

@extern def g_variant_get_variant(value : Ptr[GVariant]): Ptr[GVariant] = extern

@extern def g_variant_hash(value : gconstpointer): guint = extern

@extern def g_variant_is_container(value : Ptr[GVariant]): gboolean = extern

@extern def g_variant_is_floating(value : Ptr[GVariant]): gboolean = extern

@extern def g_variant_is_normal_form(value : Ptr[GVariant]): gboolean = extern

@extern def g_variant_is_object_path(string : Ptr[gchar]): gboolean = extern

@extern def g_variant_is_of_type(value : Ptr[GVariant], `type` : Ptr[GVariantType]): gboolean = extern

@extern def g_variant_is_signature(string : Ptr[gchar]): gboolean = extern

@extern def g_variant_iter_copy(iter : Ptr[GVariantIter]): Ptr[GVariantIter] = extern

@extern def g_variant_iter_free(iter : Ptr[GVariantIter]): Unit = extern

@extern def g_variant_iter_init(iter : Ptr[GVariantIter], value : Ptr[GVariant]): gsize = extern

@extern def g_variant_iter_loop(iter : Ptr[GVariantIter], format_string : Ptr[gchar], rest: Any*): gboolean = extern

@extern def g_variant_iter_n_children(iter : Ptr[GVariantIter]): gsize = extern

@extern def g_variant_iter_new(value : Ptr[GVariant]): Ptr[GVariantIter] = extern

@extern def g_variant_iter_next(iter : Ptr[GVariantIter], format_string : Ptr[gchar], rest: Any*): gboolean = extern

@extern def g_variant_iter_next_value(iter : Ptr[GVariantIter]): Ptr[GVariant] = extern

@extern def g_variant_lookup(dictionary : Ptr[GVariant], key : Ptr[gchar], format_string : Ptr[gchar], rest: Any*): gboolean = extern

@extern def g_variant_lookup_value(dictionary : Ptr[GVariant], key : Ptr[gchar], expected_type : Ptr[GVariantType]): Ptr[GVariant] = extern

@extern def g_variant_n_children(value : Ptr[GVariant]): gsize = extern

@extern def g_variant_new(format_string : Ptr[gchar], rest: Any*): Ptr[GVariant] = extern

@extern def g_variant_new_array(child_type : Ptr[GVariantType], children : Ptr[Ptr[GVariant]], n_children : gsize): Ptr[GVariant] = extern

@extern def g_variant_new_boolean(value : gboolean): Ptr[GVariant] = extern

@extern def g_variant_new_byte(value : guint8): Ptr[GVariant] = extern

@extern def g_variant_new_bytestring(string : Ptr[gchar]): Ptr[GVariant] = extern

@extern def g_variant_new_bytestring_array(strv : Ptr[Ptr[gchar]], length : gssize): Ptr[GVariant] = extern

@extern def g_variant_new_dict_entry(key : Ptr[GVariant], value : Ptr[GVariant]): Ptr[GVariant] = extern

@extern def g_variant_new_double(value : gdouble): Ptr[GVariant] = extern

@extern def g_variant_new_fixed_array(element_type : Ptr[GVariantType], elements : gconstpointer, n_elements : gsize, element_size : gsize): Ptr[GVariant] = extern

@extern def g_variant_new_from_bytes(`type` : Ptr[GVariantType], bytes : Ptr[GBytes], trusted : gboolean): Ptr[GVariant] = extern

@extern def g_variant_new_from_data(`type` : Ptr[GVariantType], data : gconstpointer, size : gsize, trusted : gboolean, notify : GDestroyNotify, user_data : gpointer): Ptr[GVariant] = extern

@extern def g_variant_new_handle(value : gint32): Ptr[GVariant] = extern

@extern def g_variant_new_int16(value : gint16): Ptr[GVariant] = extern

@extern def g_variant_new_int32(value : gint32): Ptr[GVariant] = extern

@extern def g_variant_new_int64(value : gint64): Ptr[GVariant] = extern

@extern def g_variant_new_maybe(child_type : Ptr[GVariantType], child : Ptr[GVariant]): Ptr[GVariant] = extern

@extern def g_variant_new_object_path(object_path : Ptr[gchar]): Ptr[GVariant] = extern

@extern def g_variant_new_objv(strv : Ptr[Ptr[gchar]], length : gssize): Ptr[GVariant] = extern

@extern def g_variant_new_parsed(format : Ptr[gchar], rest: Any*): Ptr[GVariant] = extern

@extern def g_variant_new_parsed_va(format : Ptr[gchar], app : Ptr[va_list]): Ptr[GVariant] = extern

@extern def g_variant_new_printf(format_string : Ptr[gchar], rest: Any*): Ptr[GVariant] = extern

@extern def g_variant_new_signature(signature : Ptr[gchar]): Ptr[GVariant] = extern

@extern def g_variant_new_string(string : Ptr[gchar]): Ptr[GVariant] = extern

@extern def g_variant_new_strv(strv : Ptr[Ptr[gchar]], length : gssize): Ptr[GVariant] = extern

@extern def g_variant_new_take_string(string : Ptr[gchar]): Ptr[GVariant] = extern

@extern def g_variant_new_tuple(children : Ptr[Ptr[GVariant]], n_children : gsize): Ptr[GVariant] = extern

@extern def g_variant_new_uint16(value : guint16): Ptr[GVariant] = extern

@extern def g_variant_new_uint32(value : guint32): Ptr[GVariant] = extern

@extern def g_variant_new_uint64(value : guint64): Ptr[GVariant] = extern

@extern def g_variant_new_va(format_string : Ptr[gchar], endptr : Ptr[Ptr[gchar]], app : Ptr[va_list]): Ptr[GVariant] = extern

@extern def g_variant_new_variant(value : Ptr[GVariant]): Ptr[GVariant] = extern

@extern def g_variant_parse(`type` : Ptr[GVariantType], text : Ptr[gchar], limit : Ptr[gchar], endptr : Ptr[Ptr[gchar]], error : Ptr[Ptr[GError]]): Ptr[GVariant] = extern

@extern def g_variant_parse_error_print_context(error : Ptr[GError], source_str : Ptr[gchar]): Ptr[gchar] = extern

@extern def g_variant_parse_error_quark(): GQuark = extern

@extern def g_variant_parser_get_error_quark(): GQuark = extern

@extern def g_variant_print(value : Ptr[GVariant], type_annotate : gboolean): Ptr[gchar] = extern

@extern def g_variant_print_string(value : Ptr[GVariant], string : Ptr[GString], type_annotate : gboolean): Ptr[GString] = extern

@extern def g_variant_ref(value : Ptr[GVariant]): Ptr[GVariant] = extern

@extern def g_variant_ref_sink(value : Ptr[GVariant]): Ptr[GVariant] = extern

@extern def g_variant_store(value : Ptr[GVariant], data : gpointer): Unit = extern

@extern def g_variant_take_ref(value : Ptr[GVariant]): Ptr[GVariant] = extern

@extern def g_variant_type_checked_(type_string : Ptr[gchar]): Ptr[GVariantType] = extern

@extern def g_variant_type_copy(`type` : Ptr[GVariantType]): Ptr[GVariantType] = extern

@extern def g_variant_type_dup_string(`type` : Ptr[GVariantType]): Ptr[gchar] = extern

@extern def g_variant_type_element(`type` : Ptr[GVariantType]): Ptr[GVariantType] = extern

@extern def g_variant_type_equal(type1 : gconstpointer, type2 : gconstpointer): gboolean = extern

@extern def g_variant_type_first(`type` : Ptr[GVariantType]): Ptr[GVariantType] = extern

@extern def g_variant_type_free(`type` : Ptr[GVariantType]): Unit = extern

@extern def g_variant_type_get_string_length(`type` : Ptr[GVariantType]): gsize = extern

@extern def g_variant_type_hash(`type` : gconstpointer): guint = extern

@extern def g_variant_type_is_array(`type` : Ptr[GVariantType]): gboolean = extern

@extern def g_variant_type_is_basic(`type` : Ptr[GVariantType]): gboolean = extern

@extern def g_variant_type_is_container(`type` : Ptr[GVariantType]): gboolean = extern

@extern def g_variant_type_is_definite(`type` : Ptr[GVariantType]): gboolean = extern

@extern def g_variant_type_is_dict_entry(`type` : Ptr[GVariantType]): gboolean = extern

@extern def g_variant_type_is_maybe(`type` : Ptr[GVariantType]): gboolean = extern

@extern def g_variant_type_is_subtype_of(`type` : Ptr[GVariantType], supertype : Ptr[GVariantType]): gboolean = extern

@extern def g_variant_type_is_tuple(`type` : Ptr[GVariantType]): gboolean = extern

@extern def g_variant_type_is_variant(`type` : Ptr[GVariantType]): gboolean = extern

@extern def g_variant_type_key(`type` : Ptr[GVariantType]): Ptr[GVariantType] = extern

@extern def g_variant_type_n_items(`type` : Ptr[GVariantType]): gsize = extern

@extern def g_variant_type_new(type_string : Ptr[gchar]): Ptr[GVariantType] = extern

@extern def g_variant_type_new_array(element : Ptr[GVariantType]): Ptr[GVariantType] = extern

@extern def g_variant_type_new_dict_entry(key : Ptr[GVariantType], value : Ptr[GVariantType]): Ptr[GVariantType] = extern

@extern def g_variant_type_new_maybe(element : Ptr[GVariantType]): Ptr[GVariantType] = extern

@extern def g_variant_type_new_tuple(items : Ptr[Ptr[GVariantType]], length : gint): Ptr[GVariantType] = extern

@extern def g_variant_type_next(`type` : Ptr[GVariantType]): Ptr[GVariantType] = extern

@extern def g_variant_type_peek_string(`type` : Ptr[GVariantType]): Ptr[gchar] = extern

@extern def g_variant_type_string_get_depth_(type_string : Ptr[gchar]): gsize = extern

@extern def g_variant_type_string_is_valid(type_string : Ptr[gchar]): gboolean = extern

@extern def g_variant_type_string_scan(string : Ptr[gchar], limit : Ptr[gchar], endptr : Ptr[Ptr[gchar]]): gboolean = extern

@extern def g_variant_type_value(`type` : Ptr[GVariantType]): Ptr[GVariantType] = extern

@extern def g_variant_unref(value : Ptr[GVariant]): Unit = extern

@extern def g_vsnprintf(string : Ptr[gchar], n : gulong, format : Ptr[gchar], args : va_list): gint = extern

@extern def g_warn_message(domain : CString, file : CString, line : CInt, func : CString, warnexpr : CString): Unit = extern

@extern def glib_auto_cleanup_GCond(_ptr : Ptr[GCond]): Unit = extern

@extern def glib_auto_cleanup_GMutex(_ptr : Ptr[GMutex]): Unit = extern

@extern def glib_auto_cleanup_GPathBuf(_ptr : Ptr[GPathBuf]): Unit = extern

@extern def glib_auto_cleanup_GQueue(_ptr : Ptr[GQueue]): Unit = extern

@extern def glib_auto_cleanup_GStrv(_ptr : Ptr[GStrv]): Unit = extern

@extern def glib_auto_cleanup_GVariantBuilder(_ptr : Ptr[GVariantBuilder]): Unit = extern

@extern def glib_auto_cleanup_GVariantDict(_ptr : Ptr[GVariantDict]): Unit = extern

@extern def glib_autoptr_cleanup_GArray(_ptr : Ptr[Ptr[GArray]]): Unit = extern

@extern def glib_autoptr_cleanup_GAsyncQueue(_ptr : Ptr[Ptr[GAsyncQueue]]): Unit = extern

@extern def glib_autoptr_cleanup_GBookmarkFile(_ptr : Ptr[Ptr[GBookmarkFile]]): Unit = extern

@extern def glib_autoptr_cleanup_GByteArray(_ptr : Ptr[Ptr[GByteArray]]): Unit = extern

@extern def glib_autoptr_cleanup_GBytes(_ptr : Ptr[Ptr[GBytes]]): Unit = extern

@extern def glib_autoptr_cleanup_GChecksum(_ptr : Ptr[Ptr[GChecksum]]): Unit = extern

@extern def glib_autoptr_cleanup_GDate(_ptr : Ptr[Ptr[GDate]]): Unit = extern

@extern def glib_autoptr_cleanup_GDateTime(_ptr : Ptr[Ptr[GDateTime]]): Unit = extern

@extern def glib_autoptr_cleanup_GDir(_ptr : Ptr[Ptr[GDir]]): Unit = extern

@extern def glib_autoptr_cleanup_GError(_ptr : Ptr[Ptr[GError]]): Unit = extern

@extern def glib_autoptr_cleanup_GHashTable(_ptr : Ptr[Ptr[GHashTable]]): Unit = extern

@extern def glib_autoptr_cleanup_GHmac(_ptr : Ptr[Ptr[GHmac]]): Unit = extern

@extern def glib_autoptr_cleanup_GIOChannel(_ptr : Ptr[Ptr[GIOChannel]]): Unit = extern

@extern def glib_autoptr_cleanup_GKeyFile(_ptr : Ptr[Ptr[GKeyFile]]): Unit = extern

@extern def glib_autoptr_cleanup_GList(_ptr : Ptr[Ptr[GList]]): Unit = extern

@extern def glib_autoptr_cleanup_GMainContext(_ptr : Ptr[Ptr[GMainContext]]): Unit = extern

@extern def glib_autoptr_cleanup_GMainContextPusher(_ptr : Ptr[Ptr[GMainContextPusher]]): Unit = extern

@extern def glib_autoptr_cleanup_GMainLoop(_ptr : Ptr[Ptr[GMainLoop]]): Unit = extern

@extern def glib_autoptr_cleanup_GMappedFile(_ptr : Ptr[Ptr[GMappedFile]]): Unit = extern

@extern def glib_autoptr_cleanup_GMarkupParseContext(_ptr : Ptr[Ptr[GMarkupParseContext]]): Unit = extern

@extern def glib_autoptr_cleanup_GMatchInfo(_ptr : Ptr[Ptr[GMatchInfo]]): Unit = extern

@extern def glib_autoptr_cleanup_GMutexLocker(_ptr : Ptr[Ptr[GMutexLocker]]): Unit = extern

@extern def glib_autoptr_cleanup_GNode(_ptr : Ptr[Ptr[GNode]]): Unit = extern

@extern def glib_autoptr_cleanup_GOptionContext(_ptr : Ptr[Ptr[GOptionContext]]): Unit = extern

@extern def glib_autoptr_cleanup_GOptionGroup(_ptr : Ptr[Ptr[GOptionGroup]]): Unit = extern

@extern def glib_autoptr_cleanup_GPathBuf(_ptr : Ptr[Ptr[GPathBuf]]): Unit = extern

@extern def glib_autoptr_cleanup_GPatternSpec(_ptr : Ptr[Ptr[GPatternSpec]]): Unit = extern

@extern def glib_autoptr_cleanup_GPtrArray(_ptr : Ptr[Ptr[GPtrArray]]): Unit = extern

@extern def glib_autoptr_cleanup_GQueue(_ptr : Ptr[Ptr[GQueue]]): Unit = extern

@extern def glib_autoptr_cleanup_GRWLockReaderLocker(_ptr : Ptr[Ptr[GRWLockReaderLocker]]): Unit = extern

@extern def glib_autoptr_cleanup_GRWLockWriterLocker(_ptr : Ptr[Ptr[GRWLockWriterLocker]]): Unit = extern

@extern def glib_autoptr_cleanup_GRand(_ptr : Ptr[Ptr[GRand]]): Unit = extern

@extern def glib_autoptr_cleanup_GRecMutexLocker(_ptr : Ptr[Ptr[GRecMutexLocker]]): Unit = extern

@extern def glib_autoptr_cleanup_GRefString(_ptr : Ptr[Ptr[GRefString]]): Unit = extern

@extern def glib_autoptr_cleanup_GRegex(_ptr : Ptr[Ptr[GRegex]]): Unit = extern

@extern def glib_autoptr_cleanup_GSList(_ptr : Ptr[Ptr[GSList]]): Unit = extern

@extern def glib_autoptr_cleanup_GScanner(_ptr : Ptr[Ptr[GScanner]]): Unit = extern

@extern def glib_autoptr_cleanup_GSequence(_ptr : Ptr[Ptr[GSequence]]): Unit = extern

@extern def glib_autoptr_cleanup_GSource(_ptr : Ptr[Ptr[GSource]]): Unit = extern

@extern def glib_autoptr_cleanup_GString(_ptr : Ptr[Ptr[GString]]): Unit = extern

@extern def glib_autoptr_cleanup_GStringChunk(_ptr : Ptr[Ptr[GStringChunk]]): Unit = extern

@extern def glib_autoptr_cleanup_GStrvBuilder(_ptr : Ptr[Ptr[GStrvBuilder]]): Unit = extern

@extern def glib_autoptr_cleanup_GThread(_ptr : Ptr[Ptr[GThread]]): Unit = extern

@extern def glib_autoptr_cleanup_GTimeZone(_ptr : Ptr[Ptr[GTimeZone]]): Unit = extern

@extern def glib_autoptr_cleanup_GTimer(_ptr : Ptr[Ptr[GTimer]]): Unit = extern

@extern def glib_autoptr_cleanup_GTree(_ptr : Ptr[Ptr[GTree]]): Unit = extern

@extern def glib_autoptr_cleanup_GUri(_ptr : Ptr[Ptr[GUri]]): Unit = extern

@extern def glib_autoptr_cleanup_GVariant(_ptr : Ptr[Ptr[GVariant]]): Unit = extern

@extern def glib_autoptr_cleanup_GVariantBuilder(_ptr : Ptr[Ptr[GVariantBuilder]]): Unit = extern

@extern def glib_autoptr_cleanup_GVariantDict(_ptr : Ptr[Ptr[GVariantDict]]): Unit = extern

@extern def glib_autoptr_cleanup_GVariantIter(_ptr : Ptr[Ptr[GVariantIter]]): Unit = extern

@extern def glib_autoptr_cleanup_GVariantType(_ptr : Ptr[Ptr[GVariantType]]): Unit = extern

@extern def glib_autoptr_clear_GArray(_ptr : Ptr[GArray]): Unit = extern

@extern def glib_autoptr_clear_GAsyncQueue(_ptr : Ptr[GAsyncQueue]): Unit = extern

@extern def glib_autoptr_clear_GBookmarkFile(_ptr : Ptr[GBookmarkFile]): Unit = extern

@extern def glib_autoptr_clear_GByteArray(_ptr : Ptr[GByteArray]): Unit = extern

@extern def glib_autoptr_clear_GBytes(_ptr : Ptr[GBytes]): Unit = extern

@extern def glib_autoptr_clear_GChecksum(_ptr : Ptr[GChecksum]): Unit = extern

@extern def glib_autoptr_clear_GDate(_ptr : Ptr[GDate]): Unit = extern

@extern def glib_autoptr_clear_GDateTime(_ptr : Ptr[GDateTime]): Unit = extern

@extern def glib_autoptr_clear_GDir(_ptr : Ptr[GDir]): Unit = extern

@extern def glib_autoptr_clear_GError(_ptr : Ptr[GError]): Unit = extern

@extern def glib_autoptr_clear_GHashTable(_ptr : Ptr[GHashTable]): Unit = extern

@extern def glib_autoptr_clear_GHmac(_ptr : Ptr[GHmac]): Unit = extern

@extern def glib_autoptr_clear_GIOChannel(_ptr : Ptr[GIOChannel]): Unit = extern

@extern def glib_autoptr_clear_GKeyFile(_ptr : Ptr[GKeyFile]): Unit = extern

@extern def glib_autoptr_clear_GList(_ptr : Ptr[GList]): Unit = extern

@extern def glib_autoptr_clear_GMainContext(_ptr : Ptr[GMainContext]): Unit = extern

@extern def glib_autoptr_clear_GMainContextPusher(_ptr : Ptr[GMainContextPusher]): Unit = extern

@extern def glib_autoptr_clear_GMainLoop(_ptr : Ptr[GMainLoop]): Unit = extern

@extern def glib_autoptr_clear_GMappedFile(_ptr : Ptr[GMappedFile]): Unit = extern

@extern def glib_autoptr_clear_GMarkupParseContext(_ptr : Ptr[GMarkupParseContext]): Unit = extern

@extern def glib_autoptr_clear_GMatchInfo(_ptr : Ptr[GMatchInfo]): Unit = extern

@extern def glib_autoptr_clear_GMutexLocker(_ptr : Ptr[GMutexLocker]): Unit = extern

@extern def glib_autoptr_clear_GNode(_ptr : Ptr[GNode]): Unit = extern

@extern def glib_autoptr_clear_GOptionContext(_ptr : Ptr[GOptionContext]): Unit = extern

@extern def glib_autoptr_clear_GOptionGroup(_ptr : Ptr[GOptionGroup]): Unit = extern

@extern def glib_autoptr_clear_GPathBuf(_ptr : Ptr[GPathBuf]): Unit = extern

@extern def glib_autoptr_clear_GPatternSpec(_ptr : Ptr[GPatternSpec]): Unit = extern

@extern def glib_autoptr_clear_GPtrArray(_ptr : Ptr[GPtrArray]): Unit = extern

@extern def glib_autoptr_clear_GQueue(_ptr : Ptr[GQueue]): Unit = extern

@extern def glib_autoptr_clear_GRWLockReaderLocker(_ptr : Ptr[GRWLockReaderLocker]): Unit = extern

@extern def glib_autoptr_clear_GRWLockWriterLocker(_ptr : Ptr[GRWLockWriterLocker]): Unit = extern

@extern def glib_autoptr_clear_GRand(_ptr : Ptr[GRand]): Unit = extern

@extern def glib_autoptr_clear_GRecMutexLocker(_ptr : Ptr[GRecMutexLocker]): Unit = extern

@extern def glib_autoptr_clear_GRefString(_ptr : Ptr[GRefString]): Unit = extern

@extern def glib_autoptr_clear_GRegex(_ptr : Ptr[GRegex]): Unit = extern

@extern def glib_autoptr_clear_GSList(_ptr : Ptr[GSList]): Unit = extern

@extern def glib_autoptr_clear_GScanner(_ptr : Ptr[GScanner]): Unit = extern

@extern def glib_autoptr_clear_GSequence(_ptr : Ptr[GSequence]): Unit = extern

@extern def glib_autoptr_clear_GSource(_ptr : Ptr[GSource]): Unit = extern

@extern def glib_autoptr_clear_GString(_ptr : Ptr[GString]): Unit = extern

@extern def glib_autoptr_clear_GStringChunk(_ptr : Ptr[GStringChunk]): Unit = extern

@extern def glib_autoptr_clear_GStrvBuilder(_ptr : Ptr[GStrvBuilder]): Unit = extern

@extern def glib_autoptr_clear_GThread(_ptr : Ptr[GThread]): Unit = extern

@extern def glib_autoptr_clear_GTimeZone(_ptr : Ptr[GTimeZone]): Unit = extern

@extern def glib_autoptr_clear_GTimer(_ptr : Ptr[GTimer]): Unit = extern

@extern def glib_autoptr_clear_GTree(_ptr : Ptr[GTree]): Unit = extern

@extern def glib_autoptr_clear_GUri(_ptr : Ptr[GUri]): Unit = extern

@extern def glib_autoptr_clear_GVariant(_ptr : Ptr[GVariant]): Unit = extern

@extern def glib_autoptr_clear_GVariantBuilder(_ptr : Ptr[GVariantBuilder]): Unit = extern

@extern def glib_autoptr_clear_GVariantDict(_ptr : Ptr[GVariantDict]): Unit = extern

@extern def glib_autoptr_clear_GVariantIter(_ptr : Ptr[GVariantIter]): Unit = extern

@extern def glib_autoptr_clear_GVariantType(_ptr : Ptr[GVariantType]): Unit = extern

@extern def glib_check_version(required_major : guint, required_minor : guint, required_micro : guint): Ptr[gchar] = extern

@extern def glib_listautoptr_cleanup_GArray(_l : Ptr[Ptr[GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GAsyncQueue(_l : Ptr[Ptr[GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GBookmarkFile(_l : Ptr[Ptr[GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GByteArray(_l : Ptr[Ptr[GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GBytes(_l : Ptr[Ptr[GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GChecksum(_l : Ptr[Ptr[GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GDate(_l : Ptr[Ptr[GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GDateTime(_l : Ptr[Ptr[GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GDir(_l : Ptr[Ptr[GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GError(_l : Ptr[Ptr[GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GHashTable(_l : Ptr[Ptr[GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GHmac(_l : Ptr[Ptr[GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GIOChannel(_l : Ptr[Ptr[GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GKeyFile(_l : Ptr[Ptr[GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GList(_l : Ptr[Ptr[GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GMainContext(_l : Ptr[Ptr[GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GMainContextPusher(_l : Ptr[Ptr[GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GMainLoop(_l : Ptr[Ptr[GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GMappedFile(_l : Ptr[Ptr[GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GMarkupParseContext(_l : Ptr[Ptr[GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GMatchInfo(_l : Ptr[Ptr[GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GMutexLocker(_l : Ptr[Ptr[GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GNode(_l : Ptr[Ptr[GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GOptionContext(_l : Ptr[Ptr[GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GOptionGroup(_l : Ptr[Ptr[GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GPathBuf(_l : Ptr[Ptr[GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GPatternSpec(_l : Ptr[Ptr[GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GPtrArray(_l : Ptr[Ptr[GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GQueue(_l : Ptr[Ptr[GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GRWLockReaderLocker(_l : Ptr[Ptr[GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GRWLockWriterLocker(_l : Ptr[Ptr[GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GRand(_l : Ptr[Ptr[GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GRecMutexLocker(_l : Ptr[Ptr[GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GRefString(_l : Ptr[Ptr[GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GRegex(_l : Ptr[Ptr[GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GSList(_l : Ptr[Ptr[GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GScanner(_l : Ptr[Ptr[GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GSequence(_l : Ptr[Ptr[GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GSource(_l : Ptr[Ptr[GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GString(_l : Ptr[Ptr[GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GStringChunk(_l : Ptr[Ptr[GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GStrvBuilder(_l : Ptr[Ptr[GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GThread(_l : Ptr[Ptr[GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GTimeZone(_l : Ptr[Ptr[GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GTimer(_l : Ptr[Ptr[GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GTree(_l : Ptr[Ptr[GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GUri(_l : Ptr[Ptr[GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GVariant(_l : Ptr[Ptr[GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GVariantBuilder(_l : Ptr[Ptr[GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GVariantDict(_l : Ptr[Ptr[GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GVariantIter(_l : Ptr[Ptr[GList]]): Unit = extern

@extern def glib_listautoptr_cleanup_GVariantType(_l : Ptr[Ptr[GList]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GArray(_q : Ptr[Ptr[GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GAsyncQueue(_q : Ptr[Ptr[GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GBookmarkFile(_q : Ptr[Ptr[GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GByteArray(_q : Ptr[Ptr[GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GBytes(_q : Ptr[Ptr[GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GChecksum(_q : Ptr[Ptr[GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GDate(_q : Ptr[Ptr[GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GDateTime(_q : Ptr[Ptr[GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GDir(_q : Ptr[Ptr[GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GError(_q : Ptr[Ptr[GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GHashTable(_q : Ptr[Ptr[GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GHmac(_q : Ptr[Ptr[GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GIOChannel(_q : Ptr[Ptr[GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GKeyFile(_q : Ptr[Ptr[GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GList(_q : Ptr[Ptr[GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GMainContext(_q : Ptr[Ptr[GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GMainContextPusher(_q : Ptr[Ptr[GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GMainLoop(_q : Ptr[Ptr[GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GMappedFile(_q : Ptr[Ptr[GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GMarkupParseContext(_q : Ptr[Ptr[GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GMatchInfo(_q : Ptr[Ptr[GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GMutexLocker(_q : Ptr[Ptr[GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GNode(_q : Ptr[Ptr[GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GOptionContext(_q : Ptr[Ptr[GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GOptionGroup(_q : Ptr[Ptr[GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GPathBuf(_q : Ptr[Ptr[GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GPatternSpec(_q : Ptr[Ptr[GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GPtrArray(_q : Ptr[Ptr[GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GQueue(_q : Ptr[Ptr[GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GRWLockReaderLocker(_q : Ptr[Ptr[GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GRWLockWriterLocker(_q : Ptr[Ptr[GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GRand(_q : Ptr[Ptr[GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GRecMutexLocker(_q : Ptr[Ptr[GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GRefString(_q : Ptr[Ptr[GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GRegex(_q : Ptr[Ptr[GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GSList(_q : Ptr[Ptr[GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GScanner(_q : Ptr[Ptr[GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GSequence(_q : Ptr[Ptr[GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GSource(_q : Ptr[Ptr[GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GString(_q : Ptr[Ptr[GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GStringChunk(_q : Ptr[Ptr[GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GStrvBuilder(_q : Ptr[Ptr[GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GThread(_q : Ptr[Ptr[GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GTimeZone(_q : Ptr[Ptr[GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GTimer(_q : Ptr[Ptr[GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GTree(_q : Ptr[Ptr[GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GUri(_q : Ptr[Ptr[GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GVariant(_q : Ptr[Ptr[GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GVariantBuilder(_q : Ptr[Ptr[GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GVariantDict(_q : Ptr[Ptr[GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GVariantIter(_q : Ptr[Ptr[GQueue]]): Unit = extern

@extern def glib_queueautoptr_cleanup_GVariantType(_q : Ptr[Ptr[GQueue]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GArray(_l : Ptr[Ptr[GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GAsyncQueue(_l : Ptr[Ptr[GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GBookmarkFile(_l : Ptr[Ptr[GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GByteArray(_l : Ptr[Ptr[GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GBytes(_l : Ptr[Ptr[GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GChecksum(_l : Ptr[Ptr[GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GDate(_l : Ptr[Ptr[GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GDateTime(_l : Ptr[Ptr[GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GDir(_l : Ptr[Ptr[GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GError(_l : Ptr[Ptr[GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GHashTable(_l : Ptr[Ptr[GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GHmac(_l : Ptr[Ptr[GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GIOChannel(_l : Ptr[Ptr[GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GKeyFile(_l : Ptr[Ptr[GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GList(_l : Ptr[Ptr[GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GMainContext(_l : Ptr[Ptr[GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GMainContextPusher(_l : Ptr[Ptr[GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GMainLoop(_l : Ptr[Ptr[GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GMappedFile(_l : Ptr[Ptr[GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GMarkupParseContext(_l : Ptr[Ptr[GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GMatchInfo(_l : Ptr[Ptr[GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GMutexLocker(_l : Ptr[Ptr[GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GNode(_l : Ptr[Ptr[GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GOptionContext(_l : Ptr[Ptr[GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GOptionGroup(_l : Ptr[Ptr[GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GPathBuf(_l : Ptr[Ptr[GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GPatternSpec(_l : Ptr[Ptr[GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GPtrArray(_l : Ptr[Ptr[GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GQueue(_l : Ptr[Ptr[GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GRWLockReaderLocker(_l : Ptr[Ptr[GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GRWLockWriterLocker(_l : Ptr[Ptr[GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GRand(_l : Ptr[Ptr[GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GRecMutexLocker(_l : Ptr[Ptr[GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GRefString(_l : Ptr[Ptr[GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GRegex(_l : Ptr[Ptr[GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GSList(_l : Ptr[Ptr[GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GScanner(_l : Ptr[Ptr[GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GSequence(_l : Ptr[Ptr[GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GSource(_l : Ptr[Ptr[GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GString(_l : Ptr[Ptr[GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GStringChunk(_l : Ptr[Ptr[GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GStrvBuilder(_l : Ptr[Ptr[GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GThread(_l : Ptr[Ptr[GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GTimeZone(_l : Ptr[Ptr[GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GTimer(_l : Ptr[Ptr[GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GTree(_l : Ptr[Ptr[GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GUri(_l : Ptr[Ptr[GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GVariant(_l : Ptr[Ptr[GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GVariantBuilder(_l : Ptr[Ptr[GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GVariantDict(_l : Ptr[Ptr[GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GVariantIter(_l : Ptr[Ptr[GSList]]): Unit = extern

@extern def glib_slistautoptr_cleanup_GVariantType(_l : Ptr[Ptr[GSList]]): Unit = extern