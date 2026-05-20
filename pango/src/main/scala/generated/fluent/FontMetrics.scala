package sn.gnome.pango

import _root_.sn.gnome.pango.internal.*

import _root_.scala.scalanative.unsafe.*

import sn.gnome.pango.FontMetrics
import sn.gnome.pango.internal.PangoFontMetrics

/** A `PangoFontMetrics` structure holds the overall metric information for a
  * font.
  *
  * The information in a `PangoFontMetrics` structure may be restricted to a
  * script. The fields of this structure are private to implementations of a
  * font backend. See the documentation of the corresponding getters for
  * documentation of their meaning.
  *
  * For an overview of the most important metrics, see:
  *
  * <picture> <source srcset="fontmetrics-dark.png"
  * media="(prefers-color-scheme: dark)"> <img alt="Font metrics"
  * src="fontmetrics-light.png"> </picture>
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class FontMetrics private[gnome] (raw: Ptr[PangoFontMetrics]):

  def getUnsafeRawPointer(): Ptr[PangoFontMetrics] = this.raw

  /** Gets the approximate character width for a font metrics structure.
    *
    * This is merely a representative value useful, for example, for determining
    * the initial size for a window. Actual characters in text will be wider and
    * narrower than this.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getApproximateCharWidth(): Int /* None */ =
    pango_font_metrics_get_approximate_char_width(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoFontMetrics]]
    )
  end getApproximateCharWidth

  /** Gets the approximate digit width for a font metrics structure.
    *
    * This is merely a representative value useful, for example, for determining
    * the initial size for a window. Actual digits in text can be wider or
    * narrower than this, though this value is generally somewhat more accurate
    * than the result of pango_font_metrics_get_approximate_char_width() for
    * digits.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getApproximateDigitWidth(): Int /* None */ =
    pango_font_metrics_get_approximate_digit_width(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoFontMetrics]]
    )
  end getApproximateDigitWidth

  /** Gets the ascent from a font metrics structure.
    *
    * The ascent is the distance from the baseline to the logical top of a line
    * of text. (The logical top may be above or below the top of the actual
    * drawn ink. It is necessary to lay out the text to figure where the ink
    * will be.)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getAscent(): Int /* None */ =
    pango_font_metrics_get_ascent(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoFontMetrics]]
    )
  end getAscent

  /** Gets the descent from a font metrics structure.
    *
    * The descent is the distance from the baseline to the logical bottom of a
    * line of text. (The logical bottom may be above or below the bottom of the
    * actual drawn ink. It is necessary to lay out the text to figure where the
    * ink will be.)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getDescent(): Int /* None */ =
    pango_font_metrics_get_descent(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoFontMetrics]]
    )
  end getDescent

  /** Gets the line height from a font metrics structure.
    *
    * The line height is the recommended distance between successive baselines
    * in wrapped text using this font.
    *
    * If the line height is not available, 0 is returned.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getHeight(): Int /* None */ =
    pango_font_metrics_get_height(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoFontMetrics]]
    )
  end getHeight

  /** Gets the suggested position to draw the strikethrough.
    *
    * The value returned is the distance *above* the baseline of the top of the
    * strikethrough.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getStrikethroughPosition(): Int /* None */ =
    pango_font_metrics_get_strikethrough_position(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoFontMetrics]]
    )
  end getStrikethroughPosition

  /** Gets the suggested thickness to draw for the strikethrough.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getStrikethroughThickness(): Int /* None */ =
    pango_font_metrics_get_strikethrough_thickness(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoFontMetrics]]
    )
  end getStrikethroughThickness

  /** Gets the suggested position to draw the underline.
    *
    * The value returned is the distance *above* the baseline of the top of the
    * underline. Since most fonts have underline positions beneath the baseline,
    * this value is typically negative.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getUnderlinePosition(): Int /* None */ =
    pango_font_metrics_get_underline_position(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoFontMetrics]]
    )
  end getUnderlinePosition

  /** Gets the suggested thickness to draw for the underline.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def getUnderlineThickness(): Int /* None */ =
    pango_font_metrics_get_underline_thickness(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoFontMetrics]]
    )
  end getUnderlineThickness

  /** Increase the reference count of a font metrics structure by one.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def ref(): sn.gnome.pango.FontMetrics /* None */ =
    sn.gnome.pango.FontMetrics.fromRaw(
      pango_font_metrics_ref(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoFontMetrics]]
      )
    )
  end ref

  /** Decrease the reference count of a font metrics structure by one.
    *
    * If the result is zero, frees the structure and any associated memory.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def unref(): Unit /* None */ =
    pango_font_metrics_unref(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoFontMetrics]]
    )
  end unref

end FontMetrics

object FontMetrics:
  def fromRaw(ptr: Ptr[PangoFontMetrics]): FontMetrics = new FontMetrics(ptr)
end FontMetrics
