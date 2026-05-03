package sn.gnome.gio.fluent

import _root_.sn.gnome.gio.internal.GEmblemOrigin

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * GEmblemOrigin is used to add information about the origin of the emblem to
  * #GEmblem.
  */
enum EmblemOrigin(val raw: GEmblemOrigin):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Emblem of unknown origin
    */
  case UNKNOWN extends EmblemOrigin(GEmblemOrigin.G_EMBLEM_ORIGIN_UNKNOWN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Emblem adds device-specific information
    */
  case DEVICE extends EmblemOrigin(GEmblemOrigin.G_EMBLEM_ORIGIN_DEVICE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Emblem depicts live metadata, such as "readonly"
    */
  case LIVEMETADATA
      extends EmblemOrigin(GEmblemOrigin.G_EMBLEM_ORIGIN_LIVEMETADATA)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Emblem comes from a user-defined tag, e.g. set by nautilus (in the future)
    */
  case TAG extends EmblemOrigin(GEmblemOrigin.G_EMBLEM_ORIGIN_TAG)
end EmblemOrigin

object EmblemOrigin:
  def fromRaw(raw: GEmblemOrigin): EmblemOrigin =
    raw match
      case GEmblemOrigin.G_EMBLEM_ORIGIN_UNKNOWN      => EmblemOrigin.UNKNOWN
      case GEmblemOrigin.G_EMBLEM_ORIGIN_DEVICE       => EmblemOrigin.DEVICE
      case GEmblemOrigin.G_EMBLEM_ORIGIN_LIVEMETADATA =>
        EmblemOrigin.LIVEMETADATA
      case GEmblemOrigin.G_EMBLEM_ORIGIN_TAG => EmblemOrigin.TAG
  end fromRaw
end EmblemOrigin
