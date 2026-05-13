package sn.gnome.cairo

import _root_.sn.gnome.cairo.internal.cairo_path_data_type_t

enum PathDataType(val raw: cairo_path_data_type_t):
  case MOVE_TO extends PathDataType(cairo_path_data_type_t.CAIRO_PATH_MOVE_TO)
  case LINE_TO extends PathDataType(cairo_path_data_type_t.CAIRO_PATH_LINE_TO)
  case CURVE_TO extends PathDataType(cairo_path_data_type_t.CAIRO_PATH_CURVE_TO)
  case CLOSE_PATH
      extends PathDataType(cairo_path_data_type_t.CAIRO_PATH_CLOSE_PATH)
end PathDataType

object PathDataType:
  def fromRaw(raw: cairo_path_data_type_t): PathDataType =
    raw match
      case cairo_path_data_type_t.CAIRO_PATH_MOVE_TO    => PathDataType.MOVE_TO
      case cairo_path_data_type_t.CAIRO_PATH_LINE_TO    => PathDataType.LINE_TO
      case cairo_path_data_type_t.CAIRO_PATH_CURVE_TO   => PathDataType.CURVE_TO
      case cairo_path_data_type_t.CAIRO_PATH_CLOSE_PATH =>
        PathDataType.CLOSE_PATH
  end fromRaw
end PathDataType
