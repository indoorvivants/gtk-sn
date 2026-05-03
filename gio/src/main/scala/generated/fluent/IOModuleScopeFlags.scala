package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.GIOModuleScopeFlags

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Flags for use with g_io_module_scope_new().
  */
enum IOModuleScopeFlags(val raw: GIOModuleScopeFlags):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * No module scan flags
    */
  case NONE
      extends IOModuleScopeFlags(GIOModuleScopeFlags.G_IO_MODULE_SCOPE_NONE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * When using this scope to load or scan modules, automatically block a
    * modules which has the same base basename as previously loaded module.
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
