package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkInscriptionOverflow

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * The different methods to handle text in #GtkInscription when it doesn't fit
  * the available space.
  */
enum InscriptionOverflow(val raw: GtkInscriptionOverflow):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Clip the remaining text
    */
  case CLIP
      extends InscriptionOverflow(
        GtkInscriptionOverflow.GTK_INSCRIPTION_OVERFLOW_CLIP
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Omit characters at the start of the text
    */
  case ELLIPSIZE_START
      extends InscriptionOverflow(
        GtkInscriptionOverflow.GTK_INSCRIPTION_OVERFLOW_ELLIPSIZE_START
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Omit characters at the middle of the text
    */
  case ELLIPSIZE_MIDDLE
      extends InscriptionOverflow(
        GtkInscriptionOverflow.GTK_INSCRIPTION_OVERFLOW_ELLIPSIZE_MIDDLE
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Omit characters at the end of the text
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
