package sn.gnome.gio

import _root_.sn.gnome.gio.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.gio.internal.GIOModuleScope
import sn.gnome.glib.internal.gchar

/** Represents a scope for loading IO modules. A scope can be used for blocking
  * duplicate modules, or blocking a module you don't want to load.
  *
  * The scope can be used with g_io_modules_load_all_in_directory_with_scope()
  * or g_io_modules_scan_all_in_directory_with_scope().
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class IOModuleScope private[gnome] (raw: Ptr[GIOModuleScope]):

  def getUnsafeRawPointer(): Ptr[GIOModuleScope] = this.raw

  /** Block modules with the given @basename from being loaded when this scope
    * is used with g_io_modules_scan_all_in_directory_with_scope() or
    * g_io_modules_load_all_in_directory_with_scope().
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def block(
      basename: scala.Predef.String /* Some(Ptr[_root_.sn.gnome.glib.internal.gchar]) */
  )(using Zone): Unit /* None */ =
    g_io_module_scope_block(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GIOModuleScope]],
      toCString(basename).asInstanceOf[Ptr[gchar]]
    )
  end block

  /** Free a module scope.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def free(): Unit /* None */ =
    g_io_module_scope_free(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GIOModuleScope]]
    )
  end free

end IOModuleScope

object IOModuleScope:
  def fromRaw(ptr: Ptr[GIOModuleScope]): IOModuleScope = new IOModuleScope(ptr)
end IOModuleScope
