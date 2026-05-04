package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkContentFit

/** Controls how a content should be made to fit inside an allocation.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum ContentFit(val raw: GtkContentFit):
  /** Make the content fill the entire allocation, without taking its aspect
    * ratio in consideration. The resulting content will appear as stretched if
    * its aspect ratio is different from the allocation aspect ratio.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case FILL extends ContentFit(GtkContentFit.GTK_CONTENT_FIT_FILL)

  /** Scale the content to fit the allocation, while taking its aspect ratio in
    * consideration. The resulting content will appear as letterboxed if its
    * aspect ratio is different from the allocation aspect ratio.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CONTAIN extends ContentFit(GtkContentFit.GTK_CONTENT_FIT_CONTAIN)

  /** Cover the entire allocation, while taking the content aspect ratio in
    * consideration. The resulting content will appear as clipped if its aspect
    * ratio is different from the allocation aspect ratio.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case COVER extends ContentFit(GtkContentFit.GTK_CONTENT_FIT_COVER)

  /** The content is scaled down to fit the allocation, if needed, otherwise its
    * original size is used.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SCALE_DOWN extends ContentFit(GtkContentFit.GTK_CONTENT_FIT_SCALE_DOWN)
end ContentFit

object ContentFit:
  def fromRaw(raw: GtkContentFit): ContentFit =
    raw match
      case GtkContentFit.GTK_CONTENT_FIT_FILL       => ContentFit.FILL
      case GtkContentFit.GTK_CONTENT_FIT_CONTAIN    => ContentFit.CONTAIN
      case GtkContentFit.GTK_CONTENT_FIT_COVER      => ContentFit.COVER
      case GtkContentFit.GTK_CONTENT_FIT_SCALE_DOWN => ContentFit.SCALE_DOWN
  end fromRaw
end ContentFit
