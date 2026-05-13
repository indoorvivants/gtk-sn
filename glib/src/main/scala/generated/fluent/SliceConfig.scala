package sn.gnome.glib

import _root_.sn.gnome.glib.internal.GSliceConfig

enum SliceConfig(val raw: GSliceConfig):
  case ALWAYS_MALLOC
      extends SliceConfig(GSliceConfig.G_SLICE_CONFIG_ALWAYS_MALLOC)
  case BYPASS_MAGAZINES
      extends SliceConfig(GSliceConfig.G_SLICE_CONFIG_BYPASS_MAGAZINES)
  case WORKING_SET_MSECS
      extends SliceConfig(GSliceConfig.G_SLICE_CONFIG_WORKING_SET_MSECS)
  case COLOR_INCREMENT
      extends SliceConfig(GSliceConfig.G_SLICE_CONFIG_COLOR_INCREMENT)
  case CHUNK_SIZES extends SliceConfig(GSliceConfig.G_SLICE_CONFIG_CHUNK_SIZES)
  case CONTENTION_COUNTER
      extends SliceConfig(GSliceConfig.G_SLICE_CONFIG_CONTENTION_COUNTER)
end SliceConfig

object SliceConfig:
  def fromRaw(raw: GSliceConfig): SliceConfig =
    raw match
      case GSliceConfig.G_SLICE_CONFIG_ALWAYS_MALLOC =>
        SliceConfig.ALWAYS_MALLOC
      case GSliceConfig.G_SLICE_CONFIG_BYPASS_MAGAZINES =>
        SliceConfig.BYPASS_MAGAZINES
      case GSliceConfig.G_SLICE_CONFIG_WORKING_SET_MSECS =>
        SliceConfig.WORKING_SET_MSECS
      case GSliceConfig.G_SLICE_CONFIG_COLOR_INCREMENT =>
        SliceConfig.COLOR_INCREMENT
      case GSliceConfig.G_SLICE_CONFIG_CHUNK_SIZES => SliceConfig.CHUNK_SIZES
      case GSliceConfig.G_SLICE_CONFIG_CONTENTION_COUNTER =>
        SliceConfig.CONTENTION_COUNTER
  end fromRaw
end SliceConfig
