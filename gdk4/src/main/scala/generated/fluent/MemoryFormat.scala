package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.GdkMemoryFormat

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * `GdkMemoryFormat` describes formats that image data can have in memory.
  *
  * It describes formats by listing the contents of the memory passed to it. So
  * GDK_MEMORY_A8R8G8B8 will be 1 byte (8 bits) of alpha, followed by a byte
  * each of red, green and blue. It is not endian-dependent, so
  * CAIRO_FORMAT_ARGB32 is represented by different `GdkMemoryFormats` on
  * architectures with different endiannesses.
  *
  * Its naming is modelled after
  * [VkFormat](https://www.khronos.org/registry/vulkan/specs/1.0/html/vkspec.html#VkFormat)
  * for details).
  */
enum MemoryFormat(val raw: GdkMemoryFormat):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * 4 bytes; for blue, green, red, alpha. The color values are premultiplied
    * with the alpha value.
    */
  case B8G8R8A8_PREMULTIPLIED
      extends MemoryFormat(GdkMemoryFormat.GDK_MEMORY_B8G8R8A8_PREMULTIPLIED)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * 4 bytes; for alpha, red, green, blue. The color values are premultiplied
    * with the alpha value.
    */
  case A8R8G8B8_PREMULTIPLIED
      extends MemoryFormat(GdkMemoryFormat.GDK_MEMORY_A8R8G8B8_PREMULTIPLIED)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * 4 bytes; for red, green, blue, alpha The color values are premultiplied
    * with the alpha value.
    */
  case R8G8B8A8_PREMULTIPLIED
      extends MemoryFormat(GdkMemoryFormat.GDK_MEMORY_R8G8B8A8_PREMULTIPLIED)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * 4 bytes; for blue, green, red, alpha.
    */
  case B8G8R8A8 extends MemoryFormat(GdkMemoryFormat.GDK_MEMORY_B8G8R8A8)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * 4 bytes; for alpha, red, green, blue.
    */
  case A8R8G8B8 extends MemoryFormat(GdkMemoryFormat.GDK_MEMORY_A8R8G8B8)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * 4 bytes; for red, green, blue, alpha.
    */
  case R8G8B8A8 extends MemoryFormat(GdkMemoryFormat.GDK_MEMORY_R8G8B8A8)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * 4 bytes; for alpha, blue, green, red.
    */
  case A8B8G8R8 extends MemoryFormat(GdkMemoryFormat.GDK_MEMORY_A8B8G8R8)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * 3 bytes; for red, green, blue. The data is opaque.
    */
  case R8G8B8 extends MemoryFormat(GdkMemoryFormat.GDK_MEMORY_R8G8B8)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * 3 bytes; for blue, green, red. The data is opaque.
    */
  case B8G8R8 extends MemoryFormat(GdkMemoryFormat.GDK_MEMORY_B8G8R8)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * 3 guint16 values; for red, green, blue. Since: 4.6
    */
  case R16G16B16 extends MemoryFormat(GdkMemoryFormat.GDK_MEMORY_R16G16B16)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * 4 guint16 values; for red, green, blue, alpha. The color values are
    * premultiplied with the alpha value. Since: 4.6
    */
  case R16G16B16A16_PREMULTIPLIED
      extends MemoryFormat(
        GdkMemoryFormat.GDK_MEMORY_R16G16B16A16_PREMULTIPLIED
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * 4 guint16 values; for red, green, blue, alpha. Since: 4.6
    */
  case R16G16B16A16
      extends MemoryFormat(GdkMemoryFormat.GDK_MEMORY_R16G16B16A16)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * 3 half-float values; for red, green, blue. The data is opaque. Since: 4.6
    */
  case R16G16B16_FLOAT
      extends MemoryFormat(GdkMemoryFormat.GDK_MEMORY_R16G16B16_FLOAT)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * 4 half-float values; for red, green, blue and alpha. The color values are
    * premultiplied with the alpha value. Since: 4.6
    */
  case R16G16B16A16_FLOAT_PREMULTIPLIED
      extends MemoryFormat(
        GdkMemoryFormat.GDK_MEMORY_R16G16B16A16_FLOAT_PREMULTIPLIED
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * 4 half-float values; for red, green, blue and alpha. Since: 4.6
    */
  case R16G16B16A16_FLOAT
      extends MemoryFormat(GdkMemoryFormat.GDK_MEMORY_R16G16B16A16_FLOAT)
  case R32G32B32_FLOAT
      extends MemoryFormat(GdkMemoryFormat.GDK_MEMORY_R32G32B32_FLOAT)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * 4 float values; for red, green, blue and alpha. The color values are
    * premultiplied with the alpha value. Since: 4.6
    */
  case R32G32B32A32_FLOAT_PREMULTIPLIED
      extends MemoryFormat(
        GdkMemoryFormat.GDK_MEMORY_R32G32B32A32_FLOAT_PREMULTIPLIED
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * 4 float values; for red, green, blue and alpha. Since: 4.6
    */
  case R32G32B32A32_FLOAT
      extends MemoryFormat(GdkMemoryFormat.GDK_MEMORY_R32G32B32A32_FLOAT)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * 2 bytes; for grayscale, alpha. The color values are premultiplied with the
    * alpha value. Since: 4.12
    */
  case G8A8_PREMULTIPLIED
      extends MemoryFormat(GdkMemoryFormat.GDK_MEMORY_G8A8_PREMULTIPLIED)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * 2 bytes; for grayscale, alpha. Since: 4.12
    */
  case G8A8 extends MemoryFormat(GdkMemoryFormat.GDK_MEMORY_G8A8)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * One byte; for grayscale. The data is opaque. Since: 4.12
    */
  case G8 extends MemoryFormat(GdkMemoryFormat.GDK_MEMORY_G8)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * 2 guint16 values; for grayscale, alpha. The color values are premultiplied
    * with the alpha value. Since: 4.12
    */
  case G16A16_PREMULTIPLIED
      extends MemoryFormat(GdkMemoryFormat.GDK_MEMORY_G16A16_PREMULTIPLIED)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * 2 guint16 values; for grayscale, alpha. Since: 4.12
    */
  case G16A16 extends MemoryFormat(GdkMemoryFormat.GDK_MEMORY_G16A16)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * One guint16 value; for grayscale. The data is opaque. Since: 4.12
    */
  case G16 extends MemoryFormat(GdkMemoryFormat.GDK_MEMORY_G16)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * One byte; for alpha. Since: 4.12
    */
  case A8 extends MemoryFormat(GdkMemoryFormat.GDK_MEMORY_A8)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * One guint16 value; for alpha. Since: 4.12
    */
  case A16 extends MemoryFormat(GdkMemoryFormat.GDK_MEMORY_A16)
  case A16_FLOAT extends MemoryFormat(GdkMemoryFormat.GDK_MEMORY_A16_FLOAT)
  case A32_FLOAT extends MemoryFormat(GdkMemoryFormat.GDK_MEMORY_A32_FLOAT)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The number of formats. This value will change as more formats get added,
    * so do not rely on its concrete integer.
    */
  case N_FORMATS extends MemoryFormat(GdkMemoryFormat.GDK_MEMORY_N_FORMATS)
end MemoryFormat

object MemoryFormat:
  def fromRaw(raw: GdkMemoryFormat): MemoryFormat =
    raw match
      case GdkMemoryFormat.GDK_MEMORY_B8G8R8A8_PREMULTIPLIED =>
        MemoryFormat.B8G8R8A8_PREMULTIPLIED
      case GdkMemoryFormat.GDK_MEMORY_A8R8G8B8_PREMULTIPLIED =>
        MemoryFormat.A8R8G8B8_PREMULTIPLIED
      case GdkMemoryFormat.GDK_MEMORY_R8G8B8A8_PREMULTIPLIED =>
        MemoryFormat.R8G8B8A8_PREMULTIPLIED
      case GdkMemoryFormat.GDK_MEMORY_B8G8R8A8  => MemoryFormat.B8G8R8A8
      case GdkMemoryFormat.GDK_MEMORY_A8R8G8B8  => MemoryFormat.A8R8G8B8
      case GdkMemoryFormat.GDK_MEMORY_R8G8B8A8  => MemoryFormat.R8G8B8A8
      case GdkMemoryFormat.GDK_MEMORY_A8B8G8R8  => MemoryFormat.A8B8G8R8
      case GdkMemoryFormat.GDK_MEMORY_R8G8B8    => MemoryFormat.R8G8B8
      case GdkMemoryFormat.GDK_MEMORY_B8G8R8    => MemoryFormat.B8G8R8
      case GdkMemoryFormat.GDK_MEMORY_R16G16B16 => MemoryFormat.R16G16B16
      case GdkMemoryFormat.GDK_MEMORY_R16G16B16A16_PREMULTIPLIED =>
        MemoryFormat.R16G16B16A16_PREMULTIPLIED
      case GdkMemoryFormat.GDK_MEMORY_R16G16B16A16 => MemoryFormat.R16G16B16A16
      case GdkMemoryFormat.GDK_MEMORY_R16G16B16_FLOAT =>
        MemoryFormat.R16G16B16_FLOAT
      case GdkMemoryFormat.GDK_MEMORY_R16G16B16A16_FLOAT_PREMULTIPLIED =>
        MemoryFormat.R16G16B16A16_FLOAT_PREMULTIPLIED
      case GdkMemoryFormat.GDK_MEMORY_R16G16B16A16_FLOAT =>
        MemoryFormat.R16G16B16A16_FLOAT
      case GdkMemoryFormat.GDK_MEMORY_R32G32B32_FLOAT =>
        MemoryFormat.R32G32B32_FLOAT
      case GdkMemoryFormat.GDK_MEMORY_R32G32B32A32_FLOAT_PREMULTIPLIED =>
        MemoryFormat.R32G32B32A32_FLOAT_PREMULTIPLIED
      case GdkMemoryFormat.GDK_MEMORY_R32G32B32A32_FLOAT =>
        MemoryFormat.R32G32B32A32_FLOAT
      case GdkMemoryFormat.GDK_MEMORY_G8A8_PREMULTIPLIED =>
        MemoryFormat.G8A8_PREMULTIPLIED
      case GdkMemoryFormat.GDK_MEMORY_G8A8                 => MemoryFormat.G8A8
      case GdkMemoryFormat.GDK_MEMORY_G8                   => MemoryFormat.G8
      case GdkMemoryFormat.GDK_MEMORY_G16A16_PREMULTIPLIED =>
        MemoryFormat.G16A16_PREMULTIPLIED
      case GdkMemoryFormat.GDK_MEMORY_G16A16    => MemoryFormat.G16A16
      case GdkMemoryFormat.GDK_MEMORY_G16       => MemoryFormat.G16
      case GdkMemoryFormat.GDK_MEMORY_A8        => MemoryFormat.A8
      case GdkMemoryFormat.GDK_MEMORY_A16       => MemoryFormat.A16
      case GdkMemoryFormat.GDK_MEMORY_A16_FLOAT => MemoryFormat.A16_FLOAT
      case GdkMemoryFormat.GDK_MEMORY_A32_FLOAT => MemoryFormat.A32_FLOAT
      case GdkMemoryFormat.GDK_MEMORY_N_FORMATS => MemoryFormat.N_FORMATS
  end fromRaw
end MemoryFormat
