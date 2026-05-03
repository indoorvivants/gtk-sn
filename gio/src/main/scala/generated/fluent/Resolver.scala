package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.fluent.AsyncResult
import sn.gnome.gio.fluent.Cancellable
import sn.gnome.gio.fluent.InetAddress
import sn.gnome.gio.fluent.ResolverRecordType
import sn.gnome.gio.internal.GAsyncReadyCallback
import sn.gnome.gio.internal.GResolver
import sn.gnome.gio.internal.GResolverNameLookupFlags
import sn.gnome.glib.fluent.GResult
import sn.gnome.glib.internal.GList
import sn.gnome.glib.internal.gchar
import sn.gnome.glib.internal.gpointer
import sn.gnome.glib.internal.guint
import sn.gnome.gobject.fluent.Object

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * #GResolver provides cancellable synchronous and asynchronous DNS resolution,
  * for hostnames (g_resolver_lookup_by_address(), g_resolver_lookup_by_name()
  * and their async variants) and SRV (service) records
  * (g_resolver_lookup_service()).
  *
  * #GNetworkAddress and #GNetworkService provide wrappers around #GResolver
  * functionality that also implement #GSocketConnectable, making it easy to
  * connect to a remote host/service.
  *
  * The default resolver (see g_resolver_get_default()) has a timeout of 30s set
  * on it since GLib 2.78. Earlier versions of GLib did not support resolver
  * timeouts.
  */
