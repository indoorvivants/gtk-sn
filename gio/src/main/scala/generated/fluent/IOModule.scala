package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GIOModule
import sn.gnome.glib.internal.gchar
import sn.gnome.gobject.fluent.TypeModule
import sn.gnome.gobject.fluent.TypePlugin

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Provides an interface and default functions for loading and unloading
  * modules. This is used internally to make GIO extensible, but can also be
  * used by others to implement module loading.
  */
class IOModule(raw: Ptr[GIOModule])
    extends TypeModule(raw.asInstanceOf),
      TypePlugin:

  override def getUnsafeRawPointer(): Ptr[Byte] = this.raw.asInstanceOf

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Required API for GIO modules to implement.
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
    */
  def load(): Unit /* None */ = g_io_module_load(
    this.raw.asInstanceOf[Ptr[GIOModule]]
  )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Required API for GIO modules to implement.
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
    */
  def unload(): Unit /* None */ = g_io_module_unload(
    this.raw.asInstanceOf[Ptr[GIOModule]]
  )

end IOModule

object IOModule:
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Creates a new GIOModule that will load the specific shared library when in
    * use.
    */
  def apply(
      filename: String |
        CString /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): IOModule = new IOModule(
    g_io_module_new(
      __sn_extract_string(filename).asInstanceOf[Ptr[gchar]]
    ).asInstanceOf
  )

  private inline def __sn_extract_string(str: String | CString)(using
      Zone
  ): CString =
    str match
      case s: String  => toCString(s)
      case s: CString => s
    end match
  end __sn_extract_string
end IOModule
