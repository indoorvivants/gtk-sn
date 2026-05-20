package sn.gnome.pango

import _root_.sn.gnome.pango.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.glib.internal.{gboolean, gint, guint16}
import sn.gnome.pango.Color
import sn.gnome.pango.internal.PangoColor

/** The `PangoColor` structure is used to represent a color in an uncalibrated
  * RGB color-space.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class Color private[gnome] (raw: Ptr[PangoColor]):

  def getUnsafeRawPointer(): Ptr[PangoColor] = this.raw

  /** value of red component
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def red: UShort /* None */ =
    (!raw).red.asInstanceOf[_root_.sn.gnome.glib.internal.guint16]

  /** value of red component
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def red_=(value: UShort /* None */ ): Unit = (!raw).red_=(
    guint16(value).asInstanceOf[_root_.sn.gnome.glib.internal.guint16]
  )

  /** value of green component
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def green: UShort /* None */ =
    (!raw).green.asInstanceOf[_root_.sn.gnome.glib.internal.guint16]

  /** value of green component
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def green_=(value: UShort /* None */ ): Unit = (!raw).green_=(
    guint16(value).asInstanceOf[_root_.sn.gnome.glib.internal.guint16]
  )

  /** value of blue component
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def blue: UShort /* None */ =
    (!raw).blue.asInstanceOf[_root_.sn.gnome.glib.internal.guint16]

  /** value of blue component
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def blue_=(value: UShort /* None */ ): Unit = (!raw).blue_=(
    guint16(value).asInstanceOf[_root_.sn.gnome.glib.internal.guint16]
  )

  /** Creates a copy of @src.
    *
    * The copy should be freed with [method@Pango.Color.free]. Primarily used by
    * language bindings, not that useful otherwise (since colors can just be
    * copied by assignment in C).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def copy(): sn.gnome.pango.Color /* None */ =
    sn.gnome.pango.Color.fromRaw(
      pango_color_copy(this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoColor]])
    )
  end copy

  /** Frees a color allocated by [method@Pango.Color.copy].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def free(): Unit /* None */ =
    pango_color_free(this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoColor]])
  end free

  /** Fill in the fields of a color from a string specification.
    *
    * The string can either one of a large set of standard names. (Taken from
    * the CSS Color
    * [specification](https://www.w3.org/TR/css-color-4/#named-colors), or it
    * can be a value in the form `#rgb`, `#rrggbb`, `#rrrgggbbb` or
    * `#rrrrggggbbbb`, where `r`, `g` and `b` are hex digits of the red, green,
    * and blue components of the color, respectively. (White in the four forms
    * is `#fff`, `#ffffff`, `#fffffffff` and `#ffffffffffff`.)
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def parse(
      spec: scala.Predef.String /* Some(CString) */
  )(using Zone): Boolean /* None */ =
    pango_color_parse(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoColor]],
      toCString(spec)
    ).value.!=(0)
  end parse

  /** Fill in the fields of a color from a string specification.
    *
    * The string can either one of a large set of standard names. (Taken from
    * the CSS Color
    * [specification](https://www.w3.org/TR/css-color-4/#named-colors), or it
    * can be a hexadecimal value in the form `#rgb`, `#rrggbb`, `#rrrgggbbb` or
    * `#rrrrggggbbbb` where `r`, `g` and `b` are hex digits of the red, green,
    * and blue components of the color, respectively. (White in the four forms
    * is `#fff`, `#ffffff`, `#fffffffff` and `#ffffffffffff`.)
    *
    * Additionally, parse strings of the form `#rgba`, `#rrggbbaa`,
    * `#rrrrggggbbbbaaaa`, if @alpha is not %NULL, and set @alpha to the value
    * specified by the hex digits for `a`. If no alpha component is found in @spec, @alpha
    * is set to 0xffff (for a solid color).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  @annotation.compileTimeOnly(
    "[method parse_with_alpha]: Method parse_with_alpha contains an OUT parameter, which is not supported yet"
  )
  private def parseWithAlpha__ = ???

  /** Returns a textual specification of @color.
    *
    * The string is in the hexadecimal form `#rrrrggggbbbb`, where `r`, `g` and
    * `b` are hex digits representing the red, green, and blue components
    * respectively.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def _toString(): scala.Predef.String /* None */ =
    fromCString(
      pango_color_to_string(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[PangoColor]]
      ).asInstanceOf
    )
  end _toString

end Color

object Color:
  def fromRaw(ptr: Ptr[PangoColor]): Color = new Color(ptr)
end Color
