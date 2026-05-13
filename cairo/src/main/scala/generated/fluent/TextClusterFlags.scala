package sn.gnome.cairo

import _root_.sn.gnome.cairo.internal.cairo_text_cluster_flags_t

enum TextClusterFlags(val raw: cairo_text_cluster_flags_t):
  case BACKWARD
      extends TextClusterFlags(
        cairo_text_cluster_flags_t.CAIRO_TEXT_CLUSTER_FLAG_BACKWARD
      )
end TextClusterFlags

object TextClusterFlags:
  def fromRaw(raw: cairo_text_cluster_flags_t): TextClusterFlags =
    raw match
      case cairo_text_cluster_flags_t.CAIRO_TEXT_CLUSTER_FLAG_BACKWARD =>
        TextClusterFlags.BACKWARD
  end fromRaw
end TextClusterFlags
