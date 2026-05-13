package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.GtkInscriptionOverflow

/** The different methods to handle text in #GtkInscription when it doesn't fit
  * the available space.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum InscriptionOverflow(val raw: GtkInscriptionOverflow):
  /** Clip the remaining text
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CLIP
      extends InscriptionOverflow(
        GtkInscriptionOverflow.GTK_INSCRIPTION_OVERFLOW_CLIP
      )

  /** Omit characters at the start of the text
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case ELLIPSIZE_START
      extends InscriptionOverflow(
        GtkInscriptionOverflow.GTK_INSCRIPTION_OVERFLOW_ELLIPSIZE_START
      )

  /** Omit characters at the middle of the text
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case ELLIPSIZE_MIDDLE
      extends InscriptionOverflow(
        GtkInscriptionOverflow.GTK_INSCRIPTION_OVERFLOW_ELLIPSIZE_MIDDLE
      )

  /** Omit characters at the end of the text
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case ELLIPSIZE_END
      extends InscriptionOverflow(
        GtkInscriptionOverflow.GTK_INSCRIPTION_OVERFLOW_ELLIPSIZE_END
      )
end InscriptionOverflow

object InscriptionOverflow:
  def fromRaw(raw: GtkInscriptionOverflow): InscriptionOverflow =
    raw match
      case GtkInscriptionOverflow.GTK_INSCRIPTION_OVERFLOW_CLIP =>
        InscriptionOverflow.CLIP
      case GtkInscriptionOverflow.GTK_INSCRIPTION_OVERFLOW_ELLIPSIZE_START =>
        InscriptionOverflow.ELLIPSIZE_START
      case GtkInscriptionOverflow.GTK_INSCRIPTION_OVERFLOW_ELLIPSIZE_MIDDLE =>
        InscriptionOverflow.ELLIPSIZE_MIDDLE
      case GtkInscriptionOverflow.GTK_INSCRIPTION_OVERFLOW_ELLIPSIZE_END =>
        InscriptionOverflow.ELLIPSIZE_END
  end fromRaw
end InscriptionOverflow
