package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkContentFit

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Controls how a content should be made to fit inside an allocation.
  */
enum ContentFit(val raw: GtkContentFit):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Make the content fill the entire allocation, without taking its aspect
    * ratio in consideration. The resulting content will appear as stretched if
    * its aspect ratio is different from the allocation aspect ratio.
    */
  case FILL extends ContentFit(GtkContentFit.GTK_CONTENT_FIT_FILL)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Scale the content to fit the allocation, while taking its aspect ratio in
    * consideration. The resulting content will appear as letterboxed if its
    * aspect ratio is different from the allocation aspect ratio.
    */
  case CONTAIN extends ContentFit(GtkContentFit.GTK_CONTENT_FIT_CONTAIN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Cover the entire allocation, while taking the content aspect ratio in
    * consideration. The resulting content will appear as clipped if its aspect
    * ratio is different from the allocation aspect ratio.
    */
  case COVER extends ContentFit(GtkContentFit.GTK_CONTENT_FIT_COVER)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The content is scaled down to fit the allocation, if needed, otherwise its
    * original size is used.
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