class Resolver(raw: Ptr[GResolver]) extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Get the timeout applied to all resolver lookups. See #GResolver:timeout.
    */
  def getTimeout(): UInt /* None */ = g_resolver_get_timeout(
    this.raw.asInstanceOf[Ptr[GResolver]]
  ).asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Synchronously reverse-resolves @address to determine its associated
    * hostname.
    *
    * If the DNS resolution fails, @error (if non-%NULL) will be set to a value
    * from #GResolverError.
    *
    * If @cancellable is non-%NULL, it can be used to cancel the operation, in
    * which case @error (if non-%NULL) will be set to %G_IO_ERROR_CANCELLED.
    */
  def lookupByAddress(
      address: InetAddress /* Some(Ptr[GInetAddress]) */,
      cancellable: Option[Cancellable /* Some(Ptr[GCancellable]) */ ]
  )(using Zone): GResult[String /* None */ ] = GResult.wrap(__errorPtr =>
    fromCString(
      g_resolver_lookup_by_address(
        this.raw.asInstanceOf[Ptr[GResolver]],
        address.getUnsafeRawPointer().asInstanceOf,
        cancellable
          .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
          .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
        __errorPtr
      ).asInstanceOf
    )
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Begins asynchronously reverse-resolving @address to determine its
    * associated hostname, and eventually calls @callback, which must call
    * g_resolver_lookup_by_address_finish() to get the final result.
    */
  def lookupByAddressAsync(
      address: InetAddress /* Some(Ptr[GInetAddress]) */,
      cancellable: Option[Cancellable /* Some(Ptr[GCancellable]) */ ],
      callback: Option[GAsyncReadyCallback /* Some(GAsyncReadyCallback) */ ],
      user_data: Option[
        Ptr[Byte] /* Some(_root_.sn.gnome.glib.internal.gpointer) */
      ]
  ): Unit /* None */ = g_resolver_lookup_by_address_async(
    this.raw.asInstanceOf[Ptr[GResolver]],
    address.getUnsafeRawPointer().asInstanceOf,
    cancellable
      .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
    callback
      .map[GAsyncReadyCallback](o => o)
      .getOrElse(null.asInstanceOf[GAsyncReadyCallback]),
    user_data
      .map[_root_.sn.gnome.glib.internal.gpointer](o => gpointer(o))
      .getOrElse(null.asInstanceOf[_root_.sn.gnome.glib.internal.gpointer])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the result of a previous call to
    * g_resolver_lookup_by_address_async().
    *
    * If the DNS resolution failed, @error (if non-%NULL) will be set to a value
    * from #GResolverError. If the operation was cancelled,
    * @error
    *   will be set to %G_IO_ERROR_CANCELLED.
    */
  def lookupByAddressFinish(
      result: AsyncResult /* Some(Ptr[GAsyncResult]) */
  )(using Zone): GResult[String /* None */ ] = GResult.wrap(__errorPtr =>
    fromCString(
      g_resolver_lookup_by_address_finish(
        this.raw.asInstanceOf[Ptr[GResolver]],
        result.getUnsafeRawPointer().asInstanceOf,
        __errorPtr
      ).asInstanceOf
    )
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Synchronously resolves @hostname to determine its associated IP
    * address(es). @hostname may be an ASCII-only or UTF-8 hostname, or the
    * textual form of an IP address (in which case this just becomes a wrapper
    * around g_inet_address_new_from_string()).
    *
    * On success, g_resolver_lookup_by_name() will return a non-empty #GList of
    * #GInetAddress, sorted in order of preference and guaranteed to not contain
    * duplicates. That is, if using the result to connect to
    * @hostname,
    *   you should attempt to connect to the first address first, then the
    *   second if the first fails, etc. If you are using the result to listen on
    *   a socket, it is appropriate to add each result using e.g.
    *   g_socket_listener_add_address().
    *
    * If the DNS resolution fails, @error (if non-%NULL) will be set to a value
    * from #GResolverError and %NULL will be returned.
    *
    * If @cancellable is non-%NULL, it can be used to cancel the operation, in
    * which case @error (if non-%NULL) will be set to %G_IO_ERROR_CANCELLED.
    *
    * If you are planning to connect to a socket on the resolved IP address, it
    * may be easier to create a #GNetworkAddress and use its #GSocketConnectable
    * interface.
    */
  def lookupByName(
      hostname: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      cancellable: Option[Cancellable /* Some(Ptr[GCancellable]) */ ]
  )(using Zone): GResult[Ptr[GList] /* None */ ] = GResult.wrap(__errorPtr =>
    g_resolver_lookup_by_name(
      this.raw.asInstanceOf[Ptr[GResolver]],
      __sn_extract_string(hostname).asInstanceOf[Ptr[gchar]],
      cancellable
        .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
      __errorPtr
    )
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Begins asynchronously resolving @hostname to determine its associated IP
    * address(es), and eventually calls @callback, which must call
    * g_resolver_lookup_by_name_finish() to get the result. See
    * g_resolver_lookup_by_name() for more details.
    */
  def lookupByNameAsync(
      hostname: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      cancellable: Option[Cancellable /* Some(Ptr[GCancellable]) */ ],
      callback: Option[GAsyncReadyCallback /* Some(GAsyncReadyCallback) */ ],
      user_data: Option[
        Ptr[Byte] /* Some(_root_.sn.gnome.glib.internal.gpointer) */
      ]
  )(using Zone): Unit /* None */ = g_resolver_lookup_by_name_async(
    this.raw.asInstanceOf[Ptr[GResolver]],
    __sn_extract_string(hostname).asInstanceOf[Ptr[gchar]],
    cancellable
      .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
    callback
      .map[GAsyncReadyCallback](o => o)
      .getOrElse(null.asInstanceOf[GAsyncReadyCallback]),
    user_data
      .map[_root_.sn.gnome.glib.internal.gpointer](o => gpointer(o))
      .getOrElse(null.asInstanceOf[_root_.sn.gnome.glib.internal.gpointer])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the result of a call to g_resolver_lookup_by_name_async().
    *
    * If the DNS resolution failed, @error (if non-%NULL) will be set to a value
    * from #GResolverError. If the operation was cancelled,
    * @error
    *   will be set to %G_IO_ERROR_CANCELLED.
    */
  def lookupByNameFinish(
      result: AsyncResult /* Some(Ptr[GAsyncResult]) */
  ): GResult[Ptr[GList] /* None */ ] = GResult.wrap(__errorPtr =>
    g_resolver_lookup_by_name_finish(
      this.raw.asInstanceOf[Ptr[GResolver]],
      result.getUnsafeRawPointer().asInstanceOf,
      __errorPtr
    )
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * This differs from g_resolver_lookup_by_name() in that you can modify the
    * lookup behavior with @flags. For example this can be used to limit results
    * with %G_RESOLVER_NAME_LOOKUP_FLAGS_IPV4_ONLY.
    */
  def lookupByNameWithFlags(
      hostname: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      flags: GResolverNameLookupFlags /* Some(GResolverNameLookupFlags) */,
      cancellable: Option[Cancellable /* Some(Ptr[GCancellable]) */ ]
  )(using Zone): GResult[Ptr[GList] /* None */ ] = GResult.wrap(__errorPtr =>
    g_resolver_lookup_by_name_with_flags(
      this.raw.asInstanceOf[Ptr[GResolver]],
      __sn_extract_string(hostname).asInstanceOf[Ptr[gchar]],
      flags,
      cancellable
        .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
      __errorPtr
    )
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Begins asynchronously resolving @hostname to determine its associated IP
    * address(es), and eventually calls @callback, which must call
    * g_resolver_lookup_by_name_with_flags_finish() to get the result. See
    * g_resolver_lookup_by_name() for more details.
    */
  def lookupByNameWithFlagsAsync(
      hostname: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      flags: GResolverNameLookupFlags /* Some(GResolverNameLookupFlags) */,
      cancellable: Option[Cancellable /* Some(Ptr[GCancellable]) */ ],
      callback: Option[GAsyncReadyCallback /* Some(GAsyncReadyCallback) */ ],
      user_data: Option[
        Ptr[Byte] /* Some(_root_.sn.gnome.glib.internal.gpointer) */
      ]
  )(using Zone): Unit /* None */ = g_resolver_lookup_by_name_with_flags_async(
    this.raw.asInstanceOf[Ptr[GResolver]],
    __sn_extract_string(hostname).asInstanceOf[Ptr[gchar]],
    flags,
    cancellable
      .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
    callback
      .map[GAsyncReadyCallback](o => o)
      .getOrElse(null.asInstanceOf[GAsyncReadyCallback]),
    user_data
      .map[_root_.sn.gnome.glib.internal.gpointer](o => gpointer(o))
      .getOrElse(null.asInstanceOf[_root_.sn.gnome.glib.internal.gpointer])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the result of a call to
    * g_resolver_lookup_by_name_with_flags_async().
    *
    * If the DNS resolution failed, @error (if non-%NULL) will be set to a value
    * from #GResolverError. If the operation was cancelled,
    * @error
    *   will be set to %G_IO_ERROR_CANCELLED.
    */
  def lookupByNameWithFlagsFinish(
      result: AsyncResult /* Some(Ptr[GAsyncResult]) */
  ): GResult[Ptr[GList] /* None */ ] = GResult.wrap(__errorPtr =>
    g_resolver_lookup_by_name_with_flags_finish(
      this.raw.asInstanceOf[Ptr[GResolver]],
      result.getUnsafeRawPointer().asInstanceOf,
      __errorPtr
    )
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Synchronously performs a DNS record lookup for the given @rrname and
    * returns a list of records as #GVariant tuples. See #GResolverRecordType
    * for information on what the records contain for each @record_type.
    *
    * If the DNS resolution fails, @error (if non-%NULL) will be set to a value
    * from #GResolverError and %NULL will be returned.
    *
    * If @cancellable is non-%NULL, it can be used to cancel the operation, in
    * which case @error (if non-%NULL) will be set to %G_IO_ERROR_CANCELLED.
    */
  def lookupRecords(
      rrname: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      record_type: ResolverRecordType /* Some(GResolverRecordType) */,
      cancellable: Option[Cancellable /* Some(Ptr[GCancellable]) */ ]
  )(using Zone): GResult[Ptr[GList] /* None */ ] = GResult.wrap(__errorPtr =>
    g_resolver_lookup_records(
      this.raw.asInstanceOf[Ptr[GResolver]],
      __sn_extract_string(rrname).asInstanceOf[Ptr[gchar]],
      record_type.raw,
      cancellable
        .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
      __errorPtr
    )
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Begins asynchronously performing a DNS lookup for the given
    * @rrname,
    *   and eventually calls @callback, which must call
    *   g_resolver_lookup_records_finish() to get the final result. See
    *   g_resolver_lookup_records() for more details.
    */
  def lookupRecordsAsync(
      rrname: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      record_type: ResolverRecordType /* Some(GResolverRecordType) */,
      cancellable: Option[Cancellable /* Some(Ptr[GCancellable]) */ ],
      callback: Option[GAsyncReadyCallback /* Some(GAsyncReadyCallback) */ ],
      user_data: Option[
        Ptr[Byte] /* Some(_root_.sn.gnome.glib.internal.gpointer) */
      ]
  )(using Zone): Unit /* None */ = g_resolver_lookup_records_async(
    this.raw.asInstanceOf[Ptr[GResolver]],
    __sn_extract_string(rrname).asInstanceOf[Ptr[gchar]],
    record_type.raw,
    cancellable
      .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
    callback
      .map[GAsyncReadyCallback](o => o)
      .getOrElse(null.asInstanceOf[GAsyncReadyCallback]),
    user_data
      .map[_root_.sn.gnome.glib.internal.gpointer](o => gpointer(o))
      .getOrElse(null.asInstanceOf[_root_.sn.gnome.glib.internal.gpointer])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the result of a previous call to
    * g_resolver_lookup_records_async(). Returns a non-empty list of records as
    * #GVariant tuples. See #GResolverRecordType for information on what the
    * records contain.
    *
    * If the DNS resolution failed, @error (if non-%NULL) will be set to a value
    * from #GResolverError. If the operation was cancelled,
    * @error
    *   will be set to %G_IO_ERROR_CANCELLED.
    */
  def lookupRecordsFinish(
      result: AsyncResult /* Some(Ptr[GAsyncResult]) */
  ): GResult[Ptr[GList] /* None */ ] = GResult.wrap(__errorPtr =>
    g_resolver_lookup_records_finish(
      this.raw.asInstanceOf[Ptr[GResolver]],
      result.getUnsafeRawPointer().asInstanceOf,
      __errorPtr
    )
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Synchronously performs a DNS SRV lookup for the given @service and
    * @protocol
    *   in the given @domain and returns an array of #GSrvTarget.
    * @domain
    *   may be an ASCII-only or UTF-8 hostname. Note also that the
    * @service
    *   and @protocol arguments do not include the leading underscore that
    *   appears in the actual DNS entry.
    *
    * On success, g_resolver_lookup_service() will return a non-empty #GList of
    * #GSrvTarget, sorted in order of preference. (That is, you should attempt
    * to connect to the first target first, then the second if the first fails,
    * etc.)
    *
    * If the DNS resolution fails, @error (if non-%NULL) will be set to a value
    * from #GResolverError and %NULL will be returned.
    *
    * If @cancellable is non-%NULL, it can be used to cancel the operation, in
    * which case @error (if non-%NULL) will be set to %G_IO_ERROR_CANCELLED.
    *
    * If you are planning to connect to the service, it is usually easier to
    * create a #GNetworkService and use its #GSocketConnectable interface.
    */
  def lookupService(
      service: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      protocol: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      domain: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      cancellable: Option[Cancellable /* Some(Ptr[GCancellable]) */ ]
  )(using Zone): GResult[Ptr[GList] /* None */ ] = GResult.wrap(__errorPtr =>
    g_resolver_lookup_service(
      this.raw.asInstanceOf[Ptr[GResolver]],
      __sn_extract_string(service).asInstanceOf[Ptr[gchar]],
      __sn_extract_string(protocol).asInstanceOf[Ptr[gchar]],
      __sn_extract_string(domain).asInstanceOf[Ptr[gchar]],
      cancellable
        .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
        .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
      __errorPtr
    )
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Begins asynchronously performing a DNS SRV lookup for the given
    * @service
    *   and @protocol in the given @domain, and eventually calls
    * @callback,
    *   which must call g_resolver_lookup_service_finish() to get the final
    *   result. See g_resolver_lookup_service() for more details.
    */
  def lookupServiceAsync(
      service: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      protocol: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      domain: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */,
      cancellable: Option[Cancellable /* Some(Ptr[GCancellable]) */ ],
      callback: Option[GAsyncReadyCallback /* Some(GAsyncReadyCallback) */ ],
      user_data: Option[
        Ptr[Byte] /* Some(_root_.sn.gnome.glib.internal.gpointer) */
      ]
  )(using Zone): Unit /* None */ = g_resolver_lookup_service_async(
    this.raw.asInstanceOf[Ptr[GResolver]],
    __sn_extract_string(service).asInstanceOf[Ptr[gchar]],
    __sn_extract_string(protocol).asInstanceOf[Ptr[gchar]],
    __sn_extract_string(domain).asInstanceOf[Ptr[gchar]],
    cancellable
      .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
      .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
    callback
      .map[GAsyncReadyCallback](o => o)
      .getOrElse(null.asInstanceOf[GAsyncReadyCallback]),
    user_data
      .map[_root_.sn.gnome.glib.internal.gpointer](o => gpointer(o))
      .getOrElse(null.asInstanceOf[_root_.sn.gnome.glib.internal.gpointer])
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Retrieves the result of a previous call to
    * g_resolver_lookup_service_async().
    *
    * If the DNS resolution failed, @error (if non-%NULL) will be set to a value
    * from #GResolverError. If the operation was cancelled,
    * @error
    *   will be set to %G_IO_ERROR_CANCELLED.
    */
  def lookupServiceFinish(
      result: AsyncResult /* Some(Ptr[GAsyncResult]) */
  ): GResult[Ptr[GList] /* None */ ] = GResult.wrap(__errorPtr =>
    g_resolver_lookup_service_finish(
      this.raw.asInstanceOf[Ptr[GResolver]],
      result.getUnsafeRawPointer().asInstanceOf,
      __errorPtr
    )
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Sets @resolver to be the application's default resolver (reffing
    * @resolver,
    *   and unreffing the previous default resolver, if any). Future calls to
    *   g_resolver_get_default() will return this resolver.
    *
    * This can be used if an application wants to perform any sort of DNS
    * caching or "pinning"; it can implement its own #GResolver that calls the
    * original default resolver for DNS operations, and implements its own cache
    * policies on top of that, and then set itself as the default resolver for
    * all later code to use.
    */
  def setDefault(): Unit /* None */ = g_resolver_set_default(
    this.raw.asInstanceOf[Ptr[GResolver]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Set the timeout applied to all resolver lookups. See #GResolver:timeout.
    */
  def setTimeout(timeout_ms: UInt /* Some(CUnsignedInt) */ ): Unit /* None */ =
    g_resolver_set_timeout(
      this.raw.asInstanceOf[Ptr[GResolver]],
      guint(timeout_ms).asInstanceOf
    )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end Resolver
