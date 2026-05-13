package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gio.{AsyncResult, Cancellable, InetAddress, Resolver}
import sn.gnome.gio.internal.GResolver
import sn.gnome.glib.GResult
import sn.gnome.glib.internal.{gchar, gpointer, guint}
import sn.gnome.gobject.Object
import sn.gnome.gobject.internal.{
  GClosure,
  GClosureNotify,
  GConnectFlags,
  g_signal_connect_data
}
import sn.gnome.gobject.runtime.*
import sn.gnome.runtime.*

/** #GResolver provides cancellable synchronous and asynchronous DNS resolution,
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
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class Resolver private[gnome] (raw: Ptr[GResolver])
    extends Object(raw.asInstanceOf):

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Get the timeout applied to all resolver lookups. See #GResolver:timeout.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getTimeout(): UInt /* None */ =
    g_resolver_get_timeout(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GResolver]]
    ).asInstanceOf
  end getTimeout

  /** Synchronously reverse-resolves @address to determine its associated
    * hostname.
    *
    * If the DNS resolution fails, @error (if non-%NULL) will be set to a value
    * from #GResolverError.
    *
    * If @cancellable is non-%NULL, it can be used to cancel the operation, in
    * which case @error (if non-%NULL) will be set to %G_IO_ERROR_CANCELLED.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def lookupByAddress(
      address: sn.gnome.gio.InetAddress /* Some(Ptr[GInetAddress]) */,
      cancellable: Option[
        sn.gnome.gio.Cancellable /* Some(Ptr[GCancellable]) */
      ]
  )(using Zone, Runtime): GResult[String /* None */ ] =
    GResult.wrap(__errorPtr =>
      fromCString(
        g_resolver_lookup_by_address(
          this.getUnsafeRawPointer().asInstanceOf[Ptr[GResolver]],
          address.getUnsafeRawPointer().asInstanceOf,
          cancellable
            .map[Ptr[GCancellable]](o => o.getUnsafeRawPointer().asInstanceOf)
            .getOrElse(null.asInstanceOf[Ptr[GCancellable]]),
          __errorPtr
        ).asInstanceOf
      )
    )
  end lookupByAddress

  /** Begins asynchronously reverse-resolving @address to determine its
    * associated hostname, and eventually calls @callback, which must call
    * g_resolver_lookup_by_address_finish() to get the final result.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method lookup_by_address_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def lookupByAddressAsync__ = ???

  /** Retrieves the result of a previous call to
    * g_resolver_lookup_by_address_async().
    *
    * If the DNS resolution failed, @error (if non-%NULL) will be set to a value
    * from #GResolverError. If the operation was cancelled,
    * @error
    *   will be set to %G_IO_ERROR_CANCELLED.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def lookupByAddressFinish(
      result: AsyncResult /* Some(Ptr[GAsyncResult]) */
  )(using Zone): GResult[String /* None */ ] =
    GResult.wrap(__errorPtr =>
      fromCString(
        g_resolver_lookup_by_address_finish(
          this.getUnsafeRawPointer().asInstanceOf[Ptr[GResolver]],
          result.getUnsafeRawPointer().asInstanceOf,
          __errorPtr
        ).asInstanceOf
      )
    )
  end lookupByAddressFinish

  /** Synchronously resolves @hostname to determine its associated IP
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method lookup_by_name/return type]: Cannot render type Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(InetAddress))))),ListMap(@name -> DataRecord(GLib.List), @type -> DataRecord(GList*)))"
  )
  private def lookupByName__ = ???

  /** Begins asynchronously resolving @hostname to determine its associated IP
    * address(es), and eventually calls @callback, which must call
    * g_resolver_lookup_by_name_finish() to get the result. See
    * g_resolver_lookup_by_name() for more details.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method lookup_by_name_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def lookupByNameAsync__ = ???

  /** Retrieves the result of a call to g_resolver_lookup_by_name_async().
    *
    * If the DNS resolution failed, @error (if non-%NULL) will be set to a value
    * from #GResolverError. If the operation was cancelled,
    * @error
    *   will be set to %G_IO_ERROR_CANCELLED.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method lookup_by_name_finish/return type]: Cannot render type Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(InetAddress))))),ListMap(@name -> DataRecord(GLib.List), @type -> DataRecord(GList*)))"
  )
  private def lookupByNameFinish__ = ???

  /** This differs from g_resolver_lookup_by_name() in that you can modify the
    * lookup behavior with @flags. For example this can be used to limit results
    * with %G_RESOLVER_NAME_LOOKUP_FLAGS_IPV4_ONLY.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method lookup_by_name_with_flags/return type]: Cannot render type Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(InetAddress))))),ListMap(@name -> DataRecord(GLib.List), @type -> DataRecord(GList*)))"
  )
  private def lookupByNameWithFlags__ = ???

  /** Begins asynchronously resolving @hostname to determine its associated IP
    * address(es), and eventually calls @callback, which must call
    * g_resolver_lookup_by_name_with_flags_finish() to get the result. See
    * g_resolver_lookup_by_name() for more details.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method lookup_by_name_with_flags_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def lookupByNameWithFlagsAsync__ = ???

  /** Retrieves the result of a call to
    * g_resolver_lookup_by_name_with_flags_async().
    *
    * If the DNS resolution failed, @error (if non-%NULL) will be set to a value
    * from #GResolverError. If the operation was cancelled,
    * @error
    *   will be set to %G_IO_ERROR_CANCELLED.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method lookup_by_name_with_flags_finish/return type]: Cannot render type Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(InetAddress))))),ListMap(@name -> DataRecord(GLib.List), @type -> DataRecord(GList*)))"
  )
  private def lookupByNameWithFlagsFinish__ = ???

  /** Synchronously performs a DNS record lookup for the given @rrname and
    * returns a list of records as #GVariant tuples. See #GResolverRecordType
    * for information on what the records contain for each @record_type.
    *
    * If the DNS resolution fails, @error (if non-%NULL) will be set to a value
    * from #GResolverError and %NULL will be returned.
    *
    * If @cancellable is non-%NULL, it can be used to cancel the operation, in
    * which case @error (if non-%NULL) will be set to %G_IO_ERROR_CANCELLED.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method lookup_records/return type]: Cannot render type Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(GLib.Variant))))),ListMap(@name -> DataRecord(GLib.List), @type -> DataRecord(GList*)))"
  )
  private def lookupRecords__ = ???

  /** Begins asynchronously performing a DNS lookup for the given
    * @rrname,
    *   and eventually calls @callback, which must call
    *   g_resolver_lookup_records_finish() to get the final result. See
    *   g_resolver_lookup_records() for more details.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method lookup_records_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def lookupRecordsAsync__ = ???

  /** Retrieves the result of a previous call to
    * g_resolver_lookup_records_async(). Returns a non-empty list of records as
    * #GVariant tuples. See #GResolverRecordType for information on what the
    * records contain.
    *
    * If the DNS resolution failed, @error (if non-%NULL) will be set to a value
    * from #GResolverError. If the operation was cancelled,
    * @error
    *   will be set to %G_IO_ERROR_CANCELLED.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method lookup_records_finish/return type]: Cannot render type Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(GLib.Variant))))),ListMap(@name -> DataRecord(GLib.List), @type -> DataRecord(GList*)))"
  )
  private def lookupRecordsFinish__ = ???

  /** Synchronously performs a DNS SRV lookup for the given @service and
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
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method lookup_service/return type]: Cannot render type Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(SrvTarget))))),ListMap(@name -> DataRecord(GLib.List), @type -> DataRecord(GList*)))"
  )
  private def lookupService__ = ???

  /** Begins asynchronously performing a DNS SRV lookup for the given
    * @service
    *   and @protocol in the given @domain, and eventually calls
    * @callback,
    *   which must call g_resolver_lookup_service_finish() to get the final
    *   result. See g_resolver_lookup_service() for more details.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method lookup_service_async/<method parameters>/callback]: Cannot render type Type(List(),ListMap(@name -> DataRecord(AsyncReadyCallback), @type -> DataRecord(GAsyncReadyCallback)))"
  )
  private def lookupServiceAsync__ = ???

  /** Retrieves the result of a previous call to
    * g_resolver_lookup_service_async().
    *
    * If the DNS resolution failed, @error (if non-%NULL) will be set to a value
    * from #GResolverError. If the operation was cancelled,
    * @error
    *   will be set to %G_IO_ERROR_CANCELLED.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method lookup_service_finish/return type]: Cannot render type Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(SrvTarget))))),ListMap(@name -> DataRecord(GLib.List), @type -> DataRecord(GList*)))"
  )
  private def lookupServiceFinish__ = ???

  /** Sets @resolver to be the application's default resolver (reffing
    * @resolver,
    *   and unreffing the previous default resolver, if any). Future calls to
    *   g_resolver_get_default() will return this resolver.
    *
    * This can be used if an application wants to perform any sort of DNS
    * caching or "pinning"; it can implement its own #GResolver that calls the
    * original default resolver for DNS operations, and implements its own cache
    * policies on top of that, and then set itself as the default resolver for
    * all later code to use.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setDefault(): Unit /* None */ =
    g_resolver_set_default(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GResolver]]
    )
  end setDefault

  /** Set the timeout applied to all resolver lookups. See #GResolver:timeout.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def setTimeout(timeout_ms: UInt /* Some(CUnsignedInt) */ ): Unit /* None */ =
    g_resolver_set_timeout(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GResolver]],
      guint(timeout_ms).asInstanceOf
    )
  end setTimeout

  /** Emitted when the resolver notices that the system resolver configuration
    * has changed.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def onReload(handler: => Unit)(using Runtime) =
    type SignalRegType = SignalRegistration[this.type, EmptyTuple.type, Unit]
    val c_handler = CFuncPtr2.fromScalaFunction {
      (
          self: Ptr[GResolver],
          data: Ptr[SignalRegType]
      ) =>
        val sr = !data
        sr.handler(EmptyTuple)
    }
    val f = (e: EmptyTuple.type) => handler
    val sr: SignalRegType = SignalRegistration(this, f)
    val (ptr, mem) = Captured.unsafe(sr)
    val destroy_data = CFuncPtr2.fromScalaFunction {
      (data: gpointer, closure: Ptr[GClosure]) =>
        val sr = !data.asInstanceOf[Ptr[SignalRegType]]
        GCRoots.removeRoot(sr)
    }
    val flags = GConnectFlags.G_CONNECT_DEFAULT
    val signal = c"reload"
    SignalHandleID(
      g_signal_connect_data(
        gpointer(this.getUnsafeRawPointer().asInstanceOf[Ptr[Byte]]),
        signal.asInstanceOf[Ptr[gchar]],
        c_handler.asGCallback,
        gpointer(ptr.asInstanceOf[Ptr[Byte]]), // data
        GClosureNotify(destroy_data), // destroy_data
        flags
      ).value
    )
  end onReload
end Resolver

object Resolver:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GResolver])(using Runtime) = summon[Runtime]
    .getOrCreate[Resolver](ptr.asInstanceOf[Ptr[Byte]], p => new Resolver(ptr))

  /** Frees @addresses (which should be the return value from
    * g_resolver_lookup_by_name() or g_resolver_lookup_by_name_finish()). (This
    * is a convenience method; you can also simply free the results by hand.)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[function free_addresses/<function parameters>/addresses]: Cannot render type Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(gpointer), @type -> DataRecord(gpointer))))),ListMap(@name -> DataRecord(GLib.List), @type -> DataRecord(GList*)))"
  )
  private def freeAddresses() = ???

  /** Frees @targets (which should be the return value from
    * g_resolver_lookup_service() or g_resolver_lookup_service_finish()). (This
    * is a convenience method; you can also simply free the results by hand.)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[function free_targets/<function parameters>/targets]: Cannot render type Type(List(DataRecord({http://www.gtk.org/introspection/core/1.0}type,Type(List(),ListMap(@name -> DataRecord(gpointer), @type -> DataRecord(gpointer))))),ListMap(@name -> DataRecord(GLib.List), @type -> DataRecord(GList*)))"
  )
  private def freeTargets() = ???

  /** Gets the default #GResolver. You should unref it when you are done with
    * it. #GResolver may use its reference count as a hint about how many
    * threads it should allocate for concurrent DNS resolutions.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDefault()(using
      Runtime
  ): sn.gnome.gio.Resolver /* Some(Ptr[GResolver]) */ =
    sn.gnome.gio.Resolver.applyUnsafe(g_resolver_get_default().asInstanceOf)

end Resolver
