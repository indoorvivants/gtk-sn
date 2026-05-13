package sn.gnome.gdk4

import _root_.sn.gnome.gdk4.internal.GdkSurfaceEdge

/** Determines a surface edge or corner.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum SurfaceEdge(val raw: GdkSurfaceEdge):
  /** the top left corner.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NORTH_WEST
      extends SurfaceEdge(GdkSurfaceEdge.GDK_SURFACE_EDGE_NORTH_WEST)

  /** the top edge.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NORTH extends SurfaceEdge(GdkSurfaceEdge.GDK_SURFACE_EDGE_NORTH)

  /** the top right corner.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NORTH_EAST
      extends SurfaceEdge(GdkSurfaceEdge.GDK_SURFACE_EDGE_NORTH_EAST)

  /** the left edge.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case WEST extends SurfaceEdge(GdkSurfaceEdge.GDK_SURFACE_EDGE_WEST)

  /** the right edge.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case EAST extends SurfaceEdge(GdkSurfaceEdge.GDK_SURFACE_EDGE_EAST)

  /** the lower left corner.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SOUTH_WEST
      extends SurfaceEdge(GdkSurfaceEdge.GDK_SURFACE_EDGE_SOUTH_WEST)

  /** the lower edge.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SOUTH extends SurfaceEdge(GdkSurfaceEdge.GDK_SURFACE_EDGE_SOUTH)

  /** the lower right corner.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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
