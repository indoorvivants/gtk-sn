package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GIOModule
import sn.gnome.glib.internal.gchar
import sn.gnome.gobject.fluent.{TypeModule, TypePlugin}

/** Provides an interface and default functions for loading and unloading
  * modules. This is used internally to make GIO extensible, but can also be
  * used by others to implement module loading.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class IOModule(raw: Ptr[GIOModule])
    extends TypeModule(raw.asInstanceOf),
      TypePlugin:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** Required API for GIO modules to implement.
    *
    * This function is run after the module has been loaded into GIO, to
    * initialize the module. Typically, this function will call
    * g_io_extension_point_implement().
    *
    * Since 2.56, this function should be named `g_io_<modulename>_load`, where
    * `modulename` is the plugin’s filename with the `lib` or `libgio` prefix
    * and everything after the first dot removed, and with `-` replaced with `_`
    * throughout. For example, `libgiognutls-helper.so` becomes `gnutls_helper`.
    * Using the new symbol names avoids name clashes when building modules
    * statically. The old symbol names continue to be supported, but cannot be
    * used for static builds.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def load(): Unit /* None */ = g_io_module_load(
    this.raw.asInstanceOf[Ptr[GIOModule]]
  )

  /** Required API for GIO modules to implement.
    *
    * This function is run when the module is being unloaded from GIO, to
    * finalize the module.
    *
    * Since 2.56, this function should be named `g_io_<modulename>_unload`,
    * where `modulename` is the plugin’s filename with the `lib` or `libgio`
    * prefix and everything after the first dot removed, and with `-` replaced
    * with `_` throughout. For example, `libgiognutls-helper.so` becomes
    * `gnutls_helper`. Using the new symbol names avoids name clashes when
    * building modules statically. The old symbol names continue to be
    * supported, but cannot be used for static builds.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unload(): Unit /* None */ = g_io_module_unload(
    this.raw.asInstanceOf[Ptr[GIOModule]]
  )

end IOModule

object IOModule:
  /** Creates a new GIOModule that will load the specific shared library when in
    * use.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      filename: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): IOModule = new IOModule(
    g_io_module_new(
      __sn_extract_string(filename).asInstanceOf[Ptr[gchar]]
    ).asInstanceOf
  )

  /** Optional API for GIO modules to implement.
    *
    * Should return a list of all the extension points that may be implemented
    * in this module.
    *
    * This method will not be called in normal use, however it may be called
    * when probing existing modules and recording which extension points that
    * this model is used for. This means we won't have to load and initialize
    * this module unless its needed.
    *
    * If this function is not implemented by the module the module will always
    * be loaded, initialized and then unloaded on application startup so that it
    * can register its extension points during init.
    *
    * Note that a module need not actually implement all the extension points
    * that g_io_module_query() returns, since the exact list of extension may
    * depend on runtime issues. However all extension points actually
    * implemented must be returned by g_io_module_query() (if defined).
    *
    * When installing a module that implements g_io_module_query() you must run
    * gio-querymodules in order to build the cache files required for lazy
    * loading.
    *
    * Since 2.56, this function should be named `g_io_<modulename>_query`, where
    * `modulename` is the plugin’s filename with the `lib` or `libgio` prefix
    * and everything after the first dot removed, and with `-` replaced with `_`
    * throughout. For example, `libgiognutls-helper.so` becomes `gnutls_helper`.
    * Using the new symbol names avoids name clashes when building modules
    * statically. The old symbol names continue to be supported, but cannot be
    * used for static builds.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def query()(using Zone): Array[String] /* Some(Ptr[CString]) */ =
    __decode_nullable_ptrs(g_io_module_query()).map(fromCString(_))

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string

  private inline def __decode_nullable_ptrs[T](p: Ptr[Ptr[T]])(using
      ptag: Tag[T]
  ): Array[Ptr[T]] =
    val ab = Array.newBuilder[Ptr[T]]
    var offset = 0
    val tg = Tag.materializePtrTag(using ptag)
    while p(offset)(using tg) != null do
      ab += p(offset)(using tg)
      offset += 1
    end while
    ab.result()
  end __decode_nullable_ptrs
end IOModule
