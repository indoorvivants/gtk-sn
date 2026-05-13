package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GIOModule
import sn.gnome.glib.internal.gchar
import sn.gnome.gobject.fluent.{TypeModule, TypePlugin}
import sn.gnome.gobject.internal.GTypeModule
import sn.gnome.gobject.runtime.*
import sn.gnome.runtime.*

/** Provides an interface and default functions for loading and unloading
  * modules. This is used internally to make GIO extensible, but can also be
  * used by others to implement module loading.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class IOModule private[gnome] (raw: Ptr[GIOModule])
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
  def load(): Unit /* None */ =
    g_io_module_load(this.getUnsafeRawPointer().asInstanceOf[Ptr[GIOModule]])
  end load

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
  def unload(): Unit /* None */ =
    g_io_module_unload(this.getUnsafeRawPointer().asInstanceOf[Ptr[GIOModule]])
  end unload

  /** Decreases the use count of a #GTypeModule by one. If the result is zero,
    * the module will be unloaded. (However, the #GTypeModule will not be freed,
    * and types associated with the #GTypeModule are not unregistered. Once a
    * #GTypeModule is initialized, it must exist forever.)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method unuse]: Method unuse is weird: I don't want to deal with this"
  )
  private def unuse__ = ???

  /** Increases the use count of a #GTypeModule by one. If the use count was
    * zero before, the plugin will be loaded. If loading the plugin fails, the
    * use count is reset to its prior value.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method use]: Method use is weird: Incompatible override between TypeModule and TypePlugin"
  )
  private def use__ = ???

end IOModule

object IOModule:
  /** Creates or retrieves the wrapper object associated with the given pointer
    */
  def applyUnsafe(ptr: Ptr[GIOModule])(using Runtime) = summon[Runtime]
    .getOrCreate[IOModule](ptr.asInstanceOf[Ptr[Byte]], p => new IOModule(ptr))

  /** Creates a new GIOModule that will load the specific shared library when in
    * use.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def apply(
      filename: String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone, Runtime): IOModule =
    val raw: Ptr[Byte] = g_io_module_new(
      toCString(filename).asInstanceOf[Ptr[gchar]]
    ).asInstanceOf
    summon[Runtime]
      .getOrCreate[IOModule](raw, r => IOModule.applyUnsafe(r.asInstanceOf))
  end apply

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
  def query()(using Zone): Array[String] /* Some(Ptr[CString]) */ = MemoryRead
    .nullTerminatedPointerArray(g_io_module_query())
    .map(fromCString(_))

end IOModule
