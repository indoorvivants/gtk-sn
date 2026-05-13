package sn.gnome.gio

import _root_.sn.gnome.gio.internal.GEmblemOrigin

/** GEmblemOrigin is used to add information about the origin of the emblem to
  * #GEmblem.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum EmblemOrigin(val raw: GEmblemOrigin):
  /** Emblem of unknown origin
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case UNKNOWN extends EmblemOrigin(GEmblemOrigin.G_EMBLEM_ORIGIN_UNKNOWN)

  /** Emblem adds device-specific information
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case DEVICE extends EmblemOrigin(GEmblemOrigin.G_EMBLEM_ORIGIN_DEVICE)

  /** Emblem depicts live metadata, such as "readonly"
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case LIVEMETADATA
      extends EmblemOrigin(GEmblemOrigin.G_EMBLEM_ORIGIN_LIVEMETADATA)

  /** Emblem comes from a user-defined tag, e.g. set by nautilus (in the future)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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
