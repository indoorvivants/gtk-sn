package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.GdkSurfaceEdge

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Determines a surface edge or corner.
  */
enum SurfaceEdge(val raw: GdkSurfaceEdge):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the top left corner.
    */
  case NORTH_WEST
      extends SurfaceEdge(GdkSurfaceEdge.GDK_SURFACE_EDGE_NORTH_WEST)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the top edge.
    */
  case NORTH extends SurfaceEdge(GdkSurfaceEdge.GDK_SURFACE_EDGE_NORTH)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the top right corner.
    */
  case NORTH_EAST
      extends SurfaceEdge(GdkSurfaceEdge.GDK_SURFACE_EDGE_NORTH_EAST)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the left edge.
    */
  case WEST extends SurfaceEdge(GdkSurfaceEdge.GDK_SURFACE_EDGE_WEST)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the right edge.
    */
  case EAST extends SurfaceEdge(GdkSurfaceEdge.GDK_SURFACE_EDGE_EAST)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the lower left corner.
    */
  case SOUTH_WEST
      extends SurfaceEdge(GdkSurfaceEdge.GDK_SURFACE_EDGE_SOUTH_WEST)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the lower edge.
    */
  case SOUTH extends SurfaceEdge(GdkSurfaceEdge.GDK_SURFACE_EDGE_SOUTH)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the lower right corner.
    */
  case SOUTH_EAST
      extends SurfaceEdge(GdkSurfaceEdge.GDK_SURFACE_EDGE_SOUTH_EAST)
end SurfaceEdge

object SurfaceEdge:
  def fromRaw(raw: GdkSurfaceEdge): SurfaceEdge =
    raw match
      case GdkSurfaceEdge.GDK_SURFACE_EDGE_NORTH_WEST => SurfaceEdge.NORTH_WEST
      case GdkSurfaceEdge.GDK_SURFACE_EDGE_NORTH      => SurfaceEdge.NORTH
      case GdkSurfaceEdge.GDK_SURFACE_EDGE_NORTH_EAST => SurfaceEdge.NORTH_EAST
      case GdkSurfaceEdge.GDK_SURFACE_EDGE_WEST       => SurfaceEdge.WEST
      case GdkSurfaceEdge.GDK_SURFACE_EDGE_EAST       => SurfaceEdge.EAST
      case GdkSurfaceEdge.GDK_SURFACE_EDGE_SOUTH_WEST => SurfaceEdge.SOUTH_WEST
      case GdkSurfaceEdge.GDK_SURFACE_EDGE_SOUTH      => SurfaceEdge.SOUTH
      case GdkSurfaceEdge.GDK_SURFACE_EDGE_SOUTH_EAST => SurfaceEdge.SOUTH_EAST
  end fromRaw
end SurfaceEdge
