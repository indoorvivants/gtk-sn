package sn.gnome.gdk4

import _root_.sn.gnome.gdk4.internal.*

import _root_.scala.scalanative.unsafe.*

import _root_.scala.scalanative.unsigned.*
import sn.gnome.gdk4.RGBA
import sn.gnome.gdk4.internal.GdkRGBA
import sn.gnome.glib.internal.{gboolean, gint, guint}

/** A `GdkRGBA` is used to represent a color, in a way that is compatible with
  * cairo’s notion of color.
  *
  * `GdkRGBA` is a convenient way to pass colors around. It’s based on cairo’s
  * way to deal with colors and mirrors its behavior. All values are in the
  * range from 0.0 to 1.0 inclusive. So the color (0.0, 0.0, 0.0, 0.0)
  * represents transparent black and (1.0, 1.0, 1.0, 1.0) is opaque white. Other
  * values will be clamped to this range when drawing.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class RGBA private[gnome] (raw: Ptr[GdkRGBA]):

  def getUnsafeRawPointer(): Ptr[GdkRGBA] = this.raw

  /** The intensity of the red channel from 0.0 to 1.0 inclusive
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def red: Float /* None */ = (!raw).red.asInstanceOf[Float]

  /** The intensity of the red channel from 0.0 to 1.0 inclusive
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def red_=(value: Float /* None */ ): Unit =
    (!raw).red_=(value.asInstanceOf.asInstanceOf[Float])

  /** The intensity of the green channel from 0.0 to 1.0 inclusive
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def green: Float /* None */ = (!raw).green.asInstanceOf[Float]

  /** The intensity of the green channel from 0.0 to 1.0 inclusive
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def green_=(value: Float /* None */ ): Unit =
    (!raw).green_=(value.asInstanceOf.asInstanceOf[Float])

  /** The intensity of the blue channel from 0.0 to 1.0 inclusive
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def blue: Float /* None */ = (!raw).blue.asInstanceOf[Float]

  /** The intensity of the blue channel from 0.0 to 1.0 inclusive
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def blue_=(value: Float /* None */ ): Unit =
    (!raw).blue_=(value.asInstanceOf.asInstanceOf[Float])

  /** The opacity of the color from 0.0 for completely translucent to 1.0 for
    * opaque
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def alpha: Float /* None */ = (!raw).alpha.asInstanceOf[Float]

  /** The opacity of the color from 0.0 for completely translucent to 1.0 for
    * opaque
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def alpha_=(value: Float /* None */ ): Unit =
    (!raw).alpha_=(value.asInstanceOf.asInstanceOf[Float])

  /** Makes a copy of a `GdkRGBA`.
    *
    * The result must be freed through [method@Gdk.RGBA.free].
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def copy(): sn.gnome.gdk4.RGBA /* None */ =
    sn.gnome.gdk4.RGBA.fromRaw(
      gdk_rgba_copy(this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkRGBA]])
    )
  end copy

  /** Compares two `GdkRGBA` colors.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def equal(
      p2: sn.gnome.gdk4.RGBA /* Some(_root_.sn.gnome.glib.internal.gconstpointer) */
  ): Boolean /* None */ =
    gdk_rgba_equal(
      this
        .getUnsafeRawPointer()
        .asInstanceOf[_root_.sn.gnome.glib.internal.gconstpointer],
      p2.getUnsafeRawPointer().asInstanceOf
    ).value.!=(0)
  end equal

  /** Frees a `GdkRGBA`.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def free(): Unit /* None */ =
    gdk_rgba_free(this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkRGBA]])
  end free

  /** A hash function suitable for using for a hash table that stores
    * `GdkRGBA`s.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def hash(): UInt /* None */ =
    gdk_rgba_hash(
      this
        .getUnsafeRawPointer()
        .asInstanceOf[_root_.sn.gnome.glib.internal.gconstpointer]
    ).value
  end hash

  /** Checks if an @rgba value is transparent.
    *
    * That is, drawing with the value would not produce any change.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isClear(): Boolean /* None */ =
    gdk_rgba_is_clear(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkRGBA]]
    ).value.!=(0)
  end isClear

  /** Checks if an @rgba value is opaque.
    *
    * That is, drawing with the value will not retain any results from previous
    * contents.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def isOpaque(): Boolean /* None */ =
    gdk_rgba_is_opaque(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkRGBA]]
    ).value.!=(0)
  end isOpaque

  /** Parses a textual representation of a color.
    *
    * The string can be either one of:
    *
    *   - A standard name (Taken from the CSS specification).
    *   - A hexadecimal value in the form “\#rgb”, “\#rrggbb”, “\#rrrgggbbb” or
    *     ”\#rrrrggggbbbb”
    *   - A hexadecimal value in the form “\#rgba”, “\#rrggbbaa”, or
    *     ”\#rrrrggggbbbbaaaa”
    *   - A RGB color in the form “rgb(r,g,b)” (In this case the color will have
    *     full opacity)
    *   - A RGBA color in the form “rgba(r,g,b,a)”
    *   - A HSL color in the form "hsl(hue, saturation, lightness)"
    *   - A HSLA color in the form "hsla(hue, saturation, lightness, alpha)"
    *
    * Where “r”, “g”, “b” and “a” are respectively the red, green, blue and
    * alpha color values. In the last two cases, “r”, “g”, and “b” are either
    * integers in the range 0 to 255 or percentage values in the range 0% to
    * 100%, and a is a floating point value in the range 0 to 1.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def parse(
      spec: scala.Predef.String /* Some(CString) */
  )(using Zone): Boolean /* None */ =
    gdk_rgba_parse(
      this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkRGBA]],
      toCString(spec)
    ).value.!=(0)
  end parse

  /** Returns a textual specification of @rgba in the form `rgb(r,g,b)` or
    * `rgba(r,g,b,a)`, where “r”, “g”, “b” and “a” represent the red, green,
    * blue and alpha values respectively. “r”, “g”, and “b” are represented as
    * integers in the range 0 to 255, and “a” is represented as a floating point
    * value in the range 0 to 1.
    *
    * These string forms are string forms that are supported by the CSS3 colors
    * module, and can be parsed by [method@Gdk.RGBA.parse].
    *
    * Note that this string representation may lose some precision, since “r”,
    * “g” and “b” are represented as 8-bit integers. If this is a concern, you
    * should use a different representation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  def _toString(): scala.Predef.String /* None */ =
    fromCString(
      gdk_rgba_to_string(
        this.getUnsafeRawPointer().asInstanceOf[Ptr[GdkRGBA]]
      ).asInstanceOf
    )
  end _toString

end RGBA

object RGBA:
  def fromRaw(ptr: Ptr[GdkRGBA]): RGBA = new RGBA(ptr)
end RGBA
