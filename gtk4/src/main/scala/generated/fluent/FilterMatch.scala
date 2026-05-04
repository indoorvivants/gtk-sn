package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkFilterMatch

/** Describes the known strictness of a filter.
  *
  * Note that for filters where the strictness is not known,
  * %GTK_FILTER_MATCH_SOME is always an acceptable value, even if a filter does
  * match all or no items.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum FilterMatch(val raw: GtkFilterMatch):
  /** The filter matches some items, gtk_filter_match() may return %TRUE or
    * %FALSE
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SOME extends FilterMatch(GtkFilterMatch.GTK_FILTER_MATCH_SOME)

  /** The filter does not match any item, gtk_filter_match() will always return
    * %FALSE.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NONE extends FilterMatch(GtkFilterMatch.GTK_FILTER_MATCH_NONE)

  /** The filter matches all items, gtk_filter_match() will alays return %TRUE.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case ALL extends FilterMatch(GtkFilterMatch.GTK_FILTER_MATCH_ALL)
end FilterMatch

object FilterMatch:
  def fromRaw(raw: GtkFilterMatch): FilterMatch =
    raw match
      case GtkFilterMatch.GTK_FILTER_MATCH_SOME => FilterMatch.SOME
      case GtkFilterMatch.GTK_FILTER_MATCH_NONE => FilterMatch.NONE
      case GtkFilterMatch.GTK_FILTER_MATCH_ALL  => FilterMatch.ALL
  end fromRaw
end FilterMatch
