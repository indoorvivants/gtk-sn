package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.GIOModuleScopeFlags

/** Flags for use with g_io_module_scope_new().
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum IOModuleScopeFlags(val raw: GIOModuleScopeFlags):
  /** No module scan flags
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NONE
      extends IOModuleScopeFlags(GIOModuleScopeFlags.G_IO_MODULE_SCOPE_NONE)

  /** When using this scope to load or scan modules, automatically block a
    * modules which has the same base basename as previously loaded module.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case BLOCK_DUPLICATES
      extends IOModuleScopeFlags(
        GIOModuleScopeFlags.G_IO_MODULE_SCOPE_BLOCK_DUPLICATES
      )
end IOModuleScopeFlags

object IOModuleScopeFlags:
  def fromRaw(raw: GIOModuleScopeFlags): IOModuleScopeFlags =
    raw match
      case GIOModuleScopeFlags.G_IO_MODULE_SCOPE_NONE => IOModuleScopeFlags.NONE
      case GIOModuleScopeFlags.G_IO_MODULE_SCOPE_BLOCK_DUPLICATES =>
        IOModuleScopeFlags.BLOCK_DUPLICATES
  end fromRaw
end IOModuleScopeFlags
